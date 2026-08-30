// #Sireum

package scp_candidate

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

Mission_Invalidity_Facts.scala

Threat_Invalidity.scala

Resource_Invalidity.scala

Mining_Recovery_Facts.scala

Defense_Facts.scala

Mission_Facts.scala

Arrival_Fact.scala

Phase_Context.scala

Fault_Fact.scala

Raw_Threat_Observation.scala

Threat_State_Input.scala

Qualified_Threat.scala

Threat_Publication_Facts.scala

Raw_Resource_Observation.scala

Resource_Publication_Facts.scala

Raw_Mission_Observation.scala

Mission_Proposal.scala

Response_Proposal.scala

Phase_State_Input.scala

Atomic_Supervisor_Result.scala

Published_Supervisor_Result.scala

Base_Types.scala

Fault_Assessment_supervisor_fa_Containers.scala

Threat_Qualification_supervisor_tq_Containers.scala

Resource_Qualification_supervisor_rq_Containers.scala

Personnel_Mission_Qualification_supervisor_pq_Containers.scala

Mission_Recovery_Decision_supervisor_mr_Containers.scala

Threat_Retreat_Decision_supervisor_tr_Containers.scala

Priority_Phase_Arbitration_supervisor_arb_Containers.scala

Atomic_Publication_supervisor_ap_Containers.scala

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

@datatype class Config_Mining_Threat_Retreat_SupervisorArrival_Fact(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Arrival_Fact => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorArrival_Fact_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Arrival_Fact_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_DataTypeId.Type], filter: Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_P(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container_P => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_PS(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container_PS => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_DataTypeId.Type], filter: Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_P(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container_P => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_PS(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container_PS => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorAtomic_Supervisor_Result(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Atomic_Supervisor_Result => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorAtomic_Supervisor_Result_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Atomic_Supervisor_Result_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorDefense_Facts(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Defense_Facts => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorDefense_Facts_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Defense_Facts_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_DataTypeId.Type], filter: Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_P(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container_P => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_PS(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container_PS => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_DataTypeId.Type], filter: Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_P(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container_P => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_PS(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container_PS => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorFault_Fact(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Fault_Fact => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorFault_Fact_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Fault_Fact_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorMining_Recovery_Facts(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Mining_Recovery_Facts => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorMining_Recovery_Facts_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Mining_Recovery_Facts_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorMission_Facts(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Mission_Facts => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorMission_Facts_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Mission_Facts_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorMission_Invalidity_Facts(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Mission_Invalidity_Facts => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorMission_Invalidity_Facts_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Mission_Invalidity_Facts_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorMission_Proposal(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Mission_Proposal => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorMission_Proposal_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Mission_Proposal_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_DataTypeId.Type], filter: Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_P(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container_P => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_PS(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container_PS => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_DataTypeId.Type], filter: Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_P(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container_P => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_PS(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container_PS => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_DataTypeId.Type], filter: Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_P(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container_P => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_PS(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container_PS => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_DataTypeId.Type], filter: Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_P(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container_P => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_PS(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container_PS => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorPhase_Context(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Phase_Context => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorPhase_Context_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Phase_Context_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorPhase_State_Input(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Phase_State_Input => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorPhase_State_Input_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Phase_State_Input_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_DataTypeId.Type], filter: Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_P(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container_P => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_PS(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container_PS => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_DataTypeId.Type], filter: Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_P(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container_P => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_PS(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container_PS => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorPublished_Supervisor_Result(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Published_Supervisor_Result => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorPublished_Supervisor_Result_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Published_Supervisor_Result_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorQualified_Threat(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Qualified_Threat => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorQualified_Threat_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Qualified_Threat_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorRaw_Mission_Observation(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Raw_Mission_Observation => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorRaw_Mission_Observation_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Raw_Mission_Observation_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorRaw_Resource_Observation(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Raw_Resource_Observation => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorRaw_Resource_Observation_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Raw_Resource_Observation_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorRaw_Threat_Observation(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Raw_Threat_Observation => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorRaw_Threat_Observation_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Raw_Threat_Observation_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorResource_Invalidity(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Resource_Invalidity => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorResource_Invalidity_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Resource_Invalidity_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorResource_Publication_Facts(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Resource_Publication_Facts => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorResource_Publication_Facts_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Resource_Publication_Facts_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_DataTypeId.Type], filter: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_P(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container_P => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_PS(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container_PS => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_DataTypeId.Type], filter: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_P(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container_P => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_PS(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container_PS => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorResponse_Proposal(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Response_Proposal => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorResponse_Proposal_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Response_Proposal_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorThreat_Invalidity(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Threat_Invalidity => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorThreat_Invalidity_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Threat_Invalidity_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorThreat_Publication_Facts(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Threat_Publication_Facts => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorThreat_Publication_Facts_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Threat_Publication_Facts_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_DataTypeId.Type], filter: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_P(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container_P => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_PS(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container_PS => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_DataTypeId.Type], filter: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_P(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container_P => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_PS(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container_PS => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_DataTypeId.Type], filter: Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_P(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container_P => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_PS(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container_PS => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_DataTypeId.Type], filter: Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_P(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container_P => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_PS(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container_PS => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorThreat_State_Input(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Threat_State_Input => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisorThreat_State_Input_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervisor.Threat_State_Input_Payload => B) {}

@datatype class Config_utilContainer(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[utilContainer_DataTypeId.Type], filter: util.Container => B) {}

@datatype class Config_utilEmptyContainer(attempts: Z, verbose: B, filter: util.EmptyContainer => B) {}

@datatype class Config_runtimemonitorObservationKindType(attempts: Z, verbose: B, filter: runtimemonitor.ObservationKind.Type => B) {}


