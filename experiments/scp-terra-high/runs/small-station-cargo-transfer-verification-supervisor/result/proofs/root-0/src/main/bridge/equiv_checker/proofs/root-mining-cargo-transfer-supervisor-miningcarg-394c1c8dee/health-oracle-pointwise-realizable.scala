// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_394c1c8dee0e_Oracle_Pointwise_Realizable {
  @pure def check(
      shipsample: equiv_shared_0.Mining_Cargo_Transfer_Supervisor.ShipTransferSample): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_GumboX.compute_CEP_Post(shipsample, equiv_shared_0.Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress.InvalidShipProgress)) |
        (equiv_shared_0.Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_GumboX.compute_CEP_Post(shipsample, equiv_shared_0.Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress.ShipIdle)) |
        (equiv_shared_0.Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_GumboX.compute_CEP_Post(shipsample, equiv_shared_0.Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress.ShipInProgress)) |
        (equiv_shared_0.Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_GumboX.compute_CEP_Post(shipsample, equiv_shared_0.Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress.ShipComplete)) |
        (equiv_shared_0.Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_GumboX.compute_CEP_Post(shipsample, equiv_shared_0.Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress.ShipFailed)))))
  }
}
