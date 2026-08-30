// #Sireum

package scp_candidate.Windshield_Defrost_Request_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor {

  def initialise(api: ElectricalEligibilityAssessor_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    api.put_defrostEligibility(DefrostEligibility.Eligible)
  }

  def timeTriggered(api: ElectricalEligibilityAssessor_Operational_Api): Unit = {
    Contract(
      Modifies(api)
    )
    val interfaceStatus = api.get_electricalInterfaceStatus().get
    val loadAllowance = api.get_defrostLoadAllowance().get
    if (interfaceStatus == ElectricalInterfaceStatus.Unavailable) {
      api.put_defrostEligibility(DefrostEligibility.BlockedUnavailable)
    } else if (loadAllowance == DefrostLoadAllowance.Restricted) {
      api.put_defrostEligibility(DefrostEligibility.BlockedRestricted)
    } else {
      api.put_defrostEligibility(DefrostEligibility.Eligible)
    }
  }

  def finalise(api: ElectricalEligibilityAssessor_Operational_Api): Unit = { }
}
