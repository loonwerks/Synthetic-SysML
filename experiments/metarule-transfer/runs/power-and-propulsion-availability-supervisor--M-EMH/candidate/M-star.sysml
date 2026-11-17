// Canonical contracted model for immutable run
// 20260814T132656Z-fire-observation-sortie-hard-r2-a1.

package Power_Propulsion_Availability_Supervisor {
  private import HAMR::*;

  enum def BatteryQuality { enum ADEQUATE; enum LIMITED; enum DEPLETED; enum UNKNOWN; }
  enum def EvidenceValidity { enum VALID; enum INVALID; }
  enum def EvidenceFreshness { enum CURRENT; enum STALE; }
  enum def PowerCondition { enum NOMINAL; enum DEGRADED; enum UNAVAILABLE; enum UNKNOWN; }
  enum def EnginePositionOneCondition { enum NOMINAL; enum NON_NOMINAL; enum UNAVAILABLE; enum UNKNOWN; }
  enum def EnginePositionTwoCondition { enum NOMINAL; enum NON_NOMINAL; enum UNAVAILABLE; enum UNKNOWN; }
  enum def EngineCount { enum FOUR; enum OTHER; enum UNKNOWN; }
  enum def AlternatingKinds { enum MATCHES_SOURCE; enum DOES_NOT_MATCH; enum UNKNOWN; }
  enum def ChargerCoupling { enum DISCONNECTED; enum CONNECTED_IDLE; enum CHARGING; enum UNKNOWN; }
  enum def ControlEvent { enum NONE; enum REQUEST_ENABLE; enum REQUEST_DISABLE; enum ACKNOWLEDGE_RECOVERY; }
  enum def RequestContextEvent { enum NONE; enum REQUEST_ENABLE; enum REQUEST_DISABLE; enum ACKNOWLEDGE_RECOVERY; }
  enum def ActuationFeedback { enum DISABLED_CONFIRMED; enum ENABLED_CONFIRMED; enum UNKNOWN; }

  enum def AdmissionResult { enum ADMITTED_NONE; enum REJECTED_INVALID; enum REJECTED_STALE; }
  enum def BatteryAssessment { enum READY_NONE; enum NOT_READY_INVALID; enum NOT_READY_STALE; enum NOT_READY_LIMITED; enum NOT_READY_DEPLETED_OR_UNKNOWN; }
  enum def PowerAssessment { enum READY_NONE; enum NOT_READY_INVALID; enum NOT_READY_STALE; enum NOT_READY_CONDITION; }
  enum def EnginePairAssessment { enum READY_NONE; enum NOT_READY_INVALID; enum NOT_READY_STALE; enum NOT_READY_FIRST_POSITION; enum NOT_READY_SECOND_POSITION; }
  enum def ConfigurationAssessment { enum READY_NONE; enum NOT_READY_INVALID; enum NOT_READY_STALE; enum NOT_READY_ENGINE_COUNT; enum NOT_READY_ALTERNATION; }
  enum def ChargingAssessment { enum READY_NONE; enum NOT_READY_INVALID; enum NOT_READY_STALE; enum NOT_READY_CONNECTED_IDLE; enum NOT_READY_CHARGING_OR_UNKNOWN; }
  enum def PropulsionAssessment { enum READY_NONE; enum NOT_READY_ODD_ENGINE_GROUP; enum NOT_READY_EVEN_ENGINE_GROUP; enum NOT_READY_CONFIGURATION; }
  enum def DemandPhase { enum IDLE; enum REQUESTED; enum ACTIVE; }
  enum def PriorityDirective { enum INHIBIT; enum DISABLE; enum RECOVER; enum ENABLE; enum HOLD; }
  enum def SummaryDirective { enum INHIBIT; enum DISABLE; enum RECOVER; enum ENABLE; enum HOLD; }
  enum def RecoveryPhase { enum NORMAL; enum QUARANTINED; enum AWAITING_ACK; }
  enum def RecoveryGate { enum OPEN; enum CLOSED; }
  enum def CommandPhase { enum DISABLED; enum ENABLE_PENDING; enum ENABLED; }
  enum def FaultStatus { enum CLEAR; enum ACTIVE; }
  enum def FaultCause { enum NONE; enum BATTERY; enum POWER_MANAGEMENT; enum ODD_ENGINE_GROUP; enum EVEN_ENGINE_GROUP; enum CONFIGURATION; enum CHARGER; }
  enum def AvailabilityValue { enum UNAVAILABLE; enum AVAILABLE_FOR_ENABLE; }
  enum def AvailabilityCause { enum NONE; enum BATTERY; enum POWER_MANAGEMENT; enum ODD_ENGINE_GROUP; enum EVEN_ENGINE_GROUP; enum CONFIGURATION; enum CHARGER; enum RECOVERY; enum NO_DEMAND; enum OPERATOR_DISABLE; }
  enum def ReportAvailabilityValue { enum UNAVAILABLE; enum AVAILABLE_FOR_ENABLE; }
  enum def ReportAvailabilityCause { enum NONE; enum BATTERY; enum POWER_MANAGEMENT; enum ODD_ENGINE_GROUP; enum EVEN_ENGINE_GROUP; enum CONFIGURATION; enum CHARGER; enum RECOVERY; enum NO_DEMAND; enum OPERATOR_DISABLE; }
  enum def ReportDemandPhase { enum IDLE; enum REQUESTED; enum ACTIVE; }
  enum def ReportRecoveryPhase { enum NORMAL; enum QUARANTINED; enum AWAITING_ACK; }
  enum def PowerCommand { enum DISABLE; enum ENABLE_NEW; enum ENABLE_HOLD; }

  // All record members inspected by GUMBO are direct attributes.
  part def BatteryObservation :> Data {
    attribute quality : BatteryQuality;
    attribute validity : EvidenceValidity;
    attribute freshness : EvidenceFreshness;
  }
  part def PowerEvidence :> Data {
    attribute condition : PowerCondition;
    attribute validity : EvidenceValidity;
    attribute freshness : EvidenceFreshness;
  }
  part def EnginePairEvidence :> Data {
    attribute positionOneState : EnginePositionOneCondition;
    attribute positionTwoState : EnginePositionTwoCondition;
    attribute validity : EvidenceValidity;
    attribute freshness : EvidenceFreshness;
  }
  part def ConfigurationEvidence :> Data {
    attribute engineCount : EngineCount;
    attribute alternatingKinds : AlternatingKinds;
    attribute validity : EvidenceValidity;
    attribute freshness : EvidenceFreshness;
  }
  part def ChargerEvidence :> Data {
    attribute coupling : ChargerCoupling;
    attribute validity : EvidenceValidity;
    attribute freshness : EvidenceFreshness;
  }
  part def QualifiedBatteryObservation :> Data {
    attribute admission : AdmissionResult;
    attribute quality : BatteryQuality;
  }
  part def RequestContext :> Data {
    attribute demand : DemandPhase;
    attribute candidateEvent : RequestContextEvent;
  }
  part def FaultActionSummary :> Data {
    attribute fault : FaultStatus;
    attribute cause : FaultCause;
    attribute directive : SummaryDirective;
  }
  part def RecoveryFrame :> Data {
    attribute phase : RecoveryPhase;
    attribute gate : RecoveryGate;
  }
  part def AvailabilityDecision :> Data {
    attribute decision : AvailabilityValue;
    attribute cause : AvailabilityCause;
  }
  part def AvailabilityReport :> Data {
    attribute decision : ReportAvailabilityValue;
    attribute cause : ReportAvailabilityCause;
    attribute demand : ReportDemandPhase;
    attribute recovery : ReportRecoveryPhase;
  }

  part def BatteryObservationAdmissionOwner :> Thread {
    port battery_observation : DataPort { in :>> type : BatteryObservation; }
    port qualified_battery : DataPort { out :>> type : QualifiedBatteryObservation; }
                        
                
                         
                                             
                                                                           
                                                              
             
                     
                           
                                
                                                                           
                                                                         
                                                                                    
                                                                       
                           
                                
                                                                             
                                                                       
                                                                                
                                                                          
                                                                                  
                                                                        
                                                                                
       
  }

  part def BatteryCapacityAssessmentOwner :> Thread {
    port qualified_battery : DataPort { in :>> type : QualifiedBatteryObservation; }
    port battery_assessment : DataPort { out :>> type : BatteryAssessment; }
                        
                
                         
                                                                                                       
             
                     
                           
                                     
                                                                                 
                                                                   
                                                                         
                           
                                         
                                                                                 
                                                                   
                     
                                                                                 
                                                                            
                                                                               
                                                                          
                                                                              
                                                                     
                                                                            
                                                                              
                                                                       
                                                                       
                                                                                        
       
  }

  part def PowerManagementAssessmentOwner :> Thread {
    port power_evidence : DataPort { in :>> type : PowerEvidence; }
    port power_assessment : DataPort { out :>> type : PowerAssessment; }
                        
                
                         
                                                                                                 
             
                     
                           
                                   
                                                                      
                                                                     
                                                                 
                                                                     
                           
                                       
                                                                        
                                                                   
                                                                 
                     
                                                                     
                                                                        
                                                                   
                                                                     
                                                                      
                                                                   
                                                                       
                                                                    
                                                                          
       
  }

  part def OddEngineGroupAssessor :> Thread {
    port odd_engine_evidence : DataPort { in :>> type : EnginePairEvidence; }
    port odd_engine_assessment : DataPort { out :>> type : EnginePairAssessment; }
                        
                
                         
                                                                                                               
             
                     
                           
                                       
                                                                           
                                                                          
                                                                                          
                                                                                         
                                                                               
                           
                                           
                                                                             
                                                                        
                                                                                          
                                                                                         
                     
                                                                          
                                                                                  
                                                                        
                                                                          
                                                                                
                                                                        
                                                                            
                                                                                            
                                                                                         
                                                                        
                                                                            
                                                                                            
                                                                                            
                                                                                          
       
  }

  part def EvenEngineGroupAssessor :> Thread {
    port even_engine_evidence : DataPort { in :>> type : EnginePairEvidence; }
    port even_engine_assessment : DataPort { out :>> type : EnginePairAssessment; }
                        
                
                         
                                                                                                                 
             
                     
                           
                                        
                                                                            
                                                                           
                                                                                           
                                                                                          
                                                                                
                           
                                            
                                                                              
                                                                         
                                                                                           
                                                                                          
                     
                                                                           
                                                                                   
                                                                         
                                                                           
                                                                                 
                                                                         
                                                                             
                                                                                             
                                                                                          
                                                                         
                                                                             
                                                                                             
                                                                                             
                                                                                           
       
  }

  part def FourEngineConfigurationAssessor :> Thread {
    port configuration_evidence : DataPort { in :>> type : ConfigurationEvidence; }
    port configuration_assessment : DataPort { out :>> type : ConfigurationAssessment; }
                        
                
                         
                                                  
                                                                                
             
                     
                           
                                           
                                                                              
                                                                             
                                                                      
                                                                                         
                                                                                     
                           
                                               
                                                                                
                                                                           
                                                                      
                                                                                         
                     
                                                                             
                                                                                        
                                                                           
                                                                             
                                                                                      
                                                                           
                                                                               
                                                                        
                                                                                             
                                                                           
                                                                               
                                                                        
                                                                                            
                                                                                            
       
  }

  part def PropulsionEvidenceComposer :> Thread {
    port odd_engine_assessment : DataPort { in :>> type : EnginePairAssessment; }
    port even_engine_assessment : DataPort { in :>> type : EnginePairAssessment; }
    port configuration_assessment : DataPort { in :>> type : ConfigurationAssessment; }
    port propulsion_assessment : DataPort { out :>> type : PropulsionAssessment; }
                        
                
                         
                                               
                                                                                   
             
                     
                           
                                        
                                                                             
                                                                         
                                                                             
                                                                               
                           
                                            
                                                                             
                                                                         
                                                                             
                     
                                                                          
                                                                                           
                                                                          
                                                                           
                                                                                            
                                                                          
                                                                           
                                                                                
                                                                                        
       
  }

  part def ChargingInterlockAssessor :> Thread {
    port charger_evidence : DataPort { in :>> type : ChargerEvidence; }
    port charging_assessment : DataPort { out :>> type : ChargingAssessment; }
                        
                
                         
                                                                                                          
             
                     
                           
                                      
                                                                        
                                                                       
                                                                        
                                                                           
                           
                                          
                                                                          
                                                                     
                                                                        
                     
                                                                       
                                                                              
                                                                     
                                                                       
                                                                            
                                                                     
                                                                         
                                                                             
                                                                                     
                                                                     
                                                                         
                                                                        
                                                                        
                                                                                          
       
  }

  part def EnableDemandLifecycleOwner :> Thread {
    port control_event : DataPort { in :>> type : ControlEvent; }
    port actuation_feedback : DataPort { in :>> type : ActuationFeedback; }
    port accepted_directive : DataPort { in :>> type : PriorityDirective; }
    port request_context : DataPort { out :>> type : RequestContext; }
    port demand_view : DataPort { out :>> type : DemandPhase; }
                        
           
                         
                                  
                
                              
                         
                                      
                                                                                         
                                                                                                       
             
                              
                           
                                           
                                                                                        
                                                
                                                                         
                                                          
                                                                                   
                                                           
                                                                                    
                                                                
                                                                                         
                     
                           
                                          
                                                                    
                                                               
                                                              
                                                       
                           
                                     
                                                                    
                                                             
                                                            
                                                          
                                                                            
                                                        
                                                                             
                                                         
                           
                                                
                                                                    
                                                             
                                                     
                                                           
                                                                            
                                                        
                                                                             
                     
                                                       
                                                                  
                                                        
                                                      
                                                              
                                                   
       
  }

  part def FaultActionPriorityResolver :> Thread {
    port request_context : DataPort { in :>> type : RequestContext; }
    port battery_assessment : DataPort { in :>> type : BatteryAssessment; }
    port power_assessment : DataPort { in :>> type : PowerAssessment; }
    port propulsion_assessment : DataPort { in :>> type : PropulsionAssessment; }
    port charging_assessment : DataPort { in :>> type : ChargingAssessment; }
    port accepted_directive : DataPort { out :>> type : PriorityDirective; }
    port fault_action_summary : DataPort { out :>> type : FaultActionSummary; }
                        
                
                         
                                           
                                                           
                                                            
                                                            
                                                                     
             
                         
                                         
                                                             
                                                                         
                                                             
                                                                         
                                                             
                                                                         
                                                            
                                                                        
                                                          
                                                                      
                     
                           
                                             
                                                                       
                                                              
                                                                        
                                                                   
                                                                       
                                                                
                                                                          
                                                                      
                                                                   
                                                                      
                                                                
                                                                            
                                                                      
                                                                
                                                                    
                                                                   
                                                                      
                                                                
                                                                    
                                                                                          
                                                                            
                                                                      
                                                                
                                                                    
                                                                                           
                                                                             
                                                                      
                                                                
                                                                    
                                                                                       
                                                                         
                           
                                        
                                                                       
                                                              
                                                                        
                                                                    
                                                                                    
                                                                       
                                                               
                                                             
                                                                         
                           
                                         
                                                                       
                                                              
                                                                        
                                                                    
                                                                                         
                                                                       
                                                               
                                                             
                                                                         
                           
                                        
                                                                       
                                                              
                                                                        
                                                                    
                                                                                   
                                                                       
                                                             
                                                              
                                                                
                                                                            
                                                            
                                                              
                                                                          
                           
                            
                                                                       
                                                              
                                                                        
                                                                    
                                                                         
                                                                    
                                                               
                                                             
                                                                      
       
  }

  part def RecoveryQualificationOwner :> Thread {
    port fault_action_summary : DataPort { in :>> type : FaultActionSummary; }
    port recovery_frame : DataPort { out :>> type : RecoveryFrame; }
    port recovery_gate : DataPort { out :>> type : RecoveryGate; }
                        
           
                         
                                      
                
                                
                         
                                          
                                                        
                                                              
                                                                                            
             
                                
                           
                                              
                                                                                         
                                                                                          
                                                                                            
                     
                           
                                        
                                                                    
                                                                  
                           
                                    
                                                                    
                                                                
                                                                  
                                                                             
                                                                   
                           
                                     
                                                                    
                                                           
                                                                  
                                                                             
                                                             
       
  }

  part def AvailabilityDecisionOwner :> Thread {
    port battery_assessment : DataPort { in :>> type : BatteryAssessment; }
    port power_assessment : DataPort { in :>> type : PowerAssessment; }
    port propulsion_assessment : DataPort { in :>> type : PropulsionAssessment; }
    port charging_assessment : DataPort { in :>> type : ChargingAssessment; }
    port demand_view : DataPort { in :>> type : DemandPhase; }
    port fault_action_summary : DataPort { in :>> type : FaultActionSummary; }
    port recovery_frame : DataPort { in :>> type : RecoveryFrame; }
    port availability_decision : DataPort { out :>> type : AvailabilityDecision; }
    port availability_report : DataPort { out :>> type : AvailabilityReport; }
                        
                
                         
                                                   
                                                                           
                                                                     
                                                                               
                                                                         
                                                                
                                                                           
             
                        
                                      
                                                                             
                                                                                  
                                                                                      
                                                                                            
                                                                   
                                                                        
                                                                      
                                                                           
                                                                               
                                                                                    
                                                                               
                                                                                    
                                                                                
                                                                                     
                                                                            
                                                                                 
                                                                      
                                                                           
                                                                       
                                                                            
                                                                        
                                                                             
                                                                               
                                                                                     
                                             
                                                                   
                                                  
                                                                        
                                               
                                                                      
                                                          
                                                                         
                                                               
                                                                              
                                                                
                                                                               
                     
                           
                                 
                                                                       
                                                              
                                                                        
                                                                    
                                               
                                                               
                                                            
                                                        
                                                                          
                                                                        
                                                                                                
                                                                    
                           
                                            
                                                                       
                                                              
                                                                        
                                                                    
                                               
                                                                
                                                            
                                                          
                                                                          
                                                                          
                                                                         
                                                                                       
                                                                      
                                                                           
                                                                      
                                                                
                                                                                    
                                                                      
                                                                
                                                                    
                                                                           
                                                                      
                                                                
                                                                    
                                                                                          
                                                                                    
                                                                      
                                                                
                                                                    
                                                                                           
                                                                                     
                                                                      
                                                                
                                                                    
                                                                                       
                                                                                 
                                                                      
                                                                
                                                                    
                                                                          
                                                                  
                                                                    
                                                                             
                                                                             
                                                                                      
                                                                    
                                                                             
                                                                             
                                                                                      
                                                                              
                                                                                       
                                                                          
                                                                                     
                                                                      
                                                                
                                                                    
                                                                          
                                                                 
                                                                            
                                                                                    
                                                                      
                                                                
                                                                    
                                                                          
                                                                 
                                                                            
                                                             
                                                                              
                                                                            
                                                                      
                                                                
                                                                    
                                                                          
                                                                 
                                                                            
                                                          
                                                                            
                                                 
                                                                             
       
  }

  part def PowerCommandInterlockOwner :> Thread {
    port actuation_feedback : DataPort { in :>> type : ActuationFeedback; }
    port availability_decision : DataPort { in :>> type : AvailabilityDecision; }
    port demand_view : DataPort { in :>> type : DemandPhase; }
    port recovery_gate : DataPort { in :>> type : RecoveryGate; }
    port accepted_directive : DataPort { in :>> type : PriorityDirective; }
    port power_command : DataPort { out :>> type : PowerCommand; }
                        
           
                         
                                    
                
                               
                         
                                           
                                                                                         
             
                               
                        
                                             
                                                                                       
                                                                                   
                                                              
                                                              
                                                                                             
                                                                                      
                                                                                  
                                                             
                                                            
                                                        
                                                                                                      
                                                                                      
                                                                                  
                                                             
                                                            
                                                                                                    
                                                                         
                                                      
                                                                          
                                                             
                                                               
                                                     
       
  }

  part def PowerPropulsionSupervisorProcess :> Process {
    port battery_observation : DataPort { in :>> type : BatteryObservation; }
    port power_evidence : DataPort { in :>> type : PowerEvidence; }
    port odd_engine_evidence : DataPort { in :>> type : EnginePairEvidence; }
    port even_engine_evidence : DataPort { in :>> type : EnginePairEvidence; }
    port configuration_evidence : DataPort { in :>> type : ConfigurationEvidence; }
    port charger_evidence : DataPort { in :>> type : ChargerEvidence; }
    port control_event : DataPort { in :>> type : ControlEvent; }
    port actuation_feedback : DataPort { in :>> type : ActuationFeedback; }
    port power_command : DataPort { out :>> type : PowerCommand; }
    port availability_report : DataPort { out :>> type : AvailabilityReport; }

    part battery_observation_admission : BatteryObservationAdmissionOwner;
    part battery_capacity_assessment : BatteryCapacityAssessmentOwner;
    part power_management_assessment : PowerManagementAssessmentOwner;
    part odd_engine_group_assessor : OddEngineGroupAssessor;
    part even_engine_group_assessor : EvenEngineGroupAssessor;
    part four_engine_configuration_assessor : FourEngineConfigurationAssessor;
    part propulsion_evidence_composer : PropulsionEvidenceComposer;
    part charging_interlock_assessor : ChargingInterlockAssessor;
    part enable_demand_lifecycle : EnableDemandLifecycleOwner;
    part fault_action_priority_resolver : FaultActionPriorityResolver;
    part recovery_qualification : RecoveryQualificationOwner;
    part availability_decision_owner : AvailabilityDecisionOwner;
    part power_command_interlock : PowerCommandInterlockOwner;

    // Eleven generated-support Process-boundary segments.
    connection support01 : PortConnection connect battery_observation to battery_observation_admission.battery_observation;
    connection support02 : PortConnection connect power_evidence to power_management_assessment.power_evidence;
    connection support03 : PortConnection connect odd_engine_evidence to odd_engine_group_assessor.odd_engine_evidence;
    connection support04 : PortConnection connect even_engine_evidence to even_engine_group_assessor.even_engine_evidence;
    connection support05 : PortConnection connect configuration_evidence to four_engine_configuration_assessor.configuration_evidence;
    connection support06 : PortConnection connect charger_evidence to charging_interlock_assessor.charger_evidence;
    connection support07 : PortConnection connect control_event to enable_demand_lifecycle.control_event;
    connection support08 : PortConnection connect actuation_feedback to enable_demand_lifecycle.actuation_feedback;
    connection support09 : PortConnection connect actuation_feedback to power_command_interlock.actuation_feedback;
    connection support10 : PortConnection connect power_command_interlock.power_command to power_command;
    connection support11 : PortConnection connect availability_decision_owner.availability_report to availability_report;

    // Twenty-two sibling-Thread semantic segments.
    connection int02 : PortConnection connect battery_observation_admission.qualified_battery to battery_capacity_assessment.qualified_battery;
    connection int07 : PortConnection connect odd_engine_group_assessor.odd_engine_assessment to propulsion_evidence_composer.odd_engine_assessment;
    connection int08 : PortConnection connect even_engine_group_assessor.even_engine_assessment to propulsion_evidence_composer.even_engine_assessment;
    connection int09 : PortConnection connect four_engine_configuration_assessor.configuration_assessment to propulsion_evidence_composer.configuration_assessment;
    connection int13 : PortConnection connect enable_demand_lifecycle.request_context to fault_action_priority_resolver.request_context;
    connection int14 : PortConnection connect battery_capacity_assessment.battery_assessment to fault_action_priority_resolver.battery_assessment;
    connection int15 : PortConnection connect power_management_assessment.power_assessment to fault_action_priority_resolver.power_assessment;
    connection int16 : PortConnection connect propulsion_evidence_composer.propulsion_assessment to fault_action_priority_resolver.propulsion_assessment;
    connection int17 : PortConnection connect charging_interlock_assessor.charging_assessment to fault_action_priority_resolver.charging_assessment;
    connection int18 : PortConnection connect fault_action_priority_resolver.accepted_directive to enable_demand_lifecycle.accepted_directive;
    connection int20 : PortConnection connect fault_action_priority_resolver.fault_action_summary to recovery_qualification.fault_action_summary;
    connection int21 : PortConnection connect battery_capacity_assessment.battery_assessment to availability_decision_owner.battery_assessment;
    connection int22 : PortConnection connect power_management_assessment.power_assessment to availability_decision_owner.power_assessment;
    connection int23 : PortConnection connect propulsion_evidence_composer.propulsion_assessment to availability_decision_owner.propulsion_assessment;
    connection int24 : PortConnection connect charging_interlock_assessor.charging_assessment to availability_decision_owner.charging_assessment;
    connection int25 : PortConnection connect enable_demand_lifecycle.demand_view to availability_decision_owner.demand_view;
    connection int26 : PortConnection connect fault_action_priority_resolver.fault_action_summary to availability_decision_owner.fault_action_summary;
    connection int27 : PortConnection connect recovery_qualification.recovery_frame to availability_decision_owner.recovery_frame;
    connection int28 : PortConnection connect availability_decision_owner.availability_decision to power_command_interlock.availability_decision;
    connection int29 : PortConnection connect enable_demand_lifecycle.demand_view to power_command_interlock.demand_view;
    connection int30 : PortConnection connect recovery_qualification.recovery_gate to power_command_interlock.recovery_gate;
    connection int31 : PortConnection connect fault_action_priority_resolver.accepted_directive to power_command_interlock.accepted_directive;
  }

  part def PowerPropulsionAvailabilitySystem :> System {
    port battery_observation : DataPort { in :>> type : BatteryObservation; }
    port power_evidence : DataPort { in :>> type : PowerEvidence; }
    port odd_engine_evidence : DataPort { in :>> type : EnginePairEvidence; }
    port even_engine_evidence : DataPort { in :>> type : EnginePairEvidence; }
    port configuration_evidence : DataPort { in :>> type : ConfigurationEvidence; }
    port charger_evidence : DataPort { in :>> type : ChargerEvidence; }
    port control_event : DataPort { in :>> type : ControlEvent; }
    port actuation_feedback : DataPort { in :>> type : ActuationFeedback; }
    port power_command : DataPort { out :>> type : PowerCommand; }
    port availability_report : DataPort { out :>> type : AvailabilityReport; }

    part supervisor_process : PowerPropulsionSupervisorProcess;
    connection support12 : PortConnection connect battery_observation to supervisor_process.battery_observation;
    connection support13 : PortConnection connect power_evidence to supervisor_process.power_evidence;
    connection support14 : PortConnection connect odd_engine_evidence to supervisor_process.odd_engine_evidence;
    connection support15 : PortConnection connect even_engine_evidence to supervisor_process.even_engine_evidence;
    connection support16 : PortConnection connect configuration_evidence to supervisor_process.configuration_evidence;
    connection support17 : PortConnection connect charger_evidence to supervisor_process.charger_evidence;
    connection support18 : PortConnection connect control_event to supervisor_process.control_event;
    connection support19 : PortConnection connect actuation_feedback to supervisor_process.actuation_feedback;
    connection support20 : PortConnection connect supervisor_process.power_command to power_command;
    connection support21 : PortConnection connect supervisor_process.availability_report to availability_report;
  }

  part power_propulsion_availability_supervisor : PowerPropulsionAvailabilitySystem;
}
