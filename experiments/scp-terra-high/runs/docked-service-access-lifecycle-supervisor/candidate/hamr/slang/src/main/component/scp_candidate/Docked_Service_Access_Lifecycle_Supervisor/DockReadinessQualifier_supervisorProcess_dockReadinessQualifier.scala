// #Sireum

package scp_candidate.Docked_Service_Access_Lifecycle_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object DockReadinessQualifier_supervisorProcess_dockReadinessQualifier {

  def initialise(api: DockReadinessQualifier_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee READINESS_INITIAL_SAFE
        api.monitorReadiness == DockReadiness.READINESS_FAULT &&
          api.gateReadiness == DockReadiness.READINESS_FAULT
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_monitorReadiness(Docked_Service_Access_Lifecycle_Supervisor.DockReadiness.READINESS_FAULT)
    api.put_gateReadiness(Docked_Service_Access_Lifecycle_Supervisor.DockReadiness.READINESS_FAULT)
  }

  def timeTriggered(api: DockReadinessQualifier_Operational_Api): Unit = {
    Contract(Modifies(api))
    val berth: BerthObservation.Type = api.get_berthObservation().get
    val ship: ShipCondition.Type = api.get_shipCondition().get
    var readiness: DockReadiness.Type = DockReadiness.READINESS_CONFLICT
    if (berth == BerthObservation.INVALID || ship == ShipCondition.INVALID) {
      readiness = DockReadiness.READINESS_FAULT
    } else if (berth == BerthObservation.APPROACH_CLEAR && ship == ShipCondition.APPROACH_READY) {
      readiness = DockReadiness.DOCK_READY
    } else if (berth == BerthObservation.DOCKED_SECURE && ship == ShipCondition.SERVICE_READY) {
      readiness = DockReadiness.SERVICE_READY
    } else if (berth == BerthObservation.DEPARTURE_CLEAR && ship == ShipCondition.DEPARTURE_READY) {
      readiness = DockReadiness.UNDOCK_READY
    } else if (berth == BerthObservation.RELEASED && ship == ShipCondition.TRANSIT) {
      readiness = DockReadiness.RELEASE_CONFIRMED
    } else if (berth == BerthObservation.BLOCKED || ship == ShipCondition.NOT_READY) {
      readiness = DockReadiness.TEMPORARILY_BLOCKED
    }
    api.put_monitorReadiness(readiness)
    api.put_gateReadiness(readiness)
  }

  def finalise(api: DockReadinessQualifier_Operational_Api): Unit = { }
}
