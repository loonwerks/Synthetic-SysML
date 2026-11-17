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

    api.put_charging_assessment(Power_Propulsion_Availability_Supervisor.ChargingAssessment.NOT_READY_INVALID)
  }

  def timeTriggered(api: ChargingInterlockAssessor_Operational_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_15_CHARGING_READY
        (api.charger_evidence.validity == EvidenceValidity.VALID &
          api.charger_evidence.freshness == EvidenceFreshness.CURRENT &
          api.charger_evidence.coupling == ChargerCoupling.DISCONNECTED) ___>: (api.charging_assessment == ChargingAssessment.READY_NONE),
        // case CASE_16_CHARGING_NOT_READY
        (api.charger_evidence.validity == EvidenceValidity.INVALID |
          api.charger_evidence.freshness == EvidenceFreshness.STALE |
          api.charger_evidence.coupling != ChargerCoupling.DISCONNECTED) ___>: (api.charger_evidence.validity == EvidenceValidity.INVALID &
          api.charging_assessment == ChargingAssessment.NOT_READY_INVALID |
          api.charger_evidence.validity == EvidenceValidity.VALID &
            api.charger_evidence.freshness == EvidenceFreshness.STALE &
            api.charging_assessment == ChargingAssessment.NOT_READY_STALE |
          api.charger_evidence.validity == EvidenceValidity.VALID &
            api.charger_evidence.freshness == EvidenceFreshness.CURRENT &
            api.charger_evidence.coupling == ChargerCoupling.CONNECTED_IDLE &
            api.charging_assessment == ChargingAssessment.NOT_READY_CONNECTED_IDLE |
          api.charger_evidence.validity == EvidenceValidity.VALID &
            api.charger_evidence.freshness == EvidenceFreshness.CURRENT &
            (api.charger_evidence.coupling == ChargerCoupling.CHARGING |
              api.charger_evidence.coupling == ChargerCoupling.UNKNOWN) &
            api.charging_assessment == ChargingAssessment.NOT_READY_CHARGING_OR_UNKNOWN)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val e: Power_Propulsion_Availability_Supervisor.ChargerEvidence = api.get_charger_evidence().get
    api.put_charging_assessment(
      if (e.validity == EvidenceValidity.INVALID) ChargingAssessment.NOT_READY_INVALID
      else if (e.freshness == EvidenceFreshness.STALE) ChargingAssessment.NOT_READY_STALE
      else if (e.coupling == ChargerCoupling.DISCONNECTED) ChargingAssessment.READY_NONE
      else if (e.coupling == ChargerCoupling.CONNECTED_IDLE) ChargingAssessment.NOT_READY_CONNECTED_IDLE
      else ChargingAssessment.NOT_READY_CHARGING_OR_UNKNOWN)
  }

  def finalise(api: ChargingInterlockAssessor_Operational_Api): Unit = { }
}
