# CPS-48 domain seeds

This directory contains the eight reviewed, frozen inputs used by the CPS-48
campaign. Each seed is intentionally complexity-neutral: it records source
provenance, domain purpose and context, optional design vocabulary, alternative
single-system scopes, and claim boundaries. The Designer chooses the exact
architecture, interactions, policy, and complexity for each campaign cell.

| Campaign family | Frozen seed | Source brief |
| --- | --- | --- |
| Drone governor | `drone-logical-domain-v1.md` | `sources/drone-governor-v1.md` |
| Mining threat retreat | `mining-threat-retreat-v1.md` | `sources/mining-threat-retreat-v1.md` |
| Factory dispatch | `factory-dispatch-v1.md` | `sources/factory-dispatch-v1.md` |
| Vehicle mode | `vehicle-mode-v1.md` | `sources/vehicle-mode-v1.md` |
| EIT acquisition | `eit-acquisition-v1.md` | `sources/eit-acquisition-v1.md` |
| Fire observation sortie | `fire-observation-sortie-v1.md` | `sources/fire-observation-sortie-v1.md` |
| Mining cargo docking | `mining-cargo-docking-v1.md` | `sources/mining-cargo-docking-v1.md` |
| HVAC supervisor | `hvac-supervisor-v1.md` | `sources/hvac-campaign-v1.md` |

The corresponding paths and SHA-256 hashes are pinned in
[`../manifest.json`](../manifest.json). Do not edit a campaign seed
in place. Publish a new version, review it, and deliberately update the
manifest and hash.

See [`../../src/synthesizer/README.md`](../../src/synthesizer/README.md#generate-or-refresh-a-reusable-seed) for the
seed-generation command and runtime requirements.
