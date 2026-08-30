// #Sireum

package scp_candidate.Docking_Access_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object RequestAdmission_supervisor_process_request_admission {

  def initialise(api: RequestAdmission_Initialization_Api): Unit = {
    Contract(Modifies(api))
    val d = Docking_Access_Supervisor.AdmissionDecision(
      Docking_Access_Supervisor.RequestDisposition.NO_REQUEST,
      Docking_Access_Supervisor.RequestOperation.NONE, Docking_Access_Supervisor.Correlation.NONE, F, F)
    api.put_lifecycle_admission(d)
    api.put_gate_admission(d)
    api.put_docking_admission(d)
    api.put_access_admission(d)
    api.put_undocking_admission(d)
    api.put_request_disposition(Docking_Access_Supervisor.RequestDisposition.NO_REQUEST)
  }

  def timeTriggered(api: RequestAdmission_Operational_Api): Unit = {
    Contract(Modifies(api))
    val d = Docking_Access_Supervisor.AdmissionDecision(
      Docking_Access_Supervisor.RequestDisposition.NO_REQUEST,
      Docking_Access_Supervisor.RequestOperation.NONE, Docking_Access_Supervisor.Correlation.NONE, F, F)
    api.put_lifecycle_admission(d)
    api.put_gate_admission(d)
    api.put_docking_admission(d)
    api.put_access_admission(d)
    api.put_undocking_admission(d)
    api.put_request_disposition(Docking_Access_Supervisor.RequestDisposition.NO_REQUEST)
  }

  def finalise(api: RequestAdmission_Operational_Api): Unit = { }
}
