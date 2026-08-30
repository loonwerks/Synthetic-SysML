# CPS-48 completion record

Completed 2026-08-14. All 48 manifest cells are accepted: eight families,
three complexity tiers, and two replicates per family/tier. No expected cell is
missing and no unexpected cell is credited.

## Counting rule

The dataset credits one accepted run for each `(family_id, complexity,
replicate)` tuple. The migrated `../runs/` directory contains exactly those 48
credited runs. Three superseded accepted Drone directories, four early pilots,
and all failed runs were intentionally omitted during migration.

## Recorded cost

| Scope | Runs | Recorded tokens |
| --- | ---: | ---: |
| Canonical 48 accepted models | 48 | 1,715,390,977 |

The canonical 48 model runs recorded 1,704,980,396 input tokens and 10,410,581
output tokens. Their summed agent-stage time is 294,061.676 seconds (81.684
hours), summed per-run elapsed time is 470,464 seconds (130.684 hours), and the
real timestamp span is 241,876 seconds (67.188 hours); elapsed figures overlap
because runs executed concurrently.

| Canonical role | Recorded tokens | Agent seconds |
| --- | ---: | ---: |
| Designer | 269,418,899 | 74,800.558 |
| Model | 681,128,934 | 123,820.413 |
| Visualization | 760,289,812 | 94,010.620 |
| Legacy in-run Seed stage | 4,553,332 | 1,430.085 |

The Seed-stage row reflects seed work recorded inside some canonical run usage
reports. Separate reusable-seed generation jobs were not migrated.

## Integrity audit

All 48 canonical campaign directories use the 15-file minimal accepted schema.
Every retained JSON file parses, every `status.json` canonical-source hash
matches its SysML source, every accepted run retains an SVG and traceability
sidecar, and the worktree passes `git diff --check`.
