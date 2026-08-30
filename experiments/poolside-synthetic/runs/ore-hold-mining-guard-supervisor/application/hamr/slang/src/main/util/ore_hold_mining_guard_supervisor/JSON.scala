// #Sireum
// @formatter:off

// This file is auto-generated from InputStatus.scala, RequestDisposition.scala, HoldObservation.scala, HoldAssessment.scala, AsteroidCondition.scala, LaserCondition.scala, TargetCondition.scala, SupportAssessment.scala, GuardMode.scala, ResolutionReason.scala, MiningCommand.scala, GuardStatus.scala, OffloadReadiness.scala, PilotRequestSample.scala, RequestAssessment.scala, HoldSample.scala, MiningSupportSample.scala, GuardResolution.scala, Base_Types.scala, RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_Containers.scala, HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_Containers.scala, MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_Containers.scala, OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_Containers.scala, MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_Containers.scala, GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package ore_hold_mining_guard_supervisor

import org.sireum._
import org.sireum.Json.Printer._

object JSON {

  object Printer {

    @pure def printOre_Hold_Mining_Guard_SupervisorInputStatusType(o: Ore_Hold_Mining_Guard_Supervisor.InputStatus.Type): ST = {
      val value: String = o match {
        case Ore_Hold_Mining_Guard_Supervisor.InputStatus.Valid => "Valid"
        case Ore_Hold_Mining_Guard_Supervisor.InputStatus.Invalid => "Invalid"
      }
      return printObject(ISZ(
        ("type", printString("Ore_Hold_Mining_Guard_Supervisor.InputStatus")),
        ("value", printString(value))
      ))
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorInputStatus_Payload(o: Ore_Hold_Mining_Guard_Supervisor.InputStatus_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Ore_Hold_Mining_Guard_Supervisor.InputStatus_Payload""""),
        ("value", printOre_Hold_Mining_Guard_SupervisorInputStatusType(o.value))
      ))
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorRequestDispositionType(o: Ore_Hold_Mining_Guard_Supervisor.RequestDisposition.Type): ST = {
      val value: String = o match {
        case Ore_Hold_Mining_Guard_Supervisor.RequestDisposition.InvalidRequest => "InvalidRequest"
        case Ore_Hold_Mining_Guard_Supervisor.RequestDisposition.HaltDominant => "HaltDominant"
        case Ore_Hold_Mining_Guard_Supervisor.RequestDisposition.FreshResume => "FreshResume"
        case Ore_Hold_Mining_Guard_Supervisor.RequestDisposition.FreshStart => "FreshStart"
        case Ore_Hold_Mining_Guard_Supervisor.RequestDisposition.NoFreshRequest => "NoFreshRequest"
      }
      return printObject(ISZ(
        ("type", printString("Ore_Hold_Mining_Guard_Supervisor.RequestDisposition")),
        ("value", printString(value))
      ))
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorRequestDisposition_Payload(o: Ore_Hold_Mining_Guard_Supervisor.RequestDisposition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Ore_Hold_Mining_Guard_Supervisor.RequestDisposition_Payload""""),
        ("value", printOre_Hold_Mining_Guard_SupervisorRequestDispositionType(o.value))
      ))
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorHoldObservationType(o: Ore_Hold_Mining_Guard_Supervisor.HoldObservation.Type): ST = {
      val value: String = o match {
        case Ore_Hold_Mining_Guard_Supervisor.HoldObservation.RoomAvailable => "RoomAvailable"
        case Ore_Hold_Mining_Guard_Supervisor.HoldObservation.NearlyFull => "NearlyFull"
      }
      return printObject(ISZ(
        ("type", printString("Ore_Hold_Mining_Guard_Supervisor.HoldObservation")),
        ("value", printString(value))
      ))
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorHoldObservation_Payload(o: Ore_Hold_Mining_Guard_Supervisor.HoldObservation_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Ore_Hold_Mining_Guard_Supervisor.HoldObservation_Payload""""),
        ("value", printOre_Hold_Mining_Guard_SupervisorHoldObservationType(o.value))
      ))
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorHoldAssessmentType(o: Ore_Hold_Mining_Guard_Supervisor.HoldAssessment.Type): ST = {
      val value: String = o match {
        case Ore_Hold_Mining_Guard_Supervisor.HoldAssessment.SpaceAvailable => "SpaceAvailable"
        case Ore_Hold_Mining_Guard_Supervisor.HoldAssessment.GuardReached => "GuardReached"
        case Ore_Hold_Mining_Guard_Supervisor.HoldAssessment.InvalidHold => "InvalidHold"
      }
      return printObject(ISZ(
        ("type", printString("Ore_Hold_Mining_Guard_Supervisor.HoldAssessment")),
        ("value", printString(value))
      ))
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorHoldAssessment_Payload(o: Ore_Hold_Mining_Guard_Supervisor.HoldAssessment_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Ore_Hold_Mining_Guard_Supervisor.HoldAssessment_Payload""""),
        ("value", printOre_Hold_Mining_Guard_SupervisorHoldAssessmentType(o.value))
      ))
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorAsteroidConditionType(o: Ore_Hold_Mining_Guard_Supervisor.AsteroidCondition.Type): ST = {
      val value: String = o match {
        case Ore_Hold_Mining_Guard_Supervisor.AsteroidCondition.OreAvailable => "OreAvailable"
        case Ore_Hold_Mining_Guard_Supervisor.AsteroidCondition.Depleted => "Depleted"
      }
      return printObject(ISZ(
        ("type", printString("Ore_Hold_Mining_Guard_Supervisor.AsteroidCondition")),
        ("value", printString(value))
      ))
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorAsteroidCondition_Payload(o: Ore_Hold_Mining_Guard_Supervisor.AsteroidCondition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Ore_Hold_Mining_Guard_Supervisor.AsteroidCondition_Payload""""),
        ("value", printOre_Hold_Mining_Guard_SupervisorAsteroidConditionType(o.value))
      ))
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorLaserConditionType(o: Ore_Hold_Mining_Guard_Supervisor.LaserCondition.Type): ST = {
      val value: String = o match {
        case Ore_Hold_Mining_Guard_Supervisor.LaserCondition.Ready => "Ready"
        case Ore_Hold_Mining_Guard_Supervisor.LaserCondition.Overheated => "Overheated"
      }
      return printObject(ISZ(
        ("type", printString("Ore_Hold_Mining_Guard_Supervisor.LaserCondition")),
        ("value", printString(value))
      ))
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorLaserCondition_Payload(o: Ore_Hold_Mining_Guard_Supervisor.LaserCondition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Ore_Hold_Mining_Guard_Supervisor.LaserCondition_Payload""""),
        ("value", printOre_Hold_Mining_Guard_SupervisorLaserConditionType(o.value))
      ))
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorTargetConditionType(o: Ore_Hold_Mining_Guard_Supervisor.TargetCondition.Type): ST = {
      val value: String = o match {
        case Ore_Hold_Mining_Guard_Supervisor.TargetCondition.Locked => "Locked"
        case Ore_Hold_Mining_Guard_Supervisor.TargetCondition.Interfered => "Interfered"
      }
      return printObject(ISZ(
        ("type", printString("Ore_Hold_Mining_Guard_Supervisor.TargetCondition")),
        ("value", printString(value))
      ))
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorTargetCondition_Payload(o: Ore_Hold_Mining_Guard_Supervisor.TargetCondition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Ore_Hold_Mining_Guard_Supervisor.TargetCondition_Payload""""),
        ("value", printOre_Hold_Mining_Guard_SupervisorTargetConditionType(o.value))
      ))
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorSupportAssessmentType(o: Ore_Hold_Mining_Guard_Supervisor.SupportAssessment.Type): ST = {
      val value: String = o match {
        case Ore_Hold_Mining_Guard_Supervisor.SupportAssessment.SupportReady => "SupportReady"
        case Ore_Hold_Mining_Guard_Supervisor.SupportAssessment.SupportBlocked => "SupportBlocked"
        case Ore_Hold_Mining_Guard_Supervisor.SupportAssessment.InvalidSupport => "InvalidSupport"
      }
      return printObject(ISZ(
        ("type", printString("Ore_Hold_Mining_Guard_Supervisor.SupportAssessment")),
        ("value", printString(value))
      ))
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorSupportAssessment_Payload(o: Ore_Hold_Mining_Guard_Supervisor.SupportAssessment_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Ore_Hold_Mining_Guard_Supervisor.SupportAssessment_Payload""""),
        ("value", printOre_Hold_Mining_Guard_SupervisorSupportAssessmentType(o.value))
      ))
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorGuardModeType(o: Ore_Hold_Mining_Guard_Supervisor.GuardMode.Type): ST = {
      val value: String = o match {
        case Ore_Hold_Mining_Guard_Supervisor.GuardMode.Idle => "Idle"
        case Ore_Hold_Mining_Guard_Supervisor.GuardMode.Mining => "Mining"
        case Ore_Hold_Mining_Guard_Supervisor.GuardMode.CapacityHold => "CapacityHold"
        case Ore_Hold_Mining_Guard_Supervisor.GuardMode.ConditionHold => "ConditionHold"
        case Ore_Hold_Mining_Guard_Supervisor.GuardMode.RecoveryReady => "RecoveryReady"
      }
      return printObject(ISZ(
        ("type", printString("Ore_Hold_Mining_Guard_Supervisor.GuardMode")),
        ("value", printString(value))
      ))
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorGuardMode_Payload(o: Ore_Hold_Mining_Guard_Supervisor.GuardMode_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Ore_Hold_Mining_Guard_Supervisor.GuardMode_Payload""""),
        ("value", printOre_Hold_Mining_Guard_SupervisorGuardModeType(o.value))
      ))
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorResolutionReasonType(o: Ore_Hold_Mining_Guard_Supervisor.ResolutionReason.Type): ST = {
      val value: String = o match {
        case Ore_Hold_Mining_Guard_Supervisor.ResolutionReason.HaltSelected => "HaltSelected"
        case Ore_Hold_Mining_Guard_Supervisor.ResolutionReason.InvalidEvidence => "InvalidEvidence"
        case Ore_Hold_Mining_Guard_Supervisor.ResolutionReason.HoldGuardReached => "HoldGuardReached"
        case Ore_Hold_Mining_Guard_Supervisor.ResolutionReason.SupportUnavailable => "SupportUnavailable"
        case Ore_Hold_Mining_Guard_Supervisor.ResolutionReason.StartAdmitted => "StartAdmitted"
        case Ore_Hold_Mining_Guard_Supervisor.ResolutionReason.IdleWaiting => "IdleWaiting"
        case Ore_Hold_Mining_Guard_Supervisor.ResolutionReason.MiningMaintained => "MiningMaintained"
        case Ore_Hold_Mining_Guard_Supervisor.ResolutionReason.GuardCleared => "GuardCleared"
        case Ore_Hold_Mining_Guard_Supervisor.ResolutionReason.EvidenceRestored => "EvidenceRestored"
        case Ore_Hold_Mining_Guard_Supervisor.ResolutionReason.ResumeAdmitted => "ResumeAdmitted"
        case Ore_Hold_Mining_Guard_Supervisor.ResolutionReason.RecoveryWaiting => "RecoveryWaiting"
      }
      return printObject(ISZ(
        ("type", printString("Ore_Hold_Mining_Guard_Supervisor.ResolutionReason")),
        ("value", printString(value))
      ))
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorResolutionReason_Payload(o: Ore_Hold_Mining_Guard_Supervisor.ResolutionReason_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Ore_Hold_Mining_Guard_Supervisor.ResolutionReason_Payload""""),
        ("value", printOre_Hold_Mining_Guard_SupervisorResolutionReasonType(o.value))
      ))
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorMiningCommandType(o: Ore_Hold_Mining_Guard_Supervisor.MiningCommand.Type): ST = {
      val value: String = o match {
        case Ore_Hold_Mining_Guard_Supervisor.MiningCommand.StopMining => "StopMining"
        case Ore_Hold_Mining_Guard_Supervisor.MiningCommand.ContinueMining => "ContinueMining"
      }
      return printObject(ISZ(
        ("type", printString("Ore_Hold_Mining_Guard_Supervisor.MiningCommand")),
        ("value", printString(value))
      ))
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorMiningCommand_Payload(o: Ore_Hold_Mining_Guard_Supervisor.MiningCommand_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Ore_Hold_Mining_Guard_Supervisor.MiningCommand_Payload""""),
        ("value", printOre_Hold_Mining_Guard_SupervisorMiningCommandType(o.value))
      ))
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorGuardStatusType(o: Ore_Hold_Mining_Guard_Supervisor.GuardStatus.Type): ST = {
      val value: String = o match {
        case Ore_Hold_Mining_Guard_Supervisor.GuardStatus.Idle => "Idle"
        case Ore_Hold_Mining_Guard_Supervisor.GuardStatus.MiningAuthorized => "MiningAuthorized"
        case Ore_Hold_Mining_Guard_Supervisor.GuardStatus.HaltedByPilot => "HaltedByPilot"
        case Ore_Hold_Mining_Guard_Supervisor.GuardStatus.GuardedNearlyFull => "GuardedNearlyFull"
        case Ore_Hold_Mining_Guard_Supervisor.GuardStatus.HeldForSupport => "HeldForSupport"
        case Ore_Hold_Mining_Guard_Supervisor.GuardStatus.InputFault => "InputFault"
        case Ore_Hold_Mining_Guard_Supervisor.GuardStatus.AwaitingFreshResume => "AwaitingFreshResume"
        case Ore_Hold_Mining_Guard_Supervisor.GuardStatus.RequestConflict => "RequestConflict"
      }
      return printObject(ISZ(
        ("type", printString("Ore_Hold_Mining_Guard_Supervisor.GuardStatus")),
        ("value", printString(value))
      ))
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorGuardStatus_Payload(o: Ore_Hold_Mining_Guard_Supervisor.GuardStatus_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Ore_Hold_Mining_Guard_Supervisor.GuardStatus_Payload""""),
        ("value", printOre_Hold_Mining_Guard_SupervisorGuardStatusType(o.value))
      ))
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorOffloadReadinessType(o: Ore_Hold_Mining_Guard_Supervisor.OffloadReadiness.Type): ST = {
      val value: String = o match {
        case Ore_Hold_Mining_Guard_Supervisor.OffloadReadiness.NotReadyForOffload => "NotReadyForOffload"
        case Ore_Hold_Mining_Guard_Supervisor.OffloadReadiness.ReadyForLaterOffload => "ReadyForLaterOffload"
      }
      return printObject(ISZ(
        ("type", printString("Ore_Hold_Mining_Guard_Supervisor.OffloadReadiness")),
        ("value", printString(value))
      ))
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorOffloadReadiness_Payload(o: Ore_Hold_Mining_Guard_Supervisor.OffloadReadiness_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Ore_Hold_Mining_Guard_Supervisor.OffloadReadiness_Payload""""),
        ("value", printOre_Hold_Mining_Guard_SupervisorOffloadReadinessType(o.value))
      ))
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorPilotRequestSample(o: Ore_Hold_Mining_Guard_Supervisor.PilotRequestSample): ST = {
      return printObject(ISZ(
        ("type", st""""Ore_Hold_Mining_Guard_Supervisor.PilotRequestSample""""),
        ("start", printB(o.start)),
        ("halt_request", printB(o.halt_request)),
        ("resume", printB(o.resume)),
        ("status", printOre_Hold_Mining_Guard_SupervisorInputStatusType(o.status))
      ))
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorPilotRequestSample_Payload(o: Ore_Hold_Mining_Guard_Supervisor.PilotRequestSample_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Ore_Hold_Mining_Guard_Supervisor.PilotRequestSample_Payload""""),
        ("value", printOre_Hold_Mining_Guard_SupervisorPilotRequestSample(o.value))
      ))
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorRequestAssessment(o: Ore_Hold_Mining_Guard_Supervisor.RequestAssessment): ST = {
      return printObject(ISZ(
        ("type", st""""Ore_Hold_Mining_Guard_Supervisor.RequestAssessment""""),
        ("disposition", printOre_Hold_Mining_Guard_SupervisorRequestDispositionType(o.disposition)),
        ("conflict", printB(o.conflict))
      ))
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorRequestAssessment_Payload(o: Ore_Hold_Mining_Guard_Supervisor.RequestAssessment_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Ore_Hold_Mining_Guard_Supervisor.RequestAssessment_Payload""""),
        ("value", printOre_Hold_Mining_Guard_SupervisorRequestAssessment(o.value))
      ))
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorHoldSample(o: Ore_Hold_Mining_Guard_Supervisor.HoldSample): ST = {
      return printObject(ISZ(
        ("type", st""""Ore_Hold_Mining_Guard_Supervisor.HoldSample""""),
        ("observation", printOre_Hold_Mining_Guard_SupervisorHoldObservationType(o.observation)),
        ("status", printOre_Hold_Mining_Guard_SupervisorInputStatusType(o.status))
      ))
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorHoldSample_Payload(o: Ore_Hold_Mining_Guard_Supervisor.HoldSample_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Ore_Hold_Mining_Guard_Supervisor.HoldSample_Payload""""),
        ("value", printOre_Hold_Mining_Guard_SupervisorHoldSample(o.value))
      ))
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorMiningSupportSample(o: Ore_Hold_Mining_Guard_Supervisor.MiningSupportSample): ST = {
      return printObject(ISZ(
        ("type", st""""Ore_Hold_Mining_Guard_Supervisor.MiningSupportSample""""),
        ("asteroid", printOre_Hold_Mining_Guard_SupervisorAsteroidConditionType(o.asteroid)),
        ("laser", printOre_Hold_Mining_Guard_SupervisorLaserConditionType(o.laser)),
        ("target", printOre_Hold_Mining_Guard_SupervisorTargetConditionType(o.target)),
        ("status", printOre_Hold_Mining_Guard_SupervisorInputStatusType(o.status))
      ))
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorMiningSupportSample_Payload(o: Ore_Hold_Mining_Guard_Supervisor.MiningSupportSample_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Ore_Hold_Mining_Guard_Supervisor.MiningSupportSample_Payload""""),
        ("value", printOre_Hold_Mining_Guard_SupervisorMiningSupportSample(o.value))
      ))
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorGuardResolution(o: Ore_Hold_Mining_Guard_Supervisor.GuardResolution): ST = {
      return printObject(ISZ(
        ("type", st""""Ore_Hold_Mining_Guard_Supervisor.GuardResolution""""),
        ("nextMode", printOre_Hold_Mining_Guard_SupervisorGuardModeType(o.nextMode)),
        ("reason", printOre_Hold_Mining_Guard_SupervisorResolutionReasonType(o.reason)),
        ("requestConflict", printB(o.requestConflict))
      ))
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorGuardResolution_Payload(o: Ore_Hold_Mining_Guard_Supervisor.GuardResolution_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Ore_Hold_Mining_Guard_Supervisor.GuardResolution_Payload""""),
        ("value", printOre_Hold_Mining_Guard_SupervisorGuardResolution(o.value))
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

    @pure def printOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container(o: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container): ST = {
      o match {
        case o: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P => return printOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS => return printOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS(o)
      }
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P(o: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P""""),
        ("api_pilot_request", printOre_Hold_Mining_Guard_SupervisorPilotRequestSample(o.api_pilot_request))
      ))
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS(o: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS""""),
        ("api_pilot_request", printOre_Hold_Mining_Guard_SupervisorPilotRequestSample(o.api_pilot_request))
      ))
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container(o: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container): ST = {
      o match {
        case o: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P => return printOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS => return printOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS(o)
      }
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P(o: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P""""),
        ("api_request_assessment", printOre_Hold_Mining_Guard_SupervisorRequestAssessment(o.api_request_assessment))
      ))
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS(o: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS""""),
        ("api_request_assessment", printOre_Hold_Mining_Guard_SupervisorRequestAssessment(o.api_request_assessment))
      ))
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container(o: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container): ST = {
      o match {
        case o: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P => return printOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS => return printOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS(o)
      }
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P(o: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P""""),
        ("api_hold_sample", printOre_Hold_Mining_Guard_SupervisorHoldSample(o.api_hold_sample))
      ))
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS(o: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS""""),
        ("api_hold_sample", printOre_Hold_Mining_Guard_SupervisorHoldSample(o.api_hold_sample))
      ))
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container(o: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container): ST = {
      o match {
        case o: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P => return printOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS => return printOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS(o)
      }
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P(o: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P""""),
        ("api_hold_assessment", printOre_Hold_Mining_Guard_SupervisorHoldAssessmentType(o.api_hold_assessment))
      ))
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS(o: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS""""),
        ("api_hold_assessment", printOre_Hold_Mining_Guard_SupervisorHoldAssessmentType(o.api_hold_assessment))
      ))
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container(o: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container): ST = {
      o match {
        case o: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P => return printOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS => return printOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS(o)
      }
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P(o: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P""""),
        ("api_mining_support", printOre_Hold_Mining_Guard_SupervisorMiningSupportSample(o.api_mining_support))
      ))
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS(o: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS""""),
        ("api_mining_support", printOre_Hold_Mining_Guard_SupervisorMiningSupportSample(o.api_mining_support))
      ))
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container(o: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container): ST = {
      o match {
        case o: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P => return printOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS => return printOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS(o)
      }
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P(o: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P""""),
        ("api_support_assessment", printOre_Hold_Mining_Guard_SupervisorSupportAssessmentType(o.api_support_assessment))
      ))
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS(o: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS""""),
        ("api_support_assessment", printOre_Hold_Mining_Guard_SupervisorSupportAssessmentType(o.api_support_assessment))
      ))
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container(o: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container): ST = {
      o match {
        case o: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P => return printOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS => return printOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS(o)
      }
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P(o: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P""""),
        ("api_hold_assessment", printOre_Hold_Mining_Guard_SupervisorHoldAssessmentType(o.api_hold_assessment)),
        ("api_request_assessment", printOre_Hold_Mining_Guard_SupervisorRequestAssessment(o.api_request_assessment)),
        ("api_support_assessment", printOre_Hold_Mining_Guard_SupervisorSupportAssessmentType(o.api_support_assessment))
      ))
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS(o: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS""""),
        ("api_hold_assessment", printOre_Hold_Mining_Guard_SupervisorHoldAssessmentType(o.api_hold_assessment)),
        ("api_request_assessment", printOre_Hold_Mining_Guard_SupervisorRequestAssessment(o.api_request_assessment)),
        ("api_support_assessment", printOre_Hold_Mining_Guard_SupervisorSupportAssessmentType(o.api_support_assessment))
      ))
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container(o: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container): ST = {
      o match {
        case o: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P => return printOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS => return printOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS(o)
      }
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P(o: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P""""),
        ("api_resolution_to_command", printOre_Hold_Mining_Guard_SupervisorGuardResolution(o.api_resolution_to_command)),
        ("api_resolution_to_reporting", printOre_Hold_Mining_Guard_SupervisorGuardResolution(o.api_resolution_to_reporting))
      ))
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS(o: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS""""),
        ("api_resolution_to_command", printOre_Hold_Mining_Guard_SupervisorGuardResolution(o.api_resolution_to_command)),
        ("api_resolution_to_reporting", printOre_Hold_Mining_Guard_SupervisorGuardResolution(o.api_resolution_to_reporting))
      ))
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container(o: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container): ST = {
      o match {
        case o: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P => return printOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS => return printOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS(o)
      }
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P(o: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P""""),
        ("api_guard_resolution", printOre_Hold_Mining_Guard_SupervisorGuardResolution(o.api_guard_resolution))
      ))
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS(o: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS""""),
        ("api_guard_resolution", printOre_Hold_Mining_Guard_SupervisorGuardResolution(o.api_guard_resolution))
      ))
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container(o: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container): ST = {
      o match {
        case o: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P => return printOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS => return printOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS(o)
      }
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P(o: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P""""),
        ("api_mining_command", printOre_Hold_Mining_Guard_SupervisorMiningCommandType(o.api_mining_command))
      ))
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS(o: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS""""),
        ("api_mining_command", printOre_Hold_Mining_Guard_SupervisorMiningCommandType(o.api_mining_command))
      ))
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container(o: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container): ST = {
      o match {
        case o: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P => return printOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS => return printOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS(o)
      }
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P(o: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P""""),
        ("api_guard_resolution", printOre_Hold_Mining_Guard_SupervisorGuardResolution(o.api_guard_resolution))
      ))
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS(o: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS""""),
        ("api_guard_resolution", printOre_Hold_Mining_Guard_SupervisorGuardResolution(o.api_guard_resolution))
      ))
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container(o: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container): ST = {
      o match {
        case o: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P => return printOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS => return printOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS(o)
      }
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P(o: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P""""),
        ("api_guard_status", printOre_Hold_Mining_Guard_SupervisorGuardStatusType(o.api_guard_status)),
        ("api_offload_readiness", printOre_Hold_Mining_Guard_SupervisorOffloadReadinessType(o.api_offload_readiness))
      ))
    }

    @pure def printOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS(o: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS""""),
        ("api_guard_status", printOre_Hold_Mining_Guard_SupervisorGuardStatusType(o.api_guard_status)),
        ("api_offload_readiness", printOre_Hold_Mining_Guard_SupervisorOffloadReadinessType(o.api_offload_readiness))
      ))
    }

    @pure def printruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): ST = {
      val value: String = o match {
        case runtimemonitor.ObservationKind.OreHoldMiningGuardSupervisorSystem_Instance_mining_guard_process_request_freshness_priority_owner_postInit => "OreHoldMiningGuardSupervisorSystem_Instance_mining_guard_process_request_freshness_priority_owner_postInit"
        case runtimemonitor.ObservationKind.OreHoldMiningGuardSupervisorSystem_Instance_mining_guard_process_request_freshness_priority_owner_preCompute => "OreHoldMiningGuardSupervisorSystem_Instance_mining_guard_process_request_freshness_priority_owner_preCompute"
        case runtimemonitor.ObservationKind.OreHoldMiningGuardSupervisorSystem_Instance_mining_guard_process_request_freshness_priority_owner_postCompute => "OreHoldMiningGuardSupervisorSystem_Instance_mining_guard_process_request_freshness_priority_owner_postCompute"
        case runtimemonitor.ObservationKind.OreHoldMiningGuardSupervisorSystem_Instance_mining_guard_process_hold_guard_qualification_owner_postInit => "OreHoldMiningGuardSupervisorSystem_Instance_mining_guard_process_hold_guard_qualification_owner_postInit"
        case runtimemonitor.ObservationKind.OreHoldMiningGuardSupervisorSystem_Instance_mining_guard_process_hold_guard_qualification_owner_preCompute => "OreHoldMiningGuardSupervisorSystem_Instance_mining_guard_process_hold_guard_qualification_owner_preCompute"
        case runtimemonitor.ObservationKind.OreHoldMiningGuardSupervisorSystem_Instance_mining_guard_process_hold_guard_qualification_owner_postCompute => "OreHoldMiningGuardSupervisorSystem_Instance_mining_guard_process_hold_guard_qualification_owner_postCompute"
        case runtimemonitor.ObservationKind.OreHoldMiningGuardSupervisorSystem_Instance_mining_guard_process_mining_support_qualification_owner_postInit => "OreHoldMiningGuardSupervisorSystem_Instance_mining_guard_process_mining_support_qualification_owner_postInit"
        case runtimemonitor.ObservationKind.OreHoldMiningGuardSupervisorSystem_Instance_mining_guard_process_mining_support_qualification_owner_preCompute => "OreHoldMiningGuardSupervisorSystem_Instance_mining_guard_process_mining_support_qualification_owner_preCompute"
        case runtimemonitor.ObservationKind.OreHoldMiningGuardSupervisorSystem_Instance_mining_guard_process_mining_support_qualification_owner_postCompute => "OreHoldMiningGuardSupervisorSystem_Instance_mining_guard_process_mining_support_qualification_owner_postCompute"
        case runtimemonitor.ObservationKind.OreHoldMiningGuardSupervisorSystem_Instance_mining_guard_process_ore_hold_decision_owner_postInit => "OreHoldMiningGuardSupervisorSystem_Instance_mining_guard_process_ore_hold_decision_owner_postInit"
        case runtimemonitor.ObservationKind.OreHoldMiningGuardSupervisorSystem_Instance_mining_guard_process_ore_hold_decision_owner_preCompute => "OreHoldMiningGuardSupervisorSystem_Instance_mining_guard_process_ore_hold_decision_owner_preCompute"
        case runtimemonitor.ObservationKind.OreHoldMiningGuardSupervisorSystem_Instance_mining_guard_process_ore_hold_decision_owner_postCompute => "OreHoldMiningGuardSupervisorSystem_Instance_mining_guard_process_ore_hold_decision_owner_postCompute"
        case runtimemonitor.ObservationKind.OreHoldMiningGuardSupervisorSystem_Instance_mining_guard_process_mining_command_derivation_owner_postInit => "OreHoldMiningGuardSupervisorSystem_Instance_mining_guard_process_mining_command_derivation_owner_postInit"
        case runtimemonitor.ObservationKind.OreHoldMiningGuardSupervisorSystem_Instance_mining_guard_process_mining_command_derivation_owner_preCompute => "OreHoldMiningGuardSupervisorSystem_Instance_mining_guard_process_mining_command_derivation_owner_preCompute"
        case runtimemonitor.ObservationKind.OreHoldMiningGuardSupervisorSystem_Instance_mining_guard_process_mining_command_derivation_owner_postCompute => "OreHoldMiningGuardSupervisorSystem_Instance_mining_guard_process_mining_command_derivation_owner_postCompute"
        case runtimemonitor.ObservationKind.OreHoldMiningGuardSupervisorSystem_Instance_mining_guard_process_guard_reporting_derivation_owner_postInit => "OreHoldMiningGuardSupervisorSystem_Instance_mining_guard_process_guard_reporting_derivation_owner_postInit"
        case runtimemonitor.ObservationKind.OreHoldMiningGuardSupervisorSystem_Instance_mining_guard_process_guard_reporting_derivation_owner_preCompute => "OreHoldMiningGuardSupervisorSystem_Instance_mining_guard_process_guard_reporting_derivation_owner_preCompute"
        case runtimemonitor.ObservationKind.OreHoldMiningGuardSupervisorSystem_Instance_mining_guard_process_guard_reporting_derivation_owner_postCompute => "OreHoldMiningGuardSupervisorSystem_Instance_mining_guard_process_guard_reporting_derivation_owner_postCompute"
      }
      return printObject(ISZ(
        ("type", printString("runtimemonitor.ObservationKind")),
        ("value", printString(value))
      ))
    }

    @pure def printutilContainer(o: util.Container): ST = {
      o match {
        case o: util.EmptyContainer => return printutilEmptyContainer(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P => return printOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS => return printOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P => return printOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS => return printOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P => return printOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS => return printOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P => return printOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS => return printOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P => return printOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS => return printOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P => return printOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS => return printOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P => return printOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P => return printOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS => return printOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS => return printOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P => return printOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P => return printOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS => return printOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS => return printOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P => return printOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS => return printOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P => return printOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS => return printOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS(o)
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
        case o: Ore_Hold_Mining_Guard_Supervisor.GuardMode_Payload => return printOre_Hold_Mining_Guard_SupervisorGuardMode_Payload(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.HoldSample_Payload => return printOre_Hold_Mining_Guard_SupervisorHoldSample_Payload(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.InputStatus_Payload => return printOre_Hold_Mining_Guard_SupervisorInputStatus_Payload(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.GuardStatus_Payload => return printOre_Hold_Mining_Guard_SupervisorGuardStatus_Payload(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.MiningCommand_Payload => return printOre_Hold_Mining_Guard_SupervisorMiningCommand_Payload(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.LaserCondition_Payload => return printOre_Hold_Mining_Guard_SupervisorLaserCondition_Payload(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.HoldAssessment_Payload => return printOre_Hold_Mining_Guard_SupervisorHoldAssessment_Payload(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.TargetCondition_Payload => return printOre_Hold_Mining_Guard_SupervisorTargetCondition_Payload(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.HoldObservation_Payload => return printOre_Hold_Mining_Guard_SupervisorHoldObservation_Payload(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.GuardResolution_Payload => return printOre_Hold_Mining_Guard_SupervisorGuardResolution_Payload(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.OffloadReadiness_Payload => return printOre_Hold_Mining_Guard_SupervisorOffloadReadiness_Payload(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.ResolutionReason_Payload => return printOre_Hold_Mining_Guard_SupervisorResolutionReason_Payload(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.AsteroidCondition_Payload => return printOre_Hold_Mining_Guard_SupervisorAsteroidCondition_Payload(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.SupportAssessment_Payload => return printOre_Hold_Mining_Guard_SupervisorSupportAssessment_Payload(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.RequestAssessment_Payload => return printOre_Hold_Mining_Guard_SupervisorRequestAssessment_Payload(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.RequestDisposition_Payload => return printOre_Hold_Mining_Guard_SupervisorRequestDisposition_Payload(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.PilotRequestSample_Payload => return printOre_Hold_Mining_Guard_SupervisorPilotRequestSample_Payload(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.MiningSupportSample_Payload => return printOre_Hold_Mining_Guard_SupervisorMiningSupportSample_Payload(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P => return printOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS => return printOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P => return printOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS => return printOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P => return printOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS => return printOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P => return printOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS => return printOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P => return printOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS => return printOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P => return printOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS => return printOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P => return printOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P => return printOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS => return printOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS => return printOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P => return printOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P => return printOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS => return printOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS => return printOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P => return printOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS => return printOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P => return printOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P(o)
        case o: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS => return printOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS(o)
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

    def parseOre_Hold_Mining_Guard_SupervisorInputStatusType(): Ore_Hold_Mining_Guard_Supervisor.InputStatus.Type = {
      val r = parseOre_Hold_Mining_Guard_SupervisorInputStatusT(F)
      return r
    }

    def parseOre_Hold_Mining_Guard_SupervisorInputStatusT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.InputStatus.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Ore_Hold_Mining_Guard_Supervisor.InputStatus")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Ore_Hold_Mining_Guard_Supervisor.InputStatus.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Ore_Hold_Mining_Guard_Supervisor.InputStatus.")
          return Ore_Hold_Mining_Guard_Supervisor.InputStatus.byOrdinal(0).get
      }
    }

    def parseOre_Hold_Mining_Guard_SupervisorInputStatus_Payload(): Ore_Hold_Mining_Guard_Supervisor.InputStatus_Payload = {
      val r = parseOre_Hold_Mining_Guard_SupervisorInputStatus_PayloadT(F)
      return r
    }

    def parseOre_Hold_Mining_Guard_SupervisorInputStatus_PayloadT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.InputStatus_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Ore_Hold_Mining_Guard_Supervisor.InputStatus_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseOre_Hold_Mining_Guard_SupervisorInputStatusType()
      parser.parseObjectNext()
      return Ore_Hold_Mining_Guard_Supervisor.InputStatus_Payload(value)
    }

    def parseOre_Hold_Mining_Guard_SupervisorRequestDispositionType(): Ore_Hold_Mining_Guard_Supervisor.RequestDisposition.Type = {
      val r = parseOre_Hold_Mining_Guard_SupervisorRequestDispositionT(F)
      return r
    }

    def parseOre_Hold_Mining_Guard_SupervisorRequestDispositionT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.RequestDisposition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Ore_Hold_Mining_Guard_Supervisor.RequestDisposition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Ore_Hold_Mining_Guard_Supervisor.RequestDisposition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Ore_Hold_Mining_Guard_Supervisor.RequestDisposition.")
          return Ore_Hold_Mining_Guard_Supervisor.RequestDisposition.byOrdinal(0).get
      }
    }

    def parseOre_Hold_Mining_Guard_SupervisorRequestDisposition_Payload(): Ore_Hold_Mining_Guard_Supervisor.RequestDisposition_Payload = {
      val r = parseOre_Hold_Mining_Guard_SupervisorRequestDisposition_PayloadT(F)
      return r
    }

    def parseOre_Hold_Mining_Guard_SupervisorRequestDisposition_PayloadT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.RequestDisposition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Ore_Hold_Mining_Guard_Supervisor.RequestDisposition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseOre_Hold_Mining_Guard_SupervisorRequestDispositionType()
      parser.parseObjectNext()
      return Ore_Hold_Mining_Guard_Supervisor.RequestDisposition_Payload(value)
    }

    def parseOre_Hold_Mining_Guard_SupervisorHoldObservationType(): Ore_Hold_Mining_Guard_Supervisor.HoldObservation.Type = {
      val r = parseOre_Hold_Mining_Guard_SupervisorHoldObservationT(F)
      return r
    }

    def parseOre_Hold_Mining_Guard_SupervisorHoldObservationT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.HoldObservation.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Ore_Hold_Mining_Guard_Supervisor.HoldObservation")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Ore_Hold_Mining_Guard_Supervisor.HoldObservation.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Ore_Hold_Mining_Guard_Supervisor.HoldObservation.")
          return Ore_Hold_Mining_Guard_Supervisor.HoldObservation.byOrdinal(0).get
      }
    }

    def parseOre_Hold_Mining_Guard_SupervisorHoldObservation_Payload(): Ore_Hold_Mining_Guard_Supervisor.HoldObservation_Payload = {
      val r = parseOre_Hold_Mining_Guard_SupervisorHoldObservation_PayloadT(F)
      return r
    }

    def parseOre_Hold_Mining_Guard_SupervisorHoldObservation_PayloadT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.HoldObservation_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Ore_Hold_Mining_Guard_Supervisor.HoldObservation_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseOre_Hold_Mining_Guard_SupervisorHoldObservationType()
      parser.parseObjectNext()
      return Ore_Hold_Mining_Guard_Supervisor.HoldObservation_Payload(value)
    }

    def parseOre_Hold_Mining_Guard_SupervisorHoldAssessmentType(): Ore_Hold_Mining_Guard_Supervisor.HoldAssessment.Type = {
      val r = parseOre_Hold_Mining_Guard_SupervisorHoldAssessmentT(F)
      return r
    }

    def parseOre_Hold_Mining_Guard_SupervisorHoldAssessmentT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.HoldAssessment.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Ore_Hold_Mining_Guard_Supervisor.HoldAssessment")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Ore_Hold_Mining_Guard_Supervisor.HoldAssessment.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Ore_Hold_Mining_Guard_Supervisor.HoldAssessment.")
          return Ore_Hold_Mining_Guard_Supervisor.HoldAssessment.byOrdinal(0).get
      }
    }

    def parseOre_Hold_Mining_Guard_SupervisorHoldAssessment_Payload(): Ore_Hold_Mining_Guard_Supervisor.HoldAssessment_Payload = {
      val r = parseOre_Hold_Mining_Guard_SupervisorHoldAssessment_PayloadT(F)
      return r
    }

    def parseOre_Hold_Mining_Guard_SupervisorHoldAssessment_PayloadT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.HoldAssessment_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Ore_Hold_Mining_Guard_Supervisor.HoldAssessment_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseOre_Hold_Mining_Guard_SupervisorHoldAssessmentType()
      parser.parseObjectNext()
      return Ore_Hold_Mining_Guard_Supervisor.HoldAssessment_Payload(value)
    }

    def parseOre_Hold_Mining_Guard_SupervisorAsteroidConditionType(): Ore_Hold_Mining_Guard_Supervisor.AsteroidCondition.Type = {
      val r = parseOre_Hold_Mining_Guard_SupervisorAsteroidConditionT(F)
      return r
    }

    def parseOre_Hold_Mining_Guard_SupervisorAsteroidConditionT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.AsteroidCondition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Ore_Hold_Mining_Guard_Supervisor.AsteroidCondition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Ore_Hold_Mining_Guard_Supervisor.AsteroidCondition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Ore_Hold_Mining_Guard_Supervisor.AsteroidCondition.")
          return Ore_Hold_Mining_Guard_Supervisor.AsteroidCondition.byOrdinal(0).get
      }
    }

    def parseOre_Hold_Mining_Guard_SupervisorAsteroidCondition_Payload(): Ore_Hold_Mining_Guard_Supervisor.AsteroidCondition_Payload = {
      val r = parseOre_Hold_Mining_Guard_SupervisorAsteroidCondition_PayloadT(F)
      return r
    }

    def parseOre_Hold_Mining_Guard_SupervisorAsteroidCondition_PayloadT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.AsteroidCondition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Ore_Hold_Mining_Guard_Supervisor.AsteroidCondition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseOre_Hold_Mining_Guard_SupervisorAsteroidConditionType()
      parser.parseObjectNext()
      return Ore_Hold_Mining_Guard_Supervisor.AsteroidCondition_Payload(value)
    }

    def parseOre_Hold_Mining_Guard_SupervisorLaserConditionType(): Ore_Hold_Mining_Guard_Supervisor.LaserCondition.Type = {
      val r = parseOre_Hold_Mining_Guard_SupervisorLaserConditionT(F)
      return r
    }

    def parseOre_Hold_Mining_Guard_SupervisorLaserConditionT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.LaserCondition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Ore_Hold_Mining_Guard_Supervisor.LaserCondition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Ore_Hold_Mining_Guard_Supervisor.LaserCondition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Ore_Hold_Mining_Guard_Supervisor.LaserCondition.")
          return Ore_Hold_Mining_Guard_Supervisor.LaserCondition.byOrdinal(0).get
      }
    }

    def parseOre_Hold_Mining_Guard_SupervisorLaserCondition_Payload(): Ore_Hold_Mining_Guard_Supervisor.LaserCondition_Payload = {
      val r = parseOre_Hold_Mining_Guard_SupervisorLaserCondition_PayloadT(F)
      return r
    }

    def parseOre_Hold_Mining_Guard_SupervisorLaserCondition_PayloadT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.LaserCondition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Ore_Hold_Mining_Guard_Supervisor.LaserCondition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseOre_Hold_Mining_Guard_SupervisorLaserConditionType()
      parser.parseObjectNext()
      return Ore_Hold_Mining_Guard_Supervisor.LaserCondition_Payload(value)
    }

    def parseOre_Hold_Mining_Guard_SupervisorTargetConditionType(): Ore_Hold_Mining_Guard_Supervisor.TargetCondition.Type = {
      val r = parseOre_Hold_Mining_Guard_SupervisorTargetConditionT(F)
      return r
    }

    def parseOre_Hold_Mining_Guard_SupervisorTargetConditionT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.TargetCondition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Ore_Hold_Mining_Guard_Supervisor.TargetCondition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Ore_Hold_Mining_Guard_Supervisor.TargetCondition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Ore_Hold_Mining_Guard_Supervisor.TargetCondition.")
          return Ore_Hold_Mining_Guard_Supervisor.TargetCondition.byOrdinal(0).get
      }
    }

    def parseOre_Hold_Mining_Guard_SupervisorTargetCondition_Payload(): Ore_Hold_Mining_Guard_Supervisor.TargetCondition_Payload = {
      val r = parseOre_Hold_Mining_Guard_SupervisorTargetCondition_PayloadT(F)
      return r
    }

    def parseOre_Hold_Mining_Guard_SupervisorTargetCondition_PayloadT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.TargetCondition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Ore_Hold_Mining_Guard_Supervisor.TargetCondition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseOre_Hold_Mining_Guard_SupervisorTargetConditionType()
      parser.parseObjectNext()
      return Ore_Hold_Mining_Guard_Supervisor.TargetCondition_Payload(value)
    }

    def parseOre_Hold_Mining_Guard_SupervisorSupportAssessmentType(): Ore_Hold_Mining_Guard_Supervisor.SupportAssessment.Type = {
      val r = parseOre_Hold_Mining_Guard_SupervisorSupportAssessmentT(F)
      return r
    }

    def parseOre_Hold_Mining_Guard_SupervisorSupportAssessmentT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.SupportAssessment.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Ore_Hold_Mining_Guard_Supervisor.SupportAssessment")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Ore_Hold_Mining_Guard_Supervisor.SupportAssessment.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Ore_Hold_Mining_Guard_Supervisor.SupportAssessment.")
          return Ore_Hold_Mining_Guard_Supervisor.SupportAssessment.byOrdinal(0).get
      }
    }

    def parseOre_Hold_Mining_Guard_SupervisorSupportAssessment_Payload(): Ore_Hold_Mining_Guard_Supervisor.SupportAssessment_Payload = {
      val r = parseOre_Hold_Mining_Guard_SupervisorSupportAssessment_PayloadT(F)
      return r
    }

    def parseOre_Hold_Mining_Guard_SupervisorSupportAssessment_PayloadT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.SupportAssessment_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Ore_Hold_Mining_Guard_Supervisor.SupportAssessment_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseOre_Hold_Mining_Guard_SupervisorSupportAssessmentType()
      parser.parseObjectNext()
      return Ore_Hold_Mining_Guard_Supervisor.SupportAssessment_Payload(value)
    }

    def parseOre_Hold_Mining_Guard_SupervisorGuardModeType(): Ore_Hold_Mining_Guard_Supervisor.GuardMode.Type = {
      val r = parseOre_Hold_Mining_Guard_SupervisorGuardModeT(F)
      return r
    }

    def parseOre_Hold_Mining_Guard_SupervisorGuardModeT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.GuardMode.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Ore_Hold_Mining_Guard_Supervisor.GuardMode")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Ore_Hold_Mining_Guard_Supervisor.GuardMode.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Ore_Hold_Mining_Guard_Supervisor.GuardMode.")
          return Ore_Hold_Mining_Guard_Supervisor.GuardMode.byOrdinal(0).get
      }
    }

    def parseOre_Hold_Mining_Guard_SupervisorGuardMode_Payload(): Ore_Hold_Mining_Guard_Supervisor.GuardMode_Payload = {
      val r = parseOre_Hold_Mining_Guard_SupervisorGuardMode_PayloadT(F)
      return r
    }

    def parseOre_Hold_Mining_Guard_SupervisorGuardMode_PayloadT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.GuardMode_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Ore_Hold_Mining_Guard_Supervisor.GuardMode_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseOre_Hold_Mining_Guard_SupervisorGuardModeType()
      parser.parseObjectNext()
      return Ore_Hold_Mining_Guard_Supervisor.GuardMode_Payload(value)
    }

    def parseOre_Hold_Mining_Guard_SupervisorResolutionReasonType(): Ore_Hold_Mining_Guard_Supervisor.ResolutionReason.Type = {
      val r = parseOre_Hold_Mining_Guard_SupervisorResolutionReasonT(F)
      return r
    }

    def parseOre_Hold_Mining_Guard_SupervisorResolutionReasonT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.ResolutionReason.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Ore_Hold_Mining_Guard_Supervisor.ResolutionReason")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Ore_Hold_Mining_Guard_Supervisor.ResolutionReason.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Ore_Hold_Mining_Guard_Supervisor.ResolutionReason.")
          return Ore_Hold_Mining_Guard_Supervisor.ResolutionReason.byOrdinal(0).get
      }
    }

    def parseOre_Hold_Mining_Guard_SupervisorResolutionReason_Payload(): Ore_Hold_Mining_Guard_Supervisor.ResolutionReason_Payload = {
      val r = parseOre_Hold_Mining_Guard_SupervisorResolutionReason_PayloadT(F)
      return r
    }

    def parseOre_Hold_Mining_Guard_SupervisorResolutionReason_PayloadT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.ResolutionReason_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Ore_Hold_Mining_Guard_Supervisor.ResolutionReason_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseOre_Hold_Mining_Guard_SupervisorResolutionReasonType()
      parser.parseObjectNext()
      return Ore_Hold_Mining_Guard_Supervisor.ResolutionReason_Payload(value)
    }

    def parseOre_Hold_Mining_Guard_SupervisorMiningCommandType(): Ore_Hold_Mining_Guard_Supervisor.MiningCommand.Type = {
      val r = parseOre_Hold_Mining_Guard_SupervisorMiningCommandT(F)
      return r
    }

    def parseOre_Hold_Mining_Guard_SupervisorMiningCommandT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.MiningCommand.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Ore_Hold_Mining_Guard_Supervisor.MiningCommand")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Ore_Hold_Mining_Guard_Supervisor.MiningCommand.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Ore_Hold_Mining_Guard_Supervisor.MiningCommand.")
          return Ore_Hold_Mining_Guard_Supervisor.MiningCommand.byOrdinal(0).get
      }
    }

    def parseOre_Hold_Mining_Guard_SupervisorMiningCommand_Payload(): Ore_Hold_Mining_Guard_Supervisor.MiningCommand_Payload = {
      val r = parseOre_Hold_Mining_Guard_SupervisorMiningCommand_PayloadT(F)
      return r
    }

    def parseOre_Hold_Mining_Guard_SupervisorMiningCommand_PayloadT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.MiningCommand_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Ore_Hold_Mining_Guard_Supervisor.MiningCommand_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseOre_Hold_Mining_Guard_SupervisorMiningCommandType()
      parser.parseObjectNext()
      return Ore_Hold_Mining_Guard_Supervisor.MiningCommand_Payload(value)
    }

    def parseOre_Hold_Mining_Guard_SupervisorGuardStatusType(): Ore_Hold_Mining_Guard_Supervisor.GuardStatus.Type = {
      val r = parseOre_Hold_Mining_Guard_SupervisorGuardStatusT(F)
      return r
    }

    def parseOre_Hold_Mining_Guard_SupervisorGuardStatusT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.GuardStatus.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Ore_Hold_Mining_Guard_Supervisor.GuardStatus")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Ore_Hold_Mining_Guard_Supervisor.GuardStatus.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Ore_Hold_Mining_Guard_Supervisor.GuardStatus.")
          return Ore_Hold_Mining_Guard_Supervisor.GuardStatus.byOrdinal(0).get
      }
    }

    def parseOre_Hold_Mining_Guard_SupervisorGuardStatus_Payload(): Ore_Hold_Mining_Guard_Supervisor.GuardStatus_Payload = {
      val r = parseOre_Hold_Mining_Guard_SupervisorGuardStatus_PayloadT(F)
      return r
    }

    def parseOre_Hold_Mining_Guard_SupervisorGuardStatus_PayloadT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.GuardStatus_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Ore_Hold_Mining_Guard_Supervisor.GuardStatus_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseOre_Hold_Mining_Guard_SupervisorGuardStatusType()
      parser.parseObjectNext()
      return Ore_Hold_Mining_Guard_Supervisor.GuardStatus_Payload(value)
    }

    def parseOre_Hold_Mining_Guard_SupervisorOffloadReadinessType(): Ore_Hold_Mining_Guard_Supervisor.OffloadReadiness.Type = {
      val r = parseOre_Hold_Mining_Guard_SupervisorOffloadReadinessT(F)
      return r
    }

    def parseOre_Hold_Mining_Guard_SupervisorOffloadReadinessT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.OffloadReadiness.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Ore_Hold_Mining_Guard_Supervisor.OffloadReadiness")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Ore_Hold_Mining_Guard_Supervisor.OffloadReadiness.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Ore_Hold_Mining_Guard_Supervisor.OffloadReadiness.")
          return Ore_Hold_Mining_Guard_Supervisor.OffloadReadiness.byOrdinal(0).get
      }
    }

    def parseOre_Hold_Mining_Guard_SupervisorOffloadReadiness_Payload(): Ore_Hold_Mining_Guard_Supervisor.OffloadReadiness_Payload = {
      val r = parseOre_Hold_Mining_Guard_SupervisorOffloadReadiness_PayloadT(F)
      return r
    }

    def parseOre_Hold_Mining_Guard_SupervisorOffloadReadiness_PayloadT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.OffloadReadiness_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Ore_Hold_Mining_Guard_Supervisor.OffloadReadiness_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseOre_Hold_Mining_Guard_SupervisorOffloadReadinessType()
      parser.parseObjectNext()
      return Ore_Hold_Mining_Guard_Supervisor.OffloadReadiness_Payload(value)
    }

    def parseOre_Hold_Mining_Guard_SupervisorPilotRequestSample(): Ore_Hold_Mining_Guard_Supervisor.PilotRequestSample = {
      val r = parseOre_Hold_Mining_Guard_SupervisorPilotRequestSampleT(F)
      return r
    }

    def parseOre_Hold_Mining_Guard_SupervisorPilotRequestSampleT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.PilotRequestSample = {
      if (!typeParsed) {
        parser.parseObjectType("Ore_Hold_Mining_Guard_Supervisor.PilotRequestSample")
      }
      parser.parseObjectKey("start")
      val start = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("halt_request")
      val halt_request = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("resume")
      val resume = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("status")
      val status = parseOre_Hold_Mining_Guard_SupervisorInputStatusType()
      parser.parseObjectNext()
      return Ore_Hold_Mining_Guard_Supervisor.PilotRequestSample(start, halt_request, resume, status)
    }

    def parseOre_Hold_Mining_Guard_SupervisorPilotRequestSample_Payload(): Ore_Hold_Mining_Guard_Supervisor.PilotRequestSample_Payload = {
      val r = parseOre_Hold_Mining_Guard_SupervisorPilotRequestSample_PayloadT(F)
      return r
    }

    def parseOre_Hold_Mining_Guard_SupervisorPilotRequestSample_PayloadT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.PilotRequestSample_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Ore_Hold_Mining_Guard_Supervisor.PilotRequestSample_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseOre_Hold_Mining_Guard_SupervisorPilotRequestSample()
      parser.parseObjectNext()
      return Ore_Hold_Mining_Guard_Supervisor.PilotRequestSample_Payload(value)
    }

    def parseOre_Hold_Mining_Guard_SupervisorRequestAssessment(): Ore_Hold_Mining_Guard_Supervisor.RequestAssessment = {
      val r = parseOre_Hold_Mining_Guard_SupervisorRequestAssessmentT(F)
      return r
    }

    def parseOre_Hold_Mining_Guard_SupervisorRequestAssessmentT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.RequestAssessment = {
      if (!typeParsed) {
        parser.parseObjectType("Ore_Hold_Mining_Guard_Supervisor.RequestAssessment")
      }
      parser.parseObjectKey("disposition")
      val disposition = parseOre_Hold_Mining_Guard_SupervisorRequestDispositionType()
      parser.parseObjectNext()
      parser.parseObjectKey("conflict")
      val conflict = parser.parseB()
      parser.parseObjectNext()
      return Ore_Hold_Mining_Guard_Supervisor.RequestAssessment(disposition, conflict)
    }

    def parseOre_Hold_Mining_Guard_SupervisorRequestAssessment_Payload(): Ore_Hold_Mining_Guard_Supervisor.RequestAssessment_Payload = {
      val r = parseOre_Hold_Mining_Guard_SupervisorRequestAssessment_PayloadT(F)
      return r
    }

    def parseOre_Hold_Mining_Guard_SupervisorRequestAssessment_PayloadT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.RequestAssessment_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Ore_Hold_Mining_Guard_Supervisor.RequestAssessment_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseOre_Hold_Mining_Guard_SupervisorRequestAssessment()
      parser.parseObjectNext()
      return Ore_Hold_Mining_Guard_Supervisor.RequestAssessment_Payload(value)
    }

    def parseOre_Hold_Mining_Guard_SupervisorHoldSample(): Ore_Hold_Mining_Guard_Supervisor.HoldSample = {
      val r = parseOre_Hold_Mining_Guard_SupervisorHoldSampleT(F)
      return r
    }

    def parseOre_Hold_Mining_Guard_SupervisorHoldSampleT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.HoldSample = {
      if (!typeParsed) {
        parser.parseObjectType("Ore_Hold_Mining_Guard_Supervisor.HoldSample")
      }
      parser.parseObjectKey("observation")
      val observation = parseOre_Hold_Mining_Guard_SupervisorHoldObservationType()
      parser.parseObjectNext()
      parser.parseObjectKey("status")
      val status = parseOre_Hold_Mining_Guard_SupervisorInputStatusType()
      parser.parseObjectNext()
      return Ore_Hold_Mining_Guard_Supervisor.HoldSample(observation, status)
    }

    def parseOre_Hold_Mining_Guard_SupervisorHoldSample_Payload(): Ore_Hold_Mining_Guard_Supervisor.HoldSample_Payload = {
      val r = parseOre_Hold_Mining_Guard_SupervisorHoldSample_PayloadT(F)
      return r
    }

    def parseOre_Hold_Mining_Guard_SupervisorHoldSample_PayloadT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.HoldSample_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Ore_Hold_Mining_Guard_Supervisor.HoldSample_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseOre_Hold_Mining_Guard_SupervisorHoldSample()
      parser.parseObjectNext()
      return Ore_Hold_Mining_Guard_Supervisor.HoldSample_Payload(value)
    }

    def parseOre_Hold_Mining_Guard_SupervisorMiningSupportSample(): Ore_Hold_Mining_Guard_Supervisor.MiningSupportSample = {
      val r = parseOre_Hold_Mining_Guard_SupervisorMiningSupportSampleT(F)
      return r
    }

    def parseOre_Hold_Mining_Guard_SupervisorMiningSupportSampleT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.MiningSupportSample = {
      if (!typeParsed) {
        parser.parseObjectType("Ore_Hold_Mining_Guard_Supervisor.MiningSupportSample")
      }
      parser.parseObjectKey("asteroid")
      val asteroid = parseOre_Hold_Mining_Guard_SupervisorAsteroidConditionType()
      parser.parseObjectNext()
      parser.parseObjectKey("laser")
      val laser = parseOre_Hold_Mining_Guard_SupervisorLaserConditionType()
      parser.parseObjectNext()
      parser.parseObjectKey("target")
      val target = parseOre_Hold_Mining_Guard_SupervisorTargetConditionType()
      parser.parseObjectNext()
      parser.parseObjectKey("status")
      val status = parseOre_Hold_Mining_Guard_SupervisorInputStatusType()
      parser.parseObjectNext()
      return Ore_Hold_Mining_Guard_Supervisor.MiningSupportSample(asteroid, laser, target, status)
    }

    def parseOre_Hold_Mining_Guard_SupervisorMiningSupportSample_Payload(): Ore_Hold_Mining_Guard_Supervisor.MiningSupportSample_Payload = {
      val r = parseOre_Hold_Mining_Guard_SupervisorMiningSupportSample_PayloadT(F)
      return r
    }

    def parseOre_Hold_Mining_Guard_SupervisorMiningSupportSample_PayloadT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.MiningSupportSample_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Ore_Hold_Mining_Guard_Supervisor.MiningSupportSample_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseOre_Hold_Mining_Guard_SupervisorMiningSupportSample()
      parser.parseObjectNext()
      return Ore_Hold_Mining_Guard_Supervisor.MiningSupportSample_Payload(value)
    }

    def parseOre_Hold_Mining_Guard_SupervisorGuardResolution(): Ore_Hold_Mining_Guard_Supervisor.GuardResolution = {
      val r = parseOre_Hold_Mining_Guard_SupervisorGuardResolutionT(F)
      return r
    }

    def parseOre_Hold_Mining_Guard_SupervisorGuardResolutionT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.GuardResolution = {
      if (!typeParsed) {
        parser.parseObjectType("Ore_Hold_Mining_Guard_Supervisor.GuardResolution")
      }
      parser.parseObjectKey("nextMode")
      val nextMode = parseOre_Hold_Mining_Guard_SupervisorGuardModeType()
      parser.parseObjectNext()
      parser.parseObjectKey("reason")
      val reason = parseOre_Hold_Mining_Guard_SupervisorResolutionReasonType()
      parser.parseObjectNext()
      parser.parseObjectKey("requestConflict")
      val requestConflict = parser.parseB()
      parser.parseObjectNext()
      return Ore_Hold_Mining_Guard_Supervisor.GuardResolution(nextMode, reason, requestConflict)
    }

    def parseOre_Hold_Mining_Guard_SupervisorGuardResolution_Payload(): Ore_Hold_Mining_Guard_Supervisor.GuardResolution_Payload = {
      val r = parseOre_Hold_Mining_Guard_SupervisorGuardResolution_PayloadT(F)
      return r
    }

    def parseOre_Hold_Mining_Guard_SupervisorGuardResolution_PayloadT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.GuardResolution_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Ore_Hold_Mining_Guard_Supervisor.GuardResolution_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseOre_Hold_Mining_Guard_SupervisorGuardResolution()
      parser.parseObjectNext()
      return Ore_Hold_Mining_Guard_Supervisor.GuardResolution_Payload(value)
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

    def parseOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container(): Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P", "Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS"))
      t.native match {
        case "Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P" => val r = parseOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PT(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS" => val r = parseOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PST(T); return r
        case _ => val r = parseOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PST(T); return r
      }
    }

    def parseOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P(): Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P = {
      val r = parseOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PT(F)
      return r
    }

    def parseOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P")
      }
      parser.parseObjectKey("api_pilot_request")
      val api_pilot_request = parseOre_Hold_Mining_Guard_SupervisorPilotRequestSample()
      parser.parseObjectNext()
      return Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P(api_pilot_request)
    }

    def parseOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS(): Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS = {
      val r = parseOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PST(F)
      return r
    }

    def parseOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PST(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_pilot_request")
      val api_pilot_request = parseOre_Hold_Mining_Guard_SupervisorPilotRequestSample()
      parser.parseObjectNext()
      return Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS(api_pilot_request)
    }

    def parseOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container(): Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P", "Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS"))
      t.native match {
        case "Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P" => val r = parseOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PT(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS" => val r = parseOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PST(T); return r
        case _ => val r = parseOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PST(T); return r
      }
    }

    def parseOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P(): Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P = {
      val r = parseOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PT(F)
      return r
    }

    def parseOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P")
      }
      parser.parseObjectKey("api_request_assessment")
      val api_request_assessment = parseOre_Hold_Mining_Guard_SupervisorRequestAssessment()
      parser.parseObjectNext()
      return Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P(api_request_assessment)
    }

    def parseOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS(): Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS = {
      val r = parseOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PST(F)
      return r
    }

    def parseOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PST(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_request_assessment")
      val api_request_assessment = parseOre_Hold_Mining_Guard_SupervisorRequestAssessment()
      parser.parseObjectNext()
      return Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS(api_request_assessment)
    }

    def parseOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container(): Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P", "Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS"))
      t.native match {
        case "Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P" => val r = parseOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PT(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS" => val r = parseOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PST(T); return r
        case _ => val r = parseOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PST(T); return r
      }
    }

    def parseOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P(): Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P = {
      val r = parseOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PT(F)
      return r
    }

    def parseOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P")
      }
      parser.parseObjectKey("api_hold_sample")
      val api_hold_sample = parseOre_Hold_Mining_Guard_SupervisorHoldSample()
      parser.parseObjectNext()
      return Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P(api_hold_sample)
    }

    def parseOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS(): Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS = {
      val r = parseOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PST(F)
      return r
    }

    def parseOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PST(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_hold_sample")
      val api_hold_sample = parseOre_Hold_Mining_Guard_SupervisorHoldSample()
      parser.parseObjectNext()
      return Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS(api_hold_sample)
    }

    def parseOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container(): Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P", "Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS"))
      t.native match {
        case "Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P" => val r = parseOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PT(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS" => val r = parseOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PST(T); return r
        case _ => val r = parseOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PST(T); return r
      }
    }

    def parseOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P(): Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P = {
      val r = parseOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PT(F)
      return r
    }

    def parseOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P")
      }
      parser.parseObjectKey("api_hold_assessment")
      val api_hold_assessment = parseOre_Hold_Mining_Guard_SupervisorHoldAssessmentType()
      parser.parseObjectNext()
      return Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P(api_hold_assessment)
    }

    def parseOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS(): Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS = {
      val r = parseOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PST(F)
      return r
    }

    def parseOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PST(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_hold_assessment")
      val api_hold_assessment = parseOre_Hold_Mining_Guard_SupervisorHoldAssessmentType()
      parser.parseObjectNext()
      return Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS(api_hold_assessment)
    }

    def parseOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container(): Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P", "Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS"))
      t.native match {
        case "Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P" => val r = parseOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PT(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS" => val r = parseOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PST(T); return r
        case _ => val r = parseOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PST(T); return r
      }
    }

    def parseOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P(): Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P = {
      val r = parseOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PT(F)
      return r
    }

    def parseOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P")
      }
      parser.parseObjectKey("api_mining_support")
      val api_mining_support = parseOre_Hold_Mining_Guard_SupervisorMiningSupportSample()
      parser.parseObjectNext()
      return Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P(api_mining_support)
    }

    def parseOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS(): Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS = {
      val r = parseOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PST(F)
      return r
    }

    def parseOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PST(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_mining_support")
      val api_mining_support = parseOre_Hold_Mining_Guard_SupervisorMiningSupportSample()
      parser.parseObjectNext()
      return Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS(api_mining_support)
    }

    def parseOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container(): Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P", "Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS"))
      t.native match {
        case "Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P" => val r = parseOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PT(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS" => val r = parseOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PST(T); return r
        case _ => val r = parseOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PST(T); return r
      }
    }

    def parseOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P(): Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P = {
      val r = parseOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PT(F)
      return r
    }

    def parseOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P")
      }
      parser.parseObjectKey("api_support_assessment")
      val api_support_assessment = parseOre_Hold_Mining_Guard_SupervisorSupportAssessmentType()
      parser.parseObjectNext()
      return Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P(api_support_assessment)
    }

    def parseOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS(): Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS = {
      val r = parseOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PST(F)
      return r
    }

    def parseOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PST(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_support_assessment")
      val api_support_assessment = parseOre_Hold_Mining_Guard_SupervisorSupportAssessmentType()
      parser.parseObjectNext()
      return Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS(api_support_assessment)
    }

    def parseOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container(): Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P", "Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS"))
      t.native match {
        case "Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P" => val r = parseOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PT(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS" => val r = parseOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PST(T); return r
        case _ => val r = parseOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PST(T); return r
      }
    }

    def parseOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P(): Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P = {
      val r = parseOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PT(F)
      return r
    }

    def parseOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P")
      }
      parser.parseObjectKey("api_hold_assessment")
      val api_hold_assessment = parseOre_Hold_Mining_Guard_SupervisorHoldAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_request_assessment")
      val api_request_assessment = parseOre_Hold_Mining_Guard_SupervisorRequestAssessment()
      parser.parseObjectNext()
      parser.parseObjectKey("api_support_assessment")
      val api_support_assessment = parseOre_Hold_Mining_Guard_SupervisorSupportAssessmentType()
      parser.parseObjectNext()
      return Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P(api_hold_assessment, api_request_assessment, api_support_assessment)
    }

    def parseOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS(): Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS = {
      val r = parseOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PST(F)
      return r
    }

    def parseOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PST(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_hold_assessment")
      val api_hold_assessment = parseOre_Hold_Mining_Guard_SupervisorHoldAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_request_assessment")
      val api_request_assessment = parseOre_Hold_Mining_Guard_SupervisorRequestAssessment()
      parser.parseObjectNext()
      parser.parseObjectKey("api_support_assessment")
      val api_support_assessment = parseOre_Hold_Mining_Guard_SupervisorSupportAssessmentType()
      parser.parseObjectNext()
      return Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS(api_hold_assessment, api_request_assessment, api_support_assessment)
    }

    def parseOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container(): Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P", "Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS"))
      t.native match {
        case "Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P" => val r = parseOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PT(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS" => val r = parseOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PST(T); return r
        case _ => val r = parseOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PST(T); return r
      }
    }

    def parseOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P(): Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P = {
      val r = parseOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PT(F)
      return r
    }

    def parseOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P")
      }
      parser.parseObjectKey("api_resolution_to_command")
      val api_resolution_to_command = parseOre_Hold_Mining_Guard_SupervisorGuardResolution()
      parser.parseObjectNext()
      parser.parseObjectKey("api_resolution_to_reporting")
      val api_resolution_to_reporting = parseOre_Hold_Mining_Guard_SupervisorGuardResolution()
      parser.parseObjectNext()
      return Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P(api_resolution_to_command, api_resolution_to_reporting)
    }

    def parseOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS(): Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS = {
      val r = parseOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PST(F)
      return r
    }

    def parseOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PST(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_resolution_to_command")
      val api_resolution_to_command = parseOre_Hold_Mining_Guard_SupervisorGuardResolution()
      parser.parseObjectNext()
      parser.parseObjectKey("api_resolution_to_reporting")
      val api_resolution_to_reporting = parseOre_Hold_Mining_Guard_SupervisorGuardResolution()
      parser.parseObjectNext()
      return Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS(api_resolution_to_command, api_resolution_to_reporting)
    }

    def parseOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container(): Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P", "Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS"))
      t.native match {
        case "Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P" => val r = parseOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PT(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS" => val r = parseOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PST(T); return r
        case _ => val r = parseOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PST(T); return r
      }
    }

    def parseOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P(): Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P = {
      val r = parseOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PT(F)
      return r
    }

    def parseOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P")
      }
      parser.parseObjectKey("api_guard_resolution")
      val api_guard_resolution = parseOre_Hold_Mining_Guard_SupervisorGuardResolution()
      parser.parseObjectNext()
      return Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P(api_guard_resolution)
    }

    def parseOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS(): Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS = {
      val r = parseOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PST(F)
      return r
    }

    def parseOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PST(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_guard_resolution")
      val api_guard_resolution = parseOre_Hold_Mining_Guard_SupervisorGuardResolution()
      parser.parseObjectNext()
      return Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS(api_guard_resolution)
    }

    def parseOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container(): Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P", "Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS"))
      t.native match {
        case "Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P" => val r = parseOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PT(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS" => val r = parseOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PST(T); return r
        case _ => val r = parseOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PST(T); return r
      }
    }

    def parseOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P(): Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P = {
      val r = parseOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PT(F)
      return r
    }

    def parseOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P")
      }
      parser.parseObjectKey("api_mining_command")
      val api_mining_command = parseOre_Hold_Mining_Guard_SupervisorMiningCommandType()
      parser.parseObjectNext()
      return Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P(api_mining_command)
    }

    def parseOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS(): Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS = {
      val r = parseOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PST(F)
      return r
    }

    def parseOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PST(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_mining_command")
      val api_mining_command = parseOre_Hold_Mining_Guard_SupervisorMiningCommandType()
      parser.parseObjectNext()
      return Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS(api_mining_command)
    }

    def parseOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container(): Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P", "Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS"))
      t.native match {
        case "Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P" => val r = parseOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PT(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS" => val r = parseOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PST(T); return r
        case _ => val r = parseOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PST(T); return r
      }
    }

    def parseOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P(): Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P = {
      val r = parseOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PT(F)
      return r
    }

    def parseOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P")
      }
      parser.parseObjectKey("api_guard_resolution")
      val api_guard_resolution = parseOre_Hold_Mining_Guard_SupervisorGuardResolution()
      parser.parseObjectNext()
      return Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P(api_guard_resolution)
    }

    def parseOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS(): Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS = {
      val r = parseOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PST(F)
      return r
    }

    def parseOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PST(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_guard_resolution")
      val api_guard_resolution = parseOre_Hold_Mining_Guard_SupervisorGuardResolution()
      parser.parseObjectNext()
      return Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS(api_guard_resolution)
    }

    def parseOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container(): Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P", "Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS"))
      t.native match {
        case "Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P" => val r = parseOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PT(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS" => val r = parseOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PST(T); return r
        case _ => val r = parseOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PST(T); return r
      }
    }

    def parseOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P(): Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P = {
      val r = parseOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PT(F)
      return r
    }

    def parseOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PT(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P")
      }
      parser.parseObjectKey("api_guard_status")
      val api_guard_status = parseOre_Hold_Mining_Guard_SupervisorGuardStatusType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_offload_readiness")
      val api_offload_readiness = parseOre_Hold_Mining_Guard_SupervisorOffloadReadinessType()
      parser.parseObjectNext()
      return Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P(api_guard_status, api_offload_readiness)
    }

    def parseOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS(): Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS = {
      val r = parseOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PST(F)
      return r
    }

    def parseOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PST(typeParsed: B): Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_guard_status")
      val api_guard_status = parseOre_Hold_Mining_Guard_SupervisorGuardStatusType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_offload_readiness")
      val api_offload_readiness = parseOre_Hold_Mining_Guard_SupervisorOffloadReadinessType()
      parser.parseObjectNext()
      return Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS(api_guard_status, api_offload_readiness)
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
      val t = parser.parseObjectTypes(ISZ("util.EmptyContainer", "Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P", "Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS", "Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P", "Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS", "Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P", "Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS", "Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P", "Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS", "Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P", "Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS", "Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P", "Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS", "Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P", "Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P", "Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS", "Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS", "Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P", "Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P", "Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS", "Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS", "Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P", "Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS", "Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P", "Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS"))
      t.native match {
        case "util.EmptyContainer" => val r = parseutilEmptyContainerT(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P" => val r = parseOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PT(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS" => val r = parseOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PST(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P" => val r = parseOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PT(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS" => val r = parseOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PST(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P" => val r = parseOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PT(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS" => val r = parseOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PST(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P" => val r = parseOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PT(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS" => val r = parseOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PST(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P" => val r = parseOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PT(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS" => val r = parseOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PST(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P" => val r = parseOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PT(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS" => val r = parseOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PST(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P" => val r = parseOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PT(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P" => val r = parseOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PT(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS" => val r = parseOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PST(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS" => val r = parseOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PST(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P" => val r = parseOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PT(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P" => val r = parseOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PT(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS" => val r = parseOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PST(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS" => val r = parseOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PST(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P" => val r = parseOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PT(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS" => val r = parseOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PST(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P" => val r = parseOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PT(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS" => val r = parseOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PST(T); return r
        case _ => val r = parseOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PST(T); return r
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
      val t = parser.parseObjectTypes(ISZ("art.Empty", "Base_Types.Boolean_Payload", "Base_Types.Integer_Payload", "Base_Types.Integer_8_Payload", "Base_Types.Integer_16_Payload", "Base_Types.Integer_32_Payload", "Base_Types.Integer_64_Payload", "Base_Types.Unsigned_8_Payload", "Base_Types.Unsigned_16_Payload", "Base_Types.Unsigned_32_Payload", "Base_Types.Unsigned_64_Payload", "Base_Types.Float_Payload", "Base_Types.Float_32_Payload", "Base_Types.Float_64_Payload", "Base_Types.Character_Payload", "Base_Types.String_Payload", "Base_Types.Bits_Payload", "util.EmptyContainer", "Ore_Hold_Mining_Guard_Supervisor.GuardMode_Payload", "Ore_Hold_Mining_Guard_Supervisor.HoldSample_Payload", "Ore_Hold_Mining_Guard_Supervisor.InputStatus_Payload", "Ore_Hold_Mining_Guard_Supervisor.GuardStatus_Payload", "Ore_Hold_Mining_Guard_Supervisor.MiningCommand_Payload", "Ore_Hold_Mining_Guard_Supervisor.LaserCondition_Payload", "Ore_Hold_Mining_Guard_Supervisor.HoldAssessment_Payload", "Ore_Hold_Mining_Guard_Supervisor.TargetCondition_Payload", "Ore_Hold_Mining_Guard_Supervisor.HoldObservation_Payload", "Ore_Hold_Mining_Guard_Supervisor.GuardResolution_Payload", "Ore_Hold_Mining_Guard_Supervisor.OffloadReadiness_Payload", "Ore_Hold_Mining_Guard_Supervisor.ResolutionReason_Payload", "Ore_Hold_Mining_Guard_Supervisor.AsteroidCondition_Payload", "Ore_Hold_Mining_Guard_Supervisor.SupportAssessment_Payload", "Ore_Hold_Mining_Guard_Supervisor.RequestAssessment_Payload", "Ore_Hold_Mining_Guard_Supervisor.RequestDisposition_Payload", "Ore_Hold_Mining_Guard_Supervisor.PilotRequestSample_Payload", "Ore_Hold_Mining_Guard_Supervisor.MiningSupportSample_Payload", "Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P", "Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS", "Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P", "Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS", "Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P", "Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS", "Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P", "Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS", "Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P", "Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS", "Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P", "Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS", "Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P", "Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P", "Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS", "Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS", "Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P", "Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P", "Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS", "Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS", "Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P", "Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS", "Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P", "Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS"))
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
        case "Ore_Hold_Mining_Guard_Supervisor.GuardMode_Payload" => val r = parseOre_Hold_Mining_Guard_SupervisorGuardMode_PayloadT(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.HoldSample_Payload" => val r = parseOre_Hold_Mining_Guard_SupervisorHoldSample_PayloadT(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.InputStatus_Payload" => val r = parseOre_Hold_Mining_Guard_SupervisorInputStatus_PayloadT(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.GuardStatus_Payload" => val r = parseOre_Hold_Mining_Guard_SupervisorGuardStatus_PayloadT(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.MiningCommand_Payload" => val r = parseOre_Hold_Mining_Guard_SupervisorMiningCommand_PayloadT(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.LaserCondition_Payload" => val r = parseOre_Hold_Mining_Guard_SupervisorLaserCondition_PayloadT(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.HoldAssessment_Payload" => val r = parseOre_Hold_Mining_Guard_SupervisorHoldAssessment_PayloadT(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.TargetCondition_Payload" => val r = parseOre_Hold_Mining_Guard_SupervisorTargetCondition_PayloadT(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.HoldObservation_Payload" => val r = parseOre_Hold_Mining_Guard_SupervisorHoldObservation_PayloadT(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.GuardResolution_Payload" => val r = parseOre_Hold_Mining_Guard_SupervisorGuardResolution_PayloadT(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.OffloadReadiness_Payload" => val r = parseOre_Hold_Mining_Guard_SupervisorOffloadReadiness_PayloadT(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.ResolutionReason_Payload" => val r = parseOre_Hold_Mining_Guard_SupervisorResolutionReason_PayloadT(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.AsteroidCondition_Payload" => val r = parseOre_Hold_Mining_Guard_SupervisorAsteroidCondition_PayloadT(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.SupportAssessment_Payload" => val r = parseOre_Hold_Mining_Guard_SupervisorSupportAssessment_PayloadT(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.RequestAssessment_Payload" => val r = parseOre_Hold_Mining_Guard_SupervisorRequestAssessment_PayloadT(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.RequestDisposition_Payload" => val r = parseOre_Hold_Mining_Guard_SupervisorRequestDisposition_PayloadT(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.PilotRequestSample_Payload" => val r = parseOre_Hold_Mining_Guard_SupervisorPilotRequestSample_PayloadT(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.MiningSupportSample_Payload" => val r = parseOre_Hold_Mining_Guard_SupervisorMiningSupportSample_PayloadT(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P" => val r = parseOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PT(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS" => val r = parseOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PST(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P" => val r = parseOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PT(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS" => val r = parseOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PST(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P" => val r = parseOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PT(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS" => val r = parseOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PST(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P" => val r = parseOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PT(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS" => val r = parseOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PST(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P" => val r = parseOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PT(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS" => val r = parseOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PST(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P" => val r = parseOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PT(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS" => val r = parseOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PST(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P" => val r = parseOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PT(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P" => val r = parseOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PT(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS" => val r = parseOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PST(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS" => val r = parseOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PST(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P" => val r = parseOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PT(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P" => val r = parseOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PT(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS" => val r = parseOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PST(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS" => val r = parseOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PST(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P" => val r = parseOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PT(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS" => val r = parseOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PST(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P" => val r = parseOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PT(T); return r
        case "Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS" => val r = parseOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PST(T); return r
        case _ => val r = parseOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PST(T); return r
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

  def fromOre_Hold_Mining_Guard_SupervisorInputStatus_Payload(o: Ore_Hold_Mining_Guard_Supervisor.InputStatus_Payload, isCompact: B): String = {
    val st = Printer.printOre_Hold_Mining_Guard_SupervisorInputStatus_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOre_Hold_Mining_Guard_SupervisorInputStatus_Payload(s: String): Either[Ore_Hold_Mining_Guard_Supervisor.InputStatus_Payload, Json.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorInputStatus_Payload(parser: Parser): Ore_Hold_Mining_Guard_Supervisor.InputStatus_Payload = {
      val r = parser.parseOre_Hold_Mining_Guard_SupervisorInputStatus_Payload()
      return r
    }
    val r = to(s, fOre_Hold_Mining_Guard_SupervisorInputStatus_Payload _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorRequestDisposition_Payload(o: Ore_Hold_Mining_Guard_Supervisor.RequestDisposition_Payload, isCompact: B): String = {
    val st = Printer.printOre_Hold_Mining_Guard_SupervisorRequestDisposition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOre_Hold_Mining_Guard_SupervisorRequestDisposition_Payload(s: String): Either[Ore_Hold_Mining_Guard_Supervisor.RequestDisposition_Payload, Json.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorRequestDisposition_Payload(parser: Parser): Ore_Hold_Mining_Guard_Supervisor.RequestDisposition_Payload = {
      val r = parser.parseOre_Hold_Mining_Guard_SupervisorRequestDisposition_Payload()
      return r
    }
    val r = to(s, fOre_Hold_Mining_Guard_SupervisorRequestDisposition_Payload _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorHoldObservation_Payload(o: Ore_Hold_Mining_Guard_Supervisor.HoldObservation_Payload, isCompact: B): String = {
    val st = Printer.printOre_Hold_Mining_Guard_SupervisorHoldObservation_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOre_Hold_Mining_Guard_SupervisorHoldObservation_Payload(s: String): Either[Ore_Hold_Mining_Guard_Supervisor.HoldObservation_Payload, Json.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorHoldObservation_Payload(parser: Parser): Ore_Hold_Mining_Guard_Supervisor.HoldObservation_Payload = {
      val r = parser.parseOre_Hold_Mining_Guard_SupervisorHoldObservation_Payload()
      return r
    }
    val r = to(s, fOre_Hold_Mining_Guard_SupervisorHoldObservation_Payload _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorHoldAssessment_Payload(o: Ore_Hold_Mining_Guard_Supervisor.HoldAssessment_Payload, isCompact: B): String = {
    val st = Printer.printOre_Hold_Mining_Guard_SupervisorHoldAssessment_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOre_Hold_Mining_Guard_SupervisorHoldAssessment_Payload(s: String): Either[Ore_Hold_Mining_Guard_Supervisor.HoldAssessment_Payload, Json.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorHoldAssessment_Payload(parser: Parser): Ore_Hold_Mining_Guard_Supervisor.HoldAssessment_Payload = {
      val r = parser.parseOre_Hold_Mining_Guard_SupervisorHoldAssessment_Payload()
      return r
    }
    val r = to(s, fOre_Hold_Mining_Guard_SupervisorHoldAssessment_Payload _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorAsteroidCondition_Payload(o: Ore_Hold_Mining_Guard_Supervisor.AsteroidCondition_Payload, isCompact: B): String = {
    val st = Printer.printOre_Hold_Mining_Guard_SupervisorAsteroidCondition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOre_Hold_Mining_Guard_SupervisorAsteroidCondition_Payload(s: String): Either[Ore_Hold_Mining_Guard_Supervisor.AsteroidCondition_Payload, Json.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorAsteroidCondition_Payload(parser: Parser): Ore_Hold_Mining_Guard_Supervisor.AsteroidCondition_Payload = {
      val r = parser.parseOre_Hold_Mining_Guard_SupervisorAsteroidCondition_Payload()
      return r
    }
    val r = to(s, fOre_Hold_Mining_Guard_SupervisorAsteroidCondition_Payload _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorLaserCondition_Payload(o: Ore_Hold_Mining_Guard_Supervisor.LaserCondition_Payload, isCompact: B): String = {
    val st = Printer.printOre_Hold_Mining_Guard_SupervisorLaserCondition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOre_Hold_Mining_Guard_SupervisorLaserCondition_Payload(s: String): Either[Ore_Hold_Mining_Guard_Supervisor.LaserCondition_Payload, Json.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorLaserCondition_Payload(parser: Parser): Ore_Hold_Mining_Guard_Supervisor.LaserCondition_Payload = {
      val r = parser.parseOre_Hold_Mining_Guard_SupervisorLaserCondition_Payload()
      return r
    }
    val r = to(s, fOre_Hold_Mining_Guard_SupervisorLaserCondition_Payload _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorTargetCondition_Payload(o: Ore_Hold_Mining_Guard_Supervisor.TargetCondition_Payload, isCompact: B): String = {
    val st = Printer.printOre_Hold_Mining_Guard_SupervisorTargetCondition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOre_Hold_Mining_Guard_SupervisorTargetCondition_Payload(s: String): Either[Ore_Hold_Mining_Guard_Supervisor.TargetCondition_Payload, Json.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorTargetCondition_Payload(parser: Parser): Ore_Hold_Mining_Guard_Supervisor.TargetCondition_Payload = {
      val r = parser.parseOre_Hold_Mining_Guard_SupervisorTargetCondition_Payload()
      return r
    }
    val r = to(s, fOre_Hold_Mining_Guard_SupervisorTargetCondition_Payload _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorSupportAssessment_Payload(o: Ore_Hold_Mining_Guard_Supervisor.SupportAssessment_Payload, isCompact: B): String = {
    val st = Printer.printOre_Hold_Mining_Guard_SupervisorSupportAssessment_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOre_Hold_Mining_Guard_SupervisorSupportAssessment_Payload(s: String): Either[Ore_Hold_Mining_Guard_Supervisor.SupportAssessment_Payload, Json.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorSupportAssessment_Payload(parser: Parser): Ore_Hold_Mining_Guard_Supervisor.SupportAssessment_Payload = {
      val r = parser.parseOre_Hold_Mining_Guard_SupervisorSupportAssessment_Payload()
      return r
    }
    val r = to(s, fOre_Hold_Mining_Guard_SupervisorSupportAssessment_Payload _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorGuardMode_Payload(o: Ore_Hold_Mining_Guard_Supervisor.GuardMode_Payload, isCompact: B): String = {
    val st = Printer.printOre_Hold_Mining_Guard_SupervisorGuardMode_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOre_Hold_Mining_Guard_SupervisorGuardMode_Payload(s: String): Either[Ore_Hold_Mining_Guard_Supervisor.GuardMode_Payload, Json.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorGuardMode_Payload(parser: Parser): Ore_Hold_Mining_Guard_Supervisor.GuardMode_Payload = {
      val r = parser.parseOre_Hold_Mining_Guard_SupervisorGuardMode_Payload()
      return r
    }
    val r = to(s, fOre_Hold_Mining_Guard_SupervisorGuardMode_Payload _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorResolutionReason_Payload(o: Ore_Hold_Mining_Guard_Supervisor.ResolutionReason_Payload, isCompact: B): String = {
    val st = Printer.printOre_Hold_Mining_Guard_SupervisorResolutionReason_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOre_Hold_Mining_Guard_SupervisorResolutionReason_Payload(s: String): Either[Ore_Hold_Mining_Guard_Supervisor.ResolutionReason_Payload, Json.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorResolutionReason_Payload(parser: Parser): Ore_Hold_Mining_Guard_Supervisor.ResolutionReason_Payload = {
      val r = parser.parseOre_Hold_Mining_Guard_SupervisorResolutionReason_Payload()
      return r
    }
    val r = to(s, fOre_Hold_Mining_Guard_SupervisorResolutionReason_Payload _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorMiningCommand_Payload(o: Ore_Hold_Mining_Guard_Supervisor.MiningCommand_Payload, isCompact: B): String = {
    val st = Printer.printOre_Hold_Mining_Guard_SupervisorMiningCommand_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOre_Hold_Mining_Guard_SupervisorMiningCommand_Payload(s: String): Either[Ore_Hold_Mining_Guard_Supervisor.MiningCommand_Payload, Json.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorMiningCommand_Payload(parser: Parser): Ore_Hold_Mining_Guard_Supervisor.MiningCommand_Payload = {
      val r = parser.parseOre_Hold_Mining_Guard_SupervisorMiningCommand_Payload()
      return r
    }
    val r = to(s, fOre_Hold_Mining_Guard_SupervisorMiningCommand_Payload _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorGuardStatus_Payload(o: Ore_Hold_Mining_Guard_Supervisor.GuardStatus_Payload, isCompact: B): String = {
    val st = Printer.printOre_Hold_Mining_Guard_SupervisorGuardStatus_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOre_Hold_Mining_Guard_SupervisorGuardStatus_Payload(s: String): Either[Ore_Hold_Mining_Guard_Supervisor.GuardStatus_Payload, Json.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorGuardStatus_Payload(parser: Parser): Ore_Hold_Mining_Guard_Supervisor.GuardStatus_Payload = {
      val r = parser.parseOre_Hold_Mining_Guard_SupervisorGuardStatus_Payload()
      return r
    }
    val r = to(s, fOre_Hold_Mining_Guard_SupervisorGuardStatus_Payload _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorOffloadReadiness_Payload(o: Ore_Hold_Mining_Guard_Supervisor.OffloadReadiness_Payload, isCompact: B): String = {
    val st = Printer.printOre_Hold_Mining_Guard_SupervisorOffloadReadiness_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOre_Hold_Mining_Guard_SupervisorOffloadReadiness_Payload(s: String): Either[Ore_Hold_Mining_Guard_Supervisor.OffloadReadiness_Payload, Json.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorOffloadReadiness_Payload(parser: Parser): Ore_Hold_Mining_Guard_Supervisor.OffloadReadiness_Payload = {
      val r = parser.parseOre_Hold_Mining_Guard_SupervisorOffloadReadiness_Payload()
      return r
    }
    val r = to(s, fOre_Hold_Mining_Guard_SupervisorOffloadReadiness_Payload _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorPilotRequestSample(o: Ore_Hold_Mining_Guard_Supervisor.PilotRequestSample, isCompact: B): String = {
    val st = Printer.printOre_Hold_Mining_Guard_SupervisorPilotRequestSample(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOre_Hold_Mining_Guard_SupervisorPilotRequestSample(s: String): Either[Ore_Hold_Mining_Guard_Supervisor.PilotRequestSample, Json.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorPilotRequestSample(parser: Parser): Ore_Hold_Mining_Guard_Supervisor.PilotRequestSample = {
      val r = parser.parseOre_Hold_Mining_Guard_SupervisorPilotRequestSample()
      return r
    }
    val r = to(s, fOre_Hold_Mining_Guard_SupervisorPilotRequestSample _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorPilotRequestSample_Payload(o: Ore_Hold_Mining_Guard_Supervisor.PilotRequestSample_Payload, isCompact: B): String = {
    val st = Printer.printOre_Hold_Mining_Guard_SupervisorPilotRequestSample_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOre_Hold_Mining_Guard_SupervisorPilotRequestSample_Payload(s: String): Either[Ore_Hold_Mining_Guard_Supervisor.PilotRequestSample_Payload, Json.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorPilotRequestSample_Payload(parser: Parser): Ore_Hold_Mining_Guard_Supervisor.PilotRequestSample_Payload = {
      val r = parser.parseOre_Hold_Mining_Guard_SupervisorPilotRequestSample_Payload()
      return r
    }
    val r = to(s, fOre_Hold_Mining_Guard_SupervisorPilotRequestSample_Payload _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorRequestAssessment(o: Ore_Hold_Mining_Guard_Supervisor.RequestAssessment, isCompact: B): String = {
    val st = Printer.printOre_Hold_Mining_Guard_SupervisorRequestAssessment(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOre_Hold_Mining_Guard_SupervisorRequestAssessment(s: String): Either[Ore_Hold_Mining_Guard_Supervisor.RequestAssessment, Json.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorRequestAssessment(parser: Parser): Ore_Hold_Mining_Guard_Supervisor.RequestAssessment = {
      val r = parser.parseOre_Hold_Mining_Guard_SupervisorRequestAssessment()
      return r
    }
    val r = to(s, fOre_Hold_Mining_Guard_SupervisorRequestAssessment _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorRequestAssessment_Payload(o: Ore_Hold_Mining_Guard_Supervisor.RequestAssessment_Payload, isCompact: B): String = {
    val st = Printer.printOre_Hold_Mining_Guard_SupervisorRequestAssessment_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOre_Hold_Mining_Guard_SupervisorRequestAssessment_Payload(s: String): Either[Ore_Hold_Mining_Guard_Supervisor.RequestAssessment_Payload, Json.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorRequestAssessment_Payload(parser: Parser): Ore_Hold_Mining_Guard_Supervisor.RequestAssessment_Payload = {
      val r = parser.parseOre_Hold_Mining_Guard_SupervisorRequestAssessment_Payload()
      return r
    }
    val r = to(s, fOre_Hold_Mining_Guard_SupervisorRequestAssessment_Payload _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorHoldSample(o: Ore_Hold_Mining_Guard_Supervisor.HoldSample, isCompact: B): String = {
    val st = Printer.printOre_Hold_Mining_Guard_SupervisorHoldSample(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOre_Hold_Mining_Guard_SupervisorHoldSample(s: String): Either[Ore_Hold_Mining_Guard_Supervisor.HoldSample, Json.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorHoldSample(parser: Parser): Ore_Hold_Mining_Guard_Supervisor.HoldSample = {
      val r = parser.parseOre_Hold_Mining_Guard_SupervisorHoldSample()
      return r
    }
    val r = to(s, fOre_Hold_Mining_Guard_SupervisorHoldSample _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorHoldSample_Payload(o: Ore_Hold_Mining_Guard_Supervisor.HoldSample_Payload, isCompact: B): String = {
    val st = Printer.printOre_Hold_Mining_Guard_SupervisorHoldSample_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOre_Hold_Mining_Guard_SupervisorHoldSample_Payload(s: String): Either[Ore_Hold_Mining_Guard_Supervisor.HoldSample_Payload, Json.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorHoldSample_Payload(parser: Parser): Ore_Hold_Mining_Guard_Supervisor.HoldSample_Payload = {
      val r = parser.parseOre_Hold_Mining_Guard_SupervisorHoldSample_Payload()
      return r
    }
    val r = to(s, fOre_Hold_Mining_Guard_SupervisorHoldSample_Payload _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorMiningSupportSample(o: Ore_Hold_Mining_Guard_Supervisor.MiningSupportSample, isCompact: B): String = {
    val st = Printer.printOre_Hold_Mining_Guard_SupervisorMiningSupportSample(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOre_Hold_Mining_Guard_SupervisorMiningSupportSample(s: String): Either[Ore_Hold_Mining_Guard_Supervisor.MiningSupportSample, Json.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorMiningSupportSample(parser: Parser): Ore_Hold_Mining_Guard_Supervisor.MiningSupportSample = {
      val r = parser.parseOre_Hold_Mining_Guard_SupervisorMiningSupportSample()
      return r
    }
    val r = to(s, fOre_Hold_Mining_Guard_SupervisorMiningSupportSample _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorMiningSupportSample_Payload(o: Ore_Hold_Mining_Guard_Supervisor.MiningSupportSample_Payload, isCompact: B): String = {
    val st = Printer.printOre_Hold_Mining_Guard_SupervisorMiningSupportSample_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOre_Hold_Mining_Guard_SupervisorMiningSupportSample_Payload(s: String): Either[Ore_Hold_Mining_Guard_Supervisor.MiningSupportSample_Payload, Json.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorMiningSupportSample_Payload(parser: Parser): Ore_Hold_Mining_Guard_Supervisor.MiningSupportSample_Payload = {
      val r = parser.parseOre_Hold_Mining_Guard_SupervisorMiningSupportSample_Payload()
      return r
    }
    val r = to(s, fOre_Hold_Mining_Guard_SupervisorMiningSupportSample_Payload _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorGuardResolution(o: Ore_Hold_Mining_Guard_Supervisor.GuardResolution, isCompact: B): String = {
    val st = Printer.printOre_Hold_Mining_Guard_SupervisorGuardResolution(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOre_Hold_Mining_Guard_SupervisorGuardResolution(s: String): Either[Ore_Hold_Mining_Guard_Supervisor.GuardResolution, Json.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorGuardResolution(parser: Parser): Ore_Hold_Mining_Guard_Supervisor.GuardResolution = {
      val r = parser.parseOre_Hold_Mining_Guard_SupervisorGuardResolution()
      return r
    }
    val r = to(s, fOre_Hold_Mining_Guard_SupervisorGuardResolution _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorGuardResolution_Payload(o: Ore_Hold_Mining_Guard_Supervisor.GuardResolution_Payload, isCompact: B): String = {
    val st = Printer.printOre_Hold_Mining_Guard_SupervisorGuardResolution_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOre_Hold_Mining_Guard_SupervisorGuardResolution_Payload(s: String): Either[Ore_Hold_Mining_Guard_Supervisor.GuardResolution_Payload, Json.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorGuardResolution_Payload(parser: Parser): Ore_Hold_Mining_Guard_Supervisor.GuardResolution_Payload = {
      val r = parser.parseOre_Hold_Mining_Guard_SupervisorGuardResolution_Payload()
      return r
    }
    val r = to(s, fOre_Hold_Mining_Guard_SupervisorGuardResolution_Payload _)
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

  def fromOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container(o: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container, isCompact: B): String = {
    val st = Printer.printOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container(s: String): Either[Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container, Json.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container(parser: Parser): Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container = {
      val r = parser.parseOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container()
      return r
    }
    val r = to(s, fOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P(o: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P(s: String): Either[Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P, Json.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P(parser: Parser): Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P = {
      val r = parser.parseOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P()
      return r
    }
    val r = to(s, fOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS(o: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS(s: String): Either[Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS, Json.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS(parser: Parser): Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS = {
      val r = parser.parseOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS()
      return r
    }
    val r = to(s, fOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container(o: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container, isCompact: B): String = {
    val st = Printer.printOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container(s: String): Either[Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container, Json.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container(parser: Parser): Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container = {
      val r = parser.parseOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container()
      return r
    }
    val r = to(s, fOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P(o: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P(s: String): Either[Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P, Json.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P(parser: Parser): Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P = {
      val r = parser.parseOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P()
      return r
    }
    val r = to(s, fOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS(o: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS(s: String): Either[Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS, Json.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS(parser: Parser): Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS = {
      val r = parser.parseOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS()
      return r
    }
    val r = to(s, fOre_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container(o: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container, isCompact: B): String = {
    val st = Printer.printOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container(s: String): Either[Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container, Json.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container(parser: Parser): Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container = {
      val r = parser.parseOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container()
      return r
    }
    val r = to(s, fOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P(o: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P(s: String): Either[Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P, Json.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P(parser: Parser): Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P = {
      val r = parser.parseOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P()
      return r
    }
    val r = to(s, fOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS(o: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS(s: String): Either[Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS, Json.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS(parser: Parser): Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS = {
      val r = parser.parseOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS()
      return r
    }
    val r = to(s, fOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container(o: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container, isCompact: B): String = {
    val st = Printer.printOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container(s: String): Either[Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container, Json.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container(parser: Parser): Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container = {
      val r = parser.parseOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container()
      return r
    }
    val r = to(s, fOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P(o: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P(s: String): Either[Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P, Json.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P(parser: Parser): Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P = {
      val r = parser.parseOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P()
      return r
    }
    val r = to(s, fOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS(o: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS(s: String): Either[Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS, Json.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS(parser: Parser): Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS = {
      val r = parser.parseOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS()
      return r
    }
    val r = to(s, fOre_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container(o: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container, isCompact: B): String = {
    val st = Printer.printOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container(s: String): Either[Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container, Json.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container(parser: Parser): Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container = {
      val r = parser.parseOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container()
      return r
    }
    val r = to(s, fOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P(o: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P(s: String): Either[Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P, Json.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P(parser: Parser): Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P = {
      val r = parser.parseOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P()
      return r
    }
    val r = to(s, fOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS(o: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS(s: String): Either[Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS, Json.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS(parser: Parser): Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS = {
      val r = parser.parseOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS()
      return r
    }
    val r = to(s, fOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container(o: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container, isCompact: B): String = {
    val st = Printer.printOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container(s: String): Either[Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container, Json.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container(parser: Parser): Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container = {
      val r = parser.parseOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container()
      return r
    }
    val r = to(s, fOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P(o: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P(s: String): Either[Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P, Json.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P(parser: Parser): Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P = {
      val r = parser.parseOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P()
      return r
    }
    val r = to(s, fOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS(o: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS(s: String): Either[Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS, Json.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS(parser: Parser): Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS = {
      val r = parser.parseOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS()
      return r
    }
    val r = to(s, fOre_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container(o: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container, isCompact: B): String = {
    val st = Printer.printOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container(s: String): Either[Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container, Json.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container(parser: Parser): Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container = {
      val r = parser.parseOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container()
      return r
    }
    val r = to(s, fOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P(o: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P(s: String): Either[Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P, Json.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P(parser: Parser): Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P = {
      val r = parser.parseOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P()
      return r
    }
    val r = to(s, fOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS(o: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS(s: String): Either[Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS, Json.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS(parser: Parser): Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS = {
      val r = parser.parseOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS()
      return r
    }
    val r = to(s, fOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container(o: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container, isCompact: B): String = {
    val st = Printer.printOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container(s: String): Either[Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container, Json.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container(parser: Parser): Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container = {
      val r = parser.parseOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container()
      return r
    }
    val r = to(s, fOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P(o: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P(s: String): Either[Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P, Json.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P(parser: Parser): Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P = {
      val r = parser.parseOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P()
      return r
    }
    val r = to(s, fOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS(o: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS(s: String): Either[Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS, Json.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS(parser: Parser): Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS = {
      val r = parser.parseOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS()
      return r
    }
    val r = to(s, fOre_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container(o: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container, isCompact: B): String = {
    val st = Printer.printOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container(s: String): Either[Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container, Json.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container(parser: Parser): Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container = {
      val r = parser.parseOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container()
      return r
    }
    val r = to(s, fOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P(o: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P(s: String): Either[Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P, Json.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P(parser: Parser): Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P = {
      val r = parser.parseOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P()
      return r
    }
    val r = to(s, fOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS(o: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS(s: String): Either[Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS, Json.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS(parser: Parser): Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS = {
      val r = parser.parseOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS()
      return r
    }
    val r = to(s, fOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container(o: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container, isCompact: B): String = {
    val st = Printer.printOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container(s: String): Either[Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container, Json.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container(parser: Parser): Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container = {
      val r = parser.parseOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container()
      return r
    }
    val r = to(s, fOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P(o: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P(s: String): Either[Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P, Json.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P(parser: Parser): Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P = {
      val r = parser.parseOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P()
      return r
    }
    val r = to(s, fOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS(o: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS(s: String): Either[Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS, Json.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS(parser: Parser): Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS = {
      val r = parser.parseOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS()
      return r
    }
    val r = to(s, fOre_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container(o: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container, isCompact: B): String = {
    val st = Printer.printOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container(s: String): Either[Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container, Json.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container(parser: Parser): Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container = {
      val r = parser.parseOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container()
      return r
    }
    val r = to(s, fOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P(o: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P(s: String): Either[Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P, Json.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P(parser: Parser): Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P = {
      val r = parser.parseOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P()
      return r
    }
    val r = to(s, fOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS(o: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS(s: String): Either[Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS, Json.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS(parser: Parser): Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS = {
      val r = parser.parseOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS()
      return r
    }
    val r = to(s, fOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container(o: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container, isCompact: B): String = {
    val st = Printer.printOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container(s: String): Either[Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container, Json.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container(parser: Parser): Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container = {
      val r = parser.parseOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container()
      return r
    }
    val r = to(s, fOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P(o: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P(s: String): Either[Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P, Json.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P(parser: Parser): Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P = {
      val r = parser.parseOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P()
      return r
    }
    val r = to(s, fOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P _)
    return r
  }

  def fromOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS(o: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS(s: String): Either[Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS, Json.ErrorMsg] = {
    def fOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS(parser: Parser): Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS = {
      val r = parser.parseOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS()
      return r
    }
    val r = to(s, fOre_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS _)
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