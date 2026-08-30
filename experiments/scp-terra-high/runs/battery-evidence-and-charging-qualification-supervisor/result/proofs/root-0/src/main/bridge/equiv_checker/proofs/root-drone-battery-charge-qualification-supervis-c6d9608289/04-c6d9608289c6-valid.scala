// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_c6d9608289c6_4_Valid {
  @pure def check(
      factstoeligibility: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.ChargerFacts,
      faulttoaggregation: B,
      reportin: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.ChargerReport.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_GumboX.inititialize_IEP_Post(factstoeligibility, faulttoaggregation))) ___>: (equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_Candidate_GumboX.inititialize_IEP_Post(factstoeligibility, faulttoaggregation))) & T))
  }
}
