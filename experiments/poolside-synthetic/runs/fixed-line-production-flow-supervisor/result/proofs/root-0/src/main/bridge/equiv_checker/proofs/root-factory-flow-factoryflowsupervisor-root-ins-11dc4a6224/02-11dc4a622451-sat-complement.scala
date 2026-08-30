// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_11dc4a622451_2_Complement {
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
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Factory_Flow.FlowLedger_supervisorProcess_flowLedger_GumboX.inititialize_IEP_Post(activestep, activework, attempt, phase, contexttooutcome, contexttoreadiness, linecommand, protectioncontext, snapshottooutcome, snapshottostatus))) & T)))
  }
}
