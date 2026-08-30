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
  // import scp_candidate.Factory_Dispatch_Coordinator.{CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_SystemTestAPI => nickname}
  // import scp_candidate.Factory_Dispatch_Coordinator.{InventoryAcquisition_coordinator_process_inventory_acquisition_SystemTestAPI => nickname}
  // import scp_candidate.Factory_Dispatch_Coordinator.{CapabilityAcquisition_coordinator_process_capability_acquisition_SystemTestAPI => nickname}
  // import scp_candidate.Factory_Dispatch_Coordinator.{ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_SystemTestAPI => nickname}
  // import scp_candidate.Factory_Dispatch_Coordinator.{RequestQualification_coordinator_process_request_qualification_SystemTestAPI => nickname}
  // import scp_candidate.Factory_Dispatch_Coordinator.{StockAssessment_coordinator_process_stock_assessment_SystemTestAPI => nickname}
  // import scp_candidate.Factory_Dispatch_Coordinator.{OutcomeQualification_coordinator_process_outcome_qualification_SystemTestAPI => nickname}
  // import scp_candidate.Factory_Dispatch_Coordinator.{RecoveryControl_coordinator_process_recovery_control_SystemTestAPI => nickname}
  // import scp_candidate.Factory_Dispatch_Coordinator.{OrderLifecycle_coordinator_process_order_lifecycle_SystemTestAPI => nickname}
  // import scp_candidate.Factory_Dispatch_Coordinator.{QuotationEligibility_coordinator_process_quotation_eligibility_SystemTestAPI => nickname}
  // import scp_candidate.Factory_Dispatch_Coordinator.{ProcurementEligibility_coordinator_process_procurement_eligibility_SystemTestAPI => nickname}
  // import scp_candidate.Factory_Dispatch_Coordinator.{ProductionEligibility_coordinator_process_production_eligibility_SystemTestAPI => nickname}
  // import scp_candidate.Factory_Dispatch_Coordinator.{DispatchEligibility_coordinator_process_dispatch_eligibility_SystemTestAPI => nickname}
  // import scp_candidate.Factory_Dispatch_Coordinator.{ActionArbitration_coordinator_process_action_arbitration_SystemTestAPI => nickname}
  // import scp_candidate.Factory_Dispatch_Coordinator.{StatusDerivation_coordinator_process_status_derivation_SystemTestAPI => nickname}
  // import scp_candidate.Factory_Dispatch_Coordinator.{PublicComposition_coordinator_process_public_composition_SystemTestAPI => nickname}

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
