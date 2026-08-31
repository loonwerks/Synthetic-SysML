// @trace SCOPE-01
package HVAC_Energy_Interface_Supervisor {
  private import HAMR::*;

  // @trace MON-01
  enum def ClimateRequest {
    enum Regulate;
    enum Off;
  }

  // @trace MON-02
  enum def ThermalRelation {
    enum Below;
    enum Within;
    enum Above;
    enum Unknown;
  }

  // @trace MON-03
  enum def DefrostRequest {
    enum Off;
    enum On;
  }

  // @trace MON-04
  enum def GlazingCondition {
    enum Clear;
    enum Obscured;
    enum Unknown;
  }

  // @trace MON-05
  enum def ElectricalState {
    enum Ready;
    enum Constrained;
    enum Unavailable;
    enum Unknown;
  }

  // @trace MON-05
  enum def PowerEnvelope {
    enum Normal;
    enum Reduced;
    enum None;
    enum Unknown;
  }

  // @trace MON-05
  enum def EngineHeat {
    enum Available;
    enum Unavailable;
    enum Unknown;
  }

  // @trace MON-05
  part def EnergyContext :> Data {
    // @trace MON-05
    attribute electricalState : ElectricalState;
    // @trace MON-05
    attribute powerEnvelope : PowerEnvelope;
    // @trace MON-05
    attribute engineHeat : EngineHeat;
  }

  // @trace MON-06
  enum def FreshRequest {
    enum Absent;
    enum Present;
  }

  // @trace MON-07
  enum def FanPreference {
    enum Auto;
    enum Low;
    enum High;
    enum Unknown;
  }

  // @trace PART-01
  enum def ComfortDemand {
    enum None;
    enum Hold;
    enum Heat;
    enum Cool;
    enum Invalid;
  }

  // @trace PART-02
  enum def VisibilityDemand {
    enum None;
    enum Required;
    enum Invalid;
  }

  // @trace PART-03
  enum def EnergyCapability {
    enum Full;
    enum ReducedHeat;
    enum ReducedElectric;
    enum None;
    enum Invalid;
  }

  // @trace PART-04
  enum def RecoveryState {
    enum Armed;
    enum Inhibited;
  }

  // @trace PART-04
  enum def RecoveryDecision {
    enum Permit;
    enum BlockEnergyInvalid;
    enum BlockEnergyUnavailable;
    enum BlockAwaitFresh;
    enum PermitRecovered;
  }

  // @trace PART-05
  enum def Service {
    enum Off;
    enum Heat;
    enum Cool;
    enum Defrost;
  }

  // @trace PART-05
  enum def SelectionReason {
    enum BlockEnergyInvalid;
    enum BlockEnergyUnavailable;
    enum BlockAwaitFresh;
    enum InvalidDemand;
    enum SelectedDefrost;
    enum SelectedHeat;
    enum SelectedCool;
    enum TemperatureHold;
    enum UserOff;
  }

  // @trace PART-05
  part def ServiceSelection :> Data {
    // @trace PART-05
    attribute service : Service;
    // @trace PART-05
    attribute reason : SelectionReason;
  }

  // @trace PART-06
  enum def ResourceGrant {
    enum Off;
    enum FullThermal;
    enum EconomyHeat;
    enum VentOnly;
    enum Denied;
  }

  // @trace CTRL-01
  enum def ThermalService {
    enum Off;
    enum Heat;
    enum Cool;
  }

  // @trace CTRL-01
  enum def AirPath {
    enum Off;
    enum Cabin;
    enum Glazing;
  }

  // @trace CTRL-01
  enum def Blower {
    enum Off;
    enum Low;
    enum High;
  }

  // @trace CTRL-01
  part def PlantCommand :> Data {
    // @trace CTRL-01
    attribute thermalService : ThermalService;
    // @trace CTRL-01
    attribute airPath : AirPath;
    // @trace CTRL-01
    attribute blower : Blower;
  }

  // @trace PART-07
  enum def ActuationDisposition {
    enum Quiescent;
    enum Active;
    enum LimitedActive;
    enum Denied;
    enum InputFault;
    enum Inconsistent;
  }

  // @trace CTRL-02
  enum def SupervisorStatus {
    enum Inactive;
    enum Holding;
    enum HeatingRequested;
    enum CoolingRequested;
    enum DefrostRequested;
    enum Limited;
    enum Inhibited;
    enum InputFault;
  }

  // @trace PART-01
  part def ComfortDemandQualifier :> Thread {
    // @trace INT-01
    port climateRequest : DataPort { in :>> type : ClimateRequest; }
    // @trace INT-02
    port thermalRelation : DataPort { in :>> type : ThermalRelation; }
    // @trace INT-08
    port comfortDemand : DataPort { out :>> type : ComfortDemand; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace ASM-06
          INIT_COMFORT_SAFE "Comfort qualification initializes without requesting thermal service":
            comfortDemand == ComfortDemand.None;
      compute
        guarantee
          // @trace QUAL-01
          QUAL_01_COMFORT_DEMAND "Climate request and thermal relation form a total comfort classification":
            ((climateRequest == ClimateRequest.Off) implies
              (comfortDemand == ComfortDemand.None)) &
            ((climateRequest == ClimateRequest.Regulate &
              thermalRelation == ThermalRelation.Unknown) implies
              (comfortDemand == ComfortDemand.Invalid)) &
            ((climateRequest == ClimateRequest.Regulate &
              thermalRelation == ThermalRelation.Below) implies
              (comfortDemand == ComfortDemand.Heat)) &
            ((climateRequest == ClimateRequest.Regulate &
              thermalRelation == ThermalRelation.Within) implies
              (comfortDemand == ComfortDemand.Hold)) &
            ((climateRequest == ClimateRequest.Regulate &
              thermalRelation == ThermalRelation.Above) implies
              (comfortDemand == ComfortDemand.Cool));
    }*/
  }

  // @trace PART-02
  part def VisibilityDemandQualifier :> Thread {
    // @trace INT-03
    port defrostRequest : DataPort { in :>> type : DefrostRequest; }
    // @trace INT-04
    port glazingCondition : DataPort { in :>> type : GlazingCondition; }
    // @trace INT-09
    port visibilityDemand : DataPort { out :>> type : VisibilityDemand; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace ASM-06
          INIT_VISIBILITY_SAFE "Visibility qualification initializes invalid so no service is inferred":
            visibilityDemand == VisibilityDemand.Invalid;
      compute
        guarantee
          // @trace QUAL-02
          QUAL_02_VISIBILITY_DEMAND "Glazing validity precedes combined user and glazing demand":
            ((glazingCondition == GlazingCondition.Unknown) implies
              (visibilityDemand == VisibilityDemand.Invalid)) &
            ((glazingCondition != GlazingCondition.Unknown &
              (defrostRequest == DefrostRequest.On |
               glazingCondition == GlazingCondition.Obscured)) implies
              (visibilityDemand == VisibilityDemand.Required)) &
            ((defrostRequest == DefrostRequest.Off &
              glazingCondition == GlazingCondition.Clear) implies
              (visibilityDemand == VisibilityDemand.None));
    }*/
  }

  // @trace PART-03
  part def EnergyCapabilityQualifier :> Thread {
    // @trace INT-05
    port energyContext : DataPort { in :>> type : EnergyContext; }
    // @trace INT-10
    port energyCapability : DataPort { out :>> type : EnergyCapability; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace ASM-06
          INIT_ENERGY_SAFE "Energy capability initializes invalid until a complete context is qualified":
            energyCapability == EnergyCapability.Invalid;
      compute
        guarantee
          // @trace QUAL-03
          QUAL_03_ENERGY_CAPABILITY "The three EnergyContext attributes form the ordered capability relation":
            (((energyContext.electricalState == ElectricalState.Unknown) |
              (energyContext.powerEnvelope == PowerEnvelope.Unknown) |
              (energyContext.engineHeat == EngineHeat.Unknown)) implies
              (energyCapability == EnergyCapability.Invalid)) &
            ((energyContext.electricalState != ElectricalState.Unknown &
              energyContext.powerEnvelope != PowerEnvelope.Unknown &
              energyContext.engineHeat != EngineHeat.Unknown &
              ((energyContext.electricalState == ElectricalState.Unavailable) |
               (energyContext.powerEnvelope == PowerEnvelope.None))) implies
              (energyCapability == EnergyCapability.None)) &
            ((energyContext.electricalState != ElectricalState.Unknown &
              energyContext.powerEnvelope != PowerEnvelope.Unknown &
              energyContext.engineHeat != EngineHeat.Unknown &
              energyContext.electricalState != ElectricalState.Unavailable &
              energyContext.powerEnvelope != PowerEnvelope.None &
              energyContext.electricalState == ElectricalState.Ready &
              energyContext.powerEnvelope == PowerEnvelope.Normal) implies
              (energyCapability == EnergyCapability.Full)) &
            ((energyContext.electricalState != ElectricalState.Unknown &
              energyContext.powerEnvelope != PowerEnvelope.Unknown &
              energyContext.engineHeat != EngineHeat.Unknown &
              energyContext.electricalState != ElectricalState.Unavailable &
              energyContext.powerEnvelope != PowerEnvelope.None &
              (energyContext.electricalState != ElectricalState.Ready |
               energyContext.powerEnvelope != PowerEnvelope.Normal) &
              energyContext.engineHeat == EngineHeat.Available) implies
              (energyCapability == EnergyCapability.ReducedHeat)) &
            ((energyContext.electricalState != ElectricalState.Unknown &
              energyContext.powerEnvelope != PowerEnvelope.Unknown &
              energyContext.engineHeat != EngineHeat.Unknown &
              energyContext.electricalState != ElectricalState.Unavailable &
              energyContext.powerEnvelope != PowerEnvelope.None &
              (energyContext.electricalState != ElectricalState.Ready |
               energyContext.powerEnvelope != PowerEnvelope.Normal) &
              energyContext.engineHeat == EngineHeat.Unavailable) implies
              (energyCapability == EnergyCapability.ReducedElectric));
    }*/
  }

  // @trace PART-04
  part def RecoveryAuthority :> Thread {
    // @trace INT-10
    port energyCapability : DataPort { in :>> type : EnergyCapability; }
    // @trace INT-06
    port freshRequest : DataPort { in :>> type : FreshRequest; }
    // @trace INT-11
    port recoveryDecision : DataPort { out :>> type : RecoveryDecision; }

    language "GUMBO" /*{
      state
        // @trace STATE-01
        recoveryState : RecoveryState;
      initialize
        guarantee
          // @trace ASM-06
          INIT_RECOVERY_INHIBITED "Recovery authority initializes inhibited and awaiting a fresh request":
            recoveryState == RecoveryState.Inhibited &
            recoveryDecision == RecoveryDecision.BlockAwaitFresh;
      compute
        compute_cases
          // @trace CASE-01
          case CASE_01_RECOVERY_INVALID "Invalid energy always inhibits and cannot be overridden by freshness":
            assume energyCapability == EnergyCapability.Invalid;
            guarantee recoveryState == RecoveryState.Inhibited &
              recoveryDecision == RecoveryDecision.BlockEnergyInvalid;
          // @trace CASE-02
          case CASE_02_RECOVERY_UNAVAILABLE "Unavailable energy always inhibits and cannot be overridden by freshness":
            assume energyCapability == EnergyCapability.None;
            guarantee recoveryState == RecoveryState.Inhibited &
              recoveryDecision == RecoveryDecision.BlockEnergyUnavailable;
          // @trace CASE-03
          case CASE_03_USABLE_STALE "Usable energy without a fresh request cannot rearm an inhibited authority":
            assume In(recoveryState) == RecoveryState.Inhibited &
              energyCapability != EnergyCapability.Invalid &
              energyCapability != EnergyCapability.None &
              freshRequest == FreshRequest.Absent;
            guarantee recoveryState == RecoveryState.Inhibited &
              recoveryDecision == RecoveryDecision.BlockAwaitFresh;
          // @trace CASE-04
          case CASE_04_FRESH_RECOVERY "Usable energy and a fresh request rearm an inhibited authority for this evaluation":
            assume In(recoveryState) == RecoveryState.Inhibited &
              energyCapability != EnergyCapability.Invalid &
              energyCapability != EnergyCapability.None &
              freshRequest == FreshRequest.Present;
            guarantee recoveryState == RecoveryState.Armed &
              recoveryDecision == RecoveryDecision.PermitRecovered;
          // @trace CASE-05
          case CASE_05_REMAIN_ARMED "An armed authority remains armed while energy stays usable":
            assume In(recoveryState) == RecoveryState.Armed &
              energyCapability != EnergyCapability.Invalid &
              energyCapability != EnergyCapability.None;
            guarantee recoveryState == RecoveryState.Armed &
              recoveryDecision == RecoveryDecision.Permit;
    }*/
  }

  // @trace PART-05
  part def ServicePriorityArbiter :> Thread {
    // @trace INT-08
    port comfortDemand : DataPort { in :>> type : ComfortDemand; }
    // @trace INT-09
    port visibilityDemand : DataPort { in :>> type : VisibilityDemand; }
    // @trace INT-11
    port recoveryDecision : DataPort { in :>> type : RecoveryDecision; }
    // @trace INT-12
    port serviceSelection : DataPort { out :>> type : ServiceSelection; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace ASM-06
          INIT_SELECTION_OFF "Service selection initializes off with the inhibited reason":
            serviceSelection.service == Service.Off &
            serviceSelection.reason == SelectionReason.BlockAwaitFresh;
      compute
        compute_cases
          // @trace CASE-06
          case CASE_06_AUTHORITY_BLOCK "Recovery authority blocks every qualified demand and preserves the block reason":
            assume recoveryDecision == RecoveryDecision.BlockEnergyInvalid |
              recoveryDecision == RecoveryDecision.BlockEnergyUnavailable |
              recoveryDecision == RecoveryDecision.BlockAwaitFresh;
            guarantee serviceSelection.service == Service.Off &
              ((recoveryDecision == RecoveryDecision.BlockEnergyInvalid) implies
                (serviceSelection.reason == SelectionReason.BlockEnergyInvalid)) &
              ((recoveryDecision == RecoveryDecision.BlockEnergyUnavailable) implies
                (serviceSelection.reason == SelectionReason.BlockEnergyUnavailable)) &
              ((recoveryDecision == RecoveryDecision.BlockAwaitFresh) implies
                (serviceSelection.reason == SelectionReason.BlockAwaitFresh));
          // @trace CASE-07
          case CASE_07_QUALIFIED_INPUT_FAULT "Invalid qualified comfort or visibility blocks service when authority permits":
            assume (recoveryDecision == RecoveryDecision.Permit |
              recoveryDecision == RecoveryDecision.PermitRecovered) &
              (comfortDemand == ComfortDemand.Invalid |
               visibilityDemand == VisibilityDemand.Invalid);
            guarantee serviceSelection.service == Service.Off &
              serviceSelection.reason == SelectionReason.InvalidDemand;
          // @trace CASE-08
          case CASE_08_DEFROST_PRIORITY "Required visibility service outranks simultaneous valid heating or cooling demand":
            assume (recoveryDecision == RecoveryDecision.Permit |
              recoveryDecision == RecoveryDecision.PermitRecovered) &
              comfortDemand != ComfortDemand.Invalid &
              visibilityDemand == VisibilityDemand.Required;
            guarantee serviceSelection.service == Service.Defrost &
              serviceSelection.reason == SelectionReason.SelectedDefrost;
          // @trace CASE-09
          case CASE_09_COMFORT_HEATING "Valid heating demand is selected when visibility demand is absent":
            assume (recoveryDecision == RecoveryDecision.Permit |
              recoveryDecision == RecoveryDecision.PermitRecovered) &
              visibilityDemand == VisibilityDemand.None &
              comfortDemand == ComfortDemand.Heat;
            guarantee serviceSelection.service == Service.Heat &
              serviceSelection.reason == SelectionReason.SelectedHeat;
          // @trace CASE-10
          case CASE_10_COMFORT_COOLING "Valid cooling demand is selected when visibility demand is absent":
            assume (recoveryDecision == RecoveryDecision.Permit |
              recoveryDecision == RecoveryDecision.PermitRecovered) &
              visibilityDemand == VisibilityDemand.None &
              comfortDemand == ComfortDemand.Cool;
            guarantee serviceSelection.service == Service.Cool &
              serviceSelection.reason == SelectionReason.SelectedCool;
          // @trace CASE-11
          case CASE_11_TEMPERATURE_HOLD "Within-range comfort yields an off selection with hold reason":
            assume (recoveryDecision == RecoveryDecision.Permit |
              recoveryDecision == RecoveryDecision.PermitRecovered) &
              visibilityDemand == VisibilityDemand.None &
              comfortDemand == ComfortDemand.Hold;
            guarantee serviceSelection.service == Service.Off &
              serviceSelection.reason == SelectionReason.TemperatureHold;
          // @trace CASE-12
          case CASE_12_USER_OFF "No comfort or visibility demand yields an off selection with user-off reason":
            assume (recoveryDecision == RecoveryDecision.Permit |
              recoveryDecision == RecoveryDecision.PermitRecovered) &
              visibilityDemand == VisibilityDemand.None &
              comfortDemand == ComfortDemand.None;
            guarantee serviceSelection.service == Service.Off &
              serviceSelection.reason == SelectionReason.UserOff;
    }*/
  }

  // @trace PART-06
  part def ResourceAllocationDecision :> Thread {
    // @trace INT-12
    port serviceSelection : DataPort { in :>> type : ServiceSelection; }
    // @trace INT-13
    port energyCapability : DataPort { in :>> type : EnergyCapability; }
    // @trace INT-14
    port resourceGrant : DataPort { out :>> type : ResourceGrant; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace ASM-06
          INIT_GRANT_OFF "Resource allocation initializes with no grant":
            resourceGrant == ResourceGrant.Off;
      compute
        compute_cases
          // @trace CASE-13
          case CASE_13_QUIESCENT_ALLOCATION "An off service receives no resource grant":
            assume serviceSelection.service == Service.Off;
            guarantee resourceGrant == ResourceGrant.Off;
          // @trace CASE-14
          case CASE_14_DEFROST_ALLOCATION "Defrost is full, heat-assisted, vent-only, or fail-closed by capability":
            assume serviceSelection.service == Service.Defrost;
            guarantee
              ((energyCapability == EnergyCapability.Full) implies
                (resourceGrant == ResourceGrant.FullThermal)) &
              ((energyCapability == EnergyCapability.ReducedHeat) implies
                (resourceGrant == ResourceGrant.EconomyHeat)) &
              ((energyCapability == EnergyCapability.ReducedElectric) implies
                (resourceGrant == ResourceGrant.VentOnly)) &
              (((energyCapability == EnergyCapability.None) |
                (energyCapability == EnergyCapability.Invalid)) implies
                (resourceGrant == ResourceGrant.Off));
          // @trace CASE-15
          case CASE_15_HEATING_ALLOCATION "Heating is full, economy, denied, or fail-closed by capability":
            assume serviceSelection.service == Service.Heat;
            guarantee
              ((energyCapability == EnergyCapability.Full) implies
                (resourceGrant == ResourceGrant.FullThermal)) &
              ((energyCapability == EnergyCapability.ReducedHeat) implies
                (resourceGrant == ResourceGrant.EconomyHeat)) &
              ((energyCapability == EnergyCapability.ReducedElectric) implies
                (resourceGrant == ResourceGrant.Denied)) &
              (((energyCapability == EnergyCapability.None) |
                (energyCapability == EnergyCapability.Invalid)) implies
                (resourceGrant == ResourceGrant.Off));
          // @trace CASE-16
          case CASE_16_COOLING_ALLOCATION "Cooling is full, denied under reduction, or fail-closed by capability":
            assume serviceSelection.service == Service.Cool;
            guarantee
              ((energyCapability == EnergyCapability.Full) implies
                (resourceGrant == ResourceGrant.FullThermal)) &
              (((energyCapability == EnergyCapability.ReducedHeat) |
                (energyCapability == EnergyCapability.ReducedElectric)) implies
                (resourceGrant == ResourceGrant.Denied)) &
              (((energyCapability == EnergyCapability.None) |
                (energyCapability == EnergyCapability.Invalid)) implies
                (resourceGrant == ResourceGrant.Off));
    }*/
  }

  // @trace PART-07
  part def ActuationCommandCoordinator :> Thread {
    // @trace INT-15
    port serviceSelection : DataPort { in :>> type : ServiceSelection; }
    // @trace INT-14
    port resourceGrant : DataPort { in :>> type : ResourceGrant; }
    // @trace INT-07
    port fanPreference : DataPort { in :>> type : FanPreference; }
    // @trace INT-20
    port plantCommand : DataPort { out :>> type : PlantCommand; }
    // @trace INT-16
    port actuationDisposition : DataPort { out :>> type : ActuationDisposition; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace ASM-06
          INIT_COMMAND_QUIESCENT "Command coordination initializes to the complete quiescent tuple":
            plantCommand.thermalService == ThermalService.Off &
            plantCommand.airPath == AirPath.Off &
            plantCommand.blower == Blower.Off &
            actuationDisposition == ActuationDisposition.Quiescent;
      compute
        compute_cases
          // @trace CASE-17
          case CASE_17_QUIESCENT_DENIED_INCONSISTENT "Off, denied, and incompatible combinations are quiescent with distinct dispositions":
            assume serviceSelection.service == Service.Off |
              resourceGrant == ResourceGrant.Off |
              resourceGrant == ResourceGrant.Denied |
              (serviceSelection.service == Service.Heat &
               resourceGrant != ResourceGrant.FullThermal &
               resourceGrant != ResourceGrant.EconomyHeat) |
              (serviceSelection.service == Service.Cool &
               resourceGrant != ResourceGrant.FullThermal) |
              (serviceSelection.service == Service.Defrost &
               resourceGrant != ResourceGrant.FullThermal &
               resourceGrant != ResourceGrant.EconomyHeat &
               resourceGrant != ResourceGrant.VentOnly);
            guarantee plantCommand.thermalService == ThermalService.Off &
              plantCommand.airPath == AirPath.Off &
              plantCommand.blower == Blower.Off &
              ((serviceSelection.service == Service.Off) implies
                (actuationDisposition == ActuationDisposition.Quiescent)) &
              ((serviceSelection.service != Service.Off &
                resourceGrant == ResourceGrant.Denied) implies
                (actuationDisposition == ActuationDisposition.Denied)) &
              ((serviceSelection.service != Service.Off &
                resourceGrant != ResourceGrant.Denied) implies
                (actuationDisposition == ActuationDisposition.Inconsistent));
          // @trace CASE-18
          case CASE_18_ACTIVE_FAN_FAULT "Unknown fan preference suppresses every otherwise compatible active command":
            assume serviceSelection.service != Service.Off &
              ((serviceSelection.service == Service.Heat &
                (resourceGrant == ResourceGrant.FullThermal |
                 resourceGrant == ResourceGrant.EconomyHeat)) |
               (serviceSelection.service == Service.Cool &
                resourceGrant == ResourceGrant.FullThermal) |
               (serviceSelection.service == Service.Defrost &
                (resourceGrant == ResourceGrant.FullThermal |
                 resourceGrant == ResourceGrant.EconomyHeat |
                 resourceGrant == ResourceGrant.VentOnly))) &
              fanPreference == FanPreference.Unknown;
            guarantee plantCommand.thermalService == ThermalService.Off &
              plantCommand.airPath == AirPath.Off &
              plantCommand.blower == Blower.Off &
              actuationDisposition == ActuationDisposition.InputFault;
          // @trace CASE-19
          case CASE_19_ACTIVE_CABIN_COMMAND "Known fan preference produces the unique permitted heat or cool cabin tuple":
            assume (serviceSelection.service == Service.Heat |
              serviceSelection.service == Service.Cool) &
              ((serviceSelection.service == Service.Heat &
                (resourceGrant == ResourceGrant.FullThermal |
                 resourceGrant == ResourceGrant.EconomyHeat)) |
               (serviceSelection.service == Service.Cool &
                resourceGrant == ResourceGrant.FullThermal)) &
              fanPreference != FanPreference.Unknown;
            guarantee plantCommand.airPath == AirPath.Cabin &
              ((serviceSelection.service == Service.Heat) implies
                (plantCommand.thermalService == ThermalService.Heat)) &
              ((serviceSelection.service == Service.Cool) implies
                (plantCommand.thermalService == ThermalService.Cool)) &
              ((resourceGrant == ResourceGrant.EconomyHeat) implies
                (plantCommand.blower == Blower.Low)) &
              ((resourceGrant == ResourceGrant.FullThermal &
                (fanPreference == FanPreference.Auto |
                 fanPreference == FanPreference.Low)) implies
                (plantCommand.blower == Blower.Low)) &
              ((resourceGrant == ResourceGrant.FullThermal &
                fanPreference == FanPreference.High) implies
                (plantCommand.blower == Blower.High)) &
              ((resourceGrant == ResourceGrant.FullThermal) implies
                (actuationDisposition == ActuationDisposition.Active)) &
              ((resourceGrant == ResourceGrant.EconomyHeat) implies
                (actuationDisposition == ActuationDisposition.LimitedActive));
          // @trace CASE-20
          case CASE_20_ACTIVE_DEFROST_COMMAND "Known fan preference produces the unique permitted glazing tuple":
            assume serviceSelection.service == Service.Defrost &
              (resourceGrant == ResourceGrant.FullThermal |
               resourceGrant == ResourceGrant.EconomyHeat |
               resourceGrant == ResourceGrant.VentOnly) &
              fanPreference != FanPreference.Unknown;
            guarantee plantCommand.airPath == AirPath.Glazing &
              ((resourceGrant == ResourceGrant.FullThermal |
                resourceGrant == ResourceGrant.EconomyHeat) implies
                (plantCommand.thermalService == ThermalService.Heat)) &
              ((resourceGrant == ResourceGrant.VentOnly) implies
                (plantCommand.thermalService == ThermalService.Off)) &
              ((resourceGrant == ResourceGrant.FullThermal &
                (fanPreference == FanPreference.Auto |
                 fanPreference == FanPreference.High)) implies
                (plantCommand.blower == Blower.High)) &
              ((resourceGrant != ResourceGrant.FullThermal |
                fanPreference == FanPreference.Low) implies
                (plantCommand.blower == Blower.Low)) &
              ((resourceGrant == ResourceGrant.FullThermal) implies
                (actuationDisposition == ActuationDisposition.Active)) &
              ((resourceGrant == ResourceGrant.EconomyHeat |
                resourceGrant == ResourceGrant.VentOnly) implies
                (actuationDisposition == ActuationDisposition.LimitedActive));
    }*/
  }

  // @trace PART-08
  part def SupervisoryStatusComposer :> Thread {
    // @trace INT-19
    port recoveryDecision : DataPort { in :>> type : RecoveryDecision; }
    // @trace INT-17
    port serviceSelection : DataPort { in :>> type : ServiceSelection; }
    // @trace INT-18
    port resourceGrant : DataPort { in :>> type : ResourceGrant; }
    // @trace INT-16
    port actuationDisposition : DataPort { in :>> type : ActuationDisposition; }
    // @trace INT-21
    port supervisorStatus : DataPort { out :>> type : SupervisorStatus; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace ASM-06
          INIT_STATUS_INHIBITED "Public status initializes inhibited with recovery authority":
            supervisorStatus == SupervisorStatus.Inhibited;
      compute
        guarantee
          // @trace STAT-01
          STAT_01_STATUS_PRECEDENCE "Status composes owner facts in the approved fault, recovery, inactivity, limitation, and service order":
            (((actuationDisposition == ActuationDisposition.InputFault) |
              (actuationDisposition == ActuationDisposition.Inconsistent) |
              (serviceSelection.reason == SelectionReason.InvalidDemand) |
              (recoveryDecision == RecoveryDecision.BlockEnergyInvalid)) implies
              (supervisorStatus == SupervisorStatus.InputFault)) &
            ((actuationDisposition != ActuationDisposition.InputFault &
              actuationDisposition != ActuationDisposition.Inconsistent &
              serviceSelection.reason != SelectionReason.InvalidDemand &
              recoveryDecision != RecoveryDecision.BlockEnergyInvalid &
              (recoveryDecision == RecoveryDecision.BlockEnergyUnavailable |
               recoveryDecision == RecoveryDecision.BlockAwaitFresh)) implies
              (supervisorStatus == SupervisorStatus.Inhibited)) &
            ((actuationDisposition != ActuationDisposition.InputFault &
              actuationDisposition != ActuationDisposition.Inconsistent &
              serviceSelection.reason != SelectionReason.InvalidDemand &
              recoveryDecision != RecoveryDecision.BlockEnergyInvalid &
              recoveryDecision != RecoveryDecision.BlockEnergyUnavailable &
              recoveryDecision != RecoveryDecision.BlockAwaitFresh &
              serviceSelection.reason == SelectionReason.UserOff) implies
              (supervisorStatus == SupervisorStatus.Inactive)) &
            ((actuationDisposition != ActuationDisposition.InputFault &
              actuationDisposition != ActuationDisposition.Inconsistent &
              serviceSelection.reason != SelectionReason.InvalidDemand &
              recoveryDecision != RecoveryDecision.BlockEnergyInvalid &
              recoveryDecision != RecoveryDecision.BlockEnergyUnavailable &
              recoveryDecision != RecoveryDecision.BlockAwaitFresh &
              serviceSelection.reason == SelectionReason.TemperatureHold) implies
              (supervisorStatus == SupervisorStatus.Holding)) &
            ((actuationDisposition != ActuationDisposition.InputFault &
              actuationDisposition != ActuationDisposition.Inconsistent &
              serviceSelection.reason != SelectionReason.InvalidDemand &
              recoveryDecision != RecoveryDecision.BlockEnergyInvalid &
              recoveryDecision != RecoveryDecision.BlockEnergyUnavailable &
              recoveryDecision != RecoveryDecision.BlockAwaitFresh &
              serviceSelection.reason != SelectionReason.UserOff &
              serviceSelection.reason != SelectionReason.TemperatureHold &
              (resourceGrant == ResourceGrant.Denied |
               resourceGrant == ResourceGrant.EconomyHeat |
               resourceGrant == ResourceGrant.VentOnly)) implies
              (supervisorStatus == SupervisorStatus.Limited)) &
            ((actuationDisposition == ActuationDisposition.Active &
              resourceGrant == ResourceGrant.FullThermal &
              serviceSelection.service == Service.Heat) implies
              (supervisorStatus == SupervisorStatus.HeatingRequested)) &
            ((actuationDisposition == ActuationDisposition.Active &
              resourceGrant == ResourceGrant.FullThermal &
              serviceSelection.service == Service.Cool) implies
              (supervisorStatus == SupervisorStatus.CoolingRequested)) &
            ((actuationDisposition == ActuationDisposition.Active &
              resourceGrant == ResourceGrant.FullThermal &
              serviceSelection.service == Service.Defrost) implies
              (supervisorStatus == SupervisorStatus.DefrostRequested));
    }*/
  }

  // @generated-support behavior-free physical container required by SUPPORT-01
  part def ClimateSupervisionProcess :> Process {
    // @generated-support root-to-Process routing port for MON-01
    port climateRequest : DataPort { in :>> type : ClimateRequest; }
    // @generated-support root-to-Process routing port for MON-02
    port thermalRelation : DataPort { in :>> type : ThermalRelation; }
    // @generated-support root-to-Process routing port for MON-03
    port defrostRequest : DataPort { in :>> type : DefrostRequest; }
    // @generated-support root-to-Process routing port for MON-04
    port glazingCondition : DataPort { in :>> type : GlazingCondition; }
    // @generated-support root-to-Process routing port for MON-05
    port energyContext : DataPort { in :>> type : EnergyContext; }
    // @generated-support root-to-Process routing port for MON-06
    port freshRequest : DataPort { in :>> type : FreshRequest; }
    // @generated-support root-to-Process routing port for MON-07
    port fanPreference : DataPort { in :>> type : FanPreference; }
    // @generated-support Process-to-root routing port for CTRL-01
    port plantCommand : DataPort { out :>> type : PlantCommand; }
    // @generated-support Process-to-root routing port for CTRL-02
    port supervisorStatus : DataPort { out :>> type : SupervisorStatus; }

    // @trace PART-01
    part comfortDemandQualifier : ComfortDemandQualifier;
    // @trace PART-02
    part visibilityDemandQualifier : VisibilityDemandQualifier;
    // @trace PART-03
    part energyCapabilityQualifier : EnergyCapabilityQualifier;
    // @trace PART-04
    part recoveryAuthority : RecoveryAuthority;
    // @trace PART-05
    part servicePriorityArbiter : ServicePriorityArbiter;
    // @trace PART-06
    part resourceAllocationDecision : ResourceAllocationDecision;
    // @trace PART-07
    part actuationCommandCoordinator : ActuationCommandCoordinator;
    // @trace PART-08
    part supervisoryStatusComposer : SupervisoryStatusComposer;

    // @trace INT-01
    connection int01 : PortConnection connect climateRequest to comfortDemandQualifier.climateRequest;
    // @trace INT-02
    connection int02 : PortConnection connect thermalRelation to comfortDemandQualifier.thermalRelation;
    // @trace INT-03
    connection int03 : PortConnection connect defrostRequest to visibilityDemandQualifier.defrostRequest;
    // @trace INT-04
    connection int04 : PortConnection connect glazingCondition to visibilityDemandQualifier.glazingCondition;
    // @trace INT-05
    connection int05 : PortConnection connect energyContext to energyCapabilityQualifier.energyContext;
    // @trace INT-06
    connection int06 : PortConnection connect freshRequest to recoveryAuthority.freshRequest;
    // @trace INT-07
    connection int07 : PortConnection connect fanPreference to actuationCommandCoordinator.fanPreference;
    // @trace INT-08
    connection int08 : PortConnection connect comfortDemandQualifier.comfortDemand to servicePriorityArbiter.comfortDemand;
    // @trace INT-09
    connection int09 : PortConnection connect visibilityDemandQualifier.visibilityDemand to servicePriorityArbiter.visibilityDemand;
    // @trace INT-10
    connection int10 : PortConnection connect energyCapabilityQualifier.energyCapability to recoveryAuthority.energyCapability;
    // @trace INT-11
    connection int11 : PortConnection connect recoveryAuthority.recoveryDecision to servicePriorityArbiter.recoveryDecision;
    // @trace INT-12
    connection int12 : PortConnection connect servicePriorityArbiter.serviceSelection to resourceAllocationDecision.serviceSelection;
    // @trace INT-13
    connection int13 : PortConnection connect energyCapabilityQualifier.energyCapability to resourceAllocationDecision.energyCapability;
    // @trace INT-14
    connection int14 : PortConnection connect resourceAllocationDecision.resourceGrant to actuationCommandCoordinator.resourceGrant;
    // @trace INT-15
    connection int15 : PortConnection connect servicePriorityArbiter.serviceSelection to actuationCommandCoordinator.serviceSelection;
    // @trace INT-16
    connection int16 : PortConnection connect actuationCommandCoordinator.actuationDisposition to supervisoryStatusComposer.actuationDisposition;
    // @trace INT-17
    connection int17 : PortConnection connect servicePriorityArbiter.serviceSelection to supervisoryStatusComposer.serviceSelection;
    // @trace INT-18
    connection int18 : PortConnection connect resourceAllocationDecision.resourceGrant to supervisoryStatusComposer.resourceGrant;
    // @trace INT-19
    connection int19 : PortConnection connect recoveryAuthority.recoveryDecision to supervisoryStatusComposer.recoveryDecision;
    // @trace INT-20
    connection int20 : PortConnection connect actuationCommandCoordinator.plantCommand to plantCommand;
    // @trace INT-21
    connection int21 : PortConnection connect supervisoryStatusComposer.supervisorStatus to supervisorStatus;
  }

  // @trace SCOPE-01
  part def HVACSupervisor :> System {
    // @trace MON-01
    port climateRequest : DataPort { in :>> type : ClimateRequest; }
    // @trace MON-02
    port thermalRelation : DataPort { in :>> type : ThermalRelation; }
    // @trace MON-03
    port defrostRequest : DataPort { in :>> type : DefrostRequest; }
    // @trace MON-04
    port glazingCondition : DataPort { in :>> type : GlazingCondition; }
    // @trace MON-05
    port energyContext : DataPort { in :>> type : EnergyContext; }
    // @trace MON-06
    port freshRequest : DataPort { in :>> type : FreshRequest; }
    // @trace MON-07
    port fanPreference : DataPort { in :>> type : FanPreference; }
    // @trace CTRL-01
    port plantCommand : DataPort { out :>> type : PlantCommand; }
    // @trace CTRL-02
    port supervisorStatus : DataPort { out :>> type : SupervisorStatus; }

    // @generated-support behavior-free containment usage required by SUPPORT-01
    part climateSupervisionProcess : ClimateSupervisionProcess;

    // @generated-support support route for MON-01
    connection supportClimateRequest : PortConnection connect climateRequest to climateSupervisionProcess.climateRequest;
    // @generated-support support route for MON-02
    connection supportThermalRelation : PortConnection connect thermalRelation to climateSupervisionProcess.thermalRelation;
    // @generated-support support route for MON-03
    connection supportDefrostRequest : PortConnection connect defrostRequest to climateSupervisionProcess.defrostRequest;
    // @generated-support support route for MON-04
    connection supportGlazingCondition : PortConnection connect glazingCondition to climateSupervisionProcess.glazingCondition;
    // @generated-support support route for MON-05
    connection supportEnergyContext : PortConnection connect energyContext to climateSupervisionProcess.energyContext;
    // @generated-support support route for MON-06
    connection supportFreshRequest : PortConnection connect freshRequest to climateSupervisionProcess.freshRequest;
    // @generated-support support route for MON-07
    connection supportFanPreference : PortConnection connect fanPreference to climateSupervisionProcess.fanPreference;
    // @generated-support support route for CTRL-01
    connection supportPlantCommand : PortConnection connect climateSupervisionProcess.plantCommand to plantCommand;
    // @generated-support support route for CTRL-02
    connection supportSupervisorStatus : PortConnection connect climateSupervisionProcess.supervisorStatus to supervisorStatus;
  }

  // @trace SCOPE-01
  part hvacSupervisor : HVACSupervisor;
}
