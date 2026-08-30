package Mining_Threat_Retreat_Supervision {
  private import HAMR::*;

  // Integer encodings are closed finite pilot domains documented by the
  // adjacent exact TYPE/MON declarations. Every field inspected later by
  // GUMBO is deliberately an attribute member of its Data record.

  part def IntentValue :> Data {
    attribute intent_code : Base_Types::Integer_32;
                                   
                      
                                                                                                                          
  }
  part def ThreatSampleValue :> Data {
    attribute sample_code : Base_Types::Integer_32;
                                   
                      
                                                                                                                                         
  }
  part def CargoBandValue :> Data {
    attribute cargo_code : Base_Types::Integer_32;
                                   
                      
                                                                                                                          
  }
  part def CapacitorBandValue :> Data {
    attribute capacitor_code : Base_Types::Integer_32;
                                   
                      
                                                                                                                      
  }
  part def LocationValue :> Data {
    attribute location_code : Base_Types::Integer_32;
                                   
                      
                                                                                                                
  }
  part def MiningAvailabilityValue :> Data {
    attribute available : Base_Types::Boolean;
  }
  part def DefenseAvailabilityValue :> Data {
    attribute available : Base_Types::Boolean;
  }
  part def RetreatAvailabilityValue :> Data {
    attribute available : Base_Types::Boolean;
  }
  part def DestinationAvailabilityValue :> Data {
    attribute available : Base_Types::Boolean;
  }
  part def ServiceAvailabilityValue :> Data {
    attribute available : Base_Types::Boolean;
  }
  part def ActionOutcomeValue :> Data {
    attribute outcome_code : Base_Types::Integer_32;
                                   
                      
                                                                                                                             
  }

  part def ThreatDispositionValue :> Data {
    attribute disposition_code : Base_Types::Integer_32;
                                   
                       
                                                                                                                                               
  }
  part def ThreatValidityValue :> Data {
    attribute validity_code : Base_Types::Integer_32;
                                   
                       
                                                                                                                          
  }
  part def ReadinessAssessmentValue :> Data {
    attribute mining_ready : Base_Types::Boolean;
    attribute defense_ready : Base_Types::Boolean;
    attribute retreat_feasible : Base_Types::Boolean;
    attribute cargo_full : Base_Types::Boolean;
    attribute dock_service_applicable : Base_Types::Boolean;
  }
  part def RecoveryStateValue :> Data {
    attribute state_code : Base_Types::Integer_32;
                                   
                       
                                                                                                                           
  }
  part def RecoveryGateValue :> Data {
    attribute gate_code : Base_Types::Integer_32;
                                   
                       
                                                                                                        
  }
  part def EmergencyStateValue :> Data {
    attribute emergency_code : Base_Types::Integer_32;
                                   
                       
                                                                                                                             
  }
  part def ProposalValue :> Data {
    attribute proposal_code : Base_Types::Integer_32;
                                   
                       
                                                                                                                   
  }
  part def MobilityProposalValue :> Data {
    attribute proposal_code : Base_Types::Integer_32;
                                   
                       
                                                                                                                                     
  }
  part def ActionValue :> Data {
    attribute action_code : Base_Types::Integer_32;
                                   
                       
                                                                                                                          
  }
  part def SelectedCauseValue :> Data {
    attribute cause_code : Base_Types::Integer_32;
                                   
                       
                                                                                                                               
  }
  part def PublicResultValue :> Data {
    attribute selected_action : Base_Types::Integer_32;
    attribute selected_cause : Base_Types::Integer_32;
    attribute mode : Base_Types::Integer_32;
    attribute recovery_state : Base_Types::Integer_32;
                                   
                       
                                                                                                      
                                                                 
                                                               
                                           
                                                                  
  }

  part def Threat_Observation :> Thread {
    port threat_sample : DataPort { out :>> type : ThreatSampleValue; }
  }

  part def Intent_Acquisition :> Thread {
    port intent_recovery : DataPort { out :>> type : IntentValue; }
    port intent_mining : DataPort { out :>> type : IntentValue; }
    port intent_defense : DataPort { out :>> type : IntentValue; }
    port intent_mobility : DataPort { out :>> type : IntentValue; }
  }

  part def Resource_Observation :> Thread {
    port cargo_band : DataPort { out :>> type : CargoBandValue; }
    port capacitor_band : DataPort { out :>> type : CapacitorBandValue; }
    port location : DataPort { out :>> type : LocationValue; }
  }

  part def Availability_Observation :> Thread {
    port mining_available : DataPort { out :>> type : MiningAvailabilityValue; }
    port defense_available : DataPort { out :>> type : DefenseAvailabilityValue; }
    port retreat_available : DataPort { out :>> type : RetreatAvailabilityValue; }
    port destination_available : DataPort { out :>> type : DestinationAvailabilityValue; }
    port service_available : DataPort { out :>> type : ServiceAvailabilityValue; }
  }

  part def Outcome_Observation :> Thread {
    port action_outcome : DataPort { out :>> type : ActionOutcomeValue; }
  }

  part def Threat_Qualification :> Thread {
    port threat_sample : DataPort { in :>> type : ThreatSampleValue; }
    port threat_validity : DataPort { out :>> type : ThreatValidityValue; }
    port disposition_mining : DataPort { out :>> type : ThreatDispositionValue; }
    port disposition_defense : DataPort { out :>> type : ThreatDispositionValue; }
    port disposition_mobility : DataPort { out :>> type : ThreatDispositionValue; }
    language "GUMBO" /*{
      compute
        compute_cases
        case invalid:
          assume threat_sample.sample_code == 0;
          guarantee
            threat_validity.validity_code == 0 &
            disposition_mining.disposition_code == 0 &
            disposition_defense.disposition_code == 0 &
            disposition_mobility.disposition_code == 0;
        case clear:
          assume threat_sample.sample_code == 1;
          guarantee
            threat_validity.validity_code == 1 &
            disposition_mining.disposition_code == 1 &
            disposition_defense.disposition_code == 1 &
            disposition_mobility.disposition_code == 1;
        case suspect:
          assume threat_sample.sample_code == 2;
          guarantee
            threat_validity.validity_code == 1 &
            disposition_mining.disposition_code == 2 &
            disposition_defense.disposition_code == 2 &
            disposition_mobility.disposition_code == 2;
        case hostile:
          assume threat_sample.sample_code == 3;
          guarantee
            threat_validity.validity_code == 1 &
            disposition_mining.disposition_code == 3 &
            disposition_defense.disposition_code == 3 &
            disposition_mobility.disposition_code == 3;
    }*/
  }

  part def Readiness_Assessment :> Thread {
    port cargo_band : DataPort { in :>> type : CargoBandValue; }
    port capacitor_band : DataPort { in :>> type : CapacitorBandValue; }
    port location : DataPort { in :>> type : LocationValue; }
    port mining_available : DataPort { in :>> type : MiningAvailabilityValue; }
    port defense_available : DataPort { in :>> type : DefenseAvailabilityValue; }
    port retreat_available : DataPort { in :>> type : RetreatAvailabilityValue; }
    port destination_available : DataPort { in :>> type : DestinationAvailabilityValue; }
    port service_available : DataPort { in :>> type : ServiceAvailabilityValue; }
    port assessment_mining : DataPort { out :>> type : ReadinessAssessmentValue; }
    port assessment_defense : DataPort { out :>> type : ReadinessAssessmentValue; }
    port assessment_mobility : DataPort { out :>> type : ReadinessAssessmentValue; }
    language "GUMBO" /*{
      compute
        guarantee local_facts:
          assessment_mining.mining_ready ==
            (location.location_code == 0 &
             cargo_band.cargo_code != 2 &
             capacitor_band.capacitor_code == 1 &
             mining_available.available) &
          assessment_mining.defense_ready ==
            (location.location_code == 0 &
             capacitor_band.capacitor_code == 1 &
             defense_available.available) &
          assessment_mining.retreat_feasible ==
            (location.location_code == 0 &
             retreat_available.available &
             destination_available.available) &
          assessment_mining.cargo_full == (cargo_band.cargo_code == 2) &
          assessment_mining.dock_service_applicable ==
            (location.location_code == 1 &
             service_available.available &
             (cargo_band.cargo_code != 0 | capacitor_band.capacitor_code == 0));
        guarantee fanout:
          assessment_defense == assessment_mining &
          assessment_mobility == assessment_mining;
    }*/
  }

  part def Recovery_Control :> Thread {
    port intent : DataPort { in :>> type : IntentValue; }
    port action_outcome : DataPort { in :>> type : ActionOutcomeValue; }
    port threat_validity : DataPort { in :>> type : ThreatValidityValue; }
    port gate_mining : DataPort { out :>> type : RecoveryGateValue; }
    port gate_defense : DataPort { out :>> type : RecoveryGateValue; }
    port gate_mobility : DataPort { out :>> type : RecoveryGateValue; }
    port emergency_state : DataPort { out :>> type : EmergencyStateValue; }
    port next_recovery_state : DataPort { out :>> type : RecoveryStateValue; }
    language "GUMBO" /*{
      state
        recovery_memory: Base_Types::Integer_32;
      initialize
        guarantee healthy_initial:
          recovery_memory == 0 &
          next_recovery_state.state_code == 0 &
          gate_mining.gate_code == 0 &
          gate_defense == gate_mining &
          gate_mobility == gate_mining &
          emergency_state.emergency_code == 0;
      compute
        modifies recovery_memory;
        guarantee commits_next:
          recovery_memory == next_recovery_state.state_code;
        guarantee derives_inhibition:
          ((gate_mining.gate_code == 0) == (next_recovery_state.state_code == 0)) &
          ((gate_mining.gate_code == 1) == (next_recovery_state.state_code != 0)) &
          ((emergency_state.emergency_code == 0) == (next_recovery_state.state_code == 0)) &
          ((emergency_state.emergency_code == 1) == (next_recovery_state.state_code != 0));
        guarantee gate_fanout:
          gate_defense == gate_mining & gate_mobility == gate_mining;
        compute_cases
        case trigger:
          assume threat_validity.validity_code == 0 | action_outcome.outcome_code == 6;
          guarantee next_recovery_state.state_code == 1;
        case healthy:
          assume threat_validity.validity_code == 1 &
                 action_outcome.outcome_code != 6 &
                 recovery_memory == 0;
          guarantee next_recovery_state.state_code == 0;
        case reset:
          assume threat_validity.validity_code == 1 &
                 action_outcome.outcome_code != 6 &
                 recovery_memory == 1 &
                 intent.intent_code == 4;
          guarantee next_recovery_state.state_code == 2;
        case hold_success:
          assume threat_validity.validity_code == 1 &
                 action_outcome.outcome_code != 6 &
                 recovery_memory == 2 &
                 intent.intent_code == 0 &
                 action_outcome.outcome_code == 1;
          guarantee next_recovery_state.state_code == 0;
        case preserve:
          assume threat_validity.validity_code == 1 &
                 action_outcome.outcome_code != 6 &
                 ((recovery_memory == 1 & intent.intent_code != 4) |
                  (recovery_memory == 2 &
                   ~(intent.intent_code == 0 & action_outcome.outcome_code == 1)));
          guarantee next_recovery_state.state_code == recovery_memory;
    }*/
  }

  part def Mining_Eligibility :> Thread {
    port intent : DataPort { in :>> type : IntentValue; }
    port threat_disposition : DataPort { in :>> type : ThreatDispositionValue; }
    port assessment : DataPort { in :>> type : ReadinessAssessmentValue; }
    port recovery_gate : DataPort { in :>> type : RecoveryGateValue; }
    port mining_proposal : DataPort { out :>> type : ProposalValue; }
    language "GUMBO" /*{
      compute
        compute_cases
        case proposed:
          assume recovery_gate.gate_code == 0 &
                 intent.intent_code == 1 &
                 threat_disposition.disposition_code == 1 &
                 assessment.mining_ready;
          guarantee mining_proposal.proposal_code == 1;
        case denied:
          assume ~(recovery_gate.gate_code == 0 &
                   intent.intent_code == 1 &
                   threat_disposition.disposition_code == 1 &
                   assessment.mining_ready);
          guarantee mining_proposal.proposal_code == 0;
    }*/
  }

  part def Defense_Eligibility :> Thread {
    port intent : DataPort { in :>> type : IntentValue; }
    port threat_disposition : DataPort { in :>> type : ThreatDispositionValue; }
    port assessment : DataPort { in :>> type : ReadinessAssessmentValue; }
    port recovery_gate : DataPort { in :>> type : RecoveryGateValue; }
    port defense_proposal : DataPort { out :>> type : ProposalValue; }
    language "GUMBO" /*{
      compute
        compute_cases
        case proposed:
          assume recovery_gate.gate_code == 0 &
                 assessment.defense_ready &
                 (threat_disposition.disposition_code == 2 |
                  threat_disposition.disposition_code == 3 |
                  (threat_disposition.disposition_code == 1 &
                   intent.intent_code == 2));
          guarantee defense_proposal.proposal_code == 1;
        case denied:
          assume ~(recovery_gate.gate_code == 0 &
                   assessment.defense_ready &
                   (threat_disposition.disposition_code == 2 |
                    threat_disposition.disposition_code == 3 |
                    (threat_disposition.disposition_code == 1 &
                     intent.intent_code == 2)));
          guarantee defense_proposal.proposal_code == 0;
    }*/
  }

  part def Mobility_Service_Eligibility :> Thread {
    port intent : DataPort { in :>> type : IntentValue; }
    port threat_disposition : DataPort { in :>> type : ThreatDispositionValue; }
    port assessment : DataPort { in :>> type : ReadinessAssessmentValue; }
    port recovery_gate : DataPort { in :>> type : RecoveryGateValue; }
    port mobility_proposal : DataPort { out :>> type : MobilityProposalValue; }
    language "GUMBO" /*{
      compute
        compute_cases
        case retreat:
          assume recovery_gate.gate_code == 0 &
                 assessment.retreat_feasible &
                 (threat_disposition.disposition_code == 3 |
                  assessment.cargo_full |
                  intent.intent_code == 3);
          guarantee mobility_proposal.proposal_code == 1;
        case service:
          assume ~(recovery_gate.gate_code == 0 &
                   assessment.retreat_feasible &
                   (threat_disposition.disposition_code == 3 |
                    assessment.cargo_full |
                    intent.intent_code == 3)) &
                 recovery_gate.gate_code == 0 &
                 assessment.dock_service_applicable;
          guarantee mobility_proposal.proposal_code == 2;
        case denied:
          assume ~(recovery_gate.gate_code == 0 &
                   assessment.retreat_feasible &
                   (threat_disposition.disposition_code == 3 |
                    assessment.cargo_full |
                    intent.intent_code == 3)) &
                 ~(recovery_gate.gate_code == 0 &
                   assessment.dock_service_applicable);
          guarantee mobility_proposal.proposal_code == 0;
    }*/
  }

  part def Priority_Arbitration :> Thread {
    port emergency_state : DataPort { in :>> type : EmergencyStateValue; }
    port mining_proposal : DataPort { in :>> type : ProposalValue; }
    port defense_proposal : DataPort { in :>> type : ProposalValue; }
    port mobility_proposal : DataPort { in :>> type : MobilityProposalValue; }
    port selected_action : DataPort { out :>> type : ActionValue; }
    port selected_cause : DataPort { out :>> type : SelectedCauseValue; }
    language "GUMBO" /*{
      compute
        compute_cases
        case emergency:
          assume emergency_state.emergency_code == 1;
          guarantee selected_action.action_code == 0 &
                    selected_cause.cause_code == 0;
        case retreat:
          assume emergency_state.emergency_code == 0 &
                 mobility_proposal.proposal_code == 1;
          guarantee selected_action.action_code == 3 &
                    selected_cause.cause_code == 1;
        case defense:
          assume emergency_state.emergency_code == 0 &
                 mobility_proposal.proposal_code != 1 &
                 defense_proposal.proposal_code == 1;
          guarantee selected_action.action_code == 2 &
                    selected_cause.cause_code == 2;
        case service:
          assume emergency_state.emergency_code == 0 &
                 mobility_proposal.proposal_code == 2 &
                 defense_proposal.proposal_code != 1;
          guarantee selected_action.action_code == 4 &
                    selected_cause.cause_code == 3;
        case mining:
          assume emergency_state.emergency_code == 0 &
                 mobility_proposal.proposal_code == 0 &
                 defense_proposal.proposal_code != 1 &
                 mining_proposal.proposal_code == 1;
          guarantee selected_action.action_code == 1 &
                    selected_cause.cause_code == 4;
        case hold:
          assume emergency_state.emergency_code == 0 &
                 mobility_proposal.proposal_code == 0 &
                 defense_proposal.proposal_code != 1 &
                 mining_proposal.proposal_code != 1;
          guarantee selected_action.action_code == 0 &
                    selected_cause.cause_code == 5;
    }*/
  }

  part def Mission_Mode_And_Public_Result :> Thread {
    port selected_action : DataPort { in :>> type : ActionValue; }
    port selected_cause : DataPort { in :>> type : SelectedCauseValue; }
    port next_recovery_state : DataPort { in :>> type : RecoveryStateValue; }
    port public_result : DataPort { out :>> type : PublicResultValue; }
    language "GUMBO" /*{
      initialize
        guarantee healthy_hold:
          public_result.selected_action == 0 &
          public_result.selected_cause == 5 &
          public_result.mode == 0 &
          public_result.recovery_state == 0;
      compute
        guarantee atomic_composition:
          public_result.selected_action == selected_action.action_code &
          public_result.selected_cause == selected_cause.cause_code &
          public_result.recovery_state == next_recovery_state.state_code;
        compute_cases
        case fault:
          assume next_recovery_state.state_code != 0;
          guarantee public_result.mode == 5;
        case hold:
          assume next_recovery_state.state_code == 0 &
                 selected_action.action_code == 0;
          guarantee public_result.mode == 0;
        case mining:
          assume next_recovery_state.state_code == 0 &
                 selected_action.action_code == 1;
          guarantee public_result.mode == 1;
        case defending:
          assume next_recovery_state.state_code == 0 &
                 selected_action.action_code == 2;
          guarantee public_result.mode == 2;
        case retreating:
          assume next_recovery_state.state_code == 0 &
                 selected_action.action_code == 3;
          guarantee public_result.mode == 3;
        case servicing:
          assume next_recovery_state.state_code == 0 &
                 selected_action.action_code == 4;
          guarantee public_result.mode == 4;
    }*/
  }

  part def Supervisor_Process :> Process {
    port public_result : DataPort { out :>> type : PublicResultValue; }

    part threat_observation : Threat_Observation;
    part intent_acquisition : Intent_Acquisition;
    part resource_observation : Resource_Observation;
    part availability_observation : Availability_Observation;
    part outcome_observation : Outcome_Observation;
    part threat_qualification : Threat_Qualification;
    part readiness_assessment : Readiness_Assessment;
    part recovery_control : Recovery_Control;
    part mining_eligibility : Mining_Eligibility;
    part defense_eligibility : Defense_Eligibility;
    part mobility_service_eligibility : Mobility_Service_Eligibility;
    part priority_arbitration : Priority_Arbitration;
    part mission_mode_and_public_result : Mission_Mode_And_Public_Result;

    connection int_01 : PortConnection connect threat_observation.threat_sample to threat_qualification.threat_sample;
    connection int_02 : PortConnection connect intent_acquisition.intent_recovery to recovery_control.intent;
    connection int_03 : PortConnection connect intent_acquisition.intent_mining to mining_eligibility.intent;
    connection int_04 : PortConnection connect intent_acquisition.intent_defense to defense_eligibility.intent;
    connection int_05 : PortConnection connect intent_acquisition.intent_mobility to mobility_service_eligibility.intent;
    connection int_06 : PortConnection connect resource_observation.cargo_band to readiness_assessment.cargo_band;
    connection int_07 : PortConnection connect resource_observation.capacitor_band to readiness_assessment.capacitor_band;
    connection int_08 : PortConnection connect resource_observation.location to readiness_assessment.location;
    connection int_09 : PortConnection connect availability_observation.mining_available to readiness_assessment.mining_available;
    connection int_10 : PortConnection connect availability_observation.defense_available to readiness_assessment.defense_available;
    connection int_11 : PortConnection connect availability_observation.retreat_available to readiness_assessment.retreat_available;
    connection int_12 : PortConnection connect availability_observation.destination_available to readiness_assessment.destination_available;
    connection int_13 : PortConnection connect availability_observation.service_available to readiness_assessment.service_available;
    connection int_14 : PortConnection connect outcome_observation.action_outcome to recovery_control.action_outcome;
    connection int_15 : PortConnection connect threat_qualification.threat_validity to recovery_control.threat_validity;
    connection int_16 : PortConnection connect threat_qualification.disposition_mining to mining_eligibility.threat_disposition;
    connection int_17 : PortConnection connect threat_qualification.disposition_defense to defense_eligibility.threat_disposition;
    connection int_18 : PortConnection connect threat_qualification.disposition_mobility to mobility_service_eligibility.threat_disposition;
    connection int_19 : PortConnection connect readiness_assessment.assessment_mining to mining_eligibility.assessment;
    connection int_20 : PortConnection connect readiness_assessment.assessment_defense to defense_eligibility.assessment;
    connection int_21 : PortConnection connect readiness_assessment.assessment_mobility to mobility_service_eligibility.assessment;
    connection int_22 : PortConnection connect recovery_control.gate_mining to mining_eligibility.recovery_gate;
    connection int_23 : PortConnection connect recovery_control.gate_defense to defense_eligibility.recovery_gate;
    connection int_24 : PortConnection connect recovery_control.gate_mobility to mobility_service_eligibility.recovery_gate;
    connection int_25 : PortConnection connect recovery_control.emergency_state to priority_arbitration.emergency_state;
    connection int_26 : PortConnection connect mining_eligibility.mining_proposal to priority_arbitration.mining_proposal;
    connection int_27 : PortConnection connect defense_eligibility.defense_proposal to priority_arbitration.defense_proposal;
    connection int_28 : PortConnection connect mobility_service_eligibility.mobility_proposal to priority_arbitration.mobility_proposal;
    connection int_29 : PortConnection connect priority_arbitration.selected_action to mission_mode_and_public_result.selected_action;
    connection int_30 : PortConnection connect priority_arbitration.selected_cause to mission_mode_and_public_result.selected_cause;
    connection int_31 : PortConnection connect recovery_control.next_recovery_state to mission_mode_and_public_result.next_recovery_state;

    connection support_public_result : PortConnection connect mission_mode_and_public_result.public_result to public_result;
  }

  part def Mining_Threat_Retreat_Supervision_Root :> System {
    port public_result : DataPort { out :>> type : PublicResultValue; }
    part supervisor_process : Supervisor_Process;
    connection boundary_public_result : PortConnection connect supervisor_process.public_result to public_result;
  }

  part mining_threat_retreat_supervision : Mining_Threat_Retreat_Supervision_Root;
}
