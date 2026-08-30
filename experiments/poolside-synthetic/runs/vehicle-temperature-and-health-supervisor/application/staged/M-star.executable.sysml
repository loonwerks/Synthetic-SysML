package Vehicle_Temperature_Health_Supervisor {

  private import HAMR::*;

  enum def TemperatureRelation {
    enum AtOrBelowMaximum;
    enum AboveMaximum;
  }

  enum def InputStatus {
    enum Valid;
    enum Invalid;
  }

  enum def MaintenanceTiming {
    enum NotDue;
    enum Due;
  }

  enum def ReturnIndication {
    enum NoRequest;
    enum FreshRequest;
  }

  enum def TemperatureAssessment {
    enum InvalidTemperature;
    enum NominalTemperature;
    enum OverTemperature;
  }

  enum def MaintenanceAssessment {
    enum InvalidMaintenance;
    enum MaintenanceClear;
    enum MaintenanceDue;
  }

  enum def RecoveryProposal {
    enum InvalidRecoveryEvidence;
    enum NotRequested;
    enum BlockedByMaintenance;
    enum BlockedByTemperature;
    enum EligibleRecovery;
  }

  enum def VehicleHealthMode {
    enum Operational;
    enum TemperatureDegraded;
    enum MaintenanceHold;
    enum Unavailable;
  }

  enum def ElectricalPowerDisposition {
    enum Enable;
    enum Withhold;
  }

  enum def RecoveryGuidance {
    enum None;
    enum ClearActiveCondition;
    enum SubmitFreshReturnRequest;
    enum RepairInputEvidence;
  }

  enum def DecisionReason {
    enum InvalidEvidence;
    enum MaintenanceActive;
    enum TemperatureActive;
    enum NormalRetained;
    enum RecoveryNotRequired;
    enum FreshRecoveryRequired;
    enum RecoveryAccepted;
  }

  // Inspected record members are attributes, not nested structural parts.
  part def TemperatureSample :> Data {
    attribute relation : TemperatureRelation;
    attribute status : InputStatus;
  }

  part def MaintenanceSample :> Data {
    attribute timing : MaintenanceTiming;
    attribute status : InputStatus;
  }

  part def ReturnSample :> Data {
    attribute indication : ReturnIndication;
    attribute status : InputStatus;
  }

  part def HealthDecision :> Data {
    attribute nextMode : VehicleHealthMode;
    attribute reason : DecisionReason;
  }

  part def TemperatureEvidenceQualification :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port rawTemperature : DataPort { in :>> type : TemperatureSample; }
    port assessmentForRecovery : DataPort { out :>> type : TemperatureAssessment; }
    port assessmentForArbitration : DataPort { out :>> type : TemperatureAssessment; }

                        
               
                              
                                                                                   
                                                                                             
                                                                                                                     
                                                     

                
                         
                                                                                                                
                                                                             
                                                                               

             
                                   
                                                                                                                           
                                                            

                     
                                
                                                                                                                 
                                                                
                                                                                   
                                                                                     
                                
                                                                                             
                                                               
                                                                                   
                                                                                   
                                                                                     
                                
                                                                                         
                                                               
                                                                               
                                                                                   
                                                                                     
       
  }

  part def MaintenanceEvidenceQualification :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port rawMaintenance : DataPort { in :>> type : MaintenanceSample; }
    port assessmentForRecovery : DataPort { out :>> type : MaintenanceAssessment; }
    port assessmentForArbitration : DataPort { out :>> type : MaintenanceAssessment; }

                        
               
                               
                                                                                   
                                                                                             
                                                                                                     
                                                    

                
                         
                                                                                                                
                                                                             
                                                                               

             
                                   
                                                                                                                           
                                                            

                     
                                 
                                                                                                           
                                                                
                                                                                   
                                                                                     
                                 
                                                                         
                                                               
                                                                     
                                                                                   
                                                                                     
                                 
                                                                  
                                                               
                                                                  
                                                                                   
                                                                                     
       
  }

  part def RecoveryApplicability :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port rawReturn : DataPort { in :>> type : ReturnSample; }
    port temperatureAssessment : DataPort { in :>> type : TemperatureAssessment; }
    port maintenanceAssessment : DataPort { in :>> type : MaintenanceAssessment; }
    port proposalForArbitration : DataPort { out :>> type : RecoveryProposal; }
    port proposalForOutcomes : DataPort { out :>> type : RecoveryProposal; }

                        
               
                             
                                                  
                                                                
                                                                                     
                                                    
                                                                       
                                                                                                                
                                                                                                  
                                                                                                              
                                                                                                               
                                                 

                
                         
                                                                                           
                                                                              
                                                                          

             
                                   
                                                                                                                         
                                                        

                     
                               
                                                                                                                     
                                                            
                                                                                      
                                                                                     
                                                                                                                           
                                                                                                                       
                               
                                                                                                                         
                                                          
                                                                                      
                                                                                      
                                                                      
                                                                                                                           
                                                                                                                       
                               
                                                                                                                   
                                                          
                                                                                      
                                                                                  
                                                                         
                                                                                                                           
                                                                                                                       
                               
                                                                                                                                    
                                                          
                                                                                   
                                                                                    
                                                                         
                                                                                                                           
                                                                                                                       
                               
                                                                                                              
                                                          
                                                                                      
                                                                                    
                                                                         
                                                                                                                           
                                                                                                                       
       
  }

  part def HealthModeArbitration :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port temperatureAssessment : DataPort { in :>> type : TemperatureAssessment; }
    port maintenanceAssessment : DataPort { in :>> type : MaintenanceAssessment; }
    port recoveryProposal : DataPort { in :>> type : RecoveryProposal; }
    port healthDecision : DataPort { out :>> type : HealthDecision; }

                        
           
                          
                                       

               
                            
                                                                  
                                                                  
                                                                                  
                                                                
                                                      
                                                                    
                                                                     
                                                              
                                                                    
                                                                 
                                                              
                                                                 
                                                                   
                                                          
                                                                    
                                                                  

                
                         
                                                                                                                              
                                                        
                                                                    
                                                                  

             
                                
                                                                                                              
                                                 

                             
                     
                           
                                                                                                             
                                                                                      
                                                                                      
                                                                                 
                                                                                                          
                                                                    
                                                                                
                                                                              

                           
                                                                                                           
                                                                                      
                                                                                  
                                                                                 
                                                                                                      
                                                                        
                                                                                    
                                                                                

                           
                                                                                                                       
                                                                                   
                                                                                    
                                                                                 
                                                                                                      
                                                                            
                                                                                        
                                                                                

                           
                                                                                                                  
                                                                                      
                                                                                    
                                                                      
                                                                    
                                                                    
                                                                                
                                                                             

                           
                                                                                                             
                                                                                      
                                                                                    
                                                                          
                                                                    
                                                                    
                                                                                
                                                                                  

                           
                                                                                                           
                                                                                      
                                                                                    
                                                                      
                                                                    
                                                                    
                                                                                
                                                                                    

                           
                                                                                                  
                                                                                      
                                                                                    
                                                                          
                                                                    
                                                                    
                                                                                
                                                                               

                           
                                                                                                                
                                                                                      
                                                                                    
                                                                      
                                                                        
                                                                        
                                                                                    
                                                                                    

                           
                                                                                                       
                                                                                      
                                                                                    
                                                                          
                                                                        
                                                                    
                                                                                
                                                                               

                           
                                                                                                                       
                                                                                      
                                                                                    
                                                                      
                                                                            
                                                                            
                                                                                        
                                                                                    

                           
                                                                                                              
                                                                                      
                                                                                    
                                                                          
                                                                            
                                                                    
                                                                                
                                                                               
       
  }

  part def BoundaryOutcomeDerivation :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port healthDecision : DataPort { in :>> type : HealthDecision; }
    port recoveryProposal : DataPort { in :>> type : RecoveryProposal; }
    port vehicleHealthMode : DataPort { out :>> type : VehicleHealthMode; }
    port powerDisposition : DataPort { out :>> type : ElectricalPowerDisposition; }
    port recoveryGuidance : DataPort { out :>> type : RecoveryGuidance; }

                        
               
                        
                                                          
                                                                                    
                                                               
                                                               
                                                                   
                                                                
                                                       
                                                                 
                                                                       
                                                                
                                                       
                                                                 
                                                               
                                                             
                                                       
                                                               
                                                                  
                                                           
                                                               
                                                               
                                                           
                                                               
                                                                    
                                                      

                        
                                                  
                                                                          
                                                                          
                                             

                        
                                                   
                                                                                    
                                                        
                                                                                                    
                                                   

                        
                                                      
                                                                             
                                                                                                 
                                                                                                           
                                                                        
                                                                                                              
                                                                                                                      
                                     

                
                         
                                                                                                   
                                                              
                                                                   
                                                                        

             
                        
                                                                                                                            
                                                                               
                                                                               
                                                                                 
       
  }

  part def VehicleHealthSupervisionProcess :> Process {
    part temperatureQualification : TemperatureEvidenceQualification;
    part maintenanceQualification : MaintenanceEvidenceQualification;
    part recoveryApplicability : RecoveryApplicability;
    part healthModeArbitration : HealthModeArbitration;
    part boundaryOutcomeDerivation : BoundaryOutcomeDerivation;

    port temperatureSample : DataPort { in :>> type : TemperatureSample; }
    port maintenanceSample : DataPort { in :>> type : MaintenanceSample; }
    port returnSample : DataPort { in :>> type : ReturnSample; }
    port vehicleHealthMode : DataPort { out :>> type : VehicleHealthMode; }
    port powerDisposition : DataPort { out :>> type : ElectricalPowerDisposition; }
    port recoveryGuidance : DataPort { out :>> type : RecoveryGuidance; }

    connection supportTemperatureInput : PortConnection
      connect temperatureSample to temperatureQualification.rawTemperature;
    connection supportMaintenanceInput : PortConnection
      connect maintenanceSample to maintenanceQualification.rawMaintenance;
    connection supportReturnInput : PortConnection
      connect returnSample to recoveryApplicability.rawReturn;

    connection temperatureToRecovery : PortConnection
      connect temperatureQualification.assessmentForRecovery to recoveryApplicability.temperatureAssessment;
    connection maintenanceToRecovery : PortConnection
      connect maintenanceQualification.assessmentForRecovery to recoveryApplicability.maintenanceAssessment;
    connection temperatureToArbitration : PortConnection
      connect temperatureQualification.assessmentForArbitration to healthModeArbitration.temperatureAssessment;
    connection maintenanceToArbitration : PortConnection
      connect maintenanceQualification.assessmentForArbitration to healthModeArbitration.maintenanceAssessment;
    connection proposalToArbitration : PortConnection
      connect recoveryApplicability.proposalForArbitration to healthModeArbitration.recoveryProposal;
    connection proposalToOutcomes : PortConnection
      connect recoveryApplicability.proposalForOutcomes to boundaryOutcomeDerivation.recoveryProposal;
    connection decisionToOutcomes : PortConnection
      connect healthModeArbitration.healthDecision to boundaryOutcomeDerivation.healthDecision;

    connection supportHealthModeOutput : PortConnection
      connect boundaryOutcomeDerivation.vehicleHealthMode to vehicleHealthMode;
    connection supportPowerOutput : PortConnection
      connect boundaryOutcomeDerivation.powerDisposition to powerDisposition;
    connection supportGuidanceOutput : PortConnection
      connect boundaryOutcomeDerivation.recoveryGuidance to recoveryGuidance;
  }

  part def VehicleTemperatureHealthSupervisorSystem :> System {
    part supervisionProcess : VehicleHealthSupervisionProcess;

    port temperatureSample : DataPort { in :>> type : TemperatureSample; }
    port maintenanceSample : DataPort { in :>> type : MaintenanceSample; }
    port returnSample : DataPort { in :>> type : ReturnSample; }
    port vehicleHealthMode : DataPort { out :>> type : VehicleHealthMode; }
    port powerDisposition : DataPort { out :>> type : ElectricalPowerDisposition; }
    port recoveryGuidance : DataPort { out :>> type : RecoveryGuidance; }

    connection supportBoundaryTemperature : PortConnection
      connect temperatureSample to supervisionProcess.temperatureSample;
    connection supportBoundaryMaintenance : PortConnection
      connect maintenanceSample to supervisionProcess.maintenanceSample;
    connection supportBoundaryReturn : PortConnection
      connect returnSample to supervisionProcess.returnSample;
    connection supportBoundaryHealthMode : PortConnection
      connect supervisionProcess.vehicleHealthMode to vehicleHealthMode;
    connection supportBoundaryPower : PortConnection
      connect supervisionProcess.powerDisposition to powerDisposition;
    connection supportBoundaryGuidance : PortConnection
      connect supervisionProcess.recoveryGuidance to recoveryGuidance;
  }

  part vehicleTemperatureHealthSupervisor : VehicleTemperatureHealthSupervisorSystem;
}
