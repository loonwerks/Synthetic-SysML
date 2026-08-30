// #Sireum

package scp_candidate.Windshield_Defrost_Request_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter {

  def initialise(api: DriverFeedbackReporter_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_DRIVER_STATUS
        api.driverDefrostStatus == DriverDefrostStatus.Idle
        // END INITIALIZES ENSURES
      )
    )
    api.put_driverDefrostStatus(DriverDefrostStatus.Idle)
  }

  def timeTriggered(api: DriverFeedbackReporter_Operational_Api): Unit = {
    Contract(
      Modifies(api)
    )
    val intent = api.get_requestIntent().get
    val disposition = api.get_policyDisposition().get
    if (intent == RequestIntent.BlockedInvalid ||
        intent == RequestIntent.BlockedRearm ||
        ((intent == RequestIntent.Fresh || intent == RequestIntent.Held) &&
         (disposition == PolicyDisposition.ObservationFault ||
          disposition == PolicyDisposition.ElectricalBlocked))) {
      api.put_driverDefrostStatus(DriverDefrostStatus.AttentionRequired)
    } else if ((intent == RequestIntent.Fresh || intent == RequestIntent.Held) &&
               disposition == PolicyDisposition.Defrosting) {
      api.put_driverDefrostStatus(DriverDefrostStatus.Defrosting)
    } else if ((intent == RequestIntent.Fresh || intent == RequestIntent.Held) &&
               disposition == PolicyDisposition.Complete) {
      api.put_driverDefrostStatus(DriverDefrostStatus.Complete)
    } else {
      api.put_driverDefrostStatus(DriverDefrostStatus.Idle)
    }
  }

  def finalise(api: DriverFeedbackReporter_Operational_Api): Unit = { }
}
