package power_propulsion_availability_supervisor

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
  // import power_propulsion_availability_supervisor.Power_Propulsion_Availability_Supervisor.{BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_SystemTestAPI => nickname}
  // import power_propulsion_availability_supervisor.Power_Propulsion_Availability_Supervisor.{BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_SystemTestAPI => nickname}
  // import power_propulsion_availability_supervisor.Power_Propulsion_Availability_Supervisor.{PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_SystemTestAPI => nickname}
  // import power_propulsion_availability_supervisor.Power_Propulsion_Availability_Supervisor.{OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_SystemTestAPI => nickname}
  // import power_propulsion_availability_supervisor.Power_Propulsion_Availability_Supervisor.{EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_SystemTestAPI => nickname}
  // import power_propulsion_availability_supervisor.Power_Propulsion_Availability_Supervisor.{FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_SystemTestAPI => nickname}
  // import power_propulsion_availability_supervisor.Power_Propulsion_Availability_Supervisor.{PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_SystemTestAPI => nickname}
  // import power_propulsion_availability_supervisor.Power_Propulsion_Availability_Supervisor.{ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_SystemTestAPI => nickname}
  // import power_propulsion_availability_supervisor.Power_Propulsion_Availability_Supervisor.{EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_SystemTestAPI => nickname}
  // import power_propulsion_availability_supervisor.Power_Propulsion_Availability_Supervisor.{FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_SystemTestAPI => nickname}
  // import power_propulsion_availability_supervisor.Power_Propulsion_Availability_Supervisor.{RecoveryQualificationOwner_supervisor_process_recovery_qualification_SystemTestAPI => nickname}
  // import power_propulsion_availability_supervisor.Power_Propulsion_Availability_Supervisor.{AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_SystemTestAPI => nickname}
  // import power_propulsion_availability_supervisor.Power_Propulsion_Availability_Supervisor.{PowerCommandInterlockOwner_supervisor_process_power_command_interlock_SystemTestAPI => nickname}

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
