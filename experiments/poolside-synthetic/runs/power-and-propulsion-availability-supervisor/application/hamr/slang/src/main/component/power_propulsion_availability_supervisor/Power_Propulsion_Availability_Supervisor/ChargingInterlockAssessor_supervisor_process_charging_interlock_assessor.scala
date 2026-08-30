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
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_15_CHARGING_READY
        //   If charger evidence validity is VALID, freshness is CURRENT, and coupling is DISCONNECTED
        (api.charger_evidence.validity == EvidenceValidity.VALID &
          api.charger_evidence.freshness == EvidenceFreshness.CURRENT &
          api.charger_evidence.coupling == ChargerCoupling.DISCONNECTED) ___>: (api.charging_assessment == ChargingAssessment.READY_NONE),
        // case CASE_16_CHARGING_NOT_READY
        //   If charger evidence validity is INVALID, freshness is STALE, or coupling is not DISCONNECTED
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
    // example api usage

    val apiUsage_charger_evidence: Option[Power_Propulsion_Availability_Supervisor.ChargerEvidence] = api.get_charger_evidence()
    api.logInfo(s"Received on data port charger_evidence: ${apiUsage_charger_evidence}")
  }

  def finalise(api: ChargingInterlockAssessor_Operational_Api): Unit = { }
}
