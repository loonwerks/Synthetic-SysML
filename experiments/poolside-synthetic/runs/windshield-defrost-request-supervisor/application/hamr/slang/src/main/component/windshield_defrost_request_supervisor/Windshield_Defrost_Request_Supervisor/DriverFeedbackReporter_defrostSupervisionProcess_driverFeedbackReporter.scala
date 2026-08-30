// #Sireum

package windshield_defrost_request_supervisor.Windshield_Defrost_Request_Supervisor

import org.sireum._
import windshield_defrost_request_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter {

  def initialise(api: DriverFeedbackReporter_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        api.driverDefrostStatus == Windshield_Defrost_Request_Supervisor.DriverDefrostStatus.Idle
      )
    )
    api.put_driverDefrostStatus(Windshield_Defrost_Request_Supervisor.DriverDefrostStatus.Idle)
  }

  def timeTriggered(api: DriverFeedbackReporter_Operational_Api): Unit = {
    Contract(
      Modifies(
        api
      ),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CC_12_DRIVER_REPORTING
        //   map policy disposition and request intent to driver status
        (api.requestIntent == RequestIntent.BlockedInvalid |
          api.requestIntent == RequestIntent.BlockedRearm |
          (api.requestIntent == RequestIntent.Fresh |
            api.requestIntent == RequestIntent.Held) &
            (api.policyDisposition == PolicyDisposition.ObservationFault |
              api.policyDisposition == PolicyDisposition.ElectricalBlocked) |
          (api.requestIntent == RequestIntent.Fresh |
            api.requestIntent == RequestIntent.Held) &
            api.policyDisposition == PolicyDisposition.Defrosting |
          (api.requestIntent == RequestIntent.Fresh |
            api.requestIntent == RequestIntent.Held) &
            api.policyDisposition == PolicyDisposition.Complete |
          api.requestIntent == RequestIntent.None |
          (api.requestIntent == RequestIntent.Fresh |
            api.requestIntent == RequestIntent.Held) &
            api.policyDisposition == PolicyDisposition.Inactive) ___>: ((api.requestIntent == RequestIntent.BlockedInvalid |
          api.requestIntent == RequestIntent.BlockedRearm |
          (api.requestIntent == RequestIntent.Fresh |
            api.requestIntent == RequestIntent.Held) &
            (api.policyDisposition == PolicyDisposition.ObservationFault |
              api.policyDisposition == PolicyDisposition.ElectricalBlocked) ___>:
          api.driverDefrostStatus == DriverDefrostStatus.AttentionRequired) &
          ((api.requestIntent == RequestIntent.Fresh |
            api.requestIntent == RequestIntent.Held) &
            api.policyDisposition == PolicyDisposition.Defrosting ___>:
            api.driverDefrostStatus == DriverDefrostStatus.Defrosting) &
          ((api.requestIntent == RequestIntent.Fresh |
            api.requestIntent == RequestIntent.Held) &
            api.policyDisposition == PolicyDisposition.Complete ___>:
            api.driverDefrostStatus == DriverDefrostStatus.Complete) &
          (api.requestIntent == RequestIntent.None |
            (api.requestIntent == RequestIntent.Fresh |
              api.requestIntent == RequestIntent.Held) &
              api.policyDisposition == PolicyDisposition.Inactive ___>:
            api.driverDefrostStatus == DriverDefrostStatus.Idle))
        // END COMPUTE ENSURES timeTriggered
      )
    )

    val requestIntent = api.get_requestIntent().get
    val policyDisposition = api.get_policyDisposition().get

    val status: Windshield_Defrost_Request_Supervisor.DriverDefrostStatus.Type =
      if (requestIntent == RequestIntent.BlockedInvalid |
          requestIntent == RequestIntent.BlockedRearm) {
        DriverDefrostStatus.AttentionRequired
      } else if ((requestIntent == RequestIntent.Fresh |
                  requestIntent == RequestIntent.Held) &
                 (policyDisposition == PolicyDisposition.ObservationFault |
                  policyDisposition == PolicyDisposition.ElectricalBlocked)) {
        DriverDefrostStatus.AttentionRequired
      } else if ((requestIntent == RequestIntent.Fresh |
                  requestIntent == RequestIntent.Held) &
                 policyDisposition == PolicyDisposition.Defrosting) {
        DriverDefrostStatus.Defrosting
      } else if ((requestIntent == RequestIntent.Fresh |
                  requestIntent == RequestIntent.Held) &
                 policyDisposition == PolicyDisposition.Complete) {
        DriverDefrostStatus.Complete
      } else {
        DriverDefrostStatus.Idle
      }

    api.put_driverDefrostStatus(status)
  }

  def finalise(api: DriverFeedbackReporter_Operational_Api): Unit = { }
}
