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
  // import scp_candidate.Frigate_Threat_Egress_Supervisor.{ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_SystemTestAPI => nickname}
  // import scp_candidate.Frigate_Threat_Egress_Supervisor.{ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_SystemTestAPI => nickname}
  // import scp_candidate.Frigate_Threat_Egress_Supervisor.{ThreatReportPolicy_threatResponseProcess_threatReportPolicy_SystemTestAPI => nickname}
  // import scp_candidate.Frigate_Threat_Egress_Supervisor.{DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_SystemTestAPI => nickname}
  // import scp_candidate.Frigate_Threat_Egress_Supervisor.{EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_SystemTestAPI => nickname}
  // import scp_candidate.Frigate_Threat_Egress_Supervisor.{ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_SystemTestAPI => nickname}
  // import scp_candidate.Frigate_Threat_Egress_Supervisor.{ResponseStateController_threatResponseProcess_responseStateController_SystemTestAPI => nickname}
  // import scp_candidate.Frigate_Threat_Egress_Supervisor.{ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_SystemTestAPI => nickname}

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
