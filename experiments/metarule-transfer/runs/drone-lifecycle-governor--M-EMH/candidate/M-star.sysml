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

    language "GUMBO" /*{
      compute
        compute_cases
          case CASE_11 "SWITCH_OFF always dominates recovery":
            assume pilotRequest == LifecycleRequest.SWITCH_OFF;
            guarantee arbitratedIntent.effectiveIntent == EffectiveIntent.SWITCH_OFF &
              arbitratedIntent.preemption == FreshRequestPreemption.NOT_PREEMPTED;
          case CASE_12 "Recovery preempts every non-shutdown fresh request":
            assume pilotRequest != LifecycleRequest.SWITCH_OFF &
              recoveryProposal != RecoveryProposal.NO_RECOVERY;
            guarantee arbitratedIntent.effectiveIntent == EffectiveIntent.RECOVER_TO_STANDBY &
              ((pilotRequest == LifecycleRequest.NO_REQUEST &
                arbitratedIntent.preemption == FreshRequestPreemption.NOT_PREEMPTED) |
               (pilotRequest != LifecycleRequest.NO_REQUEST &
                arbitratedIntent.preemption == FreshRequestPreemption.PREEMPTED));
          case CASE_13 "Otherwise translate the finite pilot request":
            assume pilotRequest != LifecycleRequest.SWITCH_OFF &
              recoveryProposal == RecoveryProposal.NO_RECOVERY;
            guarantee arbitratedIntent.preemption == FreshRequestPreemption.NOT_PREEMPTED &
              ((pilotRequest == LifecycleRequest.NO_REQUEST &
                arbitratedIntent.effectiveIntent == EffectiveIntent.NO_INTENT) |
               (pilotRequest == LifecycleRequest.SWITCH_ON &
                arbitratedIntent.effectiveIntent == EffectiveIntent.SWITCH_ON) |
               (pilotRequest == LifecycleRequest.BEGIN_CHARGE &
                chargerState == ChargerState.DISCONNECTED &
                arbitratedIntent.effectiveIntent == EffectiveIntent.REJECT_BEGIN_CHARGE) |
               (pilotRequest == LifecycleRequest.BEGIN_CHARGE &
                chargerState == ChargerState.CONNECTED &
                arbitratedIntent.effectiveIntent == EffectiveIntent.BEGIN_CHARGE) |
               (pilotRequest == LifecycleRequest.END_CHARGE &
                arbitratedIntent.effectiveIntent == EffectiveIntent.END_CHARGE) |
               (pilotRequest == LifecycleRequest.ACTIVATE &
                arbitratedIntent.effectiveIntent == EffectiveIntent.ACTIVATE) |
               (pilotRequest == LifecycleRequest.DEACTIVATE &
                arbitratedIntent.effectiveIntent == EffectiveIntent.DEACTIVATE) |
               (pilotRequest == LifecycleRequest.BEGIN_FLIGHT &
                arbitratedIntent.effectiveIntent == EffectiveIntent.BEGIN_FLIGHT) |
               (pilotRequest == LifecycleRequest.END_FLIGHT &
                arbitratedIntent.effectiveIntent == EffectiveIntent.END_FLIGHT));
    }*/

                        
             
                     
                           
                                                       
                                                                                         
                     
                                                                                                        
                                                                                                            

                           
                                                                             
                                                                                          
                                                                                         
                     
                                                                                                                
                                                                                       
                                                                                                                
                                                                                       
                                                                                                            

                           
                                                                                            
                                                                                          
                                                                                         
                     
                                                                                                             
                                                                                       
                                                                                                          
                                                                                      
                                                                                                          
                                                                                         
                                                                                     
                                                                                                                    
                                                                                         
                                                                                  
                                                                                                             
                                                                                       
                                                                                                           
                                                                                     
                                                                                                         
                                                                                       
                                                                                                           
                                                                                         
                                                                                                             
                                                                                       
                                                                                                           
       
  }

  part def BatteryQualificationOwner :> Thread {
    port batteryCapacity : DataPort { in :>> type : BatteryCapacityBand; }
    port batteryCheck : DataPort { in :>> type : BatteryCheck; }
    port batteryQualification : DataPort { out :>> type : BatteryQualification; }

    language "GUMBO" /*{
      compute
        compute_cases
          case CASE_01 "Invalid battery check is unavailable":
            assume batteryCheck == BatteryCheck.INVALID;
            guarantee batteryQualification == BatteryQualification.UNAVAILABLE;
          case CASE_02 "Valid low battery is insufficient":
            assume batteryCheck == BatteryCheck.VALID &
              batteryCapacity == BatteryCapacityBand.LOW;
            guarantee batteryQualification == BatteryQualification.INSUFFICIENT;
          case CASE_03 "Valid usable battery is sufficient":
            assume batteryCheck == BatteryCheck.VALID &
              batteryCapacity == BatteryCapacityBand.USABLE;
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
          case CASE_04 "Invalid navigation or radio is unavailable":
            assume navigationCondition == NavigationCondition.INVALID |
              radioCondition == RadioCondition.INVALID;
            guarantee flightQualification == FlightQualification.UNAVAILABLE;
          case CASE_05 "Non-invalid but not-ready input is not ready":
            assume navigationCondition != NavigationCondition.INVALID &
              radioCondition != RadioCondition.INVALID &
              (navigationCondition == NavigationCondition.NOT_READY |
               radioCondition == RadioCondition.NOT_READY);
            guarantee flightQualification == FlightQualification.NOT_READY;
          case CASE_06 "Both ready inputs qualify flight":
            assume navigationCondition == NavigationCondition.READY &
              radioCondition == RadioCondition.READY;
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
          case CASE_07 "Battery loss recovers READY or FLYING":
            assume (currentLifecycleState == LifecycleState.READY |
              currentLifecycleState == LifecycleState.FLYING) &
              batteryQualification != BatteryQualification.SUFFICIENT;
            guarantee not eligibilityEnvelope.flightEligible &
              (eligibilityEnvelope.chargeEligible ==
                (chargerState == ChargerState.CONNECTED &
                 batteryQualification != BatteryQualification.UNAVAILABLE)) &
              recoveryProposal == RecoveryProposal.TO_STANDBY_BATTERY &
              ((batteryQualification == BatteryQualification.UNAVAILABLE &
                eligibilityEnvelope.decisionReason == EligibilityReason.BATTERY_UNAVAILABLE) |
               (batteryQualification == BatteryQualification.INSUFFICIENT &
                eligibilityEnvelope.decisionReason == EligibilityReason.BATTERY_LOW));
          case CASE_08 "Readiness loss recovers READY or FLYING":
            assume (currentLifecycleState == LifecycleState.READY |
              currentLifecycleState == LifecycleState.FLYING) &
              batteryQualification == BatteryQualification.SUFFICIENT &
              flightQualification != FlightQualification.READY;
            guarantee not eligibilityEnvelope.flightEligible &
              (eligibilityEnvelope.chargeEligible ==
                (chargerState == ChargerState.CONNECTED)) &
              recoveryProposal == RecoveryProposal.TO_STANDBY_READINESS &
              ((flightQualification == FlightQualification.UNAVAILABLE &
                eligibilityEnvelope.decisionReason == EligibilityReason.FLIGHT_UNAVAILABLE) |
               (flightQualification == FlightQualification.NOT_READY &
                eligibilityEnvelope.decisionReason == EligibilityReason.FLIGHT_NOT_READY));
          case CASE_09 "Charging premise loss recovers to standby":
            assume currentLifecycleState == LifecycleState.CHARGING &
              (chargerState == ChargerState.DISCONNECTED |
               batteryQualification == BatteryQualification.UNAVAILABLE);
            guarantee (eligibilityEnvelope.flightEligible ==
              (batteryQualification == BatteryQualification.SUFFICIENT &
               flightQualification == FlightQualification.READY)) &
              not eligibilityEnvelope.chargeEligible &
              recoveryProposal == RecoveryProposal.TO_STANDBY_CHARGE_PATH &
              ((chargerState == ChargerState.DISCONNECTED &
                eligibilityEnvelope.decisionReason == EligibilityReason.CHARGER_DISCONNECTED) |
               (chargerState == ChargerState.CONNECTED &
                batteryQualification == BatteryQualification.UNAVAILABLE &
                eligibilityEnvelope.decisionReason == EligibilityReason.BATTERY_UNAVAILABLE));
          case CASE_10 "No recovery publishes eligibility and reason":
            assume not (((currentLifecycleState == LifecycleState.READY |
                currentLifecycleState == LifecycleState.FLYING) &
                batteryQualification != BatteryQualification.SUFFICIENT) |
              ((currentLifecycleState == LifecycleState.READY |
                currentLifecycleState == LifecycleState.FLYING) &
                batteryQualification == BatteryQualification.SUFFICIENT &
                flightQualification != FlightQualification.READY) |
              (currentLifecycleState == LifecycleState.CHARGING &
                (chargerState == ChargerState.DISCONNECTED |
                 batteryQualification == BatteryQualification.UNAVAILABLE)));
            guarantee recoveryProposal == RecoveryProposal.NO_RECOVERY &
              (eligibilityEnvelope.flightEligible ==
                (batteryQualification == BatteryQualification.SUFFICIENT &
                 flightQualification == FlightQualification.READY)) &
              (eligibilityEnvelope.chargeEligible ==
                (chargerState == ChargerState.CONNECTED &
                 batteryQualification != BatteryQualification.UNAVAILABLE)) &
              ((batteryQualification == BatteryQualification.UNAVAILABLE &
                eligibilityEnvelope.decisionReason == EligibilityReason.BATTERY_UNAVAILABLE) |
               (batteryQualification == BatteryQualification.INSUFFICIENT &
                eligibilityEnvelope.decisionReason == EligibilityReason.BATTERY_LOW) |
               (batteryQualification == BatteryQualification.SUFFICIENT &
                flightQualification == FlightQualification.UNAVAILABLE &
                eligibilityEnvelope.decisionReason == EligibilityReason.FLIGHT_UNAVAILABLE) |
               (batteryQualification == BatteryQualification.SUFFICIENT &
                flightQualification == FlightQualification.NOT_READY &
                eligibilityEnvelope.decisionReason == EligibilityReason.FLIGHT_NOT_READY) |
               (batteryQualification == BatteryQualification.SUFFICIENT &
                flightQualification == FlightQualification.READY &
                eligibilityEnvelope.decisionReason == EligibilityReason.NONE));
    }*/

                        
             
                     
                           
                                                                                         
                                                                                             
                                                                                               
                                                                                                
                     
                                                       
                                                   
                                                                                   
                                                                                                      
                                                                                                 
                                                                                                    
                                                                                                                        
                                                                                                     
                                                                                                                

                           
                                                                          
                                                                                             
                                                                                               
                                                                                                 
                                                                                         
                     
                                                       
                                                   
                                                                                    
                                                                                                   
                                                                                                  
                                                                                                                       
                                                                                                
                                                                                                                     

                           
                                                                           
                                                                                               
                                                                                    
                                                                                                   
                     
                                                   
                                                                                                    
                                                                                              
                                                       
                                                                                                     
                                                                                     
                                                                                                                         
                                                                                  
                                                                                                    
                                                                                                                        

                           
                                                                                                
                                                                                                 
                                                                                                   
                                                                                                           
                                                                                            
                                                                                              
                                                                                                     
                                                                                               
                                                                                              
                                                                                        
                                                                                                        
                     
                                                                                          
                                                   
                                                                                                    
                                                                                              
                                                   
                                                                                   
                                                                                                      
                                                                                                    
                                                                                                                        
                                                                                                     
                                                                                                                
                                                                                                   
                                                                                                  
                                                                                                                       
                                                                                                   
                                                                                                
                                                                                                                     
                                                                                                   
                                                                                            
                                                                                                         
       
  }

  part def LifecycleStateGovernor :> Thread {
    port arbitratedIntent : DataPort { in :>> type : ArbitratedIntent; }
    port eligibilityEnvelope : DataPort { in :>> type : EligibilityEnvelope; }
    port currentLifecycleState : DataPort { out :>> type : LifecycleState; }
    port decisionSnapshot : DataPort { out :>> type : DecisionSnapshot; }

    language "GUMBO" /*{
      state
        committedLifecycleState: LifecycleState;

      initialize
        guarantee InitialLifecycleState:
          committedLifecycleState == LifecycleState.OFF;
        guarantee InitialCurrentState:
          currentLifecycleState == LifecycleState.OFF;
        guarantee InitialDecisionSnapshot:
          decisionSnapshot.preState == DecisionPreState.OFF &
          decisionSnapshot.nextState == DecisionNextState.OFF &
          decisionSnapshot.effectiveIntent == EffectiveIntent.NO_INTENT &
          decisionSnapshot.transitionResult == TransitionResult.NO_CHANGE &
          decisionSnapshot.decisionReason == EligibilityReason.NONE;

      compute
        guarantee PublishCommittedPreState:
          currentLifecycleState == In(committedLifecycleState);
        guarantee PreserveDecisionInputsAndCommitNextState:
          decisionSnapshot.effectiveIntent == arbitratedIntent.effectiveIntent &
          ((In(committedLifecycleState) == LifecycleState.OFF &
            decisionSnapshot.preState == DecisionPreState.OFF) |
           (In(committedLifecycleState) == LifecycleState.STANDBY &
            decisionSnapshot.preState == DecisionPreState.STANDBY) |
           (In(committedLifecycleState) == LifecycleState.CHARGING &
            decisionSnapshot.preState == DecisionPreState.CHARGING) |
           (In(committedLifecycleState) == LifecycleState.READY &
            decisionSnapshot.preState == DecisionPreState.READY) |
           (In(committedLifecycleState) == LifecycleState.FLYING &
            decisionSnapshot.preState == DecisionPreState.FLYING)) &
          ((decisionSnapshot.nextState == DecisionNextState.OFF &
            committedLifecycleState == LifecycleState.OFF) |
           (decisionSnapshot.nextState == DecisionNextState.STANDBY &
            committedLifecycleState == LifecycleState.STANDBY) |
           (decisionSnapshot.nextState == DecisionNextState.CHARGING &
            committedLifecycleState == LifecycleState.CHARGING) |
           (decisionSnapshot.nextState == DecisionNextState.READY &
            committedLifecycleState == LifecycleState.READY) |
           (decisionSnapshot.nextState == DecisionNextState.FLYING &
            committedLifecycleState == LifecycleState.FLYING));
        compute_cases
          case CASE_14 "Shutdown transitions to OFF":
            assume arbitratedIntent.effectiveIntent == EffectiveIntent.SWITCH_OFF;
            guarantee decisionSnapshot.nextState == DecisionNextState.OFF &
              decisionSnapshot.transitionResult == TransitionResult.ACCEPTED &
              decisionSnapshot.decisionReason == EligibilityReason.NONE;
          case CASE_15 "Eligible forward transitions are accepted":
            assume (In(committedLifecycleState) == LifecycleState.OFF &
              arbitratedIntent.effectiveIntent == EffectiveIntent.SWITCH_ON) |
              (In(committedLifecycleState) == LifecycleState.STANDBY &
               arbitratedIntent.effectiveIntent == EffectiveIntent.BEGIN_CHARGE &
               eligibilityEnvelope.chargeEligible) |
              (In(committedLifecycleState) == LifecycleState.STANDBY &
               arbitratedIntent.effectiveIntent == EffectiveIntent.ACTIVATE &
               eligibilityEnvelope.flightEligible) |
              (In(committedLifecycleState) == LifecycleState.READY &
               arbitratedIntent.effectiveIntent == EffectiveIntent.BEGIN_FLIGHT &
               eligibilityEnvelope.flightEligible);
            guarantee decisionSnapshot.transitionResult == TransitionResult.ACCEPTED &
              decisionSnapshot.decisionReason == EligibilityReason.NONE &
              ((In(committedLifecycleState) == LifecycleState.OFF &
                decisionSnapshot.nextState == DecisionNextState.STANDBY) |
               (In(committedLifecycleState) == LifecycleState.STANDBY &
                arbitratedIntent.effectiveIntent == EffectiveIntent.BEGIN_CHARGE &
                decisionSnapshot.nextState == DecisionNextState.CHARGING) |
               (In(committedLifecycleState) == LifecycleState.STANDBY &
                arbitratedIntent.effectiveIntent == EffectiveIntent.ACTIVATE &
                decisionSnapshot.nextState == DecisionNextState.READY) |
               (In(committedLifecycleState) == LifecycleState.READY &
                decisionSnapshot.nextState == DecisionNextState.FLYING));
          case CASE_16 "Back transitions and recovery enter standby":
            assume (In(committedLifecycleState) == LifecycleState.CHARGING &
              arbitratedIntent.effectiveIntent == EffectiveIntent.END_CHARGE) |
              (In(committedLifecycleState) == LifecycleState.READY &
               arbitratedIntent.effectiveIntent == EffectiveIntent.DEACTIVATE) |
              (In(committedLifecycleState) == LifecycleState.FLYING &
               arbitratedIntent.effectiveIntent == EffectiveIntent.END_FLIGHT) |
              ((In(committedLifecycleState) == LifecycleState.READY |
                In(committedLifecycleState) == LifecycleState.FLYING |
                In(committedLifecycleState) == LifecycleState.CHARGING) &
               arbitratedIntent.effectiveIntent == EffectiveIntent.RECOVER_TO_STANDBY);
            guarantee
              (((In(committedLifecycleState) == LifecycleState.CHARGING &
                 arbitratedIntent.effectiveIntent == EffectiveIntent.END_CHARGE) |
                (In(committedLifecycleState) == LifecycleState.READY &
                 arbitratedIntent.effectiveIntent == EffectiveIntent.DEACTIVATE)) &
               decisionSnapshot.nextState == DecisionNextState.STANDBY &
               decisionSnapshot.transitionResult == TransitionResult.ACCEPTED &
               decisionSnapshot.decisionReason == EligibilityReason.NONE) |
              (In(committedLifecycleState) == LifecycleState.FLYING &
               arbitratedIntent.effectiveIntent == EffectiveIntent.END_FLIGHT &
               decisionSnapshot.nextState == DecisionNextState.READY &
               decisionSnapshot.transitionResult == TransitionResult.ACCEPTED &
               decisionSnapshot.decisionReason == EligibilityReason.NONE) |
              (arbitratedIntent.effectiveIntent == EffectiveIntent.RECOVER_TO_STANDBY &
               decisionSnapshot.nextState == DecisionNextState.STANDBY &
               decisionSnapshot.decisionReason == eligibilityEnvelope.decisionReason &
               ((arbitratedIntent.preemption == FreshRequestPreemption.PREEMPTED &
                 decisionSnapshot.transitionResult == TransitionResult.FRESH_REQUEST_PREEMPTED) |
                (arbitratedIntent.preemption == FreshRequestPreemption.NOT_PREEMPTED &
                 decisionSnapshot.transitionResult == TransitionResult.RECOVERY_APPLIED)));
          case CASE_17 "All remaining intents retain or reject":
            assume arbitratedIntent.effectiveIntent != EffectiveIntent.SWITCH_OFF &
              not ((In(committedLifecycleState) == LifecycleState.OFF &
                 arbitratedIntent.effectiveIntent == EffectiveIntent.SWITCH_ON) |
                (In(committedLifecycleState) == LifecycleState.STANDBY &
                 arbitratedIntent.effectiveIntent == EffectiveIntent.BEGIN_CHARGE &
                 eligibilityEnvelope.chargeEligible) |
                (In(committedLifecycleState) == LifecycleState.STANDBY &
                 arbitratedIntent.effectiveIntent == EffectiveIntent.ACTIVATE &
                 eligibilityEnvelope.flightEligible) |
                (In(committedLifecycleState) == LifecycleState.READY &
                 arbitratedIntent.effectiveIntent == EffectiveIntent.BEGIN_FLIGHT &
                 eligibilityEnvelope.flightEligible)) &
              not ((In(committedLifecycleState) == LifecycleState.CHARGING &
                 arbitratedIntent.effectiveIntent == EffectiveIntent.END_CHARGE) |
                (In(committedLifecycleState) == LifecycleState.READY &
                 arbitratedIntent.effectiveIntent == EffectiveIntent.DEACTIVATE) |
                (In(committedLifecycleState) == LifecycleState.FLYING &
                 arbitratedIntent.effectiveIntent == EffectiveIntent.END_FLIGHT) |
                ((In(committedLifecycleState) == LifecycleState.READY |
                  In(committedLifecycleState) == LifecycleState.FLYING |
                  In(committedLifecycleState) == LifecycleState.CHARGING) &
                 arbitratedIntent.effectiveIntent == EffectiveIntent.RECOVER_TO_STANDBY));
            guarantee
              ((In(committedLifecycleState) == LifecycleState.OFF &
                decisionSnapshot.nextState == DecisionNextState.OFF) |
               (In(committedLifecycleState) == LifecycleState.STANDBY &
                decisionSnapshot.nextState == DecisionNextState.STANDBY) |
               (In(committedLifecycleState) == LifecycleState.CHARGING &
                decisionSnapshot.nextState == DecisionNextState.CHARGING) |
               (In(committedLifecycleState) == LifecycleState.READY &
                decisionSnapshot.nextState == DecisionNextState.READY) |
               (In(committedLifecycleState) == LifecycleState.FLYING &
                decisionSnapshot.nextState == DecisionNextState.FLYING)) &
              ((arbitratedIntent.effectiveIntent == EffectiveIntent.NO_INTENT &
                decisionSnapshot.transitionResult == TransitionResult.NO_CHANGE &
                decisionSnapshot.decisionReason == EligibilityReason.NONE) |
               (arbitratedIntent.effectiveIntent == EffectiveIntent.REJECT_BEGIN_CHARGE &
                decisionSnapshot.transitionResult == TransitionResult.REJECTED &
                decisionSnapshot.decisionReason == EligibilityReason.CHARGER_DISCONNECTED) |
               (((In(committedLifecycleState) == LifecycleState.STANDBY &
                   arbitratedIntent.effectiveIntent == EffectiveIntent.BEGIN_CHARGE &
                   not eligibilityEnvelope.chargeEligible) |
                  (In(committedLifecycleState) == LifecycleState.STANDBY &
                   arbitratedIntent.effectiveIntent == EffectiveIntent.ACTIVATE &
                   not eligibilityEnvelope.flightEligible) |
                  (In(committedLifecycleState) == LifecycleState.READY &
                   arbitratedIntent.effectiveIntent == EffectiveIntent.BEGIN_FLIGHT &
                   not eligibilityEnvelope.flightEligible)) &
                 decisionSnapshot.transitionResult == TransitionResult.REJECTED &
                 decisionSnapshot.decisionReason == eligibilityEnvelope.decisionReason) |
               (arbitratedIntent.effectiveIntent != EffectiveIntent.NO_INTENT &
                arbitratedIntent.effectiveIntent != EffectiveIntent.REJECT_BEGIN_CHARGE &
                not ((In(committedLifecycleState) == LifecycleState.STANDBY &
                   arbitratedIntent.effectiveIntent == EffectiveIntent.BEGIN_CHARGE &
                   not eligibilityEnvelope.chargeEligible) |
                  (In(committedLifecycleState) == LifecycleState.STANDBY &
                   arbitratedIntent.effectiveIntent == EffectiveIntent.ACTIVATE &
                   not eligibilityEnvelope.flightEligible) |
                  (In(committedLifecycleState) == LifecycleState.READY &
                   arbitratedIntent.effectiveIntent == EffectiveIntent.BEGIN_FLIGHT &
                   not eligibilityEnvelope.flightEligible)) &
                decisionSnapshot.transitionResult == TransitionResult.REJECTED &
                decisionSnapshot.decisionReason == EligibilityReason.NONE));
    }*/

                        
           
                         
                                                                           

                
                         
                                        
                                                                                  
                         
                                      
                                                                                
                         
                                          
                                                                                       
                                                                                         
                                                                                                   
                                                                                                     
                                                                                              

             
                        
                                           
                                                               
                         
                                                           
                                                                                
                                                                                         
                                                                                          
                                                                                             
                                                                                              
                                                                                              
                                                                                               
                                                                                           
                                                                                            
                                                                                            
                                                                                              
                                                                                           
                                                                                      
                                                                                               
                                                                                          
                                                                                                
                                                                                           
                                                                                             
                                                                                        
                                                                                              
                                                                                         

                     
                           
                                                                   
                                                                                                            
                     
                                                                                             
                                                                                                        
                                                                                                  

                           
                                                                                     
                  
                                                                                            
                                                                                                         
                                                                                                
                                                                                                           
                                                         
                                                                                                
                                                                                                       
                                                         
                                                                                              
                                                                                                           
                                                        
                     
                                                                                                        
                                                                                                   
                                                                                             
                                                                                                    
                                                                                                 
                                                                                                            
                                                                                                     
                                                                                                 
                                                                                                        
                                                                                                  
                                                                                               
                                                                                                   

                           
                                                                   
                  
                                                                                                 
                                                                                                          
                                                                                              
                                                                                                          
                                                                                               
                                                                                                          
                                                                                               
                                                                                                
                                                                                                   
                                                                                                                 
                     
                                                                                                   
                                                                                                            
                                                                                                
                                                                                                             
                                                                                                  
                                                                                                         
                                                                                                     
                                                                                               
                                                                                                         
                                                                                                
                                                                                                         
                                                                                                     
                                                                                                                 
                                                                                                  
                                                                                      
                                                                                                            
                                                                                                                           
                                                                                                                
                                                                                                                     

                           
                                                                          
                                                                                                             
                                                                                                
                                                                                                             
                                                                                                    
                                                                                                               
                                                             
                                                                                                    
                                                                                                           
                                                             
                                                                                                  
                                                                                                               
                                                              
                                                                                                     
                                                                                                              
                                                                                                  
                                                                                                              
                                                                                                   
                                                                                                              
                                                                                                   
                                                                                                    
                                                                                                       
                                                                                                                      
                     
                                                                                             
                                                                                                
                                                                                                 
                                                                                                    
                                                                                                  
                                                                                                     
                                                                                               
                                                                                                  
                                                                                                
                                                                                                    
                                                                                                         
                                                                                                           
                                                                                                      
                                                                                                                   
                                                                                                          
                                                                                                                      
                                                                                                   
                                                                                                              
                                                            
                                                                                                   
                                                                                                          
                                                            
                                                                                                 
                                                                                                              
                                                             
                                                                                                          
                                                                                        
                                                                                                         
                                                                                                                   
                                                                                                      
                                                                                                                 
                                                               
                                                                                                      
                                                                                                             
                                                               
                                                                                                    
                                                                                                                 
                                                                
                                                                                                          
                                                                                                      
       
  }

  part def PowerChargeCommandPolicy :> Thread {
    port decisionSnapshot : DataPort { in :>> type : DecisionSnapshot; }
    port powerCommand : DataPort { out :>> type : PowerCommand; }
    port chargeCommand : DataPort { out :>> type : ChargeCommand; }

    language "GUMBO" /*{
      initialize
        guarantee InitialPowerCommand: powerCommand == PowerCommand.POWER_OFF;
        guarantee InitialChargeCommand: chargeCommand == ChargeCommand.CHARGE_DISABLED;
      compute
        compute_cases
          case CASE_18 "Commands are the selected next-state outputs":
            assume T;
            guarantee
              ((decisionSnapshot.nextState == DecisionNextState.OFF &
                powerCommand == PowerCommand.POWER_OFF &
                chargeCommand == ChargeCommand.CHARGE_DISABLED) |
               (decisionSnapshot.nextState == DecisionNextState.STANDBY &
                powerCommand == PowerCommand.SUPPORT_POWER &
                chargeCommand == ChargeCommand.CHARGE_DISABLED) |
               (decisionSnapshot.nextState == DecisionNextState.CHARGING &
                powerCommand == PowerCommand.POWER_OFF &
                chargeCommand == ChargeCommand.CHARGE_ENABLED) |
               (decisionSnapshot.nextState == DecisionNextState.READY &
                powerCommand == PowerCommand.SUPPORT_POWER &
                chargeCommand == ChargeCommand.CHARGE_DISABLED) |
               (decisionSnapshot.nextState == DecisionNextState.FLYING &
                powerCommand == PowerCommand.FLIGHT_POWER &
                chargeCommand == ChargeCommand.CHARGE_DISABLED));
    }*/

                        
                
                         
                                      
                                                                           
                         
                                       
                                                                                   
             
                     
                           
                                                                               
                  
                                                                                             
                                                                                                 
                                                                                                  
                                                                                               
                                                                                               
                     
                                                                                               
                                                                                  
                                                                                           
                                                                                                   
                                                                                      
                                                                                           
                                                                                                    
                                                                                  
                                                                                          
                                                                                                 
                                                                                      
                                                                                           
                                                                                                  
                                                                                     
                                                                                           
       
  }

  part def FlightAuthorizationPolicy :> Thread {
    port decisionSnapshot : DataPort { in :>> type : DecisionSnapshot; }
    port flightAuthorization : DataPort { out :>> type : FlightAuthorization; }

    language "GUMBO" /*{
      initialize
        guarantee InitialFlightAuthorization:
          flightAuthorization == FlightAuthorization.DENIED;
      compute
        compute_cases
          case CASE_19 "Only FLYING permits flight":
            assume T;
            guarantee
              ((decisionSnapshot.nextState == DecisionNextState.FLYING &
                flightAuthorization == FlightAuthorization.PERMITTED) |
               (decisionSnapshot.nextState != DecisionNextState.FLYING &
                flightAuthorization == FlightAuthorization.DENIED));
    }*/

                        
                
                         
                                             
                                                                                      
             
                     
                           
                                                                             
                  
                                                                                             
                                                                                                 
                                                                                                  
                                                                                               
                                                                                               
                     
                                                                                                  
                                                                                                 
                                                                                                  
                                                                                              
       
  }

  part def SupervisoryStatusAssessment :> Thread {
    port decisionSnapshot : DataPort { in :>> type : DecisionSnapshot; }
    port batteryQualification : DataPort { in :>> type : BatteryQualification; }
    port pilotStatus : DataPort { out :>> type : PilotStatus; }

    language "GUMBO" /*{
      initialize
        guarantee InitialPilotStatus:
          pilotStatus.lifecycleState == PilotLifecycleState.OFF &
          pilotStatus.requestDisposition == RequestDisposition.NO_CHANGE &
          pilotStatus.pilotNotice == PilotNotice.NONE;
      compute
        compute_cases
          case CASE_20 "Publish selected lifecycle, disposition, and notice":
            assume T;
            guarantee
              ((decisionSnapshot.nextState == DecisionNextState.OFF &
                pilotStatus.lifecycleState == PilotLifecycleState.OFF) |
               (decisionSnapshot.nextState == DecisionNextState.STANDBY &
                pilotStatus.lifecycleState == PilotLifecycleState.STANDBY) |
               (decisionSnapshot.nextState == DecisionNextState.CHARGING &
                pilotStatus.lifecycleState == PilotLifecycleState.CHARGING) |
               (decisionSnapshot.nextState == DecisionNextState.READY &
                pilotStatus.lifecycleState == PilotLifecycleState.READY) |
               (decisionSnapshot.nextState == DecisionNextState.FLYING &
                pilotStatus.lifecycleState == PilotLifecycleState.FLYING)) &
              ((decisionSnapshot.transitionResult == TransitionResult.NO_CHANGE &
                pilotStatus.requestDisposition == RequestDisposition.NO_CHANGE) |
               (decisionSnapshot.transitionResult == TransitionResult.ACCEPTED &
                pilotStatus.requestDisposition == RequestDisposition.ACCEPTED) |
               (decisionSnapshot.transitionResult == TransitionResult.REJECTED &
                pilotStatus.requestDisposition == RequestDisposition.REJECTED) |
               (decisionSnapshot.transitionResult == TransitionResult.RECOVERY_APPLIED &
                pilotStatus.requestDisposition == RequestDisposition.RECOVERY_APPLIED) |
               (decisionSnapshot.transitionResult == TransitionResult.FRESH_REQUEST_PREEMPTED &
                pilotStatus.requestDisposition == RequestDisposition.PREEMPTED)) &
              ((batteryQualification == BatteryQualification.UNAVAILABLE &
                pilotStatus.pilotNotice == PilotNotice.BATTERY_UNAVAILABLE) |
               (batteryQualification == BatteryQualification.INSUFFICIENT &
                pilotStatus.pilotNotice == PilotNotice.BATTERY_LOW) |
               (batteryQualification == BatteryQualification.SUFFICIENT &
                decisionSnapshot.decisionReason == EligibilityReason.BATTERY_UNAVAILABLE &
                pilotStatus.pilotNotice == PilotNotice.BATTERY_UNAVAILABLE) |
               (batteryQualification == BatteryQualification.SUFFICIENT &
                decisionSnapshot.decisionReason == EligibilityReason.BATTERY_LOW &
                pilotStatus.pilotNotice == PilotNotice.BATTERY_LOW) |
               (batteryQualification == BatteryQualification.SUFFICIENT &
                decisionSnapshot.decisionReason == EligibilityReason.FLIGHT_UNAVAILABLE &
                pilotStatus.pilotNotice == PilotNotice.FLIGHT_UNAVAILABLE) |
               (batteryQualification == BatteryQualification.SUFFICIENT &
                decisionSnapshot.decisionReason == EligibilityReason.FLIGHT_NOT_READY &
                pilotStatus.pilotNotice == PilotNotice.FLIGHT_NOT_READY) |
               (batteryQualification == BatteryQualification.SUFFICIENT &
                decisionSnapshot.decisionReason == EligibilityReason.CHARGER_DISCONNECTED &
                pilotStatus.pilotNotice == PilotNotice.CHARGER_DISCONNECTED) |
               (batteryQualification == BatteryQualification.SUFFICIENT &
                decisionSnapshot.decisionReason == EligibilityReason.NONE &
                decisionSnapshot.transitionResult == TransitionResult.REJECTED &
                pilotStatus.pilotNotice == PilotNotice.INAPPLICABLE_REQUEST) |
               (batteryQualification == BatteryQualification.SUFFICIENT &
                decisionSnapshot.decisionReason == EligibilityReason.NONE &
                decisionSnapshot.transitionResult != TransitionResult.REJECTED &
                pilotStatus.pilotNotice == PilotNotice.NONE));
    }*/

                        
                
                         
                                     
                                                                                           
                                                                                                    
                                                                                
             
                     
                           
                                                                                   
                  
                                                                                                         
                                                                                                        
                                                                                                        
                                                                                                                
                                                                                                                      
                     
                                                                                               
                                                                                                  
                                                                                                   
                                                                                                      
                                                                                                    
                                                                                                       
                                                                                                 
                                                                                                    
                                                                                                  
                                                                                                      
                                                                                                           
                                                                                                           
                                                                                                          
                                                                                                          
                                                                                                          
                                                                                                          
                                                                                                                  
                                                                                                                  
                                                                                                                         
                                                                                                            
                                                                                                    
                                                                                                       
                                                                                                     
                                                                                               
                                                                                                   
                                                                                                                    
                                                                                                       
                                                                                                   
                                                                                                            
                                                                                               
                                                                                                   
                                                                                                                   
                                                                                                      
                                                                                                   
                                                                                                                 
                                                                                                    
                                                                                                   
                                                                                                                     
                                                                                                        
                                                                                                   
                                                                                                     
                                                                                                          
                                                                                                        
                                                                                                   
                                                                                                     
                                                                                                          
                                                                                        
       
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
