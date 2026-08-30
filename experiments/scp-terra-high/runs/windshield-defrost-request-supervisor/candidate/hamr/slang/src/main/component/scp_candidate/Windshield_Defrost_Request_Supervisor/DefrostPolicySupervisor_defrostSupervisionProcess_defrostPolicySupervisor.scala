// #Sireum

package scp_candidate.Windshield_Defrost_Request_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor {

  def initialise(api: DefrostPolicySupervisor_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_POLICY_OUTPUTS
        api.defrostEnableCommand == DefrostEnableCommand.Off &
          api.policyDisposition == PolicyDisposition.Inactive
        // END INITIALIZES ENSURES
      )
    )
    api.put_defrostEnableCommand(DefrostEnableCommand.Off)
    api.put_policyDisposition(PolicyDisposition.Inactive)
  }

  def timeTriggered(api: DefrostPolicySupervisor_Operational_Api): Unit = {
    Contract(
      Modifies(api)
    )
    val intent = api.get_requestIntent().get
    val assessment = api.get_visibilityAssessment().get
    val eligibility = api.get_defrostEligibility().get
    if (intent == RequestIntent.None ||
        intent == RequestIntent.BlockedInvalid ||
        intent == RequestIntent.BlockedRearm) {
      api.put_defrostEnableCommand(DefrostEnableCommand.Off)
      api.put_policyDisposition(PolicyDisposition.Inactive)
    } else if (assessment == VisibilityAssessment.Unknown) {
      api.put_defrostEnableCommand(DefrostEnableCommand.Off)
      api.put_policyDisposition(PolicyDisposition.ObservationFault)
    } else if (eligibility != DefrostEligibility.Eligible) {
      api.put_defrostEnableCommand(DefrostEnableCommand.Off)
      api.put_policyDisposition(PolicyDisposition.ElectricalBlocked)
    } else if (assessment == VisibilityAssessment.NeedsDefrost) {
      api.put_defrostEnableCommand(DefrostEnableCommand.On)
      api.put_policyDisposition(PolicyDisposition.Defrosting)
    } else {
      api.put_defrostEnableCommand(DefrostEnableCommand.Off)
      api.put_policyDisposition(PolicyDisposition.Complete)
    }
  }

  def finalise(api: DefrostPolicySupervisor_Operational_Api): Unit = { }
}
