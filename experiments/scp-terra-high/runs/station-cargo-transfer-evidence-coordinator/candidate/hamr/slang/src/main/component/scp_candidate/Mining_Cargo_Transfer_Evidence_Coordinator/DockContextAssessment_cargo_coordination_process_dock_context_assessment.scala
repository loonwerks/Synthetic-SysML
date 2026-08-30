// #Sireum

package scp_candidate.Mining_Cargo_Transfer_Evidence_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object DockContextAssessment_cargo_coordination_process_dock_context_assessment {

  def initialise(api: DockContextAssessment_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_dock_facts(Mining_Cargo_Transfer_Evidence_Coordinator.DockFacts(
      F, F, F, F,
      Mining_Cargo_Transfer_Evidence_Coordinator.DockReason.INVALID_CONTEXT))
  }

  def timeTriggered(api: DockContextAssessment_Operational_Api): Unit = { }
  def finalise(api: DockContextAssessment_Operational_Api): Unit = { }
}
