package Factory_Flow {

  private import HAMR::*;

  // Closed finite domains are generated support for REP-01.
  enum def RequestPresence {
    enum None;
    enum Present;
  }

  enum def Validity {
    enum Valid;
    enum Invalid;
  }

  enum def WorkId {
    enum NoWork;
    enum W1;
    enum W2;
  }

  enum def ProductKind {
    enum AngleProduct;
    enum UnsupportedProduct;
  }

  enum def MaterialDisposition {
    enum Ready;
    enum Unavailable;
  }

  enum def FlowStep {
    enum Heating;
    enum Bending;
    enum Cutting;
    enum Drilling;
    enum Grinding;
    enum Polishing;
  }

  enum def StepDisposition {
    enum Ready;
    enum Blocked;
  }

  enum def ProcessEvent {
    enum NoEvent;
    enum InProgress;
    enum Completed;
    enum Failed;
  }

  enum def CommandAction {
    enum NoCommand;
    enum Start;
    enum Advance;
    enum Retry;
    enum Abort;
  }

  enum def ProductionResult {
    enum None;
    enum ProductionComplete;
    enum ProductionFailed;
  }

  enum def ProductionFlowStatus {
    enum Idle;
    enum Rejected;
    enum WaitingMaterial;
    enum WaitingStation;
    enum Started;
    enum Processing;
    enum Busy;
    enum Recovering;
    enum Advanced;
    enum Completed;
    enum Failed;
  }

  enum def LedgerPhase {
    enum Idle;
    enum Active;
    enum TransferPending;
    enum RecoveryPending;
    enum TerminalComplete;
    enum TerminalFailed;
  }

  enum def AttemptKind {
    enum First;
    enum Retry;
  }

  enum def AdmissionAssessment {
    enum NoRequest;
    enum Eligible;
    enum Malformed;
  }

  enum def MaterialAssessment {
    enum MaterialReady;
    enum MaterialUnavailable;
    enum MaterialUnknown;
  }

  enum def TargetQualification {
    enum HeatingReady;
    enum HeatingBlocked;
    enum HeatingUnknown;
    enum BendingReady;
    enum BendingBlocked;
    enum BendingUnknown;
    enum CuttingReady;
    enum CuttingBlocked;
    enum CuttingUnknown;
    enum DrillingReady;
    enum DrillingBlocked;
    enum DrillingUnknown;
    enum GrindingReady;
    enum GrindingBlocked;
    enum GrindingUnknown;
    enum PolishingReady;
    enum PolishingBlocked;
    enum PolishingUnknown;
  }

  enum def CorrelatedOutcomePlan {
    enum Preserve;
    enum IntermediateCompleted;
    enum FinalCompleted;
    enum FirstFailure;
    enum RetryFailure;
  }

  enum def IntentKind {
    enum NoIntent;
    enum FreshIntent;
    enum ActiveIntent;
    enum TransferIntent;
    enum RecoveryIntent;
    enum ResetIntent;
  }

  enum def CompetitorPresence {
    enum Absent;
    enum Present;
  }

  // Each literal denotes the distinct CASE-01..CASE-20 partition selected by PART-06.
  enum def FlowDecision {
    enum ResetComplete;
    enum ResetFailed;
    enum HoldActive;
    enum BusyActive;
    enum CompleteProduction;
    enum AdvanceNow;
    enum HoldTransfer;
    enum EnterRecovery;
    enum FailTerminal;
    enum ReleaseTransfer;
    enum WaitTransfer;
    enum RetryNow;
    enum WaitRecovery;
    enum IdleNoRequest;
    enum RejectMalformed;
    enum WaitMaterialUnavailable;
    enum WaitMaterialUnknown;
    enum WaitHeatingBlocked;
    enum WaitHeatingUnknown;
    enum StartWork;
  }

  enum def DecisionReason {
    enum ResetComplete;
    enum ResetFailed;
    enum Processing;
    enum ProtectedBusy;
    enum Completed;
    enum Advanced;
    enum TransferWaiting;
    enum RecoveryEntered;
    enum Failed;
    enum TransferReleased;
    enum RecoveryReleased;
    enum RecoveryWaiting;
    enum NoRequest;
    enum MalformedRequest;
    enum MaterialUnavailable;
    enum MaterialUnknown;
    enum HeatingBlocked;
    enum HeatingUnknown;
    enum Started;
  }

  // All fields inspected by contracts are attributes, never nested parts.
  part def PresentedWorkRequest :> Data {
    attribute presence : RequestPresence;
    attribute validity : Validity;
    attribute work_id : WorkId;
    attribute product : ProductKind;
  }

  part def MaterialHandoffObservation :> Data {
    attribute validity : Validity;
    attribute work_id : WorkId;
    attribute disposition : MaterialDisposition;
  }

  part def StepReadinessObservation :> Data {
    attribute validity : Validity;
    attribute step : Base_Types::Integer_32;
    attribute disposition : StepDisposition;
  }

  part def ProcessResultObservation :> Data {
    attribute validity : Validity;
    attribute work_id : WorkId;
    attribute step : Base_Types::Integer_32;
    attribute event_kind : ProcessEvent;
  }

  part def LineFlowCommand :> Data {
    attribute action_kind : CommandAction;
    attribute work_id : WorkId;
    attribute step : Base_Types::Integer_32;
  }

  part def ProductionOutcome :> Data {
    attribute result : ProductionResult;
    attribute work_id : WorkId;
  }

  part def AdmissionFact :> Data {
    attribute assessment : AdmissionAssessment;
    attribute work_id : WorkId;
  }

  part def MaterialFact :> Data {
    attribute assessment : MaterialAssessment;
  }

  part def FlowContext :> Data {
    attribute phase : LedgerPhase;
    attribute work_id : WorkId;
    attribute step_value : Base_Types::Integer_32;
    attribute attempt : AttemptKind;
  }

  part def OutcomeFact :> Data {
    attribute plan : CorrelatedOutcomePlan;
  }

  part def ProtectionContext :> Data {
    attribute phase : LedgerPhase;
    attribute work_id : WorkId;
    attribute step_value : Base_Types::Integer_32;
    attribute attempt : AttemptKind;
  }

  part def FlowIntentFact :> Data {
    attribute kind : IntentKind;
    attribute competitor : CompetitorPresence;
    attribute assessment : AdmissionAssessment;
    attribute phase : LedgerPhase;
    attribute work_id : WorkId;
    attribute step : Base_Types::Integer_32;
  }

  part def AuthorizationFact :> Data {
    attribute decision : FlowDecision;
    attribute reason : DecisionReason;
    attribute work_id : WorkId;
    attribute step : Base_Types::Integer_32;
  }

  part def FlowSnapshot :> Data {
    attribute phase : LedgerPhase;
    attribute work_id : WorkId;
    attribute step_value : Base_Types::Integer_32;
    attribute attempt : AttemptKind;
  }

  part def WorkRequestQualifier :> Thread {
    port presentedWork : DataPort { in :>> type : PresentedWorkRequest; }
    port admissionToMaterial : DataPort { out :>> type : AdmissionFact; }
    port admissionToPriority : DataPort { out :>> type : AdmissionFact; }

                        
                
                         
                                              
                                                                                         
                                                                      
                                                                                         
                                                                     

             
                     
                           
                                                                                                    
                                                                                
                     
                                                                                             
                                                                          
                                                                                             
                                                                         

                           
                                                                                                          
                                                                                    
                                                                      
                                                                 
                                                                  
                                                                              
                     
                                                                                            
                                                                    
                                                                                            
                                                                   

                           
                                                                                                          
                                                                                    
                                                                           
                                                                      
                                                                       
                                                                                    
                     
                                                                                             
                                                                          
                                                                                             
                                                                         
       
  }

  part def MaterialCorrelationQualifier :> Thread {
    port materialObservation : DataPort { in :>> type : MaterialHandoffObservation; }
    port admission : DataPort { in :>> type : AdmissionFact; }
    port materialFact : DataPort { out :>> type : MaterialFact; }

                        
                
                         
                                             
                                                                                      

             
                     
                           
                                                                                              
                                                                                       
                                                                            
                                                                
                                                                                         
                                                                                                

                           
                                                                                                          
                                                                                       
                                                                            
                                                                
                                                                                               
                                                                                                      

                           
                                                                                                        
                                                                                       
                                                                              
                                                               
                                                                                                  
       
  }

  part def TargetStepReadinessQualifier :> Thread {
    port readinessObservation : DataPort { in :>> type : StepReadinessObservation; }
    port flowContext : DataPort { in :>> type : FlowContext; }
    port targetFact : DataPort { out :>> type : TargetQualification; }

                        
               
                        
                                                                                  
                                     
                                          
                                          
                                          
                      

                         
                                                                 
                                                                                        
                                                                   
                                                                                            
                         

                         
                                                                                                
                                                                                  
                                                                                       
                                                                                       
                                                                                        
                                                                                        
                                                                

                         
                                                                                                  
                                                                                    
                                                                                         
                                                                                         
                                                                                          
                                                                                          
                                                                  

                         
                                                                                                  
                                                                                    
                                                                                         
                                                                                         
                                                                                          
                                                                                          
                                                                  

                
                         
                                           
                                                                         

             
                     
                           
                                                                                                
                                                                                  
                                                                                                      
                                                                                      
                                                                                                           

                           
                                                                                                    
                                                                                  
                                                                                                      
                                                                                        
                                                                                                             

                           
                                                                                                   
                                                                                    
                                                                                                     
                                                                                                             
       
  }

  part def ProcessOutcomeCorrelator :> Thread {
    port processResult : DataPort { in :>> type : ProcessResultObservation; }
    port flowContext : DataPort { in :>> type : FlowContext; }
    port outcomeToAuthorization : DataPort { out :>> type : OutcomeFact; }
    port outcomeToDeterminer : DataPort { out :>> type : OutcomeFact; }

                        
                
                         
                                            
                                                                                       
                                                                                   

             
                     
                           
                                                                                              
                                                                          
                                                                      
                                                            
                                                            
                                                                                
                                               
                     
                                                                                                        
                                                                                                    

                           
                                                                            
                                                                          
                                                                      
                                                            
                                                            
                                                                                
                                               
                     
                                                                                                 
                                                                                             

                           
                                                                                       
                                                                          
                                                                      
                                                            
                                                            
                                                                             
                                                                     
                     
                                                                                               
                                                                                           

                           
                                                                            
                                                                          
                                                                      
                                                            
                                                            
                                                                             
                                                                     
                     
                                                                                               
                                                                                           

                                
                                                                                                                      
                                                                          
                                                                        
                                                            
                                                            
                                                                              
                                                                                
                     
                                                                                           
                                                                                       
       
  }

  part def ProtectedWorkPriorityResolver :> Thread {
    port admission : DataPort { in :>> type : AdmissionFact; }
    port protectionContext : DataPort { in :>> type : ProtectionContext; }
    port intentFact : DataPort { out :>> type : FlowIntentFact; }

                        
                
                         
                                           
                                                                
                                                                            
                                                                                
                                                              
                                                             
                                    

             
                         
                                           
                                                                                
                                                                                
                                                                                
                                                                               

                        
                                             
                                                         
                                                      

                     
                           
                                                                                            
                                                                              
                                                                                 
                     
                                                                    
                                                                 
                                        

                           
                                                                                   
                                                                              
                                                                                 
                     
                                                                       
                                                       
                                        

                           
                                                                                        
                                                                               
                     
                                                                        
                                                               
                                                              

                           
                                                                                                    
                                                                                        
                     
                                                                          
                                                               
                                                              

                          
                                                                                                                  
                                                                                        
                     
                                                                          
                                                               
                                                              

                          
                                                                                        
                                                                                          
                                                                                  
                     
                                                                       
                                                               
                                                              
       
  }

  part def FlowAuthorizationOwner :> Thread {
    port materialFact : DataPort { in :>> type : MaterialFact; }
    port targetFact : DataPort { in :>> type : TargetQualification; }
    port outcomeFact : DataPort { in :>> type : OutcomeFact; }
    port intentFact : DataPort { in :>> type : FlowIntentFact; }
    port authorization : DataPort { out :>> type : AuthorizationFact; }
    port reasonToStatus : DataPort { out :>> type : DecisionReason; }

                        
               
                         
                                                                                         
                                                                   
                                                                   
                                                                   
                                                                    
                                                                    
                                                                    

                         
                                                                                           
                                                                     
                                                                     
                                                                     
                                                                      
                                                                      
                                                                      

                         
                                                                                           
                                                                     
                                                                     
                                                                     
                                                                      
                                                                      
                                                                      

                
                         
                                                  
                                                                              
                                                                          
                                                                
                                        
                                                                   

             
                     
                           
                                                                                           
                                                                            
                                                                             
                                                                                          
                                                                                  
                                                           
                                                     
                                                                           

                           
                                                                                      
                                                                            
                                                                           
                                                                                        
                                                                                
                                                           
                                                     
                                                                         

                           
                                                                                               
                                                                             
                                                                                
                                                                               
                                                                                       
                                                                               
                                                           
                                                     
                                                                        

                           
                                                                                         
                                                                             
                                                                                
                                                                                
                                                                                       
                                                                                  
                                                           
                                                     
                                                                           

                           
                                                                                                  
                                                                             
                                                                                     
                                                                                               
                                                                              
                                                           
                                                     
                                                                       

                           
                                                                                          
                                                                             
                                                                                             
                                      
                                                                                       
                                                                             
                                                           
                                                     
                                                                      

                           
                                                                                                               
                                                                             
                                                                                             
                                          
                                                                                         
                                                                                    
                                                           
                                                     
                                                                             

                           
                                                                                          
                                                                             
                                                                                   
                                                                                          
                                                                                    
                                                           
                                                     
                                                                             

                           
                                                                                               
                                                                             
                                                                                   
                                                                                         
                                                                           
                                                           
                                                     
                                                                    

                           
                                                                                               
                                                                               
                                      
                                                                                            
                                                                                     
                                                           
                                                     
                                                                              

                           
                                                                                      
                                                                               
                                          
                                                                                         
                                                                                    
                                                           
                                                     
                                                                             

                           
                                                                                                 
                                                                               
                                      
                                                                                     
                                                                                     
                                                           
                                                     
                                                                              

                           
                                                                                   
                                                                               
                                          
                                                                                         
                                                                                    
                                                           
                                                     
                                                                             

                           
                                                                
                                                                         
                                                                                   
                                                                                          
                                                                              
                                                                    
                                            
                                                                       

                           
                                                                       
                                                                         
                                                                                   
                                                                                            
                                                                                     
                                                                    
                                            
                                                                              

                           
                                                                                                    
                                                                            
                                                                                              
                                                                                                    
                                                                                        
                                                           
                                            
                                                                                 

                           
                                                                                               
                                                                            
                                                                                          
                                                                                                
                                                                                    
                                                           
                                            
                                                                             

                           
                                                                                                 
                                                                            
                                                                                         
                                        
                                                                                               
                                                                                   
                                                           
                                            
                                                                            

                           
                                                                                                             
                                                                            
                                                                                         
                                        
                                                                                               
                                                                                   
                                                           
                                            
                                                                            

                           
                                                                                                   
                                                                            
                                                                                         
                                      
                                                                                      
                                                                            
                                                           
                                            
                                                                     
       
  }

  part def FlowLedger :> Thread {
    port authorization : DataPort { in :>> type : AuthorizationFact; }
    port contextToReadiness : DataPort { out :>> type : FlowContext; }
    port contextToOutcome : DataPort { out :>> type : FlowContext; }
    port protectionContext : DataPort { out :>> type : ProtectionContext; }
    port snapshotToOutcome : DataPort { out :>> type : FlowSnapshot; }
    port snapshotToStatus : DataPort { out :>> type : FlowSnapshot; }
    port lineCommand : DataPort { out :>> type : LineFlowCommand; }

                        
           
                          
                                         
                          
                                         
                          
                                           
                          
                                           

               
                        
                                                                              
                                                                                     
                                                                                          
                                                                                           
                                                                                            
                                                

                        
                                                                             
                                                             
                                                                  
                                                                  
                                                                   
                                                                   
                      

                
                          
                                           
                                                   
                                                     
                                                        
                                                      
                                                                      
                                                                     
                                                   
                                                                         
                                                                    
                                                                   
                                                 
                                                                       
                                                                     
                                                                    
                                                  
                                                                        
                                                                     
                                                                    
                                                  
                                                                        
                                                                    
                                                                   
                                                 
                                                                       
                                                                            
                                                              
                                     

             
                                                                                  
                        
                                          
                                                 
                                                        
                                                                     
                                                     
                                               
                                                      
                                                                   
                                                   
                                                
                                                       
                                                                    
                                                   

                         
                                          
                                            
                                                   
                                                                
                                                
                                           
                                                  
                                                               
                                              

                     
                           
                                                                                  
                                                                                      
                                                               
                                                         
                                                            
                                                          
                                                                                
                                                                  
                                         

                           
                                                                             
                                                                                    
                                                               
                                                         
                                                            
                                                          
                                                                                
                                                                  
                                         

                           
                                                                                    
                                                                                   
                                                                         
                                                                     
                                                                                
                                                                                                   

                           
                                                                                    
                                                                                   
                                                                         
                                                                     
                                                                                
                                                                                                   

                           
                                                                                       
                                                                                           
                                                                           
                                                                                                    
                                                                                
                                                                                                   

                           
                                                                                          
                                                                                   
                                                                 
                                                                                      
                                                          
                                                                              
                                                                                                              

                           
                                                                                          
                                                                                     
                                                                          
                                                                                      
                                                          
                                                                                
                                                                                                              

                           
                                                                                                       
                                                                                      
                                                                          
                                                                           
                                                          
                                                                                
                                                                                                   

                           
                                                                                           
                                                                                     
                                                                         
                                                                           
                                                          
                                                                            
                                                                                                   

                           
                                                                                       
                                                                                        
                                                                 
                                                                           
                                                          
                                                                              
                                                                                                   

                           
                                                                                        
                                                                                     
                                                                         
                                                                     
                                                                                
                                                                                                   

                           
                                                                                               
                                                                                 
                                                                 
                                                                           
                                                          
                                                                            
                                                                                                   

                           
                                                                                          
                                                                                     
                                                                         
                                                                     
                                                                                
                                                                                                   

                           
                                                                              
                                                                                      
                                                                                                           
                                                                                                         
                                                                                
                                                                                              

                           
                                                                             
                                                                                        
                                                                                                           
                                                                                                         
                                                                                
                                                                                              

                           
                                                                                                 
                                                                                                
                                                                                                           
                                                                                                         
                                                                                
                                                                                              

                           
                                                                                         
                                                                                            
                                                                                                           
                                                                                                         
                                                                                
                                                                                              

                           
                                                                                       
                                                                                           
                                                                                                           
                                                                                                         
                                                                                
                                                                                              

                           
                                                                                                 
                                                                                           
                                                                                                           
                                                                                                         
                                                                                
                                                                                              

                           
                                                                             
                                                                                  
                                                                 
                                                   
                                                            
                                                          
                                                                            
                                                            
                                         
       
  }

  part def ProductionOutcomeDeterminer :> Thread {
    port outcomeFact : DataPort { in :>> type : OutcomeFact; }
    port appliedSnapshot : DataPort { in :>> type : FlowSnapshot; }
    port productionOutcome : DataPort { out :>> type : ProductionOutcome; }

                        
                
                         
                                                  
                                                                           
                                                                   

             
                     
                           
                                                                                                                 
                                                                                        
                                                                                     
                                                                                                     
                                                                   

                           
                                                                                                        
                                                                                      
                                                                                   
                                                                                                   
                                                                   

                          
                                                                                                            
                                                                                             
                                                                                                 
                                                                                      
                                                                                         
                                                                                       
                                                                       
       
  }

  part def FlowStatusDeterminer :> Thread {
    port decisionReason : DataPort { in :>> type : DecisionReason; }
    port appliedSnapshot : DataPort { in :>> type : FlowSnapshot; }
    port flowStatus : DataPort { out :>> type : ProductionFlowStatus; }

                        
                
                         
                                           
                                                                

             
                     
                           
                                                                                                      
                                                                                       
                                                                                 

                           
                                                                                              
                                                                                     
                                                                              

                           
                                                                                                
                                                                                      
                                                                                  

                           
                                                                                    
                                                                              
                                                                              
                                                                                  

                           
                                                                                            
                                                                                      
                                                                                      

                           
                                                                                
                                                                            
                                                                              
                                                                                

                           
                                                                                                       
                                                                            
                                                                                   
                                                                               
                                                                                       

                           
                                                                                                          
                                                                            
                                                                              
                                                                              
                                                                                      

                           
                                                                                                 
                                                                              
                                                                     
                                                                               

                           
                                                                                             
                                                                              
                                                                        
                                                                                
                                                                                

                           
                                                                               
                                                                              
                                                                           
                                                                            

                           
                                                                                              
                                                                              
                                                                        
                                                                                  

                           
                                                                                                  
                                                                            
                                                                         
                                                                             
                                                                           
                                                                            
       
  }

  // Behavior-free generated support permitted by SUPPORT-01.
  part def FlowSupervisorProcess :> Process {
    port presentedWork : DataPort { in :>> type : PresentedWorkRequest; }
    port materialObservation : DataPort { in :>> type : MaterialHandoffObservation; }
    port readinessObservation : DataPort { in :>> type : StepReadinessObservation; }
    port processResult : DataPort { in :>> type : ProcessResultObservation; }
    port lineCommand : DataPort { out :>> type : LineFlowCommand; }
    port productionOutcome : DataPort { out :>> type : ProductionOutcome; }
    port flowStatus : DataPort { out :>> type : ProductionFlowStatus; }

    part workRequestQualifier : WorkRequestQualifier;
    part materialCorrelationQualifier : MaterialCorrelationQualifier;
    part targetStepReadinessQualifier : TargetStepReadinessQualifier;
    part processOutcomeCorrelator : ProcessOutcomeCorrelator;
    part protectedWorkPriorityResolver : ProtectedWorkPriorityResolver;
    part flowAuthorizationOwner : FlowAuthorizationOwner;
    part flowLedger : FlowLedger;
    part productionOutcomeDeterminer : ProductionOutcomeDeterminer;
    part flowStatusDeterminer : FlowStatusDeterminer;

    // Four semantic boundary-input deliveries.
    connection int01 : PortConnection
      connect presentedWork to workRequestQualifier.presentedWork;
    connection int02 : PortConnection
      connect materialObservation to materialCorrelationQualifier.materialObservation;
    connection int03 : PortConnection
      connect readinessObservation to targetStepReadinessQualifier.readinessObservation;
    connection int04 : PortConnection
      connect processResult to processOutcomeCorrelator.processResult;

    // Fourteen responsibility-bearing internal interactions.
    connection int05 : PortConnection
      connect workRequestQualifier.admissionToMaterial to materialCorrelationQualifier.admission;
    connection int06 : PortConnection
      connect workRequestQualifier.admissionToPriority to protectedWorkPriorityResolver.admission;
    connection int07 : PortConnection
      connect materialCorrelationQualifier.materialFact to flowAuthorizationOwner.materialFact;
    connection int08 : PortConnection
      connect targetStepReadinessQualifier.targetFact to flowAuthorizationOwner.targetFact;
    connection int09 : PortConnection
      connect processOutcomeCorrelator.outcomeToAuthorization to flowAuthorizationOwner.outcomeFact;
    connection int10 : PortConnection
      connect protectedWorkPriorityResolver.intentFact to flowAuthorizationOwner.intentFact;
    connection int11 : PortConnection
      connect flowAuthorizationOwner.authorization to flowLedger.authorization;
    connection int12 : PortConnection
      connect flowLedger.contextToReadiness to targetStepReadinessQualifier.flowContext;
    connection int13 : PortConnection
      connect flowLedger.contextToOutcome to processOutcomeCorrelator.flowContext;
    connection int14 : PortConnection
      connect flowLedger.protectionContext to protectedWorkPriorityResolver.protectionContext;
    connection int15 : PortConnection
      connect processOutcomeCorrelator.outcomeToDeterminer to productionOutcomeDeterminer.outcomeFact;
    connection int16 : PortConnection
      connect flowAuthorizationOwner.reasonToStatus to flowStatusDeterminer.decisionReason;
    connection int17 : PortConnection
      connect flowLedger.snapshotToOutcome to productionOutcomeDeterminer.appliedSnapshot;
    connection int18 : PortConnection
      connect flowLedger.snapshotToStatus to flowStatusDeterminer.appliedSnapshot;

    // Three semantic boundary-output deliveries.
    connection int19 : PortConnection
      connect flowLedger.lineCommand to lineCommand;
    connection int20 : PortConnection
      connect productionOutcomeDeterminer.productionOutcome to productionOutcome;
    connection int21 : PortConnection
      connect flowStatusDeterminer.flowStatus to flowStatus;
  }

  part def FactoryFlowSupervisor :> System {
    port presentedWork : DataPort { in :>> type : PresentedWorkRequest; }
    port materialObservation : DataPort { in :>> type : MaterialHandoffObservation; }
    port readinessObservation : DataPort { in :>> type : StepReadinessObservation; }
    port processResult : DataPort { in :>> type : ProcessResultObservation; }
    port lineCommand : DataPort { out :>> type : LineFlowCommand; }
    port productionOutcome : DataPort { out :>> type : ProductionOutcome; }
    port flowStatus : DataPort { out :>> type : ProductionFlowStatus; }

    part supervisorProcess : FlowSupervisorProcess;

    // Seven unchanged generated-support delegations; excluded from INT-01..INT-21.
    connection support01 : PortConnection
      connect presentedWork to supervisorProcess.presentedWork;
    connection support02 : PortConnection
      connect materialObservation to supervisorProcess.materialObservation;
    connection support03 : PortConnection
      connect readinessObservation to supervisorProcess.readinessObservation;
    connection support04 : PortConnection
      connect processResult to supervisorProcess.processResult;
    connection support05 : PortConnection
      connect supervisorProcess.lineCommand to lineCommand;
    connection support06 : PortConnection
      connect supervisorProcess.productionOutcome to productionOutcome;
    connection support07 : PortConnection
      connect supervisorProcess.flowStatus to flowStatus;
  }

  // The one explicit generated root System usage.
  part factoryFlowSupervisor : FactoryFlowSupervisor;
}
