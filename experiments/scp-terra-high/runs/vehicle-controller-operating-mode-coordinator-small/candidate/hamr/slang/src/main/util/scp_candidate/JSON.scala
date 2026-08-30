// #Sireum
// @formatter:off

// This file is auto-generated from LifecycleEvent.scala, InputStatus.scala, LifecycleAssessment.scala, ConditionEvent.scala, ConditionAssessment.scala, CoordinationClass.scala, ControllerModeDisposition.scala, DecisionReason.scala, CoordinationResult.scala, LifecycleSample.scala, ConditionSample.scala, ModeDecision.scala, Base_Types.scala, LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_Containers.scala, ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_Containers.scala, CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_Containers.scala, ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_Containers.scala, CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package scp_candidate

import org.sireum._
import org.sireum.Json.Printer._

object JSON {

  object Printer {

    @pure def printVehicle_Controller_Mode_CoordinatorLifecycleEventType(o: Vehicle_Controller_Mode_Coordinator.LifecycleEvent.Type): ST = {
      val value: String = o match {
        case Vehicle_Controller_Mode_Coordinator.LifecycleEvent.NoLifecycleEvent => "NoLifecycleEvent"
        case Vehicle_Controller_Mode_Coordinator.LifecycleEvent.Start => "Start"
        case Vehicle_Controller_Mode_Coordinator.LifecycleEvent.On => "On"
        case Vehicle_Controller_Mode_Coordinator.LifecycleEvent.Off => "Off"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Controller_Mode_Coordinator.LifecycleEvent")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Controller_Mode_CoordinatorLifecycleEvent_Payload(o: Vehicle_Controller_Mode_Coordinator.LifecycleEvent_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Mode_Coordinator.LifecycleEvent_Payload""""),
        ("value", printVehicle_Controller_Mode_CoordinatorLifecycleEventType(o.value))
      ))
    }

    @pure def printVehicle_Controller_Mode_CoordinatorInputStatusType(o: Vehicle_Controller_Mode_Coordinator.InputStatus.Type): ST = {
      val value: String = o match {
        case Vehicle_Controller_Mode_Coordinator.InputStatus.Valid => "Valid"
        case Vehicle_Controller_Mode_Coordinator.InputStatus.Invalid => "Invalid"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Controller_Mode_Coordinator.InputStatus")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Controller_Mode_CoordinatorInputStatus_Payload(o: Vehicle_Controller_Mode_Coordinator.InputStatus_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Mode_Coordinator.InputStatus_Payload""""),
        ("value", printVehicle_Controller_Mode_CoordinatorInputStatusType(o.value))
      ))
    }

    @pure def printVehicle_Controller_Mode_CoordinatorLifecycleAssessmentType(o: Vehicle_Controller_Mode_Coordinator.LifecycleAssessment.Type): ST = {
      val value: String = o match {
        case Vehicle_Controller_Mode_Coordinator.LifecycleAssessment.InvalidLifecycle => "InvalidLifecycle"
        case Vehicle_Controller_Mode_Coordinator.LifecycleAssessment.NoLifecycle => "NoLifecycle"
        case Vehicle_Controller_Mode_Coordinator.LifecycleAssessment.StartRequested => "StartRequested"
        case Vehicle_Controller_Mode_Coordinator.LifecycleAssessment.OnRequested => "OnRequested"
        case Vehicle_Controller_Mode_Coordinator.LifecycleAssessment.OffRequested => "OffRequested"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Controller_Mode_Coordinator.LifecycleAssessment")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Controller_Mode_CoordinatorLifecycleAssessment_Payload(o: Vehicle_Controller_Mode_Coordinator.LifecycleAssessment_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Mode_Coordinator.LifecycleAssessment_Payload""""),
        ("value", printVehicle_Controller_Mode_CoordinatorLifecycleAssessmentType(o.value))
      ))
    }

    @pure def printVehicle_Controller_Mode_CoordinatorConditionEventType(o: Vehicle_Controller_Mode_Coordinator.ConditionEvent.Type): ST = {
      val value: String = o match {
        case Vehicle_Controller_Mode_Coordinator.ConditionEvent.NoConditionEvent => "NoConditionEvent"
        case Vehicle_Controller_Mode_Coordinator.ConditionEvent.Maintenance => "Maintenance"
        case Vehicle_Controller_Mode_Coordinator.ConditionEvent.Degraded => "Degraded"
        case Vehicle_Controller_Mode_Coordinator.ConditionEvent.ReturnToNormal => "ReturnToNormal"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Controller_Mode_Coordinator.ConditionEvent")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Controller_Mode_CoordinatorConditionEvent_Payload(o: Vehicle_Controller_Mode_Coordinator.ConditionEvent_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Mode_Coordinator.ConditionEvent_Payload""""),
        ("value", printVehicle_Controller_Mode_CoordinatorConditionEventType(o.value))
      ))
    }

    @pure def printVehicle_Controller_Mode_CoordinatorConditionAssessmentType(o: Vehicle_Controller_Mode_Coordinator.ConditionAssessment.Type): ST = {
      val value: String = o match {
        case Vehicle_Controller_Mode_Coordinator.ConditionAssessment.InvalidCondition => "InvalidCondition"
        case Vehicle_Controller_Mode_Coordinator.ConditionAssessment.NoCondition => "NoCondition"
        case Vehicle_Controller_Mode_Coordinator.ConditionAssessment.MaintenanceRequested => "MaintenanceRequested"
        case Vehicle_Controller_Mode_Coordinator.ConditionAssessment.DegradedReported => "DegradedReported"
        case Vehicle_Controller_Mode_Coordinator.ConditionAssessment.ReturnRequested => "ReturnRequested"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Controller_Mode_Coordinator.ConditionAssessment")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Controller_Mode_CoordinatorConditionAssessment_Payload(o: Vehicle_Controller_Mode_Coordinator.ConditionAssessment_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Mode_Coordinator.ConditionAssessment_Payload""""),
        ("value", printVehicle_Controller_Mode_CoordinatorConditionAssessmentType(o.value))
      ))
    }

    @pure def printVehicle_Controller_Mode_CoordinatorCoordinationClassType(o: Vehicle_Controller_Mode_Coordinator.CoordinationClass.Type): ST = {
      val value: String = o match {
        case Vehicle_Controller_Mode_Coordinator.CoordinationClass.InvalidEvidence => "InvalidEvidence"
        case Vehicle_Controller_Mode_Coordinator.CoordinationClass.Quiet => "Quiet"
        case Vehicle_Controller_Mode_Coordinator.CoordinationClass.LifecycleOnly => "LifecycleOnly"
        case Vehicle_Controller_Mode_Coordinator.CoordinationClass.ConditionOnly => "ConditionOnly"
        case Vehicle_Controller_Mode_Coordinator.CoordinationClass.OffDominantConflict => "OffDominantConflict"
        case Vehicle_Controller_Mode_Coordinator.CoordinationClass.ConditionDominantConflict => "ConditionDominantConflict"
        case Vehicle_Controller_Mode_Coordinator.CoordinationClass.RecoveryConflict => "RecoveryConflict"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Controller_Mode_Coordinator.CoordinationClass")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Controller_Mode_CoordinatorCoordinationClass_Payload(o: Vehicle_Controller_Mode_Coordinator.CoordinationClass_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Mode_Coordinator.CoordinationClass_Payload""""),
        ("value", printVehicle_Controller_Mode_CoordinatorCoordinationClassType(o.value))
      ))
    }

    @pure def printVehicle_Controller_Mode_CoordinatorControllerModeDispositionType(o: Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition.Type): ST = {
      val value: String = o match {
        case Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition.Off => "Off"
        case Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition.Starting => "Starting"
        case Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition.On => "On"
        case Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition.Maintenance => "Maintenance"
        case Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition.Degraded => "Degraded"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Controller_Mode_CoordinatorControllerModeDisposition_Payload(o: Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition_Payload""""),
        ("value", printVehicle_Controller_Mode_CoordinatorControllerModeDispositionType(o.value))
      ))
    }

    @pure def printVehicle_Controller_Mode_CoordinatorDecisionReasonType(o: Vehicle_Controller_Mode_Coordinator.DecisionReason.Type): ST = {
      val value: String = o match {
        case Vehicle_Controller_Mode_Coordinator.DecisionReason.InvalidEvidence => "InvalidEvidence"
        case Vehicle_Controller_Mode_Coordinator.DecisionReason.OffAccepted => "OffAccepted"
        case Vehicle_Controller_Mode_Coordinator.DecisionReason.DegradedAccepted => "DegradedAccepted"
        case Vehicle_Controller_Mode_Coordinator.DecisionReason.MaintenanceAccepted => "MaintenanceAccepted"
        case Vehicle_Controller_Mode_Coordinator.DecisionReason.ConflictingRequestsRejected => "ConflictingRequestsRejected"
        case Vehicle_Controller_Mode_Coordinator.DecisionReason.ReturnAccepted => "ReturnAccepted"
        case Vehicle_Controller_Mode_Coordinator.DecisionReason.ReturnNotApplicable => "ReturnNotApplicable"
        case Vehicle_Controller_Mode_Coordinator.DecisionReason.OnAccepted => "OnAccepted"
        case Vehicle_Controller_Mode_Coordinator.DecisionReason.StartAccepted => "StartAccepted"
        case Vehicle_Controller_Mode_Coordinator.DecisionReason.NoRequest => "NoRequest"
        case Vehicle_Controller_Mode_Coordinator.DecisionReason.TransitionRejected => "TransitionRejected"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Controller_Mode_Coordinator.DecisionReason")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Controller_Mode_CoordinatorDecisionReason_Payload(o: Vehicle_Controller_Mode_Coordinator.DecisionReason_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Mode_Coordinator.DecisionReason_Payload""""),
        ("value", printVehicle_Controller_Mode_CoordinatorDecisionReasonType(o.value))
      ))
    }

    @pure def printVehicle_Controller_Mode_CoordinatorCoordinationResultType(o: Vehicle_Controller_Mode_Coordinator.CoordinationResult.Type): ST = {
      val value: String = o match {
        case Vehicle_Controller_Mode_Coordinator.CoordinationResult.Applied => "Applied"
        case Vehicle_Controller_Mode_Coordinator.CoordinationResult.Stable => "Stable"
        case Vehicle_Controller_Mode_Coordinator.CoordinationResult.Rejected => "Rejected"
        case Vehicle_Controller_Mode_Coordinator.CoordinationResult.EvidenceFault => "EvidenceFault"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Controller_Mode_Coordinator.CoordinationResult")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Controller_Mode_CoordinatorCoordinationResult_Payload(o: Vehicle_Controller_Mode_Coordinator.CoordinationResult_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Mode_Coordinator.CoordinationResult_Payload""""),
        ("value", printVehicle_Controller_Mode_CoordinatorCoordinationResultType(o.value))
      ))
    }

    @pure def printVehicle_Controller_Mode_CoordinatorLifecycleSample(o: Vehicle_Controller_Mode_Coordinator.LifecycleSample): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Mode_Coordinator.LifecycleSample""""),
        ("eventValue", printVehicle_Controller_Mode_CoordinatorLifecycleEventType(o.eventValue)),
        ("status", printVehicle_Controller_Mode_CoordinatorInputStatusType(o.status))
      ))
    }

    @pure def printVehicle_Controller_Mode_CoordinatorLifecycleSample_Payload(o: Vehicle_Controller_Mode_Coordinator.LifecycleSample_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Mode_Coordinator.LifecycleSample_Payload""""),
        ("value", printVehicle_Controller_Mode_CoordinatorLifecycleSample(o.value))
      ))
    }

    @pure def printVehicle_Controller_Mode_CoordinatorConditionSample(o: Vehicle_Controller_Mode_Coordinator.ConditionSample): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Mode_Coordinator.ConditionSample""""),
        ("eventValue", printVehicle_Controller_Mode_CoordinatorConditionEventType(o.eventValue)),
        ("status", printVehicle_Controller_Mode_CoordinatorInputStatusType(o.status))
      ))
    }

    @pure def printVehicle_Controller_Mode_CoordinatorConditionSample_Payload(o: Vehicle_Controller_Mode_Coordinator.ConditionSample_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Mode_Coordinator.ConditionSample_Payload""""),
        ("value", printVehicle_Controller_Mode_CoordinatorConditionSample(o.value))
      ))
    }

    @pure def printVehicle_Controller_Mode_CoordinatorModeDecision(o: Vehicle_Controller_Mode_Coordinator.ModeDecision): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Mode_Coordinator.ModeDecision""""),
        ("nextMode", printVehicle_Controller_Mode_CoordinatorControllerModeDispositionType(o.nextMode)),
        ("reason", printVehicle_Controller_Mode_CoordinatorDecisionReasonType(o.reason))
      ))
    }

    @pure def printVehicle_Controller_Mode_CoordinatorModeDecision_Payload(o: Vehicle_Controller_Mode_Coordinator.ModeDecision_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Mode_Coordinator.ModeDecision_Payload""""),
        ("value", printVehicle_Controller_Mode_CoordinatorModeDecision(o.value))
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

    @pure def printVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container(o: Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container): ST = {
      o match {
        case o: Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_P => return printVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_P(o)
        case o: Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PS => return printVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PS(o)
      }
    }

    @pure def printVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_P(o: Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_P""""),
        ("api_lifecycle_sample", printVehicle_Controller_Mode_CoordinatorLifecycleSample(o.api_lifecycle_sample))
      ))
    }

    @pure def printVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PS(o: Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PS""""),
        ("api_lifecycle_sample", printVehicle_Controller_Mode_CoordinatorLifecycleSample(o.api_lifecycle_sample))
      ))
    }

    @pure def printVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container(o: Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container): ST = {
      o match {
        case o: Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_P => return printVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_P(o)
        case o: Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PS => return printVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PS(o)
      }
    }

    @pure def printVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_P(o: Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_P""""),
        ("api_assessment_to_arbiter", printVehicle_Controller_Mode_CoordinatorLifecycleAssessmentType(o.api_assessment_to_arbiter)),
        ("api_assessment_to_compatibility", printVehicle_Controller_Mode_CoordinatorLifecycleAssessmentType(o.api_assessment_to_compatibility))
      ))
    }

    @pure def printVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PS(o: Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PS""""),
        ("api_assessment_to_arbiter", printVehicle_Controller_Mode_CoordinatorLifecycleAssessmentType(o.api_assessment_to_arbiter)),
        ("api_assessment_to_compatibility", printVehicle_Controller_Mode_CoordinatorLifecycleAssessmentType(o.api_assessment_to_compatibility))
      ))
    }

    @pure def printVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container(o: Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container): ST = {
      o match {
        case o: Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_P => return printVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_P(o)
        case o: Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PS => return printVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PS(o)
      }
    }

    @pure def printVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_P(o: Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_P""""),
        ("api_condition_sample", printVehicle_Controller_Mode_CoordinatorConditionSample(o.api_condition_sample))
      ))
    }

    @pure def printVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PS(o: Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PS""""),
        ("api_condition_sample", printVehicle_Controller_Mode_CoordinatorConditionSample(o.api_condition_sample))
      ))
    }

    @pure def printVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container(o: Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container): ST = {
      o match {
        case o: Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_P => return printVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_P(o)
        case o: Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PS => return printVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PS(o)
      }
    }

    @pure def printVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_P(o: Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_P""""),
        ("api_assessment_to_arbiter", printVehicle_Controller_Mode_CoordinatorConditionAssessmentType(o.api_assessment_to_arbiter)),
        ("api_assessment_to_compatibility", printVehicle_Controller_Mode_CoordinatorConditionAssessmentType(o.api_assessment_to_compatibility))
      ))
    }

    @pure def printVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PS(o: Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PS""""),
        ("api_assessment_to_arbiter", printVehicle_Controller_Mode_CoordinatorConditionAssessmentType(o.api_assessment_to_arbiter)),
        ("api_assessment_to_compatibility", printVehicle_Controller_Mode_CoordinatorConditionAssessmentType(o.api_assessment_to_compatibility))
      ))
    }

    @pure def printVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container(o: Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container): ST = {
      o match {
        case o: Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_P => return printVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_P(o)
        case o: Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PS => return printVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PS(o)
      }
    }

    @pure def printVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_P(o: Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_P""""),
        ("api_condition_assessment", printVehicle_Controller_Mode_CoordinatorConditionAssessmentType(o.api_condition_assessment)),
        ("api_lifecycle_assessment", printVehicle_Controller_Mode_CoordinatorLifecycleAssessmentType(o.api_lifecycle_assessment))
      ))
    }

    @pure def printVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PS(o: Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PS""""),
        ("api_condition_assessment", printVehicle_Controller_Mode_CoordinatorConditionAssessmentType(o.api_condition_assessment)),
        ("api_lifecycle_assessment", printVehicle_Controller_Mode_CoordinatorLifecycleAssessmentType(o.api_lifecycle_assessment))
      ))
    }

    @pure def printVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container(o: Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container): ST = {
      o match {
        case o: Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_P => return printVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_P(o)
        case o: Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PS => return printVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PS(o)
      }
    }

    @pure def printVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_P(o: Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_P""""),
        ("api_coordination_class", printVehicle_Controller_Mode_CoordinatorCoordinationClassType(o.api_coordination_class))
      ))
    }

    @pure def printVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PS(o: Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PS""""),
        ("api_coordination_class", printVehicle_Controller_Mode_CoordinatorCoordinationClassType(o.api_coordination_class))
      ))
    }

    @pure def printVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container(o: Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container): ST = {
      o match {
        case o: Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_P => return printVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_P(o)
        case o: Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PS => return printVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PS(o)
      }
    }

    @pure def printVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_P(o: Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_P""""),
        ("api_condition_assessment", printVehicle_Controller_Mode_CoordinatorConditionAssessmentType(o.api_condition_assessment)),
        ("api_coordination_class", printVehicle_Controller_Mode_CoordinatorCoordinationClassType(o.api_coordination_class)),
        ("api_lifecycle_assessment", printVehicle_Controller_Mode_CoordinatorLifecycleAssessmentType(o.api_lifecycle_assessment))
      ))
    }

    @pure def printVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PS(o: Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PS""""),
        ("api_condition_assessment", printVehicle_Controller_Mode_CoordinatorConditionAssessmentType(o.api_condition_assessment)),
        ("api_coordination_class", printVehicle_Controller_Mode_CoordinatorCoordinationClassType(o.api_coordination_class)),
        ("api_lifecycle_assessment", printVehicle_Controller_Mode_CoordinatorLifecycleAssessmentType(o.api_lifecycle_assessment))
      ))
    }

    @pure def printVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container(o: Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container): ST = {
      o match {
        case o: Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_P => return printVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_P(o)
        case o: Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PS => return printVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PS(o)
      }
    }

    @pure def printVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_P(o: Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_P""""),
        ("api_mode_decision", printVehicle_Controller_Mode_CoordinatorModeDecision(o.api_mode_decision))
      ))
    }

    @pure def printVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PS(o: Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PS""""),
        ("api_mode_decision", printVehicle_Controller_Mode_CoordinatorModeDecision(o.api_mode_decision))
      ))
    }

    @pure def printVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container(o: Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container): ST = {
      o match {
        case o: Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_P => return printVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_P(o)
        case o: Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PS => return printVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PS(o)
      }
    }

    @pure def printVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_P(o: Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_P""""),
        ("api_mode_decision", printVehicle_Controller_Mode_CoordinatorModeDecision(o.api_mode_decision))
      ))
    }

    @pure def printVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PS(o: Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PS""""),
        ("api_mode_decision", printVehicle_Controller_Mode_CoordinatorModeDecision(o.api_mode_decision))
      ))
    }

    @pure def printVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container(o: Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container): ST = {
      o match {
        case o: Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_P => return printVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_P(o)
        case o: Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PS => return printVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PS(o)
      }
    }

    @pure def printVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_P(o: Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_P""""),
        ("api_coordination_result", printVehicle_Controller_Mode_CoordinatorCoordinationResultType(o.api_coordination_result)),
        ("api_mode_disposition", printVehicle_Controller_Mode_CoordinatorControllerModeDispositionType(o.api_mode_disposition))
      ))
    }

    @pure def printVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PS(o: Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PS""""),
        ("api_coordination_result", printVehicle_Controller_Mode_CoordinatorCoordinationResultType(o.api_coordination_result)),
        ("api_mode_disposition", printVehicle_Controller_Mode_CoordinatorControllerModeDispositionType(o.api_mode_disposition))
      ))
    }

    @pure def printruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): ST = {
      val value: String = o match {
        case runtimemonitor.ObservationKind.VehicleControllerModeCoordinatorSystem_Instance_mode_coordination_process_lifecycle_indication_qualification_postInit => "VehicleControllerModeCoordinatorSystem_Instance_mode_coordination_process_lifecycle_indication_qualification_postInit"
        case runtimemonitor.ObservationKind.VehicleControllerModeCoordinatorSystem_Instance_mode_coordination_process_lifecycle_indication_qualification_preCompute => "VehicleControllerModeCoordinatorSystem_Instance_mode_coordination_process_lifecycle_indication_qualification_preCompute"
        case runtimemonitor.ObservationKind.VehicleControllerModeCoordinatorSystem_Instance_mode_coordination_process_lifecycle_indication_qualification_postCompute => "VehicleControllerModeCoordinatorSystem_Instance_mode_coordination_process_lifecycle_indication_qualification_postCompute"
        case runtimemonitor.ObservationKind.VehicleControllerModeCoordinatorSystem_Instance_mode_coordination_process_condition_indication_qualification_postInit => "VehicleControllerModeCoordinatorSystem_Instance_mode_coordination_process_condition_indication_qualification_postInit"
        case runtimemonitor.ObservationKind.VehicleControllerModeCoordinatorSystem_Instance_mode_coordination_process_condition_indication_qualification_preCompute => "VehicleControllerModeCoordinatorSystem_Instance_mode_coordination_process_condition_indication_qualification_preCompute"
        case runtimemonitor.ObservationKind.VehicleControllerModeCoordinatorSystem_Instance_mode_coordination_process_condition_indication_qualification_postCompute => "VehicleControllerModeCoordinatorSystem_Instance_mode_coordination_process_condition_indication_qualification_postCompute"
        case runtimemonitor.ObservationKind.VehicleControllerModeCoordinatorSystem_Instance_mode_coordination_process_cross_channel_compatibility_postInit => "VehicleControllerModeCoordinatorSystem_Instance_mode_coordination_process_cross_channel_compatibility_postInit"
        case runtimemonitor.ObservationKind.VehicleControllerModeCoordinatorSystem_Instance_mode_coordination_process_cross_channel_compatibility_preCompute => "VehicleControllerModeCoordinatorSystem_Instance_mode_coordination_process_cross_channel_compatibility_preCompute"
        case runtimemonitor.ObservationKind.VehicleControllerModeCoordinatorSystem_Instance_mode_coordination_process_cross_channel_compatibility_postCompute => "VehicleControllerModeCoordinatorSystem_Instance_mode_coordination_process_cross_channel_compatibility_postCompute"
        case runtimemonitor.ObservationKind.VehicleControllerModeCoordinatorSystem_Instance_mode_coordination_process_controller_mode_arbitration_postInit => "VehicleControllerModeCoordinatorSystem_Instance_mode_coordination_process_controller_mode_arbitration_postInit"
        case runtimemonitor.ObservationKind.VehicleControllerModeCoordinatorSystem_Instance_mode_coordination_process_controller_mode_arbitration_preCompute => "VehicleControllerModeCoordinatorSystem_Instance_mode_coordination_process_controller_mode_arbitration_preCompute"
        case runtimemonitor.ObservationKind.VehicleControllerModeCoordinatorSystem_Instance_mode_coordination_process_controller_mode_arbitration_postCompute => "VehicleControllerModeCoordinatorSystem_Instance_mode_coordination_process_controller_mode_arbitration_postCompute"
        case runtimemonitor.ObservationKind.VehicleControllerModeCoordinatorSystem_Instance_mode_coordination_process_coordination_frame_derivation_postInit => "VehicleControllerModeCoordinatorSystem_Instance_mode_coordination_process_coordination_frame_derivation_postInit"
        case runtimemonitor.ObservationKind.VehicleControllerModeCoordinatorSystem_Instance_mode_coordination_process_coordination_frame_derivation_preCompute => "VehicleControllerModeCoordinatorSystem_Instance_mode_coordination_process_coordination_frame_derivation_preCompute"
        case runtimemonitor.ObservationKind.VehicleControllerModeCoordinatorSystem_Instance_mode_coordination_process_coordination_frame_derivation_postCompute => "VehicleControllerModeCoordinatorSystem_Instance_mode_coordination_process_coordination_frame_derivation_postCompute"
      }
      return printObject(ISZ(
        ("type", printString("runtimemonitor.ObservationKind")),
        ("value", printString(value))
      ))
    }

    @pure def printutilContainer(o: util.Container): ST = {
      o match {
        case o: util.EmptyContainer => return printutilEmptyContainer(o)
        case o: Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_P => return printVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_P(o)
        case o: Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_P => return printVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_P(o)
        case o: Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PS => return printVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PS(o)
        case o: Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PS => return printVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PS(o)
        case o: Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_P => return printVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_P(o)
        case o: Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_P => return printVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_P(o)
        case o: Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PS => return printVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PS(o)
        case o: Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PS => return printVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PS(o)
        case o: Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_P => return printVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_P(o)
        case o: Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PS => return printVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PS(o)
        case o: Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_P => return printVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_P(o)
        case o: Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PS => return printVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PS(o)
        case o: Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_P => return printVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_P(o)
        case o: Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_P => return printVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_P(o)
        case o: Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PS => return printVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PS(o)
        case o: Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PS => return printVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PS(o)
        case o: Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_P => return printVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_P(o)
        case o: Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_P => return printVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_P(o)
        case o: Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PS => return printVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PS(o)
        case o: Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PS => return printVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PS(o)
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
        case o: Vehicle_Controller_Mode_Coordinator.InputStatus_Payload => return printVehicle_Controller_Mode_CoordinatorInputStatus_Payload(o)
        case o: Vehicle_Controller_Mode_Coordinator.ModeDecision_Payload => return printVehicle_Controller_Mode_CoordinatorModeDecision_Payload(o)
        case o: Vehicle_Controller_Mode_Coordinator.LifecycleEvent_Payload => return printVehicle_Controller_Mode_CoordinatorLifecycleEvent_Payload(o)
        case o: Vehicle_Controller_Mode_Coordinator.ConditionEvent_Payload => return printVehicle_Controller_Mode_CoordinatorConditionEvent_Payload(o)
        case o: Vehicle_Controller_Mode_Coordinator.DecisionReason_Payload => return printVehicle_Controller_Mode_CoordinatorDecisionReason_Payload(o)
        case o: Vehicle_Controller_Mode_Coordinator.LifecycleSample_Payload => return printVehicle_Controller_Mode_CoordinatorLifecycleSample_Payload(o)
        case o: Vehicle_Controller_Mode_Coordinator.ConditionSample_Payload => return printVehicle_Controller_Mode_CoordinatorConditionSample_Payload(o)
        case o: Vehicle_Controller_Mode_Coordinator.CoordinationClass_Payload => return printVehicle_Controller_Mode_CoordinatorCoordinationClass_Payload(o)
        case o: Vehicle_Controller_Mode_Coordinator.CoordinationResult_Payload => return printVehicle_Controller_Mode_CoordinatorCoordinationResult_Payload(o)
        case o: Vehicle_Controller_Mode_Coordinator.LifecycleAssessment_Payload => return printVehicle_Controller_Mode_CoordinatorLifecycleAssessment_Payload(o)
        case o: Vehicle_Controller_Mode_Coordinator.ConditionAssessment_Payload => return printVehicle_Controller_Mode_CoordinatorConditionAssessment_Payload(o)
        case o: Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition_Payload => return printVehicle_Controller_Mode_CoordinatorControllerModeDisposition_Payload(o)
        case o: Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_P => return printVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_P(o)
        case o: Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_P => return printVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_P(o)
        case o: Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PS => return printVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PS(o)
        case o: Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PS => return printVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PS(o)
        case o: Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_P => return printVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_P(o)
        case o: Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_P => return printVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_P(o)
        case o: Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PS => return printVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PS(o)
        case o: Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PS => return printVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PS(o)
        case o: Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_P => return printVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_P(o)
        case o: Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PS => return printVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PS(o)
        case o: Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_P => return printVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_P(o)
        case o: Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PS => return printVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PS(o)
        case o: Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_P => return printVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_P(o)
        case o: Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_P => return printVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_P(o)
        case o: Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PS => return printVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PS(o)
        case o: Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PS => return printVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PS(o)
        case o: Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_P => return printVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_P(o)
        case o: Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_P => return printVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_P(o)
        case o: Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PS => return printVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PS(o)
        case o: Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PS => return printVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PS(o)
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

    def parseVehicle_Controller_Mode_CoordinatorLifecycleEventType(): Vehicle_Controller_Mode_Coordinator.LifecycleEvent.Type = {
      val r = parseVehicle_Controller_Mode_CoordinatorLifecycleEventT(F)
      return r
    }

    def parseVehicle_Controller_Mode_CoordinatorLifecycleEventT(typeParsed: B): Vehicle_Controller_Mode_Coordinator.LifecycleEvent.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Mode_Coordinator.LifecycleEvent")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Controller_Mode_Coordinator.LifecycleEvent.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Controller_Mode_Coordinator.LifecycleEvent.")
          return Vehicle_Controller_Mode_Coordinator.LifecycleEvent.byOrdinal(0).get
      }
    }

    def parseVehicle_Controller_Mode_CoordinatorLifecycleEvent_Payload(): Vehicle_Controller_Mode_Coordinator.LifecycleEvent_Payload = {
      val r = parseVehicle_Controller_Mode_CoordinatorLifecycleEvent_PayloadT(F)
      return r
    }

    def parseVehicle_Controller_Mode_CoordinatorLifecycleEvent_PayloadT(typeParsed: B): Vehicle_Controller_Mode_Coordinator.LifecycleEvent_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Mode_Coordinator.LifecycleEvent_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Controller_Mode_CoordinatorLifecycleEventType()
      parser.parseObjectNext()
      return Vehicle_Controller_Mode_Coordinator.LifecycleEvent_Payload(value)
    }

    def parseVehicle_Controller_Mode_CoordinatorInputStatusType(): Vehicle_Controller_Mode_Coordinator.InputStatus.Type = {
      val r = parseVehicle_Controller_Mode_CoordinatorInputStatusT(F)
      return r
    }

    def parseVehicle_Controller_Mode_CoordinatorInputStatusT(typeParsed: B): Vehicle_Controller_Mode_Coordinator.InputStatus.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Mode_Coordinator.InputStatus")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Controller_Mode_Coordinator.InputStatus.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Controller_Mode_Coordinator.InputStatus.")
          return Vehicle_Controller_Mode_Coordinator.InputStatus.byOrdinal(0).get
      }
    }

    def parseVehicle_Controller_Mode_CoordinatorInputStatus_Payload(): Vehicle_Controller_Mode_Coordinator.InputStatus_Payload = {
      val r = parseVehicle_Controller_Mode_CoordinatorInputStatus_PayloadT(F)
      return r
    }

    def parseVehicle_Controller_Mode_CoordinatorInputStatus_PayloadT(typeParsed: B): Vehicle_Controller_Mode_Coordinator.InputStatus_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Mode_Coordinator.InputStatus_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Controller_Mode_CoordinatorInputStatusType()
      parser.parseObjectNext()
      return Vehicle_Controller_Mode_Coordinator.InputStatus_Payload(value)
    }

    def parseVehicle_Controller_Mode_CoordinatorLifecycleAssessmentType(): Vehicle_Controller_Mode_Coordinator.LifecycleAssessment.Type = {
      val r = parseVehicle_Controller_Mode_CoordinatorLifecycleAssessmentT(F)
      return r
    }

    def parseVehicle_Controller_Mode_CoordinatorLifecycleAssessmentT(typeParsed: B): Vehicle_Controller_Mode_Coordinator.LifecycleAssessment.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Mode_Coordinator.LifecycleAssessment")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Controller_Mode_Coordinator.LifecycleAssessment.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Controller_Mode_Coordinator.LifecycleAssessment.")
          return Vehicle_Controller_Mode_Coordinator.LifecycleAssessment.byOrdinal(0).get
      }
    }

    def parseVehicle_Controller_Mode_CoordinatorLifecycleAssessment_Payload(): Vehicle_Controller_Mode_Coordinator.LifecycleAssessment_Payload = {
      val r = parseVehicle_Controller_Mode_CoordinatorLifecycleAssessment_PayloadT(F)
      return r
    }

    def parseVehicle_Controller_Mode_CoordinatorLifecycleAssessment_PayloadT(typeParsed: B): Vehicle_Controller_Mode_Coordinator.LifecycleAssessment_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Mode_Coordinator.LifecycleAssessment_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Controller_Mode_CoordinatorLifecycleAssessmentType()
      parser.parseObjectNext()
      return Vehicle_Controller_Mode_Coordinator.LifecycleAssessment_Payload(value)
    }

    def parseVehicle_Controller_Mode_CoordinatorConditionEventType(): Vehicle_Controller_Mode_Coordinator.ConditionEvent.Type = {
      val r = parseVehicle_Controller_Mode_CoordinatorConditionEventT(F)
      return r
    }

    def parseVehicle_Controller_Mode_CoordinatorConditionEventT(typeParsed: B): Vehicle_Controller_Mode_Coordinator.ConditionEvent.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Mode_Coordinator.ConditionEvent")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Controller_Mode_Coordinator.ConditionEvent.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Controller_Mode_Coordinator.ConditionEvent.")
          return Vehicle_Controller_Mode_Coordinator.ConditionEvent.byOrdinal(0).get
      }
    }

    def parseVehicle_Controller_Mode_CoordinatorConditionEvent_Payload(): Vehicle_Controller_Mode_Coordinator.ConditionEvent_Payload = {
      val r = parseVehicle_Controller_Mode_CoordinatorConditionEvent_PayloadT(F)
      return r
    }

    def parseVehicle_Controller_Mode_CoordinatorConditionEvent_PayloadT(typeParsed: B): Vehicle_Controller_Mode_Coordinator.ConditionEvent_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Mode_Coordinator.ConditionEvent_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Controller_Mode_CoordinatorConditionEventType()
      parser.parseObjectNext()
      return Vehicle_Controller_Mode_Coordinator.ConditionEvent_Payload(value)
    }

    def parseVehicle_Controller_Mode_CoordinatorConditionAssessmentType(): Vehicle_Controller_Mode_Coordinator.ConditionAssessment.Type = {
      val r = parseVehicle_Controller_Mode_CoordinatorConditionAssessmentT(F)
      return r
    }

    def parseVehicle_Controller_Mode_CoordinatorConditionAssessmentT(typeParsed: B): Vehicle_Controller_Mode_Coordinator.ConditionAssessment.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Mode_Coordinator.ConditionAssessment")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Controller_Mode_Coordinator.ConditionAssessment.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Controller_Mode_Coordinator.ConditionAssessment.")
          return Vehicle_Controller_Mode_Coordinator.ConditionAssessment.byOrdinal(0).get
      }
    }

    def parseVehicle_Controller_Mode_CoordinatorConditionAssessment_Payload(): Vehicle_Controller_Mode_Coordinator.ConditionAssessment_Payload = {
      val r = parseVehicle_Controller_Mode_CoordinatorConditionAssessment_PayloadT(F)
      return r
    }

    def parseVehicle_Controller_Mode_CoordinatorConditionAssessment_PayloadT(typeParsed: B): Vehicle_Controller_Mode_Coordinator.ConditionAssessment_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Mode_Coordinator.ConditionAssessment_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Controller_Mode_CoordinatorConditionAssessmentType()
      parser.parseObjectNext()
      return Vehicle_Controller_Mode_Coordinator.ConditionAssessment_Payload(value)
    }

    def parseVehicle_Controller_Mode_CoordinatorCoordinationClassType(): Vehicle_Controller_Mode_Coordinator.CoordinationClass.Type = {
      val r = parseVehicle_Controller_Mode_CoordinatorCoordinationClassT(F)
      return r
    }

    def parseVehicle_Controller_Mode_CoordinatorCoordinationClassT(typeParsed: B): Vehicle_Controller_Mode_Coordinator.CoordinationClass.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Mode_Coordinator.CoordinationClass")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Controller_Mode_Coordinator.CoordinationClass.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Controller_Mode_Coordinator.CoordinationClass.")
          return Vehicle_Controller_Mode_Coordinator.CoordinationClass.byOrdinal(0).get
      }
    }

    def parseVehicle_Controller_Mode_CoordinatorCoordinationClass_Payload(): Vehicle_Controller_Mode_Coordinator.CoordinationClass_Payload = {
      val r = parseVehicle_Controller_Mode_CoordinatorCoordinationClass_PayloadT(F)
      return r
    }

    def parseVehicle_Controller_Mode_CoordinatorCoordinationClass_PayloadT(typeParsed: B): Vehicle_Controller_Mode_Coordinator.CoordinationClass_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Mode_Coordinator.CoordinationClass_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Controller_Mode_CoordinatorCoordinationClassType()
      parser.parseObjectNext()
      return Vehicle_Controller_Mode_Coordinator.CoordinationClass_Payload(value)
    }

    def parseVehicle_Controller_Mode_CoordinatorControllerModeDispositionType(): Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition.Type = {
      val r = parseVehicle_Controller_Mode_CoordinatorControllerModeDispositionT(F)
      return r
    }

    def parseVehicle_Controller_Mode_CoordinatorControllerModeDispositionT(typeParsed: B): Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition.")
          return Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition.byOrdinal(0).get
      }
    }

    def parseVehicle_Controller_Mode_CoordinatorControllerModeDisposition_Payload(): Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition_Payload = {
      val r = parseVehicle_Controller_Mode_CoordinatorControllerModeDisposition_PayloadT(F)
      return r
    }

    def parseVehicle_Controller_Mode_CoordinatorControllerModeDisposition_PayloadT(typeParsed: B): Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Controller_Mode_CoordinatorControllerModeDispositionType()
      parser.parseObjectNext()
      return Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition_Payload(value)
    }

    def parseVehicle_Controller_Mode_CoordinatorDecisionReasonType(): Vehicle_Controller_Mode_Coordinator.DecisionReason.Type = {
      val r = parseVehicle_Controller_Mode_CoordinatorDecisionReasonT(F)
      return r
    }

    def parseVehicle_Controller_Mode_CoordinatorDecisionReasonT(typeParsed: B): Vehicle_Controller_Mode_Coordinator.DecisionReason.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Mode_Coordinator.DecisionReason")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Controller_Mode_Coordinator.DecisionReason.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Controller_Mode_Coordinator.DecisionReason.")
          return Vehicle_Controller_Mode_Coordinator.DecisionReason.byOrdinal(0).get
      }
    }

    def parseVehicle_Controller_Mode_CoordinatorDecisionReason_Payload(): Vehicle_Controller_Mode_Coordinator.DecisionReason_Payload = {
      val r = parseVehicle_Controller_Mode_CoordinatorDecisionReason_PayloadT(F)
      return r
    }

    def parseVehicle_Controller_Mode_CoordinatorDecisionReason_PayloadT(typeParsed: B): Vehicle_Controller_Mode_Coordinator.DecisionReason_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Mode_Coordinator.DecisionReason_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Controller_Mode_CoordinatorDecisionReasonType()
      parser.parseObjectNext()
      return Vehicle_Controller_Mode_Coordinator.DecisionReason_Payload(value)
    }

    def parseVehicle_Controller_Mode_CoordinatorCoordinationResultType(): Vehicle_Controller_Mode_Coordinator.CoordinationResult.Type = {
      val r = parseVehicle_Controller_Mode_CoordinatorCoordinationResultT(F)
      return r
    }

    def parseVehicle_Controller_Mode_CoordinatorCoordinationResultT(typeParsed: B): Vehicle_Controller_Mode_Coordinator.CoordinationResult.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Mode_Coordinator.CoordinationResult")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Controller_Mode_Coordinator.CoordinationResult.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Controller_Mode_Coordinator.CoordinationResult.")
          return Vehicle_Controller_Mode_Coordinator.CoordinationResult.byOrdinal(0).get
      }
    }

    def parseVehicle_Controller_Mode_CoordinatorCoordinationResult_Payload(): Vehicle_Controller_Mode_Coordinator.CoordinationResult_Payload = {
      val r = parseVehicle_Controller_Mode_CoordinatorCoordinationResult_PayloadT(F)
      return r
    }

    def parseVehicle_Controller_Mode_CoordinatorCoordinationResult_PayloadT(typeParsed: B): Vehicle_Controller_Mode_Coordinator.CoordinationResult_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Mode_Coordinator.CoordinationResult_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Controller_Mode_CoordinatorCoordinationResultType()
      parser.parseObjectNext()
      return Vehicle_Controller_Mode_Coordinator.CoordinationResult_Payload(value)
    }

    def parseVehicle_Controller_Mode_CoordinatorLifecycleSample(): Vehicle_Controller_Mode_Coordinator.LifecycleSample = {
      val r = parseVehicle_Controller_Mode_CoordinatorLifecycleSampleT(F)
      return r
    }

    def parseVehicle_Controller_Mode_CoordinatorLifecycleSampleT(typeParsed: B): Vehicle_Controller_Mode_Coordinator.LifecycleSample = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Mode_Coordinator.LifecycleSample")
      }
      parser.parseObjectKey("eventValue")
      val eventValue = parseVehicle_Controller_Mode_CoordinatorLifecycleEventType()
      parser.parseObjectNext()
      parser.parseObjectKey("status")
      val status = parseVehicle_Controller_Mode_CoordinatorInputStatusType()
      parser.parseObjectNext()
      return Vehicle_Controller_Mode_Coordinator.LifecycleSample(eventValue, status)
    }

    def parseVehicle_Controller_Mode_CoordinatorLifecycleSample_Payload(): Vehicle_Controller_Mode_Coordinator.LifecycleSample_Payload = {
      val r = parseVehicle_Controller_Mode_CoordinatorLifecycleSample_PayloadT(F)
      return r
    }

    def parseVehicle_Controller_Mode_CoordinatorLifecycleSample_PayloadT(typeParsed: B): Vehicle_Controller_Mode_Coordinator.LifecycleSample_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Mode_Coordinator.LifecycleSample_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Controller_Mode_CoordinatorLifecycleSample()
      parser.parseObjectNext()
      return Vehicle_Controller_Mode_Coordinator.LifecycleSample_Payload(value)
    }

    def parseVehicle_Controller_Mode_CoordinatorConditionSample(): Vehicle_Controller_Mode_Coordinator.ConditionSample = {
      val r = parseVehicle_Controller_Mode_CoordinatorConditionSampleT(F)
      return r
    }

    def parseVehicle_Controller_Mode_CoordinatorConditionSampleT(typeParsed: B): Vehicle_Controller_Mode_Coordinator.ConditionSample = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Mode_Coordinator.ConditionSample")
      }
      parser.parseObjectKey("eventValue")
      val eventValue = parseVehicle_Controller_Mode_CoordinatorConditionEventType()
      parser.parseObjectNext()
      parser.parseObjectKey("status")
      val status = parseVehicle_Controller_Mode_CoordinatorInputStatusType()
      parser.parseObjectNext()
      return Vehicle_Controller_Mode_Coordinator.ConditionSample(eventValue, status)
    }

    def parseVehicle_Controller_Mode_CoordinatorConditionSample_Payload(): Vehicle_Controller_Mode_Coordinator.ConditionSample_Payload = {
      val r = parseVehicle_Controller_Mode_CoordinatorConditionSample_PayloadT(F)
      return r
    }

    def parseVehicle_Controller_Mode_CoordinatorConditionSample_PayloadT(typeParsed: B): Vehicle_Controller_Mode_Coordinator.ConditionSample_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Mode_Coordinator.ConditionSample_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Controller_Mode_CoordinatorConditionSample()
      parser.parseObjectNext()
      return Vehicle_Controller_Mode_Coordinator.ConditionSample_Payload(value)
    }

    def parseVehicle_Controller_Mode_CoordinatorModeDecision(): Vehicle_Controller_Mode_Coordinator.ModeDecision = {
      val r = parseVehicle_Controller_Mode_CoordinatorModeDecisionT(F)
      return r
    }

    def parseVehicle_Controller_Mode_CoordinatorModeDecisionT(typeParsed: B): Vehicle_Controller_Mode_Coordinator.ModeDecision = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Mode_Coordinator.ModeDecision")
      }
      parser.parseObjectKey("nextMode")
      val nextMode = parseVehicle_Controller_Mode_CoordinatorControllerModeDispositionType()
      parser.parseObjectNext()
      parser.parseObjectKey("reason")
      val reason = parseVehicle_Controller_Mode_CoordinatorDecisionReasonType()
      parser.parseObjectNext()
      return Vehicle_Controller_Mode_Coordinator.ModeDecision(nextMode, reason)
    }

    def parseVehicle_Controller_Mode_CoordinatorModeDecision_Payload(): Vehicle_Controller_Mode_Coordinator.ModeDecision_Payload = {
      val r = parseVehicle_Controller_Mode_CoordinatorModeDecision_PayloadT(F)
      return r
    }

    def parseVehicle_Controller_Mode_CoordinatorModeDecision_PayloadT(typeParsed: B): Vehicle_Controller_Mode_Coordinator.ModeDecision_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Mode_Coordinator.ModeDecision_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Controller_Mode_CoordinatorModeDecision()
      parser.parseObjectNext()
      return Vehicle_Controller_Mode_Coordinator.ModeDecision_Payload(value)
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

    def parseVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container(): Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_P", "Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PS"))
      t.native match {
        case "Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_P" => val r = parseVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PT(T); return r
        case "Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PS" => val r = parseVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PST(T); return r
        case _ => val r = parseVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PST(T); return r
      }
    }

    def parseVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_P(): Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_P = {
      val r = parseVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PT(F)
      return r
    }

    def parseVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PT(typeParsed: B): Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_P")
      }
      parser.parseObjectKey("api_lifecycle_sample")
      val api_lifecycle_sample = parseVehicle_Controller_Mode_CoordinatorLifecycleSample()
      parser.parseObjectNext()
      return Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_P(api_lifecycle_sample)
    }

    def parseVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PS(): Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PS = {
      val r = parseVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PST(F)
      return r
    }

    def parseVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PST(typeParsed: B): Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PS")
      }
      parser.parseObjectKey("api_lifecycle_sample")
      val api_lifecycle_sample = parseVehicle_Controller_Mode_CoordinatorLifecycleSample()
      parser.parseObjectNext()
      return Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PS(api_lifecycle_sample)
    }

    def parseVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container(): Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_P", "Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PS"))
      t.native match {
        case "Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_P" => val r = parseVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PT(T); return r
        case "Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PS" => val r = parseVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PST(T); return r
        case _ => val r = parseVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PST(T); return r
      }
    }

    def parseVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_P(): Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_P = {
      val r = parseVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PT(F)
      return r
    }

    def parseVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PT(typeParsed: B): Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_P")
      }
      parser.parseObjectKey("api_assessment_to_arbiter")
      val api_assessment_to_arbiter = parseVehicle_Controller_Mode_CoordinatorLifecycleAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_assessment_to_compatibility")
      val api_assessment_to_compatibility = parseVehicle_Controller_Mode_CoordinatorLifecycleAssessmentType()
      parser.parseObjectNext()
      return Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_P(api_assessment_to_arbiter, api_assessment_to_compatibility)
    }

    def parseVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PS(): Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PS = {
      val r = parseVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PST(F)
      return r
    }

    def parseVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PST(typeParsed: B): Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PS")
      }
      parser.parseObjectKey("api_assessment_to_arbiter")
      val api_assessment_to_arbiter = parseVehicle_Controller_Mode_CoordinatorLifecycleAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_assessment_to_compatibility")
      val api_assessment_to_compatibility = parseVehicle_Controller_Mode_CoordinatorLifecycleAssessmentType()
      parser.parseObjectNext()
      return Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PS(api_assessment_to_arbiter, api_assessment_to_compatibility)
    }

    def parseVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container(): Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_P", "Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PS"))
      t.native match {
        case "Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_P" => val r = parseVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PT(T); return r
        case "Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PS" => val r = parseVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PST(T); return r
        case _ => val r = parseVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PST(T); return r
      }
    }

    def parseVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_P(): Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_P = {
      val r = parseVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PT(F)
      return r
    }

    def parseVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PT(typeParsed: B): Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_P")
      }
      parser.parseObjectKey("api_condition_sample")
      val api_condition_sample = parseVehicle_Controller_Mode_CoordinatorConditionSample()
      parser.parseObjectNext()
      return Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_P(api_condition_sample)
    }

    def parseVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PS(): Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PS = {
      val r = parseVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PST(F)
      return r
    }

    def parseVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PST(typeParsed: B): Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PS")
      }
      parser.parseObjectKey("api_condition_sample")
      val api_condition_sample = parseVehicle_Controller_Mode_CoordinatorConditionSample()
      parser.parseObjectNext()
      return Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PS(api_condition_sample)
    }

    def parseVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container(): Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_P", "Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PS"))
      t.native match {
        case "Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_P" => val r = parseVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PT(T); return r
        case "Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PS" => val r = parseVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PST(T); return r
        case _ => val r = parseVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PST(T); return r
      }
    }

    def parseVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_P(): Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_P = {
      val r = parseVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PT(F)
      return r
    }

    def parseVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PT(typeParsed: B): Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_P")
      }
      parser.parseObjectKey("api_assessment_to_arbiter")
      val api_assessment_to_arbiter = parseVehicle_Controller_Mode_CoordinatorConditionAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_assessment_to_compatibility")
      val api_assessment_to_compatibility = parseVehicle_Controller_Mode_CoordinatorConditionAssessmentType()
      parser.parseObjectNext()
      return Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_P(api_assessment_to_arbiter, api_assessment_to_compatibility)
    }

    def parseVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PS(): Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PS = {
      val r = parseVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PST(F)
      return r
    }

    def parseVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PST(typeParsed: B): Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PS")
      }
      parser.parseObjectKey("api_assessment_to_arbiter")
      val api_assessment_to_arbiter = parseVehicle_Controller_Mode_CoordinatorConditionAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_assessment_to_compatibility")
      val api_assessment_to_compatibility = parseVehicle_Controller_Mode_CoordinatorConditionAssessmentType()
      parser.parseObjectNext()
      return Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PS(api_assessment_to_arbiter, api_assessment_to_compatibility)
    }

    def parseVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container(): Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_P", "Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PS"))
      t.native match {
        case "Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_P" => val r = parseVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PT(T); return r
        case "Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PS" => val r = parseVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PST(T); return r
        case _ => val r = parseVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PST(T); return r
      }
    }

    def parseVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_P(): Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_P = {
      val r = parseVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PT(F)
      return r
    }

    def parseVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PT(typeParsed: B): Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_P")
      }
      parser.parseObjectKey("api_condition_assessment")
      val api_condition_assessment = parseVehicle_Controller_Mode_CoordinatorConditionAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_lifecycle_assessment")
      val api_lifecycle_assessment = parseVehicle_Controller_Mode_CoordinatorLifecycleAssessmentType()
      parser.parseObjectNext()
      return Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_P(api_condition_assessment, api_lifecycle_assessment)
    }

    def parseVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PS(): Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PS = {
      val r = parseVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PST(F)
      return r
    }

    def parseVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PST(typeParsed: B): Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PS")
      }
      parser.parseObjectKey("api_condition_assessment")
      val api_condition_assessment = parseVehicle_Controller_Mode_CoordinatorConditionAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_lifecycle_assessment")
      val api_lifecycle_assessment = parseVehicle_Controller_Mode_CoordinatorLifecycleAssessmentType()
      parser.parseObjectNext()
      return Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PS(api_condition_assessment, api_lifecycle_assessment)
    }

    def parseVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container(): Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_P", "Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PS"))
      t.native match {
        case "Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_P" => val r = parseVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PT(T); return r
        case "Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PS" => val r = parseVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PST(T); return r
        case _ => val r = parseVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PST(T); return r
      }
    }

    def parseVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_P(): Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_P = {
      val r = parseVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PT(F)
      return r
    }

    def parseVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PT(typeParsed: B): Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_P")
      }
      parser.parseObjectKey("api_coordination_class")
      val api_coordination_class = parseVehicle_Controller_Mode_CoordinatorCoordinationClassType()
      parser.parseObjectNext()
      return Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_P(api_coordination_class)
    }

    def parseVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PS(): Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PS = {
      val r = parseVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PST(F)
      return r
    }

    def parseVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PST(typeParsed: B): Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PS")
      }
      parser.parseObjectKey("api_coordination_class")
      val api_coordination_class = parseVehicle_Controller_Mode_CoordinatorCoordinationClassType()
      parser.parseObjectNext()
      return Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PS(api_coordination_class)
    }

    def parseVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container(): Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_P", "Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PS"))
      t.native match {
        case "Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_P" => val r = parseVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PT(T); return r
        case "Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PS" => val r = parseVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PST(T); return r
        case _ => val r = parseVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PST(T); return r
      }
    }

    def parseVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_P(): Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_P = {
      val r = parseVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PT(F)
      return r
    }

    def parseVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PT(typeParsed: B): Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_P")
      }
      parser.parseObjectKey("api_condition_assessment")
      val api_condition_assessment = parseVehicle_Controller_Mode_CoordinatorConditionAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_coordination_class")
      val api_coordination_class = parseVehicle_Controller_Mode_CoordinatorCoordinationClassType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_lifecycle_assessment")
      val api_lifecycle_assessment = parseVehicle_Controller_Mode_CoordinatorLifecycleAssessmentType()
      parser.parseObjectNext()
      return Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_P(api_condition_assessment, api_coordination_class, api_lifecycle_assessment)
    }

    def parseVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PS(): Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PS = {
      val r = parseVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PST(F)
      return r
    }

    def parseVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PST(typeParsed: B): Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PS")
      }
      parser.parseObjectKey("api_condition_assessment")
      val api_condition_assessment = parseVehicle_Controller_Mode_CoordinatorConditionAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_coordination_class")
      val api_coordination_class = parseVehicle_Controller_Mode_CoordinatorCoordinationClassType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_lifecycle_assessment")
      val api_lifecycle_assessment = parseVehicle_Controller_Mode_CoordinatorLifecycleAssessmentType()
      parser.parseObjectNext()
      return Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PS(api_condition_assessment, api_coordination_class, api_lifecycle_assessment)
    }

    def parseVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container(): Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_P", "Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PS"))
      t.native match {
        case "Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_P" => val r = parseVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PT(T); return r
        case "Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PS" => val r = parseVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PST(T); return r
        case _ => val r = parseVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PST(T); return r
      }
    }

    def parseVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_P(): Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_P = {
      val r = parseVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PT(F)
      return r
    }

    def parseVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PT(typeParsed: B): Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_P")
      }
      parser.parseObjectKey("api_mode_decision")
      val api_mode_decision = parseVehicle_Controller_Mode_CoordinatorModeDecision()
      parser.parseObjectNext()
      return Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_P(api_mode_decision)
    }

    def parseVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PS(): Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PS = {
      val r = parseVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PST(F)
      return r
    }

    def parseVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PST(typeParsed: B): Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PS")
      }
      parser.parseObjectKey("api_mode_decision")
      val api_mode_decision = parseVehicle_Controller_Mode_CoordinatorModeDecision()
      parser.parseObjectNext()
      return Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PS(api_mode_decision)
    }

    def parseVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container(): Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_P", "Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PS"))
      t.native match {
        case "Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_P" => val r = parseVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PT(T); return r
        case "Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PS" => val r = parseVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PST(T); return r
        case _ => val r = parseVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PST(T); return r
      }
    }

    def parseVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_P(): Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_P = {
      val r = parseVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PT(F)
      return r
    }

    def parseVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PT(typeParsed: B): Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_P")
      }
      parser.parseObjectKey("api_mode_decision")
      val api_mode_decision = parseVehicle_Controller_Mode_CoordinatorModeDecision()
      parser.parseObjectNext()
      return Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_P(api_mode_decision)
    }

    def parseVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PS(): Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PS = {
      val r = parseVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PST(F)
      return r
    }

    def parseVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PST(typeParsed: B): Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PS")
      }
      parser.parseObjectKey("api_mode_decision")
      val api_mode_decision = parseVehicle_Controller_Mode_CoordinatorModeDecision()
      parser.parseObjectNext()
      return Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PS(api_mode_decision)
    }

    def parseVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container(): Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_P", "Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PS"))
      t.native match {
        case "Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_P" => val r = parseVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PT(T); return r
        case "Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PS" => val r = parseVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PST(T); return r
        case _ => val r = parseVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PST(T); return r
      }
    }

    def parseVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_P(): Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_P = {
      val r = parseVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PT(F)
      return r
    }

    def parseVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PT(typeParsed: B): Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_P")
      }
      parser.parseObjectKey("api_coordination_result")
      val api_coordination_result = parseVehicle_Controller_Mode_CoordinatorCoordinationResultType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_mode_disposition")
      val api_mode_disposition = parseVehicle_Controller_Mode_CoordinatorControllerModeDispositionType()
      parser.parseObjectNext()
      return Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_P(api_coordination_result, api_mode_disposition)
    }

    def parseVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PS(): Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PS = {
      val r = parseVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PST(F)
      return r
    }

    def parseVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PST(typeParsed: B): Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PS")
      }
      parser.parseObjectKey("api_coordination_result")
      val api_coordination_result = parseVehicle_Controller_Mode_CoordinatorCoordinationResultType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_mode_disposition")
      val api_mode_disposition = parseVehicle_Controller_Mode_CoordinatorControllerModeDispositionType()
      parser.parseObjectNext()
      return Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PS(api_coordination_result, api_mode_disposition)
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
      val t = parser.parseObjectTypes(ISZ("util.EmptyContainer", "Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_P", "Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_P", "Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PS", "Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PS", "Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_P", "Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_P", "Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PS", "Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PS", "Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_P", "Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PS", "Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_P", "Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PS", "Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_P", "Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_P", "Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PS", "Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PS", "Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_P", "Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_P", "Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PS", "Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PS"))
      t.native match {
        case "util.EmptyContainer" => val r = parseutilEmptyContainerT(T); return r
        case "Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_P" => val r = parseVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PT(T); return r
        case "Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_P" => val r = parseVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PT(T); return r
        case "Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PS" => val r = parseVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PST(T); return r
        case "Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PS" => val r = parseVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PST(T); return r
        case "Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_P" => val r = parseVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PT(T); return r
        case "Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_P" => val r = parseVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PT(T); return r
        case "Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PS" => val r = parseVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PST(T); return r
        case "Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PS" => val r = parseVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PST(T); return r
        case "Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_P" => val r = parseVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PT(T); return r
        case "Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PS" => val r = parseVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PST(T); return r
        case "Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_P" => val r = parseVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PT(T); return r
        case "Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PS" => val r = parseVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PST(T); return r
        case "Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_P" => val r = parseVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PT(T); return r
        case "Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_P" => val r = parseVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PT(T); return r
        case "Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PS" => val r = parseVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PST(T); return r
        case "Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PS" => val r = parseVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PST(T); return r
        case "Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_P" => val r = parseVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PT(T); return r
        case "Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_P" => val r = parseVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PT(T); return r
        case "Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PS" => val r = parseVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PST(T); return r
        case "Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PS" => val r = parseVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PST(T); return r
        case _ => val r = parseVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PST(T); return r
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
      val t = parser.parseObjectTypes(ISZ("art.Empty", "Base_Types.Boolean_Payload", "Base_Types.Integer_Payload", "Base_Types.Integer_8_Payload", "Base_Types.Integer_16_Payload", "Base_Types.Integer_32_Payload", "Base_Types.Integer_64_Payload", "Base_Types.Unsigned_8_Payload", "Base_Types.Unsigned_16_Payload", "Base_Types.Unsigned_32_Payload", "Base_Types.Unsigned_64_Payload", "Base_Types.Float_Payload", "Base_Types.Float_32_Payload", "Base_Types.Float_64_Payload", "Base_Types.Character_Payload", "Base_Types.String_Payload", "Base_Types.Bits_Payload", "util.EmptyContainer", "Vehicle_Controller_Mode_Coordinator.InputStatus_Payload", "Vehicle_Controller_Mode_Coordinator.ModeDecision_Payload", "Vehicle_Controller_Mode_Coordinator.LifecycleEvent_Payload", "Vehicle_Controller_Mode_Coordinator.ConditionEvent_Payload", "Vehicle_Controller_Mode_Coordinator.DecisionReason_Payload", "Vehicle_Controller_Mode_Coordinator.LifecycleSample_Payload", "Vehicle_Controller_Mode_Coordinator.ConditionSample_Payload", "Vehicle_Controller_Mode_Coordinator.CoordinationClass_Payload", "Vehicle_Controller_Mode_Coordinator.CoordinationResult_Payload", "Vehicle_Controller_Mode_Coordinator.LifecycleAssessment_Payload", "Vehicle_Controller_Mode_Coordinator.ConditionAssessment_Payload", "Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition_Payload", "Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_P", "Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_P", "Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PS", "Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PS", "Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_P", "Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_P", "Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PS", "Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PS", "Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_P", "Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PS", "Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_P", "Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PS", "Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_P", "Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_P", "Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PS", "Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PS", "Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_P", "Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_P", "Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PS", "Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PS"))
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
        case "Vehicle_Controller_Mode_Coordinator.InputStatus_Payload" => val r = parseVehicle_Controller_Mode_CoordinatorInputStatus_PayloadT(T); return r
        case "Vehicle_Controller_Mode_Coordinator.ModeDecision_Payload" => val r = parseVehicle_Controller_Mode_CoordinatorModeDecision_PayloadT(T); return r
        case "Vehicle_Controller_Mode_Coordinator.LifecycleEvent_Payload" => val r = parseVehicle_Controller_Mode_CoordinatorLifecycleEvent_PayloadT(T); return r
        case "Vehicle_Controller_Mode_Coordinator.ConditionEvent_Payload" => val r = parseVehicle_Controller_Mode_CoordinatorConditionEvent_PayloadT(T); return r
        case "Vehicle_Controller_Mode_Coordinator.DecisionReason_Payload" => val r = parseVehicle_Controller_Mode_CoordinatorDecisionReason_PayloadT(T); return r
        case "Vehicle_Controller_Mode_Coordinator.LifecycleSample_Payload" => val r = parseVehicle_Controller_Mode_CoordinatorLifecycleSample_PayloadT(T); return r
        case "Vehicle_Controller_Mode_Coordinator.ConditionSample_Payload" => val r = parseVehicle_Controller_Mode_CoordinatorConditionSample_PayloadT(T); return r
        case "Vehicle_Controller_Mode_Coordinator.CoordinationClass_Payload" => val r = parseVehicle_Controller_Mode_CoordinatorCoordinationClass_PayloadT(T); return r
        case "Vehicle_Controller_Mode_Coordinator.CoordinationResult_Payload" => val r = parseVehicle_Controller_Mode_CoordinatorCoordinationResult_PayloadT(T); return r
        case "Vehicle_Controller_Mode_Coordinator.LifecycleAssessment_Payload" => val r = parseVehicle_Controller_Mode_CoordinatorLifecycleAssessment_PayloadT(T); return r
        case "Vehicle_Controller_Mode_Coordinator.ConditionAssessment_Payload" => val r = parseVehicle_Controller_Mode_CoordinatorConditionAssessment_PayloadT(T); return r
        case "Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition_Payload" => val r = parseVehicle_Controller_Mode_CoordinatorControllerModeDisposition_PayloadT(T); return r
        case "Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_P" => val r = parseVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PT(T); return r
        case "Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_P" => val r = parseVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PT(T); return r
        case "Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PS" => val r = parseVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PST(T); return r
        case "Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PS" => val r = parseVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PST(T); return r
        case "Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_P" => val r = parseVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PT(T); return r
        case "Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_P" => val r = parseVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PT(T); return r
        case "Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PS" => val r = parseVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PST(T); return r
        case "Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PS" => val r = parseVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PST(T); return r
        case "Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_P" => val r = parseVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PT(T); return r
        case "Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PS" => val r = parseVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PST(T); return r
        case "Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_P" => val r = parseVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PT(T); return r
        case "Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PS" => val r = parseVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PST(T); return r
        case "Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_P" => val r = parseVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PT(T); return r
        case "Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_P" => val r = parseVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PT(T); return r
        case "Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PS" => val r = parseVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PST(T); return r
        case "Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PS" => val r = parseVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PST(T); return r
        case "Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_P" => val r = parseVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PT(T); return r
        case "Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_P" => val r = parseVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PT(T); return r
        case "Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PS" => val r = parseVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PST(T); return r
        case "Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PS" => val r = parseVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PST(T); return r
        case _ => val r = parseVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PST(T); return r
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

  def fromVehicle_Controller_Mode_CoordinatorLifecycleEvent_Payload(o: Vehicle_Controller_Mode_Coordinator.LifecycleEvent_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Mode_CoordinatorLifecycleEvent_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Mode_CoordinatorLifecycleEvent_Payload(s: String): Either[Vehicle_Controller_Mode_Coordinator.LifecycleEvent_Payload, Json.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorLifecycleEvent_Payload(parser: Parser): Vehicle_Controller_Mode_Coordinator.LifecycleEvent_Payload = {
      val r = parser.parseVehicle_Controller_Mode_CoordinatorLifecycleEvent_Payload()
      return r
    }
    val r = to(s, fVehicle_Controller_Mode_CoordinatorLifecycleEvent_Payload _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorInputStatus_Payload(o: Vehicle_Controller_Mode_Coordinator.InputStatus_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Mode_CoordinatorInputStatus_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Mode_CoordinatorInputStatus_Payload(s: String): Either[Vehicle_Controller_Mode_Coordinator.InputStatus_Payload, Json.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorInputStatus_Payload(parser: Parser): Vehicle_Controller_Mode_Coordinator.InputStatus_Payload = {
      val r = parser.parseVehicle_Controller_Mode_CoordinatorInputStatus_Payload()
      return r
    }
    val r = to(s, fVehicle_Controller_Mode_CoordinatorInputStatus_Payload _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorLifecycleAssessment_Payload(o: Vehicle_Controller_Mode_Coordinator.LifecycleAssessment_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Mode_CoordinatorLifecycleAssessment_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Mode_CoordinatorLifecycleAssessment_Payload(s: String): Either[Vehicle_Controller_Mode_Coordinator.LifecycleAssessment_Payload, Json.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorLifecycleAssessment_Payload(parser: Parser): Vehicle_Controller_Mode_Coordinator.LifecycleAssessment_Payload = {
      val r = parser.parseVehicle_Controller_Mode_CoordinatorLifecycleAssessment_Payload()
      return r
    }
    val r = to(s, fVehicle_Controller_Mode_CoordinatorLifecycleAssessment_Payload _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorConditionEvent_Payload(o: Vehicle_Controller_Mode_Coordinator.ConditionEvent_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Mode_CoordinatorConditionEvent_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Mode_CoordinatorConditionEvent_Payload(s: String): Either[Vehicle_Controller_Mode_Coordinator.ConditionEvent_Payload, Json.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorConditionEvent_Payload(parser: Parser): Vehicle_Controller_Mode_Coordinator.ConditionEvent_Payload = {
      val r = parser.parseVehicle_Controller_Mode_CoordinatorConditionEvent_Payload()
      return r
    }
    val r = to(s, fVehicle_Controller_Mode_CoordinatorConditionEvent_Payload _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorConditionAssessment_Payload(o: Vehicle_Controller_Mode_Coordinator.ConditionAssessment_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Mode_CoordinatorConditionAssessment_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Mode_CoordinatorConditionAssessment_Payload(s: String): Either[Vehicle_Controller_Mode_Coordinator.ConditionAssessment_Payload, Json.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorConditionAssessment_Payload(parser: Parser): Vehicle_Controller_Mode_Coordinator.ConditionAssessment_Payload = {
      val r = parser.parseVehicle_Controller_Mode_CoordinatorConditionAssessment_Payload()
      return r
    }
    val r = to(s, fVehicle_Controller_Mode_CoordinatorConditionAssessment_Payload _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorCoordinationClass_Payload(o: Vehicle_Controller_Mode_Coordinator.CoordinationClass_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Mode_CoordinatorCoordinationClass_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Mode_CoordinatorCoordinationClass_Payload(s: String): Either[Vehicle_Controller_Mode_Coordinator.CoordinationClass_Payload, Json.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorCoordinationClass_Payload(parser: Parser): Vehicle_Controller_Mode_Coordinator.CoordinationClass_Payload = {
      val r = parser.parseVehicle_Controller_Mode_CoordinatorCoordinationClass_Payload()
      return r
    }
    val r = to(s, fVehicle_Controller_Mode_CoordinatorCoordinationClass_Payload _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorControllerModeDisposition_Payload(o: Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Mode_CoordinatorControllerModeDisposition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Mode_CoordinatorControllerModeDisposition_Payload(s: String): Either[Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition_Payload, Json.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorControllerModeDisposition_Payload(parser: Parser): Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition_Payload = {
      val r = parser.parseVehicle_Controller_Mode_CoordinatorControllerModeDisposition_Payload()
      return r
    }
    val r = to(s, fVehicle_Controller_Mode_CoordinatorControllerModeDisposition_Payload _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorDecisionReason_Payload(o: Vehicle_Controller_Mode_Coordinator.DecisionReason_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Mode_CoordinatorDecisionReason_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Mode_CoordinatorDecisionReason_Payload(s: String): Either[Vehicle_Controller_Mode_Coordinator.DecisionReason_Payload, Json.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorDecisionReason_Payload(parser: Parser): Vehicle_Controller_Mode_Coordinator.DecisionReason_Payload = {
      val r = parser.parseVehicle_Controller_Mode_CoordinatorDecisionReason_Payload()
      return r
    }
    val r = to(s, fVehicle_Controller_Mode_CoordinatorDecisionReason_Payload _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorCoordinationResult_Payload(o: Vehicle_Controller_Mode_Coordinator.CoordinationResult_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Mode_CoordinatorCoordinationResult_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Mode_CoordinatorCoordinationResult_Payload(s: String): Either[Vehicle_Controller_Mode_Coordinator.CoordinationResult_Payload, Json.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorCoordinationResult_Payload(parser: Parser): Vehicle_Controller_Mode_Coordinator.CoordinationResult_Payload = {
      val r = parser.parseVehicle_Controller_Mode_CoordinatorCoordinationResult_Payload()
      return r
    }
    val r = to(s, fVehicle_Controller_Mode_CoordinatorCoordinationResult_Payload _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorLifecycleSample(o: Vehicle_Controller_Mode_Coordinator.LifecycleSample, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Mode_CoordinatorLifecycleSample(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Mode_CoordinatorLifecycleSample(s: String): Either[Vehicle_Controller_Mode_Coordinator.LifecycleSample, Json.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorLifecycleSample(parser: Parser): Vehicle_Controller_Mode_Coordinator.LifecycleSample = {
      val r = parser.parseVehicle_Controller_Mode_CoordinatorLifecycleSample()
      return r
    }
    val r = to(s, fVehicle_Controller_Mode_CoordinatorLifecycleSample _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorLifecycleSample_Payload(o: Vehicle_Controller_Mode_Coordinator.LifecycleSample_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Mode_CoordinatorLifecycleSample_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Mode_CoordinatorLifecycleSample_Payload(s: String): Either[Vehicle_Controller_Mode_Coordinator.LifecycleSample_Payload, Json.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorLifecycleSample_Payload(parser: Parser): Vehicle_Controller_Mode_Coordinator.LifecycleSample_Payload = {
      val r = parser.parseVehicle_Controller_Mode_CoordinatorLifecycleSample_Payload()
      return r
    }
    val r = to(s, fVehicle_Controller_Mode_CoordinatorLifecycleSample_Payload _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorConditionSample(o: Vehicle_Controller_Mode_Coordinator.ConditionSample, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Mode_CoordinatorConditionSample(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Mode_CoordinatorConditionSample(s: String): Either[Vehicle_Controller_Mode_Coordinator.ConditionSample, Json.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorConditionSample(parser: Parser): Vehicle_Controller_Mode_Coordinator.ConditionSample = {
      val r = parser.parseVehicle_Controller_Mode_CoordinatorConditionSample()
      return r
    }
    val r = to(s, fVehicle_Controller_Mode_CoordinatorConditionSample _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorConditionSample_Payload(o: Vehicle_Controller_Mode_Coordinator.ConditionSample_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Mode_CoordinatorConditionSample_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Mode_CoordinatorConditionSample_Payload(s: String): Either[Vehicle_Controller_Mode_Coordinator.ConditionSample_Payload, Json.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorConditionSample_Payload(parser: Parser): Vehicle_Controller_Mode_Coordinator.ConditionSample_Payload = {
      val r = parser.parseVehicle_Controller_Mode_CoordinatorConditionSample_Payload()
      return r
    }
    val r = to(s, fVehicle_Controller_Mode_CoordinatorConditionSample_Payload _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorModeDecision(o: Vehicle_Controller_Mode_Coordinator.ModeDecision, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Mode_CoordinatorModeDecision(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Mode_CoordinatorModeDecision(s: String): Either[Vehicle_Controller_Mode_Coordinator.ModeDecision, Json.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorModeDecision(parser: Parser): Vehicle_Controller_Mode_Coordinator.ModeDecision = {
      val r = parser.parseVehicle_Controller_Mode_CoordinatorModeDecision()
      return r
    }
    val r = to(s, fVehicle_Controller_Mode_CoordinatorModeDecision _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorModeDecision_Payload(o: Vehicle_Controller_Mode_Coordinator.ModeDecision_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Mode_CoordinatorModeDecision_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Mode_CoordinatorModeDecision_Payload(s: String): Either[Vehicle_Controller_Mode_Coordinator.ModeDecision_Payload, Json.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorModeDecision_Payload(parser: Parser): Vehicle_Controller_Mode_Coordinator.ModeDecision_Payload = {
      val r = parser.parseVehicle_Controller_Mode_CoordinatorModeDecision_Payload()
      return r
    }
    val r = to(s, fVehicle_Controller_Mode_CoordinatorModeDecision_Payload _)
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

  def fromVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container(o: Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container(s: String): Either[Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container, Json.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container(parser: Parser): Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container = {
      val r = parser.parseVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container()
      return r
    }
    val r = to(s, fVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_P(o: Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_P(s: String): Either[Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_P(parser: Parser): Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_P = {
      val r = parser.parseVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PS(o: Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PS(s: String): Either[Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PS(parser: Parser): Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PS = {
      val r = parser.parseVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container(o: Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container(s: String): Either[Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container, Json.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container(parser: Parser): Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container = {
      val r = parser.parseVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container()
      return r
    }
    val r = to(s, fVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_P(o: Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_P(s: String): Either[Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_P(parser: Parser): Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_P = {
      val r = parser.parseVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PS(o: Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PS(s: String): Either[Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PS(parser: Parser): Vehicle_Controller_Mode_Coordinator.LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PS = {
      val r = parser.parseVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Controller_Mode_CoordinatorLifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification_PostState_Container_PS _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container(o: Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container(s: String): Either[Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container, Json.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container(parser: Parser): Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container = {
      val r = parser.parseVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container()
      return r
    }
    val r = to(s, fVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_P(o: Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_P(s: String): Either[Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_P(parser: Parser): Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_P = {
      val r = parser.parseVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PS(o: Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PS(s: String): Either[Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PS(parser: Parser): Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PS = {
      val r = parser.parseVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container(o: Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container(s: String): Either[Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container, Json.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container(parser: Parser): Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container = {
      val r = parser.parseVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container()
      return r
    }
    val r = to(s, fVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_P(o: Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_P(s: String): Either[Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_P(parser: Parser): Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_P = {
      val r = parser.parseVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PS(o: Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PS(s: String): Either[Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PS(parser: Parser): Vehicle_Controller_Mode_Coordinator.ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PS = {
      val r = parser.parseVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Controller_Mode_CoordinatorConditionIndicationQualification_mode_coordination_process_condition_indication_qualification_PostState_Container_PS _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container(o: Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container(s: String): Either[Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container, Json.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container(parser: Parser): Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container = {
      val r = parser.parseVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container()
      return r
    }
    val r = to(s, fVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_P(o: Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_P(s: String): Either[Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_P(parser: Parser): Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_P = {
      val r = parser.parseVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PS(o: Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PS(s: String): Either[Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PS(parser: Parser): Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PS = {
      val r = parser.parseVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container(o: Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container(s: String): Either[Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container, Json.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container(parser: Parser): Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container = {
      val r = parser.parseVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container()
      return r
    }
    val r = to(s, fVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_P(o: Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_P(s: String): Either[Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_P(parser: Parser): Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_P = {
      val r = parser.parseVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PS(o: Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PS(s: String): Either[Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PS(parser: Parser): Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PS = {
      val r = parser.parseVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Controller_Mode_CoordinatorCrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_PostState_Container_PS _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container(o: Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container(s: String): Either[Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container, Json.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container(parser: Parser): Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container = {
      val r = parser.parseVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container()
      return r
    }
    val r = to(s, fVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_P(o: Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_P(s: String): Either[Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_P(parser: Parser): Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_P = {
      val r = parser.parseVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PS(o: Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PS(s: String): Either[Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PS(parser: Parser): Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PS = {
      val r = parser.parseVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container(o: Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container(s: String): Either[Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container, Json.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container(parser: Parser): Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container = {
      val r = parser.parseVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container()
      return r
    }
    val r = to(s, fVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_P(o: Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_P(s: String): Either[Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_P(parser: Parser): Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_P = {
      val r = parser.parseVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PS(o: Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PS(s: String): Either[Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PS(parser: Parser): Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PS = {
      val r = parser.parseVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Controller_Mode_CoordinatorControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_PostState_Container_PS _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container(o: Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container(s: String): Either[Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container, Json.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container(parser: Parser): Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container = {
      val r = parser.parseVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container()
      return r
    }
    val r = to(s, fVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_P(o: Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_P(s: String): Either[Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_P(parser: Parser): Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_P = {
      val r = parser.parseVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PS(o: Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PS(s: String): Either[Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PS(parser: Parser): Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PS = {
      val r = parser.parseVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container(o: Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container(s: String): Either[Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container, Json.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container(parser: Parser): Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container = {
      val r = parser.parseVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container()
      return r
    }
    val r = to(s, fVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_P(o: Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_P(s: String): Either[Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_P(parser: Parser): Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_P = {
      val r = parser.parseVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PS(o: Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PS(s: String): Either[Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PS(parser: Parser): Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PS = {
      val r = parser.parseVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Controller_Mode_CoordinatorCoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_PostState_Container_PS _)
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