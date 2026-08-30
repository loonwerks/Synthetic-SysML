package Mining_Cargo_Transfer_Supervisor {

  private import HAMR::*;

  // @trace MON-01
  enum def OffloadRequestEvent { enum NoRequest; enum OffloadRequested; }
  // @trace MON-01
  enum def InputStatus { enum Valid; enum Invalid; }
  // @trace MON-02
  enum def DockingObservation { enum NotDocked; enum Docked; }
  // @trace MON-03
  enum def ShipTransferProgress { enum Idle; enum InProgress; enum Complete; enum Failed; }
  // @trace MON-04
  enum def WarehouseReceiptEvidence { enum NoReceipt; enum ReceiptConfirmed; enum ReceiptRejected; }

  // @trace PART-01
  enum def QualifiedRequest { enum InvalidRequest; enum NoQualifiedRequest; enum QualifiedOffloadRequest; }
  // @trace PART-02
  enum def DockingAssessment { enum InvalidDocking; enum NotDockedAssessment; enum DockedAssessment; }
  // @trace PART-03
  enum def QualifiedShipProgress {
    enum InvalidShipProgress; enum ShipIdle; enum ShipInProgress; enum ShipComplete; enum ShipFailed;
  }
  // @trace PART-04
  enum def QualifiedWarehouseEvidence {
    enum InvalidWarehouseEvidence; enum NoQualifiedReceipt;
    enum QualifiedReceiptConfirmed; enum QualifiedReceiptRejected;
  }
  // @trace STATE-01
  enum def TransferPhase { enum Idle; enum TransferOutstanding; enum AwaitingReceipt; }
  // @trace RESOLUTION-01
  enum def TransferDisposition {
    enum InputFault; enum RearmBlocked; enum RearmCleared; enum ActiveEvidenceFault;
    enum UnexpectedIdleEvidence; enum BeginAccepted; enum BeginDenied; enum VerifiedImmediate;
    enum ReceiptPending; enum VerifiedDelayed; enum ActiveHolding; enum IdleHolding;
  }
  // @trace CTRL-01
  enum def CargoTransferCommand { enum Hold; enum BeginOffload; }
  // @trace CTRL-02
  enum def TransferSupervisorStatus {
    enum Ready; enum NotDocked; enum TransferStarted; enum TransferActive;
    enum AwaitingReceipt; enum TransferVerified; enum EvidenceFault;
    enum UnexpectedEvidence; enum InputFault; enum AwaitingNeutral;
  }
  // @trace CTRL-03
  enum def TransferVerificationFinding { enum NotEstablished; enum Verified; enum Rejected; }

  // Every member inspected below is an attribute of its Data record.
  // @trace MON-01
  part def OffloadRequestSample :> Data {
    // @trace MON-01
    attribute requestEvent : OffloadRequestEvent;
    // @trace MON-01
    attribute status : InputStatus;
  }
  // @trace MON-02
  part def DockingSample :> Data {
    // @trace MON-02
    attribute docking : DockingObservation;
    // @trace MON-02
    attribute status : InputStatus;
  }
  // @trace MON-03
  part def ShipTransferSample :> Data {
    // @trace MON-03
    attribute progress : ShipTransferProgress;
    // @trace MON-03
    attribute status : InputStatus;
  }
  // @trace MON-04
  part def WarehouseReceiptSample :> Data {
    // @trace MON-04
    attribute receipt : WarehouseReceiptEvidence;
    // @trace MON-04
    attribute status : InputStatus;
  }
  // @trace RESOLUTION-01
  part def TransferResolution :> Data {
    // @trace STATE-01
    attribute nextPhase : TransferPhase;
    // @trace STATE-01
    attribute nextRearmRequired : Base_Types::Boolean;
    // @trace RESOLUTION-01
    attribute disposition : TransferDisposition;
  }

  // @trace PART-01
  part def RequestQualification :> Thread {
    // @trace INT-01
    port requestSample : DataPort { in :>> type : OffloadRequestSample; }
    // @trace INT-02
    port qualifiedRequest : DataPort { out :>> type : QualifiedRequest; }

    language "GUMBO" /*{
      functions
        // @trace QUAL-REQ-01
        def qualifyRequest(sample: OffloadRequestSample): QualifiedRequest :=
          if (sample.status == InputStatus.Invalid)? QualifiedRequest.InvalidRequest
          else if (sample.requestEvent == OffloadRequestEvent.OffloadRequested)? QualifiedRequest.QualifiedOffloadRequest
          else QualifiedRequest.NoQualifiedRequest;
      initialize
        // @trace INIT-QUAL-REQ-01
        guarantee INIT_REQUEST_QUALIFICATION "Request qualification initializes without an admitted request":
          qualifiedRequest == QualifiedRequest.NoQualifiedRequest;
      compute
        // @trace QUAL-REQ-01
        guarantee QUAL_REQ_TOTAL "Value and validity are classified into the total three-valued request fact":
          qualifiedRequest == qualifyRequest(requestSample);
    }*/
  }

  // @trace PART-02
  part def DockingAssessmentOwner :> Thread {
    // @trace INT-03
    port dockingSample : DataPort { in :>> type : DockingSample; }
    // @trace INT-04
    port dockingAssessment : DataPort { out :>> type : DockingAssessment; }

    language "GUMBO" /*{
      functions
        // @trace QUAL-DOCK-01
        def assessDocking(sample: DockingSample): DockingAssessment :=
          if (sample.status == InputStatus.Invalid)? DockingAssessment.InvalidDocking
          else if (sample.docking == DockingObservation.Docked)? DockingAssessment.DockedAssessment
          else DockingAssessment.NotDockedAssessment;
      initialize
        // @trace INIT-QUAL-DOCK-01
        guarantee INIT_DOCKING_ASSESSMENT "Docking initializes conservatively as invalid":
          dockingAssessment == DockingAssessment.InvalidDocking;
      compute
        // @trace QUAL-DOCK-01
        guarantee QUAL_DOCK_TOTAL "Docking value and validity are classified into a total assessment":
          dockingAssessment == assessDocking(dockingSample);
    }*/
  }

  // @trace PART-03
  part def ShipProgressQualification :> Thread {
    // @trace INT-05
    port shipSample : DataPort { in :>> type : ShipTransferSample; }
    // @trace INT-06
    port qualifiedShipProgress : DataPort { out :>> type : QualifiedShipProgress; }

    language "GUMBO" /*{
      functions
        // @trace QUAL-SHIP-01
        def qualifyShip(sample: ShipTransferSample): QualifiedShipProgress :=
          if (sample.status == InputStatus.Invalid)? QualifiedShipProgress.InvalidShipProgress
          else if (sample.progress == ShipTransferProgress.InProgress)? QualifiedShipProgress.ShipInProgress
          else if (sample.progress == ShipTransferProgress.Complete)? QualifiedShipProgress.ShipComplete
          else if (sample.progress == ShipTransferProgress.Failed)? QualifiedShipProgress.ShipFailed
          else QualifiedShipProgress.ShipIdle;
      initialize
        // @trace INIT-QUAL-SHIP-01
        guarantee INIT_SHIP_QUALIFICATION "Ship progress initializes without active evidence":
          qualifiedShipProgress == QualifiedShipProgress.ShipIdle;
      compute
        // @trace QUAL-SHIP-01
        guarantee QUAL_SHIP_TOTAL "Progress and validity are classified into a total five-valued fact":
          qualifiedShipProgress == qualifyShip(shipSample);
    }*/
  }

  // @trace PART-04
  part def WarehouseEvidenceQualification :> Thread {
    // @trace INT-07
    port warehouseSample : DataPort { in :>> type : WarehouseReceiptSample; }
    // @trace INT-08
    port qualifiedWarehouseEvidence : DataPort { out :>> type : QualifiedWarehouseEvidence; }

    language "GUMBO" /*{
      functions
        // @trace QUAL-WH-01
        def qualifyWarehouse(sample: WarehouseReceiptSample): QualifiedWarehouseEvidence :=
          if (sample.status == InputStatus.Invalid)? QualifiedWarehouseEvidence.InvalidWarehouseEvidence
          else if (sample.receipt == WarehouseReceiptEvidence.ReceiptConfirmed)? QualifiedWarehouseEvidence.QualifiedReceiptConfirmed
          else if (sample.receipt == WarehouseReceiptEvidence.ReceiptRejected)? QualifiedWarehouseEvidence.QualifiedReceiptRejected
          else QualifiedWarehouseEvidence.NoQualifiedReceipt;
      initialize
        // @trace INIT-QUAL-WH-01
        guarantee INIT_WAREHOUSE_QUALIFICATION "Warehouse evidence initializes with no receipt":
          qualifiedWarehouseEvidence == QualifiedWarehouseEvidence.NoQualifiedReceipt;
      compute
        // @trace QUAL-WH-01
        guarantee QUAL_WAREHOUSE_TOTAL "Receipt evidence and validity are classified into a total four-valued fact":
          qualifiedWarehouseEvidence == qualifyWarehouse(warehouseSample);
    }*/
  }

  // @trace PART-05
  part def TransferDecisionOwner :> Thread {
    // @trace INT-02
    port qualifiedRequest : DataPort { in :>> type : QualifiedRequest; }
    // @trace INT-04
    port dockingAssessment : DataPort { in :>> type : DockingAssessment; }
    // @trace INT-06
    port qualifiedShipProgress : DataPort { in :>> type : QualifiedShipProgress; }
    // @trace INT-08
    port qualifiedWarehouseEvidence : DataPort { in :>> type : QualifiedWarehouseEvidence; }
    // @trace INT-09
    port commandResolution : DataPort { out :>> type : TransferResolution; }
    // @trace INT-10
    port reportResolution : DataPort { out :>> type : TransferResolution; }

    language "GUMBO" /*{
      state
        // @trace STATE-01
        transferPhase: TransferPhase;
        // @trace STATE-01
        rearmRequired: Base_Types::Boolean;

      functions
        // @trace PRIORITY-01
        def g01Invalid(request: QualifiedRequest, docking: DockingAssessment,
                       ship: QualifiedShipProgress, warehouse: QualifiedWarehouseEvidence): Base_Types::Boolean :=
          request == QualifiedRequest.InvalidRequest |
          docking == DockingAssessment.InvalidDocking |
          ship == QualifiedShipProgress.InvalidShipProgress |
          warehouse == QualifiedWarehouseEvidence.InvalidWarehouseEvidence;
        // @trace NEUTRAL-01
        def neutral(request: QualifiedRequest, ship: QualifiedShipProgress,
                    warehouse: QualifiedWarehouseEvidence): Base_Types::Boolean :=
          request == QualifiedRequest.NoQualifiedRequest &
          ship == QualifiedShipProgress.ShipIdle &
          warehouse == QualifiedWarehouseEvidence.NoQualifiedReceipt;
        // @trace CASE-02
        def g02RearmBlocked(rearm: Base_Types::Boolean, request: QualifiedRequest,
                           ship: QualifiedShipProgress, warehouse: QualifiedWarehouseEvidence): Base_Types::Boolean :=
          rearm & not neutral(request, ship, warehouse);
        // @trace CASE-03
        def g03RearmCleared(rearm: Base_Types::Boolean, request: QualifiedRequest,
                           docking: DockingAssessment, ship: QualifiedShipProgress,
                           warehouse: QualifiedWarehouseEvidence): Base_Types::Boolean :=
          rearm & not g01Invalid(request, docking, ship, warehouse) & neutral(request, ship, warehouse);
        // @trace CASE-04
        def g04ActiveFault(phase: TransferPhase, docking: DockingAssessment,
                           ship: QualifiedShipProgress, warehouse: QualifiedWarehouseEvidence): Base_Types::Boolean :=
          (phase == TransferPhase.TransferOutstanding | phase == TransferPhase.AwaitingReceipt) &
          (docking == DockingAssessment.NotDockedAssessment |
           ship == QualifiedShipProgress.ShipFailed |
           warehouse == QualifiedWarehouseEvidence.QualifiedReceiptRejected |
           (phase == TransferPhase.TransferOutstanding &
            warehouse == QualifiedWarehouseEvidence.QualifiedReceiptConfirmed &
            ship != QualifiedShipProgress.ShipComplete) |
           (phase == TransferPhase.AwaitingReceipt & ship == QualifiedShipProgress.ShipInProgress));
        // @trace CASE-05
        def g05UnexpectedIdle(phase: TransferPhase, ship: QualifiedShipProgress,
                              warehouse: QualifiedWarehouseEvidence): Base_Types::Boolean :=
          phase == TransferPhase.Idle &
          (ship != QualifiedShipProgress.ShipIdle |
           warehouse != QualifiedWarehouseEvidence.NoQualifiedReceipt);
        // @trace CASE-06
        def g06BeginAccepted(phase: TransferPhase, request: QualifiedRequest,
                             docking: DockingAssessment): Base_Types::Boolean :=
          phase == TransferPhase.Idle & request == QualifiedRequest.QualifiedOffloadRequest &
          docking == DockingAssessment.DockedAssessment;
        // @trace CASE-07
        def g07BeginDenied(phase: TransferPhase, request: QualifiedRequest,
                           docking: DockingAssessment): Base_Types::Boolean :=
          phase == TransferPhase.Idle & request == QualifiedRequest.QualifiedOffloadRequest &
          docking == DockingAssessment.NotDockedAssessment;
        // @trace CASE-08
        def g08VerifiedImmediate(phase: TransferPhase, ship: QualifiedShipProgress,
                                 warehouse: QualifiedWarehouseEvidence): Base_Types::Boolean :=
          phase == TransferPhase.TransferOutstanding & ship == QualifiedShipProgress.ShipComplete &
          warehouse == QualifiedWarehouseEvidence.QualifiedReceiptConfirmed;
        // @trace CASE-09
        def g09ReceiptPending(phase: TransferPhase, ship: QualifiedShipProgress,
                              warehouse: QualifiedWarehouseEvidence): Base_Types::Boolean :=
          phase == TransferPhase.TransferOutstanding & ship == QualifiedShipProgress.ShipComplete &
          warehouse == QualifiedWarehouseEvidence.NoQualifiedReceipt;
        // @trace CASE-10
        def g10VerifiedDelayed(phase: TransferPhase, warehouse: QualifiedWarehouseEvidence): Base_Types::Boolean :=
          phase == TransferPhase.AwaitingReceipt &
          warehouse == QualifiedWarehouseEvidence.QualifiedReceiptConfirmed;
        // @trace CASE-11
        def g11ActiveHolding(phase: TransferPhase): Base_Types::Boolean :=
          phase == TransferPhase.TransferOutstanding | phase == TransferPhase.AwaitingReceipt;

      initialize
        // @trace INIT-01
        guarantee INIT_DECISION_OWNER "State and both approved resolution deliveries initialize safely and equally":
          transferPhase == TransferPhase.Idle & rearmRequired == F &
          commandResolution.nextPhase == TransferPhase.Idle &
          commandResolution.nextRearmRequired == F &
          commandResolution.disposition == TransferDisposition.IdleHolding &
          reportResolution.nextPhase == TransferPhase.Idle &
          reportResolution.nextRearmRequired == F &
          reportResolution.disposition == TransferDisposition.IdleHolding;

      compute
        // @trace INVAR-01
        guarantee STATE_INVARIANT "A rearm obligation is reachable only in the idle phase":
          rearmRequired implies transferPhase == TransferPhase.Idle;
        // @trace OUTPUT-01
        guarantee RESOLUTION_DELIVERIES_AGREE "The two distinct deliveries carry the same complete owner resolution":
          commandResolution.nextPhase == reportResolution.nextPhase &
          commandResolution.nextRearmRequired == reportResolution.nextRearmRequired &
          commandResolution.disposition == reportResolution.disposition;

        compute_cases
          // @trace CASE-01
          case CASE_01_INPUT_FAULT "Any invalid qualified input forces fault disposition and rearm-required idle":
            assume g01Invalid(qualifiedRequest, dockingAssessment, qualifiedShipProgress, qualifiedWarehouseEvidence);
            guarantee transferPhase == TransferPhase.Idle & rearmRequired == T &
                      commandResolution.nextPhase == TransferPhase.Idle & commandResolution.nextRearmRequired == T &
                      commandResolution.disposition == TransferDisposition.InputFault &
                      reportResolution.nextPhase == TransferPhase.Idle & reportResolution.nextRearmRequired == T &
                      reportResolution.disposition == TransferDisposition.InputFault;
          // @trace CASE-02
          case CASE_02_REARM_BLOCKED "Nonneutral evidence cannot replay while rearm is uncleared":
            assume not g01Invalid(qualifiedRequest, dockingAssessment, qualifiedShipProgress, qualifiedWarehouseEvidence) &
                   g02RearmBlocked(In(rearmRequired), qualifiedRequest, qualifiedShipProgress, qualifiedWarehouseEvidence);
            guarantee transferPhase == TransferPhase.Idle & rearmRequired == T &
                      commandResolution.nextPhase == TransferPhase.Idle & commandResolution.nextRearmRequired == T &
                      commandResolution.disposition == TransferDisposition.RearmBlocked &
                      reportResolution.nextPhase == TransferPhase.Idle & reportResolution.nextRearmRequired == T &
                      reportResolution.disposition == TransferDisposition.RearmBlocked;
          // @trace CASE-03
          case CASE_03_REARM_CLEARED "One valid neutral evaluation clears rearm without admitting a request":
            assume not g01Invalid(qualifiedRequest, dockingAssessment, qualifiedShipProgress, qualifiedWarehouseEvidence) &
                   not g02RearmBlocked(In(rearmRequired), qualifiedRequest, qualifiedShipProgress, qualifiedWarehouseEvidence) &
                   g03RearmCleared(In(rearmRequired), qualifiedRequest, dockingAssessment, qualifiedShipProgress, qualifiedWarehouseEvidence);
            guarantee transferPhase == TransferPhase.Idle & rearmRequired == F &
                      commandResolution.nextPhase == TransferPhase.Idle & commandResolution.nextRearmRequired == F &
                      commandResolution.disposition == TransferDisposition.RearmCleared &
                      reportResolution.nextPhase == TransferPhase.Idle & reportResolution.nextRearmRequired == F &
                      reportResolution.disposition == TransferDisposition.RearmCleared;
          // @trace CASE-04
          case CASE_04_ACTIVE_EVIDENCE_FAULT "The first active-phase consistency fault returns to rearm-required idle":
            assume not g01Invalid(qualifiedRequest, dockingAssessment, qualifiedShipProgress, qualifiedWarehouseEvidence) &
                   not g02RearmBlocked(In(rearmRequired), qualifiedRequest, qualifiedShipProgress, qualifiedWarehouseEvidence) &
                   not g03RearmCleared(In(rearmRequired), qualifiedRequest, dockingAssessment, qualifiedShipProgress, qualifiedWarehouseEvidence) &
                   g04ActiveFault(In(transferPhase), dockingAssessment, qualifiedShipProgress, qualifiedWarehouseEvidence);
            guarantee transferPhase == TransferPhase.Idle & rearmRequired == T &
                      commandResolution.nextPhase == TransferPhase.Idle & commandResolution.nextRearmRequired == T &
                      commandResolution.disposition == TransferDisposition.ActiveEvidenceFault &
                      reportResolution.nextPhase == TransferPhase.Idle & reportResolution.nextRearmRequired == T &
                      reportResolution.disposition == TransferDisposition.ActiveEvidenceFault;
          // @trace CASE-05
          case CASE_05_UNEXPECTED_IDLE_EVIDENCE "Transfer evidence while idle is rejected before any simultaneous request":
            assume not g01Invalid(qualifiedRequest, dockingAssessment, qualifiedShipProgress, qualifiedWarehouseEvidence) &
                   not g02RearmBlocked(In(rearmRequired), qualifiedRequest, qualifiedShipProgress, qualifiedWarehouseEvidence) &
                   not g03RearmCleared(In(rearmRequired), qualifiedRequest, dockingAssessment, qualifiedShipProgress, qualifiedWarehouseEvidence) &
                   not g04ActiveFault(In(transferPhase), dockingAssessment, qualifiedShipProgress, qualifiedWarehouseEvidence) &
                   g05UnexpectedIdle(In(transferPhase), qualifiedShipProgress, qualifiedWarehouseEvidence);
            guarantee transferPhase == TransferPhase.Idle & rearmRequired == T &
                      commandResolution.nextPhase == TransferPhase.Idle & commandResolution.nextRearmRequired == T &
                      commandResolution.disposition == TransferDisposition.UnexpectedIdleEvidence &
                      reportResolution.nextPhase == TransferPhase.Idle & reportResolution.nextRearmRequired == T &
                      reportResolution.disposition == TransferDisposition.UnexpectedIdleEvidence;
          // @trace CASE-06
          case CASE_06_BEGIN_ACCEPTED "A fresh docked request begins one logical transfer":
            assume not g01Invalid(qualifiedRequest, dockingAssessment, qualifiedShipProgress, qualifiedWarehouseEvidence) &
                   not g02RearmBlocked(In(rearmRequired), qualifiedRequest, qualifiedShipProgress, qualifiedWarehouseEvidence) &
                   not g03RearmCleared(In(rearmRequired), qualifiedRequest, dockingAssessment, qualifiedShipProgress, qualifiedWarehouseEvidence) &
                   not g04ActiveFault(In(transferPhase), dockingAssessment, qualifiedShipProgress, qualifiedWarehouseEvidence) &
                   not g05UnexpectedIdle(In(transferPhase), qualifiedShipProgress, qualifiedWarehouseEvidence) &
                   g06BeginAccepted(In(transferPhase), qualifiedRequest, dockingAssessment);
            guarantee transferPhase == TransferPhase.TransferOutstanding & rearmRequired == F &
                      commandResolution.nextPhase == TransferPhase.TransferOutstanding & commandResolution.nextRearmRequired == F &
                      commandResolution.disposition == TransferDisposition.BeginAccepted &
                      reportResolution.nextPhase == TransferPhase.TransferOutstanding & reportResolution.nextRearmRequired == F &
                      reportResolution.disposition == TransferDisposition.BeginAccepted;
          // @trace CASE-07
          case CASE_07_BEGIN_DENIED "A not-docked request is consumed and requires later neutralization":
            assume not g01Invalid(qualifiedRequest, dockingAssessment, qualifiedShipProgress, qualifiedWarehouseEvidence) &
                   not g02RearmBlocked(In(rearmRequired), qualifiedRequest, qualifiedShipProgress, qualifiedWarehouseEvidence) &
                   not g03RearmCleared(In(rearmRequired), qualifiedRequest, dockingAssessment, qualifiedShipProgress, qualifiedWarehouseEvidence) &
                   not g04ActiveFault(In(transferPhase), dockingAssessment, qualifiedShipProgress, qualifiedWarehouseEvidence) &
                   not g05UnexpectedIdle(In(transferPhase), qualifiedShipProgress, qualifiedWarehouseEvidence) &
                   not g06BeginAccepted(In(transferPhase), qualifiedRequest, dockingAssessment) &
                   g07BeginDenied(In(transferPhase), qualifiedRequest, dockingAssessment);
            guarantee transferPhase == TransferPhase.Idle & rearmRequired == T &
                      commandResolution.nextPhase == TransferPhase.Idle & commandResolution.nextRearmRequired == T &
                      commandResolution.disposition == TransferDisposition.BeginDenied &
                      reportResolution.nextPhase == TransferPhase.Idle & reportResolution.nextRearmRequired == T &
                      reportResolution.disposition == TransferDisposition.BeginDenied;
          // @trace CASE-08
          case CASE_08_VERIFIED_IMMEDIATE "Simultaneous applicable completion and receipt verify immediately":
            assume not g01Invalid(qualifiedRequest, dockingAssessment, qualifiedShipProgress, qualifiedWarehouseEvidence) &
                   not g02RearmBlocked(In(rearmRequired), qualifiedRequest, qualifiedShipProgress, qualifiedWarehouseEvidence) &
                   not g03RearmCleared(In(rearmRequired), qualifiedRequest, dockingAssessment, qualifiedShipProgress, qualifiedWarehouseEvidence) &
                   not g04ActiveFault(In(transferPhase), dockingAssessment, qualifiedShipProgress, qualifiedWarehouseEvidence) &
                   not g05UnexpectedIdle(In(transferPhase), qualifiedShipProgress, qualifiedWarehouseEvidence) &
                   not g06BeginAccepted(In(transferPhase), qualifiedRequest, dockingAssessment) &
                   not g07BeginDenied(In(transferPhase), qualifiedRequest, dockingAssessment) &
                   g08VerifiedImmediate(In(transferPhase), qualifiedShipProgress, qualifiedWarehouseEvidence);
            guarantee transferPhase == TransferPhase.Idle & rearmRequired == T &
                      commandResolution.nextPhase == TransferPhase.Idle & commandResolution.nextRearmRequired == T &
                      commandResolution.disposition == TransferDisposition.VerifiedImmediate &
                      reportResolution.nextPhase == TransferPhase.Idle & reportResolution.nextRearmRequired == T &
                      reportResolution.disposition == TransferDisposition.VerifiedImmediate;
          // @trace CASE-09
          case CASE_09_RECEIPT_PENDING "Ship completion without receipt is remembered as awaiting receipt":
            assume not g01Invalid(qualifiedRequest, dockingAssessment, qualifiedShipProgress, qualifiedWarehouseEvidence) &
                   not g02RearmBlocked(In(rearmRequired), qualifiedRequest, qualifiedShipProgress, qualifiedWarehouseEvidence) &
                   not g03RearmCleared(In(rearmRequired), qualifiedRequest, dockingAssessment, qualifiedShipProgress, qualifiedWarehouseEvidence) &
                   not g04ActiveFault(In(transferPhase), dockingAssessment, qualifiedShipProgress, qualifiedWarehouseEvidence) &
                   not g05UnexpectedIdle(In(transferPhase), qualifiedShipProgress, qualifiedWarehouseEvidence) &
                   not g06BeginAccepted(In(transferPhase), qualifiedRequest, dockingAssessment) &
                   not g07BeginDenied(In(transferPhase), qualifiedRequest, dockingAssessment) &
                   not g08VerifiedImmediate(In(transferPhase), qualifiedShipProgress, qualifiedWarehouseEvidence) &
                   g09ReceiptPending(In(transferPhase), qualifiedShipProgress, qualifiedWarehouseEvidence);
            guarantee transferPhase == TransferPhase.AwaitingReceipt & rearmRequired == F &
                      commandResolution.nextPhase == TransferPhase.AwaitingReceipt & commandResolution.nextRearmRequired == F &
                      commandResolution.disposition == TransferDisposition.ReceiptPending &
                      reportResolution.nextPhase == TransferPhase.AwaitingReceipt & reportResolution.nextRearmRequired == F &
                      reportResolution.disposition == TransferDisposition.ReceiptPending;
          // @trace CASE-10
          case CASE_10_VERIFIED_DELAYED "A confirmed receipt after remembered completion verifies the transfer":
            assume not g01Invalid(qualifiedRequest, dockingAssessment, qualifiedShipProgress, qualifiedWarehouseEvidence) &
                   not g02RearmBlocked(In(rearmRequired), qualifiedRequest, qualifiedShipProgress, qualifiedWarehouseEvidence) &
                   not g03RearmCleared(In(rearmRequired), qualifiedRequest, dockingAssessment, qualifiedShipProgress, qualifiedWarehouseEvidence) &
                   not g04ActiveFault(In(transferPhase), dockingAssessment, qualifiedShipProgress, qualifiedWarehouseEvidence) &
                   not g05UnexpectedIdle(In(transferPhase), qualifiedShipProgress, qualifiedWarehouseEvidence) &
                   not g06BeginAccepted(In(transferPhase), qualifiedRequest, dockingAssessment) &
                   not g07BeginDenied(In(transferPhase), qualifiedRequest, dockingAssessment) &
                   not g08VerifiedImmediate(In(transferPhase), qualifiedShipProgress, qualifiedWarehouseEvidence) &
                   not g09ReceiptPending(In(transferPhase), qualifiedShipProgress, qualifiedWarehouseEvidence) &
                   g10VerifiedDelayed(In(transferPhase), qualifiedWarehouseEvidence);
            guarantee transferPhase == TransferPhase.Idle & rearmRequired == T &
                      commandResolution.nextPhase == TransferPhase.Idle & commandResolution.nextRearmRequired == T &
                      commandResolution.disposition == TransferDisposition.VerifiedDelayed &
                      reportResolution.nextPhase == TransferPhase.Idle & reportResolution.nextRearmRequired == T &
                      reportResolution.disposition == TransferDisposition.VerifiedDelayed;
          // @trace CASE-11
          case CASE_11_ACTIVE_HOLDING "Every remaining active combination preserves the active phase":
            assume not g01Invalid(qualifiedRequest, dockingAssessment, qualifiedShipProgress, qualifiedWarehouseEvidence) &
                   not g02RearmBlocked(In(rearmRequired), qualifiedRequest, qualifiedShipProgress, qualifiedWarehouseEvidence) &
                   not g03RearmCleared(In(rearmRequired), qualifiedRequest, dockingAssessment, qualifiedShipProgress, qualifiedWarehouseEvidence) &
                   not g04ActiveFault(In(transferPhase), dockingAssessment, qualifiedShipProgress, qualifiedWarehouseEvidence) &
                   not g05UnexpectedIdle(In(transferPhase), qualifiedShipProgress, qualifiedWarehouseEvidence) &
                   not g06BeginAccepted(In(transferPhase), qualifiedRequest, dockingAssessment) &
                   not g07BeginDenied(In(transferPhase), qualifiedRequest, dockingAssessment) &
                   not g08VerifiedImmediate(In(transferPhase), qualifiedShipProgress, qualifiedWarehouseEvidence) &
                   not g09ReceiptPending(In(transferPhase), qualifiedShipProgress, qualifiedWarehouseEvidence) &
                   not g10VerifiedDelayed(In(transferPhase), qualifiedWarehouseEvidence) &
                   g11ActiveHolding(In(transferPhase));
            guarantee transferPhase == In(transferPhase) & rearmRequired == F &
                      commandResolution.nextPhase == In(transferPhase) & commandResolution.nextRearmRequired == F &
                      commandResolution.disposition == TransferDisposition.ActiveHolding &
                      reportResolution.nextPhase == In(transferPhase) & reportResolution.nextRearmRequired == F &
                      reportResolution.disposition == TransferDisposition.ActiveHolding;
          // @trace CASE-12
          case CASE_12_IDLE_HOLDING "The remaining valid nonrearm neutral combination stays ready and idle":
            assume not g01Invalid(qualifiedRequest, dockingAssessment, qualifiedShipProgress, qualifiedWarehouseEvidence) &
                   not g02RearmBlocked(In(rearmRequired), qualifiedRequest, qualifiedShipProgress, qualifiedWarehouseEvidence) &
                   not g03RearmCleared(In(rearmRequired), qualifiedRequest, dockingAssessment, qualifiedShipProgress, qualifiedWarehouseEvidence) &
                   not g04ActiveFault(In(transferPhase), dockingAssessment, qualifiedShipProgress, qualifiedWarehouseEvidence) &
                   not g05UnexpectedIdle(In(transferPhase), qualifiedShipProgress, qualifiedWarehouseEvidence) &
                   not g06BeginAccepted(In(transferPhase), qualifiedRequest, dockingAssessment) &
                   not g07BeginDenied(In(transferPhase), qualifiedRequest, dockingAssessment) &
                   not g08VerifiedImmediate(In(transferPhase), qualifiedShipProgress, qualifiedWarehouseEvidence) &
                   not g09ReceiptPending(In(transferPhase), qualifiedShipProgress, qualifiedWarehouseEvidence) &
                   not g10VerifiedDelayed(In(transferPhase), qualifiedWarehouseEvidence) &
                   not g11ActiveHolding(In(transferPhase));
            guarantee transferPhase == TransferPhase.Idle & rearmRequired == F &
                      commandResolution.nextPhase == TransferPhase.Idle & commandResolution.nextRearmRequired == F &
                      commandResolution.disposition == TransferDisposition.IdleHolding &
                      reportResolution.nextPhase == TransferPhase.Idle & reportResolution.nextRearmRequired == F &
                      reportResolution.disposition == TransferDisposition.IdleHolding;
    }*/
  }

  // @trace PART-06
  part def TransferCommandDerivation :> Thread {
    // @trace INT-09
    port resolution : DataPort { in :>> type : TransferResolution; }
    // @trace INT-11
    port command : DataPort { out :>> type : CargoTransferCommand; }
    language "GUMBO" /*{
      functions
        // @trace PART-06
        def commandFor(value: TransferResolution): CargoTransferCommand :=
          if (value.disposition == TransferDisposition.BeginAccepted)? CargoTransferCommand.BeginOffload
          else CargoTransferCommand.Hold;
      initialize
        // @trace INIT-01
        guarantee INIT_COMMAND_SAFE "Command initializes to Hold": command == CargoTransferCommand.Hold;
      compute
        // @trace CTRL-01
        guarantee COMMAND_TOTAL "Only BeginAccepted derives the one-evaluation begin command":
          command == commandFor(resolution);
    }*/
  }

  // @trace PART-07
  part def TransferReportDerivation :> Thread {
    // @trace INT-10
    port resolution : DataPort { in :>> type : TransferResolution; }
    // @trace INT-12
    port supervisorStatus : DataPort { out :>> type : TransferSupervisorStatus; }
    // @trace INT-13
    port verificationFinding : DataPort { out :>> type : TransferVerificationFinding; }
    language "GUMBO" /*{
      functions
        // @trace REPORT-01
        def statusFor(value: TransferResolution): TransferSupervisorStatus :=
          if (value.disposition == TransferDisposition.InputFault)? TransferSupervisorStatus.InputFault
          else if (value.disposition == TransferDisposition.RearmBlocked)? TransferSupervisorStatus.AwaitingNeutral
          else if (value.disposition == TransferDisposition.RearmCleared | value.disposition == TransferDisposition.IdleHolding)? TransferSupervisorStatus.Ready
          else if (value.disposition == TransferDisposition.ActiveEvidenceFault)? TransferSupervisorStatus.EvidenceFault
          else if (value.disposition == TransferDisposition.UnexpectedIdleEvidence)? TransferSupervisorStatus.UnexpectedEvidence
          else if (value.disposition == TransferDisposition.BeginAccepted)? TransferSupervisorStatus.TransferStarted
          else if (value.disposition == TransferDisposition.BeginDenied)? TransferSupervisorStatus.NotDocked
          else if (value.disposition == TransferDisposition.VerifiedImmediate | value.disposition == TransferDisposition.VerifiedDelayed)? TransferSupervisorStatus.TransferVerified
          else if (value.disposition == TransferDisposition.ReceiptPending)? TransferSupervisorStatus.AwaitingReceipt
          else if (value.nextPhase == TransferPhase.TransferOutstanding)? TransferSupervisorStatus.TransferActive
          else TransferSupervisorStatus.AwaitingReceipt;
        // @trace REPORT-01
        def findingFor(value: TransferResolution): TransferVerificationFinding :=
          if (value.disposition == TransferDisposition.ActiveEvidenceFault |
              value.disposition == TransferDisposition.UnexpectedIdleEvidence)? TransferVerificationFinding.Rejected
          else if (value.disposition == TransferDisposition.VerifiedImmediate |
                   value.disposition == TransferDisposition.VerifiedDelayed)? TransferVerificationFinding.Verified
          else TransferVerificationFinding.NotEstablished;
      initialize
        // @trace INIT-01
        guarantee INIT_REPORT_SAFE "Reports initialize ready with no verification finding":
          supervisorStatus == TransferSupervisorStatus.Ready &
          verificationFinding == TransferVerificationFinding.NotEstablished;
      compute
        // @trace REPORT-01
        guarantee REPORT_TOTAL "Status and finding are locally derived from the delivered resolution":
          supervisorStatus == statusFor(resolution) &
          verificationFinding == findingFor(resolution);
    }*/
  }

  // @generated-support SUPPORT-01 behavior-free containment and boundary delegation only
  part def CargoTransferSupervisionProcess :> Process {
    // @trace PART-01
    part requestQualification : RequestQualification;
    // @trace PART-02
    part dockingAssessmentOwner : DockingAssessmentOwner;
    // @trace PART-03
    part shipProgressQualification : ShipProgressQualification;
    // @trace PART-04
    part warehouseEvidenceQualification : WarehouseEvidenceQualification;
    // @trace PART-05
    part transferDecisionOwner : TransferDecisionOwner;
    // @trace PART-06
    part transferCommandDerivation : TransferCommandDerivation;
    // @trace PART-07
    part transferReportDerivation : TransferReportDerivation;

    // @generated-support INT-01 inbound Process boundary port
    port requestSample : DataPort { in :>> type : OffloadRequestSample; }
    // @generated-support INT-03 inbound Process boundary port
    port dockingSample : DataPort { in :>> type : DockingSample; }
    // @generated-support INT-05 inbound Process boundary port
    port shipSample : DataPort { in :>> type : ShipTransferSample; }
    // @generated-support INT-07 inbound Process boundary port
    port warehouseSample : DataPort { in :>> type : WarehouseReceiptSample; }
    // @generated-support INT-11 outbound Process boundary port
    port command : DataPort { out :>> type : CargoTransferCommand; }
    // @generated-support INT-12 outbound Process boundary port
    port supervisorStatus : DataPort { out :>> type : TransferSupervisorStatus; }
    // @generated-support INT-13 outbound Process boundary port
    port verificationFinding : DataPort { out :>> type : TransferVerificationFinding; }

    // @generated-support INT-01 Process-to-Thread delegation
    connection supportRequestToQualifier : PortConnection connect requestSample to requestQualification.requestSample;
    // @trace INT-02
    connection qualifiedRequestToDecision : PortConnection connect requestQualification.qualifiedRequest to transferDecisionOwner.qualifiedRequest;
    // @generated-support INT-03 Process-to-Thread delegation
    connection supportDockingToAssessor : PortConnection connect dockingSample to dockingAssessmentOwner.dockingSample;
    // @trace INT-04
    connection dockingAssessmentToDecision : PortConnection connect dockingAssessmentOwner.dockingAssessment to transferDecisionOwner.dockingAssessment;
    // @generated-support INT-05 Process-to-Thread delegation
    connection supportShipToQualifier : PortConnection connect shipSample to shipProgressQualification.shipSample;
    // @trace INT-06
    connection shipProgressToDecision : PortConnection connect shipProgressQualification.qualifiedShipProgress to transferDecisionOwner.qualifiedShipProgress;
    // @generated-support INT-07 Process-to-Thread delegation
    connection supportWarehouseToQualifier : PortConnection connect warehouseSample to warehouseEvidenceQualification.warehouseSample;
    // @trace INT-08
    connection warehouseEvidenceToDecision : PortConnection connect warehouseEvidenceQualification.qualifiedWarehouseEvidence to transferDecisionOwner.qualifiedWarehouseEvidence;
    // @trace INT-09
    connection decisionToCommand : PortConnection connect transferDecisionOwner.commandResolution to transferCommandDerivation.resolution;
    // @trace INT-10
    connection decisionToReport : PortConnection connect transferDecisionOwner.reportResolution to transferReportDerivation.resolution;
    // @generated-support INT-11 Thread-to-Process delegation
    connection supportCommandToProcess : PortConnection connect transferCommandDerivation.command to command;
    // @generated-support INT-12 Thread-to-Process delegation
    connection supportStatusToProcess : PortConnection connect transferReportDerivation.supervisorStatus to supervisorStatus;
    // @generated-support INT-13 Thread-to-Process delegation
    connection supportFindingToProcess : PortConnection connect transferReportDerivation.verificationFinding to verificationFinding;
  }

  // @trace BOUND-01
  part def MiningCargoTransferSupervisorSystem :> System {
    // @generated-support SUPPORT-01 sole behavior-free Process usage
    part supervisionProcess : CargoTransferSupervisionProcess;
    // @trace MON-01
    port offloadRequest : DataPort { in :>> type : OffloadRequestSample; }
    // @trace MON-02
    port dockingStatus : DataPort { in :>> type : DockingSample; }
    // @trace MON-03
    port shipProgress : DataPort { in :>> type : ShipTransferSample; }
    // @trace MON-04
    port warehouseReceipt : DataPort { in :>> type : WarehouseReceiptSample; }
    // @trace CTRL-01
    port cargoTransferCommand : DataPort { out :>> type : CargoTransferCommand; }
    // @trace CTRL-02
    port transferSupervisorStatus : DataPort { out :>> type : TransferSupervisorStatus; }
    // @trace CTRL-03
    port transferVerificationFinding : DataPort { out :>> type : TransferVerificationFinding; }

    // @generated-support INT-01 System-to-Process delegation
    connection supportBoundaryRequest : PortConnection connect offloadRequest to supervisionProcess.requestSample;
    // @generated-support INT-03 System-to-Process delegation
    connection supportBoundaryDocking : PortConnection connect dockingStatus to supervisionProcess.dockingSample;
    // @generated-support INT-05 System-to-Process delegation
    connection supportBoundaryShip : PortConnection connect shipProgress to supervisionProcess.shipSample;
    // @generated-support INT-07 System-to-Process delegation
    connection supportBoundaryWarehouse : PortConnection connect warehouseReceipt to supervisionProcess.warehouseSample;
    // @generated-support INT-11 Process-to-System delegation
    connection supportBoundaryCommand : PortConnection connect supervisionProcess.command to cargoTransferCommand;
    // @generated-support INT-12 Process-to-System delegation
    connection supportBoundaryStatus : PortConnection connect supervisionProcess.supervisorStatus to transferSupervisorStatus;
    // @generated-support INT-13 Process-to-System delegation
    connection supportBoundaryFinding : PortConnection connect supervisionProcess.verificationFinding to transferVerificationFinding;
  }

  // @trace STRUCT-01
  part miningCargoTransferSupervisor : MiningCargoTransferSupervisorSystem;
}
