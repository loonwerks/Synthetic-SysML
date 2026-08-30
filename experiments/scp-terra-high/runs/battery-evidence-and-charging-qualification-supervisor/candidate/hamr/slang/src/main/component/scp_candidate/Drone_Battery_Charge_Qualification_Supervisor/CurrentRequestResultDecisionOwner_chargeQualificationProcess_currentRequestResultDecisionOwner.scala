// #Sireum

package scp_candidate.Drone_Battery_Charge_Qualification_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner {

  def initialise(api: CurrentRequestResultDecisionOwner_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_PUBLIC_REQUEST_RESULT
        api.publicFactsOut.requestResult.requestResultValue == RequestResult.None,
        // guarantee INITIAL_PUBLIC_ADVISORY
        api.publicFactsOut.advisory.advisoryValue == PilotAdvisory.ADVISORY_UNKNOWN,
        // guarantee INITIAL_PUBLIC_SESSION
        api.publicFactsOut.newSession.sessionValue == ChargeSession.Idle
        // END INITIALIZES ENSURES
      )
    )
    api.put_publicFactsOut(PublicDecisionFacts(AdvisoryFacts(PilotAdvisory.ADVISORY_UNKNOWN), PublishedRequestResult(RequestResult.None), PublishedSession(ChargeSession.Idle)))
  }

  def timeTriggered(api: CurrentRequestResultDecisionOwner_Operational_Api): Unit = { }

  def finalise(api: CurrentRequestResultDecisionOwner_Operational_Api): Unit = { }
}
