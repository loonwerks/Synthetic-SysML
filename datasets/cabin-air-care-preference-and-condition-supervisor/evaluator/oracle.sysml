package Cabin_Air_Treatment_Supervisor {

  private import HAMR::*;

  // @trace MON-01
  enum def AirCareSelection { enum Off; enum Auto; enum Purge; }
  // @trace MON-02
  enum def RequestValidity { enum Valid; enum Invalid; }
  // @trace MON-03
  enum def CabinAirQuality { enum Clean; enum Elevated; enum Poor; }
  // @trace MON-04
  enum def AirQualityValidity { enum Valid; enum Invalid; }
  // @trace MON-05
  enum def CabinHumidity { enum Dry; enum Comfortable; enum Damp; }
  // @trace MON-06
  enum def HumidityValidity { enum Valid; enum Invalid; }
  // @trace MON-07
  enum def StatusValidity { enum Valid; enum Invalid; }
  // @trace MON-07
  enum def FilterPathStatus { enum Ready; enum Unavailable; }
  // @trace MON-07
  enum def DryingPathStatus { enum Ready; enum Unavailable; }

  // Every record member later inspected by GUMBO is an attribute.
  // @trace MON-07
  part def TreatmentEquipmentStatus :> Data {
    attribute statusValidity : StatusValidity;
    attribute filtrationChannel : FilterPathStatus;
    attribute dryingChannel : DryingPathStatus;
  }

  // @trace CTRL-01
  enum def AirTreatmentCommand { enum Off; enum FilterNormal; enum FilterIntensive; enum Dry; }
  // @trace CTRL-02
  enum def StatusMode { enum Idle; enum Active; enum Attention; enum Recovery; }
  // @trace CTRL-02
  enum def StatusReason {
    enum None;
    enum NoTreatmentNeeded;
    enum Filtering;
    enum Drying;
    enum AirPriority;
    enum RequestInvalid;
    enum RearmRequired;
    enum AirObservationInvalid;
    enum HumidityObservationInvalid;
    enum FilterUnavailable;
    enum DryerUnavailable;
    enum ReadinessInvalid;
    enum AwaitFresh;
  }
  // @trace CTRL-02
  part def AirCareSupervisorStatus :> Data {
    attribute mode : StatusMode;
    attribute reason : StatusReason;
  }

  // @trace STATE-01
  enum def RequestMemory { enum Released; enum AcceptedActive; enum RearmRequired; }
  // @trace PART-01
  enum def RequestIntent {
    enum None;
    enum FreshAuto;
    enum FreshPurge;
    enum HeldAuto;
    enum HeldPurge;
    enum BlockedInvalid;
    enum BlockedRearm;
  }
  // @trace PART-02
  enum def AirAssessment { enum Unknown; enum Clear; enum FilterNormalNeeded; enum FilterIntensiveNeeded; }
  // @trace PART-03
  enum def HumidityAssessment { enum Unknown; enum NoExcessHumidity; enum DryingNeeded; }
  // @trace PART-04
  enum def TreatmentReadiness { enum Unknown; enum NeitherReady; enum FilterOnly; enum DryerOnly; enum BothReady; }
  // @trace PART-04
  enum def ReadinessContext { enum CriticalUnknown; enum Clear; }
  // @trace PART-05
  enum def AirProposal { enum None; enum InvalidAirObservation; enum FilterUnavailable; enum FilterNormal; enum FilterIntensive; }
  // @trace PART-06
  enum def HumidityProposal { enum None; enum InvalidHumidityObservation; enum DryerUnavailable; enum Dry; }
  // @trace STATE-02
  enum def RecoveryMemory { enum Ready; enum FaultHeld; enum AwaitFresh; }

  // @trace PART-01
  part def AirCareRequestLifecycleOwner :> Thread {
    // @trace INT-01
    port airCareSelection : DataPort { in :>> type : AirCareSelection; }
    // @trace INT-02
    port requestValidity : DataPort { in :>> type : RequestValidity; }
    // @trace INT-08
    port requestIntent : DataPort { out :>> type : RequestIntent; }

    language "GUMBO" /*{
      state
        // @trace STATE-01
        requestMemory: RequestMemory;
      initialize
        modifies requestMemory;
        // @trace INIT-01
        guarantee INITIAL_REQUEST_LIFECYCLE_SAFE:
          requestMemory == RequestMemory.Released &
          requestIntent == RequestIntent.None;
      compute
        modifies requestMemory;
        compute_cases
          // @trace CASE-RQ-01
          case CASE_RQ_01_INVALID:
            assume requestValidity == RequestValidity.Invalid;
            guarantee requestIntent == RequestIntent.BlockedInvalid &
              requestMemory == RequestMemory.RearmRequired;
          // @trace CASE-RQ-02
          case CASE_RQ_02_VALID_OFF:
            assume requestValidity == RequestValidity.Valid &
              airCareSelection == AirCareSelection.Off;
            guarantee requestIntent == RequestIntent.None &
              requestMemory == RequestMemory.Released;
          // @trace CASE-RQ-03
          case CASE_RQ_03_FRESH_ACTIVE:
            assume requestValidity == RequestValidity.Valid &
              airCareSelection != AirCareSelection.Off &
              In(requestMemory) == RequestMemory.Released;
            guarantee requestMemory == RequestMemory.AcceptedActive &
              ((airCareSelection == AirCareSelection.Auto &
                requestIntent == RequestIntent.FreshAuto) |
               (airCareSelection == AirCareSelection.Purge &
                requestIntent == RequestIntent.FreshPurge));
          // @trace CASE-RQ-04
          case CASE_RQ_04_HELD_ACTIVE:
            assume requestValidity == RequestValidity.Valid &
              airCareSelection != AirCareSelection.Off &
              In(requestMemory) == RequestMemory.AcceptedActive;
            guarantee requestMemory == RequestMemory.AcceptedActive &
              ((airCareSelection == AirCareSelection.Auto &
                requestIntent == RequestIntent.HeldAuto) |
               (airCareSelection == AirCareSelection.Purge &
                requestIntent == RequestIntent.HeldPurge));
          // @trace CASE-RQ-05
          case CASE_RQ_05_REARM_BLOCK:
            assume requestValidity == RequestValidity.Valid &
              airCareSelection != AirCareSelection.Off &
              In(requestMemory) == RequestMemory.RearmRequired;
            guarantee requestIntent == RequestIntent.BlockedRearm &
              requestMemory == RequestMemory.RearmRequired;
    }*/
  }

  // @trace PART-02
  part def AirQualityQualificationOwner :> Thread {
    // @trace INT-03
    port cabinAirQuality : DataPort { in :>> type : CabinAirQuality; }
    // @trace INT-04
    port airQualityValidity : DataPort { in :>> type : AirQualityValidity; }
    // @trace INT-12
    port airAssessment : DataPort { out :>> type : AirAssessment; }

    language "GUMBO" /*{
      initialize
        // @trace INIT-01
        guarantee INITIAL_AIR_ASSESSMENT_SAFE:
          airAssessment == AirAssessment.Unknown;
      compute
        // @trace CASE-AIR-01
        guarantee CASE_AIR_01_QUALIFICATION:
          ((airQualityValidity == AirQualityValidity.Invalid &
            airAssessment == AirAssessment.Unknown) |
           (airQualityValidity == AirQualityValidity.Valid &
            cabinAirQuality == CabinAirQuality.Clean &
            airAssessment == AirAssessment.Clear) |
           (airQualityValidity == AirQualityValidity.Valid &
            cabinAirQuality == CabinAirQuality.Elevated &
            airAssessment == AirAssessment.FilterNormalNeeded) |
           (airQualityValidity == AirQualityValidity.Valid &
            cabinAirQuality == CabinAirQuality.Poor &
            airAssessment == AirAssessment.FilterIntensiveNeeded));
    }*/
  }

  // @trace PART-03
  part def HumidityQualificationOwner :> Thread {
    // @trace INT-05
    port cabinHumidity : DataPort { in :>> type : CabinHumidity; }
    // @trace INT-06
    port humidityValidity : DataPort { in :>> type : HumidityValidity; }
    // @trace INT-13
    port humidityAssessment : DataPort { out :>> type : HumidityAssessment; }

    language "GUMBO" /*{
      initialize
        // @trace INIT-01
        guarantee INITIAL_HUMIDITY_ASSESSMENT_SAFE:
          humidityAssessment == HumidityAssessment.Unknown;
      compute
        // @trace CASE-HUM-01
        guarantee CASE_HUM_01_QUALIFICATION:
          ((humidityValidity == HumidityValidity.Invalid &
            humidityAssessment == HumidityAssessment.Unknown) |
           (humidityValidity == HumidityValidity.Valid &
            cabinHumidity == CabinHumidity.Damp &
            humidityAssessment == HumidityAssessment.DryingNeeded) |
           (humidityValidity == HumidityValidity.Valid &
            (cabinHumidity == CabinHumidity.Dry |
             cabinHumidity == CabinHumidity.Comfortable) &
            humidityAssessment == HumidityAssessment.NoExcessHumidity));
    }*/
  }

  // @trace PART-04
  part def TreatmentReadinessQualificationOwner :> Thread {
    // @trace INT-07
    port treatmentEquipmentStatus : DataPort { in :>> type : TreatmentEquipmentStatus; }
    // @trace INT-14
    port treatmentReadiness : DataPort { out :>> type : TreatmentReadiness; }
    // @trace INT-16
    port readinessContext : DataPort { out :>> type : ReadinessContext; }

    language "GUMBO" /*{
      initialize
        // @trace INIT-01
        guarantee INITIAL_READINESS_SAFE:
          treatmentReadiness == TreatmentReadiness.Unknown &
          readinessContext == ReadinessContext.CriticalUnknown;
      compute
        compute_cases
          // @trace CASE-EQP-01
          case CASE_EQP_01_INVALID:
            assume treatmentEquipmentStatus.statusValidity == StatusValidity.Invalid;
            guarantee treatmentReadiness == TreatmentReadiness.Unknown &
              readinessContext == ReadinessContext.CriticalUnknown;
          // @trace CASE-EQP-02
          case CASE_EQP_02_VALID_CROSS_PRODUCT:
            assume treatmentEquipmentStatus.statusValidity == StatusValidity.Valid;
            guarantee readinessContext == ReadinessContext.Clear &
              ((treatmentEquipmentStatus.filtrationChannel == FilterPathStatus.Unavailable &
                treatmentEquipmentStatus.dryingChannel == DryingPathStatus.Unavailable &
                treatmentReadiness == TreatmentReadiness.NeitherReady) |
               (treatmentEquipmentStatus.filtrationChannel == FilterPathStatus.Ready &
                treatmentEquipmentStatus.dryingChannel == DryingPathStatus.Unavailable &
                treatmentReadiness == TreatmentReadiness.FilterOnly) |
               (treatmentEquipmentStatus.filtrationChannel == FilterPathStatus.Unavailable &
                treatmentEquipmentStatus.dryingChannel == DryingPathStatus.Ready &
                treatmentReadiness == TreatmentReadiness.DryerOnly) |
               (treatmentEquipmentStatus.filtrationChannel == FilterPathStatus.Ready &
                treatmentEquipmentStatus.dryingChannel == DryingPathStatus.Ready &
                treatmentReadiness == TreatmentReadiness.BothReady));
    }*/
  }

  // @trace PART-05
  part def FiltrationProposalOwner :> Thread {
    // @trace INT-08
    port requestIntent : DataPort { in :>> type : RequestIntent; }
    // @trace INT-12
    port airAssessment : DataPort { in :>> type : AirAssessment; }
    // @trace INT-14
    port treatmentReadiness : DataPort { in :>> type : TreatmentReadiness; }
    // @trace INT-17
    port airProposal : DataPort { out :>> type : AirProposal; }

    language "GUMBO" /*{
      initialize
        // @trace INIT-01
        guarantee INITIAL_AIR_PROPOSAL_SAFE:
          airProposal == AirProposal.None;
      compute
        // @trace CASE-AIR-02
        guarantee CASE_AIR_02_PROPOSAL_PARTITION:
          (((requestIntent == RequestIntent.None |
             requestIntent == RequestIntent.BlockedInvalid |
             requestIntent == RequestIntent.BlockedRearm) &
            airProposal == AirProposal.None) |
           ((requestIntent == RequestIntent.FreshPurge |
             requestIntent == RequestIntent.HeldPurge) &
            (treatmentReadiness == TreatmentReadiness.FilterOnly |
             treatmentReadiness == TreatmentReadiness.BothReady) &
            airProposal == AirProposal.FilterIntensive) |
           ((requestIntent == RequestIntent.FreshPurge |
             requestIntent == RequestIntent.HeldPurge) &
            treatmentReadiness != TreatmentReadiness.FilterOnly &
            treatmentReadiness != TreatmentReadiness.BothReady &
            airProposal == AirProposal.FilterUnavailable) |
           ((requestIntent == RequestIntent.FreshAuto |
             requestIntent == RequestIntent.HeldAuto) &
            airAssessment == AirAssessment.Unknown &
            airProposal == AirProposal.InvalidAirObservation) |
           ((requestIntent == RequestIntent.FreshAuto |
             requestIntent == RequestIntent.HeldAuto) &
            airAssessment == AirAssessment.Clear &
            airProposal == AirProposal.None) |
           ((requestIntent == RequestIntent.FreshAuto |
             requestIntent == RequestIntent.HeldAuto) &
            airAssessment == AirAssessment.FilterNormalNeeded &
            (treatmentReadiness == TreatmentReadiness.FilterOnly |
             treatmentReadiness == TreatmentReadiness.BothReady) &
            airProposal == AirProposal.FilterNormal) |
           ((requestIntent == RequestIntent.FreshAuto |
             requestIntent == RequestIntent.HeldAuto) &
            airAssessment == AirAssessment.FilterIntensiveNeeded &
            (treatmentReadiness == TreatmentReadiness.FilterOnly |
             treatmentReadiness == TreatmentReadiness.BothReady) &
            airProposal == AirProposal.FilterIntensive) |
           ((requestIntent == RequestIntent.FreshAuto |
             requestIntent == RequestIntent.HeldAuto) &
            (airAssessment == AirAssessment.FilterNormalNeeded |
             airAssessment == AirAssessment.FilterIntensiveNeeded) &
            treatmentReadiness != TreatmentReadiness.FilterOnly &
            treatmentReadiness != TreatmentReadiness.BothReady &
            airProposal == AirProposal.FilterUnavailable));
    }*/
  }

  // @trace PART-06
  part def HumidityProposalOwner :> Thread {
    // @trace INT-09
    port requestIntent : DataPort { in :>> type : RequestIntent; }
    // @trace INT-13
    port humidityAssessment : DataPort { in :>> type : HumidityAssessment; }
    // @trace INT-15
    port treatmentReadiness : DataPort { in :>> type : TreatmentReadiness; }
    // @trace INT-18
    port humidityProposal : DataPort { out :>> type : HumidityProposal; }

    language "GUMBO" /*{
      initialize
        // @trace INIT-01
        guarantee INITIAL_HUMIDITY_PROPOSAL_SAFE:
          humidityProposal == HumidityProposal.None;
      compute
        // @trace CASE-HUM-02
        guarantee CASE_HUM_02_PROPOSAL_PARTITION:
          (((requestIntent == RequestIntent.None |
             requestIntent == RequestIntent.BlockedInvalid |
             requestIntent == RequestIntent.BlockedRearm |
             requestIntent == RequestIntent.FreshPurge |
             requestIntent == RequestIntent.HeldPurge) &
            humidityProposal == HumidityProposal.None) |
           ((requestIntent == RequestIntent.FreshAuto |
             requestIntent == RequestIntent.HeldAuto) &
            humidityAssessment == HumidityAssessment.Unknown &
            humidityProposal == HumidityProposal.InvalidHumidityObservation) |
           ((requestIntent == RequestIntent.FreshAuto |
             requestIntent == RequestIntent.HeldAuto) &
            humidityAssessment == HumidityAssessment.NoExcessHumidity &
            humidityProposal == HumidityProposal.None) |
           ((requestIntent == RequestIntent.FreshAuto |
             requestIntent == RequestIntent.HeldAuto) &
            humidityAssessment == HumidityAssessment.DryingNeeded &
            (treatmentReadiness == TreatmentReadiness.DryerOnly |
             treatmentReadiness == TreatmentReadiness.BothReady) &
            humidityProposal == HumidityProposal.Dry) |
           ((requestIntent == RequestIntent.FreshAuto |
             requestIntent == RequestIntent.HeldAuto) &
            humidityAssessment == HumidityAssessment.DryingNeeded &
            treatmentReadiness != TreatmentReadiness.DryerOnly &
            treatmentReadiness != TreatmentReadiness.BothReady &
            humidityProposal == HumidityProposal.DryerUnavailable));
    }*/
  }

  // @trace PART-07
  part def ReadinessRecoveryOwner :> Thread {
    // @trace INT-10
    port requestIntent : DataPort { in :>> type : RequestIntent; }
    // @trace INT-16
    port readinessContext : DataPort { in :>> type : ReadinessContext; }
    // @trace INT-19
    port recoveryGate : DataPort { out :>> type : RecoveryMemory; }

    language "GUMBO" /*{
      state
        // @trace STATE-02
        recoveryMemory: RecoveryMemory;
      initialize
        modifies recoveryMemory;
        // @trace INIT-01
        guarantee INITIAL_RECOVERY_SAFE:
          recoveryMemory == RecoveryMemory.Ready &
          recoveryGate == RecoveryMemory.Ready;
      compute
        modifies recoveryMemory;
        // @trace OWNER-01
        guarantee RECOVERY_GATE_PUBLISHES_POST_STATE:
          recoveryGate == recoveryMemory;
        compute_cases
          // @trace CASE-REC-01
          case CASE_REC_01_CRITICAL_UNKNOWN:
            assume readinessContext == ReadinessContext.CriticalUnknown;
            guarantee recoveryMemory == RecoveryMemory.FaultHeld &
              recoveryGate == RecoveryMemory.FaultHeld;
          // @trace CASE-REC-02
          case CASE_REC_02_RECOVER_TO_AWAIT_FRESH:
            assume readinessContext == ReadinessContext.Clear &
              In(recoveryMemory) == RecoveryMemory.FaultHeld;
            guarantee recoveryMemory == RecoveryMemory.AwaitFresh &
              recoveryGate == RecoveryMemory.AwaitFresh;
          // @trace CASE-REC-03
          case CASE_REC_03_FRESH_REAUTHORIZATION:
            assume readinessContext == ReadinessContext.Clear &
              In(recoveryMemory) == RecoveryMemory.AwaitFresh &
              (requestIntent == RequestIntent.FreshAuto |
               requestIntent == RequestIntent.FreshPurge);
            guarantee recoveryMemory == RecoveryMemory.Ready &
              recoveryGate == RecoveryMemory.Ready;
          // @trace CASE-REC-04
          case CASE_REC_04_RETAIN_AWAIT_FRESH:
            assume readinessContext == ReadinessContext.Clear &
              In(recoveryMemory) == RecoveryMemory.AwaitFresh &
              requestIntent != RequestIntent.FreshAuto &
              requestIntent != RequestIntent.FreshPurge;
            guarantee recoveryMemory == RecoveryMemory.AwaitFresh &
              recoveryGate == RecoveryMemory.AwaitFresh;
          // @trace CASE-REC-05
          case CASE_REC_05_RETAIN_READY:
            assume readinessContext == ReadinessContext.Clear &
              In(recoveryMemory) == RecoveryMemory.Ready;
            guarantee recoveryMemory == RecoveryMemory.Ready &
              recoveryGate == RecoveryMemory.Ready;
    }*/
  }

  // @trace PART-08
  part def AirCarePriorityResultArbiter :> Thread {
    // @trace INT-11
    port requestIntent : DataPort { in :>> type : RequestIntent; }
    // @trace INT-17
    port airProposal : DataPort { in :>> type : AirProposal; }
    // @trace INT-18
    port humidityProposal : DataPort { in :>> type : HumidityProposal; }
    // @trace INT-19
    port recoveryGate : DataPort { in :>> type : RecoveryMemory; }
    // @trace INT-20
    port airTreatmentCommand : DataPort { out :>> type : AirTreatmentCommand; }
    // @trace INT-21
    port airCareSupervisorStatus : DataPort { out :>> type : AirCareSupervisorStatus; }

    language "GUMBO" /*{
      initialize
        // @trace INIT-01
        guarantee INITIAL_RESULT_SAFE:
          airTreatmentCommand == AirTreatmentCommand.Off &
          airCareSupervisorStatus.mode == StatusMode.Idle &
          airCareSupervisorStatus.reason == StatusReason.None;
      compute
        compute_cases
          // @trace CASE-ARB-01
          case CASE_ARB_01_RECOVERY_DOMINATES:
            assume recoveryGate != RecoveryMemory.Ready;
            guarantee airTreatmentCommand == AirTreatmentCommand.Off &
              ((recoveryGate == RecoveryMemory.FaultHeld &
                airCareSupervisorStatus.mode == StatusMode.Recovery &
                airCareSupervisorStatus.reason == StatusReason.ReadinessInvalid) |
               (recoveryGate == RecoveryMemory.AwaitFresh &
                airCareSupervisorStatus.mode == StatusMode.Recovery &
                airCareSupervisorStatus.reason == StatusReason.AwaitFresh));
          // @trace CASE-ARB-02
          case CASE_ARB_02_NONACTIONABLE_REQUEST:
            assume recoveryGate == RecoveryMemory.Ready &
              (requestIntent == RequestIntent.None |
               requestIntent == RequestIntent.BlockedInvalid |
               requestIntent == RequestIntent.BlockedRearm);
            guarantee airTreatmentCommand == AirTreatmentCommand.Off &
              ((requestIntent == RequestIntent.None &
                airCareSupervisorStatus.mode == StatusMode.Idle &
                airCareSupervisorStatus.reason == StatusReason.None) |
               (requestIntent == RequestIntent.BlockedInvalid &
                airCareSupervisorStatus.mode == StatusMode.Attention &
                airCareSupervisorStatus.reason == StatusReason.RequestInvalid) |
               (requestIntent == RequestIntent.BlockedRearm &
                airCareSupervisorStatus.mode == StatusMode.Attention &
                airCareSupervisorStatus.reason == StatusReason.RearmRequired));
          // @trace CASE-ARB-03
          case CASE_ARB_03_FILTRATION_PRIORITY:
            assume recoveryGate == RecoveryMemory.Ready &
              (requestIntent == RequestIntent.FreshAuto |
               requestIntent == RequestIntent.HeldAuto |
               requestIntent == RequestIntent.FreshPurge |
               requestIntent == RequestIntent.HeldPurge) &
              (airProposal == AirProposal.FilterNormal |
               airProposal == AirProposal.FilterIntensive);
            guarantee airCareSupervisorStatus.mode == StatusMode.Active &
              ((airProposal == AirProposal.FilterNormal &
                airTreatmentCommand == AirTreatmentCommand.FilterNormal) |
               (airProposal == AirProposal.FilterIntensive &
                airTreatmentCommand == AirTreatmentCommand.FilterIntensive)) &
              ((humidityProposal == HumidityProposal.Dry &
                airCareSupervisorStatus.reason == StatusReason.AirPriority) |
               (humidityProposal == HumidityProposal.InvalidHumidityObservation &
                airCareSupervisorStatus.reason == StatusReason.HumidityObservationInvalid) |
               (humidityProposal == HumidityProposal.DryerUnavailable &
                airCareSupervisorStatus.reason == StatusReason.DryerUnavailable) |
               (humidityProposal == HumidityProposal.None &
                airCareSupervisorStatus.reason == StatusReason.Filtering));
          // @trace CASE-ARB-04
          case CASE_ARB_04_DRY_OR_OFF_RESIDUAL:
            assume recoveryGate == RecoveryMemory.Ready &
              (requestIntent == RequestIntent.FreshAuto |
               requestIntent == RequestIntent.HeldAuto |
               requestIntent == RequestIntent.FreshPurge |
               requestIntent == RequestIntent.HeldPurge) &
              (airProposal == AirProposal.None |
               airProposal == AirProposal.InvalidAirObservation |
               airProposal == AirProposal.FilterUnavailable);
            guarantee airCareSupervisorStatus.mode == StatusMode.Active &
              ((humidityProposal == HumidityProposal.Dry &
                airTreatmentCommand == AirTreatmentCommand.Dry &
                ((airProposal == AirProposal.InvalidAirObservation &
                  airCareSupervisorStatus.reason == StatusReason.AirObservationInvalid) |
                 (airProposal == AirProposal.FilterUnavailable &
                  airCareSupervisorStatus.reason == StatusReason.FilterUnavailable) |
                 (airProposal == AirProposal.None &
                  airCareSupervisorStatus.reason == StatusReason.Drying))) |
               (humidityProposal != HumidityProposal.Dry &
                airTreatmentCommand == AirTreatmentCommand.Off &
                ((airProposal == AirProposal.InvalidAirObservation &
                  airCareSupervisorStatus.reason == StatusReason.AirObservationInvalid) |
                 (airProposal == AirProposal.FilterUnavailable &
                  airCareSupervisorStatus.reason == StatusReason.FilterUnavailable) |
                 (airProposal == AirProposal.None &
                  humidityProposal == HumidityProposal.InvalidHumidityObservation &
                  airCareSupervisorStatus.reason == StatusReason.HumidityObservationInvalid) |
                 (airProposal == AirProposal.None &
                  humidityProposal == HumidityProposal.DryerUnavailable &
                  airCareSupervisorStatus.reason == StatusReason.DryerUnavailable) |
                 (airProposal == AirProposal.None &
                  humidityProposal == HumidityProposal.None &
                  airCareSupervisorStatus.reason == StatusReason.NoTreatmentNeeded))));
    }*/
  }

  // @generated-support CONSTR-01: sole behavior-free Process container and transparent boundary endpoints.
  part def AirCareSupervisionProcess :> Process {
    // @generated-support INT-01: transparent Process endpoint.
    port airCareSelection : DataPort { in :>> type : AirCareSelection; }
    // @generated-support INT-02: transparent Process endpoint.
    port requestValidity : DataPort { in :>> type : RequestValidity; }
    // @generated-support INT-03: transparent Process endpoint.
    port cabinAirQuality : DataPort { in :>> type : CabinAirQuality; }
    // @generated-support INT-04: transparent Process endpoint.
    port airQualityValidity : DataPort { in :>> type : AirQualityValidity; }
    // @generated-support INT-05: transparent Process endpoint.
    port cabinHumidity : DataPort { in :>> type : CabinHumidity; }
    // @generated-support INT-06: transparent Process endpoint.
    port humidityValidity : DataPort { in :>> type : HumidityValidity; }
    // @generated-support INT-07: transparent Process endpoint.
    port treatmentEquipmentStatus : DataPort { in :>> type : TreatmentEquipmentStatus; }
    // @generated-support INT-20: transparent Process endpoint.
    port airTreatmentCommand : DataPort { out :>> type : AirTreatmentCommand; }
    // @generated-support INT-21: transparent Process endpoint.
    port airCareSupervisorStatus : DataPort { out :>> type : AirCareSupervisorStatus; }

    // @trace PART-01
    part requestLifecycleOwner : AirCareRequestLifecycleOwner;
    // @trace PART-02
    part airQualityOwner : AirQualityQualificationOwner;
    // @trace PART-03
    part humidityOwner : HumidityQualificationOwner;
    // @trace PART-04
    part readinessOwner : TreatmentReadinessQualificationOwner;
    // @trace PART-05
    part filtrationProposalOwner : FiltrationProposalOwner;
    // @trace PART-06
    part humidityProposalOwner : HumidityProposalOwner;
    // @trace PART-07
    part recoveryOwner : ReadinessRecoveryOwner;
    // @trace PART-08
    part resultArbiter : AirCarePriorityResultArbiter;

    // @trace INT-01
    connection int01 : PortConnection connect airCareSelection to requestLifecycleOwner.airCareSelection;
    // @trace INT-02
    connection int02 : PortConnection connect requestValidity to requestLifecycleOwner.requestValidity;
    // @trace INT-03
    connection int03 : PortConnection connect cabinAirQuality to airQualityOwner.cabinAirQuality;
    // @trace INT-04
    connection int04 : PortConnection connect airQualityValidity to airQualityOwner.airQualityValidity;
    // @trace INT-05
    connection int05 : PortConnection connect cabinHumidity to humidityOwner.cabinHumidity;
    // @trace INT-06
    connection int06 : PortConnection connect humidityValidity to humidityOwner.humidityValidity;
    // @trace INT-07
    connection int07 : PortConnection connect treatmentEquipmentStatus to readinessOwner.treatmentEquipmentStatus;
    // @trace INT-08
    connection int08 : PortConnection connect requestLifecycleOwner.requestIntent to filtrationProposalOwner.requestIntent;
    // @trace INT-09
    connection int09 : PortConnection connect requestLifecycleOwner.requestIntent to humidityProposalOwner.requestIntent;
    // @trace INT-10
    connection int10 : PortConnection connect requestLifecycleOwner.requestIntent to recoveryOwner.requestIntent;
    // @trace INT-11
    connection int11 : PortConnection connect requestLifecycleOwner.requestIntent to resultArbiter.requestIntent;
    // @trace INT-12
    connection int12 : PortConnection connect airQualityOwner.airAssessment to filtrationProposalOwner.airAssessment;
    // @trace INT-13
    connection int13 : PortConnection connect humidityOwner.humidityAssessment to humidityProposalOwner.humidityAssessment;
    // @trace INT-14
    connection int14 : PortConnection connect readinessOwner.treatmentReadiness to filtrationProposalOwner.treatmentReadiness;
    // @trace INT-15
    connection int15 : PortConnection connect readinessOwner.treatmentReadiness to humidityProposalOwner.treatmentReadiness;
    // @trace INT-16
    connection int16 : PortConnection connect readinessOwner.readinessContext to recoveryOwner.readinessContext;
    // @trace INT-17
    connection int17 : PortConnection connect filtrationProposalOwner.airProposal to resultArbiter.airProposal;
    // @trace INT-18
    connection int18 : PortConnection connect humidityProposalOwner.humidityProposal to resultArbiter.humidityProposal;
    // @trace INT-19
    connection int19 : PortConnection connect recoveryOwner.recoveryGate to resultArbiter.recoveryGate;
    // @trace INT-20
    connection int20 : PortConnection connect resultArbiter.airTreatmentCommand to airTreatmentCommand;
    // @trace INT-21
    connection int21 : PortConnection connect resultArbiter.airCareSupervisorStatus to airCareSupervisorStatus;
  }

  // @trace BOUND-01
  part def CabinAirTreatmentSupervisorSystem :> System {
    // @trace MON-01
    port airCareSelection : DataPort { in :>> type : AirCareSelection; }
    // @trace MON-02
    port requestValidity : DataPort { in :>> type : RequestValidity; }
    // @trace MON-03
    port cabinAirQuality : DataPort { in :>> type : CabinAirQuality; }
    // @trace MON-04
    port airQualityValidity : DataPort { in :>> type : AirQualityValidity; }
    // @trace MON-05
    port cabinHumidity : DataPort { in :>> type : CabinHumidity; }
    // @trace MON-06
    port humidityValidity : DataPort { in :>> type : HumidityValidity; }
    // @trace MON-07
    port treatmentEquipmentStatus : DataPort { in :>> type : TreatmentEquipmentStatus; }
    // @trace CTRL-01
    port airTreatmentCommand : DataPort { out :>> type : AirTreatmentCommand; }
    // @trace CTRL-02
    port airCareSupervisorStatus : DataPort { out :>> type : AirCareSupervisorStatus; }

    // @generated-support CONSTR-01: the approved sole behavior-free Process usage.
    part airCareSupervisionProcess : AirCareSupervisionProcess;

    // @generated-support INT-01: root-to-Process delegation.
    connection support01 : PortConnection connect airCareSelection to airCareSupervisionProcess.airCareSelection;
    // @generated-support INT-02: root-to-Process delegation.
    connection support02 : PortConnection connect requestValidity to airCareSupervisionProcess.requestValidity;
    // @generated-support INT-03: root-to-Process delegation.
    connection support03 : PortConnection connect cabinAirQuality to airCareSupervisionProcess.cabinAirQuality;
    // @generated-support INT-04: root-to-Process delegation.
    connection support04 : PortConnection connect airQualityValidity to airCareSupervisionProcess.airQualityValidity;
    // @generated-support INT-05: root-to-Process delegation.
    connection support05 : PortConnection connect cabinHumidity to airCareSupervisionProcess.cabinHumidity;
    // @generated-support INT-06: root-to-Process delegation.
    connection support06 : PortConnection connect humidityValidity to airCareSupervisionProcess.humidityValidity;
    // @generated-support INT-07: root-to-Process delegation.
    connection support07 : PortConnection connect treatmentEquipmentStatus to airCareSupervisionProcess.treatmentEquipmentStatus;
    // @generated-support INT-20: Process-to-root delegation.
    connection support20 : PortConnection connect airCareSupervisionProcess.airTreatmentCommand to airTreatmentCommand;
    // @generated-support INT-21: Process-to-root delegation.
    connection support21 : PortConnection connect airCareSupervisionProcess.airCareSupervisorStatus to airCareSupervisorStatus;
  }

  // @trace CONSTR-01
  part cabinAirTreatmentSupervisor : CabinAirTreatmentSupervisorSystem;
}
