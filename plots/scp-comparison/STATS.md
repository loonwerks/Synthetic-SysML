# Poolside–Terra cactus statistics

All values use the 48 seed-derived campaign instances; four legacy systems are excluded.

| System | Configured cutoff | Gate-qualified | Equivalent | Weaker | Incomparable | Inconclusive | Invalid input |
|---|---:|---:|---:|---:|---:|---:|---:|
| Terra | 60 min | 38 | 11 | 21 | 3 | 2 | 1 |
| Poolside | 180 min | 11 | 2 | 5 | 0 | 4 | 0 |

The resolved verdict curves are restricted to gate-qualified candidates. Inconclusive and invalid-input candidates remain in the gray qualified-total curve.

## Shared token definitions

- Input and output are provider-reported counters aggregated over each candidate's attempts/trajectories.
- Terra cached input and Poolside cache-read input are treated as corresponding cache telemetry.
- Comparable total tokens are input plus output. Cached input is already a subset of input, and Terra reasoning output is already a subset of output.
- There is no paired reasoning-output plot because Poolside does not expose a corresponding field.

| Metric | Terra qualified max | Poolside qualified max | Shared x-axis cutoff |
|---|---:|---:|---:|
| Input tokens | 37,537,467 | 37,064,430 | 37,537,467 |
| Cached/cache-read input tokens | 37,033,216 | 25,607,296 | 37,033,216 |
| Output tokens | 39,877 | 251,844 | 251,844 |
| Comparable total tokens (input + output) | 37,566,841 | 37,283,557 | 37,566,841 |

## Timing caveat

Poolside uses cumulative active subprocess time with a three-hour cutoff; Terra uses a one-hour cutoff. Poolside timings marked as conservative upper bounds are plotted at that upper bound.

- Poolside timing precision `conservative_upper_bound_missing_original_measurement`: 2 runs
- Poolside timing precision `controller-recorded clean-replacement active Poolside wall-clock`: 4 runs
- Poolside timing precision `controller-recorded cumulative active Poolside wall-clock`: 36 runs
- Poolside timing precision `cutoff-capped cumulative estimate`: 1 runs
- Poolside timing precision `estimated from observed model completion and application process elapsed time`: 1 runs
- Poolside timing precision `estimated_from_orchestration_observations`: 1 runs
- Poolside timing precision `recorded`: 3 runs
