// #Sireum

package drone_lifecycle_energy_governor.Drone_Lifecycle_Energy_Governor

import org.sireum._
import drone_lifecycle_energy_governor._

// This file will not be overwritten if HAMR codegen is rerun
object RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner {

  def initialise(api: RequestApplicabilityOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_semanticsToAirborne(AirborneClassifiedRequest(ExactRequestCode.NONE, RequestFamily.ABSENT))
    api.put_semanticsToLifecycle(LifecycleClassifiedRequest(ExactRequestCode.NONE, RequestFamily.ABSENT))
  }

  def timeTriggered(api: RequestApplicabilityOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.get_requestIn() match {
      case Some(request) =>
        val pair: (ExactRequestCode.Type, RequestFamily.Type) = request match {
          case LifecycleRequest.NONE => (ExactRequestCode.NONE, RequestFamily.ABSENT)
          case LifecycleRequest.SWITCH_ON => (ExactRequestCode.SWITCH_ON, RequestFamily.POWER)
          case LifecycleRequest.SWITCH_OFF => (ExactRequestCode.SWITCH_OFF, RequestFamily.POWER)
          case LifecycleRequest.START_CHARGE => (ExactRequestCode.START_CHARGE, RequestFamily.CHARGE)
          case LifecycleRequest.STOP_CHARGE => (ExactRequestCode.STOP_CHARGE, RequestFamily.CHARGE)
          case LifecycleRequest.ACTIVATE => (ExactRequestCode.ACTIVATE, RequestFamily.READINESS)
          case LifecycleRequest.DEACTIVATE => (ExactRequestCode.DEACTIVATE, RequestFamily.READINESS)
          case LifecycleRequest.LAUNCH => (ExactRequestCode.LAUNCH, RequestFamily.READINESS)
          case LifecycleRequest.RETURN => (ExactRequestCode.RETURN, RequestFamily.AIRBORNE)
          case LifecycleRequest.LAND => (ExactRequestCode.LAND, RequestFamily.AIRBORNE)
        }
        api.put_semanticsToAirborne(AirborneClassifiedRequest(pair._1, pair._2))
        api.put_semanticsToLifecycle(LifecycleClassifiedRequest(pair._1, pair._2))
      case _ =>
        api.put_semanticsToAirborne(AirborneClassifiedRequest(ExactRequestCode.NONE, RequestFamily.ABSENT))
        api.put_semanticsToLifecycle(LifecycleClassifiedRequest(ExactRequestCode.NONE, RequestFamily.ABSENT))
    }
  }

  def finalise(api: RequestApplicabilityOwner_Operational_Api): Unit = { }
}
