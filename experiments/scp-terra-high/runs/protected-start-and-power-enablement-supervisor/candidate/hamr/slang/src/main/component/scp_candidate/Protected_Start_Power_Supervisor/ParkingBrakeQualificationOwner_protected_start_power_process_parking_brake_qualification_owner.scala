// #Sireum

package scp_candidate.Protected_Start_Power_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner {

  def initialise(api: ParkingBrakeQualificationOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_qualified_parking_brake_facts(Protected_Start_Power_Supervisor.QualifiedParkingBrakeFacts(F))
    api.put_parking_brake_fault(F)
  }

  def timeTriggered(api: ParkingBrakeQualificationOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.get_parking_brake_report() match {
      case Some(report) =>
        val valid = report.status == Protected_Start_Power_Supervisor.Validity.Valid
        api.put_qualified_parking_brake_facts(Protected_Start_Power_Supervisor.QualifiedParkingBrakeFacts(
          valid && report.condition == Protected_Start_Power_Supervisor.ParkingBrakeCondition.Applied))
        api.put_parking_brake_fault(!valid)
    }
  }

  def finalise(api: ParkingBrakeQualificationOwner_Operational_Api): Unit = { }
}
