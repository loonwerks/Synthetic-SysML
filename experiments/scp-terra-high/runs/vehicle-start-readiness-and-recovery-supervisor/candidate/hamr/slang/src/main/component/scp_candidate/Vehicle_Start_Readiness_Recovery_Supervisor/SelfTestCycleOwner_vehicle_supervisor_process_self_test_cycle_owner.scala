// #Sireum

package scp_candidate.Vehicle_Start_Readiness_Recovery_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner {

  // BEGIN STATE VARS
  var committedTestCycle: Vehicle_Start_Readiness_Recovery_Supervisor.CommittedTestCycle.Type = Vehicle_Start_Readiness_Recovery_Supervisor.CommittedTestCycle.Idle
  // END STATE VARS

  def initialise(api: SelfTestCycleOwner_Initialization_Api): Unit = {
    Contract(
      Modifies(committedTestCycle, api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee c9
        committedTestCycle == CommittedTestCycle.Idle &&
          api.cycle_assessment == CycleAssessment.Idle
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    committedTestCycle = CommittedTestCycle.Idle
    api.put_cycle_assessment(CycleAssessment.Idle)
  }

  def compute(api: SelfTestCycleOwner_Operational_Api): Unit = {
    Contract(Modifies(committedTestCycle, api))
    val observation = api.get_self_test_observation().getOrElse(SelfTestObservation.Invalid)
    val directive = api.get_test_cycle_directive().getOrElse(TestCycleDirective.Clear)
    var assessment: CycleAssessment.Type = CycleAssessment.Idle
    if (committedTestCycle == CommittedTestCycle.AwaitingStart) {
      if (observation == SelfTestObservation.FreshPass) {
        assessment = CycleAssessment.StartPassed
      } else if (observation == SelfTestObservation.FreshFail) {
        assessment = CycleAssessment.Failed
      } else if (observation == SelfTestObservation.Invalid) {
        assessment = CycleAssessment.Invalid
      } else {
        assessment = CycleAssessment.AwaitingStart
      }
    } else if (committedTestCycle == CommittedTestCycle.AwaitingRecovery) {
      if (observation == SelfTestObservation.FreshPass) {
        assessment = CycleAssessment.RecoveryPassed
      } else if (observation == SelfTestObservation.FreshFail) {
        assessment = CycleAssessment.Failed
      } else if (observation == SelfTestObservation.Invalid) {
        assessment = CycleAssessment.Invalid
      } else {
        assessment = CycleAssessment.AwaitingRecovery
      }
    } else if ((committedTestCycle == CommittedTestCycle.StartPassed ||
                committedTestCycle == CommittedTestCycle.RecoveryPassed) &&
               observation == SelfTestObservation.Invalid) {
      assessment = CycleAssessment.Invalid
    } else if (committedTestCycle == CommittedTestCycle.StartPassed) {
      assessment = CycleAssessment.StartPassed
    } else if (committedTestCycle == CommittedTestCycle.RecoveryPassed) {
      assessment = CycleAssessment.RecoveryPassed
    } else if (committedTestCycle == CommittedTestCycle.Failed) {
      assessment = CycleAssessment.Failed
    } else if (committedTestCycle == CommittedTestCycle.Invalid) {
      assessment = CycleAssessment.Invalid
    }
    if (directive == TestCycleDirective.Clear) {
      committedTestCycle = CommittedTestCycle.Idle
    } else if (directive == TestCycleDirective.BeginStart) {
      committedTestCycle = CommittedTestCycle.AwaitingStart
    } else if (directive == TestCycleDirective.BeginRecovery) {
      committedTestCycle = CommittedTestCycle.AwaitingRecovery
    } else if (assessment == CycleAssessment.AwaitingStart) {
      committedTestCycle = CommittedTestCycle.AwaitingStart
    } else if (assessment == CycleAssessment.AwaitingRecovery) {
      committedTestCycle = CommittedTestCycle.AwaitingRecovery
    } else if (assessment == CycleAssessment.StartPassed) {
      committedTestCycle = CommittedTestCycle.StartPassed
    } else if (assessment == CycleAssessment.RecoveryPassed) {
      committedTestCycle = CommittedTestCycle.RecoveryPassed
    } else if (assessment == CycleAssessment.Failed) {
      committedTestCycle = CommittedTestCycle.Failed
    } else if (assessment == CycleAssessment.Invalid) {
      committedTestCycle = CommittedTestCycle.Invalid
    } else {
      committedTestCycle = CommittedTestCycle.Idle
    }
    api.put_cycle_assessment(assessment)
  }

  def timeTriggered(api: SelfTestCycleOwner_Operational_Api): Unit = {
    Contract(Modifies(committedTestCycle, api))
    compute(api)
  }

  def finalise(api: SelfTestCycleOwner_Operational_Api): Unit = { }
}
