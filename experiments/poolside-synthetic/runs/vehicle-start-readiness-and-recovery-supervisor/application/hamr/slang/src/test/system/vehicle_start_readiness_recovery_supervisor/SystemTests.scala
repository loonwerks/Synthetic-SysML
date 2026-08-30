package vehicle_start_readiness_recovery_supervisor

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
  // import vehicle_start_readiness_recovery_supervisor.Vehicle_Start_Readiness_Recovery_Supervisor.{RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_SystemTestAPI => nickname}
  // import vehicle_start_readiness_recovery_supervisor.Vehicle_Start_Readiness_Recovery_Supervisor.{BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_SystemTestAPI => nickname}
  // import vehicle_start_readiness_recovery_supervisor.Vehicle_Start_Readiness_Recovery_Supervisor.{HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_SystemTestAPI => nickname}
  // import vehicle_start_readiness_recovery_supervisor.Vehicle_Start_Readiness_Recovery_Supervisor.{PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_SystemTestAPI => nickname}
  // import vehicle_start_readiness_recovery_supervisor.Vehicle_Start_Readiness_Recovery_Supervisor.{SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_SystemTestAPI => nickname}
  // import vehicle_start_readiness_recovery_supervisor.Vehicle_Start_Readiness_Recovery_Supervisor.{StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_SystemTestAPI => nickname}
  // import vehicle_start_readiness_recovery_supervisor.Vehicle_Start_Readiness_Recovery_Supervisor.{LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_SystemTestAPI => nickname}
  // import vehicle_start_readiness_recovery_supervisor.Vehicle_Start_Readiness_Recovery_Supervisor.{CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_SystemTestAPI => nickname}

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
