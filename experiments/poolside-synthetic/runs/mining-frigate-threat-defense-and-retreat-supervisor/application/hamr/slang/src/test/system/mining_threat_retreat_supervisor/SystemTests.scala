package mining_threat_retreat_supervisor

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
  // import mining_threat_retreat_supervisor.Mining_Threat_Retreat_Supervisor.{Threat_Qualification_supervisor_process_threat_qualification_SystemTestAPI => nickname}
  // import mining_threat_retreat_supervisor.Mining_Threat_Retreat_Supervisor.{Resource_Qualification_supervisor_process_resource_qualification_SystemTestAPI => nickname}
  // import mining_threat_retreat_supervisor.Mining_Threat_Retreat_Supervisor.{Request_Availability_Qualification_supervisor_process_request_availability_qualification_SystemTestAPI => nickname}
  // import mining_threat_retreat_supervisor.Mining_Threat_Retreat_Supervisor.{Principal_Decision_Owner_supervisor_process_principal_decision_owner_SystemTestAPI => nickname}
  // import mining_threat_retreat_supervisor.Mining_Threat_Retreat_Supervisor.{Mining_Command_Delivery_supervisor_process_mining_command_delivery_SystemTestAPI => nickname}
  // import mining_threat_retreat_supervisor.Mining_Threat_Retreat_Supervisor.{Defense_Command_Delivery_supervisor_process_defense_command_delivery_SystemTestAPI => nickname}
  // import mining_threat_retreat_supervisor.Mining_Threat_Retreat_Supervisor.{Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_SystemTestAPI => nickname}

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
