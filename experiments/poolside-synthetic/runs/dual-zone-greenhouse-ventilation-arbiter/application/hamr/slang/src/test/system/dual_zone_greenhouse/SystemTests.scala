package dual_zone_greenhouse

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
  // import dual_zone_greenhouse.Dual_Zone_Greenhouse.{Zone_A_Sensor_Intake_i_control_process_zone_a_sensor_intake_SystemTestAPI => nickname}
  // import dual_zone_greenhouse.Dual_Zone_Greenhouse.{Zone_B_Sensor_Intake_i_control_process_zone_b_sensor_intake_SystemTestAPI => nickname}
  // import dual_zone_greenhouse.Dual_Zone_Greenhouse.{Operator_Configuration_Intake_i_control_process_operator_configuration_intake_SystemTestAPI => nickname}
  // import dual_zone_greenhouse.Dual_Zone_Greenhouse.{Zone_A_Local_Decision_i_control_process_zone_a_local_decision_SystemTestAPI => nickname}
  // import dual_zone_greenhouse.Dual_Zone_Greenhouse.{Zone_B_Local_Decision_i_control_process_zone_b_local_decision_SystemTestAPI => nickname}
  // import dual_zone_greenhouse.Dual_Zone_Greenhouse.{Shared_Capacity_Arbiter_i_control_process_shared_capacity_arbiter_SystemTestAPI => nickname}
  // import dual_zone_greenhouse.Dual_Zone_Greenhouse.{Boundary_Output_Delivery_i_control_process_boundary_output_delivery_SystemTestAPI => nickname}

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
