package Mining_Threat_Retreat_Supervisor {
  private import HAMR::*;

  // Numeric payload fields use these closed-domain legends. The final-stage
  // contracts bind every code to the approved finite policy.
  enum def Phase { enum Docked; enum Mining; enum Defending; enum Retreating; enum Recovery; }
  enum def Threat_Valid_Streak { enum Streak_0; enum Streak_1; enum Streak_2; }
  enum def Threat_Band { enum Clear; enum Caution; enum Hostile; enum Severe; }
  enum def Cargo_Band { enum Empty; enum Partial; enum NearlyFull; enum Full; }
  enum def Capacitor_Band { enum High; enum Adequate; enum Low; enum Critical; }
  enum def Target_State { enum Available; enum Depleted; }
  enum def Availability_State { enum Available; enum Unavailable; }
  enum def Pilot_Intent { enum Mine; enum Hold; enum Return; }
  enum def Arrival_State { enum EnRoute; enum SafeAtStation; }
  enum def Resupply_State { enum Incomplete; enum Complete; }
  enum def Validity { enum Valid; enum Invalid; }
  enum def Operation_Command { enum StayDocked; enum Depart; enum Mine; enum HoldAtSite; enum Defend; enum Retreat; enum Recover; }
  enum def Laser_Command { enum Enabled; enum Disabled; }
  enum def Drone_Assignment { enum Stowed; enum Mining; enum Defense; }
  enum def Cargo_Advisory { enum Normal; enum NearlyFull; enum Full; enum Unknown; }
  enum def Capacitor_Advisory { enum Normal; enum Low; enum Critical; enum Unknown; }
  enum def Retreat_Advisory { enum Ready; enum Unavailable; enum Unknown; }
  enum def Fault_Status { enum Clear; enum Asserted; }
  enum def Decision_Reason {
    enum C01; enum C02; enum C03; enum C04; enum C05; enum C06; enum C07; enum C08; enum C09; enum C10;
    enum C11; enum C12; enum C13; enum C14; enum C15; enum C16; enum C17; enum C18; enum C19; enum C20;
  }

  // Code legend: phase 0..4, streak 0..2, raw threat/cargo/capacitor 0..3,
  // validity 0=Valid/1=Invalid, binary observations 0..1, intent 0..2,
  // qualified threat 0=Untrusted/1=Clear/2=Caution/3=Hostile/4=Severe,
  // command 0..6, reason/proposal 0=None or 1..20.

  part def Raw_Threat_Observation :> Data {
    part threat : Base_Types::Integer_32;
    part threat_validity : Base_Types::Integer_32;
                        
                
                        
                                                                                         
                                                 
                                                                  
       
  }

  part def Raw_Resource_Observation :> Data {
    part cargo : Base_Types::Integer_32;
    part cargo_validity : Base_Types::Integer_32;
    part capacitor : Base_Types::Integer_32;
    part capacitor_validity : Base_Types::Integer_32;
    part target : Base_Types::Integer_32;
    part target_validity : Base_Types::Integer_32;
    part mining_availability : Base_Types::Integer_32;
    part defense_availability : Base_Types::Integer_32;
    part retreat_availability : Base_Types::Integer_32;
    part availability_validity : Base_Types::Integer_32;
                        
                
                        
                                                                                              
                                                                                                       
                                                                                                                       
                                                                                                           
                                                                           
                                                                             
                                                                             
                                                                              
       
  }

  part def Raw_Mission_Observation :> Data {
    part pilot_intent : Base_Types::Integer_32;
    part intent_validity : Base_Types::Integer_32;
    part arrival : Base_Types::Integer_32;
    part arrival_validity : Base_Types::Integer_32;
    part resupply : Base_Types::Integer_32;
    part resupply_validity : Base_Types::Integer_32;
                        
                
                        
                                                                                             
                                                                                                                       
                                                                                                               
                                                                                                                  
       
  }

  part def Threat_State_Input :> Data {
    part current_valid_streak : Base_Types::Integer_32;
                        
                
                        
                                                                                     
                                                                            
       
  }

  part def Phase_State_Input :> Data {
    part current_phase : Base_Types::Integer_32;
                        
                
                        
                                                                            
                                                              
       
  }

  part def Phase_Context :> Data {
    part current_phase : Base_Types::Integer_32;
                        
                
                        
                                                                                           
                                                              
       
  }

  part def Qualified_Threat :> Data {
    part qualified_threat : Base_Types::Integer_32;
    attribute untrusted : Base_Types::Boolean;
    attribute acceptable : Base_Types::Boolean;
    attribute hostile : Base_Types::Boolean;
    attribute severe : Base_Types::Boolean;
                        
                
                        
                                                                                                      
                                                                    
       
  }

  part def Threat_Publication_Facts :> Data {
    part qualified_threat : Base_Types::Integer_32;
    part next_valid_streak : Base_Types::Integer_32;
                        
                
                        
                                                                                  
                                                                     
                                                                      
       
  }

  part def Threat_Invalidity :> Data {
    attribute threat_invalid : Base_Types::Boolean;
  }

  part def Mining_Recovery_Facts :> Data {
    attribute mine_ready : Base_Types::Boolean;
    attribute resource_reset : Base_Types::Boolean;
    attribute cargo_or_capacitor_retreat : Base_Types::Boolean;
    attribute target_or_mining_block : Base_Types::Boolean;
  }

  part def Defense_Facts :> Data {
    attribute defense_ready : Base_Types::Boolean;
  }

  part def Resource_Publication_Facts :> Data {
    part cargo_advisory : Base_Types::Integer_32;
    part capacitor_advisory : Base_Types::Integer_32;
    part retreat_advisory : Base_Types::Integer_32;
                        
                
                         
                                                                                                      
                                                                 
                                                                         
                                                                    
       
  }

  part def Resource_Invalidity :> Data {
    attribute resource_invalid : Base_Types::Boolean;
  }

  part def Mission_Facts :> Data {
    attribute valid_mine : Base_Types::Boolean;
    attribute invalid_or_return : Base_Types::Boolean;
    attribute valid_hold_or_return : Base_Types::Boolean;
    attribute valid_complete_resupply : Base_Types::Boolean;
    attribute intent_invalid : Base_Types::Boolean;
  }

  part def Arrival_Fact :> Data {
    attribute valid_safe_at_station : Base_Types::Boolean;
  }

  part def Mission_Invalidity_Facts :> Data {
    attribute intent_invalid : Base_Types::Boolean;
    attribute arrival_invalid : Base_Types::Boolean;
    attribute resupply_invalid : Base_Types::Boolean;
  }

  part def Mission_Proposal :> Data {
    part proposed_reason : Base_Types::Integer_32;
                        
                
                         
                                                                                        
                                                                   
       
  }

  part def Response_Proposal :> Data {
    part proposed_reason : Base_Types::Integer_32;
                        
                
                         
                                                                                          
                                                                   
       
  }

  part def Fault_Fact :> Data {
    part fault : Base_Types::Integer_32;
                        
                
                          
                                                             
                                              
       
  }

  part def Atomic_Supervisor_Result :> Data {
    part command : Base_Types::Integer_32;
    part current_phase : Base_Types::Integer_32;
    part next_phase : Base_Types::Integer_32;
    part reason : Base_Types::Integer_32;
    part fault : Base_Types::Integer_32;
    part next_valid_streak : Base_Types::Integer_32;
    part cargo_advisory : Base_Types::Integer_32;
    part capacitor_advisory : Base_Types::Integer_32;
    part retreat_advisory : Base_Types::Integer_32;
                        
                
                         
                                                                                                       
                                                   
                                                               
                                                         
                                                  
                                               
                                                                       
                                                                 
                                                                         
                                                                    
       
  }

  part def Published_Supervisor_Result :> Data {
    part command : Base_Types::Integer_32;
    part current_phase : Base_Types::Integer_32;
    part next_phase : Base_Types::Integer_32;
    part reason : Base_Types::Integer_32;
    part fault : Base_Types::Integer_32;
    part next_valid_streak : Base_Types::Integer_32;
    part cargo_advisory : Base_Types::Integer_32;
    part capacitor_advisory : Base_Types::Integer_32;
    part retreat_advisory : Base_Types::Integer_32;
    part laser : Base_Types::Integer_32;
    part drones : Base_Types::Integer_32;
                        
                
                         
                                                                                                  
                                                   
                                                               
                                                         
                                                  
                                               
                                                                       
                                                                 
                                                                         
                                                                     
                                               
                                                
       
  }

  part def Fault_Assessment :> Thread {
    port mission_invalidity : DataPort { in :>> type : Mission_Invalidity_Facts; }
    port threat_invalidity : DataPort { in :>> type : Threat_Invalidity; }
    port resource_invalidity : DataPort { in :>> type : Resource_Invalidity; }
    port phase_context : DataPort { in :>> type : Phase_Context; }
    port fault : DataPort { out :>> type : Fault_Fact; }
                        
                
                          
                                                                                               
                                 
             
                          
                                                                                                                          
                                      
                                               
                                                   
                                                
                                                                                            
                                                                                                 
                                                       
                                      
                                                   
                                                       
                                                    
                                                                                                
                                                                                                     
                                                          
       
  }

  part def Threat_Qualification :> Thread {
    port raw_threat : DataPort { in :>> type : Raw_Threat_Observation; }
    port streak_state : DataPort { in :>> type : Threat_State_Input; }
    port qualified_threat : DataPort { out :>> type : Qualified_Threat; }
    port threat_publication : DataPort { out :>> type : Threat_Publication_Facts; }
    port threat_invalidity : DataPort { out :>> type : Threat_Invalidity; }
                        
           
                              
                                                   
                
                          
                                                                                   
                                                                                          
             
                        
                                                                                                           
                                                      
                                                                 
                                                               
                                                                                                     
                                                                 
                                                               
                                                                                                     
                                                                 
                                                                                   
                                                                                                     
                                                                 
                                                                                  
                        
                                                                                                            
                                                                                          
                                         
                                                                                                            
                                                                                        
                                                                                      
                        
                                                                                                                             
                                                                                    
                                                                     
                        
                                                                            
                                                                                        
       
  }

  part def Resource_Qualification :> Thread {
    port raw_resources : DataPort { in :>> type : Raw_Resource_Observation; }
    port mining_recovery_facts : DataPort { out :>> type : Mining_Recovery_Facts; }
    port defense_facts : DataPort { out :>> type : Defense_Facts; }
    port resource_publication : DataPort { out :>> type : Resource_Publication_Facts; }
    port resource_invalidity : DataPort { out :>> type : Resource_Invalidity; }
                        
                
                         
                                                                                               
                                                          
                                                              
                                                           
             
                        
                                                                                                                      
                                              
                                                                                       
                                                          
                                                                                        
                                                                                         
                                                                                                              
                                                  
                                                                                       
                                                          
                                                                                         
                        
                                                                                                         
                                         
                                                          
                                                                                        
                                                                                                              
                         
                                                                                                       
                                                              
                                                                                       
                                                                                               
                                                  
                         
                                                                                                      
                                                          
                                                                                         
                                                                                                             
                         
                                                                                            
                                                                                                          
                                                                                         
                                                                 
                                                                                         
                                                                 
                                                         
                                                                                  
                                                                 
                                                                                                                  
                                                                                                 
                                                                     
                                                                                                 
                                                                     
                                                             
                                                                                          
                                                                     
                                                                                                                   
                                                                                                               
                                                                   
                                                                                                               
                                                                  
                        
                                                                                                            
                                                  
                                                      
                                                          
                                                       
                                                              
       
  }

  part def Personnel_Mission_Qualification :> Thread {
    port raw_mission : DataPort { in :>> type : Raw_Mission_Observation; }
    port mission_facts : DataPort { out :>> type : Mission_Facts; }
    port arrival_fact : DataPort { out :>> type : Arrival_Fact; }
    port mission_invalidity : DataPort { out :>> type : Mission_Invalidity_Facts; }
                        
                
                        
                                                                                                        
                                        
                                                     
                                                 
             
                        
                                                                                              
                                      
                                                                                             
                                             
                                                                                             
                                                
                                                     
                                                                                            
                                                                                     
                        
                                                                                                                   
                                                
                                                                                         
                                                   
                                                                                          
                        
                                                                                                                        
                                                                                           
                                                                                             
                                                                                              
       
  }

  part def Mission_Recovery_Decision :> Thread {
    port phase_context : DataPort { in :>> type : Phase_Context; }
    port threat_fact : DataPort { in :>> type : Qualified_Threat; }
    port resource_facts : DataPort { in :>> type : Mining_Recovery_Facts; }
    port mission_facts : DataPort { in :>> type : Mission_Facts; }
    port mission_proposal : DataPort { out :>> type : Mission_Proposal; }
                        
                
                         
                                                                                 
                                                      
             
                                   
                                                                                                                                  
                                                        
                                                                                                    
                                                                                 
                                                              
                                                        
                                                                                                         
                                                                                       
                                                              
                                                                                         
                                                              
                                                                                              
                                                          
                                                              
                                                                                              
                                                                                                      
                                                              
                                                                                              
                                                                                                           
                                                   
                                                               
                                                                                              
                                                                                                           
                                                       
                                                               
                                                                                 
                                                                     
                                                               
                                                        
                                                                                                    
                                                              
                                                                                                      
                                                        
                                                                            
                                                                                              
                                                               
                                                                                 
                                                                                  
                                                                                 
                                                               
                                                                                 
                                                                                  
                                                                                      
                                                   
                                                              
       
  }

  part def Threat_Retreat_Decision :> Thread {
    port phase_context : DataPort { in :>> type : Phase_Context; }
    port threat_fact : DataPort { in :>> type : Qualified_Threat; }
    port defense_facts : DataPort { in :>> type : Defense_Facts; }
    port arrival_fact : DataPort { in :>> type : Arrival_Fact; }
    port response_proposal : DataPort { out :>> type : Response_Proposal; }
                        
                
                         
                                                                                 
                                                       
             
                                   
                                                                                                                            
                                                                                                       
                                                                               
                                                               
                                                                                                        
                                                               
                                                                                                             
                                                                  
                                                               
                                                                                                             
                                                                      
                                                               
                                                                                                             
                                        
                                                               
                                                        
                                                                                               
                                                                
                                                                                                             
                                                                  
                                                                
                                                                                                             
                                                                      
                                                                
                                                                                            
                                                                
                                                                                                
                                                                
                                                                                                      
       
  }

  part def Priority_Phase_Arbitration :> Thread {
    port phase_state : DataPort { in :>> type : Phase_State_Input; }
    port mission_candidate : DataPort { in :>> type : Mission_Proposal; }
    port response_candidate : DataPort { in :>> type : Response_Proposal; }
    port threat_publication : DataPort { in :>> type : Threat_Publication_Facts; }
    port resource_publication : DataPort { in :>> type : Resource_Publication_Facts; }
    port fault : DataPort { in :>> type : Fault_Fact; }
    port phase_context : DataPort { out :>> type : Phase_Context; }
    port resolved_atomic_result : DataPort { out :>> type : Atomic_Supervisor_Result; }
                        
           
                              
                                            
                
                          
                                                                                                                     
                                  
                                                  
                                                     
                                                           
                                                        
                                                    
                                                   
                                                               
                                                            
                                                                
                                                             
             
                              
                                                                                                                        
                                                                    
                                                                             
                                                           
                        
                                                                                                                          
                                                       
                                                                                            
                                                                                        
                                                                                                
                                                                                           

                   
                         
                                                           
                                                                                                     
                                                                                                              
                                                     
                         
                                                                  
                                                                                                     
                                                                                                              
                                                     
                         
                                                                      
                                                                                                      
                                                                                                              
                                                     
                         
                                                                   
                                                                                                      
                                                                                                              
                                                     
                         
                                                                                                            
                                                                                                      
                                                                                                              
                                                     
                         
                                                                                       
                                                                                                      
                                                                                                              
                                                     
                         
                                                                                               
                                                                                                       
                                                         
                                                                                                              
                                                     
                         
                                                                                                
                                                                                                       
                                                         
                                                                                                              
                                                     
                         
                                                                                             
                                                                                                       
                                                         
                                                                                                              
                                                     
                         
                                                                                          
                                                                                                       
                                                          
                                                                                                              
                                                      
                         
                                                                         
                                                                                                       
                                                          
                                                                                                              
                                                      
                         
                                                                
                                                                                                       
                                                                                                              
                                                      
                         
                                                                       
                                                                                                       
                                                                                                              
                                                      
                         
                                                                     
                                                                                                        
                                                          
                                                                                                              
                                                      
                         
                                                                                                
                                                                                                        
                                                                
                                                                                                              
                                                      
                         
                                                                                         
                                                                                                       
                                                                                                              
                                                      
                         
                                                                           
                                                                                                       
                                                                                                              
                                                      
                         
                                                                          
                                                                                                      
                                                                                                              
                                                      
                         
                                                        
                                                                                                      
                                                                                                              
                                                      
                         
                                                                      
                                                                                                      
                                                                                                              
                                                      
       
  }

  part def Atomic_Publication :> Thread {
    port atomic_result : DataPort { in :>> type : Atomic_Supervisor_Result; }
    port publication : DataPort { out :>> type : Published_Supervisor_Result; }
                        
                
                        
                                                                                 
                                                                       
             
                        
                                                                                                       
                                                        
                                                                    
                                                              
                                                      
                                                    
                                                                            
                                                                      
                                                                              
                                                                         
                        
                                                                                                         
                                                 
                                                                               
                                                 
                                                                               
                                                                                                
                                                                              
       
  }

  part def Supervisor_Process :> Process {
    port raw_threat : DataPort { in :>> type : Raw_Threat_Observation; }
    port raw_resources : DataPort { in :>> type : Raw_Resource_Observation; }
    port raw_mission : DataPort { in :>> type : Raw_Mission_Observation; }
    port threat_state : DataPort { in :>> type : Threat_State_Input; }
    port phase_state : DataPort { in :>> type : Phase_State_Input; }
    port publication : DataPort { out :>> type : Published_Supervisor_Result; }

    part fa : Fault_Assessment;
    part tq : Threat_Qualification;
    part rq : Resource_Qualification;
    part pq : Personnel_Mission_Qualification;
    part mr : Mission_Recovery_Decision;
    part tr : Threat_Retreat_Decision;
    part arb : Priority_Phase_Arbitration;
    part ap : Atomic_Publication;

    connection support_raw_threat : PortConnection connect raw_threat to tq.raw_threat;
    connection support_raw_resources : PortConnection connect raw_resources to rq.raw_resources;
    connection support_raw_mission : PortConnection connect raw_mission to pq.raw_mission;
    connection support_threat_state : PortConnection connect threat_state to tq.streak_state;
    connection support_phase_state : PortConnection connect phase_state to arb.phase_state;

    connection int_01 : PortConnection connect arb.phase_context to mr.phase_context;
    connection int_02 : PortConnection connect arb.phase_context to tr.phase_context;
    connection int_03 : PortConnection connect tq.qualified_threat to mr.threat_fact;
    connection int_04 : PortConnection connect tq.qualified_threat to tr.threat_fact;
    connection int_05 : PortConnection connect rq.mining_recovery_facts to mr.resource_facts;
    connection int_06 : PortConnection connect rq.defense_facts to tr.defense_facts;
    connection int_07 : PortConnection connect pq.mission_facts to mr.mission_facts;
    connection int_08 : PortConnection connect pq.arrival_fact to tr.arrival_fact;
    connection int_09 : PortConnection connect mr.mission_proposal to arb.mission_candidate;
    connection int_10 : PortConnection connect tr.response_proposal to arb.response_candidate;
    connection int_11 : PortConnection connect tq.threat_publication to arb.threat_publication;
    connection int_12 : PortConnection connect rq.resource_publication to arb.resource_publication;
    connection int_13 : PortConnection connect pq.mission_invalidity to fa.mission_invalidity;
    connection int_14 : PortConnection connect tq.threat_invalidity to fa.threat_invalidity;
    connection int_15 : PortConnection connect rq.resource_invalidity to fa.resource_invalidity;
    connection int_16 : PortConnection connect arb.phase_context to fa.phase_context;
    connection int_17 : PortConnection connect fa.fault to arb.fault;
    connection int_18 : PortConnection connect arb.resolved_atomic_result to ap.atomic_result;

    connection support_publication : PortConnection connect ap.publication to publication;
  }

  part def Mining_Threat_Retreat_Supervisor_Root :> System {
    port raw_threat : DataPort { in :>> type : Raw_Threat_Observation; }
    port raw_resources : DataPort { in :>> type : Raw_Resource_Observation; }
    port raw_mission : DataPort { in :>> type : Raw_Mission_Observation; }
    port threat_state : DataPort { in :>> type : Threat_State_Input; }
    port phase_state : DataPort { in :>> type : Phase_State_Input; }
    port publication : DataPort { out :>> type : Published_Supervisor_Result; }

    part supervisor : Supervisor_Process;

    connection boundary_raw_threat : PortConnection connect raw_threat to supervisor.raw_threat;
    connection boundary_raw_resources : PortConnection connect raw_resources to supervisor.raw_resources;
    connection boundary_raw_mission : PortConnection connect raw_mission to supervisor.raw_mission;
    connection boundary_threat_state : PortConnection connect threat_state to supervisor.threat_state;
    connection boundary_phase_state : PortConnection connect phase_state to supervisor.phase_state;
    connection boundary_publication : PortConnection connect supervisor.publication to publication;
  }

  part mining_threat_retreat_supervisor : Mining_Threat_Retreat_Supervisor_Root;
}
