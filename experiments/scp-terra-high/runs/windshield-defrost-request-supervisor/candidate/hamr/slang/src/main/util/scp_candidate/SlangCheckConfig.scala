// #Sireum

package scp_candidate

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

DefrostSelection.scala

RequestValidity.scala

RequestIntent.scala

GlazingCondition.scala

GlazingValidity.scala

VisibilityAssessment.scala

ElectricalInterfaceStatus.scala

DefrostLoadAllowance.scala

DefrostEligibility.scala

DefrostEnableCommand.scala

PolicyDisposition.scala

DriverDefrostStatus.scala

RequestMemory.scala

Base_Types.scala

RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_Containers.scala

GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_Containers.scala

ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_Containers.scala

DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_Containers.scala

DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_Containers.scala

ObservationKind.scala

Container.scala

DataContent.scala

Aux_Types.scala

*/
@datatype class Config_String(minSize: Z, maxSize: Z, attempts: Z, verbose: B, filter: String => B) {}
@datatype class Config_Z(low: Option[Z], high: Option[Z], attempts: Z, verbose: B, filter: Z => B) {}

@datatype class Config_B(attempts: Z, verbose: B, filter: B => B) {}

@datatype class Config_C(low: Option[C], high: Option[C], attempts: Z, verbose: B, filter: C => B) {}

@datatype class Config_R(low: Option[R], high: Option[R], attempts: Z, verbose: B, filter: R => B) {}

@datatype class Config_F32(low: Option[F32], high: Option[F32], attempts: Z, verbose: B, filter: F32 => B) {}

@datatype class Config_F64(low: Option[F64], high: Option[F64], attempts: Z, verbose: B, filter: F64 => B) {}

@datatype class Config_S8(low: Option[S8], high: Option[S8], attempts: Z, verbose: B, filter: S8 => B) {}

@datatype class Config_S16(low: Option[S16], high: Option[S16], attempts: Z, verbose: B, filter: S16 => B) {}

@datatype class Config_S32(low: Option[S32], high: Option[S32], attempts: Z, verbose: B, filter: S32 => B) {}

@datatype class Config_S64(low: Option[S64], high: Option[S64], attempts: Z, verbose: B, filter: S64 => B) {}

@datatype class Config_U8(low: Option[U8], high: Option[U8], attempts: Z, verbose: B, filter: U8 => B) {}

@datatype class Config_U16(low: Option[U16], high: Option[U16], attempts: Z, verbose: B, filter: U16 => B) {}

@datatype class Config_U32(low: Option[U32], high: Option[U32], attempts: Z, verbose: B, filter: U32 => B) {}

@datatype class Config_U64(low: Option[U64], high: Option[U64], attempts: Z, verbose: B, filter: U64 => B) {}

@datatype class Config__artDataContent(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[_artDataContent_DataTypeId.Type], filter: art.DataContent => B) {}

@datatype class Config__artEmpty(attempts: Z, verbose: B, filter: art.Empty => B) {}

@datatype class Config_Base_TypesBoolean_Payload(attempts: Z, verbose: B, filter: Base_Types.Boolean_Payload => B) {}

@datatype class Config_Base_TypesInteger_Payload(attempts: Z, verbose: B, filter: Base_Types.Integer_Payload => B) {}

@datatype class Config_Base_TypesInteger_8_Payload(attempts: Z, verbose: B, filter: Base_Types.Integer_8_Payload => B) {}

@datatype class Config_Base_TypesInteger_16_Payload(attempts: Z, verbose: B, filter: Base_Types.Integer_16_Payload => B) {}

@datatype class Config_Base_TypesInteger_32_Payload(attempts: Z, verbose: B, filter: Base_Types.Integer_32_Payload => B) {}

@datatype class Config_Base_TypesInteger_64_Payload(attempts: Z, verbose: B, filter: Base_Types.Integer_64_Payload => B) {}

@datatype class Config_Base_TypesUnsigned_8_Payload(attempts: Z, verbose: B, filter: Base_Types.Unsigned_8_Payload => B) {}

@datatype class Config_Base_TypesUnsigned_16_Payload(attempts: Z, verbose: B, filter: Base_Types.Unsigned_16_Payload => B) {}

@datatype class Config_Base_TypesUnsigned_32_Payload(attempts: Z, verbose: B, filter: Base_Types.Unsigned_32_Payload => B) {}

@datatype class Config_Base_TypesUnsigned_64_Payload(attempts: Z, verbose: B, filter: Base_Types.Unsigned_64_Payload => B) {}

@datatype class Config_Base_TypesFloat_Payload(attempts: Z, verbose: B, filter: Base_Types.Float_Payload => B) {}

@datatype class Config_Base_TypesFloat_32_Payload(attempts: Z, verbose: B, filter: Base_Types.Float_32_Payload => B) {}

@datatype class Config_Base_TypesFloat_64_Payload(attempts: Z, verbose: B, filter: Base_Types.Float_64_Payload => B) {}

@datatype class Config_Base_TypesCharacter_Payload(attempts: Z, verbose: B, filter: Base_Types.Character_Payload => B) {}

@datatype class Config_Base_TypesString_Payload(attempts: Z, verbose: B, filter: Base_Types.String_Payload => B) {}

@datatype class Config_ISZB(minSize: Z, maxSize: Z, attempts: Z, verbose: B, filter: ISZ[B] => B) {}

@datatype class Config_Base_TypesBits_Payload(attempts: Z, verbose: B, filter: Base_Types.Bits_Payload => B) {}

@datatype class Config_Windshield_Defrost_Request_SupervisorDefrostEligibilityType(attempts: Z, verbose: B, filter: Windshield_Defrost_Request_Supervisor.DefrostEligibility.Type => B) {}

@datatype class Config_Windshield_Defrost_Request_SupervisorDefrostEligibility_Payload(attempts: Z, verbose: B, filter: Windshield_Defrost_Request_Supervisor.DefrostEligibility_Payload => B) {}

@datatype class Config_Windshield_Defrost_Request_SupervisorDefrostEnableCommandType(attempts: Z, verbose: B, filter: Windshield_Defrost_Request_Supervisor.DefrostEnableCommand.Type => B) {}

@datatype class Config_Windshield_Defrost_Request_SupervisorDefrostEnableCommand_Payload(attempts: Z, verbose: B, filter: Windshield_Defrost_Request_Supervisor.DefrostEnableCommand_Payload => B) {}

@datatype class Config_Windshield_Defrost_Request_SupervisorDefrostLoadAllowanceType(attempts: Z, verbose: B, filter: Windshield_Defrost_Request_Supervisor.DefrostLoadAllowance.Type => B) {}

@datatype class Config_Windshield_Defrost_Request_SupervisorDefrostLoadAllowance_Payload(attempts: Z, verbose: B, filter: Windshield_Defrost_Request_Supervisor.DefrostLoadAllowance_Payload => B) {}

@datatype class Config_Windshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Windshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_DataTypeId.Type], filter: Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container => B) {}

@datatype class Config_Windshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_P(attempts: Z, verbose: B, filter: Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_P => B) {}

@datatype class Config_Windshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PS(attempts: Z, verbose: B, filter: Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PreState_Container_PS => B) {}

@datatype class Config_Windshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Windshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_DataTypeId.Type], filter: Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container => B) {}

@datatype class Config_Windshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_P(attempts: Z, verbose: B, filter: Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_P => B) {}

@datatype class Config_Windshield_Defrost_Request_SupervisorDefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PS(attempts: Z, verbose: B, filter: Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_PostState_Container_PS => B) {}

@datatype class Config_Windshield_Defrost_Request_SupervisorDefrostSelectionType(attempts: Z, verbose: B, filter: Windshield_Defrost_Request_Supervisor.DefrostSelection.Type => B) {}

@datatype class Config_Windshield_Defrost_Request_SupervisorDefrostSelection_Payload(attempts: Z, verbose: B, filter: Windshield_Defrost_Request_Supervisor.DefrostSelection_Payload => B) {}

@datatype class Config_Windshield_Defrost_Request_SupervisorDriverDefrostStatusType(attempts: Z, verbose: B, filter: Windshield_Defrost_Request_Supervisor.DriverDefrostStatus.Type => B) {}

@datatype class Config_Windshield_Defrost_Request_SupervisorDriverDefrostStatus_Payload(attempts: Z, verbose: B, filter: Windshield_Defrost_Request_Supervisor.DriverDefrostStatus_Payload => B) {}

@datatype class Config_Windshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Windshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_DataTypeId.Type], filter: Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container => B) {}

@datatype class Config_Windshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_P(attempts: Z, verbose: B, filter: Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_P => B) {}

@datatype class Config_Windshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PS(attempts: Z, verbose: B, filter: Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PreState_Container_PS => B) {}

@datatype class Config_Windshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Windshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_DataTypeId.Type], filter: Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container => B) {}

@datatype class Config_Windshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_P(attempts: Z, verbose: B, filter: Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_P => B) {}

@datatype class Config_Windshield_Defrost_Request_SupervisorDriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PS(attempts: Z, verbose: B, filter: Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_PostState_Container_PS => B) {}

@datatype class Config_Windshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Windshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_DataTypeId.Type], filter: Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container => B) {}

@datatype class Config_Windshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_P(attempts: Z, verbose: B, filter: Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_P => B) {}

@datatype class Config_Windshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PS(attempts: Z, verbose: B, filter: Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PreState_Container_PS => B) {}

@datatype class Config_Windshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Windshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_DataTypeId.Type], filter: Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container => B) {}

@datatype class Config_Windshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_P(attempts: Z, verbose: B, filter: Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_P => B) {}

@datatype class Config_Windshield_Defrost_Request_SupervisorElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PS(attempts: Z, verbose: B, filter: Windshield_Defrost_Request_Supervisor.ElectricalEligibilityAssessor_defrostSupervisionProcess_electricalEligibilityAssessor_PostState_Container_PS => B) {}

@datatype class Config_Windshield_Defrost_Request_SupervisorElectricalInterfaceStatusType(attempts: Z, verbose: B, filter: Windshield_Defrost_Request_Supervisor.ElectricalInterfaceStatus.Type => B) {}

@datatype class Config_Windshield_Defrost_Request_SupervisorElectricalInterfaceStatus_Payload(attempts: Z, verbose: B, filter: Windshield_Defrost_Request_Supervisor.ElectricalInterfaceStatus_Payload => B) {}

@datatype class Config_Windshield_Defrost_Request_SupervisorGlazingConditionType(attempts: Z, verbose: B, filter: Windshield_Defrost_Request_Supervisor.GlazingCondition.Type => B) {}

@datatype class Config_Windshield_Defrost_Request_SupervisorGlazingCondition_Payload(attempts: Z, verbose: B, filter: Windshield_Defrost_Request_Supervisor.GlazingCondition_Payload => B) {}

@datatype class Config_Windshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Windshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_DataTypeId.Type], filter: Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container => B) {}

@datatype class Config_Windshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_P(attempts: Z, verbose: B, filter: Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_P => B) {}

@datatype class Config_Windshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PS(attempts: Z, verbose: B, filter: Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PreState_Container_PS => B) {}

@datatype class Config_Windshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Windshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_DataTypeId.Type], filter: Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container => B) {}

@datatype class Config_Windshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_P(attempts: Z, verbose: B, filter: Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_P => B) {}

@datatype class Config_Windshield_Defrost_Request_SupervisorGlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PS(attempts: Z, verbose: B, filter: Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_PostState_Container_PS => B) {}

@datatype class Config_Windshield_Defrost_Request_SupervisorGlazingValidityType(attempts: Z, verbose: B, filter: Windshield_Defrost_Request_Supervisor.GlazingValidity.Type => B) {}

@datatype class Config_Windshield_Defrost_Request_SupervisorGlazingValidity_Payload(attempts: Z, verbose: B, filter: Windshield_Defrost_Request_Supervisor.GlazingValidity_Payload => B) {}

@datatype class Config_Windshield_Defrost_Request_SupervisorPolicyDispositionType(attempts: Z, verbose: B, filter: Windshield_Defrost_Request_Supervisor.PolicyDisposition.Type => B) {}

@datatype class Config_Windshield_Defrost_Request_SupervisorPolicyDisposition_Payload(attempts: Z, verbose: B, filter: Windshield_Defrost_Request_Supervisor.PolicyDisposition_Payload => B) {}

@datatype class Config_Windshield_Defrost_Request_SupervisorRequestIntentType(attempts: Z, verbose: B, filter: Windshield_Defrost_Request_Supervisor.RequestIntent.Type => B) {}

@datatype class Config_Windshield_Defrost_Request_SupervisorRequestIntent_Payload(attempts: Z, verbose: B, filter: Windshield_Defrost_Request_Supervisor.RequestIntent_Payload => B) {}

@datatype class Config_Windshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Windshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_DataTypeId.Type], filter: Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container => B) {}

@datatype class Config_Windshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_P(attempts: Z, verbose: B, filter: Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_P => B) {}

@datatype class Config_Windshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PS(attempts: Z, verbose: B, filter: Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PreState_Container_PS => B) {}

@datatype class Config_Windshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Windshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_DataTypeId.Type], filter: Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container => B) {}

@datatype class Config_Windshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_P(attempts: Z, verbose: B, filter: Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_P => B) {}

@datatype class Config_Windshield_Defrost_Request_SupervisorRequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PS(attempts: Z, verbose: B, filter: Windshield_Defrost_Request_Supervisor.RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker_PostState_Container_PS => B) {}

@datatype class Config_Windshield_Defrost_Request_SupervisorRequestMemoryType(attempts: Z, verbose: B, filter: Windshield_Defrost_Request_Supervisor.RequestMemory.Type => B) {}

@datatype class Config_Windshield_Defrost_Request_SupervisorRequestMemory_Payload(attempts: Z, verbose: B, filter: Windshield_Defrost_Request_Supervisor.RequestMemory_Payload => B) {}

@datatype class Config_Windshield_Defrost_Request_SupervisorRequestValidityType(attempts: Z, verbose: B, filter: Windshield_Defrost_Request_Supervisor.RequestValidity.Type => B) {}

@datatype class Config_Windshield_Defrost_Request_SupervisorRequestValidity_Payload(attempts: Z, verbose: B, filter: Windshield_Defrost_Request_Supervisor.RequestValidity_Payload => B) {}

@datatype class Config_Windshield_Defrost_Request_SupervisorVisibilityAssessmentType(attempts: Z, verbose: B, filter: Windshield_Defrost_Request_Supervisor.VisibilityAssessment.Type => B) {}

@datatype class Config_Windshield_Defrost_Request_SupervisorVisibilityAssessment_Payload(attempts: Z, verbose: B, filter: Windshield_Defrost_Request_Supervisor.VisibilityAssessment_Payload => B) {}

@datatype class Config_utilContainer(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[utilContainer_DataTypeId.Type], filter: util.Container => B) {}

@datatype class Config_utilEmptyContainer(attempts: Z, verbose: B, filter: util.EmptyContainer => B) {}

@datatype class Config_runtimemonitorObservationKindType(attempts: Z, verbose: B, filter: runtimemonitor.ObservationKind.Type => B) {}


