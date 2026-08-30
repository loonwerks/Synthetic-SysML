// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_0cd50ce3d4d8_4_Valid {
  @pure def check(
      criticalelectrical: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.ElectricalCriticality.Type,
      electricalavailability: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.ElectricalAvailability,
      electricaleligibility: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.ElectricalEligibility): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.HVAC_Visibility_Priority_Supervisor.ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_GumboX.compute_CEP_Post(electricalavailability, criticalelectrical, electricaleligibility))) ___>: (T)) & T))
  }
}
