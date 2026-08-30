package Mining_Threat_Retreat_Supervision {
  private import HAMR::*;

  // Integer encodings are closed finite pilot domains documented by the
  // adjacent exact TYPE/MON declarations. Every field inspected later by
  // GUMBO is deliberately an attribute member of its Data record.

  // @trace MON-01
  part def IntentValue :> Data {
    // @trace MON-01
    attribute intent_code : Base_Types::Integer_32;
    language "GUMBO" /*{ invariants
      // @trace MON-01
      inv INTENT_RANGE "Intent uses exactly codes zero through four": 0 [s32] <= intent_code & intent_code <= 4 [s32]; }*/
  }
  // @trace MON-02
  part def ThreatSampleValue :> Data {
    // @trace MON-02
    attribute sample_code : Base_Types::Integer_32;
    language "GUMBO" /*{ invariants
      // @trace MON-02
      inv THREAT_SAMPLE_RANGE "Threat sample uses exactly codes zero through three": 0 [s32] <= sample_code & sample_code <= 3 [s32]; }*/
  }
  // @trace MON-03
  part def CargoBandValue :> Data {
    // @trace MON-03
    attribute cargo_code : Base_Types::Integer_32;
    language "GUMBO" /*{ invariants
      // @trace MON-03
      inv CARGO_RANGE "Cargo band uses exactly codes zero through two": 0 [s32] <= cargo_code & cargo_code <= 2 [s32]; }*/
  }
  // @trace MON-03
  part def CapacitorBandValue :> Data {
    // @trace MON-03
    attribute capacitor_code : Base_Types::Integer_32;
    language "GUMBO" /*{ invariants
      // @trace MON-03
      inv CAPACITOR_RANGE "Capacitor band is LOW or READY": 0 [s32] <= capacitor_code & capacitor_code <= 1 [s32]; }*/
  }
  // @trace MON-03
  part def LocationValue :> Data {
    // @trace MON-03
    attribute location_code : Base_Types::Integer_32;
    language "GUMBO" /*{ invariants
      // @trace MON-03
      inv LOCATION_RANGE "Location is FIELD or DOCKED": 0 [s32] <= location_code & location_code <= 1 [s32]; }*/
  }
  // @trace MON-04
  part def MiningAvailabilityValue :> Data {
    // @trace MON-04
    attribute available : Base_Types::Boolean;
  }
  // @trace MON-04
  part def DefenseAvailabilityValue :> Data {
    // @trace MON-04
    attribute available : Base_Types::Boolean;
  }
  // @trace MON-04
  part def RetreatAvailabilityValue :> Data {
    // @trace MON-04
    attribute available : Base_Types::Boolean;
  }
  // @trace MON-04
  part def DestinationAvailabilityValue :> Data {
    // @trace MON-04
    attribute available : Base_Types::Boolean;
  }
  // @trace MON-04
  part def ServiceAvailabilityValue :> Data {
    // @trace MON-04
    attribute available : Base_Types::Boolean;
  }
  // @trace MON-05
  part def ActionOutcomeValue :> Data {
    // @trace MON-05
    attribute outcome_code : Base_Types::Integer_32;
    language "GUMBO" /*{ invariants
      // @trace MON-05
      inv OUTCOME_RANGE "Outcome uses exactly codes zero through six": 0 [s32] <= outcome_code & outcome_code <= 6 [s32]; }*/
  }

  // @trace TYPE-01
  part def ThreatDispositionValue :> Data {
    // @trace TYPE-01
    attribute disposition_code : Base_Types::Integer_32;
    language "GUMBO" /*{ invariants
      // @trace TYPE-01
      inv DISPOSITION_RANGE "Disposition uses exactly codes zero through three": 0 [s32] <= disposition_code & disposition_code <= 3 [s32]; }*/
  }
  // @trace TYPE-02
  part def ThreatValidityValue :> Data {
    // @trace TYPE-02
    attribute validity_code : Base_Types::Integer_32;
    language "GUMBO" /*{ invariants
      // @trace TYPE-02
      inv VALIDITY_RANGE "Threat validity is UNUSABLE or USABLE": 0 [s32] <= validity_code & validity_code <= 1 [s32]; }*/
  }
  // @trace TYPE-11
  part def ReadinessAssessmentValue :> Data {
    // @trace PART-07
    attribute mining_ready : Base_Types::Boolean;
    // @trace PART-07
    attribute defense_ready : Base_Types::Boolean;
    // @trace PART-07
    attribute retreat_feasible : Base_Types::Boolean;
    // @trace PART-07
    attribute cargo_full : Base_Types::Boolean;
    // @trace PART-07
    attribute dock_service_applicable : Base_Types::Boolean;
  }
  // @trace TYPE-03
  part def RecoveryStateValue :> Data {
    // @trace TYPE-03
    attribute state_code : Base_Types::Integer_32;
    language "GUMBO" /*{ invariants
      // @trace TYPE-03
      inv RECOVERY_RANGE "Recovery uses exactly codes zero through two": 0 [s32] <= state_code & state_code <= 2 [s32]; }*/
  }
  // @trace TYPE-04
  part def RecoveryGateValue :> Data {
    // @trace TYPE-04
    attribute gate_code : Base_Types::Integer_32;
    language "GUMBO" /*{ invariants
      // @trace TYPE-04
      inv GATE_RANGE "Recovery gate is OPEN or CLOSED": 0 [s32] <= gate_code & gate_code <= 1 [s32]; }*/
  }
  // @trace TYPE-05
  part def EmergencyStateValue :> Data {
    // @trace TYPE-05
    attribute emergency_code : Base_Types::Integer_32;
    language "GUMBO" /*{ invariants
      // @trace TYPE-05
      inv EMERGENCY_RANGE "Emergency state is INACTIVE or ACTIVE": 0 [s32] <= emergency_code & emergency_code <= 1 [s32]; }*/
  }
  // @trace TYPE-06
  part def ProposalValue :> Data {
    // @trace TYPE-06
    attribute proposal_code : Base_Types::Integer_32;
    language "GUMBO" /*{ invariants
      // @trace TYPE-06
      inv PROPOSAL_RANGE "Proposal is DENIED or PROPOSED": 0 [s32] <= proposal_code & proposal_code <= 1 [s32]; }*/
  }
  // @trace TYPE-07
  part def MobilityProposalValue :> Data {
    // @trace TYPE-07
    attribute proposal_code : Base_Types::Integer_32;
    language "GUMBO" /*{ invariants
      // @trace TYPE-07
      inv MOBILITY_RANGE "Mobility proposal is DENIED, RETREAT, or SERVICE": 0 [s32] <= proposal_code & proposal_code <= 2 [s32]; }*/
  }
  // @trace TYPE-08
  part def ActionValue :> Data {
    // @trace TYPE-08
    attribute action_code : Base_Types::Integer_32;
    language "GUMBO" /*{ invariants
      // @trace TYPE-08
      inv ACTION_RANGE "Action uses exactly codes zero through four": 0 [s32] <= action_code & action_code <= 4 [s32]; }*/
  }
  // @trace TYPE-09
  part def SelectedCauseValue :> Data {
    // @trace TYPE-09
    attribute cause_code : Base_Types::Integer_32;
    language "GUMBO" /*{ invariants
      // @trace TYPE-09
      inv CAUSE_RANGE "Selected cause uses exactly codes zero through five": 0 [s32] <= cause_code & cause_code <= 5 [s32]; }*/
  }
  // @trace CTRL-01 TYPE-10
  part def PublicResultValue :> Data {
    // @trace TYPE-08
    attribute selected_action : Base_Types::Integer_32;
    // @trace TYPE-09
    attribute selected_cause : Base_Types::Integer_32;
    attribute mode : Base_Types::Integer_32;
    // @trace TYPE-03
    attribute recovery_state : Base_Types::Integer_32;
    language "GUMBO" /*{ invariants
      // @trace CTRL-01
      inv PUBLIC_RESULT_RANGES "The atomic result fields remain within their approved finite domains":
        0 [s32] <= selected_action & selected_action <= 4 [s32] &
        0 [s32] <= selected_cause & selected_cause <= 5 [s32] &
        0 [s32] <= mode & mode <= 5 [s32] &
        0 [s32] <= recovery_state & recovery_state <= 2 [s32]; }*/
  }

  // @trace PART-01
  part def Threat_Observation :> Thread {
    // @trace INT-01
    port threat_sample : DataPort { out :>> type : ThreatSampleValue; }
  }

  // @trace PART-02
  part def Intent_Acquisition :> Thread {
    // @trace INT-02
    port intent_recovery : DataPort { out :>> type : IntentValue; }
    // @trace INT-03
    port intent_mining : DataPort { out :>> type : IntentValue; }
    // @trace INT-04
    port intent_defense : DataPort { out :>> type : IntentValue; }
    // @trace INT-05
    port intent_mobility : DataPort { out :>> type : IntentValue; }
  }

  // @trace PART-03
  part def Resource_Observation :> Thread {
    // @trace INT-06
    port cargo_band : DataPort { out :>> type : CargoBandValue; }
    // @trace INT-07
    port capacitor_band : DataPort { out :>> type : CapacitorBandValue; }
    // @trace INT-08
    port location : DataPort { out :>> type : LocationValue; }
  }

  // @trace PART-04
  part def Availability_Observation :> Thread {
    // @trace INT-09
    port mining_available : DataPort { out :>> type : MiningAvailabilityValue; }
    // @trace INT-10
    port defense_available : DataPort { out :>> type : DefenseAvailabilityValue; }
    // @trace INT-11
    port retreat_available : DataPort { out :>> type : RetreatAvailabilityValue; }
    // @trace INT-12
    port destination_available : DataPort { out :>> type : DestinationAvailabilityValue; }
    // @trace INT-13
    port service_available : DataPort { out :>> type : ServiceAvailabilityValue; }
  }

  // @trace PART-05
  part def Outcome_Observation :> Thread {
    // @trace INT-14
    port action_outcome : DataPort { out :>> type : ActionOutcomeValue; }
  }

  // @trace PART-06
  part def Threat_Qualification :> Thread {
    // @trace INT-01
    port threat_sample : DataPort { in :>> type : ThreatSampleValue; }
    // @trace INT-15
    port threat_validity : DataPort { out :>> type : ThreatValidityValue; }
    // @trace INT-16
    port disposition_mining : DataPort { out :>> type : ThreatDispositionValue; }
    // @trace INT-17
    port disposition_defense : DataPort { out :>> type : ThreatDispositionValue; }
    // @trace INT-18
    port disposition_mobility : DataPort { out :>> type : ThreatDispositionValue; }
    language "GUMBO" /*{
      compute
        // @trace PART-06
        guarantee QUALIFICATION_FANOUT "All eligibility owners consume the same derived disposition":
          disposition_defense == disposition_mining & disposition_mobility == disposition_mining;

      compute_cases
        // @trace CASE-01
        case CASE_01_INVALID "Invalid evidence derives unknown and unusable":
          assume threat_sample.sample_code == 0 [s32];
          guarantee disposition_mining.disposition_code == 0 [s32] &
            threat_validity.validity_code == 0 [s32];
        // @trace CASE-02
        case CASE_02_CLEAR "Clear evidence derives clear and usable":
          assume threat_sample.sample_code == 1 [s32];
          guarantee disposition_mining.disposition_code == 1 [s32] &
            threat_validity.validity_code == 1 [s32];
        // @trace CASE-03
        case CASE_03_SUSPECT "Suspect evidence derives suspect and usable":
          assume threat_sample.sample_code == 2 [s32];
          guarantee disposition_mining.disposition_code == 2 [s32] &
            threat_validity.validity_code == 1 [s32];
        // @trace CASE-04
        case CASE_04_HOSTILE "Hostile evidence derives hostile and usable":
          assume threat_sample.sample_code == 3 [s32];
          guarantee disposition_mining.disposition_code == 3 [s32] &
            threat_validity.validity_code == 1 [s32];
    }*/
  }

  // @trace PART-07
  part def Readiness_Assessment :> Thread {
    // @trace INT-06
    port cargo_band : DataPort { in :>> type : CargoBandValue; }
    // @trace INT-07
    port capacitor_band : DataPort { in :>> type : CapacitorBandValue; }
    // @trace INT-08
    port location : DataPort { in :>> type : LocationValue; }
    // @trace INT-09
    port mining_available : DataPort { in :>> type : MiningAvailabilityValue; }
    // @trace INT-10
    port defense_available : DataPort { in :>> type : DefenseAvailabilityValue; }
    // @trace INT-11
    port retreat_available : DataPort { in :>> type : RetreatAvailabilityValue; }
    // @trace INT-12
    port destination_available : DataPort { in :>> type : DestinationAvailabilityValue; }
    // @trace INT-13
    port service_available : DataPort { in :>> type : ServiceAvailabilityValue; }
    // @trace INT-19
    port assessment_mining : DataPort { out :>> type : ReadinessAssessmentValue; }
    // @trace INT-20
    port assessment_defense : DataPort { out :>> type : ReadinessAssessmentValue; }
    // @trace INT-21
    port assessment_mobility : DataPort { out :>> type : ReadinessAssessmentValue; }
    language "GUMBO" /*{
      compute
        // @trace PART-07
        guarantee READINESS_LOCAL_FACTS "The readiness owner derives five policy facts from its eight assigned raw inputs":
          assessment_mining.mining_ready ==
            (location.location_code == 0 [s32] & cargo_band.cargo_code != 2 [s32] &
             capacitor_band.capacitor_code == 1 [s32] & mining_available.available) &
          assessment_mining.defense_ready ==
            (location.location_code == 0 [s32] & capacitor_band.capacitor_code == 1 [s32] &
             defense_available.available) &
          assessment_mining.retreat_feasible ==
            (location.location_code == 0 [s32] & retreat_available.available & destination_available.available) &
          assessment_mining.cargo_full == (cargo_band.cargo_code == 2 [s32]) &
          assessment_mining.dock_service_applicable ==
            (location.location_code == 1 [s32] & service_available.available &
             (cargo_band.cargo_code != 0 [s32] | capacitor_band.capacitor_code == 0 [s32]));
        // @trace PART-07
        guarantee READINESS_FANOUT "All three policy owners consume the same derived assessment":
          assessment_defense == assessment_mining & assessment_mobility == assessment_mining;
    }*/
  }

  // @trace PART-08
  part def Recovery_Control :> Thread {
    // @trace INT-02
    port intent : DataPort { in :>> type : IntentValue; }
    // @trace INT-14
    port action_outcome : DataPort { in :>> type : ActionOutcomeValue; }
    // @trace INT-15
    port threat_validity : DataPort { in :>> type : ThreatValidityValue; }
    // @trace INT-22
    port gate_mining : DataPort { out :>> type : RecoveryGateValue; }
    // @trace INT-23
    port gate_defense : DataPort { out :>> type : RecoveryGateValue; }
    // @trace INT-24
    port gate_mobility : DataPort { out :>> type : RecoveryGateValue; }
    // @trace INT-25
    port emergency_state : DataPort { out :>> type : EmergencyStateValue; }
    // @trace INT-31
    port next_recovery_state : DataPort { out :>> type : RecoveryStateValue; }
    language "GUMBO" /*{
      state
        // @trace STATE-01
        recovery_memory : Base_Types::Integer_32;

      initialize
        // @trace CONSTR-01
        guarantee RECOVERY_INITIAL_HEALTHY "Recovery initializes healthy with an open gate and inactive emergency":
          recovery_memory == 0 [s32] & next_recovery_state.state_code == 0 [s32] &
          gate_mining.gate_code == 0 [s32] & gate_defense == gate_mining & gate_mobility == gate_mining &
          emergency_state.emergency_code == 0 [s32];

      compute
        // @trace PART-08
        guarantee RECOVERY_COMMITS_NEXT "Recovery control alone commits its derived actual next recovery":
          recovery_memory == next_recovery_state.state_code;
        // @trace BEH-02
        guarantee RECOVERY_DERIVES_INHIBITION "Actual next recovery derives all gates and emergency in the same evaluation":
          ((gate_mining.gate_code == 0 [s32]) == (next_recovery_state.state_code == 0 [s32])) &
          ((gate_mining.gate_code == 1 [s32]) == (next_recovery_state.state_code != 0 [s32])) &
          ((emergency_state.emergency_code == 0 [s32]) == (next_recovery_state.state_code == 0 [s32])) &
          ((emergency_state.emergency_code == 1 [s32]) == (next_recovery_state.state_code != 0 [s32]));
        // @trace PART-08
        guarantee RECOVERY_GATE_FANOUT "All eligibility owners consume the same owner-derived gate":
          gate_defense == gate_mining & gate_mobility == gate_mining;

      compute_cases
        // @trace CASE-05
        case CASE_05_TRIGGER "Unusable evidence or failure latches from every prior state":
          assume threat_validity.validity_code == 0 [s32] | action_outcome.outcome_code == 6 [s32];
          guarantee next_recovery_state.state_code == 1 [s32];
        // @trace CASE-06
        case CASE_06_HEALTHY "A nontriggering healthy state remains healthy":
          assume threat_validity.validity_code == 1 [s32] & action_outcome.outcome_code != 6 [s32] &
            recovery_memory == 0 [s32];
          guarantee next_recovery_state.state_code == 0 [s32];
        // @trace CASE-07
        case CASE_07_RESET "A nontriggering fresh reset moves latched recovery to recovering":
          assume threat_validity.validity_code == 1 [s32] & action_outcome.outcome_code != 6 [s32] &
            recovery_memory == 1 [s32] & intent.intent_code == 4 [s32];
          guarantee next_recovery_state.state_code == 2 [s32];
        // @trace CASE-08
        case CASE_08_HOLD_SUCCESS "Only later fresh successful hold evidence clears recovering":
          assume threat_validity.validity_code == 1 [s32] & action_outcome.outcome_code != 6 [s32] &
            recovery_memory == 2 [s32] & intent.intent_code == 0 [s32] &
            action_outcome.outcome_code == 1 [s32];
          guarantee next_recovery_state.state_code == 0 [s32];
        // @trace CASE-09
        case CASE_09_PRESERVE "Other nontriggering latched or recovering evaluations preserve recovery":
          assume threat_validity.validity_code == 1 [s32] & action_outcome.outcome_code != 6 [s32] &
            ((recovery_memory == 1 [s32] & intent.intent_code != 4 [s32]) |
             (recovery_memory == 2 [s32] &
              not (intent.intent_code == 0 [s32] & action_outcome.outcome_code == 1 [s32])));
          guarantee next_recovery_state.state_code == recovery_memory;
    }*/
  }

  // @trace PART-09
  part def Mining_Eligibility :> Thread {
    // @trace INT-03
    port intent : DataPort { in :>> type : IntentValue; }
    // @trace INT-16
    port threat_disposition : DataPort { in :>> type : ThreatDispositionValue; }
    // @trace INT-19
    port assessment : DataPort { in :>> type : ReadinessAssessmentValue; }
    // @trace INT-22
    port recovery_gate : DataPort { in :>> type : RecoveryGateValue; }
    // @trace INT-26
    port mining_proposal : DataPort { out :>> type : ProposalValue; }
    language "GUMBO" /*{
      compute
      compute_cases
        // @trace CASE-10
        case CASE_10_MINING_PROPOSED "Open clear requested mining with local readiness is proposed":
          assume recovery_gate.gate_code == 0 [s32] & intent.intent_code == 1 [s32] &
            threat_disposition.disposition_code == 1 [s32] & assessment.mining_ready;
          guarantee mining_proposal.proposal_code == 1 [s32];
        // @trace CASE-11
        case CASE_11_MINING_DENIED "Every other mining input partition is denied":
          assume not (recovery_gate.gate_code == 0 [s32] & intent.intent_code == 1 [s32] &
            threat_disposition.disposition_code == 1 [s32] & assessment.mining_ready);
          guarantee mining_proposal.proposal_code == 0 [s32];
    }*/
  }

  // @trace PART-10
  part def Defense_Eligibility :> Thread {
    // @trace INT-04
    port intent : DataPort { in :>> type : IntentValue; }
    // @trace INT-17
    port threat_disposition : DataPort { in :>> type : ThreatDispositionValue; }
    // @trace INT-20
    port assessment : DataPort { in :>> type : ReadinessAssessmentValue; }
    // @trace INT-23
    port recovery_gate : DataPort { in :>> type : RecoveryGateValue; }
    // @trace INT-27
    port defense_proposal : DataPort { out :>> type : ProposalValue; }
    language "GUMBO" /*{
      compute
      compute_cases
        // @trace CASE-12
        case CASE_12_DEFENSE_PROPOSED "Open locally ready threat-driven or clear requested defense is proposed":
          assume recovery_gate.gate_code == 0 [s32] & assessment.defense_ready &
            (threat_disposition.disposition_code == 2 [s32] |
             threat_disposition.disposition_code == 3 [s32] |
             (threat_disposition.disposition_code == 1 [s32] & intent.intent_code == 2 [s32]));
          guarantee defense_proposal.proposal_code == 1 [s32];
        // @trace CASE-13
        case CASE_13_DEFENSE_DENIED "Every other defense input partition is denied":
          assume not (recovery_gate.gate_code == 0 [s32] & assessment.defense_ready &
            (threat_disposition.disposition_code == 2 [s32] |
             threat_disposition.disposition_code == 3 [s32] |
             (threat_disposition.disposition_code == 1 [s32] & intent.intent_code == 2 [s32])));
          guarantee defense_proposal.proposal_code == 0 [s32];
    }*/
  }

  // @trace PART-11
  part def Mobility_Service_Eligibility :> Thread {
    // @trace INT-05
    port intent : DataPort { in :>> type : IntentValue; }
    // @trace INT-18
    port threat_disposition : DataPort { in :>> type : ThreatDispositionValue; }
    // @trace INT-21
    port assessment : DataPort { in :>> type : ReadinessAssessmentValue; }
    // @trace INT-24
    port recovery_gate : DataPort { in :>> type : RecoveryGateValue; }
    // @trace INT-28
    port mobility_proposal : DataPort { out :>> type : MobilityProposalValue; }
    language "GUMBO" /*{
      compute
      compute_cases
        // @trace CASE-14
        case CASE_14_RETREAT "Feasible retreat is proposed first for hostility, full cargo, or retreat intent":
          assume recovery_gate.gate_code == 0 [s32] & assessment.retreat_feasible &
            (threat_disposition.disposition_code == 3 [s32] | assessment.cargo_full |
             intent.intent_code == 3 [s32]);
          guarantee mobility_proposal.proposal_code == 1 [s32];
        // @trace CASE-15
        case CASE_15_SERVICE "Absent retreat, an open locally applicable dock service is proposed":
          assume not (recovery_gate.gate_code == 0 [s32] & assessment.retreat_feasible &
            (threat_disposition.disposition_code == 3 [s32] | assessment.cargo_full |
             intent.intent_code == 3 [s32])) & recovery_gate.gate_code == 0 [s32] &
            assessment.dock_service_applicable;
          guarantee mobility_proposal.proposal_code == 2 [s32];
        // @trace CASE-16
        case CASE_16_MOBILITY_DENIED "Every remaining mobility and service partition is denied":
          assume not (recovery_gate.gate_code == 0 [s32] & assessment.retreat_feasible &
            (threat_disposition.disposition_code == 3 [s32] | assessment.cargo_full |
             intent.intent_code == 3 [s32])) &
            not (recovery_gate.gate_code == 0 [s32] & assessment.dock_service_applicable);
          guarantee mobility_proposal.proposal_code == 0 [s32];
    }*/
  }

  // @trace PART-12
  part def Priority_Arbitration :> Thread {
    // @trace INT-25
    port emergency_state : DataPort { in :>> type : EmergencyStateValue; }
    // @trace INT-26
    port mining_proposal : DataPort { in :>> type : ProposalValue; }
    // @trace INT-27
    port defense_proposal : DataPort { in :>> type : ProposalValue; }
    // @trace INT-28
    port mobility_proposal : DataPort { in :>> type : MobilityProposalValue; }
    // @trace INT-29
    port selected_action : DataPort { out :>> type : ActionValue; }
    // @trace INT-30
    port selected_cause : DataPort { out :>> type : SelectedCauseValue; }
    language "GUMBO" /*{
      compute
      compute_cases
        // @trace CASE-17
        case CASE_17_EMERGENCY "Emergency dominates every proposal":
          assume emergency_state.emergency_code == 1 [s32];
          guarantee selected_action.action_code == 0 [s32] & selected_cause.cause_code == 0 [s32];
        // @trace CASE-18
        case CASE_18_RETREAT_PRIORITY "Retreat is first after emergency":
          assume emergency_state.emergency_code == 0 [s32] & mobility_proposal.proposal_code == 1 [s32];
          guarantee selected_action.action_code == 3 [s32] & selected_cause.cause_code == 1 [s32];
        // @trace CASE-19
        case CASE_19_DEFENSE_PRIORITY "Defense follows absent retreat":
          assume emergency_state.emergency_code == 0 [s32] & mobility_proposal.proposal_code != 1 [s32] &
            defense_proposal.proposal_code == 1 [s32];
          guarantee selected_action.action_code == 2 [s32] & selected_cause.cause_code == 2 [s32];
        // @trace CASE-20
        case CASE_20_SERVICE_PRIORITY "Service follows absent retreat and defense":
          assume emergency_state.emergency_code == 0 [s32] & mobility_proposal.proposal_code == 2 [s32] &
            defense_proposal.proposal_code != 1 [s32];
          guarantee selected_action.action_code == 4 [s32] & selected_cause.cause_code == 3 [s32];
        // @trace CASE-21
        case CASE_21_MINING_PRIORITY "Mining follows absent retreat, defense, and service":
          assume emergency_state.emergency_code == 0 [s32] & mobility_proposal.proposal_code == 0 [s32] &
            defense_proposal.proposal_code != 1 [s32] & mining_proposal.proposal_code == 1 [s32];
          guarantee selected_action.action_code == 1 [s32] & selected_cause.cause_code == 4 [s32];
        // @trace CASE-22
        case CASE_22_HOLD "Hold is selected only when no higher branch applies":
          assume emergency_state.emergency_code == 0 [s32] & mobility_proposal.proposal_code == 0 [s32] &
            defense_proposal.proposal_code != 1 [s32] & mining_proposal.proposal_code != 1 [s32];
          guarantee selected_action.action_code == 0 [s32] & selected_cause.cause_code == 5 [s32];
    }*/
  }

  // @trace PART-14
  part def Mission_Mode_And_Public_Result :> Thread {
    // @trace INT-29
    port selected_action : DataPort { in :>> type : ActionValue; }
    // @trace INT-30
    port selected_cause : DataPort { in :>> type : SelectedCauseValue; }
    // @trace INT-31
    port next_recovery_state : DataPort { in :>> type : RecoveryStateValue; }
    // @trace CTRL-01
    port public_result : DataPort { out :>> type : PublicResultValue; }
    language "GUMBO" /*{
      initialize
        // @trace CONSTR-01
        guarantee PUBLIC_INITIAL_HEALTHY_HOLD "The sole public tuple initializes to healthy policy hold":
          public_result.selected_action == 0 [s32] & public_result.selected_cause == 5 [s32] &
          public_result.mode == 0 [s32] & public_result.recovery_state == 0 [s32];

      compute
        // @trace BEH-08
        guarantee PUBLIC_ATOMIC_COMPOSITION "Publication preserves upstream action, cause, and actual next recovery without recomputation":
          public_result.selected_action == selected_action.action_code &
          public_result.selected_cause == selected_cause.cause_code &
          public_result.recovery_state == next_recovery_state.state_code;

      compute_cases
        // @trace CASE-23
        case CASE_23_FAULT_MODE "Nonhealthy actual next recovery dominates action mapping":
          assume next_recovery_state.state_code != 0 [s32];
          guarantee public_result.mode == 5 [s32];
        // @trace CASE-24
        case CASE_24_HOLD_MODE "Healthy hold derives hold mode":
          assume next_recovery_state.state_code == 0 [s32] & selected_action.action_code == 0 [s32];
          guarantee public_result.mode == 0 [s32];
        // @trace CASE-25
        case CASE_25_MINING_MODE "Healthy mining derives mining mode":
          assume next_recovery_state.state_code == 0 [s32] & selected_action.action_code == 1 [s32];
          guarantee public_result.mode == 1 [s32];
        // @trace CASE-26
        case CASE_26_DEFENDING_MODE "Healthy defense derives defending mode":
          assume next_recovery_state.state_code == 0 [s32] & selected_action.action_code == 2 [s32];
          guarantee public_result.mode == 2 [s32];
        // @trace CASE-27
        case CASE_27_RETREATING_MODE "Healthy retreat derives retreating mode":
          assume next_recovery_state.state_code == 0 [s32] & selected_action.action_code == 3 [s32];
          guarantee public_result.mode == 3 [s32];
        // @trace CASE-28
        case CASE_28_SERVICING_MODE "Healthy service derives servicing mode":
          assume next_recovery_state.state_code == 0 [s32] & selected_action.action_code == 4 [s32];
          guarantee public_result.mode == 4 [s32];
    }*/
  }

  // @trace SUPPORT-01
  // @generated-support
  part def Supervisor_Process :> Process {
    // @trace CTRL-01
    // @generated-support
    port public_result : DataPort { out :>> type : PublicResultValue; }

    // @trace PART-01
    part threat_observation : Threat_Observation;
    // @trace PART-02
    part intent_acquisition : Intent_Acquisition;
    // @trace PART-03
    part resource_observation : Resource_Observation;
    // @trace PART-04
    part availability_observation : Availability_Observation;
    // @trace PART-05
    part outcome_observation : Outcome_Observation;
    // @trace PART-06
    part threat_qualification : Threat_Qualification;
    // @trace PART-07
    part readiness_assessment : Readiness_Assessment;
    // @trace PART-08
    part recovery_control : Recovery_Control;
    // @trace PART-09
    part mining_eligibility : Mining_Eligibility;
    // @trace PART-10
    part defense_eligibility : Defense_Eligibility;
    // @trace PART-11
    part mobility_service_eligibility : Mobility_Service_Eligibility;
    // @trace PART-12
    part priority_arbitration : Priority_Arbitration;
    // @trace PART-14
    part mission_mode_and_public_result : Mission_Mode_And_Public_Result;

    // @trace INT-01
    connection int_01 : PortConnection connect threat_observation.threat_sample to threat_qualification.threat_sample;
    // @trace INT-02
    connection int_02 : PortConnection connect intent_acquisition.intent_recovery to recovery_control.intent;
    // @trace INT-03
    connection int_03 : PortConnection connect intent_acquisition.intent_mining to mining_eligibility.intent;
    // @trace INT-04
    connection int_04 : PortConnection connect intent_acquisition.intent_defense to defense_eligibility.intent;
    // @trace INT-05
    connection int_05 : PortConnection connect intent_acquisition.intent_mobility to mobility_service_eligibility.intent;
    // @trace INT-06
    connection int_06 : PortConnection connect resource_observation.cargo_band to readiness_assessment.cargo_band;
    // @trace INT-07
    connection int_07 : PortConnection connect resource_observation.capacitor_band to readiness_assessment.capacitor_band;
    // @trace INT-08
    connection int_08 : PortConnection connect resource_observation.location to readiness_assessment.location;
    // @trace INT-09
    connection int_09 : PortConnection connect availability_observation.mining_available to readiness_assessment.mining_available;
    // @trace INT-10
    connection int_10 : PortConnection connect availability_observation.defense_available to readiness_assessment.defense_available;
    // @trace INT-11
    connection int_11 : PortConnection connect availability_observation.retreat_available to readiness_assessment.retreat_available;
    // @trace INT-12
    connection int_12 : PortConnection connect availability_observation.destination_available to readiness_assessment.destination_available;
    // @trace INT-13
    connection int_13 : PortConnection connect availability_observation.service_available to readiness_assessment.service_available;
    // @trace INT-14
    connection int_14 : PortConnection connect outcome_observation.action_outcome to recovery_control.action_outcome;
    // @trace INT-15
    connection int_15 : PortConnection connect threat_qualification.threat_validity to recovery_control.threat_validity;
    // @trace INT-16
    connection int_16 : PortConnection connect threat_qualification.disposition_mining to mining_eligibility.threat_disposition;
    // @trace INT-17
    connection int_17 : PortConnection connect threat_qualification.disposition_defense to defense_eligibility.threat_disposition;
    // @trace INT-18
    connection int_18 : PortConnection connect threat_qualification.disposition_mobility to mobility_service_eligibility.threat_disposition;
    // @trace INT-19
    connection int_19 : PortConnection connect readiness_assessment.assessment_mining to mining_eligibility.assessment;
    // @trace INT-20
    connection int_20 : PortConnection connect readiness_assessment.assessment_defense to defense_eligibility.assessment;
    // @trace INT-21
    connection int_21 : PortConnection connect readiness_assessment.assessment_mobility to mobility_service_eligibility.assessment;
    // @trace INT-22
    connection int_22 : PortConnection connect recovery_control.gate_mining to mining_eligibility.recovery_gate;
    // @trace INT-23
    connection int_23 : PortConnection connect recovery_control.gate_defense to defense_eligibility.recovery_gate;
    // @trace INT-24
    connection int_24 : PortConnection connect recovery_control.gate_mobility to mobility_service_eligibility.recovery_gate;
    // @trace INT-25
    connection int_25 : PortConnection connect recovery_control.emergency_state to priority_arbitration.emergency_state;
    // @trace INT-26
    connection int_26 : PortConnection connect mining_eligibility.mining_proposal to priority_arbitration.mining_proposal;
    // @trace INT-27
    connection int_27 : PortConnection connect defense_eligibility.defense_proposal to priority_arbitration.defense_proposal;
    // @trace INT-28
    connection int_28 : PortConnection connect mobility_service_eligibility.mobility_proposal to priority_arbitration.mobility_proposal;
    // @trace INT-29
    connection int_29 : PortConnection connect priority_arbitration.selected_action to mission_mode_and_public_result.selected_action;
    // @trace INT-30
    connection int_30 : PortConnection connect priority_arbitration.selected_cause to mission_mode_and_public_result.selected_cause;
    // @trace INT-31
    connection int_31 : PortConnection connect recovery_control.next_recovery_state to mission_mode_and_public_result.next_recovery_state;

    // @trace SUPPORT-01
    // @generated-support
    connection support_public_result : PortConnection connect mission_mode_and_public_result.public_result to public_result;
  }

  // @trace SCOPE-01
  part def Mining_Threat_Retreat_Supervision_Root :> System {
    // @trace CTRL-01
    port public_result : DataPort { out :>> type : PublicResultValue; }
    // @trace SUPPORT-01
    // @generated-support
    part supervisor_process : Supervisor_Process;
    // @trace SUPPORT-01
    // @generated-support
    connection boundary_public_result : PortConnection connect supervisor_process.public_result to public_result;
  }

  // @trace SCOPE-01
  part mining_threat_retreat_supervision : Mining_Threat_Retreat_Supervision_Root;
}
