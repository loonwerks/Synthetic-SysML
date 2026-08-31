package navigation_obstacle_awareness_use_supervisor

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
  // import navigation_obstacle_awareness_use_supervisor.Navigation_Obstacle_Awareness_Use_Supervisor.{GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_SystemTestAPI => nickname}
  // import navigation_obstacle_awareness_use_supervisor.Navigation_Obstacle_Awareness_Use_Supervisor.{InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_SystemTestAPI => nickname}
  // import navigation_obstacle_awareness_use_supervisor.Navigation_Obstacle_Awareness_Use_Supervisor.{BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_SystemTestAPI => nickname}
  // import navigation_obstacle_awareness_use_supervisor.Navigation_Obstacle_Awareness_Use_Supervisor.{ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_SystemTestAPI => nickname}
  // import navigation_obstacle_awareness_use_supervisor.Navigation_Obstacle_Awareness_Use_Supervisor.{NavigationBasisOwner_supervisorProcess_navigationBasisOwner_SystemTestAPI => nickname}
  // import navigation_obstacle_awareness_use_supervisor.Navigation_Obstacle_Awareness_Use_Supervisor.{AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_SystemTestAPI => nickname}
  // import navigation_obstacle_awareness_use_supervisor.Navigation_Obstacle_Awareness_Use_Supervisor.{ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_SystemTestAPI => nickname}
  // import navigation_obstacle_awareness_use_supervisor.Navigation_Obstacle_Awareness_Use_Supervisor.{EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_SystemTestAPI => nickname}
  // import navigation_obstacle_awareness_use_supervisor.Navigation_Obstacle_Awareness_Use_Supervisor.{RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_SystemTestAPI => nickname}
  // import navigation_obstacle_awareness_use_supervisor.Navigation_Obstacle_Awareness_Use_Supervisor.{SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_SystemTestAPI => nickname}

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
