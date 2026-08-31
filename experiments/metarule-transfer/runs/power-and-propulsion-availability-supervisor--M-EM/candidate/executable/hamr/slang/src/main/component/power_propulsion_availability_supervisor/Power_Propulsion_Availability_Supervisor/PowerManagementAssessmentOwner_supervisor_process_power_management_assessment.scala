// #Sireum

package power_propulsion_availability_supervisor.Power_Propulsion_Availability_Supervisor

import org.sireum._
import power_propulsion_availability_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object PowerManagementAssessmentOwner_supervisor_process_power_management_assessment {

  def initialise(api: PowerManagementAssessmentOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_power_assessment(Power_Propulsion_Availability_Supervisor.PowerAssessment.NOT_READY_INVALID)
  }

  def timeTriggered(api: PowerManagementAssessmentOwner_Operational_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_05_POWER_READY
        (api.power_evidence.validity == EvidenceValidity.VALID &
          api.power_evidence.freshness == EvidenceFreshness.CURRENT &
          api.power_evidence.condition == PowerCondition.NOMINAL) ___>: (api.power_assessment == PowerAssessment.READY_NONE),
        // case CASE_06_POWER_NOT_READY
        (api.power_evidence.validity == EvidenceValidity.INVALID |
          api.power_evidence.freshness == EvidenceFreshness.STALE |
          api.power_evidence.condition != PowerCondition.NOMINAL) ___>: (api.power_evidence.validity == EvidenceValidity.INVALID &
          api.power_assessment == PowerAssessment.NOT_READY_INVALID |
          api.power_evidence.validity == EvidenceValidity.VALID &
            api.power_evidence.freshness == EvidenceFreshness.STALE &
            api.power_assessment == PowerAssessment.NOT_READY_STALE |
          api.power_evidence.validity == EvidenceValidity.VALID &
            api.power_evidence.freshness == EvidenceFreshness.CURRENT &
            api.power_evidence.condition != PowerCondition.NOMINAL &
            api.power_assessment == PowerAssessment.NOT_READY_CONDITION)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val e: Power_Propulsion_Availability_Supervisor.PowerEvidence = api.get_power_evidence().get
    api.put_power_assessment(
      if (e.validity == EvidenceValidity.INVALID) PowerAssessment.NOT_READY_INVALID
      else if (e.freshness == EvidenceFreshness.STALE) PowerAssessment.NOT_READY_STALE
      else if (e.condition == PowerCondition.NOMINAL) PowerAssessment.READY_NONE
      else PowerAssessment.NOT_READY_CONDITION)
  }

  def finalise(api: PowerManagementAssessmentOwner_Operational_Api): Unit = { }
}
