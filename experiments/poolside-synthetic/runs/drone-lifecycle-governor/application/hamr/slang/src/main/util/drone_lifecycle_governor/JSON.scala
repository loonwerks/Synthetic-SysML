// #Sireum
// @formatter:off

// This file is auto-generated from LifecycleRequest.scala, ChargerState.scala, RecoveryProposal.scala, EffectiveIntent.scala, FreshRequestPreemption.scala, BatteryCapacityBand.scala, BatteryCheck.scala, BatteryQualification.scala, NavigationCondition.scala, RadioCondition.scala, FlightQualification.scala, LifecycleState.scala, EligibilityReason.scala, DecisionPreState.scala, DecisionNextState.scala, TransitionResult.scala, PowerCommand.scala, ChargeCommand.scala, FlightAuthorization.scala, PilotLifecycleState.scala, RequestDisposition.scala, PilotNotice.scala, ArbitratedIntent.scala, EligibilityEnvelope.scala, DecisionSnapshot.scala, PilotStatus.scala, Base_Types.scala, RequestArbiter_governorProcess_requestArbiter_Containers.scala, BatteryQualificationOwner_governorProcess_batteryQualificationOwner_Containers.scala, FlightReadinessOwner_governorProcess_flightReadinessOwner_Containers.scala, OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_Containers.scala, LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_Containers.scala, PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_Containers.scala, FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_Containers.scala, SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package drone_lifecycle_governor

import org.sireum._
import org.sireum.Json.Printer._

object JSON {

  object Printer {

    @pure def printDrone_Lifecycle_GovernorLifecycleRequestType(o: Drone_Lifecycle_Governor.LifecycleRequest.Type): ST = {
      val value: String = o match {
        case Drone_Lifecycle_Governor.LifecycleRequest.NO_REQUEST => "NO_REQUEST"
        case Drone_Lifecycle_Governor.LifecycleRequest.SWITCH_ON => "SWITCH_ON"
        case Drone_Lifecycle_Governor.LifecycleRequest.SWITCH_OFF => "SWITCH_OFF"
        case Drone_Lifecycle_Governor.LifecycleRequest.BEGIN_CHARGE => "BEGIN_CHARGE"
        case Drone_Lifecycle_Governor.LifecycleRequest.END_CHARGE => "END_CHARGE"
        case Drone_Lifecycle_Governor.LifecycleRequest.ACTIVATE => "ACTIVATE"
        case Drone_Lifecycle_Governor.LifecycleRequest.DEACTIVATE => "DEACTIVATE"
        case Drone_Lifecycle_Governor.LifecycleRequest.BEGIN_FLIGHT => "BEGIN_FLIGHT"
        case Drone_Lifecycle_Governor.LifecycleRequest.END_FLIGHT => "END_FLIGHT"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Lifecycle_Governor.LifecycleRequest")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorLifecycleRequest_Payload(o: Drone_Lifecycle_Governor.LifecycleRequest_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.LifecycleRequest_Payload""""),
        ("value", printDrone_Lifecycle_GovernorLifecycleRequestType(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorChargerStateType(o: Drone_Lifecycle_Governor.ChargerState.Type): ST = {
      val value: String = o match {
        case Drone_Lifecycle_Governor.ChargerState.DISCONNECTED => "DISCONNECTED"
        case Drone_Lifecycle_Governor.ChargerState.CONNECTED => "CONNECTED"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Lifecycle_Governor.ChargerState")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorChargerState_Payload(o: Drone_Lifecycle_Governor.ChargerState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.ChargerState_Payload""""),
        ("value", printDrone_Lifecycle_GovernorChargerStateType(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorRecoveryProposalType(o: Drone_Lifecycle_Governor.RecoveryProposal.Type): ST = {
      val value: String = o match {
        case Drone_Lifecycle_Governor.RecoveryProposal.NO_RECOVERY => "NO_RECOVERY"
        case Drone_Lifecycle_Governor.RecoveryProposal.TO_STANDBY_BATTERY => "TO_STANDBY_BATTERY"
        case Drone_Lifecycle_Governor.RecoveryProposal.TO_STANDBY_READINESS => "TO_STANDBY_READINESS"
        case Drone_Lifecycle_Governor.RecoveryProposal.TO_STANDBY_CHARGE_PATH => "TO_STANDBY_CHARGE_PATH"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Lifecycle_Governor.RecoveryProposal")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorRecoveryProposal_Payload(o: Drone_Lifecycle_Governor.RecoveryProposal_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.RecoveryProposal_Payload""""),
        ("value", printDrone_Lifecycle_GovernorRecoveryProposalType(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorEffectiveIntentType(o: Drone_Lifecycle_Governor.EffectiveIntent.Type): ST = {
      val value: String = o match {
        case Drone_Lifecycle_Governor.EffectiveIntent.NO_INTENT => "NO_INTENT"
        case Drone_Lifecycle_Governor.EffectiveIntent.SWITCH_ON => "SWITCH_ON"
        case Drone_Lifecycle_Governor.EffectiveIntent.SWITCH_OFF => "SWITCH_OFF"
        case Drone_Lifecycle_Governor.EffectiveIntent.BEGIN_CHARGE => "BEGIN_CHARGE"
        case Drone_Lifecycle_Governor.EffectiveIntent.END_CHARGE => "END_CHARGE"
        case Drone_Lifecycle_Governor.EffectiveIntent.ACTIVATE => "ACTIVATE"
        case Drone_Lifecycle_Governor.EffectiveIntent.DEACTIVATE => "DEACTIVATE"
        case Drone_Lifecycle_Governor.EffectiveIntent.BEGIN_FLIGHT => "BEGIN_FLIGHT"
        case Drone_Lifecycle_Governor.EffectiveIntent.END_FLIGHT => "END_FLIGHT"
        case Drone_Lifecycle_Governor.EffectiveIntent.RECOVER_TO_STANDBY => "RECOVER_TO_STANDBY"
        case Drone_Lifecycle_Governor.EffectiveIntent.REJECT_BEGIN_CHARGE => "REJECT_BEGIN_CHARGE"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Lifecycle_Governor.EffectiveIntent")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorEffectiveIntent_Payload(o: Drone_Lifecycle_Governor.EffectiveIntent_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.EffectiveIntent_Payload""""),
        ("value", printDrone_Lifecycle_GovernorEffectiveIntentType(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorFreshRequestPreemptionType(o: Drone_Lifecycle_Governor.FreshRequestPreemption.Type): ST = {
      val value: String = o match {
        case Drone_Lifecycle_Governor.FreshRequestPreemption.NOT_PREEMPTED => "NOT_PREEMPTED"
        case Drone_Lifecycle_Governor.FreshRequestPreemption.PREEMPTED => "PREEMPTED"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Lifecycle_Governor.FreshRequestPreemption")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorFreshRequestPreemption_Payload(o: Drone_Lifecycle_Governor.FreshRequestPreemption_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.FreshRequestPreemption_Payload""""),
        ("value", printDrone_Lifecycle_GovernorFreshRequestPreemptionType(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorBatteryCapacityBandType(o: Drone_Lifecycle_Governor.BatteryCapacityBand.Type): ST = {
      val value: String = o match {
        case Drone_Lifecycle_Governor.BatteryCapacityBand.LOW => "LOW"
        case Drone_Lifecycle_Governor.BatteryCapacityBand.USABLE => "USABLE"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Lifecycle_Governor.BatteryCapacityBand")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorBatteryCapacityBand_Payload(o: Drone_Lifecycle_Governor.BatteryCapacityBand_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.BatteryCapacityBand_Payload""""),
        ("value", printDrone_Lifecycle_GovernorBatteryCapacityBandType(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorBatteryCheckType(o: Drone_Lifecycle_Governor.BatteryCheck.Type): ST = {
      val value: String = o match {
        case Drone_Lifecycle_Governor.BatteryCheck.INVALID => "INVALID"
        case Drone_Lifecycle_Governor.BatteryCheck.VALID => "VALID"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Lifecycle_Governor.BatteryCheck")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorBatteryCheck_Payload(o: Drone_Lifecycle_Governor.BatteryCheck_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.BatteryCheck_Payload""""),
        ("value", printDrone_Lifecycle_GovernorBatteryCheckType(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorBatteryQualificationType(o: Drone_Lifecycle_Governor.BatteryQualification.Type): ST = {
      val value: String = o match {
        case Drone_Lifecycle_Governor.BatteryQualification.UNAVAILABLE => "UNAVAILABLE"
        case Drone_Lifecycle_Governor.BatteryQualification.INSUFFICIENT => "INSUFFICIENT"
        case Drone_Lifecycle_Governor.BatteryQualification.SUFFICIENT => "SUFFICIENT"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Lifecycle_Governor.BatteryQualification")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorBatteryQualification_Payload(o: Drone_Lifecycle_Governor.BatteryQualification_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.BatteryQualification_Payload""""),
        ("value", printDrone_Lifecycle_GovernorBatteryQualificationType(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorNavigationConditionType(o: Drone_Lifecycle_Governor.NavigationCondition.Type): ST = {
      val value: String = o match {
        case Drone_Lifecycle_Governor.NavigationCondition.INVALID => "INVALID"
        case Drone_Lifecycle_Governor.NavigationCondition.NOT_READY => "NOT_READY"
        case Drone_Lifecycle_Governor.NavigationCondition.READY => "READY"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Lifecycle_Governor.NavigationCondition")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorNavigationCondition_Payload(o: Drone_Lifecycle_Governor.NavigationCondition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.NavigationCondition_Payload""""),
        ("value", printDrone_Lifecycle_GovernorNavigationConditionType(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorRadioConditionType(o: Drone_Lifecycle_Governor.RadioCondition.Type): ST = {
      val value: String = o match {
        case Drone_Lifecycle_Governor.RadioCondition.INVALID => "INVALID"
        case Drone_Lifecycle_Governor.RadioCondition.NOT_READY => "NOT_READY"
        case Drone_Lifecycle_Governor.RadioCondition.READY => "READY"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Lifecycle_Governor.RadioCondition")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorRadioCondition_Payload(o: Drone_Lifecycle_Governor.RadioCondition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.RadioCondition_Payload""""),
        ("value", printDrone_Lifecycle_GovernorRadioConditionType(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorFlightQualificationType(o: Drone_Lifecycle_Governor.FlightQualification.Type): ST = {
      val value: String = o match {
        case Drone_Lifecycle_Governor.FlightQualification.UNAVAILABLE => "UNAVAILABLE"
        case Drone_Lifecycle_Governor.FlightQualification.NOT_READY => "NOT_READY"
        case Drone_Lifecycle_Governor.FlightQualification.READY => "READY"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Lifecycle_Governor.FlightQualification")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorFlightQualification_Payload(o: Drone_Lifecycle_Governor.FlightQualification_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.FlightQualification_Payload""""),
        ("value", printDrone_Lifecycle_GovernorFlightQualificationType(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorLifecycleStateType(o: Drone_Lifecycle_Governor.LifecycleState.Type): ST = {
      val value: String = o match {
        case Drone_Lifecycle_Governor.LifecycleState.OFF => "OFF"
        case Drone_Lifecycle_Governor.LifecycleState.STANDBY => "STANDBY"
        case Drone_Lifecycle_Governor.LifecycleState.CHARGING => "CHARGING"
        case Drone_Lifecycle_Governor.LifecycleState.READY => "READY"
        case Drone_Lifecycle_Governor.LifecycleState.FLYING => "FLYING"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Lifecycle_Governor.LifecycleState")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorLifecycleState_Payload(o: Drone_Lifecycle_Governor.LifecycleState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.LifecycleState_Payload""""),
        ("value", printDrone_Lifecycle_GovernorLifecycleStateType(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorEligibilityReasonType(o: Drone_Lifecycle_Governor.EligibilityReason.Type): ST = {
      val value: String = o match {
        case Drone_Lifecycle_Governor.EligibilityReason.NONE => "NONE"
        case Drone_Lifecycle_Governor.EligibilityReason.BATTERY_UNAVAILABLE => "BATTERY_UNAVAILABLE"
        case Drone_Lifecycle_Governor.EligibilityReason.BATTERY_LOW => "BATTERY_LOW"
        case Drone_Lifecycle_Governor.EligibilityReason.FLIGHT_UNAVAILABLE => "FLIGHT_UNAVAILABLE"
        case Drone_Lifecycle_Governor.EligibilityReason.FLIGHT_NOT_READY => "FLIGHT_NOT_READY"
        case Drone_Lifecycle_Governor.EligibilityReason.CHARGER_DISCONNECTED => "CHARGER_DISCONNECTED"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Lifecycle_Governor.EligibilityReason")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorEligibilityReason_Payload(o: Drone_Lifecycle_Governor.EligibilityReason_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.EligibilityReason_Payload""""),
        ("value", printDrone_Lifecycle_GovernorEligibilityReasonType(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorDecisionPreStateType(o: Drone_Lifecycle_Governor.DecisionPreState.Type): ST = {
      val value: String = o match {
        case Drone_Lifecycle_Governor.DecisionPreState.OFF => "OFF"
        case Drone_Lifecycle_Governor.DecisionPreState.STANDBY => "STANDBY"
        case Drone_Lifecycle_Governor.DecisionPreState.CHARGING => "CHARGING"
        case Drone_Lifecycle_Governor.DecisionPreState.READY => "READY"
        case Drone_Lifecycle_Governor.DecisionPreState.FLYING => "FLYING"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Lifecycle_Governor.DecisionPreState")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorDecisionPreState_Payload(o: Drone_Lifecycle_Governor.DecisionPreState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.DecisionPreState_Payload""""),
        ("value", printDrone_Lifecycle_GovernorDecisionPreStateType(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorDecisionNextStateType(o: Drone_Lifecycle_Governor.DecisionNextState.Type): ST = {
      val value: String = o match {
        case Drone_Lifecycle_Governor.DecisionNextState.OFF => "OFF"
        case Drone_Lifecycle_Governor.DecisionNextState.STANDBY => "STANDBY"
        case Drone_Lifecycle_Governor.DecisionNextState.CHARGING => "CHARGING"
        case Drone_Lifecycle_Governor.DecisionNextState.READY => "READY"
        case Drone_Lifecycle_Governor.DecisionNextState.FLYING => "FLYING"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Lifecycle_Governor.DecisionNextState")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorDecisionNextState_Payload(o: Drone_Lifecycle_Governor.DecisionNextState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.DecisionNextState_Payload""""),
        ("value", printDrone_Lifecycle_GovernorDecisionNextStateType(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorTransitionResultType(o: Drone_Lifecycle_Governor.TransitionResult.Type): ST = {
      val value: String = o match {
        case Drone_Lifecycle_Governor.TransitionResult.NO_CHANGE => "NO_CHANGE"
        case Drone_Lifecycle_Governor.TransitionResult.ACCEPTED => "ACCEPTED"
        case Drone_Lifecycle_Governor.TransitionResult.REJECTED => "REJECTED"
        case Drone_Lifecycle_Governor.TransitionResult.RECOVERY_APPLIED => "RECOVERY_APPLIED"
        case Drone_Lifecycle_Governor.TransitionResult.FRESH_REQUEST_PREEMPTED => "FRESH_REQUEST_PREEMPTED"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Lifecycle_Governor.TransitionResult")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorTransitionResult_Payload(o: Drone_Lifecycle_Governor.TransitionResult_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.TransitionResult_Payload""""),
        ("value", printDrone_Lifecycle_GovernorTransitionResultType(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorPowerCommandType(o: Drone_Lifecycle_Governor.PowerCommand.Type): ST = {
      val value: String = o match {
        case Drone_Lifecycle_Governor.PowerCommand.POWER_OFF => "POWER_OFF"
        case Drone_Lifecycle_Governor.PowerCommand.SUPPORT_POWER => "SUPPORT_POWER"
        case Drone_Lifecycle_Governor.PowerCommand.FLIGHT_POWER => "FLIGHT_POWER"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Lifecycle_Governor.PowerCommand")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorPowerCommand_Payload(o: Drone_Lifecycle_Governor.PowerCommand_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.PowerCommand_Payload""""),
        ("value", printDrone_Lifecycle_GovernorPowerCommandType(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorChargeCommandType(o: Drone_Lifecycle_Governor.ChargeCommand.Type): ST = {
      val value: String = o match {
        case Drone_Lifecycle_Governor.ChargeCommand.CHARGE_DISABLED => "CHARGE_DISABLED"
        case Drone_Lifecycle_Governor.ChargeCommand.CHARGE_ENABLED => "CHARGE_ENABLED"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Lifecycle_Governor.ChargeCommand")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorChargeCommand_Payload(o: Drone_Lifecycle_Governor.ChargeCommand_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.ChargeCommand_Payload""""),
        ("value", printDrone_Lifecycle_GovernorChargeCommandType(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorFlightAuthorizationType(o: Drone_Lifecycle_Governor.FlightAuthorization.Type): ST = {
      val value: String = o match {
        case Drone_Lifecycle_Governor.FlightAuthorization.DENIED => "DENIED"
        case Drone_Lifecycle_Governor.FlightAuthorization.PERMITTED => "PERMITTED"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Lifecycle_Governor.FlightAuthorization")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorFlightAuthorization_Payload(o: Drone_Lifecycle_Governor.FlightAuthorization_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.FlightAuthorization_Payload""""),
        ("value", printDrone_Lifecycle_GovernorFlightAuthorizationType(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorPilotLifecycleStateType(o: Drone_Lifecycle_Governor.PilotLifecycleState.Type): ST = {
      val value: String = o match {
        case Drone_Lifecycle_Governor.PilotLifecycleState.OFF => "OFF"
        case Drone_Lifecycle_Governor.PilotLifecycleState.STANDBY => "STANDBY"
        case Drone_Lifecycle_Governor.PilotLifecycleState.CHARGING => "CHARGING"
        case Drone_Lifecycle_Governor.PilotLifecycleState.READY => "READY"
        case Drone_Lifecycle_Governor.PilotLifecycleState.FLYING => "FLYING"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Lifecycle_Governor.PilotLifecycleState")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorPilotLifecycleState_Payload(o: Drone_Lifecycle_Governor.PilotLifecycleState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.PilotLifecycleState_Payload""""),
        ("value", printDrone_Lifecycle_GovernorPilotLifecycleStateType(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorRequestDispositionType(o: Drone_Lifecycle_Governor.RequestDisposition.Type): ST = {
      val value: String = o match {
        case Drone_Lifecycle_Governor.RequestDisposition.NO_CHANGE => "NO_CHANGE"
        case Drone_Lifecycle_Governor.RequestDisposition.ACCEPTED => "ACCEPTED"
        case Drone_Lifecycle_Governor.RequestDisposition.REJECTED => "REJECTED"
        case Drone_Lifecycle_Governor.RequestDisposition.RECOVERY_APPLIED => "RECOVERY_APPLIED"
        case Drone_Lifecycle_Governor.RequestDisposition.PREEMPTED => "PREEMPTED"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Lifecycle_Governor.RequestDisposition")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorRequestDisposition_Payload(o: Drone_Lifecycle_Governor.RequestDisposition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.RequestDisposition_Payload""""),
        ("value", printDrone_Lifecycle_GovernorRequestDispositionType(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorPilotNoticeType(o: Drone_Lifecycle_Governor.PilotNotice.Type): ST = {
      val value: String = o match {
        case Drone_Lifecycle_Governor.PilotNotice.NONE => "NONE"
        case Drone_Lifecycle_Governor.PilotNotice.BATTERY_UNAVAILABLE => "BATTERY_UNAVAILABLE"
        case Drone_Lifecycle_Governor.PilotNotice.BATTERY_LOW => "BATTERY_LOW"
        case Drone_Lifecycle_Governor.PilotNotice.FLIGHT_UNAVAILABLE => "FLIGHT_UNAVAILABLE"
        case Drone_Lifecycle_Governor.PilotNotice.FLIGHT_NOT_READY => "FLIGHT_NOT_READY"
        case Drone_Lifecycle_Governor.PilotNotice.CHARGER_DISCONNECTED => "CHARGER_DISCONNECTED"
        case Drone_Lifecycle_Governor.PilotNotice.INAPPLICABLE_REQUEST => "INAPPLICABLE_REQUEST"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Lifecycle_Governor.PilotNotice")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorPilotNotice_Payload(o: Drone_Lifecycle_Governor.PilotNotice_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.PilotNotice_Payload""""),
        ("value", printDrone_Lifecycle_GovernorPilotNoticeType(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorArbitratedIntent(o: Drone_Lifecycle_Governor.ArbitratedIntent): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.ArbitratedIntent""""),
        ("effectiveIntent", printDrone_Lifecycle_GovernorEffectiveIntentType(o.effectiveIntent)),
        ("preemption", printDrone_Lifecycle_GovernorFreshRequestPreemptionType(o.preemption))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorArbitratedIntent_Payload(o: Drone_Lifecycle_Governor.ArbitratedIntent_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.ArbitratedIntent_Payload""""),
        ("value", printDrone_Lifecycle_GovernorArbitratedIntent(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorEligibilityEnvelope(o: Drone_Lifecycle_Governor.EligibilityEnvelope): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.EligibilityEnvelope""""),
        ("flightEligible", printB(o.flightEligible)),
        ("chargeEligible", printB(o.chargeEligible)),
        ("decisionReason", printDrone_Lifecycle_GovernorEligibilityReasonType(o.decisionReason))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorEligibilityEnvelope_Payload(o: Drone_Lifecycle_Governor.EligibilityEnvelope_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.EligibilityEnvelope_Payload""""),
        ("value", printDrone_Lifecycle_GovernorEligibilityEnvelope(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorDecisionSnapshot(o: Drone_Lifecycle_Governor.DecisionSnapshot): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.DecisionSnapshot""""),
        ("preState", printDrone_Lifecycle_GovernorDecisionPreStateType(o.preState)),
        ("nextState", printDrone_Lifecycle_GovernorDecisionNextStateType(o.nextState)),
        ("effectiveIntent", printDrone_Lifecycle_GovernorEffectiveIntentType(o.effectiveIntent)),
        ("transitionResult", printDrone_Lifecycle_GovernorTransitionResultType(o.transitionResult)),
        ("decisionReason", printDrone_Lifecycle_GovernorEligibilityReasonType(o.decisionReason))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorDecisionSnapshot_Payload(o: Drone_Lifecycle_Governor.DecisionSnapshot_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.DecisionSnapshot_Payload""""),
        ("value", printDrone_Lifecycle_GovernorDecisionSnapshot(o.value))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorPilotStatus(o: Drone_Lifecycle_Governor.PilotStatus): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.PilotStatus""""),
        ("lifecycleState", printDrone_Lifecycle_GovernorPilotLifecycleStateType(o.lifecycleState)),
        ("requestDisposition", printDrone_Lifecycle_GovernorRequestDispositionType(o.requestDisposition)),
        ("pilotNotice", printDrone_Lifecycle_GovernorPilotNoticeType(o.pilotNotice))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorPilotStatus_Payload(o: Drone_Lifecycle_Governor.PilotStatus_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.PilotStatus_Payload""""),
        ("value", printDrone_Lifecycle_GovernorPilotStatus(o.value))
      ))
    }

    @pure def printBase_TypesBoolean_Payload(o: Base_Types.Boolean_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Boolean_Payload""""),
        ("value", printB(o.value))
      ))
    }

    @pure def printBase_TypesInteger_Payload(o: Base_Types.Integer_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Integer_Payload""""),
        ("value", printZ(o.value))
      ))
    }

    @pure def printBase_TypesInteger_8_Payload(o: Base_Types.Integer_8_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Integer_8_Payload""""),
        ("value", printS8(o.value))
      ))
    }

    @pure def printBase_TypesInteger_16_Payload(o: Base_Types.Integer_16_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Integer_16_Payload""""),
        ("value", printS16(o.value))
      ))
    }

    @pure def printBase_TypesInteger_32_Payload(o: Base_Types.Integer_32_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Integer_32_Payload""""),
        ("value", printS32(o.value))
      ))
    }

    @pure def printBase_TypesInteger_64_Payload(o: Base_Types.Integer_64_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Integer_64_Payload""""),
        ("value", printS64(o.value))
      ))
    }

    @pure def printBase_TypesUnsigned_8_Payload(o: Base_Types.Unsigned_8_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Unsigned_8_Payload""""),
        ("value", printU8(o.value))
      ))
    }

    @pure def printBase_TypesUnsigned_16_Payload(o: Base_Types.Unsigned_16_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Unsigned_16_Payload""""),
        ("value", printU16(o.value))
      ))
    }

    @pure def printBase_TypesUnsigned_32_Payload(o: Base_Types.Unsigned_32_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Unsigned_32_Payload""""),
        ("value", printU32(o.value))
      ))
    }

    @pure def printBase_TypesUnsigned_64_Payload(o: Base_Types.Unsigned_64_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Unsigned_64_Payload""""),
        ("value", printU64(o.value))
      ))
    }

    @pure def printBase_TypesFloat_Payload(o: Base_Types.Float_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Float_Payload""""),
        ("value", printR(o.value))
      ))
    }

    @pure def printBase_TypesFloat_32_Payload(o: Base_Types.Float_32_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Float_32_Payload""""),
        ("value", printF32(o.value))
      ))
    }

    @pure def printBase_TypesFloat_64_Payload(o: Base_Types.Float_64_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Float_64_Payload""""),
        ("value", printF64(o.value))
      ))
    }

    @pure def printBase_TypesCharacter_Payload(o: Base_Types.Character_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Character_Payload""""),
        ("value", printC(o.value))
      ))
    }

    @pure def printBase_TypesString_Payload(o: Base_Types.String_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.String_Payload""""),
        ("value", printString(o.value))
      ))
    }

    @pure def printBase_TypesBits_Payload(o: Base_Types.Bits_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Bits_Payload""""),
        ("value", printISZ(T, o.value, printB _))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container(o: Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container): ST = {
      o match {
        case o: Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container_P => return printDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container_PS => return printDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_PS(o)
      }
    }

    @pure def printDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_P(o: Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container_P""""),
        ("api_chargerState", printDrone_Lifecycle_GovernorChargerStateType(o.api_chargerState)),
        ("api_pilotRequest", printDrone_Lifecycle_GovernorLifecycleRequestType(o.api_pilotRequest)),
        ("api_recoveryProposal", printDrone_Lifecycle_GovernorRecoveryProposalType(o.api_recoveryProposal))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_PS(o: Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container_PS""""),
        ("api_chargerState", printDrone_Lifecycle_GovernorChargerStateType(o.api_chargerState)),
        ("api_pilotRequest", printDrone_Lifecycle_GovernorLifecycleRequestType(o.api_pilotRequest)),
        ("api_recoveryProposal", printDrone_Lifecycle_GovernorRecoveryProposalType(o.api_recoveryProposal))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container(o: Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container): ST = {
      o match {
        case o: Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container_P => return printDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container_PS => return printDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_PS(o)
      }
    }

    @pure def printDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_P(o: Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container_P""""),
        ("api_arbitratedIntent", printDrone_Lifecycle_GovernorArbitratedIntent(o.api_arbitratedIntent))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_PS(o: Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container_PS""""),
        ("api_arbitratedIntent", printDrone_Lifecycle_GovernorArbitratedIntent(o.api_arbitratedIntent))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container(o: Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container): ST = {
      o match {
        case o: Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_P => return printDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PS => return printDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PS(o)
      }
    }

    @pure def printDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_P(o: Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_P""""),
        ("api_batteryCapacity", printDrone_Lifecycle_GovernorBatteryCapacityBandType(o.api_batteryCapacity)),
        ("api_batteryCheck", printDrone_Lifecycle_GovernorBatteryCheckType(o.api_batteryCheck))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PS(o: Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PS""""),
        ("api_batteryCapacity", printDrone_Lifecycle_GovernorBatteryCapacityBandType(o.api_batteryCapacity)),
        ("api_batteryCheck", printDrone_Lifecycle_GovernorBatteryCheckType(o.api_batteryCheck))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container(o: Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container): ST = {
      o match {
        case o: Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_P => return printDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PS => return printDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PS(o)
      }
    }

    @pure def printDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_P(o: Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_P""""),
        ("api_batteryQualification", printDrone_Lifecycle_GovernorBatteryQualificationType(o.api_batteryQualification))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PS(o: Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PS""""),
        ("api_batteryQualification", printDrone_Lifecycle_GovernorBatteryQualificationType(o.api_batteryQualification))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container(o: Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container): ST = {
      o match {
        case o: Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P => return printDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS => return printDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS(o)
      }
    }

    @pure def printDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P(o: Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P""""),
        ("api_navigationCondition", printDrone_Lifecycle_GovernorNavigationConditionType(o.api_navigationCondition)),
        ("api_radioCondition", printDrone_Lifecycle_GovernorRadioConditionType(o.api_radioCondition))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS(o: Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS""""),
        ("api_navigationCondition", printDrone_Lifecycle_GovernorNavigationConditionType(o.api_navigationCondition)),
        ("api_radioCondition", printDrone_Lifecycle_GovernorRadioConditionType(o.api_radioCondition))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container(o: Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container): ST = {
      o match {
        case o: Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P => return printDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS => return printDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS(o)
      }
    }

    @pure def printDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P(o: Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P""""),
        ("api_flightQualification", printDrone_Lifecycle_GovernorFlightQualificationType(o.api_flightQualification))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS(o: Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS""""),
        ("api_flightQualification", printDrone_Lifecycle_GovernorFlightQualificationType(o.api_flightQualification))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container(o: Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container): ST = {
      o match {
        case o: Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_P => return printDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PS => return printDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PS(o)
      }
    }

    @pure def printDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_P(o: Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_P""""),
        ("api_batteryQualification", printDrone_Lifecycle_GovernorBatteryQualificationType(o.api_batteryQualification)),
        ("api_chargerState", printDrone_Lifecycle_GovernorChargerStateType(o.api_chargerState)),
        ("api_currentLifecycleState", printDrone_Lifecycle_GovernorLifecycleStateType(o.api_currentLifecycleState)),
        ("api_flightQualification", printDrone_Lifecycle_GovernorFlightQualificationType(o.api_flightQualification))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PS(o: Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PS""""),
        ("api_batteryQualification", printDrone_Lifecycle_GovernorBatteryQualificationType(o.api_batteryQualification)),
        ("api_chargerState", printDrone_Lifecycle_GovernorChargerStateType(o.api_chargerState)),
        ("api_currentLifecycleState", printDrone_Lifecycle_GovernorLifecycleStateType(o.api_currentLifecycleState)),
        ("api_flightQualification", printDrone_Lifecycle_GovernorFlightQualificationType(o.api_flightQualification))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container(o: Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container): ST = {
      o match {
        case o: Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_P => return printDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PS => return printDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PS(o)
      }
    }

    @pure def printDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_P(o: Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_P""""),
        ("api_eligibilityEnvelope", printDrone_Lifecycle_GovernorEligibilityEnvelope(o.api_eligibilityEnvelope)),
        ("api_recoveryProposal", printDrone_Lifecycle_GovernorRecoveryProposalType(o.api_recoveryProposal))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PS(o: Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PS""""),
        ("api_eligibilityEnvelope", printDrone_Lifecycle_GovernorEligibilityEnvelope(o.api_eligibilityEnvelope)),
        ("api_recoveryProposal", printDrone_Lifecycle_GovernorRecoveryProposalType(o.api_recoveryProposal))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container(o: Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container): ST = {
      o match {
        case o: Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_P => return printDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PS => return printDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PS(o)
      }
    }

    @pure def printDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_P(o: Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_P""""),
        ("api_arbitratedIntent", printDrone_Lifecycle_GovernorArbitratedIntent(o.api_arbitratedIntent)),
        ("api_eligibilityEnvelope", printDrone_Lifecycle_GovernorEligibilityEnvelope(o.api_eligibilityEnvelope))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PS(o: Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PS""""),
        ("api_arbitratedIntent", printDrone_Lifecycle_GovernorArbitratedIntent(o.api_arbitratedIntent)),
        ("api_eligibilityEnvelope", printDrone_Lifecycle_GovernorEligibilityEnvelope(o.api_eligibilityEnvelope))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container(o: Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container): ST = {
      o match {
        case o: Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_P => return printDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PS => return printDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PS(o)
      }
    }

    @pure def printDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_P(o: Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_P""""),
        ("api_currentLifecycleState", printDrone_Lifecycle_GovernorLifecycleStateType(o.api_currentLifecycleState)),
        ("api_decisionSnapshot", printDrone_Lifecycle_GovernorDecisionSnapshot(o.api_decisionSnapshot))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PS(o: Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PS""""),
        ("api_currentLifecycleState", printDrone_Lifecycle_GovernorLifecycleStateType(o.api_currentLifecycleState)),
        ("api_decisionSnapshot", printDrone_Lifecycle_GovernorDecisionSnapshot(o.api_decisionSnapshot))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container(o: Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container): ST = {
      o match {
        case o: Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_P => return printDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PS => return printDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PS(o)
      }
    }

    @pure def printDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_P(o: Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_P""""),
        ("api_decisionSnapshot", printDrone_Lifecycle_GovernorDecisionSnapshot(o.api_decisionSnapshot))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PS(o: Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PS""""),
        ("api_decisionSnapshot", printDrone_Lifecycle_GovernorDecisionSnapshot(o.api_decisionSnapshot))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container(o: Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container): ST = {
      o match {
        case o: Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_P => return printDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PS => return printDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PS(o)
      }
    }

    @pure def printDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_P(o: Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_P""""),
        ("api_chargeCommand", printDrone_Lifecycle_GovernorChargeCommandType(o.api_chargeCommand)),
        ("api_powerCommand", printDrone_Lifecycle_GovernorPowerCommandType(o.api_powerCommand))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PS(o: Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PS""""),
        ("api_chargeCommand", printDrone_Lifecycle_GovernorChargeCommandType(o.api_chargeCommand)),
        ("api_powerCommand", printDrone_Lifecycle_GovernorPowerCommandType(o.api_powerCommand))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container(o: Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container): ST = {
      o match {
        case o: Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_P => return printDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PS => return printDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PS(o)
      }
    }

    @pure def printDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_P(o: Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_P""""),
        ("api_decisionSnapshot", printDrone_Lifecycle_GovernorDecisionSnapshot(o.api_decisionSnapshot))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PS(o: Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PS""""),
        ("api_decisionSnapshot", printDrone_Lifecycle_GovernorDecisionSnapshot(o.api_decisionSnapshot))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container(o: Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container): ST = {
      o match {
        case o: Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_P => return printDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PS => return printDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PS(o)
      }
    }

    @pure def printDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_P(o: Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_P""""),
        ("api_flightAuthorization", printDrone_Lifecycle_GovernorFlightAuthorizationType(o.api_flightAuthorization))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PS(o: Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PS""""),
        ("api_flightAuthorization", printDrone_Lifecycle_GovernorFlightAuthorizationType(o.api_flightAuthorization))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container(o: Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container): ST = {
      o match {
        case o: Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_P => return printDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PS => return printDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PS(o)
      }
    }

    @pure def printDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_P(o: Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_P""""),
        ("api_batteryQualification", printDrone_Lifecycle_GovernorBatteryQualificationType(o.api_batteryQualification)),
        ("api_decisionSnapshot", printDrone_Lifecycle_GovernorDecisionSnapshot(o.api_decisionSnapshot))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PS(o: Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PS""""),
        ("api_batteryQualification", printDrone_Lifecycle_GovernorBatteryQualificationType(o.api_batteryQualification)),
        ("api_decisionSnapshot", printDrone_Lifecycle_GovernorDecisionSnapshot(o.api_decisionSnapshot))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container(o: Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container): ST = {
      o match {
        case o: Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_P => return printDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PS => return printDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PS(o)
      }
    }

    @pure def printDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_P(o: Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_P""""),
        ("api_pilotStatus", printDrone_Lifecycle_GovernorPilotStatus(o.api_pilotStatus))
      ))
    }

    @pure def printDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PS(o: Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PS""""),
        ("api_pilotStatus", printDrone_Lifecycle_GovernorPilotStatus(o.api_pilotStatus))
      ))
    }

    @pure def printruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): ST = {
      val value: String = o match {
        case runtimemonitor.ObservationKind.DroneLifecycleGovernorSystem_Instance_governorProcess_requestArbiter_postInit => "DroneLifecycleGovernorSystem_Instance_governorProcess_requestArbiter_postInit"
        case runtimemonitor.ObservationKind.DroneLifecycleGovernorSystem_Instance_governorProcess_requestArbiter_preCompute => "DroneLifecycleGovernorSystem_Instance_governorProcess_requestArbiter_preCompute"
        case runtimemonitor.ObservationKind.DroneLifecycleGovernorSystem_Instance_governorProcess_requestArbiter_postCompute => "DroneLifecycleGovernorSystem_Instance_governorProcess_requestArbiter_postCompute"
        case runtimemonitor.ObservationKind.DroneLifecycleGovernorSystem_Instance_governorProcess_batteryQualificationOwner_postInit => "DroneLifecycleGovernorSystem_Instance_governorProcess_batteryQualificationOwner_postInit"
        case runtimemonitor.ObservationKind.DroneLifecycleGovernorSystem_Instance_governorProcess_batteryQualificationOwner_preCompute => "DroneLifecycleGovernorSystem_Instance_governorProcess_batteryQualificationOwner_preCompute"
        case runtimemonitor.ObservationKind.DroneLifecycleGovernorSystem_Instance_governorProcess_batteryQualificationOwner_postCompute => "DroneLifecycleGovernorSystem_Instance_governorProcess_batteryQualificationOwner_postCompute"
        case runtimemonitor.ObservationKind.DroneLifecycleGovernorSystem_Instance_governorProcess_flightReadinessOwner_postInit => "DroneLifecycleGovernorSystem_Instance_governorProcess_flightReadinessOwner_postInit"
        case runtimemonitor.ObservationKind.DroneLifecycleGovernorSystem_Instance_governorProcess_flightReadinessOwner_preCompute => "DroneLifecycleGovernorSystem_Instance_governorProcess_flightReadinessOwner_preCompute"
        case runtimemonitor.ObservationKind.DroneLifecycleGovernorSystem_Instance_governorProcess_flightReadinessOwner_postCompute => "DroneLifecycleGovernorSystem_Instance_governorProcess_flightReadinessOwner_postCompute"
        case runtimemonitor.ObservationKind.DroneLifecycleGovernorSystem_Instance_governorProcess_operationalEligibilityOwner_postInit => "DroneLifecycleGovernorSystem_Instance_governorProcess_operationalEligibilityOwner_postInit"
        case runtimemonitor.ObservationKind.DroneLifecycleGovernorSystem_Instance_governorProcess_operationalEligibilityOwner_preCompute => "DroneLifecycleGovernorSystem_Instance_governorProcess_operationalEligibilityOwner_preCompute"
        case runtimemonitor.ObservationKind.DroneLifecycleGovernorSystem_Instance_governorProcess_operationalEligibilityOwner_postCompute => "DroneLifecycleGovernorSystem_Instance_governorProcess_operationalEligibilityOwner_postCompute"
        case runtimemonitor.ObservationKind.DroneLifecycleGovernorSystem_Instance_governorProcess_lifecycleStateGovernor_postInit => "DroneLifecycleGovernorSystem_Instance_governorProcess_lifecycleStateGovernor_postInit"
        case runtimemonitor.ObservationKind.DroneLifecycleGovernorSystem_Instance_governorProcess_lifecycleStateGovernor_preCompute => "DroneLifecycleGovernorSystem_Instance_governorProcess_lifecycleStateGovernor_preCompute"
        case runtimemonitor.ObservationKind.DroneLifecycleGovernorSystem_Instance_governorProcess_lifecycleStateGovernor_postCompute => "DroneLifecycleGovernorSystem_Instance_governorProcess_lifecycleStateGovernor_postCompute"
        case runtimemonitor.ObservationKind.DroneLifecycleGovernorSystem_Instance_governorProcess_powerChargeCommandPolicy_postInit => "DroneLifecycleGovernorSystem_Instance_governorProcess_powerChargeCommandPolicy_postInit"
        case runtimemonitor.ObservationKind.DroneLifecycleGovernorSystem_Instance_governorProcess_powerChargeCommandPolicy_preCompute => "DroneLifecycleGovernorSystem_Instance_governorProcess_powerChargeCommandPolicy_preCompute"
        case runtimemonitor.ObservationKind.DroneLifecycleGovernorSystem_Instance_governorProcess_powerChargeCommandPolicy_postCompute => "DroneLifecycleGovernorSystem_Instance_governorProcess_powerChargeCommandPolicy_postCompute"
        case runtimemonitor.ObservationKind.DroneLifecycleGovernorSystem_Instance_governorProcess_flightAuthorizationPolicy_postInit => "DroneLifecycleGovernorSystem_Instance_governorProcess_flightAuthorizationPolicy_postInit"
        case runtimemonitor.ObservationKind.DroneLifecycleGovernorSystem_Instance_governorProcess_flightAuthorizationPolicy_preCompute => "DroneLifecycleGovernorSystem_Instance_governorProcess_flightAuthorizationPolicy_preCompute"
        case runtimemonitor.ObservationKind.DroneLifecycleGovernorSystem_Instance_governorProcess_flightAuthorizationPolicy_postCompute => "DroneLifecycleGovernorSystem_Instance_governorProcess_flightAuthorizationPolicy_postCompute"
        case runtimemonitor.ObservationKind.DroneLifecycleGovernorSystem_Instance_governorProcess_supervisoryStatusAssessment_postInit => "DroneLifecycleGovernorSystem_Instance_governorProcess_supervisoryStatusAssessment_postInit"
        case runtimemonitor.ObservationKind.DroneLifecycleGovernorSystem_Instance_governorProcess_supervisoryStatusAssessment_preCompute => "DroneLifecycleGovernorSystem_Instance_governorProcess_supervisoryStatusAssessment_preCompute"
        case runtimemonitor.ObservationKind.DroneLifecycleGovernorSystem_Instance_governorProcess_supervisoryStatusAssessment_postCompute => "DroneLifecycleGovernorSystem_Instance_governorProcess_supervisoryStatusAssessment_postCompute"
      }
      return printObject(ISZ(
        ("type", printString("runtimemonitor.ObservationKind")),
        ("value", printString(value))
      ))
    }

    @pure def printutilContainer(o: util.Container): ST = {
      o match {
        case o: util.EmptyContainer => return printutilEmptyContainer(o)
        case o: Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container_P => return printDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container_PS => return printDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container_P => return printDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container_PS => return printDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P => return printDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS => return printDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P => return printDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS => return printDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_P => return printDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PS => return printDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_P => return printDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PS => return printDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_P => return printDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PS => return printDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_P => return printDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PS => return printDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_P => return printDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_P => return printDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PS => return printDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PS => return printDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_P => return printDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_P => return printDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PS => return printDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PS => return printDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_P => return printDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_P => return printDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PS => return printDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PS => return printDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_P => return printDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PS => return printDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_P => return printDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PS => return printDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PS(o)
      }
    }

    @pure def printutilEmptyContainer(o: util.EmptyContainer): ST = {
      return printObject(ISZ(
        ("type", st""""util.EmptyContainer"""")
      ))
    }

    @pure def print_artDataContent(o: art.DataContent): ST = {
      o match {
        case o: art.Empty => return print_artEmpty(o)
        case o: Base_Types.Boolean_Payload => return printBase_TypesBoolean_Payload(o)
        case o: Base_Types.Integer_Payload => return printBase_TypesInteger_Payload(o)
        case o: Base_Types.Integer_8_Payload => return printBase_TypesInteger_8_Payload(o)
        case o: Base_Types.Integer_16_Payload => return printBase_TypesInteger_16_Payload(o)
        case o: Base_Types.Integer_32_Payload => return printBase_TypesInteger_32_Payload(o)
        case o: Base_Types.Integer_64_Payload => return printBase_TypesInteger_64_Payload(o)
        case o: Base_Types.Unsigned_8_Payload => return printBase_TypesUnsigned_8_Payload(o)
        case o: Base_Types.Unsigned_16_Payload => return printBase_TypesUnsigned_16_Payload(o)
        case o: Base_Types.Unsigned_32_Payload => return printBase_TypesUnsigned_32_Payload(o)
        case o: Base_Types.Unsigned_64_Payload => return printBase_TypesUnsigned_64_Payload(o)
        case o: Base_Types.Float_Payload => return printBase_TypesFloat_Payload(o)
        case o: Base_Types.Float_32_Payload => return printBase_TypesFloat_32_Payload(o)
        case o: Base_Types.Float_64_Payload => return printBase_TypesFloat_64_Payload(o)
        case o: Base_Types.Character_Payload => return printBase_TypesCharacter_Payload(o)
        case o: Base_Types.String_Payload => return printBase_TypesString_Payload(o)
        case o: Base_Types.Bits_Payload => return printBase_TypesBits_Payload(o)
        case o: util.EmptyContainer => return printutilEmptyContainer(o)
        case o: Drone_Lifecycle_Governor.PilotNotice_Payload => return printDrone_Lifecycle_GovernorPilotNotice_Payload(o)
        case o: Drone_Lifecycle_Governor.PilotStatus_Payload => return printDrone_Lifecycle_GovernorPilotStatus_Payload(o)
        case o: Drone_Lifecycle_Governor.BatteryCheck_Payload => return printDrone_Lifecycle_GovernorBatteryCheck_Payload(o)
        case o: Drone_Lifecycle_Governor.ChargerState_Payload => return printDrone_Lifecycle_GovernorChargerState_Payload(o)
        case o: Drone_Lifecycle_Governor.PowerCommand_Payload => return printDrone_Lifecycle_GovernorPowerCommand_Payload(o)
        case o: Drone_Lifecycle_Governor.ChargeCommand_Payload => return printDrone_Lifecycle_GovernorChargeCommand_Payload(o)
        case o: Drone_Lifecycle_Governor.RadioCondition_Payload => return printDrone_Lifecycle_GovernorRadioCondition_Payload(o)
        case o: Drone_Lifecycle_Governor.LifecycleState_Payload => return printDrone_Lifecycle_GovernorLifecycleState_Payload(o)
        case o: Drone_Lifecycle_Governor.EffectiveIntent_Payload => return printDrone_Lifecycle_GovernorEffectiveIntent_Payload(o)
        case o: Drone_Lifecycle_Governor.DecisionPreState_Payload => return printDrone_Lifecycle_GovernorDecisionPreState_Payload(o)
        case o: Drone_Lifecycle_Governor.TransitionResult_Payload => return printDrone_Lifecycle_GovernorTransitionResult_Payload(o)
        case o: Drone_Lifecycle_Governor.RecoveryProposal_Payload => return printDrone_Lifecycle_GovernorRecoveryProposal_Payload(o)
        case o: Drone_Lifecycle_Governor.LifecycleRequest_Payload => return printDrone_Lifecycle_GovernorLifecycleRequest_Payload(o)
        case o: Drone_Lifecycle_Governor.ArbitratedIntent_Payload => return printDrone_Lifecycle_GovernorArbitratedIntent_Payload(o)
        case o: Drone_Lifecycle_Governor.DecisionSnapshot_Payload => return printDrone_Lifecycle_GovernorDecisionSnapshot_Payload(o)
        case o: Drone_Lifecycle_Governor.DecisionNextState_Payload => return printDrone_Lifecycle_GovernorDecisionNextState_Payload(o)
        case o: Drone_Lifecycle_Governor.EligibilityReason_Payload => return printDrone_Lifecycle_GovernorEligibilityReason_Payload(o)
        case o: Drone_Lifecycle_Governor.RequestDisposition_Payload => return printDrone_Lifecycle_GovernorRequestDisposition_Payload(o)
        case o: Drone_Lifecycle_Governor.BatteryCapacityBand_Payload => return printDrone_Lifecycle_GovernorBatteryCapacityBand_Payload(o)
        case o: Drone_Lifecycle_Governor.FlightAuthorization_Payload => return printDrone_Lifecycle_GovernorFlightAuthorization_Payload(o)
        case o: Drone_Lifecycle_Governor.NavigationCondition_Payload => return printDrone_Lifecycle_GovernorNavigationCondition_Payload(o)
        case o: Drone_Lifecycle_Governor.FlightQualification_Payload => return printDrone_Lifecycle_GovernorFlightQualification_Payload(o)
        case o: Drone_Lifecycle_Governor.PilotLifecycleState_Payload => return printDrone_Lifecycle_GovernorPilotLifecycleState_Payload(o)
        case o: Drone_Lifecycle_Governor.EligibilityEnvelope_Payload => return printDrone_Lifecycle_GovernorEligibilityEnvelope_Payload(o)
        case o: Drone_Lifecycle_Governor.BatteryQualification_Payload => return printDrone_Lifecycle_GovernorBatteryQualification_Payload(o)
        case o: Drone_Lifecycle_Governor.FreshRequestPreemption_Payload => return printDrone_Lifecycle_GovernorFreshRequestPreemption_Payload(o)
        case o: Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container_P => return printDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container_PS => return printDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container_P => return printDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container_PS => return printDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P => return printDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS => return printDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P => return printDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS => return printDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_P => return printDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PS => return printDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_P => return printDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PS => return printDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_P => return printDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PS => return printDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_P => return printDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PS => return printDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_P => return printDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_P => return printDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PS => return printDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PS => return printDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_P => return printDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_P => return printDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PS => return printDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PS => return printDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_P => return printDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_P => return printDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_P(o)
        case o: Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PS => return printDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PS => return printDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_P => return printDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PS => return printDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PS(o)
        case o: Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_P => return printDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_P(o)
        case o: Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PS => return printDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PS(o)
      }
    }

    @pure def print_artEmpty(o: art.Empty): ST = {
      return printObject(ISZ(
        ("type", st""""art.Empty"""")
      ))
    }

  }

  @record class Parser(val input: String) {
    val parser: Json.Parser = Json.Parser.create(input)

    def errorOpt: Option[Json.ErrorMsg] = {
      return parser.errorOpt
    }

    def parseDrone_Lifecycle_GovernorLifecycleRequestType(): Drone_Lifecycle_Governor.LifecycleRequest.Type = {
      val r = parseDrone_Lifecycle_GovernorLifecycleRequestT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorLifecycleRequestT(typeParsed: B): Drone_Lifecycle_Governor.LifecycleRequest.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.LifecycleRequest")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Lifecycle_Governor.LifecycleRequest.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Lifecycle_Governor.LifecycleRequest.")
          return Drone_Lifecycle_Governor.LifecycleRequest.byOrdinal(0).get
      }
    }

    def parseDrone_Lifecycle_GovernorLifecycleRequest_Payload(): Drone_Lifecycle_Governor.LifecycleRequest_Payload = {
      val r = parseDrone_Lifecycle_GovernorLifecycleRequest_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorLifecycleRequest_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.LifecycleRequest_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.LifecycleRequest_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_GovernorLifecycleRequestType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.LifecycleRequest_Payload(value)
    }

    def parseDrone_Lifecycle_GovernorChargerStateType(): Drone_Lifecycle_Governor.ChargerState.Type = {
      val r = parseDrone_Lifecycle_GovernorChargerStateT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorChargerStateT(typeParsed: B): Drone_Lifecycle_Governor.ChargerState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.ChargerState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Lifecycle_Governor.ChargerState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Lifecycle_Governor.ChargerState.")
          return Drone_Lifecycle_Governor.ChargerState.byOrdinal(0).get
      }
    }

    def parseDrone_Lifecycle_GovernorChargerState_Payload(): Drone_Lifecycle_Governor.ChargerState_Payload = {
      val r = parseDrone_Lifecycle_GovernorChargerState_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorChargerState_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.ChargerState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.ChargerState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_GovernorChargerStateType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.ChargerState_Payload(value)
    }

    def parseDrone_Lifecycle_GovernorRecoveryProposalType(): Drone_Lifecycle_Governor.RecoveryProposal.Type = {
      val r = parseDrone_Lifecycle_GovernorRecoveryProposalT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorRecoveryProposalT(typeParsed: B): Drone_Lifecycle_Governor.RecoveryProposal.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.RecoveryProposal")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Lifecycle_Governor.RecoveryProposal.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Lifecycle_Governor.RecoveryProposal.")
          return Drone_Lifecycle_Governor.RecoveryProposal.byOrdinal(0).get
      }
    }

    def parseDrone_Lifecycle_GovernorRecoveryProposal_Payload(): Drone_Lifecycle_Governor.RecoveryProposal_Payload = {
      val r = parseDrone_Lifecycle_GovernorRecoveryProposal_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorRecoveryProposal_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.RecoveryProposal_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.RecoveryProposal_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_GovernorRecoveryProposalType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.RecoveryProposal_Payload(value)
    }

    def parseDrone_Lifecycle_GovernorEffectiveIntentType(): Drone_Lifecycle_Governor.EffectiveIntent.Type = {
      val r = parseDrone_Lifecycle_GovernorEffectiveIntentT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorEffectiveIntentT(typeParsed: B): Drone_Lifecycle_Governor.EffectiveIntent.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.EffectiveIntent")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Lifecycle_Governor.EffectiveIntent.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Lifecycle_Governor.EffectiveIntent.")
          return Drone_Lifecycle_Governor.EffectiveIntent.byOrdinal(0).get
      }
    }

    def parseDrone_Lifecycle_GovernorEffectiveIntent_Payload(): Drone_Lifecycle_Governor.EffectiveIntent_Payload = {
      val r = parseDrone_Lifecycle_GovernorEffectiveIntent_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorEffectiveIntent_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.EffectiveIntent_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.EffectiveIntent_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_GovernorEffectiveIntentType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.EffectiveIntent_Payload(value)
    }

    def parseDrone_Lifecycle_GovernorFreshRequestPreemptionType(): Drone_Lifecycle_Governor.FreshRequestPreemption.Type = {
      val r = parseDrone_Lifecycle_GovernorFreshRequestPreemptionT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorFreshRequestPreemptionT(typeParsed: B): Drone_Lifecycle_Governor.FreshRequestPreemption.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.FreshRequestPreemption")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Lifecycle_Governor.FreshRequestPreemption.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Lifecycle_Governor.FreshRequestPreemption.")
          return Drone_Lifecycle_Governor.FreshRequestPreemption.byOrdinal(0).get
      }
    }

    def parseDrone_Lifecycle_GovernorFreshRequestPreemption_Payload(): Drone_Lifecycle_Governor.FreshRequestPreemption_Payload = {
      val r = parseDrone_Lifecycle_GovernorFreshRequestPreemption_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorFreshRequestPreemption_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.FreshRequestPreemption_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.FreshRequestPreemption_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_GovernorFreshRequestPreemptionType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.FreshRequestPreemption_Payload(value)
    }

    def parseDrone_Lifecycle_GovernorBatteryCapacityBandType(): Drone_Lifecycle_Governor.BatteryCapacityBand.Type = {
      val r = parseDrone_Lifecycle_GovernorBatteryCapacityBandT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorBatteryCapacityBandT(typeParsed: B): Drone_Lifecycle_Governor.BatteryCapacityBand.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.BatteryCapacityBand")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Lifecycle_Governor.BatteryCapacityBand.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Lifecycle_Governor.BatteryCapacityBand.")
          return Drone_Lifecycle_Governor.BatteryCapacityBand.byOrdinal(0).get
      }
    }

    def parseDrone_Lifecycle_GovernorBatteryCapacityBand_Payload(): Drone_Lifecycle_Governor.BatteryCapacityBand_Payload = {
      val r = parseDrone_Lifecycle_GovernorBatteryCapacityBand_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorBatteryCapacityBand_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.BatteryCapacityBand_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.BatteryCapacityBand_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_GovernorBatteryCapacityBandType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.BatteryCapacityBand_Payload(value)
    }

    def parseDrone_Lifecycle_GovernorBatteryCheckType(): Drone_Lifecycle_Governor.BatteryCheck.Type = {
      val r = parseDrone_Lifecycle_GovernorBatteryCheckT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorBatteryCheckT(typeParsed: B): Drone_Lifecycle_Governor.BatteryCheck.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.BatteryCheck")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Lifecycle_Governor.BatteryCheck.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Lifecycle_Governor.BatteryCheck.")
          return Drone_Lifecycle_Governor.BatteryCheck.byOrdinal(0).get
      }
    }

    def parseDrone_Lifecycle_GovernorBatteryCheck_Payload(): Drone_Lifecycle_Governor.BatteryCheck_Payload = {
      val r = parseDrone_Lifecycle_GovernorBatteryCheck_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorBatteryCheck_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.BatteryCheck_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.BatteryCheck_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_GovernorBatteryCheckType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.BatteryCheck_Payload(value)
    }

    def parseDrone_Lifecycle_GovernorBatteryQualificationType(): Drone_Lifecycle_Governor.BatteryQualification.Type = {
      val r = parseDrone_Lifecycle_GovernorBatteryQualificationT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorBatteryQualificationT(typeParsed: B): Drone_Lifecycle_Governor.BatteryQualification.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.BatteryQualification")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Lifecycle_Governor.BatteryQualification.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Lifecycle_Governor.BatteryQualification.")
          return Drone_Lifecycle_Governor.BatteryQualification.byOrdinal(0).get
      }
    }

    def parseDrone_Lifecycle_GovernorBatteryQualification_Payload(): Drone_Lifecycle_Governor.BatteryQualification_Payload = {
      val r = parseDrone_Lifecycle_GovernorBatteryQualification_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorBatteryQualification_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.BatteryQualification_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.BatteryQualification_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_GovernorBatteryQualificationType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.BatteryQualification_Payload(value)
    }

    def parseDrone_Lifecycle_GovernorNavigationConditionType(): Drone_Lifecycle_Governor.NavigationCondition.Type = {
      val r = parseDrone_Lifecycle_GovernorNavigationConditionT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorNavigationConditionT(typeParsed: B): Drone_Lifecycle_Governor.NavigationCondition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.NavigationCondition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Lifecycle_Governor.NavigationCondition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Lifecycle_Governor.NavigationCondition.")
          return Drone_Lifecycle_Governor.NavigationCondition.byOrdinal(0).get
      }
    }

    def parseDrone_Lifecycle_GovernorNavigationCondition_Payload(): Drone_Lifecycle_Governor.NavigationCondition_Payload = {
      val r = parseDrone_Lifecycle_GovernorNavigationCondition_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorNavigationCondition_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.NavigationCondition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.NavigationCondition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_GovernorNavigationConditionType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.NavigationCondition_Payload(value)
    }

    def parseDrone_Lifecycle_GovernorRadioConditionType(): Drone_Lifecycle_Governor.RadioCondition.Type = {
      val r = parseDrone_Lifecycle_GovernorRadioConditionT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorRadioConditionT(typeParsed: B): Drone_Lifecycle_Governor.RadioCondition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.RadioCondition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Lifecycle_Governor.RadioCondition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Lifecycle_Governor.RadioCondition.")
          return Drone_Lifecycle_Governor.RadioCondition.byOrdinal(0).get
      }
    }

    def parseDrone_Lifecycle_GovernorRadioCondition_Payload(): Drone_Lifecycle_Governor.RadioCondition_Payload = {
      val r = parseDrone_Lifecycle_GovernorRadioCondition_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorRadioCondition_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.RadioCondition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.RadioCondition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_GovernorRadioConditionType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.RadioCondition_Payload(value)
    }

    def parseDrone_Lifecycle_GovernorFlightQualificationType(): Drone_Lifecycle_Governor.FlightQualification.Type = {
      val r = parseDrone_Lifecycle_GovernorFlightQualificationT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorFlightQualificationT(typeParsed: B): Drone_Lifecycle_Governor.FlightQualification.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.FlightQualification")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Lifecycle_Governor.FlightQualification.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Lifecycle_Governor.FlightQualification.")
          return Drone_Lifecycle_Governor.FlightQualification.byOrdinal(0).get
      }
    }

    def parseDrone_Lifecycle_GovernorFlightQualification_Payload(): Drone_Lifecycle_Governor.FlightQualification_Payload = {
      val r = parseDrone_Lifecycle_GovernorFlightQualification_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorFlightQualification_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.FlightQualification_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.FlightQualification_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_GovernorFlightQualificationType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.FlightQualification_Payload(value)
    }

    def parseDrone_Lifecycle_GovernorLifecycleStateType(): Drone_Lifecycle_Governor.LifecycleState.Type = {
      val r = parseDrone_Lifecycle_GovernorLifecycleStateT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorLifecycleStateT(typeParsed: B): Drone_Lifecycle_Governor.LifecycleState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.LifecycleState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Lifecycle_Governor.LifecycleState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Lifecycle_Governor.LifecycleState.")
          return Drone_Lifecycle_Governor.LifecycleState.byOrdinal(0).get
      }
    }

    def parseDrone_Lifecycle_GovernorLifecycleState_Payload(): Drone_Lifecycle_Governor.LifecycleState_Payload = {
      val r = parseDrone_Lifecycle_GovernorLifecycleState_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorLifecycleState_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.LifecycleState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.LifecycleState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_GovernorLifecycleStateType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.LifecycleState_Payload(value)
    }

    def parseDrone_Lifecycle_GovernorEligibilityReasonType(): Drone_Lifecycle_Governor.EligibilityReason.Type = {
      val r = parseDrone_Lifecycle_GovernorEligibilityReasonT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorEligibilityReasonT(typeParsed: B): Drone_Lifecycle_Governor.EligibilityReason.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.EligibilityReason")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Lifecycle_Governor.EligibilityReason.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Lifecycle_Governor.EligibilityReason.")
          return Drone_Lifecycle_Governor.EligibilityReason.byOrdinal(0).get
      }
    }

    def parseDrone_Lifecycle_GovernorEligibilityReason_Payload(): Drone_Lifecycle_Governor.EligibilityReason_Payload = {
      val r = parseDrone_Lifecycle_GovernorEligibilityReason_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorEligibilityReason_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.EligibilityReason_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.EligibilityReason_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_GovernorEligibilityReasonType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.EligibilityReason_Payload(value)
    }

    def parseDrone_Lifecycle_GovernorDecisionPreStateType(): Drone_Lifecycle_Governor.DecisionPreState.Type = {
      val r = parseDrone_Lifecycle_GovernorDecisionPreStateT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorDecisionPreStateT(typeParsed: B): Drone_Lifecycle_Governor.DecisionPreState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.DecisionPreState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Lifecycle_Governor.DecisionPreState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Lifecycle_Governor.DecisionPreState.")
          return Drone_Lifecycle_Governor.DecisionPreState.byOrdinal(0).get
      }
    }

    def parseDrone_Lifecycle_GovernorDecisionPreState_Payload(): Drone_Lifecycle_Governor.DecisionPreState_Payload = {
      val r = parseDrone_Lifecycle_GovernorDecisionPreState_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorDecisionPreState_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.DecisionPreState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.DecisionPreState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_GovernorDecisionPreStateType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.DecisionPreState_Payload(value)
    }

    def parseDrone_Lifecycle_GovernorDecisionNextStateType(): Drone_Lifecycle_Governor.DecisionNextState.Type = {
      val r = parseDrone_Lifecycle_GovernorDecisionNextStateT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorDecisionNextStateT(typeParsed: B): Drone_Lifecycle_Governor.DecisionNextState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.DecisionNextState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Lifecycle_Governor.DecisionNextState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Lifecycle_Governor.DecisionNextState.")
          return Drone_Lifecycle_Governor.DecisionNextState.byOrdinal(0).get
      }
    }

    def parseDrone_Lifecycle_GovernorDecisionNextState_Payload(): Drone_Lifecycle_Governor.DecisionNextState_Payload = {
      val r = parseDrone_Lifecycle_GovernorDecisionNextState_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorDecisionNextState_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.DecisionNextState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.DecisionNextState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_GovernorDecisionNextStateType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.DecisionNextState_Payload(value)
    }

    def parseDrone_Lifecycle_GovernorTransitionResultType(): Drone_Lifecycle_Governor.TransitionResult.Type = {
      val r = parseDrone_Lifecycle_GovernorTransitionResultT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorTransitionResultT(typeParsed: B): Drone_Lifecycle_Governor.TransitionResult.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.TransitionResult")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Lifecycle_Governor.TransitionResult.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Lifecycle_Governor.TransitionResult.")
          return Drone_Lifecycle_Governor.TransitionResult.byOrdinal(0).get
      }
    }

    def parseDrone_Lifecycle_GovernorTransitionResult_Payload(): Drone_Lifecycle_Governor.TransitionResult_Payload = {
      val r = parseDrone_Lifecycle_GovernorTransitionResult_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorTransitionResult_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.TransitionResult_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.TransitionResult_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_GovernorTransitionResultType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.TransitionResult_Payload(value)
    }

    def parseDrone_Lifecycle_GovernorPowerCommandType(): Drone_Lifecycle_Governor.PowerCommand.Type = {
      val r = parseDrone_Lifecycle_GovernorPowerCommandT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorPowerCommandT(typeParsed: B): Drone_Lifecycle_Governor.PowerCommand.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.PowerCommand")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Lifecycle_Governor.PowerCommand.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Lifecycle_Governor.PowerCommand.")
          return Drone_Lifecycle_Governor.PowerCommand.byOrdinal(0).get
      }
    }

    def parseDrone_Lifecycle_GovernorPowerCommand_Payload(): Drone_Lifecycle_Governor.PowerCommand_Payload = {
      val r = parseDrone_Lifecycle_GovernorPowerCommand_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorPowerCommand_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.PowerCommand_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.PowerCommand_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_GovernorPowerCommandType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.PowerCommand_Payload(value)
    }

    def parseDrone_Lifecycle_GovernorChargeCommandType(): Drone_Lifecycle_Governor.ChargeCommand.Type = {
      val r = parseDrone_Lifecycle_GovernorChargeCommandT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorChargeCommandT(typeParsed: B): Drone_Lifecycle_Governor.ChargeCommand.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.ChargeCommand")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Lifecycle_Governor.ChargeCommand.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Lifecycle_Governor.ChargeCommand.")
          return Drone_Lifecycle_Governor.ChargeCommand.byOrdinal(0).get
      }
    }

    def parseDrone_Lifecycle_GovernorChargeCommand_Payload(): Drone_Lifecycle_Governor.ChargeCommand_Payload = {
      val r = parseDrone_Lifecycle_GovernorChargeCommand_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorChargeCommand_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.ChargeCommand_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.ChargeCommand_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_GovernorChargeCommandType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.ChargeCommand_Payload(value)
    }

    def parseDrone_Lifecycle_GovernorFlightAuthorizationType(): Drone_Lifecycle_Governor.FlightAuthorization.Type = {
      val r = parseDrone_Lifecycle_GovernorFlightAuthorizationT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorFlightAuthorizationT(typeParsed: B): Drone_Lifecycle_Governor.FlightAuthorization.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.FlightAuthorization")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Lifecycle_Governor.FlightAuthorization.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Lifecycle_Governor.FlightAuthorization.")
          return Drone_Lifecycle_Governor.FlightAuthorization.byOrdinal(0).get
      }
    }

    def parseDrone_Lifecycle_GovernorFlightAuthorization_Payload(): Drone_Lifecycle_Governor.FlightAuthorization_Payload = {
      val r = parseDrone_Lifecycle_GovernorFlightAuthorization_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorFlightAuthorization_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.FlightAuthorization_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.FlightAuthorization_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_GovernorFlightAuthorizationType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.FlightAuthorization_Payload(value)
    }

    def parseDrone_Lifecycle_GovernorPilotLifecycleStateType(): Drone_Lifecycle_Governor.PilotLifecycleState.Type = {
      val r = parseDrone_Lifecycle_GovernorPilotLifecycleStateT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorPilotLifecycleStateT(typeParsed: B): Drone_Lifecycle_Governor.PilotLifecycleState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.PilotLifecycleState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Lifecycle_Governor.PilotLifecycleState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Lifecycle_Governor.PilotLifecycleState.")
          return Drone_Lifecycle_Governor.PilotLifecycleState.byOrdinal(0).get
      }
    }

    def parseDrone_Lifecycle_GovernorPilotLifecycleState_Payload(): Drone_Lifecycle_Governor.PilotLifecycleState_Payload = {
      val r = parseDrone_Lifecycle_GovernorPilotLifecycleState_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorPilotLifecycleState_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.PilotLifecycleState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.PilotLifecycleState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_GovernorPilotLifecycleStateType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.PilotLifecycleState_Payload(value)
    }

    def parseDrone_Lifecycle_GovernorRequestDispositionType(): Drone_Lifecycle_Governor.RequestDisposition.Type = {
      val r = parseDrone_Lifecycle_GovernorRequestDispositionT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorRequestDispositionT(typeParsed: B): Drone_Lifecycle_Governor.RequestDisposition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.RequestDisposition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Lifecycle_Governor.RequestDisposition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Lifecycle_Governor.RequestDisposition.")
          return Drone_Lifecycle_Governor.RequestDisposition.byOrdinal(0).get
      }
    }

    def parseDrone_Lifecycle_GovernorRequestDisposition_Payload(): Drone_Lifecycle_Governor.RequestDisposition_Payload = {
      val r = parseDrone_Lifecycle_GovernorRequestDisposition_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorRequestDisposition_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.RequestDisposition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.RequestDisposition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_GovernorRequestDispositionType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.RequestDisposition_Payload(value)
    }

    def parseDrone_Lifecycle_GovernorPilotNoticeType(): Drone_Lifecycle_Governor.PilotNotice.Type = {
      val r = parseDrone_Lifecycle_GovernorPilotNoticeT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorPilotNoticeT(typeParsed: B): Drone_Lifecycle_Governor.PilotNotice.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.PilotNotice")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Lifecycle_Governor.PilotNotice.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Lifecycle_Governor.PilotNotice.")
          return Drone_Lifecycle_Governor.PilotNotice.byOrdinal(0).get
      }
    }

    def parseDrone_Lifecycle_GovernorPilotNotice_Payload(): Drone_Lifecycle_Governor.PilotNotice_Payload = {
      val r = parseDrone_Lifecycle_GovernorPilotNotice_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorPilotNotice_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.PilotNotice_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.PilotNotice_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_GovernorPilotNoticeType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.PilotNotice_Payload(value)
    }

    def parseDrone_Lifecycle_GovernorArbitratedIntent(): Drone_Lifecycle_Governor.ArbitratedIntent = {
      val r = parseDrone_Lifecycle_GovernorArbitratedIntentT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorArbitratedIntentT(typeParsed: B): Drone_Lifecycle_Governor.ArbitratedIntent = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.ArbitratedIntent")
      }
      parser.parseObjectKey("effectiveIntent")
      val effectiveIntent = parseDrone_Lifecycle_GovernorEffectiveIntentType()
      parser.parseObjectNext()
      parser.parseObjectKey("preemption")
      val preemption = parseDrone_Lifecycle_GovernorFreshRequestPreemptionType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.ArbitratedIntent(effectiveIntent, preemption)
    }

    def parseDrone_Lifecycle_GovernorArbitratedIntent_Payload(): Drone_Lifecycle_Governor.ArbitratedIntent_Payload = {
      val r = parseDrone_Lifecycle_GovernorArbitratedIntent_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorArbitratedIntent_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.ArbitratedIntent_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.ArbitratedIntent_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_GovernorArbitratedIntent()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.ArbitratedIntent_Payload(value)
    }

    def parseDrone_Lifecycle_GovernorEligibilityEnvelope(): Drone_Lifecycle_Governor.EligibilityEnvelope = {
      val r = parseDrone_Lifecycle_GovernorEligibilityEnvelopeT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorEligibilityEnvelopeT(typeParsed: B): Drone_Lifecycle_Governor.EligibilityEnvelope = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.EligibilityEnvelope")
      }
      parser.parseObjectKey("flightEligible")
      val flightEligible = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("chargeEligible")
      val chargeEligible = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("decisionReason")
      val decisionReason = parseDrone_Lifecycle_GovernorEligibilityReasonType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.EligibilityEnvelope(flightEligible, chargeEligible, decisionReason)
    }

    def parseDrone_Lifecycle_GovernorEligibilityEnvelope_Payload(): Drone_Lifecycle_Governor.EligibilityEnvelope_Payload = {
      val r = parseDrone_Lifecycle_GovernorEligibilityEnvelope_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorEligibilityEnvelope_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.EligibilityEnvelope_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.EligibilityEnvelope_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_GovernorEligibilityEnvelope()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.EligibilityEnvelope_Payload(value)
    }

    def parseDrone_Lifecycle_GovernorDecisionSnapshot(): Drone_Lifecycle_Governor.DecisionSnapshot = {
      val r = parseDrone_Lifecycle_GovernorDecisionSnapshotT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorDecisionSnapshotT(typeParsed: B): Drone_Lifecycle_Governor.DecisionSnapshot = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.DecisionSnapshot")
      }
      parser.parseObjectKey("preState")
      val preState = parseDrone_Lifecycle_GovernorDecisionPreStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("nextState")
      val nextState = parseDrone_Lifecycle_GovernorDecisionNextStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("effectiveIntent")
      val effectiveIntent = parseDrone_Lifecycle_GovernorEffectiveIntentType()
      parser.parseObjectNext()
      parser.parseObjectKey("transitionResult")
      val transitionResult = parseDrone_Lifecycle_GovernorTransitionResultType()
      parser.parseObjectNext()
      parser.parseObjectKey("decisionReason")
      val decisionReason = parseDrone_Lifecycle_GovernorEligibilityReasonType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.DecisionSnapshot(preState, nextState, effectiveIntent, transitionResult, decisionReason)
    }

    def parseDrone_Lifecycle_GovernorDecisionSnapshot_Payload(): Drone_Lifecycle_Governor.DecisionSnapshot_Payload = {
      val r = parseDrone_Lifecycle_GovernorDecisionSnapshot_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorDecisionSnapshot_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.DecisionSnapshot_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.DecisionSnapshot_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_GovernorDecisionSnapshot()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.DecisionSnapshot_Payload(value)
    }

    def parseDrone_Lifecycle_GovernorPilotStatus(): Drone_Lifecycle_Governor.PilotStatus = {
      val r = parseDrone_Lifecycle_GovernorPilotStatusT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorPilotStatusT(typeParsed: B): Drone_Lifecycle_Governor.PilotStatus = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.PilotStatus")
      }
      parser.parseObjectKey("lifecycleState")
      val lifecycleState = parseDrone_Lifecycle_GovernorPilotLifecycleStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("requestDisposition")
      val requestDisposition = parseDrone_Lifecycle_GovernorRequestDispositionType()
      parser.parseObjectNext()
      parser.parseObjectKey("pilotNotice")
      val pilotNotice = parseDrone_Lifecycle_GovernorPilotNoticeType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.PilotStatus(lifecycleState, requestDisposition, pilotNotice)
    }

    def parseDrone_Lifecycle_GovernorPilotStatus_Payload(): Drone_Lifecycle_Governor.PilotStatus_Payload = {
      val r = parseDrone_Lifecycle_GovernorPilotStatus_PayloadT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorPilotStatus_PayloadT(typeParsed: B): Drone_Lifecycle_Governor.PilotStatus_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.PilotStatus_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Lifecycle_GovernorPilotStatus()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.PilotStatus_Payload(value)
    }

    def parseBase_TypesBoolean_Payload(): Base_Types.Boolean_Payload = {
      val r = parseBase_TypesBoolean_PayloadT(F)
      return r
    }

    def parseBase_TypesBoolean_PayloadT(typeParsed: B): Base_Types.Boolean_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Boolean_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseB()
      parser.parseObjectNext()
      return Base_Types.Boolean_Payload(value)
    }

    def parseBase_TypesInteger_Payload(): Base_Types.Integer_Payload = {
      val r = parseBase_TypesInteger_PayloadT(F)
      return r
    }

    def parseBase_TypesInteger_PayloadT(typeParsed: B): Base_Types.Integer_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Integer_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseZ()
      parser.parseObjectNext()
      return Base_Types.Integer_Payload(value)
    }

    def parseBase_TypesInteger_8_Payload(): Base_Types.Integer_8_Payload = {
      val r = parseBase_TypesInteger_8_PayloadT(F)
      return r
    }

    def parseBase_TypesInteger_8_PayloadT(typeParsed: B): Base_Types.Integer_8_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Integer_8_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseS8()
      parser.parseObjectNext()
      return Base_Types.Integer_8_Payload(value)
    }

    def parseBase_TypesInteger_16_Payload(): Base_Types.Integer_16_Payload = {
      val r = parseBase_TypesInteger_16_PayloadT(F)
      return r
    }

    def parseBase_TypesInteger_16_PayloadT(typeParsed: B): Base_Types.Integer_16_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Integer_16_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseS16()
      parser.parseObjectNext()
      return Base_Types.Integer_16_Payload(value)
    }

    def parseBase_TypesInteger_32_Payload(): Base_Types.Integer_32_Payload = {
      val r = parseBase_TypesInteger_32_PayloadT(F)
      return r
    }

    def parseBase_TypesInteger_32_PayloadT(typeParsed: B): Base_Types.Integer_32_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Integer_32_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseS32()
      parser.parseObjectNext()
      return Base_Types.Integer_32_Payload(value)
    }

    def parseBase_TypesInteger_64_Payload(): Base_Types.Integer_64_Payload = {
      val r = parseBase_TypesInteger_64_PayloadT(F)
      return r
    }

    def parseBase_TypesInteger_64_PayloadT(typeParsed: B): Base_Types.Integer_64_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Integer_64_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseS64()
      parser.parseObjectNext()
      return Base_Types.Integer_64_Payload(value)
    }

    def parseBase_TypesUnsigned_8_Payload(): Base_Types.Unsigned_8_Payload = {
      val r = parseBase_TypesUnsigned_8_PayloadT(F)
      return r
    }

    def parseBase_TypesUnsigned_8_PayloadT(typeParsed: B): Base_Types.Unsigned_8_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Unsigned_8_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseU8()
      parser.parseObjectNext()
      return Base_Types.Unsigned_8_Payload(value)
    }

    def parseBase_TypesUnsigned_16_Payload(): Base_Types.Unsigned_16_Payload = {
      val r = parseBase_TypesUnsigned_16_PayloadT(F)
      return r
    }

    def parseBase_TypesUnsigned_16_PayloadT(typeParsed: B): Base_Types.Unsigned_16_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Unsigned_16_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseU16()
      parser.parseObjectNext()
      return Base_Types.Unsigned_16_Payload(value)
    }

    def parseBase_TypesUnsigned_32_Payload(): Base_Types.Unsigned_32_Payload = {
      val r = parseBase_TypesUnsigned_32_PayloadT(F)
      return r
    }

    def parseBase_TypesUnsigned_32_PayloadT(typeParsed: B): Base_Types.Unsigned_32_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Unsigned_32_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseU32()
      parser.parseObjectNext()
      return Base_Types.Unsigned_32_Payload(value)
    }

    def parseBase_TypesUnsigned_64_Payload(): Base_Types.Unsigned_64_Payload = {
      val r = parseBase_TypesUnsigned_64_PayloadT(F)
      return r
    }

    def parseBase_TypesUnsigned_64_PayloadT(typeParsed: B): Base_Types.Unsigned_64_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Unsigned_64_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseU64()
      parser.parseObjectNext()
      return Base_Types.Unsigned_64_Payload(value)
    }

    def parseBase_TypesFloat_Payload(): Base_Types.Float_Payload = {
      val r = parseBase_TypesFloat_PayloadT(F)
      return r
    }

    def parseBase_TypesFloat_PayloadT(typeParsed: B): Base_Types.Float_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Float_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseR()
      parser.parseObjectNext()
      return Base_Types.Float_Payload(value)
    }

    def parseBase_TypesFloat_32_Payload(): Base_Types.Float_32_Payload = {
      val r = parseBase_TypesFloat_32_PayloadT(F)
      return r
    }

    def parseBase_TypesFloat_32_PayloadT(typeParsed: B): Base_Types.Float_32_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Float_32_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseF32()
      parser.parseObjectNext()
      return Base_Types.Float_32_Payload(value)
    }

    def parseBase_TypesFloat_64_Payload(): Base_Types.Float_64_Payload = {
      val r = parseBase_TypesFloat_64_PayloadT(F)
      return r
    }

    def parseBase_TypesFloat_64_PayloadT(typeParsed: B): Base_Types.Float_64_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Float_64_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseF64()
      parser.parseObjectNext()
      return Base_Types.Float_64_Payload(value)
    }

    def parseBase_TypesCharacter_Payload(): Base_Types.Character_Payload = {
      val r = parseBase_TypesCharacter_PayloadT(F)
      return r
    }

    def parseBase_TypesCharacter_PayloadT(typeParsed: B): Base_Types.Character_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Character_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseC()
      parser.parseObjectNext()
      return Base_Types.Character_Payload(value)
    }

    def parseBase_TypesString_Payload(): Base_Types.String_Payload = {
      val r = parseBase_TypesString_PayloadT(F)
      return r
    }

    def parseBase_TypesString_PayloadT(typeParsed: B): Base_Types.String_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.String_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseString()
      parser.parseObjectNext()
      return Base_Types.String_Payload(value)
    }

    def parseBase_TypesBits_Payload(): Base_Types.Bits_Payload = {
      val r = parseBase_TypesBits_PayloadT(F)
      return r
    }

    def parseBase_TypesBits_PayloadT(typeParsed: B): Base_Types.Bits_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Bits_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseISZ(parser.parseB _)
      parser.parseObjectNext()
      return Base_Types.Bits_Payload(value)
    }

    def parseDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container(): Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container_P", "Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container_PS"))
      t.native match {
        case "Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container_P" => val r = parseDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container_PS" => val r = parseDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_PST(T); return r
        case _ => val r = parseDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_PST(T); return r
      }
    }

    def parseDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_P(): Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container_P = {
      val r = parseDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_PT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_PT(typeParsed: B): Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container_P")
      }
      parser.parseObjectKey("api_chargerState")
      val api_chargerState = parseDrone_Lifecycle_GovernorChargerStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_pilotRequest")
      val api_pilotRequest = parseDrone_Lifecycle_GovernorLifecycleRequestType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recoveryProposal")
      val api_recoveryProposal = parseDrone_Lifecycle_GovernorRecoveryProposalType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container_P(api_chargerState, api_pilotRequest, api_recoveryProposal)
    }

    def parseDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_PS(): Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container_PS = {
      val r = parseDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_PST(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_PST(typeParsed: B): Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container_PS")
      }
      parser.parseObjectKey("api_chargerState")
      val api_chargerState = parseDrone_Lifecycle_GovernorChargerStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_pilotRequest")
      val api_pilotRequest = parseDrone_Lifecycle_GovernorLifecycleRequestType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recoveryProposal")
      val api_recoveryProposal = parseDrone_Lifecycle_GovernorRecoveryProposalType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container_PS(api_chargerState, api_pilotRequest, api_recoveryProposal)
    }

    def parseDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container(): Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container_P", "Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container_PS"))
      t.native match {
        case "Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container_P" => val r = parseDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container_PS" => val r = parseDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_PST(T); return r
        case _ => val r = parseDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_PST(T); return r
      }
    }

    def parseDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_P(): Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container_P = {
      val r = parseDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_PT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_PT(typeParsed: B): Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container_P")
      }
      parser.parseObjectKey("api_arbitratedIntent")
      val api_arbitratedIntent = parseDrone_Lifecycle_GovernorArbitratedIntent()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container_P(api_arbitratedIntent)
    }

    def parseDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_PS(): Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container_PS = {
      val r = parseDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_PST(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_PST(typeParsed: B): Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container_PS")
      }
      parser.parseObjectKey("api_arbitratedIntent")
      val api_arbitratedIntent = parseDrone_Lifecycle_GovernorArbitratedIntent()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container_PS(api_arbitratedIntent)
    }

    def parseDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container(): Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_P", "Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PS"))
      t.native match {
        case "Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_P" => val r = parseDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PS" => val r = parseDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PST(T); return r
        case _ => val r = parseDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PST(T); return r
      }
    }

    def parseDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_P(): Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_P = {
      val r = parseDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PT(typeParsed: B): Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_P")
      }
      parser.parseObjectKey("api_batteryCapacity")
      val api_batteryCapacity = parseDrone_Lifecycle_GovernorBatteryCapacityBandType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_batteryCheck")
      val api_batteryCheck = parseDrone_Lifecycle_GovernorBatteryCheckType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_P(api_batteryCapacity, api_batteryCheck)
    }

    def parseDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PS(): Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PS = {
      val r = parseDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PST(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PST(typeParsed: B): Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_batteryCapacity")
      val api_batteryCapacity = parseDrone_Lifecycle_GovernorBatteryCapacityBandType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_batteryCheck")
      val api_batteryCheck = parseDrone_Lifecycle_GovernorBatteryCheckType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PS(api_batteryCapacity, api_batteryCheck)
    }

    def parseDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container(): Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_P", "Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PS"))
      t.native match {
        case "Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_P" => val r = parseDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PS" => val r = parseDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PST(T); return r
        case _ => val r = parseDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PST(T); return r
      }
    }

    def parseDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_P(): Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_P = {
      val r = parseDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PT(typeParsed: B): Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_P")
      }
      parser.parseObjectKey("api_batteryQualification")
      val api_batteryQualification = parseDrone_Lifecycle_GovernorBatteryQualificationType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_P(api_batteryQualification)
    }

    def parseDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PS(): Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PS = {
      val r = parseDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PST(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PST(typeParsed: B): Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_batteryQualification")
      val api_batteryQualification = parseDrone_Lifecycle_GovernorBatteryQualificationType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PS(api_batteryQualification)
    }

    def parseDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container(): Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P", "Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS"))
      t.native match {
        case "Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P" => val r = parseDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS" => val r = parseDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PST(T); return r
        case _ => val r = parseDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PST(T); return r
      }
    }

    def parseDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P(): Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P = {
      val r = parseDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PT(typeParsed: B): Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P")
      }
      parser.parseObjectKey("api_navigationCondition")
      val api_navigationCondition = parseDrone_Lifecycle_GovernorNavigationConditionType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_radioCondition")
      val api_radioCondition = parseDrone_Lifecycle_GovernorRadioConditionType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P(api_navigationCondition, api_radioCondition)
    }

    def parseDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS(): Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS = {
      val r = parseDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PST(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PST(typeParsed: B): Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_navigationCondition")
      val api_navigationCondition = parseDrone_Lifecycle_GovernorNavigationConditionType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_radioCondition")
      val api_radioCondition = parseDrone_Lifecycle_GovernorRadioConditionType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS(api_navigationCondition, api_radioCondition)
    }

    def parseDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container(): Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P", "Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS"))
      t.native match {
        case "Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P" => val r = parseDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS" => val r = parseDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PST(T); return r
        case _ => val r = parseDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PST(T); return r
      }
    }

    def parseDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P(): Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P = {
      val r = parseDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PT(typeParsed: B): Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P")
      }
      parser.parseObjectKey("api_flightQualification")
      val api_flightQualification = parseDrone_Lifecycle_GovernorFlightQualificationType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P(api_flightQualification)
    }

    def parseDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS(): Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS = {
      val r = parseDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PST(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PST(typeParsed: B): Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_flightQualification")
      val api_flightQualification = parseDrone_Lifecycle_GovernorFlightQualificationType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS(api_flightQualification)
    }

    def parseDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container(): Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_P", "Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PS"))
      t.native match {
        case "Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_P" => val r = parseDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PS" => val r = parseDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PST(T); return r
        case _ => val r = parseDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PST(T); return r
      }
    }

    def parseDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_P(): Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_P = {
      val r = parseDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PT(typeParsed: B): Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_P")
      }
      parser.parseObjectKey("api_batteryQualification")
      val api_batteryQualification = parseDrone_Lifecycle_GovernorBatteryQualificationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_chargerState")
      val api_chargerState = parseDrone_Lifecycle_GovernorChargerStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_currentLifecycleState")
      val api_currentLifecycleState = parseDrone_Lifecycle_GovernorLifecycleStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_flightQualification")
      val api_flightQualification = parseDrone_Lifecycle_GovernorFlightQualificationType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_P(api_batteryQualification, api_chargerState, api_currentLifecycleState, api_flightQualification)
    }

    def parseDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PS(): Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PS = {
      val r = parseDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PST(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PST(typeParsed: B): Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_batteryQualification")
      val api_batteryQualification = parseDrone_Lifecycle_GovernorBatteryQualificationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_chargerState")
      val api_chargerState = parseDrone_Lifecycle_GovernorChargerStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_currentLifecycleState")
      val api_currentLifecycleState = parseDrone_Lifecycle_GovernorLifecycleStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_flightQualification")
      val api_flightQualification = parseDrone_Lifecycle_GovernorFlightQualificationType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PS(api_batteryQualification, api_chargerState, api_currentLifecycleState, api_flightQualification)
    }

    def parseDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container(): Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_P", "Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PS"))
      t.native match {
        case "Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_P" => val r = parseDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PS" => val r = parseDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PST(T); return r
        case _ => val r = parseDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PST(T); return r
      }
    }

    def parseDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_P(): Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_P = {
      val r = parseDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PT(typeParsed: B): Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_P")
      }
      parser.parseObjectKey("api_eligibilityEnvelope")
      val api_eligibilityEnvelope = parseDrone_Lifecycle_GovernorEligibilityEnvelope()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recoveryProposal")
      val api_recoveryProposal = parseDrone_Lifecycle_GovernorRecoveryProposalType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_P(api_eligibilityEnvelope, api_recoveryProposal)
    }

    def parseDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PS(): Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PS = {
      val r = parseDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PST(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PST(typeParsed: B): Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_eligibilityEnvelope")
      val api_eligibilityEnvelope = parseDrone_Lifecycle_GovernorEligibilityEnvelope()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recoveryProposal")
      val api_recoveryProposal = parseDrone_Lifecycle_GovernorRecoveryProposalType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PS(api_eligibilityEnvelope, api_recoveryProposal)
    }

    def parseDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container(): Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_P", "Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PS"))
      t.native match {
        case "Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_P" => val r = parseDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PS" => val r = parseDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PST(T); return r
        case _ => val r = parseDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PST(T); return r
      }
    }

    def parseDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_P(): Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_P = {
      val r = parseDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PT(typeParsed: B): Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_P")
      }
      parser.parseObjectKey("api_arbitratedIntent")
      val api_arbitratedIntent = parseDrone_Lifecycle_GovernorArbitratedIntent()
      parser.parseObjectNext()
      parser.parseObjectKey("api_eligibilityEnvelope")
      val api_eligibilityEnvelope = parseDrone_Lifecycle_GovernorEligibilityEnvelope()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_P(api_arbitratedIntent, api_eligibilityEnvelope)
    }

    def parseDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PS(): Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PS = {
      val r = parseDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PST(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PST(typeParsed: B): Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PS")
      }
      parser.parseObjectKey("api_arbitratedIntent")
      val api_arbitratedIntent = parseDrone_Lifecycle_GovernorArbitratedIntent()
      parser.parseObjectNext()
      parser.parseObjectKey("api_eligibilityEnvelope")
      val api_eligibilityEnvelope = parseDrone_Lifecycle_GovernorEligibilityEnvelope()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PS(api_arbitratedIntent, api_eligibilityEnvelope)
    }

    def parseDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container(): Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_P", "Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PS"))
      t.native match {
        case "Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_P" => val r = parseDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PS" => val r = parseDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PST(T); return r
        case _ => val r = parseDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PST(T); return r
      }
    }

    def parseDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_P(): Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_P = {
      val r = parseDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PT(typeParsed: B): Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_P")
      }
      parser.parseObjectKey("api_currentLifecycleState")
      val api_currentLifecycleState = parseDrone_Lifecycle_GovernorLifecycleStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_decisionSnapshot")
      val api_decisionSnapshot = parseDrone_Lifecycle_GovernorDecisionSnapshot()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_P(api_currentLifecycleState, api_decisionSnapshot)
    }

    def parseDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PS(): Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PS = {
      val r = parseDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PST(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PST(typeParsed: B): Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PS")
      }
      parser.parseObjectKey("api_currentLifecycleState")
      val api_currentLifecycleState = parseDrone_Lifecycle_GovernorLifecycleStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_decisionSnapshot")
      val api_decisionSnapshot = parseDrone_Lifecycle_GovernorDecisionSnapshot()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PS(api_currentLifecycleState, api_decisionSnapshot)
    }

    def parseDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container(): Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_P", "Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PS"))
      t.native match {
        case "Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_P" => val r = parseDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PS" => val r = parseDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PST(T); return r
        case _ => val r = parseDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PST(T); return r
      }
    }

    def parseDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_P(): Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_P = {
      val r = parseDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PT(typeParsed: B): Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_P")
      }
      parser.parseObjectKey("api_decisionSnapshot")
      val api_decisionSnapshot = parseDrone_Lifecycle_GovernorDecisionSnapshot()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_P(api_decisionSnapshot)
    }

    def parseDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PS(): Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PS = {
      val r = parseDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PST(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PST(typeParsed: B): Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PS")
      }
      parser.parseObjectKey("api_decisionSnapshot")
      val api_decisionSnapshot = parseDrone_Lifecycle_GovernorDecisionSnapshot()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PS(api_decisionSnapshot)
    }

    def parseDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container(): Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_P", "Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PS"))
      t.native match {
        case "Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_P" => val r = parseDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PS" => val r = parseDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PST(T); return r
        case _ => val r = parseDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PST(T); return r
      }
    }

    def parseDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_P(): Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_P = {
      val r = parseDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PT(typeParsed: B): Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_P")
      }
      parser.parseObjectKey("api_chargeCommand")
      val api_chargeCommand = parseDrone_Lifecycle_GovernorChargeCommandType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_powerCommand")
      val api_powerCommand = parseDrone_Lifecycle_GovernorPowerCommandType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_P(api_chargeCommand, api_powerCommand)
    }

    def parseDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PS(): Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PS = {
      val r = parseDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PST(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PST(typeParsed: B): Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PS")
      }
      parser.parseObjectKey("api_chargeCommand")
      val api_chargeCommand = parseDrone_Lifecycle_GovernorChargeCommandType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_powerCommand")
      val api_powerCommand = parseDrone_Lifecycle_GovernorPowerCommandType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PS(api_chargeCommand, api_powerCommand)
    }

    def parseDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container(): Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_P", "Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PS"))
      t.native match {
        case "Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_P" => val r = parseDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PS" => val r = parseDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PST(T); return r
        case _ => val r = parseDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PST(T); return r
      }
    }

    def parseDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_P(): Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_P = {
      val r = parseDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PT(typeParsed: B): Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_P")
      }
      parser.parseObjectKey("api_decisionSnapshot")
      val api_decisionSnapshot = parseDrone_Lifecycle_GovernorDecisionSnapshot()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_P(api_decisionSnapshot)
    }

    def parseDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PS(): Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PS = {
      val r = parseDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PST(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PST(typeParsed: B): Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PS")
      }
      parser.parseObjectKey("api_decisionSnapshot")
      val api_decisionSnapshot = parseDrone_Lifecycle_GovernorDecisionSnapshot()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PS(api_decisionSnapshot)
    }

    def parseDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container(): Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_P", "Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PS"))
      t.native match {
        case "Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_P" => val r = parseDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PS" => val r = parseDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PST(T); return r
        case _ => val r = parseDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PST(T); return r
      }
    }

    def parseDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_P(): Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_P = {
      val r = parseDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PT(typeParsed: B): Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_P")
      }
      parser.parseObjectKey("api_flightAuthorization")
      val api_flightAuthorization = parseDrone_Lifecycle_GovernorFlightAuthorizationType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_P(api_flightAuthorization)
    }

    def parseDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PS(): Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PS = {
      val r = parseDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PST(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PST(typeParsed: B): Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PS")
      }
      parser.parseObjectKey("api_flightAuthorization")
      val api_flightAuthorization = parseDrone_Lifecycle_GovernorFlightAuthorizationType()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PS(api_flightAuthorization)
    }

    def parseDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container(): Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_P", "Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PS"))
      t.native match {
        case "Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_P" => val r = parseDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PS" => val r = parseDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PST(T); return r
        case _ => val r = parseDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PST(T); return r
      }
    }

    def parseDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_P(): Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_P = {
      val r = parseDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PT(typeParsed: B): Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_P")
      }
      parser.parseObjectKey("api_batteryQualification")
      val api_batteryQualification = parseDrone_Lifecycle_GovernorBatteryQualificationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_decisionSnapshot")
      val api_decisionSnapshot = parseDrone_Lifecycle_GovernorDecisionSnapshot()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_P(api_batteryQualification, api_decisionSnapshot)
    }

    def parseDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PS(): Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PS = {
      val r = parseDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PST(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PST(typeParsed: B): Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PS")
      }
      parser.parseObjectKey("api_batteryQualification")
      val api_batteryQualification = parseDrone_Lifecycle_GovernorBatteryQualificationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_decisionSnapshot")
      val api_decisionSnapshot = parseDrone_Lifecycle_GovernorDecisionSnapshot()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PS(api_batteryQualification, api_decisionSnapshot)
    }

    def parseDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container(): Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_P", "Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PS"))
      t.native match {
        case "Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_P" => val r = parseDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PS" => val r = parseDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PST(T); return r
        case _ => val r = parseDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PST(T); return r
      }
    }

    def parseDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_P(): Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_P = {
      val r = parseDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PT(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PT(typeParsed: B): Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_P")
      }
      parser.parseObjectKey("api_pilotStatus")
      val api_pilotStatus = parseDrone_Lifecycle_GovernorPilotStatus()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_P(api_pilotStatus)
    }

    def parseDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PS(): Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PS = {
      val r = parseDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PST(F)
      return r
    }

    def parseDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PST(typeParsed: B): Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PS")
      }
      parser.parseObjectKey("api_pilotStatus")
      val api_pilotStatus = parseDrone_Lifecycle_GovernorPilotStatus()
      parser.parseObjectNext()
      return Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PS(api_pilotStatus)
    }

    def parseruntimemonitorObservationKindType(): runtimemonitor.ObservationKind.Type = {
      val r = parseruntimemonitorObservationKindT(F)
      return r
    }

    def parseruntimemonitorObservationKindT(typeParsed: B): runtimemonitor.ObservationKind.Type = {
      if (!typeParsed) {
        parser.parseObjectType("runtimemonitor.ObservationKind")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      runtimemonitor.ObservationKind.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for runtimemonitor.ObservationKind.")
          return runtimemonitor.ObservationKind.byOrdinal(0).get
      }
    }

    def parseutilContainer(): util.Container = {
      val t = parser.parseObjectTypes(ISZ("util.EmptyContainer", "Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container_P", "Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container_PS", "Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container_P", "Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container_PS", "Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P", "Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS", "Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P", "Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS", "Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_P", "Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PS", "Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_P", "Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PS", "Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_P", "Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PS", "Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_P", "Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PS", "Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_P", "Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_P", "Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PS", "Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PS", "Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_P", "Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_P", "Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PS", "Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PS", "Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_P", "Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_P", "Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PS", "Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PS", "Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_P", "Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PS", "Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_P", "Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PS"))
      t.native match {
        case "util.EmptyContainer" => val r = parseutilEmptyContainerT(T); return r
        case "Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container_P" => val r = parseDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container_PS" => val r = parseDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_PST(T); return r
        case "Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container_P" => val r = parseDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container_PS" => val r = parseDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_PST(T); return r
        case "Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P" => val r = parseDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS" => val r = parseDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PST(T); return r
        case "Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P" => val r = parseDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS" => val r = parseDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PST(T); return r
        case "Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_P" => val r = parseDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PS" => val r = parseDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PST(T); return r
        case "Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_P" => val r = parseDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PS" => val r = parseDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PST(T); return r
        case "Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_P" => val r = parseDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PS" => val r = parseDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PST(T); return r
        case "Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_P" => val r = parseDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PS" => val r = parseDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PST(T); return r
        case "Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_P" => val r = parseDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_P" => val r = parseDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PS" => val r = parseDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PST(T); return r
        case "Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PS" => val r = parseDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PST(T); return r
        case "Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_P" => val r = parseDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_P" => val r = parseDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PS" => val r = parseDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PST(T); return r
        case "Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PS" => val r = parseDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PST(T); return r
        case "Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_P" => val r = parseDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_P" => val r = parseDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PS" => val r = parseDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PST(T); return r
        case "Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PS" => val r = parseDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PST(T); return r
        case "Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_P" => val r = parseDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PS" => val r = parseDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PST(T); return r
        case "Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_P" => val r = parseDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PS" => val r = parseDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PST(T); return r
        case _ => val r = parseDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PST(T); return r
      }
    }

    def parseutilEmptyContainer(): util.EmptyContainer = {
      val r = parseutilEmptyContainerT(F)
      return r
    }

    def parseutilEmptyContainerT(typeParsed: B): util.EmptyContainer = {
      if (!typeParsed) {
        parser.parseObjectType("util.EmptyContainer")
      }
      return util.EmptyContainer()
    }

    def parse_artDataContent(): art.DataContent = {
      val t = parser.parseObjectTypes(ISZ("art.Empty", "Base_Types.Boolean_Payload", "Base_Types.Integer_Payload", "Base_Types.Integer_8_Payload", "Base_Types.Integer_16_Payload", "Base_Types.Integer_32_Payload", "Base_Types.Integer_64_Payload", "Base_Types.Unsigned_8_Payload", "Base_Types.Unsigned_16_Payload", "Base_Types.Unsigned_32_Payload", "Base_Types.Unsigned_64_Payload", "Base_Types.Float_Payload", "Base_Types.Float_32_Payload", "Base_Types.Float_64_Payload", "Base_Types.Character_Payload", "Base_Types.String_Payload", "Base_Types.Bits_Payload", "util.EmptyContainer", "Drone_Lifecycle_Governor.PilotNotice_Payload", "Drone_Lifecycle_Governor.PilotStatus_Payload", "Drone_Lifecycle_Governor.BatteryCheck_Payload", "Drone_Lifecycle_Governor.ChargerState_Payload", "Drone_Lifecycle_Governor.PowerCommand_Payload", "Drone_Lifecycle_Governor.ChargeCommand_Payload", "Drone_Lifecycle_Governor.RadioCondition_Payload", "Drone_Lifecycle_Governor.LifecycleState_Payload", "Drone_Lifecycle_Governor.EffectiveIntent_Payload", "Drone_Lifecycle_Governor.DecisionPreState_Payload", "Drone_Lifecycle_Governor.TransitionResult_Payload", "Drone_Lifecycle_Governor.RecoveryProposal_Payload", "Drone_Lifecycle_Governor.LifecycleRequest_Payload", "Drone_Lifecycle_Governor.ArbitratedIntent_Payload", "Drone_Lifecycle_Governor.DecisionSnapshot_Payload", "Drone_Lifecycle_Governor.DecisionNextState_Payload", "Drone_Lifecycle_Governor.EligibilityReason_Payload", "Drone_Lifecycle_Governor.RequestDisposition_Payload", "Drone_Lifecycle_Governor.BatteryCapacityBand_Payload", "Drone_Lifecycle_Governor.FlightAuthorization_Payload", "Drone_Lifecycle_Governor.NavigationCondition_Payload", "Drone_Lifecycle_Governor.FlightQualification_Payload", "Drone_Lifecycle_Governor.PilotLifecycleState_Payload", "Drone_Lifecycle_Governor.EligibilityEnvelope_Payload", "Drone_Lifecycle_Governor.BatteryQualification_Payload", "Drone_Lifecycle_Governor.FreshRequestPreemption_Payload", "Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container_P", "Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container_PS", "Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container_P", "Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container_PS", "Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P", "Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS", "Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P", "Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS", "Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_P", "Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PS", "Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_P", "Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PS", "Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_P", "Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PS", "Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_P", "Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PS", "Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_P", "Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_P", "Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PS", "Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PS", "Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_P", "Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_P", "Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PS", "Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PS", "Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_P", "Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_P", "Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PS", "Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PS", "Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_P", "Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PS", "Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_P", "Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PS"))
      t.native match {
        case "art.Empty" => val r = parse_artEmptyT(T); return r
        case "Base_Types.Boolean_Payload" => val r = parseBase_TypesBoolean_PayloadT(T); return r
        case "Base_Types.Integer_Payload" => val r = parseBase_TypesInteger_PayloadT(T); return r
        case "Base_Types.Integer_8_Payload" => val r = parseBase_TypesInteger_8_PayloadT(T); return r
        case "Base_Types.Integer_16_Payload" => val r = parseBase_TypesInteger_16_PayloadT(T); return r
        case "Base_Types.Integer_32_Payload" => val r = parseBase_TypesInteger_32_PayloadT(T); return r
        case "Base_Types.Integer_64_Payload" => val r = parseBase_TypesInteger_64_PayloadT(T); return r
        case "Base_Types.Unsigned_8_Payload" => val r = parseBase_TypesUnsigned_8_PayloadT(T); return r
        case "Base_Types.Unsigned_16_Payload" => val r = parseBase_TypesUnsigned_16_PayloadT(T); return r
        case "Base_Types.Unsigned_32_Payload" => val r = parseBase_TypesUnsigned_32_PayloadT(T); return r
        case "Base_Types.Unsigned_64_Payload" => val r = parseBase_TypesUnsigned_64_PayloadT(T); return r
        case "Base_Types.Float_Payload" => val r = parseBase_TypesFloat_PayloadT(T); return r
        case "Base_Types.Float_32_Payload" => val r = parseBase_TypesFloat_32_PayloadT(T); return r
        case "Base_Types.Float_64_Payload" => val r = parseBase_TypesFloat_64_PayloadT(T); return r
        case "Base_Types.Character_Payload" => val r = parseBase_TypesCharacter_PayloadT(T); return r
        case "Base_Types.String_Payload" => val r = parseBase_TypesString_PayloadT(T); return r
        case "Base_Types.Bits_Payload" => val r = parseBase_TypesBits_PayloadT(T); return r
        case "util.EmptyContainer" => val r = parseutilEmptyContainerT(T); return r
        case "Drone_Lifecycle_Governor.PilotNotice_Payload" => val r = parseDrone_Lifecycle_GovernorPilotNotice_PayloadT(T); return r
        case "Drone_Lifecycle_Governor.PilotStatus_Payload" => val r = parseDrone_Lifecycle_GovernorPilotStatus_PayloadT(T); return r
        case "Drone_Lifecycle_Governor.BatteryCheck_Payload" => val r = parseDrone_Lifecycle_GovernorBatteryCheck_PayloadT(T); return r
        case "Drone_Lifecycle_Governor.ChargerState_Payload" => val r = parseDrone_Lifecycle_GovernorChargerState_PayloadT(T); return r
        case "Drone_Lifecycle_Governor.PowerCommand_Payload" => val r = parseDrone_Lifecycle_GovernorPowerCommand_PayloadT(T); return r
        case "Drone_Lifecycle_Governor.ChargeCommand_Payload" => val r = parseDrone_Lifecycle_GovernorChargeCommand_PayloadT(T); return r
        case "Drone_Lifecycle_Governor.RadioCondition_Payload" => val r = parseDrone_Lifecycle_GovernorRadioCondition_PayloadT(T); return r
        case "Drone_Lifecycle_Governor.LifecycleState_Payload" => val r = parseDrone_Lifecycle_GovernorLifecycleState_PayloadT(T); return r
        case "Drone_Lifecycle_Governor.EffectiveIntent_Payload" => val r = parseDrone_Lifecycle_GovernorEffectiveIntent_PayloadT(T); return r
        case "Drone_Lifecycle_Governor.DecisionPreState_Payload" => val r = parseDrone_Lifecycle_GovernorDecisionPreState_PayloadT(T); return r
        case "Drone_Lifecycle_Governor.TransitionResult_Payload" => val r = parseDrone_Lifecycle_GovernorTransitionResult_PayloadT(T); return r
        case "Drone_Lifecycle_Governor.RecoveryProposal_Payload" => val r = parseDrone_Lifecycle_GovernorRecoveryProposal_PayloadT(T); return r
        case "Drone_Lifecycle_Governor.LifecycleRequest_Payload" => val r = parseDrone_Lifecycle_GovernorLifecycleRequest_PayloadT(T); return r
        case "Drone_Lifecycle_Governor.ArbitratedIntent_Payload" => val r = parseDrone_Lifecycle_GovernorArbitratedIntent_PayloadT(T); return r
        case "Drone_Lifecycle_Governor.DecisionSnapshot_Payload" => val r = parseDrone_Lifecycle_GovernorDecisionSnapshot_PayloadT(T); return r
        case "Drone_Lifecycle_Governor.DecisionNextState_Payload" => val r = parseDrone_Lifecycle_GovernorDecisionNextState_PayloadT(T); return r
        case "Drone_Lifecycle_Governor.EligibilityReason_Payload" => val r = parseDrone_Lifecycle_GovernorEligibilityReason_PayloadT(T); return r
        case "Drone_Lifecycle_Governor.RequestDisposition_Payload" => val r = parseDrone_Lifecycle_GovernorRequestDisposition_PayloadT(T); return r
        case "Drone_Lifecycle_Governor.BatteryCapacityBand_Payload" => val r = parseDrone_Lifecycle_GovernorBatteryCapacityBand_PayloadT(T); return r
        case "Drone_Lifecycle_Governor.FlightAuthorization_Payload" => val r = parseDrone_Lifecycle_GovernorFlightAuthorization_PayloadT(T); return r
        case "Drone_Lifecycle_Governor.NavigationCondition_Payload" => val r = parseDrone_Lifecycle_GovernorNavigationCondition_PayloadT(T); return r
        case "Drone_Lifecycle_Governor.FlightQualification_Payload" => val r = parseDrone_Lifecycle_GovernorFlightQualification_PayloadT(T); return r
        case "Drone_Lifecycle_Governor.PilotLifecycleState_Payload" => val r = parseDrone_Lifecycle_GovernorPilotLifecycleState_PayloadT(T); return r
        case "Drone_Lifecycle_Governor.EligibilityEnvelope_Payload" => val r = parseDrone_Lifecycle_GovernorEligibilityEnvelope_PayloadT(T); return r
        case "Drone_Lifecycle_Governor.BatteryQualification_Payload" => val r = parseDrone_Lifecycle_GovernorBatteryQualification_PayloadT(T); return r
        case "Drone_Lifecycle_Governor.FreshRequestPreemption_Payload" => val r = parseDrone_Lifecycle_GovernorFreshRequestPreemption_PayloadT(T); return r
        case "Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container_P" => val r = parseDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container_PS" => val r = parseDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_PST(T); return r
        case "Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container_P" => val r = parseDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container_PS" => val r = parseDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_PST(T); return r
        case "Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P" => val r = parseDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS" => val r = parseDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PST(T); return r
        case "Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P" => val r = parseDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS" => val r = parseDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PST(T); return r
        case "Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_P" => val r = parseDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PS" => val r = parseDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PST(T); return r
        case "Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_P" => val r = parseDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PS" => val r = parseDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PST(T); return r
        case "Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_P" => val r = parseDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PS" => val r = parseDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PST(T); return r
        case "Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_P" => val r = parseDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PS" => val r = parseDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PST(T); return r
        case "Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_P" => val r = parseDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_P" => val r = parseDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PS" => val r = parseDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PST(T); return r
        case "Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PS" => val r = parseDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PST(T); return r
        case "Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_P" => val r = parseDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_P" => val r = parseDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PS" => val r = parseDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PST(T); return r
        case "Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PS" => val r = parseDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PST(T); return r
        case "Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_P" => val r = parseDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_P" => val r = parseDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PS" => val r = parseDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PST(T); return r
        case "Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PS" => val r = parseDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PST(T); return r
        case "Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_P" => val r = parseDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PS" => val r = parseDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PST(T); return r
        case "Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_P" => val r = parseDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PT(T); return r
        case "Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PS" => val r = parseDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PST(T); return r
        case _ => val r = parseDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PST(T); return r
      }
    }

    def parse_artEmpty(): art.Empty = {
      val r = parse_artEmptyT(F)
      return r
    }

    def parse_artEmptyT(typeParsed: B): art.Empty = {
      if (!typeParsed) {
        parser.parseObjectType("art.Empty")
      }
      return art.Empty()
    }

    def eof(): B = {
      val r = parser.eof()
      return r
    }

  }

  def to[T](s: String, f: Parser => T): Either[T, Json.ErrorMsg] = {
    val parser = Parser(s)
    val r = f(parser)
    parser.eof()
    parser.errorOpt match {
      case Some(e) => return Either.Right(e)
      case _ => return Either.Left(r)
    }
  }

  def fromDrone_Lifecycle_GovernorLifecycleRequest_Payload(o: Drone_Lifecycle_Governor.LifecycleRequest_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorLifecycleRequest_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorLifecycleRequest_Payload(s: String): Either[Drone_Lifecycle_Governor.LifecycleRequest_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorLifecycleRequest_Payload(parser: Parser): Drone_Lifecycle_Governor.LifecycleRequest_Payload = {
      val r = parser.parseDrone_Lifecycle_GovernorLifecycleRequest_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorLifecycleRequest_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorChargerState_Payload(o: Drone_Lifecycle_Governor.ChargerState_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorChargerState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorChargerState_Payload(s: String): Either[Drone_Lifecycle_Governor.ChargerState_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorChargerState_Payload(parser: Parser): Drone_Lifecycle_Governor.ChargerState_Payload = {
      val r = parser.parseDrone_Lifecycle_GovernorChargerState_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorChargerState_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorRecoveryProposal_Payload(o: Drone_Lifecycle_Governor.RecoveryProposal_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorRecoveryProposal_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorRecoveryProposal_Payload(s: String): Either[Drone_Lifecycle_Governor.RecoveryProposal_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorRecoveryProposal_Payload(parser: Parser): Drone_Lifecycle_Governor.RecoveryProposal_Payload = {
      val r = parser.parseDrone_Lifecycle_GovernorRecoveryProposal_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorRecoveryProposal_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorEffectiveIntent_Payload(o: Drone_Lifecycle_Governor.EffectiveIntent_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorEffectiveIntent_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorEffectiveIntent_Payload(s: String): Either[Drone_Lifecycle_Governor.EffectiveIntent_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorEffectiveIntent_Payload(parser: Parser): Drone_Lifecycle_Governor.EffectiveIntent_Payload = {
      val r = parser.parseDrone_Lifecycle_GovernorEffectiveIntent_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorEffectiveIntent_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorFreshRequestPreemption_Payload(o: Drone_Lifecycle_Governor.FreshRequestPreemption_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorFreshRequestPreemption_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorFreshRequestPreemption_Payload(s: String): Either[Drone_Lifecycle_Governor.FreshRequestPreemption_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorFreshRequestPreemption_Payload(parser: Parser): Drone_Lifecycle_Governor.FreshRequestPreemption_Payload = {
      val r = parser.parseDrone_Lifecycle_GovernorFreshRequestPreemption_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorFreshRequestPreemption_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorBatteryCapacityBand_Payload(o: Drone_Lifecycle_Governor.BatteryCapacityBand_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorBatteryCapacityBand_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorBatteryCapacityBand_Payload(s: String): Either[Drone_Lifecycle_Governor.BatteryCapacityBand_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorBatteryCapacityBand_Payload(parser: Parser): Drone_Lifecycle_Governor.BatteryCapacityBand_Payload = {
      val r = parser.parseDrone_Lifecycle_GovernorBatteryCapacityBand_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorBatteryCapacityBand_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorBatteryCheck_Payload(o: Drone_Lifecycle_Governor.BatteryCheck_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorBatteryCheck_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorBatteryCheck_Payload(s: String): Either[Drone_Lifecycle_Governor.BatteryCheck_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorBatteryCheck_Payload(parser: Parser): Drone_Lifecycle_Governor.BatteryCheck_Payload = {
      val r = parser.parseDrone_Lifecycle_GovernorBatteryCheck_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorBatteryCheck_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorBatteryQualification_Payload(o: Drone_Lifecycle_Governor.BatteryQualification_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorBatteryQualification_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorBatteryQualification_Payload(s: String): Either[Drone_Lifecycle_Governor.BatteryQualification_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorBatteryQualification_Payload(parser: Parser): Drone_Lifecycle_Governor.BatteryQualification_Payload = {
      val r = parser.parseDrone_Lifecycle_GovernorBatteryQualification_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorBatteryQualification_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorNavigationCondition_Payload(o: Drone_Lifecycle_Governor.NavigationCondition_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorNavigationCondition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorNavigationCondition_Payload(s: String): Either[Drone_Lifecycle_Governor.NavigationCondition_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorNavigationCondition_Payload(parser: Parser): Drone_Lifecycle_Governor.NavigationCondition_Payload = {
      val r = parser.parseDrone_Lifecycle_GovernorNavigationCondition_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorNavigationCondition_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorRadioCondition_Payload(o: Drone_Lifecycle_Governor.RadioCondition_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorRadioCondition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorRadioCondition_Payload(s: String): Either[Drone_Lifecycle_Governor.RadioCondition_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorRadioCondition_Payload(parser: Parser): Drone_Lifecycle_Governor.RadioCondition_Payload = {
      val r = parser.parseDrone_Lifecycle_GovernorRadioCondition_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorRadioCondition_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorFlightQualification_Payload(o: Drone_Lifecycle_Governor.FlightQualification_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorFlightQualification_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorFlightQualification_Payload(s: String): Either[Drone_Lifecycle_Governor.FlightQualification_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorFlightQualification_Payload(parser: Parser): Drone_Lifecycle_Governor.FlightQualification_Payload = {
      val r = parser.parseDrone_Lifecycle_GovernorFlightQualification_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorFlightQualification_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorLifecycleState_Payload(o: Drone_Lifecycle_Governor.LifecycleState_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorLifecycleState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorLifecycleState_Payload(s: String): Either[Drone_Lifecycle_Governor.LifecycleState_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorLifecycleState_Payload(parser: Parser): Drone_Lifecycle_Governor.LifecycleState_Payload = {
      val r = parser.parseDrone_Lifecycle_GovernorLifecycleState_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorLifecycleState_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorEligibilityReason_Payload(o: Drone_Lifecycle_Governor.EligibilityReason_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorEligibilityReason_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorEligibilityReason_Payload(s: String): Either[Drone_Lifecycle_Governor.EligibilityReason_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorEligibilityReason_Payload(parser: Parser): Drone_Lifecycle_Governor.EligibilityReason_Payload = {
      val r = parser.parseDrone_Lifecycle_GovernorEligibilityReason_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorEligibilityReason_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorDecisionPreState_Payload(o: Drone_Lifecycle_Governor.DecisionPreState_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorDecisionPreState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorDecisionPreState_Payload(s: String): Either[Drone_Lifecycle_Governor.DecisionPreState_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorDecisionPreState_Payload(parser: Parser): Drone_Lifecycle_Governor.DecisionPreState_Payload = {
      val r = parser.parseDrone_Lifecycle_GovernorDecisionPreState_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorDecisionPreState_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorDecisionNextState_Payload(o: Drone_Lifecycle_Governor.DecisionNextState_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorDecisionNextState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorDecisionNextState_Payload(s: String): Either[Drone_Lifecycle_Governor.DecisionNextState_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorDecisionNextState_Payload(parser: Parser): Drone_Lifecycle_Governor.DecisionNextState_Payload = {
      val r = parser.parseDrone_Lifecycle_GovernorDecisionNextState_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorDecisionNextState_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorTransitionResult_Payload(o: Drone_Lifecycle_Governor.TransitionResult_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorTransitionResult_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorTransitionResult_Payload(s: String): Either[Drone_Lifecycle_Governor.TransitionResult_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorTransitionResult_Payload(parser: Parser): Drone_Lifecycle_Governor.TransitionResult_Payload = {
      val r = parser.parseDrone_Lifecycle_GovernorTransitionResult_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorTransitionResult_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorPowerCommand_Payload(o: Drone_Lifecycle_Governor.PowerCommand_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorPowerCommand_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorPowerCommand_Payload(s: String): Either[Drone_Lifecycle_Governor.PowerCommand_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorPowerCommand_Payload(parser: Parser): Drone_Lifecycle_Governor.PowerCommand_Payload = {
      val r = parser.parseDrone_Lifecycle_GovernorPowerCommand_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorPowerCommand_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorChargeCommand_Payload(o: Drone_Lifecycle_Governor.ChargeCommand_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorChargeCommand_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorChargeCommand_Payload(s: String): Either[Drone_Lifecycle_Governor.ChargeCommand_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorChargeCommand_Payload(parser: Parser): Drone_Lifecycle_Governor.ChargeCommand_Payload = {
      val r = parser.parseDrone_Lifecycle_GovernorChargeCommand_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorChargeCommand_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorFlightAuthorization_Payload(o: Drone_Lifecycle_Governor.FlightAuthorization_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorFlightAuthorization_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorFlightAuthorization_Payload(s: String): Either[Drone_Lifecycle_Governor.FlightAuthorization_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorFlightAuthorization_Payload(parser: Parser): Drone_Lifecycle_Governor.FlightAuthorization_Payload = {
      val r = parser.parseDrone_Lifecycle_GovernorFlightAuthorization_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorFlightAuthorization_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorPilotLifecycleState_Payload(o: Drone_Lifecycle_Governor.PilotLifecycleState_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorPilotLifecycleState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorPilotLifecycleState_Payload(s: String): Either[Drone_Lifecycle_Governor.PilotLifecycleState_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorPilotLifecycleState_Payload(parser: Parser): Drone_Lifecycle_Governor.PilotLifecycleState_Payload = {
      val r = parser.parseDrone_Lifecycle_GovernorPilotLifecycleState_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorPilotLifecycleState_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorRequestDisposition_Payload(o: Drone_Lifecycle_Governor.RequestDisposition_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorRequestDisposition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorRequestDisposition_Payload(s: String): Either[Drone_Lifecycle_Governor.RequestDisposition_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorRequestDisposition_Payload(parser: Parser): Drone_Lifecycle_Governor.RequestDisposition_Payload = {
      val r = parser.parseDrone_Lifecycle_GovernorRequestDisposition_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorRequestDisposition_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorPilotNotice_Payload(o: Drone_Lifecycle_Governor.PilotNotice_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorPilotNotice_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorPilotNotice_Payload(s: String): Either[Drone_Lifecycle_Governor.PilotNotice_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorPilotNotice_Payload(parser: Parser): Drone_Lifecycle_Governor.PilotNotice_Payload = {
      val r = parser.parseDrone_Lifecycle_GovernorPilotNotice_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorPilotNotice_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorArbitratedIntent(o: Drone_Lifecycle_Governor.ArbitratedIntent, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorArbitratedIntent(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorArbitratedIntent(s: String): Either[Drone_Lifecycle_Governor.ArbitratedIntent, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorArbitratedIntent(parser: Parser): Drone_Lifecycle_Governor.ArbitratedIntent = {
      val r = parser.parseDrone_Lifecycle_GovernorArbitratedIntent()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorArbitratedIntent _)
    return r
  }

  def fromDrone_Lifecycle_GovernorArbitratedIntent_Payload(o: Drone_Lifecycle_Governor.ArbitratedIntent_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorArbitratedIntent_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorArbitratedIntent_Payload(s: String): Either[Drone_Lifecycle_Governor.ArbitratedIntent_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorArbitratedIntent_Payload(parser: Parser): Drone_Lifecycle_Governor.ArbitratedIntent_Payload = {
      val r = parser.parseDrone_Lifecycle_GovernorArbitratedIntent_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorArbitratedIntent_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorEligibilityEnvelope(o: Drone_Lifecycle_Governor.EligibilityEnvelope, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorEligibilityEnvelope(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorEligibilityEnvelope(s: String): Either[Drone_Lifecycle_Governor.EligibilityEnvelope, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorEligibilityEnvelope(parser: Parser): Drone_Lifecycle_Governor.EligibilityEnvelope = {
      val r = parser.parseDrone_Lifecycle_GovernorEligibilityEnvelope()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorEligibilityEnvelope _)
    return r
  }

  def fromDrone_Lifecycle_GovernorEligibilityEnvelope_Payload(o: Drone_Lifecycle_Governor.EligibilityEnvelope_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorEligibilityEnvelope_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorEligibilityEnvelope_Payload(s: String): Either[Drone_Lifecycle_Governor.EligibilityEnvelope_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorEligibilityEnvelope_Payload(parser: Parser): Drone_Lifecycle_Governor.EligibilityEnvelope_Payload = {
      val r = parser.parseDrone_Lifecycle_GovernorEligibilityEnvelope_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorEligibilityEnvelope_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorDecisionSnapshot(o: Drone_Lifecycle_Governor.DecisionSnapshot, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorDecisionSnapshot(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorDecisionSnapshot(s: String): Either[Drone_Lifecycle_Governor.DecisionSnapshot, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorDecisionSnapshot(parser: Parser): Drone_Lifecycle_Governor.DecisionSnapshot = {
      val r = parser.parseDrone_Lifecycle_GovernorDecisionSnapshot()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorDecisionSnapshot _)
    return r
  }

  def fromDrone_Lifecycle_GovernorDecisionSnapshot_Payload(o: Drone_Lifecycle_Governor.DecisionSnapshot_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorDecisionSnapshot_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorDecisionSnapshot_Payload(s: String): Either[Drone_Lifecycle_Governor.DecisionSnapshot_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorDecisionSnapshot_Payload(parser: Parser): Drone_Lifecycle_Governor.DecisionSnapshot_Payload = {
      val r = parser.parseDrone_Lifecycle_GovernorDecisionSnapshot_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorDecisionSnapshot_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorPilotStatus(o: Drone_Lifecycle_Governor.PilotStatus, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorPilotStatus(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorPilotStatus(s: String): Either[Drone_Lifecycle_Governor.PilotStatus, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorPilotStatus(parser: Parser): Drone_Lifecycle_Governor.PilotStatus = {
      val r = parser.parseDrone_Lifecycle_GovernorPilotStatus()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorPilotStatus _)
    return r
  }

  def fromDrone_Lifecycle_GovernorPilotStatus_Payload(o: Drone_Lifecycle_Governor.PilotStatus_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorPilotStatus_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorPilotStatus_Payload(s: String): Either[Drone_Lifecycle_Governor.PilotStatus_Payload, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorPilotStatus_Payload(parser: Parser): Drone_Lifecycle_Governor.PilotStatus_Payload = {
      val r = parser.parseDrone_Lifecycle_GovernorPilotStatus_Payload()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorPilotStatus_Payload _)
    return r
  }

  def fromBase_TypesBoolean_Payload(o: Base_Types.Boolean_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesBoolean_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesBoolean_Payload(s: String): Either[Base_Types.Boolean_Payload, Json.ErrorMsg] = {
    def fBase_TypesBoolean_Payload(parser: Parser): Base_Types.Boolean_Payload = {
      val r = parser.parseBase_TypesBoolean_Payload()
      return r
    }
    val r = to(s, fBase_TypesBoolean_Payload _)
    return r
  }

  def fromBase_TypesInteger_Payload(o: Base_Types.Integer_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesInteger_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesInteger_Payload(s: String): Either[Base_Types.Integer_Payload, Json.ErrorMsg] = {
    def fBase_TypesInteger_Payload(parser: Parser): Base_Types.Integer_Payload = {
      val r = parser.parseBase_TypesInteger_Payload()
      return r
    }
    val r = to(s, fBase_TypesInteger_Payload _)
    return r
  }

  def fromBase_TypesInteger_8_Payload(o: Base_Types.Integer_8_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesInteger_8_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesInteger_8_Payload(s: String): Either[Base_Types.Integer_8_Payload, Json.ErrorMsg] = {
    def fBase_TypesInteger_8_Payload(parser: Parser): Base_Types.Integer_8_Payload = {
      val r = parser.parseBase_TypesInteger_8_Payload()
      return r
    }
    val r = to(s, fBase_TypesInteger_8_Payload _)
    return r
  }

  def fromBase_TypesInteger_16_Payload(o: Base_Types.Integer_16_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesInteger_16_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesInteger_16_Payload(s: String): Either[Base_Types.Integer_16_Payload, Json.ErrorMsg] = {
    def fBase_TypesInteger_16_Payload(parser: Parser): Base_Types.Integer_16_Payload = {
      val r = parser.parseBase_TypesInteger_16_Payload()
      return r
    }
    val r = to(s, fBase_TypesInteger_16_Payload _)
    return r
  }

  def fromBase_TypesInteger_32_Payload(o: Base_Types.Integer_32_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesInteger_32_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesInteger_32_Payload(s: String): Either[Base_Types.Integer_32_Payload, Json.ErrorMsg] = {
    def fBase_TypesInteger_32_Payload(parser: Parser): Base_Types.Integer_32_Payload = {
      val r = parser.parseBase_TypesInteger_32_Payload()
      return r
    }
    val r = to(s, fBase_TypesInteger_32_Payload _)
    return r
  }

  def fromBase_TypesInteger_64_Payload(o: Base_Types.Integer_64_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesInteger_64_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesInteger_64_Payload(s: String): Either[Base_Types.Integer_64_Payload, Json.ErrorMsg] = {
    def fBase_TypesInteger_64_Payload(parser: Parser): Base_Types.Integer_64_Payload = {
      val r = parser.parseBase_TypesInteger_64_Payload()
      return r
    }
    val r = to(s, fBase_TypesInteger_64_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_8_Payload(o: Base_Types.Unsigned_8_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesUnsigned_8_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesUnsigned_8_Payload(s: String): Either[Base_Types.Unsigned_8_Payload, Json.ErrorMsg] = {
    def fBase_TypesUnsigned_8_Payload(parser: Parser): Base_Types.Unsigned_8_Payload = {
      val r = parser.parseBase_TypesUnsigned_8_Payload()
      return r
    }
    val r = to(s, fBase_TypesUnsigned_8_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_16_Payload(o: Base_Types.Unsigned_16_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesUnsigned_16_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesUnsigned_16_Payload(s: String): Either[Base_Types.Unsigned_16_Payload, Json.ErrorMsg] = {
    def fBase_TypesUnsigned_16_Payload(parser: Parser): Base_Types.Unsigned_16_Payload = {
      val r = parser.parseBase_TypesUnsigned_16_Payload()
      return r
    }
    val r = to(s, fBase_TypesUnsigned_16_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_32_Payload(o: Base_Types.Unsigned_32_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesUnsigned_32_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesUnsigned_32_Payload(s: String): Either[Base_Types.Unsigned_32_Payload, Json.ErrorMsg] = {
    def fBase_TypesUnsigned_32_Payload(parser: Parser): Base_Types.Unsigned_32_Payload = {
      val r = parser.parseBase_TypesUnsigned_32_Payload()
      return r
    }
    val r = to(s, fBase_TypesUnsigned_32_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_64_Payload(o: Base_Types.Unsigned_64_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesUnsigned_64_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesUnsigned_64_Payload(s: String): Either[Base_Types.Unsigned_64_Payload, Json.ErrorMsg] = {
    def fBase_TypesUnsigned_64_Payload(parser: Parser): Base_Types.Unsigned_64_Payload = {
      val r = parser.parseBase_TypesUnsigned_64_Payload()
      return r
    }
    val r = to(s, fBase_TypesUnsigned_64_Payload _)
    return r
  }

  def fromBase_TypesFloat_Payload(o: Base_Types.Float_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesFloat_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesFloat_Payload(s: String): Either[Base_Types.Float_Payload, Json.ErrorMsg] = {
    def fBase_TypesFloat_Payload(parser: Parser): Base_Types.Float_Payload = {
      val r = parser.parseBase_TypesFloat_Payload()
      return r
    }
    val r = to(s, fBase_TypesFloat_Payload _)
    return r
  }

  def fromBase_TypesFloat_32_Payload(o: Base_Types.Float_32_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesFloat_32_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesFloat_32_Payload(s: String): Either[Base_Types.Float_32_Payload, Json.ErrorMsg] = {
    def fBase_TypesFloat_32_Payload(parser: Parser): Base_Types.Float_32_Payload = {
      val r = parser.parseBase_TypesFloat_32_Payload()
      return r
    }
    val r = to(s, fBase_TypesFloat_32_Payload _)
    return r
  }

  def fromBase_TypesFloat_64_Payload(o: Base_Types.Float_64_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesFloat_64_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesFloat_64_Payload(s: String): Either[Base_Types.Float_64_Payload, Json.ErrorMsg] = {
    def fBase_TypesFloat_64_Payload(parser: Parser): Base_Types.Float_64_Payload = {
      val r = parser.parseBase_TypesFloat_64_Payload()
      return r
    }
    val r = to(s, fBase_TypesFloat_64_Payload _)
    return r
  }

  def fromBase_TypesCharacter_Payload(o: Base_Types.Character_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesCharacter_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesCharacter_Payload(s: String): Either[Base_Types.Character_Payload, Json.ErrorMsg] = {
    def fBase_TypesCharacter_Payload(parser: Parser): Base_Types.Character_Payload = {
      val r = parser.parseBase_TypesCharacter_Payload()
      return r
    }
    val r = to(s, fBase_TypesCharacter_Payload _)
    return r
  }

  def fromBase_TypesString_Payload(o: Base_Types.String_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesString_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesString_Payload(s: String): Either[Base_Types.String_Payload, Json.ErrorMsg] = {
    def fBase_TypesString_Payload(parser: Parser): Base_Types.String_Payload = {
      val r = parser.parseBase_TypesString_Payload()
      return r
    }
    val r = to(s, fBase_TypesString_Payload _)
    return r
  }

  def fromBase_TypesBits_Payload(o: Base_Types.Bits_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesBits_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesBits_Payload(s: String): Either[Base_Types.Bits_Payload, Json.ErrorMsg] = {
    def fBase_TypesBits_Payload(parser: Parser): Base_Types.Bits_Payload = {
      val r = parser.parseBase_TypesBits_Payload()
      return r
    }
    val r = to(s, fBase_TypesBits_Payload _)
    return r
  }

  def fromDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container(o: Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container(s: String): Either[Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container(parser: Parser): Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container = {
      val r = parser.parseDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container _)
    return r
  }

  def fromDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_P(o: Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_P(s: String): Either[Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container_P, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_P(parser: Parser): Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container_P = {
      val r = parser.parseDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_P()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_PS(o: Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_PS(s: String): Either[Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_PS(parser: Parser): Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container_PS = {
      val r = parser.parseDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container(o: Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container(s: String): Either[Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container(parser: Parser): Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container = {
      val r = parser.parseDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container _)
    return r
  }

  def fromDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_P(o: Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_P(s: String): Either[Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container_P, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_P(parser: Parser): Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container_P = {
      val r = parser.parseDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_P()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_PS(o: Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_PS(s: String): Either[Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_PS(parser: Parser): Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container_PS = {
      val r = parser.parseDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container(o: Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container(s: String): Either[Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container(parser: Parser): Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container = {
      val r = parser.parseDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container _)
    return r
  }

  def fromDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_P(o: Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_P(s: String): Either[Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_P, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_P(parser: Parser): Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_P = {
      val r = parser.parseDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_P()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PS(o: Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PS(s: String): Either[Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PS(parser: Parser): Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PS = {
      val r = parser.parseDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container(o: Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container(s: String): Either[Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container(parser: Parser): Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container = {
      val r = parser.parseDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container _)
    return r
  }

  def fromDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_P(o: Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_P(s: String): Either[Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_P, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_P(parser: Parser): Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_P = {
      val r = parser.parseDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_P()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PS(o: Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PS(s: String): Either[Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PS(parser: Parser): Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PS = {
      val r = parser.parseDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container(o: Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container(s: String): Either[Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container(parser: Parser): Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container = {
      val r = parser.parseDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container _)
    return r
  }

  def fromDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P(o: Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P(s: String): Either[Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P(parser: Parser): Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P = {
      val r = parser.parseDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS(o: Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS(s: String): Either[Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS(parser: Parser): Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS = {
      val r = parser.parseDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container(o: Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container(s: String): Either[Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container(parser: Parser): Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container = {
      val r = parser.parseDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container _)
    return r
  }

  def fromDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P(o: Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P(s: String): Either[Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P(parser: Parser): Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P = {
      val r = parser.parseDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS(o: Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS(s: String): Either[Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS(parser: Parser): Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS = {
      val r = parser.parseDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container(o: Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container(s: String): Either[Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container(parser: Parser): Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container = {
      val r = parser.parseDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container _)
    return r
  }

  def fromDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_P(o: Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_P(s: String): Either[Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_P, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_P(parser: Parser): Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_P = {
      val r = parser.parseDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_P()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PS(o: Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PS(s: String): Either[Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PS(parser: Parser): Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PS = {
      val r = parser.parseDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container(o: Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container(s: String): Either[Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container(parser: Parser): Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container = {
      val r = parser.parseDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container _)
    return r
  }

  def fromDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_P(o: Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_P(s: String): Either[Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_P, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_P(parser: Parser): Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_P = {
      val r = parser.parseDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_P()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PS(o: Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PS(s: String): Either[Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PS(parser: Parser): Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PS = {
      val r = parser.parseDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container(o: Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container(s: String): Either[Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container(parser: Parser): Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container = {
      val r = parser.parseDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container _)
    return r
  }

  def fromDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_P(o: Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_P(s: String): Either[Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_P, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_P(parser: Parser): Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_P = {
      val r = parser.parseDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_P()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PS(o: Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PS(s: String): Either[Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PS(parser: Parser): Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PS = {
      val r = parser.parseDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container(o: Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container(s: String): Either[Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container(parser: Parser): Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container = {
      val r = parser.parseDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container _)
    return r
  }

  def fromDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_P(o: Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_P(s: String): Either[Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_P, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_P(parser: Parser): Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_P = {
      val r = parser.parseDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_P()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PS(o: Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PS(s: String): Either[Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PS(parser: Parser): Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PS = {
      val r = parser.parseDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container(o: Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container(s: String): Either[Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container(parser: Parser): Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container = {
      val r = parser.parseDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container _)
    return r
  }

  def fromDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_P(o: Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_P(s: String): Either[Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_P, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_P(parser: Parser): Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_P = {
      val r = parser.parseDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_P()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PS(o: Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PS(s: String): Either[Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PS(parser: Parser): Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PS = {
      val r = parser.parseDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container(o: Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container(s: String): Either[Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container(parser: Parser): Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container = {
      val r = parser.parseDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container _)
    return r
  }

  def fromDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_P(o: Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_P(s: String): Either[Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_P, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_P(parser: Parser): Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_P = {
      val r = parser.parseDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_P()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PS(o: Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PS(s: String): Either[Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PS(parser: Parser): Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PS = {
      val r = parser.parseDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container(o: Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container(s: String): Either[Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container(parser: Parser): Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container = {
      val r = parser.parseDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container _)
    return r
  }

  def fromDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_P(o: Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_P(s: String): Either[Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_P, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_P(parser: Parser): Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_P = {
      val r = parser.parseDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_P()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PS(o: Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PS(s: String): Either[Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PS(parser: Parser): Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PS = {
      val r = parser.parseDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container(o: Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container(s: String): Either[Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container(parser: Parser): Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container = {
      val r = parser.parseDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container _)
    return r
  }

  def fromDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_P(o: Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_P(s: String): Either[Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_P, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_P(parser: Parser): Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_P = {
      val r = parser.parseDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_P()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PS(o: Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PS(s: String): Either[Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PS(parser: Parser): Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PS = {
      val r = parser.parseDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container(o: Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container(s: String): Either[Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container(parser: Parser): Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container = {
      val r = parser.parseDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container _)
    return r
  }

  def fromDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_P(o: Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_P(s: String): Either[Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_P, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_P(parser: Parser): Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_P = {
      val r = parser.parseDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_P()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PS(o: Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PS(s: String): Either[Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PS(parser: Parser): Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PS = {
      val r = parser.parseDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PS _)
    return r
  }

  def fromDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container(o: Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container(s: String): Either[Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container(parser: Parser): Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container = {
      val r = parser.parseDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container _)
    return r
  }

  def fromDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_P(o: Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_P(s: String): Either[Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_P, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_P(parser: Parser): Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_P = {
      val r = parser.parseDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_P()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_P _)
    return r
  }

  def fromDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PS(o: Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PS(s: String): Either[Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PS(parser: Parser): Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PS = {
      val r = parser.parseDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PS _)
    return r
  }

  def fromutilContainer(o: util.Container, isCompact: B): String = {
    val st = Printer.printutilContainer(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toutilContainer(s: String): Either[util.Container, Json.ErrorMsg] = {
    def futilContainer(parser: Parser): util.Container = {
      val r = parser.parseutilContainer()
      return r
    }
    val r = to(s, futilContainer _)
    return r
  }

  def fromutilEmptyContainer(o: util.EmptyContainer, isCompact: B): String = {
    val st = Printer.printutilEmptyContainer(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toutilEmptyContainer(s: String): Either[util.EmptyContainer, Json.ErrorMsg] = {
    def futilEmptyContainer(parser: Parser): util.EmptyContainer = {
      val r = parser.parseutilEmptyContainer()
      return r
    }
    val r = to(s, futilEmptyContainer _)
    return r
  }

  def from_artDataContent(o: art.DataContent, isCompact: B): String = {
    val st = Printer.print_artDataContent(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_artDataContent(s: String): Either[art.DataContent, Json.ErrorMsg] = {
    def f_artDataContent(parser: Parser): art.DataContent = {
      val r = parser.parse_artDataContent()
      return r
    }
    val r = to(s, f_artDataContent _)
    return r
  }

  def from_artEmpty(o: art.Empty, isCompact: B): String = {
    val st = Printer.print_artEmpty(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_artEmpty(s: String): Either[art.Empty, Json.ErrorMsg] = {
    def f_artEmpty(parser: Parser): art.Empty = {
      val r = parser.parse_artEmpty()
      return r
    }
    val r = to(s, f_artEmpty _)
    return r
  }

}