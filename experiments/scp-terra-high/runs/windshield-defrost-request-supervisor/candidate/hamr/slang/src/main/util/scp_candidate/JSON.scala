// #Sireum
// @formatter:off

// This file is auto-generated from DefrostSelection.scala, RequestValidity.scala, RequestIntent.scala, GlazingCondition.scala, GlazingValidity.scala, VisibilityAssessment.scala, ElectricalInterfaceStatus.scala, DefrostLoadAllowance.scala, DefrostEligibility.scala, DefrostEnableCommand.scala, PolicyDisposition.scala, DriverDefrostStatus.scala, RequestMemory.scala, Base_Types.scala, RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_Containers.scala, GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_Containers.scala, ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_Containers.scala, DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_Containers.scala, DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package scp_candidate

import org.sireum._
import org.sireum.Json.Printer._

object JSON {

  object Printer {

    @pure def printWindshield_Defrost_Request_SupervisorDefrostSelectionType(o: Windshield_Defrost_Request_Supervisor.DefrostSelection.Type): ST = {
      val value: String = o match {
        case Windshield_Defrost_Request_Supervisor.DefrostSelection.Released => "Released"
        case Windshield_Defrost_Request_Supervisor.DefrostSelection.Active => "Active"
      }
      return printObject(ISZ(
        ("type", printString("Windshield_Defrost_Request_Supervisor.DefrostSelection")),
        ("value", printString(value))
      ))
    }

    @pure def printWindshield_Defrost_Request_SupervisorDefrostSelection_Payload(o: Windshield_Defrost_Request_Supervisor.DefrostSelection_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Windshield_Defrost_Request_Supervisor.DefrostSelection_Payload""""),
        ("value", printWindshield_Defrost_Request_SupervisorDefrostSelectionType(o.value))
      ))
    }

    @pure def printWindshield_Defrost_Request_SupervisorRequestValidityType(o: Windshield_Defrost_Request_Supervisor.RequestValidity.Type): ST = {
      val value: String = o match {
        case Windshield_Defrost_Request_Supervisor.RequestValidity.Valid => "Valid"
        case Windshield_Defrost_Request_Supervisor.RequestValidity.Invalid => "Invalid"
      }
      return printObject(ISZ(
        ("type", printString("Windshield_Defrost_Request_Supervisor.RequestValidity")),
        ("value", printString(value))
      ))
    }

    @pure def printWindshield_Defrost_Request_SupervisorRequestValidity_Payload(o: Windshield_Defrost_Request_Supervisor.RequestValidity_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Windshield_Defrost_Request_Supervisor.RequestValidity_Payload""""),
        ("value", printWindshield_Defrost_Request_SupervisorRequestValidityType(o.value))
      ))
    }

    @pure def printWindshield_Defrost_Request_SupervisorRequestIntentType(o: Windshield_Defrost_Request_Supervisor.RequestIntent.Type): ST = {
      val value: String = o match {
        case Windshield_Defrost_Request_Supervisor.RequestIntent.Fresh => "Fresh"
        case Windshield_Defrost_Request_Supervisor.RequestIntent.Held => "Held"
        case Windshield_Defrost_Request_Supervisor.RequestIntent.None => "None"
        case Windshield_Defrost_Request_Supervisor.RequestIntent.BlockedInvalid => "BlockedInvalid"
        case Windshield_Defrost_Request_Supervisor.RequestIntent.BlockedRearm => "BlockedRearm"
      }
      return printObject(ISZ(
        ("type", printString("Windshield_Defrost_Request_Supervisor.RequestIntent")),
        ("value", printString(value))
      ))
    }

    @pure def printWindshield_Defrost_Request_SupervisorRequestIntent_Payload(o: Windshield_Defrost_Request_Supervisor.RequestIntent_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Windshield_Defrost_Request_Supervisor.RequestIntent_Payload""""),
        ("value", printWindshield_Defrost_Request_SupervisorRequestIntentType(o.value))
      ))
    }

    @pure def printWindshield_Defrost_Request_SupervisorGlazingConditionType(o: Windshield_Defrost_Request_Supervisor.GlazingCondition.Type): ST = {
      val value: String = o match {
        case Windshield_Defrost_Request_Supervisor.GlazingCondition.Clear => "Clear"
        case Windshield_Defrost_Request_Supervisor.GlazingCondition.Obscured => "Obscured"
      }
      return printObject(ISZ(
        ("type", printString("Windshield_Defrost_Request_Supervisor.GlazingCondition")),
        ("value", printString(value))
      ))
    }

    @pure def printWindshield_Defrost_Request_SupervisorGlazingCondition_Payload(o: Windshield_Defrost_Request_Supervisor.GlazingCondition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Windshield_Defrost_Request_Supervisor.GlazingCondition_Payload""""),
        ("value", printWindshield_Defrost_Request_SupervisorGlazingConditionType(o.value))
      ))
    }

    @pure def printWindshield_Defrost_Request_SupervisorGlazingValidityType(o: Windshield_Defrost_Request_Supervisor.GlazingValidity.Type): ST = {
      val value: String = o match {
        case Windshield_Defrost_Request_Supervisor.GlazingValidity.Valid => "Valid"
        case Windshield_Defrost_Request_Supervisor.GlazingValidity.Invalid => "Invalid"
      }
      return printObject(ISZ(
        ("type", printString("Windshield_Defrost_Request_Supervisor.GlazingValidity")),
        ("value", printString(value))
      ))
    }

    @pure def printWindshield_Defrost_Request_SupervisorGlazingValidity_Payload(o: Windshield_Defrost_Request_Supervisor.GlazingValidity_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Windshield_Defrost_Request_Supervisor.GlazingValidity_Payload""""),
        ("value", printWindshield_Defrost_Request_SupervisorGlazingValidityType(o.value))
      ))
    }

    @pure def printWindshield_Defrost_Request_SupervisorVisibilityAssessmentType(o: Windshield_Defrost_Request_Supervisor.VisibilityAssessment.Type): ST = {
      val value: String = o match {
        case Windshield_Defrost_Request_Supervisor.VisibilityAssessment.Clear => "Clear"
        case Windshield_Defrost_Request_Supervisor.VisibilityAssessment.NeedsDefrost => "NeedsDefrost"
        case Windshield_Defrost_Request_Supervisor.VisibilityAssessment.Unknown => "Unknown"
      }
      return printObject(ISZ(
        ("type", printString("Windshield_Defrost_Request_Supervisor.VisibilityAssessment")),
        ("value", printString(value))
      ))
    }

    @pure def printWindshield_Defrost_Request_SupervisorVisibilityAssessment_Payload(o: Windshield_Defrost_Request_Supervisor.VisibilityAssessment_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Windshield_Defrost_Request_Supervisor.VisibilityAssessment_Payload""""),
        ("value", printWindshield_Defrost_Request_SupervisorVisibilityAssessmentType(o.value))
      ))
    }

    @pure def printWindshield_Defrost_Request_SupervisorElectricalInterfaceStatusType(o: Windshield_Defrost_Request_Supervisor.ElectricalInterfaceStatus.Type): ST = {
      val value: String = o match {
        case Windshield_Defrost_Request_Supervisor.ElectricalInterfaceStatus.Available => "Available"
        case Windshield_Defrost_Request_Supervisor.ElectricalInterfaceStatus.Unavailable => "Unavailable"
      }
      return printObject(ISZ(
        ("type", printString("Windshield_Defrost_Request_Supervisor.ElectricalInterfaceStatus")),
        ("value", printString(value))
      ))
    }

    @pure def printWindshield_Defrost_Request_SupervisorElectricalInterfaceStatus_Payload(o: Windshield_Defrost_Request_Supervisor.ElectricalInterfaceStatus_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Windshield_Defrost_Request_Supervisor.ElectricalInterfaceStatus_Payload""""),
        ("value", printWindshield_Defrost_Request_SupervisorElectricalInterfaceStatusType(o.value))
      ))
    }

    @pure def printWindshield_Defrost_Request_SupervisorDefrostLoadAllowanceType(o: Windshield_Defrost_Request_Supervisor.DefrostLoadAllowance.Type): ST = {
      val value: String = o match {
        case Windshield_Defrost_Request_Supervisor.DefrostLoadAllowance.Permitted => "Permitted"
        case Windshield_Defrost_Request_Supervisor.DefrostLoadAllowance.Restricted => "Restricted"
      }
      return printObject(ISZ(
        ("type", printString("Windshield_Defrost_Request_Supervisor.DefrostLoadAllowance")),
        ("value", printString(value))
      ))
    }

    @pure def printWindshield_Defrost_Request_SupervisorDefrostLoadAllowance_Payload(o: Windshield_Defrost_Request_Supervisor.DefrostLoadAllowance_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Windshield_Defrost_Request_Supervisor.DefrostLoadAllowance_Payload""""),
        ("value", printWindshield_Defrost_Request_SupervisorDefrostLoadAllowanceType(o.value))
      ))
    }

    @pure def printWindshield_Defrost_Request_SupervisorDefrostEligibilityType(o: Windshield_Defrost_Request_Supervisor.DefrostEligibility.Type): ST = {
      val value: String = o match {
        case Windshield_Defrost_Request_Supervisor.DefrostEligibility.Eligible => "Eligible"
        case Windshield_Defrost_Request_Supervisor.DefrostEligibility.BlockedUnavailable => "BlockedUnavailable"
        case Windshield_Defrost_Request_Supervisor.DefrostEligibility.BlockedRestricted => "BlockedRestricted"
      }
      return printObject(ISZ(
        ("type", printString("Windshield_Defrost_Request_Supervisor.DefrostEligibility")),
        ("value", printString(value))
      ))
    }

    @pure def printWindshield_Defrost_Request_SupervisorDefrostEligibility_Payload(o: Windshield_Defrost_Request_Supervisor.DefrostEligibility_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Windshield_Defrost_Request_Supervisor.DefrostEligibility_Payload""""),
        ("value", printWindshield_Defrost_Request_SupervisorDefrostEligibilityType(o.value))
      ))
    }

    @pure def printWindshield_Defrost_Request_SupervisorDefrostEnableCommandType(o: Windshield_Defrost_Request_Supervisor.DefrostEnableCommand.Type): ST = {
      val value: String = o match {
        case Windshield_Defrost_Request_Supervisor.DefrostEnableCommand.Off => "Off"
        case Windshield_Defrost_Request_Supervisor.DefrostEnableCommand.On => "On"
      }
      return printObject(ISZ(
        ("type", printString("Windshield_Defrost_Request_Supervisor.DefrostEnableCommand")),
        ("value", printString(value))
      ))
    }

    @pure def printWindshield_Defrost_Request_SupervisorDefrostEnableCommand_Payload(o: Windshield_Defrost_Request_Supervisor.DefrostEnableCommand_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Windshield_Defrost_Request_Supervisor.DefrostEnableCommand_Payload""""),
        ("value", printWindshield_Defrost_Request_SupervisorDefrostEnableCommandType(o.value))
      ))
    }

    @pure def printWindshield_Defrost_Request_SupervisorPolicyDispositionType(o: Windshield_Defrost_Request_Supervisor.PolicyDisposition.Type): ST = {
      val value: String = o match {
        case Windshield_Defrost_Request_Supervisor.PolicyDisposition.Inactive => "Inactive"
        case Windshield_Defrost_Request_Supervisor.PolicyDisposition.Defrosting => "Defrosting"
        case Windshield_Defrost_Request_Supervisor.PolicyDisposition.Complete => "Complete"
        case Windshield_Defrost_Request_Supervisor.PolicyDisposition.ObservationFault => "ObservationFault"
        case Windshield_Defrost_Request_Supervisor.PolicyDisposition.ElectricalBlocked => "ElectricalBlocked"
      }
      return printObject(ISZ(
        ("type", printString("Windshield_Defrost_Request_Supervisor.PolicyDisposition")),
        ("value", printString(value))
      ))
    }

    @pure def printWindshield_Defrost_Request_SupervisorPolicyDisposition_Payload(o: Windshield_Defrost_Request_Supervisor.PolicyDisposition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Windshield_Defrost_Request_Supervisor.PolicyDisposition_Payload""""),
        ("value", printWindshield_Defrost_Request_SupervisorPolicyDispositionType(o.value))
      ))
    }

    @pure def printWindshield_Defrost_Request_SupervisorDriverDefrostStatusType(o: Windshield_Defrost_Request_Supervisor.DriverDefrostStatus.Type): ST = {
      val value: String = o match {
        case Windshield_Defrost_Request_Supervisor.DriverDefrostStatus.Idle => "Idle"
        case Windshield_Defrost_Request_Supervisor.DriverDefrostStatus.Defrosting => "Defrosting"
        case Windshield_Defrost_Request_Supervisor.DriverDefrostStatus.Complete => "Complete"
        case Windshield_Defrost_Request_Supervisor.DriverDefrostStatus.AttentionRequired => "AttentionRequired"
      }
      return printObject(ISZ(
        ("type", printString("Windshield_Defrost_Request_Supervisor.DriverDefrostStatus")),
        ("value", printString(value))
      ))
    }

    @pure def printWindshield_Defrost_Request_SupervisorDriverDefrostStatus_Payload(o: Windshield_Defrost_Request_Supervisor.DriverDefrostStatus_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Windshield_Defrost_Request_Supervisor.DriverDefrostStatus_Payload""""),
        ("value", printWindshield_Defrost_Request_SupervisorDriverDefrostStatusType(o.value))
      ))
    }

    @pure def printWindshield_Defrost_Request_SupervisorRequestMemoryType(o: Windshield_Defrost_Request_Supervisor.RequestMemory.Type): ST = {
      val value: String = o match {
        case Windshield_Defrost_Request_Supervisor.RequestMemory.Released => "Released"
        case Windshield_Defrost_Request_Supervisor.RequestMemory.AcceptedActive => "AcceptedActive"
        case Windshield_Defrost_Request_Supervisor.RequestMemory.RearmRequired => "RearmRequired"
      }
      return printObject(ISZ(
        ("type", printString("Windshield_Defrost_Request_Supervisor.RequestMemory")),
        ("value", printString(value))
      ))
    }

    @pure def printWindshield_Defrost_Request_SupervisorRequestMemory_Payload(o: Windshield_Defrost_Request_Supervisor.RequestMemory_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Windshield_Defrost_Request_Supervisor.RequestMemory_Payload""""),
        ("value", printWindshield_Defrost_Request_SupervisorRequestMemoryType(o.value))
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

    @pure def printWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container(o: Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container): ST = {
      o match {
        case o: Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_P => return printWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_P(o)
        case o: Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PS => return printWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PS(o)
      }
    }

    @pure def printWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_P(o: Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_P""""),
        ("api_defrostSelection", printWindshield_Defrost_Request_SupervisorDefrostSelectionType(o.api_defrostSelection)),
        ("api_requestValidity", printWindshield_Defrost_Request_SupervisorRequestValidityType(o.api_requestValidity))
      ))
    }

    @pure def printWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PS(o: Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PS""""),
        ("In_requestMemory", printWindshield_Defrost_Request_SupervisorRequestMemoryType(o.In_requestMemory)),
        ("api_defrostSelection", printWindshield_Defrost_Request_SupervisorDefrostSelectionType(o.api_defrostSelection)),
        ("api_requestValidity", printWindshield_Defrost_Request_SupervisorRequestValidityType(o.api_requestValidity))
      ))
    }

    @pure def printWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container(o: Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container): ST = {
      o match {
        case o: Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_P => return printWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_P(o)
        case o: Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PS => return printWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PS(o)
      }
    }

    @pure def printWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_P(o: Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_P""""),
        ("api_requestIntent", printWindshield_Defrost_Request_SupervisorRequestIntentType(o.api_requestIntent))
      ))
    }

    @pure def printWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PS(o: Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PS""""),
        ("requestMemory", printWindshield_Defrost_Request_SupervisorRequestMemoryType(o.requestMemory)),
        ("api_requestIntent", printWindshield_Defrost_Request_SupervisorRequestIntentType(o.api_requestIntent))
      ))
    }

    @pure def printWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container(o: Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container): ST = {
      o match {
        case o: Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_P => return printWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_P(o)
        case o: Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PS => return printWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PS(o)
      }
    }

    @pure def printWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_P(o: Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_P""""),
        ("api_glazingCondition", printWindshield_Defrost_Request_SupervisorGlazingConditionType(o.api_glazingCondition)),
        ("api_glazingValidity", printWindshield_Defrost_Request_SupervisorGlazingValidityType(o.api_glazingValidity))
      ))
    }

    @pure def printWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PS(o: Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PS""""),
        ("api_glazingCondition", printWindshield_Defrost_Request_SupervisorGlazingConditionType(o.api_glazingCondition)),
        ("api_glazingValidity", printWindshield_Defrost_Request_SupervisorGlazingValidityType(o.api_glazingValidity))
      ))
    }

    @pure def printWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container(o: Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container): ST = {
      o match {
        case o: Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_P => return printWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_P(o)
        case o: Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PS => return printWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PS(o)
      }
    }

    @pure def printWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_P(o: Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_P""""),
        ("api_visibilityAssessment", printWindshield_Defrost_Request_SupervisorVisibilityAssessmentType(o.api_visibilityAssessment))
      ))
    }

    @pure def printWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PS(o: Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PS""""),
        ("api_visibilityAssessment", printWindshield_Defrost_Request_SupervisorVisibilityAssessmentType(o.api_visibilityAssessment))
      ))
    }

    @pure def printWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container(o: Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container): ST = {
      o match {
        case o: Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_P => return printWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_P(o)
        case o: Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PS => return printWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PS(o)
      }
    }

    @pure def printWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_P(o: Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_P""""),
        ("api_defrostLoadAllowance", printWindshield_Defrost_Request_SupervisorDefrostLoadAllowanceType(o.api_defrostLoadAllowance)),
        ("api_electricalInterfaceStatus", printWindshield_Defrost_Request_SupervisorElectricalInterfaceStatusType(o.api_electricalInterfaceStatus))
      ))
    }

    @pure def printWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PS(o: Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PS""""),
        ("api_defrostLoadAllowance", printWindshield_Defrost_Request_SupervisorDefrostLoadAllowanceType(o.api_defrostLoadAllowance)),
        ("api_electricalInterfaceStatus", printWindshield_Defrost_Request_SupervisorElectricalInterfaceStatusType(o.api_electricalInterfaceStatus))
      ))
    }

    @pure def printWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container(o: Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container): ST = {
      o match {
        case o: Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_P => return printWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_P(o)
        case o: Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PS => return printWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PS(o)
      }
    }

    @pure def printWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_P(o: Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_P""""),
        ("api_defrostEligibility", printWindshield_Defrost_Request_SupervisorDefrostEligibilityType(o.api_defrostEligibility))
      ))
    }

    @pure def printWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PS(o: Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PS""""),
        ("api_defrostEligibility", printWindshield_Defrost_Request_SupervisorDefrostEligibilityType(o.api_defrostEligibility))
      ))
    }

    @pure def printWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container(o: Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container): ST = {
      o match {
        case o: Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_P => return printWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_P(o)
        case o: Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PS => return printWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PS(o)
      }
    }

    @pure def printWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_P(o: Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_P""""),
        ("api_defrostEligibility", printWindshield_Defrost_Request_SupervisorDefrostEligibilityType(o.api_defrostEligibility)),
        ("api_requestIntent", printWindshield_Defrost_Request_SupervisorRequestIntentType(o.api_requestIntent)),
        ("api_visibilityAssessment", printWindshield_Defrost_Request_SupervisorVisibilityAssessmentType(o.api_visibilityAssessment))
      ))
    }

    @pure def printWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PS(o: Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PS""""),
        ("api_defrostEligibility", printWindshield_Defrost_Request_SupervisorDefrostEligibilityType(o.api_defrostEligibility)),
        ("api_requestIntent", printWindshield_Defrost_Request_SupervisorRequestIntentType(o.api_requestIntent)),
        ("api_visibilityAssessment", printWindshield_Defrost_Request_SupervisorVisibilityAssessmentType(o.api_visibilityAssessment))
      ))
    }

    @pure def printWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container(o: Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container): ST = {
      o match {
        case o: Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_P => return printWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_P(o)
        case o: Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PS => return printWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PS(o)
      }
    }

    @pure def printWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_P(o: Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_P""""),
        ("api_defrostEnableCommand", printWindshield_Defrost_Request_SupervisorDefrostEnableCommandType(o.api_defrostEnableCommand)),
        ("api_policyDisposition", printWindshield_Defrost_Request_SupervisorPolicyDispositionType(o.api_policyDisposition))
      ))
    }

    @pure def printWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PS(o: Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PS""""),
        ("api_defrostEnableCommand", printWindshield_Defrost_Request_SupervisorDefrostEnableCommandType(o.api_defrostEnableCommand)),
        ("api_policyDisposition", printWindshield_Defrost_Request_SupervisorPolicyDispositionType(o.api_policyDisposition))
      ))
    }

    @pure def printWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container(o: Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container): ST = {
      o match {
        case o: Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_P => return printWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_P(o)
        case o: Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PS => return printWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PS(o)
      }
    }

    @pure def printWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_P(o: Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_P""""),
        ("api_policyDisposition", printWindshield_Defrost_Request_SupervisorPolicyDispositionType(o.api_policyDisposition)),
        ("api_requestIntent", printWindshield_Defrost_Request_SupervisorRequestIntentType(o.api_requestIntent))
      ))
    }

    @pure def printWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PS(o: Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PS""""),
        ("api_policyDisposition", printWindshield_Defrost_Request_SupervisorPolicyDispositionType(o.api_policyDisposition)),
        ("api_requestIntent", printWindshield_Defrost_Request_SupervisorRequestIntentType(o.api_requestIntent))
      ))
    }

    @pure def printWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container(o: Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container): ST = {
      o match {
        case o: Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_P => return printWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_P(o)
        case o: Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PS => return printWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PS(o)
      }
    }

    @pure def printWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_P(o: Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_P""""),
        ("api_driverDefrostStatus", printWindshield_Defrost_Request_SupervisorDriverDefrostStatusType(o.api_driverDefrostStatus))
      ))
    }

    @pure def printWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PS(o: Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PS""""),
        ("api_driverDefrostStatus", printWindshield_Defrost_Request_SupervisorDriverDefrostStatusType(o.api_driverDefrostStatus))
      ))
    }

    @pure def printruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): ST = {
      val value: String = o match {
        case runtimemonitor.ObservationKind.WindshieldDefrostRequestSupervisor_Instance_defrostSupervisionProcess_requestIntentTracker_postInit => "WindshieldDefrostRequestSupervisor_Instance_defrostSupervisionProcess_requestIntentTracker_postInit"
        case runtimemonitor.ObservationKind.WindshieldDefrostRequestSupervisor_Instance_defrostSupervisionProcess_requestIntentTracker_preCompute => "WindshieldDefrostRequestSupervisor_Instance_defrostSupervisionProcess_requestIntentTracker_preCompute"
        case runtimemonitor.ObservationKind.WindshieldDefrostRequestSupervisor_Instance_defrostSupervisionProcess_requestIntentTracker_postCompute => "WindshieldDefrostRequestSupervisor_Instance_defrostSupervisionProcess_requestIntentTracker_postCompute"
        case runtimemonitor.ObservationKind.WindshieldDefrostRequestSupervisor_Instance_defrostSupervisionProcess_glazingConditionAssessor_postInit => "WindshieldDefrostRequestSupervisor_Instance_defrostSupervisionProcess_glazingConditionAssessor_postInit"
        case runtimemonitor.ObservationKind.WindshieldDefrostRequestSupervisor_Instance_defrostSupervisionProcess_glazingConditionAssessor_preCompute => "WindshieldDefrostRequestSupervisor_Instance_defrostSupervisionProcess_glazingConditionAssessor_preCompute"
        case runtimemonitor.ObservationKind.WindshieldDefrostRequestSupervisor_Instance_defrostSupervisionProcess_glazingConditionAssessor_postCompute => "WindshieldDefrostRequestSupervisor_Instance_defrostSupervisionProcess_glazingConditionAssessor_postCompute"
        case runtimemonitor.ObservationKind.WindshieldDefrostRequestSupervisor_Instance_defrostSupervisionProcess_electricalEligibilityAssessor_postInit => "WindshieldDefrostRequestSupervisor_Instance_defrostSupervisionProcess_electricalEligibilityAssessor_postInit"
        case runtimemonitor.ObservationKind.WindshieldDefrostRequestSupervisor_Instance_defrostSupervisionProcess_electricalEligibilityAssessor_preCompute => "WindshieldDefrostRequestSupervisor_Instance_defrostSupervisionProcess_electricalEligibilityAssessor_preCompute"
        case runtimemonitor.ObservationKind.WindshieldDefrostRequestSupervisor_Instance_defrostSupervisionProcess_electricalEligibilityAssessor_postCompute => "WindshieldDefrostRequestSupervisor_Instance_defrostSupervisionProcess_electricalEligibilityAssessor_postCompute"
        case runtimemonitor.ObservationKind.WindshieldDefrostRequestSupervisor_Instance_defrostSupervisionProcess_defrostPolicySupervisor_postInit => "WindshieldDefrostRequestSupervisor_Instance_defrostSupervisionProcess_defrostPolicySupervisor_postInit"
        case runtimemonitor.ObservationKind.WindshieldDefrostRequestSupervisor_Instance_defrostSupervisionProcess_defrostPolicySupervisor_preCompute => "WindshieldDefrostRequestSupervisor_Instance_defrostSupervisionProcess_defrostPolicySupervisor_preCompute"
        case runtimemonitor.ObservationKind.WindshieldDefrostRequestSupervisor_Instance_defrostSupervisionProcess_defrostPolicySupervisor_postCompute => "WindshieldDefrostRequestSupervisor_Instance_defrostSupervisionProcess_defrostPolicySupervisor_postCompute"
        case runtimemonitor.ObservationKind.WindshieldDefrostRequestSupervisor_Instance_defrostSupervisionProcess_driverFeedbackReporter_postInit => "WindshieldDefrostRequestSupervisor_Instance_defrostSupervisionProcess_driverFeedbackReporter_postInit"
        case runtimemonitor.ObservationKind.WindshieldDefrostRequestSupervisor_Instance_defrostSupervisionProcess_driverFeedbackReporter_preCompute => "WindshieldDefrostRequestSupervisor_Instance_defrostSupervisionProcess_driverFeedbackReporter_preCompute"
        case runtimemonitor.ObservationKind.WindshieldDefrostRequestSupervisor_Instance_defrostSupervisionProcess_driverFeedbackReporter_postCompute => "WindshieldDefrostRequestSupervisor_Instance_defrostSupervisionProcess_driverFeedbackReporter_postCompute"
      }
      return printObject(ISZ(
        ("type", printString("runtimemonitor.ObservationKind")),
        ("value", printString(value))
      ))
    }

    @pure def printutilContainer(o: util.Container): ST = {
      o match {
        case o: util.EmptyContainer => return printutilEmptyContainer(o)
        case o: Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_P => return printWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_P(o)
        case o: Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PS => return printWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PS(o)
        case o: Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_P => return printWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_P(o)
        case o: Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PS => return printWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PS(o)
        case o: Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_P => return printWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_P(o)
        case o: Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PS => return printWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PS(o)
        case o: Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_P => return printWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_P(o)
        case o: Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PS => return printWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PS(o)
        case o: Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_P => return printWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_P(o)
        case o: Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PS => return printWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PS(o)
        case o: Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_P => return printWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_P(o)
        case o: Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PS => return printWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PS(o)
        case o: Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_P => return printWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_P(o)
        case o: Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PS => return printWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PS(o)
        case o: Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_P => return printWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_P(o)
        case o: Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PS => return printWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PS(o)
        case o: Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_P => return printWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_P(o)
        case o: Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PS => return printWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PS(o)
        case o: Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_P => return printWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_P(o)
        case o: Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PS => return printWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PS(o)
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
        case o: Windshield_Defrost_Request_Supervisor.RequestMemory_Payload => return printWindshield_Defrost_Request_SupervisorRequestMemory_Payload(o)
        case o: Windshield_Defrost_Request_Supervisor.RequestIntent_Payload => return printWindshield_Defrost_Request_SupervisorRequestIntent_Payload(o)
        case o: Windshield_Defrost_Request_Supervisor.RequestValidity_Payload => return printWindshield_Defrost_Request_SupervisorRequestValidity_Payload(o)
        case o: Windshield_Defrost_Request_Supervisor.GlazingValidity_Payload => return printWindshield_Defrost_Request_SupervisorGlazingValidity_Payload(o)
        case o: Windshield_Defrost_Request_Supervisor.GlazingCondition_Payload => return printWindshield_Defrost_Request_SupervisorGlazingCondition_Payload(o)
        case o: Windshield_Defrost_Request_Supervisor.DefrostSelection_Payload => return printWindshield_Defrost_Request_SupervisorDefrostSelection_Payload(o)
        case o: Windshield_Defrost_Request_Supervisor.PolicyDisposition_Payload => return printWindshield_Defrost_Request_SupervisorPolicyDisposition_Payload(o)
        case o: Windshield_Defrost_Request_Supervisor.DefrostEligibility_Payload => return printWindshield_Defrost_Request_SupervisorDefrostEligibility_Payload(o)
        case o: Windshield_Defrost_Request_Supervisor.DriverDefrostStatus_Payload => return printWindshield_Defrost_Request_SupervisorDriverDefrostStatus_Payload(o)
        case o: Windshield_Defrost_Request_Supervisor.DefrostEnableCommand_Payload => return printWindshield_Defrost_Request_SupervisorDefrostEnableCommand_Payload(o)
        case o: Windshield_Defrost_Request_Supervisor.DefrostLoadAllowance_Payload => return printWindshield_Defrost_Request_SupervisorDefrostLoadAllowance_Payload(o)
        case o: Windshield_Defrost_Request_Supervisor.VisibilityAssessment_Payload => return printWindshield_Defrost_Request_SupervisorVisibilityAssessment_Payload(o)
        case o: Windshield_Defrost_Request_Supervisor.ElectricalInterfaceStatus_Payload => return printWindshield_Defrost_Request_SupervisorElectricalInterfaceStatus_Payload(o)
        case o: Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_P => return printWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_P(o)
        case o: Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PS => return printWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PS(o)
        case o: Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_P => return printWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_P(o)
        case o: Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PS => return printWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PS(o)
        case o: Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_P => return printWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_P(o)
        case o: Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PS => return printWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PS(o)
        case o: Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_P => return printWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_P(o)
        case o: Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PS => return printWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PS(o)
        case o: Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_P => return printWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_P(o)
        case o: Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PS => return printWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PS(o)
        case o: Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_P => return printWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_P(o)
        case o: Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PS => return printWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PS(o)
        case o: Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_P => return printWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_P(o)
        case o: Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PS => return printWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PS(o)
        case o: Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_P => return printWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_P(o)
        case o: Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PS => return printWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PS(o)
        case o: Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_P => return printWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_P(o)
        case o: Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PS => return printWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PS(o)
        case o: Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_P => return printWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_P(o)
        case o: Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PS => return printWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PS(o)
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

    def parseWindshield_Defrost_Request_SupervisorDefrostSelectionType(): Windshield_Defrost_Request_Supervisor.DefrostSelection.Type = {
      val r = parseWindshield_Defrost_Request_SupervisorDefrostSelectionT(F)
      return r
    }

    def parseWindshield_Defrost_Request_SupervisorDefrostSelectionT(typeParsed: B): Windshield_Defrost_Request_Supervisor.DefrostSelection.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Windshield_Defrost_Request_Supervisor.DefrostSelection")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Windshield_Defrost_Request_Supervisor.DefrostSelection.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Windshield_Defrost_Request_Supervisor.DefrostSelection.")
          return Windshield_Defrost_Request_Supervisor.DefrostSelection.byOrdinal(0).get
      }
    }

    def parseWindshield_Defrost_Request_SupervisorDefrostSelection_Payload(): Windshield_Defrost_Request_Supervisor.DefrostSelection_Payload = {
      val r = parseWindshield_Defrost_Request_SupervisorDefrostSelection_PayloadT(F)
      return r
    }

    def parseWindshield_Defrost_Request_SupervisorDefrostSelection_PayloadT(typeParsed: B): Windshield_Defrost_Request_Supervisor.DefrostSelection_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Windshield_Defrost_Request_Supervisor.DefrostSelection_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseWindshield_Defrost_Request_SupervisorDefrostSelectionType()
      parser.parseObjectNext()
      return Windshield_Defrost_Request_Supervisor.DefrostSelection_Payload(value)
    }

    def parseWindshield_Defrost_Request_SupervisorRequestValidityType(): Windshield_Defrost_Request_Supervisor.RequestValidity.Type = {
      val r = parseWindshield_Defrost_Request_SupervisorRequestValidityT(F)
      return r
    }

    def parseWindshield_Defrost_Request_SupervisorRequestValidityT(typeParsed: B): Windshield_Defrost_Request_Supervisor.RequestValidity.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Windshield_Defrost_Request_Supervisor.RequestValidity")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Windshield_Defrost_Request_Supervisor.RequestValidity.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Windshield_Defrost_Request_Supervisor.RequestValidity.")
          return Windshield_Defrost_Request_Supervisor.RequestValidity.byOrdinal(0).get
      }
    }

    def parseWindshield_Defrost_Request_SupervisorRequestValidity_Payload(): Windshield_Defrost_Request_Supervisor.RequestValidity_Payload = {
      val r = parseWindshield_Defrost_Request_SupervisorRequestValidity_PayloadT(F)
      return r
    }

    def parseWindshield_Defrost_Request_SupervisorRequestValidity_PayloadT(typeParsed: B): Windshield_Defrost_Request_Supervisor.RequestValidity_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Windshield_Defrost_Request_Supervisor.RequestValidity_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseWindshield_Defrost_Request_SupervisorRequestValidityType()
      parser.parseObjectNext()
      return Windshield_Defrost_Request_Supervisor.RequestValidity_Payload(value)
    }

    def parseWindshield_Defrost_Request_SupervisorRequestIntentType(): Windshield_Defrost_Request_Supervisor.RequestIntent.Type = {
      val r = parseWindshield_Defrost_Request_SupervisorRequestIntentT(F)
      return r
    }

    def parseWindshield_Defrost_Request_SupervisorRequestIntentT(typeParsed: B): Windshield_Defrost_Request_Supervisor.RequestIntent.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Windshield_Defrost_Request_Supervisor.RequestIntent")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Windshield_Defrost_Request_Supervisor.RequestIntent.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Windshield_Defrost_Request_Supervisor.RequestIntent.")
          return Windshield_Defrost_Request_Supervisor.RequestIntent.byOrdinal(0).get
      }
    }

    def parseWindshield_Defrost_Request_SupervisorRequestIntent_Payload(): Windshield_Defrost_Request_Supervisor.RequestIntent_Payload = {
      val r = parseWindshield_Defrost_Request_SupervisorRequestIntent_PayloadT(F)
      return r
    }

    def parseWindshield_Defrost_Request_SupervisorRequestIntent_PayloadT(typeParsed: B): Windshield_Defrost_Request_Supervisor.RequestIntent_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Windshield_Defrost_Request_Supervisor.RequestIntent_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseWindshield_Defrost_Request_SupervisorRequestIntentType()
      parser.parseObjectNext()
      return Windshield_Defrost_Request_Supervisor.RequestIntent_Payload(value)
    }

    def parseWindshield_Defrost_Request_SupervisorGlazingConditionType(): Windshield_Defrost_Request_Supervisor.GlazingCondition.Type = {
      val r = parseWindshield_Defrost_Request_SupervisorGlazingConditionT(F)
      return r
    }

    def parseWindshield_Defrost_Request_SupervisorGlazingConditionT(typeParsed: B): Windshield_Defrost_Request_Supervisor.GlazingCondition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Windshield_Defrost_Request_Supervisor.GlazingCondition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Windshield_Defrost_Request_Supervisor.GlazingCondition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Windshield_Defrost_Request_Supervisor.GlazingCondition.")
          return Windshield_Defrost_Request_Supervisor.GlazingCondition.byOrdinal(0).get
      }
    }

    def parseWindshield_Defrost_Request_SupervisorGlazingCondition_Payload(): Windshield_Defrost_Request_Supervisor.GlazingCondition_Payload = {
      val r = parseWindshield_Defrost_Request_SupervisorGlazingCondition_PayloadT(F)
      return r
    }

    def parseWindshield_Defrost_Request_SupervisorGlazingCondition_PayloadT(typeParsed: B): Windshield_Defrost_Request_Supervisor.GlazingCondition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Windshield_Defrost_Request_Supervisor.GlazingCondition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseWindshield_Defrost_Request_SupervisorGlazingConditionType()
      parser.parseObjectNext()
      return Windshield_Defrost_Request_Supervisor.GlazingCondition_Payload(value)
    }

    def parseWindshield_Defrost_Request_SupervisorGlazingValidityType(): Windshield_Defrost_Request_Supervisor.GlazingValidity.Type = {
      val r = parseWindshield_Defrost_Request_SupervisorGlazingValidityT(F)
      return r
    }

    def parseWindshield_Defrost_Request_SupervisorGlazingValidityT(typeParsed: B): Windshield_Defrost_Request_Supervisor.GlazingValidity.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Windshield_Defrost_Request_Supervisor.GlazingValidity")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Windshield_Defrost_Request_Supervisor.GlazingValidity.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Windshield_Defrost_Request_Supervisor.GlazingValidity.")
          return Windshield_Defrost_Request_Supervisor.GlazingValidity.byOrdinal(0).get
      }
    }

    def parseWindshield_Defrost_Request_SupervisorGlazingValidity_Payload(): Windshield_Defrost_Request_Supervisor.GlazingValidity_Payload = {
      val r = parseWindshield_Defrost_Request_SupervisorGlazingValidity_PayloadT(F)
      return r
    }

    def parseWindshield_Defrost_Request_SupervisorGlazingValidity_PayloadT(typeParsed: B): Windshield_Defrost_Request_Supervisor.GlazingValidity_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Windshield_Defrost_Request_Supervisor.GlazingValidity_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseWindshield_Defrost_Request_SupervisorGlazingValidityType()
      parser.parseObjectNext()
      return Windshield_Defrost_Request_Supervisor.GlazingValidity_Payload(value)
    }

    def parseWindshield_Defrost_Request_SupervisorVisibilityAssessmentType(): Windshield_Defrost_Request_Supervisor.VisibilityAssessment.Type = {
      val r = parseWindshield_Defrost_Request_SupervisorVisibilityAssessmentT(F)
      return r
    }

    def parseWindshield_Defrost_Request_SupervisorVisibilityAssessmentT(typeParsed: B): Windshield_Defrost_Request_Supervisor.VisibilityAssessment.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Windshield_Defrost_Request_Supervisor.VisibilityAssessment")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Windshield_Defrost_Request_Supervisor.VisibilityAssessment.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Windshield_Defrost_Request_Supervisor.VisibilityAssessment.")
          return Windshield_Defrost_Request_Supervisor.VisibilityAssessment.byOrdinal(0).get
      }
    }

    def parseWindshield_Defrost_Request_SupervisorVisibilityAssessment_Payload(): Windshield_Defrost_Request_Supervisor.VisibilityAssessment_Payload = {
      val r = parseWindshield_Defrost_Request_SupervisorVisibilityAssessment_PayloadT(F)
      return r
    }

    def parseWindshield_Defrost_Request_SupervisorVisibilityAssessment_PayloadT(typeParsed: B): Windshield_Defrost_Request_Supervisor.VisibilityAssessment_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Windshield_Defrost_Request_Supervisor.VisibilityAssessment_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseWindshield_Defrost_Request_SupervisorVisibilityAssessmentType()
      parser.parseObjectNext()
      return Windshield_Defrost_Request_Supervisor.VisibilityAssessment_Payload(value)
    }

    def parseWindshield_Defrost_Request_SupervisorElectricalInterfaceStatusType(): Windshield_Defrost_Request_Supervisor.ElectricalInterfaceStatus.Type = {
      val r = parseWindshield_Defrost_Request_SupervisorElectricalInterfaceStatusT(F)
      return r
    }

    def parseWindshield_Defrost_Request_SupervisorElectricalInterfaceStatusT(typeParsed: B): Windshield_Defrost_Request_Supervisor.ElectricalInterfaceStatus.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Windshield_Defrost_Request_Supervisor.ElectricalInterfaceStatus")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Windshield_Defrost_Request_Supervisor.ElectricalInterfaceStatus.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Windshield_Defrost_Request_Supervisor.ElectricalInterfaceStatus.")
          return Windshield_Defrost_Request_Supervisor.ElectricalInterfaceStatus.byOrdinal(0).get
      }
    }

    def parseWindshield_Defrost_Request_SupervisorElectricalInterfaceStatus_Payload(): Windshield_Defrost_Request_Supervisor.ElectricalInterfaceStatus_Payload = {
      val r = parseWindshield_Defrost_Request_SupervisorElectricalInterfaceStatus_PayloadT(F)
      return r
    }

    def parseWindshield_Defrost_Request_SupervisorElectricalInterfaceStatus_PayloadT(typeParsed: B): Windshield_Defrost_Request_Supervisor.ElectricalInterfaceStatus_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Windshield_Defrost_Request_Supervisor.ElectricalInterfaceStatus_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseWindshield_Defrost_Request_SupervisorElectricalInterfaceStatusType()
      parser.parseObjectNext()
      return Windshield_Defrost_Request_Supervisor.ElectricalInterfaceStatus_Payload(value)
    }

    def parseWindshield_Defrost_Request_SupervisorDefrostLoadAllowanceType(): Windshield_Defrost_Request_Supervisor.DefrostLoadAllowance.Type = {
      val r = parseWindshield_Defrost_Request_SupervisorDefrostLoadAllowanceT(F)
      return r
    }

    def parseWindshield_Defrost_Request_SupervisorDefrostLoadAllowanceT(typeParsed: B): Windshield_Defrost_Request_Supervisor.DefrostLoadAllowance.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Windshield_Defrost_Request_Supervisor.DefrostLoadAllowance")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Windshield_Defrost_Request_Supervisor.DefrostLoadAllowance.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Windshield_Defrost_Request_Supervisor.DefrostLoadAllowance.")
          return Windshield_Defrost_Request_Supervisor.DefrostLoadAllowance.byOrdinal(0).get
      }
    }

    def parseWindshield_Defrost_Request_SupervisorDefrostLoadAllowance_Payload(): Windshield_Defrost_Request_Supervisor.DefrostLoadAllowance_Payload = {
      val r = parseWindshield_Defrost_Request_SupervisorDefrostLoadAllowance_PayloadT(F)
      return r
    }

    def parseWindshield_Defrost_Request_SupervisorDefrostLoadAllowance_PayloadT(typeParsed: B): Windshield_Defrost_Request_Supervisor.DefrostLoadAllowance_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Windshield_Defrost_Request_Supervisor.DefrostLoadAllowance_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseWindshield_Defrost_Request_SupervisorDefrostLoadAllowanceType()
      parser.parseObjectNext()
      return Windshield_Defrost_Request_Supervisor.DefrostLoadAllowance_Payload(value)
    }

    def parseWindshield_Defrost_Request_SupervisorDefrostEligibilityType(): Windshield_Defrost_Request_Supervisor.DefrostEligibility.Type = {
      val r = parseWindshield_Defrost_Request_SupervisorDefrostEligibilityT(F)
      return r
    }

    def parseWindshield_Defrost_Request_SupervisorDefrostEligibilityT(typeParsed: B): Windshield_Defrost_Request_Supervisor.DefrostEligibility.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Windshield_Defrost_Request_Supervisor.DefrostEligibility")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Windshield_Defrost_Request_Supervisor.DefrostEligibility.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Windshield_Defrost_Request_Supervisor.DefrostEligibility.")
          return Windshield_Defrost_Request_Supervisor.DefrostEligibility.byOrdinal(0).get
      }
    }

    def parseWindshield_Defrost_Request_SupervisorDefrostEligibility_Payload(): Windshield_Defrost_Request_Supervisor.DefrostEligibility_Payload = {
      val r = parseWindshield_Defrost_Request_SupervisorDefrostEligibility_PayloadT(F)
      return r
    }

    def parseWindshield_Defrost_Request_SupervisorDefrostEligibility_PayloadT(typeParsed: B): Windshield_Defrost_Request_Supervisor.DefrostEligibility_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Windshield_Defrost_Request_Supervisor.DefrostEligibility_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseWindshield_Defrost_Request_SupervisorDefrostEligibilityType()
      parser.parseObjectNext()
      return Windshield_Defrost_Request_Supervisor.DefrostEligibility_Payload(value)
    }

    def parseWindshield_Defrost_Request_SupervisorDefrostEnableCommandType(): Windshield_Defrost_Request_Supervisor.DefrostEnableCommand.Type = {
      val r = parseWindshield_Defrost_Request_SupervisorDefrostEnableCommandT(F)
      return r
    }

    def parseWindshield_Defrost_Request_SupervisorDefrostEnableCommandT(typeParsed: B): Windshield_Defrost_Request_Supervisor.DefrostEnableCommand.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Windshield_Defrost_Request_Supervisor.DefrostEnableCommand")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Windshield_Defrost_Request_Supervisor.DefrostEnableCommand.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Windshield_Defrost_Request_Supervisor.DefrostEnableCommand.")
          return Windshield_Defrost_Request_Supervisor.DefrostEnableCommand.byOrdinal(0).get
      }
    }

    def parseWindshield_Defrost_Request_SupervisorDefrostEnableCommand_Payload(): Windshield_Defrost_Request_Supervisor.DefrostEnableCommand_Payload = {
      val r = parseWindshield_Defrost_Request_SupervisorDefrostEnableCommand_PayloadT(F)
      return r
    }

    def parseWindshield_Defrost_Request_SupervisorDefrostEnableCommand_PayloadT(typeParsed: B): Windshield_Defrost_Request_Supervisor.DefrostEnableCommand_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Windshield_Defrost_Request_Supervisor.DefrostEnableCommand_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseWindshield_Defrost_Request_SupervisorDefrostEnableCommandType()
      parser.parseObjectNext()
      return Windshield_Defrost_Request_Supervisor.DefrostEnableCommand_Payload(value)
    }

    def parseWindshield_Defrost_Request_SupervisorPolicyDispositionType(): Windshield_Defrost_Request_Supervisor.PolicyDisposition.Type = {
      val r = parseWindshield_Defrost_Request_SupervisorPolicyDispositionT(F)
      return r
    }

    def parseWindshield_Defrost_Request_SupervisorPolicyDispositionT(typeParsed: B): Windshield_Defrost_Request_Supervisor.PolicyDisposition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Windshield_Defrost_Request_Supervisor.PolicyDisposition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Windshield_Defrost_Request_Supervisor.PolicyDisposition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Windshield_Defrost_Request_Supervisor.PolicyDisposition.")
          return Windshield_Defrost_Request_Supervisor.PolicyDisposition.byOrdinal(0).get
      }
    }

    def parseWindshield_Defrost_Request_SupervisorPolicyDisposition_Payload(): Windshield_Defrost_Request_Supervisor.PolicyDisposition_Payload = {
      val r = parseWindshield_Defrost_Request_SupervisorPolicyDisposition_PayloadT(F)
      return r
    }

    def parseWindshield_Defrost_Request_SupervisorPolicyDisposition_PayloadT(typeParsed: B): Windshield_Defrost_Request_Supervisor.PolicyDisposition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Windshield_Defrost_Request_Supervisor.PolicyDisposition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseWindshield_Defrost_Request_SupervisorPolicyDispositionType()
      parser.parseObjectNext()
      return Windshield_Defrost_Request_Supervisor.PolicyDisposition_Payload(value)
    }

    def parseWindshield_Defrost_Request_SupervisorDriverDefrostStatusType(): Windshield_Defrost_Request_Supervisor.DriverDefrostStatus.Type = {
      val r = parseWindshield_Defrost_Request_SupervisorDriverDefrostStatusT(F)
      return r
    }

    def parseWindshield_Defrost_Request_SupervisorDriverDefrostStatusT(typeParsed: B): Windshield_Defrost_Request_Supervisor.DriverDefrostStatus.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Windshield_Defrost_Request_Supervisor.DriverDefrostStatus")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Windshield_Defrost_Request_Supervisor.DriverDefrostStatus.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Windshield_Defrost_Request_Supervisor.DriverDefrostStatus.")
          return Windshield_Defrost_Request_Supervisor.DriverDefrostStatus.byOrdinal(0).get
      }
    }

    def parseWindshield_Defrost_Request_SupervisorDriverDefrostStatus_Payload(): Windshield_Defrost_Request_Supervisor.DriverDefrostStatus_Payload = {
      val r = parseWindshield_Defrost_Request_SupervisorDriverDefrostStatus_PayloadT(F)
      return r
    }

    def parseWindshield_Defrost_Request_SupervisorDriverDefrostStatus_PayloadT(typeParsed: B): Windshield_Defrost_Request_Supervisor.DriverDefrostStatus_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Windshield_Defrost_Request_Supervisor.DriverDefrostStatus_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseWindshield_Defrost_Request_SupervisorDriverDefrostStatusType()
      parser.parseObjectNext()
      return Windshield_Defrost_Request_Supervisor.DriverDefrostStatus_Payload(value)
    }

    def parseWindshield_Defrost_Request_SupervisorRequestMemoryType(): Windshield_Defrost_Request_Supervisor.RequestMemory.Type = {
      val r = parseWindshield_Defrost_Request_SupervisorRequestMemoryT(F)
      return r
    }

    def parseWindshield_Defrost_Request_SupervisorRequestMemoryT(typeParsed: B): Windshield_Defrost_Request_Supervisor.RequestMemory.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Windshield_Defrost_Request_Supervisor.RequestMemory")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Windshield_Defrost_Request_Supervisor.RequestMemory.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Windshield_Defrost_Request_Supervisor.RequestMemory.")
          return Windshield_Defrost_Request_Supervisor.RequestMemory.byOrdinal(0).get
      }
    }

    def parseWindshield_Defrost_Request_SupervisorRequestMemory_Payload(): Windshield_Defrost_Request_Supervisor.RequestMemory_Payload = {
      val r = parseWindshield_Defrost_Request_SupervisorRequestMemory_PayloadT(F)
      return r
    }

    def parseWindshield_Defrost_Request_SupervisorRequestMemory_PayloadT(typeParsed: B): Windshield_Defrost_Request_Supervisor.RequestMemory_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Windshield_Defrost_Request_Supervisor.RequestMemory_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseWindshield_Defrost_Request_SupervisorRequestMemoryType()
      parser.parseObjectNext()
      return Windshield_Defrost_Request_Supervisor.RequestMemory_Payload(value)
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

    def parseWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container(): Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_P", "Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PS"))
      t.native match {
        case "Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_P" => val r = parseWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PT(T); return r
        case "Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PS" => val r = parseWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PST(T); return r
        case _ => val r = parseWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PST(T); return r
      }
    }

    def parseWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_P(): Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_P = {
      val r = parseWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PT(F)
      return r
    }

    def parseWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PT(typeParsed: B): Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_P")
      }
      parser.parseObjectKey("api_defrostSelection")
      val api_defrostSelection = parseWindshield_Defrost_Request_SupervisorDefrostSelectionType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_requestValidity")
      val api_requestValidity = parseWindshield_Defrost_Request_SupervisorRequestValidityType()
      parser.parseObjectNext()
      return Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_P(api_defrostSelection, api_requestValidity)
    }

    def parseWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PS(): Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PS = {
      val r = parseWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PST(F)
      return r
    }

    def parseWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PST(typeParsed: B): Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PS")
      }
      parser.parseObjectKey("In_requestMemory")
      val In_requestMemory = parseWindshield_Defrost_Request_SupervisorRequestMemoryType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_defrostSelection")
      val api_defrostSelection = parseWindshield_Defrost_Request_SupervisorDefrostSelectionType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_requestValidity")
      val api_requestValidity = parseWindshield_Defrost_Request_SupervisorRequestValidityType()
      parser.parseObjectNext()
      return Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PS(In_requestMemory, api_defrostSelection, api_requestValidity)
    }

    def parseWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container(): Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_P", "Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PS"))
      t.native match {
        case "Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_P" => val r = parseWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PT(T); return r
        case "Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PS" => val r = parseWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PST(T); return r
        case _ => val r = parseWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PST(T); return r
      }
    }

    def parseWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_P(): Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_P = {
      val r = parseWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PT(F)
      return r
    }

    def parseWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PT(typeParsed: B): Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_P")
      }
      parser.parseObjectKey("api_requestIntent")
      val api_requestIntent = parseWindshield_Defrost_Request_SupervisorRequestIntentType()
      parser.parseObjectNext()
      return Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_P(api_requestIntent)
    }

    def parseWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PS(): Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PS = {
      val r = parseWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PST(F)
      return r
    }

    def parseWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PST(typeParsed: B): Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PS")
      }
      parser.parseObjectKey("requestMemory")
      val requestMemory = parseWindshield_Defrost_Request_SupervisorRequestMemoryType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_requestIntent")
      val api_requestIntent = parseWindshield_Defrost_Request_SupervisorRequestIntentType()
      parser.parseObjectNext()
      return Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PS(requestMemory, api_requestIntent)
    }

    def parseWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container(): Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_P", "Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PS"))
      t.native match {
        case "Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_P" => val r = parseWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PT(T); return r
        case "Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PS" => val r = parseWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PST(T); return r
        case _ => val r = parseWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PST(T); return r
      }
    }

    def parseWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_P(): Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_P = {
      val r = parseWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PT(F)
      return r
    }

    def parseWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PT(typeParsed: B): Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_P")
      }
      parser.parseObjectKey("api_glazingCondition")
      val api_glazingCondition = parseWindshield_Defrost_Request_SupervisorGlazingConditionType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_glazingValidity")
      val api_glazingValidity = parseWindshield_Defrost_Request_SupervisorGlazingValidityType()
      parser.parseObjectNext()
      return Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_P(api_glazingCondition, api_glazingValidity)
    }

    def parseWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PS(): Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PS = {
      val r = parseWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PST(F)
      return r
    }

    def parseWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PST(typeParsed: B): Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PS")
      }
      parser.parseObjectKey("api_glazingCondition")
      val api_glazingCondition = parseWindshield_Defrost_Request_SupervisorGlazingConditionType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_glazingValidity")
      val api_glazingValidity = parseWindshield_Defrost_Request_SupervisorGlazingValidityType()
      parser.parseObjectNext()
      return Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PS(api_glazingCondition, api_glazingValidity)
    }

    def parseWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container(): Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_P", "Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PS"))
      t.native match {
        case "Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_P" => val r = parseWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PT(T); return r
        case "Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PS" => val r = parseWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PST(T); return r
        case _ => val r = parseWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PST(T); return r
      }
    }

    def parseWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_P(): Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_P = {
      val r = parseWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PT(F)
      return r
    }

    def parseWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PT(typeParsed: B): Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_P")
      }
      parser.parseObjectKey("api_visibilityAssessment")
      val api_visibilityAssessment = parseWindshield_Defrost_Request_SupervisorVisibilityAssessmentType()
      parser.parseObjectNext()
      return Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_P(api_visibilityAssessment)
    }

    def parseWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PS(): Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PS = {
      val r = parseWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PST(F)
      return r
    }

    def parseWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PST(typeParsed: B): Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PS")
      }
      parser.parseObjectKey("api_visibilityAssessment")
      val api_visibilityAssessment = parseWindshield_Defrost_Request_SupervisorVisibilityAssessmentType()
      parser.parseObjectNext()
      return Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PS(api_visibilityAssessment)
    }

    def parseWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container(): Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_P", "Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PS"))
      t.native match {
        case "Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_P" => val r = parseWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PT(T); return r
        case "Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PS" => val r = parseWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PST(T); return r
        case _ => val r = parseWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PST(T); return r
      }
    }

    def parseWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_P(): Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_P = {
      val r = parseWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PT(F)
      return r
    }

    def parseWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PT(typeParsed: B): Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_P")
      }
      parser.parseObjectKey("api_defrostLoadAllowance")
      val api_defrostLoadAllowance = parseWindshield_Defrost_Request_SupervisorDefrostLoadAllowanceType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_electricalInterfaceStatus")
      val api_electricalInterfaceStatus = parseWindshield_Defrost_Request_SupervisorElectricalInterfaceStatusType()
      parser.parseObjectNext()
      return Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_P(api_defrostLoadAllowance, api_electricalInterfaceStatus)
    }

    def parseWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PS(): Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PS = {
      val r = parseWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PST(F)
      return r
    }

    def parseWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PST(typeParsed: B): Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PS")
      }
      parser.parseObjectKey("api_defrostLoadAllowance")
      val api_defrostLoadAllowance = parseWindshield_Defrost_Request_SupervisorDefrostLoadAllowanceType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_electricalInterfaceStatus")
      val api_electricalInterfaceStatus = parseWindshield_Defrost_Request_SupervisorElectricalInterfaceStatusType()
      parser.parseObjectNext()
      return Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PS(api_defrostLoadAllowance, api_electricalInterfaceStatus)
    }

    def parseWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container(): Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_P", "Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PS"))
      t.native match {
        case "Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_P" => val r = parseWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PT(T); return r
        case "Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PS" => val r = parseWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PST(T); return r
        case _ => val r = parseWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PST(T); return r
      }
    }

    def parseWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_P(): Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_P = {
      val r = parseWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PT(F)
      return r
    }

    def parseWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PT(typeParsed: B): Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_P")
      }
      parser.parseObjectKey("api_defrostEligibility")
      val api_defrostEligibility = parseWindshield_Defrost_Request_SupervisorDefrostEligibilityType()
      parser.parseObjectNext()
      return Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_P(api_defrostEligibility)
    }

    def parseWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PS(): Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PS = {
      val r = parseWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PST(F)
      return r
    }

    def parseWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PST(typeParsed: B): Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PS")
      }
      parser.parseObjectKey("api_defrostEligibility")
      val api_defrostEligibility = parseWindshield_Defrost_Request_SupervisorDefrostEligibilityType()
      parser.parseObjectNext()
      return Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PS(api_defrostEligibility)
    }

    def parseWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container(): Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_P", "Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PS"))
      t.native match {
        case "Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_P" => val r = parseWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PT(T); return r
        case "Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PS" => val r = parseWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PST(T); return r
        case _ => val r = parseWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PST(T); return r
      }
    }

    def parseWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_P(): Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_P = {
      val r = parseWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PT(F)
      return r
    }

    def parseWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PT(typeParsed: B): Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_P")
      }
      parser.parseObjectKey("api_defrostEligibility")
      val api_defrostEligibility = parseWindshield_Defrost_Request_SupervisorDefrostEligibilityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_requestIntent")
      val api_requestIntent = parseWindshield_Defrost_Request_SupervisorRequestIntentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_visibilityAssessment")
      val api_visibilityAssessment = parseWindshield_Defrost_Request_SupervisorVisibilityAssessmentType()
      parser.parseObjectNext()
      return Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_P(api_defrostEligibility, api_requestIntent, api_visibilityAssessment)
    }

    def parseWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PS(): Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PS = {
      val r = parseWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PST(F)
      return r
    }

    def parseWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PST(typeParsed: B): Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PS")
      }
      parser.parseObjectKey("api_defrostEligibility")
      val api_defrostEligibility = parseWindshield_Defrost_Request_SupervisorDefrostEligibilityType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_requestIntent")
      val api_requestIntent = parseWindshield_Defrost_Request_SupervisorRequestIntentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_visibilityAssessment")
      val api_visibilityAssessment = parseWindshield_Defrost_Request_SupervisorVisibilityAssessmentType()
      parser.parseObjectNext()
      return Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PS(api_defrostEligibility, api_requestIntent, api_visibilityAssessment)
    }

    def parseWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container(): Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_P", "Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PS"))
      t.native match {
        case "Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_P" => val r = parseWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PT(T); return r
        case "Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PS" => val r = parseWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PST(T); return r
        case _ => val r = parseWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PST(T); return r
      }
    }

    def parseWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_P(): Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_P = {
      val r = parseWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PT(F)
      return r
    }

    def parseWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PT(typeParsed: B): Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_P")
      }
      parser.parseObjectKey("api_defrostEnableCommand")
      val api_defrostEnableCommand = parseWindshield_Defrost_Request_SupervisorDefrostEnableCommandType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_policyDisposition")
      val api_policyDisposition = parseWindshield_Defrost_Request_SupervisorPolicyDispositionType()
      parser.parseObjectNext()
      return Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_P(api_defrostEnableCommand, api_policyDisposition)
    }

    def parseWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PS(): Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PS = {
      val r = parseWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PST(F)
      return r
    }

    def parseWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PST(typeParsed: B): Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PS")
      }
      parser.parseObjectKey("api_defrostEnableCommand")
      val api_defrostEnableCommand = parseWindshield_Defrost_Request_SupervisorDefrostEnableCommandType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_policyDisposition")
      val api_policyDisposition = parseWindshield_Defrost_Request_SupervisorPolicyDispositionType()
      parser.parseObjectNext()
      return Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PS(api_defrostEnableCommand, api_policyDisposition)
    }

    def parseWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container(): Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_P", "Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PS"))
      t.native match {
        case "Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_P" => val r = parseWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PT(T); return r
        case "Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PS" => val r = parseWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PST(T); return r
        case _ => val r = parseWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PST(T); return r
      }
    }

    def parseWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_P(): Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_P = {
      val r = parseWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PT(F)
      return r
    }

    def parseWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PT(typeParsed: B): Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_P")
      }
      parser.parseObjectKey("api_policyDisposition")
      val api_policyDisposition = parseWindshield_Defrost_Request_SupervisorPolicyDispositionType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_requestIntent")
      val api_requestIntent = parseWindshield_Defrost_Request_SupervisorRequestIntentType()
      parser.parseObjectNext()
      return Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_P(api_policyDisposition, api_requestIntent)
    }

    def parseWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PS(): Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PS = {
      val r = parseWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PST(F)
      return r
    }

    def parseWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PST(typeParsed: B): Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PS")
      }
      parser.parseObjectKey("api_policyDisposition")
      val api_policyDisposition = parseWindshield_Defrost_Request_SupervisorPolicyDispositionType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_requestIntent")
      val api_requestIntent = parseWindshield_Defrost_Request_SupervisorRequestIntentType()
      parser.parseObjectNext()
      return Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PS(api_policyDisposition, api_requestIntent)
    }

    def parseWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container(): Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_P", "Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PS"))
      t.native match {
        case "Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_P" => val r = parseWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PT(T); return r
        case "Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PS" => val r = parseWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PST(T); return r
        case _ => val r = parseWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PST(T); return r
      }
    }

    def parseWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_P(): Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_P = {
      val r = parseWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PT(F)
      return r
    }

    def parseWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PT(typeParsed: B): Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_P")
      }
      parser.parseObjectKey("api_driverDefrostStatus")
      val api_driverDefrostStatus = parseWindshield_Defrost_Request_SupervisorDriverDefrostStatusType()
      parser.parseObjectNext()
      return Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_P(api_driverDefrostStatus)
    }

    def parseWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PS(): Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PS = {
      val r = parseWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PST(F)
      return r
    }

    def parseWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PST(typeParsed: B): Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PS")
      }
      parser.parseObjectKey("api_driverDefrostStatus")
      val api_driverDefrostStatus = parseWindshield_Defrost_Request_SupervisorDriverDefrostStatusType()
      parser.parseObjectNext()
      return Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PS(api_driverDefrostStatus)
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
      val t = parser.parseObjectTypes(ISZ("util.EmptyContainer", "Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_P", "Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PS", "Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_P", "Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PS", "Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_P", "Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PS", "Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_P", "Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PS", "Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_P", "Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PS", "Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_P", "Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PS", "Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_P", "Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PS", "Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_P", "Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PS", "Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_P", "Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PS", "Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_P", "Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PS"))
      t.native match {
        case "util.EmptyContainer" => val r = parseutilEmptyContainerT(T); return r
        case "Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_P" => val r = parseWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PT(T); return r
        case "Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PS" => val r = parseWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PST(T); return r
        case "Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_P" => val r = parseWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PT(T); return r
        case "Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PS" => val r = parseWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PST(T); return r
        case "Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_P" => val r = parseWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PT(T); return r
        case "Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PS" => val r = parseWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PST(T); return r
        case "Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_P" => val r = parseWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PT(T); return r
        case "Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PS" => val r = parseWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PST(T); return r
        case "Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_P" => val r = parseWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PT(T); return r
        case "Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PS" => val r = parseWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PST(T); return r
        case "Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_P" => val r = parseWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PT(T); return r
        case "Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PS" => val r = parseWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PST(T); return r
        case "Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_P" => val r = parseWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PT(T); return r
        case "Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PS" => val r = parseWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PST(T); return r
        case "Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_P" => val r = parseWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PT(T); return r
        case "Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PS" => val r = parseWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PST(T); return r
        case "Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_P" => val r = parseWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PT(T); return r
        case "Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PS" => val r = parseWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PST(T); return r
        case "Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_P" => val r = parseWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PT(T); return r
        case "Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PS" => val r = parseWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PST(T); return r
        case _ => val r = parseWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PST(T); return r
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
      val t = parser.parseObjectTypes(ISZ("art.Empty", "Base_Types.Boolean_Payload", "Base_Types.Integer_Payload", "Base_Types.Integer_8_Payload", "Base_Types.Integer_16_Payload", "Base_Types.Integer_32_Payload", "Base_Types.Integer_64_Payload", "Base_Types.Unsigned_8_Payload", "Base_Types.Unsigned_16_Payload", "Base_Types.Unsigned_32_Payload", "Base_Types.Unsigned_64_Payload", "Base_Types.Float_Payload", "Base_Types.Float_32_Payload", "Base_Types.Float_64_Payload", "Base_Types.Character_Payload", "Base_Types.String_Payload", "Base_Types.Bits_Payload", "util.EmptyContainer", "Windshield_Defrost_Request_Supervisor.RequestMemory_Payload", "Windshield_Defrost_Request_Supervisor.RequestIntent_Payload", "Windshield_Defrost_Request_Supervisor.RequestValidity_Payload", "Windshield_Defrost_Request_Supervisor.GlazingValidity_Payload", "Windshield_Defrost_Request_Supervisor.GlazingCondition_Payload", "Windshield_Defrost_Request_Supervisor.DefrostSelection_Payload", "Windshield_Defrost_Request_Supervisor.PolicyDisposition_Payload", "Windshield_Defrost_Request_Supervisor.DefrostEligibility_Payload", "Windshield_Defrost_Request_Supervisor.DriverDefrostStatus_Payload", "Windshield_Defrost_Request_Supervisor.DefrostEnableCommand_Payload", "Windshield_Defrost_Request_Supervisor.DefrostLoadAllowance_Payload", "Windshield_Defrost_Request_Supervisor.VisibilityAssessment_Payload", "Windshield_Defrost_Request_Supervisor.ElectricalInterfaceStatus_Payload", "Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_P", "Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PS", "Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_P", "Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PS", "Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_P", "Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PS", "Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_P", "Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PS", "Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_P", "Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PS", "Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_P", "Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PS", "Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_P", "Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PS", "Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_P", "Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PS", "Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_P", "Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PS", "Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_P", "Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PS"))
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
        case "Windshield_Defrost_Request_Supervisor.RequestMemory_Payload" => val r = parseWindshield_Defrost_Request_SupervisorRequestMemory_PayloadT(T); return r
        case "Windshield_Defrost_Request_Supervisor.RequestIntent_Payload" => val r = parseWindshield_Defrost_Request_SupervisorRequestIntent_PayloadT(T); return r
        case "Windshield_Defrost_Request_Supervisor.RequestValidity_Payload" => val r = parseWindshield_Defrost_Request_SupervisorRequestValidity_PayloadT(T); return r
        case "Windshield_Defrost_Request_Supervisor.GlazingValidity_Payload" => val r = parseWindshield_Defrost_Request_SupervisorGlazingValidity_PayloadT(T); return r
        case "Windshield_Defrost_Request_Supervisor.GlazingCondition_Payload" => val r = parseWindshield_Defrost_Request_SupervisorGlazingCondition_PayloadT(T); return r
        case "Windshield_Defrost_Request_Supervisor.DefrostSelection_Payload" => val r = parseWindshield_Defrost_Request_SupervisorDefrostSelection_PayloadT(T); return r
        case "Windshield_Defrost_Request_Supervisor.PolicyDisposition_Payload" => val r = parseWindshield_Defrost_Request_SupervisorPolicyDisposition_PayloadT(T); return r
        case "Windshield_Defrost_Request_Supervisor.DefrostEligibility_Payload" => val r = parseWindshield_Defrost_Request_SupervisorDefrostEligibility_PayloadT(T); return r
        case "Windshield_Defrost_Request_Supervisor.DriverDefrostStatus_Payload" => val r = parseWindshield_Defrost_Request_SupervisorDriverDefrostStatus_PayloadT(T); return r
        case "Windshield_Defrost_Request_Supervisor.DefrostEnableCommand_Payload" => val r = parseWindshield_Defrost_Request_SupervisorDefrostEnableCommand_PayloadT(T); return r
        case "Windshield_Defrost_Request_Supervisor.DefrostLoadAllowance_Payload" => val r = parseWindshield_Defrost_Request_SupervisorDefrostLoadAllowance_PayloadT(T); return r
        case "Windshield_Defrost_Request_Supervisor.VisibilityAssessment_Payload" => val r = parseWindshield_Defrost_Request_SupervisorVisibilityAssessment_PayloadT(T); return r
        case "Windshield_Defrost_Request_Supervisor.ElectricalInterfaceStatus_Payload" => val r = parseWindshield_Defrost_Request_SupervisorElectricalInterfaceStatus_PayloadT(T); return r
        case "Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_P" => val r = parseWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PT(T); return r
        case "Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PS" => val r = parseWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PST(T); return r
        case "Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_P" => val r = parseWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PT(T); return r
        case "Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PS" => val r = parseWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PST(T); return r
        case "Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_P" => val r = parseWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PT(T); return r
        case "Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PS" => val r = parseWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PST(T); return r
        case "Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_P" => val r = parseWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PT(T); return r
        case "Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PS" => val r = parseWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PST(T); return r
        case "Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_P" => val r = parseWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PT(T); return r
        case "Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PS" => val r = parseWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PST(T); return r
        case "Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_P" => val r = parseWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PT(T); return r
        case "Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PS" => val r = parseWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PST(T); return r
        case "Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_P" => val r = parseWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PT(T); return r
        case "Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PS" => val r = parseWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PST(T); return r
        case "Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_P" => val r = parseWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PT(T); return r
        case "Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PS" => val r = parseWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PST(T); return r
        case "Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_P" => val r = parseWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PT(T); return r
        case "Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PS" => val r = parseWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PST(T); return r
        case "Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_P" => val r = parseWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PT(T); return r
        case "Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PS" => val r = parseWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PST(T); return r
        case _ => val r = parseWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PST(T); return r
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

  def fromWindshield_Defrost_Request_SupervisorDefrostSelection_Payload(o: Windshield_Defrost_Request_Supervisor.DefrostSelection_Payload, isCompact: B): String = {
    val st = Printer.printWindshield_Defrost_Request_SupervisorDefrostSelection_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toWindshield_Defrost_Request_SupervisorDefrostSelection_Payload(s: String): Either[Windshield_Defrost_Request_Supervisor.DefrostSelection_Payload, Json.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorDefrostSelection_Payload(parser: Parser): Windshield_Defrost_Request_Supervisor.DefrostSelection_Payload = {
      val r = parser.parseWindshield_Defrost_Request_SupervisorDefrostSelection_Payload()
      return r
    }
    val r = to(s, fWindshield_Defrost_Request_SupervisorDefrostSelection_Payload _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorRequestValidity_Payload(o: Windshield_Defrost_Request_Supervisor.RequestValidity_Payload, isCompact: B): String = {
    val st = Printer.printWindshield_Defrost_Request_SupervisorRequestValidity_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toWindshield_Defrost_Request_SupervisorRequestValidity_Payload(s: String): Either[Windshield_Defrost_Request_Supervisor.RequestValidity_Payload, Json.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorRequestValidity_Payload(parser: Parser): Windshield_Defrost_Request_Supervisor.RequestValidity_Payload = {
      val r = parser.parseWindshield_Defrost_Request_SupervisorRequestValidity_Payload()
      return r
    }
    val r = to(s, fWindshield_Defrost_Request_SupervisorRequestValidity_Payload _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorRequestIntent_Payload(o: Windshield_Defrost_Request_Supervisor.RequestIntent_Payload, isCompact: B): String = {
    val st = Printer.printWindshield_Defrost_Request_SupervisorRequestIntent_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toWindshield_Defrost_Request_SupervisorRequestIntent_Payload(s: String): Either[Windshield_Defrost_Request_Supervisor.RequestIntent_Payload, Json.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorRequestIntent_Payload(parser: Parser): Windshield_Defrost_Request_Supervisor.RequestIntent_Payload = {
      val r = parser.parseWindshield_Defrost_Request_SupervisorRequestIntent_Payload()
      return r
    }
    val r = to(s, fWindshield_Defrost_Request_SupervisorRequestIntent_Payload _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorGlazingCondition_Payload(o: Windshield_Defrost_Request_Supervisor.GlazingCondition_Payload, isCompact: B): String = {
    val st = Printer.printWindshield_Defrost_Request_SupervisorGlazingCondition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toWindshield_Defrost_Request_SupervisorGlazingCondition_Payload(s: String): Either[Windshield_Defrost_Request_Supervisor.GlazingCondition_Payload, Json.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorGlazingCondition_Payload(parser: Parser): Windshield_Defrost_Request_Supervisor.GlazingCondition_Payload = {
      val r = parser.parseWindshield_Defrost_Request_SupervisorGlazingCondition_Payload()
      return r
    }
    val r = to(s, fWindshield_Defrost_Request_SupervisorGlazingCondition_Payload _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorGlazingValidity_Payload(o: Windshield_Defrost_Request_Supervisor.GlazingValidity_Payload, isCompact: B): String = {
    val st = Printer.printWindshield_Defrost_Request_SupervisorGlazingValidity_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toWindshield_Defrost_Request_SupervisorGlazingValidity_Payload(s: String): Either[Windshield_Defrost_Request_Supervisor.GlazingValidity_Payload, Json.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorGlazingValidity_Payload(parser: Parser): Windshield_Defrost_Request_Supervisor.GlazingValidity_Payload = {
      val r = parser.parseWindshield_Defrost_Request_SupervisorGlazingValidity_Payload()
      return r
    }
    val r = to(s, fWindshield_Defrost_Request_SupervisorGlazingValidity_Payload _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorVisibilityAssessment_Payload(o: Windshield_Defrost_Request_Supervisor.VisibilityAssessment_Payload, isCompact: B): String = {
    val st = Printer.printWindshield_Defrost_Request_SupervisorVisibilityAssessment_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toWindshield_Defrost_Request_SupervisorVisibilityAssessment_Payload(s: String): Either[Windshield_Defrost_Request_Supervisor.VisibilityAssessment_Payload, Json.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorVisibilityAssessment_Payload(parser: Parser): Windshield_Defrost_Request_Supervisor.VisibilityAssessment_Payload = {
      val r = parser.parseWindshield_Defrost_Request_SupervisorVisibilityAssessment_Payload()
      return r
    }
    val r = to(s, fWindshield_Defrost_Request_SupervisorVisibilityAssessment_Payload _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorElectricalInterfaceStatus_Payload(o: Windshield_Defrost_Request_Supervisor.ElectricalInterfaceStatus_Payload, isCompact: B): String = {
    val st = Printer.printWindshield_Defrost_Request_SupervisorElectricalInterfaceStatus_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toWindshield_Defrost_Request_SupervisorElectricalInterfaceStatus_Payload(s: String): Either[Windshield_Defrost_Request_Supervisor.ElectricalInterfaceStatus_Payload, Json.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorElectricalInterfaceStatus_Payload(parser: Parser): Windshield_Defrost_Request_Supervisor.ElectricalInterfaceStatus_Payload = {
      val r = parser.parseWindshield_Defrost_Request_SupervisorElectricalInterfaceStatus_Payload()
      return r
    }
    val r = to(s, fWindshield_Defrost_Request_SupervisorElectricalInterfaceStatus_Payload _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorDefrostLoadAllowance_Payload(o: Windshield_Defrost_Request_Supervisor.DefrostLoadAllowance_Payload, isCompact: B): String = {
    val st = Printer.printWindshield_Defrost_Request_SupervisorDefrostLoadAllowance_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toWindshield_Defrost_Request_SupervisorDefrostLoadAllowance_Payload(s: String): Either[Windshield_Defrost_Request_Supervisor.DefrostLoadAllowance_Payload, Json.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorDefrostLoadAllowance_Payload(parser: Parser): Windshield_Defrost_Request_Supervisor.DefrostLoadAllowance_Payload = {
      val r = parser.parseWindshield_Defrost_Request_SupervisorDefrostLoadAllowance_Payload()
      return r
    }
    val r = to(s, fWindshield_Defrost_Request_SupervisorDefrostLoadAllowance_Payload _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorDefrostEligibility_Payload(o: Windshield_Defrost_Request_Supervisor.DefrostEligibility_Payload, isCompact: B): String = {
    val st = Printer.printWindshield_Defrost_Request_SupervisorDefrostEligibility_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toWindshield_Defrost_Request_SupervisorDefrostEligibility_Payload(s: String): Either[Windshield_Defrost_Request_Supervisor.DefrostEligibility_Payload, Json.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorDefrostEligibility_Payload(parser: Parser): Windshield_Defrost_Request_Supervisor.DefrostEligibility_Payload = {
      val r = parser.parseWindshield_Defrost_Request_SupervisorDefrostEligibility_Payload()
      return r
    }
    val r = to(s, fWindshield_Defrost_Request_SupervisorDefrostEligibility_Payload _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorDefrostEnableCommand_Payload(o: Windshield_Defrost_Request_Supervisor.DefrostEnableCommand_Payload, isCompact: B): String = {
    val st = Printer.printWindshield_Defrost_Request_SupervisorDefrostEnableCommand_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toWindshield_Defrost_Request_SupervisorDefrostEnableCommand_Payload(s: String): Either[Windshield_Defrost_Request_Supervisor.DefrostEnableCommand_Payload, Json.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorDefrostEnableCommand_Payload(parser: Parser): Windshield_Defrost_Request_Supervisor.DefrostEnableCommand_Payload = {
      val r = parser.parseWindshield_Defrost_Request_SupervisorDefrostEnableCommand_Payload()
      return r
    }
    val r = to(s, fWindshield_Defrost_Request_SupervisorDefrostEnableCommand_Payload _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorPolicyDisposition_Payload(o: Windshield_Defrost_Request_Supervisor.PolicyDisposition_Payload, isCompact: B): String = {
    val st = Printer.printWindshield_Defrost_Request_SupervisorPolicyDisposition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toWindshield_Defrost_Request_SupervisorPolicyDisposition_Payload(s: String): Either[Windshield_Defrost_Request_Supervisor.PolicyDisposition_Payload, Json.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorPolicyDisposition_Payload(parser: Parser): Windshield_Defrost_Request_Supervisor.PolicyDisposition_Payload = {
      val r = parser.parseWindshield_Defrost_Request_SupervisorPolicyDisposition_Payload()
      return r
    }
    val r = to(s, fWindshield_Defrost_Request_SupervisorPolicyDisposition_Payload _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorDriverDefrostStatus_Payload(o: Windshield_Defrost_Request_Supervisor.DriverDefrostStatus_Payload, isCompact: B): String = {
    val st = Printer.printWindshield_Defrost_Request_SupervisorDriverDefrostStatus_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toWindshield_Defrost_Request_SupervisorDriverDefrostStatus_Payload(s: String): Either[Windshield_Defrost_Request_Supervisor.DriverDefrostStatus_Payload, Json.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorDriverDefrostStatus_Payload(parser: Parser): Windshield_Defrost_Request_Supervisor.DriverDefrostStatus_Payload = {
      val r = parser.parseWindshield_Defrost_Request_SupervisorDriverDefrostStatus_Payload()
      return r
    }
    val r = to(s, fWindshield_Defrost_Request_SupervisorDriverDefrostStatus_Payload _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorRequestMemory_Payload(o: Windshield_Defrost_Request_Supervisor.RequestMemory_Payload, isCompact: B): String = {
    val st = Printer.printWindshield_Defrost_Request_SupervisorRequestMemory_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toWindshield_Defrost_Request_SupervisorRequestMemory_Payload(s: String): Either[Windshield_Defrost_Request_Supervisor.RequestMemory_Payload, Json.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorRequestMemory_Payload(parser: Parser): Windshield_Defrost_Request_Supervisor.RequestMemory_Payload = {
      val r = parser.parseWindshield_Defrost_Request_SupervisorRequestMemory_Payload()
      return r
    }
    val r = to(s, fWindshield_Defrost_Request_SupervisorRequestMemory_Payload _)
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

  def fromWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container(o: Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container, isCompact: B): String = {
    val st = Printer.printWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container(s: String): Either[Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container, Json.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container(parser: Parser): Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container = {
      val r = parser.parseWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container()
      return r
    }
    val r = to(s, fWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_P(o: Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_P(s: String): Either[Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_P, Json.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_P(parser: Parser): Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_P = {
      val r = parser.parseWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_P()
      return r
    }
    val r = to(s, fWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_P _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PS(o: Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PS(s: String): Either[Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PS, Json.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PS(parser: Parser): Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PS = {
      val r = parser.parseWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PS()
      return r
    }
    val r = to(s, fWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PS _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container(o: Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container, isCompact: B): String = {
    val st = Printer.printWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container(s: String): Either[Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container, Json.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container(parser: Parser): Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container = {
      val r = parser.parseWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container()
      return r
    }
    val r = to(s, fWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_P(o: Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_P(s: String): Either[Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_P, Json.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_P(parser: Parser): Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_P = {
      val r = parser.parseWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_P()
      return r
    }
    val r = to(s, fWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_P _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PS(o: Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PS(s: String): Either[Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PS, Json.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PS(parser: Parser): Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PS = {
      val r = parser.parseWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PS()
      return r
    }
    val r = to(s, fWindshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PS _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container(o: Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container, isCompact: B): String = {
    val st = Printer.printWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container(s: String): Either[Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container, Json.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container(parser: Parser): Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container = {
      val r = parser.parseWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container()
      return r
    }
    val r = to(s, fWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_P(o: Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_P(s: String): Either[Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_P, Json.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_P(parser: Parser): Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_P = {
      val r = parser.parseWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_P()
      return r
    }
    val r = to(s, fWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_P _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PS(o: Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PS(s: String): Either[Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PS, Json.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PS(parser: Parser): Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PS = {
      val r = parser.parseWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PS()
      return r
    }
    val r = to(s, fWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PS _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container(o: Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container, isCompact: B): String = {
    val st = Printer.printWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container(s: String): Either[Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container, Json.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container(parser: Parser): Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container = {
      val r = parser.parseWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container()
      return r
    }
    val r = to(s, fWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_P(o: Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_P(s: String): Either[Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_P, Json.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_P(parser: Parser): Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_P = {
      val r = parser.parseWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_P()
      return r
    }
    val r = to(s, fWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_P _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PS(o: Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PS(s: String): Either[Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PS, Json.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PS(parser: Parser): Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PS = {
      val r = parser.parseWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PS()
      return r
    }
    val r = to(s, fWindshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PS _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container(o: Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container, isCompact: B): String = {
    val st = Printer.printWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container(s: String): Either[Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container, Json.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container(parser: Parser): Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container = {
      val r = parser.parseWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container()
      return r
    }
    val r = to(s, fWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_P(o: Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_P(s: String): Either[Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_P, Json.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_P(parser: Parser): Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_P = {
      val r = parser.parseWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_P()
      return r
    }
    val r = to(s, fWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_P _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PS(o: Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PS(s: String): Either[Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PS, Json.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PS(parser: Parser): Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PS = {
      val r = parser.parseWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PS()
      return r
    }
    val r = to(s, fWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PS _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container(o: Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container, isCompact: B): String = {
    val st = Printer.printWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container(s: String): Either[Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container, Json.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container(parser: Parser): Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container = {
      val r = parser.parseWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container()
      return r
    }
    val r = to(s, fWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_P(o: Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_P(s: String): Either[Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_P, Json.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_P(parser: Parser): Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_P = {
      val r = parser.parseWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_P()
      return r
    }
    val r = to(s, fWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_P _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PS(o: Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PS(s: String): Either[Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PS, Json.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PS(parser: Parser): Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PS = {
      val r = parser.parseWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PS()
      return r
    }
    val r = to(s, fWindshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PS _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container(o: Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container, isCompact: B): String = {
    val st = Printer.printWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container(s: String): Either[Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container, Json.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container(parser: Parser): Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container = {
      val r = parser.parseWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container()
      return r
    }
    val r = to(s, fWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_P(o: Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_P(s: String): Either[Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_P, Json.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_P(parser: Parser): Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_P = {
      val r = parser.parseWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_P()
      return r
    }
    val r = to(s, fWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_P _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PS(o: Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PS(s: String): Either[Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PS, Json.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PS(parser: Parser): Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PS = {
      val r = parser.parseWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PS()
      return r
    }
    val r = to(s, fWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PS _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container(o: Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container, isCompact: B): String = {
    val st = Printer.printWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container(s: String): Either[Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container, Json.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container(parser: Parser): Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container = {
      val r = parser.parseWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container()
      return r
    }
    val r = to(s, fWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_P(o: Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_P(s: String): Either[Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_P, Json.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_P(parser: Parser): Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_P = {
      val r = parser.parseWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_P()
      return r
    }
    val r = to(s, fWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_P _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PS(o: Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PS(s: String): Either[Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PS, Json.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PS(parser: Parser): Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PS = {
      val r = parser.parseWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PS()
      return r
    }
    val r = to(s, fWindshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PS _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container(o: Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container, isCompact: B): String = {
    val st = Printer.printWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container(s: String): Either[Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container, Json.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container(parser: Parser): Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container = {
      val r = parser.parseWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container()
      return r
    }
    val r = to(s, fWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_P(o: Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_P(s: String): Either[Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_P, Json.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_P(parser: Parser): Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_P = {
      val r = parser.parseWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_P()
      return r
    }
    val r = to(s, fWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_P _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PS(o: Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PS(s: String): Either[Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PS, Json.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PS(parser: Parser): Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PS = {
      val r = parser.parseWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PS()
      return r
    }
    val r = to(s, fWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PS _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container(o: Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container, isCompact: B): String = {
    val st = Printer.printWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container(s: String): Either[Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container, Json.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container(parser: Parser): Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container = {
      val r = parser.parseWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container()
      return r
    }
    val r = to(s, fWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_P(o: Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_P(s: String): Either[Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_P, Json.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_P(parser: Parser): Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_P = {
      val r = parser.parseWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_P()
      return r
    }
    val r = to(s, fWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_P _)
    return r
  }

  def fromWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PS(o: Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PS(s: String): Either[Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PS, Json.ErrorMsg] = {
    def fWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PS(parser: Parser): Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PS = {
      val r = parser.parseWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PS()
      return r
    }
    val r = to(s, fWindshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PS _)
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