package Drone_Battery_Charge_Supervisor {

  private import HAMR::*;

  enum def BatteryIndication {
    enum Low;
    enum Adequate;
  }

  enum def InputStatus {
    enum Valid;
    enum Invalid;
  }

  enum def ChargerAvailability {
    enum Available;
    enum Unavailable;
  }

  enum def FlightActivity {
    enum Inactive;
    enum Active;
  }

  enum def ChargeIntent {
    enum NoIntent;
    enum BeginCharge;
    enum EndCharge;
  }

  enum def ChargeAuthorization {
    enum InhibitCharge;
    enum PermitCharge;
  }

  enum def BatteryAttention {
    enum None;
    enum LowBattery;
    enum InputFault;
    enum RecoveryPending;
  }

  enum def BatteryReadinessEvidence {
    enum BatteryReady;
    enum BatteryNotReady;
    enum EvidenceUnavailable;
  }

  enum def BatteryEvidence {
    enum InvalidBattery;
    enum LowBatteryEvidence;
    enum AdequateBatteryEvidence;
  }

  enum def ChargeContext {
    enum InvalidChargeContext;
    enum FlightActiveContext;
    enum AvailableInactiveContext;
    enum UnavailableInactiveContext;
  }

  enum def QualifiedChargeIntent {
    enum InvalidChargeIntent;
    enum NoIntent;
    enum BeginCharge;
    enum EndCharge;
  }

  enum def ChargeDisposition {
    enum InputFault;
    enum RecoveryPending;
    enum BeginAccepted;
    enum BeginDenied;
    enum Continued;
    enum Inactive;
  }

  enum def RecoveryPhase {
    enum Normal;
    enum AwaitNeutral;
    enum AwaitFreshIntent;
  }

  // GUMBO inspects every record member below, so each is an attribute.
  part def BatterySample :> Data {
    attribute indication : BatteryIndication;
    attribute status : InputStatus;
  }

  part def ChargerSample :> Data {
    attribute availability : ChargerAvailability;
    attribute status : InputStatus;
  }

  part def FlightActivitySample :> Data {
    attribute activity : FlightActivity;
    attribute status : InputStatus;
  }

  part def ChargeIntentSample :> Data {
    attribute intent : ChargeIntent;
    attribute status : InputStatus;
  }

  part def ChargeDecision :> Data {
    attribute authorization : ChargeAuthorization;
    attribute disposition : ChargeDisposition;
  }

  part def Battery_Evidence_Qualification :> Thread {
    port battery_sample : DataPort { in :>> type : BatterySample; }
    port evidence_to_owner : DataPort { out :>> type : BatteryEvidence; }
    port evidence_to_attention : DataPort { out :>> type : BatteryEvidence; }
    port evidence_to_readiness : DataPort { out :>> type : BatteryEvidence; }

                        
                
                         
                                                                                                     
                                                               
                                                                   
                                                                  

             
                     
                                
                                                                                                  
                                                                
                                                                           
                                                                               
                                                                              
                                
                                                                               
                                                               
                                                                      
                                                                               
                                                                                   
                                                                                  
                                
                                                                                              
                                                               
                                                                           
                                                                                    
                                                                                        
                                                                                       
       
  }

  part def Charge_Context_Qualification :> Thread {
    port charger_sample : DataPort { in :>> type : ChargerSample; }
    port flight_sample : DataPort { in :>> type : FlightActivitySample; }
    port charge_context : DataPort { out :>> type : ChargeContext; }

                        
                
                         
                                                                                 
                                                               

             
                     
                               
                                                                                   
                                                                 
                                                               
                                                                           
                               
                                                                                                      
                                                               
                                                              
                                                                   
                                                                          
                               
                                                                                                                       
                                                               
                                                              
                                                                      
                                                                                
                                                                               
                               
                                                                                                                             
                                                               
                                                              
                                                                      
                                                                                  
                                                                                 
       
  }

  part def Charge_Intent_Qualification :> Thread {
    port intent_sample : DataPort { in :>> type : ChargeIntentSample; }
    port qualified_intent : DataPort { out :>> type : QualifiedChargeIntent; }

                        
                
                         
                                                                                     
                                                                        

             
                     
                                  
                                                                                             
                                                               
                                                                                    
                                  
                                                                            
                                                              
                                                                 
                                                                         
                                  
                                                                                
                                                              
                                                                    
                                                                            
                                  
                                                                          
                                                              
                                                                  
                                                                          
       
  }

  part def Charge_Qualification_Owner :> Thread {
    port battery_evidence : DataPort { in :>> type : BatteryEvidence; }
    port charge_context : DataPort { in :>> type : ChargeContext; }
    port qualified_intent : DataPort { in :>> type : QualifiedChargeIntent; }
    port authorization : DataPort { out :>> type : ChargeAuthorization; }
    port decision_to_attention : DataPort { out :>> type : ChargeDecision; }
    port decision_to_readiness : DataPort { out :>> type : ChargeDecision; }

                        
                        
           
                                                
                                     

                
                         
                                                                                                                               
                                                                   
                                                 
                                                              
                                                                                    
                                                                           
                                                                                    
                                                                          

             
                          
                                                                             
                                                      
                                                                         
                           
                                                                                                                          
                                               
                                                                     
                                                                     
                                                                                 

                     
                           
                                                                                                  
                                                                       
                                                                         
                                                                                 
                                                                               
                                                                   
                                                                          
                                                                                                
                                                                                         
                                                                                                
                                                                                        

                           
                                                                                                                      
                                                                       
                                                                         
                                                                                  
                                                                    
                                                                      
                                                                               
                                                                   
                                                                          
                                                                                                
                                                                                              
                                                                                                
                                                                                             

                           
                                                                                                                                      
                                                                       
                                                                         
                                                                       
                                                                   
                                                                               
                                                                       
                                                                          
                                                                                                
                                                                                              
                                                                                                
                                                                                             

                           
                                                                                                                      
                                                                       
                                                                         
                                                                       
                                                                       
                                                                               
                                                                       
                                                                          
                                                                                                
                                                                                              
                                                                                                
                                                                                             

                           
                                                                                              
                                                                       
                                                                         
                                                                        
                                                                       
                                                                               
                                                             
                                                                          
                                                                                                
                                                                                       
                                                                                                
                                                                                      

                           
                                                                                                                 
                                                                           
                                                                             
                                                                          
                                                                       
                                                                              
                                                             
                                                                         
                                                                                               
                                                                                            
                                                                                               
                                                                                           

                           
                                                                                                                        
                                                                       
                                                                         
                                                                          
                                                                        
                                                                                
                                                                                  
                                                                               
                                                             
                                                                          
                                                                                                
                                                                                          
                                                                                                
                                                                                         

                           
                                                                                
                                                                       
                                                                         
                                                                        
                                                             
                                                                               
                                                             
                                                                          
                                                                                                
                                                                                       
                                                                                                
                                                                                      

                           
                                                                                                
                                                                           
                                                                             
                                                                          
                                                             
                                                                              
                                                             
                                                                         
                                                                                               
                                                                                            
                                                                                               
                                                                                           

                           
                                                                                               
                                                                       
                                                                         
                                                                          
                                                              
                                                                                
                                                                                  
                                                                               
                                                             
                                                                          
                                                                                                
                                                                                          
                                                                                                
                                                                                         

                           
                                                                                                 
                                                                           
                                                                             
                                                                       
                                                              
                                                                              
                                                                              
                                                             
                                                                         
                                                                                               
                                                                                        
                                                                                               
                                                                                       

                           
                                                                                                  
                                                                       
                                                                         
                                                                       
                                                              
                                                                                    
                                                                                
                                                                                  
                                                                               
                                                             
                                                                          
                                                                                                
                                                                                       
                                                                                                
                                                                                      
       
  }

  part def Pilot_Attention_Derivation :> Thread {
    port charge_decision : DataPort { in :>> type : ChargeDecision; }
    port battery_evidence : DataPort { in :>> type : BatteryEvidence; }
    port battery_attention : DataPort { out :>> type : BatteryAttention; }

                        
                
                         
                                                                          
                                                     

             
                     
                               
                                                                                        
                                                                               
                                                                       
                               
                                                                                                     
                                                                                    
                                                                            
                               
                                                                                                    
                                                                                
                                                                                     
                                                                          
                                                                       
                               
                                                                                                     
                                                                                
                                                                                     
                                                                          
                                                                 
       
  }

  part def Readiness_Evidence_Derivation :> Thread {
    port charge_decision : DataPort { in :>> type : ChargeDecision; }
    port battery_evidence : DataPort { in :>> type : BatteryEvidence; }
    port readiness_evidence : DataPort { out :>> type : BatteryReadinessEvidence; }

                        
                
                         
                                                                                    
                                                                             

             
                     
                                
                                                                                                
                                                                                
                                                                                    
                                                                                         
                                
                                                                                      
                                                                                
                                                                                     
                                                                          
                                                                                     
                                
                                                                                            
                                                                                
                                                                                     
                                                                               
                                                                                  
       
  }

  part def Charge_Supervision_Process :> Process {
    part battery_evidence_qualification : Battery_Evidence_Qualification;
    part charge_context_qualification : Charge_Context_Qualification;
    part charge_intent_qualification : Charge_Intent_Qualification;
    part charge_qualification_owner : Charge_Qualification_Owner;
    part pilot_attention_derivation : Pilot_Attention_Derivation;
    part readiness_evidence_derivation : Readiness_Evidence_Derivation;

    port battery_sample : DataPort { in :>> type : BatterySample; }
    port charger_sample : DataPort { in :>> type : ChargerSample; }
    port flight_sample : DataPort { in :>> type : FlightActivitySample; }
    port intent_sample : DataPort { in :>> type : ChargeIntentSample; }
    port authorization : DataPort { out :>> type : ChargeAuthorization; }
    port battery_attention : DataPort { out :>> type : BatteryAttention; }
    port readiness_evidence : DataPort { out :>> type : BatteryReadinessEvidence; }

    connection battery_sample_to_qualification : PortConnection
      connect battery_sample to battery_evidence_qualification.battery_sample;
    connection charger_sample_to_context : PortConnection
      connect charger_sample to charge_context_qualification.charger_sample;
    connection flight_sample_to_context : PortConnection
      connect flight_sample to charge_context_qualification.flight_sample;
    connection intent_sample_to_qualification : PortConnection
      connect intent_sample to charge_intent_qualification.intent_sample;

    connection battery_evidence_to_owner : PortConnection
      connect battery_evidence_qualification.evidence_to_owner to charge_qualification_owner.battery_evidence;
    connection charge_context_to_owner : PortConnection
      connect charge_context_qualification.charge_context to charge_qualification_owner.charge_context;
    connection qualified_intent_to_owner : PortConnection
      connect charge_intent_qualification.qualified_intent to charge_qualification_owner.qualified_intent;
    connection decision_to_attention : PortConnection
      connect charge_qualification_owner.decision_to_attention to pilot_attention_derivation.charge_decision;
    connection evidence_to_attention : PortConnection
      connect battery_evidence_qualification.evidence_to_attention to pilot_attention_derivation.battery_evidence;
    connection decision_to_readiness : PortConnection
      connect charge_qualification_owner.decision_to_readiness to readiness_evidence_derivation.charge_decision;
    connection evidence_to_readiness : PortConnection
      connect battery_evidence_qualification.evidence_to_readiness to readiness_evidence_derivation.battery_evidence;

    connection authorization_to_process_boundary : PortConnection
      connect charge_qualification_owner.authorization to authorization;
    connection attention_to_process_boundary : PortConnection
      connect pilot_attention_derivation.battery_attention to battery_attention;
    connection readiness_to_process_boundary : PortConnection
      connect readiness_evidence_derivation.readiness_evidence to readiness_evidence;
  }

  part def Drone_Battery_Charge_Supervisor_System :> System {
    part charge_supervision_process : Charge_Supervision_Process;

    port battery_sample : DataPort { in :>> type : BatterySample; }
    port charger_sample : DataPort { in :>> type : ChargerSample; }
    port flight_sample : DataPort { in :>> type : FlightActivitySample; }
    port intent_sample : DataPort { in :>> type : ChargeIntentSample; }
    port charge_authorization : DataPort { out :>> type : ChargeAuthorization; }
    port battery_attention : DataPort { out :>> type : BatteryAttention; }
    port battery_readiness_evidence : DataPort { out :>> type : BatteryReadinessEvidence; }

    connection boundary_battery_sample : PortConnection
      connect battery_sample to charge_supervision_process.battery_sample;
    connection boundary_charger_sample : PortConnection
      connect charger_sample to charge_supervision_process.charger_sample;
    connection boundary_flight_sample : PortConnection
      connect flight_sample to charge_supervision_process.flight_sample;
    connection boundary_intent_sample : PortConnection
      connect intent_sample to charge_supervision_process.intent_sample;
    connection boundary_authorization : PortConnection
      connect charge_supervision_process.authorization to charge_authorization;
    connection boundary_attention : PortConnection
      connect charge_supervision_process.battery_attention to battery_attention;
    connection boundary_readiness : PortConnection
      connect charge_supervision_process.readiness_evidence to battery_readiness_evidence;
  }

  part drone_battery_charge_supervisor : Drone_Battery_Charge_Supervisor_System;
}
