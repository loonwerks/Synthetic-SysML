// #Sireum

package drone_lifecycle_energy_governor.Drone_Lifecycle_Energy_Governor

import org.sireum._
import drone_lifecycle_energy_governor._

// This file will not be overwritten if HAMR codegen is rerun
object RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner {

  def initialise(api: RequestApplicabilityOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_semanticsToAirborne(Drone_Lifecycle_Energy_Governor.AirborneClassifiedRequest.example())
    api.put_semanticsToLifecycle(Drone_Lifecycle_Energy_Governor.LifecycleClassifiedRequest.example())
  }

  def timeTriggered(api: RequestApplicabilityOwner_Operational_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee REQUEST_FAMILY_CLASSIFICATION
        api.semanticsToAirborne.intentCode == api.semanticsToLifecycle.intentCode &
          api.semanticsToAirborne.requestFamily == api.semanticsToLifecycle.requestFamily &
          (api.requestIn == LifecycleRequest.NONE ___>:
            api.semanticsToLifecycle.intentCode == ExactRequestCode.NONE &
              api.semanticsToLifecycle.requestFamily == RequestFamily.ABSENT) &
          (api.requestIn == LifecycleRequest.SWITCH_ON ___>:
            api.semanticsToLifecycle.intentCode == ExactRequestCode.SWITCH_ON &
              api.semanticsToLifecycle.requestFamily == RequestFamily.POWER) &
          (api.requestIn == LifecycleRequest.SWITCH_OFF ___>:
            api.semanticsToLifecycle.intentCode == ExactRequestCode.SWITCH_OFF &
              api.semanticsToLifecycle.requestFamily == RequestFamily.POWER) &
          (api.requestIn == LifecycleRequest.START_CHARGE ___>:
            api.semanticsToLifecycle.intentCode == ExactRequestCode.START_CHARGE &
              api.semanticsToLifecycle.requestFamily == RequestFamily.CHARGE) &
          (api.requestIn == LifecycleRequest.STOP_CHARGE ___>:
            api.semanticsToLifecycle.intentCode == ExactRequestCode.STOP_CHARGE &
              api.semanticsToLifecycle.requestFamily == RequestFamily.CHARGE) &
          (api.requestIn == LifecycleRequest.ACTIVATE ___>:
            api.semanticsToLifecycle.intentCode == ExactRequestCode.ACTIVATE &
              api.semanticsToLifecycle.requestFamily == RequestFamily.READINESS) &
          (api.requestIn == LifecycleRequest.DEACTIVATE ___>:
            api.semanticsToLifecycle.intentCode == ExactRequestCode.DEACTIVATE &
              api.semanticsToLifecycle.requestFamily == RequestFamily.READINESS) &
          (api.requestIn == LifecycleRequest.LAUNCH ___>:
            api.semanticsToLifecycle.intentCode == ExactRequestCode.LAUNCH &
              api.semanticsToLifecycle.requestFamily == RequestFamily.READINESS) &
          (api.requestIn == LifecycleRequest.RETURN ___>:
            api.semanticsToLifecycle.intentCode == ExactRequestCode.RETURN &
              api.semanticsToLifecycle.requestFamily == RequestFamily.AIRBORNE) &
          (api.requestIn == LifecycleRequest.LAND ___>:
            api.semanticsToLifecycle.intentCode == ExactRequestCode.LAND &
              api.semanticsToLifecycle.requestFamily == RequestFamily.AIRBORNE)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_requestIn: Option[Drone_Lifecycle_Energy_Governor.LifecycleRequest.Type] = api.get_requestIn()
    api.logInfo(s"Received on data port requestIn: ${apiUsage_requestIn}")
  }

  def finalise(api: RequestApplicabilityOwner_Operational_Api): Unit = { }
}
