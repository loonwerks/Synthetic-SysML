package Mining_Threat_Retreat_Supervision {
  private import HAMR::*;

  // Integer encodings are closed finite pilot domains documented by the
  // adjacent exact TYPE/MON declarations. Every field inspected later by
  // GUMBO is deliberately an attribute member of its Data record.

  part def IntentValue :> Data {
    attribute intent_code : Base_Types::Integer_32;
                                   
                      
                                                                                                                          
  }
  part def ThreatSampleValue :> Data {
    attribute sample_code : Base_Types::Integer_32;
                                   
                      
                                                                                                                                         
  }
  part def CargoBandValue :> Data {
    attribute cargo_code : Base_Types::Integer_32;
                                   
                      
                                                                                                                          
  }
  part def CapacitorBandValue :> Data {
    attribute capacitor_code : Base_Types::Integer_32;
                                   
                      
                                                                                                                      
  }
  part def LocationValue :> Data {
    attribute location_code : Base_Types::Integer_32;
                                   
                      
                                                                                                                
  }
  part def MiningAvailabilityValue :> Data {
    attribute available : Base_Types::Boolean;
  }
  part def DefenseAvailabilityValue :> Data {
    attribute available : Base_Types::Boolean;
  }
  part def RetreatAvailabilityValue :> Data {
    attribute available : Base_Types::Boolean;
  }
  part def DestinationAvailabilityValue :> Data {
    attribute available : Base_Types::Boolean;
  }
  part def ServiceAvailabilityValue :> Data {
    attribute available : Base_Types::Boolean;
  }
  part def ActionOutcomeValue :> Data {
    attribute outcome_code : Base_Types::Integer_32;
                                   
                      
                                                                                                                             
  }

  part def ThreatDispositionValue :> Data {
    attribute disposition_code : Base_Types::Integer_32;
                                   
                       
                                                                                                                                               
  }
  part def ThreatValidityValue :> Data {
    attribute validity_code : Base_Types::Integer_32;
                                   
                       
                                                                                                                          
  }
  part def ReadinessAssessmentValue :> Data {
    attribute mining_ready : Base_Types::Boolean;
    attribute defense_ready : Base_Types::Boolean;
    attribute retreat_feasible : Base_Types::Boolean;
    attribute cargo_full : Base_Types::Boolean;
    attribute dock_service_applicable : Base_Types::Boolean;
  }
  part def RecoveryStateValue :> Data {
    attribute state_code : Base_Types::Integer_32;
                                   
                       
                                                                                                                           
  }
  part def RecoveryGateValue :> Data {
    attribute gate_code : Base_Types::Integer_32;
                                   
                       
                                                                                                        
  }
  part def EmergencyStateValue :> Data {
    attribute emergency_code : Base_Types::Integer_32;
                                   
                       
                                                                                                                             
  }
  part def ProposalValue :> Data {
    attribute proposal_code : Base_Types::Integer_32;
                                   
                       
                                                                                                                   
  }
  part def MobilityProposalValue :> Data {
    attribute proposal_code : Base_Types::Integer_32;
                                   
                       
                                                                                                                                     
  }
  part def ActionValue :> Data {
    attribute action_code : Base_Types::Integer_32;
                                   
                       
                                                                                                                          
  }
  part def SelectedCauseValue :> Data {
    attribute cause_code : Base_Types::Integer_32;
                                   
                       
                                                                                                                               
  }
  part def PublicResultValue :> Data {
    attribute selected_action : Base_Types::Integer_32;
    attribute selected_cause : Base_Types::Integer_32;
    attribute mode : Base_Types::Integer_32;
    attribute recovery_state : Base_Types::Integer_32;
                                   
                       
                                                                                                      
                                                                 
                                                               
                                           
                                                                  
  }

  part def Threat_Observation :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port threat_sample : DataPort { out :>> type : ThreatSampleValue; }
  }

  part def Intent_Acquisition :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port intent_recovery : DataPort { out :>> type : IntentValue; }
    port intent_mining : DataPort { out :>> type : IntentValue; }
    port intent_defense : DataPort { out :>> type : IntentValue; }
    port intent_mobility : DataPort { out :>> type : IntentValue; }
  }

  part def Resource_Observation :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port cargo_band : DataPort { out :>> type : CargoBandValue; }
    port capacitor_band : DataPort { out :>> type : CapacitorBandValue; }
    port location : DataPort { out :>> type : LocationValue; }
  }

  part def Availability_Observation :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port mining_available : DataPort { out :>> type : MiningAvailabilityValue; }
    port defense_available : DataPort { out :>> type : DefenseAvailabilityValue; }
    port retreat_available : DataPort { out :>> type : RetreatAvailabilityValue; }
    port destination_available : DataPort { out :>> type : DestinationAvailabilityValue; }
    port service_available : DataPort { out :>> type : ServiceAvailabilityValue; }
  }

  part def Outcome_Observation :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port action_outcome : DataPort { out :>> type : ActionOutcomeValue; }
  }

  part def Threat_Qualification :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port threat_sample : DataPort { in :>> type : ThreatSampleValue; }
    port threat_validity : DataPort { out :>> type : ThreatValidityValue; }
    port disposition_mining : DataPort { out :>> type : ThreatDispositionValue; }
    port disposition_defense : DataPort { out :>> type : ThreatDispositionValue; }
    port disposition_mobility : DataPort { out :>> type : ThreatDispositionValue; }
                        
             
                         
                                                                                                     
                                                                                                 

                   
                         
                                                                             
                                                      
                                                                    
                                                     
                         
                                                                     
                                                      
                                                                    
                                                     
                         
                                                                           
                                                      
                                                                    
                                                     
                         
                                                                           
                                                      
                                                                    
                                                     
       
  }

  part def Readiness_Assessment :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port cargo_band : DataPort { in :>> type : CargoBandValue; }
    port capacitor_band : DataPort { in :>> type : CapacitorBandValue; }
    port location : DataPort { in :>> type : LocationValue; }
    port mining_available : DataPort { in :>> type : MiningAvailabilityValue; }
    port defense_available : DataPort { in :>> type : DefenseAvailabilityValue; }
    port retreat_available : DataPort { in :>> type : RetreatAvailabilityValue; }
    port destination_available : DataPort { in :>> type : DestinationAvailabilityValue; }
    port service_available : DataPort { in :>> type : ServiceAvailabilityValue; }
    port assessment_mining : DataPort { out :>> type : ReadinessAssessmentValue; }
    port assessment_defense : DataPort { out :>> type : ReadinessAssessmentValue; }
    port assessment_mobility : DataPort { out :>> type : ReadinessAssessmentValue; }
                        
             
                         
                                                                                                                           
                                           
                                                                                   
                                                                                     
                                            
                                                                                           
                                           
                                               
                                                                                                                 
                                                                              
                                                      
                                                                              
                                                                                            
                         
                                                                                                 
                                                                                             
       
  }

  part def Recovery_Control :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port intent : DataPort { in :>> type : IntentValue; }
    port action_outcome : DataPort { in :>> type : ActionOutcomeValue; }
    port threat_validity : DataPort { in :>> type : ThreatValidityValue; }
    port gate_mining : DataPort { out :>> type : RecoveryGateValue; }
    port gate_defense : DataPort { out :>> type : RecoveryGateValue; }
    port gate_mobility : DataPort { out :>> type : RecoveryGateValue; }
    port emergency_state : DataPort { out :>> type : EmergencyStateValue; }
    port next_recovery_state : DataPort { out :>> type : RecoveryStateValue; }
                        
           
                          
                                                 

                
                           
                                                                                                                   
                                                                                  
                                                                                                         
                                                    

             
                         
                                                                                                          
                                                            
                        
                                                                                                                            
                                                                                               
                                                                                               
                                                                                                        
                                                                                                       
                         
                                                                                                    
                                                                     

                   
                         
                                                                                           
                                                                                                   
                                                              
                         
                                                                             
                                                                                                    
                                       
                                                              
                         
                                                                                              
                                                                                                    
                                                                       
                                                              
                         
                                                                                                
                                                                                                    
                                                                        
                                                   
                                                              
                         
                                                                                                        
                                                                                                    
                                                                           
                                          
                                                                                             
                                                                      
       
  }

  part def Mining_Eligibility :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port intent : DataPort { in :>> type : IntentValue; }
    port threat_disposition : DataPort { in :>> type : ThreatDispositionValue; }
    port assessment : DataPort { in :>> type : ReadinessAssessmentValue; }
    port recovery_gate : DataPort { in :>> type : RecoveryGateValue; }
    port mining_proposal : DataPort { out :>> type : ProposalValue; }
                        
             
                   
                         
                                                                                                    
                                                                                     
                                                                                     
                                                             
                         
                                                                                  
                                                                                          
                                                                                      
                                                             
       
  }

  part def Defense_Eligibility :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port intent : DataPort { in :>> type : IntentValue; }
    port threat_disposition : DataPort { in :>> type : ThreatDispositionValue; }
    port assessment : DataPort { in :>> type : ReadinessAssessmentValue; }
    port recovery_gate : DataPort { in :>> type : RecoveryGateValue; }
    port defense_proposal : DataPort { out :>> type : ProposalValue; }
                        
             
                   
                         
                                                                                                                
                                                                                
                                                             
                                                             
                                                                                               
                                                              
                         
                                                                                    
                                                                                     
                                                             
                                                             
                                                                                                
                                                              
       
  }

  part def Mobility_Service_Eligibility :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port intent : DataPort { in :>> type : IntentValue; }
    port threat_disposition : DataPort { in :>> type : ThreatDispositionValue; }
    port assessment : DataPort { in :>> type : ReadinessAssessmentValue; }
    port recovery_gate : DataPort { in :>> type : RecoveryGateValue; }
    port mobility_proposal : DataPort { out :>> type : MobilityProposalValue; }
                        
             
                   
                         
                                                                                                               
                                                                                   
                                                                                     
                                            
                                                               
                         
                                                                                                   
                                                                                        
                                                                                     
                                                                                   
                                               
                                                               
                         
                                                                                                
                                                                                        
                                                                                     
                                              
                                                                                          
                                                               
       
  }

  part def Priority_Arbitration :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port emergency_state : DataPort { in :>> type : EmergencyStateValue; }
    port mining_proposal : DataPort { in :>> type : ProposalValue; }
    port defense_proposal : DataPort { in :>> type : ProposalValue; }
    port mobility_proposal : DataPort { in :>> type : MobilityProposalValue; }
    port selected_action : DataPort { out :>> type : ActionValue; }
    port selected_cause : DataPort { out :>> type : SelectedCauseValue; }
                        
             
                   
                         
                                                                    
                                                           
                                                                                                  
                         
                                                                         
                                                                                                        
                                                                                                  
                         
                                                                       
                                                                                                         
                                                      
                                                                                                  
                         
                                                                                   
                                                                                                         
                                                      
                                                                                                  
                         
                                                                                           
                                                                                                         
                                                                                                 
                                                                                                  
                         
                                                                                
                                                                                                         
                                                                                                 
                                                                                                  
       
  }

  part def Mission_Mode_And_Public_Result :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port selected_action : DataPort { in :>> type : ActionValue; }
    port selected_cause : DataPort { in :>> type : SelectedCauseValue; }
    port next_recovery_state : DataPort { in :>> type : RecoveryStateValue; }
    port public_result : DataPort { out :>> type : PublicResultValue; }
                        
                
                           
                                                                                                         
                                                                                              
                                                                                  

             
                        
                                                                                                                                           
                                                                        
                                                                     
                                                                         

                   
                         
                                                                                           
                                                           
                                                  
                         
                                                                
                                                                                                    
                                                  
                         
                                                                      
                                                                                                    
                                                  
                         
                                                                             
                                                                                                    
                                                  
                         
                                                                               
                                                                                                    
                                                  
                         
                                                                             
                                                                                                    
                                                  
       
  }

  part def Supervisor_Process :> Process {
    port public_result : DataPort { out :>> type : PublicResultValue; }

    part threat_observation : Threat_Observation;
    part intent_acquisition : Intent_Acquisition;
    part resource_observation : Resource_Observation;
    part availability_observation : Availability_Observation;
    part outcome_observation : Outcome_Observation;
    part threat_qualification : Threat_Qualification;
    part readiness_assessment : Readiness_Assessment;
    part recovery_control : Recovery_Control;
    part mining_eligibility : Mining_Eligibility;
    part defense_eligibility : Defense_Eligibility;
    part mobility_service_eligibility : Mobility_Service_Eligibility;
    part priority_arbitration : Priority_Arbitration;
    part mission_mode_and_public_result : Mission_Mode_And_Public_Result;

    connection int_01 : PortConnection connect threat_observation.threat_sample to threat_qualification.threat_sample;
    connection int_02 : PortConnection connect intent_acquisition.intent_recovery to recovery_control.intent;
    connection int_03 : PortConnection connect intent_acquisition.intent_mining to mining_eligibility.intent;
    connection int_04 : PortConnection connect intent_acquisition.intent_defense to defense_eligibility.intent;
    connection int_05 : PortConnection connect intent_acquisition.intent_mobility to mobility_service_eligibility.intent;
    connection int_06 : PortConnection connect resource_observation.cargo_band to readiness_assessment.cargo_band;
    connection int_07 : PortConnection connect resource_observation.capacitor_band to readiness_assessment.capacitor_band;
    connection int_08 : PortConnection connect resource_observation.location to readiness_assessment.location;
    connection int_09 : PortConnection connect availability_observation.mining_available to readiness_assessment.mining_available;
    connection int_10 : PortConnection connect availability_observation.defense_available to readiness_assessment.defense_available;
    connection int_11 : PortConnection connect availability_observation.retreat_available to readiness_assessment.retreat_available;
    connection int_12 : PortConnection connect availability_observation.destination_available to readiness_assessment.destination_available;
    connection int_13 : PortConnection connect availability_observation.service_available to readiness_assessment.service_available;
    connection int_14 : PortConnection connect outcome_observation.action_outcome to recovery_control.action_outcome;
    connection int_15 : PortConnection connect threat_qualification.threat_validity to recovery_control.threat_validity;
    connection int_16 : PortConnection connect threat_qualification.disposition_mining to mining_eligibility.threat_disposition;
    connection int_17 : PortConnection connect threat_qualification.disposition_defense to defense_eligibility.threat_disposition;
    connection int_18 : PortConnection connect threat_qualification.disposition_mobility to mobility_service_eligibility.threat_disposition;
    connection int_19 : PortConnection connect readiness_assessment.assessment_mining to mining_eligibility.assessment;
    connection int_20 : PortConnection connect readiness_assessment.assessment_defense to defense_eligibility.assessment;
    connection int_21 : PortConnection connect readiness_assessment.assessment_mobility to mobility_service_eligibility.assessment;
    connection int_22 : PortConnection connect recovery_control.gate_mining to mining_eligibility.recovery_gate;
    connection int_23 : PortConnection connect recovery_control.gate_defense to defense_eligibility.recovery_gate;
    connection int_24 : PortConnection connect recovery_control.gate_mobility to mobility_service_eligibility.recovery_gate;
    connection int_25 : PortConnection connect recovery_control.emergency_state to priority_arbitration.emergency_state;
    connection int_26 : PortConnection connect mining_eligibility.mining_proposal to priority_arbitration.mining_proposal;
    connection int_27 : PortConnection connect defense_eligibility.defense_proposal to priority_arbitration.defense_proposal;
    connection int_28 : PortConnection connect mobility_service_eligibility.mobility_proposal to priority_arbitration.mobility_proposal;
    connection int_29 : PortConnection connect priority_arbitration.selected_action to mission_mode_and_public_result.selected_action;
    connection int_30 : PortConnection connect priority_arbitration.selected_cause to mission_mode_and_public_result.selected_cause;
    connection int_31 : PortConnection connect recovery_control.next_recovery_state to mission_mode_and_public_result.next_recovery_state;

    connection support_public_result : PortConnection connect mission_mode_and_public_result.public_result to public_result;
  }

  part def Mining_Threat_Retreat_Supervision_Root :> System {
    port public_result : DataPort { out :>> type : PublicResultValue; }
    part supervisor_process : Supervisor_Process;
    connection boundary_public_result : PortConnection connect supervisor_process.public_result to public_result;
  }

  part mining_threat_retreat_supervision : Mining_Threat_Retreat_Supervision_Root;
}
