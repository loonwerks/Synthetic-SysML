// #Sireum

package power_propulsion_availability_supervisor

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

BatteryQuality.scala

EvidenceValidity.scala

EvidenceFreshness.scala

AdmissionResult.scala

BatteryAssessment.scala

PowerCondition.scala

PowerAssessment.scala

EnginePositionOneCondition.scala

EnginePositionTwoCondition.scala

EnginePairAssessment.scala

EngineCount.scala

AlternatingKinds.scala

ConfigurationAssessment.scala

PropulsionAssessment.scala

ChargerCoupling.scala

ChargingAssessment.scala

ControlEvent.scala

ActuationFeedback.scala

PriorityDirective.scala

DemandPhase.scala

RequestContextEvent.scala

FaultStatus.scala

FaultCause.scala

SummaryDirective.scala

RecoveryPhase.scala

RecoveryGate.scala

AvailabilityValue.scala

AvailabilityCause.scala

ReportAvailabilityValue.scala

ReportAvailabilityCause.scala

ReportDemandPhase.scala

ReportRecoveryPhase.scala

PowerCommand.scala

BatteryObservation.scala

QualifiedBatteryObservation.scala

PowerEvidence.scala

EnginePairEvidence.scala

ConfigurationEvidence.scala

ChargerEvidence.scala

RequestContext.scala

FaultActionSummary.scala

RecoveryFrame.scala

AvailabilityDecision.scala

AvailabilityReport.scala

Base_Types.scala

BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_Containers.scala

BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_Containers.scala

PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_Containers.scala

OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_Containers.scala

EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_Containers.scala

FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_Containers.scala

PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_Containers.scala

ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_Containers.scala

EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_Containers.scala

FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_Containers.scala

RecoveryQualificationOwner_supervisor_process_recovery_qualification_Containers.scala

AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_Containers.scala

PowerCommandInterlockOwner_supervisor_process_power_command_interlock_Containers.scala

ObservationKind.scala

Container.scala

DataContent.scala

Aux_Types.scala

*/

@record class Gen_String(param: RandomLibI) extends MJen[String] {
  override def generate(f: String => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextString())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Z(param: RandomLibI) extends MJen[Z] {
  override def generate(f: Z => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextZ())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_B(param: RandomLibI) extends MJen[B] {
  override def generate(f: B => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextB())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_C(param: RandomLibI) extends MJen[C] {
  override def generate(f: C => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextC())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_R(param: RandomLibI) extends MJen[R] {
  override def generate(f: R => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextR())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_F32(param: RandomLibI) extends MJen[F32] {
  override def generate(f: F32 => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextF32())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_F64(param: RandomLibI) extends MJen[F64] {
  override def generate(f: F64 => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextF64())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_S8(param: RandomLibI) extends MJen[S8] {
  override def generate(f: S8 => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextS8())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_S16(param: RandomLibI) extends MJen[S16] {
  override def generate(f: S16 => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextS16())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_S32(param: RandomLibI) extends MJen[S32] {
  override def generate(f: S32 => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextS32())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_S64(param: RandomLibI) extends MJen[S64] {
  override def generate(f: S64 => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextS64())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_U8(param: RandomLibI) extends MJen[U8] {
  override def generate(f: U8 => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextU8())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_U16(param: RandomLibI) extends MJen[U16] {
  override def generate(f: U16 => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextU16())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_U32(param: RandomLibI) extends MJen[U32] {
  override def generate(f: U32 => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextU32())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_U64(param: RandomLibI) extends MJen[U64] {
  override def generate(f: U64 => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextU64())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}


@record class Gen__artDataContent(param: RandomLibI) extends MJen[art.DataContent] {
  override def generate(f: art.DataContent => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.next_artDataContent())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen__artEmpty(param: RandomLibI) extends MJen[art.Empty] {
  override def generate(f: art.Empty => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.next_artEmpty())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesBoolean_Payload(param: RandomLibI) extends MJen[Base_Types.Boolean_Payload] {
  override def generate(f: Base_Types.Boolean_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesBoolean_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesInteger_Payload(param: RandomLibI) extends MJen[Base_Types.Integer_Payload] {
  override def generate(f: Base_Types.Integer_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesInteger_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesInteger_8_Payload(param: RandomLibI) extends MJen[Base_Types.Integer_8_Payload] {
  override def generate(f: Base_Types.Integer_8_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesInteger_8_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesInteger_16_Payload(param: RandomLibI) extends MJen[Base_Types.Integer_16_Payload] {
  override def generate(f: Base_Types.Integer_16_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesInteger_16_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesInteger_32_Payload(param: RandomLibI) extends MJen[Base_Types.Integer_32_Payload] {
  override def generate(f: Base_Types.Integer_32_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesInteger_32_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesInteger_64_Payload(param: RandomLibI) extends MJen[Base_Types.Integer_64_Payload] {
  override def generate(f: Base_Types.Integer_64_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesInteger_64_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesUnsigned_8_Payload(param: RandomLibI) extends MJen[Base_Types.Unsigned_8_Payload] {
  override def generate(f: Base_Types.Unsigned_8_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesUnsigned_8_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesUnsigned_16_Payload(param: RandomLibI) extends MJen[Base_Types.Unsigned_16_Payload] {
  override def generate(f: Base_Types.Unsigned_16_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesUnsigned_16_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesUnsigned_32_Payload(param: RandomLibI) extends MJen[Base_Types.Unsigned_32_Payload] {
  override def generate(f: Base_Types.Unsigned_32_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesUnsigned_32_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesUnsigned_64_Payload(param: RandomLibI) extends MJen[Base_Types.Unsigned_64_Payload] {
  override def generate(f: Base_Types.Unsigned_64_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesUnsigned_64_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesFloat_Payload(param: RandomLibI) extends MJen[Base_Types.Float_Payload] {
  override def generate(f: Base_Types.Float_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesFloat_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesFloat_32_Payload(param: RandomLibI) extends MJen[Base_Types.Float_32_Payload] {
  override def generate(f: Base_Types.Float_32_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesFloat_32_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesFloat_64_Payload(param: RandomLibI) extends MJen[Base_Types.Float_64_Payload] {
  override def generate(f: Base_Types.Float_64_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesFloat_64_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesCharacter_Payload(param: RandomLibI) extends MJen[Base_Types.Character_Payload] {
  override def generate(f: Base_Types.Character_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesCharacter_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesString_Payload(param: RandomLibI) extends MJen[Base_Types.String_Payload] {
  override def generate(f: Base_Types.String_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesString_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_ISZB(param: RandomLibI) extends MJen[ISZ[B]] {
  override def generate(f: ISZ[B] => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextISZB())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesBits_Payload(param: RandomLibI) extends MJen[Base_Types.Bits_Payload] {
  override def generate(f: Base_Types.Bits_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesBits_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorActuationFeedbackType(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.ActuationFeedback.Type] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.ActuationFeedback.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorActuationFeedbackType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorActuationFeedback_Payload(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.ActuationFeedback_Payload] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.ActuationFeedback_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorActuationFeedback_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorAdmissionResultType(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.AdmissionResult.Type] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.AdmissionResult.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorAdmissionResultType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorAdmissionResult_Payload(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.AdmissionResult_Payload] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.AdmissionResult_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorAdmissionResult_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorAlternatingKindsType(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.AlternatingKinds.Type] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.AlternatingKinds.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorAlternatingKindsType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorAlternatingKinds_Payload(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.AlternatingKinds_Payload] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.AlternatingKinds_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorAlternatingKinds_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorAvailabilityCauseType(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.AvailabilityCause.Type] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.AvailabilityCause.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorAvailabilityCauseType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorAvailabilityCause_Payload(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.AvailabilityCause_Payload] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.AvailabilityCause_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorAvailabilityCause_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorAvailabilityDecision(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.AvailabilityDecision] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.AvailabilityDecision => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorAvailabilityDecision())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorAvailabilityDecision_Payload(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.AvailabilityDecision_Payload] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.AvailabilityDecision_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorAvailabilityDecision_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_P(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_P] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PS(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PS] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_P(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_P] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PS(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PS] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorAvailabilityReport(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.AvailabilityReport] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.AvailabilityReport => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorAvailabilityReport())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorAvailabilityReport_Payload(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.AvailabilityReport_Payload] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.AvailabilityReport_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorAvailabilityReport_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorAvailabilityValueType(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.AvailabilityValue.Type] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.AvailabilityValue.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorAvailabilityValueType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorAvailabilityValue_Payload(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.AvailabilityValue_Payload] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.AvailabilityValue_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorAvailabilityValue_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorBatteryAssessmentType(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.BatteryAssessment.Type] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.BatteryAssessment.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorBatteryAssessmentType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorBatteryAssessment_Payload(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.BatteryAssessment_Payload] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.BatteryAssessment_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorBatteryAssessment_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_P(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_P] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PS(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PS] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_P(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_P] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PS(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PS] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorBatteryObservation(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.BatteryObservation] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.BatteryObservation => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorBatteryObservation())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorBatteryObservation_Payload(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.BatteryObservation_Payload] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.BatteryObservation_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorBatteryObservation_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_P(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_P] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PS(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PS] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_P(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_P] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PS(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PS] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorBatteryQualityType(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.BatteryQuality.Type] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.BatteryQuality.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorBatteryQualityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorBatteryQuality_Payload(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.BatteryQuality_Payload] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.BatteryQuality_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorBatteryQuality_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorChargerCouplingType(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.ChargerCoupling.Type] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.ChargerCoupling.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorChargerCouplingType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorChargerCoupling_Payload(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.ChargerCoupling_Payload] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.ChargerCoupling_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorChargerCoupling_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorChargerEvidence(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.ChargerEvidence] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.ChargerEvidence => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorChargerEvidence())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorChargerEvidence_Payload(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.ChargerEvidence_Payload] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.ChargerEvidence_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorChargerEvidence_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorChargingAssessmentType(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.ChargingAssessment.Type] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.ChargingAssessment.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorChargingAssessmentType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorChargingAssessment_Payload(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.ChargingAssessment_Payload] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.ChargingAssessment_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorChargingAssessment_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_P(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_P] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PS(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PS] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_P(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_P] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PS(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PS] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorConfigurationAssessmentType(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.ConfigurationAssessment.Type] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.ConfigurationAssessment.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorConfigurationAssessmentType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorConfigurationAssessment_Payload(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.ConfigurationAssessment_Payload] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.ConfigurationAssessment_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorConfigurationAssessment_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorConfigurationEvidence(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.ConfigurationEvidence] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.ConfigurationEvidence => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorConfigurationEvidence())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorConfigurationEvidence_Payload(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.ConfigurationEvidence_Payload] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.ConfigurationEvidence_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorConfigurationEvidence_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorControlEventType(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.ControlEvent.Type] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.ControlEvent.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorControlEventType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorControlEvent_Payload(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.ControlEvent_Payload] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.ControlEvent_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorControlEvent_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorDemandPhaseType(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.DemandPhase.Type] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.DemandPhase.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorDemandPhaseType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorDemandPhase_Payload(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.DemandPhase_Payload] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.DemandPhase_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorDemandPhase_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_P(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_P] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PS(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PS] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_P(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_P] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PS(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PS] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorEngineCountType(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.EngineCount.Type] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.EngineCount.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorEngineCountType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorEngineCount_Payload(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.EngineCount_Payload] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.EngineCount_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorEngineCount_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorEnginePairAssessmentType(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.EnginePairAssessment.Type] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.EnginePairAssessment.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorEnginePairAssessmentType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorEnginePairAssessment_Payload(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.EnginePairAssessment_Payload] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.EnginePairAssessment_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorEnginePairAssessment_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorEnginePairEvidence(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.EnginePairEvidence] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.EnginePairEvidence => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorEnginePairEvidence())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorEnginePairEvidence_Payload(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.EnginePairEvidence_Payload] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.EnginePairEvidence_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorEnginePairEvidence_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorEnginePositionOneConditionType(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.EnginePositionOneCondition.Type] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.EnginePositionOneCondition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorEnginePositionOneConditionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorEnginePositionOneCondition_Payload(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.EnginePositionOneCondition_Payload] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.EnginePositionOneCondition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorEnginePositionOneCondition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorEnginePositionTwoConditionType(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.EnginePositionTwoCondition.Type] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.EnginePositionTwoCondition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorEnginePositionTwoConditionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorEnginePositionTwoCondition_Payload(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.EnginePositionTwoCondition_Payload] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.EnginePositionTwoCondition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorEnginePositionTwoCondition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_P(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_P] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PS(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PS] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_P(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_P] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PS(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PS] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorEvidenceFreshnessType(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.EvidenceFreshness.Type] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.EvidenceFreshness.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorEvidenceFreshnessType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorEvidenceFreshness_Payload(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.EvidenceFreshness_Payload] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.EvidenceFreshness_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorEvidenceFreshness_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorEvidenceValidityType(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.EvidenceValidity.Type] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.EvidenceValidity.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorEvidenceValidityType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorEvidenceValidity_Payload(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.EvidenceValidity_Payload] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.EvidenceValidity_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorEvidenceValidity_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_P(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_P] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PS(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PS] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_P(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_P] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PS(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PS] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorFaultActionSummary(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.FaultActionSummary] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.FaultActionSummary => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorFaultActionSummary())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorFaultActionSummary_Payload(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.FaultActionSummary_Payload] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.FaultActionSummary_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorFaultActionSummary_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorFaultCauseType(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.FaultCause.Type] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.FaultCause.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorFaultCauseType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorFaultCause_Payload(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.FaultCause_Payload] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.FaultCause_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorFaultCause_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorFaultStatusType(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.FaultStatus.Type] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.FaultStatus.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorFaultStatusType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorFaultStatus_Payload(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.FaultStatus_Payload] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.FaultStatus_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorFaultStatus_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_P(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_P] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PS(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PS] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_P(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_P] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PS(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PS] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_P(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_P] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PS(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PS] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_P(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_P] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PS(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PS] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorPowerAssessmentType(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.PowerAssessment.Type] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.PowerAssessment.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorPowerAssessmentType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorPowerAssessment_Payload(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.PowerAssessment_Payload] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.PowerAssessment_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorPowerAssessment_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorPowerCommandType(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.PowerCommand.Type] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.PowerCommand.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorPowerCommandType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorPowerCommand_Payload(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.PowerCommand_Payload] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.PowerCommand_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorPowerCommand_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_P(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_P] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PS(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PS] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_P(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_P] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PS(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PS] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorPowerConditionType(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.PowerCondition.Type] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.PowerCondition.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorPowerConditionType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorPowerCondition_Payload(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.PowerCondition_Payload] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.PowerCondition_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorPowerCondition_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorPowerEvidence(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.PowerEvidence] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.PowerEvidence => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorPowerEvidence())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorPowerEvidence_Payload(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.PowerEvidence_Payload] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.PowerEvidence_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorPowerEvidence_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_P(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_P] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PS(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PS] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_P(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_P] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PS(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PS] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorPriorityDirectiveType(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.PriorityDirective.Type] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.PriorityDirective.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorPriorityDirectiveType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorPriorityDirective_Payload(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.PriorityDirective_Payload] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.PriorityDirective_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorPriorityDirective_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorPropulsionAssessmentType(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.PropulsionAssessment.Type] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.PropulsionAssessment.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorPropulsionAssessmentType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorPropulsionAssessment_Payload(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.PropulsionAssessment_Payload] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.PropulsionAssessment_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorPropulsionAssessment_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_P(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_P] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PS(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PS] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_P(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_P] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PS(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PS] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorQualifiedBatteryObservation(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.QualifiedBatteryObservation] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.QualifiedBatteryObservation => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorQualifiedBatteryObservation())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorQualifiedBatteryObservation_Payload(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.QualifiedBatteryObservation_Payload] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.QualifiedBatteryObservation_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorQualifiedBatteryObservation_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorRecoveryFrame(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.RecoveryFrame] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.RecoveryFrame => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorRecoveryFrame())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorRecoveryFrame_Payload(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.RecoveryFrame_Payload] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.RecoveryFrame_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorRecoveryFrame_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorRecoveryGateType(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.RecoveryGate.Type] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.RecoveryGate.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorRecoveryGateType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorRecoveryGate_Payload(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.RecoveryGate_Payload] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.RecoveryGate_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorRecoveryGate_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorRecoveryPhaseType(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.RecoveryPhase.Type] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.RecoveryPhase.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorRecoveryPhaseType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorRecoveryPhase_Payload(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.RecoveryPhase_Payload] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.RecoveryPhase_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorRecoveryPhase_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_P(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_P] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PS(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PS] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_P(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_P] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PS(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PS] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorReportAvailabilityCauseType(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.ReportAvailabilityCause.Type] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.ReportAvailabilityCause.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorReportAvailabilityCauseType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorReportAvailabilityCause_Payload(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.ReportAvailabilityCause_Payload] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.ReportAvailabilityCause_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorReportAvailabilityCause_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorReportAvailabilityValueType(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.ReportAvailabilityValue.Type] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.ReportAvailabilityValue.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorReportAvailabilityValueType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorReportAvailabilityValue_Payload(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.ReportAvailabilityValue_Payload] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.ReportAvailabilityValue_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorReportAvailabilityValue_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorReportDemandPhaseType(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.ReportDemandPhase.Type] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.ReportDemandPhase.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorReportDemandPhaseType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorReportDemandPhase_Payload(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.ReportDemandPhase_Payload] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.ReportDemandPhase_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorReportDemandPhase_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorReportRecoveryPhaseType(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.ReportRecoveryPhase.Type] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.ReportRecoveryPhase.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorReportRecoveryPhaseType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorReportRecoveryPhase_Payload(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.ReportRecoveryPhase_Payload] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.ReportRecoveryPhase_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorReportRecoveryPhase_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorRequestContext(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.RequestContext] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.RequestContext => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorRequestContext())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorRequestContext_Payload(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.RequestContext_Payload] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.RequestContext_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorRequestContext_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorRequestContextEventType(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.RequestContextEvent.Type] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.RequestContextEvent.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorRequestContextEventType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorRequestContextEvent_Payload(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.RequestContextEvent_Payload] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.RequestContextEvent_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorRequestContextEvent_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorSummaryDirectiveType(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.SummaryDirective.Type] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.SummaryDirective.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorSummaryDirectiveType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Power_Propulsion_Availability_SupervisorSummaryDirective_Payload(param: RandomLibI) extends MJen[Power_Propulsion_Availability_Supervisor.SummaryDirective_Payload] {
  override def generate(f: Power_Propulsion_Availability_Supervisor.SummaryDirective_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextPower_Propulsion_Availability_SupervisorSummaryDirective_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_utilContainer(param: RandomLibI) extends MJen[util.Container] {
  override def generate(f: util.Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextutilContainer())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_utilEmptyContainer(param: RandomLibI) extends MJen[util.EmptyContainer] {
  override def generate(f: util.EmptyContainer => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextutilEmptyContainer())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_runtimemonitorObservationKindType(param: RandomLibI) extends MJen[runtimemonitor.ObservationKind.Type] {
  override def generate(f: runtimemonitor.ObservationKind.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextruntimemonitorObservationKindType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}


