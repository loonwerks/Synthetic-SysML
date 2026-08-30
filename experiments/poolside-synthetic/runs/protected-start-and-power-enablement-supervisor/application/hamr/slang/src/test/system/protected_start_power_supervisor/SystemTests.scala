package protected_start_power_supervisor

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
  // import protected_start_power_supervisor.Protected_Start_Power_Supervisor.{CommandQualificationOwner_protected_start_power_process_command_qualification_owner_SystemTestAPI => nickname}
  // import protected_start_power_supervisor.Protected_Start_Power_Supervisor.{BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_SystemTestAPI => nickname}
  // import protected_start_power_supervisor.Protected_Start_Power_Supervisor.{TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_SystemTestAPI => nickname}
  // import protected_start_power_supervisor.Protected_Start_Power_Supervisor.{ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_SystemTestAPI => nickname}
  // import protected_start_power_supervisor.Protected_Start_Power_Supervisor.{ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_SystemTestAPI => nickname}
  // import protected_start_power_supervisor.Protected_Start_Power_Supervisor.{ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_SystemTestAPI => nickname}
  // import protected_start_power_supervisor.Protected_Start_Power_Supervisor.{SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_SystemTestAPI => nickname}
  // import protected_start_power_supervisor.Protected_Start_Power_Supervisor.{StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_SystemTestAPI => nickname}
  // import protected_start_power_supervisor.Protected_Start_Power_Supervisor.{ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_SystemTestAPI => nickname}
  // import protected_start_power_supervisor.Protected_Start_Power_Supervisor.{OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_SystemTestAPI => nickname}
  // import protected_start_power_supervisor.Protected_Start_Power_Supervisor.{FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_SystemTestAPI => nickname}
  // import protected_start_power_supervisor.Protected_Start_Power_Supervisor.{RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_SystemTestAPI => nickname}
  // import protected_start_power_supervisor.Protected_Start_Power_Supervisor.{ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_SystemTestAPI => nickname}
  // import protected_start_power_supervisor.Protected_Start_Power_Supervisor.{SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_SystemTestAPI => nickname}

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
