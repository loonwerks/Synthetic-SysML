# EIT Image Availability and Review Support Coordinator

## Selected system context

### Synopsis, need, purpose, and goals

NEED-01: A Doctor needs a bounded logical service that turns admitted upstream
acquisition events into requested EIT-image-generation work, retains the availability of
one opaque generated image, and makes that image available for human analysis without
automating diagnosis. Acquisition, monitoring, and physical image reconstruction are
outside this system boundary.

PURPOSE-01: The EIT Image Availability and Review Support Coordinator will qualify one
upstream acquisition sample, one Doctor review intent, and one external generation
result; govern one image-availability lifecycle and its recovery phase; issue a finite
generation directive; and publish an opaque image token plus availability status for
Doctor review.

GOAL-01: The system shall produce exactly one coherent next image state, next recovery
state, generation directive, image delivery, and availability status for every finite
input and owner pre-state combination.

GOAL-02: The system shall make an image available only after a result matches the
acquisition token previously selected for generation, and it shall preserve the
distinction between the two opaque tokens without asserting image quality or clinical
meaning.

GOAL-03: The system shall clear availability and enter recovery on invalid or unexpected
generation evidence, block a retained nonneutral intent, observe a neutral intent, and
require a later fresh intent before new generation may begin.

GOAL-04: The system shall give release intent priority over valid pending or matching
completion evidence, while invalid or mismatched evidence remains the highest-priority
fault condition.

### Operational context and exact system boundary

CTX-01: The Doctor is outside the system, supplies a finite image-review intent, and
receives an availability status and at most one opaque image delivery. The source
association grounds Doctor participation in analysis, but it does not establish the
request protocol, exclusive authority, or any diagnostic result used here.

CTX-02: The External Upstream Acquisition Context is outside the system and supplies one
opaque acquisition sample. It represents acquisition only as a completed upstream
observation; this system cannot start, stop, authorize, supervise, or assess
acquisition.

CTX-03: The External Image Generation Context is outside the system, receives one finite
generation directive, and supplies one finite generation-result sample. The directive is
a logical work request and the result is a bounded token, not evidence of a
reconstruction algorithm or image quality.

CTX-04: The source-named `EITSystem` actor is not silently equated with the selected
coordinator. CTX-02 and CTX-03 are pilot boundary roles chosen to preserve the source
ambiguity, and neither is claimed to be the source actor's exclusive or literal
realization.

CTX-05: The EngineerTechnician and Patient remain external declared context with no
modeled input, output, state, control, or scenario step because this selected scope does
not include belt preparation or calibration and the source assigns no Patient use-case
association.

MON-01: `AcquisitionSample` is a finite root input from CTX-02 with `token :
AcquisitionToken` and `status : InputStatus`, where `AcquisitionToken` is exactly
`{NoAcquisition, AcquisitionA, AcquisitionB}` and `InputStatus` is exactly `{Valid,
Invalid}`. A/B are distinct uninterpreted witnesses with no patient, physical, or
quality semantics.

MON-02: `ReviewIntentSample` is a finite root input from CTX-01 with `intent :
ReviewIntent` and `status : InputStatus`, where `ReviewIntent` is exactly `{NoIntent,
RequestImage, ReleaseImage}`. `NoIntent` is the neutral recovery observation,
`RequestImage` requests availability for later human analysis, and `ReleaseImage`
discards retained logical availability.

MON-03: `GenerationResultSample` is a finite root input from CTX-03 with `result :
GenerationResult` and `status : InputStatus`, where `GenerationResult` is exactly
`{NoResult, GenerationFailed, ImageA, ImageB}`. `ImageA` is correlated only with
`AcquisitionA`, and `ImageB` only with `AcquisitionB`, as a pilot token rule.

CTRL-01: `GenerationDirective` is a finite root output to CTX-03 with exactly
`{HoldGeneration, GenerateFromA, GenerateFromB}`. It is a one-evaluation logical request
and does not prove acceptance, execution, completion, or physical image generation.

CTRL-02: `ImageDelivery` is a finite root output to CTX-01 with exactly `{Withheld,
DeliverImageA, DeliverImageB}`. A delivered token indicates only retained logical
availability for review, not correct reconstruction, display, analysis, diagnosis, or
treatment.

CTRL-03: `AvailabilityStatus` is a finite root output to CTX-01 with exactly
`{NoImageAvailable, GenerationPending, ImageAvailable, UpstreamAcquisitionRequired,
GenerationFailedStatus, InputFault, RecoveryPending}`.

### Required behavior, risk, fault response, and recovery

RISK-01: If invalid acquisition, intent, or result evidence, an unsolicited completion,
or an A/B-mismatched completion were trusted, the system could present an image token as
related to the wrong upstream event. The bounded consequence is an incoherent logical
review artifact; no physical harm, likelihood, severity, image-quality, or safety
classification is asserted.

### Essential assumptions and constraints

ASM-01: CTX-01 is responsible for providing exactly one finite intent value and explicit
status per logical evaluation and for presenting `NoIntent` before a post-fault intent
can be considered fresh. This protocol is a pilot assumption, not source-defined Doctor
authority or clinical workflow.

ASM-02: CTX-02 is responsible for providing exactly one acquisition token and status per
logical evaluation. An admitted token means only that an external upstream event is
logically available; it does not prove acquisition authorization, calibration, physical
collection, impedance validity, or patient association.

ASM-03: CTX-03 is responsible for accepting CTRL-01 only as a logical one-evaluation
work request, retaining any accepted target outside this boundary, and returning
`ImageA` only for a prior A target and `ImageB` only for a prior B target. The
correlation rule is a pilot interface assumption, and the system still detects bounded
violations.

ASM-04: All supplying contexts are responsible for holding their finite sample values
stable for one logical evaluation. This supports deterministic snapshot semantics and
makes no real-time duration, synchronization, throughput, or physical simultaneity
claim.

ASM-05: CTX-01 is responsible for treating CTRL-02 as an opaque review-availability
token and CTRL-03 as logical status only. Neither output establishes display
correctness, automated analysis, diagnosis, treatment, patient outcome, or regulatory
acceptability.

## Supporting contract definitions

### State `EIT_Image_Availability_Coordinator::Image_Availability_Governor::image_state`

State `image_state` has type `EIT_Image_Availability_Coordinator::Image_State`.

### State `EIT_Image_Availability_Coordinator::Image_Availability_Governor::recovery_phase`

State `recovery_phase` has type `EIT_Image_Availability_Coordinator::Recovery_Phase`.

### `EIT_Image_Availability_Coordinator::Doctor_Intent_Qualification::qualify_intent`

- Function category: Strictly pure
- Input `value` has type `EIT_Image_Availability_Coordinator::Review_Intent_Sample`.
- Result type: `EIT_Image_Availability_Coordinator::Qualified_Intent`.

> The function returns the value selected as follows:
>
> **If:**
>
> `value.status` is `Input_Status.Invalid`
>
> **Use:**
>
> `Qualified_Intent.InvalidIntent`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value.intent` is `Review_Intent.NoIntent`
>
> **Use:**
>
> `Qualified_Intent.NeutralIntent`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value.intent` is `Review_Intent.RequestImage`
>
> **Use:**
>
> `Qualified_Intent.FreshImageRequest`
>
> **Otherwise use:**
>
> `Qualified_Intent.ReleaseIntent`.

### `EIT_Image_Availability_Coordinator::Doctor_Publication::delivery_for`

- Function category: Strictly pure
- Input `resolution` has type `EIT_Image_Availability_Coordinator::Image_Resolution`.
- Result type: `EIT_Image_Availability_Coordinator::Image_Delivery`.

> The function returns the value selected as follows:
>
> **If:**
>
> `resolution.next_image_state` is `Image_State.ReadyA`
>
> **Use:**
>
> `Image_Delivery.DeliverImageA`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `resolution.next_image_state` is `Image_State.ReadyB`
>
> **Use:**
>
> `Image_Delivery.DeliverImageB`
>
> **Otherwise use:**
>
> `Image_Delivery.Withheld`.

### `EIT_Image_Availability_Coordinator::Doctor_Publication::status_for`

- Function category: Strictly pure
- Input `resolution` has type `EIT_Image_Availability_Coordinator::Image_Resolution`.
- Result type: `EIT_Image_Availability_Coordinator::Availability_Status`.

> The function returns the value selected as follows:
>
> **If:**
>
> `resolution.disposition` is `Resolution_Disposition.InputFaultDisposition`
>
> **Use:**
>
> `Availability_Status.InputFault`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `resolution.disposition` is `Resolution_Disposition.RecoveryDisposition`
>
> **Use:**
>
> `Availability_Status.RecoveryPending`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> At least one of the following conditions holds:
>
>   - `resolution.disposition` is `Resolution_Disposition.GenerationStarted`
>   - `resolution.disposition` is `Resolution_Disposition.GenerationWaiting`
>
> **Use:**
>
> `Availability_Status.GenerationPending`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> At least one of the following conditions holds:
>
>   - `resolution.disposition` is `Resolution_Disposition.GenerationCompleted`
>   - `resolution.disposition` is `Resolution_Disposition.ExistingImageRetained`
>   - `resolution.disposition` is `Resolution_Disposition.AvailableRetained`
>
> **Use:**
>
> `Availability_Status.ImageAvailable`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `resolution.disposition` is `Resolution_Disposition.AcquisitionRequired`
>
> **Use:**
>
> `Availability_Status.UpstreamAcquisitionRequired`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `resolution.disposition` is `Resolution_Disposition.GenerationFailure`
>
> **Use:**
>
> `Availability_Status.GenerationFailedStatus`
>
> **Otherwise use:**
>
> `Availability_Status.NoImageAvailable`.

### `EIT_Image_Availability_Coordinator::Generation_Directive_Derivation::directive_for`

- Function category: Strictly pure
- Input `resolution` has type `EIT_Image_Availability_Coordinator::Image_Resolution`.
- Input `acquisition` has type `EIT_Image_Availability_Coordinator::Qualified_Acquisition`.
- Result type: `EIT_Image_Availability_Coordinator::Generation_Directive`.

> The function returns the value selected as follows:
>
> **If:**
>
> All of the following conditions hold:
>
>   - `resolution.disposition` is `Resolution_Disposition.GenerationStarted`
>   - `acquisition` is `Qualified_Acquisition.AdmittedA`
>
> **Use:**
>
> `Generation_Directive.GenerateFromA`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> All of the following conditions hold:
>
>   - `resolution.disposition` is `Resolution_Disposition.GenerationStarted`
>   - `acquisition` is `Qualified_Acquisition.AdmittedB`
>
> **Use:**
>
> `Generation_Directive.GenerateFromB`
>
> **Otherwise use:**
>
> `Generation_Directive.HoldGeneration`.

### `EIT_Image_Availability_Coordinator::Generation_Result_Qualification::qualify_result`

- Function category: Strictly pure
- Input `value` has type `EIT_Image_Availability_Coordinator::Generation_Result_Sample`.
- Result type: `EIT_Image_Availability_Coordinator::Qualified_Generation_Result`.

> The function returns the value selected as follows:
>
> **If:**
>
> `value.status` is `Input_Status.Invalid`
>
> **Use:**
>
> `Qualified_Generation_Result.InvalidGenerationResult`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value.result` is `Generation_Result.NoResult`
>
> **Use:**
>
> `Qualified_Generation_Result.PendingResult`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value.result` is `Generation_Result.GenerationFailed`
>
> **Use:**
>
> `Qualified_Generation_Result.FailedResult`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value.result` is `Generation_Result.ImageA`
>
> **Use:**
>
> `Qualified_Generation_Result.ReadyResultA`
>
> **Otherwise use:**
>
> `Qualified_Generation_Result.ReadyResultB`.

### `EIT_Image_Availability_Coordinator::Image_Availability_Governor::is_requested`

- Function category: Strictly pure
- Input `value` has type `EIT_Image_Availability_Coordinator::Image_State`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when `value` is `Image_State.RequestedA` or `value` is `Image_State.RequestedB`.

### `EIT_Image_Availability_Coordinator::Image_Availability_Governor::matching_ready`

- Function category: Strictly pure
- Input `state_pre` has type `EIT_Image_Availability_Coordinator::Image_State`.
- Input `result` has type `EIT_Image_Availability_Coordinator::Qualified_Generation_Result`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - `state_pre` is `Image_State.RequestedA`
>       - `result` is `Qualified_Generation_Result.ReadyResultA`
>   - All of the following conditions hold:
>     
>       - `state_pre` is `Image_State.RequestedB`
>       - `result` is `Qualified_Generation_Result.ReadyResultB`.

### `EIT_Image_Availability_Coordinator::Image_Availability_Governor::expected_nonpending`

- Function category: Strictly pure
- Input `state_pre` has type `EIT_Image_Availability_Coordinator::Image_State`.
- Input `result` has type `EIT_Image_Availability_Coordinator::Qualified_Generation_Result`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - the result of `is_requested` for (`state_pre`) is true
>       - `result` is `Qualified_Generation_Result.FailedResult`
>   - the result of `matching_ready` for (`state_pre`, `result`) is true.

### `EIT_Image_Availability_Coordinator::Image_Availability_Governor::unexpected_valid_result`

- Function category: Strictly pure
- Input `state_pre` has type `EIT_Image_Availability_Coordinator::Image_State`.
- Input `result` has type `EIT_Image_Availability_Coordinator::Qualified_Generation_Result`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - `result` is `Qualified_Generation_Result.FailedResult`
>       - `result` is `Qualified_Generation_Result.ReadyResultA`
>       - `result` is `Qualified_Generation_Result.ReadyResultB`
>   - It is not the case that:
>     
>     the result of `expected_nonpending` for (`state_pre`, `result`) is true.

### `EIT_Image_Availability_Coordinator::Image_Availability_Governor::case_01_guard`

- Function category: Strictly pure
- Input `acquisition` has type `EIT_Image_Availability_Coordinator::Qualified_Acquisition`.
- Input `intent` has type `EIT_Image_Availability_Coordinator::Qualified_Intent`.
- Input `result` has type `EIT_Image_Availability_Coordinator::Qualified_Generation_Result`.
- Input `state_pre` has type `EIT_Image_Availability_Coordinator::Image_State`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when At least one of the following conditions holds:
>
>   - `acquisition` is `Qualified_Acquisition.InvalidAcquisition`
>   - `intent` is `Qualified_Intent.InvalidIntent`
>   - `result` is `Qualified_Generation_Result.InvalidGenerationResult`
>   - the result of `unexpected_valid_result` for (`state_pre`, `result`) is true.

### `EIT_Image_Availability_Coordinator::Image_Availability_Governor::case_02_guard`

- Function category: Strictly pure
- Input `acquisition` has type `EIT_Image_Availability_Coordinator::Qualified_Acquisition`.
- Input `intent` has type `EIT_Image_Availability_Coordinator::Qualified_Intent`.
- Input `result` has type `EIT_Image_Availability_Coordinator::Qualified_Generation_Result`.
- Input `state_pre` has type `EIT_Image_Availability_Coordinator::Image_State`.
- Input `phase_pre` has type `EIT_Image_Availability_Coordinator::Recovery_Phase`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when All of the following conditions hold:
>
>   - It is not the case that:
>     
>     the result of `case_01_guard` for (`acquisition`, `intent`, `result`, `state_pre`) is true
>   - `phase_pre` is `Recovery_Phase.AwaitNeutral`
>   - `intent` is not `Qualified_Intent.NeutralIntent`.

### `EIT_Image_Availability_Coordinator::Image_Availability_Governor::case_03_guard`

- Function category: Strictly pure
- Input `acquisition` has type `EIT_Image_Availability_Coordinator::Qualified_Acquisition`.
- Input `intent` has type `EIT_Image_Availability_Coordinator::Qualified_Intent`.
- Input `result` has type `EIT_Image_Availability_Coordinator::Qualified_Generation_Result`.
- Input `state_pre` has type `EIT_Image_Availability_Coordinator::Image_State`.
- Input `phase_pre` has type `EIT_Image_Availability_Coordinator::Recovery_Phase`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when All of the following conditions hold:
>
>   - It is not the case that:
>     
>     the result of `case_01_guard` for (`acquisition`, `intent`, `result`, `state_pre`) is true
>   - `phase_pre` is `Recovery_Phase.AwaitNeutral`
>   - `intent` is `Qualified_Intent.NeutralIntent`.

### `EIT_Image_Availability_Coordinator::Image_Availability_Governor::case_04_guard`

- Function category: Strictly pure
- Input `acquisition` has type `EIT_Image_Availability_Coordinator::Qualified_Acquisition`.
- Input `intent` has type `EIT_Image_Availability_Coordinator::Qualified_Intent`.
- Input `result` has type `EIT_Image_Availability_Coordinator::Qualified_Generation_Result`.
- Input `state_pre` has type `EIT_Image_Availability_Coordinator::Image_State`.
- Input `phase_pre` has type `EIT_Image_Availability_Coordinator::Recovery_Phase`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when All of the following conditions hold:
>
>   - It is not the case that:
>     
>     the result of `case_01_guard` for (`acquisition`, `intent`, `result`, `state_pre`) is true
>   - `phase_pre` is `Recovery_Phase.AwaitFreshIntent`
>   - `intent` is `Qualified_Intent.NeutralIntent`.

### `EIT_Image_Availability_Coordinator::Image_Availability_Governor::case_05_guard`

- Function category: Strictly pure
- Input `acquisition` has type `EIT_Image_Availability_Coordinator::Qualified_Acquisition`.
- Input `intent` has type `EIT_Image_Availability_Coordinator::Qualified_Intent`.
- Input `result` has type `EIT_Image_Availability_Coordinator::Qualified_Generation_Result`.
- Input `state_pre` has type `EIT_Image_Availability_Coordinator::Image_State`.
- Input `phase_pre` has type `EIT_Image_Availability_Coordinator::Recovery_Phase`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when All of the following conditions hold:
>
>   - It is not the case that:
>     
>     the result of `case_01_guard` for (`acquisition`, `intent`, `result`, `state_pre`) is true
>   - `phase_pre` is `Recovery_Phase.AwaitFreshIntent`
>   - `intent` is `Qualified_Intent.ReleaseIntent`.

### `EIT_Image_Availability_Coordinator::Image_Availability_Governor::case_06_guard`

- Function category: Strictly pure
- Input `acquisition` has type `EIT_Image_Availability_Coordinator::Qualified_Acquisition`.
- Input `intent` has type `EIT_Image_Availability_Coordinator::Qualified_Intent`.
- Input `result` has type `EIT_Image_Availability_Coordinator::Qualified_Generation_Result`.
- Input `state_pre` has type `EIT_Image_Availability_Coordinator::Image_State`.
- Input `phase_pre` has type `EIT_Image_Availability_Coordinator::Recovery_Phase`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when All of the following conditions hold:
>
>   - It is not the case that:
>     
>     the result of `case_01_guard` for (`acquisition`, `intent`, `result`, `state_pre`) is true
>   - `phase_pre` is `Recovery_Phase.AwaitFreshIntent`
>   - `intent` is `Qualified_Intent.FreshImageRequest`.

### `EIT_Image_Availability_Coordinator::Image_Availability_Governor::case_07_guard`

- Function category: Strictly pure
- Input `acquisition` has type `EIT_Image_Availability_Coordinator::Qualified_Acquisition`.
- Input `intent` has type `EIT_Image_Availability_Coordinator::Qualified_Intent`.
- Input `result` has type `EIT_Image_Availability_Coordinator::Qualified_Generation_Result`.
- Input `state_pre` has type `EIT_Image_Availability_Coordinator::Image_State`.
- Input `phase_pre` has type `EIT_Image_Availability_Coordinator::Recovery_Phase`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when All of the following conditions hold:
>
>   - It is not the case that:
>     
>     the result of `case_01_guard` for (`acquisition`, `intent`, `result`, `state_pre`) is true
>   - `phase_pre` is `Recovery_Phase.Normal`
>   - `intent` is `Qualified_Intent.ReleaseIntent`.

### `EIT_Image_Availability_Coordinator::Image_Availability_Governor::case_08_guard`

- Function category: Strictly pure
- Input `acquisition` has type `EIT_Image_Availability_Coordinator::Qualified_Acquisition`.
- Input `intent` has type `EIT_Image_Availability_Coordinator::Qualified_Intent`.
- Input `result` has type `EIT_Image_Availability_Coordinator::Qualified_Generation_Result`.
- Input `state_pre` has type `EIT_Image_Availability_Coordinator::Image_State`.
- Input `phase_pre` has type `EIT_Image_Availability_Coordinator::Recovery_Phase`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when All of the following conditions hold:
>
>   - It is not the case that:
>     
>     the result of `case_01_guard` for (`acquisition`, `intent`, `result`, `state_pre`) is true
>   - `phase_pre` is `Recovery_Phase.Normal`
>   - `intent` is not `Qualified_Intent.ReleaseIntent`
>   - the result of `is_requested` for (`state_pre`) is true
>   - `result` is `Qualified_Generation_Result.FailedResult`.

### `EIT_Image_Availability_Coordinator::Image_Availability_Governor::case_09_guard`

- Function category: Strictly pure
- Input `acquisition` has type `EIT_Image_Availability_Coordinator::Qualified_Acquisition`.
- Input `intent` has type `EIT_Image_Availability_Coordinator::Qualified_Intent`.
- Input `result` has type `EIT_Image_Availability_Coordinator::Qualified_Generation_Result`.
- Input `state_pre` has type `EIT_Image_Availability_Coordinator::Image_State`.
- Input `phase_pre` has type `EIT_Image_Availability_Coordinator::Recovery_Phase`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when All of the following conditions hold:
>
>   - It is not the case that:
>     
>     the result of `case_01_guard` for (`acquisition`, `intent`, `result`, `state_pre`) is true
>   - `phase_pre` is `Recovery_Phase.Normal`
>   - `intent` is not `Qualified_Intent.ReleaseIntent`
>   - the result of `matching_ready` for (`state_pre`, `result`) is true.

### `EIT_Image_Availability_Coordinator::Image_Availability_Governor::case_10_guard`

- Function category: Strictly pure
- Input `acquisition` has type `EIT_Image_Availability_Coordinator::Qualified_Acquisition`.
- Input `intent` has type `EIT_Image_Availability_Coordinator::Qualified_Intent`.
- Input `result` has type `EIT_Image_Availability_Coordinator::Qualified_Generation_Result`.
- Input `state_pre` has type `EIT_Image_Availability_Coordinator::Image_State`.
- Input `phase_pre` has type `EIT_Image_Availability_Coordinator::Recovery_Phase`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when All of the following conditions hold:
>
>   - It is not the case that:
>     
>     the result of `case_01_guard` for (`acquisition`, `intent`, `result`, `state_pre`) is true
>   - `phase_pre` is `Recovery_Phase.Normal`
>   - `intent` is not `Qualified_Intent.ReleaseIntent`
>   - the result of `is_requested` for (`state_pre`) is true
>   - `result` is `Qualified_Generation_Result.PendingResult`.

### `EIT_Image_Availability_Coordinator::Image_Availability_Governor::case_11_guard`

- Function category: Strictly pure
- Input `acquisition` has type `EIT_Image_Availability_Coordinator::Qualified_Acquisition`.
- Input `intent` has type `EIT_Image_Availability_Coordinator::Qualified_Intent`.
- Input `result` has type `EIT_Image_Availability_Coordinator::Qualified_Generation_Result`.
- Input `state_pre` has type `EIT_Image_Availability_Coordinator::Image_State`.
- Input `phase_pre` has type `EIT_Image_Availability_Coordinator::Recovery_Phase`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when All of the following conditions hold:
>
>   - It is not the case that:
>     
>     the result of `case_01_guard` for (`acquisition`, `intent`, `result`, `state_pre`) is true
>   - `phase_pre` is `Recovery_Phase.Normal`
>   - `intent` is `Qualified_Intent.FreshImageRequest`
>   - It is not the case that:
>     
>     the result of `is_requested` for (`state_pre`) is true
>   - `result` is `Qualified_Generation_Result.PendingResult`.

### `EIT_Image_Availability_Coordinator::Image_Availability_Governor::case_12_guard`

- Function category: Strictly pure
- Input `acquisition` has type `EIT_Image_Availability_Coordinator::Qualified_Acquisition`.
- Input `intent` has type `EIT_Image_Availability_Coordinator::Qualified_Intent`.
- Input `result` has type `EIT_Image_Availability_Coordinator::Qualified_Generation_Result`.
- Input `state_pre` has type `EIT_Image_Availability_Coordinator::Image_State`.
- Input `phase_pre` has type `EIT_Image_Availability_Coordinator::Recovery_Phase`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when All of the following conditions hold:
>
>   - It is not the case that:
>     
>     the result of `case_01_guard` for (`acquisition`, `intent`, `result`, `state_pre`) is true
>   - `phase_pre` is `Recovery_Phase.Normal`
>   - `intent` is `Qualified_Intent.NeutralIntent`
>   - It is not the case that:
>     
>     the result of `is_requested` for (`state_pre`) is true
>   - `result` is `Qualified_Generation_Result.PendingResult`.

### `EIT_Image_Availability_Coordinator::Image_Availability_Governor::requested_state`

- Function category: Strictly pure
- Input `acquisition` has type `EIT_Image_Availability_Coordinator::Qualified_Acquisition`.
- Result type: `EIT_Image_Availability_Coordinator::Image_State`.

> The function returns the value selected as follows:
>
> **If:**
>
> `acquisition` is `Qualified_Acquisition.AdmittedA`
>
> **Use:**
>
> `Image_State.RequestedA`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `acquisition` is `Qualified_Acquisition.AdmittedB`
>
> **Use:**
>
> `Image_State.RequestedB`
>
> **Otherwise use:**
>
> `Image_State.Empty`.

### `EIT_Image_Availability_Coordinator::Image_Availability_Governor::selected_image`

- Function category: Strictly pure
- Input `acquisition` has type `EIT_Image_Availability_Coordinator::Qualified_Acquisition`.
- Input `intent` has type `EIT_Image_Availability_Coordinator::Qualified_Intent`.
- Input `result` has type `EIT_Image_Availability_Coordinator::Qualified_Generation_Result`.
- Input `state_pre` has type `EIT_Image_Availability_Coordinator::Image_State`.
- Input `phase_pre` has type `EIT_Image_Availability_Coordinator::Recovery_Phase`.
- Result type: `EIT_Image_Availability_Coordinator::Image_State`.

> The function returns the value selected as follows:
>
> **If:**
>
> the result of `case_01_guard` for (`acquisition`, `intent`, `result`, `state_pre`) is true
>
> **Use:**
>
> `Image_State.Empty`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `phase_pre` is `Recovery_Phase.AwaitNeutral`
>
> **Use:**
>
> `Image_State.Empty`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> All of the following conditions hold:
>
>   - `phase_pre` is `Recovery_Phase.AwaitFreshIntent`
>   - `intent` is `Qualified_Intent.NeutralIntent`
>
> **Use:**
>
> `Image_State.Empty`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> All of the following conditions hold:
>
>   - `phase_pre` is `Recovery_Phase.AwaitFreshIntent`
>   - `intent` is `Qualified_Intent.ReleaseIntent`
>
> **Use:**
>
> `Image_State.Empty`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `phase_pre` is `Recovery_Phase.AwaitFreshIntent`
>
> **Use:**
>
> the result of `requested_state` for (`acquisition`)
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `intent` is `Qualified_Intent.ReleaseIntent`
>
> **Use:**
>
> `Image_State.Empty`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> All of the following conditions hold:
>
>   - the result of `is_requested` for (`state_pre`) is true
>   - `result` is `Qualified_Generation_Result.FailedResult`
>
> **Use:**
>
> `Image_State.Empty`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> All of the following conditions hold:
>
>   - `state_pre` is `Image_State.RequestedA`
>   - `result` is `Qualified_Generation_Result.ReadyResultA`
>
> **Use:**
>
> `Image_State.ReadyA`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> All of the following conditions hold:
>
>   - `state_pre` is `Image_State.RequestedB`
>   - `result` is `Qualified_Generation_Result.ReadyResultB`
>
> **Use:**
>
> `Image_State.ReadyB`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> the result of `is_requested` for (`state_pre`) is true
>
> **Use:**
>
> `state_pre`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> All of the following conditions hold:
>
>   - `intent` is `Qualified_Intent.FreshImageRequest`
>   - `acquisition` is `Qualified_Acquisition.AdmittedA`
>
> **Use:**
>
> `Image_State.RequestedA`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> All of the following conditions hold:
>
>   - `intent` is `Qualified_Intent.FreshImageRequest`
>   - `acquisition` is `Qualified_Acquisition.AdmittedB`
>
> **Use:**
>
> `Image_State.RequestedB`
>
> **Otherwise use:**
>
> `state_pre`.

### `EIT_Image_Availability_Coordinator::Image_Availability_Governor::selected_phase`

- Function category: Strictly pure
- Input `acquisition` has type `EIT_Image_Availability_Coordinator::Qualified_Acquisition`.
- Input `intent` has type `EIT_Image_Availability_Coordinator::Qualified_Intent`.
- Input `result` has type `EIT_Image_Availability_Coordinator::Qualified_Generation_Result`.
- Input `state_pre` has type `EIT_Image_Availability_Coordinator::Image_State`.
- Input `phase_pre` has type `EIT_Image_Availability_Coordinator::Recovery_Phase`.
- Result type: `EIT_Image_Availability_Coordinator::Recovery_Phase`.

> The function returns the value selected as follows:
>
> **If:**
>
> the result of `case_01_guard` for (`acquisition`, `intent`, `result`, `state_pre`) is true
>
> **Use:**
>
> `Recovery_Phase.AwaitNeutral`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> All of the following conditions hold:
>
>   - `phase_pre` is `Recovery_Phase.AwaitNeutral`
>   - `intent` is `Qualified_Intent.NeutralIntent`
>
> **Use:**
>
> `Recovery_Phase.AwaitFreshIntent`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `phase_pre` is `Recovery_Phase.AwaitNeutral`
>
> **Use:**
>
> `Recovery_Phase.AwaitNeutral`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> All of the following conditions hold:
>
>   - `phase_pre` is `Recovery_Phase.AwaitFreshIntent`
>   - `intent` is `Qualified_Intent.NeutralIntent`
>
> **Use:**
>
> `Recovery_Phase.AwaitFreshIntent`
>
> **Otherwise use:**
>
> `Recovery_Phase.Normal`.

### `EIT_Image_Availability_Coordinator::Image_Availability_Governor::selected_disposition`

- Function category: Strictly pure
- Input `acquisition` has type `EIT_Image_Availability_Coordinator::Qualified_Acquisition`.
- Input `intent` has type `EIT_Image_Availability_Coordinator::Qualified_Intent`.
- Input `result` has type `EIT_Image_Availability_Coordinator::Qualified_Generation_Result`.
- Input `state_pre` has type `EIT_Image_Availability_Coordinator::Image_State`.
- Input `phase_pre` has type `EIT_Image_Availability_Coordinator::Recovery_Phase`.
- Result type: `EIT_Image_Availability_Coordinator::Resolution_Disposition`.

> The function returns the value selected as follows:
>
> **If:**
>
> the result of `case_01_guard` for (`acquisition`, `intent`, `result`, `state_pre`) is true
>
> **Use:**
>
> `Resolution_Disposition.InputFaultDisposition`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `phase_pre` is `Recovery_Phase.AwaitNeutral`
>
> **Use:**
>
> `Resolution_Disposition.RecoveryDisposition`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> All of the following conditions hold:
>
>   - `phase_pre` is `Recovery_Phase.AwaitFreshIntent`
>   - `intent` is `Qualified_Intent.NeutralIntent`
>
> **Use:**
>
> `Resolution_Disposition.RecoveryDisposition`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> All of the following conditions hold:
>
>   - `phase_pre` is `Recovery_Phase.AwaitFreshIntent`
>   - `intent` is `Qualified_Intent.ReleaseIntent`
>
> **Use:**
>
> `Resolution_Disposition.ReleasedDisposition`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> All of the following conditions hold:
>
>   - `phase_pre` is `Recovery_Phase.AwaitFreshIntent`
>   - `acquisition` is `Qualified_Acquisition.NoAdmittedAcquisition`
>
> **Use:**
>
> `Resolution_Disposition.AcquisitionRequired`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `phase_pre` is `Recovery_Phase.AwaitFreshIntent`
>
> **Use:**
>
> `Resolution_Disposition.GenerationStarted`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `intent` is `Qualified_Intent.ReleaseIntent`
>
> **Use:**
>
> `Resolution_Disposition.ReleasedDisposition`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> All of the following conditions hold:
>
>   - the result of `is_requested` for (`state_pre`) is true
>   - `result` is `Qualified_Generation_Result.FailedResult`
>
> **Use:**
>
> `Resolution_Disposition.GenerationFailure`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> the result of `matching_ready` for (`state_pre`, `result`) is true
>
> **Use:**
>
> `Resolution_Disposition.GenerationCompleted`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> the result of `is_requested` for (`state_pre`) is true
>
> **Use:**
>
> `Resolution_Disposition.GenerationWaiting`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> All of the following conditions hold:
>
>   - `intent` is `Qualified_Intent.FreshImageRequest`
>   - `acquisition` is not `Qualified_Acquisition.NoAdmittedAcquisition`
>
> **Use:**
>
> `Resolution_Disposition.GenerationStarted`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> All of the following conditions hold:
>
>   - `intent` is `Qualified_Intent.FreshImageRequest`
>   - `state_pre` is not `Image_State.Empty`
>
> **Use:**
>
> `Resolution_Disposition.ExistingImageRetained`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `intent` is `Qualified_Intent.FreshImageRequest`
>
> **Use:**
>
> `Resolution_Disposition.AcquisitionRequired`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `state_pre` is not `Image_State.Empty`
>
> **Use:**
>
> `Resolution_Disposition.AvailableRetained`
>
> **Otherwise use:**
>
> `Resolution_Disposition.IdleDisposition`.

### `EIT_Image_Availability_Coordinator::Upstream_Acquisition_Qualification::qualify_acquisition`

- Function category: Strictly pure
- Input `value` has type `EIT_Image_Availability_Coordinator::Acquisition_Sample`.
- Result type: `EIT_Image_Availability_Coordinator::Qualified_Acquisition`.

> The function returns the value selected as follows:
>
> **If:**
>
> `value.status` is `Input_Status.Invalid`
>
> **Use:**
>
> `Qualified_Acquisition.InvalidAcquisition`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value.token` is `Acquisition_Token.NoAcquisition`
>
> **Use:**
>
> `Qualified_Acquisition.NoAdmittedAcquisition`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value.token` is `Acquisition_Token.AcquisitionA`
>
> **Use:**
>
> `Qualified_Acquisition.AdmittedA`
>
> **Otherwise use:**
>
> `Qualified_Acquisition.AdmittedB`.

## Detailed behavioral requirements

### Requirements for Doctor Intent Qualification

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_INTENT_QUALIFICATION_SAFE` — Required behavior

> During contract evaluation for the initialization phase, Doctor Intent Qualification shall set qualified intent to InvalidIntent.

#### Contract clauses evaluated in the compute phase

##### `INTENT_QUALIFICATION_TOTAL` — Required behavior

> During contract evaluation for the compute phase, Doctor Intent Qualification shall set qualified intent to the result of Doctor Intent Qualification image availability process doctor intent qualification qualify intent for (review intent sample).

### Requirements for Doctor Publication

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_PUBLICATION_SAFE` — Required behavior

> During contract evaluation for the initialization phase, Doctor Publication shall set image delivery to Withheld and availability status to NoImageAvailable.

#### Contract clauses evaluated in the compute phase

##### `PUBLICATION_JOINT_CLASSIFICATION` — Required behavior

> During contract evaluation for the compute phase, Doctor Publication shall set image delivery to the result of Doctor Publication image availability process doctor publication delivery for for (image resolution) and availability status to the result of Doctor Publication image availability process doctor publication status for for (image resolution).

### Requirements for Generation Directive Derivation

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_DIRECTIVE_SAFE` — Required behavior

> During contract evaluation for the initialization phase, Generation Directive Derivation shall set generation directive to HoldGeneration.

#### Contract clauses evaluated in the compute phase

##### `DIRECTIVE_TWO_INPUT_GATE` — Required behavior

> During contract evaluation for the compute phase, Generation Directive Derivation shall set generation directive to the result of Generation Directive Derivation image availability process generation directive derivation directive for for (image resolution, qualified acquisition).

### Requirements for Generation Result Qualification

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_RESULT_QUALIFICATION_SAFE` — Required behavior

> During contract evaluation for the initialization phase, Generation Result Qualification shall set qualified generation result to InvalidGenerationResult.

#### Contract clauses evaluated in the compute phase

##### `RESULT_QUALIFICATION_TOTAL` — Required behavior

> During contract evaluation for the compute phase, Generation Result Qualification shall set qualified generation result to the result of Generation Result Qualification image availability process generation result qualification qualify result for (generation result sample).

### Requirements for Image Availability Governor

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_GOVERNOR_SAFE` — Required behavior

> During contract evaluation for the initialization phase, Image Availability Governor shall set image state to Empty, recovery phase to Normal, generation resolution next image state to Empty, generation resolution next recovery phase to Normal, generation resolution disposition to IdleDisposition, publication resolution next image state to Empty, publication resolution next recovery phase to Normal, and publication resolution disposition to IdleDisposition.

#### Contract clauses evaluated in the compute phase

##### `COMMITTED_RESOLUTION_COHERENCE` — Required behavior

> During contract evaluation for the compute phase, Image Availability Governor shall set image state to the result of Image Availability Governor image availability process image availability governor selected image for (qualified acquisition, qualified intent, qualified generation result, the value of image state on entry, the value of recovery phase on entry), recovery phase to the result of Image Availability Governor image availability process image availability governor selected phase for (qualified acquisition, qualified intent, qualified generation result, the value of image state on entry, the value of recovery phase on entry), generation resolution next image state to image state, generation resolution next recovery phase to recovery phase, generation resolution disposition to the result of Image Availability Governor image availability process image availability governor selected disposition for (qualified acquisition, qualified intent, qualified generation result, the value of image state on entry, the value of recovery phase on entry), publication resolution next image state to image state, publication resolution next recovery phase to recovery phase, and publication resolution disposition to generation resolution disposition.

##### `RECOVERY_STATE_INVARIANT` — Required behavior

> During contract evaluation for the compute phase, Image Availability Governor shall produce a result for which recovery phase is Normal or image state is Empty.

##### `CASE_01_INVALID_OR_UNEXPECTED` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 01 INVALID OR UNEXPECTED applies under all of the following conditions:
>
> the result of Image Availability Governor image availability process image availability governor case 01 guard for (qualified acquisition, qualified intent, qualified generation result, the value of image state on entry) is true.

> When all applicability conditions are met, Image Availability Governor shall produce a result for which all of the following conditions hold:
>
> image state is Empty, recovery phase is AwaitNeutral, and generation resolution disposition is InputFaultDisposition.

##### `CASE_02_RETAINED_NONNEUTRAL_RECOVERY` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 02 RETAINED NONNEUTRAL RECOVERY applies under all of the following conditions:
>
> the result of Image Availability Governor image availability process image availability governor case 02 guard for (qualified acquisition, qualified intent, qualified generation result, the value of image state on entry, the value of recovery phase on entry) is true.

> When all applicability conditions are met, Image Availability Governor shall produce a result for which all of the following conditions hold:
>
> image state is Empty, recovery phase is AwaitNeutral, and generation resolution disposition is RecoveryDisposition.

##### `CASE_03_FIRST_NEUTRAL_RECOVERY` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 03 FIRST NEUTRAL RECOVERY applies under all of the following conditions:
>
> the result of Image Availability Governor image availability process image availability governor case 03 guard for (qualified acquisition, qualified intent, qualified generation result, the value of image state on entry, the value of recovery phase on entry) is true.

> When all applicability conditions are met, Image Availability Governor shall produce a result for which all of the following conditions hold:
>
> image state is Empty, recovery phase is AwaitFreshIntent, and generation resolution disposition is RecoveryDisposition.

##### `CASE_04_WAIT_FOR_FRESH_INTENT` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 04 WAIT FOR FRESH INTENT applies under all of the following conditions:
>
> the result of Image Availability Governor image availability process image availability governor case 04 guard for (qualified acquisition, qualified intent, qualified generation result, the value of image state on entry, the value of recovery phase on entry) is true.

> When all applicability conditions are met, Image Availability Governor shall produce a result for which all of the following conditions hold:
>
> image state is Empty, recovery phase is AwaitFreshIntent, and generation resolution disposition is RecoveryDisposition.

##### `CASE_05_FRESH_RELEASE` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 05 FRESH RELEASE applies under all of the following conditions:
>
> the result of Image Availability Governor image availability process image availability governor case 05 guard for (qualified acquisition, qualified intent, qualified generation result, the value of image state on entry, the value of recovery phase on entry) is true.

> When all applicability conditions are met, Image Availability Governor shall produce a result for which all of the following conditions hold:
>
> image state is Empty, recovery phase is Normal, and generation resolution disposition is ReleasedDisposition.

##### `CASE_06_FRESH_RECOVERY_REQUEST` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 06 FRESH RECOVERY REQUEST applies under all of the following conditions:
>
> the result of Image Availability Governor image availability process image availability governor case 06 guard for (qualified acquisition, qualified intent, qualified generation result, the value of image state on entry, the value of recovery phase on entry) is true.

> When all applicability conditions are met, Image Availability Governor shall produce a result for which all of the following conditions hold:
>
> image state is the result of Image Availability Governor image availability process image availability governor requested state for (qualified acquisition), recovery phase is Normal, and generation resolution disposition is the value selected as follows:
>
> **If:**
>
> qualified acquisition is NoAdmittedAcquisition
>
> **Use:**
>
> AcquisitionRequired
>
> **Otherwise use:**
>
> GenerationStarted.

##### `CASE_07_NORMAL_RELEASE` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 07 NORMAL RELEASE applies under all of the following conditions:
>
> the result of Image Availability Governor image availability process image availability governor case 07 guard for (qualified acquisition, qualified intent, qualified generation result, the value of image state on entry, the value of recovery phase on entry) is true.

> When all applicability conditions are met, Image Availability Governor shall produce a result for which all of the following conditions hold:
>
> image state is Empty, recovery phase is Normal, and generation resolution disposition is ReleasedDisposition.

##### `CASE_08_EXPECTED_GENERATION_FAILURE` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 08 EXPECTED GENERATION FAILURE applies under all of the following conditions:
>
> the result of Image Availability Governor image availability process image availability governor case 08 guard for (qualified acquisition, qualified intent, qualified generation result, the value of image state on entry, the value of recovery phase on entry) is true.

> When all applicability conditions are met, Image Availability Governor shall produce a result for which all of the following conditions hold:
>
> image state is Empty, recovery phase is Normal, and generation resolution disposition is GenerationFailure.

##### `CASE_09_MATCHING_COMPLETION` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 09 MATCHING COMPLETION applies under all of the following conditions:
>
> the result of Image Availability Governor image availability process image availability governor case 09 guard for (qualified acquisition, qualified intent, qualified generation result, the value of image state on entry, the value of recovery phase on entry) is true.

> When all applicability conditions are met, Image Availability Governor shall produce a result for which all of the following conditions hold:
>
> image state is the value selected as follows:
>
> **If:**
>
> the value of image state on entry is RequestedA
>
> **Use:**
>
> ReadyA
>
> **Otherwise use:**
>
> ReadyB, recovery phase is Normal, and generation resolution disposition is GenerationCompleted.

##### `CASE_10_GENERATION_WAITING` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 10 GENERATION WAITING applies under all of the following conditions:
>
> the result of Image Availability Governor image availability process image availability governor case 10 guard for (qualified acquisition, qualified intent, qualified generation result, the value of image state on entry, the value of recovery phase on entry) is true.

> When all applicability conditions are met, Image Availability Governor shall produce a result for which all of the following conditions hold:
>
> image state is the value of image state on entry, recovery phase is Normal, and generation resolution disposition is GenerationWaiting.

##### `CASE_11_NORMAL_FRESH_REQUEST` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 11 NORMAL FRESH REQUEST applies under all of the following conditions:
>
> the result of Image Availability Governor image availability process image availability governor case 11 guard for (qualified acquisition, qualified intent, qualified generation result, the value of image state on entry, the value of recovery phase on entry) is true.

> When all applicability conditions are met, Image Availability Governor shall produce a result for which all of the following conditions hold:
>
> image state is the value selected as follows:
>
> **If:**
>
> qualified acquisition is AdmittedA
>
> **Use:**
>
> RequestedA
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> qualified acquisition is AdmittedB
>
> **Use:**
>
> RequestedB
>
> **Otherwise use:**
>
> the value of image state on entry, recovery phase is Normal, and generation resolution disposition is the value selected as follows:
>
> **If:**
>
> At least one of the following conditions holds:
>
>   - qualified acquisition is AdmittedA
>   - qualified acquisition is AdmittedB
>
> **Use:**
>
> GenerationStarted
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> the value of image state on entry is Empty
>
> **Use:**
>
> AcquisitionRequired
>
> **Otherwise use:**
>
> ExistingImageRetained.

##### `CASE_12_NEUTRAL_RETENTION` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 12 NEUTRAL RETENTION applies under all of the following conditions:
>
> the result of Image Availability Governor image availability process image availability governor case 12 guard for (qualified acquisition, qualified intent, qualified generation result, the value of image state on entry, the value of recovery phase on entry) is true.

> When all applicability conditions are met, Image Availability Governor shall produce a result for which all of the following conditions hold:
>
> image state is the value of image state on entry, recovery phase is Normal, and generation resolution disposition is the value selected as follows:
>
> **If:**
>
> the value of image state on entry is Empty
>
> **Use:**
>
> IdleDisposition
>
> **Otherwise use:**
>
> AvailableRetained.

### Requirements for Upstream Acquisition Qualification

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_ACQUISITION_QUALIFICATION_SAFE` — Required behavior

> During contract evaluation for the initialization phase, Upstream Acquisition Qualification shall set qualified acquisition to InvalidAcquisition.

#### Contract clauses evaluated in the compute phase

##### `ACQUISITION_QUALIFICATION_TOTAL` — Required behavior

> During contract evaluation for the compute phase, Upstream Acquisition Qualification shall set qualified acquisition to the result of Upstream Acquisition Qualification image availability process upstream acquisition qualification qualify acquisition for (acquisition sample).
