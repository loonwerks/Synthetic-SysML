// #Sireum

package power_propulsion_availability_supervisor.Power_Propulsion_Availability_Supervisor

import org.sireum._
import power_propulsion_availability_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor {

  def initialise(api: ChargingInterlockAssessor_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_charging_assessment(Power_Propulsion_Availability_Supervisor.ChargingAssessment.NOT_READY_INVALID)
  }

  def timeTriggered(api: ChargingInterlockAssessor_Operational_Api): Unit = {
    Contract(Modifies(api))
    val assessment: Power_Propulsion_Availability_Supervisor.ChargingAssessment.Type = api.get_charger_evidence() match {
      case Some(evidence) =>
        if (evidence.validity != Power_Propulsion_Availability_Supervisor.EvidenceValidity.VALID)
          Power_Propulsion_Availability_Supervisor.ChargingAssessment.NOT_READY_INVALID
        else if (evidence.freshness != Power_Propulsion_Availability_Supervisor.EvidenceFreshness.CURRENT)
          Power_Propulsion_Availability_Supervisor.ChargingAssessment.NOT_READY_STALE
        else if (evidence.coupling == Power_Propulsion_Availability_Supervisor.ChargerCoupling.CONNECTED_IDLE)
          Power_Propulsion_Availability_Supervisor.ChargingAssessment.NOT_READY_CONNECTED_IDLE
        else if (evidence.coupling != Power_Propulsion_Availability_Supervisor.ChargerCoupling.DISCONNECTED)
          Power_Propulsion_Availability_Supervisor.ChargingAssessment.NOT_READY_CHARGING_OR_UNKNOWN
        else Power_Propulsion_Availability_Supervisor.ChargingAssessment.READY_NONE
      case _ => Power_Propulsion_Availability_Supervisor.ChargingAssessment.NOT_READY_INVALID
    }
    api.put_charging_assessment(assessment)
  }

  def finalise(api: ChargingInterlockAssessor_Operational_Api): Unit = { }
}
