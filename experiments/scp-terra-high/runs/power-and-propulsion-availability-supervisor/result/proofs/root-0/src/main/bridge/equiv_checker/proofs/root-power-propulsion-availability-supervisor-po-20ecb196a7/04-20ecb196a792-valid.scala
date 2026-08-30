// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_20ecb196a792_4_Valid {
  @pure def check(
      power_assessment: equiv_shared_0.Power_Propulsion_Availability_Supervisor.PowerAssessment.Type,
      power_evidence: equiv_shared_0.Power_Propulsion_Availability_Supervisor.PowerEvidence): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_GumboX.compute_CEP_Post(power_evidence, power_assessment))) ___>: (equiv_shared_0.Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_Candidate_GumboX.compute_CEP_Post(power_evidence, power_assessment))) & T))
  }
}
