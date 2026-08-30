// #Sireum
// @formatter:off

// This file is auto-generated from ReportedCondition.scala, ReportCurrency.scala, ConditionAssessment.scala, SelectedIntent.scala, ControllerMode.scala, TransitionKind.scala, ParkingBrakeDisposition.scala, CoordinationStatus.scala, RecoveryTarget.scala, QualifiedTransition.scala, LifecycleLevels.scala, LifecycleFacts.scala, ServiceLevels.scala, ServiceFacts.scala, ConditionEvidence.scala, ArbitrationResult.scala, TransitionResolution.scala, CoordinationOutcome.scala, Base_Types.scala, LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_Containers.scala, ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_Containers.scala, ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_Containers.scala, IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_Containers.scala, CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_Containers.scala, RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_Containers.scala, TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_Containers.scala, ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package scp_candidate

import org.sireum._

object MsgPack {

  object Constants {

    val Vehicle_Mode_CoordinatorReportedCondition_Payload: Z = -32

    val Vehicle_Mode_CoordinatorReportCurrency_Payload: Z = -31

    val Vehicle_Mode_CoordinatorConditionAssessment_Payload: Z = -30

    val Vehicle_Mode_CoordinatorSelectedIntent_Payload: Z = -29

    val Vehicle_Mode_CoordinatorControllerMode_Payload: Z = -28

    val Vehicle_Mode_CoordinatorTransitionKind_Payload: Z = -27

    val Vehicle_Mode_CoordinatorParkingBrakeDisposition_Payload: Z = -26

    val Vehicle_Mode_CoordinatorCoordinationStatus_Payload: Z = -25

    val Vehicle_Mode_CoordinatorRecoveryTarget_Payload: Z = -24

    val Vehicle_Mode_CoordinatorQualifiedTransition_Payload: Z = -23

    val Vehicle_Mode_CoordinatorLifecycleLevels: Z = -22

    val Vehicle_Mode_CoordinatorLifecycleLevels_Payload: Z = -21

    val Vehicle_Mode_CoordinatorLifecycleFacts: Z = -20

    val Vehicle_Mode_CoordinatorLifecycleFacts_Payload: Z = -19

    val Vehicle_Mode_CoordinatorServiceLevels: Z = -18

    val Vehicle_Mode_CoordinatorServiceLevels_Payload: Z = -17

    val Vehicle_Mode_CoordinatorServiceFacts: Z = -16

    val Vehicle_Mode_CoordinatorServiceFacts_Payload: Z = -15

    val Vehicle_Mode_CoordinatorConditionEvidence: Z = -14

    val Vehicle_Mode_CoordinatorConditionEvidence_Payload: Z = -13

    val Vehicle_Mode_CoordinatorArbitrationResult: Z = -12

    val Vehicle_Mode_CoordinatorArbitrationResult_Payload: Z = -11

    val Vehicle_Mode_CoordinatorTransitionResolution: Z = -10

    val Vehicle_Mode_CoordinatorTransitionResolution_Payload: Z = -9

    val Vehicle_Mode_CoordinatorCoordinationOutcome: Z = -8

    val Vehicle_Mode_CoordinatorCoordinationOutcome_Payload: Z = -7

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

    val Vehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_P: Z = 10

    val Vehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PS: Z = 11

    val Vehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_P: Z = 12

    val Vehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PS: Z = 13

    val Vehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_P: Z = 14

    val Vehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PS: Z = 15

    val Vehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_P: Z = 16

    val Vehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PS: Z = 17

    val Vehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_P: Z = 18

    val Vehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PS: Z = 19

    val Vehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_P: Z = 20

    val Vehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PS: Z = 21

    val Vehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_P: Z = 22

    val Vehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PS: Z = 23

    val Vehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_P: Z = 24

    val Vehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PS: Z = 25

    val Vehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_P: Z = 26

    val Vehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PS: Z = 27

    val Vehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_P: Z = 28

    val Vehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PS: Z = 29

    val Vehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_P: Z = 30

    val Vehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PS: Z = 31

    val Vehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_P: Z = 32

    val Vehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PS: Z = 33

    val Vehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_P: Z = 34

    val Vehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PS: Z = 35

    val Vehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_P: Z = 36

    val Vehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PS: Z = 37

    val Vehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_P: Z = 38

    val Vehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PS: Z = 39

    val Vehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_P: Z = 40

    val Vehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PS: Z = 41

    val utilEmptyContainer: Z = 42

    val _artEmpty: Z = 43

  }

  object Writer {

    @record class Default(val writer: MessagePack.Writer.Impl) extends Writer

  }

  @msig trait Writer {

    def writer: MessagePack.Writer

    def writeVehicle_Mode_CoordinatorReportedConditionType(o: Vehicle_Mode_Coordinator.ReportedCondition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Mode_CoordinatorReportedCondition_Payload(o: Vehicle_Mode_Coordinator.ReportedCondition_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Mode_CoordinatorReportedCondition_Payload)
      writeVehicle_Mode_CoordinatorReportedConditionType(o.value)
    }

    def writeVehicle_Mode_CoordinatorReportCurrencyType(o: Vehicle_Mode_Coordinator.ReportCurrency.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Mode_CoordinatorReportCurrency_Payload(o: Vehicle_Mode_Coordinator.ReportCurrency_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Mode_CoordinatorReportCurrency_Payload)
      writeVehicle_Mode_CoordinatorReportCurrencyType(o.value)
    }

    def writeVehicle_Mode_CoordinatorConditionAssessmentType(o: Vehicle_Mode_Coordinator.ConditionAssessment.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Mode_CoordinatorConditionAssessment_Payload(o: Vehicle_Mode_Coordinator.ConditionAssessment_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Mode_CoordinatorConditionAssessment_Payload)
      writeVehicle_Mode_CoordinatorConditionAssessmentType(o.value)
    }

    def writeVehicle_Mode_CoordinatorSelectedIntentType(o: Vehicle_Mode_Coordinator.SelectedIntent.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Mode_CoordinatorSelectedIntent_Payload(o: Vehicle_Mode_Coordinator.SelectedIntent_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Mode_CoordinatorSelectedIntent_Payload)
      writeVehicle_Mode_CoordinatorSelectedIntentType(o.value)
    }

    def writeVehicle_Mode_CoordinatorControllerModeType(o: Vehicle_Mode_Coordinator.ControllerMode.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Mode_CoordinatorControllerMode_Payload(o: Vehicle_Mode_Coordinator.ControllerMode_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Mode_CoordinatorControllerMode_Payload)
      writeVehicle_Mode_CoordinatorControllerModeType(o.value)
    }

    def writeVehicle_Mode_CoordinatorTransitionKindType(o: Vehicle_Mode_Coordinator.TransitionKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Mode_CoordinatorTransitionKind_Payload(o: Vehicle_Mode_Coordinator.TransitionKind_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Mode_CoordinatorTransitionKind_Payload)
      writeVehicle_Mode_CoordinatorTransitionKindType(o.value)
    }

    def writeVehicle_Mode_CoordinatorParkingBrakeDispositionType(o: Vehicle_Mode_Coordinator.ParkingBrakeDisposition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Mode_CoordinatorParkingBrakeDisposition_Payload(o: Vehicle_Mode_Coordinator.ParkingBrakeDisposition_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Mode_CoordinatorParkingBrakeDisposition_Payload)
      writeVehicle_Mode_CoordinatorParkingBrakeDispositionType(o.value)
    }

    def writeVehicle_Mode_CoordinatorCoordinationStatusType(o: Vehicle_Mode_Coordinator.CoordinationStatus.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Mode_CoordinatorCoordinationStatus_Payload(o: Vehicle_Mode_Coordinator.CoordinationStatus_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Mode_CoordinatorCoordinationStatus_Payload)
      writeVehicle_Mode_CoordinatorCoordinationStatusType(o.value)
    }

    def writeVehicle_Mode_CoordinatorRecoveryTargetType(o: Vehicle_Mode_Coordinator.RecoveryTarget.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Mode_CoordinatorRecoveryTarget_Payload(o: Vehicle_Mode_Coordinator.RecoveryTarget_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Mode_CoordinatorRecoveryTarget_Payload)
      writeVehicle_Mode_CoordinatorRecoveryTargetType(o.value)
    }

    def writeVehicle_Mode_CoordinatorQualifiedTransitionType(o: Vehicle_Mode_Coordinator.QualifiedTransition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Mode_CoordinatorQualifiedTransition_Payload(o: Vehicle_Mode_Coordinator.QualifiedTransition_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Mode_CoordinatorQualifiedTransition_Payload)
      writeVehicle_Mode_CoordinatorQualifiedTransitionType(o.value)
    }

    def writeVehicle_Mode_CoordinatorLifecycleLevels(o: Vehicle_Mode_Coordinator.LifecycleLevels): Unit = {
      writer.writeZ(Constants.Vehicle_Mode_CoordinatorLifecycleLevels)
      writer.writeB(o.startLevel)
      writer.writeB(o.onLevel)
      writer.writeB(o.offLevel)
    }

    def writeVehicle_Mode_CoordinatorLifecycleLevels_Payload(o: Vehicle_Mode_Coordinator.LifecycleLevels_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Mode_CoordinatorLifecycleLevels_Payload)
      writeVehicle_Mode_CoordinatorLifecycleLevels(o.value)
    }

    def writeVehicle_Mode_CoordinatorLifecycleFacts(o: Vehicle_Mode_Coordinator.LifecycleFacts): Unit = {
      writer.writeZ(Constants.Vehicle_Mode_CoordinatorLifecycleFacts)
      writer.writeB(o.freshStart)
      writer.writeB(o.freshOn)
      writer.writeB(o.offActive)
      writer.writeB(o.lifecycleConflict)
    }

    def writeVehicle_Mode_CoordinatorLifecycleFacts_Payload(o: Vehicle_Mode_Coordinator.LifecycleFacts_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Mode_CoordinatorLifecycleFacts_Payload)
      writeVehicle_Mode_CoordinatorLifecycleFacts(o.value)
    }

    def writeVehicle_Mode_CoordinatorServiceLevels(o: Vehicle_Mode_Coordinator.ServiceLevels): Unit = {
      writer.writeZ(Constants.Vehicle_Mode_CoordinatorServiceLevels)
      writer.writeB(o.maintenanceLevel)
      writer.writeB(o.returnNormalLevel)
    }

    def writeVehicle_Mode_CoordinatorServiceLevels_Payload(o: Vehicle_Mode_Coordinator.ServiceLevels_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Mode_CoordinatorServiceLevels_Payload)
      writeVehicle_Mode_CoordinatorServiceLevels(o.value)
    }

    def writeVehicle_Mode_CoordinatorServiceFacts(o: Vehicle_Mode_Coordinator.ServiceFacts): Unit = {
      writer.writeZ(Constants.Vehicle_Mode_CoordinatorServiceFacts)
      writer.writeB(o.freshMaintenance)
      writer.writeB(o.freshReturn)
      writer.writeB(o.serviceConflict)
    }

    def writeVehicle_Mode_CoordinatorServiceFacts_Payload(o: Vehicle_Mode_Coordinator.ServiceFacts_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Mode_CoordinatorServiceFacts_Payload)
      writeVehicle_Mode_CoordinatorServiceFacts(o.value)
    }

    def writeVehicle_Mode_CoordinatorConditionEvidence(o: Vehicle_Mode_Coordinator.ConditionEvidence): Unit = {
      writer.writeZ(Constants.Vehicle_Mode_CoordinatorConditionEvidence)
      writeVehicle_Mode_CoordinatorReportedConditionType(o.reportedCondition)
      writeVehicle_Mode_CoordinatorReportCurrencyType(o.reportCurrency)
    }

    def writeVehicle_Mode_CoordinatorConditionEvidence_Payload(o: Vehicle_Mode_Coordinator.ConditionEvidence_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Mode_CoordinatorConditionEvidence_Payload)
      writeVehicle_Mode_CoordinatorConditionEvidence(o.value)
    }

    def writeVehicle_Mode_CoordinatorArbitrationResult(o: Vehicle_Mode_Coordinator.ArbitrationResult): Unit = {
      writer.writeZ(Constants.Vehicle_Mode_CoordinatorArbitrationResult)
      writeVehicle_Mode_CoordinatorSelectedIntentType(o.selectedIntent)
      writer.writeB(o.priorityConflict)
    }

    def writeVehicle_Mode_CoordinatorArbitrationResult_Payload(o: Vehicle_Mode_Coordinator.ArbitrationResult_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Mode_CoordinatorArbitrationResult_Payload)
      writeVehicle_Mode_CoordinatorArbitrationResult(o.value)
    }

    def writeVehicle_Mode_CoordinatorTransitionResolution(o: Vehicle_Mode_Coordinator.TransitionResolution): Unit = {
      writer.writeZ(Constants.Vehicle_Mode_CoordinatorTransitionResolution)
      writeVehicle_Mode_CoordinatorControllerModeType(o.nextMode)
      writeVehicle_Mode_CoordinatorTransitionKindType(o.kind)
      writer.writeB(o.accepted)
    }

    def writeVehicle_Mode_CoordinatorTransitionResolution_Payload(o: Vehicle_Mode_Coordinator.TransitionResolution_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Mode_CoordinatorTransitionResolution_Payload)
      writeVehicle_Mode_CoordinatorTransitionResolution(o.value)
    }

    def writeVehicle_Mode_CoordinatorCoordinationOutcome(o: Vehicle_Mode_Coordinator.CoordinationOutcome): Unit = {
      writer.writeZ(Constants.Vehicle_Mode_CoordinatorCoordinationOutcome)
      writeVehicle_Mode_CoordinatorParkingBrakeDispositionType(o.parkingBrake)
      writeVehicle_Mode_CoordinatorCoordinationStatusType(o.status)
    }

    def writeVehicle_Mode_CoordinatorCoordinationOutcome_Payload(o: Vehicle_Mode_Coordinator.CoordinationOutcome_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Mode_CoordinatorCoordinationOutcome_Payload)
      writeVehicle_Mode_CoordinatorCoordinationOutcome(o.value)
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

    def writeVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container(o: Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container): Unit = {
      o match {
        case o: Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_P => writeVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PS => writeVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PS(o)
      }
    }

    def writeVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_P(o: Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_P)
      writeVehicle_Mode_CoordinatorLifecycleLevels(o.api_lifecycleLevels)
    }

    def writeVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PS(o: Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PS)
      writer.writeB(o.In_previousOff)
      writer.writeB(o.In_previousOn)
      writer.writeB(o.In_previousStart)
      writeVehicle_Mode_CoordinatorLifecycleLevels(o.api_lifecycleLevels)
    }

    def writeVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container(o: Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container): Unit = {
      o match {
        case o: Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_P => writeVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PS => writeVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PS(o)
      }
    }

    def writeVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_P(o: Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_P)
      writeVehicle_Mode_CoordinatorLifecycleFacts(o.api_lifecycleFacts)
    }

    def writeVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PS(o: Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PS)
      writer.writeB(o.previousOff)
      writer.writeB(o.previousOn)
      writer.writeB(o.previousStart)
      writeVehicle_Mode_CoordinatorLifecycleFacts(o.api_lifecycleFacts)
    }

    def writeVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container(o: Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container): Unit = {
      o match {
        case o: Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_P => writeVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PS => writeVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PS(o)
      }
    }

    def writeVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_P(o: Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_P)
      writeVehicle_Mode_CoordinatorServiceLevels(o.api_serviceLevels)
    }

    def writeVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PS(o: Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PS)
      writer.writeB(o.In_previousMaintenance)
      writer.writeB(o.In_previousReturn)
      writeVehicle_Mode_CoordinatorServiceLevels(o.api_serviceLevels)
    }

    def writeVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container(o: Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container): Unit = {
      o match {
        case o: Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_P => writeVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PS => writeVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PS(o)
      }
    }

    def writeVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_P(o: Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_P)
      writeVehicle_Mode_CoordinatorServiceFacts(o.api_serviceFacts)
    }

    def writeVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PS(o: Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PS)
      writer.writeB(o.previousMaintenance)
      writer.writeB(o.previousReturn)
      writeVehicle_Mode_CoordinatorServiceFacts(o.api_serviceFacts)
    }

    def writeVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container(o: Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container): Unit = {
      o match {
        case o: Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_P => writeVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PS => writeVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PS(o)
      }
    }

    def writeVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_P(o: Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_P)
      writeVehicle_Mode_CoordinatorConditionEvidence(o.api_conditionEvidence)
    }

    def writeVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PS(o: Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PS)
      writeVehicle_Mode_CoordinatorConditionEvidence(o.api_conditionEvidence)
    }

    def writeVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container(o: Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container): Unit = {
      o match {
        case o: Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_P => writeVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PS => writeVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PS(o)
      }
    }

    def writeVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_P(o: Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_P)
      writeVehicle_Mode_CoordinatorConditionAssessmentType(o.api_conditionAssessment)
    }

    def writeVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PS(o: Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PS)
      writeVehicle_Mode_CoordinatorConditionAssessmentType(o.api_conditionAssessment)
    }

    def writeVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container(o: Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container): Unit = {
      o match {
        case o: Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_P => writeVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PS => writeVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PS(o)
      }
    }

    def writeVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_P(o: Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_P)
      writeVehicle_Mode_CoordinatorConditionAssessmentType(o.api_conditionAssessment)
      writeVehicle_Mode_CoordinatorLifecycleFacts(o.api_lifecycleFacts)
      writeVehicle_Mode_CoordinatorServiceFacts(o.api_serviceFacts)
    }

    def writeVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PS(o: Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PS)
      writeVehicle_Mode_CoordinatorConditionAssessmentType(o.api_conditionAssessment)
      writeVehicle_Mode_CoordinatorLifecycleFacts(o.api_lifecycleFacts)
      writeVehicle_Mode_CoordinatorServiceFacts(o.api_serviceFacts)
    }

    def writeVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container(o: Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container): Unit = {
      o match {
        case o: Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_P => writeVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PS => writeVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PS(o)
      }
    }

    def writeVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_P(o: Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_P)
      writeVehicle_Mode_CoordinatorArbitrationResult(o.api_arbitrationForPublication)
      writeVehicle_Mode_CoordinatorArbitrationResult(o.api_arbitrationForQualification)
    }

    def writeVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PS(o: Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PS)
      writeVehicle_Mode_CoordinatorArbitrationResult(o.api_arbitrationForPublication)
      writeVehicle_Mode_CoordinatorArbitrationResult(o.api_arbitrationForQualification)
    }

    def writeVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container(o: Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container): Unit = {
      o match {
        case o: Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_P => writeVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PS => writeVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PS(o)
      }
    }

    def writeVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_P(o: Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_P)
      writeVehicle_Mode_CoordinatorTransitionResolution(o.api_appliedResolution)
      writeVehicle_Mode_CoordinatorArbitrationResult(o.api_arbitrationResult)
    }

    def writeVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PS(o: Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PS)
      writeVehicle_Mode_CoordinatorTransitionResolution(o.api_appliedResolution)
      writeVehicle_Mode_CoordinatorArbitrationResult(o.api_arbitrationResult)
    }

    def writeVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container(o: Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container): Unit = {
      o match {
        case o: Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_P => writeVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PS => writeVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PS(o)
      }
    }

    def writeVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_P(o: Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_P)
      writeVehicle_Mode_CoordinatorCoordinationOutcome(o.api_coordinationOutcome)
    }

    def writeVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PS(o: Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PS)
      writeVehicle_Mode_CoordinatorCoordinationOutcome(o.api_coordinationOutcome)
    }

    def writeVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container(o: Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container): Unit = {
      o match {
        case o: Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_P => writeVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PS => writeVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PS(o)
      }
    }

    def writeVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_P(o: Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_P)
      writeVehicle_Mode_CoordinatorTransitionResolution(o.api_appliedResolution)
      writeVehicle_Mode_CoordinatorControllerModeType(o.api_currentMode)
    }

    def writeVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PS(o: Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PS)
      writeVehicle_Mode_CoordinatorRecoveryTargetType(o.In_recoveryTarget)
      writeVehicle_Mode_CoordinatorTransitionResolution(o.api_appliedResolution)
      writeVehicle_Mode_CoordinatorControllerModeType(o.api_currentMode)
    }

    def writeVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container(o: Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container): Unit = {
      o match {
        case o: Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_P => writeVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PS => writeVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PS(o)
      }
    }

    def writeVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_P(o: Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_P)
      writeVehicle_Mode_CoordinatorRecoveryTargetType(o.api_storedRecoveryTarget)
    }

    def writeVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PS(o: Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PS)
      writeVehicle_Mode_CoordinatorRecoveryTargetType(o.recoveryTarget)
      writeVehicle_Mode_CoordinatorRecoveryTargetType(o.api_storedRecoveryTarget)
    }

    def writeVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container(o: Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container): Unit = {
      o match {
        case o: Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_P => writeVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PS => writeVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PS(o)
      }
    }

    def writeVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_P(o: Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_P)
      writeVehicle_Mode_CoordinatorArbitrationResult(o.api_arbitrationResult)
      writeVehicle_Mode_CoordinatorControllerModeType(o.api_currentMode)
    }

    def writeVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PS(o: Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PS)
      writeVehicle_Mode_CoordinatorArbitrationResult(o.api_arbitrationResult)
      writeVehicle_Mode_CoordinatorControllerModeType(o.api_currentMode)
    }

    def writeVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container(o: Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container): Unit = {
      o match {
        case o: Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_P => writeVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PS => writeVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PS(o)
      }
    }

    def writeVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_P(o: Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_P)
      writeVehicle_Mode_CoordinatorQualifiedTransitionType(o.api_qualifiedTransition)
    }

    def writeVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PS(o: Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PS)
      writeVehicle_Mode_CoordinatorQualifiedTransitionType(o.api_qualifiedTransition)
    }

    def writeVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container(o: Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container): Unit = {
      o match {
        case o: Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_P => writeVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PS => writeVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PS(o)
      }
    }

    def writeVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_P(o: Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_P)
      writeVehicle_Mode_CoordinatorQualifiedTransitionType(o.api_qualifiedTransition)
      writeVehicle_Mode_CoordinatorRecoveryTargetType(o.api_storedRecoveryTarget)
    }

    def writeVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PS(o: Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PS)
      writeVehicle_Mode_CoordinatorControllerModeType(o.In_controllerMode)
      writeVehicle_Mode_CoordinatorQualifiedTransitionType(o.api_qualifiedTransition)
      writeVehicle_Mode_CoordinatorRecoveryTargetType(o.api_storedRecoveryTarget)
    }

    def writeVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container(o: Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container): Unit = {
      o match {
        case o: Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_P => writeVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PS => writeVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PS(o)
      }
    }

    def writeVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_P(o: Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_P)
      writeVehicle_Mode_CoordinatorControllerModeType(o.api_appliedNextMode)
      writeVehicle_Mode_CoordinatorControllerModeType(o.api_modeForQualification)
      writeVehicle_Mode_CoordinatorControllerModeType(o.api_modeForRecovery)
      writeVehicle_Mode_CoordinatorTransitionResolution(o.api_resolutionForPublication)
      writeVehicle_Mode_CoordinatorTransitionResolution(o.api_resolutionForRecovery)
    }

    def writeVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PS(o: Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PS)
      writeVehicle_Mode_CoordinatorControllerModeType(o.controllerMode)
      writeVehicle_Mode_CoordinatorControllerModeType(o.api_appliedNextMode)
      writeVehicle_Mode_CoordinatorControllerModeType(o.api_modeForQualification)
      writeVehicle_Mode_CoordinatorControllerModeType(o.api_modeForRecovery)
      writeVehicle_Mode_CoordinatorTransitionResolution(o.api_resolutionForPublication)
      writeVehicle_Mode_CoordinatorTransitionResolution(o.api_resolutionForRecovery)
    }

    def writeruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeutilContainer(o: util.Container): Unit = {
      o match {
        case o: util.EmptyContainer => writeutilEmptyContainer(o)
        case o: Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_P => writeVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PS => writeVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PS(o)
        case o: Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_P => writeVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PS => writeVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PS(o)
        case o: Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_P => writeVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_P => writeVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PS => writeVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PS(o)
        case o: Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PS => writeVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PS(o)
        case o: Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_P => writeVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_P => writeVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PS => writeVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PS(o)
        case o: Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PS => writeVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PS(o)
        case o: Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_P => writeVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PS => writeVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PS(o)
        case o: Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_P => writeVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PS => writeVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PS(o)
        case o: Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_P => writeVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PS => writeVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PS(o)
        case o: Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_P => writeVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PS => writeVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PS(o)
        case o: Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_P => writeVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_P => writeVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PS => writeVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PS(o)
        case o: Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PS => writeVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PS(o)
        case o: Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_P => writeVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_P => writeVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PS => writeVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PS(o)
        case o: Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PS => writeVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PS(o)
        case o: Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_P => writeVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PS => writeVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PS(o)
        case o: Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_P => writeVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PS => writeVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PS(o)
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
        case o: Vehicle_Mode_Coordinator.ServiceFacts_Payload => writeVehicle_Mode_CoordinatorServiceFacts_Payload(o)
        case o: Vehicle_Mode_Coordinator.ServiceLevels_Payload => writeVehicle_Mode_CoordinatorServiceLevels_Payload(o)
        case o: Vehicle_Mode_Coordinator.ReportCurrency_Payload => writeVehicle_Mode_CoordinatorReportCurrency_Payload(o)
        case o: Vehicle_Mode_Coordinator.RecoveryTarget_Payload => writeVehicle_Mode_CoordinatorRecoveryTarget_Payload(o)
        case o: Vehicle_Mode_Coordinator.ControllerMode_Payload => writeVehicle_Mode_CoordinatorControllerMode_Payload(o)
        case o: Vehicle_Mode_Coordinator.TransitionKind_Payload => writeVehicle_Mode_CoordinatorTransitionKind_Payload(o)
        case o: Vehicle_Mode_Coordinator.SelectedIntent_Payload => writeVehicle_Mode_CoordinatorSelectedIntent_Payload(o)
        case o: Vehicle_Mode_Coordinator.LifecycleFacts_Payload => writeVehicle_Mode_CoordinatorLifecycleFacts_Payload(o)
        case o: Vehicle_Mode_Coordinator.LifecycleLevels_Payload => writeVehicle_Mode_CoordinatorLifecycleLevels_Payload(o)
        case o: Vehicle_Mode_Coordinator.ReportedCondition_Payload => writeVehicle_Mode_CoordinatorReportedCondition_Payload(o)
        case o: Vehicle_Mode_Coordinator.ArbitrationResult_Payload => writeVehicle_Mode_CoordinatorArbitrationResult_Payload(o)
        case o: Vehicle_Mode_Coordinator.ConditionEvidence_Payload => writeVehicle_Mode_CoordinatorConditionEvidence_Payload(o)
        case o: Vehicle_Mode_Coordinator.CoordinationStatus_Payload => writeVehicle_Mode_CoordinatorCoordinationStatus_Payload(o)
        case o: Vehicle_Mode_Coordinator.ConditionAssessment_Payload => writeVehicle_Mode_CoordinatorConditionAssessment_Payload(o)
        case o: Vehicle_Mode_Coordinator.QualifiedTransition_Payload => writeVehicle_Mode_CoordinatorQualifiedTransition_Payload(o)
        case o: Vehicle_Mode_Coordinator.CoordinationOutcome_Payload => writeVehicle_Mode_CoordinatorCoordinationOutcome_Payload(o)
        case o: Vehicle_Mode_Coordinator.TransitionResolution_Payload => writeVehicle_Mode_CoordinatorTransitionResolution_Payload(o)
        case o: Vehicle_Mode_Coordinator.ParkingBrakeDisposition_Payload => writeVehicle_Mode_CoordinatorParkingBrakeDisposition_Payload(o)
        case o: Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_P => writeVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PS => writeVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PS(o)
        case o: Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_P => writeVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PS => writeVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PS(o)
        case o: Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_P => writeVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_P => writeVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PS => writeVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PS(o)
        case o: Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PS => writeVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PS(o)
        case o: Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_P => writeVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_P => writeVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PS => writeVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PS(o)
        case o: Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PS => writeVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PS(o)
        case o: Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_P => writeVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PS => writeVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PS(o)
        case o: Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_P => writeVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PS => writeVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PS(o)
        case o: Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_P => writeVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PS => writeVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PS(o)
        case o: Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_P => writeVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PS => writeVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PS(o)
        case o: Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_P => writeVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_P => writeVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PS => writeVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PS(o)
        case o: Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PS => writeVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PS(o)
        case o: Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_P => writeVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_P => writeVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PS => writeVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PS(o)
        case o: Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PS => writeVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PS(o)
        case o: Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_P => writeVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PS => writeVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PS(o)
        case o: Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_P => writeVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PS => writeVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PS(o)
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

    def readVehicle_Mode_CoordinatorReportedConditionType(): Vehicle_Mode_Coordinator.ReportedCondition.Type = {
      val r = reader.readZ()
      return Vehicle_Mode_Coordinator.ReportedCondition.byOrdinal(r).get
    }

    def readVehicle_Mode_CoordinatorReportedCondition_Payload(): Vehicle_Mode_Coordinator.ReportedCondition_Payload = {
      val r = readVehicle_Mode_CoordinatorReportedCondition_PayloadT(F)
      return r
    }

    def readVehicle_Mode_CoordinatorReportedCondition_PayloadT(typeParsed: B): Vehicle_Mode_Coordinator.ReportedCondition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Mode_CoordinatorReportedCondition_Payload)
      }
      val value = readVehicle_Mode_CoordinatorReportedConditionType()
      return Vehicle_Mode_Coordinator.ReportedCondition_Payload(value)
    }

    def readVehicle_Mode_CoordinatorReportCurrencyType(): Vehicle_Mode_Coordinator.ReportCurrency.Type = {
      val r = reader.readZ()
      return Vehicle_Mode_Coordinator.ReportCurrency.byOrdinal(r).get
    }

    def readVehicle_Mode_CoordinatorReportCurrency_Payload(): Vehicle_Mode_Coordinator.ReportCurrency_Payload = {
      val r = readVehicle_Mode_CoordinatorReportCurrency_PayloadT(F)
      return r
    }

    def readVehicle_Mode_CoordinatorReportCurrency_PayloadT(typeParsed: B): Vehicle_Mode_Coordinator.ReportCurrency_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Mode_CoordinatorReportCurrency_Payload)
      }
      val value = readVehicle_Mode_CoordinatorReportCurrencyType()
      return Vehicle_Mode_Coordinator.ReportCurrency_Payload(value)
    }

    def readVehicle_Mode_CoordinatorConditionAssessmentType(): Vehicle_Mode_Coordinator.ConditionAssessment.Type = {
      val r = reader.readZ()
      return Vehicle_Mode_Coordinator.ConditionAssessment.byOrdinal(r).get
    }

    def readVehicle_Mode_CoordinatorConditionAssessment_Payload(): Vehicle_Mode_Coordinator.ConditionAssessment_Payload = {
      val r = readVehicle_Mode_CoordinatorConditionAssessment_PayloadT(F)
      return r
    }

    def readVehicle_Mode_CoordinatorConditionAssessment_PayloadT(typeParsed: B): Vehicle_Mode_Coordinator.ConditionAssessment_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Mode_CoordinatorConditionAssessment_Payload)
      }
      val value = readVehicle_Mode_CoordinatorConditionAssessmentType()
      return Vehicle_Mode_Coordinator.ConditionAssessment_Payload(value)
    }

    def readVehicle_Mode_CoordinatorSelectedIntentType(): Vehicle_Mode_Coordinator.SelectedIntent.Type = {
      val r = reader.readZ()
      return Vehicle_Mode_Coordinator.SelectedIntent.byOrdinal(r).get
    }

    def readVehicle_Mode_CoordinatorSelectedIntent_Payload(): Vehicle_Mode_Coordinator.SelectedIntent_Payload = {
      val r = readVehicle_Mode_CoordinatorSelectedIntent_PayloadT(F)
      return r
    }

    def readVehicle_Mode_CoordinatorSelectedIntent_PayloadT(typeParsed: B): Vehicle_Mode_Coordinator.SelectedIntent_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Mode_CoordinatorSelectedIntent_Payload)
      }
      val value = readVehicle_Mode_CoordinatorSelectedIntentType()
      return Vehicle_Mode_Coordinator.SelectedIntent_Payload(value)
    }

    def readVehicle_Mode_CoordinatorControllerModeType(): Vehicle_Mode_Coordinator.ControllerMode.Type = {
      val r = reader.readZ()
      return Vehicle_Mode_Coordinator.ControllerMode.byOrdinal(r).get
    }

    def readVehicle_Mode_CoordinatorControllerMode_Payload(): Vehicle_Mode_Coordinator.ControllerMode_Payload = {
      val r = readVehicle_Mode_CoordinatorControllerMode_PayloadT(F)
      return r
    }

    def readVehicle_Mode_CoordinatorControllerMode_PayloadT(typeParsed: B): Vehicle_Mode_Coordinator.ControllerMode_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Mode_CoordinatorControllerMode_Payload)
      }
      val value = readVehicle_Mode_CoordinatorControllerModeType()
      return Vehicle_Mode_Coordinator.ControllerMode_Payload(value)
    }

    def readVehicle_Mode_CoordinatorTransitionKindType(): Vehicle_Mode_Coordinator.TransitionKind.Type = {
      val r = reader.readZ()
      return Vehicle_Mode_Coordinator.TransitionKind.byOrdinal(r).get
    }

    def readVehicle_Mode_CoordinatorTransitionKind_Payload(): Vehicle_Mode_Coordinator.TransitionKind_Payload = {
      val r = readVehicle_Mode_CoordinatorTransitionKind_PayloadT(F)
      return r
    }

    def readVehicle_Mode_CoordinatorTransitionKind_PayloadT(typeParsed: B): Vehicle_Mode_Coordinator.TransitionKind_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Mode_CoordinatorTransitionKind_Payload)
      }
      val value = readVehicle_Mode_CoordinatorTransitionKindType()
      return Vehicle_Mode_Coordinator.TransitionKind_Payload(value)
    }

    def readVehicle_Mode_CoordinatorParkingBrakeDispositionType(): Vehicle_Mode_Coordinator.ParkingBrakeDisposition.Type = {
      val r = reader.readZ()
      return Vehicle_Mode_Coordinator.ParkingBrakeDisposition.byOrdinal(r).get
    }

    def readVehicle_Mode_CoordinatorParkingBrakeDisposition_Payload(): Vehicle_Mode_Coordinator.ParkingBrakeDisposition_Payload = {
      val r = readVehicle_Mode_CoordinatorParkingBrakeDisposition_PayloadT(F)
      return r
    }

    def readVehicle_Mode_CoordinatorParkingBrakeDisposition_PayloadT(typeParsed: B): Vehicle_Mode_Coordinator.ParkingBrakeDisposition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Mode_CoordinatorParkingBrakeDisposition_Payload)
      }
      val value = readVehicle_Mode_CoordinatorParkingBrakeDispositionType()
      return Vehicle_Mode_Coordinator.ParkingBrakeDisposition_Payload(value)
    }

    def readVehicle_Mode_CoordinatorCoordinationStatusType(): Vehicle_Mode_Coordinator.CoordinationStatus.Type = {
      val r = reader.readZ()
      return Vehicle_Mode_Coordinator.CoordinationStatus.byOrdinal(r).get
    }

    def readVehicle_Mode_CoordinatorCoordinationStatus_Payload(): Vehicle_Mode_Coordinator.CoordinationStatus_Payload = {
      val r = readVehicle_Mode_CoordinatorCoordinationStatus_PayloadT(F)
      return r
    }

    def readVehicle_Mode_CoordinatorCoordinationStatus_PayloadT(typeParsed: B): Vehicle_Mode_Coordinator.CoordinationStatus_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Mode_CoordinatorCoordinationStatus_Payload)
      }
      val value = readVehicle_Mode_CoordinatorCoordinationStatusType()
      return Vehicle_Mode_Coordinator.CoordinationStatus_Payload(value)
    }

    def readVehicle_Mode_CoordinatorRecoveryTargetType(): Vehicle_Mode_Coordinator.RecoveryTarget.Type = {
      val r = reader.readZ()
      return Vehicle_Mode_Coordinator.RecoveryTarget.byOrdinal(r).get
    }

    def readVehicle_Mode_CoordinatorRecoveryTarget_Payload(): Vehicle_Mode_Coordinator.RecoveryTarget_Payload = {
      val r = readVehicle_Mode_CoordinatorRecoveryTarget_PayloadT(F)
      return r
    }

    def readVehicle_Mode_CoordinatorRecoveryTarget_PayloadT(typeParsed: B): Vehicle_Mode_Coordinator.RecoveryTarget_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Mode_CoordinatorRecoveryTarget_Payload)
      }
      val value = readVehicle_Mode_CoordinatorRecoveryTargetType()
      return Vehicle_Mode_Coordinator.RecoveryTarget_Payload(value)
    }

    def readVehicle_Mode_CoordinatorQualifiedTransitionType(): Vehicle_Mode_Coordinator.QualifiedTransition.Type = {
      val r = reader.readZ()
      return Vehicle_Mode_Coordinator.QualifiedTransition.byOrdinal(r).get
    }

    def readVehicle_Mode_CoordinatorQualifiedTransition_Payload(): Vehicle_Mode_Coordinator.QualifiedTransition_Payload = {
      val r = readVehicle_Mode_CoordinatorQualifiedTransition_PayloadT(F)
      return r
    }

    def readVehicle_Mode_CoordinatorQualifiedTransition_PayloadT(typeParsed: B): Vehicle_Mode_Coordinator.QualifiedTransition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Mode_CoordinatorQualifiedTransition_Payload)
      }
      val value = readVehicle_Mode_CoordinatorQualifiedTransitionType()
      return Vehicle_Mode_Coordinator.QualifiedTransition_Payload(value)
    }

    def readVehicle_Mode_CoordinatorLifecycleLevels(): Vehicle_Mode_Coordinator.LifecycleLevels = {
      val r = readVehicle_Mode_CoordinatorLifecycleLevelsT(F)
      return r
    }

    def readVehicle_Mode_CoordinatorLifecycleLevelsT(typeParsed: B): Vehicle_Mode_Coordinator.LifecycleLevels = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Mode_CoordinatorLifecycleLevels)
      }
      val startLevel = reader.readB()
      val onLevel = reader.readB()
      val offLevel = reader.readB()
      return Vehicle_Mode_Coordinator.LifecycleLevels(startLevel, onLevel, offLevel)
    }

    def readVehicle_Mode_CoordinatorLifecycleLevels_Payload(): Vehicle_Mode_Coordinator.LifecycleLevels_Payload = {
      val r = readVehicle_Mode_CoordinatorLifecycleLevels_PayloadT(F)
      return r
    }

    def readVehicle_Mode_CoordinatorLifecycleLevels_PayloadT(typeParsed: B): Vehicle_Mode_Coordinator.LifecycleLevels_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Mode_CoordinatorLifecycleLevels_Payload)
      }
      val value = readVehicle_Mode_CoordinatorLifecycleLevels()
      return Vehicle_Mode_Coordinator.LifecycleLevels_Payload(value)
    }

    def readVehicle_Mode_CoordinatorLifecycleFacts(): Vehicle_Mode_Coordinator.LifecycleFacts = {
      val r = readVehicle_Mode_CoordinatorLifecycleFactsT(F)
      return r
    }

    def readVehicle_Mode_CoordinatorLifecycleFactsT(typeParsed: B): Vehicle_Mode_Coordinator.LifecycleFacts = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Mode_CoordinatorLifecycleFacts)
      }
      val freshStart = reader.readB()
      val freshOn = reader.readB()
      val offActive = reader.readB()
      val lifecycleConflict = reader.readB()
      return Vehicle_Mode_Coordinator.LifecycleFacts(freshStart, freshOn, offActive, lifecycleConflict)
    }

    def readVehicle_Mode_CoordinatorLifecycleFacts_Payload(): Vehicle_Mode_Coordinator.LifecycleFacts_Payload = {
      val r = readVehicle_Mode_CoordinatorLifecycleFacts_PayloadT(F)
      return r
    }

    def readVehicle_Mode_CoordinatorLifecycleFacts_PayloadT(typeParsed: B): Vehicle_Mode_Coordinator.LifecycleFacts_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Mode_CoordinatorLifecycleFacts_Payload)
      }
      val value = readVehicle_Mode_CoordinatorLifecycleFacts()
      return Vehicle_Mode_Coordinator.LifecycleFacts_Payload(value)
    }

    def readVehicle_Mode_CoordinatorServiceLevels(): Vehicle_Mode_Coordinator.ServiceLevels = {
      val r = readVehicle_Mode_CoordinatorServiceLevelsT(F)
      return r
    }

    def readVehicle_Mode_CoordinatorServiceLevelsT(typeParsed: B): Vehicle_Mode_Coordinator.ServiceLevels = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Mode_CoordinatorServiceLevels)
      }
      val maintenanceLevel = reader.readB()
      val returnNormalLevel = reader.readB()
      return Vehicle_Mode_Coordinator.ServiceLevels(maintenanceLevel, returnNormalLevel)
    }

    def readVehicle_Mode_CoordinatorServiceLevels_Payload(): Vehicle_Mode_Coordinator.ServiceLevels_Payload = {
      val r = readVehicle_Mode_CoordinatorServiceLevels_PayloadT(F)
      return r
    }

    def readVehicle_Mode_CoordinatorServiceLevels_PayloadT(typeParsed: B): Vehicle_Mode_Coordinator.ServiceLevels_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Mode_CoordinatorServiceLevels_Payload)
      }
      val value = readVehicle_Mode_CoordinatorServiceLevels()
      return Vehicle_Mode_Coordinator.ServiceLevels_Payload(value)
    }

    def readVehicle_Mode_CoordinatorServiceFacts(): Vehicle_Mode_Coordinator.ServiceFacts = {
      val r = readVehicle_Mode_CoordinatorServiceFactsT(F)
      return r
    }

    def readVehicle_Mode_CoordinatorServiceFactsT(typeParsed: B): Vehicle_Mode_Coordinator.ServiceFacts = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Mode_CoordinatorServiceFacts)
      }
      val freshMaintenance = reader.readB()
      val freshReturn = reader.readB()
      val serviceConflict = reader.readB()
      return Vehicle_Mode_Coordinator.ServiceFacts(freshMaintenance, freshReturn, serviceConflict)
    }

    def readVehicle_Mode_CoordinatorServiceFacts_Payload(): Vehicle_Mode_Coordinator.ServiceFacts_Payload = {
      val r = readVehicle_Mode_CoordinatorServiceFacts_PayloadT(F)
      return r
    }

    def readVehicle_Mode_CoordinatorServiceFacts_PayloadT(typeParsed: B): Vehicle_Mode_Coordinator.ServiceFacts_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Mode_CoordinatorServiceFacts_Payload)
      }
      val value = readVehicle_Mode_CoordinatorServiceFacts()
      return Vehicle_Mode_Coordinator.ServiceFacts_Payload(value)
    }

    def readVehicle_Mode_CoordinatorConditionEvidence(): Vehicle_Mode_Coordinator.ConditionEvidence = {
      val r = readVehicle_Mode_CoordinatorConditionEvidenceT(F)
      return r
    }

    def readVehicle_Mode_CoordinatorConditionEvidenceT(typeParsed: B): Vehicle_Mode_Coordinator.ConditionEvidence = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Mode_CoordinatorConditionEvidence)
      }
      val reportedCondition = readVehicle_Mode_CoordinatorReportedConditionType()
      val reportCurrency = readVehicle_Mode_CoordinatorReportCurrencyType()
      return Vehicle_Mode_Coordinator.ConditionEvidence(reportedCondition, reportCurrency)
    }

    def readVehicle_Mode_CoordinatorConditionEvidence_Payload(): Vehicle_Mode_Coordinator.ConditionEvidence_Payload = {
      val r = readVehicle_Mode_CoordinatorConditionEvidence_PayloadT(F)
      return r
    }

    def readVehicle_Mode_CoordinatorConditionEvidence_PayloadT(typeParsed: B): Vehicle_Mode_Coordinator.ConditionEvidence_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Mode_CoordinatorConditionEvidence_Payload)
      }
      val value = readVehicle_Mode_CoordinatorConditionEvidence()
      return Vehicle_Mode_Coordinator.ConditionEvidence_Payload(value)
    }

    def readVehicle_Mode_CoordinatorArbitrationResult(): Vehicle_Mode_Coordinator.ArbitrationResult = {
      val r = readVehicle_Mode_CoordinatorArbitrationResultT(F)
      return r
    }

    def readVehicle_Mode_CoordinatorArbitrationResultT(typeParsed: B): Vehicle_Mode_Coordinator.ArbitrationResult = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Mode_CoordinatorArbitrationResult)
      }
      val selectedIntent = readVehicle_Mode_CoordinatorSelectedIntentType()
      val priorityConflict = reader.readB()
      return Vehicle_Mode_Coordinator.ArbitrationResult(selectedIntent, priorityConflict)
    }

    def readVehicle_Mode_CoordinatorArbitrationResult_Payload(): Vehicle_Mode_Coordinator.ArbitrationResult_Payload = {
      val r = readVehicle_Mode_CoordinatorArbitrationResult_PayloadT(F)
      return r
    }

    def readVehicle_Mode_CoordinatorArbitrationResult_PayloadT(typeParsed: B): Vehicle_Mode_Coordinator.ArbitrationResult_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Mode_CoordinatorArbitrationResult_Payload)
      }
      val value = readVehicle_Mode_CoordinatorArbitrationResult()
      return Vehicle_Mode_Coordinator.ArbitrationResult_Payload(value)
    }

    def readVehicle_Mode_CoordinatorTransitionResolution(): Vehicle_Mode_Coordinator.TransitionResolution = {
      val r = readVehicle_Mode_CoordinatorTransitionResolutionT(F)
      return r
    }

    def readVehicle_Mode_CoordinatorTransitionResolutionT(typeParsed: B): Vehicle_Mode_Coordinator.TransitionResolution = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Mode_CoordinatorTransitionResolution)
      }
      val nextMode = readVehicle_Mode_CoordinatorControllerModeType()
      val kind = readVehicle_Mode_CoordinatorTransitionKindType()
      val accepted = reader.readB()
      return Vehicle_Mode_Coordinator.TransitionResolution(nextMode, kind, accepted)
    }

    def readVehicle_Mode_CoordinatorTransitionResolution_Payload(): Vehicle_Mode_Coordinator.TransitionResolution_Payload = {
      val r = readVehicle_Mode_CoordinatorTransitionResolution_PayloadT(F)
      return r
    }

    def readVehicle_Mode_CoordinatorTransitionResolution_PayloadT(typeParsed: B): Vehicle_Mode_Coordinator.TransitionResolution_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Mode_CoordinatorTransitionResolution_Payload)
      }
      val value = readVehicle_Mode_CoordinatorTransitionResolution()
      return Vehicle_Mode_Coordinator.TransitionResolution_Payload(value)
    }

    def readVehicle_Mode_CoordinatorCoordinationOutcome(): Vehicle_Mode_Coordinator.CoordinationOutcome = {
      val r = readVehicle_Mode_CoordinatorCoordinationOutcomeT(F)
      return r
    }

    def readVehicle_Mode_CoordinatorCoordinationOutcomeT(typeParsed: B): Vehicle_Mode_Coordinator.CoordinationOutcome = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Mode_CoordinatorCoordinationOutcome)
      }
      val parkingBrake = readVehicle_Mode_CoordinatorParkingBrakeDispositionType()
      val status = readVehicle_Mode_CoordinatorCoordinationStatusType()
      return Vehicle_Mode_Coordinator.CoordinationOutcome(parkingBrake, status)
    }

    def readVehicle_Mode_CoordinatorCoordinationOutcome_Payload(): Vehicle_Mode_Coordinator.CoordinationOutcome_Payload = {
      val r = readVehicle_Mode_CoordinatorCoordinationOutcome_PayloadT(F)
      return r
    }

    def readVehicle_Mode_CoordinatorCoordinationOutcome_PayloadT(typeParsed: B): Vehicle_Mode_Coordinator.CoordinationOutcome_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Mode_CoordinatorCoordinationOutcome_Payload)
      }
      val value = readVehicle_Mode_CoordinatorCoordinationOutcome()
      return Vehicle_Mode_Coordinator.CoordinationOutcome_Payload(value)
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

    def readVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container(): Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_P => val r = readVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PS => val r = readVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container.")
          val r = readVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_P(): Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_P = {
      val r = readVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PT(F)
      return r
    }

    def readVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PT(typeParsed: B): Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_P)
      }
      val api_lifecycleLevels = readVehicle_Mode_CoordinatorLifecycleLevels()
      return Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_P(api_lifecycleLevels)
    }

    def readVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PS(): Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PS = {
      val r = readVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PST(F)
      return r
    }

    def readVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PST(typeParsed: B): Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PS)
      }
      val In_previousOff = reader.readB()
      val In_previousOn = reader.readB()
      val In_previousStart = reader.readB()
      val api_lifecycleLevels = readVehicle_Mode_CoordinatorLifecycleLevels()
      return Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PS(In_previousOff, In_previousOn, In_previousStart, api_lifecycleLevels)
    }

    def readVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container(): Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_P => val r = readVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PS => val r = readVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container.")
          val r = readVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_P(): Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_P = {
      val r = readVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PT(F)
      return r
    }

    def readVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PT(typeParsed: B): Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_P)
      }
      val api_lifecycleFacts = readVehicle_Mode_CoordinatorLifecycleFacts()
      return Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_P(api_lifecycleFacts)
    }

    def readVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PS(): Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PS = {
      val r = readVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PST(F)
      return r
    }

    def readVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PST(typeParsed: B): Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PS)
      }
      val previousOff = reader.readB()
      val previousOn = reader.readB()
      val previousStart = reader.readB()
      val api_lifecycleFacts = readVehicle_Mode_CoordinatorLifecycleFacts()
      return Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PS(previousOff, previousOn, previousStart, api_lifecycleFacts)
    }

    def readVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container(): Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_P => val r = readVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PS => val r = readVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container.")
          val r = readVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_P(): Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_P = {
      val r = readVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PT(F)
      return r
    }

    def readVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PT(typeParsed: B): Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_P)
      }
      val api_serviceLevels = readVehicle_Mode_CoordinatorServiceLevels()
      return Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_P(api_serviceLevels)
    }

    def readVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PS(): Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PS = {
      val r = readVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PST(F)
      return r
    }

    def readVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PST(typeParsed: B): Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PS)
      }
      val In_previousMaintenance = reader.readB()
      val In_previousReturn = reader.readB()
      val api_serviceLevels = readVehicle_Mode_CoordinatorServiceLevels()
      return Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PS(In_previousMaintenance, In_previousReturn, api_serviceLevels)
    }

    def readVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container(): Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_P => val r = readVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PS => val r = readVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container.")
          val r = readVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_P(): Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_P = {
      val r = readVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PT(F)
      return r
    }

    def readVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PT(typeParsed: B): Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_P)
      }
      val api_serviceFacts = readVehicle_Mode_CoordinatorServiceFacts()
      return Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_P(api_serviceFacts)
    }

    def readVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PS(): Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PS = {
      val r = readVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PST(F)
      return r
    }

    def readVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PST(typeParsed: B): Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PS)
      }
      val previousMaintenance = reader.readB()
      val previousReturn = reader.readB()
      val api_serviceFacts = readVehicle_Mode_CoordinatorServiceFacts()
      return Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PS(previousMaintenance, previousReturn, api_serviceFacts)
    }

    def readVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container(): Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_P => val r = readVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PS => val r = readVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container.")
          val r = readVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_P(): Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_P = {
      val r = readVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PT(F)
      return r
    }

    def readVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PT(typeParsed: B): Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_P)
      }
      val api_conditionEvidence = readVehicle_Mode_CoordinatorConditionEvidence()
      return Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_P(api_conditionEvidence)
    }

    def readVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PS(): Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PS = {
      val r = readVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PST(F)
      return r
    }

    def readVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PST(typeParsed: B): Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PS)
      }
      val api_conditionEvidence = readVehicle_Mode_CoordinatorConditionEvidence()
      return Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PS(api_conditionEvidence)
    }

    def readVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container(): Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_P => val r = readVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PS => val r = readVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container.")
          val r = readVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_P(): Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_P = {
      val r = readVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PT(F)
      return r
    }

    def readVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PT(typeParsed: B): Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_P)
      }
      val api_conditionAssessment = readVehicle_Mode_CoordinatorConditionAssessmentType()
      return Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_P(api_conditionAssessment)
    }

    def readVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PS(): Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PS = {
      val r = readVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PST(F)
      return r
    }

    def readVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PST(typeParsed: B): Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PS)
      }
      val api_conditionAssessment = readVehicle_Mode_CoordinatorConditionAssessmentType()
      return Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PS(api_conditionAssessment)
    }

    def readVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container(): Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_P => val r = readVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PS => val r = readVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container.")
          val r = readVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_P(): Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_P = {
      val r = readVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PT(F)
      return r
    }

    def readVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PT(typeParsed: B): Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_P)
      }
      val api_conditionAssessment = readVehicle_Mode_CoordinatorConditionAssessmentType()
      val api_lifecycleFacts = readVehicle_Mode_CoordinatorLifecycleFacts()
      val api_serviceFacts = readVehicle_Mode_CoordinatorServiceFacts()
      return Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_P(api_conditionAssessment, api_lifecycleFacts, api_serviceFacts)
    }

    def readVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PS(): Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PS = {
      val r = readVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PST(F)
      return r
    }

    def readVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PST(typeParsed: B): Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PS)
      }
      val api_conditionAssessment = readVehicle_Mode_CoordinatorConditionAssessmentType()
      val api_lifecycleFacts = readVehicle_Mode_CoordinatorLifecycleFacts()
      val api_serviceFacts = readVehicle_Mode_CoordinatorServiceFacts()
      return Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PS(api_conditionAssessment, api_lifecycleFacts, api_serviceFacts)
    }

    def readVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container(): Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_P => val r = readVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PS => val r = readVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container.")
          val r = readVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_P(): Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_P = {
      val r = readVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PT(F)
      return r
    }

    def readVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PT(typeParsed: B): Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_P)
      }
      val api_arbitrationForPublication = readVehicle_Mode_CoordinatorArbitrationResult()
      val api_arbitrationForQualification = readVehicle_Mode_CoordinatorArbitrationResult()
      return Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_P(api_arbitrationForPublication, api_arbitrationForQualification)
    }

    def readVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PS(): Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PS = {
      val r = readVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PST(F)
      return r
    }

    def readVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PST(typeParsed: B): Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PS)
      }
      val api_arbitrationForPublication = readVehicle_Mode_CoordinatorArbitrationResult()
      val api_arbitrationForQualification = readVehicle_Mode_CoordinatorArbitrationResult()
      return Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PS(api_arbitrationForPublication, api_arbitrationForQualification)
    }

    def readVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container(): Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_P => val r = readVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PS => val r = readVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container.")
          val r = readVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_P(): Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_P = {
      val r = readVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PT(F)
      return r
    }

    def readVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PT(typeParsed: B): Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_P)
      }
      val api_appliedResolution = readVehicle_Mode_CoordinatorTransitionResolution()
      val api_arbitrationResult = readVehicle_Mode_CoordinatorArbitrationResult()
      return Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_P(api_appliedResolution, api_arbitrationResult)
    }

    def readVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PS(): Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PS = {
      val r = readVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PST(F)
      return r
    }

    def readVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PST(typeParsed: B): Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PS)
      }
      val api_appliedResolution = readVehicle_Mode_CoordinatorTransitionResolution()
      val api_arbitrationResult = readVehicle_Mode_CoordinatorArbitrationResult()
      return Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PS(api_appliedResolution, api_arbitrationResult)
    }

    def readVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container(): Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_P => val r = readVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PS => val r = readVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container.")
          val r = readVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_P(): Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_P = {
      val r = readVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PT(F)
      return r
    }

    def readVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PT(typeParsed: B): Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_P)
      }
      val api_coordinationOutcome = readVehicle_Mode_CoordinatorCoordinationOutcome()
      return Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_P(api_coordinationOutcome)
    }

    def readVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PS(): Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PS = {
      val r = readVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PST(F)
      return r
    }

    def readVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PST(typeParsed: B): Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PS)
      }
      val api_coordinationOutcome = readVehicle_Mode_CoordinatorCoordinationOutcome()
      return Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PS(api_coordinationOutcome)
    }

    def readVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container(): Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_P => val r = readVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PS => val r = readVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container.")
          val r = readVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_P(): Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_P = {
      val r = readVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PT(F)
      return r
    }

    def readVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PT(typeParsed: B): Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_P)
      }
      val api_appliedResolution = readVehicle_Mode_CoordinatorTransitionResolution()
      val api_currentMode = readVehicle_Mode_CoordinatorControllerModeType()
      return Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_P(api_appliedResolution, api_currentMode)
    }

    def readVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PS(): Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PS = {
      val r = readVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PST(F)
      return r
    }

    def readVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PST(typeParsed: B): Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PS)
      }
      val In_recoveryTarget = readVehicle_Mode_CoordinatorRecoveryTargetType()
      val api_appliedResolution = readVehicle_Mode_CoordinatorTransitionResolution()
      val api_currentMode = readVehicle_Mode_CoordinatorControllerModeType()
      return Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PS(In_recoveryTarget, api_appliedResolution, api_currentMode)
    }

    def readVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container(): Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_P => val r = readVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PS => val r = readVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container.")
          val r = readVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_P(): Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_P = {
      val r = readVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PT(F)
      return r
    }

    def readVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PT(typeParsed: B): Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_P)
      }
      val api_storedRecoveryTarget = readVehicle_Mode_CoordinatorRecoveryTargetType()
      return Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_P(api_storedRecoveryTarget)
    }

    def readVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PS(): Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PS = {
      val r = readVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PST(F)
      return r
    }

    def readVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PST(typeParsed: B): Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PS)
      }
      val recoveryTarget = readVehicle_Mode_CoordinatorRecoveryTargetType()
      val api_storedRecoveryTarget = readVehicle_Mode_CoordinatorRecoveryTargetType()
      return Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PS(recoveryTarget, api_storedRecoveryTarget)
    }

    def readVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container(): Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_P => val r = readVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PS => val r = readVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container.")
          val r = readVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_P(): Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_P = {
      val r = readVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PT(F)
      return r
    }

    def readVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PT(typeParsed: B): Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_P)
      }
      val api_arbitrationResult = readVehicle_Mode_CoordinatorArbitrationResult()
      val api_currentMode = readVehicle_Mode_CoordinatorControllerModeType()
      return Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_P(api_arbitrationResult, api_currentMode)
    }

    def readVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PS(): Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PS = {
      val r = readVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PST(F)
      return r
    }

    def readVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PST(typeParsed: B): Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PS)
      }
      val api_arbitrationResult = readVehicle_Mode_CoordinatorArbitrationResult()
      val api_currentMode = readVehicle_Mode_CoordinatorControllerModeType()
      return Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PS(api_arbitrationResult, api_currentMode)
    }

    def readVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container(): Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_P => val r = readVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PS => val r = readVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container.")
          val r = readVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_P(): Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_P = {
      val r = readVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PT(F)
      return r
    }

    def readVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PT(typeParsed: B): Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_P)
      }
      val api_qualifiedTransition = readVehicle_Mode_CoordinatorQualifiedTransitionType()
      return Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_P(api_qualifiedTransition)
    }

    def readVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PS(): Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PS = {
      val r = readVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PST(F)
      return r
    }

    def readVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PST(typeParsed: B): Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PS)
      }
      val api_qualifiedTransition = readVehicle_Mode_CoordinatorQualifiedTransitionType()
      return Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PS(api_qualifiedTransition)
    }

    def readVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container(): Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_P => val r = readVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PS => val r = readVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container.")
          val r = readVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_P(): Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_P = {
      val r = readVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PT(F)
      return r
    }

    def readVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PT(typeParsed: B): Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_P)
      }
      val api_qualifiedTransition = readVehicle_Mode_CoordinatorQualifiedTransitionType()
      val api_storedRecoveryTarget = readVehicle_Mode_CoordinatorRecoveryTargetType()
      return Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_P(api_qualifiedTransition, api_storedRecoveryTarget)
    }

    def readVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PS(): Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PS = {
      val r = readVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PST(F)
      return r
    }

    def readVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PST(typeParsed: B): Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PS)
      }
      val In_controllerMode = readVehicle_Mode_CoordinatorControllerModeType()
      val api_qualifiedTransition = readVehicle_Mode_CoordinatorQualifiedTransitionType()
      val api_storedRecoveryTarget = readVehicle_Mode_CoordinatorRecoveryTargetType()
      return Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PS(In_controllerMode, api_qualifiedTransition, api_storedRecoveryTarget)
    }

    def readVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container(): Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_P => val r = readVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PS => val r = readVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container.")
          val r = readVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_P(): Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_P = {
      val r = readVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PT(F)
      return r
    }

    def readVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PT(typeParsed: B): Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_P)
      }
      val api_appliedNextMode = readVehicle_Mode_CoordinatorControllerModeType()
      val api_modeForQualification = readVehicle_Mode_CoordinatorControllerModeType()
      val api_modeForRecovery = readVehicle_Mode_CoordinatorControllerModeType()
      val api_resolutionForPublication = readVehicle_Mode_CoordinatorTransitionResolution()
      val api_resolutionForRecovery = readVehicle_Mode_CoordinatorTransitionResolution()
      return Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_P(api_appliedNextMode, api_modeForQualification, api_modeForRecovery, api_resolutionForPublication, api_resolutionForRecovery)
    }

    def readVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PS(): Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PS = {
      val r = readVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PST(F)
      return r
    }

    def readVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PST(typeParsed: B): Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PS)
      }
      val controllerMode = readVehicle_Mode_CoordinatorControllerModeType()
      val api_appliedNextMode = readVehicle_Mode_CoordinatorControllerModeType()
      val api_modeForQualification = readVehicle_Mode_CoordinatorControllerModeType()
      val api_modeForRecovery = readVehicle_Mode_CoordinatorControllerModeType()
      val api_resolutionForPublication = readVehicle_Mode_CoordinatorTransitionResolution()
      val api_resolutionForRecovery = readVehicle_Mode_CoordinatorTransitionResolution()
      return Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PS(controllerMode, api_appliedNextMode, api_modeForQualification, api_modeForRecovery, api_resolutionForPublication, api_resolutionForRecovery)
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
        case Constants.Vehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_P => val r = readVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PS => val r = readVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PST(T); return r
        case Constants.Vehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_P => val r = readVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PS => val r = readVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PST(T); return r
        case Constants.Vehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_P => val r = readVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_P => val r = readVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PS => val r = readVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PST(T); return r
        case Constants.Vehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PS => val r = readVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PST(T); return r
        case Constants.Vehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_P => val r = readVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_P => val r = readVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PS => val r = readVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PST(T); return r
        case Constants.Vehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PS => val r = readVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PST(T); return r
        case Constants.Vehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_P => val r = readVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PS => val r = readVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PST(T); return r
        case Constants.Vehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_P => val r = readVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PS => val r = readVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PST(T); return r
        case Constants.Vehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_P => val r = readVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PS => val r = readVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PST(T); return r
        case Constants.Vehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_P => val r = readVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PS => val r = readVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PST(T); return r
        case Constants.Vehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_P => val r = readVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_P => val r = readVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PS => val r = readVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PST(T); return r
        case Constants.Vehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PS => val r = readVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PST(T); return r
        case Constants.Vehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_P => val r = readVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_P => val r = readVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PS => val r = readVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PST(T); return r
        case Constants.Vehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PS => val r = readVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PST(T); return r
        case Constants.Vehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_P => val r = readVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PS => val r = readVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PST(T); return r
        case Constants.Vehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_P => val r = readVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PS => val r = readVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of util.Container.")
          val r = readVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PST(T)
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
        case Constants.Vehicle_Mode_CoordinatorServiceFacts_Payload => val r = readVehicle_Mode_CoordinatorServiceFacts_PayloadT(T); return r
        case Constants.Vehicle_Mode_CoordinatorServiceLevels_Payload => val r = readVehicle_Mode_CoordinatorServiceLevels_PayloadT(T); return r
        case Constants.Vehicle_Mode_CoordinatorReportCurrency_Payload => val r = readVehicle_Mode_CoordinatorReportCurrency_PayloadT(T); return r
        case Constants.Vehicle_Mode_CoordinatorRecoveryTarget_Payload => val r = readVehicle_Mode_CoordinatorRecoveryTarget_PayloadT(T); return r
        case Constants.Vehicle_Mode_CoordinatorControllerMode_Payload => val r = readVehicle_Mode_CoordinatorControllerMode_PayloadT(T); return r
        case Constants.Vehicle_Mode_CoordinatorTransitionKind_Payload => val r = readVehicle_Mode_CoordinatorTransitionKind_PayloadT(T); return r
        case Constants.Vehicle_Mode_CoordinatorSelectedIntent_Payload => val r = readVehicle_Mode_CoordinatorSelectedIntent_PayloadT(T); return r
        case Constants.Vehicle_Mode_CoordinatorLifecycleFacts_Payload => val r = readVehicle_Mode_CoordinatorLifecycleFacts_PayloadT(T); return r
        case Constants.Vehicle_Mode_CoordinatorLifecycleLevels_Payload => val r = readVehicle_Mode_CoordinatorLifecycleLevels_PayloadT(T); return r
        case Constants.Vehicle_Mode_CoordinatorReportedCondition_Payload => val r = readVehicle_Mode_CoordinatorReportedCondition_PayloadT(T); return r
        case Constants.Vehicle_Mode_CoordinatorArbitrationResult_Payload => val r = readVehicle_Mode_CoordinatorArbitrationResult_PayloadT(T); return r
        case Constants.Vehicle_Mode_CoordinatorConditionEvidence_Payload => val r = readVehicle_Mode_CoordinatorConditionEvidence_PayloadT(T); return r
        case Constants.Vehicle_Mode_CoordinatorCoordinationStatus_Payload => val r = readVehicle_Mode_CoordinatorCoordinationStatus_PayloadT(T); return r
        case Constants.Vehicle_Mode_CoordinatorConditionAssessment_Payload => val r = readVehicle_Mode_CoordinatorConditionAssessment_PayloadT(T); return r
        case Constants.Vehicle_Mode_CoordinatorQualifiedTransition_Payload => val r = readVehicle_Mode_CoordinatorQualifiedTransition_PayloadT(T); return r
        case Constants.Vehicle_Mode_CoordinatorCoordinationOutcome_Payload => val r = readVehicle_Mode_CoordinatorCoordinationOutcome_PayloadT(T); return r
        case Constants.Vehicle_Mode_CoordinatorTransitionResolution_Payload => val r = readVehicle_Mode_CoordinatorTransitionResolution_PayloadT(T); return r
        case Constants.Vehicle_Mode_CoordinatorParkingBrakeDisposition_Payload => val r = readVehicle_Mode_CoordinatorParkingBrakeDisposition_PayloadT(T); return r
        case Constants.Vehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_P => val r = readVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PS => val r = readVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PST(T); return r
        case Constants.Vehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_P => val r = readVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PS => val r = readVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PST(T); return r
        case Constants.Vehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_P => val r = readVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_P => val r = readVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PS => val r = readVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PST(T); return r
        case Constants.Vehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PS => val r = readVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PST(T); return r
        case Constants.Vehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_P => val r = readVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_P => val r = readVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PS => val r = readVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PST(T); return r
        case Constants.Vehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PS => val r = readVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PST(T); return r
        case Constants.Vehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_P => val r = readVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PS => val r = readVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PST(T); return r
        case Constants.Vehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_P => val r = readVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PS => val r = readVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PST(T); return r
        case Constants.Vehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_P => val r = readVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PS => val r = readVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PST(T); return r
        case Constants.Vehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_P => val r = readVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PS => val r = readVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PST(T); return r
        case Constants.Vehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_P => val r = readVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_P => val r = readVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PS => val r = readVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PST(T); return r
        case Constants.Vehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PS => val r = readVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PST(T); return r
        case Constants.Vehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_P => val r = readVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_P => val r = readVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PS => val r = readVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PST(T); return r
        case Constants.Vehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PS => val r = readVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PST(T); return r
        case Constants.Vehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_P => val r = readVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PS => val r = readVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PST(T); return r
        case Constants.Vehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_P => val r = readVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PS => val r = readVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of art.DataContent.")
          val r = readVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PST(T)
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

  def fromVehicle_Mode_CoordinatorReportedCondition_Payload(o: Vehicle_Mode_Coordinator.ReportedCondition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorReportedCondition_Payload(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorReportedCondition_Payload(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.ReportedCondition_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorReportedCondition_Payload(reader: Reader): Vehicle_Mode_Coordinator.ReportedCondition_Payload = {
      val r = reader.readVehicle_Mode_CoordinatorReportedCondition_Payload()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorReportedCondition_Payload _)
    return r
  }

  def fromVehicle_Mode_CoordinatorReportCurrency_Payload(o: Vehicle_Mode_Coordinator.ReportCurrency_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorReportCurrency_Payload(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorReportCurrency_Payload(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.ReportCurrency_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorReportCurrency_Payload(reader: Reader): Vehicle_Mode_Coordinator.ReportCurrency_Payload = {
      val r = reader.readVehicle_Mode_CoordinatorReportCurrency_Payload()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorReportCurrency_Payload _)
    return r
  }

  def fromVehicle_Mode_CoordinatorConditionAssessment_Payload(o: Vehicle_Mode_Coordinator.ConditionAssessment_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorConditionAssessment_Payload(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorConditionAssessment_Payload(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.ConditionAssessment_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorConditionAssessment_Payload(reader: Reader): Vehicle_Mode_Coordinator.ConditionAssessment_Payload = {
      val r = reader.readVehicle_Mode_CoordinatorConditionAssessment_Payload()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorConditionAssessment_Payload _)
    return r
  }

  def fromVehicle_Mode_CoordinatorSelectedIntent_Payload(o: Vehicle_Mode_Coordinator.SelectedIntent_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorSelectedIntent_Payload(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorSelectedIntent_Payload(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.SelectedIntent_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorSelectedIntent_Payload(reader: Reader): Vehicle_Mode_Coordinator.SelectedIntent_Payload = {
      val r = reader.readVehicle_Mode_CoordinatorSelectedIntent_Payload()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorSelectedIntent_Payload _)
    return r
  }

  def fromVehicle_Mode_CoordinatorControllerMode_Payload(o: Vehicle_Mode_Coordinator.ControllerMode_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorControllerMode_Payload(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorControllerMode_Payload(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.ControllerMode_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorControllerMode_Payload(reader: Reader): Vehicle_Mode_Coordinator.ControllerMode_Payload = {
      val r = reader.readVehicle_Mode_CoordinatorControllerMode_Payload()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorControllerMode_Payload _)
    return r
  }

  def fromVehicle_Mode_CoordinatorTransitionKind_Payload(o: Vehicle_Mode_Coordinator.TransitionKind_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorTransitionKind_Payload(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorTransitionKind_Payload(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.TransitionKind_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorTransitionKind_Payload(reader: Reader): Vehicle_Mode_Coordinator.TransitionKind_Payload = {
      val r = reader.readVehicle_Mode_CoordinatorTransitionKind_Payload()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorTransitionKind_Payload _)
    return r
  }

  def fromVehicle_Mode_CoordinatorParkingBrakeDisposition_Payload(o: Vehicle_Mode_Coordinator.ParkingBrakeDisposition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorParkingBrakeDisposition_Payload(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorParkingBrakeDisposition_Payload(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.ParkingBrakeDisposition_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorParkingBrakeDisposition_Payload(reader: Reader): Vehicle_Mode_Coordinator.ParkingBrakeDisposition_Payload = {
      val r = reader.readVehicle_Mode_CoordinatorParkingBrakeDisposition_Payload()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorParkingBrakeDisposition_Payload _)
    return r
  }

  def fromVehicle_Mode_CoordinatorCoordinationStatus_Payload(o: Vehicle_Mode_Coordinator.CoordinationStatus_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorCoordinationStatus_Payload(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorCoordinationStatus_Payload(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.CoordinationStatus_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorCoordinationStatus_Payload(reader: Reader): Vehicle_Mode_Coordinator.CoordinationStatus_Payload = {
      val r = reader.readVehicle_Mode_CoordinatorCoordinationStatus_Payload()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorCoordinationStatus_Payload _)
    return r
  }

  def fromVehicle_Mode_CoordinatorRecoveryTarget_Payload(o: Vehicle_Mode_Coordinator.RecoveryTarget_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorRecoveryTarget_Payload(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorRecoveryTarget_Payload(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.RecoveryTarget_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorRecoveryTarget_Payload(reader: Reader): Vehicle_Mode_Coordinator.RecoveryTarget_Payload = {
      val r = reader.readVehicle_Mode_CoordinatorRecoveryTarget_Payload()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorRecoveryTarget_Payload _)
    return r
  }

  def fromVehicle_Mode_CoordinatorQualifiedTransition_Payload(o: Vehicle_Mode_Coordinator.QualifiedTransition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorQualifiedTransition_Payload(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorQualifiedTransition_Payload(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.QualifiedTransition_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorQualifiedTransition_Payload(reader: Reader): Vehicle_Mode_Coordinator.QualifiedTransition_Payload = {
      val r = reader.readVehicle_Mode_CoordinatorQualifiedTransition_Payload()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorQualifiedTransition_Payload _)
    return r
  }

  def fromVehicle_Mode_CoordinatorLifecycleLevels(o: Vehicle_Mode_Coordinator.LifecycleLevels, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorLifecycleLevels(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorLifecycleLevels(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.LifecycleLevels, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorLifecycleLevels(reader: Reader): Vehicle_Mode_Coordinator.LifecycleLevels = {
      val r = reader.readVehicle_Mode_CoordinatorLifecycleLevels()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorLifecycleLevels _)
    return r
  }

  def fromVehicle_Mode_CoordinatorLifecycleLevels_Payload(o: Vehicle_Mode_Coordinator.LifecycleLevels_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorLifecycleLevels_Payload(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorLifecycleLevels_Payload(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.LifecycleLevels_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorLifecycleLevels_Payload(reader: Reader): Vehicle_Mode_Coordinator.LifecycleLevels_Payload = {
      val r = reader.readVehicle_Mode_CoordinatorLifecycleLevels_Payload()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorLifecycleLevels_Payload _)
    return r
  }

  def fromVehicle_Mode_CoordinatorLifecycleFacts(o: Vehicle_Mode_Coordinator.LifecycleFacts, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorLifecycleFacts(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorLifecycleFacts(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.LifecycleFacts, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorLifecycleFacts(reader: Reader): Vehicle_Mode_Coordinator.LifecycleFacts = {
      val r = reader.readVehicle_Mode_CoordinatorLifecycleFacts()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorLifecycleFacts _)
    return r
  }

  def fromVehicle_Mode_CoordinatorLifecycleFacts_Payload(o: Vehicle_Mode_Coordinator.LifecycleFacts_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorLifecycleFacts_Payload(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorLifecycleFacts_Payload(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.LifecycleFacts_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorLifecycleFacts_Payload(reader: Reader): Vehicle_Mode_Coordinator.LifecycleFacts_Payload = {
      val r = reader.readVehicle_Mode_CoordinatorLifecycleFacts_Payload()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorLifecycleFacts_Payload _)
    return r
  }

  def fromVehicle_Mode_CoordinatorServiceLevels(o: Vehicle_Mode_Coordinator.ServiceLevels, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorServiceLevels(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorServiceLevels(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.ServiceLevels, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorServiceLevels(reader: Reader): Vehicle_Mode_Coordinator.ServiceLevels = {
      val r = reader.readVehicle_Mode_CoordinatorServiceLevels()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorServiceLevels _)
    return r
  }

  def fromVehicle_Mode_CoordinatorServiceLevels_Payload(o: Vehicle_Mode_Coordinator.ServiceLevels_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorServiceLevels_Payload(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorServiceLevels_Payload(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.ServiceLevels_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorServiceLevels_Payload(reader: Reader): Vehicle_Mode_Coordinator.ServiceLevels_Payload = {
      val r = reader.readVehicle_Mode_CoordinatorServiceLevels_Payload()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorServiceLevels_Payload _)
    return r
  }

  def fromVehicle_Mode_CoordinatorServiceFacts(o: Vehicle_Mode_Coordinator.ServiceFacts, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorServiceFacts(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorServiceFacts(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.ServiceFacts, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorServiceFacts(reader: Reader): Vehicle_Mode_Coordinator.ServiceFacts = {
      val r = reader.readVehicle_Mode_CoordinatorServiceFacts()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorServiceFacts _)
    return r
  }

  def fromVehicle_Mode_CoordinatorServiceFacts_Payload(o: Vehicle_Mode_Coordinator.ServiceFacts_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorServiceFacts_Payload(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorServiceFacts_Payload(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.ServiceFacts_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorServiceFacts_Payload(reader: Reader): Vehicle_Mode_Coordinator.ServiceFacts_Payload = {
      val r = reader.readVehicle_Mode_CoordinatorServiceFacts_Payload()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorServiceFacts_Payload _)
    return r
  }

  def fromVehicle_Mode_CoordinatorConditionEvidence(o: Vehicle_Mode_Coordinator.ConditionEvidence, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorConditionEvidence(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorConditionEvidence(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.ConditionEvidence, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorConditionEvidence(reader: Reader): Vehicle_Mode_Coordinator.ConditionEvidence = {
      val r = reader.readVehicle_Mode_CoordinatorConditionEvidence()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorConditionEvidence _)
    return r
  }

  def fromVehicle_Mode_CoordinatorConditionEvidence_Payload(o: Vehicle_Mode_Coordinator.ConditionEvidence_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorConditionEvidence_Payload(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorConditionEvidence_Payload(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.ConditionEvidence_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorConditionEvidence_Payload(reader: Reader): Vehicle_Mode_Coordinator.ConditionEvidence_Payload = {
      val r = reader.readVehicle_Mode_CoordinatorConditionEvidence_Payload()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorConditionEvidence_Payload _)
    return r
  }

  def fromVehicle_Mode_CoordinatorArbitrationResult(o: Vehicle_Mode_Coordinator.ArbitrationResult, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorArbitrationResult(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorArbitrationResult(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.ArbitrationResult, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorArbitrationResult(reader: Reader): Vehicle_Mode_Coordinator.ArbitrationResult = {
      val r = reader.readVehicle_Mode_CoordinatorArbitrationResult()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorArbitrationResult _)
    return r
  }

  def fromVehicle_Mode_CoordinatorArbitrationResult_Payload(o: Vehicle_Mode_Coordinator.ArbitrationResult_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorArbitrationResult_Payload(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorArbitrationResult_Payload(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.ArbitrationResult_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorArbitrationResult_Payload(reader: Reader): Vehicle_Mode_Coordinator.ArbitrationResult_Payload = {
      val r = reader.readVehicle_Mode_CoordinatorArbitrationResult_Payload()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorArbitrationResult_Payload _)
    return r
  }

  def fromVehicle_Mode_CoordinatorTransitionResolution(o: Vehicle_Mode_Coordinator.TransitionResolution, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorTransitionResolution(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorTransitionResolution(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.TransitionResolution, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorTransitionResolution(reader: Reader): Vehicle_Mode_Coordinator.TransitionResolution = {
      val r = reader.readVehicle_Mode_CoordinatorTransitionResolution()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorTransitionResolution _)
    return r
  }

  def fromVehicle_Mode_CoordinatorTransitionResolution_Payload(o: Vehicle_Mode_Coordinator.TransitionResolution_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorTransitionResolution_Payload(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorTransitionResolution_Payload(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.TransitionResolution_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorTransitionResolution_Payload(reader: Reader): Vehicle_Mode_Coordinator.TransitionResolution_Payload = {
      val r = reader.readVehicle_Mode_CoordinatorTransitionResolution_Payload()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorTransitionResolution_Payload _)
    return r
  }

  def fromVehicle_Mode_CoordinatorCoordinationOutcome(o: Vehicle_Mode_Coordinator.CoordinationOutcome, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorCoordinationOutcome(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorCoordinationOutcome(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.CoordinationOutcome, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorCoordinationOutcome(reader: Reader): Vehicle_Mode_Coordinator.CoordinationOutcome = {
      val r = reader.readVehicle_Mode_CoordinatorCoordinationOutcome()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorCoordinationOutcome _)
    return r
  }

  def fromVehicle_Mode_CoordinatorCoordinationOutcome_Payload(o: Vehicle_Mode_Coordinator.CoordinationOutcome_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorCoordinationOutcome_Payload(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorCoordinationOutcome_Payload(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.CoordinationOutcome_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorCoordinationOutcome_Payload(reader: Reader): Vehicle_Mode_Coordinator.CoordinationOutcome_Payload = {
      val r = reader.readVehicle_Mode_CoordinatorCoordinationOutcome_Payload()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorCoordinationOutcome_Payload _)
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

  def fromVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container(o: Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container(reader: Reader): Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container = {
      val r = reader.readVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container _)
    return r
  }

  def fromVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_P(o: Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_P(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_P(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_P(reader: Reader): Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_P = {
      val r = reader.readVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_P _)
    return r
  }

  def fromVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PS(o: Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PS(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PS(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PS(reader: Reader): Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PS = {
      val r = reader.readVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container(o: Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container(reader: Reader): Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container = {
      val r = reader.readVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container _)
    return r
  }

  def fromVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_P(o: Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_P(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_P(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_P(reader: Reader): Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_P = {
      val r = reader.readVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_P _)
    return r
  }

  def fromVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PS(o: Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PS(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PS(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PS(reader: Reader): Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PS = {
      val r = reader.readVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PS _)
    return r
  }

  def fromVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container(o: Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container(reader: Reader): Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container = {
      val r = reader.readVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container _)
    return r
  }

  def fromVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_P(o: Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_P(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_P(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_P(reader: Reader): Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_P = {
      val r = reader.readVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_P _)
    return r
  }

  def fromVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PS(o: Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PS(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PS(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PS(reader: Reader): Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PS = {
      val r = reader.readVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container(o: Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container(reader: Reader): Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container = {
      val r = reader.readVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container _)
    return r
  }

  def fromVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_P(o: Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_P(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_P(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_P(reader: Reader): Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_P = {
      val r = reader.readVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_P _)
    return r
  }

  def fromVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PS(o: Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PS(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PS(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PS(reader: Reader): Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PS = {
      val r = reader.readVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PS _)
    return r
  }

  def fromVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container(o: Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container(reader: Reader): Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container = {
      val r = reader.readVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container _)
    return r
  }

  def fromVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_P(o: Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_P(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_P(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_P(reader: Reader): Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_P = {
      val r = reader.readVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_P _)
    return r
  }

  def fromVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PS(o: Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PS(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PS(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PS(reader: Reader): Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PS = {
      val r = reader.readVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container(o: Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container(reader: Reader): Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container = {
      val r = reader.readVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container _)
    return r
  }

  def fromVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_P(o: Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_P(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_P(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_P(reader: Reader): Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_P = {
      val r = reader.readVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_P _)
    return r
  }

  def fromVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PS(o: Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PS(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PS(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PS(reader: Reader): Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PS = {
      val r = reader.readVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PS _)
    return r
  }

  def fromVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container(o: Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container(reader: Reader): Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container = {
      val r = reader.readVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container _)
    return r
  }

  def fromVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_P(o: Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_P(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_P(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_P(reader: Reader): Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_P = {
      val r = reader.readVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_P _)
    return r
  }

  def fromVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PS(o: Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PS(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PS(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PS(reader: Reader): Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PS = {
      val r = reader.readVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container(o: Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container(reader: Reader): Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container = {
      val r = reader.readVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container _)
    return r
  }

  def fromVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_P(o: Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_P(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_P(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_P(reader: Reader): Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_P = {
      val r = reader.readVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_P _)
    return r
  }

  def fromVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PS(o: Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PS(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PS(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PS(reader: Reader): Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PS = {
      val r = reader.readVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PS _)
    return r
  }

  def fromVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container(o: Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container(reader: Reader): Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container = {
      val r = reader.readVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container _)
    return r
  }

  def fromVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_P(o: Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_P(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_P(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_P(reader: Reader): Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_P = {
      val r = reader.readVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_P _)
    return r
  }

  def fromVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PS(o: Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PS(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PS(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PS(reader: Reader): Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PS = {
      val r = reader.readVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container(o: Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container(reader: Reader): Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container = {
      val r = reader.readVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container _)
    return r
  }

  def fromVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_P(o: Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_P(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_P(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_P(reader: Reader): Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_P = {
      val r = reader.readVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_P _)
    return r
  }

  def fromVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PS(o: Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PS(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PS(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PS(reader: Reader): Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PS = {
      val r = reader.readVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PS _)
    return r
  }

  def fromVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container(o: Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container(reader: Reader): Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container = {
      val r = reader.readVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container _)
    return r
  }

  def fromVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_P(o: Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_P(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_P(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_P(reader: Reader): Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_P = {
      val r = reader.readVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_P _)
    return r
  }

  def fromVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PS(o: Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PS(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PS(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PS(reader: Reader): Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PS = {
      val r = reader.readVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container(o: Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container(reader: Reader): Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container = {
      val r = reader.readVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container _)
    return r
  }

  def fromVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_P(o: Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_P(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_P(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_P(reader: Reader): Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_P = {
      val r = reader.readVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_P _)
    return r
  }

  def fromVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PS(o: Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PS(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PS(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PS(reader: Reader): Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PS = {
      val r = reader.readVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PS _)
    return r
  }

  def fromVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container(o: Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container(reader: Reader): Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container = {
      val r = reader.readVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container _)
    return r
  }

  def fromVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_P(o: Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_P(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_P(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_P(reader: Reader): Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_P = {
      val r = reader.readVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_P _)
    return r
  }

  def fromVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PS(o: Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PS(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PS(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PS(reader: Reader): Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PS = {
      val r = reader.readVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container(o: Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container(reader: Reader): Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container = {
      val r = reader.readVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container _)
    return r
  }

  def fromVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_P(o: Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_P(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_P(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_P(reader: Reader): Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_P = {
      val r = reader.readVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_P _)
    return r
  }

  def fromVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PS(o: Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PS(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PS(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PS(reader: Reader): Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PS = {
      val r = reader.readVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PS _)
    return r
  }

  def fromVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container(o: Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container(reader: Reader): Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container = {
      val r = reader.readVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container _)
    return r
  }

  def fromVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_P(o: Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_P(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_P(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_P(reader: Reader): Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_P = {
      val r = reader.readVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_P _)
    return r
  }

  def fromVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PS(o: Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PS(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PS(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PS(reader: Reader): Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PS = {
      val r = reader.readVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container(o: Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container(reader: Reader): Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container = {
      val r = reader.readVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container _)
    return r
  }

  def fromVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_P(o: Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_P(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_P(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_P(reader: Reader): Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_P = {
      val r = reader.readVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_P _)
    return r
  }

  def fromVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PS(o: Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PS(o)
    return w.result
  }

  def toVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PS(data: ISZ[U8]): Either[Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PS(reader: Reader): Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PS = {
      val r = reader.readVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PS _)
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