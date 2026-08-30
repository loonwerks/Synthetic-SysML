#!/usr/bin/env bash

set -euo pipefail

usage() {
  echo "usage: $0 AGENT_DIRECTORY PROMPT_FILE [POOL_EXEC_ARGS...]" >&2
  exit 2
}

[[ $# -ge 2 ]] || usage

agent_directory=$(realpath -e "$1")
prompt_file=$(realpath -e "$2")
shift 2

[[ -d "$agent_directory" ]] || usage
[[ -f "$prompt_file" ]] || usage

script_dir=$(realpath "$(dirname "$0")")
repo_root=$(realpath "$script_dir/..")

# Fail closed if the caller selected a dataset root instead of an isolated
# agent/application workspace, or if a link could escape the selected tree.
# Absolute /workspace links are interpreted as they will be after the bind
# mount; HAMR-generated applications use these for staged model inputs.
while IFS= read -r -d '' link; do
  link_target=$(readlink -- "$link")
  if [[ "$link_target" == /workspace/* ]]; then
    host_target="$agent_directory/${link_target#/workspace/}"
  elif [[ "$link_target" == /* ]]; then
    echo "refusing workspace link outside sandbox: $link -> $link_target" >&2
    exit 2
  else
    host_target="$(dirname -- "$link")/$link_target"
  fi
  if ! resolved_target=$(realpath -e -- "$host_target"); then
    echo "refusing unresolved workspace link: $link -> $link_target" >&2
    exit 2
  fi
  case "$resolved_target" in
    "$agent_directory"|"$agent_directory"/*) ;;
    *)
      echo "refusing workspace link outside sandbox: $link -> $link_target" >&2
      exit 2
      ;;
  esac
done < <(find "$agent_directory" -xdev -type l -print0)
if find "$agent_directory" -xdev \
    \( -type d -name evaluator -o -type f -iname oracle.sysml \) \
    -print -quit | grep -q .; then
  echo "refusing workspace containing evaluator/oracle material: $agent_directory" >&2
  exit 2
fi

pool_binary=${POOL_BINARY:-$(command -v pool || true)}
pool_config=${POOLSIDE_CONFIG_DIR:-${XDG_CONFIG_HOME:-${HOME}/.config}/poolside}
if [[ -n ${SIREUM_HOME:-} ]]; then
  sireum_distribution=$(realpath "$SIREUM_HOME")
else
  sireum_binary=$(command -v sireum || true)
  sireum_distribution=${sireum_binary:+$(realpath "$(dirname "$sireum_binary")/..")}
fi
sysml_aadl_libraries=${SYSML_AADL_LIBRARIES:-$repo_root/external/sysml-aadl-libraries}

[[ -n "$pool_binary" && -x "$pool_binary" ]] || {
  echo "pool executable not found; set POOL_BINARY or add pool to PATH" >&2
  exit 2
}
[[ -d "$pool_config" ]] || { echo "pool config not found: $pool_config" >&2; exit 2; }
[[ -n "$sireum_distribution" && -d "$sireum_distribution" ]] || {
  echo "Sireum distribution not found; set SIREUM_HOME or add sireum to PATH" >&2
  exit 2
}
[[ -d "$sysml_aadl_libraries" ]] || { echo "SysML/AADL libraries not found: $sysml_aadl_libraries" >&2; exit 2; }

if [[ ${POOLSIDE_CONFINED_NAMESPACE:-0} != 1 ]]; then
  exec unshare --user --map-root-user --mount --pid --fork --mount-proc \
    env POOLSIDE_CONFINED_NAMESPACE=1 "$0" "$agent_directory" "$prompt_file" "$@"
fi

sandbox_root=$(mktemp -d /tmp/poolside-confined.XXXXXX)
sandbox_user=${POOLSIDE_SANDBOX_USER:-poolside}
sandbox_home="$sandbox_root/home/$sandbox_user"
sandbox_library="$sandbox_root/opt/sysml-aadl-libraries"
chroot_home="/home/$sandbox_user"

cleanup() {
  set +e
  cleanup_failed=0
  for target in \
    "$sandbox_root/run/prompt.txt" \
    "$sandbox_root/workspace" \
    "$sandbox_root/opt/sireum" \
    "$sandbox_library" \
    "$sandbox_home/.config/poolside" \
    "$sandbox_root/pool" \
    "$sandbox_root/proc" \
    "$sandbox_root/run/systemd/resolve" \
    "$sandbox_root/etc" \
    "$sandbox_root/dev/urandom" \
    "$sandbox_root/dev/random" \
    "$sandbox_root/dev/zero" \
    "$sandbox_root/dev/null" \
    "$sandbox_root/usr" \
    "$sandbox_root"
  do
    if mountpoint -q "$target" && ! umount "$target"; then
      cleanup_failed=1
    fi
  done
  if [[ $cleanup_failed == 0 ]]; then
    case "$sandbox_root" in
      /tmp/poolside-confined.*) rm -rf -- "$sandbox_root" ;;
    esac
  else
    echo "warning: sandbox mounts remain; preserving temporary root: $sandbox_root" >&2
  fi
}
trap cleanup EXIT INT TERM

mount -t tmpfs -o mode=0755 tmpfs "$sandbox_root"

mkdir -p \
  "$sandbox_root/dev" \
  "$sandbox_root/etc" \
  "$sandbox_home/.config/poolside" \
  "$sandbox_home/.local/state/poolside" \
  "$sandbox_root/opt/sireum" \
  "$sandbox_library" \
  "$sandbox_root/proc" \
  "$sandbox_root/run" \
  "$sandbox_root/run/systemd/resolve" \
  "$sandbox_root/tmp" \
  "$sandbox_root/usr" \
  "$sandbox_root/workspace"

touch \
  "$sandbox_root/dev/null" \
  "$sandbox_root/dev/random" \
  "$sandbox_root/dev/urandom" \
  "$sandbox_root/dev/zero" \
  "$sandbox_root/pool" \
  "$sandbox_root/run/prompt.txt"

# Bash process substitution (used by run-logika.sh) resolves descriptors via
# /dev/fd -> /proc/self/fd.  Mount a namespace-local procfs and provide the
# conventional descriptor links inside the chroot.
mount -t proc -o nosuid,noexec,nodev proc "$sandbox_root/proc"
ln -s /proc/self/fd "$sandbox_root/dev/fd"
ln -s /proc/self/fd/0 "$sandbox_root/dev/stdin"
ln -s /proc/self/fd/1 "$sandbox_root/dev/stdout"
ln -s /proc/self/fd/2 "$sandbox_root/dev/stderr"

ln -s usr/bin "$sandbox_root/bin"
ln -s usr/lib "$sandbox_root/lib"
if [[ -d /usr/lib64 ]]; then
  ln -s usr/lib64 "$sandbox_root/lib64"
fi
ln -s usr/sbin "$sandbox_root/sbin"

mount --bind /usr "$sandbox_root/usr"
mount -o remount,bind,ro "$sandbox_root/usr"

mount --bind /dev/null "$sandbox_root/dev/null"
mount --bind /dev/zero "$sandbox_root/dev/zero"
mount --bind /dev/random "$sandbox_root/dev/random"
mount --bind /dev/urandom "$sandbox_root/dev/urandom"

mount --bind /etc "$sandbox_root/etc"
mount -o remount,bind,ro "$sandbox_root/etc"
mount --bind /run/systemd/resolve "$sandbox_root/run/systemd/resolve"
mount -o remount,bind,ro "$sandbox_root/run/systemd/resolve"

mount --bind "$pool_binary" "$sandbox_root/pool"
mount -o remount,bind,ro "$sandbox_root/pool"

mount --bind "$pool_config" "$sandbox_home/.config/poolside"
mount -o remount,bind,ro "$sandbox_home/.config/poolside"

mount --bind "$sireum_distribution" "$sandbox_root/opt/sireum"
mount -o remount,bind,ro "$sandbox_root/opt/sireum"

mount --bind "$sysml_aadl_libraries" "$sandbox_library"
mount -o remount,bind,ro "$sandbox_library"

mount --bind "$agent_directory" "$sandbox_root/workspace"
mount --bind "$prompt_file" "$sandbox_root/run/prompt.txt"
mount -o remount,bind,ro "$sandbox_root/run/prompt.txt"

export HOME="$chroot_home"
export PATH=/usr/local/bin:/usr/bin:/bin:/opt/sireum/bin
export LD_LIBRARY_PATH=/opt/sireum/bin/linux/java/lib:/opt/sireum/bin/linux/java/lib/server:/usr/lib/x86_64-linux-gnu

/usr/sbin/chroot "$sandbox_root" /pool exec \
  -a laguna_s_P6 \
  --sandbox disabled \
  -d /workspace \
  -o json \
  -f /run/prompt.txt \
  "$@"
