// #Sireum

package factory_flow.Factory_Flow

import org.sireum._
import factory_flow._

// This file will not be overwritten if HAMR codegen is rerun
object ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver {

  def initialise(api: ProtectedWorkPriorityResolver_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_intentFact(Factory_Flow.FlowIntentFact.example())
  }

  def timeTriggered(api: ProtectedWorkPriorityResolver_Operational_Api): Unit = {
    // example api usage

    val apiUsage_admission: Option[Factory_Flow.AdmissionFact] = api.get_admission()
    api.logInfo(s"Received on data port admission: ${apiUsage_admission}")
    val apiUsage_protectionContext: Option[Factory_Flow.ProtectionContext] = api.get_protectionContext()
    api.logInfo(s"Received on data port protectionContext: ${apiUsage_protectionContext}")
  }

  def finalise(api: ProtectedWorkPriorityResolver_Operational_Api): Unit = { }
}
