package Mining_Threat_Retreat_Supervisor {
  private import HAMR::*;

  // Numeric payload fields use these closed-domain legends. The final-stage
  // contracts bind every code to the approved finite policy.
  // @trace MON-01
  enum def Phase { enum Docked; enum Mining; enum Defending; enum Retreating; enum Recovery; }
  // @trace MON-01
  enum def Threat_Valid_Streak { enum Streak_0; enum Streak_1; enum Streak_2; }
  // @trace MON-02
  enum def Threat_Band { enum Clear; enum Caution; enum Hostile; enum Severe; }
  // @trace MON-02
  enum def Cargo_Band { enum Empty; enum Partial; enum NearlyFull; enum Full; }
  // @trace MON-02
  enum def Capacitor_Band { enum High; enum Adequate; enum Low; enum Critical; }
  // @trace MON-02
  enum def Target_State { enum Available; enum Depleted; }
  // @trace MON-03
  enum def Availability_State { enum Available; enum Unavailable; }
  // @trace MON-04
  enum def Pilot_Intent { enum Mine; enum Hold; enum Return; }
  // @trace MON-04
  enum def Arrival_State { enum EnRoute; enum SafeAtStation; }
  // @trace MON-04
  enum def Resupply_State { enum Incomplete; enum Complete; }
  // @trace MON-02
  enum def Validity { enum Valid; enum Invalid; }
  // @trace CTRL-01
  enum def Operation_Command { enum StayDocked; enum Depart; enum Mine; enum HoldAtSite; enum Defend; enum Retreat; enum Recover; }
  // @trace CTRL-02
  enum def Laser_Command { enum Enabled; enum Disabled; }
  // @trace CTRL-02
  enum def Drone_Assignment { enum Stowed; enum Mining; enum Defense; }
  // @trace CTRL-02
  enum def Cargo_Advisory { enum Normal; enum NearlyFull; enum Full; enum Unknown; }
  // @trace CTRL-02
  enum def Capacitor_Advisory { enum Normal; enum Low; enum Critical; enum Unknown; }
  // @trace CTRL-02
  enum def Retreat_Advisory { enum Ready; enum Unavailable; enum Unknown; }
  // @trace FAULT-01
  enum def Fault_Status { enum Clear; enum Asserted; }
  // @trace CTRL-01
  enum def Decision_Reason {
    enum C01; enum C02; enum C03; enum C04; enum C05; enum C06; enum C07; enum C08; enum C09; enum C10;
    enum C11; enum C12; enum C13; enum C14; enum C15; enum C16; enum C17; enum C18; enum C19; enum C20;
  }

  // Code legend: phase 0..4, streak 0..2, raw threat/cargo/capacitor 0..3,
  // validity 0=Valid/1=Invalid, binary observations 0..1, intent 0..2,
  // qualified threat 0=Untrusted/1=Clear/2=Caution/3=Hostile/4=Severe,
  // command 0..6, reason/proposal 0=None or 1..20.

  // @trace MON-02
  part def Raw_Threat_Observation :> Data {
    // @trace MON-02
    part threat : Base_Types::Integer_32;
    // @trace MON-02
    part threat_validity : Base_Types::Integer_32;
    language "GUMBO" /*{
      invariants
        // @trace MON-02
        inv RAW_THREAT_RANGE "Threat and validity remain in the approved finite domains":
          0 [s32] <= threat & threat <= 3 [s32] &
          0 [s32] <= threat_validity & threat_validity <= 1 [s32];
    }*/
  }

  // @trace MON-02
  part def Raw_Resource_Observation :> Data {
    // @trace MON-02
    part cargo : Base_Types::Integer_32;
    // @trace MON-02
    part cargo_validity : Base_Types::Integer_32;
    // @trace MON-02
    part capacitor : Base_Types::Integer_32;
    // @trace MON-02
    part capacitor_validity : Base_Types::Integer_32;
    // @trace MON-02
    part target : Base_Types::Integer_32;
    // @trace MON-02
    part target_validity : Base_Types::Integer_32;
    // @trace MON-03
    part mining_availability : Base_Types::Integer_32;
    // @trace MON-03
    part defense_availability : Base_Types::Integer_32;
    // @trace MON-03
    part retreat_availability : Base_Types::Integer_32;
    // @trace MON-03
    part availability_validity : Base_Types::Integer_32;
    language "GUMBO" /*{
      invariants
        // @trace MON-02
        inv RAW_RESOURCE_RANGE "Resource values and independent validity codes remain finite":
          0 [s32] <= cargo & cargo <= 3 [s32] & 0 [s32] <= cargo_validity & cargo_validity <= 1 [s32] &
          0 [s32] <= capacitor & capacitor <= 3 [s32] & 0 [s32] <= capacitor_validity & capacitor_validity <= 1 [s32] &
          0 [s32] <= target & target <= 1 [s32] & 0 [s32] <= target_validity & target_validity <= 1 [s32] &
          0 [s32] <= mining_availability & mining_availability <= 1 [s32] &
          0 [s32] <= defense_availability & defense_availability <= 1 [s32] &
          0 [s32] <= retreat_availability & retreat_availability <= 1 [s32] &
          0 [s32] <= availability_validity & availability_validity <= 1 [s32];
    }*/
  }

  // @trace MON-04
  part def Raw_Mission_Observation :> Data {
    // @trace MON-04
    part pilot_intent : Base_Types::Integer_32;
    // @trace MON-04
    part intent_validity : Base_Types::Integer_32;
    // @trace MON-04
    part arrival : Base_Types::Integer_32;
    // @trace MON-04
    part arrival_validity : Base_Types::Integer_32;
    // @trace MON-04
    part resupply : Base_Types::Integer_32;
    // @trace MON-04
    part resupply_validity : Base_Types::Integer_32;
    language "GUMBO" /*{
      invariants
        // @trace MON-04
        inv RAW_MISSION_RANGE "Mission, arrival, resupply, and validity codes remain finite":
          0 [s32] <= pilot_intent & pilot_intent <= 2 [s32] & 0 [s32] <= intent_validity & intent_validity <= 1 [s32] &
          0 [s32] <= arrival & arrival <= 1 [s32] & 0 [s32] <= arrival_validity & arrival_validity <= 1 [s32] &
          0 [s32] <= resupply & resupply <= 1 [s32] & 0 [s32] <= resupply_validity & resupply_validity <= 1 [s32];
    }*/
  }

  // @trace MON-01
  part def Threat_State_Input :> Data {
    // @trace MON-01
    part current_valid_streak : Base_Types::Integer_32;
    language "GUMBO" /*{
      invariants
        // @trace MON-01
        inv THREAT_STATE_RANGE "Presented threat state is one approved streak value":
          0 [s32] <= current_valid_streak & current_valid_streak <= 2 [s32];
    }*/
  }

  // @trace MON-01
  part def Phase_State_Input :> Data {
    // @trace MON-01
    part current_phase : Base_Types::Integer_32;
    language "GUMBO" /*{
      invariants
        // @trace MON-01
        inv PHASE_STATE_RANGE "Presented phase state is one approved phase":
          0 [s32] <= current_phase & current_phase <= 4 [s32];
    }*/
  }

  // @trace INT-01
  part def Phase_Context :> Data {
    // @trace MON-01
    part current_phase : Base_Types::Integer_32;
    language "GUMBO" /*{
      invariants
        // @trace MON-01
        inv PHASE_CONTEXT_RANGE "Distributed current phase remains in the approved domain":
          0 [s32] <= current_phase & current_phase <= 4 [s32];
    }*/
  }

  // @trace INT-03
  part def Qualified_Threat :> Data {
    // @trace ASM-02
    part qualified_threat : Base_Types::Integer_32;
    // @trace ASM-02
    attribute untrusted : Base_Types::Boolean;
    // @trace ASM-04
    attribute acceptable : Base_Types::Boolean;
    // @trace ASM-04
    attribute hostile : Base_Types::Boolean;
    // @trace ASM-04
    attribute severe : Base_Types::Boolean;
    language "GUMBO" /*{
      invariants
        // @trace ASM-02
        inv QUALIFIED_THREAT_RANGE "Qualified threat includes Untrusted plus the four approved bands":
          0 [s32] <= qualified_threat & qualified_threat <= 4 [s32];
    }*/
  }

  // @trace INT-11
  part def Threat_Publication_Facts :> Data {
    // @trace ASM-02
    part qualified_threat : Base_Types::Integer_32;
    // @trace CTRL-02
    part next_valid_streak : Base_Types::Integer_32;
    language "GUMBO" /*{
      invariants
        // @trace ASM-02
        inv THREAT_PUBLICATION_RANGE "Qualified band and next streak stay finite":
          0 [s32] <= qualified_threat & qualified_threat <= 4 [s32] &
          0 [s32] <= next_valid_streak & next_valid_streak <= 2 [s32];
    }*/
  }

  // @trace INT-14
  part def Threat_Invalidity :> Data {
    // @trace FAULT-01
    attribute threat_invalid : Base_Types::Boolean;
  }

  // @trace INT-05
  part def Mining_Recovery_Facts :> Data {
    // @trace ASM-03
    attribute mine_ready : Base_Types::Boolean;
    // @trace ASM-03
    attribute resource_reset : Base_Types::Boolean;
    // @trace CASE-08
    attribute cargo_or_capacitor_retreat : Base_Types::Boolean;
    // @trace CASE-09
    attribute target_or_mining_block : Base_Types::Boolean;
  }

  // @trace INT-06
  part def Defense_Facts :> Data {
    // @trace ASM-03
    attribute defense_ready : Base_Types::Boolean;
  }

  // @trace INT-12
  part def Resource_Publication_Facts :> Data {
    // @trace QUAL-01
    part cargo_advisory : Base_Types::Integer_32;
    // @trace QUAL-01
    part capacitor_advisory : Base_Types::Integer_32;
    // @trace QUAL-01
    part retreat_advisory : Base_Types::Integer_32;
    language "GUMBO" /*{
      invariants
        // @trace QUAL-01
        inv RESOURCE_PUBLICATION_RANGE "All three qualifier-owned advisories remain in their domains":
          0 [s32] <= cargo_advisory & cargo_advisory <= 3 [s32] &
          0 [s32] <= capacitor_advisory & capacitor_advisory <= 3 [s32] &
          0 [s32] <= retreat_advisory & retreat_advisory <= 2 [s32];
    }*/
  }

  // @trace INT-15
  part def Resource_Invalidity :> Data {
    // @trace FAULT-01
    attribute resource_invalid : Base_Types::Boolean;
  }

  // @trace INT-07
  part def Mission_Facts :> Data {
    // @trace ASM-05
    attribute valid_mine : Base_Types::Boolean;
    // @trace ASM-05
    attribute invalid_or_return : Base_Types::Boolean;
    // @trace ASM-05
    attribute valid_hold_or_return : Base_Types::Boolean;
    // @trace ASM-05
    attribute valid_complete_resupply : Base_Types::Boolean;
    // @trace ASM-05
    attribute intent_invalid : Base_Types::Boolean;
  }

  // @trace INT-08
  part def Arrival_Fact :> Data {
    // @trace ASM-05
    attribute valid_safe_at_station : Base_Types::Boolean;
  }

  // @trace INT-13
  part def Mission_Invalidity_Facts :> Data {
    // @trace FAULT-01
    attribute intent_invalid : Base_Types::Boolean;
    // @trace FAULT-01
    attribute arrival_invalid : Base_Types::Boolean;
    // @trace FAULT-01
    attribute resupply_invalid : Base_Types::Boolean;
  }

  // @trace INT-09
  part def Mission_Proposal :> Data {
    // @trace PART-05
    part proposed_reason : Base_Types::Integer_32;
    language "GUMBO" /*{
      invariants
        // @trace PART-05
        inv MISSION_PROPOSAL_RANGE "Mission proposal is None or one approved MR reason":
          0 [s32] <= proposed_reason & proposed_reason <= 20 [s32];
    }*/
  }

  // @trace INT-10
  part def Response_Proposal :> Data {
    // @trace PART-06
    part proposed_reason : Base_Types::Integer_32;
    language "GUMBO" /*{
      invariants
        // @trace PART-06
        inv RESPONSE_PROPOSAL_RANGE "Response proposal is None or one approved TR reason":
          0 [s32] <= proposed_reason & proposed_reason <= 17 [s32];
    }*/
  }

  // @trace INT-17
  part def Fault_Fact :> Data {
    // @trace FAULT-01
    part fault : Base_Types::Integer_32;
    language "GUMBO" /*{
      invariants
        // @trace FAULT-01
        inv FAULT_RANGE "Fault is exactly Clear or Asserted":
          0 [s32] <= fault & fault <= 1 [s32];
    }*/
  }

  // @trace INT-18
  part def Atomic_Supervisor_Result :> Data {
    // @trace CTRL-01
    part command : Base_Types::Integer_32;
    // @trace CTRL-01
    part current_phase : Base_Types::Integer_32;
    // @trace CTRL-01
    part next_phase : Base_Types::Integer_32;
    // @trace CTRL-01
    part reason : Base_Types::Integer_32;
    // @trace CTRL-02
    part fault : Base_Types::Integer_32;
    // @trace CTRL-02
    part next_valid_streak : Base_Types::Integer_32;
    // @trace CTRL-02
    part cargo_advisory : Base_Types::Integer_32;
    // @trace CTRL-02
    part capacitor_advisory : Base_Types::Integer_32;
    // @trace CTRL-02
    part retreat_advisory : Base_Types::Integer_32;
    language "GUMBO" /*{
      invariants
        // @trace CTRL-01
        inv ATOMIC_RESULT_RANGE "Resolved command, phases, reason, status, and advisories stay finite":
          0 [s32] <= command & command <= 6 [s32] &
          0 [s32] <= current_phase & current_phase <= 4 [s32] &
          0 [s32] <= next_phase & next_phase <= 4 [s32] &
          1 [s32] <= reason & reason <= 20 [s32] &
          0 [s32] <= fault & fault <= 1 [s32] &
          0 [s32] <= next_valid_streak & next_valid_streak <= 2 [s32] &
          0 [s32] <= cargo_advisory & cargo_advisory <= 3 [s32] &
          0 [s32] <= capacitor_advisory & capacitor_advisory <= 3 [s32] &
          0 [s32] <= retreat_advisory & retreat_advisory <= 2 [s32];
    }*/
  }

  // @trace GOAL-04
  part def Published_Supervisor_Result :> Data {
    // @trace CTRL-01
    part command : Base_Types::Integer_32;
    // @trace CTRL-01
    part current_phase : Base_Types::Integer_32;
    // @trace CTRL-01
    part next_phase : Base_Types::Integer_32;
    // @trace CTRL-01
    part reason : Base_Types::Integer_32;
    // @trace CTRL-02
    part fault : Base_Types::Integer_32;
    // @trace CTRL-02
    part next_valid_streak : Base_Types::Integer_32;
    // @trace CTRL-02
    part cargo_advisory : Base_Types::Integer_32;
    // @trace CTRL-02
    part capacitor_advisory : Base_Types::Integer_32;
    // @trace CTRL-02
    part retreat_advisory : Base_Types::Integer_32;
    // @trace BEH-04
    part laser : Base_Types::Integer_32;
    // @trace BEH-04
    part drones : Base_Types::Integer_32;
    language "GUMBO" /*{
      invariants
        // @trace CTRL-02
        inv PUBLISHED_RESULT_RANGE "The coherent boundary result uses only approved output codes":
          0 [s32] <= command & command <= 6 [s32] &
          0 [s32] <= current_phase & current_phase <= 4 [s32] &
          0 [s32] <= next_phase & next_phase <= 4 [s32] &
          1 [s32] <= reason & reason <= 20 [s32] &
          0 [s32] <= fault & fault <= 1 [s32] &
          0 [s32] <= next_valid_streak & next_valid_streak <= 2 [s32] &
          0 [s32] <= cargo_advisory & cargo_advisory <= 3 [s32] &
          0 [s32] <= capacitor_advisory & capacitor_advisory <= 3 [s32] &
          0 [s32] <= retreat_advisory & retreat_advisory <= 2 [s32] &
          0 [s32] <= laser & laser <= 1 [s32] &
          0 [s32] <= drones & drones <= 2 [s32];
    }*/
  }

  // @trace PART-01
  part def Fault_Assessment :> Thread {
    // @trace INT-13
    port mission_invalidity : DataPort { in :>> type : Mission_Invalidity_Facts; }
    // @trace INT-14
    port threat_invalidity : DataPort { in :>> type : Threat_Invalidity; }
    // @trace INT-15
    port resource_invalidity : DataPort { in :>> type : Resource_Invalidity; }
    // @trace INT-16
    port phase_context : DataPort { in :>> type : Phase_Context; }
    // @trace INT-17
    port fault : DataPort { out :>> type : Fault_Fact; }
    language "GUMBO" /*{
      initialize
        // @trace FAULT-01
        guarantee FA_INITIAL_CLEAR "Fault output initializes to the explicit safe Clear value":
          fault.fault == 0 [s32];
      compute
        // @trace FAULT-01
        guarantee FA_PHASE_RELEVANT_FAULT "FA alone applies arrival and resupply phase relevance to qualifier invalidity":
          ((fault.fault == 1 [s32]) ==
            (threat_invalidity.threat_invalid |
             resource_invalidity.resource_invalid |
             mission_invalidity.intent_invalid |
             (phase_context.current_phase == 3 [s32] & mission_invalidity.arrival_invalid) |
             ((phase_context.current_phase == 0 [s32] | phase_context.current_phase == 4 [s32]) &
               mission_invalidity.resupply_invalid))) &
          ((fault.fault == 0 [s32]) ==
            not (threat_invalidity.threat_invalid |
                 resource_invalidity.resource_invalid |
                 mission_invalidity.intent_invalid |
                 (phase_context.current_phase == 3 [s32] & mission_invalidity.arrival_invalid) |
                 ((phase_context.current_phase == 0 [s32] | phase_context.current_phase == 4 [s32]) &
                   mission_invalidity.resupply_invalid)));
    }*/
  }

  // @trace PART-02
  part def Threat_Qualification :> Thread {
    // @trace GENERATED-SUPPORT-01
    port raw_threat : DataPort { in :>> type : Raw_Threat_Observation; }
    // @trace MON-01
    port streak_state : DataPort { in :>> type : Threat_State_Input; }
    // @trace INT-03
    port qualified_threat : DataPort { out :>> type : Qualified_Threat; }
    // @trace INT-11
    port threat_publication : DataPort { out :>> type : Threat_Publication_Facts; }
    // @trace INT-14
    port threat_invalidity : DataPort { out :>> type : Threat_Invalidity; }
    language "GUMBO" /*{
      state
        // @trace STATE-OWN-01
        owned_valid_streak: Base_Types::Integer_32;
      initialize
        // @trace STATE-01
        guarantee TQ_INITIAL_STREAK "TQ initializes its sole streak state to zero":
          owned_valid_streak == 0 [s32] & threat_publication.next_valid_streak == 0 [s32];
      compute
        // @trace ASM-02
        guarantee TQ_STREAK_AND_TRUST "TQ applies invalid reset, saturating increment, and two-tick trust":
          '->:'(raw_threat.threat_validity == 1 [s32],
                threat_publication.next_valid_streak == 0 [s32] &
                qualified_threat.qualified_threat == 0 [s32]) &
          '->:'(raw_threat.threat_validity == 0 [s32] & streak_state.current_valid_streak == 0 [s32],
                threat_publication.next_valid_streak == 1 [s32] &
                qualified_threat.qualified_threat == 0 [s32]) &
          '->:'(raw_threat.threat_validity == 0 [s32] & streak_state.current_valid_streak == 1 [s32],
                threat_publication.next_valid_streak == 2 [s32] &
                qualified_threat.qualified_threat == raw_threat.threat + 1 [s32]) &
          '->:'(raw_threat.threat_validity == 0 [s32] & streak_state.current_valid_streak == 2 [s32],
                threat_publication.next_valid_streak == 2 [s32] &
                qualified_threat.qualified_threat == raw_threat.threat + 1 [s32]);
        // @trace ASM-04
        guarantee TQ_QUALIFIED_FACTS "TQ derives the acceptable, Hostile, Severe, and Untrusted facts once":
          (qualified_threat.untrusted == (qualified_threat.qualified_threat == 0 [s32])) &
          (qualified_threat.acceptable ==
            (qualified_threat.qualified_threat == 1 [s32] | qualified_threat.qualified_threat == 2 [s32])) &
          (qualified_threat.hostile == (qualified_threat.qualified_threat == 3 [s32])) &
          (qualified_threat.severe == (qualified_threat.qualified_threat == 4 [s32]));
        // @trace BEH-01
        guarantee TQ_PUBLICATION_AND_STATE "TQ publishes its own qualified value and next streak and owns the streak update":
          threat_publication.qualified_threat == qualified_threat.qualified_threat &
          owned_valid_streak == threat_publication.next_valid_streak;
        // @trace INT-14
        guarantee TQ_INVALIDITY "TQ alone derives threat invalidity for FA":
          (threat_invalidity.threat_invalid == (raw_threat.threat_validity == 1 [s32]));
    }*/
  }

  // @trace PART-03
  part def Resource_Qualification :> Thread {
    // @trace GENERATED-SUPPORT-01
    port raw_resources : DataPort { in :>> type : Raw_Resource_Observation; }
    // @trace INT-05
    port mining_recovery_facts : DataPort { out :>> type : Mining_Recovery_Facts; }
    // @trace INT-06
    port defense_facts : DataPort { out :>> type : Defense_Facts; }
    // @trace INT-12
    port resource_publication : DataPort { out :>> type : Resource_Publication_Facts; }
    // @trace INT-15
    port resource_invalidity : DataPort { out :>> type : Resource_Invalidity; }
    language "GUMBO" /*{
      initialize
        // @trace QUAL-01
        guarantee RQ_INITIAL_ADVISORIES "RQ initializes advisories to explicit Unknown values":
          resource_publication.cargo_advisory == 3 [s32] &
          resource_publication.capacitor_advisory == 3 [s32] &
          resource_publication.retreat_advisory == 2 [s32];
      compute
        // @trace ASM-03
        guarantee RQ_MINING_AND_RESET "RQ derives mine readiness and the exact Empty/high-or-adequate resource reset":
          (mining_recovery_facts.mine_ready ==
            (raw_resources.cargo_validity == 0 [s32] & raw_resources.cargo != 3 [s32] &
             raw_resources.capacitor_validity == 0 [s32] &
             (raw_resources.capacitor == 0 [s32] | raw_resources.capacitor == 1 [s32]) &
             raw_resources.target_validity == 0 [s32] & raw_resources.target == 0 [s32] &
             raw_resources.availability_validity == 0 [s32] & raw_resources.mining_availability == 0 [s32])) &
          (mining_recovery_facts.resource_reset ==
            (raw_resources.cargo_validity == 0 [s32] & raw_resources.cargo == 0 [s32] &
             raw_resources.capacitor_validity == 0 [s32] &
             (raw_resources.capacitor == 0 [s32] | raw_resources.capacitor == 1 [s32])));
        // @trace ASM-03
        guarantee RQ_DEFENSE "RQ derives defense readiness from valid capacitor and shared availability":
          (defense_facts.defense_ready ==
            (raw_resources.capacitor_validity == 0 [s32] &
             (raw_resources.capacitor == 0 [s32] | raw_resources.capacitor == 1 [s32]) &
             raw_resources.availability_validity == 0 [s32] & raw_resources.defense_availability == 0 [s32]));
        // @trace CASE-08
        guarantee RQ_C08_APPLICABILITY "RQ derives the cargo-or-capacitor retreat pressure used by MR":
          (mining_recovery_facts.cargo_or_capacitor_retreat ==
            (raw_resources.cargo_validity == 1 [s32] | raw_resources.cargo == 3 [s32] |
             raw_resources.capacitor_validity == 1 [s32] | raw_resources.capacitor == 2 [s32] |
             raw_resources.capacitor == 3 [s32]));
        // @trace CASE-09
        guarantee RQ_C09_APPLICABILITY "RQ derives target or mining-availability blocking used by MR":
          (mining_recovery_facts.target_or_mining_block ==
            (raw_resources.target_validity == 1 [s32] | raw_resources.target == 1 [s32] |
             raw_resources.availability_validity == 1 [s32] | raw_resources.mining_availability == 1 [s32]));
        // @trace QUAL-01
        guarantee RQ_ADVISORIES "RQ closes cargo, capacitor, and retreat advisory mappings":
          '->:'(raw_resources.cargo_validity == 1 [s32], resource_publication.cargo_advisory == 3 [s32]) &
          '->:'(raw_resources.cargo_validity == 0 [s32] & raw_resources.cargo == 3 [s32],
                resource_publication.cargo_advisory == 2 [s32]) &
          '->:'(raw_resources.cargo_validity == 0 [s32] & raw_resources.cargo == 2 [s32],
                resource_publication.cargo_advisory == 1 [s32]) &
          '->:'(raw_resources.cargo_validity == 0 [s32] &
                (raw_resources.cargo == 0 [s32] | raw_resources.cargo == 1 [s32]),
                resource_publication.cargo_advisory == 0 [s32]) &
          '->:'(raw_resources.capacitor_validity == 1 [s32], resource_publication.capacitor_advisory == 3 [s32]) &
          '->:'(raw_resources.capacitor_validity == 0 [s32] & raw_resources.capacitor == 3 [s32],
                resource_publication.capacitor_advisory == 2 [s32]) &
          '->:'(raw_resources.capacitor_validity == 0 [s32] & raw_resources.capacitor == 2 [s32],
                resource_publication.capacitor_advisory == 1 [s32]) &
          '->:'(raw_resources.capacitor_validity == 0 [s32] &
                (raw_resources.capacitor == 0 [s32] | raw_resources.capacitor == 1 [s32]),
                resource_publication.capacitor_advisory == 0 [s32]) &
          '->:'(raw_resources.availability_validity == 1 [s32], resource_publication.retreat_advisory == 2 [s32]) &
          '->:'(raw_resources.availability_validity == 0 [s32] & raw_resources.retreat_availability == 1 [s32],
                resource_publication.retreat_advisory == 1 [s32]) &
          '->:'(raw_resources.availability_validity == 0 [s32] & raw_resources.retreat_availability == 0 [s32],
                resource_publication.retreat_advisory == 0 [s32]);
        // @trace INT-15
        guarantee RQ_INVALIDITY "RQ derives the complete MON-02 and MON-03 resource invalidity fact for FA":
          (resource_invalidity.resource_invalid ==
            (raw_resources.cargo_validity == 1 [s32] |
             raw_resources.capacitor_validity == 1 [s32] |
             raw_resources.target_validity == 1 [s32] |
             raw_resources.availability_validity == 1 [s32]));
    }*/
  }

  // @trace PART-04
  part def Personnel_Mission_Qualification :> Thread {
    // @trace GENERATED-SUPPORT-01
    port raw_mission : DataPort { in :>> type : Raw_Mission_Observation; }
    // @trace INT-07
    port mission_facts : DataPort { out :>> type : Mission_Facts; }
    // @trace INT-08
    port arrival_fact : DataPort { out :>> type : Arrival_Fact; }
    // @trace INT-13
    port mission_invalidity : DataPort { out :>> type : Mission_Invalidity_Facts; }
    language "GUMBO" /*{
      initialize
        // @trace ASM-05
        guarantee PQ_INITIAL_FACTS "PQ initialization establishes no favorable mission or arrival fact":
          not mission_facts.valid_mine &
          not mission_facts.valid_complete_resupply &
          not arrival_fact.valid_safe_at_station;
      compute
        // @trace ASM-05
        guarantee PQ_INTENT_FACTS "PQ derives independent intent facts without phase context":
          (mission_facts.valid_mine ==
            (raw_mission.intent_validity == 0 [s32] & raw_mission.pilot_intent == 0 [s32])) &
          (mission_facts.invalid_or_return ==
            (raw_mission.intent_validity == 1 [s32] | raw_mission.pilot_intent == 2 [s32])) &
          (mission_facts.valid_hold_or_return ==
            (raw_mission.intent_validity == 0 [s32] &
             (raw_mission.pilot_intent == 1 [s32] | raw_mission.pilot_intent == 2 [s32]))) &
          (mission_facts.intent_invalid == (raw_mission.intent_validity == 1 [s32]));
        // @trace ASM-05
        guarantee PQ_PROGRESS_FACTS "PQ derives fresh SafeAtStation and Complete resupply without phase relevance":
          (arrival_fact.valid_safe_at_station ==
            (raw_mission.arrival_validity == 0 [s32] & raw_mission.arrival == 1 [s32])) &
          (mission_facts.valid_complete_resupply ==
            (raw_mission.resupply_validity == 0 [s32] & raw_mission.resupply == 1 [s32]));
        // @trace INT-13
        guarantee PQ_INDEPENDENT_INVALIDITY "PQ publishes all three independent invalidity facts and no phase decision":
          (mission_invalidity.intent_invalid == (raw_mission.intent_validity == 1 [s32])) &
          (mission_invalidity.arrival_invalid == (raw_mission.arrival_validity == 1 [s32])) &
          (mission_invalidity.resupply_invalid == (raw_mission.resupply_validity == 1 [s32]));
    }*/
  }

  // @trace PART-05
  part def Mission_Recovery_Decision :> Thread {
    // @trace INT-01
    port phase_context : DataPort { in :>> type : Phase_Context; }
    // @trace INT-03
    port threat_fact : DataPort { in :>> type : Qualified_Threat; }
    // @trace INT-05
    port resource_facts : DataPort { in :>> type : Mining_Recovery_Facts; }
    // @trace INT-07
    port mission_facts : DataPort { in :>> type : Mission_Facts; }
    // @trace INT-09
    port mission_proposal : DataPort { out :>> type : Mission_Proposal; }
    language "GUMBO" /*{
      initialize
        // @trace PART-05
        guarantee MR_INITIAL_NONE "MR initializes to the explicit None proposal":
          mission_proposal.proposed_reason == 0 [s32];
      compute
        // @trace LOCAL-CONTRACT-02
        guarantee MR_PROPOSAL_PARTITIONS "MR closes Docked, mission-side Mining, C14, and Recovery proposals from assigned facts":
          '->:'(phase_context.current_phase == 0 [s32] &
                threat_fact.acceptable & resource_facts.mine_ready & resource_facts.resource_reset &
                mission_facts.valid_complete_resupply & mission_facts.valid_mine,
                mission_proposal.proposed_reason == 1 [s32]) &
          '->:'(phase_context.current_phase == 0 [s32] &
                not (threat_fact.acceptable & resource_facts.mine_ready & resource_facts.resource_reset &
                     mission_facts.valid_complete_resupply & mission_facts.valid_mine),
                mission_proposal.proposed_reason == 2 [s32]) &
          '->:'(phase_context.current_phase == 1 [s32] & mission_facts.invalid_or_return,
                mission_proposal.proposed_reason == 7 [s32]) &
          '->:'(phase_context.current_phase == 1 [s32] & not mission_facts.invalid_or_return &
                resource_facts.cargo_or_capacitor_retreat,
                mission_proposal.proposed_reason == 8 [s32]) &
          '->:'(phase_context.current_phase == 1 [s32] & not mission_facts.invalid_or_return &
                not resource_facts.cargo_or_capacitor_retreat & resource_facts.target_or_mining_block,
                mission_proposal.proposed_reason == 9 [s32]) &
          '->:'(phase_context.current_phase == 1 [s32] & not mission_facts.invalid_or_return &
                not resource_facts.cargo_or_capacitor_retreat & not resource_facts.target_or_mining_block &
                mission_facts.valid_hold_or_return,
                mission_proposal.proposed_reason == 10 [s32]) &
          '->:'(phase_context.current_phase == 1 [s32] & not mission_facts.invalid_or_return &
                not resource_facts.cargo_or_capacitor_retreat & not resource_facts.target_or_mining_block &
                not mission_facts.valid_hold_or_return,
                mission_proposal.proposed_reason == 11 [s32]) &
          '->:'(phase_context.current_phase == 2 [s32] & threat_fact.acceptable &
                resource_facts.mine_ready & mission_facts.valid_mine,
                mission_proposal.proposed_reason == 14 [s32]) &
          '->:'(phase_context.current_phase == 2 [s32] &
                not (threat_fact.acceptable & resource_facts.mine_ready & mission_facts.valid_mine),
                mission_proposal.proposed_reason == 0 [s32]) &
          '->:'(phase_context.current_phase == 3 [s32], mission_proposal.proposed_reason == 0 [s32]) &
          '->:'(phase_context.current_phase == 4 [s32] &
                (not threat_fact.acceptable | mission_facts.intent_invalid |
                 not (resource_facts.resource_reset & mission_facts.valid_complete_resupply)),
                mission_proposal.proposed_reason == 18 [s32]) &
          '->:'(phase_context.current_phase == 4 [s32] & threat_fact.acceptable &
                not mission_facts.intent_invalid & resource_facts.resource_reset &
                mission_facts.valid_complete_resupply & mission_facts.valid_mine,
                mission_proposal.proposed_reason == 19 [s32]) &
          '->:'(phase_context.current_phase == 4 [s32] & threat_fact.acceptable &
                not mission_facts.intent_invalid & resource_facts.resource_reset &
                mission_facts.valid_complete_resupply & not mission_facts.valid_mine &
                mission_facts.valid_hold_or_return,
                mission_proposal.proposed_reason == 20 [s32]);
    }*/
  }

  // @trace PART-06
  part def Threat_Retreat_Decision :> Thread {
    // @trace INT-02
    port phase_context : DataPort { in :>> type : Phase_Context; }
    // @trace INT-04
    port threat_fact : DataPort { in :>> type : Qualified_Threat; }
    // @trace INT-06
    port defense_facts : DataPort { in :>> type : Defense_Facts; }
    // @trace INT-08
    port arrival_fact : DataPort { in :>> type : Arrival_Fact; }
    // @trace INT-10
    port response_proposal : DataPort { out :>> type : Response_Proposal; }
    language "GUMBO" /*{
      initialize
        // @trace PART-06
        guarantee TR_INITIAL_NONE "TR initializes to the explicit None proposal":
          response_proposal.proposed_reason == 0 [s32];
      compute
        // @trace LOCAL-CONTRACT-02
        guarantee TR_PROPOSAL_PARTITIONS "TR closes Mining threat, Defending, and Retreating proposals from assigned facts":
          '->:'(phase_context.current_phase == 0 [s32], response_proposal.proposed_reason == 0 [s32]) &
          '->:'(phase_context.current_phase == 1 [s32] & threat_fact.untrusted,
                response_proposal.proposed_reason == 3 [s32]) &
          '->:'(phase_context.current_phase == 1 [s32] & not threat_fact.untrusted & threat_fact.severe,
                response_proposal.proposed_reason == 4 [s32]) &
          '->:'(phase_context.current_phase == 1 [s32] & not threat_fact.untrusted & not threat_fact.severe &
                threat_fact.hostile & defense_facts.defense_ready,
                response_proposal.proposed_reason == 5 [s32]) &
          '->:'(phase_context.current_phase == 1 [s32] & not threat_fact.untrusted & not threat_fact.severe &
                threat_fact.hostile & not defense_facts.defense_ready,
                response_proposal.proposed_reason == 6 [s32]) &
          '->:'(phase_context.current_phase == 1 [s32] & not threat_fact.untrusted & not threat_fact.severe &
                not threat_fact.hostile,
                response_proposal.proposed_reason == 0 [s32]) &
          '->:'(phase_context.current_phase == 2 [s32] &
                (threat_fact.untrusted | threat_fact.severe | not defense_facts.defense_ready),
                response_proposal.proposed_reason == 12 [s32]) &
          '->:'(phase_context.current_phase == 2 [s32] & not threat_fact.untrusted & not threat_fact.severe &
                defense_facts.defense_ready & threat_fact.hostile,
                response_proposal.proposed_reason == 13 [s32]) &
          '->:'(phase_context.current_phase == 2 [s32] & not threat_fact.untrusted & not threat_fact.severe &
                defense_facts.defense_ready & not threat_fact.hostile,
                response_proposal.proposed_reason == 15 [s32]) &
          '->:'(phase_context.current_phase == 3 [s32] & arrival_fact.valid_safe_at_station,
                response_proposal.proposed_reason == 16 [s32]) &
          '->:'(phase_context.current_phase == 3 [s32] & not arrival_fact.valid_safe_at_station,
                response_proposal.proposed_reason == 17 [s32]) &
          '->:'(phase_context.current_phase == 4 [s32], response_proposal.proposed_reason == 0 [s32]);
    }*/
  }

  // @trace PART-07
  part def Priority_Phase_Arbitration :> Thread {
    // @trace MON-01
    port phase_state : DataPort { in :>> type : Phase_State_Input; }
    // @trace INT-09
    port mission_candidate : DataPort { in :>> type : Mission_Proposal; }
    // @trace INT-10
    port response_candidate : DataPort { in :>> type : Response_Proposal; }
    // @trace INT-11
    port threat_publication : DataPort { in :>> type : Threat_Publication_Facts; }
    // @trace INT-12
    port resource_publication : DataPort { in :>> type : Resource_Publication_Facts; }
    // @trace INT-17
    port fault : DataPort { in :>> type : Fault_Fact; }
    // @trace INT-01
    port phase_context : DataPort { out :>> type : Phase_Context; }
    // @trace INT-18
    port resolved_atomic_result : DataPort { out :>> type : Atomic_Supervisor_Result; }
    language "GUMBO" /*{
      state
        // @trace STATE-OWN-01
        owned_phase: Base_Types::Integer_32;
      initialize
        // @trace STATE-01
        guarantee AS_INITIAL_DOCKED "AS initializes its sole phase state and publication to an explicit Docked hold":
          owned_phase == 0 [s32] &
          phase_context.current_phase == 0 [s32] &
          resolved_atomic_result.command == 0 [s32] &
          resolved_atomic_result.current_phase == 0 [s32] &
          resolved_atomic_result.next_phase == 0 [s32] &
          resolved_atomic_result.reason == 2 [s32] &
          resolved_atomic_result.fault == 0 [s32] &
          resolved_atomic_result.next_valid_streak == 0 [s32] &
          resolved_atomic_result.cargo_advisory == 3 [s32] &
          resolved_atomic_result.capacitor_advisory == 3 [s32] &
          resolved_atomic_result.retreat_advisory == 2 [s32];
      compute
        // @trace STATE-OWN-01
        guarantee AS_PHASE_OWNERSHIP "AS distributes presented current phase and alone commits the selected next phase":
          phase_context.current_phase == phase_state.current_phase &
          resolved_atomic_result.current_phase == phase_state.current_phase &
          owned_phase == resolved_atomic_result.next_phase;
        // @trace BEH-05
        guarantee AS_ATOMIC_STATUS "AS consumes owner-produced fault, streak, and advisories into the same atomic result":
          resolved_atomic_result.fault == fault.fault &
          resolved_atomic_result.next_valid_streak == threat_publication.next_valid_streak &
          resolved_atomic_result.cargo_advisory == resource_publication.cargo_advisory &
          resolved_atomic_result.capacitor_advisory == resource_publication.capacitor_advisory &
          resolved_atomic_result.retreat_advisory == resource_publication.retreat_advisory;

      compute_cases
        // @trace CASE-01
        case CASE_01_DOCKED_DEPART "Docked accepts MR C01":
          assume phase_state.current_phase == 0 [s32] & mission_candidate.proposed_reason == 1 [s32];
          guarantee resolved_atomic_result.command == 1 [s32] & resolved_atomic_result.next_phase == 1 [s32] &
            resolved_atomic_result.reason == 1 [s32];
        // @trace CASE-02
        case CASE_02_DOCKED_STAY "Docked accepts MR fallback C02":
          assume phase_state.current_phase == 0 [s32] & mission_candidate.proposed_reason == 2 [s32];
          guarantee resolved_atomic_result.command == 0 [s32] & resolved_atomic_result.next_phase == 0 [s32] &
            resolved_atomic_result.reason == 2 [s32];
        // @trace CASE-03
        case CASE_03_MINING_UNTRUSTED "Mining accepts TR-leading C03":
          assume phase_state.current_phase == 1 [s32] & response_candidate.proposed_reason == 3 [s32];
          guarantee resolved_atomic_result.command == 5 [s32] & resolved_atomic_result.next_phase == 3 [s32] &
            resolved_atomic_result.reason == 3 [s32];
        // @trace CASE-04
        case CASE_04_MINING_SEVERE "Mining accepts TR-leading C04":
          assume phase_state.current_phase == 1 [s32] & response_candidate.proposed_reason == 4 [s32];
          guarantee resolved_atomic_result.command == 5 [s32] & resolved_atomic_result.next_phase == 3 [s32] &
            resolved_atomic_result.reason == 4 [s32];
        // @trace CASE-05
        case CASE_05_HOSTILE_DEFENSE_PRIORITY "TR C05 wins even when MR simultaneously proposes C07 or C08":
          assume phase_state.current_phase == 1 [s32] & response_candidate.proposed_reason == 5 [s32];
          guarantee resolved_atomic_result.command == 4 [s32] & resolved_atomic_result.next_phase == 2 [s32] &
            resolved_atomic_result.reason == 5 [s32];
        // @trace CASE-06
        case CASE_06_HOSTILE_RETREAT "Mining accepts TR C06 when defense is not ready":
          assume phase_state.current_phase == 1 [s32] & response_candidate.proposed_reason == 6 [s32];
          guarantee resolved_atomic_result.command == 5 [s32] & resolved_atomic_result.next_phase == 3 [s32] &
            resolved_atomic_result.reason == 6 [s32];
        // @trace CASE-07
        case CASE_07_MISSION_RETREAT "MR C07 is effective only when TR has no Mining proposal":
          assume phase_state.current_phase == 1 [s32] & response_candidate.proposed_reason == 0 [s32] &
            mission_candidate.proposed_reason == 7 [s32];
          guarantee resolved_atomic_result.command == 5 [s32] & resolved_atomic_result.next_phase == 3 [s32] &
            resolved_atomic_result.reason == 7 [s32];
        // @trace CASE-08
        case CASE_08_RESOURCE_RETREAT "MR C08 is effective only when TR has no Mining proposal":
          assume phase_state.current_phase == 1 [s32] & response_candidate.proposed_reason == 0 [s32] &
            mission_candidate.proposed_reason == 8 [s32];
          guarantee resolved_atomic_result.command == 5 [s32] & resolved_atomic_result.next_phase == 3 [s32] &
            resolved_atomic_result.reason == 8 [s32];
        // @trace CASE-09
        case CASE_09_RESOURCE_HOLD "MR C09 is effective only when TR has no Mining proposal":
          assume phase_state.current_phase == 1 [s32] & response_candidate.proposed_reason == 0 [s32] &
            mission_candidate.proposed_reason == 9 [s32];
          guarantee resolved_atomic_result.command == 3 [s32] & resolved_atomic_result.next_phase == 1 [s32] &
            resolved_atomic_result.reason == 9 [s32];
        // @trace CASE-10
        case CASE_10_PILOT_HOLD "MR C10 is effective only when TR has no Mining proposal":
          assume phase_state.current_phase == 1 [s32] & response_candidate.proposed_reason == 0 [s32] &
            mission_candidate.proposed_reason == 10 [s32];
          guarantee resolved_atomic_result.command == 3 [s32] & resolved_atomic_result.next_phase == 1 [s32] &
            resolved_atomic_result.reason == 10 [s32];
        // @trace CASE-11
        case CASE_11_MINE "MR C11 closes Mining when TR has no proposal":
          assume phase_state.current_phase == 1 [s32] & response_candidate.proposed_reason == 0 [s32] &
            mission_candidate.proposed_reason == 11 [s32];
          guarantee resolved_atomic_result.command == 2 [s32] & resolved_atomic_result.next_phase == 1 [s32] &
            resolved_atomic_result.reason == 11 [s32];
        // @trace CASE-12
        case CASE_12_DEFENDING_RETREAT "TR C12 leads Defending":
          assume phase_state.current_phase == 2 [s32] & response_candidate.proposed_reason == 12 [s32];
          guarantee resolved_atomic_result.command == 5 [s32] & resolved_atomic_result.next_phase == 3 [s32] &
            resolved_atomic_result.reason == 12 [s32];
        // @trace CASE-13
        case CASE_13_DEFENDING_PERSISTS "TR C13 follows C12 exclusion":
          assume phase_state.current_phase == 2 [s32] & response_candidate.proposed_reason == 13 [s32];
          guarantee resolved_atomic_result.command == 4 [s32] & resolved_atomic_result.next_phase == 2 [s32] &
            resolved_atomic_result.reason == 13 [s32];
        // @trace CASE-14
        case CASE_14_RESUME_MINING "MR C14 precedes TR fallback C15":
          assume phase_state.current_phase == 2 [s32] & response_candidate.proposed_reason == 15 [s32] &
            mission_candidate.proposed_reason == 14 [s32];
          guarantee resolved_atomic_result.command == 2 [s32] & resolved_atomic_result.next_phase == 1 [s32] &
            resolved_atomic_result.reason == 14 [s32];
        // @trace CASE-15
        case CASE_15_DEFENDING_FALLBACK "TR C15 is effective only when MR does not propose C14":
          assume phase_state.current_phase == 2 [s32] & response_candidate.proposed_reason == 15 [s32] &
            not (mission_candidate.proposed_reason == 14 [s32]);
          guarantee resolved_atomic_result.command == 5 [s32] & resolved_atomic_result.next_phase == 3 [s32] &
            resolved_atomic_result.reason == 15 [s32];
        // @trace CASE-16
        case CASE_16_SAFE_ARRIVAL "Retreating accepts TR C16 as its only Recovery entry":
          assume phase_state.current_phase == 3 [s32] & response_candidate.proposed_reason == 16 [s32];
          guarantee resolved_atomic_result.command == 6 [s32] & resolved_atomic_result.next_phase == 4 [s32] &
            resolved_atomic_result.reason == 16 [s32];
        // @trace CASE-17
        case CASE_17_RETREAT_PERSISTS "Retreating accepts TR fallback C17":
          assume phase_state.current_phase == 3 [s32] & response_candidate.proposed_reason == 17 [s32];
          guarantee resolved_atomic_result.command == 5 [s32] & resolved_atomic_result.next_phase == 3 [s32] &
            resolved_atomic_result.reason == 17 [s32];
        // @trace CASE-18
        case CASE_18_RECOVERY_CONTINUES "Recovery accepts MR-leading C18":
          assume phase_state.current_phase == 4 [s32] & mission_candidate.proposed_reason == 18 [s32];
          guarantee resolved_atomic_result.command == 6 [s32] & resolved_atomic_result.next_phase == 4 [s32] &
            resolved_atomic_result.reason == 18 [s32];
        // @trace CASE-19
        case CASE_19_REDEPLOY "Recovery accepts MR C19":
          assume phase_state.current_phase == 4 [s32] & mission_candidate.proposed_reason == 19 [s32];
          guarantee resolved_atomic_result.command == 1 [s32] & resolved_atomic_result.next_phase == 1 [s32] &
            resolved_atomic_result.reason == 19 [s32];
        // @trace CASE-20
        case CASE_20_SETTLE_DOCKED "Recovery accepts MR fallback C20":
          assume phase_state.current_phase == 4 [s32] & mission_candidate.proposed_reason == 20 [s32];
          guarantee resolved_atomic_result.command == 0 [s32] & resolved_atomic_result.next_phase == 0 [s32] &
            resolved_atomic_result.reason == 20 [s32];
    }*/
  }

  // @trace PART-08
  part def Atomic_Publication :> Thread {
    // @trace INT-18
    port atomic_result : DataPort { in :>> type : Atomic_Supervisor_Result; }
    // @trace CTRL-01
    port publication : DataPort { out :>> type : Published_Supervisor_Result; }
    language "GUMBO" /*{
      initialize
        // @trace BEH-04
        guarantee AP_INITIAL_SAFE "AP initializes actuators disabled and stowed":
          publication.laser == 1 [s32] & publication.drones == 0 [s32];
      compute
        // @trace BEH-05
        guarantee AP_ATOMIC_PRESERVATION "AP exposes every AS-owned result field without substitution":
          publication.command == atomic_result.command &
          publication.current_phase == atomic_result.current_phase &
          publication.next_phase == atomic_result.next_phase &
          publication.reason == atomic_result.reason &
          publication.fault == atomic_result.fault &
          publication.next_valid_streak == atomic_result.next_valid_streak &
          publication.cargo_advisory == atomic_result.cargo_advisory &
          publication.capacitor_advisory == atomic_result.capacitor_advisory &
          publication.retreat_advisory == atomic_result.retreat_advisory;
        // @trace BEH-04
        guarantee AP_ACTUATOR_MAPPING "AP derives Mine, Defend, and all-other actuator postures exactly":
          '->:'(atomic_result.command == 2 [s32],
                publication.laser == 0 [s32] & publication.drones == 1 [s32]) &
          '->:'(atomic_result.command == 4 [s32],
                publication.laser == 1 [s32] & publication.drones == 2 [s32]) &
          '->:'(not (atomic_result.command == 2 [s32]) & not (atomic_result.command == 4 [s32]),
                publication.laser == 1 [s32] & publication.drones == 0 [s32]);
    }*/
  }

  // @trace GENERATED-SUPPORT-03
  // @generated-support behavior-free container for the approved eight usages
  part def Supervisor_Process :> Process {
    // @trace GENERATED-SUPPORT-01
    port raw_threat : DataPort { in :>> type : Raw_Threat_Observation; }
    // @trace GENERATED-SUPPORT-01
    port raw_resources : DataPort { in :>> type : Raw_Resource_Observation; }
    // @trace GENERATED-SUPPORT-01
    port raw_mission : DataPort { in :>> type : Raw_Mission_Observation; }
    // @trace GENERATED-SUPPORT-02
    port threat_state : DataPort { in :>> type : Threat_State_Input; }
    // @trace GENERATED-SUPPORT-02
    port phase_state : DataPort { in :>> type : Phase_State_Input; }
    // @trace GENERATED-SUPPORT-02
    port publication : DataPort { out :>> type : Published_Supervisor_Result; }

    // @trace PART-01
    part fa : Fault_Assessment;
    // @trace PART-02
    part tq : Threat_Qualification;
    // @trace PART-03
    part rq : Resource_Qualification;
    // @trace PART-04
    part pq : Personnel_Mission_Qualification;
    // @trace PART-05
    part mr : Mission_Recovery_Decision;
    // @trace PART-06
    part tr : Threat_Retreat_Decision;
    // @trace PART-07
    part arb : Priority_Phase_Arbitration;
    // @trace PART-08
    part ap : Atomic_Publication;

    // @trace GENERATED-SUPPORT-01
    connection support_raw_threat : PortConnection connect raw_threat to tq.raw_threat;
    // @trace GENERATED-SUPPORT-01
    connection support_raw_resources : PortConnection connect raw_resources to rq.raw_resources;
    // @trace GENERATED-SUPPORT-01
    connection support_raw_mission : PortConnection connect raw_mission to pq.raw_mission;
    // @trace GENERATED-SUPPORT-02
    connection support_threat_state : PortConnection connect threat_state to tq.streak_state;
    // @trace GENERATED-SUPPORT-02
    connection support_phase_state : PortConnection connect phase_state to arb.phase_state;

    // @trace INT-01
    connection int_01 : PortConnection connect arb.phase_context to mr.phase_context;
    // @trace INT-02
    connection int_02 : PortConnection connect arb.phase_context to tr.phase_context;
    // @trace INT-03
    connection int_03 : PortConnection connect tq.qualified_threat to mr.threat_fact;
    // @trace INT-04
    connection int_04 : PortConnection connect tq.qualified_threat to tr.threat_fact;
    // @trace INT-05
    connection int_05 : PortConnection connect rq.mining_recovery_facts to mr.resource_facts;
    // @trace INT-06
    connection int_06 : PortConnection connect rq.defense_facts to tr.defense_facts;
    // @trace INT-07
    connection int_07 : PortConnection connect pq.mission_facts to mr.mission_facts;
    // @trace INT-08
    connection int_08 : PortConnection connect pq.arrival_fact to tr.arrival_fact;
    // @trace INT-09
    connection int_09 : PortConnection connect mr.mission_proposal to arb.mission_candidate;
    // @trace INT-10
    connection int_10 : PortConnection connect tr.response_proposal to arb.response_candidate;
    // @trace INT-11
    connection int_11 : PortConnection connect tq.threat_publication to arb.threat_publication;
    // @trace INT-12
    connection int_12 : PortConnection connect rq.resource_publication to arb.resource_publication;
    // @trace INT-13
    connection int_13 : PortConnection connect pq.mission_invalidity to fa.mission_invalidity;
    // @trace INT-14
    connection int_14 : PortConnection connect tq.threat_invalidity to fa.threat_invalidity;
    // @trace INT-15
    connection int_15 : PortConnection connect rq.resource_invalidity to fa.resource_invalidity;
    // @trace INT-16
    connection int_16 : PortConnection connect arb.phase_context to fa.phase_context;
    // @trace INT-17
    connection int_17 : PortConnection connect fa.fault to arb.fault;
    // @trace INT-18
    connection int_18 : PortConnection connect arb.resolved_atomic_result to ap.atomic_result;

    // @trace GENERATED-SUPPORT-02
    connection support_publication : PortConnection connect ap.publication to publication;
  }

  // @trace BOUNDARY-01
  part def Mining_Threat_Retreat_Supervisor_Root :> System {
    // @trace GENERATED-SUPPORT-01
    port raw_threat : DataPort { in :>> type : Raw_Threat_Observation; }
    // @trace GENERATED-SUPPORT-01
    port raw_resources : DataPort { in :>> type : Raw_Resource_Observation; }
    // @trace GENERATED-SUPPORT-01
    port raw_mission : DataPort { in :>> type : Raw_Mission_Observation; }
    // @trace MON-01
    port threat_state : DataPort { in :>> type : Threat_State_Input; }
    // @trace MON-01
    port phase_state : DataPort { in :>> type : Phase_State_Input; }
    // @trace GENERATED-SUPPORT-02
    port publication : DataPort { out :>> type : Published_Supervisor_Result; }

    // @trace GENERATED-SUPPORT-03
    part supervisor : Supervisor_Process;

    // @trace GENERATED-SUPPORT-01
    connection boundary_raw_threat : PortConnection connect raw_threat to supervisor.raw_threat;
    // @trace GENERATED-SUPPORT-01
    connection boundary_raw_resources : PortConnection connect raw_resources to supervisor.raw_resources;
    // @trace GENERATED-SUPPORT-01
    connection boundary_raw_mission : PortConnection connect raw_mission to supervisor.raw_mission;
    // @trace GENERATED-SUPPORT-02
    connection boundary_threat_state : PortConnection connect threat_state to supervisor.threat_state;
    // @trace GENERATED-SUPPORT-02
    connection boundary_phase_state : PortConnection connect phase_state to supervisor.phase_state;
    // @trace GENERATED-SUPPORT-02
    connection boundary_publication : PortConnection connect supervisor.publication to publication;
  }

  // @trace BOUND-05
  part mining_threat_retreat_supervisor : Mining_Threat_Retreat_Supervisor_Root;
}
