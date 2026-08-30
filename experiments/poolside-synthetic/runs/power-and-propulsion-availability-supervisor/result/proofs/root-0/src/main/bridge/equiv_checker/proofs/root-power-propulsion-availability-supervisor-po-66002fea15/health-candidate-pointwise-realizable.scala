// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_66002fea1568_Candidate_Pointwise_Realizable {
  @pure def check(
      configuration_assessment: equiv_shared_0.Power_Propulsion_Availability_Supervisor.ConfigurationAssessment.Type,
      even_engine_assessment: equiv_shared_0.Power_Propulsion_Availability_Supervisor.EnginePairAssessment.Type,
      odd_engine_assessment: equiv_shared_0.Power_Propulsion_Availability_Supervisor.EnginePairAssessment.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_Candidate_GumboX.compute_CEP_Post(configuration_assessment, even_engine_assessment, odd_engine_assessment, equiv_shared_0.Power_Propulsion_Availability_Supervisor.PropulsionAssessment.READY_NONE)) |
        (equiv_shared_0.Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_Candidate_GumboX.compute_CEP_Post(configuration_assessment, even_engine_assessment, odd_engine_assessment, equiv_shared_0.Power_Propulsion_Availability_Supervisor.PropulsionAssessment.NOT_READY_ODD_ENGINE_GROUP)) |
        (equiv_shared_0.Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_Candidate_GumboX.compute_CEP_Post(configuration_assessment, even_engine_assessment, odd_engine_assessment, equiv_shared_0.Power_Propulsion_Availability_Supervisor.PropulsionAssessment.NOT_READY_EVEN_ENGINE_GROUP)) |
        (equiv_shared_0.Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_Candidate_GumboX.compute_CEP_Post(configuration_assessment, even_engine_assessment, odd_engine_assessment, equiv_shared_0.Power_Propulsion_Availability_Supervisor.PropulsionAssessment.NOT_READY_CONFIGURATION)))))
  }
}
