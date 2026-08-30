// #Sireum
// @formatter:off

// This file is auto-generated from NavigationEvidence.scala, EvidenceAssessment.scala, ObstacleEvidence.scala, ObstacleAssessment.scala, NavigationBasis.scala, MotionContext.scala, AwarenessCondition.scala, ConstraintProposal.scala, SupervisionEvent.scala, RecoveryPhase.scala, AcceptedAction.scala, NavigationUseDirective.scala, ObstacleAwarenessNotice.scala, SupervisionStatus.scala, Base_Types.scala, GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_Containers.scala, InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_Containers.scala, BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_Containers.scala, ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_Containers.scala, NavigationBasisOwner_supervisorProcess_navigationBasisOwner_Containers.scala, AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_Containers.scala, ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_Containers.scala, EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_Containers.scala, RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_Containers.scala, SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package navigation_obstacle_awareness_use_supervisor

import org.sireum._

object MsgPack {

  object Constants {

    val Navigation_Obstacle_Awareness_Use_SupervisorNavigationEvidence_Payload: Z = -32

    val Navigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessment_Payload: Z = -31

    val Navigation_Obstacle_Awareness_Use_SupervisorObstacleEvidence_Payload: Z = -30

    val Navigation_Obstacle_Awareness_Use_SupervisorObstacleAssessment_Payload: Z = -29

    val Navigation_Obstacle_Awareness_Use_SupervisorNavigationBasis_Payload: Z = -28

    val Navigation_Obstacle_Awareness_Use_SupervisorMotionContext_Payload: Z = -27

    val Navigation_Obstacle_Awareness_Use_SupervisorAwarenessCondition_Payload: Z = -26

    val Navigation_Obstacle_Awareness_Use_SupervisorConstraintProposal_Payload: Z = -25

    val Navigation_Obstacle_Awareness_Use_SupervisorSupervisionEvent_Payload: Z = -24

    val Navigation_Obstacle_Awareness_Use_SupervisorRecoveryPhase_Payload: Z = -23

    val Navigation_Obstacle_Awareness_Use_SupervisorAcceptedAction_Payload: Z = -22

    val Navigation_Obstacle_Awareness_Use_SupervisorNavigationUseDirective_Payload: Z = -21

    val Navigation_Obstacle_Awareness_Use_SupervisorObstacleAwarenessNotice_Payload: Z = -20

    val Navigation_Obstacle_Awareness_Use_SupervisorSupervisionStatus_Payload: Z = -19

    val Base_TypesBoolean_Payload: Z = -18

    val Base_TypesInteger_Payload: Z = -17

    val Base_TypesInteger_8_Payload: Z = -16

    val Base_TypesInteger_16_Payload: Z = -15

    val Base_TypesInteger_32_Payload: Z = -14

    val Base_TypesInteger_64_Payload: Z = -13

    val Base_TypesUnsigned_8_Payload: Z = -12

    val Base_TypesUnsigned_16_Payload: Z = -11

    val Base_TypesUnsigned_32_Payload: Z = -10

    val Base_TypesUnsigned_64_Payload: Z = -9

    val Base_TypesFloat_Payload: Z = -8

    val Base_TypesFloat_32_Payload: Z = -7

    val Base_TypesFloat_64_Payload: Z = -6

    val Base_TypesCharacter_Payload: Z = -5

    val Base_TypesString_Payload: Z = -4

    val Base_TypesBits_Payload: Z = -3

    val Navigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_P: Z = -2

    val Navigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PS: Z = -1

    val Navigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_P: Z = 0

    val Navigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PS: Z = 1

    val Navigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_P: Z = 2

    val Navigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PS: Z = 3

    val Navigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_P: Z = 4

    val Navigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PS: Z = 5

    val Navigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_P: Z = 6

    val Navigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PS: Z = 7

    val Navigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_P: Z = 8

    val Navigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PS: Z = 9

    val Navigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_P: Z = 10

    val Navigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PS: Z = 11

    val Navigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_P: Z = 12

    val Navigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PS: Z = 13

    val Navigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_P: Z = 14

    val Navigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PS: Z = 15

    val Navigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_P: Z = 16

    val Navigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PS: Z = 17

    val Navigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_P: Z = 18

    val Navigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PS: Z = 19

    val Navigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_P: Z = 20

    val Navigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PS: Z = 21

    val Navigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_P: Z = 22

    val Navigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PS: Z = 23

    val Navigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_P: Z = 24

    val Navigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PS: Z = 25

    val Navigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_P: Z = 26

    val Navigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PS: Z = 27

    val Navigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_P: Z = 28

    val Navigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PS: Z = 29

    val Navigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_P: Z = 30

    val Navigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PS: Z = 31

    val Navigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_P: Z = 32

    val Navigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PS: Z = 33

    val Navigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_P: Z = 34

    val Navigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PS: Z = 35

    val Navigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_P: Z = 36

    val Navigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PS: Z = 37

    val utilEmptyContainer: Z = 38

    val _artEmpty: Z = 39

  }

  object Writer {

    @record class Default(val writer: MessagePack.Writer.Impl) extends Writer

  }

  @msig trait Writer {

    def writer: MessagePack.Writer

    def writeNavigation_Obstacle_Awareness_Use_SupervisorNavigationEvidenceType(o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationEvidence.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorNavigationEvidence_Payload(o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationEvidence_Payload): Unit = {
      writer.writeZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorNavigationEvidence_Payload)
      writeNavigation_Obstacle_Awareness_Use_SupervisorNavigationEvidenceType(o.value)
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessmentType(o: Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessment_Payload(o: Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment_Payload): Unit = {
      writer.writeZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessment_Payload)
      writeNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessmentType(o.value)
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceType(o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidence.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidence_Payload(o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidence_Payload): Unit = {
      writer.writeZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorObstacleEvidence_Payload)
      writeNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceType(o.value)
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorObstacleAssessmentType(o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAssessment.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorObstacleAssessment_Payload(o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAssessment_Payload): Unit = {
      writer.writeZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorObstacleAssessment_Payload)
      writeNavigation_Obstacle_Awareness_Use_SupervisorObstacleAssessmentType(o.value)
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisType(o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasis_Payload(o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis_Payload): Unit = {
      writer.writeZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorNavigationBasis_Payload)
      writeNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisType(o.value)
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorMotionContextType(o: Navigation_Obstacle_Awareness_Use_Supervisor.MotionContext.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorMotionContext_Payload(o: Navigation_Obstacle_Awareness_Use_Supervisor.MotionContext_Payload): Unit = {
      writer.writeZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorMotionContext_Payload)
      writeNavigation_Obstacle_Awareness_Use_SupervisorMotionContextType(o.value)
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionType(o: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorAwarenessCondition_Payload(o: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition_Payload): Unit = {
      writer.writeZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorAwarenessCondition_Payload)
      writeNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionType(o.value)
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalType(o: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposal.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposal_Payload(o: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposal_Payload): Unit = {
      writer.writeZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorConstraintProposal_Payload)
      writeNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalType(o.value)
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorSupervisionEventType(o: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionEvent.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorSupervisionEvent_Payload(o: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionEvent_Payload): Unit = {
      writer.writeZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorSupervisionEvent_Payload)
      writeNavigation_Obstacle_Awareness_Use_SupervisorSupervisionEventType(o.value)
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhaseType(o: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhase_Payload(o: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase_Payload): Unit = {
      writer.writeZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorRecoveryPhase_Payload)
      writeNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhaseType(o.value)
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorAcceptedActionType(o: Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorAcceptedAction_Payload(o: Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction_Payload): Unit = {
      writer.writeZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorAcceptedAction_Payload)
      writeNavigation_Obstacle_Awareness_Use_SupervisorAcceptedActionType(o.value)
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorNavigationUseDirectiveType(o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationUseDirective.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorNavigationUseDirective_Payload(o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationUseDirective_Payload): Unit = {
      writer.writeZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorNavigationUseDirective_Payload)
      writeNavigation_Obstacle_Awareness_Use_SupervisorNavigationUseDirectiveType(o.value)
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorObstacleAwarenessNoticeType(o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAwarenessNotice.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorObstacleAwarenessNotice_Payload(o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAwarenessNotice_Payload): Unit = {
      writer.writeZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorObstacleAwarenessNotice_Payload)
      writeNavigation_Obstacle_Awareness_Use_SupervisorObstacleAwarenessNoticeType(o.value)
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorSupervisionStatusType(o: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionStatus.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorSupervisionStatus_Payload(o: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionStatus_Payload): Unit = {
      writer.writeZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorSupervisionStatus_Payload)
      writeNavigation_Obstacle_Awareness_Use_SupervisorSupervisionStatusType(o.value)
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

    def writeNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container): Unit = {
      o match {
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_P => writeNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PS => writeNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PS(o)
      }
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_P)
      writeNavigation_Obstacle_Awareness_Use_SupervisorNavigationEvidenceType(o.api_gpsEvidence)
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PS)
      writeNavigation_Obstacle_Awareness_Use_SupervisorNavigationEvidenceType(o.api_gpsEvidence)
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container): Unit = {
      o match {
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_P => writeNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PS => writeNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PS(o)
      }
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_P)
      writeNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessmentType(o.api_gpsAssessment)
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PS)
      writeNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessmentType(o.api_gpsAssessment)
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container): Unit = {
      o match {
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_P => writeNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PS => writeNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PS(o)
      }
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_P)
      writeNavigation_Obstacle_Awareness_Use_SupervisorNavigationEvidenceType(o.api_inertialEvidence)
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PS)
      writeNavigation_Obstacle_Awareness_Use_SupervisorNavigationEvidenceType(o.api_inertialEvidence)
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container): Unit = {
      o match {
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_P => writeNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PS => writeNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PS(o)
      }
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_P)
      writeNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessmentType(o.api_inertialAssessment)
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PS)
      writeNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessmentType(o.api_inertialAssessment)
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container): Unit = {
      o match {
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_P => writeNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PS => writeNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PS(o)
      }
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_P)
      writeNavigation_Obstacle_Awareness_Use_SupervisorNavigationEvidenceType(o.api_barometricEvidence)
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PS)
      writeNavigation_Obstacle_Awareness_Use_SupervisorNavigationEvidenceType(o.api_barometricEvidence)
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container): Unit = {
      o match {
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_P => writeNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PS => writeNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PS(o)
      }
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_P)
      writeNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessmentType(o.api_barometricAssessment)
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PS)
      writeNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessmentType(o.api_barometricAssessment)
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container): Unit = {
      o match {
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_P => writeNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PS => writeNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PS(o)
      }
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_P)
      writeNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceType(o.api_obstacleEvidence)
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PS)
      writeNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceType(o.api_obstacleEvidence)
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container): Unit = {
      o match {
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_P => writeNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PS => writeNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PS(o)
      }
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_P)
      writeNavigation_Obstacle_Awareness_Use_SupervisorObstacleAssessmentType(o.api_obstacleAssessment)
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PS)
      writeNavigation_Obstacle_Awareness_Use_SupervisorObstacleAssessmentType(o.api_obstacleAssessment)
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container): Unit = {
      o match {
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_P => writeNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PS => writeNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PS(o)
      }
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_P)
      writeNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessmentType(o.api_barometricAssessment)
      writeNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessmentType(o.api_gpsAssessment)
      writeNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessmentType(o.api_inertialAssessment)
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PS)
      writeNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessmentType(o.api_barometricAssessment)
      writeNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessmentType(o.api_gpsAssessment)
      writeNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessmentType(o.api_inertialAssessment)
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container): Unit = {
      o match {
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_P => writeNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PS => writeNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PS(o)
      }
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_P)
      writeNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisType(o.api_outcomeBasis)
      writeNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisType(o.api_proposalBasis)
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PS)
      writeNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisType(o.api_outcomeBasis)
      writeNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisType(o.api_proposalBasis)
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container): Unit = {
      o match {
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_P => writeNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PS => writeNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PS(o)
      }
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_P)
      writeNavigation_Obstacle_Awareness_Use_SupervisorMotionContextType(o.api_motionContext)
      writeNavigation_Obstacle_Awareness_Use_SupervisorObstacleAssessmentType(o.api_obstacleAssessment)
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PS)
      writeNavigation_Obstacle_Awareness_Use_SupervisorMotionContextType(o.api_motionContext)
      writeNavigation_Obstacle_Awareness_Use_SupervisorObstacleAssessmentType(o.api_obstacleAssessment)
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container): Unit = {
      o match {
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_P => writeNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PS => writeNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PS(o)
      }
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_P)
      writeNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionType(o.api_awarenessCondition)
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PS)
      writeNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionType(o.api_awarenessCondition)
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container): Unit = {
      o match {
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_P => writeNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PS => writeNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PS(o)
      }
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_P)
      writeNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionType(o.api_awarenessCondition)
      writeNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisType(o.api_navigationBasis)
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PS)
      writeNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionType(o.api_awarenessCondition)
      writeNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisType(o.api_navigationBasis)
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container): Unit = {
      o match {
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_P => writeNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PS => writeNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PS(o)
      }
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_P)
      writeNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalType(o.api_constraintProposal)
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PS)
      writeNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalType(o.api_constraintProposal)
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container): Unit = {
      o match {
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_P => writeNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PS => writeNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PS(o)
      }
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_P)
      writeNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalType(o.api_constraintProposal)
      writeNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhaseType(o.api_preRecoveryPhase)
      writeNavigation_Obstacle_Awareness_Use_SupervisorSupervisionEventType(o.api_supervisionEvent)
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PS)
      writeNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalType(o.api_constraintProposal)
      writeNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhaseType(o.api_preRecoveryPhase)
      writeNavigation_Obstacle_Awareness_Use_SupervisorSupervisionEventType(o.api_supervisionEvent)
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container): Unit = {
      o match {
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_P => writeNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PS => writeNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PS(o)
      }
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_P)
      writeNavigation_Obstacle_Awareness_Use_SupervisorAcceptedActionType(o.api_outcomeAction)
      writeNavigation_Obstacle_Awareness_Use_SupervisorAcceptedActionType(o.api_recoveryAction)
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PS)
      writeNavigation_Obstacle_Awareness_Use_SupervisorAcceptedActionType(o.api_outcomeAction)
      writeNavigation_Obstacle_Awareness_Use_SupervisorAcceptedActionType(o.api_recoveryAction)
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container): Unit = {
      o match {
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_P => writeNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PS => writeNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PS(o)
      }
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_P)
      writeNavigation_Obstacle_Awareness_Use_SupervisorAcceptedActionType(o.api_acceptedAction)
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PS)
      writeNavigation_Obstacle_Awareness_Use_SupervisorAcceptedActionType(o.api_acceptedAction)
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container): Unit = {
      o match {
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_P => writeNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PS => writeNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PS(o)
      }
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_P)
      writeNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhaseType(o.api_postRecoveryPhase)
      writeNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhaseType(o.api_preRecoveryPhase)
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PS)
      writeNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhaseType(o.api_postRecoveryPhase)
      writeNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhaseType(o.api_preRecoveryPhase)
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container): Unit = {
      o match {
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_P => writeNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PS => writeNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PS(o)
      }
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_P)
      writeNavigation_Obstacle_Awareness_Use_SupervisorAcceptedActionType(o.api_acceptedAction)
      writeNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisType(o.api_navigationBasis)
      writeNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhaseType(o.api_postRecoveryPhase)
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PS)
      writeNavigation_Obstacle_Awareness_Use_SupervisorAcceptedActionType(o.api_acceptedAction)
      writeNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisType(o.api_navigationBasis)
      writeNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhaseType(o.api_postRecoveryPhase)
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container): Unit = {
      o match {
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_P => writeNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PS => writeNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PS(o)
      }
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_P)
      writeNavigation_Obstacle_Awareness_Use_SupervisorNavigationUseDirectiveType(o.api_navigationUseDirective)
      writeNavigation_Obstacle_Awareness_Use_SupervisorObstacleAwarenessNoticeType(o.api_obstacleAwarenessNotice)
      writeNavigation_Obstacle_Awareness_Use_SupervisorSupervisionStatusType(o.api_supervisionStatus)
    }

    def writeNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PS)
      writeNavigation_Obstacle_Awareness_Use_SupervisorNavigationUseDirectiveType(o.api_navigationUseDirective)
      writeNavigation_Obstacle_Awareness_Use_SupervisorObstacleAwarenessNoticeType(o.api_obstacleAwarenessNotice)
      writeNavigation_Obstacle_Awareness_Use_SupervisorSupervisionStatusType(o.api_supervisionStatus)
    }

    def writeruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeutilContainer(o: util.Container): Unit = {
      o match {
        case o: util.EmptyContainer => writeutilEmptyContainer(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_P => writeNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PS => writeNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_P => writeNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PS => writeNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_P => writeNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_P => writeNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_P => writeNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PS => writeNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PS => writeNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PS => writeNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_P => writeNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PS => writeNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_P => writeNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_P => writeNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PS => writeNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PS => writeNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_P => writeNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_P => writeNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_P => writeNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PS => writeNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PS => writeNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PS => writeNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_P => writeNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_P => writeNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PS => writeNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PS => writeNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_P => writeNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PS => writeNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_P => writeNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_P => writeNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PS => writeNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PS => writeNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_P => writeNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_P => writeNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PS => writeNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PS => writeNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_P => writeNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PS => writeNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_P => writeNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PS => writeNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PS(o)
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
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase_Payload => writeNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhase_Payload(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.MotionContext_Payload => writeNavigation_Obstacle_Awareness_Use_SupervisorMotionContext_Payload(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction_Payload => writeNavigation_Obstacle_Awareness_Use_SupervisorAcceptedAction_Payload(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis_Payload => writeNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasis_Payload(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionEvent_Payload => writeNavigation_Obstacle_Awareness_Use_SupervisorSupervisionEvent_Payload(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidence_Payload => writeNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidence_Payload(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionStatus_Payload => writeNavigation_Obstacle_Awareness_Use_SupervisorSupervisionStatus_Payload(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment_Payload => writeNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessment_Payload(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAssessment_Payload => writeNavigation_Obstacle_Awareness_Use_SupervisorObstacleAssessment_Payload(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationEvidence_Payload => writeNavigation_Obstacle_Awareness_Use_SupervisorNavigationEvidence_Payload(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposal_Payload => writeNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposal_Payload(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition_Payload => writeNavigation_Obstacle_Awareness_Use_SupervisorAwarenessCondition_Payload(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationUseDirective_Payload => writeNavigation_Obstacle_Awareness_Use_SupervisorNavigationUseDirective_Payload(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAwarenessNotice_Payload => writeNavigation_Obstacle_Awareness_Use_SupervisorObstacleAwarenessNotice_Payload(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_P => writeNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PS => writeNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_P => writeNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PS => writeNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_P => writeNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_P => writeNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_P => writeNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PS => writeNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PS => writeNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PS => writeNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_P => writeNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PS => writeNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_P => writeNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_P => writeNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PS => writeNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PS => writeNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_P => writeNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_P => writeNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_P => writeNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PS => writeNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PS => writeNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PS => writeNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_P => writeNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_P => writeNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PS => writeNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PS => writeNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_P => writeNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PS => writeNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_P => writeNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_P => writeNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PS => writeNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PS => writeNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_P => writeNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_P => writeNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PS => writeNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PS => writeNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_P => writeNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PS => writeNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_P => writeNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PS => writeNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PS(o)
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

    def readNavigation_Obstacle_Awareness_Use_SupervisorNavigationEvidenceType(): Navigation_Obstacle_Awareness_Use_Supervisor.NavigationEvidence.Type = {
      val r = reader.readZ()
      return Navigation_Obstacle_Awareness_Use_Supervisor.NavigationEvidence.byOrdinal(r).get
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorNavigationEvidence_Payload(): Navigation_Obstacle_Awareness_Use_Supervisor.NavigationEvidence_Payload = {
      val r = readNavigation_Obstacle_Awareness_Use_SupervisorNavigationEvidence_PayloadT(F)
      return r
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorNavigationEvidence_PayloadT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.NavigationEvidence_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorNavigationEvidence_Payload)
      }
      val value = readNavigation_Obstacle_Awareness_Use_SupervisorNavigationEvidenceType()
      return Navigation_Obstacle_Awareness_Use_Supervisor.NavigationEvidence_Payload(value)
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessmentType(): Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment.Type = {
      val r = reader.readZ()
      return Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment.byOrdinal(r).get
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessment_Payload(): Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment_Payload = {
      val r = readNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessment_PayloadT(F)
      return r
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessment_PayloadT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessment_Payload)
      }
      val value = readNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessmentType()
      return Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment_Payload(value)
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceType(): Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidence.Type = {
      val r = reader.readZ()
      return Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidence.byOrdinal(r).get
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidence_Payload(): Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidence_Payload = {
      val r = readNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidence_PayloadT(F)
      return r
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidence_PayloadT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidence_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorObstacleEvidence_Payload)
      }
      val value = readNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceType()
      return Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidence_Payload(value)
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorObstacleAssessmentType(): Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAssessment.Type = {
      val r = reader.readZ()
      return Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAssessment.byOrdinal(r).get
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorObstacleAssessment_Payload(): Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAssessment_Payload = {
      val r = readNavigation_Obstacle_Awareness_Use_SupervisorObstacleAssessment_PayloadT(F)
      return r
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorObstacleAssessment_PayloadT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAssessment_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorObstacleAssessment_Payload)
      }
      val value = readNavigation_Obstacle_Awareness_Use_SupervisorObstacleAssessmentType()
      return Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAssessment_Payload(value)
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisType(): Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis.Type = {
      val r = reader.readZ()
      return Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis.byOrdinal(r).get
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasis_Payload(): Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis_Payload = {
      val r = readNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasis_PayloadT(F)
      return r
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasis_PayloadT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorNavigationBasis_Payload)
      }
      val value = readNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisType()
      return Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis_Payload(value)
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorMotionContextType(): Navigation_Obstacle_Awareness_Use_Supervisor.MotionContext.Type = {
      val r = reader.readZ()
      return Navigation_Obstacle_Awareness_Use_Supervisor.MotionContext.byOrdinal(r).get
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorMotionContext_Payload(): Navigation_Obstacle_Awareness_Use_Supervisor.MotionContext_Payload = {
      val r = readNavigation_Obstacle_Awareness_Use_SupervisorMotionContext_PayloadT(F)
      return r
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorMotionContext_PayloadT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.MotionContext_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorMotionContext_Payload)
      }
      val value = readNavigation_Obstacle_Awareness_Use_SupervisorMotionContextType()
      return Navigation_Obstacle_Awareness_Use_Supervisor.MotionContext_Payload(value)
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionType(): Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition.Type = {
      val r = reader.readZ()
      return Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition.byOrdinal(r).get
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorAwarenessCondition_Payload(): Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition_Payload = {
      val r = readNavigation_Obstacle_Awareness_Use_SupervisorAwarenessCondition_PayloadT(F)
      return r
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorAwarenessCondition_PayloadT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorAwarenessCondition_Payload)
      }
      val value = readNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionType()
      return Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition_Payload(value)
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalType(): Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposal.Type = {
      val r = reader.readZ()
      return Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposal.byOrdinal(r).get
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposal_Payload(): Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposal_Payload = {
      val r = readNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposal_PayloadT(F)
      return r
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposal_PayloadT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposal_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorConstraintProposal_Payload)
      }
      val value = readNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalType()
      return Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposal_Payload(value)
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorSupervisionEventType(): Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionEvent.Type = {
      val r = reader.readZ()
      return Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionEvent.byOrdinal(r).get
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorSupervisionEvent_Payload(): Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionEvent_Payload = {
      val r = readNavigation_Obstacle_Awareness_Use_SupervisorSupervisionEvent_PayloadT(F)
      return r
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorSupervisionEvent_PayloadT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionEvent_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorSupervisionEvent_Payload)
      }
      val value = readNavigation_Obstacle_Awareness_Use_SupervisorSupervisionEventType()
      return Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionEvent_Payload(value)
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhaseType(): Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase.Type = {
      val r = reader.readZ()
      return Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase.byOrdinal(r).get
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhase_Payload(): Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase_Payload = {
      val r = readNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhase_PayloadT(F)
      return r
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhase_PayloadT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorRecoveryPhase_Payload)
      }
      val value = readNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhaseType()
      return Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase_Payload(value)
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorAcceptedActionType(): Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction.Type = {
      val r = reader.readZ()
      return Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction.byOrdinal(r).get
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorAcceptedAction_Payload(): Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction_Payload = {
      val r = readNavigation_Obstacle_Awareness_Use_SupervisorAcceptedAction_PayloadT(F)
      return r
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorAcceptedAction_PayloadT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorAcceptedAction_Payload)
      }
      val value = readNavigation_Obstacle_Awareness_Use_SupervisorAcceptedActionType()
      return Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction_Payload(value)
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorNavigationUseDirectiveType(): Navigation_Obstacle_Awareness_Use_Supervisor.NavigationUseDirective.Type = {
      val r = reader.readZ()
      return Navigation_Obstacle_Awareness_Use_Supervisor.NavigationUseDirective.byOrdinal(r).get
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorNavigationUseDirective_Payload(): Navigation_Obstacle_Awareness_Use_Supervisor.NavigationUseDirective_Payload = {
      val r = readNavigation_Obstacle_Awareness_Use_SupervisorNavigationUseDirective_PayloadT(F)
      return r
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorNavigationUseDirective_PayloadT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.NavigationUseDirective_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorNavigationUseDirective_Payload)
      }
      val value = readNavigation_Obstacle_Awareness_Use_SupervisorNavigationUseDirectiveType()
      return Navigation_Obstacle_Awareness_Use_Supervisor.NavigationUseDirective_Payload(value)
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorObstacleAwarenessNoticeType(): Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAwarenessNotice.Type = {
      val r = reader.readZ()
      return Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAwarenessNotice.byOrdinal(r).get
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorObstacleAwarenessNotice_Payload(): Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAwarenessNotice_Payload = {
      val r = readNavigation_Obstacle_Awareness_Use_SupervisorObstacleAwarenessNotice_PayloadT(F)
      return r
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorObstacleAwarenessNotice_PayloadT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAwarenessNotice_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorObstacleAwarenessNotice_Payload)
      }
      val value = readNavigation_Obstacle_Awareness_Use_SupervisorObstacleAwarenessNoticeType()
      return Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAwarenessNotice_Payload(value)
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorSupervisionStatusType(): Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionStatus.Type = {
      val r = reader.readZ()
      return Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionStatus.byOrdinal(r).get
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorSupervisionStatus_Payload(): Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionStatus_Payload = {
      val r = readNavigation_Obstacle_Awareness_Use_SupervisorSupervisionStatus_PayloadT(F)
      return r
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorSupervisionStatus_PayloadT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionStatus_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorSupervisionStatus_Payload)
      }
      val value = readNavigation_Obstacle_Awareness_Use_SupervisorSupervisionStatusType()
      return Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionStatus_Payload(value)
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

    def readNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container(): Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_P => val r = readNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PS => val r = readNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container.")
          val r = readNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PST(T)
          return r
      }
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_P(): Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_P = {
      val r = readNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PT(F)
      return r
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_P)
      }
      val api_gpsEvidence = readNavigation_Obstacle_Awareness_Use_SupervisorNavigationEvidenceType()
      return Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_P(api_gpsEvidence)
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PS(): Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PS = {
      val r = readNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PST(F)
      return r
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PST(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PS)
      }
      val api_gpsEvidence = readNavigation_Obstacle_Awareness_Use_SupervisorNavigationEvidenceType()
      return Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PS(api_gpsEvidence)
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container(): Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_P => val r = readNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PS => val r = readNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container.")
          val r = readNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PST(T)
          return r
      }
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_P(): Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_P = {
      val r = readNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PT(F)
      return r
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_P)
      }
      val api_gpsAssessment = readNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessmentType()
      return Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_P(api_gpsAssessment)
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PS(): Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PS = {
      val r = readNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PST(F)
      return r
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PST(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PS)
      }
      val api_gpsAssessment = readNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessmentType()
      return Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PS(api_gpsAssessment)
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container(): Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_P => val r = readNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PS => val r = readNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container.")
          val r = readNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PST(T)
          return r
      }
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_P(): Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_P = {
      val r = readNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PT(F)
      return r
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_P)
      }
      val api_inertialEvidence = readNavigation_Obstacle_Awareness_Use_SupervisorNavigationEvidenceType()
      return Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_P(api_inertialEvidence)
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PS(): Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PS = {
      val r = readNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PST(F)
      return r
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PST(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PS)
      }
      val api_inertialEvidence = readNavigation_Obstacle_Awareness_Use_SupervisorNavigationEvidenceType()
      return Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PS(api_inertialEvidence)
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container(): Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_P => val r = readNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PS => val r = readNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container.")
          val r = readNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PST(T)
          return r
      }
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_P(): Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_P = {
      val r = readNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PT(F)
      return r
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_P)
      }
      val api_inertialAssessment = readNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessmentType()
      return Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_P(api_inertialAssessment)
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PS(): Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PS = {
      val r = readNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PST(F)
      return r
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PST(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PS)
      }
      val api_inertialAssessment = readNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessmentType()
      return Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PS(api_inertialAssessment)
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container(): Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_P => val r = readNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PS => val r = readNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container.")
          val r = readNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PST(T)
          return r
      }
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_P(): Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_P = {
      val r = readNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PT(F)
      return r
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_P)
      }
      val api_barometricEvidence = readNavigation_Obstacle_Awareness_Use_SupervisorNavigationEvidenceType()
      return Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_P(api_barometricEvidence)
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PS(): Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PS = {
      val r = readNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PST(F)
      return r
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PST(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PS)
      }
      val api_barometricEvidence = readNavigation_Obstacle_Awareness_Use_SupervisorNavigationEvidenceType()
      return Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PS(api_barometricEvidence)
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container(): Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_P => val r = readNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PS => val r = readNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container.")
          val r = readNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PST(T)
          return r
      }
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_P(): Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_P = {
      val r = readNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PT(F)
      return r
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_P)
      }
      val api_barometricAssessment = readNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessmentType()
      return Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_P(api_barometricAssessment)
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PS(): Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PS = {
      val r = readNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PST(F)
      return r
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PST(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PS)
      }
      val api_barometricAssessment = readNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessmentType()
      return Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PS(api_barometricAssessment)
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container(): Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_P => val r = readNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PS => val r = readNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container.")
          val r = readNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PST(T)
          return r
      }
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_P(): Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_P = {
      val r = readNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PT(F)
      return r
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_P)
      }
      val api_obstacleEvidence = readNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceType()
      return Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_P(api_obstacleEvidence)
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PS(): Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PS = {
      val r = readNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PST(F)
      return r
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PST(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PS)
      }
      val api_obstacleEvidence = readNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceType()
      return Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PS(api_obstacleEvidence)
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container(): Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_P => val r = readNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PS => val r = readNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container.")
          val r = readNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PST(T)
          return r
      }
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_P(): Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_P = {
      val r = readNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PT(F)
      return r
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_P)
      }
      val api_obstacleAssessment = readNavigation_Obstacle_Awareness_Use_SupervisorObstacleAssessmentType()
      return Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_P(api_obstacleAssessment)
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PS(): Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PS = {
      val r = readNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PST(F)
      return r
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PST(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PS)
      }
      val api_obstacleAssessment = readNavigation_Obstacle_Awareness_Use_SupervisorObstacleAssessmentType()
      return Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PS(api_obstacleAssessment)
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container(): Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_P => val r = readNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PS => val r = readNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container.")
          val r = readNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_P(): Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_P = {
      val r = readNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PT(F)
      return r
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_P)
      }
      val api_barometricAssessment = readNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessmentType()
      val api_gpsAssessment = readNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessmentType()
      val api_inertialAssessment = readNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessmentType()
      return Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_P(api_barometricAssessment, api_gpsAssessment, api_inertialAssessment)
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PS(): Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PS = {
      val r = readNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PST(F)
      return r
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PST(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PS)
      }
      val api_barometricAssessment = readNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessmentType()
      val api_gpsAssessment = readNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessmentType()
      val api_inertialAssessment = readNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessmentType()
      return Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PS(api_barometricAssessment, api_gpsAssessment, api_inertialAssessment)
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container(): Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_P => val r = readNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PS => val r = readNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container.")
          val r = readNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_P(): Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_P = {
      val r = readNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PT(F)
      return r
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_P)
      }
      val api_outcomeBasis = readNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisType()
      val api_proposalBasis = readNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisType()
      return Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_P(api_outcomeBasis, api_proposalBasis)
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PS(): Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PS = {
      val r = readNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PST(F)
      return r
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PST(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PS)
      }
      val api_outcomeBasis = readNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisType()
      val api_proposalBasis = readNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisType()
      return Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PS(api_outcomeBasis, api_proposalBasis)
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container(): Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_P => val r = readNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PS => val r = readNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container.")
          val r = readNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_P(): Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_P = {
      val r = readNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PT(F)
      return r
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_P)
      }
      val api_motionContext = readNavigation_Obstacle_Awareness_Use_SupervisorMotionContextType()
      val api_obstacleAssessment = readNavigation_Obstacle_Awareness_Use_SupervisorObstacleAssessmentType()
      return Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_P(api_motionContext, api_obstacleAssessment)
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PS(): Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PS = {
      val r = readNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PST(F)
      return r
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PST(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PS)
      }
      val api_motionContext = readNavigation_Obstacle_Awareness_Use_SupervisorMotionContextType()
      val api_obstacleAssessment = readNavigation_Obstacle_Awareness_Use_SupervisorObstacleAssessmentType()
      return Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PS(api_motionContext, api_obstacleAssessment)
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container(): Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_P => val r = readNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PS => val r = readNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container.")
          val r = readNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_P(): Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_P = {
      val r = readNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PT(F)
      return r
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_P)
      }
      val api_awarenessCondition = readNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionType()
      return Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_P(api_awarenessCondition)
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PS(): Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PS = {
      val r = readNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PST(F)
      return r
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PST(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PS)
      }
      val api_awarenessCondition = readNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionType()
      return Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PS(api_awarenessCondition)
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container(): Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_P => val r = readNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PS => val r = readNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container.")
          val r = readNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_P(): Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_P = {
      val r = readNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PT(F)
      return r
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_P)
      }
      val api_awarenessCondition = readNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionType()
      val api_navigationBasis = readNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisType()
      return Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_P(api_awarenessCondition, api_navigationBasis)
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PS(): Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PS = {
      val r = readNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PST(F)
      return r
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PST(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PS)
      }
      val api_awarenessCondition = readNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionType()
      val api_navigationBasis = readNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisType()
      return Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PS(api_awarenessCondition, api_navigationBasis)
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container(): Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_P => val r = readNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PS => val r = readNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container.")
          val r = readNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_P(): Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_P = {
      val r = readNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PT(F)
      return r
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_P)
      }
      val api_constraintProposal = readNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalType()
      return Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_P(api_constraintProposal)
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PS(): Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PS = {
      val r = readNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PST(F)
      return r
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PST(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PS)
      }
      val api_constraintProposal = readNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalType()
      return Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PS(api_constraintProposal)
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container(): Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_P => val r = readNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PS => val r = readNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container.")
          val r = readNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PST(T)
          return r
      }
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_P(): Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_P = {
      val r = readNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PT(F)
      return r
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_P)
      }
      val api_constraintProposal = readNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalType()
      val api_preRecoveryPhase = readNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhaseType()
      val api_supervisionEvent = readNavigation_Obstacle_Awareness_Use_SupervisorSupervisionEventType()
      return Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_P(api_constraintProposal, api_preRecoveryPhase, api_supervisionEvent)
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PS(): Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PS = {
      val r = readNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PST(F)
      return r
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PST(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PS)
      }
      val api_constraintProposal = readNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalType()
      val api_preRecoveryPhase = readNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhaseType()
      val api_supervisionEvent = readNavigation_Obstacle_Awareness_Use_SupervisorSupervisionEventType()
      return Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PS(api_constraintProposal, api_preRecoveryPhase, api_supervisionEvent)
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container(): Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_P => val r = readNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PS => val r = readNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container.")
          val r = readNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PST(T)
          return r
      }
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_P(): Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_P = {
      val r = readNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PT(F)
      return r
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_P)
      }
      val api_outcomeAction = readNavigation_Obstacle_Awareness_Use_SupervisorAcceptedActionType()
      val api_recoveryAction = readNavigation_Obstacle_Awareness_Use_SupervisorAcceptedActionType()
      return Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_P(api_outcomeAction, api_recoveryAction)
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PS(): Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PS = {
      val r = readNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PST(F)
      return r
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PST(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PS)
      }
      val api_outcomeAction = readNavigation_Obstacle_Awareness_Use_SupervisorAcceptedActionType()
      val api_recoveryAction = readNavigation_Obstacle_Awareness_Use_SupervisorAcceptedActionType()
      return Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PS(api_outcomeAction, api_recoveryAction)
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container(): Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_P => val r = readNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PS => val r = readNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container.")
          val r = readNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_P(): Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_P = {
      val r = readNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PT(F)
      return r
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_P)
      }
      val api_acceptedAction = readNavigation_Obstacle_Awareness_Use_SupervisorAcceptedActionType()
      return Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_P(api_acceptedAction)
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PS(): Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PS = {
      val r = readNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PST(F)
      return r
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PST(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PS)
      }
      val api_acceptedAction = readNavigation_Obstacle_Awareness_Use_SupervisorAcceptedActionType()
      return Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PS(api_acceptedAction)
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container(): Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_P => val r = readNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PS => val r = readNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container.")
          val r = readNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_P(): Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_P = {
      val r = readNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PT(F)
      return r
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_P)
      }
      val api_postRecoveryPhase = readNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhaseType()
      val api_preRecoveryPhase = readNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhaseType()
      return Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_P(api_postRecoveryPhase, api_preRecoveryPhase)
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PS(): Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PS = {
      val r = readNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PST(F)
      return r
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PST(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PS)
      }
      val api_postRecoveryPhase = readNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhaseType()
      val api_preRecoveryPhase = readNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhaseType()
      return Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PS(api_postRecoveryPhase, api_preRecoveryPhase)
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container(): Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_P => val r = readNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PS => val r = readNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container.")
          val r = readNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_P(): Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_P = {
      val r = readNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PT(F)
      return r
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_P)
      }
      val api_acceptedAction = readNavigation_Obstacle_Awareness_Use_SupervisorAcceptedActionType()
      val api_navigationBasis = readNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisType()
      val api_postRecoveryPhase = readNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhaseType()
      return Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_P(api_acceptedAction, api_navigationBasis, api_postRecoveryPhase)
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PS(): Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PS = {
      val r = readNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PST(F)
      return r
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PST(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PS)
      }
      val api_acceptedAction = readNavigation_Obstacle_Awareness_Use_SupervisorAcceptedActionType()
      val api_navigationBasis = readNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisType()
      val api_postRecoveryPhase = readNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhaseType()
      return Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PS(api_acceptedAction, api_navigationBasis, api_postRecoveryPhase)
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container(): Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_P => val r = readNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PS => val r = readNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container.")
          val r = readNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_P(): Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_P = {
      val r = readNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PT(F)
      return r
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_P)
      }
      val api_navigationUseDirective = readNavigation_Obstacle_Awareness_Use_SupervisorNavigationUseDirectiveType()
      val api_obstacleAwarenessNotice = readNavigation_Obstacle_Awareness_Use_SupervisorObstacleAwarenessNoticeType()
      val api_supervisionStatus = readNavigation_Obstacle_Awareness_Use_SupervisorSupervisionStatusType()
      return Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_P(api_navigationUseDirective, api_obstacleAwarenessNotice, api_supervisionStatus)
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PS(): Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PS = {
      val r = readNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PST(F)
      return r
    }

    def readNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PST(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Navigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PS)
      }
      val api_navigationUseDirective = readNavigation_Obstacle_Awareness_Use_SupervisorNavigationUseDirectiveType()
      val api_obstacleAwarenessNotice = readNavigation_Obstacle_Awareness_Use_SupervisorObstacleAwarenessNoticeType()
      val api_supervisionStatus = readNavigation_Obstacle_Awareness_Use_SupervisorSupervisionStatusType()
      return Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PS(api_navigationUseDirective, api_obstacleAwarenessNotice, api_supervisionStatus)
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
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_P => val r = readNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PS => val r = readNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PST(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_P => val r = readNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PS => val r = readNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PST(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_P => val r = readNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_P => val r = readNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_P => val r = readNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PS => val r = readNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PST(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PS => val r = readNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PST(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PS => val r = readNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PST(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_P => val r = readNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PS => val r = readNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PST(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_P => val r = readNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_P => val r = readNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PS => val r = readNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PST(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PS => val r = readNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PST(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_P => val r = readNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_P => val r = readNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_P => val r = readNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PS => val r = readNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PST(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PS => val r = readNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PST(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PS => val r = readNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PST(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_P => val r = readNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_P => val r = readNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PS => val r = readNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PST(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PS => val r = readNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PST(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_P => val r = readNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PS => val r = readNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PST(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_P => val r = readNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_P => val r = readNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PS => val r = readNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PST(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PS => val r = readNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PST(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_P => val r = readNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_P => val r = readNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PS => val r = readNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PST(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PS => val r = readNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PST(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_P => val r = readNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PS => val r = readNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PST(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_P => val r = readNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PS => val r = readNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of util.Container.")
          val r = readNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PST(T)
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
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorRecoveryPhase_Payload => val r = readNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhase_PayloadT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorMotionContext_Payload => val r = readNavigation_Obstacle_Awareness_Use_SupervisorMotionContext_PayloadT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorAcceptedAction_Payload => val r = readNavigation_Obstacle_Awareness_Use_SupervisorAcceptedAction_PayloadT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorNavigationBasis_Payload => val r = readNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasis_PayloadT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorSupervisionEvent_Payload => val r = readNavigation_Obstacle_Awareness_Use_SupervisorSupervisionEvent_PayloadT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorObstacleEvidence_Payload => val r = readNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidence_PayloadT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorSupervisionStatus_Payload => val r = readNavigation_Obstacle_Awareness_Use_SupervisorSupervisionStatus_PayloadT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessment_Payload => val r = readNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessment_PayloadT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorObstacleAssessment_Payload => val r = readNavigation_Obstacle_Awareness_Use_SupervisorObstacleAssessment_PayloadT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorNavigationEvidence_Payload => val r = readNavigation_Obstacle_Awareness_Use_SupervisorNavigationEvidence_PayloadT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorConstraintProposal_Payload => val r = readNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposal_PayloadT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorAwarenessCondition_Payload => val r = readNavigation_Obstacle_Awareness_Use_SupervisorAwarenessCondition_PayloadT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorNavigationUseDirective_Payload => val r = readNavigation_Obstacle_Awareness_Use_SupervisorNavigationUseDirective_PayloadT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorObstacleAwarenessNotice_Payload => val r = readNavigation_Obstacle_Awareness_Use_SupervisorObstacleAwarenessNotice_PayloadT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_P => val r = readNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PS => val r = readNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PST(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_P => val r = readNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PS => val r = readNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PST(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_P => val r = readNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_P => val r = readNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_P => val r = readNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PS => val r = readNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PST(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PS => val r = readNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PST(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PS => val r = readNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PST(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_P => val r = readNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PS => val r = readNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PST(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_P => val r = readNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_P => val r = readNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PS => val r = readNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PST(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PS => val r = readNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PST(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_P => val r = readNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_P => val r = readNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_P => val r = readNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PS => val r = readNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PST(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PS => val r = readNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PST(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PS => val r = readNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PST(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_P => val r = readNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_P => val r = readNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PS => val r = readNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PST(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PS => val r = readNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PST(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_P => val r = readNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PS => val r = readNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PST(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_P => val r = readNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_P => val r = readNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PS => val r = readNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PST(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PS => val r = readNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PST(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_P => val r = readNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_P => val r = readNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PS => val r = readNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PST(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PS => val r = readNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PST(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_P => val r = readNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PS => val r = readNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PST(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_P => val r = readNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PT(T); return r
        case Constants.Navigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PS => val r = readNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of art.DataContent.")
          val r = readNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PST(T)
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

  def fromNavigation_Obstacle_Awareness_Use_SupervisorNavigationEvidence_Payload(o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationEvidence_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorNavigationEvidence_Payload(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorNavigationEvidence_Payload(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.NavigationEvidence_Payload, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorNavigationEvidence_Payload(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.NavigationEvidence_Payload = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorNavigationEvidence_Payload()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorNavigationEvidence_Payload _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessment_Payload(o: Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessment_Payload(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessment_Payload(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment_Payload, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessment_Payload(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment_Payload = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessment_Payload()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessment_Payload _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidence_Payload(o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidence_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidence_Payload(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidence_Payload(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidence_Payload, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidence_Payload(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidence_Payload = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidence_Payload()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidence_Payload _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorObstacleAssessment_Payload(o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAssessment_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorObstacleAssessment_Payload(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorObstacleAssessment_Payload(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAssessment_Payload, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorObstacleAssessment_Payload(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAssessment_Payload = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorObstacleAssessment_Payload()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorObstacleAssessment_Payload _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasis_Payload(o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasis_Payload(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasis_Payload(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis_Payload, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasis_Payload(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis_Payload = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasis_Payload()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasis_Payload _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorMotionContext_Payload(o: Navigation_Obstacle_Awareness_Use_Supervisor.MotionContext_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorMotionContext_Payload(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorMotionContext_Payload(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.MotionContext_Payload, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorMotionContext_Payload(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.MotionContext_Payload = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorMotionContext_Payload()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorMotionContext_Payload _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorAwarenessCondition_Payload(o: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorAwarenessCondition_Payload(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorAwarenessCondition_Payload(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition_Payload, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorAwarenessCondition_Payload(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition_Payload = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorAwarenessCondition_Payload()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorAwarenessCondition_Payload _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposal_Payload(o: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposal_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposal_Payload(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposal_Payload(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposal_Payload, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposal_Payload(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposal_Payload = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposal_Payload()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposal_Payload _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorSupervisionEvent_Payload(o: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionEvent_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorSupervisionEvent_Payload(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorSupervisionEvent_Payload(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionEvent_Payload, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorSupervisionEvent_Payload(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionEvent_Payload = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorSupervisionEvent_Payload()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorSupervisionEvent_Payload _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhase_Payload(o: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhase_Payload(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhase_Payload(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase_Payload, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhase_Payload(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase_Payload = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhase_Payload()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhase_Payload _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorAcceptedAction_Payload(o: Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorAcceptedAction_Payload(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorAcceptedAction_Payload(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction_Payload, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorAcceptedAction_Payload(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction_Payload = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorAcceptedAction_Payload()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorAcceptedAction_Payload _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorNavigationUseDirective_Payload(o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationUseDirective_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorNavigationUseDirective_Payload(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorNavigationUseDirective_Payload(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.NavigationUseDirective_Payload, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorNavigationUseDirective_Payload(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.NavigationUseDirective_Payload = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorNavigationUseDirective_Payload()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorNavigationUseDirective_Payload _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorObstacleAwarenessNotice_Payload(o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAwarenessNotice_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorObstacleAwarenessNotice_Payload(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorObstacleAwarenessNotice_Payload(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAwarenessNotice_Payload, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorObstacleAwarenessNotice_Payload(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAwarenessNotice_Payload = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorObstacleAwarenessNotice_Payload()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorObstacleAwarenessNotice_Payload _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorSupervisionStatus_Payload(o: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionStatus_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorSupervisionStatus_Payload(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorSupervisionStatus_Payload(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionStatus_Payload, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorSupervisionStatus_Payload(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionStatus_Payload = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorSupervisionStatus_Payload()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorSupervisionStatus_Payload _)
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

  def fromNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_P(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_P(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_P(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_P = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_P()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_P _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PS(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PS(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PS(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PS = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PS()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PS _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_P(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_P(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_P(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_P = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_P()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_P _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PS(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PS(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PS(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PS = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PS()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PS _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_P(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_P(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_P(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_P = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_P()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_P _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PS(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PS(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PS(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PS = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PS()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PS _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_P(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_P(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_P(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_P = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_P()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_P _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PS(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PS(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PS(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PS = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PS()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PS _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_P(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_P(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_P(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_P = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_P()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_P _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PS(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PS(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PS(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PS = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PS()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PS _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_P(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_P(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_P(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_P = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_P()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_P _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PS(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PS(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PS(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PS = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PS()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PS _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_P(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_P(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_P(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_P = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_P()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_P _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PS(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PS(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PS(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PS = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PS()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PS _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_P(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_P(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_P(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_P = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_P()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_P _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PS(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PS(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PS(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PS = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PS()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PS _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_P(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_P(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_P(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_P = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_P _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PS(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PS(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PS(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PS = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PS _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_P(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_P(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_P(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_P = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_P _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PS(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PS(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PS(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PS = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PS _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_P(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_P(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_P(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_P = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_P _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PS(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PS(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PS(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PS = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PS _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_P(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_P(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_P(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_P = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_P _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PS(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PS(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PS(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PS = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PS _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_P(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_P(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_P(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_P = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_P _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PS(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PS(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PS(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PS = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PS _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_P(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_P(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_P(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_P = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_P _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PS(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PS(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PS(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PS = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PS _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_P(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_P(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_P(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_P = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_P()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_P _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PS(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PS(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PS(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PS = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PS()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PS _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_P(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_P(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_P(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_P = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_P()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_P _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PS(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PS(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PS(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PS = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PS()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PS _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_P(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_P(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_P(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_P = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_P _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PS(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PS(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PS(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PS = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PS _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_P(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_P(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_P(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_P = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_P _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PS(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PS(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PS(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PS = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PS _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_P(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_P(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_P(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_P = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_P _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PS(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PS(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PS(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PS = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PS _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_P(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_P(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_P(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_P = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_P _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PS(o)
    return w.result
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PS(data: ISZ[U8]): Either[Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PS(reader: Reader): Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PS = {
      val r = reader.readNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PS _)
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