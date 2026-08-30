// #Sireum
// @formatter:off

// This file is auto-generated from BatteryCapacityBand.scala, BatteryCheck.scala, BatteryAssessment.scala, LifecycleContext.scala, ChargeContextQualification.scala, BatteryReadinessAdvice.scala, ChargerConnection.scala, ChargeActivity.scala, ChargerPathQualification.scala, ChargeSessionState.scala, ChargeEligibilityEnvelope.scala, ChargeRequest.scala, ChargeDecision.scala, SnapshotPreSessionState.scala, SnapshotNextSessionState.scala, SnapshotChargeDisposition.scala, ChargeReason.scala, ChargePermission.scala, FlightControlBatteryNotice.scala, PilotSessionState.scala, PilotChargeDisposition.scala, PilotAdvisory.scala, ChargeSessionSnapshot.scala, PilotBatteryStatus.scala, Base_Types.scala, BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_Containers.scala, ChargeContextQualifier_supervisorProcess_chargeContextQualifier_Containers.scala, ChargerPathQualifier_supervisorProcess_chargerPathQualifier_Containers.scala, ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_Containers.scala, ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_Containers.scala, ChargeSessionController_supervisorProcess_chargeSessionController_Containers.scala, FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_Containers.scala, PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package scp_candidate

import org.sireum._

object MsgPack {

  object Constants {

    val Battery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBand_Payload: Z = -32

    val Battery_Evidence_Charge_Qualification_SupervisorBatteryCheck_Payload: Z = -31

    val Battery_Evidence_Charge_Qualification_SupervisorBatteryAssessment_Payload: Z = -30

    val Battery_Evidence_Charge_Qualification_SupervisorLifecycleContext_Payload: Z = -29

    val Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualification_Payload: Z = -28

    val Battery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdvice_Payload: Z = -27

    val Battery_Evidence_Charge_Qualification_SupervisorChargerConnection_Payload: Z = -26

    val Battery_Evidence_Charge_Qualification_SupervisorChargeActivity_Payload: Z = -25

    val Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualification_Payload: Z = -24

    val Battery_Evidence_Charge_Qualification_SupervisorChargeSessionState_Payload: Z = -23

    val Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelope_Payload: Z = -22

    val Battery_Evidence_Charge_Qualification_SupervisorChargeRequest_Payload: Z = -21

    val Battery_Evidence_Charge_Qualification_SupervisorChargeDecision_Payload: Z = -20

    val Battery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionState_Payload: Z = -19

    val Battery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionState_Payload: Z = -18

    val Battery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDisposition_Payload: Z = -17

    val Battery_Evidence_Charge_Qualification_SupervisorChargeReason_Payload: Z = -16

    val Battery_Evidence_Charge_Qualification_SupervisorChargePermission_Payload: Z = -15

    val Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNotice_Payload: Z = -14

    val Battery_Evidence_Charge_Qualification_SupervisorPilotSessionState_Payload: Z = -13

    val Battery_Evidence_Charge_Qualification_SupervisorPilotChargeDisposition_Payload: Z = -12

    val Battery_Evidence_Charge_Qualification_SupervisorPilotAdvisory_Payload: Z = -11

    val Battery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot: Z = -10

    val Battery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot_Payload: Z = -9

    val Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus: Z = -8

    val Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus_Payload: Z = -7

    val Base_TypesBoolean_Payload: Z = -6

    val Base_TypesInteger_Payload: Z = -5

    val Base_TypesInteger_8_Payload: Z = -4

    val Base_TypesInteger_16_Payload: Z = -3

    val Base_TypesInteger_32_Payload: Z = -2

    val Base_TypesInteger_64_Payload: Z = -1

    val Base_TypesUnsigned_8_Payload: Z = 0

    val Base_TypesUnsigned_16_Payload: Z = 1

    val Base_TypesUnsigned_32_Payload: Z = 2

    val Base_TypesUnsigned_64_Payload: Z = 3

    val Base_TypesFloat_Payload: Z = 4

    val Base_TypesFloat_32_Payload: Z = 5

    val Base_TypesFloat_64_Payload: Z = 6

    val Base_TypesCharacter_Payload: Z = 7

    val Base_TypesString_Payload: Z = 8

    val Base_TypesBits_Payload: Z = 9

    val Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P: Z = 10

    val Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS: Z = 11

    val Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P: Z = 12

    val Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS: Z = 13

    val Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P: Z = 14

    val Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS: Z = 15

    val Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P: Z = 16

    val Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS: Z = 17

    val Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P: Z = 18

    val Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS: Z = 19

    val Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P: Z = 20

    val Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS: Z = 21

    val Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P: Z = 22

    val Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS: Z = 23

    val Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P: Z = 24

    val Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS: Z = 25

    val Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P: Z = 26

    val Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS: Z = 27

    val Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P: Z = 28

    val Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS: Z = 29

    val Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P: Z = 30

    val Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS: Z = 31

    val Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P: Z = 32

    val Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS: Z = 33

    val Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P: Z = 34

    val Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS: Z = 35

    val Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P: Z = 36

    val Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS: Z = 37

    val Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P: Z = 38

    val Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS: Z = 39

    val Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P: Z = 40

    val Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS: Z = 41

    val utilEmptyContainer: Z = 42

    val _artEmpty: Z = 43

  }

  object Writer {

    @record class Default(val writer: MessagePack.Writer.Impl) extends Writer

  }

  @msig trait Writer {

    def writer: MessagePack.Writer

    def writeBattery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBandType(o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBand_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand_Payload): Unit = {
      writer.writeZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBand_Payload)
      writeBattery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBandType(o.value)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorBatteryCheckType(o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorBatteryCheck_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck_Payload): Unit = {
      writer.writeZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorBatteryCheck_Payload)
      writeBattery_Evidence_Charge_Qualification_SupervisorBatteryCheckType(o.value)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType(o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessment_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment_Payload): Unit = {
      writer.writeZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorBatteryAssessment_Payload)
      writeBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType(o.value)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorLifecycleContextType(o: Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorLifecycleContext_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext_Payload): Unit = {
      writer.writeZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorLifecycleContext_Payload)
      writeBattery_Evidence_Charge_Qualification_SupervisorLifecycleContextType(o.value)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualificationType(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualification_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification_Payload): Unit = {
      writer.writeZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualification_Payload)
      writeBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualificationType(o.value)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdviceType(o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdvice_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice_Payload): Unit = {
      writer.writeZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdvice_Payload)
      writeBattery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdviceType(o.value)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorChargerConnectionType(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorChargerConnection_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection_Payload): Unit = {
      writer.writeZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorChargerConnection_Payload)
      writeBattery_Evidence_Charge_Qualification_SupervisorChargerConnectionType(o.value)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorChargeActivityType(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorChargeActivity_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity_Payload): Unit = {
      writer.writeZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeActivity_Payload)
      writeBattery_Evidence_Charge_Qualification_SupervisorChargeActivityType(o.value)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualification_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification_Payload): Unit = {
      writer.writeZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualification_Payload)
      writeBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType(o.value)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorChargeSessionStateType(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorChargeSessionState_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState_Payload): Unit = {
      writer.writeZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionState_Payload)
      writeBattery_Evidence_Charge_Qualification_SupervisorChargeSessionStateType(o.value)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelopeType(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelope_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope_Payload): Unit = {
      writer.writeZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelope_Payload)
      writeBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelopeType(o.value)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorChargeRequestType(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorChargeRequest_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest_Payload): Unit = {
      writer.writeZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeRequest_Payload)
      writeBattery_Evidence_Charge_Qualification_SupervisorChargeRequestType(o.value)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorChargeDecisionType(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorChargeDecision_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision_Payload): Unit = {
      writer.writeZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeDecision_Payload)
      writeBattery_Evidence_Charge_Qualification_SupervisorChargeDecisionType(o.value)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionStateType(o: Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionState_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState_Payload): Unit = {
      writer.writeZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionState_Payload)
      writeBattery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionStateType(o.value)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionStateType(o: Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionState_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState_Payload): Unit = {
      writer.writeZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionState_Payload)
      writeBattery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionStateType(o.value)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDispositionType(o: Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDisposition_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition_Payload): Unit = {
      writer.writeZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDisposition_Payload)
      writeBattery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDispositionType(o.value)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorChargeReasonType(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorChargeReason_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason_Payload): Unit = {
      writer.writeZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeReason_Payload)
      writeBattery_Evidence_Charge_Qualification_SupervisorChargeReasonType(o.value)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorChargePermissionType(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorChargePermission_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission_Payload): Unit = {
      writer.writeZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorChargePermission_Payload)
      writeBattery_Evidence_Charge_Qualification_SupervisorChargePermissionType(o.value)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticeType(o: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNotice_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice_Payload): Unit = {
      writer.writeZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNotice_Payload)
      writeBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticeType(o.value)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorPilotSessionStateType(o: Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorPilotSessionState_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState_Payload): Unit = {
      writer.writeZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorPilotSessionState_Payload)
      writeBattery_Evidence_Charge_Qualification_SupervisorPilotSessionStateType(o.value)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorPilotChargeDispositionType(o: Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorPilotChargeDisposition_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition_Payload): Unit = {
      writer.writeZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorPilotChargeDisposition_Payload)
      writeBattery_Evidence_Charge_Qualification_SupervisorPilotChargeDispositionType(o.value)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorPilotAdvisoryType(o: Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorPilotAdvisory_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory_Payload): Unit = {
      writer.writeZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorPilotAdvisory_Payload)
      writeBattery_Evidence_Charge_Qualification_SupervisorPilotAdvisoryType(o.value)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot): Unit = {
      writer.writeZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot)
      writeBattery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionStateType(o.preSession)
      writeBattery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionStateType(o.nextSession)
      writeBattery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDispositionType(o.disposition)
      writeBattery_Evidence_Charge_Qualification_SupervisorChargeReasonType(o.reason)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot_Payload): Unit = {
      writer.writeZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot_Payload)
      writeBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot(o.value)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus(o: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus): Unit = {
      writer.writeZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus)
      writeBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType(o.batteryAssessment)
      writeBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType(o.chargerPathQualification)
      writeBattery_Evidence_Charge_Qualification_SupervisorPilotSessionStateType(o.session)
      writeBattery_Evidence_Charge_Qualification_SupervisorPilotChargeDispositionType(o.disposition)
      writeBattery_Evidence_Charge_Qualification_SupervisorPilotAdvisoryType(o.advisory)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus_Payload): Unit = {
      writer.writeZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus_Payload)
      writeBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus(o.value)
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

    def writeBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container(o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container): Unit = {
      o match {
        case o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P => writeBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS => writeBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS(o)
      }
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P(o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P)
      writeBattery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBandType(o.api_batteryCapacity)
      writeBattery_Evidence_Charge_Qualification_SupervisorBatteryCheckType(o.api_batteryCheck)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS(o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS)
      writeBattery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBandType(o.api_batteryCapacity)
      writeBattery_Evidence_Charge_Qualification_SupervisorBatteryCheckType(o.api_batteryCheck)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container(o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container): Unit = {
      o match {
        case o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P => writeBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS => writeBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS(o)
      }
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P(o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P)
      writeBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType(o.api_batteryAssessment)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS(o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS)
      writeBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType(o.api_batteryAssessment)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container): Unit = {
      o match {
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P => writeBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS => writeBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS(o)
      }
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P)
      writeBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType(o.api_batteryAssessment)
      writeBattery_Evidence_Charge_Qualification_SupervisorLifecycleContextType(o.api_lifecycleContext)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS)
      writeBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType(o.api_batteryAssessment)
      writeBattery_Evidence_Charge_Qualification_SupervisorLifecycleContextType(o.api_lifecycleContext)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container): Unit = {
      o match {
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P => writeBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS => writeBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS(o)
      }
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P)
      writeBattery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdviceType(o.api_batteryReadinessAdvice)
      writeBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualificationType(o.api_chargeContextQualification)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS)
      writeBattery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdviceType(o.api_batteryReadinessAdvice)
      writeBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualificationType(o.api_chargeContextQualification)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container): Unit = {
      o match {
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P => writeBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS => writeBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS(o)
      }
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P)
      writeBattery_Evidence_Charge_Qualification_SupervisorChargeActivityType(o.api_chargeActivity)
      writeBattery_Evidence_Charge_Qualification_SupervisorChargerConnectionType(o.api_chargerConnection)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS)
      writeBattery_Evidence_Charge_Qualification_SupervisorChargeActivityType(o.api_chargeActivity)
      writeBattery_Evidence_Charge_Qualification_SupervisorChargerConnectionType(o.api_chargerConnection)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container): Unit = {
      o match {
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P => writeBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS => writeBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS(o)
      }
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P)
      writeBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType(o.api_chargerPathQualification)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS)
      writeBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType(o.api_chargerPathQualification)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container): Unit = {
      o match {
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P => writeBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS => writeBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS(o)
      }
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P)
      writeBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualificationType(o.api_chargeContextQualification)
      writeBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType(o.api_chargerPathQualification)
      writeBattery_Evidence_Charge_Qualification_SupervisorChargeSessionStateType(o.api_currentChargeSession)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS)
      writeBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualificationType(o.api_chargeContextQualification)
      writeBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType(o.api_chargerPathQualification)
      writeBattery_Evidence_Charge_Qualification_SupervisorChargeSessionStateType(o.api_currentChargeSession)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container): Unit = {
      o match {
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P => writeBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS => writeBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS(o)
      }
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P)
      writeBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelopeType(o.api_chargeEligibilityEnvelope)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS)
      writeBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelopeType(o.api_chargeEligibilityEnvelope)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container): Unit = {
      o match {
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P => writeBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS => writeBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS(o)
      }
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P)
      writeBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelopeType(o.api_chargeEligibilityEnvelope)
      writeBattery_Evidence_Charge_Qualification_SupervisorChargeRequestType(o.api_chargeRequest)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS)
      writeBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelopeType(o.api_chargeEligibilityEnvelope)
      writeBattery_Evidence_Charge_Qualification_SupervisorChargeRequestType(o.api_chargeRequest)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container): Unit = {
      o match {
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P => writeBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS => writeBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS(o)
      }
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P)
      writeBattery_Evidence_Charge_Qualification_SupervisorChargeDecisionType(o.api_chargeDecision)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS)
      writeBattery_Evidence_Charge_Qualification_SupervisorChargeDecisionType(o.api_chargeDecision)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container): Unit = {
      o match {
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P => writeBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS => writeBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS(o)
      }
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P)
      writeBattery_Evidence_Charge_Qualification_SupervisorChargeDecisionType(o.api_chargeDecision)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS)
      writeBattery_Evidence_Charge_Qualification_SupervisorChargeDecisionType(o.api_chargeDecision)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container): Unit = {
      o match {
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P => writeBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS => writeBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS(o)
      }
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P)
      writeBattery_Evidence_Charge_Qualification_SupervisorChargePermissionType(o.api_chargePermission)
      writeBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot(o.api_chargeSessionSnapshot)
      writeBattery_Evidence_Charge_Qualification_SupervisorChargeSessionStateType(o.api_currentChargeSession)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS)
      writeBattery_Evidence_Charge_Qualification_SupervisorChargePermissionType(o.api_chargePermission)
      writeBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot(o.api_chargeSessionSnapshot)
      writeBattery_Evidence_Charge_Qualification_SupervisorChargeSessionStateType(o.api_currentChargeSession)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container(o: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container): Unit = {
      o match {
        case o: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P => writeBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS => writeBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS(o)
      }
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P(o: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P)
      writeBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType(o.api_batteryAssessment)
      writeBattery_Evidence_Charge_Qualification_SupervisorLifecycleContextType(o.api_lifecycleContext)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS(o: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS)
      writeBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType(o.api_batteryAssessment)
      writeBattery_Evidence_Charge_Qualification_SupervisorLifecycleContextType(o.api_lifecycleContext)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container(o: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container): Unit = {
      o match {
        case o: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P => writeBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS => writeBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS(o)
      }
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P(o: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P)
      writeBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticeType(o.api_flightControlBatteryNotice)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS(o: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS)
      writeBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticeType(o.api_flightControlBatteryNotice)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container(o: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container): Unit = {
      o match {
        case o: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P => writeBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS => writeBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS(o)
      }
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P(o: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P)
      writeBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType(o.api_batteryAssessment)
      writeBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot(o.api_chargeSessionSnapshot)
      writeBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType(o.api_chargerPathQualification)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS(o: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS)
      writeBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType(o.api_batteryAssessment)
      writeBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot(o.api_chargeSessionSnapshot)
      writeBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType(o.api_chargerPathQualification)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container(o: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container): Unit = {
      o match {
        case o: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P => writeBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS => writeBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS(o)
      }
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P(o: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P)
      writeBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus(o.api_pilotBatteryStatus)
    }

    def writeBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS(o: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS)
      writeBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus(o.api_pilotBatteryStatus)
    }

    def writeruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeutilContainer(o: util.Container): Unit = {
      o match {
        case o: util.EmptyContainer => writeutilEmptyContainer(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P => writeBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS => writeBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P => writeBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS => writeBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P => writeBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS => writeBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P => writeBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS => writeBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P => writeBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS => writeBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P => writeBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS => writeBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P => writeBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS => writeBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P => writeBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS => writeBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P => writeBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P => writeBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS => writeBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS => writeBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P => writeBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS => writeBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P => writeBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS => writeBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P => writeBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS => writeBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P => writeBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS => writeBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P => writeBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS => writeBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P => writeBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS => writeBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS(o)
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
        case o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck_Payload => writeBattery_Evidence_Charge_Qualification_SupervisorBatteryCheck_Payload(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason_Payload => writeBattery_Evidence_Charge_Qualification_SupervisorChargeReason_Payload(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest_Payload => writeBattery_Evidence_Charge_Qualification_SupervisorChargeRequest_Payload(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory_Payload => writeBattery_Evidence_Charge_Qualification_SupervisorPilotAdvisory_Payload(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity_Payload => writeBattery_Evidence_Charge_Qualification_SupervisorChargeActivity_Payload(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision_Payload => writeBattery_Evidence_Charge_Qualification_SupervisorChargeDecision_Payload(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission_Payload => writeBattery_Evidence_Charge_Qualification_SupervisorChargePermission_Payload(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext_Payload => writeBattery_Evidence_Charge_Qualification_SupervisorLifecycleContext_Payload(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState_Payload => writeBattery_Evidence_Charge_Qualification_SupervisorPilotSessionState_Payload(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection_Payload => writeBattery_Evidence_Charge_Qualification_SupervisorChargerConnection_Payload(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment_Payload => writeBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessment_Payload(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState_Payload => writeBattery_Evidence_Charge_Qualification_SupervisorChargeSessionState_Payload(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus_Payload => writeBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus_Payload(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand_Payload => writeBattery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBand_Payload(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot_Payload => writeBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot_Payload(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice_Payload => writeBattery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdvice_Payload(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition_Payload => writeBattery_Evidence_Charge_Qualification_SupervisorPilotChargeDisposition_Payload(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState_Payload => writeBattery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionState_Payload(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState_Payload => writeBattery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionState_Payload(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification_Payload => writeBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualification_Payload(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition_Payload => writeBattery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDisposition_Payload(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope_Payload => writeBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelope_Payload(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification_Payload => writeBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualification_Payload(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice_Payload => writeBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNotice_Payload(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P => writeBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS => writeBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P => writeBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS => writeBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P => writeBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS => writeBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P => writeBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS => writeBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P => writeBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS => writeBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P => writeBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS => writeBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P => writeBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS => writeBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P => writeBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS => writeBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P => writeBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P => writeBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS => writeBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS => writeBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P => writeBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS => writeBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P => writeBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS => writeBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P => writeBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS => writeBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P => writeBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS => writeBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P => writeBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS => writeBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P => writeBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P(o)
        case o: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS => writeBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS(o)
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

    def readBattery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBandType(): Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand.Type = {
      val r = reader.readZ()
      return Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand.byOrdinal(r).get
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBand_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand_Payload = {
      val r = readBattery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBand_PayloadT(F)
      return r
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBand_PayloadT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBand_Payload)
      }
      val value = readBattery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBandType()
      return Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand_Payload(value)
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorBatteryCheckType(): Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck.Type = {
      val r = reader.readZ()
      return Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck.byOrdinal(r).get
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorBatteryCheck_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck_Payload = {
      val r = readBattery_Evidence_Charge_Qualification_SupervisorBatteryCheck_PayloadT(F)
      return r
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorBatteryCheck_PayloadT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorBatteryCheck_Payload)
      }
      val value = readBattery_Evidence_Charge_Qualification_SupervisorBatteryCheckType()
      return Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck_Payload(value)
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType(): Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.Type = {
      val r = reader.readZ()
      return Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.byOrdinal(r).get
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessment_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment_Payload = {
      val r = readBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessment_PayloadT(F)
      return r
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessment_PayloadT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorBatteryAssessment_Payload)
      }
      val value = readBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType()
      return Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment_Payload(value)
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorLifecycleContextType(): Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext.Type = {
      val r = reader.readZ()
      return Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext.byOrdinal(r).get
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorLifecycleContext_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext_Payload = {
      val r = readBattery_Evidence_Charge_Qualification_SupervisorLifecycleContext_PayloadT(F)
      return r
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorLifecycleContext_PayloadT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorLifecycleContext_Payload)
      }
      val value = readBattery_Evidence_Charge_Qualification_SupervisorLifecycleContextType()
      return Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext_Payload(value)
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualificationType(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification.Type = {
      val r = reader.readZ()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification.byOrdinal(r).get
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualification_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification_Payload = {
      val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualification_PayloadT(F)
      return r
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualification_PayloadT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualification_Payload)
      }
      val value = readBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualificationType()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification_Payload(value)
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdviceType(): Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice.Type = {
      val r = reader.readZ()
      return Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice.byOrdinal(r).get
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdvice_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice_Payload = {
      val r = readBattery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdvice_PayloadT(F)
      return r
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdvice_PayloadT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdvice_Payload)
      }
      val value = readBattery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdviceType()
      return Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice_Payload(value)
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargerConnectionType(): Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection.Type = {
      val r = reader.readZ()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection.byOrdinal(r).get
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargerConnection_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection_Payload = {
      val r = readBattery_Evidence_Charge_Qualification_SupervisorChargerConnection_PayloadT(F)
      return r
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargerConnection_PayloadT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorChargerConnection_Payload)
      }
      val value = readBattery_Evidence_Charge_Qualification_SupervisorChargerConnectionType()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection_Payload(value)
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargeActivityType(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity.Type = {
      val r = reader.readZ()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity.byOrdinal(r).get
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargeActivity_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity_Payload = {
      val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeActivity_PayloadT(F)
      return r
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargeActivity_PayloadT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeActivity_Payload)
      }
      val value = readBattery_Evidence_Charge_Qualification_SupervisorChargeActivityType()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity_Payload(value)
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType(): Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification.Type = {
      val r = reader.readZ()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification.byOrdinal(r).get
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualification_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification_Payload = {
      val r = readBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualification_PayloadT(F)
      return r
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualification_PayloadT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualification_Payload)
      }
      val value = readBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification_Payload(value)
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargeSessionStateType(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.Type = {
      val r = reader.readZ()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.byOrdinal(r).get
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargeSessionState_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState_Payload = {
      val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeSessionState_PayloadT(F)
      return r
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargeSessionState_PayloadT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionState_Payload)
      }
      val value = readBattery_Evidence_Charge_Qualification_SupervisorChargeSessionStateType()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState_Payload(value)
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelopeType(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.Type = {
      val r = reader.readZ()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.byOrdinal(r).get
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelope_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope_Payload = {
      val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelope_PayloadT(F)
      return r
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelope_PayloadT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelope_Payload)
      }
      val value = readBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelopeType()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope_Payload(value)
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargeRequestType(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest.Type = {
      val r = reader.readZ()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest.byOrdinal(r).get
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargeRequest_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest_Payload = {
      val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeRequest_PayloadT(F)
      return r
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargeRequest_PayloadT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeRequest_Payload)
      }
      val value = readBattery_Evidence_Charge_Qualification_SupervisorChargeRequestType()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest_Payload(value)
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargeDecisionType(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.Type = {
      val r = reader.readZ()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.byOrdinal(r).get
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargeDecision_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision_Payload = {
      val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeDecision_PayloadT(F)
      return r
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargeDecision_PayloadT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeDecision_Payload)
      }
      val value = readBattery_Evidence_Charge_Qualification_SupervisorChargeDecisionType()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision_Payload(value)
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionStateType(): Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState.Type = {
      val r = reader.readZ()
      return Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState.byOrdinal(r).get
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionState_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState_Payload = {
      val r = readBattery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionState_PayloadT(F)
      return r
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionState_PayloadT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionState_Payload)
      }
      val value = readBattery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionStateType()
      return Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState_Payload(value)
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionStateType(): Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState.Type = {
      val r = reader.readZ()
      return Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState.byOrdinal(r).get
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionState_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState_Payload = {
      val r = readBattery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionState_PayloadT(F)
      return r
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionState_PayloadT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionState_Payload)
      }
      val value = readBattery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionStateType()
      return Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState_Payload(value)
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDispositionType(): Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition.Type = {
      val r = reader.readZ()
      return Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition.byOrdinal(r).get
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDisposition_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition_Payload = {
      val r = readBattery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDisposition_PayloadT(F)
      return r
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDisposition_PayloadT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDisposition_Payload)
      }
      val value = readBattery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDispositionType()
      return Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition_Payload(value)
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargeReasonType(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason.Type = {
      val r = reader.readZ()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason.byOrdinal(r).get
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargeReason_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason_Payload = {
      val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeReason_PayloadT(F)
      return r
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargeReason_PayloadT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeReason_Payload)
      }
      val value = readBattery_Evidence_Charge_Qualification_SupervisorChargeReasonType()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason_Payload(value)
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargePermissionType(): Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission.Type = {
      val r = reader.readZ()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission.byOrdinal(r).get
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargePermission_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission_Payload = {
      val r = readBattery_Evidence_Charge_Qualification_SupervisorChargePermission_PayloadT(F)
      return r
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargePermission_PayloadT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorChargePermission_Payload)
      }
      val value = readBattery_Evidence_Charge_Qualification_SupervisorChargePermissionType()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission_Payload(value)
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticeType(): Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice.Type = {
      val r = reader.readZ()
      return Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice.byOrdinal(r).get
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNotice_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice_Payload = {
      val r = readBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNotice_PayloadT(F)
      return r
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNotice_PayloadT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNotice_Payload)
      }
      val value = readBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticeType()
      return Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice_Payload(value)
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorPilotSessionStateType(): Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState.Type = {
      val r = reader.readZ()
      return Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState.byOrdinal(r).get
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorPilotSessionState_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState_Payload = {
      val r = readBattery_Evidence_Charge_Qualification_SupervisorPilotSessionState_PayloadT(F)
      return r
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorPilotSessionState_PayloadT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorPilotSessionState_Payload)
      }
      val value = readBattery_Evidence_Charge_Qualification_SupervisorPilotSessionStateType()
      return Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState_Payload(value)
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorPilotChargeDispositionType(): Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition.Type = {
      val r = reader.readZ()
      return Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition.byOrdinal(r).get
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorPilotChargeDisposition_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition_Payload = {
      val r = readBattery_Evidence_Charge_Qualification_SupervisorPilotChargeDisposition_PayloadT(F)
      return r
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorPilotChargeDisposition_PayloadT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorPilotChargeDisposition_Payload)
      }
      val value = readBattery_Evidence_Charge_Qualification_SupervisorPilotChargeDispositionType()
      return Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition_Payload(value)
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorPilotAdvisoryType(): Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory.Type = {
      val r = reader.readZ()
      return Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory.byOrdinal(r).get
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorPilotAdvisory_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory_Payload = {
      val r = readBattery_Evidence_Charge_Qualification_SupervisorPilotAdvisory_PayloadT(F)
      return r
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorPilotAdvisory_PayloadT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorPilotAdvisory_Payload)
      }
      val value = readBattery_Evidence_Charge_Qualification_SupervisorPilotAdvisoryType()
      return Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory_Payload(value)
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot = {
      val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshotT(F)
      return r
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshotT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot)
      }
      val preSession = readBattery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionStateType()
      val nextSession = readBattery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionStateType()
      val disposition = readBattery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDispositionType()
      val reason = readBattery_Evidence_Charge_Qualification_SupervisorChargeReasonType()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot(preSession, nextSession, disposition, reason)
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot_Payload = {
      val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot_PayloadT(F)
      return r
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot_PayloadT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot_Payload)
      }
      val value = readBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot_Payload(value)
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus(): Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus = {
      val r = readBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusT(F)
      return r
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus)
      }
      val batteryAssessment = readBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType()
      val chargerPathQualification = readBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType()
      val session = readBattery_Evidence_Charge_Qualification_SupervisorPilotSessionStateType()
      val disposition = readBattery_Evidence_Charge_Qualification_SupervisorPilotChargeDispositionType()
      val advisory = readBattery_Evidence_Charge_Qualification_SupervisorPilotAdvisoryType()
      return Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus(batteryAssessment, chargerPathQualification, session, disposition, advisory)
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus_Payload(): Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus_Payload = {
      val r = readBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus_PayloadT(F)
      return r
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus_PayloadT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus_Payload)
      }
      val value = readBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus()
      return Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus_Payload(value)
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

    def readBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container(): Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P => val r = readBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS => val r = readBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container.")
          val r = readBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PST(T)
          return r
      }
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P(): Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P = {
      val r = readBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PT(F)
      return r
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P)
      }
      val api_batteryCapacity = readBattery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBandType()
      val api_batteryCheck = readBattery_Evidence_Charge_Qualification_SupervisorBatteryCheckType()
      return Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P(api_batteryCapacity, api_batteryCheck)
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS(): Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS = {
      val r = readBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PST(F)
      return r
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PST(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS)
      }
      val api_batteryCapacity = readBattery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBandType()
      val api_batteryCheck = readBattery_Evidence_Charge_Qualification_SupervisorBatteryCheckType()
      return Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS(api_batteryCapacity, api_batteryCheck)
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container(): Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P => val r = readBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS => val r = readBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container.")
          val r = readBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PST(T)
          return r
      }
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P(): Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P = {
      val r = readBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PT(F)
      return r
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P)
      }
      val api_batteryAssessment = readBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType()
      return Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P(api_batteryAssessment)
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS(): Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS = {
      val r = readBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PST(F)
      return r
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PST(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS)
      }
      val api_batteryAssessment = readBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType()
      return Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS(api_batteryAssessment)
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container.")
          val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PST(T)
          return r
      }
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P = {
      val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PT(F)
      return r
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P)
      }
      val api_batteryAssessment = readBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType()
      val api_lifecycleContext = readBattery_Evidence_Charge_Qualification_SupervisorLifecycleContextType()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P(api_batteryAssessment, api_lifecycleContext)
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS = {
      val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PST(F)
      return r
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PST(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS)
      }
      val api_batteryAssessment = readBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType()
      val api_lifecycleContext = readBattery_Evidence_Charge_Qualification_SupervisorLifecycleContextType()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS(api_batteryAssessment, api_lifecycleContext)
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container.")
          val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PST(T)
          return r
      }
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P = {
      val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PT(F)
      return r
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P)
      }
      val api_batteryReadinessAdvice = readBattery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdviceType()
      val api_chargeContextQualification = readBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualificationType()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P(api_batteryReadinessAdvice, api_chargeContextQualification)
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS = {
      val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PST(F)
      return r
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PST(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS)
      }
      val api_batteryReadinessAdvice = readBattery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdviceType()
      val api_chargeContextQualification = readBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualificationType()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS(api_batteryReadinessAdvice, api_chargeContextQualification)
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container(): Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container.")
          val r = readBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PST(T)
          return r
      }
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P(): Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P = {
      val r = readBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PT(F)
      return r
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P)
      }
      val api_chargeActivity = readBattery_Evidence_Charge_Qualification_SupervisorChargeActivityType()
      val api_chargerConnection = readBattery_Evidence_Charge_Qualification_SupervisorChargerConnectionType()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P(api_chargeActivity, api_chargerConnection)
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS(): Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS = {
      val r = readBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PST(F)
      return r
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PST(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS)
      }
      val api_chargeActivity = readBattery_Evidence_Charge_Qualification_SupervisorChargeActivityType()
      val api_chargerConnection = readBattery_Evidence_Charge_Qualification_SupervisorChargerConnectionType()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS(api_chargeActivity, api_chargerConnection)
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container(): Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container.")
          val r = readBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PST(T)
          return r
      }
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P(): Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P = {
      val r = readBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PT(F)
      return r
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P)
      }
      val api_chargerPathQualification = readBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P(api_chargerPathQualification)
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS(): Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS = {
      val r = readBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PST(F)
      return r
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PST(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS)
      }
      val api_chargerPathQualification = readBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS(api_chargerPathQualification)
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container.")
          val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P = {
      val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PT(F)
      return r
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P)
      }
      val api_chargeContextQualification = readBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualificationType()
      val api_chargerPathQualification = readBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType()
      val api_currentChargeSession = readBattery_Evidence_Charge_Qualification_SupervisorChargeSessionStateType()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P(api_chargeContextQualification, api_chargerPathQualification, api_currentChargeSession)
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS = {
      val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PST(F)
      return r
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PST(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS)
      }
      val api_chargeContextQualification = readBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualificationType()
      val api_chargerPathQualification = readBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType()
      val api_currentChargeSession = readBattery_Evidence_Charge_Qualification_SupervisorChargeSessionStateType()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS(api_chargeContextQualification, api_chargerPathQualification, api_currentChargeSession)
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container.")
          val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P = {
      val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PT(F)
      return r
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P)
      }
      val api_chargeEligibilityEnvelope = readBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelopeType()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P(api_chargeEligibilityEnvelope)
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS = {
      val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PST(F)
      return r
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PST(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS)
      }
      val api_chargeEligibilityEnvelope = readBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelopeType()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS(api_chargeEligibilityEnvelope)
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container.")
          val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PST(T)
          return r
      }
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P = {
      val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PT(F)
      return r
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P)
      }
      val api_chargeEligibilityEnvelope = readBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelopeType()
      val api_chargeRequest = readBattery_Evidence_Charge_Qualification_SupervisorChargeRequestType()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P(api_chargeEligibilityEnvelope, api_chargeRequest)
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS = {
      val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PST(F)
      return r
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PST(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS)
      }
      val api_chargeEligibilityEnvelope = readBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelopeType()
      val api_chargeRequest = readBattery_Evidence_Charge_Qualification_SupervisorChargeRequestType()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS(api_chargeEligibilityEnvelope, api_chargeRequest)
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container.")
          val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PST(T)
          return r
      }
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P = {
      val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PT(F)
      return r
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P)
      }
      val api_chargeDecision = readBattery_Evidence_Charge_Qualification_SupervisorChargeDecisionType()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P(api_chargeDecision)
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS = {
      val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PST(F)
      return r
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PST(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS)
      }
      val api_chargeDecision = readBattery_Evidence_Charge_Qualification_SupervisorChargeDecisionType()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS(api_chargeDecision)
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container.")
          val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PST(T)
          return r
      }
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P = {
      val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PT(F)
      return r
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P)
      }
      val api_chargeDecision = readBattery_Evidence_Charge_Qualification_SupervisorChargeDecisionType()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P(api_chargeDecision)
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS = {
      val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PST(F)
      return r
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PST(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS)
      }
      val api_chargeDecision = readBattery_Evidence_Charge_Qualification_SupervisorChargeDecisionType()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS(api_chargeDecision)
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container.")
          val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PST(T)
          return r
      }
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P = {
      val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PT(F)
      return r
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P)
      }
      val api_chargePermission = readBattery_Evidence_Charge_Qualification_SupervisorChargePermissionType()
      val api_chargeSessionSnapshot = readBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot()
      val api_currentChargeSession = readBattery_Evidence_Charge_Qualification_SupervisorChargeSessionStateType()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P(api_chargePermission, api_chargeSessionSnapshot, api_currentChargeSession)
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS(): Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS = {
      val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PST(F)
      return r
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PST(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS)
      }
      val api_chargePermission = readBattery_Evidence_Charge_Qualification_SupervisorChargePermissionType()
      val api_chargeSessionSnapshot = readBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot()
      val api_currentChargeSession = readBattery_Evidence_Charge_Qualification_SupervisorChargeSessionStateType()
      return Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS(api_chargePermission, api_chargeSessionSnapshot, api_currentChargeSession)
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container(): Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P => val r = readBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS => val r = readBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container.")
          val r = readBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PST(T)
          return r
      }
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P(): Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P = {
      val r = readBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PT(F)
      return r
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P)
      }
      val api_batteryAssessment = readBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType()
      val api_lifecycleContext = readBattery_Evidence_Charge_Qualification_SupervisorLifecycleContextType()
      return Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P(api_batteryAssessment, api_lifecycleContext)
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS(): Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS = {
      val r = readBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PST(F)
      return r
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PST(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS)
      }
      val api_batteryAssessment = readBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType()
      val api_lifecycleContext = readBattery_Evidence_Charge_Qualification_SupervisorLifecycleContextType()
      return Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS(api_batteryAssessment, api_lifecycleContext)
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container(): Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P => val r = readBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS => val r = readBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container.")
          val r = readBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PST(T)
          return r
      }
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P(): Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P = {
      val r = readBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PT(F)
      return r
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P)
      }
      val api_flightControlBatteryNotice = readBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticeType()
      return Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P(api_flightControlBatteryNotice)
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS(): Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS = {
      val r = readBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PST(F)
      return r
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PST(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS)
      }
      val api_flightControlBatteryNotice = readBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticeType()
      return Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS(api_flightControlBatteryNotice)
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container(): Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P => val r = readBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS => val r = readBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container.")
          val r = readBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PST(T)
          return r
      }
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P(): Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P = {
      val r = readBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PT(F)
      return r
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P)
      }
      val api_batteryAssessment = readBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType()
      val api_chargeSessionSnapshot = readBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot()
      val api_chargerPathQualification = readBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType()
      return Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P(api_batteryAssessment, api_chargeSessionSnapshot, api_chargerPathQualification)
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS(): Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS = {
      val r = readBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PST(F)
      return r
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PST(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS)
      }
      val api_batteryAssessment = readBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType()
      val api_chargeSessionSnapshot = readBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot()
      val api_chargerPathQualification = readBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType()
      return Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS(api_batteryAssessment, api_chargeSessionSnapshot, api_chargerPathQualification)
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container(): Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P => val r = readBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS => val r = readBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container.")
          val r = readBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PST(T)
          return r
      }
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P(): Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P = {
      val r = readBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PT(F)
      return r
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PT(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P)
      }
      val api_pilotBatteryStatus = readBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus()
      return Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P(api_pilotBatteryStatus)
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS(): Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS = {
      val r = readBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PST(F)
      return r
    }

    def readBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PST(typeParsed: B): Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS)
      }
      val api_pilotBatteryStatus = readBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus()
      return Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS(api_pilotBatteryStatus)
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
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PST(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PST(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PST(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PST(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PST(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PST(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PST(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PST(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P => val r = readBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P => val r = readBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS => val r = readBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PST(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS => val r = readBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PST(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P => val r = readBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS => val r = readBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PST(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P => val r = readBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS => val r = readBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PST(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PST(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PST(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P => val r = readBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS => val r = readBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PST(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P => val r = readBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS => val r = readBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of util.Container.")
          val r = readBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PST(T)
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
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorBatteryCheck_Payload => val r = readBattery_Evidence_Charge_Qualification_SupervisorBatteryCheck_PayloadT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeReason_Payload => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeReason_PayloadT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeRequest_Payload => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeRequest_PayloadT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorPilotAdvisory_Payload => val r = readBattery_Evidence_Charge_Qualification_SupervisorPilotAdvisory_PayloadT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeActivity_Payload => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeActivity_PayloadT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeDecision_Payload => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeDecision_PayloadT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargePermission_Payload => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargePermission_PayloadT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorLifecycleContext_Payload => val r = readBattery_Evidence_Charge_Qualification_SupervisorLifecycleContext_PayloadT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorPilotSessionState_Payload => val r = readBattery_Evidence_Charge_Qualification_SupervisorPilotSessionState_PayloadT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargerConnection_Payload => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargerConnection_PayloadT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorBatteryAssessment_Payload => val r = readBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessment_PayloadT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionState_Payload => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeSessionState_PayloadT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus_Payload => val r = readBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus_PayloadT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBand_Payload => val r = readBattery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBand_PayloadT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot_Payload => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot_PayloadT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdvice_Payload => val r = readBattery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdvice_PayloadT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorPilotChargeDisposition_Payload => val r = readBattery_Evidence_Charge_Qualification_SupervisorPilotChargeDisposition_PayloadT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionState_Payload => val r = readBattery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionState_PayloadT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionState_Payload => val r = readBattery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionState_PayloadT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualification_Payload => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualification_PayloadT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDisposition_Payload => val r = readBattery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDisposition_PayloadT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelope_Payload => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelope_PayloadT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualification_Payload => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualification_PayloadT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNotice_Payload => val r = readBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNotice_PayloadT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PST(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PST(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PST(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PST(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PST(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PST(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PST(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PST(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P => val r = readBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P => val r = readBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS => val r = readBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PST(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS => val r = readBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PST(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P => val r = readBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS => val r = readBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PST(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P => val r = readBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS => val r = readBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PST(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PST(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS => val r = readBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PST(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P => val r = readBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS => val r = readBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PST(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P => val r = readBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PT(T); return r
        case Constants.Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS => val r = readBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of art.DataContent.")
          val r = readBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PST(T)
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

  def fromBattery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBand_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBand_Payload(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBand_Payload(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand_Payload, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBand_Payload(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand_Payload = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBand_Payload()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBand_Payload _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorBatteryCheck_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorBatteryCheck_Payload(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorBatteryCheck_Payload(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck_Payload, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorBatteryCheck_Payload(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck_Payload = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorBatteryCheck_Payload()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorBatteryCheck_Payload _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessment_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessment_Payload(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessment_Payload(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment_Payload, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessment_Payload(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment_Payload = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessment_Payload()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorBatteryAssessment_Payload _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorLifecycleContext_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorLifecycleContext_Payload(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorLifecycleContext_Payload(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext_Payload, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorLifecycleContext_Payload(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext_Payload = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorLifecycleContext_Payload()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorLifecycleContext_Payload _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualification_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualification_Payload(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualification_Payload(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification_Payload, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualification_Payload(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification_Payload = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualification_Payload()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualification_Payload _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdvice_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdvice_Payload(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdvice_Payload(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice_Payload, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdvice_Payload(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice_Payload = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdvice_Payload()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdvice_Payload _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargerConnection_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorChargerConnection_Payload(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargerConnection_Payload(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection_Payload, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargerConnection_Payload(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection_Payload = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorChargerConnection_Payload()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorChargerConnection_Payload _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargeActivity_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorChargeActivity_Payload(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargeActivity_Payload(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity_Payload, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargeActivity_Payload(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity_Payload = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorChargeActivity_Payload()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorChargeActivity_Payload _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualification_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualification_Payload(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualification_Payload(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification_Payload, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualification_Payload(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification_Payload = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualification_Payload()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualification_Payload _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargeSessionState_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorChargeSessionState_Payload(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargeSessionState_Payload(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState_Payload, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargeSessionState_Payload(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState_Payload = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorChargeSessionState_Payload()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorChargeSessionState_Payload _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelope_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelope_Payload(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelope_Payload(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope_Payload, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelope_Payload(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope_Payload = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelope_Payload()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelope_Payload _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargeRequest_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorChargeRequest_Payload(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargeRequest_Payload(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest_Payload, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargeRequest_Payload(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest_Payload = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorChargeRequest_Payload()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorChargeRequest_Payload _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargeDecision_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorChargeDecision_Payload(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargeDecision_Payload(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision_Payload, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargeDecision_Payload(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision_Payload = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorChargeDecision_Payload()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorChargeDecision_Payload _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionState_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionState_Payload(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionState_Payload(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState_Payload, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionState_Payload(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState_Payload = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionState_Payload()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionState_Payload _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionState_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionState_Payload(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionState_Payload(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState_Payload, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionState_Payload(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState_Payload = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionState_Payload()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionState_Payload _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDisposition_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDisposition_Payload(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDisposition_Payload(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition_Payload, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDisposition_Payload(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition_Payload = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDisposition_Payload()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDisposition_Payload _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargeReason_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorChargeReason_Payload(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargeReason_Payload(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason_Payload, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargeReason_Payload(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason_Payload = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorChargeReason_Payload()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorChargeReason_Payload _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargePermission_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorChargePermission_Payload(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargePermission_Payload(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission_Payload, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargePermission_Payload(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission_Payload = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorChargePermission_Payload()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorChargePermission_Payload _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNotice_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNotice_Payload(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNotice_Payload(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice_Payload, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNotice_Payload(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice_Payload = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNotice_Payload()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNotice_Payload _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorPilotSessionState_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorPilotSessionState_Payload(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorPilotSessionState_Payload(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState_Payload, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorPilotSessionState_Payload(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState_Payload = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorPilotSessionState_Payload()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorPilotSessionState_Payload _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorPilotChargeDisposition_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorPilotChargeDisposition_Payload(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorPilotChargeDisposition_Payload(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition_Payload, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorPilotChargeDisposition_Payload(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition_Payload = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorPilotChargeDisposition_Payload()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorPilotChargeDisposition_Payload _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorPilotAdvisory_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorPilotAdvisory_Payload(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorPilotAdvisory_Payload(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory_Payload, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorPilotAdvisory_Payload(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory_Payload = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorPilotAdvisory_Payload()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorPilotAdvisory_Payload _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot_Payload(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot_Payload(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot_Payload, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot_Payload(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot_Payload = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot_Payload()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot_Payload _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus(o: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus_Payload(o: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus_Payload(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus_Payload(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus_Payload, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus_Payload(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus_Payload = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus_Payload()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus_Payload _)
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

  def fromBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container(o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P(o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS(o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container(o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P(o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS(o: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS(o: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container(o: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P(o: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS(o: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container(o: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P(o: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS(o: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container(o: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P(o: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS(o: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container(o: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P(o: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P _)
    return r
  }

  def fromBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS(o: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS(o)
    return w.result
  }

  def toBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS(data: ISZ[U8]): Either[Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS(reader: Reader): Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS = {
      val r = reader.readBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS()
      return r
    }
    val r = to(data, fBattery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS _)
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