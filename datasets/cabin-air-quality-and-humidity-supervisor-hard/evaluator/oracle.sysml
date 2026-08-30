// Canonical final source: retained architecture plus approved local GUMBO behavior.
// @trace PURPOSE-01
package Cabin_Air_Quality_Humidity_Supervisor {
  private import HAMR::*;

  // @trace MON-01
  enum def Validity { enum Valid; enum Invalid; }
  // @trace MON-01
  enum def Arrival { enum New; enum Held; }
  // @trace MON-01
  enum def EnableChoice { enum On; enum Off; }
  // @trace MON-01
  enum def FilterPolicy { enum Automatic; enum Continuous; }
  // @trace MON-01
  enum def HumidityPolicy { enum Automatic; enum Disabled; }
  // @trace MON-01
  enum def RoutineAirflow { enum Off; enum Low; enum High; }
  // @trace MON-02
  enum def AirCondition { enum Clean; enum Loaded; }
  // @trace MON-03
  enum def HumidityCondition { enum Dry; enum Acceptable; enum Damp; }
  // Tool-required one-to-one field projections keep the four independently
  // inspected MON-04 positions distinct without changing their finite values.
  // @trace MON-04
  enum def BlowerReadiness { enum Ready; enum Failed; enum Unknown; }
  // @trace MON-04
  enum def FilterUnitReadiness { enum Ready; enum Failed; enum Unknown; }
  // @trace MON-04
  enum def HumidifierReadiness { enum Ready; enum Failed; enum Unknown; }
  // @trace MON-04
  enum def DehumidifierReadiness { enum Ready; enum Failed; enum Unknown; }
  // @trace MON-05
  enum def PathGrant { enum Granted; enum Reserved; }

  // @trace PART-01
  enum def CandidateClass { enum Invalid; enum Held; enum FreshDisabled; enum FreshEnabled; }
  // @trace PART-02
  enum def AirEvidence { enum Invalid; enum Clean; enum FilterDemand; }
  // @trace PART-03
  enum def HumidityEvidence { enum Invalid; enum Dry; enum None; enum Damp; }
  // @trace PART-04
  enum def PathDisposition { enum Usable; enum Reserved; enum Untrusted; }
  // Tool-required one-to-one projections keep every concurrently inspected
  // PART-05 payload position distinct.  Each preserves the approved
  // Ready/Failed/Unknown/Untrusted domain exactly and receives no owner credit.
  // @trace PART-05
  enum def FilterBranchBlowerDisposition { enum Ready; enum Failed; enum Unknown; enum Untrusted; }
  // @trace PART-05
  enum def FilterBranchPathDisposition { enum Ready; enum Failed; enum Unknown; enum Untrusted; }
  // @trace PART-05
  enum def HumidityBranchBlowerDisposition { enum Ready; enum Failed; enum Unknown; enum Untrusted; }
  // @trace PART-05
  enum def HumidityBranchHumidifierDisposition { enum Ready; enum Failed; enum Unknown; enum Untrusted; }
  // @trace PART-05
  enum def HumidityBranchDehumidifierDisposition { enum Ready; enum Failed; enum Unknown; enum Untrusted; }
  // @trace PART-05
  enum def RoutineBranchBlowerDisposition { enum Ready; enum Failed; enum Unknown; enum Untrusted; }
  // @trace PART-05
  enum def ComposerBlowerDisposition { enum Ready; enum Failed; enum Unknown; enum Untrusted; }
  // @trace PART-05
  enum def ComposerFilterDisposition { enum Ready; enum Failed; enum Unknown; enum Untrusted; }
  // @trace PART-05
  enum def ComposerHumidifierDisposition { enum Ready; enum Failed; enum Unknown; enum Untrusted; }
  // @trace PART-05
  enum def ComposerDehumidifierDisposition { enum Ready; enum Failed; enum Unknown; enum Untrusted; }
  // @trace PART-06
  enum def TrustState { enum Trusted; enum Quarantined; enum Confirming; }
  // @trace PART-06
  enum def AirRecoveryEvent {
    enum AirStable; enum AirFaultEntered; enum AirFaultPersists;
    enum AirRecoveryStarted; enum AirFaultRecurred; enum AirRecovered;
  }
  // @trace PART-07
  enum def HumidityRecoveryEvent {
    enum HumidityStable; enum HumidityFaultEntered; enum HumidityFaultPersists;
    enum HumidityRecoveryStarted; enum HumidityFaultRecurred; enum HumidityRecovered;
  }
  // @trace PART-08
  enum def PreferenceEvent { enum RejectedInvalid; enum NoNewPreference; enum AcceptedDisabled; enum AcceptedEnabled; }
  // @trace PART-09
  enum def FilterProposal { enum None; enum Environmental; enum Continuous; enum Unavailable; }
  // @trace PART-10
  enum def HumidityProposal { enum None; enum Increase; enum Reduce; enum Unavailable; }
  // @trace PART-11
  enum def RoutineProposal { enum None; enum Low; enum High; enum Unavailable; }
  // @trace PART-12
  enum def SelectedIntent { enum None; enum Filter; enum Increase; enum Reduce; enum ExchangeAir; }
  // @trace CTRL-01
  enum def TreatmentAction { enum None; enum FilterAir; enum IncreaseHumidity; enum ReduceHumidity; enum ExchangeAir; }
  // @trace CTRL-01
  enum def FlowClass { enum Off; enum Routine; enum Treatment; }
  // @trace CTRL-01
  enum def AuthorityUse { enum None; enum SharedAirPath; }
  // @trace CTRL-02
  enum def SupervisorMode { enum Idle; enum Active; enum Degraded; enum ObservationHold; enum Inhibited; }
  // @trace CTRL-02
  enum def StatusCause {
    enum None; enum PreferenceDisabled; enum PreferenceRejected;
    enum AirTreatmentPriority; enum HumidityTreatmentPriority;
    enum AirObservationInvalid; enum HumidityObservationInvalid;
    enum AirRecovering; enum HumidityRecovering;
    enum AuthorityInvalid; enum AirPathReserved;
    enum EquipmentUnavailable; enum SelectedPathUnavailable;
  }

  // All record fields are attributes because final-stage GUMBO inspects them.
  // @trace MON-01
  part def UserAirPreference :> Data {
    attribute validity : Validity;
    attribute arrival : Arrival;
    attribute enable : EnableChoice;
    attribute filterPolicy : FilterPolicy;
    attribute humidityPolicy : HumidityPolicy;
    attribute routineAirflow : RoutineAirflow;
  }
  // @trace MON-02
  part def AirQualityObservation :> Data {
    attribute validity : Validity;
    attribute condition : AirCondition;
  }
  // @trace MON-03
  part def HumidityObservation :> Data {
    attribute validity : Validity;
    attribute condition : HumidityCondition;
  }
  // @trace MON-04
  part def AirTreatmentReadiness :> Data {
    attribute validity : Validity;
    attribute blowerReadiness : BlowerReadiness;
    attribute filterUnit : FilterUnitReadiness;
    attribute humidifier : HumidifierReadiness;
    attribute dehumidifier : DehumidifierReadiness;
  }
  // @trace MON-05
  part def SharedAirPathAuthority :> Data {
    attribute validity : Validity;
    attribute grant : PathGrant;
  }
  // @trace CTRL-01
  part def CabinAirTreatmentPlan :> Data {
    attribute treatmentAction : TreatmentAction;
    attribute flowClass : FlowClass;
    attribute authorityUse : AuthorityUse;
  }
  // @trace CTRL-02
  part def CabinAirSupervisorStatus :> Data {
    attribute mode : SupervisorMode;
    attribute cause : StatusCause;
  }
  // @trace PART-01
  part def QualifiedPreferenceCandidate :> Data {
    attribute candidateClass : CandidateClass;
    attribute enable : EnableChoice;
    attribute filterPolicy : FilterPolicy;
    attribute humidityPolicy : HumidityPolicy;
    attribute routineAirflow : RoutineAirflow;
  }
  // @trace PART-05
  part def FilterCapabilityFacts :> Data {
    attribute filterBlowerDisposition : FilterBranchBlowerDisposition;
    attribute filterDisposition : FilterBranchPathDisposition;
  }
  // @trace PART-05
  part def HumidityCapabilityFacts :> Data {
    attribute humidityBlowerDisposition : HumidityBranchBlowerDisposition;
    attribute humidifierDisposition : HumidityBranchHumidifierDisposition;
    attribute dehumidifierDisposition : HumidityBranchDehumidifierDisposition;
  }
  // @trace PART-05
  part def BlowerCapabilityFact :> Data {
    attribute routineBlowerDisposition : RoutineBranchBlowerDisposition;
  }
  // @trace PART-05
  part def CapabilitySet :> Data {
    attribute sharedBlowerDisposition : ComposerBlowerDisposition;
    attribute sharedFilterDisposition : ComposerFilterDisposition;
    attribute sharedHumidifierDisposition : ComposerHumidifierDisposition;
    attribute sharedDehumidifierDisposition : ComposerDehumidifierDisposition;
  }
  // @trace PART-06
  part def AirRecoveryReport :> Data {
    attribute trust : TrustState;
    attribute transitionEvent : AirRecoveryEvent;
    attribute evidence : AirEvidence;
    attribute gateOpen : Base_Types::Boolean;
  }
  // @trace PART-07
  part def HumidityRecoveryReport :> Data {
    attribute trust : TrustState;
    attribute transitionEvent : HumidityRecoveryEvent;
    attribute evidence : HumidityEvidence;
    attribute gateOpen : Base_Types::Boolean;
  }
  // @trace PART-08
  part def AcceptedPreference :> Data {
    attribute enable : EnableChoice;
    attribute filterPolicy : FilterPolicy;
    attribute humidityPolicy : HumidityPolicy;
    attribute routineAirflow : RoutineAirflow;
    attribute preferenceEvent : PreferenceEvent;
  }
  // @trace PART-09
  part def FilterProposalReport :> Data {
    attribute proposal : FilterProposal;
    attribute cause : StatusCause;
  }
  // @trace PART-10
  part def HumidityProposalReport :> Data {
    attribute proposal : HumidityProposal;
    attribute cause : StatusCause;
  }
  // @trace PART-11
  part def RoutineProposalReport :> Data {
    attribute proposal : RoutineProposal;
    attribute cause : StatusCause;
  }
  // @trace PART-12
  part def SelectionReport :> Data {
    attribute intent : SelectedIntent;
    attribute flowClass : FlowClass;
    attribute cause : StatusCause;
  }
  // @trace PART-13
  part def CompositionReport :> Data {
    attribute treatmentAction : TreatmentAction;
    attribute flowClass : FlowClass;
    attribute authorityUse : AuthorityUse;
    attribute cause : StatusCause;
  }

  // @trace PART-01
  part def PreferenceRequestQualifier :> Thread {
    // @trace INT-01
    port preference : DataPort { in :>> type : UserAirPreference; }
    // @trace INT-06
    port candidate : DataPort { out :>> type : QualifiedPreferenceCandidate; }

    language "GUMBO" /*{
      initialize
        // @trace CONSTR-01
        guarantee INITIAL_CANDIDATE_SAFE:
          candidate.candidateClass == CandidateClass.Invalid &
          candidate.enable == EnableChoice.Off &
          candidate.filterPolicy == FilterPolicy.Automatic &
          candidate.humidityPolicy == HumidityPolicy.Disabled &
          candidate.routineAirflow == RoutineAirflow.Off;
      compute
        // @trace PART-01
        guarantee QUALIFIED_PREFERENCE_CLASSIFICATION:
          candidate.enable == preference.enable &
          candidate.filterPolicy == preference.filterPolicy &
          candidate.humidityPolicy == preference.humidityPolicy &
          candidate.routineAirflow == preference.routineAirflow &
          ((preference.validity == Validity.Invalid &
            candidate.candidateClass == CandidateClass.Invalid) |
           (preference.validity == Validity.Valid &
            preference.arrival == Arrival.Held &
            candidate.candidateClass == CandidateClass.Held) |
           (preference.validity == Validity.Valid &
            preference.arrival == Arrival.New &
            preference.enable == EnableChoice.Off &
            candidate.candidateClass == CandidateClass.FreshDisabled) |
           (preference.validity == Validity.Valid &
            preference.arrival == Arrival.New &
            preference.enable == EnableChoice.On &
            candidate.candidateClass == CandidateClass.FreshEnabled));
    }*/
  }
  // @trace PART-02
  part def AirQualityNeedAssessor :> Thread {
    // @trace INT-02
    port observation : DataPort { in :>> type : AirQualityObservation; }
    // @trace INT-07
    port evidence : DataPort { out :>> type : AirEvidence; }

    language "GUMBO" /*{
      initialize
        // @trace CONSTR-01
        guarantee INITIAL_AIR_EVIDENCE_SAFE: evidence == AirEvidence.Invalid;
      compute
        // @trace PART-02
        guarantee AIR_EVIDENCE_CLASSIFICATION:
          ((observation.validity == Validity.Invalid & evidence == AirEvidence.Invalid) |
           (observation.validity == Validity.Valid &
            observation.condition == AirCondition.Clean & evidence == AirEvidence.Clean) |
           (observation.validity == Validity.Valid &
            observation.condition == AirCondition.Loaded & evidence == AirEvidence.FilterDemand));
    }*/
  }
  // @trace PART-03
  part def HumidityNeedAssessor :> Thread {
    // @trace INT-03
    port observation : DataPort { in :>> type : HumidityObservation; }
    // @trace INT-08
    port evidence : DataPort { out :>> type : HumidityEvidence; }

    language "GUMBO" /*{
      initialize
        // @trace CONSTR-01
        guarantee INITIAL_HUMIDITY_EVIDENCE_SAFE: evidence == HumidityEvidence.Invalid;
      compute
        // @trace PART-03
        guarantee HUMIDITY_EVIDENCE_CLASSIFICATION:
          ((observation.validity == Validity.Invalid & evidence == HumidityEvidence.Invalid) |
           (observation.validity == Validity.Valid &
            observation.condition == HumidityCondition.Dry & evidence == HumidityEvidence.Dry) |
           (observation.validity == Validity.Valid &
            observation.condition == HumidityCondition.Acceptable & evidence == HumidityEvidence.None) |
           (observation.validity == Validity.Valid &
            observation.condition == HumidityCondition.Damp & evidence == HumidityEvidence.Damp));
    }*/
  }
  // @trace PART-04
  part def SharedPathAuthorityAssessor :> Thread {
    // @trace INT-04
    port authority : DataPort { in :>> type : SharedAirPathAuthority; }
    // @trace INT-13
    port disposition_to_routine : DataPort { out :>> type : PathDisposition; }
    // @trace INT-14
    port disposition_to_composer : DataPort { out :>> type : PathDisposition; }

    language "GUMBO" /*{
      initialize
        // @trace CONSTR-01
        guarantee INITIAL_PATH_UNTRUSTED:
          disposition_to_routine == PathDisposition.Untrusted &
          disposition_to_composer == PathDisposition.Untrusted;
      compute
        // @trace PART-04
        guarantee PATH_DISPOSITION_CLASSIFICATION:
          disposition_to_routine == disposition_to_composer &
          ((authority.validity == Validity.Invalid &
            disposition_to_routine == PathDisposition.Untrusted) |
           (authority.validity == Validity.Valid & authority.grant == PathGrant.Reserved &
            disposition_to_routine == PathDisposition.Reserved) |
           (authority.validity == Validity.Valid & authority.grant == PathGrant.Granted &
            disposition_to_routine == PathDisposition.Usable));
    }*/
  }
  // @trace PART-05
  part def TreatmentCapabilityAssessor :> Thread {
    // @trace INT-05
    port readiness : DataPort { in :>> type : AirTreatmentReadiness; }
    // @trace INT-09
    port filter_facts : DataPort { out :>> type : FilterCapabilityFacts; }
    // @trace INT-10
    port humidity_facts : DataPort { out :>> type : HumidityCapabilityFacts; }
    // @trace INT-11
    port blower_fact : DataPort { out :>> type : BlowerCapabilityFact; }
    // @trace INT-12
    port capability_set : DataPort { out :>> type : CapabilitySet; }

    language "GUMBO" /*{
      initialize
        // @trace CONSTR-01
        guarantee INITIAL_CAPABILITIES_UNTRUSTED:
          capability_set.sharedBlowerDisposition == ComposerBlowerDisposition.Untrusted &
          capability_set.sharedFilterDisposition == ComposerFilterDisposition.Untrusted &
          capability_set.sharedHumidifierDisposition == ComposerHumidifierDisposition.Untrusted &
          capability_set.sharedDehumidifierDisposition == ComposerDehumidifierDisposition.Untrusted &
          filter_facts.filterBlowerDisposition == FilterBranchBlowerDisposition.Untrusted &
          filter_facts.filterDisposition == FilterBranchPathDisposition.Untrusted &
          humidity_facts.humidityBlowerDisposition == HumidityBranchBlowerDisposition.Untrusted &
          humidity_facts.humidifierDisposition == HumidityBranchHumidifierDisposition.Untrusted &
          humidity_facts.dehumidifierDisposition == HumidityBranchDehumidifierDisposition.Untrusted &
          blower_fact.routineBlowerDisposition == RoutineBranchBlowerDisposition.Untrusted;
      compute
        // @trace CAP-REL-01
        guarantee CAPABILITY_FANOUT_COHERENCE:
          (((capability_set.sharedBlowerDisposition == ComposerBlowerDisposition.Ready &
             filter_facts.filterBlowerDisposition == FilterBranchBlowerDisposition.Ready) |
            (capability_set.sharedBlowerDisposition == ComposerBlowerDisposition.Failed &
             filter_facts.filterBlowerDisposition == FilterBranchBlowerDisposition.Failed) |
            (capability_set.sharedBlowerDisposition == ComposerBlowerDisposition.Unknown &
             filter_facts.filterBlowerDisposition == FilterBranchBlowerDisposition.Unknown) |
            (capability_set.sharedBlowerDisposition == ComposerBlowerDisposition.Untrusted &
             filter_facts.filterBlowerDisposition == FilterBranchBlowerDisposition.Untrusted)) &
           ((capability_set.sharedBlowerDisposition == ComposerBlowerDisposition.Ready &
             humidity_facts.humidityBlowerDisposition == HumidityBranchBlowerDisposition.Ready) |
            (capability_set.sharedBlowerDisposition == ComposerBlowerDisposition.Failed &
             humidity_facts.humidityBlowerDisposition == HumidityBranchBlowerDisposition.Failed) |
            (capability_set.sharedBlowerDisposition == ComposerBlowerDisposition.Unknown &
             humidity_facts.humidityBlowerDisposition == HumidityBranchBlowerDisposition.Unknown) |
            (capability_set.sharedBlowerDisposition == ComposerBlowerDisposition.Untrusted &
             humidity_facts.humidityBlowerDisposition == HumidityBranchBlowerDisposition.Untrusted)) &
           ((capability_set.sharedBlowerDisposition == ComposerBlowerDisposition.Ready &
             blower_fact.routineBlowerDisposition == RoutineBranchBlowerDisposition.Ready) |
            (capability_set.sharedBlowerDisposition == ComposerBlowerDisposition.Failed &
             blower_fact.routineBlowerDisposition == RoutineBranchBlowerDisposition.Failed) |
            (capability_set.sharedBlowerDisposition == ComposerBlowerDisposition.Unknown &
             blower_fact.routineBlowerDisposition == RoutineBranchBlowerDisposition.Unknown) |
            (capability_set.sharedBlowerDisposition == ComposerBlowerDisposition.Untrusted &
             blower_fact.routineBlowerDisposition == RoutineBranchBlowerDisposition.Untrusted)) &
           ((capability_set.sharedFilterDisposition == ComposerFilterDisposition.Ready &
             filter_facts.filterDisposition == FilterBranchPathDisposition.Ready) |
            (capability_set.sharedFilterDisposition == ComposerFilterDisposition.Failed &
             filter_facts.filterDisposition == FilterBranchPathDisposition.Failed) |
            (capability_set.sharedFilterDisposition == ComposerFilterDisposition.Unknown &
             filter_facts.filterDisposition == FilterBranchPathDisposition.Unknown) |
            (capability_set.sharedFilterDisposition == ComposerFilterDisposition.Untrusted &
             filter_facts.filterDisposition == FilterBranchPathDisposition.Untrusted)) &
           ((capability_set.sharedHumidifierDisposition == ComposerHumidifierDisposition.Ready &
             humidity_facts.humidifierDisposition == HumidityBranchHumidifierDisposition.Ready) |
            (capability_set.sharedHumidifierDisposition == ComposerHumidifierDisposition.Failed &
             humidity_facts.humidifierDisposition == HumidityBranchHumidifierDisposition.Failed) |
            (capability_set.sharedHumidifierDisposition == ComposerHumidifierDisposition.Unknown &
             humidity_facts.humidifierDisposition == HumidityBranchHumidifierDisposition.Unknown) |
            (capability_set.sharedHumidifierDisposition == ComposerHumidifierDisposition.Untrusted &
             humidity_facts.humidifierDisposition == HumidityBranchHumidifierDisposition.Untrusted)) &
           ((capability_set.sharedDehumidifierDisposition == ComposerDehumidifierDisposition.Ready &
             humidity_facts.dehumidifierDisposition == HumidityBranchDehumidifierDisposition.Ready) |
            (capability_set.sharedDehumidifierDisposition == ComposerDehumidifierDisposition.Failed &
             humidity_facts.dehumidifierDisposition == HumidityBranchDehumidifierDisposition.Failed) |
            (capability_set.sharedDehumidifierDisposition == ComposerDehumidifierDisposition.Unknown &
             humidity_facts.dehumidifierDisposition == HumidityBranchDehumidifierDisposition.Unknown) |
            (capability_set.sharedDehumidifierDisposition == ComposerDehumidifierDisposition.Untrusted &
             humidity_facts.dehumidifierDisposition == HumidityBranchDehumidifierDisposition.Untrusted)));
        // @trace CAP-REL-01
        guarantee BLOWER_CAPABILITY_CLASSIFICATION:
          ((readiness.validity == Validity.Invalid &
            capability_set.sharedBlowerDisposition == ComposerBlowerDisposition.Untrusted) |
           (readiness.validity == Validity.Valid & readiness.blowerReadiness == BlowerReadiness.Ready &
            capability_set.sharedBlowerDisposition == ComposerBlowerDisposition.Ready) |
           (readiness.validity == Validity.Valid & readiness.blowerReadiness == BlowerReadiness.Failed &
            capability_set.sharedBlowerDisposition == ComposerBlowerDisposition.Failed) |
           (readiness.validity == Validity.Valid & readiness.blowerReadiness == BlowerReadiness.Unknown &
            capability_set.sharedBlowerDisposition == ComposerBlowerDisposition.Unknown));
        // @trace CAP-REL-01
        guarantee FILTER_CAPABILITY_CLASSIFICATION:
          ((readiness.validity == Validity.Invalid &
            capability_set.sharedFilterDisposition == ComposerFilterDisposition.Untrusted) |
           (readiness.validity == Validity.Valid & readiness.filterUnit == FilterUnitReadiness.Ready &
            capability_set.sharedFilterDisposition == ComposerFilterDisposition.Ready) |
           (readiness.validity == Validity.Valid & readiness.filterUnit == FilterUnitReadiness.Failed &
            capability_set.sharedFilterDisposition == ComposerFilterDisposition.Failed) |
           (readiness.validity == Validity.Valid & readiness.filterUnit == FilterUnitReadiness.Unknown &
            capability_set.sharedFilterDisposition == ComposerFilterDisposition.Unknown));
        // @trace CAP-REL-01
        guarantee HUMIDIFIER_CAPABILITY_CLASSIFICATION:
          ((readiness.validity == Validity.Invalid &
            capability_set.sharedHumidifierDisposition == ComposerHumidifierDisposition.Untrusted) |
           (readiness.validity == Validity.Valid & readiness.humidifier == HumidifierReadiness.Ready &
            capability_set.sharedHumidifierDisposition == ComposerHumidifierDisposition.Ready) |
           (readiness.validity == Validity.Valid & readiness.humidifier == HumidifierReadiness.Failed &
            capability_set.sharedHumidifierDisposition == ComposerHumidifierDisposition.Failed) |
           (readiness.validity == Validity.Valid & readiness.humidifier == HumidifierReadiness.Unknown &
            capability_set.sharedHumidifierDisposition == ComposerHumidifierDisposition.Unknown));
        // @trace CAP-REL-01
        guarantee DEHUMIDIFIER_CAPABILITY_CLASSIFICATION:
          ((readiness.validity == Validity.Invalid &
            capability_set.sharedDehumidifierDisposition == ComposerDehumidifierDisposition.Untrusted) |
           (readiness.validity == Validity.Valid & readiness.dehumidifier == DehumidifierReadiness.Ready &
            capability_set.sharedDehumidifierDisposition == ComposerDehumidifierDisposition.Ready) |
           (readiness.validity == Validity.Valid & readiness.dehumidifier == DehumidifierReadiness.Failed &
            capability_set.sharedDehumidifierDisposition == ComposerDehumidifierDisposition.Failed) |
           (readiness.validity == Validity.Valid & readiness.dehumidifier == DehumidifierReadiness.Unknown &
            capability_set.sharedDehumidifierDisposition == ComposerDehumidifierDisposition.Unknown));
    }*/
  }
  // @trace PART-06
  part def AirEvidenceRecoveryOwner :> Thread {
    // @trace INT-07
    port evidence : DataPort { in :>> type : AirEvidence; }
    // @trace INT-15
    port report_to_filter : DataPort { out :>> type : AirRecoveryReport; }
    // @trace INT-27
    port report_to_status : DataPort { out :>> type : AirRecoveryReport; }

    language "GUMBO" /*{
      state
        // @trace PART-06
        airTrustMemory: TrustState;
      initialize
        modifies airTrustMemory;
        // @trace CONSTR-01
        guarantee INITIAL_AIR_TRUST_SAFE:
          airTrustMemory == TrustState.Trusted &
          report_to_filter.trust == TrustState.Trusted &
          report_to_filter.transitionEvent == AirRecoveryEvent.AirStable &
          report_to_filter.evidence == AirEvidence.Clean &
          report_to_filter.gateOpen == F &
          report_to_status.trust == report_to_filter.trust &
          report_to_status.transitionEvent == report_to_filter.transitionEvent &
          report_to_status.evidence == report_to_filter.evidence &
          report_to_status.gateOpen == report_to_filter.gateOpen;
      compute
        modifies airTrustMemory;
        // @trace PART-06
        guarantee AIR_REPORT_FANOUT:
          report_to_filter.trust == airTrustMemory &
          report_to_filter.evidence == evidence &
          report_to_status.trust == report_to_filter.trust &
          report_to_status.transitionEvent == report_to_filter.transitionEvent &
          report_to_status.evidence == report_to_filter.evidence &
          report_to_status.gateOpen == report_to_filter.gateOpen;
        compute_cases
          // @trace CASE-05
          case CASE_05_AIR_FAULT_ENTERED:
            assume In(airTrustMemory) == TrustState.Trusted & evidence == AirEvidence.Invalid;
            guarantee airTrustMemory == TrustState.Quarantined &
              report_to_filter.gateOpen == F &
              report_to_filter.transitionEvent == AirRecoveryEvent.AirFaultEntered;
          // @trace CASE-06
          case CASE_06_AIR_STABLE:
            assume In(airTrustMemory) == TrustState.Trusted & evidence != AirEvidence.Invalid;
            guarantee airTrustMemory == TrustState.Trusted &
              report_to_filter.gateOpen == T &
              report_to_filter.transitionEvent == AirRecoveryEvent.AirStable;
          // @trace CASE-07
          case CASE_07_AIR_FAULT_PERSISTS:
            assume In(airTrustMemory) == TrustState.Quarantined & evidence == AirEvidence.Invalid;
            guarantee airTrustMemory == TrustState.Quarantined &
              report_to_filter.gateOpen == F &
              report_to_filter.transitionEvent == AirRecoveryEvent.AirFaultPersists;
          // @trace CASE-08
          case CASE_08_AIR_RECOVERY_STARTED:
            assume In(airTrustMemory) == TrustState.Quarantined & evidence != AirEvidence.Invalid;
            guarantee airTrustMemory == TrustState.Confirming &
              report_to_filter.gateOpen == F &
              report_to_filter.transitionEvent == AirRecoveryEvent.AirRecoveryStarted;
          // @trace CASE-09
          case CASE_09_AIR_FAULT_RECURRED:
            assume In(airTrustMemory) == TrustState.Confirming & evidence == AirEvidence.Invalid;
            guarantee airTrustMemory == TrustState.Quarantined &
              report_to_filter.gateOpen == F &
              report_to_filter.transitionEvent == AirRecoveryEvent.AirFaultRecurred;
          // @trace CASE-10
          case CASE_10_AIR_RECOVERED:
            assume In(airTrustMemory) == TrustState.Confirming & evidence != AirEvidence.Invalid;
            guarantee airTrustMemory == TrustState.Trusted &
              report_to_filter.gateOpen == T &
              report_to_filter.transitionEvent == AirRecoveryEvent.AirRecovered;
    }*/
  }
  // @trace PART-07
  part def HumidityEvidenceRecoveryOwner :> Thread {
    // @trace INT-08
    port evidence : DataPort { in :>> type : HumidityEvidence; }
    // @trace INT-16
    port report_to_humidity : DataPort { out :>> type : HumidityRecoveryReport; }
    // @trace INT-28
    port report_to_status : DataPort { out :>> type : HumidityRecoveryReport; }

    language "GUMBO" /*{
      state
        // @trace PART-07
        humidityTrustMemory: TrustState;
      initialize
        modifies humidityTrustMemory;
        // @trace CONSTR-01
        guarantee INITIAL_HUMIDITY_TRUST_SAFE:
          humidityTrustMemory == TrustState.Trusted &
          report_to_humidity.trust == TrustState.Trusted &
          report_to_humidity.transitionEvent == HumidityRecoveryEvent.HumidityStable &
          report_to_humidity.evidence == HumidityEvidence.None &
          report_to_humidity.gateOpen == F &
          report_to_status.trust == report_to_humidity.trust &
          report_to_status.transitionEvent == report_to_humidity.transitionEvent &
          report_to_status.evidence == report_to_humidity.evidence &
          report_to_status.gateOpen == report_to_humidity.gateOpen;
      compute
        modifies humidityTrustMemory;
        // @trace PART-07
        guarantee HUMIDITY_REPORT_FANOUT:
          report_to_humidity.trust == humidityTrustMemory &
          report_to_humidity.evidence == evidence &
          report_to_status.trust == report_to_humidity.trust &
          report_to_status.transitionEvent == report_to_humidity.transitionEvent &
          report_to_status.evidence == report_to_humidity.evidence &
          report_to_status.gateOpen == report_to_humidity.gateOpen;
        compute_cases
          // @trace CASE-11
          case CASE_11_HUMIDITY_FAULT_ENTERED:
            assume In(humidityTrustMemory) == TrustState.Trusted & evidence == HumidityEvidence.Invalid;
            guarantee humidityTrustMemory == TrustState.Quarantined &
              report_to_humidity.gateOpen == F &
              report_to_humidity.transitionEvent == HumidityRecoveryEvent.HumidityFaultEntered;
          // @trace CASE-12
          case CASE_12_HUMIDITY_STABLE:
            assume In(humidityTrustMemory) == TrustState.Trusted & evidence != HumidityEvidence.Invalid;
            guarantee humidityTrustMemory == TrustState.Trusted &
              report_to_humidity.gateOpen == T &
              report_to_humidity.transitionEvent == HumidityRecoveryEvent.HumidityStable;
          // @trace CASE-13
          case CASE_13_HUMIDITY_FAULT_PERSISTS:
            assume In(humidityTrustMemory) == TrustState.Quarantined & evidence == HumidityEvidence.Invalid;
            guarantee humidityTrustMemory == TrustState.Quarantined &
              report_to_humidity.gateOpen == F &
              report_to_humidity.transitionEvent == HumidityRecoveryEvent.HumidityFaultPersists;
          // @trace CASE-14
          case CASE_14_HUMIDITY_RECOVERY_STARTED:
            assume In(humidityTrustMemory) == TrustState.Quarantined & evidence != HumidityEvidence.Invalid;
            guarantee humidityTrustMemory == TrustState.Confirming &
              report_to_humidity.gateOpen == F &
              report_to_humidity.transitionEvent == HumidityRecoveryEvent.HumidityRecoveryStarted;
          // @trace CASE-15
          case CASE_15_HUMIDITY_FAULT_RECURRED:
            assume In(humidityTrustMemory) == TrustState.Confirming & evidence == HumidityEvidence.Invalid;
            guarantee humidityTrustMemory == TrustState.Quarantined &
              report_to_humidity.gateOpen == F &
              report_to_humidity.transitionEvent == HumidityRecoveryEvent.HumidityFaultRecurred;
          // @trace CASE-16
          case CASE_16_HUMIDITY_RECOVERED:
            assume In(humidityTrustMemory) == TrustState.Confirming & evidence != HumidityEvidence.Invalid;
            guarantee humidityTrustMemory == TrustState.Trusted &
              report_to_humidity.gateOpen == T &
              report_to_humidity.transitionEvent == HumidityRecoveryEvent.HumidityRecovered;
    }*/
  }
  // @trace PART-08
  part def PreferenceSessionOwner :> Thread {
    // @trace INT-06
    port candidate : DataPort { in :>> type : QualifiedPreferenceCandidate; }
    // @trace INT-17
    port accepted_to_filter : DataPort { out :>> type : AcceptedPreference; }
    // @trace INT-18
    port accepted_to_humidity : DataPort { out :>> type : AcceptedPreference; }
    // @trace INT-19
    port accepted_to_routine : DataPort { out :>> type : AcceptedPreference; }
    // @trace INT-20
    port accepted_to_arbiter : DataPort { out :>> type : AcceptedPreference; }
    // @trace INT-29
    port accepted_to_status : DataPort { out :>> type : AcceptedPreference; }

    language "GUMBO" /*{
      state
        // @trace PART-08
        acceptedEnableMemory: EnableChoice;
        // @trace PART-08
        acceptedFilterPolicyMemory: FilterPolicy;
        // @trace PART-08
        acceptedHumidityPolicyMemory: HumidityPolicy;
        // @trace PART-08
        acceptedRoutineAirflowMemory: RoutineAirflow;
      initialize
        modifies acceptedEnableMemory, acceptedFilterPolicyMemory,
          acceptedHumidityPolicyMemory, acceptedRoutineAirflowMemory;
        // @trace CONSTR-01
        guarantee INITIAL_ACCEPTED_PREFERENCE_DISABLED:
          acceptedEnableMemory == EnableChoice.Off &
          acceptedFilterPolicyMemory == FilterPolicy.Automatic &
          acceptedHumidityPolicyMemory == HumidityPolicy.Disabled &
          acceptedRoutineAirflowMemory == RoutineAirflow.Off &
          accepted_to_filter.enable == EnableChoice.Off &
          accepted_to_filter.filterPolicy == FilterPolicy.Automatic &
          accepted_to_filter.humidityPolicy == HumidityPolicy.Disabled &
          accepted_to_filter.routineAirflow == RoutineAirflow.Off &
          accepted_to_filter.preferenceEvent == PreferenceEvent.AcceptedDisabled &
          accepted_to_humidity.enable == accepted_to_filter.enable &
          accepted_to_humidity.filterPolicy == accepted_to_filter.filterPolicy &
          accepted_to_humidity.humidityPolicy == accepted_to_filter.humidityPolicy &
          accepted_to_humidity.routineAirflow == accepted_to_filter.routineAirflow &
          accepted_to_humidity.preferenceEvent == accepted_to_filter.preferenceEvent &
          accepted_to_routine.enable == accepted_to_filter.enable &
          accepted_to_routine.filterPolicy == accepted_to_filter.filterPolicy &
          accepted_to_routine.humidityPolicy == accepted_to_filter.humidityPolicy &
          accepted_to_routine.routineAirflow == accepted_to_filter.routineAirflow &
          accepted_to_routine.preferenceEvent == accepted_to_filter.preferenceEvent &
          accepted_to_arbiter.enable == accepted_to_filter.enable &
          accepted_to_arbiter.filterPolicy == accepted_to_filter.filterPolicy &
          accepted_to_arbiter.humidityPolicy == accepted_to_filter.humidityPolicy &
          accepted_to_arbiter.routineAirflow == accepted_to_filter.routineAirflow &
          accepted_to_arbiter.preferenceEvent == accepted_to_filter.preferenceEvent &
          accepted_to_status.enable == accepted_to_filter.enable &
          accepted_to_status.filterPolicy == accepted_to_filter.filterPolicy &
          accepted_to_status.humidityPolicy == accepted_to_filter.humidityPolicy &
          accepted_to_status.routineAirflow == accepted_to_filter.routineAirflow &
          accepted_to_status.preferenceEvent == accepted_to_filter.preferenceEvent;
      compute
        modifies acceptedEnableMemory, acceptedFilterPolicyMemory,
          acceptedHumidityPolicyMemory, acceptedRoutineAirflowMemory;
        // @trace PART-08
        guarantee ACCEPTED_PREFERENCE_FANOUT:
          accepted_to_filter.enable == acceptedEnableMemory &
          accepted_to_filter.filterPolicy == acceptedFilterPolicyMemory &
          accepted_to_filter.humidityPolicy == acceptedHumidityPolicyMemory &
          accepted_to_filter.routineAirflow == acceptedRoutineAirflowMemory &
          accepted_to_humidity.enable == accepted_to_filter.enable &
          accepted_to_humidity.filterPolicy == accepted_to_filter.filterPolicy &
          accepted_to_humidity.humidityPolicy == accepted_to_filter.humidityPolicy &
          accepted_to_humidity.routineAirflow == accepted_to_filter.routineAirflow &
          accepted_to_humidity.preferenceEvent == accepted_to_filter.preferenceEvent &
          accepted_to_routine.enable == accepted_to_filter.enable &
          accepted_to_routine.filterPolicy == accepted_to_filter.filterPolicy &
          accepted_to_routine.humidityPolicy == accepted_to_filter.humidityPolicy &
          accepted_to_routine.routineAirflow == accepted_to_filter.routineAirflow &
          accepted_to_routine.preferenceEvent == accepted_to_filter.preferenceEvent &
          accepted_to_arbiter.enable == accepted_to_filter.enable &
          accepted_to_arbiter.filterPolicy == accepted_to_filter.filterPolicy &
          accepted_to_arbiter.humidityPolicy == accepted_to_filter.humidityPolicy &
          accepted_to_arbiter.routineAirflow == accepted_to_filter.routineAirflow &
          accepted_to_arbiter.preferenceEvent == accepted_to_filter.preferenceEvent &
          accepted_to_status.enable == accepted_to_filter.enable &
          accepted_to_status.filterPolicy == accepted_to_filter.filterPolicy &
          accepted_to_status.humidityPolicy == accepted_to_filter.humidityPolicy &
          accepted_to_status.routineAirflow == accepted_to_filter.routineAirflow &
          accepted_to_status.preferenceEvent == accepted_to_filter.preferenceEvent;
        compute_cases
          // @trace CASE-01
          case CASE_01_REJECT_INVALID:
            assume candidate.candidateClass == CandidateClass.Invalid;
            guarantee acceptedEnableMemory == In(acceptedEnableMemory) &
              acceptedFilterPolicyMemory == In(acceptedFilterPolicyMemory) &
              acceptedHumidityPolicyMemory == In(acceptedHumidityPolicyMemory) &
              acceptedRoutineAirflowMemory == In(acceptedRoutineAirflowMemory) &
              accepted_to_filter.preferenceEvent == PreferenceEvent.RejectedInvalid;
          // @trace CASE-02
          case CASE_02_RETAIN_HELD:
            assume candidate.candidateClass == CandidateClass.Held;
            guarantee acceptedEnableMemory == In(acceptedEnableMemory) &
              acceptedFilterPolicyMemory == In(acceptedFilterPolicyMemory) &
              acceptedHumidityPolicyMemory == In(acceptedHumidityPolicyMemory) &
              acceptedRoutineAirflowMemory == In(acceptedRoutineAirflowMemory) &
              accepted_to_filter.preferenceEvent == PreferenceEvent.NoNewPreference;
          // @trace CASE-03
          case CASE_03_ACCEPT_DISABLED:
            assume candidate.candidateClass == CandidateClass.FreshDisabled;
            guarantee acceptedEnableMemory == candidate.enable &
              acceptedFilterPolicyMemory == candidate.filterPolicy &
              acceptedHumidityPolicyMemory == candidate.humidityPolicy &
              acceptedRoutineAirflowMemory == candidate.routineAirflow &
              accepted_to_filter.preferenceEvent == PreferenceEvent.AcceptedDisabled;
          // @trace CASE-04
          case CASE_04_ACCEPT_ENABLED:
            assume candidate.candidateClass == CandidateClass.FreshEnabled;
            guarantee acceptedEnableMemory == candidate.enable &
              acceptedFilterPolicyMemory == candidate.filterPolicy &
              acceptedHumidityPolicyMemory == candidate.humidityPolicy &
              acceptedRoutineAirflowMemory == candidate.routineAirflow &
              accepted_to_filter.preferenceEvent == PreferenceEvent.AcceptedEnabled;
    }*/
  }
  // @trace PART-09
  part def FiltrationProposalOwner :> Thread {
    // @trace INT-15
    port air_report : DataPort { in :>> type : AirRecoveryReport; }
    // @trace INT-17
    port accepted : DataPort { in :>> type : AcceptedPreference; }
    // @trace INT-09
    port capabilities : DataPort { in :>> type : FilterCapabilityFacts; }
    // @trace INT-21
    port proposal : DataPort { out :>> type : FilterProposalReport; }

    language "GUMBO" /*{
      initialize
        // @trace CONSTR-01
        guarantee INITIAL_FILTER_PROPOSAL_NONE:
          proposal.proposal == FilterProposal.None & proposal.cause == StatusCause.None;
      compute
        // @trace PROP-FILTER-01
        guarantee FILTER_PROPOSAL_TOTAL_RELATION:
          ((accepted.enable == EnableChoice.Off &
            proposal.proposal == FilterProposal.None & proposal.cause == StatusCause.None) |
           (accepted.enable == EnableChoice.On &
            (air_report.gateOpen == F | air_report.evidence == AirEvidence.Invalid) &
            proposal.proposal == FilterProposal.None & proposal.cause == StatusCause.None) |
           (accepted.enable == EnableChoice.On & air_report.gateOpen == T &
            air_report.evidence == AirEvidence.Clean &
            accepted.filterPolicy == FilterPolicy.Automatic &
            proposal.proposal == FilterProposal.None & proposal.cause == StatusCause.None) |
           (accepted.enable == EnableChoice.On & air_report.gateOpen == T &
            air_report.evidence != AirEvidence.Invalid &
            (accepted.filterPolicy == FilterPolicy.Continuous |
             air_report.evidence == AirEvidence.FilterDemand) &
            capabilities.filterBlowerDisposition != FilterBranchBlowerDisposition.Ready &
            proposal.proposal == FilterProposal.Unavailable &
            proposal.cause == StatusCause.EquipmentUnavailable) |
           (accepted.enable == EnableChoice.On & air_report.gateOpen == T &
            air_report.evidence != AirEvidence.Invalid &
            (accepted.filterPolicy == FilterPolicy.Continuous |
             air_report.evidence == AirEvidence.FilterDemand) &
            capabilities.filterBlowerDisposition == FilterBranchBlowerDisposition.Ready &
            capabilities.filterDisposition != FilterBranchPathDisposition.Ready &
            proposal.proposal == FilterProposal.Unavailable &
            proposal.cause == StatusCause.SelectedPathUnavailable) |
           (accepted.enable == EnableChoice.On & air_report.gateOpen == T &
            air_report.evidence == AirEvidence.FilterDemand &
            accepted.filterPolicy == FilterPolicy.Automatic &
            capabilities.filterBlowerDisposition == FilterBranchBlowerDisposition.Ready &
            capabilities.filterDisposition == FilterBranchPathDisposition.Ready &
            proposal.proposal == FilterProposal.Environmental & proposal.cause == StatusCause.None) |
           (accepted.enable == EnableChoice.On & air_report.gateOpen == T &
            air_report.evidence != AirEvidence.Invalid &
            accepted.filterPolicy == FilterPolicy.Continuous &
            capabilities.filterBlowerDisposition == FilterBranchBlowerDisposition.Ready &
            capabilities.filterDisposition == FilterBranchPathDisposition.Ready &
            proposal.proposal == FilterProposal.Continuous & proposal.cause == StatusCause.None));
    }*/
  }
  // @trace PART-10
  part def HumidityProposalOwner :> Thread {
    // @trace INT-16
    port humidity_report : DataPort { in :>> type : HumidityRecoveryReport; }
    // @trace INT-18
    port accepted : DataPort { in :>> type : AcceptedPreference; }
    // @trace INT-10
    port capabilities : DataPort { in :>> type : HumidityCapabilityFacts; }
    // @trace INT-22
    port proposal : DataPort { out :>> type : HumidityProposalReport; }

    language "GUMBO" /*{
      initialize
        // @trace CONSTR-01
        guarantee INITIAL_HUMIDITY_PROPOSAL_NONE:
          proposal.proposal == HumidityProposal.None & proposal.cause == StatusCause.None;
      compute
        // @trace PROP-HUMID-01
        guarantee HUMIDITY_PROPOSAL_TOTAL_RELATION:
          (((accepted.enable == EnableChoice.Off |
             accepted.humidityPolicy == HumidityPolicy.Disabled) &
            proposal.proposal == HumidityProposal.None & proposal.cause == StatusCause.None) |
           (accepted.enable == EnableChoice.On &
            accepted.humidityPolicy == HumidityPolicy.Automatic &
            (humidity_report.gateOpen == F |
             humidity_report.evidence == HumidityEvidence.Invalid) &
            proposal.proposal == HumidityProposal.None & proposal.cause == StatusCause.None) |
           (accepted.enable == EnableChoice.On &
            accepted.humidityPolicy == HumidityPolicy.Automatic &
            humidity_report.gateOpen == T &
            humidity_report.evidence == HumidityEvidence.None &
            proposal.proposal == HumidityProposal.None & proposal.cause == StatusCause.None) |
           (accepted.enable == EnableChoice.On &
            accepted.humidityPolicy == HumidityPolicy.Automatic &
            humidity_report.gateOpen == T &
            (humidity_report.evidence == HumidityEvidence.Dry |
             humidity_report.evidence == HumidityEvidence.Damp) &
            capabilities.humidityBlowerDisposition != HumidityBranchBlowerDisposition.Ready &
            proposal.proposal == HumidityProposal.Unavailable &
            proposal.cause == StatusCause.EquipmentUnavailable) |
           (accepted.enable == EnableChoice.On &
            accepted.humidityPolicy == HumidityPolicy.Automatic &
            humidity_report.gateOpen == T &
            humidity_report.evidence == HumidityEvidence.Dry &
            capabilities.humidityBlowerDisposition == HumidityBranchBlowerDisposition.Ready &
            capabilities.humidifierDisposition != HumidityBranchHumidifierDisposition.Ready &
            proposal.proposal == HumidityProposal.Unavailable &
            proposal.cause == StatusCause.SelectedPathUnavailable) |
           (accepted.enable == EnableChoice.On &
            accepted.humidityPolicy == HumidityPolicy.Automatic &
            humidity_report.gateOpen == T &
            humidity_report.evidence == HumidityEvidence.Damp &
            capabilities.humidityBlowerDisposition == HumidityBranchBlowerDisposition.Ready &
            capabilities.dehumidifierDisposition != HumidityBranchDehumidifierDisposition.Ready &
            proposal.proposal == HumidityProposal.Unavailable &
            proposal.cause == StatusCause.SelectedPathUnavailable) |
           (accepted.enable == EnableChoice.On &
            accepted.humidityPolicy == HumidityPolicy.Automatic &
            humidity_report.gateOpen == T &
            humidity_report.evidence == HumidityEvidence.Dry &
            capabilities.humidityBlowerDisposition == HumidityBranchBlowerDisposition.Ready &
            capabilities.humidifierDisposition == HumidityBranchHumidifierDisposition.Ready &
            proposal.proposal == HumidityProposal.Increase & proposal.cause == StatusCause.None) |
           (accepted.enable == EnableChoice.On &
            accepted.humidityPolicy == HumidityPolicy.Automatic &
            humidity_report.gateOpen == T &
            humidity_report.evidence == HumidityEvidence.Damp &
            capabilities.humidityBlowerDisposition == HumidityBranchBlowerDisposition.Ready &
            capabilities.dehumidifierDisposition == HumidityBranchDehumidifierDisposition.Ready &
            proposal.proposal == HumidityProposal.Reduce & proposal.cause == StatusCause.None));
    }*/
  }
  // @trace PART-11
  part def RoutineAirflowProposalOwner :> Thread {
    // @trace INT-19
    port accepted : DataPort { in :>> type : AcceptedPreference; }
    // @trace INT-13
    port path : DataPort { in :>> type : PathDisposition; }
    // @trace INT-11
    port capability : DataPort { in :>> type : BlowerCapabilityFact; }
    // @trace INT-23
    port proposal : DataPort { out :>> type : RoutineProposalReport; }

    language "GUMBO" /*{
      initialize
        // @trace CONSTR-01
        guarantee INITIAL_ROUTINE_PROPOSAL_NONE:
          proposal.proposal == RoutineProposal.None & proposal.cause == StatusCause.None;
      compute
        // @trace PROP-ROUTINE-01
        guarantee ROUTINE_PROPOSAL_TOTAL_RELATION:
          ((accepted.enable == EnableChoice.Off &
            proposal.proposal == RoutineProposal.None & proposal.cause == StatusCause.None) |
           (accepted.enable == EnableChoice.On & accepted.routineAirflow == RoutineAirflow.Off &
            proposal.proposal == RoutineProposal.None & proposal.cause == StatusCause.None) |
           (accepted.enable == EnableChoice.On & accepted.routineAirflow != RoutineAirflow.Off &
            path == PathDisposition.Untrusted &
            proposal.proposal == RoutineProposal.Unavailable &
            proposal.cause == StatusCause.AuthorityInvalid) |
           (accepted.enable == EnableChoice.On & accepted.routineAirflow != RoutineAirflow.Off &
            path == PathDisposition.Reserved &
            proposal.proposal == RoutineProposal.Unavailable &
            proposal.cause == StatusCause.AirPathReserved) |
           (accepted.enable == EnableChoice.On & accepted.routineAirflow != RoutineAirflow.Off &
            path == PathDisposition.Usable &
            capability.routineBlowerDisposition != RoutineBranchBlowerDisposition.Ready &
            proposal.proposal == RoutineProposal.Unavailable &
            proposal.cause == StatusCause.EquipmentUnavailable) |
           (accepted.enable == EnableChoice.On & accepted.routineAirflow == RoutineAirflow.Low &
            path == PathDisposition.Usable & capability.routineBlowerDisposition == RoutineBranchBlowerDisposition.Ready &
            proposal.proposal == RoutineProposal.Low & proposal.cause == StatusCause.None) |
           (accepted.enable == EnableChoice.On & accepted.routineAirflow == RoutineAirflow.High &
            path == PathDisposition.Usable & capability.routineBlowerDisposition == RoutineBranchBlowerDisposition.Ready &
            proposal.proposal == RoutineProposal.High & proposal.cause == StatusCause.None));
    }*/
  }
  // @trace PART-12
  part def CabinAirPriorityArbiter :> Thread {
    // @trace INT-20
    port accepted : DataPort { in :>> type : AcceptedPreference; }
    // @trace INT-21
    port filter_proposal : DataPort { in :>> type : FilterProposalReport; }
    // @trace INT-22
    port humidity_proposal : DataPort { in :>> type : HumidityProposalReport; }
    // @trace INT-23
    port routine_proposal : DataPort { in :>> type : RoutineProposalReport; }
    // @trace INT-24
    port selection_to_composer : DataPort { out :>> type : SelectionReport; }
    // @trace INT-26
    port selection_to_status : DataPort { out :>> type : SelectionReport; }

    language "GUMBO" /*{
      initialize
        // @trace CONSTR-01
        guarantee INITIAL_SELECTION_NONE:
          selection_to_composer.intent == SelectedIntent.None &
          selection_to_composer.flowClass == FlowClass.Off &
          selection_to_composer.cause == StatusCause.PreferenceDisabled &
          selection_to_status.intent == selection_to_composer.intent &
          selection_to_status.flowClass == selection_to_composer.flowClass &
          selection_to_status.cause == selection_to_composer.cause;
      compute
        // @trace INT-26
        guarantee SELECTION_FANOUT:
          selection_to_status.intent == selection_to_composer.intent &
          selection_to_status.flowClass == selection_to_composer.flowClass &
          selection_to_status.cause == selection_to_composer.cause;
        compute_cases
          // @trace CASE-17
          case CASE_17_DISABLED_PRIORITY:
            assume accepted.enable == EnableChoice.Off;
            guarantee selection_to_composer.intent == SelectedIntent.None &
              selection_to_composer.flowClass == FlowClass.Off &
              selection_to_composer.cause == StatusCause.PreferenceDisabled;
          // @trace CASE-18
          case CASE_18_FILTER_PRIORITY:
            assume accepted.enable == EnableChoice.On &
              (filter_proposal.proposal == FilterProposal.Environmental |
               filter_proposal.proposal == FilterProposal.Continuous);
            guarantee selection_to_composer.intent == SelectedIntent.Filter &
              selection_to_composer.flowClass == FlowClass.Treatment &
              selection_to_composer.cause == StatusCause.AirTreatmentPriority;
          // @trace CASE-19
          case CASE_19_REDUCE_PRIORITY:
            assume accepted.enable == EnableChoice.On &
              (filter_proposal.proposal == FilterProposal.None |
               filter_proposal.proposal == FilterProposal.Unavailable) &
              humidity_proposal.proposal == HumidityProposal.Reduce;
            guarantee selection_to_composer.intent == SelectedIntent.Reduce &
              selection_to_composer.flowClass == FlowClass.Treatment &
              selection_to_composer.cause == StatusCause.HumidityTreatmentPriority;
          // @trace CASE-20
          case CASE_20_INCREASE_PRIORITY:
            assume accepted.enable == EnableChoice.On &
              (filter_proposal.proposal == FilterProposal.None |
               filter_proposal.proposal == FilterProposal.Unavailable) &
              humidity_proposal.proposal == HumidityProposal.Increase;
            guarantee selection_to_composer.intent == SelectedIntent.Increase &
              selection_to_composer.flowClass == FlowClass.Treatment &
              selection_to_composer.cause == StatusCause.HumidityTreatmentPriority;
          // @trace CASE-21
          case CASE_21_ROUTINE_PRIORITY:
            assume accepted.enable == EnableChoice.On &
              (filter_proposal.proposal == FilterProposal.None |
               filter_proposal.proposal == FilterProposal.Unavailable) &
              (humidity_proposal.proposal == HumidityProposal.None |
               humidity_proposal.proposal == HumidityProposal.Unavailable) &
              (routine_proposal.proposal == RoutineProposal.Low |
               routine_proposal.proposal == RoutineProposal.High);
            guarantee selection_to_composer.intent == SelectedIntent.ExchangeAir &
              selection_to_composer.cause == StatusCause.None &
              ((routine_proposal.proposal == RoutineProposal.Low &
                selection_to_composer.flowClass == FlowClass.Routine) |
               (routine_proposal.proposal == RoutineProposal.High &
                selection_to_composer.flowClass == FlowClass.Routine));
          // @trace CASE-22
          case CASE_22_NO_SELECTION_CAUSE:
            assume accepted.enable == EnableChoice.On &
              (filter_proposal.proposal == FilterProposal.None |
               filter_proposal.proposal == FilterProposal.Unavailable) &
              (humidity_proposal.proposal == HumidityProposal.None |
               humidity_proposal.proposal == HumidityProposal.Unavailable) &
              (routine_proposal.proposal == RoutineProposal.None |
               routine_proposal.proposal == RoutineProposal.Unavailable);
            guarantee selection_to_composer.intent == SelectedIntent.None &
              selection_to_composer.flowClass == FlowClass.Off &
              (((filter_proposal.cause == StatusCause.AuthorityInvalid |
                 humidity_proposal.cause == StatusCause.AuthorityInvalid |
                 routine_proposal.cause == StatusCause.AuthorityInvalid) &
                selection_to_composer.cause == StatusCause.AuthorityInvalid) |
               (filter_proposal.cause != StatusCause.AuthorityInvalid &
                humidity_proposal.cause != StatusCause.AuthorityInvalid &
                routine_proposal.cause != StatusCause.AuthorityInvalid &
                (filter_proposal.cause == StatusCause.AirPathReserved |
                 humidity_proposal.cause == StatusCause.AirPathReserved |
                 routine_proposal.cause == StatusCause.AirPathReserved) &
                selection_to_composer.cause == StatusCause.AirPathReserved) |
               (filter_proposal.cause != StatusCause.AuthorityInvalid &
                humidity_proposal.cause != StatusCause.AuthorityInvalid &
                routine_proposal.cause != StatusCause.AuthorityInvalid &
                filter_proposal.cause != StatusCause.AirPathReserved &
                humidity_proposal.cause != StatusCause.AirPathReserved &
                routine_proposal.cause != StatusCause.AirPathReserved &
                (filter_proposal.cause == StatusCause.EquipmentUnavailable |
                 humidity_proposal.cause == StatusCause.EquipmentUnavailable |
                 routine_proposal.cause == StatusCause.EquipmentUnavailable) &
                selection_to_composer.cause == StatusCause.EquipmentUnavailable) |
               (filter_proposal.cause != StatusCause.AuthorityInvalid &
                humidity_proposal.cause != StatusCause.AuthorityInvalid &
                routine_proposal.cause != StatusCause.AuthorityInvalid &
                filter_proposal.cause != StatusCause.AirPathReserved &
                humidity_proposal.cause != StatusCause.AirPathReserved &
                routine_proposal.cause != StatusCause.AirPathReserved &
                filter_proposal.cause != StatusCause.EquipmentUnavailable &
                humidity_proposal.cause != StatusCause.EquipmentUnavailable &
                routine_proposal.cause != StatusCause.EquipmentUnavailable &
                (filter_proposal.cause == StatusCause.SelectedPathUnavailable |
                 humidity_proposal.cause == StatusCause.SelectedPathUnavailable |
                 routine_proposal.cause == StatusCause.SelectedPathUnavailable) &
                selection_to_composer.cause == StatusCause.SelectedPathUnavailable) |
               (filter_proposal.cause == StatusCause.None &
                humidity_proposal.cause == StatusCause.None &
                routine_proposal.cause == StatusCause.None &
                selection_to_composer.cause == StatusCause.None));
    }*/
  }
  // @trace PART-13
  part def AuthoritySafePlanComposer :> Thread {
    // @trace INT-24
    port selection : DataPort { in :>> type : SelectionReport; }
    // @trace INT-14
    port path : DataPort { in :>> type : PathDisposition; }
    // @trace INT-12
    port capabilities : DataPort { in :>> type : CapabilitySet; }
    // @trace INT-25
    port composition_to_status : DataPort { out :>> type : CompositionReport; }
    // @trace INT-30
    port treatment_plan : DataPort { out :>> type : CabinAirTreatmentPlan; }

    language "GUMBO" /*{
      initialize
        // @trace CONSTR-01
        guarantee INITIAL_PLAN_ALL_OFF:
          composition_to_status.treatmentAction == TreatmentAction.None &
          composition_to_status.flowClass == FlowClass.Off &
          composition_to_status.authorityUse == AuthorityUse.None &
          composition_to_status.cause == StatusCause.PreferenceDisabled &
          treatment_plan.treatmentAction == TreatmentAction.None &
          treatment_plan.flowClass == FlowClass.Off &
          treatment_plan.authorityUse == AuthorityUse.None;
      compute
        // @trace INT-30
        guarantee PLAN_DELIVERY_COHERENCE:
          treatment_plan.treatmentAction == composition_to_status.treatmentAction &
          treatment_plan.flowClass == composition_to_status.flowClass &
          treatment_plan.authorityUse == composition_to_status.authorityUse;
        // @trace COMP-01
        guarantee PLAN_SHAPE_COHERENCE:
          ((composition_to_status.treatmentAction == TreatmentAction.None &
            composition_to_status.flowClass == FlowClass.Off &
            composition_to_status.authorityUse == AuthorityUse.None) |
           (composition_to_status.treatmentAction != TreatmentAction.None &
            composition_to_status.flowClass != FlowClass.Off &
            composition_to_status.authorityUse == AuthorityUse.SharedAirPath));
        compute_cases
          // @trace CASE-23
          case CASE_23_NONE_ALL_OFF:
            assume selection.intent == SelectedIntent.None;
            guarantee composition_to_status.treatmentAction == TreatmentAction.None &
              composition_to_status.flowClass == FlowClass.Off &
              composition_to_status.authorityUse == AuthorityUse.None &
              composition_to_status.cause == selection.cause;
          // @trace CASE-24
          case CASE_24_UNTRUSTED_AUTHORITY:
            assume selection.intent != SelectedIntent.None & path == PathDisposition.Untrusted;
            guarantee composition_to_status.treatmentAction == TreatmentAction.None &
              composition_to_status.flowClass == FlowClass.Off &
              composition_to_status.authorityUse == AuthorityUse.None &
              composition_to_status.cause == StatusCause.AuthorityInvalid;
          // @trace CASE-25
          case CASE_25_RESERVED_AUTHORITY:
            assume selection.intent != SelectedIntent.None & path == PathDisposition.Reserved;
            guarantee composition_to_status.treatmentAction == TreatmentAction.None &
              composition_to_status.flowClass == FlowClass.Off &
              composition_to_status.authorityUse == AuthorityUse.None &
              composition_to_status.cause == StatusCause.AirPathReserved;
          // @trace CASE-26
          case CASE_26_BLOWER_UNAVAILABLE:
            assume selection.intent != SelectedIntent.None & path == PathDisposition.Usable &
              capabilities.sharedBlowerDisposition != ComposerBlowerDisposition.Ready;
            guarantee composition_to_status.treatmentAction == TreatmentAction.None &
              composition_to_status.flowClass == FlowClass.Off &
              composition_to_status.authorityUse == AuthorityUse.None &
              composition_to_status.cause == StatusCause.EquipmentUnavailable;
          // @trace CASE-27
          case CASE_27_FILTER_COMPOSITION:
            assume selection.intent == SelectedIntent.Filter & path == PathDisposition.Usable &
              capabilities.sharedBlowerDisposition == ComposerBlowerDisposition.Ready;
            guarantee
              ((capabilities.sharedFilterDisposition == ComposerFilterDisposition.Ready &
                composition_to_status.treatmentAction == TreatmentAction.FilterAir &
                composition_to_status.flowClass == FlowClass.Treatment &
                composition_to_status.authorityUse == AuthorityUse.SharedAirPath &
                composition_to_status.cause == selection.cause) |
               (capabilities.sharedFilterDisposition != ComposerFilterDisposition.Ready &
                composition_to_status.treatmentAction == TreatmentAction.None &
                composition_to_status.flowClass == FlowClass.Off &
                composition_to_status.authorityUse == AuthorityUse.None &
                composition_to_status.cause == StatusCause.SelectedPathUnavailable));
          // @trace CASE-28
          case CASE_28_HUMIDITY_COMPOSITION:
            assume (selection.intent == SelectedIntent.Increase |
                    selection.intent == SelectedIntent.Reduce) &
              path == PathDisposition.Usable &
              capabilities.sharedBlowerDisposition == ComposerBlowerDisposition.Ready;
            guarantee
              ((selection.intent == SelectedIntent.Increase &
                capabilities.sharedHumidifierDisposition == ComposerHumidifierDisposition.Ready &
                composition_to_status.treatmentAction == TreatmentAction.IncreaseHumidity &
                composition_to_status.flowClass == FlowClass.Treatment &
                composition_to_status.authorityUse == AuthorityUse.SharedAirPath &
                composition_to_status.cause == selection.cause) |
               (selection.intent == SelectedIntent.Reduce &
                capabilities.sharedDehumidifierDisposition == ComposerDehumidifierDisposition.Ready &
                composition_to_status.treatmentAction == TreatmentAction.ReduceHumidity &
                composition_to_status.flowClass == FlowClass.Treatment &
                composition_to_status.authorityUse == AuthorityUse.SharedAirPath &
                composition_to_status.cause == selection.cause) |
               (selection.intent == SelectedIntent.Increase &
                capabilities.sharedHumidifierDisposition != ComposerHumidifierDisposition.Ready &
                composition_to_status.treatmentAction == TreatmentAction.None &
                composition_to_status.flowClass == FlowClass.Off &
                composition_to_status.authorityUse == AuthorityUse.None &
                composition_to_status.cause == StatusCause.SelectedPathUnavailable) |
               (selection.intent == SelectedIntent.Reduce &
                capabilities.sharedDehumidifierDisposition != ComposerDehumidifierDisposition.Ready &
                composition_to_status.treatmentAction == TreatmentAction.None &
                composition_to_status.flowClass == FlowClass.Off &
                composition_to_status.authorityUse == AuthorityUse.None &
                composition_to_status.cause == StatusCause.SelectedPathUnavailable));
          // @trace CASE-29
          case CASE_29_ROUTINE_COMPOSITION:
            assume selection.intent == SelectedIntent.ExchangeAir &
              path == PathDisposition.Usable &
              capabilities.sharedBlowerDisposition == ComposerBlowerDisposition.Ready;
            guarantee composition_to_status.treatmentAction == TreatmentAction.ExchangeAir &
              composition_to_status.flowClass == selection.flowClass &
              composition_to_status.authorityUse == AuthorityUse.SharedAirPath &
              composition_to_status.cause == selection.cause;
    }*/
  }
  // @trace PART-14
  part def StatusOutcomeReconciler :> Thread {
    // @trace INT-25
    port composed_result : DataPort { in :>> type : CompositionReport; }
    // @trace INT-26
    port selection : DataPort { in :>> type : SelectionReport; }
    // @trace INT-27
    port air_report : DataPort { in :>> type : AirRecoveryReport; }
    // @trace INT-28
    port humidity_report : DataPort { in :>> type : HumidityRecoveryReport; }
    // @trace INT-29
    port accepted : DataPort { in :>> type : AcceptedPreference; }
    // @trace INT-31
    port supervisor_status : DataPort { out :>> type : CabinAirSupervisorStatus; }

    language "GUMBO" /*{
      initialize
        // @trace CONSTR-01
        guarantee INITIAL_STATUS_SAFE:
          supervisor_status.mode == SupervisorMode.Idle &
          supervisor_status.cause == StatusCause.PreferenceDisabled;
      compute
        // @trace CAUSE-01
        guarantee STATUS_CAUSE_PRECEDENCE:
          (((air_report.transitionEvent == AirRecoveryEvent.AirFaultEntered |
             air_report.transitionEvent == AirRecoveryEvent.AirFaultPersists |
             air_report.transitionEvent == AirRecoveryEvent.AirFaultRecurred) &
            supervisor_status.cause == StatusCause.AirObservationInvalid) |
           (air_report.transitionEvent != AirRecoveryEvent.AirFaultEntered &
            air_report.transitionEvent != AirRecoveryEvent.AirFaultPersists &
            air_report.transitionEvent != AirRecoveryEvent.AirFaultRecurred &
            (humidity_report.transitionEvent == HumidityRecoveryEvent.HumidityFaultEntered |
             humidity_report.transitionEvent == HumidityRecoveryEvent.HumidityFaultPersists |
             humidity_report.transitionEvent == HumidityRecoveryEvent.HumidityFaultRecurred) &
            supervisor_status.cause == StatusCause.HumidityObservationInvalid) |
           (air_report.transitionEvent != AirRecoveryEvent.AirFaultEntered &
            air_report.transitionEvent != AirRecoveryEvent.AirFaultPersists &
            air_report.transitionEvent != AirRecoveryEvent.AirFaultRecurred &
            humidity_report.transitionEvent != HumidityRecoveryEvent.HumidityFaultEntered &
            humidity_report.transitionEvent != HumidityRecoveryEvent.HumidityFaultPersists &
            humidity_report.transitionEvent != HumidityRecoveryEvent.HumidityFaultRecurred &
            air_report.trust != TrustState.Trusted &
            supervisor_status.cause == StatusCause.AirRecovering) |
           (air_report.transitionEvent != AirRecoveryEvent.AirFaultEntered &
            air_report.transitionEvent != AirRecoveryEvent.AirFaultPersists &
            air_report.transitionEvent != AirRecoveryEvent.AirFaultRecurred &
            humidity_report.transitionEvent != HumidityRecoveryEvent.HumidityFaultEntered &
            humidity_report.transitionEvent != HumidityRecoveryEvent.HumidityFaultPersists &
            humidity_report.transitionEvent != HumidityRecoveryEvent.HumidityFaultRecurred &
            air_report.trust == TrustState.Trusted & humidity_report.trust != TrustState.Trusted &
            supervisor_status.cause == StatusCause.HumidityRecovering) |
           (air_report.trust == TrustState.Trusted & humidity_report.trust == TrustState.Trusted &
            (composed_result.cause == StatusCause.AuthorityInvalid |
             composed_result.cause == StatusCause.AirPathReserved |
             composed_result.cause == StatusCause.EquipmentUnavailable |
             composed_result.cause == StatusCause.SelectedPathUnavailable) &
            supervisor_status.cause == composed_result.cause) |
           (air_report.trust == TrustState.Trusted & humidity_report.trust == TrustState.Trusted &
            composed_result.cause != StatusCause.AuthorityInvalid &
            composed_result.cause != StatusCause.AirPathReserved &
            composed_result.cause != StatusCause.EquipmentUnavailable &
            composed_result.cause != StatusCause.SelectedPathUnavailable &
            accepted.preferenceEvent == PreferenceEvent.RejectedInvalid &
            supervisor_status.cause == StatusCause.PreferenceRejected) |
           (air_report.trust == TrustState.Trusted & humidity_report.trust == TrustState.Trusted &
            composed_result.cause != StatusCause.AuthorityInvalid &
            composed_result.cause != StatusCause.AirPathReserved &
            composed_result.cause != StatusCause.EquipmentUnavailable &
            composed_result.cause != StatusCause.SelectedPathUnavailable &
            accepted.preferenceEvent != PreferenceEvent.RejectedInvalid &
            (selection.cause == StatusCause.AirTreatmentPriority |
             selection.cause == StatusCause.HumidityTreatmentPriority) &
            supervisor_status.cause == selection.cause) |
           (air_report.trust == TrustState.Trusted & humidity_report.trust == TrustState.Trusted &
            composed_result.cause != StatusCause.AuthorityInvalid &
            composed_result.cause != StatusCause.AirPathReserved &
            composed_result.cause != StatusCause.EquipmentUnavailable &
            composed_result.cause != StatusCause.SelectedPathUnavailable &
            accepted.preferenceEvent != PreferenceEvent.RejectedInvalid &
            selection.cause != StatusCause.AirTreatmentPriority &
            selection.cause != StatusCause.HumidityTreatmentPriority &
            accepted.enable == EnableChoice.Off &
            supervisor_status.cause == StatusCause.PreferenceDisabled) |
           (air_report.trust == TrustState.Trusted & humidity_report.trust == TrustState.Trusted &
            composed_result.cause != StatusCause.AuthorityInvalid &
            composed_result.cause != StatusCause.AirPathReserved &
            composed_result.cause != StatusCause.EquipmentUnavailable &
            composed_result.cause != StatusCause.SelectedPathUnavailable &
            accepted.preferenceEvent != PreferenceEvent.RejectedInvalid &
            selection.cause != StatusCause.AirTreatmentPriority &
            selection.cause != StatusCause.HumidityTreatmentPriority &
            accepted.enable == EnableChoice.On & supervisor_status.cause == StatusCause.None));
        // @trace STATUS-01
        guarantee STATUS_MODE_TOTAL_PARTITION:
          ((selection.intent != SelectedIntent.None &
            composed_result.treatmentAction == TreatmentAction.None &
            supervisor_status.mode == SupervisorMode.Inhibited) |
           (selection.intent == SelectedIntent.None &
            composed_result.treatmentAction == TreatmentAction.None &
            (air_report.trust != TrustState.Trusted |
             humidity_report.trust != TrustState.Trusted) &
            supervisor_status.mode == SupervisorMode.ObservationHold) |
           (composed_result.treatmentAction != TreatmentAction.None &
            (air_report.trust != TrustState.Trusted |
             humidity_report.trust != TrustState.Trusted |
             accepted.preferenceEvent == PreferenceEvent.RejectedInvalid) &
            supervisor_status.mode == SupervisorMode.Degraded) |
           (composed_result.treatmentAction != TreatmentAction.None &
            air_report.trust == TrustState.Trusted &
            humidity_report.trust == TrustState.Trusted &
            accepted.preferenceEvent != PreferenceEvent.RejectedInvalid &
            supervisor_status.mode == SupervisorMode.Active) |
           (selection.intent == SelectedIntent.None &
            composed_result.treatmentAction == TreatmentAction.None &
            air_report.trust == TrustState.Trusted &
            humidity_report.trust == TrustState.Trusted &
            supervisor_status.mode == SupervisorMode.Idle));
    }*/
  }

  // @generated-support Behavior-free container authorized by SUPPORT-01.
  part def CabinAirSupervisionProcess :> Process {
    // @generated-support Transparent endpoints for the seven boundary interactions.
    port preference : DataPort { in :>> type : UserAirPreference; }
    port air_observation : DataPort { in :>> type : AirQualityObservation; }
    port humidity_observation : DataPort { in :>> type : HumidityObservation; }
    port readiness : DataPort { in :>> type : AirTreatmentReadiness; }
    port authority : DataPort { in :>> type : SharedAirPathAuthority; }
    port treatment_plan : DataPort { out :>> type : CabinAirTreatmentPlan; }
    port supervisor_status : DataPort { out :>> type : CabinAirSupervisorStatus; }

    // @trace PART-01
    part preference_request_qualifier : PreferenceRequestQualifier;
    // @trace PART-02
    part air_quality_need_assessor : AirQualityNeedAssessor;
    // @trace PART-03
    part humidity_need_assessor : HumidityNeedAssessor;
    // @trace PART-04
    part shared_path_authority_assessor : SharedPathAuthorityAssessor;
    // @trace PART-05
    part treatment_capability_assessor : TreatmentCapabilityAssessor;
    // @trace PART-06
    part air_evidence_recovery_owner : AirEvidenceRecoveryOwner;
    // @trace PART-07
    part humidity_evidence_recovery_owner : HumidityEvidenceRecoveryOwner;
    // @trace PART-08
    part preference_session_owner : PreferenceSessionOwner;
    // @trace PART-09
    part filtration_proposal_owner : FiltrationProposalOwner;
    // @trace PART-10
    part humidity_proposal_owner : HumidityProposalOwner;
    // @trace PART-11
    part routine_airflow_proposal_owner : RoutineAirflowProposalOwner;
    // @trace PART-12
    part cabin_air_priority_arbiter : CabinAirPriorityArbiter;
    // @trace PART-13
    part authority_safe_plan_composer : AuthoritySafePlanComposer;
    // @trace PART-14
    part status_outcome_reconciler : StatusOutcomeReconciler;

    // @trace INT-01
    connection int01 : PortConnection connect preference to preference_request_qualifier.preference;
    // @trace INT-02
    connection int02 : PortConnection connect air_observation to air_quality_need_assessor.observation;
    // @trace INT-03
    connection int03 : PortConnection connect humidity_observation to humidity_need_assessor.observation;
    // @trace INT-04
    connection int04 : PortConnection connect authority to shared_path_authority_assessor.authority;
    // @trace INT-05
    connection int05 : PortConnection connect readiness to treatment_capability_assessor.readiness;
    // @trace INT-06
    connection int06 : PortConnection connect preference_request_qualifier.candidate to preference_session_owner.candidate;
    // @trace INT-07
    connection int07 : PortConnection connect air_quality_need_assessor.evidence to air_evidence_recovery_owner.evidence;
    // @trace INT-08
    connection int08 : PortConnection connect humidity_need_assessor.evidence to humidity_evidence_recovery_owner.evidence;
    // @trace INT-09
    connection int09 : PortConnection connect treatment_capability_assessor.filter_facts to filtration_proposal_owner.capabilities;
    // @trace INT-10
    connection int10 : PortConnection connect treatment_capability_assessor.humidity_facts to humidity_proposal_owner.capabilities;
    // @trace INT-11
    connection int11 : PortConnection connect treatment_capability_assessor.blower_fact to routine_airflow_proposal_owner.capability;
    // @trace INT-12
    connection int12 : PortConnection connect treatment_capability_assessor.capability_set to authority_safe_plan_composer.capabilities;
    // @trace INT-13
    connection int13 : PortConnection connect shared_path_authority_assessor.disposition_to_routine to routine_airflow_proposal_owner.path;
    // @trace INT-14
    connection int14 : PortConnection connect shared_path_authority_assessor.disposition_to_composer to authority_safe_plan_composer.path;
    // @trace INT-15
    connection int15 : PortConnection connect air_evidence_recovery_owner.report_to_filter to filtration_proposal_owner.air_report;
    // @trace INT-16
    connection int16 : PortConnection connect humidity_evidence_recovery_owner.report_to_humidity to humidity_proposal_owner.humidity_report;
    // @trace INT-17
    connection int17 : PortConnection connect preference_session_owner.accepted_to_filter to filtration_proposal_owner.accepted;
    // @trace INT-18
    connection int18 : PortConnection connect preference_session_owner.accepted_to_humidity to humidity_proposal_owner.accepted;
    // @trace INT-19
    connection int19 : PortConnection connect preference_session_owner.accepted_to_routine to routine_airflow_proposal_owner.accepted;
    // @trace INT-20
    connection int20 : PortConnection connect preference_session_owner.accepted_to_arbiter to cabin_air_priority_arbiter.accepted;
    // @trace INT-21
    connection int21 : PortConnection connect filtration_proposal_owner.proposal to cabin_air_priority_arbiter.filter_proposal;
    // @trace INT-22
    connection int22 : PortConnection connect humidity_proposal_owner.proposal to cabin_air_priority_arbiter.humidity_proposal;
    // @trace INT-23
    connection int23 : PortConnection connect routine_airflow_proposal_owner.proposal to cabin_air_priority_arbiter.routine_proposal;
    // @trace INT-24
    connection int24 : PortConnection connect cabin_air_priority_arbiter.selection_to_composer to authority_safe_plan_composer.selection;
    // @trace INT-25
    connection int25 : PortConnection connect authority_safe_plan_composer.composition_to_status to status_outcome_reconciler.composed_result;
    // @trace INT-26
    connection int26 : PortConnection connect cabin_air_priority_arbiter.selection_to_status to status_outcome_reconciler.selection;
    // @trace INT-27
    connection int27 : PortConnection connect air_evidence_recovery_owner.report_to_status to status_outcome_reconciler.air_report;
    // @trace INT-28
    connection int28 : PortConnection connect humidity_evidence_recovery_owner.report_to_status to status_outcome_reconciler.humidity_report;
    // @trace INT-29
    connection int29 : PortConnection connect preference_session_owner.accepted_to_status to status_outcome_reconciler.accepted;
    // @trace INT-30
    connection int30 : PortConnection connect authority_safe_plan_composer.treatment_plan to treatment_plan;
    // @trace INT-31
    connection int31 : PortConnection connect status_outcome_reconciler.supervisor_status to supervisor_status;
  }

  // @trace BOUND-01
  part def CabinAirQualityHumiditySupervisorSystem :> System {
    // @trace MON-01
    port preference : DataPort { in :>> type : UserAirPreference; }
    // @trace MON-02
    port air_observation : DataPort { in :>> type : AirQualityObservation; }
    // @trace MON-03
    port humidity_observation : DataPort { in :>> type : HumidityObservation; }
    // @trace MON-04
    port readiness : DataPort { in :>> type : AirTreatmentReadiness; }
    // @trace MON-05
    port authority : DataPort { in :>> type : SharedAirPathAuthority; }
    // @trace CTRL-01
    port treatment_plan : DataPort { out :>> type : CabinAirTreatmentPlan; }
    // @trace CTRL-02
    port supervisor_status : DataPort { out :>> type : CabinAirSupervisorStatus; }

    // @generated-support Sole behavior-free Process authorized by SUPPORT-01.
    part cabin_air_supervision_process : CabinAirSupervisionProcess;

    // @generated-support Transparent second hop for INT-01.
    connection support01 : PortConnection connect preference to cabin_air_supervision_process.preference;
    // @generated-support Transparent second hop for INT-02.
    connection support02 : PortConnection connect air_observation to cabin_air_supervision_process.air_observation;
    // @generated-support Transparent second hop for INT-03.
    connection support03 : PortConnection connect humidity_observation to cabin_air_supervision_process.humidity_observation;
    // @generated-support Transparent second hop for INT-05.
    connection support04 : PortConnection connect readiness to cabin_air_supervision_process.readiness;
    // @generated-support Transparent second hop for INT-04.
    connection support05 : PortConnection connect authority to cabin_air_supervision_process.authority;
    // @generated-support Transparent second hop for INT-30.
    connection support06 : PortConnection connect cabin_air_supervision_process.treatment_plan to treatment_plan;
    // @generated-support Transparent second hop for INT-31.
    connection support07 : PortConnection connect cabin_air_supervision_process.supervisor_status to supervisor_status;
  }

  // @trace BOUND-01
  part cabin_air_quality_humidity_supervisor : CabinAirQualityHumiditySupervisorSystem;
}
