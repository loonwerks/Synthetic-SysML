// #Sireum
// @formatter:off

// This file is auto-generated from TemperatureRelation.scala, InputStatus.scala, TemperatureAssessment.scala, MaintenanceTiming.scala, MaintenanceAssessment.scala, ReturnIndication.scala, RecoveryProposal.scala, VehicleHealthMode.scala, DecisionReason.scala, ElectricalPowerDisposition.scala, RecoveryGuidance.scala, TemperatureSample.scala, MaintenanceSample.scala, ReturnSample.scala, HealthDecision.scala, Base_Types.scala, TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_Containers.scala, MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_Containers.scala, RecoveryApplicability_supervisionProcess_recoveryApplicability_Containers.scala, HealthModeArbitration_supervisionProcess_healthModeArbitration_Containers.scala, BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package vehicle_temperature_health_supervisor

import org.sireum._

object MsgPack {

  object Constants {

    val Vehicle_Temperature_Health_SupervisorTemperatureRelation_Payload: Z = -32

    val Vehicle_Temperature_Health_SupervisorInputStatus_Payload: Z = -31

    val Vehicle_Temperature_Health_SupervisorTemperatureAssessment_Payload: Z = -30

    val Vehicle_Temperature_Health_SupervisorMaintenanceTiming_Payload: Z = -29

    val Vehicle_Temperature_Health_SupervisorMaintenanceAssessment_Payload: Z = -28

    val Vehicle_Temperature_Health_SupervisorReturnIndication_Payload: Z = -27

    val Vehicle_Temperature_Health_SupervisorRecoveryProposal_Payload: Z = -26

    val Vehicle_Temperature_Health_SupervisorVehicleHealthMode_Payload: Z = -25

    val Vehicle_Temperature_Health_SupervisorDecisionReason_Payload: Z = -24

    val Vehicle_Temperature_Health_SupervisorElectricalPowerDisposition_Payload: Z = -23

    val Vehicle_Temperature_Health_SupervisorRecoveryGuidance_Payload: Z = -22

    val Vehicle_Temperature_Health_SupervisorTemperatureSample: Z = -21

    val Vehicle_Temperature_Health_SupervisorTemperatureSample_Payload: Z = -20

    val Vehicle_Temperature_Health_SupervisorMaintenanceSample: Z = -19

    val Vehicle_Temperature_Health_SupervisorMaintenanceSample_Payload: Z = -18

    val Vehicle_Temperature_Health_SupervisorReturnSample: Z = -17

    val Vehicle_Temperature_Health_SupervisorReturnSample_Payload: Z = -16

    val Vehicle_Temperature_Health_SupervisorHealthDecision: Z = -15

    val Vehicle_Temperature_Health_SupervisorHealthDecision_Payload: Z = -14

    val Base_TypesBoolean_Payload: Z = -13

    val Base_TypesInteger_Payload: Z = -12

    val Base_TypesInteger_8_Payload: Z = -11

    val Base_TypesInteger_16_Payload: Z = -10

    val Base_TypesInteger_32_Payload: Z = -9

    val Base_TypesInteger_64_Payload: Z = -8

    val Base_TypesUnsigned_8_Payload: Z = -7

    val Base_TypesUnsigned_16_Payload: Z = -6

    val Base_TypesUnsigned_32_Payload: Z = -5

    val Base_TypesUnsigned_64_Payload: Z = -4

    val Base_TypesFloat_Payload: Z = -3

    val Base_TypesFloat_32_Payload: Z = -2

    val Base_TypesFloat_64_Payload: Z = -1

    val Base_TypesCharacter_Payload: Z = 0

    val Base_TypesString_Payload: Z = 1

    val Base_TypesBits_Payload: Z = 2

    val Vehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_P: Z = 3

    val Vehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PS: Z = 4

    val Vehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_P: Z = 5

    val Vehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PS: Z = 6

    val Vehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_P: Z = 7

    val Vehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PS: Z = 8

    val Vehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_P: Z = 9

    val Vehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PS: Z = 10

    val Vehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_P: Z = 11

    val Vehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PS: Z = 12

    val Vehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_P: Z = 13

    val Vehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PS: Z = 14

    val Vehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_P: Z = 15

    val Vehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PS: Z = 16

    val Vehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_P: Z = 17

    val Vehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PS: Z = 18

    val Vehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_P: Z = 19

    val Vehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PS: Z = 20

    val Vehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_P: Z = 21

    val Vehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PS: Z = 22

    val utilEmptyContainer: Z = 23

    val _artEmpty: Z = 24

  }

  object Writer {

    @record class Default(val writer: MessagePack.Writer.Impl) extends Writer

  }

  @msig trait Writer {

    def writer: MessagePack.Writer

    def writeVehicle_Temperature_Health_SupervisorTemperatureRelationType(o: Vehicle_Temperature_Health_Supervisor.TemperatureRelation.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Temperature_Health_SupervisorTemperatureRelation_Payload(o: Vehicle_Temperature_Health_Supervisor.TemperatureRelation_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Temperature_Health_SupervisorTemperatureRelation_Payload)
      writeVehicle_Temperature_Health_SupervisorTemperatureRelationType(o.value)
    }

    def writeVehicle_Temperature_Health_SupervisorInputStatusType(o: Vehicle_Temperature_Health_Supervisor.InputStatus.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Temperature_Health_SupervisorInputStatus_Payload(o: Vehicle_Temperature_Health_Supervisor.InputStatus_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Temperature_Health_SupervisorInputStatus_Payload)
      writeVehicle_Temperature_Health_SupervisorInputStatusType(o.value)
    }

    def writeVehicle_Temperature_Health_SupervisorTemperatureAssessmentType(o: Vehicle_Temperature_Health_Supervisor.TemperatureAssessment.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Temperature_Health_SupervisorTemperatureAssessment_Payload(o: Vehicle_Temperature_Health_Supervisor.TemperatureAssessment_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Temperature_Health_SupervisorTemperatureAssessment_Payload)
      writeVehicle_Temperature_Health_SupervisorTemperatureAssessmentType(o.value)
    }

    def writeVehicle_Temperature_Health_SupervisorMaintenanceTimingType(o: Vehicle_Temperature_Health_Supervisor.MaintenanceTiming.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Temperature_Health_SupervisorMaintenanceTiming_Payload(o: Vehicle_Temperature_Health_Supervisor.MaintenanceTiming_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Temperature_Health_SupervisorMaintenanceTiming_Payload)
      writeVehicle_Temperature_Health_SupervisorMaintenanceTimingType(o.value)
    }

    def writeVehicle_Temperature_Health_SupervisorMaintenanceAssessmentType(o: Vehicle_Temperature_Health_Supervisor.MaintenanceAssessment.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Temperature_Health_SupervisorMaintenanceAssessment_Payload(o: Vehicle_Temperature_Health_Supervisor.MaintenanceAssessment_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Temperature_Health_SupervisorMaintenanceAssessment_Payload)
      writeVehicle_Temperature_Health_SupervisorMaintenanceAssessmentType(o.value)
    }

    def writeVehicle_Temperature_Health_SupervisorReturnIndicationType(o: Vehicle_Temperature_Health_Supervisor.ReturnIndication.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Temperature_Health_SupervisorReturnIndication_Payload(o: Vehicle_Temperature_Health_Supervisor.ReturnIndication_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Temperature_Health_SupervisorReturnIndication_Payload)
      writeVehicle_Temperature_Health_SupervisorReturnIndicationType(o.value)
    }

    def writeVehicle_Temperature_Health_SupervisorRecoveryProposalType(o: Vehicle_Temperature_Health_Supervisor.RecoveryProposal.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Temperature_Health_SupervisorRecoveryProposal_Payload(o: Vehicle_Temperature_Health_Supervisor.RecoveryProposal_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Temperature_Health_SupervisorRecoveryProposal_Payload)
      writeVehicle_Temperature_Health_SupervisorRecoveryProposalType(o.value)
    }

    def writeVehicle_Temperature_Health_SupervisorVehicleHealthModeType(o: Vehicle_Temperature_Health_Supervisor.VehicleHealthMode.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Temperature_Health_SupervisorVehicleHealthMode_Payload(o: Vehicle_Temperature_Health_Supervisor.VehicleHealthMode_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Temperature_Health_SupervisorVehicleHealthMode_Payload)
      writeVehicle_Temperature_Health_SupervisorVehicleHealthModeType(o.value)
    }

    def writeVehicle_Temperature_Health_SupervisorDecisionReasonType(o: Vehicle_Temperature_Health_Supervisor.DecisionReason.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Temperature_Health_SupervisorDecisionReason_Payload(o: Vehicle_Temperature_Health_Supervisor.DecisionReason_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Temperature_Health_SupervisorDecisionReason_Payload)
      writeVehicle_Temperature_Health_SupervisorDecisionReasonType(o.value)
    }

    def writeVehicle_Temperature_Health_SupervisorElectricalPowerDispositionType(o: Vehicle_Temperature_Health_Supervisor.ElectricalPowerDisposition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Temperature_Health_SupervisorElectricalPowerDisposition_Payload(o: Vehicle_Temperature_Health_Supervisor.ElectricalPowerDisposition_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Temperature_Health_SupervisorElectricalPowerDisposition_Payload)
      writeVehicle_Temperature_Health_SupervisorElectricalPowerDispositionType(o.value)
    }

    def writeVehicle_Temperature_Health_SupervisorRecoveryGuidanceType(o: Vehicle_Temperature_Health_Supervisor.RecoveryGuidance.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Temperature_Health_SupervisorRecoveryGuidance_Payload(o: Vehicle_Temperature_Health_Supervisor.RecoveryGuidance_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Temperature_Health_SupervisorRecoveryGuidance_Payload)
      writeVehicle_Temperature_Health_SupervisorRecoveryGuidanceType(o.value)
    }

    def writeVehicle_Temperature_Health_SupervisorTemperatureSample(o: Vehicle_Temperature_Health_Supervisor.TemperatureSample): Unit = {
      writer.writeZ(Constants.Vehicle_Temperature_Health_SupervisorTemperatureSample)
      writeVehicle_Temperature_Health_SupervisorTemperatureRelationType(o.relation)
      writeVehicle_Temperature_Health_SupervisorInputStatusType(o.status)
    }

    def writeVehicle_Temperature_Health_SupervisorTemperatureSample_Payload(o: Vehicle_Temperature_Health_Supervisor.TemperatureSample_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Temperature_Health_SupervisorTemperatureSample_Payload)
      writeVehicle_Temperature_Health_SupervisorTemperatureSample(o.value)
    }

    def writeVehicle_Temperature_Health_SupervisorMaintenanceSample(o: Vehicle_Temperature_Health_Supervisor.MaintenanceSample): Unit = {
      writer.writeZ(Constants.Vehicle_Temperature_Health_SupervisorMaintenanceSample)
      writeVehicle_Temperature_Health_SupervisorMaintenanceTimingType(o.timing)
      writeVehicle_Temperature_Health_SupervisorInputStatusType(o.status)
    }

    def writeVehicle_Temperature_Health_SupervisorMaintenanceSample_Payload(o: Vehicle_Temperature_Health_Supervisor.MaintenanceSample_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Temperature_Health_SupervisorMaintenanceSample_Payload)
      writeVehicle_Temperature_Health_SupervisorMaintenanceSample(o.value)
    }

    def writeVehicle_Temperature_Health_SupervisorReturnSample(o: Vehicle_Temperature_Health_Supervisor.ReturnSample): Unit = {
      writer.writeZ(Constants.Vehicle_Temperature_Health_SupervisorReturnSample)
      writeVehicle_Temperature_Health_SupervisorReturnIndicationType(o.indication)
      writeVehicle_Temperature_Health_SupervisorInputStatusType(o.status)
    }

    def writeVehicle_Temperature_Health_SupervisorReturnSample_Payload(o: Vehicle_Temperature_Health_Supervisor.ReturnSample_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Temperature_Health_SupervisorReturnSample_Payload)
      writeVehicle_Temperature_Health_SupervisorReturnSample(o.value)
    }

    def writeVehicle_Temperature_Health_SupervisorHealthDecision(o: Vehicle_Temperature_Health_Supervisor.HealthDecision): Unit = {
      writer.writeZ(Constants.Vehicle_Temperature_Health_SupervisorHealthDecision)
      writeVehicle_Temperature_Health_SupervisorVehicleHealthModeType(o.nextMode)
      writeVehicle_Temperature_Health_SupervisorDecisionReasonType(o.reason)
    }

    def writeVehicle_Temperature_Health_SupervisorHealthDecision_Payload(o: Vehicle_Temperature_Health_Supervisor.HealthDecision_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Temperature_Health_SupervisorHealthDecision_Payload)
      writeVehicle_Temperature_Health_SupervisorHealthDecision(o.value)
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

    def writeVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container(o: Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container): Unit = {
      o match {
        case o: Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_P => writeVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_P(o)
        case o: Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PS => writeVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PS(o)
      }
    }

    def writeVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_P(o: Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_P)
      writeVehicle_Temperature_Health_SupervisorTemperatureSample(o.api_rawTemperature)
    }

    def writeVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PS(o: Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PS)
      writeVehicle_Temperature_Health_SupervisorTemperatureSample(o.api_rawTemperature)
    }

    def writeVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container(o: Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container): Unit = {
      o match {
        case o: Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_P => writeVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_P(o)
        case o: Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PS => writeVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PS(o)
      }
    }

    def writeVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_P(o: Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_P)
      writeVehicle_Temperature_Health_SupervisorTemperatureAssessmentType(o.api_assessmentForArbitration)
      writeVehicle_Temperature_Health_SupervisorTemperatureAssessmentType(o.api_assessmentForRecovery)
    }

    def writeVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PS(o: Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PS)
      writeVehicle_Temperature_Health_SupervisorTemperatureAssessmentType(o.api_assessmentForArbitration)
      writeVehicle_Temperature_Health_SupervisorTemperatureAssessmentType(o.api_assessmentForRecovery)
    }

    def writeVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container(o: Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container): Unit = {
      o match {
        case o: Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_P => writeVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_P(o)
        case o: Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PS => writeVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PS(o)
      }
    }

    def writeVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_P(o: Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_P)
      writeVehicle_Temperature_Health_SupervisorMaintenanceSample(o.api_rawMaintenance)
    }

    def writeVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PS(o: Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PS)
      writeVehicle_Temperature_Health_SupervisorMaintenanceSample(o.api_rawMaintenance)
    }

    def writeVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container(o: Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container): Unit = {
      o match {
        case o: Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_P => writeVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_P(o)
        case o: Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PS => writeVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PS(o)
      }
    }

    def writeVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_P(o: Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_P)
      writeVehicle_Temperature_Health_SupervisorMaintenanceAssessmentType(o.api_assessmentForArbitration)
      writeVehicle_Temperature_Health_SupervisorMaintenanceAssessmentType(o.api_assessmentForRecovery)
    }

    def writeVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PS(o: Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PS)
      writeVehicle_Temperature_Health_SupervisorMaintenanceAssessmentType(o.api_assessmentForArbitration)
      writeVehicle_Temperature_Health_SupervisorMaintenanceAssessmentType(o.api_assessmentForRecovery)
    }

    def writeVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container(o: Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container): Unit = {
      o match {
        case o: Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_P => writeVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_P(o)
        case o: Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PS => writeVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PS(o)
      }
    }

    def writeVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_P(o: Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_P)
      writeVehicle_Temperature_Health_SupervisorMaintenanceAssessmentType(o.api_maintenanceAssessment)
      writeVehicle_Temperature_Health_SupervisorReturnSample(o.api_rawReturn)
      writeVehicle_Temperature_Health_SupervisorTemperatureAssessmentType(o.api_temperatureAssessment)
    }

    def writeVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PS(o: Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PS)
      writeVehicle_Temperature_Health_SupervisorMaintenanceAssessmentType(o.api_maintenanceAssessment)
      writeVehicle_Temperature_Health_SupervisorReturnSample(o.api_rawReturn)
      writeVehicle_Temperature_Health_SupervisorTemperatureAssessmentType(o.api_temperatureAssessment)
    }

    def writeVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container(o: Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container): Unit = {
      o match {
        case o: Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_P => writeVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_P(o)
        case o: Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PS => writeVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PS(o)
      }
    }

    def writeVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_P(o: Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_P)
      writeVehicle_Temperature_Health_SupervisorRecoveryProposalType(o.api_proposalForArbitration)
      writeVehicle_Temperature_Health_SupervisorRecoveryProposalType(o.api_proposalForOutcomes)
    }

    def writeVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PS(o: Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PS)
      writeVehicle_Temperature_Health_SupervisorRecoveryProposalType(o.api_proposalForArbitration)
      writeVehicle_Temperature_Health_SupervisorRecoveryProposalType(o.api_proposalForOutcomes)
    }

    def writeVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container(o: Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container): Unit = {
      o match {
        case o: Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_P => writeVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_P(o)
        case o: Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PS => writeVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PS(o)
      }
    }

    def writeVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_P(o: Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_P)
      writeVehicle_Temperature_Health_SupervisorMaintenanceAssessmentType(o.api_maintenanceAssessment)
      writeVehicle_Temperature_Health_SupervisorRecoveryProposalType(o.api_recoveryProposal)
      writeVehicle_Temperature_Health_SupervisorTemperatureAssessmentType(o.api_temperatureAssessment)
    }

    def writeVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PS(o: Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PS)
      writeVehicle_Temperature_Health_SupervisorMaintenanceAssessmentType(o.api_maintenanceAssessment)
      writeVehicle_Temperature_Health_SupervisorRecoveryProposalType(o.api_recoveryProposal)
      writeVehicle_Temperature_Health_SupervisorTemperatureAssessmentType(o.api_temperatureAssessment)
    }

    def writeVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container(o: Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container): Unit = {
      o match {
        case o: Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_P => writeVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_P(o)
        case o: Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PS => writeVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PS(o)
      }
    }

    def writeVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_P(o: Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_P)
      writeVehicle_Temperature_Health_SupervisorHealthDecision(o.api_healthDecision)
    }

    def writeVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PS(o: Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PS)
      writeVehicle_Temperature_Health_SupervisorHealthDecision(o.api_healthDecision)
    }

    def writeVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container(o: Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container): Unit = {
      o match {
        case o: Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_P => writeVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_P(o)
        case o: Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PS => writeVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PS(o)
      }
    }

    def writeVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_P(o: Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_P)
      writeVehicle_Temperature_Health_SupervisorHealthDecision(o.api_healthDecision)
      writeVehicle_Temperature_Health_SupervisorRecoveryProposalType(o.api_recoveryProposal)
    }

    def writeVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PS(o: Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PS)
      writeVehicle_Temperature_Health_SupervisorHealthDecision(o.api_healthDecision)
      writeVehicle_Temperature_Health_SupervisorRecoveryProposalType(o.api_recoveryProposal)
    }

    def writeVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container(o: Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container): Unit = {
      o match {
        case o: Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_P => writeVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_P(o)
        case o: Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PS => writeVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PS(o)
      }
    }

    def writeVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_P(o: Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_P)
      writeVehicle_Temperature_Health_SupervisorElectricalPowerDispositionType(o.api_powerDisposition)
      writeVehicle_Temperature_Health_SupervisorRecoveryGuidanceType(o.api_recoveryGuidance)
      writeVehicle_Temperature_Health_SupervisorVehicleHealthModeType(o.api_vehicleHealthMode)
    }

    def writeVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PS(o: Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PS)
      writeVehicle_Temperature_Health_SupervisorElectricalPowerDispositionType(o.api_powerDisposition)
      writeVehicle_Temperature_Health_SupervisorRecoveryGuidanceType(o.api_recoveryGuidance)
      writeVehicle_Temperature_Health_SupervisorVehicleHealthModeType(o.api_vehicleHealthMode)
    }

    def writeruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeutilContainer(o: util.Container): Unit = {
      o match {
        case o: util.EmptyContainer => writeutilEmptyContainer(o)
        case o: Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_P => writeVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_P(o)
        case o: Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_P => writeVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_P(o)
        case o: Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PS => writeVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PS(o)
        case o: Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PS => writeVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PS(o)
        case o: Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_P => writeVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_P(o)
        case o: Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_P => writeVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_P(o)
        case o: Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PS => writeVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PS(o)
        case o: Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PS => writeVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PS(o)
        case o: Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_P => writeVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_P(o)
        case o: Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PS => writeVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PS(o)
        case o: Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_P => writeVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_P(o)
        case o: Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PS => writeVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PS(o)
        case o: Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_P => writeVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_P(o)
        case o: Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_P => writeVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_P(o)
        case o: Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PS => writeVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PS(o)
        case o: Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PS => writeVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PS(o)
        case o: Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_P => writeVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_P(o)
        case o: Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_P => writeVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_P(o)
        case o: Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PS => writeVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PS(o)
        case o: Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PS => writeVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PS(o)
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
        case o: Vehicle_Temperature_Health_Supervisor.InputStatus_Payload => writeVehicle_Temperature_Health_SupervisorInputStatus_Payload(o)
        case o: Vehicle_Temperature_Health_Supervisor.ReturnSample_Payload => writeVehicle_Temperature_Health_SupervisorReturnSample_Payload(o)
        case o: Vehicle_Temperature_Health_Supervisor.DecisionReason_Payload => writeVehicle_Temperature_Health_SupervisorDecisionReason_Payload(o)
        case o: Vehicle_Temperature_Health_Supervisor.HealthDecision_Payload => writeVehicle_Temperature_Health_SupervisorHealthDecision_Payload(o)
        case o: Vehicle_Temperature_Health_Supervisor.ReturnIndication_Payload => writeVehicle_Temperature_Health_SupervisorReturnIndication_Payload(o)
        case o: Vehicle_Temperature_Health_Supervisor.RecoveryGuidance_Payload => writeVehicle_Temperature_Health_SupervisorRecoveryGuidance_Payload(o)
        case o: Vehicle_Temperature_Health_Supervisor.RecoveryProposal_Payload => writeVehicle_Temperature_Health_SupervisorRecoveryProposal_Payload(o)
        case o: Vehicle_Temperature_Health_Supervisor.MaintenanceTiming_Payload => writeVehicle_Temperature_Health_SupervisorMaintenanceTiming_Payload(o)
        case o: Vehicle_Temperature_Health_Supervisor.VehicleHealthMode_Payload => writeVehicle_Temperature_Health_SupervisorVehicleHealthMode_Payload(o)
        case o: Vehicle_Temperature_Health_Supervisor.MaintenanceSample_Payload => writeVehicle_Temperature_Health_SupervisorMaintenanceSample_Payload(o)
        case o: Vehicle_Temperature_Health_Supervisor.TemperatureSample_Payload => writeVehicle_Temperature_Health_SupervisorTemperatureSample_Payload(o)
        case o: Vehicle_Temperature_Health_Supervisor.TemperatureRelation_Payload => writeVehicle_Temperature_Health_SupervisorTemperatureRelation_Payload(o)
        case o: Vehicle_Temperature_Health_Supervisor.MaintenanceAssessment_Payload => writeVehicle_Temperature_Health_SupervisorMaintenanceAssessment_Payload(o)
        case o: Vehicle_Temperature_Health_Supervisor.TemperatureAssessment_Payload => writeVehicle_Temperature_Health_SupervisorTemperatureAssessment_Payload(o)
        case o: Vehicle_Temperature_Health_Supervisor.ElectricalPowerDisposition_Payload => writeVehicle_Temperature_Health_SupervisorElectricalPowerDisposition_Payload(o)
        case o: Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_P => writeVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_P(o)
        case o: Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_P => writeVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_P(o)
        case o: Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PS => writeVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PS(o)
        case o: Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PS => writeVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PS(o)
        case o: Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_P => writeVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_P(o)
        case o: Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_P => writeVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_P(o)
        case o: Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PS => writeVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PS(o)
        case o: Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PS => writeVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PS(o)
        case o: Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_P => writeVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_P(o)
        case o: Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PS => writeVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PS(o)
        case o: Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_P => writeVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_P(o)
        case o: Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PS => writeVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PS(o)
        case o: Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_P => writeVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_P(o)
        case o: Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_P => writeVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_P(o)
        case o: Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PS => writeVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PS(o)
        case o: Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PS => writeVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PS(o)
        case o: Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_P => writeVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_P(o)
        case o: Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_P => writeVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_P(o)
        case o: Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PS => writeVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PS(o)
        case o: Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PS => writeVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PS(o)
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

    def readVehicle_Temperature_Health_SupervisorTemperatureRelationType(): Vehicle_Temperature_Health_Supervisor.TemperatureRelation.Type = {
      val r = reader.readZ()
      return Vehicle_Temperature_Health_Supervisor.TemperatureRelation.byOrdinal(r).get
    }

    def readVehicle_Temperature_Health_SupervisorTemperatureRelation_Payload(): Vehicle_Temperature_Health_Supervisor.TemperatureRelation_Payload = {
      val r = readVehicle_Temperature_Health_SupervisorTemperatureRelation_PayloadT(F)
      return r
    }

    def readVehicle_Temperature_Health_SupervisorTemperatureRelation_PayloadT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.TemperatureRelation_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Temperature_Health_SupervisorTemperatureRelation_Payload)
      }
      val value = readVehicle_Temperature_Health_SupervisorTemperatureRelationType()
      return Vehicle_Temperature_Health_Supervisor.TemperatureRelation_Payload(value)
    }

    def readVehicle_Temperature_Health_SupervisorInputStatusType(): Vehicle_Temperature_Health_Supervisor.InputStatus.Type = {
      val r = reader.readZ()
      return Vehicle_Temperature_Health_Supervisor.InputStatus.byOrdinal(r).get
    }

    def readVehicle_Temperature_Health_SupervisorInputStatus_Payload(): Vehicle_Temperature_Health_Supervisor.InputStatus_Payload = {
      val r = readVehicle_Temperature_Health_SupervisorInputStatus_PayloadT(F)
      return r
    }

    def readVehicle_Temperature_Health_SupervisorInputStatus_PayloadT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.InputStatus_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Temperature_Health_SupervisorInputStatus_Payload)
      }
      val value = readVehicle_Temperature_Health_SupervisorInputStatusType()
      return Vehicle_Temperature_Health_Supervisor.InputStatus_Payload(value)
    }

    def readVehicle_Temperature_Health_SupervisorTemperatureAssessmentType(): Vehicle_Temperature_Health_Supervisor.TemperatureAssessment.Type = {
      val r = reader.readZ()
      return Vehicle_Temperature_Health_Supervisor.TemperatureAssessment.byOrdinal(r).get
    }

    def readVehicle_Temperature_Health_SupervisorTemperatureAssessment_Payload(): Vehicle_Temperature_Health_Supervisor.TemperatureAssessment_Payload = {
      val r = readVehicle_Temperature_Health_SupervisorTemperatureAssessment_PayloadT(F)
      return r
    }

    def readVehicle_Temperature_Health_SupervisorTemperatureAssessment_PayloadT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.TemperatureAssessment_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Temperature_Health_SupervisorTemperatureAssessment_Payload)
      }
      val value = readVehicle_Temperature_Health_SupervisorTemperatureAssessmentType()
      return Vehicle_Temperature_Health_Supervisor.TemperatureAssessment_Payload(value)
    }

    def readVehicle_Temperature_Health_SupervisorMaintenanceTimingType(): Vehicle_Temperature_Health_Supervisor.MaintenanceTiming.Type = {
      val r = reader.readZ()
      return Vehicle_Temperature_Health_Supervisor.MaintenanceTiming.byOrdinal(r).get
    }

    def readVehicle_Temperature_Health_SupervisorMaintenanceTiming_Payload(): Vehicle_Temperature_Health_Supervisor.MaintenanceTiming_Payload = {
      val r = readVehicle_Temperature_Health_SupervisorMaintenanceTiming_PayloadT(F)
      return r
    }

    def readVehicle_Temperature_Health_SupervisorMaintenanceTiming_PayloadT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.MaintenanceTiming_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Temperature_Health_SupervisorMaintenanceTiming_Payload)
      }
      val value = readVehicle_Temperature_Health_SupervisorMaintenanceTimingType()
      return Vehicle_Temperature_Health_Supervisor.MaintenanceTiming_Payload(value)
    }

    def readVehicle_Temperature_Health_SupervisorMaintenanceAssessmentType(): Vehicle_Temperature_Health_Supervisor.MaintenanceAssessment.Type = {
      val r = reader.readZ()
      return Vehicle_Temperature_Health_Supervisor.MaintenanceAssessment.byOrdinal(r).get
    }

    def readVehicle_Temperature_Health_SupervisorMaintenanceAssessment_Payload(): Vehicle_Temperature_Health_Supervisor.MaintenanceAssessment_Payload = {
      val r = readVehicle_Temperature_Health_SupervisorMaintenanceAssessment_PayloadT(F)
      return r
    }

    def readVehicle_Temperature_Health_SupervisorMaintenanceAssessment_PayloadT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.MaintenanceAssessment_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Temperature_Health_SupervisorMaintenanceAssessment_Payload)
      }
      val value = readVehicle_Temperature_Health_SupervisorMaintenanceAssessmentType()
      return Vehicle_Temperature_Health_Supervisor.MaintenanceAssessment_Payload(value)
    }

    def readVehicle_Temperature_Health_SupervisorReturnIndicationType(): Vehicle_Temperature_Health_Supervisor.ReturnIndication.Type = {
      val r = reader.readZ()
      return Vehicle_Temperature_Health_Supervisor.ReturnIndication.byOrdinal(r).get
    }

    def readVehicle_Temperature_Health_SupervisorReturnIndication_Payload(): Vehicle_Temperature_Health_Supervisor.ReturnIndication_Payload = {
      val r = readVehicle_Temperature_Health_SupervisorReturnIndication_PayloadT(F)
      return r
    }

    def readVehicle_Temperature_Health_SupervisorReturnIndication_PayloadT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.ReturnIndication_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Temperature_Health_SupervisorReturnIndication_Payload)
      }
      val value = readVehicle_Temperature_Health_SupervisorReturnIndicationType()
      return Vehicle_Temperature_Health_Supervisor.ReturnIndication_Payload(value)
    }

    def readVehicle_Temperature_Health_SupervisorRecoveryProposalType(): Vehicle_Temperature_Health_Supervisor.RecoveryProposal.Type = {
      val r = reader.readZ()
      return Vehicle_Temperature_Health_Supervisor.RecoveryProposal.byOrdinal(r).get
    }

    def readVehicle_Temperature_Health_SupervisorRecoveryProposal_Payload(): Vehicle_Temperature_Health_Supervisor.RecoveryProposal_Payload = {
      val r = readVehicle_Temperature_Health_SupervisorRecoveryProposal_PayloadT(F)
      return r
    }

    def readVehicle_Temperature_Health_SupervisorRecoveryProposal_PayloadT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.RecoveryProposal_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Temperature_Health_SupervisorRecoveryProposal_Payload)
      }
      val value = readVehicle_Temperature_Health_SupervisorRecoveryProposalType()
      return Vehicle_Temperature_Health_Supervisor.RecoveryProposal_Payload(value)
    }

    def readVehicle_Temperature_Health_SupervisorVehicleHealthModeType(): Vehicle_Temperature_Health_Supervisor.VehicleHealthMode.Type = {
      val r = reader.readZ()
      return Vehicle_Temperature_Health_Supervisor.VehicleHealthMode.byOrdinal(r).get
    }

    def readVehicle_Temperature_Health_SupervisorVehicleHealthMode_Payload(): Vehicle_Temperature_Health_Supervisor.VehicleHealthMode_Payload = {
      val r = readVehicle_Temperature_Health_SupervisorVehicleHealthMode_PayloadT(F)
      return r
    }

    def readVehicle_Temperature_Health_SupervisorVehicleHealthMode_PayloadT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.VehicleHealthMode_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Temperature_Health_SupervisorVehicleHealthMode_Payload)
      }
      val value = readVehicle_Temperature_Health_SupervisorVehicleHealthModeType()
      return Vehicle_Temperature_Health_Supervisor.VehicleHealthMode_Payload(value)
    }

    def readVehicle_Temperature_Health_SupervisorDecisionReasonType(): Vehicle_Temperature_Health_Supervisor.DecisionReason.Type = {
      val r = reader.readZ()
      return Vehicle_Temperature_Health_Supervisor.DecisionReason.byOrdinal(r).get
    }

    def readVehicle_Temperature_Health_SupervisorDecisionReason_Payload(): Vehicle_Temperature_Health_Supervisor.DecisionReason_Payload = {
      val r = readVehicle_Temperature_Health_SupervisorDecisionReason_PayloadT(F)
      return r
    }

    def readVehicle_Temperature_Health_SupervisorDecisionReason_PayloadT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.DecisionReason_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Temperature_Health_SupervisorDecisionReason_Payload)
      }
      val value = readVehicle_Temperature_Health_SupervisorDecisionReasonType()
      return Vehicle_Temperature_Health_Supervisor.DecisionReason_Payload(value)
    }

    def readVehicle_Temperature_Health_SupervisorElectricalPowerDispositionType(): Vehicle_Temperature_Health_Supervisor.ElectricalPowerDisposition.Type = {
      val r = reader.readZ()
      return Vehicle_Temperature_Health_Supervisor.ElectricalPowerDisposition.byOrdinal(r).get
    }

    def readVehicle_Temperature_Health_SupervisorElectricalPowerDisposition_Payload(): Vehicle_Temperature_Health_Supervisor.ElectricalPowerDisposition_Payload = {
      val r = readVehicle_Temperature_Health_SupervisorElectricalPowerDisposition_PayloadT(F)
      return r
    }

    def readVehicle_Temperature_Health_SupervisorElectricalPowerDisposition_PayloadT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.ElectricalPowerDisposition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Temperature_Health_SupervisorElectricalPowerDisposition_Payload)
      }
      val value = readVehicle_Temperature_Health_SupervisorElectricalPowerDispositionType()
      return Vehicle_Temperature_Health_Supervisor.ElectricalPowerDisposition_Payload(value)
    }

    def readVehicle_Temperature_Health_SupervisorRecoveryGuidanceType(): Vehicle_Temperature_Health_Supervisor.RecoveryGuidance.Type = {
      val r = reader.readZ()
      return Vehicle_Temperature_Health_Supervisor.RecoveryGuidance.byOrdinal(r).get
    }

    def readVehicle_Temperature_Health_SupervisorRecoveryGuidance_Payload(): Vehicle_Temperature_Health_Supervisor.RecoveryGuidance_Payload = {
      val r = readVehicle_Temperature_Health_SupervisorRecoveryGuidance_PayloadT(F)
      return r
    }

    def readVehicle_Temperature_Health_SupervisorRecoveryGuidance_PayloadT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.RecoveryGuidance_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Temperature_Health_SupervisorRecoveryGuidance_Payload)
      }
      val value = readVehicle_Temperature_Health_SupervisorRecoveryGuidanceType()
      return Vehicle_Temperature_Health_Supervisor.RecoveryGuidance_Payload(value)
    }

    def readVehicle_Temperature_Health_SupervisorTemperatureSample(): Vehicle_Temperature_Health_Supervisor.TemperatureSample = {
      val r = readVehicle_Temperature_Health_SupervisorTemperatureSampleT(F)
      return r
    }

    def readVehicle_Temperature_Health_SupervisorTemperatureSampleT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.TemperatureSample = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Temperature_Health_SupervisorTemperatureSample)
      }
      val relation = readVehicle_Temperature_Health_SupervisorTemperatureRelationType()
      val status = readVehicle_Temperature_Health_SupervisorInputStatusType()
      return Vehicle_Temperature_Health_Supervisor.TemperatureSample(relation, status)
    }

    def readVehicle_Temperature_Health_SupervisorTemperatureSample_Payload(): Vehicle_Temperature_Health_Supervisor.TemperatureSample_Payload = {
      val r = readVehicle_Temperature_Health_SupervisorTemperatureSample_PayloadT(F)
      return r
    }

    def readVehicle_Temperature_Health_SupervisorTemperatureSample_PayloadT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.TemperatureSample_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Temperature_Health_SupervisorTemperatureSample_Payload)
      }
      val value = readVehicle_Temperature_Health_SupervisorTemperatureSample()
      return Vehicle_Temperature_Health_Supervisor.TemperatureSample_Payload(value)
    }

    def readVehicle_Temperature_Health_SupervisorMaintenanceSample(): Vehicle_Temperature_Health_Supervisor.MaintenanceSample = {
      val r = readVehicle_Temperature_Health_SupervisorMaintenanceSampleT(F)
      return r
    }

    def readVehicle_Temperature_Health_SupervisorMaintenanceSampleT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.MaintenanceSample = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Temperature_Health_SupervisorMaintenanceSample)
      }
      val timing = readVehicle_Temperature_Health_SupervisorMaintenanceTimingType()
      val status = readVehicle_Temperature_Health_SupervisorInputStatusType()
      return Vehicle_Temperature_Health_Supervisor.MaintenanceSample(timing, status)
    }

    def readVehicle_Temperature_Health_SupervisorMaintenanceSample_Payload(): Vehicle_Temperature_Health_Supervisor.MaintenanceSample_Payload = {
      val r = readVehicle_Temperature_Health_SupervisorMaintenanceSample_PayloadT(F)
      return r
    }

    def readVehicle_Temperature_Health_SupervisorMaintenanceSample_PayloadT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.MaintenanceSample_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Temperature_Health_SupervisorMaintenanceSample_Payload)
      }
      val value = readVehicle_Temperature_Health_SupervisorMaintenanceSample()
      return Vehicle_Temperature_Health_Supervisor.MaintenanceSample_Payload(value)
    }

    def readVehicle_Temperature_Health_SupervisorReturnSample(): Vehicle_Temperature_Health_Supervisor.ReturnSample = {
      val r = readVehicle_Temperature_Health_SupervisorReturnSampleT(F)
      return r
    }

    def readVehicle_Temperature_Health_SupervisorReturnSampleT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.ReturnSample = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Temperature_Health_SupervisorReturnSample)
      }
      val indication = readVehicle_Temperature_Health_SupervisorReturnIndicationType()
      val status = readVehicle_Temperature_Health_SupervisorInputStatusType()
      return Vehicle_Temperature_Health_Supervisor.ReturnSample(indication, status)
    }

    def readVehicle_Temperature_Health_SupervisorReturnSample_Payload(): Vehicle_Temperature_Health_Supervisor.ReturnSample_Payload = {
      val r = readVehicle_Temperature_Health_SupervisorReturnSample_PayloadT(F)
      return r
    }

    def readVehicle_Temperature_Health_SupervisorReturnSample_PayloadT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.ReturnSample_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Temperature_Health_SupervisorReturnSample_Payload)
      }
      val value = readVehicle_Temperature_Health_SupervisorReturnSample()
      return Vehicle_Temperature_Health_Supervisor.ReturnSample_Payload(value)
    }

    def readVehicle_Temperature_Health_SupervisorHealthDecision(): Vehicle_Temperature_Health_Supervisor.HealthDecision = {
      val r = readVehicle_Temperature_Health_SupervisorHealthDecisionT(F)
      return r
    }

    def readVehicle_Temperature_Health_SupervisorHealthDecisionT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.HealthDecision = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Temperature_Health_SupervisorHealthDecision)
      }
      val nextMode = readVehicle_Temperature_Health_SupervisorVehicleHealthModeType()
      val reason = readVehicle_Temperature_Health_SupervisorDecisionReasonType()
      return Vehicle_Temperature_Health_Supervisor.HealthDecision(nextMode, reason)
    }

    def readVehicle_Temperature_Health_SupervisorHealthDecision_Payload(): Vehicle_Temperature_Health_Supervisor.HealthDecision_Payload = {
      val r = readVehicle_Temperature_Health_SupervisorHealthDecision_PayloadT(F)
      return r
    }

    def readVehicle_Temperature_Health_SupervisorHealthDecision_PayloadT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.HealthDecision_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Temperature_Health_SupervisorHealthDecision_Payload)
      }
      val value = readVehicle_Temperature_Health_SupervisorHealthDecision()
      return Vehicle_Temperature_Health_Supervisor.HealthDecision_Payload(value)
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

    def readVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container(): Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_P => val r = readVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PT(T); return r
        case Constants.Vehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PS => val r = readVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container.")
          val r = readVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_P(): Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_P = {
      val r = readVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PT(F)
      return r
    }

    def readVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_P)
      }
      val api_rawTemperature = readVehicle_Temperature_Health_SupervisorTemperatureSample()
      return Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_P(api_rawTemperature)
    }

    def readVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PS(): Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PS = {
      val r = readVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PST(F)
      return r
    }

    def readVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PST(typeParsed: B): Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PS)
      }
      val api_rawTemperature = readVehicle_Temperature_Health_SupervisorTemperatureSample()
      return Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PS(api_rawTemperature)
    }

    def readVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container(): Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_P => val r = readVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PT(T); return r
        case Constants.Vehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PS => val r = readVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container.")
          val r = readVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_P(): Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_P = {
      val r = readVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PT(F)
      return r
    }

    def readVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_P)
      }
      val api_assessmentForArbitration = readVehicle_Temperature_Health_SupervisorTemperatureAssessmentType()
      val api_assessmentForRecovery = readVehicle_Temperature_Health_SupervisorTemperatureAssessmentType()
      return Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_P(api_assessmentForArbitration, api_assessmentForRecovery)
    }

    def readVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PS(): Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PS = {
      val r = readVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PST(F)
      return r
    }

    def readVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PST(typeParsed: B): Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PS)
      }
      val api_assessmentForArbitration = readVehicle_Temperature_Health_SupervisorTemperatureAssessmentType()
      val api_assessmentForRecovery = readVehicle_Temperature_Health_SupervisorTemperatureAssessmentType()
      return Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PS(api_assessmentForArbitration, api_assessmentForRecovery)
    }

    def readVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container(): Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_P => val r = readVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PT(T); return r
        case Constants.Vehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PS => val r = readVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container.")
          val r = readVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_P(): Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_P = {
      val r = readVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PT(F)
      return r
    }

    def readVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_P)
      }
      val api_rawMaintenance = readVehicle_Temperature_Health_SupervisorMaintenanceSample()
      return Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_P(api_rawMaintenance)
    }

    def readVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PS(): Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PS = {
      val r = readVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PST(F)
      return r
    }

    def readVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PST(typeParsed: B): Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PS)
      }
      val api_rawMaintenance = readVehicle_Temperature_Health_SupervisorMaintenanceSample()
      return Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PS(api_rawMaintenance)
    }

    def readVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container(): Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_P => val r = readVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PT(T); return r
        case Constants.Vehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PS => val r = readVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container.")
          val r = readVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_P(): Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_P = {
      val r = readVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PT(F)
      return r
    }

    def readVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_P)
      }
      val api_assessmentForArbitration = readVehicle_Temperature_Health_SupervisorMaintenanceAssessmentType()
      val api_assessmentForRecovery = readVehicle_Temperature_Health_SupervisorMaintenanceAssessmentType()
      return Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_P(api_assessmentForArbitration, api_assessmentForRecovery)
    }

    def readVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PS(): Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PS = {
      val r = readVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PST(F)
      return r
    }

    def readVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PST(typeParsed: B): Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PS)
      }
      val api_assessmentForArbitration = readVehicle_Temperature_Health_SupervisorMaintenanceAssessmentType()
      val api_assessmentForRecovery = readVehicle_Temperature_Health_SupervisorMaintenanceAssessmentType()
      return Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PS(api_assessmentForArbitration, api_assessmentForRecovery)
    }

    def readVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container(): Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_P => val r = readVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PT(T); return r
        case Constants.Vehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PS => val r = readVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container.")
          val r = readVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_P(): Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_P = {
      val r = readVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PT(F)
      return r
    }

    def readVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_P)
      }
      val api_maintenanceAssessment = readVehicle_Temperature_Health_SupervisorMaintenanceAssessmentType()
      val api_rawReturn = readVehicle_Temperature_Health_SupervisorReturnSample()
      val api_temperatureAssessment = readVehicle_Temperature_Health_SupervisorTemperatureAssessmentType()
      return Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_P(api_maintenanceAssessment, api_rawReturn, api_temperatureAssessment)
    }

    def readVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PS(): Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PS = {
      val r = readVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PST(F)
      return r
    }

    def readVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PST(typeParsed: B): Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PS)
      }
      val api_maintenanceAssessment = readVehicle_Temperature_Health_SupervisorMaintenanceAssessmentType()
      val api_rawReturn = readVehicle_Temperature_Health_SupervisorReturnSample()
      val api_temperatureAssessment = readVehicle_Temperature_Health_SupervisorTemperatureAssessmentType()
      return Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PS(api_maintenanceAssessment, api_rawReturn, api_temperatureAssessment)
    }

    def readVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container(): Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_P => val r = readVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PT(T); return r
        case Constants.Vehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PS => val r = readVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container.")
          val r = readVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_P(): Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_P = {
      val r = readVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PT(F)
      return r
    }

    def readVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_P)
      }
      val api_proposalForArbitration = readVehicle_Temperature_Health_SupervisorRecoveryProposalType()
      val api_proposalForOutcomes = readVehicle_Temperature_Health_SupervisorRecoveryProposalType()
      return Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_P(api_proposalForArbitration, api_proposalForOutcomes)
    }

    def readVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PS(): Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PS = {
      val r = readVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PST(F)
      return r
    }

    def readVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PST(typeParsed: B): Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PS)
      }
      val api_proposalForArbitration = readVehicle_Temperature_Health_SupervisorRecoveryProposalType()
      val api_proposalForOutcomes = readVehicle_Temperature_Health_SupervisorRecoveryProposalType()
      return Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PS(api_proposalForArbitration, api_proposalForOutcomes)
    }

    def readVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container(): Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_P => val r = readVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PT(T); return r
        case Constants.Vehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PS => val r = readVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container.")
          val r = readVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_P(): Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_P = {
      val r = readVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PT(F)
      return r
    }

    def readVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_P)
      }
      val api_maintenanceAssessment = readVehicle_Temperature_Health_SupervisorMaintenanceAssessmentType()
      val api_recoveryProposal = readVehicle_Temperature_Health_SupervisorRecoveryProposalType()
      val api_temperatureAssessment = readVehicle_Temperature_Health_SupervisorTemperatureAssessmentType()
      return Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_P(api_maintenanceAssessment, api_recoveryProposal, api_temperatureAssessment)
    }

    def readVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PS(): Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PS = {
      val r = readVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PST(F)
      return r
    }

    def readVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PST(typeParsed: B): Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PS)
      }
      val api_maintenanceAssessment = readVehicle_Temperature_Health_SupervisorMaintenanceAssessmentType()
      val api_recoveryProposal = readVehicle_Temperature_Health_SupervisorRecoveryProposalType()
      val api_temperatureAssessment = readVehicle_Temperature_Health_SupervisorTemperatureAssessmentType()
      return Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PS(api_maintenanceAssessment, api_recoveryProposal, api_temperatureAssessment)
    }

    def readVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container(): Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_P => val r = readVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PT(T); return r
        case Constants.Vehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PS => val r = readVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container.")
          val r = readVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_P(): Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_P = {
      val r = readVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PT(F)
      return r
    }

    def readVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_P)
      }
      val api_healthDecision = readVehicle_Temperature_Health_SupervisorHealthDecision()
      return Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_P(api_healthDecision)
    }

    def readVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PS(): Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PS = {
      val r = readVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PST(F)
      return r
    }

    def readVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PST(typeParsed: B): Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PS)
      }
      val api_healthDecision = readVehicle_Temperature_Health_SupervisorHealthDecision()
      return Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PS(api_healthDecision)
    }

    def readVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container(): Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_P => val r = readVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PT(T); return r
        case Constants.Vehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PS => val r = readVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container.")
          val r = readVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_P(): Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_P = {
      val r = readVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PT(F)
      return r
    }

    def readVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_P)
      }
      val api_healthDecision = readVehicle_Temperature_Health_SupervisorHealthDecision()
      val api_recoveryProposal = readVehicle_Temperature_Health_SupervisorRecoveryProposalType()
      return Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_P(api_healthDecision, api_recoveryProposal)
    }

    def readVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PS(): Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PS = {
      val r = readVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PST(F)
      return r
    }

    def readVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PST(typeParsed: B): Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PS)
      }
      val api_healthDecision = readVehicle_Temperature_Health_SupervisorHealthDecision()
      val api_recoveryProposal = readVehicle_Temperature_Health_SupervisorRecoveryProposalType()
      return Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PS(api_healthDecision, api_recoveryProposal)
    }

    def readVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container(): Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_P => val r = readVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PT(T); return r
        case Constants.Vehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PS => val r = readVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container.")
          val r = readVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_P(): Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_P = {
      val r = readVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PT(F)
      return r
    }

    def readVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_P)
      }
      val api_powerDisposition = readVehicle_Temperature_Health_SupervisorElectricalPowerDispositionType()
      val api_recoveryGuidance = readVehicle_Temperature_Health_SupervisorRecoveryGuidanceType()
      val api_vehicleHealthMode = readVehicle_Temperature_Health_SupervisorVehicleHealthModeType()
      return Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_P(api_powerDisposition, api_recoveryGuidance, api_vehicleHealthMode)
    }

    def readVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PS(): Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PS = {
      val r = readVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PST(F)
      return r
    }

    def readVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PST(typeParsed: B): Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PS)
      }
      val api_powerDisposition = readVehicle_Temperature_Health_SupervisorElectricalPowerDispositionType()
      val api_recoveryGuidance = readVehicle_Temperature_Health_SupervisorRecoveryGuidanceType()
      val api_vehicleHealthMode = readVehicle_Temperature_Health_SupervisorVehicleHealthModeType()
      return Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PS(api_powerDisposition, api_recoveryGuidance, api_vehicleHealthMode)
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
        case Constants.Vehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_P => val r = readVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PT(T); return r
        case Constants.Vehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_P => val r = readVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PT(T); return r
        case Constants.Vehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PS => val r = readVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PST(T); return r
        case Constants.Vehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PS => val r = readVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PST(T); return r
        case Constants.Vehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_P => val r = readVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PT(T); return r
        case Constants.Vehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_P => val r = readVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PT(T); return r
        case Constants.Vehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PS => val r = readVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PST(T); return r
        case Constants.Vehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PS => val r = readVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PST(T); return r
        case Constants.Vehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_P => val r = readVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PT(T); return r
        case Constants.Vehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PS => val r = readVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PST(T); return r
        case Constants.Vehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_P => val r = readVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PT(T); return r
        case Constants.Vehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PS => val r = readVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PST(T); return r
        case Constants.Vehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_P => val r = readVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PT(T); return r
        case Constants.Vehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_P => val r = readVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PT(T); return r
        case Constants.Vehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PS => val r = readVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PST(T); return r
        case Constants.Vehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PS => val r = readVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PST(T); return r
        case Constants.Vehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_P => val r = readVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PT(T); return r
        case Constants.Vehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_P => val r = readVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PT(T); return r
        case Constants.Vehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PS => val r = readVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PST(T); return r
        case Constants.Vehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PS => val r = readVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of util.Container.")
          val r = readVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PST(T)
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
        case Constants.Vehicle_Temperature_Health_SupervisorInputStatus_Payload => val r = readVehicle_Temperature_Health_SupervisorInputStatus_PayloadT(T); return r
        case Constants.Vehicle_Temperature_Health_SupervisorReturnSample_Payload => val r = readVehicle_Temperature_Health_SupervisorReturnSample_PayloadT(T); return r
        case Constants.Vehicle_Temperature_Health_SupervisorDecisionReason_Payload => val r = readVehicle_Temperature_Health_SupervisorDecisionReason_PayloadT(T); return r
        case Constants.Vehicle_Temperature_Health_SupervisorHealthDecision_Payload => val r = readVehicle_Temperature_Health_SupervisorHealthDecision_PayloadT(T); return r
        case Constants.Vehicle_Temperature_Health_SupervisorReturnIndication_Payload => val r = readVehicle_Temperature_Health_SupervisorReturnIndication_PayloadT(T); return r
        case Constants.Vehicle_Temperature_Health_SupervisorRecoveryGuidance_Payload => val r = readVehicle_Temperature_Health_SupervisorRecoveryGuidance_PayloadT(T); return r
        case Constants.Vehicle_Temperature_Health_SupervisorRecoveryProposal_Payload => val r = readVehicle_Temperature_Health_SupervisorRecoveryProposal_PayloadT(T); return r
        case Constants.Vehicle_Temperature_Health_SupervisorMaintenanceTiming_Payload => val r = readVehicle_Temperature_Health_SupervisorMaintenanceTiming_PayloadT(T); return r
        case Constants.Vehicle_Temperature_Health_SupervisorVehicleHealthMode_Payload => val r = readVehicle_Temperature_Health_SupervisorVehicleHealthMode_PayloadT(T); return r
        case Constants.Vehicle_Temperature_Health_SupervisorMaintenanceSample_Payload => val r = readVehicle_Temperature_Health_SupervisorMaintenanceSample_PayloadT(T); return r
        case Constants.Vehicle_Temperature_Health_SupervisorTemperatureSample_Payload => val r = readVehicle_Temperature_Health_SupervisorTemperatureSample_PayloadT(T); return r
        case Constants.Vehicle_Temperature_Health_SupervisorTemperatureRelation_Payload => val r = readVehicle_Temperature_Health_SupervisorTemperatureRelation_PayloadT(T); return r
        case Constants.Vehicle_Temperature_Health_SupervisorMaintenanceAssessment_Payload => val r = readVehicle_Temperature_Health_SupervisorMaintenanceAssessment_PayloadT(T); return r
        case Constants.Vehicle_Temperature_Health_SupervisorTemperatureAssessment_Payload => val r = readVehicle_Temperature_Health_SupervisorTemperatureAssessment_PayloadT(T); return r
        case Constants.Vehicle_Temperature_Health_SupervisorElectricalPowerDisposition_Payload => val r = readVehicle_Temperature_Health_SupervisorElectricalPowerDisposition_PayloadT(T); return r
        case Constants.Vehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_P => val r = readVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PT(T); return r
        case Constants.Vehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_P => val r = readVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PT(T); return r
        case Constants.Vehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PS => val r = readVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PST(T); return r
        case Constants.Vehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PS => val r = readVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PST(T); return r
        case Constants.Vehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_P => val r = readVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PT(T); return r
        case Constants.Vehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_P => val r = readVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PT(T); return r
        case Constants.Vehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PS => val r = readVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PST(T); return r
        case Constants.Vehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PS => val r = readVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PST(T); return r
        case Constants.Vehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_P => val r = readVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PT(T); return r
        case Constants.Vehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PS => val r = readVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PST(T); return r
        case Constants.Vehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_P => val r = readVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PT(T); return r
        case Constants.Vehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PS => val r = readVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PST(T); return r
        case Constants.Vehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_P => val r = readVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PT(T); return r
        case Constants.Vehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_P => val r = readVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PT(T); return r
        case Constants.Vehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PS => val r = readVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PST(T); return r
        case Constants.Vehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PS => val r = readVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PST(T); return r
        case Constants.Vehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_P => val r = readVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PT(T); return r
        case Constants.Vehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_P => val r = readVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PT(T); return r
        case Constants.Vehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PS => val r = readVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PST(T); return r
        case Constants.Vehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PS => val r = readVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of art.DataContent.")
          val r = readVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PST(T)
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

  def fromVehicle_Temperature_Health_SupervisorTemperatureRelation_Payload(o: Vehicle_Temperature_Health_Supervisor.TemperatureRelation_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Temperature_Health_SupervisorTemperatureRelation_Payload(o)
    return w.result
  }

  def toVehicle_Temperature_Health_SupervisorTemperatureRelation_Payload(data: ISZ[U8]): Either[Vehicle_Temperature_Health_Supervisor.TemperatureRelation_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorTemperatureRelation_Payload(reader: Reader): Vehicle_Temperature_Health_Supervisor.TemperatureRelation_Payload = {
      val r = reader.readVehicle_Temperature_Health_SupervisorTemperatureRelation_Payload()
      return r
    }
    val r = to(data, fVehicle_Temperature_Health_SupervisorTemperatureRelation_Payload _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorInputStatus_Payload(o: Vehicle_Temperature_Health_Supervisor.InputStatus_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Temperature_Health_SupervisorInputStatus_Payload(o)
    return w.result
  }

  def toVehicle_Temperature_Health_SupervisorInputStatus_Payload(data: ISZ[U8]): Either[Vehicle_Temperature_Health_Supervisor.InputStatus_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorInputStatus_Payload(reader: Reader): Vehicle_Temperature_Health_Supervisor.InputStatus_Payload = {
      val r = reader.readVehicle_Temperature_Health_SupervisorInputStatus_Payload()
      return r
    }
    val r = to(data, fVehicle_Temperature_Health_SupervisorInputStatus_Payload _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorTemperatureAssessment_Payload(o: Vehicle_Temperature_Health_Supervisor.TemperatureAssessment_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Temperature_Health_SupervisorTemperatureAssessment_Payload(o)
    return w.result
  }

  def toVehicle_Temperature_Health_SupervisorTemperatureAssessment_Payload(data: ISZ[U8]): Either[Vehicle_Temperature_Health_Supervisor.TemperatureAssessment_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorTemperatureAssessment_Payload(reader: Reader): Vehicle_Temperature_Health_Supervisor.TemperatureAssessment_Payload = {
      val r = reader.readVehicle_Temperature_Health_SupervisorTemperatureAssessment_Payload()
      return r
    }
    val r = to(data, fVehicle_Temperature_Health_SupervisorTemperatureAssessment_Payload _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorMaintenanceTiming_Payload(o: Vehicle_Temperature_Health_Supervisor.MaintenanceTiming_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Temperature_Health_SupervisorMaintenanceTiming_Payload(o)
    return w.result
  }

  def toVehicle_Temperature_Health_SupervisorMaintenanceTiming_Payload(data: ISZ[U8]): Either[Vehicle_Temperature_Health_Supervisor.MaintenanceTiming_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorMaintenanceTiming_Payload(reader: Reader): Vehicle_Temperature_Health_Supervisor.MaintenanceTiming_Payload = {
      val r = reader.readVehicle_Temperature_Health_SupervisorMaintenanceTiming_Payload()
      return r
    }
    val r = to(data, fVehicle_Temperature_Health_SupervisorMaintenanceTiming_Payload _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorMaintenanceAssessment_Payload(o: Vehicle_Temperature_Health_Supervisor.MaintenanceAssessment_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Temperature_Health_SupervisorMaintenanceAssessment_Payload(o)
    return w.result
  }

  def toVehicle_Temperature_Health_SupervisorMaintenanceAssessment_Payload(data: ISZ[U8]): Either[Vehicle_Temperature_Health_Supervisor.MaintenanceAssessment_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorMaintenanceAssessment_Payload(reader: Reader): Vehicle_Temperature_Health_Supervisor.MaintenanceAssessment_Payload = {
      val r = reader.readVehicle_Temperature_Health_SupervisorMaintenanceAssessment_Payload()
      return r
    }
    val r = to(data, fVehicle_Temperature_Health_SupervisorMaintenanceAssessment_Payload _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorReturnIndication_Payload(o: Vehicle_Temperature_Health_Supervisor.ReturnIndication_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Temperature_Health_SupervisorReturnIndication_Payload(o)
    return w.result
  }

  def toVehicle_Temperature_Health_SupervisorReturnIndication_Payload(data: ISZ[U8]): Either[Vehicle_Temperature_Health_Supervisor.ReturnIndication_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorReturnIndication_Payload(reader: Reader): Vehicle_Temperature_Health_Supervisor.ReturnIndication_Payload = {
      val r = reader.readVehicle_Temperature_Health_SupervisorReturnIndication_Payload()
      return r
    }
    val r = to(data, fVehicle_Temperature_Health_SupervisorReturnIndication_Payload _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorRecoveryProposal_Payload(o: Vehicle_Temperature_Health_Supervisor.RecoveryProposal_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Temperature_Health_SupervisorRecoveryProposal_Payload(o)
    return w.result
  }

  def toVehicle_Temperature_Health_SupervisorRecoveryProposal_Payload(data: ISZ[U8]): Either[Vehicle_Temperature_Health_Supervisor.RecoveryProposal_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorRecoveryProposal_Payload(reader: Reader): Vehicle_Temperature_Health_Supervisor.RecoveryProposal_Payload = {
      val r = reader.readVehicle_Temperature_Health_SupervisorRecoveryProposal_Payload()
      return r
    }
    val r = to(data, fVehicle_Temperature_Health_SupervisorRecoveryProposal_Payload _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorVehicleHealthMode_Payload(o: Vehicle_Temperature_Health_Supervisor.VehicleHealthMode_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Temperature_Health_SupervisorVehicleHealthMode_Payload(o)
    return w.result
  }

  def toVehicle_Temperature_Health_SupervisorVehicleHealthMode_Payload(data: ISZ[U8]): Either[Vehicle_Temperature_Health_Supervisor.VehicleHealthMode_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorVehicleHealthMode_Payload(reader: Reader): Vehicle_Temperature_Health_Supervisor.VehicleHealthMode_Payload = {
      val r = reader.readVehicle_Temperature_Health_SupervisorVehicleHealthMode_Payload()
      return r
    }
    val r = to(data, fVehicle_Temperature_Health_SupervisorVehicleHealthMode_Payload _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorDecisionReason_Payload(o: Vehicle_Temperature_Health_Supervisor.DecisionReason_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Temperature_Health_SupervisorDecisionReason_Payload(o)
    return w.result
  }

  def toVehicle_Temperature_Health_SupervisorDecisionReason_Payload(data: ISZ[U8]): Either[Vehicle_Temperature_Health_Supervisor.DecisionReason_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorDecisionReason_Payload(reader: Reader): Vehicle_Temperature_Health_Supervisor.DecisionReason_Payload = {
      val r = reader.readVehicle_Temperature_Health_SupervisorDecisionReason_Payload()
      return r
    }
    val r = to(data, fVehicle_Temperature_Health_SupervisorDecisionReason_Payload _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorElectricalPowerDisposition_Payload(o: Vehicle_Temperature_Health_Supervisor.ElectricalPowerDisposition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Temperature_Health_SupervisorElectricalPowerDisposition_Payload(o)
    return w.result
  }

  def toVehicle_Temperature_Health_SupervisorElectricalPowerDisposition_Payload(data: ISZ[U8]): Either[Vehicle_Temperature_Health_Supervisor.ElectricalPowerDisposition_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorElectricalPowerDisposition_Payload(reader: Reader): Vehicle_Temperature_Health_Supervisor.ElectricalPowerDisposition_Payload = {
      val r = reader.readVehicle_Temperature_Health_SupervisorElectricalPowerDisposition_Payload()
      return r
    }
    val r = to(data, fVehicle_Temperature_Health_SupervisorElectricalPowerDisposition_Payload _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorRecoveryGuidance_Payload(o: Vehicle_Temperature_Health_Supervisor.RecoveryGuidance_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Temperature_Health_SupervisorRecoveryGuidance_Payload(o)
    return w.result
  }

  def toVehicle_Temperature_Health_SupervisorRecoveryGuidance_Payload(data: ISZ[U8]): Either[Vehicle_Temperature_Health_Supervisor.RecoveryGuidance_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorRecoveryGuidance_Payload(reader: Reader): Vehicle_Temperature_Health_Supervisor.RecoveryGuidance_Payload = {
      val r = reader.readVehicle_Temperature_Health_SupervisorRecoveryGuidance_Payload()
      return r
    }
    val r = to(data, fVehicle_Temperature_Health_SupervisorRecoveryGuidance_Payload _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorTemperatureSample(o: Vehicle_Temperature_Health_Supervisor.TemperatureSample, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Temperature_Health_SupervisorTemperatureSample(o)
    return w.result
  }

  def toVehicle_Temperature_Health_SupervisorTemperatureSample(data: ISZ[U8]): Either[Vehicle_Temperature_Health_Supervisor.TemperatureSample, MessagePack.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorTemperatureSample(reader: Reader): Vehicle_Temperature_Health_Supervisor.TemperatureSample = {
      val r = reader.readVehicle_Temperature_Health_SupervisorTemperatureSample()
      return r
    }
    val r = to(data, fVehicle_Temperature_Health_SupervisorTemperatureSample _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorTemperatureSample_Payload(o: Vehicle_Temperature_Health_Supervisor.TemperatureSample_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Temperature_Health_SupervisorTemperatureSample_Payload(o)
    return w.result
  }

  def toVehicle_Temperature_Health_SupervisorTemperatureSample_Payload(data: ISZ[U8]): Either[Vehicle_Temperature_Health_Supervisor.TemperatureSample_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorTemperatureSample_Payload(reader: Reader): Vehicle_Temperature_Health_Supervisor.TemperatureSample_Payload = {
      val r = reader.readVehicle_Temperature_Health_SupervisorTemperatureSample_Payload()
      return r
    }
    val r = to(data, fVehicle_Temperature_Health_SupervisorTemperatureSample_Payload _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorMaintenanceSample(o: Vehicle_Temperature_Health_Supervisor.MaintenanceSample, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Temperature_Health_SupervisorMaintenanceSample(o)
    return w.result
  }

  def toVehicle_Temperature_Health_SupervisorMaintenanceSample(data: ISZ[U8]): Either[Vehicle_Temperature_Health_Supervisor.MaintenanceSample, MessagePack.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorMaintenanceSample(reader: Reader): Vehicle_Temperature_Health_Supervisor.MaintenanceSample = {
      val r = reader.readVehicle_Temperature_Health_SupervisorMaintenanceSample()
      return r
    }
    val r = to(data, fVehicle_Temperature_Health_SupervisorMaintenanceSample _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorMaintenanceSample_Payload(o: Vehicle_Temperature_Health_Supervisor.MaintenanceSample_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Temperature_Health_SupervisorMaintenanceSample_Payload(o)
    return w.result
  }

  def toVehicle_Temperature_Health_SupervisorMaintenanceSample_Payload(data: ISZ[U8]): Either[Vehicle_Temperature_Health_Supervisor.MaintenanceSample_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorMaintenanceSample_Payload(reader: Reader): Vehicle_Temperature_Health_Supervisor.MaintenanceSample_Payload = {
      val r = reader.readVehicle_Temperature_Health_SupervisorMaintenanceSample_Payload()
      return r
    }
    val r = to(data, fVehicle_Temperature_Health_SupervisorMaintenanceSample_Payload _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorReturnSample(o: Vehicle_Temperature_Health_Supervisor.ReturnSample, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Temperature_Health_SupervisorReturnSample(o)
    return w.result
  }

  def toVehicle_Temperature_Health_SupervisorReturnSample(data: ISZ[U8]): Either[Vehicle_Temperature_Health_Supervisor.ReturnSample, MessagePack.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorReturnSample(reader: Reader): Vehicle_Temperature_Health_Supervisor.ReturnSample = {
      val r = reader.readVehicle_Temperature_Health_SupervisorReturnSample()
      return r
    }
    val r = to(data, fVehicle_Temperature_Health_SupervisorReturnSample _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorReturnSample_Payload(o: Vehicle_Temperature_Health_Supervisor.ReturnSample_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Temperature_Health_SupervisorReturnSample_Payload(o)
    return w.result
  }

  def toVehicle_Temperature_Health_SupervisorReturnSample_Payload(data: ISZ[U8]): Either[Vehicle_Temperature_Health_Supervisor.ReturnSample_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorReturnSample_Payload(reader: Reader): Vehicle_Temperature_Health_Supervisor.ReturnSample_Payload = {
      val r = reader.readVehicle_Temperature_Health_SupervisorReturnSample_Payload()
      return r
    }
    val r = to(data, fVehicle_Temperature_Health_SupervisorReturnSample_Payload _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorHealthDecision(o: Vehicle_Temperature_Health_Supervisor.HealthDecision, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Temperature_Health_SupervisorHealthDecision(o)
    return w.result
  }

  def toVehicle_Temperature_Health_SupervisorHealthDecision(data: ISZ[U8]): Either[Vehicle_Temperature_Health_Supervisor.HealthDecision, MessagePack.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorHealthDecision(reader: Reader): Vehicle_Temperature_Health_Supervisor.HealthDecision = {
      val r = reader.readVehicle_Temperature_Health_SupervisorHealthDecision()
      return r
    }
    val r = to(data, fVehicle_Temperature_Health_SupervisorHealthDecision _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorHealthDecision_Payload(o: Vehicle_Temperature_Health_Supervisor.HealthDecision_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Temperature_Health_SupervisorHealthDecision_Payload(o)
    return w.result
  }

  def toVehicle_Temperature_Health_SupervisorHealthDecision_Payload(data: ISZ[U8]): Either[Vehicle_Temperature_Health_Supervisor.HealthDecision_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorHealthDecision_Payload(reader: Reader): Vehicle_Temperature_Health_Supervisor.HealthDecision_Payload = {
      val r = reader.readVehicle_Temperature_Health_SupervisorHealthDecision_Payload()
      return r
    }
    val r = to(data, fVehicle_Temperature_Health_SupervisorHealthDecision_Payload _)
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

  def fromVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container(o: Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container(o)
    return w.result
  }

  def toVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container(data: ISZ[U8]): Either[Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container(reader: Reader): Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container = {
      val r = reader.readVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container()
      return r
    }
    val r = to(data, fVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_P(o: Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_P(o)
    return w.result
  }

  def toVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_P(data: ISZ[U8]): Either[Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_P(reader: Reader): Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_P = {
      val r = reader.readVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_P _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PS(o: Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PS(o)
    return w.result
  }

  def toVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PS(data: ISZ[U8]): Either[Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PS(reader: Reader): Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PS = {
      val r = reader.readVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container(o: Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container(o)
    return w.result
  }

  def toVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container(data: ISZ[U8]): Either[Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container(reader: Reader): Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container = {
      val r = reader.readVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container()
      return r
    }
    val r = to(data, fVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_P(o: Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_P(o)
    return w.result
  }

  def toVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_P(data: ISZ[U8]): Either[Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_P(reader: Reader): Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_P = {
      val r = reader.readVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_P _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PS(o: Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PS(o)
    return w.result
  }

  def toVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PS(data: ISZ[U8]): Either[Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PS(reader: Reader): Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PS = {
      val r = reader.readVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PS _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container(o: Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container(o)
    return w.result
  }

  def toVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container(data: ISZ[U8]): Either[Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container(reader: Reader): Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container = {
      val r = reader.readVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container()
      return r
    }
    val r = to(data, fVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_P(o: Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_P(o)
    return w.result
  }

  def toVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_P(data: ISZ[U8]): Either[Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_P(reader: Reader): Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_P = {
      val r = reader.readVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_P _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PS(o: Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PS(o)
    return w.result
  }

  def toVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PS(data: ISZ[U8]): Either[Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PS(reader: Reader): Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PS = {
      val r = reader.readVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container(o: Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container(o)
    return w.result
  }

  def toVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container(data: ISZ[U8]): Either[Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container(reader: Reader): Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container = {
      val r = reader.readVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container()
      return r
    }
    val r = to(data, fVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_P(o: Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_P(o)
    return w.result
  }

  def toVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_P(data: ISZ[U8]): Either[Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_P(reader: Reader): Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_P = {
      val r = reader.readVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_P _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PS(o: Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PS(o)
    return w.result
  }

  def toVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PS(data: ISZ[U8]): Either[Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PS(reader: Reader): Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PS = {
      val r = reader.readVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PS _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container(o: Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container(o)
    return w.result
  }

  def toVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container(data: ISZ[U8]): Either[Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container(reader: Reader): Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container = {
      val r = reader.readVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container()
      return r
    }
    val r = to(data, fVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_P(o: Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_P(o)
    return w.result
  }

  def toVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_P(data: ISZ[U8]): Either[Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_P(reader: Reader): Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_P = {
      val r = reader.readVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_P _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PS(o: Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PS(o)
    return w.result
  }

  def toVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PS(data: ISZ[U8]): Either[Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PS(reader: Reader): Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PS = {
      val r = reader.readVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container(o: Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container(o)
    return w.result
  }

  def toVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container(data: ISZ[U8]): Either[Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container(reader: Reader): Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container = {
      val r = reader.readVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container()
      return r
    }
    val r = to(data, fVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_P(o: Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_P(o)
    return w.result
  }

  def toVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_P(data: ISZ[U8]): Either[Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_P(reader: Reader): Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_P = {
      val r = reader.readVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_P _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PS(o: Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PS(o)
    return w.result
  }

  def toVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PS(data: ISZ[U8]): Either[Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PS(reader: Reader): Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PS = {
      val r = reader.readVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PS _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container(o: Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container(o)
    return w.result
  }

  def toVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container(data: ISZ[U8]): Either[Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container(reader: Reader): Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container = {
      val r = reader.readVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container()
      return r
    }
    val r = to(data, fVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_P(o: Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_P(o)
    return w.result
  }

  def toVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_P(data: ISZ[U8]): Either[Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_P(reader: Reader): Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_P = {
      val r = reader.readVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_P _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PS(o: Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PS(o)
    return w.result
  }

  def toVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PS(data: ISZ[U8]): Either[Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PS(reader: Reader): Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PS = {
      val r = reader.readVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container(o: Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container(o)
    return w.result
  }

  def toVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container(data: ISZ[U8]): Either[Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container(reader: Reader): Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container = {
      val r = reader.readVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container()
      return r
    }
    val r = to(data, fVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_P(o: Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_P(o)
    return w.result
  }

  def toVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_P(data: ISZ[U8]): Either[Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_P(reader: Reader): Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_P = {
      val r = reader.readVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_P _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PS(o: Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PS(o)
    return w.result
  }

  def toVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PS(data: ISZ[U8]): Either[Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PS(reader: Reader): Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PS = {
      val r = reader.readVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PS _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container(o: Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container(o)
    return w.result
  }

  def toVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container(data: ISZ[U8]): Either[Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container(reader: Reader): Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container = {
      val r = reader.readVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container()
      return r
    }
    val r = to(data, fVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_P(o: Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_P(o)
    return w.result
  }

  def toVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_P(data: ISZ[U8]): Either[Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_P(reader: Reader): Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_P = {
      val r = reader.readVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_P _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PS(o: Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PS(o)
    return w.result
  }

  def toVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PS(data: ISZ[U8]): Either[Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PS(reader: Reader): Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PS = {
      val r = reader.readVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container(o: Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container(o)
    return w.result
  }

  def toVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container(data: ISZ[U8]): Either[Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container(reader: Reader): Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container = {
      val r = reader.readVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container()
      return r
    }
    val r = to(data, fVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_P(o: Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_P(o)
    return w.result
  }

  def toVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_P(data: ISZ[U8]): Either[Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_P(reader: Reader): Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_P = {
      val r = reader.readVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_P _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PS(o: Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PS(o)
    return w.result
  }

  def toVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PS(data: ISZ[U8]): Either[Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PS(reader: Reader): Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PS = {
      val r = reader.readVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PS _)
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