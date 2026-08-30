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
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port requestSample : DataPort { in :>> type : OffloadRequestSample; }
    port qualifiedRequest : DataPort { out :>> type : QualifiedRequest; }

                        
               
                             
                                                                             
                                                                                    
                                                                                                                         
                                                   
                
                                  
                                                                                                             
                                                                  
             
                             
                                                                                                              
                                                            
       
  }

  part def DockingAssessmentOwner :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port dockingSample : DataPort { in :>> type : DockingSample; }
    port dockingAssessment : DataPort { out :>> type : DockingAssessment; }

                        
               
                              
                                                                      
                                                                                     
                                                                                                   
                                                     
                
                                   
                                                                                          
                                                                
             
                              
                                                                                                      
                                                            
       
  }

  part def ShipProgressQualification :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port shipSample : DataPort { in :>> type : ShipTransferSample; }
    port qualifiedShipProgress : DataPort { out :>> type : QualifiedShipProgress; }

                        
               
                              
                                                                             
                                                                                              
                                                                                                            
                                                                                                        
                                                                                                    
                                              
                
                                   
                                                                                              
                                                                  
             
                              
                                                                                                       
                                                           
       
  }

  part def WarehouseEvidenceQualification :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port warehouseSample : DataPort { in :>> type : WarehouseReceiptSample; }
    port qualifiedWarehouseEvidence : DataPort { out :>> type : QualifiedWarehouseEvidence; }

                        
               
                            
                                                                                           
                                                                                                        
                                                                                                                                     
                                                                                                                                   
                                                             
                
                                 
                                                                                                
                                                                                      
             
                            
                                                                                                                    
                                                                          
       
  }

  part def TransferDecisionOwner :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port qualifiedRequest : DataPort { in :>> type : QualifiedRequest; }
    port dockingAssessment : DataPort { in :>> type : DockingAssessment; }
    port qualifiedShipProgress : DataPort { in :>> type : QualifiedShipProgress; }
    port qualifiedWarehouseEvidence : DataPort { in :>> type : QualifiedWarehouseEvidence; }
    port commandResolution : DataPort { out :>> type : TransferResolution; }
    port reportResolution : DataPort { out :>> type : TransferResolution; }

                        
           
                          
                                     
                          
                                           

               
                             
                                                                             
                                                                                                                  
                                                      
                                                       
                                                             
                                                                           
                            
                                                                           
                                                                                  
                                                          
                                                  
                                                                     
                         
                                                                                  
                                                                                                                      
                                                        
                         
                                                                                  
                                                                                   
                                                                                         
                                                                                                        
                         
                                                                            
                                                                                                                      
                                                                                                 
                                                             
                                                     
                                                                             
                                                        
                                                                               
                                                         
                                                                                                    
                         
                                                                                
                                                                                            
                                       
                                                   
                                                                       
                         
                                                                             
                                                                                
                                                                                             
                                                        
                         
                                                                           
                                                                              
                                                                                             
                                                           
                         
                                                                                   
                                                                                               
                                                                                                   
                                                                            
                         
                                                                                
                                                                                            
                                                                                                   
                                                                     
                         
                                                                                                                   
                                                  
                                                                            
                         
                                                                          
                                                                                              

                
                         
                                                                                                                    
                                                                    
                                                             
                                                    
                                                                            
                                                            
                                                   
                                                                          

             
                          
                                                                                           
                                                                    
                           
                                                                                                                     
                                                                     
                                                                                     
                                                                        

                     
                           
                                                                                                                  
                                                                                                                      
                                                                                
                                                                                                                    
                                                                                       
                                                                                                                  
                                                                                     
                           
                                                                                                  
                                                                                                                           
                                                                                                                           
                                                                                
                                                                                                                    
                                                                                         
                                                                                                                  
                                                                                       
                           
                                                                                                             
                                                                                                                           
                                                                                                                                
                                                                                                                                              
                                                                                
                                                                                                                    
                                                                                         
                                                                                                                  
                                                                                       
                           
                                                                                                                       
                                                                                                                           
                                                                                                                                
                                                                                                                                                   
                                                                                                                           
                                                                                
                                                                                                                    
                                                                                                
                                                                                                                  
                                                                                              
                           
                                                                                                                           
                                                                                                                           
                                                                                                                                
                                                                                                                                                   
                                                                                                                                
                                                                                                           
                                                                                
                                                                                                                    
                                                                                                   
                                                                                                                  
                                                                                                 
                           
                                                                                           
                                                                                                                           
                                                                                                                                
                                                                                                                                                   
                                                                                                                                
                                                                                                                
                                                                                            
                                                                                               
                                                                                                                                   
                                                                                          
                                                                                                                                 
                                                                                        
                           
                                                                                                         
                                                                                                                           
                                                                                                                                
                                                                                                                                                   
                                                                                                                                
                                                                                                                
                                                                                                 
                                                                                          
                                                                                
                                                                                                                    
                                                                                        
                                                                                                                  
                                                                                      
                           
                                                                                                              
                                                                                                                           
                                                                                                                                
                                                                                                                                                   
                                                                                                                                
                                                                                                                
                                                                                                 
                                                                                               
                                                                                                              
                                                                                
                                                                                                                    
                                                                                              
                                                                                                                  
                                                                                            
                           
                                                                                                           
                                                                                                                           
                                                                                                                                
                                                                                                                                                   
                                                                                                                                
                                                                                                                
                                                                                                 
                                                                                               
                                                                                                                   
                                                                                                           
                                                                                           
                                                                                                                               
                                                                                           
                                                                                                                             
                                                                                         
                           
                                                                                                                
                                                                                                                           
                                                                                                                                
                                                                                                                                                   
                                                                                                                                
                                                                                                                
                                                                                                 
                                                                                               
                                                                                                                   
                                                                                                                
                                                                                     
                                                                                
                                                                                                                    
                                                                                            
                                                                                                                  
                                                                                          
                           
                                                                                                      
                                                                                                                           
                                                                                                                                
                                                                                                                                                   
                                                                                                                                
                                                                                                                
                                                                                                 
                                                                                               
                                                                                                                   
                                                                                                                
                                                                                          
                                                       
                                                                               
                                                                                                                   
                                                                                          
                                                                                                                 
                                                                                        
                           
                                                                                                            
                                                                                                                           
                                                                                                                                
                                                                                                                                                   
                                                                                                                                
                                                                                                                
                                                                                                 
                                                                                               
                                                                                                                   
                                                                                                                
                                                                                          
                                                           
                                                                                
                                                                                                                    
                                                                                        
                                                                                                                  
                                                                                      
       
  }

  part def TransferCommandDerivation :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port resolution : DataPort { in :>> type : TransferResolution; }
    port command : DataPort { out :>> type : CargoTransferCommand; }
                        
               
                         
                                                                          
                                                                                                        
                                         
                
                         
                                                                                                        
             
                         
                                                                                              
                                            
       
  }

  part def TransferReportDerivation :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port resolution : DataPort { in :>> type : TransferResolution; }
    port supervisorStatus : DataPort { out :>> type : TransferSupervisorStatus; }
    port verificationFinding : DataPort { out :>> type : TransferVerificationFinding; }
                        
               
                           
                                                                             
                                                                                                       
                                                                                                                   
                                                                                                                                                                
                                                                                                                        
                                                                                                                                
                                                                                                                    
                                                                                                            
                                                                                                                                                                                    
                                                                                                                     
                                                                                                                 
                                                        
                           
                                                                                 
                                                                            
                                                                                                                    
                                                                               
                                                                                                                  
                                                          
                
                         
                                                                                           
                                                              
                                                                            
             
                           
                                                                                                      
                                                     
                                                        
       
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
