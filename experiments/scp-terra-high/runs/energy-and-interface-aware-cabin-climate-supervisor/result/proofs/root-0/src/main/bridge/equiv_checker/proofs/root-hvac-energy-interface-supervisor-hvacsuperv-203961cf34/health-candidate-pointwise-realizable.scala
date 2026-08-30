// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_203961cf3423_Candidate_Pointwise_Realizable {
  @pure def check(
      energycapability: equiv_shared_0.HVAC_Energy_Interface_Supervisor.EnergyCapability.Type,
      freshrequest: equiv_shared_0.HVAC_Energy_Interface_Supervisor.FreshRequest.Type,
      in_recoverystate: equiv_shared_0.HVAC_Energy_Interface_Supervisor.RecoveryState.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_Candidate_GumboX.compute_CEP_Post(in_recoverystate, equiv_shared_0.HVAC_Energy_Interface_Supervisor.RecoveryState.Armed, energycapability, freshrequest, equiv_shared_0.HVAC_Energy_Interface_Supervisor.RecoveryDecision.Permit)) |
        (equiv_shared_0.HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_Candidate_GumboX.compute_CEP_Post(in_recoverystate, equiv_shared_0.HVAC_Energy_Interface_Supervisor.RecoveryState.Inhibited, energycapability, freshrequest, equiv_shared_0.HVAC_Energy_Interface_Supervisor.RecoveryDecision.Permit)) |
        (equiv_shared_0.HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_Candidate_GumboX.compute_CEP_Post(in_recoverystate, equiv_shared_0.HVAC_Energy_Interface_Supervisor.RecoveryState.Armed, energycapability, freshrequest, equiv_shared_0.HVAC_Energy_Interface_Supervisor.RecoveryDecision.BlockEnergyInvalid)) |
        (equiv_shared_0.HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_Candidate_GumboX.compute_CEP_Post(in_recoverystate, equiv_shared_0.HVAC_Energy_Interface_Supervisor.RecoveryState.Inhibited, energycapability, freshrequest, equiv_shared_0.HVAC_Energy_Interface_Supervisor.RecoveryDecision.BlockEnergyInvalid)) |
        (equiv_shared_0.HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_Candidate_GumboX.compute_CEP_Post(in_recoverystate, equiv_shared_0.HVAC_Energy_Interface_Supervisor.RecoveryState.Armed, energycapability, freshrequest, equiv_shared_0.HVAC_Energy_Interface_Supervisor.RecoveryDecision.BlockEnergyUnavailable)) |
        (equiv_shared_0.HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_Candidate_GumboX.compute_CEP_Post(in_recoverystate, equiv_shared_0.HVAC_Energy_Interface_Supervisor.RecoveryState.Inhibited, energycapability, freshrequest, equiv_shared_0.HVAC_Energy_Interface_Supervisor.RecoveryDecision.BlockEnergyUnavailable)) |
        (equiv_shared_0.HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_Candidate_GumboX.compute_CEP_Post(in_recoverystate, equiv_shared_0.HVAC_Energy_Interface_Supervisor.RecoveryState.Armed, energycapability, freshrequest, equiv_shared_0.HVAC_Energy_Interface_Supervisor.RecoveryDecision.BlockAwaitFresh)) |
        (equiv_shared_0.HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_Candidate_GumboX.compute_CEP_Post(in_recoverystate, equiv_shared_0.HVAC_Energy_Interface_Supervisor.RecoveryState.Inhibited, energycapability, freshrequest, equiv_shared_0.HVAC_Energy_Interface_Supervisor.RecoveryDecision.BlockAwaitFresh)) |
        (equiv_shared_0.HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_Candidate_GumboX.compute_CEP_Post(in_recoverystate, equiv_shared_0.HVAC_Energy_Interface_Supervisor.RecoveryState.Armed, energycapability, freshrequest, equiv_shared_0.HVAC_Energy_Interface_Supervisor.RecoveryDecision.PermitRecovered)) |
        (equiv_shared_0.HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_Candidate_GumboX.compute_CEP_Post(in_recoverystate, equiv_shared_0.HVAC_Energy_Interface_Supervisor.RecoveryState.Inhibited, energycapability, freshrequest, equiv_shared_0.HVAC_Energy_Interface_Supervisor.RecoveryDecision.PermitRecovered)))))
  }
}
