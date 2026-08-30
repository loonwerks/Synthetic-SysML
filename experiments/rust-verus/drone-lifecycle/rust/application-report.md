# Rust application implementation

## Result

All five preserved HAMR application files contain executable `initialize` and
`timeTriggered` implementations. After the final, unchanged-model HAMR
regeneration, all five generated `make verus` targets pass with 46 application
obligations verified and zero errors.

The Application Agent edited only these preserved files:

1. `request_qualification_process_request_qualification_app.rs`
2. `battery_evidence_assessment_process_battery_evidence_assessment_app.rs`
3. `lifecycle_governor_process_lifecycle_governor_app.rs`
4. `enablement_derivation_process_enablement_derivation_app.rs`
5. `pilot_notice_derivation_process_pilot_notice_derivation_app.rs`

HAMR owns the surrounding API, bridge, datatype, GUMBOX, Cargo, and Makefile
content. The generated `#[verus_spec]` attributes are the contracts checked by
Verus; application bodies do not call the generated specification helpers as
runtime logic.

## Implemented behavior

- Request qualification maps invalid samples to `Invalid_Request` and maps all
  eight valid request variants exhaustively.
- Battery assessment distinguishes invalid, adequate, and low evidence, then
  publishes one assessment consistently to both consumers.
- The lifecycle governor implements invalid-input fail-safe handling, recovery
  latching/clearing, switch-off priority, all six enabled transitions, and
  exact hold reasons while updating its owned phase and recovery state.
- Enablement derivation maps every lifecycle phase to the required power,
  charging, and flight command tuple.
- Pilot notice derivation implements the specified priority: input fault,
  recovery pending, charger unavailable, low battery, other rejection, none.

The implementations use exhaustive matching instead of executable enum
`PartialEq`, which Verus does not accept for these generated external enums.

## Compatibility repair

The first proof reached three components but generated invalid runtime GUMBOX
expressions for the lifecycle governor and enablement derivation: GUMBO `T` and
`F` literals became unresolved bare Rust identifiers. The candidate SysML was
repaired at the source boundary by spelling the same 38 Boolean constants as
`true` and `false` (5 true, 33 false). HAMR then regenerated valid runtime and
Verus contract code. No generated bridge was hand-edited and no contract was
weakened; see [`contract-audit.md`](contract-audit.md).

## Integrity checks

- The final HAMR run used the unchanged repaired candidate model.
- SHA-256 checks over all preserved `*_app.rs` files passed after regeneration.
- The final proof run was performed after that preservation check.
- No application implementation added `unsafe`, `assume`, `admit`,
  `unimplemented!`, `todo!`, or a false assertion. HAMR-generated logging
  wrappers retain their pre-existing `#[verus_verify(external_body)]`
  annotations; they are not application proof shortcuts.
- Rust output contains no Scala, Java, JVM project, or generated Slang source.
  The `.slang/*.json` file beside the candidate model is the intentionally
  retained AIR cache, not application output.

See [`../proof/verification.md`](../proof/verification.md) for exact proof
results and reproduction commands.
