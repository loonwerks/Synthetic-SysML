// #Sireum

package scp_candidate.Vehicle_Start_Readiness_Recovery_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner {

  def initialise(api: StartAuthorizationOwner_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee c12
        api.authorization_to_lifecycle.decision == StartDecision.NoStart &&
          !(api.authorization_to_lifecycle.conflict) &&
          api.authorization_to_outcome.decision == StartDecision.NoStart &&
          !(api.authorization_to_outcome.conflict)
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    val facts = StartAuthorizationFacts(StartDecision.NoStart, F)
    api.put_authorization_to_lifecycle(facts)
    api.put_authorization_to_outcome(facts)
  }

  def compute(api: StartAuthorizationOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    val request = api.get_request_facts().getOrElse(RequestFacts(F, F, F, F, RequestDisposition.None))
    val brake = api.get_brake_facts().getOrElse(BrakeFacts(F, F))
    val health = api.get_health_qualification().getOrElse(HealthQualification.Invalid)
    val power = api.get_power_facts().getOrElse(PowerFacts(F, F))
    var decision: StartDecision.Type = StartDecision.BeginStartTest
    if (request.disposition == RequestDisposition.OffDominant) {
      decision = StartDecision.OffPriority
    } else if (request.disposition != RequestDisposition.StartCandidate) {
      decision = StartDecision.NoStart
    } else if (!brake.evidenceTrusted || health == HealthQualification.Invalid ||
               !power.evidenceTrusted) {
      decision = StartDecision.DenyInvalid
    } else if (!brake.readyForAdmission || health == HealthQualification.NotReady ||
               !power.availableForSupervision) {
      decision = StartDecision.DenyNotReady
    }
    val facts = StartAuthorizationFacts(decision, request.conflict)
    api.put_authorization_to_lifecycle(facts)
    api.put_authorization_to_outcome(facts)
  }

  def timeTriggered(api: StartAuthorizationOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    compute(api)
  }

  def finalise(api: StartAuthorizationOwner_Operational_Api): Unit = { }
}
