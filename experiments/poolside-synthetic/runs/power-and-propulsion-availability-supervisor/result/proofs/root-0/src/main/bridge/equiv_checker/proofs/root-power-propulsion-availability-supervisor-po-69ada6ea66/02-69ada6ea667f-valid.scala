// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_69ada6ea667f_2_Valid {
  @pure def check(
      configuration_assessment: equiv_shared_0.Power_Propulsion_Availability_Supervisor.ConfigurationAssessment.Type,
      configuration_evidence: equiv_shared_0.Power_Propulsion_Availability_Supervisor.ConfigurationEvidence): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_Candidate_GumboX.inititialize_IEP_Post(configuration_assessment))) ___>: (equiv_shared_0.Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_GumboX.inititialize_IEP_Post(configuration_assessment))) & T))
  }
}
