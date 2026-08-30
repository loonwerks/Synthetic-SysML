package vehicle_controller_operating_mode_coordinator

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
  // import vehicle_controller_operating_mode_coordinator.Vehicle_Controller_Operating_Mode_Coordinator.{LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_SystemTestAPI => nickname}
  // import vehicle_controller_operating_mode_coordinator.Vehicle_Controller_Operating_Mode_Coordinator.{MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_SystemTestAPI => nickname}
  // import vehicle_controller_operating_mode_coordinator.Vehicle_Controller_Operating_Mode_Coordinator.{DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_SystemTestAPI => nickname}
  // import vehicle_controller_operating_mode_coordinator.Vehicle_Controller_Operating_Mode_Coordinator.{ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_SystemTestAPI => nickname}
  // import vehicle_controller_operating_mode_coordinator.Vehicle_Controller_Operating_Mode_Coordinator.{ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_SystemTestAPI => nickname}
  // import vehicle_controller_operating_mode_coordinator.Vehicle_Controller_Operating_Mode_Coordinator.{IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_SystemTestAPI => nickname}
  // import vehicle_controller_operating_mode_coordinator.Vehicle_Controller_Operating_Mode_Coordinator.{OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_SystemTestAPI => nickname}
  // import vehicle_controller_operating_mode_coordinator.Vehicle_Controller_Operating_Mode_Coordinator.{MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_SystemTestAPI => nickname}
  // import vehicle_controller_operating_mode_coordinator.Vehicle_Controller_Operating_Mode_Coordinator.{DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_SystemTestAPI => nickname}
  // import vehicle_controller_operating_mode_coordinator.Vehicle_Controller_Operating_Mode_Coordinator.{RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_SystemTestAPI => nickname}
  // import vehicle_controller_operating_mode_coordinator.Vehicle_Controller_Operating_Mode_Coordinator.{ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_SystemTestAPI => nickname}
  // import vehicle_controller_operating_mode_coordinator.Vehicle_Controller_Operating_Mode_Coordinator.{ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_SystemTestAPI => nickname}
  // import vehicle_controller_operating_mode_coordinator.Vehicle_Controller_Operating_Mode_Coordinator.{OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_SystemTestAPI => nickname}

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
