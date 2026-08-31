// #Sireum

package forest_observation_eligibility_supervisor.Forest_Observation_Eligibility_Supervisor

import org.sireum._
import forest_observation_eligibility_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object AuthorizationGate_eligibilitySupervisionProcess_authorizationGate {

  // BEGIN STATE VARS
  var gatePhase: Forest_Observation_Eligibility_Supervisor.GatePhase.Type = Forest_Observation_Eligibility_Supervisor.GatePhase.Closed
  // END STATE VARS

  def initialise(api: AuthorizationGate_Initialization_Api): Unit = {
    Contract(Modifies(api, gatePhase))
    gatePhase = GatePhase.Closed
    api.put_gateOutcome(GateOutcome.None)
    api.put_observationAuthorization(ObservationAuthorization.Withhold)
  }

  def timeTriggered(api: AuthorizationGate_Operational_Api): Unit = {
    Contract(
      Modifies(api, gatePhase),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee FAILURE_HOLD_WITHHOLDS
        //   N.md FAILURE_HOLD_WITHHOLDS
        gatePhase == GatePhase.FailureHold ___>:
          api.observationAuthorization == ObservationAuthorization.Withhold,
        // case GATE_RECOVERED
        //   N.md GATE_RECOVERED
        (In(gatePhase) == GatePhase.FailureHold &
          api.observationProgress == ObservationProgress.Idle) ___>: (gatePhase == GatePhase.Closed &
          api.observationAuthorization == ObservationAuthorization.Withhold &
          api.gateOutcome == GateOutcome.Recovered),
        // case GATE_RECOVERY_RETAINED
        //   N.md GATE_RECOVERY_RETAINED
        (In(gatePhase) == GatePhase.FailureHold &
          api.observationProgress != ObservationProgress.Idle) ___>: (gatePhase == GatePhase.FailureHold &
          api.observationAuthorization == ObservationAuthorization.Withhold &
          api.gateOutcome == GateOutcome.None),
        // case GATE_REPORTED_FAILURE
        //   N.md GATE_REPORTED_FAILURE
        (In(gatePhase) != GatePhase.FailureHold &
          api.observationProgress == ObservationProgress.Failed) ___>: (gatePhase == GatePhase.FailureHold &
          api.observationAuthorization == ObservationAuthorization.Withhold &
          api.gateOutcome == GateOutcome.Failed),
        // case GATE_ACTIVE_WHILE_CLOSED
        //   N.md GATE_ACTIVE_WHILE_CLOSED
        (In(gatePhase) == GatePhase.Closed &
          api.observationProgress == ObservationProgress.Active) ___>: (gatePhase == GatePhase.FailureHold &
          api.observationAuthorization == ObservationAuthorization.Withhold &
          api.gateOutcome == GateOutcome.Failed),
        // case GATE_ACTIVE_TO_IDLE_REGRESSION
        //   N.md GATE_ACTIVE_TO_IDLE_REGRESSION
        (In(gatePhase) == GatePhase.Active &
          api.observationProgress == ObservationProgress.Idle) ___>: (gatePhase == GatePhase.FailureHold &
          api.observationAuthorization == ObservationAuthorization.Withhold &
          api.gateOutcome == GateOutcome.Failed),
        // case GATE_WITHDRAWAL
        //   N.md GATE_WITHDRAWAL
        (In(gatePhase) != GatePhase.FailureHold &
          api.observationProgress != ObservationProgress.Failed &
          !(In(gatePhase) == GatePhase.Closed &
            api.observationProgress == ObservationProgress.Active) &
          !(In(gatePhase) == GatePhase.Active &
            api.observationProgress == ObservationProgress.Idle) &
          api.eligibilityDecision == EligibilityDecision.Withdraw) ___>: (gatePhase == GatePhase.Closed &
          api.observationAuthorization == ObservationAuthorization.Withhold &
          api.gateOutcome == GateOutcome.Cancelled),
        // case GATE_COMPLETION
        //   N.md GATE_COMPLETION
        ((In(gatePhase) == GatePhase.Authorized |
          In(gatePhase) == GatePhase.Active) &
          api.observationProgress == ObservationProgress.Completed &
          api.eligibilityDecision != EligibilityDecision.Withdraw) ___>: (gatePhase == GatePhase.Closed &
          api.observationAuthorization == ObservationAuthorization.Withhold &
          api.gateOutcome == GateOutcome.Completed),
        // case GATE_DENIED_POWER
        //   N.md GATE_DENIED_POWER
        (In(gatePhase) != GatePhase.FailureHold &
          api.observationProgress != ObservationProgress.Failed &
          !(In(gatePhase) == GatePhase.Closed &
            api.observationProgress == ObservationProgress.Active) &
          !(In(gatePhase) == GatePhase.Active &
            api.observationProgress == ObservationProgress.Idle) &
          !((In(gatePhase) == GatePhase.Authorized |
            In(gatePhase) == GatePhase.Active) &
            api.observationProgress == ObservationProgress.Completed) &
          api.eligibilityDecision == EligibilityDecision.DenyPower) ___>: (gatePhase == GatePhase.Closed &
          api.observationAuthorization == ObservationAuthorization.Withhold &
          api.gateOutcome == GateOutcome.DeniedPower),
        // case GATE_DENIED_SUPPORT
        //   N.md GATE_DENIED_SUPPORT
        (In(gatePhase) != GatePhase.FailureHold &
          api.observationProgress != ObservationProgress.Failed &
          !(In(gatePhase) == GatePhase.Closed &
            api.observationProgress == ObservationProgress.Active) &
          !(In(gatePhase) == GatePhase.Active &
            api.observationProgress == ObservationProgress.Idle) &
          !((In(gatePhase) == GatePhase.Authorized |
            In(gatePhase) == GatePhase.Active) &
            api.observationProgress == ObservationProgress.Completed) &
          api.eligibilityDecision == EligibilityDecision.DenySupport) ___>: (gatePhase == GatePhase.Closed &
          api.observationAuthorization == ObservationAuthorization.Withhold &
          api.gateOutcome == GateOutcome.DeniedSupport),
        // case GATE_PERMIT_FROM_CLOSED
        //   N.md GATE_PERMIT_FROM_CLOSED
        (In(gatePhase) == GatePhase.Closed &
          api.observationProgress == ObservationProgress.Idle &
          api.eligibilityDecision == EligibilityDecision.Permit) ___>: (gatePhase == GatePhase.Authorized &
          api.observationAuthorization == ObservationAuthorization.Permit &
          api.gateOutcome == GateOutcome.Authorized),
        // case GATE_PROGRESS_ACTIVE
        //   N.md GATE_PROGRESS_ACTIVE
        ((In(gatePhase) == GatePhase.Authorized |
          In(gatePhase) == GatePhase.Active) &
          api.observationProgress == ObservationProgress.Active &
          api.eligibilityDecision != EligibilityDecision.Withdraw &
          api.eligibilityDecision != EligibilityDecision.DenyPower &
          api.eligibilityDecision != EligibilityDecision.DenySupport) ___>: (gatePhase == GatePhase.Active &
          api.observationAuthorization == ObservationAuthorization.Permit &
          api.gateOutcome == GateOutcome.Active),
        // case GATE_AUTHORIZED_IDLE
        //   N.md GATE_AUTHORIZED_IDLE
        (In(gatePhase) == GatePhase.Authorized &
          api.observationProgress == ObservationProgress.Idle &
          (api.eligibilityDecision == EligibilityDecision.NoDecision |
            api.eligibilityDecision == EligibilityDecision.Permit)) ___>: (gatePhase == GatePhase.Authorized &
          api.observationAuthorization == ObservationAuthorization.Permit &
          api.gateOutcome == GateOutcome.Authorized),
        // case GATE_CLOSED_QUIESCENT
        //   N.md GATE_CLOSED_QUIESCENT
        (In(gatePhase) == GatePhase.Closed &
          api.observationProgress != ObservationProgress.Failed &
          api.observationProgress != ObservationProgress.Active &
          api.eligibilityDecision != EligibilityDecision.Withdraw &
          api.eligibilityDecision != EligibilityDecision.DenyPower &
          api.eligibilityDecision != EligibilityDecision.DenySupport &
          !(api.observationProgress == ObservationProgress.Idle &
            api.eligibilityDecision == EligibilityDecision.Permit)) ___>: (gatePhase == GatePhase.Closed &
          api.observationAuthorization == ObservationAuthorization.Withhold &
          api.gateOutcome == GateOutcome.None)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val progress = api.get_observationProgress().get
    val decision = api.get_eligibilityDecision().get
    var outcome: GateOutcome.Type = GateOutcome.None
    var authorization: ObservationAuthorization.Type = ObservationAuthorization.Withhold

    if (gatePhase == GatePhase.FailureHold) {
      if (progress == ObservationProgress.Idle) {
        gatePhase = GatePhase.Closed
        outcome = GateOutcome.Recovered
      }
    } else if (progress == ObservationProgress.Failed) {
      gatePhase = GatePhase.FailureHold
      outcome = GateOutcome.Failed
    } else if (gatePhase == GatePhase.Closed & progress == ObservationProgress.Active) {
      gatePhase = GatePhase.FailureHold
      outcome = GateOutcome.Failed
    } else if (gatePhase == GatePhase.Active & progress == ObservationProgress.Idle) {
      gatePhase = GatePhase.FailureHold
      outcome = GateOutcome.Failed
    } else if (decision == EligibilityDecision.Withdraw) {
      gatePhase = GatePhase.Closed
      outcome = GateOutcome.Cancelled
    } else if ((gatePhase == GatePhase.Authorized | gatePhase == GatePhase.Active) &
      progress == ObservationProgress.Completed) {
      gatePhase = GatePhase.Closed
      outcome = GateOutcome.Completed
    } else if (decision == EligibilityDecision.DenyPower) {
      gatePhase = GatePhase.Closed
      outcome = GateOutcome.DeniedPower
    } else if (decision == EligibilityDecision.DenySupport) {
      gatePhase = GatePhase.Closed
      outcome = GateOutcome.DeniedSupport
    } else if (gatePhase == GatePhase.Closed & progress == ObservationProgress.Idle &
      decision == EligibilityDecision.Permit) {
      gatePhase = GatePhase.Authorized
      authorization = ObservationAuthorization.Permit
      outcome = GateOutcome.Authorized
    } else if ((gatePhase == GatePhase.Authorized | gatePhase == GatePhase.Active) &
      progress == ObservationProgress.Active &
      decision != EligibilityDecision.Withdraw &
      decision != EligibilityDecision.DenyPower &
      decision != EligibilityDecision.DenySupport) {
      gatePhase = GatePhase.Active
      authorization = ObservationAuthorization.Permit
      outcome = GateOutcome.Active
    } else if (gatePhase == GatePhase.Authorized & progress == ObservationProgress.Idle &
      (decision == EligibilityDecision.NoDecision | decision == EligibilityDecision.Permit)) {
      authorization = ObservationAuthorization.Permit
      outcome = GateOutcome.Authorized
    }

    api.put_gateOutcome(outcome)
    api.put_observationAuthorization(authorization)
  }

  def finalise(api: AuthorizationGate_Operational_Api): Unit = { }
}
