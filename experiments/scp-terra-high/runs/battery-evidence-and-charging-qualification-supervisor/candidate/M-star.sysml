package Drone_Battery_Charge_Qualification_Supervisor {

  private import HAMR::*;

  // Closed finite boundary and owner-local domains.
  enum def ServiceRequest { enum None; enum Assess; enum BeginCharge; enum EndCharge; enum AcknowledgeNotice; }
  enum def BatteryBand { enum Full; enum Nominal; enum Low; enum Critical; }
  enum def Validity { enum Valid; enum Invalid; }
  enum def ChargerReport { enum Disconnected; enum Ready; enum Faulted; enum Unknown; }
  enum def ChargeInterfaceReport { enum Idle; enum Active; enum Faulted; enum Unknown; }
  enum def LifecyclePhase { enum Off; enum Standby; enum Charging; enum Ready; enum Flying; }
  enum def ChargeAuthorization { enum Denied; enum Permitted; }
  enum def PilotNotice { enum EvidenceUntrusted; enum Critical; enum Low; enum ChargeAttention; enum RecoveryPending; enum Clear; }
  enum def FlightControlNotice { enum EvidenceUntrusted; enum Critical; enum Low; enum RecoveryPending; enum Clear; }
  enum def PilotAdvisory {
    enum ADVISORY_UNKNOWN;
    enum BATTERY_READY;
    enum CHARGE_QUALIFIED;
    enum CHARGE_BLOCKED;
    enum AIRBORNE_ATTENTION;
  }
  enum def RequestResult { enum None; enum Accepted; enum Rejected; enum Deferred; enum NoEffect; }
  enum def BatteryConfidence { enum Untrusted; enum Confirming; enum Trusted; }
  enum def AttentionState { enum Clear; enum Attention; }
  enum def ChargeSession { enum Idle; enum Eligible; enum Authorized; enum Suspended; }
  enum def SourceChargeSession { enum Idle; enum Eligible; enum Authorized; enum Suspended; }
  enum def QualifiedBand { enum Suppressed; enum Full; enum Nominal; enum Low; enum Critical; }
  enum def ChargeEligibility { enum Blocked; enum NotNeeded; enum Permitted; }
  enum def AttentionCause { enum Untrusted; enum Critical; enum Low; enum RecoveryPending; enum Clear; }
  enum def ConfidenceCase { enum CONF_01; enum CONF_02; enum CONF_03; enum CONF_04; }
  enum def AttentionCase { enum ATTN_01; enum ATTN_02; enum ATTN_03; enum ATTN_04; enum ATTN_05; enum ATTN_06; }
  enum def SessionCase {
    enum SESS_01; enum SESS_02; enum SESS_03; enum SESS_04; enum SESS_05;
    enum SESS_06; enum SESS_07; enum SESS_08; enum SESS_09; enum SESS_10;
    enum SESS_11; enum SESS_12; enum SESS_13;
  }

  // Every member below is an attribute because final GUMBO expressions inspect it.
  part def BatteryReportValue :> Data {
    attribute band : BatteryBand;
    attribute validity : Validity;
  }
  part def LifecycleReportValue :> Data {
    attribute phase : LifecyclePhase;
    attribute validity : Validity;
  }
  part def BatteryQualification :> Data {
    attribute validEvidence : Boolean;
    attribute band : QualifiedBand;
  }
  part def ChargerFacts :> Data {
    attribute chargerUsable : Boolean;
    attribute chargerConnected : Boolean;
    attribute chargerFault : Boolean;
  }
  part def InterfaceFacts :> Data {
    attribute interfaceHealthy : Boolean;
    attribute activityObserved : Boolean;
    attribute interfaceFault : Boolean;
  }
  part def LifecycleFacts :> Data {
    attribute chargeContextAllowed : Boolean;
    attribute airborneContext : Boolean;
    attribute contextValid : Boolean;
    attribute contextFault : Boolean;
  }
  part def BatteryStateFacts :> Data {
    attribute confidence : BatteryConfidence;
    attribute band : QualifiedBand;
    attribute chargeNeeded : Boolean;
    attribute batteryUsable : Boolean;
    attribute batteryFault : Boolean;
    attribute winningCase : ConfidenceCase;
  }
  part def AttentionResolution :> Data {
    attribute newAttention : AttentionState;
    attribute cause : AttentionCause;
    attribute attentionClearedNow : Boolean;
    attribute winningCase : AttentionCase;
  }
  part def FaultVector :> Data {
    attribute batteryFault : Boolean;
    attribute chargerFault : Boolean;
    attribute interfaceFault : Boolean;
    attribute contextFault : Boolean;
    attribute sessionConflict : Boolean;
  }
  part def FaultFacts :> Data {
    attribute vector : FaultVector;
    attribute aggregateFault : Boolean;
  }
  part def PublishedSession :> Data {
    attribute sessionValue : ChargeSession;
  }
  part def SessionResolution :> Data {
    attribute sourceSession : SourceChargeSession;
    attribute newSession : PublishedSession;
    attribute sessionConflict : Boolean;
    attribute winningCase : SessionCase;
  }
  part def AdvisoryFacts :> Data {
    attribute advisoryValue : PilotAdvisory;
  }
  part def PublishedRequestResult :> Data {
    attribute requestResultValue : RequestResult;
  }
  part def PublicDecisionFacts :> Data {
    attribute advisory : AdvisoryFacts;
    attribute requestResult : PublishedRequestResult;
    attribute newSession : PublishedSession;
  }
  part def NotificationFacts :> Data {
    attribute pilotNotice : PilotNotice;
    attribute flightControlNotice : FlightControlNotice;
  }
  part def PilotStatus :> Data {
    attribute statusAdvisory : AdvisoryFacts;
    attribute statusSession : PublishedSession;
    attribute statusRequestResult : PublishedRequestResult;
    attribute faults : FaultVector;
    attribute aggregateFault : Boolean;
  }

  part def CurrentRequestResultDecisionOwner :> Thread {
    port requestIn : DataPort { in :>> type : ServiceRequest; }
    port attentionClearedIn : DataPort { in :>> type : Boolean; }
    port advisoryIn : DataPort { in :>> type : AdvisoryFacts; }
    port sessionIn : DataPort { in :>> type : SessionResolution; }
    port publicFactsOut : DataPort { out :>> type : PublicDecisionFacts; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_PUBLIC_REQUEST_RESULT: publicFactsOut.requestResult.requestResultValue == RequestResult.None;
        guarantee INITIAL_PUBLIC_ADVISORY: publicFactsOut.advisory.advisoryValue == PilotAdvisory.ADVISORY_UNKNOWN;
        guarantee INITIAL_PUBLIC_SESSION: publicFactsOut.newSession.sessionValue == ChargeSession.Idle;
      compute
        guarantee PUBLIC_DECISION_COPIES: publicFactsOut.advisory == advisoryIn and publicFactsOut.newSession == sessionIn.newSession;
        compute_cases
          case REQUEST_NONE: assume requestIn == ServiceRequest.None; guarantee publicFactsOut.requestResult.requestResultValue == RequestResult.None;
          case ASSESS_DEFERRED: assume requestIn == ServiceRequest.Assess and advisoryIn.advisoryValue == PilotAdvisory.ADVISORY_UNKNOWN; guarantee publicFactsOut.requestResult.requestResultValue == RequestResult.Deferred;
          case ASSESS_ACCEPTED: assume requestIn == ServiceRequest.Assess and advisoryIn.advisoryValue != PilotAdvisory.ADVISORY_UNKNOWN; guarantee publicFactsOut.requestResult.requestResultValue == RequestResult.Accepted;
          case BEGIN_ACCEPTED: assume requestIn == ServiceRequest.BeginCharge and (sessionIn.winningCase == SessionCase.SESS_07 or sessionIn.winningCase == SessionCase.SESS_09); guarantee publicFactsOut.requestResult.requestResultValue == RequestResult.Accepted;
          case BEGIN_DEFERRED: assume requestIn == ServiceRequest.BeginCharge and (sessionIn.winningCase == SessionCase.SESS_01 or sessionIn.winningCase == SessionCase.SESS_02 or sessionIn.winningCase == SessionCase.SESS_08); guarantee publicFactsOut.requestResult.requestResultValue == RequestResult.Deferred;
          case BEGIN_NO_EFFECT: assume requestIn == ServiceRequest.BeginCharge and sessionIn.winningCase == SessionCase.SESS_06; guarantee publicFactsOut.requestResult.requestResultValue == RequestResult.NoEffect;
          case BEGIN_REJECTED: assume requestIn == ServiceRequest.BeginCharge and sessionIn.winningCase != SessionCase.SESS_01 and sessionIn.winningCase != SessionCase.SESS_02 and sessionIn.winningCase != SessionCase.SESS_06 and sessionIn.winningCase != SessionCase.SESS_07 and sessionIn.winningCase != SessionCase.SESS_08 and sessionIn.winningCase != SessionCase.SESS_09; guarantee publicFactsOut.requestResult.requestResultValue == RequestResult.Rejected;
          case END_ACCEPTED: assume requestIn == ServiceRequest.EndCharge and (sessionIn.winningCase == SessionCase.SESS_03 or sessionIn.winningCase == SessionCase.SESS_04); guarantee publicFactsOut.requestResult.requestResultValue == RequestResult.Accepted;
          case END_NO_EFFECT: assume requestIn == ServiceRequest.EndCharge and sessionIn.winningCase != SessionCase.SESS_03 and sessionIn.winningCase != SessionCase.SESS_04; guarantee publicFactsOut.requestResult.requestResultValue == RequestResult.NoEffect;
          case ACKNOWLEDGEMENT_ACCEPTED: assume requestIn == ServiceRequest.AcknowledgeNotice and attentionClearedIn == true; guarantee publicFactsOut.requestResult.requestResultValue == RequestResult.Accepted;
          case ACKNOWLEDGEMENT_NO_EFFECT: assume requestIn == ServiceRequest.AcknowledgeNotice and attentionClearedIn == false; guarantee publicFactsOut.requestResult.requestResultValue == RequestResult.NoEffect;
    }*/

                        
                
                        
                                                                                                      
                                                                                
                        
                                                                                                             
                                                                                  
                        
                                                                                      
                                                                       

             
                         
                                                                                                                      
                                                                             
                                                                                      

                     
                              
                                                         
                                                    
                                                                                            
                              
                                                                                  
                                                                                                                   
                                                                                                
                              
                                                                             
                                                                                                                   
                                                                                                
                              
                                                                                              
                                                            
                                                                  
                                                                  
                                                                                                
                              
                                                                                                
                                                            
                                                                  
                                                                  
                                                                  
                                                                                                
                              
                                                                                    
                                                            
                                                                
                                                                                                
                              
                                                                     
                                                            
                                                                 
                                                                 
                                                                 
                                                                 
                                                                 
                                                                
                                                                                                
                              
                                                                                       
                                                          
                                                                  
                                                                  
                                                                                                
                              
                                                                     
                                                          
                                                                 
                                                                
                                                                                                
                              
                                                                                                 
                                                                                      
                                                                                                
                              
                                                                                         
                                                                                          
                                                                                                
       
  }
  part def BatteryEvidenceQualifier :> Thread {
    port reportIn : DataPort { in :>> type : BatteryReportValue; }
    port qualificationOut : DataPort { out :>> type : BatteryQualification; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_BATTERY_QUALIFICATION:
          qualificationOut.validEvidence == F and qualificationOut.band == QualifiedBand.Suppressed;

      compute
        compute_cases
        case INVALID_BATTERY_REPORT:
          assume reportIn.validity == Validity.Invalid;
          guarantee
            qualificationOut.validEvidence == F and qualificationOut.band == QualifiedBand.Suppressed;
        case VALID_FULL_REPORT:
          assume reportIn.validity == Validity.Valid and reportIn.band == BatteryBand.Full;
          guarantee qualificationOut.validEvidence == true and qualificationOut.band == QualifiedBand.Full;
        case VALID_NOMINAL_REPORT:
          assume reportIn.validity == Validity.Valid and reportIn.band == BatteryBand.Nominal;
          guarantee qualificationOut.validEvidence == true and qualificationOut.band == QualifiedBand.Nominal;
        case VALID_LOW_REPORT:
          assume reportIn.validity == Validity.Valid and reportIn.band == BatteryBand.Low;
          guarantee qualificationOut.validEvidence == true and qualificationOut.band == QualifiedBand.Low;
        case VALID_CRITICAL_REPORT:
          assume reportIn.validity == Validity.Valid and reportIn.band == BatteryBand.Critical;
          guarantee qualificationOut.validEvidence == true and qualificationOut.band == QualifiedBand.Critical;
    }*/

                        
                
                        
                                                                                                      
                                              
                                                            
             
                     
                          
                                                                                          
                                                         
                                                          
                                                                        
                          
                                                                      
                                                                                           
                                                                                                   
                          
                                                                               
                                                                                              
                                                                                                      
                          
                                                                   
                                                                                          
                                                                                                  
                          
                                                                                  
                                                                                               
                                                                                                       
       
  }
  part def ChargerEvidenceQualifier :> Thread {
    port reportIn : DataPort { in :>> type : ChargerReport; }
    port factsToEligibility : DataPort { out :>> type : ChargerFacts; }
    port faultToAggregation : DataPort { out :>> type : Boolean; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_CHARGER_FACTS: factsToEligibility.chargerUsable == false and factsToEligibility.chargerConnected == false and factsToEligibility.chargerFault == true and faultToAggregation == true;
      compute
        guarantee CHARGER_FAULT_PUBLICATION: faultToAggregation == factsToEligibility.chargerFault;
        compute_cases
          case CHARGER_DISCONNECTED: assume reportIn == ChargerReport.Disconnected; guarantee factsToEligibility.chargerUsable == false and factsToEligibility.chargerConnected == false and factsToEligibility.chargerFault == false;
          case CHARGER_READY: assume reportIn == ChargerReport.Ready; guarantee factsToEligibility.chargerUsable == true and factsToEligibility.chargerConnected == true and factsToEligibility.chargerFault == false;
          case CHARGER_FAULTED: assume reportIn == ChargerReport.Faulted; guarantee factsToEligibility.chargerUsable == false and factsToEligibility.chargerConnected == true and factsToEligibility.chargerFault == true;
          case CHARGER_UNKNOWN: assume reportIn == ChargerReport.Unknown; guarantee factsToEligibility.chargerUsable == false and factsToEligibility.chargerConnected == false and factsToEligibility.chargerFault == true;
    }*/

                        
                
                        
                                                                                            
                                                
                                                   
                                                               
             
                         
                                                                                                     
                                                                
                     
                          
                                                                                
                                                          
                                                            
                                                               
                                                          
                          
                                                             
                                                   
                                                        
                                                           
                                                          
                          
                                                                               
                                                     
                                                            
                                                           
                                                      
                          
                                                                 
                                                     
                                                            
                                                               
                                                      
       
  }
  part def ChargingInterfaceEvidenceQualifier :> Thread {
    port reportIn : DataPort { in :>> type : ChargeInterfaceReport; }
    port factsToEligibility : DataPort { out :>> type : InterfaceFacts; }
    port factsToSession : DataPort { out :>> type : InterfaceFacts; }
    port faultToAggregation : DataPort { out :>> type : Boolean; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_INTERFACE_FACTS: factsToEligibility.interfaceHealthy == false and factsToEligibility.activityObserved == false and factsToEligibility.interfaceFault == true and factsToSession.interfaceHealthy == false and factsToSession.activityObserved == false and factsToSession.interfaceFault == true and faultToAggregation == true;
      compute
        guarantee INTERFACE_PUBLICATIONS_AGREE: factsToEligibility.interfaceHealthy == factsToSession.interfaceHealthy and factsToEligibility.activityObserved == factsToSession.activityObserved and factsToEligibility.interfaceFault == factsToSession.interfaceFault and faultToAggregation == factsToEligibility.interfaceFault;
        compute_cases
          case INTERFACE_IDLE: assume reportIn == ChargeInterfaceReport.Idle; guarantee factsToEligibility.interfaceHealthy == true and factsToEligibility.activityObserved == false and factsToEligibility.interfaceFault == false;
          case INTERFACE_ACTIVE: assume reportIn == ChargeInterfaceReport.Active; guarantee factsToEligibility.interfaceHealthy == true and factsToEligibility.activityObserved == true and factsToEligibility.interfaceFault == false;
          case INTERFACE_FAULTED: assume reportIn == ChargeInterfaceReport.Faulted; guarantee factsToEligibility.interfaceHealthy == false and factsToEligibility.activityObserved == false and factsToEligibility.interfaceFault == true;
          case INTERFACE_UNKNOWN: assume reportIn == ChargeInterfaceReport.Unknown; guarantee factsToEligibility.interfaceHealthy == false and factsToEligibility.activityObserved == false and factsToEligibility.interfaceFault == true;
    }*/

                        
                
                        
                                                                                                            
                                                   
                                                   
                                             
                                               
                                               
                                                             
             
                         
                                                                                                                               
                                                                                  
                                                                                  
                                                                              
                                                                  
                     
                          
                                                                          
                                                          
                                                           
                                                               
                                                            
                          
                                                                           
                                                            
                                                           
                                                           
                                                            
                          
                                                                    
                                                             
                                                               
                                                               
                                                        
                          
                                                                    
                                                             
                                                               
                                                               
                                                        
       
  }
  part def LifecycleContextApplicabilityOwner :> Thread {
    port reportIn : DataPort { in :>> type : LifecycleReportValue; }
    port factsToEligibility : DataPort { out :>> type : LifecycleFacts; }
    port factsToAdvisory : DataPort { out :>> type : LifecycleFacts; }
    port faultToAggregation : DataPort { out :>> type : Boolean; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_LIFECYCLE_FACTS: factsToEligibility.chargeContextAllowed == false and factsToEligibility.airborneContext == false and factsToEligibility.contextValid == false and factsToEligibility.contextFault == true and factsToAdvisory.chargeContextAllowed == false and factsToAdvisory.airborneContext == false and factsToAdvisory.contextValid == false and factsToAdvisory.contextFault == true and faultToAggregation == true;
      compute
        guarantee LIFECYCLE_PUBLICATIONS_AGREE: factsToEligibility.chargeContextAllowed == factsToAdvisory.chargeContextAllowed and factsToEligibility.airborneContext == factsToAdvisory.airborneContext and factsToEligibility.contextValid == factsToAdvisory.contextValid and factsToEligibility.contextFault == factsToAdvisory.contextFault and faultToAggregation == factsToEligibility.contextFault;
        guarantee LIFECYCLE_VALIDITY: factsToEligibility.contextValid == (reportIn.validity == Validity.Valid) and factsToEligibility.contextFault == (reportIn.validity == Validity.Invalid);
        guarantee CHARGING_CONTEXT_APPLICABILITY: factsToEligibility.chargeContextAllowed == (reportIn.validity == Validity.Valid and (reportIn.phase == LifecyclePhase.Off or reportIn.phase == LifecyclePhase.Standby or reportIn.phase == LifecyclePhase.Charging));
        guarantee AIRBORNE_CONTEXT_APPLICABILITY: factsToEligibility.airborneContext == (reportIn.validity == Validity.Valid and reportIn.phase == LifecyclePhase.Flying);
    }*/

                        
                
                        
                                                                                                           
                                                       
                                                  
                                               
                                           
                                                    
                                               
                                            
                                                            
             
                         
                                                                                                                                 
                                                                                           
                                                                                 
                                                                           
                                                                           
                                                                
                        
                                                                                
                                                                                    
                                                                                     
                        
                                                                                                                
                                                    
                                                  
                                                    
                                                        
                                                          
                        
                                                                                         
                                               
                                                                                            
       
  }
  part def BatteryConfidenceStateOwner :> Thread {
    port qualificationIn : DataPort { in :>> type : BatteryQualification; }
    port stateToEligibility : DataPort { out :>> type : BatteryStateFacts; }
    port stateToAttention : DataPort { out :>> type : BatteryStateFacts; }
    port stateToAdvisory : DataPort { out :>> type : BatteryStateFacts; }
    port faultToAggregation : DataPort { out :>> type : Boolean; }

    language "GUMBO" /*{
      state
        confidenceState : BatteryConfidence;
      initialize modifies confidenceState;
        guarantee INITIAL_CONFIDENCE: confidenceState == BatteryConfidence.Untrusted and stateToEligibility.confidence == BatteryConfidence.Untrusted and stateToEligibility.band == QualifiedBand.Suppressed and stateToEligibility.chargeNeeded == false and stateToEligibility.batteryUsable == false and stateToEligibility.batteryFault == true and stateToEligibility.winningCase == ConfidenceCase.CONF_01 and stateToAttention == stateToEligibility and stateToAdvisory == stateToEligibility and faultToAggregation == true;
      compute modifies confidenceState;
        guarantee CONFIDENCE_PUBLICATIONS_AGREE: stateToEligibility.confidence == confidenceState and stateToAttention == stateToEligibility and stateToAdvisory == stateToEligibility and faultToAggregation == stateToEligibility.batteryFault;
        guarantee CONFIDENCE_DERIVED_FACTS: stateToEligibility.band == qualificationIn.band and stateToEligibility.batteryUsable == (confidenceState == BatteryConfidence.Trusted) and stateToEligibility.batteryFault == (qualificationIn.validEvidence == false) and stateToEligibility.chargeNeeded == (confidenceState == BatteryConfidence.Trusted and qualificationIn.band != QualifiedBand.Full);
        compute_cases
          case CONF_01_INVALID: assume qualificationIn.validEvidence == false; guarantee confidenceState == BatteryConfidence.Untrusted and stateToEligibility.winningCase == ConfidenceCase.CONF_01;
          case CONF_02_FIRST_VALID: assume qualificationIn.validEvidence == true and In(confidenceState) == BatteryConfidence.Untrusted; guarantee confidenceState == BatteryConfidence.Confirming and stateToEligibility.winningCase == ConfidenceCase.CONF_02;
          case CONF_03_SECOND_VALID: assume qualificationIn.validEvidence == true and In(confidenceState) == BatteryConfidence.Confirming; guarantee confidenceState == BatteryConfidence.Trusted and stateToEligibility.winningCase == ConfidenceCase.CONF_03;
          case CONF_04_RETAIN_TRUST: assume qualificationIn.validEvidence == true and In(confidenceState) == BatteryConfidence.Trusted; guarantee confidenceState == BatteryConfidence.Trusted and stateToEligibility.winningCase == ConfidenceCase.CONF_04;
    }*/

                        
           
                          
                                           
                
                                 
                        
                                                                                                                    
                                                          
                                                                        
                                                               
                                               
                                                
                                           
                                                                    
                                                                      
                                                             
                                             
                                              
                                         
                                                                  
                                                                     
                                                            
                                            
                                             
                                        
                                                                 
                             
             
                                 
                         
                                                                                                            
                                                            
                                                                        
                                                            
                                                                            
                                                                              
                                                                            
                                                                          
                                                                       
                                                           
                                                                           
                                                                             
                                                                           
                                                                         
                                                                
                        
                                                                                                                               
                                                           
                                                                                              
                                                                                  
                                            
                                                                                                        
                     
                                
                                                                                
                                                     
                                                                      
                                                                               
                                
                                                                                           
                                                                                                      
                                                                       
                                                                               
                                
                                                                                                       
                                                                                                       
                                                                    
                                                                               
                                
                                                                     
                                                                                                    
                                                                    
                                                                               
       
  }
  part def ChargeEligibilityDecisionOwner :> Thread {
    port chargerIn : DataPort { in :>> type : ChargerFacts; }
    port interfaceIn : DataPort { in :>> type : InterfaceFacts; }
    port lifecycleIn : DataPort { in :>> type : LifecycleFacts; }
    port batteryIn : DataPort { in :>> type : BatteryStateFacts; }
    port eligibilityToAdvisory : DataPort { out :>> type : ChargeEligibility; }
    port eligibilityToSession : DataPort { out :>> type : ChargeEligibility; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_ELIGIBILITY: eligibilityToAdvisory == ChargeEligibility.Blocked and eligibilityToSession == ChargeEligibility.Blocked;
      compute
        guarantee ELIGIBILITY_PUBLICATIONS_AGREE: eligibilityToAdvisory == eligibilityToSession;
        compute_cases
          case ELIGIBILITY_BLOCKED: assume batteryIn.confidence != BatteryConfidence.Trusted or chargerIn.chargerUsable == false or interfaceIn.interfaceHealthy == false or lifecycleIn.chargeContextAllowed == false; guarantee eligibilityToAdvisory == ChargeEligibility.Blocked;
          case ELIGIBILITY_NOT_NEEDED: assume batteryIn.confidence == BatteryConfidence.Trusted and chargerIn.chargerUsable == true and interfaceIn.interfaceHealthy == true and lifecycleIn.chargeContextAllowed == true and batteryIn.band == QualifiedBand.Full; guarantee eligibilityToAdvisory == ChargeEligibility.NotNeeded;
          case ELIGIBILITY_PERMITTED: assume batteryIn.confidence == BatteryConfidence.Trusted and chargerIn.chargerUsable == true and interfaceIn.interfaceHealthy == true and lifecycleIn.chargeContextAllowed == true and batteryIn.band != QualifiedBand.Full; guarantee eligibilityToAdvisory == ChargeEligibility.Permitted;
    }*/

                        
                
                        
                                                                        
                                                              
                                                            
             
                         
                                                                                                   
                                                        
                     
                               
                                                                                  
                                                                      
                                                
                                                     
                                                        
                                                                         
                               
                                                                                        
                                                                      
                                                                           
                                                                                           
                                                                           
                               
                                                                                      
                                                                      
                                                                           
                                                                                           
                                                                           
       
  }
  part def AttentionLatchStateOwner :> Thread {
    port requestIn : DataPort { in :>> type : ServiceRequest; }
    port batteryIn : DataPort { in :>> type : BatteryStateFacts; }
    port resolutionToNotification : DataPort { out :>> type : AttentionResolution; }
    port clearedToRequestResult : DataPort { out :>> type : Boolean; }

    language "GUMBO" /*{
      state
        attentionState : AttentionState;
      initialize modifies attentionState;
        guarantee INITIAL_ATTENTION: attentionState == AttentionState.Attention and resolutionToNotification.newAttention == AttentionState.Attention and resolutionToNotification.cause == AttentionCause.Untrusted and resolutionToNotification.attentionClearedNow == false and resolutionToNotification.winningCase == AttentionCase.ATTN_01 and clearedToRequestResult == false;
      compute modifies attentionState;
        guarantee ATTENTION_PUBLICATION: resolutionToNotification.newAttention == attentionState and clearedToRequestResult == resolutionToNotification.attentionClearedNow;
        compute_cases
          case ATTN_01_UNTRUSTED: assume batteryIn.confidence != BatteryConfidence.Trusted; guarantee attentionState == AttentionState.Attention and resolutionToNotification.cause == AttentionCause.Untrusted and resolutionToNotification.attentionClearedNow == false and resolutionToNotification.winningCase == AttentionCase.ATTN_01;
          case ATTN_02_CRITICAL: assume batteryIn.confidence == BatteryConfidence.Trusted and batteryIn.band == QualifiedBand.Critical; guarantee attentionState == AttentionState.Attention and resolutionToNotification.cause == AttentionCause.Critical and resolutionToNotification.attentionClearedNow == false and resolutionToNotification.winningCase == AttentionCase.ATTN_02;
          case ATTN_03_LOW: assume batteryIn.confidence == BatteryConfidence.Trusted and batteryIn.band == QualifiedBand.Low; guarantee attentionState == AttentionState.Attention and resolutionToNotification.cause == AttentionCause.Low and resolutionToNotification.attentionClearedNow == false and resolutionToNotification.winningCase == AttentionCase.ATTN_03;
          case ATTN_04_FRESH_ACKNOWLEDGEMENT: assume batteryIn.confidence == BatteryConfidence.Trusted and batteryIn.band != QualifiedBand.Critical and batteryIn.band != QualifiedBand.Low and In(attentionState) == AttentionState.Attention and requestIn == ServiceRequest.AcknowledgeNotice; guarantee attentionState == AttentionState.Clear and resolutionToNotification.cause == AttentionCause.Clear and resolutionToNotification.attentionClearedNow == true and resolutionToNotification.winningCase == AttentionCase.ATTN_04;
          case ATTN_05_RECOVERY_PENDING: assume batteryIn.confidence == BatteryConfidence.Trusted and batteryIn.band != QualifiedBand.Critical and batteryIn.band != QualifiedBand.Low and In(attentionState) == AttentionState.Attention and requestIn != ServiceRequest.AcknowledgeNotice; guarantee attentionState == AttentionState.Attention and resolutionToNotification.cause == AttentionCause.RecoveryPending and resolutionToNotification.attentionClearedNow == false and resolutionToNotification.winningCase == AttentionCase.ATTN_05;
          case ATTN_06_RETAIN_CLEAR: assume batteryIn.confidence == BatteryConfidence.Trusted and batteryIn.band != QualifiedBand.Critical and batteryIn.band != QualifiedBand.Low and In(attentionState) == AttentionState.Clear; guarantee attentionState == AttentionState.Clear and resolutionToNotification.cause == AttentionCause.Clear and resolutionToNotification.attentionClearedNow == false and resolutionToNotification.winningCase == AttentionCase.ATTN_06;
    }*/

                        
           
                          
                                       
                
                                
                        
                                                                                  
                                                      
                                                                             
                                                                      
                                                            
                                                                         
                                     
             
                                
                         
                                                                                                               
                                                                   
                                                                                 
                     
                                
                                                                                      
                                                                     
                                                                  
                                                                                  
                                                                        
                                                                                    
                                
                                                                                       
                                                                      
                                                            
                                                                  
                                                                                 
                                                                        
                                                                                    
                                
                                                                        
                                                                      
                                                       
                                                                  
                                                                            
                                                                        
                                                                                    
                                
                                                                                                                               
                                                                      
                                                             
                                                        
                                                                   
                                                                 
                                                              
                                                                              
                                                                    
                                                                                    
                                
                                                                                                               
                                                                      
                                                             
                                                        
                                                                   
                                                                 
                                                                  
                                                                                        
                                                                        
                                                                                    
                                
                                                                             
                                                                      
                                                             
                                                        
                                                              
                                                              
                                                                              
                                                                        
                                                                                    
       
  }
  part def BatteryAdvisoryDecisionOwner :> Thread {
    port lifecycleIn : DataPort { in :>> type : LifecycleFacts; }
    port batteryIn : DataPort { in :>> type : BatteryStateFacts; }
    port eligibilityIn : DataPort { in :>> type : ChargeEligibility; }
    port advisoryToRequestResult : DataPort { out :>> type : AdvisoryFacts; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_ADVISORY: advisoryToRequestResult.advisoryValue == PilotAdvisory.ADVISORY_UNKNOWN;
      compute
        compute_cases
          case ADVISORY_UNKNOWN: assume batteryIn.confidence != BatteryConfidence.Trusted or lifecycleIn.contextValid == false; guarantee advisoryToRequestResult.advisoryValue == PilotAdvisory.ADVISORY_UNKNOWN;
          case ADVISORY_AIRBORNE_ATTENTION: assume batteryIn.confidence == BatteryConfidence.Trusted and lifecycleIn.contextValid == true and lifecycleIn.airborneContext == true and (batteryIn.band == QualifiedBand.Low or batteryIn.band == QualifiedBand.Critical); guarantee advisoryToRequestResult.advisoryValue == PilotAdvisory.AIRBORNE_ATTENTION;
          case ADVISORY_BATTERY_READY: assume batteryIn.confidence == BatteryConfidence.Trusted and lifecycleIn.contextValid == true and (batteryIn.band == QualifiedBand.Full or batteryIn.band == QualifiedBand.Nominal); guarantee advisoryToRequestResult.advisoryValue == PilotAdvisory.BATTERY_READY;
          case ADVISORY_CHARGE_QUALIFIED: assume batteryIn.confidence == BatteryConfidence.Trusted and lifecycleIn.contextValid == true and lifecycleIn.airborneContext == false and (batteryIn.band == QualifiedBand.Low or batteryIn.band == QualifiedBand.Critical) and eligibilityIn == ChargeEligibility.Permitted; guarantee advisoryToRequestResult.advisoryValue == PilotAdvisory.CHARGE_QUALIFIED;
          case ADVISORY_CHARGE_BLOCKED: assume batteryIn.confidence == BatteryConfidence.Trusted and lifecycleIn.contextValid == true and lifecycleIn.airborneContext == false and (batteryIn.band == QualifiedBand.Low or batteryIn.band == QualifiedBand.Critical) and eligibilityIn != ChargeEligibility.Permitted; guarantee advisoryToRequestResult.advisoryValue == PilotAdvisory.CHARGE_BLOCKED;
    }*/

                        
                
                        
                                                                              
                                                                                  
             
                     
                              
                                                                                                  
                                                                                                    
                                                                                              
                              
                                                                                                                      
                                                                                                 
                                                
                                                                                                    
                                                                                                
                              
                                                                                               
                                                                                                 
                                                                                                    
                                                                                           
                              
                                                                                                                    
                                                                                                 
                                                    
                                                                                                     
                                                                
                                                                                              
                              
                                                                                                                       
                                                                                                 
                                                    
                                                                                                     
                                                                
                                                                                            
       
  }
  part def FaultAggregationOwner :> Thread {
    port chargerFaultIn : DataPort { in :>> type : Boolean; }
    port interfaceFaultIn : DataPort { in :>> type : Boolean; }
    port contextFaultIn : DataPort { in :>> type : Boolean; }
    port batteryFaultIn : DataPort { in :>> type : Boolean; }
    port sessionConflictIn : DataPort { in :>> type : Boolean; }
    port faultsToNotification : DataPort { out :>> type : FaultFacts; }
    port faultsToComposition : DataPort { out :>> type : FaultFacts; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_FAULT_FACTS: faultsToNotification.vector.batteryFault == true and faultsToNotification.vector.chargerFault == true and faultsToNotification.vector.interfaceFault == true and faultsToNotification.vector.contextFault == true and faultsToNotification.vector.sessionConflict == false and faultsToNotification.aggregateFault == true and faultsToComposition == faultsToNotification;
      compute
        guarantee EXACT_FAULT_VECTOR: faultsToNotification.vector.batteryFault == batteryFaultIn and faultsToNotification.vector.chargerFault == chargerFaultIn and faultsToNotification.vector.interfaceFault == interfaceFaultIn and faultsToNotification.vector.contextFault == contextFaultIn and faultsToNotification.vector.sessionConflict == sessionConflictIn;
        guarantee EXACT_FAULT_DISJUNCTION: faultsToNotification.aggregateFault == (batteryFaultIn or chargerFaultIn or interfaceFaultIn or contextFaultIn or sessionConflictIn);
        guarantee FAULT_PUBLICATIONS_AGREE: faultsToComposition == faultsToNotification;
    }*/

                        
                
                        
                                                                                                                                   
                                                    
                                                    
                                                      
                                                    
                                                           
                                               
                                                   
                                                   
                                                     
                                                   
                                                          
                                             
             
                          
                                                                                             
                                                                      
                                                                      
                                                                          
                                                                      
                                                                           
                          
                                                                                                      
                                                
                                                                                                      
                         
                                                                                                                    
                                                                                               
                                                                                               
                                                                                                   
                                                                                               
                                                                                                     
                                                                                    
       
  }
  part def ChargeSessionPriorityStateOwner :> Thread {
    port requestIn : DataPort { in :>> type : ServiceRequest; }
    port interfaceIn : DataPort { in :>> type : InterfaceFacts; }
    port eligibilityIn : DataPort { in :>> type : ChargeEligibility; }
    port conflictToAggregation : DataPort { out :>> type : Boolean; }
    port resolutionToNotification : DataPort { out :>> type : SessionResolution; }

    language "GUMBO" /*{
      state
        sessionState : SourceChargeSession;
      initialize modifies sessionState;
        guarantee INITIAL_SESSION: sessionState == SourceChargeSession.Idle and conflictToAggregation == false and resolutionToNotification.sourceSession == SourceChargeSession.Idle and resolutionToNotification.newSession.sessionValue == ChargeSession.Idle and resolutionToNotification.sessionConflict == false and resolutionToNotification.winningCase == SessionCase.SESS_13;
      compute modifies sessionState;
        guarantee SESSION_PUBLICATION: (sessionState == SourceChargeSession.Idle and resolutionToNotification.newSession.sessionValue == ChargeSession.Idle or sessionState == SourceChargeSession.Eligible and resolutionToNotification.newSession.sessionValue == ChargeSession.Eligible or sessionState == SourceChargeSession.Authorized and resolutionToNotification.newSession.sessionValue == ChargeSession.Authorized or sessionState == SourceChargeSession.Suspended and resolutionToNotification.newSession.sessionValue == ChargeSession.Suspended) and resolutionToNotification.sessionConflict == (interfaceIn.activityObserved and In(sessionState) != SourceChargeSession.Authorized) and conflictToAggregation == resolutionToNotification.sessionConflict;
        guarantee SOURCE_SESSION_MAPPING: (In(sessionState) == SourceChargeSession.Idle and resolutionToNotification.sourceSession == SourceChargeSession.Idle) or (In(sessionState) == SourceChargeSession.Eligible and resolutionToNotification.sourceSession == SourceChargeSession.Eligible) or (In(sessionState) == SourceChargeSession.Authorized and resolutionToNotification.sourceSession == SourceChargeSession.Authorized) or (In(sessionState) == SourceChargeSession.Suspended and resolutionToNotification.sourceSession == SourceChargeSession.Suspended);
        compute_cases
          case SESS_01_UNEXPECTED_ACTIVITY: assume interfaceIn.activityObserved and In(sessionState) != SourceChargeSession.Authorized; guarantee sessionState == SourceChargeSession.Suspended and resolutionToNotification.winningCase == SessionCase.SESS_01;
          case SESS_02_BLOCKED: assume not (interfaceIn.activityObserved and In(sessionState) != SourceChargeSession.Authorized) and eligibilityIn == ChargeEligibility.Blocked; guarantee sessionState == SourceChargeSession.Suspended and resolutionToNotification.winningCase == SessionCase.SESS_02;
          case SESS_03_END_TO_ELIGIBLE: assume not (interfaceIn.activityObserved and In(sessionState) != SourceChargeSession.Authorized) and eligibilityIn == ChargeEligibility.Permitted and (In(sessionState) == SourceChargeSession.Authorized or In(sessionState) == SourceChargeSession.Suspended) and requestIn == ServiceRequest.EndCharge; guarantee sessionState == SourceChargeSession.Eligible and resolutionToNotification.winningCase == SessionCase.SESS_03;
          case SESS_04_END_TO_IDLE: assume not (interfaceIn.activityObserved and In(sessionState) != SourceChargeSession.Authorized) and eligibilityIn == ChargeEligibility.NotNeeded and (In(sessionState) == SourceChargeSession.Authorized or In(sessionState) == SourceChargeSession.Suspended) and requestIn == ServiceRequest.EndCharge; guarantee sessionState == SourceChargeSession.Idle and resolutionToNotification.winningCase == SessionCase.SESS_04;
          case SESS_05_AUTOMATIC_WITHDRAWAL: assume not (interfaceIn.activityObserved and In(sessionState) != SourceChargeSession.Authorized) and In(sessionState) == SourceChargeSession.Authorized and eligibilityIn == ChargeEligibility.NotNeeded and requestIn != ServiceRequest.EndCharge; guarantee sessionState == SourceChargeSession.Idle and resolutionToNotification.winningCase == SessionCase.SESS_05;
          case SESS_06_RETAIN_AUTHORIZED: assume not (interfaceIn.activityObserved and In(sessionState) != SourceChargeSession.Authorized) and In(sessionState) == SourceChargeSession.Authorized and eligibilityIn == ChargeEligibility.Permitted and requestIn != ServiceRequest.EndCharge; guarantee sessionState == SourceChargeSession.Authorized and resolutionToNotification.winningCase == SessionCase.SESS_06;
          case SESS_07_FRESH_SUSPENDED_RECOVERY: assume interfaceIn.activityObserved == false and In(sessionState) == SourceChargeSession.Suspended and eligibilityIn == ChargeEligibility.Permitted and requestIn == ServiceRequest.BeginCharge; guarantee sessionState == SourceChargeSession.Authorized and resolutionToNotification.winningCase == SessionCase.SESS_07;
          case SESS_08_RETAIN_SUSPENDED: assume interfaceIn.activityObserved == false and In(sessionState) == SourceChargeSession.Suspended and eligibilityIn != ChargeEligibility.Blocked and not ((requestIn == ServiceRequest.EndCharge and eligibilityIn == ChargeEligibility.Permitted) or (requestIn == ServiceRequest.EndCharge and eligibilityIn == ChargeEligibility.NotNeeded) or (requestIn == ServiceRequest.BeginCharge and eligibilityIn == ChargeEligibility.Permitted)); guarantee sessionState == SourceChargeSession.Suspended and resolutionToNotification.winningCase == SessionCase.SESS_08;
          case SESS_09_FRESH_ELIGIBLE_BEGIN: assume interfaceIn.activityObserved == false and In(sessionState) == SourceChargeSession.Eligible and eligibilityIn == ChargeEligibility.Permitted and requestIn == ServiceRequest.BeginCharge; guarantee sessionState == SourceChargeSession.Authorized and resolutionToNotification.winningCase == SessionCase.SESS_09;
          case SESS_10_ELIGIBLE_NOT_NEEDED: assume interfaceIn.activityObserved == false and In(sessionState) == SourceChargeSession.Eligible and eligibilityIn == ChargeEligibility.NotNeeded; guarantee sessionState == SourceChargeSession.Idle and resolutionToNotification.winningCase == SessionCase.SESS_10;
          case SESS_11_RETAIN_ELIGIBLE: assume interfaceIn.activityObserved == false and In(sessionState) == SourceChargeSession.Eligible and eligibilityIn == ChargeEligibility.Permitted and requestIn != ServiceRequest.BeginCharge; guarantee sessionState == SourceChargeSession.Eligible and resolutionToNotification.winningCase == SessionCase.SESS_11;
          case SESS_12_IDLE_TO_ELIGIBLE: assume interfaceIn.activityObserved == false and In(sessionState) == SourceChargeSession.Idle and eligibilityIn == ChargeEligibility.Permitted; guarantee sessionState == SourceChargeSession.Eligible and resolutionToNotification.winningCase == SessionCase.SESS_12;
          case SESS_13_RETAIN_IDLE: assume interfaceIn.activityObserved == false and In(sessionState) == SourceChargeSession.Idle and eligibilityIn == ChargeEligibility.NotNeeded; guarantee sessionState == SourceChargeSession.Idle and resolutionToNotification.winningCase == SessionCase.SESS_13;
    }*/

                        
           
                          
                                          
                
                              
                        
                                                                                                     
                                                    
                                     
                                                                              
                                                                                  
                                                        
                                                                      
             
                              
                         
                                                                                                  
                                                      
                                                                                     
                                                          
                                                                                         
                                                            
                                                                                           
                                                           
                                                                                           
                                                     
                                                                                                 
                                                                            
                         
                                                                                                                 
                                                          
                                                                                 
                                                              
                                                                                     
                                                                
                                                                                       
                                                               
                                                                                      
                     
                                
                                                                                      
                                                                                                     
                                                                     
                                                                                  
                                
                                                                                               
                                                                                                            
                                                              
                                                                     
                                                                                  
                                
                                                                                         
                                                                                                            
                                                                 
                                                                                                                             
                                                         
                                                                    
                                                                                  
                                
                                                                                 
                                                                                                            
                                                                 
                                                                                                                             
                                                         
                                                                
                                                                                  
                                
                                                                                                        
                                                                       
                                                                 
                                                         
                                                                
                                                                                  
                                
                                                                                         
                                                                       
                                                                 
                                                         
                                                                      
                                                                                  
                                
                                                                                                     
                                                     
                                                                      
                                                                 
                                                           
                                                                      
                                                                                  
                                
                                                                                                          
                                                     
                                                                      
                                                               
                                                                                                                
                                                                                                                
                                                                                                                  
                                                                     
                                                                                  
                                
                                                                                               
                                                     
                                                                     
                                                                 
                                                           
                                                                      
                                                                                  
                                
                                                                                                    
                                                     
                                                                     
                                                                
                                                                
                                                                                  
                                
                                                                                                
                                                     
                                                                     
                                                                 
                                                           
                                                                    
                                                                                  
                                
                                                                                 
                                                     
                                                                 
                                                                
                                                                    
                                                                                  
                                
                                                                  
                                                     
                                                                 
                                                                
                                                                
                                                                                  
       
  }
  part def NotificationCompositionOwner :> Thread {
    port attentionIn : DataPort { in :>> type : AttentionResolution; }
    port faultsIn : DataPort { in :>> type : FaultFacts; }
    port sessionIn : DataPort { in :>> type : SessionResolution; }
    port pilotNoticeOut : DataPort { out :>> type : PilotNotice; }
    port flightControlNoticeOut : DataPort { out :>> type : FlightControlNotice; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_NOTICES: pilotNoticeOut == PilotNotice.EvidenceUntrusted and flightControlNoticeOut == FlightControlNotice.EvidenceUntrusted;
      compute
        compute_cases
          case PILOT_EVIDENCE_UNTRUSTED: assume faultsIn.vector.batteryFault == true; guarantee pilotNoticeOut == PilotNotice.EvidenceUntrusted and flightControlNoticeOut == FlightControlNotice.EvidenceUntrusted;
          case PILOT_CRITICAL: assume faultsIn.vector.batteryFault == false and attentionIn.cause == AttentionCause.Critical; guarantee pilotNoticeOut == PilotNotice.Critical and flightControlNoticeOut == FlightControlNotice.Critical;
          case PILOT_LOW: assume faultsIn.vector.batteryFault == false and attentionIn.cause == AttentionCause.Low; guarantee pilotNoticeOut == PilotNotice.Low and flightControlNoticeOut == FlightControlNotice.Low;
          case PILOT_CHARGE_ATTENTION: assume faultsIn.vector.batteryFault == false and attentionIn.cause != AttentionCause.Critical and attentionIn.cause != AttentionCause.Low and (faultsIn.aggregateFault or sessionIn.newSession.sessionValue == ChargeSession.Suspended); guarantee pilotNoticeOut == PilotNotice.ChargeAttention;
          case PILOT_RECOVERY_PENDING: assume faultsIn.vector.batteryFault == false and attentionIn.cause != AttentionCause.Critical and attentionIn.cause != AttentionCause.Low and faultsIn.aggregateFault == false and sessionIn.newSession.sessionValue != ChargeSession.Suspended and attentionIn.newAttention == AttentionState.Attention; guarantee pilotNoticeOut == PilotNotice.RecoveryPending and flightControlNoticeOut == FlightControlNotice.RecoveryPending;
          case PILOT_CLEAR: assume faultsIn.vector.batteryFault == false and attentionIn.cause != AttentionCause.Critical and attentionIn.cause != AttentionCause.Low and faultsIn.aggregateFault == false and sessionIn.newSession.sessionValue != ChargeSession.Suspended and attentionIn.newAttention == AttentionState.Clear; guarantee pilotNoticeOut == PilotNotice.Clear and flightControlNoticeOut == FlightControlNotice.Clear;
          case FLIGHT_RECOVERY_PENDING: assume faultsIn.vector.batteryFault == false and attentionIn.cause != AttentionCause.Critical and attentionIn.cause != AttentionCause.Low and attentionIn.newAttention == AttentionState.Attention and (faultsIn.aggregateFault or sessionIn.newSession.sessionValue == ChargeSession.Suspended); guarantee flightControlNoticeOut == FlightControlNotice.RecoveryPending;
          case FLIGHT_CLEAR: assume faultsIn.vector.batteryFault == false and attentionIn.cause != AttentionCause.Critical and attentionIn.cause != AttentionCause.Low and attentionIn.newAttention == AttentionState.Clear and (faultsIn.aggregateFault or sessionIn.newSession.sessionValue == ChargeSession.Suspended); guarantee flightControlNoticeOut == FlightControlNotice.Clear;
    }*/

                        
                
                        
                                                                                          
                                                           
                                                                          
             
                               
                                                                                      
                                             
                                                                 
                               
                                                                                            
                                                                                                
                                                        
                               
                                                                                               
                                                                                           
                                                   
                               
                                                                                                              
                                                  
                                                              
                                                         
                                                                                                         
                                                               
                               
                                                                                                         
                                                  
                                                              
                                                         
                                             
                                                                              
                                                                     
                                                               
                               
                                                                         
                                                  
                                                              
                                                         
                                             
                                                                              
                                                                 
                                                     
                               
                                                                                                
                                             
                                                                                 
                               
                                                                                         
                                                                                                
                                                                        
                               
                                                                               
                                                                                           
                                                                   
                               
                                                                                                               
                                                  
                                                              
                                                         
                                                                     
                                                                               
                               
                                                                                   
                                                  
                                                              
                                                         
                                                                 
                                                                     
       
  }
  part def AuthorizationStatusCompositionOwner :> Thread {
    port publicFactsIn : DataPort { in :>> type : PublicDecisionFacts; }
    port faultsIn : DataPort { in :>> type : FaultFacts; }
    port pilotStatusOut : DataPort { out :>> type : PilotStatus; }
    port chargeAuthorizationOut : DataPort { out :>> type : ChargeAuthorization; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_PUBLIC_OUTCOMES: chargeAuthorizationOut == ChargeAuthorization.Denied and pilotStatusOut.statusAdvisory.advisoryValue == PilotAdvisory.ADVISORY_UNKNOWN and pilotStatusOut.statusSession.sessionValue == ChargeSession.Idle and pilotStatusOut.statusRequestResult.requestResultValue == RequestResult.None and pilotStatusOut.faults.batteryFault == true and pilotStatusOut.faults.chargerFault == true and pilotStatusOut.faults.interfaceFault == true and pilotStatusOut.faults.contextFault == true and pilotStatusOut.faults.sessionConflict == false and pilotStatusOut.aggregateFault == true;
      compute
        guarantee STATUS_PRESERVES_OWNER_FACTS: pilotStatusOut.statusAdvisory == publicFactsIn.advisory and pilotStatusOut.statusSession == publicFactsIn.newSession and pilotStatusOut.statusRequestResult == publicFactsIn.requestResult and pilotStatusOut.faults == faultsIn.vector and pilotStatusOut.aggregateFault == faultsIn.aggregateFault;
        compute_cases
          case AUTHORIZATION_PERMITTED: assume publicFactsIn.newSession.sessionValue == ChargeSession.Authorized and faultsIn.aggregateFault == false; guarantee chargeAuthorizationOut == ChargeAuthorization.Permitted;
          case AUTHORIZATION_DENIED: assume publicFactsIn.newSession.sessionValue != ChargeSession.Authorized or faultsIn.aggregateFault == true; guarantee chargeAuthorizationOut == ChargeAuthorization.Denied;
    }*/

                        
                
                        
                                                                                                                         
                                                                
                                                                                         
                                                                           
                                                                                       
                                              
                                              
                                                
                                              
                                                     
                                        
             
                         
                                                                                                                   
                                                                                               
                                                                                              
                                                                                                                   
                                                                              
                                                                              
                                                                                  
                                                                              
                                                                                    
                                                                   
                     
                               
                                                                                                              
                                                                                                                   
                                                                              
                               
                                                                                          
                                                                                                               
                                                                           
       
  }

  part def ChargeQualificationProcess :> Process {
    port serviceRequest : DataPort { in :>> type : ServiceRequest; }
    port batteryReport : DataPort { in :>> type : BatteryReportValue; }
    port chargerReport : DataPort { in :>> type : ChargerReport; }
    port chargeInterfaceReport : DataPort { in :>> type : ChargeInterfaceReport; }
    port lifecycleReport : DataPort { in :>> type : LifecycleReportValue; }
    port chargeAuthorization : DataPort { out :>> type : ChargeAuthorization; }
    port pilotNotice : DataPort { out :>> type : PilotNotice; }
    port flightControlNotice : DataPort { out :>> type : FlightControlNotice; }
    port pilotStatus : DataPort { out :>> type : PilotStatus; }

    part currentRequestResultDecisionOwner : CurrentRequestResultDecisionOwner;
    part batteryEvidenceQualifier : BatteryEvidenceQualifier;
    part chargerEvidenceQualifier : ChargerEvidenceQualifier;
    part chargingInterfaceEvidenceQualifier : ChargingInterfaceEvidenceQualifier;
    part lifecycleContextApplicabilityOwner : LifecycleContextApplicabilityOwner;
    part batteryConfidenceStateOwner : BatteryConfidenceStateOwner;
    part chargeEligibilityDecisionOwner : ChargeEligibilityDecisionOwner;
    part attentionLatchStateOwner : AttentionLatchStateOwner;
    part batteryAdvisoryDecisionOwner : BatteryAdvisoryDecisionOwner;
    part faultAggregationOwner : FaultAggregationOwner;
    part chargeSessionPriorityStateOwner : ChargeSessionPriorityStateOwner;
    part notificationCompositionOwner : NotificationCompositionOwner;
    part authorizationStatusCompositionOwner : AuthorizationStatusCompositionOwner;

    // Exactly 35 approved semantic interactions.
    connection int01 : PortConnection connect serviceRequest to currentRequestResultDecisionOwner.requestIn;
    connection int02 : PortConnection connect batteryReport to batteryEvidenceQualifier.reportIn;
    connection int03 : PortConnection connect chargerReport to chargerEvidenceQualifier.reportIn;
    connection int04 : PortConnection connect chargeInterfaceReport to chargingInterfaceEvidenceQualifier.reportIn;
    connection int05 : PortConnection connect lifecycleReport to lifecycleContextApplicabilityOwner.reportIn;
    connection int06 : PortConnection connect serviceRequest to attentionLatchStateOwner.requestIn;
    connection int07 : PortConnection connect serviceRequest to chargeSessionPriorityStateOwner.requestIn;
    connection int08 : PortConnection connect currentRequestResultDecisionOwner.publicFactsOut to authorizationStatusCompositionOwner.publicFactsIn;
    connection int09 : PortConnection connect batteryEvidenceQualifier.qualificationOut to batteryConfidenceStateOwner.qualificationIn;
    connection int10 : PortConnection connect chargerEvidenceQualifier.factsToEligibility to chargeEligibilityDecisionOwner.chargerIn;
    connection int11 : PortConnection connect chargerEvidenceQualifier.faultToAggregation to faultAggregationOwner.chargerFaultIn;
    connection int12 : PortConnection connect chargingInterfaceEvidenceQualifier.factsToEligibility to chargeEligibilityDecisionOwner.interfaceIn;
    connection int13 : PortConnection connect chargingInterfaceEvidenceQualifier.factsToSession to chargeSessionPriorityStateOwner.interfaceIn;
    connection int14 : PortConnection connect chargingInterfaceEvidenceQualifier.faultToAggregation to faultAggregationOwner.interfaceFaultIn;
    connection int15 : PortConnection connect lifecycleContextApplicabilityOwner.factsToEligibility to chargeEligibilityDecisionOwner.lifecycleIn;
    connection int16 : PortConnection connect lifecycleContextApplicabilityOwner.factsToAdvisory to batteryAdvisoryDecisionOwner.lifecycleIn;
    connection int17 : PortConnection connect lifecycleContextApplicabilityOwner.faultToAggregation to faultAggregationOwner.contextFaultIn;
    connection int18 : PortConnection connect batteryConfidenceStateOwner.stateToEligibility to chargeEligibilityDecisionOwner.batteryIn;
    connection int19 : PortConnection connect batteryConfidenceStateOwner.stateToAttention to attentionLatchStateOwner.batteryIn;
    connection int20 : PortConnection connect batteryConfidenceStateOwner.stateToAdvisory to batteryAdvisoryDecisionOwner.batteryIn;
    connection int21 : PortConnection connect batteryConfidenceStateOwner.faultToAggregation to faultAggregationOwner.batteryFaultIn;
    connection int22 : PortConnection connect chargeEligibilityDecisionOwner.eligibilityToAdvisory to batteryAdvisoryDecisionOwner.eligibilityIn;
    connection int23 : PortConnection connect chargeEligibilityDecisionOwner.eligibilityToSession to chargeSessionPriorityStateOwner.eligibilityIn;
    connection int24 : PortConnection connect attentionLatchStateOwner.resolutionToNotification to notificationCompositionOwner.attentionIn;
    connection int25 : PortConnection connect batteryAdvisoryDecisionOwner.advisoryToRequestResult to currentRequestResultDecisionOwner.advisoryIn;
    connection int26 : PortConnection connect faultAggregationOwner.faultsToNotification to notificationCompositionOwner.faultsIn;
    connection int27 : PortConnection connect faultAggregationOwner.faultsToComposition to authorizationStatusCompositionOwner.faultsIn;
    connection int28 : PortConnection connect chargeSessionPriorityStateOwner.conflictToAggregation to faultAggregationOwner.sessionConflictIn;
    connection int29 : PortConnection connect chargeSessionPriorityStateOwner.resolutionToNotification to notificationCompositionOwner.sessionIn;
    connection int30 : PortConnection connect chargeSessionPriorityStateOwner.resolutionToNotification to currentRequestResultDecisionOwner.sessionIn;
    connection int31 : PortConnection connect attentionLatchStateOwner.clearedToRequestResult to currentRequestResultDecisionOwner.attentionClearedIn;
    connection int32 : PortConnection connect notificationCompositionOwner.pilotNoticeOut to pilotNotice;
    connection int33 : PortConnection connect notificationCompositionOwner.flightControlNoticeOut to flightControlNotice;
    connection int34 : PortConnection connect authorizationStatusCompositionOwner.pilotStatusOut to pilotStatus;
    connection int35 : PortConnection connect authorizationStatusCompositionOwner.chargeAuthorizationOut to chargeAuthorization;
  }

  part def DroneBatteryChargeQualificationSystem :> System {
    port serviceRequest : DataPort { in :>> type : ServiceRequest; }
    port batteryReport : DataPort { in :>> type : BatteryReportValue; }
    port chargerReport : DataPort { in :>> type : ChargerReport; }
    port chargeInterfaceReport : DataPort { in :>> type : ChargeInterfaceReport; }
    port lifecycleReport : DataPort { in :>> type : LifecycleReportValue; }
    port chargeAuthorization : DataPort { out :>> type : ChargeAuthorization; }
    port pilotNotice : DataPort { out :>> type : PilotNotice; }
    port flightControlNotice : DataPort { out :>> type : FlightControlNotice; }
    port pilotStatus : DataPort { out :>> type : PilotStatus; }

    part chargeQualificationProcess : ChargeQualificationProcess;
    // Exactly nine transparent boundary delegations.
    connection support01 : PortConnection connect serviceRequest to chargeQualificationProcess.serviceRequest;
    connection support02 : PortConnection connect batteryReport to chargeQualificationProcess.batteryReport;
    connection support03 : PortConnection connect chargerReport to chargeQualificationProcess.chargerReport;
    connection support04 : PortConnection connect chargeInterfaceReport to chargeQualificationProcess.chargeInterfaceReport;
    connection support05 : PortConnection connect lifecycleReport to chargeQualificationProcess.lifecycleReport;
    connection support06 : PortConnection connect chargeQualificationProcess.chargeAuthorization to chargeAuthorization;
    connection support07 : PortConnection connect chargeQualificationProcess.pilotNotice to pilotNotice;
    connection support08 : PortConnection connect chargeQualificationProcess.flightControlNotice to flightControlNotice;
    connection support09 : PortConnection connect chargeQualificationProcess.pilotStatus to pilotStatus;
  }

  part droneBatteryChargeQualificationSupervisor : DroneBatteryChargeQualificationSystem;
}
