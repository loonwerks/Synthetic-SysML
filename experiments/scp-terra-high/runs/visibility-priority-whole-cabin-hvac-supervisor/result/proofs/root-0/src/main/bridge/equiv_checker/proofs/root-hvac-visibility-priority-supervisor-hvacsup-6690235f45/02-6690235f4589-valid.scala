// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_6690235f4589_2_Valid {
  @pure def check(
      airneed: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.AirNeed.Type,
      airpath: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.AirPathReadiness,
      cabinairproposal: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.CabinAirProposal,
      humidityneed: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.HumidityNeed.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.HVAC_Visibility_Priority_Supervisor.CabinAirServiceProposer_supervision_cabinAirServiceProposer_GumboX.inititialize_IEP_Post(cabinairproposal))) & T))
  }
}
