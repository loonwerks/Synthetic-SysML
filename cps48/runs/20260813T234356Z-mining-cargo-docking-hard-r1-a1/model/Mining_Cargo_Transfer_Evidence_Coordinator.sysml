// @trace CTX-SYS-01
package Mining_Cargo_Transfer_Evidence_Coordinator {
  private import HAMR::*;

  // @trace MON-REQ-01
  enum def TransferRequest { enum NONE; enum INVALID; enum START_A; enum START_B; enum CANCEL_A; enum CANCEL_B; }
  // @trace MON-DOCK-01
  enum def DockContext { enum INVALID; enum IN_GRID; enum ON_WARP; enum DOCKED_WITHHELD; enum DOCKED_READY; }
  // @trace MON-SHIP-01
  enum def ShipReport { enum NONE; enum INVALID; enum ACCEPTED_A; enum ACCEPTED_B; enum MOVING_A; enum MOVING_B; enum COMPLETE_A; enum COMPLETE_B; enum FAILED_A; enum FAILED_B; }
  // @trace MON-WARE-01
  enum def WarehouseReport { enum NONE; enum INVALID; enum PENDING_A; enum PENDING_B; enum STORED_A; enum STORED_B; enum REJECTED_A; enum REJECTED_B; }
  // @trace MON-CTRL-01
  enum def ControlEvent { enum NONE; enum EMERGENCY_STOP; enum RESET; enum VERIFY_OK; }

  // @trace TYPE-TOK-01
  enum def Correlation { enum NONE; enum A; enum B; }
  // @trace TYPE-ACT-01
  enum def TransferAction { enum HOLD; enum BEGIN_TRANSFER; enum CONTINUE_TRANSFER; enum REQUEST_WAREHOUSE_VERIFY; enum CANCEL_TRANSFER; }
  // @trace TYPE-CAUSE-01
  enum def DecisionCause { enum FAULT_OR_RECOVERY; enum CANCEL_REQUEST; enum WAREHOUSE_CONFIRMATION; enum SHIP_PROGRESS; enum NEW_TRANSFER; enum NO_ELIGIBLE_ACTION; }
  // @trace TYPE-MODE-01
  enum def CoordinationMode { enum HOLDING; enum COMMANDING_SHIP; enum VERIFYING_WAREHOUSE; enum FAULT; }
  // @trace TYPE-DISP-01
  enum def RequestDisposition { enum NO_REQUEST; enum ACCEPTED; enum DUPLICATE; enum REJECTED; enum DEFERRED; enum CANCEL_ACCEPTED; }
  // @trace TYPE-OUT-01
  enum def TransferOutcome { enum NONE; enum ACTIVE; enum COMPLETED; enum CANCELLED; enum RECOVERY_REQUIRED; }
  // @trace TYPE-STATE-01
  enum def RequestLedger { enum NO_HISTORY; enum A_LAST; enum B_LAST; }
  // @trace TYPE-STATE-01
  enum def SessionState { enum IDLE; enum AWAIT_SHIP_A; enum AWAIT_SHIP_B; enum TRANSFERRING_A; enum TRANSFERRING_B; enum AWAIT_WAREHOUSE_A; enum AWAIT_WAREHOUSE_B; }
  // @trace TYPE-EVID-01
  enum def ShipEvidenceState { enum CLEAR; enum ACKNOWLEDGED; enum MOVING; enum COMPLETE; }
  // @trace TYPE-EVID-01
  enum def WarehouseEvidenceState { enum CLEAR; enum PENDING; }
  // @trace TYPE-EVID-01
  enum def RecoveryState { enum HEALTHY; enum LATCHED; enum RECOVERING; }

  // @trace TYPE-FACT-01
  enum def RequestKind { enum NONE; enum START; enum CANCEL; enum INVALID; }
  // @trace TYPE-FACT-01
  enum def DockReason { enum READY; enum NOT_DOCKED; enum PERMISSION_WITHHELD; enum INVALID_CONTEXT; }
  // @trace TYPE-FACT-01
  enum def ShipReportClass { enum NO_EVENT; enum ACCEPTED; enum MOVING; enum COMPLETE; enum FAILED; enum INVALID; }
  // @trace TYPE-FACT-01
  enum def ShipReportValue { enum NONE; enum INVALID; enum ACCEPTED_A; enum ACCEPTED_B; enum MOVING_A; enum MOVING_B; enum COMPLETE_A; enum COMPLETE_B; enum FAILED_A; enum FAILED_B; }
  // @trace TYPE-FACT-01
  enum def WarehouseReportClass { enum NO_EVENT; enum PENDING; enum STORED; enum REJECTED; enum INVALID; }
  // @trace TYPE-FACT-01
  enum def WarehouseReportValue { enum NONE; enum INVALID; enum PENDING_A; enum PENDING_B; enum STORED_A; enum STORED_B; enum REJECTED_A; enum REJECTED_B; }

  // @trace TYPE-FACT-01
  part def RequestFacts :> Data {
    attribute kind : RequestKind;
    attribute correlation : Correlation;
    attribute requestValidity : Base_Types::Boolean;
    attribute present : Base_Types::Boolean;
  }
  // @trace TYPE-FACT-01
  part def DockFacts :> Data {
    attribute usable : Base_Types::Boolean;
    attribute docked : Base_Types::Boolean;
    attribute permissionGranted : Base_Types::Boolean;
    attribute startReady : Base_Types::Boolean;
    attribute reason : DockReason;
  }
  // @trace TYPE-FACT-01
  part def ShipReportFacts :> Data {
    attribute reportClass : ShipReportClass;
    attribute correlation : Correlation;
    attribute usable : Base_Types::Boolean;
    attribute shipValue : ShipReportValue;
  }
  // @trace TYPE-FACT-01
  part def WarehouseReportFacts :> Data {
    attribute reportClass : WarehouseReportClass;
    attribute correlation : Correlation;
    attribute usable : Base_Types::Boolean;
    attribute warehouseValue : WarehouseReportValue;
  }

  // @trace TYPE-DEC-01
  part def AdmissionDecision :> Data {
    attribute kind : RequestKind;
    attribute correlation : Correlation;
    attribute disposition : RequestDisposition;
    attribute updateLedger : RequestLedger;
  }
  // @trace TYPE-DEC-01
  part def SessionView :> Data {
    attribute session : SessionState;
    attribute correlation : Correlation;
  }
  // @trace TYPE-DEC-01
  enum def ProgressClass { enum NONE; enum SHIP_ACCEPTED; enum SHIP_MOVING; enum SHIP_COMPLETE; enum WAREHOUSE_PENDING; enum WAREHOUSE_STORED; }
  // @trace TYPE-DEC-01
  enum def FaultTrigger { enum CLEAR; enum TRIGGERED; }
  // @trace TYPE-DEC-01
  enum def RecoveryIntent { enum RETAIN; enum LATCH; enum BEGIN_RECOVERY; enum OPEN_RECOVERY; }
  // @trace TYPE-DEC-01
  enum def OrdinaryInhibition { enum OPEN; enum INHIBITED; }
  // @trace TYPE-DEC-01
  part def CoordinationFrame :> Data {
    attribute progress : ProgressClass;
    attribute correlation : Correlation;
    attribute faultTrigger : FaultTrigger;
    attribute recoveryIntent : RecoveryIntent;
    attribute inhibitOrdinary : OrdinaryInhibition;
    attribute outcomePulse : TransferOutcome;
  }
  // @trace TYPE-DEC-01
  part def RecoveryTransition :> Data {
    attribute faultTrigger : FaultTrigger;
    attribute recoveryIntent : RecoveryIntent;
  }
  // @trace TYPE-DEC-01
  part def CoordinationGuard :> Data {
    attribute faultTrigger : FaultTrigger;
    attribute inhibitOrdinary : OrdinaryInhibition;
  }
  // @trace TYPE-DEC-01
  enum def ShipUpdate { enum FREEZE; enum RETAIN; enum ACKNOWLEDGE; enum MARK_MOVING; enum MARK_COMPLETE; enum CLEAR; }
  // @trace TYPE-DEC-01
  enum def WarehouseUpdate { enum FREEZE; enum RETAIN; enum MARK_PENDING; enum CLEAR; }
  // @trace TYPE-DEC-01
  enum def PriorityKind { enum FAULT_OR_RECOVERY; enum COMPLETION; enum ORDINARY; }
  // @trace TYPE-DEC-01
  part def PriorityDirective :> Data {
    attribute kind : PriorityKind;
    attribute correlation : Correlation;
  }
  // @trace TYPE-DEC-01
  enum def ProposalKind { enum NONE; enum START; enum CANCEL; enum SHIP_PROGRESS; enum WAREHOUSE_VERIFY; }
  // @trace TYPE-DEC-01
  part def ActionProposal :> Data {
    attribute kind : ProposalKind;
    attribute actionValue : TransferAction;
    attribute correlation : Correlation;
  }
  // @trace TYPE-DEC-01
  enum def DecisionOutcomeValue { enum NONE; enum ACTIVE; enum COMPLETED; enum CANCELLED; enum RECOVERY_REQUIRED; }
  // @trace TYPE-DEC-01
  part def TransferDecision :> Data {
    attribute actionValue : TransferAction;
    attribute cause : DecisionCause;
    attribute correlation : Correlation;
    attribute outcomeValue : DecisionOutcomeValue;
  }
  // @trace CTRL-RES-01
  enum def PublicRequestDisposition { enum NO_REQUEST; enum ACCEPTED; enum DUPLICATE; enum REJECTED; enum DEFERRED; enum CANCEL_ACCEPTED; }
  // @trace CTRL-RES-01
  enum def PublicTransferOutcome { enum NONE; enum ACTIVE; enum COMPLETED; enum CANCELLED; enum RECOVERY_REQUIRED; }
  // @trace CTRL-RES-01
  part def TransferCoordinationResult :> Data {
    attribute actionValue : TransferAction;
    attribute cause : DecisionCause;
    attribute mode : CoordinationMode;
    attribute correlation : Correlation;
    attribute requestDisposition : PublicRequestDisposition;
    attribute outcomeValue : PublicTransferOutcome;
  }

  // @trace PART-01
  part def RequestAcquisition :> Thread {
    // @trace INT-01
    port transfer_request : DataPort { in :>> type : TransferRequest; }
    // @trace INT-07
    port request_facts : DataPort { out :>> type : RequestFacts; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace ASM-INIT-01
          INIT_REQUEST_FACTS "Request facts initialize to a valid absent request":
            request_facts.kind == RequestKind.NONE &
            request_facts.correlation == Correlation.NONE &
            request_facts.requestValidity == T &
            request_facts.present == F;
      compute
        compute_cases
          // @trace CASE-01
          case CASE_01_REQUEST_NONE "NONE is valid and absent":
            assume transfer_request == TransferRequest.NONE;
            guarantee request_facts.kind == RequestKind.NONE & request_facts.correlation == Correlation.NONE &
              request_facts.requestValidity == T & request_facts.present == F;
          // @trace CASE-02
          case CASE_02_REQUEST_COMMAND "Each start or cancel is classified with its exact bounded token":
            assume transfer_request == TransferRequest.START_A | transfer_request == TransferRequest.START_B |
              transfer_request == TransferRequest.CANCEL_A | transfer_request == TransferRequest.CANCEL_B;
            guarantee request_facts.present == T & request_facts.requestValidity == T &
              ((transfer_request == TransferRequest.START_A | transfer_request == TransferRequest.START_B) implies
                (request_facts.kind == RequestKind.START)) &
              ((transfer_request == TransferRequest.CANCEL_A | transfer_request == TransferRequest.CANCEL_B) implies
                (request_facts.kind == RequestKind.CANCEL)) &
              ((transfer_request == TransferRequest.START_A | transfer_request == TransferRequest.CANCEL_A) implies
                (request_facts.correlation == Correlation.A)) &
              ((transfer_request == TransferRequest.START_B | transfer_request == TransferRequest.CANCEL_B) implies
                (request_facts.correlation == Correlation.B));
          // @trace CASE-03
          case CASE_03_REQUEST_INVALID "INVALID is present but inadmissible":
            assume transfer_request == TransferRequest.INVALID;
            guarantee request_facts.kind == RequestKind.INVALID & request_facts.correlation == Correlation.NONE &
              request_facts.requestValidity == F & request_facts.present == T;
    }*/
  }
  // @trace PART-02
  part def DockContextAssessment :> Thread {
    // @trace INT-02
    port dock_context : DataPort { in :>> type : DockContext; }
    // @trace INT-08
    port dock_facts : DataPort { out :>> type : DockFacts; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace ASM-INIT-01
          INIT_DOCK_FACTS "Dock facts initialize unusable and not ready":
            dock_facts.usable == F & dock_facts.docked == F &
            dock_facts.permissionGranted == F & dock_facts.startReady == F &
            dock_facts.reason == DockReason.INVALID_CONTEXT;
      compute
        compute_cases
          // @trace CASE-04
          case CASE_04_DOCK_READY "Dock-ready context grants start readiness":
            assume dock_context == DockContext.DOCKED_READY;
            guarantee dock_facts.usable == T & dock_facts.docked == T &
              dock_facts.permissionGranted == T & dock_facts.startReady == T &
              dock_facts.reason == DockReason.READY;
          // @trace CASE-05
          case CASE_05_DOCK_NOT_READY "Valid non-ready contexts preserve their distinct reason":
            assume dock_context == DockContext.IN_GRID | dock_context == DockContext.ON_WARP |
              dock_context == DockContext.DOCKED_WITHHELD;
            guarantee dock_facts.usable == T & dock_facts.startReady == F &
              ((dock_context == DockContext.DOCKED_WITHHELD) implies
                (dock_facts.docked == T & dock_facts.permissionGranted == F &
                 dock_facts.reason == DockReason.PERMISSION_WITHHELD)) &
              ((dock_context == DockContext.IN_GRID | dock_context == DockContext.ON_WARP) implies
                (dock_facts.docked == F & dock_facts.permissionGranted == F &
                 dock_facts.reason == DockReason.NOT_DOCKED));
          // @trace CASE-06
          case CASE_06_DOCK_INVALID "Invalid context is unusable and cannot admit a start":
            assume dock_context == DockContext.INVALID;
            guarantee dock_facts.usable == F & dock_facts.docked == F &
              dock_facts.permissionGranted == F & dock_facts.startReady == F &
              dock_facts.reason == DockReason.INVALID_CONTEXT;
    }*/
  }
  // @trace PART-03
  part def ShipReportAcquisition :> Thread {
    // @trace INT-03
    port ship_report : DataPort { in :>> type : ShipReport; }
    // @trace INT-09
    port ship_report_facts : DataPort { out :>> type : ShipReportFacts; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace ASM-INIT-01
          INIT_SHIP_FACTS "Ship facts initialize as a usable absent event":
            ship_report_facts.reportClass == ShipReportClass.NO_EVENT &
            ship_report_facts.correlation == Correlation.NONE & ship_report_facts.usable == T &
            ship_report_facts.shipValue == ShipReportValue.NONE;
      compute
        compute_cases
          // @trace CASE-07
          case CASE_07_SHIP_NONE "No ship report is a usable absent event":
            assume ship_report == ShipReport.NONE;
            guarantee ship_report_facts.reportClass == ShipReportClass.NO_EVENT &
              ship_report_facts.correlation == Correlation.NONE & ship_report_facts.usable == T &
              ship_report_facts.shipValue == ShipReportValue.NONE;
          // @trace CASE-08
          case CASE_08_SHIP_PROGRESS "Usable ship progress is classified with exact token and report":
            assume ship_report == ShipReport.ACCEPTED_A | ship_report == ShipReport.ACCEPTED_B |
              ship_report == ShipReport.MOVING_A | ship_report == ShipReport.MOVING_B |
              ship_report == ShipReport.COMPLETE_A | ship_report == ShipReport.COMPLETE_B;
            guarantee ship_report_facts.usable == T &
              ((ship_report == ShipReport.ACCEPTED_A) implies (ship_report_facts.shipValue == ShipReportValue.ACCEPTED_A)) &
              ((ship_report == ShipReport.ACCEPTED_B) implies (ship_report_facts.shipValue == ShipReportValue.ACCEPTED_B)) &
              ((ship_report == ShipReport.MOVING_A) implies (ship_report_facts.shipValue == ShipReportValue.MOVING_A)) &
              ((ship_report == ShipReport.MOVING_B) implies (ship_report_facts.shipValue == ShipReportValue.MOVING_B)) &
              ((ship_report == ShipReport.COMPLETE_A) implies (ship_report_facts.shipValue == ShipReportValue.COMPLETE_A)) &
              ((ship_report == ShipReport.COMPLETE_B) implies (ship_report_facts.shipValue == ShipReportValue.COMPLETE_B)) &
              ((ship_report == ShipReport.ACCEPTED_A | ship_report == ShipReport.ACCEPTED_B) implies
                (ship_report_facts.reportClass == ShipReportClass.ACCEPTED)) &
              ((ship_report == ShipReport.MOVING_A | ship_report == ShipReport.MOVING_B) implies
                (ship_report_facts.reportClass == ShipReportClass.MOVING)) &
              ((ship_report == ShipReport.COMPLETE_A | ship_report == ShipReport.COMPLETE_B) implies
                (ship_report_facts.reportClass == ShipReportClass.COMPLETE)) &
              ((ship_report == ShipReport.ACCEPTED_A | ship_report == ShipReport.MOVING_A |
                ship_report == ShipReport.COMPLETE_A) implies (ship_report_facts.correlation == Correlation.A)) &
              ((ship_report == ShipReport.ACCEPTED_B | ship_report == ShipReport.MOVING_B |
                ship_report == ShipReport.COMPLETE_B) implies (ship_report_facts.correlation == Correlation.B));
          // @trace CASE-09
          case CASE_09_SHIP_FAULT "Invalid and failed ship reports are explicitly unusable fault evidence":
            assume ship_report == ShipReport.INVALID | ship_report == ShipReport.FAILED_A |
              ship_report == ShipReport.FAILED_B;
            guarantee ship_report_facts.usable == F &
              ((ship_report == ShipReport.INVALID) implies (ship_report_facts.shipValue == ShipReportValue.INVALID)) &
              ((ship_report == ShipReport.FAILED_A) implies (ship_report_facts.shipValue == ShipReportValue.FAILED_A)) &
              ((ship_report == ShipReport.FAILED_B) implies (ship_report_facts.shipValue == ShipReportValue.FAILED_B)) &
              ((ship_report == ShipReport.INVALID) implies
                (ship_report_facts.reportClass == ShipReportClass.INVALID & ship_report_facts.correlation == Correlation.NONE)) &
              ((ship_report == ShipReport.FAILED_A) implies
                (ship_report_facts.reportClass == ShipReportClass.FAILED & ship_report_facts.correlation == Correlation.A)) &
              ((ship_report == ShipReport.FAILED_B) implies
                (ship_report_facts.reportClass == ShipReportClass.FAILED & ship_report_facts.correlation == Correlation.B));
    }*/
  }
  // @trace PART-04
  part def WarehouseReportAcquisition :> Thread {
    // @trace INT-04
    port warehouse_report : DataPort { in :>> type : WarehouseReport; }
    // @trace INT-10
    port warehouse_report_facts : DataPort { out :>> type : WarehouseReportFacts; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace ASM-INIT-01
          INIT_WAREHOUSE_FACTS "Warehouse facts initialize as a usable absent event":
            warehouse_report_facts.reportClass == WarehouseReportClass.NO_EVENT &
            warehouse_report_facts.correlation == Correlation.NONE & warehouse_report_facts.usable == T &
            warehouse_report_facts.warehouseValue == WarehouseReportValue.NONE;
      compute
        compute_cases
          // @trace CASE-10
          case CASE_10_WAREHOUSE_NONE "No warehouse report is a usable absent event":
            assume warehouse_report == WarehouseReport.NONE;
            guarantee warehouse_report_facts.reportClass == WarehouseReportClass.NO_EVENT &
              warehouse_report_facts.correlation == Correlation.NONE & warehouse_report_facts.usable == T &
              warehouse_report_facts.warehouseValue == WarehouseReportValue.NONE;
          // @trace CASE-11
          case CASE_11_WAREHOUSE_PROGRESS "Usable warehouse progress is classified with exact token and report":
            assume warehouse_report == WarehouseReport.PENDING_A | warehouse_report == WarehouseReport.PENDING_B |
              warehouse_report == WarehouseReport.STORED_A | warehouse_report == WarehouseReport.STORED_B;
            guarantee warehouse_report_facts.usable == T &
              ((warehouse_report == WarehouseReport.PENDING_A) implies (warehouse_report_facts.warehouseValue == WarehouseReportValue.PENDING_A)) &
              ((warehouse_report == WarehouseReport.PENDING_B) implies (warehouse_report_facts.warehouseValue == WarehouseReportValue.PENDING_B)) &
              ((warehouse_report == WarehouseReport.STORED_A) implies (warehouse_report_facts.warehouseValue == WarehouseReportValue.STORED_A)) &
              ((warehouse_report == WarehouseReport.STORED_B) implies (warehouse_report_facts.warehouseValue == WarehouseReportValue.STORED_B)) &
              ((warehouse_report == WarehouseReport.PENDING_A | warehouse_report == WarehouseReport.PENDING_B) implies
                (warehouse_report_facts.reportClass == WarehouseReportClass.PENDING)) &
              ((warehouse_report == WarehouseReport.STORED_A | warehouse_report == WarehouseReport.STORED_B) implies
                (warehouse_report_facts.reportClass == WarehouseReportClass.STORED)) &
              ((warehouse_report == WarehouseReport.PENDING_A | warehouse_report == WarehouseReport.STORED_A) implies
                (warehouse_report_facts.correlation == Correlation.A)) &
              ((warehouse_report == WarehouseReport.PENDING_B | warehouse_report == WarehouseReport.STORED_B) implies
                (warehouse_report_facts.correlation == Correlation.B));
          // @trace CASE-12
          case CASE_12_WAREHOUSE_FAULT "Invalid and rejected warehouse reports are explicitly unusable fault evidence":
            assume warehouse_report == WarehouseReport.INVALID | warehouse_report == WarehouseReport.REJECTED_A |
              warehouse_report == WarehouseReport.REJECTED_B;
            guarantee warehouse_report_facts.usable == F &
              ((warehouse_report == WarehouseReport.INVALID) implies (warehouse_report_facts.warehouseValue == WarehouseReportValue.INVALID)) &
              ((warehouse_report == WarehouseReport.REJECTED_A) implies (warehouse_report_facts.warehouseValue == WarehouseReportValue.REJECTED_A)) &
              ((warehouse_report == WarehouseReport.REJECTED_B) implies (warehouse_report_facts.warehouseValue == WarehouseReportValue.REJECTED_B)) &
              ((warehouse_report == WarehouseReport.INVALID) implies
                (warehouse_report_facts.reportClass == WarehouseReportClass.INVALID & warehouse_report_facts.correlation == Correlation.NONE)) &
              ((warehouse_report == WarehouseReport.REJECTED_A) implies
                (warehouse_report_facts.reportClass == WarehouseReportClass.REJECTED & warehouse_report_facts.correlation == Correlation.A)) &
              ((warehouse_report == WarehouseReport.REJECTED_B) implies
                (warehouse_report_facts.reportClass == WarehouseReportClass.REJECTED & warehouse_report_facts.correlation == Correlation.B));
    }*/
  }
  // @trace PART-05
  part def RequestAdmission :> Thread {
    // @trace INT-07
    port request_facts : DataPort { in :>> type : RequestFacts; }
    // @trace INT-08
    port dock_facts : DataPort { in :>> type : DockFacts; }
    // @trace INT-11
    port prior_session_view : DataPort { in :>> type : SessionView; }
    // @trace INT-17
    port coordination_guard : DataPort { in :>> type : CoordinationGuard; }
    // @trace INT-18
    port admission_decision : DataPort { out :>> type : AdmissionDecision; }
    // @trace INT-33
    port request_disposition : DataPort { out :>> type : RequestDisposition; }

    language "GUMBO" /*{
      state
        // @trace PART-05
        requestLedger : RequestLedger;
      initialize
        guarantee
          // @trace ASM-INIT-01
          INIT_ADMISSION "Request history and admission outputs initialize safely":
            requestLedger == RequestLedger.NO_HISTORY &
            admission_decision.kind == RequestKind.NONE & admission_decision.correlation == Correlation.NONE &
            admission_decision.disposition == RequestDisposition.NO_REQUEST &
            admission_decision.updateLedger == RequestLedger.NO_HISTORY &
            request_disposition == RequestDisposition.NO_REQUEST;
      compute
        compute_cases
          // @trace CASE-13
          case CASE_13_NO_REQUEST "An absent request preserves history and yields no request action":
            assume request_facts.present == F;
            guarantee requestLedger == In(requestLedger) & admission_decision.kind == RequestKind.NONE &
              admission_decision.correlation == Correlation.NONE &
              admission_decision.disposition == RequestDisposition.NO_REQUEST &
              admission_decision.updateLedger == In(requestLedger) &
              request_disposition == RequestDisposition.NO_REQUEST;
          // @trace CASE-14
          case CASE_14_INVALID_REQUEST "An invalid present request is rejected without changing history":
            assume request_facts.present == T & request_facts.requestValidity == F;
            guarantee requestLedger == In(requestLedger) & admission_decision.kind == RequestKind.INVALID &
              admission_decision.correlation == Correlation.NONE & admission_decision.disposition == RequestDisposition.REJECTED &
              admission_decision.updateLedger == In(requestLedger) & request_disposition == RequestDisposition.REJECTED;
          // @trace CASE-15
          case CASE_15_ACCEPT_FRESH_START "A ready idle fresh start is accepted and records its token":
            assume request_facts.requestValidity == T & request_facts.kind == RequestKind.START &
              coordination_guard.inhibitOrdinary == OrdinaryInhibition.OPEN &
              prior_session_view.session == SessionState.IDLE & dock_facts.startReady == T &
              ((request_facts.correlation == Correlation.A & In(requestLedger) != RequestLedger.A_LAST) |
               (request_facts.correlation == Correlation.B & In(requestLedger) != RequestLedger.B_LAST));
            guarantee admission_decision.kind == RequestKind.START &
              admission_decision.correlation == request_facts.correlation &
              admission_decision.disposition == RequestDisposition.ACCEPTED &
              request_disposition == RequestDisposition.ACCEPTED &
              ((request_facts.correlation == Correlation.A) implies
                (requestLedger == RequestLedger.A_LAST & admission_decision.updateLedger == RequestLedger.A_LAST)) &
              ((request_facts.correlation == Correlation.B) implies
                (requestLedger == RequestLedger.B_LAST & admission_decision.updateLedger == RequestLedger.B_LAST));
          // @trace CASE-16
          case CASE_16_DUPLICATE_START "A start reusing the last accepted token is duplicate":
            assume request_facts.requestValidity == T & request_facts.kind == RequestKind.START &
              coordination_guard.inhibitOrdinary == OrdinaryInhibition.OPEN &
              ((request_facts.correlation == Correlation.A & In(requestLedger) == RequestLedger.A_LAST) |
               (request_facts.correlation == Correlation.B & In(requestLedger) == RequestLedger.B_LAST));
            guarantee requestLedger == In(requestLedger) & admission_decision.kind == RequestKind.START &
              admission_decision.correlation == request_facts.correlation &
              admission_decision.disposition == RequestDisposition.DUPLICATE &
              admission_decision.updateLedger == In(requestLedger) & request_disposition == RequestDisposition.DUPLICATE;
          // @trace CASE-17
          case CASE_17_START_NOT_READY "A fresh idle start outside ready dock context is rejected":
            assume request_facts.requestValidity == T & request_facts.kind == RequestKind.START &
              coordination_guard.inhibitOrdinary == OrdinaryInhibition.OPEN &
              prior_session_view.session == SessionState.IDLE & dock_facts.startReady == F &
              ((request_facts.correlation == Correlation.A & In(requestLedger) != RequestLedger.A_LAST) |
               (request_facts.correlation == Correlation.B & In(requestLedger) != RequestLedger.B_LAST));
            guarantee requestLedger == In(requestLedger) & admission_decision.kind == RequestKind.START &
              admission_decision.correlation == request_facts.correlation &
              admission_decision.disposition == RequestDisposition.REJECTED &
              admission_decision.updateLedger == In(requestLedger) & request_disposition == RequestDisposition.REJECTED;
          // @trace CASE-18
          case CASE_18_DEFER_REQUEST "Closed coordination or a busy fresh start defers the request":
            assume request_facts.requestValidity == T & request_facts.present == T &
              ((coordination_guard.inhibitOrdinary == OrdinaryInhibition.INHIBITED) |
               (coordination_guard.inhibitOrdinary == OrdinaryInhibition.OPEN & request_facts.kind == RequestKind.START &
                prior_session_view.session != SessionState.IDLE &
                ((request_facts.correlation == Correlation.A & In(requestLedger) != RequestLedger.A_LAST) |
                 (request_facts.correlation == Correlation.B & In(requestLedger) != RequestLedger.B_LAST))));
            guarantee requestLedger == In(requestLedger) & admission_decision.kind == request_facts.kind &
              admission_decision.correlation == request_facts.correlation &
              admission_decision.disposition == RequestDisposition.DEFERRED &
              admission_decision.updateLedger == In(requestLedger) & request_disposition == RequestDisposition.DEFERRED;
          // @trace CASE-19
          case CASE_19_ACCEPT_CANCEL "An open matching cancellation is accepted for the active token":
            assume request_facts.requestValidity == T & request_facts.kind == RequestKind.CANCEL &
              coordination_guard.inhibitOrdinary == OrdinaryInhibition.OPEN &
              ((request_facts.correlation == Correlation.A &
                (prior_session_view.session == SessionState.AWAIT_SHIP_A |
                 prior_session_view.session == SessionState.TRANSFERRING_A |
                 prior_session_view.session == SessionState.AWAIT_WAREHOUSE_A)) |
               (request_facts.correlation == Correlation.B &
                (prior_session_view.session == SessionState.AWAIT_SHIP_B |
                 prior_session_view.session == SessionState.TRANSFERRING_B |
                 prior_session_view.session == SessionState.AWAIT_WAREHOUSE_B)));
            guarantee requestLedger == In(requestLedger) & admission_decision.kind == RequestKind.CANCEL &
              admission_decision.correlation == request_facts.correlation &
              admission_decision.disposition == RequestDisposition.CANCEL_ACCEPTED &
              admission_decision.updateLedger == In(requestLedger) &
              request_disposition == RequestDisposition.CANCEL_ACCEPTED;
          // @trace CASE-20
          case CASE_20_REJECT_CANCEL "An idle or mistagged open cancellation is rejected":
            assume request_facts.requestValidity == T & request_facts.kind == RequestKind.CANCEL &
              coordination_guard.inhibitOrdinary == OrdinaryInhibition.OPEN &
              (prior_session_view.session == SessionState.IDLE |
               (request_facts.correlation == Correlation.A &
                (prior_session_view.session == SessionState.AWAIT_SHIP_B |
                 prior_session_view.session == SessionState.TRANSFERRING_B |
                 prior_session_view.session == SessionState.AWAIT_WAREHOUSE_B)) |
               (request_facts.correlation == Correlation.B &
                (prior_session_view.session == SessionState.AWAIT_SHIP_A |
                 prior_session_view.session == SessionState.TRANSFERRING_A |
                 prior_session_view.session == SessionState.AWAIT_WAREHOUSE_A)));
            guarantee requestLedger == In(requestLedger) & admission_decision.kind == RequestKind.CANCEL &
              admission_decision.correlation == request_facts.correlation &
              admission_decision.disposition == RequestDisposition.REJECTED &
              admission_decision.updateLedger == In(requestLedger) & request_disposition == RequestDisposition.REJECTED;
    }*/
  }
  // @trace PART-06
  part def EvidenceCoherence :> Thread {
    // @trace INT-09
    port ship_report_facts : DataPort { in :>> type : ShipReportFacts; }
    // @trace INT-10
    port warehouse_report_facts : DataPort { in :>> type : WarehouseReportFacts; }
    // @trace INT-05
    port control_event : DataPort { in :>> type : ControlEvent; }
    // @trace INT-12
    port prior_recovery_state : DataPort { in :>> type : RecoveryState; }
    // @trace INT-13
    port prior_session_view : DataPort { in :>> type : SessionView; }
    // @trace INT-14
    port prior_ship_evidence : DataPort { in :>> type : ShipEvidenceState; }
    // @trace INT-15
    port prior_warehouse_evidence : DataPort { in :>> type : WarehouseEvidenceState; }
    // @trace INT-16
    port recovery_transition : DataPort { out :>> type : RecoveryTransition; }
    // @trace INT-17
    port coordination_guard : DataPort { out :>> type : CoordinationGuard; }
    // @trace INT-20
    port coordination_frame : DataPort { out :>> type : CoordinationFrame; }
    // @trace INT-21
    port ship_update : DataPort { out :>> type : ShipUpdate; }
    // @trace INT-22
    port warehouse_update : DataPort { out :>> type : WarehouseUpdate; }
    // @trace INT-31
    port priority_directive : DataPort { out :>> type : PriorityDirective; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace ASM-INIT-01
          INIT_COHERENCE "Coherence initializes open with no progress or recovery request":
            recovery_transition.faultTrigger == FaultTrigger.CLEAR & recovery_transition.recoveryIntent == RecoveryIntent.RETAIN &
            coordination_guard.faultTrigger == FaultTrigger.CLEAR & coordination_guard.inhibitOrdinary == OrdinaryInhibition.OPEN &
            coordination_frame.progress == ProgressClass.NONE & coordination_frame.correlation == Correlation.NONE &
            coordination_frame.faultTrigger == FaultTrigger.CLEAR & coordination_frame.recoveryIntent == RecoveryIntent.RETAIN &
            coordination_frame.inhibitOrdinary == OrdinaryInhibition.OPEN & coordination_frame.outcomePulse == TransferOutcome.NONE &
            ship_update == ShipUpdate.RETAIN & warehouse_update == WarehouseUpdate.RETAIN &
            priority_directive.kind == PriorityKind.ORDINARY & priority_directive.correlation == Correlation.NONE;
      compute
        compute_cases
          // @trace CASE-21
          case CASE_21_COHERENCE_FAULT "Emergency, unusable, conflicting, mistagged, phase-invalid, or inconsistent evidence faults immediately":
            assume control_event == ControlEvent.EMERGENCY_STOP |
              ship_report_facts.usable == F |
              warehouse_report_facts.usable == F |
              (ship_report_facts.reportClass != ShipReportClass.NO_EVENT &
               warehouse_report_facts.reportClass != WarehouseReportClass.NO_EVENT) |
              (prior_session_view.session == SessionState.IDLE &
               (prior_ship_evidence != ShipEvidenceState.CLEAR |
                prior_warehouse_evidence != WarehouseEvidenceState.CLEAR)) |
              ((prior_session_view.session == SessionState.AWAIT_SHIP_A |
                prior_session_view.session == SessionState.AWAIT_SHIP_B) &
               ((prior_ship_evidence != ShipEvidenceState.CLEAR & prior_ship_evidence != ShipEvidenceState.ACKNOWLEDGED) |
                prior_warehouse_evidence != WarehouseEvidenceState.CLEAR)) |
              ((prior_session_view.session == SessionState.TRANSFERRING_A |
                prior_session_view.session == SessionState.TRANSFERRING_B) &
               ((prior_ship_evidence != ShipEvidenceState.ACKNOWLEDGED & prior_ship_evidence != ShipEvidenceState.MOVING) |
                prior_warehouse_evidence != WarehouseEvidenceState.CLEAR)) |
              ((prior_session_view.session == SessionState.AWAIT_WAREHOUSE_A |
                prior_session_view.session == SessionState.AWAIT_WAREHOUSE_B) &
               prior_ship_evidence != ShipEvidenceState.COMPLETE) |
              (ship_report_facts.reportClass != ShipReportClass.NO_EVENT &
               (ship_report_facts.correlation != prior_session_view.correlation |
                prior_session_view.session == SessionState.IDLE |
                prior_session_view.session == SessionState.AWAIT_WAREHOUSE_A |
                prior_session_view.session == SessionState.AWAIT_WAREHOUSE_B)) |
              (warehouse_report_facts.reportClass != WarehouseReportClass.NO_EVENT &
               (warehouse_report_facts.correlation != prior_session_view.correlation |
                (prior_session_view.session != SessionState.AWAIT_WAREHOUSE_A &
                 prior_session_view.session != SessionState.AWAIT_WAREHOUSE_B)));
            guarantee recovery_transition.faultTrigger == FaultTrigger.TRIGGERED &
              recovery_transition.recoveryIntent == RecoveryIntent.LATCH &
              coordination_guard.faultTrigger == FaultTrigger.TRIGGERED &
              coordination_guard.inhibitOrdinary == OrdinaryInhibition.INHIBITED &
              coordination_frame.progress == ProgressClass.NONE &
              coordination_frame.correlation == prior_session_view.correlation &
              coordination_frame.faultTrigger == FaultTrigger.TRIGGERED &
              coordination_frame.recoveryIntent == RecoveryIntent.LATCH &
              coordination_frame.inhibitOrdinary == OrdinaryInhibition.INHIBITED &
              coordination_frame.outcomePulse == TransferOutcome.RECOVERY_REQUIRED &
              ship_update == ShipUpdate.FREEZE & warehouse_update == WarehouseUpdate.FREEZE &
              priority_directive.kind == PriorityKind.FAULT_OR_RECOVERY &
              priority_directive.correlation == prior_session_view.correlation;
          // @trace CASE-22
          case CASE_22_RECOVERY_CONTROL "Closed recovery and all recovery-control evaluations inhibit ordinary work":
            assume control_event != ControlEvent.EMERGENCY_STOP &
              ship_report_facts.usable == T & warehouse_report_facts.usable == T &
              (ship_report_facts.reportClass == ShipReportClass.NO_EVENT |
               warehouse_report_facts.reportClass == WarehouseReportClass.NO_EVENT) &
              not ((prior_session_view.session == SessionState.IDLE &
                  (prior_ship_evidence != ShipEvidenceState.CLEAR | prior_warehouse_evidence != WarehouseEvidenceState.CLEAR)) |
                ((prior_session_view.session == SessionState.AWAIT_SHIP_A | prior_session_view.session == SessionState.AWAIT_SHIP_B) &
                 ((prior_ship_evidence != ShipEvidenceState.CLEAR & prior_ship_evidence != ShipEvidenceState.ACKNOWLEDGED) |
                  prior_warehouse_evidence != WarehouseEvidenceState.CLEAR)) |
                ((prior_session_view.session == SessionState.TRANSFERRING_A | prior_session_view.session == SessionState.TRANSFERRING_B) &
                 ((prior_ship_evidence != ShipEvidenceState.ACKNOWLEDGED & prior_ship_evidence != ShipEvidenceState.MOVING) |
                  prior_warehouse_evidence != WarehouseEvidenceState.CLEAR)) |
                ((prior_session_view.session == SessionState.AWAIT_WAREHOUSE_A | prior_session_view.session == SessionState.AWAIT_WAREHOUSE_B) &
                 prior_ship_evidence != ShipEvidenceState.COMPLETE) |
                (ship_report_facts.reportClass != ShipReportClass.NO_EVENT &
                 (ship_report_facts.correlation != prior_session_view.correlation |
                  prior_session_view.session == SessionState.IDLE |
                  prior_session_view.session == SessionState.AWAIT_WAREHOUSE_A |
                  prior_session_view.session == SessionState.AWAIT_WAREHOUSE_B)) |
                (warehouse_report_facts.reportClass != WarehouseReportClass.NO_EVENT &
                 (warehouse_report_facts.correlation != prior_session_view.correlation |
                  (prior_session_view.session != SessionState.AWAIT_WAREHOUSE_A &
                   prior_session_view.session != SessionState.AWAIT_WAREHOUSE_B)))) &
              (prior_recovery_state != RecoveryState.HEALTHY | control_event != ControlEvent.NONE);
            guarantee recovery_transition.faultTrigger == FaultTrigger.CLEAR &
              coordination_guard.faultTrigger == FaultTrigger.CLEAR &
              coordination_guard.inhibitOrdinary == OrdinaryInhibition.INHIBITED &
              coordination_frame.progress == ProgressClass.NONE &
              coordination_frame.correlation == prior_session_view.correlation &
              coordination_frame.faultTrigger == FaultTrigger.CLEAR &
              coordination_frame.inhibitOrdinary == OrdinaryInhibition.INHIBITED &
              coordination_frame.outcomePulse == TransferOutcome.RECOVERY_REQUIRED &
              ship_update == ShipUpdate.FREEZE & warehouse_update == WarehouseUpdate.FREEZE &
              priority_directive.kind == PriorityKind.FAULT_OR_RECOVERY &
              priority_directive.correlation == prior_session_view.correlation &
              ((prior_recovery_state == RecoveryState.LATCHED & control_event == ControlEvent.RESET) implies
                (recovery_transition.recoveryIntent == RecoveryIntent.BEGIN_RECOVERY &
                 coordination_frame.recoveryIntent == RecoveryIntent.BEGIN_RECOVERY)) &
              ((prior_recovery_state == RecoveryState.RECOVERING & control_event == ControlEvent.VERIFY_OK) implies
                (recovery_transition.recoveryIntent == RecoveryIntent.OPEN_RECOVERY &
                 coordination_frame.recoveryIntent == RecoveryIntent.OPEN_RECOVERY)) &
              ((not ((prior_recovery_state == RecoveryState.LATCHED & control_event == ControlEvent.RESET) |
                 (prior_recovery_state == RecoveryState.RECOVERING & control_event == ControlEvent.VERIFY_OK)) implies
                (recovery_transition.recoveryIntent == RecoveryIntent.RETAIN &
                 coordination_frame.recoveryIntent == RecoveryIntent.RETAIN)));
          // @trace CASE-23
          case CASE_23_SHIP_PROGRESS "A matching phase-valid ship event produces only its qualified ship update":
            assume prior_recovery_state == RecoveryState.HEALTHY & control_event == ControlEvent.NONE &
              warehouse_report_facts.reportClass == WarehouseReportClass.NO_EVENT &
              ship_report_facts.usable == T & ship_report_facts.reportClass != ShipReportClass.NO_EVENT &
              ship_report_facts.correlation == prior_session_view.correlation &
              (prior_session_view.session == SessionState.AWAIT_SHIP_A |
               prior_session_view.session == SessionState.AWAIT_SHIP_B |
               prior_session_view.session == SessionState.TRANSFERRING_A |
               prior_session_view.session == SessionState.TRANSFERRING_B) &
              ((prior_session_view.session == SessionState.AWAIT_SHIP_A |
                prior_session_view.session == SessionState.AWAIT_SHIP_B) implies
                (prior_ship_evidence == ShipEvidenceState.CLEAR |
                 prior_ship_evidence == ShipEvidenceState.ACKNOWLEDGED)) &
              ((prior_session_view.session == SessionState.TRANSFERRING_A |
                prior_session_view.session == SessionState.TRANSFERRING_B) implies
                (prior_ship_evidence == ShipEvidenceState.ACKNOWLEDGED |
                 prior_ship_evidence == ShipEvidenceState.MOVING)) &
              prior_warehouse_evidence == WarehouseEvidenceState.CLEAR;
            guarantee recovery_transition.faultTrigger == FaultTrigger.CLEAR & recovery_transition.recoveryIntent == RecoveryIntent.RETAIN &
              coordination_guard.faultTrigger == FaultTrigger.CLEAR & coordination_guard.inhibitOrdinary == OrdinaryInhibition.OPEN &
              coordination_frame.correlation == ship_report_facts.correlation & coordination_frame.faultTrigger == FaultTrigger.CLEAR &
              coordination_frame.recoveryIntent == RecoveryIntent.RETAIN &
              coordination_frame.inhibitOrdinary == OrdinaryInhibition.OPEN & coordination_frame.outcomePulse == TransferOutcome.NONE &
              warehouse_update == WarehouseUpdate.RETAIN & priority_directive.kind == PriorityKind.ORDINARY &
              priority_directive.correlation == ship_report_facts.correlation &
              ((ship_report_facts.reportClass == ShipReportClass.ACCEPTED) implies
                (coordination_frame.progress == ProgressClass.SHIP_ACCEPTED & ship_update == ShipUpdate.ACKNOWLEDGE)) &
              ((ship_report_facts.reportClass == ShipReportClass.MOVING) implies
                (coordination_frame.progress == ProgressClass.SHIP_MOVING & ship_update == ShipUpdate.MARK_MOVING)) &
              ((ship_report_facts.reportClass == ShipReportClass.COMPLETE) implies
                (coordination_frame.progress == ProgressClass.SHIP_COMPLETE & ship_update == ShipUpdate.MARK_COMPLETE));
          // @trace CASE-24
          case CASE_24_WAREHOUSE_OR_NO_PROGRESS "Matching warehouse evidence or an empty snapshot is qualified without reclassification":
            assume prior_recovery_state == RecoveryState.HEALTHY & control_event == ControlEvent.NONE &
              ship_report_facts.reportClass == ShipReportClass.NO_EVENT & warehouse_report_facts.usable == T &
              ((warehouse_report_facts.reportClass == WarehouseReportClass.NO_EVENT &
                ((prior_session_view.session == SessionState.IDLE & prior_ship_evidence == ShipEvidenceState.CLEAR &
                  prior_warehouse_evidence == WarehouseEvidenceState.CLEAR) |
                 ((prior_session_view.session == SessionState.AWAIT_SHIP_A | prior_session_view.session == SessionState.AWAIT_SHIP_B) &
                  (prior_ship_evidence == ShipEvidenceState.CLEAR | prior_ship_evidence == ShipEvidenceState.ACKNOWLEDGED) &
                  prior_warehouse_evidence == WarehouseEvidenceState.CLEAR) |
                 ((prior_session_view.session == SessionState.TRANSFERRING_A | prior_session_view.session == SessionState.TRANSFERRING_B) &
                  (prior_ship_evidence == ShipEvidenceState.ACKNOWLEDGED | prior_ship_evidence == ShipEvidenceState.MOVING) &
                  prior_warehouse_evidence == WarehouseEvidenceState.CLEAR) |
                 ((prior_session_view.session == SessionState.AWAIT_WAREHOUSE_A | prior_session_view.session == SessionState.AWAIT_WAREHOUSE_B) &
                  prior_ship_evidence == ShipEvidenceState.COMPLETE))) |
               (warehouse_report_facts.reportClass != WarehouseReportClass.NO_EVENT &
                warehouse_report_facts.correlation == prior_session_view.correlation &
                (prior_session_view.session == SessionState.AWAIT_WAREHOUSE_A |
                 prior_session_view.session == SessionState.AWAIT_WAREHOUSE_B) &
                prior_ship_evidence == ShipEvidenceState.COMPLETE));
            guarantee recovery_transition.faultTrigger == FaultTrigger.CLEAR & recovery_transition.recoveryIntent == RecoveryIntent.RETAIN &
              coordination_guard.faultTrigger == FaultTrigger.CLEAR & coordination_guard.inhibitOrdinary == OrdinaryInhibition.OPEN &
              coordination_frame.faultTrigger == FaultTrigger.CLEAR & coordination_frame.recoveryIntent == RecoveryIntent.RETAIN &
              coordination_frame.inhibitOrdinary == OrdinaryInhibition.OPEN &
              ((warehouse_report_facts.reportClass == WarehouseReportClass.NO_EVENT) implies
                (coordination_frame.progress == ProgressClass.NONE & coordination_frame.correlation == prior_session_view.correlation &
                 coordination_frame.outcomePulse == TransferOutcome.NONE & ship_update == ShipUpdate.RETAIN &
                 warehouse_update == WarehouseUpdate.RETAIN & priority_directive.kind == PriorityKind.ORDINARY &
                 priority_directive.correlation == prior_session_view.correlation)) &
              ((warehouse_report_facts.reportClass == WarehouseReportClass.PENDING) implies
                (coordination_frame.progress == ProgressClass.WAREHOUSE_PENDING &
                 coordination_frame.correlation == warehouse_report_facts.correlation &
                 coordination_frame.outcomePulse == TransferOutcome.NONE & ship_update == ShipUpdate.RETAIN &
                 warehouse_update == WarehouseUpdate.MARK_PENDING & priority_directive.kind == PriorityKind.ORDINARY &
                 priority_directive.correlation == warehouse_report_facts.correlation)) &
              ((warehouse_report_facts.reportClass == WarehouseReportClass.STORED) implies
                (coordination_frame.progress == ProgressClass.WAREHOUSE_STORED &
                 coordination_frame.correlation == warehouse_report_facts.correlation &
                 coordination_frame.outcomePulse == TransferOutcome.COMPLETED & ship_update == ShipUpdate.CLEAR &
                 warehouse_update == WarehouseUpdate.CLEAR & priority_directive.kind == PriorityKind.COMPLETION &
                 priority_directive.correlation == warehouse_report_facts.correlation));
    }*/
  }
  // @trace PART-07
  part def TransferSession :> Thread {
    // @trace INT-18
    port admission_decision : DataPort { in :>> type : AdmissionDecision; }
    // @trace INT-20
    port coordination_frame : DataPort { in :>> type : CoordinationFrame; }
    // @trace INT-11
    port prior_session_view : DataPort { out :>> type : SessionView; }

    language "GUMBO" /*{
      state
        // @trace PART-07
        sessionState : SessionState;
      initialize
        guarantee
          // @trace ASM-INIT-01
          INIT_SESSION "The sole session owner initializes idle with no active token":
            sessionState == SessionState.IDLE & prior_session_view.session == SessionState.IDLE &
            prior_session_view.correlation == Correlation.NONE;
      compute
        guarantee
          // @trace CASE-25
          CASE_25_SESSION_TRANSITION "Session transition applies inhibition, cancellation, start, progress, completion, then retention":
            prior_session_view.session == In(sessionState) &
            ((In(sessionState) == SessionState.IDLE) implies
              (prior_session_view.correlation == Correlation.NONE)) &
            ((In(sessionState) == SessionState.AWAIT_SHIP_A | In(sessionState) == SessionState.TRANSFERRING_A |
              In(sessionState) == SessionState.AWAIT_WAREHOUSE_A) implies
              (prior_session_view.correlation == Correlation.A)) &
            ((In(sessionState) == SessionState.AWAIT_SHIP_B | In(sessionState) == SessionState.TRANSFERRING_B |
              In(sessionState) == SessionState.AWAIT_WAREHOUSE_B) implies
              (prior_session_view.correlation == Correlation.B)) &
            ((coordination_frame.inhibitOrdinary == OrdinaryInhibition.INHIBITED) implies
              (sessionState == In(sessionState))) &
            ((coordination_frame.inhibitOrdinary == OrdinaryInhibition.OPEN &
              admission_decision.disposition == RequestDisposition.CANCEL_ACCEPTED) implies
              (sessionState == SessionState.IDLE)) &
            ((coordination_frame.inhibitOrdinary == OrdinaryInhibition.OPEN &
              admission_decision.disposition == RequestDisposition.ACCEPTED &
              admission_decision.correlation == Correlation.A) implies
              (sessionState == SessionState.AWAIT_SHIP_A)) &
            ((coordination_frame.inhibitOrdinary == OrdinaryInhibition.OPEN &
              admission_decision.disposition == RequestDisposition.ACCEPTED &
              admission_decision.correlation == Correlation.B) implies
              (sessionState == SessionState.AWAIT_SHIP_B)) &
            ((coordination_frame.inhibitOrdinary == OrdinaryInhibition.OPEN &
              admission_decision.disposition != RequestDisposition.CANCEL_ACCEPTED &
              admission_decision.disposition != RequestDisposition.ACCEPTED &
              (coordination_frame.progress == ProgressClass.SHIP_ACCEPTED |
               coordination_frame.progress == ProgressClass.SHIP_MOVING) &
              coordination_frame.correlation == Correlation.A) implies
              (sessionState == SessionState.TRANSFERRING_A)) &
            ((coordination_frame.inhibitOrdinary == OrdinaryInhibition.OPEN &
              admission_decision.disposition != RequestDisposition.CANCEL_ACCEPTED &
              admission_decision.disposition != RequestDisposition.ACCEPTED &
              (coordination_frame.progress == ProgressClass.SHIP_ACCEPTED |
               coordination_frame.progress == ProgressClass.SHIP_MOVING) &
              coordination_frame.correlation == Correlation.B) implies
              (sessionState == SessionState.TRANSFERRING_B)) &
            ((coordination_frame.inhibitOrdinary == OrdinaryInhibition.OPEN &
              admission_decision.disposition != RequestDisposition.CANCEL_ACCEPTED &
              admission_decision.disposition != RequestDisposition.ACCEPTED &
              coordination_frame.progress == ProgressClass.SHIP_COMPLETE &
              coordination_frame.correlation == Correlation.A) implies
              (sessionState == SessionState.AWAIT_WAREHOUSE_A)) &
            ((coordination_frame.inhibitOrdinary == OrdinaryInhibition.OPEN &
              admission_decision.disposition != RequestDisposition.CANCEL_ACCEPTED &
              admission_decision.disposition != RequestDisposition.ACCEPTED &
              coordination_frame.progress == ProgressClass.SHIP_COMPLETE &
              coordination_frame.correlation == Correlation.B) implies
              (sessionState == SessionState.AWAIT_WAREHOUSE_B)) &
            ((coordination_frame.inhibitOrdinary == OrdinaryInhibition.OPEN &
              admission_decision.disposition != RequestDisposition.CANCEL_ACCEPTED &
              admission_decision.disposition != RequestDisposition.ACCEPTED &
              coordination_frame.progress == ProgressClass.WAREHOUSE_STORED) implies
              (sessionState == SessionState.IDLE)) &
            ((coordination_frame.inhibitOrdinary == OrdinaryInhibition.OPEN &
              admission_decision.disposition != RequestDisposition.CANCEL_ACCEPTED &
              admission_decision.disposition != RequestDisposition.ACCEPTED &
              coordination_frame.progress != ProgressClass.SHIP_ACCEPTED &
              coordination_frame.progress != ProgressClass.SHIP_MOVING &
              coordination_frame.progress != ProgressClass.SHIP_COMPLETE &
              coordination_frame.progress != ProgressClass.WAREHOUSE_STORED) implies
              (sessionState == In(sessionState)));
    }*/
  }
  // @trace PART-08
  part def ShipEvidenceLifecycle :> Thread {
    // @trace INT-21
    port ship_update : DataPort { in :>> type : ShipUpdate; }
    // @trace INT-34
    port admission_decision : DataPort { in :>> type : AdmissionDecision; }
    // @trace INT-14
    port prior_ship_evidence : DataPort { out :>> type : ShipEvidenceState; }

    language "GUMBO" /*{
      state
        // @trace PART-08
        shipEvidenceState : ShipEvidenceState;
      initialize
        guarantee
          // @trace ASM-INIT-01
          INIT_SHIP_EVIDENCE "Ship evidence initializes clear":
            shipEvidenceState == ShipEvidenceState.CLEAR & prior_ship_evidence == ShipEvidenceState.CLEAR;
      compute
        guarantee
          // @trace CASE-25
          CASE_25_SHIP_EVIDENCE_TRANSITION "Ship evidence applies direct admission after freeze and before qualified progress":
            prior_ship_evidence == In(shipEvidenceState) &
            ((ship_update == ShipUpdate.FREEZE) implies (shipEvidenceState == In(shipEvidenceState))) &
            ((ship_update != ShipUpdate.FREEZE &
              (admission_decision.disposition == RequestDisposition.CANCEL_ACCEPTED |
               admission_decision.disposition == RequestDisposition.ACCEPTED)) implies
              (shipEvidenceState == ShipEvidenceState.CLEAR)) &
            ((ship_update != ShipUpdate.FREEZE &
              admission_decision.disposition != RequestDisposition.CANCEL_ACCEPTED &
              admission_decision.disposition != RequestDisposition.ACCEPTED &
              ship_update == ShipUpdate.ACKNOWLEDGE) implies
              (shipEvidenceState == ShipEvidenceState.ACKNOWLEDGED)) &
            ((ship_update != ShipUpdate.FREEZE &
              admission_decision.disposition != RequestDisposition.CANCEL_ACCEPTED &
              admission_decision.disposition != RequestDisposition.ACCEPTED &
              ship_update == ShipUpdate.MARK_MOVING) implies
              (shipEvidenceState == ShipEvidenceState.MOVING)) &
            ((ship_update != ShipUpdate.FREEZE &
              admission_decision.disposition != RequestDisposition.CANCEL_ACCEPTED &
              admission_decision.disposition != RequestDisposition.ACCEPTED &
              ship_update == ShipUpdate.MARK_COMPLETE) implies
              (shipEvidenceState == ShipEvidenceState.COMPLETE)) &
            ((ship_update != ShipUpdate.FREEZE &
              admission_decision.disposition != RequestDisposition.CANCEL_ACCEPTED &
              admission_decision.disposition != RequestDisposition.ACCEPTED &
              ship_update == ShipUpdate.CLEAR) implies
              (shipEvidenceState == ShipEvidenceState.CLEAR)) &
            ((ship_update == ShipUpdate.RETAIN &
              admission_decision.disposition != RequestDisposition.CANCEL_ACCEPTED &
              admission_decision.disposition != RequestDisposition.ACCEPTED) implies
              (shipEvidenceState == In(shipEvidenceState)));
    }*/
  }
  // @trace PART-09
  part def WarehouseEvidenceLifecycle :> Thread {
    // @trace INT-22
    port warehouse_update : DataPort { in :>> type : WarehouseUpdate; }
    // @trace INT-35
    port admission_decision : DataPort { in :>> type : AdmissionDecision; }
    // @trace INT-15
    port prior_warehouse_evidence : DataPort { out :>> type : WarehouseEvidenceState; }

    language "GUMBO" /*{
      state
        // @trace PART-09
        warehouseEvidenceState : WarehouseEvidenceState;
      initialize
        guarantee
          // @trace ASM-INIT-01
          INIT_WAREHOUSE_EVIDENCE "Warehouse evidence initializes clear":
            warehouseEvidenceState == WarehouseEvidenceState.CLEAR &
            prior_warehouse_evidence == WarehouseEvidenceState.CLEAR;
      compute
        guarantee
          // @trace CASE-25
          CASE_25_WAREHOUSE_EVIDENCE_TRANSITION "Warehouse evidence applies direct admission after freeze and before qualified progress":
            prior_warehouse_evidence == In(warehouseEvidenceState) &
            ((warehouse_update == WarehouseUpdate.FREEZE) implies
              (warehouseEvidenceState == In(warehouseEvidenceState))) &
            ((warehouse_update != WarehouseUpdate.FREEZE &
              (admission_decision.disposition == RequestDisposition.CANCEL_ACCEPTED |
               admission_decision.disposition == RequestDisposition.ACCEPTED)) implies
              (warehouseEvidenceState == WarehouseEvidenceState.CLEAR)) &
            ((warehouse_update != WarehouseUpdate.FREEZE &
              admission_decision.disposition != RequestDisposition.CANCEL_ACCEPTED &
              admission_decision.disposition != RequestDisposition.ACCEPTED &
              warehouse_update == WarehouseUpdate.MARK_PENDING) implies
              (warehouseEvidenceState == WarehouseEvidenceState.PENDING)) &
            ((warehouse_update != WarehouseUpdate.FREEZE &
              admission_decision.disposition != RequestDisposition.CANCEL_ACCEPTED &
              admission_decision.disposition != RequestDisposition.ACCEPTED &
              warehouse_update == WarehouseUpdate.CLEAR) implies
              (warehouseEvidenceState == WarehouseEvidenceState.CLEAR)) &
            ((warehouse_update == WarehouseUpdate.RETAIN &
              admission_decision.disposition != RequestDisposition.CANCEL_ACCEPTED &
              admission_decision.disposition != RequestDisposition.ACCEPTED) implies
              (warehouseEvidenceState == In(warehouseEvidenceState)));
    }*/
  }
  // @trace PART-10
  part def RecoverySupervisor :> Thread {
    // @trace INT-16
    port recovery_transition : DataPort { in :>> type : RecoveryTransition; }
    // @trace INT-12
    port prior_recovery_state : DataPort { out :>> type : RecoveryState; }

    language "GUMBO" /*{
      state
        // @trace PART-10
        recoveryState : RecoveryState;
      initialize
        guarantee
          // @trace ASM-INIT-01
          INIT_RECOVERY "Recovery initializes healthy":
            recoveryState == RecoveryState.HEALTHY & prior_recovery_state == RecoveryState.HEALTHY;
      compute
        guarantee
          // @trace CASE-22
          CASE_22_RECOVERY_TRANSITION "Only latch, reset, and later verification change recovery state":
            prior_recovery_state == In(recoveryState) &
            ((recovery_transition.faultTrigger == FaultTrigger.TRIGGERED |
              recovery_transition.recoveryIntent == RecoveryIntent.LATCH) implies
              (recoveryState == RecoveryState.LATCHED)) &
            ((recovery_transition.faultTrigger == FaultTrigger.CLEAR &
              recovery_transition.recoveryIntent == RecoveryIntent.BEGIN_RECOVERY &
              In(recoveryState) == RecoveryState.LATCHED) implies
              (recoveryState == RecoveryState.RECOVERING)) &
            ((recovery_transition.faultTrigger == FaultTrigger.CLEAR &
              recovery_transition.recoveryIntent == RecoveryIntent.OPEN_RECOVERY &
              In(recoveryState) == RecoveryState.RECOVERING) implies
              (recoveryState == RecoveryState.HEALTHY)) &
            ((recovery_transition.faultTrigger == FaultTrigger.CLEAR &
              not ((recovery_transition.recoveryIntent == RecoveryIntent.BEGIN_RECOVERY &
                 In(recoveryState) == RecoveryState.LATCHED) |
                (recovery_transition.recoveryIntent == RecoveryIntent.OPEN_RECOVERY &
                 In(recoveryState) == RecoveryState.RECOVERING))) implies
              (recoveryState == In(recoveryState)));
    }*/
  }
  // @trace PART-11
  part def RequestActionEligibility :> Thread {
    // @trace INT-19
    port admission_decision : DataPort { in :>> type : AdmissionDecision; }
    // @trace INT-28
    port request_proposal : DataPort { out :>> type : ActionProposal; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace ASM-INIT-01
          INIT_REQUEST_PROPOSAL "Request eligibility initializes with no proposal":
            request_proposal.kind == ProposalKind.NONE & request_proposal.actionValue == TransferAction.HOLD &
            request_proposal.correlation == Correlation.NONE;
      compute
        guarantee
          // @trace CASE-26
          CASE_26_REQUEST_PROPOSAL "Admission alone determines start, cancellation, or no request proposal":
            ((admission_decision.disposition == RequestDisposition.ACCEPTED) implies
              (request_proposal.kind == ProposalKind.START &
               request_proposal.actionValue == TransferAction.BEGIN_TRANSFER &
               request_proposal.correlation == admission_decision.correlation)) &
            ((admission_decision.disposition == RequestDisposition.CANCEL_ACCEPTED) implies
              (request_proposal.kind == ProposalKind.CANCEL &
               request_proposal.actionValue == TransferAction.CANCEL_TRANSFER &
               request_proposal.correlation == admission_decision.correlation)) &
            ((admission_decision.disposition != RequestDisposition.ACCEPTED &
              admission_decision.disposition != RequestDisposition.CANCEL_ACCEPTED) implies
              (request_proposal.kind == ProposalKind.NONE &
               request_proposal.actionValue == TransferAction.HOLD &
               request_proposal.correlation == Correlation.NONE));
    }*/
  }
  // @trace PART-12
  part def ShipProgressEligibility :> Thread {
    // @trace INT-23
    port prior_session_view : DataPort { in :>> type : SessionView; }
    // @trace INT-24
    port prior_ship_evidence : DataPort { in :>> type : ShipEvidenceState; }
    // @trace INT-29
    port ship_proposal : DataPort { out :>> type : ActionProposal; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace ASM-INIT-01
          INIT_SHIP_PROPOSAL "Ship eligibility initializes with no proposal":
            ship_proposal.kind == ProposalKind.NONE & ship_proposal.actionValue == TransferAction.HOLD &
            ship_proposal.correlation == Correlation.NONE;
      compute
        guarantee
          // @trace CASE-26
          CASE_26_SHIP_PROPOSAL "Only an active phase-consistent ship state proposes continuation":
            ((((prior_session_view.session == SessionState.AWAIT_SHIP_A |
                prior_session_view.session == SessionState.AWAIT_SHIP_B) &
               (prior_ship_evidence == ShipEvidenceState.CLEAR |
                prior_ship_evidence == ShipEvidenceState.ACKNOWLEDGED)) |
              ((prior_session_view.session == SessionState.TRANSFERRING_A |
                prior_session_view.session == SessionState.TRANSFERRING_B) &
               (prior_ship_evidence == ShipEvidenceState.ACKNOWLEDGED |
                prior_ship_evidence == ShipEvidenceState.MOVING))) implies
              (ship_proposal.kind == ProposalKind.SHIP_PROGRESS &
               ship_proposal.actionValue == TransferAction.CONTINUE_TRANSFER &
               ship_proposal.correlation == prior_session_view.correlation)) &
            ((not (((prior_session_view.session == SessionState.AWAIT_SHIP_A |
                 prior_session_view.session == SessionState.AWAIT_SHIP_B) &
                (prior_ship_evidence == ShipEvidenceState.CLEAR |
                 prior_ship_evidence == ShipEvidenceState.ACKNOWLEDGED)) |
               ((prior_session_view.session == SessionState.TRANSFERRING_A |
                 prior_session_view.session == SessionState.TRANSFERRING_B) &
                (prior_ship_evidence == ShipEvidenceState.ACKNOWLEDGED |
                 prior_ship_evidence == ShipEvidenceState.MOVING))) implies
              (ship_proposal.kind == ProposalKind.NONE &
               ship_proposal.actionValue == TransferAction.HOLD &
               ship_proposal.correlation == Correlation.NONE)));
    }*/
  }
  // @trace PART-13
  part def WarehouseVerificationEligibility :> Thread {
    // @trace INT-25
    port prior_session_view : DataPort { in :>> type : SessionView; }
    // @trace INT-26
    port prior_ship_evidence : DataPort { in :>> type : ShipEvidenceState; }
    // @trace INT-27
    port prior_warehouse_evidence : DataPort { in :>> type : WarehouseEvidenceState; }
    // @trace INT-30
    port warehouse_proposal : DataPort { out :>> type : ActionProposal; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace ASM-INIT-01
          INIT_WAREHOUSE_PROPOSAL "Warehouse eligibility initializes with no proposal":
            warehouse_proposal.kind == ProposalKind.NONE &
            warehouse_proposal.actionValue == TransferAction.HOLD &
            warehouse_proposal.correlation == Correlation.NONE;
      compute
        guarantee
          // @trace CASE-26
          CASE_26_WAREHOUSE_PROPOSAL "Only complete ship evidence in the warehouse phase proposes verification":
            (((prior_session_view.session == SessionState.AWAIT_WAREHOUSE_A |
               prior_session_view.session == SessionState.AWAIT_WAREHOUSE_B) &
              prior_ship_evidence == ShipEvidenceState.COMPLETE &
              (prior_warehouse_evidence == WarehouseEvidenceState.CLEAR |
               prior_warehouse_evidence == WarehouseEvidenceState.PENDING)) implies
              (warehouse_proposal.kind == ProposalKind.WAREHOUSE_VERIFY &
               warehouse_proposal.actionValue == TransferAction.REQUEST_WAREHOUSE_VERIFY &
               warehouse_proposal.correlation == prior_session_view.correlation)) &
            ((not ((prior_session_view.session == SessionState.AWAIT_WAREHOUSE_A |
                prior_session_view.session == SessionState.AWAIT_WAREHOUSE_B) &
               prior_ship_evidence == ShipEvidenceState.COMPLETE &
               (prior_warehouse_evidence == WarehouseEvidenceState.CLEAR |
                prior_warehouse_evidence == WarehouseEvidenceState.PENDING)) implies
              (warehouse_proposal.kind == ProposalKind.NONE &
               warehouse_proposal.actionValue == TransferAction.HOLD &
               warehouse_proposal.correlation == Correlation.NONE)));
    }*/
  }
  // @trace PART-14
  part def TransferActionArbitration :> Thread {
    // @trace INT-28
    port request_proposal : DataPort { in :>> type : ActionProposal; }
    // @trace INT-29
    port ship_proposal : DataPort { in :>> type : ActionProposal; }
    // @trace INT-30
    port warehouse_proposal : DataPort { in :>> type : ActionProposal; }
    // @trace INT-31
    port priority_directive : DataPort { in :>> type : PriorityDirective; }
    // @trace INT-32
    port transfer_decision : DataPort { out :>> type : TransferDecision; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace ASM-INIT-01
          INIT_ARBITRATION "Arbitration initializes to the ordinary hold decision":
            transfer_decision.actionValue == TransferAction.HOLD &
            transfer_decision.cause == DecisionCause.NO_ELIGIBLE_ACTION &
            transfer_decision.correlation == Correlation.NONE &
            transfer_decision.outcomeValue == DecisionOutcomeValue.NONE;
      compute
        guarantee
          // @trace CASE-27
          CASE_27_STRICT_PRIORITY "Arbitration consumes directives and proposals in the approved strict order":
            ((priority_directive.kind == PriorityKind.FAULT_OR_RECOVERY) implies
              (transfer_decision.actionValue == TransferAction.HOLD &
               transfer_decision.cause == DecisionCause.FAULT_OR_RECOVERY &
               transfer_decision.correlation == priority_directive.correlation &
               transfer_decision.outcomeValue == DecisionOutcomeValue.RECOVERY_REQUIRED)) &
            ((priority_directive.kind == PriorityKind.COMPLETION) implies
              (transfer_decision.actionValue == TransferAction.HOLD &
               transfer_decision.cause == DecisionCause.WAREHOUSE_CONFIRMATION &
               transfer_decision.correlation == priority_directive.correlation &
               transfer_decision.outcomeValue == DecisionOutcomeValue.COMPLETED)) &
            ((priority_directive.kind == PriorityKind.ORDINARY &
              request_proposal.kind == ProposalKind.CANCEL) implies
              (transfer_decision.actionValue == TransferAction.CANCEL_TRANSFER &
               transfer_decision.cause == DecisionCause.CANCEL_REQUEST &
               transfer_decision.correlation == request_proposal.correlation &
               transfer_decision.outcomeValue == DecisionOutcomeValue.CANCELLED)) &
            ((priority_directive.kind == PriorityKind.ORDINARY &
              request_proposal.kind != ProposalKind.CANCEL &
              warehouse_proposal.kind == ProposalKind.WAREHOUSE_VERIFY) implies
              (transfer_decision.actionValue == TransferAction.REQUEST_WAREHOUSE_VERIFY &
               transfer_decision.cause == DecisionCause.WAREHOUSE_CONFIRMATION &
               transfer_decision.correlation == warehouse_proposal.correlation &
               transfer_decision.outcomeValue == DecisionOutcomeValue.ACTIVE)) &
            ((priority_directive.kind == PriorityKind.ORDINARY &
              request_proposal.kind != ProposalKind.CANCEL &
              warehouse_proposal.kind != ProposalKind.WAREHOUSE_VERIFY &
              ship_proposal.kind == ProposalKind.SHIP_PROGRESS) implies
              (transfer_decision.actionValue == TransferAction.CONTINUE_TRANSFER &
               transfer_decision.cause == DecisionCause.SHIP_PROGRESS &
               transfer_decision.correlation == ship_proposal.correlation &
               transfer_decision.outcomeValue == DecisionOutcomeValue.ACTIVE)) &
            ((priority_directive.kind == PriorityKind.ORDINARY &
              request_proposal.kind != ProposalKind.CANCEL &
              warehouse_proposal.kind != ProposalKind.WAREHOUSE_VERIFY &
              ship_proposal.kind != ProposalKind.SHIP_PROGRESS &
              request_proposal.kind == ProposalKind.START) implies
              (transfer_decision.actionValue == TransferAction.BEGIN_TRANSFER &
               transfer_decision.cause == DecisionCause.NEW_TRANSFER &
               transfer_decision.correlation == request_proposal.correlation &
               transfer_decision.outcomeValue == DecisionOutcomeValue.ACTIVE)) &
            ((priority_directive.kind == PriorityKind.ORDINARY &
              request_proposal.kind != ProposalKind.CANCEL &
              warehouse_proposal.kind != ProposalKind.WAREHOUSE_VERIFY &
              ship_proposal.kind != ProposalKind.SHIP_PROGRESS &
              request_proposal.kind != ProposalKind.START) implies
              (transfer_decision.actionValue == TransferAction.HOLD &
               transfer_decision.cause == DecisionCause.NO_ELIGIBLE_ACTION &
               transfer_decision.correlation == Correlation.NONE &
               transfer_decision.outcomeValue == DecisionOutcomeValue.NONE));
    }*/
  }
  // @trace PART-15
  part def ResultComposition :> Thread {
    // @trace INT-32
    port transfer_decision : DataPort { in :>> type : TransferDecision; }
    // @trace INT-33
    port request_disposition : DataPort { in :>> type : RequestDisposition; }
    // @trace INT-06
    port transfer_result : DataPort { out :>> type : TransferCoordinationResult; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace ASM-INIT-01
          INIT_PUBLIC_RESULT "The public result initializes to the complete safe hold tuple":
            transfer_result.actionValue == TransferAction.HOLD &
            transfer_result.cause == DecisionCause.NO_ELIGIBLE_ACTION &
            transfer_result.mode == CoordinationMode.HOLDING &
            transfer_result.correlation == Correlation.NONE &
            transfer_result.requestDisposition == PublicRequestDisposition.NO_REQUEST &
            transfer_result.outcomeValue == PublicTransferOutcome.NONE;
      compute
        guarantee
          // @trace CASE-28
          CASE_28_ATOMIC_COMPOSITION "Composition consumes only the selected decision and independent disposition":
            transfer_result.actionValue == transfer_decision.actionValue &
            transfer_result.cause == transfer_decision.cause &
            transfer_result.correlation == transfer_decision.correlation &
            ((request_disposition == RequestDisposition.NO_REQUEST) implies
              (transfer_result.requestDisposition == PublicRequestDisposition.NO_REQUEST)) &
            ((request_disposition == RequestDisposition.ACCEPTED) implies
              (transfer_result.requestDisposition == PublicRequestDisposition.ACCEPTED)) &
            ((request_disposition == RequestDisposition.DUPLICATE) implies
              (transfer_result.requestDisposition == PublicRequestDisposition.DUPLICATE)) &
            ((request_disposition == RequestDisposition.REJECTED) implies
              (transfer_result.requestDisposition == PublicRequestDisposition.REJECTED)) &
            ((request_disposition == RequestDisposition.DEFERRED) implies
              (transfer_result.requestDisposition == PublicRequestDisposition.DEFERRED)) &
            ((request_disposition == RequestDisposition.CANCEL_ACCEPTED) implies
              (transfer_result.requestDisposition == PublicRequestDisposition.CANCEL_ACCEPTED)) &
            ((transfer_decision.outcomeValue == DecisionOutcomeValue.NONE) implies
              (transfer_result.outcomeValue == PublicTransferOutcome.NONE)) &
            ((transfer_decision.outcomeValue == DecisionOutcomeValue.ACTIVE) implies
              (transfer_result.outcomeValue == PublicTransferOutcome.ACTIVE)) &
            ((transfer_decision.outcomeValue == DecisionOutcomeValue.COMPLETED) implies
              (transfer_result.outcomeValue == PublicTransferOutcome.COMPLETED)) &
            ((transfer_decision.outcomeValue == DecisionOutcomeValue.CANCELLED) implies
              (transfer_result.outcomeValue == PublicTransferOutcome.CANCELLED)) &
            ((transfer_decision.outcomeValue == DecisionOutcomeValue.RECOVERY_REQUIRED) implies
              (transfer_result.outcomeValue == PublicTransferOutcome.RECOVERY_REQUIRED)) &
            ((transfer_decision.cause == DecisionCause.FAULT_OR_RECOVERY) implies
              (transfer_result.mode == CoordinationMode.FAULT)) &
            ((transfer_decision.cause != DecisionCause.FAULT_OR_RECOVERY &
              transfer_decision.actionValue == TransferAction.HOLD) implies
              (transfer_result.mode == CoordinationMode.HOLDING)) &
            ((transfer_decision.actionValue == TransferAction.BEGIN_TRANSFER |
              transfer_decision.actionValue == TransferAction.CONTINUE_TRANSFER |
              transfer_decision.actionValue == TransferAction.CANCEL_TRANSFER) implies
              (transfer_result.mode == CoordinationMode.COMMANDING_SHIP)) &
            ((transfer_decision.actionValue == TransferAction.REQUEST_WAREHOUSE_VERIFY) implies
              (transfer_result.mode == CoordinationMode.VERIFYING_WAREHOUSE));
    }*/
  }

  // @trace SUPPORT-01
  part def CargoCoordinationProcess :> Process {
    // @generated-support root delegation endpoint for MON-REQ-01
    port transferRequest : DataPort { in :>> type : TransferRequest; }
    // @generated-support root delegation endpoint for MON-DOCK-01
    port dockContext : DataPort { in :>> type : DockContext; }
    // @generated-support root delegation endpoint for MON-SHIP-01
    port shipReport : DataPort { in :>> type : ShipReport; }
    // @generated-support root delegation endpoint for MON-WARE-01
    port warehouseReport : DataPort { in :>> type : WarehouseReport; }
    // @generated-support root delegation endpoint for MON-CTRL-01
    port controlEvent : DataPort { in :>> type : ControlEvent; }
    // @generated-support root delegation endpoint for CTRL-RES-01
    port transferResult : DataPort { out :>> type : TransferCoordinationResult; }

    // @trace PART-01
    part request_acquisition : RequestAcquisition;
    // @trace PART-02
    part dock_context_assessment : DockContextAssessment;
    // @trace PART-03
    part ship_report_acquisition : ShipReportAcquisition;
    // @trace PART-04
    part warehouse_report_acquisition : WarehouseReportAcquisition;
    // @trace PART-05
    part request_admission : RequestAdmission;
    // @trace PART-06
    part evidence_coherence : EvidenceCoherence;
    // @trace PART-07
    part transfer_session : TransferSession;
    // @trace PART-08
    part ship_evidence_lifecycle : ShipEvidenceLifecycle;
    // @trace PART-09
    part warehouse_evidence_lifecycle : WarehouseEvidenceLifecycle;
    // @trace PART-10
    part recovery_supervisor : RecoverySupervisor;
    // @trace PART-11
    part request_action_eligibility : RequestActionEligibility;
    // @trace PART-12
    part ship_progress_eligibility : ShipProgressEligibility;
    // @trace PART-13
    part warehouse_verification_eligibility : WarehouseVerificationEligibility;
    // @trace PART-14
    part transfer_action_arbitration : TransferActionArbitration;
    // @trace PART-15
    part result_composition : ResultComposition;

    // @trace INT-01
    connection int01 : PortConnection connect transferRequest to request_acquisition.transfer_request;
    // @trace INT-02
    connection int02 : PortConnection connect dockContext to dock_context_assessment.dock_context;
    // @trace INT-03
    connection int03 : PortConnection connect shipReport to ship_report_acquisition.ship_report;
    // @trace INT-04
    connection int04 : PortConnection connect warehouseReport to warehouse_report_acquisition.warehouse_report;
    // @trace INT-05
    connection int05 : PortConnection connect controlEvent to evidence_coherence.control_event;
    // @trace INT-06
    connection int06 : PortConnection connect result_composition.transfer_result to transferResult;
    // @trace INT-07
    connection int07 : PortConnection connect request_acquisition.request_facts to request_admission.request_facts;
    // @trace INT-08
    connection int08 : PortConnection connect dock_context_assessment.dock_facts to request_admission.dock_facts;
    // @trace INT-09
    connection int09 : PortConnection connect ship_report_acquisition.ship_report_facts to evidence_coherence.ship_report_facts;
    // @trace INT-10
    connection int10 : PortConnection connect warehouse_report_acquisition.warehouse_report_facts to evidence_coherence.warehouse_report_facts;
    // @trace INT-11
    connection int11 : PortConnection connect transfer_session.prior_session_view to request_admission.prior_session_view;
    // @trace INT-12
    connection int12 : PortConnection connect recovery_supervisor.prior_recovery_state to evidence_coherence.prior_recovery_state;
    // @trace INT-13
    connection int13 : PortConnection connect transfer_session.prior_session_view to evidence_coherence.prior_session_view;
    // @trace INT-14
    connection int14 : PortConnection connect ship_evidence_lifecycle.prior_ship_evidence to evidence_coherence.prior_ship_evidence;
    // @trace INT-15
    connection int15 : PortConnection connect warehouse_evidence_lifecycle.prior_warehouse_evidence to evidence_coherence.prior_warehouse_evidence;
    // @trace INT-16
    connection int16 : PortConnection connect evidence_coherence.recovery_transition to recovery_supervisor.recovery_transition;
    // @trace INT-17
    connection int17 : PortConnection connect evidence_coherence.coordination_guard to request_admission.coordination_guard;
    // @trace INT-18
    connection int18 : PortConnection connect request_admission.admission_decision to transfer_session.admission_decision;
    // @trace INT-19
    connection int19 : PortConnection connect request_admission.admission_decision to request_action_eligibility.admission_decision;
    // @trace INT-20
    connection int20 : PortConnection connect evidence_coherence.coordination_frame to transfer_session.coordination_frame;
    // @trace INT-21
    connection int21 : PortConnection connect evidence_coherence.ship_update to ship_evidence_lifecycle.ship_update;
    // @trace INT-22
    connection int22 : PortConnection connect evidence_coherence.warehouse_update to warehouse_evidence_lifecycle.warehouse_update;
    // @trace INT-23
    connection int23 : PortConnection connect transfer_session.prior_session_view to ship_progress_eligibility.prior_session_view;
    // @trace INT-24
    connection int24 : PortConnection connect ship_evidence_lifecycle.prior_ship_evidence to ship_progress_eligibility.prior_ship_evidence;
    // @trace INT-25
    connection int25 : PortConnection connect transfer_session.prior_session_view to warehouse_verification_eligibility.prior_session_view;
    // @trace INT-26
    connection int26 : PortConnection connect ship_evidence_lifecycle.prior_ship_evidence to warehouse_verification_eligibility.prior_ship_evidence;
    // @trace INT-27
    connection int27 : PortConnection connect warehouse_evidence_lifecycle.prior_warehouse_evidence to warehouse_verification_eligibility.prior_warehouse_evidence;
    // @trace INT-28
    connection int28 : PortConnection connect request_action_eligibility.request_proposal to transfer_action_arbitration.request_proposal;
    // @trace INT-29
    connection int29 : PortConnection connect ship_progress_eligibility.ship_proposal to transfer_action_arbitration.ship_proposal;
    // @trace INT-30
    connection int30 : PortConnection connect warehouse_verification_eligibility.warehouse_proposal to transfer_action_arbitration.warehouse_proposal;
    // @trace INT-31
    connection int31 : PortConnection connect evidence_coherence.priority_directive to transfer_action_arbitration.priority_directive;
    // @trace INT-32
    connection int32 : PortConnection connect transfer_action_arbitration.transfer_decision to result_composition.transfer_decision;
    // @trace INT-33
    connection int33 : PortConnection connect request_admission.request_disposition to result_composition.request_disposition;
    // @trace INT-34
    connection int34 : PortConnection connect request_admission.admission_decision to ship_evidence_lifecycle.admission_decision;
    // @trace INT-35
    connection int35 : PortConnection connect request_admission.admission_decision to warehouse_evidence_lifecycle.admission_decision;
  }

  // @trace CTX-SYS-01
  part def StationCargoTransferEvidenceCoordinator :> System {
    // @trace MON-REQ-01
    port transferRequest : DataPort { in :>> type : TransferRequest; }
    // @trace MON-DOCK-01
    port dockContext : DataPort { in :>> type : DockContext; }
    // @trace MON-SHIP-01
    port shipReport : DataPort { in :>> type : ShipReport; }
    // @trace MON-WARE-01
    port warehouseReport : DataPort { in :>> type : WarehouseReport; }
    // @trace MON-CTRL-01
    port controlEvent : DataPort { in :>> type : ControlEvent; }
    // @trace CTRL-RES-01
    port transferResult : DataPort { out :>> type : TransferCoordinationResult; }

    // @generated-support behavior-free containment usage required by SUPPORT-01
    part cargo_coordination_process : CargoCoordinationProcess;
    // @generated-support transparent delegation for INT-01 boundary value
    connection supportTransferRequest : PortConnection connect transferRequest to cargo_coordination_process.transferRequest;
    // @generated-support transparent delegation for INT-02 boundary value
    connection supportDockContext : PortConnection connect dockContext to cargo_coordination_process.dockContext;
    // @generated-support transparent delegation for INT-03 boundary value
    connection supportShipReport : PortConnection connect shipReport to cargo_coordination_process.shipReport;
    // @generated-support transparent delegation for INT-04 boundary value
    connection supportWarehouseReport : PortConnection connect warehouseReport to cargo_coordination_process.warehouseReport;
    // @generated-support transparent delegation for INT-05 boundary value
    connection supportControlEvent : PortConnection connect controlEvent to cargo_coordination_process.controlEvent;
    // @generated-support transparent delegation for INT-06 boundary value
    connection supportTransferResult : PortConnection connect cargo_coordination_process.transferResult to transferResult;
  }

  // @trace CTX-SYS-01
  part station_cargo_transfer_evidence_coordinator : StationCargoTransferEvidenceCoordinator;
}
