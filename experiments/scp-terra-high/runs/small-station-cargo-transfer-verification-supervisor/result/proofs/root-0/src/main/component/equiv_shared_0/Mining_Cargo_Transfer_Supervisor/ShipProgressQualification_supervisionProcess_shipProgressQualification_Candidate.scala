// #Sireum

package equiv_shared_0.Mining_Cargo_Transfer_Supervisor

import org.sireum._
import equiv_shared_0._

object ShipProgressQualification_supervisionProcess_shipProgressQualification_Candidate {
  // BEGIN FUNCTIONS
  @strictpure def qualifyShip(sample: Mining_Cargo_Transfer_Supervisor.ShipTransferSample): Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress.Type = if (sample.status == InputStatus.Invalid) QualifiedShipProgress.InvalidShipProgress else if (sample.progress == ShipTransferProgress.InProgress) QualifiedShipProgress.ShipInProgress else if (sample.progress == ShipTransferProgress.Complete) QualifiedShipProgress.ShipComplete else if (sample.progress == ShipTransferProgress.Failed) QualifiedShipProgress.ShipFailed else QualifiedShipProgress.ShipIdle
  // END FUNCTIONS
}
