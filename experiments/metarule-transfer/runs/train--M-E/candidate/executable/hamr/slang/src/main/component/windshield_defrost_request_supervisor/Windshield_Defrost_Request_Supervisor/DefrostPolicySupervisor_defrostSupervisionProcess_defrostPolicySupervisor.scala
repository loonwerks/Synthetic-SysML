// #Sireum

package windshield_defrost_request_supervisor.Windshield_Defrost_Request_Supervisor

import org.sireum._
import windshield_defrost_request_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor {

  def initialise(api: DefrostPolicySupervisor_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    api.put_defrostEnableCommand(Windshield_Defrost_Request_Supervisor.DefrostEnableCommand.Off)
    api.put_policyDisposition(Windshield_Defrost_Request_Supervisor.PolicyDisposition.Inactive)
  }

  def timeTriggered(api: DefrostPolicySupervisor_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CC_08_NON_ACTIONABLE
        //   Absent, invalid, or not-rearmed requests have first priority and force inactive off
        (api.requestIntent == RequestIntent.None |
          api.requestIntent == RequestIntent.BlockedInvalid |
          api.requestIntent == RequestIntent.BlockedRearm) ___>: (api.defrostEnableCommand == DefrostEnableCommand.Off &
          api.policyDisposition == PolicyDisposition.Inactive),
        // case CC_09_OBSERVATION_FAULT
        //   An actionable request with unknown glazing forces observation-fault off
        ((api.requestIntent == RequestIntent.Fresh |
          api.requestIntent == RequestIntent.Held) &
          api.visibilityAssessment == VisibilityAssessment.Unknown) ___>: (api.defrostEnableCommand == DefrostEnableCommand.Off &
          api.policyDisposition == PolicyDisposition.ObservationFault),
        // case CC_10_ELECTRICAL_BLOCK
        //   Known glazing with an actionable request is blocked by either ineligible resource reason
        ((api.requestIntent == RequestIntent.Fresh |
          api.requestIntent == RequestIntent.Held) &
          api.visibilityAssessment != VisibilityAssessment.Unknown &
          api.defrostEligibility != DefrostEligibility.Eligible) ___>: (api.defrostEnableCommand == DefrostEnableCommand.Off &
          api.policyDisposition == PolicyDisposition.ElectricalBlocked),
        // case CC_11_ELIGIBLE_VISIBILITY
        //   Eligible actionable requests command by the selected clear-or-obscured boundary
        ((api.requestIntent == RequestIntent.Fresh |
          api.requestIntent == RequestIntent.Held) &
          api.defrostEligibility == DefrostEligibility.Eligible &
          api.visibilityAssessment != VisibilityAssessment.Unknown) ___>: ((api.visibilityAssessment == VisibilityAssessment.NeedsDefrost ___>:
          api.defrostEnableCommand == DefrostEnableCommand.On &
            api.policyDisposition == PolicyDisposition.Defrosting) &
          (api.visibilityAssessment == VisibilityAssessment.Clear ___>:
            api.defrostEnableCommand == DefrostEnableCommand.Off &
              api.policyDisposition == PolicyDisposition.Complete))
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val requestIntent = api.get_requestIntent().get
    val visibilityAssessment = api.get_visibilityAssessment().get
    val defrostEligibility = api.get_defrostEligibility().get

    if (requestIntent == RequestIntent.None ||
      requestIntent == RequestIntent.BlockedInvalid ||
      requestIntent == RequestIntent.BlockedRearm) {
      api.put_defrostEnableCommand(DefrostEnableCommand.Off)
      api.put_policyDisposition(PolicyDisposition.Inactive)
    } else if (visibilityAssessment == VisibilityAssessment.Unknown) {
      api.put_defrostEnableCommand(DefrostEnableCommand.Off)
      api.put_policyDisposition(PolicyDisposition.ObservationFault)
    } else if (defrostEligibility != DefrostEligibility.Eligible) {
      api.put_defrostEnableCommand(DefrostEnableCommand.Off)
      api.put_policyDisposition(PolicyDisposition.ElectricalBlocked)
    } else if (visibilityAssessment == VisibilityAssessment.NeedsDefrost) {
      api.put_defrostEnableCommand(DefrostEnableCommand.On)
      api.put_policyDisposition(PolicyDisposition.Defrosting)
    } else {
      api.put_defrostEnableCommand(DefrostEnableCommand.Off)
      api.put_policyDisposition(PolicyDisposition.Complete)
    }
  }

  def finalise(api: DefrostPolicySupervisor_Operational_Api): Unit = { }
}
