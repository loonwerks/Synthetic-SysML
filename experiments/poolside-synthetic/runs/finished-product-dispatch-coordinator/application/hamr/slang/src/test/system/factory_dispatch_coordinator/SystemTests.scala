package factory_dispatch_coordinator

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
  // import factory_dispatch_coordinator.Factory_Dispatch_Coordinator.{Request_Qualifier_dispatch_coordinator_process_request_qualifier_SystemTestAPI => nickname}
  // import factory_dispatch_coordinator.Factory_Dispatch_Coordinator.{Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_SystemTestAPI => nickname}
  // import factory_dispatch_coordinator.Factory_Dispatch_Coordinator.{Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_SystemTestAPI => nickname}
  // import factory_dispatch_coordinator.Factory_Dispatch_Coordinator.{Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier_SystemTestAPI => nickname}
  // import factory_dispatch_coordinator.Factory_Dispatch_Coordinator.{Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver_SystemTestAPI => nickname}
  // import factory_dispatch_coordinator.Factory_Dispatch_Coordinator.{Release_Arbiter_dispatch_coordinator_process_release_arbiter_SystemTestAPI => nickname}
  // import factory_dispatch_coordinator.Factory_Dispatch_Coordinator.{Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_SystemTestAPI => nickname}
  // import factory_dispatch_coordinator.Factory_Dispatch_Coordinator.{Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_SystemTestAPI => nickname}
  // import factory_dispatch_coordinator.Factory_Dispatch_Coordinator.{Status_Determiner_dispatch_coordinator_process_status_determiner_SystemTestAPI => nickname}

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
