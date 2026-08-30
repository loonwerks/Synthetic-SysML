// #Sireum

package equiv_shared_0.EIT_Image_Availability_Coordinator

import org.sireum._
import equiv_shared_0._

object Image_Availability_Governor_image_availability_process_image_availability_governor {
  // BEGIN FUNCTIONS
  @strictpure def is_requested(value: EIT_Image_Availability_Coordinator.Image_State.Type): Base_Types.Boolean = value == Image_State.RequestedA |
    value == Image_State.RequestedB

  @strictpure def matching_ready(state_pre: EIT_Image_Availability_Coordinator.Image_State.Type, result: EIT_Image_Availability_Coordinator.Qualified_Generation_Result.Type): Base_Types.Boolean = state_pre == Image_State.RequestedA &
    result == Qualified_Generation_Result.ReadyResultA |
    state_pre == Image_State.RequestedB &
      result == Qualified_Generation_Result.ReadyResultB

  @strictpure def expected_nonpending(state_pre: EIT_Image_Availability_Coordinator.Image_State.Type, result: EIT_Image_Availability_Coordinator.Qualified_Generation_Result.Type): Base_Types.Boolean = is_requested(state_pre) &
    result == Qualified_Generation_Result.FailedResult |
    matching_ready(state_pre, result)

  @strictpure def unexpected_valid_result(state_pre: EIT_Image_Availability_Coordinator.Image_State.Type, result: EIT_Image_Availability_Coordinator.Qualified_Generation_Result.Type): Base_Types.Boolean = (result == Qualified_Generation_Result.FailedResult |
     result == Qualified_Generation_Result.ReadyResultA |
     result == Qualified_Generation_Result.ReadyResultB) &
    !(expected_nonpending(state_pre, result))

  @strictpure def case_01_guard(acquisition: EIT_Image_Availability_Coordinator.Qualified_Acquisition.Type, intent: EIT_Image_Availability_Coordinator.Qualified_Intent.Type, result: EIT_Image_Availability_Coordinator.Qualified_Generation_Result.Type, state_pre: EIT_Image_Availability_Coordinator.Image_State.Type): Base_Types.Boolean = acquisition == Qualified_Acquisition.InvalidAcquisition |
    intent == Qualified_Intent.InvalidIntent |
    result == Qualified_Generation_Result.InvalidGenerationResult |
    unexpected_valid_result(state_pre, result)

  @strictpure def case_02_guard(acquisition: EIT_Image_Availability_Coordinator.Qualified_Acquisition.Type, intent: EIT_Image_Availability_Coordinator.Qualified_Intent.Type, result: EIT_Image_Availability_Coordinator.Qualified_Generation_Result.Type, state_pre: EIT_Image_Availability_Coordinator.Image_State.Type, phase_pre: EIT_Image_Availability_Coordinator.Recovery_Phase.Type): Base_Types.Boolean = !(case_01_guard(acquisition, intent, result, state_pre)) &
    phase_pre == Recovery_Phase.AwaitNeutral &
    intent != Qualified_Intent.NeutralIntent

  @strictpure def case_03_guard(acquisition: EIT_Image_Availability_Coordinator.Qualified_Acquisition.Type, intent: EIT_Image_Availability_Coordinator.Qualified_Intent.Type, result: EIT_Image_Availability_Coordinator.Qualified_Generation_Result.Type, state_pre: EIT_Image_Availability_Coordinator.Image_State.Type, phase_pre: EIT_Image_Availability_Coordinator.Recovery_Phase.Type): Base_Types.Boolean = !(case_01_guard(acquisition, intent, result, state_pre)) &
    phase_pre == Recovery_Phase.AwaitNeutral &
    intent == Qualified_Intent.NeutralIntent

  @strictpure def case_04_guard(acquisition: EIT_Image_Availability_Coordinator.Qualified_Acquisition.Type, intent: EIT_Image_Availability_Coordinator.Qualified_Intent.Type, result: EIT_Image_Availability_Coordinator.Qualified_Generation_Result.Type, state_pre: EIT_Image_Availability_Coordinator.Image_State.Type, phase_pre: EIT_Image_Availability_Coordinator.Recovery_Phase.Type): Base_Types.Boolean = !(case_01_guard(acquisition, intent, result, state_pre)) &
    phase_pre == Recovery_Phase.AwaitFreshIntent &
    intent == Qualified_Intent.NeutralIntent

  @strictpure def case_05_guard(acquisition: EIT_Image_Availability_Coordinator.Qualified_Acquisition.Type, intent: EIT_Image_Availability_Coordinator.Qualified_Intent.Type, result: EIT_Image_Availability_Coordinator.Qualified_Generation_Result.Type, state_pre: EIT_Image_Availability_Coordinator.Image_State.Type, phase_pre: EIT_Image_Availability_Coordinator.Recovery_Phase.Type): Base_Types.Boolean = !(case_01_guard(acquisition, intent, result, state_pre)) &
    phase_pre == Recovery_Phase.AwaitFreshIntent &
    intent == Qualified_Intent.ReleaseIntent

  @strictpure def case_06_guard(acquisition: EIT_Image_Availability_Coordinator.Qualified_Acquisition.Type, intent: EIT_Image_Availability_Coordinator.Qualified_Intent.Type, result: EIT_Image_Availability_Coordinator.Qualified_Generation_Result.Type, state_pre: EIT_Image_Availability_Coordinator.Image_State.Type, phase_pre: EIT_Image_Availability_Coordinator.Recovery_Phase.Type): Base_Types.Boolean = !(case_01_guard(acquisition, intent, result, state_pre)) &
    phase_pre == Recovery_Phase.AwaitFreshIntent &
    intent == Qualified_Intent.FreshImageRequest

  @strictpure def case_07_guard(acquisition: EIT_Image_Availability_Coordinator.Qualified_Acquisition.Type, intent: EIT_Image_Availability_Coordinator.Qualified_Intent.Type, result: EIT_Image_Availability_Coordinator.Qualified_Generation_Result.Type, state_pre: EIT_Image_Availability_Coordinator.Image_State.Type, phase_pre: EIT_Image_Availability_Coordinator.Recovery_Phase.Type): Base_Types.Boolean = !(case_01_guard(acquisition, intent, result, state_pre)) &
    phase_pre == Recovery_Phase.Normal &
    intent == Qualified_Intent.ReleaseIntent

  @strictpure def case_08_guard(acquisition: EIT_Image_Availability_Coordinator.Qualified_Acquisition.Type, intent: EIT_Image_Availability_Coordinator.Qualified_Intent.Type, result: EIT_Image_Availability_Coordinator.Qualified_Generation_Result.Type, state_pre: EIT_Image_Availability_Coordinator.Image_State.Type, phase_pre: EIT_Image_Availability_Coordinator.Recovery_Phase.Type): Base_Types.Boolean = !(case_01_guard(acquisition, intent, result, state_pre)) &
    phase_pre == Recovery_Phase.Normal &
    intent != Qualified_Intent.ReleaseIntent &
    is_requested(state_pre) &
    result == Qualified_Generation_Result.FailedResult

  @strictpure def case_09_guard(acquisition: EIT_Image_Availability_Coordinator.Qualified_Acquisition.Type, intent: EIT_Image_Availability_Coordinator.Qualified_Intent.Type, result: EIT_Image_Availability_Coordinator.Qualified_Generation_Result.Type, state_pre: EIT_Image_Availability_Coordinator.Image_State.Type, phase_pre: EIT_Image_Availability_Coordinator.Recovery_Phase.Type): Base_Types.Boolean = !(case_01_guard(acquisition, intent, result, state_pre)) &
    phase_pre == Recovery_Phase.Normal &
    intent != Qualified_Intent.ReleaseIntent &
    matching_ready(state_pre, result)

  @strictpure def case_10_guard(acquisition: EIT_Image_Availability_Coordinator.Qualified_Acquisition.Type, intent: EIT_Image_Availability_Coordinator.Qualified_Intent.Type, result: EIT_Image_Availability_Coordinator.Qualified_Generation_Result.Type, state_pre: EIT_Image_Availability_Coordinator.Image_State.Type, phase_pre: EIT_Image_Availability_Coordinator.Recovery_Phase.Type): Base_Types.Boolean = !(case_01_guard(acquisition, intent, result, state_pre)) &
    phase_pre == Recovery_Phase.Normal &
    intent != Qualified_Intent.ReleaseIntent &
    is_requested(state_pre) &
    result == Qualified_Generation_Result.PendingResult

  @strictpure def case_11_guard(acquisition: EIT_Image_Availability_Coordinator.Qualified_Acquisition.Type, intent: EIT_Image_Availability_Coordinator.Qualified_Intent.Type, result: EIT_Image_Availability_Coordinator.Qualified_Generation_Result.Type, state_pre: EIT_Image_Availability_Coordinator.Image_State.Type, phase_pre: EIT_Image_Availability_Coordinator.Recovery_Phase.Type): Base_Types.Boolean = !(case_01_guard(acquisition, intent, result, state_pre)) &
    phase_pre == Recovery_Phase.Normal &
    intent == Qualified_Intent.FreshImageRequest &
    !(is_requested(state_pre)) &
    result == Qualified_Generation_Result.PendingResult

  @strictpure def case_12_guard(acquisition: EIT_Image_Availability_Coordinator.Qualified_Acquisition.Type, intent: EIT_Image_Availability_Coordinator.Qualified_Intent.Type, result: EIT_Image_Availability_Coordinator.Qualified_Generation_Result.Type, state_pre: EIT_Image_Availability_Coordinator.Image_State.Type, phase_pre: EIT_Image_Availability_Coordinator.Recovery_Phase.Type): Base_Types.Boolean = !(case_01_guard(acquisition, intent, result, state_pre)) &
    phase_pre == Recovery_Phase.Normal &
    intent == Qualified_Intent.NeutralIntent &
    !(is_requested(state_pre)) &
    result == Qualified_Generation_Result.PendingResult

  @strictpure def requested_state(acquisition: EIT_Image_Availability_Coordinator.Qualified_Acquisition.Type): EIT_Image_Availability_Coordinator.Image_State.Type = if (acquisition == Qualified_Acquisition.AdmittedA) Image_State.RequestedA else if (acquisition == Qualified_Acquisition.AdmittedB) Image_State.RequestedB else Image_State.Empty

  @strictpure def selected_image(acquisition: EIT_Image_Availability_Coordinator.Qualified_Acquisition.Type, intent: EIT_Image_Availability_Coordinator.Qualified_Intent.Type, result: EIT_Image_Availability_Coordinator.Qualified_Generation_Result.Type, state_pre: EIT_Image_Availability_Coordinator.Image_State.Type, phase_pre: EIT_Image_Availability_Coordinator.Recovery_Phase.Type): EIT_Image_Availability_Coordinator.Image_State.Type = if (case_01_guard(acquisition, intent, result, state_pre)) Image_State.Empty else if (phase_pre == Recovery_Phase.AwaitNeutral) Image_State.Empty else if (phase_pre == Recovery_Phase.AwaitFreshIntent &
          intent == Qualified_Intent.NeutralIntent) Image_State.Empty else if (phase_pre == Recovery_Phase.AwaitFreshIntent &
          intent == Qualified_Intent.ReleaseIntent) Image_State.Empty else if (phase_pre == Recovery_Phase.AwaitFreshIntent) requested_state(acquisition) else if (intent == Qualified_Intent.ReleaseIntent) Image_State.Empty else if (is_requested(state_pre) &
          result == Qualified_Generation_Result.FailedResult) Image_State.Empty else if (state_pre == Image_State.RequestedA &
          result == Qualified_Generation_Result.ReadyResultA) Image_State.ReadyA else if (state_pre == Image_State.RequestedB &
          result == Qualified_Generation_Result.ReadyResultB) Image_State.ReadyB else if (is_requested(state_pre)) state_pre else if (intent == Qualified_Intent.FreshImageRequest &
          acquisition == Qualified_Acquisition.AdmittedA) Image_State.RequestedA else if (intent == Qualified_Intent.FreshImageRequest &
          acquisition == Qualified_Acquisition.AdmittedB) Image_State.RequestedB else state_pre

  @strictpure def selected_phase(acquisition: EIT_Image_Availability_Coordinator.Qualified_Acquisition.Type, intent: EIT_Image_Availability_Coordinator.Qualified_Intent.Type, result: EIT_Image_Availability_Coordinator.Qualified_Generation_Result.Type, state_pre: EIT_Image_Availability_Coordinator.Image_State.Type, phase_pre: EIT_Image_Availability_Coordinator.Recovery_Phase.Type): EIT_Image_Availability_Coordinator.Recovery_Phase.Type = if (case_01_guard(acquisition, intent, result, state_pre)) Recovery_Phase.AwaitNeutral else if (phase_pre == Recovery_Phase.AwaitNeutral &
          intent == Qualified_Intent.NeutralIntent) Recovery_Phase.AwaitFreshIntent else if (phase_pre == Recovery_Phase.AwaitNeutral) Recovery_Phase.AwaitNeutral else if (phase_pre == Recovery_Phase.AwaitFreshIntent &
          intent == Qualified_Intent.NeutralIntent) Recovery_Phase.AwaitFreshIntent else Recovery_Phase.Normal

  @strictpure def selected_disposition(acquisition: EIT_Image_Availability_Coordinator.Qualified_Acquisition.Type, intent: EIT_Image_Availability_Coordinator.Qualified_Intent.Type, result: EIT_Image_Availability_Coordinator.Qualified_Generation_Result.Type, state_pre: EIT_Image_Availability_Coordinator.Image_State.Type, phase_pre: EIT_Image_Availability_Coordinator.Recovery_Phase.Type): EIT_Image_Availability_Coordinator.Resolution_Disposition.Type = if (case_01_guard(acquisition, intent, result, state_pre)) Resolution_Disposition.InputFaultDisposition else if (phase_pre == Recovery_Phase.AwaitNeutral) Resolution_Disposition.RecoveryDisposition else if (phase_pre == Recovery_Phase.AwaitFreshIntent &
          intent == Qualified_Intent.NeutralIntent) Resolution_Disposition.RecoveryDisposition else if (phase_pre == Recovery_Phase.AwaitFreshIntent &
          intent == Qualified_Intent.ReleaseIntent) Resolution_Disposition.ReleasedDisposition else if (phase_pre == Recovery_Phase.AwaitFreshIntent &
          acquisition == Qualified_Acquisition.NoAdmittedAcquisition) Resolution_Disposition.AcquisitionRequired else if (phase_pre == Recovery_Phase.AwaitFreshIntent) Resolution_Disposition.GenerationStarted else if (intent == Qualified_Intent.ReleaseIntent) Resolution_Disposition.ReleasedDisposition else if (is_requested(state_pre) &
          result == Qualified_Generation_Result.FailedResult) Resolution_Disposition.GenerationFailure else if (matching_ready(state_pre, result)) Resolution_Disposition.GenerationCompleted else if (is_requested(state_pre)) Resolution_Disposition.GenerationWaiting else if (intent == Qualified_Intent.FreshImageRequest &
          acquisition != Qualified_Acquisition.NoAdmittedAcquisition) Resolution_Disposition.GenerationStarted else if (intent == Qualified_Intent.FreshImageRequest &
          state_pre != Image_State.Empty) Resolution_Disposition.ExistingImageRetained else if (intent == Qualified_Intent.FreshImageRequest) Resolution_Disposition.AcquisitionRequired else if (state_pre != Image_State.Empty) Resolution_Disposition.AvailableRetained else Resolution_Disposition.IdleDisposition
  // END FUNCTIONS
}
