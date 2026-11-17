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
        // @trace INIT_BATTERY_ASSESSMENT
        guarantee initial_assessment:
          ((batteryCheck == BatteryCheck.INVALID) implies
            (batteryAssessment == BatteryAssessment.UNAVAILABLE)) &
          (((batteryCheck == BatteryCheck.VALID) &
            (batteryCapacity == BatteryCapacityBand.LOW)) implies
            (batteryAssessment == BatteryAssessment.LOW)) &
          (((batteryCheck == BatteryCheck.VALID) &
            (batteryCapacity == BatteryCapacityBand.USABLE)) implies
            (batteryAssessment == BatteryAssessment.ADEQUATE));

      compute
        compute_cases
          // @trace CASE_01_INVALID_EVIDENCE
          case invalid_evidence:
            assume batteryCheck == BatteryCheck.INVALID;
            guarantee batteryAssessment == BatteryAssessment.UNAVAILABLE;
          // @trace CASE_02_VALID_LOW
          case valid_low:
            assume (batteryCheck == BatteryCheck.VALID) &
              (batteryCapacity == BatteryCapacityBand.LOW);
            guarantee batteryAssessment == BatteryAssessment.LOW;
          // @trace CASE_03_VALID_USABLE
          case valid_usable:
            assume (batteryCheck == BatteryCheck.VALID) &
              (batteryCapacity == BatteryCapacityBand.USABLE);
            guarantee batteryAssessment == BatteryAssessment.ADEQUATE;
    }*/

                        
                
                 
                           
                                                                                          
                                                           
                                                                     
                                                                                                      
                                                             
                                                                                                         
                                                                 
             
                     
                           
                                                                                                
                                                        
                                                                         
                           
                                                                        
                                                                                                   
                                                                 
                           
                                                                                   
                                                                                                      
                                                                      
       
  }

  part def ChargeContextQualifier :> Thread {
    port batteryAssessment : DataPort { in :>> type : BatteryAssessment; }
    port lifecycleContext : DataPort { in :>> type : LifecycleContext; }
    port chargeContextQualification : DataPort { out :>> type : ChargeContextQualification; }
    port batteryReadinessAdvice : DataPort { out :>> type : BatteryReadinessAdvice; }
    language "GUMBO" /*{
      initialize
        // @trace INIT_CONTEXT_AND_READINESS
        guarantee initial_context_and_readiness:
          ((batteryAssessment == BatteryAssessment.UNAVAILABLE) implies
            ((chargeContextQualification == ChargeContextQualification.BLOCKED_EVIDENCE) &
              (batteryReadinessAdvice == BatteryReadinessAdvice.UNAVAILABLE))) &
          (((batteryAssessment != BatteryAssessment.UNAVAILABLE) &
            ((lifecycleContext == LifecycleContext.STANDBY) |
              (lifecycleContext == LifecycleContext.CHARGING))) implies
            (chargeContextQualification == ChargeContextQualification.ELIGIBLE)) &
          (((batteryAssessment != BatteryAssessment.UNAVAILABLE) &
            ((lifecycleContext == LifecycleContext.OFF) |
              (lifecycleContext == LifecycleContext.READY) |
              (lifecycleContext == LifecycleContext.FLYING))) implies
            (chargeContextQualification == ChargeContextQualification.BLOCKED_CONTEXT)) &
          ((batteryAssessment == BatteryAssessment.LOW) implies
            (batteryReadinessAdvice == BatteryReadinessAdvice.NOT_READY)) &
          ((batteryAssessment == BatteryAssessment.ADEQUATE) implies
            (batteryReadinessAdvice == BatteryReadinessAdvice.READY));

      compute
        compute_cases
          // @trace CASE_07_UNAVAILABLE
          case unavailable:
            assume batteryAssessment == BatteryAssessment.UNAVAILABLE;
            guarantee (chargeContextQualification == ChargeContextQualification.BLOCKED_EVIDENCE) &
              (batteryReadinessAdvice == BatteryReadinessAdvice.UNAVAILABLE);
          // @trace CASE_08_ELIGIBLE_CONTEXT
          case eligible_context:
            assume (batteryAssessment != BatteryAssessment.UNAVAILABLE) &
              ((lifecycleContext == LifecycleContext.STANDBY) |
                (lifecycleContext == LifecycleContext.CHARGING));
            guarantee (chargeContextQualification == ChargeContextQualification.ELIGIBLE) &
              ((batteryAssessment == BatteryAssessment.LOW) implies
                (batteryReadinessAdvice == BatteryReadinessAdvice.NOT_READY)) &
              ((batteryAssessment == BatteryAssessment.ADEQUATE) implies
                (batteryReadinessAdvice == BatteryReadinessAdvice.READY));
          // @trace CASE_09_BLOCKED_CONTEXT
          case blocked_context:
            assume (batteryAssessment != BatteryAssessment.UNAVAILABLE) &
              ((lifecycleContext == LifecycleContext.OFF) |
                (lifecycleContext == LifecycleContext.READY) |
                (lifecycleContext == LifecycleContext.FLYING));
            guarantee (chargeContextQualification == ChargeContextQualification.BLOCKED_CONTEXT) &
              ((batteryAssessment == BatteryAssessment.LOW) implies
                (batteryReadinessAdvice == BatteryReadinessAdvice.NOT_READY)) &
              ((batteryAssessment == BatteryAssessment.ADEQUATE) implies
                (batteryReadinessAdvice == BatteryReadinessAdvice.READY));
    }*/

                        
                
                 
                           
                                                                                                               
                                                                         
                                                                                          
                                                                               
                                                                  
                                                                                                                     
                                                                                    
                                                                  
                                                                                                      
                                                                    
                                                                                           
                                                                 
                                                                             
                                                                      
                                                                        
             
                     
                           
                                                                                       
                                                                      
                                                                                                 
                                                                           
                           
                                                                                                      
                                                                       
                                                                                                             
                                                                                         
                                                                   
                                                                               
                                                                        
                                                                          
                           
                                                                                                         
                                                                       
                                                                                                      
                                                            
                                                                                                
                                                                   
                                                                               
                                                                        
                                                                          
       
  }

  part def ChargerPathQualifier :> Thread {
    port chargerConnection : DataPort { in :>> type : ChargerConnection; }
    port chargeActivity : DataPort { in :>> type : ChargeActivity; }
    port chargerPathQualification : DataPort { out :>> type : ChargerPathQualification; }
    language "GUMBO" /*{
      initialize
        // @trace INIT_CHARGER_PATH
        guarantee initial_path:
          ((chargerConnection == ChargerConnection.DISCONNECTED) implies
            (chargerPathQualification == ChargerPathQualification.UNAVAILABLE)) &
          (((chargerConnection == ChargerConnection.CONNECTED) &
            (chargeActivity == ChargeActivity.INACTIVE)) implies
            (chargerPathQualification == ChargerPathQualification.READY)) &
          (((chargerConnection == ChargerConnection.CONNECTED) &
            (chargeActivity == ChargeActivity.ACTIVE)) implies
            (chargerPathQualification == ChargerPathQualification.ACTIVE));

      compute
        compute_cases
          // @trace CASE_04_DISCONNECTED
          case disconnected:
            assume chargerConnection == ChargerConnection.DISCONNECTED;
            guarantee chargerPathQualification == ChargerPathQualification.UNAVAILABLE;
          // @trace CASE_05_CONNECTED_INACTIVE
          case connected_inactive:
            assume (chargerConnection == ChargerConnection.CONNECTED) &
              (chargeActivity == ChargeActivity.INACTIVE);
            guarantee chargerPathQualification == ChargerPathQualification.READY;
          // @trace CASE_06_CONNECTED_ACTIVE
          case connected_active:
            assume (chargerConnection == ChargerConnection.CONNECTED) &
              (chargeActivity == ChargeActivity.ACTIVE);
            guarantee chargerPathQualification == ChargerPathQualification.ACTIVE;
    }*/

                        
                
                 
                           
                                                                                              
                                                                          
                                                                                   
                                                                                                                   
                                                                             
                                                                                                                 
                                                                             
             
                     
                           
                                                                                                  
                                                                       
                                                                                       
                           
                                                                               
                                                                                                                
                                                                                 
                           
                                                                                                 
                                                                                                              
                                                                                  
       
  }

  part def ChargeEligibilityRecoveryOwner :> Thread {
    port chargeContextQualification : DataPort { in :>> type : ChargeContextQualification; }
    port chargerPathQualification : DataPort { in :>> type : ChargerPathQualification; }
    port currentChargeSession : DataPort { in :>> type : ChargeSessionState; }
    port chargeEligibilityEnvelope : DataPort { out :>> type : ChargeEligibilityEnvelope; }
    language "GUMBO" /*{
      initialize
        // @trace INIT_ELIGIBILITY
        guarantee initial_eligibility:
          ((chargeContextQualification == ChargeContextQualification.BLOCKED_EVIDENCE) implies
            (((currentChargeSession == ChargeSessionState.ENABLED) implies
              (chargeEligibilityEnvelope == ChargeEligibilityEnvelope.RECOVER_EVIDENCE)) &
             ((currentChargeSession != ChargeSessionState.ENABLED) implies
              (chargeEligibilityEnvelope == ChargeEligibilityEnvelope.BLOCKED_EVIDENCE)))) &
          (((chargeContextQualification != ChargeContextQualification.BLOCKED_EVIDENCE) &
            (chargerPathQualification == ChargerPathQualification.UNAVAILABLE)) implies
            (((currentChargeSession == ChargeSessionState.ENABLED) implies
              (chargeEligibilityEnvelope == ChargeEligibilityEnvelope.RECOVER_CHARGER)) &
             ((currentChargeSession != ChargeSessionState.ENABLED) implies
              (chargeEligibilityEnvelope == ChargeEligibilityEnvelope.BLOCKED_CHARGER)))) &
          (((chargeContextQualification == ChargeContextQualification.BLOCKED_CONTEXT) &
            (chargerPathQualification != ChargerPathQualification.UNAVAILABLE)) implies
            (((currentChargeSession == ChargeSessionState.ENABLED) implies
              (chargeEligibilityEnvelope == ChargeEligibilityEnvelope.RECOVER_CONTEXT)) &
             ((currentChargeSession != ChargeSessionState.ENABLED) implies
              (chargeEligibilityEnvelope == ChargeEligibilityEnvelope.BLOCKED_CONTEXT)))) &
          (((chargeContextQualification == ChargeContextQualification.ELIGIBLE) &
            (chargerPathQualification != ChargerPathQualification.UNAVAILABLE)) implies
            (chargeEligibilityEnvelope == ChargeEligibilityEnvelope.ELIGIBLE));

      compute
        compute_cases
          // @trace CASE_10_EVIDENCE_PRECEDENCE
          case evidence_precedence:
            assume chargeContextQualification == ChargeContextQualification.BLOCKED_EVIDENCE;
            guarantee ((currentChargeSession == ChargeSessionState.ENABLED) implies
              (chargeEligibilityEnvelope == ChargeEligibilityEnvelope.RECOVER_EVIDENCE)) &
              ((currentChargeSession != ChargeSessionState.ENABLED) implies
                (chargeEligibilityEnvelope == ChargeEligibilityEnvelope.BLOCKED_EVIDENCE));
          // @trace CASE_11_CHARGER_PRECEDENCE
          case charger_precedence:
            assume (chargeContextQualification != ChargeContextQualification.BLOCKED_EVIDENCE) &
              (chargerPathQualification == ChargerPathQualification.UNAVAILABLE);
            guarantee ((currentChargeSession == ChargeSessionState.ENABLED) implies
              (chargeEligibilityEnvelope == ChargeEligibilityEnvelope.RECOVER_CHARGER)) &
              ((currentChargeSession != ChargeSessionState.ENABLED) implies
                (chargeEligibilityEnvelope == ChargeEligibilityEnvelope.BLOCKED_CHARGER));
          // @trace CASE_12_CONTEXT_RECOVERY
          case context_recovery:
            assume (chargeContextQualification == ChargeContextQualification.BLOCKED_CONTEXT) &
              (chargerPathQualification != ChargerPathQualification.UNAVAILABLE);
            guarantee ((currentChargeSession == ChargeSessionState.ENABLED) implies
              (chargeEligibilityEnvelope == ChargeEligibilityEnvelope.RECOVER_CONTEXT)) &
              ((currentChargeSession != ChargeSessionState.ENABLED) implies
                (chargeEligibilityEnvelope == ChargeEligibilityEnvelope.BLOCKED_CONTEXT));
          // @trace CASE_13_ELIGIBLE
          case eligible:
            assume (chargeContextQualification == ChargeContextQualification.ELIGIBLE) &
              (chargerPathQualification != ChargerPathQualification.UNAVAILABLE);
            guarantee chargeEligibilityEnvelope == ChargeEligibilityEnvelope.ELIGIBLE;
    }*/

                        
                
                 
                           
                                                                                                 
                                                                                         
                                                                         
                                                                                          
                                                                                         
                                                                         
                                                                                          
                                                                                         
                                                                                
                                                                         
                                                                                         
                                                                                         
                                                                                
                                                                         
                                                                                         
                                                                                        
                                                                                
                                                                         
                                                                                         
                                                                                        
                                                                                
                                                                         
                                                                                         
                                                                                 
                                                                                       
                                                                                 
             
                     
                           
                                                                                                      
                                                                                             
                     
                                                                           
                                                                                            
                                                                           
                                                                                           
                           
                                                                                            
                                                                                              
                                                                               
                     
                                                                           
                                                                                           
                                                                           
                                                                                          
                           
                                                                                                       
                                                                                             
                                                                               
                     
                                                                           
                                                                                           
                                                                           
                                                                                          
                           
                                                                                                             
                                                                                      
                                                                               
                                                                                      
       
  }

  part def ChargeIntentArbiter :> Thread {
    port chargeRequest : DataPort { in :>> type : ChargeRequest; }
    port chargeEligibilityEnvelope : DataPort { in :>> type : ChargeEligibilityEnvelope; }
    port chargeDecision : DataPort { out :>> type : ChargeDecision; }
    language "GUMBO" /*{
      initialize
        // @trace INIT_ARBITRATION
        guarantee initial_arbitration:
          ((chargeRequest == ChargeRequest.CANCEL_CHARGE) implies
            (chargeDecision == ChargeDecision.TERMINATE)) &
          (((chargeRequest != ChargeRequest.CANCEL_CHARGE) &
            (chargeEligibilityEnvelope == ChargeEligibilityEnvelope.RECOVER_EVIDENCE)) implies
            (chargeDecision == ChargeDecision.RECOVER_EVIDENCE)) &
          (((chargeRequest != ChargeRequest.CANCEL_CHARGE) &
            (chargeEligibilityEnvelope == ChargeEligibilityEnvelope.RECOVER_CHARGER)) implies
            (chargeDecision == ChargeDecision.RECOVER_CHARGER)) &
          (((chargeRequest != ChargeRequest.CANCEL_CHARGE) &
            (chargeEligibilityEnvelope == ChargeEligibilityEnvelope.RECOVER_CONTEXT)) implies
            (chargeDecision == ChargeDecision.RECOVER_CONTEXT)) &
          (((chargeRequest == ChargeRequest.REQUEST_CHARGE) &
            (chargeEligibilityEnvelope == ChargeEligibilityEnvelope.ELIGIBLE)) implies
            (chargeDecision == ChargeDecision.AUTHORIZE)) &
          (((chargeRequest == ChargeRequest.REQUEST_CHARGE) &
            (chargeEligibilityEnvelope == ChargeEligibilityEnvelope.BLOCKED_EVIDENCE)) implies
            (chargeDecision == ChargeDecision.REJECT_EVIDENCE)) &
          (((chargeRequest == ChargeRequest.REQUEST_CHARGE) &
            (chargeEligibilityEnvelope == ChargeEligibilityEnvelope.BLOCKED_CHARGER)) implies
            (chargeDecision == ChargeDecision.REJECT_CHARGER)) &
          (((chargeRequest == ChargeRequest.REQUEST_CHARGE) &
            (chargeEligibilityEnvelope == ChargeEligibilityEnvelope.BLOCKED_CONTEXT)) implies
            (chargeDecision == ChargeDecision.REJECT_CONTEXT)) &
          (((chargeRequest == ChargeRequest.NO_REQUEST) &
            (chargeEligibilityEnvelope != ChargeEligibilityEnvelope.RECOVER_EVIDENCE) &
            (chargeEligibilityEnvelope != ChargeEligibilityEnvelope.RECOVER_CHARGER) &
            (chargeEligibilityEnvelope != ChargeEligibilityEnvelope.RECOVER_CONTEXT)) implies
            (chargeDecision == ChargeDecision.NO_CHANGE));

      compute
        compute_cases
          // @trace CASE_14_CANCEL_PRIORITY
          case cancel_priority:
            assume chargeRequest == ChargeRequest.CANCEL_CHARGE;
            guarantee chargeDecision == ChargeDecision.TERMINATE;
          // @trace CASE_15_RECOVERY_PRIORITY
          case recovery_priority:
            assume (chargeRequest != ChargeRequest.CANCEL_CHARGE) &
              ((chargeEligibilityEnvelope == ChargeEligibilityEnvelope.RECOVER_EVIDENCE) |
                (chargeEligibilityEnvelope == ChargeEligibilityEnvelope.RECOVER_CHARGER) |
                (chargeEligibilityEnvelope == ChargeEligibilityEnvelope.RECOVER_CONTEXT));
            guarantee ((chargeEligibilityEnvelope == ChargeEligibilityEnvelope.RECOVER_EVIDENCE) implies
              (chargeDecision == ChargeDecision.RECOVER_EVIDENCE)) &
              ((chargeEligibilityEnvelope == ChargeEligibilityEnvelope.RECOVER_CHARGER) implies
                (chargeDecision == ChargeDecision.RECOVER_CHARGER)) &
              ((chargeEligibilityEnvelope == ChargeEligibilityEnvelope.RECOVER_CONTEXT) implies
                (chargeDecision == ChargeDecision.RECOVER_CONTEXT));
          // @trace CASE_16_REQUEST_OR_HOLD
          case request_or_hold:
            assume (chargeRequest != ChargeRequest.CANCEL_CHARGE) &
              (chargeEligibilityEnvelope != ChargeEligibilityEnvelope.RECOVER_EVIDENCE) &
              (chargeEligibilityEnvelope != ChargeEligibilityEnvelope.RECOVER_CHARGER) &
              (chargeEligibilityEnvelope != ChargeEligibilityEnvelope.RECOVER_CONTEXT);
            guarantee (((chargeRequest == ChargeRequest.REQUEST_CHARGE) &
              (chargeEligibilityEnvelope == ChargeEligibilityEnvelope.ELIGIBLE)) implies
              (chargeDecision == ChargeDecision.AUTHORIZE)) &
              (((chargeRequest == ChargeRequest.REQUEST_CHARGE) &
                (chargeEligibilityEnvelope == ChargeEligibilityEnvelope.BLOCKED_EVIDENCE)) implies
                (chargeDecision == ChargeDecision.REJECT_EVIDENCE)) &
              (((chargeRequest == ChargeRequest.REQUEST_CHARGE) &
                (chargeEligibilityEnvelope == ChargeEligibilityEnvelope.BLOCKED_CHARGER)) implies
                (chargeDecision == ChargeDecision.REJECT_CHARGER)) &
              (((chargeRequest == ChargeRequest.REQUEST_CHARGE) &
                (chargeEligibilityEnvelope == ChargeEligibilityEnvelope.BLOCKED_CONTEXT)) implies
                (chargeDecision == ChargeDecision.REJECT_CONTEXT)) &
              ((chargeRequest == ChargeRequest.NO_REQUEST) implies
                (chargeDecision == ChargeDecision.NO_CHANGE));
    }*/

                        
                
                 
                           
                                                                                                                         
                                                                   
                                                             
                                                            
                                                                                              
                                                                    
                                                            
                                                                                             
                                                                   
                                                            
                                                                                             
                                                                   
                                                             
                                                                                      
                                                             
                                                             
                                                                                              
                                                                   
                                                             
                                                                                             
                                                                  
                                                             
                                                                                             
                                                                  
                                                         
                                                                                       
                                                                                      
                                                                                             
                                                            
             
                     
                           
                                                                                    
                                                                
                                                                 
                           
                                                                                             
                                                                 
                                                                                        
                                                                                       
                                                                                       
                     
                                                                                                
                                                                      
                                                                                               
                                                                     
                                                                                               
                                                                    
                           
                                                                                                     
                                                                 
                                                                                       
                                                                                      
                                                                                     
                     
                                                               
                                                                                        
                                                               
                                                               
                                                                                                
                                                                     
                                                               
                                                                                               
                                                                    
                                                               
                                                                                               
                                                                    
                                                                  
                                                              
       
  }

  part def ChargeSessionController :> Thread {
    port chargeDecision : DataPort { in :>> type : ChargeDecision; }
    port currentChargeSession : DataPort { out :>> type : ChargeSessionState; }
    port chargeSessionSnapshot : DataPort { out :>> type : ChargeSessionSnapshot; }
    port chargePermission : DataPort { out :>> type : ChargePermission; }
    language "GUMBO" /*{
      state
        committedChargeSession: ChargeSessionState;

      initialize
        modifies committedChargeSession;
        // @trace INIT_SESSION_AND_OUTPUTS
        guarantee initial_session_and_outputs:
          (committedChargeSession == ChargeSessionState.IDLE) &
          (currentChargeSession == ChargeSessionState.IDLE) &
          (chargePermission == ChargePermission.DISABLED) &
          (chargeSessionSnapshot.preSession == SnapshotPreSessionState.IDLE) &
          (chargeSessionSnapshot.nextSession == SnapshotNextSessionState.IDLE) &
          (chargeSessionSnapshot.disposition == SnapshotChargeDisposition.NO_CHANGE) &
          (chargeSessionSnapshot.reason == ChargeReason.NONE);

      compute
        modifies committedChargeSession;
        // @trace PUBLISH_COMMITTED_PRE_STATE
        guarantee publish_committed_pre_state:
          currentChargeSession == In(committedChargeSession);
        // @trace PROJECT_PRE_SESSION
        guarantee project_pre_session:
          ((In(committedChargeSession) == ChargeSessionState.IDLE) implies
            (chargeSessionSnapshot.preSession == SnapshotPreSessionState.IDLE)) &
          ((In(committedChargeSession) == ChargeSessionState.ENABLED) implies
            (chargeSessionSnapshot.preSession == SnapshotPreSessionState.ENABLED)) &
          ((In(committedChargeSession) == ChargeSessionState.SUSPENDED) implies
            (chargeSessionSnapshot.preSession == SnapshotPreSessionState.SUSPENDED));
        // @trace PROJECT_NEXT_SESSION
        guarantee project_next_session:
          ((committedChargeSession == ChargeSessionState.IDLE) implies
            ((chargeSessionSnapshot.nextSession == SnapshotNextSessionState.IDLE) &
              (chargePermission == ChargePermission.DISABLED))) &
          ((committedChargeSession == ChargeSessionState.ENABLED) implies
            ((chargeSessionSnapshot.nextSession == SnapshotNextSessionState.ENABLED) &
              (chargePermission == ChargePermission.ENABLED))) &
          ((committedChargeSession == ChargeSessionState.SUSPENDED) implies
            ((chargeSessionSnapshot.nextSession == SnapshotNextSessionState.SUSPENDED) &
              (chargePermission == ChargePermission.DISABLED)));
        // @trace RECOVERY_REASON_INVARIANT
        guarantee recovery_reason:
          (chargeSessionSnapshot.disposition == SnapshotChargeDisposition.RECOVERY_APPLIED) implies
            ((chargeSessionSnapshot.reason == ChargeReason.EVIDENCE_UNAVAILABLE) |
              (chargeSessionSnapshot.reason == ChargeReason.CHARGER_UNAVAILABLE) |
              (chargeSessionSnapshot.reason == ChargeReason.CONTEXT_INELIGIBLE));

        compute_cases
          // @trace CASE_17_TRANSITIONING_DECISIONS
          case transitioning_decisions:
            assume (chargeDecision == ChargeDecision.AUTHORIZE) |
              (chargeDecision == ChargeDecision.TERMINATE) |
              (chargeDecision == ChargeDecision.RECOVER_EVIDENCE) |
              (chargeDecision == ChargeDecision.RECOVER_CHARGER) |
              (chargeDecision == ChargeDecision.RECOVER_CONTEXT);
            guarantee ((chargeDecision == ChargeDecision.AUTHORIZE) implies
              ((committedChargeSession == ChargeSessionState.ENABLED) &
                (chargeSessionSnapshot.disposition == SnapshotChargeDisposition.ACCEPTED) &
                (chargeSessionSnapshot.reason == ChargeReason.NONE))) &
              ((chargeDecision == ChargeDecision.TERMINATE) implies
                ((committedChargeSession == ChargeSessionState.IDLE) &
                  (chargeSessionSnapshot.disposition == SnapshotChargeDisposition.ACCEPTED) &
                  (chargeSessionSnapshot.reason == ChargeReason.CANCELLED))) &
              ((chargeDecision == ChargeDecision.RECOVER_EVIDENCE) implies
                ((committedChargeSession == ChargeSessionState.SUSPENDED) &
                  (chargeSessionSnapshot.disposition == SnapshotChargeDisposition.RECOVERY_APPLIED) &
                  (chargeSessionSnapshot.reason == ChargeReason.EVIDENCE_UNAVAILABLE))) &
              ((chargeDecision == ChargeDecision.RECOVER_CHARGER) implies
                ((committedChargeSession == ChargeSessionState.SUSPENDED) &
                  (chargeSessionSnapshot.disposition == SnapshotChargeDisposition.RECOVERY_APPLIED) &
                  (chargeSessionSnapshot.reason == ChargeReason.CHARGER_UNAVAILABLE))) &
              ((chargeDecision == ChargeDecision.RECOVER_CONTEXT) implies
                ((committedChargeSession == ChargeSessionState.SUSPENDED) &
                  (chargeSessionSnapshot.disposition == SnapshotChargeDisposition.RECOVERY_APPLIED) &
                  (chargeSessionSnapshot.reason == ChargeReason.CONTEXT_INELIGIBLE)));
          // @trace CASE_18_HOLDING_DECISIONS
          case holding_decisions:
            assume (chargeDecision == ChargeDecision.NO_CHANGE) |
              (chargeDecision == ChargeDecision.REJECT_EVIDENCE) |
              (chargeDecision == ChargeDecision.REJECT_CHARGER) |
              (chargeDecision == ChargeDecision.REJECT_CONTEXT);
            guarantee (committedChargeSession == In(committedChargeSession)) &
              ((chargeDecision == ChargeDecision.NO_CHANGE) implies
                ((chargeSessionSnapshot.disposition == SnapshotChargeDisposition.NO_CHANGE) &
                  (chargeSessionSnapshot.reason == ChargeReason.NONE))) &
              ((chargeDecision == ChargeDecision.REJECT_EVIDENCE) implies
                ((chargeSessionSnapshot.disposition == SnapshotChargeDisposition.REJECTED) &
                  (chargeSessionSnapshot.reason == ChargeReason.EVIDENCE_UNAVAILABLE))) &
              ((chargeDecision == ChargeDecision.REJECT_CHARGER) implies
                ((chargeSessionSnapshot.disposition == SnapshotChargeDisposition.REJECTED) &
                  (chargeSessionSnapshot.reason == ChargeReason.CHARGER_UNAVAILABLE))) &
              ((chargeDecision == ChargeDecision.REJECT_CONTEXT) implies
                ((chargeSessionSnapshot.disposition == SnapshotChargeDisposition.REJECTED) &
                  (chargeSessionSnapshot.reason == ChargeReason.CONTEXT_INELIGIBLE)));
    }*/

                        
           
                         
                                                    
                
                 
                           
                                                                                                                                      
                                                               
                                                             
                                                           
                                                                              
                                                                                
                                                                                      
                                                              
             
                 
                          
                                                                                                              
                                                               
                 
                           
                                                                                                          
                                                                            
                                                                                   
                                                                               
                                                                                      
                                                                                 
                                                                                       
                 
                           
                                                                                                                            
                                                                        
                                                                                   
                                                                
                                                                           
                                                                                      
                                                               
                                                                             
                                                                                        
                                                               
                 
                                
                                                                                                            
                                                                                                     
                                                                                  
                                                                                 
                                                                                
                     
                           
                                                                                                                                      
                                                               
                                                          
                                                                 
                                                                
                                                               
                     
                                                                   
                                                                       
                                                                                          
                                                                      
                                                                   
                                                                    
                                                                                          
                                                                           
                                                                          
                                                                         
                                                                                                  
                                                                                      
                                                                         
                                                                         
                                                                                                  
                                                                                     
                                                                         
                                                                         
                                                                                                  
                                                                                   
                           
                                                                                                                                   
                                                               
                                                                
                                                               
                                                              
                                                                            
                                                                   
                                                                                           
                                                                      
                                                                         
                                                                                          
                                                                                      
                                                                        
                                                                                          
                                                                                     
                                                                        
                                                                                          
                                                                                   
       
  }

  part def FlightControlBatteryNoticePolicy :> Thread {
    port batteryAssessment : DataPort { in :>> type : BatteryAssessment; }
    port lifecycleContext : DataPort { in :>> type : LifecycleContext; }
    port flightControlBatteryNotice : DataPort { out :>> type : FlightControlBatteryNotice; }
    language "GUMBO" /*{
      initialize
        // @trace INIT_NOTICE
        guarantee initial_notice:
          ((batteryAssessment == BatteryAssessment.UNAVAILABLE) implies
            (flightControlBatteryNotice == FlightControlBatteryNotice.EVIDENCE_UNAVAILABLE)) &
          (((batteryAssessment == BatteryAssessment.LOW) &
            (lifecycleContext == LifecycleContext.FLYING)) implies
            (flightControlBatteryNotice == FlightControlBatteryNotice.LOW_IN_FLIGHT_CONTEXT)) &
          (((batteryAssessment == BatteryAssessment.LOW) &
            (lifecycleContext != LifecycleContext.FLYING)) implies
            (flightControlBatteryNotice == FlightControlBatteryNotice.LOW_BATTERY)) &
          ((batteryAssessment == BatteryAssessment.ADEQUATE) implies
            (flightControlBatteryNotice == FlightControlBatteryNotice.CLEAR));

      compute
        compute_cases
          // @trace CASE_19_CONTEXTUAL_NOTICE
          case contextual_notice:
            guarantee ((batteryAssessment == BatteryAssessment.UNAVAILABLE) implies
              (flightControlBatteryNotice == FlightControlBatteryNotice.EVIDENCE_UNAVAILABLE)) &
              (((batteryAssessment == BatteryAssessment.LOW) &
                (lifecycleContext == LifecycleContext.FLYING)) implies
                (flightControlBatteryNotice == FlightControlBatteryNotice.LOW_IN_FLIGHT_CONTEXT)) &
              (((batteryAssessment == BatteryAssessment.LOW) &
                (lifecycleContext != LifecycleContext.FLYING)) implies
                (flightControlBatteryNotice == FlightControlBatteryNotice.LOW_BATTERY)) &
              ((batteryAssessment == BatteryAssessment.ADEQUATE) implies
                (flightControlBatteryNotice == FlightControlBatteryNotice.CLEAR));
    }*/

                        
                
                 
                           
                                                                                                
                                                                         
                                                                                                
                                                                                                               
                                                                                                 
                                                                                                               
                                                                                       
                                                                      
                                                                                
             
                     
                           
                                                                                                                                          
                     
                                                                           
                                                                                                  
                                                                                                                 
                                                                                                   
                                                                                                                 
                                                                                         
                                                                        
                                                                                  
       
  }

  part def PilotBatteryStatusPolicy :> Thread {
    port batteryAssessment : DataPort { in :>> type : BatteryAssessment; }
    port chargerPathQualification : DataPort { in :>> type : ChargerPathQualification; }
    port chargeSessionSnapshot : DataPort { in :>> type : ChargeSessionSnapshot; }
    port pilotBatteryStatus : DataPort { out :>> type : PilotBatteryStatus; }
    language "GUMBO" /*{
      initialize
        // @trace INIT_PILOT_STATUS
        guarantee initial_pilot_status:
          (pilotBatteryStatus.batteryAssessment == batteryAssessment) &
          (pilotBatteryStatus.chargerPathQualification == chargerPathQualification) &
          ((chargeSessionSnapshot.nextSession == SnapshotNextSessionState.IDLE) implies
            (pilotBatteryStatus.session == PilotSessionState.IDLE)) &
          ((chargeSessionSnapshot.nextSession == SnapshotNextSessionState.ENABLED) implies
            (pilotBatteryStatus.session == PilotSessionState.ENABLED)) &
          ((chargeSessionSnapshot.nextSession == SnapshotNextSessionState.SUSPENDED) implies
            (pilotBatteryStatus.session == PilotSessionState.SUSPENDED)) &
          ((chargeSessionSnapshot.disposition == SnapshotChargeDisposition.NO_CHANGE) implies
            (pilotBatteryStatus.disposition == PilotChargeDisposition.NO_CHANGE)) &
          ((chargeSessionSnapshot.disposition == SnapshotChargeDisposition.ACCEPTED) implies
            (pilotBatteryStatus.disposition == PilotChargeDisposition.ACCEPTED)) &
          ((chargeSessionSnapshot.disposition == SnapshotChargeDisposition.REJECTED) implies
            (pilotBatteryStatus.disposition == PilotChargeDisposition.REJECTED)) &
          ((chargeSessionSnapshot.disposition == SnapshotChargeDisposition.RECOVERY_APPLIED) implies
            (pilotBatteryStatus.disposition == PilotChargeDisposition.RECOVERY_APPLIED)) &
          ((batteryAssessment == BatteryAssessment.UNAVAILABLE) implies
            (pilotBatteryStatus.advisory == PilotAdvisory.EVIDENCE_UNAVAILABLE)) &
          (((batteryAssessment != BatteryAssessment.UNAVAILABLE) &
            (chargeSessionSnapshot.disposition == SnapshotChargeDisposition.RECOVERY_APPLIED) &
            (chargeSessionSnapshot.reason == ChargeReason.EVIDENCE_UNAVAILABLE)) implies
            (pilotBatteryStatus.advisory == PilotAdvisory.EVIDENCE_UNAVAILABLE)) &
          (((batteryAssessment != BatteryAssessment.UNAVAILABLE) &
            (chargeSessionSnapshot.disposition == SnapshotChargeDisposition.RECOVERY_APPLIED) &
            (chargeSessionSnapshot.reason == ChargeReason.CHARGER_UNAVAILABLE)) implies
            (pilotBatteryStatus.advisory == PilotAdvisory.CHARGER_UNAVAILABLE)) &
          (((batteryAssessment != BatteryAssessment.UNAVAILABLE) &
            (chargeSessionSnapshot.disposition == SnapshotChargeDisposition.RECOVERY_APPLIED) &
            (chargeSessionSnapshot.reason == ChargeReason.CONTEXT_INELIGIBLE)) implies
            (pilotBatteryStatus.advisory == PilotAdvisory.CONTEXT_INELIGIBLE)) &
          (((batteryAssessment != BatteryAssessment.UNAVAILABLE) &
            ((chargeSessionSnapshot.disposition != SnapshotChargeDisposition.RECOVERY_APPLIED) |
              ((chargeSessionSnapshot.reason != ChargeReason.EVIDENCE_UNAVAILABLE) &
                (chargeSessionSnapshot.reason != ChargeReason.CHARGER_UNAVAILABLE) &
                (chargeSessionSnapshot.reason != ChargeReason.CONTEXT_INELIGIBLE))) &
            (chargerPathQualification == ChargerPathQualification.ACTIVE) &
            (chargeSessionSnapshot.nextSession != SnapshotNextSessionState.ENABLED)) implies
            (pilotBatteryStatus.advisory == PilotAdvisory.ACTIVITY_WITHOUT_PERMISSION)) &
          (((batteryAssessment == BatteryAssessment.LOW) &
            ((chargeSessionSnapshot.disposition != SnapshotChargeDisposition.RECOVERY_APPLIED) |
              ((chargeSessionSnapshot.reason != ChargeReason.EVIDENCE_UNAVAILABLE) &
                (chargeSessionSnapshot.reason != ChargeReason.CHARGER_UNAVAILABLE) &
                (chargeSessionSnapshot.reason != ChargeReason.CONTEXT_INELIGIBLE))) &
            ((chargerPathQualification != ChargerPathQualification.ACTIVE) |
              (chargeSessionSnapshot.nextSession == SnapshotNextSessionState.ENABLED))) implies
            (pilotBatteryStatus.advisory == PilotAdvisory.CHARGE_RECOMMENDED)) &
          (((batteryAssessment == BatteryAssessment.ADEQUATE) &
            ((chargeSessionSnapshot.disposition != SnapshotChargeDisposition.RECOVERY_APPLIED) |
              ((chargeSessionSnapshot.reason != ChargeReason.EVIDENCE_UNAVAILABLE) &
                (chargeSessionSnapshot.reason != ChargeReason.CHARGER_UNAVAILABLE) &
                (chargeSessionSnapshot.reason != ChargeReason.CONTEXT_INELIGIBLE))) &
            ((chargerPathQualification != ChargerPathQualification.ACTIVE) |
              (chargeSessionSnapshot.nextSession == SnapshotNextSessionState.ENABLED)) &
            (chargeSessionSnapshot.disposition == SnapshotChargeDisposition.REJECTED)) implies
            (pilotBatteryStatus.advisory == PilotAdvisory.REQUEST_REJECTED)) &
          (((batteryAssessment == BatteryAssessment.ADEQUATE) &
            ((chargeSessionSnapshot.disposition != SnapshotChargeDisposition.RECOVERY_APPLIED) |
              ((chargeSessionSnapshot.reason != ChargeReason.EVIDENCE_UNAVAILABLE) &
                (chargeSessionSnapshot.reason != ChargeReason.CHARGER_UNAVAILABLE) &
                (chargeSessionSnapshot.reason != ChargeReason.CONTEXT_INELIGIBLE))) &
            ((chargerPathQualification != ChargerPathQualification.ACTIVE) |
              (chargeSessionSnapshot.nextSession == SnapshotNextSessionState.ENABLED)) &
            (chargeSessionSnapshot.disposition != SnapshotChargeDisposition.REJECTED)) implies
            (pilotBatteryStatus.advisory == PilotAdvisory.NONE));

      compute
        compute_cases
          // @trace CASE_20_PILOT_ADVISORY
          case pilot_advisory:
            guarantee (pilotBatteryStatus.batteryAssessment == batteryAssessment) &
              (pilotBatteryStatus.chargerPathQualification == chargerPathQualification) &
              ((chargeSessionSnapshot.nextSession == SnapshotNextSessionState.IDLE) implies
                (pilotBatteryStatus.session == PilotSessionState.IDLE)) &
              ((chargeSessionSnapshot.nextSession == SnapshotNextSessionState.ENABLED) implies
                (pilotBatteryStatus.session == PilotSessionState.ENABLED)) &
              ((chargeSessionSnapshot.nextSession == SnapshotNextSessionState.SUSPENDED) implies
                (pilotBatteryStatus.session == PilotSessionState.SUSPENDED)) &
              ((chargeSessionSnapshot.disposition == SnapshotChargeDisposition.NO_CHANGE) implies
                (pilotBatteryStatus.disposition == PilotChargeDisposition.NO_CHANGE)) &
              ((chargeSessionSnapshot.disposition == SnapshotChargeDisposition.ACCEPTED) implies
                (pilotBatteryStatus.disposition == PilotChargeDisposition.ACCEPTED)) &
              ((chargeSessionSnapshot.disposition == SnapshotChargeDisposition.REJECTED) implies
                (pilotBatteryStatus.disposition == PilotChargeDisposition.REJECTED)) &
              ((chargeSessionSnapshot.disposition == SnapshotChargeDisposition.RECOVERY_APPLIED) implies
                (pilotBatteryStatus.disposition == PilotChargeDisposition.RECOVERY_APPLIED)) &
              ((batteryAssessment == BatteryAssessment.UNAVAILABLE) implies
                (pilotBatteryStatus.advisory == PilotAdvisory.EVIDENCE_UNAVAILABLE)) &
              (((batteryAssessment != BatteryAssessment.UNAVAILABLE) &
                (chargeSessionSnapshot.disposition == SnapshotChargeDisposition.RECOVERY_APPLIED) &
                (chargeSessionSnapshot.reason == ChargeReason.EVIDENCE_UNAVAILABLE)) implies
                (pilotBatteryStatus.advisory == PilotAdvisory.EVIDENCE_UNAVAILABLE)) &
              (((batteryAssessment != BatteryAssessment.UNAVAILABLE) &
                (chargeSessionSnapshot.disposition == SnapshotChargeDisposition.RECOVERY_APPLIED) &
                (chargeSessionSnapshot.reason == ChargeReason.CHARGER_UNAVAILABLE)) implies
                (pilotBatteryStatus.advisory == PilotAdvisory.CHARGER_UNAVAILABLE)) &
              (((batteryAssessment != BatteryAssessment.UNAVAILABLE) &
                (chargeSessionSnapshot.disposition == SnapshotChargeDisposition.RECOVERY_APPLIED) &
                (chargeSessionSnapshot.reason == ChargeReason.CONTEXT_INELIGIBLE)) implies
                (pilotBatteryStatus.advisory == PilotAdvisory.CONTEXT_INELIGIBLE)) &
              (((batteryAssessment != BatteryAssessment.UNAVAILABLE) &
                ((chargeSessionSnapshot.disposition != SnapshotChargeDisposition.RECOVERY_APPLIED) |
                  ((chargeSessionSnapshot.reason != ChargeReason.EVIDENCE_UNAVAILABLE) &
                    (chargeSessionSnapshot.reason != ChargeReason.CHARGER_UNAVAILABLE) &
                    (chargeSessionSnapshot.reason != ChargeReason.CONTEXT_INELIGIBLE))) &
                (chargerPathQualification == ChargerPathQualification.ACTIVE) &
                (chargeSessionSnapshot.nextSession != SnapshotNextSessionState.ENABLED)) implies
                (pilotBatteryStatus.advisory == PilotAdvisory.ACTIVITY_WITHOUT_PERMISSION)) &
              (((batteryAssessment == BatteryAssessment.LOW) &
                ((chargeSessionSnapshot.disposition != SnapshotChargeDisposition.RECOVERY_APPLIED) |
                  ((chargeSessionSnapshot.reason != ChargeReason.EVIDENCE_UNAVAILABLE) &
                    (chargeSessionSnapshot.reason != ChargeReason.CHARGER_UNAVAILABLE) &
                    (chargeSessionSnapshot.reason != ChargeReason.CONTEXT_INELIGIBLE))) &
                ((chargerPathQualification != ChargerPathQualification.ACTIVE) |
                  (chargeSessionSnapshot.nextSession == SnapshotNextSessionState.ENABLED))) implies
                (pilotBatteryStatus.advisory == PilotAdvisory.CHARGE_RECOMMENDED)) &
              (((batteryAssessment == BatteryAssessment.ADEQUATE) &
                ((chargeSessionSnapshot.disposition != SnapshotChargeDisposition.RECOVERY_APPLIED) |
                  ((chargeSessionSnapshot.reason != ChargeReason.EVIDENCE_UNAVAILABLE) &
                    (chargeSessionSnapshot.reason != ChargeReason.CHARGER_UNAVAILABLE) &
                    (chargeSessionSnapshot.reason != ChargeReason.CONTEXT_INELIGIBLE))) &
                ((chargerPathQualification != ChargerPathQualification.ACTIVE) |
                  (chargeSessionSnapshot.nextSession == SnapshotNextSessionState.ENABLED)) &
                (chargeSessionSnapshot.disposition == SnapshotChargeDisposition.REJECTED)) implies
                (pilotBatteryStatus.advisory == PilotAdvisory.REQUEST_REJECTED)) &
              (((batteryAssessment == BatteryAssessment.ADEQUATE) &
                ((chargeSessionSnapshot.disposition != SnapshotChargeDisposition.RECOVERY_APPLIED) |
                  ((chargeSessionSnapshot.reason != ChargeReason.EVIDENCE_UNAVAILABLE) &
                    (chargeSessionSnapshot.reason != ChargeReason.CHARGER_UNAVAILABLE) &
                    (chargeSessionSnapshot.reason != ChargeReason.CONTEXT_INELIGIBLE))) &
                ((chargerPathQualification != ChargerPathQualification.ACTIVE) |
                  (chargeSessionSnapshot.nextSession == SnapshotNextSessionState.ENABLED)) &
                (chargeSessionSnapshot.disposition != SnapshotChargeDisposition.REJECTED)) implies
                (pilotBatteryStatus.advisory == PilotAdvisory.NONE));
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
