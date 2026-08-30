#!/usr/bin/env sh
set -eu
RESULT_DIR=$(CDPATH= cd "$(dirname "$0")" && pwd)
RUN_DIR=$(CDPATH= cd "$RESULT_DIR/.." && pwd)
REPO_ROOT=$(CDPATH= cd "$RESULT_DIR/../../../../.." && pwd)
DATASET_ID=${RUN_DIR##*/}
CHECKER_ROOT=${EQUIV_CHECKER_ROOT:-"$REPO_ROOT"}
ORACLE="$REPO_ROOT/datasets/$DATASET_ID/evaluator/oracle.sysml"
if [ ! -f "$ORACLE" ]; then
  ORACLE="$RUN_DIR/input/oracle.sysml"
fi
OUTPUT_DIR=${1:-"${RESULT_DIR}.replay"}
cd "$CHECKER_ROOT"
exec python3 -m src.equiv_checker compare \
  --oracle "$ORACLE" \
  --candidate "$RUN_DIR/candidate/M-star.sysml" \
  --output-dir "$OUTPUT_DIR" \
  --timeout 300.0 --defer-health
