# Verus verification

## Final result

The final proof run occurred after an unchanged-model HAMR regeneration and
application-file preservation check. All five targets exited 0.

| Component | Application obligations | Errors |
| --- | ---: | ---: |
| Request qualification | 8 | 0 |
| Battery evidence assessment | 9 | 0 |
| Lifecycle governor | 12 | 0 |
| Enablement derivation | 8 | 0 |
| Pilot notice derivation | 9 | 0 |
| **Total** | **46** | **0** |

Each invocation also verified the shared generated `data` crate (32
obligations, zero errors). The cold run verified `vstd` (1190 obligations,
zero errors); the final post-regeneration run reused that build cache. Raw final
output is [`verus.log`](verus.log).

## Reproduce

The installed `cargo-verus` reports Verus `0.2026.01.23`. Its driver uses the
Rust `1.92.0-x86_64-unknown-linux-gnu` sysroot, which must include `rust-src`.
From the repository root:

```bash
export PATH="$HOME/.cargo/bin:$PATH"
for crate in \
  request_qualification_process_request_qualification \
  battery_evidence_assessment_process_battery_evidence_assessment \
  lifecycle_governor_process_lifecycle_governor \
  enablement_derivation_process_enablement_derivation \
  pilot_notice_derivation_process_pilot_notice_derivation
do
  make -C "experiments/rust-verus/drone-lifecycle/rust/hamr/microkit/crates/$crate" verus
done
```

## Regeneration preservation

Before the final proof, SHA-256 hashes were captured for every generated
`*_app.rs` preservation point. HAMR code generation was rerun against the
unchanged repaired candidate model, and `sha256sum -c` returned `OK` for all
six preservation points: the five implemented behavior applications plus the
unchanged generated domain-monitor application. The final proof command above
then passed without further source changes.

## Proof boundary

This is static verification of generated GUMBO-derived Verus contracts against
the Rust application entrypoints. It is not a Microkit image build, hardware or
simulator execution, timing analysis, physical validation, safety case, or
certification result.
