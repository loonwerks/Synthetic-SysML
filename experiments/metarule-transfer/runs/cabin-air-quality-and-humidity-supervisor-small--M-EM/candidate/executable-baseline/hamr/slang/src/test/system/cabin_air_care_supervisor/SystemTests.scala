package cabin_air_care_supervisor

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
  // import cabin_air_care_supervisor.Cabin_Air_Care_Supervisor.{PreferenceInterpreter_airCareSupervisionProcess_preferenceInterpreter_SystemTestAPI => nickname}
  // import cabin_air_care_supervisor.Cabin_Air_Care_Supervisor.{AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_SystemTestAPI => nickname}
  // import cabin_air_care_supervisor.Cabin_Air_Care_Supervisor.{HumidityAssessor_airCareSupervisionProcess_humidityAssessor_SystemTestAPI => nickname}
  // import cabin_air_care_supervisor.Cabin_Air_Care_Supervisor.{ObservationConfidenceGuardian_airCareSupervisionProcess_observationConfidenceGuardian_SystemTestAPI => nickname}
  // import cabin_air_care_supervisor.Cabin_Air_Care_Supervisor.{AirCarePolicySupervisor_airCareSupervisionProcess_airCarePolicySupervisor_SystemTestAPI => nickname}

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
