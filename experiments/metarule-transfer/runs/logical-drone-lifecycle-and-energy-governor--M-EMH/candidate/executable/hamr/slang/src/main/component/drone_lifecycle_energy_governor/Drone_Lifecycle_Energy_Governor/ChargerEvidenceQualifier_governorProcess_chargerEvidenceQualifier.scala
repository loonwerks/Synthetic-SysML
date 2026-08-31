// #Sireum

package drone_lifecycle_energy_governor.Drone_Lifecycle_Energy_Governor

import org.sireum._
import drone_lifecycle_energy_governor._

// This file will not be overwritten if HAMR codegen is rerun
object ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier {

  def initialise(api: ChargerEvidenceQualifier_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_factsToCharge(Drone_Lifecycle_Energy_Governor.ChargerFacts.example())
    api.put_faultToAggregation(Base_Types.Boolean_example())
  }

  def timeTriggered(api: ChargerEvidenceQualifier_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee CHARGER_POLICY_CLASSIFICATION
        api.factsToCharge.connected == (api.reportIn != ChargerReport.DISCONNECTED) &
          api.factsToCharge.healthyConnected == (api.reportIn == ChargerReport.CONNECTED_HEALTHY) &
          api.factsToCharge.chargerFault == (api.reportIn == ChargerReport.CONNECTED_FAULTED) &
          api.faultToAggregation == api.factsToCharge.chargerFault
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_reportIn: Option[Drone_Lifecycle_Energy_Governor.ChargerReport.Type] = api.get_reportIn()
    api.logInfo(s"Received on data port reportIn: ${apiUsage_reportIn}")
    val input = api.get_reportIn().get
    val fault = input == ChargerReport.CONNECTED_FAULTED
    api.put_factsToCharge(ChargerFacts(input != ChargerReport.DISCONNECTED,
      input == ChargerReport.CONNECTED_HEALTHY, fault))
    api.put_faultToAggregation(fault)
  }

  def finalise(api: ChargerEvidenceQualifier_Operational_Api): Unit = { }
}
