// #Sireum
// @formatter:off

// This file is auto-generated from PilotIntent.scala, QualifiedIntent.scala, BerthObservation.scala, ShipCondition.scala, DockReadiness.scala, ServiceSignal.scala, ServiceInterlock.scala, LifecycleState.scala, OperationalAssessment.scala, AdmittedDirective.scala, MovementProposal.scala, AccessProposal.scala, SnapshotLifecycleState.scala, LifecycleResult.scala, MovementDirective.scala, ServiceAccess.scala, PilotLifecycleReport.scala, StationAccessReport.scala, ControlProposal.scala, LifecycleSnapshot.scala, GatedControl.scala, Base_Types.scala, IntentQualifier_supervisorProcess_intentQualifier_Containers.scala, DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_Containers.scala, ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_Containers.scala, LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_Containers.scala, PriorityArbiter_supervisorProcess_priorityArbiter_Containers.scala, LifecycleController_supervisorProcess_lifecycleController_Containers.scala, MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_Containers.scala, LifecycleReporter_supervisorProcess_lifecycleReporter_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package docked_service_access_lifecycle_supervisor

import org.sireum._

object MsgPack {

  object Constants {

    val Docked_Service_Access_Lifecycle_SupervisorPilotIntent_Payload: Z = -32

    val Docked_Service_Access_Lifecycle_SupervisorQualifiedIntent_Payload: Z = -31

    val Docked_Service_Access_Lifecycle_SupervisorBerthObservation_Payload: Z = -30

    val Docked_Service_Access_Lifecycle_SupervisorShipCondition_Payload: Z = -29

    val Docked_Service_Access_Lifecycle_SupervisorDockReadiness_Payload: Z = -28

    val Docked_Service_Access_Lifecycle_SupervisorServiceSignal_Payload: Z = -27

    val Docked_Service_Access_Lifecycle_SupervisorServiceInterlock_Payload: Z = -26

    val Docked_Service_Access_Lifecycle_SupervisorLifecycleState_Payload: Z = -25

    val Docked_Service_Access_Lifecycle_SupervisorOperationalAssessment_Payload: Z = -24

    val Docked_Service_Access_Lifecycle_SupervisorAdmittedDirective_Payload: Z = -23

    val Docked_Service_Access_Lifecycle_SupervisorMovementProposal_Payload: Z = -22

    val Docked_Service_Access_Lifecycle_SupervisorAccessProposal_Payload: Z = -21

    val Docked_Service_Access_Lifecycle_SupervisorSnapshotLifecycleState_Payload: Z = -20

    val Docked_Service_Access_Lifecycle_SupervisorLifecycleResult_Payload: Z = -19

    val Docked_Service_Access_Lifecycle_SupervisorMovementDirective_Payload: Z = -18

    val Docked_Service_Access_Lifecycle_SupervisorServiceAccess_Payload: Z = -17

    val Docked_Service_Access_Lifecycle_SupervisorPilotLifecycleReport_Payload: Z = -16

    val Docked_Service_Access_Lifecycle_SupervisorStationAccessReport_Payload: Z = -15

    val Docked_Service_Access_Lifecycle_SupervisorControlProposal: Z = -14

    val Docked_Service_Access_Lifecycle_SupervisorControlProposal_Payload: Z = -13

    val Docked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot: Z = -12

    val Docked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot_Payload: Z = -11

    val Docked_Service_Access_Lifecycle_SupervisorGatedControl: Z = -10

    val Docked_Service_Access_Lifecycle_SupervisorGatedControl_Payload: Z = -9

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

    val Docked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_P: Z = 8

    val Docked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PS: Z = 9

    val Docked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_P: Z = 10

    val Docked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PS: Z = 11

    val Docked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_P: Z = 12

    val Docked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PS: Z = 13

    val Docked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_P: Z = 14

    val Docked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PS: Z = 15

    val Docked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_P: Z = 16

    val Docked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PS: Z = 17

    val Docked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_P: Z = 18

    val Docked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PS: Z = 19

    val Docked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_P: Z = 20

    val Docked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PS: Z = 21

    val Docked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_P: Z = 22

    val Docked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PS: Z = 23

    val Docked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P: Z = 24

    val Docked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS: Z = 25

    val Docked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P: Z = 26

    val Docked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS: Z = 27

    val Docked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_P: Z = 28

    val Docked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_PS: Z = 29

    val Docked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_P: Z = 30

    val Docked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_PS: Z = 31

    val Docked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_P: Z = 32

    val Docked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PS: Z = 33

    val Docked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_P: Z = 34

    val Docked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PS: Z = 35

    val Docked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_P: Z = 36

    val Docked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PS: Z = 37

    val Docked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_P: Z = 38

    val Docked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PS: Z = 39

    val utilEmptyContainer: Z = 40

    val _artEmpty: Z = 41

  }

  object Writer {

    @record class Default(val writer: MessagePack.Writer.Impl) extends Writer

  }

  @msig trait Writer {

    def writer: MessagePack.Writer

    def writeDocked_Service_Access_Lifecycle_SupervisorPilotIntentType(o: Docked_Service_Access_Lifecycle_Supervisor.PilotIntent.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorPilotIntent_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.PilotIntent_Payload): Unit = {
      writer.writeZ(Constants.Docked_Service_Access_Lifecycle_SupervisorPilotIntent_Payload)
      writeDocked_Service_Access_Lifecycle_SupervisorPilotIntentType(o.value)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorQualifiedIntentType(o: Docked_Service_Access_Lifecycle_Supervisor.QualifiedIntent.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorQualifiedIntent_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.QualifiedIntent_Payload): Unit = {
      writer.writeZ(Constants.Docked_Service_Access_Lifecycle_SupervisorQualifiedIntent_Payload)
      writeDocked_Service_Access_Lifecycle_SupervisorQualifiedIntentType(o.value)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorBerthObservationType(o: Docked_Service_Access_Lifecycle_Supervisor.BerthObservation.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorBerthObservation_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.BerthObservation_Payload): Unit = {
      writer.writeZ(Constants.Docked_Service_Access_Lifecycle_SupervisorBerthObservation_Payload)
      writeDocked_Service_Access_Lifecycle_SupervisorBerthObservationType(o.value)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorShipConditionType(o: Docked_Service_Access_Lifecycle_Supervisor.ShipCondition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorShipCondition_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.ShipCondition_Payload): Unit = {
      writer.writeZ(Constants.Docked_Service_Access_Lifecycle_SupervisorShipCondition_Payload)
      writeDocked_Service_Access_Lifecycle_SupervisorShipConditionType(o.value)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorDockReadinessType(o: Docked_Service_Access_Lifecycle_Supervisor.DockReadiness.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorDockReadiness_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.DockReadiness_Payload): Unit = {
      writer.writeZ(Constants.Docked_Service_Access_Lifecycle_SupervisorDockReadiness_Payload)
      writeDocked_Service_Access_Lifecycle_SupervisorDockReadinessType(o.value)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorServiceSignalType(o: Docked_Service_Access_Lifecycle_Supervisor.ServiceSignal.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorServiceSignal_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.ServiceSignal_Payload): Unit = {
      writer.writeZ(Constants.Docked_Service_Access_Lifecycle_SupervisorServiceSignal_Payload)
      writeDocked_Service_Access_Lifecycle_SupervisorServiceSignalType(o.value)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorServiceInterlockType(o: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlock.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorServiceInterlock_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlock_Payload): Unit = {
      writer.writeZ(Constants.Docked_Service_Access_Lifecycle_SupervisorServiceInterlock_Payload)
      writeDocked_Service_Access_Lifecycle_SupervisorServiceInterlockType(o.value)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorLifecycleStateType(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorLifecycleState_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleState_Payload): Unit = {
      writer.writeZ(Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleState_Payload)
      writeDocked_Service_Access_Lifecycle_SupervisorLifecycleStateType(o.value)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorOperationalAssessmentType(o: Docked_Service_Access_Lifecycle_Supervisor.OperationalAssessment.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorOperationalAssessment_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.OperationalAssessment_Payload): Unit = {
      writer.writeZ(Constants.Docked_Service_Access_Lifecycle_SupervisorOperationalAssessment_Payload)
      writeDocked_Service_Access_Lifecycle_SupervisorOperationalAssessmentType(o.value)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorAdmittedDirectiveType(o: Docked_Service_Access_Lifecycle_Supervisor.AdmittedDirective.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorAdmittedDirective_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.AdmittedDirective_Payload): Unit = {
      writer.writeZ(Constants.Docked_Service_Access_Lifecycle_SupervisorAdmittedDirective_Payload)
      writeDocked_Service_Access_Lifecycle_SupervisorAdmittedDirectiveType(o.value)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorMovementProposalType(o: Docked_Service_Access_Lifecycle_Supervisor.MovementProposal.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorMovementProposal_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.MovementProposal_Payload): Unit = {
      writer.writeZ(Constants.Docked_Service_Access_Lifecycle_SupervisorMovementProposal_Payload)
      writeDocked_Service_Access_Lifecycle_SupervisorMovementProposalType(o.value)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorAccessProposalType(o: Docked_Service_Access_Lifecycle_Supervisor.AccessProposal.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorAccessProposal_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.AccessProposal_Payload): Unit = {
      writer.writeZ(Constants.Docked_Service_Access_Lifecycle_SupervisorAccessProposal_Payload)
      writeDocked_Service_Access_Lifecycle_SupervisorAccessProposalType(o.value)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorSnapshotLifecycleStateType(o: Docked_Service_Access_Lifecycle_Supervisor.SnapshotLifecycleState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorSnapshotLifecycleState_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.SnapshotLifecycleState_Payload): Unit = {
      writer.writeZ(Constants.Docked_Service_Access_Lifecycle_SupervisorSnapshotLifecycleState_Payload)
      writeDocked_Service_Access_Lifecycle_SupervisorSnapshotLifecycleStateType(o.value)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorLifecycleResultType(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleResult.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorLifecycleResult_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleResult_Payload): Unit = {
      writer.writeZ(Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleResult_Payload)
      writeDocked_Service_Access_Lifecycle_SupervisorLifecycleResultType(o.value)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorMovementDirectiveType(o: Docked_Service_Access_Lifecycle_Supervisor.MovementDirective.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorMovementDirective_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.MovementDirective_Payload): Unit = {
      writer.writeZ(Constants.Docked_Service_Access_Lifecycle_SupervisorMovementDirective_Payload)
      writeDocked_Service_Access_Lifecycle_SupervisorMovementDirectiveType(o.value)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorServiceAccessType(o: Docked_Service_Access_Lifecycle_Supervisor.ServiceAccess.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorServiceAccess_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.ServiceAccess_Payload): Unit = {
      writer.writeZ(Constants.Docked_Service_Access_Lifecycle_SupervisorServiceAccess_Payload)
      writeDocked_Service_Access_Lifecycle_SupervisorServiceAccessType(o.value)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorPilotLifecycleReportType(o: Docked_Service_Access_Lifecycle_Supervisor.PilotLifecycleReport.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorPilotLifecycleReport_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.PilotLifecycleReport_Payload): Unit = {
      writer.writeZ(Constants.Docked_Service_Access_Lifecycle_SupervisorPilotLifecycleReport_Payload)
      writeDocked_Service_Access_Lifecycle_SupervisorPilotLifecycleReportType(o.value)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorStationAccessReportType(o: Docked_Service_Access_Lifecycle_Supervisor.StationAccessReport.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorStationAccessReport_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.StationAccessReport_Payload): Unit = {
      writer.writeZ(Constants.Docked_Service_Access_Lifecycle_SupervisorStationAccessReport_Payload)
      writeDocked_Service_Access_Lifecycle_SupervisorStationAccessReportType(o.value)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorControlProposal(o: Docked_Service_Access_Lifecycle_Supervisor.ControlProposal): Unit = {
      writer.writeZ(Constants.Docked_Service_Access_Lifecycle_SupervisorControlProposal)
      writeDocked_Service_Access_Lifecycle_SupervisorMovementProposalType(o.movement)
      writeDocked_Service_Access_Lifecycle_SupervisorAccessProposalType(o.access)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorControlProposal_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.ControlProposal_Payload): Unit = {
      writer.writeZ(Constants.Docked_Service_Access_Lifecycle_SupervisorControlProposal_Payload)
      writeDocked_Service_Access_Lifecycle_SupervisorControlProposal(o.value)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleSnapshot): Unit = {
      writer.writeZ(Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot)
      writeDocked_Service_Access_Lifecycle_SupervisorSnapshotLifecycleStateType(o.next_state)
      writeDocked_Service_Access_Lifecycle_SupervisorLifecycleResultType(o.result)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleSnapshot_Payload): Unit = {
      writer.writeZ(Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot_Payload)
      writeDocked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot(o.value)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorGatedControl(o: Docked_Service_Access_Lifecycle_Supervisor.GatedControl): Unit = {
      writer.writeZ(Constants.Docked_Service_Access_Lifecycle_SupervisorGatedControl)
      writeDocked_Service_Access_Lifecycle_SupervisorMovementDirectiveType(o.movement)
      writeDocked_Service_Access_Lifecycle_SupervisorServiceAccessType(o.access)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorGatedControl_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.GatedControl_Payload): Unit = {
      writer.writeZ(Constants.Docked_Service_Access_Lifecycle_SupervisorGatedControl_Payload)
      writeDocked_Service_Access_Lifecycle_SupervisorGatedControl(o.value)
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

    def writeDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container(o: Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container): Unit = {
      o match {
        case o: Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container_P => writeDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PS => writeDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PS(o)
      }
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_P(o: Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Docked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_P)
      writeDocked_Service_Access_Lifecycle_SupervisorPilotIntentType(o.api_pilotIntent)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PS(o: Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Docked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PS)
      writeDocked_Service_Access_Lifecycle_SupervisorPilotIntentType(o.api_pilotIntent)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container(o: Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container): Unit = {
      o match {
        case o: Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container_P => writeDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PS => writeDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PS(o)
      }
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_P(o: Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Docked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_P)
      writeDocked_Service_Access_Lifecycle_SupervisorQualifiedIntentType(o.api_qualifiedIntent)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PS(o: Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Docked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PS)
      writeDocked_Service_Access_Lifecycle_SupervisorQualifiedIntentType(o.api_qualifiedIntent)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container(o: Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container): Unit = {
      o match {
        case o: Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_P => writeDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PS => writeDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PS(o)
      }
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_P(o: Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Docked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_P)
      writeDocked_Service_Access_Lifecycle_SupervisorBerthObservationType(o.api_berthObservation)
      writeDocked_Service_Access_Lifecycle_SupervisorShipConditionType(o.api_shipCondition)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PS(o: Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Docked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PS)
      writeDocked_Service_Access_Lifecycle_SupervisorBerthObservationType(o.api_berthObservation)
      writeDocked_Service_Access_Lifecycle_SupervisorShipConditionType(o.api_shipCondition)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container(o: Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container): Unit = {
      o match {
        case o: Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_P => writeDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PS => writeDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PS(o)
      }
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_P(o: Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Docked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_P)
      writeDocked_Service_Access_Lifecycle_SupervisorDockReadinessType(o.api_gateReadiness)
      writeDocked_Service_Access_Lifecycle_SupervisorDockReadinessType(o.api_monitorReadiness)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PS(o: Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Docked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PS)
      writeDocked_Service_Access_Lifecycle_SupervisorDockReadinessType(o.api_gateReadiness)
      writeDocked_Service_Access_Lifecycle_SupervisorDockReadinessType(o.api_monitorReadiness)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container(o: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container): Unit = {
      o match {
        case o: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_P => writeDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PS => writeDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PS(o)
      }
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_P(o: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Docked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_P)
      writeDocked_Service_Access_Lifecycle_SupervisorServiceSignalType(o.api_repairSignal)
      writeDocked_Service_Access_Lifecycle_SupervisorServiceSignalType(o.api_resupplySignal)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PS(o: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Docked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PS)
      writeDocked_Service_Access_Lifecycle_SupervisorServiceSignalType(o.api_repairSignal)
      writeDocked_Service_Access_Lifecycle_SupervisorServiceSignalType(o.api_resupplySignal)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container(o: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container): Unit = {
      o match {
        case o: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_P => writeDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PS => writeDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PS(o)
      }
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_P(o: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Docked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_P)
      writeDocked_Service_Access_Lifecycle_SupervisorServiceInterlockType(o.api_gateInterlock)
      writeDocked_Service_Access_Lifecycle_SupervisorServiceInterlockType(o.api_monitorInterlock)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PS(o: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Docked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PS)
      writeDocked_Service_Access_Lifecycle_SupervisorServiceInterlockType(o.api_gateInterlock)
      writeDocked_Service_Access_Lifecycle_SupervisorServiceInterlockType(o.api_monitorInterlock)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container): Unit = {
      o match {
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_P => writeDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PS => writeDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PS(o)
      }
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_P(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_P)
      writeDocked_Service_Access_Lifecycle_SupervisorDockReadinessType(o.api_dockReadiness)
      writeDocked_Service_Access_Lifecycle_SupervisorLifecycleStateType(o.api_lifecyclePrestate)
      writeDocked_Service_Access_Lifecycle_SupervisorServiceInterlockType(o.api_serviceInterlock)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PS(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PS)
      writeDocked_Service_Access_Lifecycle_SupervisorDockReadinessType(o.api_dockReadiness)
      writeDocked_Service_Access_Lifecycle_SupervisorLifecycleStateType(o.api_lifecyclePrestate)
      writeDocked_Service_Access_Lifecycle_SupervisorServiceInterlockType(o.api_serviceInterlock)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container): Unit = {
      o match {
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_P => writeDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PS => writeDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PS(o)
      }
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_P(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_P)
      writeDocked_Service_Access_Lifecycle_SupervisorOperationalAssessmentType(o.api_operationalAssessment)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PS(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PS)
      writeDocked_Service_Access_Lifecycle_SupervisorOperationalAssessmentType(o.api_operationalAssessment)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container(o: Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container): Unit = {
      o match {
        case o: Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P => writeDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS => writeDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS(o)
      }
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P(o: Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Docked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P)
      writeDocked_Service_Access_Lifecycle_SupervisorLifecycleStateType(o.api_lifecyclePrestate)
      writeDocked_Service_Access_Lifecycle_SupervisorOperationalAssessmentType(o.api_operationalAssessment)
      writeDocked_Service_Access_Lifecycle_SupervisorQualifiedIntentType(o.api_qualifiedIntent)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS(o: Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Docked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS)
      writeDocked_Service_Access_Lifecycle_SupervisorLifecycleStateType(o.api_lifecyclePrestate)
      writeDocked_Service_Access_Lifecycle_SupervisorOperationalAssessmentType(o.api_operationalAssessment)
      writeDocked_Service_Access_Lifecycle_SupervisorQualifiedIntentType(o.api_qualifiedIntent)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container(o: Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container): Unit = {
      o match {
        case o: Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P => writeDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS => writeDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS(o)
      }
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P(o: Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Docked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P)
      writeDocked_Service_Access_Lifecycle_SupervisorAdmittedDirectiveType(o.api_admittedDirective)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS(o: Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Docked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS)
      writeDocked_Service_Access_Lifecycle_SupervisorAdmittedDirectiveType(o.api_admittedDirective)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container): Unit = {
      o match {
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container_P => writeDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container_PS => writeDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_PS(o)
      }
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_P(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_P)
      writeDocked_Service_Access_Lifecycle_SupervisorAdmittedDirectiveType(o.api_admittedDirective)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_PS(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_PS)
      writeDocked_Service_Access_Lifecycle_SupervisorAdmittedDirectiveType(o.api_admittedDirective)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container): Unit = {
      o match {
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container_P => writeDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container_PS => writeDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_PS(o)
      }
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_P(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_P)
      writeDocked_Service_Access_Lifecycle_SupervisorLifecycleStateType(o.api_arbiterPrestate)
      writeDocked_Service_Access_Lifecycle_SupervisorControlProposal(o.api_controlProposal)
      writeDocked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot(o.api_lifecycleSnapshot)
      writeDocked_Service_Access_Lifecycle_SupervisorLifecycleStateType(o.api_monitorPrestate)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_PS(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_PS)
      writeDocked_Service_Access_Lifecycle_SupervisorLifecycleStateType(o.api_arbiterPrestate)
      writeDocked_Service_Access_Lifecycle_SupervisorControlProposal(o.api_controlProposal)
      writeDocked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot(o.api_lifecycleSnapshot)
      writeDocked_Service_Access_Lifecycle_SupervisorLifecycleStateType(o.api_monitorPrestate)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container(o: Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container): Unit = {
      o match {
        case o: Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_P => writeDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PS => writeDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PS(o)
      }
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_P(o: Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Docked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_P)
      writeDocked_Service_Access_Lifecycle_SupervisorControlProposal(o.api_controlProposal)
      writeDocked_Service_Access_Lifecycle_SupervisorDockReadinessType(o.api_dockReadiness)
      writeDocked_Service_Access_Lifecycle_SupervisorServiceInterlockType(o.api_serviceInterlock)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PS(o: Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Docked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PS)
      writeDocked_Service_Access_Lifecycle_SupervisorControlProposal(o.api_controlProposal)
      writeDocked_Service_Access_Lifecycle_SupervisorDockReadinessType(o.api_dockReadiness)
      writeDocked_Service_Access_Lifecycle_SupervisorServiceInterlockType(o.api_serviceInterlock)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container(o: Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container): Unit = {
      o match {
        case o: Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_P => writeDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PS => writeDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PS(o)
      }
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_P(o: Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Docked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_P)
      writeDocked_Service_Access_Lifecycle_SupervisorGatedControl(o.api_gatedControl)
      writeDocked_Service_Access_Lifecycle_SupervisorMovementDirectiveType(o.api_movementDirective)
      writeDocked_Service_Access_Lifecycle_SupervisorServiceAccessType(o.api_serviceAccess)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PS(o: Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Docked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PS)
      writeDocked_Service_Access_Lifecycle_SupervisorGatedControl(o.api_gatedControl)
      writeDocked_Service_Access_Lifecycle_SupervisorMovementDirectiveType(o.api_movementDirective)
      writeDocked_Service_Access_Lifecycle_SupervisorServiceAccessType(o.api_serviceAccess)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container): Unit = {
      o match {
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_P => writeDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PS => writeDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PS(o)
      }
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_P(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_P)
      writeDocked_Service_Access_Lifecycle_SupervisorGatedControl(o.api_gatedControl)
      writeDocked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot(o.api_lifecycleSnapshot)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PS(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PS)
      writeDocked_Service_Access_Lifecycle_SupervisorGatedControl(o.api_gatedControl)
      writeDocked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot(o.api_lifecycleSnapshot)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container): Unit = {
      o match {
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_P => writeDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PS => writeDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PS(o)
      }
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_P(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_P)
      writeDocked_Service_Access_Lifecycle_SupervisorPilotLifecycleReportType(o.api_pilotReport)
      writeDocked_Service_Access_Lifecycle_SupervisorStationAccessReportType(o.api_stationReport)
    }

    def writeDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PS(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PS)
      writeDocked_Service_Access_Lifecycle_SupervisorPilotLifecycleReportType(o.api_pilotReport)
      writeDocked_Service_Access_Lifecycle_SupervisorStationAccessReportType(o.api_stationReport)
    }

    def writeruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeutilContainer(o: util.Container): Unit = {
      o match {
        case o: util.EmptyContainer => writeutilEmptyContainer(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container_P => writeDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P => writeDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PS => writeDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PS(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS => writeDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container_P => writeDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PS => writeDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PS(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P => writeDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS => writeDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_P => writeDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PS => writeDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PS(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_P => writeDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PS => writeDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PS(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container_P => writeDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container_PS => writeDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_PS(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container_P => writeDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container_PS => writeDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_PS(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_P => writeDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PS => writeDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PS(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_P => writeDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PS => writeDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PS(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_P => writeDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PS => writeDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PS(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_P => writeDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PS => writeDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PS(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_P => writeDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_P => writeDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PS => writeDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PS(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PS => writeDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PS(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_P => writeDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_P => writeDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PS => writeDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PS(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PS => writeDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PS(o)
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
        case o: Docked_Service_Access_Lifecycle_Supervisor.PilotIntent_Payload => writeDocked_Service_Access_Lifecycle_SupervisorPilotIntent_Payload(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.GatedControl_Payload => writeDocked_Service_Access_Lifecycle_SupervisorGatedControl_Payload(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.ServiceAccess_Payload => writeDocked_Service_Access_Lifecycle_SupervisorServiceAccess_Payload(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.ServiceSignal_Payload => writeDocked_Service_Access_Lifecycle_SupervisorServiceSignal_Payload(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.ShipCondition_Payload => writeDocked_Service_Access_Lifecycle_SupervisorShipCondition_Payload(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.DockReadiness_Payload => writeDocked_Service_Access_Lifecycle_SupervisorDockReadiness_Payload(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.AccessProposal_Payload => writeDocked_Service_Access_Lifecycle_SupervisorAccessProposal_Payload(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleState_Payload => writeDocked_Service_Access_Lifecycle_SupervisorLifecycleState_Payload(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.QualifiedIntent_Payload => writeDocked_Service_Access_Lifecycle_SupervisorQualifiedIntent_Payload(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleResult_Payload => writeDocked_Service_Access_Lifecycle_SupervisorLifecycleResult_Payload(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.ControlProposal_Payload => writeDocked_Service_Access_Lifecycle_SupervisorControlProposal_Payload(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.MovementProposal_Payload => writeDocked_Service_Access_Lifecycle_SupervisorMovementProposal_Payload(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.BerthObservation_Payload => writeDocked_Service_Access_Lifecycle_SupervisorBerthObservation_Payload(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlock_Payload => writeDocked_Service_Access_Lifecycle_SupervisorServiceInterlock_Payload(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.MovementDirective_Payload => writeDocked_Service_Access_Lifecycle_SupervisorMovementDirective_Payload(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.AdmittedDirective_Payload => writeDocked_Service_Access_Lifecycle_SupervisorAdmittedDirective_Payload(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleSnapshot_Payload => writeDocked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot_Payload(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.StationAccessReport_Payload => writeDocked_Service_Access_Lifecycle_SupervisorStationAccessReport_Payload(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.PilotLifecycleReport_Payload => writeDocked_Service_Access_Lifecycle_SupervisorPilotLifecycleReport_Payload(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.OperationalAssessment_Payload => writeDocked_Service_Access_Lifecycle_SupervisorOperationalAssessment_Payload(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.SnapshotLifecycleState_Payload => writeDocked_Service_Access_Lifecycle_SupervisorSnapshotLifecycleState_Payload(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container_P => writeDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P => writeDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PS => writeDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PS(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS => writeDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container_P => writeDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PS => writeDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PS(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P => writeDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS => writeDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_P => writeDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PS => writeDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PS(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_P => writeDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PS => writeDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PS(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container_P => writeDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container_PS => writeDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_PS(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container_P => writeDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container_PS => writeDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_PS(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_P => writeDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PS => writeDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PS(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_P => writeDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PS => writeDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PS(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_P => writeDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PS => writeDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PS(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_P => writeDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PS => writeDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PS(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_P => writeDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_P => writeDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PS => writeDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PS(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PS => writeDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PS(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_P => writeDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_P => writeDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PS => writeDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PS(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PS => writeDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PS(o)
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

    def readDocked_Service_Access_Lifecycle_SupervisorPilotIntentType(): Docked_Service_Access_Lifecycle_Supervisor.PilotIntent.Type = {
      val r = reader.readZ()
      return Docked_Service_Access_Lifecycle_Supervisor.PilotIntent.byOrdinal(r).get
    }

    def readDocked_Service_Access_Lifecycle_SupervisorPilotIntent_Payload(): Docked_Service_Access_Lifecycle_Supervisor.PilotIntent_Payload = {
      val r = readDocked_Service_Access_Lifecycle_SupervisorPilotIntent_PayloadT(F)
      return r
    }

    def readDocked_Service_Access_Lifecycle_SupervisorPilotIntent_PayloadT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.PilotIntent_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docked_Service_Access_Lifecycle_SupervisorPilotIntent_Payload)
      }
      val value = readDocked_Service_Access_Lifecycle_SupervisorPilotIntentType()
      return Docked_Service_Access_Lifecycle_Supervisor.PilotIntent_Payload(value)
    }

    def readDocked_Service_Access_Lifecycle_SupervisorQualifiedIntentType(): Docked_Service_Access_Lifecycle_Supervisor.QualifiedIntent.Type = {
      val r = reader.readZ()
      return Docked_Service_Access_Lifecycle_Supervisor.QualifiedIntent.byOrdinal(r).get
    }

    def readDocked_Service_Access_Lifecycle_SupervisorQualifiedIntent_Payload(): Docked_Service_Access_Lifecycle_Supervisor.QualifiedIntent_Payload = {
      val r = readDocked_Service_Access_Lifecycle_SupervisorQualifiedIntent_PayloadT(F)
      return r
    }

    def readDocked_Service_Access_Lifecycle_SupervisorQualifiedIntent_PayloadT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.QualifiedIntent_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docked_Service_Access_Lifecycle_SupervisorQualifiedIntent_Payload)
      }
      val value = readDocked_Service_Access_Lifecycle_SupervisorQualifiedIntentType()
      return Docked_Service_Access_Lifecycle_Supervisor.QualifiedIntent_Payload(value)
    }

    def readDocked_Service_Access_Lifecycle_SupervisorBerthObservationType(): Docked_Service_Access_Lifecycle_Supervisor.BerthObservation.Type = {
      val r = reader.readZ()
      return Docked_Service_Access_Lifecycle_Supervisor.BerthObservation.byOrdinal(r).get
    }

    def readDocked_Service_Access_Lifecycle_SupervisorBerthObservation_Payload(): Docked_Service_Access_Lifecycle_Supervisor.BerthObservation_Payload = {
      val r = readDocked_Service_Access_Lifecycle_SupervisorBerthObservation_PayloadT(F)
      return r
    }

    def readDocked_Service_Access_Lifecycle_SupervisorBerthObservation_PayloadT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.BerthObservation_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docked_Service_Access_Lifecycle_SupervisorBerthObservation_Payload)
      }
      val value = readDocked_Service_Access_Lifecycle_SupervisorBerthObservationType()
      return Docked_Service_Access_Lifecycle_Supervisor.BerthObservation_Payload(value)
    }

    def readDocked_Service_Access_Lifecycle_SupervisorShipConditionType(): Docked_Service_Access_Lifecycle_Supervisor.ShipCondition.Type = {
      val r = reader.readZ()
      return Docked_Service_Access_Lifecycle_Supervisor.ShipCondition.byOrdinal(r).get
    }

    def readDocked_Service_Access_Lifecycle_SupervisorShipCondition_Payload(): Docked_Service_Access_Lifecycle_Supervisor.ShipCondition_Payload = {
      val r = readDocked_Service_Access_Lifecycle_SupervisorShipCondition_PayloadT(F)
      return r
    }

    def readDocked_Service_Access_Lifecycle_SupervisorShipCondition_PayloadT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.ShipCondition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docked_Service_Access_Lifecycle_SupervisorShipCondition_Payload)
      }
      val value = readDocked_Service_Access_Lifecycle_SupervisorShipConditionType()
      return Docked_Service_Access_Lifecycle_Supervisor.ShipCondition_Payload(value)
    }

    def readDocked_Service_Access_Lifecycle_SupervisorDockReadinessType(): Docked_Service_Access_Lifecycle_Supervisor.DockReadiness.Type = {
      val r = reader.readZ()
      return Docked_Service_Access_Lifecycle_Supervisor.DockReadiness.byOrdinal(r).get
    }

    def readDocked_Service_Access_Lifecycle_SupervisorDockReadiness_Payload(): Docked_Service_Access_Lifecycle_Supervisor.DockReadiness_Payload = {
      val r = readDocked_Service_Access_Lifecycle_SupervisorDockReadiness_PayloadT(F)
      return r
    }

    def readDocked_Service_Access_Lifecycle_SupervisorDockReadiness_PayloadT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.DockReadiness_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docked_Service_Access_Lifecycle_SupervisorDockReadiness_Payload)
      }
      val value = readDocked_Service_Access_Lifecycle_SupervisorDockReadinessType()
      return Docked_Service_Access_Lifecycle_Supervisor.DockReadiness_Payload(value)
    }

    def readDocked_Service_Access_Lifecycle_SupervisorServiceSignalType(): Docked_Service_Access_Lifecycle_Supervisor.ServiceSignal.Type = {
      val r = reader.readZ()
      return Docked_Service_Access_Lifecycle_Supervisor.ServiceSignal.byOrdinal(r).get
    }

    def readDocked_Service_Access_Lifecycle_SupervisorServiceSignal_Payload(): Docked_Service_Access_Lifecycle_Supervisor.ServiceSignal_Payload = {
      val r = readDocked_Service_Access_Lifecycle_SupervisorServiceSignal_PayloadT(F)
      return r
    }

    def readDocked_Service_Access_Lifecycle_SupervisorServiceSignal_PayloadT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.ServiceSignal_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docked_Service_Access_Lifecycle_SupervisorServiceSignal_Payload)
      }
      val value = readDocked_Service_Access_Lifecycle_SupervisorServiceSignalType()
      return Docked_Service_Access_Lifecycle_Supervisor.ServiceSignal_Payload(value)
    }

    def readDocked_Service_Access_Lifecycle_SupervisorServiceInterlockType(): Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlock.Type = {
      val r = reader.readZ()
      return Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlock.byOrdinal(r).get
    }

    def readDocked_Service_Access_Lifecycle_SupervisorServiceInterlock_Payload(): Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlock_Payload = {
      val r = readDocked_Service_Access_Lifecycle_SupervisorServiceInterlock_PayloadT(F)
      return r
    }

    def readDocked_Service_Access_Lifecycle_SupervisorServiceInterlock_PayloadT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlock_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docked_Service_Access_Lifecycle_SupervisorServiceInterlock_Payload)
      }
      val value = readDocked_Service_Access_Lifecycle_SupervisorServiceInterlockType()
      return Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlock_Payload(value)
    }

    def readDocked_Service_Access_Lifecycle_SupervisorLifecycleStateType(): Docked_Service_Access_Lifecycle_Supervisor.LifecycleState.Type = {
      val r = reader.readZ()
      return Docked_Service_Access_Lifecycle_Supervisor.LifecycleState.byOrdinal(r).get
    }

    def readDocked_Service_Access_Lifecycle_SupervisorLifecycleState_Payload(): Docked_Service_Access_Lifecycle_Supervisor.LifecycleState_Payload = {
      val r = readDocked_Service_Access_Lifecycle_SupervisorLifecycleState_PayloadT(F)
      return r
    }

    def readDocked_Service_Access_Lifecycle_SupervisorLifecycleState_PayloadT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.LifecycleState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleState_Payload)
      }
      val value = readDocked_Service_Access_Lifecycle_SupervisorLifecycleStateType()
      return Docked_Service_Access_Lifecycle_Supervisor.LifecycleState_Payload(value)
    }

    def readDocked_Service_Access_Lifecycle_SupervisorOperationalAssessmentType(): Docked_Service_Access_Lifecycle_Supervisor.OperationalAssessment.Type = {
      val r = reader.readZ()
      return Docked_Service_Access_Lifecycle_Supervisor.OperationalAssessment.byOrdinal(r).get
    }

    def readDocked_Service_Access_Lifecycle_SupervisorOperationalAssessment_Payload(): Docked_Service_Access_Lifecycle_Supervisor.OperationalAssessment_Payload = {
      val r = readDocked_Service_Access_Lifecycle_SupervisorOperationalAssessment_PayloadT(F)
      return r
    }

    def readDocked_Service_Access_Lifecycle_SupervisorOperationalAssessment_PayloadT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.OperationalAssessment_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docked_Service_Access_Lifecycle_SupervisorOperationalAssessment_Payload)
      }
      val value = readDocked_Service_Access_Lifecycle_SupervisorOperationalAssessmentType()
      return Docked_Service_Access_Lifecycle_Supervisor.OperationalAssessment_Payload(value)
    }

    def readDocked_Service_Access_Lifecycle_SupervisorAdmittedDirectiveType(): Docked_Service_Access_Lifecycle_Supervisor.AdmittedDirective.Type = {
      val r = reader.readZ()
      return Docked_Service_Access_Lifecycle_Supervisor.AdmittedDirective.byOrdinal(r).get
    }

    def readDocked_Service_Access_Lifecycle_SupervisorAdmittedDirective_Payload(): Docked_Service_Access_Lifecycle_Supervisor.AdmittedDirective_Payload = {
      val r = readDocked_Service_Access_Lifecycle_SupervisorAdmittedDirective_PayloadT(F)
      return r
    }

    def readDocked_Service_Access_Lifecycle_SupervisorAdmittedDirective_PayloadT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.AdmittedDirective_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docked_Service_Access_Lifecycle_SupervisorAdmittedDirective_Payload)
      }
      val value = readDocked_Service_Access_Lifecycle_SupervisorAdmittedDirectiveType()
      return Docked_Service_Access_Lifecycle_Supervisor.AdmittedDirective_Payload(value)
    }

    def readDocked_Service_Access_Lifecycle_SupervisorMovementProposalType(): Docked_Service_Access_Lifecycle_Supervisor.MovementProposal.Type = {
      val r = reader.readZ()
      return Docked_Service_Access_Lifecycle_Supervisor.MovementProposal.byOrdinal(r).get
    }

    def readDocked_Service_Access_Lifecycle_SupervisorMovementProposal_Payload(): Docked_Service_Access_Lifecycle_Supervisor.MovementProposal_Payload = {
      val r = readDocked_Service_Access_Lifecycle_SupervisorMovementProposal_PayloadT(F)
      return r
    }

    def readDocked_Service_Access_Lifecycle_SupervisorMovementProposal_PayloadT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.MovementProposal_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docked_Service_Access_Lifecycle_SupervisorMovementProposal_Payload)
      }
      val value = readDocked_Service_Access_Lifecycle_SupervisorMovementProposalType()
      return Docked_Service_Access_Lifecycle_Supervisor.MovementProposal_Payload(value)
    }

    def readDocked_Service_Access_Lifecycle_SupervisorAccessProposalType(): Docked_Service_Access_Lifecycle_Supervisor.AccessProposal.Type = {
      val r = reader.readZ()
      return Docked_Service_Access_Lifecycle_Supervisor.AccessProposal.byOrdinal(r).get
    }

    def readDocked_Service_Access_Lifecycle_SupervisorAccessProposal_Payload(): Docked_Service_Access_Lifecycle_Supervisor.AccessProposal_Payload = {
      val r = readDocked_Service_Access_Lifecycle_SupervisorAccessProposal_PayloadT(F)
      return r
    }

    def readDocked_Service_Access_Lifecycle_SupervisorAccessProposal_PayloadT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.AccessProposal_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docked_Service_Access_Lifecycle_SupervisorAccessProposal_Payload)
      }
      val value = readDocked_Service_Access_Lifecycle_SupervisorAccessProposalType()
      return Docked_Service_Access_Lifecycle_Supervisor.AccessProposal_Payload(value)
    }

    def readDocked_Service_Access_Lifecycle_SupervisorSnapshotLifecycleStateType(): Docked_Service_Access_Lifecycle_Supervisor.SnapshotLifecycleState.Type = {
      val r = reader.readZ()
      return Docked_Service_Access_Lifecycle_Supervisor.SnapshotLifecycleState.byOrdinal(r).get
    }

    def readDocked_Service_Access_Lifecycle_SupervisorSnapshotLifecycleState_Payload(): Docked_Service_Access_Lifecycle_Supervisor.SnapshotLifecycleState_Payload = {
      val r = readDocked_Service_Access_Lifecycle_SupervisorSnapshotLifecycleState_PayloadT(F)
      return r
    }

    def readDocked_Service_Access_Lifecycle_SupervisorSnapshotLifecycleState_PayloadT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.SnapshotLifecycleState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docked_Service_Access_Lifecycle_SupervisorSnapshotLifecycleState_Payload)
      }
      val value = readDocked_Service_Access_Lifecycle_SupervisorSnapshotLifecycleStateType()
      return Docked_Service_Access_Lifecycle_Supervisor.SnapshotLifecycleState_Payload(value)
    }

    def readDocked_Service_Access_Lifecycle_SupervisorLifecycleResultType(): Docked_Service_Access_Lifecycle_Supervisor.LifecycleResult.Type = {
      val r = reader.readZ()
      return Docked_Service_Access_Lifecycle_Supervisor.LifecycleResult.byOrdinal(r).get
    }

    def readDocked_Service_Access_Lifecycle_SupervisorLifecycleResult_Payload(): Docked_Service_Access_Lifecycle_Supervisor.LifecycleResult_Payload = {
      val r = readDocked_Service_Access_Lifecycle_SupervisorLifecycleResult_PayloadT(F)
      return r
    }

    def readDocked_Service_Access_Lifecycle_SupervisorLifecycleResult_PayloadT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.LifecycleResult_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleResult_Payload)
      }
      val value = readDocked_Service_Access_Lifecycle_SupervisorLifecycleResultType()
      return Docked_Service_Access_Lifecycle_Supervisor.LifecycleResult_Payload(value)
    }

    def readDocked_Service_Access_Lifecycle_SupervisorMovementDirectiveType(): Docked_Service_Access_Lifecycle_Supervisor.MovementDirective.Type = {
      val r = reader.readZ()
      return Docked_Service_Access_Lifecycle_Supervisor.MovementDirective.byOrdinal(r).get
    }

    def readDocked_Service_Access_Lifecycle_SupervisorMovementDirective_Payload(): Docked_Service_Access_Lifecycle_Supervisor.MovementDirective_Payload = {
      val r = readDocked_Service_Access_Lifecycle_SupervisorMovementDirective_PayloadT(F)
      return r
    }

    def readDocked_Service_Access_Lifecycle_SupervisorMovementDirective_PayloadT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.MovementDirective_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docked_Service_Access_Lifecycle_SupervisorMovementDirective_Payload)
      }
      val value = readDocked_Service_Access_Lifecycle_SupervisorMovementDirectiveType()
      return Docked_Service_Access_Lifecycle_Supervisor.MovementDirective_Payload(value)
    }

    def readDocked_Service_Access_Lifecycle_SupervisorServiceAccessType(): Docked_Service_Access_Lifecycle_Supervisor.ServiceAccess.Type = {
      val r = reader.readZ()
      return Docked_Service_Access_Lifecycle_Supervisor.ServiceAccess.byOrdinal(r).get
    }

    def readDocked_Service_Access_Lifecycle_SupervisorServiceAccess_Payload(): Docked_Service_Access_Lifecycle_Supervisor.ServiceAccess_Payload = {
      val r = readDocked_Service_Access_Lifecycle_SupervisorServiceAccess_PayloadT(F)
      return r
    }

    def readDocked_Service_Access_Lifecycle_SupervisorServiceAccess_PayloadT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.ServiceAccess_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docked_Service_Access_Lifecycle_SupervisorServiceAccess_Payload)
      }
      val value = readDocked_Service_Access_Lifecycle_SupervisorServiceAccessType()
      return Docked_Service_Access_Lifecycle_Supervisor.ServiceAccess_Payload(value)
    }

    def readDocked_Service_Access_Lifecycle_SupervisorPilotLifecycleReportType(): Docked_Service_Access_Lifecycle_Supervisor.PilotLifecycleReport.Type = {
      val r = reader.readZ()
      return Docked_Service_Access_Lifecycle_Supervisor.PilotLifecycleReport.byOrdinal(r).get
    }

    def readDocked_Service_Access_Lifecycle_SupervisorPilotLifecycleReport_Payload(): Docked_Service_Access_Lifecycle_Supervisor.PilotLifecycleReport_Payload = {
      val r = readDocked_Service_Access_Lifecycle_SupervisorPilotLifecycleReport_PayloadT(F)
      return r
    }

    def readDocked_Service_Access_Lifecycle_SupervisorPilotLifecycleReport_PayloadT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.PilotLifecycleReport_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docked_Service_Access_Lifecycle_SupervisorPilotLifecycleReport_Payload)
      }
      val value = readDocked_Service_Access_Lifecycle_SupervisorPilotLifecycleReportType()
      return Docked_Service_Access_Lifecycle_Supervisor.PilotLifecycleReport_Payload(value)
    }

    def readDocked_Service_Access_Lifecycle_SupervisorStationAccessReportType(): Docked_Service_Access_Lifecycle_Supervisor.StationAccessReport.Type = {
      val r = reader.readZ()
      return Docked_Service_Access_Lifecycle_Supervisor.StationAccessReport.byOrdinal(r).get
    }

    def readDocked_Service_Access_Lifecycle_SupervisorStationAccessReport_Payload(): Docked_Service_Access_Lifecycle_Supervisor.StationAccessReport_Payload = {
      val r = readDocked_Service_Access_Lifecycle_SupervisorStationAccessReport_PayloadT(F)
      return r
    }

    def readDocked_Service_Access_Lifecycle_SupervisorStationAccessReport_PayloadT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.StationAccessReport_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docked_Service_Access_Lifecycle_SupervisorStationAccessReport_Payload)
      }
      val value = readDocked_Service_Access_Lifecycle_SupervisorStationAccessReportType()
      return Docked_Service_Access_Lifecycle_Supervisor.StationAccessReport_Payload(value)
    }

    def readDocked_Service_Access_Lifecycle_SupervisorControlProposal(): Docked_Service_Access_Lifecycle_Supervisor.ControlProposal = {
      val r = readDocked_Service_Access_Lifecycle_SupervisorControlProposalT(F)
      return r
    }

    def readDocked_Service_Access_Lifecycle_SupervisorControlProposalT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.ControlProposal = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docked_Service_Access_Lifecycle_SupervisorControlProposal)
      }
      val movement = readDocked_Service_Access_Lifecycle_SupervisorMovementProposalType()
      val access = readDocked_Service_Access_Lifecycle_SupervisorAccessProposalType()
      return Docked_Service_Access_Lifecycle_Supervisor.ControlProposal(movement, access)
    }

    def readDocked_Service_Access_Lifecycle_SupervisorControlProposal_Payload(): Docked_Service_Access_Lifecycle_Supervisor.ControlProposal_Payload = {
      val r = readDocked_Service_Access_Lifecycle_SupervisorControlProposal_PayloadT(F)
      return r
    }

    def readDocked_Service_Access_Lifecycle_SupervisorControlProposal_PayloadT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.ControlProposal_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docked_Service_Access_Lifecycle_SupervisorControlProposal_Payload)
      }
      val value = readDocked_Service_Access_Lifecycle_SupervisorControlProposal()
      return Docked_Service_Access_Lifecycle_Supervisor.ControlProposal_Payload(value)
    }

    def readDocked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot(): Docked_Service_Access_Lifecycle_Supervisor.LifecycleSnapshot = {
      val r = readDocked_Service_Access_Lifecycle_SupervisorLifecycleSnapshotT(F)
      return r
    }

    def readDocked_Service_Access_Lifecycle_SupervisorLifecycleSnapshotT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.LifecycleSnapshot = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot)
      }
      val next_state = readDocked_Service_Access_Lifecycle_SupervisorSnapshotLifecycleStateType()
      val result = readDocked_Service_Access_Lifecycle_SupervisorLifecycleResultType()
      return Docked_Service_Access_Lifecycle_Supervisor.LifecycleSnapshot(next_state, result)
    }

    def readDocked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot_Payload(): Docked_Service_Access_Lifecycle_Supervisor.LifecycleSnapshot_Payload = {
      val r = readDocked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot_PayloadT(F)
      return r
    }

    def readDocked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot_PayloadT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.LifecycleSnapshot_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot_Payload)
      }
      val value = readDocked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot()
      return Docked_Service_Access_Lifecycle_Supervisor.LifecycleSnapshot_Payload(value)
    }

    def readDocked_Service_Access_Lifecycle_SupervisorGatedControl(): Docked_Service_Access_Lifecycle_Supervisor.GatedControl = {
      val r = readDocked_Service_Access_Lifecycle_SupervisorGatedControlT(F)
      return r
    }

    def readDocked_Service_Access_Lifecycle_SupervisorGatedControlT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.GatedControl = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docked_Service_Access_Lifecycle_SupervisorGatedControl)
      }
      val movement = readDocked_Service_Access_Lifecycle_SupervisorMovementDirectiveType()
      val access = readDocked_Service_Access_Lifecycle_SupervisorServiceAccessType()
      return Docked_Service_Access_Lifecycle_Supervisor.GatedControl(movement, access)
    }

    def readDocked_Service_Access_Lifecycle_SupervisorGatedControl_Payload(): Docked_Service_Access_Lifecycle_Supervisor.GatedControl_Payload = {
      val r = readDocked_Service_Access_Lifecycle_SupervisorGatedControl_PayloadT(F)
      return r
    }

    def readDocked_Service_Access_Lifecycle_SupervisorGatedControl_PayloadT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.GatedControl_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docked_Service_Access_Lifecycle_SupervisorGatedControl_Payload)
      }
      val value = readDocked_Service_Access_Lifecycle_SupervisorGatedControl()
      return Docked_Service_Access_Lifecycle_Supervisor.GatedControl_Payload(value)
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

    def readDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container(): Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Docked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_P => val r = readDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PS => val r = readDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container.")
          val r = readDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PST(T)
          return r
      }
    }

    def readDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_P(): Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container_P = {
      val r = readDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PT(F)
      return r
    }

    def readDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_P)
      }
      val api_pilotIntent = readDocked_Service_Access_Lifecycle_SupervisorPilotIntentType()
      return Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container_P(api_pilotIntent)
    }

    def readDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PS(): Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PS = {
      val r = readDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PST(F)
      return r
    }

    def readDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PST(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PS)
      }
      val api_pilotIntent = readDocked_Service_Access_Lifecycle_SupervisorPilotIntentType()
      return Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PS(api_pilotIntent)
    }

    def readDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container(): Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Docked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_P => val r = readDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PS => val r = readDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container.")
          val r = readDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PST(T)
          return r
      }
    }

    def readDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_P(): Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container_P = {
      val r = readDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PT(F)
      return r
    }

    def readDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_P)
      }
      val api_qualifiedIntent = readDocked_Service_Access_Lifecycle_SupervisorQualifiedIntentType()
      return Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container_P(api_qualifiedIntent)
    }

    def readDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PS(): Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PS = {
      val r = readDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PST(F)
      return r
    }

    def readDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PST(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PS)
      }
      val api_qualifiedIntent = readDocked_Service_Access_Lifecycle_SupervisorQualifiedIntentType()
      return Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PS(api_qualifiedIntent)
    }

    def readDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container(): Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Docked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_P => val r = readDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PS => val r = readDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container.")
          val r = readDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PST(T)
          return r
      }
    }

    def readDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_P(): Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_P = {
      val r = readDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PT(F)
      return r
    }

    def readDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_P)
      }
      val api_berthObservation = readDocked_Service_Access_Lifecycle_SupervisorBerthObservationType()
      val api_shipCondition = readDocked_Service_Access_Lifecycle_SupervisorShipConditionType()
      return Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_P(api_berthObservation, api_shipCondition)
    }

    def readDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PS(): Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PS = {
      val r = readDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PST(F)
      return r
    }

    def readDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PST(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PS)
      }
      val api_berthObservation = readDocked_Service_Access_Lifecycle_SupervisorBerthObservationType()
      val api_shipCondition = readDocked_Service_Access_Lifecycle_SupervisorShipConditionType()
      return Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PS(api_berthObservation, api_shipCondition)
    }

    def readDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container(): Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Docked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_P => val r = readDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PS => val r = readDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container.")
          val r = readDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PST(T)
          return r
      }
    }

    def readDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_P(): Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_P = {
      val r = readDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PT(F)
      return r
    }

    def readDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_P)
      }
      val api_gateReadiness = readDocked_Service_Access_Lifecycle_SupervisorDockReadinessType()
      val api_monitorReadiness = readDocked_Service_Access_Lifecycle_SupervisorDockReadinessType()
      return Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_P(api_gateReadiness, api_monitorReadiness)
    }

    def readDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PS(): Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PS = {
      val r = readDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PST(F)
      return r
    }

    def readDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PST(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PS)
      }
      val api_gateReadiness = readDocked_Service_Access_Lifecycle_SupervisorDockReadinessType()
      val api_monitorReadiness = readDocked_Service_Access_Lifecycle_SupervisorDockReadinessType()
      return Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PS(api_gateReadiness, api_monitorReadiness)
    }

    def readDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container(): Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Docked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_P => val r = readDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PS => val r = readDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container.")
          val r = readDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PST(T)
          return r
      }
    }

    def readDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_P(): Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_P = {
      val r = readDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PT(F)
      return r
    }

    def readDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_P)
      }
      val api_repairSignal = readDocked_Service_Access_Lifecycle_SupervisorServiceSignalType()
      val api_resupplySignal = readDocked_Service_Access_Lifecycle_SupervisorServiceSignalType()
      return Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_P(api_repairSignal, api_resupplySignal)
    }

    def readDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PS(): Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PS = {
      val r = readDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PST(F)
      return r
    }

    def readDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PST(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PS)
      }
      val api_repairSignal = readDocked_Service_Access_Lifecycle_SupervisorServiceSignalType()
      val api_resupplySignal = readDocked_Service_Access_Lifecycle_SupervisorServiceSignalType()
      return Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PS(api_repairSignal, api_resupplySignal)
    }

    def readDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container(): Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Docked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_P => val r = readDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PS => val r = readDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container.")
          val r = readDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PST(T)
          return r
      }
    }

    def readDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_P(): Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_P = {
      val r = readDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PT(F)
      return r
    }

    def readDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_P)
      }
      val api_gateInterlock = readDocked_Service_Access_Lifecycle_SupervisorServiceInterlockType()
      val api_monitorInterlock = readDocked_Service_Access_Lifecycle_SupervisorServiceInterlockType()
      return Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_P(api_gateInterlock, api_monitorInterlock)
    }

    def readDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PS(): Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PS = {
      val r = readDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PST(F)
      return r
    }

    def readDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PST(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PS)
      }
      val api_gateInterlock = readDocked_Service_Access_Lifecycle_SupervisorServiceInterlockType()
      val api_monitorInterlock = readDocked_Service_Access_Lifecycle_SupervisorServiceInterlockType()
      return Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PS(api_gateInterlock, api_monitorInterlock)
    }

    def readDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container(): Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_P => val r = readDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PS => val r = readDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container.")
          val r = readDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PST(T)
          return r
      }
    }

    def readDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_P(): Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_P = {
      val r = readDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PT(F)
      return r
    }

    def readDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_P)
      }
      val api_dockReadiness = readDocked_Service_Access_Lifecycle_SupervisorDockReadinessType()
      val api_lifecyclePrestate = readDocked_Service_Access_Lifecycle_SupervisorLifecycleStateType()
      val api_serviceInterlock = readDocked_Service_Access_Lifecycle_SupervisorServiceInterlockType()
      return Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_P(api_dockReadiness, api_lifecyclePrestate, api_serviceInterlock)
    }

    def readDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PS(): Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PS = {
      val r = readDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PST(F)
      return r
    }

    def readDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PST(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PS)
      }
      val api_dockReadiness = readDocked_Service_Access_Lifecycle_SupervisorDockReadinessType()
      val api_lifecyclePrestate = readDocked_Service_Access_Lifecycle_SupervisorLifecycleStateType()
      val api_serviceInterlock = readDocked_Service_Access_Lifecycle_SupervisorServiceInterlockType()
      return Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PS(api_dockReadiness, api_lifecyclePrestate, api_serviceInterlock)
    }

    def readDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container(): Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_P => val r = readDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PS => val r = readDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container.")
          val r = readDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PST(T)
          return r
      }
    }

    def readDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_P(): Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_P = {
      val r = readDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PT(F)
      return r
    }

    def readDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_P)
      }
      val api_operationalAssessment = readDocked_Service_Access_Lifecycle_SupervisorOperationalAssessmentType()
      return Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_P(api_operationalAssessment)
    }

    def readDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PS(): Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PS = {
      val r = readDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PST(F)
      return r
    }

    def readDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PST(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PS)
      }
      val api_operationalAssessment = readDocked_Service_Access_Lifecycle_SupervisorOperationalAssessmentType()
      return Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PS(api_operationalAssessment)
    }

    def readDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container(): Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Docked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P => val r = readDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS => val r = readDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container.")
          val r = readDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PST(T)
          return r
      }
    }

    def readDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P(): Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P = {
      val r = readDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PT(F)
      return r
    }

    def readDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P)
      }
      val api_lifecyclePrestate = readDocked_Service_Access_Lifecycle_SupervisorLifecycleStateType()
      val api_operationalAssessment = readDocked_Service_Access_Lifecycle_SupervisorOperationalAssessmentType()
      val api_qualifiedIntent = readDocked_Service_Access_Lifecycle_SupervisorQualifiedIntentType()
      return Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P(api_lifecyclePrestate, api_operationalAssessment, api_qualifiedIntent)
    }

    def readDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS(): Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS = {
      val r = readDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PST(F)
      return r
    }

    def readDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PST(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS)
      }
      val api_lifecyclePrestate = readDocked_Service_Access_Lifecycle_SupervisorLifecycleStateType()
      val api_operationalAssessment = readDocked_Service_Access_Lifecycle_SupervisorOperationalAssessmentType()
      val api_qualifiedIntent = readDocked_Service_Access_Lifecycle_SupervisorQualifiedIntentType()
      return Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS(api_lifecyclePrestate, api_operationalAssessment, api_qualifiedIntent)
    }

    def readDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container(): Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Docked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P => val r = readDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS => val r = readDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container.")
          val r = readDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PST(T)
          return r
      }
    }

    def readDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P(): Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P = {
      val r = readDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PT(F)
      return r
    }

    def readDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P)
      }
      val api_admittedDirective = readDocked_Service_Access_Lifecycle_SupervisorAdmittedDirectiveType()
      return Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P(api_admittedDirective)
    }

    def readDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS(): Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS = {
      val r = readDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PST(F)
      return r
    }

    def readDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PST(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS)
      }
      val api_admittedDirective = readDocked_Service_Access_Lifecycle_SupervisorAdmittedDirectiveType()
      return Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS(api_admittedDirective)
    }

    def readDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container(): Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_P => val r = readDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_PT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_PS => val r = readDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container.")
          val r = readDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_PST(T)
          return r
      }
    }

    def readDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_P(): Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container_P = {
      val r = readDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_PT(F)
      return r
    }

    def readDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_PT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_P)
      }
      val api_admittedDirective = readDocked_Service_Access_Lifecycle_SupervisorAdmittedDirectiveType()
      return Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container_P(api_admittedDirective)
    }

    def readDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_PS(): Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container_PS = {
      val r = readDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_PST(F)
      return r
    }

    def readDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_PST(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_PS)
      }
      val api_admittedDirective = readDocked_Service_Access_Lifecycle_SupervisorAdmittedDirectiveType()
      return Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container_PS(api_admittedDirective)
    }

    def readDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container(): Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_P => val r = readDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_PT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_PS => val r = readDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container.")
          val r = readDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_PST(T)
          return r
      }
    }

    def readDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_P(): Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container_P = {
      val r = readDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_PT(F)
      return r
    }

    def readDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_PT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_P)
      }
      val api_arbiterPrestate = readDocked_Service_Access_Lifecycle_SupervisorLifecycleStateType()
      val api_controlProposal = readDocked_Service_Access_Lifecycle_SupervisorControlProposal()
      val api_lifecycleSnapshot = readDocked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot()
      val api_monitorPrestate = readDocked_Service_Access_Lifecycle_SupervisorLifecycleStateType()
      return Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container_P(api_arbiterPrestate, api_controlProposal, api_lifecycleSnapshot, api_monitorPrestate)
    }

    def readDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_PS(): Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container_PS = {
      val r = readDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_PST(F)
      return r
    }

    def readDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_PST(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_PS)
      }
      val api_arbiterPrestate = readDocked_Service_Access_Lifecycle_SupervisorLifecycleStateType()
      val api_controlProposal = readDocked_Service_Access_Lifecycle_SupervisorControlProposal()
      val api_lifecycleSnapshot = readDocked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot()
      val api_monitorPrestate = readDocked_Service_Access_Lifecycle_SupervisorLifecycleStateType()
      return Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container_PS(api_arbiterPrestate, api_controlProposal, api_lifecycleSnapshot, api_monitorPrestate)
    }

    def readDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container(): Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Docked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_P => val r = readDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PS => val r = readDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container.")
          val r = readDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PST(T)
          return r
      }
    }

    def readDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_P(): Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_P = {
      val r = readDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PT(F)
      return r
    }

    def readDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_P)
      }
      val api_controlProposal = readDocked_Service_Access_Lifecycle_SupervisorControlProposal()
      val api_dockReadiness = readDocked_Service_Access_Lifecycle_SupervisorDockReadinessType()
      val api_serviceInterlock = readDocked_Service_Access_Lifecycle_SupervisorServiceInterlockType()
      return Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_P(api_controlProposal, api_dockReadiness, api_serviceInterlock)
    }

    def readDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PS(): Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PS = {
      val r = readDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PST(F)
      return r
    }

    def readDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PST(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PS)
      }
      val api_controlProposal = readDocked_Service_Access_Lifecycle_SupervisorControlProposal()
      val api_dockReadiness = readDocked_Service_Access_Lifecycle_SupervisorDockReadinessType()
      val api_serviceInterlock = readDocked_Service_Access_Lifecycle_SupervisorServiceInterlockType()
      return Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PS(api_controlProposal, api_dockReadiness, api_serviceInterlock)
    }

    def readDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container(): Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Docked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_P => val r = readDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PS => val r = readDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container.")
          val r = readDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PST(T)
          return r
      }
    }

    def readDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_P(): Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_P = {
      val r = readDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PT(F)
      return r
    }

    def readDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_P)
      }
      val api_gatedControl = readDocked_Service_Access_Lifecycle_SupervisorGatedControl()
      val api_movementDirective = readDocked_Service_Access_Lifecycle_SupervisorMovementDirectiveType()
      val api_serviceAccess = readDocked_Service_Access_Lifecycle_SupervisorServiceAccessType()
      return Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_P(api_gatedControl, api_movementDirective, api_serviceAccess)
    }

    def readDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PS(): Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PS = {
      val r = readDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PST(F)
      return r
    }

    def readDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PST(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PS)
      }
      val api_gatedControl = readDocked_Service_Access_Lifecycle_SupervisorGatedControl()
      val api_movementDirective = readDocked_Service_Access_Lifecycle_SupervisorMovementDirectiveType()
      val api_serviceAccess = readDocked_Service_Access_Lifecycle_SupervisorServiceAccessType()
      return Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PS(api_gatedControl, api_movementDirective, api_serviceAccess)
    }

    def readDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container(): Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_P => val r = readDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PS => val r = readDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container.")
          val r = readDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PST(T)
          return r
      }
    }

    def readDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_P(): Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_P = {
      val r = readDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PT(F)
      return r
    }

    def readDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_P)
      }
      val api_gatedControl = readDocked_Service_Access_Lifecycle_SupervisorGatedControl()
      val api_lifecycleSnapshot = readDocked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot()
      return Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_P(api_gatedControl, api_lifecycleSnapshot)
    }

    def readDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PS(): Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PS = {
      val r = readDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PST(F)
      return r
    }

    def readDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PST(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PS)
      }
      val api_gatedControl = readDocked_Service_Access_Lifecycle_SupervisorGatedControl()
      val api_lifecycleSnapshot = readDocked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot()
      return Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PS(api_gatedControl, api_lifecycleSnapshot)
    }

    def readDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container(): Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_P => val r = readDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PS => val r = readDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container.")
          val r = readDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PST(T)
          return r
      }
    }

    def readDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_P(): Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_P = {
      val r = readDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PT(F)
      return r
    }

    def readDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_P)
      }
      val api_pilotReport = readDocked_Service_Access_Lifecycle_SupervisorPilotLifecycleReportType()
      val api_stationReport = readDocked_Service_Access_Lifecycle_SupervisorStationAccessReportType()
      return Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_P(api_pilotReport, api_stationReport)
    }

    def readDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PS(): Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PS = {
      val r = readDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PST(F)
      return r
    }

    def readDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PST(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PS)
      }
      val api_pilotReport = readDocked_Service_Access_Lifecycle_SupervisorPilotLifecycleReportType()
      val api_stationReport = readDocked_Service_Access_Lifecycle_SupervisorStationAccessReportType()
      return Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PS(api_pilotReport, api_stationReport)
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
        case Constants.Docked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_P => val r = readDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P => val r = readDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PS => val r = readDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PST(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS => val r = readDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PST(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_P => val r = readDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PS => val r = readDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PST(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P => val r = readDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS => val r = readDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PST(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_P => val r = readDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PS => val r = readDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PST(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_P => val r = readDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PS => val r = readDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PST(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_P => val r = readDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_PT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_PS => val r = readDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_PST(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_P => val r = readDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_PT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_PS => val r = readDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_PST(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_P => val r = readDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PS => val r = readDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PST(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_P => val r = readDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PS => val r = readDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PST(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_P => val r = readDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PS => val r = readDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PST(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_P => val r = readDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PS => val r = readDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PST(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_P => val r = readDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_P => val r = readDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PS => val r = readDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PST(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PS => val r = readDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PST(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_P => val r = readDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_P => val r = readDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PS => val r = readDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PST(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PS => val r = readDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of util.Container.")
          val r = readDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PST(T)
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
        case Constants.Docked_Service_Access_Lifecycle_SupervisorPilotIntent_Payload => val r = readDocked_Service_Access_Lifecycle_SupervisorPilotIntent_PayloadT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorGatedControl_Payload => val r = readDocked_Service_Access_Lifecycle_SupervisorGatedControl_PayloadT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorServiceAccess_Payload => val r = readDocked_Service_Access_Lifecycle_SupervisorServiceAccess_PayloadT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorServiceSignal_Payload => val r = readDocked_Service_Access_Lifecycle_SupervisorServiceSignal_PayloadT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorShipCondition_Payload => val r = readDocked_Service_Access_Lifecycle_SupervisorShipCondition_PayloadT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorDockReadiness_Payload => val r = readDocked_Service_Access_Lifecycle_SupervisorDockReadiness_PayloadT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorAccessProposal_Payload => val r = readDocked_Service_Access_Lifecycle_SupervisorAccessProposal_PayloadT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleState_Payload => val r = readDocked_Service_Access_Lifecycle_SupervisorLifecycleState_PayloadT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorQualifiedIntent_Payload => val r = readDocked_Service_Access_Lifecycle_SupervisorQualifiedIntent_PayloadT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleResult_Payload => val r = readDocked_Service_Access_Lifecycle_SupervisorLifecycleResult_PayloadT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorControlProposal_Payload => val r = readDocked_Service_Access_Lifecycle_SupervisorControlProposal_PayloadT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorMovementProposal_Payload => val r = readDocked_Service_Access_Lifecycle_SupervisorMovementProposal_PayloadT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorBerthObservation_Payload => val r = readDocked_Service_Access_Lifecycle_SupervisorBerthObservation_PayloadT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorServiceInterlock_Payload => val r = readDocked_Service_Access_Lifecycle_SupervisorServiceInterlock_PayloadT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorMovementDirective_Payload => val r = readDocked_Service_Access_Lifecycle_SupervisorMovementDirective_PayloadT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorAdmittedDirective_Payload => val r = readDocked_Service_Access_Lifecycle_SupervisorAdmittedDirective_PayloadT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot_Payload => val r = readDocked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot_PayloadT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorStationAccessReport_Payload => val r = readDocked_Service_Access_Lifecycle_SupervisorStationAccessReport_PayloadT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorPilotLifecycleReport_Payload => val r = readDocked_Service_Access_Lifecycle_SupervisorPilotLifecycleReport_PayloadT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorOperationalAssessment_Payload => val r = readDocked_Service_Access_Lifecycle_SupervisorOperationalAssessment_PayloadT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorSnapshotLifecycleState_Payload => val r = readDocked_Service_Access_Lifecycle_SupervisorSnapshotLifecycleState_PayloadT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_P => val r = readDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P => val r = readDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PS => val r = readDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PST(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS => val r = readDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PST(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_P => val r = readDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PS => val r = readDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PST(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P => val r = readDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS => val r = readDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PST(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_P => val r = readDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PS => val r = readDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PST(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_P => val r = readDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PS => val r = readDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PST(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_P => val r = readDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_PT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_PS => val r = readDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_PST(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_P => val r = readDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_PT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_PS => val r = readDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_PST(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_P => val r = readDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PS => val r = readDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PST(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_P => val r = readDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PS => val r = readDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PST(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_P => val r = readDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PS => val r = readDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PST(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_P => val r = readDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PS => val r = readDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PST(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_P => val r = readDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_P => val r = readDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PS => val r = readDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PST(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PS => val r = readDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PST(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_P => val r = readDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_P => val r = readDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PT(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PS => val r = readDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PST(T); return r
        case Constants.Docked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PS => val r = readDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of art.DataContent.")
          val r = readDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PST(T)
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

  def fromDocked_Service_Access_Lifecycle_SupervisorPilotIntent_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.PilotIntent_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorPilotIntent_Payload(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorPilotIntent_Payload(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.PilotIntent_Payload, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorPilotIntent_Payload(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.PilotIntent_Payload = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorPilotIntent_Payload()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorPilotIntent_Payload _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorQualifiedIntent_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.QualifiedIntent_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorQualifiedIntent_Payload(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorQualifiedIntent_Payload(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.QualifiedIntent_Payload, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorQualifiedIntent_Payload(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.QualifiedIntent_Payload = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorQualifiedIntent_Payload()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorQualifiedIntent_Payload _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorBerthObservation_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.BerthObservation_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorBerthObservation_Payload(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorBerthObservation_Payload(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.BerthObservation_Payload, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorBerthObservation_Payload(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.BerthObservation_Payload = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorBerthObservation_Payload()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorBerthObservation_Payload _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorShipCondition_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.ShipCondition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorShipCondition_Payload(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorShipCondition_Payload(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.ShipCondition_Payload, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorShipCondition_Payload(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.ShipCondition_Payload = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorShipCondition_Payload()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorShipCondition_Payload _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorDockReadiness_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.DockReadiness_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorDockReadiness_Payload(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorDockReadiness_Payload(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.DockReadiness_Payload, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorDockReadiness_Payload(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.DockReadiness_Payload = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorDockReadiness_Payload()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorDockReadiness_Payload _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorServiceSignal_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.ServiceSignal_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorServiceSignal_Payload(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorServiceSignal_Payload(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.ServiceSignal_Payload, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorServiceSignal_Payload(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.ServiceSignal_Payload = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorServiceSignal_Payload()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorServiceSignal_Payload _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorServiceInterlock_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlock_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorServiceInterlock_Payload(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorServiceInterlock_Payload(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlock_Payload, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorServiceInterlock_Payload(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlock_Payload = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorServiceInterlock_Payload()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorServiceInterlock_Payload _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorLifecycleState_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorLifecycleState_Payload(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorLifecycleState_Payload(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.LifecycleState_Payload, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorLifecycleState_Payload(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.LifecycleState_Payload = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorLifecycleState_Payload()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorLifecycleState_Payload _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorOperationalAssessment_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.OperationalAssessment_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorOperationalAssessment_Payload(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorOperationalAssessment_Payload(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.OperationalAssessment_Payload, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorOperationalAssessment_Payload(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.OperationalAssessment_Payload = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorOperationalAssessment_Payload()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorOperationalAssessment_Payload _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorAdmittedDirective_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.AdmittedDirective_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorAdmittedDirective_Payload(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorAdmittedDirective_Payload(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.AdmittedDirective_Payload, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorAdmittedDirective_Payload(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.AdmittedDirective_Payload = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorAdmittedDirective_Payload()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorAdmittedDirective_Payload _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorMovementProposal_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.MovementProposal_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorMovementProposal_Payload(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorMovementProposal_Payload(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.MovementProposal_Payload, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorMovementProposal_Payload(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.MovementProposal_Payload = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorMovementProposal_Payload()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorMovementProposal_Payload _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorAccessProposal_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.AccessProposal_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorAccessProposal_Payload(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorAccessProposal_Payload(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.AccessProposal_Payload, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorAccessProposal_Payload(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.AccessProposal_Payload = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorAccessProposal_Payload()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorAccessProposal_Payload _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorSnapshotLifecycleState_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.SnapshotLifecycleState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorSnapshotLifecycleState_Payload(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorSnapshotLifecycleState_Payload(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.SnapshotLifecycleState_Payload, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorSnapshotLifecycleState_Payload(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.SnapshotLifecycleState_Payload = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorSnapshotLifecycleState_Payload()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorSnapshotLifecycleState_Payload _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorLifecycleResult_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleResult_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorLifecycleResult_Payload(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorLifecycleResult_Payload(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.LifecycleResult_Payload, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorLifecycleResult_Payload(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.LifecycleResult_Payload = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorLifecycleResult_Payload()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorLifecycleResult_Payload _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorMovementDirective_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.MovementDirective_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorMovementDirective_Payload(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorMovementDirective_Payload(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.MovementDirective_Payload, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorMovementDirective_Payload(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.MovementDirective_Payload = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorMovementDirective_Payload()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorMovementDirective_Payload _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorServiceAccess_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.ServiceAccess_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorServiceAccess_Payload(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorServiceAccess_Payload(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.ServiceAccess_Payload, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorServiceAccess_Payload(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.ServiceAccess_Payload = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorServiceAccess_Payload()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorServiceAccess_Payload _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorPilotLifecycleReport_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.PilotLifecycleReport_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorPilotLifecycleReport_Payload(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorPilotLifecycleReport_Payload(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.PilotLifecycleReport_Payload, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorPilotLifecycleReport_Payload(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.PilotLifecycleReport_Payload = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorPilotLifecycleReport_Payload()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorPilotLifecycleReport_Payload _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorStationAccessReport_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.StationAccessReport_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorStationAccessReport_Payload(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorStationAccessReport_Payload(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.StationAccessReport_Payload, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorStationAccessReport_Payload(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.StationAccessReport_Payload = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorStationAccessReport_Payload()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorStationAccessReport_Payload _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorControlProposal(o: Docked_Service_Access_Lifecycle_Supervisor.ControlProposal, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorControlProposal(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorControlProposal(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.ControlProposal, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorControlProposal(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.ControlProposal = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorControlProposal()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorControlProposal _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorControlProposal_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.ControlProposal_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorControlProposal_Payload(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorControlProposal_Payload(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.ControlProposal_Payload, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorControlProposal_Payload(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.ControlProposal_Payload = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorControlProposal_Payload()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorControlProposal_Payload _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleSnapshot, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.LifecycleSnapshot, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.LifecycleSnapshot = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleSnapshot_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot_Payload(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot_Payload(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.LifecycleSnapshot_Payload, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot_Payload(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.LifecycleSnapshot_Payload = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot_Payload()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot_Payload _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorGatedControl(o: Docked_Service_Access_Lifecycle_Supervisor.GatedControl, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorGatedControl(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorGatedControl(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.GatedControl, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorGatedControl(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.GatedControl = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorGatedControl()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorGatedControl _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorGatedControl_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.GatedControl_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorGatedControl_Payload(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorGatedControl_Payload(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.GatedControl_Payload, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorGatedControl_Payload(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.GatedControl_Payload = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorGatedControl_Payload()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorGatedControl_Payload _)
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

  def fromDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container(o: Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_P(o: Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_P(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_P(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_P(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container_P = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_P()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_P _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PS(o: Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PS(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PS(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PS(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PS = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PS()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PS _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container(o: Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_P(o: Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_P(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_P(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_P(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container_P = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_P()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_P _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PS(o: Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PS(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PS(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PS(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PS = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PS()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PS _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container(o: Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_P(o: Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_P(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_P(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_P(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_P = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_P()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_P _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PS(o: Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PS(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PS(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PS(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PS = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PS()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PS _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container(o: Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_P(o: Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_P(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_P(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_P(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_P = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_P()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_P _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PS(o: Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PS(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PS(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PS(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PS = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PS()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PS _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container(o: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_P(o: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_P(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_P(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_P(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_P = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_P()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_P _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PS(o: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PS(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PS(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PS(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PS = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PS()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PS _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container(o: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_P(o: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_P(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_P(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_P(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_P = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_P()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_P _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PS(o: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PS(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PS(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PS(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PS = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PS()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PS _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_P(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_P(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_P(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_P(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_P = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_P()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_P _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PS(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PS(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PS(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PS(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PS = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PS()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PS _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_P(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_P(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_P(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_P(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_P = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_P()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_P _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PS(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PS(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PS(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PS(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PS = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PS()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PS _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container(o: Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P(o: Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS(o: Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container(o: Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P(o: Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS(o: Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_P(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_P(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_P(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_P(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container_P = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_P()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_P _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_PS(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_PS(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_PS(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_PS(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container_PS = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_PS()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_PS _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_P(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_P(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_P(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_P(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container_P = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_P()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_P _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_PS(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_PS(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_PS(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_PS(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container_PS = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_PS()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_PS _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container(o: Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_P(o: Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_P(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_P(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_P(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_P = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_P()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_P _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PS(o: Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PS(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PS(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PS(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PS = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PS()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PS _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container(o: Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_P(o: Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_P(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_P(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_P(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_P = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_P()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_P _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PS(o: Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PS(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PS(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PS(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PS = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PS()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PS _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_P(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_P(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_P(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_P(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_P = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_P()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_P _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PS(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PS(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PS(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PS(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PS = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PS()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PS _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_P(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_P(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_P(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_P(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_P = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_P()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_P _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PS(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PS(o)
    return w.result
  }

  def toDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PS(data: ISZ[U8]): Either[Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PS(reader: Reader): Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PS = {
      val r = reader.readDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PS()
      return r
    }
    val r = to(data, fDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PS _)
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