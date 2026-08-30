// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_fde6e683d803_2_Complement {
  @pure def check(
      wasteheatavailability: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.WasteHeatAvailability,
      wasteheateligibility: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.WasteHeatEligibility.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_GumboX.compute_CEP_Post(wasteheatavailability, wasteheateligibility))) & T)))
  }
}
