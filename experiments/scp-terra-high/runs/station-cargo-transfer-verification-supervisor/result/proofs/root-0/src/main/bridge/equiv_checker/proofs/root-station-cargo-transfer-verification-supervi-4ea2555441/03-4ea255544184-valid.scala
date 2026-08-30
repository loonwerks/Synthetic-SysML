// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_4ea255544184_3_Valid {
  @pure def check(
      gateeligibility: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.ServiceEligibility.Type,
      servicecondition: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.DockServiceCondition.Type,
      serviceeligibility: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.ServiceEligibility.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
