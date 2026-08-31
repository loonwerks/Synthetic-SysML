package cabin_air_treatment_supervisor

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
  // import cabin_air_treatment_supervisor.Cabin_Air_Treatment_Supervisor.{AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_SystemTestAPI => nickname}
  // import cabin_air_treatment_supervisor.Cabin_Air_Treatment_Supervisor.{AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_SystemTestAPI => nickname}
  // import cabin_air_treatment_supervisor.Cabin_Air_Treatment_Supervisor.{HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_SystemTestAPI => nickname}
  // import cabin_air_treatment_supervisor.Cabin_Air_Treatment_Supervisor.{TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_SystemTestAPI => nickname}
  // import cabin_air_treatment_supervisor.Cabin_Air_Treatment_Supervisor.{FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_SystemTestAPI => nickname}
  // import cabin_air_treatment_supervisor.Cabin_Air_Treatment_Supervisor.{HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_SystemTestAPI => nickname}
  // import cabin_air_treatment_supervisor.Cabin_Air_Treatment_Supervisor.{ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_SystemTestAPI => nickname}
  // import cabin_air_treatment_supervisor.Cabin_Air_Treatment_Supervisor.{AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_SystemTestAPI => nickname}

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
