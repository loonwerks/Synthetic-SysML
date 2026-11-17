#!/usr/bin/env bash
# Acceptance gate 2: prove both application entrypoints in every HAMR component.
set -euo pipefail

if [[ $# -lt 1 || $# -gt 2 ]]; then
  echo "usage: $0 <hamr-slang-root> [proof-output-directory]" >&2
  exit 2
fi

slang=$(realpath "$1")
proof_arg=${2:-$slang/proof}
mkdir -p "$proof_arg"
proof=$(realpath "$proof_arg")
work=$(realpath "$slang/../..")
component_root="$slang/src/main/component"
manifest="$work/generated-nonapplication.sha256"
allowlist="$work/generated-component-files.txt"
work_manifest="$work/protected-work-files.sha256"

[[ -d $component_root ]] || { echo "component root not found: $component_root" >&2; exit 2; }
[[ -f $manifest && -f $allowlist && -f $work_manifest ]] || {
  echo "prepared phase manifests are missing" >&2; exit 2;
}

if [[ -n ${SIREUM_BIN:-} ]]; then
  sireum=$(realpath "$SIREUM_BIN")
elif [[ -n ${SIREUM_HOME:-} ]]; then
  sireum=$(realpath "$SIREUM_HOME/bin/sireum")
else
  sireum=$(command -v sireum || true)
fi
[[ -n $sireum && -x $sireum ]] || {
  echo "Sireum executable not found; set SIREUM_BIN or SIREUM_HOME" >&2
  exit 2
}

# Fail closed if the application phase changed any generated non-application
# file or added/deleted a component application file.
if ! (cd "$slang" && sha256sum --check --quiet "$manifest"); then
  echo "generated non-application files changed after codegen" >&2
  exit 1
fi
if ! (cd "$work" && sha256sum --check --quiet "$work_manifest"); then
  echo "protected application-phase inputs changed after preparation" >&2
  exit 1
fi
current=$(mktemp)
trap 'rm -f "$current"' EXIT
(
  cd "$slang"
  find src/main/component -type f -name '*.scala' -print | sort
) >"$current"
if ! cmp -s "$allowlist" "$current"; then
  echo "component application file set differs from the generated allowlist" >&2
  diff -u "$allowlist" "$current" >&2 || true
  exit 1
fi

mapfile -t relative_components <"$allowlist"
[[ ${#relative_components[@]} -gt 0 ]] || { echo "no generated components found" >&2; exit 1; }

method_timeout=${LOGIKA_METHOD_TIMEOUT:-30}
process_timeout=${LOGIKA_PROCESS_TIMEOUT:-180}
rlimit=${LOGIKA_RLIMIT:-2000000}
index=0
failures=0

for relative in "${relative_components[@]}"; do
  component="$slang/$relative"
  for method in initialise timeTriggered; do
    mapfile -t lines < <(
      awk -v method="$method" '
        $0 ~ ("^[[:space:]]*def[[:space:]]+" method "[[:space:]]*\\(") { print NR }
      ' "$component"
    )
    if [[ ${#lines[@]} -ne 1 ]]; then
      echo "$relative must contain exactly one $method method; found ${#lines[@]}" >&2
      failures=$((failures + 1))
      continue
    fi
    safe_name=$(printf '%s-%s' "${relative%.scala}" "$method" | tr '/ ' '__')
    log=$(printf '%s/%03d-%s.log' "$proof" "$index" "$safe_name")
    index=$((index + 1))
    command=(
      "$sireum" proyek logika
      --timeout "$method_timeout"
      --rlimit "$rlimit"
      --par
      --line "${lines[0]}"
      "$slang"
      "$component"
    )
    printf 'PROVING %s:%s line=%s\n' "$relative" "$method" "${lines[0]}"
    set +e
    timeout "$process_timeout" "${command[@]}" >"$log" 2>&1
    rc=$?
    set -e
    cat "$log"
    if [[ $rc -ne 0 ]] || \
       grep -Eqi 'Resolution error:|Compilation failed|RUN ABORTED|(^|[[:space:]])error:|\*\*\* Failed \*\*\*' "$log"; then
      echo "LOGIKA_FAILED component=$relative method=$method rc=$rc" >&2
      failures=$((failures + 1))
    else
      echo "LOGIKA_PASSED component=$relative method=$method"
    fi
  done
done

if [[ $failures -ne 0 ]]; then
  echo "APPLICATION_LOGIKA_FAILED failures=$failures methods_attempted=$index" >&2
  exit 1
fi
printf 'APPLICATION_LOGIKA_PASSED components=%s methods=%s\n' \
  "${#relative_components[@]}" "$index"
