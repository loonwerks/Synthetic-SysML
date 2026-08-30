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
  // import scp_candidate.HVAC_Visibility_Priority_Supervisor.{RequestQualifier_supervision_requestQualifier_SystemTestAPI => nickname}
  // import scp_candidate.HVAC_Visibility_Priority_Supervisor.{ThermalNeedAssessor_supervision_thermalNeedAssessor_SystemTestAPI => nickname}
  // import scp_candidate.HVAC_Visibility_Priority_Supervisor.{VisibilityNeedAssessor_supervision_visibilityNeedAssessor_SystemTestAPI => nickname}
  // import scp_candidate.HVAC_Visibility_Priority_Supervisor.{HumidityNeedAssessor_supervision_humidityNeedAssessor_SystemTestAPI => nickname}
  // import scp_candidate.HVAC_Visibility_Priority_Supervisor.{AirQualityNeedAssessor_supervision_airQualityNeedAssessor_SystemTestAPI => nickname}
  // import scp_candidate.HVAC_Visibility_Priority_Supervisor.{ElectricalEligibilityOwner_supervision_electricalEligibilityOwner_SystemTestAPI => nickname}
  // import scp_candidate.HVAC_Visibility_Priority_Supervisor.{WasteHeatEligibilityOwner_supervision_wasteHeatEligibilityOwner_SystemTestAPI => nickname}
  // import scp_candidate.HVAC_Visibility_Priority_Supervisor.{EquipmentFaultAssessor_supervision_equipmentFaultAssessor_SystemTestAPI => nickname}
  // import scp_candidate.HVAC_Visibility_Priority_Supervisor.{PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter_SystemTestAPI => nickname}
  // import scp_candidate.HVAC_Visibility_Priority_Supervisor.{ThermalServiceProposer_supervision_thermalServiceProposer_SystemTestAPI => nickname}
  // import scp_candidate.HVAC_Visibility_Priority_Supervisor.{VisibilityServiceProposer_supervision_visibilityServiceProposer_SystemTestAPI => nickname}
  // import scp_candidate.HVAC_Visibility_Priority_Supervisor.{CabinAirServiceProposer_supervision_cabinAirServiceProposer_SystemTestAPI => nickname}
  // import scp_candidate.HVAC_Visibility_Priority_Supervisor.{EnergySafePlanComposer_supervision_energySafePlanComposer_SystemTestAPI => nickname}
  // import scp_candidate.HVAC_Visibility_Priority_Supervisor.{CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_SystemTestAPI => nickname}
  // import scp_candidate.HVAC_Visibility_Priority_Supervisor.{AtomicResultPublisher_supervision_atomicResultPublisher_SystemTestAPI => nickname}

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
