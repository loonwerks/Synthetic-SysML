// #Sireum

package scp_candidate.Docked_Service_Access_Lifecycle_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier {

  def initialise(api: ServiceInterlockQualifier_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INTERLOCK_INITIAL_SAFE
        api.monitorInterlock == ServiceInterlock.SERVICE_FAULT &&
          api.gateInterlock == ServiceInterlock.SERVICE_FAULT
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_monitorInterlock(Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlock.SERVICE_FAULT)
    api.put_gateInterlock(Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlock.SERVICE_FAULT)
  }

  def timeTriggered(api: ServiceInterlockQualifier_Operational_Api): Unit = {
    Contract(Modifies(api))
    val repair: ServiceSignal.Type = api.get_repairSignal().get
    val resupply: ServiceSignal.Type = api.get_resupplySignal().get
    var interlock: ServiceInterlock.Type = ServiceInterlock.SERVICE_CONFLICT
    if (repair == ServiceSignal.FAULT || repair == ServiceSignal.INVALID ||
        resupply == ServiceSignal.FAULT || resupply == ServiceSignal.INVALID) {
      interlock = ServiceInterlock.SERVICE_FAULT
    } else if (repair == ServiceSignal.QUIESCENT && resupply == ServiceSignal.QUIESCENT) {
      interlock = ServiceInterlock.QUIESCENT
    } else if ((repair == ServiceSignal.REQUEST && resupply == ServiceSignal.QUIESCENT) ||
        (repair == ServiceSignal.QUIESCENT && resupply == ServiceSignal.REQUEST)) {
      interlock = ServiceInterlock.SINGLE_DEMAND
    } else if ((repair == ServiceSignal.ACTIVE && resupply == ServiceSignal.QUIESCENT) ||
        (repair == ServiceSignal.QUIESCENT && resupply == ServiceSignal.ACTIVE)) {
      interlock = ServiceInterlock.SINGLE_ACTIVE
    } else if ((repair == ServiceSignal.COMPLETE && resupply == ServiceSignal.QUIESCENT) ||
        (repair == ServiceSignal.QUIESCENT && resupply == ServiceSignal.COMPLETE)) {
      interlock = ServiceInterlock.SINGLE_COMPLETION
    }
    api.put_monitorInterlock(interlock)
    api.put_gateInterlock(interlock)
  }

  def finalise(api: ServiceInterlockQualifier_Operational_Api): Unit = { }
}
