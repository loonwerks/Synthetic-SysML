// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_3336ea1866ee_2_Complement {
  @pure def check(
      healthdecision: equiv_shared_0.Vehicle_Temperature_Health_Supervisor.HealthDecision,
      maintenanceassessment: equiv_shared_0.Vehicle_Temperature_Health_Supervisor.MaintenanceAssessment.Type,
      recoveryproposal: equiv_shared_0.Vehicle_Temperature_Health_Supervisor.RecoveryProposal.Type,
      temperatureassessment: equiv_shared_0.Vehicle_Temperature_Health_Supervisor.TemperatureAssessment.Type,
      healthstate: equiv_shared_0.Vehicle_Temperature_Health_Supervisor.VehicleHealthMode.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_GumboX.inititialize_IEP_Post(healthstate, healthdecision))) & T)))
  }
}
