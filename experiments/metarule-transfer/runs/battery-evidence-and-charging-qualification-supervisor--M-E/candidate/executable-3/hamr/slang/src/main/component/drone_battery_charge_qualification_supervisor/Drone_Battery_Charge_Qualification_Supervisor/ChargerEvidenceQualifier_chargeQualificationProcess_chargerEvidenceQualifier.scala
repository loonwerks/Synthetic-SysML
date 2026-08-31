// #Sireum

package drone_battery_charge_qualification_supervisor.Drone_Battery_Charge_Qualification_Supervisor

import org.sireum._
import drone_battery_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier {

  def initialise(api: ChargerEvidenceQualifier_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

  }

  def timeTriggered(api: ChargerEvidenceQualifier_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee CHARGER_FAULT_PUBLICATION
        api.faultToAggregation == api.factsToEligibility.chargerFault,
        // case CHARGER_DISCONNECTED
        (api.reportIn == ChargerReport.Disconnected) ___>: (!(api.factsToEligibility.chargerUsable) & !(api.factsToEligibility.chargerConnected) &
          !(api.factsToEligibility.chargerFault)),
        // case CHARGER_READY
        (api.reportIn == ChargerReport.Ready) ___>: (api.factsToEligibility.chargerUsable & api.factsToEligibility.chargerConnected &
          !(api.factsToEligibility.chargerFault)),
        // case CHARGER_FAULTED
        (api.reportIn == ChargerReport.Faulted) ___>: (!(api.factsToEligibility.chargerUsable) & api.factsToEligibility.chargerConnected &
          api.factsToEligibility.chargerFault),
        // case CHARGER_UNKNOWN
        (api.reportIn == ChargerReport.Unknown) ___>: (!(api.factsToEligibility.chargerUsable) & !(api.factsToEligibility.chargerConnected) &
          api.factsToEligibility.chargerFault)
        // END COMPUTE ENSURES timeTriggered
      )
    )
        val apiUsage_reportIn: Option[Drone_Battery_Charge_Qualification_Supervisor.ChargerReport.Type] = api.get_reportIn()
    api.logInfo(s"Received on data port reportIn: ${apiUsage_reportIn}")
    val facts: ChargerFacts =
      if (apiUsage_reportIn.get == ChargerReport.Disconnected) ChargerFacts(F, F, F)
      else if (apiUsage_reportIn.get == ChargerReport.Ready) ChargerFacts(T, T, F)
      else if (apiUsage_reportIn.get == ChargerReport.Faulted) ChargerFacts(F, T, T)
      else ChargerFacts(F, F, T)
    api.put_factsToEligibility(facts)
    api.put_faultToAggregation(facts.chargerFault)
  }

  def finalise(api: ChargerEvidenceQualifier_Operational_Api): Unit = { }
}
