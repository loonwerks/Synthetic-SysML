package drone_lifecycle_energy_governor

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
  // import drone_lifecycle_energy_governor.Drone_Lifecycle_Energy_Governor.{RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner_SystemTestAPI => nickname}
  // import drone_lifecycle_energy_governor.Drone_Lifecycle_Energy_Governor.{BatteryEvidenceQualifier_governorProcess_batteryEvidenceQualifier_SystemTestAPI => nickname}
  // import drone_lifecycle_energy_governor.Drone_Lifecycle_Energy_Governor.{ChargerEvidenceQualifier_governorProcess_chargerEvidenceQualifier_SystemTestAPI => nickname}
  // import drone_lifecycle_energy_governor.Drone_Lifecycle_Energy_Governor.{ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_SystemTestAPI => nickname}
  // import drone_lifecycle_energy_governor.Drone_Lifecycle_Energy_Governor.{FlightReadinessOwner_governorProcess_flightReadinessOwner_SystemTestAPI => nickname}
  // import drone_lifecycle_energy_governor.Drone_Lifecycle_Energy_Governor.{HomeEvidenceQualifier_governorProcess_homeEvidenceQualifier_SystemTestAPI => nickname}
  // import drone_lifecycle_energy_governor.Drone_Lifecycle_Energy_Governor.{TouchdownEvidenceQualifier_governorProcess_touchdownEvidenceQualifier_SystemTestAPI => nickname}
  // import drone_lifecycle_energy_governor.Drone_Lifecycle_Energy_Governor.{BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_SystemTestAPI => nickname}
  // import drone_lifecycle_energy_governor.Drone_Lifecycle_Energy_Governor.{AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_SystemTestAPI => nickname}
  // import drone_lifecycle_energy_governor.Drone_Lifecycle_Energy_Governor.{AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_SystemTestAPI => nickname}
  // import drone_lifecycle_energy_governor.Drone_Lifecycle_Energy_Governor.{FaultAggregationOwner_governorProcess_faultAggregationOwner_SystemTestAPI => nickname}
  // import drone_lifecycle_energy_governor.Drone_Lifecycle_Energy_Governor.{LifecyclePriorityOwner_governorProcess_lifecyclePriorityOwner_SystemTestAPI => nickname}
  // import drone_lifecycle_energy_governor.Drone_Lifecycle_Energy_Governor.{OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner_SystemTestAPI => nickname}

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
