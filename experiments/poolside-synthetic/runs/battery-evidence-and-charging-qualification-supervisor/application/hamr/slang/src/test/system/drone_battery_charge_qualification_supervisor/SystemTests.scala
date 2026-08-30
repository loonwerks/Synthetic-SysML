package drone_battery_charge_qualification_supervisor

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
  // import drone_battery_charge_qualification_supervisor.Drone_Battery_Charge_Qualification_Supervisor.{CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner_SystemTestAPI => nickname}
  // import drone_battery_charge_qualification_supervisor.Drone_Battery_Charge_Qualification_Supervisor.{BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_SystemTestAPI => nickname}
  // import drone_battery_charge_qualification_supervisor.Drone_Battery_Charge_Qualification_Supervisor.{ChargerEvidenceQualifier_chargeQualificationProcess_chargerEvidenceQualifier_SystemTestAPI => nickname}
  // import drone_battery_charge_qualification_supervisor.Drone_Battery_Charge_Qualification_Supervisor.{ChargingInterfaceEvidenceQualifier_chargeQualificationProcess_chargingInterfaceEvidenceQualifier_SystemTestAPI => nickname}
  // import drone_battery_charge_qualification_supervisor.Drone_Battery_Charge_Qualification_Supervisor.{LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_SystemTestAPI => nickname}
  // import drone_battery_charge_qualification_supervisor.Drone_Battery_Charge_Qualification_Supervisor.{BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_SystemTestAPI => nickname}
  // import drone_battery_charge_qualification_supervisor.Drone_Battery_Charge_Qualification_Supervisor.{ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_SystemTestAPI => nickname}
  // import drone_battery_charge_qualification_supervisor.Drone_Battery_Charge_Qualification_Supervisor.{AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_SystemTestAPI => nickname}
  // import drone_battery_charge_qualification_supervisor.Drone_Battery_Charge_Qualification_Supervisor.{BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_SystemTestAPI => nickname}
  // import drone_battery_charge_qualification_supervisor.Drone_Battery_Charge_Qualification_Supervisor.{FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner_SystemTestAPI => nickname}
  // import drone_battery_charge_qualification_supervisor.Drone_Battery_Charge_Qualification_Supervisor.{ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner_SystemTestAPI => nickname}
  // import drone_battery_charge_qualification_supervisor.Drone_Battery_Charge_Qualification_Supervisor.{NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner_SystemTestAPI => nickname}
  // import drone_battery_charge_qualification_supervisor.Drone_Battery_Charge_Qualification_Supervisor.{AuthorizationStatusCompositionOwner_chargeQualificationProcess_authorizationStatusCompositionOwner_SystemTestAPI => nickname}

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
