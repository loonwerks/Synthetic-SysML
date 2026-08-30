export const HELP = `SysML Viz — local SysML v2 + GUMBO visualization

Usage:
  sysml-viz serve [--workspace-root PATH] [--root PATH] [--library PATH ...] [--include GLOB ...] [--exclude GLOB ...] [--port 4782] [--validation-debounce-ms N]
  sysml-viz session inspect [--server URL] [--json]
  sysml-viz model summarize [--server URL] [--json]
  sysml-viz model validate [--server URL] [--json]
  sysml-viz model search --query TEXT [--limit N] [--server URL] [--json]
  sysml-viz element inspect --id ID [--server URL] [--json]
  sysml-viz requirement find --query TEXT [--server URL] [--json]
  sysml-viz view list [--server URL] [--json]
  sysml-viz view show --id ID [--activate] [--dry-run] [--actor NAME] [--server URL] [--json]
  sysml-viz view activate --id ID [--dry-run] [--actor NAME]
  sysml-viz view create --id ID --name NAME [--root-element ID] [--dry-run] [--actor NAME]
  sysml-viz view filter --id ID [--hide ELEMENT ...] [--show ELEMENT ...] [--show-all] [--dry-run] [--actor NAME]
  sysml-viz view expand --id ID --element ELEMENT [--collapse] [--dry-run] [--actor NAME]
  sysml-viz view alias --id ID --element ELEMENT --label TEXT [--dry-run] [--actor NAME]
  sysml-viz view annotate --id ID --annotation-id ID --text TEXT --x N --y N [--style info|success|warning|error] [--element ID] [--arrow-to ID --arrow-kind node|port] [--dry-run] [--actor NAME]
  sysml-viz view annotation update --view ID --annotation-id ID [--text TEXT] [--x N --y N] [--style info|success|warning|error] [--arrow-to ID --arrow-kind node|port] [--dry-run]
  sysml-viz view annotation remove --view ID --annotation-id ID [--dry-run]
  sysml-viz view presentation node add --view ID --presentation-id ID --label TEXT --kind actor|reference --x N --y N [--width N --height N] [--dry-run]
  sysml-viz view presentation node update --view ID --presentation-id ID [--label TEXT] [--kind actor|reference] [--x N] [--y N] [--width N --height N] [--dry-run]
  sysml-viz view presentation node remove --view ID --presentation-id ID [--dry-run]
  sysml-viz view presentation edge add --view ID --presentation-id ID --source ID --target ID --kind reference|informational [--label TEXT] [--bend X,Y ...] [--dry-run]
  sysml-viz view presentation edge update --view ID --presentation-id ID [--source ID] [--target ID] [--kind reference|informational] [--label TEXT] [--bend X,Y ...] [--dry-run]
  sysml-viz view presentation edge remove --view ID --presentation-id ID [--dry-run]
  sysml-viz view style --id ID [--ports show|hide] [--edge-labels show|hide] [--types show|hide] [--dry-run] [--actor NAME]
  sysml-viz layout move --view ID --id ELEMENT (--x N --y N | --relative-to ELEMENT [--dx N] [--dy N]) [--pin] [--dry-run] [--actor NAME]
  sysml-viz layout resize --view ID --id ELEMENT (--width W --height H [--x X --y Y] | --fit) [--dry-run] [--actor NAME]
  sysml-viz layout pin --view ID --id ELEMENT [--off] [--dry-run] [--actor NAME]
  sysml-viz layout apply --view ID [--dry-run] [--actor NAME]
  sysml-viz layout align --view ID --id ELEMENT --id ELEMENT --alignment left|center-x|right|top|center-y|bottom [--no-pin] [--dry-run] [--actor NAME]
  sysml-viz layout distribute --view ID --id ELEMENT --id ELEMENT --id ELEMENT --axis horizontal|vertical [--no-pin] [--dry-run] [--actor NAME]
  sysml-viz layout reset --view ID [--dry-run] [--actor NAME]
  sysml-viz layout constrain --view ID --id ELEMENT --relation above|below|left-of|right-of --relative-to ELEMENT [--gap N] [--actor NAME]
  sysml-viz layout constraint list --view ID
  sysml-viz layout constraint remove --view ID --constraint-id ID [--dry-run]
  sysml-viz layout template export --view ID --out PATH
  sysml-viz layout template apply --view ID --in PATH [--map SOURCE=TARGET ...] [--actor NAME]
  sysml-viz diagram health [--view ID] [--root-element ID] [--json]
  sysml-viz checkpoint create --name NAME [--message TEXT] [--author NAME]
  sysml-viz render export --format svg|png --out PATH [--view ID] [--root-element ID] [--metadata PATH | --no-metadata]

Without --root, the browser opens in project-selection mode. For a long-running
launcher use: sysml-viz serve --workspace-root ..

The canonical workspace root is a security boundary: browsed, project, and
library paths (including resolved symlinks) must remain beneath it. Projects can
be switched without changing the server URL. Library roots are always opt-in.
Project discovery recursively loads *.sysml, excluding hidden paths, repository
metadata, caches, build/dependency output, and nested sysml-aadl-libraries directories.
Include patterns apply only to project files; excludes apply to project and
library files. Commands print readable summaries by default and stable response
JSON when --json is supplied.
Non-serve commands use --server, then SYSML_VIZ_SERVER, then
http://127.0.0.1:4782 as their endpoint.

SVG exports write a deterministic metadata sidecar to <out>.json by default.
PNG exports do not create a sidecar unless --metadata PATH is supplied.
Use --no-metadata to suppress SVG metadata. Mutation commands are compact by
default; use --verbose or --json for complete state.
`;
