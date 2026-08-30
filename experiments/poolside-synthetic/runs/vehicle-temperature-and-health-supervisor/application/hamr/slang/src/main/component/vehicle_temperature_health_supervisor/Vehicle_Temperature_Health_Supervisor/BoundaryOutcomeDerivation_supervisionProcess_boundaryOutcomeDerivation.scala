// #Sireum

package vehicle_temperature_health_supervisor.Vehicle_Temperature_Health_Supervisor

import org.sireum._
import vehicle_temperature_health_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation {

  def initialise(api: BoundaryOutcomeDerivation_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_vehicleHealthMode(Vehicle_Temperature_Health_Supervisor.VehicleHealthMode.Operational)
    api.put_powerDisposition(Vehicle_Temperature_Health_Supervisor.ElectricalPowerDisposition.Enable)
    api.put_recoveryGuidance(Vehicle_Temperature_Health_Supervisor.RecoveryGuidance.None)
  }

  def timeTriggered(api: BoundaryOutcomeDerivation_Operational_Api): Unit = {
    // example api usage

    val apiUsage_healthDecision: Option[Vehicle_Temperature_Health_Supervisor.HealthDecision] = api.get_healthDecision()
    api.logInfo(s"Received on data port healthDecision: ${apiUsage_healthDecision}")
    val apiUsage_recoveryProposal: Option[Vehicle_Temperature_Health_Supervisor.RecoveryProposal.Type] = api.get_recoveryProposal()
    api.logInfo(s"Received on data port recoveryProposal: ${apiUsage_recoveryProposal}")
  }

  def finalise(api: BoundaryOutcomeDerivation_Operational_Api): Unit = { }
}
