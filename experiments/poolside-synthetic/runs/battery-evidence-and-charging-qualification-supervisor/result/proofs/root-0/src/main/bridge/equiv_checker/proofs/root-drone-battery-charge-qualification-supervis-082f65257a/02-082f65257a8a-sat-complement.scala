// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_082f65257a8a_2_Complement {
  @pure def check(
      factstoeligibility: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.InterfaceFacts,
      factstosession: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.InterfaceFacts,
      faulttoaggregation: B,
      reportin: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.ChargeInterfaceReport.Type): Unit = {
    Contract(Requires(!((((T) & (equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_Candidate_GumboX.compute_CEP_Post(reportin, factstoeligibility, factstosession, faulttoaggregation))) ___>: (equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_GumboX.compute_CEP_Post(reportin, factstoeligibility, factstosession, faulttoaggregation))) & T)))
  }
}
