// #Sireum

package windshield_defrost_request_supervisor.Windshield_Defrost_Request_Supervisor

import org.sireum._
import windshield_defrost_request_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter {

  def initialise(api: DriverFeedbackReporter_Initialization_Api): Unit = {
    api.put_driverDefrostStatus(Windshield_Defrost_Request_Supervisor.DriverDefrostStatus.Idle)
  }

  def timeTriggered(api: DriverFeedbackReporter_Operational_Api): Unit = {
    val policyDisposition = api.get_policyDisposition()
    val requestIntent = api.get_requestIntent()

    val status: Windshield_Defrost_Request_Supervisor.DriverDefrostStatus.Type =
      (requestIntent, policyDisposition) match {
        case (Some(Windshield_Defrost_Request_Supervisor.RequestIntent.BlockedInvalid), _) =>
          Windshield_Defrost_Request_Supervisor.DriverDefrostStatus.AttentionRequired
        case (Some(Windshield_Defrost_Request_Supervisor.RequestIntent.BlockedRearm), _) =>
          Windshield_Defrost_Request_Supervisor.DriverDefrostStatus.AttentionRequired
        case (Some(Windshield_Defrost_Request_Supervisor.RequestIntent.Fresh),
              Some(Windshield_Defrost_Request_Supervisor.PolicyDisposition.ObservationFault)) =>
          Windshield_Defrost_Request_Supervisor.DriverDefrostStatus.AttentionRequired
        case (Some(Windshield_Defrost_Request_Supervisor.RequestIntent.Held),
              Some(Windshield_Defrost_Request_Supervisor.PolicyDisposition.ObservationFault)) =>
          Windshield_Defrost_Request_Supervisor.DriverDefrostStatus.AttentionRequired
        case (Some(Windshield_Defrost_Request_Supervisor.RequestIntent.Fresh),
              Some(Windshield_Defrost_Request_Supervisor.PolicyDisposition.ElectricalBlocked)) =>
          Windshield_Defrost_Request_Supervisor.DriverDefrostStatus.AttentionRequired
        case (Some(Windshield_Defrost_Request_Supervisor.RequestIntent.Held),
              Some(Windshield_Defrost_Request_Supervisor.PolicyDisposition.ElectricalBlocked)) =>
          Windshield_Defrost_Request_Supervisor.DriverDefrostStatus.AttentionRequired
        case (Some(Windshield_Defrost_Request_Supervisor.RequestIntent.Fresh),
              Some(Windshield_Defrost_Request_Supervisor.PolicyDisposition.Defrosting)) =>
          Windshield_Defrost_Request_Supervisor.DriverDefrostStatus.Defrosting
        case (Some(Windshield_Defrost_Request_Supervisor.RequestIntent.Held),
              Some(Windshield_Defrost_Request_Supervisor.PolicyDisposition.Defrosting)) =>
          Windshield_Defrost_Request_Supervisor.DriverDefrostStatus.Defrosting
        case (Some(Windshield_Defrost_Request_Supervisor.RequestIntent.Fresh),
              Some(Windshield_Defrost_Request_Supervisor.PolicyDisposition.Complete)) =>
          Windshield_Defrost_Request_Supervisor.DriverDefrostStatus.Complete
        case (Some(Windshield_Defrost_Request_Supervisor.RequestIntent.Held),
              Some(Windshield_Defrost_Request_Supervisor.PolicyDisposition.Complete)) =>
          Windshield_Defrost_Request_Supervisor.DriverDefrostStatus.Complete
        case _ =>
          Windshield_Defrost_Request_Supervisor.DriverDefrostStatus.Idle
      }

    api.put_driverDefrostStatus(status)
  }

  def finalise(api: DriverFeedbackReporter_Operational_Api): Unit = { }
}
