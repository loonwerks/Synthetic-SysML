// @trace SCOPE-IN-01
package Battery_Evidence_Charge_Qualification_Supervisor {
  private import HAMR::*;

  // @trace MON-01
  enum def BatteryCapacityBand {
    enum LOW;
    enum USABLE;
  }

  // @trace MON-02
  enum def BatteryCheck {
    enum INVALID;
    enum VALID;
  }

  // @trace MON-03
  enum def ChargerConnection {
    enum DISCONNECTED;
    enum CONNECTED;
  }

  // @trace MON-04
  enum def ChargeActivity {
    enum INACTIVE;
    enum ACTIVE;
  }

  // @trace MON-05
  enum def LifecycleContext {
    enum OFF;
    enum STANDBY;
    enum CHARGING;
    enum READY;
    enum FLYING;
  }

  // @trace MON-06
  enum def ChargeRequest {
    enum NO_REQUEST;
    enum REQUEST_CHARGE;
    enum CANCEL_CHARGE;
  }

  // @trace CTRL-01
  enum def ChargePermission {
    enum DISABLED;
    enum ENABLED;
  }

  // @trace CTRL-02
  enum def BatteryReadinessAdvice {
    enum UNAVAILABLE;
    enum NOT_READY;
    enum READY;
  }

  // @trace CTRL-03
  enum def FlightControlBatteryNotice {
    enum CLEAR;
    enum LOW_BATTERY;
    enum LOW_IN_FLIGHT_CONTEXT;
    enum EVIDENCE_UNAVAILABLE;
  }

  // @trace TYPE-01
  enum def BatteryAssessment {
    enum UNAVAILABLE;
    enum LOW;
    enum ADEQUATE;
  }

  // @trace TYPE-02
  enum def ChargerPathQualification {
    enum UNAVAILABLE;
    enum READY;
    enum ACTIVE;
  }

  // @trace TYPE-03
  enum def ChargeContextQualification {
    enum BLOCKED_EVIDENCE;
    enum BLOCKED_CONTEXT;
    enum ELIGIBLE;
  }

  // @trace TYPE-04
  enum def ChargeEligibilityEnvelope {
    enum ELIGIBLE;
    enum BLOCKED_EVIDENCE;
    enum RECOVER_EVIDENCE;
    enum BLOCKED_CHARGER;
    enum RECOVER_CHARGER;
    enum BLOCKED_CONTEXT;
    enum RECOVER_CONTEXT;
  }

  // @trace TYPE-05
  enum def ChargeDecision {
    enum NO_CHANGE;
    enum AUTHORIZE;
    enum TERMINATE;
    enum RECOVER_EVIDENCE;
    enum RECOVER_CHARGER;
    enum RECOVER_CONTEXT;
    enum REJECT_EVIDENCE;
    enum REJECT_CHARGER;
    enum REJECT_CONTEXT;
  }

  // @trace TYPE-06
  enum def ChargeSessionState {
    enum IDLE;
    enum ENABLED;
    enum SUSPENDED;
  }

  // @trace TYPE-07
  enum def ChargeDisposition {
    enum NO_CHANGE;
    enum ACCEPTED;
    enum REJECTED;
    enum RECOVERY_APPLIED;
  }

  // @trace TYPE-07
  enum def ChargeReason {
    enum NONE;
    enum CANCELLED;
    enum EVIDENCE_UNAVAILABLE;
    enum CHARGER_UNAVAILABLE;
    enum CONTEXT_INELIGIBLE;
  }

  // @trace TYPE-09
  enum def PilotAdvisory {
    enum NONE;
    enum EVIDENCE_UNAVAILABLE;
    enum CHARGER_UNAVAILABLE;
    enum CONTEXT_INELIGIBLE;
    enum ACTIVITY_WITHOUT_PERMISSION;
    enum CHARGE_RECOMMENDED;
    enum REQUEST_REJECTED;
  }

  // @trace TYPE-10
  enum def SnapshotPreSessionState {
    enum IDLE;
    enum ENABLED;
    enum SUSPENDED;
  }

  // @trace TYPE-10
  enum def SnapshotNextSessionState {
    enum IDLE;
    enum ENABLED;
    enum SUSPENDED;
  }

  // @trace TYPE-10
  enum def PilotSessionState {
    enum IDLE;
    enum ENABLED;
    enum SUSPENDED;
  }

  // @trace TYPE-10
  enum def SnapshotChargeDisposition {
    enum NO_CHANGE;
    enum ACCEPTED;
    enum REJECTED;
    enum RECOVERY_APPLIED;
  }

  // @trace TYPE-10
  enum def PilotChargeDisposition {
    enum NO_CHANGE;
    enum ACCEPTED;
    enum REJECTED;
    enum RECOVERY_APPLIED;
  }

  // @trace TYPE-08
  part def ChargeSessionSnapshot :> Data {
    // @trace TYPE-08
    attribute preSession : SnapshotPreSessionState;
    // @trace TYPE-08
    attribute nextSession : SnapshotNextSessionState;
    // @trace TYPE-08
    attribute disposition : SnapshotChargeDisposition;
    // @trace TYPE-08
    attribute reason : ChargeReason;
  }

  // @trace CTRL-04
  part def PilotBatteryStatus :> Data {
    // @trace CTRL-04
    attribute batteryAssessment : BatteryAssessment;
    // @trace CTRL-04
    attribute chargerPathQualification : ChargerPathQualification;
    // @trace CTRL-04
    attribute session : PilotSessionState;
    // @trace CTRL-04
    attribute disposition : PilotChargeDisposition;
    // @trace CTRL-04
    attribute advisory : PilotAdvisory;
  }

  // @trace PART-01
  part def BatteryEvidenceQualifier :> Thread {
    // @trace INT-01
    port batteryCapacity : DataPort { in :>> type : BatteryCapacityBand; }
    // @trace INT-02
    port batteryCheck : DataPort { in :>> type : BatteryCheck; }
    // @trace PART-01
    port batteryAssessment : DataPort { out :>> type : BatteryAssessment; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace INIT-01
          INIT_BATTERY_ASSESSMENT "Initial assessment follows the current battery inputs":
            ((batteryCheck == BatteryCheck.INVALID) implies
              (batteryAssessment == BatteryAssessment.UNAVAILABLE)) &
            ((batteryCheck == BatteryCheck.VALID & batteryCapacity == BatteryCapacityBand.LOW) implies
              (batteryAssessment == BatteryAssessment.LOW)) &
            ((batteryCheck == BatteryCheck.VALID & batteryCapacity == BatteryCapacityBand.USABLE) implies
              (batteryAssessment == BatteryAssessment.ADEQUATE));
      compute
        compute_cases
          // @trace CASE-01
          case CASE_01_INVALID_EVIDENCE "Invalid status makes either capacity band unavailable":
            assume batteryCheck == BatteryCheck.INVALID;
            guarantee batteryAssessment == BatteryAssessment.UNAVAILABLE;
          // @trace CASE-02
          case CASE_02_VALID_LOW "Valid low evidence is classified low":
            assume batteryCheck == BatteryCheck.VALID & batteryCapacity == BatteryCapacityBand.LOW;
            guarantee batteryAssessment == BatteryAssessment.LOW;
          // @trace CASE-03
          case CASE_03_VALID_USABLE "Valid usable evidence is classified adequate":
            assume batteryCheck == BatteryCheck.VALID & batteryCapacity == BatteryCapacityBand.USABLE;
            guarantee batteryAssessment == BatteryAssessment.ADEQUATE;
    }*/
  }

  // @trace PART-02
  part def ChargeContextQualifier :> Thread {
    // @trace INT-08
    port batteryAssessment : DataPort { in :>> type : BatteryAssessment; }
    // @trace INT-05
    port lifecycleContext : DataPort { in :>> type : LifecycleContext; }
    // @trace PART-02
    port chargeContextQualification : DataPort { out :>> type : ChargeContextQualification; }
    // @trace INT-19
    port batteryReadinessAdvice : DataPort { out :>> type : BatteryReadinessAdvice; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace INIT-01
          INIT_CONTEXT_AND_READINESS "Initial applicability and readiness follow current evidence and context":
            ((batteryAssessment == BatteryAssessment.UNAVAILABLE) implies
              (chargeContextQualification == ChargeContextQualification.BLOCKED_EVIDENCE &
               batteryReadinessAdvice == BatteryReadinessAdvice.UNAVAILABLE)) &
            ((batteryAssessment != BatteryAssessment.UNAVAILABLE &
              (lifecycleContext == LifecycleContext.STANDBY | lifecycleContext == LifecycleContext.CHARGING)) implies
              (chargeContextQualification == ChargeContextQualification.ELIGIBLE)) &
            ((batteryAssessment != BatteryAssessment.UNAVAILABLE &
              (lifecycleContext == LifecycleContext.OFF | lifecycleContext == LifecycleContext.READY |
               lifecycleContext == LifecycleContext.FLYING)) implies
              (chargeContextQualification == ChargeContextQualification.BLOCKED_CONTEXT)) &
            ((batteryAssessment == BatteryAssessment.LOW) implies
              (batteryReadinessAdvice == BatteryReadinessAdvice.NOT_READY)) &
            ((batteryAssessment == BatteryAssessment.ADEQUATE) implies
              (batteryReadinessAdvice == BatteryReadinessAdvice.READY));
      compute
        compute_cases
          // @trace CASE-07
          case CASE_07_UNAVAILABLE "Unavailable evidence blocks context and readiness":
            assume batteryAssessment == BatteryAssessment.UNAVAILABLE;
            guarantee chargeContextQualification == ChargeContextQualification.BLOCKED_EVIDENCE &
              batteryReadinessAdvice == BatteryReadinessAdvice.UNAVAILABLE;
          // @trace CASE-08
          case CASE_08_ELIGIBLE_CONTEXT "Trusted evidence in standby or charging is context-eligible":
            assume batteryAssessment != BatteryAssessment.UNAVAILABLE &
              (lifecycleContext == LifecycleContext.STANDBY | lifecycleContext == LifecycleContext.CHARGING);
            guarantee chargeContextQualification == ChargeContextQualification.ELIGIBLE &
              ((batteryAssessment == BatteryAssessment.LOW) implies
                (batteryReadinessAdvice == BatteryReadinessAdvice.NOT_READY)) &
              ((batteryAssessment == BatteryAssessment.ADEQUATE) implies
                (batteryReadinessAdvice == BatteryReadinessAdvice.READY));
          // @trace CASE-09
          case CASE_09_BLOCKED_CONTEXT "Trusted evidence outside standby or charging is context-blocked":
            assume batteryAssessment != BatteryAssessment.UNAVAILABLE &
              (lifecycleContext == LifecycleContext.OFF | lifecycleContext == LifecycleContext.READY |
               lifecycleContext == LifecycleContext.FLYING);
            guarantee chargeContextQualification == ChargeContextQualification.BLOCKED_CONTEXT &
              ((batteryAssessment == BatteryAssessment.LOW) implies
                (batteryReadinessAdvice == BatteryReadinessAdvice.NOT_READY)) &
              ((batteryAssessment == BatteryAssessment.ADEQUATE) implies
                (batteryReadinessAdvice == BatteryReadinessAdvice.READY));
    }*/
  }

  // @trace PART-03
  part def ChargerPathQualifier :> Thread {
    // @trace INT-03
    port chargerConnection : DataPort { in :>> type : ChargerConnection; }
    // @trace INT-04
    port chargeActivity : DataPort { in :>> type : ChargeActivity; }
    // @trace PART-03
    port chargerPathQualification : DataPort { out :>> type : ChargerPathQualification; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace INIT-01
          INIT_CHARGER_PATH "Initial charger-path qualification follows current observations":
            ((chargerConnection == ChargerConnection.DISCONNECTED) implies
              (chargerPathQualification == ChargerPathQualification.UNAVAILABLE)) &
            ((chargerConnection == ChargerConnection.CONNECTED & chargeActivity == ChargeActivity.INACTIVE) implies
              (chargerPathQualification == ChargerPathQualification.READY)) &
            ((chargerConnection == ChargerConnection.CONNECTED & chargeActivity == ChargeActivity.ACTIVE) implies
              (chargerPathQualification == ChargerPathQualification.ACTIVE));
      compute
        compute_cases
          // @trace CASE-04
          case CASE_04_DISCONNECTED "Disconnection makes either activity observation unavailable":
            assume chargerConnection == ChargerConnection.DISCONNECTED;
            guarantee chargerPathQualification == ChargerPathQualification.UNAVAILABLE;
          // @trace CASE-05
          case CASE_05_CONNECTED_INACTIVE "A connected inactive path is ready":
            assume chargerConnection == ChargerConnection.CONNECTED & chargeActivity == ChargeActivity.INACTIVE;
            guarantee chargerPathQualification == ChargerPathQualification.READY;
          // @trace CASE-06
          case CASE_06_CONNECTED_ACTIVE "A connected active path retains its active distinction":
            assume chargerConnection == ChargerConnection.CONNECTED & chargeActivity == ChargeActivity.ACTIVE;
            guarantee chargerPathQualification == ChargerPathQualification.ACTIVE;
    }*/
  }

  // @trace PART-04
  part def ChargeEligibilityRecoveryOwner :> Thread {
    // @trace INT-13
    port chargeContextQualification : DataPort { in :>> type : ChargeContextQualification; }
    // @trace INT-11
    port chargerPathQualification : DataPort { in :>> type : ChargerPathQualification; }
    // @trace INT-14
    port currentChargeSession : DataPort { in :>> type : ChargeSessionState; }
    // @trace INT-15
    port chargeEligibilityEnvelope : DataPort { out :>> type : ChargeEligibilityEnvelope; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace INIT-01
          INIT_ELIGIBILITY "Initial envelope follows qualifications and the initialized session":
            ((chargeContextQualification == ChargeContextQualification.BLOCKED_EVIDENCE &
              currentChargeSession == ChargeSessionState.ENABLED) implies
              (chargeEligibilityEnvelope == ChargeEligibilityEnvelope.RECOVER_EVIDENCE)) &
            ((chargeContextQualification == ChargeContextQualification.BLOCKED_EVIDENCE &
              currentChargeSession != ChargeSessionState.ENABLED) implies
              (chargeEligibilityEnvelope == ChargeEligibilityEnvelope.BLOCKED_EVIDENCE)) &
            ((chargeContextQualification != ChargeContextQualification.BLOCKED_EVIDENCE &
              chargerPathQualification == ChargerPathQualification.UNAVAILABLE &
              currentChargeSession == ChargeSessionState.ENABLED) implies
              (chargeEligibilityEnvelope == ChargeEligibilityEnvelope.RECOVER_CHARGER)) &
            ((chargeContextQualification != ChargeContextQualification.BLOCKED_EVIDENCE &
              chargerPathQualification == ChargerPathQualification.UNAVAILABLE &
              currentChargeSession != ChargeSessionState.ENABLED) implies
              (chargeEligibilityEnvelope == ChargeEligibilityEnvelope.BLOCKED_CHARGER)) &
            ((chargeContextQualification == ChargeContextQualification.BLOCKED_CONTEXT &
              chargerPathQualification != ChargerPathQualification.UNAVAILABLE &
              currentChargeSession == ChargeSessionState.ENABLED) implies
              (chargeEligibilityEnvelope == ChargeEligibilityEnvelope.RECOVER_CONTEXT)) &
            ((chargeContextQualification == ChargeContextQualification.BLOCKED_CONTEXT &
              chargerPathQualification != ChargerPathQualification.UNAVAILABLE &
              currentChargeSession != ChargeSessionState.ENABLED) implies
              (chargeEligibilityEnvelope == ChargeEligibilityEnvelope.BLOCKED_CONTEXT)) &
            ((chargeContextQualification == ChargeContextQualification.ELIGIBLE &
              chargerPathQualification != ChargerPathQualification.UNAVAILABLE) implies
              (chargeEligibilityEnvelope == ChargeEligibilityEnvelope.ELIGIBLE));
      compute
        compute_cases
          // @trace CASE-10
          case CASE_10_EVIDENCE_PRECEDENCE "Evidence invalidity has first recovery-reason precedence":
            assume chargeContextQualification == ChargeContextQualification.BLOCKED_EVIDENCE;
            guarantee
              ((currentChargeSession == ChargeSessionState.ENABLED) implies
                (chargeEligibilityEnvelope == ChargeEligibilityEnvelope.RECOVER_EVIDENCE)) &
              ((currentChargeSession != ChargeSessionState.ENABLED) implies
                (chargeEligibilityEnvelope == ChargeEligibilityEnvelope.BLOCKED_EVIDENCE));
          // @trace CASE-11
          case CASE_11_CHARGER_PRECEDENCE "Unavailable charger follows acceptable evidence":
            assume chargeContextQualification != ChargeContextQualification.BLOCKED_EVIDENCE &
              chargerPathQualification == ChargerPathQualification.UNAVAILABLE;
            guarantee
              ((currentChargeSession == ChargeSessionState.ENABLED) implies
                (chargeEligibilityEnvelope == ChargeEligibilityEnvelope.RECOVER_CHARGER)) &
              ((currentChargeSession != ChargeSessionState.ENABLED) implies
                (chargeEligibilityEnvelope == ChargeEligibilityEnvelope.BLOCKED_CHARGER));
          // @trace CASE-12
          case CASE_12_CONTEXT_RECOVERY "Blocked context follows acceptable evidence and charger path":
            assume chargeContextQualification == ChargeContextQualification.BLOCKED_CONTEXT &
              chargerPathQualification != ChargerPathQualification.UNAVAILABLE;
            guarantee
              ((currentChargeSession == ChargeSessionState.ENABLED) implies
                (chargeEligibilityEnvelope == ChargeEligibilityEnvelope.RECOVER_CONTEXT)) &
              ((currentChargeSession != ChargeSessionState.ENABLED) implies
                (chargeEligibilityEnvelope == ChargeEligibilityEnvelope.BLOCKED_CONTEXT));
          // @trace CASE-13
          case CASE_13_ELIGIBLE "Eligible context and available charger yield eligibility for every session":
            assume chargeContextQualification == ChargeContextQualification.ELIGIBLE &
              chargerPathQualification != ChargerPathQualification.UNAVAILABLE;
            guarantee chargeEligibilityEnvelope == ChargeEligibilityEnvelope.ELIGIBLE;
    }*/
  }

  // @trace PART-05
  part def ChargeIntentArbiter :> Thread {
    // @trace INT-07
    port chargeRequest : DataPort { in :>> type : ChargeRequest; }
    // @trace INT-15
    port chargeEligibilityEnvelope : DataPort { in :>> type : ChargeEligibilityEnvelope; }
    // @trace INT-16
    port chargeDecision : DataPort { out :>> type : ChargeDecision; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace INIT-01
          INIT_ARBITRATION "Initial decision observes the approved cancellation, recovery, request, no-request priority":
            ((chargeRequest == ChargeRequest.CANCEL_CHARGE) implies
              (chargeDecision == ChargeDecision.TERMINATE)) &
            ((chargeRequest != ChargeRequest.CANCEL_CHARGE &
              chargeEligibilityEnvelope == ChargeEligibilityEnvelope.RECOVER_EVIDENCE) implies
              (chargeDecision == ChargeDecision.RECOVER_EVIDENCE)) &
            ((chargeRequest != ChargeRequest.CANCEL_CHARGE &
              chargeEligibilityEnvelope == ChargeEligibilityEnvelope.RECOVER_CHARGER) implies
              (chargeDecision == ChargeDecision.RECOVER_CHARGER)) &
            ((chargeRequest != ChargeRequest.CANCEL_CHARGE &
              chargeEligibilityEnvelope == ChargeEligibilityEnvelope.RECOVER_CONTEXT) implies
              (chargeDecision == ChargeDecision.RECOVER_CONTEXT)) &
            ((chargeRequest == ChargeRequest.REQUEST_CHARGE &
              chargeEligibilityEnvelope == ChargeEligibilityEnvelope.ELIGIBLE) implies
              (chargeDecision == ChargeDecision.AUTHORIZE)) &
            ((chargeRequest == ChargeRequest.REQUEST_CHARGE &
              chargeEligibilityEnvelope == ChargeEligibilityEnvelope.BLOCKED_EVIDENCE) implies
              (chargeDecision == ChargeDecision.REJECT_EVIDENCE)) &
            ((chargeRequest == ChargeRequest.REQUEST_CHARGE &
              chargeEligibilityEnvelope == ChargeEligibilityEnvelope.BLOCKED_CHARGER) implies
              (chargeDecision == ChargeDecision.REJECT_CHARGER)) &
            ((chargeRequest == ChargeRequest.REQUEST_CHARGE &
              chargeEligibilityEnvelope == ChargeEligibilityEnvelope.BLOCKED_CONTEXT) implies
              (chargeDecision == ChargeDecision.REJECT_CONTEXT)) &
            ((chargeRequest == ChargeRequest.NO_REQUEST &
              chargeEligibilityEnvelope != ChargeEligibilityEnvelope.RECOVER_EVIDENCE &
              chargeEligibilityEnvelope != ChargeEligibilityEnvelope.RECOVER_CHARGER &
              chargeEligibilityEnvelope != ChargeEligibilityEnvelope.RECOVER_CONTEXT) implies
              (chargeDecision == ChargeDecision.NO_CHANGE));
      compute
        compute_cases
          // @trace CASE-14
          case CASE_14_CANCEL_PRIORITY "Cancellation terminates for every envelope":
            assume chargeRequest == ChargeRequest.CANCEL_CHARGE;
            guarantee chargeDecision == ChargeDecision.TERMINATE;
          // @trace CASE-15
          case CASE_15_RECOVERY_PRIORITY "Recovery proposals preempt request and no-request":
            assume chargeRequest != ChargeRequest.CANCEL_CHARGE &
              (chargeEligibilityEnvelope == ChargeEligibilityEnvelope.RECOVER_EVIDENCE |
               chargeEligibilityEnvelope == ChargeEligibilityEnvelope.RECOVER_CHARGER |
               chargeEligibilityEnvelope == ChargeEligibilityEnvelope.RECOVER_CONTEXT);
            guarantee
              ((chargeEligibilityEnvelope == ChargeEligibilityEnvelope.RECOVER_EVIDENCE) implies
                (chargeDecision == ChargeDecision.RECOVER_EVIDENCE)) &
              ((chargeEligibilityEnvelope == ChargeEligibilityEnvelope.RECOVER_CHARGER) implies
                (chargeDecision == ChargeDecision.RECOVER_CHARGER)) &
              ((chargeEligibilityEnvelope == ChargeEligibilityEnvelope.RECOVER_CONTEXT) implies
                (chargeDecision == ChargeDecision.RECOVER_CONTEXT));
          // @trace CASE-16
          case CASE_16_REQUEST_OR_HOLD "Remaining requests authorize or reject and no-request holds":
            assume chargeRequest != ChargeRequest.CANCEL_CHARGE &
              chargeEligibilityEnvelope != ChargeEligibilityEnvelope.RECOVER_EVIDENCE &
              chargeEligibilityEnvelope != ChargeEligibilityEnvelope.RECOVER_CHARGER &
              chargeEligibilityEnvelope != ChargeEligibilityEnvelope.RECOVER_CONTEXT;
            guarantee
              ((chargeRequest == ChargeRequest.REQUEST_CHARGE &
                chargeEligibilityEnvelope == ChargeEligibilityEnvelope.ELIGIBLE) implies
                (chargeDecision == ChargeDecision.AUTHORIZE)) &
              ((chargeRequest == ChargeRequest.REQUEST_CHARGE &
                chargeEligibilityEnvelope == ChargeEligibilityEnvelope.BLOCKED_EVIDENCE) implies
                (chargeDecision == ChargeDecision.REJECT_EVIDENCE)) &
              ((chargeRequest == ChargeRequest.REQUEST_CHARGE &
                chargeEligibilityEnvelope == ChargeEligibilityEnvelope.BLOCKED_CHARGER) implies
                (chargeDecision == ChargeDecision.REJECT_CHARGER)) &
              ((chargeRequest == ChargeRequest.REQUEST_CHARGE &
                chargeEligibilityEnvelope == ChargeEligibilityEnvelope.BLOCKED_CONTEXT) implies
                (chargeDecision == ChargeDecision.REJECT_CONTEXT)) &
              ((chargeRequest == ChargeRequest.NO_REQUEST) implies
                (chargeDecision == ChargeDecision.NO_CHANGE));
    }*/
  }

  // @trace PART-06
  part def ChargeSessionController :> Thread {
    // @trace INT-16
    port chargeDecision : DataPort { in :>> type : ChargeDecision; }
    // @trace INT-14
    port currentChargeSession : DataPort { out :>> type : ChargeSessionState; }
    // @trace INT-17
    port chargeSessionSnapshot : DataPort { out :>> type : ChargeSessionSnapshot; }
    // @trace INT-18
    port chargePermission : DataPort { out :>> type : ChargePermission; }

    language "GUMBO" /*{
      state
        // @trace TYPE-06
        committedChargeSession : ChargeSessionState;
      initialize
        guarantee
          // @trace INIT-01
          INIT_SESSION_AND_OUTPUTS "The logical charge session and its complete published result initialize with permission disabled":
            committedChargeSession == ChargeSessionState.IDLE &
            currentChargeSession == ChargeSessionState.IDLE &
            chargePermission == ChargePermission.DISABLED &
            chargeSessionSnapshot.preSession == SnapshotPreSessionState.IDLE &
            chargeSessionSnapshot.nextSession == SnapshotNextSessionState.IDLE &
            chargeSessionSnapshot.disposition == SnapshotChargeDisposition.NO_CHANGE &
            chargeSessionSnapshot.reason == ChargeReason.NONE;
      compute
        guarantee
          // @trace INT-14
          PUBLISH_COMMITTED_PRE_STATE "The feedback interaction publishes the committed pre-evaluation state":
            currentChargeSession == In(committedChargeSession);
        guarantee
          // @trace TYPE-10
          PROJECT_PRE_SESSION "Snapshot pre-session projection preserves the committed pre-state meaning":
            ((In(committedChargeSession) == ChargeSessionState.IDLE) implies
              (chargeSessionSnapshot.preSession == SnapshotPreSessionState.IDLE)) &
            ((In(committedChargeSession) == ChargeSessionState.ENABLED) implies
              (chargeSessionSnapshot.preSession == SnapshotPreSessionState.ENABLED)) &
            ((In(committedChargeSession) == ChargeSessionState.SUSPENDED) implies
              (chargeSessionSnapshot.preSession == SnapshotPreSessionState.SUSPENDED));
        guarantee
          // @trace TYPE-10
          PROJECT_NEXT_SESSION "Snapshot next-session and permission projections preserve the committed post-state meaning":
            ((committedChargeSession == ChargeSessionState.IDLE) implies
              (chargeSessionSnapshot.nextSession == SnapshotNextSessionState.IDLE &
               chargePermission == ChargePermission.DISABLED)) &
            ((committedChargeSession == ChargeSessionState.ENABLED) implies
              (chargeSessionSnapshot.nextSession == SnapshotNextSessionState.ENABLED &
               chargePermission == ChargePermission.ENABLED)) &
            ((committedChargeSession == ChargeSessionState.SUSPENDED) implies
              (chargeSessionSnapshot.nextSession == SnapshotNextSessionState.SUSPENDED &
               chargePermission == ChargePermission.DISABLED));
        guarantee
          // @trace BEH-STATE-01
          RECOVERY_REASON_INVARIANT "Recovery-applied snapshots carry exactly one approved recovery reason":
            (chargeSessionSnapshot.disposition == SnapshotChargeDisposition.RECOVERY_APPLIED) implies
              (chargeSessionSnapshot.reason == ChargeReason.EVIDENCE_UNAVAILABLE |
               chargeSessionSnapshot.reason == ChargeReason.CHARGER_UNAVAILABLE |
               chargeSessionSnapshot.reason == ChargeReason.CONTEXT_INELIGIBLE);
        compute_cases
          // @trace CASE-17
          case CASE_17_TRANSITIONING_DECISIONS "Authorize, terminate, and recovery decisions select their complete post-state result":
            assume chargeDecision == ChargeDecision.AUTHORIZE |
              chargeDecision == ChargeDecision.TERMINATE |
              chargeDecision == ChargeDecision.RECOVER_EVIDENCE |
              chargeDecision == ChargeDecision.RECOVER_CHARGER |
              chargeDecision == ChargeDecision.RECOVER_CONTEXT;
            guarantee
              ((chargeDecision == ChargeDecision.AUTHORIZE) implies
                (committedChargeSession == ChargeSessionState.ENABLED &
                 chargeSessionSnapshot.disposition == SnapshotChargeDisposition.ACCEPTED &
                 chargeSessionSnapshot.reason == ChargeReason.NONE)) &
              ((chargeDecision == ChargeDecision.TERMINATE) implies
                (committedChargeSession == ChargeSessionState.IDLE &
                 chargeSessionSnapshot.disposition == SnapshotChargeDisposition.ACCEPTED &
                 chargeSessionSnapshot.reason == ChargeReason.CANCELLED)) &
              ((chargeDecision == ChargeDecision.RECOVER_EVIDENCE) implies
                (committedChargeSession == ChargeSessionState.SUSPENDED &
                 chargeSessionSnapshot.disposition == SnapshotChargeDisposition.RECOVERY_APPLIED &
                 chargeSessionSnapshot.reason == ChargeReason.EVIDENCE_UNAVAILABLE)) &
              ((chargeDecision == ChargeDecision.RECOVER_CHARGER) implies
                (committedChargeSession == ChargeSessionState.SUSPENDED &
                 chargeSessionSnapshot.disposition == SnapshotChargeDisposition.RECOVERY_APPLIED &
                 chargeSessionSnapshot.reason == ChargeReason.CHARGER_UNAVAILABLE)) &
              ((chargeDecision == ChargeDecision.RECOVER_CONTEXT) implies
                (committedChargeSession == ChargeSessionState.SUSPENDED &
                 chargeSessionSnapshot.disposition == SnapshotChargeDisposition.RECOVERY_APPLIED &
                 chargeSessionSnapshot.reason == ChargeReason.CONTEXT_INELIGIBLE));
          // @trace CASE-18
          case CASE_18_HOLDING_DECISIONS "No-change and rejection decisions preserve pre-state and publish a complete disposition":
            assume chargeDecision == ChargeDecision.NO_CHANGE |
              chargeDecision == ChargeDecision.REJECT_EVIDENCE |
              chargeDecision == ChargeDecision.REJECT_CHARGER |
              chargeDecision == ChargeDecision.REJECT_CONTEXT;
            guarantee committedChargeSession == In(committedChargeSession) &
              ((chargeDecision == ChargeDecision.NO_CHANGE) implies
                (chargeSessionSnapshot.disposition == SnapshotChargeDisposition.NO_CHANGE &
                 chargeSessionSnapshot.reason == ChargeReason.NONE)) &
              ((chargeDecision == ChargeDecision.REJECT_EVIDENCE) implies
                (chargeSessionSnapshot.disposition == SnapshotChargeDisposition.REJECTED &
                 chargeSessionSnapshot.reason == ChargeReason.EVIDENCE_UNAVAILABLE)) &
              ((chargeDecision == ChargeDecision.REJECT_CHARGER) implies
                (chargeSessionSnapshot.disposition == SnapshotChargeDisposition.REJECTED &
                 chargeSessionSnapshot.reason == ChargeReason.CHARGER_UNAVAILABLE)) &
              ((chargeDecision == ChargeDecision.REJECT_CONTEXT) implies
                (chargeSessionSnapshot.disposition == SnapshotChargeDisposition.REJECTED &
                 chargeSessionSnapshot.reason == ChargeReason.CONTEXT_INELIGIBLE));
    }*/
  }

  // @trace PART-07
  part def FlightControlBatteryNoticePolicy :> Thread {
    // @trace INT-09
    port batteryAssessment : DataPort { in :>> type : BatteryAssessment; }
    // @trace INT-06
    port lifecycleContext : DataPort { in :>> type : LifecycleContext; }
    // @trace INT-20
    port flightControlBatteryNotice : DataPort { out :>> type : FlightControlBatteryNotice; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace INIT-01
          INIT_NOTICE "Initial notice follows current battery assessment and lifecycle context":
            ((batteryAssessment == BatteryAssessment.UNAVAILABLE) implies
              (flightControlBatteryNotice == FlightControlBatteryNotice.EVIDENCE_UNAVAILABLE)) &
            ((batteryAssessment == BatteryAssessment.LOW & lifecycleContext == LifecycleContext.FLYING) implies
              (flightControlBatteryNotice == FlightControlBatteryNotice.LOW_IN_FLIGHT_CONTEXT)) &
            ((batteryAssessment == BatteryAssessment.LOW & lifecycleContext != LifecycleContext.FLYING) implies
              (flightControlBatteryNotice == FlightControlBatteryNotice.LOW_BATTERY)) &
            ((batteryAssessment == BatteryAssessment.ADEQUATE) implies
              (flightControlBatteryNotice == FlightControlBatteryNotice.CLEAR));
      compute
        compute_cases
          // @trace CASE-19
          case CASE_19_CONTEXTUAL_NOTICE "The notice classifies unavailable, low-in-flight, low, and adequate evidence in priority order":
            guarantee
              ((batteryAssessment == BatteryAssessment.UNAVAILABLE) implies
                (flightControlBatteryNotice == FlightControlBatteryNotice.EVIDENCE_UNAVAILABLE)) &
              ((batteryAssessment == BatteryAssessment.LOW & lifecycleContext == LifecycleContext.FLYING) implies
                (flightControlBatteryNotice == FlightControlBatteryNotice.LOW_IN_FLIGHT_CONTEXT)) &
              ((batteryAssessment == BatteryAssessment.LOW & lifecycleContext != LifecycleContext.FLYING) implies
                (flightControlBatteryNotice == FlightControlBatteryNotice.LOW_BATTERY)) &
              ((batteryAssessment == BatteryAssessment.ADEQUATE) implies
                (flightControlBatteryNotice == FlightControlBatteryNotice.CLEAR));
    }*/
  }

  // @trace PART-08
  part def PilotBatteryStatusPolicy :> Thread {
    // @trace INT-10
    port batteryAssessment : DataPort { in :>> type : BatteryAssessment; }
    // @trace INT-12
    port chargerPathQualification : DataPort { in :>> type : ChargerPathQualification; }
    // @trace INT-17
    port chargeSessionSnapshot : DataPort { in :>> type : ChargeSessionSnapshot; }
    // @trace INT-21
    port pilotBatteryStatus : DataPort { out :>> type : PilotBatteryStatus; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace INIT-01
          INIT_PILOT_STATUS "Initial pilot status projects current facts and applies the approved advisory priority":
            pilotBatteryStatus.batteryAssessment == batteryAssessment &
            pilotBatteryStatus.chargerPathQualification == chargerPathQualification &
            ((chargeSessionSnapshot.nextSession == SnapshotNextSessionState.IDLE) implies
              (pilotBatteryStatus.session == PilotSessionState.IDLE)) &
            ((chargeSessionSnapshot.nextSession == SnapshotNextSessionState.ENABLED) implies
              (pilotBatteryStatus.session == PilotSessionState.ENABLED)) &
            ((chargeSessionSnapshot.nextSession == SnapshotNextSessionState.SUSPENDED) implies
              (pilotBatteryStatus.session == PilotSessionState.SUSPENDED)) &
            ((chargeSessionSnapshot.disposition == SnapshotChargeDisposition.NO_CHANGE) implies
              (pilotBatteryStatus.disposition == PilotChargeDisposition.NO_CHANGE)) &
            ((chargeSessionSnapshot.disposition == SnapshotChargeDisposition.ACCEPTED) implies
              (pilotBatteryStatus.disposition == PilotChargeDisposition.ACCEPTED)) &
            ((chargeSessionSnapshot.disposition == SnapshotChargeDisposition.REJECTED) implies
              (pilotBatteryStatus.disposition == PilotChargeDisposition.REJECTED)) &
            ((chargeSessionSnapshot.disposition == SnapshotChargeDisposition.RECOVERY_APPLIED) implies
              (pilotBatteryStatus.disposition == PilotChargeDisposition.RECOVERY_APPLIED)) &
            ((batteryAssessment == BatteryAssessment.UNAVAILABLE) implies
              (pilotBatteryStatus.advisory == PilotAdvisory.EVIDENCE_UNAVAILABLE)) &
            ((batteryAssessment != BatteryAssessment.UNAVAILABLE &
              chargeSessionSnapshot.disposition == SnapshotChargeDisposition.RECOVERY_APPLIED &
              chargeSessionSnapshot.reason == ChargeReason.EVIDENCE_UNAVAILABLE) implies
              (pilotBatteryStatus.advisory == PilotAdvisory.EVIDENCE_UNAVAILABLE)) &
            ((batteryAssessment != BatteryAssessment.UNAVAILABLE &
              chargeSessionSnapshot.disposition == SnapshotChargeDisposition.RECOVERY_APPLIED &
              chargeSessionSnapshot.reason == ChargeReason.CHARGER_UNAVAILABLE) implies
              (pilotBatteryStatus.advisory == PilotAdvisory.CHARGER_UNAVAILABLE)) &
            ((batteryAssessment != BatteryAssessment.UNAVAILABLE &
              chargeSessionSnapshot.disposition == SnapshotChargeDisposition.RECOVERY_APPLIED &
              chargeSessionSnapshot.reason == ChargeReason.CONTEXT_INELIGIBLE) implies
              (pilotBatteryStatus.advisory == PilotAdvisory.CONTEXT_INELIGIBLE)) &
            ((batteryAssessment != BatteryAssessment.UNAVAILABLE &
              (chargeSessionSnapshot.disposition != SnapshotChargeDisposition.RECOVERY_APPLIED |
               (chargeSessionSnapshot.reason != ChargeReason.EVIDENCE_UNAVAILABLE &
                chargeSessionSnapshot.reason != ChargeReason.CHARGER_UNAVAILABLE &
                chargeSessionSnapshot.reason != ChargeReason.CONTEXT_INELIGIBLE)) &
              chargerPathQualification == ChargerPathQualification.ACTIVE &
              chargeSessionSnapshot.nextSession != SnapshotNextSessionState.ENABLED) implies
              (pilotBatteryStatus.advisory == PilotAdvisory.ACTIVITY_WITHOUT_PERMISSION)) &
            ((batteryAssessment == BatteryAssessment.LOW &
              (chargeSessionSnapshot.disposition != SnapshotChargeDisposition.RECOVERY_APPLIED |
               (chargeSessionSnapshot.reason != ChargeReason.EVIDENCE_UNAVAILABLE &
                chargeSessionSnapshot.reason != ChargeReason.CHARGER_UNAVAILABLE &
                chargeSessionSnapshot.reason != ChargeReason.CONTEXT_INELIGIBLE)) &
              (chargerPathQualification != ChargerPathQualification.ACTIVE |
               chargeSessionSnapshot.nextSession == SnapshotNextSessionState.ENABLED)) implies
              (pilotBatteryStatus.advisory == PilotAdvisory.CHARGE_RECOMMENDED)) &
            ((batteryAssessment == BatteryAssessment.ADEQUATE &
              (chargeSessionSnapshot.disposition != SnapshotChargeDisposition.RECOVERY_APPLIED |
               (chargeSessionSnapshot.reason != ChargeReason.EVIDENCE_UNAVAILABLE &
                chargeSessionSnapshot.reason != ChargeReason.CHARGER_UNAVAILABLE &
                chargeSessionSnapshot.reason != ChargeReason.CONTEXT_INELIGIBLE)) &
              (chargerPathQualification != ChargerPathQualification.ACTIVE |
               chargeSessionSnapshot.nextSession == SnapshotNextSessionState.ENABLED) &
              chargeSessionSnapshot.disposition == SnapshotChargeDisposition.REJECTED) implies
              (pilotBatteryStatus.advisory == PilotAdvisory.REQUEST_REJECTED)) &
            ((batteryAssessment == BatteryAssessment.ADEQUATE &
              (chargeSessionSnapshot.disposition != SnapshotChargeDisposition.RECOVERY_APPLIED |
               (chargeSessionSnapshot.reason != ChargeReason.EVIDENCE_UNAVAILABLE &
                chargeSessionSnapshot.reason != ChargeReason.CHARGER_UNAVAILABLE &
                chargeSessionSnapshot.reason != ChargeReason.CONTEXT_INELIGIBLE)) &
              (chargerPathQualification != ChargerPathQualification.ACTIVE |
               chargeSessionSnapshot.nextSession == SnapshotNextSessionState.ENABLED) &
              chargeSessionSnapshot.disposition != SnapshotChargeDisposition.REJECTED) implies
              (pilotBatteryStatus.advisory == PilotAdvisory.NONE));
      compute
        compute_cases
          // @trace CASE-20
          case CASE_20_PILOT_ADVISORY "The pilot policy projects status and selects exactly one priority advisory for every structural input":
            guarantee
              pilotBatteryStatus.batteryAssessment == batteryAssessment &
              pilotBatteryStatus.chargerPathQualification == chargerPathQualification &
              ((chargeSessionSnapshot.nextSession == SnapshotNextSessionState.IDLE) implies
                (pilotBatteryStatus.session == PilotSessionState.IDLE)) &
              ((chargeSessionSnapshot.nextSession == SnapshotNextSessionState.ENABLED) implies
                (pilotBatteryStatus.session == PilotSessionState.ENABLED)) &
              ((chargeSessionSnapshot.nextSession == SnapshotNextSessionState.SUSPENDED) implies
                (pilotBatteryStatus.session == PilotSessionState.SUSPENDED)) &
              ((chargeSessionSnapshot.disposition == SnapshotChargeDisposition.NO_CHANGE) implies
                (pilotBatteryStatus.disposition == PilotChargeDisposition.NO_CHANGE)) &
              ((chargeSessionSnapshot.disposition == SnapshotChargeDisposition.ACCEPTED) implies
                (pilotBatteryStatus.disposition == PilotChargeDisposition.ACCEPTED)) &
              ((chargeSessionSnapshot.disposition == SnapshotChargeDisposition.REJECTED) implies
                (pilotBatteryStatus.disposition == PilotChargeDisposition.REJECTED)) &
              ((chargeSessionSnapshot.disposition == SnapshotChargeDisposition.RECOVERY_APPLIED) implies
                (pilotBatteryStatus.disposition == PilotChargeDisposition.RECOVERY_APPLIED)) &
              ((batteryAssessment == BatteryAssessment.UNAVAILABLE) implies
                (pilotBatteryStatus.advisory == PilotAdvisory.EVIDENCE_UNAVAILABLE)) &
              ((batteryAssessment != BatteryAssessment.UNAVAILABLE &
                chargeSessionSnapshot.disposition == SnapshotChargeDisposition.RECOVERY_APPLIED &
                chargeSessionSnapshot.reason == ChargeReason.EVIDENCE_UNAVAILABLE) implies
                (pilotBatteryStatus.advisory == PilotAdvisory.EVIDENCE_UNAVAILABLE)) &
              ((batteryAssessment != BatteryAssessment.UNAVAILABLE &
                chargeSessionSnapshot.disposition == SnapshotChargeDisposition.RECOVERY_APPLIED &
                chargeSessionSnapshot.reason == ChargeReason.CHARGER_UNAVAILABLE) implies
                (pilotBatteryStatus.advisory == PilotAdvisory.CHARGER_UNAVAILABLE)) &
              ((batteryAssessment != BatteryAssessment.UNAVAILABLE &
                chargeSessionSnapshot.disposition == SnapshotChargeDisposition.RECOVERY_APPLIED &
                chargeSessionSnapshot.reason == ChargeReason.CONTEXT_INELIGIBLE) implies
                (pilotBatteryStatus.advisory == PilotAdvisory.CONTEXT_INELIGIBLE)) &
              ((batteryAssessment != BatteryAssessment.UNAVAILABLE &
                (chargeSessionSnapshot.disposition != SnapshotChargeDisposition.RECOVERY_APPLIED |
                 (chargeSessionSnapshot.reason != ChargeReason.EVIDENCE_UNAVAILABLE &
                  chargeSessionSnapshot.reason != ChargeReason.CHARGER_UNAVAILABLE &
                  chargeSessionSnapshot.reason != ChargeReason.CONTEXT_INELIGIBLE)) &
                chargerPathQualification == ChargerPathQualification.ACTIVE &
                chargeSessionSnapshot.nextSession != SnapshotNextSessionState.ENABLED) implies
                (pilotBatteryStatus.advisory == PilotAdvisory.ACTIVITY_WITHOUT_PERMISSION)) &
              ((batteryAssessment == BatteryAssessment.LOW &
                (chargeSessionSnapshot.disposition != SnapshotChargeDisposition.RECOVERY_APPLIED |
                 (chargeSessionSnapshot.reason != ChargeReason.EVIDENCE_UNAVAILABLE &
                  chargeSessionSnapshot.reason != ChargeReason.CHARGER_UNAVAILABLE &
                  chargeSessionSnapshot.reason != ChargeReason.CONTEXT_INELIGIBLE)) &
                (chargerPathQualification != ChargerPathQualification.ACTIVE |
                 chargeSessionSnapshot.nextSession == SnapshotNextSessionState.ENABLED)) implies
                (pilotBatteryStatus.advisory == PilotAdvisory.CHARGE_RECOMMENDED)) &
              ((batteryAssessment == BatteryAssessment.ADEQUATE &
                (chargeSessionSnapshot.disposition != SnapshotChargeDisposition.RECOVERY_APPLIED |
                 (chargeSessionSnapshot.reason != ChargeReason.EVIDENCE_UNAVAILABLE &
                  chargeSessionSnapshot.reason != ChargeReason.CHARGER_UNAVAILABLE &
                  chargeSessionSnapshot.reason != ChargeReason.CONTEXT_INELIGIBLE)) &
                (chargerPathQualification != ChargerPathQualification.ACTIVE |
                 chargeSessionSnapshot.nextSession == SnapshotNextSessionState.ENABLED) &
                chargeSessionSnapshot.disposition == SnapshotChargeDisposition.REJECTED) implies
                (pilotBatteryStatus.advisory == PilotAdvisory.REQUEST_REJECTED)) &
              ((batteryAssessment == BatteryAssessment.ADEQUATE &
                (chargeSessionSnapshot.disposition != SnapshotChargeDisposition.RECOVERY_APPLIED |
                 (chargeSessionSnapshot.reason != ChargeReason.EVIDENCE_UNAVAILABLE &
                  chargeSessionSnapshot.reason != ChargeReason.CHARGER_UNAVAILABLE &
                  chargeSessionSnapshot.reason != ChargeReason.CONTEXT_INELIGIBLE)) &
                (chargerPathQualification != ChargerPathQualification.ACTIVE |
                 chargeSessionSnapshot.nextSession == SnapshotNextSessionState.ENABLED) &
                chargeSessionSnapshot.disposition != SnapshotChargeDisposition.REJECTED) implies
                (pilotBatteryStatus.advisory == PilotAdvisory.NONE));
    }*/
  }

  // @generated-support behavior-free physical container required by CONSTR-01
  part def SupervisorProcess :> Process {
    // @generated-support root-to-Process routing port
    port batteryCapacity : DataPort { in :>> type : BatteryCapacityBand; }
    // @generated-support root-to-Process routing port
    port batteryCheck : DataPort { in :>> type : BatteryCheck; }
    // @generated-support root-to-Process routing port
    port chargerConnection : DataPort { in :>> type : ChargerConnection; }
    // @generated-support root-to-Process routing port
    port chargeActivity : DataPort { in :>> type : ChargeActivity; }
    // @generated-support root-to-Process routing port
    port lifecycleContext : DataPort { in :>> type : LifecycleContext; }
    // @generated-support root-to-Process routing port
    port chargeRequest : DataPort { in :>> type : ChargeRequest; }
    // @generated-support Process-to-root routing port
    port chargePermission : DataPort { out :>> type : ChargePermission; }
    // @generated-support Process-to-root routing port
    port batteryReadinessAdvice : DataPort { out :>> type : BatteryReadinessAdvice; }
    // @generated-support Process-to-root routing port
    port flightControlBatteryNotice : DataPort { out :>> type : FlightControlBatteryNotice; }
    // @generated-support Process-to-root routing port
    port pilotBatteryStatus : DataPort { out :>> type : PilotBatteryStatus; }

    // @trace PART-01
    part batteryEvidenceQualifier : BatteryEvidenceQualifier;
    // @trace PART-02
    part chargeContextQualifier : ChargeContextQualifier;
    // @trace PART-03
    part chargerPathQualifier : ChargerPathQualifier;
    // @trace PART-04
    part chargeEligibilityRecoveryOwner : ChargeEligibilityRecoveryOwner;
    // @trace PART-05
    part chargeIntentArbiter : ChargeIntentArbiter;
    // @trace PART-06
    part chargeSessionController : ChargeSessionController;
    // @trace PART-07
    part flightControlBatteryNoticePolicy : FlightControlBatteryNoticePolicy;
    // @trace PART-08
    part pilotBatteryStatusPolicy : PilotBatteryStatusPolicy;

    // @trace INT-01
    connection int01 : PortConnection connect batteryCapacity to batteryEvidenceQualifier.batteryCapacity;
    // @trace INT-02
    connection int02 : PortConnection connect batteryCheck to batteryEvidenceQualifier.batteryCheck;
    // @trace INT-03
    connection int03 : PortConnection connect chargerConnection to chargerPathQualifier.chargerConnection;
    // @trace INT-04
    connection int04 : PortConnection connect chargeActivity to chargerPathQualifier.chargeActivity;
    // @trace INT-05
    connection int05 : PortConnection connect lifecycleContext to chargeContextQualifier.lifecycleContext;
    // @trace INT-06
    connection int06 : PortConnection connect lifecycleContext to flightControlBatteryNoticePolicy.lifecycleContext;
    // @trace INT-07
    connection int07 : PortConnection connect chargeRequest to chargeIntentArbiter.chargeRequest;
    // @trace INT-08
    connection int08 : PortConnection connect batteryEvidenceQualifier.batteryAssessment to chargeContextQualifier.batteryAssessment;
    // @trace INT-09
    connection int09 : PortConnection connect batteryEvidenceQualifier.batteryAssessment to flightControlBatteryNoticePolicy.batteryAssessment;
    // @trace INT-10
    connection int10 : PortConnection connect batteryEvidenceQualifier.batteryAssessment to pilotBatteryStatusPolicy.batteryAssessment;
    // @trace INT-11
    connection int11 : PortConnection connect chargerPathQualifier.chargerPathQualification to chargeEligibilityRecoveryOwner.chargerPathQualification;
    // @trace INT-12
    connection int12 : PortConnection connect chargerPathQualifier.chargerPathQualification to pilotBatteryStatusPolicy.chargerPathQualification;
    // @trace INT-13
    connection int13 : PortConnection connect chargeContextQualifier.chargeContextQualification to chargeEligibilityRecoveryOwner.chargeContextQualification;
    // @trace INT-14
    connection int14 : PortConnection connect chargeSessionController.currentChargeSession to chargeEligibilityRecoveryOwner.currentChargeSession;
    // @trace INT-15
    connection int15 : PortConnection connect chargeEligibilityRecoveryOwner.chargeEligibilityEnvelope to chargeIntentArbiter.chargeEligibilityEnvelope;
    // @trace INT-16
    connection int16 : PortConnection connect chargeIntentArbiter.chargeDecision to chargeSessionController.chargeDecision;
    // @trace INT-17
    connection int17 : PortConnection connect chargeSessionController.chargeSessionSnapshot to pilotBatteryStatusPolicy.chargeSessionSnapshot;
    // @trace INT-18
    connection int18 : PortConnection connect chargeSessionController.chargePermission to chargePermission;
    // @trace INT-19
    connection int19 : PortConnection connect chargeContextQualifier.batteryReadinessAdvice to batteryReadinessAdvice;
    // @trace INT-20
    connection int20 : PortConnection connect flightControlBatteryNoticePolicy.flightControlBatteryNotice to flightControlBatteryNotice;
    // @trace INT-21
    connection int21 : PortConnection connect pilotBatteryStatusPolicy.pilotBatteryStatus to pilotBatteryStatus;
  }

  // @trace SCOPE-IN-01
  part def BatteryEvidenceChargeQualificationSupervisor :> System {
    // @trace MON-01
    port batteryCapacity : DataPort { in :>> type : BatteryCapacityBand; }
    // @trace MON-02
    port batteryCheck : DataPort { in :>> type : BatteryCheck; }
    // @trace MON-03
    port chargerConnection : DataPort { in :>> type : ChargerConnection; }
    // @trace MON-04
    port chargeActivity : DataPort { in :>> type : ChargeActivity; }
    // @trace MON-05
    port lifecycleContext : DataPort { in :>> type : LifecycleContext; }
    // @trace MON-06
    port chargeRequest : DataPort { in :>> type : ChargeRequest; }
    // @trace CTRL-01
    port chargePermission : DataPort { out :>> type : ChargePermission; }
    // @trace CTRL-02
    port batteryReadinessAdvice : DataPort { out :>> type : BatteryReadinessAdvice; }
    // @trace CTRL-03
    port flightControlBatteryNotice : DataPort { out :>> type : FlightControlBatteryNotice; }
    // @trace CTRL-04
    port pilotBatteryStatus : DataPort { out :>> type : PilotBatteryStatus; }

    // @generated-support behavior-free containment usage required by CONSTR-01
    part supervisorProcess : SupervisorProcess;

    // @generated-support support route for MON-01
    connection supportBatteryCapacity : PortConnection connect batteryCapacity to supervisorProcess.batteryCapacity;
    // @generated-support support route for MON-02
    connection supportBatteryCheck : PortConnection connect batteryCheck to supervisorProcess.batteryCheck;
    // @generated-support support route for MON-03
    connection supportChargerConnection : PortConnection connect chargerConnection to supervisorProcess.chargerConnection;
    // @generated-support support route for MON-04
    connection supportChargeActivity : PortConnection connect chargeActivity to supervisorProcess.chargeActivity;
    // @generated-support support route for MON-05
    connection supportLifecycleContext : PortConnection connect lifecycleContext to supervisorProcess.lifecycleContext;
    // @generated-support support route for MON-06
    connection supportChargeRequest : PortConnection connect chargeRequest to supervisorProcess.chargeRequest;
    // @generated-support support route for CTRL-01
    connection supportChargePermission : PortConnection connect supervisorProcess.chargePermission to chargePermission;
    // @generated-support support route for CTRL-02
    connection supportReadiness : PortConnection connect supervisorProcess.batteryReadinessAdvice to batteryReadinessAdvice;
    // @generated-support support route for CTRL-03
    connection supportNotice : PortConnection connect supervisorProcess.flightControlBatteryNotice to flightControlBatteryNotice;
    // @generated-support support route for CTRL-04
    connection supportPilotStatus : PortConnection connect supervisorProcess.pilotBatteryStatus to pilotBatteryStatus;
  }

  // @trace SCOPE-IN-01
  part batteryEvidenceChargeQualificationSupervisor : BatteryEvidenceChargeQualificationSupervisor;
}
