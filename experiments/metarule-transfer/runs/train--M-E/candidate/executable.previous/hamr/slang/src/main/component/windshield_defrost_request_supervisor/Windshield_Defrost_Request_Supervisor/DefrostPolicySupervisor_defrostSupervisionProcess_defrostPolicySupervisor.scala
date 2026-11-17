// #Sireum

package windshield_defrost_request_supervisor.Windshield_Defrost_Request_Supervisor

import org.sireum._
import windshield_defrost_request_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor {

  def initialise(api: DefrostPolicySupervisor_Initialization_Api): Unit = {
    api.put_defrostEnableCommand(Windshield_Defrost_Request_Supervisor.DefrostEnableCommand.Off)
    api.put_policyDisposition(Windshield_Defrost_Request_Supervisor.PolicyDisposition.Inactive)
  }

  def timeTriggered(api: DefrostPolicySupervisor_Operational_Api): Unit = {
    val requestIntent = api.get_requestIntent()
    val visibilityAssessment = api.get_visibilityAssessment()
    val defrostEligibility = api.get_defrostEligibility()

    val result: (Windshield_Defrost_Request_Supervisor.DefrostEnableCommand.Type,
      Windshield_Defrost_Request_Supervisor.PolicyDisposition.Type) =
      (requestIntent, visibilityAssessment, defrostEligibility) match {
        case (Some(Windshield_Defrost_Request_Supervisor.RequestIntent.Fresh),
              Some(Windshield_Defrost_Request_Supervisor.VisibilityAssessment.NeedsDefrost),
              Some(Windshield_Defrost_Request_Supervisor.DefrostEligibility.Eligible)) =>
          (Windshield_Defrost_Request_Supervisor.DefrostEnableCommand.On,
            Windshield_Defrost_Request_Supervisor.PolicyDisposition.Defrosting)
        case (Some(Windshield_Defrost_Request_Supervisor.RequestIntent.Held),
              Some(Windshield_Defrost_Request_Supervisor.VisibilityAssessment.NeedsDefrost),
              Some(Windshield_Defrost_Request_Supervisor.DefrostEligibility.Eligible)) =>
          (Windshield_Defrost_Request_Supervisor.DefrostEnableCommand.On,
            Windshield_Defrost_Request_Supervisor.PolicyDisposition.Defrosting)
        case (Some(Windshield_Defrost_Request_Supervisor.RequestIntent.Fresh),
              Some(Windshield_Defrost_Request_Supervisor.VisibilityAssessment.Clear),
              Some(Windshield_Defrost_Request_Supervisor.DefrostEligibility.Eligible)) =>
          (Windshield_Defrost_Request_Supervisor.DefrostEnableCommand.Off,
            Windshield_Defrost_Request_Supervisor.PolicyDisposition.Complete)
        case (Some(Windshield_Defrost_Request_Supervisor.RequestIntent.Held),
              Some(Windshield_Defrost_Request_Supervisor.VisibilityAssessment.Clear),
              Some(Windshield_Defrost_Request_Supervisor.DefrostEligibility.Eligible)) =>
          (Windshield_Defrost_Request_Supervisor.DefrostEnableCommand.Off,
            Windshield_Defrost_Request_Supervisor.PolicyDisposition.Complete)
        case (Some(Windshield_Defrost_Request_Supervisor.RequestIntent.Fresh),
              Some(Windshield_Defrost_Request_Supervisor.VisibilityAssessment.Unknown), _) =>
          (Windshield_Defrost_Request_Supervisor.DefrostEnableCommand.Off,
            Windshield_Defrost_Request_Supervisor.PolicyDisposition.ObservationFault)
        case (Some(Windshield_Defrost_Request_Supervisor.RequestIntent.Held),
              Some(Windshield_Defrost_Request_Supervisor.VisibilityAssessment.Unknown), _) =>
          (Windshield_Defrost_Request_Supervisor.DefrostEnableCommand.Off,
            Windshield_Defrost_Request_Supervisor.PolicyDisposition.ObservationFault)
        case (Some(Windshield_Defrost_Request_Supervisor.RequestIntent.Fresh), _, _) =>
          (Windshield_Defrost_Request_Supervisor.DefrostEnableCommand.Off,
            Windshield_Defrost_Request_Supervisor.PolicyDisposition.ElectricalBlocked)
        case (Some(Windshield_Defrost_Request_Supervisor.RequestIntent.Held), _, _) =>
          (Windshield_Defrost_Request_Supervisor.DefrostEnableCommand.Off,
            Windshield_Defrost_Request_Supervisor.PolicyDisposition.ElectricalBlocked)
        case _ =>
          (Windshield_Defrost_Request_Supervisor.DefrostEnableCommand.Off,
            Windshield_Defrost_Request_Supervisor.PolicyDisposition.Inactive)
      }

    api.put_defrostEnableCommand(result._1)
    api.put_policyDisposition(result._2)
  }

  def finalise(api: DefrostPolicySupervisor_Operational_Api): Unit = { }
}
