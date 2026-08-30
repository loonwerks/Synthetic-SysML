// #Sireum
// @formatter:off

// This file is auto-generated from Mission_Invalidity_Facts.scala, Threat_Invalidity.scala, Resource_Invalidity.scala, Mining_Recovery_Facts.scala, Defense_Facts.scala, Mission_Facts.scala, Arrival_Fact.scala, Phase_Context.scala, Fault_Fact.scala, Raw_Threat_Observation.scala, Threat_State_Input.scala, Qualified_Threat.scala, Threat_Publication_Facts.scala, Raw_Resource_Observation.scala, Resource_Publication_Facts.scala, Raw_Mission_Observation.scala, Mission_Proposal.scala, Response_Proposal.scala, Phase_State_Input.scala, Atomic_Supervisor_Result.scala, Published_Supervisor_Result.scala, Base_Types.scala, Fault_Assessment_supervisor_fa_Containers.scala, Threat_Qualification_supervisor_tq_Containers.scala, Resource_Qualification_supervisor_rq_Containers.scala, Personnel_Mission_Qualification_supervisor_pq_Containers.scala, Mission_Recovery_Decision_supervisor_mr_Containers.scala, Threat_Retreat_Decision_supervisor_tr_Containers.scala, Priority_Phase_Arbitration_supervisor_arb_Containers.scala, Atomic_Publication_supervisor_ap_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package scp_candidate

import org.sireum._
import org.sireum.Json.Printer._

object JSON {

  object Printer {

    @pure def printMining_Threat_Retreat_SupervisorMission_Invalidity_Facts(o: Mining_Threat_Retreat_Supervisor.Mission_Invalidity_Facts): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Mission_Invalidity_Facts""""),
        ("intent_invalid", printB(o.intent_invalid)),
        ("arrival_invalid", printB(o.arrival_invalid)),
        ("resupply_invalid", printB(o.resupply_invalid))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorMission_Invalidity_Facts_Payload(o: Mining_Threat_Retreat_Supervisor.Mission_Invalidity_Facts_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Mission_Invalidity_Facts_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisorMission_Invalidity_Facts(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorThreat_Invalidity(o: Mining_Threat_Retreat_Supervisor.Threat_Invalidity): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Threat_Invalidity""""),
        ("threat_invalid", printB(o.threat_invalid))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorThreat_Invalidity_Payload(o: Mining_Threat_Retreat_Supervisor.Threat_Invalidity_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Threat_Invalidity_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisorThreat_Invalidity(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorResource_Invalidity(o: Mining_Threat_Retreat_Supervisor.Resource_Invalidity): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Resource_Invalidity""""),
        ("resource_invalid", printB(o.resource_invalid))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorResource_Invalidity_Payload(o: Mining_Threat_Retreat_Supervisor.Resource_Invalidity_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Resource_Invalidity_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisorResource_Invalidity(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorMining_Recovery_Facts(o: Mining_Threat_Retreat_Supervisor.Mining_Recovery_Facts): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Mining_Recovery_Facts""""),
        ("mine_ready", printB(o.mine_ready)),
        ("resource_reset", printB(o.resource_reset)),
        ("cargo_or_capacitor_retreat", printB(o.cargo_or_capacitor_retreat)),
        ("target_or_mining_block", printB(o.target_or_mining_block))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorMining_Recovery_Facts_Payload(o: Mining_Threat_Retreat_Supervisor.Mining_Recovery_Facts_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Mining_Recovery_Facts_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisorMining_Recovery_Facts(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorDefense_Facts(o: Mining_Threat_Retreat_Supervisor.Defense_Facts): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Defense_Facts""""),
        ("defense_ready", printB(o.defense_ready))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorDefense_Facts_Payload(o: Mining_Threat_Retreat_Supervisor.Defense_Facts_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Defense_Facts_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisorDefense_Facts(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorMission_Facts(o: Mining_Threat_Retreat_Supervisor.Mission_Facts): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Mission_Facts""""),
        ("valid_mine", printB(o.valid_mine)),
        ("invalid_or_return", printB(o.invalid_or_return)),
        ("valid_hold_or_return", printB(o.valid_hold_or_return)),
        ("valid_complete_resupply", printB(o.valid_complete_resupply)),
        ("intent_invalid", printB(o.intent_invalid))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorMission_Facts_Payload(o: Mining_Threat_Retreat_Supervisor.Mission_Facts_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Mission_Facts_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisorMission_Facts(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorArrival_Fact(o: Mining_Threat_Retreat_Supervisor.Arrival_Fact): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Arrival_Fact""""),
        ("valid_safe_at_station", printB(o.valid_safe_at_station))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorArrival_Fact_Payload(o: Mining_Threat_Retreat_Supervisor.Arrival_Fact_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Arrival_Fact_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisorArrival_Fact(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorPhase_Context(o: Mining_Threat_Retreat_Supervisor.Phase_Context): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Phase_Context""""),
        ("current_phase", printS32(o.current_phase))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorPhase_Context_Payload(o: Mining_Threat_Retreat_Supervisor.Phase_Context_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Phase_Context_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisorPhase_Context(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorFault_Fact(o: Mining_Threat_Retreat_Supervisor.Fault_Fact): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Fault_Fact""""),
        ("fault", printS32(o.fault))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorFault_Fact_Payload(o: Mining_Threat_Retreat_Supervisor.Fault_Fact_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Fault_Fact_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisorFault_Fact(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorRaw_Threat_Observation(o: Mining_Threat_Retreat_Supervisor.Raw_Threat_Observation): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Raw_Threat_Observation""""),
        ("threat", printS32(o.threat)),
        ("threat_validity", printS32(o.threat_validity))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorRaw_Threat_Observation_Payload(o: Mining_Threat_Retreat_Supervisor.Raw_Threat_Observation_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Raw_Threat_Observation_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisorRaw_Threat_Observation(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorThreat_State_Input(o: Mining_Threat_Retreat_Supervisor.Threat_State_Input): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Threat_State_Input""""),
        ("current_valid_streak", printS32(o.current_valid_streak))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorThreat_State_Input_Payload(o: Mining_Threat_Retreat_Supervisor.Threat_State_Input_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Threat_State_Input_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisorThreat_State_Input(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorQualified_Threat(o: Mining_Threat_Retreat_Supervisor.Qualified_Threat): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Qualified_Threat""""),
        ("qualified_threat", printS32(o.qualified_threat)),
        ("untrusted", printB(o.untrusted)),
        ("acceptable", printB(o.acceptable)),
        ("hostile", printB(o.hostile)),
        ("severe", printB(o.severe))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorQualified_Threat_Payload(o: Mining_Threat_Retreat_Supervisor.Qualified_Threat_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Qualified_Threat_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisorQualified_Threat(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorThreat_Publication_Facts(o: Mining_Threat_Retreat_Supervisor.Threat_Publication_Facts): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Threat_Publication_Facts""""),
        ("qualified_threat", printS32(o.qualified_threat)),
        ("next_valid_streak", printS32(o.next_valid_streak))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorThreat_Publication_Facts_Payload(o: Mining_Threat_Retreat_Supervisor.Threat_Publication_Facts_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Threat_Publication_Facts_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisorThreat_Publication_Facts(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorRaw_Resource_Observation(o: Mining_Threat_Retreat_Supervisor.Raw_Resource_Observation): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Raw_Resource_Observation""""),
        ("cargo", printS32(o.cargo)),
        ("cargo_validity", printS32(o.cargo_validity)),
        ("capacitor", printS32(o.capacitor)),
        ("capacitor_validity", printS32(o.capacitor_validity)),
        ("target", printS32(o.target)),
        ("target_validity", printS32(o.target_validity)),
        ("mining_availability", printS32(o.mining_availability)),
        ("defense_availability", printS32(o.defense_availability)),
        ("retreat_availability", printS32(o.retreat_availability)),
        ("availability_validity", printS32(o.availability_validity))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorRaw_Resource_Observation_Payload(o: Mining_Threat_Retreat_Supervisor.Raw_Resource_Observation_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Raw_Resource_Observation_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisorRaw_Resource_Observation(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorResource_Publication_Facts(o: Mining_Threat_Retreat_Supervisor.Resource_Publication_Facts): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Resource_Publication_Facts""""),
        ("cargo_advisory", printS32(o.cargo_advisory)),
        ("capacitor_advisory", printS32(o.capacitor_advisory)),
        ("retreat_advisory", printS32(o.retreat_advisory))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorResource_Publication_Facts_Payload(o: Mining_Threat_Retreat_Supervisor.Resource_Publication_Facts_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Resource_Publication_Facts_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisorResource_Publication_Facts(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorRaw_Mission_Observation(o: Mining_Threat_Retreat_Supervisor.Raw_Mission_Observation): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Raw_Mission_Observation""""),
        ("pilot_intent", printS32(o.pilot_intent)),
        ("intent_validity", printS32(o.intent_validity)),
        ("arrival", printS32(o.arrival)),
        ("arrival_validity", printS32(o.arrival_validity)),
        ("resupply", printS32(o.resupply)),
        ("resupply_validity", printS32(o.resupply_validity))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorRaw_Mission_Observation_Payload(o: Mining_Threat_Retreat_Supervisor.Raw_Mission_Observation_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Raw_Mission_Observation_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisorRaw_Mission_Observation(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorMission_Proposal(o: Mining_Threat_Retreat_Supervisor.Mission_Proposal): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Mission_Proposal""""),
        ("proposed_reason", printS32(o.proposed_reason))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorMission_Proposal_Payload(o: Mining_Threat_Retreat_Supervisor.Mission_Proposal_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Mission_Proposal_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisorMission_Proposal(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorResponse_Proposal(o: Mining_Threat_Retreat_Supervisor.Response_Proposal): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Response_Proposal""""),
        ("proposed_reason", printS32(o.proposed_reason))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorResponse_Proposal_Payload(o: Mining_Threat_Retreat_Supervisor.Response_Proposal_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Response_Proposal_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisorResponse_Proposal(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorPhase_State_Input(o: Mining_Threat_Retreat_Supervisor.Phase_State_Input): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Phase_State_Input""""),
        ("current_phase", printS32(o.current_phase))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorPhase_State_Input_Payload(o: Mining_Threat_Retreat_Supervisor.Phase_State_Input_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Phase_State_Input_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisorPhase_State_Input(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorAtomic_Supervisor_Result(o: Mining_Threat_Retreat_Supervisor.Atomic_Supervisor_Result): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Atomic_Supervisor_Result""""),
        ("command", printS32(o.command)),
        ("current_phase", printS32(o.current_phase)),
        ("next_phase", printS32(o.next_phase)),
        ("reason", printS32(o.reason)),
        ("fault", printS32(o.fault)),
        ("next_valid_streak", printS32(o.next_valid_streak)),
        ("cargo_advisory", printS32(o.cargo_advisory)),
        ("capacitor_advisory", printS32(o.capacitor_advisory)),
        ("retreat_advisory", printS32(o.retreat_advisory))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorAtomic_Supervisor_Result_Payload(o: Mining_Threat_Retreat_Supervisor.Atomic_Supervisor_Result_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Atomic_Supervisor_Result_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisorAtomic_Supervisor_Result(o.value))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorPublished_Supervisor_Result(o: Mining_Threat_Retreat_Supervisor.Published_Supervisor_Result): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Published_Supervisor_Result""""),
        ("command", printS32(o.command)),
        ("current_phase", printS32(o.current_phase)),
        ("next_phase", printS32(o.next_phase)),
        ("reason", printS32(o.reason)),
        ("fault", printS32(o.fault)),
        ("next_valid_streak", printS32(o.next_valid_streak)),
        ("cargo_advisory", printS32(o.cargo_advisory)),
        ("capacitor_advisory", printS32(o.capacitor_advisory)),
        ("retreat_advisory", printS32(o.retreat_advisory)),
        ("laser", printS32(o.laser)),
        ("drones", printS32(o.drones))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorPublished_Supervisor_Result_Payload(o: Mining_Threat_Retreat_Supervisor.Published_Supervisor_Result_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Published_Supervisor_Result_Payload""""),
        ("value", printMining_Threat_Retreat_SupervisorPublished_Supervisor_Result(o.value))
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

    @pure def printMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container(o: Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container): ST = {
      o match {
        case o: Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container_P => return printMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container_PS => return printMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_PS(o)
      }
    }

    @pure def printMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_P(o: Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container_P""""),
        ("api_mission_invalidity", printMining_Threat_Retreat_SupervisorMission_Invalidity_Facts(o.api_mission_invalidity)),
        ("api_phase_context", printMining_Threat_Retreat_SupervisorPhase_Context(o.api_phase_context)),
        ("api_resource_invalidity", printMining_Threat_Retreat_SupervisorResource_Invalidity(o.api_resource_invalidity)),
        ("api_threat_invalidity", printMining_Threat_Retreat_SupervisorThreat_Invalidity(o.api_threat_invalidity))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container_PS""""),
        ("api_mission_invalidity", printMining_Threat_Retreat_SupervisorMission_Invalidity_Facts(o.api_mission_invalidity)),
        ("api_phase_context", printMining_Threat_Retreat_SupervisorPhase_Context(o.api_phase_context)),
        ("api_resource_invalidity", printMining_Threat_Retreat_SupervisorResource_Invalidity(o.api_resource_invalidity)),
        ("api_threat_invalidity", printMining_Threat_Retreat_SupervisorThreat_Invalidity(o.api_threat_invalidity))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container(o: Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container): ST = {
      o match {
        case o: Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container_P => return printMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container_PS => return printMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_PS(o)
      }
    }

    @pure def printMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_P(o: Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container_P""""),
        ("api_fault", printMining_Threat_Retreat_SupervisorFault_Fact(o.api_fault))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container_PS""""),
        ("api_fault", printMining_Threat_Retreat_SupervisorFault_Fact(o.api_fault))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container(o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container): ST = {
      o match {
        case o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container_P => return printMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container_PS => return printMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_PS(o)
      }
    }

    @pure def printMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_P(o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container_P""""),
        ("api_raw_threat", printMining_Threat_Retreat_SupervisorRaw_Threat_Observation(o.api_raw_threat)),
        ("api_streak_state", printMining_Threat_Retreat_SupervisorThreat_State_Input(o.api_streak_state))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container_PS""""),
        ("api_raw_threat", printMining_Threat_Retreat_SupervisorRaw_Threat_Observation(o.api_raw_threat)),
        ("api_streak_state", printMining_Threat_Retreat_SupervisorThreat_State_Input(o.api_streak_state))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container(o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container): ST = {
      o match {
        case o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container_P => return printMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container_PS => return printMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_PS(o)
      }
    }

    @pure def printMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_P(o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container_P""""),
        ("api_qualified_threat", printMining_Threat_Retreat_SupervisorQualified_Threat(o.api_qualified_threat)),
        ("api_threat_invalidity", printMining_Threat_Retreat_SupervisorThreat_Invalidity(o.api_threat_invalidity)),
        ("api_threat_publication", printMining_Threat_Retreat_SupervisorThreat_Publication_Facts(o.api_threat_publication))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container_PS""""),
        ("api_qualified_threat", printMining_Threat_Retreat_SupervisorQualified_Threat(o.api_qualified_threat)),
        ("api_threat_invalidity", printMining_Threat_Retreat_SupervisorThreat_Invalidity(o.api_threat_invalidity)),
        ("api_threat_publication", printMining_Threat_Retreat_SupervisorThreat_Publication_Facts(o.api_threat_publication))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container(o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container): ST = {
      o match {
        case o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container_P => return printMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container_PS => return printMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_PS(o)
      }
    }

    @pure def printMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_P(o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container_P""""),
        ("api_raw_resources", printMining_Threat_Retreat_SupervisorRaw_Resource_Observation(o.api_raw_resources))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container_PS""""),
        ("api_raw_resources", printMining_Threat_Retreat_SupervisorRaw_Resource_Observation(o.api_raw_resources))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container(o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container): ST = {
      o match {
        case o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container_P => return printMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container_PS => return printMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_PS(o)
      }
    }

    @pure def printMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_P(o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container_P""""),
        ("api_defense_facts", printMining_Threat_Retreat_SupervisorDefense_Facts(o.api_defense_facts)),
        ("api_mining_recovery_facts", printMining_Threat_Retreat_SupervisorMining_Recovery_Facts(o.api_mining_recovery_facts)),
        ("api_resource_invalidity", printMining_Threat_Retreat_SupervisorResource_Invalidity(o.api_resource_invalidity)),
        ("api_resource_publication", printMining_Threat_Retreat_SupervisorResource_Publication_Facts(o.api_resource_publication))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container_PS""""),
        ("api_defense_facts", printMining_Threat_Retreat_SupervisorDefense_Facts(o.api_defense_facts)),
        ("api_mining_recovery_facts", printMining_Threat_Retreat_SupervisorMining_Recovery_Facts(o.api_mining_recovery_facts)),
        ("api_resource_invalidity", printMining_Threat_Retreat_SupervisorResource_Invalidity(o.api_resource_invalidity)),
        ("api_resource_publication", printMining_Threat_Retreat_SupervisorResource_Publication_Facts(o.api_resource_publication))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container(o: Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container): ST = {
      o match {
        case o: Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container_P => return printMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container_PS => return printMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_PS(o)
      }
    }

    @pure def printMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_P(o: Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container_P""""),
        ("api_raw_mission", printMining_Threat_Retreat_SupervisorRaw_Mission_Observation(o.api_raw_mission))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container_PS""""),
        ("api_raw_mission", printMining_Threat_Retreat_SupervisorRaw_Mission_Observation(o.api_raw_mission))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container(o: Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container): ST = {
      o match {
        case o: Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container_P => return printMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container_PS => return printMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_PS(o)
      }
    }

    @pure def printMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_P(o: Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container_P""""),
        ("api_arrival_fact", printMining_Threat_Retreat_SupervisorArrival_Fact(o.api_arrival_fact)),
        ("api_mission_facts", printMining_Threat_Retreat_SupervisorMission_Facts(o.api_mission_facts)),
        ("api_mission_invalidity", printMining_Threat_Retreat_SupervisorMission_Invalidity_Facts(o.api_mission_invalidity))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container_PS""""),
        ("api_arrival_fact", printMining_Threat_Retreat_SupervisorArrival_Fact(o.api_arrival_fact)),
        ("api_mission_facts", printMining_Threat_Retreat_SupervisorMission_Facts(o.api_mission_facts)),
        ("api_mission_invalidity", printMining_Threat_Retreat_SupervisorMission_Invalidity_Facts(o.api_mission_invalidity))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container(o: Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container): ST = {
      o match {
        case o: Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container_P => return printMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container_PS => return printMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_PS(o)
      }
    }

    @pure def printMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_P(o: Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container_P""""),
        ("api_mission_facts", printMining_Threat_Retreat_SupervisorMission_Facts(o.api_mission_facts)),
        ("api_phase_context", printMining_Threat_Retreat_SupervisorPhase_Context(o.api_phase_context)),
        ("api_resource_facts", printMining_Threat_Retreat_SupervisorMining_Recovery_Facts(o.api_resource_facts)),
        ("api_threat_fact", printMining_Threat_Retreat_SupervisorQualified_Threat(o.api_threat_fact))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container_PS""""),
        ("api_mission_facts", printMining_Threat_Retreat_SupervisorMission_Facts(o.api_mission_facts)),
        ("api_phase_context", printMining_Threat_Retreat_SupervisorPhase_Context(o.api_phase_context)),
        ("api_resource_facts", printMining_Threat_Retreat_SupervisorMining_Recovery_Facts(o.api_resource_facts)),
        ("api_threat_fact", printMining_Threat_Retreat_SupervisorQualified_Threat(o.api_threat_fact))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container(o: Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container): ST = {
      o match {
        case o: Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container_P => return printMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container_PS => return printMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_PS(o)
      }
    }

    @pure def printMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_P(o: Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container_P""""),
        ("api_mission_proposal", printMining_Threat_Retreat_SupervisorMission_Proposal(o.api_mission_proposal))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container_PS""""),
        ("api_mission_proposal", printMining_Threat_Retreat_SupervisorMission_Proposal(o.api_mission_proposal))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container(o: Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container): ST = {
      o match {
        case o: Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container_P => return printMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container_PS => return printMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_PS(o)
      }
    }

    @pure def printMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_P(o: Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container_P""""),
        ("api_arrival_fact", printMining_Threat_Retreat_SupervisorArrival_Fact(o.api_arrival_fact)),
        ("api_defense_facts", printMining_Threat_Retreat_SupervisorDefense_Facts(o.api_defense_facts)),
        ("api_phase_context", printMining_Threat_Retreat_SupervisorPhase_Context(o.api_phase_context)),
        ("api_threat_fact", printMining_Threat_Retreat_SupervisorQualified_Threat(o.api_threat_fact))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container_PS""""),
        ("api_arrival_fact", printMining_Threat_Retreat_SupervisorArrival_Fact(o.api_arrival_fact)),
        ("api_defense_facts", printMining_Threat_Retreat_SupervisorDefense_Facts(o.api_defense_facts)),
        ("api_phase_context", printMining_Threat_Retreat_SupervisorPhase_Context(o.api_phase_context)),
        ("api_threat_fact", printMining_Threat_Retreat_SupervisorQualified_Threat(o.api_threat_fact))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container(o: Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container): ST = {
      o match {
        case o: Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container_P => return printMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container_PS => return printMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_PS(o)
      }
    }

    @pure def printMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_P(o: Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container_P""""),
        ("api_response_proposal", printMining_Threat_Retreat_SupervisorResponse_Proposal(o.api_response_proposal))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container_PS""""),
        ("api_response_proposal", printMining_Threat_Retreat_SupervisorResponse_Proposal(o.api_response_proposal))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container(o: Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container): ST = {
      o match {
        case o: Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container_P => return printMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container_PS => return printMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_PS(o)
      }
    }

    @pure def printMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_P(o: Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container_P""""),
        ("api_fault", printMining_Threat_Retreat_SupervisorFault_Fact(o.api_fault)),
        ("api_mission_candidate", printMining_Threat_Retreat_SupervisorMission_Proposal(o.api_mission_candidate)),
        ("api_phase_state", printMining_Threat_Retreat_SupervisorPhase_State_Input(o.api_phase_state)),
        ("api_resource_publication", printMining_Threat_Retreat_SupervisorResource_Publication_Facts(o.api_resource_publication)),
        ("api_response_candidate", printMining_Threat_Retreat_SupervisorResponse_Proposal(o.api_response_candidate)),
        ("api_threat_publication", printMining_Threat_Retreat_SupervisorThreat_Publication_Facts(o.api_threat_publication))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container_PS""""),
        ("api_fault", printMining_Threat_Retreat_SupervisorFault_Fact(o.api_fault)),
        ("api_mission_candidate", printMining_Threat_Retreat_SupervisorMission_Proposal(o.api_mission_candidate)),
        ("api_phase_state", printMining_Threat_Retreat_SupervisorPhase_State_Input(o.api_phase_state)),
        ("api_resource_publication", printMining_Threat_Retreat_SupervisorResource_Publication_Facts(o.api_resource_publication)),
        ("api_response_candidate", printMining_Threat_Retreat_SupervisorResponse_Proposal(o.api_response_candidate)),
        ("api_threat_publication", printMining_Threat_Retreat_SupervisorThreat_Publication_Facts(o.api_threat_publication))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container(o: Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container): ST = {
      o match {
        case o: Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container_P => return printMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container_PS => return printMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_PS(o)
      }
    }

    @pure def printMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_P(o: Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container_P""""),
        ("api_phase_context", printMining_Threat_Retreat_SupervisorPhase_Context(o.api_phase_context)),
        ("api_resolved_atomic_result", printMining_Threat_Retreat_SupervisorAtomic_Supervisor_Result(o.api_resolved_atomic_result))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container_PS""""),
        ("api_phase_context", printMining_Threat_Retreat_SupervisorPhase_Context(o.api_phase_context)),
        ("api_resolved_atomic_result", printMining_Threat_Retreat_SupervisorAtomic_Supervisor_Result(o.api_resolved_atomic_result))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container(o: Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container): ST = {
      o match {
        case o: Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container_P => return printMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container_PS => return printMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_PS(o)
      }
    }

    @pure def printMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_P(o: Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container_P""""),
        ("api_atomic_result", printMining_Threat_Retreat_SupervisorAtomic_Supervisor_Result(o.api_atomic_result))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container_PS""""),
        ("api_atomic_result", printMining_Threat_Retreat_SupervisorAtomic_Supervisor_Result(o.api_atomic_result))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container(o: Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container): ST = {
      o match {
        case o: Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container_P => return printMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container_PS => return printMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_PS(o)
      }
    }

    @pure def printMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_P(o: Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container_P""""),
        ("api_publication", printMining_Threat_Retreat_SupervisorPublished_Supervisor_Result(o.api_publication))
      ))
    }

    @pure def printMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container_PS""""),
        ("api_publication", printMining_Threat_Retreat_SupervisorPublished_Supervisor_Result(o.api_publication))
      ))
    }

    @pure def printruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): ST = {
      val value: String = o match {
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_Supervisor_Root_Instance_supervisor_fa_postInit => "Mining_Threat_Retreat_Supervisor_Root_Instance_supervisor_fa_postInit"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_Supervisor_Root_Instance_supervisor_fa_preCompute => "Mining_Threat_Retreat_Supervisor_Root_Instance_supervisor_fa_preCompute"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_Supervisor_Root_Instance_supervisor_fa_postCompute => "Mining_Threat_Retreat_Supervisor_Root_Instance_supervisor_fa_postCompute"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_Supervisor_Root_Instance_supervisor_tq_postInit => "Mining_Threat_Retreat_Supervisor_Root_Instance_supervisor_tq_postInit"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_Supervisor_Root_Instance_supervisor_tq_preCompute => "Mining_Threat_Retreat_Supervisor_Root_Instance_supervisor_tq_preCompute"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_Supervisor_Root_Instance_supervisor_tq_postCompute => "Mining_Threat_Retreat_Supervisor_Root_Instance_supervisor_tq_postCompute"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_Supervisor_Root_Instance_supervisor_rq_postInit => "Mining_Threat_Retreat_Supervisor_Root_Instance_supervisor_rq_postInit"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_Supervisor_Root_Instance_supervisor_rq_preCompute => "Mining_Threat_Retreat_Supervisor_Root_Instance_supervisor_rq_preCompute"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_Supervisor_Root_Instance_supervisor_rq_postCompute => "Mining_Threat_Retreat_Supervisor_Root_Instance_supervisor_rq_postCompute"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_Supervisor_Root_Instance_supervisor_pq_postInit => "Mining_Threat_Retreat_Supervisor_Root_Instance_supervisor_pq_postInit"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_Supervisor_Root_Instance_supervisor_pq_preCompute => "Mining_Threat_Retreat_Supervisor_Root_Instance_supervisor_pq_preCompute"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_Supervisor_Root_Instance_supervisor_pq_postCompute => "Mining_Threat_Retreat_Supervisor_Root_Instance_supervisor_pq_postCompute"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_Supervisor_Root_Instance_supervisor_mr_postInit => "Mining_Threat_Retreat_Supervisor_Root_Instance_supervisor_mr_postInit"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_Supervisor_Root_Instance_supervisor_mr_preCompute => "Mining_Threat_Retreat_Supervisor_Root_Instance_supervisor_mr_preCompute"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_Supervisor_Root_Instance_supervisor_mr_postCompute => "Mining_Threat_Retreat_Supervisor_Root_Instance_supervisor_mr_postCompute"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_Supervisor_Root_Instance_supervisor_tr_postInit => "Mining_Threat_Retreat_Supervisor_Root_Instance_supervisor_tr_postInit"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_Supervisor_Root_Instance_supervisor_tr_preCompute => "Mining_Threat_Retreat_Supervisor_Root_Instance_supervisor_tr_preCompute"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_Supervisor_Root_Instance_supervisor_tr_postCompute => "Mining_Threat_Retreat_Supervisor_Root_Instance_supervisor_tr_postCompute"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_Supervisor_Root_Instance_supervisor_arb_postInit => "Mining_Threat_Retreat_Supervisor_Root_Instance_supervisor_arb_postInit"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_Supervisor_Root_Instance_supervisor_arb_preCompute => "Mining_Threat_Retreat_Supervisor_Root_Instance_supervisor_arb_preCompute"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_Supervisor_Root_Instance_supervisor_arb_postCompute => "Mining_Threat_Retreat_Supervisor_Root_Instance_supervisor_arb_postCompute"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_Supervisor_Root_Instance_supervisor_ap_postInit => "Mining_Threat_Retreat_Supervisor_Root_Instance_supervisor_ap_postInit"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_Supervisor_Root_Instance_supervisor_ap_preCompute => "Mining_Threat_Retreat_Supervisor_Root_Instance_supervisor_ap_preCompute"
        case runtimemonitor.ObservationKind.Mining_Threat_Retreat_Supervisor_Root_Instance_supervisor_ap_postCompute => "Mining_Threat_Retreat_Supervisor_Root_Instance_supervisor_ap_postCompute"
      }
      return printObject(ISZ(
        ("type", printString("runtimemonitor.ObservationKind")),
        ("value", printString(value))
      ))
    }

    @pure def printutilContainer(o: util.Container): ST = {
      o match {
        case o: util.EmptyContainer => return printutilEmptyContainer(o)
        case o: Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container_P => return printMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container_PS => return printMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container_P => return printMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container_PS => return printMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container_P => return printMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container_PS => return printMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container_P => return printMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container_PS => return printMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container_P => return printMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container_PS => return printMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container_P => return printMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container_PS => return printMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container_P => return printMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container_PS => return printMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container_P => return printMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container_PS => return printMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container_P => return printMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container_PS => return printMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container_P => return printMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container_PS => return printMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container_P => return printMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container_PS => return printMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container_P => return printMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container_PS => return printMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container_P => return printMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container_PS => return printMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container_P => return printMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container_PS => return printMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container_P => return printMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container_PS => return printMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container_P => return printMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container_PS => return printMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_PS(o)
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
        case o: Mining_Threat_Retreat_Supervisor.Fault_Fact_Payload => return printMining_Threat_Retreat_SupervisorFault_Fact_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Arrival_Fact_Payload => return printMining_Threat_Retreat_SupervisorArrival_Fact_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Defense_Facts_Payload => return printMining_Threat_Retreat_SupervisorDefense_Facts_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Phase_Context_Payload => return printMining_Threat_Retreat_SupervisorPhase_Context_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Mission_Facts_Payload => return printMining_Threat_Retreat_SupervisorMission_Facts_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Mission_Proposal_Payload => return printMining_Threat_Retreat_SupervisorMission_Proposal_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Qualified_Threat_Payload => return printMining_Threat_Retreat_SupervisorQualified_Threat_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Invalidity_Payload => return printMining_Threat_Retreat_SupervisorThreat_Invalidity_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Phase_State_Input_Payload => return printMining_Threat_Retreat_SupervisorPhase_State_Input_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Response_Proposal_Payload => return printMining_Threat_Retreat_SupervisorResponse_Proposal_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_State_Input_Payload => return printMining_Threat_Retreat_SupervisorThreat_State_Input_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Resource_Invalidity_Payload => return printMining_Threat_Retreat_SupervisorResource_Invalidity_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Mining_Recovery_Facts_Payload => return printMining_Threat_Retreat_SupervisorMining_Recovery_Facts_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Raw_Threat_Observation_Payload => return printMining_Threat_Retreat_SupervisorRaw_Threat_Observation_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Raw_Mission_Observation_Payload => return printMining_Threat_Retreat_SupervisorRaw_Mission_Observation_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Publication_Facts_Payload => return printMining_Threat_Retreat_SupervisorThreat_Publication_Facts_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Mission_Invalidity_Facts_Payload => return printMining_Threat_Retreat_SupervisorMission_Invalidity_Facts_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Atomic_Supervisor_Result_Payload => return printMining_Threat_Retreat_SupervisorAtomic_Supervisor_Result_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Raw_Resource_Observation_Payload => return printMining_Threat_Retreat_SupervisorRaw_Resource_Observation_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Resource_Publication_Facts_Payload => return printMining_Threat_Retreat_SupervisorResource_Publication_Facts_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Published_Supervisor_Result_Payload => return printMining_Threat_Retreat_SupervisorPublished_Supervisor_Result_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container_P => return printMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container_PS => return printMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container_P => return printMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container_PS => return printMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container_P => return printMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container_PS => return printMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container_P => return printMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container_PS => return printMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container_P => return printMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container_PS => return printMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container_P => return printMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container_PS => return printMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container_P => return printMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container_PS => return printMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container_P => return printMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container_PS => return printMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container_P => return printMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container_PS => return printMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container_P => return printMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container_PS => return printMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container_P => return printMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container_PS => return printMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container_P => return printMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container_PS => return printMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container_P => return printMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container_PS => return printMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container_P => return printMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container_PS => return printMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container_P => return printMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container_PS => return printMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container_P => return printMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container_PS => return printMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_PS(o)
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

    def parseMining_Threat_Retreat_SupervisorMission_Invalidity_Facts(): Mining_Threat_Retreat_Supervisor.Mission_Invalidity_Facts = {
      val r = parseMining_Threat_Retreat_SupervisorMission_Invalidity_FactsT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorMission_Invalidity_FactsT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Mission_Invalidity_Facts = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Mission_Invalidity_Facts")
      }
      parser.parseObjectKey("intent_invalid")
      val intent_invalid = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("arrival_invalid")
      val arrival_invalid = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("resupply_invalid")
      val resupply_invalid = parser.parseB()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Mission_Invalidity_Facts(intent_invalid, arrival_invalid, resupply_invalid)
    }

    def parseMining_Threat_Retreat_SupervisorMission_Invalidity_Facts_Payload(): Mining_Threat_Retreat_Supervisor.Mission_Invalidity_Facts_Payload = {
      val r = parseMining_Threat_Retreat_SupervisorMission_Invalidity_Facts_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorMission_Invalidity_Facts_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Mission_Invalidity_Facts_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Mission_Invalidity_Facts_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisorMission_Invalidity_Facts()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Mission_Invalidity_Facts_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisorThreat_Invalidity(): Mining_Threat_Retreat_Supervisor.Threat_Invalidity = {
      val r = parseMining_Threat_Retreat_SupervisorThreat_InvalidityT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorThreat_InvalidityT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Threat_Invalidity = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Threat_Invalidity")
      }
      parser.parseObjectKey("threat_invalid")
      val threat_invalid = parser.parseB()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Threat_Invalidity(threat_invalid)
    }

    def parseMining_Threat_Retreat_SupervisorThreat_Invalidity_Payload(): Mining_Threat_Retreat_Supervisor.Threat_Invalidity_Payload = {
      val r = parseMining_Threat_Retreat_SupervisorThreat_Invalidity_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorThreat_Invalidity_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Threat_Invalidity_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Threat_Invalidity_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisorThreat_Invalidity()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Threat_Invalidity_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisorResource_Invalidity(): Mining_Threat_Retreat_Supervisor.Resource_Invalidity = {
      val r = parseMining_Threat_Retreat_SupervisorResource_InvalidityT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorResource_InvalidityT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Resource_Invalidity = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Resource_Invalidity")
      }
      parser.parseObjectKey("resource_invalid")
      val resource_invalid = parser.parseB()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Resource_Invalidity(resource_invalid)
    }

    def parseMining_Threat_Retreat_SupervisorResource_Invalidity_Payload(): Mining_Threat_Retreat_Supervisor.Resource_Invalidity_Payload = {
      val r = parseMining_Threat_Retreat_SupervisorResource_Invalidity_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorResource_Invalidity_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Resource_Invalidity_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Resource_Invalidity_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisorResource_Invalidity()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Resource_Invalidity_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisorMining_Recovery_Facts(): Mining_Threat_Retreat_Supervisor.Mining_Recovery_Facts = {
      val r = parseMining_Threat_Retreat_SupervisorMining_Recovery_FactsT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorMining_Recovery_FactsT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Mining_Recovery_Facts = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Mining_Recovery_Facts")
      }
      parser.parseObjectKey("mine_ready")
      val mine_ready = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("resource_reset")
      val resource_reset = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("cargo_or_capacitor_retreat")
      val cargo_or_capacitor_retreat = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("target_or_mining_block")
      val target_or_mining_block = parser.parseB()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Mining_Recovery_Facts(mine_ready, resource_reset, cargo_or_capacitor_retreat, target_or_mining_block)
    }

    def parseMining_Threat_Retreat_SupervisorMining_Recovery_Facts_Payload(): Mining_Threat_Retreat_Supervisor.Mining_Recovery_Facts_Payload = {
      val r = parseMining_Threat_Retreat_SupervisorMining_Recovery_Facts_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorMining_Recovery_Facts_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Mining_Recovery_Facts_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Mining_Recovery_Facts_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisorMining_Recovery_Facts()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Mining_Recovery_Facts_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisorDefense_Facts(): Mining_Threat_Retreat_Supervisor.Defense_Facts = {
      val r = parseMining_Threat_Retreat_SupervisorDefense_FactsT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorDefense_FactsT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Defense_Facts = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Defense_Facts")
      }
      parser.parseObjectKey("defense_ready")
      val defense_ready = parser.parseB()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Defense_Facts(defense_ready)
    }

    def parseMining_Threat_Retreat_SupervisorDefense_Facts_Payload(): Mining_Threat_Retreat_Supervisor.Defense_Facts_Payload = {
      val r = parseMining_Threat_Retreat_SupervisorDefense_Facts_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorDefense_Facts_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Defense_Facts_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Defense_Facts_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisorDefense_Facts()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Defense_Facts_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisorMission_Facts(): Mining_Threat_Retreat_Supervisor.Mission_Facts = {
      val r = parseMining_Threat_Retreat_SupervisorMission_FactsT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorMission_FactsT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Mission_Facts = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Mission_Facts")
      }
      parser.parseObjectKey("valid_mine")
      val valid_mine = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("invalid_or_return")
      val invalid_or_return = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("valid_hold_or_return")
      val valid_hold_or_return = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("valid_complete_resupply")
      val valid_complete_resupply = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("intent_invalid")
      val intent_invalid = parser.parseB()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Mission_Facts(valid_mine, invalid_or_return, valid_hold_or_return, valid_complete_resupply, intent_invalid)
    }

    def parseMining_Threat_Retreat_SupervisorMission_Facts_Payload(): Mining_Threat_Retreat_Supervisor.Mission_Facts_Payload = {
      val r = parseMining_Threat_Retreat_SupervisorMission_Facts_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorMission_Facts_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Mission_Facts_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Mission_Facts_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisorMission_Facts()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Mission_Facts_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisorArrival_Fact(): Mining_Threat_Retreat_Supervisor.Arrival_Fact = {
      val r = parseMining_Threat_Retreat_SupervisorArrival_FactT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorArrival_FactT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Arrival_Fact = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Arrival_Fact")
      }
      parser.parseObjectKey("valid_safe_at_station")
      val valid_safe_at_station = parser.parseB()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Arrival_Fact(valid_safe_at_station)
    }

    def parseMining_Threat_Retreat_SupervisorArrival_Fact_Payload(): Mining_Threat_Retreat_Supervisor.Arrival_Fact_Payload = {
      val r = parseMining_Threat_Retreat_SupervisorArrival_Fact_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorArrival_Fact_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Arrival_Fact_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Arrival_Fact_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisorArrival_Fact()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Arrival_Fact_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisorPhase_Context(): Mining_Threat_Retreat_Supervisor.Phase_Context = {
      val r = parseMining_Threat_Retreat_SupervisorPhase_ContextT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorPhase_ContextT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Phase_Context = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Phase_Context")
      }
      parser.parseObjectKey("current_phase")
      val current_phase = parser.parseS32()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Phase_Context(current_phase)
    }

    def parseMining_Threat_Retreat_SupervisorPhase_Context_Payload(): Mining_Threat_Retreat_Supervisor.Phase_Context_Payload = {
      val r = parseMining_Threat_Retreat_SupervisorPhase_Context_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorPhase_Context_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Phase_Context_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Phase_Context_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisorPhase_Context()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Phase_Context_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisorFault_Fact(): Mining_Threat_Retreat_Supervisor.Fault_Fact = {
      val r = parseMining_Threat_Retreat_SupervisorFault_FactT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorFault_FactT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Fault_Fact = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Fault_Fact")
      }
      parser.parseObjectKey("fault")
      val fault = parser.parseS32()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Fault_Fact(fault)
    }

    def parseMining_Threat_Retreat_SupervisorFault_Fact_Payload(): Mining_Threat_Retreat_Supervisor.Fault_Fact_Payload = {
      val r = parseMining_Threat_Retreat_SupervisorFault_Fact_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorFault_Fact_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Fault_Fact_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Fault_Fact_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisorFault_Fact()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Fault_Fact_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisorRaw_Threat_Observation(): Mining_Threat_Retreat_Supervisor.Raw_Threat_Observation = {
      val r = parseMining_Threat_Retreat_SupervisorRaw_Threat_ObservationT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorRaw_Threat_ObservationT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Raw_Threat_Observation = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Raw_Threat_Observation")
      }
      parser.parseObjectKey("threat")
      val threat = parser.parseS32()
      parser.parseObjectNext()
      parser.parseObjectKey("threat_validity")
      val threat_validity = parser.parseS32()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Raw_Threat_Observation(threat, threat_validity)
    }

    def parseMining_Threat_Retreat_SupervisorRaw_Threat_Observation_Payload(): Mining_Threat_Retreat_Supervisor.Raw_Threat_Observation_Payload = {
      val r = parseMining_Threat_Retreat_SupervisorRaw_Threat_Observation_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorRaw_Threat_Observation_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Raw_Threat_Observation_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Raw_Threat_Observation_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisorRaw_Threat_Observation()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Raw_Threat_Observation_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisorThreat_State_Input(): Mining_Threat_Retreat_Supervisor.Threat_State_Input = {
      val r = parseMining_Threat_Retreat_SupervisorThreat_State_InputT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorThreat_State_InputT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Threat_State_Input = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Threat_State_Input")
      }
      parser.parseObjectKey("current_valid_streak")
      val current_valid_streak = parser.parseS32()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Threat_State_Input(current_valid_streak)
    }

    def parseMining_Threat_Retreat_SupervisorThreat_State_Input_Payload(): Mining_Threat_Retreat_Supervisor.Threat_State_Input_Payload = {
      val r = parseMining_Threat_Retreat_SupervisorThreat_State_Input_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorThreat_State_Input_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Threat_State_Input_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Threat_State_Input_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisorThreat_State_Input()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Threat_State_Input_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisorQualified_Threat(): Mining_Threat_Retreat_Supervisor.Qualified_Threat = {
      val r = parseMining_Threat_Retreat_SupervisorQualified_ThreatT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorQualified_ThreatT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Qualified_Threat = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Qualified_Threat")
      }
      parser.parseObjectKey("qualified_threat")
      val qualified_threat = parser.parseS32()
      parser.parseObjectNext()
      parser.parseObjectKey("untrusted")
      val untrusted = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("acceptable")
      val acceptable = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("hostile")
      val hostile = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("severe")
      val severe = parser.parseB()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Qualified_Threat(qualified_threat, untrusted, acceptable, hostile, severe)
    }

    def parseMining_Threat_Retreat_SupervisorQualified_Threat_Payload(): Mining_Threat_Retreat_Supervisor.Qualified_Threat_Payload = {
      val r = parseMining_Threat_Retreat_SupervisorQualified_Threat_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorQualified_Threat_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Qualified_Threat_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Qualified_Threat_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisorQualified_Threat()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Qualified_Threat_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisorThreat_Publication_Facts(): Mining_Threat_Retreat_Supervisor.Threat_Publication_Facts = {
      val r = parseMining_Threat_Retreat_SupervisorThreat_Publication_FactsT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorThreat_Publication_FactsT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Threat_Publication_Facts = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Threat_Publication_Facts")
      }
      parser.parseObjectKey("qualified_threat")
      val qualified_threat = parser.parseS32()
      parser.parseObjectNext()
      parser.parseObjectKey("next_valid_streak")
      val next_valid_streak = parser.parseS32()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Threat_Publication_Facts(qualified_threat, next_valid_streak)
    }

    def parseMining_Threat_Retreat_SupervisorThreat_Publication_Facts_Payload(): Mining_Threat_Retreat_Supervisor.Threat_Publication_Facts_Payload = {
      val r = parseMining_Threat_Retreat_SupervisorThreat_Publication_Facts_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorThreat_Publication_Facts_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Threat_Publication_Facts_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Threat_Publication_Facts_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisorThreat_Publication_Facts()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Threat_Publication_Facts_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisorRaw_Resource_Observation(): Mining_Threat_Retreat_Supervisor.Raw_Resource_Observation = {
      val r = parseMining_Threat_Retreat_SupervisorRaw_Resource_ObservationT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorRaw_Resource_ObservationT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Raw_Resource_Observation = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Raw_Resource_Observation")
      }
      parser.parseObjectKey("cargo")
      val cargo = parser.parseS32()
      parser.parseObjectNext()
      parser.parseObjectKey("cargo_validity")
      val cargo_validity = parser.parseS32()
      parser.parseObjectNext()
      parser.parseObjectKey("capacitor")
      val capacitor = parser.parseS32()
      parser.parseObjectNext()
      parser.parseObjectKey("capacitor_validity")
      val capacitor_validity = parser.parseS32()
      parser.parseObjectNext()
      parser.parseObjectKey("target")
      val target = parser.parseS32()
      parser.parseObjectNext()
      parser.parseObjectKey("target_validity")
      val target_validity = parser.parseS32()
      parser.parseObjectNext()
      parser.parseObjectKey("mining_availability")
      val mining_availability = parser.parseS32()
      parser.parseObjectNext()
      parser.parseObjectKey("defense_availability")
      val defense_availability = parser.parseS32()
      parser.parseObjectNext()
      parser.parseObjectKey("retreat_availability")
      val retreat_availability = parser.parseS32()
      parser.parseObjectNext()
      parser.parseObjectKey("availability_validity")
      val availability_validity = parser.parseS32()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Raw_Resource_Observation(cargo, cargo_validity, capacitor, capacitor_validity, target, target_validity, mining_availability, defense_availability, retreat_availability, availability_validity)
    }

    def parseMining_Threat_Retreat_SupervisorRaw_Resource_Observation_Payload(): Mining_Threat_Retreat_Supervisor.Raw_Resource_Observation_Payload = {
      val r = parseMining_Threat_Retreat_SupervisorRaw_Resource_Observation_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorRaw_Resource_Observation_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Raw_Resource_Observation_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Raw_Resource_Observation_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisorRaw_Resource_Observation()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Raw_Resource_Observation_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisorResource_Publication_Facts(): Mining_Threat_Retreat_Supervisor.Resource_Publication_Facts = {
      val r = parseMining_Threat_Retreat_SupervisorResource_Publication_FactsT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorResource_Publication_FactsT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Resource_Publication_Facts = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Resource_Publication_Facts")
      }
      parser.parseObjectKey("cargo_advisory")
      val cargo_advisory = parser.parseS32()
      parser.parseObjectNext()
      parser.parseObjectKey("capacitor_advisory")
      val capacitor_advisory = parser.parseS32()
      parser.parseObjectNext()
      parser.parseObjectKey("retreat_advisory")
      val retreat_advisory = parser.parseS32()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Resource_Publication_Facts(cargo_advisory, capacitor_advisory, retreat_advisory)
    }

    def parseMining_Threat_Retreat_SupervisorResource_Publication_Facts_Payload(): Mining_Threat_Retreat_Supervisor.Resource_Publication_Facts_Payload = {
      val r = parseMining_Threat_Retreat_SupervisorResource_Publication_Facts_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorResource_Publication_Facts_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Resource_Publication_Facts_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Resource_Publication_Facts_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisorResource_Publication_Facts()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Resource_Publication_Facts_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisorRaw_Mission_Observation(): Mining_Threat_Retreat_Supervisor.Raw_Mission_Observation = {
      val r = parseMining_Threat_Retreat_SupervisorRaw_Mission_ObservationT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorRaw_Mission_ObservationT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Raw_Mission_Observation = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Raw_Mission_Observation")
      }
      parser.parseObjectKey("pilot_intent")
      val pilot_intent = parser.parseS32()
      parser.parseObjectNext()
      parser.parseObjectKey("intent_validity")
      val intent_validity = parser.parseS32()
      parser.parseObjectNext()
      parser.parseObjectKey("arrival")
      val arrival = parser.parseS32()
      parser.parseObjectNext()
      parser.parseObjectKey("arrival_validity")
      val arrival_validity = parser.parseS32()
      parser.parseObjectNext()
      parser.parseObjectKey("resupply")
      val resupply = parser.parseS32()
      parser.parseObjectNext()
      parser.parseObjectKey("resupply_validity")
      val resupply_validity = parser.parseS32()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Raw_Mission_Observation(pilot_intent, intent_validity, arrival, arrival_validity, resupply, resupply_validity)
    }

    def parseMining_Threat_Retreat_SupervisorRaw_Mission_Observation_Payload(): Mining_Threat_Retreat_Supervisor.Raw_Mission_Observation_Payload = {
      val r = parseMining_Threat_Retreat_SupervisorRaw_Mission_Observation_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorRaw_Mission_Observation_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Raw_Mission_Observation_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Raw_Mission_Observation_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisorRaw_Mission_Observation()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Raw_Mission_Observation_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisorMission_Proposal(): Mining_Threat_Retreat_Supervisor.Mission_Proposal = {
      val r = parseMining_Threat_Retreat_SupervisorMission_ProposalT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorMission_ProposalT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Mission_Proposal = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Mission_Proposal")
      }
      parser.parseObjectKey("proposed_reason")
      val proposed_reason = parser.parseS32()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Mission_Proposal(proposed_reason)
    }

    def parseMining_Threat_Retreat_SupervisorMission_Proposal_Payload(): Mining_Threat_Retreat_Supervisor.Mission_Proposal_Payload = {
      val r = parseMining_Threat_Retreat_SupervisorMission_Proposal_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorMission_Proposal_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Mission_Proposal_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Mission_Proposal_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisorMission_Proposal()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Mission_Proposal_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisorResponse_Proposal(): Mining_Threat_Retreat_Supervisor.Response_Proposal = {
      val r = parseMining_Threat_Retreat_SupervisorResponse_ProposalT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorResponse_ProposalT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Response_Proposal = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Response_Proposal")
      }
      parser.parseObjectKey("proposed_reason")
      val proposed_reason = parser.parseS32()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Response_Proposal(proposed_reason)
    }

    def parseMining_Threat_Retreat_SupervisorResponse_Proposal_Payload(): Mining_Threat_Retreat_Supervisor.Response_Proposal_Payload = {
      val r = parseMining_Threat_Retreat_SupervisorResponse_Proposal_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorResponse_Proposal_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Response_Proposal_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Response_Proposal_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisorResponse_Proposal()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Response_Proposal_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisorPhase_State_Input(): Mining_Threat_Retreat_Supervisor.Phase_State_Input = {
      val r = parseMining_Threat_Retreat_SupervisorPhase_State_InputT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorPhase_State_InputT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Phase_State_Input = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Phase_State_Input")
      }
      parser.parseObjectKey("current_phase")
      val current_phase = parser.parseS32()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Phase_State_Input(current_phase)
    }

    def parseMining_Threat_Retreat_SupervisorPhase_State_Input_Payload(): Mining_Threat_Retreat_Supervisor.Phase_State_Input_Payload = {
      val r = parseMining_Threat_Retreat_SupervisorPhase_State_Input_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorPhase_State_Input_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Phase_State_Input_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Phase_State_Input_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisorPhase_State_Input()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Phase_State_Input_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisorAtomic_Supervisor_Result(): Mining_Threat_Retreat_Supervisor.Atomic_Supervisor_Result = {
      val r = parseMining_Threat_Retreat_SupervisorAtomic_Supervisor_ResultT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorAtomic_Supervisor_ResultT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Atomic_Supervisor_Result = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Atomic_Supervisor_Result")
      }
      parser.parseObjectKey("command")
      val command = parser.parseS32()
      parser.parseObjectNext()
      parser.parseObjectKey("current_phase")
      val current_phase = parser.parseS32()
      parser.parseObjectNext()
      parser.parseObjectKey("next_phase")
      val next_phase = parser.parseS32()
      parser.parseObjectNext()
      parser.parseObjectKey("reason")
      val reason = parser.parseS32()
      parser.parseObjectNext()
      parser.parseObjectKey("fault")
      val fault = parser.parseS32()
      parser.parseObjectNext()
      parser.parseObjectKey("next_valid_streak")
      val next_valid_streak = parser.parseS32()
      parser.parseObjectNext()
      parser.parseObjectKey("cargo_advisory")
      val cargo_advisory = parser.parseS32()
      parser.parseObjectNext()
      parser.parseObjectKey("capacitor_advisory")
      val capacitor_advisory = parser.parseS32()
      parser.parseObjectNext()
      parser.parseObjectKey("retreat_advisory")
      val retreat_advisory = parser.parseS32()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Atomic_Supervisor_Result(command, current_phase, next_phase, reason, fault, next_valid_streak, cargo_advisory, capacitor_advisory, retreat_advisory)
    }

    def parseMining_Threat_Retreat_SupervisorAtomic_Supervisor_Result_Payload(): Mining_Threat_Retreat_Supervisor.Atomic_Supervisor_Result_Payload = {
      val r = parseMining_Threat_Retreat_SupervisorAtomic_Supervisor_Result_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorAtomic_Supervisor_Result_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Atomic_Supervisor_Result_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Atomic_Supervisor_Result_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisorAtomic_Supervisor_Result()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Atomic_Supervisor_Result_Payload(value)
    }

    def parseMining_Threat_Retreat_SupervisorPublished_Supervisor_Result(): Mining_Threat_Retreat_Supervisor.Published_Supervisor_Result = {
      val r = parseMining_Threat_Retreat_SupervisorPublished_Supervisor_ResultT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorPublished_Supervisor_ResultT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Published_Supervisor_Result = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Published_Supervisor_Result")
      }
      parser.parseObjectKey("command")
      val command = parser.parseS32()
      parser.parseObjectNext()
      parser.parseObjectKey("current_phase")
      val current_phase = parser.parseS32()
      parser.parseObjectNext()
      parser.parseObjectKey("next_phase")
      val next_phase = parser.parseS32()
      parser.parseObjectNext()
      parser.parseObjectKey("reason")
      val reason = parser.parseS32()
      parser.parseObjectNext()
      parser.parseObjectKey("fault")
      val fault = parser.parseS32()
      parser.parseObjectNext()
      parser.parseObjectKey("next_valid_streak")
      val next_valid_streak = parser.parseS32()
      parser.parseObjectNext()
      parser.parseObjectKey("cargo_advisory")
      val cargo_advisory = parser.parseS32()
      parser.parseObjectNext()
      parser.parseObjectKey("capacitor_advisory")
      val capacitor_advisory = parser.parseS32()
      parser.parseObjectNext()
      parser.parseObjectKey("retreat_advisory")
      val retreat_advisory = parser.parseS32()
      parser.parseObjectNext()
      parser.parseObjectKey("laser")
      val laser = parser.parseS32()
      parser.parseObjectNext()
      parser.parseObjectKey("drones")
      val drones = parser.parseS32()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Published_Supervisor_Result(command, current_phase, next_phase, reason, fault, next_valid_streak, cargo_advisory, capacitor_advisory, retreat_advisory, laser, drones)
    }

    def parseMining_Threat_Retreat_SupervisorPublished_Supervisor_Result_Payload(): Mining_Threat_Retreat_Supervisor.Published_Supervisor_Result_Payload = {
      val r = parseMining_Threat_Retreat_SupervisorPublished_Supervisor_Result_PayloadT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorPublished_Supervisor_Result_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Published_Supervisor_Result_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Published_Supervisor_Result_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Threat_Retreat_SupervisorPublished_Supervisor_Result()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Published_Supervisor_Result_Payload(value)
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

    def parseMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container(): Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container_P", "Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container_PS"))
      t.native match {
        case "Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_PST(T); return r
        case _ => val r = parseMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_PST(T); return r
      }
    }

    def parseMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_P(): Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container_P = {
      val r = parseMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_PT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container_P")
      }
      parser.parseObjectKey("api_mission_invalidity")
      val api_mission_invalidity = parseMining_Threat_Retreat_SupervisorMission_Invalidity_Facts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_phase_context")
      val api_phase_context = parseMining_Threat_Retreat_SupervisorPhase_Context()
      parser.parseObjectNext()
      parser.parseObjectKey("api_resource_invalidity")
      val api_resource_invalidity = parseMining_Threat_Retreat_SupervisorResource_Invalidity()
      parser.parseObjectNext()
      parser.parseObjectKey("api_threat_invalidity")
      val api_threat_invalidity = parseMining_Threat_Retreat_SupervisorThreat_Invalidity()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container_P(api_mission_invalidity, api_phase_context, api_resource_invalidity, api_threat_invalidity)
    }

    def parseMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_PS(): Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container_PS = {
      val r = parseMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_PST(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container_PS")
      }
      parser.parseObjectKey("api_mission_invalidity")
      val api_mission_invalidity = parseMining_Threat_Retreat_SupervisorMission_Invalidity_Facts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_phase_context")
      val api_phase_context = parseMining_Threat_Retreat_SupervisorPhase_Context()
      parser.parseObjectNext()
      parser.parseObjectKey("api_resource_invalidity")
      val api_resource_invalidity = parseMining_Threat_Retreat_SupervisorResource_Invalidity()
      parser.parseObjectNext()
      parser.parseObjectKey("api_threat_invalidity")
      val api_threat_invalidity = parseMining_Threat_Retreat_SupervisorThreat_Invalidity()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container_PS(api_mission_invalidity, api_phase_context, api_resource_invalidity, api_threat_invalidity)
    }

    def parseMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container(): Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container_P", "Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container_PS"))
      t.native match {
        case "Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_PST(T); return r
        case _ => val r = parseMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_PST(T); return r
      }
    }

    def parseMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_P(): Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container_P = {
      val r = parseMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_PT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container_P")
      }
      parser.parseObjectKey("api_fault")
      val api_fault = parseMining_Threat_Retreat_SupervisorFault_Fact()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container_P(api_fault)
    }

    def parseMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_PS(): Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container_PS = {
      val r = parseMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_PST(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container_PS")
      }
      parser.parseObjectKey("api_fault")
      val api_fault = parseMining_Threat_Retreat_SupervisorFault_Fact()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container_PS(api_fault)
    }

    def parseMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container(): Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container_P", "Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container_PS"))
      t.native match {
        case "Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_PST(T); return r
        case _ => val r = parseMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_PST(T); return r
      }
    }

    def parseMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_P(): Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container_P = {
      val r = parseMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_PT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container_P")
      }
      parser.parseObjectKey("api_raw_threat")
      val api_raw_threat = parseMining_Threat_Retreat_SupervisorRaw_Threat_Observation()
      parser.parseObjectNext()
      parser.parseObjectKey("api_streak_state")
      val api_streak_state = parseMining_Threat_Retreat_SupervisorThreat_State_Input()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container_P(api_raw_threat, api_streak_state)
    }

    def parseMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_PS(): Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container_PS = {
      val r = parseMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_PST(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container_PS")
      }
      parser.parseObjectKey("api_raw_threat")
      val api_raw_threat = parseMining_Threat_Retreat_SupervisorRaw_Threat_Observation()
      parser.parseObjectNext()
      parser.parseObjectKey("api_streak_state")
      val api_streak_state = parseMining_Threat_Retreat_SupervisorThreat_State_Input()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container_PS(api_raw_threat, api_streak_state)
    }

    def parseMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container(): Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container_P", "Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container_PS"))
      t.native match {
        case "Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_PST(T); return r
        case _ => val r = parseMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_PST(T); return r
      }
    }

    def parseMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_P(): Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container_P = {
      val r = parseMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_PT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container_P")
      }
      parser.parseObjectKey("api_qualified_threat")
      val api_qualified_threat = parseMining_Threat_Retreat_SupervisorQualified_Threat()
      parser.parseObjectNext()
      parser.parseObjectKey("api_threat_invalidity")
      val api_threat_invalidity = parseMining_Threat_Retreat_SupervisorThreat_Invalidity()
      parser.parseObjectNext()
      parser.parseObjectKey("api_threat_publication")
      val api_threat_publication = parseMining_Threat_Retreat_SupervisorThreat_Publication_Facts()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container_P(api_qualified_threat, api_threat_invalidity, api_threat_publication)
    }

    def parseMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_PS(): Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container_PS = {
      val r = parseMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_PST(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container_PS")
      }
      parser.parseObjectKey("api_qualified_threat")
      val api_qualified_threat = parseMining_Threat_Retreat_SupervisorQualified_Threat()
      parser.parseObjectNext()
      parser.parseObjectKey("api_threat_invalidity")
      val api_threat_invalidity = parseMining_Threat_Retreat_SupervisorThreat_Invalidity()
      parser.parseObjectNext()
      parser.parseObjectKey("api_threat_publication")
      val api_threat_publication = parseMining_Threat_Retreat_SupervisorThreat_Publication_Facts()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container_PS(api_qualified_threat, api_threat_invalidity, api_threat_publication)
    }

    def parseMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container(): Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container_P", "Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container_PS"))
      t.native match {
        case "Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_PST(T); return r
        case _ => val r = parseMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_PST(T); return r
      }
    }

    def parseMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_P(): Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container_P = {
      val r = parseMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_PT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container_P")
      }
      parser.parseObjectKey("api_raw_resources")
      val api_raw_resources = parseMining_Threat_Retreat_SupervisorRaw_Resource_Observation()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container_P(api_raw_resources)
    }

    def parseMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_PS(): Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container_PS = {
      val r = parseMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_PST(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container_PS")
      }
      parser.parseObjectKey("api_raw_resources")
      val api_raw_resources = parseMining_Threat_Retreat_SupervisorRaw_Resource_Observation()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container_PS(api_raw_resources)
    }

    def parseMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container(): Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container_P", "Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container_PS"))
      t.native match {
        case "Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_PST(T); return r
        case _ => val r = parseMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_PST(T); return r
      }
    }

    def parseMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_P(): Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container_P = {
      val r = parseMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_PT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container_P")
      }
      parser.parseObjectKey("api_defense_facts")
      val api_defense_facts = parseMining_Threat_Retreat_SupervisorDefense_Facts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_mining_recovery_facts")
      val api_mining_recovery_facts = parseMining_Threat_Retreat_SupervisorMining_Recovery_Facts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_resource_invalidity")
      val api_resource_invalidity = parseMining_Threat_Retreat_SupervisorResource_Invalidity()
      parser.parseObjectNext()
      parser.parseObjectKey("api_resource_publication")
      val api_resource_publication = parseMining_Threat_Retreat_SupervisorResource_Publication_Facts()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container_P(api_defense_facts, api_mining_recovery_facts, api_resource_invalidity, api_resource_publication)
    }

    def parseMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_PS(): Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container_PS = {
      val r = parseMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_PST(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container_PS")
      }
      parser.parseObjectKey("api_defense_facts")
      val api_defense_facts = parseMining_Threat_Retreat_SupervisorDefense_Facts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_mining_recovery_facts")
      val api_mining_recovery_facts = parseMining_Threat_Retreat_SupervisorMining_Recovery_Facts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_resource_invalidity")
      val api_resource_invalidity = parseMining_Threat_Retreat_SupervisorResource_Invalidity()
      parser.parseObjectNext()
      parser.parseObjectKey("api_resource_publication")
      val api_resource_publication = parseMining_Threat_Retreat_SupervisorResource_Publication_Facts()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container_PS(api_defense_facts, api_mining_recovery_facts, api_resource_invalidity, api_resource_publication)
    }

    def parseMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container(): Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container_P", "Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container_PS"))
      t.native match {
        case "Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_PST(T); return r
        case _ => val r = parseMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_PST(T); return r
      }
    }

    def parseMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_P(): Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container_P = {
      val r = parseMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_PT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container_P")
      }
      parser.parseObjectKey("api_raw_mission")
      val api_raw_mission = parseMining_Threat_Retreat_SupervisorRaw_Mission_Observation()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container_P(api_raw_mission)
    }

    def parseMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_PS(): Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container_PS = {
      val r = parseMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_PST(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container_PS")
      }
      parser.parseObjectKey("api_raw_mission")
      val api_raw_mission = parseMining_Threat_Retreat_SupervisorRaw_Mission_Observation()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container_PS(api_raw_mission)
    }

    def parseMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container(): Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container_P", "Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container_PS"))
      t.native match {
        case "Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_PST(T); return r
        case _ => val r = parseMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_PST(T); return r
      }
    }

    def parseMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_P(): Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container_P = {
      val r = parseMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_PT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container_P")
      }
      parser.parseObjectKey("api_arrival_fact")
      val api_arrival_fact = parseMining_Threat_Retreat_SupervisorArrival_Fact()
      parser.parseObjectNext()
      parser.parseObjectKey("api_mission_facts")
      val api_mission_facts = parseMining_Threat_Retreat_SupervisorMission_Facts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_mission_invalidity")
      val api_mission_invalidity = parseMining_Threat_Retreat_SupervisorMission_Invalidity_Facts()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container_P(api_arrival_fact, api_mission_facts, api_mission_invalidity)
    }

    def parseMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_PS(): Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container_PS = {
      val r = parseMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_PST(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container_PS")
      }
      parser.parseObjectKey("api_arrival_fact")
      val api_arrival_fact = parseMining_Threat_Retreat_SupervisorArrival_Fact()
      parser.parseObjectNext()
      parser.parseObjectKey("api_mission_facts")
      val api_mission_facts = parseMining_Threat_Retreat_SupervisorMission_Facts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_mission_invalidity")
      val api_mission_invalidity = parseMining_Threat_Retreat_SupervisorMission_Invalidity_Facts()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container_PS(api_arrival_fact, api_mission_facts, api_mission_invalidity)
    }

    def parseMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container(): Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container_P", "Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container_PS"))
      t.native match {
        case "Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_PST(T); return r
        case _ => val r = parseMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_PST(T); return r
      }
    }

    def parseMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_P(): Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container_P = {
      val r = parseMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_PT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container_P")
      }
      parser.parseObjectKey("api_mission_facts")
      val api_mission_facts = parseMining_Threat_Retreat_SupervisorMission_Facts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_phase_context")
      val api_phase_context = parseMining_Threat_Retreat_SupervisorPhase_Context()
      parser.parseObjectNext()
      parser.parseObjectKey("api_resource_facts")
      val api_resource_facts = parseMining_Threat_Retreat_SupervisorMining_Recovery_Facts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_threat_fact")
      val api_threat_fact = parseMining_Threat_Retreat_SupervisorQualified_Threat()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container_P(api_mission_facts, api_phase_context, api_resource_facts, api_threat_fact)
    }

    def parseMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_PS(): Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container_PS = {
      val r = parseMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_PST(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container_PS")
      }
      parser.parseObjectKey("api_mission_facts")
      val api_mission_facts = parseMining_Threat_Retreat_SupervisorMission_Facts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_phase_context")
      val api_phase_context = parseMining_Threat_Retreat_SupervisorPhase_Context()
      parser.parseObjectNext()
      parser.parseObjectKey("api_resource_facts")
      val api_resource_facts = parseMining_Threat_Retreat_SupervisorMining_Recovery_Facts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_threat_fact")
      val api_threat_fact = parseMining_Threat_Retreat_SupervisorQualified_Threat()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container_PS(api_mission_facts, api_phase_context, api_resource_facts, api_threat_fact)
    }

    def parseMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container(): Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container_P", "Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container_PS"))
      t.native match {
        case "Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_PST(T); return r
        case _ => val r = parseMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_PST(T); return r
      }
    }

    def parseMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_P(): Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container_P = {
      val r = parseMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_PT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container_P")
      }
      parser.parseObjectKey("api_mission_proposal")
      val api_mission_proposal = parseMining_Threat_Retreat_SupervisorMission_Proposal()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container_P(api_mission_proposal)
    }

    def parseMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_PS(): Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container_PS = {
      val r = parseMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_PST(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container_PS")
      }
      parser.parseObjectKey("api_mission_proposal")
      val api_mission_proposal = parseMining_Threat_Retreat_SupervisorMission_Proposal()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container_PS(api_mission_proposal)
    }

    def parseMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container(): Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container_P", "Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container_PS"))
      t.native match {
        case "Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_PST(T); return r
        case _ => val r = parseMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_PST(T); return r
      }
    }

    def parseMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_P(): Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container_P = {
      val r = parseMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_PT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container_P")
      }
      parser.parseObjectKey("api_arrival_fact")
      val api_arrival_fact = parseMining_Threat_Retreat_SupervisorArrival_Fact()
      parser.parseObjectNext()
      parser.parseObjectKey("api_defense_facts")
      val api_defense_facts = parseMining_Threat_Retreat_SupervisorDefense_Facts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_phase_context")
      val api_phase_context = parseMining_Threat_Retreat_SupervisorPhase_Context()
      parser.parseObjectNext()
      parser.parseObjectKey("api_threat_fact")
      val api_threat_fact = parseMining_Threat_Retreat_SupervisorQualified_Threat()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container_P(api_arrival_fact, api_defense_facts, api_phase_context, api_threat_fact)
    }

    def parseMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_PS(): Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container_PS = {
      val r = parseMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_PST(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container_PS")
      }
      parser.parseObjectKey("api_arrival_fact")
      val api_arrival_fact = parseMining_Threat_Retreat_SupervisorArrival_Fact()
      parser.parseObjectNext()
      parser.parseObjectKey("api_defense_facts")
      val api_defense_facts = parseMining_Threat_Retreat_SupervisorDefense_Facts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_phase_context")
      val api_phase_context = parseMining_Threat_Retreat_SupervisorPhase_Context()
      parser.parseObjectNext()
      parser.parseObjectKey("api_threat_fact")
      val api_threat_fact = parseMining_Threat_Retreat_SupervisorQualified_Threat()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container_PS(api_arrival_fact, api_defense_facts, api_phase_context, api_threat_fact)
    }

    def parseMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container(): Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container_P", "Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container_PS"))
      t.native match {
        case "Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_PST(T); return r
        case _ => val r = parseMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_PST(T); return r
      }
    }

    def parseMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_P(): Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container_P = {
      val r = parseMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_PT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container_P")
      }
      parser.parseObjectKey("api_response_proposal")
      val api_response_proposal = parseMining_Threat_Retreat_SupervisorResponse_Proposal()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container_P(api_response_proposal)
    }

    def parseMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_PS(): Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container_PS = {
      val r = parseMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_PST(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container_PS")
      }
      parser.parseObjectKey("api_response_proposal")
      val api_response_proposal = parseMining_Threat_Retreat_SupervisorResponse_Proposal()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container_PS(api_response_proposal)
    }

    def parseMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container(): Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container_P", "Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container_PS"))
      t.native match {
        case "Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_PST(T); return r
        case _ => val r = parseMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_PST(T); return r
      }
    }

    def parseMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_P(): Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container_P = {
      val r = parseMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_PT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container_P")
      }
      parser.parseObjectKey("api_fault")
      val api_fault = parseMining_Threat_Retreat_SupervisorFault_Fact()
      parser.parseObjectNext()
      parser.parseObjectKey("api_mission_candidate")
      val api_mission_candidate = parseMining_Threat_Retreat_SupervisorMission_Proposal()
      parser.parseObjectNext()
      parser.parseObjectKey("api_phase_state")
      val api_phase_state = parseMining_Threat_Retreat_SupervisorPhase_State_Input()
      parser.parseObjectNext()
      parser.parseObjectKey("api_resource_publication")
      val api_resource_publication = parseMining_Threat_Retreat_SupervisorResource_Publication_Facts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_response_candidate")
      val api_response_candidate = parseMining_Threat_Retreat_SupervisorResponse_Proposal()
      parser.parseObjectNext()
      parser.parseObjectKey("api_threat_publication")
      val api_threat_publication = parseMining_Threat_Retreat_SupervisorThreat_Publication_Facts()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container_P(api_fault, api_mission_candidate, api_phase_state, api_resource_publication, api_response_candidate, api_threat_publication)
    }

    def parseMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_PS(): Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container_PS = {
      val r = parseMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_PST(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container_PS")
      }
      parser.parseObjectKey("api_fault")
      val api_fault = parseMining_Threat_Retreat_SupervisorFault_Fact()
      parser.parseObjectNext()
      parser.parseObjectKey("api_mission_candidate")
      val api_mission_candidate = parseMining_Threat_Retreat_SupervisorMission_Proposal()
      parser.parseObjectNext()
      parser.parseObjectKey("api_phase_state")
      val api_phase_state = parseMining_Threat_Retreat_SupervisorPhase_State_Input()
      parser.parseObjectNext()
      parser.parseObjectKey("api_resource_publication")
      val api_resource_publication = parseMining_Threat_Retreat_SupervisorResource_Publication_Facts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_response_candidate")
      val api_response_candidate = parseMining_Threat_Retreat_SupervisorResponse_Proposal()
      parser.parseObjectNext()
      parser.parseObjectKey("api_threat_publication")
      val api_threat_publication = parseMining_Threat_Retreat_SupervisorThreat_Publication_Facts()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container_PS(api_fault, api_mission_candidate, api_phase_state, api_resource_publication, api_response_candidate, api_threat_publication)
    }

    def parseMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container(): Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container_P", "Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container_PS"))
      t.native match {
        case "Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_PST(T); return r
        case _ => val r = parseMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_PST(T); return r
      }
    }

    def parseMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_P(): Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container_P = {
      val r = parseMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_PT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container_P")
      }
      parser.parseObjectKey("api_phase_context")
      val api_phase_context = parseMining_Threat_Retreat_SupervisorPhase_Context()
      parser.parseObjectNext()
      parser.parseObjectKey("api_resolved_atomic_result")
      val api_resolved_atomic_result = parseMining_Threat_Retreat_SupervisorAtomic_Supervisor_Result()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container_P(api_phase_context, api_resolved_atomic_result)
    }

    def parseMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_PS(): Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container_PS = {
      val r = parseMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_PST(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container_PS")
      }
      parser.parseObjectKey("api_phase_context")
      val api_phase_context = parseMining_Threat_Retreat_SupervisorPhase_Context()
      parser.parseObjectNext()
      parser.parseObjectKey("api_resolved_atomic_result")
      val api_resolved_atomic_result = parseMining_Threat_Retreat_SupervisorAtomic_Supervisor_Result()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container_PS(api_phase_context, api_resolved_atomic_result)
    }

    def parseMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container(): Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container_P", "Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container_PS"))
      t.native match {
        case "Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_PST(T); return r
        case _ => val r = parseMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_PST(T); return r
      }
    }

    def parseMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_P(): Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container_P = {
      val r = parseMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_PT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container_P")
      }
      parser.parseObjectKey("api_atomic_result")
      val api_atomic_result = parseMining_Threat_Retreat_SupervisorAtomic_Supervisor_Result()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container_P(api_atomic_result)
    }

    def parseMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_PS(): Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container_PS = {
      val r = parseMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_PST(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container_PS")
      }
      parser.parseObjectKey("api_atomic_result")
      val api_atomic_result = parseMining_Threat_Retreat_SupervisorAtomic_Supervisor_Result()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container_PS(api_atomic_result)
    }

    def parseMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container(): Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container_P", "Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container_PS"))
      t.native match {
        case "Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_PST(T); return r
        case _ => val r = parseMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_PST(T); return r
      }
    }

    def parseMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_P(): Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container_P = {
      val r = parseMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_PT(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container_P")
      }
      parser.parseObjectKey("api_publication")
      val api_publication = parseMining_Threat_Retreat_SupervisorPublished_Supervisor_Result()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container_P(api_publication)
    }

    def parseMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_PS(): Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container_PS = {
      val r = parseMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_PST(F)
      return r
    }

    def parseMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container_PS")
      }
      parser.parseObjectKey("api_publication")
      val api_publication = parseMining_Threat_Retreat_SupervisorPublished_Supervisor_Result()
      parser.parseObjectNext()
      return Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container_PS(api_publication)
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
      val t = parser.parseObjectTypes(ISZ("util.EmptyContainer", "Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container_P", "Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container_PS", "Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container_P", "Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container_PS", "Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container_P", "Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container_PS", "Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container_P", "Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container_PS", "Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container_P", "Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container_PS", "Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container_P", "Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container_PS", "Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container_P", "Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container_PS", "Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container_P", "Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container_PS", "Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container_P", "Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container_PS", "Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container_P", "Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container_PS", "Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container_P", "Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container_PS", "Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container_P", "Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container_PS", "Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container_P", "Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container_PS", "Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container_P", "Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container_PS", "Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container_P", "Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container_PS", "Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container_P", "Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container_PS"))
      t.native match {
        case "util.EmptyContainer" => val r = parseutilEmptyContainerT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_PST(T); return r
        case _ => val r = parseMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_PST(T); return r
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
      val t = parser.parseObjectTypes(ISZ("art.Empty", "Base_Types.Boolean_Payload", "Base_Types.Integer_Payload", "Base_Types.Integer_8_Payload", "Base_Types.Integer_16_Payload", "Base_Types.Integer_32_Payload", "Base_Types.Integer_64_Payload", "Base_Types.Unsigned_8_Payload", "Base_Types.Unsigned_16_Payload", "Base_Types.Unsigned_32_Payload", "Base_Types.Unsigned_64_Payload", "Base_Types.Float_Payload", "Base_Types.Float_32_Payload", "Base_Types.Float_64_Payload", "Base_Types.Character_Payload", "Base_Types.String_Payload", "Base_Types.Bits_Payload", "util.EmptyContainer", "Mining_Threat_Retreat_Supervisor.Fault_Fact_Payload", "Mining_Threat_Retreat_Supervisor.Arrival_Fact_Payload", "Mining_Threat_Retreat_Supervisor.Defense_Facts_Payload", "Mining_Threat_Retreat_Supervisor.Phase_Context_Payload", "Mining_Threat_Retreat_Supervisor.Mission_Facts_Payload", "Mining_Threat_Retreat_Supervisor.Mission_Proposal_Payload", "Mining_Threat_Retreat_Supervisor.Qualified_Threat_Payload", "Mining_Threat_Retreat_Supervisor.Threat_Invalidity_Payload", "Mining_Threat_Retreat_Supervisor.Phase_State_Input_Payload", "Mining_Threat_Retreat_Supervisor.Response_Proposal_Payload", "Mining_Threat_Retreat_Supervisor.Threat_State_Input_Payload", "Mining_Threat_Retreat_Supervisor.Resource_Invalidity_Payload", "Mining_Threat_Retreat_Supervisor.Mining_Recovery_Facts_Payload", "Mining_Threat_Retreat_Supervisor.Raw_Threat_Observation_Payload", "Mining_Threat_Retreat_Supervisor.Raw_Mission_Observation_Payload", "Mining_Threat_Retreat_Supervisor.Threat_Publication_Facts_Payload", "Mining_Threat_Retreat_Supervisor.Mission_Invalidity_Facts_Payload", "Mining_Threat_Retreat_Supervisor.Atomic_Supervisor_Result_Payload", "Mining_Threat_Retreat_Supervisor.Raw_Resource_Observation_Payload", "Mining_Threat_Retreat_Supervisor.Resource_Publication_Facts_Payload", "Mining_Threat_Retreat_Supervisor.Published_Supervisor_Result_Payload", "Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container_P", "Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container_PS", "Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container_P", "Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container_PS", "Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container_P", "Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container_PS", "Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container_P", "Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container_PS", "Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container_P", "Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container_PS", "Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container_P", "Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container_PS", "Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container_P", "Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container_PS", "Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container_P", "Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container_PS", "Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container_P", "Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container_PS", "Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container_P", "Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container_PS", "Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container_P", "Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container_PS", "Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container_P", "Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container_PS", "Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container_P", "Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container_PS", "Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container_P", "Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container_PS", "Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container_P", "Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container_PS", "Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container_P", "Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container_PS"))
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
        case "Mining_Threat_Retreat_Supervisor.Fault_Fact_Payload" => val r = parseMining_Threat_Retreat_SupervisorFault_Fact_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Arrival_Fact_Payload" => val r = parseMining_Threat_Retreat_SupervisorArrival_Fact_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Defense_Facts_Payload" => val r = parseMining_Threat_Retreat_SupervisorDefense_Facts_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Phase_Context_Payload" => val r = parseMining_Threat_Retreat_SupervisorPhase_Context_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Mission_Facts_Payload" => val r = parseMining_Threat_Retreat_SupervisorMission_Facts_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Mission_Proposal_Payload" => val r = parseMining_Threat_Retreat_SupervisorMission_Proposal_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Qualified_Threat_Payload" => val r = parseMining_Threat_Retreat_SupervisorQualified_Threat_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Threat_Invalidity_Payload" => val r = parseMining_Threat_Retreat_SupervisorThreat_Invalidity_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Phase_State_Input_Payload" => val r = parseMining_Threat_Retreat_SupervisorPhase_State_Input_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Response_Proposal_Payload" => val r = parseMining_Threat_Retreat_SupervisorResponse_Proposal_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Threat_State_Input_Payload" => val r = parseMining_Threat_Retreat_SupervisorThreat_State_Input_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Resource_Invalidity_Payload" => val r = parseMining_Threat_Retreat_SupervisorResource_Invalidity_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Mining_Recovery_Facts_Payload" => val r = parseMining_Threat_Retreat_SupervisorMining_Recovery_Facts_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Raw_Threat_Observation_Payload" => val r = parseMining_Threat_Retreat_SupervisorRaw_Threat_Observation_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Raw_Mission_Observation_Payload" => val r = parseMining_Threat_Retreat_SupervisorRaw_Mission_Observation_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Threat_Publication_Facts_Payload" => val r = parseMining_Threat_Retreat_SupervisorThreat_Publication_Facts_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Mission_Invalidity_Facts_Payload" => val r = parseMining_Threat_Retreat_SupervisorMission_Invalidity_Facts_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Atomic_Supervisor_Result_Payload" => val r = parseMining_Threat_Retreat_SupervisorAtomic_Supervisor_Result_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Raw_Resource_Observation_Payload" => val r = parseMining_Threat_Retreat_SupervisorRaw_Resource_Observation_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Resource_Publication_Facts_Payload" => val r = parseMining_Threat_Retreat_SupervisorResource_Publication_Facts_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Published_Supervisor_Result_Payload" => val r = parseMining_Threat_Retreat_SupervisorPublished_Supervisor_Result_PayloadT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_PST(T); return r
        case "Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container_P" => val r = parseMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_PT(T); return r
        case "Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container_PS" => val r = parseMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_PST(T); return r
        case _ => val r = parseMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_PST(T); return r
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

  def fromMining_Threat_Retreat_SupervisorMission_Invalidity_Facts(o: Mining_Threat_Retreat_Supervisor.Mission_Invalidity_Facts, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorMission_Invalidity_Facts(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorMission_Invalidity_Facts(s: String): Either[Mining_Threat_Retreat_Supervisor.Mission_Invalidity_Facts, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorMission_Invalidity_Facts(parser: Parser): Mining_Threat_Retreat_Supervisor.Mission_Invalidity_Facts = {
      val r = parser.parseMining_Threat_Retreat_SupervisorMission_Invalidity_Facts()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorMission_Invalidity_Facts _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorMission_Invalidity_Facts_Payload(o: Mining_Threat_Retreat_Supervisor.Mission_Invalidity_Facts_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorMission_Invalidity_Facts_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorMission_Invalidity_Facts_Payload(s: String): Either[Mining_Threat_Retreat_Supervisor.Mission_Invalidity_Facts_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorMission_Invalidity_Facts_Payload(parser: Parser): Mining_Threat_Retreat_Supervisor.Mission_Invalidity_Facts_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisorMission_Invalidity_Facts_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorMission_Invalidity_Facts_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorThreat_Invalidity(o: Mining_Threat_Retreat_Supervisor.Threat_Invalidity, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorThreat_Invalidity(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorThreat_Invalidity(s: String): Either[Mining_Threat_Retreat_Supervisor.Threat_Invalidity, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorThreat_Invalidity(parser: Parser): Mining_Threat_Retreat_Supervisor.Threat_Invalidity = {
      val r = parser.parseMining_Threat_Retreat_SupervisorThreat_Invalidity()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorThreat_Invalidity _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorThreat_Invalidity_Payload(o: Mining_Threat_Retreat_Supervisor.Threat_Invalidity_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorThreat_Invalidity_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorThreat_Invalidity_Payload(s: String): Either[Mining_Threat_Retreat_Supervisor.Threat_Invalidity_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorThreat_Invalidity_Payload(parser: Parser): Mining_Threat_Retreat_Supervisor.Threat_Invalidity_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisorThreat_Invalidity_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorThreat_Invalidity_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorResource_Invalidity(o: Mining_Threat_Retreat_Supervisor.Resource_Invalidity, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorResource_Invalidity(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorResource_Invalidity(s: String): Either[Mining_Threat_Retreat_Supervisor.Resource_Invalidity, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorResource_Invalidity(parser: Parser): Mining_Threat_Retreat_Supervisor.Resource_Invalidity = {
      val r = parser.parseMining_Threat_Retreat_SupervisorResource_Invalidity()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorResource_Invalidity _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorResource_Invalidity_Payload(o: Mining_Threat_Retreat_Supervisor.Resource_Invalidity_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorResource_Invalidity_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorResource_Invalidity_Payload(s: String): Either[Mining_Threat_Retreat_Supervisor.Resource_Invalidity_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorResource_Invalidity_Payload(parser: Parser): Mining_Threat_Retreat_Supervisor.Resource_Invalidity_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisorResource_Invalidity_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorResource_Invalidity_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorMining_Recovery_Facts(o: Mining_Threat_Retreat_Supervisor.Mining_Recovery_Facts, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorMining_Recovery_Facts(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorMining_Recovery_Facts(s: String): Either[Mining_Threat_Retreat_Supervisor.Mining_Recovery_Facts, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorMining_Recovery_Facts(parser: Parser): Mining_Threat_Retreat_Supervisor.Mining_Recovery_Facts = {
      val r = parser.parseMining_Threat_Retreat_SupervisorMining_Recovery_Facts()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorMining_Recovery_Facts _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorMining_Recovery_Facts_Payload(o: Mining_Threat_Retreat_Supervisor.Mining_Recovery_Facts_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorMining_Recovery_Facts_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorMining_Recovery_Facts_Payload(s: String): Either[Mining_Threat_Retreat_Supervisor.Mining_Recovery_Facts_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorMining_Recovery_Facts_Payload(parser: Parser): Mining_Threat_Retreat_Supervisor.Mining_Recovery_Facts_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisorMining_Recovery_Facts_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorMining_Recovery_Facts_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorDefense_Facts(o: Mining_Threat_Retreat_Supervisor.Defense_Facts, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorDefense_Facts(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorDefense_Facts(s: String): Either[Mining_Threat_Retreat_Supervisor.Defense_Facts, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorDefense_Facts(parser: Parser): Mining_Threat_Retreat_Supervisor.Defense_Facts = {
      val r = parser.parseMining_Threat_Retreat_SupervisorDefense_Facts()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorDefense_Facts _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorDefense_Facts_Payload(o: Mining_Threat_Retreat_Supervisor.Defense_Facts_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorDefense_Facts_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorDefense_Facts_Payload(s: String): Either[Mining_Threat_Retreat_Supervisor.Defense_Facts_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorDefense_Facts_Payload(parser: Parser): Mining_Threat_Retreat_Supervisor.Defense_Facts_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisorDefense_Facts_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorDefense_Facts_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorMission_Facts(o: Mining_Threat_Retreat_Supervisor.Mission_Facts, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorMission_Facts(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorMission_Facts(s: String): Either[Mining_Threat_Retreat_Supervisor.Mission_Facts, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorMission_Facts(parser: Parser): Mining_Threat_Retreat_Supervisor.Mission_Facts = {
      val r = parser.parseMining_Threat_Retreat_SupervisorMission_Facts()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorMission_Facts _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorMission_Facts_Payload(o: Mining_Threat_Retreat_Supervisor.Mission_Facts_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorMission_Facts_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorMission_Facts_Payload(s: String): Either[Mining_Threat_Retreat_Supervisor.Mission_Facts_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorMission_Facts_Payload(parser: Parser): Mining_Threat_Retreat_Supervisor.Mission_Facts_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisorMission_Facts_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorMission_Facts_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorArrival_Fact(o: Mining_Threat_Retreat_Supervisor.Arrival_Fact, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorArrival_Fact(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorArrival_Fact(s: String): Either[Mining_Threat_Retreat_Supervisor.Arrival_Fact, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorArrival_Fact(parser: Parser): Mining_Threat_Retreat_Supervisor.Arrival_Fact = {
      val r = parser.parseMining_Threat_Retreat_SupervisorArrival_Fact()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorArrival_Fact _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorArrival_Fact_Payload(o: Mining_Threat_Retreat_Supervisor.Arrival_Fact_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorArrival_Fact_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorArrival_Fact_Payload(s: String): Either[Mining_Threat_Retreat_Supervisor.Arrival_Fact_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorArrival_Fact_Payload(parser: Parser): Mining_Threat_Retreat_Supervisor.Arrival_Fact_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisorArrival_Fact_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorArrival_Fact_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorPhase_Context(o: Mining_Threat_Retreat_Supervisor.Phase_Context, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorPhase_Context(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorPhase_Context(s: String): Either[Mining_Threat_Retreat_Supervisor.Phase_Context, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorPhase_Context(parser: Parser): Mining_Threat_Retreat_Supervisor.Phase_Context = {
      val r = parser.parseMining_Threat_Retreat_SupervisorPhase_Context()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorPhase_Context _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorPhase_Context_Payload(o: Mining_Threat_Retreat_Supervisor.Phase_Context_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorPhase_Context_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorPhase_Context_Payload(s: String): Either[Mining_Threat_Retreat_Supervisor.Phase_Context_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorPhase_Context_Payload(parser: Parser): Mining_Threat_Retreat_Supervisor.Phase_Context_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisorPhase_Context_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorPhase_Context_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorFault_Fact(o: Mining_Threat_Retreat_Supervisor.Fault_Fact, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorFault_Fact(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorFault_Fact(s: String): Either[Mining_Threat_Retreat_Supervisor.Fault_Fact, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorFault_Fact(parser: Parser): Mining_Threat_Retreat_Supervisor.Fault_Fact = {
      val r = parser.parseMining_Threat_Retreat_SupervisorFault_Fact()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorFault_Fact _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorFault_Fact_Payload(o: Mining_Threat_Retreat_Supervisor.Fault_Fact_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorFault_Fact_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorFault_Fact_Payload(s: String): Either[Mining_Threat_Retreat_Supervisor.Fault_Fact_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorFault_Fact_Payload(parser: Parser): Mining_Threat_Retreat_Supervisor.Fault_Fact_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisorFault_Fact_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorFault_Fact_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorRaw_Threat_Observation(o: Mining_Threat_Retreat_Supervisor.Raw_Threat_Observation, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorRaw_Threat_Observation(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorRaw_Threat_Observation(s: String): Either[Mining_Threat_Retreat_Supervisor.Raw_Threat_Observation, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorRaw_Threat_Observation(parser: Parser): Mining_Threat_Retreat_Supervisor.Raw_Threat_Observation = {
      val r = parser.parseMining_Threat_Retreat_SupervisorRaw_Threat_Observation()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorRaw_Threat_Observation _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorRaw_Threat_Observation_Payload(o: Mining_Threat_Retreat_Supervisor.Raw_Threat_Observation_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorRaw_Threat_Observation_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorRaw_Threat_Observation_Payload(s: String): Either[Mining_Threat_Retreat_Supervisor.Raw_Threat_Observation_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorRaw_Threat_Observation_Payload(parser: Parser): Mining_Threat_Retreat_Supervisor.Raw_Threat_Observation_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisorRaw_Threat_Observation_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorRaw_Threat_Observation_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorThreat_State_Input(o: Mining_Threat_Retreat_Supervisor.Threat_State_Input, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorThreat_State_Input(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorThreat_State_Input(s: String): Either[Mining_Threat_Retreat_Supervisor.Threat_State_Input, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorThreat_State_Input(parser: Parser): Mining_Threat_Retreat_Supervisor.Threat_State_Input = {
      val r = parser.parseMining_Threat_Retreat_SupervisorThreat_State_Input()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorThreat_State_Input _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorThreat_State_Input_Payload(o: Mining_Threat_Retreat_Supervisor.Threat_State_Input_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorThreat_State_Input_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorThreat_State_Input_Payload(s: String): Either[Mining_Threat_Retreat_Supervisor.Threat_State_Input_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorThreat_State_Input_Payload(parser: Parser): Mining_Threat_Retreat_Supervisor.Threat_State_Input_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisorThreat_State_Input_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorThreat_State_Input_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorQualified_Threat(o: Mining_Threat_Retreat_Supervisor.Qualified_Threat, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorQualified_Threat(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorQualified_Threat(s: String): Either[Mining_Threat_Retreat_Supervisor.Qualified_Threat, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorQualified_Threat(parser: Parser): Mining_Threat_Retreat_Supervisor.Qualified_Threat = {
      val r = parser.parseMining_Threat_Retreat_SupervisorQualified_Threat()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorQualified_Threat _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorQualified_Threat_Payload(o: Mining_Threat_Retreat_Supervisor.Qualified_Threat_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorQualified_Threat_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorQualified_Threat_Payload(s: String): Either[Mining_Threat_Retreat_Supervisor.Qualified_Threat_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorQualified_Threat_Payload(parser: Parser): Mining_Threat_Retreat_Supervisor.Qualified_Threat_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisorQualified_Threat_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorQualified_Threat_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorThreat_Publication_Facts(o: Mining_Threat_Retreat_Supervisor.Threat_Publication_Facts, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorThreat_Publication_Facts(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorThreat_Publication_Facts(s: String): Either[Mining_Threat_Retreat_Supervisor.Threat_Publication_Facts, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorThreat_Publication_Facts(parser: Parser): Mining_Threat_Retreat_Supervisor.Threat_Publication_Facts = {
      val r = parser.parseMining_Threat_Retreat_SupervisorThreat_Publication_Facts()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorThreat_Publication_Facts _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorThreat_Publication_Facts_Payload(o: Mining_Threat_Retreat_Supervisor.Threat_Publication_Facts_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorThreat_Publication_Facts_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorThreat_Publication_Facts_Payload(s: String): Either[Mining_Threat_Retreat_Supervisor.Threat_Publication_Facts_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorThreat_Publication_Facts_Payload(parser: Parser): Mining_Threat_Retreat_Supervisor.Threat_Publication_Facts_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisorThreat_Publication_Facts_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorThreat_Publication_Facts_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorRaw_Resource_Observation(o: Mining_Threat_Retreat_Supervisor.Raw_Resource_Observation, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorRaw_Resource_Observation(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorRaw_Resource_Observation(s: String): Either[Mining_Threat_Retreat_Supervisor.Raw_Resource_Observation, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorRaw_Resource_Observation(parser: Parser): Mining_Threat_Retreat_Supervisor.Raw_Resource_Observation = {
      val r = parser.parseMining_Threat_Retreat_SupervisorRaw_Resource_Observation()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorRaw_Resource_Observation _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorRaw_Resource_Observation_Payload(o: Mining_Threat_Retreat_Supervisor.Raw_Resource_Observation_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorRaw_Resource_Observation_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorRaw_Resource_Observation_Payload(s: String): Either[Mining_Threat_Retreat_Supervisor.Raw_Resource_Observation_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorRaw_Resource_Observation_Payload(parser: Parser): Mining_Threat_Retreat_Supervisor.Raw_Resource_Observation_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisorRaw_Resource_Observation_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorRaw_Resource_Observation_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorResource_Publication_Facts(o: Mining_Threat_Retreat_Supervisor.Resource_Publication_Facts, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorResource_Publication_Facts(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorResource_Publication_Facts(s: String): Either[Mining_Threat_Retreat_Supervisor.Resource_Publication_Facts, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorResource_Publication_Facts(parser: Parser): Mining_Threat_Retreat_Supervisor.Resource_Publication_Facts = {
      val r = parser.parseMining_Threat_Retreat_SupervisorResource_Publication_Facts()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorResource_Publication_Facts _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorResource_Publication_Facts_Payload(o: Mining_Threat_Retreat_Supervisor.Resource_Publication_Facts_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorResource_Publication_Facts_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorResource_Publication_Facts_Payload(s: String): Either[Mining_Threat_Retreat_Supervisor.Resource_Publication_Facts_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorResource_Publication_Facts_Payload(parser: Parser): Mining_Threat_Retreat_Supervisor.Resource_Publication_Facts_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisorResource_Publication_Facts_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorResource_Publication_Facts_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorRaw_Mission_Observation(o: Mining_Threat_Retreat_Supervisor.Raw_Mission_Observation, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorRaw_Mission_Observation(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorRaw_Mission_Observation(s: String): Either[Mining_Threat_Retreat_Supervisor.Raw_Mission_Observation, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorRaw_Mission_Observation(parser: Parser): Mining_Threat_Retreat_Supervisor.Raw_Mission_Observation = {
      val r = parser.parseMining_Threat_Retreat_SupervisorRaw_Mission_Observation()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorRaw_Mission_Observation _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorRaw_Mission_Observation_Payload(o: Mining_Threat_Retreat_Supervisor.Raw_Mission_Observation_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorRaw_Mission_Observation_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorRaw_Mission_Observation_Payload(s: String): Either[Mining_Threat_Retreat_Supervisor.Raw_Mission_Observation_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorRaw_Mission_Observation_Payload(parser: Parser): Mining_Threat_Retreat_Supervisor.Raw_Mission_Observation_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisorRaw_Mission_Observation_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorRaw_Mission_Observation_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorMission_Proposal(o: Mining_Threat_Retreat_Supervisor.Mission_Proposal, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorMission_Proposal(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorMission_Proposal(s: String): Either[Mining_Threat_Retreat_Supervisor.Mission_Proposal, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorMission_Proposal(parser: Parser): Mining_Threat_Retreat_Supervisor.Mission_Proposal = {
      val r = parser.parseMining_Threat_Retreat_SupervisorMission_Proposal()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorMission_Proposal _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorMission_Proposal_Payload(o: Mining_Threat_Retreat_Supervisor.Mission_Proposal_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorMission_Proposal_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorMission_Proposal_Payload(s: String): Either[Mining_Threat_Retreat_Supervisor.Mission_Proposal_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorMission_Proposal_Payload(parser: Parser): Mining_Threat_Retreat_Supervisor.Mission_Proposal_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisorMission_Proposal_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorMission_Proposal_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorResponse_Proposal(o: Mining_Threat_Retreat_Supervisor.Response_Proposal, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorResponse_Proposal(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorResponse_Proposal(s: String): Either[Mining_Threat_Retreat_Supervisor.Response_Proposal, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorResponse_Proposal(parser: Parser): Mining_Threat_Retreat_Supervisor.Response_Proposal = {
      val r = parser.parseMining_Threat_Retreat_SupervisorResponse_Proposal()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorResponse_Proposal _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorResponse_Proposal_Payload(o: Mining_Threat_Retreat_Supervisor.Response_Proposal_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorResponse_Proposal_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorResponse_Proposal_Payload(s: String): Either[Mining_Threat_Retreat_Supervisor.Response_Proposal_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorResponse_Proposal_Payload(parser: Parser): Mining_Threat_Retreat_Supervisor.Response_Proposal_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisorResponse_Proposal_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorResponse_Proposal_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorPhase_State_Input(o: Mining_Threat_Retreat_Supervisor.Phase_State_Input, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorPhase_State_Input(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorPhase_State_Input(s: String): Either[Mining_Threat_Retreat_Supervisor.Phase_State_Input, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorPhase_State_Input(parser: Parser): Mining_Threat_Retreat_Supervisor.Phase_State_Input = {
      val r = parser.parseMining_Threat_Retreat_SupervisorPhase_State_Input()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorPhase_State_Input _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorPhase_State_Input_Payload(o: Mining_Threat_Retreat_Supervisor.Phase_State_Input_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorPhase_State_Input_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorPhase_State_Input_Payload(s: String): Either[Mining_Threat_Retreat_Supervisor.Phase_State_Input_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorPhase_State_Input_Payload(parser: Parser): Mining_Threat_Retreat_Supervisor.Phase_State_Input_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisorPhase_State_Input_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorPhase_State_Input_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorAtomic_Supervisor_Result(o: Mining_Threat_Retreat_Supervisor.Atomic_Supervisor_Result, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorAtomic_Supervisor_Result(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorAtomic_Supervisor_Result(s: String): Either[Mining_Threat_Retreat_Supervisor.Atomic_Supervisor_Result, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorAtomic_Supervisor_Result(parser: Parser): Mining_Threat_Retreat_Supervisor.Atomic_Supervisor_Result = {
      val r = parser.parseMining_Threat_Retreat_SupervisorAtomic_Supervisor_Result()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorAtomic_Supervisor_Result _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorAtomic_Supervisor_Result_Payload(o: Mining_Threat_Retreat_Supervisor.Atomic_Supervisor_Result_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorAtomic_Supervisor_Result_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorAtomic_Supervisor_Result_Payload(s: String): Either[Mining_Threat_Retreat_Supervisor.Atomic_Supervisor_Result_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorAtomic_Supervisor_Result_Payload(parser: Parser): Mining_Threat_Retreat_Supervisor.Atomic_Supervisor_Result_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisorAtomic_Supervisor_Result_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorAtomic_Supervisor_Result_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorPublished_Supervisor_Result(o: Mining_Threat_Retreat_Supervisor.Published_Supervisor_Result, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorPublished_Supervisor_Result(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorPublished_Supervisor_Result(s: String): Either[Mining_Threat_Retreat_Supervisor.Published_Supervisor_Result, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorPublished_Supervisor_Result(parser: Parser): Mining_Threat_Retreat_Supervisor.Published_Supervisor_Result = {
      val r = parser.parseMining_Threat_Retreat_SupervisorPublished_Supervisor_Result()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorPublished_Supervisor_Result _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorPublished_Supervisor_Result_Payload(o: Mining_Threat_Retreat_Supervisor.Published_Supervisor_Result_Payload, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorPublished_Supervisor_Result_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorPublished_Supervisor_Result_Payload(s: String): Either[Mining_Threat_Retreat_Supervisor.Published_Supervisor_Result_Payload, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorPublished_Supervisor_Result_Payload(parser: Parser): Mining_Threat_Retreat_Supervisor.Published_Supervisor_Result_Payload = {
      val r = parser.parseMining_Threat_Retreat_SupervisorPublished_Supervisor_Result_Payload()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorPublished_Supervisor_Result_Payload _)
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

  def fromMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container(o: Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container(s: String): Either[Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container(parser: Parser): Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container = {
      val r = parser.parseMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_P(o: Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_P(s: String): Either[Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container_P, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_P(parser: Parser): Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container_P = {
      val r = parser.parseMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_P()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_PS(s: String): Either[Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container_PS, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_PS(parser: Parser): Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container_PS = {
      val r = parser.parseMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_PS()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container(o: Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container(s: String): Either[Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container(parser: Parser): Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container = {
      val r = parser.parseMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_P(o: Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_P(s: String): Either[Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container_P, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_P(parser: Parser): Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container_P = {
      val r = parser.parseMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_P()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_PS(s: String): Either[Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container_PS, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_PS(parser: Parser): Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container_PS = {
      val r = parser.parseMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_PS()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container(o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container(s: String): Either[Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container(parser: Parser): Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container = {
      val r = parser.parseMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_P(o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_P(s: String): Either[Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container_P, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_P(parser: Parser): Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container_P = {
      val r = parser.parseMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_P()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_PS(s: String): Either[Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container_PS, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_PS(parser: Parser): Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container_PS = {
      val r = parser.parseMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_PS()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container(o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container(s: String): Either[Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container(parser: Parser): Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container = {
      val r = parser.parseMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_P(o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_P(s: String): Either[Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container_P, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_P(parser: Parser): Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container_P = {
      val r = parser.parseMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_P()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_PS(s: String): Either[Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container_PS, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_PS(parser: Parser): Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container_PS = {
      val r = parser.parseMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_PS()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container(o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container(s: String): Either[Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container(parser: Parser): Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container = {
      val r = parser.parseMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_P(o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_P(s: String): Either[Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container_P, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_P(parser: Parser): Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container_P = {
      val r = parser.parseMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_P()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_PS(s: String): Either[Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container_PS, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_PS(parser: Parser): Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container_PS = {
      val r = parser.parseMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_PS()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container(o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container(s: String): Either[Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container(parser: Parser): Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container = {
      val r = parser.parseMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_P(o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_P(s: String): Either[Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container_P, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_P(parser: Parser): Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container_P = {
      val r = parser.parseMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_P()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_PS(s: String): Either[Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container_PS, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_PS(parser: Parser): Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container_PS = {
      val r = parser.parseMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_PS()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container(o: Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container(s: String): Either[Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container(parser: Parser): Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container = {
      val r = parser.parseMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_P(o: Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_P(s: String): Either[Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container_P, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_P(parser: Parser): Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container_P = {
      val r = parser.parseMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_P()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_PS(s: String): Either[Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container_PS, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_PS(parser: Parser): Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container_PS = {
      val r = parser.parseMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_PS()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container(o: Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container(s: String): Either[Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container(parser: Parser): Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container = {
      val r = parser.parseMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_P(o: Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_P(s: String): Either[Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container_P, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_P(parser: Parser): Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container_P = {
      val r = parser.parseMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_P()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_PS(s: String): Either[Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container_PS, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_PS(parser: Parser): Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container_PS = {
      val r = parser.parseMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_PS()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container(o: Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container(s: String): Either[Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container(parser: Parser): Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container = {
      val r = parser.parseMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_P(o: Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_P(s: String): Either[Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container_P, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_P(parser: Parser): Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container_P = {
      val r = parser.parseMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_P()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_PS(s: String): Either[Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container_PS, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_PS(parser: Parser): Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container_PS = {
      val r = parser.parseMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_PS()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container(o: Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container(s: String): Either[Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container(parser: Parser): Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container = {
      val r = parser.parseMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_P(o: Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_P(s: String): Either[Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container_P, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_P(parser: Parser): Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container_P = {
      val r = parser.parseMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_P()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_PS(s: String): Either[Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container_PS, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_PS(parser: Parser): Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container_PS = {
      val r = parser.parseMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_PS()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container(o: Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container(s: String): Either[Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container(parser: Parser): Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container = {
      val r = parser.parseMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_P(o: Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_P(s: String): Either[Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container_P, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_P(parser: Parser): Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container_P = {
      val r = parser.parseMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_P()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_PS(s: String): Either[Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container_PS, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_PS(parser: Parser): Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container_PS = {
      val r = parser.parseMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_PS()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container(o: Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container(s: String): Either[Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container(parser: Parser): Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container = {
      val r = parser.parseMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_P(o: Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_P(s: String): Either[Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container_P, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_P(parser: Parser): Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container_P = {
      val r = parser.parseMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_P()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_PS(s: String): Either[Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container_PS, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_PS(parser: Parser): Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container_PS = {
      val r = parser.parseMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_PS()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container(o: Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container(s: String): Either[Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container(parser: Parser): Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container = {
      val r = parser.parseMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_P(o: Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_P(s: String): Either[Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container_P, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_P(parser: Parser): Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container_P = {
      val r = parser.parseMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_P()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_PS(s: String): Either[Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container_PS, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_PS(parser: Parser): Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container_PS = {
      val r = parser.parseMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_PS()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container(o: Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container(s: String): Either[Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container(parser: Parser): Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container = {
      val r = parser.parseMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_P(o: Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_P(s: String): Either[Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container_P, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_P(parser: Parser): Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container_P = {
      val r = parser.parseMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_P()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_PS(s: String): Either[Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container_PS, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_PS(parser: Parser): Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container_PS = {
      val r = parser.parseMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_PS()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container(o: Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container(s: String): Either[Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container(parser: Parser): Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container = {
      val r = parser.parseMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_P(o: Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_P(s: String): Either[Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container_P, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_P(parser: Parser): Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container_P = {
      val r = parser.parseMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_P()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_PS(s: String): Either[Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container_PS, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_PS(parser: Parser): Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container_PS = {
      val r = parser.parseMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_PS()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container(o: Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container(s: String): Either[Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container(parser: Parser): Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container = {
      val r = parser.parseMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_P(o: Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_P(s: String): Either[Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container_P, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_P(parser: Parser): Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container_P = {
      val r = parser.parseMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_P()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_PS(s: String): Either[Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container_PS, Json.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_PS(parser: Parser): Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container_PS = {
      val r = parser.parseMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_PS()
      return r
    }
    val r = to(s, fMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_PS _)
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