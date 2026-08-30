// #Sireum

package windshield_defrost_request_supervisor.Windshield_Defrost_Request_Supervisor

import org.sireum._
import windshield_defrost_request_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor {

  def initialise(api: ElectricalEligibilityAssessor_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        api.defrostEligibility == Windshield_Defrost_Request_Supervisor.DefrostEligibility.Eligible
      )
    )
    api.put_defrostEligibility(Windshield_Defrost_Request_Supervisor.DefrostEligibility.Eligible)
  }

  def timeTriggered(api: ElectricalEligibilityAssessor_Operational_Api): Unit = {
    Contract(
      Modifies(
        api
      ),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CC_07_ELIGIBILITY_CLASSIFICATION
        //   classify electrical eligibility
        (ElectricalInterfaceStatus.Unavailable == api.electricalInterfaceStatus |
          ElectricalInterfaceStatus.Available == api.electricalInterfaceStatus &
            DefrostLoadAllowance.Restricted == api.defrostLoadAllowance |
          ElectricalInterfaceStatus.Available == api.electricalInterfaceStatus &
            DefrostLoadAllowance.Permitted == api.defrostLoadAllowance) ___>: ((ElectricalInterfaceStatus.Unavailable == api.electricalInterfaceStatus ___>:
          api.defrostEligibility == DefrostEligibility.BlockedUnavailable) &
          (ElectricalInterfaceStatus.Available == api.electricalInterfaceStatus &
            DefrostLoadAllowance.Restricted == api.defrostLoadAllowance ___>:
            api.defrostEligibility == DefrostEligibility.BlockedRestricted) &
          (ElectricalInterfaceStatus.Available == api.electricalInterfaceStatus &
            DefrostLoadAllowance.Permitted == api.defrostLoadAllowance ___>:
            api.defrostEligibility == DefrostEligibility.Eligible))
        // END COMPUTE ENSURES timeTriggered
      )
    )

    val electricalInterfaceStatus = api.get_electricalInterfaceStatus().get
    val defrostLoadAllowance = api.get_defrostLoadAllowance().get

    if (electricalInterfaceStatus == Windshield_Defrost_Request_Supervisor.ElectricalInterfaceStatus.Unavailable) {
      api.put_defrostEligibility(Windshield_Defrost_Request_Supervisor.DefrostEligibility.BlockedUnavailable)
    } else if (defrostLoadAllowance == Windshield_Defrost_Request_Supervisor.DefrostLoadAllowance.Restricted) {
      api.put_defrostEligibility(Windshield_Defrost_Request_Supervisor.DefrostEligibility.BlockedRestricted)
    } else {
      api.put_defrostEligibility(Windshield_Defrost_Request_Supervisor.DefrostEligibility.Eligible)
    }
  }

  def finalise(api: ElectricalEligibilityAssessor_Operational_Api): Unit = { }
}
