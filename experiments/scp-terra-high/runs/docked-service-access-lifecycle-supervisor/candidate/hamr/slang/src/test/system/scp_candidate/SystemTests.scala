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
  // import scp_candidate.Docked_Service_Access_Lifecycle_Supervisor.{IntentQualifier_supervisorProcess_intentQualifier_SystemTestAPI => nickname}
  // import scp_candidate.Docked_Service_Access_Lifecycle_Supervisor.{DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_SystemTestAPI => nickname}
  // import scp_candidate.Docked_Service_Access_Lifecycle_Supervisor.{ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_SystemTestAPI => nickname}
  // import scp_candidate.Docked_Service_Access_Lifecycle_Supervisor.{LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_SystemTestAPI => nickname}
  // import scp_candidate.Docked_Service_Access_Lifecycle_Supervisor.{PriorityArbiter_supervisorProcess_priorityArbiter_SystemTestAPI => nickname}
  // import scp_candidate.Docked_Service_Access_Lifecycle_Supervisor.{LifecycleController_supervisorProcess_lifecycleController_SystemTestAPI => nickname}
  // import scp_candidate.Docked_Service_Access_Lifecycle_Supervisor.{MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_SystemTestAPI => nickname}
  // import scp_candidate.Docked_Service_Access_Lifecycle_Supervisor.{LifecycleReporter_supervisorProcess_lifecycleReporter_SystemTestAPI => nickname}

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
