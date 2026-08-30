// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_266720a57b9b_3_Valid {
  @pure def check(
      commandresolution: equiv_shared_0.Mining_Cargo_Transfer_Supervisor.TransferResolution,
      dockingassessment: equiv_shared_0.Mining_Cargo_Transfer_Supervisor.DockingAssessment.Type,
      qualifiedrequest: equiv_shared_0.Mining_Cargo_Transfer_Supervisor.QualifiedRequest.Type,
      qualifiedshipprogress: equiv_shared_0.Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress.Type,
      qualifiedwarehouseevidence: equiv_shared_0.Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence.Type,
      reportresolution: equiv_shared_0.Mining_Cargo_Transfer_Supervisor.TransferResolution,
      in_rearmrequired: B,
      rearmrequired: B,
      in_transferphase: equiv_shared_0.Mining_Cargo_Transfer_Supervisor.TransferPhase.Type,
      transferphase: equiv_shared_0.Mining_Cargo_Transfer_Supervisor.TransferPhase.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
