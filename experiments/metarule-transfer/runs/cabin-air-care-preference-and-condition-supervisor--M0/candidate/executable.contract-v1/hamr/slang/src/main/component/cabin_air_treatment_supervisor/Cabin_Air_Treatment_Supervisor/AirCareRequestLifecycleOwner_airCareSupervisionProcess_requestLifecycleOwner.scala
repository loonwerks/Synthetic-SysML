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
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_requestIntent(Cabin_Air_Treatment_Supervisor.RequestIntent.None)
  }

  def timeTriggered(api: AirCareRequestLifecycleOwner_Operational_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_RQ_01_INVALID
        //   Invalid request blocks and requires rearm
        (api.requestValidity == Cabin_Air_Treatment_Supervisor.RequestValidity.Invalid) ___>: (api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.BlockedInvalid &
          requestMemory == Cabin_Air_Treatment_Supervisor.RequestMemory.RearmRequired),
        // case CASE_RQ_02_VALID_OFF
        //   Valid Off releases the request lifecycle
        (api.requestValidity == Cabin_Air_Treatment_Supervisor.RequestValidity.Valid &
          api.airCareSelection == Cabin_Air_Treatment_Supervisor.AirCareSelection.Off) ___>: (api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.None &
          requestMemory == Cabin_Air_Treatment_Supervisor.RequestMemory.Released),
        // case CASE_RQ_03_FRESH_AUTO
        //   Released Auto is fresh
        (api.requestValidity == Cabin_Air_Treatment_Supervisor.RequestValidity.Valid &
          api.airCareSelection == Cabin_Air_Treatment_Supervisor.AirCareSelection.Auto &
          In(requestMemory) == Cabin_Air_Treatment_Supervisor.RequestMemory.Released) ___>: (api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.FreshAuto &
          requestMemory == Cabin_Air_Treatment_Supervisor.RequestMemory.AcceptedActive),
        // case CASE_RQ_03_FRESH_PURGE
        //   Released Purge is fresh
        (api.requestValidity == Cabin_Air_Treatment_Supervisor.RequestValidity.Valid &
          api.airCareSelection == Cabin_Air_Treatment_Supervisor.AirCareSelection.Purge &
          In(requestMemory) == Cabin_Air_Treatment_Supervisor.RequestMemory.Released) ___>: (api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.FreshPurge &
          requestMemory == Cabin_Air_Treatment_Supervisor.RequestMemory.AcceptedActive),
        // case CASE_RQ_04_HELD_AUTO
        //   Accepted Auto is held
        (api.requestValidity == Cabin_Air_Treatment_Supervisor.RequestValidity.Valid &
          api.airCareSelection == Cabin_Air_Treatment_Supervisor.AirCareSelection.Auto &
          In(requestMemory) == Cabin_Air_Treatment_Supervisor.RequestMemory.AcceptedActive) ___>: (api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.HeldAuto &
          requestMemory == Cabin_Air_Treatment_Supervisor.RequestMemory.AcceptedActive),
        // case CASE_RQ_04_HELD_PURGE
        //   Accepted Purge is held
        (api.requestValidity == Cabin_Air_Treatment_Supervisor.RequestValidity.Valid &
          api.airCareSelection == Cabin_Air_Treatment_Supervisor.AirCareSelection.Purge &
          In(requestMemory) == Cabin_Air_Treatment_Supervisor.RequestMemory.AcceptedActive) ___>: (api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.HeldPurge &
          requestMemory == Cabin_Air_Treatment_Supervisor.RequestMemory.AcceptedActive),
        // case CASE_RQ_05_REARM_BLOCK
        //   Active request remains blocked before Off
        (api.requestValidity == Cabin_Air_Treatment_Supervisor.RequestValidity.Valid &
          api.airCareSelection != Cabin_Air_Treatment_Supervisor.AirCareSelection.Off &
          In(requestMemory) == Cabin_Air_Treatment_Supervisor.RequestMemory.RearmRequired) ___>: (api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.BlockedRearm &
          requestMemory == Cabin_Air_Treatment_Supervisor.RequestMemory.RearmRequired)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_airCareSelection: Option[Cabin_Air_Treatment_Supervisor.AirCareSelection.Type] = api.get_airCareSelection()
    api.logInfo(s"Received on data port airCareSelection: ${apiUsage_airCareSelection}")
    val apiUsage_requestValidity: Option[Cabin_Air_Treatment_Supervisor.RequestValidity.Type] = api.get_requestValidity()
    api.logInfo(s"Received on data port requestValidity: ${apiUsage_requestValidity}")
  }

  def finalise(api: AirCareRequestLifecycleOwner_Operational_Api): Unit = { }
}
