// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_7773836a5ea5_4_Valid {
  @pure def check(
      qualifiedshipprogress: equiv_shared_0.Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress.Type,
      shipsample: equiv_shared_0.Mining_Cargo_Transfer_Supervisor.ShipTransferSample): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_GumboX.inititialize_IEP_Post(qualifiedshipprogress))) ___>: (equiv_shared_0.Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_Candidate_GumboX.inititialize_IEP_Post(qualifiedshipprogress))) & T))
  }
}
