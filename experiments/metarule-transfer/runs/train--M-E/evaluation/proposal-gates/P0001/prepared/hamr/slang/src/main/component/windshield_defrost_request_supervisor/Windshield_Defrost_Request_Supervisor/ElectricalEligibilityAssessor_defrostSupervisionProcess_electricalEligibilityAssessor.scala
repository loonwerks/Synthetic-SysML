// #Sireum

package windshield_defrost_request_supervisor.Windshield_Defrost_Request_Supervisor

import org.sireum._
import windshield_defrost_request_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor {

  def initialise(api: ElectricalEligibilityAssessor_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    api.put_defrostEligibility(Windshield_Defrost_Request_Supervisor.DefrostEligibility.BlockedUnavailable)
  }

  def timeTriggered(api: ElectricalEligibilityAssessor_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CC_07_ELIGIBILITY_CLASSIFICATION
        //   Availability has reason precedence and the remaining pair determines eligibility
        (api.electricalInterfaceStatus == ElectricalInterfaceStatus.Unavailable ___>:
          api.defrostEligibility == DefrostEligibility.BlockedUnavailable) &
          (api.electricalInterfaceStatus == ElectricalInterfaceStatus.Available &
            api.defrostLoadAllowance == DefrostLoadAllowance.Restricted ___>:
            api.defrostEligibility == DefrostEligibility.BlockedRestricted) &
          (api.electricalInterfaceStatus == ElectricalInterfaceStatus.Available &
            api.defrostLoadAllowance == DefrostLoadAllowance.Permitted ___>:
            api.defrostEligibility == DefrostEligibility.Eligible)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val electricalInterfaceStatus = api.get_electricalInterfaceStatus().get
    val defrostLoadAllowance = api.get_defrostLoadAllowance().get

    if (electricalInterfaceStatus == ElectricalInterfaceStatus.Unavailable) {
      api.put_defrostEligibility(DefrostEligibility.BlockedUnavailable)
    } else if (defrostLoadAllowance == DefrostLoadAllowance.Restricted) {
      api.put_defrostEligibility(DefrostEligibility.BlockedRestricted)
    } else {
      api.put_defrostEligibility(DefrostEligibility.Eligible)
    }
  }

  def finalise(api: ElectricalEligibilityAssessor_Operational_Api): Unit = { }
}
