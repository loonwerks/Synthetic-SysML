// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_7c5e0c066f7c_2_Complement {
  @pure def check(
      batteryfaultin: B,
      chargerfaultin: B,
      contextfaultin: B,
      faultstocomposition: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.FaultFacts,
      faultstonotification: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.FaultFacts,
      interfacefaultin: B,
      sessionconflictin: B): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_GumboX.compute_CEP_Post(batteryfaultin, chargerfaultin, contextfaultin, interfacefaultin, sessionconflictin, faultstocomposition, faultstonotification))) & T)))
  }
}
