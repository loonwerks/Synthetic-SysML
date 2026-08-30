// #Sireum

package scp_candidate.Drone_Battery_Charge_Qualification_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier {

  def initialise(api: ChargerEvidenceQualifier_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_CHARGER_FACTS
        api.factsToEligibility.chargerUsable == F &&
          api.factsToEligibility.chargerConnected == F &&
          api.factsToEligibility.chargerFault == T &&
          api.faultToAggregation == T
        // END INITIALIZES ENSURES
      )
    )
    api.put_factsToEligibility(ChargerFacts(F, F, T))
    api.put_faultToAggregation(T)
  }

  def timeTriggered(api: ChargerEvidenceQualifier_Operational_Api): Unit = { }

  def finalise(api: ChargerEvidenceQualifier_Operational_Api): Unit = { }
}
