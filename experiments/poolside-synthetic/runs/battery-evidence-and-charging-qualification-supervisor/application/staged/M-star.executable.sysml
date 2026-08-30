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
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port requestIn : DataPort { in :>> type : ServiceRequest; }
    port attentionClearedIn : DataPort { in :>> type : Boolean; }
    port advisoryIn : DataPort { in :>> type : AdvisoryFacts; }
    port sessionIn : DataPort { in :>> type : SessionResolution; }
    port publicFactsOut : DataPort { out :>> type : PublicDecisionFacts; }

                        
                
                        
                                                                                                      
                                                                                
                        
                                                                                                             
                                                                                  
                        
                                                                                      
                                                                       

             
                         
                                                                                                                      
                                                                             
                                                                                      

                     
                              
                                                         
                                                    
                                                                                            
                              
                                                                                  
                                                                                                                   
                                                                                                
                              
                                                                             
                                                                                                                   
                                                                                                
                              
                                                                                              
                                                            
                                                                  
                                                                  
                                                                                                
                              
                                                                                                
                                                            
                                                                  
                                                                  
                                                                  
                                                                                                
                              
                                                                                    
                                                            
                                                                
                                                                                                
                              
                                                                     
                                                            
                                                                 
                                                                 
                                                                 
                                                                 
                                                                 
                                                                
                                                                                                
                              
                                                                                       
                                                          
                                                                  
                                                                  
                                                                                                
                              
                                                                     
                                                          
                                                                 
                                                                
                                                                                                
                              
                                                                                                 
                                                                                      
                                                                                                
                              
                                                                                         
                                                                                          
                                                                                                
       
  }
  part def BatteryEvidenceQualifier :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port reportIn : DataPort { in :>> type : BatteryReportValue; }
    port qualificationOut : DataPort { out :>> type : BatteryQualification; }

    language "GUMBO" /*{
                
                                                
                                                                                                      

      compute
        compute_cases
          case INVALID_BATTERY_REPORT:
            assume reportIn.validity == Validity.Invalid;
            guarantee qualificationOut.validEvidence == false & qualificationOut.band == QualifiedBand.Suppressed;
          case VALID_FULL_REPORT:
            assume reportIn.validity == Validity.Valid & reportIn.band == BatteryBand.Full;
            guarantee qualificationOut.validEvidence == true & qualificationOut.band == QualifiedBand.Full;
          case VALID_NOMINAL_REPORT:
            assume reportIn.validity == Validity.Valid & reportIn.band == BatteryBand.Nominal;
            guarantee qualificationOut.validEvidence == true & qualificationOut.band == QualifiedBand.Nominal;
          case VALID_LOW_REPORT:
            assume reportIn.validity == Validity.Valid & reportIn.band == BatteryBand.Low;
            guarantee qualificationOut.validEvidence == true & qualificationOut.band == QualifiedBand.Low;
          case VALID_CRITICAL_REPORT:
            assume reportIn.validity == Validity.Valid & reportIn.band == BatteryBand.Critical;
            guarantee qualificationOut.validEvidence == true & qualificationOut.band == QualifiedBand.Critical;
    }*/

  }
  part def ChargerEvidenceQualifier :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port reportIn : DataPort { in :>> type : ChargerReport; }
    port factsToEligibility : DataPort { out :>> type : ChargerFacts; }
    port faultToAggregation : DataPort { out :>> type : Boolean; }

    language "GUMBO" /*{
                
                                        
                                                     
                                                        
                                                   
                                     

      compute
        guarantee CHARGER_FAULT_PUBLICATION:
          faultToAggregation == factsToEligibility.chargerFault;
        compute_cases
          case CHARGER_DISCONNECTED:
            assume reportIn == ChargerReport.Disconnected;
            guarantee factsToEligibility.chargerUsable == false &
              factsToEligibility.chargerConnected == false &
              factsToEligibility.chargerFault == false;
          case CHARGER_READY:
            assume reportIn == ChargerReport.Ready;
            guarantee factsToEligibility.chargerUsable == true &
              factsToEligibility.chargerConnected == true &
              factsToEligibility.chargerFault == false;
          case CHARGER_FAULTED:
            assume reportIn == ChargerReport.Faulted;
            guarantee factsToEligibility.chargerUsable == false &
              factsToEligibility.chargerConnected == true &
              factsToEligibility.chargerFault == true;
          case CHARGER_UNKNOWN:
            assume reportIn == ChargerReport.Unknown;
            guarantee factsToEligibility.chargerUsable == false &
              factsToEligibility.chargerConnected == false &
              factsToEligibility.chargerFault == true;
    }*/

  }
  part def ChargingInterfaceEvidenceQualifier :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port reportIn : DataPort { in :>> type : ChargeInterfaceReport; }
    port factsToEligibility : DataPort { out :>> type : InterfaceFacts; }
    port factsToSession : DataPort { out :>> type : InterfaceFacts; }
    port faultToAggregation : DataPort { out :>> type : Boolean; }

    language "GUMBO" /*{
                
                                          
                                                        
                                                        
                                                     
                                                    
                                                    
                                                 
                                     

      compute
        guarantee INTERFACE_PUBLICATIONS_AGREE:
          factsToEligibility.interfaceHealthy == true implies factsToSession.interfaceHealthy == true &
          factsToEligibility.activityObserved == true implies factsToSession.activityObserved == true &
          factsToEligibility.interfaceFault == true implies factsToSession.interfaceFault == true &
          faultToAggregation == factsToEligibility.interfaceFault;
        compute_cases
          case INTERFACE_IDLE:
            assume reportIn == ChargeInterfaceReport.Idle;
            guarantee factsToEligibility.interfaceHealthy == true &
              factsToEligibility.activityObserved == false &
              factsToEligibility.interfaceFault == false;
          case INTERFACE_ACTIVE:
            assume reportIn == ChargeInterfaceReport.Active;
            guarantee factsToEligibility.interfaceHealthy == true &
              factsToEligibility.activityObserved == true &
              factsToEligibility.interfaceFault == false;
          case INTERFACE_FAULTED:
            assume reportIn == ChargeInterfaceReport.Faulted;
            guarantee factsToEligibility.interfaceHealthy == false &
              factsToEligibility.activityObserved == false &
              factsToEligibility.interfaceFault == true;
          case INTERFACE_UNKNOWN:
            assume reportIn == ChargeInterfaceReport.Unknown;
            guarantee factsToEligibility.interfaceHealthy == false &
              factsToEligibility.activityObserved == false &
              factsToEligibility.interfaceFault == true;
    }*/

  }
  part def LifecycleContextApplicabilityOwner :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port reportIn : DataPort { in :>> type : LifecycleReportValue; }
    port factsToEligibility : DataPort { out :>> type : LifecycleFacts; }
    port factsToAdvisory : DataPort { out :>> type : LifecycleFacts; }
    port faultToAggregation : DataPort { out :>> type : Boolean; }

    language "GUMBO" /*{
                
                                          
                                                            
                                                       
                                                    
                                                   
                                                         
                                                    
                                                 
                                                
                                     

      compute
        guarantee LIFECYCLE_PUBLICATIONS_AGREE:
          factsToEligibility.chargeContextAllowed == factsToAdvisory.chargeContextAllowed &
          factsToEligibility.airborneContext == factsToAdvisory.airborneContext &
          factsToEligibility.contextValid == factsToAdvisory.contextValid &
          factsToEligibility.contextFault == factsToAdvisory.contextFault &
          faultToAggregation == factsToEligibility.contextFault;
        guarantee LIFECYCLE_VALIDITY:
          factsToEligibility.contextValid == (reportIn.validity == Validity.Valid) &
          factsToEligibility.contextFault == (reportIn.validity == Validity.Invalid);
        guarantee CHARGING_CONTEXT_APPLICABILITY:
          factsToEligibility.chargeContextAllowed == (reportIn.validity == Validity.Valid &
            (reportIn.phase == LifecyclePhase.Off | reportIn.phase == LifecyclePhase.Standby | reportIn.phase == LifecyclePhase.Charging));
        guarantee AIRBORNE_CONTEXT_APPLICABILITY:
          factsToEligibility.airborneContext == (reportIn.validity == Validity.Valid & reportIn.phase == LifecyclePhase.Flying);
    }*/

  }
  part def BatteryConfidenceStateOwner :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port qualificationIn : DataPort { in :>> type : BatteryQualification; }
    port stateToEligibility : DataPort { out :>> type : BatteryStateFacts; }
    port stateToAttention : DataPort { out :>> type : BatteryStateFacts; }
    port stateToAdvisory : DataPort { out :>> type : BatteryStateFacts; }
    port faultToAggregation : DataPort { out :>> type : Boolean; }

                        
           
                          
                                           
                
                                 
                        
                                                                                                                    
                                                          
                                                                        
                                                               
                                               
                                                
                                           
                                                                    
                                                                      
                                                             
                                             
                                              
                                         
                                                                  
                                                                     
                                                            
                                            
                                             
                                        
                                                                 
                             
             
                                 
                         
                                                                                                            
                                                            
                                                                        
                                                            
                                                                            
                                                                              
                                                                            
                                                                          
                                                                       
                                                           
                                                                           
                                                                             
                                                                           
                                                                         
                                                                
                        
                                                                                                                               
                                                           
                                                                                              
                                                                                  
                                            
                                                                                                        
                     
                                
                                                                                
                                                     
                                                                      
                                                                               
                                
                                                                                           
                                                                                                      
                                                                       
                                                                               
                                
                                                                                                       
                                                                                                       
                                                                    
                                                                               
                                
                                                                     
                                                                                                    
                                                                    
                                                                               
       
  }
  part def ChargeEligibilityDecisionOwner :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port chargerIn : DataPort { in :>> type : ChargerFacts; }
    port interfaceIn : DataPort { in :>> type : InterfaceFacts; }
    port lifecycleIn : DataPort { in :>> type : LifecycleFacts; }
    port batteryIn : DataPort { in :>> type : BatteryStateFacts; }
    port eligibilityToAdvisory : DataPort { out :>> type : ChargeEligibility; }
    port eligibilityToSession : DataPort { out :>> type : ChargeEligibility; }

                        
                
                        
                                                                        
                                                              
                                                            
             
                         
                                                                                                   
                                                        
                     
                               
                                                                                  
                                                                      
                                                
                                                     
                                                        
                                                                         
                               
                                                                                        
                                                                      
                                                                           
                                                                                           
                                                                           
                               
                                                                                      
                                                                      
                                                                           
                                                                                           
                                                                           
       
  }
  part def AttentionLatchStateOwner :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port requestIn : DataPort { in :>> type : ServiceRequest; }
    port batteryIn : DataPort { in :>> type : BatteryStateFacts; }
    port resolutionToNotification : DataPort { out :>> type : AttentionResolution; }
    port clearedToRequestResult : DataPort { out :>> type : Boolean; }

                        
           
                          
                                       
                
                                
                        
                                                                                  
                                                      
                                                                             
                                                                      
                                                            
                                                                         
                                     
             
                                
                         
                                                                                                               
                                                                   
                                                                                 
                     
                                
                                                                                      
                                                                     
                                                                  
                                                                                  
                                                                        
                                                                                    
                                
                                                                                       
                                                                      
                                                            
                                                                  
                                                                                 
                                                                        
                                                                                    
                                
                                                                        
                                                                      
                                                       
                                                                  
                                                                            
                                                                        
                                                                                    
                                
                                                                                                                               
                                                                      
                                                             
                                                        
                                                                   
                                                                 
                                                              
                                                                              
                                                                    
                                                                                    
                                
                                                                                                               
                                                                      
                                                             
                                                        
                                                                   
                                                                 
                                                                  
                                                                                        
                                                                        
                                                                                    
                                
                                                                             
                                                                      
                                                             
                                                        
                                                              
                                                              
                                                                              
                                                                        
                                                                                    
       
  }
  part def BatteryAdvisoryDecisionOwner :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port lifecycleIn : DataPort { in :>> type : LifecycleFacts; }
    port batteryIn : DataPort { in :>> type : BatteryStateFacts; }
    port eligibilityIn : DataPort { in :>> type : ChargeEligibility; }
    port advisoryToRequestResult : DataPort { out :>> type : AdvisoryFacts; }

                        
                
                        
                                                                              
                                                                                  
             
                     
                              
                                                                                                  
                                                                                                    
                                                                                              
                              
                                                                                                                      
                                                                                                 
                                                
                                                                                                    
                                                                                                
                              
                                                                                               
                                                                                                 
                                                                                                    
                                                                                           
                              
                                                                                                                    
                                                                                                 
                                                    
                                                                                                     
                                                                
                                                                                              
                              
                                                                                                                       
                                                                                                 
                                                    
                                                                                                     
                                                                
                                                                                            
       
  }
  part def FaultAggregationOwner :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port chargerFaultIn : DataPort { in :>> type : Boolean; }
    port interfaceFaultIn : DataPort { in :>> type : Boolean; }
    port contextFaultIn : DataPort { in :>> type : Boolean; }
    port batteryFaultIn : DataPort { in :>> type : Boolean; }
    port sessionConflictIn : DataPort { in :>> type : Boolean; }
    port faultsToNotification : DataPort { out :>> type : FaultFacts; }
    port faultsToComposition : DataPort { out :>> type : FaultFacts; }

                        
                
                        
                                                                                                                                   
                                                    
                                                    
                                                      
                                                    
                                                           
                                               
                                                   
                                                   
                                                     
                                                   
                                                          
                                             
             
                          
                                                                                             
                                                                      
                                                                      
                                                                          
                                                                      
                                                                           
                          
                                                                                                      
                                                
                                                                                                      
                         
                                                                                                                    
                                                                                               
                                                                                               
                                                                                                   
                                                                                               
                                                                                                     
                                                                                    
       
  }
  part def ChargeSessionPriorityStateOwner :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port requestIn : DataPort { in :>> type : ServiceRequest; }
    port interfaceIn : DataPort { in :>> type : InterfaceFacts; }
    port eligibilityIn : DataPort { in :>> type : ChargeEligibility; }
    port conflictToAggregation : DataPort { out :>> type : Boolean; }
    port resolutionToNotification : DataPort { out :>> type : SessionResolution; }

                        
           
                          
                                          
                
                              
                        
                                                                                                     
                                                    
                                     
                                                                              
                                                                                  
                                                        
                                                                      
             
                              
                         
                                                                                                  
                                                      
                                                                                     
                                                          
                                                                                         
                                                            
                                                                                           
                                                           
                                                                                           
                                                     
                                                                                                 
                                                                            
                         
                                                                                                                 
                                                          
                                                                                 
                                                              
                                                                                     
                                                                
                                                                                       
                                                               
                                                                                      
                     
                                
                                                                                      
                                                                                                     
                                                                     
                                                                                  
                                
                                                                                               
                                                                                                            
                                                              
                                                                     
                                                                                  
                                
                                                                                         
                                                                                                            
                                                                 
                                                                                                                             
                                                         
                                                                    
                                                                                  
                                
                                                                                 
                                                                                                            
                                                                 
                                                                                                                             
                                                         
                                                                
                                                                                  
                                
                                                                                                        
                                                                       
                                                                 
                                                         
                                                                
                                                                                  
                                
                                                                                         
                                                                       
                                                                 
                                                         
                                                                      
                                                                                  
                                
                                                                                                     
                                                     
                                                                      
                                                                 
                                                           
                                                                      
                                                                                  
                                
                                                                                                          
                                                     
                                                                      
                                                               
                                                                                                                
                                                                                                                
                                                                                                                  
                                                                     
                                                                                  
                                
                                                                                               
                                                     
                                                                     
                                                                 
                                                           
                                                                      
                                                                                  
                                
                                                                                                    
                                                     
                                                                     
                                                                
                                                                
                                                                                  
                                
                                                                                                
                                                     
                                                                     
                                                                 
                                                           
                                                                    
                                                                                  
                                
                                                                                 
                                                     
                                                                 
                                                                
                                                                    
                                                                                  
                                
                                                                  
                                                     
                                                                 
                                                                
                                                                
                                                                                  
       
  }
  part def NotificationCompositionOwner :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port attentionIn : DataPort { in :>> type : AttentionResolution; }
    port faultsIn : DataPort { in :>> type : FaultFacts; }
    port sessionIn : DataPort { in :>> type : SessionResolution; }
    port pilotNoticeOut : DataPort { out :>> type : PilotNotice; }
    port flightControlNoticeOut : DataPort { out :>> type : FlightControlNotice; }

                        
                
                        
                                                                                          
                                                           
                                                                          
             
                               
                                                                                      
                                             
                                                                 
                               
                                                                                            
                                                                                                
                                                        
                               
                                                                                               
                                                                                           
                                                   
                               
                                                                                                              
                                                  
                                                              
                                                         
                                                                                                         
                                                               
                               
                                                                                                         
                                                  
                                                              
                                                         
                                             
                                                                              
                                                                     
                                                               
                               
                                                                         
                                                  
                                                              
                                                         
                                             
                                                                              
                                                                 
                                                     
                               
                                                                                                
                                             
                                                                                 
                               
                                                                                         
                                                                                                
                                                                        
                               
                                                                               
                                                                                           
                                                                   
                               
                                                                                                               
                                                  
                                                              
                                                         
                                                                     
                                                                               
                               
                                                                                   
                                                  
                                                              
                                                         
                                                                 
                                                                     
       
  }
  part def AuthorizationStatusCompositionOwner :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port publicFactsIn : DataPort { in :>> type : PublicDecisionFacts; }
    port faultsIn : DataPort { in :>> type : FaultFacts; }
    port pilotStatusOut : DataPort { out :>> type : PilotStatus; }
    port chargeAuthorizationOut : DataPort { out :>> type : ChargeAuthorization; }

                        
                
                        
                                                                                                                         
                                                                
                                                                                         
                                                                           
                                                                                       
                                              
                                              
                                                
                                              
                                                     
                                        
             
                         
                                                                                                                   
                                                                                               
                                                                                              
                                                                                                                   
                                                                              
                                                                              
                                                                                  
                                                                              
                                                                                    
                                                                   
                     
                               
                                                                                                              
                                                                                                                   
                                                                              
                               
                                                                                          
                                                                                                               
                                                                           
       
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
