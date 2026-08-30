// #Sireum

package protected_start_power_supervisor.Protected_Start_Power_Supervisor

import org.sireum._
import protected_start_power_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner {

  def initialise(api: ParkingBrakeQualificationOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_qualified_parking_brake_facts(Protected_Start_Power_Supervisor.QualifiedParkingBrakeFacts.example())
    api.put_parking_brake_fault(Base_Types.Boolean_example())
  }

  def timeTriggered(api: ParkingBrakeQualificationOwner_Operational_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee PARKING_BRAKE_QUALIFICATION_TOTAL
        //   qualified parking brake facts per parking brake report status and condition
        api.qualified_parking_brake_facts.brakeAppliedEvidence == (api.parking_brake_report.status == Validity.Valid &
          api.parking_brake_report.condition == ParkingBrakeCondition.Applied) &
          api.parking_brake_fault == (api.parking_brake_report.status == Validity.Invalid)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_parking_brake_report: Option[Protected_Start_Power_Supervisor.ParkingBrakeReport] = api.get_parking_brake_report()
    api.logInfo(s"Received on data port parking_brake_report: ${apiUsage_parking_brake_report}")
  }

  def finalise(api: ParkingBrakeQualificationOwner_Operational_Api): Unit = { }
}
