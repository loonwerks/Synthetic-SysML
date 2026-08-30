// #Sireum

package scp_candidate.Drone_Lifecycle_Energy_Governor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner {

  def initialise(api: RequestApplicabilityOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    val initial: Drone_Lifecycle_Energy_Governor.AirborneClassifiedRequest = Drone_Lifecycle_Energy_Governor.AirborneClassifiedRequest(
      Drone_Lifecycle_Energy_Governor.ExactRequestCode.NONE,
      Drone_Lifecycle_Energy_Governor.RequestFamily.ABSENT)
    api.put_semanticsToAirborne(initial)
    api.put_semanticsToLifecycle(Drone_Lifecycle_Energy_Governor.LifecycleClassifiedRequest(
      initial.intentCode, initial.requestFamily))
  }

  def timeTriggered(api: RequestApplicabilityOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.get_requestIn() match {
      case Some(request) =>
        var code: Drone_Lifecycle_Energy_Governor.ExactRequestCode.Type = Drone_Lifecycle_Energy_Governor.ExactRequestCode.NONE
        var family: Drone_Lifecycle_Energy_Governor.RequestFamily.Type = Drone_Lifecycle_Energy_Governor.RequestFamily.ABSENT
        request match {
          case Drone_Lifecycle_Energy_Governor.LifecycleRequest.NONE =>
            code = Drone_Lifecycle_Energy_Governor.ExactRequestCode.NONE
            family = Drone_Lifecycle_Energy_Governor.RequestFamily.ABSENT
          case Drone_Lifecycle_Energy_Governor.LifecycleRequest.SWITCH_ON =>
            code = Drone_Lifecycle_Energy_Governor.ExactRequestCode.SWITCH_ON
            family = Drone_Lifecycle_Energy_Governor.RequestFamily.POWER
          case Drone_Lifecycle_Energy_Governor.LifecycleRequest.SWITCH_OFF =>
            code = Drone_Lifecycle_Energy_Governor.ExactRequestCode.SWITCH_OFF
            family = Drone_Lifecycle_Energy_Governor.RequestFamily.POWER
          case Drone_Lifecycle_Energy_Governor.LifecycleRequest.START_CHARGE =>
            code = Drone_Lifecycle_Energy_Governor.ExactRequestCode.START_CHARGE
            family = Drone_Lifecycle_Energy_Governor.RequestFamily.CHARGE
          case Drone_Lifecycle_Energy_Governor.LifecycleRequest.STOP_CHARGE =>
            code = Drone_Lifecycle_Energy_Governor.ExactRequestCode.STOP_CHARGE
            family = Drone_Lifecycle_Energy_Governor.RequestFamily.CHARGE
          case Drone_Lifecycle_Energy_Governor.LifecycleRequest.ACTIVATE =>
            code = Drone_Lifecycle_Energy_Governor.ExactRequestCode.ACTIVATE
            family = Drone_Lifecycle_Energy_Governor.RequestFamily.READINESS
          case Drone_Lifecycle_Energy_Governor.LifecycleRequest.DEACTIVATE =>
            code = Drone_Lifecycle_Energy_Governor.ExactRequestCode.DEACTIVATE
            family = Drone_Lifecycle_Energy_Governor.RequestFamily.READINESS
          case Drone_Lifecycle_Energy_Governor.LifecycleRequest.LAUNCH =>
            code = Drone_Lifecycle_Energy_Governor.ExactRequestCode.LAUNCH
            family = Drone_Lifecycle_Energy_Governor.RequestFamily.READINESS
          case Drone_Lifecycle_Energy_Governor.LifecycleRequest.RETURN =>
            code = Drone_Lifecycle_Energy_Governor.ExactRequestCode.RETURN
            family = Drone_Lifecycle_Energy_Governor.RequestFamily.AIRBORNE
          case Drone_Lifecycle_Energy_Governor.LifecycleRequest.LAND =>
            code = Drone_Lifecycle_Energy_Governor.ExactRequestCode.LAND
            family = Drone_Lifecycle_Energy_Governor.RequestFamily.AIRBORNE
        }
        api.put_semanticsToAirborne(Drone_Lifecycle_Energy_Governor.AirborneClassifiedRequest(code, family))
        api.put_semanticsToLifecycle(Drone_Lifecycle_Energy_Governor.LifecycleClassifiedRequest(code, family))
    }
  }

  def finalise(api: RequestApplicabilityOwner_Operational_Api): Unit = { }
}
