package Navigation_Obstacle_Awareness_Use_Supervisor {
  private import HAMR::*;

  enum def NavigationEvidence {
    enum NOMINAL_CURRENT;
    enum DEGRADED_CURRENT;
    enum UNAVAILABLE_CURRENT;
    enum STALE;
    enum INVALID;
  }

  enum def ObstacleEvidence {
    enum NO_INDICATION_CURRENT;
    enum INDICATION_CURRENT;
    enum UNAVAILABLE_CURRENT;
    enum STALE;
    enum INVALID;
  }

  enum def MotionContext {
    enum STATIONARY;
    enum TRANSLATING;
    enum LANDING_CONTEXT;
    enum UNKNOWN;
  }

  enum def SupervisionEvent {
    enum NONE;
    enum RESET_ONLY;
    enum FORCE_HOLD_ONLY;
    enum FORCE_HOLD_WITH_RESET;
  }

  enum def NavigationUseDirective {
    enum MOTION_INHIBITED;
    enum RESTRICTED_NAV_USE;
    enum FULL_NAV_USE;
  }

  enum def ObstacleAwarenessNotice {
    enum NO_CURRENT_INDICATION;
    enum CURRENT_INDICATION;
    enum AWARENESS_UNAVAILABLE;
  }

  enum def SupervisionStatus {
    enum STARTUP_HOLD;
    enum FULL_USE;
    enum RESTRICTED_USE;
    enum HELD_NAV_EVIDENCE;
    enum HELD_OBSTACLE_INDICATION;
    enum HELD_AWARENESS_LOSS;
    enum HELD_EXTERNAL;
    enum RESET_RELEASE_REQUIRED;
    enum RESET_REQUIRED;
  }

  enum def EvidenceAssessment {
    enum READY;
    enum LIMITED;
    enum REJECTED;
  }

  enum def ObstacleAssessment {
    enum NO_INDICATION;
    enum INDICATED;
    enum UNAVAILABLE;
  }

  enum def NavigationBasis {
    enum FULL_BASIS;
    enum RELATIVE_BASIS;
    enum LIMITED_BASIS;
    enum UNUSABLE_BASIS;
  }

  enum def AwarenessCondition {
    enum AWARENESS_CLEAR;
    enum ACTIVE_OBSTACLE_CONFLICT;
    enum STATIONARY_OBSTACLE_PRESENT;
    enum ACTIVE_AWARENESS_LOSS;
    enum STATIONARY_AWARENESS_UNAVAILABLE;
  }

  enum def ConstraintProposal {
    enum HOLD_OBSTACLE;
    enum HOLD_AWARENESS;
    enum HOLD_NAVIGATION;
    enum RESTRICT_NAVIGATION;
    enum ALLOW_FULL;
  }

  enum def AcceptedAction {
    enum APPLY_OBSTACLE_HOLD;
    enum APPLY_AWARENESS_HOLD;
    enum APPLY_NAV_HOLD;
    enum APPLY_EXTERNAL_HOLD;
    enum APPLY_RESTRICTED;
    enum APPLY_FULL;
    enum ACCEPT_RESET;
    enum IGNORE_RESET;
  }

  enum def RecoveryPhase {
    enum WAIT_RELEASE;
    enum ARMED;
    enum OPEN;
    enum LATCHED;
  }

  part def GpsEvidenceQualifier :> Thread {
    port gpsEvidence : DataPort { in :>> type : NavigationEvidence; }
    port gpsAssessment : DataPort { out :>> type : EvidenceAssessment; }

                        
                
                 
                          
                                                                                            
                                                                        
                                                            
                                                                         
                                                              
                                                                       
                                                         
                                                                  
                                                              
             
                     
                           
                                                                                                
                     
                                                                          
                                                              
                                                                           
                                                                
                                                                         
                                                           
                                                                    
                                                                
       
  }

  part def InertialEvidenceQualifier :> Thread {
    port inertialEvidence : DataPort { in :>> type : NavigationEvidence; }
    port inertialAssessment : DataPort { out :>> type : EvidenceAssessment; }

                        
                
                 
                          
                                                                                                      
                                                                             
                                                                 
                                                                              
                                                                   
                                                                            
                                                              
                                                                       
                                                                   
             
                     
                           
                                                                                                           
                     
                                                                               
                                                                   
                                                                                
                                                                     
                                                                              
                                                                
                                                                         
                                                                     
       
  }

  part def BarometricEvidenceQualifier :> Thread {
    port barometricEvidence : DataPort { in :>> type : NavigationEvidence; }
    port barometricAssessment : DataPort { out :>> type : EvidenceAssessment; }

                        
                
                 
                          
                                                                                                          
                                                                               
                                                                   
                                                                                
                                                                     
                                                                              
                                                                
                                                                         
                                                                     
             
                     
                           
                                                                                                               
                     
                                                                                 
                                                                     
                                                                                  
                                                                       
                                                                                
                                                                  
                                                                           
                                                                       
       
  }

  part def ObstacleEvidenceQualifier :> Thread {
    port obstacleEvidence : DataPort { in :>> type : ObstacleEvidence; }
    port obstacleAssessment : DataPort { out :>> type : ObstacleAssessment; }

                        
                
                 
                              
                                                                                                      
                                                                                 
                                                                         
                                                                              
                                                                     
                                                                          
                                                            
                                                                     
                                                                      
             
                     
                           
                                                                                                            
                     
                                                                                   
                                                                           
                                                                                
                                                                       
                                                                            
                                                              
                                                                       
                                                                        
       
  }

  part def NavigationBasisOwner :> Thread {
    port gpsAssessment : DataPort { in :>> type : EvidenceAssessment; }
    port inertialAssessment : DataPort { in :>> type : EvidenceAssessment; }
    port barometricAssessment : DataPort { in :>> type : EvidenceAssessment; }
    port proposalBasis : DataPort { out :>> type : NavigationBasis; }
    port outcomeBasis : DataPort { out :>> type : NavigationBasis; }

                        
                
                 
                          
                                                                                                      
                                           
                                                           
                                                                
                                                                         
                                                              
                                                              
                                                                   
                                                                            
                                                                  
                                                              
                                                                    
                                                                       
                                                            
                                                                 
                                                                           
                                                                 
                                                               
                                                                     
                                                                         
                                                               
                                                                    
                                                                              
                                                                 
             
                        
                                              
                                        
                     
                           
                                                                                       
                                                              
                                                              
                                                               
                                                                  
                           
                                                                                                               
                                                                 
                                                                 
                                                                  
                                                                      
                           
                                                                                                                
                                                                 
                                                                  
                                                                     
                                                          
                                                               
                                                                 
                                                                     
                           
                                                                                     
                                                                  
                                                                    
                                                                        
                                                             
                                                                   
                                                                     
                                                                      
       
  }

  part def AwarenessConditionOwner :> Thread {
    port motionContext : DataPort { in :>> type : MotionContext; }
    port obstacleAssessment : DataPort { in :>> type : ObstacleAssessment; }
    port awarenessCondition : DataPort { out :>> type : AwarenessCondition; }

                        
                
                 
                          
                                                                                                     
                                                        
                                                                               
                                                                           
                                                             
                                                                  
                                                                           
                                                                                    
                                                           
                                                                           
                                                                                       
                                                        
                                                              
                                                                   
                                                                               
                                                                                 
                                                           
                                                                             
                                                                                           
             
                     
                           
                                                                                                     
                                                           
                                                                     
                                                                               
                           
                                                                                                                  
                                                                
                                                               
                                                                 
                                                                                        
                           
                                                                                                             
                                                              
                                                                 
                                                                                           
                           
                                                                                                                         
                                                           
                                                            
                                                                 
                                                                     
                                                                                     
                           
                                                                                                                                
                                                              
                                                                   
                                                                                                
       
  }

  part def ConstraintProposalOwner :> Thread {
    port navigationBasis : DataPort { in :>> type : NavigationBasis; }
    port awarenessCondition : DataPort { in :>> type : AwarenessCondition; }
    port constraintProposal : DataPort { out :>> type : ConstraintProposal; }

                        
                
                 
                          
                                                                                               
                                                                                   
                                                                                             
                                                                         
                                                                                
                                                                                                  
                                                                          
                                                                          
                                                                          
                                                                           
                                                                          
                                                                    
                                                                           
                                                                               
                                                                          
                                                                      
                                                                     
             
                     
                           
                                                                                                   
                     
                                                                                     
                                                                                               
                                                                           
                                                                                  
                                                                                                    
                                                                            
                                                                            
                                                                            
                                                                             
                                                                            
                                                                      
                                                                             
                                                                                 
                                                                            
                                                                        
                                                                       
       
  }

  part def EventPriorityArbiter :> Thread {
    port supervisionEvent : DataPort { in :>> type : SupervisionEvent; }
    port constraintProposal : DataPort { in :>> type : ConstraintProposal; }
    port preRecoveryPhase : DataPort { in :>> type : RecoveryPhase; }
    port recoveryAction : DataPort { out :>> type : AcceptedAction; }
    port outcomeAction : DataPort { out :>> type : AcceptedAction; }

                        
                
                 
                          
                                                                                                            
                                             
                                                                              
                                                                       
                                                                               
                                                                        
                                                                                
                                                                  
                                                                      
                                                                                      
                                                                        
                                                                                     
                                                                         
                                                                    
                                                                   
                                                                  
                                                                    
                                                                    
                                                                       
                                                                  
                                                              
                                                                     
                                                                    
                                                                               
                                                                  
                                                                                        
                                                                           
             
                        
                                               
                                          
                     
                           
                                                                                                  
                                                                           
                                                                       
                                                                       
                     
                                                                               
                                                                         
                                                                                
                                                                          
                                                                                 
                                                                   
                           
                                                                                                                   
                                                                         
                                                                             
                                                        
                     
                                                                        
                                                                                     
                                                                         
                                                                   
                                                                  
                                                                  
                                                                   
                                                                   
                                                                      
                                                                  
                                                                   
                                                                 
                                                                               
                                                                  
                                                                                        
                                                                         
                           
                                                                                                            
                                                                         
                                                                             
                                                        
                     
                                                                            
                                                                
                                                                                     
                                                                     
       
  }

  part def RecoveryLatchOwner :> Thread {
    port acceptedAction : DataPort { in :>> type : AcceptedAction; }
    port preRecoveryPhase : DataPort { out :>> type : RecoveryPhase; }
    port postRecoveryPhase : DataPort { out :>> type : RecoveryPhase; }

                        
           
                          
                                              
                
                                        
                 
                            
                                                                                                
                                                                  
                                                            
                                                            
             
                                        
                        
                                               
                                                         
                        
                                                
                                                      
                     
                           
                                                                                                        
                                                                         
                                                                     
                                                               
                                                                    
                                                             
                                                             
                                                                    
                                                                     
                                                                           
                     
                                                                        
                                                                         
                                                                   
                                                                               
                                                                    
                                                                      
                                                                         
                                                              
                                                                     
                                                                      
                                                                                   
                                                                 
                           
                                                                                                                          
                                                                  
                                                             
                                                                    
                                                                   
                                                                   
                     
                                                                      
                                                                 
                                                              
                                                                     
                                                                            
                                                                  
                                                              
                                                                     
                                                                           
                                                                
       
  }

  part def SupervisionOutcomeOwner :> Thread {
    port acceptedAction : DataPort { in :>> type : AcceptedAction; }
    port postRecoveryPhase : DataPort { in :>> type : RecoveryPhase; }
    port navigationBasis : DataPort { in :>> type : NavigationBasis; }
    port navigationUseDirective : DataPort { out :>> type : NavigationUseDirective; }
    port obstacleAwarenessNotice : DataPort { out :>> type : ObstacleAwarenessNotice; }
    port supervisionStatus : DataPort { out :>> type : SupervisionStatus; }

                        
                
                 
                            
                                                                                                          
                                                                               
                                                                                      
                                                                
             
                     
                           
                                                                                                                    
                     
                                                                
                                                                                      
                                                           
                                                                 
                                                                
                                                                          
                                                                                  
                                                                      
                                                           
                                                                      
                                                                      
                                                                      
                                                                          
                                                                                        
                                                                            
                                                           
                                                                               
                                                                                    
                                                           
                                                                                
                                                                               
                                                           
                                                                          
                                                                             
                                                           
                                                                               
                                                                         
                                                                   
                                                                  
                                                                
                                                                              
                                                                                  
                                                            
                                                                
                                                                              
                                                                          
                                                                             
                                                                                          
                                                                              
                                                                                             
                                                                        
                                                                                
                                                                                            
       
  }

  part def SupervisorProcess :> Process {
    port gpsEvidence : DataPort { in :>> type : NavigationEvidence; }
    port inertialEvidence : DataPort { in :>> type : NavigationEvidence; }
    port barometricEvidence : DataPort { in :>> type : NavigationEvidence; }
    port obstacleEvidence : DataPort { in :>> type : ObstacleEvidence; }
    port motionContext : DataPort { in :>> type : MotionContext; }
    port supervisionEvent : DataPort { in :>> type : SupervisionEvent; }
    port navigationUseDirective : DataPort { out :>> type : NavigationUseDirective; }
    port obstacleAwarenessNotice : DataPort { out :>> type : ObstacleAwarenessNotice; }
    port supervisionStatus : DataPort { out :>> type : SupervisionStatus; }

    part gpsEvidenceQualifier : GpsEvidenceQualifier;
    part inertialEvidenceQualifier : InertialEvidenceQualifier;
    part barometricEvidenceQualifier : BarometricEvidenceQualifier;
    part obstacleEvidenceQualifier : ObstacleEvidenceQualifier;
    part navigationBasisOwner : NavigationBasisOwner;
    part awarenessConditionOwner : AwarenessConditionOwner;
    part constraintProposalOwner : ConstraintProposalOwner;
    part eventPriorityArbiter : EventPriorityArbiter;
    part recoveryLatchOwner : RecoveryLatchOwner;
    part supervisionOutcomeOwner : SupervisionOutcomeOwner;

    connection int01 : PortConnection connect gpsEvidence to gpsEvidenceQualifier.gpsEvidence;
    connection int02 : PortConnection connect inertialEvidence to inertialEvidenceQualifier.inertialEvidence;
    connection int03 : PortConnection connect barometricEvidence to barometricEvidenceQualifier.barometricEvidence;
    connection int04 : PortConnection connect obstacleEvidence to obstacleEvidenceQualifier.obstacleEvidence;
    connection int05 : PortConnection connect motionContext to awarenessConditionOwner.motionContext;
    connection int06 : PortConnection connect supervisionEvent to eventPriorityArbiter.supervisionEvent;
    connection int07 : PortConnection connect gpsEvidenceQualifier.gpsAssessment to navigationBasisOwner.gpsAssessment;
    connection int08 : PortConnection connect inertialEvidenceQualifier.inertialAssessment to navigationBasisOwner.inertialAssessment;
    connection int09 : PortConnection connect barometricEvidenceQualifier.barometricAssessment to navigationBasisOwner.barometricAssessment;
    connection int10 : PortConnection connect obstacleEvidenceQualifier.obstacleAssessment to awarenessConditionOwner.obstacleAssessment;
    connection int11 : PortConnection connect navigationBasisOwner.proposalBasis to constraintProposalOwner.navigationBasis;
    connection int12 : PortConnection connect awarenessConditionOwner.awarenessCondition to constraintProposalOwner.awarenessCondition;
    connection int13 : PortConnection connect constraintProposalOwner.constraintProposal to eventPriorityArbiter.constraintProposal;
    connection int14 : PortConnection connect recoveryLatchOwner.preRecoveryPhase to eventPriorityArbiter.preRecoveryPhase;
    connection int15 : PortConnection connect eventPriorityArbiter.recoveryAction to recoveryLatchOwner.acceptedAction;
    connection int16 : PortConnection connect eventPriorityArbiter.outcomeAction to supervisionOutcomeOwner.acceptedAction;
    connection int17 : PortConnection connect recoveryLatchOwner.postRecoveryPhase to supervisionOutcomeOwner.postRecoveryPhase;
    connection int18 : PortConnection connect navigationBasisOwner.outcomeBasis to supervisionOutcomeOwner.navigationBasis;
    connection int19 : PortConnection connect supervisionOutcomeOwner.navigationUseDirective to navigationUseDirective;
    connection int20 : PortConnection connect supervisionOutcomeOwner.obstacleAwarenessNotice to obstacleAwarenessNotice;
    connection int21 : PortConnection connect supervisionOutcomeOwner.supervisionStatus to supervisionStatus;
  }

  part def NavigationObstacleAwarenessUseSupervisorSystem :> System {
    port gpsEvidence : DataPort { in :>> type : NavigationEvidence; }
    port inertialEvidence : DataPort { in :>> type : NavigationEvidence; }
    port barometricEvidence : DataPort { in :>> type : NavigationEvidence; }
    port obstacleEvidence : DataPort { in :>> type : ObstacleEvidence; }
    port motionContext : DataPort { in :>> type : MotionContext; }
    port supervisionEvent : DataPort { in :>> type : SupervisionEvent; }
    port navigationUseDirective : DataPort { out :>> type : NavigationUseDirective; }
    port obstacleAwarenessNotice : DataPort { out :>> type : ObstacleAwarenessNotice; }
    port supervisionStatus : DataPort { out :>> type : SupervisionStatus; }

    part supervisorProcess : SupervisorProcess;

    connection supportGpsEvidence : PortConnection connect gpsEvidence to supervisorProcess.gpsEvidence;
    connection supportInertialEvidence : PortConnection connect inertialEvidence to supervisorProcess.inertialEvidence;
    connection supportBarometricEvidence : PortConnection connect barometricEvidence to supervisorProcess.barometricEvidence;
    connection supportObstacleEvidence : PortConnection connect obstacleEvidence to supervisorProcess.obstacleEvidence;
    connection supportMotionContext : PortConnection connect motionContext to supervisorProcess.motionContext;
    connection supportSupervisionEvent : PortConnection connect supervisionEvent to supervisorProcess.supervisionEvent;
    connection supportDirective : PortConnection connect supervisorProcess.navigationUseDirective to navigationUseDirective;
    connection supportNotice : PortConnection connect supervisorProcess.obstacleAwarenessNotice to obstacleAwarenessNotice;
    connection supportStatus : PortConnection connect supervisorProcess.supervisionStatus to supervisionStatus;
  }

  part navigationObstacleAwarenessUseSupervisor : NavigationObstacleAwarenessUseSupervisorSystem;
}
