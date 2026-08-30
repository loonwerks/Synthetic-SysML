#!/usr/bin/env bash
set -euo pipefail

root="$(cd "$(dirname "$0")/.." && pwd)"
component="$root/rust/hamr/crates/Flight_Guidance_System_Function_behavior"

export CARGO_NET_OFFLINE="${CARGO_NET_OFFLINE:-true}"
exec make -C "$component" verus "$@"
