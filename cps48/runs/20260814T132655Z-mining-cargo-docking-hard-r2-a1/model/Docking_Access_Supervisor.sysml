// Canonical final source: approved architecture plus owner-local GUMBO contracts.
// The exact pre-contract checkpoint is retained under validation/architecture-stage/.

// @trace PURPOSE-01
package Docking_Access_Supervisor {
  private import HAMR::*;

  // Exact finite boundary domains.
  // @trace MON-REQ-01
  enum def AccessRequest {
    enum NONE; enum INVALID; enum DOCK_A; enum DOCK_B;
    enum ACCESS_A; enum ACCESS_B; enum UNDOCK_A; enum UNDOCK_B;
  }
  // @trace MON-VES-01
  enum def VesselStatus {
    enum INVALID; enum ON_WARP; enum IN_GRID; enum DOCKED_A; enum DOCKED_B;
    enum DEPARTED_A; enum DEPARTED_B;
  }
  // @trace MON-STA-01
  enum def StationReport {
    enum NONE; enum INVALID; enum AVAILABLE; enum CLEAR_A; enum CLEAR_B;
    enum SECURED_A; enum SECURED_B; enum DENIED; enum RELEASED_A; enum RELEASED_B;
  }
  // @trace MON-SVC-01
  enum def ServiceActivity { enum INVALID; enum QUIESCENT; enum ACTIVE; }
  // @trace MON-CTL-01
  enum def ControlEvent { enum NONE; enum EMERGENCY_STOP; enum RESET; enum VERIFY_CLEAR; enum VERIFY_DOCKED; }

  // Public and retained policy domains.
  // @trace TYPE-TOK-01
  enum def Correlation { enum NONE; enum A; enum B; }
  // @trace TYPE-ACT-01
  enum def SupervisoryAction {
    enum HOLD; enum REQUEST_DOCK_CLEARANCE; enum AUTHORIZE_DOCK_APPROACH;
    enum OPEN_SERVICE_ACCESS; enum CLOSE_SERVICE_ACCESS; enum REQUEST_UNDOCK_RELEASE;
    enum AUTHORIZE_UNDOCK; enum REVOKE_SERVICE_ACCESS;
  }
  // @trace TYPE-CAUSE-01
  enum def DecisionCause {
    enum FAULT_OR_RECOVERY; enum DEPARTURE_CONFIRMATION; enum UNDOCK_SEQUENCE;
    enum DOCKING_PROGRESS; enum ACCESS_REQUEST; enum NEW_DOCK_REQUEST;
    enum NO_ELIGIBLE_ACTION;
  }
  // @trace TYPE-MODE-01
  enum def PublicMode { enum HOLDING; enum DOCKING; enum ACCESSIBLE; enum UNDOCKING; enum QUARANTINED; }
  // @trace TYPE-DISP-01
  enum def RequestDisposition { enum NO_REQUEST; enum ACCEPTED; enum DUPLICATE; enum REJECTED; enum DEFERRED; }
  // @trace TYPE-ACC-01
  enum def AccessStatus { enum CLOSED; enum OPEN; enum REVOKED; }
  // @trace TYPE-OUT-01
  enum def DockingOutcome {
    enum NONE; enum DOCKING_ACTIVE; enum DOCKED_ACCESS_READY; enum ACCESS_ACTIVE;
    enum UNDOCKING_ACTIVE; enum DEPARTURE_COMPLETE; enum RECOVERY_REQUIRED;
  }
  // @trace TYPE-PHASE-01
  enum def DecisionContext { enum CLEAR; enum DOCKING; enum DOCKED_CLOSED; enum ACCESS_OPEN; enum UNDOCKING; enum QUARANTINED; }
  // @trace TYPE-STATE-01
  enum def RequestLedger { enum NO_HISTORY; enum A_LAST; enum B_LAST; }
  // @trace TYPE-STATE-01
  enum def LifecycleState {
    enum CLEAR_IDLE; enum AWAIT_CLEAR_A; enum AWAIT_CLEAR_B; enum AWAIT_DOCK_A;
    enum AWAIT_DOCK_B; enum AWAIT_SECURE_A; enum AWAIT_SECURE_B;
    enum DOCKED_CLOSED_A; enum DOCKED_CLOSED_B; enum ACCESS_OPEN_A;
    enum ACCESS_OPEN_B; enum AWAIT_RELEASE_A; enum AWAIT_RELEASE_B;
    enum AWAIT_DEPART_A; enum AWAIT_DEPART_B; enum DOCKED_REBASE; enum QUARANTINED;
  }
  // @trace TYPE-STATE-02
  enum def BerthState { enum UNKNOWN; enum AVAILABLE; enum RESERVED; enum SECURED; enum RELEASED; }
  // @trace TYPE-STATE-02
  enum def GateState { enum CLOSED; enum OPEN; }
  // @trace TYPE-STATE-02
  enum def RecoveryState { enum HEALTHY; enum LATCHED; enum RECONCILING; }

  // Owner-local classification and directive domains.
  // @trace TYPE-FACT-01
  enum def RequestOperation { enum NONE; enum DOCK; enum ACCESS; enum UNDOCK; }
  // @trace TYPE-FACT-01
  enum def VesselClass { enum INVALID; enum ON_WARP; enum IN_GRID; enum DOCKED; enum DEPARTED; }
  // @trace TYPE-FACT-01
  enum def StationProgress { enum NONE; enum INVALID; enum AVAILABLE; enum CLEAR; enum SECURED; enum DENIED; enum RELEASED; }
  // @trace TYPE-FACT-01
  enum def ServiceClass { enum INVALID; enum QUIESCENT; enum ACTIVE; }
  // @trace TYPE-DEC-01
  enum def RecoveryIntent { enum RETAIN; enum LATCH; enum RECONCILE; enum OPEN_CLEAR; enum OPEN_DOCKED; }
  // @trace TYPE-DEC-01
  enum def LifecycleDirective {
    enum RETAIN; enum QUARANTINE; enum ANCHOR_CLEAR; enum ANCHOR_DOCKED;
    enum CLEARANCE; enum DOCKED; enum SECURED; enum OPEN_ACCESS;
    enum CLOSE_ACCESS; enum RELEASED; enum DEPARTED;
  }
  // @trace TYPE-DEC-01
  enum def BerthEvidenceKind {
    enum NO_EVENT; enum DOMINANT_FAULT; enum VERIFIED_CLEAR_ANCHOR;
    enum VERIFIED_DOCKED_ANCHOR; enum STATION_AVAILABLE; enum STATION_CLEARANCE;
    enum STATION_SECURED; enum STATION_RELEASED; enum DEPARTURE_COMPLETION;
  }
  // @trace TYPE-DEC-01
  enum def GateDirective { enum RETAIN; enum FORCE_CLOSE; enum OPEN_SAFE; enum ORDERED_CLOSE; }
  // @trace TYPE-DEC-01
  enum def PriorityKind { enum ORDINARY; enum REVOKE; enum DEPARTURE_COMPLETE; }

  // Every member below is inspected by GUMBO and is therefore a direct attribute.
  // @trace TYPE-FACT-01
  part def RequestFacts :> Data {
    attribute present : Base_Types::Boolean;
    attribute usable : Base_Types::Boolean;
    attribute operation : RequestOperation;
    attribute correlation : Correlation;
    attribute startsAuthorization : Base_Types::Boolean;
  }
  // @trace TYPE-FACT-01
  part def VesselFacts :> Data {
    attribute usable : Base_Types::Boolean;
    attribute lifecycleClass : VesselClass;
    attribute approachReady : Base_Types::Boolean;
    attribute docked : Base_Types::Boolean;
    attribute departed : Base_Types::Boolean;
    attribute correlation : Correlation;
  }
  // @trace TYPE-FACT-01
  part def StationFacts :> Data {
    attribute present : Base_Types::Boolean;
    attribute usable : Base_Types::Boolean;
    attribute progress : StationProgress;
    attribute available : Base_Types::Boolean;
    attribute denied : Base_Types::Boolean;
    attribute correlation : Correlation;
  }
  // @trace TYPE-FACT-01
  part def ServiceFacts :> Data {
    attribute usable : Base_Types::Boolean;
    attribute serviceClass : ServiceClass;
    attribute quiescent : Base_Types::Boolean;
    attribute active : Base_Types::Boolean;
    attribute requestPermitted : Base_Types::Boolean;
  }
  // @trace TYPE-DEC-01
  part def PriorLifecycleView :> Data {
    attribute lifecycle : LifecycleState;
    attribute correlation : Correlation;
  }
  // @trace TYPE-DEC-01
  part def AdmissionGuard :> Data {
    attribute open : Base_Types::Boolean;
    attribute lifecycle : LifecycleState;
    attribute correlation : Correlation;
    attribute berthAvailable : Base_Types::Boolean;
    attribute gateClosed : Base_Types::Boolean;
    attribute recoveryHealthy : Base_Types::Boolean;
  }
  // @trace TYPE-DEC-01
  part def AdmissionDecision :> Data {
    attribute disposition : RequestDisposition;
    attribute operation : RequestOperation;
    attribute correlation : Correlation;
    attribute accepted : Base_Types::Boolean;
    attribute startsAuthorization : Base_Types::Boolean;
  }
  // @trace TYPE-DEC-01
  part def RecoveryTransition :> Data {
    attribute intent : RecoveryIntent;
    attribute fault : Base_Types::Boolean;
    attribute verifiedAnchor : Base_Types::Boolean;
  }
  // @trace TYPE-DEC-01
  part def CoordinationFrame :> Data {
    attribute directive : LifecycleDirective;
    attribute correlation : Correlation;
    attribute qualified : Base_Types::Boolean;
    attribute decisionContext : DecisionContext;
  }
  // @trace TYPE-DEC-01
  part def BerthTransitionEvidence :> Data {
    attribute eventKind : BerthEvidenceKind;
    attribute correlation : Correlation;
    attribute qualified : Base_Types::Boolean;
  }
  // @trace TYPE-DEC-01
  part def GateSafetyFrame :> Data {
    attribute directive : GateDirective;
    attribute safeToOpen : Base_Types::Boolean;
    attribute decisionContext : DecisionContext;
  }
  // @trace TYPE-DEC-01
  part def PriorityDirective :> Data {
    attribute priority : PriorityKind;
    attribute correlation : Correlation;
    attribute decisionContext : DecisionContext;
  }
  // @trace TYPE-DEC-01
  part def DockingProposal :> Data {
    attribute applicable : Base_Types::Boolean;
    attribute proposedAction : SupervisoryAction;
    attribute cause : DecisionCause;
    attribute correlation : Correlation;
    attribute decisionContext : DecisionContext;
  }
  // @trace TYPE-DEC-01
  part def AccessProposal :> Data {
    attribute applicable : Base_Types::Boolean;
    attribute proposedAction : SupervisoryAction;
    attribute cause : DecisionCause;
    attribute correlation : Correlation;
    attribute decisionContext : DecisionContext;
  }
  // @trace TYPE-DEC-01
  part def UndockingProposal :> Data {
    attribute applicable : Base_Types::Boolean;
    attribute proposedAction : SupervisoryAction;
    attribute cause : DecisionCause;
    attribute correlation : Correlation;
    attribute decisionContext : DecisionContext;
  }
  // @trace TYPE-DEC-01
  part def DockingDecisionFrame :> Data {
    attribute proposedAction : SupervisoryAction;
    attribute cause : DecisionCause;
    attribute correlation : Correlation;
    attribute decisionContext : DecisionContext;
  }
  // @trace CTRL-RES-01
  part def DockingAccessResult :> Data {
    attribute proposedAction : SupervisoryAction;
    attribute cause : DecisionCause;
    attribute mode : PublicMode;
    attribute correlation : Correlation;
    attribute disposition : RequestDisposition;
    attribute status : AccessStatus;
    attribute outcome : DockingOutcome;
  }

  // @trace PART-01
  part def RequestClassification :> Thread {
    // @trace INT-01
    port access_request : DataPort { in :>> type : AccessRequest; }
    // @trace INT-07
    port request_facts : DataPort { out :>> type : RequestFacts; }

    language "GUMBO" /*{
      initialize
        // @trace ASM-INIT-01
        guarantee INITIAL_REQUEST_FACTS_SAFE:
          request_facts.present == F & request_facts.usable &
          request_facts.operation == RequestOperation.NONE &
          request_facts.correlation == Correlation.NONE &
          request_facts.startsAuthorization == F;
      compute
        compute_cases
          // @trace CASE-01
          case REQUEST_NONE:
            assume access_request == AccessRequest.NONE;
            guarantee request_facts.present == F & request_facts.usable &
              request_facts.operation == RequestOperation.NONE &
              request_facts.correlation == Correlation.NONE &
              request_facts.startsAuthorization == F;
          // @trace CASE-02
          case REQUEST_USABLE:
            assume access_request != AccessRequest.NONE & access_request != AccessRequest.INVALID;
            guarantee request_facts.present & request_facts.usable &
              (((access_request == AccessRequest.DOCK_A |
                 access_request == AccessRequest.DOCK_B) &
                request_facts.operation == RequestOperation.DOCK &
                request_facts.startsAuthorization) |
               ((access_request == AccessRequest.ACCESS_A |
                 access_request == AccessRequest.ACCESS_B) &
                request_facts.operation == RequestOperation.ACCESS &
                request_facts.startsAuthorization == F) |
               ((access_request == AccessRequest.UNDOCK_A |
                 access_request == AccessRequest.UNDOCK_B) &
                request_facts.operation == RequestOperation.UNDOCK &
                request_facts.startsAuthorization == F)) &
              (((access_request == AccessRequest.DOCK_A |
                 access_request == AccessRequest.ACCESS_A |
                 access_request == AccessRequest.UNDOCK_A) &
                request_facts.correlation == Correlation.A) |
               ((access_request == AccessRequest.DOCK_B |
                 access_request == AccessRequest.ACCESS_B |
                 access_request == AccessRequest.UNDOCK_B) &
                request_facts.correlation == Correlation.B));
          // @trace CASE-03
          case REQUEST_INVALID:
            assume access_request == AccessRequest.INVALID;
            guarantee request_facts.present & request_facts.usable == F &
              request_facts.operation == RequestOperation.NONE &
              request_facts.correlation == Correlation.NONE &
              request_facts.startsAuthorization == F;
    }*/
  }
  // @trace PART-02
  part def VesselStatusAssessment :> Thread {
    // @trace INT-02
    port vessel_status : DataPort { in :>> type : VesselStatus; }
    // @trace INT-08
    port vessel_readiness : DataPort { out :>> type : VesselFacts; }
    // @trace INT-10
    port vessel_facts : DataPort { out :>> type : VesselFacts; }

    language "GUMBO" /*{
      initialize
        // @trace ASM-INIT-01
        guarantee INITIAL_VESSEL_FACTS_SAFE:
          vessel_readiness.usable == F &
          vessel_readiness.lifecycleClass == VesselClass.INVALID &
          vessel_readiness.approachReady == F & vessel_readiness.docked == F &
          vessel_readiness.departed == F &
          vessel_readiness.correlation == Correlation.NONE &
          vessel_facts.usable == vessel_readiness.usable &
          vessel_facts.lifecycleClass == vessel_readiness.lifecycleClass &
          vessel_facts.approachReady == vessel_readiness.approachReady &
          vessel_facts.docked == vessel_readiness.docked &
          vessel_facts.departed == vessel_readiness.departed &
          vessel_facts.correlation == vessel_readiness.correlation;
      compute
        // @trace PART-02
        guarantee VESSEL_FACT_DELIVERY:
          vessel_facts.usable == vessel_readiness.usable &
          vessel_facts.lifecycleClass == vessel_readiness.lifecycleClass &
          vessel_facts.approachReady == vessel_readiness.approachReady &
          vessel_facts.docked == vessel_readiness.docked &
          vessel_facts.departed == vessel_readiness.departed &
          vessel_facts.correlation == vessel_readiness.correlation;
        compute_cases
          // @trace CASE-04
          case VESSEL_INVALID:
            assume vessel_status == VesselStatus.INVALID;
            guarantee vessel_readiness.usable == F &
              vessel_readiness.lifecycleClass == VesselClass.INVALID &
              vessel_readiness.approachReady == F & vessel_readiness.docked == F &
              vessel_readiness.departed == F &
              vessel_readiness.correlation == Correlation.NONE;
          // @trace CASE-05
          case VESSEL_UNTAGGED:
            assume vessel_status == VesselStatus.ON_WARP | vessel_status == VesselStatus.IN_GRID;
            guarantee vessel_readiness.usable &
              (((vessel_status == VesselStatus.ON_WARP) &
                vessel_readiness.lifecycleClass == VesselClass.ON_WARP &
                vessel_readiness.approachReady == F) |
               ((vessel_status == VesselStatus.IN_GRID) &
                vessel_readiness.lifecycleClass == VesselClass.IN_GRID &
                vessel_readiness.approachReady)) &
              vessel_readiness.docked == F & vessel_readiness.departed == F &
              vessel_readiness.correlation == Correlation.NONE;
          // @trace CASE-06
          case VESSEL_TAGGED:
            assume vessel_status == VesselStatus.DOCKED_A |
              vessel_status == VesselStatus.DOCKED_B |
              vessel_status == VesselStatus.DEPARTED_A |
              vessel_status == VesselStatus.DEPARTED_B;
            guarantee vessel_readiness.usable &
              (((vessel_status == VesselStatus.DOCKED_A |
                 vessel_status == VesselStatus.DOCKED_B) &
                vessel_readiness.lifecycleClass == VesselClass.DOCKED &
                vessel_readiness.docked & vessel_readiness.departed == F) |
               ((vessel_status == VesselStatus.DEPARTED_A |
                 vessel_status == VesselStatus.DEPARTED_B) &
                vessel_readiness.lifecycleClass == VesselClass.DEPARTED &
                vessel_readiness.docked == F & vessel_readiness.departed)) &
              vessel_readiness.approachReady == F &
              (((vessel_status == VesselStatus.DOCKED_A |
                 vessel_status == VesselStatus.DEPARTED_A) &
                vessel_readiness.correlation == Correlation.A) |
               ((vessel_status == VesselStatus.DOCKED_B |
                 vessel_status == VesselStatus.DEPARTED_B) &
                vessel_readiness.correlation == Correlation.B));
    }*/
  }
  // @trace PART-03
  part def StationReportAssessment :> Thread {
    // @trace INT-03
    port station_report : DataPort { in :>> type : StationReport; }
    // @trace INT-11
    port station_facts : DataPort { out :>> type : StationFacts; }

    language "GUMBO" /*{
      initialize
        // @trace ASM-INIT-01
        guarantee INITIAL_STATION_FACTS_SAFE:
          station_facts.present == F & station_facts.usable &
          station_facts.progress == StationProgress.NONE &
          station_facts.available == F & station_facts.denied == F &
          station_facts.correlation == Correlation.NONE;
      compute
        compute_cases
          // @trace CASE-07
          case STATION_NONE:
            assume station_report == StationReport.NONE;
            guarantee station_facts.present == F & station_facts.usable &
              station_facts.progress == StationProgress.NONE &
              station_facts.available == F & station_facts.denied == F &
              station_facts.correlation == Correlation.NONE;
          // @trace CASE-08
          case STATION_AVAILABLE:
            assume station_report == StationReport.AVAILABLE;
            guarantee station_facts.present & station_facts.usable &
              station_facts.progress == StationProgress.AVAILABLE &
              station_facts.available & station_facts.denied == F &
              station_facts.correlation == Correlation.NONE;
          // @trace CASE-09
          case STATION_PROGRESS:
            assume station_report == StationReport.CLEAR_A |
              station_report == StationReport.CLEAR_B |
              station_report == StationReport.SECURED_A |
              station_report == StationReport.SECURED_B |
              station_report == StationReport.RELEASED_A |
              station_report == StationReport.RELEASED_B;
            guarantee station_facts.present & station_facts.usable &
              station_facts.available == F & station_facts.denied == F &
              (((station_report == StationReport.CLEAR_A |
                 station_report == StationReport.CLEAR_B) &
                station_facts.progress == StationProgress.CLEAR) |
               ((station_report == StationReport.SECURED_A |
                 station_report == StationReport.SECURED_B) &
                station_facts.progress == StationProgress.SECURED) |
               ((station_report == StationReport.RELEASED_A |
                 station_report == StationReport.RELEASED_B) &
                station_facts.progress == StationProgress.RELEASED)) &
              (((station_report == StationReport.CLEAR_A |
                 station_report == StationReport.SECURED_A |
                 station_report == StationReport.RELEASED_A) &
                station_facts.correlation == Correlation.A) |
               ((station_report == StationReport.CLEAR_B |
                 station_report == StationReport.SECURED_B |
                 station_report == StationReport.RELEASED_B) &
                station_facts.correlation == Correlation.B));
          // @trace CASE-10
          case STATION_FAULT:
            assume station_report == StationReport.INVALID |
              station_report == StationReport.DENIED;
            guarantee station_facts.present & station_facts.usable == F &
              station_facts.available == F &
              (((station_report == StationReport.INVALID) &
                station_facts.progress == StationProgress.INVALID &
                station_facts.denied == F) |
               ((station_report == StationReport.DENIED) &
                station_facts.progress == StationProgress.DENIED &
                station_facts.denied)) &
              station_facts.correlation == Correlation.NONE;
    }*/
  }
  // @trace PART-04
  part def ServiceActivityAssessment :> Thread {
    // @trace INT-04
    port service_activity : DataPort { in :>> type : ServiceActivity; }
    // @trace INT-09
    port service_readiness : DataPort { out :>> type : ServiceFacts; }
    // @trace INT-12
    port service_facts : DataPort { out :>> type : ServiceFacts; }

    language "GUMBO" /*{
      initialize
        // @trace ASM-INIT-01
        guarantee INITIAL_SERVICE_FACTS_SAFE:
          service_readiness.usable == F &
          service_readiness.serviceClass == ServiceClass.INVALID &
          service_readiness.quiescent == F & service_readiness.active == F &
          service_readiness.requestPermitted == F &
          service_facts.usable == service_readiness.usable &
          service_facts.serviceClass == service_readiness.serviceClass &
          service_facts.quiescent == service_readiness.quiescent &
          service_facts.active == service_readiness.active &
          service_facts.requestPermitted == service_readiness.requestPermitted;
      compute
        // @trace PART-04
        guarantee SERVICE_FACT_DELIVERY:
          service_facts.usable == service_readiness.usable &
          service_facts.serviceClass == service_readiness.serviceClass &
          service_facts.quiescent == service_readiness.quiescent &
          service_facts.active == service_readiness.active &
          service_facts.requestPermitted == service_readiness.requestPermitted;
        compute_cases
          // @trace CASE-11
          case SERVICE_INVALID:
            assume service_activity == ServiceActivity.INVALID;
            guarantee service_readiness.usable == F &
              service_readiness.serviceClass == ServiceClass.INVALID &
              service_readiness.quiescent == F & service_readiness.active == F &
              service_readiness.requestPermitted == F;
          // @trace CASE-12
          case SERVICE_QUIESCENT:
            assume service_activity == ServiceActivity.QUIESCENT;
            guarantee service_readiness.usable &
              service_readiness.serviceClass == ServiceClass.QUIESCENT &
              service_readiness.quiescent & service_readiness.active == F &
              service_readiness.requestPermitted;
          // @trace CASE-13
          case SERVICE_ACTIVE:
            assume service_activity == ServiceActivity.ACTIVE;
            guarantee service_readiness.usable &
              service_readiness.serviceClass == ServiceClass.ACTIVE &
              service_readiness.quiescent == F & service_readiness.active &
              service_readiness.requestPermitted == F;
    }*/
  }
  // @trace PART-05
  part def RequestAdmission :> Thread {
    // @trace INT-07
    port request_facts : DataPort { in :>> type : RequestFacts; }
    // @trace INT-08
    port vessel_readiness : DataPort { in :>> type : VesselFacts; }
    // @trace INT-09
    port service_readiness : DataPort { in :>> type : ServiceFacts; }
    // @trace INT-18
    port admission_guard : DataPort { in :>> type : AdmissionGuard; }
    // @trace INT-22
    port lifecycle_admission : DataPort { out :>> type : AdmissionDecision; }
    // @trace INT-23
    port gate_admission : DataPort { out :>> type : AdmissionDecision; }
    // @trace INT-24
    port docking_admission : DataPort { out :>> type : AdmissionDecision; }
    // @trace INT-25
    port access_admission : DataPort { out :>> type : AdmissionDecision; }
    // @trace INT-26
    port undocking_admission : DataPort { out :>> type : AdmissionDecision; }
    // @trace INT-35
    port request_disposition : DataPort { out :>> type : RequestDisposition; }

    language "GUMBO" /*{
      state
        // @trace TYPE-STATE-01
        requestLedger: RequestLedger;
      initialize
        modifies requestLedger;
        // @trace ASM-INIT-01
        guarantee INITIAL_REQUEST_LEDGER:
          requestLedger == RequestLedger.NO_HISTORY &
          lifecycle_admission.disposition == RequestDisposition.NO_REQUEST &
          lifecycle_admission.operation == RequestOperation.NONE &
          lifecycle_admission.correlation == Correlation.NONE &
          lifecycle_admission.accepted == F &
          lifecycle_admission.startsAuthorization == F &
          gate_admission.disposition == lifecycle_admission.disposition &
          gate_admission.operation == lifecycle_admission.operation &
          gate_admission.correlation == lifecycle_admission.correlation &
          gate_admission.accepted == lifecycle_admission.accepted &
          gate_admission.startsAuthorization == lifecycle_admission.startsAuthorization &
          docking_admission.disposition == lifecycle_admission.disposition &
          docking_admission.operation == lifecycle_admission.operation &
          docking_admission.correlation == lifecycle_admission.correlation &
          docking_admission.accepted == lifecycle_admission.accepted &
          docking_admission.startsAuthorization == lifecycle_admission.startsAuthorization &
          access_admission.disposition == lifecycle_admission.disposition &
          access_admission.operation == lifecycle_admission.operation &
          access_admission.correlation == lifecycle_admission.correlation &
          access_admission.accepted == lifecycle_admission.accepted &
          access_admission.startsAuthorization == lifecycle_admission.startsAuthorization &
          undocking_admission.disposition == lifecycle_admission.disposition &
          undocking_admission.operation == lifecycle_admission.operation &
          undocking_admission.correlation == lifecycle_admission.correlation &
          undocking_admission.accepted == lifecycle_admission.accepted &
          undocking_admission.startsAuthorization == lifecycle_admission.startsAuthorization &
          request_disposition == lifecycle_admission.disposition;
      compute
        modifies requestLedger;
        // @trace PART-05
        guarantee ADMISSION_DECISION_DELIVERY:
          gate_admission.disposition == lifecycle_admission.disposition &
          gate_admission.operation == lifecycle_admission.operation &
          gate_admission.correlation == lifecycle_admission.correlation &
          gate_admission.accepted == lifecycle_admission.accepted &
          gate_admission.startsAuthorization == lifecycle_admission.startsAuthorization &
          docking_admission.disposition == lifecycle_admission.disposition &
          docking_admission.operation == lifecycle_admission.operation &
          docking_admission.correlation == lifecycle_admission.correlation &
          docking_admission.accepted == lifecycle_admission.accepted &
          docking_admission.startsAuthorization == lifecycle_admission.startsAuthorization &
          access_admission.disposition == lifecycle_admission.disposition &
          access_admission.operation == lifecycle_admission.operation &
          access_admission.correlation == lifecycle_admission.correlation &
          access_admission.accepted == lifecycle_admission.accepted &
          access_admission.startsAuthorization == lifecycle_admission.startsAuthorization &
          undocking_admission.disposition == lifecycle_admission.disposition &
          undocking_admission.operation == lifecycle_admission.operation &
          undocking_admission.correlation == lifecycle_admission.correlation &
          undocking_admission.accepted == lifecycle_admission.accepted &
          undocking_admission.startsAuthorization == lifecycle_admission.startsAuthorization &
          request_disposition == lifecycle_admission.disposition;
        compute_cases
          // @trace CASE-14
          case NO_REQUEST:
            assume request_facts.present == F;
            guarantee lifecycle_admission.disposition == RequestDisposition.NO_REQUEST &
              lifecycle_admission.operation == RequestOperation.NONE &
              lifecycle_admission.correlation == Correlation.NONE &
              lifecycle_admission.accepted == F &
              lifecycle_admission.startsAuthorization == F &
              requestLedger == In(requestLedger);
          // @trace CASE-15
          case INVALID_REQUEST:
            assume request_facts.present & request_facts.usable == F;
            guarantee lifecycle_admission.disposition == RequestDisposition.REJECTED &
              lifecycle_admission.operation == RequestOperation.NONE &
              lifecycle_admission.correlation == Correlation.NONE &
              lifecycle_admission.accepted == F &
              lifecycle_admission.startsAuthorization == F &
              requestLedger == In(requestLedger);
          // @trace CASE-16
          case FRESH_DOCK_ACCEPTED:
            assume request_facts.usable &
              request_facts.operation == RequestOperation.DOCK &
              admission_guard.open &
              admission_guard.lifecycle == LifecycleState.CLEAR_IDLE &
              admission_guard.berthAvailable & vessel_readiness.approachReady &
              ((request_facts.correlation == Correlation.A &
                In(requestLedger) != RequestLedger.A_LAST) |
               (request_facts.correlation == Correlation.B &
                In(requestLedger) != RequestLedger.B_LAST));
            guarantee lifecycle_admission.disposition == RequestDisposition.ACCEPTED &
              lifecycle_admission.operation == RequestOperation.DOCK &
              lifecycle_admission.correlation == request_facts.correlation &
              lifecycle_admission.accepted &
              lifecycle_admission.startsAuthorization &
              ((request_facts.correlation == Correlation.A &
                requestLedger == RequestLedger.A_LAST) |
               (request_facts.correlation == Correlation.B &
                requestLedger == RequestLedger.B_LAST));
          // @trace CASE-17
          case DUPLICATE_DOCK:
            assume request_facts.usable &
              request_facts.operation == RequestOperation.DOCK & admission_guard.open &
              ((request_facts.correlation == Correlation.A &
                In(requestLedger) == RequestLedger.A_LAST) |
               (request_facts.correlation == Correlation.B &
                In(requestLedger) == RequestLedger.B_LAST));
            guarantee lifecycle_admission.disposition == RequestDisposition.DUPLICATE &
              lifecycle_admission.operation == RequestOperation.NONE &
              lifecycle_admission.correlation == request_facts.correlation &
              lifecycle_admission.accepted == F &
              lifecycle_admission.startsAuthorization == F &
              requestLedger == In(requestLedger);
          // @trace CASE-18
          case DOCK_NOT_READY:
            assume request_facts.usable &
              request_facts.operation == RequestOperation.DOCK & admission_guard.open &
              admission_guard.lifecycle == LifecycleState.CLEAR_IDLE &
              ((request_facts.correlation == Correlation.A &
                In(requestLedger) != RequestLedger.A_LAST) |
               (request_facts.correlation == Correlation.B &
                In(requestLedger) != RequestLedger.B_LAST)) &
              (vessel_readiness.approachReady == F |
               admission_guard.berthAvailable == F);
            guarantee lifecycle_admission.disposition == RequestDisposition.REJECTED &
              lifecycle_admission.operation == RequestOperation.NONE &
              lifecycle_admission.correlation == request_facts.correlation &
              lifecycle_admission.accepted == F &
              lifecycle_admission.startsAuthorization == F &
              requestLedger == In(requestLedger);
          // @trace CASE-19
          case DOCK_DEFERRED:
            assume request_facts.usable &
              request_facts.operation == RequestOperation.DOCK &
              (admission_guard.open == F |
               (admission_guard.lifecycle != LifecycleState.CLEAR_IDLE &
                ((request_facts.correlation == Correlation.A &
                  In(requestLedger) != RequestLedger.A_LAST) |
                 (request_facts.correlation == Correlation.B &
                  In(requestLedger) != RequestLedger.B_LAST))));
            guarantee lifecycle_admission.disposition == RequestDisposition.DEFERRED &
              lifecycle_admission.operation == RequestOperation.NONE &
              lifecycle_admission.correlation == request_facts.correlation &
              lifecycle_admission.accepted == F &
              lifecycle_admission.startsAuthorization == F &
              requestLedger == In(requestLedger);
          // @trace CASE-20
          case ACCESS_PARTITION:
            assume request_facts.usable &
              request_facts.operation == RequestOperation.ACCESS;
            guarantee
              ((admission_guard.open &
                (((admission_guard.lifecycle == LifecycleState.DOCKED_CLOSED_A &
                   request_facts.correlation == Correlation.A) |
                  (admission_guard.lifecycle == LifecycleState.DOCKED_CLOSED_B &
                   request_facts.correlation == Correlation.B)) |
                 (admission_guard.lifecycle == LifecycleState.DOCKED_REBASE &
                  ((request_facts.correlation == Correlation.A &
                    In(requestLedger) != RequestLedger.A_LAST) |
                   (request_facts.correlation == Correlation.B &
                    In(requestLedger) != RequestLedger.B_LAST)))) &
                service_readiness.quiescent &
                lifecycle_admission.disposition == RequestDisposition.ACCEPTED &
                lifecycle_admission.operation == RequestOperation.ACCESS &
                lifecycle_admission.correlation == request_facts.correlation &
                lifecycle_admission.accepted &
                lifecycle_admission.startsAuthorization ==
                  (admission_guard.lifecycle == LifecycleState.DOCKED_REBASE) &
                (((admission_guard.lifecycle == LifecycleState.DOCKED_REBASE &
                   request_facts.correlation == Correlation.A) &
                  requestLedger == RequestLedger.A_LAST) |
                 ((admission_guard.lifecycle == LifecycleState.DOCKED_REBASE &
                   request_facts.correlation == Correlation.B) &
                  requestLedger == RequestLedger.B_LAST) |
                 (admission_guard.lifecycle != LifecycleState.DOCKED_REBASE &
                  requestLedger == In(requestLedger)))) |
               (admission_guard.open == F &
                lifecycle_admission.disposition == RequestDisposition.DEFERRED &
                lifecycle_admission.operation == RequestOperation.NONE &
                lifecycle_admission.correlation == request_facts.correlation &
                lifecycle_admission.accepted == F &
                lifecycle_admission.startsAuthorization == F &
                requestLedger == In(requestLedger)) |
               (admission_guard.open &
                ((((admission_guard.lifecycle != LifecycleState.DOCKED_CLOSED_A |
                    request_facts.correlation != Correlation.A) &
                   (admission_guard.lifecycle != LifecycleState.DOCKED_CLOSED_B |
                    request_facts.correlation != Correlation.B) &
                   admission_guard.lifecycle != LifecycleState.DOCKED_REBASE) |
                  service_readiness.quiescent == F)) &
                lifecycle_admission.disposition == RequestDisposition.REJECTED &
                lifecycle_admission.operation == RequestOperation.NONE &
                lifecycle_admission.correlation == request_facts.correlation &
                lifecycle_admission.accepted == F &
                lifecycle_admission.startsAuthorization == F &
                requestLedger == In(requestLedger)));
          // @trace CASE-21
          case UNDOCK_PARTITION:
            assume request_facts.usable &
              request_facts.operation == RequestOperation.UNDOCK;
            guarantee
              ((admission_guard.open & service_readiness.quiescent &
                ((admission_guard.lifecycle == LifecycleState.ACCESS_OPEN_A &
                  request_facts.correlation == Correlation.A) |
                 (admission_guard.lifecycle == LifecycleState.ACCESS_OPEN_B &
                  request_facts.correlation == Correlation.B)) &
                lifecycle_admission.disposition == RequestDisposition.ACCEPTED &
                lifecycle_admission.operation == RequestOperation.UNDOCK &
                lifecycle_admission.correlation == request_facts.correlation &
                lifecycle_admission.accepted &
                lifecycle_admission.startsAuthorization == F &
                requestLedger == In(requestLedger)) |
               ((admission_guard.open == F |
                 (service_readiness.active &
                  ((admission_guard.lifecycle == LifecycleState.ACCESS_OPEN_A &
                    request_facts.correlation == Correlation.A) |
                   (admission_guard.lifecycle == LifecycleState.ACCESS_OPEN_B &
                    request_facts.correlation == Correlation.B))) &
                lifecycle_admission.disposition == RequestDisposition.DEFERRED &
                lifecycle_admission.operation == RequestOperation.NONE &
                lifecycle_admission.correlation == request_facts.correlation &
                lifecycle_admission.accepted == F &
                lifecycle_admission.startsAuthorization == F &
                requestLedger == In(requestLedger)) |
               (admission_guard.open & service_readiness.active == F &
                ((admission_guard.lifecycle != LifecycleState.ACCESS_OPEN_A |
                  request_facts.correlation != Correlation.A) &
                 (admission_guard.lifecycle != LifecycleState.ACCESS_OPEN_B |
                  request_facts.correlation != Correlation.B)) &
                lifecycle_admission.disposition == RequestDisposition.REJECTED &
                lifecycle_admission.operation == RequestOperation.NONE &
                lifecycle_admission.correlation == request_facts.correlation &
                lifecycle_admission.accepted == F &
                lifecycle_admission.startsAuthorization == F &
                requestLedger == In(requestLedger))));
    }*/
  }
  // @trace PART-06
  part def AccessCoherence :> Thread {
    // @trace INT-05
    port control_event : DataPort { in :>> type : ControlEvent; }
    // @trace INT-10
    port vessel_facts : DataPort { in :>> type : VesselFacts; }
    // @trace INT-11
    port station_facts : DataPort { in :>> type : StationFacts; }
    // @trace INT-12
    port service_facts : DataPort { in :>> type : ServiceFacts; }
    // @trace INT-13
    port prior_lifecycle_view : DataPort { in :>> type : PriorLifecycleView; }
    // @trace INT-14
    port prior_berth_state : DataPort { in :>> type : BerthState; }
    // @trace INT-15
    port prior_gate_state : DataPort { in :>> type : GateState; }
    // @trace INT-16
    port prior_recovery_state : DataPort { in :>> type : RecoveryState; }
    // @trace INT-17
    port recovery_transition : DataPort { out :>> type : RecoveryTransition; }
    // @trace INT-18
    port admission_guard : DataPort { out :>> type : AdmissionGuard; }
    // @trace INT-19
    port lifecycle_frame : DataPort { out :>> type : CoordinationFrame; }
    // @trace INT-20
    port berth_transition_evidence : DataPort { out :>> type : BerthTransitionEvidence; }
    // @trace INT-21
    port gate_safety_frame : DataPort { out :>> type : GateSafetyFrame; }
    // @trace INT-27
    port docking_frame : DataPort { out :>> type : CoordinationFrame; }
    // @trace INT-28
    port access_frame : DataPort { out :>> type : CoordinationFrame; }
    // @trace INT-29
    port undocking_frame : DataPort { out :>> type : CoordinationFrame; }
    // @trace INT-33
    port priority_directive : DataPort { out :>> type : PriorityDirective; }

    language "GUMBO" /*{
      initialize
        // @trace ASM-INIT-01
        guarantee INITIAL_COHERENCE_SAFE:
          recovery_transition.intent == RecoveryIntent.RETAIN &
          recovery_transition.fault == F &
          recovery_transition.verifiedAnchor == F &
          admission_guard.open == F &
          admission_guard.lifecycle == LifecycleState.CLEAR_IDLE &
          admission_guard.correlation == Correlation.NONE &
          admission_guard.berthAvailable &
          admission_guard.gateClosed &
          admission_guard.recoveryHealthy &
          lifecycle_frame.directive == LifecycleDirective.RETAIN &
          lifecycle_frame.correlation == Correlation.NONE &
          lifecycle_frame.qualified == F &
          lifecycle_frame.decisionContext == DecisionContext.CLEAR &
          berth_transition_evidence.eventKind == BerthEvidenceKind.NO_EVENT &
          berth_transition_evidence.correlation == Correlation.NONE &
          berth_transition_evidence.qualified == F &
          gate_safety_frame.directive == GateDirective.RETAIN &
          gate_safety_frame.safeToOpen == F &
          gate_safety_frame.decisionContext == DecisionContext.CLEAR &
          docking_frame.directive == LifecycleDirective.RETAIN &
          docking_frame.correlation == Correlation.NONE &
          docking_frame.qualified == F &
          docking_frame.decisionContext == DecisionContext.CLEAR &
          access_frame.directive == LifecycleDirective.RETAIN &
          access_frame.correlation == Correlation.NONE &
          access_frame.qualified == F &
          access_frame.decisionContext == DecisionContext.CLEAR &
          undocking_frame.directive == LifecycleDirective.RETAIN &
          undocking_frame.correlation == Correlation.NONE &
          undocking_frame.qualified == F &
          undocking_frame.decisionContext == DecisionContext.CLEAR &
          priority_directive.priority == PriorityKind.ORDINARY &
          priority_directive.correlation == Correlation.NONE &
          priority_directive.decisionContext == DecisionContext.CLEAR;
      compute
        compute_cases
          // @trace CASE-22
          case COHERENCE_FAULT:
            assume control_event == ControlEvent.EMERGENCY_STOP |
              vessel_facts.usable == F | station_facts.usable == F |
              service_facts.usable == F | station_facts.denied |
              (service_facts.active & prior_gate_state == GateState.CLOSED) |
              (prior_recovery_state == RecoveryState.HEALTHY &
               ((vessel_facts.correlation != Correlation.NONE &
                 vessel_facts.correlation != prior_lifecycle_view.correlation) |
                (station_facts.correlation != Correlation.NONE &
                 station_facts.correlation != prior_lifecycle_view.correlation))) |
              (prior_recovery_state == RecoveryState.HEALTHY &
               prior_lifecycle_view.lifecycle == LifecycleState.QUARANTINED) |
              (prior_recovery_state != RecoveryState.HEALTHY &
               prior_lifecycle_view.lifecycle != LifecycleState.QUARANTINED &
               prior_lifecycle_view.lifecycle != LifecycleState.DOCKED_REBASE) |
              (prior_gate_state == GateState.OPEN &
               (prior_berth_state != BerthState.SECURED |
                (prior_lifecycle_view.lifecycle != LifecycleState.ACCESS_OPEN_A &
                 prior_lifecycle_view.lifecycle != LifecycleState.ACCESS_OPEN_B))) |
              (((prior_lifecycle_view.lifecycle == LifecycleState.ACCESS_OPEN_A) |
                (prior_lifecycle_view.lifecycle == LifecycleState.ACCESS_OPEN_B)) &
               prior_gate_state != GateState.OPEN) |
              (station_facts.progress == StationProgress.CLEAR &
               prior_lifecycle_view.lifecycle != LifecycleState.AWAIT_CLEAR_A &
               prior_lifecycle_view.lifecycle != LifecycleState.AWAIT_CLEAR_B) |
              (station_facts.progress == StationProgress.SECURED &
               prior_lifecycle_view.lifecycle != LifecycleState.AWAIT_DOCK_A &
               prior_lifecycle_view.lifecycle != LifecycleState.AWAIT_DOCK_B &
               prior_lifecycle_view.lifecycle != LifecycleState.AWAIT_SECURE_A &
               prior_lifecycle_view.lifecycle != LifecycleState.AWAIT_SECURE_B &
               prior_lifecycle_view.lifecycle != LifecycleState.DOCKED_CLOSED_A &
               prior_lifecycle_view.lifecycle != LifecycleState.DOCKED_CLOSED_B &
               prior_lifecycle_view.lifecycle != LifecycleState.ACCESS_OPEN_A &
               prior_lifecycle_view.lifecycle != LifecycleState.ACCESS_OPEN_B) |
              (station_facts.progress == StationProgress.RELEASED &
               prior_lifecycle_view.lifecycle != LifecycleState.AWAIT_RELEASE_A &
               prior_lifecycle_view.lifecycle != LifecycleState.AWAIT_RELEASE_B &
               prior_lifecycle_view.lifecycle != LifecycleState.AWAIT_DEPART_A &
               prior_lifecycle_view.lifecycle != LifecycleState.AWAIT_DEPART_B) |
              (vessel_facts.departed &
               prior_lifecycle_view.lifecycle != LifecycleState.AWAIT_DEPART_A &
               prior_lifecycle_view.lifecycle != LifecycleState.AWAIT_DEPART_B) |
              (vessel_facts.docked &
               prior_lifecycle_view.lifecycle != LifecycleState.AWAIT_DOCK_A &
               prior_lifecycle_view.lifecycle != LifecycleState.AWAIT_DOCK_B &
               prior_lifecycle_view.lifecycle != LifecycleState.AWAIT_SECURE_A &
               prior_lifecycle_view.lifecycle != LifecycleState.AWAIT_SECURE_B &
               prior_lifecycle_view.lifecycle != LifecycleState.DOCKED_CLOSED_A &
               prior_lifecycle_view.lifecycle != LifecycleState.DOCKED_CLOSED_B &
               prior_lifecycle_view.lifecycle != LifecycleState.ACCESS_OPEN_A &
               prior_lifecycle_view.lifecycle != LifecycleState.ACCESS_OPEN_B &
               prior_lifecycle_view.lifecycle != LifecycleState.AWAIT_RELEASE_A &
               prior_lifecycle_view.lifecycle != LifecycleState.AWAIT_RELEASE_B &
               prior_lifecycle_view.lifecycle != LifecycleState.AWAIT_DEPART_A &
               prior_lifecycle_view.lifecycle != LifecycleState.AWAIT_DEPART_B &
               prior_lifecycle_view.lifecycle != LifecycleState.DOCKED_REBASE) |
              (vessel_facts.docked & station_facts.progress == StationProgress.CLEAR);
            guarantee recovery_transition.intent == RecoveryIntent.LATCH &
              recovery_transition.fault &
              recovery_transition.verifiedAnchor == F &
              admission_guard.open == F &
              admission_guard.lifecycle == prior_lifecycle_view.lifecycle &
              admission_guard.correlation == Correlation.NONE &
              admission_guard.berthAvailable == F &
              admission_guard.gateClosed &
              admission_guard.recoveryHealthy == F &
              lifecycle_frame.directive == LifecycleDirective.QUARANTINE &
              lifecycle_frame.correlation == Correlation.NONE &
              lifecycle_frame.qualified &
              lifecycle_frame.decisionContext == DecisionContext.QUARANTINED &
              berth_transition_evidence.eventKind == BerthEvidenceKind.DOMINANT_FAULT &
              berth_transition_evidence.correlation == Correlation.NONE &
              berth_transition_evidence.qualified &
              gate_safety_frame.directive == GateDirective.FORCE_CLOSE &
              gate_safety_frame.safeToOpen == F &
              gate_safety_frame.decisionContext == DecisionContext.QUARANTINED &
              docking_frame.directive == LifecycleDirective.QUARANTINE &
              docking_frame.correlation == Correlation.NONE &
              docking_frame.qualified == F &
              docking_frame.decisionContext == DecisionContext.QUARANTINED &
              access_frame.directive == LifecycleDirective.QUARANTINE &
              access_frame.correlation == Correlation.NONE &
              access_frame.qualified == F &
              access_frame.decisionContext == DecisionContext.QUARANTINED &
              undocking_frame.directive == LifecycleDirective.QUARANTINE &
              undocking_frame.correlation == Correlation.NONE &
              undocking_frame.qualified == F &
              undocking_frame.decisionContext == DecisionContext.QUARANTINED &
              priority_directive.priority == PriorityKind.REVOKE &
              priority_directive.correlation == Correlation.NONE &
              priority_directive.decisionContext == DecisionContext.QUARANTINED;
          // @trace CASE-24
          case RECOVERY_RESET:
            assume control_event != ControlEvent.EMERGENCY_STOP &
              vessel_facts.usable & station_facts.usable & service_facts.usable &
              station_facts.denied == F &
              prior_recovery_state == RecoveryState.LATCHED &
              control_event == ControlEvent.RESET;
            guarantee recovery_transition.intent == RecoveryIntent.RECONCILE &
              recovery_transition.fault == F &
              recovery_transition.verifiedAnchor == F &
              admission_guard.open == F &
              admission_guard.lifecycle == prior_lifecycle_view.lifecycle &
              admission_guard.correlation == Correlation.NONE &
              admission_guard.berthAvailable == F &
              admission_guard.gateClosed &
              admission_guard.recoveryHealthy == F &
              lifecycle_frame.directive == LifecycleDirective.RETAIN &
              lifecycle_frame.correlation == Correlation.NONE &
              lifecycle_frame.qualified == F &
              lifecycle_frame.decisionContext == DecisionContext.QUARANTINED &
              berth_transition_evidence.eventKind == BerthEvidenceKind.NO_EVENT &
              berth_transition_evidence.correlation == Correlation.NONE &
              berth_transition_evidence.qualified == F &
              gate_safety_frame.directive == GateDirective.FORCE_CLOSE &
              gate_safety_frame.safeToOpen == F &
              gate_safety_frame.decisionContext == DecisionContext.QUARANTINED &
              docking_frame.directive == LifecycleDirective.RETAIN &
              docking_frame.correlation == Correlation.NONE &
              docking_frame.qualified == F &
              docking_frame.decisionContext == DecisionContext.QUARANTINED &
              access_frame.directive == LifecycleDirective.RETAIN &
              access_frame.correlation == Correlation.NONE &
              access_frame.qualified == F &
              access_frame.decisionContext == DecisionContext.QUARANTINED &
              undocking_frame.directive == LifecycleDirective.RETAIN &
              undocking_frame.correlation == Correlation.NONE &
              undocking_frame.qualified == F &
              undocking_frame.decisionContext == DecisionContext.QUARANTINED &
              priority_directive.priority == PriorityKind.REVOKE &
              priority_directive.correlation == Correlation.NONE &
              priority_directive.decisionContext == DecisionContext.QUARANTINED;
          // @trace CASE-24
          case RECOVERY_CLEAR_ANCHOR:
            assume prior_recovery_state == RecoveryState.RECONCILING &
              control_event == ControlEvent.VERIFY_CLEAR &
              vessel_facts.lifecycleClass == VesselClass.IN_GRID &
              station_facts.progress == StationProgress.AVAILABLE &
              service_facts.quiescent;
            guarantee recovery_transition.intent == RecoveryIntent.OPEN_CLEAR &
              recovery_transition.fault == F & recovery_transition.verifiedAnchor &
              admission_guard.open == F &
              admission_guard.lifecycle == prior_lifecycle_view.lifecycle &
              admission_guard.correlation == Correlation.NONE &
              admission_guard.berthAvailable == F &
              admission_guard.gateClosed &
              admission_guard.recoveryHealthy == F &
              lifecycle_frame.directive == LifecycleDirective.ANCHOR_CLEAR &
              lifecycle_frame.correlation == Correlation.NONE &
              lifecycle_frame.qualified &
              lifecycle_frame.decisionContext == DecisionContext.QUARANTINED &
              berth_transition_evidence.eventKind == BerthEvidenceKind.VERIFIED_CLEAR_ANCHOR &
              berth_transition_evidence.correlation == Correlation.NONE &
              berth_transition_evidence.qualified &
              gate_safety_frame.directive == GateDirective.FORCE_CLOSE &
              gate_safety_frame.safeToOpen == F &
              gate_safety_frame.decisionContext == DecisionContext.QUARANTINED &
              docking_frame.directive == LifecycleDirective.RETAIN &
              docking_frame.correlation == Correlation.NONE &
              docking_frame.qualified == F &
              docking_frame.decisionContext == DecisionContext.QUARANTINED &
              access_frame.directive == LifecycleDirective.RETAIN &
              access_frame.correlation == Correlation.NONE &
              access_frame.qualified == F &
              access_frame.decisionContext == DecisionContext.QUARANTINED &
              undocking_frame.directive == LifecycleDirective.RETAIN &
              undocking_frame.correlation == Correlation.NONE &
              undocking_frame.qualified == F &
              undocking_frame.decisionContext == DecisionContext.QUARANTINED &
              priority_directive.priority == PriorityKind.REVOKE &
              priority_directive.correlation == Correlation.NONE &
              priority_directive.decisionContext == DecisionContext.QUARANTINED;
          // @trace CASE-24
          case RECOVERY_DOCKED_ANCHOR:
            assume prior_recovery_state == RecoveryState.RECONCILING &
              control_event == ControlEvent.VERIFY_DOCKED &
              vessel_facts.docked & station_facts.progress == StationProgress.SECURED &
              vessel_facts.correlation == station_facts.correlation &
              vessel_facts.correlation != Correlation.NONE &
              service_facts.quiescent;
            guarantee recovery_transition.intent == RecoveryIntent.OPEN_DOCKED &
              recovery_transition.fault == F & recovery_transition.verifiedAnchor &
              admission_guard.open == F &
              admission_guard.lifecycle == prior_lifecycle_view.lifecycle &
              admission_guard.correlation == Correlation.NONE &
              admission_guard.berthAvailable == F &
              admission_guard.gateClosed &
              admission_guard.recoveryHealthy == F &
              lifecycle_frame.directive == LifecycleDirective.ANCHOR_DOCKED &
              lifecycle_frame.correlation == Correlation.NONE &
              lifecycle_frame.qualified &
              lifecycle_frame.decisionContext == DecisionContext.QUARANTINED &
              berth_transition_evidence.eventKind == BerthEvidenceKind.VERIFIED_DOCKED_ANCHOR &
              berth_transition_evidence.correlation == Correlation.NONE &
              berth_transition_evidence.qualified &
              gate_safety_frame.directive == GateDirective.FORCE_CLOSE &
              gate_safety_frame.safeToOpen == F &
              gate_safety_frame.decisionContext == DecisionContext.QUARANTINED &
              docking_frame.directive == LifecycleDirective.RETAIN &
              docking_frame.correlation == Correlation.NONE &
              docking_frame.qualified == F &
              docking_frame.decisionContext == DecisionContext.QUARANTINED &
              access_frame.directive == LifecycleDirective.RETAIN &
              access_frame.correlation == Correlation.NONE &
              access_frame.qualified == F &
              access_frame.decisionContext == DecisionContext.QUARANTINED &
              undocking_frame.directive == LifecycleDirective.RETAIN &
              undocking_frame.correlation == Correlation.NONE &
              undocking_frame.qualified == F &
              undocking_frame.decisionContext == DecisionContext.QUARANTINED &
              priority_directive.priority == PriorityKind.REVOKE &
              priority_directive.correlation == Correlation.NONE &
              priority_directive.decisionContext == DecisionContext.QUARANTINED;
          // @trace CASE-24
          case RECOVERY_INHIBITED:
            assume (prior_recovery_state != RecoveryState.HEALTHY |
              control_event != ControlEvent.NONE) &
              (prior_recovery_state != RecoveryState.LATCHED |
               control_event != ControlEvent.RESET) &
              (prior_recovery_state != RecoveryState.RECONCILING |
               control_event != ControlEvent.VERIFY_CLEAR |
               vessel_facts.lifecycleClass != VesselClass.IN_GRID |
               station_facts.progress != StationProgress.AVAILABLE |
               service_facts.quiescent == F) &
              (prior_recovery_state != RecoveryState.RECONCILING |
               control_event != ControlEvent.VERIFY_DOCKED |
               vessel_facts.docked == F |
               station_facts.progress != StationProgress.SECURED |
               vessel_facts.correlation != station_facts.correlation |
               vessel_facts.correlation == Correlation.NONE |
               service_facts.quiescent == F) &
              control_event != ControlEvent.EMERGENCY_STOP &
              vessel_facts.usable & station_facts.usable & service_facts.usable &
              station_facts.denied == F;
            guarantee recovery_transition.intent == RecoveryIntent.RETAIN &
              recovery_transition.fault == F &
              recovery_transition.verifiedAnchor == F &
              admission_guard.open == F &
              admission_guard.lifecycle == prior_lifecycle_view.lifecycle &
              admission_guard.correlation == Correlation.NONE &
              admission_guard.berthAvailable == F &
              admission_guard.gateClosed &
              admission_guard.recoveryHealthy == F &
              lifecycle_frame.directive == LifecycleDirective.RETAIN &
              lifecycle_frame.correlation == Correlation.NONE &
              lifecycle_frame.qualified == F &
              lifecycle_frame.decisionContext == DecisionContext.QUARANTINED &
              berth_transition_evidence.eventKind == BerthEvidenceKind.NO_EVENT &
              berth_transition_evidence.correlation == Correlation.NONE &
              berth_transition_evidence.qualified == F &
              gate_safety_frame.directive == GateDirective.FORCE_CLOSE &
              gate_safety_frame.safeToOpen == F &
              gate_safety_frame.decisionContext == DecisionContext.QUARANTINED &
              docking_frame.directive == LifecycleDirective.RETAIN &
              docking_frame.correlation == Correlation.NONE &
              docking_frame.qualified == F &
              docking_frame.decisionContext == DecisionContext.QUARANTINED &
              access_frame.directive == LifecycleDirective.RETAIN &
              access_frame.correlation == Correlation.NONE &
              access_frame.qualified == F &
              access_frame.decisionContext == DecisionContext.QUARANTINED &
              undocking_frame.directive == LifecycleDirective.RETAIN &
              undocking_frame.correlation == Correlation.NONE &
              undocking_frame.qualified == F &
              undocking_frame.decisionContext == DecisionContext.QUARANTINED &
              priority_directive.priority == PriorityKind.REVOKE &
              priority_directive.correlation == Correlation.NONE &
              priority_directive.decisionContext == DecisionContext.QUARANTINED;
          // @trace CASE-23
          case ORDINARY_COHERENCE:
            assume prior_recovery_state == RecoveryState.HEALTHY &
              control_event == ControlEvent.NONE &
              vessel_facts.usable & station_facts.usable & service_facts.usable &
              station_facts.denied == F &
              (service_facts.active == F | prior_gate_state == GateState.OPEN) &
              (vessel_facts.correlation == Correlation.NONE |
               vessel_facts.correlation == prior_lifecycle_view.correlation) &
              (station_facts.correlation == Correlation.NONE |
               station_facts.correlation == prior_lifecycle_view.correlation) &
              prior_lifecycle_view.lifecycle != LifecycleState.QUARANTINED &
              (prior_gate_state != GateState.OPEN |
               (prior_berth_state == BerthState.SECURED &
                ((prior_lifecycle_view.lifecycle == LifecycleState.ACCESS_OPEN_A) |
                 (prior_lifecycle_view.lifecycle == LifecycleState.ACCESS_OPEN_B)))) &
              (prior_lifecycle_view.lifecycle != LifecycleState.ACCESS_OPEN_A |
               prior_gate_state == GateState.OPEN) &
              (prior_lifecycle_view.lifecycle != LifecycleState.ACCESS_OPEN_B |
               prior_gate_state == GateState.OPEN) &
              (station_facts.progress != StationProgress.CLEAR |
               prior_lifecycle_view.lifecycle == LifecycleState.AWAIT_CLEAR_A |
               prior_lifecycle_view.lifecycle == LifecycleState.AWAIT_CLEAR_B) &
              (station_facts.progress != StationProgress.SECURED |
               prior_lifecycle_view.lifecycle == LifecycleState.AWAIT_DOCK_A |
               prior_lifecycle_view.lifecycle == LifecycleState.AWAIT_DOCK_B |
               prior_lifecycle_view.lifecycle == LifecycleState.AWAIT_SECURE_A |
               prior_lifecycle_view.lifecycle == LifecycleState.AWAIT_SECURE_B |
               prior_lifecycle_view.lifecycle == LifecycleState.DOCKED_CLOSED_A |
               prior_lifecycle_view.lifecycle == LifecycleState.DOCKED_CLOSED_B |
               prior_lifecycle_view.lifecycle == LifecycleState.ACCESS_OPEN_A |
               prior_lifecycle_view.lifecycle == LifecycleState.ACCESS_OPEN_B) &
              (station_facts.progress != StationProgress.RELEASED |
               prior_lifecycle_view.lifecycle == LifecycleState.AWAIT_RELEASE_A |
               prior_lifecycle_view.lifecycle == LifecycleState.AWAIT_RELEASE_B |
               prior_lifecycle_view.lifecycle == LifecycleState.AWAIT_DEPART_A |
               prior_lifecycle_view.lifecycle == LifecycleState.AWAIT_DEPART_B) &
              (vessel_facts.departed == F |
               prior_lifecycle_view.lifecycle == LifecycleState.AWAIT_DEPART_A |
               prior_lifecycle_view.lifecycle == LifecycleState.AWAIT_DEPART_B) &
              (vessel_facts.docked == F |
               prior_lifecycle_view.lifecycle == LifecycleState.AWAIT_DOCK_A |
               prior_lifecycle_view.lifecycle == LifecycleState.AWAIT_DOCK_B |
               prior_lifecycle_view.lifecycle == LifecycleState.AWAIT_SECURE_A |
               prior_lifecycle_view.lifecycle == LifecycleState.AWAIT_SECURE_B |
               prior_lifecycle_view.lifecycle == LifecycleState.DOCKED_CLOSED_A |
               prior_lifecycle_view.lifecycle == LifecycleState.DOCKED_CLOSED_B |
               prior_lifecycle_view.lifecycle == LifecycleState.ACCESS_OPEN_A |
               prior_lifecycle_view.lifecycle == LifecycleState.ACCESS_OPEN_B |
               prior_lifecycle_view.lifecycle == LifecycleState.AWAIT_RELEASE_A |
               prior_lifecycle_view.lifecycle == LifecycleState.AWAIT_RELEASE_B |
               prior_lifecycle_view.lifecycle == LifecycleState.AWAIT_DEPART_A |
               prior_lifecycle_view.lifecycle == LifecycleState.AWAIT_DEPART_B |
               prior_lifecycle_view.lifecycle == LifecycleState.DOCKED_REBASE) &
              (vessel_facts.docked == F | station_facts.progress != StationProgress.CLEAR);
            guarantee recovery_transition.intent == RecoveryIntent.RETAIN &
              recovery_transition.fault == F &
              recovery_transition.verifiedAnchor == F &
              admission_guard.open &
              admission_guard.lifecycle == prior_lifecycle_view.lifecycle &
              admission_guard.correlation == prior_lifecycle_view.correlation &
              admission_guard.berthAvailable ==
                (prior_berth_state == BerthState.AVAILABLE) &
              admission_guard.gateClosed == (prior_gate_state == GateState.CLOSED) &
              admission_guard.recoveryHealthy &
              (((station_facts.progress == StationProgress.CLEAR) &
                lifecycle_frame.directive == LifecycleDirective.CLEARANCE &
                lifecycle_frame.correlation == station_facts.correlation &
                lifecycle_frame.qualified) |
               (vessel_facts.docked &
                (((prior_berth_state == BerthState.SECURED) &
                  lifecycle_frame.directive == LifecycleDirective.SECURED) |
                 ((prior_berth_state != BerthState.SECURED) &
                  lifecycle_frame.directive == LifecycleDirective.DOCKED)) &
                lifecycle_frame.correlation == vessel_facts.correlation &
                lifecycle_frame.qualified) |
               (station_facts.progress == StationProgress.SECURED &
                vessel_facts.docked == F &
                ((((prior_lifecycle_view.lifecycle == LifecycleState.AWAIT_SECURE_A) |
                   (prior_lifecycle_view.lifecycle == LifecycleState.AWAIT_SECURE_B)) &
                  lifecycle_frame.directive == LifecycleDirective.SECURED &
                  lifecycle_frame.qualified) |
                 ((prior_lifecycle_view.lifecycle != LifecycleState.AWAIT_SECURE_A &
                   prior_lifecycle_view.lifecycle != LifecycleState.AWAIT_SECURE_B) &
                  lifecycle_frame.directive == LifecycleDirective.RETAIN &
                  lifecycle_frame.qualified == F)) &
                lifecycle_frame.correlation == station_facts.correlation &
                lifecycle_frame.decisionContext == DecisionContext.DOCKING) |
               (station_facts.progress == StationProgress.RELEASED &
                vessel_facts.docked == F &
                lifecycle_frame.directive == LifecycleDirective.RELEASED &
                lifecycle_frame.correlation == station_facts.correlation &
                lifecycle_frame.qualified) |
               (vessel_facts.departed &
                lifecycle_frame.directive == LifecycleDirective.DEPARTED &
                lifecycle_frame.correlation == vessel_facts.correlation &
                lifecycle_frame.qualified) |
               (station_facts.progress != StationProgress.CLEAR &
                vessel_facts.docked == F &
                station_facts.progress != StationProgress.SECURED &
                station_facts.progress != StationProgress.RELEASED &
                vessel_facts.departed == F &
                lifecycle_frame.directive == LifecycleDirective.RETAIN &
                lifecycle_frame.correlation == prior_lifecycle_view.correlation &
                lifecycle_frame.qualified == F)) &
              (((prior_lifecycle_view.lifecycle == LifecycleState.CLEAR_IDLE) &
                lifecycle_frame.decisionContext == DecisionContext.CLEAR) |
               (((prior_lifecycle_view.lifecycle == LifecycleState.AWAIT_CLEAR_A) |
                 (prior_lifecycle_view.lifecycle == LifecycleState.AWAIT_CLEAR_B) |
                 (prior_lifecycle_view.lifecycle == LifecycleState.AWAIT_DOCK_A) |
                 (prior_lifecycle_view.lifecycle == LifecycleState.AWAIT_DOCK_B) |
                 (prior_lifecycle_view.lifecycle == LifecycleState.AWAIT_SECURE_A) |
                 (prior_lifecycle_view.lifecycle == LifecycleState.AWAIT_SECURE_B)) &
                lifecycle_frame.decisionContext == DecisionContext.DOCKING) |
               (((prior_lifecycle_view.lifecycle == LifecycleState.DOCKED_CLOSED_A) |
                 (prior_lifecycle_view.lifecycle == LifecycleState.DOCKED_CLOSED_B) |
                 (prior_lifecycle_view.lifecycle == LifecycleState.DOCKED_REBASE)) &
                lifecycle_frame.decisionContext == DecisionContext.DOCKED_CLOSED) |
               (((prior_lifecycle_view.lifecycle == LifecycleState.ACCESS_OPEN_A) |
                 (prior_lifecycle_view.lifecycle == LifecycleState.ACCESS_OPEN_B)) &
                lifecycle_frame.decisionContext == DecisionContext.ACCESS_OPEN) |
               (((prior_lifecycle_view.lifecycle == LifecycleState.AWAIT_RELEASE_A) |
                 (prior_lifecycle_view.lifecycle == LifecycleState.AWAIT_RELEASE_B) |
                 (prior_lifecycle_view.lifecycle == LifecycleState.AWAIT_DEPART_A) |
                 (prior_lifecycle_view.lifecycle == LifecycleState.AWAIT_DEPART_B)) &
                lifecycle_frame.decisionContext == DecisionContext.UNDOCKING) |
               (prior_lifecycle_view.lifecycle == LifecycleState.QUARANTINED &
                lifecycle_frame.decisionContext == DecisionContext.QUARANTINED)) &
              (((station_facts.progress == StationProgress.CLEAR) &
                berth_transition_evidence.eventKind == BerthEvidenceKind.STATION_CLEARANCE &
                berth_transition_evidence.correlation == station_facts.correlation &
                berth_transition_evidence.qualified) |
               (station_facts.progress == StationProgress.SECURED &
                berth_transition_evidence.eventKind == BerthEvidenceKind.STATION_SECURED &
                berth_transition_evidence.correlation == station_facts.correlation &
                berth_transition_evidence.qualified) |
               (station_facts.progress == StationProgress.RELEASED &
                berth_transition_evidence.eventKind == BerthEvidenceKind.STATION_RELEASED &
                berth_transition_evidence.correlation == station_facts.correlation &
                berth_transition_evidence.qualified) |
               (vessel_facts.departed &
                berth_transition_evidence.eventKind == BerthEvidenceKind.DEPARTURE_COMPLETION &
                berth_transition_evidence.correlation == vessel_facts.correlation &
                berth_transition_evidence.qualified) |
               (station_facts.progress == StationProgress.AVAILABLE &
                berth_transition_evidence.eventKind == BerthEvidenceKind.STATION_AVAILABLE &
                berth_transition_evidence.correlation == Correlation.NONE &
                berth_transition_evidence.qualified) |
               (station_facts.progress != StationProgress.CLEAR &
                station_facts.progress != StationProgress.SECURED &
                station_facts.progress != StationProgress.RELEASED &
                station_facts.progress != StationProgress.AVAILABLE &
                vessel_facts.departed == F &
                berth_transition_evidence.eventKind == BerthEvidenceKind.NO_EVENT &
                berth_transition_evidence.correlation == Correlation.NONE &
                berth_transition_evidence.qualified == F)) &
              gate_safety_frame.directive == GateDirective.RETAIN &
              gate_safety_frame.safeToOpen ==
                (((prior_lifecycle_view.lifecycle == LifecycleState.DOCKED_CLOSED_A) |
                  (prior_lifecycle_view.lifecycle == LifecycleState.DOCKED_CLOSED_B) |
                  (prior_lifecycle_view.lifecycle == LifecycleState.DOCKED_REBASE)) &
                 prior_berth_state == BerthState.SECURED &
                 service_facts.quiescent) &
              (((prior_gate_state == GateState.OPEN) &
                gate_safety_frame.decisionContext == DecisionContext.ACCESS_OPEN) |
               (prior_gate_state == GateState.CLOSED &
                gate_safety_frame.decisionContext == DecisionContext.DOCKED_CLOSED)) &
              docking_frame.directive == lifecycle_frame.directive &
              docking_frame.correlation == lifecycle_frame.correlation &
              docking_frame.qualified == lifecycle_frame.qualified &
              docking_frame.decisionContext == lifecycle_frame.decisionContext &
              access_frame.directive == lifecycle_frame.directive &
              access_frame.correlation == lifecycle_frame.correlation &
              access_frame.qualified ==
                (((prior_lifecycle_view.lifecycle == LifecycleState.DOCKED_CLOSED_A) |
                  (prior_lifecycle_view.lifecycle == LifecycleState.DOCKED_CLOSED_B) |
                  (prior_lifecycle_view.lifecycle == LifecycleState.DOCKED_REBASE)) &
                 prior_berth_state == BerthState.SECURED &
                 service_facts.quiescent) &
              (((prior_gate_state == GateState.OPEN) &
                access_frame.decisionContext == DecisionContext.ACCESS_OPEN) |
               (prior_gate_state == GateState.CLOSED &
                access_frame.decisionContext == DecisionContext.DOCKED_CLOSED)) &
              undocking_frame.directive == lifecycle_frame.directive &
              undocking_frame.correlation == lifecycle_frame.correlation &
              undocking_frame.qualified ==
                ((((prior_lifecycle_view.lifecycle == LifecycleState.AWAIT_RELEASE_A) |
                   (prior_lifecycle_view.lifecycle == LifecycleState.AWAIT_RELEASE_B)) &
                  prior_gate_state == GateState.CLOSED) |
                 lifecycle_frame.directive == LifecycleDirective.RELEASED) &
              undocking_frame.decisionContext == DecisionContext.UNDOCKING &
              ((vessel_facts.departed &
                priority_directive.priority == PriorityKind.DEPARTURE_COMPLETE &
                priority_directive.correlation == vessel_facts.correlation) |
               (vessel_facts.departed == F &
                priority_directive.priority == PriorityKind.ORDINARY &
                priority_directive.correlation == prior_lifecycle_view.correlation)) &
              priority_directive.decisionContext == lifecycle_frame.decisionContext;
    }*/
  }
  // @trace PART-07
  part def DockingLifecycle :> Thread {
    // @trace INT-19
    port lifecycle_frame : DataPort { in :>> type : CoordinationFrame; }
    // @trace INT-22
    port admission_decision : DataPort { in :>> type : AdmissionDecision; }
    // @trace INT-13
    port prior_lifecycle_view : DataPort { out :>> type : PriorLifecycleView; }

    language "GUMBO" /*{
      state
        // @trace TYPE-STATE-01
        lifecycleState: LifecycleState;
      initialize
        modifies lifecycleState;
        // @trace ASM-INIT-01
        guarantee INITIAL_LIFECYCLE_SAFE:
          lifecycleState == LifecycleState.CLEAR_IDLE &
          prior_lifecycle_view.lifecycle == LifecycleState.CLEAR_IDLE &
          prior_lifecycle_view.correlation == Correlation.NONE;
      compute
        modifies lifecycleState;
        // @trace INT-13
        guarantee PRIOR_LIFECYCLE_PUBLICATION:
          prior_lifecycle_view.lifecycle == In(lifecycleState) &
          ((((In(lifecycleState) == LifecycleState.AWAIT_CLEAR_A) |
             (In(lifecycleState) == LifecycleState.AWAIT_DOCK_A) |
             (In(lifecycleState) == LifecycleState.AWAIT_SECURE_A) |
             (In(lifecycleState) == LifecycleState.DOCKED_CLOSED_A) |
             (In(lifecycleState) == LifecycleState.ACCESS_OPEN_A) |
             (In(lifecycleState) == LifecycleState.AWAIT_RELEASE_A) |
             (In(lifecycleState) == LifecycleState.AWAIT_DEPART_A)) &
            prior_lifecycle_view.correlation == Correlation.A) |
           (((In(lifecycleState) == LifecycleState.AWAIT_CLEAR_B) |
             (In(lifecycleState) == LifecycleState.AWAIT_DOCK_B) |
             (In(lifecycleState) == LifecycleState.AWAIT_SECURE_B) |
             (In(lifecycleState) == LifecycleState.DOCKED_CLOSED_B) |
             (In(lifecycleState) == LifecycleState.ACCESS_OPEN_B) |
             (In(lifecycleState) == LifecycleState.AWAIT_RELEASE_B) |
             (In(lifecycleState) == LifecycleState.AWAIT_DEPART_B)) &
            prior_lifecycle_view.correlation == Correlation.B) |
           (((In(lifecycleState) == LifecycleState.CLEAR_IDLE) |
             (In(lifecycleState) == LifecycleState.DOCKED_REBASE) |
             (In(lifecycleState) == LifecycleState.QUARANTINED)) &
            prior_lifecycle_view.correlation == Correlation.NONE));
        // @trace CASE-25
        guarantee LIFECYCLE_TRANSITION_PARTITION:
          ((lifecycle_frame.directive == LifecycleDirective.QUARANTINE) implies
            (lifecycleState == LifecycleState.QUARANTINED)) &
          ((lifecycle_frame.directive == LifecycleDirective.ANCHOR_CLEAR) implies
            (lifecycleState == LifecycleState.CLEAR_IDLE)) &
          ((lifecycle_frame.directive == LifecycleDirective.ANCHOR_DOCKED) implies
            (lifecycleState == LifecycleState.DOCKED_REBASE)) &
          ((lifecycle_frame.directive != LifecycleDirective.QUARANTINE &
            lifecycle_frame.directive != LifecycleDirective.ANCHOR_CLEAR &
            lifecycle_frame.directive != LifecycleDirective.ANCHOR_DOCKED &
            admission_decision.accepted &
            admission_decision.operation == RequestOperation.DOCK &
            admission_decision.correlation == Correlation.A) implies
            (lifecycleState == LifecycleState.AWAIT_CLEAR_A)) &
          ((lifecycle_frame.directive != LifecycleDirective.QUARANTINE &
            lifecycle_frame.directive != LifecycleDirective.ANCHOR_CLEAR &
            lifecycle_frame.directive != LifecycleDirective.ANCHOR_DOCKED &
            admission_decision.accepted &
            admission_decision.operation == RequestOperation.DOCK &
            admission_decision.correlation == Correlation.B) implies
            (lifecycleState == LifecycleState.AWAIT_CLEAR_B)) &
          ((admission_decision.accepted &
            admission_decision.operation == RequestOperation.ACCESS &
            admission_decision.correlation == Correlation.A) implies
            (lifecycleState == LifecycleState.ACCESS_OPEN_A)) &
          ((admission_decision.accepted &
            admission_decision.operation == RequestOperation.ACCESS &
            admission_decision.correlation == Correlation.B) implies
            (lifecycleState == LifecycleState.ACCESS_OPEN_B)) &
          ((admission_decision.accepted &
            admission_decision.operation == RequestOperation.UNDOCK &
            admission_decision.correlation == Correlation.A) implies
            (lifecycleState == LifecycleState.AWAIT_RELEASE_A)) &
          ((admission_decision.accepted &
            admission_decision.operation == RequestOperation.UNDOCK &
            admission_decision.correlation == Correlation.B) implies
            (lifecycleState == LifecycleState.AWAIT_RELEASE_B)) &
          ((admission_decision.accepted == F &
            lifecycle_frame.directive == LifecycleDirective.CLEARANCE &
            lifecycle_frame.correlation == Correlation.A) implies
            (lifecycleState == LifecycleState.AWAIT_DOCK_A)) &
          ((admission_decision.accepted == F &
            lifecycle_frame.directive == LifecycleDirective.CLEARANCE &
            lifecycle_frame.correlation == Correlation.B) implies
            (lifecycleState == LifecycleState.AWAIT_DOCK_B)) &
          ((admission_decision.accepted == F &
            lifecycle_frame.directive == LifecycleDirective.DOCKED &
            lifecycle_frame.correlation == Correlation.A &
            In(lifecycleState) == LifecycleState.AWAIT_DOCK_A) implies
            (lifecycleState == LifecycleState.AWAIT_SECURE_A)) &
          ((admission_decision.accepted == F &
            lifecycle_frame.directive == LifecycleDirective.DOCKED &
            lifecycle_frame.correlation == Correlation.B &
            In(lifecycleState) == LifecycleState.AWAIT_DOCK_B) implies
            (lifecycleState == LifecycleState.AWAIT_SECURE_B)) &
          ((admission_decision.accepted == F &
            ((lifecycle_frame.directive == LifecycleDirective.DOCKED &
              In(lifecycleState) == LifecycleState.AWAIT_SECURE_A) |
             (lifecycle_frame.directive == LifecycleDirective.SECURED &
              ((In(lifecycleState) == LifecycleState.AWAIT_DOCK_A) |
               (In(lifecycleState) == LifecycleState.AWAIT_SECURE_A)))) &
            lifecycle_frame.correlation == Correlation.A &
            lifecycle_frame.directive != LifecycleDirective.RETAIN) implies
            (lifecycleState == LifecycleState.DOCKED_CLOSED_A)) &
          ((admission_decision.accepted == F &
            ((lifecycle_frame.directive == LifecycleDirective.DOCKED &
              In(lifecycleState) == LifecycleState.AWAIT_SECURE_B) |
             (lifecycle_frame.directive == LifecycleDirective.SECURED &
              ((In(lifecycleState) == LifecycleState.AWAIT_DOCK_B) |
               (In(lifecycleState) == LifecycleState.AWAIT_SECURE_B)))) &
            lifecycle_frame.correlation == Correlation.B &
            lifecycle_frame.directive != LifecycleDirective.RETAIN) implies
            (lifecycleState == LifecycleState.DOCKED_CLOSED_B)) &
          ((lifecycle_frame.directive == LifecycleDirective.RELEASED &
            lifecycle_frame.correlation == Correlation.A) implies
            (lifecycleState == LifecycleState.AWAIT_DEPART_A)) &
          ((lifecycle_frame.directive == LifecycleDirective.RELEASED &
            lifecycle_frame.correlation == Correlation.B) implies
            (lifecycleState == LifecycleState.AWAIT_DEPART_B)) &
          ((lifecycle_frame.directive == LifecycleDirective.DEPARTED) implies
            (lifecycleState == LifecycleState.CLEAR_IDLE)) &
          ((lifecycle_frame.directive == LifecycleDirective.RETAIN &
            admission_decision.accepted == F) implies
            (lifecycleState == In(lifecycleState)));
    }*/
  }
  // @trace PART-08
  part def BerthCommitment :> Thread {
    // @trace INT-20
    port berth_transition_evidence : DataPort { in :>> type : BerthTransitionEvidence; }
    // @trace INT-14
    port prior_berth_state : DataPort { out :>> type : BerthState; }

    language "GUMBO" /*{
      state
        // @trace TYPE-STATE-02
        berthState: BerthState;
      initialize
        modifies berthState;
        // @trace ASM-INIT-01
        guarantee INITIAL_BERTH_SAFE:
          berthState == BerthState.AVAILABLE &
          prior_berth_state == BerthState.AVAILABLE;
      compute
        modifies berthState;
        // @trace INT-14
        guarantee PRIOR_BERTH_PUBLICATION:
          prior_berth_state == In(berthState);
        // @trace CASE-25
        compute_cases
          case BERTH_FAULT:
            assume berth_transition_evidence.eventKind == BerthEvidenceKind.DOMINANT_FAULT;
            guarantee berthState == BerthState.UNKNOWN;
          // @trace CASE-25
          case BERTH_CLEAR_ANCHOR:
            assume berth_transition_evidence.eventKind == BerthEvidenceKind.VERIFIED_CLEAR_ANCHOR;
            guarantee berthState == BerthState.AVAILABLE;
          // @trace CASE-25
          case BERTH_DOCKED_ANCHOR:
            assume berth_transition_evidence.eventKind == BerthEvidenceKind.VERIFIED_DOCKED_ANCHOR;
            guarantee berthState == BerthState.SECURED;
          // @trace CASE-25
          case BERTH_CLEARANCE:
            assume berth_transition_evidence.eventKind == BerthEvidenceKind.STATION_CLEARANCE &
              berth_transition_evidence.qualified & In(berthState) == BerthState.AVAILABLE;
            guarantee berthState == BerthState.RESERVED;
          // @trace CASE-25
          case BERTH_SECURED:
            assume berth_transition_evidence.eventKind == BerthEvidenceKind.STATION_SECURED &
              berth_transition_evidence.qualified &
              ((In(berthState) == BerthState.RESERVED) |
               (In(berthState) == BerthState.SECURED));
            guarantee berthState == BerthState.SECURED;
          // @trace CASE-25
          case BERTH_RELEASED:
            assume berth_transition_evidence.eventKind == BerthEvidenceKind.STATION_RELEASED &
              berth_transition_evidence.qualified & In(berthState) == BerthState.SECURED;
            guarantee berthState == BerthState.RELEASED;
          // @trace CASE-25
          case BERTH_DEPARTED:
            assume berth_transition_evidence.eventKind == BerthEvidenceKind.DEPARTURE_COMPLETION &
              berth_transition_evidence.qualified & In(berthState) == BerthState.RELEASED;
            guarantee berthState == BerthState.AVAILABLE;
          // @trace CASE-25
          case BERTH_RETAIN:
            assume berth_transition_evidence.eventKind == BerthEvidenceKind.NO_EVENT |
              berth_transition_evidence.qualified == F |
              (berth_transition_evidence.eventKind == BerthEvidenceKind.STATION_CLEARANCE &
               In(berthState) != BerthState.AVAILABLE) |
              (berth_transition_evidence.eventKind == BerthEvidenceKind.STATION_SECURED &
               In(berthState) != BerthState.RESERVED & In(berthState) != BerthState.SECURED) |
              (berth_transition_evidence.eventKind == BerthEvidenceKind.STATION_RELEASED &
               In(berthState) != BerthState.SECURED) |
              (berth_transition_evidence.eventKind == BerthEvidenceKind.DEPARTURE_COMPLETION &
               In(berthState) != BerthState.RELEASED) |
              berth_transition_evidence.eventKind == BerthEvidenceKind.STATION_AVAILABLE;
            guarantee berthState == In(berthState);
    }*/
  }
  // @trace PART-09
  part def ServiceAccessGate :> Thread {
    // @trace INT-21
    port gate_safety_frame : DataPort { in :>> type : GateSafetyFrame; }
    // @trace INT-23
    port admission_decision : DataPort { in :>> type : AdmissionDecision; }
    // @trace INT-15
    port prior_gate_state : DataPort { out :>> type : GateState; }

    language "GUMBO" /*{
      state
        // @trace TYPE-STATE-02
        gateState: GateState;
      initialize
        modifies gateState;
        // @trace ASM-INIT-01
        guarantee INITIAL_GATE_SAFE:
          gateState == GateState.CLOSED & prior_gate_state == GateState.CLOSED;
      compute
        modifies gateState;
        // @trace INT-15
        guarantee PRIOR_GATE_PUBLICATION:
          prior_gate_state == In(gateState);
        // @trace CASE-25
        compute_cases
          case GATE_FORCED_CLOSE:
            assume gate_safety_frame.directive == GateDirective.FORCE_CLOSE;
            guarantee gateState == GateState.CLOSED;
          // @trace CASE-25
          case GATE_OPEN:
            assume gate_safety_frame.directive != GateDirective.FORCE_CLOSE &
              admission_decision.accepted &
              admission_decision.operation == RequestOperation.ACCESS &
              gate_safety_frame.safeToOpen;
            guarantee gateState == GateState.OPEN;
          // @trace CASE-25
          case GATE_ORDERED_CLOSE:
            assume gate_safety_frame.directive != GateDirective.FORCE_CLOSE &
              admission_decision.accepted &
              admission_decision.operation == RequestOperation.UNDOCK;
            guarantee gateState == GateState.CLOSED;
          // @trace CASE-25
          case GATE_RETAIN:
            assume gate_safety_frame.directive != GateDirective.FORCE_CLOSE &
              (admission_decision.accepted == F |
               (admission_decision.operation != RequestOperation.ACCESS &
                admission_decision.operation != RequestOperation.UNDOCK) |
               (admission_decision.operation == RequestOperation.ACCESS &
                gate_safety_frame.safeToOpen == F));
            guarantee gateState == In(gateState);
    }*/
  }
  // @trace PART-10
  part def RecoverySupervisor :> Thread {
    // @trace INT-17
    port recovery_transition : DataPort { in :>> type : RecoveryTransition; }
    // @trace INT-16
    port prior_recovery_state : DataPort { out :>> type : RecoveryState; }

    language "GUMBO" /*{
      state
        // @trace TYPE-STATE-02
        recoveryState: RecoveryState;
      initialize
        modifies recoveryState;
        // @trace ASM-INIT-01
        guarantee INITIAL_RECOVERY_SAFE:
          recoveryState == RecoveryState.HEALTHY &
          prior_recovery_state == RecoveryState.HEALTHY;
      compute
        modifies recoveryState;
        // @trace INT-16
        guarantee PRIOR_RECOVERY_PUBLICATION:
          prior_recovery_state == In(recoveryState);
        // @trace CASE-25
        compute_cases
          case RECOVERY_LATCH:
            assume recovery_transition.intent == RecoveryIntent.LATCH;
            guarantee recoveryState == RecoveryState.LATCHED;
          // @trace CASE-25
          case RECOVERY_RECONCILE:
            assume recovery_transition.intent == RecoveryIntent.RECONCILE;
            guarantee recoveryState == RecoveryState.RECONCILING;
          // @trace CASE-25
          case RECOVERY_OPEN:
            assume recovery_transition.intent == RecoveryIntent.OPEN_CLEAR |
              recovery_transition.intent == RecoveryIntent.OPEN_DOCKED;
            guarantee recoveryState == RecoveryState.HEALTHY;
          // @trace CASE-25
          case RECOVERY_RETAIN:
            assume recovery_transition.intent == RecoveryIntent.RETAIN;
            guarantee recoveryState == In(recoveryState);
    }*/
  }
  // @trace PART-11
  part def DockingActionEligibility :> Thread {
    // @trace INT-24
    port admission_decision : DataPort { in :>> type : AdmissionDecision; }
    // @trace INT-27
    port docking_frame : DataPort { in :>> type : CoordinationFrame; }
    // @trace INT-30
    port docking_proposal : DataPort { out :>> type : DockingProposal; }

    language "GUMBO" /*{
      initialize
        // @trace ASM-INIT-01
        guarantee INITIAL_DOCKING_PROPOSAL_SAFE:
          docking_proposal.applicable == F &
          docking_proposal.proposedAction == SupervisoryAction.HOLD &
          docking_proposal.cause == DecisionCause.NO_ELIGIBLE_ACTION &
          docking_proposal.correlation == Correlation.NONE &
          docking_proposal.decisionContext == DecisionContext.CLEAR;
      compute
        // @trace CASE-26
        compute_cases
          case PROPOSE_DOCK_CLEARANCE:
            assume admission_decision.accepted &
              admission_decision.operation == RequestOperation.DOCK;
            guarantee docking_proposal.applicable &
              docking_proposal.proposedAction == SupervisoryAction.REQUEST_DOCK_CLEARANCE &
              docking_proposal.cause == DecisionCause.NEW_DOCK_REQUEST &
              docking_proposal.correlation == admission_decision.correlation &
              docking_proposal.decisionContext == DecisionContext.DOCKING;
          // @trace CASE-26
          case PROPOSE_DOCK_APPROACH:
            assume (admission_decision.accepted == F |
              admission_decision.operation != RequestOperation.DOCK) &
              docking_frame.qualified &
              docking_frame.directive == LifecycleDirective.CLEARANCE;
            guarantee docking_proposal.applicable &
              docking_proposal.proposedAction == SupervisoryAction.AUTHORIZE_DOCK_APPROACH &
              docking_proposal.cause == DecisionCause.DOCKING_PROGRESS &
              docking_proposal.correlation == docking_frame.correlation &
              docking_proposal.decisionContext == DecisionContext.DOCKING;
          // @trace CASE-26
          case NO_DOCKING_PROPOSAL:
            assume (admission_decision.accepted == F |
              admission_decision.operation != RequestOperation.DOCK) &
              (docking_frame.qualified == F |
               docking_frame.directive != LifecycleDirective.CLEARANCE);
            guarantee docking_proposal.applicable == F &
              docking_proposal.proposedAction == SupervisoryAction.HOLD &
              docking_proposal.cause == DecisionCause.NO_ELIGIBLE_ACTION &
              docking_proposal.correlation == docking_frame.correlation &
              docking_proposal.decisionContext == docking_frame.decisionContext;
    }*/
  }
  // @trace PART-12
  part def AccessActionEligibility :> Thread {
    // @trace INT-25
    port admission_decision : DataPort { in :>> type : AdmissionDecision; }
    // @trace INT-28
    port access_frame : DataPort { in :>> type : CoordinationFrame; }
    // @trace INT-31
    port access_proposal : DataPort { out :>> type : AccessProposal; }

    language "GUMBO" /*{
      initialize
        // @trace ASM-INIT-01
        guarantee INITIAL_ACCESS_PROPOSAL_SAFE:
          access_proposal.applicable == F &
          access_proposal.proposedAction == SupervisoryAction.HOLD &
          access_proposal.cause == DecisionCause.NO_ELIGIBLE_ACTION &
          access_proposal.correlation == Correlation.NONE &
          access_proposal.decisionContext == DecisionContext.CLEAR;
      compute
        // @trace CASE-27
        compute_cases
          case PROPOSE_ACCESS_OPEN:
            assume admission_decision.accepted &
              admission_decision.operation == RequestOperation.ACCESS &
              access_frame.qualified;
            guarantee access_proposal.applicable &
              access_proposal.proposedAction == SupervisoryAction.OPEN_SERVICE_ACCESS &
              access_proposal.cause == DecisionCause.ACCESS_REQUEST &
              access_proposal.correlation == admission_decision.correlation &
              access_proposal.decisionContext == DecisionContext.ACCESS_OPEN;
          // @trace CASE-27
          case PROPOSE_ACCESS_CLOSE:
            assume admission_decision.accepted &
              admission_decision.operation == RequestOperation.UNDOCK;
            guarantee access_proposal.applicable &
              access_proposal.proposedAction == SupervisoryAction.CLOSE_SERVICE_ACCESS &
              access_proposal.cause == DecisionCause.UNDOCK_SEQUENCE &
              access_proposal.correlation == admission_decision.correlation &
              access_proposal.decisionContext == DecisionContext.UNDOCKING;
          // @trace CASE-27
          case NO_ACCESS_PROPOSAL:
            assume admission_decision.accepted == F |
              (admission_decision.operation != RequestOperation.ACCESS &
               admission_decision.operation != RequestOperation.UNDOCK) |
              (admission_decision.operation == RequestOperation.ACCESS &
               access_frame.qualified == F);
            guarantee access_proposal.applicable == F &
              access_proposal.proposedAction == SupervisoryAction.HOLD &
              access_proposal.cause == DecisionCause.NO_ELIGIBLE_ACTION &
              access_proposal.correlation == access_frame.correlation &
              access_proposal.decisionContext == access_frame.decisionContext;
    }*/
  }
  // @trace PART-13
  part def UndockingActionEligibility :> Thread {
    // @trace INT-26
    port admission_decision : DataPort { in :>> type : AdmissionDecision; }
    // @trace INT-29
    port undocking_frame : DataPort { in :>> type : CoordinationFrame; }
    // @trace INT-32
    port undocking_proposal : DataPort { out :>> type : UndockingProposal; }

    language "GUMBO" /*{
      initialize
        // @trace ASM-INIT-01
        guarantee INITIAL_UNDOCKING_PROPOSAL_SAFE:
          undocking_proposal.applicable == F &
          undocking_proposal.proposedAction == SupervisoryAction.HOLD &
          undocking_proposal.cause == DecisionCause.NO_ELIGIBLE_ACTION &
          undocking_proposal.correlation == Correlation.NONE &
          undocking_proposal.decisionContext == DecisionContext.CLEAR;
      compute
        // @trace CASE-27
        compute_cases
          case PROPOSE_RELEASE_REQUEST:
            assume undocking_frame.qualified &
              undocking_frame.directive == LifecycleDirective.RETAIN;
            guarantee undocking_proposal.applicable &
              undocking_proposal.proposedAction == SupervisoryAction.REQUEST_UNDOCK_RELEASE &
              undocking_proposal.cause == DecisionCause.UNDOCK_SEQUENCE &
              undocking_proposal.correlation == undocking_frame.correlation &
              undocking_proposal.decisionContext == DecisionContext.UNDOCKING;
          // @trace CASE-27
          case PROPOSE_UNDOCK_AUTHORIZATION:
            assume undocking_frame.qualified &
              undocking_frame.directive == LifecycleDirective.RELEASED;
            guarantee undocking_proposal.applicable &
              undocking_proposal.proposedAction == SupervisoryAction.AUTHORIZE_UNDOCK &
              undocking_proposal.cause == DecisionCause.UNDOCK_SEQUENCE &
              undocking_proposal.correlation == undocking_frame.correlation &
              undocking_proposal.decisionContext == DecisionContext.UNDOCKING;
          // @trace CASE-27
          case NO_UNDOCKING_PROPOSAL:
            assume undocking_frame.qualified == F |
              (undocking_frame.directive != LifecycleDirective.RETAIN &
               undocking_frame.directive != LifecycleDirective.RELEASED);
            guarantee undocking_proposal.applicable == F &
              undocking_proposal.proposedAction == SupervisoryAction.HOLD &
              undocking_proposal.cause == DecisionCause.NO_ELIGIBLE_ACTION &
              undocking_proposal.correlation == undocking_frame.correlation &
              undocking_proposal.decisionContext == undocking_frame.decisionContext;
    }*/
  }
  // @trace PART-14
  part def DockingActionArbitration :> Thread {
    // @trace INT-30
    port docking_proposal : DataPort { in :>> type : DockingProposal; }
    // @trace INT-31
    port access_proposal : DataPort { in :>> type : AccessProposal; }
    // @trace INT-32
    port undocking_proposal : DataPort { in :>> type : UndockingProposal; }
    // @trace INT-33
    port priority_directive : DataPort { in :>> type : PriorityDirective; }
    // @trace INT-34
    port docking_decision : DataPort { out :>> type : DockingDecisionFrame; }

    language "GUMBO" /*{
      initialize
        // @trace ASM-INIT-01
        guarantee INITIAL_DECISION_SAFE:
          docking_decision.proposedAction == SupervisoryAction.HOLD &
          docking_decision.cause == DecisionCause.NO_ELIGIBLE_ACTION &
          docking_decision.correlation == Correlation.NONE &
          docking_decision.decisionContext == DecisionContext.CLEAR;
      compute
        // @trace CASE-28
        compute_cases
          case SELECT_REVOCATION:
            assume priority_directive.priority == PriorityKind.REVOKE;
            guarantee docking_decision.proposedAction == SupervisoryAction.REVOKE_SERVICE_ACCESS &
              docking_decision.cause == DecisionCause.FAULT_OR_RECOVERY &
              docking_decision.correlation == Correlation.NONE &
              docking_decision.decisionContext == DecisionContext.QUARANTINED;
          // @trace CASE-28
          case SELECT_DEPARTURE_COMPLETION:
            assume priority_directive.priority == PriorityKind.DEPARTURE_COMPLETE;
            guarantee docking_decision.proposedAction == SupervisoryAction.HOLD &
              docking_decision.cause == DecisionCause.DEPARTURE_CONFIRMATION &
              docking_decision.correlation == priority_directive.correlation &
              docking_decision.decisionContext == DecisionContext.CLEAR;
          // @trace CASE-28
          case SELECT_ACCESS_CLOSURE:
            assume priority_directive.priority == PriorityKind.ORDINARY &
              access_proposal.applicable &
              access_proposal.proposedAction == SupervisoryAction.CLOSE_SERVICE_ACCESS;
            guarantee docking_decision.proposedAction == access_proposal.proposedAction &
              docking_decision.cause == access_proposal.cause &
              docking_decision.correlation == access_proposal.correlation &
              docking_decision.decisionContext == access_proposal.decisionContext;
          // @trace CASE-28
          case SELECT_UNDOCK_ACTION:
            assume priority_directive.priority == PriorityKind.ORDINARY &
              (access_proposal.applicable == F |
               access_proposal.proposedAction != SupervisoryAction.CLOSE_SERVICE_ACCESS) &
              undocking_proposal.applicable;
            guarantee docking_decision.proposedAction == undocking_proposal.proposedAction &
              docking_decision.cause == undocking_proposal.cause &
              docking_decision.correlation == undocking_proposal.correlation &
              docking_decision.decisionContext == undocking_proposal.decisionContext;
          // @trace CASE-28
          case SELECT_DOCK_APPROACH:
            assume priority_directive.priority == PriorityKind.ORDINARY &
              (access_proposal.applicable == F |
               access_proposal.proposedAction != SupervisoryAction.CLOSE_SERVICE_ACCESS) &
              undocking_proposal.applicable == F & docking_proposal.applicable &
              docking_proposal.proposedAction == SupervisoryAction.AUTHORIZE_DOCK_APPROACH;
            guarantee docking_decision.proposedAction == docking_proposal.proposedAction &
              docking_decision.cause == docking_proposal.cause &
              docking_decision.correlation == docking_proposal.correlation &
              docking_decision.decisionContext == docking_proposal.decisionContext;
          // @trace CASE-28
          case SELECT_ACCESS_OPEN:
            assume priority_directive.priority == PriorityKind.ORDINARY &
              (access_proposal.applicable == F |
               access_proposal.proposedAction != SupervisoryAction.CLOSE_SERVICE_ACCESS) &
              undocking_proposal.applicable == F &
              (docking_proposal.applicable == F |
               docking_proposal.proposedAction != SupervisoryAction.AUTHORIZE_DOCK_APPROACH) &
              access_proposal.applicable &
              access_proposal.proposedAction == SupervisoryAction.OPEN_SERVICE_ACCESS;
            guarantee docking_decision.proposedAction == access_proposal.proposedAction &
              docking_decision.cause == access_proposal.cause &
              docking_decision.correlation == access_proposal.correlation &
              docking_decision.decisionContext == access_proposal.decisionContext;
          // @trace CASE-28
          case SELECT_DOCK_CLEARANCE:
            assume priority_directive.priority == PriorityKind.ORDINARY &
              undocking_proposal.applicable == F &
              (access_proposal.applicable == F |
               (access_proposal.proposedAction != SupervisoryAction.CLOSE_SERVICE_ACCESS &
                access_proposal.proposedAction != SupervisoryAction.OPEN_SERVICE_ACCESS)) &
              docking_proposal.applicable &
              docking_proposal.proposedAction == SupervisoryAction.REQUEST_DOCK_CLEARANCE;
            guarantee docking_decision.proposedAction == docking_proposal.proposedAction &
              docking_decision.cause == docking_proposal.cause &
              docking_decision.correlation == docking_proposal.correlation &
              docking_decision.decisionContext == docking_proposal.decisionContext;
          // @trace CASE-28
          case SELECT_HOLD:
            assume priority_directive.priority == PriorityKind.ORDINARY &
              docking_proposal.applicable == F & access_proposal.applicable == F &
              undocking_proposal.applicable == F;
            guarantee docking_decision.proposedAction == SupervisoryAction.HOLD &
              docking_decision.cause == DecisionCause.NO_ELIGIBLE_ACTION &
              docking_decision.correlation == priority_directive.correlation &
              docking_decision.decisionContext == priority_directive.decisionContext;
    }*/
  }
  // @trace PART-15
  part def ResultComposition :> Thread {
    // @trace INT-34
    port docking_decision : DataPort { in :>> type : DockingDecisionFrame; }
    // @trace INT-35
    port request_disposition : DataPort { in :>> type : RequestDisposition; }
    // @trace INT-06
    port docking_access_result : DataPort { out :>> type : DockingAccessResult; }

    language "GUMBO" /*{
      initialize
        // @trace ASM-INIT-01
        guarantee INITIAL_RESULT_SAFE:
          docking_access_result.proposedAction == SupervisoryAction.HOLD &
          docking_access_result.cause == DecisionCause.NO_ELIGIBLE_ACTION &
          docking_access_result.mode == PublicMode.HOLDING &
          docking_access_result.correlation == Correlation.NONE &
          docking_access_result.disposition == RequestDisposition.NO_REQUEST &
          docking_access_result.status == AccessStatus.CLOSED &
          docking_access_result.outcome == DockingOutcome.NONE;
      compute
        // @trace CASE-29
        guarantee RESULT_OWNER_FIELDS:
          docking_access_result.proposedAction == docking_decision.proposedAction &
          docking_access_result.cause == docking_decision.cause &
          docking_access_result.correlation == docking_decision.correlation &
          docking_access_result.disposition == request_disposition;
        // @trace CASE-29
        compute_cases
          case COMPOSE_RECOVERY:
            assume docking_decision.cause == DecisionCause.FAULT_OR_RECOVERY |
              docking_decision.proposedAction == SupervisoryAction.REVOKE_SERVICE_ACCESS;
            guarantee docking_access_result.mode == PublicMode.QUARANTINED &
              docking_access_result.status == AccessStatus.REVOKED &
              docking_access_result.outcome == DockingOutcome.RECOVERY_REQUIRED;
          // @trace CASE-29
          case COMPOSE_DEPARTURE_COMPLETE:
            assume docking_decision.cause == DecisionCause.DEPARTURE_CONFIRMATION;
            guarantee docking_access_result.mode == PublicMode.HOLDING &
              docking_access_result.status == AccessStatus.CLOSED &
              docking_access_result.outcome == DockingOutcome.DEPARTURE_COMPLETE;
          // @trace CASE-29
          case COMPOSE_DOCKING:
            assume docking_decision.proposedAction == SupervisoryAction.REQUEST_DOCK_CLEARANCE |
              docking_decision.proposedAction == SupervisoryAction.AUTHORIZE_DOCK_APPROACH;
            guarantee docking_access_result.mode == PublicMode.DOCKING &
              docking_access_result.status == AccessStatus.CLOSED &
              docking_access_result.outcome == DockingOutcome.DOCKING_ACTIVE;
          // @trace CASE-29
          case COMPOSE_ACCESS_OPEN:
            assume docking_decision.proposedAction == SupervisoryAction.OPEN_SERVICE_ACCESS;
            guarantee docking_access_result.mode == PublicMode.ACCESSIBLE &
              docking_access_result.status == AccessStatus.OPEN &
              docking_access_result.outcome == DockingOutcome.ACCESS_ACTIVE;
          // @trace CASE-29
          case COMPOSE_UNDOCKING:
            assume docking_decision.proposedAction == SupervisoryAction.CLOSE_SERVICE_ACCESS |
              docking_decision.proposedAction == SupervisoryAction.REQUEST_UNDOCK_RELEASE |
              docking_decision.proposedAction == SupervisoryAction.AUTHORIZE_UNDOCK;
            guarantee docking_access_result.mode == PublicMode.UNDOCKING &
              docking_access_result.status == AccessStatus.CLOSED &
              docking_access_result.outcome == DockingOutcome.UNDOCKING_ACTIVE;
          // @trace CASE-29
          case COMPOSE_HOLD_CLEAR:
            assume docking_decision.proposedAction == SupervisoryAction.HOLD &
              docking_decision.cause != DecisionCause.DEPARTURE_CONFIRMATION &
              docking_decision.decisionContext == DecisionContext.CLEAR;
            guarantee docking_access_result.mode == PublicMode.HOLDING &
              docking_access_result.status == AccessStatus.CLOSED &
              docking_access_result.outcome == DockingOutcome.NONE;
          // @trace CASE-29
          case COMPOSE_HOLD_DOCKING:
            assume docking_decision.proposedAction == SupervisoryAction.HOLD &
              docking_decision.decisionContext == DecisionContext.DOCKING;
            guarantee docking_access_result.mode == PublicMode.DOCKING &
              docking_access_result.status == AccessStatus.CLOSED &
              docking_access_result.outcome == DockingOutcome.DOCKING_ACTIVE;
          // @trace CASE-29
          case COMPOSE_HOLD_DOCKED:
            assume docking_decision.proposedAction == SupervisoryAction.HOLD &
              docking_decision.decisionContext == DecisionContext.DOCKED_CLOSED;
            guarantee docking_access_result.mode == PublicMode.HOLDING &
              docking_access_result.status == AccessStatus.CLOSED &
              docking_access_result.outcome == DockingOutcome.DOCKED_ACCESS_READY;
          // @trace CASE-29
          case COMPOSE_HOLD_ACCESS:
            assume docking_decision.proposedAction == SupervisoryAction.HOLD &
              docking_decision.decisionContext == DecisionContext.ACCESS_OPEN;
            guarantee docking_access_result.mode == PublicMode.ACCESSIBLE &
              docking_access_result.status == AccessStatus.OPEN &
              docking_access_result.outcome == DockingOutcome.ACCESS_ACTIVE;
          // @trace CASE-29
          case COMPOSE_HOLD_UNDOCKING:
            assume docking_decision.proposedAction == SupervisoryAction.HOLD &
              docking_decision.decisionContext == DecisionContext.UNDOCKING;
            guarantee docking_access_result.mode == PublicMode.UNDOCKING &
              docking_access_result.status == AccessStatus.CLOSED &
              docking_access_result.outcome == DockingOutcome.UNDOCKING_ACTIVE;
          // @trace CASE-29
          case COMPOSE_HOLD_QUARANTINED:
            assume docking_decision.proposedAction == SupervisoryAction.HOLD &
              docking_decision.decisionContext == DecisionContext.QUARANTINED;
            guarantee docking_access_result.mode == PublicMode.QUARANTINED &
              docking_access_result.status == AccessStatus.REVOKED &
              docking_access_result.outcome == DockingOutcome.RECOVERY_REQUIRED;
    }*/
  }

  // Authorized behavior-free container: 15 semantic usages and 35 semantic edges.
  // @generated-support HAMR requires Thread usages to be contained by a Process.
  part def DockingAccessSupervisorProcess :> Process {
    // @trace MON-REQ-01
    port access_request : DataPort { in :>> type : AccessRequest; }
    // @trace MON-VES-01
    port vessel_status : DataPort { in :>> type : VesselStatus; }
    // @trace MON-STA-01
    port station_report : DataPort { in :>> type : StationReport; }
    // @trace MON-SVC-01
    port service_activity : DataPort { in :>> type : ServiceActivity; }
    // @trace MON-CTL-01
    port control_event : DataPort { in :>> type : ControlEvent; }
    // @trace CTRL-RES-01
    port docking_access_result : DataPort { out :>> type : DockingAccessResult; }

    // @trace PART-01
    part request_classification : RequestClassification;
    // @trace PART-02
    part vessel_status_assessment : VesselStatusAssessment;
    // @trace PART-03
    part station_report_assessment : StationReportAssessment;
    // @trace PART-04
    part service_activity_assessment : ServiceActivityAssessment;
    // @trace PART-05
    part request_admission : RequestAdmission;
    // @trace PART-06
    part access_coherence : AccessCoherence;
    // @trace PART-07
    part docking_lifecycle : DockingLifecycle;
    // @trace PART-08
    part berth_commitment : BerthCommitment;
    // @trace PART-09
    part service_access_gate : ServiceAccessGate;
    // @trace PART-10
    part recovery_supervisor : RecoverySupervisor;
    // @trace PART-11
    part docking_action_eligibility : DockingActionEligibility;
    // @trace PART-12
    part access_action_eligibility : AccessActionEligibility;
    // @trace PART-13
    part undocking_action_eligibility : UndockingActionEligibility;
    // @trace PART-14
    part docking_action_arbitration : DockingActionArbitration;
    // @trace PART-15
    part result_composition : ResultComposition;

    // @trace INT-01
    connection int01 : PortConnection connect access_request to request_classification.access_request;
    // @trace INT-02
    connection int02 : PortConnection connect vessel_status to vessel_status_assessment.vessel_status;
    // @trace INT-03
    connection int03 : PortConnection connect station_report to station_report_assessment.station_report;
    // @trace INT-04
    connection int04 : PortConnection connect service_activity to service_activity_assessment.service_activity;
    // @trace INT-05
    connection int05 : PortConnection connect control_event to access_coherence.control_event;
    // @trace INT-06
    connection int06 : PortConnection connect result_composition.docking_access_result to docking_access_result;
    // @trace INT-07
    connection int07 : PortConnection connect request_classification.request_facts to request_admission.request_facts;
    // @trace INT-08
    connection int08 : PortConnection connect vessel_status_assessment.vessel_readiness to request_admission.vessel_readiness;
    // @trace INT-09
    connection int09 : PortConnection connect service_activity_assessment.service_readiness to request_admission.service_readiness;
    // @trace INT-10
    connection int10 : PortConnection connect vessel_status_assessment.vessel_facts to access_coherence.vessel_facts;
    // @trace INT-11
    connection int11 : PortConnection connect station_report_assessment.station_facts to access_coherence.station_facts;
    // @trace INT-12
    connection int12 : PortConnection connect service_activity_assessment.service_facts to access_coherence.service_facts;
    // @trace INT-13
    connection int13 : PortConnection connect docking_lifecycle.prior_lifecycle_view to access_coherence.prior_lifecycle_view;
    // @trace INT-14
    connection int14 : PortConnection connect berth_commitment.prior_berth_state to access_coherence.prior_berth_state;
    // @trace INT-15
    connection int15 : PortConnection connect service_access_gate.prior_gate_state to access_coherence.prior_gate_state;
    // @trace INT-16
    connection int16 : PortConnection connect recovery_supervisor.prior_recovery_state to access_coherence.prior_recovery_state;
    // @trace INT-17
    connection int17 : PortConnection connect access_coherence.recovery_transition to recovery_supervisor.recovery_transition;
    // @trace INT-18
    connection int18 : PortConnection connect access_coherence.admission_guard to request_admission.admission_guard;
    // @trace INT-19
    connection int19 : PortConnection connect access_coherence.lifecycle_frame to docking_lifecycle.lifecycle_frame;
    // @trace INT-20
    connection int20 : PortConnection connect access_coherence.berth_transition_evidence to berth_commitment.berth_transition_evidence;
    // @trace INT-21
    connection int21 : PortConnection connect access_coherence.gate_safety_frame to service_access_gate.gate_safety_frame;
    // @trace INT-22
    connection int22 : PortConnection connect request_admission.lifecycle_admission to docking_lifecycle.admission_decision;
    // @trace INT-23
    connection int23 : PortConnection connect request_admission.gate_admission to service_access_gate.admission_decision;
    // @trace INT-24
    connection int24 : PortConnection connect request_admission.docking_admission to docking_action_eligibility.admission_decision;
    // @trace INT-25
    connection int25 : PortConnection connect request_admission.access_admission to access_action_eligibility.admission_decision;
    // @trace INT-26
    connection int26 : PortConnection connect request_admission.undocking_admission to undocking_action_eligibility.admission_decision;
    // @trace INT-27
    connection int27 : PortConnection connect access_coherence.docking_frame to docking_action_eligibility.docking_frame;
    // @trace INT-28
    connection int28 : PortConnection connect access_coherence.access_frame to access_action_eligibility.access_frame;
    // @trace INT-29
    connection int29 : PortConnection connect access_coherence.undocking_frame to undocking_action_eligibility.undocking_frame;
    // @trace INT-30
    connection int30 : PortConnection connect docking_action_eligibility.docking_proposal to docking_action_arbitration.docking_proposal;
    // @trace INT-31
    connection int31 : PortConnection connect access_action_eligibility.access_proposal to docking_action_arbitration.access_proposal;
    // @trace INT-32
    connection int32 : PortConnection connect undocking_action_eligibility.undocking_proposal to docking_action_arbitration.undocking_proposal;
    // @trace INT-33
    connection int33 : PortConnection connect access_coherence.priority_directive to docking_action_arbitration.priority_directive;
    // @trace INT-34
    connection int34 : PortConnection connect docking_action_arbitration.docking_decision to result_composition.docking_decision;
    // @trace INT-35
    connection int35 : PortConnection connect request_admission.request_disposition to result_composition.request_disposition;
  }

  // @trace BOUND-01
  part def DockingAccessSupervisorSystem :> System {
    // @trace MON-REQ-01
    port access_request : DataPort { in :>> type : AccessRequest; }
    // @trace MON-VES-01
    port vessel_status : DataPort { in :>> type : VesselStatus; }
    // @trace MON-STA-01
    port station_report : DataPort { in :>> type : StationReport; }
    // @trace MON-SVC-01
    port service_activity : DataPort { in :>> type : ServiceActivity; }
    // @trace MON-CTL-01
    port control_event : DataPort { in :>> type : ControlEvent; }
    // @trace CTRL-RES-01
    port docking_access_result : DataPort { out :>> type : DockingAccessResult; }

    // @generated-support Sole behavior-free Process; no semantic or ownership credit.
    part supervisor_process : DockingAccessSupervisorProcess;

    // @generated-support Transparent root/Process delegation refining INT-01.
    connection support01 : PortConnection connect access_request to supervisor_process.access_request;
    // @generated-support Transparent root/Process delegation refining INT-02.
    connection support02 : PortConnection connect vessel_status to supervisor_process.vessel_status;
    // @generated-support Transparent root/Process delegation refining INT-03.
    connection support03 : PortConnection connect station_report to supervisor_process.station_report;
    // @generated-support Transparent root/Process delegation refining INT-04.
    connection support04 : PortConnection connect service_activity to supervisor_process.service_activity;
    // @generated-support Transparent root/Process delegation refining INT-05.
    connection support05 : PortConnection connect control_event to supervisor_process.control_event;
    // @generated-support Transparent Process/root delegation refining INT-06.
    connection support06 : PortConnection connect supervisor_process.docking_access_result to docking_access_result;
  }

  // @trace BOUND-01
  part docking_access_supervisor : DockingAccessSupervisorSystem;
}
