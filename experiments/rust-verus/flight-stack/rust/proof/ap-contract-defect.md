# AP contract defect audit (pre-repair)

## Scope and method

The six `CASE_AP_*` predicates were audited together as the normal-observation
transition relation over the finite typed product:

- prior mode: `{Off, SyncPending, On, CWS, CwsSuspended, Failed}`;
- AP action: `{None, Engage, Disengage, ForceDisengage}`;
- CWS action: `{None, Hold, Release, ForceDisengage}`;
- direct attitude class: `{Invalid, Unsafe, Safe}`;
- AP guidance valid: `{false, true}`.

This is 576 normal typed observations. Initialization is a separate
`CASE_AP_01` branch. The observations below use arbitrary numeric fields because
the AP predicates inspect only the listed enum/Boolean fields.

## Concrete contradictory witnesses

Each witness makes two old implications true while requiring different next
modes.

1. `CASE_AP_02` fault versus explicit disengage:
   `prior=SyncPending`, `apAction=Disengage`, `cwsAction=Release`,
   `attitude=Safe`, `guidanceValid=false`. The Safe/unavailable-guidance guard
   requires `Failed`; the disengage guard simultaneously requires `Off`.
2. `CASE_AP_02` fault versus Unsafe inhibition:
   `prior=SyncPending`, `apAction=ForceDisengage`, `cwsAction=ForceDisengage`,
   `attitude=Unsafe`, `guidanceValid=false`. Invalid authority requires
   `Failed`; Unsafe independently requires `Off`.
3. `CASE_AP_04` fault versus CWS Unsafe suspension:
   `prior=CWS`, `apAction=ForceDisengage`, `cwsAction=Hold`,
   `attitude=Unsafe`, `guidanceValid=false`. Invalid authority requires
   `Failed`; the held/Unsafe implication simultaneously requires
   `CwsSuspended`.
4. `CASE_AP_04` fault versus suspended release:
   `prior=CwsSuspended`, `apAction=ForceDisengage`, `cwsAction=Release`,
   `attitude=Safe`, `guidanceValid=true`. Invalid authority requires `Failed`;
   the release implication simultaneously requires `Off`.
5. `CASE_AP_05` fault versus explicit disengage:
   `prior=On`, `apAction=Disengage`, `cwsAction=Release`, `attitude=Safe`,
   `guidanceValid=false`. Active Safe/unavailable guidance requires `Failed`;
   disengage simultaneously requires `Off`.
6. `CASE_AP_05` fault versus Unsafe inhibition:
   `prior=On`, `apAction=ForceDisengage`, `cwsAction=Release`,
   `attitude=Unsafe`, `guidanceValid=false`. Invalid authority requires
   `Failed`; Unsafe simultaneously requires `Off`.
7. `CASE_AP_03` versus `CASE_AP_04`:
   `prior=CWS`, `apAction=ForceDisengage`, `cwsAction=Hold`, `attitude=Safe`,
   `guidanceValid=false`. `CASE_AP_03`, which has no guidance input and excludes
   no fault action, requires `CWS`; `CASE_AP_04` requires `Failed` for both
   invalid authority and Safe/unavailable guidance.

Because `apObservables` maps each next mode to a distinct status/authority
combination, these are contradictions in the whole observable result, not only
in an internal state name.

## Concrete gaps and priority inversion

1. Uncovered On+hold+Unsafe:
   `prior=On`, `apAction=Engage`, `cwsAction=Hold`, `attitude=Unsafe`,
   `guidanceValid=false`. `CASE_AP_03` is disabled by its Safe guard and
   `CASE_AP_05` is disabled by its `cwsAction != Hold` guard. No other normal
   AP case applies, so the next result is unconstrained.
2. Uncovered CWS+release+Unsafe:
   `prior=CWS`, `apAction=Engage`, `cwsAction=Release`, `attitude=Unsafe`,
   `guidanceValid=false`. `CASE_AP_04` is active, but none of its next-mode
   implications is true. `apObservables` alone permits any mode with its
   matching observables, so no intended transition is selected.
3. Uncovered CwsSuspended+None+Unsafe:
   `prior=CwsSuspended`, `apAction=Engage`, `cwsAction=None`,
   `attitude=Unsafe`, `guidanceValid=false`. Again only `apObservables` applies;
   no next mode is selected.
4. Explicit-disengage priority inversion:
   `prior=On`, `apAction=Disengage`, `cwsAction=Hold`, `attitude=Safe`,
   `guidanceValid=true`. Only `CASE_AP_03` constrains the On observation and
   requires `CWS`, although POL-PRI-01/02 require explicit disengage to select
   `Off` before CWS handling.
5. Fault priority inversion:
   `prior=On`, `apAction=ForceDisengage`, `cwsAction=Hold`, `attitude=Safe`,
   `guidanceValid=true`. Only `CASE_AP_03` constrains the On observation and
   requires `CWS`, although invalid authority must select `Failed` before CWS.

## Repair obligation

The repair must encode one priority-selected result for every typed observation:
initialization/recovery; fault or invalid authority; explicit disengage; Unsafe
inhibition; CWS hold/release; engagement; retention. `CASE_AP_03` therefore
needs the guidance input and higher-priority exclusions. The normal antecedents
for `CASE_AP_03` and `CASE_AP_05` must partition On observations, while the
internal branches of `CASE_AP_01`, `CASE_AP_02`, `CASE_AP_04`, `CASE_AP_05`, and
`CASE_AP_06` must be mutually exclusive and collectively exhaustive for their
owned prior-mode partitions.

