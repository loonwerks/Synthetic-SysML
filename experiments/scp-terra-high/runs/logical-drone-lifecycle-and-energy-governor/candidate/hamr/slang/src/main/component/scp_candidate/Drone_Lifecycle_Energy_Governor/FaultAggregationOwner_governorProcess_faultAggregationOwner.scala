// #Sireum

package scp_candidate.Drone_Lifecycle_Energy_Governor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object FaultAggregationOwner_governorProcess_faultAggregationOwner {

  def initialise(api: FaultAggregationOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_faultsOut(Drone_Lifecycle_Energy_Governor.FaultVector(T, F, F, F, F, F, T))
  }

  def timeTriggered(api: FaultAggregationOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.get_confidenceIn() match {
      case Some(confidence) => api.get_chargerFaultIn() match {
        case Some(chargerFault) => api.get_navigationIn() match {
          case Some(navigation) => api.get_flightControlIn() match {
            case Some(flightControl) => api.get_homeFaultIn() match {
              case Some(homeFault) => api.get_touchdownFaultIn() match {
                case Some(touchdownFault) =>
                  val batteryFault: B = confidence != Drone_Lifecycle_Energy_Governor.BatteryConfidence.TRUSTED
                  val navigationFault: B = navigation == Drone_Lifecycle_Energy_Governor.NavigationReport.UNUSABLE
                  val flightControlFault: B = flightControl == Drone_Lifecycle_Energy_Governor.FlightControlReport.FAULTED
                  val aggregate: B = batteryFault || chargerFault || navigationFault ||
                    flightControlFault || homeFault || touchdownFault
                  api.put_faultsOut(Drone_Lifecycle_Energy_Governor.FaultVector(
                    batteryFault, chargerFault, navigationFault, flightControlFault,
                    homeFault, touchdownFault, aggregate))
              }
            }
          }
        }
      }
    }
  }

  def finalise(api: FaultAggregationOwner_Operational_Api): Unit = { }
}
