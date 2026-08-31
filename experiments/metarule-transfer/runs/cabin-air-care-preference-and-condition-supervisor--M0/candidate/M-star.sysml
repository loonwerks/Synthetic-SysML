package Cabin_Air_Treatment_Supervisor {

  private import HAMR::*;

  enum def AirCareSelection { enum Off; enum Auto; enum Purge; }
  enum def RequestValidity { enum Valid; enum Invalid; }
  enum def CabinAirQuality { enum Clean; enum Elevated; enum Poor; }
  enum def AirQualityValidity { enum Valid; enum Invalid; }
  enum def CabinHumidity { enum Dry; enum Comfortable; enum Damp; }
  enum def HumidityValidity { enum Valid; enum Invalid; }
  enum def StatusValidity { enum Valid; enum Invalid; }
  enum def FilterPathStatus { enum Ready; enum Unavailable; }
  enum def DryingPathStatus { enum Ready; enum Unavailable; }

  // Every record member later inspected by GUMBO is an attribute.
  part def TreatmentEquipmentStatus :> Data {
    attribute statusValidity : StatusValidity;
    attribute filtrationChannel : FilterPathStatus;
    attribute dryingChannel : DryingPathStatus;
  }

  enum def AirTreatmentCommand { enum Off; enum FilterNormal; enum FilterIntensive; enum Dry; }
  enum def StatusMode { enum Idle; enum Active; enum Attention; enum Recovery; }
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
  part def AirCareSupervisorStatus :> Data {
    attribute mode : StatusMode;
    attribute reason : StatusReason;
  }

  enum def RequestMemory { enum Released; enum AcceptedActive; enum RearmRequired; }
  enum def RequestIntent {
    enum None;
    enum FreshAuto;
    enum FreshPurge;
    enum HeldAuto;
    enum HeldPurge;
    enum BlockedInvalid;
    enum BlockedRearm;
  }
  enum def AirAssessment { enum Unknown; enum Clear; enum FilterNormalNeeded; enum FilterIntensiveNeeded; }
  enum def HumidityAssessment { enum Unknown; enum NoExcessHumidity; enum DryingNeeded; }
  enum def TreatmentReadiness { enum Unknown; enum NeitherReady; enum FilterOnly; enum DryerOnly; enum BothReady; }
  enum def ReadinessContext { enum CriticalUnknown; enum Clear; }
  enum def AirProposal { enum None; enum InvalidAirObservation; enum FilterUnavailable; enum FilterNormal; enum FilterIntensive; }
  enum def HumidityProposal { enum None; enum InvalidHumidityObservation; enum DryerUnavailable; enum Dry; }
  enum def RecoveryMemory { enum Ready; enum FaultHeld; enum AwaitFresh; }

  part def AirCareRequestLifecycleOwner :> Thread {
    port airCareSelection : DataPort { in :>> type : AirCareSelection; }
    port requestValidity : DataPort { in :>> type : RequestValidity; }
    port requestIntent : DataPort { out :>> type : RequestIntent; }

    language "GUMBO" /*{
      state
        requestMemory: Cabin_Air_Treatment_Supervisor::RequestMemory;
      initialize
        guarantee INITIAL_REQUEST_LIFECYCLE_SAFE:
          requestMemory == Cabin_Air_Treatment_Supervisor::RequestMemory.Released &
          requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.None;
      compute
        compute_cases
          case CASE_RQ_01_INVALID "Invalid request blocks and requires rearm":
            assume requestValidity == Cabin_Air_Treatment_Supervisor::RequestValidity.Invalid;
            guarantee requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.BlockedInvalid &
              requestMemory == Cabin_Air_Treatment_Supervisor::RequestMemory.RearmRequired;
          case CASE_RQ_02_VALID_OFF "Valid Off releases the request lifecycle":
            assume requestValidity == Cabin_Air_Treatment_Supervisor::RequestValidity.Valid &
              airCareSelection == Cabin_Air_Treatment_Supervisor::AirCareSelection.Off;
            guarantee requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.None &
              requestMemory == Cabin_Air_Treatment_Supervisor::RequestMemory.Released;
          case CASE_RQ_03_FRESH_AUTO "Released Auto is fresh":
            assume requestValidity == Cabin_Air_Treatment_Supervisor::RequestValidity.Valid &
              airCareSelection == Cabin_Air_Treatment_Supervisor::AirCareSelection.Auto &
              requestMemory == Cabin_Air_Treatment_Supervisor::RequestMemory.Released;
            guarantee requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.FreshAuto &
              requestMemory == Cabin_Air_Treatment_Supervisor::RequestMemory.AcceptedActive;
          case CASE_RQ_03_FRESH_PURGE "Released Purge is fresh":
            assume requestValidity == Cabin_Air_Treatment_Supervisor::RequestValidity.Valid &
              airCareSelection == Cabin_Air_Treatment_Supervisor::AirCareSelection.Purge &
              requestMemory == Cabin_Air_Treatment_Supervisor::RequestMemory.Released;
            guarantee requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.FreshPurge &
              requestMemory == Cabin_Air_Treatment_Supervisor::RequestMemory.AcceptedActive;
          case CASE_RQ_04_HELD_AUTO "Accepted Auto is held":
            assume requestValidity == Cabin_Air_Treatment_Supervisor::RequestValidity.Valid &
              airCareSelection == Cabin_Air_Treatment_Supervisor::AirCareSelection.Auto &
              requestMemory == Cabin_Air_Treatment_Supervisor::RequestMemory.AcceptedActive;
            guarantee requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.HeldAuto &
              requestMemory == Cabin_Air_Treatment_Supervisor::RequestMemory.AcceptedActive;
          case CASE_RQ_04_HELD_PURGE "Accepted Purge is held":
            assume requestValidity == Cabin_Air_Treatment_Supervisor::RequestValidity.Valid &
              airCareSelection == Cabin_Air_Treatment_Supervisor::AirCareSelection.Purge &
              requestMemory == Cabin_Air_Treatment_Supervisor::RequestMemory.AcceptedActive;
            guarantee requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.HeldPurge &
              requestMemory == Cabin_Air_Treatment_Supervisor::RequestMemory.AcceptedActive;
          case CASE_RQ_05_REARM_BLOCK "Active request remains blocked before Off":
            assume requestValidity == Cabin_Air_Treatment_Supervisor::RequestValidity.Valid &
              airCareSelection != Cabin_Air_Treatment_Supervisor::AirCareSelection.Off &
              requestMemory == Cabin_Air_Treatment_Supervisor::RequestMemory.RearmRequired;
            guarantee requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.BlockedRearm &
              requestMemory == Cabin_Air_Treatment_Supervisor::RequestMemory.RearmRequired;
    }*/
       
  }

  part def AirQualityQualificationOwner :> Thread {
    port cabinAirQuality : DataPort { in :>> type : CabinAirQuality; }
    port airQualityValidity : DataPort { in :>> type : AirQualityValidity; }
    port airAssessment : DataPort { out :>> type : AirAssessment; }
    language "GUMBO" /*{
      initialize
        guarantee INITIAL_AIR_ASSESSMENT_SAFE:
          airAssessment == Cabin_Air_Treatment_Supervisor::AirAssessment.Unknown;
      compute
        compute_cases
          case CASE_AIR_01_INVALID "Invalid air observation is unknown":
            assume airQualityValidity == Cabin_Air_Treatment_Supervisor::AirQualityValidity.Invalid;
            guarantee airAssessment == Cabin_Air_Treatment_Supervisor::AirAssessment.Unknown;
          case CASE_AIR_01_CLEAN "Valid clean air is clear":
            assume airQualityValidity == Cabin_Air_Treatment_Supervisor::AirQualityValidity.Valid &
              cabinAirQuality == Cabin_Air_Treatment_Supervisor::CabinAirQuality.Clean;
            guarantee airAssessment == Cabin_Air_Treatment_Supervisor::AirAssessment.Clear;
          case CASE_AIR_01_ELEVATED "Valid elevated air needs normal filtration":
            assume airQualityValidity == Cabin_Air_Treatment_Supervisor::AirQualityValidity.Valid &
              cabinAirQuality == Cabin_Air_Treatment_Supervisor::CabinAirQuality.Elevated;
            guarantee airAssessment == Cabin_Air_Treatment_Supervisor::AirAssessment.FilterNormalNeeded;
          case CASE_AIR_01_POOR "Valid poor air needs intensive filtration":
            assume airQualityValidity == Cabin_Air_Treatment_Supervisor::AirQualityValidity.Valid &
              cabinAirQuality == Cabin_Air_Treatment_Supervisor::CabinAirQuality.Poor;
            guarantee airAssessment == Cabin_Air_Treatment_Supervisor::AirAssessment.FilterIntensiveNeeded;
    }*/
                                                                   
       
  }

  part def HumidityQualificationOwner :> Thread {
    port cabinHumidity : DataPort { in :>> type : CabinHumidity; }
    port humidityValidity : DataPort { in :>> type : HumidityValidity; }
    port humidityAssessment : DataPort { out :>> type : HumidityAssessment; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_HUMIDITY_ASSESSMENT_SAFE:
          humidityAssessment == Cabin_Air_Treatment_Supervisor::HumidityAssessment.Unknown;
      compute
        compute_cases
          case CASE_HUM_01_INVALID "Invalid humidity observation is unknown":
            assume humidityValidity == Cabin_Air_Treatment_Supervisor::HumidityValidity.Invalid;
            guarantee humidityAssessment == Cabin_Air_Treatment_Supervisor::HumidityAssessment.Unknown;
          case CASE_HUM_01_DAMP "Valid damp cabin needs drying":
            assume humidityValidity == Cabin_Air_Treatment_Supervisor::HumidityValidity.Valid &
              cabinHumidity == Cabin_Air_Treatment_Supervisor::CabinHumidity.Damp;
            guarantee humidityAssessment == Cabin_Air_Treatment_Supervisor::HumidityAssessment.DryingNeeded;
          case CASE_HUM_01_NO_EXCESS "Valid dry or comfortable cabin needs no drying":
            assume humidityValidity == Cabin_Air_Treatment_Supervisor::HumidityValidity.Valid &
              (cabinHumidity == Cabin_Air_Treatment_Supervisor::CabinHumidity.Dry |
               cabinHumidity == Cabin_Air_Treatment_Supervisor::CabinHumidity.Comfortable);
            guarantee humidityAssessment == Cabin_Air_Treatment_Supervisor::HumidityAssessment.NoExcessHumidity;
    }*/
       
  }

  part def TreatmentReadinessQualificationOwner :> Thread {
    port treatmentEquipmentStatus : DataPort { in :>> type : TreatmentEquipmentStatus; }
    port treatmentReadiness : DataPort { out :>> type : TreatmentReadiness; }
    port readinessContext : DataPort { out :>> type : ReadinessContext; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_READINESS_SAFE:
          treatmentReadiness == Cabin_Air_Treatment_Supervisor::TreatmentReadiness.Unknown &
          readinessContext == Cabin_Air_Treatment_Supervisor::ReadinessContext.CriticalUnknown;
      compute
        compute_cases
          case CASE_EQP_01_INVALID "Invalid readiness is critical unknown":
            assume treatmentEquipmentStatus.statusValidity == Cabin_Air_Treatment_Supervisor::StatusValidity.Invalid;
            guarantee treatmentReadiness == Cabin_Air_Treatment_Supervisor::TreatmentReadiness.Unknown &
              readinessContext == Cabin_Air_Treatment_Supervisor::ReadinessContext.CriticalUnknown;
          case CASE_EQP_02_NEITHER "Valid unavailable paths are neither ready":
            assume treatmentEquipmentStatus.statusValidity == Cabin_Air_Treatment_Supervisor::StatusValidity.Valid &
              treatmentEquipmentStatus.filtrationChannel == Cabin_Air_Treatment_Supervisor::FilterPathStatus.Unavailable &
              treatmentEquipmentStatus.dryingChannel == Cabin_Air_Treatment_Supervisor::DryingPathStatus.Unavailable;
            guarantee treatmentReadiness == Cabin_Air_Treatment_Supervisor::TreatmentReadiness.NeitherReady &
              readinessContext == Cabin_Air_Treatment_Supervisor::ReadinessContext.Clear;
          case CASE_EQP_02_FILTER "Valid ready filter only":
            assume treatmentEquipmentStatus.statusValidity == Cabin_Air_Treatment_Supervisor::StatusValidity.Valid &
              treatmentEquipmentStatus.filtrationChannel == Cabin_Air_Treatment_Supervisor::FilterPathStatus.Ready &
              treatmentEquipmentStatus.dryingChannel == Cabin_Air_Treatment_Supervisor::DryingPathStatus.Unavailable;
            guarantee treatmentReadiness == Cabin_Air_Treatment_Supervisor::TreatmentReadiness.FilterOnly &
              readinessContext == Cabin_Air_Treatment_Supervisor::ReadinessContext.Clear;
          case CASE_EQP_02_DRYER "Valid ready dryer only":
            assume treatmentEquipmentStatus.statusValidity == Cabin_Air_Treatment_Supervisor::StatusValidity.Valid &
              treatmentEquipmentStatus.filtrationChannel == Cabin_Air_Treatment_Supervisor::FilterPathStatus.Unavailable &
              treatmentEquipmentStatus.dryingChannel == Cabin_Air_Treatment_Supervisor::DryingPathStatus.Ready;
            guarantee treatmentReadiness == Cabin_Air_Treatment_Supervisor::TreatmentReadiness.DryerOnly &
              readinessContext == Cabin_Air_Treatment_Supervisor::ReadinessContext.Clear;
          case CASE_EQP_02_BOTH "Valid ready paths are both ready":
            assume treatmentEquipmentStatus.statusValidity == Cabin_Air_Treatment_Supervisor::StatusValidity.Valid &
              treatmentEquipmentStatus.filtrationChannel == Cabin_Air_Treatment_Supervisor::FilterPathStatus.Ready &
              treatmentEquipmentStatus.dryingChannel == Cabin_Air_Treatment_Supervisor::DryingPathStatus.Ready;
            guarantee treatmentReadiness == Cabin_Air_Treatment_Supervisor::TreatmentReadiness.BothReady &
              readinessContext == Cabin_Air_Treatment_Supervisor::ReadinessContext.Clear;
    }*/
       
  }

  part def FiltrationProposalOwner :> Thread {
    port requestIntent : DataPort { in :>> type : RequestIntent; }
    port airAssessment : DataPort { in :>> type : AirAssessment; }
    port treatmentReadiness : DataPort { in :>> type : TreatmentReadiness; }
    port airProposal : DataPort { out :>> type : AirProposal; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_AIR_PROPOSAL_SAFE:
          airProposal == Cabin_Air_Treatment_Supervisor::AirProposal.None;
      compute
        compute_cases
          case CASE_AIR_02_NONACTIONABLE "Nonactionable intent makes no air proposal":
            assume requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.None |
              requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.BlockedInvalid |
              requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.BlockedRearm;
            guarantee airProposal == Cabin_Air_Treatment_Supervisor::AirProposal.None;
          case CASE_AIR_02_PURGE_READY "Purge requests intensive filtration when ready":
            assume (requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.FreshPurge |
                    requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.HeldPurge) &
              (treatmentReadiness == Cabin_Air_Treatment_Supervisor::TreatmentReadiness.FilterOnly |
               treatmentReadiness == Cabin_Air_Treatment_Supervisor::TreatmentReadiness.BothReady);
            guarantee airProposal == Cabin_Air_Treatment_Supervisor::AirProposal.FilterIntensive;
          case CASE_AIR_02_PURGE_UNAVAILABLE "Purge reports unavailable filtration":
            assume (requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.FreshPurge |
                    requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.HeldPurge) &
              treatmentReadiness != Cabin_Air_Treatment_Supervisor::TreatmentReadiness.FilterOnly &
              treatmentReadiness != Cabin_Air_Treatment_Supervisor::TreatmentReadiness.BothReady;
            guarantee airProposal == Cabin_Air_Treatment_Supervisor::AirProposal.FilterUnavailable;
          case CASE_AIR_02_AUTO_INVALID "Auto reports invalid air observation":
            assume (requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.FreshAuto |
                    requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.HeldAuto) &
              airAssessment == Cabin_Air_Treatment_Supervisor::AirAssessment.Unknown;
            guarantee airProposal == Cabin_Air_Treatment_Supervisor::AirProposal.InvalidAirObservation;
          case CASE_AIR_02_AUTO_CLEAR "Auto proposes no filtration for clear air":
            assume (requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.FreshAuto |
                    requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.HeldAuto) &
              airAssessment == Cabin_Air_Treatment_Supervisor::AirAssessment.Clear;
            guarantee airProposal == Cabin_Air_Treatment_Supervisor::AirProposal.None;
          case CASE_AIR_02_AUTO_NORMAL "Auto proposes normal filtration when ready":
            assume (requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.FreshAuto |
                    requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.HeldAuto) &
              airAssessment == Cabin_Air_Treatment_Supervisor::AirAssessment.FilterNormalNeeded &
              (treatmentReadiness == Cabin_Air_Treatment_Supervisor::TreatmentReadiness.FilterOnly |
               treatmentReadiness == Cabin_Air_Treatment_Supervisor::TreatmentReadiness.BothReady);
            guarantee airProposal == Cabin_Air_Treatment_Supervisor::AirProposal.FilterNormal;
          case CASE_AIR_02_AUTO_INTENSIVE "Auto proposes intensive filtration when ready":
            assume (requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.FreshAuto |
                    requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.HeldAuto) &
              airAssessment == Cabin_Air_Treatment_Supervisor::AirAssessment.FilterIntensiveNeeded &
              (treatmentReadiness == Cabin_Air_Treatment_Supervisor::TreatmentReadiness.FilterOnly |
               treatmentReadiness == Cabin_Air_Treatment_Supervisor::TreatmentReadiness.BothReady);
            guarantee airProposal == Cabin_Air_Treatment_Supervisor::AirProposal.FilterIntensive;
          case CASE_AIR_02_AUTO_UNAVAILABLE "Auto reports unavailable demanded filtration":
            assume (requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.FreshAuto |
                    requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.HeldAuto) &
              (airAssessment == Cabin_Air_Treatment_Supervisor::AirAssessment.FilterNormalNeeded |
               airAssessment == Cabin_Air_Treatment_Supervisor::AirAssessment.FilterIntensiveNeeded) &
              treatmentReadiness != Cabin_Air_Treatment_Supervisor::TreatmentReadiness.FilterOnly &
              treatmentReadiness != Cabin_Air_Treatment_Supervisor::TreatmentReadiness.BothReady;
            guarantee airProposal == Cabin_Air_Treatment_Supervisor::AirProposal.FilterUnavailable;
    }*/
       
  }

  part def HumidityProposalOwner :> Thread {
    port requestIntent : DataPort { in :>> type : RequestIntent; }
    port humidityAssessment : DataPort { in :>> type : HumidityAssessment; }
    port treatmentReadiness : DataPort { in :>> type : TreatmentReadiness; }
    port humidityProposal : DataPort { out :>> type : HumidityProposal; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_HUMIDITY_PROPOSAL_SAFE:
          humidityProposal == Cabin_Air_Treatment_Supervisor::HumidityProposal.None;
      compute
        compute_cases
          case CASE_HUM_02_NONAUTO "Only automatic intent may propose drying":
            assume requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.None |
              requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.BlockedInvalid |
              requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.BlockedRearm |
              requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.FreshPurge |
              requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.HeldPurge;
            guarantee humidityProposal == Cabin_Air_Treatment_Supervisor::HumidityProposal.None;
          case CASE_HUM_02_INVALID "Auto reports invalid humidity observation":
            assume (requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.FreshAuto |
                    requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.HeldAuto) &
              humidityAssessment == Cabin_Air_Treatment_Supervisor::HumidityAssessment.Unknown;
            guarantee humidityProposal == Cabin_Air_Treatment_Supervisor::HumidityProposal.InvalidHumidityObservation;
          case CASE_HUM_02_NO_EXCESS "No excess humidity proposes nothing":
            assume (requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.FreshAuto |
                    requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.HeldAuto) &
              humidityAssessment == Cabin_Air_Treatment_Supervisor::HumidityAssessment.NoExcessHumidity;
            guarantee humidityProposal == Cabin_Air_Treatment_Supervisor::HumidityProposal.None;
          case CASE_HUM_02_DRY_READY "Excess humidity proposes drying when ready":
            assume (requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.FreshAuto |
                    requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.HeldAuto) &
              humidityAssessment == Cabin_Air_Treatment_Supervisor::HumidityAssessment.DryingNeeded &
              (treatmentReadiness == Cabin_Air_Treatment_Supervisor::TreatmentReadiness.DryerOnly |
               treatmentReadiness == Cabin_Air_Treatment_Supervisor::TreatmentReadiness.BothReady);
            guarantee humidityProposal == Cabin_Air_Treatment_Supervisor::HumidityProposal.Dry;
          case CASE_HUM_02_DRY_UNAVAILABLE "Excess humidity reports unavailable dryer":
            assume (requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.FreshAuto |
                    requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.HeldAuto) &
              humidityAssessment == Cabin_Air_Treatment_Supervisor::HumidityAssessment.DryingNeeded &
              treatmentReadiness != Cabin_Air_Treatment_Supervisor::TreatmentReadiness.DryerOnly &
              treatmentReadiness != Cabin_Air_Treatment_Supervisor::TreatmentReadiness.BothReady;
            guarantee humidityProposal == Cabin_Air_Treatment_Supervisor::HumidityProposal.DryerUnavailable;
    }*/
       
  }

  part def ReadinessRecoveryOwner :> Thread {
    port requestIntent : DataPort { in :>> type : RequestIntent; }
    port readinessContext : DataPort { in :>> type : ReadinessContext; }
    port recoveryGate : DataPort { out :>> type : RecoveryMemory; }

    language "GUMBO" /*{
      state
        recoveryMemory: Cabin_Air_Treatment_Supervisor::RecoveryMemory;
      initialize
        guarantee INITIAL_RECOVERY_SAFE:
          recoveryMemory == Cabin_Air_Treatment_Supervisor::RecoveryMemory.Ready &
          recoveryGate == Cabin_Air_Treatment_Supervisor::RecoveryMemory.Ready;
      compute
        compute_cases
          case CASE_REC_01_CRITICAL_UNKNOWN "Critical unknown readiness holds recovery":
            assume readinessContext == Cabin_Air_Treatment_Supervisor::ReadinessContext.CriticalUnknown;
            guarantee recoveryMemory == Cabin_Air_Treatment_Supervisor::RecoveryMemory.FaultHeld &
              recoveryGate == Cabin_Air_Treatment_Supervisor::RecoveryMemory.FaultHeld;
          case CASE_REC_02_RECOVER_TO_AWAIT_FRESH "Recovery waits for a fresh active request":
            assume readinessContext == Cabin_Air_Treatment_Supervisor::ReadinessContext.Clear &
              recoveryMemory == Cabin_Air_Treatment_Supervisor::RecoveryMemory.FaultHeld;
            guarantee recoveryMemory == Cabin_Air_Treatment_Supervisor::RecoveryMemory.AwaitFresh &
              recoveryGate == Cabin_Air_Treatment_Supervisor::RecoveryMemory.AwaitFresh;
          case CASE_REC_03_FRESH_REAUTHORIZATION "Fresh active request reauthorizes recovery":
            assume readinessContext == Cabin_Air_Treatment_Supervisor::ReadinessContext.Clear &
              recoveryMemory == Cabin_Air_Treatment_Supervisor::RecoveryMemory.AwaitFresh &
              (requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.FreshAuto |
               requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.FreshPurge);
            guarantee recoveryMemory == Cabin_Air_Treatment_Supervisor::RecoveryMemory.Ready &
              recoveryGate == Cabin_Air_Treatment_Supervisor::RecoveryMemory.Ready;
          case CASE_REC_04_RETAIN_AWAIT_FRESH "Recovery retains await-fresh":
            assume readinessContext == Cabin_Air_Treatment_Supervisor::ReadinessContext.Clear &
              recoveryMemory == Cabin_Air_Treatment_Supervisor::RecoveryMemory.AwaitFresh &
              requestIntent != Cabin_Air_Treatment_Supervisor::RequestIntent.FreshAuto &
              requestIntent != Cabin_Air_Treatment_Supervisor::RequestIntent.FreshPurge;
            guarantee recoveryMemory == Cabin_Air_Treatment_Supervisor::RecoveryMemory.AwaitFresh &
              recoveryGate == Cabin_Air_Treatment_Supervisor::RecoveryMemory.AwaitFresh;
          case CASE_REC_05_RETAIN_READY "Clear readiness retains ready":
            assume readinessContext == Cabin_Air_Treatment_Supervisor::ReadinessContext.Clear &
              recoveryMemory == Cabin_Air_Treatment_Supervisor::RecoveryMemory.Ready;
            guarantee recoveryMemory == Cabin_Air_Treatment_Supervisor::RecoveryMemory.Ready &
              recoveryGate == Cabin_Air_Treatment_Supervisor::RecoveryMemory.Ready;
    }*/
       
  }

  part def AirCarePriorityResultArbiter :> Thread {
    port requestIntent : DataPort { in :>> type : RequestIntent; }
    port airProposal : DataPort { in :>> type : AirProposal; }
    port humidityProposal : DataPort { in :>> type : HumidityProposal; }
    port recoveryGate : DataPort { in :>> type : RecoveryMemory; }
    port airTreatmentCommand : DataPort { out :>> type : AirTreatmentCommand; }
    port airCareSupervisorStatus : DataPort { out :>> type : AirCareSupervisorStatus; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_RESULT_SAFE:
          airTreatmentCommand == Cabin_Air_Treatment_Supervisor::AirTreatmentCommand.Off &
          airCareSupervisorStatus.mode == Cabin_Air_Treatment_Supervisor::StatusMode.Idle &
          airCareSupervisorStatus.reason == Cabin_Air_Treatment_Supervisor::StatusReason.None;
      compute
        compute_cases
          case CASE_ARB_01_FAULT_HELD "Fault-held recovery dominates":
            assume recoveryGate == Cabin_Air_Treatment_Supervisor::RecoveryMemory.FaultHeld;
            guarantee airTreatmentCommand == Cabin_Air_Treatment_Supervisor::AirTreatmentCommand.Off &
              airCareSupervisorStatus.mode == Cabin_Air_Treatment_Supervisor::StatusMode.Recovery &
              airCareSupervisorStatus.reason == Cabin_Air_Treatment_Supervisor::StatusReason.ReadinessInvalid;
          case CASE_ARB_01_AWAIT_FRESH "Await-fresh recovery dominates":
            assume recoveryGate == Cabin_Air_Treatment_Supervisor::RecoveryMemory.AwaitFresh;
            guarantee airTreatmentCommand == Cabin_Air_Treatment_Supervisor::AirTreatmentCommand.Off &
              airCareSupervisorStatus.mode == Cabin_Air_Treatment_Supervisor::StatusMode.Recovery &
              airCareSupervisorStatus.reason == Cabin_Air_Treatment_Supervisor::StatusReason.AwaitFresh;
          case CASE_ARB_02_NONE "No request is idle":
            assume recoveryGate == Cabin_Air_Treatment_Supervisor::RecoveryMemory.Ready &
              requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.None;
            guarantee airTreatmentCommand == Cabin_Air_Treatment_Supervisor::AirTreatmentCommand.Off &
              airCareSupervisorStatus.mode == Cabin_Air_Treatment_Supervisor::StatusMode.Idle &
              airCareSupervisorStatus.reason == Cabin_Air_Treatment_Supervisor::StatusReason.None;
          case CASE_ARB_02_INVALID "Invalid request receives attention":
            assume recoveryGate == Cabin_Air_Treatment_Supervisor::RecoveryMemory.Ready &
              requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.BlockedInvalid;
            guarantee airTreatmentCommand == Cabin_Air_Treatment_Supervisor::AirTreatmentCommand.Off &
              airCareSupervisorStatus.mode == Cabin_Air_Treatment_Supervisor::StatusMode.Attention &
              airCareSupervisorStatus.reason == Cabin_Air_Treatment_Supervisor::StatusReason.RequestInvalid;
          case CASE_ARB_02_REARM "Rearm-blocked request receives attention":
            assume recoveryGate == Cabin_Air_Treatment_Supervisor::RecoveryMemory.Ready &
              requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.BlockedRearm;
            guarantee airTreatmentCommand == Cabin_Air_Treatment_Supervisor::AirTreatmentCommand.Off &
              airCareSupervisorStatus.mode == Cabin_Air_Treatment_Supervisor::StatusMode.Attention &
              airCareSupervisorStatus.reason == Cabin_Air_Treatment_Supervisor::StatusReason.RearmRequired;
          case CASE_ARB_03_NORMAL_FILTERING "Normal filtration is active":
            assume recoveryGate == Cabin_Air_Treatment_Supervisor::RecoveryMemory.Ready &
              (requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.FreshAuto |
               requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.HeldAuto |
               requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.FreshPurge |
               requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.HeldPurge) &
              airProposal == Cabin_Air_Treatment_Supervisor::AirProposal.FilterNormal &
              humidityProposal == Cabin_Air_Treatment_Supervisor::HumidityProposal.None;
            guarantee airTreatmentCommand == Cabin_Air_Treatment_Supervisor::AirTreatmentCommand.FilterNormal &
              airCareSupervisorStatus.mode == Cabin_Air_Treatment_Supervisor::StatusMode.Active &
              airCareSupervisorStatus.reason == Cabin_Air_Treatment_Supervisor::StatusReason.Filtering;
          case CASE_ARB_03_INTENSIVE_FILTERING "Intensive filtration is active":
            assume recoveryGate == Cabin_Air_Treatment_Supervisor::RecoveryMemory.Ready &
              (requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.FreshAuto |
               requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.HeldAuto |
               requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.FreshPurge |
               requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.HeldPurge) &
              airProposal == Cabin_Air_Treatment_Supervisor::AirProposal.FilterIntensive &
              humidityProposal == Cabin_Air_Treatment_Supervisor::HumidityProposal.None;
            guarantee airTreatmentCommand == Cabin_Air_Treatment_Supervisor::AirTreatmentCommand.FilterIntensive &
              airCareSupervisorStatus.mode == Cabin_Air_Treatment_Supervisor::StatusMode.Active &
              airCareSupervisorStatus.reason == Cabin_Air_Treatment_Supervisor::StatusReason.Filtering;
          case CASE_ARB_03_PRIORITY "Filtration outranks drying":
            assume recoveryGate == Cabin_Air_Treatment_Supervisor::RecoveryMemory.Ready &
              (requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.FreshAuto |
               requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.HeldAuto |
               requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.FreshPurge |
               requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.HeldPurge) &
              (airProposal == Cabin_Air_Treatment_Supervisor::AirProposal.FilterNormal |
               airProposal == Cabin_Air_Treatment_Supervisor::AirProposal.FilterIntensive) &
              humidityProposal == Cabin_Air_Treatment_Supervisor::HumidityProposal.Dry;
            guarantee airCareSupervisorStatus.mode == Cabin_Air_Treatment_Supervisor::StatusMode.Active &
              airCareSupervisorStatus.reason == Cabin_Air_Treatment_Supervisor::StatusReason.AirPriority &
              ((airProposal == Cabin_Air_Treatment_Supervisor::AirProposal.FilterNormal implies
                airTreatmentCommand == Cabin_Air_Treatment_Supervisor::AirTreatmentCommand.FilterNormal) &
               (airProposal == Cabin_Air_Treatment_Supervisor::AirProposal.FilterIntensive implies
                airTreatmentCommand == Cabin_Air_Treatment_Supervisor::AirTreatmentCommand.FilterIntensive));
          case CASE_ARB_03_FILTER_HUMIDITY_INVALID "Filtering preserves humidity diagnostic":
            assume recoveryGate == Cabin_Air_Treatment_Supervisor::RecoveryMemory.Ready &
              (requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.FreshAuto |
               requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.HeldAuto |
               requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.FreshPurge |
               requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.HeldPurge) &
              (airProposal == Cabin_Air_Treatment_Supervisor::AirProposal.FilterNormal |
               airProposal == Cabin_Air_Treatment_Supervisor::AirProposal.FilterIntensive) &
              humidityProposal == Cabin_Air_Treatment_Supervisor::HumidityProposal.InvalidHumidityObservation;
            guarantee airCareSupervisorStatus.mode == Cabin_Air_Treatment_Supervisor::StatusMode.Active &
              airCareSupervisorStatus.reason == Cabin_Air_Treatment_Supervisor::StatusReason.HumidityObservationInvalid &
              ((airProposal == Cabin_Air_Treatment_Supervisor::AirProposal.FilterNormal implies
                airTreatmentCommand == Cabin_Air_Treatment_Supervisor::AirTreatmentCommand.FilterNormal) &
               (airProposal == Cabin_Air_Treatment_Supervisor::AirProposal.FilterIntensive implies
                airTreatmentCommand == Cabin_Air_Treatment_Supervisor::AirTreatmentCommand.FilterIntensive));
          case CASE_ARB_03_FILTER_DRYER_UNAVAILABLE "Filtering preserves dryer diagnostic":
            assume recoveryGate == Cabin_Air_Treatment_Supervisor::RecoveryMemory.Ready &
              (requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.FreshAuto |
               requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.HeldAuto |
               requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.FreshPurge |
               requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.HeldPurge) &
              (airProposal == Cabin_Air_Treatment_Supervisor::AirProposal.FilterNormal |
               airProposal == Cabin_Air_Treatment_Supervisor::AirProposal.FilterIntensive) &
              humidityProposal == Cabin_Air_Treatment_Supervisor::HumidityProposal.DryerUnavailable;
            guarantee airCareSupervisorStatus.mode == Cabin_Air_Treatment_Supervisor::StatusMode.Active &
              airCareSupervisorStatus.reason == Cabin_Air_Treatment_Supervisor::StatusReason.DryerUnavailable &
              ((airProposal == Cabin_Air_Treatment_Supervisor::AirProposal.FilterNormal implies
                airTreatmentCommand == Cabin_Air_Treatment_Supervisor::AirTreatmentCommand.FilterNormal) &
               (airProposal == Cabin_Air_Treatment_Supervisor::AirProposal.FilterIntensive implies
                airTreatmentCommand == Cabin_Air_Treatment_Supervisor::AirTreatmentCommand.FilterIntensive));
          case CASE_ARB_04_DRYING "Drying is the residual treatment":
            assume recoveryGate == Cabin_Air_Treatment_Supervisor::RecoveryMemory.Ready &
              (requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.FreshAuto |
               requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.HeldAuto |
               requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.FreshPurge |
               requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.HeldPurge) &
              (airProposal == Cabin_Air_Treatment_Supervisor::AirProposal.None |
               airProposal == Cabin_Air_Treatment_Supervisor::AirProposal.InvalidAirObservation |
               airProposal == Cabin_Air_Treatment_Supervisor::AirProposal.FilterUnavailable) &
              humidityProposal == Cabin_Air_Treatment_Supervisor::HumidityProposal.Dry;
            guarantee airTreatmentCommand == Cabin_Air_Treatment_Supervisor::AirTreatmentCommand.Dry &
              airCareSupervisorStatus.mode == Cabin_Air_Treatment_Supervisor::StatusMode.Active &
              ((airProposal == Cabin_Air_Treatment_Supervisor::AirProposal.InvalidAirObservation implies
                airCareSupervisorStatus.reason == Cabin_Air_Treatment_Supervisor::StatusReason.AirObservationInvalid) &
               (airProposal == Cabin_Air_Treatment_Supervisor::AirProposal.FilterUnavailable implies
                airCareSupervisorStatus.reason == Cabin_Air_Treatment_Supervisor::StatusReason.FilterUnavailable) &
               (airProposal == Cabin_Air_Treatment_Supervisor::AirProposal.None implies
                airCareSupervisorStatus.reason == Cabin_Air_Treatment_Supervisor::StatusReason.Drying));
          case CASE_ARB_04_AIR_INVALID "Invalid air observation suppresses treatment":
            assume recoveryGate == Cabin_Air_Treatment_Supervisor::RecoveryMemory.Ready &
              (requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.FreshAuto |
               requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.HeldAuto |
               requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.FreshPurge |
               requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.HeldPurge) &
              airProposal == Cabin_Air_Treatment_Supervisor::AirProposal.InvalidAirObservation &
              humidityProposal != Cabin_Air_Treatment_Supervisor::HumidityProposal.Dry;
            guarantee airTreatmentCommand == Cabin_Air_Treatment_Supervisor::AirTreatmentCommand.Off &
              airCareSupervisorStatus.mode == Cabin_Air_Treatment_Supervisor::StatusMode.Active &
              airCareSupervisorStatus.reason == Cabin_Air_Treatment_Supervisor::StatusReason.AirObservationInvalid;
          case CASE_ARB_04_FILTER_UNAVAILABLE "Unavailable filter suppresses treatment":
            assume recoveryGate == Cabin_Air_Treatment_Supervisor::RecoveryMemory.Ready &
              (requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.FreshAuto |
               requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.HeldAuto |
               requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.FreshPurge |
               requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.HeldPurge) &
              airProposal == Cabin_Air_Treatment_Supervisor::AirProposal.FilterUnavailable &
              humidityProposal != Cabin_Air_Treatment_Supervisor::HumidityProposal.Dry;
            guarantee airTreatmentCommand == Cabin_Air_Treatment_Supervisor::AirTreatmentCommand.Off &
              airCareSupervisorStatus.mode == Cabin_Air_Treatment_Supervisor::StatusMode.Active &
              airCareSupervisorStatus.reason == Cabin_Air_Treatment_Supervisor::StatusReason.FilterUnavailable;
          case CASE_ARB_04_HUMIDITY_INVALID "Invalid humidity observation suppresses treatment":
            assume recoveryGate == Cabin_Air_Treatment_Supervisor::RecoveryMemory.Ready &
              (requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.FreshAuto |
               requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.HeldAuto |
               requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.FreshPurge |
               requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.HeldPurge) &
              airProposal == Cabin_Air_Treatment_Supervisor::AirProposal.None &
              humidityProposal == Cabin_Air_Treatment_Supervisor::HumidityProposal.InvalidHumidityObservation;
            guarantee airTreatmentCommand == Cabin_Air_Treatment_Supervisor::AirTreatmentCommand.Off &
              airCareSupervisorStatus.mode == Cabin_Air_Treatment_Supervisor::StatusMode.Active &
              airCareSupervisorStatus.reason == Cabin_Air_Treatment_Supervisor::StatusReason.HumidityObservationInvalid;
          case CASE_ARB_04_DRYER_UNAVAILABLE "Unavailable dryer suppresses treatment":
            assume recoveryGate == Cabin_Air_Treatment_Supervisor::RecoveryMemory.Ready &
              (requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.FreshAuto |
               requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.HeldAuto |
               requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.FreshPurge |
               requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.HeldPurge) &
              airProposal == Cabin_Air_Treatment_Supervisor::AirProposal.None &
              humidityProposal == Cabin_Air_Treatment_Supervisor::HumidityProposal.DryerUnavailable;
            guarantee airTreatmentCommand == Cabin_Air_Treatment_Supervisor::AirTreatmentCommand.Off &
              airCareSupervisorStatus.mode == Cabin_Air_Treatment_Supervisor::StatusMode.Active &
              airCareSupervisorStatus.reason == Cabin_Air_Treatment_Supervisor::StatusReason.DryerUnavailable;
          case CASE_ARB_04_NO_TREATMENT "No proposals need no treatment":
            assume recoveryGate == Cabin_Air_Treatment_Supervisor::RecoveryMemory.Ready &
              (requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.FreshAuto |
               requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.HeldAuto |
               requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.FreshPurge |
               requestIntent == Cabin_Air_Treatment_Supervisor::RequestIntent.HeldPurge) &
              airProposal == Cabin_Air_Treatment_Supervisor::AirProposal.None &
              humidityProposal == Cabin_Air_Treatment_Supervisor::HumidityProposal.None;
            guarantee airTreatmentCommand == Cabin_Air_Treatment_Supervisor::AirTreatmentCommand.Off &
              airCareSupervisorStatus.mode == Cabin_Air_Treatment_Supervisor::StatusMode.Active &
              airCareSupervisorStatus.reason == Cabin_Air_Treatment_Supervisor::StatusReason.NoTreatmentNeeded;
    }*/
       
  }

  part def AirCareSupervisionProcess :> Process {
    port airCareSelection : DataPort { in :>> type : AirCareSelection; }
    port requestValidity : DataPort { in :>> type : RequestValidity; }
    port cabinAirQuality : DataPort { in :>> type : CabinAirQuality; }
    port airQualityValidity : DataPort { in :>> type : AirQualityValidity; }
    port cabinHumidity : DataPort { in :>> type : CabinHumidity; }
    port humidityValidity : DataPort { in :>> type : HumidityValidity; }
    port treatmentEquipmentStatus : DataPort { in :>> type : TreatmentEquipmentStatus; }
    port airTreatmentCommand : DataPort { out :>> type : AirTreatmentCommand; }
    port airCareSupervisorStatus : DataPort { out :>> type : AirCareSupervisorStatus; }

    part requestLifecycleOwner : AirCareRequestLifecycleOwner;
    part airQualityOwner : AirQualityQualificationOwner;
    part humidityOwner : HumidityQualificationOwner;
    part readinessOwner : TreatmentReadinessQualificationOwner;
    part filtrationProposalOwner : FiltrationProposalOwner;
    part humidityProposalOwner : HumidityProposalOwner;
    part recoveryOwner : ReadinessRecoveryOwner;
    part resultArbiter : AirCarePriorityResultArbiter;

    connection int01 : PortConnection connect airCareSelection to requestLifecycleOwner.airCareSelection;
    connection int02 : PortConnection connect requestValidity to requestLifecycleOwner.requestValidity;
    connection int03 : PortConnection connect cabinAirQuality to airQualityOwner.cabinAirQuality;
    connection int04 : PortConnection connect airQualityValidity to airQualityOwner.airQualityValidity;
    connection int05 : PortConnection connect cabinHumidity to humidityOwner.cabinHumidity;
    connection int06 : PortConnection connect humidityValidity to humidityOwner.humidityValidity;
    connection int07 : PortConnection connect treatmentEquipmentStatus to readinessOwner.treatmentEquipmentStatus;
    connection int08 : PortConnection connect requestLifecycleOwner.requestIntent to filtrationProposalOwner.requestIntent;
    connection int09 : PortConnection connect requestLifecycleOwner.requestIntent to humidityProposalOwner.requestIntent;
    connection int10 : PortConnection connect requestLifecycleOwner.requestIntent to recoveryOwner.requestIntent;
    connection int11 : PortConnection connect requestLifecycleOwner.requestIntent to resultArbiter.requestIntent;
    connection int12 : PortConnection connect airQualityOwner.airAssessment to filtrationProposalOwner.airAssessment;
    connection int13 : PortConnection connect humidityOwner.humidityAssessment to humidityProposalOwner.humidityAssessment;
    connection int14 : PortConnection connect readinessOwner.treatmentReadiness to filtrationProposalOwner.treatmentReadiness;
    connection int15 : PortConnection connect readinessOwner.treatmentReadiness to humidityProposalOwner.treatmentReadiness;
    connection int16 : PortConnection connect readinessOwner.readinessContext to recoveryOwner.readinessContext;
    connection int17 : PortConnection connect filtrationProposalOwner.airProposal to resultArbiter.airProposal;
    connection int18 : PortConnection connect humidityProposalOwner.humidityProposal to resultArbiter.humidityProposal;
    connection int19 : PortConnection connect recoveryOwner.recoveryGate to resultArbiter.recoveryGate;
    connection int20 : PortConnection connect resultArbiter.airTreatmentCommand to airTreatmentCommand;
    connection int21 : PortConnection connect resultArbiter.airCareSupervisorStatus to airCareSupervisorStatus;
  }

  part def CabinAirTreatmentSupervisorSystem :> System {
    port airCareSelection : DataPort { in :>> type : AirCareSelection; }
    port requestValidity : DataPort { in :>> type : RequestValidity; }
    port cabinAirQuality : DataPort { in :>> type : CabinAirQuality; }
    port airQualityValidity : DataPort { in :>> type : AirQualityValidity; }
    port cabinHumidity : DataPort { in :>> type : CabinHumidity; }
    port humidityValidity : DataPort { in :>> type : HumidityValidity; }
    port treatmentEquipmentStatus : DataPort { in :>> type : TreatmentEquipmentStatus; }
    port airTreatmentCommand : DataPort { out :>> type : AirTreatmentCommand; }
    port airCareSupervisorStatus : DataPort { out :>> type : AirCareSupervisorStatus; }

    part airCareSupervisionProcess : AirCareSupervisionProcess;

    connection support01 : PortConnection connect airCareSelection to airCareSupervisionProcess.airCareSelection;
    connection support02 : PortConnection connect requestValidity to airCareSupervisionProcess.requestValidity;
    connection support03 : PortConnection connect cabinAirQuality to airCareSupervisionProcess.cabinAirQuality;
    connection support04 : PortConnection connect airQualityValidity to airCareSupervisionProcess.airQualityValidity;
    connection support05 : PortConnection connect cabinHumidity to airCareSupervisionProcess.cabinHumidity;
    connection support06 : PortConnection connect humidityValidity to airCareSupervisionProcess.humidityValidity;
    connection support07 : PortConnection connect treatmentEquipmentStatus to airCareSupervisionProcess.treatmentEquipmentStatus;
    connection support20 : PortConnection connect airCareSupervisionProcess.airTreatmentCommand to airTreatmentCommand;
    connection support21 : PortConnection connect airCareSupervisionProcess.airCareSupervisorStatus to airCareSupervisorStatus;
  }

  part cabinAirTreatmentSupervisor : CabinAirTreatmentSupervisorSystem;
}
