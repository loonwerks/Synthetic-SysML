// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_11dc4a622451_3_Valid {
  @pure def check(
      authorization: equiv_shared_0.Factory_Flow.AuthorizationFact,
      contexttooutcome: equiv_shared_0.Factory_Flow.FlowContext,
      contexttoreadiness: equiv_shared_0.Factory_Flow.FlowContext,
      linecommand: equiv_shared_0.Factory_Flow.LineFlowCommand,
      protectioncontext: equiv_shared_0.Factory_Flow.ProtectionContext,
      snapshottooutcome: equiv_shared_0.Factory_Flow.FlowSnapshot,
      snapshottostatus: equiv_shared_0.Factory_Flow.FlowSnapshot,
      activestep: equiv_shared_0.Factory_Flow.FlowStep.Type,
      activework: equiv_shared_0.Factory_Flow.WorkId.Type,
      attempt: equiv_shared_0.Factory_Flow.AttemptKind.Type,
      phase: equiv_shared_0.Factory_Flow.LedgerPhase.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
