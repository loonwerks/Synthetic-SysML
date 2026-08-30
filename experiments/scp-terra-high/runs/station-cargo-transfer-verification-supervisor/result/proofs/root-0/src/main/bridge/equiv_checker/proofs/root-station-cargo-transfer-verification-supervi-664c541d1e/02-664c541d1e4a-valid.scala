// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_664c541d1e4a_2_Valid {
  @pure def check(
      commandproposal: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.CommandProposal.Type,
      receiptquery: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.WarehouseQuery.Type,
      serviceeligibility: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.ServiceEligibility.Type,
      shipcommand: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.ShipCommand.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_Candidate_GumboX.inititialize_IEP_Post(receiptquery, shipcommand))) ___>: (equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_GumboX.inititialize_IEP_Post(receiptquery, shipcommand))) & T))
  }
}
