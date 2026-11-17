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
        guarantee
          INIT_COMFORT_SAFE "Comfort qualification initializes without requesting thermal service":
            comfortDemand == ComfortDemand.None;
      compute
        guarantee
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

  part def VisibilityDemandQualifier :> Thread {
    port defrostRequest : DataPort { in :>> type : DefrostRequest; }
    port glazingCondition : DataPort { in :>> type : GlazingCondition; }
    port visibilityDemand : DataPort { out :>> type : VisibilityDemand; }

    language "GUMBO" /*{
      initialize
        guarantee
          INIT_VISIBILITY_SAFE "Visibility qualification initializes invalid so no service is inferred":
            visibilityDemand == VisibilityDemand.Invalid;
      compute
        guarantee
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

  part def EnergyCapabilityQualifier :> Thread {
    port energyContext : DataPort { in :>> type : EnergyContext; }
    port energyCapability : DataPort { out :>> type : EnergyCapability; }

    language "GUMBO" /*{
      initialize
        guarantee
          INIT_ENERGY_SAFE "Energy capability initializes invalid until a complete context is qualified":
            energyCapability == EnergyCapability.Invalid;
      compute
        guarantee
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

  part def RecoveryAuthority :> Thread {
    port energyCapability : DataPort { in :>> type : EnergyCapability; }
    port freshRequest : DataPort { in :>> type : FreshRequest; }
    port recoveryDecision : DataPort { out :>> type : RecoveryDecision; }

    language "GUMBO" /*{
      state
        recoveryState : RecoveryState;
      initialize
        guarantee
          INIT_RECOVERY_INHIBITED "Recovery authority initializes inhibited and awaiting a fresh request":
            recoveryState == RecoveryState.Inhibited &
            recoveryDecision == RecoveryDecision.BlockAwaitFresh;
      compute
        compute_cases
          case CASE_01_RECOVERY_INVALID "Invalid energy always inhibits and cannot be overridden by freshness":
            assume energyCapability == EnergyCapability.Invalid;
            guarantee recoveryState == RecoveryState.Inhibited &
              recoveryDecision == RecoveryDecision.BlockEnergyInvalid;
          case CASE_02_RECOVERY_UNAVAILABLE "Unavailable energy always inhibits and cannot be overridden by freshness":
            assume energyCapability == EnergyCapability.None;
            guarantee recoveryState == RecoveryState.Inhibited &
              recoveryDecision == RecoveryDecision.BlockEnergyUnavailable;
          case CASE_03_USABLE_STALE "Usable energy without a fresh request cannot rearm an inhibited authority":
            assume In(recoveryState) == RecoveryState.Inhibited &
              energyCapability != EnergyCapability.Invalid &
              energyCapability != EnergyCapability.None &
              freshRequest == FreshRequest.Absent;
            guarantee recoveryState == RecoveryState.Inhibited &
              recoveryDecision == RecoveryDecision.BlockAwaitFresh;
          case CASE_04_FRESH_RECOVERY "Usable energy and a fresh request rearm an inhibited authority for this evaluation":
            assume In(recoveryState) == RecoveryState.Inhibited &
              energyCapability != EnergyCapability.Invalid &
              energyCapability != EnergyCapability.None &
              freshRequest == FreshRequest.Present;
            guarantee recoveryState == RecoveryState.Armed &
              recoveryDecision == RecoveryDecision.PermitRecovered;
          case CASE_05_REMAIN_ARMED "An armed authority remains armed while energy stays usable":
            assume In(recoveryState) == RecoveryState.Armed &
              energyCapability != EnergyCapability.Invalid &
              energyCapability != EnergyCapability.None;
            guarantee recoveryState == RecoveryState.Armed &
              recoveryDecision == RecoveryDecision.Permit;
    }*/
                        
           
                          
                                      
                
                 
                          
                                                                                                          
                                                      
                                                                 
             
                     
                           
                                                                                                               
                                                                
                                                                
                                                                      
                           
                                                                                                                       
                                                             
                                                                
                                                                          
                           
                                                                                                                
                                                                 
                                                            
                                                         
                                                  
                                                                
                                                                   
                           
                                                                                                                           
                                                                 
                                                            
                                                         
                                                   
                                                            
                                                                   
                           
                                                                                                 
                                                             
                                                            
                                                        
                                                            
                                                          
       
  }

  part def ServicePriorityArbiter :> Thread {
    port comfortDemand : DataPort { in :>> type : ComfortDemand; }
    port visibilityDemand : DataPort { in :>> type : VisibilityDemand; }
    port recoveryDecision : DataPort { in :>> type : RecoveryDecision; }
    port serviceSelection : DataPort { out :>> type : ServiceSelection; }

    language "GUMBO" /*{
      initialize
        guarantee
          INIT_SELECTION_OFF "Service selection initializes off with the inhibited reason":
            serviceSelection.service == Service.Off &
            serviceSelection.reason == SelectionReason.BlockAwaitFresh;
      compute
        compute_cases
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
          case CASE_07_QUALIFIED_INPUT_FAULT "Invalid qualified comfort or visibility blocks service when authority permits":
            assume (recoveryDecision == RecoveryDecision.Permit |
              recoveryDecision == RecoveryDecision.PermitRecovered) &
              (comfortDemand == ComfortDemand.Invalid |
               visibilityDemand == VisibilityDemand.Invalid);
            guarantee serviceSelection.service == Service.Off &
              serviceSelection.reason == SelectionReason.InvalidDemand;
          case CASE_08_DEFROST_PRIORITY "Required visibility service outranks simultaneous valid heating or cooling demand":
            assume (recoveryDecision == RecoveryDecision.Permit |
              recoveryDecision == RecoveryDecision.PermitRecovered) &
              comfortDemand != ComfortDemand.Invalid &
              visibilityDemand == VisibilityDemand.Required;
            guarantee serviceSelection.service == Service.Defrost &
              serviceSelection.reason == SelectionReason.SelectedDefrost;
          case CASE_09_COMFORT_HEATING "Valid heating demand is selected when visibility demand is absent":
            assume (recoveryDecision == RecoveryDecision.Permit |
              recoveryDecision == RecoveryDecision.PermitRecovered) &
              visibilityDemand == VisibilityDemand.None &
              comfortDemand == ComfortDemand.Heat;
            guarantee serviceSelection.service == Service.Heat &
              serviceSelection.reason == SelectionReason.SelectedHeat;
          case CASE_10_COMFORT_COOLING "Valid cooling demand is selected when visibility demand is absent":
            assume (recoveryDecision == RecoveryDecision.Permit |
              recoveryDecision == RecoveryDecision.PermitRecovered) &
              visibilityDemand == VisibilityDemand.None &
              comfortDemand == ComfortDemand.Cool;
            guarantee serviceSelection.service == Service.Cool &
              serviceSelection.reason == SelectionReason.SelectedCool;
          case CASE_11_TEMPERATURE_HOLD "Within-range comfort yields an off selection with hold reason":
            assume (recoveryDecision == RecoveryDecision.Permit |
              recoveryDecision == RecoveryDecision.PermitRecovered) &
              visibilityDemand == VisibilityDemand.None &
              comfortDemand == ComfortDemand.Hold;
            guarantee serviceSelection.service == Service.Off &
              serviceSelection.reason == SelectionReason.TemperatureHold;
          case CASE_12_USER_OFF "No comfort or visibility demand yields an off selection with user-off reason":
            assume (recoveryDecision == RecoveryDecision.Permit |
              recoveryDecision == RecoveryDecision.PermitRecovered) &
              visibilityDemand == VisibilityDemand.None &
              comfortDemand == ComfortDemand.None;
            guarantee serviceSelection.service == Service.Off &
              serviceSelection.reason == SelectionReason.UserOff;
    }*/
                        
                
                 
                          
                                                                                           
                                                     
                                                                       
             
                     
                           
                                                                                                                         
                                                                            
                                                                           
                                                                   
                                                               
                                                                                
                                                                                  
                                                                                    
                                                                                      
                                                                             
                                                                              
                           
                                                                                                                             
                                                                 
                                                                     
                                                       
                                                             
                                                               
                                                                       
                           
                                                                                                                            
                                                                 
                                                                     
                                                      
                                                            
                                                                   
                                                                         
                           
                                                                                                           
                                                                 
                                                                     
                                                         
                                                  
                                                                
                                                                      
                           
                                                                                                           
                                                                 
                                                                     
                                                         
                                                  
                                                                
                                                                      
                           
                                                                                                        
                                                                 
                                                                     
                                                         
                                                  
                                                               
                                                                         
                           
                                                                                                               
                                                                 
                                                                     
                                                         
                                                  
                                                               
                                                                 
       
  }

  part def ResourceAllocationDecision :> Thread {
    port serviceSelection : DataPort { in :>> type : ServiceSelection; }
    port energyCapability : DataPort { in :>> type : EnergyCapability; }
    port resourceGrant : DataPort { out :>> type : ResourceGrant; }

    language "GUMBO" /*{
      initialize
        guarantee
          INIT_GRANT_OFF "Resource allocation initializes with no grant":
            resourceGrant == ResourceGrant.Off;
      compute
        compute_cases
          case CASE_13_QUIESCENT_ALLOCATION "An off service receives no resource grant":
            assume serviceSelection.service == Service.Off;
            guarantee resourceGrant == ResourceGrant.Off;
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

  part def ActuationCommandCoordinator :> Thread {
    port serviceSelection : DataPort { in :>> type : ServiceSelection; }
    port resourceGrant : DataPort { in :>> type : ResourceGrant; }
    port fanPreference : DataPort { in :>> type : FanPreference; }
    port plantCommand : DataPort { out :>> type : PlantCommand; }
    port actuationDisposition : DataPort { out :>> type : ActuationDisposition; }

    language "GUMBO" /*{
      initialize
        guarantee
          INIT_COMMAND_QUIESCENT "Command coordination initializes to the complete quiescent tuple":
            plantCommand.thermalService == ThermalService.Off &
            plantCommand.airPath == AirPath.Off &
            plantCommand.blower == Blower.Off &
            actuationDisposition == ActuationDisposition.Quiescent;
      compute
        compute_cases
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

  part def SupervisoryStatusComposer :> Thread {
    port recoveryDecision : DataPort { in :>> type : RecoveryDecision; }
    port serviceSelection : DataPort { in :>> type : ServiceSelection; }
    port resourceGrant : DataPort { in :>> type : ResourceGrant; }
    port actuationDisposition : DataPort { in :>> type : ActuationDisposition; }
    port supervisorStatus : DataPort { out :>> type : SupervisorStatus; }

    language "GUMBO" /*{
      initialize
        guarantee
          INIT_STATUS_INHIBITED "Public status initializes inhibited with recovery authority":
            supervisorStatus == SupervisorStatus.Inhibited;
      compute
        guarantee
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
            ((actuationDisposition != ActuationDisposition.InputFault &
              actuationDisposition != ActuationDisposition.Inconsistent &
              serviceSelection.reason != SelectionReason.InvalidDemand &
              recoveryDecision != RecoveryDecision.BlockEnergyInvalid &
              recoveryDecision != RecoveryDecision.BlockEnergyUnavailable &
              recoveryDecision != RecoveryDecision.BlockAwaitFresh &
              serviceSelection.reason != SelectionReason.UserOff &
              serviceSelection.reason != SelectionReason.TemperatureHold &
              actuationDisposition == ActuationDisposition.Active &
              resourceGrant == ResourceGrant.FullThermal &
              serviceSelection.service == Service.Heat) implies
              (supervisorStatus == SupervisorStatus.HeatingRequested)) &
            ((actuationDisposition != ActuationDisposition.InputFault &
              actuationDisposition != ActuationDisposition.Inconsistent &
              serviceSelection.reason != SelectionReason.InvalidDemand &
              recoveryDecision != RecoveryDecision.BlockEnergyInvalid &
              recoveryDecision != RecoveryDecision.BlockEnergyUnavailable &
              recoveryDecision != RecoveryDecision.BlockAwaitFresh &
              serviceSelection.reason != SelectionReason.UserOff &
              serviceSelection.reason != SelectionReason.TemperatureHold &
              actuationDisposition == ActuationDisposition.Active &
              resourceGrant == ResourceGrant.FullThermal &
              serviceSelection.service == Service.Cool) implies
              (supervisorStatus == SupervisorStatus.CoolingRequested)) &
            ((actuationDisposition != ActuationDisposition.InputFault &
              actuationDisposition != ActuationDisposition.Inconsistent &
              serviceSelection.reason != SelectionReason.InvalidDemand &
              recoveryDecision != RecoveryDecision.BlockEnergyInvalid &
              recoveryDecision != RecoveryDecision.BlockEnergyUnavailable &
              recoveryDecision != RecoveryDecision.BlockAwaitFresh &
              serviceSelection.reason != SelectionReason.UserOff &
              serviceSelection.reason != SelectionReason.TemperatureHold &
              actuationDisposition == ActuationDisposition.Active &
              resourceGrant == ResourceGrant.FullThermal &
              serviceSelection.service == Service.Defrost) implies
              (supervisorStatus == SupervisorStatus.DefrostRequested));
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
