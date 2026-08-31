package drone_battery_charge_supervisor

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
  // import drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.{Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_SystemTestAPI => nickname}
  // import drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.{Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_SystemTestAPI => nickname}
  // import drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.{Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_SystemTestAPI => nickname}
  // import drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.{Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_SystemTestAPI => nickname}
  // import drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.{Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_SystemTestAPI => nickname}
  // import drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor.{Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_SystemTestAPI => nickname}

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
