// #Sireum

package scp_candidate.Protected_Start_Power_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner {
  var selfTestMemory: Protected_Start_Power_Supervisor.SelfTestState.Type = Protected_Start_Power_Supervisor.SelfTestState.Untested

  def initialise(api: SelfTestCampaignStateOwner_Initialization_Api): Unit = {
    Contract(Modifies(api, selfTestMemory))
    selfTestMemory = Protected_Start_Power_Supervisor.SelfTestState.Untested
    api.put_self_test_state_facts(Protected_Start_Power_Supervisor.SelfTestStateFacts(selfTestMemory, F))
    api.put_self_test_fault(F)
  }

  def timeTriggered(api: SelfTestCampaignStateOwner_Operational_Api): Unit = {
    Contract(Modifies(api, selfTestMemory))
    (api.get_self_test_report(), api.get_qualified_command_facts()) match {
      case (Some(report), Some(command)) =>
        val failed = report.status == Protected_Start_Power_Supervisor.Validity.Invalid ||
          report.progress == Protected_Start_Power_Supervisor.SelfTestProgress.Failed
        if (failed) {
          selfTestMemory = Protected_Start_Power_Supervisor.SelfTestState.Failed
        } else if (command.selfTestResetRequested) {
          selfTestMemory = Protected_Start_Power_Supervisor.SelfTestState.Untested
        } else if (selfTestMemory == Protected_Start_Power_Supervisor.SelfTestState.Untested &&
          command.command == Protected_Start_Power_Supervisor.Command.Start &&
          report.progress == Protected_Start_Power_Supervisor.SelfTestProgress.Running) {
          selfTestMemory = Protected_Start_Power_Supervisor.SelfTestState.Testing
        } else if ((selfTestMemory == Protected_Start_Power_Supervisor.SelfTestState.Untested ||
          selfTestMemory == Protected_Start_Power_Supervisor.SelfTestState.Testing) &&
          command.command == Protected_Start_Power_Supervisor.Command.Start &&
          report.progress == Protected_Start_Power_Supervisor.SelfTestProgress.Passed) {
          selfTestMemory = Protected_Start_Power_Supervisor.SelfTestState.Passed
        }
        api.put_self_test_state_facts(Protected_Start_Power_Supervisor.SelfTestStateFacts(
          selfTestMemory, selfTestMemory == Protected_Start_Power_Supervisor.SelfTestState.Passed))
        api.put_self_test_fault(selfTestMemory == Protected_Start_Power_Supervisor.SelfTestState.Failed)
    }
  }

  def finalise(api: SelfTestCampaignStateOwner_Operational_Api): Unit = { }
}
