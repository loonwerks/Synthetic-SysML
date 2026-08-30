package Frigate_Threat_Response_Coordinator {

  private import HAMR::*;

  // @trace MON-01
  enum def ContactClass { enum NO_CONTACT; enum UNCERTAIN; enum HOSTILE_SIGNATURE; }
  // @trace MON-01
  enum def EvidenceStatus { enum VALID; enum INVALID; }
  // @trace MON-02
  enum def DefenseAuthority { enum NONE; enum ENABLE; enum RESET; }
  // @trace MON-02
  enum def EscapeAuthority { enum NONE; enum ENABLE; enum RESET; }
  // @trace MON-03
  enum def DefenseOutcome { enum NONE; enum COMMAND_SUCCEEDED; enum COMMAND_FAILED; enum RECOVERY_CONFIRMED; }
  // @trace MON-04
  enum def RouteStatus { enum UNAVAILABLE; enum READY; }
  // @trace MON-04
  enum def EscapeOutcome { enum NONE; enum DEPARTURE_SUCCEEDED; enum DEPARTURE_FAILED; enum RECOVERY_CONFIRMED; }
  // @trace MON-05
  enum def MiningInterlock { enum CLEAR; enum BLOCKED; }

  // @trace TYPE-01
  enum def ThreatBand { enum CLEAR; enum CAUTION; enum HOSTILE; }
  // @trace TYPE-01
  enum def ThreatValidity { enum USABLE; enum UNUSABLE; }
  // @trace TYPE-02
  enum def AlertState { enum QUIET; enum WATCH; enum ALARM; }
  // @trace TYPE-03
  enum def ChannelState { enum AVAILABLE; enum ISOLATED; enum PROBATION; }
  // @trace TYPE-03
  enum def ChannelGate { enum OPEN; enum BLOCKED; }
  // @trace CTRL-01
  enum def DefenseChannelCondition { enum AVAILABLE; enum ISOLATED; enum PROBATION; }
  // @trace CTRL-01
  enum def EscapeChannelCondition { enum AVAILABLE; enum ISOLATED; enum PROBATION; }
  // @trace TYPE-04
  enum def DefenseProposal { enum STANDBY; enum ACTIVATE; }
  // @trace TYPE-04
  enum def EscapeProposal { enum STAY; enum DEPART; }
  // @trace TYPE-05
  enum def ResponsePattern { enum OBSERVE; enum DEFENSE; enum DEPARTURE; }
  // @trace TYPE-06
  enum def ThreatReport { enum UNKNOWN; enum CLEAR; enum CAUTION; enum HOSTILE; }
  // @trace TYPE-06
  enum def DefenseDirective { enum STANDBY; enum ACTIVATE; }
  // @trace TYPE-06
  enum def EscapeDirective { enum STAY; enum DEPART; }
  // @trace TYPE-07
  enum def ResponseStage { enum INITIALIZING; enum MONITORING; enum RESPONDING; enum DEGRADED; enum EVIDENCE_FAULT; }

  // Every record member inspected by a final GUMBO expression is an attribute.
  // @trace MON-01
  part def ThreatEvidence :> Data {
    // @trace MON-01
    attribute contactClass : ContactClass;
    // @trace MON-01
    attribute evidenceStatus : EvidenceStatus;
  }
  // @trace TYPE-01
  part def QualifiedThreat :> Data {
    // @trace TYPE-01
    attribute band : ThreatBand;
    // @trace TYPE-01
    attribute validity : ThreatValidity;
  }
  // @trace TYPE-08
  part def DefenseReadinessContext :> Data {
    // @trace MON-03
    attribute defenseAvailable : Boolean;
    // @trace MON-03
    attribute capacitorAdequate : Boolean;
  }
  // @trace CTRL-01
  part def ResponseFrame :> Data {
    // @trace TYPE-06
    attribute threatReport : ThreatReport;
    // @trace TYPE-06
    attribute defenseDirective : DefenseDirective;
    // @trace TYPE-06
    attribute escapeDirective : EscapeDirective;
    // @trace TYPE-05
    attribute responsePattern : ResponsePattern;
    // @trace TYPE-07
    attribute responseStage : ResponseStage;
    // @trace STATE-02
    attribute defenseCondition : DefenseChannelCondition;
    // @trace STATE-03
    attribute escapeCondition : EscapeChannelCondition;
  }

  // @trace PART-01
  part def ThreatEvidenceContext :> Abstract {
    // @trace INT-01
    port threatEvidenceOut : DataPort { out :>> type : ThreatEvidence; }
  }

  // @trace PART-02
  part def PilotAuthorityContext :> Abstract {
    // @trace INT-03
    port clearAcknowledgmentOut : DataPort { out :>> type : Boolean; }
    // @trace INT-04
    // @trace INT-18
    port defenseAuthorityOut : DataPort { out :>> type : DefenseAuthority; }
    // @trace INT-07
    // @trace INT-21
    port escapeAuthorityOut : DataPort { out :>> type : EscapeAuthority; }
    // @trace INT-30
    port responseFrameIn : DataPort { in :>> type : ResponseFrame; }
  }

  // @trace PART-03
  part def DefenseExecutionContext :> Abstract {
    // @trace INT-10
    port readinessContextOut : DataPort { out :>> type : DefenseReadinessContext; }
    // @trace INT-05
    port defenseOutcomeOut : DataPort { out :>> type : DefenseOutcome; }
    // @trace INT-31
    port responseFrameIn : DataPort { in :>> type : ResponseFrame; }
  }

  // @trace PART-04
  part def NavigationExecutionContext :> Abstract {
    // @trace INT-12
    port navigationAvailableOut : DataPort { out :>> type : Boolean; }
    // @trace INT-13
    port routeStatusOut : DataPort { out :>> type : RouteStatus; }
    // @trace INT-08
    port escapeOutcomeOut : DataPort { out :>> type : EscapeOutcome; }
    // @trace INT-32
    port responseFrameIn : DataPort { in :>> type : ResponseFrame; }
  }

  // @trace PART-05
  part def MiningInterlockContext :> Abstract {
    // @trace INT-14
    port miningInterlockOut : DataPort { out :>> type : MiningInterlock; }
  }

  // @trace PART-06
  part def ThreatQualification :> Thread {
    // @trace INT-01
    port threatEvidenceIn : DataPort { in :>> type : ThreatEvidence; }
    // @trace INT-02
    port qualifiedThreatToAlertOut : DataPort { out :>> type : QualifiedThreat; }
    // @trace INT-06
    port threatValidityToDefenseOut : DataPort { out :>> type : ThreatValidity; }
    // @trace INT-09
    port threatValidityToEscapeOut : DataPort { out :>> type : ThreatValidity; }

    // @trace BEH-01
    language "GUMBO" /*{
      initialize
        // @trace GOAL-01
        guarantee INITIAL_QUALIFICATION "No evidence is usable before evaluation":
          qualifiedThreatToAlertOut.band == ThreatBand.CAUTION &
          qualifiedThreatToAlertOut.validity == ThreatValidity.UNUSABLE &
          threatValidityToDefenseOut == ThreatValidity.UNUSABLE &
          threatValidityToEscapeOut == ThreatValidity.UNUSABLE;
      compute
        // @trace FAULT-03
        guarantee VALIDITY_FANOUT "Both recovery owners consume the qualifier's one validity fact":
          threatValidityToDefenseOut == qualifiedThreatToAlertOut.validity &
          threatValidityToEscapeOut == qualifiedThreatToAlertOut.validity;
        compute_cases
          // @trace CASE-01
          case CASE_01_INVALID "Invalid evidence is conservative and unusable":
            assume threatEvidenceIn.evidenceStatus == EvidenceStatus.INVALID;
            guarantee qualifiedThreatToAlertOut.band == ThreatBand.CAUTION &
                      qualifiedThreatToAlertOut.validity == ThreatValidity.UNUSABLE;
          // @trace CASE-02
          case CASE_02_CLEAR "Valid no-contact evidence is clear and usable":
            assume threatEvidenceIn.evidenceStatus == EvidenceStatus.VALID &
                   threatEvidenceIn.contactClass == ContactClass.NO_CONTACT;
            guarantee qualifiedThreatToAlertOut.band == ThreatBand.CLEAR &
                      qualifiedThreatToAlertOut.validity == ThreatValidity.USABLE;
          // @trace CASE-03
          case CASE_03_CAUTION "Valid uncertain evidence is caution and usable":
            assume threatEvidenceIn.evidenceStatus == EvidenceStatus.VALID &
                   threatEvidenceIn.contactClass == ContactClass.UNCERTAIN;
            guarantee qualifiedThreatToAlertOut.band == ThreatBand.CAUTION &
                      qualifiedThreatToAlertOut.validity == ThreatValidity.USABLE;
          // @trace CASE-04
          case CASE_04_HOSTILE "Valid hostile-signature evidence is hostile and usable":
            assume threatEvidenceIn.evidenceStatus == EvidenceStatus.VALID &
                   threatEvidenceIn.contactClass == ContactClass.HOSTILE_SIGNATURE;
            guarantee qualifiedThreatToAlertOut.band == ThreatBand.HOSTILE &
                      qualifiedThreatToAlertOut.validity == ThreatValidity.USABLE;
    }*/
  }

  // @trace PART-07
  part def AlertMemory :> Thread {
    // @trace INT-02
    port qualifiedThreatIn : DataPort { in :>> type : QualifiedThreat; }
    // @trace INT-03
    port clearAcknowledgmentIn : DataPort { in :>> type : Boolean; }
    // @trace INT-16
    port defenseAlertOut : DataPort { out :>> type : AlertState; }
    // @trace INT-19
    port escapeAlertOut : DataPort { out :>> type : AlertState; }
    // @trace INT-27
    port compositionAlertOut : DataPort { out :>> type : AlertState; }
    // @trace INT-27
    port threatReportOut : DataPort { out :>> type : ThreatReport; }

    // @trace STATE-01
    language "GUMBO" /*{
      state
        // @trace STATE-01
        retainedAlert : AlertState;
      initialize
        modifies retainedAlert;
        // @trace CONSTR-04
        guarantee INITIAL_ALERT "Alert memory initializes quiet and public reporting initializes unknown":
          retainedAlert == AlertState.QUIET &
          defenseAlertOut == AlertState.QUIET & escapeAlertOut == AlertState.QUIET &
          compositionAlertOut == AlertState.QUIET & threatReportOut == ThreatReport.UNKNOWN;
      compute
        modifies retainedAlert;
        // @trace CONSTR-03
        guarantee ACTUAL_ALERT_PUBLICATION "Every downstream owner consumes the committed same-evaluation alert":
          defenseAlertOut == retainedAlert & escapeAlertOut == retainedAlert &
          compositionAlertOut == retainedAlert;
        // @trace PART-07
        guarantee ALERT_REPORT_MAPPING "The alert owner derives unknown only for unusable evidence and otherwise reports its committed alert":
          ((qualifiedThreatIn.validity == ThreatValidity.UNUSABLE &
            threatReportOut == ThreatReport.UNKNOWN) |
           (qualifiedThreatIn.validity == ThreatValidity.USABLE &
            retainedAlert == AlertState.QUIET & threatReportOut == ThreatReport.CLEAR) |
           (qualifiedThreatIn.validity == ThreatValidity.USABLE &
            retainedAlert == AlertState.WATCH & threatReportOut == ThreatReport.CAUTION) |
           (qualifiedThreatIn.validity == ThreatValidity.USABLE &
            retainedAlert == AlertState.ALARM & threatReportOut == ThreatReport.HOSTILE));
        compute_cases
          // @trace CASE-05
          case CASE_05_UNUSABLE "Unusable evidence preserves the previous alert":
            assume qualifiedThreatIn.validity == ThreatValidity.UNUSABLE;
            guarantee retainedAlert == In(retainedAlert);
          // @trace CASE-06
          case CASE_06_HOSTILE "Usable hostile evidence dominates acknowledgement and selects alarm":
            assume qualifiedThreatIn.validity == ThreatValidity.USABLE &
                   qualifiedThreatIn.band == ThreatBand.HOSTILE;
            guarantee retainedAlert == AlertState.ALARM;
          // @trace CASE-07
          case CASE_07_ALARM_ACK_CLEAR "A fresh clear acknowledgement moves retained alarm to watch":
            assume qualifiedThreatIn.validity == ThreatValidity.USABLE &
                   qualifiedThreatIn.band == ThreatBand.CLEAR &
                   In(retainedAlert) == AlertState.ALARM & clearAcknowledgmentIn;
            guarantee retainedAlert == AlertState.WATCH;
          // @trace CASE-08
          case CASE_08_RETAIN_ALARM "A retained alarm otherwise remains alarm":
            assume qualifiedThreatIn.validity == ThreatValidity.USABLE &
                   qualifiedThreatIn.band != ThreatBand.HOSTILE &
                   In(retainedAlert) == AlertState.ALARM &
                   not (qualifiedThreatIn.band == ThreatBand.CLEAR & clearAcknowledgmentIn);
            guarantee retainedAlert == AlertState.ALARM;
          // @trace CASE-09
          case CASE_09_WATCH "Caution or unacknowledged retained watch selects watch":
            assume qualifiedThreatIn.validity == ThreatValidity.USABLE &
                   qualifiedThreatIn.band != ThreatBand.HOSTILE &
                   In(retainedAlert) != AlertState.ALARM &
                   (qualifiedThreatIn.band == ThreatBand.CAUTION |
                    (In(retainedAlert) == AlertState.WATCH &
                     not (qualifiedThreatIn.band == ThreatBand.CLEAR & clearAcknowledgmentIn)));
            guarantee retainedAlert == AlertState.WATCH;
          // @trace CASE-10
          case CASE_10_QUIET "Every remaining usable combination selects quiet":
            assume qualifiedThreatIn.validity == ThreatValidity.USABLE &
                   qualifiedThreatIn.band == ThreatBand.CLEAR &
                   In(retainedAlert) != AlertState.ALARM &
                   (In(retainedAlert) == AlertState.QUIET | clearAcknowledgmentIn);
            guarantee retainedAlert == AlertState.QUIET;
    }*/
  }

  // @trace PART-08
  part def DefenseChannelRecovery :> Thread {
    // @trace INT-04
    port defenseAuthorityIn : DataPort { in :>> type : DefenseAuthority; }
    // @trace INT-05
    port defenseOutcomeIn : DataPort { in :>> type : DefenseOutcome; }
    // @trace INT-06
    port threatValidityIn : DataPort { in :>> type : ThreatValidity; }
    // @trace INT-11
    port defenseGateOut : DataPort { out :>> type : ChannelGate; }
    // @trace INT-28
    port defenseChannelStateOut : DataPort { out :>> type : ChannelState; }

    // @trace STATE-02
    language "GUMBO" /*{
      state
        // @trace STATE-02
        defenseRecoveryState : ChannelState;
      initialize
        modifies defenseRecoveryState;
        // @trace CONSTR-04
        guarantee INITIAL_DEFENSE_CHANNEL "Defense initializes available and open":
          defenseRecoveryState == ChannelState.AVAILABLE &
          defenseChannelStateOut == ChannelState.AVAILABLE &
          defenseGateOut == ChannelGate.OPEN;
      compute
        modifies defenseRecoveryState;
        // @trace PART-08
        guarantee DEFENSE_STATE_PUBLICATION "The published defense state is the committed owner state":
          defenseChannelStateOut == defenseRecoveryState;
        compute_cases
          // @trace CASE-11
          case CASE_11_DEFENSE_ISOLATE "Unusable evidence or command failure dominates recovery":
            assume threatValidityIn == ThreatValidity.UNUSABLE |
                   defenseOutcomeIn == DefenseOutcome.COMMAND_FAILED;
            guarantee defenseRecoveryState == ChannelState.ISOLATED &
                      defenseGateOut == ChannelGate.BLOCKED;
          // @trace CASE-12
          case CASE_12_DEFENSE_RESET "A fresh reset moves isolated defense to blocked probation":
            assume threatValidityIn == ThreatValidity.USABLE &
                   defenseOutcomeIn != DefenseOutcome.COMMAND_FAILED &
                   In(defenseRecoveryState) == ChannelState.ISOLATED &
                   defenseAuthorityIn == DefenseAuthority.RESET;
            guarantee defenseRecoveryState == ChannelState.PROBATION &
                      defenseGateOut == ChannelGate.BLOCKED;
          // @trace CASE-13
          case CASE_13_DEFENSE_CONFIRM "Later confirmation restores available state but keeps this evaluation blocked":
            assume threatValidityIn == ThreatValidity.USABLE &
                   defenseOutcomeIn != DefenseOutcome.COMMAND_FAILED &
                   In(defenseRecoveryState) == ChannelState.PROBATION &
                   defenseOutcomeIn == DefenseOutcome.RECOVERY_CONFIRMED;
            guarantee defenseRecoveryState == ChannelState.AVAILABLE &
                      defenseGateOut == ChannelGate.BLOCKED;
          // @trace CASE-14
          case CASE_14_DEFENSE_RETAIN "Every other defense valuation preserves state and opens only available state":
            assume threatValidityIn == ThreatValidity.USABLE &
                   defenseOutcomeIn != DefenseOutcome.COMMAND_FAILED &
                   not (In(defenseRecoveryState) == ChannelState.ISOLATED &
                        defenseAuthorityIn == DefenseAuthority.RESET) &
                   not (In(defenseRecoveryState) == ChannelState.PROBATION &
                        defenseOutcomeIn == DefenseOutcome.RECOVERY_CONFIRMED);
            guarantee defenseRecoveryState == In(defenseRecoveryState) &
                      ((defenseRecoveryState == ChannelState.AVAILABLE & defenseGateOut == ChannelGate.OPEN) |
                       (defenseRecoveryState != ChannelState.AVAILABLE & defenseGateOut == ChannelGate.BLOCKED));
    }*/
  }

  // @trace PART-09
  part def EscapeChannelRecovery :> Thread {
    // @trace INT-07
    port escapeAuthorityIn : DataPort { in :>> type : EscapeAuthority; }
    // @trace INT-08
    port escapeOutcomeIn : DataPort { in :>> type : EscapeOutcome; }
    // @trace INT-09
    port threatValidityIn : DataPort { in :>> type : ThreatValidity; }
    // @trace INT-15
    port escapeGateOut : DataPort { out :>> type : ChannelGate; }
    // @trace INT-29
    port escapeChannelStateOut : DataPort { out :>> type : ChannelState; }

    // @trace STATE-03
    language "GUMBO" /*{
      state
        // @trace STATE-03
        escapeRecoveryState : ChannelState;
      initialize
        modifies escapeRecoveryState;
        // @trace CONSTR-04
        guarantee INITIAL_ESCAPE_CHANNEL "Escape initializes available and open":
          escapeRecoveryState == ChannelState.AVAILABLE &
          escapeChannelStateOut == ChannelState.AVAILABLE &
          escapeGateOut == ChannelGate.OPEN;
      compute
        modifies escapeRecoveryState;
        // @trace PART-09
        guarantee ESCAPE_STATE_PUBLICATION "The published escape state is the committed owner state":
          escapeChannelStateOut == escapeRecoveryState;
        compute_cases
          // @trace CASE-15
          case CASE_15_ESCAPE_ISOLATE "Unusable evidence or departure failure dominates recovery":
            assume threatValidityIn == ThreatValidity.UNUSABLE |
                   escapeOutcomeIn == EscapeOutcome.DEPARTURE_FAILED;
            guarantee escapeRecoveryState == ChannelState.ISOLATED &
                      escapeGateOut == ChannelGate.BLOCKED;
          // @trace CASE-16
          case CASE_16_ESCAPE_RESET "A fresh reset moves isolated escape to blocked probation":
            assume threatValidityIn == ThreatValidity.USABLE &
                   escapeOutcomeIn != EscapeOutcome.DEPARTURE_FAILED &
                   In(escapeRecoveryState) == ChannelState.ISOLATED &
                   escapeAuthorityIn == EscapeAuthority.RESET;
            guarantee escapeRecoveryState == ChannelState.PROBATION &
                      escapeGateOut == ChannelGate.BLOCKED;
          // @trace CASE-17
          case CASE_17_ESCAPE_CONFIRM "Later confirmation restores available state but keeps this evaluation blocked":
            assume threatValidityIn == ThreatValidity.USABLE &
                   escapeOutcomeIn != EscapeOutcome.DEPARTURE_FAILED &
                   In(escapeRecoveryState) == ChannelState.PROBATION &
                   escapeOutcomeIn == EscapeOutcome.RECOVERY_CONFIRMED;
            guarantee escapeRecoveryState == ChannelState.AVAILABLE &
                      escapeGateOut == ChannelGate.BLOCKED;
          // @trace CASE-18
          case CASE_18_ESCAPE_RETAIN "Every other escape valuation preserves state and opens only available state":
            assume threatValidityIn == ThreatValidity.USABLE &
                   escapeOutcomeIn != EscapeOutcome.DEPARTURE_FAILED &
                   not (In(escapeRecoveryState) == ChannelState.ISOLATED &
                        escapeAuthorityIn == EscapeAuthority.RESET) &
                   not (In(escapeRecoveryState) == ChannelState.PROBATION &
                        escapeOutcomeIn == EscapeOutcome.RECOVERY_CONFIRMED);
            guarantee escapeRecoveryState == In(escapeRecoveryState) &
                      ((escapeRecoveryState == ChannelState.AVAILABLE & escapeGateOut == ChannelGate.OPEN) |
                       (escapeRecoveryState != ChannelState.AVAILABLE & escapeGateOut == ChannelGate.BLOCKED));
    }*/
  }

  // @trace PART-10
  part def DefenseReadiness :> Thread {
    // @trace INT-10
    port readinessContextIn : DataPort { in :>> type : DefenseReadinessContext; }
    // @trace INT-11
    port defenseGateIn : DataPort { in :>> type : ChannelGate; }
    // @trace INT-17
    port defenseReadyOut : DataPort { out :>> type : Boolean; }

    // @trace PART-10
    language "GUMBO" /*{
      initialize
        // @trace CONSTR-04
        guarantee INITIAL_DEFENSE_READINESS "Defense is not ready before evaluation":
          not defenseReadyOut;
      compute
        // @trace BEH-03
        guarantee DEFENSE_READINESS_EQUATION "Defense readiness is the exact local conjunction":
          defenseReadyOut ==
            (readinessContextIn.defenseAvailable &
             readinessContextIn.capacitorAdequate &
             defenseGateIn == ChannelGate.OPEN);
    }*/
  }

  // @trace PART-11
  part def DepartureReadiness :> Thread {
    // @trace INT-12
    port navigationAvailableIn : DataPort { in :>> type : Boolean; }
    // @trace INT-13
    port routeStatusIn : DataPort { in :>> type : RouteStatus; }
    // @trace INT-14
    port miningInterlockIn : DataPort { in :>> type : MiningInterlock; }
    // @trace INT-15
    port escapeGateIn : DataPort { in :>> type : ChannelGate; }
    // @trace INT-20
    port escapeReadyOut : DataPort { out :>> type : Boolean; }

    // @trace PART-11
    language "GUMBO" /*{
      initialize
        // @trace CONSTR-04
        guarantee INITIAL_ESCAPE_READINESS "Departure is not ready before evaluation":
          not escapeReadyOut;
      compute
        // @trace BEH-04
        guarantee ESCAPE_READINESS_EQUATION "Departure readiness is the exact local conjunction":
          escapeReadyOut ==
            (navigationAvailableIn & routeStatusIn == RouteStatus.READY &
             miningInterlockIn == MiningInterlock.CLEAR & escapeGateIn == ChannelGate.OPEN);
    }*/
  }

  // @trace PART-12
  part def DefenseActivationDecision :> Thread {
    // @trace INT-16
    port alertStateIn : DataPort { in :>> type : AlertState; }
    // @trace INT-17
    port defenseReadyIn : DataPort { in :>> type : Boolean; }
    // @trace INT-18
    port defenseAuthorityIn : DataPort { in :>> type : DefenseAuthority; }
    // @trace INT-22
    port defenseProposalToCoordinationOut : DataPort { out :>> type : DefenseProposal; }
    // @trace INT-25
    port defenseProposalToCompositionOut : DataPort { out :>> type : DefenseProposal; }

    // @trace PART-12
    language "GUMBO" /*{
      initialize
        // @trace CONSTR-04
        guarantee INITIAL_DEFENSE_PROPOSAL "Defense proposal initializes standby":
          defenseProposalToCoordinationOut == DefenseProposal.STANDBY &
          defenseProposalToCompositionOut == DefenseProposal.STANDBY;
      compute
        // @trace BEH-03
        guarantee DEFENSE_PROPOSAL_FANOUT "Coordination and composition consume one defense proposal":
          defenseProposalToCoordinationOut == defenseProposalToCompositionOut;
        compute_cases
          // @trace CASE-19
          case CASE_19_ACTIVATE "Watch or alarm with readiness and a fresh enable proposes activation":
            assume (alertStateIn == AlertState.WATCH | alertStateIn == AlertState.ALARM) &
                   defenseReadyIn & defenseAuthorityIn == DefenseAuthority.ENABLE;
            guarantee defenseProposalToCoordinationOut == DefenseProposal.ACTIVATE;
          // @trace CASE-20
          case CASE_20_STANDBY "Every other defense-decision valuation proposes standby":
            assume not ((alertStateIn == AlertState.WATCH | alertStateIn == AlertState.ALARM) &
                        defenseReadyIn & defenseAuthorityIn == DefenseAuthority.ENABLE);
            guarantee defenseProposalToCoordinationOut == DefenseProposal.STANDBY;
    }*/
  }

  // @trace PART-13
  part def DepartureInitiationDecision :> Thread {
    // @trace INT-19
    port alertStateIn : DataPort { in :>> type : AlertState; }
    // @trace INT-20
    port escapeReadyIn : DataPort { in :>> type : Boolean; }
    // @trace INT-21
    port escapeAuthorityIn : DataPort { in :>> type : EscapeAuthority; }
    // @trace INT-23
    port escapeProposalToCoordinationOut : DataPort { out :>> type : EscapeProposal; }
    // @trace INT-26
    port escapeProposalToCompositionOut : DataPort { out :>> type : EscapeProposal; }

    // @trace PART-13
    language "GUMBO" /*{
      initialize
        // @trace CONSTR-04
        guarantee INITIAL_ESCAPE_PROPOSAL "Escape proposal initializes stay":
          escapeProposalToCoordinationOut == EscapeProposal.STAY &
          escapeProposalToCompositionOut == EscapeProposal.STAY;
      compute
        // @trace BEH-04
        guarantee ESCAPE_PROPOSAL_FANOUT "Coordination and composition consume one escape proposal":
          escapeProposalToCoordinationOut == escapeProposalToCompositionOut;
        compute_cases
          // @trace CASE-21
          case CASE_21_DEPART "Alarm with readiness and a fresh enable proposes departure":
            assume alertStateIn == AlertState.ALARM & escapeReadyIn &
                   escapeAuthorityIn == EscapeAuthority.ENABLE;
            guarantee escapeProposalToCoordinationOut == EscapeProposal.DEPART;
          // @trace CASE-22
          case CASE_22_STAY "Every other departure-decision valuation proposes stay":
            assume not (alertStateIn == AlertState.ALARM & escapeReadyIn &
                        escapeAuthorityIn == EscapeAuthority.ENABLE);
            guarantee escapeProposalToCoordinationOut == EscapeProposal.STAY;
    }*/
  }

  // @trace PART-14
  part def ResponseCoordination :> Thread {
    // @trace INT-22
    port defenseProposalIn : DataPort { in :>> type : DefenseProposal; }
    // @trace INT-23
    port escapeProposalIn : DataPort { in :>> type : EscapeProposal; }
    // @trace INT-24
    port responsePatternOut : DataPort { out :>> type : ResponsePattern; }

    // @trace PART-14
    language "GUMBO" /*{
      initialize
        // @trace CONSTR-04
        guarantee INITIAL_PATTERN "Primary response initializes observe":
          responsePatternOut == ResponsePattern.OBSERVE;
      compute
        compute_cases
          // @trace CASE-23
          case CASE_23_DEPARTURE "Any departure proposal has primary priority":
            assume escapeProposalIn == EscapeProposal.DEPART;
            guarantee responsePatternOut == ResponsePattern.DEPARTURE;
          // @trace CASE-24
          case CASE_24_DEFENSE "Activation without departure selects defense":
            assume escapeProposalIn == EscapeProposal.STAY &
                   defenseProposalIn == DefenseProposal.ACTIVATE;
            guarantee responsePatternOut == ResponsePattern.DEFENSE;
          // @trace CASE-25
          case CASE_25_OBSERVE "No protective proposal selects observe":
            assume escapeProposalIn == EscapeProposal.STAY &
                   defenseProposalIn == DefenseProposal.STANDBY;
            guarantee responsePatternOut == ResponsePattern.OBSERVE;
    }*/
  }

  // @trace PART-15
  part def ReportFrameComposition :> Thread {
    // @trace INT-24
    port responsePatternIn : DataPort { in :>> type : ResponsePattern; }
    // @trace INT-25
    port defenseProposalIn : DataPort { in :>> type : DefenseProposal; }
    // @trace INT-26
    port escapeProposalIn : DataPort { in :>> type : EscapeProposal; }
    // @trace INT-27
    port alertStateIn : DataPort { in :>> type : AlertState; }
    // @trace INT-27
    port threatReportIn : DataPort { in :>> type : ThreatReport; }
    // @trace INT-28
    port defenseChannelStateIn : DataPort { in :>> type : ChannelState; }
    // @trace INT-29
    port escapeChannelStateIn : DataPort { in :>> type : ChannelState; }
    // @trace CTRL-01
    port responseFrameOut : DataPort { out :>> type : ResponseFrame; }

    // @trace PART-15
    language "GUMBO" /*{
      initialize
        // @trace CONSTR-04
        guarantee INITIAL_RESPONSE_FRAME "All consumers initialize to the exact safe frame":
          responseFrameOut.threatReport == ThreatReport.UNKNOWN &
          responseFrameOut.defenseDirective == DefenseDirective.STANDBY &
          responseFrameOut.escapeDirective == EscapeDirective.STAY &
          responseFrameOut.responsePattern == ResponsePattern.OBSERVE &
          responseFrameOut.responseStage == ResponseStage.INITIALIZING &
          responseFrameOut.defenseCondition == DefenseChannelCondition.AVAILABLE &
          responseFrameOut.escapeCondition == EscapeChannelCondition.AVAILABLE;
      compute
        // @trace BEH-06
        guarantee OWNER_RESULT_PRESERVATION "The composed pilot frame preserves upstream report pattern and actual channel states":
          responseFrameOut.threatReport == threatReportIn &
          responseFrameOut.responsePattern == responsePatternIn &
          ((defenseChannelStateIn == ChannelState.AVAILABLE &
            responseFrameOut.defenseCondition == DefenseChannelCondition.AVAILABLE) |
           (defenseChannelStateIn == ChannelState.ISOLATED &
            responseFrameOut.defenseCondition == DefenseChannelCondition.ISOLATED) |
           (defenseChannelStateIn == ChannelState.PROBATION &
            responseFrameOut.defenseCondition == DefenseChannelCondition.PROBATION)) &
          ((escapeChannelStateIn == ChannelState.AVAILABLE &
            responseFrameOut.escapeCondition == EscapeChannelCondition.AVAILABLE) |
           (escapeChannelStateIn == ChannelState.ISOLATED &
            responseFrameOut.escapeCondition == EscapeChannelCondition.ISOLATED) |
           (escapeChannelStateIn == ChannelState.PROBATION &
            responseFrameOut.escapeCondition == EscapeChannelCondition.PROBATION));
        // @trace BEH-06
        guarantee DIRECTIVE_MAPPINGS "Each directive is the one-to-one public form of its producing proposal":
          ((defenseProposalIn == DefenseProposal.ACTIVATE &
            responseFrameOut.defenseDirective == DefenseDirective.ACTIVATE) |
           (defenseProposalIn == DefenseProposal.STANDBY &
            responseFrameOut.defenseDirective == DefenseDirective.STANDBY)) &
          ((escapeProposalIn == EscapeProposal.DEPART &
            responseFrameOut.escapeDirective == EscapeDirective.DEPART) |
           (escapeProposalIn == EscapeProposal.STAY &
            responseFrameOut.escapeDirective == EscapeDirective.STAY));
        compute_cases
          // @trace CASE-26
          case CASE_26_EVIDENCE_FAULT "Unknown reporting selects evidence-fault stage":
            assume threatReportIn == ThreatReport.UNKNOWN;
            guarantee responseFrameOut.responseStage == ResponseStage.EVIDENCE_FAULT;
          // @trace CASE-27
          case CASE_27_DEGRADED "A non-unknown result with either channel unavailable selects degraded":
            assume threatReportIn != ThreatReport.UNKNOWN &
                   (defenseChannelStateIn != ChannelState.AVAILABLE |
                    escapeChannelStateIn != ChannelState.AVAILABLE);
            guarantee responseFrameOut.responseStage == ResponseStage.DEGRADED;
          // @trace CASE-28
          case CASE_28_MONITORING "Clear quiet results with both channels available select monitoring":
            assume threatReportIn == ThreatReport.CLEAR &
                   defenseChannelStateIn == ChannelState.AVAILABLE &
                   escapeChannelStateIn == ChannelState.AVAILABLE &
                   alertStateIn == AlertState.QUIET;
            guarantee responseFrameOut.responseStage == ResponseStage.MONITORING;
          // @trace CASE-29
          case CASE_29_RESPONDING "Caution-watch or hostile-alarm results with both channels available select responding":
            assume defenseChannelStateIn == ChannelState.AVAILABLE &
                   escapeChannelStateIn == ChannelState.AVAILABLE &
                   ((threatReportIn == ThreatReport.CAUTION & alertStateIn == AlertState.WATCH) |
                    (threatReportIn == ThreatReport.HOSTILE & alertStateIn == AlertState.ALARM));
            guarantee responseFrameOut.responseStage == ResponseStage.RESPONDING;
    }*/
  }

  // @generated-support Sole behavior-free containment element.
  part def ThreatResponseProcess :> Process {
    // @generated-support Boundary delegation ports for the five System-level contexts.
    port threatEvidenceIn : DataPort { in :>> type : ThreatEvidence; }
    // @generated-support Pilot acknowledgement delegation for INT-03.
    port clearAcknowledgmentIn : DataPort { in :>> type : Boolean; }
    // @generated-support Canonical defense-authority delegation for INT-04 and INT-18.
    port defenseAuthorityIn : DataPort { in :>> type : DefenseAuthority; }
    // @generated-support Canonical escape-authority delegation for INT-07 and INT-21.
    port escapeAuthorityIn : DataPort { in :>> type : EscapeAuthority; }
    // @generated-support Defense readiness-context delegation for INT-10.
    port readinessContextIn : DataPort { in :>> type : DefenseReadinessContext; }
    // @generated-support Defense outcome delegation for INT-05.
    port defenseOutcomeIn : DataPort { in :>> type : DefenseOutcome; }
    // @generated-support Navigation availability delegation for INT-12.
    port navigationAvailableIn : DataPort { in :>> type : Boolean; }
    // @generated-support Route status delegation for INT-13.
    port routeStatusIn : DataPort { in :>> type : RouteStatus; }
    // @generated-support Escape outcome delegation for INT-08.
    port escapeOutcomeIn : DataPort { in :>> type : EscapeOutcome; }
    // @generated-support Mining interlock delegation for INT-14.
    port miningInterlockIn : DataPort { in :>> type : MiningInterlock; }
    // @generated-support Complete response-frame delegation for INT-30 through INT-32.
    port responseFrameOut : DataPort { out :>> type : ResponseFrame; }
    // @trace PART-06
    part threatQualification : ThreatQualification;
    // @trace PART-07
    part alertMemory : AlertMemory;
    // @trace PART-08
    part defenseChannelRecovery : DefenseChannelRecovery;
    // @trace PART-09
    part escapeChannelRecovery : EscapeChannelRecovery;
    // @trace PART-10
    part defenseReadiness : DefenseReadiness;
    // @trace PART-11
    part departureReadiness : DepartureReadiness;
    // @trace PART-12
    part defenseActivationDecision : DefenseActivationDecision;
    // @trace PART-13
    part departureInitiationDecision : DepartureInitiationDecision;
    // @trace PART-14
    part responseCoordination : ResponseCoordination;
    // @trace PART-15
    part reportFrameComposition : ReportFrameComposition;

    // @generated-support INT-01 Process-to-owner delegation.
    connection support01 : PortConnection connect threatEvidenceIn to threatQualification.threatEvidenceIn;
    // @trace INT-02
    connection int02 : PortConnection connect threatQualification.qualifiedThreatToAlertOut to alertMemory.qualifiedThreatIn;
    // @generated-support INT-03 Process-to-owner delegation.
    connection support03 : PortConnection connect clearAcknowledgmentIn to alertMemory.clearAcknowledgmentIn;
    // @generated-support INT-04 Process-to-owner delegation.
    connection support04 : PortConnection connect defenseAuthorityIn to defenseChannelRecovery.defenseAuthorityIn;
    // @generated-support INT-05 Process-to-owner delegation.
    connection support05 : PortConnection connect defenseOutcomeIn to defenseChannelRecovery.defenseOutcomeIn;
    // @trace INT-06
    connection int06 : PortConnection connect threatQualification.threatValidityToDefenseOut to defenseChannelRecovery.threatValidityIn;
    // @generated-support INT-07 Process-to-owner delegation.
    connection support07 : PortConnection connect escapeAuthorityIn to escapeChannelRecovery.escapeAuthorityIn;
    // @generated-support INT-08 Process-to-owner delegation.
    connection support08 : PortConnection connect escapeOutcomeIn to escapeChannelRecovery.escapeOutcomeIn;
    // @trace INT-09
    connection int09 : PortConnection connect threatQualification.threatValidityToEscapeOut to escapeChannelRecovery.threatValidityIn;
    // @generated-support INT-10 Process-to-owner delegation.
    connection support10 : PortConnection connect readinessContextIn to defenseReadiness.readinessContextIn;
    // @trace INT-11
    connection int11 : PortConnection connect defenseChannelRecovery.defenseGateOut to defenseReadiness.defenseGateIn;
    // @generated-support INT-12 Process-to-owner delegation.
    connection support12 : PortConnection connect navigationAvailableIn to departureReadiness.navigationAvailableIn;
    // @generated-support INT-13 Process-to-owner delegation.
    connection support13 : PortConnection connect routeStatusIn to departureReadiness.routeStatusIn;
    // @generated-support INT-14 Process-to-owner delegation.
    connection support14 : PortConnection connect miningInterlockIn to departureReadiness.miningInterlockIn;
    // @trace INT-15
    connection int15 : PortConnection connect escapeChannelRecovery.escapeGateOut to departureReadiness.escapeGateIn;
    // @trace INT-16
    connection int16 : PortConnection connect alertMemory.defenseAlertOut to defenseActivationDecision.alertStateIn;
    // @trace INT-17
    connection int17 : PortConnection connect defenseReadiness.defenseReadyOut to defenseActivationDecision.defenseReadyIn;
    // @generated-support INT-18 Process-to-owner delegation.
    connection support18 : PortConnection connect defenseAuthorityIn to defenseActivationDecision.defenseAuthorityIn;
    // @trace INT-19
    connection int19 : PortConnection connect alertMemory.escapeAlertOut to departureInitiationDecision.alertStateIn;
    // @trace INT-20
    connection int20 : PortConnection connect departureReadiness.escapeReadyOut to departureInitiationDecision.escapeReadyIn;
    // @generated-support INT-21 Process-to-owner delegation.
    connection support21 : PortConnection connect escapeAuthorityIn to departureInitiationDecision.escapeAuthorityIn;
    // @trace INT-22
    connection int22 : PortConnection connect defenseActivationDecision.defenseProposalToCoordinationOut to responseCoordination.defenseProposalIn;
    // @trace INT-23
    connection int23 : PortConnection connect departureInitiationDecision.escapeProposalToCoordinationOut to responseCoordination.escapeProposalIn;
    // @trace INT-24
    connection int24 : PortConnection connect responseCoordination.responsePatternOut to reportFrameComposition.responsePatternIn;
    // @trace INT-25
    connection int25 : PortConnection connect defenseActivationDecision.defenseProposalToCompositionOut to reportFrameComposition.defenseProposalIn;
    // @trace INT-26
    connection int26 : PortConnection connect departureInitiationDecision.escapeProposalToCompositionOut to reportFrameComposition.escapeProposalIn;
    // @trace INT-27
    connection int27a : PortConnection connect alertMemory.compositionAlertOut to reportFrameComposition.alertStateIn;
    // @trace INT-27
    connection int27b : PortConnection connect alertMemory.threatReportOut to reportFrameComposition.threatReportIn;
    // @trace INT-28
    connection int28 : PortConnection connect defenseChannelRecovery.defenseChannelStateOut to reportFrameComposition.defenseChannelStateIn;
    // @trace INT-29
    connection int29 : PortConnection connect escapeChannelRecovery.escapeChannelStateOut to reportFrameComposition.escapeChannelStateIn;
    // @generated-support Composer-to-Process frame delegation for INT-30 through INT-32.
    connection supportFrame : PortConnection connect reportFrameComposition.responseFrameOut to responseFrameOut;
  }

  // @trace BOUND-01
  part def FrigateThreatResponseSystem :> System {
    // @trace PART-01
    part threatEvidenceContext : ThreatEvidenceContext;
    // @trace PART-02
    part pilotAuthorityContext : PilotAuthorityContext;
    // @trace PART-03
    part defenseExecutionContext : DefenseExecutionContext;
    // @trace PART-04
    part navigationExecutionContext : NavigationExecutionContext;
    // @trace PART-05
    part miningInterlockContext : MiningInterlockContext;
    // @generated-support The only behavior-free Process usage.
    part threatResponseProcess : ThreatResponseProcess;

    // @trace INT-01
    connection int01 : PortConnection connect threatEvidenceContext.threatEvidenceOut to threatResponseProcess.threatEvidenceIn;
    // @trace INT-03
    connection int03 : PortConnection connect pilotAuthorityContext.clearAcknowledgmentOut to threatResponseProcess.clearAcknowledgmentIn;
    // @trace INT-04
    // @trace INT-18
    connection int04and18 : PortConnection connect pilotAuthorityContext.defenseAuthorityOut to threatResponseProcess.defenseAuthorityIn;
    // @trace INT-05
    connection int05 : PortConnection connect defenseExecutionContext.defenseOutcomeOut to threatResponseProcess.defenseOutcomeIn;
    // @trace INT-07
    // @trace INT-21
    connection int07and21 : PortConnection connect pilotAuthorityContext.escapeAuthorityOut to threatResponseProcess.escapeAuthorityIn;
    // @trace INT-08
    connection int08 : PortConnection connect navigationExecutionContext.escapeOutcomeOut to threatResponseProcess.escapeOutcomeIn;
    // @trace INT-10
    connection int10 : PortConnection connect defenseExecutionContext.readinessContextOut to threatResponseProcess.readinessContextIn;
    // @trace INT-12
    connection int12 : PortConnection connect navigationExecutionContext.navigationAvailableOut to threatResponseProcess.navigationAvailableIn;
    // @trace INT-13
    connection int13 : PortConnection connect navigationExecutionContext.routeStatusOut to threatResponseProcess.routeStatusIn;
    // @trace INT-14
    connection int14 : PortConnection connect miningInterlockContext.miningInterlockOut to threatResponseProcess.miningInterlockIn;
    // @trace INT-30
    connection int30 : PortConnection connect threatResponseProcess.responseFrameOut to pilotAuthorityContext.responseFrameIn;
    // @trace INT-31
    connection int31 : PortConnection connect threatResponseProcess.responseFrameOut to defenseExecutionContext.responseFrameIn;
    // @trace INT-32
    connection int32 : PortConnection connect threatResponseProcess.responseFrameOut to navigationExecutionContext.responseFrameIn;
  }

  // @trace BOUND-01
  part frigateThreatResponseCoordinator : FrigateThreatResponseSystem;
}
