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

    api.put_factsToEligibility(Drone_Battery_Charge_Qualification_Supervisor.ChargerFacts.example())
    api.put_faultToAggregation(Base_Types.Boolean_example())
  }

  def timeTriggered(api: ChargerEvidenceQualifier_Operational_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee CHARGER_FAULT_PUBLICATION
        api.faultToAggregation == api.factsToEligibility.chargerFault,
        // case CHARGER_DISCONNECTED
        (api.reportIn == ChargerReport.Disconnected) ___>: (api.factsToEligibility.chargerUsable == F &
          api.factsToEligibility.chargerConnected == F &
          api.factsToEligibility.chargerFault == F),
        // case CHARGER_READY
        (api.reportIn == ChargerReport.Ready) ___>: (api.factsToEligibility.chargerUsable == T &
          api.factsToEligibility.chargerConnected == T &
          api.factsToEligibility.chargerFault == F),
        // case CHARGER_FAULTED
        (api.reportIn == ChargerReport.Faulted) ___>: (api.factsToEligibility.chargerUsable == F &
          api.factsToEligibility.chargerConnected == T &
          api.factsToEligibility.chargerFault == T),
        // case CHARGER_UNKNOWN
        (api.reportIn == ChargerReport.Unknown) ___>: (api.factsToEligibility.chargerUsable == F &
          api.factsToEligibility.chargerConnected == F &
          api.factsToEligibility.chargerFault == T)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_reportIn: Option[Drone_Battery_Charge_Qualification_Supervisor.ChargerReport.Type] = api.get_reportIn()
    api.logInfo(s"Received on data port reportIn: ${apiUsage_reportIn}")
  }

  def finalise(api: ChargerEvidenceQualifier_Operational_Api): Unit = { }
}
