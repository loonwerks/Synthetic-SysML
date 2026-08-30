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
  // import scp_candidate.Mining_Cargo_Transfer_Evidence_Coordinator.{RequestAcquisition_cargo_coordination_process_request_acquisition_SystemTestAPI => nickname}
  // import scp_candidate.Mining_Cargo_Transfer_Evidence_Coordinator.{DockContextAssessment_cargo_coordination_process_dock_context_assessment_SystemTestAPI => nickname}
  // import scp_candidate.Mining_Cargo_Transfer_Evidence_Coordinator.{ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_SystemTestAPI => nickname}
  // import scp_candidate.Mining_Cargo_Transfer_Evidence_Coordinator.{WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_SystemTestAPI => nickname}
  // import scp_candidate.Mining_Cargo_Transfer_Evidence_Coordinator.{RequestAdmission_cargo_coordination_process_request_admission_SystemTestAPI => nickname}
  // import scp_candidate.Mining_Cargo_Transfer_Evidence_Coordinator.{EvidenceCoherence_cargo_coordination_process_evidence_coherence_SystemTestAPI => nickname}
  // import scp_candidate.Mining_Cargo_Transfer_Evidence_Coordinator.{TransferSession_cargo_coordination_process_transfer_session_SystemTestAPI => nickname}
  // import scp_candidate.Mining_Cargo_Transfer_Evidence_Coordinator.{ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_SystemTestAPI => nickname}
  // import scp_candidate.Mining_Cargo_Transfer_Evidence_Coordinator.{WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_SystemTestAPI => nickname}
  // import scp_candidate.Mining_Cargo_Transfer_Evidence_Coordinator.{RecoverySupervisor_cargo_coordination_process_recovery_supervisor_SystemTestAPI => nickname}
  // import scp_candidate.Mining_Cargo_Transfer_Evidence_Coordinator.{RequestActionEligibility_cargo_coordination_process_request_action_eligibility_SystemTestAPI => nickname}
  // import scp_candidate.Mining_Cargo_Transfer_Evidence_Coordinator.{ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_SystemTestAPI => nickname}
  // import scp_candidate.Mining_Cargo_Transfer_Evidence_Coordinator.{WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_SystemTestAPI => nickname}
  // import scp_candidate.Mining_Cargo_Transfer_Evidence_Coordinator.{TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_SystemTestAPI => nickname}
  // import scp_candidate.Mining_Cargo_Transfer_Evidence_Coordinator.{ResultComposition_cargo_coordination_process_result_composition_SystemTestAPI => nickname}

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
