package Forest_Observation_Eligibility_Supervisor {

  private import HAMR::*;

  enum def RequestCommand { enum NoCommand; enum Begin; enum Cancel; }
  enum def RequestToken { enum TokenA; enum TokenB; }

  // Every record member inspected by GUMBO is an attribute, never a nested part.
  part def RequestInput :> Data {
    attribute command : RequestCommand;
    attribute token : RequestToken;
  }

  enum def EnergyEvidence {
    enum AdequateCurrent; enum LowCurrent; enum UnknownCurrent; enum Invalid; enum Stale;
  }
  enum def CameraEvidence {
    enum AvailableCurrent; enum UnavailableCurrent; enum UnknownCurrent; enum Invalid; enum Stale;
  }
  enum def RadioEvidence {
    enum AvailableCurrent; enum UnavailableCurrent; enum UnknownCurrent; enum Invalid; enum Stale;
  }
  enum def ObservationProgress { enum Idle; enum Active; enum Completed; enum Failed; }
  enum def ObservationAuthorization { enum Withhold; enum Permit; }
  enum def EligibilityStatus {
    enum Idle; enum Evaluating; enum Authorized; enum Active; enum DeniedPower;
    enum DeniedSupport; enum DuplicateIgnored; enum Busy; enum Cancelled;
    enum Completed; enum ServiceFailed; enum AwaitingRecovery;
  }
  enum def EvaluationTicket { enum NoTicket; enum TokenA; enum TokenB; }
  enum def RequestContext {
    enum NoContext; enum EvaluateTokenA; enum EvaluateTokenB; enum CancelOutstanding;
  }
  enum def EnergyVerdict {
    enum NoEnergyVerdict; enum EnergyReady; enum EnergyInsufficient; enum EnergyUntrusted;
  }

  enum def TaggedTicket { enum NoTicket; enum TokenA; enum TokenB; }

  part def TaggedEnergyVerdict :> Data {
    attribute verdict : EnergyVerdict;
    attribute ticket : TaggedTicket;
  }

  enum def SupportVerdict {
    enum NoSupportVerdict; enum SupportReady; enum SupportUnavailable; enum SupportUntrusted;
  }

  part def TaggedSupportVerdict :> Data {
    attribute verdict : SupportVerdict;
    attribute ticket : TaggedTicket;
  }

  enum def EligibilityDecision {
    enum NoDecision; enum Permit; enum DenyPower; enum DenySupport; enum Withdraw;
  }
  enum def GateOutcome {
    enum None; enum DeniedPower; enum DeniedSupport; enum Authorized; enum Active;
    enum Cancelled; enum Completed; enum Failed; enum Recovered;
  }
  enum def RequestState { enum Idle; enum Pending; enum Engaged; enum RecoveryHold; }
  enum def LastAcceptedToken { enum None; enum TokenA; enum TokenB; }
  enum def GatePhase { enum Closed; enum Authorized; enum Active; enum FailureHold; }

  part def RequestLifecycle :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port requestInput : DataPort { in :>> type : RequestInput; }
    port gateOutcome : DataPort { in :>> type : GateOutcome; }
    port energyTicket : DataPort { out :>> type : EvaluationTicket; }
    port supportTicket : DataPort { out :>> type : EvaluationTicket; }
    port requestContext : DataPort { out :>> type : RequestContext; }
    port eligibilityStatus : DataPort { out :>> type : EligibilityStatus; }

                        
           
                          
                                    
                          
                                              

                
                 
                           
                                                                                                
                                               
                                                         
                                                       
                                                        
                                                        
                                                        

             
                        
                                                                                                                         
                                                         
                                                          
                                                       
                                                        
                                                       
                                                       

                     
                           
                                                                                                                
                                                     
                                                                 
                                                          
                                                         
                                                          
                                                          
                                                                   

                           
                                                                                                                          
                                                        
                                                         
                                                          
                                                         
                                                          
                                                          
                                                          

                            
                                                                                    
                                                          
                                                         
                                                          
                                                                                                      
                                                                                                              

                            
                                                                                        
                                                            
                                                         
                                                          
                                                                                                      
                                                                                                                

                           
                                                                                           
                                                        
                                                         
                                                          
                                                                                                      
                                                                                                            

                           
                                                                                         
                                                        
                                                         
                                                          
                                                                                                      
                                                                                                            

                            
                                                                                              
                                                         
                                                            
                                                          
                                                                                                      
                                                                                                             

                            
                                                                                        
                                                     
                                                            
                                                          
                                                                                                      
                                                                                                         

                          
                                                                                                                               
                                                                                                      
                                                                                                     
                                                                                                      
                                                          
                                                                                                               
                                                                                                                        
                                                                                                                    
                                                                                                                                  

                           
                                                                                                                         
                                                                                                    
                                                                                                    
                                                                                                     
                                                                                                      
                                                                  
                                                                

                          
                                                                                                                     
                                                                                                    
                                                                                                      
                                                                                                     
                                                                                                      
                                                          
                                                                                                               
                                                                                                                                  

                           
                                                                                                     
                                                                                                   
                                                            
                                                                                                              
                                                                                                      
                                                                                                                   

                           
                                                                                       
                                                                                                   
                                                                                                             
                                                            
                                                                                                     
                                                                                                      
                                                                                                                   

                           
                                                                                       
                                                                                                   
                                                                                                             
                                                            
                                                                                                     
                                                                                                      
                                                                                                                   

                          
                                                                                            
                                                                                                   
                                                                                                             
                                                    
                                                                                                            
                                                                                                  
                                                                                                                  

                          
                                                                                            
                                                                                                   
                                                                                                             
                                                    
                                                                                                            
                                                                                                  
                                                                                                                  

                           
                                                                                                  
                                                                                                   
                                                                                                             
                                                                                                    
                                                                                                     
                                                                                                      
                                                                                                       

                           
                                                                                                  
                                                                                                   
                                                                                                             
                                                                                                    
                                                                                                     
                                                                                                      
                                                                                                       
       
  }

  part def EnergyAssessor :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port energyEvidence : DataPort { in :>> type : EnergyEvidence; }
    port evaluationTicket : DataPort { in :>> type : EvaluationTicket; }
    port energyVerdictOut : DataPort { out :>> type : TaggedEnergyVerdict; }

                        
                
                 
                           
                                                                                                  
                                                                       
                                                             

             
                     
                          
                                                                                             
                                                                 
                                                                        
                                                                        

                            
                                                                                                         
                                                                                                                    
                                                                            
                                                                   
                                                                    
                                                                   
                                                                    

                           
                                                                                                                  
                                                                                                               
                                                                            
                                                                   
                                                                    
                                                                   
                                                                           

                           
                                                                                                                 
                                                                  
                                                                
                                                         
                                                       
                                                                            
                                                                   
                                                                    
                                                                   
                                                                        
       
  }

  part def ObservationSupportAssessor :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port cameraEvidence : DataPort { in :>> type : CameraEvidence; }
    port radioEvidence : DataPort { in :>> type : RadioEvidence; }
    port evaluationTicket : DataPort { in :>> type : EvaluationTicket; }
    port supportVerdictOut : DataPort { out :>> type : TaggedSupportVerdict; }

                        
                
                 
                           
                                                                                                    
                                                               
                                                                         

             
                     
                          
                                                                                               
                                                                 
                                                                         
                                                                           

                            
                                                                                                          
                                                                  
                                                                 
                                                              
                                                                            
                                                                    
                                                                    
                                                                    
                                                                       

                           
                                                                                                          
                                                                  
                                                                
                                                         
                                                       
                                                              
                                                       
                                                     
                                                                            
                                                                    
                                                                    
                                                                    
                                                                           

                           
                                                                                                             
                                                                  
                                                                                                                                                   
                                                                                                                                             
                                                                                                                        
                                                                            
                                                                    
                                                                    
                                                                    
                                                                             
       
  }

  part def EligibilityArbiter :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port requestContext : DataPort { in :>> type : RequestContext; }
    port energyVerdictIn : DataPort { in :>> type : TaggedEnergyVerdict; }
    port supportVerdictIn : DataPort { in :>> type : TaggedSupportVerdict; }
    port eligibilityDecision : DataPort { out :>> type : EligibilityDecision; }

                        
                
                 
                           
                                                                                    
                                                                  

             
                     
                           
                                                                                         
                                                                      
                                                                          

                           
                                                                                                                           
                                                                      
                                                                                                                      
                                                                      
                                                                                                                       
                                                                           
                                                                          
                                                                           

                           
                                                                                                                     
                                                                      
                                                                                                                      
                                                                      
                                                                                                                       
                                                                        
                                                                          
                                                                           

                           
                                                                                                             
                                                                      
                                                                                                                      
                                                                      
                                                                                                                       
                                                                    
                                                                            
                                                                             

                           
                                                                                                         
                                                                      
                                                                                                                      
                                                                      
                                                                                                                       
                                                                    
                                                                          
                                                                             

                           
                                                                                     
                                                                      
                                                                                                                      
                                                                      
                                                                                                                       
                                                                    
                                                                      
                                                                        

                            
                                                                                                                                  
                                                                       
                                                                      
                                                                                                                      
                                                                      
                                                                                                                       
                                                                             
                                                                                
                                                                            
       
  }

  part def AuthorizationGate :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port observationProgress : DataPort { in :>> type : ObservationProgress; }
    port eligibilityDecision : DataPort { in :>> type : EligibilityDecision; }
    port gateOutcome : DataPort { out :>> type : GateOutcome; }
    port observationAuthorization : DataPort { out :>> type : ObservationAuthorization; }

                        
           
                          
                              

                
                 
                           
                                                                                                   
                                           
                                                                           
                                            

             
                          
                                                                                                   
                                                      
                                                                            

                     
                           
                                                                                                
                                                                                                            
                                                     
                                                                                                                   

                          
                                                                                                   
                                                                                                            
                                                          
                                                                                                              

                           
                                                                                                          
                                                                                                              
                                                          
                                                                                                                

                           
                                                                                                        
                                                                                                         
                                                          
                                                                                                                

                           
                                                                                                                              
                                                                                                       
                                                          
                                                                                                                

                           
                                                                                                                
                                                           
                                                                 
                                                                                                           
                                                                                                         
                                                                  
                                                     
                                                                                                                   

                           
                                                                                                             
                                                                                                
                                                                    
                                                                  
                                                     
                                                                                                                   

                           
                                                                                                    
                                                                                                               
                                                                                                           
                                                                                                         
                                                                                                
                                                                          
                                                                   
                                                     
                                                                                                                     

                           
                                                                                                        
                                                                                                               
                                                                                                           
                                                                                                         
                                                                                                
                                                                          
                                                                     
                                                     
                                                                                                                       

                           
                                                                                      
                                                                                                        
                                                                
                                                         
                                                                                                                  

                            
                                                                                                                          
                                                                                                
                                                                 
                                                                   
                                                                    
                                                                     
                                                     
                                                                                                              

                          
                                                                                                             
                                                                                                            
                                                                                                                          
                                                         
                                                                                                                  

                          
                                                                                                 
                                                      
                                                                                                                     
                                                                                                                          
                                                                      
                                                                                                                        
                                                     
                                                                                                              
       
  }

  part def EligibilitySupervisionProcess :> Process {
    port requestInput : DataPort { in :>> type : RequestInput; }
    port energyEvidence : DataPort { in :>> type : EnergyEvidence; }
    port cameraEvidence : DataPort { in :>> type : CameraEvidence; }
    port radioEvidence : DataPort { in :>> type : RadioEvidence; }
    port observationProgress : DataPort { in :>> type : ObservationProgress; }
    port observationAuthorization : DataPort { out :>> type : ObservationAuthorization; }
    port eligibilityStatus : DataPort { out :>> type : EligibilityStatus; }

    part requestLifecycle : RequestLifecycle;
    part energyAssessor : EnergyAssessor;
    part observationSupportAssessor : ObservationSupportAssessor;
    part eligibilityArbiter : EligibilityArbiter;
    part authorizationGate : AuthorizationGate;

    connection processInt01 : PortConnection connect requestInput to requestLifecycle.requestInput;
    connection processInt02 : PortConnection connect energyEvidence to energyAssessor.energyEvidence;
    connection processInt03 : PortConnection connect cameraEvidence to observationSupportAssessor.cameraEvidence;
    connection processInt04 : PortConnection connect radioEvidence to observationSupportAssessor.radioEvidence;
    connection processInt05 : PortConnection connect observationProgress to authorizationGate.observationProgress;
    connection processInt06 : PortConnection connect requestLifecycle.energyTicket to energyAssessor.evaluationTicket;
    connection processInt07 : PortConnection connect requestLifecycle.supportTicket to observationSupportAssessor.evaluationTicket;
    connection processInt08 : PortConnection connect requestLifecycle.requestContext to eligibilityArbiter.requestContext;
    connection processInt09 : PortConnection connect energyAssessor.energyVerdictOut to eligibilityArbiter.energyVerdictIn;
    connection processInt10 : PortConnection connect observationSupportAssessor.supportVerdictOut to eligibilityArbiter.supportVerdictIn;
    connection processInt11 : PortConnection connect eligibilityArbiter.eligibilityDecision to authorizationGate.eligibilityDecision;
    connection processInt12 : PortConnection connect authorizationGate.gateOutcome to requestLifecycle.gateOutcome;
    connection processInt13 : PortConnection connect authorizationGate.observationAuthorization to observationAuthorization;
    connection processInt14 : PortConnection connect requestLifecycle.eligibilityStatus to eligibilityStatus;
  }

  part def ForestObservationEligibilitySupervisor :> System {
    port requestInput : DataPort { in :>> type : RequestInput; }
    port energyEvidence : DataPort { in :>> type : EnergyEvidence; }
    port cameraEvidence : DataPort { in :>> type : CameraEvidence; }
    port radioEvidence : DataPort { in :>> type : RadioEvidence; }
    port observationProgress : DataPort { in :>> type : ObservationProgress; }
    port observationAuthorization : DataPort { out :>> type : ObservationAuthorization; }
    port eligibilityStatus : DataPort { out :>> type : EligibilityStatus; }

    part eligibilitySupervisionProcess : EligibilitySupervisionProcess;

    connection rootInt01 : PortConnection connect requestInput to eligibilitySupervisionProcess.requestInput;
    connection rootInt02 : PortConnection connect energyEvidence to eligibilitySupervisionProcess.energyEvidence;
    connection rootInt03 : PortConnection connect cameraEvidence to eligibilitySupervisionProcess.cameraEvidence;
    connection rootInt04 : PortConnection connect radioEvidence to eligibilitySupervisionProcess.radioEvidence;
    connection rootInt05 : PortConnection connect observationProgress to eligibilitySupervisionProcess.observationProgress;
    connection rootInt13 : PortConnection connect eligibilitySupervisionProcess.observationAuthorization to observationAuthorization;
    connection rootInt14 : PortConnection connect eligibilitySupervisionProcess.eligibilityStatus to eligibilityStatus;
  }

  part forestObservationEligibilitySupervisor : ForestObservationEligibilitySupervisor;
}
