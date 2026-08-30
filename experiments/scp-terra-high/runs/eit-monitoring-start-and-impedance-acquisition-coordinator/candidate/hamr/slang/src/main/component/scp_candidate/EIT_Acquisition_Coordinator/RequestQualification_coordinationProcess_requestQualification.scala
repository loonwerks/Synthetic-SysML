// #Sireum

package scp_candidate.EIT_Acquisition_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object RequestQualification_coordinationProcess_requestQualification {

  def initialise(api: RequestQualification_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_qualifiedRequest(EIT_Acquisition_Coordinator.QualifiedRequest.InvalidRequest)
  }

  def timeTriggered(api: RequestQualification_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.get_requestSample() match {
      case Some(sample) =>
        if (sample.status == EIT_Acquisition_Coordinator.InputStatus.Invalid) {
          api.put_qualifiedRequest(EIT_Acquisition_Coordinator.QualifiedRequest.InvalidRequest)
        } else if (sample.request == EIT_Acquisition_Coordinator.MonitoringRequest.NoRequest) {
          api.put_qualifiedRequest(EIT_Acquisition_Coordinator.QualifiedRequest.NoQualifiedRequest)
        } else if (sample.request == EIT_Acquisition_Coordinator.MonitoringRequest.StartMonitoring) {
          api.put_qualifiedRequest(EIT_Acquisition_Coordinator.QualifiedRequest.QualifiedStart)
        } else {
          api.put_qualifiedRequest(EIT_Acquisition_Coordinator.QualifiedRequest.QualifiedStop)
        }
    }
  }

  def finalise(api: RequestQualification_Operational_Api): Unit = { }
}
