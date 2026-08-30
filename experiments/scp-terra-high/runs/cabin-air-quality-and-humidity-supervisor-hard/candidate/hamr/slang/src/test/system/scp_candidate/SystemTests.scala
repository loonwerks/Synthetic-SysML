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
  // import scp_candidate.Cabin_Air_Quality_Humidity_Supervisor.{PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_SystemTestAPI => nickname}
  // import scp_candidate.Cabin_Air_Quality_Humidity_Supervisor.{AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_SystemTestAPI => nickname}
  // import scp_candidate.Cabin_Air_Quality_Humidity_Supervisor.{HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_SystemTestAPI => nickname}
  // import scp_candidate.Cabin_Air_Quality_Humidity_Supervisor.{SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_SystemTestAPI => nickname}
  // import scp_candidate.Cabin_Air_Quality_Humidity_Supervisor.{TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_SystemTestAPI => nickname}
  // import scp_candidate.Cabin_Air_Quality_Humidity_Supervisor.{AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_SystemTestAPI => nickname}
  // import scp_candidate.Cabin_Air_Quality_Humidity_Supervisor.{HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_SystemTestAPI => nickname}
  // import scp_candidate.Cabin_Air_Quality_Humidity_Supervisor.{PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_SystemTestAPI => nickname}
  // import scp_candidate.Cabin_Air_Quality_Humidity_Supervisor.{FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_SystemTestAPI => nickname}
  // import scp_candidate.Cabin_Air_Quality_Humidity_Supervisor.{HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_SystemTestAPI => nickname}
  // import scp_candidate.Cabin_Air_Quality_Humidity_Supervisor.{RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_SystemTestAPI => nickname}
  // import scp_candidate.Cabin_Air_Quality_Humidity_Supervisor.{CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_SystemTestAPI => nickname}
  // import scp_candidate.Cabin_Air_Quality_Humidity_Supervisor.{AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_SystemTestAPI => nickname}
  // import scp_candidate.Cabin_Air_Quality_Humidity_Supervisor.{StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_SystemTestAPI => nickname}

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
