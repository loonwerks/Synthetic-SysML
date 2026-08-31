// #Sireum

package observation_sortie_eligibility_supervisor.Observation_Sortie_Eligibility_Supervisor

import org.sireum._
import observation_sortie_eligibility_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor {

  def initialise(api: CommunicationEvidenceAssessor_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_communication_assessment(SingleEquipmentAssessment(F, SingleEquipmentCause.Invalid))
  }

  def timeTriggered(api: CommunicationEvidenceAssessor_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case COMMUNICATION_READY
        (api.communication_evidence.validity == Validity.Valid &
          api.communication_evidence.freshness == Freshness.Current &
          api.communication_evidence.condition == EquipmentCondition.Nominal) ___>: (api.communication_assessment.ready &
          api.communication_assessment.localCause == SingleEquipmentCause.None),
        // case COMMUNICATION_INVALID
        (api.communication_evidence.validity == Validity.Invalid) ___>: (!(api.communication_assessment.ready) &
          api.communication_assessment.localCause == SingleEquipmentCause.Invalid),
        // case COMMUNICATION_STALE
        (api.communication_evidence.validity == Validity.Valid &
          api.communication_evidence.freshness == Freshness.Stale) ___>: (!(api.communication_assessment.ready) &
          api.communication_assessment.localCause == SingleEquipmentCause.Stale),
        // case COMMUNICATION_CONDITION
        (api.communication_evidence.validity == Validity.Valid &
          api.communication_evidence.freshness == Freshness.Current &
          api.communication_evidence.condition != EquipmentCondition.Nominal) ___>: (!(api.communication_assessment.ready) &
          api.communication_assessment.localCause == SingleEquipmentCause.Condition)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val evidence = api.get_communication_evidence().get
    val assessment: SingleEquipmentAssessment =
      if (evidence.validity == Validity.Invalid) SingleEquipmentAssessment(F, SingleEquipmentCause.Invalid)
      else if (evidence.freshness == Freshness.Stale) SingleEquipmentAssessment(F, SingleEquipmentCause.Stale)
      else if (evidence.condition == EquipmentCondition.Nominal) SingleEquipmentAssessment(T, SingleEquipmentCause.None)
      else SingleEquipmentAssessment(F, SingleEquipmentCause.Condition)
    api.put_communication_assessment(assessment)
  }

  def finalise(api: CommunicationEvidenceAssessor_Operational_Api): Unit = { }
}
