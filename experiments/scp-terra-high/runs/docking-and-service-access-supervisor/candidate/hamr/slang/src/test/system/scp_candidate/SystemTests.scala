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
  // import scp_candidate.Docking_Access_Supervisor.{RequestClassification_supervisor_process_request_classification_SystemTestAPI => nickname}
  // import scp_candidate.Docking_Access_Supervisor.{VesselStatusAssessment_supervisor_process_vessel_status_assessment_SystemTestAPI => nickname}
  // import scp_candidate.Docking_Access_Supervisor.{StationReportAssessment_supervisor_process_station_report_assessment_SystemTestAPI => nickname}
  // import scp_candidate.Docking_Access_Supervisor.{ServiceActivityAssessment_supervisor_process_service_activity_assessment_SystemTestAPI => nickname}
  // import scp_candidate.Docking_Access_Supervisor.{RequestAdmission_supervisor_process_request_admission_SystemTestAPI => nickname}
  // import scp_candidate.Docking_Access_Supervisor.{AccessCoherence_supervisor_process_access_coherence_SystemTestAPI => nickname}
  // import scp_candidate.Docking_Access_Supervisor.{DockingLifecycle_supervisor_process_docking_lifecycle_SystemTestAPI => nickname}
  // import scp_candidate.Docking_Access_Supervisor.{BerthCommitment_supervisor_process_berth_commitment_SystemTestAPI => nickname}
  // import scp_candidate.Docking_Access_Supervisor.{ServiceAccessGate_supervisor_process_service_access_gate_SystemTestAPI => nickname}
  // import scp_candidate.Docking_Access_Supervisor.{RecoverySupervisor_supervisor_process_recovery_supervisor_SystemTestAPI => nickname}
  // import scp_candidate.Docking_Access_Supervisor.{DockingActionEligibility_supervisor_process_docking_action_eligibility_SystemTestAPI => nickname}
  // import scp_candidate.Docking_Access_Supervisor.{AccessActionEligibility_supervisor_process_access_action_eligibility_SystemTestAPI => nickname}
  // import scp_candidate.Docking_Access_Supervisor.{UndockingActionEligibility_supervisor_process_undocking_action_eligibility_SystemTestAPI => nickname}
  // import scp_candidate.Docking_Access_Supervisor.{DockingActionArbitration_supervisor_process_docking_action_arbitration_SystemTestAPI => nickname}
  // import scp_candidate.Docking_Access_Supervisor.{ResultComposition_supervisor_process_result_composition_SystemTestAPI => nickname}

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
