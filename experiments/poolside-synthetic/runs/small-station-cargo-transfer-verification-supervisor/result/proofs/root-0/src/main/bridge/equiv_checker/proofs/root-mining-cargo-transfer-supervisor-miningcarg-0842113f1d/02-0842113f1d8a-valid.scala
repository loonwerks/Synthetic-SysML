// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_0842113f1d8a_2_Valid {
  @pure def check(
      commandresolution: equiv_shared_0.Mining_Cargo_Transfer_Supervisor.TransferResolution,
      dockingassessment: equiv_shared_0.Mining_Cargo_Transfer_Supervisor.DockingAssessment.Type,
      qualifiedrequest: equiv_shared_0.Mining_Cargo_Transfer_Supervisor.QualifiedRequest.Type,
      qualifiedshipprogress: equiv_shared_0.Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress.Type,
      qualifiedwarehouseevidence: equiv_shared_0.Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence.Type,
      reportresolution: equiv_shared_0.Mining_Cargo_Transfer_Supervisor.TransferResolution,
      rearmrequired: B,
      transferphase: equiv_shared_0.Mining_Cargo_Transfer_Supervisor.TransferPhase.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Mining_Cargo_Transfer_Supervisor.TransferDecisionOwner_supervisionProcess_transferDecisionOwner_GumboX.inititialize_IEP_Post(rearmrequired, transferphase, commandresolution, reportresolution))) & T))
  }
}
