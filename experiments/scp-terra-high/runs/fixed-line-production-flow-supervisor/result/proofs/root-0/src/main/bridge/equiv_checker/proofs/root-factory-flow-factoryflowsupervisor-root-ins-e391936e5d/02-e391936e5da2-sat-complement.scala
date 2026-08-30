// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_e391936e5da2_2_Complement {
  @pure def check(
      authorization: equiv_shared_0.Factory_Flow.AuthorizationFact,
      contexttooutcome: equiv_shared_0.Factory_Flow.FlowContext,
      contexttoreadiness: equiv_shared_0.Factory_Flow.FlowContext,
      linecommand: equiv_shared_0.Factory_Flow.LineFlowCommand,
      protectioncontext: equiv_shared_0.Factory_Flow.ProtectionContext,
      snapshottooutcome: equiv_shared_0.Factory_Flow.FlowSnapshot,
      snapshottostatus: equiv_shared_0.Factory_Flow.FlowSnapshot,
      in_activestep: equiv_shared_0.Factory_Flow.FlowStep.Type,
      activestep: equiv_shared_0.Factory_Flow.FlowStep.Type,
      in_activework: equiv_shared_0.Factory_Flow.WorkId.Type,
      activework: equiv_shared_0.Factory_Flow.WorkId.Type,
      in_attempt: equiv_shared_0.Factory_Flow.AttemptKind.Type,
      attempt: equiv_shared_0.Factory_Flow.AttemptKind.Type,
      in_phase: equiv_shared_0.Factory_Flow.LedgerPhase.Type,
      phase: equiv_shared_0.Factory_Flow.LedgerPhase.Type): Unit = {
    Contract(Requires(!((((T) & (equiv_shared_0.Factory_Flow.FlowLedger_supervisorProcess_flowLedger_Candidate_GumboX.compute_CEP_Post(in_activestep, in_activework, in_attempt, in_phase, activestep, activework, attempt, phase, authorization, contexttooutcome, contexttoreadiness, linecommand, protectioncontext, snapshottooutcome, snapshottostatus))) ___>: (equiv_shared_0.Factory_Flow.FlowLedger_supervisorProcess_flowLedger_GumboX.compute_CEP_Post(in_activestep, in_activework, in_attempt, in_phase, activestep, activework, attempt, phase, authorization, contexttooutcome, contexttoreadiness, linecommand, protectioncontext, snapshottooutcome, snapshottostatus))) & T)))
  }
}
