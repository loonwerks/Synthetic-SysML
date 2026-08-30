package Mining_Cargo_Transfer_Supervisor {

  private import HAMR::*;

  enum def OffloadRequestEvent { enum NoRequest; enum OffloadRequested; }
  enum def InputStatus { enum Valid; enum Invalid; }
  enum def DockingObservation { enum NotDocked; enum Docked; }
  enum def ShipTransferProgress { enum Idle; enum InProgress; enum Complete; enum Failed; }
  enum def WarehouseReceiptEvidence { enum NoReceipt; enum ReceiptConfirmed; enum ReceiptRejected; }

  enum def QualifiedRequest { enum InvalidRequest; enum NoQualifiedRequest; enum QualifiedOffloadRequest; }
  enum def DockingAssessment { enum InvalidDocking; enum NotDockedAssessment; enum DockedAssessment; }
  enum def QualifiedShipProgress {
    enum InvalidShipProgress; enum ShipIdle; enum ShipInProgress; enum ShipComplete; enum ShipFailed;
  }
  enum def QualifiedWarehouseEvidence {
    enum InvalidWarehouseEvidence; enum NoQualifiedReceipt;
    enum QualifiedReceiptConfirmed; enum QualifiedReceiptRejected;
  }
  enum def TransferPhase { enum Idle; enum TransferOutstanding; enum AwaitingReceipt; }
  enum def TransferDisposition {
    enum InputFault; enum RearmBlocked; enum RearmCleared; enum ActiveEvidenceFault;
    enum UnexpectedIdleEvidence; enum BeginAccepted; enum BeginDenied; enum VerifiedImmediate;
    enum ReceiptPending; enum VerifiedDelayed; enum ActiveHolding; enum IdleHolding;
  }
  enum def CargoTransferCommand { enum Hold; enum BeginOffload; }
  enum def TransferSupervisorStatus {
    enum Ready; enum NotDocked; enum TransferStarted; enum TransferActive;
    enum AwaitingReceipt; enum TransferVerified; enum EvidenceFault;
    enum UnexpectedEvidence; enum InputFault; enum AwaitingNeutral;
  }
  enum def TransferVerificationFinding { enum NotEstablished; enum Verified; enum Rejected; }

  // Every member inspected below is an attribute of its Data record.
  part def OffloadRequestSample :> Data {
    attribute requestEvent : OffloadRequestEvent;
    attribute status : InputStatus;
  }
  part def DockingSample :> Data {
    attribute docking : DockingObservation;
    attribute status : InputStatus;
  }
  part def ShipTransferSample :> Data {
    attribute progress : ShipTransferProgress;
    attribute status : InputStatus;
  }
  part def WarehouseReceiptSample :> Data {
    attribute receipt : WarehouseReceiptEvidence;
    attribute status : InputStatus;
  }
  part def TransferResolution :> Data {
    attribute nextPhase : TransferPhase;
    attribute nextRearmRequired : Base_Types::Boolean;
    attribute disposition : TransferDisposition;
  }

  part def RequestQualification :> Thread {
    port requestSample : DataPort { in :>> type : OffloadRequestSample; }
    port qualifiedRequest : DataPort { out :>> type : QualifiedRequest; }

    language "GUMBO" /*{
      functions
        @strictpure def qualifyRequest(sample: OffloadRequestSample): QualifiedRequest :=
          if sample.status == InputStatus.Invalid ? QualifiedRequest.InvalidRequest
          else if sample.requestEvent == OffloadRequestEvent.OffloadRequested ? QualifiedRequest.QualifiedOffloadRequest
          else QualifiedRequest.NoQualifiedRequest;

      initialize
        guarantee INIT_REQUEST_QUALIFICATION: qualifiedRequest == QualifiedRequest.NoQualifiedRequest;

      compute
        guarantee QUAL_REQ_TOTAL: qualifiedRequest == qualifyRequest(requestSample);
    }*/

                        
               
                             
                                                                             
                                                                                    
                                                                                                                         
                                                   
                
                                  
                                                                                                             
                                                                  
             
                             
                                                                                                              
                                                            
       
  }

  part def DockingAssessmentOwner :> Thread {
    port dockingSample : DataPort { in :>> type : DockingSample; }
    port dockingAssessment : DataPort { out :>> type : DockingAssessment; }

    language "GUMBO" /*{
      functions
        @strictpure def assessDocking(sample: DockingSample): DockingAssessment :=
          if sample.status == InputStatus.Invalid ? DockingAssessment.InvalidDocking
          else if sample.docking == DockingObservation.Docked ? DockingAssessment.DockedAssessment
          else DockingAssessment.NotDockedAssessment;

      initialize
        guarantee INIT_DOCKING_ASSESSMENT: dockingAssessment == DockingAssessment.InvalidDocking;

      compute
        guarantee QUAL_DOCK_TOTAL: dockingAssessment == assessDocking(dockingSample);
    }*/

                        
               
                              
                                                                      
                                                                                     
                                                                                                   
                                                     
                
                                   
                                                                                          
                                                                
             
                              
                                                                                                      
                                                            
       
  }

  part def ShipProgressQualification :> Thread {
    port shipSample : DataPort { in :>> type : ShipTransferSample; }
    port qualifiedShipProgress : DataPort { out :>> type : QualifiedShipProgress; }

    language "GUMBO" /*{
      functions
        @strictpure def qualifyShip(sample: ShipTransferSample): QualifiedShipProgress :=
          if sample.status == InputStatus.Invalid ? QualifiedShipProgress.InvalidShipProgress
          else if sample.progress == ShipTransferProgress.InProgress ? QualifiedShipProgress.ShipInProgress
          else if sample.progress == ShipTransferProgress.Complete ? QualifiedShipProgress.ShipComplete
          else if sample.progress == ShipTransferProgress.Failed ? QualifiedShipProgress.ShipFailed
          else QualifiedShipProgress.ShipIdle;

      initialize
        guarantee INIT_SHIP_QUALIFICATION: qualifiedShipProgress == QualifiedShipProgress.ShipIdle;

      compute
        guarantee QUAL_SHIP_TOTAL: qualifiedShipProgress == qualifyShip(shipSample);
    }*/

                        
               
                              
                                                                             
                                                                                              
                                                                                                            
                                                                                                        
                                                                                                    
                                              
                
                                   
                                                                                              
                                                                  
             
                              
                                                                                                       
                                                           
       
  }

  part def WarehouseEvidenceQualification :> Thread {
    port warehouseSample : DataPort { in :>> type : WarehouseReceiptSample; }
    port qualifiedWarehouseEvidence : DataPort { out :>> type : QualifiedWarehouseEvidence; }

    language "GUMBO" /*{
      functions
        @strictpure def qualifyWarehouse(sample: WarehouseReceiptSample): QualifiedWarehouseEvidence :=
          if sample.status == InputStatus.Invalid ? QualifiedWarehouseEvidence.InvalidWarehouseEvidence
          else if sample.receipt == WarehouseReceiptEvidence.ReceiptConfirmed ? QualifiedWarehouseEvidence.QualifiedReceiptConfirmed
          else if sample.receipt == WarehouseReceiptEvidence.ReceiptRejected ? QualifiedWarehouseEvidence.QualifiedReceiptRejected
          else QualifiedWarehouseEvidence.NoQualifiedReceipt;

      initialize
        guarantee INIT_WAREHOUSE_QUALIFICATION: qualifiedWarehouseEvidence == QualifiedWarehouseEvidence.NoQualifiedReceipt;

      compute
        guarantee QUAL_WAREHOUSE_TOTAL: qualifiedWarehouseEvidence == qualifyWarehouse(warehouseSample);
    }*/

                        
               
                            
                                                                                           
                                                                                                        
                                                                                                                                     
                                                                                                                                   
                                                             
                
                                 
                                                                                                
                                                                                      
             
                            
                                                                                                                    
                                                                          
       
  }

  part def TransferDecisionOwner :> Thread {
    port qualifiedRequest : DataPort { in :>> type : QualifiedRequest; }
    port dockingAssessment : DataPort { in :>> type : DockingAssessment; }
    port qualifiedShipProgress : DataPort { in :>> type : QualifiedShipProgress; }
    port qualifiedWarehouseEvidence : DataPort { in :>> type : QualifiedWarehouseEvidence; }
    port commandResolution : DataPort { out :>> type : TransferResolution; }
    port reportResolution : DataPort { out :>> type : TransferResolution; }

    language "GUMBO" /*{
      state
        transferPhase: TransferPhase;
        rearmRequired: Base_Types::Boolean;

      functions
        @strictpure def g01Invalid(request: QualifiedRequest, docking: DockingAssessment,
          ship: QualifiedShipProgress, warehouse: QualifiedWarehouseEvidence): Base_Types::Boolean :=
          request == QualifiedRequest.InvalidRequest or docking == DockingAssessment.InvalidDocking or
          ship == QualifiedShipProgress.InvalidShipProgress or
          warehouse == QualifiedWarehouseEvidence.InvalidWarehouseEvidence;

        @strictpure def neutral(request: QualifiedRequest, ship: QualifiedShipProgress,
          warehouse: QualifiedWarehouseEvidence): Base_Types::Boolean :=
          request == QualifiedRequest.NoQualifiedRequest and ship == QualifiedShipProgress.ShipIdle and
          warehouse == QualifiedWarehouseEvidence.NoQualifiedReceipt;

        @strictpure def g02RearmBlocked(rearm: Base_Types::Boolean, request: QualifiedRequest,
          ship: QualifiedShipProgress, warehouse: QualifiedWarehouseEvidence): Base_Types::Boolean :=
          rearm and not neutral(request, ship, warehouse);

        @strictpure def g03RearmCleared(rearm: Base_Types::Boolean, request: QualifiedRequest,
          docking: DockingAssessment, ship: QualifiedShipProgress,
          warehouse: QualifiedWarehouseEvidence): Base_Types::Boolean :=
          rearm and not g01Invalid(request, docking, ship, warehouse) and neutral(request, ship, warehouse);

        @strictpure def g04ActiveFault(phase: TransferPhase, docking: DockingAssessment,
          ship: QualifiedShipProgress, warehouse: QualifiedWarehouseEvidence): Base_Types::Boolean :=
          (phase == TransferPhase.TransferOutstanding or phase == TransferPhase.AwaitingReceipt) and
          (docking == DockingAssessment.NotDockedAssessment or ship == QualifiedShipProgress.ShipFailed or
           warehouse == QualifiedWarehouseEvidence.QualifiedReceiptRejected or
           (phase == TransferPhase.TransferOutstanding and
            warehouse == QualifiedWarehouseEvidence.QualifiedReceiptConfirmed and
            ship != QualifiedShipProgress.ShipComplete) or
           (phase == TransferPhase.AwaitingReceipt and ship == QualifiedShipProgress.ShipInProgress));

        @strictpure def g05UnexpectedIdle(phase: TransferPhase, ship: QualifiedShipProgress,
          warehouse: QualifiedWarehouseEvidence): Base_Types::Boolean :=
          phase == TransferPhase.Idle and
          (ship != QualifiedShipProgress.ShipIdle or warehouse != QualifiedWarehouseEvidence.NoQualifiedReceipt);

        @strictpure def g06BeginAccepted(phase: TransferPhase, request: QualifiedRequest,
          docking: DockingAssessment): Base_Types::Boolean :=
          phase == TransferPhase.Idle and request == QualifiedRequest.QualifiedOffloadRequest and
          docking == DockingAssessment.DockedAssessment;

        @strictpure def g07BeginDenied(phase: TransferPhase, request: QualifiedRequest,
          docking: DockingAssessment): Base_Types::Boolean :=
          phase == TransferPhase.Idle and request == QualifiedRequest.QualifiedOffloadRequest and
          docking == DockingAssessment.NotDockedAssessment;

        @strictpure def g08VerifiedImmediate(phase: TransferPhase, ship: QualifiedShipProgress,
          warehouse: QualifiedWarehouseEvidence): Base_Types::Boolean :=
          phase == TransferPhase.TransferOutstanding and ship == QualifiedShipProgress.ShipComplete and
          warehouse == QualifiedWarehouseEvidence.QualifiedReceiptConfirmed;

        @strictpure def g09ReceiptPending(phase: TransferPhase, ship: QualifiedShipProgress,
          warehouse: QualifiedWarehouseEvidence): Base_Types::Boolean :=
          phase == TransferPhase.TransferOutstanding and ship == QualifiedShipProgress.ShipComplete and
          warehouse == QualifiedWarehouseEvidence.NoQualifiedReceipt;

        @strictpure def g10VerifiedDelayed(phase: TransferPhase,
          warehouse: QualifiedWarehouseEvidence): Base_Types::Boolean :=
          phase == TransferPhase.AwaitingReceipt and
          warehouse == QualifiedWarehouseEvidence.QualifiedReceiptConfirmed;

        @strictpure def g11ActiveHolding(phase: TransferPhase): Base_Types::Boolean :=
          phase == TransferPhase.TransferOutstanding or phase == TransferPhase.AwaitingReceipt;

      initialize
        guarantee INIT_DECISION_OWNER:
          transferPhase == TransferPhase.Idle and not rearmRequired and
          commandResolution.nextPhase == TransferPhase.Idle and
          not commandResolution.nextRearmRequired and
          commandResolution.disposition == TransferDisposition.IdleHolding and
          reportResolution.nextPhase == TransferPhase.Idle and
          not reportResolution.nextRearmRequired and
          reportResolution.disposition == TransferDisposition.IdleHolding;

      compute
        modifies transferPhase, rearmRequired;
        guarantee STATE_INVARIANT: rearmRequired implies transferPhase == TransferPhase.Idle;
        guarantee RESOLUTION_DELIVERIES_AGREE:
          commandResolution.nextPhase == reportResolution.nextPhase and
          commandResolution.nextRearmRequired == reportResolution.nextRearmRequired and
          commandResolution.disposition == reportResolution.disposition;
        compute_cases
          case CASE_01_INPUT_FAULT:
            assume g01Invalid(qualifiedRequest, dockingAssessment,
              qualifiedShipProgress, qualifiedWarehouseEvidence);
            guarantee transferPhase == TransferPhase.Idle and rearmRequired and
              commandResolution.nextPhase == TransferPhase.Idle and
              commandResolution.nextRearmRequired and
              commandResolution.disposition == TransferDisposition.InputFault and
              reportResolution.nextPhase == TransferPhase.Idle and
              reportResolution.nextRearmRequired and
              reportResolution.disposition == TransferDisposition.InputFault;
          case CASE_02_REARM_BLOCKED:
            assume not g01Invalid(qualifiedRequest, dockingAssessment,
              qualifiedShipProgress, qualifiedWarehouseEvidence) and
              g02RearmBlocked(In(rearmRequired), qualifiedRequest, qualifiedShipProgress,
                qualifiedWarehouseEvidence);
            guarantee transferPhase == TransferPhase.Idle and rearmRequired and
              commandResolution.nextPhase == TransferPhase.Idle and
              commandResolution.nextRearmRequired and
              commandResolution.disposition == TransferDisposition.RearmBlocked and
              reportResolution.nextPhase == TransferPhase.Idle and
              reportResolution.nextRearmRequired and
              reportResolution.disposition == TransferDisposition.RearmBlocked;
          case CASE_03_REARM_CLEARED:
            assume not g01Invalid(qualifiedRequest, dockingAssessment,
              qualifiedShipProgress, qualifiedWarehouseEvidence) and
              not g02RearmBlocked(In(rearmRequired), qualifiedRequest, qualifiedShipProgress,
                qualifiedWarehouseEvidence) and
              g03RearmCleared(In(rearmRequired), qualifiedRequest, dockingAssessment,
                qualifiedShipProgress, qualifiedWarehouseEvidence);
            guarantee transferPhase == TransferPhase.Idle and not rearmRequired and
              commandResolution.nextPhase == TransferPhase.Idle and
              not commandResolution.nextRearmRequired and
              commandResolution.disposition == TransferDisposition.RearmCleared and
              reportResolution.nextPhase == TransferPhase.Idle and
              not reportResolution.nextRearmRequired and
              reportResolution.disposition == TransferDisposition.RearmCleared;
          case CASE_04_ACTIVE_EVIDENCE_FAULT:
            assume not g01Invalid(qualifiedRequest, dockingAssessment,
              qualifiedShipProgress, qualifiedWarehouseEvidence) and
              not g02RearmBlocked(In(rearmRequired), qualifiedRequest, qualifiedShipProgress,
                qualifiedWarehouseEvidence) and
              not g03RearmCleared(In(rearmRequired), qualifiedRequest, dockingAssessment,
                qualifiedShipProgress, qualifiedWarehouseEvidence) and
              g04ActiveFault(In(transferPhase), dockingAssessment, qualifiedShipProgress,
                qualifiedWarehouseEvidence);
            guarantee transferPhase == TransferPhase.Idle and rearmRequired and
              commandResolution.nextPhase == TransferPhase.Idle and
              commandResolution.nextRearmRequired and
              commandResolution.disposition == TransferDisposition.ActiveEvidenceFault and
              reportResolution.nextPhase == TransferPhase.Idle and
              reportResolution.nextRearmRequired and
              reportResolution.disposition == TransferDisposition.ActiveEvidenceFault;
          case CASE_05_UNEXPECTED_IDLE_EVIDENCE:
            assume not g01Invalid(qualifiedRequest, dockingAssessment,
              qualifiedShipProgress, qualifiedWarehouseEvidence) and
              not g02RearmBlocked(In(rearmRequired), qualifiedRequest, qualifiedShipProgress,
                qualifiedWarehouseEvidence) and
              not g03RearmCleared(In(rearmRequired), qualifiedRequest, dockingAssessment,
                qualifiedShipProgress, qualifiedWarehouseEvidence) and
              not g04ActiveFault(In(transferPhase), dockingAssessment, qualifiedShipProgress,
                qualifiedWarehouseEvidence) and
              g05UnexpectedIdle(In(transferPhase), qualifiedShipProgress, qualifiedWarehouseEvidence);
            guarantee transferPhase == TransferPhase.Idle and rearmRequired and
              commandResolution.nextPhase == TransferPhase.Idle and
              commandResolution.nextRearmRequired and
              commandResolution.disposition == TransferDisposition.UnexpectedIdleEvidence and
              reportResolution.nextPhase == TransferPhase.Idle and
              reportResolution.nextRearmRequired and
              reportResolution.disposition == TransferDisposition.UnexpectedIdleEvidence;
          case CASE_06_BEGIN_ACCEPTED:
            assume not g01Invalid(qualifiedRequest, dockingAssessment,
              qualifiedShipProgress, qualifiedWarehouseEvidence) and
              not g02RearmBlocked(In(rearmRequired), qualifiedRequest, qualifiedShipProgress,
                qualifiedWarehouseEvidence) and
              not g03RearmCleared(In(rearmRequired), qualifiedRequest, dockingAssessment,
                qualifiedShipProgress, qualifiedWarehouseEvidence) and
              not g04ActiveFault(In(transferPhase), dockingAssessment, qualifiedShipProgress,
                qualifiedWarehouseEvidence) and
              not g05UnexpectedIdle(In(transferPhase), qualifiedShipProgress, qualifiedWarehouseEvidence) and
              g06BeginAccepted(In(transferPhase), qualifiedRequest, dockingAssessment);
            guarantee transferPhase == TransferPhase.TransferOutstanding and not rearmRequired and
              commandResolution.nextPhase == TransferPhase.TransferOutstanding and
              not commandResolution.nextRearmRequired and
              commandResolution.disposition == TransferDisposition.BeginAccepted and
              reportResolution.nextPhase == TransferPhase.TransferOutstanding and
              not reportResolution.nextRearmRequired and
              reportResolution.disposition == TransferDisposition.BeginAccepted;
          case CASE_07_BEGIN_DENIED:
            assume not g01Invalid(qualifiedRequest, dockingAssessment,
              qualifiedShipProgress, qualifiedWarehouseEvidence) and
              not g02RearmBlocked(In(rearmRequired), qualifiedRequest, qualifiedShipProgress,
                qualifiedWarehouseEvidence) and
              not g03RearmCleared(In(rearmRequired), qualifiedRequest, dockingAssessment,
                qualifiedShipProgress, qualifiedWarehouseEvidence) and
              not g04ActiveFault(In(transferPhase), dockingAssessment, qualifiedShipProgress,
                qualifiedWarehouseEvidence) and
              not g05UnexpectedIdle(In(transferPhase), qualifiedShipProgress, qualifiedWarehouseEvidence) and
              not g06BeginAccepted(In(transferPhase), qualifiedRequest, dockingAssessment) and
              g07BeginDenied(In(transferPhase), qualifiedRequest, dockingAssessment);
            guarantee transferPhase == TransferPhase.Idle and rearmRequired and
              commandResolution.nextPhase == TransferPhase.Idle and
              commandResolution.nextRearmRequired and
              commandResolution.disposition == TransferDisposition.BeginDenied and
              reportResolution.nextPhase == TransferPhase.Idle and
              reportResolution.nextRearmRequired and
              reportResolution.disposition == TransferDisposition.BeginDenied;
          case CASE_08_VERIFIED_IMMEDIATE:
            assume not g01Invalid(qualifiedRequest, dockingAssessment,
              qualifiedShipProgress, qualifiedWarehouseEvidence) and
              not g02RearmBlocked(In(rearmRequired), qualifiedRequest, qualifiedShipProgress,
                qualifiedWarehouseEvidence) and
              not g03RearmCleared(In(rearmRequired), qualifiedRequest, dockingAssessment,
                qualifiedShipProgress, qualifiedWarehouseEvidence) and
              not g04ActiveFault(In(transferPhase), dockingAssessment, qualifiedShipProgress,
                qualifiedWarehouseEvidence) and
              not g05UnexpectedIdle(In(transferPhase), qualifiedShipProgress, qualifiedWarehouseEvidence) and
              not g06BeginAccepted(In(transferPhase), qualifiedRequest, dockingAssessment) and
              not g07BeginDenied(In(transferPhase), qualifiedRequest, dockingAssessment) and
              g08VerifiedImmediate(In(transferPhase), qualifiedShipProgress, qualifiedWarehouseEvidence);
            guarantee transferPhase == TransferPhase.Idle and rearmRequired and
              commandResolution.nextPhase == TransferPhase.Idle and
              commandResolution.nextRearmRequired and
              commandResolution.disposition == TransferDisposition.VerifiedImmediate and
              reportResolution.nextPhase == TransferPhase.Idle and
              reportResolution.nextRearmRequired and
              reportResolution.disposition == TransferDisposition.VerifiedImmediate;
          case CASE_09_RECEIPT_PENDING:
            assume not g01Invalid(qualifiedRequest, dockingAssessment,
              qualifiedShipProgress, qualifiedWarehouseEvidence) and
              not g02RearmBlocked(In(rearmRequired), qualifiedRequest, qualifiedShipProgress,
                qualifiedWarehouseEvidence) and
              not g03RearmCleared(In(rearmRequired), qualifiedRequest, dockingAssessment,
                qualifiedShipProgress, qualifiedWarehouseEvidence) and
              not g04ActiveFault(In(transferPhase), dockingAssessment, qualifiedShipProgress,
                qualifiedWarehouseEvidence) and
              not g05UnexpectedIdle(In(transferPhase), qualifiedShipProgress, qualifiedWarehouseEvidence) and
              not g06BeginAccepted(In(transferPhase), qualifiedRequest, dockingAssessment) and
              not g07BeginDenied(In(transferPhase), qualifiedRequest, dockingAssessment) and
              not g08VerifiedImmediate(In(transferPhase), qualifiedShipProgress, qualifiedWarehouseEvidence) and
              g09ReceiptPending(In(transferPhase), qualifiedShipProgress, qualifiedWarehouseEvidence);
            guarantee transferPhase == TransferPhase.AwaitingReceipt and not rearmRequired and
              commandResolution.nextPhase == TransferPhase.AwaitingReceipt and
              not commandResolution.nextRearmRequired and
              commandResolution.disposition == TransferDisposition.ReceiptPending and
              reportResolution.nextPhase == TransferPhase.AwaitingReceipt and
              not reportResolution.nextRearmRequired and
              reportResolution.disposition == TransferDisposition.ReceiptPending;
          case CASE_10_VERIFIED_DELAYED:
            assume not g01Invalid(qualifiedRequest, dockingAssessment,
              qualifiedShipProgress, qualifiedWarehouseEvidence) and
              not g02RearmBlocked(In(rearmRequired), qualifiedRequest, qualifiedShipProgress,
                qualifiedWarehouseEvidence) and
              not g03RearmCleared(In(rearmRequired), qualifiedRequest, dockingAssessment,
                qualifiedShipProgress, qualifiedWarehouseEvidence) and
              not g04ActiveFault(In(transferPhase), dockingAssessment, qualifiedShipProgress,
                qualifiedWarehouseEvidence) and
              not g05UnexpectedIdle(In(transferPhase), qualifiedShipProgress, qualifiedWarehouseEvidence) and
              not g06BeginAccepted(In(transferPhase), qualifiedRequest, dockingAssessment) and
              not g07BeginDenied(In(transferPhase), qualifiedRequest, dockingAssessment) and
              not g08VerifiedImmediate(In(transferPhase), qualifiedShipProgress, qualifiedWarehouseEvidence) and
              not g09ReceiptPending(In(transferPhase), qualifiedShipProgress, qualifiedWarehouseEvidence) and
              g10VerifiedDelayed(In(transferPhase), qualifiedWarehouseEvidence);
            guarantee transferPhase == TransferPhase.Idle and rearmRequired and
              commandResolution.nextPhase == TransferPhase.Idle and
              commandResolution.nextRearmRequired and
              commandResolution.disposition == TransferDisposition.VerifiedDelayed and
              reportResolution.nextPhase == TransferPhase.Idle and
              reportResolution.nextRearmRequired and
              reportResolution.disposition == TransferDisposition.VerifiedDelayed;
          case CASE_11_ACTIVE_HOLDING:
            assume not g01Invalid(qualifiedRequest, dockingAssessment,
              qualifiedShipProgress, qualifiedWarehouseEvidence) and
              not g02RearmBlocked(In(rearmRequired), qualifiedRequest, qualifiedShipProgress,
                qualifiedWarehouseEvidence) and
              not g03RearmCleared(In(rearmRequired), qualifiedRequest, dockingAssessment,
                qualifiedShipProgress, qualifiedWarehouseEvidence) and
              not g04ActiveFault(In(transferPhase), dockingAssessment, qualifiedShipProgress,
                qualifiedWarehouseEvidence) and
              not g05UnexpectedIdle(In(transferPhase), qualifiedShipProgress, qualifiedWarehouseEvidence) and
              not g06BeginAccepted(In(transferPhase), qualifiedRequest, dockingAssessment) and
              not g07BeginDenied(In(transferPhase), qualifiedRequest, dockingAssessment) and
              not g08VerifiedImmediate(In(transferPhase), qualifiedShipProgress, qualifiedWarehouseEvidence) and
              not g09ReceiptPending(In(transferPhase), qualifiedShipProgress, qualifiedWarehouseEvidence) and
              not g10VerifiedDelayed(In(transferPhase), qualifiedWarehouseEvidence) and
              g11ActiveHolding(In(transferPhase));
            guarantee transferPhase == In(transferPhase) and not rearmRequired and
              commandResolution.nextPhase == In(transferPhase) and
              not commandResolution.nextRearmRequired and
              commandResolution.disposition == TransferDisposition.ActiveHolding and
              reportResolution.nextPhase == In(transferPhase) and
              not reportResolution.nextRearmRequired and
              reportResolution.disposition == TransferDisposition.ActiveHolding;
          case CASE_12_IDLE_HOLDING:
            assume not g01Invalid(qualifiedRequest, dockingAssessment,
              qualifiedShipProgress, qualifiedWarehouseEvidence) and
              not g02RearmBlocked(In(rearmRequired), qualifiedRequest, qualifiedShipProgress,
                qualifiedWarehouseEvidence) and
              not g03RearmCleared(In(rearmRequired), qualifiedRequest, dockingAssessment,
                qualifiedShipProgress, qualifiedWarehouseEvidence) and
              not g04ActiveFault(In(transferPhase), dockingAssessment, qualifiedShipProgress,
                qualifiedWarehouseEvidence) and
              not g05UnexpectedIdle(In(transferPhase), qualifiedShipProgress, qualifiedWarehouseEvidence) and
              not g06BeginAccepted(In(transferPhase), qualifiedRequest, dockingAssessment) and
              not g07BeginDenied(In(transferPhase), qualifiedRequest, dockingAssessment) and
              not g08VerifiedImmediate(In(transferPhase), qualifiedShipProgress, qualifiedWarehouseEvidence) and
              not g09ReceiptPending(In(transferPhase), qualifiedShipProgress, qualifiedWarehouseEvidence) and
              not g10VerifiedDelayed(In(transferPhase), qualifiedWarehouseEvidence) and
              not g11ActiveHolding(In(transferPhase));
            guarantee transferPhase == TransferPhase.Idle and not rearmRequired and
              commandResolution.nextPhase == TransferPhase.Idle and
              not commandResolution.nextRearmRequired and
              commandResolution.disposition == TransferDisposition.IdleHolding and
              reportResolution.nextPhase == TransferPhase.Idle and
              not reportResolution.nextRearmRequired and
              reportResolution.disposition == TransferDisposition.IdleHolding;
    }*/

                        
           
                          
                                     
                          
                                           

               
                             
                                                                             
                                                                                                                  
                                                      
                                                       
                                                             
                                                                           
                            
                                                                           
                                                                                  
                                                          
                                                  
                                                                     
                         
                                                                                  
                                                                                                                      
                                                        
                         
                                                                                  
                                                                                   
                                                                                         
                                                                                                        
                         
                                                                            
                                                                                                                      
                                                                                                 
                                                             
                                                     
                                                                             
                                                        
                                                                               
                                                         
                                                                                                    
                         
                                                                                
                                                                                            
                                       
                                                   
                                                                       
                         
                                                                             
                                                                                
                                                                                             
                                                        
                         
                                                                           
                                                                              
                                                                                             
                                                           
                         
                                                                                   
                                                                                               
                                                                                                   
                                                                            
                         
                                                                                
                                                                                            
                                                                                                   
                                                                     
                         
                                                                                                                   
                                                  
                                                                            
                         
                                                                          
                                                                                              

                
                         
                                                                                                                    
                                                                    
                                                             
                                                    
                                                                            
                                                            
                                                   
                                                                          

             
                          
                                                                                           
                                                                    
                           
                                                                                                                     
                                                                     
                                                                                     
                                                                        

                     
                           
                                                                                                                  
                                                                                                                      
                                                                                
                                                                                                                    
                                                                                       
                                                                                                                  
                                                                                     
                           
                                                                                                  
                                                                                                                           
                                                                                                                           
                                                                                
                                                                                                                    
                                                                                         
                                                                                                                  
                                                                                       
                           
                                                                                                             
                                                                                                                           
                                                                                                                                
                                                                                                                                              
                                                                                
                                                                                                                    
                                                                                         
                                                                                                                  
                                                                                       
                           
                                                                                                                       
                                                                                                                           
                                                                                                                                
                                                                                                                                                   
                                                                                                                           
                                                                                
                                                                                                                    
                                                                                                
                                                                                                                  
                                                                                              
                           
                                                                                                                           
                                                                                                                           
                                                                                                                                
                                                                                                                                                   
                                                                                                                                
                                                                                                           
                                                                                
                                                                                                                    
                                                                                                   
                                                                                                                  
                                                                                                 
                           
                                                                                           
                                                                                                                           
                                                                                                                                
                                                                                                                                                   
                                                                                                                                
                                                                                                                
                                                                                            
                                                                                               
                                                                                                                                   
                                                                                          
                                                                                                                                 
                                                                                        
                           
                                                                                                         
                                                                                                                           
                                                                                                                                
                                                                                                                                                   
                                                                                                                                
                                                                                                                
                                                                                                 
                                                                                          
                                                                                
                                                                                                                    
                                                                                        
                                                                                                                  
                                                                                      
                           
                                                                                                              
                                                                                                                           
                                                                                                                                
                                                                                                                                                   
                                                                                                                                
                                                                                                                
                                                                                                 
                                                                                               
                                                                                                              
                                                                                
                                                                                                                    
                                                                                              
                                                                                                                  
                                                                                            
                           
                                                                                                           
                                                                                                                           
                                                                                                                                
                                                                                                                                                   
                                                                                                                                
                                                                                                                
                                                                                                 
                                                                                               
                                                                                                                   
                                                                                                           
                                                                                           
                                                                                                                               
                                                                                           
                                                                                                                             
                                                                                         
                           
                                                                                                                
                                                                                                                           
                                                                                                                                
                                                                                                                                                   
                                                                                                                                
                                                                                                                
                                                                                                 
                                                                                               
                                                                                                                   
                                                                                                                
                                                                                     
                                                                                
                                                                                                                    
                                                                                            
                                                                                                                  
                                                                                          
                           
                                                                                                      
                                                                                                                           
                                                                                                                                
                                                                                                                                                   
                                                                                                                                
                                                                                                                
                                                                                                 
                                                                                               
                                                                                                                   
                                                                                                                
                                                                                          
                                                       
                                                                               
                                                                                                                   
                                                                                          
                                                                                                                 
                                                                                        
                           
                                                                                                            
                                                                                                                           
                                                                                                                                
                                                                                                                                                   
                                                                                                                                
                                                                                                                
                                                                                                 
                                                                                               
                                                                                                                   
                                                                                                                
                                                                                          
                                                           
                                                                                
                                                                                                                    
                                                                                        
                                                                                                                  
                                                                                      
       
  }

  part def TransferCommandDerivation :> Thread {
    port resolution : DataPort { in :>> type : TransferResolution; }
    port command : DataPort { out :>> type : CargoTransferCommand; }

    language "GUMBO" /*{
      functions
        @strictpure def commandFor(value: TransferResolution): CargoTransferCommand :=
          if value.disposition == TransferDisposition.BeginAccepted ? CargoTransferCommand.BeginOffload
          else CargoTransferCommand.Hold;

      initialize
        guarantee INIT_COMMAND_SAFE: command == CargoTransferCommand.Hold;

      compute
        guarantee COMMAND_TOTAL: command == commandFor(resolution);
    }*/
                        
               
                         
                                                                          
                                                                                                        
                                         
                
                         
                                                                                                        
             
                         
                                                                                              
                                            
       
  }

  part def TransferReportDerivation :> Thread {
    port resolution : DataPort { in :>> type : TransferResolution; }
    port supervisorStatus : DataPort { out :>> type : TransferSupervisorStatus; }
    port verificationFinding : DataPort { out :>> type : TransferVerificationFinding; }

    language "GUMBO" /*{
      functions
        @strictpure def statusFor(value: TransferResolution): TransferSupervisorStatus :=
          if value.disposition == TransferDisposition.InputFault ? TransferSupervisorStatus.InputFault
          else if value.disposition == TransferDisposition.RearmBlocked ? TransferSupervisorStatus.AwaitingNeutral
          else if value.disposition == TransferDisposition.RearmCleared or
            value.disposition == TransferDisposition.IdleHolding ? TransferSupervisorStatus.Ready
          else if value.disposition == TransferDisposition.ActiveEvidenceFault ? TransferSupervisorStatus.EvidenceFault
          else if value.disposition == TransferDisposition.UnexpectedIdleEvidence ? TransferSupervisorStatus.UnexpectedEvidence
          else if value.disposition == TransferDisposition.BeginAccepted ? TransferSupervisorStatus.TransferStarted
          else if value.disposition == TransferDisposition.BeginDenied ? TransferSupervisorStatus.NotDocked
          else if value.disposition == TransferDisposition.VerifiedImmediate or
            value.disposition == TransferDisposition.VerifiedDelayed ? TransferSupervisorStatus.TransferVerified
          else if value.disposition == TransferDisposition.ReceiptPending ? TransferSupervisorStatus.AwaitingReceipt
          else if value.nextPhase == TransferPhase.TransferOutstanding ? TransferSupervisorStatus.TransferActive
          else TransferSupervisorStatus.AwaitingReceipt;

        @strictpure def findingFor(value: TransferResolution): TransferVerificationFinding :=
          if value.disposition == TransferDisposition.ActiveEvidenceFault or
            value.disposition == TransferDisposition.UnexpectedIdleEvidence ? TransferVerificationFinding.Rejected
          else if value.disposition == TransferDisposition.VerifiedImmediate or
            value.disposition == TransferDisposition.VerifiedDelayed ? TransferVerificationFinding.Verified
          else TransferVerificationFinding.NotEstablished;

      initialize
        guarantee INIT_REPORT_SAFE:
          supervisorStatus == TransferSupervisorStatus.Ready and
          verificationFinding == TransferVerificationFinding.NotEstablished;

      compute
        guarantee REPORT_TOTAL:
          supervisorStatus == statusFor(resolution) and
          verificationFinding == findingFor(resolution);
    }*/
                        
               
                           
                                                                             
                                                                                                       
                                                                                                                   
                                                                                                                                                                
                                                                                                                        
                                                                                                                                
                                                                                                                    
                                                                                                            
                                                                                                                                                                                    
                                                                                                                     
                                                                                                                 
                                                        
                           
                                                                                 
                                                                            
                                                                                                                    
                                                                               
                                                                                                                  
                                                          
                
                         
                                                                                           
                                                              
                                                                            
             
                           
                                                                                                      
                                                     
                                                        
       
  }

  part def CargoTransferSupervisionProcess :> Process {
    part requestQualification : RequestQualification;
    part dockingAssessmentOwner : DockingAssessmentOwner;
    part shipProgressQualification : ShipProgressQualification;
    part warehouseEvidenceQualification : WarehouseEvidenceQualification;
    part transferDecisionOwner : TransferDecisionOwner;
    part transferCommandDerivation : TransferCommandDerivation;
    part transferReportDerivation : TransferReportDerivation;

    port requestSample : DataPort { in :>> type : OffloadRequestSample; }
    port dockingSample : DataPort { in :>> type : DockingSample; }
    port shipSample : DataPort { in :>> type : ShipTransferSample; }
    port warehouseSample : DataPort { in :>> type : WarehouseReceiptSample; }
    port command : DataPort { out :>> type : CargoTransferCommand; }
    port supervisorStatus : DataPort { out :>> type : TransferSupervisorStatus; }
    port verificationFinding : DataPort { out :>> type : TransferVerificationFinding; }

    connection supportRequestToQualifier : PortConnection connect requestSample to requestQualification.requestSample;
    connection qualifiedRequestToDecision : PortConnection connect requestQualification.qualifiedRequest to transferDecisionOwner.qualifiedRequest;
    connection supportDockingToAssessor : PortConnection connect dockingSample to dockingAssessmentOwner.dockingSample;
    connection dockingAssessmentToDecision : PortConnection connect dockingAssessmentOwner.dockingAssessment to transferDecisionOwner.dockingAssessment;
    connection supportShipToQualifier : PortConnection connect shipSample to shipProgressQualification.shipSample;
    connection shipProgressToDecision : PortConnection connect shipProgressQualification.qualifiedShipProgress to transferDecisionOwner.qualifiedShipProgress;
    connection supportWarehouseToQualifier : PortConnection connect warehouseSample to warehouseEvidenceQualification.warehouseSample;
    connection warehouseEvidenceToDecision : PortConnection connect warehouseEvidenceQualification.qualifiedWarehouseEvidence to transferDecisionOwner.qualifiedWarehouseEvidence;
    connection decisionToCommand : PortConnection connect transferDecisionOwner.commandResolution to transferCommandDerivation.resolution;
    connection decisionToReport : PortConnection connect transferDecisionOwner.reportResolution to transferReportDerivation.resolution;
    connection supportCommandToProcess : PortConnection connect transferCommandDerivation.command to command;
    connection supportStatusToProcess : PortConnection connect transferReportDerivation.supervisorStatus to supervisorStatus;
    connection supportFindingToProcess : PortConnection connect transferReportDerivation.verificationFinding to verificationFinding;
  }

  part def MiningCargoTransferSupervisorSystem :> System {
    part supervisionProcess : CargoTransferSupervisionProcess;
    port offloadRequest : DataPort { in :>> type : OffloadRequestSample; }
    port dockingStatus : DataPort { in :>> type : DockingSample; }
    port shipProgress : DataPort { in :>> type : ShipTransferSample; }
    port warehouseReceipt : DataPort { in :>> type : WarehouseReceiptSample; }
    port cargoTransferCommand : DataPort { out :>> type : CargoTransferCommand; }
    port transferSupervisorStatus : DataPort { out :>> type : TransferSupervisorStatus; }
    port transferVerificationFinding : DataPort { out :>> type : TransferVerificationFinding; }

    connection supportBoundaryRequest : PortConnection connect offloadRequest to supervisionProcess.requestSample;
    connection supportBoundaryDocking : PortConnection connect dockingStatus to supervisionProcess.dockingSample;
    connection supportBoundaryShip : PortConnection connect shipProgress to supervisionProcess.shipSample;
    connection supportBoundaryWarehouse : PortConnection connect warehouseReceipt to supervisionProcess.warehouseSample;
    connection supportBoundaryCommand : PortConnection connect supervisionProcess.command to cargoTransferCommand;
    connection supportBoundaryStatus : PortConnection connect supervisionProcess.supervisorStatus to transferSupervisorStatus;
    connection supportBoundaryFinding : PortConnection connect supervisionProcess.verificationFinding to transferVerificationFinding;
  }

  part miningCargoTransferSupervisor : MiningCargoTransferSupervisorSystem;
}
