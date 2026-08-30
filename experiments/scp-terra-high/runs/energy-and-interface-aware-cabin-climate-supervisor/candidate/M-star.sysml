package HVAC_Energy_Interface_Supervisor {
  private import HAMR::*;

  enum def ClimateRequest {
    enum Off;
    enum Regulate;
  }

  enum def ThermalRelation {
    enum Below;
    enum Within;
    enum Above;
    enum Unknown;
  }

  enum def DefrostRequest {
    enum Off;
    enum On;
  }

  enum def GlazingCondition {
    enum Clear;
    enum Obscured;
    enum Unknown;
  }

  enum def ElectricalState {
    enum Ready;
    enum Constrained;
    enum Unavailable;
    enum Unknown;
  }

  enum def PowerEnvelope {
    enum Normal;
    enum Reduced;
    enum None;
    enum Unknown;
  }

  enum def EngineHeat {
    enum Available;
    enum Unavailable;
    enum Unknown;
  }

  part def EnergyContext :> Data {
    attribute electricalState : ElectricalState;
    attribute powerEnvelope : PowerEnvelope;
    attribute engineHeat : EngineHeat;
  }

  enum def FreshRequest {
    enum Absent;
    enum Present;
  }

  enum def FanPreference {
    enum Auto;
    enum Low;
    enum High;
    enum Unknown;
  }

  enum def ComfortDemand {
    enum None;
    enum Hold;
    enum Heat;
    enum Cool;
    enum Invalid;
  }

  enum def VisibilityDemand {
    enum None;
    enum Required;
    enum Invalid;
  }

  enum def EnergyCapability {
    enum Full;
    enum ReducedHeat;
    enum ReducedElectric;
    enum None;
    enum Invalid;
  }

  enum def RecoveryState {
    enum Armed;
    enum Inhibited;
  }

  enum def RecoveryDecision {
    enum Permit;
    enum BlockEnergyInvalid;
    enum BlockEnergyUnavailable;
    enum BlockAwaitFresh;
    enum PermitRecovered;
  }

  enum def Service {
    enum Off;
    enum Heat;
    enum Cool;
    enum Defrost;
  }

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

  part def ServiceSelection :> Data {
    attribute service : Service;
    attribute reason : SelectionReason;
  }

  enum def ResourceGrant {
    enum Off;
    enum FullThermal;
    enum EconomyHeat;
    enum VentOnly;
    enum Denied;
  }

  enum def ThermalService {
    enum Off;
    enum Heat;
    enum Cool;
  }

  enum def AirPath {
    enum Off;
    enum Cabin;
    enum Glazing;
  }

  enum def Blower {
    enum Off;
    enum Low;
    enum High;
  }

  part def PlantCommand :> Data {
    attribute thermalService : ThermalService;
    attribute airPath : AirPath;
    attribute blower : Blower;
  }

  enum def ActuationDisposition {
    enum Quiescent;
    enum Active;
    enum LimitedActive;
    enum Denied;
    enum InputFault;
    enum Inconsistent;
  }

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

  part def ComfortDemandQualifier :> Thread {
    port climateRequest : DataPort { in :>> type : ClimateRequest; }
    port thermalRelation : DataPort { in :>> type : ThermalRelation; }
    port comfortDemand : DataPort { out :>> type : ComfortDemand; }

    language "GUMBO" /*{
      initialize
        guarantee INIT_COMFORT_SAFE: comfortDemand == ComfortDemand.None;

      compute
        guarantee QUAL_01_COMFORT_DEMAND:
          (climateRequest == ClimateRequest.Off implies comfortDemand == ComfortDemand.None) and
          (climateRequest == ClimateRequest.Regulate and thermalRelation == ThermalRelation.Unknown implies comfortDemand == ComfortDemand.Invalid) and
          (climateRequest == ClimateRequest.Regulate and thermalRelation == ThermalRelation.Below implies comfortDemand == ComfortDemand.Heat) and
          (climateRequest == ClimateRequest.Regulate and thermalRelation == ThermalRelation.Within implies comfortDemand == ComfortDemand.Hold) and
          (climateRequest == ClimateRequest.Regulate and thermalRelation == ThermalRelation.Above implies comfortDemand == ComfortDemand.Cool);
    }*/
  }

  part def VisibilityDemandQualifier :> Thread {
    port defrostRequest : DataPort { in :>> type : DefrostRequest; }
    port glazingCondition : DataPort { in :>> type : GlazingCondition; }
    port visibilityDemand : DataPort { out :>> type : VisibilityDemand; }

    language "GUMBO" /*{
      initialize
        guarantee INIT_VISIBILITY_SAFE: visibilityDemand == VisibilityDemand.Invalid;

      compute
        guarantee QUAL_02_VISIBILITY_DEMAND:
          (glazingCondition == GlazingCondition.Unknown implies visibilityDemand == VisibilityDemand.Invalid) and
          (glazingCondition != GlazingCondition.Unknown and
             (defrostRequest == DefrostRequest.On or glazingCondition == GlazingCondition.Obscured)
             implies visibilityDemand == VisibilityDemand.Required) and
          (defrostRequest == DefrostRequest.Off and glazingCondition == GlazingCondition.Clear
             implies visibilityDemand == VisibilityDemand.None);
    }*/
  }

  part def EnergyCapabilityQualifier :> Thread {
    port energyContext : DataPort { in :>> type : EnergyContext; }
    port energyCapability : DataPort { out :>> type : EnergyCapability; }

    language "GUMBO" /*{
      initialize
        guarantee INIT_ENERGY_SAFE: energyCapability == EnergyCapability.Invalid;

      compute
        guarantee QUAL_03_ENERGY_CAPABILITY:
          ((energyContext.electricalState == ElectricalState.Unknown or
            energyContext.powerEnvelope == PowerEnvelope.Unknown or
            energyContext.engineHeat == EngineHeat.Unknown)
            implies energyCapability == EnergyCapability.Invalid) and
          ((energyContext.electricalState != ElectricalState.Unknown and
            energyContext.powerEnvelope != PowerEnvelope.Unknown and
            energyContext.engineHeat != EngineHeat.Unknown and
            (energyContext.electricalState == ElectricalState.Unavailable or
             energyContext.powerEnvelope == PowerEnvelope.None))
            implies energyCapability == EnergyCapability.None) and
          ((energyContext.electricalState == ElectricalState.Ready and
            energyContext.powerEnvelope == PowerEnvelope.Normal and
            energyContext.engineHeat != EngineHeat.Unknown)
            implies energyCapability == EnergyCapability.Full) and
          ((energyContext.electricalState != ElectricalState.Unknown and
            energyContext.powerEnvelope != PowerEnvelope.Unknown and
            energyContext.engineHeat == EngineHeat.Available and
            energyContext.electricalState != ElectricalState.Unavailable and
            energyContext.powerEnvelope != PowerEnvelope.None and
            (energyContext.electricalState != ElectricalState.Ready or
             energyContext.powerEnvelope != PowerEnvelope.Normal))
            implies energyCapability == EnergyCapability.ReducedHeat) and
          ((energyContext.electricalState != ElectricalState.Unknown and
            energyContext.powerEnvelope != PowerEnvelope.Unknown and
            energyContext.engineHeat == EngineHeat.Unavailable and
            energyContext.electricalState != ElectricalState.Unavailable and
            energyContext.powerEnvelope != PowerEnvelope.None and
            (energyContext.electricalState != ElectricalState.Ready or
             energyContext.powerEnvelope != PowerEnvelope.Normal))
            implies energyCapability == EnergyCapability.ReducedElectric);
    }*/
  }

  part def RecoveryAuthority :> Thread {
    port energyCapability : DataPort { in :>> type : EnergyCapability; }
    port freshRequest : DataPort { in :>> type : FreshRequest; }
    port recoveryDecision : DataPort { out :>> type : RecoveryDecision; }

    language "GUMBO" /*{
      state
        recoveryState: RecoveryState;

      initialize
        guarantee INIT_RECOVERY_STATE: recoveryState == RecoveryState.Inhibited;
        guarantee INIT_RECOVERY_INHIBITED: recoveryDecision == RecoveryDecision.BlockAwaitFresh;

      compute
        modifies recoveryState;
        guarantee CASE_01_RECOVERY_INVALID:
          energyCapability == EnergyCapability.Invalid implies
            recoveryState == RecoveryState.Inhibited and recoveryDecision == RecoveryDecision.BlockEnergyInvalid;
        guarantee CASE_02_RECOVERY_UNAVAILABLE:
          energyCapability == EnergyCapability.None implies
            recoveryState == RecoveryState.Inhibited and recoveryDecision == RecoveryDecision.BlockEnergyUnavailable;
        guarantee CASE_03_USABLE_STALE:
          In(recoveryState) == RecoveryState.Inhibited and
          energyCapability != EnergyCapability.Invalid and energyCapability != EnergyCapability.None and
          freshRequest == FreshRequest.Absent implies
            recoveryState == RecoveryState.Inhibited and recoveryDecision == RecoveryDecision.BlockAwaitFresh;
        guarantee CASE_04_FRESH_RECOVERY:
          In(recoveryState) == RecoveryState.Inhibited and
          energyCapability != EnergyCapability.Invalid and energyCapability != EnergyCapability.None and
          freshRequest == FreshRequest.Present implies
            recoveryState == RecoveryState.Armed and recoveryDecision == RecoveryDecision.PermitRecovered;
        guarantee CASE_05_REMAIN_ARMED:
          In(recoveryState) == RecoveryState.Armed and
          energyCapability != EnergyCapability.Invalid and energyCapability != EnergyCapability.None implies
            recoveryState == RecoveryState.Armed and recoveryDecision == RecoveryDecision.Permit;
    }*/
  }

  part def ServicePriorityArbiter :> Thread {
    port comfortDemand : DataPort { in :>> type : ComfortDemand; }
    port visibilityDemand : DataPort { in :>> type : VisibilityDemand; }
    port recoveryDecision : DataPort { in :>> type : RecoveryDecision; }
    port serviceSelection : DataPort { out :>> type : ServiceSelection; }

    language "GUMBO" /*{
      initialize
        guarantee INIT_SELECTION_OFF:
          serviceSelection.service == Service.Off and
          serviceSelection.reason == SelectionReason.BlockAwaitFresh;

      compute
        guarantee CASE_06_AUTHORITY_BLOCK:
          ((recoveryDecision == RecoveryDecision.BlockEnergyInvalid or
            recoveryDecision == RecoveryDecision.BlockEnergyUnavailable or
            recoveryDecision == RecoveryDecision.BlockAwaitFresh)
            implies serviceSelection.service == Service.Off) and
          (recoveryDecision == RecoveryDecision.BlockEnergyInvalid implies
            serviceSelection.reason == SelectionReason.BlockEnergyInvalid) and
          (recoveryDecision == RecoveryDecision.BlockEnergyUnavailable implies
            serviceSelection.reason == SelectionReason.BlockEnergyUnavailable) and
          (recoveryDecision == RecoveryDecision.BlockAwaitFresh implies
            serviceSelection.reason == SelectionReason.BlockAwaitFresh);
        guarantee CASE_07_QUALIFIED_INPUT_FAULT:
          (recoveryDecision == RecoveryDecision.Permit or recoveryDecision == RecoveryDecision.PermitRecovered) and
          (comfortDemand == ComfortDemand.Invalid or visibilityDemand == VisibilityDemand.Invalid) implies
            serviceSelection.service == Service.Off and serviceSelection.reason == SelectionReason.InvalidDemand;
        guarantee CASE_08_DEFROST_PRIORITY:
          (recoveryDecision == RecoveryDecision.Permit or recoveryDecision == RecoveryDecision.PermitRecovered) and
          comfortDemand != ComfortDemand.Invalid and visibilityDemand == VisibilityDemand.Required implies
            serviceSelection.service == Service.Defrost and serviceSelection.reason == SelectionReason.SelectedDefrost;
        guarantee CASE_09_COMFORT_HEATING:
          (recoveryDecision == RecoveryDecision.Permit or recoveryDecision == RecoveryDecision.PermitRecovered) and
          visibilityDemand == VisibilityDemand.None and comfortDemand == ComfortDemand.Heat implies
            serviceSelection.service == Service.Heat and serviceSelection.reason == SelectionReason.SelectedHeat;
        guarantee CASE_10_COMFORT_COOLING:
          (recoveryDecision == RecoveryDecision.Permit or recoveryDecision == RecoveryDecision.PermitRecovered) and
          visibilityDemand == VisibilityDemand.None and comfortDemand == ComfortDemand.Cool implies
            serviceSelection.service == Service.Cool and serviceSelection.reason == SelectionReason.SelectedCool;
        guarantee CASE_11_TEMPERATURE_HOLD:
          (recoveryDecision == RecoveryDecision.Permit or recoveryDecision == RecoveryDecision.PermitRecovered) and
          visibilityDemand == VisibilityDemand.None and comfortDemand == ComfortDemand.Hold implies
            serviceSelection.service == Service.Off and serviceSelection.reason == SelectionReason.TemperatureHold;
        guarantee CASE_12_USER_OFF:
          (recoveryDecision == RecoveryDecision.Permit or recoveryDecision == RecoveryDecision.PermitRecovered) and
          visibilityDemand == VisibilityDemand.None and comfortDemand == ComfortDemand.None implies
            serviceSelection.service == Service.Off and serviceSelection.reason == SelectionReason.UserOff;
    }*/
  }

  part def ResourceAllocationDecision :> Thread {
    port serviceSelection : DataPort { in :>> type : ServiceSelection; }
    port energyCapability : DataPort { in :>> type : EnergyCapability; }
    port resourceGrant : DataPort { out :>> type : ResourceGrant; }

    language "GUMBO" /*{
      initialize
        guarantee INIT_GRANT_OFF: resourceGrant == ResourceGrant.Off;

      compute
        guarantee CASE_13_QUIESCENT_ALLOCATION:
          serviceSelection.service == Service.Off implies resourceGrant == ResourceGrant.Off;
        guarantee CASE_14_DEFROST_ALLOCATION:
          serviceSelection.service == Service.Defrost implies
            (energyCapability == EnergyCapability.Full implies resourceGrant == ResourceGrant.FullThermal) and
            (energyCapability == EnergyCapability.ReducedHeat implies resourceGrant == ResourceGrant.EconomyHeat) and
            (energyCapability == EnergyCapability.ReducedElectric implies resourceGrant == ResourceGrant.VentOnly) and
            ((energyCapability == EnergyCapability.None or energyCapability == EnergyCapability.Invalid)
              implies resourceGrant == ResourceGrant.Off);
        guarantee CASE_15_HEATING_ALLOCATION:
          serviceSelection.service == Service.Heat implies
            (energyCapability == EnergyCapability.Full implies resourceGrant == ResourceGrant.FullThermal) and
            (energyCapability == EnergyCapability.ReducedHeat implies resourceGrant == ResourceGrant.EconomyHeat) and
            (energyCapability == EnergyCapability.ReducedElectric implies resourceGrant == ResourceGrant.Denied) and
            ((energyCapability == EnergyCapability.None or energyCapability == EnergyCapability.Invalid)
              implies resourceGrant == ResourceGrant.Off);
        guarantee CASE_16_COOLING_ALLOCATION:
          serviceSelection.service == Service.Cool implies
            (energyCapability == EnergyCapability.Full implies resourceGrant == ResourceGrant.FullThermal) and
            ((energyCapability == EnergyCapability.ReducedHeat or energyCapability == EnergyCapability.ReducedElectric)
              implies resourceGrant == ResourceGrant.Denied) and
            ((energyCapability == EnergyCapability.None or energyCapability == EnergyCapability.Invalid)
              implies resourceGrant == ResourceGrant.Off);
    }*/
  }

  part def ActuationCommandCoordinator :> Thread {
    port serviceSelection : DataPort { in :>> type : ServiceSelection; }
    port resourceGrant : DataPort { in :>> type : ResourceGrant; }
    port fanPreference : DataPort { in :>> type : FanPreference; }
    port plantCommand : DataPort { out :>> type : PlantCommand; }
    port actuationDisposition : DataPort { out :>> type : ActuationDisposition; }

    language "GUMBO" /*{
      initialize
        guarantee INIT_COMMAND_QUIESCENT:
          plantCommand.thermalService == ThermalService.Off and
          plantCommand.airPath == AirPath.Off and
          plantCommand.blower == Blower.Off and
          actuationDisposition == ActuationDisposition.Quiescent;

      compute
        guarantee CASE_17_QUIESCENT_DENIED_INCONSISTENT:
          (serviceSelection.service == Service.Off or resourceGrant == ResourceGrant.Off or
           resourceGrant == ResourceGrant.Denied or
           (serviceSelection.service == Service.Heat and resourceGrant != ResourceGrant.FullThermal and resourceGrant != ResourceGrant.EconomyHeat) or
           (serviceSelection.service == Service.Cool and resourceGrant != ResourceGrant.FullThermal) or
           (serviceSelection.service == Service.Defrost and resourceGrant != ResourceGrant.FullThermal and
             resourceGrant != ResourceGrant.EconomyHeat and resourceGrant != ResourceGrant.VentOnly))
          implies
            plantCommand.thermalService == ThermalService.Off and plantCommand.airPath == AirPath.Off and
            plantCommand.blower == Blower.Off and
            (serviceSelection.service == Service.Off implies actuationDisposition == ActuationDisposition.Quiescent) and
            (serviceSelection.service != Service.Off and resourceGrant == ResourceGrant.Denied
              implies actuationDisposition == ActuationDisposition.Denied) and
            (serviceSelection.service != Service.Off and resourceGrant != ResourceGrant.Denied
              implies actuationDisposition == ActuationDisposition.Inconsistent);
        guarantee CASE_18_ACTIVE_FAN_FAULT:
          serviceSelection.service != Service.Off and
          ((serviceSelection.service == Service.Heat and
            (resourceGrant == ResourceGrant.FullThermal or resourceGrant == ResourceGrant.EconomyHeat)) or
           (serviceSelection.service == Service.Cool and resourceGrant == ResourceGrant.FullThermal) or
           (serviceSelection.service == Service.Defrost and
            (resourceGrant == ResourceGrant.FullThermal or resourceGrant == ResourceGrant.EconomyHeat or resourceGrant == ResourceGrant.VentOnly))) and
          fanPreference == FanPreference.Unknown implies
            plantCommand.thermalService == ThermalService.Off and plantCommand.airPath == AirPath.Off and
            plantCommand.blower == Blower.Off and actuationDisposition == ActuationDisposition.InputFault;
        guarantee CASE_19_ACTIVE_CABIN_COMMAND:
          (serviceSelection.service == Service.Heat or serviceSelection.service == Service.Cool) and
          ((serviceSelection.service == Service.Heat and
            (resourceGrant == ResourceGrant.FullThermal or resourceGrant == ResourceGrant.EconomyHeat)) or
           (serviceSelection.service == Service.Cool and resourceGrant == ResourceGrant.FullThermal)) and
          fanPreference != FanPreference.Unknown implies
            plantCommand.airPath == AirPath.Cabin and
            (serviceSelection.service == Service.Heat implies plantCommand.thermalService == ThermalService.Heat) and
            (serviceSelection.service == Service.Cool implies plantCommand.thermalService == ThermalService.Cool) and
            (resourceGrant == ResourceGrant.EconomyHeat implies plantCommand.blower == Blower.Low) and
            (resourceGrant == ResourceGrant.FullThermal and
              (fanPreference == FanPreference.Auto or fanPreference == FanPreference.Low)
              implies plantCommand.blower == Blower.Low) and
            (resourceGrant == ResourceGrant.FullThermal and fanPreference == FanPreference.High
              implies plantCommand.blower == Blower.High) and
            (resourceGrant == ResourceGrant.FullThermal implies actuationDisposition == ActuationDisposition.Active) and
            (resourceGrant == ResourceGrant.EconomyHeat implies actuationDisposition == ActuationDisposition.LimitedActive);
        guarantee CASE_20_ACTIVE_DEFROST_COMMAND:
          serviceSelection.service == Service.Defrost and
          (resourceGrant == ResourceGrant.FullThermal or resourceGrant == ResourceGrant.EconomyHeat or resourceGrant == ResourceGrant.VentOnly) and
          fanPreference != FanPreference.Unknown implies
            plantCommand.airPath == AirPath.Glazing and
            ((resourceGrant == ResourceGrant.FullThermal or resourceGrant == ResourceGrant.EconomyHeat)
              implies plantCommand.thermalService == ThermalService.Heat) and
            (resourceGrant == ResourceGrant.VentOnly implies plantCommand.thermalService == ThermalService.Off) and
            (resourceGrant == ResourceGrant.FullThermal and
              (fanPreference == FanPreference.Auto or fanPreference == FanPreference.High)
              implies plantCommand.blower == Blower.High) and
            ((resourceGrant != ResourceGrant.FullThermal or fanPreference == FanPreference.Low)
              implies plantCommand.blower == Blower.Low) and
            (resourceGrant == ResourceGrant.FullThermal implies actuationDisposition == ActuationDisposition.Active) and
            ((resourceGrant == ResourceGrant.EconomyHeat or resourceGrant == ResourceGrant.VentOnly)
              implies actuationDisposition == ActuationDisposition.LimitedActive);
    }*/
  }

  part def SupervisoryStatusComposer :> Thread {
    port recoveryDecision : DataPort { in :>> type : RecoveryDecision; }
    port serviceSelection : DataPort { in :>> type : ServiceSelection; }
    port resourceGrant : DataPort { in :>> type : ResourceGrant; }
    port actuationDisposition : DataPort { in :>> type : ActuationDisposition; }
    port supervisorStatus : DataPort { out :>> type : SupervisorStatus; }

    language "GUMBO" /*{
      initialize
        guarantee INIT_STATUS_INHIBITED: supervisorStatus == SupervisorStatus.Inhibited;

      compute
        guarantee STAT_01_STATUS_PRECEDENCE:
          ((actuationDisposition == ActuationDisposition.InputFault or
            actuationDisposition == ActuationDisposition.Inconsistent or
            serviceSelection.reason == SelectionReason.InvalidDemand or
            recoveryDecision == RecoveryDecision.BlockEnergyInvalid)
            implies supervisorStatus == SupervisorStatus.InputFault) and
          (actuationDisposition != ActuationDisposition.InputFault and
           actuationDisposition != ActuationDisposition.Inconsistent and
           serviceSelection.reason != SelectionReason.InvalidDemand and
           recoveryDecision != RecoveryDecision.BlockEnergyInvalid and
           (recoveryDecision == RecoveryDecision.BlockEnergyUnavailable or
            recoveryDecision == RecoveryDecision.BlockAwaitFresh)
           implies supervisorStatus == SupervisorStatus.Inhibited) and
          (actuationDisposition != ActuationDisposition.InputFault and
           actuationDisposition != ActuationDisposition.Inconsistent and
           serviceSelection.reason != SelectionReason.InvalidDemand and
           recoveryDecision != RecoveryDecision.BlockEnergyInvalid and
           recoveryDecision != RecoveryDecision.BlockEnergyUnavailable and
           recoveryDecision != RecoveryDecision.BlockAwaitFresh and
           serviceSelection.reason == SelectionReason.UserOff
           implies supervisorStatus == SupervisorStatus.Inactive) and
          (actuationDisposition != ActuationDisposition.InputFault and
           actuationDisposition != ActuationDisposition.Inconsistent and
           serviceSelection.reason != SelectionReason.InvalidDemand and
           recoveryDecision != RecoveryDecision.BlockEnergyInvalid and
           recoveryDecision != RecoveryDecision.BlockEnergyUnavailable and
           recoveryDecision != RecoveryDecision.BlockAwaitFresh and
           serviceSelection.reason == SelectionReason.TemperatureHold
           implies supervisorStatus == SupervisorStatus.Holding) and
          (actuationDisposition != ActuationDisposition.InputFault and
           actuationDisposition != ActuationDisposition.Inconsistent and
           serviceSelection.reason != SelectionReason.InvalidDemand and
           recoveryDecision != RecoveryDecision.BlockEnergyInvalid and
           recoveryDecision != RecoveryDecision.BlockEnergyUnavailable and
           recoveryDecision != RecoveryDecision.BlockAwaitFresh and
           serviceSelection.reason != SelectionReason.UserOff and
           serviceSelection.reason != SelectionReason.TemperatureHold and
           (resourceGrant == ResourceGrant.Denied or resourceGrant == ResourceGrant.EconomyHeat or resourceGrant == ResourceGrant.VentOnly)
           implies supervisorStatus == SupervisorStatus.Limited) and
          (actuationDisposition == ActuationDisposition.Active and resourceGrant == ResourceGrant.FullThermal and
           serviceSelection.service == Service.Heat implies supervisorStatus == SupervisorStatus.HeatingRequested) and
          (actuationDisposition == ActuationDisposition.Active and resourceGrant == ResourceGrant.FullThermal and
           serviceSelection.service == Service.Cool implies supervisorStatus == SupervisorStatus.CoolingRequested) and
          (actuationDisposition == ActuationDisposition.Active and resourceGrant == ResourceGrant.FullThermal and
           serviceSelection.service == Service.Defrost implies supervisorStatus == SupervisorStatus.DefrostRequested);
    }*/
  }

  part def ClimateSupervisionProcess :> Process {
    port climateRequest : DataPort { in :>> type : ClimateRequest; }
    port thermalRelation : DataPort { in :>> type : ThermalRelation; }
    port defrostRequest : DataPort { in :>> type : DefrostRequest; }
    port glazingCondition : DataPort { in :>> type : GlazingCondition; }
    port energyContext : DataPort { in :>> type : EnergyContext; }
    port freshRequest : DataPort { in :>> type : FreshRequest; }
    port fanPreference : DataPort { in :>> type : FanPreference; }
    port plantCommand : DataPort { out :>> type : PlantCommand; }
    port supervisorStatus : DataPort { out :>> type : SupervisorStatus; }

    part comfortDemandQualifier : ComfortDemandQualifier;
    part visibilityDemandQualifier : VisibilityDemandQualifier;
    part energyCapabilityQualifier : EnergyCapabilityQualifier;
    part recoveryAuthority : RecoveryAuthority;
    part servicePriorityArbiter : ServicePriorityArbiter;
    part resourceAllocationDecision : ResourceAllocationDecision;
    part actuationCommandCoordinator : ActuationCommandCoordinator;
    part supervisoryStatusComposer : SupervisoryStatusComposer;

    connection int01 : PortConnection connect climateRequest to comfortDemandQualifier.climateRequest;
    connection int02 : PortConnection connect thermalRelation to comfortDemandQualifier.thermalRelation;
    connection int03 : PortConnection connect defrostRequest to visibilityDemandQualifier.defrostRequest;
    connection int04 : PortConnection connect glazingCondition to visibilityDemandQualifier.glazingCondition;
    connection int05 : PortConnection connect energyContext to energyCapabilityQualifier.energyContext;
    connection int06 : PortConnection connect freshRequest to recoveryAuthority.freshRequest;
    connection int07 : PortConnection connect fanPreference to actuationCommandCoordinator.fanPreference;
    connection int08 : PortConnection connect comfortDemandQualifier.comfortDemand to servicePriorityArbiter.comfortDemand;
    connection int09 : PortConnection connect visibilityDemandQualifier.visibilityDemand to servicePriorityArbiter.visibilityDemand;
    connection int10 : PortConnection connect energyCapabilityQualifier.energyCapability to recoveryAuthority.energyCapability;
    connection int11 : PortConnection connect recoveryAuthority.recoveryDecision to servicePriorityArbiter.recoveryDecision;
    connection int12 : PortConnection connect servicePriorityArbiter.serviceSelection to resourceAllocationDecision.serviceSelection;
    connection int13 : PortConnection connect energyCapabilityQualifier.energyCapability to resourceAllocationDecision.energyCapability;
    connection int14 : PortConnection connect resourceAllocationDecision.resourceGrant to actuationCommandCoordinator.resourceGrant;
    connection int15 : PortConnection connect servicePriorityArbiter.serviceSelection to actuationCommandCoordinator.serviceSelection;
    connection int16 : PortConnection connect actuationCommandCoordinator.actuationDisposition to supervisoryStatusComposer.actuationDisposition;
    connection int17 : PortConnection connect servicePriorityArbiter.serviceSelection to supervisoryStatusComposer.serviceSelection;
    connection int18 : PortConnection connect resourceAllocationDecision.resourceGrant to supervisoryStatusComposer.resourceGrant;
    connection int19 : PortConnection connect recoveryAuthority.recoveryDecision to supervisoryStatusComposer.recoveryDecision;
    connection int20 : PortConnection connect actuationCommandCoordinator.plantCommand to plantCommand;
    connection int21 : PortConnection connect supervisoryStatusComposer.supervisorStatus to supervisorStatus;
  }

  part def HVACSupervisor :> System {
    port climateRequest : DataPort { in :>> type : ClimateRequest; }
    port thermalRelation : DataPort { in :>> type : ThermalRelation; }
    port defrostRequest : DataPort { in :>> type : DefrostRequest; }
    port glazingCondition : DataPort { in :>> type : GlazingCondition; }
    port energyContext : DataPort { in :>> type : EnergyContext; }
    port freshRequest : DataPort { in :>> type : FreshRequest; }
    port fanPreference : DataPort { in :>> type : FanPreference; }
    port plantCommand : DataPort { out :>> type : PlantCommand; }
    port supervisorStatus : DataPort { out :>> type : SupervisorStatus; }

    part climateSupervisionProcess : ClimateSupervisionProcess;

    connection supportClimateRequest : PortConnection connect climateRequest to climateSupervisionProcess.climateRequest;
    connection supportThermalRelation : PortConnection connect thermalRelation to climateSupervisionProcess.thermalRelation;
    connection supportDefrostRequest : PortConnection connect defrostRequest to climateSupervisionProcess.defrostRequest;
    connection supportGlazingCondition : PortConnection connect glazingCondition to climateSupervisionProcess.glazingCondition;
    connection supportEnergyContext : PortConnection connect energyContext to climateSupervisionProcess.energyContext;
    connection supportFreshRequest : PortConnection connect freshRequest to climateSupervisionProcess.freshRequest;
    connection supportFanPreference : PortConnection connect fanPreference to climateSupervisionProcess.fanPreference;
    connection supportPlantCommand : PortConnection connect climateSupervisionProcess.plantCommand to plantCommand;
    connection supportSupervisorStatus : PortConnection connect climateSupervisionProcess.supervisorStatus to supervisorStatus;
  }

  part hvacSupervisor : HVACSupervisor;
}
