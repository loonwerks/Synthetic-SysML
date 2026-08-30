// #Sireum
// @formatter:off

// This file is auto-generated from StartIndicationLevel.scala, OnIndicationLevel.scala, OffIndicationLevel.scala, IndicationLevel.scala, ConflictClass.scala, SelectedIndication.scala, RecoveryDecision.scala, PriorOperatingDemand.scala, OperatingDemand.scala, PriorMaintenanceSession.scala, MaintenanceSession.scala, PriorDegradedEpisode.scala, DegradedEpisode.scala, ControllerMode.scala, TransitionReason.scala, BrakeDemand.scala, PublishedControllerMode.scala, ParkingBrakeCommand.scala, LifecycleIndications.scala, LifecycleEpochFacts.scala, MaintenanceEpochFacts.scala, DegradationEpochFacts.scala, ReturnEpochFacts.scala, MaintenanceIndication.scala, DegradedIndication.scala, ReturnIndication.scala, DemandSnapshot.scala, MaintenanceSnapshot.scala, EpisodeSnapshot.scala, ModeDecision.scala, CoordinationFrame.scala, Base_Types.scala, LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_Containers.scala, MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_Containers.scala, DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_Containers.scala, ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_Containers.scala, ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_Containers.scala, IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_Containers.scala, OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_Containers.scala, MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_Containers.scala, DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_Containers.scala, RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_Containers.scala, ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_Containers.scala, ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_Containers.scala, OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package scp_candidate

import org.sireum._

object MsgPack {

  object Constants {

    val Vehicle_Controller_Operating_Mode_CoordinatorStartIndicationLevel_Payload: Z = -32

    val Vehicle_Controller_Operating_Mode_CoordinatorOnIndicationLevel_Payload: Z = -31

    val Vehicle_Controller_Operating_Mode_CoordinatorOffIndicationLevel_Payload: Z = -30

    val Vehicle_Controller_Operating_Mode_CoordinatorIndicationLevel_Payload: Z = -29

    val Vehicle_Controller_Operating_Mode_CoordinatorConflictClass_Payload: Z = -28

    val Vehicle_Controller_Operating_Mode_CoordinatorSelectedIndication_Payload: Z = -27

    val Vehicle_Controller_Operating_Mode_CoordinatorRecoveryDecision_Payload: Z = -26

    val Vehicle_Controller_Operating_Mode_CoordinatorPriorOperatingDemand_Payload: Z = -25

    val Vehicle_Controller_Operating_Mode_CoordinatorOperatingDemand_Payload: Z = -24

    val Vehicle_Controller_Operating_Mode_CoordinatorPriorMaintenanceSession_Payload: Z = -23

    val Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceSession_Payload: Z = -22

    val Vehicle_Controller_Operating_Mode_CoordinatorPriorDegradedEpisode_Payload: Z = -21

    val Vehicle_Controller_Operating_Mode_CoordinatorDegradedEpisode_Payload: Z = -20

    val Vehicle_Controller_Operating_Mode_CoordinatorControllerMode_Payload: Z = -19

    val Vehicle_Controller_Operating_Mode_CoordinatorTransitionReason_Payload: Z = -18

    val Vehicle_Controller_Operating_Mode_CoordinatorBrakeDemand_Payload: Z = -17

    val Vehicle_Controller_Operating_Mode_CoordinatorPublishedControllerMode_Payload: Z = -16

    val Vehicle_Controller_Operating_Mode_CoordinatorParkingBrakeCommand_Payload: Z = -15

    val Vehicle_Controller_Operating_Mode_CoordinatorLifecycleIndications: Z = -14

    val Vehicle_Controller_Operating_Mode_CoordinatorLifecycleIndications_Payload: Z = -13

    val Vehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts: Z = -12

    val Vehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts_Payload: Z = -11

    val Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts: Z = -10

    val Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts_Payload: Z = -9

    val Vehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts: Z = -8

    val Vehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts_Payload: Z = -7

    val Vehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts: Z = -6

    val Vehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts_Payload: Z = -5

    val Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndication: Z = -4

    val Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndication_Payload: Z = -3

    val Vehicle_Controller_Operating_Mode_CoordinatorDegradedIndication: Z = -2

    val Vehicle_Controller_Operating_Mode_CoordinatorDegradedIndication_Payload: Z = -1

    val Vehicle_Controller_Operating_Mode_CoordinatorReturnIndication: Z = 0

    val Vehicle_Controller_Operating_Mode_CoordinatorReturnIndication_Payload: Z = 1

    val Vehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot: Z = 2

    val Vehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot_Payload: Z = 3

    val Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot: Z = 4

    val Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot_Payload: Z = 5

    val Vehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot: Z = 6

    val Vehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot_Payload: Z = 7

    val Vehicle_Controller_Operating_Mode_CoordinatorModeDecision: Z = 8

    val Vehicle_Controller_Operating_Mode_CoordinatorModeDecision_Payload: Z = 9

    val Vehicle_Controller_Operating_Mode_CoordinatorCoordinationFrame: Z = 10

    val Vehicle_Controller_Operating_Mode_CoordinatorCoordinationFrame_Payload: Z = 11

    val Base_TypesBoolean_Payload: Z = 12

    val Base_TypesInteger_Payload: Z = 13

    val Base_TypesInteger_8_Payload: Z = 14

    val Base_TypesInteger_16_Payload: Z = 15

    val Base_TypesInteger_32_Payload: Z = 16

    val Base_TypesInteger_64_Payload: Z = 17

    val Base_TypesUnsigned_8_Payload: Z = 18

    val Base_TypesUnsigned_16_Payload: Z = 19

    val Base_TypesUnsigned_32_Payload: Z = 20

    val Base_TypesUnsigned_64_Payload: Z = 21

    val Base_TypesFloat_Payload: Z = 22

    val Base_TypesFloat_32_Payload: Z = 23

    val Base_TypesFloat_64_Payload: Z = 24

    val Base_TypesCharacter_Payload: Z = 25

    val Base_TypesString_Payload: Z = 26

    val Base_TypesBits_Payload: Z = 27

    val Vehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_P: Z = 28

    val Vehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PS: Z = 29

    val Vehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_P: Z = 30

    val Vehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PS: Z = 31

    val Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_P: Z = 32

    val Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PS: Z = 33

    val Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_P: Z = 34

    val Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PS: Z = 35

    val Vehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_P: Z = 36

    val Vehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PS: Z = 37

    val Vehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_P: Z = 38

    val Vehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PS: Z = 39

    val Vehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_P: Z = 40

    val Vehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PS: Z = 41

    val Vehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_P: Z = 42

    val Vehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PS: Z = 43

    val Vehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_P: Z = 44

    val Vehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PS: Z = 45

    val Vehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_P: Z = 46

    val Vehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PS: Z = 47

    val Vehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_P: Z = 48

    val Vehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PS: Z = 49

    val Vehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_P: Z = 50

    val Vehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PS: Z = 51

    val Vehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_P: Z = 52

    val Vehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PS: Z = 53

    val Vehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_P: Z = 54

    val Vehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PS: Z = 55

    val Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_P: Z = 56

    val Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PS: Z = 57

    val Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_P: Z = 58

    val Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PS: Z = 59

    val Vehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_P: Z = 60

    val Vehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PS: Z = 61

    val Vehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_P: Z = 62

    val Vehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PS: Z = 63

    val Vehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_P: Z = 64

    val Vehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PS: Z = 65

    val Vehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_P: Z = 66

    val Vehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PS: Z = 67

    val Vehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_P: Z = 68

    val Vehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PS: Z = 69

    val Vehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_P: Z = 70

    val Vehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PS: Z = 71

    val Vehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_P: Z = 72

    val Vehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PS: Z = 73

    val Vehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_P: Z = 74

    val Vehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PS: Z = 75

    val Vehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_P: Z = 76

    val Vehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PS: Z = 77

    val Vehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_P: Z = 78

    val Vehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PS: Z = 79

    val utilEmptyContainer: Z = 80

    val _artEmpty: Z = 81

  }

  object Writer {

    @record class Default(val writer: MessagePack.Writer.Impl) extends Writer

  }

  @msig trait Writer {

    def writer: MessagePack.Writer

    def writeVehicle_Controller_Operating_Mode_CoordinatorStartIndicationLevelType(o: Vehicle_Controller_Operating_Mode_Coordinator.StartIndicationLevel.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorStartIndicationLevel_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.StartIndicationLevel_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorStartIndicationLevel_Payload)
      writeVehicle_Controller_Operating_Mode_CoordinatorStartIndicationLevelType(o.value)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorOnIndicationLevelType(o: Vehicle_Controller_Operating_Mode_Coordinator.OnIndicationLevel.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorOnIndicationLevel_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.OnIndicationLevel_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorOnIndicationLevel_Payload)
      writeVehicle_Controller_Operating_Mode_CoordinatorOnIndicationLevelType(o.value)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorOffIndicationLevelType(o: Vehicle_Controller_Operating_Mode_Coordinator.OffIndicationLevel.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorOffIndicationLevel_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.OffIndicationLevel_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorOffIndicationLevel_Payload)
      writeVehicle_Controller_Operating_Mode_CoordinatorOffIndicationLevelType(o.value)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorIndicationLevelType(o: Vehicle_Controller_Operating_Mode_Coordinator.IndicationLevel.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorIndicationLevel_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.IndicationLevel_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorIndicationLevel_Payload)
      writeVehicle_Controller_Operating_Mode_CoordinatorIndicationLevelType(o.value)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorConflictClassType(o: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClass.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorConflictClass_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClass_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorConflictClass_Payload)
      writeVehicle_Controller_Operating_Mode_CoordinatorConflictClassType(o.value)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType(o: Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorSelectedIndication_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorSelectedIndication_Payload)
      writeVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType(o.value)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecisionType(o: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryDecision.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecision_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryDecision_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorRecoveryDecision_Payload)
      writeVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecisionType(o.value)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorPriorOperatingDemandType(o: Vehicle_Controller_Operating_Mode_Coordinator.PriorOperatingDemand.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorPriorOperatingDemand_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.PriorOperatingDemand_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorPriorOperatingDemand_Payload)
      writeVehicle_Controller_Operating_Mode_CoordinatorPriorOperatingDemandType(o.value)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandType(o: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemand.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorOperatingDemand_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemand_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorOperatingDemand_Payload)
      writeVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandType(o.value)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorPriorMaintenanceSessionType(o: Vehicle_Controller_Operating_Mode_Coordinator.PriorMaintenanceSession.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorPriorMaintenanceSession_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.PriorMaintenanceSession_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorPriorMaintenanceSession_Payload)
      writeVehicle_Controller_Operating_Mode_CoordinatorPriorMaintenanceSessionType(o.value)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionType(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSession.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSession_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSession_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceSession_Payload)
      writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionType(o.value)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorPriorDegradedEpisodeType(o: Vehicle_Controller_Operating_Mode_Coordinator.PriorDegradedEpisode.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorPriorDegradedEpisode_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.PriorDegradedEpisode_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorPriorDegradedEpisode_Payload)
      writeVehicle_Controller_Operating_Mode_CoordinatorPriorDegradedEpisodeType(o.value)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeType(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisode.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisode_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisode_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorDegradedEpisode_Payload)
      writeVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeType(o.value)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorControllerModeType(o: Vehicle_Controller_Operating_Mode_Coordinator.ControllerMode.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorControllerMode_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.ControllerMode_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorControllerMode_Payload)
      writeVehicle_Controller_Operating_Mode_CoordinatorControllerModeType(o.value)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorTransitionReasonType(o: Vehicle_Controller_Operating_Mode_Coordinator.TransitionReason.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorTransitionReason_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.TransitionReason_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorTransitionReason_Payload)
      writeVehicle_Controller_Operating_Mode_CoordinatorTransitionReasonType(o.value)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorBrakeDemandType(o: Vehicle_Controller_Operating_Mode_Coordinator.BrakeDemand.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorBrakeDemand_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.BrakeDemand_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorBrakeDemand_Payload)
      writeVehicle_Controller_Operating_Mode_CoordinatorBrakeDemandType(o.value)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorPublishedControllerModeType(o: Vehicle_Controller_Operating_Mode_Coordinator.PublishedControllerMode.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorPublishedControllerMode_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.PublishedControllerMode_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorPublishedControllerMode_Payload)
      writeVehicle_Controller_Operating_Mode_CoordinatorPublishedControllerModeType(o.value)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeCommandType(o: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeCommand.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeCommand_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeCommand_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorParkingBrakeCommand_Payload)
      writeVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeCommandType(o.value)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorLifecycleIndications(o: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleIndications): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorLifecycleIndications)
      writeVehicle_Controller_Operating_Mode_CoordinatorStartIndicationLevelType(o.startLevel)
      writeVehicle_Controller_Operating_Mode_CoordinatorOnIndicationLevelType(o.onLevel)
      writeVehicle_Controller_Operating_Mode_CoordinatorOffIndicationLevelType(o.offLevel)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorLifecycleIndications_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleIndications_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorLifecycleIndications_Payload)
      writeVehicle_Controller_Operating_Mode_CoordinatorLifecycleIndications(o.value)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts(o: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochFacts): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts)
      writer.writeB(o.freshStart)
      writer.writeB(o.freshOn)
      writer.writeB(o.offActive)
      writer.writeB(o.heldStart)
      writer.writeB(o.heldOn)
      writer.writeB(o.heldOff)
      writer.writeB(o.anyInvalid)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochFacts_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts_Payload)
      writeVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts(o.value)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochFacts): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts)
      writer.writeB(o.active)
      writer.writeB(o.fresh)
      writer.writeB(o.cleared)
      writer.writeB(o.held)
      writer.writeB(o.invalid)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochFacts_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts_Payload)
      writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts(o.value)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochFacts): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts)
      writer.writeB(o.active)
      writer.writeB(o.fresh)
      writer.writeB(o.cleared)
      writer.writeB(o.held)
      writer.writeB(o.invalid)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochFacts_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts_Payload)
      writeVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts(o.value)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts(o: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochFacts): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts)
      writer.writeB(o.fresh)
      writer.writeB(o.held)
      writer.writeB(o.clear)
      writer.writeB(o.invalid)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochFacts_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts_Payload)
      writeVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts(o.value)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndication(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceIndication): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndication)
      writeVehicle_Controller_Operating_Mode_CoordinatorIndicationLevelType(o.level)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndication_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceIndication_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndication_Payload)
      writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndication(o.value)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorDegradedIndication(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradedIndication): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorDegradedIndication)
      writeVehicle_Controller_Operating_Mode_CoordinatorIndicationLevelType(o.level)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorDegradedIndication_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradedIndication_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorDegradedIndication_Payload)
      writeVehicle_Controller_Operating_Mode_CoordinatorDegradedIndication(o.value)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorReturnIndication(o: Vehicle_Controller_Operating_Mode_Coordinator.ReturnIndication): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorReturnIndication)
      writeVehicle_Controller_Operating_Mode_CoordinatorIndicationLevelType(o.level)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorReturnIndication_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.ReturnIndication_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorReturnIndication_Payload)
      writeVehicle_Controller_Operating_Mode_CoordinatorReturnIndication(o.value)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot(o: Vehicle_Controller_Operating_Mode_Coordinator.DemandSnapshot): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot)
      writeVehicle_Controller_Operating_Mode_CoordinatorPriorOperatingDemandType(o.currentDemand)
      writeVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandType(o.nextDemand)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.DemandSnapshot_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot_Payload)
      writeVehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot(o.value)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSnapshot): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot)
      writeVehicle_Controller_Operating_Mode_CoordinatorPriorMaintenanceSessionType(o.currentSession)
      writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionType(o.nextSession)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSnapshot_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot_Payload)
      writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot(o.value)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot(o: Vehicle_Controller_Operating_Mode_Coordinator.EpisodeSnapshot): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot)
      writeVehicle_Controller_Operating_Mode_CoordinatorPriorDegradedEpisodeType(o.currentEpisode)
      writeVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeType(o.nextEpisode)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.EpisodeSnapshot_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot_Payload)
      writeVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot(o.value)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorModeDecision(o: Vehicle_Controller_Operating_Mode_Coordinator.ModeDecision): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorModeDecision)
      writeVehicle_Controller_Operating_Mode_CoordinatorControllerModeType(o.nextMode)
      writeVehicle_Controller_Operating_Mode_CoordinatorTransitionReasonType(o.reason)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorModeDecision_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.ModeDecision_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorModeDecision_Payload)
      writeVehicle_Controller_Operating_Mode_CoordinatorModeDecision(o.value)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorCoordinationFrame(o: Vehicle_Controller_Operating_Mode_Coordinator.CoordinationFrame): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorCoordinationFrame)
      writeVehicle_Controller_Operating_Mode_CoordinatorPublishedControllerModeType(o.mode)
      writeVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeCommandType(o.parkingBrake)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorCoordinationFrame_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.CoordinationFrame_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorCoordinationFrame_Payload)
      writeVehicle_Controller_Operating_Mode_CoordinatorCoordinationFrame(o.value)
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

    def writeVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container): Unit = {
      o match {
        case o: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PS(o)
      }
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_P)
      writeVehicle_Controller_Operating_Mode_CoordinatorLifecycleIndications(o.api_lifecycleIndications)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PS)
      writeVehicle_Controller_Operating_Mode_CoordinatorLifecycleIndications(o.api_lifecycleIndications)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container): Unit = {
      o match {
        case o: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PS(o)
      }
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_P)
      writeVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts(o.api_factsToConflict)
      writeVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts(o.api_factsToPriority)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PS)
      writeVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts(o.api_factsToConflict)
      writeVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts(o.api_factsToPriority)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container): Unit = {
      o match {
        case o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PS(o)
      }
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_P)
      writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndication(o.api_maintenanceIndication)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PS)
      writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndication(o.api_maintenanceIndication)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container): Unit = {
      o match {
        case o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PS(o)
      }
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_P)
      writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts(o.api_factsToConflict)
      writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts(o.api_factsToPriority)
      writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts(o.api_factsToSession)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PS)
      writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts(o.api_factsToConflict)
      writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts(o.api_factsToPriority)
      writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts(o.api_factsToSession)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container): Unit = {
      o match {
        case o: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PS(o)
      }
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_P)
      writeVehicle_Controller_Operating_Mode_CoordinatorDegradedIndication(o.api_degradedIndication)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PS)
      writeVehicle_Controller_Operating_Mode_CoordinatorDegradedIndication(o.api_degradedIndication)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container): Unit = {
      o match {
        case o: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PS(o)
      }
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_P)
      writeVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts(o.api_factsToConflict)
      writeVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts(o.api_factsToEpisode)
      writeVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts(o.api_factsToPriority)
      writeVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts(o.api_factsToRecovery)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PS)
      writeVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts(o.api_factsToConflict)
      writeVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts(o.api_factsToEpisode)
      writeVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts(o.api_factsToPriority)
      writeVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts(o.api_factsToRecovery)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container): Unit = {
      o match {
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PS(o)
      }
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_P)
      writeVehicle_Controller_Operating_Mode_CoordinatorReturnIndication(o.api_returnIndication)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PS)
      writeVehicle_Controller_Operating_Mode_CoordinatorReturnIndication(o.api_returnIndication)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container): Unit = {
      o match {
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PS(o)
      }
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_P)
      writeVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts(o.api_factsToConflict)
      writeVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts(o.api_factsToPriority)
      writeVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts(o.api_factsToRecovery)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PS)
      writeVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts(o.api_factsToConflict)
      writeVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts(o.api_factsToPriority)
      writeVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts(o.api_factsToRecovery)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container): Unit = {
      o match {
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PS(o)
      }
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_P)
      writeVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts(o.api_degradationFacts)
      writeVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts(o.api_lifecycleFacts)
      writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts(o.api_maintenanceFacts)
      writeVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts(o.api_returnFacts)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PS)
      writeVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts(o.api_degradationFacts)
      writeVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts(o.api_lifecycleFacts)
      writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts(o.api_maintenanceFacts)
      writeVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts(o.api_returnFacts)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container): Unit = {
      o match {
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PS(o)
      }
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_P)
      writeVehicle_Controller_Operating_Mode_CoordinatorConflictClassType(o.api_conflictToPriority)
      writeVehicle_Controller_Operating_Mode_CoordinatorConflictClassType(o.api_conflictToRecovery)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PS)
      writeVehicle_Controller_Operating_Mode_CoordinatorConflictClassType(o.api_conflictToPriority)
      writeVehicle_Controller_Operating_Mode_CoordinatorConflictClassType(o.api_conflictToRecovery)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container): Unit = {
      o match {
        case o: Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PS(o)
      }
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_P)
      writeVehicle_Controller_Operating_Mode_CoordinatorConflictClassType(o.api_conflictClass)
      writeVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts(o.api_degradationFacts)
      writeVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts(o.api_lifecycleFacts)
      writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts(o.api_maintenanceFacts)
      writeVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts(o.api_returnFacts)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PS)
      writeVehicle_Controller_Operating_Mode_CoordinatorConflictClassType(o.api_conflictClass)
      writeVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts(o.api_degradationFacts)
      writeVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts(o.api_lifecycleFacts)
      writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts(o.api_maintenanceFacts)
      writeVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts(o.api_returnFacts)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container): Unit = {
      o match {
        case o: Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PS(o)
      }
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_P)
      writeVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType(o.api_selectionToBrake)
      writeVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType(o.api_selectionToDemand)
      writeVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType(o.api_selectionToEpisode)
      writeVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType(o.api_selectionToRecovery)
      writeVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType(o.api_selectionToSession)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PS)
      writeVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType(o.api_selectionToBrake)
      writeVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType(o.api_selectionToDemand)
      writeVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType(o.api_selectionToEpisode)
      writeVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType(o.api_selectionToRecovery)
      writeVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType(o.api_selectionToSession)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container): Unit = {
      o match {
        case o: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PS(o)
      }
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_P)
      writeVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecisionType(o.api_recoveryDecision)
      writeVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType(o.api_selectedIndication)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PS)
      writeVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecisionType(o.api_recoveryDecision)
      writeVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType(o.api_selectedIndication)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container): Unit = {
      o match {
        case o: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PS(o)
      }
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_P)
      writeVehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot(o.api_demandSnapshot)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PS)
      writeVehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot(o.api_demandSnapshot)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container): Unit = {
      o match {
        case o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PS(o)
      }
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_P)
      writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts(o.api_maintenanceFacts)
      writeVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType(o.api_selectedIndication)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PS)
      writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts(o.api_maintenanceFacts)
      writeVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType(o.api_selectedIndication)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container): Unit = {
      o match {
        case o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PS(o)
      }
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_P)
      writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot(o.api_maintenanceSnapshot)
      writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot(o.api_snapshotToBrake)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PS)
      writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot(o.api_maintenanceSnapshot)
      writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot(o.api_snapshotToBrake)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container): Unit = {
      o match {
        case o: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PS(o)
      }
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_P)
      writeVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts(o.api_degradationFacts)
      writeVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecisionType(o.api_recoveryDecision)
      writeVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType(o.api_selectedIndication)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PS)
      writeVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts(o.api_degradationFacts)
      writeVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecisionType(o.api_recoveryDecision)
      writeVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType(o.api_selectedIndication)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container): Unit = {
      o match {
        case o: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PS(o)
      }
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_P)
      writeVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot(o.api_snapshotToBrake)
      writeVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot(o.api_snapshotToMode)
      writeVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot(o.api_snapshotToRecovery)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PS)
      writeVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot(o.api_snapshotToBrake)
      writeVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot(o.api_snapshotToMode)
      writeVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot(o.api_snapshotToRecovery)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container): Unit = {
      o match {
        case o: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PS(o)
      }
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_P)
      writeVehicle_Controller_Operating_Mode_CoordinatorConflictClassType(o.api_conflictClass)
      writeVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts(o.api_degradationFacts)
      writeVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot(o.api_episodeSnapshot)
      writeVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts(o.api_returnFacts)
      writeVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType(o.api_selectedIndication)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PS)
      writeVehicle_Controller_Operating_Mode_CoordinatorConflictClassType(o.api_conflictClass)
      writeVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts(o.api_degradationFacts)
      writeVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot(o.api_episodeSnapshot)
      writeVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts(o.api_returnFacts)
      writeVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType(o.api_selectedIndication)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container): Unit = {
      o match {
        case o: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PS(o)
      }
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_P)
      writeVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecisionType(o.api_decisionToDemand)
      writeVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecisionType(o.api_decisionToEpisode)
      writeVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecisionType(o.api_decisionToMode)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PS)
      writeVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecisionType(o.api_decisionToDemand)
      writeVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecisionType(o.api_decisionToEpisode)
      writeVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecisionType(o.api_decisionToMode)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container): Unit = {
      o match {
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PS(o)
      }
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_P)
      writeVehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot(o.api_demandSnapshot)
      writeVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot(o.api_episodeSnapshot)
      writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot(o.api_maintenanceSnapshot)
      writeVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecisionType(o.api_recoveryDecision)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PS)
      writeVehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot(o.api_demandSnapshot)
      writeVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot(o.api_episodeSnapshot)
      writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot(o.api_maintenanceSnapshot)
      writeVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecisionType(o.api_recoveryDecision)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container): Unit = {
      o match {
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PS(o)
      }
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_P)
      writeVehicle_Controller_Operating_Mode_CoordinatorModeDecision(o.api_modeDecision)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PS)
      writeVehicle_Controller_Operating_Mode_CoordinatorModeDecision(o.api_modeDecision)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container): Unit = {
      o match {
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PS(o)
      }
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_P)
      writeVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot(o.api_episodeSnapshot)
      writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot(o.api_maintenanceSnapshot)
      writeVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType(o.api_selectedIndication)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PS)
      writeVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot(o.api_episodeSnapshot)
      writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot(o.api_maintenanceSnapshot)
      writeVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType(o.api_selectedIndication)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container): Unit = {
      o match {
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PS(o)
      }
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_P)
      writeVehicle_Controller_Operating_Mode_CoordinatorBrakeDemandType(o.api_brakeDemand)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PS)
      writeVehicle_Controller_Operating_Mode_CoordinatorBrakeDemandType(o.api_brakeDemand)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container): Unit = {
      o match {
        case o: Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PS(o)
      }
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_P)
      writeVehicle_Controller_Operating_Mode_CoordinatorBrakeDemandType(o.api_brakeDemand)
      writeVehicle_Controller_Operating_Mode_CoordinatorModeDecision(o.api_modeDecision)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PS)
      writeVehicle_Controller_Operating_Mode_CoordinatorBrakeDemandType(o.api_brakeDemand)
      writeVehicle_Controller_Operating_Mode_CoordinatorModeDecision(o.api_modeDecision)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container): Unit = {
      o match {
        case o: Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PS(o)
      }
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_P)
      writeVehicle_Controller_Operating_Mode_CoordinatorCoordinationFrame(o.api_coordinationFrame)
    }

    def writeVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PS)
      writeVehicle_Controller_Operating_Mode_CoordinatorCoordinationFrame(o.api_coordinationFrame)
    }

    def writeruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeutilContainer(o: util.Container): Unit = {
      o match {
        case o: util.EmptyContainer => writeutilEmptyContainer(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PS(o)
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
        case o: Vehicle_Controller_Operating_Mode_Coordinator.BrakeDemand_Payload => writeVehicle_Controller_Operating_Mode_CoordinatorBrakeDemand_Payload(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ModeDecision_Payload => writeVehicle_Controller_Operating_Mode_CoordinatorModeDecision_Payload(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClass_Payload => writeVehicle_Controller_Operating_Mode_CoordinatorConflictClass_Payload(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ControllerMode_Payload => writeVehicle_Controller_Operating_Mode_CoordinatorControllerMode_Payload(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.DemandSnapshot_Payload => writeVehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot_Payload(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.IndicationLevel_Payload => writeVehicle_Controller_Operating_Mode_CoordinatorIndicationLevel_Payload(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemand_Payload => writeVehicle_Controller_Operating_Mode_CoordinatorOperatingDemand_Payload(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisode_Payload => writeVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisode_Payload(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.EpisodeSnapshot_Payload => writeVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot_Payload(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryDecision_Payload => writeVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecision_Payload(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.TransitionReason_Payload => writeVehicle_Controller_Operating_Mode_CoordinatorTransitionReason_Payload(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ReturnIndication_Payload => writeVehicle_Controller_Operating_Mode_CoordinatorReturnIndication_Payload(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochFacts_Payload => writeVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts_Payload(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.OnIndicationLevel_Payload => writeVehicle_Controller_Operating_Mode_CoordinatorOnIndicationLevel_Payload(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.CoordinationFrame_Payload => writeVehicle_Controller_Operating_Mode_CoordinatorCoordinationFrame_Payload(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSession_Payload => writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSession_Payload(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.OffIndicationLevel_Payload => writeVehicle_Controller_Operating_Mode_CoordinatorOffIndicationLevel_Payload(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication_Payload => writeVehicle_Controller_Operating_Mode_CoordinatorSelectedIndication_Payload(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.DegradedIndication_Payload => writeVehicle_Controller_Operating_Mode_CoordinatorDegradedIndication_Payload(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeCommand_Payload => writeVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeCommand_Payload(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSnapshot_Payload => writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot_Payload(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochFacts_Payload => writeVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts_Payload(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.StartIndicationLevel_Payload => writeVehicle_Controller_Operating_Mode_CoordinatorStartIndicationLevel_Payload(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.PriorOperatingDemand_Payload => writeVehicle_Controller_Operating_Mode_CoordinatorPriorOperatingDemand_Payload(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.PriorDegradedEpisode_Payload => writeVehicle_Controller_Operating_Mode_CoordinatorPriorDegradedEpisode_Payload(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleIndications_Payload => writeVehicle_Controller_Operating_Mode_CoordinatorLifecycleIndications_Payload(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceIndication_Payload => writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndication_Payload(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochFacts_Payload => writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts_Payload(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochFacts_Payload => writeVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts_Payload(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.PriorMaintenanceSession_Payload => writeVehicle_Controller_Operating_Mode_CoordinatorPriorMaintenanceSession_Payload(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.PublishedControllerMode_Payload => writeVehicle_Controller_Operating_Mode_CoordinatorPublishedControllerMode_Payload(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_P => writeVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PS => writeVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PS(o)
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

    def readVehicle_Controller_Operating_Mode_CoordinatorStartIndicationLevelType(): Vehicle_Controller_Operating_Mode_Coordinator.StartIndicationLevel.Type = {
      val r = reader.readZ()
      return Vehicle_Controller_Operating_Mode_Coordinator.StartIndicationLevel.byOrdinal(r).get
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorStartIndicationLevel_Payload(): Vehicle_Controller_Operating_Mode_Coordinator.StartIndicationLevel_Payload = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorStartIndicationLevel_PayloadT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorStartIndicationLevel_PayloadT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.StartIndicationLevel_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorStartIndicationLevel_Payload)
      }
      val value = readVehicle_Controller_Operating_Mode_CoordinatorStartIndicationLevelType()
      return Vehicle_Controller_Operating_Mode_Coordinator.StartIndicationLevel_Payload(value)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorOnIndicationLevelType(): Vehicle_Controller_Operating_Mode_Coordinator.OnIndicationLevel.Type = {
      val r = reader.readZ()
      return Vehicle_Controller_Operating_Mode_Coordinator.OnIndicationLevel.byOrdinal(r).get
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorOnIndicationLevel_Payload(): Vehicle_Controller_Operating_Mode_Coordinator.OnIndicationLevel_Payload = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorOnIndicationLevel_PayloadT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorOnIndicationLevel_PayloadT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.OnIndicationLevel_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorOnIndicationLevel_Payload)
      }
      val value = readVehicle_Controller_Operating_Mode_CoordinatorOnIndicationLevelType()
      return Vehicle_Controller_Operating_Mode_Coordinator.OnIndicationLevel_Payload(value)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorOffIndicationLevelType(): Vehicle_Controller_Operating_Mode_Coordinator.OffIndicationLevel.Type = {
      val r = reader.readZ()
      return Vehicle_Controller_Operating_Mode_Coordinator.OffIndicationLevel.byOrdinal(r).get
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorOffIndicationLevel_Payload(): Vehicle_Controller_Operating_Mode_Coordinator.OffIndicationLevel_Payload = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorOffIndicationLevel_PayloadT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorOffIndicationLevel_PayloadT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.OffIndicationLevel_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorOffIndicationLevel_Payload)
      }
      val value = readVehicle_Controller_Operating_Mode_CoordinatorOffIndicationLevelType()
      return Vehicle_Controller_Operating_Mode_Coordinator.OffIndicationLevel_Payload(value)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorIndicationLevelType(): Vehicle_Controller_Operating_Mode_Coordinator.IndicationLevel.Type = {
      val r = reader.readZ()
      return Vehicle_Controller_Operating_Mode_Coordinator.IndicationLevel.byOrdinal(r).get
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorIndicationLevel_Payload(): Vehicle_Controller_Operating_Mode_Coordinator.IndicationLevel_Payload = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorIndicationLevel_PayloadT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorIndicationLevel_PayloadT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.IndicationLevel_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorIndicationLevel_Payload)
      }
      val value = readVehicle_Controller_Operating_Mode_CoordinatorIndicationLevelType()
      return Vehicle_Controller_Operating_Mode_Coordinator.IndicationLevel_Payload(value)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorConflictClassType(): Vehicle_Controller_Operating_Mode_Coordinator.ConflictClass.Type = {
      val r = reader.readZ()
      return Vehicle_Controller_Operating_Mode_Coordinator.ConflictClass.byOrdinal(r).get
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorConflictClass_Payload(): Vehicle_Controller_Operating_Mode_Coordinator.ConflictClass_Payload = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorConflictClass_PayloadT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorConflictClass_PayloadT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.ConflictClass_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorConflictClass_Payload)
      }
      val value = readVehicle_Controller_Operating_Mode_CoordinatorConflictClassType()
      return Vehicle_Controller_Operating_Mode_Coordinator.ConflictClass_Payload(value)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType(): Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication.Type = {
      val r = reader.readZ()
      return Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication.byOrdinal(r).get
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorSelectedIndication_Payload(): Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication_Payload = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorSelectedIndication_PayloadT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorSelectedIndication_PayloadT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorSelectedIndication_Payload)
      }
      val value = readVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType()
      return Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication_Payload(value)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecisionType(): Vehicle_Controller_Operating_Mode_Coordinator.RecoveryDecision.Type = {
      val r = reader.readZ()
      return Vehicle_Controller_Operating_Mode_Coordinator.RecoveryDecision.byOrdinal(r).get
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecision_Payload(): Vehicle_Controller_Operating_Mode_Coordinator.RecoveryDecision_Payload = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecision_PayloadT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecision_PayloadT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.RecoveryDecision_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorRecoveryDecision_Payload)
      }
      val value = readVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecisionType()
      return Vehicle_Controller_Operating_Mode_Coordinator.RecoveryDecision_Payload(value)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorPriorOperatingDemandType(): Vehicle_Controller_Operating_Mode_Coordinator.PriorOperatingDemand.Type = {
      val r = reader.readZ()
      return Vehicle_Controller_Operating_Mode_Coordinator.PriorOperatingDemand.byOrdinal(r).get
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorPriorOperatingDemand_Payload(): Vehicle_Controller_Operating_Mode_Coordinator.PriorOperatingDemand_Payload = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorPriorOperatingDemand_PayloadT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorPriorOperatingDemand_PayloadT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.PriorOperatingDemand_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorPriorOperatingDemand_Payload)
      }
      val value = readVehicle_Controller_Operating_Mode_CoordinatorPriorOperatingDemandType()
      return Vehicle_Controller_Operating_Mode_Coordinator.PriorOperatingDemand_Payload(value)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandType(): Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemand.Type = {
      val r = reader.readZ()
      return Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemand.byOrdinal(r).get
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorOperatingDemand_Payload(): Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemand_Payload = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorOperatingDemand_PayloadT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorOperatingDemand_PayloadT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemand_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorOperatingDemand_Payload)
      }
      val value = readVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandType()
      return Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemand_Payload(value)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorPriorMaintenanceSessionType(): Vehicle_Controller_Operating_Mode_Coordinator.PriorMaintenanceSession.Type = {
      val r = reader.readZ()
      return Vehicle_Controller_Operating_Mode_Coordinator.PriorMaintenanceSession.byOrdinal(r).get
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorPriorMaintenanceSession_Payload(): Vehicle_Controller_Operating_Mode_Coordinator.PriorMaintenanceSession_Payload = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorPriorMaintenanceSession_PayloadT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorPriorMaintenanceSession_PayloadT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.PriorMaintenanceSession_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorPriorMaintenanceSession_Payload)
      }
      val value = readVehicle_Controller_Operating_Mode_CoordinatorPriorMaintenanceSessionType()
      return Vehicle_Controller_Operating_Mode_Coordinator.PriorMaintenanceSession_Payload(value)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionType(): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSession.Type = {
      val r = reader.readZ()
      return Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSession.byOrdinal(r).get
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSession_Payload(): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSession_Payload = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSession_PayloadT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSession_PayloadT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSession_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceSession_Payload)
      }
      val value = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionType()
      return Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSession_Payload(value)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorPriorDegradedEpisodeType(): Vehicle_Controller_Operating_Mode_Coordinator.PriorDegradedEpisode.Type = {
      val r = reader.readZ()
      return Vehicle_Controller_Operating_Mode_Coordinator.PriorDegradedEpisode.byOrdinal(r).get
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorPriorDegradedEpisode_Payload(): Vehicle_Controller_Operating_Mode_Coordinator.PriorDegradedEpisode_Payload = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorPriorDegradedEpisode_PayloadT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorPriorDegradedEpisode_PayloadT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.PriorDegradedEpisode_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorPriorDegradedEpisode_Payload)
      }
      val value = readVehicle_Controller_Operating_Mode_CoordinatorPriorDegradedEpisodeType()
      return Vehicle_Controller_Operating_Mode_Coordinator.PriorDegradedEpisode_Payload(value)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeType(): Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisode.Type = {
      val r = reader.readZ()
      return Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisode.byOrdinal(r).get
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisode_Payload(): Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisode_Payload = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisode_PayloadT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisode_PayloadT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisode_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorDegradedEpisode_Payload)
      }
      val value = readVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeType()
      return Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisode_Payload(value)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorControllerModeType(): Vehicle_Controller_Operating_Mode_Coordinator.ControllerMode.Type = {
      val r = reader.readZ()
      return Vehicle_Controller_Operating_Mode_Coordinator.ControllerMode.byOrdinal(r).get
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorControllerMode_Payload(): Vehicle_Controller_Operating_Mode_Coordinator.ControllerMode_Payload = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorControllerMode_PayloadT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorControllerMode_PayloadT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.ControllerMode_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorControllerMode_Payload)
      }
      val value = readVehicle_Controller_Operating_Mode_CoordinatorControllerModeType()
      return Vehicle_Controller_Operating_Mode_Coordinator.ControllerMode_Payload(value)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorTransitionReasonType(): Vehicle_Controller_Operating_Mode_Coordinator.TransitionReason.Type = {
      val r = reader.readZ()
      return Vehicle_Controller_Operating_Mode_Coordinator.TransitionReason.byOrdinal(r).get
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorTransitionReason_Payload(): Vehicle_Controller_Operating_Mode_Coordinator.TransitionReason_Payload = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorTransitionReason_PayloadT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorTransitionReason_PayloadT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.TransitionReason_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorTransitionReason_Payload)
      }
      val value = readVehicle_Controller_Operating_Mode_CoordinatorTransitionReasonType()
      return Vehicle_Controller_Operating_Mode_Coordinator.TransitionReason_Payload(value)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorBrakeDemandType(): Vehicle_Controller_Operating_Mode_Coordinator.BrakeDemand.Type = {
      val r = reader.readZ()
      return Vehicle_Controller_Operating_Mode_Coordinator.BrakeDemand.byOrdinal(r).get
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorBrakeDemand_Payload(): Vehicle_Controller_Operating_Mode_Coordinator.BrakeDemand_Payload = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorBrakeDemand_PayloadT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorBrakeDemand_PayloadT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.BrakeDemand_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorBrakeDemand_Payload)
      }
      val value = readVehicle_Controller_Operating_Mode_CoordinatorBrakeDemandType()
      return Vehicle_Controller_Operating_Mode_Coordinator.BrakeDemand_Payload(value)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorPublishedControllerModeType(): Vehicle_Controller_Operating_Mode_Coordinator.PublishedControllerMode.Type = {
      val r = reader.readZ()
      return Vehicle_Controller_Operating_Mode_Coordinator.PublishedControllerMode.byOrdinal(r).get
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorPublishedControllerMode_Payload(): Vehicle_Controller_Operating_Mode_Coordinator.PublishedControllerMode_Payload = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorPublishedControllerMode_PayloadT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorPublishedControllerMode_PayloadT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.PublishedControllerMode_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorPublishedControllerMode_Payload)
      }
      val value = readVehicle_Controller_Operating_Mode_CoordinatorPublishedControllerModeType()
      return Vehicle_Controller_Operating_Mode_Coordinator.PublishedControllerMode_Payload(value)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeCommandType(): Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeCommand.Type = {
      val r = reader.readZ()
      return Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeCommand.byOrdinal(r).get
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeCommand_Payload(): Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeCommand_Payload = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeCommand_PayloadT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeCommand_PayloadT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeCommand_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorParkingBrakeCommand_Payload)
      }
      val value = readVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeCommandType()
      return Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeCommand_Payload(value)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorLifecycleIndications(): Vehicle_Controller_Operating_Mode_Coordinator.LifecycleIndications = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorLifecycleIndicationsT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorLifecycleIndicationsT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.LifecycleIndications = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorLifecycleIndications)
      }
      val startLevel = readVehicle_Controller_Operating_Mode_CoordinatorStartIndicationLevelType()
      val onLevel = readVehicle_Controller_Operating_Mode_CoordinatorOnIndicationLevelType()
      val offLevel = readVehicle_Controller_Operating_Mode_CoordinatorOffIndicationLevelType()
      return Vehicle_Controller_Operating_Mode_Coordinator.LifecycleIndications(startLevel, onLevel, offLevel)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorLifecycleIndications_Payload(): Vehicle_Controller_Operating_Mode_Coordinator.LifecycleIndications_Payload = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorLifecycleIndications_PayloadT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorLifecycleIndications_PayloadT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.LifecycleIndications_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorLifecycleIndications_Payload)
      }
      val value = readVehicle_Controller_Operating_Mode_CoordinatorLifecycleIndications()
      return Vehicle_Controller_Operating_Mode_Coordinator.LifecycleIndications_Payload(value)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts(): Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochFacts = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFactsT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFactsT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochFacts = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts)
      }
      val freshStart = reader.readB()
      val freshOn = reader.readB()
      val offActive = reader.readB()
      val heldStart = reader.readB()
      val heldOn = reader.readB()
      val heldOff = reader.readB()
      val anyInvalid = reader.readB()
      return Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochFacts(freshStart, freshOn, offActive, heldStart, heldOn, heldOff, anyInvalid)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts_Payload(): Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochFacts_Payload = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts_PayloadT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts_PayloadT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochFacts_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts_Payload)
      }
      val value = readVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts()
      return Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochFacts_Payload(value)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts(): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochFacts = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFactsT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFactsT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochFacts = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts)
      }
      val active = reader.readB()
      val fresh = reader.readB()
      val cleared = reader.readB()
      val held = reader.readB()
      val invalid = reader.readB()
      return Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochFacts(active, fresh, cleared, held, invalid)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts_Payload(): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochFacts_Payload = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts_PayloadT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts_PayloadT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochFacts_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts_Payload)
      }
      val value = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts()
      return Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochFacts_Payload(value)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts(): Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochFacts = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFactsT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFactsT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochFacts = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts)
      }
      val active = reader.readB()
      val fresh = reader.readB()
      val cleared = reader.readB()
      val held = reader.readB()
      val invalid = reader.readB()
      return Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochFacts(active, fresh, cleared, held, invalid)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts_Payload(): Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochFacts_Payload = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts_PayloadT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts_PayloadT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochFacts_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts_Payload)
      }
      val value = readVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts()
      return Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochFacts_Payload(value)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts(): Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochFacts = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFactsT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFactsT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochFacts = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts)
      }
      val fresh = reader.readB()
      val held = reader.readB()
      val clear = reader.readB()
      val invalid = reader.readB()
      return Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochFacts(fresh, held, clear, invalid)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts_Payload(): Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochFacts_Payload = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts_PayloadT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts_PayloadT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochFacts_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts_Payload)
      }
      val value = readVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts()
      return Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochFacts_Payload(value)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndication(): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceIndication = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndicationT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndicationT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceIndication = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndication)
      }
      val level = readVehicle_Controller_Operating_Mode_CoordinatorIndicationLevelType()
      return Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceIndication(level)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndication_Payload(): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceIndication_Payload = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndication_PayloadT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndication_PayloadT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceIndication_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndication_Payload)
      }
      val value = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndication()
      return Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceIndication_Payload(value)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorDegradedIndication(): Vehicle_Controller_Operating_Mode_Coordinator.DegradedIndication = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorDegradedIndicationT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorDegradedIndicationT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.DegradedIndication = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorDegradedIndication)
      }
      val level = readVehicle_Controller_Operating_Mode_CoordinatorIndicationLevelType()
      return Vehicle_Controller_Operating_Mode_Coordinator.DegradedIndication(level)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorDegradedIndication_Payload(): Vehicle_Controller_Operating_Mode_Coordinator.DegradedIndication_Payload = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorDegradedIndication_PayloadT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorDegradedIndication_PayloadT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.DegradedIndication_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorDegradedIndication_Payload)
      }
      val value = readVehicle_Controller_Operating_Mode_CoordinatorDegradedIndication()
      return Vehicle_Controller_Operating_Mode_Coordinator.DegradedIndication_Payload(value)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorReturnIndication(): Vehicle_Controller_Operating_Mode_Coordinator.ReturnIndication = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorReturnIndicationT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorReturnIndicationT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.ReturnIndication = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorReturnIndication)
      }
      val level = readVehicle_Controller_Operating_Mode_CoordinatorIndicationLevelType()
      return Vehicle_Controller_Operating_Mode_Coordinator.ReturnIndication(level)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorReturnIndication_Payload(): Vehicle_Controller_Operating_Mode_Coordinator.ReturnIndication_Payload = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorReturnIndication_PayloadT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorReturnIndication_PayloadT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.ReturnIndication_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorReturnIndication_Payload)
      }
      val value = readVehicle_Controller_Operating_Mode_CoordinatorReturnIndication()
      return Vehicle_Controller_Operating_Mode_Coordinator.ReturnIndication_Payload(value)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot(): Vehicle_Controller_Operating_Mode_Coordinator.DemandSnapshot = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorDemandSnapshotT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorDemandSnapshotT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.DemandSnapshot = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot)
      }
      val currentDemand = readVehicle_Controller_Operating_Mode_CoordinatorPriorOperatingDemandType()
      val nextDemand = readVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandType()
      return Vehicle_Controller_Operating_Mode_Coordinator.DemandSnapshot(currentDemand, nextDemand)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot_Payload(): Vehicle_Controller_Operating_Mode_Coordinator.DemandSnapshot_Payload = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot_PayloadT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot_PayloadT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.DemandSnapshot_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot_Payload)
      }
      val value = readVehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot()
      return Vehicle_Controller_Operating_Mode_Coordinator.DemandSnapshot_Payload(value)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot(): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSnapshot = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshotT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshotT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSnapshot = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot)
      }
      val currentSession = readVehicle_Controller_Operating_Mode_CoordinatorPriorMaintenanceSessionType()
      val nextSession = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionType()
      return Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSnapshot(currentSession, nextSession)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot_Payload(): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSnapshot_Payload = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot_PayloadT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot_PayloadT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSnapshot_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot_Payload)
      }
      val value = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot()
      return Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSnapshot_Payload(value)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot(): Vehicle_Controller_Operating_Mode_Coordinator.EpisodeSnapshot = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshotT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshotT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.EpisodeSnapshot = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot)
      }
      val currentEpisode = readVehicle_Controller_Operating_Mode_CoordinatorPriorDegradedEpisodeType()
      val nextEpisode = readVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeType()
      return Vehicle_Controller_Operating_Mode_Coordinator.EpisodeSnapshot(currentEpisode, nextEpisode)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot_Payload(): Vehicle_Controller_Operating_Mode_Coordinator.EpisodeSnapshot_Payload = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot_PayloadT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot_PayloadT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.EpisodeSnapshot_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot_Payload)
      }
      val value = readVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot()
      return Vehicle_Controller_Operating_Mode_Coordinator.EpisodeSnapshot_Payload(value)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorModeDecision(): Vehicle_Controller_Operating_Mode_Coordinator.ModeDecision = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorModeDecisionT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorModeDecisionT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.ModeDecision = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorModeDecision)
      }
      val nextMode = readVehicle_Controller_Operating_Mode_CoordinatorControllerModeType()
      val reason = readVehicle_Controller_Operating_Mode_CoordinatorTransitionReasonType()
      return Vehicle_Controller_Operating_Mode_Coordinator.ModeDecision(nextMode, reason)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorModeDecision_Payload(): Vehicle_Controller_Operating_Mode_Coordinator.ModeDecision_Payload = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorModeDecision_PayloadT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorModeDecision_PayloadT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.ModeDecision_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorModeDecision_Payload)
      }
      val value = readVehicle_Controller_Operating_Mode_CoordinatorModeDecision()
      return Vehicle_Controller_Operating_Mode_Coordinator.ModeDecision_Payload(value)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorCoordinationFrame(): Vehicle_Controller_Operating_Mode_Coordinator.CoordinationFrame = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorCoordinationFrameT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorCoordinationFrameT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.CoordinationFrame = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorCoordinationFrame)
      }
      val mode = readVehicle_Controller_Operating_Mode_CoordinatorPublishedControllerModeType()
      val parkingBrake = readVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeCommandType()
      return Vehicle_Controller_Operating_Mode_Coordinator.CoordinationFrame(mode, parkingBrake)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorCoordinationFrame_Payload(): Vehicle_Controller_Operating_Mode_Coordinator.CoordinationFrame_Payload = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorCoordinationFrame_PayloadT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorCoordinationFrame_PayloadT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.CoordinationFrame_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorCoordinationFrame_Payload)
      }
      val value = readVehicle_Controller_Operating_Mode_CoordinatorCoordinationFrame()
      return Vehicle_Controller_Operating_Mode_Coordinator.CoordinationFrame_Payload(value)
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

    def readVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container(): Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container.")
          val r = readVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_P(): Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_P = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_P)
      }
      val api_lifecycleIndications = readVehicle_Controller_Operating_Mode_CoordinatorLifecycleIndications()
      return Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_P(api_lifecycleIndications)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PS(): Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PS = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PST(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PST(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PS)
      }
      val api_lifecycleIndications = readVehicle_Controller_Operating_Mode_CoordinatorLifecycleIndications()
      return Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PS(api_lifecycleIndications)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container(): Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container.")
          val r = readVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_P(): Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_P = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_P)
      }
      val api_factsToConflict = readVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts()
      val api_factsToPriority = readVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts()
      return Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_P(api_factsToConflict, api_factsToPriority)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PS(): Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PS = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PST(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PST(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PS)
      }
      val api_factsToConflict = readVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts()
      val api_factsToPriority = readVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts()
      return Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PS(api_factsToConflict, api_factsToPriority)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container(): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container.")
          val r = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_P(): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_P = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_P)
      }
      val api_maintenanceIndication = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndication()
      return Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_P(api_maintenanceIndication)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PS(): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PS = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PST(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PST(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PS)
      }
      val api_maintenanceIndication = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndication()
      return Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PS(api_maintenanceIndication)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container(): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container.")
          val r = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_P(): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_P = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_P)
      }
      val api_factsToConflict = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts()
      val api_factsToPriority = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts()
      val api_factsToSession = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts()
      return Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_P(api_factsToConflict, api_factsToPriority, api_factsToSession)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PS(): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PS = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PST(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PST(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PS)
      }
      val api_factsToConflict = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts()
      val api_factsToPriority = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts()
      val api_factsToSession = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts()
      return Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PS(api_factsToConflict, api_factsToPriority, api_factsToSession)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container(): Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container.")
          val r = readVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_P(): Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_P = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_P)
      }
      val api_degradedIndication = readVehicle_Controller_Operating_Mode_CoordinatorDegradedIndication()
      return Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_P(api_degradedIndication)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PS(): Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PS = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PST(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PST(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PS)
      }
      val api_degradedIndication = readVehicle_Controller_Operating_Mode_CoordinatorDegradedIndication()
      return Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PS(api_degradedIndication)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container(): Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container.")
          val r = readVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_P(): Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_P = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_P)
      }
      val api_factsToConflict = readVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts()
      val api_factsToEpisode = readVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts()
      val api_factsToPriority = readVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts()
      val api_factsToRecovery = readVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts()
      return Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_P(api_factsToConflict, api_factsToEpisode, api_factsToPriority, api_factsToRecovery)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PS(): Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PS = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PST(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PST(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PS)
      }
      val api_factsToConflict = readVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts()
      val api_factsToEpisode = readVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts()
      val api_factsToPriority = readVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts()
      val api_factsToRecovery = readVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts()
      return Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PS(api_factsToConflict, api_factsToEpisode, api_factsToPriority, api_factsToRecovery)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container(): Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container.")
          val r = readVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_P(): Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_P = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_P)
      }
      val api_returnIndication = readVehicle_Controller_Operating_Mode_CoordinatorReturnIndication()
      return Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_P(api_returnIndication)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PS(): Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PS = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PST(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PST(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PS)
      }
      val api_returnIndication = readVehicle_Controller_Operating_Mode_CoordinatorReturnIndication()
      return Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PS(api_returnIndication)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container(): Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container.")
          val r = readVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_P(): Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_P = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_P)
      }
      val api_factsToConflict = readVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts()
      val api_factsToPriority = readVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts()
      val api_factsToRecovery = readVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts()
      return Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_P(api_factsToConflict, api_factsToPriority, api_factsToRecovery)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PS(): Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PS = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PST(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PST(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PS)
      }
      val api_factsToConflict = readVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts()
      val api_factsToPriority = readVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts()
      val api_factsToRecovery = readVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts()
      return Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PS(api_factsToConflict, api_factsToPriority, api_factsToRecovery)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container(): Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container.")
          val r = readVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_P(): Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_P = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_P)
      }
      val api_degradationFacts = readVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts()
      val api_lifecycleFacts = readVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts()
      val api_maintenanceFacts = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts()
      val api_returnFacts = readVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts()
      return Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_P(api_degradationFacts, api_lifecycleFacts, api_maintenanceFacts, api_returnFacts)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PS(): Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PS = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PST(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PST(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PS)
      }
      val api_degradationFacts = readVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts()
      val api_lifecycleFacts = readVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts()
      val api_maintenanceFacts = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts()
      val api_returnFacts = readVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts()
      return Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PS(api_degradationFacts, api_lifecycleFacts, api_maintenanceFacts, api_returnFacts)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container(): Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container.")
          val r = readVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_P(): Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_P = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_P)
      }
      val api_conflictToPriority = readVehicle_Controller_Operating_Mode_CoordinatorConflictClassType()
      val api_conflictToRecovery = readVehicle_Controller_Operating_Mode_CoordinatorConflictClassType()
      return Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_P(api_conflictToPriority, api_conflictToRecovery)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PS(): Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PS = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PST(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PST(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PS)
      }
      val api_conflictToPriority = readVehicle_Controller_Operating_Mode_CoordinatorConflictClassType()
      val api_conflictToRecovery = readVehicle_Controller_Operating_Mode_CoordinatorConflictClassType()
      return Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PS(api_conflictToPriority, api_conflictToRecovery)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container(): Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container.")
          val r = readVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_P(): Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_P = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_P)
      }
      val api_conflictClass = readVehicle_Controller_Operating_Mode_CoordinatorConflictClassType()
      val api_degradationFacts = readVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts()
      val api_lifecycleFacts = readVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts()
      val api_maintenanceFacts = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts()
      val api_returnFacts = readVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts()
      return Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_P(api_conflictClass, api_degradationFacts, api_lifecycleFacts, api_maintenanceFacts, api_returnFacts)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PS(): Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PS = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PST(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PST(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PS)
      }
      val api_conflictClass = readVehicle_Controller_Operating_Mode_CoordinatorConflictClassType()
      val api_degradationFacts = readVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts()
      val api_lifecycleFacts = readVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts()
      val api_maintenanceFacts = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts()
      val api_returnFacts = readVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts()
      return Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PS(api_conflictClass, api_degradationFacts, api_lifecycleFacts, api_maintenanceFacts, api_returnFacts)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container(): Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container.")
          val r = readVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_P(): Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_P = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_P)
      }
      val api_selectionToBrake = readVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType()
      val api_selectionToDemand = readVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType()
      val api_selectionToEpisode = readVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType()
      val api_selectionToRecovery = readVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType()
      val api_selectionToSession = readVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType()
      return Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_P(api_selectionToBrake, api_selectionToDemand, api_selectionToEpisode, api_selectionToRecovery, api_selectionToSession)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PS(): Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PS = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PST(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PST(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PS)
      }
      val api_selectionToBrake = readVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType()
      val api_selectionToDemand = readVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType()
      val api_selectionToEpisode = readVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType()
      val api_selectionToRecovery = readVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType()
      val api_selectionToSession = readVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType()
      return Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PS(api_selectionToBrake, api_selectionToDemand, api_selectionToEpisode, api_selectionToRecovery, api_selectionToSession)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container(): Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container.")
          val r = readVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_P(): Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_P = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_P)
      }
      val api_recoveryDecision = readVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecisionType()
      val api_selectedIndication = readVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType()
      return Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_P(api_recoveryDecision, api_selectedIndication)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PS(): Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PS = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PST(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PST(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PS)
      }
      val api_recoveryDecision = readVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecisionType()
      val api_selectedIndication = readVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType()
      return Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PS(api_recoveryDecision, api_selectedIndication)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container(): Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container.")
          val r = readVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_P(): Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_P = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_P)
      }
      val api_demandSnapshot = readVehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot()
      return Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_P(api_demandSnapshot)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PS(): Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PS = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PST(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PST(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PS)
      }
      val api_demandSnapshot = readVehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot()
      return Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PS(api_demandSnapshot)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container(): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container.")
          val r = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_P(): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_P = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_P)
      }
      val api_maintenanceFacts = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts()
      val api_selectedIndication = readVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType()
      return Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_P(api_maintenanceFacts, api_selectedIndication)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PS(): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PS = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PST(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PST(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PS)
      }
      val api_maintenanceFacts = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts()
      val api_selectedIndication = readVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType()
      return Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PS(api_maintenanceFacts, api_selectedIndication)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container(): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container.")
          val r = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_P(): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_P = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_P)
      }
      val api_maintenanceSnapshot = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot()
      val api_snapshotToBrake = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot()
      return Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_P(api_maintenanceSnapshot, api_snapshotToBrake)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PS(): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PS = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PST(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PST(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PS)
      }
      val api_maintenanceSnapshot = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot()
      val api_snapshotToBrake = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot()
      return Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PS(api_maintenanceSnapshot, api_snapshotToBrake)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container(): Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container.")
          val r = readVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_P(): Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_P = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_P)
      }
      val api_degradationFacts = readVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts()
      val api_recoveryDecision = readVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecisionType()
      val api_selectedIndication = readVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType()
      return Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_P(api_degradationFacts, api_recoveryDecision, api_selectedIndication)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PS(): Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PS = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PST(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PST(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PS)
      }
      val api_degradationFacts = readVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts()
      val api_recoveryDecision = readVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecisionType()
      val api_selectedIndication = readVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType()
      return Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PS(api_degradationFacts, api_recoveryDecision, api_selectedIndication)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container(): Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container.")
          val r = readVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_P(): Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_P = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_P)
      }
      val api_snapshotToBrake = readVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot()
      val api_snapshotToMode = readVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot()
      val api_snapshotToRecovery = readVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot()
      return Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_P(api_snapshotToBrake, api_snapshotToMode, api_snapshotToRecovery)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PS(): Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PS = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PST(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PST(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PS)
      }
      val api_snapshotToBrake = readVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot()
      val api_snapshotToMode = readVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot()
      val api_snapshotToRecovery = readVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot()
      return Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PS(api_snapshotToBrake, api_snapshotToMode, api_snapshotToRecovery)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container(): Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container.")
          val r = readVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_P(): Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_P = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_P)
      }
      val api_conflictClass = readVehicle_Controller_Operating_Mode_CoordinatorConflictClassType()
      val api_degradationFacts = readVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts()
      val api_episodeSnapshot = readVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot()
      val api_returnFacts = readVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts()
      val api_selectedIndication = readVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType()
      return Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_P(api_conflictClass, api_degradationFacts, api_episodeSnapshot, api_returnFacts, api_selectedIndication)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PS(): Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PS = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PST(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PST(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PS)
      }
      val api_conflictClass = readVehicle_Controller_Operating_Mode_CoordinatorConflictClassType()
      val api_degradationFacts = readVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts()
      val api_episodeSnapshot = readVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot()
      val api_returnFacts = readVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts()
      val api_selectedIndication = readVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType()
      return Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PS(api_conflictClass, api_degradationFacts, api_episodeSnapshot, api_returnFacts, api_selectedIndication)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container(): Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container.")
          val r = readVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_P(): Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_P = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_P)
      }
      val api_decisionToDemand = readVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecisionType()
      val api_decisionToEpisode = readVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecisionType()
      val api_decisionToMode = readVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecisionType()
      return Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_P(api_decisionToDemand, api_decisionToEpisode, api_decisionToMode)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PS(): Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PS = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PST(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PST(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PS)
      }
      val api_decisionToDemand = readVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecisionType()
      val api_decisionToEpisode = readVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecisionType()
      val api_decisionToMode = readVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecisionType()
      return Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PS(api_decisionToDemand, api_decisionToEpisode, api_decisionToMode)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container(): Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container.")
          val r = readVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_P(): Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_P = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_P)
      }
      val api_demandSnapshot = readVehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot()
      val api_episodeSnapshot = readVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot()
      val api_maintenanceSnapshot = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot()
      val api_recoveryDecision = readVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecisionType()
      return Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_P(api_demandSnapshot, api_episodeSnapshot, api_maintenanceSnapshot, api_recoveryDecision)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PS(): Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PS = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PST(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PST(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PS)
      }
      val api_demandSnapshot = readVehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot()
      val api_episodeSnapshot = readVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot()
      val api_maintenanceSnapshot = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot()
      val api_recoveryDecision = readVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecisionType()
      return Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PS(api_demandSnapshot, api_episodeSnapshot, api_maintenanceSnapshot, api_recoveryDecision)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container(): Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container.")
          val r = readVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_P(): Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_P = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_P)
      }
      val api_modeDecision = readVehicle_Controller_Operating_Mode_CoordinatorModeDecision()
      return Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_P(api_modeDecision)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PS(): Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PS = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PST(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PST(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PS)
      }
      val api_modeDecision = readVehicle_Controller_Operating_Mode_CoordinatorModeDecision()
      return Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PS(api_modeDecision)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container(): Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container.")
          val r = readVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_P(): Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_P = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_P)
      }
      val api_episodeSnapshot = readVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot()
      val api_maintenanceSnapshot = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot()
      val api_selectedIndication = readVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType()
      return Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_P(api_episodeSnapshot, api_maintenanceSnapshot, api_selectedIndication)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PS(): Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PS = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PST(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PST(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PS)
      }
      val api_episodeSnapshot = readVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot()
      val api_maintenanceSnapshot = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot()
      val api_selectedIndication = readVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType()
      return Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PS(api_episodeSnapshot, api_maintenanceSnapshot, api_selectedIndication)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container(): Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container.")
          val r = readVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_P(): Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_P = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_P)
      }
      val api_brakeDemand = readVehicle_Controller_Operating_Mode_CoordinatorBrakeDemandType()
      return Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_P(api_brakeDemand)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PS(): Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PS = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PST(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PST(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PS)
      }
      val api_brakeDemand = readVehicle_Controller_Operating_Mode_CoordinatorBrakeDemandType()
      return Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PS(api_brakeDemand)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container(): Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container.")
          val r = readVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_P(): Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_P = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_P)
      }
      val api_brakeDemand = readVehicle_Controller_Operating_Mode_CoordinatorBrakeDemandType()
      val api_modeDecision = readVehicle_Controller_Operating_Mode_CoordinatorModeDecision()
      return Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_P(api_brakeDemand, api_modeDecision)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PS(): Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PS = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PST(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PST(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PS)
      }
      val api_brakeDemand = readVehicle_Controller_Operating_Mode_CoordinatorBrakeDemandType()
      val api_modeDecision = readVehicle_Controller_Operating_Mode_CoordinatorModeDecision()
      return Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PS(api_brakeDemand, api_modeDecision)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container(): Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container.")
          val r = readVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_P(): Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_P = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PT(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_P)
      }
      val api_coordinationFrame = readVehicle_Controller_Operating_Mode_CoordinatorCoordinationFrame()
      return Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_P(api_coordinationFrame)
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PS(): Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PS = {
      val r = readVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PST(F)
      return r
    }

    def readVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PST(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PS)
      }
      val api_coordinationFrame = readVehicle_Controller_Operating_Mode_CoordinatorCoordinationFrame()
      return Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PS(api_coordinationFrame)
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
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PST(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PST(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PST(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PST(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PST(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PST(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PST(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PST(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PST(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PST(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PST(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PST(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PST(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PST(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PST(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PST(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PST(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PST(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PST(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PST(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PST(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PST(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PST(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PST(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PST(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of util.Container.")
          val r = readVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PST(T)
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
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorBrakeDemand_Payload => val r = readVehicle_Controller_Operating_Mode_CoordinatorBrakeDemand_PayloadT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorModeDecision_Payload => val r = readVehicle_Controller_Operating_Mode_CoordinatorModeDecision_PayloadT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorConflictClass_Payload => val r = readVehicle_Controller_Operating_Mode_CoordinatorConflictClass_PayloadT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorControllerMode_Payload => val r = readVehicle_Controller_Operating_Mode_CoordinatorControllerMode_PayloadT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot_Payload => val r = readVehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot_PayloadT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorIndicationLevel_Payload => val r = readVehicle_Controller_Operating_Mode_CoordinatorIndicationLevel_PayloadT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorOperatingDemand_Payload => val r = readVehicle_Controller_Operating_Mode_CoordinatorOperatingDemand_PayloadT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorDegradedEpisode_Payload => val r = readVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisode_PayloadT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot_Payload => val r = readVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot_PayloadT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorRecoveryDecision_Payload => val r = readVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecision_PayloadT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorTransitionReason_Payload => val r = readVehicle_Controller_Operating_Mode_CoordinatorTransitionReason_PayloadT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorReturnIndication_Payload => val r = readVehicle_Controller_Operating_Mode_CoordinatorReturnIndication_PayloadT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts_Payload => val r = readVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts_PayloadT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorOnIndicationLevel_Payload => val r = readVehicle_Controller_Operating_Mode_CoordinatorOnIndicationLevel_PayloadT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorCoordinationFrame_Payload => val r = readVehicle_Controller_Operating_Mode_CoordinatorCoordinationFrame_PayloadT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceSession_Payload => val r = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSession_PayloadT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorOffIndicationLevel_Payload => val r = readVehicle_Controller_Operating_Mode_CoordinatorOffIndicationLevel_PayloadT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorSelectedIndication_Payload => val r = readVehicle_Controller_Operating_Mode_CoordinatorSelectedIndication_PayloadT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorDegradedIndication_Payload => val r = readVehicle_Controller_Operating_Mode_CoordinatorDegradedIndication_PayloadT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorParkingBrakeCommand_Payload => val r = readVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeCommand_PayloadT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot_Payload => val r = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot_PayloadT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts_Payload => val r = readVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts_PayloadT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorStartIndicationLevel_Payload => val r = readVehicle_Controller_Operating_Mode_CoordinatorStartIndicationLevel_PayloadT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorPriorOperatingDemand_Payload => val r = readVehicle_Controller_Operating_Mode_CoordinatorPriorOperatingDemand_PayloadT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorPriorDegradedEpisode_Payload => val r = readVehicle_Controller_Operating_Mode_CoordinatorPriorDegradedEpisode_PayloadT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorLifecycleIndications_Payload => val r = readVehicle_Controller_Operating_Mode_CoordinatorLifecycleIndications_PayloadT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndication_Payload => val r = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndication_PayloadT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts_Payload => val r = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts_PayloadT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts_Payload => val r = readVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts_PayloadT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorPriorMaintenanceSession_Payload => val r = readVehicle_Controller_Operating_Mode_CoordinatorPriorMaintenanceSession_PayloadT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorPublishedControllerMode_Payload => val r = readVehicle_Controller_Operating_Mode_CoordinatorPublishedControllerMode_PayloadT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PST(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PST(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PST(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PST(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PST(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PST(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PST(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PST(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PST(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PST(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PST(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PST(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PST(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PST(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PST(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PST(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PST(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PST(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PST(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PST(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PST(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PST(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PST(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PST(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PST(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_P => val r = readVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PS => val r = readVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of art.DataContent.")
          val r = readVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PST(T)
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

  def fromVehicle_Controller_Operating_Mode_CoordinatorStartIndicationLevel_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.StartIndicationLevel_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorStartIndicationLevel_Payload(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorStartIndicationLevel_Payload(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.StartIndicationLevel_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorStartIndicationLevel_Payload(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.StartIndicationLevel_Payload = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorStartIndicationLevel_Payload()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorStartIndicationLevel_Payload _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorOnIndicationLevel_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.OnIndicationLevel_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorOnIndicationLevel_Payload(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorOnIndicationLevel_Payload(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.OnIndicationLevel_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorOnIndicationLevel_Payload(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.OnIndicationLevel_Payload = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorOnIndicationLevel_Payload()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorOnIndicationLevel_Payload _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorOffIndicationLevel_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.OffIndicationLevel_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorOffIndicationLevel_Payload(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorOffIndicationLevel_Payload(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.OffIndicationLevel_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorOffIndicationLevel_Payload(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.OffIndicationLevel_Payload = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorOffIndicationLevel_Payload()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorOffIndicationLevel_Payload _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorIndicationLevel_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.IndicationLevel_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorIndicationLevel_Payload(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorIndicationLevel_Payload(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.IndicationLevel_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorIndicationLevel_Payload(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.IndicationLevel_Payload = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorIndicationLevel_Payload()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorIndicationLevel_Payload _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorConflictClass_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClass_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorConflictClass_Payload(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorConflictClass_Payload(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.ConflictClass_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorConflictClass_Payload(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.ConflictClass_Payload = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorConflictClass_Payload()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorConflictClass_Payload _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorSelectedIndication_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorSelectedIndication_Payload(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorSelectedIndication_Payload(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorSelectedIndication_Payload(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication_Payload = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorSelectedIndication_Payload()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorSelectedIndication_Payload _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecision_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryDecision_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecision_Payload(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecision_Payload(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.RecoveryDecision_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecision_Payload(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.RecoveryDecision_Payload = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecision_Payload()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecision_Payload _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorPriorOperatingDemand_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.PriorOperatingDemand_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorPriorOperatingDemand_Payload(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorPriorOperatingDemand_Payload(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.PriorOperatingDemand_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorPriorOperatingDemand_Payload(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.PriorOperatingDemand_Payload = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorPriorOperatingDemand_Payload()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorPriorOperatingDemand_Payload _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorOperatingDemand_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemand_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorOperatingDemand_Payload(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorOperatingDemand_Payload(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemand_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorOperatingDemand_Payload(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemand_Payload = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorOperatingDemand_Payload()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorOperatingDemand_Payload _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorPriorMaintenanceSession_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.PriorMaintenanceSession_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorPriorMaintenanceSession_Payload(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorPriorMaintenanceSession_Payload(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.PriorMaintenanceSession_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorPriorMaintenanceSession_Payload(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.PriorMaintenanceSession_Payload = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorPriorMaintenanceSession_Payload()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorPriorMaintenanceSession_Payload _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSession_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSession_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSession_Payload(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSession_Payload(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSession_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSession_Payload(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSession_Payload = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSession_Payload()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSession_Payload _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorPriorDegradedEpisode_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.PriorDegradedEpisode_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorPriorDegradedEpisode_Payload(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorPriorDegradedEpisode_Payload(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.PriorDegradedEpisode_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorPriorDegradedEpisode_Payload(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.PriorDegradedEpisode_Payload = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorPriorDegradedEpisode_Payload()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorPriorDegradedEpisode_Payload _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisode_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisode_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisode_Payload(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisode_Payload(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisode_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisode_Payload(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisode_Payload = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisode_Payload()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisode_Payload _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorControllerMode_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.ControllerMode_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorControllerMode_Payload(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorControllerMode_Payload(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.ControllerMode_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorControllerMode_Payload(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.ControllerMode_Payload = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorControllerMode_Payload()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorControllerMode_Payload _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorTransitionReason_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.TransitionReason_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorTransitionReason_Payload(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorTransitionReason_Payload(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.TransitionReason_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorTransitionReason_Payload(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.TransitionReason_Payload = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorTransitionReason_Payload()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorTransitionReason_Payload _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorBrakeDemand_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.BrakeDemand_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorBrakeDemand_Payload(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorBrakeDemand_Payload(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.BrakeDemand_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorBrakeDemand_Payload(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.BrakeDemand_Payload = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorBrakeDemand_Payload()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorBrakeDemand_Payload _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorPublishedControllerMode_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.PublishedControllerMode_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorPublishedControllerMode_Payload(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorPublishedControllerMode_Payload(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.PublishedControllerMode_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorPublishedControllerMode_Payload(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.PublishedControllerMode_Payload = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorPublishedControllerMode_Payload()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorPublishedControllerMode_Payload _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeCommand_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeCommand_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeCommand_Payload(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeCommand_Payload(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeCommand_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeCommand_Payload(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeCommand_Payload = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeCommand_Payload()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeCommand_Payload _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorLifecycleIndications(o: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleIndications, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorLifecycleIndications(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorLifecycleIndications(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.LifecycleIndications, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorLifecycleIndications(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.LifecycleIndications = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorLifecycleIndications()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorLifecycleIndications _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorLifecycleIndications_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleIndications_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorLifecycleIndications_Payload(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorLifecycleIndications_Payload(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.LifecycleIndications_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorLifecycleIndications_Payload(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.LifecycleIndications_Payload = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorLifecycleIndications_Payload()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorLifecycleIndications_Payload _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts(o: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochFacts, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochFacts, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochFacts = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochFacts_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts_Payload(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts_Payload(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochFacts_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts_Payload(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochFacts_Payload = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts_Payload()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts_Payload _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochFacts, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochFacts, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochFacts = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochFacts_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts_Payload(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts_Payload(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochFacts_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts_Payload(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochFacts_Payload = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts_Payload()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts_Payload _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochFacts, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochFacts, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochFacts = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochFacts_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts_Payload(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts_Payload(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochFacts_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts_Payload(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochFacts_Payload = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts_Payload()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts_Payload _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts(o: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochFacts, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochFacts, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochFacts = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochFacts_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts_Payload(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts_Payload(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochFacts_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts_Payload(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochFacts_Payload = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts_Payload()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts_Payload _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndication(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceIndication, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndication(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndication(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceIndication, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndication(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceIndication = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndication()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndication _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndication_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceIndication_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndication_Payload(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndication_Payload(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceIndication_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndication_Payload(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceIndication_Payload = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndication_Payload()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndication_Payload _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorDegradedIndication(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradedIndication, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorDegradedIndication(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorDegradedIndication(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.DegradedIndication, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorDegradedIndication(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.DegradedIndication = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorDegradedIndication()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorDegradedIndication _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorDegradedIndication_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradedIndication_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorDegradedIndication_Payload(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorDegradedIndication_Payload(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.DegradedIndication_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorDegradedIndication_Payload(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.DegradedIndication_Payload = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorDegradedIndication_Payload()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorDegradedIndication_Payload _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorReturnIndication(o: Vehicle_Controller_Operating_Mode_Coordinator.ReturnIndication, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorReturnIndication(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorReturnIndication(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.ReturnIndication, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorReturnIndication(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.ReturnIndication = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorReturnIndication()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorReturnIndication _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorReturnIndication_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.ReturnIndication_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorReturnIndication_Payload(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorReturnIndication_Payload(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.ReturnIndication_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorReturnIndication_Payload(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.ReturnIndication_Payload = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorReturnIndication_Payload()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorReturnIndication_Payload _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot(o: Vehicle_Controller_Operating_Mode_Coordinator.DemandSnapshot, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.DemandSnapshot, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.DemandSnapshot = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.DemandSnapshot_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot_Payload(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot_Payload(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.DemandSnapshot_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot_Payload(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.DemandSnapshot_Payload = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot_Payload()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot_Payload _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSnapshot, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSnapshot, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSnapshot = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSnapshot_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot_Payload(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot_Payload(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSnapshot_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot_Payload(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSnapshot_Payload = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot_Payload()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot_Payload _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot(o: Vehicle_Controller_Operating_Mode_Coordinator.EpisodeSnapshot, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.EpisodeSnapshot, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.EpisodeSnapshot = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.EpisodeSnapshot_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot_Payload(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot_Payload(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.EpisodeSnapshot_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot_Payload(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.EpisodeSnapshot_Payload = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot_Payload()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot_Payload _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorModeDecision(o: Vehicle_Controller_Operating_Mode_Coordinator.ModeDecision, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorModeDecision(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorModeDecision(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.ModeDecision, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorModeDecision(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.ModeDecision = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorModeDecision()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorModeDecision _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorModeDecision_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.ModeDecision_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorModeDecision_Payload(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorModeDecision_Payload(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.ModeDecision_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorModeDecision_Payload(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.ModeDecision_Payload = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorModeDecision_Payload()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorModeDecision_Payload _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorCoordinationFrame(o: Vehicle_Controller_Operating_Mode_Coordinator.CoordinationFrame, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorCoordinationFrame(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorCoordinationFrame(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.CoordinationFrame, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorCoordinationFrame(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.CoordinationFrame = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorCoordinationFrame()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorCoordinationFrame _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorCoordinationFrame_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.CoordinationFrame_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorCoordinationFrame_Payload(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorCoordinationFrame_Payload(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.CoordinationFrame_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorCoordinationFrame_Payload(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.CoordinationFrame_Payload = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorCoordinationFrame_Payload()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorCoordinationFrame_Payload _)
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

  def fromVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_P(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_P(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_P(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_P = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PS(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PS(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PS(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PS = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_P(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_P(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_P(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_P = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PS(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PS(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PS(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PS = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PS _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_P(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_P(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_P(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_P = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PS(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PS(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PS(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PS = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_P(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_P(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_P(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_P = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PS(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PS(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PS(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PS = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PS _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_P(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_P(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_P(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_P = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PS(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PS(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PS(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PS = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_P(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_P(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_P(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_P = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PS(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PS(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PS(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PS = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PS _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_P(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_P(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_P(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_P = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PS(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PS(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PS(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PS = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_P(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_P(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_P(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_P = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PS(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PS(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PS(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PS = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PS _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_P(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_P(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_P(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_P = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PS(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PS(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PS(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PS = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_P(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_P(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_P(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_P = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PS(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PS(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PS(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PS = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PS _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_P(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_P(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_P(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_P = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PS(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PS(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PS(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PS = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_P(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_P(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_P(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_P = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PS(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PS(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PS(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PS = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PS _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_P(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_P(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_P(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_P = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PS(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PS(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PS(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PS = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_P(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_P(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_P(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_P = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PS(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PS(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PS(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PS = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PS _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_P(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_P(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_P(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_P = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PS(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PS(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PS(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PS = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_P(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_P(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_P(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_P = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PS(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PS(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PS(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PS = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PS _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_P(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_P(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_P(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_P = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PS(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PS(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PS(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PS = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_P(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_P(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_P(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_P = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PS(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PS(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PS(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PS = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PS _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_P(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_P(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_P(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_P = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PS(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PS(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PS(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PS = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_P(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_P(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_P(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_P = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PS(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PS(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PS(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PS = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PS _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_P(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_P(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_P(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_P = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PS(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PS(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PS(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PS = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_P(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_P(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_P(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_P = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PS(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PS(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PS(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PS = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PS _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_P(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_P(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_P(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_P = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PS(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PS(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PS(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PS = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_P(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_P(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_P(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_P = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PS(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PS(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PS(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PS = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PS _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_P(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_P(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_P(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_P = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PS(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PS(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PS(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PS = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_P(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_P(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_P(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_P = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PS(o)
    return w.result
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PS(data: ISZ[U8]): Either[Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PS(reader: Reader): Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PS = {
      val r = reader.readVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PS _)
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