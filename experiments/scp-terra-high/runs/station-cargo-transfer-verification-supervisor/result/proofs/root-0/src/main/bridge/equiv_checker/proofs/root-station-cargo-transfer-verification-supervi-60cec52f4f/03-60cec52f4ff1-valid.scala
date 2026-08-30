// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_60cec52f4ff1_3_Valid {
  @pure def check(
      sessionexpectation: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.SessionExpectation.Type,
      shipfinding: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.ShipFinding.Type,
      transferevidence: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.ShipTransferEvidence.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
