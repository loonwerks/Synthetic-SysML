// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_f59495a250d2_2_Valid {
  @pure def check(
      factstoeligibility: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.InterfaceFacts,
      factstosession: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.InterfaceFacts,
      faulttoaggregation: B,
      reportin: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.ChargeInterfaceReport.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_Candidate_GumboX.inititialize_IEP_Post(factstoeligibility, factstosession, faulttoaggregation))) ___>: (equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_GumboX.inititialize_IEP_Post(factstoeligibility, factstosession, faulttoaggregation))) & T))
  }
}
