// #Sireum

package scp_candidate.Factory_Flow

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object WorkRequestQualifier_supervisorProcess_workRequestQualifier {

  def initialise(api: WorkRequestQualifier_Initialization_Api): Unit = {
    Contract(Modifies(api), Ensures(
      // BEGIN INITIALIZES ENSURES
        // guarantee SafeAdmissionInitialization
        T
        // END INITIALIZES ENSURES
    ))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_admissionToMaterial(Factory_Flow.AdmissionFact.example())
    api.put_admissionToPriority(Factory_Flow.AdmissionFact.example())
  }

  def timeTriggered(api: WorkRequestQualifier_Operational_Api): Unit = { }

  def finalise(api: WorkRequestQualifier_Operational_Api): Unit = { }
}
