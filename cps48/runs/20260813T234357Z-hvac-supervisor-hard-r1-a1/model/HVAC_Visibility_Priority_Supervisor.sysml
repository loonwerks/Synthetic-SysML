// Architecture checkpoint: approved HVAC-VIS-01 allocation, without GUMBO behavior.
// @trace BOUND-01
package HVAC_Visibility_Priority_Supervisor {
  private import HAMR::*;

  // Boundary and primitive finite data vocabulary.
  // @trace MON-01
  enum def Validity { enum Valid; enum Invalid; }
  // @trace MON-01
  enum def Arrival { enum New; enum Held; }
  // @trace MON-01
  enum def EnableIntent { enum On; enum Off; }
  // @trace MON-01
  enum def DefrostIntent { enum Requested; enum NotRequested; }
  // @trace MON-01
  enum def ThermalBand { enum Cool; enum Neutral; enum Warm; }
  // @trace MON-01
  enum def FanIntent { enum Low; enum High; }
  // @trace MON-02
  enum def CabinBand { enum Cool; enum Neutral; enum Warm; }
  // @trace MON-01
  part def UserClimateRequest :> Data {
    attribute validity : Validity;
    attribute arrival : Arrival;
    attribute enabled : EnableIntent;
    attribute defrost : DefrostIntent;
    attribute target : ThermalBand;
    attribute fan : FanIntent;
  }
  // @trace MON-02
  part def CabinThermalObservation :> Data {
    attribute validity : Validity;
    attribute band : CabinBand;
  }
  // @trace MON-03
  enum def GlazingCondition { enum Clear; enum Misting; enum Obscured; }
  // @trace MON-03
  part def GlazingObservation :> Data {
    attribute validity : Validity;
    attribute condition : GlazingCondition;
  }
  // @trace MON-04
  enum def HumidityCondition { enum Dry; enum Acceptable; enum Damp; }
  // @trace MON-04
  part def HumidityObservation :> Data {
    attribute validity : Validity;
    attribute condition : HumidityCondition;
  }
  // @trace MON-05
  enum def AirCondition { enum Clean; enum Loaded; }
  // @trace MON-05
  part def AirQualityObservation :> Data {
    attribute validity : Validity;
    attribute condition : AirCondition;
  }
  // @trace MON-06
  enum def InterfaceState { enum Available; enum Unavailable; }
  // @trace MON-06
  enum def Budget { enum Denied; enum Limited; enum Full; }
  // @trace MON-06
  part def ElectricalAvailability :> Data {
    attribute validity : Validity;
    attribute interfaceState : InterfaceState;
    attribute budget : Budget;
  }
  // @trace MON-07
  enum def Availability { enum Available; enum Unavailable; }
  // @trace MON-07
  part def WasteHeatAvailability :> Data {
    attribute validity : Validity;
    attribute availability : Availability;
  }
  // @trace MON-08
  enum def BlowerReadiness { enum Ready; enum Failed; enum Unknown; }
  // @trace MON-08
  enum def ThermalReadiness { enum Ready; enum Failed; enum Unknown; }
  // @trace MON-08
  enum def ClearingReadiness { enum Ready; enum Failed; enum Unknown; }
  // @trace MON-08
  enum def AirTreatmentReadiness { enum Ready; enum Failed; enum Unknown; }
  // @trace MON-08
  part def EquipmentReadiness :> Data {
    attribute validity : Validity;
    attribute circulationState : BlowerReadiness;
    attribute thermal : ThermalReadiness;
    attribute clearing : ClearingReadiness;
    attribute airTreatment : AirTreatmentReadiness;
  }
  // @trace MON-09
  enum def RecoveryAcknowledgment { enum Absent; enum Fresh; }

  // Shared finite derived vocabulary.
  // @trace PART-01
  enum def RequestClass { enum Invalid; enum Off; enum Defrost; enum Comfort; }
  // @trace PART-02
  enum def ThermalNeed { enum Unavailable; enum Heat; enum None; enum Cool; }
  // @trace INT-12
  enum def ThermalObservationValidity { enum Valid; enum Invalid; }
  // @trace PART-03
  enum def VisibilityNeed { enum Unavailable; enum None; enum Preventive; enum Urgent; }
  // @trace PART-04
  enum def HumidityNeed { enum Unavailable; enum None; enum Dry; }
  // @trace PART-05
  enum def AirNeed { enum Unavailable; enum None; enum Filter; }
  // @trace PART-06
  enum def ElectricalTier { enum Ineligible; enum Denied; enum Limited; enum Full; }
  // @trace PART-06
  enum def ElectricalCause { enum None; enum InvalidInterface; enum ElectricalUnavailable; enum ElectricalDenied; }
  // @trace PART-07
  enum def WasteHeatEligibility { enum Eligible; enum Ineligible; }
  // @trace INT-25
  enum def ThermalDegradation { enum None; enum InvalidThermal; }
  // @trace INT-27
  enum def HumidityDegradation { enum None; enum InvalidHumidity; }
  // @trace INT-27
  enum def AirDegradation { enum None; enum InvalidAirQuality; }
  // @trace INT-20
  enum def ThermalBlowerAvailability { enum Available; enum Unavailable; }
  // @trace INT-20
  enum def ThermalEquipmentAvailability { enum Available; enum Unavailable; }
  // @trace INT-21
  enum def VisibilityBlowerAvailability { enum Available; enum Unavailable; }
  // @trace INT-21
  enum def ClearingAvailability { enum Available; enum Unavailable; }
  // @trace INT-22
  enum def AirTreatmentAvailability { enum Available; enum Unavailable; }
  // @trace INT-25
  enum def ThermalProposalAvailability { enum Available; enum Unavailable; }
  // @trace INT-26
  enum def VisibilityProposalAvailability { enum Available; enum Unavailable; }
  // @trace INT-26
  enum def ProposalUrgency { enum Unavailable; enum None; enum Preventive; enum Urgent; }
  // @trace INT-27
  enum def CabinAirProposalAvailability { enum Available; enum Unavailable; }
  // @trace INT-28
  enum def SelectionCause { enum None; enum VisibilityPriority; enum AwaitingRecovery; enum AwaitingFreshRequest; }
  // @trace INT-30
  enum def ArbitrationCause { enum None; enum VisibilityPriority; enum AwaitingRecovery; enum AwaitingFreshRequest; }
  // @trace INT-30
  enum def NoncriticalCause { enum None; enum InvalidThermal; enum InvalidHumidity; enum InvalidAirQuality; }
  // @trace INT-29
  enum def CandidateCause { enum None; enum VisibilityPriority; enum ElectricalUnavailable; enum ElectricalDenied; enum AwaitingRecovery; enum AwaitingFreshRequest; }
  // @trace INT-28
  enum def SelectionMode { enum Idle; enum Active; enum Degraded; enum FaultHold; enum AwaitFresh; }
  // @trace INT-30
  enum def ArbitrationMode { enum Idle; enum Active; enum Degraded; enum FaultHold; enum AwaitFresh; }
  // @trace PART-09
  enum def Authorization { enum Normal; enum AwaitFresh; }
  // @trace PART-14
  enum def RecoveryState { enum Clear; enum Latched; enum Pending; }
  // @trace PART-14
  enum def RecoveryEvent { enum NoRecoveryEvent; enum FaultEntered; enum AwaitingRecovery; enum RecoveryStarted; enum FaultRecurred; enum JustCleared; }
  // @trace INT-17
  enum def ElectricalCriticality { enum Present; enum Absent; }
  // @trace INT-19
  enum def EquipmentCriticality { enum Present; enum Absent; }
  // @trace INT-23
  enum def VisibilityCriticality { enum Present; enum Absent; }
  // @trace INT-31
  enum def RecoveryCause { enum None; enum InvalidVisibility; enum EquipmentFault; enum ElectricalUnavailable; enum AwaitingRecovery; }

  // @trace CTRL-01
  enum def Service { enum None; enum Ventilate; enum Heat; enum Cool; enum Defrost; enum Filter; enum Dry; }
  // @trace CTRL-01
  enum def Intensity { enum Off; enum Reduced; enum Normal; }
  // @trace CTRL-01
  enum def HeatSource { enum None; enum Electrical; enum WasteHeat; }
  // @trace CTRL-01
  enum def EnergyTier { enum None; enum Limited; enum Full; }
  // @trace CTRL-01
  part def CabinActuationPlan :> Data {
    attribute service : Service;
    attribute intensity : Intensity;
    attribute heatSource : HeatSource;
    attribute energyTier : EnergyTier;
  }
  // @trace CTRL-02
  enum def SupervisorMode { enum Idle; enum Active; enum Degraded; enum FaultHold; enum AwaitFresh; }
  // @trace CTRL-02
  enum def StatusCause {
    enum None;
    enum VisibilityPriority;
    enum ElectricalUnavailable;
    enum ElectricalDenied;
    enum EquipmentFault;
    enum InvalidVisibility;
    enum InvalidThermal;
    enum InvalidHumidity;
    enum InvalidAirQuality;
    enum AwaitingRecovery;
    enum AwaitingFreshRequest;
  }
  // @trace CTRL-02
  part def SupervisorStatus :> Data {
    attribute mode : SupervisorMode;
    attribute statusCause : StatusCause;
  }

  // Flat interaction payloads. Every field later inspected by GUMBO is an attribute.
  // @trace INT-10
  part def QualifiedTarget :> Data {
    attribute requestClass : RequestClass;
    attribute target : ThermalBand;
  }
  // @trace INT-11
  part def QualifiedRequest :> Data {
    attribute requestClass : RequestClass;
    attribute arrival : Arrival;
    attribute enabled : EnableIntent;
    attribute fan : FanIntent;
  }
  // @trace INT-12
  part def ThermalAssessment :> Data {
    attribute need : ThermalNeed;
    attribute observationInvalid : ThermalObservationValidity;
  }
  // @trace INT-16
  part def ElectricalEligibility :> Data {
    attribute tier : ElectricalTier;
    attribute eligibilityCause : ElectricalCause;
  }
  // @trace INT-20
  part def ThermalPathReadiness :> Data {
    attribute thermalBlowerReady : ThermalBlowerAvailability;
    attribute thermalReady : ThermalEquipmentAvailability;
  }
  // @trace INT-21
  part def VisibilityPathReadiness :> Data {
    attribute visibilityBlowerReady : VisibilityBlowerAvailability;
    attribute clearingReady : ClearingAvailability;
  }
  // @trace INT-22
  part def AirPathReadiness :> Data {
    attribute airReady : AirTreatmentAvailability;
  }
  // @trace INT-24
  part def RecoveryReport :> Data {
    attribute recoveryState : RecoveryState;
    attribute recoveryEvent : RecoveryEvent;
    attribute faultAttribution : RecoveryCause;
  }
  // @trace INT-25
  part def ThermalProposal :> Data {
    attribute service : Service;
    attribute heatSource : HeatSource;
    attribute thermalApplicability : ThermalProposalAvailability;
    attribute degradation : ThermalDegradation;
  }
  // @trace INT-26
  part def VisibilityProposal :> Data {
    attribute visibilityApplicability : VisibilityProposalAvailability;
    attribute urgency : ProposalUrgency;
  }
  // @trace INT-27
  part def CabinAirProposal :> Data {
    attribute service : Service;
    attribute cabinAirApplicability : CabinAirProposalAvailability;
    attribute humidityDegradation : HumidityDegradation;
    attribute airDegradation : AirDegradation;
  }
  // @trace INT-28
  part def SelectedIntent :> Data {
    attribute service : Service;
    attribute heatSource : HeatSource;
    attribute fan : FanIntent;
    attribute selectedCause : SelectionCause;
    attribute controlMode : SelectionMode;
  }
  // @trace INT-29
  part def CandidatePlan :> Data {
    attribute plan : CabinActuationPlan;
    attribute candidateCause : CandidateCause;
  }
  // @trace INT-30
  part def ArbitrationStatus :> Data {
    attribute authorization : Authorization;
    attribute controlMode : ArbitrationMode;
    attribute arbitrationCause : ArbitrationCause;
    attribute noncriticalCause : NoncriticalCause;
  }

  // Responsibility-bearing semantic Thread definitions.
  // @trace PART-01
  part def RequestQualifier :> Thread {
    // @trace INT-01
    port userRequest : DataPort { in :>> type : UserClimateRequest; }
    // @trace INT-10
    port qualifiedTarget : DataPort { out :>> type : QualifiedTarget; }
    // @trace INT-11
    port qualifiedRequest : DataPort { out :>> type : QualifiedRequest; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace CONSTR-01
          INIT_REQUEST_SAFE "The request owner initializes invalid and unavailable":
            qualifiedTarget.requestClass == RequestClass.Invalid &
            qualifiedTarget.target == ThermalBand.Neutral &
            qualifiedRequest.requestClass == RequestClass.Invalid &
            qualifiedRequest.arrival == Arrival.Held &
            qualifiedRequest.enabled == EnableIntent.Off &
            qualifiedRequest.fan == FanIntent.Low;
      compute
        compute_cases
          // @trace CASE-01
          case CASE_01_INVALID_REQUEST "Invalid validity dominates every request field":
            assume userRequest.validity == Validity.Invalid;
            guarantee qualifiedTarget.requestClass == RequestClass.Invalid &
              qualifiedRequest.requestClass == RequestClass.Invalid &
              qualifiedTarget.target == userRequest.target &
              qualifiedRequest.arrival == userRequest.arrival &
              qualifiedRequest.enabled == userRequest.enabled &
              qualifiedRequest.fan == userRequest.fan;
          // @trace CASE-02
          case CASE_02_DEFROST_REQUEST "A valid explicit defrost request is classified with its freshness":
            assume userRequest.validity == Validity.Valid &
              userRequest.defrost == DefrostIntent.Requested;
            guarantee qualifiedTarget.requestClass == RequestClass.Defrost &
              qualifiedRequest.requestClass == RequestClass.Defrost &
              qualifiedTarget.target == userRequest.target &
              qualifiedRequest.arrival == userRequest.arrival &
              qualifiedRequest.enabled == userRequest.enabled &
              qualifiedRequest.fan == userRequest.fan;
          // @trace CASE-03
          case CASE_03_USER_OFF "A valid non-defrost disabled request is Off":
            assume userRequest.validity == Validity.Valid &
              userRequest.defrost == DefrostIntent.NotRequested &
              userRequest.enabled == EnableIntent.Off;
            guarantee qualifiedTarget.requestClass == RequestClass.Off &
              qualifiedRequest.requestClass == RequestClass.Off &
              qualifiedTarget.target == userRequest.target &
              qualifiedRequest.arrival == userRequest.arrival &
              qualifiedRequest.enabled == userRequest.enabled &
              qualifiedRequest.fan == userRequest.fan;
          // @trace CASE-04
          case CASE_04_COMFORT_REQUEST "The remaining valid enabled request is Comfort":
            assume userRequest.validity == Validity.Valid &
              userRequest.defrost == DefrostIntent.NotRequested &
              userRequest.enabled == EnableIntent.On;
            guarantee qualifiedTarget.requestClass == RequestClass.Comfort &
              qualifiedRequest.requestClass == RequestClass.Comfort &
              qualifiedTarget.target == userRequest.target &
              qualifiedRequest.arrival == userRequest.arrival &
              qualifiedRequest.enabled == userRequest.enabled &
              qualifiedRequest.fan == userRequest.fan;
    }*/
  }
  // @trace PART-02
  part def ThermalNeedAssessor :> Thread {
    // @trace INT-02
    port cabinObservation : DataPort { in :>> type : CabinThermalObservation; }
    // @trace INT-10
    port qualifiedTarget : DataPort { in :>> type : QualifiedTarget; }
    // @trace INT-12
    port thermalAssessment : DataPort { out :>> type : ThermalAssessment; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace CONSTR-01
          INIT_THERMAL_UNAVAILABLE "Thermal assessment initializes unavailable and invalid":
            thermalAssessment.need == ThermalNeed.Unavailable &
            thermalAssessment.observationInvalid == ThermalObservationValidity.Invalid;
      compute
        guarantee
          // @trace PART-02
          THERMAL_COMPARISON "The owner distinguishes invalid observation from unavailable target and compares valid bands":
            ((cabinObservation.validity == Validity.Invalid) implies
              (thermalAssessment.need == ThermalNeed.Unavailable &
               thermalAssessment.observationInvalid == ThermalObservationValidity.Invalid)) &
            ((cabinObservation.validity == Validity.Valid &
              qualifiedTarget.requestClass != RequestClass.Comfort) implies
              (thermalAssessment.need == ThermalNeed.Unavailable &
               thermalAssessment.observationInvalid == ThermalObservationValidity.Valid)) &
            ((cabinObservation.validity == Validity.Valid &
              qualifiedTarget.requestClass == RequestClass.Comfort &
              ((qualifiedTarget.target == ThermalBand.Cool & cabinObservation.band == CabinBand.Cool) |
               (qualifiedTarget.target == ThermalBand.Neutral & cabinObservation.band == CabinBand.Neutral) |
               (qualifiedTarget.target == ThermalBand.Warm & cabinObservation.band == CabinBand.Warm))) implies
              (thermalAssessment.need == ThermalNeed.None &
               thermalAssessment.observationInvalid == ThermalObservationValidity.Valid)) &
            ((cabinObservation.validity == Validity.Valid &
              qualifiedTarget.requestClass == RequestClass.Comfort &
              ((qualifiedTarget.target == ThermalBand.Warm & cabinObservation.band != CabinBand.Warm) |
               (qualifiedTarget.target == ThermalBand.Neutral & cabinObservation.band == CabinBand.Cool))) implies
              (thermalAssessment.need == ThermalNeed.Heat &
               thermalAssessment.observationInvalid == ThermalObservationValidity.Valid)) &
            ((cabinObservation.validity == Validity.Valid &
              qualifiedTarget.requestClass == RequestClass.Comfort &
              ((qualifiedTarget.target == ThermalBand.Cool & cabinObservation.band != CabinBand.Cool) |
               (qualifiedTarget.target == ThermalBand.Neutral & cabinObservation.band == CabinBand.Warm))) implies
              (thermalAssessment.need == ThermalNeed.Cool &
               thermalAssessment.observationInvalid == ThermalObservationValidity.Valid));
    }*/
  }
  // @trace PART-03
  part def VisibilityNeedAssessor :> Thread {
    // @trace INT-03
    port glazingObservation : DataPort { in :>> type : GlazingObservation; }
    // @trace INT-13
    port visibilityNeed : DataPort { out :>> type : VisibilityNeed; }
    // @trace INT-23
    port visibilityFault : DataPort { out :>> type : VisibilityCriticality; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace CONSTR-01
          INIT_VISIBILITY_CRITICAL "Visibility initializes unavailable and critical":
            visibilityNeed == VisibilityNeed.Unavailable &
            visibilityFault == VisibilityCriticality.Present;
      compute
        guarantee
          // @trace PART-03
          VISIBILITY_CLASSIFICATION "Validity and glazing condition determine local urgency and the critical fact":
            ((glazingObservation.validity == Validity.Invalid) implies
              (visibilityNeed == VisibilityNeed.Unavailable)) &
            ((glazingObservation.validity == Validity.Valid &
              glazingObservation.condition == GlazingCondition.Clear) implies
              (visibilityNeed == VisibilityNeed.None)) &
            ((glazingObservation.validity == Validity.Valid &
              glazingObservation.condition == GlazingCondition.Misting) implies
              (visibilityNeed == VisibilityNeed.Preventive)) &
            ((glazingObservation.validity == Validity.Valid &
              glazingObservation.condition == GlazingCondition.Obscured) implies
              (visibilityNeed == VisibilityNeed.Urgent));
        guarantee
          // @trace FAULT-01
          VISIBILITY_CRITICAL_FACT "Invalid visibility alone asserts the critical fact":
            ((visibilityFault == VisibilityCriticality.Present) ==
              (glazingObservation.validity == Validity.Invalid));
    }*/
  }
  // @trace PART-04
  part def HumidityNeedAssessor :> Thread {
    // @trace INT-04
    port humidityObservation : DataPort { in :>> type : HumidityObservation; }
    // @trace INT-14
    port humidityNeed : DataPort { out :>> type : HumidityNeed; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace CONSTR-01
          INIT_HUMIDITY_UNAVAILABLE "Humidity need initializes unavailable": humidityNeed == HumidityNeed.Unavailable;
      compute
        guarantee
          // @trace PART-04
          HUMIDITY_CLASSIFICATION "Only a valid Damp observation creates Dry demand":
            ((humidityObservation.validity == Validity.Invalid) implies (humidityNeed == HumidityNeed.Unavailable)) &
            ((humidityObservation.validity == Validity.Valid & humidityObservation.condition != HumidityCondition.Damp) implies
              (humidityNeed == HumidityNeed.None)) &
            ((humidityObservation.validity == Validity.Valid & humidityObservation.condition == HumidityCondition.Damp) implies
              (humidityNeed == HumidityNeed.Dry));
    }*/
  }
  // @trace PART-05
  part def AirQualityNeedAssessor :> Thread {
    // @trace INT-05
    port airObservation : DataPort { in :>> type : AirQualityObservation; }
    // @trace INT-15
    port airNeed : DataPort { out :>> type : AirNeed; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace CONSTR-01
          INIT_AIR_UNAVAILABLE "Air need initializes unavailable": airNeed == AirNeed.Unavailable;
      compute
        guarantee
          // @trace PART-05
          AIR_CLASSIFICATION "Only a valid Loaded observation creates Filter demand":
            ((airObservation.validity == Validity.Invalid) implies (airNeed == AirNeed.Unavailable)) &
            ((airObservation.validity == Validity.Valid & airObservation.condition == AirCondition.Clean) implies
              (airNeed == AirNeed.None)) &
            ((airObservation.validity == Validity.Valid & airObservation.condition == AirCondition.Loaded) implies
              (airNeed == AirNeed.Filter));
    }*/
  }
  // @trace PART-06
  part def ElectricalEligibilityOwner :> Thread {
    // @trace INT-06
    port electricalAvailability : DataPort { in :>> type : ElectricalAvailability; }
    // @trace INT-16
    port electricalEligibility : DataPort { out :>> type : ElectricalEligibility; }
    // @trace INT-17
    port criticalElectrical : DataPort { out :>> type : ElectricalCriticality; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace CONSTR-01
          INIT_ELECTRICAL_INELIGIBLE "Electrical eligibility initializes critical and ineligible":
            electricalEligibility.tier == ElectricalTier.Ineligible &
            electricalEligibility.eligibilityCause == ElectricalCause.InvalidInterface &
            criticalElectrical == ElectricalCriticality.Present;
      compute
        compute_cases
          // @trace CASE-05
          case CASE_05_INVALID_OR_INCONSISTENT_ELECTRICAL "Invalid data or unavailable interface with an effective budget is ineligible":
            assume electricalAvailability.validity == Validity.Invalid |
              (electricalAvailability.interfaceState == InterfaceState.Unavailable &
               electricalAvailability.budget != Budget.Denied);
            guarantee electricalEligibility.tier == ElectricalTier.Ineligible &
              electricalEligibility.eligibilityCause == ElectricalCause.InvalidInterface &
              criticalElectrical == ElectricalCriticality.Present;
          // @trace CASE-06
          case CASE_06_INTERFACE_UNAVAILABLE "A valid unavailable interface with no effective budget is ineligible":
            assume electricalAvailability.validity == Validity.Valid &
              electricalAvailability.interfaceState == InterfaceState.Unavailable &
              electricalAvailability.budget == Budget.Denied;
            guarantee electricalEligibility.tier == ElectricalTier.Ineligible &
              electricalEligibility.eligibilityCause == ElectricalCause.ElectricalUnavailable &
              criticalElectrical == ElectricalCriticality.Present;
          // @trace CASE-07
          case CASE_07_BUDGET_DENIED "A valid available interface with denied budget remains noncritical but denied":
            assume electricalAvailability.validity == Validity.Valid &
              electricalAvailability.interfaceState == InterfaceState.Available &
              electricalAvailability.budget == Budget.Denied;
            guarantee electricalEligibility.tier == ElectricalTier.Denied &
              electricalEligibility.eligibilityCause == ElectricalCause.ElectricalDenied &
              criticalElectrical == ElectricalCriticality.Absent;
          // @trace CASE-08
          case CASE_08_LIMITED_BUDGET "A valid available Limited budget is eligible at Limited tier":
            assume electricalAvailability.validity == Validity.Valid &
              electricalAvailability.interfaceState == InterfaceState.Available &
              electricalAvailability.budget == Budget.Limited;
            guarantee electricalEligibility.tier == ElectricalTier.Limited &
              electricalEligibility.eligibilityCause == ElectricalCause.None &
              criticalElectrical == ElectricalCriticality.Absent;
          // @trace CASE-09
          case CASE_09_FULL_BUDGET "The remaining valid available Full budget is eligible at Full tier":
            assume electricalAvailability.validity == Validity.Valid &
              electricalAvailability.interfaceState == InterfaceState.Available &
              electricalAvailability.budget == Budget.Full;
            guarantee electricalEligibility.tier == ElectricalTier.Full &
              electricalEligibility.eligibilityCause == ElectricalCause.None &
              criticalElectrical == ElectricalCriticality.Absent;
    }*/
  }
  // @trace PART-07
  part def WasteHeatEligibilityOwner :> Thread {
    // @trace INT-07
    port wasteHeatAvailability : DataPort { in :>> type : WasteHeatAvailability; }
    // @trace INT-18
    port wasteHeatEligibility : DataPort { out :>> type : WasteHeatEligibility; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace CONSTR-01
          INIT_WASTE_HEAT_INELIGIBLE "Waste heat initializes ineligible": wasteHeatEligibility == WasteHeatEligibility.Ineligible;
      compute
        guarantee
          // @trace PART-07
          WASTE_HEAT_ELIGIBILITY "Eligibility requires both validity and Available":
            ((wasteHeatAvailability.validity == Validity.Valid &
              wasteHeatAvailability.availability == Availability.Available) implies
              (wasteHeatEligibility == WasteHeatEligibility.Eligible)) &
            ((wasteHeatAvailability.validity == Validity.Invalid |
              wasteHeatAvailability.availability == Availability.Unavailable) implies
              (wasteHeatEligibility == WasteHeatEligibility.Ineligible));
    }*/
  }
  // @trace PART-08
  part def EquipmentFaultAssessor :> Thread {
    // @trace INT-08
    port equipmentReadiness : DataPort { in :>> type : EquipmentReadiness; }
    // @trace INT-19
    port criticalEquipment : DataPort { out :>> type : EquipmentCriticality; }
    // @trace INT-20
    port thermalPath : DataPort { out :>> type : ThermalPathReadiness; }
    // @trace INT-21
    port visibilityPath : DataPort { out :>> type : VisibilityPathReadiness; }
    // @trace INT-22
    port airPath : DataPort { out :>> type : AirPathReadiness; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace CONSTR-01
          INIT_EQUIPMENT_CRITICAL "Equipment facts initialize fail-closed":
            criticalEquipment == EquipmentCriticality.Present &
            thermalPath.thermalBlowerReady == ThermalBlowerAvailability.Unavailable &
            thermalPath.thermalReady == ThermalEquipmentAvailability.Unavailable &
            visibilityPath.visibilityBlowerReady == VisibilityBlowerAvailability.Unavailable &
            visibilityPath.clearingReady == ClearingAvailability.Unavailable &
            airPath.airReady == AirTreatmentAvailability.Unavailable;
      compute
        guarantee
          // @trace PART-08
          EQUIPMENT_AFFECTED_SET "The owner derives critical feedback and each affected readiness path":
            ((((thermalPath.thermalBlowerReady == ThermalBlowerAvailability.Available) &
               (visibilityPath.visibilityBlowerReady == VisibilityBlowerAvailability.Available)) ==
              (equipmentReadiness.validity == Validity.Valid & equipmentReadiness.circulationState == BlowerReadiness.Ready)) &
             (visibilityPath.visibilityBlowerReady == thermalPath.thermalBlowerReady)) &
            ((criticalEquipment == EquipmentCriticality.Present) ==
              (equipmentReadiness.validity == Validity.Invalid |
               thermalPath.thermalBlowerReady == ThermalBlowerAvailability.Unavailable |
               equipmentReadiness.clearing != ClearingReadiness.Ready |
               equipmentReadiness.thermal == ThermalReadiness.Unknown |
               equipmentReadiness.airTreatment == AirTreatmentReadiness.Unknown)) &
            ((equipmentReadiness.validity == Validity.Valid & equipmentReadiness.thermal == ThermalReadiness.Ready) implies
              (thermalPath.thermalReady == ThermalEquipmentAvailability.Available)) &
            ((equipmentReadiness.validity == Validity.Invalid | equipmentReadiness.thermal != ThermalReadiness.Ready) implies
              (thermalPath.thermalReady == ThermalEquipmentAvailability.Unavailable)) &
            ((equipmentReadiness.validity == Validity.Valid & equipmentReadiness.clearing == ClearingReadiness.Ready) implies
              (visibilityPath.clearingReady == ClearingAvailability.Available)) &
            ((equipmentReadiness.validity == Validity.Invalid | equipmentReadiness.clearing != ClearingReadiness.Ready) implies
              (visibilityPath.clearingReady == ClearingAvailability.Unavailable)) &
            ((equipmentReadiness.validity == Validity.Valid & equipmentReadiness.airTreatment == AirTreatmentReadiness.Ready) implies
              (airPath.airReady == AirTreatmentAvailability.Available)) &
            ((equipmentReadiness.validity == Validity.Invalid | equipmentReadiness.airTreatment != AirTreatmentReadiness.Ready) implies
              (airPath.airReady == AirTreatmentAvailability.Unavailable));
    }*/
  }
  // @trace PART-09
  part def PriorityAuthorizationArbiter :> Thread {
    // @trace INT-11
    port qualifiedRequest : DataPort { in :>> type : QualifiedRequest; }
    // @trace INT-24
    port recoveryReport : DataPort { in :>> type : RecoveryReport; }
    // @trace INT-25
    port thermalProposal : DataPort { in :>> type : ThermalProposal; }
    // @trace INT-26
    port visibilityProposal : DataPort { in :>> type : VisibilityProposal; }
    // @trace INT-27
    port cabinAirProposal : DataPort { in :>> type : CabinAirProposal; }
    // @trace INT-28
    port selectedIntent : DataPort { out :>> type : SelectedIntent; }
    // @trace INT-30
    port arbitrationStatus : DataPort { out :>> type : ArbitrationStatus; }

    language "GUMBO" /*{
      state
        // @trace PART-09
        authorization : Authorization;
      initialize
        guarantee
          // @trace CONSTR-01
          INIT_AUTHORIZATION_NORMAL "Priority authorization initializes Normal with an Idle selection":
            authorization == Authorization.Normal &
            selectedIntent.service == Service.None &
            selectedIntent.heatSource == HeatSource.None &
            selectedIntent.fan == FanIntent.Low &
            selectedIntent.selectedCause == SelectionCause.None &
            selectedIntent.controlMode == SelectionMode.Idle &
            arbitrationStatus.authorization == Authorization.Normal &
            arbitrationStatus.controlMode == ArbitrationMode.Idle &
            arbitrationStatus.arbitrationCause == ArbitrationCause.None &
            arbitrationStatus.noncriticalCause == NoncriticalCause.None;
      compute
        compute_cases
          // @trace CASE-16
          case CASE_16_RECOVERY_HOLD "Latched or Pending recovery forces FaultHold and arms the fresh-request gate":
            assume recoveryReport.recoveryState == RecoveryState.Latched |
              recoveryReport.recoveryState == RecoveryState.Pending;
            guarantee authorization == Authorization.AwaitFresh &
              selectedIntent.service == Service.None & selectedIntent.heatSource == HeatSource.None &
              selectedIntent.fan == qualifiedRequest.fan &
              selectedIntent.selectedCause == SelectionCause.AwaitingRecovery &
              selectedIntent.controlMode == SelectionMode.FaultHold &
              arbitrationStatus.authorization == Authorization.AwaitFresh &
              arbitrationStatus.controlMode == ArbitrationMode.FaultHold &
              arbitrationStatus.arbitrationCause == ArbitrationCause.AwaitingRecovery &
              ((cabinAirProposal.airDegradation == AirDegradation.InvalidAirQuality) implies
                (arbitrationStatus.noncriticalCause == NoncriticalCause.InvalidAirQuality)) &
              ((cabinAirProposal.airDegradation != AirDegradation.InvalidAirQuality &
                cabinAirProposal.humidityDegradation == HumidityDegradation.InvalidHumidity) implies
                (arbitrationStatus.noncriticalCause == NoncriticalCause.InvalidHumidity)) &
              ((cabinAirProposal.airDegradation != AirDegradation.InvalidAirQuality &
                cabinAirProposal.humidityDegradation != HumidityDegradation.InvalidHumidity &
                thermalProposal.degradation == ThermalDegradation.InvalidThermal) implies
                (arbitrationStatus.noncriticalCause == NoncriticalCause.InvalidThermal)) &
              ((cabinAirProposal.airDegradation != AirDegradation.InvalidAirQuality &
                cabinAirProposal.humidityDegradation != HumidityDegradation.InvalidHumidity &
                thermalProposal.degradation != ThermalDegradation.InvalidThermal) implies
                (arbitrationStatus.noncriticalCause == NoncriticalCause.None));
          // @trace CASE-17
          case CASE_17_JUST_CLEARED_HOLD "JustCleared forces AwaitFresh even with a simultaneous fresh request":
            assume recoveryReport.recoveryState == RecoveryState.Clear &
              recoveryReport.recoveryEvent == RecoveryEvent.JustCleared;
            guarantee authorization == Authorization.AwaitFresh &
              selectedIntent.service == Service.None & selectedIntent.heatSource == HeatSource.None &
              selectedIntent.fan == qualifiedRequest.fan &
              selectedIntent.selectedCause == SelectionCause.AwaitingFreshRequest &
              selectedIntent.controlMode == SelectionMode.AwaitFresh &
              arbitrationStatus.authorization == Authorization.AwaitFresh &
              arbitrationStatus.controlMode == ArbitrationMode.AwaitFresh &
              arbitrationStatus.arbitrationCause == ArbitrationCause.AwaitingFreshRequest &
              ((cabinAirProposal.airDegradation == AirDegradation.InvalidAirQuality) implies
                (arbitrationStatus.noncriticalCause == NoncriticalCause.InvalidAirQuality)) &
              ((cabinAirProposal.airDegradation != AirDegradation.InvalidAirQuality & cabinAirProposal.humidityDegradation == HumidityDegradation.InvalidHumidity) implies
                (arbitrationStatus.noncriticalCause == NoncriticalCause.InvalidHumidity)) &
              ((cabinAirProposal.airDegradation != AirDegradation.InvalidAirQuality & cabinAirProposal.humidityDegradation != HumidityDegradation.InvalidHumidity &
                thermalProposal.degradation == ThermalDegradation.InvalidThermal) implies
                (arbitrationStatus.noncriticalCause == NoncriticalCause.InvalidThermal)) &
              ((cabinAirProposal.airDegradation != AirDegradation.InvalidAirQuality & cabinAirProposal.humidityDegradation != HumidityDegradation.InvalidHumidity &
                thermalProposal.degradation != ThermalDegradation.InvalidThermal) implies
                (arbitrationStatus.noncriticalCause == NoncriticalCause.None));
          // @trace CASE-18
          case CASE_18_AWAIT_FRESH_STUTTER "AwaitFresh retains hold without Urgent visibility or a New valid request":
            assume recoveryReport.recoveryState == RecoveryState.Clear &
              recoveryReport.recoveryEvent != RecoveryEvent.JustCleared &
              In(authorization) == Authorization.AwaitFresh &
              (visibilityProposal.visibilityApplicability == VisibilityProposalAvailability.Unavailable |
               visibilityProposal.urgency != ProposalUrgency.Urgent) &
              (qualifiedRequest.arrival != Arrival.New |
               qualifiedRequest.requestClass == RequestClass.Invalid);
            guarantee authorization == Authorization.AwaitFresh &
              selectedIntent.service == Service.None & selectedIntent.heatSource == HeatSource.None &
              selectedIntent.fan == qualifiedRequest.fan &
              selectedIntent.selectedCause == SelectionCause.AwaitingFreshRequest &
              selectedIntent.controlMode == SelectionMode.AwaitFresh &
              arbitrationStatus.authorization == Authorization.AwaitFresh &
              arbitrationStatus.controlMode == ArbitrationMode.AwaitFresh &
              arbitrationStatus.arbitrationCause == ArbitrationCause.AwaitingFreshRequest &
              ((cabinAirProposal.airDegradation == AirDegradation.InvalidAirQuality) implies
                (arbitrationStatus.noncriticalCause == NoncriticalCause.InvalidAirQuality)) &
              ((cabinAirProposal.airDegradation != AirDegradation.InvalidAirQuality & cabinAirProposal.humidityDegradation == HumidityDegradation.InvalidHumidity) implies
                (arbitrationStatus.noncriticalCause == NoncriticalCause.InvalidHumidity)) &
              ((cabinAirProposal.airDegradation != AirDegradation.InvalidAirQuality & cabinAirProposal.humidityDegradation != HumidityDegradation.InvalidHumidity &
                thermalProposal.degradation == ThermalDegradation.InvalidThermal) implies
                (arbitrationStatus.noncriticalCause == NoncriticalCause.InvalidThermal)) &
              ((cabinAirProposal.airDegradation != AirDegradation.InvalidAirQuality & cabinAirProposal.humidityDegradation != HumidityDegradation.InvalidHumidity &
                thermalProposal.degradation != ThermalDegradation.InvalidThermal) implies
                (arbitrationStatus.noncriticalCause == NoncriticalCause.None));
          // @trace CASE-19
          case CASE_19_URGENT_VISIBILITY "An available Urgent visibility proposal overrides Off and AwaitFresh":
            assume recoveryReport.recoveryState == RecoveryState.Clear &
              recoveryReport.recoveryEvent != RecoveryEvent.JustCleared &
              visibilityProposal.visibilityApplicability == VisibilityProposalAvailability.Available &
              visibilityProposal.urgency == ProposalUrgency.Urgent;
            guarantee authorization == Authorization.Normal &
              selectedIntent.service == Service.Defrost & selectedIntent.heatSource == HeatSource.None &
              selectedIntent.fan == qualifiedRequest.fan &
              selectedIntent.selectedCause == SelectionCause.VisibilityPriority &
              selectedIntent.controlMode == SelectionMode.Active &
              arbitrationStatus.authorization == Authorization.Normal &
              arbitrationStatus.controlMode == ArbitrationMode.Active &
              arbitrationStatus.arbitrationCause == ArbitrationCause.VisibilityPriority &
              ((cabinAirProposal.airDegradation == AirDegradation.InvalidAirQuality) implies
                (arbitrationStatus.noncriticalCause == NoncriticalCause.InvalidAirQuality)) &
              ((cabinAirProposal.airDegradation != AirDegradation.InvalidAirQuality & cabinAirProposal.humidityDegradation == HumidityDegradation.InvalidHumidity) implies
                (arbitrationStatus.noncriticalCause == NoncriticalCause.InvalidHumidity)) &
              ((cabinAirProposal.airDegradation != AirDegradation.InvalidAirQuality & cabinAirProposal.humidityDegradation != HumidityDegradation.InvalidHumidity &
                thermalProposal.degradation == ThermalDegradation.InvalidThermal) implies
                (arbitrationStatus.noncriticalCause == NoncriticalCause.InvalidThermal)) &
              ((cabinAirProposal.airDegradation != AirDegradation.InvalidAirQuality & cabinAirProposal.humidityDegradation != HumidityDegradation.InvalidHumidity &
                thermalProposal.degradation != ThermalDegradation.InvalidThermal) implies
                (arbitrationStatus.noncriticalCause == NoncriticalCause.None));
          // @trace CASE-20
          case CASE_20_EXPLICIT_DEFROST "An authorized explicit Defrost request wins whenever the path is Ready":
            assume recoveryReport.recoveryState == RecoveryState.Clear &
              recoveryReport.recoveryEvent != RecoveryEvent.JustCleared &
              (visibilityProposal.visibilityApplicability == VisibilityProposalAvailability.Unavailable | visibilityProposal.urgency != ProposalUrgency.Urgent) &
              (In(authorization) == Authorization.Normal |
               (qualifiedRequest.arrival == Arrival.New & qualifiedRequest.requestClass != RequestClass.Invalid)) &
              qualifiedRequest.requestClass == RequestClass.Defrost &
              visibilityProposal.visibilityApplicability == VisibilityProposalAvailability.Available;
            guarantee authorization == Authorization.Normal &
              selectedIntent.service == Service.Defrost & selectedIntent.heatSource == HeatSource.None &
              selectedIntent.fan == qualifiedRequest.fan & selectedIntent.selectedCause == SelectionCause.None &
              selectedIntent.controlMode == SelectionMode.Active &
              arbitrationStatus.authorization == Authorization.Normal & arbitrationStatus.controlMode == ArbitrationMode.Active &
              arbitrationStatus.arbitrationCause == ArbitrationCause.None &
              ((cabinAirProposal.airDegradation == AirDegradation.InvalidAirQuality) implies (arbitrationStatus.noncriticalCause == NoncriticalCause.InvalidAirQuality)) &
              ((cabinAirProposal.airDegradation != AirDegradation.InvalidAirQuality & cabinAirProposal.humidityDegradation == HumidityDegradation.InvalidHumidity) implies
                (arbitrationStatus.noncriticalCause == NoncriticalCause.InvalidHumidity)) &
              ((cabinAirProposal.airDegradation != AirDegradation.InvalidAirQuality & cabinAirProposal.humidityDegradation != HumidityDegradation.InvalidHumidity &
                thermalProposal.degradation == ThermalDegradation.InvalidThermal) implies (arbitrationStatus.noncriticalCause == NoncriticalCause.InvalidThermal)) &
              ((cabinAirProposal.airDegradation != AirDegradation.InvalidAirQuality & cabinAirProposal.humidityDegradation != HumidityDegradation.InvalidHumidity &
                thermalProposal.degradation != ThermalDegradation.InvalidThermal) implies (arbitrationStatus.noncriticalCause == NoncriticalCause.None));
          // @trace CASE-21
          case CASE_21_OFF_OR_INVALID "Authorized Off or Invalid requests select no service":
            assume recoveryReport.recoveryState == RecoveryState.Clear &
              recoveryReport.recoveryEvent != RecoveryEvent.JustCleared &
              (visibilityProposal.visibilityApplicability == VisibilityProposalAvailability.Unavailable | visibilityProposal.urgency != ProposalUrgency.Urgent) &
              (In(authorization) == Authorization.Normal |
               (qualifiedRequest.arrival == Arrival.New & qualifiedRequest.requestClass != RequestClass.Invalid)) &
              (qualifiedRequest.requestClass == RequestClass.Off | qualifiedRequest.requestClass == RequestClass.Invalid);
            guarantee authorization == Authorization.Normal &
              selectedIntent.service == Service.None & selectedIntent.heatSource == HeatSource.None &
              selectedIntent.fan == qualifiedRequest.fan & selectedIntent.selectedCause == SelectionCause.None &
              selectedIntent.controlMode == SelectionMode.Idle &
              arbitrationStatus.authorization == Authorization.Normal & arbitrationStatus.controlMode == ArbitrationMode.Idle &
              arbitrationStatus.arbitrationCause == ArbitrationCause.None &
              ((cabinAirProposal.airDegradation == AirDegradation.InvalidAirQuality) implies (arbitrationStatus.noncriticalCause == NoncriticalCause.InvalidAirQuality)) &
              ((cabinAirProposal.airDegradation != AirDegradation.InvalidAirQuality & cabinAirProposal.humidityDegradation == HumidityDegradation.InvalidHumidity) implies
                (arbitrationStatus.noncriticalCause == NoncriticalCause.InvalidHumidity)) &
              ((cabinAirProposal.airDegradation != AirDegradation.InvalidAirQuality & cabinAirProposal.humidityDegradation != HumidityDegradation.InvalidHumidity &
                thermalProposal.degradation == ThermalDegradation.InvalidThermal) implies (arbitrationStatus.noncriticalCause == NoncriticalCause.InvalidThermal)) &
              ((cabinAirProposal.airDegradation != AirDegradation.InvalidAirQuality & cabinAirProposal.humidityDegradation != HumidityDegradation.InvalidHumidity &
                thermalProposal.degradation != ThermalDegradation.InvalidThermal) implies (arbitrationStatus.noncriticalCause == NoncriticalCause.None));
          // @trace CASE-22
          case CASE_22_FILTER_PRIORITY "An available Filter proposal wins below explicit visibility and Off":
            assume recoveryReport.recoveryState == RecoveryState.Clear & recoveryReport.recoveryEvent != RecoveryEvent.JustCleared &
              (visibilityProposal.visibilityApplicability == VisibilityProposalAvailability.Unavailable | visibilityProposal.urgency != ProposalUrgency.Urgent) &
              (In(authorization) == Authorization.Normal | (qualifiedRequest.arrival == Arrival.New & qualifiedRequest.requestClass != RequestClass.Invalid)) &
              qualifiedRequest.requestClass != RequestClass.Off & qualifiedRequest.requestClass != RequestClass.Invalid &
              (qualifiedRequest.requestClass != RequestClass.Defrost | visibilityProposal.visibilityApplicability == VisibilityProposalAvailability.Unavailable) &
              cabinAirProposal.cabinAirApplicability == CabinAirProposalAvailability.Available & cabinAirProposal.service == Service.Filter;
            guarantee authorization == Authorization.Normal & selectedIntent.service == Service.Filter &
              selectedIntent.heatSource == HeatSource.None & selectedIntent.fan == qualifiedRequest.fan &
              selectedIntent.selectedCause == SelectionCause.None & selectedIntent.controlMode == SelectionMode.Active &
              arbitrationStatus.authorization == Authorization.Normal & arbitrationStatus.controlMode == ArbitrationMode.Active &
              arbitrationStatus.arbitrationCause == ArbitrationCause.None &
              ((cabinAirProposal.airDegradation == AirDegradation.InvalidAirQuality) implies (arbitrationStatus.noncriticalCause == NoncriticalCause.InvalidAirQuality)) &
              ((cabinAirProposal.airDegradation != AirDegradation.InvalidAirQuality & cabinAirProposal.humidityDegradation == HumidityDegradation.InvalidHumidity) implies (arbitrationStatus.noncriticalCause == NoncriticalCause.InvalidHumidity)) &
              ((cabinAirProposal.airDegradation != AirDegradation.InvalidAirQuality & cabinAirProposal.humidityDegradation != HumidityDegradation.InvalidHumidity & thermalProposal.degradation == ThermalDegradation.InvalidThermal) implies (arbitrationStatus.noncriticalCause == NoncriticalCause.InvalidThermal)) &
              ((cabinAirProposal.airDegradation != AirDegradation.InvalidAirQuality & cabinAirProposal.humidityDegradation != HumidityDegradation.InvalidHumidity & thermalProposal.degradation != ThermalDegradation.InvalidThermal) implies (arbitrationStatus.noncriticalCause == NoncriticalCause.None));
          // @trace CASE-23
          case CASE_23_DRY_PRIORITY "An available Dry proposal wins when Filter is absent":
            assume recoveryReport.recoveryState == RecoveryState.Clear & recoveryReport.recoveryEvent != RecoveryEvent.JustCleared &
              (visibilityProposal.visibilityApplicability == VisibilityProposalAvailability.Unavailable | visibilityProposal.urgency != ProposalUrgency.Urgent) &
              (In(authorization) == Authorization.Normal | (qualifiedRequest.arrival == Arrival.New & qualifiedRequest.requestClass != RequestClass.Invalid)) &
              qualifiedRequest.requestClass != RequestClass.Off & qualifiedRequest.requestClass != RequestClass.Invalid &
              (qualifiedRequest.requestClass != RequestClass.Defrost | visibilityProposal.visibilityApplicability == VisibilityProposalAvailability.Unavailable) &
              (cabinAirProposal.cabinAirApplicability == CabinAirProposalAvailability.Unavailable | cabinAirProposal.service != Service.Filter) &
              cabinAirProposal.cabinAirApplicability == CabinAirProposalAvailability.Available & cabinAirProposal.service == Service.Dry;
            guarantee authorization == Authorization.Normal & selectedIntent.service == Service.Dry &
              selectedIntent.heatSource == HeatSource.None & selectedIntent.fan == qualifiedRequest.fan &
              selectedIntent.selectedCause == SelectionCause.None & selectedIntent.controlMode == SelectionMode.Active &
              arbitrationStatus.authorization == Authorization.Normal & arbitrationStatus.controlMode == ArbitrationMode.Active & arbitrationStatus.arbitrationCause == ArbitrationCause.None &
              ((cabinAirProposal.airDegradation == AirDegradation.InvalidAirQuality) implies (arbitrationStatus.noncriticalCause == NoncriticalCause.InvalidAirQuality)) &
              ((cabinAirProposal.airDegradation != AirDegradation.InvalidAirQuality & cabinAirProposal.humidityDegradation == HumidityDegradation.InvalidHumidity) implies (arbitrationStatus.noncriticalCause == NoncriticalCause.InvalidHumidity)) &
              ((cabinAirProposal.airDegradation != AirDegradation.InvalidAirQuality & cabinAirProposal.humidityDegradation != HumidityDegradation.InvalidHumidity & thermalProposal.degradation == ThermalDegradation.InvalidThermal) implies (arbitrationStatus.noncriticalCause == NoncriticalCause.InvalidThermal)) &
              ((cabinAirProposal.airDegradation != AirDegradation.InvalidAirQuality & cabinAirProposal.humidityDegradation != HumidityDegradation.InvalidHumidity & thermalProposal.degradation != ThermalDegradation.InvalidThermal) implies (arbitrationStatus.noncriticalCause == NoncriticalCause.None));
          // @trace CASE-24
          case CASE_24_THERMAL_PRIORITY "An available Heat or Cool proposal wins below cabin-air services":
            assume recoveryReport.recoveryState == RecoveryState.Clear & recoveryReport.recoveryEvent != RecoveryEvent.JustCleared &
              (visibilityProposal.visibilityApplicability == VisibilityProposalAvailability.Unavailable | visibilityProposal.urgency != ProposalUrgency.Urgent) &
              (In(authorization) == Authorization.Normal | (qualifiedRequest.arrival == Arrival.New & qualifiedRequest.requestClass != RequestClass.Invalid)) &
              qualifiedRequest.requestClass != RequestClass.Off & qualifiedRequest.requestClass != RequestClass.Invalid &
              (qualifiedRequest.requestClass != RequestClass.Defrost | visibilityProposal.visibilityApplicability == VisibilityProposalAvailability.Unavailable) &
              (cabinAirProposal.cabinAirApplicability == CabinAirProposalAvailability.Unavailable |
               (cabinAirProposal.service != Service.Filter & cabinAirProposal.service != Service.Dry)) &
              thermalProposal.thermalApplicability == ThermalProposalAvailability.Available &
              (thermalProposal.service == Service.Heat | thermalProposal.service == Service.Cool);
            guarantee authorization == Authorization.Normal & selectedIntent.service == thermalProposal.service &
              selectedIntent.heatSource == thermalProposal.heatSource & selectedIntent.fan == qualifiedRequest.fan &
              selectedIntent.selectedCause == SelectionCause.None & selectedIntent.controlMode == SelectionMode.Active &
              arbitrationStatus.authorization == Authorization.Normal & arbitrationStatus.controlMode == ArbitrationMode.Active & arbitrationStatus.arbitrationCause == ArbitrationCause.None &
              ((cabinAirProposal.airDegradation == AirDegradation.InvalidAirQuality) implies (arbitrationStatus.noncriticalCause == NoncriticalCause.InvalidAirQuality)) &
              ((cabinAirProposal.airDegradation != AirDegradation.InvalidAirQuality & cabinAirProposal.humidityDegradation == HumidityDegradation.InvalidHumidity) implies (arbitrationStatus.noncriticalCause == NoncriticalCause.InvalidHumidity)) &
              ((cabinAirProposal.airDegradation != AirDegradation.InvalidAirQuality & cabinAirProposal.humidityDegradation != HumidityDegradation.InvalidHumidity & thermalProposal.degradation == ThermalDegradation.InvalidThermal) implies (arbitrationStatus.noncriticalCause == NoncriticalCause.InvalidThermal)) &
              ((cabinAirProposal.airDegradation != AirDegradation.InvalidAirQuality & cabinAirProposal.humidityDegradation != HumidityDegradation.InvalidHumidity & thermalProposal.degradation != ThermalDegradation.InvalidThermal) implies (arbitrationStatus.noncriticalCause == NoncriticalCause.None));
          // @trace CASE-25
          case CASE_25_VENTILATE_OR_NONE "The final authorized branch selects available Ventilate or None":
            assume recoveryReport.recoveryState == RecoveryState.Clear & recoveryReport.recoveryEvent != RecoveryEvent.JustCleared &
              (visibilityProposal.visibilityApplicability == VisibilityProposalAvailability.Unavailable | visibilityProposal.urgency != ProposalUrgency.Urgent) &
              (In(authorization) == Authorization.Normal | (qualifiedRequest.arrival == Arrival.New & qualifiedRequest.requestClass != RequestClass.Invalid)) &
              qualifiedRequest.requestClass != RequestClass.Off & qualifiedRequest.requestClass != RequestClass.Invalid &
              (qualifiedRequest.requestClass != RequestClass.Defrost | visibilityProposal.visibilityApplicability == VisibilityProposalAvailability.Unavailable) &
              (cabinAirProposal.cabinAirApplicability == CabinAirProposalAvailability.Unavailable |
               (cabinAirProposal.service != Service.Filter & cabinAirProposal.service != Service.Dry)) &
              (thermalProposal.thermalApplicability == ThermalProposalAvailability.Unavailable |
               (thermalProposal.service != Service.Heat & thermalProposal.service != Service.Cool));
            guarantee authorization == Authorization.Normal &
              selectedIntent.heatSource == HeatSource.None & selectedIntent.fan == qualifiedRequest.fan & selectedIntent.selectedCause == SelectionCause.None &
              arbitrationStatus.authorization == Authorization.Normal & arbitrationStatus.arbitrationCause == ArbitrationCause.None &
              ((thermalProposal.thermalApplicability == ThermalProposalAvailability.Available & thermalProposal.service == Service.Ventilate) implies
                (selectedIntent.service == Service.Ventilate & selectedIntent.controlMode == SelectionMode.Active & arbitrationStatus.controlMode == ArbitrationMode.Active)) &
              ((thermalProposal.thermalApplicability == ThermalProposalAvailability.Unavailable | thermalProposal.service != Service.Ventilate) implies
                (selectedIntent.service == Service.None & selectedIntent.controlMode == SelectionMode.Idle & arbitrationStatus.controlMode == ArbitrationMode.Idle)) &
              ((cabinAirProposal.airDegradation == AirDegradation.InvalidAirQuality) implies (arbitrationStatus.noncriticalCause == NoncriticalCause.InvalidAirQuality)) &
              ((cabinAirProposal.airDegradation != AirDegradation.InvalidAirQuality & cabinAirProposal.humidityDegradation == HumidityDegradation.InvalidHumidity) implies (arbitrationStatus.noncriticalCause == NoncriticalCause.InvalidHumidity)) &
              ((cabinAirProposal.airDegradation != AirDegradation.InvalidAirQuality & cabinAirProposal.humidityDegradation != HumidityDegradation.InvalidHumidity & thermalProposal.degradation == ThermalDegradation.InvalidThermal) implies (arbitrationStatus.noncriticalCause == NoncriticalCause.InvalidThermal)) &
              ((cabinAirProposal.airDegradation != AirDegradation.InvalidAirQuality & cabinAirProposal.humidityDegradation != HumidityDegradation.InvalidHumidity & thermalProposal.degradation != ThermalDegradation.InvalidThermal) implies (arbitrationStatus.noncriticalCause == NoncriticalCause.None));
    }*/
  }
  // @trace PART-10
  part def ThermalServiceProposer :> Thread {
    // @trace INT-12
    port thermalAssessment : DataPort { in :>> type : ThermalAssessment; }
    // @trace INT-18
    port wasteHeatEligibility : DataPort { in :>> type : WasteHeatEligibility; }
    // @trace INT-20
    port thermalPath : DataPort { in :>> type : ThermalPathReadiness; }
    // @trace INT-25
    port thermalProposal : DataPort { out :>> type : ThermalProposal; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace CONSTR-01
          INIT_THERMAL_PROPOSAL_NONE "Thermal proposal initializes unavailable and all-off":
            thermalProposal.service == Service.None &
            thermalProposal.heatSource == HeatSource.None &
            thermalProposal.thermalApplicability == ThermalProposalAvailability.Unavailable &
            thermalProposal.degradation == ThermalDegradation.InvalidThermal;
      compute
        guarantee
          // @trace PART-10
          THERMAL_PROPOSAL_APPLICABILITY "Thermal need, waste heat, blower, and thermal path derive the local proposal":
            ((thermalAssessment.observationInvalid == ThermalObservationValidity.Invalid) implies
              (thermalProposal.service == Service.None &
               thermalProposal.heatSource == HeatSource.None &
               thermalProposal.thermalApplicability == ThermalProposalAvailability.Unavailable &
               thermalProposal.degradation == ThermalDegradation.InvalidThermal)) &
            ((thermalAssessment.observationInvalid == ThermalObservationValidity.Valid &
              (thermalAssessment.need == ThermalNeed.Unavailable |
               (thermalAssessment.need == ThermalNeed.None & thermalPath.thermalBlowerReady == ThermalBlowerAvailability.Unavailable))) implies
              (thermalProposal.service == Service.None &
               thermalProposal.heatSource == HeatSource.None &
               thermalProposal.thermalApplicability == ThermalProposalAvailability.Unavailable &
               thermalProposal.degradation == ThermalDegradation.None)) &
            ((thermalAssessment.observationInvalid == ThermalObservationValidity.Valid &
              thermalAssessment.need == ThermalNeed.None &
              thermalPath.thermalBlowerReady == ThermalBlowerAvailability.Available) implies
              (thermalProposal.service == Service.Ventilate &
               thermalProposal.heatSource == HeatSource.None &
               thermalProposal.thermalApplicability == ThermalProposalAvailability.Available &
               thermalProposal.degradation == ThermalDegradation.None)) &
            ((thermalAssessment.observationInvalid == ThermalObservationValidity.Valid &
              (thermalAssessment.need == ThermalNeed.Heat | thermalAssessment.need == ThermalNeed.Cool) &
              (thermalPath.thermalBlowerReady == ThermalBlowerAvailability.Unavailable | thermalPath.thermalReady == ThermalEquipmentAvailability.Unavailable)) implies
              (thermalProposal.service == Service.None &
               thermalProposal.heatSource == HeatSource.None &
               thermalProposal.thermalApplicability == ThermalProposalAvailability.Unavailable &
               thermalProposal.degradation == ThermalDegradation.None)) &
            ((thermalAssessment.observationInvalid == ThermalObservationValidity.Valid &
              thermalAssessment.need == ThermalNeed.Heat &
              thermalPath.thermalBlowerReady == ThermalBlowerAvailability.Available &
              thermalPath.thermalReady == ThermalEquipmentAvailability.Available) implies
              (thermalProposal.service == Service.Heat &
               thermalProposal.thermalApplicability == ThermalProposalAvailability.Available &
               thermalProposal.degradation == ThermalDegradation.None &
               ((wasteHeatEligibility == WasteHeatEligibility.Eligible) implies
                 (thermalProposal.heatSource == HeatSource.WasteHeat)) &
               ((wasteHeatEligibility == WasteHeatEligibility.Ineligible) implies
                 (thermalProposal.heatSource == HeatSource.Electrical)))) &
            ((thermalAssessment.observationInvalid == ThermalObservationValidity.Valid &
              thermalAssessment.need == ThermalNeed.Cool &
              thermalPath.thermalBlowerReady == ThermalBlowerAvailability.Available &
              thermalPath.thermalReady == ThermalEquipmentAvailability.Available) implies
              (thermalProposal.service == Service.Cool &
               thermalProposal.heatSource == HeatSource.None &
               thermalProposal.thermalApplicability == ThermalProposalAvailability.Available &
               thermalProposal.degradation == ThermalDegradation.None));
    }*/
  }
  // @trace PART-11
  part def VisibilityServiceProposer :> Thread {
    // @trace INT-13
    port visibilityNeed : DataPort { in :>> type : VisibilityNeed; }
    // @trace INT-21
    port visibilityPath : DataPort { in :>> type : VisibilityPathReadiness; }
    // @trace INT-26
    port visibilityProposal : DataPort { out :>> type : VisibilityProposal; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace CONSTR-01
          INIT_VISIBILITY_PROPOSAL_UNAVAILABLE "Visibility proposal initializes unavailable":
            visibilityProposal.visibilityApplicability == VisibilityProposalAvailability.Unavailable &
            visibilityProposal.urgency == ProposalUrgency.Unavailable;
      compute
        guarantee
          // @trace PART-11
          VISIBILITY_PROPOSAL_APPLICABILITY "Visibility demand is retained separately from clearing-path availability":
            ((visibilityNeed == VisibilityNeed.Unavailable) implies
              (visibilityProposal.visibilityApplicability == VisibilityProposalAvailability.Unavailable)) &
            ((visibilityNeed != VisibilityNeed.Unavailable &
              visibilityPath.visibilityBlowerReady == VisibilityBlowerAvailability.Available &
              visibilityPath.clearingReady == ClearingAvailability.Available) implies
              (visibilityProposal.visibilityApplicability == VisibilityProposalAvailability.Available)) &
            ((visibilityNeed != VisibilityNeed.Unavailable &
              (visibilityPath.visibilityBlowerReady == VisibilityBlowerAvailability.Unavailable |
               visibilityPath.clearingReady == ClearingAvailability.Unavailable)) implies
              (visibilityProposal.visibilityApplicability == VisibilityProposalAvailability.Unavailable));
        guarantee
          // @trace INT-26
          VISIBILITY_URGENCY_MAPPING "The proposal carries the assessor urgency without type aliasing":
            ((visibilityNeed == VisibilityNeed.Unavailable) implies (visibilityProposal.urgency == ProposalUrgency.Unavailable)) &
            ((visibilityNeed == VisibilityNeed.None) implies (visibilityProposal.urgency == ProposalUrgency.None)) &
            ((visibilityNeed == VisibilityNeed.Preventive) implies (visibilityProposal.urgency == ProposalUrgency.Preventive)) &
            ((visibilityNeed == VisibilityNeed.Urgent) implies (visibilityProposal.urgency == ProposalUrgency.Urgent));
    }*/
  }
  // @trace PART-12
  part def CabinAirServiceProposer :> Thread {
    // @trace INT-14
    port humidityNeed : DataPort { in :>> type : HumidityNeed; }
    // @trace INT-15
    port airNeed : DataPort { in :>> type : AirNeed; }
    // @trace INT-22
    port airPath : DataPort { in :>> type : AirPathReadiness; }
    // @trace INT-27
    port cabinAirProposal : DataPort { out :>> type : CabinAirProposal; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace CONSTR-01
          INIT_CABIN_AIR_NONE "Cabin-air proposal initializes unavailable with explicit invalid causes":
            cabinAirProposal.service == Service.None &
            cabinAirProposal.cabinAirApplicability == CabinAirProposalAvailability.Unavailable &
            cabinAirProposal.humidityDegradation == HumidityDegradation.InvalidHumidity &
            cabinAirProposal.airDegradation == AirDegradation.InvalidAirQuality;
      compute
        guarantee
          // @trace PART-12
          CABIN_AIR_LOCAL_PRIORITY "Valid Filter locally outranks Dry while invalidity remains separately exposed":
            ((humidityNeed == HumidityNeed.Unavailable) implies
              (cabinAirProposal.humidityDegradation == HumidityDegradation.InvalidHumidity)) &
            ((humidityNeed != HumidityNeed.Unavailable) implies
              (cabinAirProposal.humidityDegradation == HumidityDegradation.None)) &
            ((airNeed == AirNeed.Unavailable) implies
              (cabinAirProposal.airDegradation == AirDegradation.InvalidAirQuality)) &
            ((airNeed != AirNeed.Unavailable) implies
              (cabinAirProposal.airDegradation == AirDegradation.None)) &
            ((airPath.airReady == AirTreatmentAvailability.Available & airNeed == AirNeed.Filter) implies
              (cabinAirProposal.service == Service.Filter & cabinAirProposal.cabinAirApplicability == CabinAirProposalAvailability.Available)) &
            ((airPath.airReady == AirTreatmentAvailability.Available & airNeed != AirNeed.Filter & humidityNeed == HumidityNeed.Dry) implies
              (cabinAirProposal.service == Service.Dry & cabinAirProposal.cabinAirApplicability == CabinAirProposalAvailability.Available)) &
            (((airPath.airReady == AirTreatmentAvailability.Unavailable) |
              (airNeed != AirNeed.Filter & humidityNeed != HumidityNeed.Dry)) implies
              (cabinAirProposal.service == Service.None & cabinAirProposal.cabinAirApplicability == CabinAirProposalAvailability.Unavailable));
    }*/
  }
  // @trace PART-13
  part def EnergySafePlanComposer :> Thread {
    // @trace INT-16
    port electricalEligibility : DataPort { in :>> type : ElectricalEligibility; }
    // @trace INT-28
    port selectedIntent : DataPort { in :>> type : SelectedIntent; }
    // @trace INT-29
    port candidatePlan : DataPort { out :>> type : CandidatePlan; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace CONSTR-01
          INIT_CANDIDATE_ALL_OFF "The candidate plan initializes to the coherent all-off tuple":
            candidatePlan.plan.service == Service.None &
            candidatePlan.plan.intensity == Intensity.Off &
            candidatePlan.plan.heatSource == HeatSource.None &
            candidatePlan.plan.energyTier == EnergyTier.None &
            candidatePlan.candidateCause == CandidateCause.None;
      compute
        compute_cases
          // @trace CASE-26
          case CASE_26_INELIGIBLE_ALL_OFF "Electrical ineligibility dominates every selected intent":
            assume electricalEligibility.tier == ElectricalTier.Ineligible;
            guarantee candidatePlan.plan.service == Service.None &
              candidatePlan.plan.intensity == Intensity.Off &
              candidatePlan.plan.heatSource == HeatSource.None &
              candidatePlan.plan.energyTier == EnergyTier.None &
              candidatePlan.candidateCause == CandidateCause.ElectricalUnavailable;
          // @trace CASE-27
          case CASE_27_DENIED_OR_NO_SELECTION "Denied energy or a nonservice selection produces the all-off tuple with provenance":
            assume electricalEligibility.tier != ElectricalTier.Ineligible &
              (electricalEligibility.tier == ElectricalTier.Denied |
               selectedIntent.service == Service.None);
            guarantee candidatePlan.plan.service == Service.None &
              candidatePlan.plan.intensity == Intensity.Off &
              candidatePlan.plan.heatSource == HeatSource.None &
              candidatePlan.plan.energyTier == EnergyTier.None &
              ((electricalEligibility.tier == ElectricalTier.Denied) implies
                (candidatePlan.candidateCause == CandidateCause.ElectricalDenied)) &
              ((electricalEligibility.tier != ElectricalTier.Denied & selectedIntent.selectedCause == SelectionCause.None) implies
                (candidatePlan.candidateCause == CandidateCause.None)) &
              ((electricalEligibility.tier != ElectricalTier.Denied & selectedIntent.selectedCause == SelectionCause.AwaitingRecovery) implies
                (candidatePlan.candidateCause == CandidateCause.AwaitingRecovery)) &
              ((electricalEligibility.tier != ElectricalTier.Denied & selectedIntent.selectedCause == SelectionCause.AwaitingFreshRequest) implies
                (candidatePlan.candidateCause == CandidateCause.AwaitingFreshRequest)) &
              ((electricalEligibility.tier != ElectricalTier.Denied & selectedIntent.selectedCause == SelectionCause.VisibilityPriority) implies
                (candidatePlan.candidateCause == CandidateCause.VisibilityPriority));
          // @trace CASE-28
          case CASE_28_DEFROST_PLAN "An eligible Defrost selection is restricted to the current electrical tier":
            assume (electricalEligibility.tier == ElectricalTier.Limited |
              electricalEligibility.tier == ElectricalTier.Full) &
              selectedIntent.service == Service.Defrost;
            guarantee candidatePlan.plan.service == Service.Defrost &
              candidatePlan.plan.heatSource == HeatSource.None &
              ((selectedIntent.selectedCause == SelectionCause.None) implies (candidatePlan.candidateCause == CandidateCause.None)) &
              ((selectedIntent.selectedCause == SelectionCause.VisibilityPriority) implies (candidatePlan.candidateCause == CandidateCause.VisibilityPriority)) &
              ((electricalEligibility.tier == ElectricalTier.Limited) implies
                (candidatePlan.plan.intensity == Intensity.Reduced & candidatePlan.plan.energyTier == EnergyTier.Limited)) &
              ((electricalEligibility.tier == ElectricalTier.Full) implies
                (candidatePlan.plan.intensity == Intensity.Normal & candidatePlan.plan.energyTier == EnergyTier.Full));
          // @trace CASE-29
          case CASE_29_THERMAL_PLAN "Heat or Cool is composed with tier restriction and approved heat-source preference":
            assume (electricalEligibility.tier == ElectricalTier.Limited |
              electricalEligibility.tier == ElectricalTier.Full) &
              (selectedIntent.service == Service.Heat | selectedIntent.service == Service.Cool);
            guarantee candidatePlan.plan.service == selectedIntent.service &
              ((selectedIntent.selectedCause == SelectionCause.None) implies (candidatePlan.candidateCause == CandidateCause.None)) &
              ((selectedIntent.selectedCause == SelectionCause.VisibilityPriority) implies (candidatePlan.candidateCause == CandidateCause.VisibilityPriority)) &
              ((selectedIntent.service == Service.Heat) implies
                (candidatePlan.plan.heatSource == selectedIntent.heatSource)) &
              ((selectedIntent.service == Service.Cool) implies
                (candidatePlan.plan.heatSource == HeatSource.None)) &
              ((electricalEligibility.tier == ElectricalTier.Limited) implies
                (candidatePlan.plan.intensity == Intensity.Reduced & candidatePlan.plan.energyTier == EnergyTier.Limited)) &
              ((electricalEligibility.tier == ElectricalTier.Full) implies
                (candidatePlan.plan.intensity == Intensity.Normal & candidatePlan.plan.energyTier == EnergyTier.Full));
          // @trace CASE-30
          case CASE_30_ENVIRONMENTAL_OR_VENT_PLAN "Filter, Dry, or Ventilate is composed at the eligible electrical tier":
            assume (electricalEligibility.tier == ElectricalTier.Limited |
              electricalEligibility.tier == ElectricalTier.Full) &
              (selectedIntent.service == Service.Filter |
               selectedIntent.service == Service.Dry |
               selectedIntent.service == Service.Ventilate);
            guarantee candidatePlan.plan.service == selectedIntent.service &
              candidatePlan.plan.heatSource == HeatSource.None &
              ((selectedIntent.selectedCause == SelectionCause.None) implies (candidatePlan.candidateCause == CandidateCause.None)) &
              ((selectedIntent.selectedCause == SelectionCause.VisibilityPriority) implies (candidatePlan.candidateCause == CandidateCause.VisibilityPriority)) &
              ((electricalEligibility.tier == ElectricalTier.Limited) implies
                (candidatePlan.plan.intensity == Intensity.Reduced & candidatePlan.plan.energyTier == EnergyTier.Limited)) &
              ((electricalEligibility.tier == ElectricalTier.Full) implies
                (candidatePlan.plan.intensity == Intensity.Normal & candidatePlan.plan.energyTier == EnergyTier.Full));
    }*/
  }
  // @trace PART-14
  part def CriticalFaultRecoveryOwner :> Thread {
    // @trace INT-09
    port recoveryAcknowledgment : DataPort { in :>> type : RecoveryAcknowledgment; }
    // @trace INT-17
    port criticalElectrical : DataPort { in :>> type : ElectricalCriticality; }
    // @trace INT-19
    port criticalEquipment : DataPort { in :>> type : EquipmentCriticality; }
    // @trace INT-23
    port visibilityFault : DataPort { in :>> type : VisibilityCriticality; }
    // @trace INT-24
    port recoveryReport : DataPort { out :>> type : RecoveryReport; }

    language "GUMBO" /*{
      state
        // @trace PART-14
        recovery : RecoveryState;
      initialize
        guarantee
          // @trace CONSTR-01
          INIT_RECOVERY_CLEAR "Recovery initializes Clear with no event or cause":
            recovery == RecoveryState.Clear &
            recoveryReport.recoveryState == RecoveryState.Clear &
            recoveryReport.recoveryEvent == RecoveryEvent.NoRecoveryEvent &
            recoveryReport.faultAttribution == RecoveryCause.None;
      compute
        compute_cases
          // @trace CASE-10
          case CASE_10_ENTER_CRITICAL_HOLD "Any critical fact from Clear latches immediately with deterministic cause":
            assume In(recovery) == RecoveryState.Clear &
              (visibilityFault == VisibilityCriticality.Present |
               criticalEquipment == EquipmentCriticality.Present |
               criticalElectrical == ElectricalCriticality.Present);
            guarantee recovery == RecoveryState.Latched &
              recoveryReport.recoveryState == RecoveryState.Latched &
              recoveryReport.recoveryEvent == RecoveryEvent.FaultEntered &
              ((visibilityFault == VisibilityCriticality.Present) implies
                (recoveryReport.faultAttribution == RecoveryCause.InvalidVisibility)) &
              ((visibilityFault == VisibilityCriticality.Absent &
                criticalEquipment == EquipmentCriticality.Present) implies
                (recoveryReport.faultAttribution == RecoveryCause.EquipmentFault)) &
              ((visibilityFault == VisibilityCriticality.Absent &
                criticalEquipment == EquipmentCriticality.Absent &
                criticalElectrical == ElectricalCriticality.Present) implies
                (recoveryReport.faultAttribution == RecoveryCause.ElectricalUnavailable));
          // @trace CASE-11
          case CASE_11_CLEAR_STUTTER "Clear remains Clear when every critical fact is absent":
            assume In(recovery) == RecoveryState.Clear &
              visibilityFault == VisibilityCriticality.Absent &
              criticalEquipment == EquipmentCriticality.Absent &
              criticalElectrical == ElectricalCriticality.Absent;
            guarantee recovery == RecoveryState.Clear &
              recoveryReport.recoveryState == RecoveryState.Clear &
              recoveryReport.recoveryEvent == RecoveryEvent.NoRecoveryEvent &
              recoveryReport.faultAttribution == RecoveryCause.None;
          // @trace CASE-12
          case CASE_12_LATCHED_WAIT "A persistent fault or absent acknowledgment retains Latched":
            assume In(recovery) == RecoveryState.Latched &
              ((visibilityFault == VisibilityCriticality.Present |
                criticalEquipment == EquipmentCriticality.Present |
                criticalElectrical == ElectricalCriticality.Present) |
               recoveryAcknowledgment == RecoveryAcknowledgment.Absent);
            guarantee recovery == RecoveryState.Latched &
              recoveryReport.recoveryState == RecoveryState.Latched &
              recoveryReport.recoveryEvent == RecoveryEvent.AwaitingRecovery &
              ((visibilityFault == VisibilityCriticality.Present) implies
                (recoveryReport.faultAttribution == RecoveryCause.InvalidVisibility)) &
              ((visibilityFault == VisibilityCriticality.Absent & criticalEquipment == EquipmentCriticality.Present) implies
                (recoveryReport.faultAttribution == RecoveryCause.EquipmentFault)) &
              ((visibilityFault == VisibilityCriticality.Absent & criticalEquipment == EquipmentCriticality.Absent &
                criticalElectrical == ElectricalCriticality.Present) implies
                (recoveryReport.faultAttribution == RecoveryCause.ElectricalUnavailable)) &
              ((visibilityFault == VisibilityCriticality.Absent & criticalEquipment == EquipmentCriticality.Absent &
                criticalElectrical == ElectricalCriticality.Absent) implies
                (recoveryReport.faultAttribution == RecoveryCause.AwaitingRecovery));
          // @trace CASE-13
          case CASE_13_START_RECOVERY "Fresh acknowledgment on an all-healthy Latched evaluation starts Pending":
            assume In(recovery) == RecoveryState.Latched &
              visibilityFault == VisibilityCriticality.Absent &
              criticalEquipment == EquipmentCriticality.Absent &
              criticalElectrical == ElectricalCriticality.Absent &
              recoveryAcknowledgment == RecoveryAcknowledgment.Fresh;
            guarantee recovery == RecoveryState.Pending &
              recoveryReport.recoveryState == RecoveryState.Pending &
              recoveryReport.recoveryEvent == RecoveryEvent.RecoveryStarted &
              recoveryReport.faultAttribution == RecoveryCause.AwaitingRecovery;
          // @trace CASE-14
          case CASE_14_PENDING_RECURRENCE "Any critical recurrence from Pending relatches":
            assume In(recovery) == RecoveryState.Pending &
              (visibilityFault == VisibilityCriticality.Present |
               criticalEquipment == EquipmentCriticality.Present |
               criticalElectrical == ElectricalCriticality.Present);
            guarantee recovery == RecoveryState.Latched &
              recoveryReport.recoveryState == RecoveryState.Latched &
              recoveryReport.recoveryEvent == RecoveryEvent.FaultRecurred &
              ((visibilityFault == VisibilityCriticality.Present) implies
                (recoveryReport.faultAttribution == RecoveryCause.InvalidVisibility)) &
              ((visibilityFault == VisibilityCriticality.Absent & criticalEquipment == EquipmentCriticality.Present) implies
                (recoveryReport.faultAttribution == RecoveryCause.EquipmentFault)) &
              ((visibilityFault == VisibilityCriticality.Absent & criticalEquipment == EquipmentCriticality.Absent &
                criticalElectrical == ElectricalCriticality.Present) implies
                (recoveryReport.faultAttribution == RecoveryCause.ElectricalUnavailable));
          // @trace CASE-15
          case CASE_15_PENDING_CLEAR "A distinct all-healthy Pending evaluation clears with JustCleared":
            assume In(recovery) == RecoveryState.Pending &
              visibilityFault == VisibilityCriticality.Absent &
              criticalEquipment == EquipmentCriticality.Absent &
              criticalElectrical == ElectricalCriticality.Absent;
            guarantee recovery == RecoveryState.Clear &
              recoveryReport.recoveryState == RecoveryState.Clear &
              recoveryReport.recoveryEvent == RecoveryEvent.JustCleared &
              recoveryReport.faultAttribution == RecoveryCause.None;
    }*/
  }
  // @trace PART-15
  part def AtomicResultPublisher :> Thread {
    // @trace INT-29
    port candidatePlan : DataPort { in :>> type : CandidatePlan; }
    // @trace INT-30
    port arbitrationStatus : DataPort { in :>> type : ArbitrationStatus; }
    // @trace INT-31
    port recoveryReport : DataPort { in :>> type : RecoveryReport; }
    // @trace INT-32
    port actuationPlan : DataPort { out :>> type : CabinActuationPlan; }
    // @trace INT-33
    port supervisorStatus : DataPort { out :>> type : SupervisorStatus; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace CONSTR-01
          INIT_PUBLIC_OUTPUTS_SAFE "Public outputs initialize all-off and Idle with no cause":
            actuationPlan.service == Service.None &
            actuationPlan.intensity == Intensity.Off &
            actuationPlan.heatSource == HeatSource.None &
            actuationPlan.energyTier == EnergyTier.None &
            supervisorStatus.mode == SupervisorMode.Idle &
            supervisorStatus.statusCause == StatusCause.None;
      compute
        guarantee
          // @trace COMP-03
          PUBLICATION_MODE_AND_SUPPRESSION "Recovery and authorization holds suppress the candidate while other modes preserve it":
            (((recoveryReport.recoveryState == RecoveryState.Latched) |
              (recoveryReport.recoveryState == RecoveryState.Pending) |
              (arbitrationStatus.controlMode == ArbitrationMode.FaultHold)) implies
              (actuationPlan.service == Service.None & actuationPlan.intensity == Intensity.Off &
               actuationPlan.heatSource == HeatSource.None & actuationPlan.energyTier == EnergyTier.None &
               supervisorStatus.mode == SupervisorMode.FaultHold)) &
            ((recoveryReport.recoveryState == RecoveryState.Clear &
              arbitrationStatus.controlMode == ArbitrationMode.AwaitFresh) implies
              (actuationPlan.service == Service.None & actuationPlan.intensity == Intensity.Off &
               actuationPlan.heatSource == HeatSource.None & actuationPlan.energyTier == EnergyTier.None &
               supervisorStatus.mode == SupervisorMode.AwaitFresh)) &
            ((recoveryReport.recoveryState == RecoveryState.Clear &
              arbitrationStatus.controlMode != ArbitrationMode.FaultHold &
              arbitrationStatus.controlMode != ArbitrationMode.AwaitFresh) implies
              (actuationPlan.service == candidatePlan.plan.service &
               actuationPlan.intensity == candidatePlan.plan.intensity &
               actuationPlan.heatSource == candidatePlan.plan.heatSource &
               actuationPlan.energyTier == candidatePlan.plan.energyTier)) &
            ((recoveryReport.recoveryState == RecoveryState.Clear &
              arbitrationStatus.controlMode != ArbitrationMode.FaultHold &
              arbitrationStatus.controlMode != ArbitrationMode.AwaitFresh &
              candidatePlan.candidateCause == CandidateCause.ElectricalDenied) implies
              (supervisorStatus.mode == SupervisorMode.Degraded)) &
            ((recoveryReport.recoveryState == RecoveryState.Clear &
              arbitrationStatus.controlMode != ArbitrationMode.FaultHold &
              arbitrationStatus.controlMode != ArbitrationMode.AwaitFresh &
              candidatePlan.candidateCause != CandidateCause.ElectricalDenied &
              arbitrationStatus.noncriticalCause != NoncriticalCause.None) implies
              (supervisorStatus.mode == SupervisorMode.Degraded)) &
            ((recoveryReport.recoveryState == RecoveryState.Clear &
              arbitrationStatus.controlMode != ArbitrationMode.FaultHold &
              arbitrationStatus.controlMode != ArbitrationMode.AwaitFresh &
              candidatePlan.candidateCause != CandidateCause.ElectricalDenied &
              arbitrationStatus.noncriticalCause == NoncriticalCause.None) implies
              (((arbitrationStatus.controlMode == ArbitrationMode.Idle) implies
                 (supervisorStatus.mode == SupervisorMode.Idle)) &
               ((arbitrationStatus.controlMode == ArbitrationMode.Active) implies
                 (supervisorStatus.mode == SupervisorMode.Active)) &
               ((arbitrationStatus.controlMode == ArbitrationMode.Degraded) implies
                 (supervisorStatus.mode == SupervisorMode.Degraded))));
        guarantee
          // @trace CAUSE-03
          PUBLICATION_CAUSE_PRECEDENCE "Exactly one published cause follows critical, recovery, fresh, denial, visibility, and degradation precedence":
            ((recoveryReport.recoveryState != RecoveryState.Clear &
              recoveryReport.faultAttribution == RecoveryCause.InvalidVisibility) implies
              (supervisorStatus.statusCause == StatusCause.InvalidVisibility)) &
            ((recoveryReport.recoveryState != RecoveryState.Clear &
              recoveryReport.faultAttribution == RecoveryCause.EquipmentFault) implies
              (supervisorStatus.statusCause == StatusCause.EquipmentFault)) &
            ((recoveryReport.recoveryState != RecoveryState.Clear &
              recoveryReport.faultAttribution == RecoveryCause.ElectricalUnavailable) implies
              (supervisorStatus.statusCause == StatusCause.ElectricalUnavailable)) &
            ((recoveryReport.recoveryState != RecoveryState.Clear &
              recoveryReport.faultAttribution == RecoveryCause.AwaitingRecovery) implies
              (supervisorStatus.statusCause == StatusCause.AwaitingRecovery)) &
            ((recoveryReport.recoveryState == RecoveryState.Clear &
              arbitrationStatus.controlMode == ArbitrationMode.AwaitFresh) implies
              (supervisorStatus.statusCause == StatusCause.AwaitingFreshRequest)) &
            ((recoveryReport.recoveryState == RecoveryState.Clear &
              arbitrationStatus.controlMode != ArbitrationMode.AwaitFresh &
              candidatePlan.candidateCause == CandidateCause.ElectricalDenied) implies
              (supervisorStatus.statusCause == StatusCause.ElectricalDenied)) &
            ((recoveryReport.recoveryState == RecoveryState.Clear &
              arbitrationStatus.controlMode != ArbitrationMode.AwaitFresh &
              candidatePlan.candidateCause != CandidateCause.ElectricalDenied &
              arbitrationStatus.arbitrationCause == ArbitrationCause.VisibilityPriority) implies
              (supervisorStatus.statusCause == StatusCause.VisibilityPriority)) &
            ((recoveryReport.recoveryState == RecoveryState.Clear &
              arbitrationStatus.controlMode != ArbitrationMode.AwaitFresh &
              candidatePlan.candidateCause != CandidateCause.ElectricalDenied &
              arbitrationStatus.arbitrationCause != ArbitrationCause.VisibilityPriority &
              arbitrationStatus.noncriticalCause != NoncriticalCause.None) implies
              (((arbitrationStatus.noncriticalCause == NoncriticalCause.InvalidAirQuality) implies
                 (supervisorStatus.statusCause == StatusCause.InvalidAirQuality)) &
               ((arbitrationStatus.noncriticalCause == NoncriticalCause.InvalidHumidity) implies
                 (supervisorStatus.statusCause == StatusCause.InvalidHumidity)) &
               ((arbitrationStatus.noncriticalCause == NoncriticalCause.InvalidThermal) implies
                 (supervisorStatus.statusCause == StatusCause.InvalidThermal)))) &
            ((recoveryReport.recoveryState == RecoveryState.Clear &
              arbitrationStatus.controlMode != ArbitrationMode.AwaitFresh &
              candidatePlan.candidateCause != CandidateCause.ElectricalDenied &
              arbitrationStatus.arbitrationCause != ArbitrationCause.VisibilityPriority &
              arbitrationStatus.noncriticalCause == NoncriticalCause.None) implies
              (supervisorStatus.statusCause == StatusCause.None));
        guarantee
          // @trace COMP-01
          PUBLIC_PLAN_COHERENCE "The published service tuple is coherent":
            ((actuationPlan.service == Service.None) implies
              (actuationPlan.intensity == Intensity.Off & actuationPlan.heatSource == HeatSource.None &
               actuationPlan.energyTier == EnergyTier.None)) &
            ((actuationPlan.service != Service.None) implies
              (actuationPlan.intensity != Intensity.Off & actuationPlan.energyTier != EnergyTier.None));
        guarantee
          // @trace COMP-02
          PUBLIC_HEAT_SOURCE_COHERENCE "Only Heat may carry an electrical or waste-heat source":
            ((actuationPlan.service != Service.Heat) implies (actuationPlan.heatSource == HeatSource.None)) &
            ((actuationPlan.heatSource == HeatSource.Electrical | actuationPlan.heatSource == HeatSource.WasteHeat) implies
              (actuationPlan.service == Service.Heat));
    }*/
  }

  // @generated-support SUPPORT-01 behavior-free containment and boundary delegation.
  part def HVACSupervisionProcess :> Process {
    port userRequest : DataPort { in :>> type : UserClimateRequest; }
    port cabinObservation : DataPort { in :>> type : CabinThermalObservation; }
    port glazingObservation : DataPort { in :>> type : GlazingObservation; }
    port humidityObservation : DataPort { in :>> type : HumidityObservation; }
    port airObservation : DataPort { in :>> type : AirQualityObservation; }
    port electricalAvailability : DataPort { in :>> type : ElectricalAvailability; }
    port wasteHeatAvailability : DataPort { in :>> type : WasteHeatAvailability; }
    port equipmentReadiness : DataPort { in :>> type : EquipmentReadiness; }
    port recoveryAcknowledgment : DataPort { in :>> type : RecoveryAcknowledgment; }
    port actuationPlan : DataPort { out :>> type : CabinActuationPlan; }
    port supervisorStatus : DataPort { out :>> type : SupervisorStatus; }

    // @trace PART-01
    part requestQualifier : RequestQualifier;
    // @trace PART-02
    part thermalNeedAssessor : ThermalNeedAssessor;
    // @trace PART-03
    part visibilityNeedAssessor : VisibilityNeedAssessor;
    // @trace PART-04
    part humidityNeedAssessor : HumidityNeedAssessor;
    // @trace PART-05
    part airQualityNeedAssessor : AirQualityNeedAssessor;
    // @trace PART-06
    part electricalEligibilityOwner : ElectricalEligibilityOwner;
    // @trace PART-07
    part wasteHeatEligibilityOwner : WasteHeatEligibilityOwner;
    // @trace PART-08
    part equipmentFaultAssessor : EquipmentFaultAssessor;
    // @trace PART-09
    part priorityAuthorizationArbiter : PriorityAuthorizationArbiter;
    // @trace PART-10
    part thermalServiceProposer : ThermalServiceProposer;
    // @trace PART-11
    part visibilityServiceProposer : VisibilityServiceProposer;
    // @trace PART-12
    part cabinAirServiceProposer : CabinAirServiceProposer;
    // @trace PART-13
    part energySafePlanComposer : EnergySafePlanComposer;
    // @trace PART-14
    part criticalFaultRecoveryOwner : CriticalFaultRecoveryOwner;
    // @trace PART-15
    part atomicResultPublisher : AtomicResultPublisher;

    // The 33 semantic connections; boundary routes here are the inner hop.
    // @trace INT-01
    connection int01 : PortConnection connect userRequest to requestQualifier.userRequest;
    // @trace INT-02
    connection int02 : PortConnection connect cabinObservation to thermalNeedAssessor.cabinObservation;
    // @trace INT-03
    connection int03 : PortConnection connect glazingObservation to visibilityNeedAssessor.glazingObservation;
    // @trace INT-04
    connection int04 : PortConnection connect humidityObservation to humidityNeedAssessor.humidityObservation;
    // @trace INT-05
    connection int05 : PortConnection connect airObservation to airQualityNeedAssessor.airObservation;
    // @trace INT-06
    connection int06 : PortConnection connect electricalAvailability to electricalEligibilityOwner.electricalAvailability;
    // @trace INT-07
    connection int07 : PortConnection connect wasteHeatAvailability to wasteHeatEligibilityOwner.wasteHeatAvailability;
    // @trace INT-08
    connection int08 : PortConnection connect equipmentReadiness to equipmentFaultAssessor.equipmentReadiness;
    // @trace INT-09
    connection int09 : PortConnection connect recoveryAcknowledgment to criticalFaultRecoveryOwner.recoveryAcknowledgment;
    // @trace INT-10
    connection int10 : PortConnection connect requestQualifier.qualifiedTarget to thermalNeedAssessor.qualifiedTarget;
    // @trace INT-11
    connection int11 : PortConnection connect requestQualifier.qualifiedRequest to priorityAuthorizationArbiter.qualifiedRequest;
    // @trace INT-12
    connection int12 : PortConnection connect thermalNeedAssessor.thermalAssessment to thermalServiceProposer.thermalAssessment;
    // @trace INT-13
    connection int13 : PortConnection connect visibilityNeedAssessor.visibilityNeed to visibilityServiceProposer.visibilityNeed;
    // @trace INT-14
    connection int14 : PortConnection connect humidityNeedAssessor.humidityNeed to cabinAirServiceProposer.humidityNeed;
    // @trace INT-15
    connection int15 : PortConnection connect airQualityNeedAssessor.airNeed to cabinAirServiceProposer.airNeed;
    // @trace INT-16
    connection int16 : PortConnection connect electricalEligibilityOwner.electricalEligibility to energySafePlanComposer.electricalEligibility;
    // @trace INT-17
    connection int17 : PortConnection connect electricalEligibilityOwner.criticalElectrical to criticalFaultRecoveryOwner.criticalElectrical;
    // @trace INT-18
    connection int18 : PortConnection connect wasteHeatEligibilityOwner.wasteHeatEligibility to thermalServiceProposer.wasteHeatEligibility;
    // @trace INT-19
    connection int19 : PortConnection connect equipmentFaultAssessor.criticalEquipment to criticalFaultRecoveryOwner.criticalEquipment;
    // @trace INT-20
    connection int20 : PortConnection connect equipmentFaultAssessor.thermalPath to thermalServiceProposer.thermalPath;
    // @trace INT-21
    connection int21 : PortConnection connect equipmentFaultAssessor.visibilityPath to visibilityServiceProposer.visibilityPath;
    // @trace INT-22
    connection int22 : PortConnection connect equipmentFaultAssessor.airPath to cabinAirServiceProposer.airPath;
    // @trace INT-23
    connection int23 : PortConnection connect visibilityNeedAssessor.visibilityFault to criticalFaultRecoveryOwner.visibilityFault;
    // @trace INT-24
    connection int24 : PortConnection connect criticalFaultRecoveryOwner.recoveryReport to priorityAuthorizationArbiter.recoveryReport;
    // @trace INT-25
    connection int25 : PortConnection connect thermalServiceProposer.thermalProposal to priorityAuthorizationArbiter.thermalProposal;
    // @trace INT-26
    connection int26 : PortConnection connect visibilityServiceProposer.visibilityProposal to priorityAuthorizationArbiter.visibilityProposal;
    // @trace INT-27
    connection int27 : PortConnection connect cabinAirServiceProposer.cabinAirProposal to priorityAuthorizationArbiter.cabinAirProposal;
    // @trace INT-28
    connection int28 : PortConnection connect priorityAuthorizationArbiter.selectedIntent to energySafePlanComposer.selectedIntent;
    // @trace INT-29
    connection int29 : PortConnection connect energySafePlanComposer.candidatePlan to atomicResultPublisher.candidatePlan;
    // @trace INT-30
    connection int30 : PortConnection connect priorityAuthorizationArbiter.arbitrationStatus to atomicResultPublisher.arbitrationStatus;
    // @trace INT-31
    connection int31 : PortConnection connect criticalFaultRecoveryOwner.recoveryReport to atomicResultPublisher.recoveryReport;
    // @trace INT-32
    connection int32 : PortConnection connect atomicResultPublisher.actuationPlan to actuationPlan;
    // @trace INT-33
    connection int33 : PortConnection connect atomicResultPublisher.supervisorStatus to supervisorStatus;
  }

  // @trace BOUND-01
  part def HVACSupervisor :> System {
    // @trace MON-01
    port userRequest : DataPort { in :>> type : UserClimateRequest; }
    // @trace MON-02
    port cabinObservation : DataPort { in :>> type : CabinThermalObservation; }
    // @trace MON-03
    port glazingObservation : DataPort { in :>> type : GlazingObservation; }
    // @trace MON-04
    port humidityObservation : DataPort { in :>> type : HumidityObservation; }
    // @trace MON-05
    port airObservation : DataPort { in :>> type : AirQualityObservation; }
    // @trace MON-06
    port electricalAvailability : DataPort { in :>> type : ElectricalAvailability; }
    // @trace MON-07
    port wasteHeatAvailability : DataPort { in :>> type : WasteHeatAvailability; }
    // @trace MON-08
    port equipmentReadiness : DataPort { in :>> type : EquipmentReadiness; }
    // @trace MON-09
    port recoveryAcknowledgment : DataPort { in :>> type : RecoveryAcknowledgment; }
    // @trace CTRL-01
    port actuationPlan : DataPort { out :>> type : CabinActuationPlan; }
    // @trace CTRL-02
    port supervisorStatus : DataPort { out :>> type : SupervisorStatus; }

    // @generated-support SUPPORT-01 sole behavior-free Process usage.
    part supervision : HVACSupervisionProcess;
    // @generated-support SUPPORT-01 outer boundary-delegation hops.
    connection support01 : PortConnection connect userRequest to supervision.userRequest;
    connection support02 : PortConnection connect cabinObservation to supervision.cabinObservation;
    connection support03 : PortConnection connect glazingObservation to supervision.glazingObservation;
    connection support04 : PortConnection connect humidityObservation to supervision.humidityObservation;
    connection support05 : PortConnection connect airObservation to supervision.airObservation;
    connection support06 : PortConnection connect electricalAvailability to supervision.electricalAvailability;
    connection support07 : PortConnection connect wasteHeatAvailability to supervision.wasteHeatAvailability;
    connection support08 : PortConnection connect equipmentReadiness to supervision.equipmentReadiness;
    connection support09 : PortConnection connect recoveryAcknowledgment to supervision.recoveryAcknowledgment;
    connection support10 : PortConnection connect supervision.actuationPlan to actuationPlan;
    connection support11 : PortConnection connect supervision.supervisorStatus to supervisorStatus;
  }

  // @trace BOUND-01
  part hvacSupervisor : HVACSupervisor;
}
