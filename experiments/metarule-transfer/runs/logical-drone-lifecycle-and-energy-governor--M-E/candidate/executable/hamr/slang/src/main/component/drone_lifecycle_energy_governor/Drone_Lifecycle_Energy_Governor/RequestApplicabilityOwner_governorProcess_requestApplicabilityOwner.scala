// #Sireum

package drone_lifecycle_energy_governor.Drone_Lifecycle_Energy_Governor

import org.sireum._
import drone_lifecycle_energy_governor._

// This file will not be overwritten if HAMR codegen is rerun
object RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner {

  def initialise(api: RequestApplicabilityOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    val value = LifecycleClassifiedRequest(ExactRequestCode.NONE, RequestFamily.ABSENT)
    api.put_semanticsToAirborne(AirborneClassifiedRequest(value.intentCode, value.requestFamily))
    api.put_semanticsToLifecycle(value)
  }

  def timeTriggered(api: RequestApplicabilityOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee REQUEST_FAMILY_CLASSIFICATION
        api.semanticsToAirborne.intentCode == api.semanticsToLifecycle.intentCode &
          api.semanticsToAirborne.requestFamily == api.semanticsToLifecycle.requestFamily &
          (api.requestIn == LifecycleRequest.NONE &
            api.semanticsToLifecycle.intentCode == ExactRequestCode.NONE &
            api.semanticsToLifecycle.requestFamily == RequestFamily.ABSENT |
            api.requestIn == LifecycleRequest.SWITCH_ON &
              api.semanticsToLifecycle.intentCode == ExactRequestCode.SWITCH_ON &
              api.semanticsToLifecycle.requestFamily == RequestFamily.POWER |
            api.requestIn == LifecycleRequest.SWITCH_OFF &
              api.semanticsToLifecycle.intentCode == ExactRequestCode.SWITCH_OFF &
              api.semanticsToLifecycle.requestFamily == RequestFamily.POWER |
            api.requestIn == LifecycleRequest.START_CHARGE &
              api.semanticsToLifecycle.intentCode == ExactRequestCode.START_CHARGE &
              api.semanticsToLifecycle.requestFamily == RequestFamily.CHARGE |
            api.requestIn == LifecycleRequest.STOP_CHARGE &
              api.semanticsToLifecycle.intentCode == ExactRequestCode.STOP_CHARGE &
              api.semanticsToLifecycle.requestFamily == RequestFamily.CHARGE |
            api.requestIn == LifecycleRequest.ACTIVATE &
              api.semanticsToLifecycle.intentCode == ExactRequestCode.ACTIVATE &
              api.semanticsToLifecycle.requestFamily == RequestFamily.READINESS |
            api.requestIn == LifecycleRequest.DEACTIVATE &
              api.semanticsToLifecycle.intentCode == ExactRequestCode.DEACTIVATE &
              api.semanticsToLifecycle.requestFamily == RequestFamily.READINESS |
            api.requestIn == LifecycleRequest.LAUNCH &
              api.semanticsToLifecycle.intentCode == ExactRequestCode.LAUNCH &
              api.semanticsToLifecycle.requestFamily == RequestFamily.READINESS |
            api.requestIn == LifecycleRequest.RETURN &
              api.semanticsToLifecycle.intentCode == ExactRequestCode.RETURN &
              api.semanticsToLifecycle.requestFamily == RequestFamily.AIRBORNE |
            api.requestIn == LifecycleRequest.LAND &
              api.semanticsToLifecycle.intentCode == ExactRequestCode.LAND &
              api.semanticsToLifecycle.requestFamily == RequestFamily.AIRBORNE)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    api.get_requestIn() match {
      case Some(request) =>
        val intent: ExactRequestCode.Type = request match {
          case LifecycleRequest.NONE => ExactRequestCode.NONE
          case LifecycleRequest.SWITCH_ON => ExactRequestCode.SWITCH_ON
          case LifecycleRequest.SWITCH_OFF => ExactRequestCode.SWITCH_OFF
          case LifecycleRequest.START_CHARGE => ExactRequestCode.START_CHARGE
          case LifecycleRequest.STOP_CHARGE => ExactRequestCode.STOP_CHARGE
          case LifecycleRequest.ACTIVATE => ExactRequestCode.ACTIVATE
          case LifecycleRequest.DEACTIVATE => ExactRequestCode.DEACTIVATE
          case LifecycleRequest.LAUNCH => ExactRequestCode.LAUNCH
          case LifecycleRequest.RETURN => ExactRequestCode.RETURN
          case LifecycleRequest.LAND => ExactRequestCode.LAND
        }
        val family: RequestFamily.Type = request match {
          case LifecycleRequest.NONE => RequestFamily.ABSENT
          case LifecycleRequest.SWITCH_ON => RequestFamily.POWER
          case LifecycleRequest.SWITCH_OFF => RequestFamily.POWER
          case LifecycleRequest.START_CHARGE => RequestFamily.CHARGE
          case LifecycleRequest.STOP_CHARGE => RequestFamily.CHARGE
          case LifecycleRequest.ACTIVATE => RequestFamily.READINESS
          case LifecycleRequest.DEACTIVATE => RequestFamily.READINESS
          case LifecycleRequest.LAUNCH => RequestFamily.READINESS
          case LifecycleRequest.RETURN => RequestFamily.AIRBORNE
          case LifecycleRequest.LAND => RequestFamily.AIRBORNE
        }
        api.put_semanticsToAirborne(AirborneClassifiedRequest(intent, family))
        api.put_semanticsToLifecycle(LifecycleClassifiedRequest(intent, family))
      case _ =>
        val value = LifecycleClassifiedRequest(ExactRequestCode.NONE, RequestFamily.ABSENT)
        api.put_semanticsToAirborne(AirborneClassifiedRequest(value.intentCode, value.requestFamily))
        api.put_semanticsToLifecycle(value)
    }
  }

  def finalise(api: RequestApplicabilityOwner_Operational_Api): Unit = { }
}
