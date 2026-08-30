// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_458462068435_3_Valid {
  @pure def check(
      healthdecision: equiv_shared_0.Vehicle_Temperature_Health_Supervisor.HealthDecision,
      powerdisposition: equiv_shared_0.Vehicle_Temperature_Health_Supervisor.ElectricalPowerDisposition.Type,
      recoveryguidance: equiv_shared_0.Vehicle_Temperature_Health_Supervisor.RecoveryGuidance.Type,
      recoveryproposal: equiv_shared_0.Vehicle_Temperature_Health_Supervisor.RecoveryProposal.Type,
      vehiclehealthmode: equiv_shared_0.Vehicle_Temperature_Health_Supervisor.VehicleHealthMode.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
