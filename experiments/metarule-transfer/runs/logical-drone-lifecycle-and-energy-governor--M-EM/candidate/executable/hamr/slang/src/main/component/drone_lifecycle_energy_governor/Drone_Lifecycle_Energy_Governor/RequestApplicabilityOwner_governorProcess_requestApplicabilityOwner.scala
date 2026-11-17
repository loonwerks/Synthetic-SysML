// #Sireum

package drone_lifecycle_energy_governor.Drone_Lifecycle_Energy_Governor

import org.sireum._
import drone_lifecycle_energy_governor._

// This file will not be overwritten if HAMR codegen is rerun
object RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner {

  def initialise(api: RequestApplicabilityOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    publish(
      api,
      Drone_Lifecycle_Energy_Governor.ExactRequestCode.NONE,
      Drone_Lifecycle_Energy_Governor.RequestFamily.ABSENT)
  }

  def timeTriggered(api: RequestApplicabilityOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.get_requestIn() match {
      case Some(request) =>
        request match {
          case Drone_Lifecycle_Energy_Governor.LifecycleRequest.SWITCH_ON =>
            publish(api, Drone_Lifecycle_Energy_Governor.ExactRequestCode.SWITCH_ON, Drone_Lifecycle_Energy_Governor.RequestFamily.POWER)
          case Drone_Lifecycle_Energy_Governor.LifecycleRequest.SWITCH_OFF =>
            publish(api, Drone_Lifecycle_Energy_Governor.ExactRequestCode.SWITCH_OFF, Drone_Lifecycle_Energy_Governor.RequestFamily.POWER)
          case Drone_Lifecycle_Energy_Governor.LifecycleRequest.START_CHARGE =>
            publish(api, Drone_Lifecycle_Energy_Governor.ExactRequestCode.START_CHARGE, Drone_Lifecycle_Energy_Governor.RequestFamily.CHARGE)
          case Drone_Lifecycle_Energy_Governor.LifecycleRequest.STOP_CHARGE =>
            publish(api, Drone_Lifecycle_Energy_Governor.ExactRequestCode.STOP_CHARGE, Drone_Lifecycle_Energy_Governor.RequestFamily.CHARGE)
          case Drone_Lifecycle_Energy_Governor.LifecycleRequest.ACTIVATE =>
            publish(api, Drone_Lifecycle_Energy_Governor.ExactRequestCode.ACTIVATE, Drone_Lifecycle_Energy_Governor.RequestFamily.READINESS)
          case Drone_Lifecycle_Energy_Governor.LifecycleRequest.DEACTIVATE =>
            publish(api, Drone_Lifecycle_Energy_Governor.ExactRequestCode.DEACTIVATE, Drone_Lifecycle_Energy_Governor.RequestFamily.READINESS)
          case Drone_Lifecycle_Energy_Governor.LifecycleRequest.LAUNCH =>
            publish(api, Drone_Lifecycle_Energy_Governor.ExactRequestCode.LAUNCH, Drone_Lifecycle_Energy_Governor.RequestFamily.READINESS)
          case Drone_Lifecycle_Energy_Governor.LifecycleRequest.RETURN =>
            publish(api, Drone_Lifecycle_Energy_Governor.ExactRequestCode.RETURN, Drone_Lifecycle_Energy_Governor.RequestFamily.AIRBORNE)
          case Drone_Lifecycle_Energy_Governor.LifecycleRequest.LAND =>
            publish(api, Drone_Lifecycle_Energy_Governor.ExactRequestCode.LAND, Drone_Lifecycle_Energy_Governor.RequestFamily.AIRBORNE)
          case _ =>
            publish(api, Drone_Lifecycle_Energy_Governor.ExactRequestCode.NONE, Drone_Lifecycle_Energy_Governor.RequestFamily.ABSENT)
        }
      case _ =>
        publish(api, Drone_Lifecycle_Energy_Governor.ExactRequestCode.NONE, Drone_Lifecycle_Energy_Governor.RequestFamily.ABSENT)
    }
  }

  def publish(
    api: RequestApplicabilityOwner_Api,
    code: Drone_Lifecycle_Energy_Governor.ExactRequestCode.Type,
    family: Drone_Lifecycle_Energy_Governor.RequestFamily.Type): Unit = {
    Contract(Modifies(api))
    api.put_semanticsToAirborne(Drone_Lifecycle_Energy_Governor.AirborneClassifiedRequest(code, family))
    api.put_semanticsToLifecycle(Drone_Lifecycle_Energy_Governor.LifecycleClassifiedRequest(code, family))
  }

  def finalise(api: RequestApplicabilityOwner_Operational_Api): Unit = { }
}
