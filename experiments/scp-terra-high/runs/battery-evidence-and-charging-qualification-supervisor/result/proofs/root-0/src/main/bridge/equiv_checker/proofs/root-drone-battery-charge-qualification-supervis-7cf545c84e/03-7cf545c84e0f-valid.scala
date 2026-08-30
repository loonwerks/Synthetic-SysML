// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_7cf545c84e0f_3_Valid {
  @pure def check(
      conflicttoaggregation: B,
      eligibilityin: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibility.Type,
      interfacein: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.InterfaceFacts,
      requestin: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.ServiceRequest.Type,
      resolutiontonotification: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.SessionResolution,
      in_sessionstate: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.SourceChargeSession.Type,
      sessionstate: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.SourceChargeSession.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
