// #Sireum

package scp_candidate.EIT_Image_Availability_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Image_Availability_Governor_image_availability_process_image_availability_governor {

  var imageState: EIT_Image_Availability_Coordinator.Image_State.Type =
    EIT_Image_Availability_Coordinator.Image_State.Empty
  var recoveryPhase: EIT_Image_Availability_Coordinator.Recovery_Phase.Type =
    EIT_Image_Availability_Coordinator.Recovery_Phase.Normal

  def initialise(api: Image_Availability_Governor_Initialization_Api): Unit = {
    Contract(
      Modifies(imageState, recoveryPhase, api)
    )
    imageState = EIT_Image_Availability_Coordinator.Image_State.Empty
    recoveryPhase = EIT_Image_Availability_Coordinator.Recovery_Phase.Normal
    val initial: EIT_Image_Availability_Coordinator.Image_Resolution = EIT_Image_Availability_Coordinator.Image_Resolution(
      EIT_Image_Availability_Coordinator.Image_State.Empty,
      EIT_Image_Availability_Coordinator.Recovery_Phase.Normal,
      EIT_Image_Availability_Coordinator.Resolution_Disposition.IdleDisposition)
    api.put_generation_resolution(initial)
    api.put_publication_resolution(initial)
  }

  def timeTriggered(api: Image_Availability_Governor_Operational_Api): Unit = {
    Contract(
      Modifies(imageState, recoveryPhase, api)
    )
    val Some(acquisition) = api.get_qualified_acquisition()
    val Some(intent) = api.get_qualified_intent()
    val Some(result) = api.get_qualified_generation_result()

    val statePre: EIT_Image_Availability_Coordinator.Image_State.Type = imageState
    val phasePre: EIT_Image_Availability_Coordinator.Recovery_Phase.Type = recoveryPhase
    val requested: B = statePre == EIT_Image_Availability_Coordinator.Image_State.RequestedA ||
      statePre == EIT_Image_Availability_Coordinator.Image_State.RequestedB
    val matchingReady: B =
      (statePre == EIT_Image_Availability_Coordinator.Image_State.RequestedA &&
        result == EIT_Image_Availability_Coordinator.Qualified_Generation_Result.ReadyResultA) ||
      (statePre == EIT_Image_Availability_Coordinator.Image_State.RequestedB &&
        result == EIT_Image_Availability_Coordinator.Qualified_Generation_Result.ReadyResultB)
    val nonPendingResult: B =
      result == EIT_Image_Availability_Coordinator.Qualified_Generation_Result.FailedResult ||
        result == EIT_Image_Availability_Coordinator.Qualified_Generation_Result.ReadyResultA ||
        result == EIT_Image_Availability_Coordinator.Qualified_Generation_Result.ReadyResultB
    val expectedNonPending: B =
      (requested && result == EIT_Image_Availability_Coordinator.Qualified_Generation_Result.FailedResult) ||
        matchingReady
    val inputFault: B =
      acquisition == EIT_Image_Availability_Coordinator.Qualified_Acquisition.InvalidAcquisition ||
        intent == EIT_Image_Availability_Coordinator.Qualified_Intent.InvalidIntent ||
        result == EIT_Image_Availability_Coordinator.Qualified_Generation_Result.InvalidGenerationResult ||
        (nonPendingResult && !expectedNonPending)

    var nextState: EIT_Image_Availability_Coordinator.Image_State.Type = statePre
    var nextPhase: EIT_Image_Availability_Coordinator.Recovery_Phase.Type = phasePre
    var disposition: EIT_Image_Availability_Coordinator.Resolution_Disposition.Type =
      EIT_Image_Availability_Coordinator.Resolution_Disposition.IdleDisposition

    if (inputFault) {
      nextState = EIT_Image_Availability_Coordinator.Image_State.Empty
      nextPhase = EIT_Image_Availability_Coordinator.Recovery_Phase.AwaitNeutral
      disposition = EIT_Image_Availability_Coordinator.Resolution_Disposition.InputFaultDisposition
    } else if (phasePre == EIT_Image_Availability_Coordinator.Recovery_Phase.AwaitNeutral) {
      nextState = EIT_Image_Availability_Coordinator.Image_State.Empty
      disposition = EIT_Image_Availability_Coordinator.Resolution_Disposition.RecoveryDisposition
      if (intent == EIT_Image_Availability_Coordinator.Qualified_Intent.NeutralIntent) {
        nextPhase = EIT_Image_Availability_Coordinator.Recovery_Phase.AwaitFreshIntent
      } else {
        nextPhase = EIT_Image_Availability_Coordinator.Recovery_Phase.AwaitNeutral
      }
    } else if (phasePre == EIT_Image_Availability_Coordinator.Recovery_Phase.AwaitFreshIntent) {
      nextState = EIT_Image_Availability_Coordinator.Image_State.Empty
      if (intent == EIT_Image_Availability_Coordinator.Qualified_Intent.NeutralIntent) {
        nextPhase = EIT_Image_Availability_Coordinator.Recovery_Phase.AwaitFreshIntent
        disposition = EIT_Image_Availability_Coordinator.Resolution_Disposition.RecoveryDisposition
      } else if (intent == EIT_Image_Availability_Coordinator.Qualified_Intent.ReleaseIntent) {
        nextPhase = EIT_Image_Availability_Coordinator.Recovery_Phase.Normal
        disposition = EIT_Image_Availability_Coordinator.Resolution_Disposition.ReleasedDisposition
      } else {
        nextPhase = EIT_Image_Availability_Coordinator.Recovery_Phase.Normal
        if (acquisition == EIT_Image_Availability_Coordinator.Qualified_Acquisition.AdmittedA) {
          nextState = EIT_Image_Availability_Coordinator.Image_State.RequestedA
          disposition = EIT_Image_Availability_Coordinator.Resolution_Disposition.GenerationStarted
        } else if (acquisition == EIT_Image_Availability_Coordinator.Qualified_Acquisition.AdmittedB) {
          nextState = EIT_Image_Availability_Coordinator.Image_State.RequestedB
          disposition = EIT_Image_Availability_Coordinator.Resolution_Disposition.GenerationStarted
        } else {
          disposition = EIT_Image_Availability_Coordinator.Resolution_Disposition.AcquisitionRequired
        }
      }
    } else if (intent == EIT_Image_Availability_Coordinator.Qualified_Intent.ReleaseIntent) {
      nextState = EIT_Image_Availability_Coordinator.Image_State.Empty
      nextPhase = EIT_Image_Availability_Coordinator.Recovery_Phase.Normal
      disposition = EIT_Image_Availability_Coordinator.Resolution_Disposition.ReleasedDisposition
    } else if (requested && result == EIT_Image_Availability_Coordinator.Qualified_Generation_Result.FailedResult) {
      nextState = EIT_Image_Availability_Coordinator.Image_State.Empty
      nextPhase = EIT_Image_Availability_Coordinator.Recovery_Phase.Normal
      disposition = EIT_Image_Availability_Coordinator.Resolution_Disposition.GenerationFailure
    } else if (matchingReady) {
      if (statePre == EIT_Image_Availability_Coordinator.Image_State.RequestedA) {
        nextState = EIT_Image_Availability_Coordinator.Image_State.ReadyA
      } else {
        nextState = EIT_Image_Availability_Coordinator.Image_State.ReadyB
      }
      nextPhase = EIT_Image_Availability_Coordinator.Recovery_Phase.Normal
      disposition = EIT_Image_Availability_Coordinator.Resolution_Disposition.GenerationCompleted
    } else if (requested) {
      nextState = statePre
      nextPhase = EIT_Image_Availability_Coordinator.Recovery_Phase.Normal
      disposition = EIT_Image_Availability_Coordinator.Resolution_Disposition.GenerationWaiting
    } else if (intent == EIT_Image_Availability_Coordinator.Qualified_Intent.FreshImageRequest) {
      nextPhase = EIT_Image_Availability_Coordinator.Recovery_Phase.Normal
      if (acquisition == EIT_Image_Availability_Coordinator.Qualified_Acquisition.AdmittedA) {
        nextState = EIT_Image_Availability_Coordinator.Image_State.RequestedA
        disposition = EIT_Image_Availability_Coordinator.Resolution_Disposition.GenerationStarted
      } else if (acquisition == EIT_Image_Availability_Coordinator.Qualified_Acquisition.AdmittedB) {
        nextState = EIT_Image_Availability_Coordinator.Image_State.RequestedB
        disposition = EIT_Image_Availability_Coordinator.Resolution_Disposition.GenerationStarted
      } else if (statePre == EIT_Image_Availability_Coordinator.Image_State.Empty) {
        nextState = statePre
        disposition = EIT_Image_Availability_Coordinator.Resolution_Disposition.AcquisitionRequired
      } else {
        nextState = statePre
        disposition = EIT_Image_Availability_Coordinator.Resolution_Disposition.ExistingImageRetained
      }
    } else {
      nextState = statePre
      nextPhase = EIT_Image_Availability_Coordinator.Recovery_Phase.Normal
      if (statePre == EIT_Image_Availability_Coordinator.Image_State.Empty) {
        disposition = EIT_Image_Availability_Coordinator.Resolution_Disposition.IdleDisposition
      } else {
        disposition = EIT_Image_Availability_Coordinator.Resolution_Disposition.AvailableRetained
      }
    }

    imageState = nextState
    recoveryPhase = nextPhase
    val resolution: EIT_Image_Availability_Coordinator.Image_Resolution =
      EIT_Image_Availability_Coordinator.Image_Resolution(nextState, nextPhase, disposition)
    api.put_generation_resolution(resolution)
    api.put_publication_resolution(resolution)
  }

  def finalise(api: Image_Availability_Governor_Operational_Api): Unit = { }
}
