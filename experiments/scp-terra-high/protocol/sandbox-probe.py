#!/usr/bin/env python3
"""Content-free adversarial checks executed inside the candidate sandbox."""

from __future__ import annotations

import json
import os
import socket
import sys
from pathlib import Path


failures: list[str] = []


def fail(label: str) -> None:
    failures.append(label)
    print(f"FAIL {label}")


def passed(label: str) -> None:
    print(f"PASS {label}")


def can_read(path: Path, kind: str) -> bool:
    try:
        if kind == "directory":
            iterator = os.scandir(path)
            try:
                next(iterator, None)
            finally:
                iterator.close()
        else:
            descriptor = os.open(path, os.O_RDONLY)
            os.close(descriptor)
        return True
    except OSError:
        return False


config_path = Path(os.environ["SCP_PROBE_CONFIG"])
config = json.loads(config_path.read_text(encoding="utf-8"))
candidate = Path(config["candidate"])

if can_read(Path(config["allowed_read"]), "file"):
    passed("candidate-read")
else:
    fail("candidate-read")

allowed_write = Path(config["allowed_write"])
try:
    allowed_write.write_text("probe\n", encoding="utf-8")
    allowed_write.unlink()
    passed("candidate-write")
except OSError:
    fail("candidate-write")

for entry in config["forbidden"]:
    label = str(entry["label"])
    if can_read(Path(entry["path"]), str(entry["kind"])):
        fail(f"denied-read:{label}")
    else:
        passed(f"denied-read:{label}")
    try:
        os.stat(entry["path"])
    except OSError:
        passed(f"denied-metadata:{label}")
    else:
        if entry.get("allow_metadata"):
            passed(f"ancestor-metadata-only:{label}")
        else:
            fail(f"denied-metadata:{label}")

for entry in config["forbidden_writes"]:
    label = str(entry["label"])
    try:
        descriptor = os.open(entry["path"], os.O_WRONLY | os.O_APPEND)
    except OSError:
        passed(f"denied-write:{label}")
    else:
        os.close(descriptor)
        fail(f"denied-write:{label}")

parent_write = candidate.parent / "candidate-escape-probe.txt"
try:
    parent_write.write_text("probe\n", encoding="utf-8")
except OSError:
    passed("denied-parent-write")
else:
    try:
        parent_write.unlink()
    except OSError:
        pass
    fail("denied-parent-write")

# A symlink created inside the writable workspace must not reopen its denied target.
first_file = next(entry for entry in config["forbidden"] if entry["kind"] == "file")
escape_link = candidate / ".tmp" / "escape-link"
try:
    escape_link.symlink_to(first_file["path"])
    if can_read(escape_link, "file"):
        fail("denied-symlink-escape")
    else:
        passed("denied-symlink-escape")
finally:
    try:
        escape_link.unlink()
    except OSError:
        pass

hard_link = candidate / ".tmp" / "escape-hard-link"
try:
    os.link(first_file["path"], hard_link)
except OSError:
    passed("denied-hardlink-escape")
else:
    try:
        hard_link.unlink()
    except OSError:
        pass
    fail("denied-hardlink-escape")

expected_environment = set(config["expected_environment"])
actual_environment = set(os.environ)
if actual_environment == expected_environment:
    passed("sanitized-environment")
else:
    fail("sanitized-environment")

semantic_markers = [
    b"exact-snl",
    b"G-star",
    b"publication-profile",
    b"resolved-publication-inventory",
    b"auth.json",
    b"history.jsonl",
    b"memories_1.sqlite",
    b"/sessions",
    b"/skills",
]
secret_markers = (b"KEY=", b"TOKEN=", b"SECRET=", b"PASSWORD=", b"AUTH=")
proc_contamination = False
proc_root = Path("/proc")
try:
    processes = [path for path in proc_root.iterdir() if path.name.isdigit()]
except OSError:
    processes = []
for process in processes:
    try:
        environment = (process / "environ").read_bytes()
    except OSError:
        environment = b""
    if any(marker in environment for marker in [*semantic_markers, *secret_markers]):
        proc_contamination = True
    try:
        descriptors = list((process / "fd").iterdir())
    except OSError:
        descriptors = []
    for descriptor in descriptors:
        try:
            target = os.readlink(descriptor).encode("utf-8", errors="replace")
        except OSError:
            continue
        if any(marker in target for marker in semantic_markers):
            proc_contamination = True
if proc_contamination:
    fail("sanitized-visible-processes")
else:
    passed("sanitized-visible-processes")

try:
    tcp = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    tcp.settimeout(0.5)
    try:
        connected = tcp.connect_ex(("127.0.0.1", int(config["tcp_probe_port"]))) == 0
    finally:
        tcp.close()
except OSError:
    connected = False
if connected:
    fail("denied-loopback-network")
else:
    passed("denied-loopback-network")

try:
    udp = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
    try:
        try:
            sent = udp.sendto(b"x", ("1.1.1.1", 53)) > 0
        except OSError:
            sent = False
    finally:
        udp.close()
except OSError:
    sent = False
if sent:
    fail("denied-external-network")
else:
    passed("denied-external-network")

unix_path = config.get("unix_socket")
if unix_path:
    try:
        unix = socket.socket(socket.AF_UNIX, socket.SOCK_STREAM)
        try:
            connected = unix.connect_ex(unix_path) == 0
        finally:
            unix.close()
    except OSError:
        connected = False
    if connected:
        fail("denied-unix-socket")
    else:
        passed("denied-unix-socket")

if failures:
    print(f"ISOLATION FAILED ({len(failures)} check(s))")
    sys.exit(1)
print("ISOLATION PASSED")
