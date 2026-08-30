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
  // import scp_candidate.EIT_Acquisition_Supervisor.{DoctorRequestQualification_acquisition_process_doctor_request_qualification_SystemTestAPI => nickname}
  // import scp_candidate.EIT_Acquisition_Supervisor.{PreparationAssessment_acquisition_process_preparation_assessment_SystemTestAPI => nickname}
  // import scp_candidate.EIT_Acquisition_Supervisor.{EquipmentAssessment_acquisition_process_equipment_assessment_SystemTestAPI => nickname}
  // import scp_candidate.EIT_Acquisition_Supervisor.{BatchAssessment_acquisition_process_batch_assessment_SystemTestAPI => nickname}
  // import scp_candidate.EIT_Acquisition_Supervisor.{ImageResultAssessment_acquisition_process_image_result_assessment_SystemTestAPI => nickname}
  // import scp_candidate.EIT_Acquisition_Supervisor.{FaultComposition_acquisition_process_fault_composition_SystemTestAPI => nickname}
  // import scp_candidate.EIT_Acquisition_Supervisor.{SessionControl_acquisition_process_session_control_SystemTestAPI => nickname}
  // import scp_candidate.EIT_Acquisition_Supervisor.{AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_SystemTestAPI => nickname}
  // import scp_candidate.EIT_Acquisition_Supervisor.{ImageAvailabilityControl_acquisition_process_image_availability_control_SystemTestAPI => nickname}
  // import scp_candidate.EIT_Acquisition_Supervisor.{RecoveryControl_acquisition_process_recovery_control_SystemTestAPI => nickname}
  // import scp_candidate.EIT_Acquisition_Supervisor.{StartFeasibilityOwner_acquisition_process_start_feasibility_SystemTestAPI => nickname}
  // import scp_candidate.EIT_Acquisition_Supervisor.{CollectionFeasibilityOwner_acquisition_process_collection_feasibility_SystemTestAPI => nickname}
  // import scp_candidate.EIT_Acquisition_Supervisor.{ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_SystemTestAPI => nickname}
  // import scp_candidate.EIT_Acquisition_Supervisor.{SupervisoryArbitration_acquisition_process_supervisory_arbitration_SystemTestAPI => nickname}
  // import scp_candidate.EIT_Acquisition_Supervisor.{PublicationComposition_acquisition_process_publication_composition_SystemTestAPI => nickname}

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
