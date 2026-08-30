// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_8893a7d5fc79_4_Valid {
  @pure def check(
      commandproposal: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.CommandProposal.Type,
      receiptquery: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.WarehouseQuery.Type,
      serviceeligibility: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.ServiceEligibility.Type,
      shipcommand: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.ShipCommand.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_GumboX.compute_CEP_Post(commandproposal, serviceeligibility, receiptquery, shipcommand))) ___>: (equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.CommandSafetyGate_supervisorProcess_commandSafetyGate_Candidate_GumboX.compute_CEP_Post(commandproposal, serviceeligibility, receiptquery, shipcommand))) & T))
  }
}
