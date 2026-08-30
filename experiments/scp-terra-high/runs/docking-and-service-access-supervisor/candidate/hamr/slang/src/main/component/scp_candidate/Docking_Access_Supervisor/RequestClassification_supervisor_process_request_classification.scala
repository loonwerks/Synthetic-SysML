// #Sireum

package scp_candidate.Docking_Access_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object RequestClassification_supervisor_process_request_classification {

  def initialise(api: RequestClassification_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_request_facts(Docking_Access_Supervisor.RequestFacts(
      F, F, Docking_Access_Supervisor.RequestOperation.NONE,
      Docking_Access_Supervisor.Correlation.NONE, F))
  }

  def timeTriggered(api: RequestClassification_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.put_request_facts(Docking_Access_Supervisor.RequestFacts(
      F, F, Docking_Access_Supervisor.RequestOperation.NONE,
      Docking_Access_Supervisor.Correlation.NONE, F))
  }

  def finalise(api: RequestClassification_Operational_Api): Unit = { }
}
