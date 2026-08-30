#!/usr/bin/env python3
"""Build a publication-facing natural-language specification ``N``.

The builder combines two deliberately different authorities:

* selected System Abstract paragraphs provide context; and
* SNL rendered from Sireum's resolved GUMBO tree provides normative behavior.

It does not parse GUMBO, serialize a second semantic IR, or expose the oracle
contract source to the evaluated agent.  The JSON sidecar is a thin document
and provenance manifest; it is not an input to the contract-synthesis agent.
"""

from __future__ import annotations

import argparse
import hashlib
import json
import re
import sys
import tempfile
import textwrap
from dataclasses import dataclass
from pathlib import Path
from typing import Any, Iterable


BUILDER_VERSION = "2.0.0"
MANIFEST_SCHEMA = "n-publication-manifest-2.0.0"
INVENTORY_SCHEMA = "snl-resolved-publication-inventory-1.0.0"
TRACE_BLIND_MODEL_NAME = "M-star.sysml"
SNL_STYLE_VERSION = "2"
SNL_SEMANTIC_AUTHORITY = (
    "`FrontEnd.typeCheck` → `GclAnnexClauseInfo` / Slang AST"
)


class BuildError(RuntimeError):
    """A fail-closed publication error."""


@dataclass(frozen=True)
class Paragraph:
    section: str
    text: str

    @property
    def sha256(self) -> str:
        return sha256_text(self.text)


@dataclass(frozen=True)
class ClauseRecord:
    formal_id: str
    kind: str
    owner: str
    phase: str | None
    trace_ids: tuple[str, ...]
    source: str | None

    @property
    def key(self) -> tuple[str, str | None, str, str]:
        return (self.owner, self.phase, self.kind, self.formal_id)


@dataclass(frozen=True)
class InventoryRecord:
    owner: str
    phase: str | None
    kind: str
    formal_id: str
    trace_ids: tuple[str, ...]
    source: str | None
    source_uri: str

    @property
    def key(self) -> tuple[str, str | None, str, str]:
        return (self.owner, self.phase, self.kind, self.formal_id)


@dataclass(frozen=True)
class FunctionRecord:
    owner: str
    name: str
    category: str
    inputs: tuple[tuple[str, str], ...]
    result_type: str
    trace_ids: tuple[str, ...]
    reads: tuple[str, ...]
    has_preconditions: bool
    has_postconditions: bool

    @property
    def identity(self) -> str:
        return f"{self.owner}::{self.name}"


@dataclass(frozen=True)
class StateRecord:
    owner: str
    name: str
    declared_type: str

    @property
    def identity(self) -> str:
        return f"{self.owner}::{self.name}"


@dataclass(frozen=True)
class SnlPublication:
    functions_text: str
    states_text: str
    behavior_text: str
    functions: tuple[FunctionRecord, ...]
    states: tuple[StateRecord, ...]
    clauses: tuple[ClauseRecord, ...]

    @property
    def text(self) -> str:
        sections: list[str] = []
        definitions = "\n\n".join(
            text.rstrip() for text in (self.states_text, self.functions_text) if text
        )
        if definitions:
            sections.append(
                "## Supporting contract definitions\n\n" + definitions
            )
        sections.append(
            "## Detailed behavioral requirements\n\n" + self.behavior_text.rstrip()
        )
        return "\n\n".join(sections) + "\n"


def sha256_bytes(data: bytes) -> str:
    return hashlib.sha256(data).hexdigest()


def sha256_text(text: str) -> str:
    return sha256_bytes(text.encode("utf-8"))


def read_text(path: Path) -> str:
    try:
        return path.read_text(encoding="utf-8")
    except OSError as exc:
        raise BuildError(f"cannot read {path}: {exc}") from exc


def load_json(path: Path) -> dict[str, Any]:
    try:
        value = json.loads(read_text(path))
    except json.JSONDecodeError as exc:
        raise BuildError(f"invalid JSON in {path}: {exc}") from exc
    if not isinstance(value, dict):
        raise BuildError(f"expected a JSON object in {path}")
    return value


def strip_front_matter(text: str) -> str:
    lines = text.splitlines()
    if not lines or lines[0].strip() != "---":
        return text
    try:
        end = next(i for i in range(1, len(lines)) if lines[i].strip() == "---")
    except StopIteration as exc:
        raise BuildError("System Abstract has an unterminated YAML front matter block") from exc
    return "\n".join(lines[end + 1 :]).lstrip("\n")


def split_abstract(text: str) -> tuple[str, dict[str, list[Paragraph]]]:
    """Return the H1 title and H2 sections split into stable paragraphs."""

    lines = strip_front_matter(text).splitlines()
    title: str | None = None
    current_section: str | None = None
    sections: dict[str, list[Paragraph]] = {}
    buffer: list[str] = []

    def flush() -> None:
        nonlocal buffer
        if current_section is None:
            buffer = []
            return
        value = "\n".join(buffer).strip()
        if value:
            sections[current_section].append(Paragraph(current_section, value))
        buffer = []

    for line in lines:
        if line.startswith("# ") and title is None:
            title = line[2:].strip()
            continue
        if line.startswith("## "):
            flush()
            current_section = line[3:].strip()
            if current_section in sections:
                raise BuildError(f"duplicate System Abstract section: {current_section}")
            sections[current_section] = []
            continue
        if current_section is None:
            continue
        if not line.strip():
            flush()
        else:
            buffer.append(line.rstrip())
    flush()
    if not title:
        raise BuildError("System Abstract has no level-one title")
    return title, sections


_CONTEXT_PREFIX = re.compile(
    r"^(?:NEED|PURPOSE|GOAL|CTX|MON|CTRL|RISK|HAZARD|MODE|ASM)-"
)
_PROHIBITED_CONTEXT = re.compile(
    r"(?i)\b(?:generation[- ]tool|generated by|generated model|generated source|"
    r"generation[- ]process|model[- ]generator|system abstract generator|model agent|"
    r"designer agent|frozen[- ]seed|visualization|diagram generation|rendered "
    r"overview|token[- ]use|token usage|agent-token|validation[- ]process|validation[- ]"
    r"stage|validation[- ]report|validation[- ]workflow|model[- ]review|review of the "
    r"model|review agent|GUMBO|Sireum|HAMR)\b"
)
_SENTENCE_BOUNDARY = re.compile(r"(?<=[.!?])\s+(?=[A-Z`])")


def clean_abstract_title(title: str) -> str:
    """Remove editorial status phrases without changing the semantic title."""

    cleaned = re.sub(
        r"(?i)\b(?:approved|revised|system abstract)\b", " ", title
    )
    cleaned = re.sub(r"\s*[—–-]\s*(?=$)", "", cleaned)
    cleaned = re.sub(r"\s+", " ", cleaned).strip(" —–-")
    if not cleaned:
        raise BuildError("System Abstract title is empty after editorial cleanup")
    return cleaned


def _sanitize_context_paragraph(paragraph: Paragraph) -> tuple[str, int]:
    flattened = re.sub(r"\s+", " ", paragraph.text).strip()
    sentences = _SENTENCE_BOUNDARY.split(flattened)
    retained = [sentence for sentence in sentences if not _PROHIBITED_CONTEXT.search(sentence)]
    sanitized = " ".join(retained).strip()
    if not sanitized:
        raise BuildError(
            "context sanitation emptied selected paragraph "
            f"{paragraph.text.split(':', 1)[0]!r} in section {paragraph.section!r}"
        )
    leaked = _PROHIBITED_CONTEXT.search(sanitized)
    if leaked:
        raise BuildError(
            f"context sanitation retained prohibited language {leaked.group(0)!r}"
        )
    wrapped = textwrap.fill(
        sanitized, width=88, break_long_words=False, break_on_hyphens=False
    )
    return wrapped, len(sentences) - len(retained)


def publish_context(text: str) -> tuple[str, str, list[dict[str, Any]]]:
    """Apply the single corpus-wide context publication policy."""

    raw_title, sections = split_abstract(text)
    title = clean_abstract_title(raw_title)
    rendered_sections: list[str] = []
    decisions: list[dict[str, Any]] = []
    for heading, paragraphs in sections.items():
        selected: list[str] = []
        for paragraph in paragraphs:
            if not _CONTEXT_PREFIX.match(paragraph.text):
                continue
            sanitized, excluded_sentences = _sanitize_context_paragraph(paragraph)
            selected.append(sanitized)
            decisions.append(
                {
                    "section": heading,
                    "source_sha256": paragraph.sha256,
                    "prefix": paragraph.text.split(":", 1)[0],
                    "excluded_sentence_count": excluded_sentences,
                    "published_sha256": sha256_text(sanitized),
                }
            )
        if selected:
            rendered_sections.append(
                f"### {heading}\n\n" + "\n\n".join(selected)
            )
    if not decisions:
        raise BuildError("System Abstract contains no paragraph selected by context policy")
    context = "## Selected system context\n\n" + "\n\n".join(rendered_sections)
    if _PROHIBITED_CONTEXT.search(context):
        raise BuildError("published context retains prohibited provenance/tooling language")
    return title, context.rstrip() + "\n", decisions


_CODE_SPAN = re.compile(r"`([^`]+)`")
_TYPE_TAG = re.compile(r"\s+\[(?:(?:S|U|Z|N|F)\d*|R)\]")
_TRACE_LINE = re.compile(r"^- Trace IDs:\s*(.*)$")
_SOURCE_LINE = re.compile(r"^- Source:\s*(.*)$")
_NON_NORMATIVE_NOTE_LINE = re.compile(
    r"^- (Semantic status|Semantic note|Quality note):\s*(.*)$"
)
_AUTHORED_DESCRIPTION_LINE = re.compile(r"^- Authored description:\s*(.*)$")
_OWNER = re.compile(r"^## Contract (owner|library) `([^`]+)`$")
_PHASE = re.compile(r"^### (Initialization|Integration|Compute) phase$")
_CLAUSE = re.compile(r"^(#{3,5}) (Invariant|Assumption|Guarantee|Case) `([^`]+)`$")
_FUNCTION = re.compile(r"^### Function `([^`]+)`$")
_FUNCTION_CATEGORY = re.compile(r"^- Function category:\s*(\S(?:.*\S)?)$")
_FUNCTION_INPUT = re.compile(r"^- Input `([^`]+)` has type `([^`]+)`\.$")
_FUNCTION_RESULT = re.compile(r"^- Result type: `([^`]+)`\.$")
_FUNCTION_READS = re.compile(r"^- Reads:\s*(\S(?:.*\S)?)$")
_STATE = re.compile(r"^State `([^`]+)` has type `([^`]+)`\.$")
_MODIFIES = re.compile(r"^May modify:\s*(\S(?:.*\S)?)$")
_OTHER_FORMAL = re.compile(
    r"^#{3,5} (Composition|Information flow|Abstract property|Property)\b"
)
_FORMAL_HEADING = re.compile(r"^#{3,5}\s+")
_SNL_METADATA = re.compile(r"^- `([^`]+)`: (.*)$")


def validate_snl_header(text: str) -> None:
    lines = text.splitlines()
    if not lines or lines[0] != "# Structured natural-language view of resolved GUMBO":
        raise BuildError("SNL has no supported renderer title")
    metadata: dict[str, str] = {}
    for line in lines[1:]:
        if line.startswith("## "):
            break
        match = _SNL_METADATA.match(line)
        if not match:
            continue
        key, value = match.groups()
        if key in metadata:
            raise BuildError(f"duplicate SNL header metadata: {key}")
        metadata[key] = value
    expected_style = f"`{SNL_STYLE_VERSION}`"
    if metadata.get("SNL_STYLE_VERSION") != expected_style:
        raise BuildError(
            "unsupported SNL style version: "
            f"{metadata.get('SNL_STYLE_VERSION')!r}"
        )
    if metadata.get("SEMANTIC_INPUT") != SNL_SEMANTIC_AUTHORITY:
        raise BuildError("SNL does not declare the required Sireum semantic authority")


def _code_span_list(value: str, label: str) -> tuple[str, ...]:
    items = parse_trace_ids(value)
    if not items or ", ".join(f"`{item}`" for item in items) != value:
        raise BuildError(f"malformed SNL function {label}: {value!r}")
    if len(items) != len(set(items)):
        raise BuildError(f"duplicate SNL function {label}: {value!r}")
    return items


def _parse_function_block(
    owner: str, name: str, block: list[str]
) -> tuple[str, FunctionRecord]:
    source: str | None = None
    category: str | None = None
    inputs: list[tuple[str, str]] = []
    result_type: str | None = None
    traces: tuple[str, ...] = ()
    reads: tuple[str, ...] = ()
    trace_seen = False
    reads_seen = False
    pre_seen = False
    post_seen = False
    current_contract: str | None = None
    contract_content = {"pre": 0, "post": 0}
    body_started = False
    body_lines: list[str] = []
    published: list[str] = [f"### `{owner}::{name}`", ""]
    seen_input_names: set[str] = set()
    allowed_categories = {
        "Specification only",
        "Impure",
        "Pure",
        "Memoized",
        "Strictly pure",
        "Abstract",
    }

    for raw_line in block:
        if body_started:
            if raw_line and not raw_line.startswith(">"):
                raise BuildError(
                    f"unsupported content after return body for function {owner}::{name}: "
                    f"{raw_line!r}"
                )
            published.append(raw_line)
            if raw_line.startswith(">"):
                body_lines.append(raw_line)
            continue
        trace_match = _TRACE_LINE.match(raw_line)
        if trace_match:
            if trace_seen or source is not None:
                raise BuildError(f"misplaced or duplicate trace metadata for function {owner}::{name}")
            traces = _code_span_list(trace_match.group(1), "trace metadata")
            trace_seen = True
            continue
        source_match = _SOURCE_LINE.match(raw_line)
        if source_match:
            if source is not None or category is not None:
                raise BuildError(f"misplaced or duplicate source metadata for function {owner}::{name}")
            source = source_match.group(1)
            if not re.fullmatch(r"line [1-9][0-9]*, column [1-9][0-9]*", source):
                raise BuildError(f"malformed source metadata for function {owner}::{name}")
            continue
        category_match = _FUNCTION_CATEGORY.match(raw_line)
        if category_match:
            if source is None or category is not None:
                raise BuildError(f"misplaced or duplicate category for function {owner}::{name}")
            category = category_match.group(1)
            if category not in allowed_categories:
                raise BuildError(
                    f"unsupported category {category!r} for function {owner}::{name}"
                )
            published.append(raw_line)
            continue
        input_match = _FUNCTION_INPUT.match(raw_line)
        if input_match:
            if category is None or result_type is not None:
                raise BuildError(f"misplaced input metadata for function {owner}::{name}")
            input_name, input_type = input_match.groups()
            if input_name in seen_input_names:
                raise BuildError(f"duplicate input {input_name!r} for function {owner}::{name}")
            seen_input_names.add(input_name)
            inputs.append((input_name, input_type))
            published.append(raw_line)
            continue
        result_match = _FUNCTION_RESULT.match(raw_line)
        if result_match:
            if category is None or result_type is not None:
                raise BuildError(f"misplaced or duplicate result metadata for function {owner}::{name}")
            result_type = result_match.group(1)
            published.append(raw_line)
            continue
        reads_match = _FUNCTION_READS.match(raw_line)
        if reads_match:
            if result_type is None or reads_seen or pre_seen or post_seen:
                raise BuildError(f"misplaced or duplicate reads metadata for function {owner}::{name}")
            reads = _code_span_list(reads_match.group(1), "reads metadata")
            reads_seen = True
            published.append(raw_line)
            continue
        if raw_line == "**Preconditions:**":
            if result_type is None or pre_seen or post_seen:
                raise BuildError(f"misplaced or duplicate preconditions for function {owner}::{name}")
            pre_seen = True
            current_contract = "pre"
            published.append(raw_line)
            continue
        if raw_line == "**Postconditions:**":
            if result_type is None or post_seen:
                raise BuildError(f"misplaced or duplicate postconditions for function {owner}::{name}")
            if pre_seen and contract_content["pre"] == 0:
                raise BuildError(f"empty preconditions for function {owner}::{name}")
            post_seen = True
            current_contract = "post"
            published.append(raw_line)
            continue
        if raw_line.startswith(">"):
            if result_type is None:
                raise BuildError(f"return body precedes signature for function {owner}::{name}")
            if current_contract and contract_content[current_contract] == 0:
                raise BuildError(
                    f"empty {current_contract}conditions for function {owner}::{name}"
                )
            body_started = True
            body_lines.append(raw_line)
            published.append(raw_line)
            continue
        if not raw_line:
            published.append(raw_line)
            continue
        if current_contract is not None:
            if raw_line.startswith("- ") or raw_line.startswith("  "):
                contract_content[current_contract] += int(bool(raw_line.strip()))
                published.append(raw_line)
                continue
        raise BuildError(
            f"unsupported function metadata or prose for {owner}::{name}: {raw_line!r}"
        )

    if source is None or category is None or result_type is None:
        raise BuildError(f"function {owner}::{name} is missing required metadata")
    if pre_seen and contract_content["pre"] == 0:
        raise BuildError(f"empty preconditions for function {owner}::{name}")
    if post_seen and contract_content["post"] == 0:
        raise BuildError(f"empty postconditions for function {owner}::{name}")
    nonempty_body = [line for line in body_lines if line.lstrip("> ").strip()]
    if not nonempty_body or not nonempty_body[0].startswith("> The function returns"):
        raise BuildError(f"function {owner}::{name} has no rendered return body")
    if nonempty_body[-1].rstrip()[-1:] not in {".", "!", "?"}:
        raise BuildError(f"function {owner}::{name} return body is malformed prose")
    rendered = re.sub(r"\n{3,}", "\n\n", "\n".join(published)).strip() + "\n"
    return rendered, FunctionRecord(
        owner=owner,
        name=name,
        category=category,
        inputs=tuple(inputs),
        result_type=result_type,
        trace_ids=traces,
        reads=reads,
        has_preconditions=pre_seen,
        has_postconditions=post_seen,
    )


def parse_snl_functions(
    lines: list[str],
) -> tuple[str, tuple[FunctionRecord, ...], frozenset[int]]:
    owner: str | None = None
    rendered: list[str] = []
    records: list[FunctionRecord] = []
    consumed: set[int] = set()
    seen: set[str] = set()
    index = 0
    while index < len(lines):
        owner_match = _OWNER.match(lines[index])
        if owner_match:
            owner = owner_match.group(2)
            index += 1
            continue
        function_match = _FUNCTION.match(lines[index])
        if not function_match:
            index += 1
            continue
        if owner is None:
            raise BuildError("SNL function appears before a contract owner")
        name = function_match.group(1)
        identity = f"{owner}::{name}"
        if identity in seen:
            raise BuildError(f"duplicate owner-qualified SNL function: {identity}")
        seen.add(identity)
        end = index + 1
        while end < len(lines) and not re.match(r"^#{2,3} ", lines[end]):
            end += 1
        block_text, record = _parse_function_block(
            owner, name, lines[index + 1 : end]
        )
        rendered.append(block_text.rstrip())
        records.append(record)
        consumed.update(range(index, end))
        index = end
    return "\n\n".join(rendered).strip() + ("\n" if rendered else ""), tuple(records), frozenset(consumed)


def parse_snl_states(
    lines: list[str], consumed_function_lines: frozenset[int]
) -> tuple[str, tuple[StateRecord, ...], frozenset[int]]:
    owner: str | None = None
    rendered: list[str] = []
    records: list[StateRecord] = []
    consumed: set[int] = set(consumed_function_lines)
    seen: set[str] = set()
    for index, line in enumerate(lines):
        if index in consumed_function_lines:
            continue
        owner_match = _OWNER.match(line)
        if owner_match:
            owner = owner_match.group(2)
            continue
        state_match = _STATE.match(line)
        if not state_match:
            continue
        if owner is None:
            raise BuildError("SNL state declaration appears before a contract owner")
        name, declared_type = state_match.groups()
        identity = f"{owner}::{name}"
        if identity in seen:
            raise BuildError(f"duplicate owner-qualified SNL state: {identity}")
        seen.add(identity)
        records.append(StateRecord(owner, name, declared_type))
        rendered.append(f"### State `{identity}`\n\n{line}")
        consumed.add(index)
    return "\n\n".join(rendered).strip() + ("\n" if rendered else ""), tuple(records), frozenset(consumed)


def humanize_identifier(value: str) -> str:
    value = value.strip()
    numeric_range = re.fullmatch(r"(-?\d+)\.\.(-?\d+)", value)
    if numeric_range:
        return f"{numeric_range.group(1)} through {numeric_range.group(2)}"
    if "::" in value:
        value = value.split("::")[-1]
    parts = value.split(".")
    if len(parts) == 2 and parts[0][:1].isupper() and parts[1][:1].isupper():
        value = parts[1]
    elif len(parts) == 2 and parts[1] == "degrees_celsius":
        receiver = humanize_identifier(parts[0])
        return f"{receiver} in degrees Celsius"
    else:
        value = " ".join(parts)
    value = value.removesuffix("_i")
    words = value.replace("_", " ").split()
    acronyms = {"ap": "AP", "fcs": "FCS", "fci": "FCI", "fd": "FD"}
    title_words = {"celsius": "Celsius", "fahrenheit": "Fahrenheit"}
    return " ".join(
        acronyms.get(word.lower(), title_words.get(word.lower(), word)) for word in words
    )


def publication_inline(text: str, *, hide_numeric_storage_tags: bool = False) -> str:
    if hide_numeric_storage_tags:
        text = _TYPE_TAG.sub("", text)
    text = _CODE_SPAN.sub(lambda match: humanize_identifier(match.group(1)), text)
    return text


def parse_trace_ids(value: str) -> tuple[str, ...]:
    return tuple(re.findall(r"`([^`]+)`", value))


def publication_kind(kind: str) -> str:
    return {
        "Invariant": "Data invariant",
        "Assumption": "Environmental assumption",
        "Guarantee": "Required behavior",
        "Case": "Conditional behavior",
    }[kind]


def _publish_snl_clauses(
    text: str,
    consumed_function_lines: frozenset[int],
    *,
    hide_numeric_storage_tags: bool = False,
) -> tuple[str, list[ClauseRecord]]:
    lines = text.splitlines()
    output: list[str] = []
    records: list[ClauseRecord] = []
    owner: str | None = None
    phase: str | None = None
    current: dict[str, Any] | None = None
    seen_owner = False
    seen_formal_ids: set[str] = set()
    owner_has_clauses: set[str] = set()
    scanned_owner: str | None = None
    for line_index, line in enumerate(lines):
        if line_index in consumed_function_lines:
            continue
        match = _OWNER.match(line)
        if match:
            scanned_owner = match.group(2)
        elif scanned_owner is not None and _CLAUSE.match(line):
            owner_has_clauses.add(scanned_owner)
    emit_owner = False
    phase_modifies_seen = False

    def finish_current() -> None:
        nonlocal current
        if current is None:
            return
        if not current.get("source_seen"):
            raise BuildError(
                f"SNL clause {current['formal_id']!r} has no source metadata"
            )
        if not current.get("body_started"):
            raise BuildError(f"SNL clause {current['formal_id']!r} has no prose body")
        semantic_status = current.get("semantic_status")
        if semantic_status in {"tautology", "contradiction", "unreachable"}:
            raise BuildError(
                f"SNL clause {current['formal_id']!r} has non-publishable "
                f"semantic status {semantic_status!r}"
            )
        prose = " ".join(current["prose_lines"])
        if current["prose_lines"][-1][-1:] not in {".", "!", "?"}:
            raise BuildError(
                f"SNL clause {current['formal_id']!r} does not end as a complete sentence"
            )
        lexical = _CODE_SPAN.sub("", prose).lower()
        words = re.findall(r"[a-z0-9]+", lexical)
        banned = {
            "should", "will", "must", "this", "these", "those", "its",
            "flexible", "easy", "sufficient", "safe", "adequate", "accommodate",
            "usable", "appropriate", "fast", "portable", "small", "large",
            "maximize", "minimize", "robust", "quickly", "easily", "clearly",
        }
        prohibited = sorted(banned.intersection(words))
        if prohibited:
            raise BuildError(
                f"SNL clause {current['formal_id']!r} contains prohibited prose "
                f"word(s): {prohibited}"
            )
        banned_phrases = {
            "as appropriate", "etc.", "and/or", "but not limited to", "ad hoc",
            "user-friendly", "when required", "if required", "light-weight",
        }
        for phrase in sorted(banned_phrases):
            if phrase in lexical:
                raise BuildError(
                    f"SNL clause {current['formal_id']!r} contains prohibited "
                    f"prose phrase {phrase!r}"
                )
        expected_shall = 0 if current["kind"] == "Assumption" else 1
        shall_count = words.count("shall")
        if shall_count != expected_shall:
            raise BuildError(
                f"SNL clause {current['formal_id']!r} contains {shall_count} "
                f"normative 'shall' token(s); expected {expected_shall}"
            )
        records.append(
            ClauseRecord(
                formal_id=current["formal_id"],
                kind=current["kind"],
                owner=current["owner"],
                phase=current["phase"],
                trace_ids=tuple(current.get("trace_ids", ())),
                source=current.get("source"),
            )
        )
        current = None

    for line_index, raw_line in enumerate(lines):
        if line_index in consumed_function_lines:
            continue
        owner_match = _OWNER.match(raw_line)
        if owner_match:
            finish_current()
            seen_owner = True
            owner = owner_match.group(2)
            phase = None
            phase_modifies_seen = False
            emit_owner = owner in owner_has_clauses
            if emit_owner:
                owner_label = humanize_identifier(owner)
                output.extend([f"### Requirements for {owner_label}", ""])
            continue
        if not seen_owner:
            continue

        phase_match = _PHASE.match(raw_line)
        if phase_match:
            finish_current()
            if owner is None:
                raise BuildError("SNL phase appears before a contract owner")
            phase = phase_match.group(1).lower()
            phase_modifies_seen = False
            if emit_owner:
                output.extend([f"#### Contract clauses evaluated in the {phase} phase", ""])
            continue

        modifies_match = _MODIFIES.match(raw_line)
        if modifies_match:
            if current is not None or phase is None or phase_modifies_seen:
                raise BuildError("misplaced or duplicate SNL phase modifies declaration")
            _code_span_list(modifies_match.group(1), "phase modifies declaration")
            phase_modifies_seen = True
            if emit_owner:
                output.append(publication_inline(raw_line))
            continue

        clause_match = _CLAUSE.match(raw_line)
        if clause_match:
            if owner is None:
                raise BuildError("SNL clause appears before a contract owner")
            finish_current()
            expected_heading = "####" if phase is not None else "###"
            if clause_match.group(1) != expected_heading:
                raise BuildError(
                    "SNL clause heading depth does not match its owner/phase structure"
                )
            kind = clause_match.group(2)
            formal_id = clause_match.group(3)
            if formal_id in seen_formal_ids:
                raise BuildError(
                    f"SNL formal identifier is not globally unique: {formal_id!r}"
                )
            seen_formal_ids.add(formal_id)
            current = {
                "formal_id": formal_id,
                "kind": kind,
                "owner": owner,
                "phase": phase,
                "body_started": False,
                "source_seen": False,
                "trace_seen": False,
                "description_seen": False,
                "non_normative_note_kinds": set(),
                "prose_lines": [],
            }
            heading = "#####" if phase is not None else "####"
            # The resolved GUMBO identifier is the publication identifier.  Do
            # not introduce a second REQ-NNN namespace: downstream tooling can
            # use this exact token to join N back to SNL and the SysML model.
            output.extend(
                [f"{heading} `{formal_id}` — {publication_kind(kind)}", ""]
            )
            continue

        if _OTHER_FORMAL.match(raw_line):
            raise BuildError(
                "SNL publication does not support compositions, information "
                "flows, or composition properties"
            )
        if raw_line.startswith("#### Handler for ") or raw_line.startswith("##### Effective binding "):
            raise BuildError("SNL publication does not support handler/composition structure")
        if _FORMAL_HEADING.match(raw_line):
            raise BuildError(f"unsupported formal SNL heading: {raw_line!r}")

        trace_match = _TRACE_LINE.match(raw_line)
        if trace_match:
            if current is None:
                raise BuildError("SNL trace metadata appears outside a named clause")
            if current["body_started"]:
                raise BuildError("SNL trace metadata appears after clause prose")
            if current["trace_seen"]:
                raise BuildError(f"duplicate trace metadata for {current['formal_id']!r}")
            current["trace_seen"] = True
            current["trace_ids"] = parse_trace_ids(trace_match.group(1))
            continue
        source_match = _SOURCE_LINE.match(raw_line)
        if source_match:
            if current is not None:
                if current["body_started"]:
                    raise BuildError("SNL source metadata appears after clause prose")
                if current["source_seen"]:
                    raise BuildError(f"duplicate source metadata for {current['formal_id']!r}")
                current["source_seen"] = True
                current["source"] = source_match.group(1)
            continue
        description_match = _AUTHORED_DESCRIPTION_LINE.match(raw_line)
        if description_match:
            # An authored descriptor can disagree with the resolved formula.
            # It is retained only in exact SNL, never in publication N.
            if current is None:
                raise BuildError(
                    "SNL authored-description metadata appears outside a named clause"
                )
            if current["body_started"]:
                raise BuildError(
                    "SNL authored-description metadata appears after clause prose"
                )
            if current["description_seen"]:
                raise BuildError(
                    f"duplicate authored-description metadata for {current['formal_id']!r}"
                )
            if not description_match.group(1).strip():
                raise BuildError(
                    f"empty authored-description metadata for {current['formal_id']!r}"
                )
            current["description_seen"] = True
            continue
        note_match = _NON_NORMATIVE_NOTE_LINE.match(raw_line)
        if note_match:
            if current is None:
                raise BuildError(
                    "SNL semantic/quality metadata appears outside a named clause"
                )
            if current["body_started"]:
                raise BuildError(
                    "SNL semantic/quality metadata appears after clause prose"
                )
            note_kind = note_match.group(1)
            if note_kind in current["non_normative_note_kinds"]:
                raise BuildError(
                    f"duplicate {note_kind.lower()} metadata for "
                    f"{current['formal_id']!r}"
                )
            if not note_match.group(2).strip():
                raise BuildError(
                    f"empty {note_kind.lower()} metadata for "
                    f"{current['formal_id']!r}"
                )
            current["non_normative_note_kinds"].add(note_kind)
            if note_kind == "Semantic status":
                current["semantic_status"] = note_match.group(2).strip().lower()
            # Semantic and quality annotations describe the renderer's analysis,
            # not an obligation imposed by the resolved GUMBO clause.  Keep them
            # in exact SNL, but do not flatten them into publication N.
            continue
        if raw_line.startswith("- Function category:") or raw_line.startswith("- Specializes:"):
            raise BuildError("unsupported formal metadata in publication SNL")
        if current is None and raw_line.strip() and raw_line != "No contract clauses are defined.":
            raise BuildError(f"unsupported formal SNL content outside a named clause: {raw_line!r}")
        if current is not None and raw_line.strip():
            if not current["source_seen"]:
                raise BuildError(
                    f"SNL clause {current['formal_id']!r} begins prose before source metadata"
                )
            if not raw_line.startswith(">"):
                raise BuildError(
                    f"unsupported content in SNL clause {current['formal_id']!r}: "
                    f"{raw_line!r}"
                )
            if raw_line.lstrip("> ").strip():
                current["body_started"] = True
                current["prose_lines"].append(raw_line.lstrip("> ").strip())
        output.append(
            publication_inline(
                raw_line, hide_numeric_storage_tags=hide_numeric_storage_tags
            )
        )

    finish_current()
    published = "\n".join(output)
    published = re.sub(r"\n{3,}", "\n\n", published).strip() + "\n"
    return published, records


def publish_snl_document(
    text: str, *, hide_numeric_storage_tags: bool = False
) -> SnlPublication:
    """Publish every supported function and inventory-backed clause exactly once."""

    validate_snl_header(text)
    lines = text.splitlines()
    functions_text, functions, consumed_functions = parse_snl_functions(lines)
    states_text, states, consumed = parse_snl_states(lines, consumed_functions)
    behavior_text, clauses = _publish_snl_clauses(
        text,
        consumed,
        hide_numeric_storage_tags=hide_numeric_storage_tags,
    )
    if not functions and not states and not clauses:
        raise BuildError(
            "SNL contains no supported functions, state declarations, or normative clauses"
        )
    published_function_ids = re.findall(
        r"^### `([^`]+)`$", functions_text, re.MULTILINE
    )
    if published_function_ids != [record.identity for record in functions]:
        raise BuildError("SNL function input/output accounting failed")
    published_clause_ids = re.findall(
        r"^#{4,5} `([^`]+)` — ", behavior_text, re.MULTILINE
    )
    if published_clause_ids != [record.formal_id for record in clauses]:
        raise BuildError("SNL clause input/output accounting failed")
    return SnlPublication(
        functions_text=functions_text,
        states_text=states_text,
        behavior_text=behavior_text,
        functions=functions,
        states=states,
        clauses=tuple(clauses),
    )


def publish_snl(
    text: str, *, hide_numeric_storage_tags: bool = False
) -> tuple[str, list[ClauseRecord]]:
    """Compatibility facade returning the complete publication and clauses."""

    publication = publish_snl_document(
        text, hide_numeric_storage_tags=hide_numeric_storage_tags
    )
    return publication.text, list(publication.clauses)


def record_to_json(
    record: ClauseRecord, resolved: InventoryRecord
) -> dict[str, Any]:
    if record.key != resolved.key:
        raise BuildError("cannot serialize requirement with mismatched resolved inventory")
    return {
        "formal_id": record.formal_id,
        "kind": record.kind,
        "owner": record.owner,
        "phase": record.phase,
        "trace_ids": list(record.trace_ids),
        "source": record.source,
        "source_uri": resolved.source_uri,
    }


def load_publication_inventory(path: Path) -> tuple[dict[str, Any], list[InventoryRecord]]:
    inventory = load_json(path)
    if inventory.get("schema_version") != INVENTORY_SCHEMA:
        raise BuildError(f"unsupported resolved publication inventory: {inventory.get('schema_version')!r}")
    if inventory.get("semantic_authority") != (
        "Sireum FrontEnd.typeCheck / resolved GclAnnexClauseInfo"
    ):
        raise BuildError("publication inventory does not declare the resolved Sireum FrontEnd authority")
    assertion = inventory.get("render_assertion")
    if not isinstance(assertion, dict) or assertion.get("status") != "passed":
        raise BuildError("publication inventory has no passed render assertion")
    if assertion.get("each_record_rendered_exactly_once") is not True:
        raise BuildError("publication inventory did not prove exact rendering coverage")
    raw_records = inventory.get("records")
    if not isinstance(raw_records, list) or not raw_records:
        raise BuildError("publication inventory has no records")
    if assertion.get("record_count") != len(raw_records):
        raise BuildError("publication inventory record count does not match its assertion")
    quality_audit = inventory.get("quality_audit")
    if not isinstance(quality_audit, dict) or quality_audit.get("schema_version") != (
        "snl-requirements-quality-audit-1.0.0"
    ):
        raise BuildError("publication inventory has no supported requirements-quality audit")
    automated = quality_audit.get("automated_checks")
    if not isinstance(automated, dict) or automated.get(
        "global_formal_id_uniqueness"
    ) != "passed" or automated.get("generated_prose_style") != "passed":
        raise BuildError("publication inventory requirements-quality checks did not pass")
    engineering_review = quality_audit.get("engineering_review")
    expected_review_fields = {
        "cross_clause_completeness",
        "conflicts_and_duplicates",
        "explicit_dont_care_coverage",
        "units_precision_tolerance_latency",
        "rationale_coverage",
        "verification_metadata",
        "bidirectional_trace_coverage",
        "abstraction_level",
    }
    if not isinstance(engineering_review, dict) or set(engineering_review) != expected_review_fields:
        raise BuildError("publication inventory quality audit has an incomplete review boundary")
    if any(value != "not_assessed" for value in engineering_review.values()):
        raise BuildError("publication inventory claims an unsupported engineering review result")

    records: list[InventoryRecord] = []
    seen: set[tuple[str, str | None, str, str]] = set()
    seen_formal_ids: set[str] = set()
    for expected_ordinal, raw in enumerate(raw_records, start=1):
        if not isinstance(raw, dict) or raw.get("ordinal") != expected_ordinal:
            raise BuildError("publication inventory ordinals must be contiguous and deterministic")
        owner = raw.get("owner")
        phase = raw.get("phase")
        kind = raw.get("kind")
        formal_id = raw.get("formal_id")
        scope = raw.get("scope")
        if not isinstance(owner, str) or not owner:
            raise BuildError("publication inventory record requires a resolved owner")
        if phase is not None and phase not in {"initialization", "integration", "compute"}:
            raise BuildError(f"SNL publication does not support phase {phase!r}")
        if kind not in {"Invariant", "Assumption", "Guarantee", "Case"}:
            raise BuildError(f"publication inventory has unsupported clause kind {kind!r}")
        if not isinstance(formal_id, str) or not formal_id:
            raise BuildError("publication inventory record requires a formal_id")
        if scope is not None:
            raise BuildError("SNL publication does not support scoped handler clauses")
        traces = raw.get("trace_ids")
        if not isinstance(traces, list) or not all(isinstance(value, str) for value in traces):
            raise BuildError("publication inventory trace_ids must be a string list")
        if len(set(traces)) != len(traces):
            raise BuildError("publication inventory trace_ids contain a duplicate")
        source_value = raw.get("source")
        source: str | None
        if source_value is None:
            raise BuildError("publication inventory record has no definitive source")
        elif isinstance(source_value, dict):
            uri = source_value.get("uri")
            line = source_value.get("line")
            column = source_value.get("column")
            if (
                not isinstance(uri, str)
                or not uri
                or ":" not in uri
                or not isinstance(line, int)
                or isinstance(line, bool)
                or line < 1
                or not isinstance(column, int)
                or isinstance(column, bool)
                or column < 1
            ):
                raise BuildError(
                    "publication inventory source requires a definitive URI and "
                    "positive line and column"
                )
            source = f"line {line}, column {column}"
        else:
            raise BuildError("publication inventory source must be an object")
        record = InventoryRecord(
            owner=owner,
            phase=phase,
            kind=kind,
            formal_id=formal_id,
            trace_ids=tuple(traces),
            source=source,
            source_uri=uri,
        )
        if record.key in seen:
            raise BuildError(f"duplicate resolved publication inventory key: {record.key}")
        seen.add(record.key)
        if formal_id in seen_formal_ids:
            raise BuildError(
                f"publication inventory formal identifier is not globally unique: {formal_id!r}"
            )
        seen_formal_ids.add(formal_id)
        records.append(record)
    if automated.get("definitive_source_uri_count") != len(records):
        raise BuildError("publication inventory quality audit does not cover every source URI")
    trace_count = sum(bool(record.trace_ids) for record in records)
    if automated.get("trace_annotated_record_count") != trace_count:
        raise BuildError("publication inventory quality audit trace count is inconsistent")
    return inventory, records


def verify_clause_inventory(
    clauses: list[ClauseRecord], inventory: list[InventoryRecord]
) -> dict[str, Any]:
    clause_keys = [record.key for record in clauses]
    inventory_keys = [record.key for record in inventory]
    formal_ids = [record.formal_id for record in clauses]
    if len(set(formal_ids)) != len(formal_ids):
        raise BuildError(
            "published SNL formal identifiers must be globally unique for direct model joins"
        )
    if len(set(clause_keys)) != len(clause_keys):
        raise BuildError("published SNL contains a duplicate clause key")
    if set(clause_keys) != set(inventory_keys):
        missing = [key for key in inventory_keys if key not in set(clause_keys)]
        extra = [key for key in clause_keys if key not in set(inventory_keys)]
        raise BuildError(
            f"published SNL does not cover the resolved inventory: missing={missing}, extra={extra}"
        )
    if clause_keys != inventory_keys:
        raise BuildError("published SNL clause order differs from the resolved inventory")
    for clause, resolved in zip(clauses, inventory, strict=True):
        if clause.trace_ids != resolved.trace_ids:
            raise BuildError(f"trace metadata differs for resolved clause {clause.key}")
        if clause.source != resolved.source:
            raise BuildError(f"source metadata differs for resolved clause {clause.key}")
    return {
        "status": "passed",
        "record_count": len(clauses),
        "exact_ordered_key_match": True,
        "visible_formal_identifier_match": True,
        "source_metadata_match": True,
        "trace_metadata_match": True,
    }


def publication_leakage_audit(visible_n: str) -> dict[str, Any]:
    """Reject evaluator coordinates, syntax, metadata, and process provenance."""

    forbidden = {
        "@trace": "trace annotation",
        "@generated-support": "generation annotation",
        "@gumbo-anchor": "reconstruction anchor",
        'language "gumbo"': "GUMBO language member",
        "compute_cases": "GUMBO syntax",
        "snl_style_version": "SNL parser metadata",
        "semantic_input": "SNL parser metadata",
        "frontend.typecheck": "Sireum parser metadata",
        "gclannexclauseinfo": "Sireum parser metadata",
        "hamr_sysml_parser_version": "Sireum parser metadata",
        "sireum_version": "Sireum parser metadata",
        "generation process": "generation-process provenance",
        "model agent": "generation-process provenance",
        "visualization agent": "generation-process provenance",
        "frozen seed": "generation-input provenance",
    }
    lower = visible_n.lower()
    leaked = [label for fragment, label in forbidden.items() if fragment in lower]
    if re.search(r"(?im)^- Source:\s*line\s+[0-9]+", visible_n):
        leaked.append("SNL source coordinates")
    if re.search(r"(?im)^- Trace IDs:", visible_n):
        leaked.append("SNL trace metadata")
    if leaked:
        raise BuildError("visible N leaks hidden material: " + "; ".join(sorted(set(leaked))))
    return {"status": "passed", "forbidden_fragment_count": len(forbidden)}


def build(
    model_path: Path,
    abstract_path: Path,
    snl_path: Path,
    inventory_path: Path,
    *,
    sireum_home: Path | None = None,
    verify_projection: bool = True,
) -> tuple[str, str, dict[str, Any]]:
    """Build N and M-star directly from the authoritative source artifacts."""

    for path in (model_path, abstract_path, snl_path, inventory_path):
        if not path.is_file():
            raise BuildError(f"required input is not a file: {path}")
    abstract_text = read_text(abstract_path)
    snl_text = read_text(snl_path)
    resolved_inventory, inventory_records = load_publication_inventory(inventory_path)
    title, context_text, paragraph_decisions = publish_context(abstract_text)
    publication = publish_snl_document(snl_text)
    coverage = verify_clause_inventory(list(publication.clauses), inventory_records)
    visible_n = f"# {title}\n\n{context_text}\n{publication.text}"
    audit = publication_leakage_audit(visible_n)

    from sysml_tools.gumbo import (
        project_contract_free_model,
        resolve_sireum_toolchain,
    )

    toolchain = resolve_sireum_toolchain(sireum_home)
    try:
        projected_m_star, projection_evidence = project_contract_free_model(
            model_path, toolchain
        )
    except (OSError, ValueError) as exc:
        raise BuildError(str(exc)) from exc

    model_equivalence: dict[str, Any] = {"status": "deferred-to-corpus-batch"}
    if verify_projection:
        from equiv_checker.model_gate import (
            ModelGateError,
            compare_model_fingerprints,
            fingerprint_models,
        )

        try:
            with tempfile.TemporaryDirectory(prefix="publisher-m-star-") as temporary:
                staged = Path(temporary) / TRACE_BLIND_MODEL_NAME
                staged.write_text(projected_m_star, encoding="utf-8")
                oracle_fingerprint, m_star_fingerprint = fingerprint_models(
                    (model_path, staged),
                    sireum_home=toolchain.home,
                    timeout=300,
                )
                comparison = compare_model_fingerprints(
                    oracle_fingerprint, m_star_fingerprint
                )
                if not comparison.matches:
                    raise BuildError(
                        "oracle-minus-GUMBO and M-star resolved AIR differ"
                    )
                model_equivalence = {
                    "status": "passed",
                    "policy": oracle_fingerprint.parser,
                    "resolved_air_sha256": oracle_fingerprint.canonical_ast_sha256,
                }
        except ModelGateError as exc:
            raise BuildError(f"could not verify M-star resolved AIR: {exc}") from exc

    manifest: dict[str, Any] = {
        "schema_version": MANIFEST_SCHEMA,
        "builder_version": BUILDER_VERSION,
        "semantic_authority": resolved_inventory["semantic_authority"],
        "snl_style_version": SNL_STYLE_VERSION,
        "context_policy": {
            "selected_prefixes": [
                "NEED-", "PURPOSE-", "GOAL-", "CTX-", "MON-", "CTRL-",
                "RISK-", "HAZARD-", "MODE-", "ASM-",
            ],
            "paragraph_decisions": paragraph_decisions,
        },
        "functions": [
            {
                "identity": record.identity,
                "category": record.category,
                "inputs": list(record.inputs),
                "result_type": record.result_type,
                "reads": list(record.reads),
                "has_preconditions": record.has_preconditions,
                "has_postconditions": record.has_postconditions,
            }
            for record in publication.functions
        ],
        "states": [
            {
                "identity": record.identity,
                "declared_type": record.declared_type,
            }
            for record in publication.states
        ],
        "requirements": [
            record_to_json(record, resolved)
            for record, resolved in zip(
                publication.clauses, inventory_records, strict=True
            )
        ],
        "resolved_publication_coverage": {
            **coverage,
            "function_input_count": len(publication.functions),
            "function_output_count": len(publication.functions),
            "each_function_emitted_exactly_once": True,
            "state_declaration_count": len(publication.states),
            "inventory_schema": resolved_inventory["schema_version"],
        },
        "leakage_audit": audit,
        "model_projection": {
            "logical_path": TRACE_BLIND_MODEL_NAME,
            "bytes": len(projected_m_star.encode("utf-8")),
            "sha256": sha256_text(projected_m_star),
            "resolved_air_equivalence": model_equivalence,
            **projection_evidence,
        },
        "output": {
            "logical_path": "N.md",
            "bytes": len(visible_n.encode("utf-8")),
            "sha256": sha256_text(visible_n),
        },
    }
    return visible_n, projected_m_star, manifest


def write_outputs(
    output_dir: Path,
    visible_n: str,
    projected_m_star: str,
    manifest: dict[str, Any],
    force: bool,
) -> None:
    n_path = output_dir / "N.md"
    model_path = output_dir / TRACE_BLIND_MODEL_NAME
    manifest_path = output_dir / "manifest.json"
    if not output_dir.exists():
        output_dir.mkdir(parents=True)
    elif not output_dir.is_dir():
        raise BuildError(f"output path is not a directory: {output_dir}")
    existing = [path for path in (n_path, model_path, manifest_path) if path.exists()]
    if existing and not force:
        raise BuildError("refusing to replace existing output; pass --force")
    n_path.write_text(visible_n, encoding="utf-8")
    model_path.write_text(projected_m_star, encoding="utf-8")
    manifest_path.write_text(
        json.dumps(manifest, indent=2, sort_keys=True, ensure_ascii=False) + "\n",
        encoding="utf-8",
    )


def verify(output_dir: Path) -> None:
    n_path = output_dir / "N.md"
    manifest_path = output_dir / "manifest.json"
    manifest = load_json(manifest_path)
    if manifest.get("schema_version") != MANIFEST_SCHEMA:
        raise BuildError("unsupported publication manifest schema")
    output = manifest.get("output")
    if not isinstance(output, dict):
        raise BuildError("manifest has no output record")
    data = n_path.read_bytes()
    if output.get("bytes") != len(data) or output.get("sha256") != sha256_bytes(data):
        raise BuildError("N.md does not match manifest output record")
    projection = manifest.get("model_projection")
    if not isinstance(projection, dict) or projection.get("logical_path") != TRACE_BLIND_MODEL_NAME:
        raise BuildError("manifest has no supported trace-blind model projection")
    model_data = (output_dir / TRACE_BLIND_MODEL_NAME).read_bytes()
    if projection.get("bytes") != len(model_data) or projection.get("sha256") != sha256_bytes(
        model_data
    ):
        raise BuildError("trace-blind M* does not match manifest projection record")
def parse_args(argv: Iterable[str] | None = None) -> argparse.Namespace:
    parser = argparse.ArgumentParser(description=__doc__)
    subparsers = parser.add_subparsers(dest="command", required=True)
    build_parser = subparsers.add_parser("build", help="build N.md and M-star.sysml")
    build_parser.add_argument("--model", type=Path, required=True)
    build_parser.add_argument("--abstract", type=Path, required=True)
    build_parser.add_argument("--snl", type=Path, required=True)
    build_parser.add_argument("--inventory", type=Path, required=True)
    build_parser.add_argument("--output-dir", type=Path, required=True)
    build_parser.add_argument("--sireum-home", type=Path)
    build_parser.add_argument("--no-verify-projection", action="store_true")
    build_parser.add_argument("--force", action="store_true")
    verify_parser = subparsers.add_parser("verify", help="verify N.md against its manifest")
    verify_parser.add_argument("output_dir", type=Path)
    return parser.parse_args(argv)


def main(argv: Iterable[str] | None = None) -> int:
    args = parse_args(argv)
    try:
        if args.command == "build":
            visible_n, projected_m_star, manifest = build(
                args.model,
                args.abstract,
                args.snl,
                args.inventory,
                sireum_home=args.sireum_home,
                verify_projection=not args.no_verify_projection,
            )
            write_outputs(args.output_dir, visible_n, projected_m_star, manifest, args.force)
        else:
            verify(args.output_dir)
    except (BuildError, OSError) as exc:
        print(f"error: {exc}", file=sys.stderr)
        return 2
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
