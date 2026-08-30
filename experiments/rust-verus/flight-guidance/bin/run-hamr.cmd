#!/usr/bin/env bash
set -euo pipefail

root="$(cd "$(dirname "$0")/.." && pwd)"
: "${SIREUM_HOME:?Set SIREUM_HOME to the Sireum installation}"
repo="$(cd "$root/../../.." && pwd)"
libraries="$repo/external/sysml-aadl-libraries"

exec "$SIREUM_HOME/bin/sireum" hamr sysml codegen \
  --sourcepath "$root/rust/model:$libraries" \
  --system-name FAA_Flight_Guidance_System::Flight_Guidance_System \
  --platform Microkit \
  --output-dir "$root/rust/hamr" \
  --sel4-output-dir "$root/rust/hamr" \
  --workspace-root-dir "$root/rust" \
  --verus-attribute-syntax \
  "$root/rust/model/flight_guidance_rust.sysml" "$@"
