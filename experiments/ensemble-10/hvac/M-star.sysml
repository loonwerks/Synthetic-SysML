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

                        
                
                 
                          
                                                                                                   
                                                
             
                 
                           
                                                                                                            
                                                           
                                                      
                                                         
                                                                 
                                                         
                                                         
                                                               
                                                      
                                                         
                                                                
                                                      
                                                         
                                                               
                                                     
       
  }

  part def VisibilityDemandQualifier :> Thread {
    port defrostRequest : DataPort { in :>> type : DefrostRequest; }
    port glazingCondition : DataPort { in :>> type : GlazingCondition; }
    port visibilityDemand : DataPort { out :>> type : VisibilityDemand; }

                        
                
                 
                          
                                                                                                        
                                                         
             
                 
                           
                                                                                                 
                                                                   
                                                               
                                                            
                                                    
                                                                      
                                                                
                                                    
                                                                 
                                                           
       
  }

  part def EnergyCapabilityQualifier :> Thread {
    port energyContext : DataPort { in :>> type : EnergyContext; }
    port energyCapability : DataPort { out :>> type : EnergyCapability; }

                        
                
                 
                          
                                                                                                         
                                                         
             
                 
                           
                                                                                                              
                                                                          
                                                                      
                                                                       
                                                               
                                                                        
                                                                    
                                                              
                                                                               
                                                                            
                                                            
                                                                        
                                                                    
                                                              
                                                                            
                                                                 
                                                                      
                                                                          
                                                            
                                                                        
                                                                    
                                                              
                                                                            
                                                                 
                                                                       
                                                                     
                                                                       
                                                                   
                                                                        
                                                                    
                                                              
                                                                            
                                                                 
                                                                       
                                                                     
                                                                         
                                                                      
       
  }

  part def RecoveryAuthority :> Thread {
    port energyCapability : DataPort { in :>> type : EnergyCapability; }
    port freshRequest : DataPort { in :>> type : FreshRequest; }
    port recoveryDecision : DataPort { out :>> type : RecoveryDecision; }

                        
           
                          
                                      
                
                 
                          
                                                                                                          
                                                      
                                                                 
             
                     
                           
                                                                                                               
                                                                
                                                                
                                                                      
                           
                                                                                                                       
                                                             
                                                                
                                                                          
                           
                                                                                                                
                                                                 
                                                            
                                                         
                                                  
                                                                
                                                                   
                           
                                                                                                                           
                                                                 
                                                            
                                                         
                                                   
                                                            
                                                                   
                           
                                                                                                 
                                                             
                                                            
                                                        
                                                            
                                                          
       
  }

  part def ServicePriorityArbiter :> Thread {
    port comfortDemand : DataPort { in :>> type : ComfortDemand; }
    port visibilityDemand : DataPort { in :>> type : VisibilityDemand; }
    port recoveryDecision : DataPort { in :>> type : RecoveryDecision; }
    port serviceSelection : DataPort { out :>> type : ServiceSelection; }

                        
                
                 
                          
                                                                                           
                                                     
                                                                       
             
                     
                           
                                                                                                                         
                                                                            
                                                                           
                                                                   
                                                               
                                                                                
                                                                                  
                                                                                    
                                                                                      
                                                                             
                                                                              
                           
                                                                                                                             
                                                                 
                                                                     
                                                       
                                                             
                                                               
                                                                       
                           
                                                                                                                            
                                                                 
                                                                     
                                                      
                                                            
                                                                   
                                                                         
                           
                                                                                                           
                                                                 
                                                                     
                                                         
                                                  
                                                                
                                                                      
                           
                                                                                                           
                                                                 
                                                                     
                                                         
                                                  
                                                                
                                                                      
                           
                                                                                                        
                                                                 
                                                                     
                                                         
                                                  
                                                               
                                                                         
                           
                                                                                                               
                                                                 
                                                                     
                                                         
                                                  
                                                               
                                                                 
       
  }

  part def ResourceAllocationDecision :> Thread {
    port serviceSelection : DataPort { in :>> type : ServiceSelection; }
    port energyCapability : DataPort { in :>> type : EnergyCapability; }
    port resourceGrant : DataPort { out :>> type : ResourceGrant; }

                        
                
                 
                          
                                                                         
                                               
             
                     
                           
                                                                                        
                                                           
                                                         
                           
                                                                                                                    
                                                               
                     
                                                                  
                                                               
                                                                         
                                                               
                                                                             
                                                            
                                                             
                                                                       
                                                      
                           
                                                                                                           
                                                            
                     
                                                                  
                                                               
                                                                         
                                                               
                                                                             
                                                          
                                                             
                                                                       
                                                      
                           
                                                                                                                  
                                                            
                     
                                                                  
                                                               
                                                                    
                                                                               
                                                          
                                                             
                                                                       
                                                      
       
  }

  part def ActuationCommandCoordinator :> Thread {
    port serviceSelection : DataPort { in :>> type : ServiceSelection; }
    port resourceGrant : DataPort { in :>> type : ResourceGrant; }
    port fanPreference : DataPort { in :>> type : FanPreference; }
    port plantCommand : DataPort { out :>> type : PlantCommand; }
    port actuationDisposition : DataPort { out :>> type : ActuationDisposition; }

                        
                
                 
                          
                                                                                                    
                                                               
                                                 
                                               
                                                                   
             
                     
                           
                                                                                                                                           
                                                            
                                                  
                                                     
                                                         
                                                           
                                                            
                                                         
                                                            
                                                            
                                                           
                                                           
                                                        
                                                                         
                                                   
                                                 
                                                                
                                                                           
                                                         
                                                              
                                                                        
                                                         
                                                              
                                                                             
                           
                                                                                                                      
                                                            
                                                          
                                                             
                                                               
                                                          
                                                             
                                                             
                                                             
                                                             
                                                             
                                                     
                                                                         
                                                   
                                                 
                                                                      
                           
                                                                                                                          
                                                              
                                                         
                                                          
                                                             
                                                               
                                                          
                                                              
                                                     
                                                             
                                                                 
                                                                       
                                                                 
                                                                       
                                                                   
                                                      
                                                            
                                                      
                                                             
                                                      
                                                            
                                                            
                                                       
                                                                   
                                                                        
                                                                   
                                                                              
                           
                                                                                                                 
                                                                
                                                           
                                                           
                                                         
                                                     
                                                               
                                                            
                                                                   
                                                                       
                                                                
                                                                      
                                                            
                                                      
                                                              
                                                       
                                                            
                                                           
                                                      
                                                                   
                                                                        
                                                            
                                                                
                                                                              
       
  }

  part def SupervisoryStatusComposer :> Thread {
    port recoveryDecision : DataPort { in :>> type : RecoveryDecision; }
    port serviceSelection : DataPort { in :>> type : ServiceSelection; }
    port resourceGrant : DataPort { in :>> type : ResourceGrant; }
    port actuationDisposition : DataPort { in :>> type : ActuationDisposition; }
    port supervisorStatus : DataPort { out :>> type : SupervisorStatus; }

                        
                
                 
                          
                                                                                              
                                                           
             
                 
                           
                                                                                                                                             
                                                                                                                                                                                                                                                                                                                      
                                                                                                                                                                                                                                                                                                                                                                                                                                                  
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
       
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
