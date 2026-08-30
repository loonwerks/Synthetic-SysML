// Canonical source for immutable run 20260814T132655Z-mining-cargo-docking-small-r2-a1.

package Ore_Hold_Mining_Guard_Supervisor {
  private import HAMR::*;

  enum def InputStatus { enum Valid; enum Invalid; }
  enum def HoldObservation { enum RoomAvailable; enum NearlyFull; }
  enum def AsteroidCondition { enum OreAvailable; enum Depleted; }
  enum def LaserCondition { enum Ready; enum Overheated; }
  enum def TargetCondition { enum Locked; enum Interfered; }
  enum def RequestDisposition {
    enum InvalidRequest; enum HaltDominant; enum FreshResume;
    enum FreshStart; enum NoFreshRequest;
  }
  enum def HoldAssessment { enum SpaceAvailable; enum GuardReached; enum InvalidHold; }
  enum def SupportAssessment { enum SupportReady; enum SupportBlocked; enum InvalidSupport; }
  enum def GuardMode { enum Idle; enum Mining; enum CapacityHold; enum ConditionHold; enum RecoveryReady; }
  enum def ResolutionReason {
    enum HaltSelected; enum InvalidEvidence; enum HoldGuardReached;
    enum SupportUnavailable; enum StartAdmitted; enum IdleWaiting;
    enum MiningMaintained; enum GuardCleared; enum EvidenceRestored;
    enum ResumeAdmitted; enum RecoveryWaiting;
  }
  enum def MiningCommand { enum StopMining; enum ContinueMining; }
  enum def GuardStatus {
    enum Idle; enum MiningAuthorized; enum HaltedByPilot; enum GuardedNearlyFull;
    enum HeldForSupport; enum InputFault; enum AwaitingFreshResume; enum RequestConflict;
  }
  enum def OffloadReadiness { enum NotReadyForOffload; enum ReadyForLaterOffload; }

  // Every record member inspected by GUMBO is an attribute.
  part def PilotRequestSample :> Data {
    attribute start : Base_Types::Boolean;
    attribute halt : Base_Types::Boolean;
    attribute resume : Base_Types::Boolean;
    attribute status : InputStatus;
  }
  part def HoldSample :> Data {
    attribute observation : HoldObservation;
    attribute status : InputStatus;
  }
  part def MiningSupportSample :> Data {
    attribute asteroid : AsteroidCondition;
    attribute laser : LaserCondition;
    attribute target : TargetCondition;
    attribute status : InputStatus;
  }
  part def RequestAssessment :> Data {
    attribute disposition : RequestDisposition;
    attribute conflict : Base_Types::Boolean;
  }
  part def GuardResolution :> Data {
    attribute nextMode : GuardMode;
    attribute reason : ResolutionReason;
    attribute requestConflict : Base_Types::Boolean;
  }

  part def RequestFreshnessPriorityOwner :> Thread {
    port pilot_request : DataPort { in :>> type : PilotRequestSample; }
    port request_assessment : DataPort { out :>> type : RequestAssessment; }

                        
           
                          
                                           
                          
                                          
                          
                                            
                
                                                             
                         
                                             
                                                                        
                                                                               
                                           
             
                                                             
                             
                                                               
                                                         
                                                                                 
                                               
                                                       
                                           
                                                           
                                                             
                                                              
                                  
                                                                                  
                                                                                      
                                                                                 
                                      
                                                               
                                                           
                                                                                
                                      
                                                               
                                                             
                                                                                       
                                                
                                              
                                                 
       
  }

  part def HoldGuardQualificationOwner :> Thread {
    port hold_sample : DataPort { in :>> type : HoldSample; }
    port hold_assessment : DataPort { out :>> type : HoldAssessment; }

                        
                
                         
                                               
                                                        
             
                              
                                           
                                                       
                                                            
                                                     
                                                                      
                                                               
                                                     
                                                                   
                                                             
       
  }

  part def MiningSupportQualificationOwner :> Thread {
    port mining_support : DataPort { in :>> type : MiningSupportSample; }
    port support_assessment : DataPort { out :>> type : SupportAssessment; }

                        
                
                         
                                                  
                                                                 
             
                                 
                                               
                                                          
                                                                     
                                                        
                                                                       
                                                          
                                                             
                                                                   
                                                        
                                                                        
                                                           
                                                               
                                                                     
       
  }

  part def OreHoldDecisionOwner :> Thread {
    port request_assessment : DataPort { in :>> type : RequestAssessment; }
    port hold_assessment : DataPort { in :>> type : HoldAssessment; }
    port support_assessment : DataPort { in :>> type : SupportAssessment; }
    port resolution_to_command : DataPort { out :>> type : GuardResolution; }
    port resolution_to_reporting : DataPort { out :>> type : GuardResolution; }

                        
           
                          
                             
                
                           
                         
                                        
                                       
                                                            
                                                                        
                                                      
                                                              
                                                                          
                                                       
             
                           
                     
                           
                                                                                                         
                                                                                        
                                                                  
                                                                          
                                                            
                                                                         
                                                                                
                                                                                    
                                                                           
                                                                                  
                                                                                     
                           
                                                                                                
                                                                                        
                                                                  
                                                                           
                                                                                     
                                                   
                                                                
                                                                             
                                                                                    
                                                                  
                                                                               
                                                                                     
                           
                                                                                          
                                                                                        
                                                                  
                                                                           
                                                                                      
                                                                  
                                                           
                                                                        
                                                                                 
                                                                                    
                                                                          
                                                                                   
                                                                                     
                           
                                                                                                         
                                                                                        
                                                                     
                                                                           
                                                                                     
                                                            
                                                                         
                                                                                   
                                                                                    
                                                                           
                                                                                     
                                                                                     
                           
                                                                                               
                                                                                    
                                                                     
                                                                         
                                                   
                                                     
                                                                  
                                                                              
                                                                                    
                                                                    
                                                                                
                                                                                     
                           
                                                                                    
                                                                                        
                                                                                      
                                                                                    
                                                                     
                                                                         
                                                   
                                                   
                                                                
                                                                            
                                                                                    
                                                                  
                                                                              
                                                                                     
                           
                                                                                                           
                                                                                        
                                                                                      
                                                                     
                                                                         
                                                     
                                                     
                                                                  
                                                                                 
                                                                                    
                                                                    
                                                                                   
                                                                                     
                           
                                                                                                                       
                                                                                        
                                                                                      
                                                                     
                                                                         
                                                           
                                                            
                                                                         
                                                                             
                                                                                    
                                                                           
                                                                               
                                                                                     
                           
                                                                                                                             
                                                                                        
                                                                                      
                                                                     
                                                                         
                                                            
                                                            
                                                                         
                                                                                 
                                                                                    
                                                                           
                                                                                   
                                                                                     
                           
                                                                                      
                                                                                     
                                                                     
                                                                         
                                                            
                                                     
                                                                  
                                                                               
                                                                                    
                                                                    
                                                                                 
                                                                                     
                           
                                                                                               
                                                                                        
                                                                                      
                                                                                     
                                                                     
                                                                         
                                                            
                                                            
                                                                         
                                                                                
                                                                                    
                                                                           
                                                                                  
                                                                                     
       
  }

  part def MiningCommandDerivationOwner :> Thread {
    port guard_resolution : DataPort { in :>> type : GuardResolution; }
    port mining_command : DataPort { out :>> type : MiningCommand; }

                        
                
                         
                                              
                                                     
             
                           
                                                  
                                                           
                                                             
                                                           
                                                         
       
  }

  part def GuardReportingDerivationOwner :> Thread {
    port guard_resolution : DataPort { in :>> type : GuardResolution; }
    port guard_status : DataPort { out :>> type : GuardStatus; }
    port offload_readiness : DataPort { out :>> type : OffloadReadiness; }

                        
                
                         
                                         
                                            
                                                                   
             
                           
                                                
                                                                         
                                                     
                                                                      
                                                        
                                                                          
                                                            
                                                                            
                                                         
                                                                        
                                                                           
                                                                          
                                                           
                                                                       
                                                                           
                                                                           
                                                              
                                                                     
                                              
                                                          
                                                                     
                                                  
                                               
                           
                                                     
                                                                 
                                                                         
                                                                 
                                                                       
       
  }

  // Behavior-free containment support; it receives no semantic usage credit.
  part def MiningGuardProcess :> Process {
    port pilot_request : DataPort { in :>> type : PilotRequestSample; }
    port hold_sample : DataPort { in :>> type : HoldSample; }
    port mining_support : DataPort { in :>> type : MiningSupportSample; }
    port mining_command : DataPort { out :>> type : MiningCommand; }
    port guard_status : DataPort { out :>> type : GuardStatus; }
    port offload_readiness : DataPort { out :>> type : OffloadReadiness; }

    part request_freshness_priority_owner : RequestFreshnessPriorityOwner;
    part hold_guard_qualification_owner : HoldGuardQualificationOwner;
    part mining_support_qualification_owner : MiningSupportQualificationOwner;
    part ore_hold_decision_owner : OreHoldDecisionOwner;
    part mining_command_derivation_owner : MiningCommandDerivationOwner;
    part guard_reporting_derivation_owner : GuardReportingDerivationOwner;

    connection int01 : PortConnection connect pilot_request to request_freshness_priority_owner.pilot_request;
    connection int02 : PortConnection connect hold_sample to hold_guard_qualification_owner.hold_sample;
    connection int03 : PortConnection connect mining_support to mining_support_qualification_owner.mining_support;
    connection int04 : PortConnection connect request_freshness_priority_owner.request_assessment to ore_hold_decision_owner.request_assessment;
    connection int05 : PortConnection connect hold_guard_qualification_owner.hold_assessment to ore_hold_decision_owner.hold_assessment;
    connection int06 : PortConnection connect mining_support_qualification_owner.support_assessment to ore_hold_decision_owner.support_assessment;
    connection int07 : PortConnection connect ore_hold_decision_owner.resolution_to_command to mining_command_derivation_owner.guard_resolution;
    connection int08 : PortConnection connect ore_hold_decision_owner.resolution_to_reporting to guard_reporting_derivation_owner.guard_resolution;
    connection int09 : PortConnection connect mining_command_derivation_owner.mining_command to mining_command;
    connection int10 : PortConnection connect guard_reporting_derivation_owner.guard_status to guard_status;
    connection int11 : PortConnection connect guard_reporting_derivation_owner.offload_readiness to offload_readiness;
  }

  part def OreHoldMiningGuardSupervisorSystem :> System {
    port pilot_request : DataPort { in :>> type : PilotRequestSample; }
    port hold_sample : DataPort { in :>> type : HoldSample; }
    port mining_support : DataPort { in :>> type : MiningSupportSample; }
    port mining_command : DataPort { out :>> type : MiningCommand; }
    port guard_status : DataPort { out :>> type : GuardStatus; }
    port offload_readiness : DataPort { out :>> type : OffloadReadiness; }

    part mining_guard_process : MiningGuardProcess;

    connection support01 : PortConnection connect pilot_request to mining_guard_process.pilot_request;
    connection support02 : PortConnection connect hold_sample to mining_guard_process.hold_sample;
    connection support03 : PortConnection connect mining_support to mining_guard_process.mining_support;
    connection support04 : PortConnection connect mining_guard_process.mining_command to mining_command;
    connection support05 : PortConnection connect mining_guard_process.guard_status to guard_status;
    connection support06 : PortConnection connect mining_guard_process.offload_readiness to offload_readiness;
  }

  part ore_hold_mining_guard_supervisor : OreHoldMiningGuardSupervisorSystem;
}
