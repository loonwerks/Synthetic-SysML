// #Sireum

package equiv_shared_0.Mining_Cargo_Transfer_Supervisor

import org.sireum._
import equiv_shared_0._

object RequestQualification_supervisionProcess_requestQualification_Candidate {
  // BEGIN FUNCTIONS
  @strictpure def qualifyRequest(sample: Mining_Cargo_Transfer_Supervisor.OffloadRequestSample): Mining_Cargo_Transfer_Supervisor.QualifiedRequest.Type = if (sample.status == InputStatus.Invalid) QualifiedRequest.InvalidRequest else if (sample.requestEvent == OffloadRequestEvent.OffloadRequested) QualifiedRequest.QualifiedOffloadRequest else QualifiedRequest.NoQualifiedRequest
  // END FUNCTIONS
}
