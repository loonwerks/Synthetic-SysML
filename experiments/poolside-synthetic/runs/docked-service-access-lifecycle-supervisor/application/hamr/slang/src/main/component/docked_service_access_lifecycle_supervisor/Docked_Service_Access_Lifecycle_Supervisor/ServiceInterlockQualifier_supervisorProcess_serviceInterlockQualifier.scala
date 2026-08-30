// #Sireum

package docked_service_access_lifecycle_supervisor.Docked_Service_Access_Lifecycle_Supervisor

import org.sireum._
import docked_service_access_lifecycle_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier {

  def initialise(api: ServiceInterlockQualifier_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_monitorInterlock(Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlock.QUIESCENT)
    api.put_gateInterlock(Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlock.QUIESCENT)
  }

  def timeTriggered(api: ServiceInterlockQualifier_Operational_Api): Unit = {
    // example api usage

    val apiUsage_repairSignal: Option[Docked_Service_Access_Lifecycle_Supervisor.ServiceSignal.Type] = api.get_repairSignal()
    api.logInfo(s"Received on data port repairSignal: ${apiUsage_repairSignal}")
    val apiUsage_resupplySignal: Option[Docked_Service_Access_Lifecycle_Supervisor.ServiceSignal.Type] = api.get_resupplySignal()
    api.logInfo(s"Received on data port resupplySignal: ${apiUsage_resupplySignal}")
  }

  def finalise(api: ServiceInterlockQualifier_Operational_Api): Unit = { }
}
