// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_34c82d08ae22_3_Valid {
  @pure def check(
      maintenanceassessment: equiv_shared_0.Vehicle_Temperature_Health_Supervisor.MaintenanceAssessment.Type,
      proposalforarbitration: equiv_shared_0.Vehicle_Temperature_Health_Supervisor.RecoveryProposal.Type,
      proposalforoutcomes: equiv_shared_0.Vehicle_Temperature_Health_Supervisor.RecoveryProposal.Type,
      rawreturn: equiv_shared_0.Vehicle_Temperature_Health_Supervisor.ReturnSample,
      temperatureassessment: equiv_shared_0.Vehicle_Temperature_Health_Supervisor.TemperatureAssessment.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
