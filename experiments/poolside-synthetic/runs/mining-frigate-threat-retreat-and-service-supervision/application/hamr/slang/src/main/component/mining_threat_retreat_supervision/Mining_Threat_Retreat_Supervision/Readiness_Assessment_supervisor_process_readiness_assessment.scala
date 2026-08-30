// #Sireum

package mining_threat_retreat_supervision.Mining_Threat_Retreat_Supervision

import org.sireum._
import mining_threat_retreat_supervision._

// This file will not be overwritten if HAMR codegen is rerun
object Readiness_Assessment_supervisor_process_readiness_assessment {

  def initialise(api: Readiness_Assessment_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_assessment_mining(Mining_Threat_Retreat_Supervision.ReadinessAssessmentValue.example())
    api.put_assessment_defense(Mining_Threat_Retreat_Supervision.ReadinessAssessmentValue.example())
    api.put_assessment_mobility(Mining_Threat_Retreat_Supervision.ReadinessAssessmentValue.example())
  }

  def timeTriggered(api: Readiness_Assessment_Operational_Api): Unit = {
    // example api usage

    val apiUsage_cargo_band: Option[Mining_Threat_Retreat_Supervision.CargoBandValue] = api.get_cargo_band()
    api.logInfo(s"Received on data port cargo_band: ${apiUsage_cargo_band}")
    val apiUsage_capacitor_band: Option[Mining_Threat_Retreat_Supervision.CapacitorBandValue] = api.get_capacitor_band()
    api.logInfo(s"Received on data port capacitor_band: ${apiUsage_capacitor_band}")
    val apiUsage_location: Option[Mining_Threat_Retreat_Supervision.LocationValue] = api.get_location()
    api.logInfo(s"Received on data port location: ${apiUsage_location}")
    val apiUsage_mining_available: Option[Mining_Threat_Retreat_Supervision.MiningAvailabilityValue] = api.get_mining_available()
    api.logInfo(s"Received on data port mining_available: ${apiUsage_mining_available}")
    val apiUsage_defense_available: Option[Mining_Threat_Retreat_Supervision.DefenseAvailabilityValue] = api.get_defense_available()
    api.logInfo(s"Received on data port defense_available: ${apiUsage_defense_available}")
    val apiUsage_retreat_available: Option[Mining_Threat_Retreat_Supervision.RetreatAvailabilityValue] = api.get_retreat_available()
    api.logInfo(s"Received on data port retreat_available: ${apiUsage_retreat_available}")
    val apiUsage_destination_available: Option[Mining_Threat_Retreat_Supervision.DestinationAvailabilityValue] = api.get_destination_available()
    api.logInfo(s"Received on data port destination_available: ${apiUsage_destination_available}")
    val apiUsage_service_available: Option[Mining_Threat_Retreat_Supervision.ServiceAvailabilityValue] = api.get_service_available()
    api.logInfo(s"Received on data port service_available: ${apiUsage_service_available}")
  }

  def finalise(api: Readiness_Assessment_Operational_Api): Unit = { }
}
