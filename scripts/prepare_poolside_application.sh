#!/usr/bin/env bash
# Prepare an executable HAMR application workspace and install the Poolside
# Phase B plans/settings before sealing the protected-input manifest.
set -euo pipefail

usage() {
  echo "usage: $0 <agent-directory> <new-application-directory> <template-directory> [external/sysml-aadl-libraries]" >&2
  exit 2
}

[[ $# -ge 3 && $# -le 4 ]] || usage

script_dir=$(realpath "$(dirname "$0")")
agent=$(realpath -e "$1")
application_arg=$2
templates=$(realpath -e "$3")
library=${4:-}

[[ -f $agent/M-star.sysml && -f $agent/N.md ]] || usage
[[ -f $agent/Gumbo_FSE_agent_Plan.txt ]] || usage
[[ -f $agent/sireum_verification_plan.txt ]] || usage
[[ -f $templates/application-settings.local.yaml ]] || usage

if [[ -n $library ]]; then
  "$script_dir/prepare_executable_candidate.sh" \
    "$agent/M-star.sysml" "$application_arg" "$library"
else
  "$script_dir/prepare_executable_candidate.sh" \
    "$agent/M-star.sysml" "$application_arg"
fi

application=$(realpath -e "$application_arg")
mkdir -p "$application/.poolside"
chmod u+w "$application/.poolside/settings.local.yaml" 2>/dev/null || true
cp "$templates/application-settings.local.yaml" \
  "$application/.poolside/settings.local.yaml"
cp "$agent/Gumbo_FSE_agent_Plan.txt" "$application/Gumbo_FSE_agent_Plan.txt"
cp "$agent/sireum_verification_plan.txt" "$application/sireum_verification_plan.txt"

manifest_tmp=$(mktemp /tmp/poolside-protected-manifest.XXXXXX)
trap 'rm -f "$manifest_tmp"' EXIT
(
  cd "$application"
  find . -type f \
    ! -path './hamr/slang/src/main/component/*' \
    ! -path './hamr/slang/out/*' \
    ! -path './proof/*' \
    ! -path './protected-work-files.sha256' \
    -print0 \
    | sort -z \
    | xargs -0 sha256sum
) >"$manifest_tmp"

chmod u+w "$application/protected-work-files.sha256"
cp "$manifest_tmp" "$application/protected-work-files.sha256"
chmod a-w \
  "$application/.poolside/settings.local.yaml" \
  "$application/Gumbo_FSE_agent_Plan.txt" \
  "$application/sireum_verification_plan.txt" \
  "$application/protected-work-files.sha256"

(
  cd "$application"
  sha256sum --check --quiet protected-work-files.sha256
)
(
  cd "$application/hamr/slang"
  sha256sum --check --quiet "$application/generated-nonapplication.sha256"
)

printf 'POOLSIDE_APPLICATION_PREPARED work=%s\n' "$application"
