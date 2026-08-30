// Architecture checkpoint: approved types, ports, usages, and connections only.
// No GUMBO behavior is present in this retained stage.

// @trace SCOPE-IN-01
package Drone_Lifecycle_Governor {
  private import HAMR::*;

  // @trace MON-01
  enum def LifecycleRequest {
    enum NO_REQUEST; enum SWITCH_ON; enum SWITCH_OFF;
    enum BEGIN_CHARGE; enum END_CHARGE; enum ACTIVATE;
    enum DEACTIVATE; enum BEGIN_FLIGHT; enum END_FLIGHT;
  }
  // @trace MON-02
  enum def ChargerState { enum DISCONNECTED; enum CONNECTED; }
  // @trace MON-03
  enum def BatteryCapacityBand { enum LOW; enum USABLE; }
  // @trace MON-04
  enum def BatteryCheck { enum INVALID; enum VALID; }
  // @trace MON-05
  enum def NavigationCondition { enum INVALID; enum NOT_READY; enum READY; }
  // @trace MON-06
  enum def RadioCondition { enum INVALID; enum NOT_READY; enum READY; }

  // @trace TYPE-01
  enum def LifecycleState { enum OFF; enum STANDBY; enum CHARGING; enum READY; enum FLYING; }
  // @trace TYPE-07
  enum def DecisionPreState { enum OFF; enum STANDBY; enum CHARGING; enum READY; enum FLYING; }
  // @trace TYPE-07
  enum def DecisionNextState { enum OFF; enum STANDBY; enum CHARGING; enum READY; enum FLYING; }
  // @trace TYPE-09
  enum def PilotLifecycleState { enum OFF; enum STANDBY; enum CHARGING; enum READY; enum FLYING; }
  // @trace TYPE-02
  enum def BatteryQualification { enum UNAVAILABLE; enum INSUFFICIENT; enum SUFFICIENT; }
  // @trace TYPE-03
  enum def FlightQualification { enum UNAVAILABLE; enum NOT_READY; enum READY; }
  // @trace TYPE-04
  enum def RecoveryProposal {
    enum NO_RECOVERY; enum TO_STANDBY_BATTERY;
    enum TO_STANDBY_READINESS; enum TO_STANDBY_CHARGE_PATH;
  }
  // @trace TYPE-05
  enum def EffectiveIntent {
    enum NO_INTENT; enum SWITCH_ON; enum SWITCH_OFF;
    enum BEGIN_CHARGE; enum END_CHARGE; enum ACTIVATE; enum DEACTIVATE;
    enum BEGIN_FLIGHT; enum END_FLIGHT; enum RECOVER_TO_STANDBY;
    enum REJECT_BEGIN_CHARGE;
  }
  // @trace TYPE-06
  enum def EligibilityReason {
    enum NONE; enum BATTERY_UNAVAILABLE; enum BATTERY_LOW;
    enum FLIGHT_UNAVAILABLE; enum FLIGHT_NOT_READY; enum CHARGER_DISCONNECTED;
  }
  // @trace TYPE-08
  enum def TransitionResult {
    enum NO_CHANGE; enum ACCEPTED; enum REJECTED;
    enum RECOVERY_APPLIED; enum FRESH_REQUEST_PREEMPTED;
  }
  // @trace TYPE-09
  enum def RequestDisposition {
    enum NO_CHANGE; enum ACCEPTED; enum REJECTED;
    enum RECOVERY_APPLIED; enum PREEMPTED;
  }
  // @trace TYPE-09
  enum def PilotNotice {
    enum NONE; enum BATTERY_UNAVAILABLE; enum BATTERY_LOW;
    enum FLIGHT_UNAVAILABLE; enum FLIGHT_NOT_READY;
    enum CHARGER_DISCONNECTED; enum INAPPLICABLE_REQUEST;
  }
  // @trace TYPE-10
  enum def FreshRequestPreemption { enum NOT_PREEMPTED; enum PREEMPTED; }
  // @trace CTRL-01
  enum def PowerCommand { enum POWER_OFF; enum SUPPORT_POWER; enum FLIGHT_POWER; }
  // @trace CTRL-02
  enum def ChargeCommand { enum CHARGE_DISABLED; enum CHARGE_ENABLED; }
  // @trace CTRL-03
  enum def FlightAuthorization { enum DENIED; enum PERMITTED; }

  // Every field inspected by GUMBO is deliberately an attribute, not a nested part.
  // @trace TYPE-06
  part def EligibilityEnvelope :> Data {
    attribute flightEligible : Base_Types::Boolean;
    attribute chargeEligible : Base_Types::Boolean;
    attribute decisionReason : EligibilityReason;
  }
  // @trace TYPE-10
  part def ArbitratedIntent :> Data {
    attribute effectiveIntent : EffectiveIntent;
    attribute preemption : FreshRequestPreemption;
  }
  // @trace TYPE-07
  part def DecisionSnapshot :> Data {
    attribute preState : DecisionPreState;
    attribute nextState : DecisionNextState;
    attribute effectiveIntent : EffectiveIntent;
    attribute transitionResult : TransitionResult;
    attribute decisionReason : EligibilityReason;
  }
  // @trace CTRL-04
  part def PilotStatus :> Data {
    attribute lifecycleState : PilotLifecycleState;
    attribute requestDisposition : RequestDisposition;
    attribute pilotNotice : PilotNotice;
  }

  // @trace PART-01
  part def RequestArbiter :> Thread {
    // @trace INT-01
    port pilotRequest : DataPort { in :>> type : LifecycleRequest; }
    // @trace INT-02
    port chargerState : DataPort { in :>> type : ChargerState; }
    // @trace INT-12
    port recoveryProposal : DataPort { in :>> type : RecoveryProposal; }
    // @trace INT-14
    port arbitratedIntent : DataPort { out :>> type : ArbitratedIntent; }

    language "GUMBO" /*{
      compute
        compute_cases
          // @trace CASE-11
          case CASE_11 "Shutdown has highest priority":
            assume pilotRequest == Drone_Lifecycle_Governor::LifecycleRequest.SWITCH_OFF;
            guarantee
              arbitratedIntent.effectiveIntent == Drone_Lifecycle_Governor::EffectiveIntent.SWITCH_OFF &
              arbitratedIntent.preemption == Drone_Lifecycle_Governor::FreshRequestPreemption.NOT_PREEMPTED;

          // @trace CASE-12
          case CASE_12 "Recovery wins over every non-shutdown fresh request":
            assume pilotRequest != Drone_Lifecycle_Governor::LifecycleRequest.SWITCH_OFF &
              recoveryProposal != Drone_Lifecycle_Governor::RecoveryProposal.NO_RECOVERY;
            guarantee
              arbitratedIntent.effectiveIntent == Drone_Lifecycle_Governor::EffectiveIntent.RECOVER_TO_STANDBY &
              ((pilotRequest == Drone_Lifecycle_Governor::LifecycleRequest.NO_REQUEST &
                arbitratedIntent.preemption == Drone_Lifecycle_Governor::FreshRequestPreemption.NOT_PREEMPTED) |
               (pilotRequest != Drone_Lifecycle_Governor::LifecycleRequest.NO_REQUEST &
                arbitratedIntent.preemption == Drone_Lifecycle_Governor::FreshRequestPreemption.PREEMPTED));

          // @trace CASE-13
          case CASE_13 "Classify the remaining fresh request including disconnected charge":
            assume pilotRequest != Drone_Lifecycle_Governor::LifecycleRequest.SWITCH_OFF &
              recoveryProposal == Drone_Lifecycle_Governor::RecoveryProposal.NO_RECOVERY;
            guarantee
              arbitratedIntent.preemption == Drone_Lifecycle_Governor::FreshRequestPreemption.NOT_PREEMPTED &
              ((pilotRequest == Drone_Lifecycle_Governor::LifecycleRequest.NO_REQUEST &
                arbitratedIntent.effectiveIntent == Drone_Lifecycle_Governor::EffectiveIntent.NO_INTENT) |
               (pilotRequest == Drone_Lifecycle_Governor::LifecycleRequest.SWITCH_ON &
                arbitratedIntent.effectiveIntent == Drone_Lifecycle_Governor::EffectiveIntent.SWITCH_ON) |
               (pilotRequest == Drone_Lifecycle_Governor::LifecycleRequest.BEGIN_CHARGE &
                chargerState == Drone_Lifecycle_Governor::ChargerState.DISCONNECTED &
                arbitratedIntent.effectiveIntent == Drone_Lifecycle_Governor::EffectiveIntent.REJECT_BEGIN_CHARGE) |
               (pilotRequest == Drone_Lifecycle_Governor::LifecycleRequest.BEGIN_CHARGE &
                chargerState == Drone_Lifecycle_Governor::ChargerState.CONNECTED &
                arbitratedIntent.effectiveIntent == Drone_Lifecycle_Governor::EffectiveIntent.BEGIN_CHARGE) |
               (pilotRequest == Drone_Lifecycle_Governor::LifecycleRequest.END_CHARGE &
                arbitratedIntent.effectiveIntent == Drone_Lifecycle_Governor::EffectiveIntent.END_CHARGE) |
               (pilotRequest == Drone_Lifecycle_Governor::LifecycleRequest.ACTIVATE &
                arbitratedIntent.effectiveIntent == Drone_Lifecycle_Governor::EffectiveIntent.ACTIVATE) |
               (pilotRequest == Drone_Lifecycle_Governor::LifecycleRequest.DEACTIVATE &
                arbitratedIntent.effectiveIntent == Drone_Lifecycle_Governor::EffectiveIntent.DEACTIVATE) |
               (pilotRequest == Drone_Lifecycle_Governor::LifecycleRequest.BEGIN_FLIGHT &
                arbitratedIntent.effectiveIntent == Drone_Lifecycle_Governor::EffectiveIntent.BEGIN_FLIGHT) |
               (pilotRequest == Drone_Lifecycle_Governor::LifecycleRequest.END_FLIGHT &
                arbitratedIntent.effectiveIntent == Drone_Lifecycle_Governor::EffectiveIntent.END_FLIGHT));
    }*/
  }

  // @trace PART-02
  part def BatteryQualificationOwner :> Thread {
    // @trace INT-04
    port batteryCapacity : DataPort { in :>> type : BatteryCapacityBand; }
    // @trace INT-05
    port batteryCheck : DataPort { in :>> type : BatteryCheck; }
    // @trace INT-08
    port batteryQualification : DataPort { out :>> type : BatteryQualification; }

    language "GUMBO" /*{
      compute
        compute_cases
          // @trace CASE-01
          case CASE_01 "Invalid check makes capacity unavailable":
            assume batteryCheck == Drone_Lifecycle_Governor::BatteryCheck.INVALID;
            guarantee batteryQualification == Drone_Lifecycle_Governor::BatteryQualification.UNAVAILABLE;
          // @trace CASE-02
          case CASE_02 "Valid low capacity is insufficient":
            assume batteryCheck == Drone_Lifecycle_Governor::BatteryCheck.VALID &
              batteryCapacity == Drone_Lifecycle_Governor::BatteryCapacityBand.LOW;
            guarantee batteryQualification == Drone_Lifecycle_Governor::BatteryQualification.INSUFFICIENT;
          // @trace CASE-03
          case CASE_03 "Valid usable capacity is sufficient":
            assume batteryCheck == Drone_Lifecycle_Governor::BatteryCheck.VALID &
              batteryCapacity == Drone_Lifecycle_Governor::BatteryCapacityBand.USABLE;
            guarantee batteryQualification == Drone_Lifecycle_Governor::BatteryQualification.SUFFICIENT;
    }*/
  }

  // @trace PART-03
  part def FlightReadinessOwner :> Thread {
    // @trace INT-06
    port navigationCondition : DataPort { in :>> type : NavigationCondition; }
    // @trace INT-07
    port radioCondition : DataPort { in :>> type : RadioCondition; }
    // @trace INT-10
    port flightQualification : DataPort { out :>> type : FlightQualification; }

    language "GUMBO" /*{
      compute
        compute_cases
          // @trace CASE-04
          case CASE_04 "Either invalid observation makes readiness unavailable":
            assume navigationCondition == Drone_Lifecycle_Governor::NavigationCondition.INVALID |
              radioCondition == Drone_Lifecycle_Governor::RadioCondition.INVALID;
            guarantee flightQualification == Drone_Lifecycle_Governor::FlightQualification.UNAVAILABLE;
          // @trace CASE-05
          case CASE_05 "A non-invalid not-ready observation blocks readiness":
            assume navigationCondition != Drone_Lifecycle_Governor::NavigationCondition.INVALID &
              radioCondition != Drone_Lifecycle_Governor::RadioCondition.INVALID &
              (navigationCondition == Drone_Lifecycle_Governor::NavigationCondition.NOT_READY |
               radioCondition == Drone_Lifecycle_Governor::RadioCondition.NOT_READY);
            guarantee flightQualification == Drone_Lifecycle_Governor::FlightQualification.NOT_READY;
          // @trace CASE-06
          case CASE_06 "Both observations ready establish combined readiness":
            assume navigationCondition == Drone_Lifecycle_Governor::NavigationCondition.READY &
              radioCondition == Drone_Lifecycle_Governor::RadioCondition.READY;
            guarantee flightQualification == Drone_Lifecycle_Governor::FlightQualification.READY;
    }*/
  }

  // @trace PART-04
  part def OperationalEligibilityOwner :> Thread {
    // @trace INT-03
    port chargerState : DataPort { in :>> type : ChargerState; }
    // @trace INT-08
    port batteryQualification : DataPort { in :>> type : BatteryQualification; }
    // @trace INT-10
    port flightQualification : DataPort { in :>> type : FlightQualification; }
    // @trace INT-11
    port currentLifecycleState : DataPort { in :>> type : LifecycleState; }
    // @trace INT-12
    port recoveryProposal : DataPort { out :>> type : RecoveryProposal; }
    // @trace INT-13
    port eligibilityEnvelope : DataPort { out :>> type : EligibilityEnvelope; }

    language "GUMBO" /*{
      compute
        compute_cases
          // @trace CASE-07
          case CASE_07 "Battery degradation in ready or flying selects battery recovery":
            assume (currentLifecycleState == Drone_Lifecycle_Governor::LifecycleState.READY |
                    currentLifecycleState == Drone_Lifecycle_Governor::LifecycleState.FLYING) &
              batteryQualification != Drone_Lifecycle_Governor::BatteryQualification.SUFFICIENT;
            guarantee
              eligibilityEnvelope.flightEligible == F &
              eligibilityEnvelope.chargeEligible ==
                (chargerState == Drone_Lifecycle_Governor::ChargerState.CONNECTED &
                 batteryQualification != Drone_Lifecycle_Governor::BatteryQualification.UNAVAILABLE) &
              recoveryProposal == Drone_Lifecycle_Governor::RecoveryProposal.TO_STANDBY_BATTERY &
              ((batteryQualification == Drone_Lifecycle_Governor::BatteryQualification.UNAVAILABLE &
                eligibilityEnvelope.decisionReason == Drone_Lifecycle_Governor::EligibilityReason.BATTERY_UNAVAILABLE) |
               (batteryQualification == Drone_Lifecycle_Governor::BatteryQualification.INSUFFICIENT &
                eligibilityEnvelope.decisionReason == Drone_Lifecycle_Governor::EligibilityReason.BATTERY_LOW));

          // @trace CASE-08
          case CASE_08 "Readiness degradation follows sufficient battery":
            assume (currentLifecycleState == Drone_Lifecycle_Governor::LifecycleState.READY |
                    currentLifecycleState == Drone_Lifecycle_Governor::LifecycleState.FLYING) &
              batteryQualification == Drone_Lifecycle_Governor::BatteryQualification.SUFFICIENT &
              flightQualification != Drone_Lifecycle_Governor::FlightQualification.READY;
            guarantee
              eligibilityEnvelope.flightEligible == F &
              eligibilityEnvelope.chargeEligible ==
                (chargerState == Drone_Lifecycle_Governor::ChargerState.CONNECTED) &
              recoveryProposal == Drone_Lifecycle_Governor::RecoveryProposal.TO_STANDBY_READINESS &
              ((flightQualification == Drone_Lifecycle_Governor::FlightQualification.UNAVAILABLE &
                eligibilityEnvelope.decisionReason == Drone_Lifecycle_Governor::EligibilityReason.FLIGHT_UNAVAILABLE) |
               (flightQualification == Drone_Lifecycle_Governor::FlightQualification.NOT_READY &
                eligibilityEnvelope.decisionReason == Drone_Lifecycle_Governor::EligibilityReason.FLIGHT_NOT_READY));

          // @trace CASE-09
          case CASE_09 "Charging loses its charger or usable battery path":
            assume currentLifecycleState == Drone_Lifecycle_Governor::LifecycleState.CHARGING &
              (chargerState == Drone_Lifecycle_Governor::ChargerState.DISCONNECTED |
               batteryQualification == Drone_Lifecycle_Governor::BatteryQualification.UNAVAILABLE);
            guarantee
              eligibilityEnvelope.flightEligible ==
                (batteryQualification == Drone_Lifecycle_Governor::BatteryQualification.SUFFICIENT &
                 flightQualification == Drone_Lifecycle_Governor::FlightQualification.READY) &
              eligibilityEnvelope.chargeEligible == F &
              recoveryProposal == Drone_Lifecycle_Governor::RecoveryProposal.TO_STANDBY_CHARGE_PATH &
              ((chargerState == Drone_Lifecycle_Governor::ChargerState.DISCONNECTED &
                eligibilityEnvelope.decisionReason == Drone_Lifecycle_Governor::EligibilityReason.CHARGER_DISCONNECTED) |
               (chargerState == Drone_Lifecycle_Governor::ChargerState.CONNECTED &
                batteryQualification == Drone_Lifecycle_Governor::BatteryQualification.UNAVAILABLE &
                eligibilityEnvelope.decisionReason == Drone_Lifecycle_Governor::EligibilityReason.BATTERY_UNAVAILABLE));

          // @trace CASE-10
          case CASE_10 "All remaining states have no recovery and use qualification precedence":
            assume not((currentLifecycleState == Drone_Lifecycle_Governor::LifecycleState.READY |
                        currentLifecycleState == Drone_Lifecycle_Governor::LifecycleState.FLYING) &
                       batteryQualification != Drone_Lifecycle_Governor::BatteryQualification.SUFFICIENT) &
              not((currentLifecycleState == Drone_Lifecycle_Governor::LifecycleState.READY |
                   currentLifecycleState == Drone_Lifecycle_Governor::LifecycleState.FLYING) &
                  batteryQualification == Drone_Lifecycle_Governor::BatteryQualification.SUFFICIENT &
                  flightQualification != Drone_Lifecycle_Governor::FlightQualification.READY) &
              not(currentLifecycleState == Drone_Lifecycle_Governor::LifecycleState.CHARGING &
                  (chargerState == Drone_Lifecycle_Governor::ChargerState.DISCONNECTED |
                   batteryQualification == Drone_Lifecycle_Governor::BatteryQualification.UNAVAILABLE));
            guarantee
              recoveryProposal == Drone_Lifecycle_Governor::RecoveryProposal.NO_RECOVERY &
              eligibilityEnvelope.flightEligible ==
                (batteryQualification == Drone_Lifecycle_Governor::BatteryQualification.SUFFICIENT &
                 flightQualification == Drone_Lifecycle_Governor::FlightQualification.READY) &
              eligibilityEnvelope.chargeEligible ==
                (chargerState == Drone_Lifecycle_Governor::ChargerState.CONNECTED &
                 batteryQualification != Drone_Lifecycle_Governor::BatteryQualification.UNAVAILABLE) &
              ((batteryQualification == Drone_Lifecycle_Governor::BatteryQualification.UNAVAILABLE &
                eligibilityEnvelope.decisionReason == Drone_Lifecycle_Governor::EligibilityReason.BATTERY_UNAVAILABLE) |
               (batteryQualification == Drone_Lifecycle_Governor::BatteryQualification.INSUFFICIENT &
                eligibilityEnvelope.decisionReason == Drone_Lifecycle_Governor::EligibilityReason.BATTERY_LOW) |
               (batteryQualification == Drone_Lifecycle_Governor::BatteryQualification.SUFFICIENT &
                flightQualification == Drone_Lifecycle_Governor::FlightQualification.UNAVAILABLE &
                eligibilityEnvelope.decisionReason == Drone_Lifecycle_Governor::EligibilityReason.FLIGHT_UNAVAILABLE) |
               (batteryQualification == Drone_Lifecycle_Governor::BatteryQualification.SUFFICIENT &
                flightQualification == Drone_Lifecycle_Governor::FlightQualification.NOT_READY &
                eligibilityEnvelope.decisionReason == Drone_Lifecycle_Governor::EligibilityReason.FLIGHT_NOT_READY) |
               (batteryQualification == Drone_Lifecycle_Governor::BatteryQualification.SUFFICIENT &
                flightQualification == Drone_Lifecycle_Governor::FlightQualification.READY &
                eligibilityEnvelope.decisionReason == Drone_Lifecycle_Governor::EligibilityReason.NONE));
    }*/
  }

  // @trace PART-05
  part def LifecycleStateGovernor :> Thread {
    // @trace INT-14
    port arbitratedIntent : DataPort { in :>> type : ArbitratedIntent; }
    // @trace INT-13
    port eligibilityEnvelope : DataPort { in :>> type : EligibilityEnvelope; }
    // @trace INT-11
    port currentLifecycleState : DataPort { out :>> type : LifecycleState; }
    // @trace INT-15
    port decisionSnapshot : DataPort { out :>> type : DecisionSnapshot; }

    language "GUMBO" /*{
      state
        // @trace INIT-01
        committedLifecycleState : Drone_Lifecycle_Governor::LifecycleState;

      initialize
        // @trace INIT-01
        guarantee InitialLifecycleState:
          committedLifecycleState == Drone_Lifecycle_Governor::LifecycleState.OFF;
        // @trace INIT-01
        guarantee InitialCurrentState:
          currentLifecycleState == Drone_Lifecycle_Governor::LifecycleState.OFF;
        // @trace INIT-01
        guarantee InitialDecisionSnapshot:
          decisionSnapshot.preState == Drone_Lifecycle_Governor::DecisionPreState.OFF &
          decisionSnapshot.nextState == Drone_Lifecycle_Governor::DecisionNextState.OFF &
          decisionSnapshot.effectiveIntent == Drone_Lifecycle_Governor::EffectiveIntent.NO_INTENT &
          decisionSnapshot.transitionResult == Drone_Lifecycle_Governor::TransitionResult.NO_CHANGE &
          decisionSnapshot.decisionReason == Drone_Lifecycle_Governor::EligibilityReason.NONE;

      compute
        // @trace ASM-04
        guarantee PublishCommittedPreState:
          currentLifecycleState == In(committedLifecycleState);
        // @trace TYPE-07
        guarantee PreserveDecisionInputsAndCommitNextState:
          decisionSnapshot.effectiveIntent == arbitratedIntent.effectiveIntent &
          ((In(committedLifecycleState) == Drone_Lifecycle_Governor::LifecycleState.OFF &
            decisionSnapshot.preState == Drone_Lifecycle_Governor::DecisionPreState.OFF) |
           (In(committedLifecycleState) == Drone_Lifecycle_Governor::LifecycleState.STANDBY &
            decisionSnapshot.preState == Drone_Lifecycle_Governor::DecisionPreState.STANDBY) |
           (In(committedLifecycleState) == Drone_Lifecycle_Governor::LifecycleState.CHARGING &
            decisionSnapshot.preState == Drone_Lifecycle_Governor::DecisionPreState.CHARGING) |
           (In(committedLifecycleState) == Drone_Lifecycle_Governor::LifecycleState.READY &
            decisionSnapshot.preState == Drone_Lifecycle_Governor::DecisionPreState.READY) |
           (In(committedLifecycleState) == Drone_Lifecycle_Governor::LifecycleState.FLYING &
            decisionSnapshot.preState == Drone_Lifecycle_Governor::DecisionPreState.FLYING)) &
          ((decisionSnapshot.nextState == Drone_Lifecycle_Governor::DecisionNextState.OFF &
            committedLifecycleState == Drone_Lifecycle_Governor::LifecycleState.OFF) |
           (decisionSnapshot.nextState == Drone_Lifecycle_Governor::DecisionNextState.STANDBY &
            committedLifecycleState == Drone_Lifecycle_Governor::LifecycleState.STANDBY) |
           (decisionSnapshot.nextState == Drone_Lifecycle_Governor::DecisionNextState.CHARGING &
            committedLifecycleState == Drone_Lifecycle_Governor::LifecycleState.CHARGING) |
           (decisionSnapshot.nextState == Drone_Lifecycle_Governor::DecisionNextState.READY &
            committedLifecycleState == Drone_Lifecycle_Governor::LifecycleState.READY) |
           (decisionSnapshot.nextState == Drone_Lifecycle_Governor::DecisionNextState.FLYING &
            committedLifecycleState == Drone_Lifecycle_Governor::LifecycleState.FLYING));

        compute_cases
          // @trace CASE-14
          case CASE_14 "Shutdown is accepted from every pre-state":
            assume arbitratedIntent.effectiveIntent == Drone_Lifecycle_Governor::EffectiveIntent.SWITCH_OFF;
            guarantee
              decisionSnapshot.nextState == Drone_Lifecycle_Governor::DecisionNextState.OFF &
              decisionSnapshot.transitionResult == Drone_Lifecycle_Governor::TransitionResult.ACCEPTED &
              decisionSnapshot.decisionReason == Drone_Lifecycle_Governor::EligibilityReason.NONE;

          // @trace CASE-15
          case CASE_15 "Guarded progression enters standby charging ready or flying":
            assume
              (In(committedLifecycleState) == Drone_Lifecycle_Governor::LifecycleState.OFF &
               arbitratedIntent.effectiveIntent == Drone_Lifecycle_Governor::EffectiveIntent.SWITCH_ON) |
              (In(committedLifecycleState) == Drone_Lifecycle_Governor::LifecycleState.STANDBY &
               arbitratedIntent.effectiveIntent == Drone_Lifecycle_Governor::EffectiveIntent.BEGIN_CHARGE &
               eligibilityEnvelope.chargeEligible == T) |
              (In(committedLifecycleState) == Drone_Lifecycle_Governor::LifecycleState.STANDBY &
               arbitratedIntent.effectiveIntent == Drone_Lifecycle_Governor::EffectiveIntent.ACTIVATE &
               eligibilityEnvelope.flightEligible == T) |
              (In(committedLifecycleState) == Drone_Lifecycle_Governor::LifecycleState.READY &
               arbitratedIntent.effectiveIntent == Drone_Lifecycle_Governor::EffectiveIntent.BEGIN_FLIGHT &
               eligibilityEnvelope.flightEligible == T);
            guarantee
              decisionSnapshot.transitionResult == Drone_Lifecycle_Governor::TransitionResult.ACCEPTED &
              decisionSnapshot.decisionReason == Drone_Lifecycle_Governor::EligibilityReason.NONE &
              ((In(committedLifecycleState) == Drone_Lifecycle_Governor::LifecycleState.OFF &
                decisionSnapshot.nextState == Drone_Lifecycle_Governor::DecisionNextState.STANDBY) |
               (In(committedLifecycleState) == Drone_Lifecycle_Governor::LifecycleState.STANDBY &
                arbitratedIntent.effectiveIntent == Drone_Lifecycle_Governor::EffectiveIntent.BEGIN_CHARGE &
                decisionSnapshot.nextState == Drone_Lifecycle_Governor::DecisionNextState.CHARGING) |
               (In(committedLifecycleState) == Drone_Lifecycle_Governor::LifecycleState.STANDBY &
                arbitratedIntent.effectiveIntent == Drone_Lifecycle_Governor::EffectiveIntent.ACTIVATE &
                decisionSnapshot.nextState == Drone_Lifecycle_Governor::DecisionNextState.READY) |
               (In(committedLifecycleState) == Drone_Lifecycle_Governor::LifecycleState.READY &
                decisionSnapshot.nextState == Drone_Lifecycle_Governor::DecisionNextState.FLYING));

          // @trace CASE-16
          case CASE_16 "Admitted retreat and recovery transitions":
            assume
              (In(committedLifecycleState) == Drone_Lifecycle_Governor::LifecycleState.CHARGING &
               arbitratedIntent.effectiveIntent == Drone_Lifecycle_Governor::EffectiveIntent.END_CHARGE) |
              (In(committedLifecycleState) == Drone_Lifecycle_Governor::LifecycleState.READY &
               arbitratedIntent.effectiveIntent == Drone_Lifecycle_Governor::EffectiveIntent.DEACTIVATE) |
              (In(committedLifecycleState) == Drone_Lifecycle_Governor::LifecycleState.FLYING &
               arbitratedIntent.effectiveIntent == Drone_Lifecycle_Governor::EffectiveIntent.END_FLIGHT) |
              ((In(committedLifecycleState) == Drone_Lifecycle_Governor::LifecycleState.READY |
                In(committedLifecycleState) == Drone_Lifecycle_Governor::LifecycleState.FLYING |
                In(committedLifecycleState) == Drone_Lifecycle_Governor::LifecycleState.CHARGING) &
               arbitratedIntent.effectiveIntent == Drone_Lifecycle_Governor::EffectiveIntent.RECOVER_TO_STANDBY);
            guarantee
              (((In(committedLifecycleState) == Drone_Lifecycle_Governor::LifecycleState.CHARGING &
                 arbitratedIntent.effectiveIntent == Drone_Lifecycle_Governor::EffectiveIntent.END_CHARGE) |
                (In(committedLifecycleState) == Drone_Lifecycle_Governor::LifecycleState.READY &
                 arbitratedIntent.effectiveIntent == Drone_Lifecycle_Governor::EffectiveIntent.DEACTIVATE)) &
               decisionSnapshot.nextState == Drone_Lifecycle_Governor::DecisionNextState.STANDBY &
               decisionSnapshot.transitionResult == Drone_Lifecycle_Governor::TransitionResult.ACCEPTED &
               decisionSnapshot.decisionReason == Drone_Lifecycle_Governor::EligibilityReason.NONE) |
              (In(committedLifecycleState) == Drone_Lifecycle_Governor::LifecycleState.FLYING &
               arbitratedIntent.effectiveIntent == Drone_Lifecycle_Governor::EffectiveIntent.END_FLIGHT &
               decisionSnapshot.nextState == Drone_Lifecycle_Governor::DecisionNextState.READY &
               decisionSnapshot.transitionResult == Drone_Lifecycle_Governor::TransitionResult.ACCEPTED &
               decisionSnapshot.decisionReason == Drone_Lifecycle_Governor::EligibilityReason.NONE) |
              (arbitratedIntent.effectiveIntent == Drone_Lifecycle_Governor::EffectiveIntent.RECOVER_TO_STANDBY &
               decisionSnapshot.nextState == Drone_Lifecycle_Governor::DecisionNextState.STANDBY &
               decisionSnapshot.decisionReason == eligibilityEnvelope.decisionReason &
               ((arbitratedIntent.preemption == Drone_Lifecycle_Governor::FreshRequestPreemption.PREEMPTED &
                 decisionSnapshot.transitionResult == Drone_Lifecycle_Governor::TransitionResult.FRESH_REQUEST_PREEMPTED) |
                (arbitratedIntent.preemption == Drone_Lifecycle_Governor::FreshRequestPreemption.NOT_PREEMPTED &
                 decisionSnapshot.transitionResult == Drone_Lifecycle_Governor::TransitionResult.RECOVERY_APPLIED)));

          // @trace CASE-17
          case CASE_17 "Every other intent holds state and is classified":
            assume arbitratedIntent.effectiveIntent != Drone_Lifecycle_Governor::EffectiveIntent.SWITCH_OFF &
              not((In(committedLifecycleState) == Drone_Lifecycle_Governor::LifecycleState.OFF &
                   arbitratedIntent.effectiveIntent == Drone_Lifecycle_Governor::EffectiveIntent.SWITCH_ON) |
                  (In(committedLifecycleState) == Drone_Lifecycle_Governor::LifecycleState.STANDBY &
                   arbitratedIntent.effectiveIntent == Drone_Lifecycle_Governor::EffectiveIntent.BEGIN_CHARGE &
                   eligibilityEnvelope.chargeEligible == T) |
                  (In(committedLifecycleState) == Drone_Lifecycle_Governor::LifecycleState.STANDBY &
                   arbitratedIntent.effectiveIntent == Drone_Lifecycle_Governor::EffectiveIntent.ACTIVATE &
                   eligibilityEnvelope.flightEligible == T) |
                  (In(committedLifecycleState) == Drone_Lifecycle_Governor::LifecycleState.READY &
                   arbitratedIntent.effectiveIntent == Drone_Lifecycle_Governor::EffectiveIntent.BEGIN_FLIGHT &
                   eligibilityEnvelope.flightEligible == T)) &
              not((In(committedLifecycleState) == Drone_Lifecycle_Governor::LifecycleState.CHARGING &
                   arbitratedIntent.effectiveIntent == Drone_Lifecycle_Governor::EffectiveIntent.END_CHARGE) |
                  (In(committedLifecycleState) == Drone_Lifecycle_Governor::LifecycleState.READY &
                   arbitratedIntent.effectiveIntent == Drone_Lifecycle_Governor::EffectiveIntent.DEACTIVATE) |
                  (In(committedLifecycleState) == Drone_Lifecycle_Governor::LifecycleState.FLYING &
                   arbitratedIntent.effectiveIntent == Drone_Lifecycle_Governor::EffectiveIntent.END_FLIGHT) |
                  ((In(committedLifecycleState) == Drone_Lifecycle_Governor::LifecycleState.READY |
                    In(committedLifecycleState) == Drone_Lifecycle_Governor::LifecycleState.FLYING |
                    In(committedLifecycleState) == Drone_Lifecycle_Governor::LifecycleState.CHARGING) &
                   arbitratedIntent.effectiveIntent == Drone_Lifecycle_Governor::EffectiveIntent.RECOVER_TO_STANDBY));
            guarantee
              ((In(committedLifecycleState) == Drone_Lifecycle_Governor::LifecycleState.OFF &
                decisionSnapshot.nextState == Drone_Lifecycle_Governor::DecisionNextState.OFF) |
               (In(committedLifecycleState) == Drone_Lifecycle_Governor::LifecycleState.STANDBY &
                decisionSnapshot.nextState == Drone_Lifecycle_Governor::DecisionNextState.STANDBY) |
               (In(committedLifecycleState) == Drone_Lifecycle_Governor::LifecycleState.CHARGING &
                decisionSnapshot.nextState == Drone_Lifecycle_Governor::DecisionNextState.CHARGING) |
               (In(committedLifecycleState) == Drone_Lifecycle_Governor::LifecycleState.READY &
                decisionSnapshot.nextState == Drone_Lifecycle_Governor::DecisionNextState.READY) |
               (In(committedLifecycleState) == Drone_Lifecycle_Governor::LifecycleState.FLYING &
                decisionSnapshot.nextState == Drone_Lifecycle_Governor::DecisionNextState.FLYING)) &
              ((arbitratedIntent.effectiveIntent == Drone_Lifecycle_Governor::EffectiveIntent.NO_INTENT &
                decisionSnapshot.transitionResult == Drone_Lifecycle_Governor::TransitionResult.NO_CHANGE &
                decisionSnapshot.decisionReason == Drone_Lifecycle_Governor::EligibilityReason.NONE) |
               (arbitratedIntent.effectiveIntent == Drone_Lifecycle_Governor::EffectiveIntent.REJECT_BEGIN_CHARGE &
                decisionSnapshot.transitionResult == Drone_Lifecycle_Governor::TransitionResult.REJECTED &
                decisionSnapshot.decisionReason == Drone_Lifecycle_Governor::EligibilityReason.CHARGER_DISCONNECTED) |
               (((In(committedLifecycleState) == Drone_Lifecycle_Governor::LifecycleState.STANDBY &
                  arbitratedIntent.effectiveIntent == Drone_Lifecycle_Governor::EffectiveIntent.BEGIN_CHARGE &
                  eligibilityEnvelope.chargeEligible == F) |
                 (In(committedLifecycleState) == Drone_Lifecycle_Governor::LifecycleState.STANDBY &
                  arbitratedIntent.effectiveIntent == Drone_Lifecycle_Governor::EffectiveIntent.ACTIVATE &
                  eligibilityEnvelope.flightEligible == F) |
                 (In(committedLifecycleState) == Drone_Lifecycle_Governor::LifecycleState.READY &
                  arbitratedIntent.effectiveIntent == Drone_Lifecycle_Governor::EffectiveIntent.BEGIN_FLIGHT &
                  eligibilityEnvelope.flightEligible == F)) &
                decisionSnapshot.transitionResult == Drone_Lifecycle_Governor::TransitionResult.REJECTED &
                decisionSnapshot.decisionReason == eligibilityEnvelope.decisionReason) |
               (arbitratedIntent.effectiveIntent != Drone_Lifecycle_Governor::EffectiveIntent.NO_INTENT &
                arbitratedIntent.effectiveIntent != Drone_Lifecycle_Governor::EffectiveIntent.REJECT_BEGIN_CHARGE &
                not((In(committedLifecycleState) == Drone_Lifecycle_Governor::LifecycleState.STANDBY &
                     arbitratedIntent.effectiveIntent == Drone_Lifecycle_Governor::EffectiveIntent.BEGIN_CHARGE &
                     eligibilityEnvelope.chargeEligible == F) |
                    (In(committedLifecycleState) == Drone_Lifecycle_Governor::LifecycleState.STANDBY &
                     arbitratedIntent.effectiveIntent == Drone_Lifecycle_Governor::EffectiveIntent.ACTIVATE &
                     eligibilityEnvelope.flightEligible == F) |
                    (In(committedLifecycleState) == Drone_Lifecycle_Governor::LifecycleState.READY &
                     arbitratedIntent.effectiveIntent == Drone_Lifecycle_Governor::EffectiveIntent.BEGIN_FLIGHT &
                     eligibilityEnvelope.flightEligible == F)) &
                decisionSnapshot.transitionResult == Drone_Lifecycle_Governor::TransitionResult.REJECTED &
                decisionSnapshot.decisionReason == Drone_Lifecycle_Governor::EligibilityReason.NONE));
    }*/
  }

  // @trace PART-06
  part def PowerChargeCommandPolicy :> Thread {
    // @trace INT-15
    port decisionSnapshot : DataPort { in :>> type : DecisionSnapshot; }
    // @trace INT-18
    port powerCommand : DataPort { out :>> type : PowerCommand; }
    // @trace INT-19
    port chargeCommand : DataPort { out :>> type : ChargeCommand; }

    language "GUMBO" /*{
      initialize
        // @trace INIT-01
        guarantee InitialPowerCommand:
          powerCommand == Drone_Lifecycle_Governor::PowerCommand.POWER_OFF;
        // @trace INIT-01
        guarantee InitialChargeCommand:
          chargeCommand == Drone_Lifecycle_Governor::ChargeCommand.CHARGE_DISABLED;
      compute
        compute_cases
          // @trace CASE-18
          case CASE_18 "Next lifecycle state classifies both logical commands":
            assume
              decisionSnapshot.nextState == Drone_Lifecycle_Governor::DecisionNextState.OFF |
              decisionSnapshot.nextState == Drone_Lifecycle_Governor::DecisionNextState.STANDBY |
              decisionSnapshot.nextState == Drone_Lifecycle_Governor::DecisionNextState.CHARGING |
              decisionSnapshot.nextState == Drone_Lifecycle_Governor::DecisionNextState.READY |
              decisionSnapshot.nextState == Drone_Lifecycle_Governor::DecisionNextState.FLYING;
            guarantee
              ((decisionSnapshot.nextState == Drone_Lifecycle_Governor::DecisionNextState.OFF &
                powerCommand == Drone_Lifecycle_Governor::PowerCommand.POWER_OFF &
                chargeCommand == Drone_Lifecycle_Governor::ChargeCommand.CHARGE_DISABLED) |
               (decisionSnapshot.nextState == Drone_Lifecycle_Governor::DecisionNextState.STANDBY &
                powerCommand == Drone_Lifecycle_Governor::PowerCommand.SUPPORT_POWER &
                chargeCommand == Drone_Lifecycle_Governor::ChargeCommand.CHARGE_DISABLED) |
               (decisionSnapshot.nextState == Drone_Lifecycle_Governor::DecisionNextState.CHARGING &
                powerCommand == Drone_Lifecycle_Governor::PowerCommand.POWER_OFF &
                chargeCommand == Drone_Lifecycle_Governor::ChargeCommand.CHARGE_ENABLED) |
               (decisionSnapshot.nextState == Drone_Lifecycle_Governor::DecisionNextState.READY &
                powerCommand == Drone_Lifecycle_Governor::PowerCommand.SUPPORT_POWER &
                chargeCommand == Drone_Lifecycle_Governor::ChargeCommand.CHARGE_DISABLED) |
               (decisionSnapshot.nextState == Drone_Lifecycle_Governor::DecisionNextState.FLYING &
                powerCommand == Drone_Lifecycle_Governor::PowerCommand.FLIGHT_POWER &
                chargeCommand == Drone_Lifecycle_Governor::ChargeCommand.CHARGE_DISABLED));
    }*/
  }

  // @trace PART-07
  part def FlightAuthorizationPolicy :> Thread {
    // @trace INT-16
    port decisionSnapshot : DataPort { in :>> type : DecisionSnapshot; }
    // @trace INT-20
    port flightAuthorization : DataPort { out :>> type : FlightAuthorization; }

    language "GUMBO" /*{
      initialize
        // @trace INIT-01
        guarantee InitialFlightAuthorization:
          flightAuthorization == Drone_Lifecycle_Governor::FlightAuthorization.DENIED;
      compute
        compute_cases
          // @trace CASE-19
          case CASE_19 "Flight is permitted exactly in decided flying state":
            assume
              decisionSnapshot.nextState == Drone_Lifecycle_Governor::DecisionNextState.OFF |
              decisionSnapshot.nextState == Drone_Lifecycle_Governor::DecisionNextState.STANDBY |
              decisionSnapshot.nextState == Drone_Lifecycle_Governor::DecisionNextState.CHARGING |
              decisionSnapshot.nextState == Drone_Lifecycle_Governor::DecisionNextState.READY |
              decisionSnapshot.nextState == Drone_Lifecycle_Governor::DecisionNextState.FLYING;
            guarantee
              ((decisionSnapshot.nextState == Drone_Lifecycle_Governor::DecisionNextState.FLYING &
                flightAuthorization == Drone_Lifecycle_Governor::FlightAuthorization.PERMITTED) |
               (decisionSnapshot.nextState != Drone_Lifecycle_Governor::DecisionNextState.FLYING &
                flightAuthorization == Drone_Lifecycle_Governor::FlightAuthorization.DENIED));
    }*/
  }

  // @trace PART-08
  part def SupervisoryStatusAssessment :> Thread {
    // @trace INT-17
    port decisionSnapshot : DataPort { in :>> type : DecisionSnapshot; }
    // @trace INT-09
    port batteryQualification : DataPort { in :>> type : BatteryQualification; }
    // @trace INT-21
    port pilotStatus : DataPort { out :>> type : PilotStatus; }

    language "GUMBO" /*{
      initialize
        // @trace INIT-01
        guarantee InitialPilotStatus:
          pilotStatus.lifecycleState == Drone_Lifecycle_Governor::PilotLifecycleState.OFF &
          pilotStatus.requestDisposition == Drone_Lifecycle_Governor::RequestDisposition.NO_CHANGE &
          pilotStatus.pilotNotice == Drone_Lifecycle_Governor::PilotNotice.NONE;
      compute
        compute_cases
          // @trace CASE-20
          case CASE_20 "Status maps the decision and derives notice by precedence":
            assume
              decisionSnapshot.transitionResult == Drone_Lifecycle_Governor::TransitionResult.NO_CHANGE |
              decisionSnapshot.transitionResult == Drone_Lifecycle_Governor::TransitionResult.ACCEPTED |
              decisionSnapshot.transitionResult == Drone_Lifecycle_Governor::TransitionResult.REJECTED |
              decisionSnapshot.transitionResult == Drone_Lifecycle_Governor::TransitionResult.RECOVERY_APPLIED |
              decisionSnapshot.transitionResult == Drone_Lifecycle_Governor::TransitionResult.FRESH_REQUEST_PREEMPTED;
            guarantee
              ((decisionSnapshot.nextState == Drone_Lifecycle_Governor::DecisionNextState.OFF &
                pilotStatus.lifecycleState == Drone_Lifecycle_Governor::PilotLifecycleState.OFF) |
               (decisionSnapshot.nextState == Drone_Lifecycle_Governor::DecisionNextState.STANDBY &
                pilotStatus.lifecycleState == Drone_Lifecycle_Governor::PilotLifecycleState.STANDBY) |
               (decisionSnapshot.nextState == Drone_Lifecycle_Governor::DecisionNextState.CHARGING &
                pilotStatus.lifecycleState == Drone_Lifecycle_Governor::PilotLifecycleState.CHARGING) |
               (decisionSnapshot.nextState == Drone_Lifecycle_Governor::DecisionNextState.READY &
                pilotStatus.lifecycleState == Drone_Lifecycle_Governor::PilotLifecycleState.READY) |
               (decisionSnapshot.nextState == Drone_Lifecycle_Governor::DecisionNextState.FLYING &
                pilotStatus.lifecycleState == Drone_Lifecycle_Governor::PilotLifecycleState.FLYING)) &
              ((decisionSnapshot.transitionResult == Drone_Lifecycle_Governor::TransitionResult.NO_CHANGE &
                pilotStatus.requestDisposition == Drone_Lifecycle_Governor::RequestDisposition.NO_CHANGE) |
               (decisionSnapshot.transitionResult == Drone_Lifecycle_Governor::TransitionResult.ACCEPTED &
                pilotStatus.requestDisposition == Drone_Lifecycle_Governor::RequestDisposition.ACCEPTED) |
               (decisionSnapshot.transitionResult == Drone_Lifecycle_Governor::TransitionResult.REJECTED &
                pilotStatus.requestDisposition == Drone_Lifecycle_Governor::RequestDisposition.REJECTED) |
               (decisionSnapshot.transitionResult == Drone_Lifecycle_Governor::TransitionResult.RECOVERY_APPLIED &
                pilotStatus.requestDisposition == Drone_Lifecycle_Governor::RequestDisposition.RECOVERY_APPLIED) |
               (decisionSnapshot.transitionResult == Drone_Lifecycle_Governor::TransitionResult.FRESH_REQUEST_PREEMPTED &
                pilotStatus.requestDisposition == Drone_Lifecycle_Governor::RequestDisposition.PREEMPTED)) &
              ((batteryQualification == Drone_Lifecycle_Governor::BatteryQualification.UNAVAILABLE &
                pilotStatus.pilotNotice == Drone_Lifecycle_Governor::PilotNotice.BATTERY_UNAVAILABLE) |
               (batteryQualification == Drone_Lifecycle_Governor::BatteryQualification.INSUFFICIENT &
                pilotStatus.pilotNotice == Drone_Lifecycle_Governor::PilotNotice.BATTERY_LOW) |
               (batteryQualification == Drone_Lifecycle_Governor::BatteryQualification.SUFFICIENT &
                decisionSnapshot.decisionReason == Drone_Lifecycle_Governor::EligibilityReason.BATTERY_UNAVAILABLE &
                pilotStatus.pilotNotice == Drone_Lifecycle_Governor::PilotNotice.BATTERY_UNAVAILABLE) |
               (batteryQualification == Drone_Lifecycle_Governor::BatteryQualification.SUFFICIENT &
                decisionSnapshot.decisionReason == Drone_Lifecycle_Governor::EligibilityReason.BATTERY_LOW &
                pilotStatus.pilotNotice == Drone_Lifecycle_Governor::PilotNotice.BATTERY_LOW) |
               (batteryQualification == Drone_Lifecycle_Governor::BatteryQualification.SUFFICIENT &
                decisionSnapshot.decisionReason == Drone_Lifecycle_Governor::EligibilityReason.FLIGHT_UNAVAILABLE &
                pilotStatus.pilotNotice == Drone_Lifecycle_Governor::PilotNotice.FLIGHT_UNAVAILABLE) |
               (batteryQualification == Drone_Lifecycle_Governor::BatteryQualification.SUFFICIENT &
                decisionSnapshot.decisionReason == Drone_Lifecycle_Governor::EligibilityReason.FLIGHT_NOT_READY &
                pilotStatus.pilotNotice == Drone_Lifecycle_Governor::PilotNotice.FLIGHT_NOT_READY) |
               (batteryQualification == Drone_Lifecycle_Governor::BatteryQualification.SUFFICIENT &
                decisionSnapshot.decisionReason == Drone_Lifecycle_Governor::EligibilityReason.CHARGER_DISCONNECTED &
                pilotStatus.pilotNotice == Drone_Lifecycle_Governor::PilotNotice.CHARGER_DISCONNECTED) |
               (batteryQualification == Drone_Lifecycle_Governor::BatteryQualification.SUFFICIENT &
                decisionSnapshot.decisionReason == Drone_Lifecycle_Governor::EligibilityReason.NONE &
                decisionSnapshot.transitionResult == Drone_Lifecycle_Governor::TransitionResult.REJECTED &
                pilotStatus.pilotNotice == Drone_Lifecycle_Governor::PilotNotice.INAPPLICABLE_REQUEST) |
               (batteryQualification == Drone_Lifecycle_Governor::BatteryQualification.SUFFICIENT &
                decisionSnapshot.decisionReason == Drone_Lifecycle_Governor::EligibilityReason.NONE &
                decisionSnapshot.transitionResult != Drone_Lifecycle_Governor::TransitionResult.REJECTED &
                pilotStatus.pilotNotice == Drone_Lifecycle_Governor::PilotNotice.NONE));
    }*/
  }

  // @generated-support Behavior-free legal containment for eight semantic Threads.
  part def GovernorProcess :> Process {
    // @generated-support Process boundary mirrors six root inputs and four root outputs.
    port pilotRequest : DataPort { in :>> type : LifecycleRequest; }
    // @generated-support Process boundary route.
    port chargerState : DataPort { in :>> type : ChargerState; }
    // @generated-support Process boundary route.
    port batteryCapacity : DataPort { in :>> type : BatteryCapacityBand; }
    // @generated-support Process boundary route.
    port batteryCheck : DataPort { in :>> type : BatteryCheck; }
    // @generated-support Process boundary route.
    port navigationCondition : DataPort { in :>> type : NavigationCondition; }
    // @generated-support Process boundary route.
    port radioCondition : DataPort { in :>> type : RadioCondition; }
    // @generated-support Process boundary route.
    port powerCommand : DataPort { out :>> type : PowerCommand; }
    // @generated-support Process boundary route.
    port chargeCommand : DataPort { out :>> type : ChargeCommand; }
    // @generated-support Process boundary route.
    port flightAuthorization : DataPort { out :>> type : FlightAuthorization; }
    // @generated-support Process boundary route.
    port pilotStatus : DataPort { out :>> type : PilotStatus; }

    // @trace PART-01
    part requestArbiter : RequestArbiter;
    // @trace PART-02
    part batteryQualificationOwner : BatteryQualificationOwner;
    // @trace PART-03
    part flightReadinessOwner : FlightReadinessOwner;
    // @trace PART-04
    part operationalEligibilityOwner : OperationalEligibilityOwner;
    // @trace PART-05
    part lifecycleStateGovernor : LifecycleStateGovernor;
    // @trace PART-06
    part powerChargeCommandPolicy : PowerChargeCommandPolicy;
    // @trace PART-07
    part flightAuthorizationPolicy : FlightAuthorizationPolicy;
    // @trace PART-08
    part supervisoryStatusAssessment : SupervisoryStatusAssessment;

    // @trace INT-01
    connection int01 : PortConnection connect pilotRequest to requestArbiter.pilotRequest;
    // @trace INT-02
    connection int02 : PortConnection connect chargerState to requestArbiter.chargerState;
    // @trace INT-03
    connection int03 : PortConnection connect chargerState to operationalEligibilityOwner.chargerState;
    // @trace INT-04
    connection int04 : PortConnection connect batteryCapacity to batteryQualificationOwner.batteryCapacity;
    // @trace INT-05
    connection int05 : PortConnection connect batteryCheck to batteryQualificationOwner.batteryCheck;
    // @trace INT-06
    connection int06 : PortConnection connect navigationCondition to flightReadinessOwner.navigationCondition;
    // @trace INT-07
    connection int07 : PortConnection connect radioCondition to flightReadinessOwner.radioCondition;
    // @trace INT-08
    connection int08 : PortConnection connect batteryQualificationOwner.batteryQualification to operationalEligibilityOwner.batteryQualification;
    // @trace INT-09
    connection int09 : PortConnection connect batteryQualificationOwner.batteryQualification to supervisoryStatusAssessment.batteryQualification;
    // @trace INT-10
    connection int10 : PortConnection connect flightReadinessOwner.flightQualification to operationalEligibilityOwner.flightQualification;
    // @trace INT-11
    connection int11 : PortConnection connect lifecycleStateGovernor.currentLifecycleState to operationalEligibilityOwner.currentLifecycleState;
    // @trace INT-12
    connection int12 : PortConnection connect operationalEligibilityOwner.recoveryProposal to requestArbiter.recoveryProposal;
    // @trace INT-13
    connection int13 : PortConnection connect operationalEligibilityOwner.eligibilityEnvelope to lifecycleStateGovernor.eligibilityEnvelope;
    // @trace INT-14
    connection int14 : PortConnection connect requestArbiter.arbitratedIntent to lifecycleStateGovernor.arbitratedIntent;
    // @trace INT-15
    connection int15 : PortConnection connect lifecycleStateGovernor.decisionSnapshot to powerChargeCommandPolicy.decisionSnapshot;
    // @trace INT-16
    connection int16 : PortConnection connect lifecycleStateGovernor.decisionSnapshot to flightAuthorizationPolicy.decisionSnapshot;
    // @trace INT-17
    connection int17 : PortConnection connect lifecycleStateGovernor.decisionSnapshot to supervisoryStatusAssessment.decisionSnapshot;
    // @trace INT-18
    connection int18 : PortConnection connect powerChargeCommandPolicy.powerCommand to powerCommand;
    // @trace INT-19
    connection int19 : PortConnection connect powerChargeCommandPolicy.chargeCommand to chargeCommand;
    // @trace INT-20
    connection int20 : PortConnection connect flightAuthorizationPolicy.flightAuthorization to flightAuthorization;
    // @trace INT-21
    connection int21 : PortConnection connect supervisoryStatusAssessment.pilotStatus to pilotStatus;
  }

  // @trace PURPOSE-01
  part def DroneLifecycleGovernorSystem :> System {
    // @trace MON-01
    port pilotRequest : DataPort { in :>> type : LifecycleRequest; }
    // @trace MON-02
    port chargerState : DataPort { in :>> type : ChargerState; }
    // @trace MON-03
    port batteryCapacity : DataPort { in :>> type : BatteryCapacityBand; }
    // @trace MON-04
    port batteryCheck : DataPort { in :>> type : BatteryCheck; }
    // @trace MON-05
    port navigationCondition : DataPort { in :>> type : NavigationCondition; }
    // @trace MON-06
    port radioCondition : DataPort { in :>> type : RadioCondition; }
    // @trace CTRL-01
    port powerCommand : DataPort { out :>> type : PowerCommand; }
    // @trace CTRL-02
    port chargeCommand : DataPort { out :>> type : ChargeCommand; }
    // @trace CTRL-03
    port flightAuthorization : DataPort { out :>> type : FlightAuthorization; }
    // @trace CTRL-04
    port pilotStatus : DataPort { out :>> type : PilotStatus; }

    // @generated-support Sole behavior-free containment usage approved by SUP-01.
    part governorProcess : GovernorProcess;

    // @generated-support SUP-ROUTE-01 root-to-Process delegation.
    connection support01 : PortConnection connect pilotRequest to governorProcess.pilotRequest;
    // @generated-support SUP-ROUTE-02 root-to-Process delegation.
    connection support02 : PortConnection connect chargerState to governorProcess.chargerState;
    // @generated-support SUP-ROUTE-03 root-to-Process delegation.
    connection support03 : PortConnection connect batteryCapacity to governorProcess.batteryCapacity;
    // @generated-support SUP-ROUTE-04 root-to-Process delegation.
    connection support04 : PortConnection connect batteryCheck to governorProcess.batteryCheck;
    // @generated-support SUP-ROUTE-05 root-to-Process delegation.
    connection support05 : PortConnection connect navigationCondition to governorProcess.navigationCondition;
    // @generated-support SUP-ROUTE-06 root-to-Process delegation.
    connection support06 : PortConnection connect radioCondition to governorProcess.radioCondition;
    // @generated-support SUP-ROUTE-07 Process-to-root delegation.
    connection support07 : PortConnection connect governorProcess.powerCommand to powerCommand;
    // @generated-support SUP-ROUTE-08 Process-to-root delegation.
    connection support08 : PortConnection connect governorProcess.chargeCommand to chargeCommand;
    // @generated-support SUP-ROUTE-09 Process-to-root delegation.
    connection support09 : PortConnection connect governorProcess.flightAuthorization to flightAuthorization;
    // @generated-support SUP-ROUTE-10 Process-to-root delegation.
    connection support10 : PortConnection connect governorProcess.pilotStatus to pilotStatus;
  }

  // @trace PURPOSE-01
  part droneLifecycleGovernor : DroneLifecycleGovernorSystem;
}
