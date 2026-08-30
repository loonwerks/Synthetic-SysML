// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_821ad03824c3_2_Valid {
  @pure def check(
      batteryfaultin: B,
      chargerfaultin: B,
      contextfaultin: B,
      faultstocomposition: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.FaultFacts,
      faultstonotification: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.FaultFacts,
      interfacefaultin: B,
      sessionconflictin: B): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_Candidate_GumboX.inititialize_IEP_Post(faultstocomposition, faultstonotification))) ___>: (equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_GumboX.inititialize_IEP_Post(faultstocomposition, faultstonotification))) & T))
  }
}
