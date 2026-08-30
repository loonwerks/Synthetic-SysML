// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_490f483b5262_2_Valid {
  @pure def check(
      factstoeligibility: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.ChargerFacts,
      faulttoaggregation: B,
      reportin: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.ChargerReport.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_Candidate_GumboX.compute_CEP_Post(reportin, factstoeligibility, faulttoaggregation))) ___>: (equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_GumboX.compute_CEP_Post(reportin, factstoeligibility, faulttoaggregation))) & T))
  }
}
