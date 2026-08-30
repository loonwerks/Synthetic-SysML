// #Sireum
// @formatter:off

// This file is auto-generated from NavigationEvidence.scala, EvidenceAssessment.scala, ObstacleEvidence.scala, ObstacleAssessment.scala, NavigationBasis.scala, MotionContext.scala, AwarenessCondition.scala, ConstraintProposal.scala, SupervisionEvent.scala, RecoveryPhase.scala, AcceptedAction.scala, NavigationUseDirective.scala, ObstacleAwarenessNotice.scala, SupervisionStatus.scala, Base_Types.scala, GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_Containers.scala, InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_Containers.scala, BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_Containers.scala, ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_Containers.scala, NavigationBasisOwner_supervisorProcess_navigationBasisOwner_Containers.scala, AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_Containers.scala, ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_Containers.scala, EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_Containers.scala, RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_Containers.scala, SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package scp_candidate

import org.sireum._
import org.sireum.Json.Printer._

object JSON {

  object Printer {

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorNavigationEvidenceType(o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationEvidence.Type): ST = {
      val value: String = o match {
        case Navigation_Obstacle_Awareness_Use_Supervisor.NavigationEvidence.NOMINAL_CURRENT => "NOMINAL_CURRENT"
        case Navigation_Obstacle_Awareness_Use_Supervisor.NavigationEvidence.DEGRADED_CURRENT => "DEGRADED_CURRENT"
        case Navigation_Obstacle_Awareness_Use_Supervisor.NavigationEvidence.UNAVAILABLE_CURRENT => "UNAVAILABLE_CURRENT"
        case Navigation_Obstacle_Awareness_Use_Supervisor.NavigationEvidence.STALE => "STALE"
        case Navigation_Obstacle_Awareness_Use_Supervisor.NavigationEvidence.INVALID => "INVALID"
      }
      return printObject(ISZ(
        ("type", printString("Navigation_Obstacle_Awareness_Use_Supervisor.NavigationEvidence")),
        ("value", printString(value))
      ))
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorNavigationEvidence_Payload(o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationEvidence_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Navigation_Obstacle_Awareness_Use_Supervisor.NavigationEvidence_Payload""""),
        ("value", printNavigation_Obstacle_Awareness_Use_SupervisorNavigationEvidenceType(o.value))
      ))
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessmentType(o: Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment.Type): ST = {
      val value: String = o match {
        case Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment.READY => "READY"
        case Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment.LIMITED => "LIMITED"
        case Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment.REJECTED => "REJECTED"
      }
      return printObject(ISZ(
        ("type", printString("Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment")),
        ("value", printString(value))
      ))
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessment_Payload(o: Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment_Payload""""),
        ("value", printNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessmentType(o.value))
      ))
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceType(o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidence.Type): ST = {
      val value: String = o match {
        case Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidence.NO_INDICATION_CURRENT => "NO_INDICATION_CURRENT"
        case Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidence.INDICATION_CURRENT => "INDICATION_CURRENT"
        case Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidence.UNAVAILABLE_CURRENT => "UNAVAILABLE_CURRENT"
        case Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidence.STALE => "STALE"
        case Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidence.INVALID => "INVALID"
      }
      return printObject(ISZ(
        ("type", printString("Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidence")),
        ("value", printString(value))
      ))
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidence_Payload(o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidence_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidence_Payload""""),
        ("value", printNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceType(o.value))
      ))
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorObstacleAssessmentType(o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAssessment.Type): ST = {
      val value: String = o match {
        case Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAssessment.NO_INDICATION => "NO_INDICATION"
        case Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAssessment.INDICATED => "INDICATED"
        case Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAssessment.UNAVAILABLE => "UNAVAILABLE"
      }
      return printObject(ISZ(
        ("type", printString("Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAssessment")),
        ("value", printString(value))
      ))
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorObstacleAssessment_Payload(o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAssessment_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAssessment_Payload""""),
        ("value", printNavigation_Obstacle_Awareness_Use_SupervisorObstacleAssessmentType(o.value))
      ))
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisType(o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis.Type): ST = {
      val value: String = o match {
        case Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis.FULL_BASIS => "FULL_BASIS"
        case Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis.RELATIVE_BASIS => "RELATIVE_BASIS"
        case Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis.LIMITED_BASIS => "LIMITED_BASIS"
        case Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis.UNUSABLE_BASIS => "UNUSABLE_BASIS"
      }
      return printObject(ISZ(
        ("type", printString("Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis")),
        ("value", printString(value))
      ))
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasis_Payload(o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis_Payload""""),
        ("value", printNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisType(o.value))
      ))
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorMotionContextType(o: Navigation_Obstacle_Awareness_Use_Supervisor.MotionContext.Type): ST = {
      val value: String = o match {
        case Navigation_Obstacle_Awareness_Use_Supervisor.MotionContext.STATIONARY => "STATIONARY"
        case Navigation_Obstacle_Awareness_Use_Supervisor.MotionContext.TRANSLATING => "TRANSLATING"
        case Navigation_Obstacle_Awareness_Use_Supervisor.MotionContext.LANDING_CONTEXT => "LANDING_CONTEXT"
        case Navigation_Obstacle_Awareness_Use_Supervisor.MotionContext.UNKNOWN => "UNKNOWN"
      }
      return printObject(ISZ(
        ("type", printString("Navigation_Obstacle_Awareness_Use_Supervisor.MotionContext")),
        ("value", printString(value))
      ))
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorMotionContext_Payload(o: Navigation_Obstacle_Awareness_Use_Supervisor.MotionContext_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Navigation_Obstacle_Awareness_Use_Supervisor.MotionContext_Payload""""),
        ("value", printNavigation_Obstacle_Awareness_Use_SupervisorMotionContextType(o.value))
      ))
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionType(o: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition.Type): ST = {
      val value: String = o match {
        case Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition.AWARENESS_CLEAR => "AWARENESS_CLEAR"
        case Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition.ACTIVE_OBSTACLE_CONFLICT => "ACTIVE_OBSTACLE_CONFLICT"
        case Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition.STATIONARY_OBSTACLE_PRESENT => "STATIONARY_OBSTACLE_PRESENT"
        case Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition.ACTIVE_AWARENESS_LOSS => "ACTIVE_AWARENESS_LOSS"
        case Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition.STATIONARY_AWARENESS_UNAVAILABLE => "STATIONARY_AWARENESS_UNAVAILABLE"
      }
      return printObject(ISZ(
        ("type", printString("Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition")),
        ("value", printString(value))
      ))
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorAwarenessCondition_Payload(o: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition_Payload""""),
        ("value", printNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionType(o.value))
      ))
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalType(o: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposal.Type): ST = {
      val value: String = o match {
        case Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposal.HOLD_OBSTACLE => "HOLD_OBSTACLE"
        case Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposal.HOLD_AWARENESS => "HOLD_AWARENESS"
        case Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposal.HOLD_NAVIGATION => "HOLD_NAVIGATION"
        case Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposal.RESTRICT_NAVIGATION => "RESTRICT_NAVIGATION"
        case Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposal.ALLOW_FULL => "ALLOW_FULL"
      }
      return printObject(ISZ(
        ("type", printString("Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposal")),
        ("value", printString(value))
      ))
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposal_Payload(o: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposal_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposal_Payload""""),
        ("value", printNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalType(o.value))
      ))
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorSupervisionEventType(o: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionEvent.Type): ST = {
      val value: String = o match {
        case Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionEvent.NONE => "NONE"
        case Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionEvent.RESET_ONLY => "RESET_ONLY"
        case Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionEvent.FORCE_HOLD_ONLY => "FORCE_HOLD_ONLY"
        case Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionEvent.FORCE_HOLD_WITH_RESET => "FORCE_HOLD_WITH_RESET"
      }
      return printObject(ISZ(
        ("type", printString("Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionEvent")),
        ("value", printString(value))
      ))
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorSupervisionEvent_Payload(o: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionEvent_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionEvent_Payload""""),
        ("value", printNavigation_Obstacle_Awareness_Use_SupervisorSupervisionEventType(o.value))
      ))
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhaseType(o: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase.Type): ST = {
      val value: String = o match {
        case Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase.WAIT_RELEASE => "WAIT_RELEASE"
        case Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase.ARMED => "ARMED"
        case Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase.OPEN => "OPEN"
        case Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase.LATCHED => "LATCHED"
      }
      return printObject(ISZ(
        ("type", printString("Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase")),
        ("value", printString(value))
      ))
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhase_Payload(o: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase_Payload""""),
        ("value", printNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhaseType(o.value))
      ))
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorAcceptedActionType(o: Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction.Type): ST = {
      val value: String = o match {
        case Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction.APPLY_OBSTACLE_HOLD => "APPLY_OBSTACLE_HOLD"
        case Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction.APPLY_AWARENESS_HOLD => "APPLY_AWARENESS_HOLD"
        case Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction.APPLY_NAV_HOLD => "APPLY_NAV_HOLD"
        case Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction.APPLY_EXTERNAL_HOLD => "APPLY_EXTERNAL_HOLD"
        case Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction.APPLY_RESTRICTED => "APPLY_RESTRICTED"
        case Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction.APPLY_FULL => "APPLY_FULL"
        case Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction.ACCEPT_RESET => "ACCEPT_RESET"
        case Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction.IGNORE_RESET => "IGNORE_RESET"
      }
      return printObject(ISZ(
        ("type", printString("Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction")),
        ("value", printString(value))
      ))
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorAcceptedAction_Payload(o: Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction_Payload""""),
        ("value", printNavigation_Obstacle_Awareness_Use_SupervisorAcceptedActionType(o.value))
      ))
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorNavigationUseDirectiveType(o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationUseDirective.Type): ST = {
      val value: String = o match {
        case Navigation_Obstacle_Awareness_Use_Supervisor.NavigationUseDirective.MOTION_INHIBITED => "MOTION_INHIBITED"
        case Navigation_Obstacle_Awareness_Use_Supervisor.NavigationUseDirective.RESTRICTED_NAV_USE => "RESTRICTED_NAV_USE"
        case Navigation_Obstacle_Awareness_Use_Supervisor.NavigationUseDirective.FULL_NAV_USE => "FULL_NAV_USE"
      }
      return printObject(ISZ(
        ("type", printString("Navigation_Obstacle_Awareness_Use_Supervisor.NavigationUseDirective")),
        ("value", printString(value))
      ))
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorNavigationUseDirective_Payload(o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationUseDirective_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Navigation_Obstacle_Awareness_Use_Supervisor.NavigationUseDirective_Payload""""),
        ("value", printNavigation_Obstacle_Awareness_Use_SupervisorNavigationUseDirectiveType(o.value))
      ))
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorObstacleAwarenessNoticeType(o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAwarenessNotice.Type): ST = {
      val value: String = o match {
        case Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAwarenessNotice.NO_CURRENT_INDICATION => "NO_CURRENT_INDICATION"
        case Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAwarenessNotice.CURRENT_INDICATION => "CURRENT_INDICATION"
        case Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAwarenessNotice.AWARENESS_UNAVAILABLE => "AWARENESS_UNAVAILABLE"
      }
      return printObject(ISZ(
        ("type", printString("Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAwarenessNotice")),
        ("value", printString(value))
      ))
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorObstacleAwarenessNotice_Payload(o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAwarenessNotice_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAwarenessNotice_Payload""""),
        ("value", printNavigation_Obstacle_Awareness_Use_SupervisorObstacleAwarenessNoticeType(o.value))
      ))
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorSupervisionStatusType(o: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionStatus.Type): ST = {
      val value: String = o match {
        case Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionStatus.STARTUP_HOLD => "STARTUP_HOLD"
        case Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionStatus.FULL_USE => "FULL_USE"
        case Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionStatus.RESTRICTED_USE => "RESTRICTED_USE"
        case Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionStatus.HELD_NAV_EVIDENCE => "HELD_NAV_EVIDENCE"
        case Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionStatus.HELD_OBSTACLE_INDICATION => "HELD_OBSTACLE_INDICATION"
        case Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionStatus.HELD_AWARENESS_LOSS => "HELD_AWARENESS_LOSS"
        case Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionStatus.HELD_EXTERNAL => "HELD_EXTERNAL"
        case Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionStatus.RESET_RELEASE_REQUIRED => "RESET_RELEASE_REQUIRED"
        case Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionStatus.RESET_REQUIRED => "RESET_REQUIRED"
      }
      return printObject(ISZ(
        ("type", printString("Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionStatus")),
        ("value", printString(value))
      ))
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorSupervisionStatus_Payload(o: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionStatus_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionStatus_Payload""""),
        ("value", printNavigation_Obstacle_Awareness_Use_SupervisorSupervisionStatusType(o.value))
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

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container): ST = {
      o match {
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_P => return printNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PS => return printNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PS(o)
      }
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_P""""),
        ("api_gpsEvidence", printNavigation_Obstacle_Awareness_Use_SupervisorNavigationEvidenceType(o.api_gpsEvidence))
      ))
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PS""""),
        ("api_gpsEvidence", printNavigation_Obstacle_Awareness_Use_SupervisorNavigationEvidenceType(o.api_gpsEvidence))
      ))
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container): ST = {
      o match {
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_P => return printNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PS => return printNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PS(o)
      }
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_P""""),
        ("api_gpsAssessment", printNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessmentType(o.api_gpsAssessment))
      ))
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PS""""),
        ("api_gpsAssessment", printNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessmentType(o.api_gpsAssessment))
      ))
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container): ST = {
      o match {
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_P => return printNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PS => return printNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PS(o)
      }
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_P""""),
        ("api_inertialEvidence", printNavigation_Obstacle_Awareness_Use_SupervisorNavigationEvidenceType(o.api_inertialEvidence))
      ))
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PS""""),
        ("api_inertialEvidence", printNavigation_Obstacle_Awareness_Use_SupervisorNavigationEvidenceType(o.api_inertialEvidence))
      ))
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container): ST = {
      o match {
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_P => return printNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PS => return printNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PS(o)
      }
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_P""""),
        ("api_inertialAssessment", printNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessmentType(o.api_inertialAssessment))
      ))
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PS""""),
        ("api_inertialAssessment", printNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessmentType(o.api_inertialAssessment))
      ))
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container): ST = {
      o match {
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_P => return printNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PS => return printNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PS(o)
      }
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_P""""),
        ("api_barometricEvidence", printNavigation_Obstacle_Awareness_Use_SupervisorNavigationEvidenceType(o.api_barometricEvidence))
      ))
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PS""""),
        ("api_barometricEvidence", printNavigation_Obstacle_Awareness_Use_SupervisorNavigationEvidenceType(o.api_barometricEvidence))
      ))
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container): ST = {
      o match {
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_P => return printNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PS => return printNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PS(o)
      }
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_P""""),
        ("api_barometricAssessment", printNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessmentType(o.api_barometricAssessment))
      ))
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PS""""),
        ("api_barometricAssessment", printNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessmentType(o.api_barometricAssessment))
      ))
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container): ST = {
      o match {
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_P => return printNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PS => return printNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PS(o)
      }
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_P""""),
        ("api_obstacleEvidence", printNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceType(o.api_obstacleEvidence))
      ))
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PS""""),
        ("api_obstacleEvidence", printNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceType(o.api_obstacleEvidence))
      ))
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container): ST = {
      o match {
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_P => return printNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PS => return printNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PS(o)
      }
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_P""""),
        ("api_obstacleAssessment", printNavigation_Obstacle_Awareness_Use_SupervisorObstacleAssessmentType(o.api_obstacleAssessment))
      ))
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PS""""),
        ("api_obstacleAssessment", printNavigation_Obstacle_Awareness_Use_SupervisorObstacleAssessmentType(o.api_obstacleAssessment))
      ))
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container): ST = {
      o match {
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_P => return printNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PS => return printNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PS(o)
      }
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_P""""),
        ("api_barometricAssessment", printNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessmentType(o.api_barometricAssessment)),
        ("api_gpsAssessment", printNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessmentType(o.api_gpsAssessment)),
        ("api_inertialAssessment", printNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessmentType(o.api_inertialAssessment))
      ))
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PS""""),
        ("api_barometricAssessment", printNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessmentType(o.api_barometricAssessment)),
        ("api_gpsAssessment", printNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessmentType(o.api_gpsAssessment)),
        ("api_inertialAssessment", printNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessmentType(o.api_inertialAssessment))
      ))
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container): ST = {
      o match {
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_P => return printNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PS => return printNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PS(o)
      }
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_P""""),
        ("api_outcomeBasis", printNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisType(o.api_outcomeBasis)),
        ("api_proposalBasis", printNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisType(o.api_proposalBasis))
      ))
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PS""""),
        ("api_outcomeBasis", printNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisType(o.api_outcomeBasis)),
        ("api_proposalBasis", printNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisType(o.api_proposalBasis))
      ))
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container): ST = {
      o match {
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_P => return printNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PS => return printNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PS(o)
      }
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_P""""),
        ("api_motionContext", printNavigation_Obstacle_Awareness_Use_SupervisorMotionContextType(o.api_motionContext)),
        ("api_obstacleAssessment", printNavigation_Obstacle_Awareness_Use_SupervisorObstacleAssessmentType(o.api_obstacleAssessment))
      ))
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PS""""),
        ("api_motionContext", printNavigation_Obstacle_Awareness_Use_SupervisorMotionContextType(o.api_motionContext)),
        ("api_obstacleAssessment", printNavigation_Obstacle_Awareness_Use_SupervisorObstacleAssessmentType(o.api_obstacleAssessment))
      ))
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container): ST = {
      o match {
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_P => return printNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PS => return printNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PS(o)
      }
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_P""""),
        ("api_awarenessCondition", printNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionType(o.api_awarenessCondition))
      ))
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PS""""),
        ("api_awarenessCondition", printNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionType(o.api_awarenessCondition))
      ))
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container): ST = {
      o match {
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_P => return printNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PS => return printNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PS(o)
      }
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_P""""),
        ("api_awarenessCondition", printNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionType(o.api_awarenessCondition)),
        ("api_navigationBasis", printNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisType(o.api_navigationBasis))
      ))
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PS""""),
        ("api_awarenessCondition", printNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionType(o.api_awarenessCondition)),
        ("api_navigationBasis", printNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisType(o.api_navigationBasis))
      ))
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container): ST = {
      o match {
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_P => return printNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PS => return printNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PS(o)
      }
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_P""""),
        ("api_constraintProposal", printNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalType(o.api_constraintProposal))
      ))
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PS""""),
        ("api_constraintProposal", printNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalType(o.api_constraintProposal))
      ))
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container): ST = {
      o match {
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_P => return printNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PS => return printNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PS(o)
      }
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_P""""),
        ("api_constraintProposal", printNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalType(o.api_constraintProposal)),
        ("api_preRecoveryPhase", printNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhaseType(o.api_preRecoveryPhase)),
        ("api_supervisionEvent", printNavigation_Obstacle_Awareness_Use_SupervisorSupervisionEventType(o.api_supervisionEvent))
      ))
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PS""""),
        ("api_constraintProposal", printNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalType(o.api_constraintProposal)),
        ("api_preRecoveryPhase", printNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhaseType(o.api_preRecoveryPhase)),
        ("api_supervisionEvent", printNavigation_Obstacle_Awareness_Use_SupervisorSupervisionEventType(o.api_supervisionEvent))
      ))
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container): ST = {
      o match {
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_P => return printNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PS => return printNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PS(o)
      }
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_P""""),
        ("api_outcomeAction", printNavigation_Obstacle_Awareness_Use_SupervisorAcceptedActionType(o.api_outcomeAction)),
        ("api_recoveryAction", printNavigation_Obstacle_Awareness_Use_SupervisorAcceptedActionType(o.api_recoveryAction))
      ))
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PS""""),
        ("api_outcomeAction", printNavigation_Obstacle_Awareness_Use_SupervisorAcceptedActionType(o.api_outcomeAction)),
        ("api_recoveryAction", printNavigation_Obstacle_Awareness_Use_SupervisorAcceptedActionType(o.api_recoveryAction))
      ))
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container): ST = {
      o match {
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_P => return printNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PS => return printNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PS(o)
      }
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_P""""),
        ("api_acceptedAction", printNavigation_Obstacle_Awareness_Use_SupervisorAcceptedActionType(o.api_acceptedAction))
      ))
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PS""""),
        ("In_committedRecoveryPhase", printNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhaseType(o.In_committedRecoveryPhase)),
        ("api_acceptedAction", printNavigation_Obstacle_Awareness_Use_SupervisorAcceptedActionType(o.api_acceptedAction))
      ))
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container): ST = {
      o match {
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_P => return printNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PS => return printNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PS(o)
      }
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_P""""),
        ("api_postRecoveryPhase", printNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhaseType(o.api_postRecoveryPhase)),
        ("api_preRecoveryPhase", printNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhaseType(o.api_preRecoveryPhase))
      ))
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PS""""),
        ("committedRecoveryPhase", printNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhaseType(o.committedRecoveryPhase)),
        ("api_postRecoveryPhase", printNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhaseType(o.api_postRecoveryPhase)),
        ("api_preRecoveryPhase", printNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhaseType(o.api_preRecoveryPhase))
      ))
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container): ST = {
      o match {
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_P => return printNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PS => return printNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PS(o)
      }
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_P""""),
        ("api_acceptedAction", printNavigation_Obstacle_Awareness_Use_SupervisorAcceptedActionType(o.api_acceptedAction)),
        ("api_navigationBasis", printNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisType(o.api_navigationBasis)),
        ("api_postRecoveryPhase", printNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhaseType(o.api_postRecoveryPhase))
      ))
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PS""""),
        ("api_acceptedAction", printNavigation_Obstacle_Awareness_Use_SupervisorAcceptedActionType(o.api_acceptedAction)),
        ("api_navigationBasis", printNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisType(o.api_navigationBasis)),
        ("api_postRecoveryPhase", printNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhaseType(o.api_postRecoveryPhase))
      ))
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container): ST = {
      o match {
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_P => return printNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PS => return printNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PS(o)
      }
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_P""""),
        ("api_navigationUseDirective", printNavigation_Obstacle_Awareness_Use_SupervisorNavigationUseDirectiveType(o.api_navigationUseDirective)),
        ("api_obstacleAwarenessNotice", printNavigation_Obstacle_Awareness_Use_SupervisorObstacleAwarenessNoticeType(o.api_obstacleAwarenessNotice)),
        ("api_supervisionStatus", printNavigation_Obstacle_Awareness_Use_SupervisorSupervisionStatusType(o.api_supervisionStatus))
      ))
    }

    @pure def printNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PS""""),
        ("api_navigationUseDirective", printNavigation_Obstacle_Awareness_Use_SupervisorNavigationUseDirectiveType(o.api_navigationUseDirective)),
        ("api_obstacleAwarenessNotice", printNavigation_Obstacle_Awareness_Use_SupervisorObstacleAwarenessNoticeType(o.api_obstacleAwarenessNotice)),
        ("api_supervisionStatus", printNavigation_Obstacle_Awareness_Use_SupervisorSupervisionStatusType(o.api_supervisionStatus))
      ))
    }

    @pure def printruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): ST = {
      val value: String = o match {
        case runtimemonitor.ObservationKind.NavigationObstacleAwarenessUseSupervisorSystem_Instance_supervisorProcess_gpsEvidenceQualifier_postInit => "NavigationObstacleAwarenessUseSupervisorSystem_Instance_supervisorProcess_gpsEvidenceQualifier_postInit"
        case runtimemonitor.ObservationKind.NavigationObstacleAwarenessUseSupervisorSystem_Instance_supervisorProcess_gpsEvidenceQualifier_preCompute => "NavigationObstacleAwarenessUseSupervisorSystem_Instance_supervisorProcess_gpsEvidenceQualifier_preCompute"
        case runtimemonitor.ObservationKind.NavigationObstacleAwarenessUseSupervisorSystem_Instance_supervisorProcess_gpsEvidenceQualifier_postCompute => "NavigationObstacleAwarenessUseSupervisorSystem_Instance_supervisorProcess_gpsEvidenceQualifier_postCompute"
        case runtimemonitor.ObservationKind.NavigationObstacleAwarenessUseSupervisorSystem_Instance_supervisorProcess_inertialEvidenceQualifier_postInit => "NavigationObstacleAwarenessUseSupervisorSystem_Instance_supervisorProcess_inertialEvidenceQualifier_postInit"
        case runtimemonitor.ObservationKind.NavigationObstacleAwarenessUseSupervisorSystem_Instance_supervisorProcess_inertialEvidenceQualifier_preCompute => "NavigationObstacleAwarenessUseSupervisorSystem_Instance_supervisorProcess_inertialEvidenceQualifier_preCompute"
        case runtimemonitor.ObservationKind.NavigationObstacleAwarenessUseSupervisorSystem_Instance_supervisorProcess_inertialEvidenceQualifier_postCompute => "NavigationObstacleAwarenessUseSupervisorSystem_Instance_supervisorProcess_inertialEvidenceQualifier_postCompute"
        case runtimemonitor.ObservationKind.NavigationObstacleAwarenessUseSupervisorSystem_Instance_supervisorProcess_barometricEvidenceQualifier_postInit => "NavigationObstacleAwarenessUseSupervisorSystem_Instance_supervisorProcess_barometricEvidenceQualifier_postInit"
        case runtimemonitor.ObservationKind.NavigationObstacleAwarenessUseSupervisorSystem_Instance_supervisorProcess_barometricEvidenceQualifier_preCompute => "NavigationObstacleAwarenessUseSupervisorSystem_Instance_supervisorProcess_barometricEvidenceQualifier_preCompute"
        case runtimemonitor.ObservationKind.NavigationObstacleAwarenessUseSupervisorSystem_Instance_supervisorProcess_barometricEvidenceQualifier_postCompute => "NavigationObstacleAwarenessUseSupervisorSystem_Instance_supervisorProcess_barometricEvidenceQualifier_postCompute"
        case runtimemonitor.ObservationKind.NavigationObstacleAwarenessUseSupervisorSystem_Instance_supervisorProcess_obstacleEvidenceQualifier_postInit => "NavigationObstacleAwarenessUseSupervisorSystem_Instance_supervisorProcess_obstacleEvidenceQualifier_postInit"
        case runtimemonitor.ObservationKind.NavigationObstacleAwarenessUseSupervisorSystem_Instance_supervisorProcess_obstacleEvidenceQualifier_preCompute => "NavigationObstacleAwarenessUseSupervisorSystem_Instance_supervisorProcess_obstacleEvidenceQualifier_preCompute"
        case runtimemonitor.ObservationKind.NavigationObstacleAwarenessUseSupervisorSystem_Instance_supervisorProcess_obstacleEvidenceQualifier_postCompute => "NavigationObstacleAwarenessUseSupervisorSystem_Instance_supervisorProcess_obstacleEvidenceQualifier_postCompute"
        case runtimemonitor.ObservationKind.NavigationObstacleAwarenessUseSupervisorSystem_Instance_supervisorProcess_navigationBasisOwner_postInit => "NavigationObstacleAwarenessUseSupervisorSystem_Instance_supervisorProcess_navigationBasisOwner_postInit"
        case runtimemonitor.ObservationKind.NavigationObstacleAwarenessUseSupervisorSystem_Instance_supervisorProcess_navigationBasisOwner_preCompute => "NavigationObstacleAwarenessUseSupervisorSystem_Instance_supervisorProcess_navigationBasisOwner_preCompute"
        case runtimemonitor.ObservationKind.NavigationObstacleAwarenessUseSupervisorSystem_Instance_supervisorProcess_navigationBasisOwner_postCompute => "NavigationObstacleAwarenessUseSupervisorSystem_Instance_supervisorProcess_navigationBasisOwner_postCompute"
        case runtimemonitor.ObservationKind.NavigationObstacleAwarenessUseSupervisorSystem_Instance_supervisorProcess_awarenessConditionOwner_postInit => "NavigationObstacleAwarenessUseSupervisorSystem_Instance_supervisorProcess_awarenessConditionOwner_postInit"
        case runtimemonitor.ObservationKind.NavigationObstacleAwarenessUseSupervisorSystem_Instance_supervisorProcess_awarenessConditionOwner_preCompute => "NavigationObstacleAwarenessUseSupervisorSystem_Instance_supervisorProcess_awarenessConditionOwner_preCompute"
        case runtimemonitor.ObservationKind.NavigationObstacleAwarenessUseSupervisorSystem_Instance_supervisorProcess_awarenessConditionOwner_postCompute => "NavigationObstacleAwarenessUseSupervisorSystem_Instance_supervisorProcess_awarenessConditionOwner_postCompute"
        case runtimemonitor.ObservationKind.NavigationObstacleAwarenessUseSupervisorSystem_Instance_supervisorProcess_constraintProposalOwner_postInit => "NavigationObstacleAwarenessUseSupervisorSystem_Instance_supervisorProcess_constraintProposalOwner_postInit"
        case runtimemonitor.ObservationKind.NavigationObstacleAwarenessUseSupervisorSystem_Instance_supervisorProcess_constraintProposalOwner_preCompute => "NavigationObstacleAwarenessUseSupervisorSystem_Instance_supervisorProcess_constraintProposalOwner_preCompute"
        case runtimemonitor.ObservationKind.NavigationObstacleAwarenessUseSupervisorSystem_Instance_supervisorProcess_constraintProposalOwner_postCompute => "NavigationObstacleAwarenessUseSupervisorSystem_Instance_supervisorProcess_constraintProposalOwner_postCompute"
        case runtimemonitor.ObservationKind.NavigationObstacleAwarenessUseSupervisorSystem_Instance_supervisorProcess_eventPriorityArbiter_postInit => "NavigationObstacleAwarenessUseSupervisorSystem_Instance_supervisorProcess_eventPriorityArbiter_postInit"
        case runtimemonitor.ObservationKind.NavigationObstacleAwarenessUseSupervisorSystem_Instance_supervisorProcess_eventPriorityArbiter_preCompute => "NavigationObstacleAwarenessUseSupervisorSystem_Instance_supervisorProcess_eventPriorityArbiter_preCompute"
        case runtimemonitor.ObservationKind.NavigationObstacleAwarenessUseSupervisorSystem_Instance_supervisorProcess_eventPriorityArbiter_postCompute => "NavigationObstacleAwarenessUseSupervisorSystem_Instance_supervisorProcess_eventPriorityArbiter_postCompute"
        case runtimemonitor.ObservationKind.NavigationObstacleAwarenessUseSupervisorSystem_Instance_supervisorProcess_recoveryLatchOwner_postInit => "NavigationObstacleAwarenessUseSupervisorSystem_Instance_supervisorProcess_recoveryLatchOwner_postInit"
        case runtimemonitor.ObservationKind.NavigationObstacleAwarenessUseSupervisorSystem_Instance_supervisorProcess_recoveryLatchOwner_preCompute => "NavigationObstacleAwarenessUseSupervisorSystem_Instance_supervisorProcess_recoveryLatchOwner_preCompute"
        case runtimemonitor.ObservationKind.NavigationObstacleAwarenessUseSupervisorSystem_Instance_supervisorProcess_recoveryLatchOwner_postCompute => "NavigationObstacleAwarenessUseSupervisorSystem_Instance_supervisorProcess_recoveryLatchOwner_postCompute"
        case runtimemonitor.ObservationKind.NavigationObstacleAwarenessUseSupervisorSystem_Instance_supervisorProcess_supervisionOutcomeOwner_postInit => "NavigationObstacleAwarenessUseSupervisorSystem_Instance_supervisorProcess_supervisionOutcomeOwner_postInit"
        case runtimemonitor.ObservationKind.NavigationObstacleAwarenessUseSupervisorSystem_Instance_supervisorProcess_supervisionOutcomeOwner_preCompute => "NavigationObstacleAwarenessUseSupervisorSystem_Instance_supervisorProcess_supervisionOutcomeOwner_preCompute"
        case runtimemonitor.ObservationKind.NavigationObstacleAwarenessUseSupervisorSystem_Instance_supervisorProcess_supervisionOutcomeOwner_postCompute => "NavigationObstacleAwarenessUseSupervisorSystem_Instance_supervisorProcess_supervisionOutcomeOwner_postCompute"
      }
      return printObject(ISZ(
        ("type", printString("runtimemonitor.ObservationKind")),
        ("value", printString(value))
      ))
    }

    @pure def printutilContainer(o: util.Container): ST = {
      o match {
        case o: util.EmptyContainer => return printutilEmptyContainer(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_P => return printNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PS => return printNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_P => return printNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PS => return printNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_P => return printNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_P => return printNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_P => return printNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PS => return printNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PS => return printNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PS => return printNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_P => return printNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PS => return printNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_P => return printNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_P => return printNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PS => return printNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PS => return printNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_P => return printNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_P => return printNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_P => return printNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PS => return printNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PS => return printNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PS => return printNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_P => return printNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_P => return printNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PS => return printNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PS => return printNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_P => return printNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PS => return printNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_P => return printNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_P => return printNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PS => return printNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PS => return printNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_P => return printNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_P => return printNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PS => return printNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PS => return printNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_P => return printNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PS => return printNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_P => return printNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PS => return printNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PS(o)
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
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase_Payload => return printNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhase_Payload(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.MotionContext_Payload => return printNavigation_Obstacle_Awareness_Use_SupervisorMotionContext_Payload(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction_Payload => return printNavigation_Obstacle_Awareness_Use_SupervisorAcceptedAction_Payload(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis_Payload => return printNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasis_Payload(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionEvent_Payload => return printNavigation_Obstacle_Awareness_Use_SupervisorSupervisionEvent_Payload(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidence_Payload => return printNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidence_Payload(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionStatus_Payload => return printNavigation_Obstacle_Awareness_Use_SupervisorSupervisionStatus_Payload(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment_Payload => return printNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessment_Payload(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAssessment_Payload => return printNavigation_Obstacle_Awareness_Use_SupervisorObstacleAssessment_Payload(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationEvidence_Payload => return printNavigation_Obstacle_Awareness_Use_SupervisorNavigationEvidence_Payload(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposal_Payload => return printNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposal_Payload(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition_Payload => return printNavigation_Obstacle_Awareness_Use_SupervisorAwarenessCondition_Payload(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationUseDirective_Payload => return printNavigation_Obstacle_Awareness_Use_SupervisorNavigationUseDirective_Payload(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAwarenessNotice_Payload => return printNavigation_Obstacle_Awareness_Use_SupervisorObstacleAwarenessNotice_Payload(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_P => return printNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PS => return printNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_P => return printNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PS => return printNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_P => return printNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_P => return printNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_P => return printNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PS => return printNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PS => return printNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PS => return printNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_P => return printNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PS => return printNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_P => return printNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_P => return printNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PS => return printNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PS => return printNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_P => return printNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_P => return printNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_P => return printNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PS => return printNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PS => return printNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PS => return printNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_P => return printNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_P => return printNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PS => return printNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PS => return printNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_P => return printNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PS => return printNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_P => return printNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_P => return printNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PS => return printNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PS => return printNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_P => return printNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_P => return printNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PS => return printNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PS => return printNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_P => return printNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PS => return printNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PS(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_P => return printNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_P(o)
        case o: Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PS => return printNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PS(o)
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

    def parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationEvidenceType(): Navigation_Obstacle_Awareness_Use_Supervisor.NavigationEvidence.Type = {
      val r = parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationEvidenceT(F)
      return r
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationEvidenceT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.NavigationEvidence.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Navigation_Obstacle_Awareness_Use_Supervisor.NavigationEvidence")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Navigation_Obstacle_Awareness_Use_Supervisor.NavigationEvidence.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Navigation_Obstacle_Awareness_Use_Supervisor.NavigationEvidence.")
          return Navigation_Obstacle_Awareness_Use_Supervisor.NavigationEvidence.byOrdinal(0).get
      }
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationEvidence_Payload(): Navigation_Obstacle_Awareness_Use_Supervisor.NavigationEvidence_Payload = {
      val r = parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationEvidence_PayloadT(F)
      return r
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationEvidence_PayloadT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.NavigationEvidence_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Navigation_Obstacle_Awareness_Use_Supervisor.NavigationEvidence_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationEvidenceType()
      parser.parseObjectNext()
      return Navigation_Obstacle_Awareness_Use_Supervisor.NavigationEvidence_Payload(value)
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessmentType(): Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment.Type = {
      val r = parseNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessmentT(F)
      return r
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessmentT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment.")
          return Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment.byOrdinal(0).get
      }
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessment_Payload(): Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment_Payload = {
      val r = parseNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessment_PayloadT(F)
      return r
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessment_PayloadT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessmentType()
      parser.parseObjectNext()
      return Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment_Payload(value)
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceType(): Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidence.Type = {
      val r = parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceT(F)
      return r
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidence.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidence")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidence.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidence.")
          return Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidence.byOrdinal(0).get
      }
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidence_Payload(): Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidence_Payload = {
      val r = parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidence_PayloadT(F)
      return r
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidence_PayloadT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidence_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidence_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceType()
      parser.parseObjectNext()
      return Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidence_Payload(value)
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleAssessmentType(): Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAssessment.Type = {
      val r = parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleAssessmentT(F)
      return r
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleAssessmentT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAssessment.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAssessment")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAssessment.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAssessment.")
          return Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAssessment.byOrdinal(0).get
      }
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleAssessment_Payload(): Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAssessment_Payload = {
      val r = parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleAssessment_PayloadT(F)
      return r
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleAssessment_PayloadT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAssessment_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAssessment_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleAssessmentType()
      parser.parseObjectNext()
      return Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAssessment_Payload(value)
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisType(): Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis.Type = {
      val r = parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisT(F)
      return r
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis.")
          return Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis.byOrdinal(0).get
      }
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasis_Payload(): Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis_Payload = {
      val r = parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasis_PayloadT(F)
      return r
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasis_PayloadT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisType()
      parser.parseObjectNext()
      return Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis_Payload(value)
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorMotionContextType(): Navigation_Obstacle_Awareness_Use_Supervisor.MotionContext.Type = {
      val r = parseNavigation_Obstacle_Awareness_Use_SupervisorMotionContextT(F)
      return r
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorMotionContextT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.MotionContext.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Navigation_Obstacle_Awareness_Use_Supervisor.MotionContext")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Navigation_Obstacle_Awareness_Use_Supervisor.MotionContext.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Navigation_Obstacle_Awareness_Use_Supervisor.MotionContext.")
          return Navigation_Obstacle_Awareness_Use_Supervisor.MotionContext.byOrdinal(0).get
      }
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorMotionContext_Payload(): Navigation_Obstacle_Awareness_Use_Supervisor.MotionContext_Payload = {
      val r = parseNavigation_Obstacle_Awareness_Use_SupervisorMotionContext_PayloadT(F)
      return r
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorMotionContext_PayloadT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.MotionContext_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Navigation_Obstacle_Awareness_Use_Supervisor.MotionContext_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseNavigation_Obstacle_Awareness_Use_SupervisorMotionContextType()
      parser.parseObjectNext()
      return Navigation_Obstacle_Awareness_Use_Supervisor.MotionContext_Payload(value)
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionType(): Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition.Type = {
      val r = parseNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionT(F)
      return r
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition.")
          return Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition.byOrdinal(0).get
      }
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorAwarenessCondition_Payload(): Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition_Payload = {
      val r = parseNavigation_Obstacle_Awareness_Use_SupervisorAwarenessCondition_PayloadT(F)
      return r
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorAwarenessCondition_PayloadT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionType()
      parser.parseObjectNext()
      return Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition_Payload(value)
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalType(): Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposal.Type = {
      val r = parseNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalT(F)
      return r
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposal.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposal")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposal.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposal.")
          return Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposal.byOrdinal(0).get
      }
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposal_Payload(): Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposal_Payload = {
      val r = parseNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposal_PayloadT(F)
      return r
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposal_PayloadT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposal_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposal_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalType()
      parser.parseObjectNext()
      return Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposal_Payload(value)
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorSupervisionEventType(): Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionEvent.Type = {
      val r = parseNavigation_Obstacle_Awareness_Use_SupervisorSupervisionEventT(F)
      return r
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorSupervisionEventT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionEvent.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionEvent")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionEvent.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionEvent.")
          return Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionEvent.byOrdinal(0).get
      }
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorSupervisionEvent_Payload(): Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionEvent_Payload = {
      val r = parseNavigation_Obstacle_Awareness_Use_SupervisorSupervisionEvent_PayloadT(F)
      return r
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorSupervisionEvent_PayloadT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionEvent_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionEvent_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseNavigation_Obstacle_Awareness_Use_SupervisorSupervisionEventType()
      parser.parseObjectNext()
      return Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionEvent_Payload(value)
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhaseType(): Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase.Type = {
      val r = parseNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhaseT(F)
      return r
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhaseT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase.")
          return Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase.byOrdinal(0).get
      }
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhase_Payload(): Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase_Payload = {
      val r = parseNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhase_PayloadT(F)
      return r
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhase_PayloadT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhaseType()
      parser.parseObjectNext()
      return Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase_Payload(value)
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorAcceptedActionType(): Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction.Type = {
      val r = parseNavigation_Obstacle_Awareness_Use_SupervisorAcceptedActionT(F)
      return r
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorAcceptedActionT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction.")
          return Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction.byOrdinal(0).get
      }
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorAcceptedAction_Payload(): Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction_Payload = {
      val r = parseNavigation_Obstacle_Awareness_Use_SupervisorAcceptedAction_PayloadT(F)
      return r
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorAcceptedAction_PayloadT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseNavigation_Obstacle_Awareness_Use_SupervisorAcceptedActionType()
      parser.parseObjectNext()
      return Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction_Payload(value)
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationUseDirectiveType(): Navigation_Obstacle_Awareness_Use_Supervisor.NavigationUseDirective.Type = {
      val r = parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationUseDirectiveT(F)
      return r
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationUseDirectiveT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.NavigationUseDirective.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Navigation_Obstacle_Awareness_Use_Supervisor.NavigationUseDirective")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Navigation_Obstacle_Awareness_Use_Supervisor.NavigationUseDirective.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Navigation_Obstacle_Awareness_Use_Supervisor.NavigationUseDirective.")
          return Navigation_Obstacle_Awareness_Use_Supervisor.NavigationUseDirective.byOrdinal(0).get
      }
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationUseDirective_Payload(): Navigation_Obstacle_Awareness_Use_Supervisor.NavigationUseDirective_Payload = {
      val r = parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationUseDirective_PayloadT(F)
      return r
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationUseDirective_PayloadT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.NavigationUseDirective_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Navigation_Obstacle_Awareness_Use_Supervisor.NavigationUseDirective_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationUseDirectiveType()
      parser.parseObjectNext()
      return Navigation_Obstacle_Awareness_Use_Supervisor.NavigationUseDirective_Payload(value)
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleAwarenessNoticeType(): Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAwarenessNotice.Type = {
      val r = parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleAwarenessNoticeT(F)
      return r
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleAwarenessNoticeT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAwarenessNotice.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAwarenessNotice")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAwarenessNotice.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAwarenessNotice.")
          return Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAwarenessNotice.byOrdinal(0).get
      }
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleAwarenessNotice_Payload(): Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAwarenessNotice_Payload = {
      val r = parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleAwarenessNotice_PayloadT(F)
      return r
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleAwarenessNotice_PayloadT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAwarenessNotice_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAwarenessNotice_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleAwarenessNoticeType()
      parser.parseObjectNext()
      return Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAwarenessNotice_Payload(value)
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorSupervisionStatusType(): Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionStatus.Type = {
      val r = parseNavigation_Obstacle_Awareness_Use_SupervisorSupervisionStatusT(F)
      return r
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorSupervisionStatusT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionStatus.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionStatus")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionStatus.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionStatus.")
          return Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionStatus.byOrdinal(0).get
      }
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorSupervisionStatus_Payload(): Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionStatus_Payload = {
      val r = parseNavigation_Obstacle_Awareness_Use_SupervisorSupervisionStatus_PayloadT(F)
      return r
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorSupervisionStatus_PayloadT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionStatus_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionStatus_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseNavigation_Obstacle_Awareness_Use_SupervisorSupervisionStatusType()
      parser.parseObjectNext()
      return Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionStatus_Payload(value)
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

    def parseNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container(): Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_P", "Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PS"))
      t.native match {
        case "Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_P" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PS" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PST(T); return r
        case _ => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PST(T); return r
      }
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_P(): Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_P = {
      val r = parseNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PT(F)
      return r
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_P")
      }
      parser.parseObjectKey("api_gpsEvidence")
      val api_gpsEvidence = parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationEvidenceType()
      parser.parseObjectNext()
      return Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_P(api_gpsEvidence)
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PS(): Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PS = {
      val r = parseNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PST(F)
      return r
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PST(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PS")
      }
      parser.parseObjectKey("api_gpsEvidence")
      val api_gpsEvidence = parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationEvidenceType()
      parser.parseObjectNext()
      return Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PS(api_gpsEvidence)
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container(): Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_P", "Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PS"))
      t.native match {
        case "Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_P" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PS" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PST(T); return r
        case _ => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PST(T); return r
      }
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_P(): Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_P = {
      val r = parseNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PT(F)
      return r
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_P")
      }
      parser.parseObjectKey("api_gpsAssessment")
      val api_gpsAssessment = parseNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessmentType()
      parser.parseObjectNext()
      return Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_P(api_gpsAssessment)
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PS(): Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PS = {
      val r = parseNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PST(F)
      return r
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PST(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PS")
      }
      parser.parseObjectKey("api_gpsAssessment")
      val api_gpsAssessment = parseNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessmentType()
      parser.parseObjectNext()
      return Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PS(api_gpsAssessment)
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container(): Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_P", "Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PS"))
      t.native match {
        case "Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_P" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PS" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PST(T); return r
        case _ => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PST(T); return r
      }
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_P(): Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_P = {
      val r = parseNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PT(F)
      return r
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_P")
      }
      parser.parseObjectKey("api_inertialEvidence")
      val api_inertialEvidence = parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationEvidenceType()
      parser.parseObjectNext()
      return Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_P(api_inertialEvidence)
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PS(): Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PS = {
      val r = parseNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PST(F)
      return r
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PST(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PS")
      }
      parser.parseObjectKey("api_inertialEvidence")
      val api_inertialEvidence = parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationEvidenceType()
      parser.parseObjectNext()
      return Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PS(api_inertialEvidence)
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container(): Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_P", "Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PS"))
      t.native match {
        case "Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_P" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PS" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PST(T); return r
        case _ => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PST(T); return r
      }
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_P(): Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_P = {
      val r = parseNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PT(F)
      return r
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_P")
      }
      parser.parseObjectKey("api_inertialAssessment")
      val api_inertialAssessment = parseNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessmentType()
      parser.parseObjectNext()
      return Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_P(api_inertialAssessment)
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PS(): Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PS = {
      val r = parseNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PST(F)
      return r
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PST(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PS")
      }
      parser.parseObjectKey("api_inertialAssessment")
      val api_inertialAssessment = parseNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessmentType()
      parser.parseObjectNext()
      return Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PS(api_inertialAssessment)
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container(): Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_P", "Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PS"))
      t.native match {
        case "Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_P" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PS" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PST(T); return r
        case _ => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PST(T); return r
      }
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_P(): Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_P = {
      val r = parseNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PT(F)
      return r
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_P")
      }
      parser.parseObjectKey("api_barometricEvidence")
      val api_barometricEvidence = parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationEvidenceType()
      parser.parseObjectNext()
      return Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_P(api_barometricEvidence)
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PS(): Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PS = {
      val r = parseNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PST(F)
      return r
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PST(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PS")
      }
      parser.parseObjectKey("api_barometricEvidence")
      val api_barometricEvidence = parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationEvidenceType()
      parser.parseObjectNext()
      return Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PS(api_barometricEvidence)
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container(): Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_P", "Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PS"))
      t.native match {
        case "Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_P" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PS" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PST(T); return r
        case _ => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PST(T); return r
      }
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_P(): Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_P = {
      val r = parseNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PT(F)
      return r
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_P")
      }
      parser.parseObjectKey("api_barometricAssessment")
      val api_barometricAssessment = parseNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessmentType()
      parser.parseObjectNext()
      return Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_P(api_barometricAssessment)
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PS(): Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PS = {
      val r = parseNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PST(F)
      return r
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PST(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PS")
      }
      parser.parseObjectKey("api_barometricAssessment")
      val api_barometricAssessment = parseNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessmentType()
      parser.parseObjectNext()
      return Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PS(api_barometricAssessment)
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container(): Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_P", "Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PS"))
      t.native match {
        case "Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_P" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PS" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PST(T); return r
        case _ => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PST(T); return r
      }
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_P(): Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_P = {
      val r = parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PT(F)
      return r
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_P")
      }
      parser.parseObjectKey("api_obstacleEvidence")
      val api_obstacleEvidence = parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceType()
      parser.parseObjectNext()
      return Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_P(api_obstacleEvidence)
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PS(): Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PS = {
      val r = parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PST(F)
      return r
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PST(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PS")
      }
      parser.parseObjectKey("api_obstacleEvidence")
      val api_obstacleEvidence = parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceType()
      parser.parseObjectNext()
      return Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PS(api_obstacleEvidence)
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container(): Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_P", "Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PS"))
      t.native match {
        case "Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_P" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PS" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PST(T); return r
        case _ => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PST(T); return r
      }
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_P(): Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_P = {
      val r = parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PT(F)
      return r
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_P")
      }
      parser.parseObjectKey("api_obstacleAssessment")
      val api_obstacleAssessment = parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleAssessmentType()
      parser.parseObjectNext()
      return Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_P(api_obstacleAssessment)
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PS(): Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PS = {
      val r = parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PST(F)
      return r
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PST(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PS")
      }
      parser.parseObjectKey("api_obstacleAssessment")
      val api_obstacleAssessment = parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleAssessmentType()
      parser.parseObjectNext()
      return Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PS(api_obstacleAssessment)
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container(): Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_P", "Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PS"))
      t.native match {
        case "Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_P" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PS" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PST(T); return r
        case _ => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PST(T); return r
      }
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_P(): Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_P = {
      val r = parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PT(F)
      return r
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_P")
      }
      parser.parseObjectKey("api_barometricAssessment")
      val api_barometricAssessment = parseNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_gpsAssessment")
      val api_gpsAssessment = parseNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_inertialAssessment")
      val api_inertialAssessment = parseNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessmentType()
      parser.parseObjectNext()
      return Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_P(api_barometricAssessment, api_gpsAssessment, api_inertialAssessment)
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PS(): Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PS = {
      val r = parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PST(F)
      return r
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PST(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_barometricAssessment")
      val api_barometricAssessment = parseNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_gpsAssessment")
      val api_gpsAssessment = parseNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_inertialAssessment")
      val api_inertialAssessment = parseNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessmentType()
      parser.parseObjectNext()
      return Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PS(api_barometricAssessment, api_gpsAssessment, api_inertialAssessment)
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container(): Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_P", "Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PS"))
      t.native match {
        case "Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_P" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PS" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PST(T); return r
        case _ => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PST(T); return r
      }
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_P(): Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_P = {
      val r = parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PT(F)
      return r
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_P")
      }
      parser.parseObjectKey("api_outcomeBasis")
      val api_outcomeBasis = parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_proposalBasis")
      val api_proposalBasis = parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisType()
      parser.parseObjectNext()
      return Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_P(api_outcomeBasis, api_proposalBasis)
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PS(): Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PS = {
      val r = parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PST(F)
      return r
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PST(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_outcomeBasis")
      val api_outcomeBasis = parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_proposalBasis")
      val api_proposalBasis = parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisType()
      parser.parseObjectNext()
      return Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PS(api_outcomeBasis, api_proposalBasis)
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container(): Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_P", "Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PS"))
      t.native match {
        case "Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_P" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PS" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PST(T); return r
        case _ => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PST(T); return r
      }
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_P(): Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_P = {
      val r = parseNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PT(F)
      return r
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_P")
      }
      parser.parseObjectKey("api_motionContext")
      val api_motionContext = parseNavigation_Obstacle_Awareness_Use_SupervisorMotionContextType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_obstacleAssessment")
      val api_obstacleAssessment = parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleAssessmentType()
      parser.parseObjectNext()
      return Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_P(api_motionContext, api_obstacleAssessment)
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PS(): Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PS = {
      val r = parseNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PST(F)
      return r
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PST(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_motionContext")
      val api_motionContext = parseNavigation_Obstacle_Awareness_Use_SupervisorMotionContextType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_obstacleAssessment")
      val api_obstacleAssessment = parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleAssessmentType()
      parser.parseObjectNext()
      return Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PS(api_motionContext, api_obstacleAssessment)
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container(): Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_P", "Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PS"))
      t.native match {
        case "Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_P" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PS" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PST(T); return r
        case _ => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PST(T); return r
      }
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_P(): Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_P = {
      val r = parseNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PT(F)
      return r
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_P")
      }
      parser.parseObjectKey("api_awarenessCondition")
      val api_awarenessCondition = parseNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionType()
      parser.parseObjectNext()
      return Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_P(api_awarenessCondition)
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PS(): Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PS = {
      val r = parseNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PST(F)
      return r
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PST(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_awarenessCondition")
      val api_awarenessCondition = parseNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionType()
      parser.parseObjectNext()
      return Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PS(api_awarenessCondition)
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container(): Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_P", "Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PS"))
      t.native match {
        case "Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_P" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PS" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PST(T); return r
        case _ => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PST(T); return r
      }
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_P(): Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_P = {
      val r = parseNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PT(F)
      return r
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_P")
      }
      parser.parseObjectKey("api_awarenessCondition")
      val api_awarenessCondition = parseNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_navigationBasis")
      val api_navigationBasis = parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisType()
      parser.parseObjectNext()
      return Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_P(api_awarenessCondition, api_navigationBasis)
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PS(): Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PS = {
      val r = parseNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PST(F)
      return r
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PST(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_awarenessCondition")
      val api_awarenessCondition = parseNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_navigationBasis")
      val api_navigationBasis = parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisType()
      parser.parseObjectNext()
      return Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PS(api_awarenessCondition, api_navigationBasis)
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container(): Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_P", "Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PS"))
      t.native match {
        case "Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_P" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PS" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PST(T); return r
        case _ => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PST(T); return r
      }
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_P(): Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_P = {
      val r = parseNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PT(F)
      return r
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_P")
      }
      parser.parseObjectKey("api_constraintProposal")
      val api_constraintProposal = parseNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalType()
      parser.parseObjectNext()
      return Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_P(api_constraintProposal)
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PS(): Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PS = {
      val r = parseNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PST(F)
      return r
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PST(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_constraintProposal")
      val api_constraintProposal = parseNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalType()
      parser.parseObjectNext()
      return Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PS(api_constraintProposal)
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container(): Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_P", "Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PS"))
      t.native match {
        case "Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_P" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PS" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PST(T); return r
        case _ => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PST(T); return r
      }
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_P(): Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_P = {
      val r = parseNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PT(F)
      return r
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_P")
      }
      parser.parseObjectKey("api_constraintProposal")
      val api_constraintProposal = parseNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_preRecoveryPhase")
      val api_preRecoveryPhase = parseNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhaseType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_supervisionEvent")
      val api_supervisionEvent = parseNavigation_Obstacle_Awareness_Use_SupervisorSupervisionEventType()
      parser.parseObjectNext()
      return Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_P(api_constraintProposal, api_preRecoveryPhase, api_supervisionEvent)
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PS(): Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PS = {
      val r = parseNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PST(F)
      return r
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PST(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PS")
      }
      parser.parseObjectKey("api_constraintProposal")
      val api_constraintProposal = parseNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_preRecoveryPhase")
      val api_preRecoveryPhase = parseNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhaseType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_supervisionEvent")
      val api_supervisionEvent = parseNavigation_Obstacle_Awareness_Use_SupervisorSupervisionEventType()
      parser.parseObjectNext()
      return Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PS(api_constraintProposal, api_preRecoveryPhase, api_supervisionEvent)
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container(): Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_P", "Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PS"))
      t.native match {
        case "Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_P" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PS" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PST(T); return r
        case _ => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PST(T); return r
      }
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_P(): Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_P = {
      val r = parseNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PT(F)
      return r
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_P")
      }
      parser.parseObjectKey("api_outcomeAction")
      val api_outcomeAction = parseNavigation_Obstacle_Awareness_Use_SupervisorAcceptedActionType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recoveryAction")
      val api_recoveryAction = parseNavigation_Obstacle_Awareness_Use_SupervisorAcceptedActionType()
      parser.parseObjectNext()
      return Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_P(api_outcomeAction, api_recoveryAction)
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PS(): Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PS = {
      val r = parseNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PST(F)
      return r
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PST(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PS")
      }
      parser.parseObjectKey("api_outcomeAction")
      val api_outcomeAction = parseNavigation_Obstacle_Awareness_Use_SupervisorAcceptedActionType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recoveryAction")
      val api_recoveryAction = parseNavigation_Obstacle_Awareness_Use_SupervisorAcceptedActionType()
      parser.parseObjectNext()
      return Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PS(api_outcomeAction, api_recoveryAction)
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container(): Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_P", "Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PS"))
      t.native match {
        case "Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_P" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PS" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PST(T); return r
        case _ => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PST(T); return r
      }
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_P(): Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_P = {
      val r = parseNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PT(F)
      return r
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_P")
      }
      parser.parseObjectKey("api_acceptedAction")
      val api_acceptedAction = parseNavigation_Obstacle_Awareness_Use_SupervisorAcceptedActionType()
      parser.parseObjectNext()
      return Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_P(api_acceptedAction)
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PS(): Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PS = {
      val r = parseNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PST(F)
      return r
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PST(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PS")
      }
      parser.parseObjectKey("In_committedRecoveryPhase")
      val In_committedRecoveryPhase = parseNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhaseType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_acceptedAction")
      val api_acceptedAction = parseNavigation_Obstacle_Awareness_Use_SupervisorAcceptedActionType()
      parser.parseObjectNext()
      return Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PS(In_committedRecoveryPhase, api_acceptedAction)
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container(): Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_P", "Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PS"))
      t.native match {
        case "Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_P" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PS" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PST(T); return r
        case _ => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PST(T); return r
      }
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_P(): Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_P = {
      val r = parseNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PT(F)
      return r
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_P")
      }
      parser.parseObjectKey("api_postRecoveryPhase")
      val api_postRecoveryPhase = parseNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhaseType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_preRecoveryPhase")
      val api_preRecoveryPhase = parseNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhaseType()
      parser.parseObjectNext()
      return Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_P(api_postRecoveryPhase, api_preRecoveryPhase)
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PS(): Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PS = {
      val r = parseNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PST(F)
      return r
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PST(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PS")
      }
      parser.parseObjectKey("committedRecoveryPhase")
      val committedRecoveryPhase = parseNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhaseType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_postRecoveryPhase")
      val api_postRecoveryPhase = parseNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhaseType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_preRecoveryPhase")
      val api_preRecoveryPhase = parseNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhaseType()
      parser.parseObjectNext()
      return Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PS(committedRecoveryPhase, api_postRecoveryPhase, api_preRecoveryPhase)
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container(): Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_P", "Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PS"))
      t.native match {
        case "Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_P" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PS" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PST(T); return r
        case _ => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PST(T); return r
      }
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_P(): Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_P = {
      val r = parseNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PT(F)
      return r
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_P")
      }
      parser.parseObjectKey("api_acceptedAction")
      val api_acceptedAction = parseNavigation_Obstacle_Awareness_Use_SupervisorAcceptedActionType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_navigationBasis")
      val api_navigationBasis = parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_postRecoveryPhase")
      val api_postRecoveryPhase = parseNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhaseType()
      parser.parseObjectNext()
      return Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_P(api_acceptedAction, api_navigationBasis, api_postRecoveryPhase)
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PS(): Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PS = {
      val r = parseNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PST(F)
      return r
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PST(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_acceptedAction")
      val api_acceptedAction = parseNavigation_Obstacle_Awareness_Use_SupervisorAcceptedActionType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_navigationBasis")
      val api_navigationBasis = parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_postRecoveryPhase")
      val api_postRecoveryPhase = parseNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhaseType()
      parser.parseObjectNext()
      return Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PS(api_acceptedAction, api_navigationBasis, api_postRecoveryPhase)
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container(): Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_P", "Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PS"))
      t.native match {
        case "Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_P" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PS" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PST(T); return r
        case _ => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PST(T); return r
      }
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_P(): Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_P = {
      val r = parseNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PT(F)
      return r
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PT(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_P")
      }
      parser.parseObjectKey("api_navigationUseDirective")
      val api_navigationUseDirective = parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationUseDirectiveType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_obstacleAwarenessNotice")
      val api_obstacleAwarenessNotice = parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleAwarenessNoticeType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_supervisionStatus")
      val api_supervisionStatus = parseNavigation_Obstacle_Awareness_Use_SupervisorSupervisionStatusType()
      parser.parseObjectNext()
      return Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_P(api_navigationUseDirective, api_obstacleAwarenessNotice, api_supervisionStatus)
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PS(): Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PS = {
      val r = parseNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PST(F)
      return r
    }

    def parseNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PST(typeParsed: B): Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_navigationUseDirective")
      val api_navigationUseDirective = parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationUseDirectiveType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_obstacleAwarenessNotice")
      val api_obstacleAwarenessNotice = parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleAwarenessNoticeType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_supervisionStatus")
      val api_supervisionStatus = parseNavigation_Obstacle_Awareness_Use_SupervisorSupervisionStatusType()
      parser.parseObjectNext()
      return Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PS(api_navigationUseDirective, api_obstacleAwarenessNotice, api_supervisionStatus)
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
      val t = parser.parseObjectTypes(ISZ("util.EmptyContainer", "Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_P", "Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PS", "Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_P", "Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PS", "Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_P", "Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_P", "Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_P", "Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PS", "Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PS", "Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PS", "Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_P", "Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PS", "Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_P", "Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_P", "Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PS", "Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PS", "Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_P", "Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_P", "Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_P", "Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PS", "Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PS", "Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PS", "Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_P", "Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_P", "Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PS", "Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PS", "Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_P", "Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PS", "Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_P", "Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_P", "Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PS", "Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PS", "Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_P", "Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_P", "Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PS", "Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PS", "Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_P", "Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PS", "Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_P", "Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PS"))
      t.native match {
        case "util.EmptyContainer" => val r = parseutilEmptyContainerT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_P" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PS" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PST(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_P" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PS" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PST(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_P" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_P" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_P" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PS" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PST(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PS" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PST(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PS" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PST(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_P" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PS" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PST(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_P" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_P" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PS" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PST(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PS" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PST(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_P" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_P" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_P" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PS" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PST(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PS" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PST(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PS" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PST(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_P" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_P" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PS" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PST(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PS" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PST(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_P" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PS" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PST(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_P" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_P" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PS" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PST(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PS" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PST(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_P" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_P" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PS" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PST(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PS" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PST(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_P" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PS" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PST(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_P" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PS" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PST(T); return r
        case _ => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PST(T); return r
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
      val t = parser.parseObjectTypes(ISZ("art.Empty", "Base_Types.Boolean_Payload", "Base_Types.Integer_Payload", "Base_Types.Integer_8_Payload", "Base_Types.Integer_16_Payload", "Base_Types.Integer_32_Payload", "Base_Types.Integer_64_Payload", "Base_Types.Unsigned_8_Payload", "Base_Types.Unsigned_16_Payload", "Base_Types.Unsigned_32_Payload", "Base_Types.Unsigned_64_Payload", "Base_Types.Float_Payload", "Base_Types.Float_32_Payload", "Base_Types.Float_64_Payload", "Base_Types.Character_Payload", "Base_Types.String_Payload", "Base_Types.Bits_Payload", "util.EmptyContainer", "Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase_Payload", "Navigation_Obstacle_Awareness_Use_Supervisor.MotionContext_Payload", "Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction_Payload", "Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis_Payload", "Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionEvent_Payload", "Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidence_Payload", "Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionStatus_Payload", "Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment_Payload", "Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAssessment_Payload", "Navigation_Obstacle_Awareness_Use_Supervisor.NavigationEvidence_Payload", "Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposal_Payload", "Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition_Payload", "Navigation_Obstacle_Awareness_Use_Supervisor.NavigationUseDirective_Payload", "Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAwarenessNotice_Payload", "Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_P", "Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PS", "Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_P", "Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PS", "Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_P", "Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_P", "Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_P", "Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PS", "Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PS", "Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PS", "Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_P", "Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PS", "Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_P", "Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_P", "Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PS", "Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PS", "Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_P", "Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_P", "Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_P", "Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PS", "Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PS", "Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PS", "Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_P", "Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_P", "Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PS", "Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PS", "Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_P", "Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PS", "Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_P", "Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_P", "Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PS", "Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PS", "Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_P", "Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_P", "Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PS", "Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PS", "Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_P", "Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PS", "Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_P", "Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PS"))
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
        case "Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase_Payload" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhase_PayloadT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.MotionContext_Payload" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorMotionContext_PayloadT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction_Payload" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorAcceptedAction_PayloadT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis_Payload" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasis_PayloadT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionEvent_Payload" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorSupervisionEvent_PayloadT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidence_Payload" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidence_PayloadT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionStatus_Payload" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorSupervisionStatus_PayloadT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment_Payload" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessment_PayloadT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAssessment_Payload" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleAssessment_PayloadT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.NavigationEvidence_Payload" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationEvidence_PayloadT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposal_Payload" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposal_PayloadT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition_Payload" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorAwarenessCondition_PayloadT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.NavigationUseDirective_Payload" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationUseDirective_PayloadT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAwarenessNotice_Payload" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleAwarenessNotice_PayloadT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_P" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PS" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PST(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_P" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PS" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PST(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_P" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_P" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_P" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PS" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PST(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PS" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PST(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PS" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PST(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_P" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PS" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PST(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_P" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_P" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PS" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PST(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PS" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PST(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_P" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_P" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_P" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PS" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PST(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PS" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PST(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PS" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PST(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_P" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_P" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PS" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PST(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PS" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PST(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_P" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PS" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PST(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_P" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_P" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PS" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PST(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PS" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PST(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_P" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_P" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PS" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PST(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PS" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PST(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_P" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PS" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PST(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_P" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PT(T); return r
        case "Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PS" => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PST(T); return r
        case _ => val r = parseNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PST(T); return r
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

  def fromNavigation_Obstacle_Awareness_Use_SupervisorNavigationEvidence_Payload(o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationEvidence_Payload, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorNavigationEvidence_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorNavigationEvidence_Payload(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.NavigationEvidence_Payload, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorNavigationEvidence_Payload(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.NavigationEvidence_Payload = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationEvidence_Payload()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorNavigationEvidence_Payload _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessment_Payload(o: Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment_Payload, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessment_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessment_Payload(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment_Payload, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessment_Payload(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.EvidenceAssessment_Payload = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessment_Payload()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorEvidenceAssessment_Payload _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidence_Payload(o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidence_Payload, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidence_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidence_Payload(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidence_Payload, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidence_Payload(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidence_Payload = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidence_Payload()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidence_Payload _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorObstacleAssessment_Payload(o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAssessment_Payload, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorObstacleAssessment_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorObstacleAssessment_Payload(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAssessment_Payload, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorObstacleAssessment_Payload(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAssessment_Payload = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleAssessment_Payload()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorObstacleAssessment_Payload _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasis_Payload(o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis_Payload, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasis_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasis_Payload(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis_Payload, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasis_Payload(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis_Payload = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasis_Payload()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasis_Payload _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorMotionContext_Payload(o: Navigation_Obstacle_Awareness_Use_Supervisor.MotionContext_Payload, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorMotionContext_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorMotionContext_Payload(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.MotionContext_Payload, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorMotionContext_Payload(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.MotionContext_Payload = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorMotionContext_Payload()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorMotionContext_Payload _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorAwarenessCondition_Payload(o: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition_Payload, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorAwarenessCondition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorAwarenessCondition_Payload(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition_Payload, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorAwarenessCondition_Payload(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition_Payload = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorAwarenessCondition_Payload()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorAwarenessCondition_Payload _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposal_Payload(o: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposal_Payload, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposal_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposal_Payload(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposal_Payload, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposal_Payload(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposal_Payload = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposal_Payload()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposal_Payload _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorSupervisionEvent_Payload(o: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionEvent_Payload, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorSupervisionEvent_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorSupervisionEvent_Payload(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionEvent_Payload, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorSupervisionEvent_Payload(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionEvent_Payload = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorSupervisionEvent_Payload()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorSupervisionEvent_Payload _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhase_Payload(o: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase_Payload, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhase_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhase_Payload(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase_Payload, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhase_Payload(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase_Payload = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhase_Payload()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorRecoveryPhase_Payload _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorAcceptedAction_Payload(o: Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction_Payload, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorAcceptedAction_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorAcceptedAction_Payload(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction_Payload, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorAcceptedAction_Payload(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction_Payload = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorAcceptedAction_Payload()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorAcceptedAction_Payload _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorNavigationUseDirective_Payload(o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationUseDirective_Payload, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorNavigationUseDirective_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorNavigationUseDirective_Payload(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.NavigationUseDirective_Payload, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorNavigationUseDirective_Payload(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.NavigationUseDirective_Payload = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationUseDirective_Payload()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorNavigationUseDirective_Payload _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorObstacleAwarenessNotice_Payload(o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAwarenessNotice_Payload, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorObstacleAwarenessNotice_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorObstacleAwarenessNotice_Payload(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAwarenessNotice_Payload, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorObstacleAwarenessNotice_Payload(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAwarenessNotice_Payload = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleAwarenessNotice_Payload()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorObstacleAwarenessNotice_Payload _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorSupervisionStatus_Payload(o: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionStatus_Payload, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorSupervisionStatus_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorSupervisionStatus_Payload(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionStatus_Payload, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorSupervisionStatus_Payload(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionStatus_Payload = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorSupervisionStatus_Payload()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorSupervisionStatus_Payload _)
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

  def fromNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_P(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_P, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_P(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_P = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_P()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_P _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PS(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PS, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PS(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PS = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PS()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PreState_Container_PS _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_P(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_P, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_P(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_P = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_P()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_P _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PS(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PS, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PS(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.GpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PS = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PS()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorGpsEvidenceQualifier_supervisorProcess_gpsEvidenceQualifier_PostState_Container_PS _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_P(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_P, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_P(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_P = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_P()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_P _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PS(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PS, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PS(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PS = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PS()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PreState_Container_PS _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_P(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_P, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_P(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_P = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_P()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_P _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PS(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PS, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PS(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.InertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PS = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PS()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorInertialEvidenceQualifier_supervisorProcess_inertialEvidenceQualifier_PostState_Container_PS _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_P(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_P, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_P(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_P = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_P()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_P _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PS(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PS, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PS(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PS = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PS()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PreState_Container_PS _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_P(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_P, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_P(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_P = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_P()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_P _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PS(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PS, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PS(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.BarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PS = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PS()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorBarometricEvidenceQualifier_supervisorProcess_barometricEvidenceQualifier_PostState_Container_PS _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_P(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_P, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_P(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_P = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_P()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_P _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PS(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PS, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PS(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PS = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PS()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PreState_Container_PS _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_P(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_P, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_P(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_P = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_P()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_P _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PS(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PS, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PS(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PS = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PS()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorObstacleEvidenceQualifier_supervisorProcess_obstacleEvidenceQualifier_PostState_Container_PS _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_P(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_P, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_P(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_P = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_P()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_P _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PS(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PS, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PS(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PS = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PS()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PreState_Container_PS _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_P(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_P, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_P(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_P = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_P()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_P _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PS(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PS, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PS(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PS = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PS()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorNavigationBasisOwner_supervisorProcess_navigationBasisOwner_PostState_Container_PS _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_P(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_P, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_P(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_P = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_P()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_P _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PS(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PS, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PS(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PS = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PS()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PreState_Container_PS _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_P(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_P, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_P(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_P = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_P()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_P _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PS(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PS, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PS(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PS = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PS()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorAwarenessConditionOwner_supervisorProcess_awarenessConditionOwner_PostState_Container_PS _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_P(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_P, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_P(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_P = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_P()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_P _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PS(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PS, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PS(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PS = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PS()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PreState_Container_PS _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_P(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_P, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_P(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_P = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_P()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_P _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PS(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PS, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PS(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PS = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PS()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorConstraintProposalOwner_supervisorProcess_constraintProposalOwner_PostState_Container_PS _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_P(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_P, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_P(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_P = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_P()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_P _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PS(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PS, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PS(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PS = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PS()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PreState_Container_PS _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_P(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_P, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_P(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_P = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_P()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_P _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PS(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PS, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PS(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PS = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PS()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorEventPriorityArbiter_supervisorProcess_eventPriorityArbiter_PostState_Container_PS _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_P(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_P, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_P(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_P = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_P()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_P _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PS(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PS, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PS(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PS = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PS()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PreState_Container_PS _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_P(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_P, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_P(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_P = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_P()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_P _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PS(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PS, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PS(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PS = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PS()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorRecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_PostState_Container_PS _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_P(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_P, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_P(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_P = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_P()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_P _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PS(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PS, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PS(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PS = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PS()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PreState_Container_PS _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container(o: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_P(o: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_P(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_P, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_P(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_P = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_P()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_P _)
    return r
  }

  def fromNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PS(o: Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PS(s: String): Either[Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PS, Json.ErrorMsg] = {
    def fNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PS(parser: Parser): Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PS = {
      val r = parser.parseNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PS()
      return r
    }
    val r = to(s, fNavigation_Obstacle_Awareness_Use_SupervisorSupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_PostState_Container_PS _)
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