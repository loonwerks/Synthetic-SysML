// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_6ef5b5a0e7ee_1_Valid {
  @pure def check(
      conflicttoaggregation: B,
      eligibilityin: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibility.Type,
      interfacein: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.InterfaceFacts,
      requestin: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.ServiceRequest.Type,
      resolutiontonotification: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.SessionResolution,
      sessionstate: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.SourceChargeSession.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
