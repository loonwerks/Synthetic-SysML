// #Sireum
// @formatter:off

// This file is auto-generated from Mission_Invalidity_Facts.scala, Threat_Invalidity.scala, Resource_Invalidity.scala, Mining_Recovery_Facts.scala, Defense_Facts.scala, Mission_Facts.scala, Arrival_Fact.scala, Phase_Context.scala, Fault_Fact.scala, Raw_Threat_Observation.scala, Threat_State_Input.scala, Qualified_Threat.scala, Threat_Publication_Facts.scala, Raw_Resource_Observation.scala, Resource_Publication_Facts.scala, Raw_Mission_Observation.scala, Mission_Proposal.scala, Response_Proposal.scala, Phase_State_Input.scala, Atomic_Supervisor_Result.scala, Published_Supervisor_Result.scala, Base_Types.scala, Fault_Assessment_supervisor_fa_Containers.scala, Threat_Qualification_supervisor_tq_Containers.scala, Resource_Qualification_supervisor_rq_Containers.scala, Personnel_Mission_Qualification_supervisor_pq_Containers.scala, Mission_Recovery_Decision_supervisor_mr_Containers.scala, Threat_Retreat_Decision_supervisor_tr_Containers.scala, Priority_Phase_Arbitration_supervisor_arb_Containers.scala, Atomic_Publication_supervisor_ap_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package scp_candidate

import org.sireum._

object MsgPack {

  object Constants {

    val Mining_Threat_Retreat_SupervisorMission_Invalidity_Facts: Z = -32

    val Mining_Threat_Retreat_SupervisorMission_Invalidity_Facts_Payload: Z = -31

    val Mining_Threat_Retreat_SupervisorThreat_Invalidity: Z = -30

    val Mining_Threat_Retreat_SupervisorThreat_Invalidity_Payload: Z = -29

    val Mining_Threat_Retreat_SupervisorResource_Invalidity: Z = -28

    val Mining_Threat_Retreat_SupervisorResource_Invalidity_Payload: Z = -27

    val Mining_Threat_Retreat_SupervisorMining_Recovery_Facts: Z = -26

    val Mining_Threat_Retreat_SupervisorMining_Recovery_Facts_Payload: Z = -25

    val Mining_Threat_Retreat_SupervisorDefense_Facts: Z = -24

    val Mining_Threat_Retreat_SupervisorDefense_Facts_Payload: Z = -23

    val Mining_Threat_Retreat_SupervisorMission_Facts: Z = -22

    val Mining_Threat_Retreat_SupervisorMission_Facts_Payload: Z = -21

    val Mining_Threat_Retreat_SupervisorArrival_Fact: Z = -20

    val Mining_Threat_Retreat_SupervisorArrival_Fact_Payload: Z = -19

    val Mining_Threat_Retreat_SupervisorPhase_Context: Z = -18

    val Mining_Threat_Retreat_SupervisorPhase_Context_Payload: Z = -17

    val Mining_Threat_Retreat_SupervisorFault_Fact: Z = -16

    val Mining_Threat_Retreat_SupervisorFault_Fact_Payload: Z = -15

    val Mining_Threat_Retreat_SupervisorRaw_Threat_Observation: Z = -14

    val Mining_Threat_Retreat_SupervisorRaw_Threat_Observation_Payload: Z = -13

    val Mining_Threat_Retreat_SupervisorThreat_State_Input: Z = -12

    val Mining_Threat_Retreat_SupervisorThreat_State_Input_Payload: Z = -11

    val Mining_Threat_Retreat_SupervisorQualified_Threat: Z = -10

    val Mining_Threat_Retreat_SupervisorQualified_Threat_Payload: Z = -9

    val Mining_Threat_Retreat_SupervisorThreat_Publication_Facts: Z = -8

    val Mining_Threat_Retreat_SupervisorThreat_Publication_Facts_Payload: Z = -7

    val Mining_Threat_Retreat_SupervisorRaw_Resource_Observation: Z = -6

    val Mining_Threat_Retreat_SupervisorRaw_Resource_Observation_Payload: Z = -5

    val Mining_Threat_Retreat_SupervisorResource_Publication_Facts: Z = -4

    val Mining_Threat_Retreat_SupervisorResource_Publication_Facts_Payload: Z = -3

    val Mining_Threat_Retreat_SupervisorRaw_Mission_Observation: Z = -2

    val Mining_Threat_Retreat_SupervisorRaw_Mission_Observation_Payload: Z = -1

    val Mining_Threat_Retreat_SupervisorMission_Proposal: Z = 0

    val Mining_Threat_Retreat_SupervisorMission_Proposal_Payload: Z = 1

    val Mining_Threat_Retreat_SupervisorResponse_Proposal: Z = 2

    val Mining_Threat_Retreat_SupervisorResponse_Proposal_Payload: Z = 3

    val Mining_Threat_Retreat_SupervisorPhase_State_Input: Z = 4

    val Mining_Threat_Retreat_SupervisorPhase_State_Input_Payload: Z = 5

    val Mining_Threat_Retreat_SupervisorAtomic_Supervisor_Result: Z = 6

    val Mining_Threat_Retreat_SupervisorAtomic_Supervisor_Result_Payload: Z = 7

    val Mining_Threat_Retreat_SupervisorPublished_Supervisor_Result: Z = 8

    val Mining_Threat_Retreat_SupervisorPublished_Supervisor_Result_Payload: Z = 9

    val Base_TypesBoolean_Payload: Z = 10

    val Base_TypesInteger_Payload: Z = 11

    val Base_TypesInteger_8_Payload: Z = 12

    val Base_TypesInteger_16_Payload: Z = 13

    val Base_TypesInteger_32_Payload: Z = 14

    val Base_TypesInteger_64_Payload: Z = 15

    val Base_TypesUnsigned_8_Payload: Z = 16

    val Base_TypesUnsigned_16_Payload: Z = 17

    val Base_TypesUnsigned_32_Payload: Z = 18

    val Base_TypesUnsigned_64_Payload: Z = 19

    val Base_TypesFloat_Payload: Z = 20

    val Base_TypesFloat_32_Payload: Z = 21

    val Base_TypesFloat_64_Payload: Z = 22

    val Base_TypesCharacter_Payload: Z = 23

    val Base_TypesString_Payload: Z = 24

    val Base_TypesBits_Payload: Z = 25

    val Mining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_P: Z = 26

    val Mining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_PS: Z = 27

    val Mining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_P: Z = 28

    val Mining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_PS: Z = 29

    val Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_P: Z = 30

    val Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_PS: Z = 31

    val Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_P: Z = 32

    val Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_PS: Z = 33

    val Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_P: Z = 34

    val Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_PS: Z = 35

    val Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_P: Z = 36

    val Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_PS: Z = 37

    val Mining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_P: Z = 38

    val Mining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_PS: Z = 39

    val Mining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_P: Z = 40

    val Mining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_PS: Z = 41

    val Mining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_P: Z = 42

    val Mining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_PS: Z = 43

    val Mining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_P: Z = 44

    val Mining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_PS: Z = 45

    val Mining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_P: Z = 46

    val Mining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_PS: Z = 47

    val Mining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_P: Z = 48

    val Mining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_PS: Z = 49

    val Mining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_P: Z = 50

    val Mining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_PS: Z = 51

    val Mining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_P: Z = 52

    val Mining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_PS: Z = 53

    val Mining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_P: Z = 54

    val Mining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_PS: Z = 55

    val Mining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_P: Z = 56

    val Mining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_PS: Z = 57

    val utilEmptyContainer: Z = 58

    val _artEmpty: Z = 59

  }

  object Writer {

    @record class Default(val writer: MessagePack.Writer.Impl) extends Writer

  }

  @msig trait Writer {

    def writer: MessagePack.Writer

    def writeMining_Threat_Retreat_SupervisorMission_Invalidity_Facts(o: Mining_Threat_Retreat_Supervisor.Mission_Invalidity_Facts): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorMission_Invalidity_Facts)
      writer.writeB(o.intent_invalid)
      writer.writeB(o.arrival_invalid)
      writer.writeB(o.resupply_invalid)
    }

    def writeMining_Threat_Retreat_SupervisorMission_Invalidity_Facts_Payload(o: Mining_Threat_Retreat_Supervisor.Mission_Invalidity_Facts_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorMission_Invalidity_Facts_Payload)
      writeMining_Threat_Retreat_SupervisorMission_Invalidity_Facts(o.value)
    }

    def writeMining_Threat_Retreat_SupervisorThreat_Invalidity(o: Mining_Threat_Retreat_Supervisor.Threat_Invalidity): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorThreat_Invalidity)
      writer.writeB(o.threat_invalid)
    }

    def writeMining_Threat_Retreat_SupervisorThreat_Invalidity_Payload(o: Mining_Threat_Retreat_Supervisor.Threat_Invalidity_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorThreat_Invalidity_Payload)
      writeMining_Threat_Retreat_SupervisorThreat_Invalidity(o.value)
    }

    def writeMining_Threat_Retreat_SupervisorResource_Invalidity(o: Mining_Threat_Retreat_Supervisor.Resource_Invalidity): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorResource_Invalidity)
      writer.writeB(o.resource_invalid)
    }

    def writeMining_Threat_Retreat_SupervisorResource_Invalidity_Payload(o: Mining_Threat_Retreat_Supervisor.Resource_Invalidity_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorResource_Invalidity_Payload)
      writeMining_Threat_Retreat_SupervisorResource_Invalidity(o.value)
    }

    def writeMining_Threat_Retreat_SupervisorMining_Recovery_Facts(o: Mining_Threat_Retreat_Supervisor.Mining_Recovery_Facts): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorMining_Recovery_Facts)
      writer.writeB(o.mine_ready)
      writer.writeB(o.resource_reset)
      writer.writeB(o.cargo_or_capacitor_retreat)
      writer.writeB(o.target_or_mining_block)
    }

    def writeMining_Threat_Retreat_SupervisorMining_Recovery_Facts_Payload(o: Mining_Threat_Retreat_Supervisor.Mining_Recovery_Facts_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorMining_Recovery_Facts_Payload)
      writeMining_Threat_Retreat_SupervisorMining_Recovery_Facts(o.value)
    }

    def writeMining_Threat_Retreat_SupervisorDefense_Facts(o: Mining_Threat_Retreat_Supervisor.Defense_Facts): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorDefense_Facts)
      writer.writeB(o.defense_ready)
    }

    def writeMining_Threat_Retreat_SupervisorDefense_Facts_Payload(o: Mining_Threat_Retreat_Supervisor.Defense_Facts_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorDefense_Facts_Payload)
      writeMining_Threat_Retreat_SupervisorDefense_Facts(o.value)
    }

    def writeMining_Threat_Retreat_SupervisorMission_Facts(o: Mining_Threat_Retreat_Supervisor.Mission_Facts): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorMission_Facts)
      writer.writeB(o.valid_mine)
      writer.writeB(o.invalid_or_return)
      writer.writeB(o.valid_hold_or_return)
      writer.writeB(o.valid_complete_resupply)
      writer.writeB(o.intent_invalid)
    }

    def writeMining_Threat_Retreat_SupervisorMission_Facts_Payload(o: Mining_Threat_Retreat_Supervisor.Mission_Facts_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorMission_Facts_Payload)
      writeMining_Threat_Retreat_SupervisorMission_Facts(o.value)
    }

    def writeMining_Threat_Retreat_SupervisorArrival_Fact(o: Mining_Threat_Retreat_Supervisor.Arrival_Fact): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorArrival_Fact)
      writer.writeB(o.valid_safe_at_station)
    }

    def writeMining_Threat_Retreat_SupervisorArrival_Fact_Payload(o: Mining_Threat_Retreat_Supervisor.Arrival_Fact_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorArrival_Fact_Payload)
      writeMining_Threat_Retreat_SupervisorArrival_Fact(o.value)
    }

    def writeMining_Threat_Retreat_SupervisorPhase_Context(o: Mining_Threat_Retreat_Supervisor.Phase_Context): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorPhase_Context)
      writer.writeS32(o.current_phase)
    }

    def writeMining_Threat_Retreat_SupervisorPhase_Context_Payload(o: Mining_Threat_Retreat_Supervisor.Phase_Context_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorPhase_Context_Payload)
      writeMining_Threat_Retreat_SupervisorPhase_Context(o.value)
    }

    def writeMining_Threat_Retreat_SupervisorFault_Fact(o: Mining_Threat_Retreat_Supervisor.Fault_Fact): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorFault_Fact)
      writer.writeS32(o.fault)
    }

    def writeMining_Threat_Retreat_SupervisorFault_Fact_Payload(o: Mining_Threat_Retreat_Supervisor.Fault_Fact_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorFault_Fact_Payload)
      writeMining_Threat_Retreat_SupervisorFault_Fact(o.value)
    }

    def writeMining_Threat_Retreat_SupervisorRaw_Threat_Observation(o: Mining_Threat_Retreat_Supervisor.Raw_Threat_Observation): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorRaw_Threat_Observation)
      writer.writeS32(o.threat)
      writer.writeS32(o.threat_validity)
    }

    def writeMining_Threat_Retreat_SupervisorRaw_Threat_Observation_Payload(o: Mining_Threat_Retreat_Supervisor.Raw_Threat_Observation_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorRaw_Threat_Observation_Payload)
      writeMining_Threat_Retreat_SupervisorRaw_Threat_Observation(o.value)
    }

    def writeMining_Threat_Retreat_SupervisorThreat_State_Input(o: Mining_Threat_Retreat_Supervisor.Threat_State_Input): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorThreat_State_Input)
      writer.writeS32(o.current_valid_streak)
    }

    def writeMining_Threat_Retreat_SupervisorThreat_State_Input_Payload(o: Mining_Threat_Retreat_Supervisor.Threat_State_Input_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorThreat_State_Input_Payload)
      writeMining_Threat_Retreat_SupervisorThreat_State_Input(o.value)
    }

    def writeMining_Threat_Retreat_SupervisorQualified_Threat(o: Mining_Threat_Retreat_Supervisor.Qualified_Threat): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorQualified_Threat)
      writer.writeS32(o.qualified_threat)
      writer.writeB(o.untrusted)
      writer.writeB(o.acceptable)
      writer.writeB(o.hostile)
      writer.writeB(o.severe)
    }

    def writeMining_Threat_Retreat_SupervisorQualified_Threat_Payload(o: Mining_Threat_Retreat_Supervisor.Qualified_Threat_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorQualified_Threat_Payload)
      writeMining_Threat_Retreat_SupervisorQualified_Threat(o.value)
    }

    def writeMining_Threat_Retreat_SupervisorThreat_Publication_Facts(o: Mining_Threat_Retreat_Supervisor.Threat_Publication_Facts): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorThreat_Publication_Facts)
      writer.writeS32(o.qualified_threat)
      writer.writeS32(o.next_valid_streak)
    }

    def writeMining_Threat_Retreat_SupervisorThreat_Publication_Facts_Payload(o: Mining_Threat_Retreat_Supervisor.Threat_Publication_Facts_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorThreat_Publication_Facts_Payload)
      writeMining_Threat_Retreat_SupervisorThreat_Publication_Facts(o.value)
    }

    def writeMining_Threat_Retreat_SupervisorRaw_Resource_Observation(o: Mining_Threat_Retreat_Supervisor.Raw_Resource_Observation): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorRaw_Resource_Observation)
      writer.writeS32(o.cargo)
      writer.writeS32(o.cargo_validity)
      writer.writeS32(o.capacitor)
      writer.writeS32(o.capacitor_validity)
      writer.writeS32(o.target)
      writer.writeS32(o.target_validity)
      writer.writeS32(o.mining_availability)
      writer.writeS32(o.defense_availability)
      writer.writeS32(o.retreat_availability)
      writer.writeS32(o.availability_validity)
    }

    def writeMining_Threat_Retreat_SupervisorRaw_Resource_Observation_Payload(o: Mining_Threat_Retreat_Supervisor.Raw_Resource_Observation_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorRaw_Resource_Observation_Payload)
      writeMining_Threat_Retreat_SupervisorRaw_Resource_Observation(o.value)
    }

    def writeMining_Threat_Retreat_SupervisorResource_Publication_Facts(o: Mining_Threat_Retreat_Supervisor.Resource_Publication_Facts): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorResource_Publication_Facts)
      writer.writeS32(o.cargo_advisory)
      writer.writeS32(o.capacitor_advisory)
      writer.writeS32(o.retreat_advisory)
    }

    def writeMining_Threat_Retreat_SupervisorResource_Publication_Facts_Payload(o: Mining_Threat_Retreat_Supervisor.Resource_Publication_Facts_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorResource_Publication_Facts_Payload)
      writeMining_Threat_Retreat_SupervisorResource_Publication_Facts(o.value)
    }

    def writeMining_Threat_Retreat_SupervisorRaw_Mission_Observation(o: Mining_Threat_Retreat_Supervisor.Raw_Mission_Observation): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorRaw_Mission_Observation)
      writer.writeS32(o.pilot_intent)
      writer.writeS32(o.intent_validity)
      writer.writeS32(o.arrival)
      writer.writeS32(o.arrival_validity)
      writer.writeS32(o.resupply)
      writer.writeS32(o.resupply_validity)
    }

    def writeMining_Threat_Retreat_SupervisorRaw_Mission_Observation_Payload(o: Mining_Threat_Retreat_Supervisor.Raw_Mission_Observation_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorRaw_Mission_Observation_Payload)
      writeMining_Threat_Retreat_SupervisorRaw_Mission_Observation(o.value)
    }

    def writeMining_Threat_Retreat_SupervisorMission_Proposal(o: Mining_Threat_Retreat_Supervisor.Mission_Proposal): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorMission_Proposal)
      writer.writeS32(o.proposed_reason)
    }

    def writeMining_Threat_Retreat_SupervisorMission_Proposal_Payload(o: Mining_Threat_Retreat_Supervisor.Mission_Proposal_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorMission_Proposal_Payload)
      writeMining_Threat_Retreat_SupervisorMission_Proposal(o.value)
    }

    def writeMining_Threat_Retreat_SupervisorResponse_Proposal(o: Mining_Threat_Retreat_Supervisor.Response_Proposal): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorResponse_Proposal)
      writer.writeS32(o.proposed_reason)
    }

    def writeMining_Threat_Retreat_SupervisorResponse_Proposal_Payload(o: Mining_Threat_Retreat_Supervisor.Response_Proposal_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorResponse_Proposal_Payload)
      writeMining_Threat_Retreat_SupervisorResponse_Proposal(o.value)
    }

    def writeMining_Threat_Retreat_SupervisorPhase_State_Input(o: Mining_Threat_Retreat_Supervisor.Phase_State_Input): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorPhase_State_Input)
      writer.writeS32(o.current_phase)
    }

    def writeMining_Threat_Retreat_SupervisorPhase_State_Input_Payload(o: Mining_Threat_Retreat_Supervisor.Phase_State_Input_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorPhase_State_Input_Payload)
      writeMining_Threat_Retreat_SupervisorPhase_State_Input(o.value)
    }

    def writeMining_Threat_Retreat_SupervisorAtomic_Supervisor_Result(o: Mining_Threat_Retreat_Supervisor.Atomic_Supervisor_Result): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorAtomic_Supervisor_Result)
      writer.writeS32(o.command)
      writer.writeS32(o.current_phase)
      writer.writeS32(o.next_phase)
      writer.writeS32(o.reason)
      writer.writeS32(o.fault)
      writer.writeS32(o.next_valid_streak)
      writer.writeS32(o.cargo_advisory)
      writer.writeS32(o.capacitor_advisory)
      writer.writeS32(o.retreat_advisory)
    }

    def writeMining_Threat_Retreat_SupervisorAtomic_Supervisor_Result_Payload(o: Mining_Threat_Retreat_Supervisor.Atomic_Supervisor_Result_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorAtomic_Supervisor_Result_Payload)
      writeMining_Threat_Retreat_SupervisorAtomic_Supervisor_Result(o.value)
    }

    def writeMining_Threat_Retreat_SupervisorPublished_Supervisor_Result(o: Mining_Threat_Retreat_Supervisor.Published_Supervisor_Result): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorPublished_Supervisor_Result)
      writer.writeS32(o.command)
      writer.writeS32(o.current_phase)
      writer.writeS32(o.next_phase)
      writer.writeS32(o.reason)
      writer.writeS32(o.fault)
      writer.writeS32(o.next_valid_streak)
      writer.writeS32(o.cargo_advisory)
      writer.writeS32(o.capacitor_advisory)
      writer.writeS32(o.retreat_advisory)
      writer.writeS32(o.laser)
      writer.writeS32(o.drones)
    }

    def writeMining_Threat_Retreat_SupervisorPublished_Supervisor_Result_Payload(o: Mining_Threat_Retreat_Supervisor.Published_Supervisor_Result_Payload): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorPublished_Supervisor_Result_Payload)
      writeMining_Threat_Retreat_SupervisorPublished_Supervisor_Result(o.value)
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

    def writeMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container(o: Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container): Unit = {
      o match {
        case o: Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container_P => writeMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container_PS => writeMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_PS(o)
      }
    }

    def writeMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_P(o: Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_P)
      writeMining_Threat_Retreat_SupervisorMission_Invalidity_Facts(o.api_mission_invalidity)
      writeMining_Threat_Retreat_SupervisorPhase_Context(o.api_phase_context)
      writeMining_Threat_Retreat_SupervisorResource_Invalidity(o.api_resource_invalidity)
      writeMining_Threat_Retreat_SupervisorThreat_Invalidity(o.api_threat_invalidity)
    }

    def writeMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_PS)
      writeMining_Threat_Retreat_SupervisorMission_Invalidity_Facts(o.api_mission_invalidity)
      writeMining_Threat_Retreat_SupervisorPhase_Context(o.api_phase_context)
      writeMining_Threat_Retreat_SupervisorResource_Invalidity(o.api_resource_invalidity)
      writeMining_Threat_Retreat_SupervisorThreat_Invalidity(o.api_threat_invalidity)
    }

    def writeMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container(o: Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container): Unit = {
      o match {
        case o: Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container_P => writeMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container_PS => writeMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_PS(o)
      }
    }

    def writeMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_P(o: Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_P)
      writeMining_Threat_Retreat_SupervisorFault_Fact(o.api_fault)
    }

    def writeMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_PS)
      writeMining_Threat_Retreat_SupervisorFault_Fact(o.api_fault)
    }

    def writeMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container(o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container): Unit = {
      o match {
        case o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container_P => writeMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container_PS => writeMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_PS(o)
      }
    }

    def writeMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_P(o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_P)
      writeMining_Threat_Retreat_SupervisorRaw_Threat_Observation(o.api_raw_threat)
      writeMining_Threat_Retreat_SupervisorThreat_State_Input(o.api_streak_state)
    }

    def writeMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_PS)
      writeMining_Threat_Retreat_SupervisorRaw_Threat_Observation(o.api_raw_threat)
      writeMining_Threat_Retreat_SupervisorThreat_State_Input(o.api_streak_state)
    }

    def writeMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container(o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container): Unit = {
      o match {
        case o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container_P => writeMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container_PS => writeMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_PS(o)
      }
    }

    def writeMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_P(o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_P)
      writeMining_Threat_Retreat_SupervisorQualified_Threat(o.api_qualified_threat)
      writeMining_Threat_Retreat_SupervisorThreat_Invalidity(o.api_threat_invalidity)
      writeMining_Threat_Retreat_SupervisorThreat_Publication_Facts(o.api_threat_publication)
    }

    def writeMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_PS)
      writeMining_Threat_Retreat_SupervisorQualified_Threat(o.api_qualified_threat)
      writeMining_Threat_Retreat_SupervisorThreat_Invalidity(o.api_threat_invalidity)
      writeMining_Threat_Retreat_SupervisorThreat_Publication_Facts(o.api_threat_publication)
    }

    def writeMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container(o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container): Unit = {
      o match {
        case o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container_P => writeMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container_PS => writeMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_PS(o)
      }
    }

    def writeMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_P(o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_P)
      writeMining_Threat_Retreat_SupervisorRaw_Resource_Observation(o.api_raw_resources)
    }

    def writeMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_PS)
      writeMining_Threat_Retreat_SupervisorRaw_Resource_Observation(o.api_raw_resources)
    }

    def writeMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container(o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container): Unit = {
      o match {
        case o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container_P => writeMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container_PS => writeMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_PS(o)
      }
    }

    def writeMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_P(o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_P)
      writeMining_Threat_Retreat_SupervisorDefense_Facts(o.api_defense_facts)
      writeMining_Threat_Retreat_SupervisorMining_Recovery_Facts(o.api_mining_recovery_facts)
      writeMining_Threat_Retreat_SupervisorResource_Invalidity(o.api_resource_invalidity)
      writeMining_Threat_Retreat_SupervisorResource_Publication_Facts(o.api_resource_publication)
    }

    def writeMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_PS)
      writeMining_Threat_Retreat_SupervisorDefense_Facts(o.api_defense_facts)
      writeMining_Threat_Retreat_SupervisorMining_Recovery_Facts(o.api_mining_recovery_facts)
      writeMining_Threat_Retreat_SupervisorResource_Invalidity(o.api_resource_invalidity)
      writeMining_Threat_Retreat_SupervisorResource_Publication_Facts(o.api_resource_publication)
    }

    def writeMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container(o: Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container): Unit = {
      o match {
        case o: Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container_P => writeMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container_PS => writeMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_PS(o)
      }
    }

    def writeMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_P(o: Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_P)
      writeMining_Threat_Retreat_SupervisorRaw_Mission_Observation(o.api_raw_mission)
    }

    def writeMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_PS)
      writeMining_Threat_Retreat_SupervisorRaw_Mission_Observation(o.api_raw_mission)
    }

    def writeMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container(o: Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container): Unit = {
      o match {
        case o: Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container_P => writeMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container_PS => writeMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_PS(o)
      }
    }

    def writeMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_P(o: Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_P)
      writeMining_Threat_Retreat_SupervisorArrival_Fact(o.api_arrival_fact)
      writeMining_Threat_Retreat_SupervisorMission_Facts(o.api_mission_facts)
      writeMining_Threat_Retreat_SupervisorMission_Invalidity_Facts(o.api_mission_invalidity)
    }

    def writeMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_PS)
      writeMining_Threat_Retreat_SupervisorArrival_Fact(o.api_arrival_fact)
      writeMining_Threat_Retreat_SupervisorMission_Facts(o.api_mission_facts)
      writeMining_Threat_Retreat_SupervisorMission_Invalidity_Facts(o.api_mission_invalidity)
    }

    def writeMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container(o: Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container): Unit = {
      o match {
        case o: Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container_P => writeMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container_PS => writeMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_PS(o)
      }
    }

    def writeMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_P(o: Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_P)
      writeMining_Threat_Retreat_SupervisorMission_Facts(o.api_mission_facts)
      writeMining_Threat_Retreat_SupervisorPhase_Context(o.api_phase_context)
      writeMining_Threat_Retreat_SupervisorMining_Recovery_Facts(o.api_resource_facts)
      writeMining_Threat_Retreat_SupervisorQualified_Threat(o.api_threat_fact)
    }

    def writeMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_PS)
      writeMining_Threat_Retreat_SupervisorMission_Facts(o.api_mission_facts)
      writeMining_Threat_Retreat_SupervisorPhase_Context(o.api_phase_context)
      writeMining_Threat_Retreat_SupervisorMining_Recovery_Facts(o.api_resource_facts)
      writeMining_Threat_Retreat_SupervisorQualified_Threat(o.api_threat_fact)
    }

    def writeMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container(o: Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container): Unit = {
      o match {
        case o: Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container_P => writeMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container_PS => writeMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_PS(o)
      }
    }

    def writeMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_P(o: Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_P)
      writeMining_Threat_Retreat_SupervisorMission_Proposal(o.api_mission_proposal)
    }

    def writeMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_PS)
      writeMining_Threat_Retreat_SupervisorMission_Proposal(o.api_mission_proposal)
    }

    def writeMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container(o: Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container): Unit = {
      o match {
        case o: Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container_P => writeMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container_PS => writeMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_PS(o)
      }
    }

    def writeMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_P(o: Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_P)
      writeMining_Threat_Retreat_SupervisorArrival_Fact(o.api_arrival_fact)
      writeMining_Threat_Retreat_SupervisorDefense_Facts(o.api_defense_facts)
      writeMining_Threat_Retreat_SupervisorPhase_Context(o.api_phase_context)
      writeMining_Threat_Retreat_SupervisorQualified_Threat(o.api_threat_fact)
    }

    def writeMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_PS)
      writeMining_Threat_Retreat_SupervisorArrival_Fact(o.api_arrival_fact)
      writeMining_Threat_Retreat_SupervisorDefense_Facts(o.api_defense_facts)
      writeMining_Threat_Retreat_SupervisorPhase_Context(o.api_phase_context)
      writeMining_Threat_Retreat_SupervisorQualified_Threat(o.api_threat_fact)
    }

    def writeMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container(o: Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container): Unit = {
      o match {
        case o: Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container_P => writeMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container_PS => writeMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_PS(o)
      }
    }

    def writeMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_P(o: Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_P)
      writeMining_Threat_Retreat_SupervisorResponse_Proposal(o.api_response_proposal)
    }

    def writeMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_PS)
      writeMining_Threat_Retreat_SupervisorResponse_Proposal(o.api_response_proposal)
    }

    def writeMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container(o: Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container): Unit = {
      o match {
        case o: Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container_P => writeMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container_PS => writeMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_PS(o)
      }
    }

    def writeMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_P(o: Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_P)
      writeMining_Threat_Retreat_SupervisorFault_Fact(o.api_fault)
      writeMining_Threat_Retreat_SupervisorMission_Proposal(o.api_mission_candidate)
      writeMining_Threat_Retreat_SupervisorPhase_State_Input(o.api_phase_state)
      writeMining_Threat_Retreat_SupervisorResource_Publication_Facts(o.api_resource_publication)
      writeMining_Threat_Retreat_SupervisorResponse_Proposal(o.api_response_candidate)
      writeMining_Threat_Retreat_SupervisorThreat_Publication_Facts(o.api_threat_publication)
    }

    def writeMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_PS)
      writeMining_Threat_Retreat_SupervisorFault_Fact(o.api_fault)
      writeMining_Threat_Retreat_SupervisorMission_Proposal(o.api_mission_candidate)
      writeMining_Threat_Retreat_SupervisorPhase_State_Input(o.api_phase_state)
      writeMining_Threat_Retreat_SupervisorResource_Publication_Facts(o.api_resource_publication)
      writeMining_Threat_Retreat_SupervisorResponse_Proposal(o.api_response_candidate)
      writeMining_Threat_Retreat_SupervisorThreat_Publication_Facts(o.api_threat_publication)
    }

    def writeMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container(o: Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container): Unit = {
      o match {
        case o: Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container_P => writeMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container_PS => writeMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_PS(o)
      }
    }

    def writeMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_P(o: Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_P)
      writeMining_Threat_Retreat_SupervisorPhase_Context(o.api_phase_context)
      writeMining_Threat_Retreat_SupervisorAtomic_Supervisor_Result(o.api_resolved_atomic_result)
    }

    def writeMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_PS)
      writeMining_Threat_Retreat_SupervisorPhase_Context(o.api_phase_context)
      writeMining_Threat_Retreat_SupervisorAtomic_Supervisor_Result(o.api_resolved_atomic_result)
    }

    def writeMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container(o: Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container): Unit = {
      o match {
        case o: Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container_P => writeMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container_PS => writeMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_PS(o)
      }
    }

    def writeMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_P(o: Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_P)
      writeMining_Threat_Retreat_SupervisorAtomic_Supervisor_Result(o.api_atomic_result)
    }

    def writeMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_PS)
      writeMining_Threat_Retreat_SupervisorAtomic_Supervisor_Result(o.api_atomic_result)
    }

    def writeMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container(o: Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container): Unit = {
      o match {
        case o: Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container_P => writeMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container_PS => writeMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_PS(o)
      }
    }

    def writeMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_P(o: Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_P)
      writeMining_Threat_Retreat_SupervisorPublished_Supervisor_Result(o.api_publication)
    }

    def writeMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Mining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_PS)
      writeMining_Threat_Retreat_SupervisorPublished_Supervisor_Result(o.api_publication)
    }

    def writeruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeutilContainer(o: util.Container): Unit = {
      o match {
        case o: util.EmptyContainer => writeutilEmptyContainer(o)
        case o: Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container_P => writeMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container_PS => writeMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container_P => writeMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container_PS => writeMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container_P => writeMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container_PS => writeMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container_P => writeMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container_PS => writeMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container_P => writeMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container_PS => writeMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container_P => writeMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container_PS => writeMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container_P => writeMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container_PS => writeMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container_P => writeMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container_PS => writeMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container_P => writeMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container_PS => writeMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container_P => writeMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container_PS => writeMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container_P => writeMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container_PS => writeMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container_P => writeMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container_PS => writeMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container_P => writeMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container_PS => writeMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container_P => writeMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container_PS => writeMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container_P => writeMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container_PS => writeMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container_P => writeMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container_PS => writeMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_PS(o)
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
        case o: Mining_Threat_Retreat_Supervisor.Fault_Fact_Payload => writeMining_Threat_Retreat_SupervisorFault_Fact_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Arrival_Fact_Payload => writeMining_Threat_Retreat_SupervisorArrival_Fact_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Defense_Facts_Payload => writeMining_Threat_Retreat_SupervisorDefense_Facts_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Phase_Context_Payload => writeMining_Threat_Retreat_SupervisorPhase_Context_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Mission_Facts_Payload => writeMining_Threat_Retreat_SupervisorMission_Facts_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Mission_Proposal_Payload => writeMining_Threat_Retreat_SupervisorMission_Proposal_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Qualified_Threat_Payload => writeMining_Threat_Retreat_SupervisorQualified_Threat_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Invalidity_Payload => writeMining_Threat_Retreat_SupervisorThreat_Invalidity_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Phase_State_Input_Payload => writeMining_Threat_Retreat_SupervisorPhase_State_Input_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Response_Proposal_Payload => writeMining_Threat_Retreat_SupervisorResponse_Proposal_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_State_Input_Payload => writeMining_Threat_Retreat_SupervisorThreat_State_Input_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Resource_Invalidity_Payload => writeMining_Threat_Retreat_SupervisorResource_Invalidity_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Mining_Recovery_Facts_Payload => writeMining_Threat_Retreat_SupervisorMining_Recovery_Facts_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Raw_Threat_Observation_Payload => writeMining_Threat_Retreat_SupervisorRaw_Threat_Observation_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Raw_Mission_Observation_Payload => writeMining_Threat_Retreat_SupervisorRaw_Mission_Observation_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Publication_Facts_Payload => writeMining_Threat_Retreat_SupervisorThreat_Publication_Facts_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Mission_Invalidity_Facts_Payload => writeMining_Threat_Retreat_SupervisorMission_Invalidity_Facts_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Atomic_Supervisor_Result_Payload => writeMining_Threat_Retreat_SupervisorAtomic_Supervisor_Result_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Raw_Resource_Observation_Payload => writeMining_Threat_Retreat_SupervisorRaw_Resource_Observation_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Resource_Publication_Facts_Payload => writeMining_Threat_Retreat_SupervisorResource_Publication_Facts_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Published_Supervisor_Result_Payload => writeMining_Threat_Retreat_SupervisorPublished_Supervisor_Result_Payload(o)
        case o: Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container_P => writeMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container_PS => writeMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container_P => writeMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container_PS => writeMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container_P => writeMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container_PS => writeMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container_P => writeMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container_PS => writeMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container_P => writeMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container_PS => writeMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container_P => writeMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container_PS => writeMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container_P => writeMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container_PS => writeMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container_P => writeMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container_PS => writeMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container_P => writeMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container_PS => writeMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container_P => writeMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container_PS => writeMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container_P => writeMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container_PS => writeMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container_P => writeMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container_PS => writeMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container_P => writeMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container_PS => writeMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container_P => writeMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container_PS => writeMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container_P => writeMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container_PS => writeMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_PS(o)
        case o: Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container_P => writeMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_P(o)
        case o: Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container_PS => writeMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_PS(o)
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

    def readMining_Threat_Retreat_SupervisorMission_Invalidity_Facts(): Mining_Threat_Retreat_Supervisor.Mission_Invalidity_Facts = {
      val r = readMining_Threat_Retreat_SupervisorMission_Invalidity_FactsT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorMission_Invalidity_FactsT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Mission_Invalidity_Facts = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorMission_Invalidity_Facts)
      }
      val intent_invalid = reader.readB()
      val arrival_invalid = reader.readB()
      val resupply_invalid = reader.readB()
      return Mining_Threat_Retreat_Supervisor.Mission_Invalidity_Facts(intent_invalid, arrival_invalid, resupply_invalid)
    }

    def readMining_Threat_Retreat_SupervisorMission_Invalidity_Facts_Payload(): Mining_Threat_Retreat_Supervisor.Mission_Invalidity_Facts_Payload = {
      val r = readMining_Threat_Retreat_SupervisorMission_Invalidity_Facts_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorMission_Invalidity_Facts_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Mission_Invalidity_Facts_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorMission_Invalidity_Facts_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisorMission_Invalidity_Facts()
      return Mining_Threat_Retreat_Supervisor.Mission_Invalidity_Facts_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisorThreat_Invalidity(): Mining_Threat_Retreat_Supervisor.Threat_Invalidity = {
      val r = readMining_Threat_Retreat_SupervisorThreat_InvalidityT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorThreat_InvalidityT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Threat_Invalidity = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorThreat_Invalidity)
      }
      val threat_invalid = reader.readB()
      return Mining_Threat_Retreat_Supervisor.Threat_Invalidity(threat_invalid)
    }

    def readMining_Threat_Retreat_SupervisorThreat_Invalidity_Payload(): Mining_Threat_Retreat_Supervisor.Threat_Invalidity_Payload = {
      val r = readMining_Threat_Retreat_SupervisorThreat_Invalidity_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorThreat_Invalidity_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Threat_Invalidity_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorThreat_Invalidity_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisorThreat_Invalidity()
      return Mining_Threat_Retreat_Supervisor.Threat_Invalidity_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisorResource_Invalidity(): Mining_Threat_Retreat_Supervisor.Resource_Invalidity = {
      val r = readMining_Threat_Retreat_SupervisorResource_InvalidityT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorResource_InvalidityT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Resource_Invalidity = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorResource_Invalidity)
      }
      val resource_invalid = reader.readB()
      return Mining_Threat_Retreat_Supervisor.Resource_Invalidity(resource_invalid)
    }

    def readMining_Threat_Retreat_SupervisorResource_Invalidity_Payload(): Mining_Threat_Retreat_Supervisor.Resource_Invalidity_Payload = {
      val r = readMining_Threat_Retreat_SupervisorResource_Invalidity_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorResource_Invalidity_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Resource_Invalidity_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorResource_Invalidity_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisorResource_Invalidity()
      return Mining_Threat_Retreat_Supervisor.Resource_Invalidity_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisorMining_Recovery_Facts(): Mining_Threat_Retreat_Supervisor.Mining_Recovery_Facts = {
      val r = readMining_Threat_Retreat_SupervisorMining_Recovery_FactsT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorMining_Recovery_FactsT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Mining_Recovery_Facts = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorMining_Recovery_Facts)
      }
      val mine_ready = reader.readB()
      val resource_reset = reader.readB()
      val cargo_or_capacitor_retreat = reader.readB()
      val target_or_mining_block = reader.readB()
      return Mining_Threat_Retreat_Supervisor.Mining_Recovery_Facts(mine_ready, resource_reset, cargo_or_capacitor_retreat, target_or_mining_block)
    }

    def readMining_Threat_Retreat_SupervisorMining_Recovery_Facts_Payload(): Mining_Threat_Retreat_Supervisor.Mining_Recovery_Facts_Payload = {
      val r = readMining_Threat_Retreat_SupervisorMining_Recovery_Facts_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorMining_Recovery_Facts_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Mining_Recovery_Facts_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorMining_Recovery_Facts_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisorMining_Recovery_Facts()
      return Mining_Threat_Retreat_Supervisor.Mining_Recovery_Facts_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisorDefense_Facts(): Mining_Threat_Retreat_Supervisor.Defense_Facts = {
      val r = readMining_Threat_Retreat_SupervisorDefense_FactsT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorDefense_FactsT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Defense_Facts = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorDefense_Facts)
      }
      val defense_ready = reader.readB()
      return Mining_Threat_Retreat_Supervisor.Defense_Facts(defense_ready)
    }

    def readMining_Threat_Retreat_SupervisorDefense_Facts_Payload(): Mining_Threat_Retreat_Supervisor.Defense_Facts_Payload = {
      val r = readMining_Threat_Retreat_SupervisorDefense_Facts_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorDefense_Facts_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Defense_Facts_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorDefense_Facts_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisorDefense_Facts()
      return Mining_Threat_Retreat_Supervisor.Defense_Facts_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisorMission_Facts(): Mining_Threat_Retreat_Supervisor.Mission_Facts = {
      val r = readMining_Threat_Retreat_SupervisorMission_FactsT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorMission_FactsT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Mission_Facts = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorMission_Facts)
      }
      val valid_mine = reader.readB()
      val invalid_or_return = reader.readB()
      val valid_hold_or_return = reader.readB()
      val valid_complete_resupply = reader.readB()
      val intent_invalid = reader.readB()
      return Mining_Threat_Retreat_Supervisor.Mission_Facts(valid_mine, invalid_or_return, valid_hold_or_return, valid_complete_resupply, intent_invalid)
    }

    def readMining_Threat_Retreat_SupervisorMission_Facts_Payload(): Mining_Threat_Retreat_Supervisor.Mission_Facts_Payload = {
      val r = readMining_Threat_Retreat_SupervisorMission_Facts_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorMission_Facts_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Mission_Facts_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorMission_Facts_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisorMission_Facts()
      return Mining_Threat_Retreat_Supervisor.Mission_Facts_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisorArrival_Fact(): Mining_Threat_Retreat_Supervisor.Arrival_Fact = {
      val r = readMining_Threat_Retreat_SupervisorArrival_FactT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorArrival_FactT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Arrival_Fact = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorArrival_Fact)
      }
      val valid_safe_at_station = reader.readB()
      return Mining_Threat_Retreat_Supervisor.Arrival_Fact(valid_safe_at_station)
    }

    def readMining_Threat_Retreat_SupervisorArrival_Fact_Payload(): Mining_Threat_Retreat_Supervisor.Arrival_Fact_Payload = {
      val r = readMining_Threat_Retreat_SupervisorArrival_Fact_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorArrival_Fact_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Arrival_Fact_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorArrival_Fact_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisorArrival_Fact()
      return Mining_Threat_Retreat_Supervisor.Arrival_Fact_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisorPhase_Context(): Mining_Threat_Retreat_Supervisor.Phase_Context = {
      val r = readMining_Threat_Retreat_SupervisorPhase_ContextT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorPhase_ContextT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Phase_Context = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorPhase_Context)
      }
      val current_phase = reader.readS32()
      return Mining_Threat_Retreat_Supervisor.Phase_Context(current_phase)
    }

    def readMining_Threat_Retreat_SupervisorPhase_Context_Payload(): Mining_Threat_Retreat_Supervisor.Phase_Context_Payload = {
      val r = readMining_Threat_Retreat_SupervisorPhase_Context_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorPhase_Context_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Phase_Context_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorPhase_Context_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisorPhase_Context()
      return Mining_Threat_Retreat_Supervisor.Phase_Context_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisorFault_Fact(): Mining_Threat_Retreat_Supervisor.Fault_Fact = {
      val r = readMining_Threat_Retreat_SupervisorFault_FactT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorFault_FactT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Fault_Fact = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorFault_Fact)
      }
      val fault = reader.readS32()
      return Mining_Threat_Retreat_Supervisor.Fault_Fact(fault)
    }

    def readMining_Threat_Retreat_SupervisorFault_Fact_Payload(): Mining_Threat_Retreat_Supervisor.Fault_Fact_Payload = {
      val r = readMining_Threat_Retreat_SupervisorFault_Fact_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorFault_Fact_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Fault_Fact_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorFault_Fact_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisorFault_Fact()
      return Mining_Threat_Retreat_Supervisor.Fault_Fact_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisorRaw_Threat_Observation(): Mining_Threat_Retreat_Supervisor.Raw_Threat_Observation = {
      val r = readMining_Threat_Retreat_SupervisorRaw_Threat_ObservationT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorRaw_Threat_ObservationT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Raw_Threat_Observation = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorRaw_Threat_Observation)
      }
      val threat = reader.readS32()
      val threat_validity = reader.readS32()
      return Mining_Threat_Retreat_Supervisor.Raw_Threat_Observation(threat, threat_validity)
    }

    def readMining_Threat_Retreat_SupervisorRaw_Threat_Observation_Payload(): Mining_Threat_Retreat_Supervisor.Raw_Threat_Observation_Payload = {
      val r = readMining_Threat_Retreat_SupervisorRaw_Threat_Observation_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorRaw_Threat_Observation_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Raw_Threat_Observation_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorRaw_Threat_Observation_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisorRaw_Threat_Observation()
      return Mining_Threat_Retreat_Supervisor.Raw_Threat_Observation_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisorThreat_State_Input(): Mining_Threat_Retreat_Supervisor.Threat_State_Input = {
      val r = readMining_Threat_Retreat_SupervisorThreat_State_InputT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorThreat_State_InputT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Threat_State_Input = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorThreat_State_Input)
      }
      val current_valid_streak = reader.readS32()
      return Mining_Threat_Retreat_Supervisor.Threat_State_Input(current_valid_streak)
    }

    def readMining_Threat_Retreat_SupervisorThreat_State_Input_Payload(): Mining_Threat_Retreat_Supervisor.Threat_State_Input_Payload = {
      val r = readMining_Threat_Retreat_SupervisorThreat_State_Input_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorThreat_State_Input_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Threat_State_Input_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorThreat_State_Input_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisorThreat_State_Input()
      return Mining_Threat_Retreat_Supervisor.Threat_State_Input_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisorQualified_Threat(): Mining_Threat_Retreat_Supervisor.Qualified_Threat = {
      val r = readMining_Threat_Retreat_SupervisorQualified_ThreatT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorQualified_ThreatT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Qualified_Threat = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorQualified_Threat)
      }
      val qualified_threat = reader.readS32()
      val untrusted = reader.readB()
      val acceptable = reader.readB()
      val hostile = reader.readB()
      val severe = reader.readB()
      return Mining_Threat_Retreat_Supervisor.Qualified_Threat(qualified_threat, untrusted, acceptable, hostile, severe)
    }

    def readMining_Threat_Retreat_SupervisorQualified_Threat_Payload(): Mining_Threat_Retreat_Supervisor.Qualified_Threat_Payload = {
      val r = readMining_Threat_Retreat_SupervisorQualified_Threat_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorQualified_Threat_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Qualified_Threat_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorQualified_Threat_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisorQualified_Threat()
      return Mining_Threat_Retreat_Supervisor.Qualified_Threat_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisorThreat_Publication_Facts(): Mining_Threat_Retreat_Supervisor.Threat_Publication_Facts = {
      val r = readMining_Threat_Retreat_SupervisorThreat_Publication_FactsT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorThreat_Publication_FactsT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Threat_Publication_Facts = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorThreat_Publication_Facts)
      }
      val qualified_threat = reader.readS32()
      val next_valid_streak = reader.readS32()
      return Mining_Threat_Retreat_Supervisor.Threat_Publication_Facts(qualified_threat, next_valid_streak)
    }

    def readMining_Threat_Retreat_SupervisorThreat_Publication_Facts_Payload(): Mining_Threat_Retreat_Supervisor.Threat_Publication_Facts_Payload = {
      val r = readMining_Threat_Retreat_SupervisorThreat_Publication_Facts_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorThreat_Publication_Facts_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Threat_Publication_Facts_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorThreat_Publication_Facts_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisorThreat_Publication_Facts()
      return Mining_Threat_Retreat_Supervisor.Threat_Publication_Facts_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisorRaw_Resource_Observation(): Mining_Threat_Retreat_Supervisor.Raw_Resource_Observation = {
      val r = readMining_Threat_Retreat_SupervisorRaw_Resource_ObservationT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorRaw_Resource_ObservationT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Raw_Resource_Observation = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorRaw_Resource_Observation)
      }
      val cargo = reader.readS32()
      val cargo_validity = reader.readS32()
      val capacitor = reader.readS32()
      val capacitor_validity = reader.readS32()
      val target = reader.readS32()
      val target_validity = reader.readS32()
      val mining_availability = reader.readS32()
      val defense_availability = reader.readS32()
      val retreat_availability = reader.readS32()
      val availability_validity = reader.readS32()
      return Mining_Threat_Retreat_Supervisor.Raw_Resource_Observation(cargo, cargo_validity, capacitor, capacitor_validity, target, target_validity, mining_availability, defense_availability, retreat_availability, availability_validity)
    }

    def readMining_Threat_Retreat_SupervisorRaw_Resource_Observation_Payload(): Mining_Threat_Retreat_Supervisor.Raw_Resource_Observation_Payload = {
      val r = readMining_Threat_Retreat_SupervisorRaw_Resource_Observation_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorRaw_Resource_Observation_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Raw_Resource_Observation_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorRaw_Resource_Observation_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisorRaw_Resource_Observation()
      return Mining_Threat_Retreat_Supervisor.Raw_Resource_Observation_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisorResource_Publication_Facts(): Mining_Threat_Retreat_Supervisor.Resource_Publication_Facts = {
      val r = readMining_Threat_Retreat_SupervisorResource_Publication_FactsT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorResource_Publication_FactsT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Resource_Publication_Facts = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorResource_Publication_Facts)
      }
      val cargo_advisory = reader.readS32()
      val capacitor_advisory = reader.readS32()
      val retreat_advisory = reader.readS32()
      return Mining_Threat_Retreat_Supervisor.Resource_Publication_Facts(cargo_advisory, capacitor_advisory, retreat_advisory)
    }

    def readMining_Threat_Retreat_SupervisorResource_Publication_Facts_Payload(): Mining_Threat_Retreat_Supervisor.Resource_Publication_Facts_Payload = {
      val r = readMining_Threat_Retreat_SupervisorResource_Publication_Facts_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorResource_Publication_Facts_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Resource_Publication_Facts_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorResource_Publication_Facts_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisorResource_Publication_Facts()
      return Mining_Threat_Retreat_Supervisor.Resource_Publication_Facts_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisorRaw_Mission_Observation(): Mining_Threat_Retreat_Supervisor.Raw_Mission_Observation = {
      val r = readMining_Threat_Retreat_SupervisorRaw_Mission_ObservationT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorRaw_Mission_ObservationT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Raw_Mission_Observation = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorRaw_Mission_Observation)
      }
      val pilot_intent = reader.readS32()
      val intent_validity = reader.readS32()
      val arrival = reader.readS32()
      val arrival_validity = reader.readS32()
      val resupply = reader.readS32()
      val resupply_validity = reader.readS32()
      return Mining_Threat_Retreat_Supervisor.Raw_Mission_Observation(pilot_intent, intent_validity, arrival, arrival_validity, resupply, resupply_validity)
    }

    def readMining_Threat_Retreat_SupervisorRaw_Mission_Observation_Payload(): Mining_Threat_Retreat_Supervisor.Raw_Mission_Observation_Payload = {
      val r = readMining_Threat_Retreat_SupervisorRaw_Mission_Observation_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorRaw_Mission_Observation_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Raw_Mission_Observation_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorRaw_Mission_Observation_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisorRaw_Mission_Observation()
      return Mining_Threat_Retreat_Supervisor.Raw_Mission_Observation_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisorMission_Proposal(): Mining_Threat_Retreat_Supervisor.Mission_Proposal = {
      val r = readMining_Threat_Retreat_SupervisorMission_ProposalT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorMission_ProposalT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Mission_Proposal = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorMission_Proposal)
      }
      val proposed_reason = reader.readS32()
      return Mining_Threat_Retreat_Supervisor.Mission_Proposal(proposed_reason)
    }

    def readMining_Threat_Retreat_SupervisorMission_Proposal_Payload(): Mining_Threat_Retreat_Supervisor.Mission_Proposal_Payload = {
      val r = readMining_Threat_Retreat_SupervisorMission_Proposal_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorMission_Proposal_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Mission_Proposal_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorMission_Proposal_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisorMission_Proposal()
      return Mining_Threat_Retreat_Supervisor.Mission_Proposal_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisorResponse_Proposal(): Mining_Threat_Retreat_Supervisor.Response_Proposal = {
      val r = readMining_Threat_Retreat_SupervisorResponse_ProposalT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorResponse_ProposalT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Response_Proposal = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorResponse_Proposal)
      }
      val proposed_reason = reader.readS32()
      return Mining_Threat_Retreat_Supervisor.Response_Proposal(proposed_reason)
    }

    def readMining_Threat_Retreat_SupervisorResponse_Proposal_Payload(): Mining_Threat_Retreat_Supervisor.Response_Proposal_Payload = {
      val r = readMining_Threat_Retreat_SupervisorResponse_Proposal_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorResponse_Proposal_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Response_Proposal_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorResponse_Proposal_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisorResponse_Proposal()
      return Mining_Threat_Retreat_Supervisor.Response_Proposal_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisorPhase_State_Input(): Mining_Threat_Retreat_Supervisor.Phase_State_Input = {
      val r = readMining_Threat_Retreat_SupervisorPhase_State_InputT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorPhase_State_InputT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Phase_State_Input = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorPhase_State_Input)
      }
      val current_phase = reader.readS32()
      return Mining_Threat_Retreat_Supervisor.Phase_State_Input(current_phase)
    }

    def readMining_Threat_Retreat_SupervisorPhase_State_Input_Payload(): Mining_Threat_Retreat_Supervisor.Phase_State_Input_Payload = {
      val r = readMining_Threat_Retreat_SupervisorPhase_State_Input_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorPhase_State_Input_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Phase_State_Input_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorPhase_State_Input_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisorPhase_State_Input()
      return Mining_Threat_Retreat_Supervisor.Phase_State_Input_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisorAtomic_Supervisor_Result(): Mining_Threat_Retreat_Supervisor.Atomic_Supervisor_Result = {
      val r = readMining_Threat_Retreat_SupervisorAtomic_Supervisor_ResultT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorAtomic_Supervisor_ResultT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Atomic_Supervisor_Result = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorAtomic_Supervisor_Result)
      }
      val command = reader.readS32()
      val current_phase = reader.readS32()
      val next_phase = reader.readS32()
      val reason = reader.readS32()
      val fault = reader.readS32()
      val next_valid_streak = reader.readS32()
      val cargo_advisory = reader.readS32()
      val capacitor_advisory = reader.readS32()
      val retreat_advisory = reader.readS32()
      return Mining_Threat_Retreat_Supervisor.Atomic_Supervisor_Result(command, current_phase, next_phase, reason, fault, next_valid_streak, cargo_advisory, capacitor_advisory, retreat_advisory)
    }

    def readMining_Threat_Retreat_SupervisorAtomic_Supervisor_Result_Payload(): Mining_Threat_Retreat_Supervisor.Atomic_Supervisor_Result_Payload = {
      val r = readMining_Threat_Retreat_SupervisorAtomic_Supervisor_Result_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorAtomic_Supervisor_Result_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Atomic_Supervisor_Result_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorAtomic_Supervisor_Result_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisorAtomic_Supervisor_Result()
      return Mining_Threat_Retreat_Supervisor.Atomic_Supervisor_Result_Payload(value)
    }

    def readMining_Threat_Retreat_SupervisorPublished_Supervisor_Result(): Mining_Threat_Retreat_Supervisor.Published_Supervisor_Result = {
      val r = readMining_Threat_Retreat_SupervisorPublished_Supervisor_ResultT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorPublished_Supervisor_ResultT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Published_Supervisor_Result = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorPublished_Supervisor_Result)
      }
      val command = reader.readS32()
      val current_phase = reader.readS32()
      val next_phase = reader.readS32()
      val reason = reader.readS32()
      val fault = reader.readS32()
      val next_valid_streak = reader.readS32()
      val cargo_advisory = reader.readS32()
      val capacitor_advisory = reader.readS32()
      val retreat_advisory = reader.readS32()
      val laser = reader.readS32()
      val drones = reader.readS32()
      return Mining_Threat_Retreat_Supervisor.Published_Supervisor_Result(command, current_phase, next_phase, reason, fault, next_valid_streak, cargo_advisory, capacitor_advisory, retreat_advisory, laser, drones)
    }

    def readMining_Threat_Retreat_SupervisorPublished_Supervisor_Result_Payload(): Mining_Threat_Retreat_Supervisor.Published_Supervisor_Result_Payload = {
      val r = readMining_Threat_Retreat_SupervisorPublished_Supervisor_Result_PayloadT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorPublished_Supervisor_Result_PayloadT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Published_Supervisor_Result_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorPublished_Supervisor_Result_Payload)
      }
      val value = readMining_Threat_Retreat_SupervisorPublished_Supervisor_Result()
      return Mining_Threat_Retreat_Supervisor.Published_Supervisor_Result_Payload(value)
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

    def readMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container(): Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container.")
          val r = readMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_PST(T)
          return r
      }
    }

    def readMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_P(): Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container_P = {
      val r = readMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_PT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_P)
      }
      val api_mission_invalidity = readMining_Threat_Retreat_SupervisorMission_Invalidity_Facts()
      val api_phase_context = readMining_Threat_Retreat_SupervisorPhase_Context()
      val api_resource_invalidity = readMining_Threat_Retreat_SupervisorResource_Invalidity()
      val api_threat_invalidity = readMining_Threat_Retreat_SupervisorThreat_Invalidity()
      return Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container_P(api_mission_invalidity, api_phase_context, api_resource_invalidity, api_threat_invalidity)
    }

    def readMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_PS(): Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container_PS = {
      val r = readMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_PST(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_PS)
      }
      val api_mission_invalidity = readMining_Threat_Retreat_SupervisorMission_Invalidity_Facts()
      val api_phase_context = readMining_Threat_Retreat_SupervisorPhase_Context()
      val api_resource_invalidity = readMining_Threat_Retreat_SupervisorResource_Invalidity()
      val api_threat_invalidity = readMining_Threat_Retreat_SupervisorThreat_Invalidity()
      return Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container_PS(api_mission_invalidity, api_phase_context, api_resource_invalidity, api_threat_invalidity)
    }

    def readMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container(): Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container.")
          val r = readMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_PST(T)
          return r
      }
    }

    def readMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_P(): Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container_P = {
      val r = readMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_PT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_P)
      }
      val api_fault = readMining_Threat_Retreat_SupervisorFault_Fact()
      return Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container_P(api_fault)
    }

    def readMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_PS(): Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container_PS = {
      val r = readMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_PST(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_PS)
      }
      val api_fault = readMining_Threat_Retreat_SupervisorFault_Fact()
      return Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container_PS(api_fault)
    }

    def readMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container(): Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container.")
          val r = readMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_PST(T)
          return r
      }
    }

    def readMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_P(): Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container_P = {
      val r = readMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_PT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_P)
      }
      val api_raw_threat = readMining_Threat_Retreat_SupervisorRaw_Threat_Observation()
      val api_streak_state = readMining_Threat_Retreat_SupervisorThreat_State_Input()
      return Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container_P(api_raw_threat, api_streak_state)
    }

    def readMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_PS(): Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container_PS = {
      val r = readMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_PST(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_PS)
      }
      val api_raw_threat = readMining_Threat_Retreat_SupervisorRaw_Threat_Observation()
      val api_streak_state = readMining_Threat_Retreat_SupervisorThreat_State_Input()
      return Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container_PS(api_raw_threat, api_streak_state)
    }

    def readMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container(): Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container.")
          val r = readMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_PST(T)
          return r
      }
    }

    def readMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_P(): Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container_P = {
      val r = readMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_PT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_P)
      }
      val api_qualified_threat = readMining_Threat_Retreat_SupervisorQualified_Threat()
      val api_threat_invalidity = readMining_Threat_Retreat_SupervisorThreat_Invalidity()
      val api_threat_publication = readMining_Threat_Retreat_SupervisorThreat_Publication_Facts()
      return Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container_P(api_qualified_threat, api_threat_invalidity, api_threat_publication)
    }

    def readMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_PS(): Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container_PS = {
      val r = readMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_PST(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_PS)
      }
      val api_qualified_threat = readMining_Threat_Retreat_SupervisorQualified_Threat()
      val api_threat_invalidity = readMining_Threat_Retreat_SupervisorThreat_Invalidity()
      val api_threat_publication = readMining_Threat_Retreat_SupervisorThreat_Publication_Facts()
      return Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container_PS(api_qualified_threat, api_threat_invalidity, api_threat_publication)
    }

    def readMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container(): Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container.")
          val r = readMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_PST(T)
          return r
      }
    }

    def readMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_P(): Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container_P = {
      val r = readMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_PT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_P)
      }
      val api_raw_resources = readMining_Threat_Retreat_SupervisorRaw_Resource_Observation()
      return Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container_P(api_raw_resources)
    }

    def readMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_PS(): Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container_PS = {
      val r = readMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_PST(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_PS)
      }
      val api_raw_resources = readMining_Threat_Retreat_SupervisorRaw_Resource_Observation()
      return Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container_PS(api_raw_resources)
    }

    def readMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container(): Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container.")
          val r = readMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_PST(T)
          return r
      }
    }

    def readMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_P(): Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container_P = {
      val r = readMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_PT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_P)
      }
      val api_defense_facts = readMining_Threat_Retreat_SupervisorDefense_Facts()
      val api_mining_recovery_facts = readMining_Threat_Retreat_SupervisorMining_Recovery_Facts()
      val api_resource_invalidity = readMining_Threat_Retreat_SupervisorResource_Invalidity()
      val api_resource_publication = readMining_Threat_Retreat_SupervisorResource_Publication_Facts()
      return Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container_P(api_defense_facts, api_mining_recovery_facts, api_resource_invalidity, api_resource_publication)
    }

    def readMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_PS(): Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container_PS = {
      val r = readMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_PST(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_PS)
      }
      val api_defense_facts = readMining_Threat_Retreat_SupervisorDefense_Facts()
      val api_mining_recovery_facts = readMining_Threat_Retreat_SupervisorMining_Recovery_Facts()
      val api_resource_invalidity = readMining_Threat_Retreat_SupervisorResource_Invalidity()
      val api_resource_publication = readMining_Threat_Retreat_SupervisorResource_Publication_Facts()
      return Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container_PS(api_defense_facts, api_mining_recovery_facts, api_resource_invalidity, api_resource_publication)
    }

    def readMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container(): Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container.")
          val r = readMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_PST(T)
          return r
      }
    }

    def readMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_P(): Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container_P = {
      val r = readMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_PT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_P)
      }
      val api_raw_mission = readMining_Threat_Retreat_SupervisorRaw_Mission_Observation()
      return Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container_P(api_raw_mission)
    }

    def readMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_PS(): Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container_PS = {
      val r = readMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_PST(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_PS)
      }
      val api_raw_mission = readMining_Threat_Retreat_SupervisorRaw_Mission_Observation()
      return Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container_PS(api_raw_mission)
    }

    def readMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container(): Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container.")
          val r = readMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_PST(T)
          return r
      }
    }

    def readMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_P(): Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container_P = {
      val r = readMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_PT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_P)
      }
      val api_arrival_fact = readMining_Threat_Retreat_SupervisorArrival_Fact()
      val api_mission_facts = readMining_Threat_Retreat_SupervisorMission_Facts()
      val api_mission_invalidity = readMining_Threat_Retreat_SupervisorMission_Invalidity_Facts()
      return Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container_P(api_arrival_fact, api_mission_facts, api_mission_invalidity)
    }

    def readMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_PS(): Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container_PS = {
      val r = readMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_PST(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_PS)
      }
      val api_arrival_fact = readMining_Threat_Retreat_SupervisorArrival_Fact()
      val api_mission_facts = readMining_Threat_Retreat_SupervisorMission_Facts()
      val api_mission_invalidity = readMining_Threat_Retreat_SupervisorMission_Invalidity_Facts()
      return Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container_PS(api_arrival_fact, api_mission_facts, api_mission_invalidity)
    }

    def readMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container(): Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container.")
          val r = readMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_PST(T)
          return r
      }
    }

    def readMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_P(): Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container_P = {
      val r = readMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_PT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_P)
      }
      val api_mission_facts = readMining_Threat_Retreat_SupervisorMission_Facts()
      val api_phase_context = readMining_Threat_Retreat_SupervisorPhase_Context()
      val api_resource_facts = readMining_Threat_Retreat_SupervisorMining_Recovery_Facts()
      val api_threat_fact = readMining_Threat_Retreat_SupervisorQualified_Threat()
      return Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container_P(api_mission_facts, api_phase_context, api_resource_facts, api_threat_fact)
    }

    def readMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_PS(): Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container_PS = {
      val r = readMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_PST(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_PS)
      }
      val api_mission_facts = readMining_Threat_Retreat_SupervisorMission_Facts()
      val api_phase_context = readMining_Threat_Retreat_SupervisorPhase_Context()
      val api_resource_facts = readMining_Threat_Retreat_SupervisorMining_Recovery_Facts()
      val api_threat_fact = readMining_Threat_Retreat_SupervisorQualified_Threat()
      return Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container_PS(api_mission_facts, api_phase_context, api_resource_facts, api_threat_fact)
    }

    def readMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container(): Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container.")
          val r = readMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_PST(T)
          return r
      }
    }

    def readMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_P(): Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container_P = {
      val r = readMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_PT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_P)
      }
      val api_mission_proposal = readMining_Threat_Retreat_SupervisorMission_Proposal()
      return Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container_P(api_mission_proposal)
    }

    def readMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_PS(): Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container_PS = {
      val r = readMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_PST(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_PS)
      }
      val api_mission_proposal = readMining_Threat_Retreat_SupervisorMission_Proposal()
      return Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container_PS(api_mission_proposal)
    }

    def readMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container(): Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container.")
          val r = readMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_PST(T)
          return r
      }
    }

    def readMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_P(): Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container_P = {
      val r = readMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_PT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_P)
      }
      val api_arrival_fact = readMining_Threat_Retreat_SupervisorArrival_Fact()
      val api_defense_facts = readMining_Threat_Retreat_SupervisorDefense_Facts()
      val api_phase_context = readMining_Threat_Retreat_SupervisorPhase_Context()
      val api_threat_fact = readMining_Threat_Retreat_SupervisorQualified_Threat()
      return Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container_P(api_arrival_fact, api_defense_facts, api_phase_context, api_threat_fact)
    }

    def readMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_PS(): Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container_PS = {
      val r = readMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_PST(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_PS)
      }
      val api_arrival_fact = readMining_Threat_Retreat_SupervisorArrival_Fact()
      val api_defense_facts = readMining_Threat_Retreat_SupervisorDefense_Facts()
      val api_phase_context = readMining_Threat_Retreat_SupervisorPhase_Context()
      val api_threat_fact = readMining_Threat_Retreat_SupervisorQualified_Threat()
      return Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container_PS(api_arrival_fact, api_defense_facts, api_phase_context, api_threat_fact)
    }

    def readMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container(): Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container.")
          val r = readMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_PST(T)
          return r
      }
    }

    def readMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_P(): Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container_P = {
      val r = readMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_PT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_P)
      }
      val api_response_proposal = readMining_Threat_Retreat_SupervisorResponse_Proposal()
      return Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container_P(api_response_proposal)
    }

    def readMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_PS(): Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container_PS = {
      val r = readMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_PST(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_PS)
      }
      val api_response_proposal = readMining_Threat_Retreat_SupervisorResponse_Proposal()
      return Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container_PS(api_response_proposal)
    }

    def readMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container(): Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container.")
          val r = readMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_PST(T)
          return r
      }
    }

    def readMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_P(): Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container_P = {
      val r = readMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_PT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_P)
      }
      val api_fault = readMining_Threat_Retreat_SupervisorFault_Fact()
      val api_mission_candidate = readMining_Threat_Retreat_SupervisorMission_Proposal()
      val api_phase_state = readMining_Threat_Retreat_SupervisorPhase_State_Input()
      val api_resource_publication = readMining_Threat_Retreat_SupervisorResource_Publication_Facts()
      val api_response_candidate = readMining_Threat_Retreat_SupervisorResponse_Proposal()
      val api_threat_publication = readMining_Threat_Retreat_SupervisorThreat_Publication_Facts()
      return Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container_P(api_fault, api_mission_candidate, api_phase_state, api_resource_publication, api_response_candidate, api_threat_publication)
    }

    def readMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_PS(): Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container_PS = {
      val r = readMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_PST(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_PS)
      }
      val api_fault = readMining_Threat_Retreat_SupervisorFault_Fact()
      val api_mission_candidate = readMining_Threat_Retreat_SupervisorMission_Proposal()
      val api_phase_state = readMining_Threat_Retreat_SupervisorPhase_State_Input()
      val api_resource_publication = readMining_Threat_Retreat_SupervisorResource_Publication_Facts()
      val api_response_candidate = readMining_Threat_Retreat_SupervisorResponse_Proposal()
      val api_threat_publication = readMining_Threat_Retreat_SupervisorThreat_Publication_Facts()
      return Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container_PS(api_fault, api_mission_candidate, api_phase_state, api_resource_publication, api_response_candidate, api_threat_publication)
    }

    def readMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container(): Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container.")
          val r = readMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_PST(T)
          return r
      }
    }

    def readMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_P(): Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container_P = {
      val r = readMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_PT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_P)
      }
      val api_phase_context = readMining_Threat_Retreat_SupervisorPhase_Context()
      val api_resolved_atomic_result = readMining_Threat_Retreat_SupervisorAtomic_Supervisor_Result()
      return Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container_P(api_phase_context, api_resolved_atomic_result)
    }

    def readMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_PS(): Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container_PS = {
      val r = readMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_PST(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_PS)
      }
      val api_phase_context = readMining_Threat_Retreat_SupervisorPhase_Context()
      val api_resolved_atomic_result = readMining_Threat_Retreat_SupervisorAtomic_Supervisor_Result()
      return Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container_PS(api_phase_context, api_resolved_atomic_result)
    }

    def readMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container(): Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container.")
          val r = readMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_PST(T)
          return r
      }
    }

    def readMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_P(): Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container_P = {
      val r = readMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_PT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_P)
      }
      val api_atomic_result = readMining_Threat_Retreat_SupervisorAtomic_Supervisor_Result()
      return Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container_P(api_atomic_result)
    }

    def readMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_PS(): Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container_PS = {
      val r = readMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_PST(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_PS)
      }
      val api_atomic_result = readMining_Threat_Retreat_SupervisorAtomic_Supervisor_Result()
      return Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container_PS(api_atomic_result)
    }

    def readMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container(): Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Mining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container.")
          val r = readMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_PST(T)
          return r
      }
    }

    def readMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_P(): Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container_P = {
      val r = readMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_PT(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_PT(typeParsed: B): Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_P)
      }
      val api_publication = readMining_Threat_Retreat_SupervisorPublished_Supervisor_Result()
      return Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container_P(api_publication)
    }

    def readMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_PS(): Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container_PS = {
      val r = readMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_PST(F)
      return r
    }

    def readMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_PST(typeParsed: B): Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_PS)
      }
      val api_publication = readMining_Threat_Retreat_SupervisorPublished_Supervisor_Result()
      return Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container_PS(api_publication)
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
        case Constants.Mining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of util.Container.")
          val r = readMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_PST(T)
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
        case Constants.Mining_Threat_Retreat_SupervisorFault_Fact_Payload => val r = readMining_Threat_Retreat_SupervisorFault_Fact_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorArrival_Fact_Payload => val r = readMining_Threat_Retreat_SupervisorArrival_Fact_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorDefense_Facts_Payload => val r = readMining_Threat_Retreat_SupervisorDefense_Facts_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorPhase_Context_Payload => val r = readMining_Threat_Retreat_SupervisorPhase_Context_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorMission_Facts_Payload => val r = readMining_Threat_Retreat_SupervisorMission_Facts_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorMission_Proposal_Payload => val r = readMining_Threat_Retreat_SupervisorMission_Proposal_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorQualified_Threat_Payload => val r = readMining_Threat_Retreat_SupervisorQualified_Threat_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorThreat_Invalidity_Payload => val r = readMining_Threat_Retreat_SupervisorThreat_Invalidity_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorPhase_State_Input_Payload => val r = readMining_Threat_Retreat_SupervisorPhase_State_Input_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorResponse_Proposal_Payload => val r = readMining_Threat_Retreat_SupervisorResponse_Proposal_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorThreat_State_Input_Payload => val r = readMining_Threat_Retreat_SupervisorThreat_State_Input_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorResource_Invalidity_Payload => val r = readMining_Threat_Retreat_SupervisorResource_Invalidity_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorMining_Recovery_Facts_Payload => val r = readMining_Threat_Retreat_SupervisorMining_Recovery_Facts_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorRaw_Threat_Observation_Payload => val r = readMining_Threat_Retreat_SupervisorRaw_Threat_Observation_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorRaw_Mission_Observation_Payload => val r = readMining_Threat_Retreat_SupervisorRaw_Mission_Observation_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorThreat_Publication_Facts_Payload => val r = readMining_Threat_Retreat_SupervisorThreat_Publication_Facts_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorMission_Invalidity_Facts_Payload => val r = readMining_Threat_Retreat_SupervisorMission_Invalidity_Facts_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorAtomic_Supervisor_Result_Payload => val r = readMining_Threat_Retreat_SupervisorAtomic_Supervisor_Result_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorRaw_Resource_Observation_Payload => val r = readMining_Threat_Retreat_SupervisorRaw_Resource_Observation_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorResource_Publication_Facts_Payload => val r = readMining_Threat_Retreat_SupervisorResource_Publication_Facts_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorPublished_Supervisor_Result_Payload => val r = readMining_Threat_Retreat_SupervisorPublished_Supervisor_Result_PayloadT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_P => val r = readMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_PS => val r = readMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_PST(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_P => val r = readMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_PT(T); return r
        case Constants.Mining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_PS => val r = readMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of art.DataContent.")
          val r = readMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_PST(T)
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

  def fromMining_Threat_Retreat_SupervisorMission_Invalidity_Facts(o: Mining_Threat_Retreat_Supervisor.Mission_Invalidity_Facts, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorMission_Invalidity_Facts(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorMission_Invalidity_Facts(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Mission_Invalidity_Facts, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorMission_Invalidity_Facts(reader: Reader): Mining_Threat_Retreat_Supervisor.Mission_Invalidity_Facts = {
      val r = reader.readMining_Threat_Retreat_SupervisorMission_Invalidity_Facts()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorMission_Invalidity_Facts _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorMission_Invalidity_Facts_Payload(o: Mining_Threat_Retreat_Supervisor.Mission_Invalidity_Facts_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorMission_Invalidity_Facts_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorMission_Invalidity_Facts_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Mission_Invalidity_Facts_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorMission_Invalidity_Facts_Payload(reader: Reader): Mining_Threat_Retreat_Supervisor.Mission_Invalidity_Facts_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisorMission_Invalidity_Facts_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorMission_Invalidity_Facts_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorThreat_Invalidity(o: Mining_Threat_Retreat_Supervisor.Threat_Invalidity, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorThreat_Invalidity(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorThreat_Invalidity(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Threat_Invalidity, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorThreat_Invalidity(reader: Reader): Mining_Threat_Retreat_Supervisor.Threat_Invalidity = {
      val r = reader.readMining_Threat_Retreat_SupervisorThreat_Invalidity()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorThreat_Invalidity _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorThreat_Invalidity_Payload(o: Mining_Threat_Retreat_Supervisor.Threat_Invalidity_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorThreat_Invalidity_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorThreat_Invalidity_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Threat_Invalidity_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorThreat_Invalidity_Payload(reader: Reader): Mining_Threat_Retreat_Supervisor.Threat_Invalidity_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisorThreat_Invalidity_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorThreat_Invalidity_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorResource_Invalidity(o: Mining_Threat_Retreat_Supervisor.Resource_Invalidity, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorResource_Invalidity(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorResource_Invalidity(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Resource_Invalidity, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorResource_Invalidity(reader: Reader): Mining_Threat_Retreat_Supervisor.Resource_Invalidity = {
      val r = reader.readMining_Threat_Retreat_SupervisorResource_Invalidity()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorResource_Invalidity _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorResource_Invalidity_Payload(o: Mining_Threat_Retreat_Supervisor.Resource_Invalidity_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorResource_Invalidity_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorResource_Invalidity_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Resource_Invalidity_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorResource_Invalidity_Payload(reader: Reader): Mining_Threat_Retreat_Supervisor.Resource_Invalidity_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisorResource_Invalidity_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorResource_Invalidity_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorMining_Recovery_Facts(o: Mining_Threat_Retreat_Supervisor.Mining_Recovery_Facts, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorMining_Recovery_Facts(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorMining_Recovery_Facts(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Mining_Recovery_Facts, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorMining_Recovery_Facts(reader: Reader): Mining_Threat_Retreat_Supervisor.Mining_Recovery_Facts = {
      val r = reader.readMining_Threat_Retreat_SupervisorMining_Recovery_Facts()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorMining_Recovery_Facts _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorMining_Recovery_Facts_Payload(o: Mining_Threat_Retreat_Supervisor.Mining_Recovery_Facts_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorMining_Recovery_Facts_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorMining_Recovery_Facts_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Mining_Recovery_Facts_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorMining_Recovery_Facts_Payload(reader: Reader): Mining_Threat_Retreat_Supervisor.Mining_Recovery_Facts_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisorMining_Recovery_Facts_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorMining_Recovery_Facts_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorDefense_Facts(o: Mining_Threat_Retreat_Supervisor.Defense_Facts, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorDefense_Facts(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorDefense_Facts(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Defense_Facts, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorDefense_Facts(reader: Reader): Mining_Threat_Retreat_Supervisor.Defense_Facts = {
      val r = reader.readMining_Threat_Retreat_SupervisorDefense_Facts()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorDefense_Facts _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorDefense_Facts_Payload(o: Mining_Threat_Retreat_Supervisor.Defense_Facts_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorDefense_Facts_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorDefense_Facts_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Defense_Facts_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorDefense_Facts_Payload(reader: Reader): Mining_Threat_Retreat_Supervisor.Defense_Facts_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisorDefense_Facts_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorDefense_Facts_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorMission_Facts(o: Mining_Threat_Retreat_Supervisor.Mission_Facts, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorMission_Facts(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorMission_Facts(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Mission_Facts, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorMission_Facts(reader: Reader): Mining_Threat_Retreat_Supervisor.Mission_Facts = {
      val r = reader.readMining_Threat_Retreat_SupervisorMission_Facts()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorMission_Facts _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorMission_Facts_Payload(o: Mining_Threat_Retreat_Supervisor.Mission_Facts_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorMission_Facts_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorMission_Facts_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Mission_Facts_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorMission_Facts_Payload(reader: Reader): Mining_Threat_Retreat_Supervisor.Mission_Facts_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisorMission_Facts_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorMission_Facts_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorArrival_Fact(o: Mining_Threat_Retreat_Supervisor.Arrival_Fact, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorArrival_Fact(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorArrival_Fact(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Arrival_Fact, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorArrival_Fact(reader: Reader): Mining_Threat_Retreat_Supervisor.Arrival_Fact = {
      val r = reader.readMining_Threat_Retreat_SupervisorArrival_Fact()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorArrival_Fact _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorArrival_Fact_Payload(o: Mining_Threat_Retreat_Supervisor.Arrival_Fact_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorArrival_Fact_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorArrival_Fact_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Arrival_Fact_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorArrival_Fact_Payload(reader: Reader): Mining_Threat_Retreat_Supervisor.Arrival_Fact_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisorArrival_Fact_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorArrival_Fact_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorPhase_Context(o: Mining_Threat_Retreat_Supervisor.Phase_Context, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorPhase_Context(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorPhase_Context(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Phase_Context, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorPhase_Context(reader: Reader): Mining_Threat_Retreat_Supervisor.Phase_Context = {
      val r = reader.readMining_Threat_Retreat_SupervisorPhase_Context()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorPhase_Context _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorPhase_Context_Payload(o: Mining_Threat_Retreat_Supervisor.Phase_Context_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorPhase_Context_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorPhase_Context_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Phase_Context_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorPhase_Context_Payload(reader: Reader): Mining_Threat_Retreat_Supervisor.Phase_Context_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisorPhase_Context_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorPhase_Context_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorFault_Fact(o: Mining_Threat_Retreat_Supervisor.Fault_Fact, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorFault_Fact(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorFault_Fact(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Fault_Fact, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorFault_Fact(reader: Reader): Mining_Threat_Retreat_Supervisor.Fault_Fact = {
      val r = reader.readMining_Threat_Retreat_SupervisorFault_Fact()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorFault_Fact _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorFault_Fact_Payload(o: Mining_Threat_Retreat_Supervisor.Fault_Fact_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorFault_Fact_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorFault_Fact_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Fault_Fact_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorFault_Fact_Payload(reader: Reader): Mining_Threat_Retreat_Supervisor.Fault_Fact_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisorFault_Fact_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorFault_Fact_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorRaw_Threat_Observation(o: Mining_Threat_Retreat_Supervisor.Raw_Threat_Observation, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorRaw_Threat_Observation(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorRaw_Threat_Observation(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Raw_Threat_Observation, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorRaw_Threat_Observation(reader: Reader): Mining_Threat_Retreat_Supervisor.Raw_Threat_Observation = {
      val r = reader.readMining_Threat_Retreat_SupervisorRaw_Threat_Observation()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorRaw_Threat_Observation _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorRaw_Threat_Observation_Payload(o: Mining_Threat_Retreat_Supervisor.Raw_Threat_Observation_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorRaw_Threat_Observation_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorRaw_Threat_Observation_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Raw_Threat_Observation_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorRaw_Threat_Observation_Payload(reader: Reader): Mining_Threat_Retreat_Supervisor.Raw_Threat_Observation_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisorRaw_Threat_Observation_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorRaw_Threat_Observation_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorThreat_State_Input(o: Mining_Threat_Retreat_Supervisor.Threat_State_Input, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorThreat_State_Input(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorThreat_State_Input(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Threat_State_Input, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorThreat_State_Input(reader: Reader): Mining_Threat_Retreat_Supervisor.Threat_State_Input = {
      val r = reader.readMining_Threat_Retreat_SupervisorThreat_State_Input()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorThreat_State_Input _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorThreat_State_Input_Payload(o: Mining_Threat_Retreat_Supervisor.Threat_State_Input_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorThreat_State_Input_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorThreat_State_Input_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Threat_State_Input_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorThreat_State_Input_Payload(reader: Reader): Mining_Threat_Retreat_Supervisor.Threat_State_Input_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisorThreat_State_Input_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorThreat_State_Input_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorQualified_Threat(o: Mining_Threat_Retreat_Supervisor.Qualified_Threat, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorQualified_Threat(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorQualified_Threat(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Qualified_Threat, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorQualified_Threat(reader: Reader): Mining_Threat_Retreat_Supervisor.Qualified_Threat = {
      val r = reader.readMining_Threat_Retreat_SupervisorQualified_Threat()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorQualified_Threat _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorQualified_Threat_Payload(o: Mining_Threat_Retreat_Supervisor.Qualified_Threat_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorQualified_Threat_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorQualified_Threat_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Qualified_Threat_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorQualified_Threat_Payload(reader: Reader): Mining_Threat_Retreat_Supervisor.Qualified_Threat_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisorQualified_Threat_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorQualified_Threat_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorThreat_Publication_Facts(o: Mining_Threat_Retreat_Supervisor.Threat_Publication_Facts, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorThreat_Publication_Facts(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorThreat_Publication_Facts(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Threat_Publication_Facts, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorThreat_Publication_Facts(reader: Reader): Mining_Threat_Retreat_Supervisor.Threat_Publication_Facts = {
      val r = reader.readMining_Threat_Retreat_SupervisorThreat_Publication_Facts()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorThreat_Publication_Facts _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorThreat_Publication_Facts_Payload(o: Mining_Threat_Retreat_Supervisor.Threat_Publication_Facts_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorThreat_Publication_Facts_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorThreat_Publication_Facts_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Threat_Publication_Facts_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorThreat_Publication_Facts_Payload(reader: Reader): Mining_Threat_Retreat_Supervisor.Threat_Publication_Facts_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisorThreat_Publication_Facts_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorThreat_Publication_Facts_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorRaw_Resource_Observation(o: Mining_Threat_Retreat_Supervisor.Raw_Resource_Observation, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorRaw_Resource_Observation(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorRaw_Resource_Observation(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Raw_Resource_Observation, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorRaw_Resource_Observation(reader: Reader): Mining_Threat_Retreat_Supervisor.Raw_Resource_Observation = {
      val r = reader.readMining_Threat_Retreat_SupervisorRaw_Resource_Observation()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorRaw_Resource_Observation _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorRaw_Resource_Observation_Payload(o: Mining_Threat_Retreat_Supervisor.Raw_Resource_Observation_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorRaw_Resource_Observation_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorRaw_Resource_Observation_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Raw_Resource_Observation_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorRaw_Resource_Observation_Payload(reader: Reader): Mining_Threat_Retreat_Supervisor.Raw_Resource_Observation_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisorRaw_Resource_Observation_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorRaw_Resource_Observation_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorResource_Publication_Facts(o: Mining_Threat_Retreat_Supervisor.Resource_Publication_Facts, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorResource_Publication_Facts(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorResource_Publication_Facts(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Resource_Publication_Facts, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorResource_Publication_Facts(reader: Reader): Mining_Threat_Retreat_Supervisor.Resource_Publication_Facts = {
      val r = reader.readMining_Threat_Retreat_SupervisorResource_Publication_Facts()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorResource_Publication_Facts _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorResource_Publication_Facts_Payload(o: Mining_Threat_Retreat_Supervisor.Resource_Publication_Facts_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorResource_Publication_Facts_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorResource_Publication_Facts_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Resource_Publication_Facts_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorResource_Publication_Facts_Payload(reader: Reader): Mining_Threat_Retreat_Supervisor.Resource_Publication_Facts_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisorResource_Publication_Facts_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorResource_Publication_Facts_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorRaw_Mission_Observation(o: Mining_Threat_Retreat_Supervisor.Raw_Mission_Observation, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorRaw_Mission_Observation(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorRaw_Mission_Observation(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Raw_Mission_Observation, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorRaw_Mission_Observation(reader: Reader): Mining_Threat_Retreat_Supervisor.Raw_Mission_Observation = {
      val r = reader.readMining_Threat_Retreat_SupervisorRaw_Mission_Observation()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorRaw_Mission_Observation _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorRaw_Mission_Observation_Payload(o: Mining_Threat_Retreat_Supervisor.Raw_Mission_Observation_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorRaw_Mission_Observation_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorRaw_Mission_Observation_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Raw_Mission_Observation_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorRaw_Mission_Observation_Payload(reader: Reader): Mining_Threat_Retreat_Supervisor.Raw_Mission_Observation_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisorRaw_Mission_Observation_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorRaw_Mission_Observation_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorMission_Proposal(o: Mining_Threat_Retreat_Supervisor.Mission_Proposal, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorMission_Proposal(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorMission_Proposal(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Mission_Proposal, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorMission_Proposal(reader: Reader): Mining_Threat_Retreat_Supervisor.Mission_Proposal = {
      val r = reader.readMining_Threat_Retreat_SupervisorMission_Proposal()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorMission_Proposal _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorMission_Proposal_Payload(o: Mining_Threat_Retreat_Supervisor.Mission_Proposal_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorMission_Proposal_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorMission_Proposal_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Mission_Proposal_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorMission_Proposal_Payload(reader: Reader): Mining_Threat_Retreat_Supervisor.Mission_Proposal_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisorMission_Proposal_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorMission_Proposal_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorResponse_Proposal(o: Mining_Threat_Retreat_Supervisor.Response_Proposal, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorResponse_Proposal(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorResponse_Proposal(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Response_Proposal, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorResponse_Proposal(reader: Reader): Mining_Threat_Retreat_Supervisor.Response_Proposal = {
      val r = reader.readMining_Threat_Retreat_SupervisorResponse_Proposal()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorResponse_Proposal _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorResponse_Proposal_Payload(o: Mining_Threat_Retreat_Supervisor.Response_Proposal_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorResponse_Proposal_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorResponse_Proposal_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Response_Proposal_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorResponse_Proposal_Payload(reader: Reader): Mining_Threat_Retreat_Supervisor.Response_Proposal_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisorResponse_Proposal_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorResponse_Proposal_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorPhase_State_Input(o: Mining_Threat_Retreat_Supervisor.Phase_State_Input, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorPhase_State_Input(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorPhase_State_Input(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Phase_State_Input, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorPhase_State_Input(reader: Reader): Mining_Threat_Retreat_Supervisor.Phase_State_Input = {
      val r = reader.readMining_Threat_Retreat_SupervisorPhase_State_Input()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorPhase_State_Input _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorPhase_State_Input_Payload(o: Mining_Threat_Retreat_Supervisor.Phase_State_Input_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorPhase_State_Input_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorPhase_State_Input_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Phase_State_Input_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorPhase_State_Input_Payload(reader: Reader): Mining_Threat_Retreat_Supervisor.Phase_State_Input_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisorPhase_State_Input_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorPhase_State_Input_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorAtomic_Supervisor_Result(o: Mining_Threat_Retreat_Supervisor.Atomic_Supervisor_Result, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorAtomic_Supervisor_Result(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorAtomic_Supervisor_Result(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Atomic_Supervisor_Result, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorAtomic_Supervisor_Result(reader: Reader): Mining_Threat_Retreat_Supervisor.Atomic_Supervisor_Result = {
      val r = reader.readMining_Threat_Retreat_SupervisorAtomic_Supervisor_Result()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorAtomic_Supervisor_Result _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorAtomic_Supervisor_Result_Payload(o: Mining_Threat_Retreat_Supervisor.Atomic_Supervisor_Result_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorAtomic_Supervisor_Result_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorAtomic_Supervisor_Result_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Atomic_Supervisor_Result_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorAtomic_Supervisor_Result_Payload(reader: Reader): Mining_Threat_Retreat_Supervisor.Atomic_Supervisor_Result_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisorAtomic_Supervisor_Result_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorAtomic_Supervisor_Result_Payload _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorPublished_Supervisor_Result(o: Mining_Threat_Retreat_Supervisor.Published_Supervisor_Result, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorPublished_Supervisor_Result(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorPublished_Supervisor_Result(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Published_Supervisor_Result, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorPublished_Supervisor_Result(reader: Reader): Mining_Threat_Retreat_Supervisor.Published_Supervisor_Result = {
      val r = reader.readMining_Threat_Retreat_SupervisorPublished_Supervisor_Result()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorPublished_Supervisor_Result _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorPublished_Supervisor_Result_Payload(o: Mining_Threat_Retreat_Supervisor.Published_Supervisor_Result_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorPublished_Supervisor_Result_Payload(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorPublished_Supervisor_Result_Payload(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Published_Supervisor_Result_Payload, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorPublished_Supervisor_Result_Payload(reader: Reader): Mining_Threat_Retreat_Supervisor.Published_Supervisor_Result_Payload = {
      val r = reader.readMining_Threat_Retreat_SupervisorPublished_Supervisor_Result_Payload()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorPublished_Supervisor_Result_Payload _)
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

  def fromMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container(o: Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container(reader: Reader): Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container = {
      val r = reader.readMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_P(o: Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_P(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_P(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_P(reader: Reader): Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container_P = {
      val r = reader.readMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_P()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_PS(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_PS(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_PS(reader: Reader): Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PreState_Container_PS = {
      val r = reader.readMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_PS()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PreState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container(o: Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container(reader: Reader): Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container = {
      val r = reader.readMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_P(o: Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_P(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_P(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_P(reader: Reader): Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container_P = {
      val r = reader.readMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_P()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_PS(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_PS(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_PS(reader: Reader): Mining_Threat_Retreat_Supervisor.Fault_Assessment_supervisor_fa_PostState_Container_PS = {
      val r = reader.readMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_PS()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorFault_Assessment_supervisor_fa_PostState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container(o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container(reader: Reader): Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container = {
      val r = reader.readMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_P(o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_P(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_P(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_P(reader: Reader): Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container_P = {
      val r = reader.readMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_P()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_PS(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_PS(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_PS(reader: Reader): Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PreState_Container_PS = {
      val r = reader.readMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_PS()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PreState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container(o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container(reader: Reader): Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container = {
      val r = reader.readMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_P(o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_P(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_P(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_P(reader: Reader): Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container_P = {
      val r = reader.readMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_P()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_PS(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_PS(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_PS(reader: Reader): Mining_Threat_Retreat_Supervisor.Threat_Qualification_supervisor_tq_PostState_Container_PS = {
      val r = reader.readMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_PS()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorThreat_Qualification_supervisor_tq_PostState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container(o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container(reader: Reader): Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container = {
      val r = reader.readMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_P(o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_P(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_P(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_P(reader: Reader): Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container_P = {
      val r = reader.readMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_P()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_PS(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_PS(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_PS(reader: Reader): Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PreState_Container_PS = {
      val r = reader.readMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_PS()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PreState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container(o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container(reader: Reader): Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container = {
      val r = reader.readMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_P(o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_P(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_P(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_P(reader: Reader): Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container_P = {
      val r = reader.readMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_P()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_PS(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_PS(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_PS(reader: Reader): Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_rq_PostState_Container_PS = {
      val r = reader.readMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_PS()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorResource_Qualification_supervisor_rq_PostState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container(o: Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container(reader: Reader): Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container = {
      val r = reader.readMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_P(o: Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_P(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_P(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_P(reader: Reader): Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container_P = {
      val r = reader.readMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_P()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_PS(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_PS(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_PS(reader: Reader): Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PreState_Container_PS = {
      val r = reader.readMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_PS()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PreState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container(o: Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container(reader: Reader): Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container = {
      val r = reader.readMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_P(o: Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_P(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_P(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_P(reader: Reader): Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container_P = {
      val r = reader.readMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_P()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_PS(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_PS(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_PS(reader: Reader): Mining_Threat_Retreat_Supervisor.Personnel_Mission_Qualification_supervisor_pq_PostState_Container_PS = {
      val r = reader.readMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_PS()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorPersonnel_Mission_Qualification_supervisor_pq_PostState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container(o: Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container(reader: Reader): Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container = {
      val r = reader.readMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_P(o: Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_P(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_P(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_P(reader: Reader): Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container_P = {
      val r = reader.readMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_P()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_PS(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_PS(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_PS(reader: Reader): Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PreState_Container_PS = {
      val r = reader.readMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_PS()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PreState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container(o: Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container(reader: Reader): Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container = {
      val r = reader.readMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_P(o: Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_P(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_P(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_P(reader: Reader): Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container_P = {
      val r = reader.readMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_P()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_PS(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_PS(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_PS(reader: Reader): Mining_Threat_Retreat_Supervisor.Mission_Recovery_Decision_supervisor_mr_PostState_Container_PS = {
      val r = reader.readMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_PS()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorMission_Recovery_Decision_supervisor_mr_PostState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container(o: Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container(reader: Reader): Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container = {
      val r = reader.readMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_P(o: Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_P(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_P(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_P(reader: Reader): Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container_P = {
      val r = reader.readMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_P()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_PS(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_PS(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_PS(reader: Reader): Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PreState_Container_PS = {
      val r = reader.readMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_PS()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PreState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container(o: Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container(reader: Reader): Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container = {
      val r = reader.readMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_P(o: Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_P(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_P(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_P(reader: Reader): Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container_P = {
      val r = reader.readMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_P()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_PS(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_PS(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_PS(reader: Reader): Mining_Threat_Retreat_Supervisor.Threat_Retreat_Decision_supervisor_tr_PostState_Container_PS = {
      val r = reader.readMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_PS()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorThreat_Retreat_Decision_supervisor_tr_PostState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container(o: Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container(reader: Reader): Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container = {
      val r = reader.readMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_P(o: Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_P(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_P(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_P(reader: Reader): Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container_P = {
      val r = reader.readMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_P()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_PS(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_PS(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_PS(reader: Reader): Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PreState_Container_PS = {
      val r = reader.readMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_PS()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PreState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container(o: Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container(reader: Reader): Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container = {
      val r = reader.readMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_P(o: Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_P(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_P(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_P(reader: Reader): Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container_P = {
      val r = reader.readMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_P()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_PS(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_PS(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_PS(reader: Reader): Mining_Threat_Retreat_Supervisor.Priority_Phase_Arbitration_supervisor_arb_PostState_Container_PS = {
      val r = reader.readMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_PS()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorPriority_Phase_Arbitration_supervisor_arb_PostState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container(o: Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container(reader: Reader): Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container = {
      val r = reader.readMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_P(o: Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_P(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_P(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_P(reader: Reader): Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container_P = {
      val r = reader.readMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_P()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_PS(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_PS(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_PS(reader: Reader): Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PreState_Container_PS = {
      val r = reader.readMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_PS()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PreState_Container_PS _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container(o: Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container(reader: Reader): Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container = {
      val r = reader.readMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_P(o: Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_P(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_P(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_P(reader: Reader): Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container_P = {
      val r = reader.readMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_P()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_P _)
    return r
  }

  def fromMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_PS(o: Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_PS(o)
    return w.result
  }

  def toMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_PS(data: ISZ[U8]): Either[Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_PS(reader: Reader): Mining_Threat_Retreat_Supervisor.Atomic_Publication_supervisor_ap_PostState_Container_PS = {
      val r = reader.readMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_PS()
      return r
    }
    val r = to(data, fMining_Threat_Retreat_SupervisorAtomic_Publication_supervisor_ap_PostState_Container_PS _)
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