// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_28a97f71e930_4_Valid {
  @pure def check(
      wasteheatavailability: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.WasteHeatAvailability,
      wasteheateligibility: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.WasteHeatEligibility.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.HVAC_Visibility_Priority_Supervisor.WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_GumboX.inititialize_IEP_Post(wasteheateligibility))) ___>: (T)) & T))
  }
}
