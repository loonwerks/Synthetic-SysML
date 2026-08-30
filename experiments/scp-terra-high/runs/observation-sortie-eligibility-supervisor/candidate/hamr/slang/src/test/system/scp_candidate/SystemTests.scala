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
  // import scp_candidate.Observation_Sortie_Eligibility_Supervisor.{EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_SystemTestAPI => nickname}
  // import scp_candidate.Observation_Sortie_Eligibility_Supervisor.{NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_SystemTestAPI => nickname}
  // import scp_candidate.Observation_Sortie_Eligibility_Supervisor.{CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_SystemTestAPI => nickname}
  // import scp_candidate.Observation_Sortie_Eligibility_Supervisor.{ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_SystemTestAPI => nickname}
  // import scp_candidate.Observation_Sortie_Eligibility_Supervisor.{ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_SystemTestAPI => nickname}
  // import scp_candidate.Observation_Sortie_Eligibility_Supervisor.{PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_SystemTestAPI => nickname}
  // import scp_candidate.Observation_Sortie_Eligibility_Supervisor.{RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_SystemTestAPI => nickname}
  // import scp_candidate.Observation_Sortie_Eligibility_Supervisor.{FaultRegistry_eligibility_supervisor_process_fault_registry_SystemTestAPI => nickname}
  // import scp_candidate.Observation_Sortie_Eligibility_Supervisor.{PriorityArbiter_eligibility_supervisor_process_priority_arbiter_SystemTestAPI => nickname}
  // import scp_candidate.Observation_Sortie_Eligibility_Supervisor.{RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_SystemTestAPI => nickname}
  // import scp_candidate.Observation_Sortie_Eligibility_Supervisor.{EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_SystemTestAPI => nickname}
  // import scp_candidate.Observation_Sortie_Eligibility_Supervisor.{PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_SystemTestAPI => nickname}
  // import scp_candidate.Observation_Sortie_Eligibility_Supervisor.{StatusComposer_eligibility_supervisor_process_status_composer_SystemTestAPI => nickname}

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
