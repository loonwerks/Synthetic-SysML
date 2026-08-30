// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_66002fea1568_4_Valid {
  @pure def check(
      configuration_assessment: equiv_shared_0.Power_Propulsion_Availability_Supervisor.ConfigurationAssessment.Type,
      even_engine_assessment: equiv_shared_0.Power_Propulsion_Availability_Supervisor.EnginePairAssessment.Type,
      odd_engine_assessment: equiv_shared_0.Power_Propulsion_Availability_Supervisor.EnginePairAssessment.Type,
      propulsion_assessment: equiv_shared_0.Power_Propulsion_Availability_Supervisor.PropulsionAssessment.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_GumboX.compute_CEP_Post(configuration_assessment, even_engine_assessment, odd_engine_assessment, propulsion_assessment))) ___>: (equiv_shared_0.Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_Candidate_GumboX.compute_CEP_Post(configuration_assessment, even_engine_assessment, odd_engine_assessment, propulsion_assessment))) & T))
  }
}
