// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_1ab85240039b_2_Valid {
  @pure def check(
      healthdecision: equiv_shared_0.Vehicle_Temperature_Health_Supervisor.HealthDecision,
      maintenanceassessment: equiv_shared_0.Vehicle_Temperature_Health_Supervisor.MaintenanceAssessment.Type,
      recoveryproposal: equiv_shared_0.Vehicle_Temperature_Health_Supervisor.RecoveryProposal.Type,
      temperatureassessment: equiv_shared_0.Vehicle_Temperature_Health_Supervisor.TemperatureAssessment.Type,
      in_healthstate: equiv_shared_0.Vehicle_Temperature_Health_Supervisor.VehicleHealthMode.Type,
      healthstate: equiv_shared_0.Vehicle_Temperature_Health_Supervisor.VehicleHealthMode.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_GumboX.compute_CEP_Post(in_healthstate, healthstate, maintenanceassessment, recoveryproposal, temperatureassessment, healthdecision))) & T))
  }
}
