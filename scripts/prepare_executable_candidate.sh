#!/usr/bin/env bash
# Gate the original model, then create an isolated executable/codegen projection.
set -euo pipefail

usage() {
  echo "usage: $0 <agent/M-star.sysml> <new-work-directory> [external/sysml-aadl-libraries]" >&2
  exit 2
}

[[ $# -ge 2 && $# -le 3 ]] || usage

script_dir=$(realpath "$(dirname "$0")")
repo_root=$(realpath "$script_dir/..")
model=$(realpath "$1")
work_arg=$2
library=$(realpath "${3:-$repo_root/external/sysml-aadl-libraries}")

lower_model=${model,,}
case "/$lower_model/" in
  */evaluator/*|*/oracle.sysml/) echo "refusing evaluator/oracle model path" >&2; exit 2 ;;
esac
[[ -f $model && $model == *.sysml ]] || { echo "candidate model not found: $model" >&2; exit 2; }
[[ -d $library ]] || { echo "SysML AADL library not found: $library" >&2; exit 2; }
requirements="$(dirname "$model")/N.md"
[[ -f $requirements ]] || { echo "candidate requirements not found beside model: $requirements" >&2; exit 2; }

if [[ -e $work_arg ]]; then
  work=$(realpath "$work_arg")
  if find "$work" -mindepth 1 -print -quit | grep -q .; then
    echo "work directory must be new or empty: $work" >&2
    exit 2
  fi
else
  mkdir -p "$work_arg"
  work=$(realpath "$work_arg")
fi

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

mkdir -p "$work/evidence" "$work/staged" "$work/hamr"
cp "$requirements" "$work/N.md"
if [[ -f "$(dirname "$model")/.poolside/settings.local.yaml" ]]; then
  mkdir -p "$work/.poolside"
  cp "$(dirname "$model")/.poolside/settings.local.yaml" "$work/.poolside/settings.local.yaml"
fi
source_hash_before=$(sha256sum "$model" | awk '{print $1}')

# Acceptance gate 1 is intentionally run against the original candidate, not
# the executable projection. Keep the invocation identical to the campaign's
# named `sireum hamr sysml logika` gate.
set +e
"$sireum" hamr sysml logika \
  --sourcepath "$(dirname "$model"):$library" \
  "$model" >"$work/evidence/original-model-logika.log" 2>&1
integration_rc=$?
set -e
cat "$work/evidence/original-model-logika.log"
if [[ $integration_rc -ne 0 ]] || \
   grep -Eqi 'Resolution error:|Compilation failed|(^|[[:space:]])error:' "$work/evidence/original-model-logika.log"; then
  echo "ORIGINAL_MODEL_LOGIKA_FAILED rc=$integration_rc" >&2
  exit 1
fi

projection="$work/staged/M-star.executable.sysml"
metadata="$work/staged/projection.json"
python3 "$script_dir/stage_executable_model.py" \
  "$model" "$projection" "$metadata" >"$work/evidence/projection.jsonl"

package=$(python3 -c 'import json,sys; print(json.load(open(sys.argv[1]))["package"])' "$metadata")
system_name=$(python3 -c 'import json,sys; print(json.load(open(sys.argv[1]))["system_name"])' "$metadata")
slang_package=$(printf '%s' "$package" | tr '[:upper:]' '[:lower:]')

set +e
"$sireum" hamr sysml codegen \
  --platform JVM \
  --runtime-monitoring \
  --package-name "$slang_package" \
  --output-dir "$work/hamr" \
  --slang-output-dir "$work/hamr/slang" \
  --no-proyek-ive \
  --workspace-root-dir "$work/staged" \
  --sourcepath "$work/staged:$library" \
  --system-name "$system_name" \
  "$projection" >"$work/evidence/codegen.log" 2>&1
codegen_rc=$?
set -e
cat "$work/evidence/codegen.log"
if [[ $codegen_rc -ne 0 ]] || grep -Eqi 'Resolution error:|Compilation failed|(^|[[:space:]])error:' "$work/evidence/codegen.log"; then
  echo "EXECUTABLE_CODEGEN_FAILED rc=$codegen_rc" >&2
  exit 1
fi

slang="$work/hamr/slang"
component_root="$slang/src/main/component"
[[ -f $slang/bin/project.cmd ]] || { echo "codegen produced no Proyek project" >&2; exit 1; }
mapfile -d '' components < <(find "$component_root" -type f -name '*.scala' -print0 | sort -z)
[[ ${#components[@]} -gt 0 ]] || { echo "codegen produced no component applications" >&2; exit 1; }
for component in "${components[@]}"; do
  grep -Eq '^[[:space:]]*def[[:space:]]+initialise[[:space:]]*\(' "$component" || {
    echo "generated component lacks initialise: $component" >&2; exit 1;
  }
  grep -Eq '^[[:space:]]*def[[:space:]]+timeTriggered[[:space:]]*\(' "$component" || {
    echo "generated component lacks timeTriggered: $component" >&2; exit 1;
  }
done

source_hash_after=$(sha256sum "$model" | awk '{print $1}')
[[ $source_hash_before == "$source_hash_after" ]] || {
  echo "original candidate changed during projection/codegen" >&2; exit 1;
}

# Freeze the generated surface outside HAMR's application files.  The later
# proof gate verifies both this hash manifest and the component-file allowlist.
(
  cd "$slang"
  find . -type f \
    ! -path './src/main/component/*' \
    ! -path './out/*' \
    -print0 \
    | sort -z \
    | xargs -0 sha256sum
) >"$work/generated-nonapplication.sha256"
(
  cd "$slang"
  find src/main/component -type f -name '*.scala' -print | sort
) >"$work/generated-component-files.txt"
cp "$script_dir/run-logika.sh" "$work/run-logika.sh"
chmod u+x "$work/run-logika.sh"

cat >"$work/APPLICATION_PHASE.txt" <<EOF
POOLside application phase boundary

Writable application files:
  $component_root/**/*.scala

Read-only requirements:
  $work/N.md

Do not edit the staged SysML, generated bridge/API/data/runtime/project files,
the manifests, or this gate.  After the application agent implements every
generated initialise and timeTriggered body, run the command below.  HAMR
Initialization_Api values expose output setters but no input getters: initialise
must establish safe state/outputs without reading an input port.

  $work/run-logika.sh $slang $work/proof
EOF

# Protect the entire retained phase input, while excluding Logika's mutable
# cache/output tree and the application allowlist itself.
(
  cd "$work"
  find . -type f \
    ! -path './hamr/slang/src/main/component/*' \
    ! -path './hamr/slang/out/*' \
    ! -path './proof/*' \
    ! -path './protected-work-files.sha256' \
    -print0 \
    | sort -z \
    | xargs -0 sha256sum
) >"$work/protected-work-files.sha256"
find "$work" -type f \
  ! -path "$component_root/*" \
  ! -path "$slang/out/*" \
  ! -path "$work/proof/*" \
  -exec chmod a-w {} +
find "$component_root" -type f -name '*.scala' -exec chmod u+w,go-w {} +

printf 'EXECUTABLE_PREPARED work=%s components=%s system=%s\n' \
  "$work" "${#components[@]}" "$system_name"
printf 'APPLICATION_ROOT=%s\n' "$component_root"
printf 'NEXT=%q\ %q\ %q\n' "$work/run-logika.sh" "$slang" "$work/proof"
