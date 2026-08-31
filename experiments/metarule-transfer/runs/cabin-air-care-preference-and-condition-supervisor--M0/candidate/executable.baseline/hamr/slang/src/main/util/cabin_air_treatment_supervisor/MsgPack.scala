// #Sireum
// @formatter:off

// This file is auto-generated from AirCareSelection.scala, RequestValidity.scala, RequestIntent.scala, CabinAirQuality.scala, AirQualityValidity.scala, AirAssessment.scala, CabinHumidity.scala, HumidityValidity.scala, HumidityAssessment.scala, StatusValidity.scala, FilterPathStatus.scala, DryingPathStatus.scala, TreatmentReadiness.scala, ReadinessContext.scala, AirProposal.scala, HumidityProposal.scala, RecoveryMemory.scala, AirTreatmentCommand.scala, StatusMode.scala, StatusReason.scala, TreatmentEquipmentStatus.scala, AirCareSupervisorStatus.scala, Base_Types.scala, AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_Containers.scala, AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_Containers.scala, HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_Containers.scala, TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_Containers.scala, FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_Containers.scala, HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_Containers.scala, ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_Containers.scala, AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package cabin_air_treatment_supervisor

import org.sireum._

object MsgPack {

  object Constants {

    val Cabin_Air_Treatment_SupervisorAirCareSelection_Payload: Z = -32

    val Cabin_Air_Treatment_SupervisorRequestValidity_Payload: Z = -31

    val Cabin_Air_Treatment_SupervisorRequestIntent_Payload: Z = -30

    val Cabin_Air_Treatment_SupervisorCabinAirQuality_Payload: Z = -29

    val Cabin_Air_Treatment_SupervisorAirQualityValidity_Payload: Z = -28

    val Cabin_Air_Treatment_SupervisorAirAssessment_Payload: Z = -27

    val Cabin_Air_Treatment_SupervisorCabinHumidity_Payload: Z = -26

    val Cabin_Air_Treatment_SupervisorHumidityValidity_Payload: Z = -25

    val Cabin_Air_Treatment_SupervisorHumidityAssessment_Payload: Z = -24

    val Cabin_Air_Treatment_SupervisorStatusValidity_Payload: Z = -23

    val Cabin_Air_Treatment_SupervisorFilterPathStatus_Payload: Z = -22

    val Cabin_Air_Treatment_SupervisorDryingPathStatus_Payload: Z = -21

    val Cabin_Air_Treatment_SupervisorTreatmentReadiness_Payload: Z = -20

    val Cabin_Air_Treatment_SupervisorReadinessContext_Payload: Z = -19

    val Cabin_Air_Treatment_SupervisorAirProposal_Payload: Z = -18

    val Cabin_Air_Treatment_SupervisorHumidityProposal_Payload: Z = -17

    val Cabin_Air_Treatment_SupervisorRecoveryMemory_Payload: Z = -16

    val Cabin_Air_Treatment_SupervisorAirTreatmentCommand_Payload: Z = -15

    val Cabin_Air_Treatment_SupervisorStatusMode_Payload: Z = -14

    val Cabin_Air_Treatment_SupervisorStatusReason_Payload: Z = -13

    val Cabin_Air_Treatment_SupervisorTreatmentEquipmentStatus: Z = -12

    val Cabin_Air_Treatment_SupervisorTreatmentEquipmentStatus_Payload: Z = -11

    val Cabin_Air_Treatment_SupervisorAirCareSupervisorStatus: Z = -10

    val Cabin_Air_Treatment_SupervisorAirCareSupervisorStatus_Payload: Z = -9

    val Base_TypesBoolean_Payload: Z = -8

    val Base_TypesInteger_Payload: Z = -7

    val Base_TypesInteger_8_Payload: Z = -6

    val Base_TypesInteger_16_Payload: Z = -5

    val Base_TypesInteger_32_Payload: Z = -4

    val Base_TypesInteger_64_Payload: Z = -3

    val Base_TypesUnsigned_8_Payload: Z = -2

    val Base_TypesUnsigned_16_Payload: Z = -1

    val Base_TypesUnsigned_32_Payload: Z = 0

    val Base_TypesUnsigned_64_Payload: Z = 1

    val Base_TypesFloat_Payload: Z = 2

    val Base_TypesFloat_32_Payload: Z = 3

    val Base_TypesFloat_64_Payload: Z = 4

    val Base_TypesCharacter_Payload: Z = 5

    val Base_TypesString_Payload: Z = 6

    val Base_TypesBits_Payload: Z = 7

    val Cabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_P: Z = 8

    val Cabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_PS: Z = 9

    val Cabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_P: Z = 10

    val Cabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_PS: Z = 11

    val Cabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_P: Z = 12

    val Cabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_PS: Z = 13

    val Cabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_P: Z = 14

    val Cabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_PS: Z = 15

    val Cabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_P: Z = 16

    val Cabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_PS: Z = 17

    val Cabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_P: Z = 18

    val Cabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_PS: Z = 19

    val Cabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_P: Z = 20

    val Cabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_PS: Z = 21

    val Cabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_P: Z = 22

    val Cabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_PS: Z = 23

    val Cabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_P: Z = 24

    val Cabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_PS: Z = 25

    val Cabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_P: Z = 26

    val Cabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_PS: Z = 27

    val Cabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_P: Z = 28

    val Cabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_PS: Z = 29

    val Cabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_P: Z = 30

    val Cabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_PS: Z = 31

    val Cabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_P: Z = 32

    val Cabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_PS: Z = 33

    val Cabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_P: Z = 34

    val Cabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_PS: Z = 35

    val Cabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_P: Z = 36

    val Cabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_PS: Z = 37

    val Cabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_P: Z = 38

    val Cabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_PS: Z = 39

    val utilEmptyContainer: Z = 40

    val _artEmpty: Z = 41

  }

  object Writer {

    @record class Default(val writer: MessagePack.Writer.Impl) extends Writer

  }

  @msig trait Writer {

    def writer: MessagePack.Writer

    def writeCabin_Air_Treatment_SupervisorAirCareSelectionType(o: Cabin_Air_Treatment_Supervisor.AirCareSelection.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Treatment_SupervisorAirCareSelection_Payload(o: Cabin_Air_Treatment_Supervisor.AirCareSelection_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Treatment_SupervisorAirCareSelection_Payload)
      writeCabin_Air_Treatment_SupervisorAirCareSelectionType(o.value)
    }

    def writeCabin_Air_Treatment_SupervisorRequestValidityType(o: Cabin_Air_Treatment_Supervisor.RequestValidity.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Treatment_SupervisorRequestValidity_Payload(o: Cabin_Air_Treatment_Supervisor.RequestValidity_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Treatment_SupervisorRequestValidity_Payload)
      writeCabin_Air_Treatment_SupervisorRequestValidityType(o.value)
    }

    def writeCabin_Air_Treatment_SupervisorRequestIntentType(o: Cabin_Air_Treatment_Supervisor.RequestIntent.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Treatment_SupervisorRequestIntent_Payload(o: Cabin_Air_Treatment_Supervisor.RequestIntent_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Treatment_SupervisorRequestIntent_Payload)
      writeCabin_Air_Treatment_SupervisorRequestIntentType(o.value)
    }

    def writeCabin_Air_Treatment_SupervisorCabinAirQualityType(o: Cabin_Air_Treatment_Supervisor.CabinAirQuality.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Treatment_SupervisorCabinAirQuality_Payload(o: Cabin_Air_Treatment_Supervisor.CabinAirQuality_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Treatment_SupervisorCabinAirQuality_Payload)
      writeCabin_Air_Treatment_SupervisorCabinAirQualityType(o.value)
    }

    def writeCabin_Air_Treatment_SupervisorAirQualityValidityType(o: Cabin_Air_Treatment_Supervisor.AirQualityValidity.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Treatment_SupervisorAirQualityValidity_Payload(o: Cabin_Air_Treatment_Supervisor.AirQualityValidity_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Treatment_SupervisorAirQualityValidity_Payload)
      writeCabin_Air_Treatment_SupervisorAirQualityValidityType(o.value)
    }

    def writeCabin_Air_Treatment_SupervisorAirAssessmentType(o: Cabin_Air_Treatment_Supervisor.AirAssessment.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Treatment_SupervisorAirAssessment_Payload(o: Cabin_Air_Treatment_Supervisor.AirAssessment_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Treatment_SupervisorAirAssessment_Payload)
      writeCabin_Air_Treatment_SupervisorAirAssessmentType(o.value)
    }

    def writeCabin_Air_Treatment_SupervisorCabinHumidityType(o: Cabin_Air_Treatment_Supervisor.CabinHumidity.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Treatment_SupervisorCabinHumidity_Payload(o: Cabin_Air_Treatment_Supervisor.CabinHumidity_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Treatment_SupervisorCabinHumidity_Payload)
      writeCabin_Air_Treatment_SupervisorCabinHumidityType(o.value)
    }

    def writeCabin_Air_Treatment_SupervisorHumidityValidityType(o: Cabin_Air_Treatment_Supervisor.HumidityValidity.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Treatment_SupervisorHumidityValidity_Payload(o: Cabin_Air_Treatment_Supervisor.HumidityValidity_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Treatment_SupervisorHumidityValidity_Payload)
      writeCabin_Air_Treatment_SupervisorHumidityValidityType(o.value)
    }

    def writeCabin_Air_Treatment_SupervisorHumidityAssessmentType(o: Cabin_Air_Treatment_Supervisor.HumidityAssessment.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Treatment_SupervisorHumidityAssessment_Payload(o: Cabin_Air_Treatment_Supervisor.HumidityAssessment_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Treatment_SupervisorHumidityAssessment_Payload)
      writeCabin_Air_Treatment_SupervisorHumidityAssessmentType(o.value)
    }

    def writeCabin_Air_Treatment_SupervisorStatusValidityType(o: Cabin_Air_Treatment_Supervisor.StatusValidity.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Treatment_SupervisorStatusValidity_Payload(o: Cabin_Air_Treatment_Supervisor.StatusValidity_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Treatment_SupervisorStatusValidity_Payload)
      writeCabin_Air_Treatment_SupervisorStatusValidityType(o.value)
    }

    def writeCabin_Air_Treatment_SupervisorFilterPathStatusType(o: Cabin_Air_Treatment_Supervisor.FilterPathStatus.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Treatment_SupervisorFilterPathStatus_Payload(o: Cabin_Air_Treatment_Supervisor.FilterPathStatus_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Treatment_SupervisorFilterPathStatus_Payload)
      writeCabin_Air_Treatment_SupervisorFilterPathStatusType(o.value)
    }

    def writeCabin_Air_Treatment_SupervisorDryingPathStatusType(o: Cabin_Air_Treatment_Supervisor.DryingPathStatus.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Treatment_SupervisorDryingPathStatus_Payload(o: Cabin_Air_Treatment_Supervisor.DryingPathStatus_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Treatment_SupervisorDryingPathStatus_Payload)
      writeCabin_Air_Treatment_SupervisorDryingPathStatusType(o.value)
    }

    def writeCabin_Air_Treatment_SupervisorTreatmentReadinessType(o: Cabin_Air_Treatment_Supervisor.TreatmentReadiness.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Treatment_SupervisorTreatmentReadiness_Payload(o: Cabin_Air_Treatment_Supervisor.TreatmentReadiness_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Treatment_SupervisorTreatmentReadiness_Payload)
      writeCabin_Air_Treatment_SupervisorTreatmentReadinessType(o.value)
    }

    def writeCabin_Air_Treatment_SupervisorReadinessContextType(o: Cabin_Air_Treatment_Supervisor.ReadinessContext.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Treatment_SupervisorReadinessContext_Payload(o: Cabin_Air_Treatment_Supervisor.ReadinessContext_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Treatment_SupervisorReadinessContext_Payload)
      writeCabin_Air_Treatment_SupervisorReadinessContextType(o.value)
    }

    def writeCabin_Air_Treatment_SupervisorAirProposalType(o: Cabin_Air_Treatment_Supervisor.AirProposal.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Treatment_SupervisorAirProposal_Payload(o: Cabin_Air_Treatment_Supervisor.AirProposal_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Treatment_SupervisorAirProposal_Payload)
      writeCabin_Air_Treatment_SupervisorAirProposalType(o.value)
    }

    def writeCabin_Air_Treatment_SupervisorHumidityProposalType(o: Cabin_Air_Treatment_Supervisor.HumidityProposal.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Treatment_SupervisorHumidityProposal_Payload(o: Cabin_Air_Treatment_Supervisor.HumidityProposal_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Treatment_SupervisorHumidityProposal_Payload)
      writeCabin_Air_Treatment_SupervisorHumidityProposalType(o.value)
    }

    def writeCabin_Air_Treatment_SupervisorRecoveryMemoryType(o: Cabin_Air_Treatment_Supervisor.RecoveryMemory.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Treatment_SupervisorRecoveryMemory_Payload(o: Cabin_Air_Treatment_Supervisor.RecoveryMemory_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Treatment_SupervisorRecoveryMemory_Payload)
      writeCabin_Air_Treatment_SupervisorRecoveryMemoryType(o.value)
    }

    def writeCabin_Air_Treatment_SupervisorAirTreatmentCommandType(o: Cabin_Air_Treatment_Supervisor.AirTreatmentCommand.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Treatment_SupervisorAirTreatmentCommand_Payload(o: Cabin_Air_Treatment_Supervisor.AirTreatmentCommand_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Treatment_SupervisorAirTreatmentCommand_Payload)
      writeCabin_Air_Treatment_SupervisorAirTreatmentCommandType(o.value)
    }

    def writeCabin_Air_Treatment_SupervisorStatusModeType(o: Cabin_Air_Treatment_Supervisor.StatusMode.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Treatment_SupervisorStatusMode_Payload(o: Cabin_Air_Treatment_Supervisor.StatusMode_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Treatment_SupervisorStatusMode_Payload)
      writeCabin_Air_Treatment_SupervisorStatusModeType(o.value)
    }

    def writeCabin_Air_Treatment_SupervisorStatusReasonType(o: Cabin_Air_Treatment_Supervisor.StatusReason.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeCabin_Air_Treatment_SupervisorStatusReason_Payload(o: Cabin_Air_Treatment_Supervisor.StatusReason_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Treatment_SupervisorStatusReason_Payload)
      writeCabin_Air_Treatment_SupervisorStatusReasonType(o.value)
    }

    def writeCabin_Air_Treatment_SupervisorTreatmentEquipmentStatus(o: Cabin_Air_Treatment_Supervisor.TreatmentEquipmentStatus): Unit = {
      writer.writeZ(Constants.Cabin_Air_Treatment_SupervisorTreatmentEquipmentStatus)
      writeCabin_Air_Treatment_SupervisorStatusValidityType(o.statusValidity)
      writeCabin_Air_Treatment_SupervisorFilterPathStatusType(o.filtrationChannel)
      writeCabin_Air_Treatment_SupervisorDryingPathStatusType(o.dryingChannel)
    }

    def writeCabin_Air_Treatment_SupervisorTreatmentEquipmentStatus_Payload(o: Cabin_Air_Treatment_Supervisor.TreatmentEquipmentStatus_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Treatment_SupervisorTreatmentEquipmentStatus_Payload)
      writeCabin_Air_Treatment_SupervisorTreatmentEquipmentStatus(o.value)
    }

    def writeCabin_Air_Treatment_SupervisorAirCareSupervisorStatus(o: Cabin_Air_Treatment_Supervisor.AirCareSupervisorStatus): Unit = {
      writer.writeZ(Constants.Cabin_Air_Treatment_SupervisorAirCareSupervisorStatus)
      writeCabin_Air_Treatment_SupervisorStatusModeType(o.mode)
      writeCabin_Air_Treatment_SupervisorStatusReasonType(o.reason)
    }

    def writeCabin_Air_Treatment_SupervisorAirCareSupervisorStatus_Payload(o: Cabin_Air_Treatment_Supervisor.AirCareSupervisorStatus_Payload): Unit = {
      writer.writeZ(Constants.Cabin_Air_Treatment_SupervisorAirCareSupervisorStatus_Payload)
      writeCabin_Air_Treatment_SupervisorAirCareSupervisorStatus(o.value)
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

    def writeCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container(o: Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container): Unit = {
      o match {
        case o: Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_P => writeCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_P(o)
        case o: Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_PS => writeCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_PS(o)
      }
    }

    def writeCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_P(o: Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Cabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_P)
      writeCabin_Air_Treatment_SupervisorAirCareSelectionType(o.api_airCareSelection)
      writeCabin_Air_Treatment_SupervisorRequestValidityType(o.api_requestValidity)
    }

    def writeCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_PS(o: Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Cabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_PS)
      writeCabin_Air_Treatment_SupervisorAirCareSelectionType(o.api_airCareSelection)
      writeCabin_Air_Treatment_SupervisorRequestValidityType(o.api_requestValidity)
    }

    def writeCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container(o: Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container): Unit = {
      o match {
        case o: Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_P => writeCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_P(o)
        case o: Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_PS => writeCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_PS(o)
      }
    }

    def writeCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_P(o: Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Cabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_P)
      writeCabin_Air_Treatment_SupervisorRequestIntentType(o.api_requestIntent)
    }

    def writeCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_PS(o: Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Cabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_PS)
      writeCabin_Air_Treatment_SupervisorRequestIntentType(o.api_requestIntent)
    }

    def writeCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container(o: Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container): Unit = {
      o match {
        case o: Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_P => writeCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_P(o)
        case o: Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_PS => writeCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_PS(o)
      }
    }

    def writeCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_P(o: Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Cabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_P)
      writeCabin_Air_Treatment_SupervisorAirQualityValidityType(o.api_airQualityValidity)
      writeCabin_Air_Treatment_SupervisorCabinAirQualityType(o.api_cabinAirQuality)
    }

    def writeCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_PS(o: Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Cabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_PS)
      writeCabin_Air_Treatment_SupervisorAirQualityValidityType(o.api_airQualityValidity)
      writeCabin_Air_Treatment_SupervisorCabinAirQualityType(o.api_cabinAirQuality)
    }

    def writeCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container(o: Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container): Unit = {
      o match {
        case o: Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_P => writeCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_P(o)
        case o: Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_PS => writeCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_PS(o)
      }
    }

    def writeCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_P(o: Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Cabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_P)
      writeCabin_Air_Treatment_SupervisorAirAssessmentType(o.api_airAssessment)
    }

    def writeCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_PS(o: Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Cabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_PS)
      writeCabin_Air_Treatment_SupervisorAirAssessmentType(o.api_airAssessment)
    }

    def writeCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container(o: Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container): Unit = {
      o match {
        case o: Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_P => writeCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_P(o)
        case o: Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_PS => writeCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_PS(o)
      }
    }

    def writeCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_P(o: Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Cabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_P)
      writeCabin_Air_Treatment_SupervisorCabinHumidityType(o.api_cabinHumidity)
      writeCabin_Air_Treatment_SupervisorHumidityValidityType(o.api_humidityValidity)
    }

    def writeCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_PS(o: Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Cabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_PS)
      writeCabin_Air_Treatment_SupervisorCabinHumidityType(o.api_cabinHumidity)
      writeCabin_Air_Treatment_SupervisorHumidityValidityType(o.api_humidityValidity)
    }

    def writeCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container(o: Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container): Unit = {
      o match {
        case o: Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_P => writeCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_P(o)
        case o: Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_PS => writeCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_PS(o)
      }
    }

    def writeCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_P(o: Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Cabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_P)
      writeCabin_Air_Treatment_SupervisorHumidityAssessmentType(o.api_humidityAssessment)
    }

    def writeCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_PS(o: Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Cabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_PS)
      writeCabin_Air_Treatment_SupervisorHumidityAssessmentType(o.api_humidityAssessment)
    }

    def writeCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container(o: Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container): Unit = {
      o match {
        case o: Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_P => writeCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_P(o)
        case o: Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_PS => writeCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_PS(o)
      }
    }

    def writeCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_P(o: Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Cabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_P)
      writeCabin_Air_Treatment_SupervisorTreatmentEquipmentStatus(o.api_treatmentEquipmentStatus)
    }

    def writeCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_PS(o: Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Cabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_PS)
      writeCabin_Air_Treatment_SupervisorTreatmentEquipmentStatus(o.api_treatmentEquipmentStatus)
    }

    def writeCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container(o: Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container): Unit = {
      o match {
        case o: Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_P => writeCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_P(o)
        case o: Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_PS => writeCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_PS(o)
      }
    }

    def writeCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_P(o: Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Cabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_P)
      writeCabin_Air_Treatment_SupervisorReadinessContextType(o.api_readinessContext)
      writeCabin_Air_Treatment_SupervisorTreatmentReadinessType(o.api_treatmentReadiness)
    }

    def writeCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_PS(o: Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Cabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_PS)
      writeCabin_Air_Treatment_SupervisorReadinessContextType(o.api_readinessContext)
      writeCabin_Air_Treatment_SupervisorTreatmentReadinessType(o.api_treatmentReadiness)
    }

    def writeCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container(o: Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container): Unit = {
      o match {
        case o: Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_P => writeCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_P(o)
        case o: Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_PS => writeCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_PS(o)
      }
    }

    def writeCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_P(o: Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Cabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_P)
      writeCabin_Air_Treatment_SupervisorAirAssessmentType(o.api_airAssessment)
      writeCabin_Air_Treatment_SupervisorRequestIntentType(o.api_requestIntent)
      writeCabin_Air_Treatment_SupervisorTreatmentReadinessType(o.api_treatmentReadiness)
    }

    def writeCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_PS(o: Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Cabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_PS)
      writeCabin_Air_Treatment_SupervisorAirAssessmentType(o.api_airAssessment)
      writeCabin_Air_Treatment_SupervisorRequestIntentType(o.api_requestIntent)
      writeCabin_Air_Treatment_SupervisorTreatmentReadinessType(o.api_treatmentReadiness)
    }

    def writeCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container(o: Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container): Unit = {
      o match {
        case o: Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_P => writeCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_P(o)
        case o: Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_PS => writeCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_PS(o)
      }
    }

    def writeCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_P(o: Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Cabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_P)
      writeCabin_Air_Treatment_SupervisorAirProposalType(o.api_airProposal)
    }

    def writeCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_PS(o: Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Cabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_PS)
      writeCabin_Air_Treatment_SupervisorAirProposalType(o.api_airProposal)
    }

    def writeCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container(o: Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container): Unit = {
      o match {
        case o: Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_P => writeCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_P(o)
        case o: Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_PS => writeCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_PS(o)
      }
    }

    def writeCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_P(o: Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Cabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_P)
      writeCabin_Air_Treatment_SupervisorHumidityAssessmentType(o.api_humidityAssessment)
      writeCabin_Air_Treatment_SupervisorRequestIntentType(o.api_requestIntent)
      writeCabin_Air_Treatment_SupervisorTreatmentReadinessType(o.api_treatmentReadiness)
    }

    def writeCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_PS(o: Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Cabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_PS)
      writeCabin_Air_Treatment_SupervisorHumidityAssessmentType(o.api_humidityAssessment)
      writeCabin_Air_Treatment_SupervisorRequestIntentType(o.api_requestIntent)
      writeCabin_Air_Treatment_SupervisorTreatmentReadinessType(o.api_treatmentReadiness)
    }

    def writeCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container(o: Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container): Unit = {
      o match {
        case o: Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_P => writeCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_P(o)
        case o: Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_PS => writeCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_PS(o)
      }
    }

    def writeCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_P(o: Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Cabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_P)
      writeCabin_Air_Treatment_SupervisorHumidityProposalType(o.api_humidityProposal)
    }

    def writeCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_PS(o: Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Cabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_PS)
      writeCabin_Air_Treatment_SupervisorHumidityProposalType(o.api_humidityProposal)
    }

    def writeCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container(o: Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container): Unit = {
      o match {
        case o: Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_P => writeCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_P(o)
        case o: Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_PS => writeCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_PS(o)
      }
    }

    def writeCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_P(o: Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Cabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_P)
      writeCabin_Air_Treatment_SupervisorReadinessContextType(o.api_readinessContext)
      writeCabin_Air_Treatment_SupervisorRequestIntentType(o.api_requestIntent)
    }

    def writeCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_PS(o: Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Cabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_PS)
      writeCabin_Air_Treatment_SupervisorReadinessContextType(o.api_readinessContext)
      writeCabin_Air_Treatment_SupervisorRequestIntentType(o.api_requestIntent)
    }

    def writeCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container(o: Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container): Unit = {
      o match {
        case o: Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_P => writeCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_P(o)
        case o: Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_PS => writeCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_PS(o)
      }
    }

    def writeCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_P(o: Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Cabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_P)
      writeCabin_Air_Treatment_SupervisorRecoveryMemoryType(o.api_recoveryGate)
    }

    def writeCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_PS(o: Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Cabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_PS)
      writeCabin_Air_Treatment_SupervisorRecoveryMemoryType(o.api_recoveryGate)
    }

    def writeCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container(o: Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container): Unit = {
      o match {
        case o: Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_P => writeCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_P(o)
        case o: Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_PS => writeCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_PS(o)
      }
    }

    def writeCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_P(o: Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Cabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_P)
      writeCabin_Air_Treatment_SupervisorAirProposalType(o.api_airProposal)
      writeCabin_Air_Treatment_SupervisorHumidityProposalType(o.api_humidityProposal)
      writeCabin_Air_Treatment_SupervisorRecoveryMemoryType(o.api_recoveryGate)
      writeCabin_Air_Treatment_SupervisorRequestIntentType(o.api_requestIntent)
    }

    def writeCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_PS(o: Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Cabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_PS)
      writeCabin_Air_Treatment_SupervisorAirProposalType(o.api_airProposal)
      writeCabin_Air_Treatment_SupervisorHumidityProposalType(o.api_humidityProposal)
      writeCabin_Air_Treatment_SupervisorRecoveryMemoryType(o.api_recoveryGate)
      writeCabin_Air_Treatment_SupervisorRequestIntentType(o.api_requestIntent)
    }

    def writeCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container(o: Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container): Unit = {
      o match {
        case o: Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_P => writeCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_P(o)
        case o: Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_PS => writeCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_PS(o)
      }
    }

    def writeCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_P(o: Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Cabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_P)
      writeCabin_Air_Treatment_SupervisorAirCareSupervisorStatus(o.api_airCareSupervisorStatus)
      writeCabin_Air_Treatment_SupervisorAirTreatmentCommandType(o.api_airTreatmentCommand)
    }

    def writeCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_PS(o: Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Cabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_PS)
      writeCabin_Air_Treatment_SupervisorAirCareSupervisorStatus(o.api_airCareSupervisorStatus)
      writeCabin_Air_Treatment_SupervisorAirTreatmentCommandType(o.api_airTreatmentCommand)
    }

    def writeruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeutilContainer(o: util.Container): Unit = {
      o match {
        case o: util.EmptyContainer => writeutilEmptyContainer(o)
        case o: Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_P => writeCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_P(o)
        case o: Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_PS => writeCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_PS(o)
        case o: Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_P => writeCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_P(o)
        case o: Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_PS => writeCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_PS(o)
        case o: Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_P => writeCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_P(o)
        case o: Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_PS => writeCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_PS(o)
        case o: Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_P => writeCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_P(o)
        case o: Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_PS => writeCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_PS(o)
        case o: Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_P => writeCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_P(o)
        case o: Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_PS => writeCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_PS(o)
        case o: Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_P => writeCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_P(o)
        case o: Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_PS => writeCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_PS(o)
        case o: Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_P => writeCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_P(o)
        case o: Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_PS => writeCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_PS(o)
        case o: Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_P => writeCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_P(o)
        case o: Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_PS => writeCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_PS(o)
        case o: Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_P => writeCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_P(o)
        case o: Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_PS => writeCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_PS(o)
        case o: Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_P => writeCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_P(o)
        case o: Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_PS => writeCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_PS(o)
        case o: Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_P => writeCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_P(o)
        case o: Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_PS => writeCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_PS(o)
        case o: Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_P => writeCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_P(o)
        case o: Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_PS => writeCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_PS(o)
        case o: Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_P => writeCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_P(o)
        case o: Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_PS => writeCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_PS(o)
        case o: Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_P => writeCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_P(o)
        case o: Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_PS => writeCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_PS(o)
        case o: Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_P => writeCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_P(o)
        case o: Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_PS => writeCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_PS(o)
        case o: Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_P => writeCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_P(o)
        case o: Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_PS => writeCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_PS(o)
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
        case o: Cabin_Air_Treatment_Supervisor.StatusMode_Payload => writeCabin_Air_Treatment_SupervisorStatusMode_Payload(o)
        case o: Cabin_Air_Treatment_Supervisor.AirProposal_Payload => writeCabin_Air_Treatment_SupervisorAirProposal_Payload(o)
        case o: Cabin_Air_Treatment_Supervisor.StatusReason_Payload => writeCabin_Air_Treatment_SupervisorStatusReason_Payload(o)
        case o: Cabin_Air_Treatment_Supervisor.CabinHumidity_Payload => writeCabin_Air_Treatment_SupervisorCabinHumidity_Payload(o)
        case o: Cabin_Air_Treatment_Supervisor.AirAssessment_Payload => writeCabin_Air_Treatment_SupervisorAirAssessment_Payload(o)
        case o: Cabin_Air_Treatment_Supervisor.RequestIntent_Payload => writeCabin_Air_Treatment_SupervisorRequestIntent_Payload(o)
        case o: Cabin_Air_Treatment_Supervisor.StatusValidity_Payload => writeCabin_Air_Treatment_SupervisorStatusValidity_Payload(o)
        case o: Cabin_Air_Treatment_Supervisor.RecoveryMemory_Payload => writeCabin_Air_Treatment_SupervisorRecoveryMemory_Payload(o)
        case o: Cabin_Air_Treatment_Supervisor.RequestValidity_Payload => writeCabin_Air_Treatment_SupervisorRequestValidity_Payload(o)
        case o: Cabin_Air_Treatment_Supervisor.CabinAirQuality_Payload => writeCabin_Air_Treatment_SupervisorCabinAirQuality_Payload(o)
        case o: Cabin_Air_Treatment_Supervisor.HumidityValidity_Payload => writeCabin_Air_Treatment_SupervisorHumidityValidity_Payload(o)
        case o: Cabin_Air_Treatment_Supervisor.AirCareSelection_Payload => writeCabin_Air_Treatment_SupervisorAirCareSelection_Payload(o)
        case o: Cabin_Air_Treatment_Supervisor.FilterPathStatus_Payload => writeCabin_Air_Treatment_SupervisorFilterPathStatus_Payload(o)
        case o: Cabin_Air_Treatment_Supervisor.DryingPathStatus_Payload => writeCabin_Air_Treatment_SupervisorDryingPathStatus_Payload(o)
        case o: Cabin_Air_Treatment_Supervisor.ReadinessContext_Payload => writeCabin_Air_Treatment_SupervisorReadinessContext_Payload(o)
        case o: Cabin_Air_Treatment_Supervisor.HumidityProposal_Payload => writeCabin_Air_Treatment_SupervisorHumidityProposal_Payload(o)
        case o: Cabin_Air_Treatment_Supervisor.AirQualityValidity_Payload => writeCabin_Air_Treatment_SupervisorAirQualityValidity_Payload(o)
        case o: Cabin_Air_Treatment_Supervisor.HumidityAssessment_Payload => writeCabin_Air_Treatment_SupervisorHumidityAssessment_Payload(o)
        case o: Cabin_Air_Treatment_Supervisor.TreatmentReadiness_Payload => writeCabin_Air_Treatment_SupervisorTreatmentReadiness_Payload(o)
        case o: Cabin_Air_Treatment_Supervisor.AirTreatmentCommand_Payload => writeCabin_Air_Treatment_SupervisorAirTreatmentCommand_Payload(o)
        case o: Cabin_Air_Treatment_Supervisor.AirCareSupervisorStatus_Payload => writeCabin_Air_Treatment_SupervisorAirCareSupervisorStatus_Payload(o)
        case o: Cabin_Air_Treatment_Supervisor.TreatmentEquipmentStatus_Payload => writeCabin_Air_Treatment_SupervisorTreatmentEquipmentStatus_Payload(o)
        case o: Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_P => writeCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_P(o)
        case o: Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_PS => writeCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_PS(o)
        case o: Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_P => writeCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_P(o)
        case o: Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_PS => writeCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_PS(o)
        case o: Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_P => writeCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_P(o)
        case o: Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_PS => writeCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_PS(o)
        case o: Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_P => writeCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_P(o)
        case o: Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_PS => writeCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_PS(o)
        case o: Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_P => writeCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_P(o)
        case o: Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_PS => writeCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_PS(o)
        case o: Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_P => writeCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_P(o)
        case o: Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_PS => writeCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_PS(o)
        case o: Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_P => writeCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_P(o)
        case o: Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_PS => writeCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_PS(o)
        case o: Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_P => writeCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_P(o)
        case o: Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_PS => writeCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_PS(o)
        case o: Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_P => writeCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_P(o)
        case o: Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_PS => writeCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_PS(o)
        case o: Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_P => writeCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_P(o)
        case o: Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_PS => writeCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_PS(o)
        case o: Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_P => writeCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_P(o)
        case o: Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_PS => writeCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_PS(o)
        case o: Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_P => writeCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_P(o)
        case o: Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_PS => writeCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_PS(o)
        case o: Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_P => writeCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_P(o)
        case o: Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_PS => writeCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_PS(o)
        case o: Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_P => writeCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_P(o)
        case o: Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_PS => writeCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_PS(o)
        case o: Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_P => writeCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_P(o)
        case o: Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_PS => writeCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_PS(o)
        case o: Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_P => writeCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_P(o)
        case o: Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_PS => writeCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_PS(o)
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

    def readCabin_Air_Treatment_SupervisorAirCareSelectionType(): Cabin_Air_Treatment_Supervisor.AirCareSelection.Type = {
      val r = reader.readZ()
      return Cabin_Air_Treatment_Supervisor.AirCareSelection.byOrdinal(r).get
    }

    def readCabin_Air_Treatment_SupervisorAirCareSelection_Payload(): Cabin_Air_Treatment_Supervisor.AirCareSelection_Payload = {
      val r = readCabin_Air_Treatment_SupervisorAirCareSelection_PayloadT(F)
      return r
    }

    def readCabin_Air_Treatment_SupervisorAirCareSelection_PayloadT(typeParsed: B): Cabin_Air_Treatment_Supervisor.AirCareSelection_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Treatment_SupervisorAirCareSelection_Payload)
      }
      val value = readCabin_Air_Treatment_SupervisorAirCareSelectionType()
      return Cabin_Air_Treatment_Supervisor.AirCareSelection_Payload(value)
    }

    def readCabin_Air_Treatment_SupervisorRequestValidityType(): Cabin_Air_Treatment_Supervisor.RequestValidity.Type = {
      val r = reader.readZ()
      return Cabin_Air_Treatment_Supervisor.RequestValidity.byOrdinal(r).get
    }

    def readCabin_Air_Treatment_SupervisorRequestValidity_Payload(): Cabin_Air_Treatment_Supervisor.RequestValidity_Payload = {
      val r = readCabin_Air_Treatment_SupervisorRequestValidity_PayloadT(F)
      return r
    }

    def readCabin_Air_Treatment_SupervisorRequestValidity_PayloadT(typeParsed: B): Cabin_Air_Treatment_Supervisor.RequestValidity_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Treatment_SupervisorRequestValidity_Payload)
      }
      val value = readCabin_Air_Treatment_SupervisorRequestValidityType()
      return Cabin_Air_Treatment_Supervisor.RequestValidity_Payload(value)
    }

    def readCabin_Air_Treatment_SupervisorRequestIntentType(): Cabin_Air_Treatment_Supervisor.RequestIntent.Type = {
      val r = reader.readZ()
      return Cabin_Air_Treatment_Supervisor.RequestIntent.byOrdinal(r).get
    }

    def readCabin_Air_Treatment_SupervisorRequestIntent_Payload(): Cabin_Air_Treatment_Supervisor.RequestIntent_Payload = {
      val r = readCabin_Air_Treatment_SupervisorRequestIntent_PayloadT(F)
      return r
    }

    def readCabin_Air_Treatment_SupervisorRequestIntent_PayloadT(typeParsed: B): Cabin_Air_Treatment_Supervisor.RequestIntent_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Treatment_SupervisorRequestIntent_Payload)
      }
      val value = readCabin_Air_Treatment_SupervisorRequestIntentType()
      return Cabin_Air_Treatment_Supervisor.RequestIntent_Payload(value)
    }

    def readCabin_Air_Treatment_SupervisorCabinAirQualityType(): Cabin_Air_Treatment_Supervisor.CabinAirQuality.Type = {
      val r = reader.readZ()
      return Cabin_Air_Treatment_Supervisor.CabinAirQuality.byOrdinal(r).get
    }

    def readCabin_Air_Treatment_SupervisorCabinAirQuality_Payload(): Cabin_Air_Treatment_Supervisor.CabinAirQuality_Payload = {
      val r = readCabin_Air_Treatment_SupervisorCabinAirQuality_PayloadT(F)
      return r
    }

    def readCabin_Air_Treatment_SupervisorCabinAirQuality_PayloadT(typeParsed: B): Cabin_Air_Treatment_Supervisor.CabinAirQuality_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Treatment_SupervisorCabinAirQuality_Payload)
      }
      val value = readCabin_Air_Treatment_SupervisorCabinAirQualityType()
      return Cabin_Air_Treatment_Supervisor.CabinAirQuality_Payload(value)
    }

    def readCabin_Air_Treatment_SupervisorAirQualityValidityType(): Cabin_Air_Treatment_Supervisor.AirQualityValidity.Type = {
      val r = reader.readZ()
      return Cabin_Air_Treatment_Supervisor.AirQualityValidity.byOrdinal(r).get
    }

    def readCabin_Air_Treatment_SupervisorAirQualityValidity_Payload(): Cabin_Air_Treatment_Supervisor.AirQualityValidity_Payload = {
      val r = readCabin_Air_Treatment_SupervisorAirQualityValidity_PayloadT(F)
      return r
    }

    def readCabin_Air_Treatment_SupervisorAirQualityValidity_PayloadT(typeParsed: B): Cabin_Air_Treatment_Supervisor.AirQualityValidity_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Treatment_SupervisorAirQualityValidity_Payload)
      }
      val value = readCabin_Air_Treatment_SupervisorAirQualityValidityType()
      return Cabin_Air_Treatment_Supervisor.AirQualityValidity_Payload(value)
    }

    def readCabin_Air_Treatment_SupervisorAirAssessmentType(): Cabin_Air_Treatment_Supervisor.AirAssessment.Type = {
      val r = reader.readZ()
      return Cabin_Air_Treatment_Supervisor.AirAssessment.byOrdinal(r).get
    }

    def readCabin_Air_Treatment_SupervisorAirAssessment_Payload(): Cabin_Air_Treatment_Supervisor.AirAssessment_Payload = {
      val r = readCabin_Air_Treatment_SupervisorAirAssessment_PayloadT(F)
      return r
    }

    def readCabin_Air_Treatment_SupervisorAirAssessment_PayloadT(typeParsed: B): Cabin_Air_Treatment_Supervisor.AirAssessment_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Treatment_SupervisorAirAssessment_Payload)
      }
      val value = readCabin_Air_Treatment_SupervisorAirAssessmentType()
      return Cabin_Air_Treatment_Supervisor.AirAssessment_Payload(value)
    }

    def readCabin_Air_Treatment_SupervisorCabinHumidityType(): Cabin_Air_Treatment_Supervisor.CabinHumidity.Type = {
      val r = reader.readZ()
      return Cabin_Air_Treatment_Supervisor.CabinHumidity.byOrdinal(r).get
    }

    def readCabin_Air_Treatment_SupervisorCabinHumidity_Payload(): Cabin_Air_Treatment_Supervisor.CabinHumidity_Payload = {
      val r = readCabin_Air_Treatment_SupervisorCabinHumidity_PayloadT(F)
      return r
    }

    def readCabin_Air_Treatment_SupervisorCabinHumidity_PayloadT(typeParsed: B): Cabin_Air_Treatment_Supervisor.CabinHumidity_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Treatment_SupervisorCabinHumidity_Payload)
      }
      val value = readCabin_Air_Treatment_SupervisorCabinHumidityType()
      return Cabin_Air_Treatment_Supervisor.CabinHumidity_Payload(value)
    }

    def readCabin_Air_Treatment_SupervisorHumidityValidityType(): Cabin_Air_Treatment_Supervisor.HumidityValidity.Type = {
      val r = reader.readZ()
      return Cabin_Air_Treatment_Supervisor.HumidityValidity.byOrdinal(r).get
    }

    def readCabin_Air_Treatment_SupervisorHumidityValidity_Payload(): Cabin_Air_Treatment_Supervisor.HumidityValidity_Payload = {
      val r = readCabin_Air_Treatment_SupervisorHumidityValidity_PayloadT(F)
      return r
    }

    def readCabin_Air_Treatment_SupervisorHumidityValidity_PayloadT(typeParsed: B): Cabin_Air_Treatment_Supervisor.HumidityValidity_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Treatment_SupervisorHumidityValidity_Payload)
      }
      val value = readCabin_Air_Treatment_SupervisorHumidityValidityType()
      return Cabin_Air_Treatment_Supervisor.HumidityValidity_Payload(value)
    }

    def readCabin_Air_Treatment_SupervisorHumidityAssessmentType(): Cabin_Air_Treatment_Supervisor.HumidityAssessment.Type = {
      val r = reader.readZ()
      return Cabin_Air_Treatment_Supervisor.HumidityAssessment.byOrdinal(r).get
    }

    def readCabin_Air_Treatment_SupervisorHumidityAssessment_Payload(): Cabin_Air_Treatment_Supervisor.HumidityAssessment_Payload = {
      val r = readCabin_Air_Treatment_SupervisorHumidityAssessment_PayloadT(F)
      return r
    }

    def readCabin_Air_Treatment_SupervisorHumidityAssessment_PayloadT(typeParsed: B): Cabin_Air_Treatment_Supervisor.HumidityAssessment_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Treatment_SupervisorHumidityAssessment_Payload)
      }
      val value = readCabin_Air_Treatment_SupervisorHumidityAssessmentType()
      return Cabin_Air_Treatment_Supervisor.HumidityAssessment_Payload(value)
    }

    def readCabin_Air_Treatment_SupervisorStatusValidityType(): Cabin_Air_Treatment_Supervisor.StatusValidity.Type = {
      val r = reader.readZ()
      return Cabin_Air_Treatment_Supervisor.StatusValidity.byOrdinal(r).get
    }

    def readCabin_Air_Treatment_SupervisorStatusValidity_Payload(): Cabin_Air_Treatment_Supervisor.StatusValidity_Payload = {
      val r = readCabin_Air_Treatment_SupervisorStatusValidity_PayloadT(F)
      return r
    }

    def readCabin_Air_Treatment_SupervisorStatusValidity_PayloadT(typeParsed: B): Cabin_Air_Treatment_Supervisor.StatusValidity_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Treatment_SupervisorStatusValidity_Payload)
      }
      val value = readCabin_Air_Treatment_SupervisorStatusValidityType()
      return Cabin_Air_Treatment_Supervisor.StatusValidity_Payload(value)
    }

    def readCabin_Air_Treatment_SupervisorFilterPathStatusType(): Cabin_Air_Treatment_Supervisor.FilterPathStatus.Type = {
      val r = reader.readZ()
      return Cabin_Air_Treatment_Supervisor.FilterPathStatus.byOrdinal(r).get
    }

    def readCabin_Air_Treatment_SupervisorFilterPathStatus_Payload(): Cabin_Air_Treatment_Supervisor.FilterPathStatus_Payload = {
      val r = readCabin_Air_Treatment_SupervisorFilterPathStatus_PayloadT(F)
      return r
    }

    def readCabin_Air_Treatment_SupervisorFilterPathStatus_PayloadT(typeParsed: B): Cabin_Air_Treatment_Supervisor.FilterPathStatus_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Treatment_SupervisorFilterPathStatus_Payload)
      }
      val value = readCabin_Air_Treatment_SupervisorFilterPathStatusType()
      return Cabin_Air_Treatment_Supervisor.FilterPathStatus_Payload(value)
    }

    def readCabin_Air_Treatment_SupervisorDryingPathStatusType(): Cabin_Air_Treatment_Supervisor.DryingPathStatus.Type = {
      val r = reader.readZ()
      return Cabin_Air_Treatment_Supervisor.DryingPathStatus.byOrdinal(r).get
    }

    def readCabin_Air_Treatment_SupervisorDryingPathStatus_Payload(): Cabin_Air_Treatment_Supervisor.DryingPathStatus_Payload = {
      val r = readCabin_Air_Treatment_SupervisorDryingPathStatus_PayloadT(F)
      return r
    }

    def readCabin_Air_Treatment_SupervisorDryingPathStatus_PayloadT(typeParsed: B): Cabin_Air_Treatment_Supervisor.DryingPathStatus_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Treatment_SupervisorDryingPathStatus_Payload)
      }
      val value = readCabin_Air_Treatment_SupervisorDryingPathStatusType()
      return Cabin_Air_Treatment_Supervisor.DryingPathStatus_Payload(value)
    }

    def readCabin_Air_Treatment_SupervisorTreatmentReadinessType(): Cabin_Air_Treatment_Supervisor.TreatmentReadiness.Type = {
      val r = reader.readZ()
      return Cabin_Air_Treatment_Supervisor.TreatmentReadiness.byOrdinal(r).get
    }

    def readCabin_Air_Treatment_SupervisorTreatmentReadiness_Payload(): Cabin_Air_Treatment_Supervisor.TreatmentReadiness_Payload = {
      val r = readCabin_Air_Treatment_SupervisorTreatmentReadiness_PayloadT(F)
      return r
    }

    def readCabin_Air_Treatment_SupervisorTreatmentReadiness_PayloadT(typeParsed: B): Cabin_Air_Treatment_Supervisor.TreatmentReadiness_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Treatment_SupervisorTreatmentReadiness_Payload)
      }
      val value = readCabin_Air_Treatment_SupervisorTreatmentReadinessType()
      return Cabin_Air_Treatment_Supervisor.TreatmentReadiness_Payload(value)
    }

    def readCabin_Air_Treatment_SupervisorReadinessContextType(): Cabin_Air_Treatment_Supervisor.ReadinessContext.Type = {
      val r = reader.readZ()
      return Cabin_Air_Treatment_Supervisor.ReadinessContext.byOrdinal(r).get
    }

    def readCabin_Air_Treatment_SupervisorReadinessContext_Payload(): Cabin_Air_Treatment_Supervisor.ReadinessContext_Payload = {
      val r = readCabin_Air_Treatment_SupervisorReadinessContext_PayloadT(F)
      return r
    }

    def readCabin_Air_Treatment_SupervisorReadinessContext_PayloadT(typeParsed: B): Cabin_Air_Treatment_Supervisor.ReadinessContext_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Treatment_SupervisorReadinessContext_Payload)
      }
      val value = readCabin_Air_Treatment_SupervisorReadinessContextType()
      return Cabin_Air_Treatment_Supervisor.ReadinessContext_Payload(value)
    }

    def readCabin_Air_Treatment_SupervisorAirProposalType(): Cabin_Air_Treatment_Supervisor.AirProposal.Type = {
      val r = reader.readZ()
      return Cabin_Air_Treatment_Supervisor.AirProposal.byOrdinal(r).get
    }

    def readCabin_Air_Treatment_SupervisorAirProposal_Payload(): Cabin_Air_Treatment_Supervisor.AirProposal_Payload = {
      val r = readCabin_Air_Treatment_SupervisorAirProposal_PayloadT(F)
      return r
    }

    def readCabin_Air_Treatment_SupervisorAirProposal_PayloadT(typeParsed: B): Cabin_Air_Treatment_Supervisor.AirProposal_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Treatment_SupervisorAirProposal_Payload)
      }
      val value = readCabin_Air_Treatment_SupervisorAirProposalType()
      return Cabin_Air_Treatment_Supervisor.AirProposal_Payload(value)
    }

    def readCabin_Air_Treatment_SupervisorHumidityProposalType(): Cabin_Air_Treatment_Supervisor.HumidityProposal.Type = {
      val r = reader.readZ()
      return Cabin_Air_Treatment_Supervisor.HumidityProposal.byOrdinal(r).get
    }

    def readCabin_Air_Treatment_SupervisorHumidityProposal_Payload(): Cabin_Air_Treatment_Supervisor.HumidityProposal_Payload = {
      val r = readCabin_Air_Treatment_SupervisorHumidityProposal_PayloadT(F)
      return r
    }

    def readCabin_Air_Treatment_SupervisorHumidityProposal_PayloadT(typeParsed: B): Cabin_Air_Treatment_Supervisor.HumidityProposal_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Treatment_SupervisorHumidityProposal_Payload)
      }
      val value = readCabin_Air_Treatment_SupervisorHumidityProposalType()
      return Cabin_Air_Treatment_Supervisor.HumidityProposal_Payload(value)
    }

    def readCabin_Air_Treatment_SupervisorRecoveryMemoryType(): Cabin_Air_Treatment_Supervisor.RecoveryMemory.Type = {
      val r = reader.readZ()
      return Cabin_Air_Treatment_Supervisor.RecoveryMemory.byOrdinal(r).get
    }

    def readCabin_Air_Treatment_SupervisorRecoveryMemory_Payload(): Cabin_Air_Treatment_Supervisor.RecoveryMemory_Payload = {
      val r = readCabin_Air_Treatment_SupervisorRecoveryMemory_PayloadT(F)
      return r
    }

    def readCabin_Air_Treatment_SupervisorRecoveryMemory_PayloadT(typeParsed: B): Cabin_Air_Treatment_Supervisor.RecoveryMemory_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Treatment_SupervisorRecoveryMemory_Payload)
      }
      val value = readCabin_Air_Treatment_SupervisorRecoveryMemoryType()
      return Cabin_Air_Treatment_Supervisor.RecoveryMemory_Payload(value)
    }

    def readCabin_Air_Treatment_SupervisorAirTreatmentCommandType(): Cabin_Air_Treatment_Supervisor.AirTreatmentCommand.Type = {
      val r = reader.readZ()
      return Cabin_Air_Treatment_Supervisor.AirTreatmentCommand.byOrdinal(r).get
    }

    def readCabin_Air_Treatment_SupervisorAirTreatmentCommand_Payload(): Cabin_Air_Treatment_Supervisor.AirTreatmentCommand_Payload = {
      val r = readCabin_Air_Treatment_SupervisorAirTreatmentCommand_PayloadT(F)
      return r
    }

    def readCabin_Air_Treatment_SupervisorAirTreatmentCommand_PayloadT(typeParsed: B): Cabin_Air_Treatment_Supervisor.AirTreatmentCommand_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Treatment_SupervisorAirTreatmentCommand_Payload)
      }
      val value = readCabin_Air_Treatment_SupervisorAirTreatmentCommandType()
      return Cabin_Air_Treatment_Supervisor.AirTreatmentCommand_Payload(value)
    }

    def readCabin_Air_Treatment_SupervisorStatusModeType(): Cabin_Air_Treatment_Supervisor.StatusMode.Type = {
      val r = reader.readZ()
      return Cabin_Air_Treatment_Supervisor.StatusMode.byOrdinal(r).get
    }

    def readCabin_Air_Treatment_SupervisorStatusMode_Payload(): Cabin_Air_Treatment_Supervisor.StatusMode_Payload = {
      val r = readCabin_Air_Treatment_SupervisorStatusMode_PayloadT(F)
      return r
    }

    def readCabin_Air_Treatment_SupervisorStatusMode_PayloadT(typeParsed: B): Cabin_Air_Treatment_Supervisor.StatusMode_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Treatment_SupervisorStatusMode_Payload)
      }
      val value = readCabin_Air_Treatment_SupervisorStatusModeType()
      return Cabin_Air_Treatment_Supervisor.StatusMode_Payload(value)
    }

    def readCabin_Air_Treatment_SupervisorStatusReasonType(): Cabin_Air_Treatment_Supervisor.StatusReason.Type = {
      val r = reader.readZ()
      return Cabin_Air_Treatment_Supervisor.StatusReason.byOrdinal(r).get
    }

    def readCabin_Air_Treatment_SupervisorStatusReason_Payload(): Cabin_Air_Treatment_Supervisor.StatusReason_Payload = {
      val r = readCabin_Air_Treatment_SupervisorStatusReason_PayloadT(F)
      return r
    }

    def readCabin_Air_Treatment_SupervisorStatusReason_PayloadT(typeParsed: B): Cabin_Air_Treatment_Supervisor.StatusReason_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Treatment_SupervisorStatusReason_Payload)
      }
      val value = readCabin_Air_Treatment_SupervisorStatusReasonType()
      return Cabin_Air_Treatment_Supervisor.StatusReason_Payload(value)
    }

    def readCabin_Air_Treatment_SupervisorTreatmentEquipmentStatus(): Cabin_Air_Treatment_Supervisor.TreatmentEquipmentStatus = {
      val r = readCabin_Air_Treatment_SupervisorTreatmentEquipmentStatusT(F)
      return r
    }

    def readCabin_Air_Treatment_SupervisorTreatmentEquipmentStatusT(typeParsed: B): Cabin_Air_Treatment_Supervisor.TreatmentEquipmentStatus = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Treatment_SupervisorTreatmentEquipmentStatus)
      }
      val statusValidity = readCabin_Air_Treatment_SupervisorStatusValidityType()
      val filtrationChannel = readCabin_Air_Treatment_SupervisorFilterPathStatusType()
      val dryingChannel = readCabin_Air_Treatment_SupervisorDryingPathStatusType()
      return Cabin_Air_Treatment_Supervisor.TreatmentEquipmentStatus(statusValidity, filtrationChannel, dryingChannel)
    }

    def readCabin_Air_Treatment_SupervisorTreatmentEquipmentStatus_Payload(): Cabin_Air_Treatment_Supervisor.TreatmentEquipmentStatus_Payload = {
      val r = readCabin_Air_Treatment_SupervisorTreatmentEquipmentStatus_PayloadT(F)
      return r
    }

    def readCabin_Air_Treatment_SupervisorTreatmentEquipmentStatus_PayloadT(typeParsed: B): Cabin_Air_Treatment_Supervisor.TreatmentEquipmentStatus_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Treatment_SupervisorTreatmentEquipmentStatus_Payload)
      }
      val value = readCabin_Air_Treatment_SupervisorTreatmentEquipmentStatus()
      return Cabin_Air_Treatment_Supervisor.TreatmentEquipmentStatus_Payload(value)
    }

    def readCabin_Air_Treatment_SupervisorAirCareSupervisorStatus(): Cabin_Air_Treatment_Supervisor.AirCareSupervisorStatus = {
      val r = readCabin_Air_Treatment_SupervisorAirCareSupervisorStatusT(F)
      return r
    }

    def readCabin_Air_Treatment_SupervisorAirCareSupervisorStatusT(typeParsed: B): Cabin_Air_Treatment_Supervisor.AirCareSupervisorStatus = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Treatment_SupervisorAirCareSupervisorStatus)
      }
      val mode = readCabin_Air_Treatment_SupervisorStatusModeType()
      val reason = readCabin_Air_Treatment_SupervisorStatusReasonType()
      return Cabin_Air_Treatment_Supervisor.AirCareSupervisorStatus(mode, reason)
    }

    def readCabin_Air_Treatment_SupervisorAirCareSupervisorStatus_Payload(): Cabin_Air_Treatment_Supervisor.AirCareSupervisorStatus_Payload = {
      val r = readCabin_Air_Treatment_SupervisorAirCareSupervisorStatus_PayloadT(F)
      return r
    }

    def readCabin_Air_Treatment_SupervisorAirCareSupervisorStatus_PayloadT(typeParsed: B): Cabin_Air_Treatment_Supervisor.AirCareSupervisorStatus_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Treatment_SupervisorAirCareSupervisorStatus_Payload)
      }
      val value = readCabin_Air_Treatment_SupervisorAirCareSupervisorStatus()
      return Cabin_Air_Treatment_Supervisor.AirCareSupervisorStatus_Payload(value)
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

    def readCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container(): Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Cabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_P => val r = readCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_PS => val r = readCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container.")
          val r = readCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_P(): Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_P = {
      val r = readCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_PT(F)
      return r
    }

    def readCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_PT(typeParsed: B): Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_P)
      }
      val api_airCareSelection = readCabin_Air_Treatment_SupervisorAirCareSelectionType()
      val api_requestValidity = readCabin_Air_Treatment_SupervisorRequestValidityType()
      return Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_P(api_airCareSelection, api_requestValidity)
    }

    def readCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_PS(): Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_PS = {
      val r = readCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_PST(F)
      return r
    }

    def readCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_PST(typeParsed: B): Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_PS)
      }
      val api_airCareSelection = readCabin_Air_Treatment_SupervisorAirCareSelectionType()
      val api_requestValidity = readCabin_Air_Treatment_SupervisorRequestValidityType()
      return Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_PS(api_airCareSelection, api_requestValidity)
    }

    def readCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container(): Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Cabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_P => val r = readCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_PS => val r = readCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container.")
          val r = readCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_P(): Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_P = {
      val r = readCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_PT(F)
      return r
    }

    def readCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_PT(typeParsed: B): Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_P)
      }
      val api_requestIntent = readCabin_Air_Treatment_SupervisorRequestIntentType()
      return Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_P(api_requestIntent)
    }

    def readCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_PS(): Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_PS = {
      val r = readCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_PST(F)
      return r
    }

    def readCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_PST(typeParsed: B): Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_PS)
      }
      val api_requestIntent = readCabin_Air_Treatment_SupervisorRequestIntentType()
      return Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_PS(api_requestIntent)
    }

    def readCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container(): Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Cabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_P => val r = readCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_PS => val r = readCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container.")
          val r = readCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_P(): Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_P = {
      val r = readCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_PT(F)
      return r
    }

    def readCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_PT(typeParsed: B): Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_P)
      }
      val api_airQualityValidity = readCabin_Air_Treatment_SupervisorAirQualityValidityType()
      val api_cabinAirQuality = readCabin_Air_Treatment_SupervisorCabinAirQualityType()
      return Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_P(api_airQualityValidity, api_cabinAirQuality)
    }

    def readCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_PS(): Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_PS = {
      val r = readCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_PST(F)
      return r
    }

    def readCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_PST(typeParsed: B): Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_PS)
      }
      val api_airQualityValidity = readCabin_Air_Treatment_SupervisorAirQualityValidityType()
      val api_cabinAirQuality = readCabin_Air_Treatment_SupervisorCabinAirQualityType()
      return Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_PS(api_airQualityValidity, api_cabinAirQuality)
    }

    def readCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container(): Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Cabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_P => val r = readCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_PS => val r = readCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container.")
          val r = readCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_P(): Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_P = {
      val r = readCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_PT(F)
      return r
    }

    def readCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_PT(typeParsed: B): Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_P)
      }
      val api_airAssessment = readCabin_Air_Treatment_SupervisorAirAssessmentType()
      return Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_P(api_airAssessment)
    }

    def readCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_PS(): Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_PS = {
      val r = readCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_PST(F)
      return r
    }

    def readCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_PST(typeParsed: B): Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_PS)
      }
      val api_airAssessment = readCabin_Air_Treatment_SupervisorAirAssessmentType()
      return Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_PS(api_airAssessment)
    }

    def readCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container(): Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Cabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_P => val r = readCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_PS => val r = readCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container.")
          val r = readCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_P(): Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_P = {
      val r = readCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_PT(F)
      return r
    }

    def readCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_PT(typeParsed: B): Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_P)
      }
      val api_cabinHumidity = readCabin_Air_Treatment_SupervisorCabinHumidityType()
      val api_humidityValidity = readCabin_Air_Treatment_SupervisorHumidityValidityType()
      return Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_P(api_cabinHumidity, api_humidityValidity)
    }

    def readCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_PS(): Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_PS = {
      val r = readCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_PST(F)
      return r
    }

    def readCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_PST(typeParsed: B): Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_PS)
      }
      val api_cabinHumidity = readCabin_Air_Treatment_SupervisorCabinHumidityType()
      val api_humidityValidity = readCabin_Air_Treatment_SupervisorHumidityValidityType()
      return Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_PS(api_cabinHumidity, api_humidityValidity)
    }

    def readCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container(): Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Cabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_P => val r = readCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_PS => val r = readCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container.")
          val r = readCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_P(): Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_P = {
      val r = readCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_PT(F)
      return r
    }

    def readCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_PT(typeParsed: B): Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_P)
      }
      val api_humidityAssessment = readCabin_Air_Treatment_SupervisorHumidityAssessmentType()
      return Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_P(api_humidityAssessment)
    }

    def readCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_PS(): Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_PS = {
      val r = readCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_PST(F)
      return r
    }

    def readCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_PST(typeParsed: B): Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_PS)
      }
      val api_humidityAssessment = readCabin_Air_Treatment_SupervisorHumidityAssessmentType()
      return Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_PS(api_humidityAssessment)
    }

    def readCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container(): Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Cabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_P => val r = readCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_PS => val r = readCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container.")
          val r = readCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_P(): Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_P = {
      val r = readCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_PT(F)
      return r
    }

    def readCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_PT(typeParsed: B): Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_P)
      }
      val api_treatmentEquipmentStatus = readCabin_Air_Treatment_SupervisorTreatmentEquipmentStatus()
      return Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_P(api_treatmentEquipmentStatus)
    }

    def readCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_PS(): Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_PS = {
      val r = readCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_PST(F)
      return r
    }

    def readCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_PST(typeParsed: B): Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_PS)
      }
      val api_treatmentEquipmentStatus = readCabin_Air_Treatment_SupervisorTreatmentEquipmentStatus()
      return Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_PS(api_treatmentEquipmentStatus)
    }

    def readCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container(): Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Cabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_P => val r = readCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_PS => val r = readCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container.")
          val r = readCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_P(): Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_P = {
      val r = readCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_PT(F)
      return r
    }

    def readCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_PT(typeParsed: B): Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_P)
      }
      val api_readinessContext = readCabin_Air_Treatment_SupervisorReadinessContextType()
      val api_treatmentReadiness = readCabin_Air_Treatment_SupervisorTreatmentReadinessType()
      return Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_P(api_readinessContext, api_treatmentReadiness)
    }

    def readCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_PS(): Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_PS = {
      val r = readCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_PST(F)
      return r
    }

    def readCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_PST(typeParsed: B): Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_PS)
      }
      val api_readinessContext = readCabin_Air_Treatment_SupervisorReadinessContextType()
      val api_treatmentReadiness = readCabin_Air_Treatment_SupervisorTreatmentReadinessType()
      return Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_PS(api_readinessContext, api_treatmentReadiness)
    }

    def readCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container(): Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Cabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_P => val r = readCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_PS => val r = readCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container.")
          val r = readCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_P(): Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_P = {
      val r = readCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_PT(F)
      return r
    }

    def readCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_PT(typeParsed: B): Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_P)
      }
      val api_airAssessment = readCabin_Air_Treatment_SupervisorAirAssessmentType()
      val api_requestIntent = readCabin_Air_Treatment_SupervisorRequestIntentType()
      val api_treatmentReadiness = readCabin_Air_Treatment_SupervisorTreatmentReadinessType()
      return Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_P(api_airAssessment, api_requestIntent, api_treatmentReadiness)
    }

    def readCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_PS(): Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_PS = {
      val r = readCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_PST(F)
      return r
    }

    def readCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_PST(typeParsed: B): Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_PS)
      }
      val api_airAssessment = readCabin_Air_Treatment_SupervisorAirAssessmentType()
      val api_requestIntent = readCabin_Air_Treatment_SupervisorRequestIntentType()
      val api_treatmentReadiness = readCabin_Air_Treatment_SupervisorTreatmentReadinessType()
      return Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_PS(api_airAssessment, api_requestIntent, api_treatmentReadiness)
    }

    def readCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container(): Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Cabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_P => val r = readCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_PS => val r = readCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container.")
          val r = readCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_P(): Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_P = {
      val r = readCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_PT(F)
      return r
    }

    def readCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_PT(typeParsed: B): Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_P)
      }
      val api_airProposal = readCabin_Air_Treatment_SupervisorAirProposalType()
      return Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_P(api_airProposal)
    }

    def readCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_PS(): Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_PS = {
      val r = readCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_PST(F)
      return r
    }

    def readCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_PST(typeParsed: B): Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_PS)
      }
      val api_airProposal = readCabin_Air_Treatment_SupervisorAirProposalType()
      return Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_PS(api_airProposal)
    }

    def readCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container(): Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Cabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_P => val r = readCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_PS => val r = readCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container.")
          val r = readCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_P(): Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_P = {
      val r = readCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_PT(F)
      return r
    }

    def readCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_PT(typeParsed: B): Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_P)
      }
      val api_humidityAssessment = readCabin_Air_Treatment_SupervisorHumidityAssessmentType()
      val api_requestIntent = readCabin_Air_Treatment_SupervisorRequestIntentType()
      val api_treatmentReadiness = readCabin_Air_Treatment_SupervisorTreatmentReadinessType()
      return Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_P(api_humidityAssessment, api_requestIntent, api_treatmentReadiness)
    }

    def readCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_PS(): Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_PS = {
      val r = readCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_PST(F)
      return r
    }

    def readCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_PST(typeParsed: B): Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_PS)
      }
      val api_humidityAssessment = readCabin_Air_Treatment_SupervisorHumidityAssessmentType()
      val api_requestIntent = readCabin_Air_Treatment_SupervisorRequestIntentType()
      val api_treatmentReadiness = readCabin_Air_Treatment_SupervisorTreatmentReadinessType()
      return Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_PS(api_humidityAssessment, api_requestIntent, api_treatmentReadiness)
    }

    def readCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container(): Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Cabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_P => val r = readCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_PS => val r = readCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container.")
          val r = readCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_P(): Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_P = {
      val r = readCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_PT(F)
      return r
    }

    def readCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_PT(typeParsed: B): Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_P)
      }
      val api_humidityProposal = readCabin_Air_Treatment_SupervisorHumidityProposalType()
      return Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_P(api_humidityProposal)
    }

    def readCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_PS(): Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_PS = {
      val r = readCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_PST(F)
      return r
    }

    def readCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_PST(typeParsed: B): Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_PS)
      }
      val api_humidityProposal = readCabin_Air_Treatment_SupervisorHumidityProposalType()
      return Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_PS(api_humidityProposal)
    }

    def readCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container(): Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Cabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_P => val r = readCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_PS => val r = readCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container.")
          val r = readCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_P(): Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_P = {
      val r = readCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_PT(F)
      return r
    }

    def readCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_PT(typeParsed: B): Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_P)
      }
      val api_readinessContext = readCabin_Air_Treatment_SupervisorReadinessContextType()
      val api_requestIntent = readCabin_Air_Treatment_SupervisorRequestIntentType()
      return Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_P(api_readinessContext, api_requestIntent)
    }

    def readCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_PS(): Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_PS = {
      val r = readCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_PST(F)
      return r
    }

    def readCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_PST(typeParsed: B): Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_PS)
      }
      val api_readinessContext = readCabin_Air_Treatment_SupervisorReadinessContextType()
      val api_requestIntent = readCabin_Air_Treatment_SupervisorRequestIntentType()
      return Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_PS(api_readinessContext, api_requestIntent)
    }

    def readCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container(): Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Cabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_P => val r = readCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_PS => val r = readCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container.")
          val r = readCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_P(): Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_P = {
      val r = readCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_PT(F)
      return r
    }

    def readCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_PT(typeParsed: B): Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_P)
      }
      val api_recoveryGate = readCabin_Air_Treatment_SupervisorRecoveryMemoryType()
      return Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_P(api_recoveryGate)
    }

    def readCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_PS(): Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_PS = {
      val r = readCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_PST(F)
      return r
    }

    def readCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_PST(typeParsed: B): Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_PS)
      }
      val api_recoveryGate = readCabin_Air_Treatment_SupervisorRecoveryMemoryType()
      return Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_PS(api_recoveryGate)
    }

    def readCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container(): Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Cabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_P => val r = readCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_PS => val r = readCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container.")
          val r = readCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_PST(T)
          return r
      }
    }

    def readCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_P(): Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_P = {
      val r = readCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_PT(F)
      return r
    }

    def readCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_PT(typeParsed: B): Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_P)
      }
      val api_airProposal = readCabin_Air_Treatment_SupervisorAirProposalType()
      val api_humidityProposal = readCabin_Air_Treatment_SupervisorHumidityProposalType()
      val api_recoveryGate = readCabin_Air_Treatment_SupervisorRecoveryMemoryType()
      val api_requestIntent = readCabin_Air_Treatment_SupervisorRequestIntentType()
      return Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_P(api_airProposal, api_humidityProposal, api_recoveryGate, api_requestIntent)
    }

    def readCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_PS(): Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_PS = {
      val r = readCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_PST(F)
      return r
    }

    def readCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_PST(typeParsed: B): Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_PS)
      }
      val api_airProposal = readCabin_Air_Treatment_SupervisorAirProposalType()
      val api_humidityProposal = readCabin_Air_Treatment_SupervisorHumidityProposalType()
      val api_recoveryGate = readCabin_Air_Treatment_SupervisorRecoveryMemoryType()
      val api_requestIntent = readCabin_Air_Treatment_SupervisorRequestIntentType()
      return Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_PS(api_airProposal, api_humidityProposal, api_recoveryGate, api_requestIntent)
    }

    def readCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container(): Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Cabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_P => val r = readCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_PS => val r = readCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container.")
          val r = readCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_PST(T)
          return r
      }
    }

    def readCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_P(): Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_P = {
      val r = readCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_PT(F)
      return r
    }

    def readCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_PT(typeParsed: B): Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_P)
      }
      val api_airCareSupervisorStatus = readCabin_Air_Treatment_SupervisorAirCareSupervisorStatus()
      val api_airTreatmentCommand = readCabin_Air_Treatment_SupervisorAirTreatmentCommandType()
      return Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_P(api_airCareSupervisorStatus, api_airTreatmentCommand)
    }

    def readCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_PS(): Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_PS = {
      val r = readCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_PST(F)
      return r
    }

    def readCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_PST(typeParsed: B): Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Cabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_PS)
      }
      val api_airCareSupervisorStatus = readCabin_Air_Treatment_SupervisorAirCareSupervisorStatus()
      val api_airTreatmentCommand = readCabin_Air_Treatment_SupervisorAirTreatmentCommandType()
      return Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_PS(api_airCareSupervisorStatus, api_airTreatmentCommand)
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
        case Constants.Cabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_P => val r = readCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_PS => val r = readCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_PST(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_P => val r = readCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_PS => val r = readCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_PST(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_P => val r = readCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_PS => val r = readCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_PST(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_P => val r = readCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_PS => val r = readCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_PST(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_P => val r = readCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_PS => val r = readCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_PST(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_P => val r = readCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_PS => val r = readCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_PST(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_P => val r = readCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_PS => val r = readCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_PST(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_P => val r = readCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_PS => val r = readCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_PST(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_P => val r = readCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_PS => val r = readCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_PST(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_P => val r = readCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_PS => val r = readCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_PST(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_P => val r = readCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_PS => val r = readCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_PST(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_P => val r = readCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_PS => val r = readCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_PST(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_P => val r = readCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_PS => val r = readCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_PST(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_P => val r = readCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_PS => val r = readCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_PST(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_P => val r = readCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_PS => val r = readCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_PST(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_P => val r = readCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_PS => val r = readCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of util.Container.")
          val r = readCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_PST(T)
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
        case Constants.Cabin_Air_Treatment_SupervisorStatusMode_Payload => val r = readCabin_Air_Treatment_SupervisorStatusMode_PayloadT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorAirProposal_Payload => val r = readCabin_Air_Treatment_SupervisorAirProposal_PayloadT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorStatusReason_Payload => val r = readCabin_Air_Treatment_SupervisorStatusReason_PayloadT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorCabinHumidity_Payload => val r = readCabin_Air_Treatment_SupervisorCabinHumidity_PayloadT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorAirAssessment_Payload => val r = readCabin_Air_Treatment_SupervisorAirAssessment_PayloadT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorRequestIntent_Payload => val r = readCabin_Air_Treatment_SupervisorRequestIntent_PayloadT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorStatusValidity_Payload => val r = readCabin_Air_Treatment_SupervisorStatusValidity_PayloadT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorRecoveryMemory_Payload => val r = readCabin_Air_Treatment_SupervisorRecoveryMemory_PayloadT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorRequestValidity_Payload => val r = readCabin_Air_Treatment_SupervisorRequestValidity_PayloadT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorCabinAirQuality_Payload => val r = readCabin_Air_Treatment_SupervisorCabinAirQuality_PayloadT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorHumidityValidity_Payload => val r = readCabin_Air_Treatment_SupervisorHumidityValidity_PayloadT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorAirCareSelection_Payload => val r = readCabin_Air_Treatment_SupervisorAirCareSelection_PayloadT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorFilterPathStatus_Payload => val r = readCabin_Air_Treatment_SupervisorFilterPathStatus_PayloadT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorDryingPathStatus_Payload => val r = readCabin_Air_Treatment_SupervisorDryingPathStatus_PayloadT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorReadinessContext_Payload => val r = readCabin_Air_Treatment_SupervisorReadinessContext_PayloadT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorHumidityProposal_Payload => val r = readCabin_Air_Treatment_SupervisorHumidityProposal_PayloadT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorAirQualityValidity_Payload => val r = readCabin_Air_Treatment_SupervisorAirQualityValidity_PayloadT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorHumidityAssessment_Payload => val r = readCabin_Air_Treatment_SupervisorHumidityAssessment_PayloadT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorTreatmentReadiness_Payload => val r = readCabin_Air_Treatment_SupervisorTreatmentReadiness_PayloadT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorAirTreatmentCommand_Payload => val r = readCabin_Air_Treatment_SupervisorAirTreatmentCommand_PayloadT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorAirCareSupervisorStatus_Payload => val r = readCabin_Air_Treatment_SupervisorAirCareSupervisorStatus_PayloadT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorTreatmentEquipmentStatus_Payload => val r = readCabin_Air_Treatment_SupervisorTreatmentEquipmentStatus_PayloadT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_P => val r = readCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_PS => val r = readCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_PST(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_P => val r = readCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_PS => val r = readCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_PST(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_P => val r = readCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_PS => val r = readCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_PST(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_P => val r = readCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_PS => val r = readCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_PST(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_P => val r = readCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_PS => val r = readCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_PST(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_P => val r = readCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_PS => val r = readCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_PST(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_P => val r = readCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_PS => val r = readCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_PST(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_P => val r = readCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_PS => val r = readCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_PST(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_P => val r = readCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_PS => val r = readCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_PST(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_P => val r = readCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_PS => val r = readCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_PST(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_P => val r = readCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_PS => val r = readCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_PST(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_P => val r = readCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_PS => val r = readCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_PST(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_P => val r = readCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_PS => val r = readCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_PST(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_P => val r = readCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_PS => val r = readCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_PST(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_P => val r = readCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_PT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_PS => val r = readCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_PST(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_P => val r = readCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_PT(T); return r
        case Constants.Cabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_PS => val r = readCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of art.DataContent.")
          val r = readCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_PST(T)
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

  def fromCabin_Air_Treatment_SupervisorAirCareSelection_Payload(o: Cabin_Air_Treatment_Supervisor.AirCareSelection_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorAirCareSelection_Payload(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorAirCareSelection_Payload(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.AirCareSelection_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorAirCareSelection_Payload(reader: Reader): Cabin_Air_Treatment_Supervisor.AirCareSelection_Payload = {
      val r = reader.readCabin_Air_Treatment_SupervisorAirCareSelection_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorAirCareSelection_Payload _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorRequestValidity_Payload(o: Cabin_Air_Treatment_Supervisor.RequestValidity_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorRequestValidity_Payload(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorRequestValidity_Payload(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.RequestValidity_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorRequestValidity_Payload(reader: Reader): Cabin_Air_Treatment_Supervisor.RequestValidity_Payload = {
      val r = reader.readCabin_Air_Treatment_SupervisorRequestValidity_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorRequestValidity_Payload _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorRequestIntent_Payload(o: Cabin_Air_Treatment_Supervisor.RequestIntent_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorRequestIntent_Payload(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorRequestIntent_Payload(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.RequestIntent_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorRequestIntent_Payload(reader: Reader): Cabin_Air_Treatment_Supervisor.RequestIntent_Payload = {
      val r = reader.readCabin_Air_Treatment_SupervisorRequestIntent_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorRequestIntent_Payload _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorCabinAirQuality_Payload(o: Cabin_Air_Treatment_Supervisor.CabinAirQuality_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorCabinAirQuality_Payload(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorCabinAirQuality_Payload(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.CabinAirQuality_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorCabinAirQuality_Payload(reader: Reader): Cabin_Air_Treatment_Supervisor.CabinAirQuality_Payload = {
      val r = reader.readCabin_Air_Treatment_SupervisorCabinAirQuality_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorCabinAirQuality_Payload _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorAirQualityValidity_Payload(o: Cabin_Air_Treatment_Supervisor.AirQualityValidity_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorAirQualityValidity_Payload(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorAirQualityValidity_Payload(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.AirQualityValidity_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorAirQualityValidity_Payload(reader: Reader): Cabin_Air_Treatment_Supervisor.AirQualityValidity_Payload = {
      val r = reader.readCabin_Air_Treatment_SupervisorAirQualityValidity_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorAirQualityValidity_Payload _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorAirAssessment_Payload(o: Cabin_Air_Treatment_Supervisor.AirAssessment_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorAirAssessment_Payload(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorAirAssessment_Payload(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.AirAssessment_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorAirAssessment_Payload(reader: Reader): Cabin_Air_Treatment_Supervisor.AirAssessment_Payload = {
      val r = reader.readCabin_Air_Treatment_SupervisorAirAssessment_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorAirAssessment_Payload _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorCabinHumidity_Payload(o: Cabin_Air_Treatment_Supervisor.CabinHumidity_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorCabinHumidity_Payload(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorCabinHumidity_Payload(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.CabinHumidity_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorCabinHumidity_Payload(reader: Reader): Cabin_Air_Treatment_Supervisor.CabinHumidity_Payload = {
      val r = reader.readCabin_Air_Treatment_SupervisorCabinHumidity_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorCabinHumidity_Payload _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorHumidityValidity_Payload(o: Cabin_Air_Treatment_Supervisor.HumidityValidity_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorHumidityValidity_Payload(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorHumidityValidity_Payload(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.HumidityValidity_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorHumidityValidity_Payload(reader: Reader): Cabin_Air_Treatment_Supervisor.HumidityValidity_Payload = {
      val r = reader.readCabin_Air_Treatment_SupervisorHumidityValidity_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorHumidityValidity_Payload _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorHumidityAssessment_Payload(o: Cabin_Air_Treatment_Supervisor.HumidityAssessment_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorHumidityAssessment_Payload(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorHumidityAssessment_Payload(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.HumidityAssessment_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorHumidityAssessment_Payload(reader: Reader): Cabin_Air_Treatment_Supervisor.HumidityAssessment_Payload = {
      val r = reader.readCabin_Air_Treatment_SupervisorHumidityAssessment_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorHumidityAssessment_Payload _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorStatusValidity_Payload(o: Cabin_Air_Treatment_Supervisor.StatusValidity_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorStatusValidity_Payload(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorStatusValidity_Payload(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.StatusValidity_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorStatusValidity_Payload(reader: Reader): Cabin_Air_Treatment_Supervisor.StatusValidity_Payload = {
      val r = reader.readCabin_Air_Treatment_SupervisorStatusValidity_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorStatusValidity_Payload _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorFilterPathStatus_Payload(o: Cabin_Air_Treatment_Supervisor.FilterPathStatus_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorFilterPathStatus_Payload(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorFilterPathStatus_Payload(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.FilterPathStatus_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorFilterPathStatus_Payload(reader: Reader): Cabin_Air_Treatment_Supervisor.FilterPathStatus_Payload = {
      val r = reader.readCabin_Air_Treatment_SupervisorFilterPathStatus_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorFilterPathStatus_Payload _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorDryingPathStatus_Payload(o: Cabin_Air_Treatment_Supervisor.DryingPathStatus_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorDryingPathStatus_Payload(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorDryingPathStatus_Payload(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.DryingPathStatus_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorDryingPathStatus_Payload(reader: Reader): Cabin_Air_Treatment_Supervisor.DryingPathStatus_Payload = {
      val r = reader.readCabin_Air_Treatment_SupervisorDryingPathStatus_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorDryingPathStatus_Payload _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorTreatmentReadiness_Payload(o: Cabin_Air_Treatment_Supervisor.TreatmentReadiness_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorTreatmentReadiness_Payload(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorTreatmentReadiness_Payload(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.TreatmentReadiness_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorTreatmentReadiness_Payload(reader: Reader): Cabin_Air_Treatment_Supervisor.TreatmentReadiness_Payload = {
      val r = reader.readCabin_Air_Treatment_SupervisorTreatmentReadiness_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorTreatmentReadiness_Payload _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorReadinessContext_Payload(o: Cabin_Air_Treatment_Supervisor.ReadinessContext_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorReadinessContext_Payload(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorReadinessContext_Payload(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.ReadinessContext_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorReadinessContext_Payload(reader: Reader): Cabin_Air_Treatment_Supervisor.ReadinessContext_Payload = {
      val r = reader.readCabin_Air_Treatment_SupervisorReadinessContext_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorReadinessContext_Payload _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorAirProposal_Payload(o: Cabin_Air_Treatment_Supervisor.AirProposal_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorAirProposal_Payload(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorAirProposal_Payload(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.AirProposal_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorAirProposal_Payload(reader: Reader): Cabin_Air_Treatment_Supervisor.AirProposal_Payload = {
      val r = reader.readCabin_Air_Treatment_SupervisorAirProposal_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorAirProposal_Payload _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorHumidityProposal_Payload(o: Cabin_Air_Treatment_Supervisor.HumidityProposal_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorHumidityProposal_Payload(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorHumidityProposal_Payload(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.HumidityProposal_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorHumidityProposal_Payload(reader: Reader): Cabin_Air_Treatment_Supervisor.HumidityProposal_Payload = {
      val r = reader.readCabin_Air_Treatment_SupervisorHumidityProposal_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorHumidityProposal_Payload _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorRecoveryMemory_Payload(o: Cabin_Air_Treatment_Supervisor.RecoveryMemory_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorRecoveryMemory_Payload(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorRecoveryMemory_Payload(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.RecoveryMemory_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorRecoveryMemory_Payload(reader: Reader): Cabin_Air_Treatment_Supervisor.RecoveryMemory_Payload = {
      val r = reader.readCabin_Air_Treatment_SupervisorRecoveryMemory_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorRecoveryMemory_Payload _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorAirTreatmentCommand_Payload(o: Cabin_Air_Treatment_Supervisor.AirTreatmentCommand_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorAirTreatmentCommand_Payload(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorAirTreatmentCommand_Payload(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.AirTreatmentCommand_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorAirTreatmentCommand_Payload(reader: Reader): Cabin_Air_Treatment_Supervisor.AirTreatmentCommand_Payload = {
      val r = reader.readCabin_Air_Treatment_SupervisorAirTreatmentCommand_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorAirTreatmentCommand_Payload _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorStatusMode_Payload(o: Cabin_Air_Treatment_Supervisor.StatusMode_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorStatusMode_Payload(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorStatusMode_Payload(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.StatusMode_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorStatusMode_Payload(reader: Reader): Cabin_Air_Treatment_Supervisor.StatusMode_Payload = {
      val r = reader.readCabin_Air_Treatment_SupervisorStatusMode_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorStatusMode_Payload _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorStatusReason_Payload(o: Cabin_Air_Treatment_Supervisor.StatusReason_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorStatusReason_Payload(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorStatusReason_Payload(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.StatusReason_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorStatusReason_Payload(reader: Reader): Cabin_Air_Treatment_Supervisor.StatusReason_Payload = {
      val r = reader.readCabin_Air_Treatment_SupervisorStatusReason_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorStatusReason_Payload _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorTreatmentEquipmentStatus(o: Cabin_Air_Treatment_Supervisor.TreatmentEquipmentStatus, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorTreatmentEquipmentStatus(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorTreatmentEquipmentStatus(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.TreatmentEquipmentStatus, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorTreatmentEquipmentStatus(reader: Reader): Cabin_Air_Treatment_Supervisor.TreatmentEquipmentStatus = {
      val r = reader.readCabin_Air_Treatment_SupervisorTreatmentEquipmentStatus()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorTreatmentEquipmentStatus _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorTreatmentEquipmentStatus_Payload(o: Cabin_Air_Treatment_Supervisor.TreatmentEquipmentStatus_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorTreatmentEquipmentStatus_Payload(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorTreatmentEquipmentStatus_Payload(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.TreatmentEquipmentStatus_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorTreatmentEquipmentStatus_Payload(reader: Reader): Cabin_Air_Treatment_Supervisor.TreatmentEquipmentStatus_Payload = {
      val r = reader.readCabin_Air_Treatment_SupervisorTreatmentEquipmentStatus_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorTreatmentEquipmentStatus_Payload _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorAirCareSupervisorStatus(o: Cabin_Air_Treatment_Supervisor.AirCareSupervisorStatus, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorAirCareSupervisorStatus(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorAirCareSupervisorStatus(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.AirCareSupervisorStatus, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorAirCareSupervisorStatus(reader: Reader): Cabin_Air_Treatment_Supervisor.AirCareSupervisorStatus = {
      val r = reader.readCabin_Air_Treatment_SupervisorAirCareSupervisorStatus()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorAirCareSupervisorStatus _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorAirCareSupervisorStatus_Payload(o: Cabin_Air_Treatment_Supervisor.AirCareSupervisorStatus_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorAirCareSupervisorStatus_Payload(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorAirCareSupervisorStatus_Payload(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.AirCareSupervisorStatus_Payload, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorAirCareSupervisorStatus_Payload(reader: Reader): Cabin_Air_Treatment_Supervisor.AirCareSupervisorStatus_Payload = {
      val r = reader.readCabin_Air_Treatment_SupervisorAirCareSupervisorStatus_Payload()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorAirCareSupervisorStatus_Payload _)
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

  def fromCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container(o: Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container(reader: Reader): Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container = {
      val r = reader.readCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_P(o: Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_P(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_P(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_P(reader: Reader): Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_P = {
      val r = reader.readCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_P _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_PS(o: Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_PS(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_PS(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_PS(reader: Reader): Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_PS = {
      val r = reader.readCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PreState_Container_PS _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container(o: Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container(reader: Reader): Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container = {
      val r = reader.readCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_P(o: Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_P(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_P(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_P(reader: Reader): Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_P = {
      val r = reader.readCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_P _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_PS(o: Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_PS(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_PS(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_PS(reader: Reader): Cabin_Air_Treatment_Supervisor.AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_PS = {
      val r = reader.readCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorAirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner_PostState_Container_PS _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container(o: Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container(reader: Reader): Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container = {
      val r = reader.readCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_P(o: Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_P(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_P(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_P(reader: Reader): Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_P = {
      val r = reader.readCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_P _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_PS(o: Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_PS(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_PS(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_PS(reader: Reader): Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_PS = {
      val r = reader.readCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PreState_Container_PS _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container(o: Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container(reader: Reader): Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container = {
      val r = reader.readCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_P(o: Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_P(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_P(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_P(reader: Reader): Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_P = {
      val r = reader.readCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_P _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_PS(o: Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_PS(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_PS(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_PS(reader: Reader): Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_PS = {
      val r = reader.readCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorAirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_PostState_Container_PS _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container(o: Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container(reader: Reader): Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container = {
      val r = reader.readCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_P(o: Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_P(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_P(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_P(reader: Reader): Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_P = {
      val r = reader.readCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_P _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_PS(o: Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_PS(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_PS(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_PS(reader: Reader): Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_PS = {
      val r = reader.readCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PreState_Container_PS _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container(o: Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container(reader: Reader): Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container = {
      val r = reader.readCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_P(o: Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_P(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_P(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_P(reader: Reader): Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_P = {
      val r = reader.readCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_P _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_PS(o: Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_PS(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_PS(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_PS(reader: Reader): Cabin_Air_Treatment_Supervisor.HumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_PS = {
      val r = reader.readCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorHumidityQualificationOwner_airCareSupervisionProcess_humidityOwner_PostState_Container_PS _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container(o: Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container(reader: Reader): Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container = {
      val r = reader.readCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_P(o: Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_P(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_P(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_P(reader: Reader): Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_P = {
      val r = reader.readCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_P _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_PS(o: Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_PS(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_PS(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_PS(reader: Reader): Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_PS = {
      val r = reader.readCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PreState_Container_PS _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container(o: Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container(reader: Reader): Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container = {
      val r = reader.readCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_P(o: Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_P(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_P(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_P(reader: Reader): Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_P = {
      val r = reader.readCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_P _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_PS(o: Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_PS(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_PS(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_PS(reader: Reader): Cabin_Air_Treatment_Supervisor.TreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_PS = {
      val r = reader.readCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorTreatmentReadinessQualificationOwner_airCareSupervisionProcess_readinessOwner_PostState_Container_PS _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container(o: Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container(reader: Reader): Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container = {
      val r = reader.readCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_P(o: Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_P(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_P(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_P(reader: Reader): Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_P = {
      val r = reader.readCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_P _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_PS(o: Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_PS(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_PS(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_PS(reader: Reader): Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_PS = {
      val r = reader.readCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PreState_Container_PS _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container(o: Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container(reader: Reader): Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container = {
      val r = reader.readCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_P(o: Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_P(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_P(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_P(reader: Reader): Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_P = {
      val r = reader.readCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_P _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_PS(o: Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_PS(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_PS(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_PS(reader: Reader): Cabin_Air_Treatment_Supervisor.FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_PS = {
      val r = reader.readCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorFiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner_PostState_Container_PS _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container(o: Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container(reader: Reader): Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container = {
      val r = reader.readCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_P(o: Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_P(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_P(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_P(reader: Reader): Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_P = {
      val r = reader.readCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_P _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_PS(o: Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_PS(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_PS(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_PS(reader: Reader): Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_PS = {
      val r = reader.readCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PreState_Container_PS _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container(o: Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container(reader: Reader): Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container = {
      val r = reader.readCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_P(o: Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_P(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_P(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_P(reader: Reader): Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_P = {
      val r = reader.readCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_P _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_PS(o: Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_PS(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_PS(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_PS(reader: Reader): Cabin_Air_Treatment_Supervisor.HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_PS = {
      val r = reader.readCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorHumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner_PostState_Container_PS _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container(o: Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container(reader: Reader): Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container = {
      val r = reader.readCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_P(o: Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_P(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_P(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_P(reader: Reader): Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_P = {
      val r = reader.readCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_P _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_PS(o: Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_PS(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_PS(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_PS(reader: Reader): Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_PS = {
      val r = reader.readCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PreState_Container_PS _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container(o: Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container(reader: Reader): Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container = {
      val r = reader.readCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_P(o: Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_P(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_P(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_P(reader: Reader): Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_P = {
      val r = reader.readCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_P _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_PS(o: Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_PS(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_PS(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_PS(reader: Reader): Cabin_Air_Treatment_Supervisor.ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_PS = {
      val r = reader.readCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner_PostState_Container_PS _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container(o: Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container(reader: Reader): Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container = {
      val r = reader.readCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_P(o: Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_P(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_P(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_P(reader: Reader): Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_P = {
      val r = reader.readCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_P()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_P _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_PS(o: Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_PS(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_PS(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_PS(reader: Reader): Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_PS = {
      val r = reader.readCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_PS()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PreState_Container_PS _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container(o: Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container(reader: Reader): Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container = {
      val r = reader.readCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_P(o: Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_P(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_P(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_P(reader: Reader): Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_P = {
      val r = reader.readCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_P()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_P _)
    return r
  }

  def fromCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_PS(o: Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_PS(o)
    return w.result
  }

  def toCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_PS(data: ISZ[U8]): Either[Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_PS(reader: Reader): Cabin_Air_Treatment_Supervisor.AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_PS = {
      val r = reader.readCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_PS()
      return r
    }
    val r = to(data, fCabin_Air_Treatment_SupervisorAirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter_PostState_Container_PS _)
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