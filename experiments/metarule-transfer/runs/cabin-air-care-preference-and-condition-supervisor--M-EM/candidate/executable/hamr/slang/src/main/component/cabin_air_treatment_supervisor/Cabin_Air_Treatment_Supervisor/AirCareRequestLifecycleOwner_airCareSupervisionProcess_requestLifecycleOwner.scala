// #Sireum

package cabin_air_treatment_supervisor.Cabin_Air_Treatment_Supervisor

import org.sireum._
import cabin_air_treatment_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner {

  // BEGIN STATE VARS
  var requestMemory: Cabin_Air_Treatment_Supervisor.RequestMemory.Type = Cabin_Air_Treatment_Supervisor.RequestMemory.Released
  // END STATE VARS

  def initialise(api: AirCareRequestLifecycleOwner_Initialization_Api): Unit = {
    Contract(Modifies(api, requestMemory))
    requestMemory = Cabin_Air_Treatment_Supervisor.RequestMemory.Released
    api.put_requestIntent(Cabin_Air_Treatment_Supervisor.RequestIntent.None)
  }

  def timeTriggered(api: AirCareRequestLifecycleOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api, requestMemory),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_RQ_01_INVALID
        (api.requestValidity == Cabin_Air_Treatment_Supervisor.RequestValidity.Invalid) ___>: (api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.BlockedInvalid &
          requestMemory == Cabin_Air_Treatment_Supervisor.RequestMemory.RearmRequired),
        // case CASE_RQ_02_VALID_OFF
        (api.requestValidity == Cabin_Air_Treatment_Supervisor.RequestValidity.Valid &
          api.airCareSelection == Cabin_Air_Treatment_Supervisor.AirCareSelection.Off) ___>: (api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.None &
          requestMemory == Cabin_Air_Treatment_Supervisor.RequestMemory.Released),
        // case CASE_RQ_03_FRESH_AUTO
        (api.requestValidity == Cabin_Air_Treatment_Supervisor.RequestValidity.Valid &
          api.airCareSelection == Cabin_Air_Treatment_Supervisor.AirCareSelection.Auto &
          In(requestMemory) == Cabin_Air_Treatment_Supervisor.RequestMemory.Released) ___>: (api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.FreshAuto &
          requestMemory == Cabin_Air_Treatment_Supervisor.RequestMemory.AcceptedActive),
        // case CASE_RQ_03_FRESH_PURGE
        (api.requestValidity == Cabin_Air_Treatment_Supervisor.RequestValidity.Valid &
          api.airCareSelection == Cabin_Air_Treatment_Supervisor.AirCareSelection.Purge &
          In(requestMemory) == Cabin_Air_Treatment_Supervisor.RequestMemory.Released) ___>: (api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.FreshPurge &
          requestMemory == Cabin_Air_Treatment_Supervisor.RequestMemory.AcceptedActive),
        // case CASE_RQ_04_HELD_AUTO
        (api.requestValidity == Cabin_Air_Treatment_Supervisor.RequestValidity.Valid &
          api.airCareSelection == Cabin_Air_Treatment_Supervisor.AirCareSelection.Auto &
          In(requestMemory) == Cabin_Air_Treatment_Supervisor.RequestMemory.AcceptedActive) ___>: (api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.HeldAuto &
          requestMemory == Cabin_Air_Treatment_Supervisor.RequestMemory.AcceptedActive),
        // case CASE_RQ_04_HELD_PURGE
        (api.requestValidity == Cabin_Air_Treatment_Supervisor.RequestValidity.Valid &
          api.airCareSelection == Cabin_Air_Treatment_Supervisor.AirCareSelection.Purge &
          In(requestMemory) == Cabin_Air_Treatment_Supervisor.RequestMemory.AcceptedActive) ___>: (api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.HeldPurge &
          requestMemory == Cabin_Air_Treatment_Supervisor.RequestMemory.AcceptedActive),
        // case CASE_RQ_05_REARM_BLOCK
        (api.requestValidity == Cabin_Air_Treatment_Supervisor.RequestValidity.Valid &
          api.airCareSelection != Cabin_Air_Treatment_Supervisor.AirCareSelection.Off &
          In(requestMemory) == Cabin_Air_Treatment_Supervisor.RequestMemory.RearmRequired) ___>: (api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.BlockedRearm &
          requestMemory == Cabin_Air_Treatment_Supervisor.RequestMemory.RearmRequired)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    (api.get_airCareSelection(), api.get_requestValidity()) match {
      case (Some(s), Some(v)) =>
        if (v == Cabin_Air_Treatment_Supervisor.RequestValidity.Invalid) {
          requestMemory = Cabin_Air_Treatment_Supervisor.RequestMemory.RearmRequired
          api.put_requestIntent(Cabin_Air_Treatment_Supervisor.RequestIntent.BlockedInvalid)
        } else if (s == Cabin_Air_Treatment_Supervisor.AirCareSelection.Off) {
          requestMemory = Cabin_Air_Treatment_Supervisor.RequestMemory.Released
          api.put_requestIntent(Cabin_Air_Treatment_Supervisor.RequestIntent.None)
        } else if (requestMemory == Cabin_Air_Treatment_Supervisor.RequestMemory.Released) {
          requestMemory = Cabin_Air_Treatment_Supervisor.RequestMemory.AcceptedActive
          if (s == Cabin_Air_Treatment_Supervisor.AirCareSelection.Auto) {
            api.put_requestIntent(Cabin_Air_Treatment_Supervisor.RequestIntent.FreshAuto)
          } else {
            api.put_requestIntent(Cabin_Air_Treatment_Supervisor.RequestIntent.FreshPurge)
          }
        } else if (requestMemory == Cabin_Air_Treatment_Supervisor.RequestMemory.AcceptedActive) {
          if (s == Cabin_Air_Treatment_Supervisor.AirCareSelection.Auto) {
            api.put_requestIntent(Cabin_Air_Treatment_Supervisor.RequestIntent.HeldAuto)
          } else {
            api.put_requestIntent(Cabin_Air_Treatment_Supervisor.RequestIntent.HeldPurge)
          }
        } else {
          api.put_requestIntent(Cabin_Air_Treatment_Supervisor.RequestIntent.BlockedRearm)
        }
      case _ =>
        requestMemory = Cabin_Air_Treatment_Supervisor.RequestMemory.RearmRequired
        api.put_requestIntent(Cabin_Air_Treatment_Supervisor.RequestIntent.BlockedInvalid)
    }
  }

  def finalise(api: AirCareRequestLifecycleOwner_Operational_Api): Unit = { }
}
