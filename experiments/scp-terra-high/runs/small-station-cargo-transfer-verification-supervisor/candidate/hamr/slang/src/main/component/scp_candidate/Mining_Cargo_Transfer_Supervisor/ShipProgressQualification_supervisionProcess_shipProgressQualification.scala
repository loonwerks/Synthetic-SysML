// #Sireum

package scp_candidate.Mining_Cargo_Transfer_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ShipProgressQualification_supervisionProcess_shipProgressQualification {

  // BEGIN FUNCTIONS
  @strictpure def qualifyShip(sample: Mining_Cargo_Transfer_Supervisor.ShipTransferSample): Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress.Type = if (sample.status == InputStatus.Invalid) QualifiedShipProgress.InvalidShipProgress else if (sample.progress == ShipTransferProgress.InProgress) QualifiedShipProgress.ShipInProgress else if (sample.progress == ShipTransferProgress.Complete) QualifiedShipProgress.ShipComplete else if (sample.progress == ShipTransferProgress.Failed) QualifiedShipProgress.ShipFailed else QualifiedShipProgress.ShipIdle
  // END FUNCTIONS

  def initialise(api: ShipProgressQualification_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INIT_SHIP_QUALIFICATION
        api.qualifiedShipProgress == QualifiedShipProgress.ShipIdle
        // END INITIALIZES ENSURES
      )
    )
    api.put_qualifiedShipProgress(QualifiedShipProgress.ShipIdle)
  }

  def timeTriggered(api: ShipProgressQualification_Operational_Api): Unit = {
    Contract(Modifies(api))
    val sample = api.get_shipSample().get
    api.put_qualifiedShipProgress(qualifyShip(sample))
  }

  def finalise(api: ShipProgressQualification_Operational_Api): Unit = { }
}
