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

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_BATTERY_EVIDENCE:
          evidence_to_owner == Drone_Battery_Charge_Supervisor::BatteryEvidence.InvalidBattery &
          evidence_to_attention == Drone_Battery_Charge_Supervisor::BatteryEvidence.InvalidBattery &
          evidence_to_readiness == Drone_Battery_Charge_Supervisor::BatteryEvidence.InvalidBattery;

      compute
        modifies evidence_to_owner, evidence_to_attention, evidence_to_readiness;
        compute_cases
          case BATTERY_INVALID "Invalid battery evidence is published to every consumer | N.md#BATTERY_INVALID":
            assume battery_sample.status == Drone_Battery_Charge_Supervisor::InputStatus.Invalid;
            guarantee evidence_to_owner == Drone_Battery_Charge_Supervisor::BatteryEvidence.InvalidBattery &
              evidence_to_attention == Drone_Battery_Charge_Supervisor::BatteryEvidence.InvalidBattery &
              evidence_to_readiness == Drone_Battery_Charge_Supervisor::BatteryEvidence.InvalidBattery;
          case BATTERY_LOW "Valid Low sample is qualified consistently | N.md#BATTERY_LOW":
            assume battery_sample.status == Drone_Battery_Charge_Supervisor::InputStatus.Valid &
              battery_sample.indication == Drone_Battery_Charge_Supervisor::BatteryIndication.Low;
            guarantee evidence_to_owner == Drone_Battery_Charge_Supervisor::BatteryEvidence.LowBatteryEvidence &
              evidence_to_attention == Drone_Battery_Charge_Supervisor::BatteryEvidence.LowBatteryEvidence &
              evidence_to_readiness == Drone_Battery_Charge_Supervisor::BatteryEvidence.LowBatteryEvidence;
          case BATTERY_ADEQUATE "Valid Adequate sample is qualified consistently | N.md#BATTERY_ADEQUATE":
            assume battery_sample.status == Drone_Battery_Charge_Supervisor::InputStatus.Valid &
              battery_sample.indication == Drone_Battery_Charge_Supervisor::BatteryIndication.Adequate;
            guarantee evidence_to_owner == Drone_Battery_Charge_Supervisor::BatteryEvidence.AdequateBatteryEvidence &
              evidence_to_attention == Drone_Battery_Charge_Supervisor::BatteryEvidence.AdequateBatteryEvidence &
              evidence_to_readiness == Drone_Battery_Charge_Supervisor::BatteryEvidence.AdequateBatteryEvidence;
    }*/
                        
                
                         
                                                                                                     
                                                               
                                                                   
                                                                  

             
                     
                                
                                                                                                  
                                                                
                                                                           
                                                                               
                                                                              
                                
                                                                               
                                                               
                                                                      
                                                                               
                                                                                   
                                                                                  
                                
                                                                                              
                                                               
                                                                           
                                                                                    
                                                                                        
                                                                                       
       
  }

  part def Charge_Context_Qualification :> Thread {
    port charger_sample : DataPort { in :>> type : ChargerSample; }
    port flight_sample : DataPort { in :>> type : FlightActivitySample; }
    port charge_context : DataPort { out :>> type : ChargeContext; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_CHARGE_CONTEXT:
          charge_context == Drone_Battery_Charge_Supervisor::ChargeContext.InvalidChargeContext;

      compute
        modifies charge_context;
        compute_cases
          case CONTEXT_INVALID "Invalid charger or flight evidence inhibits context qualification | N.md#CONTEXT_INVALID":
            assume charger_sample.status == Drone_Battery_Charge_Supervisor::InputStatus.Invalid |
              flight_sample.status == Drone_Battery_Charge_Supervisor::InputStatus.Invalid;
            guarantee charge_context == Drone_Battery_Charge_Supervisor::ChargeContext.InvalidChargeContext;
          case CONTEXT_FLIGHT_ACTIVE "Valid active flight context is not charge eligible | N.md#CONTEXT_FLIGHT_ACTIVE":
            assume charger_sample.status == Drone_Battery_Charge_Supervisor::InputStatus.Valid &
              flight_sample.status == Drone_Battery_Charge_Supervisor::InputStatus.Valid &
              flight_sample.activity == Drone_Battery_Charge_Supervisor::FlightActivity.Active;
            guarantee charge_context == Drone_Battery_Charge_Supervisor::ChargeContext.FlightActiveContext;
          case CONTEXT_AVAILABLE_INACTIVE "Available charger and inactive flight context are qualified | N.md#CONTEXT_AVAILABLE_INACTIVE":
            assume charger_sample.status == Drone_Battery_Charge_Supervisor::InputStatus.Valid &
              flight_sample.status == Drone_Battery_Charge_Supervisor::InputStatus.Valid &
              flight_sample.activity == Drone_Battery_Charge_Supervisor::FlightActivity.Inactive &
              charger_sample.availability == Drone_Battery_Charge_Supervisor::ChargerAvailability.Available;
            guarantee charge_context == Drone_Battery_Charge_Supervisor::ChargeContext.AvailableInactiveContext;
          case CONTEXT_UNAVAILABLE_INACTIVE "Unavailable charger remains noneligible while flight is inactive | N.md#CONTEXT_UNAVAILABLE_INACTIVE":
            assume charger_sample.status == Drone_Battery_Charge_Supervisor::InputStatus.Valid &
              flight_sample.status == Drone_Battery_Charge_Supervisor::InputStatus.Valid &
              flight_sample.activity == Drone_Battery_Charge_Supervisor::FlightActivity.Inactive &
              charger_sample.availability == Drone_Battery_Charge_Supervisor::ChargerAvailability.Unavailable;
            guarantee charge_context == Drone_Battery_Charge_Supervisor::ChargeContext.UnavailableInactiveContext;
    }*/
                        
                
                         
                                                                                 
                                                               

             
                     
                               
                                                                                   
                                                                 
                                                               
                                                                           
                               
                                                                                                      
                                                               
                                                              
                                                                   
                                                                          
                               
                                                                                                                       
                                                               
                                                              
                                                                      
                                                                                
                                                                               
                               
                                                                                                                             
                                                               
                                                              
                                                                      
                                                                                  
                                                                                 
       
  }

  part def Charge_Intent_Qualification :> Thread {
    port intent_sample : DataPort { in :>> type : ChargeIntentSample; }
    port qualified_intent : DataPort { out :>> type : QualifiedChargeIntent; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_QUALIFIED_INTENT:
          qualified_intent == Drone_Battery_Charge_Supervisor::QualifiedChargeIntent.InvalidChargeIntent;

      compute
        modifies qualified_intent;
        compute_cases
          case INTENT_INVALID "Invalid intent is never qualified | N.md#INTENT_INVALID":
            assume intent_sample.status == Drone_Battery_Charge_Supervisor::InputStatus.Invalid;
            guarantee qualified_intent == Drone_Battery_Charge_Supervisor::QualifiedChargeIntent.InvalidChargeIntent;
          case INTENT_NEUTRAL "Valid neutral intent is qualified | N.md#INTENT_NEUTRAL":
            assume intent_sample.status == Drone_Battery_Charge_Supervisor::InputStatus.Valid &
              intent_sample.intent == Drone_Battery_Charge_Supervisor::ChargeIntent.NoIntent;
            guarantee qualified_intent == Drone_Battery_Charge_Supervisor::QualifiedChargeIntent.NoIntent;
          case INTENT_BEGIN "Valid begin intent is qualified | N.md#INTENT_BEGIN":
            assume intent_sample.status == Drone_Battery_Charge_Supervisor::InputStatus.Valid &
              intent_sample.intent == Drone_Battery_Charge_Supervisor::ChargeIntent.BeginCharge;
            guarantee qualified_intent == Drone_Battery_Charge_Supervisor::QualifiedChargeIntent.BeginCharge;
          case INTENT_END "Valid end intent is qualified | N.md#INTENT_END":
            assume intent_sample.status == Drone_Battery_Charge_Supervisor::InputStatus.Valid &
              intent_sample.intent == Drone_Battery_Charge_Supervisor::ChargeIntent.EndCharge;
            guarantee qualified_intent == Drone_Battery_Charge_Supervisor::QualifiedChargeIntent.EndCharge;
    }*/
                        
                
                         
                                                                                     
                                                                        

             
                     
                                  
                                                                                             
                                                               
                                                                                    
                                  
                                                                            
                                                              
                                                                 
                                                                         
                                  
                                                                                
                                                              
                                                                    
                                                                            
                                  
                                                                          
                                                              
                                                                  
                                                                          
       
  }

  part def Charge_Qualification_Owner :> Thread {
    port battery_evidence : DataPort { in :>> type : BatteryEvidence; }
    port charge_context : DataPort { in :>> type : ChargeContext; }
    port qualified_intent : DataPort { in :>> type : QualifiedChargeIntent; }
    port authorization : DataPort { out :>> type : ChargeAuthorization; }
    port decision_to_attention : DataPort { out :>> type : ChargeDecision; }
    port decision_to_readiness : DataPort { out :>> type : ChargeDecision; }

    language "GUMBO" /*{
      state
        authorizationState: Drone_Battery_Charge_Supervisor::ChargeAuthorization;
        recoveryPhase: Drone_Battery_Charge_Supervisor::RecoveryPhase;

      initialize
        guarantee INITIAL_OWNER_STATE_AND_OUTPUTS:
          authorizationState == Drone_Battery_Charge_Supervisor::ChargeAuthorization.InhibitCharge &
          recoveryPhase == Drone_Battery_Charge_Supervisor::RecoveryPhase.Normal &
          authorization == Drone_Battery_Charge_Supervisor::ChargeAuthorization.InhibitCharge &
          decision_to_attention.authorization == Drone_Battery_Charge_Supervisor::ChargeAuthorization.InhibitCharge &
          decision_to_attention.disposition == Drone_Battery_Charge_Supervisor::ChargeDisposition.Inactive &
          decision_to_readiness.authorization == Drone_Battery_Charge_Supervisor::ChargeAuthorization.InhibitCharge &
          decision_to_readiness.disposition == Drone_Battery_Charge_Supervisor::ChargeDisposition.Inactive;

      compute
        modifies authorizationState, recoveryPhase, authorization, decision_to_attention, decision_to_readiness;
        guarantee RECOVERY_INHIBITS "Recovery phases always inhibit authorization | N.md#RECOVERY_INHIBITS":
          recoveryPhase != Drone_Battery_Charge_Supervisor::RecoveryPhase.Normal implies
            authorizationState == Drone_Battery_Charge_Supervisor::ChargeAuthorization.InhibitCharge;
        guarantee OWNER_PUBLICATIONS_AGREE "All owner publications are one logical decision | N.md#OWNER_PUBLICATIONS_AGREE":
          authorization == authorizationState &
          decision_to_attention.authorization == authorizationState &
          decision_to_readiness.authorization == authorizationState &
          decision_to_attention.disposition == decision_to_readiness.disposition;
        compute_cases
          case CASE_01_INPUT_FAULT "Any invalid qualified evidence enters recovery | N.md#CASE_01_INPUT_FAULT":
            assume battery_evidence == Drone_Battery_Charge_Supervisor::BatteryEvidence.InvalidBattery |
              charge_context == Drone_Battery_Charge_Supervisor::ChargeContext.InvalidChargeContext |
              qualified_intent == Drone_Battery_Charge_Supervisor::QualifiedChargeIntent.InvalidChargeIntent;
            guarantee authorizationState == Drone_Battery_Charge_Supervisor::ChargeAuthorization.InhibitCharge &
              recoveryPhase == Drone_Battery_Charge_Supervisor::RecoveryPhase.AwaitNeutral &
              decision_to_attention.disposition == Drone_Battery_Charge_Supervisor::ChargeDisposition.InputFault;
          case CASE_02_RETAINED_NONNEUTRAL "Nonneutral intent cannot pass AwaitNeutral recovery | N.md#CASE_02_RETAINED_NONNEUTRAL":
            assume battery_evidence != Drone_Battery_Charge_Supervisor::BatteryEvidence.InvalidBattery &
              charge_context != Drone_Battery_Charge_Supervisor::ChargeContext.InvalidChargeContext &
              qualified_intent != Drone_Battery_Charge_Supervisor::QualifiedChargeIntent.InvalidChargeIntent &
              In(recoveryPhase) == Drone_Battery_Charge_Supervisor::RecoveryPhase.AwaitNeutral &
              qualified_intent != Drone_Battery_Charge_Supervisor::QualifiedChargeIntent.NoIntent;
            guarantee authorizationState == Drone_Battery_Charge_Supervisor::ChargeAuthorization.InhibitCharge &
              recoveryPhase == Drone_Battery_Charge_Supervisor::RecoveryPhase.AwaitNeutral &
              decision_to_attention.disposition == Drone_Battery_Charge_Supervisor::ChargeDisposition.RecoveryPending;
          case CASE_03_NEUTRAL_ADVANCES_RECOVERY "Neutral input advances recovery to AwaitFreshIntent | N.md#CASE_03_NEUTRAL_ADVANCES_RECOVERY":
            assume battery_evidence != Drone_Battery_Charge_Supervisor::BatteryEvidence.InvalidBattery &
              charge_context != Drone_Battery_Charge_Supervisor::ChargeContext.InvalidChargeContext &
              qualified_intent == Drone_Battery_Charge_Supervisor::QualifiedChargeIntent.NoIntent &
              In(recoveryPhase) == Drone_Battery_Charge_Supervisor::RecoveryPhase.AwaitNeutral;
            guarantee authorizationState == Drone_Battery_Charge_Supervisor::ChargeAuthorization.InhibitCharge &
              recoveryPhase == Drone_Battery_Charge_Supervisor::RecoveryPhase.AwaitFreshIntent &
              decision_to_attention.disposition == Drone_Battery_Charge_Supervisor::ChargeDisposition.RecoveryPending;
          case CASE_04_WAIT_FOR_FRESH_INTENT "Neutral input retains AwaitFreshIntent recovery | N.md#CASE_04_WAIT_FOR_FRESH_INTENT":
            assume battery_evidence != Drone_Battery_Charge_Supervisor::BatteryEvidence.InvalidBattery &
              charge_context != Drone_Battery_Charge_Supervisor::ChargeContext.InvalidChargeContext &
              qualified_intent == Drone_Battery_Charge_Supervisor::QualifiedChargeIntent.NoIntent &
              In(recoveryPhase) == Drone_Battery_Charge_Supervisor::RecoveryPhase.AwaitFreshIntent;
            guarantee authorizationState == Drone_Battery_Charge_Supervisor::ChargeAuthorization.InhibitCharge &
              recoveryPhase == Drone_Battery_Charge_Supervisor::RecoveryPhase.AwaitFreshIntent &
              decision_to_attention.disposition == Drone_Battery_Charge_Supervisor::ChargeDisposition.RecoveryPending;
          case CASE_05_FRESH_END "Fresh EndCharge exits recovery inhibited | N.md#CASE_05_FRESH_END":
            assume battery_evidence != Drone_Battery_Charge_Supervisor::BatteryEvidence.InvalidBattery &
              charge_context != Drone_Battery_Charge_Supervisor::ChargeContext.InvalidChargeContext &
              qualified_intent == Drone_Battery_Charge_Supervisor::QualifiedChargeIntent.EndCharge &
              In(recoveryPhase) == Drone_Battery_Charge_Supervisor::RecoveryPhase.AwaitFreshIntent;
            guarantee authorizationState == Drone_Battery_Charge_Supervisor::ChargeAuthorization.InhibitCharge &
              recoveryPhase == Drone_Battery_Charge_Supervisor::RecoveryPhase.Normal &
              decision_to_attention.disposition == Drone_Battery_Charge_Supervisor::ChargeDisposition.Inactive;
          case CASE_06_FRESH_ELIGIBLE_BEGIN "Fresh eligible BeginCharge permits charge | N.md#CASE_06_FRESH_ELIGIBLE_BEGIN":
            assume battery_evidence == Drone_Battery_Charge_Supervisor::BatteryEvidence.LowBatteryEvidence &
              charge_context == Drone_Battery_Charge_Supervisor::ChargeContext.AvailableInactiveContext &
              qualified_intent == Drone_Battery_Charge_Supervisor::QualifiedChargeIntent.BeginCharge &
              In(recoveryPhase) == Drone_Battery_Charge_Supervisor::RecoveryPhase.AwaitFreshIntent;
            guarantee authorizationState == Drone_Battery_Charge_Supervisor::ChargeAuthorization.PermitCharge &
              recoveryPhase == Drone_Battery_Charge_Supervisor::RecoveryPhase.Normal &
              decision_to_attention.disposition == Drone_Battery_Charge_Supervisor::ChargeDisposition.BeginAccepted;
          case CASE_07_FRESH_INELIGIBLE_BEGIN "Fresh ineligible BeginCharge is denied | N.md#CASE_07_FRESH_INELIGIBLE_BEGIN":
            assume battery_evidence != Drone_Battery_Charge_Supervisor::BatteryEvidence.InvalidBattery &
              charge_context != Drone_Battery_Charge_Supervisor::ChargeContext.InvalidChargeContext &
              qualified_intent == Drone_Battery_Charge_Supervisor::QualifiedChargeIntent.BeginCharge &
              In(recoveryPhase) == Drone_Battery_Charge_Supervisor::RecoveryPhase.AwaitFreshIntent &
              not (battery_evidence == Drone_Battery_Charge_Supervisor::BatteryEvidence.LowBatteryEvidence &
                charge_context == Drone_Battery_Charge_Supervisor::ChargeContext.AvailableInactiveContext);
            guarantee authorizationState == Drone_Battery_Charge_Supervisor::ChargeAuthorization.InhibitCharge &
              recoveryPhase == Drone_Battery_Charge_Supervisor::RecoveryPhase.Normal &
              decision_to_attention.disposition == Drone_Battery_Charge_Supervisor::ChargeDisposition.BeginDenied;
          case CASE_08_NORMAL_END "EndCharge in Normal inhibits authorization | N.md#CASE_08_NORMAL_END":
            assume battery_evidence != Drone_Battery_Charge_Supervisor::BatteryEvidence.InvalidBattery &
              charge_context != Drone_Battery_Charge_Supervisor::ChargeContext.InvalidChargeContext &
              qualified_intent == Drone_Battery_Charge_Supervisor::QualifiedChargeIntent.EndCharge &
              In(recoveryPhase) == Drone_Battery_Charge_Supervisor::RecoveryPhase.Normal;
            guarantee authorizationState == Drone_Battery_Charge_Supervisor::ChargeAuthorization.InhibitCharge &
              recoveryPhase == Drone_Battery_Charge_Supervisor::RecoveryPhase.Normal &
              decision_to_attention.disposition == Drone_Battery_Charge_Supervisor::ChargeDisposition.Inactive;
          case CASE_09_NORMAL_ELIGIBLE_BEGIN "Eligible BeginCharge in Normal permits charge | N.md#CASE_09_NORMAL_ELIGIBLE_BEGIN":
            assume battery_evidence == Drone_Battery_Charge_Supervisor::BatteryEvidence.LowBatteryEvidence &
              charge_context == Drone_Battery_Charge_Supervisor::ChargeContext.AvailableInactiveContext &
              qualified_intent == Drone_Battery_Charge_Supervisor::QualifiedChargeIntent.BeginCharge &
              In(recoveryPhase) == Drone_Battery_Charge_Supervisor::RecoveryPhase.Normal;
            guarantee authorizationState == Drone_Battery_Charge_Supervisor::ChargeAuthorization.PermitCharge &
              recoveryPhase == Drone_Battery_Charge_Supervisor::RecoveryPhase.Normal &
              decision_to_attention.disposition == Drone_Battery_Charge_Supervisor::ChargeDisposition.BeginAccepted;
          case CASE_10_NORMAL_INELIGIBLE_BEGIN "Ineligible BeginCharge in Normal is denied | N.md#CASE_10_NORMAL_INELIGIBLE_BEGIN":
            assume battery_evidence != Drone_Battery_Charge_Supervisor::BatteryEvidence.InvalidBattery &
              charge_context != Drone_Battery_Charge_Supervisor::ChargeContext.InvalidChargeContext &
              qualified_intent == Drone_Battery_Charge_Supervisor::QualifiedChargeIntent.BeginCharge &
              In(recoveryPhase) == Drone_Battery_Charge_Supervisor::RecoveryPhase.Normal &
              not (battery_evidence == Drone_Battery_Charge_Supervisor::BatteryEvidence.LowBatteryEvidence &
                charge_context == Drone_Battery_Charge_Supervisor::ChargeContext.AvailableInactiveContext);
            guarantee authorizationState == Drone_Battery_Charge_Supervisor::ChargeAuthorization.InhibitCharge &
              recoveryPhase == Drone_Battery_Charge_Supervisor::RecoveryPhase.Normal &
              decision_to_attention.disposition == Drone_Battery_Charge_Supervisor::ChargeDisposition.BeginDenied;
          case CASE_11_RETAIN_ELIGIBLE_PERMISSION "Eligible neutral sample retains a prior permission | N.md#CASE_11_RETAIN_ELIGIBLE_PERMISSION":
            assume battery_evidence == Drone_Battery_Charge_Supervisor::BatteryEvidence.LowBatteryEvidence &
              charge_context == Drone_Battery_Charge_Supervisor::ChargeContext.AvailableInactiveContext &
              qualified_intent == Drone_Battery_Charge_Supervisor::QualifiedChargeIntent.NoIntent &
              In(recoveryPhase) == Drone_Battery_Charge_Supervisor::RecoveryPhase.Normal &
              In(authorizationState) == Drone_Battery_Charge_Supervisor::ChargeAuthorization.PermitCharge;
            guarantee authorizationState == Drone_Battery_Charge_Supervisor::ChargeAuthorization.PermitCharge &
              recoveryPhase == Drone_Battery_Charge_Supervisor::RecoveryPhase.Normal &
              decision_to_attention.disposition == Drone_Battery_Charge_Supervisor::ChargeDisposition.Continued;
          case CASE_12_REMAIN_OR_REVOKE "All other valid neutral samples inhibit charge | N.md#CASE_12_REMAIN_OR_REVOKE":
            assume battery_evidence != Drone_Battery_Charge_Supervisor::BatteryEvidence.InvalidBattery &
              charge_context != Drone_Battery_Charge_Supervisor::ChargeContext.InvalidChargeContext &
              qualified_intent == Drone_Battery_Charge_Supervisor::QualifiedChargeIntent.NoIntent &
              In(recoveryPhase) == Drone_Battery_Charge_Supervisor::RecoveryPhase.Normal &
              not (In(authorizationState) == Drone_Battery_Charge_Supervisor::ChargeAuthorization.PermitCharge &
                battery_evidence == Drone_Battery_Charge_Supervisor::BatteryEvidence.LowBatteryEvidence &
                charge_context == Drone_Battery_Charge_Supervisor::ChargeContext.AvailableInactiveContext);
            guarantee authorizationState == Drone_Battery_Charge_Supervisor::ChargeAuthorization.InhibitCharge &
              recoveryPhase == Drone_Battery_Charge_Supervisor::RecoveryPhase.Normal &
              decision_to_attention.disposition == Drone_Battery_Charge_Supervisor::ChargeDisposition.Inactive;
    }*/
                        
                        
           
                                                
                                     

                
                         
                                                                                                                               
                                                                   
                                                 
                                                              
                                                                                    
                                                                           
                                                                                    
                                                                          

             
                          
                                                                             
                                                      
                                                                         
                           
                                                                                                                          
                                               
                                                                     
                                                                     
                                                                                 

                     
                           
                                                                                                  
                                                                       
                                                                         
                                                                                 
                                                                               
                                                                   
                                                                          
                                                                                                
                                                                                         
                                                                                                
                                                                                        

                           
                                                                                                                      
                                                                       
                                                                         
                                                                                  
                                                                    
                                                                      
                                                                               
                                                                   
                                                                          
                                                                                                
                                                                                              
                                                                                                
                                                                                             

                           
                                                                                                                                      
                                                                       
                                                                         
                                                                       
                                                                   
                                                                               
                                                                       
                                                                          
                                                                                                
                                                                                              
                                                                                                
                                                                                             

                           
                                                                                                                      
                                                                       
                                                                         
                                                                       
                                                                       
                                                                               
                                                                       
                                                                          
                                                                                                
                                                                                              
                                                                                                
                                                                                             

                           
                                                                                              
                                                                       
                                                                         
                                                                        
                                                                       
                                                                               
                                                             
                                                                          
                                                                                                
                                                                                       
                                                                                                
                                                                                      

                           
                                                                                                                 
                                                                           
                                                                             
                                                                          
                                                                       
                                                                              
                                                             
                                                                         
                                                                                               
                                                                                            
                                                                                               
                                                                                           

                           
                                                                                                                        
                                                                       
                                                                         
                                                                          
                                                                        
                                                                                
                                                                                  
                                                                               
                                                             
                                                                          
                                                                                                
                                                                                          
                                                                                                
                                                                                         

                           
                                                                                
                                                                       
                                                                         
                                                                        
                                                             
                                                                               
                                                             
                                                                          
                                                                                                
                                                                                       
                                                                                                
                                                                                      

                           
                                                                                                
                                                                           
                                                                             
                                                                          
                                                             
                                                                              
                                                             
                                                                         
                                                                                               
                                                                                            
                                                                                               
                                                                                           

                           
                                                                                               
                                                                       
                                                                         
                                                                          
                                                              
                                                                                
                                                                                  
                                                                               
                                                             
                                                                          
                                                                                                
                                                                                          
                                                                                                
                                                                                         

                           
                                                                                                 
                                                                           
                                                                             
                                                                       
                                                              
                                                                              
                                                                              
                                                             
                                                                         
                                                                                               
                                                                                        
                                                                                               
                                                                                       

                           
                                                                                                  
                                                                       
                                                                         
                                                                       
                                                              
                                                                                    
                                                                                
                                                                                  
                                                                               
                                                             
                                                                          
                                                                                                
                                                                                       
                                                                                                
                                                                                      
       
  }

  part def Pilot_Attention_Derivation :> Thread {
    port charge_decision : DataPort { in :>> type : ChargeDecision; }
    port battery_evidence : DataPort { in :>> type : BatteryEvidence; }
    port battery_attention : DataPort { out :>> type : BatteryAttention; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_ATTENTION:
          battery_attention == Drone_Battery_Charge_Supervisor::BatteryAttention.None;

      compute
        modifies battery_attention;
        compute_cases
          case ATTENTION_INPUT_FAULT "Input fault is pilot-visible | N.md#ATTENTION_INPUT_FAULT":
            assume charge_decision.disposition == Drone_Battery_Charge_Supervisor::ChargeDisposition.InputFault;
            guarantee battery_attention == Drone_Battery_Charge_Supervisor::BatteryAttention.InputFault;
          case ATTENTION_RECOVERY_PENDING "Recovery is pilot-visible | N.md#ATTENTION_RECOVERY_PENDING":
            assume charge_decision.disposition == Drone_Battery_Charge_Supervisor::ChargeDisposition.RecoveryPending;
            guarantee battery_attention == Drone_Battery_Charge_Supervisor::BatteryAttention.RecoveryPending;
          case ATTENTION_LOW_BATTERY "Low valid evidence is pilot-visible outside fault/recovery | N.md#ATTENTION_LOW_BATTERY":
            assume charge_decision.disposition != Drone_Battery_Charge_Supervisor::ChargeDisposition.InputFault &
              charge_decision.disposition != Drone_Battery_Charge_Supervisor::ChargeDisposition.RecoveryPending &
              battery_evidence == Drone_Battery_Charge_Supervisor::BatteryEvidence.LowBatteryEvidence;
            guarantee battery_attention == Drone_Battery_Charge_Supervisor::BatteryAttention.LowBattery;
          case ATTENTION_NONE "Non-low valid evidence has no battery attention | N.md#ATTENTION_NONE":
            assume charge_decision.disposition != Drone_Battery_Charge_Supervisor::ChargeDisposition.InputFault &
              charge_decision.disposition != Drone_Battery_Charge_Supervisor::ChargeDisposition.RecoveryPending &
              battery_evidence != Drone_Battery_Charge_Supervisor::BatteryEvidence.LowBatteryEvidence;
            guarantee battery_attention == Drone_Battery_Charge_Supervisor::BatteryAttention.None;
    }*/
                        
                
                         
                                                                          
                                                     

             
                     
                               
                                                                                        
                                                                               
                                                                       
                               
                                                                                                     
                                                                                    
                                                                            
                               
                                                                                                    
                                                                                
                                                                                     
                                                                          
                                                                       
                               
                                                                                                     
                                                                                
                                                                                     
                                                                          
                                                                 
       
  }

  part def Readiness_Evidence_Derivation :> Thread {
    port charge_decision : DataPort { in :>> type : ChargeDecision; }
    port battery_evidence : DataPort { in :>> type : BatteryEvidence; }
    port readiness_evidence : DataPort { out :>> type : BatteryReadinessEvidence; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_READINESS:
          readiness_evidence == Drone_Battery_Charge_Supervisor::BatteryReadinessEvidence.EvidenceUnavailable;

      compute
        modifies readiness_evidence;
        compute_cases
          case READINESS_UNAVAILABLE "Fault or recovery makes readiness evidence unavailable | N.md#READINESS_UNAVAILABLE":
            assume charge_decision.disposition == Drone_Battery_Charge_Supervisor::ChargeDisposition.InputFault |
              charge_decision.disposition == Drone_Battery_Charge_Supervisor::ChargeDisposition.RecoveryPending;
            guarantee readiness_evidence == Drone_Battery_Charge_Supervisor::BatteryReadinessEvidence.EvidenceUnavailable;
          case READINESS_LOW "Low valid evidence is not flight ready | N.md#READINESS_LOW":
            assume charge_decision.disposition != Drone_Battery_Charge_Supervisor::ChargeDisposition.InputFault &
              charge_decision.disposition != Drone_Battery_Charge_Supervisor::ChargeDisposition.RecoveryPending &
              battery_evidence == Drone_Battery_Charge_Supervisor::BatteryEvidence.LowBatteryEvidence;
            guarantee readiness_evidence == Drone_Battery_Charge_Supervisor::BatteryReadinessEvidence.BatteryNotReady;
          case READINESS_ADEQUATE "Adequate valid evidence is flight-ready evidence | N.md#READINESS_ADEQUATE":
            assume charge_decision.disposition != Drone_Battery_Charge_Supervisor::ChargeDisposition.InputFault &
              charge_decision.disposition != Drone_Battery_Charge_Supervisor::ChargeDisposition.RecoveryPending &
              battery_evidence == Drone_Battery_Charge_Supervisor::BatteryEvidence.AdequateBatteryEvidence;
            guarantee readiness_evidence == Drone_Battery_Charge_Supervisor::BatteryReadinessEvidence.BatteryReady;
    }*/
                        
                
                         
                                                                                    
                                                                             

             
                     
                                
                                                                                                
                                                                                
                                                                                    
                                                                                         
                                
                                                                                      
                                                                                
                                                                                     
                                                                          
                                                                                     
                                
                                                                                            
                                                                                
                                                                                     
                                                                               
                                                                                  
       
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
