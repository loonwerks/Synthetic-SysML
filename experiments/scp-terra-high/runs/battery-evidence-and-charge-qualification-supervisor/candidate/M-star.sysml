package Battery_Evidence_Charge_Qualification_Supervisor {
  private import HAMR::*;

  enum def BatteryCapacityBand {
    enum LOW;
    enum USABLE;
  }

  enum def BatteryCheck {
    enum INVALID;
    enum VALID;
  }

  enum def ChargerConnection {
    enum DISCONNECTED;
    enum CONNECTED;
  }

  enum def ChargeActivity {
    enum INACTIVE;
    enum ACTIVE;
  }

  enum def LifecycleContext {
    enum OFF;
    enum STANDBY;
    enum CHARGING;
    enum READY;
    enum FLYING;
  }

  enum def ChargeRequest {
    enum NO_REQUEST;
    enum REQUEST_CHARGE;
    enum CANCEL_CHARGE;
  }

  enum def ChargePermission {
    enum DISABLED;
    enum ENABLED;
  }

  enum def BatteryReadinessAdvice {
    enum UNAVAILABLE;
    enum NOT_READY;
    enum READY;
  }

  enum def FlightControlBatteryNotice {
    enum CLEAR;
    enum LOW_BATTERY;
    enum LOW_IN_FLIGHT_CONTEXT;
    enum EVIDENCE_UNAVAILABLE;
  }

  enum def BatteryAssessment {
    enum UNAVAILABLE;
    enum LOW;
    enum ADEQUATE;
  }

  enum def ChargerPathQualification {
    enum UNAVAILABLE;
    enum READY;
    enum ACTIVE;
  }

  enum def ChargeContextQualification {
    enum BLOCKED_EVIDENCE;
    enum BLOCKED_CONTEXT;
    enum ELIGIBLE;
  }

  enum def ChargeEligibilityEnvelope {
    enum ELIGIBLE;
    enum BLOCKED_EVIDENCE;
    enum RECOVER_EVIDENCE;
    enum BLOCKED_CHARGER;
    enum RECOVER_CHARGER;
    enum BLOCKED_CONTEXT;
    enum RECOVER_CONTEXT;
  }

  enum def ChargeDecision {
    enum NO_CHANGE;
    enum AUTHORIZE;
    enum TERMINATE;
    enum RECOVER_EVIDENCE;
    enum RECOVER_CHARGER;
    enum RECOVER_CONTEXT;
    enum REJECT_EVIDENCE;
    enum REJECT_CHARGER;
    enum REJECT_CONTEXT;
  }

  enum def ChargeSessionState {
    enum IDLE;
    enum ENABLED;
    enum SUSPENDED;
  }

  enum def ChargeDisposition {
    enum NO_CHANGE;
    enum ACCEPTED;
    enum REJECTED;
    enum RECOVERY_APPLIED;
  }

  enum def ChargeReason {
    enum NONE;
    enum CANCELLED;
    enum EVIDENCE_UNAVAILABLE;
    enum CHARGER_UNAVAILABLE;
    enum CONTEXT_INELIGIBLE;
  }

  enum def PilotAdvisory {
    enum NONE;
    enum EVIDENCE_UNAVAILABLE;
    enum CHARGER_UNAVAILABLE;
    enum CONTEXT_INELIGIBLE;
    enum ACTIVITY_WITHOUT_PERMISSION;
    enum CHARGE_RECOMMENDED;
    enum REQUEST_REJECTED;
  }

  enum def SnapshotPreSessionState {
    enum IDLE;
    enum ENABLED;
    enum SUSPENDED;
  }

  enum def SnapshotNextSessionState {
    enum IDLE;
    enum ENABLED;
    enum SUSPENDED;
  }

  enum def PilotSessionState {
    enum IDLE;
    enum ENABLED;
    enum SUSPENDED;
  }

  enum def SnapshotChargeDisposition {
    enum NO_CHANGE;
    enum ACCEPTED;
    enum REJECTED;
    enum RECOVERY_APPLIED;
  }

  enum def PilotChargeDisposition {
    enum NO_CHANGE;
    enum ACCEPTED;
    enum REJECTED;
    enum RECOVERY_APPLIED;
  }

  part def ChargeSessionSnapshot :> Data {
    attribute preSession : SnapshotPreSessionState;
    attribute nextSession : SnapshotNextSessionState;
    attribute disposition : SnapshotChargeDisposition;
    attribute reason : ChargeReason;
  }

  part def PilotBatteryStatus :> Data {
    attribute batteryAssessment : BatteryAssessment;
    attribute chargerPathQualification : ChargerPathQualification;
    attribute session : PilotSessionState;
    attribute disposition : PilotChargeDisposition;
    attribute advisory : PilotAdvisory;
  }

  part def BatteryEvidenceQualifier :> Thread {
    port batteryCapacity : DataPort { in :>> type : BatteryCapacityBand; }
    port batteryCheck : DataPort { in :>> type : BatteryCheck; }
    port batteryAssessment : DataPort { out :>> type : BatteryAssessment; }

    language "GUMBO" /*{
      initialize
        guarantee initial_assessment :
          batteryAssessment == BatteryAssessment.UNAVAILABLE;

      compute
        guarantee unavailable_assessment :
          batteryCheck != BatteryCheck.INVALID or
            batteryAssessment == BatteryAssessment.UNAVAILABLE;
        guarantee low_assessment :
          not (batteryCheck == BatteryCheck.VALID and batteryCapacity == BatteryCapacityBand.LOW) or
            batteryAssessment == BatteryAssessment.LOW;
        guarantee adequate_assessment :
          not (batteryCheck == BatteryCheck.VALID and batteryCapacity == BatteryCapacityBand.USABLE) or
            batteryAssessment == BatteryAssessment.ADEQUATE;
    }*/

                        
                
                 
                           
                                                                                          
                                                           
                                                                     
                                                                                                      
                                                             
                                                                                                         
                                                                 
             
                     
                           
                                                                                                
                                                        
                                                                         
                           
                                                                        
                                                                                                   
                                                                 
                           
                                                                                   
                                                                                                      
                                                                      
       
  }

  part def ChargeContextQualifier :> Thread {
    port batteryAssessment : DataPort { in :>> type : BatteryAssessment; }
    port lifecycleContext : DataPort { in :>> type : LifecycleContext; }
    port chargeContextQualification : DataPort { out :>> type : ChargeContextQualification; }
    port batteryReadinessAdvice : DataPort { out :>> type : BatteryReadinessAdvice; }

    language "GUMBO" /*{
      initialize
        guarantee initial_context : chargeContextQualification == ChargeContextQualification.BLOCKED_EVIDENCE;
        guarantee initial_readiness : batteryReadinessAdvice == BatteryReadinessAdvice.UNAVAILABLE;

      compute
        guarantee unavailable_context :
          batteryAssessment != BatteryAssessment.UNAVAILABLE or
            (chargeContextQualification == ChargeContextQualification.BLOCKED_EVIDENCE and
              batteryReadinessAdvice == BatteryReadinessAdvice.UNAVAILABLE);
        guarantee eligible_context :
          not (batteryAssessment != BatteryAssessment.UNAVAILABLE and
            (lifecycleContext == LifecycleContext.STANDBY or lifecycleContext == LifecycleContext.CHARGING)) or
            chargeContextQualification == ChargeContextQualification.ELIGIBLE;
        guarantee blocked_context :
          not (batteryAssessment != BatteryAssessment.UNAVAILABLE and
            (lifecycleContext == LifecycleContext.OFF or lifecycleContext == LifecycleContext.READY or lifecycleContext == LifecycleContext.FLYING)) or
            chargeContextQualification == ChargeContextQualification.BLOCKED_CONTEXT;
        guarantee low_readiness :
          batteryAssessment != BatteryAssessment.LOW or
            batteryReadinessAdvice == BatteryReadinessAdvice.NOT_READY;
        guarantee adequate_readiness :
          batteryAssessment != BatteryAssessment.ADEQUATE or
            batteryReadinessAdvice == BatteryReadinessAdvice.READY;
    }*/

                        
                
                 
                           
                                                                                                               
                                                                         
                                                                                          
                                                                               
                                                                  
                                                                                                                     
                                                                                    
                                                                  
                                                                                                      
                                                                    
                                                                                           
                                                                 
                                                                             
                                                                      
                                                                        
             
                     
                           
                                                                                       
                                                                      
                                                                                                 
                                                                           
                           
                                                                                                      
                                                                       
                                                                                                             
                                                                                         
                                                                   
                                                                               
                                                                        
                                                                          
                           
                                                                                                         
                                                                       
                                                                                                      
                                                            
                                                                                                
                                                                   
                                                                               
                                                                        
                                                                          
       
  }

  part def ChargerPathQualifier :> Thread {
    port chargerConnection : DataPort { in :>> type : ChargerConnection; }
    port chargeActivity : DataPort { in :>> type : ChargeActivity; }
    port chargerPathQualification : DataPort { out :>> type : ChargerPathQualification; }

    language "GUMBO" /*{
      initialize
        guarantee initial_path : chargerPathQualification == ChargerPathQualification.UNAVAILABLE;

      compute
        guarantee disconnected_path :
          chargerConnection != ChargerConnection.DISCONNECTED or
            chargerPathQualification == ChargerPathQualification.UNAVAILABLE;
        guarantee ready_path :
          not (chargerConnection == ChargerConnection.CONNECTED and chargeActivity == ChargeActivity.INACTIVE) or
            chargerPathQualification == ChargerPathQualification.READY;
        guarantee active_path :
          not (chargerConnection == ChargerConnection.CONNECTED and chargeActivity == ChargeActivity.ACTIVE) or
            chargerPathQualification == ChargerPathQualification.ACTIVE;
    }*/

                        
                
                 
                           
                                                                                              
                                                                          
                                                                                   
                                                                                                                   
                                                                             
                                                                                                                 
                                                                             
             
                     
                           
                                                                                                  
                                                                       
                                                                                       
                           
                                                                               
                                                                                                                
                                                                                 
                           
                                                                                                 
                                                                                                              
                                                                                  
       
  }

  part def ChargeEligibilityRecoveryOwner :> Thread {
    port chargeContextQualification : DataPort { in :>> type : ChargeContextQualification; }
    port chargerPathQualification : DataPort { in :>> type : ChargerPathQualification; }
    port currentChargeSession : DataPort { in :>> type : ChargeSessionState; }
    port chargeEligibilityEnvelope : DataPort { out :>> type : ChargeEligibilityEnvelope; }

    language "GUMBO" /*{
      initialize
        guarantee initial_envelope : chargeEligibilityEnvelope == ChargeEligibilityEnvelope.BLOCKED_EVIDENCE;

      compute
        guarantee blocked_evidence :
          not (chargeContextQualification == ChargeContextQualification.BLOCKED_EVIDENCE and
            currentChargeSession != ChargeSessionState.ENABLED) or
            chargeEligibilityEnvelope == ChargeEligibilityEnvelope.BLOCKED_EVIDENCE;
        guarantee recover_evidence :
          not (chargeContextQualification == ChargeContextQualification.BLOCKED_EVIDENCE and
            currentChargeSession == ChargeSessionState.ENABLED) or
            chargeEligibilityEnvelope == ChargeEligibilityEnvelope.RECOVER_EVIDENCE;
        guarantee blocked_charger :
          not (chargeContextQualification != ChargeContextQualification.BLOCKED_EVIDENCE and
            chargerPathQualification == ChargerPathQualification.UNAVAILABLE and
            currentChargeSession != ChargeSessionState.ENABLED) or
            chargeEligibilityEnvelope == ChargeEligibilityEnvelope.BLOCKED_CHARGER;
        guarantee recover_charger :
          not (chargeContextQualification != ChargeContextQualification.BLOCKED_EVIDENCE and
            chargerPathQualification == ChargerPathQualification.UNAVAILABLE and
            currentChargeSession == ChargeSessionState.ENABLED) or
            chargeEligibilityEnvelope == ChargeEligibilityEnvelope.RECOVER_CHARGER;
        guarantee blocked_context :
          not (chargeContextQualification == ChargeContextQualification.BLOCKED_CONTEXT and
            chargerPathQualification != ChargerPathQualification.UNAVAILABLE and
            currentChargeSession != ChargeSessionState.ENABLED) or
            chargeEligibilityEnvelope == ChargeEligibilityEnvelope.BLOCKED_CONTEXT;
        guarantee recover_context :
          not (chargeContextQualification == ChargeContextQualification.BLOCKED_CONTEXT and
            chargerPathQualification != ChargerPathQualification.UNAVAILABLE and
            currentChargeSession == ChargeSessionState.ENABLED) or
            chargeEligibilityEnvelope == ChargeEligibilityEnvelope.RECOVER_CONTEXT;
        guarantee eligible :
          not (chargeContextQualification == ChargeContextQualification.ELIGIBLE and
            chargerPathQualification != ChargerPathQualification.UNAVAILABLE) or
            chargeEligibilityEnvelope == ChargeEligibilityEnvelope.ELIGIBLE;
    }*/

                        
                
                 
                           
                                                                                                 
                                                                                         
                                                                         
                                                                                          
                                                                                         
                                                                         
                                                                                          
                                                                                         
                                                                                
                                                                         
                                                                                         
                                                                                         
                                                                                
                                                                         
                                                                                         
                                                                                        
                                                                                
                                                                         
                                                                                         
                                                                                        
                                                                                
                                                                         
                                                                                         
                                                                                 
                                                                                       
                                                                                 
             
                     
                           
                                                                                                      
                                                                                             
                     
                                                                           
                                                                                            
                                                                           
                                                                                           
                           
                                                                                            
                                                                                              
                                                                               
                     
                                                                           
                                                                                           
                                                                           
                                                                                          
                           
                                                                                                       
                                                                                             
                                                                               
                     
                                                                           
                                                                                           
                                                                           
                                                                                          
                           
                                                                                                             
                                                                                      
                                                                               
                                                                                      
       
  }

  part def ChargeIntentArbiter :> Thread {
    port chargeRequest : DataPort { in :>> type : ChargeRequest; }
    port chargeEligibilityEnvelope : DataPort { in :>> type : ChargeEligibilityEnvelope; }
    port chargeDecision : DataPort { out :>> type : ChargeDecision; }

    language "GUMBO" /*{
      initialize
        guarantee initial_decision : chargeDecision == ChargeDecision.NO_CHANGE;

      compute
        guarantee cancel_priority :
          chargeRequest != ChargeRequest.CANCEL_CHARGE or chargeDecision == ChargeDecision.TERMINATE;
        guarantee recover_evidence_priority :
          not (chargeRequest != ChargeRequest.CANCEL_CHARGE and
            chargeEligibilityEnvelope == ChargeEligibilityEnvelope.RECOVER_EVIDENCE) or
            chargeDecision == ChargeDecision.RECOVER_EVIDENCE;
        guarantee recover_charger_priority :
          not (chargeRequest != ChargeRequest.CANCEL_CHARGE and
            chargeEligibilityEnvelope == ChargeEligibilityEnvelope.RECOVER_CHARGER) or
            chargeDecision == ChargeDecision.RECOVER_CHARGER;
        guarantee recover_context_priority :
          not (chargeRequest != ChargeRequest.CANCEL_CHARGE and
            chargeEligibilityEnvelope == ChargeEligibilityEnvelope.RECOVER_CONTEXT) or
            chargeDecision == ChargeDecision.RECOVER_CONTEXT;
        guarantee authorize :
          not (chargeRequest == ChargeRequest.REQUEST_CHARGE and
            chargeEligibilityEnvelope == ChargeEligibilityEnvelope.ELIGIBLE) or
            chargeDecision == ChargeDecision.AUTHORIZE;
        guarantee reject_evidence :
          not (chargeRequest == ChargeRequest.REQUEST_CHARGE and
            chargeEligibilityEnvelope == ChargeEligibilityEnvelope.BLOCKED_EVIDENCE) or
            chargeDecision == ChargeDecision.REJECT_EVIDENCE;
        guarantee reject_charger :
          not (chargeRequest == ChargeRequest.REQUEST_CHARGE and
            chargeEligibilityEnvelope == ChargeEligibilityEnvelope.BLOCKED_CHARGER) or
            chargeDecision == ChargeDecision.REJECT_CHARGER;
        guarantee reject_context :
          not (chargeRequest == ChargeRequest.REQUEST_CHARGE and
            chargeEligibilityEnvelope == ChargeEligibilityEnvelope.BLOCKED_CONTEXT) or
            chargeDecision == ChargeDecision.REJECT_CONTEXT;
        guarantee no_change :
          not (chargeRequest == ChargeRequest.NO_REQUEST and
            chargeEligibilityEnvelope != ChargeEligibilityEnvelope.RECOVER_EVIDENCE and
            chargeEligibilityEnvelope != ChargeEligibilityEnvelope.RECOVER_CHARGER and
            chargeEligibilityEnvelope != ChargeEligibilityEnvelope.RECOVER_CONTEXT) or
            chargeDecision == ChargeDecision.NO_CHANGE;
    }*/

                        
                
                 
                           
                                                                                                                         
                                                                   
                                                             
                                                            
                                                                                              
                                                                    
                                                            
                                                                                             
                                                                   
                                                            
                                                                                             
                                                                   
                                                             
                                                                                      
                                                             
                                                             
                                                                                              
                                                                   
                                                             
                                                                                             
                                                                  
                                                             
                                                                                             
                                                                  
                                                         
                                                                                       
                                                                                      
                                                                                             
                                                            
             
                     
                           
                                                                                    
                                                                
                                                                 
                           
                                                                                             
                                                                 
                                                                                        
                                                                                       
                                                                                       
                     
                                                                                                
                                                                      
                                                                                               
                                                                     
                                                                                               
                                                                    
                           
                                                                                                     
                                                                 
                                                                                       
                                                                                      
                                                                                     
                     
                                                               
                                                                                        
                                                               
                                                               
                                                                                                
                                                                     
                                                               
                                                                                               
                                                                    
                                                               
                                                                                               
                                                                    
                                                                  
                                                              
       
  }

  part def ChargeSessionController :> Thread {
    port chargeDecision : DataPort { in :>> type : ChargeDecision; }
    port currentChargeSession : DataPort { out :>> type : ChargeSessionState; }
    port chargeSessionSnapshot : DataPort { out :>> type : ChargeSessionSnapshot; }
    port chargePermission : DataPort { out :>> type : ChargePermission; }

    language "GUMBO" /*{
      initialize
        guarantee initial_session : currentChargeSession == ChargeSessionState.IDLE;
        guarantee initial_permission : chargePermission == ChargePermission.DISABLED;
        guarantee initial_snapshot :
          chargeSessionSnapshot.preSession == SnapshotPreSessionState.IDLE and
          chargeSessionSnapshot.nextSession == SnapshotNextSessionState.IDLE and
          chargeSessionSnapshot.disposition == SnapshotChargeDisposition.NO_CHANGE and
          chargeSessionSnapshot.reason == ChargeReason.NONE;
    }*/

                        
           
                         
                                                    
                
                 
                           
                                                                                                                                      
                                                               
                                                             
                                                           
                                                                              
                                                                                
                                                                                      
                                                              
             
                 
                          
                                                                                                              
                                                               
                 
                           
                                                                                                          
                                                                            
                                                                                   
                                                                               
                                                                                      
                                                                                 
                                                                                       
                 
                           
                                                                                                                            
                                                                        
                                                                                   
                                                                
                                                                           
                                                                                      
                                                               
                                                                             
                                                                                        
                                                               
                 
                                
                                                                                                            
                                                                                                     
                                                                                  
                                                                                 
                                                                                
                     
                           
                                                                                                                                      
                                                               
                                                          
                                                                 
                                                                
                                                               
                     
                                                                   
                                                                       
                                                                                          
                                                                      
                                                                   
                                                                    
                                                                                          
                                                                           
                                                                          
                                                                         
                                                                                                  
                                                                                      
                                                                         
                                                                         
                                                                                                  
                                                                                     
                                                                         
                                                                         
                                                                                                  
                                                                                   
                           
                                                                                                                                   
                                                               
                                                                
                                                               
                                                              
                                                                            
                                                                   
                                                                                           
                                                                      
                                                                         
                                                                                          
                                                                                      
                                                                        
                                                                                          
                                                                                     
                                                                        
                                                                                          
                                                                                   
       
  }

  part def FlightControlBatteryNoticePolicy :> Thread {
    port batteryAssessment : DataPort { in :>> type : BatteryAssessment; }
    port lifecycleContext : DataPort { in :>> type : LifecycleContext; }
    port flightControlBatteryNotice : DataPort { out :>> type : FlightControlBatteryNotice; }

    language "GUMBO" /*{
      initialize
        guarantee initial_notice : flightControlBatteryNotice == FlightControlBatteryNotice.CLEAR;

      compute
        guarantee unavailable_notice :
          batteryAssessment != BatteryAssessment.UNAVAILABLE or
            flightControlBatteryNotice == FlightControlBatteryNotice.EVIDENCE_UNAVAILABLE;
        guarantee low_flying_notice :
          not (batteryAssessment == BatteryAssessment.LOW and lifecycleContext == LifecycleContext.FLYING) or
            flightControlBatteryNotice == FlightControlBatteryNotice.LOW_IN_FLIGHT_CONTEXT;
        guarantee low_notice :
          not (batteryAssessment == BatteryAssessment.LOW and lifecycleContext != LifecycleContext.FLYING) or
            flightControlBatteryNotice == FlightControlBatteryNotice.LOW_BATTERY;
        guarantee adequate_notice :
          batteryAssessment != BatteryAssessment.ADEQUATE or
            flightControlBatteryNotice == FlightControlBatteryNotice.CLEAR;
    }*/

                        
                
                 
                           
                                                                                                
                                                                         
                                                                                                
                                                                                                               
                                                                                                 
                                                                                                               
                                                                                       
                                                                      
                                                                                
             
                     
                           
                                                                                                                                          
                     
                                                                           
                                                                                                  
                                                                                                                 
                                                                                                   
                                                                                                                 
                                                                                         
                                                                        
                                                                                  
       
  }

  part def PilotBatteryStatusPolicy :> Thread {
    port batteryAssessment : DataPort { in :>> type : BatteryAssessment; }
    port chargerPathQualification : DataPort { in :>> type : ChargerPathQualification; }
    port chargeSessionSnapshot : DataPort { in :>> type : ChargeSessionSnapshot; }
    port pilotBatteryStatus : DataPort { out :>> type : PilotBatteryStatus; }

    language "GUMBO" /*{
      initialize
        guarantee initial_status :
          pilotBatteryStatus.batteryAssessment == BatteryAssessment.UNAVAILABLE and
          pilotBatteryStatus.chargerPathQualification == ChargerPathQualification.UNAVAILABLE and
          pilotBatteryStatus.session == PilotSessionState.IDLE and
          pilotBatteryStatus.disposition == PilotChargeDisposition.NO_CHANGE and
          pilotBatteryStatus.advisory == PilotAdvisory.EVIDENCE_UNAVAILABLE;

      compute
        guarantee assessment_projection :
          pilotBatteryStatus.batteryAssessment == batteryAssessment;
        guarantee path_projection :
          pilotBatteryStatus.chargerPathQualification == chargerPathQualification;
        guarantee idle_projection :
          chargeSessionSnapshot.nextSession != SnapshotNextSessionState.IDLE or
            pilotBatteryStatus.session == PilotSessionState.IDLE;
        guarantee enabled_projection :
          chargeSessionSnapshot.nextSession != SnapshotNextSessionState.ENABLED or
            pilotBatteryStatus.session == PilotSessionState.ENABLED;
        guarantee suspended_projection :
          chargeSessionSnapshot.nextSession != SnapshotNextSessionState.SUSPENDED or
            pilotBatteryStatus.session == PilotSessionState.SUSPENDED;
        guarantee unchanged_projection :
          chargeSessionSnapshot.disposition != SnapshotChargeDisposition.NO_CHANGE or
            pilotBatteryStatus.disposition == PilotChargeDisposition.NO_CHANGE;
        guarantee accepted_projection :
          chargeSessionSnapshot.disposition != SnapshotChargeDisposition.ACCEPTED or
            pilotBatteryStatus.disposition == PilotChargeDisposition.ACCEPTED;
        guarantee rejected_projection :
          chargeSessionSnapshot.disposition != SnapshotChargeDisposition.REJECTED or
            pilotBatteryStatus.disposition == PilotChargeDisposition.REJECTED;
        guarantee recovered_projection :
          chargeSessionSnapshot.disposition != SnapshotChargeDisposition.RECOVERY_APPLIED or
            pilotBatteryStatus.disposition == PilotChargeDisposition.RECOVERY_APPLIED;
        guarantee unavailable_advisory :
          batteryAssessment != BatteryAssessment.UNAVAILABLE or
            pilotBatteryStatus.advisory == PilotAdvisory.EVIDENCE_UNAVAILABLE;
        guarantee recovered_evidence_advisory :
          not (batteryAssessment != BatteryAssessment.UNAVAILABLE and
            chargeSessionSnapshot.disposition == SnapshotChargeDisposition.RECOVERY_APPLIED and
            chargeSessionSnapshot.reason == ChargeReason.EVIDENCE_UNAVAILABLE) or
            pilotBatteryStatus.advisory == PilotAdvisory.EVIDENCE_UNAVAILABLE;
        guarantee recovered_charger_advisory :
          not (batteryAssessment != BatteryAssessment.UNAVAILABLE and
            chargeSessionSnapshot.disposition == SnapshotChargeDisposition.RECOVERY_APPLIED and
            chargeSessionSnapshot.reason == ChargeReason.CHARGER_UNAVAILABLE) or
            pilotBatteryStatus.advisory == PilotAdvisory.CHARGER_UNAVAILABLE;
        guarantee recovered_context_advisory :
          not (batteryAssessment != BatteryAssessment.UNAVAILABLE and
            chargeSessionSnapshot.disposition == SnapshotChargeDisposition.RECOVERY_APPLIED and
            chargeSessionSnapshot.reason == ChargeReason.CONTEXT_INELIGIBLE) or
            pilotBatteryStatus.advisory == PilotAdvisory.CONTEXT_INELIGIBLE;
    }*/

                        
                
                 
                           
                                                                                                                     
                                                                       
                                                                                     
                                                                                         
                                                                       
                                                                                            
                                                                          
                                                                                              
                                                                            
                                                                                               
                                                                                     
                                                                                              
                                                                                    
                                                                                              
                                                                                    
                                                                                                      
                                                                                            
                                                                         
                                                                                    
                                                                  
                                                                                               
                                                                                        
                                                                                    
                                                                  
                                                                                               
                                                                                       
                                                                                   
                                                                  
                                                                                               
                                                                                      
                                                                                  
                                                                  
                                                                                                
                                                                                   
                                                                                  
                                                                                   
                                                                           
                                                                                            
                                                                                           
                                                          
                                                                                                
                                                                                   
                                                                                  
                                                                                   
                                                                            
                                                                                              
                                                                                  
                                                               
                                                                                                
                                                                                   
                                                                                  
                                                                                   
                                                                            
                                                                                       
                                                                                              
                                                                                
                                                               
                                                                                                
                                                                                   
                                                                                  
                                                                                   
                                                                            
                                                                                       
                                                                                              
                                                                   
             
                     
                           
                                                                                                                                              
                     
                                                                         
                                                                                       
                                                                                           
                                                                         
                                                                                              
                                                                            
                                                                                                
                                                                              
                                                                                                 
                                                                                       
                                                                                                
                                                                                      
                                                                                                
                                                                                      
                                                                                                        
                                                                                              
                                                                           
                                                                                      
                                                                    
                                                                                                 
                                                                                          
                                                                                      
                                                                    
                                                                                                 
                                                                                         
                                                                                     
                                                                    
                                                                                                 
                                                                                        
                                                                                    
                                                                    
                                                                                                  
                                                                                     
                                                                                    
                                                                                     
                                                                             
                                                                                              
                                                                                             
                                                            
                                                                                                  
                                                                                     
                                                                                    
                                                                                     
                                                                              
                                                                                                
                                                                                    
                                                                 
                                                                                                  
                                                                                     
                                                                                    
                                                                                     
                                                                              
                                                                                         
                                                                                                
                                                                                  
                                                                 
                                                                                                  
                                                                                     
                                                                                    
                                                                                     
                                                                              
                                                                                         
                                                                                                
                                                                     
       
  }

  part def SupervisorProcess :> Process {
    port batteryCapacity : DataPort { in :>> type : BatteryCapacityBand; }
    port batteryCheck : DataPort { in :>> type : BatteryCheck; }
    port chargerConnection : DataPort { in :>> type : ChargerConnection; }
    port chargeActivity : DataPort { in :>> type : ChargeActivity; }
    port lifecycleContext : DataPort { in :>> type : LifecycleContext; }
    port chargeRequest : DataPort { in :>> type : ChargeRequest; }
    port chargePermission : DataPort { out :>> type : ChargePermission; }
    port batteryReadinessAdvice : DataPort { out :>> type : BatteryReadinessAdvice; }
    port flightControlBatteryNotice : DataPort { out :>> type : FlightControlBatteryNotice; }
    port pilotBatteryStatus : DataPort { out :>> type : PilotBatteryStatus; }

    part batteryEvidenceQualifier : BatteryEvidenceQualifier;
    part chargeContextQualifier : ChargeContextQualifier;
    part chargerPathQualifier : ChargerPathQualifier;
    part chargeEligibilityRecoveryOwner : ChargeEligibilityRecoveryOwner;
    part chargeIntentArbiter : ChargeIntentArbiter;
    part chargeSessionController : ChargeSessionController;
    part flightControlBatteryNoticePolicy : FlightControlBatteryNoticePolicy;
    part pilotBatteryStatusPolicy : PilotBatteryStatusPolicy;

    connection int01 : PortConnection connect batteryCapacity to batteryEvidenceQualifier.batteryCapacity;
    connection int02 : PortConnection connect batteryCheck to batteryEvidenceQualifier.batteryCheck;
    connection int03 : PortConnection connect chargerConnection to chargerPathQualifier.chargerConnection;
    connection int04 : PortConnection connect chargeActivity to chargerPathQualifier.chargeActivity;
    connection int05 : PortConnection connect lifecycleContext to chargeContextQualifier.lifecycleContext;
    connection int06 : PortConnection connect lifecycleContext to flightControlBatteryNoticePolicy.lifecycleContext;
    connection int07 : PortConnection connect chargeRequest to chargeIntentArbiter.chargeRequest;
    connection int08 : PortConnection connect batteryEvidenceQualifier.batteryAssessment to chargeContextQualifier.batteryAssessment;
    connection int09 : PortConnection connect batteryEvidenceQualifier.batteryAssessment to flightControlBatteryNoticePolicy.batteryAssessment;
    connection int10 : PortConnection connect batteryEvidenceQualifier.batteryAssessment to pilotBatteryStatusPolicy.batteryAssessment;
    connection int11 : PortConnection connect chargerPathQualifier.chargerPathQualification to chargeEligibilityRecoveryOwner.chargerPathQualification;
    connection int12 : PortConnection connect chargerPathQualifier.chargerPathQualification to pilotBatteryStatusPolicy.chargerPathQualification;
    connection int13 : PortConnection connect chargeContextQualifier.chargeContextQualification to chargeEligibilityRecoveryOwner.chargeContextQualification;
    connection int14 : PortConnection connect chargeSessionController.currentChargeSession to chargeEligibilityRecoveryOwner.currentChargeSession;
    connection int15 : PortConnection connect chargeEligibilityRecoveryOwner.chargeEligibilityEnvelope to chargeIntentArbiter.chargeEligibilityEnvelope;
    connection int16 : PortConnection connect chargeIntentArbiter.chargeDecision to chargeSessionController.chargeDecision;
    connection int17 : PortConnection connect chargeSessionController.chargeSessionSnapshot to pilotBatteryStatusPolicy.chargeSessionSnapshot;
    connection int18 : PortConnection connect chargeSessionController.chargePermission to chargePermission;
    connection int19 : PortConnection connect chargeContextQualifier.batteryReadinessAdvice to batteryReadinessAdvice;
    connection int20 : PortConnection connect flightControlBatteryNoticePolicy.flightControlBatteryNotice to flightControlBatteryNotice;
    connection int21 : PortConnection connect pilotBatteryStatusPolicy.pilotBatteryStatus to pilotBatteryStatus;
  }

  part def BatteryEvidenceChargeQualificationSupervisor :> System {
    port batteryCapacity : DataPort { in :>> type : BatteryCapacityBand; }
    port batteryCheck : DataPort { in :>> type : BatteryCheck; }
    port chargerConnection : DataPort { in :>> type : ChargerConnection; }
    port chargeActivity : DataPort { in :>> type : ChargeActivity; }
    port lifecycleContext : DataPort { in :>> type : LifecycleContext; }
    port chargeRequest : DataPort { in :>> type : ChargeRequest; }
    port chargePermission : DataPort { out :>> type : ChargePermission; }
    port batteryReadinessAdvice : DataPort { out :>> type : BatteryReadinessAdvice; }
    port flightControlBatteryNotice : DataPort { out :>> type : FlightControlBatteryNotice; }
    port pilotBatteryStatus : DataPort { out :>> type : PilotBatteryStatus; }

    part supervisorProcess : SupervisorProcess;

    connection supportBatteryCapacity : PortConnection connect batteryCapacity to supervisorProcess.batteryCapacity;
    connection supportBatteryCheck : PortConnection connect batteryCheck to supervisorProcess.batteryCheck;
    connection supportChargerConnection : PortConnection connect chargerConnection to supervisorProcess.chargerConnection;
    connection supportChargeActivity : PortConnection connect chargeActivity to supervisorProcess.chargeActivity;
    connection supportLifecycleContext : PortConnection connect lifecycleContext to supervisorProcess.lifecycleContext;
    connection supportChargeRequest : PortConnection connect chargeRequest to supervisorProcess.chargeRequest;
    connection supportChargePermission : PortConnection connect supervisorProcess.chargePermission to chargePermission;
    connection supportReadiness : PortConnection connect supervisorProcess.batteryReadinessAdvice to batteryReadinessAdvice;
    connection supportNotice : PortConnection connect supervisorProcess.flightControlBatteryNotice to flightControlBatteryNotice;
    connection supportPilotStatus : PortConnection connect supervisorProcess.pilotBatteryStatus to pilotBatteryStatus;
  }

  part batteryEvidenceChargeQualificationSupervisor : BatteryEvidenceChargeQualificationSupervisor;
}
