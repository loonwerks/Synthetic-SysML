# Application implementation report

All eight HAMR-preserved `*_app.rs` files contain executable behavior and were
verified after unchanged-model regeneration.

| Application owner | Implemented behavior | Explicit proof precondition |
| --- | --- | --- |
| DetectRegulatorFailure | Clears the latch on power epoch; otherwise OR-latches internal failure; preserves epoch/timeout classification | None |
| DetectMonitorFailure | Symmetric monitor failure latch and classification | None |
| ManageRegulatorMode | Power-reset priority; FAILED persistence; INIT health/timeout decision; NORMAL failure transition; publishes both mode outputs | None |
| ManageMonitorMode | Symmetric monitor transition policy; publishes interface and alarm modes | None |
| ManageHeatSource | INIT/FAILED safe-off; NORMAL lower/upper hysteresis; publishes local command | Available derived range is ordered |
| ManageAlarm | INIT off, FAILED on; NORMAL alarm bands with five-tenths hysteresis; publishes local command | Available derived range has safe ±5 arithmetic and at least ten tenths separation |
| ManageRegulatorInterface | Validity qualification, degree-to-tenths conversion, basis construction, status mapping, bounded rounded display | Source Current Temperature and desired-setting data invariants |
| ManageMonitorInterface | Validity qualification, degree-to-tenths conversion, basis construction, status mapping | Source Current Temperature and alarm-setting data invariants |

Initialization entrypoints establish the source initial states and outputs:
both latches false, both modes INIT, heat/alarm commands off, monitor status
Init, and regulator feedback Init with display temperature 68.

The regulator interface proves that every post-state display value remains in
the source-defined 68..105 range. Non-NORMAL modes do not receive a stronger
source requirement; the implementation simply retains the same safe bounded
projection of the shared sample.

The final application hashes are recorded identically before and after the
unchanged-model HAMR regeneration in
`proof/application-hashes-before-regeneration.sha256` and
`proof/application-hashes-after-regeneration.sha256`.
