// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_2d04d63b7933_2_Valid {
  @pure def check(
      candidateplan: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.CandidatePlan,
      electricaleligibility: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.ElectricalEligibility,
      selectedintent: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.SelectedIntent): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.HVAC_Visibility_Priority_Supervisor.EnergySafePlanComposer_supervision_energySafePlanComposer_GumboX.inititialize_IEP_Post(candidateplan))) & T))
  }
}
