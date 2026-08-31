// #Sireum
// @formatter:off

// This file is auto-generated from BatteryIndication.scala, InputStatus.scala, BatteryEvidence.scala, ChargerAvailability.scala, FlightActivity.scala, ChargeContext.scala, ChargeIntent.scala, QualifiedChargeIntent.scala, ChargeAuthorization.scala, ChargeDisposition.scala, BatteryAttention.scala, BatteryReadinessEvidence.scala, RecoveryPhase.scala, BatterySample.scala, ChargerSample.scala, FlightActivitySample.scala, ChargeIntentSample.scala, ChargeDecision.scala, Base_Types.scala, Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_Containers.scala, Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_Containers.scala, Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_Containers.scala, Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_Containers.scala, Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_Containers.scala, Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package drone_battery_charge_supervisor

import org.sireum._

object MsgPack {

  object Constants {

    val Drone_Battery_Charge_SupervisorBatteryIndication_Payload: Z = -32

    val Drone_Battery_Charge_SupervisorInputStatus_Payload: Z = -31

    val Drone_Battery_Charge_SupervisorBatteryEvidence_Payload: Z = -30

    val Drone_Battery_Charge_SupervisorChargerAvailability_Payload: Z = -29

    val Drone_Battery_Charge_SupervisorFlightActivity_Payload: Z = -28

    val Drone_Battery_Charge_SupervisorChargeContext_Payload: Z = -27

    val Drone_Battery_Charge_SupervisorChargeIntent_Payload: Z = -26

    val Drone_Battery_Charge_SupervisorQualifiedChargeIntent_Payload: Z = -25

    val Drone_Battery_Charge_SupervisorChargeAuthorization_Payload: Z = -24

    val Drone_Battery_Charge_SupervisorChargeDisposition_Payload: Z = -23

    val Drone_Battery_Charge_SupervisorBatteryAttention_Payload: Z = -22

    val Drone_Battery_Charge_SupervisorBatteryReadinessEvidence_Payload: Z = -21

    val Drone_Battery_Charge_SupervisorRecoveryPhase_Payload: Z = -20

    val Drone_Battery_Charge_SupervisorBatterySample: Z = -19

    val Drone_Battery_Charge_SupervisorBatterySample_Payload: Z = -18

    val Drone_Battery_Charge_SupervisorChargerSample: Z = -17

    val Drone_Battery_Charge_SupervisorChargerSample_Payload: Z = -16

    val Drone_Battery_Charge_SupervisorFlightActivitySample: Z = -15

    val Drone_Battery_Charge_SupervisorFlightActivitySample_Payload: Z = -14

    val Drone_Battery_Charge_SupervisorChargeIntentSample: Z = -13

    val Drone_Battery_Charge_SupervisorChargeIntentSample_Payload: Z = -12

    val Drone_Battery_Charge_SupervisorChargeDecision: Z = -11

    val Drone_Battery_Charge_SupervisorChargeDecision_Payload: Z = -10

    val Base_TypesBoolean_Payload: Z = -9

    val Base_TypesInteger_Payload: Z = -8

    val Base_TypesInteger_8_Payload: Z = -7

    val Base_TypesInteger_16_Payload: Z = -6

    val Base_TypesInteger_32_Payload: Z = -5

    val Base_TypesInteger_64_Payload: Z = -4

    val Base_TypesUnsigned_8_Payload: Z = -3

    val Base_TypesUnsigned_16_Payload: Z = -2

    val Base_TypesUnsigned_32_Payload: Z = -1

    val Base_TypesUnsigned_64_Payload: Z = 0

    val Base_TypesFloat_Payload: Z = 1

    val Base_TypesFloat_32_Payload: Z = 2

    val Base_TypesFloat_64_Payload: Z = 3

    val Base_TypesCharacter_Payload: Z = 4

    val Base_TypesString_Payload: Z = 5

    val Base_TypesBits_Payload: Z = 6

    val Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P: Z = 7

    val Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS: Z = 8

    val Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P: Z = 9

    val Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS: Z = 10

    val Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P: Z = 11

    val Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS: Z = 12

    val Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P: Z = 13

    val Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS: Z = 14

    val Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P: Z = 15

    val Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS: Z = 16

    val Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P: Z = 17

    val Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS: Z = 18

    val Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P: Z = 19

    val Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS: Z = 20

    val Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P: Z = 21

    val Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS: Z = 22

    val Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P: Z = 23

    val Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS: Z = 24

    val Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P: Z = 25

    val Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS: Z = 26

    val Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P: Z = 27

    val Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS: Z = 28

    val Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P: Z = 29

    val Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS: Z = 30

    val utilEmptyContainer: Z = 31

    val _artEmpty: Z = 32

  }

  object Writer {

    @record class Default(val writer: MessagePack.Writer.Impl) extends Writer

  }

  @msig trait Writer {

    def writer: MessagePack.Writer

    def writeDrone_Battery_Charge_SupervisorBatteryIndicationType(o: Drone_Battery_Charge_Supervisor.BatteryIndication.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Battery_Charge_SupervisorBatteryIndication_Payload(o: Drone_Battery_Charge_Supervisor.BatteryIndication_Payload): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_SupervisorBatteryIndication_Payload)
      writeDrone_Battery_Charge_SupervisorBatteryIndicationType(o.value)
    }

    def writeDrone_Battery_Charge_SupervisorInputStatusType(o: Drone_Battery_Charge_Supervisor.InputStatus.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Battery_Charge_SupervisorInputStatus_Payload(o: Drone_Battery_Charge_Supervisor.InputStatus_Payload): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_SupervisorInputStatus_Payload)
      writeDrone_Battery_Charge_SupervisorInputStatusType(o.value)
    }

    def writeDrone_Battery_Charge_SupervisorBatteryEvidenceType(o: Drone_Battery_Charge_Supervisor.BatteryEvidence.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Battery_Charge_SupervisorBatteryEvidence_Payload(o: Drone_Battery_Charge_Supervisor.BatteryEvidence_Payload): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_SupervisorBatteryEvidence_Payload)
      writeDrone_Battery_Charge_SupervisorBatteryEvidenceType(o.value)
    }

    def writeDrone_Battery_Charge_SupervisorChargerAvailabilityType(o: Drone_Battery_Charge_Supervisor.ChargerAvailability.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Battery_Charge_SupervisorChargerAvailability_Payload(o: Drone_Battery_Charge_Supervisor.ChargerAvailability_Payload): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_SupervisorChargerAvailability_Payload)
      writeDrone_Battery_Charge_SupervisorChargerAvailabilityType(o.value)
    }

    def writeDrone_Battery_Charge_SupervisorFlightActivityType(o: Drone_Battery_Charge_Supervisor.FlightActivity.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Battery_Charge_SupervisorFlightActivity_Payload(o: Drone_Battery_Charge_Supervisor.FlightActivity_Payload): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_SupervisorFlightActivity_Payload)
      writeDrone_Battery_Charge_SupervisorFlightActivityType(o.value)
    }

    def writeDrone_Battery_Charge_SupervisorChargeContextType(o: Drone_Battery_Charge_Supervisor.ChargeContext.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Battery_Charge_SupervisorChargeContext_Payload(o: Drone_Battery_Charge_Supervisor.ChargeContext_Payload): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_SupervisorChargeContext_Payload)
      writeDrone_Battery_Charge_SupervisorChargeContextType(o.value)
    }

    def writeDrone_Battery_Charge_SupervisorChargeIntentType(o: Drone_Battery_Charge_Supervisor.ChargeIntent.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Battery_Charge_SupervisorChargeIntent_Payload(o: Drone_Battery_Charge_Supervisor.ChargeIntent_Payload): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_SupervisorChargeIntent_Payload)
      writeDrone_Battery_Charge_SupervisorChargeIntentType(o.value)
    }

    def writeDrone_Battery_Charge_SupervisorQualifiedChargeIntentType(o: Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Battery_Charge_SupervisorQualifiedChargeIntent_Payload(o: Drone_Battery_Charge_Supervisor.QualifiedChargeIntent_Payload): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_SupervisorQualifiedChargeIntent_Payload)
      writeDrone_Battery_Charge_SupervisorQualifiedChargeIntentType(o.value)
    }

    def writeDrone_Battery_Charge_SupervisorChargeAuthorizationType(o: Drone_Battery_Charge_Supervisor.ChargeAuthorization.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Battery_Charge_SupervisorChargeAuthorization_Payload(o: Drone_Battery_Charge_Supervisor.ChargeAuthorization_Payload): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_SupervisorChargeAuthorization_Payload)
      writeDrone_Battery_Charge_SupervisorChargeAuthorizationType(o.value)
    }

    def writeDrone_Battery_Charge_SupervisorChargeDispositionType(o: Drone_Battery_Charge_Supervisor.ChargeDisposition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Battery_Charge_SupervisorChargeDisposition_Payload(o: Drone_Battery_Charge_Supervisor.ChargeDisposition_Payload): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_SupervisorChargeDisposition_Payload)
      writeDrone_Battery_Charge_SupervisorChargeDispositionType(o.value)
    }

    def writeDrone_Battery_Charge_SupervisorBatteryAttentionType(o: Drone_Battery_Charge_Supervisor.BatteryAttention.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Battery_Charge_SupervisorBatteryAttention_Payload(o: Drone_Battery_Charge_Supervisor.BatteryAttention_Payload): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_SupervisorBatteryAttention_Payload)
      writeDrone_Battery_Charge_SupervisorBatteryAttentionType(o.value)
    }

    def writeDrone_Battery_Charge_SupervisorBatteryReadinessEvidenceType(o: Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Battery_Charge_SupervisorBatteryReadinessEvidence_Payload(o: Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence_Payload): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_SupervisorBatteryReadinessEvidence_Payload)
      writeDrone_Battery_Charge_SupervisorBatteryReadinessEvidenceType(o.value)
    }

    def writeDrone_Battery_Charge_SupervisorRecoveryPhaseType(o: Drone_Battery_Charge_Supervisor.RecoveryPhase.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDrone_Battery_Charge_SupervisorRecoveryPhase_Payload(o: Drone_Battery_Charge_Supervisor.RecoveryPhase_Payload): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_SupervisorRecoveryPhase_Payload)
      writeDrone_Battery_Charge_SupervisorRecoveryPhaseType(o.value)
    }

    def writeDrone_Battery_Charge_SupervisorBatterySample(o: Drone_Battery_Charge_Supervisor.BatterySample): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_SupervisorBatterySample)
      writeDrone_Battery_Charge_SupervisorBatteryIndicationType(o.indication)
      writeDrone_Battery_Charge_SupervisorInputStatusType(o.status)
    }

    def writeDrone_Battery_Charge_SupervisorBatterySample_Payload(o: Drone_Battery_Charge_Supervisor.BatterySample_Payload): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_SupervisorBatterySample_Payload)
      writeDrone_Battery_Charge_SupervisorBatterySample(o.value)
    }

    def writeDrone_Battery_Charge_SupervisorChargerSample(o: Drone_Battery_Charge_Supervisor.ChargerSample): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_SupervisorChargerSample)
      writeDrone_Battery_Charge_SupervisorChargerAvailabilityType(o.availability)
      writeDrone_Battery_Charge_SupervisorInputStatusType(o.status)
    }

    def writeDrone_Battery_Charge_SupervisorChargerSample_Payload(o: Drone_Battery_Charge_Supervisor.ChargerSample_Payload): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_SupervisorChargerSample_Payload)
      writeDrone_Battery_Charge_SupervisorChargerSample(o.value)
    }

    def writeDrone_Battery_Charge_SupervisorFlightActivitySample(o: Drone_Battery_Charge_Supervisor.FlightActivitySample): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_SupervisorFlightActivitySample)
      writeDrone_Battery_Charge_SupervisorFlightActivityType(o.activity)
      writeDrone_Battery_Charge_SupervisorInputStatusType(o.status)
    }

    def writeDrone_Battery_Charge_SupervisorFlightActivitySample_Payload(o: Drone_Battery_Charge_Supervisor.FlightActivitySample_Payload): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_SupervisorFlightActivitySample_Payload)
      writeDrone_Battery_Charge_SupervisorFlightActivitySample(o.value)
    }

    def writeDrone_Battery_Charge_SupervisorChargeIntentSample(o: Drone_Battery_Charge_Supervisor.ChargeIntentSample): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_SupervisorChargeIntentSample)
      writeDrone_Battery_Charge_SupervisorChargeIntentType(o.intent)
      writeDrone_Battery_Charge_SupervisorInputStatusType(o.status)
    }

    def writeDrone_Battery_Charge_SupervisorChargeIntentSample_Payload(o: Drone_Battery_Charge_Supervisor.ChargeIntentSample_Payload): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_SupervisorChargeIntentSample_Payload)
      writeDrone_Battery_Charge_SupervisorChargeIntentSample(o.value)
    }

    def writeDrone_Battery_Charge_SupervisorChargeDecision(o: Drone_Battery_Charge_Supervisor.ChargeDecision): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_SupervisorChargeDecision)
      writeDrone_Battery_Charge_SupervisorChargeAuthorizationType(o.authorization)
      writeDrone_Battery_Charge_SupervisorChargeDispositionType(o.disposition)
    }

    def writeDrone_Battery_Charge_SupervisorChargeDecision_Payload(o: Drone_Battery_Charge_Supervisor.ChargeDecision_Payload): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_SupervisorChargeDecision_Payload)
      writeDrone_Battery_Charge_SupervisorChargeDecision(o.value)
    }

    def writeBase_TypesBoolean_Payload(o: Base_Types.Boolean_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesBoolean_Payload)
      writer.writeB(o.value)
    }

    def writeBase_TypesInteger_Payload(o: Base_Types.Integer_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_Payload)
      writer.writeZ(o.value)
    }

    def writeBase_TypesInteger_8_Payload(o: Base_Types.Integer_8_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_8_Payload)
      writer.writeS8(o.value)
    }

    def writeBase_TypesInteger_16_Payload(o: Base_Types.Integer_16_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_16_Payload)
      writer.writeS16(o.value)
    }

    def writeBase_TypesInteger_32_Payload(o: Base_Types.Integer_32_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_32_Payload)
      writer.writeS32(o.value)
    }

    def writeBase_TypesInteger_64_Payload(o: Base_Types.Integer_64_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_64_Payload)
      writer.writeS64(o.value)
    }

    def writeBase_TypesUnsigned_8_Payload(o: Base_Types.Unsigned_8_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesUnsigned_8_Payload)
      writer.writeU8(o.value)
    }

    def writeBase_TypesUnsigned_16_Payload(o: Base_Types.Unsigned_16_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesUnsigned_16_Payload)
      writer.writeU16(o.value)
    }

    def writeBase_TypesUnsigned_32_Payload(o: Base_Types.Unsigned_32_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesUnsigned_32_Payload)
      writer.writeU32(o.value)
    }

    def writeBase_TypesUnsigned_64_Payload(o: Base_Types.Unsigned_64_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesUnsigned_64_Payload)
      writer.writeU64(o.value)
    }

    def writeBase_TypesFloat_Payload(o: Base_Types.Float_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesFloat_Payload)
      writer.writeR(o.value)
    }

    def writeBase_TypesFloat_32_Payload(o: Base_Types.Float_32_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesFloat_32_Payload)
      writer.writeF32(o.value)
    }

    def writeBase_TypesFloat_64_Payload(o: Base_Types.Float_64_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesFloat_64_Payload)
      writer.writeF64(o.value)
    }

    def writeBase_TypesCharacter_Payload(o: Base_Types.Character_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesCharacter_Payload)
      writer.writeC(o.value)
    }

    def writeBase_TypesString_Payload(o: Base_Types.String_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesString_Payload)
      writer.writeString(o.value)
    }

    def writeBase_TypesBits_Payload(o: Base_Types.Bits_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesBits_Payload)
      writer.writeISZ(o.value, writer.writeB _)
    }

    def writeDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container(o: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container): Unit = {
      o match {
        case o: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P => writeDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS => writeDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS(o)
      }
    }

    def writeDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P(o: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P)
      writeDrone_Battery_Charge_SupervisorBatterySample(o.api_battery_sample)
    }

    def writeDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS(o: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS)
      writeDrone_Battery_Charge_SupervisorBatterySample(o.api_battery_sample)
    }

    def writeDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container(o: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container): Unit = {
      o match {
        case o: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P => writeDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS => writeDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS(o)
      }
    }

    def writeDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P(o: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P)
      writeDrone_Battery_Charge_SupervisorBatteryEvidenceType(o.api_evidence_to_attention)
      writeDrone_Battery_Charge_SupervisorBatteryEvidenceType(o.api_evidence_to_owner)
      writeDrone_Battery_Charge_SupervisorBatteryEvidenceType(o.api_evidence_to_readiness)
    }

    def writeDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS(o: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS)
      writeDrone_Battery_Charge_SupervisorBatteryEvidenceType(o.api_evidence_to_attention)
      writeDrone_Battery_Charge_SupervisorBatteryEvidenceType(o.api_evidence_to_owner)
      writeDrone_Battery_Charge_SupervisorBatteryEvidenceType(o.api_evidence_to_readiness)
    }

    def writeDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container(o: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container): Unit = {
      o match {
        case o: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P => writeDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS => writeDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS(o)
      }
    }

    def writeDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P(o: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P)
      writeDrone_Battery_Charge_SupervisorChargerSample(o.api_charger_sample)
      writeDrone_Battery_Charge_SupervisorFlightActivitySample(o.api_flight_sample)
    }

    def writeDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS(o: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS)
      writeDrone_Battery_Charge_SupervisorChargerSample(o.api_charger_sample)
      writeDrone_Battery_Charge_SupervisorFlightActivitySample(o.api_flight_sample)
    }

    def writeDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container(o: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container): Unit = {
      o match {
        case o: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P => writeDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS => writeDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS(o)
      }
    }

    def writeDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P(o: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P)
      writeDrone_Battery_Charge_SupervisorChargeContextType(o.api_charge_context)
    }

    def writeDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS(o: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS)
      writeDrone_Battery_Charge_SupervisorChargeContextType(o.api_charge_context)
    }

    def writeDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container(o: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container): Unit = {
      o match {
        case o: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P => writeDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS => writeDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS(o)
      }
    }

    def writeDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P(o: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P)
      writeDrone_Battery_Charge_SupervisorChargeIntentSample(o.api_intent_sample)
    }

    def writeDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS(o: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS)
      writeDrone_Battery_Charge_SupervisorChargeIntentSample(o.api_intent_sample)
    }

    def writeDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container(o: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container): Unit = {
      o match {
        case o: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P => writeDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS => writeDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS(o)
      }
    }

    def writeDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P(o: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P)
      writeDrone_Battery_Charge_SupervisorQualifiedChargeIntentType(o.api_qualified_intent)
    }

    def writeDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS(o: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS)
      writeDrone_Battery_Charge_SupervisorQualifiedChargeIntentType(o.api_qualified_intent)
    }

    def writeDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container(o: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container): Unit = {
      o match {
        case o: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P => writeDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS => writeDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS(o)
      }
    }

    def writeDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P(o: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P)
      writeDrone_Battery_Charge_SupervisorBatteryEvidenceType(o.api_battery_evidence)
      writeDrone_Battery_Charge_SupervisorChargeContextType(o.api_charge_context)
      writeDrone_Battery_Charge_SupervisorQualifiedChargeIntentType(o.api_qualified_intent)
    }

    def writeDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS(o: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS)
      writeDrone_Battery_Charge_SupervisorChargeAuthorizationType(o.In_authorizationState)
      writeDrone_Battery_Charge_SupervisorRecoveryPhaseType(o.In_recoveryPhase)
      writeDrone_Battery_Charge_SupervisorBatteryEvidenceType(o.api_battery_evidence)
      writeDrone_Battery_Charge_SupervisorChargeContextType(o.api_charge_context)
      writeDrone_Battery_Charge_SupervisorQualifiedChargeIntentType(o.api_qualified_intent)
    }

    def writeDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container(o: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container): Unit = {
      o match {
        case o: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P => writeDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS => writeDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS(o)
      }
    }

    def writeDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P(o: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P)
      writeDrone_Battery_Charge_SupervisorChargeAuthorizationType(o.api_authorization)
      writeDrone_Battery_Charge_SupervisorChargeDecision(o.api_decision_to_attention)
      writeDrone_Battery_Charge_SupervisorChargeDecision(o.api_decision_to_readiness)
    }

    def writeDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS(o: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS)
      writeDrone_Battery_Charge_SupervisorChargeAuthorizationType(o.authorizationState)
      writeDrone_Battery_Charge_SupervisorRecoveryPhaseType(o.recoveryPhase)
      writeDrone_Battery_Charge_SupervisorChargeAuthorizationType(o.api_authorization)
      writeDrone_Battery_Charge_SupervisorChargeDecision(o.api_decision_to_attention)
      writeDrone_Battery_Charge_SupervisorChargeDecision(o.api_decision_to_readiness)
    }

    def writeDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container(o: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container): Unit = {
      o match {
        case o: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P => writeDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS => writeDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS(o)
      }
    }

    def writeDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P(o: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P)
      writeDrone_Battery_Charge_SupervisorBatteryEvidenceType(o.api_battery_evidence)
      writeDrone_Battery_Charge_SupervisorChargeDecision(o.api_charge_decision)
    }

    def writeDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS(o: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS)
      writeDrone_Battery_Charge_SupervisorBatteryEvidenceType(o.api_battery_evidence)
      writeDrone_Battery_Charge_SupervisorChargeDecision(o.api_charge_decision)
    }

    def writeDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container(o: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container): Unit = {
      o match {
        case o: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P => writeDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS => writeDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS(o)
      }
    }

    def writeDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P(o: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P)
      writeDrone_Battery_Charge_SupervisorBatteryAttentionType(o.api_battery_attention)
    }

    def writeDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS(o: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS)
      writeDrone_Battery_Charge_SupervisorBatteryAttentionType(o.api_battery_attention)
    }

    def writeDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container(o: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container): Unit = {
      o match {
        case o: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P => writeDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS => writeDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS(o)
      }
    }

    def writeDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P(o: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P)
      writeDrone_Battery_Charge_SupervisorBatteryEvidenceType(o.api_battery_evidence)
      writeDrone_Battery_Charge_SupervisorChargeDecision(o.api_charge_decision)
    }

    def writeDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS(o: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS)
      writeDrone_Battery_Charge_SupervisorBatteryEvidenceType(o.api_battery_evidence)
      writeDrone_Battery_Charge_SupervisorChargeDecision(o.api_charge_decision)
    }

    def writeDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container(o: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container): Unit = {
      o match {
        case o: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P => writeDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS => writeDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS(o)
      }
    }

    def writeDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P(o: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P)
      writeDrone_Battery_Charge_SupervisorBatteryReadinessEvidenceType(o.api_readiness_evidence)
    }

    def writeDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS(o: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS)
      writeDrone_Battery_Charge_SupervisorBatteryReadinessEvidenceType(o.api_readiness_evidence)
    }

    def writeruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeutilContainer(o: util.Container): Unit = {
      o match {
        case o: util.EmptyContainer => writeutilEmptyContainer(o)
        case o: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P => writeDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P => writeDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS => writeDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS => writeDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P => writeDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS => writeDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS(o)
        case o: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P => writeDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS => writeDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS(o)
        case o: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P => writeDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS => writeDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P => writeDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS => writeDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS(o)
        case o: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P => writeDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS => writeDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P => writeDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS => writeDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS(o)
        case o: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P => writeDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS => writeDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P => writeDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS => writeDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS(o)
        case o: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P => writeDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS => writeDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P => writeDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS => writeDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS(o)
      }
    }

    def writeutilEmptyContainer(o: util.EmptyContainer): Unit = {
      writer.writeZ(Constants.utilEmptyContainer)
    }

    def write_artDataContent(o: art.DataContent): Unit = {
      o match {
        case o: art.Empty => write_artEmpty(o)
        case o: Base_Types.Boolean_Payload => writeBase_TypesBoolean_Payload(o)
        case o: Base_Types.Integer_Payload => writeBase_TypesInteger_Payload(o)
        case o: Base_Types.Integer_8_Payload => writeBase_TypesInteger_8_Payload(o)
        case o: Base_Types.Integer_16_Payload => writeBase_TypesInteger_16_Payload(o)
        case o: Base_Types.Integer_32_Payload => writeBase_TypesInteger_32_Payload(o)
        case o: Base_Types.Integer_64_Payload => writeBase_TypesInteger_64_Payload(o)
        case o: Base_Types.Unsigned_8_Payload => writeBase_TypesUnsigned_8_Payload(o)
        case o: Base_Types.Unsigned_16_Payload => writeBase_TypesUnsigned_16_Payload(o)
        case o: Base_Types.Unsigned_32_Payload => writeBase_TypesUnsigned_32_Payload(o)
        case o: Base_Types.Unsigned_64_Payload => writeBase_TypesUnsigned_64_Payload(o)
        case o: Base_Types.Float_Payload => writeBase_TypesFloat_Payload(o)
        case o: Base_Types.Float_32_Payload => writeBase_TypesFloat_32_Payload(o)
        case o: Base_Types.Float_64_Payload => writeBase_TypesFloat_64_Payload(o)
        case o: Base_Types.Character_Payload => writeBase_TypesCharacter_Payload(o)
        case o: Base_Types.String_Payload => writeBase_TypesString_Payload(o)
        case o: Base_Types.Bits_Payload => writeBase_TypesBits_Payload(o)
        case o: util.EmptyContainer => writeutilEmptyContainer(o)
        case o: Drone_Battery_Charge_Supervisor.InputStatus_Payload => writeDrone_Battery_Charge_SupervisorInputStatus_Payload(o)
        case o: Drone_Battery_Charge_Supervisor.ChargeIntent_Payload => writeDrone_Battery_Charge_SupervisorChargeIntent_Payload(o)
        case o: Drone_Battery_Charge_Supervisor.RecoveryPhase_Payload => writeDrone_Battery_Charge_SupervisorRecoveryPhase_Payload(o)
        case o: Drone_Battery_Charge_Supervisor.ChargeContext_Payload => writeDrone_Battery_Charge_SupervisorChargeContext_Payload(o)
        case o: Drone_Battery_Charge_Supervisor.BatterySample_Payload => writeDrone_Battery_Charge_SupervisorBatterySample_Payload(o)
        case o: Drone_Battery_Charge_Supervisor.ChargerSample_Payload => writeDrone_Battery_Charge_SupervisorChargerSample_Payload(o)
        case o: Drone_Battery_Charge_Supervisor.FlightActivity_Payload => writeDrone_Battery_Charge_SupervisorFlightActivity_Payload(o)
        case o: Drone_Battery_Charge_Supervisor.ChargeDecision_Payload => writeDrone_Battery_Charge_SupervisorChargeDecision_Payload(o)
        case o: Drone_Battery_Charge_Supervisor.BatteryEvidence_Payload => writeDrone_Battery_Charge_SupervisorBatteryEvidence_Payload(o)
        case o: Drone_Battery_Charge_Supervisor.BatteryAttention_Payload => writeDrone_Battery_Charge_SupervisorBatteryAttention_Payload(o)
        case o: Drone_Battery_Charge_Supervisor.BatteryIndication_Payload => writeDrone_Battery_Charge_SupervisorBatteryIndication_Payload(o)
        case o: Drone_Battery_Charge_Supervisor.ChargeDisposition_Payload => writeDrone_Battery_Charge_SupervisorChargeDisposition_Payload(o)
        case o: Drone_Battery_Charge_Supervisor.ChargeIntentSample_Payload => writeDrone_Battery_Charge_SupervisorChargeIntentSample_Payload(o)
        case o: Drone_Battery_Charge_Supervisor.ChargerAvailability_Payload => writeDrone_Battery_Charge_SupervisorChargerAvailability_Payload(o)
        case o: Drone_Battery_Charge_Supervisor.ChargeAuthorization_Payload => writeDrone_Battery_Charge_SupervisorChargeAuthorization_Payload(o)
        case o: Drone_Battery_Charge_Supervisor.FlightActivitySample_Payload => writeDrone_Battery_Charge_SupervisorFlightActivitySample_Payload(o)
        case o: Drone_Battery_Charge_Supervisor.QualifiedChargeIntent_Payload => writeDrone_Battery_Charge_SupervisorQualifiedChargeIntent_Payload(o)
        case o: Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence_Payload => writeDrone_Battery_Charge_SupervisorBatteryReadinessEvidence_Payload(o)
        case o: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P => writeDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P => writeDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS => writeDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS => writeDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P => writeDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS => writeDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS(o)
        case o: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P => writeDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS => writeDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS(o)
        case o: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P => writeDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS => writeDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P => writeDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS => writeDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS(o)
        case o: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P => writeDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS => writeDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P => writeDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS => writeDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS(o)
        case o: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P => writeDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS => writeDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P => writeDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS => writeDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS(o)
        case o: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P => writeDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS => writeDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS(o)
        case o: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P => writeDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P(o)
        case o: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS => writeDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS(o)
      }
    }

    def write_artEmpty(o: art.Empty): Unit = {
      writer.writeZ(Constants._artEmpty)
    }

    def result: ISZ[U8] = {
      return writer.result
    }

  }

  object Reader {

    @record class Default(val reader: MessagePack.Reader.Impl) extends Reader {
      def errorOpt: Option[MessagePack.ErrorMsg] = {
        return reader.errorOpt
      }
    }

  }

  @msig trait Reader {

    def reader: MessagePack.Reader

    def readDrone_Battery_Charge_SupervisorBatteryIndicationType(): Drone_Battery_Charge_Supervisor.BatteryIndication.Type = {
      val r = reader.readZ()
      return Drone_Battery_Charge_Supervisor.BatteryIndication.byOrdinal(r).get
    }

    def readDrone_Battery_Charge_SupervisorBatteryIndication_Payload(): Drone_Battery_Charge_Supervisor.BatteryIndication_Payload = {
      val r = readDrone_Battery_Charge_SupervisorBatteryIndication_PayloadT(F)
      return r
    }

    def readDrone_Battery_Charge_SupervisorBatteryIndication_PayloadT(typeParsed: B): Drone_Battery_Charge_Supervisor.BatteryIndication_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_SupervisorBatteryIndication_Payload)
      }
      val value = readDrone_Battery_Charge_SupervisorBatteryIndicationType()
      return Drone_Battery_Charge_Supervisor.BatteryIndication_Payload(value)
    }

    def readDrone_Battery_Charge_SupervisorInputStatusType(): Drone_Battery_Charge_Supervisor.InputStatus.Type = {
      val r = reader.readZ()
      return Drone_Battery_Charge_Supervisor.InputStatus.byOrdinal(r).get
    }

    def readDrone_Battery_Charge_SupervisorInputStatus_Payload(): Drone_Battery_Charge_Supervisor.InputStatus_Payload = {
      val r = readDrone_Battery_Charge_SupervisorInputStatus_PayloadT(F)
      return r
    }

    def readDrone_Battery_Charge_SupervisorInputStatus_PayloadT(typeParsed: B): Drone_Battery_Charge_Supervisor.InputStatus_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_SupervisorInputStatus_Payload)
      }
      val value = readDrone_Battery_Charge_SupervisorInputStatusType()
      return Drone_Battery_Charge_Supervisor.InputStatus_Payload(value)
    }

    def readDrone_Battery_Charge_SupervisorBatteryEvidenceType(): Drone_Battery_Charge_Supervisor.BatteryEvidence.Type = {
      val r = reader.readZ()
      return Drone_Battery_Charge_Supervisor.BatteryEvidence.byOrdinal(r).get
    }

    def readDrone_Battery_Charge_SupervisorBatteryEvidence_Payload(): Drone_Battery_Charge_Supervisor.BatteryEvidence_Payload = {
      val r = readDrone_Battery_Charge_SupervisorBatteryEvidence_PayloadT(F)
      return r
    }

    def readDrone_Battery_Charge_SupervisorBatteryEvidence_PayloadT(typeParsed: B): Drone_Battery_Charge_Supervisor.BatteryEvidence_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_SupervisorBatteryEvidence_Payload)
      }
      val value = readDrone_Battery_Charge_SupervisorBatteryEvidenceType()
      return Drone_Battery_Charge_Supervisor.BatteryEvidence_Payload(value)
    }

    def readDrone_Battery_Charge_SupervisorChargerAvailabilityType(): Drone_Battery_Charge_Supervisor.ChargerAvailability.Type = {
      val r = reader.readZ()
      return Drone_Battery_Charge_Supervisor.ChargerAvailability.byOrdinal(r).get
    }

    def readDrone_Battery_Charge_SupervisorChargerAvailability_Payload(): Drone_Battery_Charge_Supervisor.ChargerAvailability_Payload = {
      val r = readDrone_Battery_Charge_SupervisorChargerAvailability_PayloadT(F)
      return r
    }

    def readDrone_Battery_Charge_SupervisorChargerAvailability_PayloadT(typeParsed: B): Drone_Battery_Charge_Supervisor.ChargerAvailability_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_SupervisorChargerAvailability_Payload)
      }
      val value = readDrone_Battery_Charge_SupervisorChargerAvailabilityType()
      return Drone_Battery_Charge_Supervisor.ChargerAvailability_Payload(value)
    }

    def readDrone_Battery_Charge_SupervisorFlightActivityType(): Drone_Battery_Charge_Supervisor.FlightActivity.Type = {
      val r = reader.readZ()
      return Drone_Battery_Charge_Supervisor.FlightActivity.byOrdinal(r).get
    }

    def readDrone_Battery_Charge_SupervisorFlightActivity_Payload(): Drone_Battery_Charge_Supervisor.FlightActivity_Payload = {
      val r = readDrone_Battery_Charge_SupervisorFlightActivity_PayloadT(F)
      return r
    }

    def readDrone_Battery_Charge_SupervisorFlightActivity_PayloadT(typeParsed: B): Drone_Battery_Charge_Supervisor.FlightActivity_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_SupervisorFlightActivity_Payload)
      }
      val value = readDrone_Battery_Charge_SupervisorFlightActivityType()
      return Drone_Battery_Charge_Supervisor.FlightActivity_Payload(value)
    }

    def readDrone_Battery_Charge_SupervisorChargeContextType(): Drone_Battery_Charge_Supervisor.ChargeContext.Type = {
      val r = reader.readZ()
      return Drone_Battery_Charge_Supervisor.ChargeContext.byOrdinal(r).get
    }

    def readDrone_Battery_Charge_SupervisorChargeContext_Payload(): Drone_Battery_Charge_Supervisor.ChargeContext_Payload = {
      val r = readDrone_Battery_Charge_SupervisorChargeContext_PayloadT(F)
      return r
    }

    def readDrone_Battery_Charge_SupervisorChargeContext_PayloadT(typeParsed: B): Drone_Battery_Charge_Supervisor.ChargeContext_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_SupervisorChargeContext_Payload)
      }
      val value = readDrone_Battery_Charge_SupervisorChargeContextType()
      return Drone_Battery_Charge_Supervisor.ChargeContext_Payload(value)
    }

    def readDrone_Battery_Charge_SupervisorChargeIntentType(): Drone_Battery_Charge_Supervisor.ChargeIntent.Type = {
      val r = reader.readZ()
      return Drone_Battery_Charge_Supervisor.ChargeIntent.byOrdinal(r).get
    }

    def readDrone_Battery_Charge_SupervisorChargeIntent_Payload(): Drone_Battery_Charge_Supervisor.ChargeIntent_Payload = {
      val r = readDrone_Battery_Charge_SupervisorChargeIntent_PayloadT(F)
      return r
    }

    def readDrone_Battery_Charge_SupervisorChargeIntent_PayloadT(typeParsed: B): Drone_Battery_Charge_Supervisor.ChargeIntent_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_SupervisorChargeIntent_Payload)
      }
      val value = readDrone_Battery_Charge_SupervisorChargeIntentType()
      return Drone_Battery_Charge_Supervisor.ChargeIntent_Payload(value)
    }

    def readDrone_Battery_Charge_SupervisorQualifiedChargeIntentType(): Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.Type = {
      val r = reader.readZ()
      return Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.byOrdinal(r).get
    }

    def readDrone_Battery_Charge_SupervisorQualifiedChargeIntent_Payload(): Drone_Battery_Charge_Supervisor.QualifiedChargeIntent_Payload = {
      val r = readDrone_Battery_Charge_SupervisorQualifiedChargeIntent_PayloadT(F)
      return r
    }

    def readDrone_Battery_Charge_SupervisorQualifiedChargeIntent_PayloadT(typeParsed: B): Drone_Battery_Charge_Supervisor.QualifiedChargeIntent_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_SupervisorQualifiedChargeIntent_Payload)
      }
      val value = readDrone_Battery_Charge_SupervisorQualifiedChargeIntentType()
      return Drone_Battery_Charge_Supervisor.QualifiedChargeIntent_Payload(value)
    }

    def readDrone_Battery_Charge_SupervisorChargeAuthorizationType(): Drone_Battery_Charge_Supervisor.ChargeAuthorization.Type = {
      val r = reader.readZ()
      return Drone_Battery_Charge_Supervisor.ChargeAuthorization.byOrdinal(r).get
    }

    def readDrone_Battery_Charge_SupervisorChargeAuthorization_Payload(): Drone_Battery_Charge_Supervisor.ChargeAuthorization_Payload = {
      val r = readDrone_Battery_Charge_SupervisorChargeAuthorization_PayloadT(F)
      return r
    }

    def readDrone_Battery_Charge_SupervisorChargeAuthorization_PayloadT(typeParsed: B): Drone_Battery_Charge_Supervisor.ChargeAuthorization_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_SupervisorChargeAuthorization_Payload)
      }
      val value = readDrone_Battery_Charge_SupervisorChargeAuthorizationType()
      return Drone_Battery_Charge_Supervisor.ChargeAuthorization_Payload(value)
    }

    def readDrone_Battery_Charge_SupervisorChargeDispositionType(): Drone_Battery_Charge_Supervisor.ChargeDisposition.Type = {
      val r = reader.readZ()
      return Drone_Battery_Charge_Supervisor.ChargeDisposition.byOrdinal(r).get
    }

    def readDrone_Battery_Charge_SupervisorChargeDisposition_Payload(): Drone_Battery_Charge_Supervisor.ChargeDisposition_Payload = {
      val r = readDrone_Battery_Charge_SupervisorChargeDisposition_PayloadT(F)
      return r
    }

    def readDrone_Battery_Charge_SupervisorChargeDisposition_PayloadT(typeParsed: B): Drone_Battery_Charge_Supervisor.ChargeDisposition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_SupervisorChargeDisposition_Payload)
      }
      val value = readDrone_Battery_Charge_SupervisorChargeDispositionType()
      return Drone_Battery_Charge_Supervisor.ChargeDisposition_Payload(value)
    }

    def readDrone_Battery_Charge_SupervisorBatteryAttentionType(): Drone_Battery_Charge_Supervisor.BatteryAttention.Type = {
      val r = reader.readZ()
      return Drone_Battery_Charge_Supervisor.BatteryAttention.byOrdinal(r).get
    }

    def readDrone_Battery_Charge_SupervisorBatteryAttention_Payload(): Drone_Battery_Charge_Supervisor.BatteryAttention_Payload = {
      val r = readDrone_Battery_Charge_SupervisorBatteryAttention_PayloadT(F)
      return r
    }

    def readDrone_Battery_Charge_SupervisorBatteryAttention_PayloadT(typeParsed: B): Drone_Battery_Charge_Supervisor.BatteryAttention_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_SupervisorBatteryAttention_Payload)
      }
      val value = readDrone_Battery_Charge_SupervisorBatteryAttentionType()
      return Drone_Battery_Charge_Supervisor.BatteryAttention_Payload(value)
    }

    def readDrone_Battery_Charge_SupervisorBatteryReadinessEvidenceType(): Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence.Type = {
      val r = reader.readZ()
      return Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence.byOrdinal(r).get
    }

    def readDrone_Battery_Charge_SupervisorBatteryReadinessEvidence_Payload(): Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence_Payload = {
      val r = readDrone_Battery_Charge_SupervisorBatteryReadinessEvidence_PayloadT(F)
      return r
    }

    def readDrone_Battery_Charge_SupervisorBatteryReadinessEvidence_PayloadT(typeParsed: B): Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_SupervisorBatteryReadinessEvidence_Payload)
      }
      val value = readDrone_Battery_Charge_SupervisorBatteryReadinessEvidenceType()
      return Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence_Payload(value)
    }

    def readDrone_Battery_Charge_SupervisorRecoveryPhaseType(): Drone_Battery_Charge_Supervisor.RecoveryPhase.Type = {
      val r = reader.readZ()
      return Drone_Battery_Charge_Supervisor.RecoveryPhase.byOrdinal(r).get
    }

    def readDrone_Battery_Charge_SupervisorRecoveryPhase_Payload(): Drone_Battery_Charge_Supervisor.RecoveryPhase_Payload = {
      val r = readDrone_Battery_Charge_SupervisorRecoveryPhase_PayloadT(F)
      return r
    }

    def readDrone_Battery_Charge_SupervisorRecoveryPhase_PayloadT(typeParsed: B): Drone_Battery_Charge_Supervisor.RecoveryPhase_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_SupervisorRecoveryPhase_Payload)
      }
      val value = readDrone_Battery_Charge_SupervisorRecoveryPhaseType()
      return Drone_Battery_Charge_Supervisor.RecoveryPhase_Payload(value)
    }

    def readDrone_Battery_Charge_SupervisorBatterySample(): Drone_Battery_Charge_Supervisor.BatterySample = {
      val r = readDrone_Battery_Charge_SupervisorBatterySampleT(F)
      return r
    }

    def readDrone_Battery_Charge_SupervisorBatterySampleT(typeParsed: B): Drone_Battery_Charge_Supervisor.BatterySample = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_SupervisorBatterySample)
      }
      val indication = readDrone_Battery_Charge_SupervisorBatteryIndicationType()
      val status = readDrone_Battery_Charge_SupervisorInputStatusType()
      return Drone_Battery_Charge_Supervisor.BatterySample(indication, status)
    }

    def readDrone_Battery_Charge_SupervisorBatterySample_Payload(): Drone_Battery_Charge_Supervisor.BatterySample_Payload = {
      val r = readDrone_Battery_Charge_SupervisorBatterySample_PayloadT(F)
      return r
    }

    def readDrone_Battery_Charge_SupervisorBatterySample_PayloadT(typeParsed: B): Drone_Battery_Charge_Supervisor.BatterySample_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_SupervisorBatterySample_Payload)
      }
      val value = readDrone_Battery_Charge_SupervisorBatterySample()
      return Drone_Battery_Charge_Supervisor.BatterySample_Payload(value)
    }

    def readDrone_Battery_Charge_SupervisorChargerSample(): Drone_Battery_Charge_Supervisor.ChargerSample = {
      val r = readDrone_Battery_Charge_SupervisorChargerSampleT(F)
      return r
    }

    def readDrone_Battery_Charge_SupervisorChargerSampleT(typeParsed: B): Drone_Battery_Charge_Supervisor.ChargerSample = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_SupervisorChargerSample)
      }
      val availability = readDrone_Battery_Charge_SupervisorChargerAvailabilityType()
      val status = readDrone_Battery_Charge_SupervisorInputStatusType()
      return Drone_Battery_Charge_Supervisor.ChargerSample(availability, status)
    }

    def readDrone_Battery_Charge_SupervisorChargerSample_Payload(): Drone_Battery_Charge_Supervisor.ChargerSample_Payload = {
      val r = readDrone_Battery_Charge_SupervisorChargerSample_PayloadT(F)
      return r
    }

    def readDrone_Battery_Charge_SupervisorChargerSample_PayloadT(typeParsed: B): Drone_Battery_Charge_Supervisor.ChargerSample_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_SupervisorChargerSample_Payload)
      }
      val value = readDrone_Battery_Charge_SupervisorChargerSample()
      return Drone_Battery_Charge_Supervisor.ChargerSample_Payload(value)
    }

    def readDrone_Battery_Charge_SupervisorFlightActivitySample(): Drone_Battery_Charge_Supervisor.FlightActivitySample = {
      val r = readDrone_Battery_Charge_SupervisorFlightActivitySampleT(F)
      return r
    }

    def readDrone_Battery_Charge_SupervisorFlightActivitySampleT(typeParsed: B): Drone_Battery_Charge_Supervisor.FlightActivitySample = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_SupervisorFlightActivitySample)
      }
      val activity = readDrone_Battery_Charge_SupervisorFlightActivityType()
      val status = readDrone_Battery_Charge_SupervisorInputStatusType()
      return Drone_Battery_Charge_Supervisor.FlightActivitySample(activity, status)
    }

    def readDrone_Battery_Charge_SupervisorFlightActivitySample_Payload(): Drone_Battery_Charge_Supervisor.FlightActivitySample_Payload = {
      val r = readDrone_Battery_Charge_SupervisorFlightActivitySample_PayloadT(F)
      return r
    }

    def readDrone_Battery_Charge_SupervisorFlightActivitySample_PayloadT(typeParsed: B): Drone_Battery_Charge_Supervisor.FlightActivitySample_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_SupervisorFlightActivitySample_Payload)
      }
      val value = readDrone_Battery_Charge_SupervisorFlightActivitySample()
      return Drone_Battery_Charge_Supervisor.FlightActivitySample_Payload(value)
    }

    def readDrone_Battery_Charge_SupervisorChargeIntentSample(): Drone_Battery_Charge_Supervisor.ChargeIntentSample = {
      val r = readDrone_Battery_Charge_SupervisorChargeIntentSampleT(F)
      return r
    }

    def readDrone_Battery_Charge_SupervisorChargeIntentSampleT(typeParsed: B): Drone_Battery_Charge_Supervisor.ChargeIntentSample = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_SupervisorChargeIntentSample)
      }
      val intent = readDrone_Battery_Charge_SupervisorChargeIntentType()
      val status = readDrone_Battery_Charge_SupervisorInputStatusType()
      return Drone_Battery_Charge_Supervisor.ChargeIntentSample(intent, status)
    }

    def readDrone_Battery_Charge_SupervisorChargeIntentSample_Payload(): Drone_Battery_Charge_Supervisor.ChargeIntentSample_Payload = {
      val r = readDrone_Battery_Charge_SupervisorChargeIntentSample_PayloadT(F)
      return r
    }

    def readDrone_Battery_Charge_SupervisorChargeIntentSample_PayloadT(typeParsed: B): Drone_Battery_Charge_Supervisor.ChargeIntentSample_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_SupervisorChargeIntentSample_Payload)
      }
      val value = readDrone_Battery_Charge_SupervisorChargeIntentSample()
      return Drone_Battery_Charge_Supervisor.ChargeIntentSample_Payload(value)
    }

    def readDrone_Battery_Charge_SupervisorChargeDecision(): Drone_Battery_Charge_Supervisor.ChargeDecision = {
      val r = readDrone_Battery_Charge_SupervisorChargeDecisionT(F)
      return r
    }

    def readDrone_Battery_Charge_SupervisorChargeDecisionT(typeParsed: B): Drone_Battery_Charge_Supervisor.ChargeDecision = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_SupervisorChargeDecision)
      }
      val authorization = readDrone_Battery_Charge_SupervisorChargeAuthorizationType()
      val disposition = readDrone_Battery_Charge_SupervisorChargeDispositionType()
      return Drone_Battery_Charge_Supervisor.ChargeDecision(authorization, disposition)
    }

    def readDrone_Battery_Charge_SupervisorChargeDecision_Payload(): Drone_Battery_Charge_Supervisor.ChargeDecision_Payload = {
      val r = readDrone_Battery_Charge_SupervisorChargeDecision_PayloadT(F)
      return r
    }

    def readDrone_Battery_Charge_SupervisorChargeDecision_PayloadT(typeParsed: B): Drone_Battery_Charge_Supervisor.ChargeDecision_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_SupervisorChargeDecision_Payload)
      }
      val value = readDrone_Battery_Charge_SupervisorChargeDecision()
      return Drone_Battery_Charge_Supervisor.ChargeDecision_Payload(value)
    }

    def readBase_TypesBoolean_Payload(): Base_Types.Boolean_Payload = {
      val r = readBase_TypesBoolean_PayloadT(F)
      return r
    }

    def readBase_TypesBoolean_PayloadT(typeParsed: B): Base_Types.Boolean_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesBoolean_Payload)
      }
      val value = reader.readB()
      return Base_Types.Boolean_Payload(value)
    }

    def readBase_TypesInteger_Payload(): Base_Types.Integer_Payload = {
      val r = readBase_TypesInteger_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_PayloadT(typeParsed: B): Base_Types.Integer_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_Payload)
      }
      val value = reader.readZ()
      return Base_Types.Integer_Payload(value)
    }

    def readBase_TypesInteger_8_Payload(): Base_Types.Integer_8_Payload = {
      val r = readBase_TypesInteger_8_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_8_PayloadT(typeParsed: B): Base_Types.Integer_8_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_8_Payload)
      }
      val value = reader.readS8()
      return Base_Types.Integer_8_Payload(value)
    }

    def readBase_TypesInteger_16_Payload(): Base_Types.Integer_16_Payload = {
      val r = readBase_TypesInteger_16_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_16_PayloadT(typeParsed: B): Base_Types.Integer_16_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_16_Payload)
      }
      val value = reader.readS16()
      return Base_Types.Integer_16_Payload(value)
    }

    def readBase_TypesInteger_32_Payload(): Base_Types.Integer_32_Payload = {
      val r = readBase_TypesInteger_32_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_32_PayloadT(typeParsed: B): Base_Types.Integer_32_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_32_Payload)
      }
      val value = reader.readS32()
      return Base_Types.Integer_32_Payload(value)
    }

    def readBase_TypesInteger_64_Payload(): Base_Types.Integer_64_Payload = {
      val r = readBase_TypesInteger_64_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_64_PayloadT(typeParsed: B): Base_Types.Integer_64_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_64_Payload)
      }
      val value = reader.readS64()
      return Base_Types.Integer_64_Payload(value)
    }

    def readBase_TypesUnsigned_8_Payload(): Base_Types.Unsigned_8_Payload = {
      val r = readBase_TypesUnsigned_8_PayloadT(F)
      return r
    }

    def readBase_TypesUnsigned_8_PayloadT(typeParsed: B): Base_Types.Unsigned_8_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesUnsigned_8_Payload)
      }
      val value = reader.readU8()
      return Base_Types.Unsigned_8_Payload(value)
    }

    def readBase_TypesUnsigned_16_Payload(): Base_Types.Unsigned_16_Payload = {
      val r = readBase_TypesUnsigned_16_PayloadT(F)
      return r
    }

    def readBase_TypesUnsigned_16_PayloadT(typeParsed: B): Base_Types.Unsigned_16_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesUnsigned_16_Payload)
      }
      val value = reader.readU16()
      return Base_Types.Unsigned_16_Payload(value)
    }

    def readBase_TypesUnsigned_32_Payload(): Base_Types.Unsigned_32_Payload = {
      val r = readBase_TypesUnsigned_32_PayloadT(F)
      return r
    }

    def readBase_TypesUnsigned_32_PayloadT(typeParsed: B): Base_Types.Unsigned_32_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesUnsigned_32_Payload)
      }
      val value = reader.readU32()
      return Base_Types.Unsigned_32_Payload(value)
    }

    def readBase_TypesUnsigned_64_Payload(): Base_Types.Unsigned_64_Payload = {
      val r = readBase_TypesUnsigned_64_PayloadT(F)
      return r
    }

    def readBase_TypesUnsigned_64_PayloadT(typeParsed: B): Base_Types.Unsigned_64_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesUnsigned_64_Payload)
      }
      val value = reader.readU64()
      return Base_Types.Unsigned_64_Payload(value)
    }

    def readBase_TypesFloat_Payload(): Base_Types.Float_Payload = {
      val r = readBase_TypesFloat_PayloadT(F)
      return r
    }

    def readBase_TypesFloat_PayloadT(typeParsed: B): Base_Types.Float_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesFloat_Payload)
      }
      val value = reader.readR()
      return Base_Types.Float_Payload(value)
    }

    def readBase_TypesFloat_32_Payload(): Base_Types.Float_32_Payload = {
      val r = readBase_TypesFloat_32_PayloadT(F)
      return r
    }

    def readBase_TypesFloat_32_PayloadT(typeParsed: B): Base_Types.Float_32_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesFloat_32_Payload)
      }
      val value = reader.readF32()
      return Base_Types.Float_32_Payload(value)
    }

    def readBase_TypesFloat_64_Payload(): Base_Types.Float_64_Payload = {
      val r = readBase_TypesFloat_64_PayloadT(F)
      return r
    }

    def readBase_TypesFloat_64_PayloadT(typeParsed: B): Base_Types.Float_64_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesFloat_64_Payload)
      }
      val value = reader.readF64()
      return Base_Types.Float_64_Payload(value)
    }

    def readBase_TypesCharacter_Payload(): Base_Types.Character_Payload = {
      val r = readBase_TypesCharacter_PayloadT(F)
      return r
    }

    def readBase_TypesCharacter_PayloadT(typeParsed: B): Base_Types.Character_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesCharacter_Payload)
      }
      val value = reader.readC()
      return Base_Types.Character_Payload(value)
    }

    def readBase_TypesString_Payload(): Base_Types.String_Payload = {
      val r = readBase_TypesString_PayloadT(F)
      return r
    }

    def readBase_TypesString_PayloadT(typeParsed: B): Base_Types.String_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesString_Payload)
      }
      val value = reader.readString()
      return Base_Types.String_Payload(value)
    }

    def readBase_TypesBits_Payload(): Base_Types.Bits_Payload = {
      val r = readBase_TypesBits_PayloadT(F)
      return r
    }

    def readBase_TypesBits_PayloadT(typeParsed: B): Base_Types.Bits_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesBits_Payload)
      }
      val value = reader.readISZ(reader.readB _)
      return Base_Types.Bits_Payload(value)
    }

    def readDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container(): Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P => val r = readDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS => val r = readDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container.")
          val r = readDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PST(T)
          return r
      }
    }

    def readDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P(): Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P = {
      val r = readDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PT(F)
      return r
    }

    def readDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PT(typeParsed: B): Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P)
      }
      val api_battery_sample = readDrone_Battery_Charge_SupervisorBatterySample()
      return Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P(api_battery_sample)
    }

    def readDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS(): Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS = {
      val r = readDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PST(F)
      return r
    }

    def readDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PST(typeParsed: B): Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS)
      }
      val api_battery_sample = readDrone_Battery_Charge_SupervisorBatterySample()
      return Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS(api_battery_sample)
    }

    def readDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container(): Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P => val r = readDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS => val r = readDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container.")
          val r = readDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PST(T)
          return r
      }
    }

    def readDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P(): Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P = {
      val r = readDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PT(F)
      return r
    }

    def readDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PT(typeParsed: B): Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P)
      }
      val api_evidence_to_attention = readDrone_Battery_Charge_SupervisorBatteryEvidenceType()
      val api_evidence_to_owner = readDrone_Battery_Charge_SupervisorBatteryEvidenceType()
      val api_evidence_to_readiness = readDrone_Battery_Charge_SupervisorBatteryEvidenceType()
      return Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P(api_evidence_to_attention, api_evidence_to_owner, api_evidence_to_readiness)
    }

    def readDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS(): Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS = {
      val r = readDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PST(F)
      return r
    }

    def readDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PST(typeParsed: B): Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS)
      }
      val api_evidence_to_attention = readDrone_Battery_Charge_SupervisorBatteryEvidenceType()
      val api_evidence_to_owner = readDrone_Battery_Charge_SupervisorBatteryEvidenceType()
      val api_evidence_to_readiness = readDrone_Battery_Charge_SupervisorBatteryEvidenceType()
      return Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS(api_evidence_to_attention, api_evidence_to_owner, api_evidence_to_readiness)
    }

    def readDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container(): Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P => val r = readDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS => val r = readDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container.")
          val r = readDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PST(T)
          return r
      }
    }

    def readDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P(): Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P = {
      val r = readDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PT(F)
      return r
    }

    def readDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PT(typeParsed: B): Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P)
      }
      val api_charger_sample = readDrone_Battery_Charge_SupervisorChargerSample()
      val api_flight_sample = readDrone_Battery_Charge_SupervisorFlightActivitySample()
      return Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P(api_charger_sample, api_flight_sample)
    }

    def readDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS(): Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS = {
      val r = readDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PST(F)
      return r
    }

    def readDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PST(typeParsed: B): Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS)
      }
      val api_charger_sample = readDrone_Battery_Charge_SupervisorChargerSample()
      val api_flight_sample = readDrone_Battery_Charge_SupervisorFlightActivitySample()
      return Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS(api_charger_sample, api_flight_sample)
    }

    def readDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container(): Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P => val r = readDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS => val r = readDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container.")
          val r = readDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PST(T)
          return r
      }
    }

    def readDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P(): Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P = {
      val r = readDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PT(F)
      return r
    }

    def readDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PT(typeParsed: B): Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P)
      }
      val api_charge_context = readDrone_Battery_Charge_SupervisorChargeContextType()
      return Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P(api_charge_context)
    }

    def readDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS(): Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS = {
      val r = readDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PST(F)
      return r
    }

    def readDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PST(typeParsed: B): Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS)
      }
      val api_charge_context = readDrone_Battery_Charge_SupervisorChargeContextType()
      return Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS(api_charge_context)
    }

    def readDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container(): Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P => val r = readDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS => val r = readDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container.")
          val r = readDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PST(T)
          return r
      }
    }

    def readDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P(): Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P = {
      val r = readDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PT(F)
      return r
    }

    def readDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PT(typeParsed: B): Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P)
      }
      val api_intent_sample = readDrone_Battery_Charge_SupervisorChargeIntentSample()
      return Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P(api_intent_sample)
    }

    def readDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS(): Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS = {
      val r = readDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PST(F)
      return r
    }

    def readDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PST(typeParsed: B): Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS)
      }
      val api_intent_sample = readDrone_Battery_Charge_SupervisorChargeIntentSample()
      return Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS(api_intent_sample)
    }

    def readDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container(): Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P => val r = readDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS => val r = readDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container.")
          val r = readDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PST(T)
          return r
      }
    }

    def readDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P(): Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P = {
      val r = readDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PT(F)
      return r
    }

    def readDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PT(typeParsed: B): Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P)
      }
      val api_qualified_intent = readDrone_Battery_Charge_SupervisorQualifiedChargeIntentType()
      return Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P(api_qualified_intent)
    }

    def readDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS(): Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS = {
      val r = readDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PST(F)
      return r
    }

    def readDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PST(typeParsed: B): Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS)
      }
      val api_qualified_intent = readDrone_Battery_Charge_SupervisorQualifiedChargeIntentType()
      return Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS(api_qualified_intent)
    }

    def readDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container(): Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P => val r = readDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS => val r = readDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container.")
          val r = readDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PST(T)
          return r
      }
    }

    def readDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P(): Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P = {
      val r = readDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PT(F)
      return r
    }

    def readDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PT(typeParsed: B): Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P)
      }
      val api_battery_evidence = readDrone_Battery_Charge_SupervisorBatteryEvidenceType()
      val api_charge_context = readDrone_Battery_Charge_SupervisorChargeContextType()
      val api_qualified_intent = readDrone_Battery_Charge_SupervisorQualifiedChargeIntentType()
      return Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P(api_battery_evidence, api_charge_context, api_qualified_intent)
    }

    def readDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS(): Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS = {
      val r = readDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PST(F)
      return r
    }

    def readDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PST(typeParsed: B): Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS)
      }
      val In_authorizationState = readDrone_Battery_Charge_SupervisorChargeAuthorizationType()
      val In_recoveryPhase = readDrone_Battery_Charge_SupervisorRecoveryPhaseType()
      val api_battery_evidence = readDrone_Battery_Charge_SupervisorBatteryEvidenceType()
      val api_charge_context = readDrone_Battery_Charge_SupervisorChargeContextType()
      val api_qualified_intent = readDrone_Battery_Charge_SupervisorQualifiedChargeIntentType()
      return Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS(In_authorizationState, In_recoveryPhase, api_battery_evidence, api_charge_context, api_qualified_intent)
    }

    def readDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container(): Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P => val r = readDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS => val r = readDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container.")
          val r = readDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PST(T)
          return r
      }
    }

    def readDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P(): Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P = {
      val r = readDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PT(F)
      return r
    }

    def readDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PT(typeParsed: B): Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P)
      }
      val api_authorization = readDrone_Battery_Charge_SupervisorChargeAuthorizationType()
      val api_decision_to_attention = readDrone_Battery_Charge_SupervisorChargeDecision()
      val api_decision_to_readiness = readDrone_Battery_Charge_SupervisorChargeDecision()
      return Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P(api_authorization, api_decision_to_attention, api_decision_to_readiness)
    }

    def readDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS(): Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS = {
      val r = readDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PST(F)
      return r
    }

    def readDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PST(typeParsed: B): Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS)
      }
      val authorizationState = readDrone_Battery_Charge_SupervisorChargeAuthorizationType()
      val recoveryPhase = readDrone_Battery_Charge_SupervisorRecoveryPhaseType()
      val api_authorization = readDrone_Battery_Charge_SupervisorChargeAuthorizationType()
      val api_decision_to_attention = readDrone_Battery_Charge_SupervisorChargeDecision()
      val api_decision_to_readiness = readDrone_Battery_Charge_SupervisorChargeDecision()
      return Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS(authorizationState, recoveryPhase, api_authorization, api_decision_to_attention, api_decision_to_readiness)
    }

    def readDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container(): Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P => val r = readDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS => val r = readDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container.")
          val r = readDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PST(T)
          return r
      }
    }

    def readDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P(): Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P = {
      val r = readDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PT(F)
      return r
    }

    def readDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PT(typeParsed: B): Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P)
      }
      val api_battery_evidence = readDrone_Battery_Charge_SupervisorBatteryEvidenceType()
      val api_charge_decision = readDrone_Battery_Charge_SupervisorChargeDecision()
      return Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P(api_battery_evidence, api_charge_decision)
    }

    def readDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS(): Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS = {
      val r = readDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PST(F)
      return r
    }

    def readDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PST(typeParsed: B): Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS)
      }
      val api_battery_evidence = readDrone_Battery_Charge_SupervisorBatteryEvidenceType()
      val api_charge_decision = readDrone_Battery_Charge_SupervisorChargeDecision()
      return Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS(api_battery_evidence, api_charge_decision)
    }

    def readDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container(): Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P => val r = readDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS => val r = readDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container.")
          val r = readDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PST(T)
          return r
      }
    }

    def readDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P(): Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P = {
      val r = readDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PT(F)
      return r
    }

    def readDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PT(typeParsed: B): Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P)
      }
      val api_battery_attention = readDrone_Battery_Charge_SupervisorBatteryAttentionType()
      return Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P(api_battery_attention)
    }

    def readDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS(): Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS = {
      val r = readDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PST(F)
      return r
    }

    def readDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PST(typeParsed: B): Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS)
      }
      val api_battery_attention = readDrone_Battery_Charge_SupervisorBatteryAttentionType()
      return Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS(api_battery_attention)
    }

    def readDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container(): Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P => val r = readDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS => val r = readDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container.")
          val r = readDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PST(T)
          return r
      }
    }

    def readDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P(): Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P = {
      val r = readDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PT(F)
      return r
    }

    def readDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PT(typeParsed: B): Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P)
      }
      val api_battery_evidence = readDrone_Battery_Charge_SupervisorBatteryEvidenceType()
      val api_charge_decision = readDrone_Battery_Charge_SupervisorChargeDecision()
      return Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P(api_battery_evidence, api_charge_decision)
    }

    def readDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS(): Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS = {
      val r = readDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PST(F)
      return r
    }

    def readDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PST(typeParsed: B): Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS)
      }
      val api_battery_evidence = readDrone_Battery_Charge_SupervisorBatteryEvidenceType()
      val api_charge_decision = readDrone_Battery_Charge_SupervisorChargeDecision()
      return Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS(api_battery_evidence, api_charge_decision)
    }

    def readDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container(): Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P => val r = readDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS => val r = readDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container.")
          val r = readDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PST(T)
          return r
      }
    }

    def readDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P(): Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P = {
      val r = readDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PT(F)
      return r
    }

    def readDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PT(typeParsed: B): Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P)
      }
      val api_readiness_evidence = readDrone_Battery_Charge_SupervisorBatteryReadinessEvidenceType()
      return Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P(api_readiness_evidence)
    }

    def readDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS(): Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS = {
      val r = readDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PST(F)
      return r
    }

    def readDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PST(typeParsed: B): Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS)
      }
      val api_readiness_evidence = readDrone_Battery_Charge_SupervisorBatteryReadinessEvidenceType()
      return Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS(api_readiness_evidence)
    }

    def readruntimemonitorObservationKindType(): runtimemonitor.ObservationKind.Type = {
      val r = reader.readZ()
      return runtimemonitor.ObservationKind.byOrdinal(r).get
    }

    def readutilContainer(): util.Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.utilEmptyContainer => val r = readutilEmptyContainerT(T); return r
        case Constants.Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P => val r = readDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P => val r = readDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS => val r = readDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS => val r = readDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P => val r = readDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS => val r = readDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P => val r = readDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS => val r = readDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P => val r = readDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS => val r = readDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P => val r = readDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS => val r = readDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P => val r = readDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS => val r = readDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P => val r = readDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS => val r = readDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P => val r = readDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS => val r = readDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P => val r = readDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS => val r = readDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P => val r = readDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS => val r = readDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P => val r = readDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS => val r = readDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of util.Container.")
          val r = readDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PST(T)
          return r
      }
    }

    def readutilEmptyContainer(): util.EmptyContainer = {
      val r = readutilEmptyContainerT(F)
      return r
    }

    def readutilEmptyContainerT(typeParsed: B): util.EmptyContainer = {
      if (!typeParsed) {
        reader.expectZ(Constants.utilEmptyContainer)
      }
      return util.EmptyContainer()
    }

    def read_artDataContent(): art.DataContent = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants._artEmpty => val r = read_artEmptyT(T); return r
        case Constants.Base_TypesBoolean_Payload => val r = readBase_TypesBoolean_PayloadT(T); return r
        case Constants.Base_TypesInteger_Payload => val r = readBase_TypesInteger_PayloadT(T); return r
        case Constants.Base_TypesInteger_8_Payload => val r = readBase_TypesInteger_8_PayloadT(T); return r
        case Constants.Base_TypesInteger_16_Payload => val r = readBase_TypesInteger_16_PayloadT(T); return r
        case Constants.Base_TypesInteger_32_Payload => val r = readBase_TypesInteger_32_PayloadT(T); return r
        case Constants.Base_TypesInteger_64_Payload => val r = readBase_TypesInteger_64_PayloadT(T); return r
        case Constants.Base_TypesUnsigned_8_Payload => val r = readBase_TypesUnsigned_8_PayloadT(T); return r
        case Constants.Base_TypesUnsigned_16_Payload => val r = readBase_TypesUnsigned_16_PayloadT(T); return r
        case Constants.Base_TypesUnsigned_32_Payload => val r = readBase_TypesUnsigned_32_PayloadT(T); return r
        case Constants.Base_TypesUnsigned_64_Payload => val r = readBase_TypesUnsigned_64_PayloadT(T); return r
        case Constants.Base_TypesFloat_Payload => val r = readBase_TypesFloat_PayloadT(T); return r
        case Constants.Base_TypesFloat_32_Payload => val r = readBase_TypesFloat_32_PayloadT(T); return r
        case Constants.Base_TypesFloat_64_Payload => val r = readBase_TypesFloat_64_PayloadT(T); return r
        case Constants.Base_TypesCharacter_Payload => val r = readBase_TypesCharacter_PayloadT(T); return r
        case Constants.Base_TypesString_Payload => val r = readBase_TypesString_PayloadT(T); return r
        case Constants.Base_TypesBits_Payload => val r = readBase_TypesBits_PayloadT(T); return r
        case Constants.utilEmptyContainer => val r = readutilEmptyContainerT(T); return r
        case Constants.Drone_Battery_Charge_SupervisorInputStatus_Payload => val r = readDrone_Battery_Charge_SupervisorInputStatus_PayloadT(T); return r
        case Constants.Drone_Battery_Charge_SupervisorChargeIntent_Payload => val r = readDrone_Battery_Charge_SupervisorChargeIntent_PayloadT(T); return r
        case Constants.Drone_Battery_Charge_SupervisorRecoveryPhase_Payload => val r = readDrone_Battery_Charge_SupervisorRecoveryPhase_PayloadT(T); return r
        case Constants.Drone_Battery_Charge_SupervisorChargeContext_Payload => val r = readDrone_Battery_Charge_SupervisorChargeContext_PayloadT(T); return r
        case Constants.Drone_Battery_Charge_SupervisorBatterySample_Payload => val r = readDrone_Battery_Charge_SupervisorBatterySample_PayloadT(T); return r
        case Constants.Drone_Battery_Charge_SupervisorChargerSample_Payload => val r = readDrone_Battery_Charge_SupervisorChargerSample_PayloadT(T); return r
        case Constants.Drone_Battery_Charge_SupervisorFlightActivity_Payload => val r = readDrone_Battery_Charge_SupervisorFlightActivity_PayloadT(T); return r
        case Constants.Drone_Battery_Charge_SupervisorChargeDecision_Payload => val r = readDrone_Battery_Charge_SupervisorChargeDecision_PayloadT(T); return r
        case Constants.Drone_Battery_Charge_SupervisorBatteryEvidence_Payload => val r = readDrone_Battery_Charge_SupervisorBatteryEvidence_PayloadT(T); return r
        case Constants.Drone_Battery_Charge_SupervisorBatteryAttention_Payload => val r = readDrone_Battery_Charge_SupervisorBatteryAttention_PayloadT(T); return r
        case Constants.Drone_Battery_Charge_SupervisorBatteryIndication_Payload => val r = readDrone_Battery_Charge_SupervisorBatteryIndication_PayloadT(T); return r
        case Constants.Drone_Battery_Charge_SupervisorChargeDisposition_Payload => val r = readDrone_Battery_Charge_SupervisorChargeDisposition_PayloadT(T); return r
        case Constants.Drone_Battery_Charge_SupervisorChargeIntentSample_Payload => val r = readDrone_Battery_Charge_SupervisorChargeIntentSample_PayloadT(T); return r
        case Constants.Drone_Battery_Charge_SupervisorChargerAvailability_Payload => val r = readDrone_Battery_Charge_SupervisorChargerAvailability_PayloadT(T); return r
        case Constants.Drone_Battery_Charge_SupervisorChargeAuthorization_Payload => val r = readDrone_Battery_Charge_SupervisorChargeAuthorization_PayloadT(T); return r
        case Constants.Drone_Battery_Charge_SupervisorFlightActivitySample_Payload => val r = readDrone_Battery_Charge_SupervisorFlightActivitySample_PayloadT(T); return r
        case Constants.Drone_Battery_Charge_SupervisorQualifiedChargeIntent_Payload => val r = readDrone_Battery_Charge_SupervisorQualifiedChargeIntent_PayloadT(T); return r
        case Constants.Drone_Battery_Charge_SupervisorBatteryReadinessEvidence_Payload => val r = readDrone_Battery_Charge_SupervisorBatteryReadinessEvidence_PayloadT(T); return r
        case Constants.Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P => val r = readDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P => val r = readDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS => val r = readDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS => val r = readDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P => val r = readDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS => val r = readDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P => val r = readDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS => val r = readDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P => val r = readDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS => val r = readDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P => val r = readDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS => val r = readDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P => val r = readDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS => val r = readDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P => val r = readDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS => val r = readDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P => val r = readDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS => val r = readDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P => val r = readDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS => val r = readDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P => val r = readDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS => val r = readDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PST(T); return r
        case Constants.Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P => val r = readDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PT(T); return r
        case Constants.Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS => val r = readDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of art.DataContent.")
          val r = readDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PST(T)
          return r
      }
    }

    def read_artEmpty(): art.Empty = {
      val r = read_artEmptyT(F)
      return r
    }

    def read_artEmptyT(typeParsed: B): art.Empty = {
      if (!typeParsed) {
        reader.expectZ(Constants._artEmpty)
      }
      return art.Empty()
    }

  }

  def to[T](data: ISZ[U8], f: Reader => T): Either[T, MessagePack.ErrorMsg] = {
    val rd = Reader.Default(MessagePack.reader(data))
    rd.reader.init()
    val r = f(rd)
    rd.errorOpt match {
      case Some(e) => return Either.Right(e)
      case _ => return Either.Left(r)
    }
  }

  def fromDrone_Battery_Charge_SupervisorBatteryIndication_Payload(o: Drone_Battery_Charge_Supervisor.BatteryIndication_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_SupervisorBatteryIndication_Payload(o)
    return w.result
  }

  def toDrone_Battery_Charge_SupervisorBatteryIndication_Payload(data: ISZ[U8]): Either[Drone_Battery_Charge_Supervisor.BatteryIndication_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorBatteryIndication_Payload(reader: Reader): Drone_Battery_Charge_Supervisor.BatteryIndication_Payload = {
      val r = reader.readDrone_Battery_Charge_SupervisorBatteryIndication_Payload()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_SupervisorBatteryIndication_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorInputStatus_Payload(o: Drone_Battery_Charge_Supervisor.InputStatus_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_SupervisorInputStatus_Payload(o)
    return w.result
  }

  def toDrone_Battery_Charge_SupervisorInputStatus_Payload(data: ISZ[U8]): Either[Drone_Battery_Charge_Supervisor.InputStatus_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorInputStatus_Payload(reader: Reader): Drone_Battery_Charge_Supervisor.InputStatus_Payload = {
      val r = reader.readDrone_Battery_Charge_SupervisorInputStatus_Payload()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_SupervisorInputStatus_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorBatteryEvidence_Payload(o: Drone_Battery_Charge_Supervisor.BatteryEvidence_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_SupervisorBatteryEvidence_Payload(o)
    return w.result
  }

  def toDrone_Battery_Charge_SupervisorBatteryEvidence_Payload(data: ISZ[U8]): Either[Drone_Battery_Charge_Supervisor.BatteryEvidence_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorBatteryEvidence_Payload(reader: Reader): Drone_Battery_Charge_Supervisor.BatteryEvidence_Payload = {
      val r = reader.readDrone_Battery_Charge_SupervisorBatteryEvidence_Payload()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_SupervisorBatteryEvidence_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorChargerAvailability_Payload(o: Drone_Battery_Charge_Supervisor.ChargerAvailability_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_SupervisorChargerAvailability_Payload(o)
    return w.result
  }

  def toDrone_Battery_Charge_SupervisorChargerAvailability_Payload(data: ISZ[U8]): Either[Drone_Battery_Charge_Supervisor.ChargerAvailability_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorChargerAvailability_Payload(reader: Reader): Drone_Battery_Charge_Supervisor.ChargerAvailability_Payload = {
      val r = reader.readDrone_Battery_Charge_SupervisorChargerAvailability_Payload()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_SupervisorChargerAvailability_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorFlightActivity_Payload(o: Drone_Battery_Charge_Supervisor.FlightActivity_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_SupervisorFlightActivity_Payload(o)
    return w.result
  }

  def toDrone_Battery_Charge_SupervisorFlightActivity_Payload(data: ISZ[U8]): Either[Drone_Battery_Charge_Supervisor.FlightActivity_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorFlightActivity_Payload(reader: Reader): Drone_Battery_Charge_Supervisor.FlightActivity_Payload = {
      val r = reader.readDrone_Battery_Charge_SupervisorFlightActivity_Payload()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_SupervisorFlightActivity_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorChargeContext_Payload(o: Drone_Battery_Charge_Supervisor.ChargeContext_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_SupervisorChargeContext_Payload(o)
    return w.result
  }

  def toDrone_Battery_Charge_SupervisorChargeContext_Payload(data: ISZ[U8]): Either[Drone_Battery_Charge_Supervisor.ChargeContext_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorChargeContext_Payload(reader: Reader): Drone_Battery_Charge_Supervisor.ChargeContext_Payload = {
      val r = reader.readDrone_Battery_Charge_SupervisorChargeContext_Payload()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_SupervisorChargeContext_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorChargeIntent_Payload(o: Drone_Battery_Charge_Supervisor.ChargeIntent_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_SupervisorChargeIntent_Payload(o)
    return w.result
  }

  def toDrone_Battery_Charge_SupervisorChargeIntent_Payload(data: ISZ[U8]): Either[Drone_Battery_Charge_Supervisor.ChargeIntent_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorChargeIntent_Payload(reader: Reader): Drone_Battery_Charge_Supervisor.ChargeIntent_Payload = {
      val r = reader.readDrone_Battery_Charge_SupervisorChargeIntent_Payload()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_SupervisorChargeIntent_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorQualifiedChargeIntent_Payload(o: Drone_Battery_Charge_Supervisor.QualifiedChargeIntent_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_SupervisorQualifiedChargeIntent_Payload(o)
    return w.result
  }

  def toDrone_Battery_Charge_SupervisorQualifiedChargeIntent_Payload(data: ISZ[U8]): Either[Drone_Battery_Charge_Supervisor.QualifiedChargeIntent_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorQualifiedChargeIntent_Payload(reader: Reader): Drone_Battery_Charge_Supervisor.QualifiedChargeIntent_Payload = {
      val r = reader.readDrone_Battery_Charge_SupervisorQualifiedChargeIntent_Payload()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_SupervisorQualifiedChargeIntent_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorChargeAuthorization_Payload(o: Drone_Battery_Charge_Supervisor.ChargeAuthorization_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_SupervisorChargeAuthorization_Payload(o)
    return w.result
  }

  def toDrone_Battery_Charge_SupervisorChargeAuthorization_Payload(data: ISZ[U8]): Either[Drone_Battery_Charge_Supervisor.ChargeAuthorization_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorChargeAuthorization_Payload(reader: Reader): Drone_Battery_Charge_Supervisor.ChargeAuthorization_Payload = {
      val r = reader.readDrone_Battery_Charge_SupervisorChargeAuthorization_Payload()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_SupervisorChargeAuthorization_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorChargeDisposition_Payload(o: Drone_Battery_Charge_Supervisor.ChargeDisposition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_SupervisorChargeDisposition_Payload(o)
    return w.result
  }

  def toDrone_Battery_Charge_SupervisorChargeDisposition_Payload(data: ISZ[U8]): Either[Drone_Battery_Charge_Supervisor.ChargeDisposition_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorChargeDisposition_Payload(reader: Reader): Drone_Battery_Charge_Supervisor.ChargeDisposition_Payload = {
      val r = reader.readDrone_Battery_Charge_SupervisorChargeDisposition_Payload()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_SupervisorChargeDisposition_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorBatteryAttention_Payload(o: Drone_Battery_Charge_Supervisor.BatteryAttention_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_SupervisorBatteryAttention_Payload(o)
    return w.result
  }

  def toDrone_Battery_Charge_SupervisorBatteryAttention_Payload(data: ISZ[U8]): Either[Drone_Battery_Charge_Supervisor.BatteryAttention_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorBatteryAttention_Payload(reader: Reader): Drone_Battery_Charge_Supervisor.BatteryAttention_Payload = {
      val r = reader.readDrone_Battery_Charge_SupervisorBatteryAttention_Payload()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_SupervisorBatteryAttention_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorBatteryReadinessEvidence_Payload(o: Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_SupervisorBatteryReadinessEvidence_Payload(o)
    return w.result
  }

  def toDrone_Battery_Charge_SupervisorBatteryReadinessEvidence_Payload(data: ISZ[U8]): Either[Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorBatteryReadinessEvidence_Payload(reader: Reader): Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence_Payload = {
      val r = reader.readDrone_Battery_Charge_SupervisorBatteryReadinessEvidence_Payload()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_SupervisorBatteryReadinessEvidence_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorRecoveryPhase_Payload(o: Drone_Battery_Charge_Supervisor.RecoveryPhase_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_SupervisorRecoveryPhase_Payload(o)
    return w.result
  }

  def toDrone_Battery_Charge_SupervisorRecoveryPhase_Payload(data: ISZ[U8]): Either[Drone_Battery_Charge_Supervisor.RecoveryPhase_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorRecoveryPhase_Payload(reader: Reader): Drone_Battery_Charge_Supervisor.RecoveryPhase_Payload = {
      val r = reader.readDrone_Battery_Charge_SupervisorRecoveryPhase_Payload()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_SupervisorRecoveryPhase_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorBatterySample(o: Drone_Battery_Charge_Supervisor.BatterySample, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_SupervisorBatterySample(o)
    return w.result
  }

  def toDrone_Battery_Charge_SupervisorBatterySample(data: ISZ[U8]): Either[Drone_Battery_Charge_Supervisor.BatterySample, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorBatterySample(reader: Reader): Drone_Battery_Charge_Supervisor.BatterySample = {
      val r = reader.readDrone_Battery_Charge_SupervisorBatterySample()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_SupervisorBatterySample _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorBatterySample_Payload(o: Drone_Battery_Charge_Supervisor.BatterySample_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_SupervisorBatterySample_Payload(o)
    return w.result
  }

  def toDrone_Battery_Charge_SupervisorBatterySample_Payload(data: ISZ[U8]): Either[Drone_Battery_Charge_Supervisor.BatterySample_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorBatterySample_Payload(reader: Reader): Drone_Battery_Charge_Supervisor.BatterySample_Payload = {
      val r = reader.readDrone_Battery_Charge_SupervisorBatterySample_Payload()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_SupervisorBatterySample_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorChargerSample(o: Drone_Battery_Charge_Supervisor.ChargerSample, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_SupervisorChargerSample(o)
    return w.result
  }

  def toDrone_Battery_Charge_SupervisorChargerSample(data: ISZ[U8]): Either[Drone_Battery_Charge_Supervisor.ChargerSample, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorChargerSample(reader: Reader): Drone_Battery_Charge_Supervisor.ChargerSample = {
      val r = reader.readDrone_Battery_Charge_SupervisorChargerSample()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_SupervisorChargerSample _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorChargerSample_Payload(o: Drone_Battery_Charge_Supervisor.ChargerSample_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_SupervisorChargerSample_Payload(o)
    return w.result
  }

  def toDrone_Battery_Charge_SupervisorChargerSample_Payload(data: ISZ[U8]): Either[Drone_Battery_Charge_Supervisor.ChargerSample_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorChargerSample_Payload(reader: Reader): Drone_Battery_Charge_Supervisor.ChargerSample_Payload = {
      val r = reader.readDrone_Battery_Charge_SupervisorChargerSample_Payload()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_SupervisorChargerSample_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorFlightActivitySample(o: Drone_Battery_Charge_Supervisor.FlightActivitySample, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_SupervisorFlightActivitySample(o)
    return w.result
  }

  def toDrone_Battery_Charge_SupervisorFlightActivitySample(data: ISZ[U8]): Either[Drone_Battery_Charge_Supervisor.FlightActivitySample, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorFlightActivitySample(reader: Reader): Drone_Battery_Charge_Supervisor.FlightActivitySample = {
      val r = reader.readDrone_Battery_Charge_SupervisorFlightActivitySample()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_SupervisorFlightActivitySample _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorFlightActivitySample_Payload(o: Drone_Battery_Charge_Supervisor.FlightActivitySample_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_SupervisorFlightActivitySample_Payload(o)
    return w.result
  }

  def toDrone_Battery_Charge_SupervisorFlightActivitySample_Payload(data: ISZ[U8]): Either[Drone_Battery_Charge_Supervisor.FlightActivitySample_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorFlightActivitySample_Payload(reader: Reader): Drone_Battery_Charge_Supervisor.FlightActivitySample_Payload = {
      val r = reader.readDrone_Battery_Charge_SupervisorFlightActivitySample_Payload()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_SupervisorFlightActivitySample_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorChargeIntentSample(o: Drone_Battery_Charge_Supervisor.ChargeIntentSample, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_SupervisorChargeIntentSample(o)
    return w.result
  }

  def toDrone_Battery_Charge_SupervisorChargeIntentSample(data: ISZ[U8]): Either[Drone_Battery_Charge_Supervisor.ChargeIntentSample, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorChargeIntentSample(reader: Reader): Drone_Battery_Charge_Supervisor.ChargeIntentSample = {
      val r = reader.readDrone_Battery_Charge_SupervisorChargeIntentSample()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_SupervisorChargeIntentSample _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorChargeIntentSample_Payload(o: Drone_Battery_Charge_Supervisor.ChargeIntentSample_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_SupervisorChargeIntentSample_Payload(o)
    return w.result
  }

  def toDrone_Battery_Charge_SupervisorChargeIntentSample_Payload(data: ISZ[U8]): Either[Drone_Battery_Charge_Supervisor.ChargeIntentSample_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorChargeIntentSample_Payload(reader: Reader): Drone_Battery_Charge_Supervisor.ChargeIntentSample_Payload = {
      val r = reader.readDrone_Battery_Charge_SupervisorChargeIntentSample_Payload()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_SupervisorChargeIntentSample_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorChargeDecision(o: Drone_Battery_Charge_Supervisor.ChargeDecision, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_SupervisorChargeDecision(o)
    return w.result
  }

  def toDrone_Battery_Charge_SupervisorChargeDecision(data: ISZ[U8]): Either[Drone_Battery_Charge_Supervisor.ChargeDecision, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorChargeDecision(reader: Reader): Drone_Battery_Charge_Supervisor.ChargeDecision = {
      val r = reader.readDrone_Battery_Charge_SupervisorChargeDecision()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_SupervisorChargeDecision _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorChargeDecision_Payload(o: Drone_Battery_Charge_Supervisor.ChargeDecision_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_SupervisorChargeDecision_Payload(o)
    return w.result
  }

  def toDrone_Battery_Charge_SupervisorChargeDecision_Payload(data: ISZ[U8]): Either[Drone_Battery_Charge_Supervisor.ChargeDecision_Payload, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorChargeDecision_Payload(reader: Reader): Drone_Battery_Charge_Supervisor.ChargeDecision_Payload = {
      val r = reader.readDrone_Battery_Charge_SupervisorChargeDecision_Payload()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_SupervisorChargeDecision_Payload _)
    return r
  }

  def fromBase_TypesBoolean_Payload(o: Base_Types.Boolean_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesBoolean_Payload(o)
    return w.result
  }

  def toBase_TypesBoolean_Payload(data: ISZ[U8]): Either[Base_Types.Boolean_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesBoolean_Payload(reader: Reader): Base_Types.Boolean_Payload = {
      val r = reader.readBase_TypesBoolean_Payload()
      return r
    }
    val r = to(data, fBase_TypesBoolean_Payload _)
    return r
  }

  def fromBase_TypesInteger_Payload(o: Base_Types.Integer_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_Payload(data: ISZ[U8]): Either[Base_Types.Integer_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_Payload(reader: Reader): Base_Types.Integer_Payload = {
      val r = reader.readBase_TypesInteger_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_Payload _)
    return r
  }

  def fromBase_TypesInteger_8_Payload(o: Base_Types.Integer_8_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_8_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_8_Payload(data: ISZ[U8]): Either[Base_Types.Integer_8_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_8_Payload(reader: Reader): Base_Types.Integer_8_Payload = {
      val r = reader.readBase_TypesInteger_8_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_8_Payload _)
    return r
  }

  def fromBase_TypesInteger_16_Payload(o: Base_Types.Integer_16_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_16_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_16_Payload(data: ISZ[U8]): Either[Base_Types.Integer_16_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_16_Payload(reader: Reader): Base_Types.Integer_16_Payload = {
      val r = reader.readBase_TypesInteger_16_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_16_Payload _)
    return r
  }

  def fromBase_TypesInteger_32_Payload(o: Base_Types.Integer_32_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_32_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_32_Payload(data: ISZ[U8]): Either[Base_Types.Integer_32_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_32_Payload(reader: Reader): Base_Types.Integer_32_Payload = {
      val r = reader.readBase_TypesInteger_32_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_32_Payload _)
    return r
  }

  def fromBase_TypesInteger_64_Payload(o: Base_Types.Integer_64_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_64_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_64_Payload(data: ISZ[U8]): Either[Base_Types.Integer_64_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_64_Payload(reader: Reader): Base_Types.Integer_64_Payload = {
      val r = reader.readBase_TypesInteger_64_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_64_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_8_Payload(o: Base_Types.Unsigned_8_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesUnsigned_8_Payload(o)
    return w.result
  }

  def toBase_TypesUnsigned_8_Payload(data: ISZ[U8]): Either[Base_Types.Unsigned_8_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesUnsigned_8_Payload(reader: Reader): Base_Types.Unsigned_8_Payload = {
      val r = reader.readBase_TypesUnsigned_8_Payload()
      return r
    }
    val r = to(data, fBase_TypesUnsigned_8_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_16_Payload(o: Base_Types.Unsigned_16_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesUnsigned_16_Payload(o)
    return w.result
  }

  def toBase_TypesUnsigned_16_Payload(data: ISZ[U8]): Either[Base_Types.Unsigned_16_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesUnsigned_16_Payload(reader: Reader): Base_Types.Unsigned_16_Payload = {
      val r = reader.readBase_TypesUnsigned_16_Payload()
      return r
    }
    val r = to(data, fBase_TypesUnsigned_16_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_32_Payload(o: Base_Types.Unsigned_32_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesUnsigned_32_Payload(o)
    return w.result
  }

  def toBase_TypesUnsigned_32_Payload(data: ISZ[U8]): Either[Base_Types.Unsigned_32_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesUnsigned_32_Payload(reader: Reader): Base_Types.Unsigned_32_Payload = {
      val r = reader.readBase_TypesUnsigned_32_Payload()
      return r
    }
    val r = to(data, fBase_TypesUnsigned_32_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_64_Payload(o: Base_Types.Unsigned_64_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesUnsigned_64_Payload(o)
    return w.result
  }

  def toBase_TypesUnsigned_64_Payload(data: ISZ[U8]): Either[Base_Types.Unsigned_64_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesUnsigned_64_Payload(reader: Reader): Base_Types.Unsigned_64_Payload = {
      val r = reader.readBase_TypesUnsigned_64_Payload()
      return r
    }
    val r = to(data, fBase_TypesUnsigned_64_Payload _)
    return r
  }

  def fromBase_TypesFloat_Payload(o: Base_Types.Float_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesFloat_Payload(o)
    return w.result
  }

  def toBase_TypesFloat_Payload(data: ISZ[U8]): Either[Base_Types.Float_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesFloat_Payload(reader: Reader): Base_Types.Float_Payload = {
      val r = reader.readBase_TypesFloat_Payload()
      return r
    }
    val r = to(data, fBase_TypesFloat_Payload _)
    return r
  }

  def fromBase_TypesFloat_32_Payload(o: Base_Types.Float_32_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesFloat_32_Payload(o)
    return w.result
  }

  def toBase_TypesFloat_32_Payload(data: ISZ[U8]): Either[Base_Types.Float_32_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesFloat_32_Payload(reader: Reader): Base_Types.Float_32_Payload = {
      val r = reader.readBase_TypesFloat_32_Payload()
      return r
    }
    val r = to(data, fBase_TypesFloat_32_Payload _)
    return r
  }

  def fromBase_TypesFloat_64_Payload(o: Base_Types.Float_64_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesFloat_64_Payload(o)
    return w.result
  }

  def toBase_TypesFloat_64_Payload(data: ISZ[U8]): Either[Base_Types.Float_64_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesFloat_64_Payload(reader: Reader): Base_Types.Float_64_Payload = {
      val r = reader.readBase_TypesFloat_64_Payload()
      return r
    }
    val r = to(data, fBase_TypesFloat_64_Payload _)
    return r
  }

  def fromBase_TypesCharacter_Payload(o: Base_Types.Character_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesCharacter_Payload(o)
    return w.result
  }

  def toBase_TypesCharacter_Payload(data: ISZ[U8]): Either[Base_Types.Character_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesCharacter_Payload(reader: Reader): Base_Types.Character_Payload = {
      val r = reader.readBase_TypesCharacter_Payload()
      return r
    }
    val r = to(data, fBase_TypesCharacter_Payload _)
    return r
  }

  def fromBase_TypesString_Payload(o: Base_Types.String_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesString_Payload(o)
    return w.result
  }

  def toBase_TypesString_Payload(data: ISZ[U8]): Either[Base_Types.String_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesString_Payload(reader: Reader): Base_Types.String_Payload = {
      val r = reader.readBase_TypesString_Payload()
      return r
    }
    val r = to(data, fBase_TypesString_Payload _)
    return r
  }

  def fromBase_TypesBits_Payload(o: Base_Types.Bits_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesBits_Payload(o)
    return w.result
  }

  def toBase_TypesBits_Payload(data: ISZ[U8]): Either[Base_Types.Bits_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesBits_Payload(reader: Reader): Base_Types.Bits_Payload = {
      val r = reader.readBase_TypesBits_Payload()
      return r
    }
    val r = to(data, fBase_TypesBits_Payload _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container(o: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container(o)
    return w.result
  }

  def toDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container(data: ISZ[U8]): Either[Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container(reader: Reader): Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container = {
      val r = reader.readDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P(o: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P(o)
    return w.result
  }

  def toDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P(data: ISZ[U8]): Either[Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P(reader: Reader): Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P = {
      val r = reader.readDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS(o: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS(o)
    return w.result
  }

  def toDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS(data: ISZ[U8]): Either[Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS(reader: Reader): Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS = {
      val r = reader.readDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container(o: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container(o)
    return w.result
  }

  def toDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container(data: ISZ[U8]): Either[Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container(reader: Reader): Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container = {
      val r = reader.readDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P(o: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P(o)
    return w.result
  }

  def toDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P(data: ISZ[U8]): Either[Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P(reader: Reader): Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P = {
      val r = reader.readDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS(o: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS(o)
    return w.result
  }

  def toDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS(data: ISZ[U8]): Either[Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS(reader: Reader): Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS = {
      val r = reader.readDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container(o: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container(o)
    return w.result
  }

  def toDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container(data: ISZ[U8]): Either[Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container(reader: Reader): Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container = {
      val r = reader.readDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P(o: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P(o)
    return w.result
  }

  def toDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P(data: ISZ[U8]): Either[Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P(reader: Reader): Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P = {
      val r = reader.readDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS(o: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS(o)
    return w.result
  }

  def toDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS(data: ISZ[U8]): Either[Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS(reader: Reader): Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS = {
      val r = reader.readDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container(o: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container(o)
    return w.result
  }

  def toDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container(data: ISZ[U8]): Either[Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container(reader: Reader): Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container = {
      val r = reader.readDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P(o: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P(o)
    return w.result
  }

  def toDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P(data: ISZ[U8]): Either[Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P(reader: Reader): Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P = {
      val r = reader.readDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS(o: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS(o)
    return w.result
  }

  def toDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS(data: ISZ[U8]): Either[Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS(reader: Reader): Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS = {
      val r = reader.readDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container(o: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container(o)
    return w.result
  }

  def toDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container(data: ISZ[U8]): Either[Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container(reader: Reader): Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container = {
      val r = reader.readDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P(o: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P(o)
    return w.result
  }

  def toDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P(data: ISZ[U8]): Either[Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P(reader: Reader): Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P = {
      val r = reader.readDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS(o: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS(o)
    return w.result
  }

  def toDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS(data: ISZ[U8]): Either[Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS(reader: Reader): Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS = {
      val r = reader.readDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container(o: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container(o)
    return w.result
  }

  def toDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container(data: ISZ[U8]): Either[Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container(reader: Reader): Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container = {
      val r = reader.readDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P(o: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P(o)
    return w.result
  }

  def toDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P(data: ISZ[U8]): Either[Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P(reader: Reader): Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P = {
      val r = reader.readDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS(o: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS(o)
    return w.result
  }

  def toDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS(data: ISZ[U8]): Either[Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS(reader: Reader): Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS = {
      val r = reader.readDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container(o: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container(o)
    return w.result
  }

  def toDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container(data: ISZ[U8]): Either[Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container(reader: Reader): Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container = {
      val r = reader.readDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P(o: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P(o)
    return w.result
  }

  def toDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P(data: ISZ[U8]): Either[Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P(reader: Reader): Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P = {
      val r = reader.readDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS(o: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS(o)
    return w.result
  }

  def toDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS(data: ISZ[U8]): Either[Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS(reader: Reader): Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS = {
      val r = reader.readDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container(o: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container(o)
    return w.result
  }

  def toDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container(data: ISZ[U8]): Either[Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container(reader: Reader): Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container = {
      val r = reader.readDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P(o: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P(o)
    return w.result
  }

  def toDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P(data: ISZ[U8]): Either[Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P(reader: Reader): Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P = {
      val r = reader.readDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS(o: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS(o)
    return w.result
  }

  def toDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS(data: ISZ[U8]): Either[Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS(reader: Reader): Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS = {
      val r = reader.readDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container(o: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container(o)
    return w.result
  }

  def toDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container(data: ISZ[U8]): Either[Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container(reader: Reader): Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container = {
      val r = reader.readDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P(o: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P(o)
    return w.result
  }

  def toDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P(data: ISZ[U8]): Either[Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P(reader: Reader): Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P = {
      val r = reader.readDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS(o: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS(o)
    return w.result
  }

  def toDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS(data: ISZ[U8]): Either[Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS(reader: Reader): Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS = {
      val r = reader.readDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container(o: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container(o)
    return w.result
  }

  def toDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container(data: ISZ[U8]): Either[Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container(reader: Reader): Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container = {
      val r = reader.readDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P(o: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P(o)
    return w.result
  }

  def toDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P(data: ISZ[U8]): Either[Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P(reader: Reader): Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P = {
      val r = reader.readDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS(o: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS(o)
    return w.result
  }

  def toDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS(data: ISZ[U8]): Either[Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS(reader: Reader): Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS = {
      val r = reader.readDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container(o: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container(o)
    return w.result
  }

  def toDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container(data: ISZ[U8]): Either[Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container(reader: Reader): Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container = {
      val r = reader.readDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P(o: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P(o)
    return w.result
  }

  def toDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P(data: ISZ[U8]): Either[Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P(reader: Reader): Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P = {
      val r = reader.readDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS(o: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS(o)
    return w.result
  }

  def toDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS(data: ISZ[U8]): Either[Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS(reader: Reader): Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS = {
      val r = reader.readDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container(o: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container(o)
    return w.result
  }

  def toDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container(data: ISZ[U8]): Either[Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container(reader: Reader): Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container = {
      val r = reader.readDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P(o: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P(o)
    return w.result
  }

  def toDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P(data: ISZ[U8]): Either[Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P(reader: Reader): Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P = {
      val r = reader.readDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P _)
    return r
  }

  def fromDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS(o: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS(o)
    return w.result
  }

  def toDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS(data: ISZ[U8]): Either[Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS(reader: Reader): Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS = {
      val r = reader.readDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS()
      return r
    }
    val r = to(data, fDrone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS _)
    return r
  }

  def fromutilContainer(o: util.Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeutilContainer(o)
    return w.result
  }

  def toutilContainer(data: ISZ[U8]): Either[util.Container, MessagePack.ErrorMsg] = {
    def futilContainer(reader: Reader): util.Container = {
      val r = reader.readutilContainer()
      return r
    }
    val r = to(data, futilContainer _)
    return r
  }

  def fromutilEmptyContainer(o: util.EmptyContainer, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeutilEmptyContainer(o)
    return w.result
  }

  def toutilEmptyContainer(data: ISZ[U8]): Either[util.EmptyContainer, MessagePack.ErrorMsg] = {
    def futilEmptyContainer(reader: Reader): util.EmptyContainer = {
      val r = reader.readutilEmptyContainer()
      return r
    }
    val r = to(data, futilEmptyContainer _)
    return r
  }

  def from_artDataContent(o: art.DataContent, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_artDataContent(o)
    return w.result
  }

  def to_artDataContent(data: ISZ[U8]): Either[art.DataContent, MessagePack.ErrorMsg] = {
    def f_artDataContent(reader: Reader): art.DataContent = {
      val r = reader.read_artDataContent()
      return r
    }
    val r = to(data, f_artDataContent _)
    return r
  }

  def from_artEmpty(o: art.Empty, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_artEmpty(o)
    return w.result
  }

  def to_artEmpty(data: ISZ[U8]): Either[art.Empty, MessagePack.ErrorMsg] = {
    def f_artEmpty(reader: Reader): art.Empty = {
      val r = reader.read_artEmpty()
      return r
    }
    val r = to(data, f_artEmpty _)
    return r
  }

}