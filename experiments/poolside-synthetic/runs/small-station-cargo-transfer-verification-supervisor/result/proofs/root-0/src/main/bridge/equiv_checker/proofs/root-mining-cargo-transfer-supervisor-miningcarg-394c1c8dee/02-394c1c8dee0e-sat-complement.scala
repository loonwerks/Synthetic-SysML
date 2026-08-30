// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_394c1c8dee0e_2_Complement {
  @pure def check(
      qualifiedshipprogress: equiv_shared_0.Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress.Type,
      shipsample: equiv_shared_0.Mining_Cargo_Transfer_Supervisor.ShipTransferSample): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Mining_Cargo_Transfer_Supervisor.ShipProgressQualification_supervisionProcess_shipProgressQualification_GumboX.compute_CEP_Post(shipsample, qualifiedshipprogress))) & T)))
  }
}
