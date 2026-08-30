// #Sireum

package scp_candidate.Protected_Start_Power_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner {

  def initialise(api: ActuationCompositionOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_actuation_disposition(safeActuation())
  }

  def timeTriggered(api: ActuationCompositionOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    (api.get_session_decision_facts(), api.get_exact_fault_summary()) match {
      case (Some(session), Some(faults)) =>
        var disposition: Protected_Start_Power_Supervisor.ActuationDisposition = safeActuation()
        if (!faults.anyFault && session.session == Protected_Start_Power_Supervisor.Session.On) {
          disposition = Protected_Start_Power_Supervisor.ActuationDisposition(
            Protected_Start_Power_Supervisor.FuelDisposition.Enable,
            Protected_Start_Power_Supervisor.ElectricalDisposition.Provide,
            Protected_Start_Power_Supervisor.ParkingBrakeDisposition.Release)
        } else if (!faults.anyFault &&
          (session.session == Protected_Start_Power_Supervisor.Session.Arming ||
            session.session == Protected_Start_Power_Supervisor.Session.Maintenance)) {
          disposition = Protected_Start_Power_Supervisor.ActuationDisposition(
            Protected_Start_Power_Supervisor.FuelDisposition.Inhibit,
            Protected_Start_Power_Supervisor.ElectricalDisposition.Provide,
            Protected_Start_Power_Supervisor.ParkingBrakeDisposition.Apply)
        }
        api.put_actuation_disposition(disposition)
    }
  }

  def safeActuation(): Protected_Start_Power_Supervisor.ActuationDisposition = {
    return Protected_Start_Power_Supervisor.ActuationDisposition(
      Protected_Start_Power_Supervisor.FuelDisposition.Inhibit,
      Protected_Start_Power_Supervisor.ElectricalDisposition.Isolate,
      Protected_Start_Power_Supervisor.ParkingBrakeDisposition.Apply)
  }

  def finalise(api: ActuationCompositionOwner_Operational_Api): Unit = { }
}
