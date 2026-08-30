package eit_image_availability_coordinator

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
  // import eit_image_availability_coordinator.EIT_Image_Availability_Coordinator.{ImageEventQualification_coordination_image_event_qualification_SystemTestAPI => nickname}
  // import eit_image_availability_coordinator.EIT_Image_Availability_Coordinator.{DoctorEventQualification_coordination_doctor_event_qualification_SystemTestAPI => nickname}
  // import eit_image_availability_coordinator.EIT_Image_Availability_Coordinator.{PreparationContextAssessment_coordination_preparation_context_assessment_SystemTestAPI => nickname}
  // import eit_image_availability_coordinator.EIT_Image_Availability_Coordinator.{AvailabilityServiceAssessment_coordination_availability_service_assessment_SystemTestAPI => nickname}
  // import eit_image_availability_coordinator.EIT_Image_Availability_Coordinator.{FaultComposition_coordination_fault_composition_SystemTestAPI => nickname}
  // import eit_image_availability_coordinator.EIT_Image_Availability_Coordinator.{RecoveryControl_coordination_recovery_control_SystemTestAPI => nickname}
  // import eit_image_availability_coordinator.EIT_Image_Availability_Coordinator.{EvidenceLifecycle_coordination_evidence_lifecycle_SystemTestAPI => nickname}
  // import eit_image_availability_coordinator.EIT_Image_Availability_Coordinator.{AdmissionDecisionOwner_coordination_admission_decision_SystemTestAPI => nickname}
  // import eit_image_availability_coordinator.EIT_Image_Availability_Coordinator.{ArtifactLifecycle_coordination_artifact_lifecycle_SystemTestAPI => nickname}
  // import eit_image_availability_coordinator.EIT_Image_Availability_Coordinator.{AvailabilityDecisionOwner_coordination_availability_decision_SystemTestAPI => nickname}
  // import eit_image_availability_coordinator.EIT_Image_Availability_Coordinator.{ReviewLifecycle_coordination_review_lifecycle_SystemTestAPI => nickname}
  // import eit_image_availability_coordinator.EIT_Image_Availability_Coordinator.{PresentationDecisionOwner_coordination_presentation_decision_SystemTestAPI => nickname}
  // import eit_image_availability_coordinator.EIT_Image_Availability_Coordinator.{AvailabilityArbitration_coordination_availability_arbitration_SystemTestAPI => nickname}
  // import eit_image_availability_coordinator.EIT_Image_Availability_Coordinator.{PublicationComposition_coordination_publication_composition_SystemTestAPI => nickname}

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
