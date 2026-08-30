"""Structural alignment of independently generated Slang datatypes.

The model gate establishes which source-language types correspond.  This
module then catalogs each independently generated namespace and constructs a
shared, backend-neutral shape for those known pairs.  It never aligns types by
silently taking an intersection: shape drift, recursion, and unbounded or
unknown collections are explicit unsupported results.

The neutralization helper creates a proof-only copy of a generated datatype
source.  It blanks only class-level ``@spec def ... = Invariant(...)`` members,
leaving the separately generated ``D_Inv_*`` predicates intact for explicit
comparison.  Every edit is structurally re-parsed and hash-audited.
"""

from __future__ import annotations

from dataclasses import dataclass, field, replace
import hashlib
from pathlib import Path
import re
from typing import Iterable, Mapping, Sequence

from equiv_checker.gumbox import (
    GeneratedSemanticGap,
    PredicateCallSignature,
    ResolvedPhaseBinding,
    ResolvedUnitBinding,
    SlangParameter,
    SlangSyntaxError,
    SlangToken,
    bind_method_call,
    catalog_slang_objects,
    lex_slang,
    matching_token,
    split_top_level,
)
from equiv_checker.schema import ComparisonUnit, NormalizedType, PredicateBinding, UnitKind


class TypeCatalogError(ValueError):
    """Raised for ambiguous or malformed generated datatype declarations."""


@dataclass(frozen=True)
class TypeExpr:
    name: str
    arguments: tuple["TypeExpr", ...] = ()

    def render(self) -> str:
        if not self.arguments:
            return self.name
        return f"{self.name}[{', '.join(item.render() for item in self.arguments)}]"


@dataclass(frozen=True)
class ScalarAlias:
    qualified_name: str
    target: TypeExpr
    source: Path


@dataclass(frozen=True)
class EnumType:
    qualified_name: str
    literals: tuple[str, ...]
    source: Path


@dataclass(frozen=True)
class RecordType:
    qualified_name: str
    fields: tuple[tuple[str, TypeExpr], ...]
    source: Path


@dataclass(frozen=True)
class IndexRange:
    qualified_name: str
    minimum: int
    maximum: int
    source: Path

    @property
    def size(self) -> int:
        return self.maximum - self.minimum + 1


TypeDeclaration = ScalarAlias | EnumType | RecordType | IndexRange


@dataclass(frozen=True)
class TypeCatalog:
    declarations: Mapping[str, TypeDeclaration]
    sources: tuple[Path, ...]

    def declaration(self, expression: TypeExpr, context: str = "") -> TypeDeclaration | None:
        name = expression.name
        candidates = [name]
        if name.endswith(".Type"):
            candidates.append(name[: -len(".Type")])
        if context and not name.startswith("_root_."):
            pieces = context.split(".")
            for length in range(len(pieces), 0, -1):
                prefix = ".".join(pieces[:length])
                candidates.append(f"{prefix}.{name}")
                if name.endswith(".Type"):
                    candidates.append(f"{prefix}.{name[: -len('.Type')]}")
        candidates = [item.removeprefix("_root_.") for item in candidates]
        matches = {item: self.declarations[item] for item in candidates if item in self.declarations}
        if not matches and "." not in name:
            suffix = f".{name}"
            suffix_matches = {
                key: value for key, value in self.declarations.items() if key.endswith(suffix)
            }
            if len(suffix_matches) == 1:
                matches = suffix_matches
        unique = {item.qualified_name: item for item in matches.values()}
        if len(unique) > 1:
            raise TypeCatalogError(
                f"ambiguous generated type {name!r} in context {context!r}: {sorted(unique)}"
            )
        return next(iter(unique.values()), None)


@dataclass(frozen=True)
class DatatypeInvariantPredicate:
    source: Path
    package: str
    datatype: str
    source_object: str
    method_name: str
    parameter_name: str
    parameter_type: str
    qualified_method: str
    contributors: tuple[str, ...]
    source_sha256: str
    predicate_sha256: str

    @property
    def unit_key(self) -> str:
        return f"datatype::{self.datatype}::invariant"


@dataclass(frozen=True)
class AlignedTypeNode:
    normalized: NormalizedType
    oracle_type: str
    candidate_type: str
    oracle_index_type: str | None = None
    candidate_index_type: str | None = None
    oracle_index_minimum: int | None = None
    candidate_index_minimum: int | None = None
    oracle_enum_owner: str | None = None
    candidate_enum_owner: str | None = None


@dataclass(frozen=True)
class TypeAlignment:
    root_key: str
    nodes: tuple[AlignedTypeNode, ...]
    supported: bool
    unsupported_reasons: tuple[str, ...] = ()

    @property
    def normalized_types(self) -> tuple[NormalizedType, ...]:
        return tuple(node.normalized for node in self.nodes)

    def node(self, key: str) -> AlignedTypeNode:
        for item in self.nodes:
            if item.normalized.key == key:
                return item
        raise KeyError(key)


@dataclass(frozen=True)
class NeutralizationEdit:
    class_name: str
    invariant_name: str
    start: int
    end: int
    removed_sha256: str


@dataclass(frozen=True)
class NeutralizationRecord:
    source: str
    neutral_source: str
    source_sha256: str
    neutral_sha256: str
    edits: tuple[NeutralizationEdit, ...]
    preserved_predicate_sha256: Mapping[str, str]
    structural_verified: bool


_PRIMITIVE_ALIASES = {
    "B": "B",
    "Boolean": "B",
    "Z": "Z",
    "S8": "S8",
    "S16": "S16",
    "S32": "S32",
    "S64": "S64",
    "U8": "U8",
    "U16": "U16",
    "U32": "U32",
    "U64": "U64",
    "R": "R",
    "F32": "F32",
    "F64": "F64",
    "C": "C",
    "String": "String",
    "org.sireum.String": "String",
}
_OPTION_NAMES = {"Option", "org.sireum.Option"}
_BOUNDED_COLLECTIONS = {"IS", "MS", "org.sireum.IS", "org.sireum.MS"}
_UNBOUNDED_COLLECTIONS = {"ISZ", "MSZ", "org.sireum.ISZ", "org.sireum.MSZ"}


def _sha256_bytes(content: bytes) -> str:
    return hashlib.sha256(content).hexdigest()


def _parse_type_expr_tokens(
    tokens: Sequence[SlangToken], start: int = 0
) -> tuple[TypeExpr, int]:
    if start >= len(tokens) or tokens[start].kind != "identifier":
        raise TypeCatalogError("expected a generated type name")
    parts = [tokens[start].text.strip("`")]
    cursor = start + 1
    while (
        cursor + 1 < len(tokens)
        and tokens[cursor].text == "."
        and tokens[cursor + 1].kind == "identifier"
    ):
        parts.append(tokens[cursor + 1].text.strip("`"))
        cursor += 2
    arguments: list[TypeExpr] = []
    if cursor < len(tokens) and tokens[cursor].text == "[":
        close = matching_token(tokens, cursor)
        for chunk in split_top_level(tokens[cursor + 1 : close]):
            if not chunk:
                raise TypeCatalogError("empty generated type argument")
            argument, consumed = _parse_type_expr_tokens(chunk)
            if consumed != len(chunk):
                raise TypeCatalogError(
                    f"unsupported generated type expression near offset {chunk[consumed].start}"
                )
            arguments.append(argument)
        cursor = close + 1
    return TypeExpr(".".join(parts), tuple(arguments)), cursor


def parse_type_expr(value: str) -> TypeExpr:
    # Inventory-qualified SysML names use ``::`` while generated Slang uses
    # dots.  At this boundary both spellings designate the same resolved path.
    tokens = lex_slang(value.replace("::", "."))
    expression, consumed = _parse_type_expr_tokens(tokens)
    if consumed != len(tokens):
        raise TypeCatalogError(
            f"unsupported generated type suffix near offset {tokens[consumed].start}"
        )
    return expression


def _annotation_before(
    tokens: Sequence[SlangToken], declaration: int, annotation: str
) -> int | None:
    lower = max(0, declaration - 64)
    for index in range(declaration - 1, lower - 1, -1):
        if (
            tokens[index].text == "@"
            and index + 1 < declaration
            and tokens[index + 1].text == annotation
        ):
            return index
        if tokens[index].text in {"}", ";", "class", "object", "type"}:
            break
    return None


def _declaration_regions(tokens: Sequence[SlangToken]) -> tuple[tuple[int, int, str], ...]:
    """Return owner-body regions used to qualify nested generated names."""

    raw: list[tuple[int, int, str]] = []
    for index, token in enumerate(tokens):
        if token.text not in {"object", "class"} or index + 1 >= len(tokens):
            continue
        if tokens[index + 1].kind != "identifier":
            continue
        cursor = index + 2
        if cursor < len(tokens) and tokens[cursor].text == "[":
            cursor = matching_token(tokens, cursor) + 1
        if cursor < len(tokens) and tokens[cursor].text == "(":
            cursor = matching_token(tokens, cursor) + 1
        while cursor < len(tokens) and tokens[cursor].text not in {"{", "=", ";"}:
            cursor += 1
        if cursor < len(tokens) and tokens[cursor].text == "{":
            raw.append((cursor, matching_token(tokens, cursor), tokens[index + 1].text))
    result: list[tuple[int, int, str]] = []
    for opening, closing, name in raw:
        parents = [
            item for item in raw if item[0] < opening < closing < item[1]
        ]
        parents.sort(key=lambda item: item[0])
        result.append((opening, closing, ".".join([item[2] for item in parents] + [name])))
    return tuple(result)


def _owner_at(index: int, regions: Sequence[tuple[int, int, str]]) -> str:
    owners = [name for opening, closing, name in regions if opening < index < closing]
    if not owners:
        return ""
    return max(owners, key=lambda item: item.count("."))


def _qualified(package: str, owner: str, name: str) -> str:
    return ".".join(part for part in (package, owner, name) if part)


def _package(tokens: Sequence[SlangToken]) -> str:
    for index, token in enumerate(tokens):
        if token.text != "package":
            continue
        parts: list[str] = []
        cursor = index + 1
        while cursor < len(tokens) and tokens[cursor].kind == "identifier":
            parts.append(tokens[cursor].text.strip("`"))
            cursor += 1
            if cursor >= len(tokens) or tokens[cursor].text != ".":
                break
            cursor += 1
        if not parts:
            raise TypeCatalogError("malformed generated package declaration")
        return ".".join(parts)
    return ""


def _fields(tokens: Sequence[SlangToken]) -> tuple[tuple[str, TypeExpr], ...]:
    result: list[tuple[str, TypeExpr]] = []
    for chunk in split_top_level(tokens):
        if not chunk:
            continue
        depth = 0
        colon = -1
        for index, token in enumerate(chunk):
            if token.text in {"(", "[", "{"}:
                depth += 1
            elif token.text in {")", "]", "}"}:
                depth -= 1
            elif token.text == ":" and depth == 0:
                colon = index
                break
        if colon < 1:
            raise TypeCatalogError(
                f"malformed datatype field near offset {chunk[0].start}"
            )
        identifiers = [
            token.text.strip("`")
            for token in chunk[:colon]
            if token.kind == "identifier" and token.text not in {"val", "var"}
        ]
        if not identifiers:
            raise TypeCatalogError(f"datatype field has no name at offset {chunk[0].start}")
        expression, consumed = _parse_type_expr_tokens(chunk[colon + 1 :])
        trailing = chunk[colon + 1 + consumed :]
        if trailing and trailing[0].text != "=":
            raise TypeCatalogError(
                f"unsupported datatype field suffix at offset {trailing[0].start}"
            )
        result.append((identifiers[-1], expression))
    return tuple(result)


def _range_values(tokens: Sequence[SlangToken]) -> tuple[int, int]:
    values: dict[str, int] = {}
    for chunk in split_top_level(tokens):
        if len(chunk) < 3 or chunk[0].kind != "identifier" or chunk[1].text != "=":
            continue
        sign = -1 if chunk[2].text == "-" else 1
        number_index = 3 if sign < 0 else 2
        if number_index < len(chunk) and chunk[number_index].kind == "number":
            try:
                values[chunk[0].text] = sign * int(chunk[number_index].text)
            except ValueError as error:
                raise TypeCatalogError("non-integral generated range bound") from error
    if "min" not in values or "max" not in values:
        raise TypeCatalogError("generated index range is missing min/max")
    if values["max"] < values["min"]:
        raise TypeCatalogError("generated index range has max < min")
    return values["min"], values["max"]


def catalog_type_text(
    text: str, source: Path | str = Path("<memory>")
) -> tuple[TypeDeclaration, ...]:
    tokens = lex_slang(text)
    package = _package(tokens)
    regions = _declaration_regions(tokens)
    source_path = Path(source)
    declarations: list[TypeDeclaration] = []
    for index, token in enumerate(tokens):
        owner = _owner_at(index, regions)
        if token.text == "type" and index + 2 < len(tokens):
            if tokens[index + 1].kind != "identifier" or tokens[index + 2].text != "=":
                continue
            target, _ = _parse_type_expr_tokens(tokens, index + 3)
            declarations.append(
                ScalarAlias(
                    qualified_name=_qualified(package, owner, tokens[index + 1].text),
                    target=target,
                    source=source_path,
                )
            )
        elif token.text == "object" and _annotation_before(tokens, index, "enum") is not None:
            if index + 2 >= len(tokens) or tokens[index + 1].kind != "identifier":
                raise TypeCatalogError("malformed generated enum")
            cursor = index + 2
            while cursor < len(tokens) and tokens[cursor].text != "{":
                cursor += 1
            if cursor == len(tokens):
                raise TypeCatalogError("generated enum has no body")
            close = matching_token(tokens, cursor)
            literals: list[str] = []
            depth = 0
            for item in tokens[cursor + 1 : close]:
                if item.text == "{":
                    depth += 1
                elif item.text == "}":
                    depth -= 1
                elif item.kind == "string" and depth == 0:
                    literal = item.text[1:-1]
                    literals.append(literal)
            declarations.append(
                EnumType(
                    qualified_name=_qualified(package, owner, tokens[index + 1].text),
                    literals=tuple(literals),
                    source=source_path,
                )
            )
        elif token.text == "class" and _annotation_before(tokens, index, "datatype") is not None:
            if index + 1 >= len(tokens) or tokens[index + 1].kind != "identifier":
                raise TypeCatalogError("malformed generated datatype")
            cursor = index + 2
            if cursor < len(tokens) and tokens[cursor].text == "(":
                close = matching_token(tokens, cursor)
                fields = _fields(tokens[cursor + 1 : close])
            else:
                fields = ()
            declarations.append(
                RecordType(
                    qualified_name=_qualified(package, owner, tokens[index + 1].text),
                    fields=fields,
                    source=source_path,
                )
            )
        elif token.text == "class" and _annotation_before(tokens, index, "range") is not None:
            annotation = _annotation_before(tokens, index, "range")
            assert annotation is not None
            open_paren = annotation + 2
            if open_paren >= len(tokens) or tokens[open_paren].text != "(":
                raise TypeCatalogError("malformed generated range annotation")
            close_paren = matching_token(tokens, open_paren)
            minimum, maximum = _range_values(tokens[open_paren + 1 : close_paren])
            declarations.append(
                IndexRange(
                    qualified_name=_qualified(package, owner, tokens[index + 1].text),
                    minimum=minimum,
                    maximum=maximum,
                    source=source_path,
                )
            )
    return tuple(declarations)


def catalog_type_file(path: Path) -> tuple[TypeDeclaration, ...]:
    return catalog_type_text(path.read_text(encoding="utf-8"), path)


def catalog_types(project: Path | Iterable[Path]) -> TypeCatalog:
    if isinstance(project, Path):
        generated_data_roots = tuple(
            candidate
            for candidate in (project / "src" / "main" / "data", project / "data")
            if candidate.is_dir()
        )
        search_root = generated_data_roots[0] if generated_data_roots else project
        paths = sorted(search_root.rglob("*.scala"))
    else:
        paths = sorted(Path(item) for item in project)
    declarations: dict[str, TypeDeclaration] = {}
    for path in paths:
        for declaration in catalog_type_file(path):
            previous = declarations.get(declaration.qualified_name)
            if previous is not None and previous != declaration:
                raise TypeCatalogError(
                    f"duplicate generated type declaration {declaration.qualified_name}"
                )
            declarations[declaration.qualified_name] = declaration
    return TypeCatalog(declarations=declarations, sources=tuple(paths))


def discover_datatype_invariants(
    project: Path | Iterable[Path],
) -> tuple[DatatypeInvariantPredicate, ...]:
    """Discover native ``D_Inv_<datatype>`` entrypoints structurally.

    Guard helpers such as ``D_Inv_Guard_*`` are deliberately excluded.  Each
    admitted predicate must be a one-argument Boolean method owned by the
    datatype's companion object; duplicate qualified entrypoints fail closed.
    """

    if isinstance(project, Path):
        generated_data_roots = tuple(
            candidate
            for candidate in (project / "src" / "main" / "data", project / "data")
            if candidate.is_dir()
        )
        search_root = generated_data_roots[0] if generated_data_roots else project
        paths = sorted(search_root.rglob("*.scala"))
    else:
        paths = sorted(Path(item) for item in project)
    result: list[DatatypeInvariantPredicate] = []
    for path in paths:
        text = path.read_text(encoding="utf-8")
        for owner in catalog_slang_objects(text, path):
            target = f"D_Inv_{owner.name}"
            matches = [method for method in owner.methods if method.name == target]
            if not matches:
                continue
            if len(matches) != 1:
                raise TypeCatalogError(
                    f"ambiguous datatype invariant {owner.qualified_name}.{target}"
                )
            method = matches[0]
            if len(method.parameters) != 1:
                raise TypeCatalogError(
                    f"datatype invariant {owner.qualified_name}.{target} must have one parameter"
                )
            if "".join(token.text for token in lex_slang(method.return_type)) not in {
                "B",
                "Boolean",
                "org.sireum.B",
            }:
                raise TypeCatalogError(
                    f"datatype invariant {owner.qualified_name}.{target} is not Boolean"
                )
            methods = {item.name: item for item in owner.methods}
            contributors: list[str] = []
            visited: set[str] = set()

            def visit(name: str) -> None:
                if name in visited:
                    return
                visited.add(name)
                contributors.append(name)
                for called in methods[name].calls:
                    visit(called)

            visit(method.name)
            canonical = " ".join(
                token.text
                for token in lex_slang(text[method.start : method.end])
            )
            parameter = method.parameters[0]
            result.append(
                DatatypeInvariantPredicate(
                    source=path,
                    package=owner.package,
                    datatype=owner.qualified_name,
                    source_object=owner.qualified_name,
                    method_name=method.name,
                    parameter_name=parameter.name,
                    parameter_type=parameter.type_name,
                    qualified_method=method.qualified_name(owner.qualified_name),
                    contributors=tuple(contributors),
                    source_sha256=owner.sha256,
                    predicate_sha256=hashlib.sha256(canonical.encode("utf-8")).hexdigest(),
                )
            )
    names = [item.qualified_method for item in result]
    if len(names) != len(set(names)):
        duplicates = sorted({name for name in names if names.count(name) > 1})
        raise TypeCatalogError(f"duplicate datatype invariant predicates: {duplicates}")
    return tuple(result)


def bind_resolved_datatype_unit(
    *,
    unit: ComparisonUnit,
    oracle_predicate: DatatypeInvariantPredicate | None,
    candidate_predicate: DatatypeInvariantPredicate | None,
    oracle_invariant_present: bool | None = None,
    candidate_invariant_present: bool | None = None,
    candidate_method_suffix: str = "",
) -> ResolvedUnitBinding:
    """Bind one datatype-invariant unit to two native ``D_Inv`` methods."""

    if unit.kind is not UnitKind.DATATYPE_INVARIANT:
        raise ValueError(f"unit is not a datatype invariant: {unit.key}")
    if not unit.coverage_complete or unit.unsupported_reasons:
        raise GeneratedSemanticGap(f"unit is not coverage-complete: {unit.key}")
    if len(unit.observations) != 1:
        raise GeneratedSemanticGap(
            f"datatype invariant unit must expose exactly one value: {unit.key}"
        )

    def classifier_matches(actual: str, expected: str) -> bool:
        actual_name = actual.removeprefix("_root_.").replace("::", ".")
        expected_name = expected.removeprefix("_root_.").replace("::", ".")
        return actual_name == expected_name or actual_name.endswith(f".{expected_name}")

    def side_binding(
        side: str,
        predicate: DatatypeInvariantPredicate | None,
        frozen: PredicateBinding | None,
        asserted_invariant_present: bool | None,
    ) -> ResolvedPhaseBinding:
        if frozen is None:
            raise GeneratedSemanticGap(
                f"{side} has no frozen inventory predicate binding for {unit.key}"
            )
        if frozen.side != side:
            raise GeneratedSemanticGap(
                f"{side} frozen predicate binding is labelled {frozen.side!r}"
            )
        if not frozen.synthetic_true_assumption:
            raise GeneratedSemanticGap(
                f"{side} datatype invariant has a non-synthetic assumption in {unit.key}"
            )
        invariant_present = not frozen.synthetic_true_guarantee
        if (
            asserted_invariant_present is not None
            and asserted_invariant_present is not invariant_present
        ):
            raise GeneratedSemanticGap(
                f"{side} invariant presence assertion {asserted_invariant_present} "
                f"disagrees with the frozen inventory binding for {unit.key}"
            )
        if predicate is None:
            if invariant_present:
                raise GeneratedSemanticGap(
                    f"{side} has no generated datatype invariant for {unit.key}, but "
                    "the source inventory certifies its presence"
                )
            value_name = unit.observations[0].name
            binding = PredicateBinding(
                side=side,
                assumption=None,
                guarantee=None,
                synthetic_true_assumption=True,
                synthetic_true_guarantee=True,
                assumption_observations=(),
                guarantee_observations=(value_name,),
            )
            assumption = PredicateCallSignature(None, (), (), synthetic_true=True)
            guarantee = PredicateCallSignature(None, (), (0,), synthetic_true=True)
            return ResolvedPhaseBinding(binding, assumption, guarantee)
        if not invariant_present:
            raise GeneratedSemanticGap(
                f"{side} source inventory certifies invariant absence but a predicate "
                f"was selected: {predicate.qualified_method}"
            )
        expected_source_object = f"{unit.classifier}::GUMBO::datatype-invariant"
        if frozen.source_object != expected_source_object:
            raise GeneratedSemanticGap(
                f"{side} frozen datatype owner {frozen.source_object!r} does not match "
                f"{expected_source_object!r} for {unit.key}"
            )
        if not classifier_matches(predicate.datatype, unit.classifier):
            raise GeneratedSemanticGap(
                f"{side} generated datatype {predicate.datatype!r} does not match "
                f"the frozen classifier {unit.classifier!r} for {unit.key}"
            )
        expected_method = f"D_Inv_{unit.classifier.replace('::', '.').rsplit('.', 1)[-1]}"
        if side == "candidate":
            expected_method += candidate_method_suffix
        if (
            predicate.method_name != expected_method
            or predicate.qualified_method
            != f"{predicate.source_object}.{predicate.method_name}"
        ):
            raise GeneratedSemanticGap(
                f"{side} generated datatype invariant method identity is not exact: "
                f"{predicate.qualified_method!r}"
            )
        # Re-catalog the source and select the exact hashed owner/method again,
        # preventing stale discovery metadata from silently driving emission.
        owners = {
            owner.qualified_name: owner
            for owner in catalog_slang_objects(
                predicate.source.read_text(encoding="utf-8"), predicate.source
            )
        }
        owner = owners.get(predicate.source_object)
        if owner is None or owner.sha256 != predicate.source_sha256:
            raise GeneratedSemanticGap(
                f"datatype invariant source changed after discovery: {predicate.source}"
            )
        methods = [method for method in owner.methods if method.name == predicate.method_name]
        if len(methods) != 1:
            raise GeneratedSemanticGap(
                f"datatype invariant entrypoint changed: {predicate.qualified_method}"
            )
        binding = PredicateBinding(
            side=side,
            assumption=None,
            guarantee=predicate.qualified_method,
            source_object=predicate.source_object,
            generated_source=str(predicate.source),
            generated_sha256=predicate.source_sha256,
            synthetic_true_assumption=True,
            assumption_observations=(),
            guarantee_observations=(unit.observations[0].name,),
        )
        assumption = PredicateCallSignature(None, (), (), synthetic_true=True)
        guarantee = bind_method_call(
            side=side,
            kind=UnitKind.DATATYPE_INVARIANT,
            polarity="guarantee",
            owner=predicate.source_object,
            method=methods[0],
            observations=unit.observations,
            synthetic_true=False,
        )
        return ResolvedPhaseBinding(binding, assumption, guarantee)

    oracle = side_binding(
        "oracle", oracle_predicate, unit.oracle, oracle_invariant_present
    )
    candidate = side_binding(
        "candidate", candidate_predicate, unit.candidate, candidate_invariant_present
    )
    return ResolvedUnitBinding(
        replace(unit, oracle=oracle.binding, candidate=candidate.binding), oracle, candidate
    )


def _primitive_name(expression: TypeExpr) -> str | None:
    if expression.arguments:
        return None
    return _PRIMITIVE_ALIASES.get(expression.name)


def _resolve_alias(
    catalog: TypeCatalog, expression: TypeExpr, context: str, seen: frozenset[str] = frozenset()
) -> tuple[TypeExpr, str]:
    primitive = _primitive_name(expression)
    if primitive is not None:
        return TypeExpr(primitive), context
    declaration = catalog.declaration(expression, context)
    if not isinstance(declaration, ScalarAlias):
        return expression, context
    if declaration.qualified_name in seen:
        raise TypeCatalogError(f"recursive type alias {declaration.qualified_name}")
    alias_context = declaration.qualified_name.rpartition(".")[0]
    return _resolve_alias(
        catalog,
        declaration.target,
        alias_context,
        seen | {declaration.qualified_name},
    )


def align_type_pair(
    *,
    key: str,
    oracle_catalog: TypeCatalog,
    candidate_catalog: TypeCatalog,
    oracle_type: str | TypeExpr,
    candidate_type: str | TypeExpr,
    oracle_context: str = "",
    candidate_context: str = "",
) -> TypeAlignment:
    """Align a source-certified type pair into shared normalized nodes."""

    oracle_root = parse_type_expr(oracle_type) if isinstance(oracle_type, str) else oracle_type
    candidate_root = (
        parse_type_expr(candidate_type) if isinstance(candidate_type, str) else candidate_type
    )
    nodes: list[AlignedTypeNode] = []
    reasons: list[str] = []

    def unsupported(
        node_key: str,
        oracle: TypeExpr,
        candidate: TypeExpr,
        reason: str,
        *,
        recursive: bool = False,
    ) -> str:
        reasons.append(f"{node_key}: {reason}")
        nodes.append(
            AlignedTypeNode(
                normalized=NormalizedType(
                    key=node_key,
                    kind="unsupported",
                    qualified_name=node_key,
                    oracle_type=oracle.render(),
                    candidate_type=candidate.render(),
                    recursive=recursive,
                    supported=False,
                    unsupported_reason=reason,
                ),
                oracle_type=oracle.render(),
                candidate_type=candidate.render(),
            )
        )
        return node_key

    def visit(
        node_key: str,
        oracle: TypeExpr,
        candidate: TypeExpr,
        o_context: str,
        c_context: str,
        active: frozenset[tuple[str, str]],
    ) -> str:
        try:
            oracle, o_context = _resolve_alias(oracle_catalog, oracle, o_context)
            candidate, c_context = _resolve_alias(candidate_catalog, candidate, c_context)
        except TypeCatalogError as error:
            return unsupported(node_key, oracle, candidate, str(error), recursive=True)
        primitive_o = _primitive_name(oracle)
        primitive_c = _primitive_name(candidate)
        if primitive_o is not None or primitive_c is not None:
            if primitive_o is None or primitive_c is None or primitive_o != primitive_c:
                return unsupported(
                    node_key,
                    oracle,
                    candidate,
                    f"scalar shape mismatch ({primitive_o!r} versus {primitive_c!r})",
                )
            nodes.append(
                AlignedTypeNode(
                    normalized=NormalizedType(
                        key=node_key,
                        kind="scalar",
                        qualified_name=node_key,
                        oracle_type=oracle.render(),
                        candidate_type=candidate.render(),
                    ),
                    oracle_type=oracle.render(),
                    candidate_type=candidate.render(),
                )
            )
            return node_key

        option_o = oracle.name in _OPTION_NAMES
        option_c = candidate.name in _OPTION_NAMES
        if option_o or option_c:
            if not (option_o and option_c and len(oracle.arguments) == len(candidate.arguments) == 1):
                return unsupported(node_key, oracle, candidate, "option shape mismatch")
            child_key = f"{node_key}::payload"
            visit(
                child_key,
                oracle.arguments[0],
                candidate.arguments[0],
                o_context,
                c_context,
                active,
            )
            child = next(item for item in nodes if item.normalized.key == child_key)
            supported = child.normalized.supported
            reason = None if supported else "option payload is unsupported"
            oracle_full_type = f"Option[{child.oracle_type}]"
            candidate_full_type = f"Option[{child.candidate_type}]"
            if reason:
                reasons.append(f"{node_key}: {reason}")
            nodes.append(
                AlignedTypeNode(
                    normalized=NormalizedType(
                        key=node_key,
                        kind="option",
                        qualified_name=node_key,
                        element_type=child_key,
                        oracle_type=oracle_full_type,
                        candidate_type=candidate_full_type,
                        supported=supported,
                        unsupported_reason=reason,
                    ),
                    oracle_type=oracle_full_type,
                    candidate_type=candidate_full_type,
                )
            )
            return node_key

        unbounded_o = oracle.name in _UNBOUNDED_COLLECTIONS
        unbounded_c = candidate.name in _UNBOUNDED_COLLECTIONS
        if unbounded_o or unbounded_c:
            return unsupported(
                node_key,
                oracle,
                candidate,
                "unbounded sequence has no proof-finite bound",
            )

        bounded_o = oracle.name in _BOUNDED_COLLECTIONS
        bounded_c = candidate.name in _BOUNDED_COLLECTIONS
        if bounded_o or bounded_c:
            if not (
                bounded_o
                and bounded_c
                and len(oracle.arguments) == len(candidate.arguments) == 2
            ):
                return unsupported(node_key, oracle, candidate, "bounded sequence shape mismatch")
            o_index = oracle_catalog.declaration(oracle.arguments[0], o_context)
            c_index = candidate_catalog.declaration(candidate.arguments[0], c_context)
            if not isinstance(o_index, IndexRange) or not isinstance(c_index, IndexRange):
                return unsupported(
                    node_key,
                    oracle,
                    candidate,
                    "bounded sequence index is not a generated finite range",
                )
            if o_index.size != c_index.size:
                return unsupported(
                    node_key,
                    oracle,
                    candidate,
                    "bounded sequence sizes differ",
                )
            child_key = f"{node_key}::element"
            visit(
                child_key,
                oracle.arguments[1],
                candidate.arguments[1],
                o_context,
                c_context,
                active,
            )
            child = next(item for item in nodes if item.normalized.key == child_key)
            supported = child.normalized.supported
            reason = None if supported else "bounded sequence element is unsupported"
            oracle_full_type = (
                f"{oracle.name}[{o_index.qualified_name}, {child.oracle_type}]"
            )
            candidate_full_type = (
                f"{candidate.name}[{c_index.qualified_name}, {child.candidate_type}]"
            )
            if reason:
                reasons.append(f"{node_key}: {reason}")
            nodes.append(
                AlignedTypeNode(
                    normalized=NormalizedType(
                        key=node_key,
                        kind="bounded-sequence",
                        qualified_name=node_key,
                        element_type=child_key,
                        bound=o_index.size,
                        oracle_type=oracle_full_type,
                        candidate_type=candidate_full_type,
                        oracle_index_type=o_index.qualified_name,
                        candidate_index_type=c_index.qualified_name,
                        oracle_index_minimum=o_index.minimum,
                        candidate_index_minimum=c_index.minimum,
                        supported=supported,
                        unsupported_reason=reason,
                    ),
                    oracle_type=oracle_full_type,
                    candidate_type=candidate_full_type,
                    oracle_index_type=o_index.qualified_name,
                    candidate_index_type=c_index.qualified_name,
                    oracle_index_minimum=o_index.minimum,
                    candidate_index_minimum=c_index.minimum,
                )
            )
            return node_key

        o_decl = oracle_catalog.declaration(oracle, o_context)
        c_decl = candidate_catalog.declaration(candidate, c_context)
        pair = (
            o_decl.qualified_name if o_decl else oracle.render(),
            c_decl.qualified_name if c_decl else candidate.render(),
        )
        if pair in active:
            return unsupported(
                node_key,
                oracle,
                candidate,
                "recursive datatype shape",
                recursive=True,
            )
        if isinstance(o_decl, EnumType) or isinstance(c_decl, EnumType):
            if not isinstance(o_decl, EnumType) or not isinstance(c_decl, EnumType):
                return unsupported(node_key, oracle, candidate, "enum shape mismatch")
            if o_decl.literals != c_decl.literals:
                return unsupported(node_key, oracle, candidate, "resolved enum literals differ")
            nodes.append(
                AlignedTypeNode(
                    normalized=NormalizedType(
                        key=node_key,
                        kind="enum",
                        qualified_name=node_key,
                        literals=o_decl.literals,
                        oracle_type=f"{o_decl.qualified_name}.Type",
                        candidate_type=f"{c_decl.qualified_name}.Type",
                        oracle_enum_owner=o_decl.qualified_name,
                        candidate_enum_owner=c_decl.qualified_name,
                    ),
                    oracle_type=f"{o_decl.qualified_name}.Type",
                    candidate_type=f"{c_decl.qualified_name}.Type",
                    oracle_enum_owner=o_decl.qualified_name,
                    candidate_enum_owner=c_decl.qualified_name,
                )
            )
            return node_key
        if isinstance(o_decl, RecordType) or isinstance(c_decl, RecordType):
            if not isinstance(o_decl, RecordType) or not isinstance(c_decl, RecordType):
                return unsupported(node_key, oracle, candidate, "record shape mismatch")
            o_names = tuple(name for name, _ in o_decl.fields)
            c_names = tuple(name for name, _ in c_decl.fields)
            if o_names != c_names:
                return unsupported(node_key, oracle, candidate, "record fields differ")
            fields: list[tuple[str, str]] = []
            child_supported = True
            next_active = active | {pair}
            for (name, o_type), (_, c_type) in zip(o_decl.fields, c_decl.fields, strict=True):
                child_key = f"{node_key}::field::{name}"
                visit(
                    child_key,
                    o_type,
                    c_type,
                    o_decl.qualified_name.rpartition(".")[0],
                    c_decl.qualified_name.rpartition(".")[0],
                    next_active,
                )
                child = next(item for item in nodes if item.normalized.key == child_key)
                child_supported &= child.normalized.supported
                fields.append((name, child_key))
            reason = None if child_supported else "record contains an unsupported field"
            if reason:
                reasons.append(f"{node_key}: {reason}")
            nodes.append(
                AlignedTypeNode(
                    normalized=NormalizedType(
                        key=node_key,
                        kind="record",
                        qualified_name=node_key,
                        fields=tuple(fields),
                        oracle_type=o_decl.qualified_name,
                        candidate_type=c_decl.qualified_name,
                        supported=child_supported,
                        unsupported_reason=reason,
                    ),
                    oracle_type=o_decl.qualified_name,
                    candidate_type=c_decl.qualified_name,
                )
            )
            return node_key
        return unsupported(
            node_key,
            oracle,
            candidate,
            f"unknown generated type shape ({oracle.render()} versus {candidate.render()})",
        )

    visit(
        key,
        oracle_root,
        candidate_root,
        oracle_context,
        candidate_context,
        frozenset(),
    )
    # ComparisonPlan consumers require stable unique keys; traversal order has
    # no proof semantics now that both predicates use one shared carrier.
    if len({node.normalized.key for node in nodes}) != len(nodes):
        raise TypeCatalogError("alignment produced duplicate normalized type keys")
    return TypeAlignment(
        root_key=key,
        nodes=tuple(nodes),
        supported=all(node.normalized.supported for node in nodes),
        unsupported_reasons=tuple(dict.fromkeys(reasons)),
    )


def align_parameter_pair(
    *,
    key: str,
    oracle_catalog: TypeCatalog,
    candidate_catalog: TypeCatalog,
    oracle_parameter: SlangParameter,
    candidate_parameter: SlangParameter,
    oracle_package: str,
    candidate_package: str,
) -> TypeAlignment:
    """Align one position/name-paired GumboX observation parameter.

    Parameter ordering and observation roles come from the resolved inventory;
    this helper preserves that pairing and supplies the root normalized key plus
    fully qualified side types needed by proof emission.
    """

    return align_type_pair(
        key=key,
        oracle_catalog=oracle_catalog,
        candidate_catalog=candidate_catalog,
        oracle_type=oracle_parameter.type_name,
        candidate_type=candidate_parameter.type_name,
        oracle_context=oracle_package,
        candidate_context=candidate_package,
    )


@dataclass(frozen=True)
class _InvariantMember:
    class_name: str
    name: str
    start: int
    end: int


def _datatype_invariants(text: str) -> tuple[_InvariantMember, ...]:
    tokens = lex_slang(text)
    result: list[_InvariantMember] = []
    for index, token in enumerate(tokens):
        if token.text != "class" or _annotation_before(tokens, index, "datatype") is None:
            continue
        if index + 2 >= len(tokens) or tokens[index + 1].kind != "identifier":
            raise TypeCatalogError("malformed @datatype class")
        class_name = tokens[index + 1].text
        cursor = index + 2
        if tokens[cursor].text == "(":
            cursor = matching_token(tokens, cursor) + 1
        while cursor < len(tokens) and tokens[cursor].text not in {"{", ";", "="}:
            cursor += 1
        if cursor == len(tokens) or tokens[cursor].text != "{":
            continue
        close = matching_token(tokens, cursor)
        depth = 0
        member = cursor + 1
        while member < close:
            current = tokens[member]
            if current.text == "{":
                depth += 1
                member += 1
                continue
            if current.text == "}":
                depth -= 1
                member += 1
                continue
            if (
                depth == 0
                and current.text == "@"
                and member + 3 < close
                and tokens[member + 1].text == "spec"
                and tokens[member + 2].text == "def"
                and tokens[member + 3].kind == "identifier"
            ):
                invariant_name = tokens[member + 3].text
                equals = member + 4
                local_depth = 0
                while equals < close:
                    value = tokens[equals].text
                    if value in {"(", "[", "{"}:
                        local_depth += 1
                    elif value in {")", "]", "}"}:
                        local_depth -= 1
                    elif value == "=" and local_depth == 0:
                        break
                    equals += 1
                if (
                    equals + 2 >= close
                    or tokens[equals + 1].text != "Invariant"
                    or tokens[equals + 2].text != "("
                ):
                    member += 1
                    continue
                end_token = matching_token(tokens, equals + 2)
                result.append(
                    _InvariantMember(
                        class_name=class_name,
                        name=invariant_name,
                        start=current.start,
                        end=tokens[end_token].end,
                    )
                )
                member = end_token + 1
                continue
            member += 1
    return tuple(result)


def _predicate_hashes(text: str, classes: Iterable[str]) -> dict[str, str]:
    tokens = lex_slang(text)
    result: dict[str, str] = {}
    for class_name in classes:
        target = f"D_Inv_{class_name}"
        matches: list[str] = []
        for index, token in enumerate(tokens):
            if (
                token.text != "def"
                or index + 1 >= len(tokens)
                or tokens[index + 1].text != target
            ):
                continue
            cursor = index + 2
            stack: list[str] = []
            equals = -1
            while cursor < len(tokens):
                value = tokens[cursor].text
                if value in {"(", "[", "{"}:
                    stack.append(value)
                elif value in {")", "]", "}"}:
                    if stack:
                        stack.pop()
                elif value == "=" and not stack:
                    equals = cursor
                    break
                cursor += 1
            if equals < 0 or equals + 1 >= len(tokens):
                raise TypeCatalogError(f"generated predicate {target} has no body")
            body = equals + 1
            if tokens[body].text in {"(", "{"}:
                end = matching_token(tokens, body)
            else:
                # Generated D_Inv expressions without an outer delimiter are
                # rare; delimit them at the next method/class declaration.
                end = body
                while end + 1 < len(tokens) and tokens[end + 1].text not in {
                    "def",
                    "class",
                    "object",
                }:
                    end += 1
            canonical = " ".join(item.text for item in tokens[index : end + 1])
            matches.append(hashlib.sha256(canonical.encode("utf-8")).hexdigest())
        if len(matches) != 1:
            raise TypeCatalogError(
                f"expected exactly one preserved {target} predicate, found {len(matches)}"
            )
        result[target] = matches[0]
    return result


def neutralize_datatype_source(
    source: Path,
    destination: Path,
    *,
    class_names: Iterable[str] | None = None,
) -> NeutralizationRecord:
    """Create and verify a proof-only neutral carrier source copy.

    The destination must not exist and must not resolve to the input.  Original
    generated sources are hashed before and after the operation to guard
    against accidental mutation.
    """

    source = source.resolve()
    destination = destination.resolve()
    if source == destination:
        raise ValueError("neutral carrier destination must differ from generated source")
    if destination.exists():
        raise FileExistsError(f"neutral carrier destination already exists: {destination}")
    original = source.read_bytes()
    try:
        text = original.decode("utf-8")
    except UnicodeDecodeError as error:
        raise TypeCatalogError(f"generated source is not UTF-8: {source}") from error
    all_members = _datatype_invariants(text)
    available = {member.class_name for member in all_members}
    selected = set(class_names) if class_names is not None else available
    missing = selected - available
    if missing:
        raise TypeCatalogError(
            f"requested datatypes have no class-level invariant: {sorted(missing)}"
        )
    members = tuple(member for member in all_members if member.class_name in selected)
    if not members:
        raise TypeCatalogError("no class-level datatype invariants selected for neutralization")
    predicate_before = _predicate_hashes(text, selected)
    edits = tuple(
        NeutralizationEdit(
            class_name=member.class_name,
            invariant_name=member.name,
            start=member.start,
            end=member.end,
            removed_sha256=_sha256_bytes(text[member.start : member.end].encode("utf-8")),
        )
        for member in members
    )
    chars = list(text)
    edited_positions: set[int] = set()
    for member in members:
        for index in range(member.start, member.end):
            edited_positions.add(index)
            if chars[index] not in {"\r", "\n"}:
                chars[index] = " "
    neutral = "".join(chars)
    remaining = _datatype_invariants(neutral)
    remaining_selected = [item for item in remaining if item.class_name in selected]
    if remaining_selected:
        raise TypeCatalogError("neutralization left selected class invariant members behind")
    predicate_after = _predicate_hashes(neutral, selected)
    if predicate_after != predicate_before:
        raise TypeCatalogError("neutralization changed a generated D_Inv predicate")
    if len(neutral) != len(text) or any(
        text[index] != neutral[index]
        for index in range(len(text))
        if index not in edited_positions
    ):
        raise TypeCatalogError("neutralization changed content outside verified edit spans")
    # A complete re-lex detects brace/comment/string damage before archiving.
    lex_slang(neutral)
    destination.parent.mkdir(parents=True, exist_ok=True)
    destination.write_text(neutral, encoding="utf-8")
    if source.read_bytes() != original:
        raise TypeCatalogError("original generated source changed during neutralization")
    written = destination.read_bytes()
    if written != neutral.encode("utf-8"):
        raise TypeCatalogError("neutral carrier write did not preserve verified bytes")
    return NeutralizationRecord(
        source=str(source),
        neutral_source=str(destination),
        source_sha256=_sha256_bytes(original),
        neutral_sha256=_sha256_bytes(written),
        edits=edits,
        preserved_predicate_sha256=predicate_before,
        structural_verified=True,
    )


__all__ = [
    "AlignedTypeNode",
    "DatatypeInvariantPredicate",
    "EnumType",
    "IndexRange",
    "NeutralizationEdit",
    "NeutralizationRecord",
    "RecordType",
    "ScalarAlias",
    "TypeAlignment",
    "TypeCatalog",
    "TypeCatalogError",
    "TypeExpr",
    "align_type_pair",
    "align_parameter_pair",
    "bind_resolved_datatype_unit",
    "catalog_type_file",
    "catalog_type_text",
    "catalog_types",
    "discover_datatype_invariants",
    "neutralize_datatype_source",
    "parse_type_expr",
]
