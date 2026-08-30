package scp_candidate

import org.sireum._
import art.Art
import art.scheduling.static._

// This file will not be overwritten if HAMR codegen is rerun

class SystemTests extends SystemTestSuite {

  // note: this is overriding SystemTestSuite's 'def scheduler: Scheduler'
  //       abstract method
  var scheduler: StaticScheduler = Schedulers.getStaticSchedulerH(MNone())

  def compute(isz: ISZ[Command]): Unit = {
    scheduler = scheduler(commandProvider = ISZCommandProvider(isz :+ Stop()))

    Art.computePhase(scheduler)
  }

  override def beforeEach(): Unit = {
    // uncomment the following to disable the various guis
    //System.setProperty("java.awt.headless", "true")

    // uncomment the following to suppress (or potentially redirect) ART's log stream
    //art.ArtNative_Ext.logStream = new java.io.PrintStream(new java.io.OutputStream {
    //  override def write(b: Int): Unit = {}
    //})

    // uncomment the following to suppress (or potentially redirect) the static scheduler's log stream
    //art.scheduling.static.StaticSchedulerIO_Ext.logStream = new java.io.PrintStream(new java.io.OutputStream {
    //  override def write(b: Int): Unit = {}
    //})

    super.beforeEach()
  }

  // Suggestion: add the following import renamings of the components' SystemTestAPIs,
  //             replacing nickname with shortened versions that are easier to reference
  // import scp_candidate.Mining_Threat_Retreat_Supervision.{Threat_Observation_supervisor_process_threat_observation_SystemTestAPI => nickname}
  // import scp_candidate.Mining_Threat_Retreat_Supervision.{Intent_Acquisition_supervisor_process_intent_acquisition_SystemTestAPI => nickname}
  // import scp_candidate.Mining_Threat_Retreat_Supervision.{Resource_Observation_supervisor_process_resource_observation_SystemTestAPI => nickname}
  // import scp_candidate.Mining_Threat_Retreat_Supervision.{Availability_Observation_supervisor_process_availability_observation_SystemTestAPI => nickname}
  // import scp_candidate.Mining_Threat_Retreat_Supervision.{Outcome_Observation_supervisor_process_outcome_observation_SystemTestAPI => nickname}
  // import scp_candidate.Mining_Threat_Retreat_Supervision.{Threat_Qualification_supervisor_process_threat_qualification_SystemTestAPI => nickname}
  // import scp_candidate.Mining_Threat_Retreat_Supervision.{Readiness_Assessment_supervisor_process_readiness_assessment_SystemTestAPI => nickname}
  // import scp_candidate.Mining_Threat_Retreat_Supervision.{Recovery_Control_supervisor_process_recovery_control_SystemTestAPI => nickname}
  // import scp_candidate.Mining_Threat_Retreat_Supervision.{Mining_Eligibility_supervisor_process_mining_eligibility_SystemTestAPI => nickname}
  // import scp_candidate.Mining_Threat_Retreat_Supervision.{Defense_Eligibility_supervisor_process_defense_eligibility_SystemTestAPI => nickname}
  // import scp_candidate.Mining_Threat_Retreat_Supervision.{Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_SystemTestAPI => nickname}
  // import scp_candidate.Mining_Threat_Retreat_Supervision.{Priority_Arbitration_supervisor_process_priority_arbitration_SystemTestAPI => nickname}
  // import scp_candidate.Mining_Threat_Retreat_Supervision.{Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_SystemTestAPI => nickname}

  test("Example system test") {
    // run the initialization phase
    Art.initializePhase(scheduler)

    // run components' compute entrypoints through one hyper-period
    compute(ISZ(Hstep(1)))

    // use the component SystemTestAPIs' put methods to change the prestate values for components
    // TODO

    // run another hyper-period
    compute(ISZ(Hstep(1)))

    // use the component SystemTestAPIs' check or get methods to check the poststate values for components
    // TODO
  }
}
