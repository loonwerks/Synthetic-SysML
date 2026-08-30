// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_f0eb180c72fa_2_Valid {
  @pure def check(
      admitteddirective: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.AdmittedDirective.Type,
      commandproposal: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.CommandProposal.Type,
      sessionprestate: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.SessionState.Type,
      sessionsnapshot: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.SessionSnapshot,
      shipexpectation: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.SessionExpectation.Type,
      verificationdisposition: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.VerificationDisposition.Type,
      warehouseexpectation: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.SessionExpectation.Type,
      in_sessionstate: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.SessionState.Type,
      sessionstate: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.SessionState.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.SessionController_supervisorProcess_sessionController_GumboX.compute_CEP_Post(in_sessionstate, sessionstate, admitteddirective, verificationdisposition, commandproposal, sessionprestate, sessionsnapshot, shipexpectation, warehouseexpectation))) & T))
  }
}
