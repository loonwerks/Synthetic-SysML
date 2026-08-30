// #Sireum

package scp_candidate.Power_Propulsion_Availability_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object AvailabilityDecisionOwner_supervisor_process_availability_decision_owner {

  def initialise(api: AvailabilityDecisionOwner_Initialization_Api): Unit = {
    Contract(Modifies(api), Ensures(
      // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_AVAILABILITY_UNAVAILABLE
        api.availability_decision.decision == AvailabilityValue.UNAVAILABLE &&
          api.availability_decision.cause == AvailabilityCause.RECOVERY &&
          api.availability_report.decision == ReportAvailabilityValue.UNAVAILABLE &&
          api.availability_report.cause == ReportAvailabilityCause.RECOVERY &&
          api.availability_report.demand == ReportDemandPhase.IDLE &&
          api.availability_report.recovery == ReportRecoveryPhase.AWAITING_ACK
        // END INITIALIZES ENSURES
    ))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_availability_decision(Power_Propulsion_Availability_Supervisor.AvailabilityDecision(
      AvailabilityValue.UNAVAILABLE, AvailabilityCause.RECOVERY))
    api.put_availability_report(Power_Propulsion_Availability_Supervisor.AvailabilityReport(
      ReportAvailabilityValue.UNAVAILABLE, ReportAvailabilityCause.RECOVERY,
      ReportDemandPhase.IDLE, ReportRecoveryPhase.AWAITING_ACK))
  }

  def timeTriggered(api: AvailabilityDecisionOwner_Operational_Api): Unit = { }
  def finalise(api: AvailabilityDecisionOwner_Operational_Api): Unit = { }
}
