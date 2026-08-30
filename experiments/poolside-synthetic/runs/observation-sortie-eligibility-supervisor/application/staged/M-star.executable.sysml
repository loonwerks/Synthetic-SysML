// Canonical contract-bearing source generated from the retained architecture checkpoint.
package Observation_Sortie_Eligibility_Supervisor {
  private import HAMR::*;

  // Finite boundary and policy domains.
  enum def EnergyQuality { enum Nominal; enum Limited; enum Unavailable; enum Unknown; }
  enum def EquipmentCondition { enum Nominal; enum NonNominal; enum Unavailable; enum Unknown; }
  enum def GpsCondition { enum Nominal; enum NonNominal; enum Unavailable; enum Unknown; }
  enum def InertialCondition { enum Nominal; enum NonNominal; enum Unavailable; enum Unknown; }
  enum def BarometricCondition { enum Nominal; enum NonNominal; enum Unavailable; enum Unknown; }
  enum def Engine1Condition { enum Nominal; enum NonNominal; enum Unavailable; enum Unknown; }
  enum def Engine2Condition { enum Nominal; enum NonNominal; enum Unavailable; enum Unknown; }
  enum def Engine3Condition { enum Nominal; enum NonNominal; enum Unavailable; enum Unknown; }
  enum def Engine4Condition { enum Nominal; enum NonNominal; enum Unavailable; enum Unknown; }
  enum def Validity { enum Valid; enum Invalid; }
  enum def Freshness { enum Current; enum Stale; }
  enum def Confirmation { enum Confirmed; enum NotConfirmed; }
  enum def OperatorEvent { enum None; enum Submit; enum Cancel; enum AcknowledgeRecovery; }
  enum def RequestPhase { enum Idle; enum Pending; enum Released; }
  enum def RecoveryPhase { enum Normal; enum Quarantined; enum AwaitingAck; }
  enum def PriorityDirective { enum Inhibit; enum Cancel; enum Recover; enum Submit; enum Hold; }
  enum def CarriedPriority { enum Inhibit; enum Cancel; enum Recover; enum Submit; enum Hold; }
  enum def RecoveryGate { enum Open; enum Closed; }
  enum def SortieDirective { enum Withhold; enum Permit; }
  enum def EligibilityReason { enum None; enum Equipment; enum Recovery; enum NoRequest; }
  enum def ReleaseFeedback { enum NotReleased; enum Released; }
  enum def FaultState { enum Clear; enum Active; }
  enum def EquipmentCause { enum None; enum Energy; enum Propulsion; enum Navigation; enum Obstacle; enum Observation; enum Communication; }
  enum def LimitingCause { enum None; enum Energy; enum Propulsion; enum Navigation; enum Obstacle; enum Observation; enum Communication; enum Recovery; enum NoRequest; }
  enum def StatusRequestPhase { enum Idle; enum Pending; enum Released; }
  enum def StatusFaultState { enum Clear; enum Active; }
  enum def StatusRecoveryPhase { enum Normal; enum Quarantined; enum AwaitingAck; }
  enum def StatusDecision { enum Withhold; enum Permit; }
  enum def EnergyCause { enum None; enum Invalid; enum Stale; enum UnavailableOrUnknown; enum Limited; }
  enum def NavigationCause { enum None; enum Invalid; enum Stale; enum Gps; enum Inertial; enum Barometric; }
  enum def SingleEquipmentCause { enum None; enum Invalid; enum Stale; enum Condition; }
  enum def PropulsionCause { enum None; enum Invalid; enum Stale; enum Configuration; enum Engine1; enum Engine2; enum Engine3; enum Engine4; }

  // Every record field inspected by GUMBO is a direct attribute.
  part def EnergyEvidence :> Data {
    attribute quality : EnergyQuality;
    attribute validity : Validity;
    attribute freshness : Freshness;
  }
  part def NavigationEvidenceRecord :> Data {
    attribute gpsCondition : GpsCondition;
    attribute inertial : InertialCondition;
    attribute barometric : BarometricCondition;
    attribute validity : Validity;
    attribute freshness : Freshness;
  }
  part def EquipmentEvidence :> Data {
    attribute condition : EquipmentCondition;
    attribute validity : Validity;
    attribute freshness : Freshness;
  }
  part def PropulsionEvidence :> Data {
    attribute engine1 : Engine1Condition;
    attribute engine2 : Engine2Condition;
    attribute engine3 : Engine3Condition;
    attribute engine4 : Engine4Condition;
    attribute validity : Validity;
    attribute freshness : Freshness;
    attribute alternatingKindsConfirmed : Confirmation;
  }
  part def EnergyAssessment :> Data {
    attribute ready : Base_Types::Boolean;
    attribute localCause : EnergyCause;
  }
  part def NavigationAssessment :> Data {
    attribute ready : Base_Types::Boolean;
    attribute localCause : NavigationCause;
  }
  part def SingleEquipmentAssessment :> Data {
    attribute ready : Base_Types::Boolean;
    attribute localCause : SingleEquipmentCause;
  }
  part def PropulsionAssessment :> Data {
    attribute ready : Base_Types::Boolean;
    attribute localCause : PropulsionCause;
  }
  part def FaultSummary :> Data {
    attribute faultState : FaultState;
    attribute primaryCause : EquipmentCause;
  }
  part def RecoveryFacts :> Data {
    attribute phase : RecoveryPhase;
    attribute gate : RecoveryGate;
    attribute carriedPriority : CarriedPriority;
  }
  part def EligibilityDecision :> Data {
    attribute directive : SortieDirective;
    attribute reason : EligibilityReason;
  }
  part def EligibilityStatus :> Data {
    attribute requestPhase : StatusRequestPhase;
    attribute faultState : StatusFaultState;
    attribute recoveryPhase : StatusRecoveryPhase;
    attribute decisionDirective : StatusDecision;
    attribute limitingCause : LimitingCause;
  }

  part def EnergyEvidenceAssessor :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port energy_evidence : DataPort { in :>> type : EnergyEvidence; }
    port energy_assessment : DataPort { out :>> type : EnergyAssessment; }

                        
                
                        
                                           
                                        
                                                              
             
                     
                           
                            
                                                               
                                                              
                                                               
                                                    
                                                               
                           
                                
                                                                 
                                                            
                                                               
                                                    
                                                              
                                                                      
                                                            
                                                              
                                                                    
                                                            
                                                                
                                                                       
                                                                    
                                                                                   
                                                            
                                                                
                                                                  
                                                                      
       
  }

  part def NavigationEvidenceAssessor :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port navigation_evidence : DataPort { in :>> type : NavigationEvidenceRecord; }
    port navigation_assessment : DataPort { out :>> type : NavigationAssessment; }

                        
                
                        
                                               
                                            
                                                                      
             
                     
                           
                                
                                                                   
                                                                  
                                                                        
                                                                         
                                                                            
                                                        
                                                                       
                           
                                    
                                                                     
                                                                
                                                                        
                                                                         
                                                                            
                                                        
                                                                  
                                                                              
                                                                
                                                                  
                                                                            
                                                                
                                                                    
                                                                          
                                                                          
                                                                
                                                                    
                                                                          
                                                                           
                                                                               
                                                                
                                                                    
                                                                          
                                                                           
                                                                               
                                                                                 
       
  }

  part def CommunicationEvidenceAssessor :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port communication_evidence : DataPort { in :>> type : EquipmentEvidence; }
    port communication_assessment : DataPort { out :>> type : SingleEquipmentAssessment; }

                        
                
                        
                                                  
                                               
                                                                              
             
                     
                           
                                   
                                                                      
                                                                     
                                                                             
                                                           
                                                                               
                           
                                       
                                                                        
                                                                   
                                                                             
                                                           
                                                                     
                                                                                      
                                                                   
                                                                     
                                                                                    
                                                                   
                                                                       
                                                                                
                                                                                        
       
  }

  part def ObservationEvidenceAssessor :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port observation_evidence : DataPort { in :>> type : EquipmentEvidence; }
    port observation_assessment : DataPort { out :>> type : SingleEquipmentAssessment; }

                        
                
                        
                                                
                                             
                                                                            
             
                     
                           
                                 
                                                                    
                                                                   
                                                                           
                                                         
                                                                             
                           
                                     
                                                                      
                                                                 
                                                                           
                                                         
                                                                   
                                                                                    
                                                                 
                                                                   
                                                                                  
                                                                 
                                                                     
                                                                              
                                                                                      
       
  }

  part def ObstacleEvidenceAssessor :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port obstacle_evidence : DataPort { in :>> type : EquipmentEvidence; }
    port obstacle_assessment : DataPort { out :>> type : SingleEquipmentAssessment; }

                        
                
                        
                                             
                                          
                                                                         
             
                     
                           
                              
                                                                 
                                                                
                                                                        
                                                      
                                                                          
                           
                                  
                                                                   
                                                              
                                                                        
                                                      
                                                                
                                                                                 
                                                              
                                                                
                                                                               
                                                              
                                                                  
                                                                           
                                                                                   
       
  }

  part def PropulsionEvidenceAssessor :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port propulsion_evidence : DataPort { in :>> type : PropulsionEvidence; }
    port propulsion_assessment : DataPort { out :>> type : PropulsionAssessment; }

                        
                
                        
                                               
                                            
                                                                      
             
                     
                           
                                
                                                                   
                                                                  
                                                                                       
                                                                       
                                                                       
                                                                       
                                                                      
                                                        
                                                                       
                           
                                    
                                                                     
                                                                
                                                                                          
                                                                       
                                                                       
                                                                       
                                                                      
                                                        
                                                                  
                                                                              
                                                                
                                                                  
                                                                            
                                                                
                                                                    
                                                                                            
                                                                                    
                                                                
                                                                    
                                                                                         
                                                                         
                                                                              
                                                                
                                                                    
                                                                                         
                                                                         
                                                                         
                                                                              
                                                                
                                                                    
                                                                                         
                                                                         
                                                                         
                                                                         
                                                                              
                                                                
                                                                    
                                                                                         
                                                                         
                                                                         
                                                                         
                                                                         
                                                                              
       
  }

  part def RequestLifecycleOwner :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port operator_event : DataPort { in :>> type : OperatorEvent; }
    port accepted_directive : DataPort { in :>> type : PriorityDirective; }
    port release_feedback : DataPort { in :>> type : ReleaseFeedback; }
    port candidate_event : DataPort { out :>> type : OperatorEvent; }
    port request_phase : DataPort { out :>> type : RequestPhase; }

                        
           
                         
                                    
                
                               
                        
                                       
                                              
                                              
                                                
             
                               
                        
                                            
                                            
                        
                                                   
                                             
                     
                           
                              
                                                                  
                                                         
                           
                                    
                                                                   
                                                     
                                                            
                           
                                        
                                                                   
                                                      
                                                              
                                                         
                           
                                        
                                                                   
                                                         
                                                           
                                                             
                           
                                       
                                                                
                                                                   
                                                       
                                                               
                                                                
                                                          
                                                                
                                                               
                                                                
                                                           
                                                               
                                                             
                                                                
                                                               
                                                                    
                                                                      
                                                             
                                                                     
                                                                        
                                                             
       
  }

  part def FaultRegistry :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port energy_assessment : DataPort { in :>> type : EnergyAssessment; }
    port navigation_assessment : DataPort { in :>> type : NavigationAssessment; }
    port communication_assessment : DataPort { in :>> type : SingleEquipmentAssessment; }
    port observation_assessment : DataPort { in :>> type : SingleEquipmentAssessment; }
    port obstacle_assessment : DataPort { in :>> type : SingleEquipmentAssessment; }
    port propulsion_assessment : DataPort { in :>> type : PropulsionAssessment; }
    port fault_summary : DataPort { out :>> type : FaultSummary; }

                        
                
                        
                                      
                                                        
                                                            
             
                     
                           
                                     
                                                 
                                                
                                                
                                              
                                                 
                                                  
                                                                     
                                              
                                                                      
                                                                            
                                                                          
                                                                       
                                                  
                                                                          
                                                                       
                                                                              
                                                                        
                                                                       
                                                                         
                                                   
                                                                           
                                                                       
                                                                         
                                                                                    
                                                                             
                           
                           
                                                                          
                                                                       
                                                                            
                                                                    
                                                                
       
  }

  part def PriorityArbiter :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port candidate_event : DataPort { in :>> type : OperatorEvent; }
    port fault_summary : DataPort { in :>> type : FaultSummary; }
    port accepted_directive : DataPort { out :>> type : PriorityDirective; }

                        
                
                        
                                           
                                                          
             
                     
                           
                                     
                                                                 
                                                                      
                           
                               
                                                                 
                                                      
                                                                     
                           
                                
                                                                 
                                                                   
                                                                      
                           
                               
                                                                 
                                                      
                                                                     
                           
                             
                                                                 
                                                    
                                                                   
       
  }

  part def RecoveryQualificationOwner :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port accepted_directive : DataPort { in :>> type : PriorityDirective; }
    port fault_summary : DataPort { in :>> type : FaultSummary; }
    port recovery_facts : DataPort { out :>> type : RecoveryFacts; }
    port recovery_phase : DataPort { out :>> type : RecoveryPhase; }

                        
           
                         
                                      
                
                                
                        
                                               
                                                       
                                                             
                                                      
                                                                     
                                                      
             
                                
                        
                                          
                                                  
                                            
                                                             
                                                                        
                                                            
                                                                       
                                                             
                                                                        
                                                            
                                                                       
                                                          
                                                                     
                     
                           
                                      
                                                                 
                                                                   
                                                         
                           
                             
                                                                 
                                                           
                                                                
                                                              
                                                       
                           
                                     
                                                                 
                                                          
                                                              
                                                                   
                                                         
       
  }

  part def EligibilityDecisionOwner :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port energy_assessment : DataPort { in :>> type : EnergyAssessment; }
    port navigation_assessment : DataPort { in :>> type : NavigationAssessment; }
    port communication_assessment : DataPort { in :>> type : SingleEquipmentAssessment; }
    port observation_assessment : DataPort { in :>> type : SingleEquipmentAssessment; }
    port obstacle_assessment : DataPort { in :>> type : SingleEquipmentAssessment; }
    port propulsion_assessment : DataPort { in :>> type : PropulsionAssessment; }
    port recovery_facts : DataPort { in :>> type : RecoveryFacts; }
    port request_phase : DataPort { in :>> type : RequestPhase; }
    port eligibility_decision : DataPort { out :>> type : EligibilityDecision; }

                        
                
                        
                                               
                                                                      
                                                                    
             
                     
                           
                                           
                                                          
                                                          
                                                                       
                                                                                  
                                               
                                                   
                                                      
                                                    
                                                 
                                                   
                                                                             
                                                                             
                                                                       
                                                                               
                                                                         
                                                                           
                                                            
                                                                            
                                                                       
                                                                               
                                                                         
                                                                           
                                                          
                                                        
                                                                            
                                                                             
                           
                                  
                                                          
                                                        
                                                                     
                                                                             
                                                                       
                                                                       
                                                                         
                                                                          
                                                                                
                                                                    
                           
                                              
                                                          
                                                        
                                                                        
                                             
                                                 
                                                    
                                                  
                                               
                                                 
                                                                          
                                                                                  
                                                                         
       
  }

  part def PermissionReleaseLedger :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port eligibility_decision : DataPort { in :>> type : EligibilityDecision; }
    port request_phase : DataPort { in :>> type : RequestPhase; }
    port release_feedback : DataPort { out :>> type : ReleaseFeedback; }
    port sortie_directive : DataPort { out :>> type : SortieDirective; }

                        
           
                         
                                       
                
                               
                        
                                           
                                                        
                                                           
                                                       
             
                               
                        
                                          
                                                   
                                                                      
                                                              
                                                        
                                                           
                                                    
                                                                       
                                                             
                                                          
                                                              
                          
                                            
                                                
                                                           
                                                
                                                   
                                                                      
                                                              
                                                        
                                                
                                                    
                                                                       
                                                             
                                                 
       
  }

  part def StatusComposer :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port eligibility_decision : DataPort { in :>> type : EligibilityDecision; }
    port fault_summary : DataPort { in :>> type : FaultSummary; }
    port recovery_phase : DataPort { in :>> type : RecoveryPhase; }
    port request_phase : DataPort { in :>> type : RequestPhase; }
    port eligibility_status : DataPort { out :>> type : EligibilityStatus; }

                        
                
                        
                                                   
                                                                      
                                                                   
                                                                               
                                                                           
                                                                     
             
                        
                                               
                                                
                                                                         
                                                   
                                                                            
                                                    
                                                                              
                                                          
                                                                      
                                                           
                                                                        
                                                    
                                                                             
                                                         
                                                                                  
                                                         
                                                                                   
                                                                        
                                                                              
                                                                      
                                                                            
                        
                                                
                                                                   
                                                                     
                                                                       
                                                                         
                                                                        
                                                                          
                                                                        
                                                                   
                                                                         
                                                                       
                                                                             
                                                                       
                                                                             
                                                                     
                                                                           
                                                                        
                                                                              
                                                                          
                                                                                  
       
  }

  part def EligibilitySupervisorProcess :> Process {
    port energy_evidence : DataPort { in :>> type : EnergyEvidence; }
    port navigation_evidence : DataPort { in :>> type : NavigationEvidenceRecord; }
    port communication_evidence : DataPort { in :>> type : EquipmentEvidence; }
    port observation_evidence : DataPort { in :>> type : EquipmentEvidence; }
    port obstacle_evidence : DataPort { in :>> type : EquipmentEvidence; }
    port propulsion_evidence : DataPort { in :>> type : PropulsionEvidence; }
    port operator_event : DataPort { in :>> type : OperatorEvent; }
    port sortie_directive : DataPort { out :>> type : SortieDirective; }
    port eligibility_status : DataPort { out :>> type : EligibilityStatus; }

    // Thirteen sibling semantic usages in approved allocation order.
    part energy_evidence_assessor : EnergyEvidenceAssessor;
    part navigation_evidence_assessor : NavigationEvidenceAssessor;
    part communication_evidence_assessor : CommunicationEvidenceAssessor;
    part observation_evidence_assessor : ObservationEvidenceAssessor;
    part obstacle_evidence_assessor : ObstacleEvidenceAssessor;
    part propulsion_evidence_assessor : PropulsionEvidenceAssessor;
    part request_lifecycle_owner : RequestLifecycleOwner;
    part fault_registry : FaultRegistry;
    part priority_arbiter : PriorityArbiter;
    part recovery_qualification_owner : RecoveryQualificationOwner;
    part eligibility_decision_owner : EligibilityDecisionOwner;
    part permission_release_ledger : PermissionReleaseLedger;
    part status_composer : StatusComposer;

    // Exactly thirty-five directed semantic interactions.
    connection int01 : PortConnection connect energy_evidence to energy_evidence_assessor.energy_evidence;
    connection int02 : PortConnection connect navigation_evidence to navigation_evidence_assessor.navigation_evidence;
    connection int03 : PortConnection connect communication_evidence to communication_evidence_assessor.communication_evidence;
    connection int04 : PortConnection connect observation_evidence to observation_evidence_assessor.observation_evidence;
    connection int05 : PortConnection connect obstacle_evidence to obstacle_evidence_assessor.obstacle_evidence;
    connection int06 : PortConnection connect propulsion_evidence to propulsion_evidence_assessor.propulsion_evidence;
    connection int07 : PortConnection connect operator_event to request_lifecycle_owner.operator_event;
    connection int08 : PortConnection connect energy_evidence_assessor.energy_assessment to fault_registry.energy_assessment;
    connection int09 : PortConnection connect navigation_evidence_assessor.navigation_assessment to fault_registry.navigation_assessment;
    connection int10 : PortConnection connect communication_evidence_assessor.communication_assessment to fault_registry.communication_assessment;
    connection int11 : PortConnection connect observation_evidence_assessor.observation_assessment to fault_registry.observation_assessment;
    connection int12 : PortConnection connect obstacle_evidence_assessor.obstacle_assessment to fault_registry.obstacle_assessment;
    connection int13 : PortConnection connect propulsion_evidence_assessor.propulsion_assessment to fault_registry.propulsion_assessment;
    connection int14 : PortConnection connect energy_evidence_assessor.energy_assessment to eligibility_decision_owner.energy_assessment;
    connection int15 : PortConnection connect navigation_evidence_assessor.navigation_assessment to eligibility_decision_owner.navigation_assessment;
    connection int16 : PortConnection connect communication_evidence_assessor.communication_assessment to eligibility_decision_owner.communication_assessment;
    connection int17 : PortConnection connect observation_evidence_assessor.observation_assessment to eligibility_decision_owner.observation_assessment;
    connection int18 : PortConnection connect obstacle_evidence_assessor.obstacle_assessment to eligibility_decision_owner.obstacle_assessment;
    connection int19 : PortConnection connect propulsion_evidence_assessor.propulsion_assessment to eligibility_decision_owner.propulsion_assessment;
    connection int20 : PortConnection connect request_lifecycle_owner.candidate_event to priority_arbiter.candidate_event;
    connection int21 : PortConnection connect fault_registry.fault_summary to priority_arbiter.fault_summary;
    connection int22 : PortConnection connect priority_arbiter.accepted_directive to request_lifecycle_owner.accepted_directive;
    connection int23 : PortConnection connect priority_arbiter.accepted_directive to recovery_qualification_owner.accepted_directive;
    connection int24 : PortConnection connect fault_registry.fault_summary to recovery_qualification_owner.fault_summary;
    connection int25 : PortConnection connect recovery_qualification_owner.recovery_facts to eligibility_decision_owner.recovery_facts;
    connection int26 : PortConnection connect request_lifecycle_owner.request_phase to eligibility_decision_owner.request_phase;
    connection int27 : PortConnection connect eligibility_decision_owner.eligibility_decision to permission_release_ledger.eligibility_decision;
    connection int28 : PortConnection connect permission_release_ledger.release_feedback to request_lifecycle_owner.release_feedback;
    connection int29 : PortConnection connect eligibility_decision_owner.eligibility_decision to status_composer.eligibility_decision;
    connection int30 : PortConnection connect fault_registry.fault_summary to status_composer.fault_summary;
    connection int31 : PortConnection connect recovery_qualification_owner.recovery_phase to status_composer.recovery_phase;
    connection int32 : PortConnection connect request_lifecycle_owner.request_phase to status_composer.request_phase;
    connection int33 : PortConnection connect permission_release_ledger.sortie_directive to sortie_directive;
    connection int34 : PortConnection connect status_composer.eligibility_status to eligibility_status;
    connection int35 : PortConnection connect request_lifecycle_owner.request_phase to permission_release_ledger.request_phase;

  }

  part def ObservationSortieEligibilitySupervisorSystem :> System {
    port energy_evidence : DataPort { in :>> type : EnergyEvidence; }
    port navigation_evidence : DataPort { in :>> type : NavigationEvidenceRecord; }
    port communication_evidence : DataPort { in :>> type : EquipmentEvidence; }
    port observation_evidence : DataPort { in :>> type : EquipmentEvidence; }
    port obstacle_evidence : DataPort { in :>> type : EquipmentEvidence; }
    port propulsion_evidence : DataPort { in :>> type : PropulsionEvidence; }
    port operator_event : DataPort { in :>> type : OperatorEvent; }
    port sortie_eligibility_directive : DataPort { out :>> type : SortieDirective; }
    port eligibility_status : DataPort { out :>> type : EligibilityStatus; }

    part eligibility_supervisor_process : EligibilitySupervisorProcess;

    // authorized by SUPPORT-01; the paired declarations carry no semantic credit.
    connection support01 : PortConnection connect energy_evidence to eligibility_supervisor_process.energy_evidence;
    connection support02 : PortConnection connect navigation_evidence to eligibility_supervisor_process.navigation_evidence;
    connection support03 : PortConnection connect communication_evidence to eligibility_supervisor_process.communication_evidence;
    connection support04 : PortConnection connect observation_evidence to eligibility_supervisor_process.observation_evidence;
    connection support05 : PortConnection connect obstacle_evidence to eligibility_supervisor_process.obstacle_evidence;
    connection support06 : PortConnection connect propulsion_evidence to eligibility_supervisor_process.propulsion_evidence;
    connection support07 : PortConnection connect operator_event to eligibility_supervisor_process.operator_event;
    connection support08 : PortConnection connect eligibility_supervisor_process.sortie_directive to sortie_eligibility_directive;
    connection support09 : PortConnection connect eligibility_supervisor_process.eligibility_status to eligibility_status;
    connection support10 : PortConnection connect energy_evidence to eligibility_supervisor_process.energy_evidence;
    connection support11 : PortConnection connect navigation_evidence to eligibility_supervisor_process.navigation_evidence;
    connection support12 : PortConnection connect communication_evidence to eligibility_supervisor_process.communication_evidence;
    connection support13 : PortConnection connect observation_evidence to eligibility_supervisor_process.observation_evidence;
    connection support14 : PortConnection connect obstacle_evidence to eligibility_supervisor_process.obstacle_evidence;
    connection support15 : PortConnection connect propulsion_evidence to eligibility_supervisor_process.propulsion_evidence;
    connection support16 : PortConnection connect operator_event to eligibility_supervisor_process.operator_event;
    connection support17 : PortConnection connect eligibility_supervisor_process.sortie_directive to sortie_eligibility_directive;
    connection support18 : PortConnection connect eligibility_supervisor_process.eligibility_status to eligibility_status;
  }

  // Exactly one explicit root System usage.
  part observation_sortie_eligibility_supervisor : ObservationSortieEligibilitySupervisorSystem;
}
