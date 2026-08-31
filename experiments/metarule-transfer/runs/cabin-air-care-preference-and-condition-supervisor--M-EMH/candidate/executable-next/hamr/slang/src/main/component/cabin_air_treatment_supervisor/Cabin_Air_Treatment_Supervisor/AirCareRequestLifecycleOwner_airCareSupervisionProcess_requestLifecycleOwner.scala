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
    requestMemory = RequestMemory.Released
    api.put_requestIntent(RequestIntent.None)
  }

  def timeTriggered(api: AirCareRequestLifecycleOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api, requestMemory),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_RQ_01_INVALID
        (api.requestValidity == RequestValidity.Invalid) ___>: (api.requestIntent == RequestIntent.BlockedInvalid &
          requestMemory == RequestMemory.RearmRequired),
        // case CASE_RQ_02_VALID_OFF
        (api.requestValidity == RequestValidity.Valid &
          api.airCareSelection == AirCareSelection.Off) ___>: (api.requestIntent == RequestIntent.None &
          requestMemory == RequestMemory.Released),
        // case CASE_RQ_03_FRESH_ACTIVE
        (api.requestValidity == RequestValidity.Valid &
          api.airCareSelection != AirCareSelection.Off &
          In(requestMemory) == RequestMemory.Released) ___>: (requestMemory == RequestMemory.AcceptedActive &
          (api.airCareSelection == AirCareSelection.Auto &
            api.requestIntent == RequestIntent.FreshAuto |
            api.airCareSelection == AirCareSelection.Purge &
              api.requestIntent == RequestIntent.FreshPurge)),
        // case CASE_RQ_04_HELD_ACTIVE
        (api.requestValidity == RequestValidity.Valid &
          api.airCareSelection != AirCareSelection.Off &
          In(requestMemory) == RequestMemory.AcceptedActive) ___>: (requestMemory == RequestMemory.AcceptedActive &
          (api.airCareSelection == AirCareSelection.Auto &
            api.requestIntent == RequestIntent.HeldAuto |
            api.airCareSelection == AirCareSelection.Purge &
              api.requestIntent == RequestIntent.HeldPurge)),
        // case CASE_RQ_05_REARM_BLOCK
        (api.requestValidity == RequestValidity.Valid &
          api.airCareSelection != AirCareSelection.Off &
          In(requestMemory) == RequestMemory.RearmRequired) ___>: (api.requestIntent == RequestIntent.BlockedRearm &
          requestMemory == RequestMemory.RearmRequired)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val requestValidity = api.get_requestValidity().get
    val selection = api.get_airCareSelection().get
    val intent: RequestIntent.Type = requestValidity match {
      case RequestValidity.Invalid =>
        requestMemory = RequestMemory.RearmRequired
        RequestIntent.BlockedInvalid
      case RequestValidity.Valid =>
        selection match {
          case AirCareSelection.Off =>
            requestMemory = RequestMemory.Released
            RequestIntent.None
          case AirCareSelection.Auto =>
            requestMemory match {
              case RequestMemory.Released =>
                requestMemory = RequestMemory.AcceptedActive
                RequestIntent.FreshAuto
              case RequestMemory.AcceptedActive => RequestIntent.HeldAuto
              case RequestMemory.RearmRequired => RequestIntent.BlockedRearm
            }
          case AirCareSelection.Purge =>
            requestMemory match {
              case RequestMemory.Released =>
                requestMemory = RequestMemory.AcceptedActive
                RequestIntent.FreshPurge
              case RequestMemory.AcceptedActive => RequestIntent.HeldPurge
              case RequestMemory.RearmRequired => RequestIntent.BlockedRearm
            }
        }
    }
    api.put_requestIntent(intent)
  }

  def finalise(api: AirCareRequestLifecycleOwner_Operational_Api): Unit = { }
}
