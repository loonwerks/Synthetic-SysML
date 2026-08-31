package observation_acquisition_radio_delivery_coordinator

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
  // import observation_acquisition_radio_delivery_coordinator.Observation_Acquisition_Radio_Delivery_Coordinator.{BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_SystemTestAPI => nickname}
  // import observation_acquisition_radio_delivery_coordinator.Observation_Acquisition_Radio_Delivery_Coordinator.{SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_SystemTestAPI => nickname}
  // import observation_acquisition_radio_delivery_coordinator.Observation_Acquisition_Radio_Delivery_Coordinator.{CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_SystemTestAPI => nickname}
  // import observation_acquisition_radio_delivery_coordinator.Observation_Acquisition_Radio_Delivery_Coordinator.{RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_SystemTestAPI => nickname}
  // import observation_acquisition_radio_delivery_coordinator.Observation_Acquisition_Radio_Delivery_Coordinator.{SessionProposalOwner_coordinatorProcess_sessionProposalOwner_SystemTestAPI => nickname}
  // import observation_acquisition_radio_delivery_coordinator.Observation_Acquisition_Radio_Delivery_Coordinator.{ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_SystemTestAPI => nickname}
  // import observation_acquisition_radio_delivery_coordinator.Observation_Acquisition_Radio_Delivery_Coordinator.{ObservationSessionController_coordinatorProcess_observationSessionController_SystemTestAPI => nickname}
  // import observation_acquisition_radio_delivery_coordinator.Observation_Acquisition_Radio_Delivery_Coordinator.{CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_SystemTestAPI => nickname}

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
