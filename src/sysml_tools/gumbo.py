"""Sireum-certified GUMBO span discovery and contract-free projection.

Sireum's generated SysML parser is the only authority used to identify GUMBO
members.  This module deliberately performs no SysML owner discovery, contract
indexing, or reconstruction-anchor generation.  Python only applies the exact
parser spans and the explicitly presentation-only comment filter.
"""

from __future__ import annotations

import hashlib
import os
import re
import shutil
import subprocess
from dataclasses import dataclass
from pathlib import Path
from typing import Iterable


@dataclass(frozen=True)
class ParserSpan:
    start: int
    end: int
    kind: str


@dataclass(frozen=True)
class SireumToolchain:
    home: Path
    java: Path
    parser_jar: Path
    antlr_jar: Path
    parser_version: str
    antlr_version: str
    helper: Path

    def provenance(self) -> dict[str, str]:
        return {
            "boundary_authority": "sireum-hamr-sysml-antlr4-parse-tree",
            "parser_coordinate": (
                f"org.sireum:hamr-sysml-parser:{self.parser_version}"
            ),
            "antlr_runtime_coordinate": (
                f"org.antlr:antlr4-runtime:{self.antlr_version}"
            ),
            "parse_rule": "entryRuleRootNamespace",
            "selected_context": (
                "RuleTextualRepresentationContext with ruleGumboLibrary or "
                "ruleGumboSubclause"
            ),
            "span_index_unit": "Unicode code point (zero-based, end-exclusive)",
            "bridge": "src/sysml_tools/tools/SysmlGumboSpans.java",
            "bridge_sha256": hashlib.sha256(self.helper.read_bytes()).hexdigest(),
        }


def _artifact_version(path: Path, prefix: str) -> str:
    if not path.name.startswith(prefix) or not path.name.endswith(".jar"):
        raise ValueError(f"unexpected artifact filename: {path.name}")
    return path.name[len(prefix) : -len(".jar")]


def resolve_sireum_toolchain(
    sireum_home: Path | None = None,
) -> SireumToolchain:
    """Locate the parser artifacts shipped by a local Sireum installation."""

    if sireum_home is None:
        configured = os.environ.get("SIREUM_HOME")
        if configured:
            sireum_home = Path(configured)
        else:
            executable = shutil.which("sireum")
            if executable:
                sireum_home = Path(executable).resolve().parent.parent
    if sireum_home is None:
        raise FileNotFoundError(
            "Sireum was not found; set SIREUM_HOME or pass --sireum-home"
        )
    home = sireum_home.expanduser().resolve()
    platform = "win" if os.name == "nt" else "linux"
    executable = "java.exe" if os.name == "nt" else "java"
    java = home / "bin" / platform / "java" / "bin" / executable
    parser_jars = sorted(
        path
        for path in (home / "lib" / "cache").glob("**/hamr-sysml-parser-*.jar")
        if not path.name.endswith(("-sources.jar", "-javadoc.jar"))
    )
    antlr_jars = sorted(
        path
        for path in (home / "lib" / "cache").glob("**/antlr4-runtime-*.jar")
        if not path.name.endswith(("-sources.jar", "-javadoc.jar"))
    )
    helper = Path(__file__).resolve().parent / "tools" / "SysmlGumboSpans.java"
    missing = [str(path) for path in (java, helper) if not path.is_file()]
    if not parser_jars:
        missing.append("hamr-sysml-parser runtime JAR")
    if not antlr_jars:
        missing.append("antlr4-runtime JAR")
    if missing:
        raise FileNotFoundError(
            "incomplete Sireum parser toolchain: " + ", ".join(missing)
        )
    parser_jar = parser_jars[-1]
    antlr_jar = antlr_jars[-1]
    return SireumToolchain(
        home=home,
        java=java,
        parser_jar=parser_jar,
        antlr_jar=antlr_jar,
        parser_version=_artifact_version(parser_jar, "hamr-sysml-parser-"),
        antlr_version=_artifact_version(antlr_jar, "antlr4-runtime-"),
        helper=helper,
    )


def parser_spans(model: Path, toolchain: SireumToolchain) -> list[ParserSpan]:
    """Return only GUMBO member spans recognized by Sireum's SysML parser."""

    classpath = os.pathsep.join(
        (str(toolchain.parser_jar), str(toolchain.antlr_jar))
    )
    completed = subprocess.run(
        [
            str(toolchain.java),
            "-XX:-UsePerfData",
            "-cp",
            classpath,
            str(toolchain.helper),
            str(model),
        ],
        check=False,
        capture_output=True,
        text=True,
        encoding="utf-8",
    )
    if completed.returncode != 0:
        detail = (
            completed.stderr.strip()
            or completed.stdout.strip()
            or "no parser diagnostic"
        )
        raise ValueError(f"Sireum HAMR SysML parse failed for {model}: {detail}")
    spans: list[ParserSpan] = []
    previous_end = 0
    for line in completed.stdout.splitlines():
        fields = line.split("\t")
        if len(fields) != 3:
            raise ValueError(f"unexpected parser bridge output: {line!r}")
        span = ParserSpan(int(fields[0]), int(fields[1]), fields[2])
        if (
            span.kind not in {"library", "subclause"}
            or span.start < previous_end
            or span.end <= span.start
        ):
            raise ValueError(f"invalid or overlapping parser span: {span}")
        spans.append(span)
        previous_end = span.end
    return spans


def erase_gumbo_spans(source: str, spans: Iterable[ParserSpan]) -> str:
    """Erase only parser-certified GUMBO spans while preserving line layout."""

    cursor = 0
    pieces: list[str] = []
    for span in spans:
        if span.kind not in {"library", "subclause"}:
            raise ValueError(f"unsupported parser span kind: {span.kind}")
        if span.start < cursor or span.end <= span.start or span.end > len(source):
            raise ValueError(f"invalid or overlapping parser span: {span}")
        member = source[span.start : span.end]
        if '"GUMBO"' not in member or "/*{" not in member or not member.endswith("}*/"):
            raise ValueError(
                f"parser span is not a complete GUMBO textual representation: {span}"
            )
        pieces.append(source[cursor : span.start])
        pieces.append("".join("\n" if char == "\n" else " " for char in member))
        cursor = span.end
    pieces.append(source[cursor:])
    return "".join(pieces)


_PRESENTATION_COMMENT = re.compile(
    r"^[ \t]*//[ \t]*@(trace|generated-support)\b.*(?:\r?\n|\r)?$"
)


def strip_presentation_comments(source: str) -> tuple[str, dict[str, int]]:
    """Remove only full-line trace and generated-support comments."""

    counts = {"trace": 0, "generated-support": 0}
    retained: list[str] = []
    for line in source.splitlines(keepends=True):
        match = _PRESENTATION_COMMENT.match(line)
        if match:
            counts[match.group(1)] += 1
        else:
            retained.append(line)
    result = "".join(retained)
    for marker in counts:
        if f"@{marker}" in result:
            raise ValueError(
                f"presentation projection retains @{marker} outside a full-line comment"
            )
    return result, counts


def project_contract_free_model(
    model: Path, toolchain: SireumToolchain
) -> tuple[str, dict[str, object]]:
    """Build M-star from parser spans, then apply the presentation transform."""

    source = model.read_text(encoding="utf-8")
    spans = parser_spans(model, toolchain)
    erased = erase_gumbo_spans(source, spans)
    projected, comments = strip_presentation_comments(erased)
    forbidden = ('language "GUMBO"', "@trace", "@generated-support", "@gumbo-anchor")
    remaining = [token for token in forbidden if token in projected]
    if remaining:
        raise ValueError(f"contract-free projection retains forbidden material: {remaining}")
    return projected, {
        "parser_span_count": len(spans),
        "removed_presentation_comments": comments,
        "authority": toolchain.provenance(),
    }
