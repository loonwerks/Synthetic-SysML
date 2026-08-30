// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_56eee0f8ceb3_2_Complement {
  @pure def check(
      configuration_assessment: equiv_shared_0.Power_Propulsion_Availability_Supervisor.ConfigurationAssessment.Type,
      configuration_evidence: equiv_shared_0.Power_Propulsion_Availability_Supervisor.ConfigurationEvidence): Unit = {
    Contract(Requires(!((((T) & (equiv_shared_0.Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_Candidate_GumboX.compute_CEP_Post(configuration_evidence, configuration_assessment))) ___>: (equiv_shared_0.Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_GumboX.compute_CEP_Post(configuration_evidence, configuration_assessment))) & T)))
  }
}
