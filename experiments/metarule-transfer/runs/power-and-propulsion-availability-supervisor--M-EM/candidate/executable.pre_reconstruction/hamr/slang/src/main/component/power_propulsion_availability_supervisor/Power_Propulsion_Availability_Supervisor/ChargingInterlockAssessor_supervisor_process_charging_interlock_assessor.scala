// #Sireum

package power_propulsion_availability_supervisor.Power_Propulsion_Availability_Supervisor

import org.sireum._
import power_propulsion_availability_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor {

  def initialise(api: ChargingInterlockAssessor_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_charging_assessment(Power_Propulsion_Availability_Supervisor.ChargingAssessment.READY_NONE)
  }

  def timeTriggered(api: ChargingInterlockAssessor_Operational_Api): Unit = {
    // example api usage

    val apiUsage_charger_evidence: Option[Power_Propulsion_Availability_Supervisor.ChargerEvidence] = api.get_charger_evidence()
    api.logInfo(s"Received on data port charger_evidence: ${apiUsage_charger_evidence}")
  }

  def finalise(api: ChargingInterlockAssessor_Operational_Api): Unit = { }
}
