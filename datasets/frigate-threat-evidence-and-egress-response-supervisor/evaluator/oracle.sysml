// @trace SCOPE-IN-01
package Frigate_Threat_Egress_Supervisor {
  private import HAMR::*;

  // @trace MON-01
  enum def EvidenceBand {
    enum CLEAR;
    enum SUSPICIOUS;
    enum HOSTILE;
  }

  // @trace MON-01
  enum def ObservationValidity {
    enum INVALID;
    enum VALID;
  }

  // @trace MON-01
  part def ThreatObservation :> Data {
    // @trace MON-01
    attribute evidenceBand : EvidenceBand;
    // @trace MON-01
    attribute validity : ObservationValidity;
  }

  // @trace MON-02
  enum def PilotDisposition {
    enum NO_RESPONSE;
    enum ACKNOWLEDGE_ALERT;
    enum CONFIRM_CLEAR;
  }

  // @trace MON-03
  enum def DefenseAvailability {
    enum UNAVAILABLE;
    enum AVAILABLE;
  }

  // @trace MON-03
  enum def CapacitorSupport {
    enum INSUFFICIENT;
    enum SUFFICIENT;
  }

  // @trace MON-03
  part def DefenseSupportObservation :> Data {
    // @trace MON-03
    attribute defenseAvailability : DefenseAvailability;
    // @trace MON-03
    attribute capacitorSupport : CapacitorSupport;
  }

  // @trace MON-04
  enum def EgressRouteObservation {
    enum UNKNOWN;
    enum BLOCKED;
    enum AVAILABLE;
  }

  // @trace MON-05
  enum def EgressProgress {
    enum NOT_STARTED;
    enum EN_ROUTE;
    enum SAFE_DESTINATION_OBSERVED;
    enum FAILED;
  }

  // @trace MON-06
  enum def ResponseAuthorization {
    enum NO_REQUEST;
    enum EGRESS_REQUEST;
    enum CANCEL_EGRESS;
  }

  // @trace CTRL-01
  enum def ThreatReport {
    enum NO_REPORT;
    enum WATCH_REPORT;
    enum HOSTILE_ALERT;
    enum EVIDENCE_FAULT;
    enum CLEAR_PENDING_REPORT;
    enum CLEAR_CONFIRMED_REPORT;
  }

  // @trace CTRL-02
  enum def DefenseCommand {
    enum STANDBY;
    enum ACTIVATE;
  }

  // @trace CTRL-03
  enum def EgressCommand {
    enum NONE;
    enum INITIATE;
    enum CONTINUE;
    enum HOLD;
    enum CANCEL;
  }

  // @trace CTRL-04
  enum def ResponseStatus {
    enum QUIET;
    enum WATCHING;
    enum THREAT_DECLARED;
    enum DEFENDING;
    enum EGRESS_ORDERED;
    enum EGRESS_MOVING;
    enum EGRESS_BLOCKED;
    enum ARRIVAL_OBSERVED;
    enum EVIDENCE_UNAVAILABLE;
    enum CLEAR_PENDING;
  }

  // @trace TYPE-01
  enum def EvidenceAssessment {
    enum UNAVAILABLE;
    enum CLEAR;
    enum SUSPECT;
    enum HOSTILE;
  }

  // @trace TYPE-02
  enum def ThreatEpisodeState {
    enum QUIET;
    enum WATCH;
    enum DECLARED;
    enum CLEAR_PENDING;
  }

  // @trace TYPE-04
  enum def DefenseQualification {
    enum INAPPLICABLE;
    enum BLOCKED_AVAILABILITY;
    enum BLOCKED_CAPACITOR;
    enum READY;
  }

  // @trace TYPE-05
  enum def EgressQualification {
    enum INAPPLICABLE;
    enum ROUTE_UNKNOWN;
    enum ROUTE_BLOCKED;
    enum READY;
  }

  // @trace TYPE-06
  enum def ResponseDirective {
    enum RESET;
    enum CONTAIN;
    enum CANCEL_EGRESS;
    enum START_EGRESS;
    enum DEFEND;
    enum HOLD_BLOCKED;
    enum MONITOR;
  }

  // @trace TYPE-07
  enum def EgressSessionState {
    enum IDLE;
    enum ORDERED;
    enum MOVING;
    enum BLOCKED;
    enum ARRIVED;
  }

  // @trace TYPE-03
  enum def SnapshotPreEpisodeState {
    enum QUIET;
    enum WATCH;
    enum DECLARED;
    enum CLEAR_PENDING;
  }

  // @trace TYPE-03
  enum def SnapshotNextEpisodeState {
    enum QUIET;
    enum WATCH;
    enum DECLARED;
    enum CLEAR_PENDING;
  }

  // @trace TYPE-03
  enum def SnapshotEvidenceAssessment {
    enum UNAVAILABLE;
    enum CLEAR;
    enum SUSPECT;
    enum HOSTILE;
  }

  // @trace TYPE-03
  enum def SnapshotPilotDisposition {
    enum NO_RESPONSE;
    enum ACKNOWLEDGE_ALERT;
    enum CONFIRM_CLEAR;
  }

  // @trace TYPE-08
  enum def SnapshotPreEgressState {
    enum IDLE;
    enum ORDERED;
    enum MOVING;
    enum BLOCKED;
    enum ARRIVED;
  }

  // @trace TYPE-08
  enum def SnapshotNextEgressState {
    enum IDLE;
    enum ORDERED;
    enum MOVING;
    enum BLOCKED;
    enum ARRIVED;
  }

  // @trace TYPE-08
  enum def SnapshotResponseDirective {
    enum RESET;
    enum CONTAIN;
    enum CANCEL_EGRESS;
    enum START_EGRESS;
    enum DEFEND;
    enum HOLD_BLOCKED;
    enum MONITOR;
  }

  // @trace TYPE-08
  enum def SnapshotDefenseCommand {
    enum STANDBY;
    enum ACTIVATE;
  }

  // @trace TYPE-08
  enum def SnapshotEgressCommand {
    enum NONE;
    enum INITIATE;
    enum CONTINUE;
    enum HOLD;
    enum CANCEL;
  }

  // @trace TYPE-03
  part def EpisodeSnapshot :> Data {
    // @trace TYPE-03
    attribute preEpisode : SnapshotPreEpisodeState;
    // @trace TYPE-03
    attribute nextEpisode : SnapshotNextEpisodeState;
    // @trace TYPE-03
    attribute assessment : SnapshotEvidenceAssessment;
    // @trace TYPE-03
    attribute pilotDisposition : SnapshotPilotDisposition;
  }

  // @trace TYPE-08
  part def ResponseSnapshot :> Data {
    // @trace TYPE-08
    attribute preEgress : SnapshotPreEgressState;
    // @trace TYPE-08
    attribute nextEgress : SnapshotNextEgressState;
    // @trace TYPE-08
    attribute directive : SnapshotResponseDirective;
    // @trace TYPE-08
    attribute defenseCommand : SnapshotDefenseCommand;
    // @trace TYPE-08
    attribute egressCommand : SnapshotEgressCommand;
  }

  // @trace PART-01
  part def ThreatEvidenceQualifier :> Thread {
    // @trace INT-01
    port threatObservation : DataPort { in :>> type : ThreatObservation; }
    // @trace INT-07
    port evidenceAssessment : DataPort { out :>> type : EvidenceAssessment; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace INIT-01
          INIT_EVIDENCE_ASSESSMENT "Initial assessment applies validity precedence to the current observation":
            ((threatObservation.validity == ObservationValidity.INVALID) implies
              (evidenceAssessment == EvidenceAssessment.UNAVAILABLE)) &
            ((threatObservation.validity == ObservationValidity.VALID &
              threatObservation.evidenceBand == EvidenceBand.CLEAR) implies
              (evidenceAssessment == EvidenceAssessment.CLEAR)) &
            ((threatObservation.validity == ObservationValidity.VALID &
              threatObservation.evidenceBand == EvidenceBand.SUSPICIOUS) implies
              (evidenceAssessment == EvidenceAssessment.SUSPECT)) &
            ((threatObservation.validity == ObservationValidity.VALID &
              threatObservation.evidenceBand == EvidenceBand.HOSTILE) implies
              (evidenceAssessment == EvidenceAssessment.HOSTILE));
      compute
        compute_cases
          // @trace CASE-01
          case CASE_01_INVALID_EVIDENCE "Invalidity takes precedence over every evidence band":
            assume threatObservation.validity == ObservationValidity.INVALID;
            guarantee evidenceAssessment == EvidenceAssessment.UNAVAILABLE;
          // @trace CASE-02
          case CASE_02_VALID_CLEAR "Valid clear evidence is classified clear":
            assume threatObservation.validity == ObservationValidity.VALID &
              threatObservation.evidenceBand == EvidenceBand.CLEAR;
            guarantee evidenceAssessment == EvidenceAssessment.CLEAR;
          // @trace CASE-03
          case CASE_03_VALID_THREAT_BANDS "Valid suspicious and hostile bands retain distinct threat meanings":
            assume threatObservation.validity == ObservationValidity.VALID &
              (threatObservation.evidenceBand == EvidenceBand.SUSPICIOUS |
               threatObservation.evidenceBand == EvidenceBand.HOSTILE);
            guarantee
              ((threatObservation.evidenceBand == EvidenceBand.SUSPICIOUS) implies
                (evidenceAssessment == EvidenceAssessment.SUSPECT)) &
              ((threatObservation.evidenceBand == EvidenceBand.HOSTILE) implies
                (evidenceAssessment == EvidenceAssessment.HOSTILE));
    }*/
  }

  // @trace PART-02
  part def ThreatEpisodeTracker :> Thread {
    // @trace INT-02
    port pilotDisposition : DataPort { in :>> type : PilotDisposition; }
    // @trace INT-07
    port evidenceAssessment : DataPort { in :>> type : EvidenceAssessment; }
    // @trace INT-08
    port episodeSnapshot : DataPort { out :>> type : EpisodeSnapshot; }

    language "GUMBO" /*{
      state
        // @trace TYPE-02
        committedEpisode : ThreatEpisodeState;
      initialize
        guarantee
          // @trace INIT-01
          INIT_EPISODE "Threat episode initializes quiet with a complete diagnostic snapshot":
            committedEpisode == ThreatEpisodeState.QUIET &
            episodeSnapshot.preEpisode == SnapshotPreEpisodeState.QUIET &
            episodeSnapshot.nextEpisode == SnapshotNextEpisodeState.QUIET &
            ((evidenceAssessment == EvidenceAssessment.UNAVAILABLE) implies
              (episodeSnapshot.assessment == SnapshotEvidenceAssessment.UNAVAILABLE)) &
            ((evidenceAssessment == EvidenceAssessment.CLEAR) implies
              (episodeSnapshot.assessment == SnapshotEvidenceAssessment.CLEAR)) &
            ((evidenceAssessment == EvidenceAssessment.SUSPECT) implies
              (episodeSnapshot.assessment == SnapshotEvidenceAssessment.SUSPECT)) &
            ((evidenceAssessment == EvidenceAssessment.HOSTILE) implies
              (episodeSnapshot.assessment == SnapshotEvidenceAssessment.HOSTILE)) &
            ((pilotDisposition == PilotDisposition.NO_RESPONSE) implies
              (episodeSnapshot.pilotDisposition == SnapshotPilotDisposition.NO_RESPONSE)) &
            ((pilotDisposition == PilotDisposition.ACKNOWLEDGE_ALERT) implies
              (episodeSnapshot.pilotDisposition == SnapshotPilotDisposition.ACKNOWLEDGE_ALERT)) &
            ((pilotDisposition == PilotDisposition.CONFIRM_CLEAR) implies
              (episodeSnapshot.pilotDisposition == SnapshotPilotDisposition.CONFIRM_CLEAR));
      compute
        guarantee
          // @trace TYPE-03
          PRESERVE_EPISODE_SNAPSHOT "The snapshot preserves the owner's pre-state, next-state, assessment, and disposition":
            ((In(committedEpisode) == ThreatEpisodeState.QUIET) implies
              (episodeSnapshot.preEpisode == SnapshotPreEpisodeState.QUIET)) &
            ((In(committedEpisode) == ThreatEpisodeState.WATCH) implies
              (episodeSnapshot.preEpisode == SnapshotPreEpisodeState.WATCH)) &
            ((In(committedEpisode) == ThreatEpisodeState.DECLARED) implies
              (episodeSnapshot.preEpisode == SnapshotPreEpisodeState.DECLARED)) &
            ((In(committedEpisode) == ThreatEpisodeState.CLEAR_PENDING) implies
              (episodeSnapshot.preEpisode == SnapshotPreEpisodeState.CLEAR_PENDING)) &
            ((committedEpisode == ThreatEpisodeState.QUIET) implies
              (episodeSnapshot.nextEpisode == SnapshotNextEpisodeState.QUIET)) &
            ((committedEpisode == ThreatEpisodeState.WATCH) implies
              (episodeSnapshot.nextEpisode == SnapshotNextEpisodeState.WATCH)) &
            ((committedEpisode == ThreatEpisodeState.DECLARED) implies
              (episodeSnapshot.nextEpisode == SnapshotNextEpisodeState.DECLARED)) &
            ((committedEpisode == ThreatEpisodeState.CLEAR_PENDING) implies
              (episodeSnapshot.nextEpisode == SnapshotNextEpisodeState.CLEAR_PENDING)) &
            ((evidenceAssessment == EvidenceAssessment.UNAVAILABLE) implies
              (episodeSnapshot.assessment == SnapshotEvidenceAssessment.UNAVAILABLE)) &
            ((evidenceAssessment == EvidenceAssessment.CLEAR) implies
              (episodeSnapshot.assessment == SnapshotEvidenceAssessment.CLEAR)) &
            ((evidenceAssessment == EvidenceAssessment.SUSPECT) implies
              (episodeSnapshot.assessment == SnapshotEvidenceAssessment.SUSPECT)) &
            ((evidenceAssessment == EvidenceAssessment.HOSTILE) implies
              (episodeSnapshot.assessment == SnapshotEvidenceAssessment.HOSTILE)) &
            ((pilotDisposition == PilotDisposition.NO_RESPONSE) implies
              (episodeSnapshot.pilotDisposition == SnapshotPilotDisposition.NO_RESPONSE)) &
            ((pilotDisposition == PilotDisposition.ACKNOWLEDGE_ALERT) implies
              (episodeSnapshot.pilotDisposition == SnapshotPilotDisposition.ACKNOWLEDGE_ALERT)) &
            ((pilotDisposition == PilotDisposition.CONFIRM_CLEAR) implies
              (episodeSnapshot.pilotDisposition == SnapshotPilotDisposition.CONFIRM_CLEAR));
        compute_cases
          // @trace CASE-04
          case CASE_04_UNAVAILABLE_CONTAINMENT "Unavailable evidence cannot clear a declared episode":
            assume evidenceAssessment == EvidenceAssessment.UNAVAILABLE;
            guarantee
              (((In(committedEpisode) == ThreatEpisodeState.QUIET) |
                (In(committedEpisode) == ThreatEpisodeState.WATCH)) implies
                (committedEpisode == ThreatEpisodeState.WATCH)) &
              (((In(committedEpisode) == ThreatEpisodeState.DECLARED) |
                (In(committedEpisode) == ThreatEpisodeState.CLEAR_PENDING)) implies
                (committedEpisode == ThreatEpisodeState.DECLARED));
          // @trace CASE-05
          case CASE_05_HOSTILE_OR_SUSPECT "Hostile evidence declares; suspect evidence watches unless declaration is already retained":
            assume evidenceAssessment == EvidenceAssessment.HOSTILE |
              evidenceAssessment == EvidenceAssessment.SUSPECT;
            guarantee
              ((evidenceAssessment == EvidenceAssessment.HOSTILE) implies
                (committedEpisode == ThreatEpisodeState.DECLARED)) &
              ((evidenceAssessment == EvidenceAssessment.SUSPECT &
                ((In(committedEpisode) == ThreatEpisodeState.QUIET) |
                 (In(committedEpisode) == ThreatEpisodeState.WATCH))) implies
                (committedEpisode == ThreatEpisodeState.WATCH)) &
              ((evidenceAssessment == EvidenceAssessment.SUSPECT &
                ((In(committedEpisode) == ThreatEpisodeState.DECLARED) |
                 (In(committedEpisode) == ThreatEpisodeState.CLEAR_PENDING))) implies
                (committedEpisode == ThreatEpisodeState.DECLARED));
          // @trace CASE-06
          case CASE_06_CLEAR_CONFIRMATION "Clear evidence is quiet outside declaration and requires explicit confirmation when pending":
            assume evidenceAssessment == EvidenceAssessment.CLEAR;
            guarantee
              (((In(committedEpisode) == ThreatEpisodeState.QUIET) |
                (In(committedEpisode) == ThreatEpisodeState.WATCH)) implies
                (committedEpisode == ThreatEpisodeState.QUIET)) &
              ((In(committedEpisode) == ThreatEpisodeState.DECLARED) implies
                (committedEpisode == ThreatEpisodeState.CLEAR_PENDING)) &
              ((In(committedEpisode) == ThreatEpisodeState.CLEAR_PENDING &
                pilotDisposition == PilotDisposition.CONFIRM_CLEAR) implies
                (committedEpisode == ThreatEpisodeState.QUIET)) &
              ((In(committedEpisode) == ThreatEpisodeState.CLEAR_PENDING &
                pilotDisposition != PilotDisposition.CONFIRM_CLEAR) implies
                (committedEpisode == ThreatEpisodeState.CLEAR_PENDING));
    }*/
  }

  // @trace PART-03
  part def ThreatReportPolicy :> Thread {
    // @trace INT-08
    port episodeSnapshot : DataPort { in :>> type : EpisodeSnapshot; }
    // @trace INT-17
    port threatReport : DataPort { out :>> type : ThreatReport; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace INIT-01
          INIT_REPORT "The report initializes to the safe no-report value before logical evaluation":
            threatReport == ThreatReport.NO_REPORT;
      compute
        compute_cases
          // @trace CASE-15
          case CASE_15_REPORT_PRECEDENCE "One report is derived from evidence, episode transition, and pilot disposition precedence":
            guarantee
              ((episodeSnapshot.assessment == SnapshotEvidenceAssessment.UNAVAILABLE) implies
                (threatReport == ThreatReport.EVIDENCE_FAULT)) &
              ((episodeSnapshot.assessment == SnapshotEvidenceAssessment.HOSTILE &
                episodeSnapshot.pilotDisposition != SnapshotPilotDisposition.ACKNOWLEDGE_ALERT) implies
                (threatReport == ThreatReport.HOSTILE_ALERT)) &
              ((episodeSnapshot.assessment == SnapshotEvidenceAssessment.HOSTILE &
                episodeSnapshot.pilotDisposition == SnapshotPilotDisposition.ACKNOWLEDGE_ALERT) implies
                (threatReport == ThreatReport.NO_REPORT)) &
              ((episodeSnapshot.assessment != SnapshotEvidenceAssessment.UNAVAILABLE &
                episodeSnapshot.assessment != SnapshotEvidenceAssessment.HOSTILE &
                episodeSnapshot.preEpisode == SnapshotPreEpisodeState.CLEAR_PENDING &
                episodeSnapshot.nextEpisode == SnapshotNextEpisodeState.QUIET) implies
                (threatReport == ThreatReport.CLEAR_CONFIRMED_REPORT)) &
              ((episodeSnapshot.assessment != SnapshotEvidenceAssessment.UNAVAILABLE &
                episodeSnapshot.assessment != SnapshotEvidenceAssessment.HOSTILE &
                (episodeSnapshot.preEpisode != SnapshotPreEpisodeState.CLEAR_PENDING |
                 episodeSnapshot.nextEpisode != SnapshotNextEpisodeState.QUIET) &
                episodeSnapshot.nextEpisode == SnapshotNextEpisodeState.CLEAR_PENDING) implies
                (threatReport == ThreatReport.CLEAR_PENDING_REPORT)) &
              ((episodeSnapshot.assessment == SnapshotEvidenceAssessment.SUSPECT &
                (episodeSnapshot.preEpisode != SnapshotPreEpisodeState.CLEAR_PENDING |
                 episodeSnapshot.nextEpisode != SnapshotNextEpisodeState.QUIET) &
                episodeSnapshot.nextEpisode != SnapshotNextEpisodeState.CLEAR_PENDING) implies
                (threatReport == ThreatReport.WATCH_REPORT)) &
              ((episodeSnapshot.assessment == SnapshotEvidenceAssessment.CLEAR &
                (episodeSnapshot.preEpisode != SnapshotPreEpisodeState.CLEAR_PENDING |
                 episodeSnapshot.nextEpisode != SnapshotNextEpisodeState.QUIET) &
                episodeSnapshot.nextEpisode != SnapshotNextEpisodeState.CLEAR_PENDING) implies
                (threatReport == ThreatReport.NO_REPORT));
    }*/
  }

  // @trace PART-04
  part def DefenseReadinessQualifier :> Thread {
    // @trace INT-03
    port defenseSupport : DataPort { in :>> type : DefenseSupportObservation; }
    // @trace INT-09
    port evidenceAssessment : DataPort { in :>> type : EvidenceAssessment; }
    // @trace INT-10
    port defenseQualification : DataPort { out :>> type : DefenseQualification; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace INIT-01
          INIT_DEFENSE_QUALIFICATION "Initial defense qualification applies threat, availability, then capacitor precedence":
            ((evidenceAssessment != EvidenceAssessment.HOSTILE) implies
              (defenseQualification == DefenseQualification.INAPPLICABLE)) &
            ((evidenceAssessment == EvidenceAssessment.HOSTILE &
              defenseSupport.defenseAvailability == DefenseAvailability.UNAVAILABLE) implies
              (defenseQualification == DefenseQualification.BLOCKED_AVAILABILITY)) &
            ((evidenceAssessment == EvidenceAssessment.HOSTILE &
              defenseSupport.defenseAvailability == DefenseAvailability.AVAILABLE &
              defenseSupport.capacitorSupport == CapacitorSupport.INSUFFICIENT) implies
              (defenseQualification == DefenseQualification.BLOCKED_CAPACITOR)) &
            ((evidenceAssessment == EvidenceAssessment.HOSTILE &
              defenseSupport.defenseAvailability == DefenseAvailability.AVAILABLE &
              defenseSupport.capacitorSupport == CapacitorSupport.SUFFICIENT) implies
              (defenseQualification == DefenseQualification.READY));
      compute
        compute_cases
          // @trace CASE-07
          case CASE_07_DEFENSE_INAPPLICABLE "Defense is inapplicable without hostile assessment":
            assume evidenceAssessment != EvidenceAssessment.HOSTILE;
            guarantee defenseQualification == DefenseQualification.INAPPLICABLE;
          // @trace CASE-08
          case CASE_08_DEFENSE_UNAVAILABLE "Unavailable defense support blocks before capacitor consideration":
            assume evidenceAssessment == EvidenceAssessment.HOSTILE &
              defenseSupport.defenseAvailability == DefenseAvailability.UNAVAILABLE;
            guarantee defenseQualification == DefenseQualification.BLOCKED_AVAILABILITY;
          // @trace CASE-09
          case CASE_09_CAPACITOR_BLOCK "Available defense with insufficient capacitor support is blocked":
            assume evidenceAssessment == EvidenceAssessment.HOSTILE &
              defenseSupport.defenseAvailability == DefenseAvailability.AVAILABLE &
              defenseSupport.capacitorSupport == CapacitorSupport.INSUFFICIENT;
            guarantee defenseQualification == DefenseQualification.BLOCKED_CAPACITOR;
          // @trace CASE-10
          case CASE_10_DEFENSE_READY "Available defense with sufficient capacitor support is ready":
            assume evidenceAssessment == EvidenceAssessment.HOSTILE &
              defenseSupport.defenseAvailability == DefenseAvailability.AVAILABLE &
              defenseSupport.capacitorSupport == CapacitorSupport.SUFFICIENT;
            guarantee defenseQualification == DefenseQualification.READY;
    }*/
  }

  // @trace PART-05
  part def EgressReadinessQualifier :> Thread {
    // @trace INT-04
    port egressRoute : DataPort { in :>> type : EgressRouteObservation; }
    // @trace INT-11
    port evidenceAssessment : DataPort { in :>> type : EvidenceAssessment; }
    // @trace INT-12
    port egressQualification : DataPort { out :>> type : EgressQualification; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace INIT-01
          INIT_EGRESS_QUALIFICATION "Initial egress qualification applies hostile applicability and route knowledge":
            ((evidenceAssessment != EvidenceAssessment.HOSTILE) implies
              (egressQualification == EgressQualification.INAPPLICABLE)) &
            ((evidenceAssessment == EvidenceAssessment.HOSTILE &
              egressRoute == EgressRouteObservation.UNKNOWN) implies
              (egressQualification == EgressQualification.ROUTE_UNKNOWN)) &
            ((evidenceAssessment == EvidenceAssessment.HOSTILE &
              egressRoute == EgressRouteObservation.BLOCKED) implies
              (egressQualification == EgressQualification.ROUTE_BLOCKED)) &
            ((evidenceAssessment == EvidenceAssessment.HOSTILE &
              egressRoute == EgressRouteObservation.AVAILABLE) implies
              (egressQualification == EgressQualification.READY));
      compute
        compute_cases
          // @trace CASE-11
          case CASE_11_EGRESS_INAPPLICABLE "Egress is inapplicable without hostile assessment":
            assume evidenceAssessment != EvidenceAssessment.HOSTILE;
            guarantee egressQualification == EgressQualification.INAPPLICABLE;
          // @trace CASE-12
          case CASE_12_ROUTE_UNKNOWN "Hostile evidence with unknown route is not ready":
            assume evidenceAssessment == EvidenceAssessment.HOSTILE &
              egressRoute == EgressRouteObservation.UNKNOWN;
            guarantee egressQualification == EgressQualification.ROUTE_UNKNOWN;
          // @trace CASE-13
          case CASE_13_ROUTE_BLOCKED "Hostile evidence with blocked route remains blocked":
            assume evidenceAssessment == EvidenceAssessment.HOSTILE &
              egressRoute == EgressRouteObservation.BLOCKED;
            guarantee egressQualification == EgressQualification.ROUTE_BLOCKED;
          // @trace CASE-14
          case CASE_14_EGRESS_READY "Hostile evidence with available route is egress-ready":
            assume evidenceAssessment == EvidenceAssessment.HOSTILE &
              egressRoute == EgressRouteObservation.AVAILABLE;
            guarantee egressQualification == EgressQualification.READY;
    }*/
  }

  // @trace PART-06
  part def ThreatResponseArbiter :> Thread {
    // @trace INT-06
    port responseAuthorization : DataPort { in :>> type : ResponseAuthorization; }
    // @trace INT-10
    port defenseQualification : DataPort { in :>> type : DefenseQualification; }
    // @trace INT-12
    port egressQualification : DataPort { in :>> type : EgressQualification; }
    // @trace INT-13
    port episodeSnapshot : DataPort { in :>> type : EpisodeSnapshot; }
    // @trace INT-14
    port responseDirective : DataPort { out :>> type : ResponseDirective; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace INIT-01
          INIT_DIRECTIVE "The directive initializes to monitor before logical evaluation":
            responseDirective == ResponseDirective.MONITOR;
      compute
        compute_cases
          // @trace CASE-16
          case CASE_16_RESET_CONTAIN_CANCEL "Quiet reset, unavailable containment, and cancellation apply in explicit priority order":
            assume episodeSnapshot.nextEpisode == SnapshotNextEpisodeState.QUIET |
              episodeSnapshot.assessment == SnapshotEvidenceAssessment.UNAVAILABLE |
              responseAuthorization == ResponseAuthorization.CANCEL_EGRESS;
            guarantee
              ((episodeSnapshot.nextEpisode == SnapshotNextEpisodeState.QUIET) implies
                (responseDirective == ResponseDirective.RESET)) &
              ((episodeSnapshot.nextEpisode != SnapshotNextEpisodeState.QUIET &
                episodeSnapshot.assessment == SnapshotEvidenceAssessment.UNAVAILABLE) implies
                (responseDirective == ResponseDirective.CONTAIN)) &
              ((episodeSnapshot.nextEpisode != SnapshotNextEpisodeState.QUIET &
                episodeSnapshot.assessment != SnapshotEvidenceAssessment.UNAVAILABLE &
                responseAuthorization == ResponseAuthorization.CANCEL_EGRESS) implies
                (responseDirective == ResponseDirective.CANCEL_EGRESS));
          // @trace CASE-17
          case CASE_17_FRESH_EGRESS_PRIORITY "A fresh ready egress request outranks defense; other fresh requests defend or hold":
            assume episodeSnapshot.nextEpisode != SnapshotNextEpisodeState.QUIET &
              episodeSnapshot.assessment != SnapshotEvidenceAssessment.UNAVAILABLE &
              responseAuthorization == ResponseAuthorization.EGRESS_REQUEST;
            guarantee
              ((egressQualification == EgressQualification.READY) implies
                (responseDirective == ResponseDirective.START_EGRESS)) &
              ((egressQualification != EgressQualification.READY &
                defenseQualification == DefenseQualification.READY) implies
                (responseDirective == ResponseDirective.DEFEND)) &
              ((egressQualification != EgressQualification.READY &
                defenseQualification != DefenseQualification.READY) implies
                (responseDirective == ResponseDirective.HOLD_BLOCKED));
          // @trace CASE-18
          case CASE_18_DEFEND_OR_MONITOR "Without reset, containment, cancellation, or fresh request, readiness selects defense or monitoring":
            assume episodeSnapshot.nextEpisode != SnapshotNextEpisodeState.QUIET &
              episodeSnapshot.assessment != SnapshotEvidenceAssessment.UNAVAILABLE &
              responseAuthorization == ResponseAuthorization.NO_REQUEST;
            guarantee
              ((defenseQualification == DefenseQualification.READY) implies
                (responseDirective == ResponseDirective.DEFEND)) &
              ((defenseQualification != DefenseQualification.READY) implies
                (responseDirective == ResponseDirective.MONITOR));
    }*/
  }

  // @trace PART-07
  part def ResponseStateController :> Thread {
    // @trace INT-05
    port egressProgress : DataPort { in :>> type : EgressProgress; }
    // @trace INT-14
    port responseDirective : DataPort { in :>> type : ResponseDirective; }
    // @trace INT-15
    port responseSnapshot : DataPort { out :>> type : ResponseSnapshot; }
    // @trace INT-18
    port defenseCommand : DataPort { out :>> type : DefenseCommand; }
    // @trace INT-19
    port egressCommand : DataPort { out :>> type : EgressCommand; }

    language "GUMBO" /*{
      state
        // @trace TYPE-07
        committedEgress : EgressSessionState;
      initialize
        guarantee
          // @trace INIT-01
          INIT_EGRESS_SESSION "The egress session and complete command snapshot initialize to idle standby":
            committedEgress == EgressSessionState.IDLE &
            defenseCommand == DefenseCommand.STANDBY &
            egressCommand == EgressCommand.NONE &
            responseSnapshot.preEgress == SnapshotPreEgressState.IDLE &
            responseSnapshot.nextEgress == SnapshotNextEgressState.IDLE &
            ((responseDirective == ResponseDirective.RESET) implies
              (responseSnapshot.directive == SnapshotResponseDirective.RESET)) &
            ((responseDirective == ResponseDirective.CONTAIN) implies
              (responseSnapshot.directive == SnapshotResponseDirective.CONTAIN)) &
            ((responseDirective == ResponseDirective.CANCEL_EGRESS) implies
              (responseSnapshot.directive == SnapshotResponseDirective.CANCEL_EGRESS)) &
            ((responseDirective == ResponseDirective.START_EGRESS) implies
              (responseSnapshot.directive == SnapshotResponseDirective.START_EGRESS)) &
            ((responseDirective == ResponseDirective.DEFEND) implies
              (responseSnapshot.directive == SnapshotResponseDirective.DEFEND)) &
            ((responseDirective == ResponseDirective.HOLD_BLOCKED) implies
              (responseSnapshot.directive == SnapshotResponseDirective.HOLD_BLOCKED)) &
            ((responseDirective == ResponseDirective.MONITOR) implies
              (responseSnapshot.directive == SnapshotResponseDirective.MONITOR)) &
            responseSnapshot.defenseCommand == SnapshotDefenseCommand.STANDBY &
            responseSnapshot.egressCommand == SnapshotEgressCommand.NONE;
      compute
        guarantee
          // @trace TYPE-08
          PRESERVE_RESPONSE_SNAPSHOT "The response snapshot preserves the controller's pre-state, next-state, directive, and commands":
            ((In(committedEgress) == EgressSessionState.IDLE) implies
              (responseSnapshot.preEgress == SnapshotPreEgressState.IDLE)) &
            ((In(committedEgress) == EgressSessionState.ORDERED) implies
              (responseSnapshot.preEgress == SnapshotPreEgressState.ORDERED)) &
            ((In(committedEgress) == EgressSessionState.MOVING) implies
              (responseSnapshot.preEgress == SnapshotPreEgressState.MOVING)) &
            ((In(committedEgress) == EgressSessionState.BLOCKED) implies
              (responseSnapshot.preEgress == SnapshotPreEgressState.BLOCKED)) &
            ((In(committedEgress) == EgressSessionState.ARRIVED) implies
              (responseSnapshot.preEgress == SnapshotPreEgressState.ARRIVED)) &
            ((committedEgress == EgressSessionState.IDLE) implies
              (responseSnapshot.nextEgress == SnapshotNextEgressState.IDLE)) &
            ((committedEgress == EgressSessionState.ORDERED) implies
              (responseSnapshot.nextEgress == SnapshotNextEgressState.ORDERED)) &
            ((committedEgress == EgressSessionState.MOVING) implies
              (responseSnapshot.nextEgress == SnapshotNextEgressState.MOVING)) &
            ((committedEgress == EgressSessionState.BLOCKED) implies
              (responseSnapshot.nextEgress == SnapshotNextEgressState.BLOCKED)) &
            ((committedEgress == EgressSessionState.ARRIVED) implies
              (responseSnapshot.nextEgress == SnapshotNextEgressState.ARRIVED)) &
            ((responseDirective == ResponseDirective.RESET) implies
              (responseSnapshot.directive == SnapshotResponseDirective.RESET)) &
            ((responseDirective == ResponseDirective.CONTAIN) implies
              (responseSnapshot.directive == SnapshotResponseDirective.CONTAIN)) &
            ((responseDirective == ResponseDirective.CANCEL_EGRESS) implies
              (responseSnapshot.directive == SnapshotResponseDirective.CANCEL_EGRESS)) &
            ((responseDirective == ResponseDirective.START_EGRESS) implies
              (responseSnapshot.directive == SnapshotResponseDirective.START_EGRESS)) &
            ((responseDirective == ResponseDirective.DEFEND) implies
              (responseSnapshot.directive == SnapshotResponseDirective.DEFEND)) &
            ((responseDirective == ResponseDirective.HOLD_BLOCKED) implies
              (responseSnapshot.directive == SnapshotResponseDirective.HOLD_BLOCKED)) &
            ((responseDirective == ResponseDirective.MONITOR) implies
              (responseSnapshot.directive == SnapshotResponseDirective.MONITOR)) &
            ((defenseCommand == DefenseCommand.STANDBY) implies
              (responseSnapshot.defenseCommand == SnapshotDefenseCommand.STANDBY)) &
            ((defenseCommand == DefenseCommand.ACTIVATE) implies
              (responseSnapshot.defenseCommand == SnapshotDefenseCommand.ACTIVATE)) &
            ((egressCommand == EgressCommand.NONE) implies
              (responseSnapshot.egressCommand == SnapshotEgressCommand.NONE)) &
            ((egressCommand == EgressCommand.INITIATE) implies
              (responseSnapshot.egressCommand == SnapshotEgressCommand.INITIATE)) &
            ((egressCommand == EgressCommand.CONTINUE) implies
              (responseSnapshot.egressCommand == SnapshotEgressCommand.CONTINUE)) &
            ((egressCommand == EgressCommand.HOLD) implies
              (responseSnapshot.egressCommand == SnapshotEgressCommand.HOLD)) &
            ((egressCommand == EgressCommand.CANCEL) implies
              (responseSnapshot.egressCommand == SnapshotEgressCommand.CANCEL));
        compute_cases
          // @trace CASE-19
          case CASE_19_EGRESS_STATE_AND_COMMAND_PRIORITY "Reset, arrival, cancellation, failure, continuation, retry, and ordinary state behavior fully assign state and both commands":
            guarantee
              ((responseDirective == ResponseDirective.RESET) implies
                (committedEgress == EgressSessionState.IDLE &
                 egressCommand == EgressCommand.NONE &
                 defenseCommand == DefenseCommand.STANDBY)) &
              ((responseDirective != ResponseDirective.RESET &
                ((In(committedEgress) == EgressSessionState.ORDERED) |
                 (In(committedEgress) == EgressSessionState.MOVING)) &
                egressProgress == EgressProgress.SAFE_DESTINATION_OBSERVED) implies
                (committedEgress == EgressSessionState.ARRIVED &
                 egressCommand == EgressCommand.HOLD &
                 defenseCommand == DefenseCommand.STANDBY)) &
              ((responseDirective != ResponseDirective.RESET &
                not((((In(committedEgress) == EgressSessionState.ORDERED) |
                      (In(committedEgress) == EgressSessionState.MOVING)) &
                     egressProgress == EgressProgress.SAFE_DESTINATION_OBSERVED)) &
                responseDirective == ResponseDirective.CANCEL_EGRESS) implies
                (committedEgress == EgressSessionState.IDLE &
                 egressCommand == EgressCommand.CANCEL &
                 defenseCommand == DefenseCommand.STANDBY)) &
              ((responseDirective != ResponseDirective.RESET &
                responseDirective != ResponseDirective.CANCEL_EGRESS &
                ((In(committedEgress) == EgressSessionState.ORDERED) |
                 (In(committedEgress) == EgressSessionState.MOVING)) &
                egressProgress == EgressProgress.FAILED) implies
                (committedEgress == EgressSessionState.BLOCKED &
                 egressCommand == EgressCommand.HOLD &
                 ((responseDirective == ResponseDirective.DEFEND) implies
                   (defenseCommand == DefenseCommand.ACTIVATE)) &
                 ((responseDirective != ResponseDirective.DEFEND) implies
                   (defenseCommand == DefenseCommand.STANDBY)))) &
              ((responseDirective != ResponseDirective.RESET &
                responseDirective != ResponseDirective.CANCEL_EGRESS &
                In(committedEgress) == EgressSessionState.ORDERED &
                egressProgress == EgressProgress.NOT_STARTED) implies
                (committedEgress == EgressSessionState.ORDERED &
                 egressCommand == EgressCommand.INITIATE &
                 defenseCommand == DefenseCommand.STANDBY)) &
              ((responseDirective != ResponseDirective.RESET &
                responseDirective != ResponseDirective.CANCEL_EGRESS &
                In(committedEgress) == EgressSessionState.ORDERED &
                egressProgress == EgressProgress.EN_ROUTE) implies
                (committedEgress == EgressSessionState.MOVING &
                 egressCommand == EgressCommand.CONTINUE &
                 defenseCommand == DefenseCommand.STANDBY)) &
              ((responseDirective != ResponseDirective.RESET &
                responseDirective != ResponseDirective.CANCEL_EGRESS &
                In(committedEgress) == EgressSessionState.MOVING &
                (egressProgress == EgressProgress.NOT_STARTED |
                 egressProgress == EgressProgress.EN_ROUTE)) implies
                (committedEgress == EgressSessionState.MOVING &
                 egressCommand == EgressCommand.CONTINUE &
                 defenseCommand == DefenseCommand.STANDBY)) &
              ((responseDirective != ResponseDirective.RESET &
                responseDirective != ResponseDirective.CANCEL_EGRESS &
                In(committedEgress) == EgressSessionState.BLOCKED &
                responseDirective == ResponseDirective.START_EGRESS) implies
                (committedEgress == EgressSessionState.ORDERED &
                 egressCommand == EgressCommand.INITIATE &
                 defenseCommand == DefenseCommand.STANDBY)) &
              ((responseDirective != ResponseDirective.RESET &
                responseDirective != ResponseDirective.CANCEL_EGRESS &
                In(committedEgress) == EgressSessionState.BLOCKED &
                responseDirective != ResponseDirective.START_EGRESS) implies
                (committedEgress == EgressSessionState.BLOCKED &
                 egressCommand == EgressCommand.HOLD &
                 ((responseDirective == ResponseDirective.DEFEND) implies
                   (defenseCommand == DefenseCommand.ACTIVATE)) &
                 ((responseDirective != ResponseDirective.DEFEND) implies
                   (defenseCommand == DefenseCommand.STANDBY)))) &
              ((responseDirective != ResponseDirective.RESET &
                responseDirective != ResponseDirective.CANCEL_EGRESS &
                In(committedEgress) == EgressSessionState.ARRIVED) implies
                (committedEgress == EgressSessionState.ARRIVED &
                 egressCommand == EgressCommand.HOLD &
                 defenseCommand == DefenseCommand.STANDBY)) &
              ((responseDirective != ResponseDirective.RESET &
                responseDirective != ResponseDirective.CANCEL_EGRESS &
                In(committedEgress) == EgressSessionState.IDLE &
                responseDirective == ResponseDirective.START_EGRESS) implies
                (committedEgress == EgressSessionState.ORDERED &
                 egressCommand == EgressCommand.INITIATE &
                 defenseCommand == DefenseCommand.STANDBY)) &
              ((responseDirective != ResponseDirective.RESET &
                responseDirective != ResponseDirective.CANCEL_EGRESS &
                In(committedEgress) == EgressSessionState.IDLE &
                responseDirective == ResponseDirective.DEFEND) implies
                (committedEgress == EgressSessionState.IDLE &
                 egressCommand == EgressCommand.NONE &
                 defenseCommand == DefenseCommand.ACTIVATE)) &
              ((responseDirective != ResponseDirective.RESET &
                responseDirective != ResponseDirective.CANCEL_EGRESS &
                In(committedEgress) == EgressSessionState.IDLE &
                responseDirective != ResponseDirective.START_EGRESS &
                responseDirective != ResponseDirective.DEFEND) implies
                (committedEgress == EgressSessionState.IDLE &
                 egressCommand == EgressCommand.NONE &
                 defenseCommand == DefenseCommand.STANDBY));
    }*/
  }

  // @trace PART-08
  part def ResponseStatusAssessor :> Thread {
    // @trace INT-15
    port responseSnapshot : DataPort { in :>> type : ResponseSnapshot; }
    // @trace INT-16
    port episodeSnapshot : DataPort { in :>> type : EpisodeSnapshot; }
    // @trace INT-20
    port responseStatus : DataPort { out :>> type : ResponseStatus; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace INIT-01
          INIT_RESPONSE_STATUS "Response status initializes quiet before logical evaluation":
            responseStatus == ResponseStatus.QUIET;
      compute
        compute_cases
          // @trace CASE-20
          case CASE_20_RESPONSE_STATUS_PRECEDENCE "Status derives evidence, egress, defense, and episode precedence across both owner snapshots":
            guarantee
              ((episodeSnapshot.assessment == SnapshotEvidenceAssessment.UNAVAILABLE) implies
                (responseStatus == ResponseStatus.EVIDENCE_UNAVAILABLE)) &
              ((episodeSnapshot.assessment != SnapshotEvidenceAssessment.UNAVAILABLE &
                responseSnapshot.nextEgress == SnapshotNextEgressState.ARRIVED) implies
                (responseStatus == ResponseStatus.ARRIVAL_OBSERVED)) &
              ((episodeSnapshot.assessment != SnapshotEvidenceAssessment.UNAVAILABLE &
                responseSnapshot.nextEgress == SnapshotNextEgressState.MOVING) implies
                (responseStatus == ResponseStatus.EGRESS_MOVING)) &
              ((episodeSnapshot.assessment != SnapshotEvidenceAssessment.UNAVAILABLE &
                responseSnapshot.nextEgress == SnapshotNextEgressState.ORDERED) implies
                (responseStatus == ResponseStatus.EGRESS_ORDERED)) &
              ((episodeSnapshot.assessment != SnapshotEvidenceAssessment.UNAVAILABLE &
                responseSnapshot.nextEgress == SnapshotNextEgressState.BLOCKED) implies
                (responseStatus == ResponseStatus.EGRESS_BLOCKED)) &
              ((episodeSnapshot.assessment != SnapshotEvidenceAssessment.UNAVAILABLE &
                responseSnapshot.nextEgress == SnapshotNextEgressState.IDLE &
                responseSnapshot.defenseCommand == SnapshotDefenseCommand.ACTIVATE) implies
                (responseStatus == ResponseStatus.DEFENDING)) &
              ((episodeSnapshot.assessment != SnapshotEvidenceAssessment.UNAVAILABLE &
                responseSnapshot.nextEgress == SnapshotNextEgressState.IDLE &
                responseSnapshot.defenseCommand != SnapshotDefenseCommand.ACTIVATE &
                episodeSnapshot.nextEpisode == SnapshotNextEpisodeState.CLEAR_PENDING) implies
                (responseStatus == ResponseStatus.CLEAR_PENDING)) &
              ((episodeSnapshot.assessment != SnapshotEvidenceAssessment.UNAVAILABLE &
                responseSnapshot.nextEgress == SnapshotNextEgressState.IDLE &
                responseSnapshot.defenseCommand != SnapshotDefenseCommand.ACTIVATE &
                episodeSnapshot.nextEpisode == SnapshotNextEpisodeState.WATCH) implies
                (responseStatus == ResponseStatus.WATCHING)) &
              ((episodeSnapshot.assessment != SnapshotEvidenceAssessment.UNAVAILABLE &
                responseSnapshot.nextEgress == SnapshotNextEgressState.IDLE &
                responseSnapshot.defenseCommand != SnapshotDefenseCommand.ACTIVATE &
                episodeSnapshot.nextEpisode == SnapshotNextEpisodeState.QUIET) implies
                (responseStatus == ResponseStatus.QUIET)) &
              ((episodeSnapshot.assessment != SnapshotEvidenceAssessment.UNAVAILABLE &
                responseSnapshot.nextEgress == SnapshotNextEgressState.IDLE &
                responseSnapshot.defenseCommand != SnapshotDefenseCommand.ACTIVATE &
                episodeSnapshot.nextEpisode == SnapshotNextEpisodeState.DECLARED) implies
                (responseStatus == ResponseStatus.THREAT_DECLARED));
    }*/
  }

  // @generated-support behavior-free physical container required by CONSTR-01
  part def ThreatResponseProcess :> Process {
    // @generated-support root-to-Process routing port for MON-01
    port threatObservation : DataPort { in :>> type : ThreatObservation; }
    // @generated-support root-to-Process routing port for MON-02
    port pilotDisposition : DataPort { in :>> type : PilotDisposition; }
    // @generated-support root-to-Process routing port for MON-03
    port defenseSupport : DataPort { in :>> type : DefenseSupportObservation; }
    // @generated-support root-to-Process routing port for MON-04
    port egressRoute : DataPort { in :>> type : EgressRouteObservation; }
    // @generated-support root-to-Process routing port for MON-05
    port egressProgress : DataPort { in :>> type : EgressProgress; }
    // @generated-support root-to-Process routing port for MON-06
    port responseAuthorization : DataPort { in :>> type : ResponseAuthorization; }
    // @generated-support Process-to-root routing port for CTRL-01
    port threatReport : DataPort { out :>> type : ThreatReport; }
    // @generated-support Process-to-root routing port for CTRL-02
    port defenseCommand : DataPort { out :>> type : DefenseCommand; }
    // @generated-support Process-to-root routing port for CTRL-03
    port egressCommand : DataPort { out :>> type : EgressCommand; }
    // @generated-support Process-to-root routing port for CTRL-04
    port responseStatus : DataPort { out :>> type : ResponseStatus; }

    // @trace PART-01
    part threatEvidenceQualifier : ThreatEvidenceQualifier;
    // @trace PART-02
    part threatEpisodeTracker : ThreatEpisodeTracker;
    // @trace PART-03
    part threatReportPolicy : ThreatReportPolicy;
    // @trace PART-04
    part defenseReadinessQualifier : DefenseReadinessQualifier;
    // @trace PART-05
    part egressReadinessQualifier : EgressReadinessQualifier;
    // @trace PART-06
    part threatResponseArbiter : ThreatResponseArbiter;
    // @trace PART-07
    part responseStateController : ResponseStateController;
    // @trace PART-08
    part responseStatusAssessor : ResponseStatusAssessor;

    // @trace INT-01
    connection int01 : PortConnection connect threatObservation to threatEvidenceQualifier.threatObservation;
    // @trace INT-02
    connection int02 : PortConnection connect pilotDisposition to threatEpisodeTracker.pilotDisposition;
    // @trace INT-03
    connection int03 : PortConnection connect defenseSupport to defenseReadinessQualifier.defenseSupport;
    // @trace INT-04
    connection int04 : PortConnection connect egressRoute to egressReadinessQualifier.egressRoute;
    // @trace INT-05
    connection int05 : PortConnection connect egressProgress to responseStateController.egressProgress;
    // @trace INT-06
    connection int06 : PortConnection connect responseAuthorization to threatResponseArbiter.responseAuthorization;
    // @trace INT-07
    connection int07 : PortConnection connect threatEvidenceQualifier.evidenceAssessment to threatEpisodeTracker.evidenceAssessment;
    // @trace INT-08
    connection int08 : PortConnection connect threatEpisodeTracker.episodeSnapshot to threatReportPolicy.episodeSnapshot;
    // @trace INT-09
    connection int09 : PortConnection connect threatEvidenceQualifier.evidenceAssessment to defenseReadinessQualifier.evidenceAssessment;
    // @trace INT-10
    connection int10 : PortConnection connect defenseReadinessQualifier.defenseQualification to threatResponseArbiter.defenseQualification;
    // @trace INT-11
    connection int11 : PortConnection connect threatEvidenceQualifier.evidenceAssessment to egressReadinessQualifier.evidenceAssessment;
    // @trace INT-12
    connection int12 : PortConnection connect egressReadinessQualifier.egressQualification to threatResponseArbiter.egressQualification;
    // @trace INT-13
    connection int13 : PortConnection connect threatEpisodeTracker.episodeSnapshot to threatResponseArbiter.episodeSnapshot;
    // @trace INT-14
    connection int14 : PortConnection connect threatResponseArbiter.responseDirective to responseStateController.responseDirective;
    // @trace INT-15
    connection int15 : PortConnection connect responseStateController.responseSnapshot to responseStatusAssessor.responseSnapshot;
    // @trace INT-16
    connection int16 : PortConnection connect threatEpisodeTracker.episodeSnapshot to responseStatusAssessor.episodeSnapshot;
    // @trace INT-17
    connection int17 : PortConnection connect threatReportPolicy.threatReport to threatReport;
    // @trace INT-18
    connection int18 : PortConnection connect responseStateController.defenseCommand to defenseCommand;
    // @trace INT-19
    connection int19 : PortConnection connect responseStateController.egressCommand to egressCommand;
    // @trace INT-20
    connection int20 : PortConnection connect responseStatusAssessor.responseStatus to responseStatus;
  }

  // @trace SCOPE-IN-01
  part def FrigateThreatEgressSupervisor :> System {
    // @trace MON-01
    port threatObservation : DataPort { in :>> type : ThreatObservation; }
    // @trace MON-02
    port pilotDisposition : DataPort { in :>> type : PilotDisposition; }
    // @trace MON-03
    port defenseSupport : DataPort { in :>> type : DefenseSupportObservation; }
    // @trace MON-04
    port egressRoute : DataPort { in :>> type : EgressRouteObservation; }
    // @trace MON-05
    port egressProgress : DataPort { in :>> type : EgressProgress; }
    // @trace MON-06
    port responseAuthorization : DataPort { in :>> type : ResponseAuthorization; }
    // @trace CTRL-01
    port threatReport : DataPort { out :>> type : ThreatReport; }
    // @trace CTRL-02
    port defenseCommand : DataPort { out :>> type : DefenseCommand; }
    // @trace CTRL-03
    port egressCommand : DataPort { out :>> type : EgressCommand; }
    // @trace CTRL-04
    port responseStatus : DataPort { out :>> type : ResponseStatus; }

    // @generated-support behavior-free containment usage required by CONSTR-01
    part threatResponseProcess : ThreatResponseProcess;

    // @generated-support support route for MON-01
    connection supportThreatObservation : PortConnection connect threatObservation to threatResponseProcess.threatObservation;
    // @generated-support support route for MON-02
    connection supportPilotDisposition : PortConnection connect pilotDisposition to threatResponseProcess.pilotDisposition;
    // @generated-support support route for MON-03
    connection supportDefense : PortConnection connect defenseSupport to threatResponseProcess.defenseSupport;
    // @generated-support support route for MON-04
    connection supportRoute : PortConnection connect egressRoute to threatResponseProcess.egressRoute;
    // @generated-support support route for MON-05
    connection supportProgress : PortConnection connect egressProgress to threatResponseProcess.egressProgress;
    // @generated-support support route for MON-06
    connection supportAuthorization : PortConnection connect responseAuthorization to threatResponseProcess.responseAuthorization;
    // @generated-support support route for CTRL-01
    connection supportThreatReport : PortConnection connect threatResponseProcess.threatReport to threatReport;
    // @generated-support support route for CTRL-02
    connection supportDefenseCommand : PortConnection connect threatResponseProcess.defenseCommand to defenseCommand;
    // @generated-support support route for CTRL-03
    connection supportEgressCommand : PortConnection connect threatResponseProcess.egressCommand to egressCommand;
    // @generated-support support route for CTRL-04
    connection supportResponseStatus : PortConnection connect threatResponseProcess.responseStatus to responseStatus;
  }

  // @trace SCOPE-IN-01
  part frigateThreatEgressSupervisor : FrigateThreatEgressSupervisor;
}
