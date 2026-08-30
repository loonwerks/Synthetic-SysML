// #Sireum

package scp_candidate.Docking_Access_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object VesselStatusAssessment_supervisor_process_vessel_status_assessment {

  def initialise(api: VesselStatusAssessment_Initialization_Api): Unit = {
    Contract(Modifies(api))
    val f = Docking_Access_Supervisor.VesselFacts(
      F, Docking_Access_Supervisor.VesselClass.INVALID, F, F, F,
      Docking_Access_Supervisor.Correlation.NONE)
    api.put_vessel_readiness(f)
    api.put_vessel_facts(f)
  }

  def timeTriggered(api: VesselStatusAssessment_Operational_Api): Unit = {
    Contract(Modifies(api))
    val f = Docking_Access_Supervisor.VesselFacts(
      F, Docking_Access_Supervisor.VesselClass.INVALID, F, F, F,
      Docking_Access_Supervisor.Correlation.NONE)
    api.put_vessel_readiness(f)
    api.put_vessel_facts(f)
  }

  def finalise(api: VesselStatusAssessment_Operational_Api): Unit = { }
}
