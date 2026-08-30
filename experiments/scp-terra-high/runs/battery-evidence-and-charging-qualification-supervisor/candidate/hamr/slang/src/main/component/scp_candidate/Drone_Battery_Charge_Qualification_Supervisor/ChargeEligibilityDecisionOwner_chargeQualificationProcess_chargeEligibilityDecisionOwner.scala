// #Sireum

package scp_candidate.Drone_Battery_Charge_Qualification_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner {

  def initialise(api: ChargeEligibilityDecisionOwner_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_ELIGIBILITY
        api.eligibilityToAdvisory == ChargeEligibility.Blocked &&
          api.eligibilityToSession == ChargeEligibility.Blocked
        // END INITIALIZES ENSURES
      )
    )
    api.put_eligibilityToAdvisory(Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibility.Blocked)
    api.put_eligibilityToSession(Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibility.Blocked)
  }

  def timeTriggered(api: ChargeEligibilityDecisionOwner_Operational_Api): Unit = { }

  def finalise(api: ChargeEligibilityDecisionOwner_Operational_Api): Unit = { }
}
