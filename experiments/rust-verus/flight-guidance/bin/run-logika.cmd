#!/usr/bin/env bash
set -euo pipefail

root="$(cd "$(dirname "$0")/.." && pwd)"
: "${SIREUM_HOME:?Set SIREUM_HOME to the Sireum installation}"
repo="$(cd "$root/../../.." && pwd)"
libraries="$repo/external/sysml-aadl-libraries"

# This is the model-level integration-contract check. Rust is checked by
# run-verus.sh; Logika does not verify the generated Rust application.
exec "$SIREUM_HOME/bin/sireum" hamr sysml logika \
  --sourcepath "$libraries" \
  "$root/model/flight_guidance.sysml" "$@"
