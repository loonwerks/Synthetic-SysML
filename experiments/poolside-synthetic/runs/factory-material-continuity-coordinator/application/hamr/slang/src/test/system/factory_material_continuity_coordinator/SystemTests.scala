package factory_material_continuity_coordinator

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
  // import factory_material_continuity_coordinator.Factory_Material_Continuity_Coordinator.{DemandAcquisition_material_continuity_process_demand_acquisition_SystemTestAPI => nickname}
  // import factory_material_continuity_coordinator.Factory_Material_Continuity_Coordinator.{InventoryAcquisition_material_continuity_process_inventory_acquisition_SystemTestAPI => nickname}
  // import factory_material_continuity_coordinator.Factory_Material_Continuity_Coordinator.{EventAcquisition_material_continuity_process_event_acquisition_SystemTestAPI => nickname}
  // import factory_material_continuity_coordinator.Factory_Material_Continuity_Coordinator.{DemandQualification_material_continuity_process_demand_qualification_SystemTestAPI => nickname}
  // import factory_material_continuity_coordinator.Factory_Material_Continuity_Coordinator.{MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_SystemTestAPI => nickname}
  // import factory_material_continuity_coordinator.Factory_Material_Continuity_Coordinator.{EventCoherence_material_continuity_process_event_coherence_SystemTestAPI => nickname}
  // import factory_material_continuity_coordinator.Factory_Material_Continuity_Coordinator.{DemandRegistry_material_continuity_process_demand_registry_SystemTestAPI => nickname}
  // import factory_material_continuity_coordinator.Factory_Material_Continuity_Coordinator.{SupplyLifecycle_material_continuity_process_supply_lifecycle_SystemTestAPI => nickname}
  // import factory_material_continuity_coordinator.Factory_Material_Continuity_Coordinator.{RecoverySupervisor_material_continuity_process_recovery_supervisor_SystemTestAPI => nickname}
  // import factory_material_continuity_coordinator.Factory_Material_Continuity_Coordinator.{UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_SystemTestAPI => nickname}
  // import factory_material_continuity_coordinator.Factory_Material_Continuity_Coordinator.{RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_SystemTestAPI => nickname}
  // import factory_material_continuity_coordinator.Factory_Material_Continuity_Coordinator.{ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_SystemTestAPI => nickname}
  // import factory_material_continuity_coordinator.Factory_Material_Continuity_Coordinator.{MaterialActionArbitration_material_continuity_process_material_action_arbitration_SystemTestAPI => nickname}
  // import factory_material_continuity_coordinator.Factory_Material_Continuity_Coordinator.{ResultComposition_material_continuity_process_result_composition_SystemTestAPI => nickname}

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
