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

    language "GUMBO" /*{
      state
        requestState : RequestState;
        lastAcceptedToken : LastAcceptedToken;
                
                                                 
                                                                                                                   
                                                                                                                                                                                                                                                                              
      compute
        modifies requestState, lastAcceptedToken;
        guarantee INACTIVE_PIPELINE_COHERENCE "energyTicket and supportTicket must agree":
          (energyTicket == EvaluationTicket.NoTicket) == (supportTicket == EvaluationTicket.NoTicket) & (energyTicket == EvaluationTicket.TokenA) == (supportTicket == EvaluationTicket.TokenA) & (energyTicket == EvaluationTicket.TokenB) == (supportTicket == EvaluationTicket.TokenB);
        compute_cases
          case LIFECYCLE_FAILED_FEEDBACK "if gateOutcome is Failed":
            assume gateOutcome == GateOutcome.Failed;
            guarantee requestState == RequestState.RecoveryHold & lastAcceptedToken == In(lastAcceptedToken) & energyTicket == EvaluationTicket.NoTicket & supportTicket == EvaluationTicket.NoTicket & requestContext == RequestContext.NoContext & eligibilityStatus == EligibilityStatus.ServiceFailed;

          case LIFECYCLE_RECOVERED_FEEDBACK "if gateOutcome is Recovered":
            assume gateOutcome == GateOutcome.Recovered;
            guarantee requestState == RequestState.Idle & lastAcceptedToken == In(lastAcceptedToken) & energyTicket == EvaluationTicket.NoTicket & supportTicket == EvaluationTicket.NoTicket & requestContext == RequestContext.NoContext & eligibilityStatus == EligibilityStatus.Idle;

          case LIFECYCLE_DENIED_POWER "if gateOutcome is DeniedPower":
            assume gateOutcome == GateOutcome.DeniedPower;
            guarantee requestState == RequestState.Idle & lastAcceptedToken == In(lastAcceptedToken) & energyTicket == EvaluationTicket.NoTicket & supportTicket == EvaluationTicket.NoTicket & requestContext == RequestContext.NoContext & eligibilityStatus == EligibilityStatus.DeniedPower;

          case LIFECYCLE_DENIED_SUPPORT "if gateOutcome is DeniedSupport":
            assume gateOutcome == GateOutcome.DeniedSupport;
            guarantee requestState == RequestState.Idle & lastAcceptedToken == In(lastAcceptedToken) & energyTicket == EvaluationTicket.NoTicket & supportTicket == EvaluationTicket.NoTicket & requestContext == RequestContext.NoContext & eligibilityStatus == EligibilityStatus.DeniedSupport;

          case LIFECYCLE_CANCELLED "if gateOutcome is Cancelled":
            assume gateOutcome == GateOutcome.Cancelled;
            guarantee requestState == RequestState.Idle & lastAcceptedToken == In(lastAcceptedToken) & energyTicket == EvaluationTicket.NoTicket & supportTicket == EvaluationTicket.NoTicket & requestContext == RequestContext.NoContext & eligibilityStatus == EligibilityStatus.Cancelled;

          case LIFECYCLE_COMPLETED "if gateOutcome is Completed":
            assume gateOutcome == GateOutcome.Completed;
            guarantee requestState == RequestState.Idle & lastAcceptedToken == In(lastAcceptedToken) & energyTicket == EvaluationTicket.NoTicket & supportTicket == EvaluationTicket.NoTicket & requestContext == RequestContext.NoContext & eligibilityStatus == EligibilityStatus.Completed;

          case LIFECYCLE_AUTHORIZED "if gateOutcome is Authorized":
            assume gateOutcome == GateOutcome.Authorized;
            guarantee requestState == RequestState.Engaged & lastAcceptedToken == In(lastAcceptedToken) & energyTicket == EvaluationTicket.NoTicket & supportTicket == EvaluationTicket.NoTicket & requestContext == RequestContext.NoContext & eligibilityStatus == EligibilityStatus.Authorized;

          case LIFECYCLE_ACTIVE "if gateOutcome is Active":
            assume gateOutcome == GateOutcome.Active;
            guarantee requestState == RequestState.Engaged & lastAcceptedToken == In(lastAcceptedToken) & energyTicket == EvaluationTicket.NoTicket & supportTicket == EvaluationTicket.NoTicket & requestContext == RequestContext.NoContext & eligibilityStatus == EligibilityStatus.Active;

          case LIFECYCLE_NO_COMMAND "if gateOutcome is None and requestInput command is NoCommand":
            assume gateOutcome == GateOutcome.None & requestInput.command == RequestCommand.NoCommand;
            guarantee requestState == In(requestState) & lastAcceptedToken == In(lastAcceptedToken) & energyTicket == EvaluationTicket.NoTicket & supportTicket == EvaluationTicket.NoTicket & requestContext == RequestContext.NoContext & ((In(requestState) == RequestState.Idle) implies (eligibilityStatus == EligibilityStatus.Idle)) & ((In(requestState) == RequestState.Pending) implies (eligibilityStatus == EligibilityStatus.Evaluating)) & ((In(requestState) == RequestState.Engaged) implies (eligibilityStatus == EligibilityStatus.Active)) & ((In(requestState) == RequestState.RecoveryHold) implies (eligibilityStatus == EligibilityStatus.AwaitingRecovery));

          case LIFECYCLE_CANCEL_OUTSTANDING "if gateOutcome is None, requestInput command is Cancel, and requestState on entry is Pending or Engaged":
            assume gateOutcome == GateOutcome.None & requestInput.command == RequestCommand.Cancel & (In(requestState) == RequestState.Pending | In(requestState) == RequestState.Engaged);
            guarantee requestState == In(requestState) & lastAcceptedToken == In(lastAcceptedToken) & energyTicket == EvaluationTicket.NoTicket & supportTicket == EvaluationTicket.NoTicket & requestContext == RequestContext.CancelOutstanding & eligibilityStatus == EligibilityStatus.Evaluating;

          case LIFECYCLE_CANCEL_NOOP "if gateOutcome is None, requestInput command is Cancel, and requestState on entry is Idle or RecoveryHold":
            assume gateOutcome == GateOutcome.None & requestInput.command == RequestCommand.Cancel & (In(requestState) == RequestState.Idle | In(requestState) == RequestState.RecoveryHold);
            guarantee requestState == In(requestState) & lastAcceptedToken == In(lastAcceptedToken) & energyTicket == EvaluationTicket.NoTicket & supportTicket == EvaluationTicket.NoTicket & requestContext == RequestContext.NoContext & ((In(requestState) == RequestState.Idle) implies (eligibilityStatus == EligibilityStatus.Idle)) & ((In(requestState) == RequestState.RecoveryHold) implies (eligibilityStatus == EligibilityStatus.AwaitingRecovery));

          case LIFECYCLE_BEGIN_DURING_RECOVERY "if gateOutcome is None, requestInput command is Begin, and requestState on entry is RecoveryHold":
            assume gateOutcome == GateOutcome.None & requestInput.command == RequestCommand.Begin & In(requestState) == RequestState.RecoveryHold;
            guarantee requestState == RequestState.RecoveryHold & lastAcceptedToken == In(lastAcceptedToken) & energyTicket == EvaluationTicket.NoTicket & supportTicket == EvaluationTicket.NoTicket & requestContext == RequestContext.NoContext & eligibilityStatus == EligibilityStatus.AwaitingRecovery;

          case LIFECYCLE_REPLAY_TOKEN_A "if gateOutcome is None, requestInput command is Begin, token is TokenA replayed, and requestState on entry is not RecoveryHold":
            assume gateOutcome == GateOutcome.None & requestInput.command == RequestCommand.Begin & requestInput.token == RequestToken.TokenA & In(lastAcceptedToken) == LastAcceptedToken.TokenA & In(requestState) != RequestState.RecoveryHold;
            guarantee requestState == In(requestState) & lastAcceptedToken == In(lastAcceptedToken) & energyTicket == EvaluationTicket.NoTicket & supportTicket == EvaluationTicket.NoTicket & requestContext == RequestContext.NoContext & eligibilityStatus == EligibilityStatus.DuplicateIgnored;

          case LIFECYCLE_REPLAY_TOKEN_B "if gateOutcome is None, requestInput command is Begin, token is TokenB replayed, and requestState on entry is not RecoveryHold":
            assume gateOutcome == GateOutcome.None & requestInput.command == RequestCommand.Begin & requestInput.token == RequestToken.TokenB & In(lastAcceptedToken) == LastAcceptedToken.TokenB & In(requestState) != RequestState.RecoveryHold;
            guarantee requestState == In(requestState) & lastAcceptedToken == In(lastAcceptedToken) & energyTicket == EvaluationTicket.NoTicket & supportTicket == EvaluationTicket.NoTicket & requestContext == RequestContext.NoContext & eligibilityStatus == EligibilityStatus.DuplicateIgnored;

          case LIFECYCLE_FRESH_TOKEN_A "if gateOutcome is None, requestInput command is Begin, token is TokenA fresh, and requestState on entry is Idle":
            assume gateOutcome == GateOutcome.None & requestInput.command == RequestCommand.Begin & requestInput.token == RequestToken.TokenA & In(lastAcceptedToken) != LastAcceptedToken.TokenA & In(requestState) == RequestState.Idle;
            guarantee requestState == RequestState.Pending & lastAcceptedToken == LastAcceptedToken.TokenA & energyTicket == EvaluationTicket.TokenA & supportTicket == EvaluationTicket.TokenA & requestContext == RequestContext.EvaluateTokenA & eligibilityStatus == EligibilityStatus.Evaluating;

          case LIFECYCLE_FRESH_TOKEN_B "if gateOutcome is None, requestInput command is Begin, token is TokenB fresh, and requestState on entry is Idle":
            assume gateOutcome == GateOutcome.None & requestInput.command == RequestCommand.Begin & requestInput.token == RequestToken.TokenB & In(lastAcceptedToken) != LastAcceptedToken.TokenB & In(requestState) == RequestState.Idle;
            guarantee requestState == RequestState.Pending & lastAcceptedToken == LastAcceptedToken.TokenB & energyTicket == EvaluationTicket.TokenB & supportTicket == EvaluationTicket.TokenB & requestContext == RequestContext.EvaluateTokenB & eligibilityStatus == EligibilityStatus.Evaluating;

          case LIFECYCLE_BUSY_TOKEN_A "if gateOutcome is None, requestInput command is Begin, token is TokenA not fresh, and requestState on entry is Pending or Engaged":
            assume gateOutcome == GateOutcome.None & requestInput.command == RequestCommand.Begin & requestInput.token == RequestToken.TokenA & In(lastAcceptedToken) != LastAcceptedToken.TokenA & (In(requestState) == RequestState.Pending | In(requestState) == RequestState.Engaged);
            guarantee requestState == In(requestState) & lastAcceptedToken == In(lastAcceptedToken) & energyTicket == EvaluationTicket.NoTicket & supportTicket == EvaluationTicket.NoTicket & requestContext == RequestContext.NoContext & eligibilityStatus == EligibilityStatus.Busy;

          case LIFECYCLE_BUSY_TOKEN_B "if gateOutcome is None, requestInput command is Begin, token is TokenB not fresh, and requestState on entry is Pending or Engaged":
            assume gateOutcome == GateOutcome.None & requestInput.command == RequestCommand.Begin & requestInput.token == RequestToken.TokenB & In(lastAcceptedToken) != LastAcceptedToken.TokenB & (In(requestState) == RequestState.Pending | In(requestState) == RequestState.Engaged);
            guarantee requestState == In(requestState) & lastAcceptedToken == In(lastAcceptedToken) & energyTicket == EvaluationTicket.NoTicket & supportTicket == EvaluationTicket.NoTicket & requestContext == RequestContext.NoContext & eligibilityStatus == EligibilityStatus.Busy;
    }*/

                        
           
                          
                                    
                          
                                              

                
                 
                           
                                                                                                
                                               
                                                         
                                                       
                                                        
                                                        
                                                        

             
                        
                                                                                                                         
                                                         
                                                          
                                                       
                                                        
                                                       
                                                       

                     
                           
                                                                                                                
                                                     
                                                                 
                                                          
                                                         
                                                          
                                                          
                                                                   

                           
                                                                                                                          
                                                        
                                                         
                                                          
                                                         
                                                          
                                                          
                                                          

                            
                                                                                    
                                                          
                                                         
                                                          
                                                                                                      
                                                                                                              

                            
                                                                                        
                                                            
                                                         
                                                          
                                                                                                      
                                                                                                                

                           
                                                                                           
                                                        
                                                         
                                                          
                                                                                                      
                                                                                                            

                           
                                                                                         
                                                        
                                                         
                                                          
                                                                                                      
                                                                                                            

                            
                                                                                              
                                                         
                                                            
                                                          
                                                                                                      
                                                                                                             

                            
                                                                                        
                                                     
                                                            
                                                          
                                                                                                      
                                                                                                         

                          
                                                                                                                               
                                                                                                      
                                                                                                     
                                                                                                      
                                                          
                                                                                                               
                                                                                                                        
                                                                                                                    
                                                                                                                                  

                           
                                                                                                                         
                                                                                                    
                                                                                                    
                                                                                                     
                                                                                                      
                                                                  
                                                                

                          
                                                                                                                     
                                                                                                    
                                                                                                      
                                                                                                     
                                                                                                      
                                                          
                                                                                                               
                                                                                                                                  

                           
                                                                                                     
                                                                                                   
                                                            
                                                                                                              
                                                                                                      
                                                                                                                   

                           
                                                                                       
                                                                                                   
                                                                                                             
                                                            
                                                                                                     
                                                                                                      
                                                                                                                   

                           
                                                                                       
                                                                                                   
                                                                                                             
                                                            
                                                                                                     
                                                                                                      
                                                                                                                   

                          
                                                                                            
                                                                                                   
                                                                                                             
                                                    
                                                                                                            
                                                                                                  
                                                                                                                  

                          
                                                                                            
                                                                                                   
                                                                                                             
                                                    
                                                                                                            
                                                                                                  
                                                                                                                  

                           
                                                                                                  
                                                                                                   
                                                                                                             
                                                                                                    
                                                                                                     
                                                                                                      
                                                                                                       

                           
                                                                                                  
                                                                                                   
                                                                                                             
                                                                                                    
                                                                                                     
                                                                                                      
                                                                                                       
       
  }

  part def EnergyAssessor :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port energyEvidence : DataPort { in :>> type : EnergyEvidence; }
    port evaluationTicket : DataPort { in :>> type : EvaluationTicket; }
    port energyVerdictOut : DataPort { out :>> type : TaggedEnergyVerdict; }

    language "GUMBO" /*{
                
                                                                                                              
                                                                                                                       
      compute
        compute_cases
          case ENERGY_INACTIVE "if evaluationTicket is NoTicket":
            assume evaluationTicket == EvaluationTicket.NoTicket;
            guarantee energyVerdictOut.ticket == TaggedTicket.NoTicket & energyVerdictOut.verdict == EnergyVerdict.NoEnergyVerdict;

          case ENERGY_READY "if evaluationTicket is not NoTicket and energyEvidence is AdequateCurrent":
            assume evaluationTicket != EvaluationTicket.NoTicket & energyEvidence == EnergyEvidence.AdequateCurrent;
            guarantee ((evaluationTicket == EvaluationTicket.TokenA) implies (energyVerdictOut.ticket == TaggedTicket.TokenA)) & ((evaluationTicket == EvaluationTicket.TokenB) implies (energyVerdictOut.ticket == TaggedTicket.TokenB)) & energyVerdictOut.verdict == EnergyVerdict.EnergyReady;

          case ENERGY_INSUFFICIENT "if evaluationTicket is not NoTicket and energyEvidence is LowCurrent":
            assume evaluationTicket != EvaluationTicket.NoTicket & energyEvidence == EnergyEvidence.LowCurrent;
            guarantee ((evaluationTicket == EvaluationTicket.TokenA) implies (energyVerdictOut.ticket == TaggedTicket.TokenA)) & ((evaluationTicket == EvaluationTicket.TokenB) implies (energyVerdictOut.ticket == TaggedTicket.TokenB)) & energyVerdictOut.verdict == EnergyVerdict.EnergyInsufficient;

          case ENERGY_UNTRUSTED "if evaluationTicket is not NoTicket and energyEvidence is UnknownCurrent Invalid or Stale":
            assume evaluationTicket != EvaluationTicket.NoTicket & (energyEvidence == EnergyEvidence.UnknownCurrent | energyEvidence == EnergyEvidence.Invalid | energyEvidence == EnergyEvidence.Stale);
            guarantee ((evaluationTicket == EvaluationTicket.TokenA) implies (energyVerdictOut.ticket == TaggedTicket.TokenA)) & ((evaluationTicket == EvaluationTicket.TokenB) implies (energyVerdictOut.ticket == TaggedTicket.TokenB)) & energyVerdictOut.verdict == EnergyVerdict.EnergyUntrusted;
    }*/

                        
                
                 
                           
                                                                                                  
                                                                       
                                                             

             
                     
                          
                                                                                             
                                                                 
                                                                        
                                                                        

                            
                                                                                                         
                                                                                                                    
                                                                            
                                                                   
                                                                    
                                                                   
                                                                    

                           
                                                                                                                  
                                                                                                               
                                                                            
                                                                   
                                                                    
                                                                   
                                                                           

                           
                                                                                                                 
                                                                  
                                                                
                                                         
                                                       
                                                                            
                                                                   
                                                                    
                                                                   
                                                                        
       
  }

  part def ObservationSupportAssessor :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port cameraEvidence : DataPort { in :>> type : CameraEvidence; }
    port radioEvidence : DataPort { in :>> type : RadioEvidence; }
    port evaluationTicket : DataPort { in :>> type : EvaluationTicket; }
    port supportVerdictOut : DataPort { out :>> type : TaggedSupportVerdict; }

    language "GUMBO" /*{
                
                                                                                                                 
                                                                                                                           
      compute
        compute_cases
          case SUPPORT_INACTIVE "if evaluationTicket is NoTicket":
            assume evaluationTicket == EvaluationTicket.NoTicket;
            guarantee supportVerdictOut.ticket == TaggedTicket.NoTicket & supportVerdictOut.verdict == SupportVerdict.NoSupportVerdict;

          case SUPPORT_READY "if evaluationTicket is not NoTicket and cameraEvidence and radioEvidence are AvailableCurrent":
            assume evaluationTicket != EvaluationTicket.NoTicket & cameraEvidence == CameraEvidence.AvailableCurrent & radioEvidence == RadioEvidence.AvailableCurrent;
            guarantee ((evaluationTicket == EvaluationTicket.TokenA) implies (supportVerdictOut.ticket == TaggedTicket.TokenA)) & ((evaluationTicket == EvaluationTicket.TokenB) implies (supportVerdictOut.ticket == TaggedTicket.TokenB)) & supportVerdictOut.verdict == SupportVerdict.SupportReady;

          case SUPPORT_UNTRUSTED "if evaluationTicket is not NoTicket and any support evidence is UnknownCurrent Invalid or Stale":
            assume evaluationTicket != EvaluationTicket.NoTicket & (cameraEvidence == CameraEvidence.UnknownCurrent | cameraEvidence == CameraEvidence.Invalid | cameraEvidence == CameraEvidence.Stale | radioEvidence == RadioEvidence.UnknownCurrent | radioEvidence == RadioEvidence.Invalid | radioEvidence == RadioEvidence.Stale);
            guarantee ((evaluationTicket == EvaluationTicket.TokenA) implies (supportVerdictOut.ticket == TaggedTicket.TokenA)) & ((evaluationTicket == EvaluationTicket.TokenB) implies (supportVerdictOut.ticket == TaggedTicket.TokenB)) & supportVerdictOut.verdict == SupportVerdict.SupportUntrusted;

          case SUPPORT_UNAVAILABLE "if evaluationTicket is not NoTicket, camera and radio evidence are not untrustworthy, and at least one is UnavailableCurrent":
            assume evaluationTicket != EvaluationTicket.NoTicket & cameraEvidence != CameraEvidence.UnknownCurrent & cameraEvidence != CameraEvidence.Invalid & cameraEvidence != CameraEvidence.Stale & radioEvidence != RadioEvidence.UnknownCurrent & radioEvidence != RadioEvidence.Invalid & radioEvidence != RadioEvidence.Stale & (cameraEvidence == CameraEvidence.UnavailableCurrent | radioEvidence == RadioEvidence.UnavailableCurrent);
            guarantee ((evaluationTicket == EvaluationTicket.TokenA) implies (supportVerdictOut.ticket == TaggedTicket.TokenA)) & ((evaluationTicket == EvaluationTicket.TokenB) implies (supportVerdictOut.ticket == TaggedTicket.TokenB)) & supportVerdictOut.verdict == SupportVerdict.SupportUnavailable;
    }*/

                        
                
                 
                           
                                                                                                    
                                                               
                                                                         

             
                     
                          
                                                                                               
                                                                 
                                                                         
                                                                           

                            
                                                                                                          
                                                                  
                                                                 
                                                              
                                                                            
                                                                    
                                                                    
                                                                    
                                                                       

                           
                                                                                                          
                                                                  
                                                                
                                                         
                                                       
                                                              
                                                       
                                                     
                                                                            
                                                                    
                                                                    
                                                                    
                                                                           

                           
                                                                                                             
                                                                  
                                                                                                                                                   
                                                                                                                                             
                                                                                                                        
                                                                            
                                                                    
                                                                    
                                                                    
                                                                             
       
  }

  part def EligibilityArbiter :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port requestContext : DataPort { in :>> type : RequestContext; }
    port energyVerdictIn : DataPort { in :>> type : TaggedEnergyVerdict; }
    port supportVerdictIn : DataPort { in :>> type : TaggedSupportVerdict; }
    port eligibilityDecision : DataPort { out :>> type : EligibilityDecision; }

    language "GUMBO" /*{
                
                                                                       
                                                                
      compute
        compute_cases
          case ARBITER_WITHDRAW "if requestContext is CancelOutstanding":
            assume requestContext == RequestContext.CancelOutstanding;
            guarantee eligibilityDecision == EligibilityDecision.Withdraw;

          case ARBITER_POWER_INSUFFICIENT "if ticket-aligned energy verdict is EnergyInsufficient and support verdict is not NoSupportVerdict":
            assume ((requestContext == RequestContext.EvaluateTokenA & energyVerdictIn.ticket == TaggedTicket.TokenA & supportVerdictIn.ticket == TaggedTicket.TokenA) | (requestContext == RequestContext.EvaluateTokenB & energyVerdictIn.ticket == TaggedTicket.TokenB & supportVerdictIn.ticket == TaggedTicket.TokenB)) & energyVerdictIn.verdict == EnergyVerdict.EnergyInsufficient & supportVerdictIn.verdict != SupportVerdict.NoSupportVerdict;
            guarantee eligibilityDecision == EligibilityDecision.DenyPower;

          case ARBITER_POWER_UNTRUSTED "if ticket-aligned energy verdict is EnergyUntrusted and support verdict is not NoSupportVerdict":
            assume ((requestContext == RequestContext.EvaluateTokenA & energyVerdictIn.ticket == TaggedTicket.TokenA & supportVerdictIn.ticket == TaggedTicket.TokenA) | (requestContext == RequestContext.EvaluateTokenB & energyVerdictIn.ticket == TaggedTicket.TokenB & supportVerdictIn.ticket == TaggedTicket.TokenB)) & energyVerdictIn.verdict == EnergyVerdict.EnergyUntrusted & supportVerdictIn.verdict != SupportVerdict.NoSupportVerdict;
            guarantee eligibilityDecision == EligibilityDecision.DenyPower;

          case ARBITER_SUPPORT_UNAVAILABLE "if ticket-aligned energy verdict is EnergyReady and support verdict is SupportUnavailable":
            assume ((requestContext == RequestContext.EvaluateTokenA & energyVerdictIn.ticket == TaggedTicket.TokenA & supportVerdictIn.ticket == TaggedTicket.TokenA) | (requestContext == RequestContext.EvaluateTokenB & energyVerdictIn.ticket == TaggedTicket.TokenB & supportVerdictIn.ticket == TaggedTicket.TokenB)) & energyVerdictIn.verdict == EnergyVerdict.EnergyReady & supportVerdictIn.verdict == SupportVerdict.SupportUnavailable;
            guarantee eligibilityDecision == EligibilityDecision.DenySupport;

          case ARBITER_SUPPORT_UNTRUSTED "if ticket-aligned energy verdict is EnergyReady and support verdict is SupportUntrusted":
            assume ((requestContext == RequestContext.EvaluateTokenA & energyVerdictIn.ticket == TaggedTicket.TokenA & supportVerdictIn.ticket == TaggedTicket.TokenA) | (requestContext == RequestContext.EvaluateTokenB & energyVerdictIn.ticket == TaggedTicket.TokenB & supportVerdictIn.ticket == TaggedTicket.TokenB)) & energyVerdictIn.verdict == EnergyVerdict.EnergyReady & supportVerdictIn.verdict == SupportVerdict.SupportUntrusted;
            guarantee eligibilityDecision == EligibilityDecision.DenySupport;

          case ARBITER_PERMIT "if ticket-aligned energy verdict is EnergyReady and support verdict is SupportReady":
            assume ((requestContext == RequestContext.EvaluateTokenA & energyVerdictIn.ticket == TaggedTicket.TokenA & supportVerdictIn.ticket == TaggedTicket.TokenA) | (requestContext == RequestContext.EvaluateTokenB & energyVerdictIn.ticket == TaggedTicket.TokenB & supportVerdictIn.ticket == TaggedTicket.TokenB)) & energyVerdictIn.verdict == EnergyVerdict.EnergyReady & supportVerdictIn.verdict == SupportVerdict.SupportReady;
            guarantee eligibilityDecision == EligibilityDecision.Permit;

          case ARBITER_INACTIVE_OR_MISMATCH "if requestContext is not CancelOutstanding and no token-aligned verdict is available":
            assume requestContext != RequestContext.CancelOutstanding & not ((requestContext == RequestContext.EvaluateTokenA & energyVerdictIn.ticket == TaggedTicket.TokenA & supportVerdictIn.ticket == TaggedTicket.TokenA) | (requestContext == RequestContext.EvaluateTokenB & energyVerdictIn.ticket == TaggedTicket.TokenB & supportVerdictIn.ticket == TaggedTicket.TokenB)) & energyVerdictIn.verdict != EnergyVerdict.NoEnergyVerdict & supportVerdictIn.verdict != SupportVerdict.NoSupportVerdict;
            guarantee eligibilityDecision == EligibilityDecision.NoDecision;
    }*/

                        
                
                 
                           
                                                                                    
                                                                  

             
                     
                           
                                                                                         
                                                                      
                                                                          

                           
                                                                                                                           
                                                                      
                                                                                                                      
                                                                      
                                                                                                                       
                                                                           
                                                                          
                                                                           

                           
                                                                                                                     
                                                                      
                                                                                                                      
                                                                      
                                                                                                                       
                                                                        
                                                                          
                                                                           

                           
                                                                                                             
                                                                      
                                                                                                                      
                                                                      
                                                                                                                       
                                                                    
                                                                            
                                                                             

                           
                                                                                                         
                                                                      
                                                                                                                      
                                                                      
                                                                                                                       
                                                                    
                                                                          
                                                                             

                           
                                                                                     
                                                                      
                                                                                                                      
                                                                      
                                                                                                                       
                                                                    
                                                                      
                                                                        

                            
                                                                                                                                  
                                                                       
                                                                      
                                                                                                                      
                                                                      
                                                                                                                       
                                                                             
                                                                                
                                                                            
       
  }

  part def AuthorizationGate :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port observationProgress : DataPort { in :>> type : ObservationProgress; }
    port eligibilityDecision : DataPort { in :>> type : EligibilityDecision; }
    port gateOutcome : DataPort { out :>> type : GateOutcome; }
    port observationAuthorization : DataPort { out :>> type : ObservationAuthorization; }

    language "GUMBO" /*{
      state
        gatePhase : GatePhase;
                
                           
                                                                                                                    
                                                                                                                                          
      compute
        modifies gatePhase;
        guarantee FAILURE_HOLD_WITHHOLDS "if gatePhase is FailureHold then observationAuthorization is Withhold":
          (In(gatePhase) == GatePhase.FailureHold) implies (observationAuthorization == ObservationAuthorization.Withhold);
        compute_cases
          case GATE_RECOVERED "if on entry gatePhase is FailureHold and observationProgress is Idle":
            assume In(gatePhase) == GatePhase.FailureHold & observationProgress == ObservationProgress.Idle;
            guarantee gatePhase == GatePhase.Closed & observationAuthorization == ObservationAuthorization.Withhold & gateOutcome == GateOutcome.Recovered;

          case GATE_RECOVERY_RETAINED "if on entry gatePhase is FailureHold and observationProgress is not Idle":
            assume In(gatePhase) == GatePhase.FailureHold & observationProgress != ObservationProgress.Idle;
            guarantee gatePhase == GatePhase.FailureHold & observationAuthorization == ObservationAuthorization.Withhold & gateOutcome == GateOutcome.None;

          case GATE_REPORTED_FAILURE "if on entry gatePhase is not FailureHold and observationProgress is Failed":
            assume In(gatePhase) != GatePhase.FailureHold & observationProgress == ObservationProgress.Failed;
            guarantee gatePhase == GatePhase.FailureHold & observationAuthorization == ObservationAuthorization.Withhold & gateOutcome == GateOutcome.Failed;

          case GATE_ACTIVE_WHILE_CLOSED "if on entry gatePhase is Closed and observationProgress is Active":
            assume In(gatePhase) == GatePhase.Closed & observationProgress == ObservationProgress.Active;
            guarantee gatePhase == GatePhase.FailureHold & observationAuthorization == ObservationAuthorization.Withhold & gateOutcome == GateOutcome.Failed;

          case GATE_ACTIVE_TO_IDLE_REGRESSION "if on entry gatePhase is Active and observationProgress is Idle":
            assume In(gatePhase) == GatePhase.Active & observationProgress == ObservationProgress.Idle;
            guarantee gatePhase == GatePhase.FailureHold & observationAuthorization == ObservationAuthorization.Withhold & gateOutcome == GateOutcome.Failed;

          case GATE_WITHDRAWAL "if eligibilityDecision is Withdraw and the gate is not in a failure or progress-sensitive state":
            assume In(gatePhase) != GatePhase.FailureHold & observationProgress != ObservationProgress.Failed & not (In(gatePhase) == GatePhase.Closed & observationProgress == ObservationProgress.Active) & not (In(gatePhase) == GatePhase.Active & observationProgress == ObservationProgress.Idle) & eligibilityDecision == EligibilityDecision.Withdraw;
            guarantee gatePhase == GatePhase.Closed & observationAuthorization == ObservationAuthorization.Withhold & gateOutcome == GateOutcome.Cancelled;

          case GATE_COMPLETION "if gate is Authorized or Active, observationProgress is Completed, and eligibilityDecision is not Withdraw":
            assume (In(gatePhase) == GatePhase.Authorized | In(gatePhase) == GatePhase.Active) & observationProgress == ObservationProgress.Completed & eligibilityDecision != EligibilityDecision.Withdraw;
            guarantee gatePhase == GatePhase.Closed & observationAuthorization == ObservationAuthorization.Withhold & gateOutcome == GateOutcome.Completed;

          case GATE_DENIED_POWER "if eligibilityDecision is DenyPower and the gate is not in a failure or progress-sensitive state":
            assume In(gatePhase) != GatePhase.FailureHold & observationProgress != ObservationProgress.Failed & not (In(gatePhase) == GatePhase.Closed & observationProgress == ObservationProgress.Active) & not (In(gatePhase) == GatePhase.Active & observationProgress == ObservationProgress.Idle) & not ((In(gatePhase) == GatePhase.Authorized | In(gatePhase) == GatePhase.Active) & observationProgress == ObservationProgress.Completed) & eligibilityDecision == EligibilityDecision.DenyPower;
            guarantee gatePhase == GatePhase.Closed & observationAuthorization == ObservationAuthorization.Withhold & gateOutcome == GateOutcome.DeniedPower;

          case GATE_DENIED_SUPPORT "if eligibilityDecision is DenySupport and the gate is not in a failure or progress-sensitive state":
            assume In(gatePhase) != GatePhase.FailureHold & observationProgress != ObservationProgress.Failed & not (In(gatePhase) == GatePhase.Closed & observationProgress == ObservationProgress.Active) & not (In(gatePhase) == GatePhase.Active & observationProgress == ObservationProgress.Idle) & not ((In(gatePhase) == GatePhase.Authorized | In(gatePhase) == GatePhase.Active) & observationProgress == ObservationProgress.Completed) & eligibilityDecision == EligibilityDecision.DenySupport;
            guarantee gatePhase == GatePhase.Closed & observationAuthorization == ObservationAuthorization.Withhold & gateOutcome == GateOutcome.DeniedSupport;

          case GATE_PERMIT_FROM_CLOSED "if on entry gatePhase is Closed, observationProgress is Idle, and eligibilityDecision is Permit":
            assume In(gatePhase) == GatePhase.Closed & observationProgress == ObservationProgress.Idle & eligibilityDecision == EligibilityDecision.Permit;
            guarantee gatePhase == GatePhase.Authorized & observationAuthorization == ObservationAuthorization.Permit & gateOutcome == GateOutcome.Authorized;

          case GATE_PROGRESS_ACTIVE "if gate is Authorized or Active, observationProgress is Active, and eligibilityDecision is not Withdraw, DenyPower, or DenySupport":
            assume (In(gatePhase) == GatePhase.Authorized | In(gatePhase) == GatePhase.Active) & observationProgress == ObservationProgress.Active & eligibilityDecision != EligibilityDecision.Withdraw & eligibilityDecision != EligibilityDecision.DenyPower & eligibilityDecision != EligibilityDecision.DenySupport;
            guarantee gatePhase == GatePhase.Active & observationAuthorization == ObservationAuthorization.Permit & gateOutcome == GateOutcome.Active;

          case GATE_AUTHORIZED_IDLE "if on entry gatePhase is Authorized, observationProgress is Idle, and eligibilityDecision is NoDecision or Permit":
            assume In(gatePhase) == GatePhase.Authorized & observationProgress == ObservationProgress.Idle & (eligibilityDecision == EligibilityDecision.NoDecision | eligibilityDecision == EligibilityDecision.Permit);
            guarantee gatePhase == GatePhase.Authorized & observationAuthorization == ObservationAuthorization.Permit & gateOutcome == GateOutcome.Authorized;

          case GATE_CLOSED_QUIESCENT "if gatePhase is Closed and no progress/event forces a transition":
            assume In(gatePhase) == GatePhase.Closed & observationProgress != ObservationProgress.Failed & observationProgress != ObservationProgress.Active & eligibilityDecision != EligibilityDecision.Withdraw & eligibilityDecision != EligibilityDecision.DenyPower & eligibilityDecision != EligibilityDecision.DenySupport & not (observationProgress == ObservationProgress.Idle & eligibilityDecision == EligibilityDecision.Permit);
            guarantee gatePhase == GatePhase.Closed & observationAuthorization == ObservationAuthorization.Withhold & gateOutcome == GateOutcome.None;
    }*/

                        
           
                          
                              

                
                 
                           
                                                                                                   
                                           
                                                                           
                                            

             
                          
                                                                                                   
                                                      
                                                                            

                     
                           
                                                                                                
                                                                                                            
                                                     
                                                                                                                   

                          
                                                                                                   
                                                                                                            
                                                          
                                                                                                              

                           
                                                                                                          
                                                                                                              
                                                          
                                                                                                                

                           
                                                                                                        
                                                                                                         
                                                          
                                                                                                                

                           
                                                                                                                              
                                                                                                       
                                                          
                                                                                                                

                           
                                                                                                                
                                                           
                                                                 
                                                                                                           
                                                                                                         
                                                                  
                                                     
                                                                                                                   

                           
                                                                                                             
                                                                                                
                                                                    
                                                                  
                                                     
                                                                                                                   

                           
                                                                                                    
                                                                                                               
                                                                                                           
                                                                                                         
                                                                                                
                                                                          
                                                                   
                                                     
                                                                                                                     

                           
                                                                                                        
                                                                                                               
                                                                                                           
                                                                                                         
                                                                                                
                                                                          
                                                                     
                                                     
                                                                                                                       

                           
                                                                                      
                                                                                                        
                                                                
                                                         
                                                                                                                  

                            
                                                                                                                          
                                                                                                
                                                                 
                                                                   
                                                                    
                                                                     
                                                     
                                                                                                              

                          
                                                                                                             
                                                                                                            
                                                                                                                          
                                                         
                                                                                                                  

                          
                                                                                                 
                                                      
                                                                                                                     
                                                                                                                          
                                                                      
                                                                                                                        
                                                     
                                                                                                              
       
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
