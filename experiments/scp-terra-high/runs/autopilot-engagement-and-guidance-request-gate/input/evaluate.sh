#!/usr/bin/env sh
set -eu

SCRIPT_DIR=$(CDPATH= cd "$(dirname "$0")" && pwd)
case "$#" in
  1)
    # An isolated experiment copies this script next to its private oracle.
    ORACLE="$SCRIPT_DIR/oracle.sysml"
    CANDIDATE_ARG=$1
    ;;
  2)
    DATASET_NAME=$1
    case "$DATASET_NAME" in
      ""|*[!a-z0-9-]*|-*|*-|*--*)
        echo "invalid dataset name: $DATASET_NAME" >&2
        exit 2
        ;;
    esac
    ORACLE="$SCRIPT_DIR/$DATASET_NAME/evaluator/oracle.sysml"
    CANDIDATE_ARG=$2
    ;;
  *)
    echo "usage: $0 DATASET_NAME CANDIDATE.sysml" >&2
    exit 2
    ;;
esac
if [ ! -f "$ORACLE" ]; then
  echo "dataset oracle is not a regular file: $ORACLE" >&2
  exit 2
fi
CANDIDATE=$(readlink -f -- "$CANDIDATE_ARG")
if [ ! -f "$CANDIDATE" ]; then
  echo "candidate is not a regular file: $CANDIDATE_ARG" >&2
  exit 2
fi

if [ -n "${EQUIV_CHECKER_ROOT:-}" ]; then
  REPOSITORY_ROOT=$(readlink -f -- "$EQUIV_CHECKER_ROOT")
else
  SEARCH_DIR=$SCRIPT_DIR
  REPOSITORY_ROOT=
  while [ "$SEARCH_DIR" != "/" ]; do
    if [ -d "$SEARCH_DIR/.git" ] && [ -d "$SEARCH_DIR/src/equiv_checker" ]; then
      REPOSITORY_ROOT=$SEARCH_DIR
      break
    fi
    SEARCH_DIR=$(dirname "$SEARCH_DIR")
  done
fi
if [ -z "$REPOSITORY_ROOT" ] || [ ! -d "$REPOSITORY_ROOT/src/equiv_checker" ]; then
  echo "could not locate the repository root" >&2
  exit 2
fi

# Byte identity is a complete equivalence proof for the corpus smoke test.  All
# staged oracles have already passed the corpus-wide Sireum type-checking gate.
if cmp -s -- "$ORACLE" "$CANDIDATE"; then
  echo EQUIVALENT
  exit 0
fi

RESULTS=$(mktemp -d "${TMPDIR:-/tmp}/dataset-evaluator.XXXXXXXX")
trap 'rm -rf "$RESULTS"' EXIT HUP INT TERM
cd "$REPOSITORY_ROOT"
python3 -m src.equiv_checker compare \
  --oracle "$ORACLE" \
  --candidate "$CANDIDATE" \
  --output-dir "$RESULTS" \
  --timeout "${EQUIV_TIMEOUT_SECONDS:-300}"
