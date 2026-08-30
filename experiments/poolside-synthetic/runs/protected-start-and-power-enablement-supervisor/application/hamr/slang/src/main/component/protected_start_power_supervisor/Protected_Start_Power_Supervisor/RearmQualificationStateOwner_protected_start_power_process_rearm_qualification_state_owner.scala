// #Sireum

package protected_start_power_supervisor.Protected_Start_Power_Supervisor

import org.sireum._
import protected_start_power_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner {

  // BEGIN STATE VARS
  var rearmMemory: Protected_Start_Power_Supervisor.RearmState.Type = Protected_Start_Power_Supervisor.RearmState.Blocked
  // END STATE VARS

  def initialise(api: RearmQualificationStateOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_rearm_state_facts(Protected_Start_Power_Supervisor.RearmStateFacts.example())
    api.put_recovery_permit_fact(Protected_Start_Power_Supervisor.RecoveryPermitFact.example())
  }

  def timeTriggered(api: RearmQualificationStateOwner_Operational_Api): Unit = {
    Contract(
      Modifies(
        // BEGIN COMPUTE MODIFIES timeTriggered
        rearmMemory
        // END COMPUTE MODIFIES timeTriggered
      ),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee REARM_OUTPUT_COHERENCE
        //   rearmState tracks rearmMemory
        api.rearm_state_facts.rearmState == rearmMemory,
        // case REARM_CURRENT_FAULT
        //   anyFault forces rearm Blocked with recovery permit
        (api.exact_fault_summary.anyFault == T) ___>: (rearmMemory == RearmState.Blocked &
          api.recovery_permit_fact.recoveryPermit == T),
        // case REARM_NOT_SUSTAIN_READY
        //   no fault and not sustainReady forces rearm Blocked with recovery permit
        (api.exact_fault_summary.anyFault == F &
          api.readiness_facts.sustainReady == F) ___>: (rearmMemory == RearmState.Blocked &
          api.recovery_permit_fact.recoveryPermit == T),
        // case REARM_FIRST_CLEAN_SNAPSHOT
        //   no fault, sustainReady, Blocked on entry to Confirming with recovery permit
        (api.exact_fault_summary.anyFault == F &
          api.readiness_facts.sustainReady == T &
          In(rearmMemory) == RearmState.Blocked) ___>: (rearmMemory == RearmState.Confirming &
          api.recovery_permit_fact.recoveryPermit == T),
        // case REARM_SECOND_CLEAN_SNAPSHOT
        //   no fault, sustainReady, Confirming on entry to Ready with recovery permit
        (api.exact_fault_summary.anyFault == F &
          api.readiness_facts.sustainReady == T &
          In(rearmMemory) == RearmState.Confirming) ___>: (rearmMemory == RearmState.Ready &
          api.recovery_permit_fact.recoveryPermit == T),
        // case REARM_READY_FRESH_REQUEST
        //   no fault, sustainReady, Ready on entry retains Ready, recovery permit iff ReturnToNormal
        (api.exact_fault_summary.anyFault == F &
          api.readiness_facts.sustainReady == T &
          In(rearmMemory) == RearmState.Ready) ___>: (rearmMemory == RearmState.Ready &
          api.recovery_permit_fact.recoveryPermit == (api.qualified_command_facts.command == Command.ReturnToNormal))
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_qualified_command_facts: Option[Protected_Start_Power_Supervisor.QualifiedCommandFacts] = api.get_qualified_command_facts()
    api.logInfo(s"Received on data port qualified_command_facts: ${apiUsage_qualified_command_facts}")
    val apiUsage_readiness_facts: Option[Protected_Start_Power_Supervisor.ReadinessFacts] = api.get_readiness_facts()
    api.logInfo(s"Received on data port readiness_facts: ${apiUsage_readiness_facts}")
    val apiUsage_exact_fault_summary: Option[Protected_Start_Power_Supervisor.ExactFaultSummary] = api.get_exact_fault_summary()
    api.logInfo(s"Received on data port exact_fault_summary: ${apiUsage_exact_fault_summary}")
  }

  def finalise(api: RearmQualificationStateOwner_Operational_Api): Unit = { }
}
