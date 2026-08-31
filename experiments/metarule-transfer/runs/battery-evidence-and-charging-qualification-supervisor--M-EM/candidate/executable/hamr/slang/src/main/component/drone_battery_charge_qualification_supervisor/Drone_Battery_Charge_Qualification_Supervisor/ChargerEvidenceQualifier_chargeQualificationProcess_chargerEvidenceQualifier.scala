// #Sireum

package drone_battery_charge_qualification_supervisor.Drone_Battery_Charge_Qualification_Supervisor

import org.sireum._
import drone_battery_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier {

  def initialise(api: ChargerEvidenceQualifier_Initialization_Api): Unit = {
    api.put_factsToEligibility(ChargerFacts(F, F, T))
    api.put_faultToAggregation(T)
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
        (api.reportIn == ChargerReport.Ready) ___>: (api.factsToEligibility.chargerUsable & api.factsToEligibility.chargerConnected &
          api.factsToEligibility.chargerFault == F),
        // case CHARGER_FAULTED
        (api.reportIn == ChargerReport.Faulted) ___>: (api.factsToEligibility.chargerUsable == F &
          api.factsToEligibility.chargerConnected &
          api.factsToEligibility.chargerFault),
        // case CHARGER_UNKNOWN
        (api.reportIn == ChargerReport.Unknown) ___>: (api.factsToEligibility.chargerUsable == F &
          api.factsToEligibility.chargerConnected == F &
          api.factsToEligibility.chargerFault)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    api.get_reportIn() match {
      case Some(r) =>
        val f: ChargerFacts = r match {
          case ChargerReport.Disconnected => ChargerFacts(F, F, F)
          case ChargerReport.Ready => ChargerFacts(T, T, F)
          case ChargerReport.Faulted => ChargerFacts(F, T, T)
          case ChargerReport.Unknown => ChargerFacts(F, F, T)
        }
        api.put_factsToEligibility(f); api.put_faultToAggregation(f.chargerFault)
      case _ => api.put_factsToEligibility(ChargerFacts(F,F,T)); api.put_faultToAggregation(T)
    }
  }

  def finalise(api: ChargerEvidenceQualifier_Operational_Api): Unit = { }
}
