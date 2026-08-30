// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_6453be405001_1_Valid {
  @pure def check(
      admitteddirective: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.AdmittedDirective.Type,
      qualifiedrequest: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.QualifiedRequest.Type,
      serviceeligibility: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.ServiceEligibility.Type,
      sessionprestate: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.SessionState.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
