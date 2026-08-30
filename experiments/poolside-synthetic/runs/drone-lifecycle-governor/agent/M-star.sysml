// Architecture checkpoint: approved types, ports, usages, and connections only.
// No GUMBO behavior is present in this retained stage.

package Drone_Lifecycle_Governor {
  private import HAMR::*;

  enum def LifecycleRequest {
    enum NO_REQUEST; enum SWITCH_ON; enum SWITCH_OFF;
    enum BEGIN_CHARGE; enum END_CHARGE; enum ACTIVATE;
    enum DEACTIVATE; enum BEGIN_FLIGHT; enum END_FLIGHT;
  }
  enum def ChargerState { enum DISCONNECTED; enum CONNECTED; }
  enum def BatteryCapacityBand { enum LOW; enum USABLE; }
  enum def BatteryCheck { enum INVALID; enum VALID; }
  enum def NavigationCondition { enum INVALID; enum NOT_READY; enum READY; }
  enum def RadioCondition { enum INVALID; enum NOT_READY; enum READY; }

  enum def LifecycleState { enum OFF; enum STANDBY; enum CHARGING; enum READY; enum FLYING; }
  enum def DecisionPreState { enum OFF; enum STANDBY; enum CHARGING; enum READY; enum FLYING; }
  enum def DecisionNextState { enum OFF; enum STANDBY; enum CHARGING; enum READY; enum FLYING; }
  enum def PilotLifecycleState { enum OFF; enum STANDBY; enum CHARGING; enum READY; enum FLYING; }
  enum def BatteryQualification { enum UNAVAILABLE; enum INSUFFICIENT; enum SUFFICIENT; }
  enum def FlightQualification { enum UNAVAILABLE; enum NOT_READY; enum READY; }
  enum def RecoveryProposal {
    enum NO_RECOVERY; enum TO_STANDBY_BATTERY;
    enum TO_STANDBY_READINESS; enum TO_STANDBY_CHARGE_PATH;
  }
  enum def EffectiveIntent {
    enum NO_INTENT; enum SWITCH_ON; enum SWITCH_OFF;
    enum BEGIN_CHARGE; enum END_CHARGE; enum ACTIVATE; enum DEACTIVATE;
    enum BEGIN_FLIGHT; enum END_FLIGHT; enum RECOVER_TO_STANDBY;
    enum REJECT_BEGIN_CHARGE;
  }
  enum def EligibilityReason {
    enum NONE; enum BATTERY_UNAVAILABLE; enum BATTERY_LOW;
    enum FLIGHT_UNAVAILABLE; enum FLIGHT_NOT_READY; enum CHARGER_DISCONNECTED;
  }
  enum def TransitionResult {
    enum NO_CHANGE; enum ACCEPTED; enum REJECTED;
    enum RECOVERY_APPLIED; enum FRESH_REQUEST_PREEMPTED;
  }
  enum def RequestDisposition {
    enum NO_CHANGE; enum ACCEPTED; enum REJECTED;
    enum RECOVERY_APPLIED; enum PREEMPTED;
  }
  enum def PilotNotice {
    enum NONE; enum BATTERY_UNAVAILABLE; enum BATTERY_LOW;
    enum FLIGHT_UNAVAILABLE; enum FLIGHT_NOT_READY;
    enum CHARGER_DISCONNECTED; enum INAPPLICABLE_REQUEST;
  }
  enum def FreshRequestPreemption { enum NOT_PREEMPTED; enum PREEMPTED; }
  enum def PowerCommand { enum POWER_OFF; enum SUPPORT_POWER; enum FLIGHT_POWER; }
  enum def ChargeCommand { enum CHARGE_DISABLED; enum CHARGE_ENABLED; }
  enum def FlightAuthorization { enum DENIED; enum PERMITTED; }

  // Every field inspected by GUMBO is deliberately an attribute, not a nested part.
  part def EligibilityEnvelope :> Data {
    attribute flightEligible : Base_Types::Boolean;
    attribute chargeEligible : Base_Types::Boolean;
    attribute decisionReason : EligibilityReason;
  }
  part def ArbitratedIntent :> Data {
    attribute effectiveIntent : EffectiveIntent;
    attribute preemption : FreshRequestPreemption;
  }
  part def DecisionSnapshot :> Data {
    attribute preState : DecisionPreState;
    attribute nextState : DecisionNextState;
    attribute effectiveIntent : EffectiveIntent;
    attribute transitionResult : TransitionResult;
    attribute decisionReason : EligibilityReason;
  }
  part def PilotStatus :> Data {
    attribute lifecycleState : PilotLifecycleState;
    attribute requestDisposition : RequestDisposition;
    attribute pilotNotice : PilotNotice;
  }

  part def RequestArbiter :> Thread {
    port pilotRequest : DataPort { in :>> type : LifecycleRequest; }
    port chargerState : DataPort { in :>> type : ChargerState; }
    port recoveryProposal : DataPort { in :>> type : RecoveryProposal; }
    port arbitratedIntent : DataPort { out :>> type : ArbitratedIntent; }

                        
             
                     
                           
                                                       
                                                                                         
                     
                                                                                                        
                                                                                                            

                           
                                                                             
                                                                                          
                                                                                         
                     
                                                                                                                
                                                                                       
                                                                                                                
                                                                                       
                                                                                                            

                           
                                                                                            
                                                                                          
                                                                                         
                     
                                                                                                             
                                                                                       
                                                                                                          
                                                                                      
                                                                                                          
                                                                                         
                                                                                     
                                                                                                                    
                                                                                         
                                                                                  
                                                                                                             
                                                                                       
                                                                                                           
                                                                                     
                                                                                                         
                                                                                       
                                                                                                           
                                                                                         
                                                                                                             
                                                                                       
                                                                                                           
       
  }

  part def BatteryQualificationOwner :> Thread {
    port batteryCapacity : DataPort { in :>> type : BatteryCapacityBand; }
    port batteryCheck : DataPort { in :>> type : BatteryCheck; }
    port batteryQualification : DataPort { out :>> type : BatteryQualification; }

    language "GUMBO" /*{
      compute
        compute_cases
          case CASE_01 "batteryCheck INVALID -> batteryQualification UNAVAILABLE":
            assume batteryCheck == BatteryCheck.INVALID;
            guarantee batteryQualification == BatteryQualification.UNAVAILABLE;
          case CASE_02 "batteryCheck VALID and batteryCapacity LOW -> INSUFFICIENT":
            assume batteryCheck == BatteryCheck.VALID & batteryCapacity == BatteryCapacityBand.LOW;
            guarantee batteryQualification == BatteryQualification.INSUFFICIENT;
          case CASE_03 "batteryCheck VALID and batteryCapacity USABLE -> SUFFICIENT":
            assume batteryCheck == BatteryCheck.VALID & batteryCapacity == BatteryCapacityBand.USABLE;
            guarantee batteryQualification == BatteryQualification.SUFFICIENT;
    }*/
  }

  part def FlightReadinessOwner :> Thread {
    port navigationCondition : DataPort { in :>> type : NavigationCondition; }
    port radioCondition : DataPort { in :>> type : RadioCondition; }
    port flightQualification : DataPort { out :>> type : FlightQualification; }

    language "GUMBO" /*{
      compute
        compute_cases
          case CASE_04 "nav or radio INVALID -> flightQualification UNAVAILABLE":
            assume (navigationCondition == NavigationCondition.INVALID) | (radioCondition == RadioCondition.INVALID);
            guarantee flightQualification == FlightQualification.UNAVAILABLE;
          case CASE_05 "not INVALID and one NOT_READY -> NOT READY":
            assume (navigationCondition != NavigationCondition.INVALID) & (radioCondition != RadioCondition.INVALID) & ((navigationCondition == NavigationCondition.NOT_READY) | (radioCondition == RadioCondition.NOT_READY));
            guarantee flightQualification == FlightQualification.NOT_READY;
          case CASE_06 "nav READY and radio READY -> READY":
            assume (navigationCondition == NavigationCondition.READY) & (radioCondition == RadioCondition.READY);
            guarantee flightQualification == FlightQualification.READY;
    }*/
  }

  part def OperationalEligibilityOwner :> Thread {
    port chargerState : DataPort { in :>> type : ChargerState; }
    port batteryQualification : DataPort { in :>> type : BatteryQualification; }
    port flightQualification : DataPort { in :>> type : FlightQualification; }
    port currentLifecycleState : DataPort { in :>> type : LifecycleState; }
    port recoveryProposal : DataPort { out :>> type : RecoveryProposal; }
    port eligibilityEnvelope : DataPort { out :>> type : EligibilityEnvelope; }

    language "GUMBO" /*{
      compute
        compute_cases
          case CASE_07 "READY/FLYING with non-SUFFICIENT battery -> TO_STANDBY_BATTERY":
            assume (currentLifecycleState == LifecycleState.READY | currentLifecycleState == LifecycleState.FLYING) & (batteryQualification != BatteryQualification.SUFFICIENT);
            guarantee (eligibilityEnvelope.flightEligible == F) & ((eligibilityEnvelope.chargeEligible == T) == ((chargerState == ChargerState.CONNECTED) & (batteryQualification != BatteryQualification.UNAVAILABLE))) & (recoveryProposal == RecoveryProposal.TO_STANDBY_BATTERY) & ((batteryQualification == BatteryQualification.UNAVAILABLE & eligibilityEnvelope.decisionReason == EligibilityReason.BATTERY_UNAVAILABLE) | (batteryQualification == BatteryQualification.INSUFFICIENT & eligibilityEnvelope.decisionReason == EligibilityReason.BATTERY_LOW));
          case CASE_08 "SUFFICIENT battery with non-READY flight -> TO_STANDBY_READINESS":
            assume (currentLifecycleState == LifecycleState.READY | currentLifecycleState == LifecycleState.FLYING) & (batteryQualification == BatteryQualification.SUFFICIENT) & (flightQualification != FlightQualification.READY);
            guarantee (eligibilityEnvelope.flightEligible == F) & ((eligibilityEnvelope.chargeEligible == T) == (chargerState == ChargerState.CONNECTED)) & (recoveryProposal == RecoveryProposal.TO_STANDBY_READINESS) & ((flightQualification == FlightQualification.UNAVAILABLE & eligibilityEnvelope.decisionReason == EligibilityReason.FLIGHT_UNAVAILABLE) | (flightQualification == FlightQualification.NOT_READY & eligibilityEnvelope.decisionReason == EligibilityReason.FLIGHT_NOT_READY));
          case CASE_09 "CHARGING with charger DISCONNECTED or UNAVAILABLE battery -> TO_STANDBY_CHARGE_PATH":
            assume (currentLifecycleState == LifecycleState.CHARGING) & ((chargerState == ChargerState.DISCONNECTED) | (batteryQualification == BatteryQualification.UNAVAILABLE));
            guarantee ((eligibilityEnvelope.flightEligible == T) == ((batteryQualification == BatteryQualification.SUFFICIENT) & (flightQualification == FlightQualification.READY))) & (eligibilityEnvelope.chargeEligible == F) & (recoveryProposal == RecoveryProposal.TO_STANDBY_CHARGE_PATH) & ((chargerState == ChargerState.DISCONNECTED & eligibilityEnvelope.decisionReason == EligibilityReason.CHARGER_DISCONNECTED) | (chargerState == ChargerState.CONNECTED & batteryQualification == BatteryQualification.UNAVAILABLE & eligibilityEnvelope.decisionReason == EligibilityReason.BATTERY_UNAVAILABLE));
          case CASE_10 "no recovery applicable -> NO_RECOVERY":
            assume not((currentLifecycleState == LifecycleState.READY | currentLifecycleState == LifecycleState.FLYING) & (batteryQualification != BatteryQualification.SUFFICIENT)) & not((currentLifecycleState == LifecycleState.READY | currentLifecycleState == LifecycleState.FLYING) & (batteryQualification == BatteryQualification.SUFFICIENT) & (flightQualification != FlightQualification.READY)) & not((currentLifecycleState == LifecycleState.CHARGING) & ((chargerState == ChargerState.DISCONNECTED) | (batteryQualification == BatteryQualification.UNAVAILABLE)));
            guarantee (recoveryProposal == RecoveryProposal.NO_RECOVERY) & ((eligibilityEnvelope.flightEligible == T) == ((batteryQualification == BatteryQualification.SUFFICIENT) & (flightQualification == FlightQualification.READY))) & ((eligibilityEnvelope.chargeEligible == T) == ((chargerState == ChargerState.CONNECTED) & (batteryQualification != BatteryQualification.UNAVAILABLE))) & ((batteryQualification == BatteryQualification.UNAVAILABLE & eligibilityEnvelope.decisionReason == EligibilityReason.BATTERY_UNAVAILABLE) | (batteryQualification == BatteryQualification.INSUFFICIENT & eligibilityEnvelope.decisionReason == EligibilityReason.BATTERY_LOW) | (batteryQualification == BatteryQualification.SUFFICIENT & flightQualification == FlightQualification.UNAVAILABLE & eligibilityEnvelope.decisionReason == EligibilityReason.FLIGHT_UNAVAILABLE) | (batteryQualification == BatteryQualification.SUFFICIENT & flightQualification == FlightQualification.NOT_READY & eligibilityEnvelope.decisionReason == EligibilityReason.FLIGHT_NOT_READY) | (batteryQualification == BatteryQualification.SUFFICIENT & flightQualification == FlightQualification.READY & eligibilityEnvelope.decisionReason == EligibilityReason.NONE));
    }*/

                        
             
                     
                           
                                                                                         
                                                                                             
                                                                                               
                                                                                                
                     
                                                       
                                                   
                                                                                   
                                                                                                      
                                                                                                 
                                                                                                    
                                                                                                                        
                                                                                                     
                                                                                                                

                           
                                                                          
                                                                                             
                                                                                               
                                                                                                 
                                                                                         
                     
                                                       
                                                   
                                                                                    
                                                                                                   
                                                                                                  
                                                                                                                       
                                                                                                
                                                                                                                     

                           
                                                                           
                                                                                               
                                                                                    
                                                                                                   
                     
                                                   
                                                                                                    
                                                                                              
                                                       
                                                                                                     
                                                                                     
                                                                                                                         
                                                                                  
                                                                                                    
                                                                                                                        

                           
                                                                                                
                                                                                                 
                                                                                                   
                                                                                                           
                                                                                            
                                                                                              
                                                                                                     
                                                                                               
                                                                                              
                                                                                        
                                                                                                        
                     
                                                                                          
                                                   
                                                                                                    
                                                                                              
                                                   
                                                                                   
                                                                                                      
                                                                                                    
                                                                                                                        
                                                                                                     
                                                                                                                
                                                                                                   
                                                                                                  
                                                                                                                       
                                                                                                   
                                                                                                
                                                                                                                     
                                                                                                   
                                                                                            
                                                                                                         
       
  }

  part def LifecycleStateGovernor :> Thread {
    port arbitratedIntent : DataPort { in :>> type : ArbitratedIntent; }
    port eligibilityEnvelope : DataPort { in :>> type : EligibilityEnvelope; }
    port currentLifecycleState : DataPort { out :>> type : LifecycleState; }
    port decisionSnapshot : DataPort { out :>> type : DecisionSnapshot; }

                        
           
                         
                                                                           

                
                         
                                        
                                                                                  
                         
                                      
                                                                                
                         
                                          
                                                                                       
                                                                                         
                                                                                                   
                                                                                                     
                                                                                              

             
                        
                                           
                                                               
                         
                                                           
                                                                                
                                                                                         
                                                                                          
                                                                                             
                                                                                              
                                                                                              
                                                                                               
                                                                                           
                                                                                            
                                                                                            
                                                                                              
                                                                                           
                                                                                      
                                                                                               
                                                                                          
                                                                                                
                                                                                           
                                                                                             
                                                                                        
                                                                                              
                                                                                         

                     
                           
                                                                   
                                                                                                            
                     
                                                                                             
                                                                                                        
                                                                                                  

                           
                                                                                     
                  
                                                                                            
                                                                                                         
                                                                                                
                                                                                                           
                                                         
                                                                                                
                                                                                                       
                                                         
                                                                                              
                                                                                                           
                                                        
                     
                                                                                                        
                                                                                                   
                                                                                             
                                                                                                    
                                                                                                 
                                                                                                            
                                                                                                     
                                                                                                 
                                                                                                        
                                                                                                  
                                                                                               
                                                                                                   

                           
                                                                   
                  
                                                                                                 
                                                                                                          
                                                                                              
                                                                                                          
                                                                                               
                                                                                                          
                                                                                               
                                                                                                
                                                                                                   
                                                                                                                 
                     
                                                                                                   
                                                                                                            
                                                                                                
                                                                                                             
                                                                                                  
                                                                                                         
                                                                                                     
                                                                                               
                                                                                                         
                                                                                                
                                                                                                         
                                                                                                     
                                                                                                                 
                                                                                                  
                                                                                      
                                                                                                            
                                                                                                                           
                                                                                                                
                                                                                                                     

                           
                                                                          
                                                                                                             
                                                                                                
                                                                                                             
                                                                                                    
                                                                                                               
                                                             
                                                                                                    
                                                                                                           
                                                             
                                                                                                  
                                                                                                               
                                                              
                                                                                                     
                                                                                                              
                                                                                                  
                                                                                                              
                                                                                                   
                                                                                                              
                                                                                                   
                                                                                                    
                                                                                                       
                                                                                                                      
                     
                                                                                             
                                                                                                
                                                                                                 
                                                                                                    
                                                                                                  
                                                                                                     
                                                                                               
                                                                                                  
                                                                                                
                                                                                                    
                                                                                                         
                                                                                                           
                                                                                                      
                                                                                                                   
                                                                                                          
                                                                                                                      
                                                                                                   
                                                                                                              
                                                            
                                                                                                   
                                                                                                          
                                                            
                                                                                                 
                                                                                                              
                                                             
                                                                                                          
                                                                                        
                                                                                                         
                                                                                                                   
                                                                                                      
                                                                                                                 
                                                               
                                                                                                      
                                                                                                             
                                                               
                                                                                                    
                                                                                                                 
                                                                
                                                                                                          
                                                                                                      
       
  }

  part def PowerChargeCommandPolicy :> Thread {
    port decisionSnapshot : DataPort { in :>> type : DecisionSnapshot; }
    port powerCommand : DataPort { out :>> type : PowerCommand; }
    port chargeCommand : DataPort { out :>> type : ChargeCommand; }

                        
                
                         
                                      
                                                                           
                         
                                       
                                                                                   
             
                     
                           
                                                                               
                  
                                                                                             
                                                                                                 
                                                                                                  
                                                                                               
                                                                                               
                     
                                                                                               
                                                                                  
                                                                                           
                                                                                                   
                                                                                      
                                                                                           
                                                                                                    
                                                                                  
                                                                                          
                                                                                                 
                                                                                      
                                                                                           
                                                                                                  
                                                                                     
                                                                                           
       
  }

  part def FlightAuthorizationPolicy :> Thread {
    port decisionSnapshot : DataPort { in :>> type : DecisionSnapshot; }
    port flightAuthorization : DataPort { out :>> type : FlightAuthorization; }

                        
                
                         
                                             
                                                                                      
             
                     
                           
                                                                             
                  
                                                                                             
                                                                                                 
                                                                                                  
                                                                                               
                                                                                               
                     
                                                                                                  
                                                                                                 
                                                                                                  
                                                                                              
       
  }

  part def SupervisoryStatusAssessment :> Thread {
    port decisionSnapshot : DataPort { in :>> type : DecisionSnapshot; }
    port batteryQualification : DataPort { in :>> type : BatteryQualification; }
    port pilotStatus : DataPort { out :>> type : PilotStatus; }

                        
                
                         
                                     
                                                                                           
                                                                                                    
                                                                                
             
                     
                           
                                                                                   
                  
                                                                                                         
                                                                                                        
                                                                                                        
                                                                                                                
                                                                                                                      
                     
                                                                                               
                                                                                                  
                                                                                                   
                                                                                                      
                                                                                                    
                                                                                                       
                                                                                                 
                                                                                                    
                                                                                                  
                                                                                                      
                                                                                                           
                                                                                                           
                                                                                                          
                                                                                                          
                                                                                                          
                                                                                                          
                                                                                                                  
                                                                                                                  
                                                                                                                         
                                                                                                            
                                                                                                    
                                                                                                       
                                                                                                     
                                                                                               
                                                                                                   
                                                                                                                    
                                                                                                       
                                                                                                   
                                                                                                            
                                                                                               
                                                                                                   
                                                                                                                   
                                                                                                      
                                                                                                   
                                                                                                                 
                                                                                                    
                                                                                                   
                                                                                                                     
                                                                                                        
                                                                                                   
                                                                                                     
                                                                                                          
                                                                                                        
                                                                                                   
                                                                                                     
                                                                                                          
                                                                                        
       
  }

  part def GovernorProcess :> Process {
    port pilotRequest : DataPort { in :>> type : LifecycleRequest; }
    port chargerState : DataPort { in :>> type : ChargerState; }
    port batteryCapacity : DataPort { in :>> type : BatteryCapacityBand; }
    port batteryCheck : DataPort { in :>> type : BatteryCheck; }
    port navigationCondition : DataPort { in :>> type : NavigationCondition; }
    port radioCondition : DataPort { in :>> type : RadioCondition; }
    port powerCommand : DataPort { out :>> type : PowerCommand; }
    port chargeCommand : DataPort { out :>> type : ChargeCommand; }
    port flightAuthorization : DataPort { out :>> type : FlightAuthorization; }
    port pilotStatus : DataPort { out :>> type : PilotStatus; }

    part requestArbiter : RequestArbiter;
    part batteryQualificationOwner : BatteryQualificationOwner;
    part flightReadinessOwner : FlightReadinessOwner;
    part operationalEligibilityOwner : OperationalEligibilityOwner;
    part lifecycleStateGovernor : LifecycleStateGovernor;
    part powerChargeCommandPolicy : PowerChargeCommandPolicy;
    part flightAuthorizationPolicy : FlightAuthorizationPolicy;
    part supervisoryStatusAssessment : SupervisoryStatusAssessment;

    connection int01 : PortConnection connect pilotRequest to requestArbiter.pilotRequest;
    connection int02 : PortConnection connect chargerState to requestArbiter.chargerState;
    connection int03 : PortConnection connect chargerState to operationalEligibilityOwner.chargerState;
    connection int04 : PortConnection connect batteryCapacity to batteryQualificationOwner.batteryCapacity;
    connection int05 : PortConnection connect batteryCheck to batteryQualificationOwner.batteryCheck;
    connection int06 : PortConnection connect navigationCondition to flightReadinessOwner.navigationCondition;
    connection int07 : PortConnection connect radioCondition to flightReadinessOwner.radioCondition;
    connection int08 : PortConnection connect batteryQualificationOwner.batteryQualification to operationalEligibilityOwner.batteryQualification;
    connection int09 : PortConnection connect batteryQualificationOwner.batteryQualification to supervisoryStatusAssessment.batteryQualification;
    connection int10 : PortConnection connect flightReadinessOwner.flightQualification to operationalEligibilityOwner.flightQualification;
    connection int11 : PortConnection connect lifecycleStateGovernor.currentLifecycleState to operationalEligibilityOwner.currentLifecycleState;
    connection int12 : PortConnection connect operationalEligibilityOwner.recoveryProposal to requestArbiter.recoveryProposal;
    connection int13 : PortConnection connect operationalEligibilityOwner.eligibilityEnvelope to lifecycleStateGovernor.eligibilityEnvelope;
    connection int14 : PortConnection connect requestArbiter.arbitratedIntent to lifecycleStateGovernor.arbitratedIntent;
    connection int15 : PortConnection connect lifecycleStateGovernor.decisionSnapshot to powerChargeCommandPolicy.decisionSnapshot;
    connection int16 : PortConnection connect lifecycleStateGovernor.decisionSnapshot to flightAuthorizationPolicy.decisionSnapshot;
    connection int17 : PortConnection connect lifecycleStateGovernor.decisionSnapshot to supervisoryStatusAssessment.decisionSnapshot;
    connection int18 : PortConnection connect powerChargeCommandPolicy.powerCommand to powerCommand;
    connection int19 : PortConnection connect powerChargeCommandPolicy.chargeCommand to chargeCommand;
    connection int20 : PortConnection connect flightAuthorizationPolicy.flightAuthorization to flightAuthorization;
    connection int21 : PortConnection connect supervisoryStatusAssessment.pilotStatus to pilotStatus;
  }

  part def DroneLifecycleGovernorSystem :> System {
    port pilotRequest : DataPort { in :>> type : LifecycleRequest; }
    port chargerState : DataPort { in :>> type : ChargerState; }
    port batteryCapacity : DataPort { in :>> type : BatteryCapacityBand; }
    port batteryCheck : DataPort { in :>> type : BatteryCheck; }
    port navigationCondition : DataPort { in :>> type : NavigationCondition; }
    port radioCondition : DataPort { in :>> type : RadioCondition; }
    port powerCommand : DataPort { out :>> type : PowerCommand; }
    port chargeCommand : DataPort { out :>> type : ChargeCommand; }
    port flightAuthorization : DataPort { out :>> type : FlightAuthorization; }
    port pilotStatus : DataPort { out :>> type : PilotStatus; }

    part governorProcess : GovernorProcess;

    connection support01 : PortConnection connect pilotRequest to governorProcess.pilotRequest;
    connection support02 : PortConnection connect chargerState to governorProcess.chargerState;
    connection support03 : PortConnection connect batteryCapacity to governorProcess.batteryCapacity;
    connection support04 : PortConnection connect batteryCheck to governorProcess.batteryCheck;
    connection support05 : PortConnection connect navigationCondition to governorProcess.navigationCondition;
    connection support06 : PortConnection connect radioCondition to governorProcess.radioCondition;
    connection support07 : PortConnection connect governorProcess.powerCommand to powerCommand;
    connection support08 : PortConnection connect governorProcess.chargeCommand to chargeCommand;
    connection support09 : PortConnection connect governorProcess.flightAuthorization to flightAuthorization;
    connection support10 : PortConnection connect governorProcess.pilotStatus to pilotStatus;
  }

  part droneLifecycleGovernor : DroneLifecycleGovernorSystem;
}
