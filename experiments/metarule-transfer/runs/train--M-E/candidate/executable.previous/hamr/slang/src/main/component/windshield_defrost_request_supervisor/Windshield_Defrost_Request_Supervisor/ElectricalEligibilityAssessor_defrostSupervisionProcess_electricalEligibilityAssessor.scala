// #Sireum

package windshield_defrost_request_supervisor.Windshield_Defrost_Request_Supervisor

import org.sireum._
import windshield_defrost_request_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor {

  def initialise(api: ElectricalEligibilityAssessor_Initialization_Api): Unit = {
    api.put_defrostEligibility(Windshield_Defrost_Request_Supervisor.DefrostEligibility.BlockedUnavailable)
  }

  def timeTriggered(api: ElectricalEligibilityAssessor_Operational_Api): Unit = {
    val electricalInterfaceStatus = api.get_electricalInterfaceStatus()
    val defrostLoadAllowance = api.get_defrostLoadAllowance()

    val eligibility: Windshield_Defrost_Request_Supervisor.DefrostEligibility.Type =
      (electricalInterfaceStatus, defrostLoadAllowance) match {
        case (Some(Windshield_Defrost_Request_Supervisor.ElectricalInterfaceStatus.Available),
              Some(Windshield_Defrost_Request_Supervisor.DefrostLoadAllowance.Permitted)) =>
          Windshield_Defrost_Request_Supervisor.DefrostEligibility.Eligible
        case (Some(Windshield_Defrost_Request_Supervisor.ElectricalInterfaceStatus.Available),
              Some(Windshield_Defrost_Request_Supervisor.DefrostLoadAllowance.Restricted)) =>
          Windshield_Defrost_Request_Supervisor.DefrostEligibility.BlockedRestricted
        case _ =>
          Windshield_Defrost_Request_Supervisor.DefrostEligibility.BlockedUnavailable
      }

    api.put_defrostEligibility(eligibility)
  }

  def finalise(api: ElectricalEligibilityAssessor_Operational_Api): Unit = { }
}
