// #Sireum

package protected_start_power_supervisor.Protected_Start_Power_Supervisor

import org.sireum._
import protected_start_power_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner {

  // BEGIN STATE VARS
  var selfTestMemory: Protected_Start_Power_Supervisor.SelfTestState.Type = Protected_Start_Power_Supervisor.SelfTestState.Untested
  // END STATE VARS

  def initialise(api: SelfTestCampaignStateOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_self_test_state_facts(Protected_Start_Power_Supervisor.SelfTestStateFacts.example())
    api.put_self_test_fault(Base_Types.Boolean_example())
  }

  def timeTriggered(api: SelfTestCampaignStateOwner_Operational_Api): Unit = {
    Contract(
      Modifies(
        // BEGIN COMPUTE MODIFIES timeTriggered
        selfTestMemory
        // END COMPUTE MODIFIES timeTriggered
      ),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee SELF_TEST_OUTPUT_COHERENCE
        //   selfTestState tracks selfTestMemory and selfTestPassed iff selfTestMemory is Passed
        api.self_test_state_facts.selfTestState == selfTestMemory &
          api.self_test_state_facts.selfTestPassed == (selfTestMemory == SelfTestState.Passed),
        // case SELF_TEST_FAILURE_DOMINATES
        //   Invalid report or Failed progress forces Failed memory and fault
        (api.self_test_report.status == Validity.Invalid |
          api.self_test_report.status == Validity.Valid &
            api.self_test_report.progress == SelfTestProgress.Failed) ___>: (selfTestMemory == SelfTestState.Failed &
          api.self_test_state_facts.selfTestPassed == F &
          api.self_test_fault == T),
        // case SELF_TEST_VALID_RESET
        //   Valid non-failed report with reset requested returns to Untested
        (api.self_test_report.status == Validity.Valid &
          api.self_test_report.progress != SelfTestProgress.Failed &
          api.qualified_command_facts.selfTestResetRequested == T) ___>: (selfTestMemory == SelfTestState.Untested &
          api.self_test_state_facts.selfTestPassed == F &
          api.self_test_fault == F),
        // case SELF_TEST_START_RUNNING
        //   Valid non-failed report, reset not requested, Start, Running from Untested enters Testing
        (api.self_test_report.status == Validity.Valid &
          api.self_test_report.progress != SelfTestProgress.Failed &
          api.qualified_command_facts.selfTestResetRequested == F &
          In(selfTestMemory) == SelfTestState.Untested &
          api.qualified_command_facts.command == Command.Start &
          api.self_test_report.progress == SelfTestProgress.Running) ___>: (selfTestMemory == SelfTestState.Testing &
          api.self_test_state_facts.selfTestPassed == F &
          api.self_test_fault == F),
        // case SELF_TEST_FRESH_START_PASS
        //   Valid non-failed report, reset not requested, Start, Passed from Untested enters Passed
        (api.self_test_report.status == Validity.Valid &
          api.self_test_report.progress != SelfTestProgress.Failed &
          api.qualified_command_facts.selfTestResetRequested == F &
          In(selfTestMemory) == SelfTestState.Untested &
          api.qualified_command_facts.command == Command.Start &
          api.self_test_report.progress == SelfTestProgress.Passed) ___>: (selfTestMemory == SelfTestState.Passed &
          api.self_test_state_facts.selfTestPassed == T &
          api.self_test_fault == F),
        // case SELF_TEST_RUNNING_TO_PASS
        //   Valid non-failed report, reset not requested, Passed from Testing enters Passed
        (api.self_test_report.status == Validity.Valid &
          api.self_test_report.progress != SelfTestProgress.Failed &
          api.qualified_command_facts.selfTestResetRequested == F &
          In(selfTestMemory) == SelfTestState.Testing &
          api.self_test_report.progress == SelfTestProgress.Passed) ___>: (selfTestMemory == SelfTestState.Passed &
          api.self_test_state_facts.selfTestPassed == T &
          api.self_test_fault == F),
        // case SELF_TEST_PASS_RETENTION
        //   Valid non-failed report, reset not requested, Passed retained
        (api.self_test_report.status == Validity.Valid &
          api.self_test_report.progress != SelfTestProgress.Failed &
          api.qualified_command_facts.selfTestResetRequested == F &
          In(selfTestMemory) == SelfTestState.Passed) ___>: (selfTestMemory == SelfTestState.Passed &
          api.self_test_state_facts.selfTestPassed == T &
          api.self_test_fault == F),
        // case SELF_TEST_OTHER_RETENTION
        //   Valid non-failed report, reset not requested, retains memory otherwise
        (api.self_test_report.status == Validity.Valid &
          api.self_test_report.progress != SelfTestProgress.Failed &
          api.qualified_command_facts.selfTestResetRequested == F &
          (In(selfTestMemory) == SelfTestState.Untested &
            (api.qualified_command_facts.command != Command.Start |
              api.self_test_report.progress != SelfTestProgress.Running &
                api.self_test_report.progress != SelfTestProgress.Passed) |
            In(selfTestMemory) == SelfTestState.Testing &
              api.self_test_report.progress != SelfTestProgress.Passed |
            In(selfTestMemory) == SelfTestState.Failed)) ___>: (selfTestMemory == In(selfTestMemory) &
          api.self_test_state_facts.selfTestPassed == F &
          api.self_test_fault == (In(selfTestMemory) == SelfTestState.Failed))
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_self_test_report: Option[Protected_Start_Power_Supervisor.SelfTestReport] = api.get_self_test_report()
    api.logInfo(s"Received on data port self_test_report: ${apiUsage_self_test_report}")
    val apiUsage_qualified_command_facts: Option[Protected_Start_Power_Supervisor.QualifiedCommandFacts] = api.get_qualified_command_facts()
    api.logInfo(s"Received on data port qualified_command_facts: ${apiUsage_qualified_command_facts}")
  }

  def finalise(api: SelfTestCampaignStateOwner_Operational_Api): Unit = { }
}
