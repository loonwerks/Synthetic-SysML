// #Sireum

package scp_candidate.Mining_Cargo_Transfer_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object RequestQualification_supervisionProcess_requestQualification {

  // BEGIN FUNCTIONS
  @strictpure def qualifyRequest(sample: Mining_Cargo_Transfer_Supervisor.OffloadRequestSample): Mining_Cargo_Transfer_Supervisor.QualifiedRequest.Type = if (sample.status == InputStatus.Invalid) QualifiedRequest.InvalidRequest else if (sample.requestEvent == OffloadRequestEvent.OffloadRequested) QualifiedRequest.QualifiedOffloadRequest else QualifiedRequest.NoQualifiedRequest
  // END FUNCTIONS

  def initialise(api: RequestQualification_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INIT_REQUEST_QUALIFICATION
        api.qualifiedRequest == QualifiedRequest.NoQualifiedRequest
        // END INITIALIZES ENSURES
      )
    )
    api.put_qualifiedRequest(QualifiedRequest.NoQualifiedRequest)
  }

  def timeTriggered(api: RequestQualification_Operational_Api): Unit = {
    Contract(Modifies(api))
    val sample = api.get_requestSample().get
    api.put_qualifiedRequest(qualifyRequest(sample))
  }

  def finalise(api: RequestQualification_Operational_Api): Unit = { }
}
