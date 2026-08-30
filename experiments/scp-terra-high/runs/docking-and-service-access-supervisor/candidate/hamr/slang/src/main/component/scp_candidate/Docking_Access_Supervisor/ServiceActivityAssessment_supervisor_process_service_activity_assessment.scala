// #Sireum

package scp_candidate.Docking_Access_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ServiceActivityAssessment_supervisor_process_service_activity_assessment {

  def initialise(api: ServiceActivityAssessment_Initialization_Api): Unit = {
    Contract(Modifies(api))
    val f = Docking_Access_Supervisor.ServiceFacts(
      F, Docking_Access_Supervisor.ServiceClass.INVALID, F, F, F)
    api.put_service_readiness(f)
    api.put_service_facts(f)
  }

  def timeTriggered(api: ServiceActivityAssessment_Operational_Api): Unit = {
    Contract(Modifies(api))
    val f = Docking_Access_Supervisor.ServiceFacts(
      F, Docking_Access_Supervisor.ServiceClass.INVALID, F, F, F)
    api.put_service_readiness(f)
    api.put_service_facts(f)
  }

  def finalise(api: ServiceActivityAssessment_Operational_Api): Unit = { }
}
