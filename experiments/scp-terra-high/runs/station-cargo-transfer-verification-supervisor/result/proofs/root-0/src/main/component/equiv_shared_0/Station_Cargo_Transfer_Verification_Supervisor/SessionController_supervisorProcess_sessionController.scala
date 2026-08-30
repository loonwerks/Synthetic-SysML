// #Sireum

package equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor

import org.sireum._
import equiv_shared_0._

object SessionController_supervisorProcess_sessionController {
  // BEGIN FUNCTIONS
  @strictpure def snapshot_state(value: Station_Cargo_Transfer_Verification_Supervisor.SessionState.Type): Station_Cargo_Transfer_Verification_Supervisor.SnapshotSessionState.Type = if (value == SessionState.Commanding) SnapshotSessionState.Commanding else if (value == SessionState.AwaitingEvidence) SnapshotSessionState.AwaitingEvidence else if (value == SessionState.Verified) SnapshotSessionState.Verified else if (value == SessionState.StoppedByCancel) SnapshotSessionState.StoppedByCancel else if (value == SessionState.StoppedByUndock) SnapshotSessionState.StoppedByUndock else if (value == SessionState.StoppedByService) SnapshotSessionState.StoppedByService else if (value == SessionState.RecoveryRequired) SnapshotSessionState.RecoveryRequired else SnapshotSessionState.Idle
  // END FUNCTIONS
}
