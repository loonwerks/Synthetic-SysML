#!/usr/bin/env python3
"""Historical evaluator-owned launcher for one migrated SCP run.

Never copy this file into the candidate repository.  It supplies the security
profile on the command line, uses a run-local Codex home, and writes transcripts
only under evaluator/.  Candidate commands cannot read this directory.
"""

from __future__ import annotations

import argparse
import errno
import hashlib
import json
import os
import shutil
import shlex
import socket
import subprocess
import sys
import time
from datetime import datetime, timezone
from pathlib import Path
from typing import Any, Iterable


SCRIPT = Path(__file__).resolve()
PROTOCOL = SCRIPT.parent
CAMPAIGN_ROOT = PROTOCOL.parent
REPO_ROOT = CAMPAIGN_ROOT.parents[1]
RUN_ID = os.environ.get("SCP_RUN_ID", "_unset")
RUN_ROOT = CAMPAIGN_ROOT / "runs" / RUN_ID
EVALUATOR = RUN_ROOT / "evaluation"
CANDIDATE = RUN_ROOT / "candidate"
CONFIG_PATH = EVALUATOR / "codex-launch.json"
RUNTIME = EVALUATOR / ".runtime"
CODEX_HOME_ROOT = Path.home() / ".cache" / "scp-codex-runs"
CODEX_HOME = CODEX_HOME_ROOT / hashlib.sha256(
    str(RUN_ROOT).encode("utf-8")
).hexdigest()[:20]
LEGACY_CODEX_HOME = RUNTIME / "codex-home"
TRANSCRIPTS = EVALUATOR / "transcripts"
PARALLEL_TRANSITION_PAUSE = Path("/tmp/scp-parallel-transition.pause")


class LaunchError(RuntimeError):
    pass


def prepare_sireum_proxy(config: dict[str, Any]) -> Path:
    """Create a Sireum entry point that serializes every campaign invocation."""

    real_home = Path(config["sireum_home"])
    proxy_home = real_home / "bin" / ".scp-logika-gates"
    proxy_bin = proxy_home / "bin"
    lock_dir = real_home / "bin" / ".scp-serialized" / "lock"
    proxy_bin.mkdir(mode=0o700, parents=True, exist_ok=True)
    lock_dir.mkdir(mode=0o500, exist_ok=True)
    wrapper = proxy_bin / "sireum"
    content = "\n".join(
        (
            "#!/usr/bin/env bash",
            "set -eu",
            f"exec 9<{shlex.quote(str(lock_dir))}",
            "/usr/bin/flock -x 9",
            f"export SIREUM_HOME={shlex.quote(str(real_home))}",
            f"exec {shlex.quote(str(real_home / 'bin' / 'sireum'))} \"$@\"",
            "",
        )
    )
    if wrapper.exists() and wrapper.read_text(encoding="utf-8") != content:
        raise LaunchError(f"refusing to overwrite changed Sireum proxy: {wrapper}")
    if not wrapper.exists():
        wrapper.write_text(content, encoding="utf-8")
        wrapper.chmod(0o500)
    return proxy_home


def load_config() -> dict[str, Any]:
    try:
        value = json.loads(CONFIG_PATH.read_text(encoding="utf-8"))
    except (OSError, json.JSONDecodeError) as exc:
        raise LaunchError(f"cannot load {CONFIG_PATH}: {exc}") from exc
    if value.get("schema_version") != "scp-codex-isolation-1.0.0":
        raise LaunchError("unsupported or missing Codex isolation schema")
    if CANDIDATE.resolve() != Path(value["candidate"]).resolve():
        raise LaunchError("candidate path differs from the frozen launch configuration")
    codex_binary = Path(value["codex_binary"])
    if not codex_binary.is_file() or not os.access(codex_binary, os.X_OK):
        raise LaunchError("configured Codex binary is missing or not executable")
    for entry in value["forbidden_probe_paths"]:
        if not Path(entry["path"]).exists():
            raise LaunchError(f"probe target disappeared: {entry['label']}")
    return value


def sha256_file(path: Path) -> str:
    return hashlib.sha256(path.read_bytes()).hexdigest()


def toml_string(value: str) -> str:
    return json.dumps(value)


def inline_table(values: dict[str, str]) -> str:
    return "{" + ",".join(f"{toml_string(k)}={toml_string(v)}" for k, v in values.items()) + "}"


def prepare_direct_model_catalog(config: dict[str, Any]) -> Path:
    """Freeze the pinned CLI's bundled model metadata to the original direct shell mode.

    Terra's live catalog switched to ``code_mode_only`` after this campaign had
    begun.  Nested code-mode sandboxes cannot initialize in this environment,
    while the original successful trials used Codex's direct command tool.  The
    supported ``model_catalog_json`` override keeps the model and instructions
    from the pinned CLI and changes only that tool-mode selector.
    """

    RUNTIME.mkdir(mode=0o700, parents=True, exist_ok=True)
    destination = RUNTIME / "terra-direct-model-catalog.json"
    completed = subprocess.run(
        [config["codex_binary"], "debug", "models", "--bundled"],
        cwd=CANDIDATE,
        env={
            "PATH": os.environ.get("PATH", "/usr/local/bin:/usr/bin:/bin"),
            "HOME": str(CANDIDATE / ".home"),
            "CODEX_HOME": str(CODEX_HOME),
            "LANG": "C.UTF-8",
            "LC_ALL": "C.UTF-8",
        },
        text=True,
        stdout=subprocess.PIPE,
        stderr=subprocess.PIPE,
        check=False,
    )
    if completed.returncode != 0:
        raise LaunchError(
            "cannot load pinned Codex model catalog: "
            + (completed.stderr.strip() or f"exit {completed.returncode}")
        )
    try:
        bundled = json.loads(completed.stdout)
        model = next(
            entry for entry in bundled["models"] if entry.get("slug") == config["model"]
        )
    except (json.JSONDecodeError, KeyError, StopIteration, TypeError) as exc:
        raise LaunchError("pinned Codex catalog does not contain the configured model") from exc
    model["tool_mode"] = "direct"
    content = json.dumps({"models": [model]}, indent=2, sort_keys=True) + "\n"
    if not destination.exists() or destination.read_text(encoding="utf-8") != content:
        temporary = destination.with_suffix(".tmp")
        temporary.write_text(content, encoding="utf-8")
        temporary.replace(destination)
    return destination


def permission_overrides(config: dict[str, Any]) -> list[str]:
    profile = config["permission_profile"]
    sireum_home = Path(config["sireum_home"])
    proxy_home = prepare_sireum_proxy(config)
    candidate = Path(config["candidate"])
    shell_values = {
        "HOME": str(candidate / ".home"),
        "TMPDIR": str(candidate / ".tmp"),
        "JAVA_TOOL_OPTIONS": f"-Djava.io.tmpdir={candidate / '.tmp'}",
        "SIREUM_HOME": str(proxy_home),
        "PATH": f"{proxy_home / 'bin'}:{sireum_home / 'bin'}:/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin",
        "LANG": "C.UTF-8",
        "LC_ALL": "C.UTF-8",
    }
    filesystem = {
        ":root": "deny",
        ":minimal": "read",
        ":workspace_roots": "write",
        ":slash_tmp": "deny",
        str(candidate.parent): "deny",
        "/proc": "deny",
        str(sireum_home / "bin"): "read",
        str(sireum_home / "lib"): "read",
        str(proxy_home): "read",
        str(Path(config["codex_binary"]).parent): "read",
    }
    values = {
        "approval_policy": '"never"',
        "allow_login_shell": "false",
        "web_search": '"disabled"',
        "history.persistence": '"none"',
        "agents.enabled": "false",
        "apps._default.enabled": "false",
        "apps._default.open_world_enabled": "false",
        "feedback.enabled": "false",
        "memories.generate_memories": "false",
        "features.skill_mcp_dependency_install": "false",
        "model_catalog_json": toml_string(str(prepare_direct_model_catalog(config))),
        "shell_environment_policy.inherit": '"none"',
        "shell_environment_policy.ignore_default_excludes": "false",
        "shell_environment_policy.experimental_use_profile": "false",
        "shell_environment_policy.set": inline_table(shell_values),
        "default_permissions": toml_string(profile),
        f"permissions.{profile}.description": toml_string("Frozen SCP candidate; no external context"),
        f"permissions.{profile}.extends": '":workspace"',
        f"permissions.{profile}.filesystem": inline_table(filesystem),
        f"permissions.{profile}.network.enabled": "false",
    }
    result: list[str] = []
    for key, value in values.items():
        result.extend(("-c", f"{key}={value}"))
    return result


def prepare_codex_home(auth_source: Path | None) -> dict[str, str]:
    RUNTIME.mkdir(mode=0o700, parents=True, exist_ok=True)
    prepare_codex_storage()
    if auth_source is None:
        source_home = Path(os.environ.get("CODEX_HOME", Path.home() / ".codex"))
        auth_source = source_home / "auth.json"
    destination = CODEX_HOME / "auth.json"
    if auth_source.is_file() and not destination.exists():
        destination.symlink_to(auth_source.resolve())
    if not destination.exists():
        raise LaunchError(
            "no file-based Codex authentication found; provide --auth-source"
        )
    return clean_host_environment()


def prepare_codex_storage() -> None:
    """Move persistent rollout state off /tmp while preserving existing sessions."""

    CODEX_HOME.mkdir(mode=0o700, parents=True, exist_ok=True)
    marker = CODEX_HOME / ".scp-legacy-migration-complete"
    if marker.exists():
        return
    if LEGACY_CODEX_HOME.is_dir():
        shutil.copytree(
            LEGACY_CODEX_HOME,
            CODEX_HOME,
            dirs_exist_ok=True,
            symlinks=True,
            ignore=shutil.ignore_patterns("tmp", "auth.json"),
        )
    marker.write_text(str(LEGACY_CODEX_HOME) + "\n", encoding="utf-8")


def clean_host_environment() -> dict[str, str]:
    """Give the Codex host only runtime values, never inherited secrets/context."""

    values = {
        "PATH": os.environ.get("PATH", "/usr/local/bin:/usr/bin:/bin"),
        "HOME": str(CANDIDATE / ".home"),
        "CODEX_HOME": str(CODEX_HOME),
        "LANG": "C.UTF-8",
        "LC_ALL": "C.UTF-8",
    }
    # These affect TLS routing for the model service but carry no benchmark data.
    for name in ("HTTP_PROXY", "HTTPS_PROXY", "ALL_PROXY", "NO_PROXY", "SSL_CERT_FILE", "SSL_CERT_DIR"):
        if name in os.environ:
            values[name] = os.environ[name]
    return values


def common_exec(config: dict[str, Any]) -> list[str]:
    return [
        config["codex_binary"],
        "exec",
        "--json",
        "--ignore-user-config",
        "--ignore-rules",
        "--strict-config",
        "--skip-git-repo-check",
        "--cd",
        str(CANDIDATE),
        "--model",
        config["model"],
        "-c",
        f'model_reasoning_effort={toml_string(config["reasoning_effort"])}',
        "-c",
        f'service_tier={toml_string(config["service_tier"])}',
        *permission_overrides(config),
    ]


def next_transcript(prefix: str) -> Path:
    TRANSCRIPTS.mkdir(parents=True, exist_ok=True)
    index = 1
    while (TRANSCRIPTS / f"{prefix}-{index:02d}.jsonl").exists():
        index += 1
    return TRANSCRIPTS / f"{prefix}-{index:02d}.jsonl"


def write_probe_report(status: str, probe_output: str, toolchain_output: str | None) -> Path:
    reports = EVALUATOR / "probe-reports"
    reports.mkdir(parents=True, exist_ok=True)
    index = 1
    while (reports / f"probe-{index:02d}.json").exists():
        index += 1
    destination = reports / f"probe-{index:02d}.json"
    destination.write_text(
        json.dumps(
            {
                "schema_version": "scp-isolation-probe-1.0.0",
                "status": status,
                "timestamp": datetime.now(timezone.utc).isoformat().replace("+00:00", "Z"),
                "probe_output": probe_output,
                "toolchain_output": toolchain_output,
            },
            indent=2,
            sort_keys=True,
        )
        + "\n",
        encoding="utf-8",
    )
    return destination


def stream_run(command: list[str], prompt: str, env: dict[str, str], transcript: Path) -> int:
    session_id: str | None = None
    transcript.with_suffix(".prompt.txt").write_text(prompt, encoding="utf-8")
    with transcript.open("x", encoding="utf-8") as output:
        process = subprocess.Popen(
            command,
            cwd=CANDIDATE,
            env=env,
            stdin=subprocess.PIPE,
            stdout=subprocess.PIPE,
            stderr=subprocess.STDOUT,
            text=True,
            bufsize=1,
        )
        assert process.stdin and process.stdout
        process.stdin.write(prompt)
        process.stdin.close()
        for line in process.stdout:
            output.write(line)
            output.flush()
            print(line, end="")
            try:
                event = json.loads(line)
            except json.JSONDecodeError:
                continue
            if event.get("type") == "thread.started" and isinstance(event.get("thread_id"), str):
                session_id = event["thread_id"]
        status = process.wait()
    if session_id:
        (EVALUATOR / "last-session-id.txt").write_text(session_id + "\n", encoding="utf-8")
    print(f"Transcript: {transcript}", file=sys.stderr)
    return status


def start(config: dict[str, Any], prompt_file: Path, auth_source: Path | None) -> int:
    prompt = validated_prompt(prompt_file, config)
    command = [*common_exec(config), "-"]
    return stream_run(command, prompt, prepare_codex_home(auth_source), next_transcript("turn"))


def resume(config: dict[str, Any], prompt_file: Path, session_id: str | None, auth_source: Path | None) -> int:
    if session_id is None:
        marker = EVALUATOR / "last-session-id.txt"
        if not marker.is_file():
            raise LaunchError("no session ID supplied and no prior session marker exists")
        session_id = marker.read_text(encoding="utf-8").strip()
    prompt = validated_prompt(prompt_file, config)
    base = common_exec(config)
    # Resume has its own argument parser and no --cd option; cwd remains frozen.
    command = [base[0], "exec", "resume", *base[2:]]
    cd_index = command.index("--cd")
    del command[cd_index : cd_index + 2]
    command.extend((session_id, "-"))
    return stream_run(command, prompt, prepare_codex_home(auth_source), next_transcript("resume"))


def validated_prompt(prompt_file: Path, config: dict[str, Any]) -> str:
    resolved = prompt_file.resolve()
    allowed_roots = (CANDIDATE.resolve(), (RUN_ROOT / "prompts").resolve())
    if not any(resolved == root or resolved.is_relative_to(root) for root in allowed_roots):
        raise LaunchError("prompt files must come from candidate/ or evaluator/prompts/")
    prompt = resolved.read_text(encoding="utf-8")
    for entry in config["forbidden_probe_paths"]:
        if entry["path"] in prompt:
            raise LaunchError(f"prompt contains a forbidden evaluator/source path: {entry['label']}")
    return prompt


def sandbox_child_environment(config: dict[str, Any], command: list[str]) -> list[str]:
    candidate = Path(config["candidate"])
    sireum_home = Path(config["sireum_home"])
    proxy_home = prepare_sireum_proxy(config)
    return [
        "/usr/bin/env",
        "-i",
        f"HOME={candidate / '.home'}",
        f"TMPDIR={candidate / '.tmp'}",
        f"JAVA_TOOL_OPTIONS=-Djava.io.tmpdir={candidate / '.tmp'}",
        f"SIREUM_HOME={proxy_home}",
        f"PATH={proxy_home / 'bin'}:{sireum_home / 'bin'}:/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin",
        "LANG=C.UTF-8",
        "LC_ALL=C.UTF-8",
        *command,
    ]


def probe_environment(config: dict[str, Any], probe_script: Path) -> list[str]:
    candidate = Path(config["candidate"])
    return sandbox_child_environment(
        config,
        [
            f"SCP_PROBE_CONFIG={candidate / '.tmp' / 'probe-config.json'}",
            sys.executable,
            str(probe_script),
        ],
    )


def run_probe(config: dict[str, Any], auth_source: Path | None) -> int:
    del auth_source  # The sandbox debug command does not contact the model service.
    candidate_tmp = CANDIDATE / ".tmp"
    candidate_tmp.mkdir(exist_ok=True)
    RUNTIME.mkdir(mode=0o700, parents=True, exist_ok=True)
    prepare_codex_storage()
    staged_probe = candidate_tmp / "sandbox-probe.py"
    staged_config = candidate_tmp / "probe-config.json"
    if staged_probe.exists() or staged_config.exists():
        raise LaunchError("refusing to overwrite an existing candidate probe artifact")
    shutil.copy2(PROTOCOL / "sandbox-probe.py", staged_probe)

    listener: socket.socket | None = None
    tcp_probe_port = 9
    host_network_preconfined = False
    try:
        listener = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
        listener.bind(("127.0.0.1", 0))
        listener.listen(1)
        tcp_probe_port = listener.getsockname()[1]
    except OSError as exc:
        if listener:
            listener.close()
            listener = None
        if exc.errno not in (errno.EPERM, errno.EACCES):
            raise
        host_network_preconfined = True
        print("HOST NETWORK ALREADY CONFINED; direct socket denial will be tested")
    # AF_UNIX paths are commonly limited to roughly 108 bytes. Dataset IDs can
    # be long, so keep the host-side denial probe at a short, collision-safe path.
    run_digest = hashlib.sha256(str(RUN_ROOT).encode("utf-8")).hexdigest()[:16]
    unix_socket = Path("/tmp") / f"scp-probe-{run_digest}.sock"
    unix_listener: socket.socket | None = None
    if hasattr(socket, "AF_UNIX") and not host_network_preconfined:
        try:
            unix_listener = socket.socket(socket.AF_UNIX, socket.SOCK_STREAM)
            unix_listener.bind(str(unix_socket))
            unix_listener.listen(1)
        except OSError as exc:
            if unix_listener:
                unix_listener.close()
                unix_listener = None
            if exc.errno not in (errno.EPERM, errno.EACCES):
                raise
            host_network_preconfined = True
            print("HOST UNIX SOCKETS ALREADY CONFINED; direct socket denial will be tested")

    probe_config = {
        "candidate": str(CANDIDATE),
        "allowed_read": str(CANDIDATE / "N.md"),
        "allowed_write": str(candidate_tmp / "allowed-write.txt"),
        "forbidden": config["forbidden_probe_paths"],
        "forbidden_writes": [
            {"label": "candidate-codex-config", "path": str(CANDIDATE / ".codex" / "config.toml")},
            {"label": "shared-sireum-aot", "path": str(Path(config["sireum_home"]) / "bin" / ".aot" / "train.log")},
            {"label": "sireum-launcher", "path": str(Path(config["sireum_home"]) / "bin" / "sireum")},
            {"label": "serialized-sireum-launcher", "path": str(prepare_sireum_proxy(config) / "bin" / "sireum")},
        ],
        "tcp_probe_port": tcp_probe_port,
        "unix_socket": str(unix_socket) if unix_listener else None,
        "host_network_preconfined": host_network_preconfined,
        "expected_environment": [
            "HOME", "TMPDIR", "JAVA_TOOL_OPTIONS", "SIREUM_HOME", "PATH", "LANG", "LC_ALL", "SCP_PROBE_CONFIG"
        ],
    }
    staged_config.write_text(json.dumps(probe_config, indent=2) + "\n", encoding="utf-8")

    env = clean_host_environment()
    profile = config["permission_profile"]
    sandbox_prefix = [
        config["codex_binary"],
        "sandbox",
        "-C",
        str(CANDIDATE),
        "-P",
        profile,
        *permission_overrides(config),
    ]
    command = [
        *sandbox_prefix,
        *probe_environment(config, staged_probe),
    ]
    try:
        completed = subprocess.run(
            command,
            cwd=CANDIDATE,
            env=env,
            text=True,
            stdout=subprocess.PIPE,
            stderr=subprocess.STDOUT,
            check=False,
        )
        print(completed.stdout or "", end="")
        if completed.returncode != 0:
            report = write_probe_report("failed", completed.stdout or "", None)
            print(f"Probe report: {report}", file=sys.stderr)
            return completed.returncode
        toolchain = subprocess.run(
            [
                *sandbox_prefix,
                *sandbox_child_environment(
                    config,
                    [
                        "sireum",
                        "hamr",
                        "sysml",
                        "tipe",
                        "--sourcepath",
                        ".:sysml-aadl-libraries",
                        "M-star.sysml",
                    ],
                ),
            ],
            cwd=CANDIDATE,
            env=env,
            text=True,
            stdout=subprocess.PIPE,
            stderr=subprocess.STDOUT,
            check=False,
        )
        print(toolchain.stdout or "", end="")
        if toolchain.returncode != 0:
            print("TOOLCHAIN ACCESS FAILED", file=sys.stderr)
            report = write_probe_report(
                "failed", completed.stdout or "", toolchain.stdout or ""
            )
            print(f"Probe report: {report}", file=sys.stderr)
            return toolchain.returncode
        load_config()
        print("TOOLCHAIN ACCESS PASSED")
        report = write_probe_report(
            "passed", completed.stdout or "", toolchain.stdout or ""
        )
        print(f"Probe report: {report}")
        return 0
    finally:
        if listener:
            listener.close()
        if unix_listener:
            unix_listener.close()
        for path in (staged_probe, staged_config, candidate_tmp / "allowed-write.txt"):
            try:
                path.unlink()
            except FileNotFoundError:
                pass
        try:
            unix_socket.unlink()
        except FileNotFoundError:
            pass


def parse_args(argv: Iterable[str] | None = None) -> argparse.Namespace:
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("action", choices=("probe", "start", "resume", "show-command"))
    parser.add_argument("--prompt-file", type=Path)
    parser.add_argument("--session-id")
    parser.add_argument("--auth-source", type=Path)
    return parser.parse_args(argv)


def main(argv: Iterable[str] | None = None) -> int:
    args = parse_args(argv)
    if PARALLEL_TRANSITION_PAUSE.exists():
        print("PARALLEL_TRANSITION_PAUSED", flush=True)
        while PARALLEL_TRANSITION_PAUSE.exists():
            time.sleep(0.5)
        return 75
    try:
        config = load_config()
        prompt_file = args.prompt_file or RUN_ROOT / "prompts" / "initial.txt"
        if args.action == "probe":
            return run_probe(config, args.auth_source)
        if args.action == "show-command":
            print(json.dumps(common_exec(config), indent=2))
            return 0
        if not prompt_file.is_file():
            raise LaunchError(f"prompt file is missing: {prompt_file}")
        if args.action == "start":
            return start(config, prompt_file, args.auth_source)
        return resume(config, prompt_file, args.session_id, args.auth_source)
    except (LaunchError, OSError, KeyError, ValueError) as exc:
        print(f"run-codex: {exc}", file=sys.stderr)
        return 2


if __name__ == "__main__":
    raise SystemExit(main())
