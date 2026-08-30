// #Sireum

package factory_dispatch_coordinator.Factory_Dispatch_Coordinator

import org.sireum._
import factory_dispatch_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object Dock_Qualifier_dispatch_coordinator_process_dock_qualifier {

  def initialise(api: Dock_Qualifier_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_assessment(Factory_Dispatch_Coordinator.Dock_Assessment.Unknown)
  }

  def timeTriggered(api: Dock_Qualifier_Operational_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case DOCK_READY
        //   dock ready
        (api.dock_snapshot.validity == Observation_Validity.Valid &
          api.dock_snapshot.disposition == Dock_Disposition.Ready) ___>: (api.assessment == Dock_Assessment.Ready),
        // case DOCK_BLOCKED
        //   dock blocked
        (api.dock_snapshot.validity == Observation_Validity.Valid &
          api.dock_snapshot.disposition != Dock_Disposition.Ready) ___>: (api.assessment == Dock_Assessment.Blocked),
        // case DOCK_UNKNOWN
        //   dock unknown
        (api.dock_snapshot.validity == Observation_Validity.Invalid) ___>: (api.assessment == Dock_Assessment.Unknown)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_dock_snapshot: Option[Factory_Dispatch_Coordinator.Dock_Snapshot] = api.get_dock_snapshot()
    api.logInfo(s"Received on data port dock_snapshot: ${apiUsage_dock_snapshot}")

    val dockSnapshot = api.get_dock_snapshot().get

    if (dockSnapshot.validity == Observation_Validity.Valid) {
      if (dockSnapshot.disposition == Dock_Disposition.Ready) {
        api.put_assessment(Dock_Assessment.Ready)
      } else {
        api.put_assessment(Dock_Assessment.Blocked)
      }
    } else {
      api.put_assessment(Dock_Assessment.Unknown)
    }
  }

  def finalise(api: Dock_Qualifier_Operational_Api): Unit = { }
}
