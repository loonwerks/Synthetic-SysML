// #Sireum
// @formatter:off

// This file is auto-generated from BatteryIndication.scala, InputStatus.scala, BatteryEvidence.scala, ChargerAvailability.scala, FlightActivity.scala, ChargeContext.scala, ChargeIntent.scala, QualifiedChargeIntent.scala, ChargeAuthorization.scala, ChargeDisposition.scala, BatteryAttention.scala, BatteryReadinessEvidence.scala, RecoveryPhase.scala, BatterySample.scala, ChargerSample.scala, FlightActivitySample.scala, ChargeIntentSample.scala, ChargeDecision.scala, Base_Types.scala, Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_Containers.scala, Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_Containers.scala, Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_Containers.scala, Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_Containers.scala, Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_Containers.scala, Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package drone_battery_charge_supervisor

import org.sireum._
import org.sireum.Json.Printer._

object JSON {

  object Printer {

    @pure def printDrone_Battery_Charge_SupervisorBatteryIndicationType(o: Drone_Battery_Charge_Supervisor.BatteryIndication.Type): ST = {
      val value: String = o match {
        case Drone_Battery_Charge_Supervisor.BatteryIndication.Low => "Low"
        case Drone_Battery_Charge_Supervisor.BatteryIndication.Adequate => "Adequate"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Battery_Charge_Supervisor.BatteryIndication")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Battery_Charge_SupervisorBatteryIndication_Payload(o: Drone_Battery_Charge_Supervisor.BatteryIndication_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Supervisor.BatteryIndication_Payload""""),
        ("value", printDrone_Battery_Charge_SupervisorBatteryIndicationType(o.value))
      ))
    }

    @pure def printDrone_Battery_Charge_SupervisorInputStatusType(o: Drone_Battery_Charge_Supervisor.InputStatus.Type): ST = {
      val value: String = o match {
        case Drone_Battery_Charge_Supervisor.InputStatus.Valid => "Valid"
        case Drone_Battery_Charge_Supervisor.InputStatus.Invalid => "Invalid"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Battery_Charge_Supervisor.InputStatus")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Battery_Charge_SupervisorInputStatus_Payload(o: Drone_Battery_Charge_Supervisor.InputStatus_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Supervisor.InputStatus_Payload""""),
        ("value", printDrone_Battery_Charge_SupervisorInputStatusType(o.value))
      ))
    }

    @pure def printDrone_Battery_Charge_SupervisorBatteryEvidenceType(o: Drone_Battery_Charge_Supervisor.BatteryEvidence.Type): ST = {
      val value: String = o match {
        case Drone_Battery_Charge_Supervisor.BatteryEvidence.InvalidBattery => "InvalidBattery"
        case Drone_Battery_Charge_Supervisor.BatteryEvidence.LowBatteryEvidence => "LowBatteryEvidence"
        case Drone_Battery_Charge_Supervisor.BatteryEvidence.AdequateBatteryEvidence => "AdequateBatteryEvidence"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Battery_Charge_Supervisor.BatteryEvidence")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Battery_Charge_SupervisorBatteryEvidence_Payload(o: Drone_Battery_Charge_Supervisor.BatteryEvidence_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Supervisor.BatteryEvidence_Payload""""),
        ("value", printDrone_Battery_Charge_SupervisorBatteryEvidenceType(o.value))
      ))
    }

    @pure def printDrone_Battery_Charge_SupervisorChargerAvailabilityType(o: Drone_Battery_Charge_Supervisor.ChargerAvailability.Type): ST = {
      val value: String = o match {
        case Drone_Battery_Charge_Supervisor.ChargerAvailability.Available => "Available"
        case Drone_Battery_Charge_Supervisor.ChargerAvailability.Unavailable => "Unavailable"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Battery_Charge_Supervisor.ChargerAvailability")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Battery_Charge_SupervisorChargerAvailability_Payload(o: Drone_Battery_Charge_Supervisor.ChargerAvailability_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Supervisor.ChargerAvailability_Payload""""),
        ("value", printDrone_Battery_Charge_SupervisorChargerAvailabilityType(o.value))
      ))
    }

    @pure def printDrone_Battery_Charge_SupervisorFlightActivityType(o: Drone_Battery_Charge_Supervisor.FlightActivity.Type): ST = {
      val value: String = o match {
        case Drone_Battery_Charge_Supervisor.FlightActivity.Inactive => "Inactive"
        case Drone_Battery_Charge_Supervisor.FlightActivity.Active => "Active"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Battery_Charge_Supervisor.FlightActivity")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Battery_Charge_SupervisorFlightActivity_Payload(o: Drone_Battery_Charge_Supervisor.FlightActivity_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Supervisor.FlightActivity_Payload""""),
        ("value", printDrone_Battery_Charge_SupervisorFlightActivityType(o.value))
      ))
    }

    @pure def printDrone_Battery_Charge_SupervisorChargeContextType(o: Drone_Battery_Charge_Supervisor.ChargeContext.Type): ST = {
      val value: String = o match {
        case Drone_Battery_Charge_Supervisor.ChargeContext.InvalidChargeContext => "InvalidChargeContext"
        case Drone_Battery_Charge_Supervisor.ChargeContext.FlightActiveContext => "FlightActiveContext"
        case Drone_Battery_Charge_Supervisor.ChargeContext.AvailableInactiveContext => "AvailableInactiveContext"
        case Drone_Battery_Charge_Supervisor.ChargeContext.UnavailableInactiveContext => "UnavailableInactiveContext"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Battery_Charge_Supervisor.ChargeContext")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Battery_Charge_SupervisorChargeContext_Payload(o: Drone_Battery_Charge_Supervisor.ChargeContext_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Supervisor.ChargeContext_Payload""""),
        ("value", printDrone_Battery_Charge_SupervisorChargeContextType(o.value))
      ))
    }

    @pure def printDrone_Battery_Charge_SupervisorChargeIntentType(o: Drone_Battery_Charge_Supervisor.ChargeIntent.Type): ST = {
      val value: String = o match {
        case Drone_Battery_Charge_Supervisor.ChargeIntent.NoIntent => "NoIntent"
        case Drone_Battery_Charge_Supervisor.ChargeIntent.BeginCharge => "BeginCharge"
        case Drone_Battery_Charge_Supervisor.ChargeIntent.EndCharge => "EndCharge"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Battery_Charge_Supervisor.ChargeIntent")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Battery_Charge_SupervisorChargeIntent_Payload(o: Drone_Battery_Charge_Supervisor.ChargeIntent_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Supervisor.ChargeIntent_Payload""""),
        ("value", printDrone_Battery_Charge_SupervisorChargeIntentType(o.value))
      ))
    }

    @pure def printDrone_Battery_Charge_SupervisorQualifiedChargeIntentType(o: Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.Type): ST = {
      val value: String = o match {
        case Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.InvalidChargeIntent => "InvalidChargeIntent"
        case Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.NoIntent => "NoIntent"
        case Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.BeginCharge => "BeginCharge"
        case Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.EndCharge => "EndCharge"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Battery_Charge_Supervisor.QualifiedChargeIntent")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Battery_Charge_SupervisorQualifiedChargeIntent_Payload(o: Drone_Battery_Charge_Supervisor.QualifiedChargeIntent_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Supervisor.QualifiedChargeIntent_Payload""""),
        ("value", printDrone_Battery_Charge_SupervisorQualifiedChargeIntentType(o.value))
      ))
    }

    @pure def printDrone_Battery_Charge_SupervisorChargeAuthorizationType(o: Drone_Battery_Charge_Supervisor.ChargeAuthorization.Type): ST = {
      val value: String = o match {
        case Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge => "InhibitCharge"
        case Drone_Battery_Charge_Supervisor.ChargeAuthorization.PermitCharge => "PermitCharge"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Battery_Charge_Supervisor.ChargeAuthorization")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Battery_Charge_SupervisorChargeAuthorization_Payload(o: Drone_Battery_Charge_Supervisor.ChargeAuthorization_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Supervisor.ChargeAuthorization_Payload""""),
        ("value", printDrone_Battery_Charge_SupervisorChargeAuthorizationType(o.value))
      ))
    }

    @pure def printDrone_Battery_Charge_SupervisorChargeDispositionType(o: Drone_Battery_Charge_Supervisor.ChargeDisposition.Type): ST = {
      val value: String = o match {
        case Drone_Battery_Charge_Supervisor.ChargeDisposition.InputFault => "InputFault"
        case Drone_Battery_Charge_Supervisor.ChargeDisposition.RecoveryPending => "RecoveryPending"
        case Drone_Battery_Charge_Supervisor.ChargeDisposition.BeginAccepted => "BeginAccepted"
        case Drone_Battery_Charge_Supervisor.ChargeDisposition.BeginDenied => "BeginDenied"
        case Drone_Battery_Charge_Supervisor.ChargeDisposition.Continued => "Continued"
        case Drone_Battery_Charge_Supervisor.ChargeDisposition.Inactive => "Inactive"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Battery_Charge_Supervisor.ChargeDisposition")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Battery_Charge_SupervisorChargeDisposition_Payload(o: Drone_Battery_Charge_Supervisor.ChargeDisposition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Supervisor.ChargeDisposition_Payload""""),
        ("value", printDrone_Battery_Charge_SupervisorChargeDispositionType(o.value))
      ))
    }

    @pure def printDrone_Battery_Charge_SupervisorBatteryAttentionType(o: Drone_Battery_Charge_Supervisor.BatteryAttention.Type): ST = {
      val value: String = o match {
        case Drone_Battery_Charge_Supervisor.BatteryAttention.None => "None"
        case Drone_Battery_Charge_Supervisor.BatteryAttention.LowBattery => "LowBattery"
        case Drone_Battery_Charge_Supervisor.BatteryAttention.InputFault => "InputFault"
        case Drone_Battery_Charge_Supervisor.BatteryAttention.RecoveryPending => "RecoveryPending"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Battery_Charge_Supervisor.BatteryAttention")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Battery_Charge_SupervisorBatteryAttention_Payload(o: Drone_Battery_Charge_Supervisor.BatteryAttention_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Supervisor.BatteryAttention_Payload""""),
        ("value", printDrone_Battery_Charge_SupervisorBatteryAttentionType(o.value))
      ))
    }

    @pure def printDrone_Battery_Charge_SupervisorBatteryReadinessEvidenceType(o: Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence.Type): ST = {
      val value: String = o match {
        case Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence.BatteryReady => "BatteryReady"
        case Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence.BatteryNotReady => "BatteryNotReady"
        case Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence.EvidenceUnavailable => "EvidenceUnavailable"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Battery_Charge_SupervisorBatteryReadinessEvidence_Payload(o: Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence_Payload""""),
        ("value", printDrone_Battery_Charge_SupervisorBatteryReadinessEvidenceType(o.value))
      ))
    }

    @pure def printDrone_Battery_Charge_SupervisorRecoveryPhaseType(o: Drone_Battery_Charge_Supervisor.RecoveryPhase.Type): ST = {
      val value: String = o match {
        case Drone_Battery_Charge_Supervisor.RecoveryPhase.Normal => "Normal"
        case Drone_Battery_Charge_Supervisor.RecoveryPhase.AwaitNeutral => "AwaitNeutral"
        case Drone_Battery_Charge_Supervisor.RecoveryPhase.AwaitFreshIntent => "AwaitFreshIntent"
      }
      return printObject(ISZ(
        ("type", printString("Drone_Battery_Charge_Supervisor.RecoveryPhase")),
        ("value", printString(value))
      ))
    }

    @pure def printDrone_Battery_Charge_SupervisorRecoveryPhase_Payload(o: Drone_Battery_Charge_Supervisor.RecoveryPhase_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Supervisor.RecoveryPhase_Payload""""),
        ("value", printDrone_Battery_Charge_SupervisorRecoveryPhaseType(o.value))
      ))
    }

    @pure def printDrone_Battery_Charge_SupervisorBatterySample(o: Drone_Battery_Charge_Supervisor.BatterySample): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Supervisor.BatterySample""""),
        ("indication", printDrone_Battery_Charge_SupervisorBatteryIndicationType(o.indication)),
        ("status", printDrone_Battery_Charge_SupervisorInputStatusType(o.status))
      ))
    }

    @pure def printDrone_Battery_Charge_SupervisorBatterySample_Payload(o: Drone_Battery_Charge_Supervisor.BatterySample_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Supervisor.BatterySample_Payload""""),
        ("value", printDrone_Battery_Charge_SupervisorBatterySample(o.value))
      ))
    }

    @pure def printDrone_Battery_Charge_SupervisorChargerSample(o: Drone_Battery_Charge_Supervisor.ChargerSample): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Supervisor.ChargerSample""""),
        ("availability", printDrone_Battery_Charge_SupervisorChargerAvailabilityType(o.availability)),
        ("status", printDrone_Battery_Charge_SupervisorInputStatusType(o.status))
      ))
    }

    @pure def printDrone_Battery_Charge_SupervisorChargerSample_Payload(o: Drone_Battery_Charge_Supervisor.ChargerSample_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Supervisor.ChargerSample_Payload""""),
        ("value", printDrone_Battery_Charge_SupervisorChargerSample(o.value))
      ))
    }

    @pure def printDrone_Battery_Charge_SupervisorFlightActivitySample(o: Drone_Battery_Charge_Supervisor.FlightActivitySample): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Supervisor.FlightActivitySample""""),
        ("activity", printDrone_Battery_Charge_SupervisorFlightActivityType(o.activity)),
        ("status", printDrone_Battery_Charge_SupervisorInputStatusType(o.status))
      ))
    }

    @pure def printDrone_Battery_Charge_SupervisorFlightActivitySample_Payload(o: Drone_Battery_Charge_Supervisor.FlightActivitySample_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Supervisor.FlightActivitySample_Payload""""),
        ("value", printDrone_Battery_Charge_SupervisorFlightActivitySample(o.value))
      ))
    }

    @pure def printDrone_Battery_Charge_SupervisorChargeIntentSample(o: Drone_Battery_Charge_Supervisor.ChargeIntentSample): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Supervisor.ChargeIntentSample""""),
        ("intent", printDrone_Battery_Charge_SupervisorChargeIntentType(o.intent)),
        ("status", printDrone_Battery_Charge_SupervisorInputStatusType(o.status))
      ))
    }

    @pure def printDrone_Battery_Charge_SupervisorChargeIntentSample_Payload(o: Drone_Battery_Charge_Supervisor.ChargeIntentSample_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Supervisor.ChargeIntentSample_Payload""""),
        ("value", printDrone_Battery_Charge_SupervisorChargeIntentSample(o.value))
      ))
    }

    @pure def printDrone_Battery_Charge_SupervisorChargeDecision(o: Drone_Battery_Charge_Supervisor.ChargeDecision): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Supervisor.ChargeDecision""""),
        ("authorization", printDrone_Battery_Charge_SupervisorChargeAuthorizationType(o.authorization)),
        ("disposition", printDrone_Battery_Charge_SupervisorChargeDispositionType(o.disposition))
      ))
    }

    @pure def printDrone_Battery_Charge_SupervisorChargeDecision_Payload(o: Drone_Battery_Charge_Supervisor.ChargeDecision_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Supervisor.ChargeDecision_Payload""""),
        ("value", printDrone_Battery_Charge_SupervisorChargeDecision(o.value))
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

    @pure def printDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container(o: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container): ST = {
      o match {
        case o: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P => return printDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS => return printDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS(o)
      }
    }

    @pure def printDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P(o: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P""""),
        ("api_battery_sample", printDrone_Battery_Charge_SupervisorBatterySample(o.api_battery_sample))
      ))
    }

    @pure def printDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS(o: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS""""),
        ("api_battery_sample", printDrone_Battery_Charge_SupervisorBatterySample(o.api_battery_sample))
      ))
    }

    @pure def printDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container(o: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container): ST = {
      o match {
        case o: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P => return printDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS => return printDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS(o)
      }
    }

    @pure def printDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P(o: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P""""),
        ("api_evidence_to_attention", printDrone_Battery_Charge_SupervisorBatteryEvidenceType(o.api_evidence_to_attention)),
        ("api_evidence_to_owner", printDrone_Battery_Charge_SupervisorBatteryEvidenceType(o.api_evidence_to_owner)),
        ("api_evidence_to_readiness", printDrone_Battery_Charge_SupervisorBatteryEvidenceType(o.api_evidence_to_readiness))
      ))
    }

    @pure def printDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS(o: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS""""),
        ("api_evidence_to_attention", printDrone_Battery_Charge_SupervisorBatteryEvidenceType(o.api_evidence_to_attention)),
        ("api_evidence_to_owner", printDrone_Battery_Charge_SupervisorBatteryEvidenceType(o.api_evidence_to_owner)),
        ("api_evidence_to_readiness", printDrone_Battery_Charge_SupervisorBatteryEvidenceType(o.api_evidence_to_readiness))
      ))
    }

    @pure def printDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container(o: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container): ST = {
      o match {
        case o: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P => return printDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS => return printDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS(o)
      }
    }

    @pure def printDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P(o: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P""""),
        ("api_charger_sample", printDrone_Battery_Charge_SupervisorChargerSample(o.api_charger_sample)),
        ("api_flight_sample", printDrone_Battery_Charge_SupervisorFlightActivitySample(o.api_flight_sample))
      ))
    }

    @pure def printDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS(o: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS""""),
        ("api_charger_sample", printDrone_Battery_Charge_SupervisorChargerSample(o.api_charger_sample)),
        ("api_flight_sample", printDrone_Battery_Charge_SupervisorFlightActivitySample(o.api_flight_sample))
      ))
    }

    @pure def printDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container(o: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container): ST = {
      o match {
        case o: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P => return printDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS => return printDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS(o)
      }
    }

    @pure def printDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P(o: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P""""),
        ("api_charge_context", printDrone_Battery_Charge_SupervisorChargeContextType(o.api_charge_context))
      ))
    }

    @pure def printDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS(o: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS""""),
        ("api_charge_context", printDrone_Battery_Charge_SupervisorChargeContextType(o.api_charge_context))
      ))
    }

    @pure def printDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container(o: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container): ST = {
      o match {
        case o: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P => return printDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS => return printDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS(o)
      }
    }

    @pure def printDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P(o: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P""""),
        ("api_intent_sample", printDrone_Battery_Charge_SupervisorChargeIntentSample(o.api_intent_sample))
      ))
    }

    @pure def printDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS(o: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS""""),
        ("api_intent_sample", printDrone_Battery_Charge_SupervisorChargeIntentSample(o.api_intent_sample))
      ))
    }

    @pure def printDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container(o: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container): ST = {
      o match {
        case o: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P => return printDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS => return printDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS(o)
      }
    }

    @pure def printDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P(o: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P""""),
        ("api_qualified_intent", printDrone_Battery_Charge_SupervisorQualifiedChargeIntentType(o.api_qualified_intent))
      ))
    }

    @pure def printDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS(o: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS""""),
        ("api_qualified_intent", printDrone_Battery_Charge_SupervisorQualifiedChargeIntentType(o.api_qualified_intent))
      ))
    }

    @pure def printDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container(o: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container): ST = {
      o match {
        case o: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P => return printDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS => return printDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS(o)
      }
    }

    @pure def printDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P(o: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P""""),
        ("api_battery_evidence", printDrone_Battery_Charge_SupervisorBatteryEvidenceType(o.api_battery_evidence)),
        ("api_charge_context", printDrone_Battery_Charge_SupervisorChargeContextType(o.api_charge_context)),
        ("api_qualified_intent", printDrone_Battery_Charge_SupervisorQualifiedChargeIntentType(o.api_qualified_intent))
      ))
    }

    @pure def printDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS(o: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS""""),
        ("In_authorizationState", printDrone_Battery_Charge_SupervisorChargeAuthorizationType(o.In_authorizationState)),
        ("In_recoveryPhase", printDrone_Battery_Charge_SupervisorRecoveryPhaseType(o.In_recoveryPhase)),
        ("api_battery_evidence", printDrone_Battery_Charge_SupervisorBatteryEvidenceType(o.api_battery_evidence)),
        ("api_charge_context", printDrone_Battery_Charge_SupervisorChargeContextType(o.api_charge_context)),
        ("api_qualified_intent", printDrone_Battery_Charge_SupervisorQualifiedChargeIntentType(o.api_qualified_intent))
      ))
    }

    @pure def printDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container(o: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container): ST = {
      o match {
        case o: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P => return printDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS => return printDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS(o)
      }
    }

    @pure def printDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P(o: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P""""),
        ("api_authorization", printDrone_Battery_Charge_SupervisorChargeAuthorizationType(o.api_authorization)),
        ("api_decision_to_attention", printDrone_Battery_Charge_SupervisorChargeDecision(o.api_decision_to_attention)),
        ("api_decision_to_readiness", printDrone_Battery_Charge_SupervisorChargeDecision(o.api_decision_to_readiness))
      ))
    }

    @pure def printDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS(o: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS""""),
        ("authorizationState", printDrone_Battery_Charge_SupervisorChargeAuthorizationType(o.authorizationState)),
        ("recoveryPhase", printDrone_Battery_Charge_SupervisorRecoveryPhaseType(o.recoveryPhase)),
        ("api_authorization", printDrone_Battery_Charge_SupervisorChargeAuthorizationType(o.api_authorization)),
        ("api_decision_to_attention", printDrone_Battery_Charge_SupervisorChargeDecision(o.api_decision_to_attention)),
        ("api_decision_to_readiness", printDrone_Battery_Charge_SupervisorChargeDecision(o.api_decision_to_readiness))
      ))
    }

    @pure def printDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container(o: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container): ST = {
      o match {
        case o: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P => return printDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS => return printDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS(o)
      }
    }

    @pure def printDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P(o: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P""""),
        ("api_battery_evidence", printDrone_Battery_Charge_SupervisorBatteryEvidenceType(o.api_battery_evidence)),
        ("api_charge_decision", printDrone_Battery_Charge_SupervisorChargeDecision(o.api_charge_decision))
      ))
    }

    @pure def printDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS(o: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS""""),
        ("api_battery_evidence", printDrone_Battery_Charge_SupervisorBatteryEvidenceType(o.api_battery_evidence)),
        ("api_charge_decision", printDrone_Battery_Charge_SupervisorChargeDecision(o.api_charge_decision))
      ))
    }

    @pure def printDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container(o: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container): ST = {
      o match {
        case o: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P => return printDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS => return printDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS(o)
      }
    }

    @pure def printDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P(o: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P""""),
        ("api_battery_attention", printDrone_Battery_Charge_SupervisorBatteryAttentionType(o.api_battery_attention))
      ))
    }

    @pure def printDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS(o: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS""""),
        ("api_battery_attention", printDrone_Battery_Charge_SupervisorBatteryAttentionType(o.api_battery_attention))
      ))
    }

    @pure def printDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container(o: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container): ST = {
      o match {
        case o: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P => return printDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS => return printDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS(o)
      }
    }

    @pure def printDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P(o: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P""""),
        ("api_battery_evidence", printDrone_Battery_Charge_SupervisorBatteryEvidenceType(o.api_battery_evidence)),
        ("api_charge_decision", printDrone_Battery_Charge_SupervisorChargeDecision(o.api_charge_decision))
      ))
    }

    @pure def printDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS(o: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS""""),
        ("api_battery_evidence", printDrone_Battery_Charge_SupervisorBatteryEvidenceType(o.api_battery_evidence)),
        ("api_charge_decision", printDrone_Battery_Charge_SupervisorChargeDecision(o.api_charge_decision))
      ))
    }

    @pure def printDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container(o: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container): ST = {
      o match {
        case o: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P => return printDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS => return printDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS(o)
      }
    }

    @pure def printDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P(o: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P""""),
        ("api_readiness_evidence", printDrone_Battery_Charge_SupervisorBatteryReadinessEvidenceType(o.api_readiness_evidence))
      ))
    }

    @pure def printDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS(o: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS""""),
        ("api_readiness_evidence", printDrone_Battery_Charge_SupervisorBatteryReadinessEvidenceType(o.api_readiness_evidence))
      ))
    }

    @pure def printruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): ST = {
      val value: String = o match {
        case runtimemonitor.ObservationKind.Drone_Battery_Charge_Supervisor_System_Instance_charge_supervision_process_battery_evidence_qualification_postInit => "Drone_Battery_Charge_Supervisor_System_Instance_charge_supervision_process_battery_evidence_qualification_postInit"
        case runtimemonitor.ObservationKind.Drone_Battery_Charge_Supervisor_System_Instance_charge_supervision_process_battery_evidence_qualification_preCompute => "Drone_Battery_Charge_Supervisor_System_Instance_charge_supervision_process_battery_evidence_qualification_preCompute"
        case runtimemonitor.ObservationKind.Drone_Battery_Charge_Supervisor_System_Instance_charge_supervision_process_battery_evidence_qualification_postCompute => "Drone_Battery_Charge_Supervisor_System_Instance_charge_supervision_process_battery_evidence_qualification_postCompute"
        case runtimemonitor.ObservationKind.Drone_Battery_Charge_Supervisor_System_Instance_charge_supervision_process_charge_context_qualification_postInit => "Drone_Battery_Charge_Supervisor_System_Instance_charge_supervision_process_charge_context_qualification_postInit"
        case runtimemonitor.ObservationKind.Drone_Battery_Charge_Supervisor_System_Instance_charge_supervision_process_charge_context_qualification_preCompute => "Drone_Battery_Charge_Supervisor_System_Instance_charge_supervision_process_charge_context_qualification_preCompute"
        case runtimemonitor.ObservationKind.Drone_Battery_Charge_Supervisor_System_Instance_charge_supervision_process_charge_context_qualification_postCompute => "Drone_Battery_Charge_Supervisor_System_Instance_charge_supervision_process_charge_context_qualification_postCompute"
        case runtimemonitor.ObservationKind.Drone_Battery_Charge_Supervisor_System_Instance_charge_supervision_process_charge_intent_qualification_postInit => "Drone_Battery_Charge_Supervisor_System_Instance_charge_supervision_process_charge_intent_qualification_postInit"
        case runtimemonitor.ObservationKind.Drone_Battery_Charge_Supervisor_System_Instance_charge_supervision_process_charge_intent_qualification_preCompute => "Drone_Battery_Charge_Supervisor_System_Instance_charge_supervision_process_charge_intent_qualification_preCompute"
        case runtimemonitor.ObservationKind.Drone_Battery_Charge_Supervisor_System_Instance_charge_supervision_process_charge_intent_qualification_postCompute => "Drone_Battery_Charge_Supervisor_System_Instance_charge_supervision_process_charge_intent_qualification_postCompute"
        case runtimemonitor.ObservationKind.Drone_Battery_Charge_Supervisor_System_Instance_charge_supervision_process_charge_qualification_owner_postInit => "Drone_Battery_Charge_Supervisor_System_Instance_charge_supervision_process_charge_qualification_owner_postInit"
        case runtimemonitor.ObservationKind.Drone_Battery_Charge_Supervisor_System_Instance_charge_supervision_process_charge_qualification_owner_preCompute => "Drone_Battery_Charge_Supervisor_System_Instance_charge_supervision_process_charge_qualification_owner_preCompute"
        case runtimemonitor.ObservationKind.Drone_Battery_Charge_Supervisor_System_Instance_charge_supervision_process_charge_qualification_owner_postCompute => "Drone_Battery_Charge_Supervisor_System_Instance_charge_supervision_process_charge_qualification_owner_postCompute"
        case runtimemonitor.ObservationKind.Drone_Battery_Charge_Supervisor_System_Instance_charge_supervision_process_pilot_attention_derivation_postInit => "Drone_Battery_Charge_Supervisor_System_Instance_charge_supervision_process_pilot_attention_derivation_postInit"
        case runtimemonitor.ObservationKind.Drone_Battery_Charge_Supervisor_System_Instance_charge_supervision_process_pilot_attention_derivation_preCompute => "Drone_Battery_Charge_Supervisor_System_Instance_charge_supervision_process_pilot_attention_derivation_preCompute"
        case runtimemonitor.ObservationKind.Drone_Battery_Charge_Supervisor_System_Instance_charge_supervision_process_pilot_attention_derivation_postCompute => "Drone_Battery_Charge_Supervisor_System_Instance_charge_supervision_process_pilot_attention_derivation_postCompute"
        case runtimemonitor.ObservationKind.Drone_Battery_Charge_Supervisor_System_Instance_charge_supervision_process_readiness_evidence_derivation_postInit => "Drone_Battery_Charge_Supervisor_System_Instance_charge_supervision_process_readiness_evidence_derivation_postInit"
        case runtimemonitor.ObservationKind.Drone_Battery_Charge_Supervisor_System_Instance_charge_supervision_process_readiness_evidence_derivation_preCompute => "Drone_Battery_Charge_Supervisor_System_Instance_charge_supervision_process_readiness_evidence_derivation_preCompute"
        case runtimemonitor.ObservationKind.Drone_Battery_Charge_Supervisor_System_Instance_charge_supervision_process_readiness_evidence_derivation_postCompute => "Drone_Battery_Charge_Supervisor_System_Instance_charge_supervision_process_readiness_evidence_derivation_postCompute"
      }
      return printObject(ISZ(
        ("type", printString("runtimemonitor.ObservationKind")),
        ("value", printString(value))
      ))
    }

    @pure def printutilContainer(o: util.Container): ST = {
      o match {
        case o: util.EmptyContainer => return printutilEmptyContainer(o)
        case o: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P => return printDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P => return printDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS => return printDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS => return printDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P => return printDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS => return printDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS(o)
        case o: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P => return printDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS => return printDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS(o)
        case o: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P => return printDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS => return printDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P => return printDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS => return printDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS(o)
        case o: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P => return printDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS => return printDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P => return printDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS => return printDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS(o)
        case o: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P => return printDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS => return printDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P => return printDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS => return printDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS(o)
        case o: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P => return printDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS => return printDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P => return printDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS => return printDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS(o)
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
        case o: Drone_Battery_Charge_Supervisor.InputStatus_Payload => return printDrone_Battery_Charge_SupervisorInputStatus_Payload(o)
        case o: Drone_Battery_Charge_Supervisor.ChargeIntent_Payload => return printDrone_Battery_Charge_SupervisorChargeIntent_Payload(o)
        case o: Drone_Battery_Charge_Supervisor.RecoveryPhase_Payload => return printDrone_Battery_Charge_SupervisorRecoveryPhase_Payload(o)
        case o: Drone_Battery_Charge_Supervisor.ChargeContext_Payload => return printDrone_Battery_Charge_SupervisorChargeContext_Payload(o)
        case o: Drone_Battery_Charge_Supervisor.BatterySample_Payload => return printDrone_Battery_Charge_SupervisorBatterySample_Payload(o)
        case o: Drone_Battery_Charge_Supervisor.ChargerSample_Payload => return printDrone_Battery_Charge_SupervisorChargerSample_Payload(o)
        case o: Drone_Battery_Charge_Supervisor.FlightActivity_Payload => return printDrone_Battery_Charge_SupervisorFlightActivity_Payload(o)
        case o: Drone_Battery_Charge_Supervisor.ChargeDecision_Payload => return printDrone_Battery_Charge_SupervisorChargeDecision_Payload(o)
        case o: Drone_Battery_Charge_Supervisor.BatteryEvidence_Payload => return printDrone_Battery_Charge_SupervisorBatteryEvidence_Payload(o)
        case o: Drone_Battery_Charge_Supervisor.BatteryAttention_Payload => return printDrone_Battery_Charge_SupervisorBatteryAttention_Payload(o)
        case o: Drone_Battery_Charge_Supervisor.BatteryIndication_Payload => return printDrone_Battery_Charge_SupervisorBatteryIndication_Payload(o)
        case o: Drone_Battery_Charge_Supervisor.ChargeDisposition_Payload => return printDrone_Battery_Charge_SupervisorChargeDisposition_Payload(o)
        case o: Drone_Battery_Charge_Supervisor.ChargeIntentSample_Payload => return printDrone_Battery_Charge_SupervisorChargeIntentSample_Payload(o)
        case o: Drone_Battery_Charge_Supervisor.ChargerAvailability_Payload => return printDrone_Battery_Charge_SupervisorChargerAvailability_Payload(o)
        case o: Drone_Battery_Charge_Supervisor.ChargeAuthorization_Payload => return printDrone_Battery_Charge_SupervisorChargeAuthorization_Payload(o)
        case o: Drone_Battery_Charge_Supervisor.FlightActivitySample_Payload => return printDrone_Battery_Charge_SupervisorFlightActivitySample_Payload(o)
        case o: Drone_Battery_Charge_Supervisor.QualifiedChargeIntent_Payload => return printDrone_Battery_Charge_SupervisorQualifiedChargeIntent_Payload(o)
        case o: Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence_Payload => return printDrone_Battery_Charge_SupervisorBatteryReadinessEvidence_Payload(o)
        case o: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P => return printDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P => return printDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS => return printDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS => return printDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P => return printDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS => return printDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS(o)
        case o: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P => return printDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS => return printDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS(o)
        case o: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P => return printDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS => return printDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P => return printDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS => return printDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS(o)
        case o: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P => return printDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS => return printDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P => return printDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS => return printDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS(o)
        case o: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P => return printDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS => return printDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P => return printDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS => return printDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS(o)
        case o: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P => return printDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS => return printDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P => return printDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS => return printDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS(o)
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

    def parseDrone_Battery_Charge_SupervisorBatteryIndicationType(): Drone_Battery_Charge_Supervisor.BatteryIndication.Type = {
      val r = parseDrone_Battery_Charge_SupervisorBatteryIndicationT(F)
      return r
    }

    def parseDrone_Battery_Charge_SupervisorBatteryIndicationT(typeParsed: B): Drone_Battery_Charge_Supervisor.BatteryIndication.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Supervisor.BatteryIndication")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Battery_Charge_Supervisor.BatteryIndication.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Battery_Charge_Supervisor.BatteryIndication.")
          return Drone_Battery_Charge_Supervisor.BatteryIndication.byOrdinal(0).get
      }
    }

    def parseDrone_Battery_Charge_SupervisorBatteryIndication_Payload(): Drone_Battery_Charge_Supervisor.BatteryIndication_Payload = {
      val r = parseDrone_Battery_Charge_SupervisorBatteryIndication_PayloadT(F)
      return r
    }

    def parseDrone_Battery_Charge_SupervisorBatteryIndication_PayloadT(typeParsed: B): Drone_Battery_Charge_Supervisor.BatteryIndication_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Supervisor.BatteryIndication_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Battery_Charge_SupervisorBatteryIndicationType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Supervisor.BatteryIndication_Payload(value)
    }

    def parseDrone_Battery_Charge_SupervisorInputStatusType(): Drone_Battery_Charge_Supervisor.InputStatus.Type = {
      val r = parseDrone_Battery_Charge_SupervisorInputStatusT(F)
      return r
    }

    def parseDrone_Battery_Charge_SupervisorInputStatusT(typeParsed: B): Drone_Battery_Charge_Supervisor.InputStatus.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Supervisor.InputStatus")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Battery_Charge_Supervisor.InputStatus.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Battery_Charge_Supervisor.InputStatus.")
          return Drone_Battery_Charge_Supervisor.InputStatus.byOrdinal(0).get
      }
    }

    def parseDrone_Battery_Charge_SupervisorInputStatus_Payload(): Drone_Battery_Charge_Supervisor.InputStatus_Payload = {
      val r = parseDrone_Battery_Charge_SupervisorInputStatus_PayloadT(F)
      return r
    }

    def parseDrone_Battery_Charge_SupervisorInputStatus_PayloadT(typeParsed: B): Drone_Battery_Charge_Supervisor.InputStatus_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Supervisor.InputStatus_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Battery_Charge_SupervisorInputStatusType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Supervisor.InputStatus_Payload(value)
    }

    def parseDrone_Battery_Charge_SupervisorBatteryEvidenceType(): Drone_Battery_Charge_Supervisor.BatteryEvidence.Type = {
      val r = parseDrone_Battery_Charge_SupervisorBatteryEvidenceT(F)
      return r
    }

    def parseDrone_Battery_Charge_SupervisorBatteryEvidenceT(typeParsed: B): Drone_Battery_Charge_Supervisor.BatteryEvidence.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Supervisor.BatteryEvidence")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Battery_Charge_Supervisor.BatteryEvidence.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Battery_Charge_Supervisor.BatteryEvidence.")
          return Drone_Battery_Charge_Supervisor.BatteryEvidence.byOrdinal(0).get
      }
    }

    def parseDrone_Battery_Charge_SupervisorBatteryEvidence_Payload(): Drone_Battery_Charge_Supervisor.BatteryEvidence_Payload = {
      val r = parseDrone_Battery_Charge_SupervisorBatteryEvidence_PayloadT(F)
      return r
    }

    def parseDrone_Battery_Charge_SupervisorBatteryEvidence_PayloadT(typeParsed: B): Drone_Battery_Charge_Supervisor.BatteryEvidence_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Supervisor.BatteryEvidence_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Battery_Charge_SupervisorBatteryEvidenceType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Supervisor.BatteryEvidence_Payload(value)
    }

    def parseDrone_Battery_Charge_SupervisorChargerAvailabilityType(): Drone_Battery_Charge_Supervisor.ChargerAvailability.Type = {
      val r = parseDrone_Battery_Charge_SupervisorChargerAvailabilityT(F)
      return r
    }

    def parseDrone_Battery_Charge_SupervisorChargerAvailabilityT(typeParsed: B): Drone_Battery_Charge_Supervisor.ChargerAvailability.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Supervisor.ChargerAvailability")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Battery_Charge_Supervisor.ChargerAvailability.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Battery_Charge_Supervisor.ChargerAvailability.")
          return Drone_Battery_Charge_Supervisor.ChargerAvailability.byOrdinal(0).get
      }
    }

    def parseDrone_Battery_Charge_SupervisorChargerAvailability_Payload(): Drone_Battery_Charge_Supervisor.ChargerAvailability_Payload = {
      val r = parseDrone_Battery_Charge_SupervisorChargerAvailability_PayloadT(F)
      return r
    }

    def parseDrone_Battery_Charge_SupervisorChargerAvailability_PayloadT(typeParsed: B): Drone_Battery_Charge_Supervisor.ChargerAvailability_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Supervisor.ChargerAvailability_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Battery_Charge_SupervisorChargerAvailabilityType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Supervisor.ChargerAvailability_Payload(value)
    }

    def parseDrone_Battery_Charge_SupervisorFlightActivityType(): Drone_Battery_Charge_Supervisor.FlightActivity.Type = {
      val r = parseDrone_Battery_Charge_SupervisorFlightActivityT(F)
      return r
    }

    def parseDrone_Battery_Charge_SupervisorFlightActivityT(typeParsed: B): Drone_Battery_Charge_Supervisor.FlightActivity.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Supervisor.FlightActivity")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Battery_Charge_Supervisor.FlightActivity.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Battery_Charge_Supervisor.FlightActivity.")
          return Drone_Battery_Charge_Supervisor.FlightActivity.byOrdinal(0).get
      }
    }

    def parseDrone_Battery_Charge_SupervisorFlightActivity_Payload(): Drone_Battery_Charge_Supervisor.FlightActivity_Payload = {
      val r = parseDrone_Battery_Charge_SupervisorFlightActivity_PayloadT(F)
      return r
    }

    def parseDrone_Battery_Charge_SupervisorFlightActivity_PayloadT(typeParsed: B): Drone_Battery_Charge_Supervisor.FlightActivity_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Supervisor.FlightActivity_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Battery_Charge_SupervisorFlightActivityType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Supervisor.FlightActivity_Payload(value)
    }

    def parseDrone_Battery_Charge_SupervisorChargeContextType(): Drone_Battery_Charge_Supervisor.ChargeContext.Type = {
      val r = parseDrone_Battery_Charge_SupervisorChargeContextT(F)
      return r
    }

    def parseDrone_Battery_Charge_SupervisorChargeContextT(typeParsed: B): Drone_Battery_Charge_Supervisor.ChargeContext.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Supervisor.ChargeContext")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Battery_Charge_Supervisor.ChargeContext.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Battery_Charge_Supervisor.ChargeContext.")
          return Drone_Battery_Charge_Supervisor.ChargeContext.byOrdinal(0).get
      }
    }

    def parseDrone_Battery_Charge_SupervisorChargeContext_Payload(): Drone_Battery_Charge_Supervisor.ChargeContext_Payload = {
      val r = parseDrone_Battery_Charge_SupervisorChargeContext_PayloadT(F)
      return r
    }

    def parseDrone_Battery_Charge_SupervisorChargeContext_PayloadT(typeParsed: B): Drone_Battery_Charge_Supervisor.ChargeContext_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Supervisor.ChargeContext_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Battery_Charge_SupervisorChargeContextType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Supervisor.ChargeContext_Payload(value)
    }

    def parseDrone_Battery_Charge_SupervisorChargeIntentType(): Drone_Battery_Charge_Supervisor.ChargeIntent.Type = {
      val r = parseDrone_Battery_Charge_SupervisorChargeIntentT(F)
      return r
    }

    def parseDrone_Battery_Charge_SupervisorChargeIntentT(typeParsed: B): Drone_Battery_Charge_Supervisor.ChargeIntent.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Supervisor.ChargeIntent")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Battery_Charge_Supervisor.ChargeIntent.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Battery_Charge_Supervisor.ChargeIntent.")
          return Drone_Battery_Charge_Supervisor.ChargeIntent.byOrdinal(0).get
      }
    }

    def parseDrone_Battery_Charge_SupervisorChargeIntent_Payload(): Drone_Battery_Charge_Supervisor.ChargeIntent_Payload = {
      val r = parseDrone_Battery_Charge_SupervisorChargeIntent_PayloadT(F)
      return r
    }

    def parseDrone_Battery_Charge_SupervisorChargeIntent_PayloadT(typeParsed: B): Drone_Battery_Charge_Supervisor.ChargeIntent_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Supervisor.ChargeIntent_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Battery_Charge_SupervisorChargeIntentType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Supervisor.ChargeIntent_Payload(value)
    }

    def parseDrone_Battery_Charge_SupervisorQualifiedChargeIntentType(): Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.Type = {
      val r = parseDrone_Battery_Charge_SupervisorQualifiedChargeIntentT(F)
      return r
    }

    def parseDrone_Battery_Charge_SupervisorQualifiedChargeIntentT(typeParsed: B): Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Supervisor.QualifiedChargeIntent")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.")
          return Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.byOrdinal(0).get
      }
    }

    def parseDrone_Battery_Charge_SupervisorQualifiedChargeIntent_Payload(): Drone_Battery_Charge_Supervisor.QualifiedChargeIntent_Payload = {
      val r = parseDrone_Battery_Charge_SupervisorQualifiedChargeIntent_PayloadT(F)
      return r
    }

    def parseDrone_Battery_Charge_SupervisorQualifiedChargeIntent_PayloadT(typeParsed: B): Drone_Battery_Charge_Supervisor.QualifiedChargeIntent_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Supervisor.QualifiedChargeIntent_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Battery_Charge_SupervisorQualifiedChargeIntentType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Supervisor.QualifiedChargeIntent_Payload(value)
    }

    def parseDrone_Battery_Charge_SupervisorChargeAuthorizationType(): Drone_Battery_Charge_Supervisor.ChargeAuthorization.Type = {
      val r = parseDrone_Battery_Charge_SupervisorChargeAuthorizationT(F)
      return r
    }

    def parseDrone_Battery_Charge_SupervisorChargeAuthorizationT(typeParsed: B): Drone_Battery_Charge_Supervisor.ChargeAuthorization.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Supervisor.ChargeAuthorization")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Battery_Charge_Supervisor.ChargeAuthorization.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Battery_Charge_Supervisor.ChargeAuthorization.")
          return Drone_Battery_Charge_Supervisor.ChargeAuthorization.byOrdinal(0).get
      }
    }

    def parseDrone_Battery_Charge_SupervisorChargeAuthorization_Payload(): Drone_Battery_Charge_Supervisor.ChargeAuthorization_Payload = {
      val r = parseDrone_Battery_Charge_SupervisorChargeAuthorization_PayloadT(F)
      return r
    }

    def parseDrone_Battery_Charge_SupervisorChargeAuthorization_PayloadT(typeParsed: B): Drone_Battery_Charge_Supervisor.ChargeAuthorization_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Supervisor.ChargeAuthorization_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Battery_Charge_SupervisorChargeAuthorizationType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Supervisor.ChargeAuthorization_Payload(value)
    }

    def parseDrone_Battery_Charge_SupervisorChargeDispositionType(): Drone_Battery_Charge_Supervisor.ChargeDisposition.Type = {
      val r = parseDrone_Battery_Charge_SupervisorChargeDispositionT(F)
      return r
    }

    def parseDrone_Battery_Charge_SupervisorChargeDispositionT(typeParsed: B): Drone_Battery_Charge_Supervisor.ChargeDisposition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Supervisor.ChargeDisposition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Battery_Charge_Supervisor.ChargeDisposition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Battery_Charge_Supervisor.ChargeDisposition.")
          return Drone_Battery_Charge_Supervisor.ChargeDisposition.byOrdinal(0).get
      }
    }

    def parseDrone_Battery_Charge_SupervisorChargeDisposition_Payload(): Drone_Battery_Charge_Supervisor.ChargeDisposition_Payload = {
      val r = parseDrone_Battery_Charge_SupervisorChargeDisposition_PayloadT(F)
      return r
    }

    def parseDrone_Battery_Charge_SupervisorChargeDisposition_PayloadT(typeParsed: B): Drone_Battery_Charge_Supervisor.ChargeDisposition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Supervisor.ChargeDisposition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Battery_Charge_SupervisorChargeDispositionType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Supervisor.ChargeDisposition_Payload(value)
    }

    def parseDrone_Battery_Charge_SupervisorBatteryAttentionType(): Drone_Battery_Charge_Supervisor.BatteryAttention.Type = {
      val r = parseDrone_Battery_Charge_SupervisorBatteryAttentionT(F)
      return r
    }

    def parseDrone_Battery_Charge_SupervisorBatteryAttentionT(typeParsed: B): Drone_Battery_Charge_Supervisor.BatteryAttention.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Supervisor.BatteryAttention")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Battery_Charge_Supervisor.BatteryAttention.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Battery_Charge_Supervisor.BatteryAttention.")
          return Drone_Battery_Charge_Supervisor.BatteryAttention.byOrdinal(0).get
      }
    }

    def parseDrone_Battery_Charge_SupervisorBatteryAttention_Payload(): Drone_Battery_Charge_Supervisor.BatteryAttention_Payload = {
      val r = parseDrone_Battery_Charge_SupervisorBatteryAttention_PayloadT(F)
      return r
    }

    def parseDrone_Battery_Charge_SupervisorBatteryAttention_PayloadT(typeParsed: B): Drone_Battery_Charge_Supervisor.BatteryAttention_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Supervisor.BatteryAttention_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Battery_Charge_SupervisorBatteryAttentionType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Supervisor.BatteryAttention_Payload(value)
    }

    def parseDrone_Battery_Charge_SupervisorBatteryReadinessEvidenceType(): Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence.Type = {
      val r = parseDrone_Battery_Charge_SupervisorBatteryReadinessEvidenceT(F)
      return r
    }

    def parseDrone_Battery_Charge_SupervisorBatteryReadinessEvidenceT(typeParsed: B): Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence.")
          return Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence.byOrdinal(0).get
      }
    }

    def parseDrone_Battery_Charge_SupervisorBatteryReadinessEvidence_Payload(): Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence_Payload = {
      val r = parseDrone_Battery_Charge_SupervisorBatteryReadinessEvidence_PayloadT(F)
      return r
    }

    def parseDrone_Battery_Charge_SupervisorBatteryReadinessEvidence_PayloadT(typeParsed: B): Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Battery_Charge_SupervisorBatteryReadinessEvidenceType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence_Payload(value)
    }

    def parseDrone_Battery_Charge_SupervisorRecoveryPhaseType(): Drone_Battery_Charge_Supervisor.RecoveryPhase.Type = {
      val r = parseDrone_Battery_Charge_SupervisorRecoveryPhaseT(F)
      return r
    }

    def parseDrone_Battery_Charge_SupervisorRecoveryPhaseT(typeParsed: B): Drone_Battery_Charge_Supervisor.RecoveryPhase.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Supervisor.RecoveryPhase")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Drone_Battery_Charge_Supervisor.RecoveryPhase.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Drone_Battery_Charge_Supervisor.RecoveryPhase.")
          return Drone_Battery_Charge_Supervisor.RecoveryPhase.byOrdinal(0).get
      }
    }

    def parseDrone_Battery_Charge_SupervisorRecoveryPhase_Payload(): Drone_Battery_Charge_Supervisor.RecoveryPhase_Payload = {
      val r = parseDrone_Battery_Charge_SupervisorRecoveryPhase_PayloadT(F)
      return r
    }

    def parseDrone_Battery_Charge_SupervisorRecoveryPhase_PayloadT(typeParsed: B): Drone_Battery_Charge_Supervisor.RecoveryPhase_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Supervisor.RecoveryPhase_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Battery_Charge_SupervisorRecoveryPhaseType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Supervisor.RecoveryPhase_Payload(value)
    }

    def parseDrone_Battery_Charge_SupervisorBatterySample(): Drone_Battery_Charge_Supervisor.BatterySample = {
      val r = parseDrone_Battery_Charge_SupervisorBatterySampleT(F)
      return r
    }

    def parseDrone_Battery_Charge_SupervisorBatterySampleT(typeParsed: B): Drone_Battery_Charge_Supervisor.BatterySample = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Supervisor.BatterySample")
      }
      parser.parseObjectKey("indication")
      val indication = parseDrone_Battery_Charge_SupervisorBatteryIndicationType()
      parser.parseObjectNext()
      parser.parseObjectKey("status")
      val status = parseDrone_Battery_Charge_SupervisorInputStatusType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Supervisor.BatterySample(indication, status)
    }

    def parseDrone_Battery_Charge_SupervisorBatterySample_Payload(): Drone_Battery_Charge_Supervisor.BatterySample_Payload = {
      val r = parseDrone_Battery_Charge_SupervisorBatterySample_PayloadT(F)
      return r
    }

    def parseDrone_Battery_Charge_SupervisorBatterySample_PayloadT(typeParsed: B): Drone_Battery_Charge_Supervisor.BatterySample_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Supervisor.BatterySample_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Battery_Charge_SupervisorBatterySample()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Supervisor.BatterySample_Payload(value)
    }

    def parseDrone_Battery_Charge_SupervisorChargerSample(): Drone_Battery_Charge_Supervisor.ChargerSample = {
      val r = parseDrone_Battery_Charge_SupervisorChargerSampleT(F)
      return r
    }

    def parseDrone_Battery_Charge_SupervisorChargerSampleT(typeParsed: B): Drone_Battery_Charge_Supervisor.ChargerSample = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Supervisor.ChargerSample")
      }
      parser.parseObjectKey("availability")
      val availability = parseDrone_Battery_Charge_SupervisorChargerAvailabilityType()
      parser.parseObjectNext()
      parser.parseObjectKey("status")
      val status = parseDrone_Battery_Charge_SupervisorInputStatusType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Supervisor.ChargerSample(availability, status)
    }

    def parseDrone_Battery_Charge_SupervisorChargerSample_Payload(): Drone_Battery_Charge_Supervisor.ChargerSample_Payload = {
      val r = parseDrone_Battery_Charge_SupervisorChargerSample_PayloadT(F)
      return r
    }

    def parseDrone_Battery_Charge_SupervisorChargerSample_PayloadT(typeParsed: B): Drone_Battery_Charge_Supervisor.ChargerSample_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Supervisor.ChargerSample_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Battery_Charge_SupervisorChargerSample()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Supervisor.ChargerSample_Payload(value)
    }

    def parseDrone_Battery_Charge_SupervisorFlightActivitySample(): Drone_Battery_Charge_Supervisor.FlightActivitySample = {
      val r = parseDrone_Battery_Charge_SupervisorFlightActivitySampleT(F)
      return r
    }

    def parseDrone_Battery_Charge_SupervisorFlightActivitySampleT(typeParsed: B): Drone_Battery_Charge_Supervisor.FlightActivitySample = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Supervisor.FlightActivitySample")
      }
      parser.parseObjectKey("activity")
      val activity = parseDrone_Battery_Charge_SupervisorFlightActivityType()
      parser.parseObjectNext()
      parser.parseObjectKey("status")
      val status = parseDrone_Battery_Charge_SupervisorInputStatusType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Supervisor.FlightActivitySample(activity, status)
    }

    def parseDrone_Battery_Charge_SupervisorFlightActivitySample_Payload(): Drone_Battery_Charge_Supervisor.FlightActivitySample_Payload = {
      val r = parseDrone_Battery_Charge_SupervisorFlightActivitySample_PayloadT(F)
      return r
    }

    def parseDrone_Battery_Charge_SupervisorFlightActivitySample_PayloadT(typeParsed: B): Drone_Battery_Charge_Supervisor.FlightActivitySample_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Supervisor.FlightActivitySample_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Battery_Charge_SupervisorFlightActivitySample()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Supervisor.FlightActivitySample_Payload(value)
    }

    def parseDrone_Battery_Charge_SupervisorChargeIntentSample(): Drone_Battery_Charge_Supervisor.ChargeIntentSample = {
      val r = parseDrone_Battery_Charge_SupervisorChargeIntentSampleT(F)
      return r
    }

    def parseDrone_Battery_Charge_SupervisorChargeIntentSampleT(typeParsed: B): Drone_Battery_Charge_Supervisor.ChargeIntentSample = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Supervisor.ChargeIntentSample")
      }
      parser.parseObjectKey("intent")
      val intent = parseDrone_Battery_Charge_SupervisorChargeIntentType()
      parser.parseObjectNext()
      parser.parseObjectKey("status")
      val status = parseDrone_Battery_Charge_SupervisorInputStatusType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Supervisor.ChargeIntentSample(intent, status)
    }

    def parseDrone_Battery_Charge_SupervisorChargeIntentSample_Payload(): Drone_Battery_Charge_Supervisor.ChargeIntentSample_Payload = {
      val r = parseDrone_Battery_Charge_SupervisorChargeIntentSample_PayloadT(F)
      return r
    }

    def parseDrone_Battery_Charge_SupervisorChargeIntentSample_PayloadT(typeParsed: B): Drone_Battery_Charge_Supervisor.ChargeIntentSample_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Supervisor.ChargeIntentSample_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Battery_Charge_SupervisorChargeIntentSample()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Supervisor.ChargeIntentSample_Payload(value)
    }

    def parseDrone_Battery_Charge_SupervisorChargeDecision(): Drone_Battery_Charge_Supervisor.ChargeDecision = {
      val r = parseDrone_Battery_Charge_SupervisorChargeDecisionT(F)
      return r
    }

    def parseDrone_Battery_Charge_SupervisorChargeDecisionT(typeParsed: B): Drone_Battery_Charge_Supervisor.ChargeDecision = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Supervisor.ChargeDecision")
      }
      parser.parseObjectKey("authorization")
      val authorization = parseDrone_Battery_Charge_SupervisorChargeAuthorizationType()
      parser.parseObjectNext()
      parser.parseObjectKey("disposition")
      val disposition = parseDrone_Battery_Charge_SupervisorChargeDispositionType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Supervisor.ChargeDecision(authorization, disposition)
    }

    def parseDrone_Battery_Charge_SupervisorChargeDecision_Payload(): Drone_Battery_Charge_Supervisor.ChargeDecision_Payload = {
      val r = parseDrone_Battery_Charge_SupervisorChargeDecision_PayloadT(F)
      return r
    }

    def parseDrone_Battery_Charge_SupervisorChargeDecision_PayloadT(typeParsed: B): Drone_Battery_Charge_Supervisor.ChargeDecision_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Supervisor.ChargeDecision_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDrone_Battery_Charge_SupervisorChargeDecision()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Supervisor.ChargeDecision_Payload(value)
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

    def parseDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container(): Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P", "Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS"))
      t.native match {
        case "Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P" => val r = parseDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PT(T); return r
        case "Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS" => val r = parseDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PST(T); return r
        case _ => val r = parseDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PST(T); return r
      }
    }

    def parseDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P(): Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P = {
      val r = parseDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PT(F)
      return r
    }

    def parseDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PT(typeParsed: B): Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P")
      }
      parser.parseObjectKey("api_battery_sample")
      val api_battery_sample = parseDrone_Battery_Charge_SupervisorBatterySample()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P(api_battery_sample)
    }

    def parseDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS(): Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS = {
      val r = parseDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PST(F)
      return r
    }

    def parseDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PST(typeParsed: B): Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS")
      }
      parser.parseObjectKey("api_battery_sample")
      val api_battery_sample = parseDrone_Battery_Charge_SupervisorBatterySample()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS(api_battery_sample)
    }

    def parseDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container(): Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P", "Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS"))
      t.native match {
        case "Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P" => val r = parseDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PT(T); return r
        case "Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS" => val r = parseDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PST(T); return r
        case _ => val r = parseDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PST(T); return r
      }
    }

    def parseDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P(): Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P = {
      val r = parseDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PT(F)
      return r
    }

    def parseDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PT(typeParsed: B): Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P")
      }
      parser.parseObjectKey("api_evidence_to_attention")
      val api_evidence_to_attention = parseDrone_Battery_Charge_SupervisorBatteryEvidenceType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_evidence_to_owner")
      val api_evidence_to_owner = parseDrone_Battery_Charge_SupervisorBatteryEvidenceType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_evidence_to_readiness")
      val api_evidence_to_readiness = parseDrone_Battery_Charge_SupervisorBatteryEvidenceType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P(api_evidence_to_attention, api_evidence_to_owner, api_evidence_to_readiness)
    }

    def parseDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS(): Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS = {
      val r = parseDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PST(F)
      return r
    }

    def parseDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PST(typeParsed: B): Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS")
      }
      parser.parseObjectKey("api_evidence_to_attention")
      val api_evidence_to_attention = parseDrone_Battery_Charge_SupervisorBatteryEvidenceType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_evidence_to_owner")
      val api_evidence_to_owner = parseDrone_Battery_Charge_SupervisorBatteryEvidenceType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_evidence_to_readiness")
      val api_evidence_to_readiness = parseDrone_Battery_Charge_SupervisorBatteryEvidenceType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS(api_evidence_to_attention, api_evidence_to_owner, api_evidence_to_readiness)
    }

    def parseDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container(): Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P", "Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS"))
      t.native match {
        case "Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P" => val r = parseDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PT(T); return r
        case "Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS" => val r = parseDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PST(T); return r
        case _ => val r = parseDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PST(T); return r
      }
    }

    def parseDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P(): Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P = {
      val r = parseDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PT(F)
      return r
    }

    def parseDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PT(typeParsed: B): Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P")
      }
      parser.parseObjectKey("api_charger_sample")
      val api_charger_sample = parseDrone_Battery_Charge_SupervisorChargerSample()
      parser.parseObjectNext()
      parser.parseObjectKey("api_flight_sample")
      val api_flight_sample = parseDrone_Battery_Charge_SupervisorFlightActivitySample()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P(api_charger_sample, api_flight_sample)
    }

    def parseDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS(): Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS = {
      val r = parseDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PST(F)
      return r
    }

    def parseDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PST(typeParsed: B): Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS")
      }
      parser.parseObjectKey("api_charger_sample")
      val api_charger_sample = parseDrone_Battery_Charge_SupervisorChargerSample()
      parser.parseObjectNext()
      parser.parseObjectKey("api_flight_sample")
      val api_flight_sample = parseDrone_Battery_Charge_SupervisorFlightActivitySample()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS(api_charger_sample, api_flight_sample)
    }

    def parseDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container(): Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P", "Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS"))
      t.native match {
        case "Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P" => val r = parseDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PT(T); return r
        case "Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS" => val r = parseDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PST(T); return r
        case _ => val r = parseDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PST(T); return r
      }
    }

    def parseDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P(): Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P = {
      val r = parseDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PT(F)
      return r
    }

    def parseDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PT(typeParsed: B): Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P")
      }
      parser.parseObjectKey("api_charge_context")
      val api_charge_context = parseDrone_Battery_Charge_SupervisorChargeContextType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P(api_charge_context)
    }

    def parseDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS(): Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS = {
      val r = parseDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PST(F)
      return r
    }

    def parseDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PST(typeParsed: B): Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS")
      }
      parser.parseObjectKey("api_charge_context")
      val api_charge_context = parseDrone_Battery_Charge_SupervisorChargeContextType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS(api_charge_context)
    }

    def parseDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container(): Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P", "Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS"))
      t.native match {
        case "Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P" => val r = parseDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PT(T); return r
        case "Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS" => val r = parseDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PST(T); return r
        case _ => val r = parseDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PST(T); return r
      }
    }

    def parseDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P(): Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P = {
      val r = parseDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PT(F)
      return r
    }

    def parseDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PT(typeParsed: B): Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P")
      }
      parser.parseObjectKey("api_intent_sample")
      val api_intent_sample = parseDrone_Battery_Charge_SupervisorChargeIntentSample()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P(api_intent_sample)
    }

    def parseDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS(): Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS = {
      val r = parseDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PST(F)
      return r
    }

    def parseDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PST(typeParsed: B): Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS")
      }
      parser.parseObjectKey("api_intent_sample")
      val api_intent_sample = parseDrone_Battery_Charge_SupervisorChargeIntentSample()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS(api_intent_sample)
    }

    def parseDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container(): Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P", "Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS"))
      t.native match {
        case "Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P" => val r = parseDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PT(T); return r
        case "Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS" => val r = parseDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PST(T); return r
        case _ => val r = parseDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PST(T); return r
      }
    }

    def parseDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P(): Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P = {
      val r = parseDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PT(F)
      return r
    }

    def parseDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PT(typeParsed: B): Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P")
      }
      parser.parseObjectKey("api_qualified_intent")
      val api_qualified_intent = parseDrone_Battery_Charge_SupervisorQualifiedChargeIntentType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P(api_qualified_intent)
    }

    def parseDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS(): Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS = {
      val r = parseDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PST(F)
      return r
    }

    def parseDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PST(typeParsed: B): Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS")
      }
      parser.parseObjectKey("api_qualified_intent")
      val api_qualified_intent = parseDrone_Battery_Charge_SupervisorQualifiedChargeIntentType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS(api_qualified_intent)
    }

    def parseDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container(): Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P", "Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS"))
      t.native match {
        case "Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P" => val r = parseDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PT(T); return r
        case "Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS" => val r = parseDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PST(T); return r
        case _ => val r = parseDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PST(T); return r
      }
    }

    def parseDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P(): Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P = {
      val r = parseDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PT(F)
      return r
    }

    def parseDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PT(typeParsed: B): Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P")
      }
      parser.parseObjectKey("api_battery_evidence")
      val api_battery_evidence = parseDrone_Battery_Charge_SupervisorBatteryEvidenceType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_charge_context")
      val api_charge_context = parseDrone_Battery_Charge_SupervisorChargeContextType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualified_intent")
      val api_qualified_intent = parseDrone_Battery_Charge_SupervisorQualifiedChargeIntentType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P(api_battery_evidence, api_charge_context, api_qualified_intent)
    }

    def parseDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS(): Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS = {
      val r = parseDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PST(F)
      return r
    }

    def parseDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PST(typeParsed: B): Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS")
      }
      parser.parseObjectKey("In_authorizationState")
      val In_authorizationState = parseDrone_Battery_Charge_SupervisorChargeAuthorizationType()
      parser.parseObjectNext()
      parser.parseObjectKey("In_recoveryPhase")
      val In_recoveryPhase = parseDrone_Battery_Charge_SupervisorRecoveryPhaseType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_battery_evidence")
      val api_battery_evidence = parseDrone_Battery_Charge_SupervisorBatteryEvidenceType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_charge_context")
      val api_charge_context = parseDrone_Battery_Charge_SupervisorChargeContextType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualified_intent")
      val api_qualified_intent = parseDrone_Battery_Charge_SupervisorQualifiedChargeIntentType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS(In_authorizationState, In_recoveryPhase, api_battery_evidence, api_charge_context, api_qualified_intent)
    }

    def parseDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container(): Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P", "Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS"))
      t.native match {
        case "Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P" => val r = parseDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PT(T); return r
        case "Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS" => val r = parseDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PST(T); return r
        case _ => val r = parseDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PST(T); return r
      }
    }

    def parseDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P(): Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P = {
      val r = parseDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PT(F)
      return r
    }

    def parseDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PT(typeParsed: B): Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P")
      }
      parser.parseObjectKey("api_authorization")
      val api_authorization = parseDrone_Battery_Charge_SupervisorChargeAuthorizationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_decision_to_attention")
      val api_decision_to_attention = parseDrone_Battery_Charge_SupervisorChargeDecision()
      parser.parseObjectNext()
      parser.parseObjectKey("api_decision_to_readiness")
      val api_decision_to_readiness = parseDrone_Battery_Charge_SupervisorChargeDecision()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P(api_authorization, api_decision_to_attention, api_decision_to_readiness)
    }

    def parseDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS(): Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS = {
      val r = parseDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PST(F)
      return r
    }

    def parseDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PST(typeParsed: B): Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS")
      }
      parser.parseObjectKey("authorizationState")
      val authorizationState = parseDrone_Battery_Charge_SupervisorChargeAuthorizationType()
      parser.parseObjectNext()
      parser.parseObjectKey("recoveryPhase")
      val recoveryPhase = parseDrone_Battery_Charge_SupervisorRecoveryPhaseType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_authorization")
      val api_authorization = parseDrone_Battery_Charge_SupervisorChargeAuthorizationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_decision_to_attention")
      val api_decision_to_attention = parseDrone_Battery_Charge_SupervisorChargeDecision()
      parser.parseObjectNext()
      parser.parseObjectKey("api_decision_to_readiness")
      val api_decision_to_readiness = parseDrone_Battery_Charge_SupervisorChargeDecision()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS(authorizationState, recoveryPhase, api_authorization, api_decision_to_attention, api_decision_to_readiness)
    }

    def parseDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container(): Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P", "Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS"))
      t.native match {
        case "Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P" => val r = parseDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PT(T); return r
        case "Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS" => val r = parseDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PST(T); return r
        case _ => val r = parseDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PST(T); return r
      }
    }

    def parseDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P(): Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P = {
      val r = parseDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PT(F)
      return r
    }

    def parseDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PT(typeParsed: B): Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P")
      }
      parser.parseObjectKey("api_battery_evidence")
      val api_battery_evidence = parseDrone_Battery_Charge_SupervisorBatteryEvidenceType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_charge_decision")
      val api_charge_decision = parseDrone_Battery_Charge_SupervisorChargeDecision()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P(api_battery_evidence, api_charge_decision)
    }

    def parseDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS(): Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS = {
      val r = parseDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PST(F)
      return r
    }

    def parseDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PST(typeParsed: B): Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS")
      }
      parser.parseObjectKey("api_battery_evidence")
      val api_battery_evidence = parseDrone_Battery_Charge_SupervisorBatteryEvidenceType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_charge_decision")
      val api_charge_decision = parseDrone_Battery_Charge_SupervisorChargeDecision()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS(api_battery_evidence, api_charge_decision)
    }

    def parseDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container(): Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P", "Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS"))
      t.native match {
        case "Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P" => val r = parseDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PT(T); return r
        case "Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS" => val r = parseDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PST(T); return r
        case _ => val r = parseDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PST(T); return r
      }
    }

    def parseDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P(): Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P = {
      val r = parseDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PT(F)
      return r
    }

    def parseDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PT(typeParsed: B): Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P")
      }
      parser.parseObjectKey("api_battery_attention")
      val api_battery_attention = parseDrone_Battery_Charge_SupervisorBatteryAttentionType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P(api_battery_attention)
    }

    def parseDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS(): Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS = {
      val r = parseDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PST(F)
      return r
    }

    def parseDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PST(typeParsed: B): Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS")
      }
      parser.parseObjectKey("api_battery_attention")
      val api_battery_attention = parseDrone_Battery_Charge_SupervisorBatteryAttentionType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS(api_battery_attention)
    }

    def parseDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container(): Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P", "Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS"))
      t.native match {
        case "Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P" => val r = parseDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PT(T); return r
        case "Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS" => val r = parseDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PST(T); return r
        case _ => val r = parseDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PST(T); return r
      }
    }

    def parseDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P(): Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P = {
      val r = parseDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PT(F)
      return r
    }

    def parseDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PT(typeParsed: B): Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P")
      }
      parser.parseObjectKey("api_battery_evidence")
      val api_battery_evidence = parseDrone_Battery_Charge_SupervisorBatteryEvidenceType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_charge_decision")
      val api_charge_decision = parseDrone_Battery_Charge_SupervisorChargeDecision()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P(api_battery_evidence, api_charge_decision)
    }

    def parseDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS(): Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS = {
      val r = parseDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PST(F)
      return r
    }

    def parseDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PST(typeParsed: B): Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS")
      }
      parser.parseObjectKey("api_battery_evidence")
      val api_battery_evidence = parseDrone_Battery_Charge_SupervisorBatteryEvidenceType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_charge_decision")
      val api_charge_decision = parseDrone_Battery_Charge_SupervisorChargeDecision()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS(api_battery_evidence, api_charge_decision)
    }

    def parseDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container(): Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P", "Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS"))
      t.native match {
        case "Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P" => val r = parseDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PT(T); return r
        case "Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS" => val r = parseDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PST(T); return r
        case _ => val r = parseDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PST(T); return r
      }
    }

    def parseDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P(): Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P = {
      val r = parseDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PT(F)
      return r
    }

    def parseDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PT(typeParsed: B): Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P")
      }
      parser.parseObjectKey("api_readiness_evidence")
      val api_readiness_evidence = parseDrone_Battery_Charge_SupervisorBatteryReadinessEvidenceType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P(api_readiness_evidence)
    }

    def parseDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS(): Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS = {
      val r = parseDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PST(F)
      return r
    }

    def parseDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PST(typeParsed: B): Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS")
      }
      parser.parseObjectKey("api_readiness_evidence")
      val api_readiness_evidence = parseDrone_Battery_Charge_SupervisorBatteryReadinessEvidenceType()
      parser.parseObjectNext()
      return Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS(api_readiness_evidence)
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
      val t = parser.parseObjectTypes(ISZ("util.EmptyContainer", "Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P", "Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P", "Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS", "Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS", "Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P", "Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS", "Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P", "Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS", "Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P", "Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS", "Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P", "Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS", "Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P", "Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS", "Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P", "Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS", "Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P", "Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS", "Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P", "Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS", "Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P", "Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS", "Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P", "Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS"))
      t.native match {
        case "util.EmptyContainer" => val r = parseutilEmptyContainerT(T); return r
        case "Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P" => val r = parseDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PT(T); return r
        case "Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P" => val r = parseDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PT(T); return r
        case "Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS" => val r = parseDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PST(T); return r
        case "Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS" => val r = parseDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PST(T); return r
        case "Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P" => val r = parseDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PT(T); return r
        case "Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS" => val r = parseDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PST(T); return r
        case "Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P" => val r = parseDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PT(T); return r
        case "Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS" => val r = parseDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PST(T); return r
        case "Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P" => val r = parseDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PT(T); return r
        case "Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS" => val r = parseDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PST(T); return r
        case "Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P" => val r = parseDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PT(T); return r
        case "Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS" => val r = parseDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PST(T); return r
        case "Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P" => val r = parseDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PT(T); return r
        case "Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS" => val r = parseDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PST(T); return r
        case "Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P" => val r = parseDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PT(T); return r
        case "Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS" => val r = parseDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PST(T); return r
        case "Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P" => val r = parseDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PT(T); return r
        case "Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS" => val r = parseDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PST(T); return r
        case "Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P" => val r = parseDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PT(T); return r
        case "Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS" => val r = parseDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PST(T); return r
        case "Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P" => val r = parseDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PT(T); return r
        case "Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS" => val r = parseDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PST(T); return r
        case "Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P" => val r = parseDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PT(T); return r
        case "Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS" => val r = parseDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PST(T); return r
        case _ => val r = parseDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PST(T); return r
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
      val t = parser.parseObjectTypes(ISZ("art.Empty", "Base_Types.Boolean_Payload", "Base_Types.Integer_Payload", "Base_Types.Integer_8_Payload", "Base_Types.Integer_16_Payload", "Base_Types.Integer_32_Payload", "Base_Types.Integer_64_Payload", "Base_Types.Unsigned_8_Payload", "Base_Types.Unsigned_16_Payload", "Base_Types.Unsigned_32_Payload", "Base_Types.Unsigned_64_Payload", "Base_Types.Float_Payload", "Base_Types.Float_32_Payload", "Base_Types.Float_64_Payload", "Base_Types.Character_Payload", "Base_Types.String_Payload", "Base_Types.Bits_Payload", "util.EmptyContainer", "Drone_Battery_Charge_Supervisor.InputStatus_Payload", "Drone_Battery_Charge_Supervisor.ChargeIntent_Payload", "Drone_Battery_Charge_Supervisor.RecoveryPhase_Payload", "Drone_Battery_Charge_Supervisor.ChargeContext_Payload", "Drone_Battery_Charge_Supervisor.BatterySample_Payload", "Drone_Battery_Charge_Supervisor.ChargerSample_Payload", "Drone_Battery_Charge_Supervisor.FlightActivity_Payload", "Drone_Battery_Charge_Supervisor.ChargeDecision_Payload", "Drone_Battery_Charge_Supervisor.BatteryEvidence_Payload", "Drone_Battery_Charge_Supervisor.BatteryAttention_Payload", "Drone_Battery_Charge_Supervisor.BatteryIndication_Payload", "Drone_Battery_Charge_Supervisor.ChargeDisposition_Payload", "Drone_Battery_Charge_Supervisor.ChargeIntentSample_Payload", "Drone_Battery_Charge_Supervisor.ChargerAvailability_Payload", "Drone_Battery_Charge_Supervisor.ChargeAuthorization_Payload", "Drone_Battery_Charge_Supervisor.FlightActivitySample_Payload", "Drone_Battery_Charge_Supervisor.QualifiedChargeIntent_Payload", "Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence_Payload", "Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P", "Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P", "Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS", "Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS", "Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P", "Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS", "Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P", "Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS", "Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P", "Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS", "Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P", "Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS", "Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P", "Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS", "Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P", "Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS", "Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P", "Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS", "Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P", "Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS", "Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P", "Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS", "Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P", "Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS"))
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
        case "Drone_Battery_Charge_Supervisor.InputStatus_Payload" => val r = parseDrone_Battery_Charge_SupervisorInputStatus_PayloadT(T); return r
        case "Drone_Battery_Charge_Supervisor.ChargeIntent_Payload" => val r = parseDrone_Battery_Charge_SupervisorChargeIntent_PayloadT(T); return r
        case "Drone_Battery_Charge_Supervisor.RecoveryPhase_Payload" => val r = parseDrone_Battery_Charge_SupervisorRecoveryPhase_PayloadT(T); return r
        case "Drone_Battery_Charge_Supervisor.ChargeContext_Payload" => val r = parseDrone_Battery_Charge_SupervisorChargeContext_PayloadT(T); return r
        case "Drone_Battery_Charge_Supervisor.BatterySample_Payload" => val r = parseDrone_Battery_Charge_SupervisorBatterySample_PayloadT(T); return r
        case "Drone_Battery_Charge_Supervisor.ChargerSample_Payload" => val r = parseDrone_Battery_Charge_SupervisorChargerSample_PayloadT(T); return r
        case "Drone_Battery_Charge_Supervisor.FlightActivity_Payload" => val r = parseDrone_Battery_Charge_SupervisorFlightActivity_PayloadT(T); return r
        case "Drone_Battery_Charge_Supervisor.ChargeDecision_Payload" => val r = parseDrone_Battery_Charge_SupervisorChargeDecision_PayloadT(T); return r
        case "Drone_Battery_Charge_Supervisor.BatteryEvidence_Payload" => val r = parseDrone_Battery_Charge_SupervisorBatteryEvidence_PayloadT(T); return r
        case "Drone_Battery_Charge_Supervisor.BatteryAttention_Payload" => val r = parseDrone_Battery_Charge_SupervisorBatteryAttention_PayloadT(T); return r
        case "Drone_Battery_Charge_Supervisor.BatteryIndication_Payload" => val r = parseDrone_Battery_Charge_SupervisorBatteryIndication_PayloadT(T); return r
        case "Drone_Battery_Charge_Supervisor.ChargeDisposition_Payload" => val r = parseDrone_Battery_Charge_SupervisorChargeDisposition_PayloadT(T); return r
        case "Drone_Battery_Charge_Supervisor.ChargeIntentSample_Payload" => val r = parseDrone_Battery_Charge_SupervisorChargeIntentSample_PayloadT(T); return r
        case "Drone_Battery_Charge_Supervisor.ChargerAvailability_Payload" => val r = parseDrone_Battery_Charge_SupervisorChargerAvailability_PayloadT(T); return r
        case "Drone_Battery_Charge_Supervisor.ChargeAuthorization_Payload" => val r = parseDrone_Battery_Charge_SupervisorChargeAuthorization_PayloadT(T); return r
        case "Drone_Battery_Charge_Supervisor.FlightActivitySample_Payload" => val r = parseDrone_Battery_Charge_SupervisorFlightActivitySample_PayloadT(T); return r
        case "Drone_Battery_Charge_Supervisor.QualifiedChargeIntent_Payload" => val r = parseDrone_Battery_Charge_SupervisorQualifiedChargeIntent_PayloadT(T); return r
        case "Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence_Payload" => val r = parseDrone_Battery_Charge_SupervisorBatteryReadinessEvidence_PayloadT(T); return r
        case "Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P" => val r = parseDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PT(T); return r
        case "Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P" => val r = parseDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PT(T); return r
        case "Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS" => val r = parseDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PST(T); return r
        case "Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS" => val r = parseDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PST(T); return r
        case "Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P" => val r = parseDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PT(T); return r
        case "Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS" => val r = parseDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PST(T); return r
        case "Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P" => val r = parseDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PT(T); return r
        case "Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS" => val r = parseDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PST(T); return r
        case "Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P" => val r = parseDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PT(T); return r
        case "Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS" => val r = parseDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PST(T); return r
        case "Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P" => val r = parseDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PT(T); return r
        case "Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS" => val r = parseDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PST(T); return r
        case "Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P" => val r = parseDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PT(T); return r
        case "Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS" => val r = parseDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PST(T); return r
        case "Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P" => val r = parseDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PT(T); return r
        case "Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS" => val r = parseDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PST(T); return r
        case "Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P" => val r = parseDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PT(T); return r
        case "Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS" => val r = parseDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PST(T); return r
        case "Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P" => val r = parseDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PT(T); return r
        case "Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS" => val r = parseDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PST(T); return r
        case "Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P" => val r = parseDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PT(T); return r
        case "Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS" => val r = parseDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PST(T); return r
        case "Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P" => val r = parseDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PT(T); return r
        case "Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS" => val r = parseDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PST(T); return r
        case _ => val r = parseDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PST(T); return r
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

  def fromDrone_Battery_Charge_SupervisorBatteryIndication_Payload(o: Drone_Battery_Charge_Supervisor.BatteryIndication_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_SupervisorBatteryIndication_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_SupervisorBatteryIndication_Payload(s: String): Either[Drone_Battery_Charge_Supervisor.BatteryIndication_Payload, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorBatteryIndication_Payload(parser: Parser): Drone_Battery_Charge_Supervisor.BatteryIndication_Payload = {
      val r = parser.parseDrone_Battery_Charge_SupervisorBatteryIndication_Payload()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_SupervisorBatteryIndication_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorInputStatus_Payload(o: Drone_Battery_Charge_Supervisor.InputStatus_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_SupervisorInputStatus_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_SupervisorInputStatus_Payload(s: String): Either[Drone_Battery_Charge_Supervisor.InputStatus_Payload, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorInputStatus_Payload(parser: Parser): Drone_Battery_Charge_Supervisor.InputStatus_Payload = {
      val r = parser.parseDrone_Battery_Charge_SupervisorInputStatus_Payload()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_SupervisorInputStatus_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorBatteryEvidence_Payload(o: Drone_Battery_Charge_Supervisor.BatteryEvidence_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_SupervisorBatteryEvidence_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_SupervisorBatteryEvidence_Payload(s: String): Either[Drone_Battery_Charge_Supervisor.BatteryEvidence_Payload, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorBatteryEvidence_Payload(parser: Parser): Drone_Battery_Charge_Supervisor.BatteryEvidence_Payload = {
      val r = parser.parseDrone_Battery_Charge_SupervisorBatteryEvidence_Payload()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_SupervisorBatteryEvidence_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorChargerAvailability_Payload(o: Drone_Battery_Charge_Supervisor.ChargerAvailability_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_SupervisorChargerAvailability_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_SupervisorChargerAvailability_Payload(s: String): Either[Drone_Battery_Charge_Supervisor.ChargerAvailability_Payload, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorChargerAvailability_Payload(parser: Parser): Drone_Battery_Charge_Supervisor.ChargerAvailability_Payload = {
      val r = parser.parseDrone_Battery_Charge_SupervisorChargerAvailability_Payload()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_SupervisorChargerAvailability_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorFlightActivity_Payload(o: Drone_Battery_Charge_Supervisor.FlightActivity_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_SupervisorFlightActivity_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_SupervisorFlightActivity_Payload(s: String): Either[Drone_Battery_Charge_Supervisor.FlightActivity_Payload, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorFlightActivity_Payload(parser: Parser): Drone_Battery_Charge_Supervisor.FlightActivity_Payload = {
      val r = parser.parseDrone_Battery_Charge_SupervisorFlightActivity_Payload()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_SupervisorFlightActivity_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorChargeContext_Payload(o: Drone_Battery_Charge_Supervisor.ChargeContext_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_SupervisorChargeContext_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_SupervisorChargeContext_Payload(s: String): Either[Drone_Battery_Charge_Supervisor.ChargeContext_Payload, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorChargeContext_Payload(parser: Parser): Drone_Battery_Charge_Supervisor.ChargeContext_Payload = {
      val r = parser.parseDrone_Battery_Charge_SupervisorChargeContext_Payload()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_SupervisorChargeContext_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorChargeIntent_Payload(o: Drone_Battery_Charge_Supervisor.ChargeIntent_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_SupervisorChargeIntent_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_SupervisorChargeIntent_Payload(s: String): Either[Drone_Battery_Charge_Supervisor.ChargeIntent_Payload, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorChargeIntent_Payload(parser: Parser): Drone_Battery_Charge_Supervisor.ChargeIntent_Payload = {
      val r = parser.parseDrone_Battery_Charge_SupervisorChargeIntent_Payload()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_SupervisorChargeIntent_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorQualifiedChargeIntent_Payload(o: Drone_Battery_Charge_Supervisor.QualifiedChargeIntent_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_SupervisorQualifiedChargeIntent_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_SupervisorQualifiedChargeIntent_Payload(s: String): Either[Drone_Battery_Charge_Supervisor.QualifiedChargeIntent_Payload, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorQualifiedChargeIntent_Payload(parser: Parser): Drone_Battery_Charge_Supervisor.QualifiedChargeIntent_Payload = {
      val r = parser.parseDrone_Battery_Charge_SupervisorQualifiedChargeIntent_Payload()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_SupervisorQualifiedChargeIntent_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorChargeAuthorization_Payload(o: Drone_Battery_Charge_Supervisor.ChargeAuthorization_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_SupervisorChargeAuthorization_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_SupervisorChargeAuthorization_Payload(s: String): Either[Drone_Battery_Charge_Supervisor.ChargeAuthorization_Payload, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorChargeAuthorization_Payload(parser: Parser): Drone_Battery_Charge_Supervisor.ChargeAuthorization_Payload = {
      val r = parser.parseDrone_Battery_Charge_SupervisorChargeAuthorization_Payload()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_SupervisorChargeAuthorization_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorChargeDisposition_Payload(o: Drone_Battery_Charge_Supervisor.ChargeDisposition_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_SupervisorChargeDisposition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_SupervisorChargeDisposition_Payload(s: String): Either[Drone_Battery_Charge_Supervisor.ChargeDisposition_Payload, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorChargeDisposition_Payload(parser: Parser): Drone_Battery_Charge_Supervisor.ChargeDisposition_Payload = {
      val r = parser.parseDrone_Battery_Charge_SupervisorChargeDisposition_Payload()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_SupervisorChargeDisposition_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorBatteryAttention_Payload(o: Drone_Battery_Charge_Supervisor.BatteryAttention_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_SupervisorBatteryAttention_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_SupervisorBatteryAttention_Payload(s: String): Either[Drone_Battery_Charge_Supervisor.BatteryAttention_Payload, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorBatteryAttention_Payload(parser: Parser): Drone_Battery_Charge_Supervisor.BatteryAttention_Payload = {
      val r = parser.parseDrone_Battery_Charge_SupervisorBatteryAttention_Payload()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_SupervisorBatteryAttention_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorBatteryReadinessEvidence_Payload(o: Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_SupervisorBatteryReadinessEvidence_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_SupervisorBatteryReadinessEvidence_Payload(s: String): Either[Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence_Payload, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorBatteryReadinessEvidence_Payload(parser: Parser): Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence_Payload = {
      val r = parser.parseDrone_Battery_Charge_SupervisorBatteryReadinessEvidence_Payload()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_SupervisorBatteryReadinessEvidence_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorRecoveryPhase_Payload(o: Drone_Battery_Charge_Supervisor.RecoveryPhase_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_SupervisorRecoveryPhase_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_SupervisorRecoveryPhase_Payload(s: String): Either[Drone_Battery_Charge_Supervisor.RecoveryPhase_Payload, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorRecoveryPhase_Payload(parser: Parser): Drone_Battery_Charge_Supervisor.RecoveryPhase_Payload = {
      val r = parser.parseDrone_Battery_Charge_SupervisorRecoveryPhase_Payload()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_SupervisorRecoveryPhase_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorBatterySample(o: Drone_Battery_Charge_Supervisor.BatterySample, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_SupervisorBatterySample(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_SupervisorBatterySample(s: String): Either[Drone_Battery_Charge_Supervisor.BatterySample, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorBatterySample(parser: Parser): Drone_Battery_Charge_Supervisor.BatterySample = {
      val r = parser.parseDrone_Battery_Charge_SupervisorBatterySample()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_SupervisorBatterySample _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorBatterySample_Payload(o: Drone_Battery_Charge_Supervisor.BatterySample_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_SupervisorBatterySample_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_SupervisorBatterySample_Payload(s: String): Either[Drone_Battery_Charge_Supervisor.BatterySample_Payload, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorBatterySample_Payload(parser: Parser): Drone_Battery_Charge_Supervisor.BatterySample_Payload = {
      val r = parser.parseDrone_Battery_Charge_SupervisorBatterySample_Payload()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_SupervisorBatterySample_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorChargerSample(o: Drone_Battery_Charge_Supervisor.ChargerSample, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_SupervisorChargerSample(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_SupervisorChargerSample(s: String): Either[Drone_Battery_Charge_Supervisor.ChargerSample, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorChargerSample(parser: Parser): Drone_Battery_Charge_Supervisor.ChargerSample = {
      val r = parser.parseDrone_Battery_Charge_SupervisorChargerSample()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_SupervisorChargerSample _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorChargerSample_Payload(o: Drone_Battery_Charge_Supervisor.ChargerSample_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_SupervisorChargerSample_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_SupervisorChargerSample_Payload(s: String): Either[Drone_Battery_Charge_Supervisor.ChargerSample_Payload, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorChargerSample_Payload(parser: Parser): Drone_Battery_Charge_Supervisor.ChargerSample_Payload = {
      val r = parser.parseDrone_Battery_Charge_SupervisorChargerSample_Payload()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_SupervisorChargerSample_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorFlightActivitySample(o: Drone_Battery_Charge_Supervisor.FlightActivitySample, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_SupervisorFlightActivitySample(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_SupervisorFlightActivitySample(s: String): Either[Drone_Battery_Charge_Supervisor.FlightActivitySample, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorFlightActivitySample(parser: Parser): Drone_Battery_Charge_Supervisor.FlightActivitySample = {
      val r = parser.parseDrone_Battery_Charge_SupervisorFlightActivitySample()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_SupervisorFlightActivitySample _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorFlightActivitySample_Payload(o: Drone_Battery_Charge_Supervisor.FlightActivitySample_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_SupervisorFlightActivitySample_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_SupervisorFlightActivitySample_Payload(s: String): Either[Drone_Battery_Charge_Supervisor.FlightActivitySample_Payload, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorFlightActivitySample_Payload(parser: Parser): Drone_Battery_Charge_Supervisor.FlightActivitySample_Payload = {
      val r = parser.parseDrone_Battery_Charge_SupervisorFlightActivitySample_Payload()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_SupervisorFlightActivitySample_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorChargeIntentSample(o: Drone_Battery_Charge_Supervisor.ChargeIntentSample, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_SupervisorChargeIntentSample(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_SupervisorChargeIntentSample(s: String): Either[Drone_Battery_Charge_Supervisor.ChargeIntentSample, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorChargeIntentSample(parser: Parser): Drone_Battery_Charge_Supervisor.ChargeIntentSample = {
      val r = parser.parseDrone_Battery_Charge_SupervisorChargeIntentSample()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_SupervisorChargeIntentSample _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorChargeIntentSample_Payload(o: Drone_Battery_Charge_Supervisor.ChargeIntentSample_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_SupervisorChargeIntentSample_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_SupervisorChargeIntentSample_Payload(s: String): Either[Drone_Battery_Charge_Supervisor.ChargeIntentSample_Payload, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorChargeIntentSample_Payload(parser: Parser): Drone_Battery_Charge_Supervisor.ChargeIntentSample_Payload = {
      val r = parser.parseDrone_Battery_Charge_SupervisorChargeIntentSample_Payload()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_SupervisorChargeIntentSample_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorChargeDecision(o: Drone_Battery_Charge_Supervisor.ChargeDecision, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_SupervisorChargeDecision(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_SupervisorChargeDecision(s: String): Either[Drone_Battery_Charge_Supervisor.ChargeDecision, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorChargeDecision(parser: Parser): Drone_Battery_Charge_Supervisor.ChargeDecision = {
      val r = parser.parseDrone_Battery_Charge_SupervisorChargeDecision()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_SupervisorChargeDecision _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorChargeDecision_Payload(o: Drone_Battery_Charge_Supervisor.ChargeDecision_Payload, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_SupervisorChargeDecision_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_SupervisorChargeDecision_Payload(s: String): Either[Drone_Battery_Charge_Supervisor.ChargeDecision_Payload, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorChargeDecision_Payload(parser: Parser): Drone_Battery_Charge_Supervisor.ChargeDecision_Payload = {
      val r = parser.parseDrone_Battery_Charge_SupervisorChargeDecision_Payload()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_SupervisorChargeDecision_Payload _)
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

  def fromDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container(o: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container(s: String): Either[Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container(parser: Parser): Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container = {
      val r = parser.parseDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P(o: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P(s: String): Either[Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P(parser: Parser): Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P = {
      val r = parser.parseDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS(o: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS(s: String): Either[Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS(parser: Parser): Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS = {
      val r = parser.parseDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container(o: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container(s: String): Either[Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container(parser: Parser): Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container = {
      val r = parser.parseDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P(o: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P(s: String): Either[Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P(parser: Parser): Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P = {
      val r = parser.parseDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS(o: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS(s: String): Either[Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS(parser: Parser): Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS = {
      val r = parser.parseDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container(o: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container(s: String): Either[Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container(parser: Parser): Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container = {
      val r = parser.parseDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P(o: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P(s: String): Either[Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P(parser: Parser): Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P = {
      val r = parser.parseDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS(o: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS(s: String): Either[Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS(parser: Parser): Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS = {
      val r = parser.parseDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container(o: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container(s: String): Either[Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container(parser: Parser): Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container = {
      val r = parser.parseDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P(o: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P(s: String): Either[Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P(parser: Parser): Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P = {
      val r = parser.parseDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS(o: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS(s: String): Either[Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS(parser: Parser): Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS = {
      val r = parser.parseDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container(o: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container(s: String): Either[Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container(parser: Parser): Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container = {
      val r = parser.parseDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P(o: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P(s: String): Either[Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P(parser: Parser): Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P = {
      val r = parser.parseDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS(o: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS(s: String): Either[Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS(parser: Parser): Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS = {
      val r = parser.parseDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container(o: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container(s: String): Either[Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container(parser: Parser): Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container = {
      val r = parser.parseDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P(o: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P(s: String): Either[Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P(parser: Parser): Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P = {
      val r = parser.parseDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS(o: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS(s: String): Either[Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS(parser: Parser): Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS = {
      val r = parser.parseDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container(o: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container(s: String): Either[Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container(parser: Parser): Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container = {
      val r = parser.parseDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P(o: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P(s: String): Either[Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P(parser: Parser): Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P = {
      val r = parser.parseDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS(o: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS(s: String): Either[Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS(parser: Parser): Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS = {
      val r = parser.parseDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container(o: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container(s: String): Either[Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container(parser: Parser): Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container = {
      val r = parser.parseDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P(o: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P(s: String): Either[Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P(parser: Parser): Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P = {
      val r = parser.parseDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS(o: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS(s: String): Either[Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS(parser: Parser): Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS = {
      val r = parser.parseDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container(o: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container(s: String): Either[Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container(parser: Parser): Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container = {
      val r = parser.parseDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P(o: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P(s: String): Either[Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P(parser: Parser): Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P = {
      val r = parser.parseDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS(o: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS(s: String): Either[Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS(parser: Parser): Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS = {
      val r = parser.parseDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container(o: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container(s: String): Either[Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container(parser: Parser): Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container = {
      val r = parser.parseDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P(o: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P(s: String): Either[Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P(parser: Parser): Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P = {
      val r = parser.parseDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS(o: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS(s: String): Either[Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS(parser: Parser): Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS = {
      val r = parser.parseDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container(o: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container(s: String): Either[Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container(parser: Parser): Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container = {
      val r = parser.parseDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P(o: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P(s: String): Either[Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P(parser: Parser): Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P = {
      val r = parser.parseDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS(o: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS(s: String): Either[Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS(parser: Parser): Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS = {
      val r = parser.parseDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container(o: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container(s: String): Either[Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container(parser: Parser): Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container = {
      val r = parser.parseDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P(o: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P(s: String): Either[Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P(parser: Parser): Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P = {
      val r = parser.parseDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS(o: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS(s: String): Either[Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS, Json.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS(parser: Parser): Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS = {
      val r = parser.parseDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS()
      return r
    }
    val r = to(s, fDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS _)
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