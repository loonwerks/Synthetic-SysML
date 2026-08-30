# Verification evidence

## Procedure

1. Typecheck the final projection with `sireum hamr sysml tipe`.
2. Regenerate the Microkit tree from the final model.
3. Verify all eight application crates using the real local Cargo Git cache,
   offline mode, and invocation-scoped panic abort:

   ```sh
   cargo-verus verify --offline \
     --config 'profile.dev.panic="abort"'
   ```

4. Hash the model and all eight application files, regenerate without changing
   the model, compare hashes, and rerun every proof.

`profile.dev.panic="abort"` is required because each generated crate is a
`no_std` static library. It is command-scoped; generated Cargo manifests remain
unchanged. Optional `sel4` and `sel4-logging` dependencies resolve from the
authentic read-only Cargo Git cache. The `sel4` feature is not enabled by these
application proofs, and no placeholder package is used.

## Final post-regeneration results

| Crate | Application verification result |
| --- | --- |
| `detect_regulator_failure_process_detect_regulator_failure` | 8 verified, 0 errors |
| `detect_monitor_failure_process_detect_monitor_failure` | 8 verified, 0 errors |
| `manage_regulator_mode_process_manage_regulator_mode` | 10 verified, 0 errors |
| `manage_heat_source_process_manage_heat_source` | 9 verified, 0 errors |
| `manage_monitor_interface_process_manage_monitor_interface` | 12 verified, 0 errors |
| `manage_monitor_mode_process_manage_monitor_mode` | 10 verified, 0 errors |
| `manage_alarm_process_manage_alarm` | 9 verified, 0 errors |
| `manage_regulator_interface_process_manage_regulator_interface` | 12 verified, 0 errors |

Total application result: **78 verified, 0 errors across 8/8 crates**.

Each run also reports the shared generated `data` crate as 32 verified, 0
errors. The table reports the application-crate line rather than adding shared
dependency counts repeatedly.

## Regeneration preservation

- Final model SHA-256 before and after regeneration:
  `00ca2630f753e4d0c946e8c7f560c0dbbdee37ebcd8b0d7c1432a1931d3d411b`.
- Model hash comparison exit: 0, empty diff.
- All eight before/after application hashes match byte-for-byte.
- Application hash comparison exit: 0, empty diff.
- HAMR codegen exit: 0.
- Invalid generated `.asInstanceOf` token count: 0.

## Raw evidence

- `projection-final-tipe.log` — final `Well-formed!` result.
- `codegen-unchanged-regeneration.log` — final unchanged-model regeneration.
- `application-hashes-{before,after}-regeneration.sha256` and
  `model-hash-{before,after}-regeneration.sha256` — preservation inputs.
- `final-<crate>.log` — eight raw post-regeneration proof outputs.

## Claim boundary

The result proves the Verus obligations attached to the eight application
entrypoints, including their visible preconditions. It does not prove external
C/FFI bodies, generated transport behavior, the seL4 kernel, end-to-end
scheduling or WCET, physical timing, sensor behavior, or probabilistic safety
claims.
