"""Structural catalog of HAMR/GumboX generated Slang predicates.

This module intentionally does not parse GUMBO expressions.  It inventories the
generated Slang objects that GumboX makes authoritative, using a small lexical
scanner with balanced delimiter handling.  In particular, method discovery is
not a regular-expression match over source text: comments, strings, nested
blocks, multiline signatures, and generic parameter types cannot confuse the
catalog.

The phase binding API is fail closed.  A missing generated predicate becomes
the boolean identity only when the resolved source inventory explicitly says
that the corresponding source construct is absent.
"""

from __future__ import annotations

from dataclasses import dataclass, replace
import hashlib
from pathlib import Path
from typing import Iterable, Iterator, Sequence

from equiv_checker.schema import (
    ComparisonUnit,
    Observation,
    ObservationRole,
    PredicateBinding,
    UnitKind,
)


class SlangSyntaxError(ValueError):
    """Raised when generated Slang cannot be structurally inventoried."""


class GeneratedSemanticGap(ValueError):
    """Raised when source inventory semantics have no generated composite."""


@dataclass(frozen=True)
class SlangToken:
    kind: str
    text: str
    start: int
    end: int


@dataclass(frozen=True)
class SlangParameter:
    name: str
    type_name: str


@dataclass(frozen=True)
class SlangMethod:
    name: str
    parameters: tuple[SlangParameter, ...]
    return_type: str
    start: int
    end: int
    body_start: int
    body_end: int
    calls: tuple[str, ...] = ()

    def qualified_name(self, owner: str) -> str:
        return f"{owner}.{self.name}"


@dataclass(frozen=True)
class SlangObject:
    source: Path
    package: str
    name: str
    methods: tuple[SlangMethod, ...]
    sha256: str

    @property
    def qualified_name(self) -> str:
        return f"{self.package}.{self.name}" if self.package else self.name


@dataclass(frozen=True)
class PhaseCatalog:
    phase: str
    assumption: SlangMethod | None
    guarantee: SlangMethod | None
    container_assumption: SlangMethod | None
    container_guarantee: SlangMethod | None
    assumption_contributors: tuple[str, ...]
    guarantee_contributors: tuple[str, ...]


@dataclass(frozen=True)
class GumboXObject:
    source: Path
    package: str
    name: str
    methods: tuple[SlangMethod, ...]
    initialize: PhaseCatalog
    compute: PhaseCatalog
    sha256: str

    @property
    def qualified_name(self) -> str:
        return f"{self.package}.{self.name}" if self.package else self.name

    def phase(self, phase: str | UnitKind) -> PhaseCatalog:
        value = phase.value if isinstance(phase, UnitKind) else phase
        if value == UnitKind.INITIALIZE.value:
            return self.initialize
        if value == UnitKind.COMPUTE.value:
            return self.compute
        raise ValueError(f"GumboX has no component phase {value!r}")


@dataclass(frozen=True)
class PredicateCallSignature:
    """A generated predicate plus its exact observation argument order."""

    qualified_method: str | None
    parameters: tuple[SlangParameter, ...]
    observation_indices: tuple[int, ...]
    synthetic_true: bool = False


@dataclass(frozen=True)
class ResolvedPhaseBinding:
    """A schema binding accompanied by proof-emission signature metadata."""

    binding: PredicateBinding
    assumption: PredicateCallSignature
    guarantee: PredicateCallSignature


@dataclass(frozen=True)
class ResolvedUnitBinding:
    """A comparison unit bound to both independently generated namespaces."""

    unit: ComparisonUnit
    oracle: ResolvedPhaseBinding
    candidate: ResolvedPhaseBinding


_OPEN_TO_CLOSE = {"(": ")", "[": "]", "{": "}"}
_CLOSE_TO_OPEN = {value: key for key, value in _OPEN_TO_CLOSE.items()}


def lex_slang(text: str) -> tuple[SlangToken, ...]:
    """Tokenize enough Slang to navigate generated declarations safely.

    Comments are discarded and quoted content is returned as a single token.
    Offsets always refer to the original string so callers can perform narrow,
    auditable source edits.
    """

    result: list[SlangToken] = []
    i = 0
    size = len(text)
    while i < size:
        ch = text[i]
        if ch.isspace():
            i += 1
            continue
        if text.startswith("//", i):
            newline = text.find("\n", i + 2)
            i = size if newline < 0 else newline + 1
            continue
        if text.startswith("/*", i):
            start = i
            i += 2
            depth = 1
            while i < size and depth:
                if text.startswith("/*", i):
                    depth += 1
                    i += 2
                elif text.startswith("*/", i):
                    depth -= 1
                    i += 2
                else:
                    i += 1
            if depth:
                raise SlangSyntaxError(f"unterminated block comment at offset {start}")
            continue
        if text.startswith('\"\"\"', i):
            start = i
            end = text.find('\"\"\"', i + 3)
            if end < 0:
                raise SlangSyntaxError(f"unterminated triple-quoted string at offset {start}")
            i = end + 3
            result.append(SlangToken("string", text[start:i], start, i))
            continue
        if ch in {'"', "'"}:
            start = i
            quote = ch
            i += 1
            escaped = False
            while i < size:
                current = text[i]
                i += 1
                if escaped:
                    escaped = False
                elif current == "\\":
                    escaped = True
                elif current == quote:
                    break
            else:
                raise SlangSyntaxError(f"unterminated quoted literal at offset {start}")
            result.append(SlangToken("string", text[start:i], start, i))
            continue
        if ch == "`":
            start = i
            i += 1
            while i < size and text[i] != "`":
                i += 1
            if i == size:
                raise SlangSyntaxError(f"unterminated quoted identifier at offset {start}")
            i += 1
            result.append(SlangToken("identifier", text[start:i], start, i))
            continue
        if ch.isalpha() or ch in {"_", "$"}:
            start = i
            i += 1
            while i < size and (text[i].isalnum() or text[i] in {"_", "$"}):
                i += 1
            result.append(SlangToken("identifier", text[start:i], start, i))
            continue
        if ch.isdigit():
            start = i
            i += 1
            while i < size and (text[i].isalnum() or text[i] in {"_", "."}):
                i += 1
            result.append(SlangToken("number", text[start:i], start, i))
            continue
        result.append(SlangToken("symbol", ch, i, i + 1))
        i += 1
    return tuple(result)


def matching_token(tokens: Sequence[SlangToken], opening: int) -> int:
    """Return the token index closing ``tokens[opening]``."""

    opener = tokens[opening].text
    if opener not in _OPEN_TO_CLOSE:
        raise SlangSyntaxError(f"token {opening} is not an opening delimiter")
    stack = [opener]
    for index in range(opening + 1, len(tokens)):
        value = tokens[index].text
        if value in _OPEN_TO_CLOSE:
            stack.append(value)
        elif value in _CLOSE_TO_OPEN:
            if not stack or stack[-1] != _CLOSE_TO_OPEN[value]:
                raise SlangSyntaxError(
                    f"mismatched delimiter {value!r} at offset {tokens[index].start}"
                )
            stack.pop()
            if not stack:
                return index
    raise SlangSyntaxError(f"unclosed delimiter {opener!r} at offset {tokens[opening].start}")


def split_top_level(
    tokens: Sequence[SlangToken], separator: str = ","
) -> tuple[tuple[SlangToken, ...], ...]:
    """Split tokens on a separator outside all balanced delimiters."""

    chunks: list[tuple[SlangToken, ...]] = []
    start = 0
    stack: list[str] = []
    for index, token in enumerate(tokens):
        if token.text in _OPEN_TO_CLOSE:
            stack.append(token.text)
        elif token.text in _CLOSE_TO_OPEN:
            if not stack or stack[-1] != _CLOSE_TO_OPEN[token.text]:
                raise SlangSyntaxError(f"mismatched delimiter at offset {token.start}")
            stack.pop()
        elif token.text == separator and not stack:
            chunks.append(tuple(tokens[start:index]))
            start = index + 1
    if stack:
        raise SlangSyntaxError("unclosed delimiter in token sequence")
    chunks.append(tuple(tokens[start:]))
    return tuple(chunks)


def _source_slice(text: str, tokens: Sequence[SlangToken]) -> str:
    if not tokens:
        return ""
    return " ".join(text[token.start : token.end] for token in tokens)


def _package_name(tokens: Sequence[SlangToken]) -> str:
    for index, token in enumerate(tokens):
        if token.text != "package":
            continue
        parts: list[str] = []
        cursor = index + 1
        expect_identifier = True
        while cursor < len(tokens):
            value = tokens[cursor]
            if expect_identifier and value.kind == "identifier":
                parts.append(value.text.strip("`"))
                expect_identifier = False
            elif not expect_identifier and value.text == ".":
                expect_identifier = True
            else:
                break
            cursor += 1
        if parts and not expect_identifier:
            return ".".join(parts)
        raise SlangSyntaxError(f"malformed package declaration at offset {token.start}")
    return ""


def _find_colon(tokens: Sequence[SlangToken]) -> int:
    stack: list[str] = []
    for index, token in enumerate(tokens):
        if token.text in _OPEN_TO_CLOSE:
            stack.append(token.text)
        elif token.text in _CLOSE_TO_OPEN:
            if not stack or stack[-1] != _CLOSE_TO_OPEN[token.text]:
                raise SlangSyntaxError(f"mismatched parameter delimiter at {token.start}")
            stack.pop()
        elif token.text == ":" and not stack:
            return index
    return -1


def _find_equals(tokens: Sequence[SlangToken]) -> int:
    stack: list[str] = []
    for index, token in enumerate(tokens):
        if token.text in _OPEN_TO_CLOSE:
            stack.append(token.text)
        elif token.text in _CLOSE_TO_OPEN:
            if not stack or stack[-1] != _CLOSE_TO_OPEN[token.text]:
                raise SlangSyntaxError(f"mismatched signature delimiter at {token.start}")
            stack.pop()
        elif token.text == "=" and not stack:
            return index
    return -1


def _parse_parameters(text: str, tokens: Sequence[SlangToken]) -> tuple[SlangParameter, ...]:
    parameters: list[SlangParameter] = []
    for chunk in split_top_level(tokens):
        if not chunk:
            continue
        colon = _find_colon(chunk)
        if colon <= 0:
            raise SlangSyntaxError(
                f"unrecognized generated parameter near offset {chunk[0].start}"
            )
        name_tokens = chunk[:colon]
        type_tokens = chunk[colon + 1 :]
        default = _find_equals(type_tokens)
        if default >= 0:
            type_tokens = type_tokens[:default]
        names = [token.text.strip("`") for token in name_tokens if token.kind == "identifier"]
        if not names or not type_tokens:
            raise SlangSyntaxError(
                f"incomplete generated parameter near offset {chunk[0].start}"
            )
        parameters.append(
            SlangParameter(name=names[-1], type_name=_source_slice(text, type_tokens))
        )
    return tuple(parameters)


def _object_methods(
    text: str,
    tokens: Sequence[SlangToken],
    body_open: int,
    body_close: int,
) -> tuple[SlangMethod, ...]:
    definition_indices: list[int] = []
    curly_depth = 0
    for index in range(body_open + 1, body_close):
        token = tokens[index]
        if token.text == "{" :
            curly_depth += 1
        elif token.text == "}":
            curly_depth -= 1
            if curly_depth < 0:
                raise SlangSyntaxError(f"unexpected closing brace at offset {token.start}")
        elif curly_depth == 0 and token.text == "def":
            definition_indices.append(index)

    preliminary: list[SlangMethod] = []
    for ordinal, definition in enumerate(definition_indices):
        if definition + 1 >= body_close or tokens[definition + 1].kind != "identifier":
            raise SlangSyntaxError(f"malformed method at offset {tokens[definition].start}")
        name = tokens[definition + 1].text.strip("`")
        cursor = definition + 2
        if cursor < body_close and tokens[cursor].text == "[":
            cursor = matching_token(tokens, cursor) + 1
        parameter_tokens: list[SlangToken] = []
        found_parameters = False
        while cursor < body_close and tokens[cursor].text == "(":
            close = matching_token(tokens, cursor)
            parameter_tokens.extend(tokens[cursor + 1 : close])
            cursor = close + 1
            found_parameters = True
        if not found_parameters:
            # Parameterless generated helpers are legal: ``def f: B = ...``.
            parameter_tokens = []
        if cursor >= body_close or tokens[cursor].text != ":":
            # Specification members with inferred types are not callable
            # generated predicate entrypoints and are deliberately ignored.
            continue
        cursor += 1
        signature_start = cursor
        stack: list[str] = []
        while cursor < body_close:
            value = tokens[cursor].text
            if value in _OPEN_TO_CLOSE:
                stack.append(value)
            elif value in _CLOSE_TO_OPEN:
                if not stack or stack[-1] != _CLOSE_TO_OPEN[value]:
                    raise SlangSyntaxError(f"mismatched method signature at {tokens[cursor].start}")
                stack.pop()
            elif value == "=" and not stack:
                break
            cursor += 1
        if cursor >= body_close:
            raise SlangSyntaxError(f"method {name!r} has no body")
        return_tokens = tokens[signature_start:cursor]
        if not return_tokens:
            raise SlangSyntaxError(f"method {name!r} has no return type")
        body_start_token = cursor + 1
        next_definition = (
            definition_indices[ordinal + 1]
            if ordinal + 1 < len(definition_indices)
            else body_close
        )
        body_end_offset = tokens[next_definition].start
        body_start_offset = (
            tokens[body_start_token].start if body_start_token < next_definition else tokens[cursor].end
        )
        preliminary.append(
            SlangMethod(
                name=name,
                parameters=_parse_parameters(text, parameter_tokens),
                return_type=_source_slice(text, return_tokens),
                start=tokens[definition].start,
                end=body_end_offset,
                body_start=body_start_offset,
                body_end=body_end_offset,
            )
        )

    names = {method.name for method in preliminary}
    if len(names) != len(preliminary):
        raise SlangSyntaxError("overloaded generated methods are unsupported")
    result: list[SlangMethod] = []
    for method in preliminary:
        body_tokens = [
            token
            for token in tokens
            if method.body_start <= token.start < method.body_end
        ]
        calls: list[str] = []
        for index, token in enumerate(body_tokens):
            if token.kind != "identifier" or token.text not in names:
                continue
            following = body_tokens[index + 1].text if index + 1 < len(body_tokens) else ""
            if following == "(" and token.text not in calls:
                calls.append(token.text)
        result.append(
            SlangMethod(
                name=method.name,
                parameters=method.parameters,
                return_type=method.return_type,
                start=method.start,
                end=method.end,
                body_start=method.body_start,
                body_end=method.body_end,
                calls=tuple(calls),
            )
        )
    return tuple(result)


def _one_alias(methods: dict[str, SlangMethod], names: Sequence[str]) -> SlangMethod | None:
    matches = [methods[name] for name in names if name in methods]
    if len(matches) > 1:
        raise SlangSyntaxError(f"ambiguous generated predicate aliases: {[m.name for m in matches]}")
    return matches[0] if matches else None


def _reachable(start: SlangMethod | None, methods: dict[str, SlangMethod]) -> tuple[str, ...]:
    if start is None:
        return ()
    result: list[str] = []
    visited: set[str] = set()

    def visit(name: str) -> None:
        if name in visited:
            return
        visited.add(name)
        result.append(name)
        for called in methods[name].calls:
            visit(called)

    visit(start.name)
    return tuple(result)


def _phase_catalog(phase: str, method_list: Sequence[SlangMethod]) -> PhaseCatalog:
    methods = {method.name: method for method in method_list}
    if phase == "initialize":
        prefixes = ("initialize_IEP", "inititialize_IEP")
    elif phase == "compute":
        prefixes = ("compute_CEP",)
    else:
        raise ValueError(phase)
    assumption = _one_alias(methods, tuple(f"{p}_Pre" for p in prefixes))
    guarantee = _one_alias(methods, tuple(f"{p}_Post" for p in prefixes))
    container_assumption = _one_alias(
        methods, tuple(f"{p}_Pre_Container" for p in prefixes)
    )
    container_guarantee = _one_alias(
        methods, tuple(f"{p}_Post_Container" for p in prefixes)
    )
    if container_assumption is not None and assumption is None:
        raise SlangSyntaxError(f"{phase} pre-container exists without native composite")
    if container_guarantee is not None and guarantee is None:
        raise SlangSyntaxError(f"{phase} post-container exists without native composite")
    return PhaseCatalog(
        phase=phase,
        assumption=assumption,
        guarantee=guarantee,
        container_assumption=container_assumption,
        container_guarantee=container_guarantee,
        assumption_contributors=_reachable(assumption, methods),
        guarantee_contributors=_reachable(guarantee, methods),
    )


def catalog_gumbox_text(text: str, source: Path | str = Path("<memory>")) -> tuple[GumboXObject, ...]:
    """Catalog all ``*_GumboX`` objects in one generated source."""

    generic_objects = catalog_slang_objects(text, source)
    objects: list[GumboXObject] = []
    for generic in generic_objects:
        if not generic.name.endswith("_GumboX"):
            continue
        objects.append(
            GumboXObject(
                source=generic.source,
                package=generic.package,
                name=generic.name,
                methods=generic.methods,
                initialize=_phase_catalog("initialize", generic.methods),
                compute=_phase_catalog("compute", generic.methods),
                sha256=generic.sha256,
            )
        )
    return tuple(objects)


def catalog_slang_objects(
    text: str, source: Path | str = Path("<memory>")
) -> tuple[SlangObject, ...]:
    """Catalog top-level generated Slang objects and their balanced methods."""

    tokens = lex_slang(text)
    package = _package_name(tokens)
    source_path = Path(source)
    digest = hashlib.sha256(text.encode("utf-8")).hexdigest()
    result: list[SlangObject] = []
    enclosing_closes: list[int] = []
    for index, token in enumerate(tokens):
        enclosing_closes = [closing for closing in enclosing_closes if index < closing]
        if token.text != "object" or index + 1 >= len(tokens):
            continue
        name_token = tokens[index + 1]
        if name_token.kind != "identifier":
            continue
        cursor = index + 2
        while cursor < len(tokens) and tokens[cursor].text not in {"{", "=", ";"}:
            cursor += 1
        if cursor == len(tokens) or tokens[cursor].text != "{":
            continue
        close = matching_token(tokens, cursor)
        # Nested proof/helper objects are not generated datatype or GumboX
        # owners; omit them to keep qualified identities unambiguous.
        if not enclosing_closes:
            result.append(
                SlangObject(
                    source=source_path,
                    package=package,
                    name=name_token.text,
                    methods=_object_methods(text, tokens, cursor, close),
                    sha256=digest,
                )
            )
        enclosing_closes.append(close)
    return tuple(result)


def catalog_gumbox_file(path: Path) -> tuple[GumboXObject, ...]:
    return catalog_gumbox_text(path.read_text(encoding="utf-8"), path)


def discover_gumbox(project: Path) -> tuple[GumboXObject, ...]:
    """Discover generated GumboX objects and reject qualified-name collisions."""

    result: list[GumboXObject] = []
    for path in sorted(project.rglob("*_GumboX.scala")):
        result.extend(catalog_gumbox_file(path))
    names = [item.qualified_name for item in result]
    if len(names) != len(set(names)):
        duplicates = sorted({name for name in names if names.count(name) > 1})
        raise SlangSyntaxError(f"duplicate generated GumboX objects: {duplicates}")
    return tuple(result)


def bind_phase(
    *,
    side: str,
    owner: GumboXObject,
    phase: str | UnitKind,
    source_assumption_present: bool | None,
    source_guarantee_present: bool | None,
) -> PredicateBinding:
    """Create a schema binding, using ``true`` only for certified absence.

    ``None`` means the source inventory did not establish presence or absence;
    it is therefore an error when the generated composite is also missing.
    Existing generated composites are always retained, including datatype
    guards, integration constraints, and their reachable helper predicates.
    """

    if side not in {"oracle", "candidate"}:
        raise ValueError(f"unknown comparison side {side!r}")
    catalog = owner.phase(phase)

    def select(
        method: SlangMethod | None, source_present: bool | None, role: str
    ) -> tuple[str | None, bool]:
        if method is not None:
            return method.qualified_name(owner.qualified_name), False
        if source_present is False:
            return None, True
        qualifier = catalog.phase
        if source_present is True:
            raise GeneratedSemanticGap(
                f"{owner.qualified_name} is missing generated {qualifier} {role} "
                "for a present source construct"
            )
        raise GeneratedSemanticGap(
            f"{owner.qualified_name} is missing generated {qualifier} {role}; "
            "source inventory did not certify absence"
        )

    assumption, synthetic_assumption = select(
        catalog.assumption, source_assumption_present, "assumption"
    )
    guarantee, synthetic_guarantee = select(
        catalog.guarantee, source_guarantee_present, "guarantee"
    )
    return PredicateBinding(
        side=side,
        assumption=assumption,
        guarantee=guarantee,
        container_assumption=(
            catalog.container_assumption.qualified_name(owner.qualified_name)
            if catalog.container_assumption
            else None
        ),
        container_guarantee=(
            catalog.container_guarantee.qualified_name(owner.qualified_name)
            if catalog.container_guarantee
            else None
        ),
        source_object=owner.qualified_name,
        generated_source=str(owner.source),
        generated_sha256=owner.sha256,
        synthetic_true_assumption=synthetic_assumption,
        synthetic_true_guarantee=synthetic_guarantee,
    )


def _canonical_type(value: str) -> str:
    """Canonicalize harmless generated type spelling differences."""

    rendered = "".join(token.text.strip("`") for token in lex_slang(value))
    rendered = rendered.replace("::", ".").removeprefix("_root_.")
    sireum_primitives = {
        "B", "Z", "S8", "S16", "S32", "S64", "U8", "U16", "U32", "U64",
        "R", "F32", "F64", "C", "String",
    }
    if (
        rendered.startswith("org.sireum.")
        and rendered.removeprefix("org.sireum.") in sireum_primitives
    ):
        rendered = rendered.removeprefix("org.sireum.")
    base_type_aliases = {
        "Boolean": "B",
        "Integer": "Z",
        "Integer_8": "S8",
        "Integer_16": "S16",
        "Integer_32": "S32",
        "Integer_64": "S64",
        "Unsigned_8": "U8",
        "Unsigned_16": "U16",
        "Unsigned_32": "U32",
        "Unsigned_64": "U64",
        "Float": "R",
        "Float_32": "F32",
        "Float_64": "F64",
        "Character": "C",
        "String": "String",
    }
    for alias, primitive in base_type_aliases.items():
        if rendered == f"Base_Types.{alias}" or rendered.endswith(
            f".Base_Types.{alias}"
        ):
            return primitive
    return rendered


def _type_matches(actual: str, expected: str | None) -> bool:
    if expected is None:
        return False
    actual_value = _canonical_type(actual)
    expected_value = _canonical_type(expected)
    if actual_value == expected_value:
        return True
    # Generated methods frequently use an imported package-relative spelling
    # while the frozen comparison plan records the fully qualified spelling.
    return expected_value.endswith(f".{actual_value}") or actual_value.endswith(
        f".{expected_value}"
    )


def _observation_aliases(observation: Observation) -> tuple[str, ...]:
    name = observation.name.strip("`")
    aliases = [name]
    if observation.role in {ObservationRole.INPUT, ObservationRole.OUTPUT}:
        aliases.append(name.removeprefix("api_") if name.startswith("api_") else f"api_{name}")
    elif observation.role is ObservationRole.PRE_STATE:
        # GumboX always names old state ``In_x``.  Do not also admit ``x``:
        # that would make a post-state parameter ambiguously match old state.
        aliases = [name if name.startswith("In_") else f"In_{name}"]
    elif observation.role is ObservationRole.POST_STATE:
        aliases.append(name.removeprefix("Out_") if name.startswith("Out_") else f"Out_{name}")
    elif observation.role is ObservationRole.VALUE:
        aliases.append("value")
    return tuple(dict.fromkeys(aliases))


def _allowed_roles(kind: UnitKind, polarity: str) -> frozenset[ObservationRole]:
    if kind is UnitKind.DATATYPE_INVARIANT:
        return (
            frozenset()
            if polarity == "assumption"
            else frozenset({ObservationRole.VALUE})
        )
    if polarity == "assumption":
        return frozenset({ObservationRole.INPUT, ObservationRole.PRE_STATE})
    if kind is UnitKind.INITIALIZE:
        # Sireum permits initialization guarantees to depend on incoming data
        # ports, and includes those inputs in the native IEP post predicate.
        return frozenset(
            {ObservationRole.INPUT, ObservationRole.OUTPUT, ObservationRole.POST_STATE}
        )
    return frozenset(
        {
            ObservationRole.INPUT,
            ObservationRole.OUTPUT,
            ObservationRole.PRE_STATE,
            ObservationRole.POST_STATE,
        }
    )


def bind_method_call(
    *,
    side: str,
    kind: UnitKind,
    polarity: str,
    owner: str,
    method: SlangMethod | None,
    observations: Sequence[Observation],
    synthetic_true: bool,
) -> PredicateCallSignature:
    """Bind every generated parameter to one inventory observation.

    The method's declaration controls call order.  Names are matched only via
    HAMR's documented ``api_``/``In_``/``Out_`` wrappers, and the side-specific
    generated type must match the inventory-aligned type.  Any ambiguity or
    unmapped parameter is a semantic gap rather than a guessed call.
    """

    if side not in {"oracle", "candidate"}:
        raise ValueError(f"unknown comparison side {side!r}")
    if polarity not in {"assumption", "guarantee"}:
        raise ValueError(f"unknown predicate polarity {polarity!r}")
    if method is None:
        if not synthetic_true:
            raise GeneratedSemanticGap(f"{owner} has no generated {polarity} predicate")
        return PredicateCallSignature(None, (), (), synthetic_true=True)
    if synthetic_true:
        raise GeneratedSemanticGap(
            f"{owner}.{method.name} cannot also be marked as synthetic true"
        )
    if _canonical_type(method.return_type) not in {"B", "org.sireum.B", "Boolean"}:
        raise GeneratedSemanticGap(
            f"{owner}.{method.name} has non-boolean return type {method.return_type!r}"
        )

    allowed = _allowed_roles(kind, polarity)
    used: set[int] = set()
    indices: list[int] = []
    for parameter in method.parameters:
        matches = [
            index
            for index, observation in enumerate(observations)
            if index not in used
            and observation.role in allowed
            and parameter.name in _observation_aliases(observation)
        ]
        if len(matches) != 1:
            detail = "no" if not matches else "multiple"
            raise GeneratedSemanticGap(
                f"{owner}.{method.name} parameter {parameter.name!r} has {detail} "
                f"inventory observation match for {polarity}"
            )
        index = matches[0]
        observation = observations[index]
        expected_type = (
            observation.oracle_type if side == "oracle" else observation.candidate_type
        )
        if not _type_matches(parameter.type_name, expected_type):
            raise GeneratedSemanticGap(
                f"{owner}.{method.name} parameter {parameter.name!r} type "
                f"{parameter.type_name!r} does not match inventory type {expected_type!r}"
            )
        used.add(index)
        indices.append(index)
    return PredicateCallSignature(
        method.qualified_name(owner), method.parameters, tuple(indices), synthetic_true=False
    )


def bind_resolved_phase(
    *,
    side: str,
    owner: GumboXObject,
    kind: UnitKind,
    observations: Sequence[Observation],
    source_assumption_present: bool | None,
    source_guarantee_present: bool | None,
) -> ResolvedPhaseBinding:
    """Bind and signature-check one side of a resolved owner/phase unit."""

    if kind not in {UnitKind.INITIALIZE, UnitKind.COMPUTE}:
        raise ValueError(f"component GumboX binding does not support {kind.value}")
    binding = bind_phase(
        side=side,
        owner=owner,
        phase=kind,
        source_assumption_present=source_assumption_present,
        source_guarantee_present=source_guarantee_present,
    )
    phase = owner.phase(kind)
    assumption = bind_method_call(
        side=side,
        kind=kind,
        polarity="assumption",
        owner=owner.qualified_name,
        method=phase.assumption,
        observations=observations,
        synthetic_true=binding.synthetic_true_assumption,
    )
    guarantee = bind_method_call(
        side=side,
        kind=kind,
        polarity="guarantee",
        owner=owner.qualified_name,
        method=phase.guarantee,
        observations=observations,
        synthetic_true=binding.synthetic_true_guarantee,
    )
    binding = replace(
        binding,
        assumption_observations=tuple(
            observations[index].name for index in assumption.observation_indices
        ),
        guarantee_observations=tuple(
            observations[index].name for index in guarantee.observation_indices
        ),
    )
    return ResolvedPhaseBinding(binding, assumption, guarantee)


def bind_resolved_unit(
    *,
    unit: ComparisonUnit,
    oracle_owner: GumboXObject | None,
    candidate_owner: GumboXObject | None,
    oracle_assumption_present: bool | None = None,
    oracle_guarantee_present: bool | None = None,
    candidate_assumption_present: bool | None = None,
    candidate_guarantee_present: bool | None = None,
    candidate_owner_suffix: str = "",
) -> ResolvedUnitBinding:
    """Bind a frozen inventory unit to exact two-sided GumboX composites."""

    if not unit.coverage_complete or unit.unsupported_reasons:
        raise GeneratedSemanticGap(f"unit is not coverage-complete: {unit.key}")
    if unit.kind not in {UnitKind.INITIALIZE, UnitKind.COMPUTE}:
        raise ValueError(f"unit is not a component phase: {unit.key}")
    if unit.phase != unit.kind.value:
        raise GeneratedSemanticGap(
            f"unit phase {unit.phase!r} does not match kind {unit.kind.value!r}"
        )

    def certified_presence(
        side: str,
        binding: PredicateBinding,
        polarity: str,
        asserted: bool | None,
    ) -> bool:
        synthetic = (
            binding.synthetic_true_assumption
            if polarity == "assumption"
            else binding.synthetic_true_guarantee
        )
        present = not synthetic
        if asserted is not None and asserted is not present:
            raise GeneratedSemanticGap(
                f"{side} {polarity} presence assertion {asserted} disagrees with "
                f"the frozen inventory binding for {unit.key}"
            )
        return present

    def owner_matches(actual: str, expected: str) -> bool:
        actual_name = actual.removeprefix("_root_.").replace("::", ".")
        expected_name = expected.removeprefix("_root_.").replace("::", ".")
        return actual_name == expected_name or actual_name.endswith(f".{expected_name}")

    def side_binding(
        side: str,
        owner: GumboXObject | None,
        frozen: PredicateBinding | None,
        asserted_assumption_present: bool | None,
        asserted_guarantee_present: bool | None,
    ) -> ResolvedPhaseBinding:
        if frozen is None:
            raise GeneratedSemanticGap(
                f"{side} has no frozen inventory predicate binding for {unit.key}"
            )
        if frozen.side != side:
            raise GeneratedSemanticGap(
                f"{side} frozen predicate binding is labelled {frozen.side!r}"
            )
        assumption_present = certified_presence(
            side, frozen, "assumption", asserted_assumption_present
        )
        guarantee_present = certified_presence(
            side, frozen, "guarantee", asserted_guarantee_present
        )
        if owner is not None:
            if frozen.source_object is None:
                raise GeneratedSemanticGap(
                    f"{side} generated owner {owner.qualified_name} has no "
                    f"inventory-certified owner identity for {unit.key}"
                )
            expected_owner = frozen.source_object
            if side == "candidate" and candidate_owner_suffix:
                if not expected_owner.endswith("_GumboX"):
                    raise GeneratedSemanticGap(
                        f"candidate inventory owner is not a GumboX object: {expected_owner}"
                    )
                expected_owner = (
                    f"{expected_owner.removesuffix('_GumboX')}"
                    f"{candidate_owner_suffix}_GumboX"
                )
            if not owner_matches(owner.qualified_name, expected_owner):
                raise GeneratedSemanticGap(
                    f"{side} generated owner {owner.qualified_name!r} does not match "
                    f"the frozen inventory owner {expected_owner!r} for {unit.key}"
                )
            return bind_resolved_phase(
                side=side,
                owner=owner,
                kind=unit.kind,
                observations=unit.observations,
                source_assumption_present=assumption_present,
                source_guarantee_present=guarantee_present,
            )
        if assumption_present is not False or guarantee_present is not False:
            raise GeneratedSemanticGap(
                f"{side} has no generated GumboX owner for {unit.key}, but source "
                "inventory did not certify both assumption and guarantee absent"
            )
        binding = PredicateBinding(
            side=side,
            assumption=None,
            guarantee=None,
            synthetic_true_assumption=True,
            synthetic_true_guarantee=True,
            assumption_observations=(),
            guarantee_observations=(),
        )
        synthetic = PredicateCallSignature(None, (), (), synthetic_true=True)
        return ResolvedPhaseBinding(binding, synthetic, synthetic)

    oracle = side_binding(
        "oracle",
        oracle_owner,
        unit.oracle,
        oracle_assumption_present,
        oracle_guarantee_present,
    )
    candidate = side_binding(
        "candidate",
        candidate_owner,
        unit.candidate,
        candidate_assumption_present,
        candidate_guarantee_present,
    )
    bound = replace(unit, oracle=oracle.binding, candidate=candidate.binding)
    return ResolvedUnitBinding(bound, oracle, candidate)


def contributor_names(owner: GumboXObject, phase: str | UnitKind) -> tuple[str, ...]:
    """Return all methods contributing to a phase's two top-level composites."""

    catalog = owner.phase(phase)
    ordered = catalog.assumption_contributors + catalog.guarantee_contributors
    return tuple(dict.fromkeys(ordered))


__all__ = [
    "GeneratedSemanticGap",
    "GumboXObject",
    "PhaseCatalog",
    "PredicateCallSignature",
    "ResolvedPhaseBinding",
    "ResolvedUnitBinding",
    "SlangMethod",
    "SlangObject",
    "SlangParameter",
    "SlangSyntaxError",
    "SlangToken",
    "bind_phase",
    "bind_method_call",
    "bind_resolved_phase",
    "bind_resolved_unit",
    "catalog_gumbox_file",
    "catalog_gumbox_text",
    "catalog_slang_objects",
    "contributor_names",
    "discover_gumbox",
    "lex_slang",
    "matching_token",
    "split_top_level",
]
