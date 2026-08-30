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
  // import scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.{BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_SystemTestAPI => nickname}
  // import scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.{ChargeContextQualifier_supervisorProcess_chargeContextQualifier_SystemTestAPI => nickname}
  // import scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.{ChargerPathQualifier_supervisorProcess_chargerPathQualifier_SystemTestAPI => nickname}
  // import scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.{ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_SystemTestAPI => nickname}
  // import scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.{ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_SystemTestAPI => nickname}
  // import scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.{ChargeSessionController_supervisorProcess_chargeSessionController_SystemTestAPI => nickname}
  // import scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.{FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_SystemTestAPI => nickname}
  // import scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor.{PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_SystemTestAPI => nickname}

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
