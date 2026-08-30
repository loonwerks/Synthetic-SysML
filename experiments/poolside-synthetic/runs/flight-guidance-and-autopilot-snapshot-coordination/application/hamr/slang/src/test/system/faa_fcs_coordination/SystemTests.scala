package faa_fcs_coordination

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
  // import faa_fcs_coordination.FAA_FCS_Coordination.{FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_SystemTestAPI => nickname}
  // import faa_fcs_coordination.FAA_FCS_Coordination.{Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_SystemTestAPI => nickname}
  // import faa_fcs_coordination.FAA_FCS_Coordination.{Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_SystemTestAPI => nickname}
  // import faa_fcs_coordination.FAA_FCS_Coordination.{AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_SystemTestAPI => nickname}
  // import faa_fcs_coordination.FAA_FCS_Coordination.{Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_SystemTestAPI => nickname}
  // import faa_fcs_coordination.FAA_FCS_Coordination.{Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_SystemTestAPI => nickname}
  // import faa_fcs_coordination.FAA_FCS_Coordination.{FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_SystemTestAPI => nickname}

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
