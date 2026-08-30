# Architecture

SysML Viz is split into four workspace packages.

- `core` owns filesystem-independent model types, focused SysML/GUMBO parsing,
  diagram derivation, identity, health checks, and deterministic SVG output.
- `server` owns an explicitly bounded local session, watched project files,
  view persistence, asynchronous Sireum validation, HTTP, and WebSocket events.
- `web` owns the interactive browser UI.
- `cli` exposes the same session and view operations to terminal-based agents.

Raw `.sysml` files are authoritative. Visual state is separate, readable data
under the selected model root's `.sysmlviz/` directory. The live parser is
purposefully limited to observed AADL-oriented constructs; Sireum remains the
authoritative validation oracle and runs outside the redraw loop.

## Trust boundary

A server receives one required canonical workspace root and may initially have
no active project. Each session receives one project root and zero or more
explicit library roots beneath that boundary. Only the project root is watched
and may contain persisted view state.
Paths are canonicalized before use. Imports do not grant permission to crawl a
parent directory or discover sibling repositories.

Repeatable include/exclude patterns may narrow project discovery and use the
same matcher in the watcher, preventing the parser and live session from
seeing different file sets. Includes do not trim explicitly selected library
roots. The browser stores recent configurations locally and sends an explicit
configuration when opening a project; the server never searches for or
implicitly loads a project configuration file. A switch constructs and parses
the replacement session first, swaps it atomically, emits `session.switched`,
then stops the old watcher.
