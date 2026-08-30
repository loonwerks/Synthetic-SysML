// #Sireum

package scp_candidate.Protected_Start_Power_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner {
  var rearmMemory: Protected_Start_Power_Supervisor.RearmState.Type = Protected_Start_Power_Supervisor.RearmState.Blocked

  def initialise(api: RearmQualificationStateOwner_Initialization_Api): Unit = {
    Contract(Modifies(api, rearmMemory))
    rearmMemory = Protected_Start_Power_Supervisor.RearmState.Blocked
    api.put_rearm_state_facts(Protected_Start_Power_Supervisor.RearmStateFacts(rearmMemory))
    api.put_recovery_permit_fact(Protected_Start_Power_Supervisor.RecoveryPermitFact(F))
  }

  def timeTriggered(api: RearmQualificationStateOwner_Operational_Api): Unit = {
    Contract(Modifies(api, rearmMemory))
    (api.get_qualified_command_facts(), api.get_readiness_facts(), api.get_exact_fault_summary()) match {
      case (Some(command), Some(readiness), Some(faults)) =>
        var permit: B = F
        if (faults.anyFault || !readiness.sustainReady) {
          rearmMemory = Protected_Start_Power_Supervisor.RearmState.Blocked
        } else if (rearmMemory == Protected_Start_Power_Supervisor.RearmState.Blocked) {
          rearmMemory = Protected_Start_Power_Supervisor.RearmState.Confirming
        } else if (rearmMemory == Protected_Start_Power_Supervisor.RearmState.Confirming) {
          rearmMemory = Protected_Start_Power_Supervisor.RearmState.Ready
        } else {
          permit = command.command == Protected_Start_Power_Supervisor.Command.ReturnToNormal
        }
        api.put_rearm_state_facts(Protected_Start_Power_Supervisor.RearmStateFacts(rearmMemory))
        api.put_recovery_permit_fact(Protected_Start_Power_Supervisor.RecoveryPermitFact(permit))
    }
  }

  def finalise(api: RearmQualificationStateOwner_Operational_Api): Unit = { }
}
