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
    port rawTemperature : DataPort { in :>> type : TemperatureSample; }
    port assessmentForRecovery : DataPort { out :>> type : TemperatureAssessment; }
    port assessmentForArbitration : DataPort { out :>> type : TemperatureAssessment; }

    language "GUMBO" /*{
      functions
        @strictpure def qualifyTemperature(sample: TemperatureSample): TemperatureAssessment :=
          if sample.status == InputStatus.Invalid ? TemperatureAssessment.InvalidTemperature
          else if sample.relation == TemperatureRelation.AtOrBelowMaximum ? TemperatureAssessment.NominalTemperature
          else TemperatureAssessment.OverTemperature;

      initialize
        guarantee INITIAL_TEMPERATURE_UNTRUSTED:
          assessmentForRecovery == TemperatureAssessment.InvalidTemperature and
          assessmentForArbitration == TemperatureAssessment.InvalidTemperature;

      compute
        guarantee TEMPERATURE_FANOUT_PRESERVES_FACT: assessmentForRecovery == assessmentForArbitration;
        compute_cases
          case TEMPERATURE_INVALID:
            assume rawTemperature.status == InputStatus.Invalid;
            guarantee assessmentForRecovery == qualifyTemperature(rawTemperature) and
              assessmentForArbitration == qualifyTemperature(rawTemperature);
          case TEMPERATURE_NOMINAL:
            assume rawTemperature.status == InputStatus.Valid and
              rawTemperature.relation == TemperatureRelation.AtOrBelowMaximum;
            guarantee assessmentForRecovery == qualifyTemperature(rawTemperature) and
              assessmentForArbitration == qualifyTemperature(rawTemperature);
          case TEMPERATURE_OVER:
            assume rawTemperature.status == InputStatus.Valid and
              rawTemperature.relation == TemperatureRelation.AboveMaximum;
            guarantee assessmentForRecovery == qualifyTemperature(rawTemperature) and
              assessmentForArbitration == qualifyTemperature(rawTemperature);
    }*/
                        
               
                              
                                                                                   
                                                                                             
                                                                                                                     
                                                     

                
                         
                                                                                                                
                                                                             
                                                                               

             
                                   
                                                                                                                           
                                                            

                     
                                
                                                                                                                 
                                                                
                                                                                   
                                                                                     
                                
                                                                                             
                                                               
                                                                                   
                                                                                   
                                                                                     
                                
                                                                                         
                                                               
                                                                               
                                                                                   
                                                                                     
       
  }

  part def MaintenanceEvidenceQualification :> Thread {
    port rawMaintenance : DataPort { in :>> type : MaintenanceSample; }
    port assessmentForRecovery : DataPort { out :>> type : MaintenanceAssessment; }
    port assessmentForArbitration : DataPort { out :>> type : MaintenanceAssessment; }

    language "GUMBO" /*{
      functions
        @strictpure def qualifyMaintenance(sample: MaintenanceSample): MaintenanceAssessment :=
          if sample.status == InputStatus.Invalid ? MaintenanceAssessment.InvalidMaintenance
          else if sample.timing == MaintenanceTiming.NotDue ? MaintenanceAssessment.MaintenanceClear
          else MaintenanceAssessment.MaintenanceDue;

      initialize
        guarantee INITIAL_MAINTENANCE_UNTRUSTED:
          assessmentForRecovery == MaintenanceAssessment.InvalidMaintenance and
          assessmentForArbitration == MaintenanceAssessment.InvalidMaintenance;

      compute
        guarantee MAINTENANCE_FANOUT_PRESERVES_FACT: assessmentForRecovery == assessmentForArbitration;
        compute_cases
          case MAINTENANCE_INVALID:
            assume rawMaintenance.status == InputStatus.Invalid;
            guarantee assessmentForRecovery == qualifyMaintenance(rawMaintenance) and
              assessmentForArbitration == qualifyMaintenance(rawMaintenance);
          case MAINTENANCE_CLEAR:
            assume rawMaintenance.status == InputStatus.Valid and
              rawMaintenance.timing == MaintenanceTiming.NotDue;
            guarantee assessmentForRecovery == qualifyMaintenance(rawMaintenance) and
              assessmentForArbitration == qualifyMaintenance(rawMaintenance);
          case MAINTENANCE_DUE:
            assume rawMaintenance.status == InputStatus.Valid and
              rawMaintenance.timing == MaintenanceTiming.Due;
            guarantee assessmentForRecovery == qualifyMaintenance(rawMaintenance) and
              assessmentForArbitration == qualifyMaintenance(rawMaintenance);
    }*/
                        
               
                               
                                                                                   
                                                                                             
                                                                                                     
                                                    

                
                         
                                                                                                                
                                                                             
                                                                               

             
                                   
                                                                                                                           
                                                            

                     
                                 
                                                                                                           
                                                                
                                                                                   
                                                                                     
                                 
                                                                         
                                                               
                                                                     
                                                                                   
                                                                                     
                                 
                                                                  
                                                               
                                                                  
                                                                                   
                                                                                     
       
  }

  part def RecoveryApplicability :> Thread {
    port rawReturn : DataPort { in :>> type : ReturnSample; }
    port temperatureAssessment : DataPort { in :>> type : TemperatureAssessment; }
    port maintenanceAssessment : DataPort { in :>> type : MaintenanceAssessment; }
    port proposalForArbitration : DataPort { out :>> type : RecoveryProposal; }
    port proposalForOutcomes : DataPort { out :>> type : RecoveryProposal; }

    language "GUMBO" /*{
      functions
        @strictpure def classifyRecovery(sample: ReturnSample, temperature: TemperatureAssessment,
          maintenance: MaintenanceAssessment): RecoveryProposal :=
          if sample.status == InputStatus.Invalid or
            temperature == TemperatureAssessment.InvalidTemperature or
            maintenance == MaintenanceAssessment.InvalidMaintenance ? RecoveryProposal.InvalidRecoveryEvidence
          else if sample.indication == ReturnIndication.NoRequest ? RecoveryProposal.NotRequested
          else if maintenance == MaintenanceAssessment.MaintenanceDue ? RecoveryProposal.BlockedByMaintenance
          else if temperature == TemperatureAssessment.OverTemperature ? RecoveryProposal.BlockedByTemperature
          else RecoveryProposal.EligibleRecovery;

      initialize
        guarantee INITIAL_RECOVERY_UNTRUSTED:
          proposalForArbitration == RecoveryProposal.InvalidRecoveryEvidence and
          proposalForOutcomes == RecoveryProposal.InvalidRecoveryEvidence;

      compute
        guarantee RECOVERY_FANOUT_PRESERVES_FACT: proposalForArbitration == proposalForOutcomes;
        compute_cases
          case RECOVERY_INVALID:
            assume rawReturn.status == InputStatus.Invalid or
              temperatureAssessment == TemperatureAssessment.InvalidTemperature or
              maintenanceAssessment == MaintenanceAssessment.InvalidMaintenance;
            guarantee proposalForArbitration == classifyRecovery(rawReturn, temperatureAssessment, maintenanceAssessment) and
              proposalForOutcomes == classifyRecovery(rawReturn, temperatureAssessment, maintenanceAssessment);
          case RECOVERY_NOT_REQUESTED:
            assume rawReturn.status == InputStatus.Valid and
              temperatureAssessment != TemperatureAssessment.InvalidTemperature and
              maintenanceAssessment != MaintenanceAssessment.InvalidMaintenance and
              rawReturn.indication == ReturnIndication.NoRequest;
            guarantee proposalForArbitration == classifyRecovery(rawReturn, temperatureAssessment, maintenanceAssessment) and
              proposalForOutcomes == classifyRecovery(rawReturn, temperatureAssessment, maintenanceAssessment);
          case RECOVERY_BLOCKED_MAINTENANCE:
            assume rawReturn.status == InputStatus.Valid and
              temperatureAssessment != TemperatureAssessment.InvalidTemperature and
              maintenanceAssessment == MaintenanceAssessment.MaintenanceDue and
              rawReturn.indication == ReturnIndication.FreshRequest;
            guarantee proposalForArbitration == classifyRecovery(rawReturn, temperatureAssessment, maintenanceAssessment) and
              proposalForOutcomes == classifyRecovery(rawReturn, temperatureAssessment, maintenanceAssessment);
          case RECOVERY_BLOCKED_TEMPERATURE:
            assume rawReturn.status == InputStatus.Valid and
              temperatureAssessment == TemperatureAssessment.OverTemperature and
              maintenanceAssessment == MaintenanceAssessment.MaintenanceClear and
              rawReturn.indication == ReturnIndication.FreshRequest;
            guarantee proposalForArbitration == classifyRecovery(rawReturn, temperatureAssessment, maintenanceAssessment) and
              proposalForOutcomes == classifyRecovery(rawReturn, temperatureAssessment, maintenanceAssessment);
          case RECOVERY_ELIGIBLE:
            assume rawReturn.status == InputStatus.Valid and
              temperatureAssessment == TemperatureAssessment.NominalTemperature and
              maintenanceAssessment == MaintenanceAssessment.MaintenanceClear and
              rawReturn.indication == ReturnIndication.FreshRequest;
            guarantee proposalForArbitration == classifyRecovery(rawReturn, temperatureAssessment, maintenanceAssessment) and
              proposalForOutcomes == classifyRecovery(rawReturn, temperatureAssessment, maintenanceAssessment);
    }*/
                        
               
                             
                                                  
                                                                
                                                                                     
                                                    
                                                                       
                                                                                                                
                                                                                                  
                                                                                                              
                                                                                                               
                                                 

                
                         
                                                                                           
                                                                              
                                                                          

             
                                   
                                                                                                                         
                                                        

                     
                               
                                                                                                                     
                                                            
                                                                                      
                                                                                     
                                                                                                                           
                                                                                                                       
                               
                                                                                                                         
                                                          
                                                                                      
                                                                                      
                                                                      
                                                                                                                           
                                                                                                                       
                               
                                                                                                                   
                                                          
                                                                                      
                                                                                  
                                                                         
                                                                                                                           
                                                                                                                       
                               
                                                                                                                                    
                                                          
                                                                                   
                                                                                    
                                                                         
                                                                                                                           
                                                                                                                       
                               
                                                                                                              
                                                          
                                                                                      
                                                                                    
                                                                         
                                                                                                                           
                                                                                                                       
       
  }

  part def HealthModeArbitration :> Thread {
    port temperatureAssessment : DataPort { in :>> type : TemperatureAssessment; }
    port maintenanceAssessment : DataPort { in :>> type : MaintenanceAssessment; }
    port recoveryProposal : DataPort { in :>> type : RecoveryProposal; }
    port healthDecision : DataPort { out :>> type : HealthDecision; }

    language "GUMBO" /*{
      state
        healthState: VehicleHealthMode;

      functions
        @strictpure def proposalConsistent(temperature: TemperatureAssessment,
          maintenance: MaintenanceAssessment, proposal: RecoveryProposal): Base_Types::Boolean :=
          proposal == RecoveryProposal.InvalidRecoveryEvidence or
          (proposal == RecoveryProposal.NotRequested and
            temperature != TemperatureAssessment.InvalidTemperature and
            maintenance != MaintenanceAssessment.InvalidMaintenance) or
          (proposal == RecoveryProposal.BlockedByMaintenance and
            temperature != TemperatureAssessment.InvalidTemperature and
            maintenance == MaintenanceAssessment.MaintenanceDue) or
          (proposal == RecoveryProposal.BlockedByTemperature and
            temperature == TemperatureAssessment.OverTemperature and
            maintenance == MaintenanceAssessment.MaintenanceClear) or
          (proposal == RecoveryProposal.EligibleRecovery and
            temperature == TemperatureAssessment.NominalTemperature and
            maintenance == MaintenanceAssessment.MaintenanceClear);

      initialize
        modifies healthState;
        guarantee INITIAL_OWNER_HOLD:
          healthState == VehicleHealthMode.Unavailable and
          healthDecision.nextMode == VehicleHealthMode.Unavailable and
          healthDecision.reason == DecisionReason.InvalidEvidence;

      compute
        modifies healthState;
        guarantee COMMITTED_DECISION_MATCHES_STATE: healthDecision.nextMode == healthState;
        compute_cases
          case CASE_01_INVALID_OR_MALFORMED:
            assume temperatureAssessment == TemperatureAssessment.InvalidTemperature or
              maintenanceAssessment == MaintenanceAssessment.InvalidMaintenance or
              recoveryProposal == RecoveryProposal.InvalidRecoveryEvidence or
              not proposalConsistent(temperatureAssessment, maintenanceAssessment, recoveryProposal);
            guarantee healthState == VehicleHealthMode.Unavailable and
              healthDecision.nextMode == VehicleHealthMode.Unavailable and
              healthDecision.reason == DecisionReason.InvalidEvidence;
          case CASE_02_MAINTENANCE_PRIORITY:
            assume temperatureAssessment != TemperatureAssessment.InvalidTemperature and
              maintenanceAssessment == MaintenanceAssessment.MaintenanceDue and
              recoveryProposal != RecoveryProposal.InvalidRecoveryEvidence and
              proposalConsistent(temperatureAssessment, maintenanceAssessment, recoveryProposal);
            guarantee healthState == VehicleHealthMode.MaintenanceHold and
              healthDecision.nextMode == VehicleHealthMode.MaintenanceHold and
              healthDecision.reason == DecisionReason.MaintenanceActive;
          case CASE_03_TEMPERATURE_PRIORITY:
            assume temperatureAssessment == TemperatureAssessment.OverTemperature and
              maintenanceAssessment == MaintenanceAssessment.MaintenanceClear and
              recoveryProposal != RecoveryProposal.InvalidRecoveryEvidence and
              proposalConsistent(temperatureAssessment, maintenanceAssessment, recoveryProposal);
            guarantee healthState == VehicleHealthMode.TemperatureDegraded and
              healthDecision.nextMode == VehicleHealthMode.TemperatureDegraded and
              healthDecision.reason == DecisionReason.TemperatureActive;
          case CASE_04_OPERATIONAL_RETAINED:
            assume temperatureAssessment == TemperatureAssessment.NominalTemperature and
              maintenanceAssessment == MaintenanceAssessment.MaintenanceClear and
              recoveryProposal == RecoveryProposal.NotRequested and In(healthState) == VehicleHealthMode.Operational;
            guarantee healthState == VehicleHealthMode.Operational and
              healthDecision.nextMode == VehicleHealthMode.Operational and
              healthDecision.reason == DecisionReason.NormalRetained;
          case CASE_05_RECOVERY_NOT_REQUIRED:
            assume temperatureAssessment == TemperatureAssessment.NominalTemperature and
              maintenanceAssessment == MaintenanceAssessment.MaintenanceClear and
              recoveryProposal == RecoveryProposal.EligibleRecovery and In(healthState) == VehicleHealthMode.Operational;
            guarantee healthState == VehicleHealthMode.Operational and
              healthDecision.nextMode == VehicleHealthMode.Operational and
              healthDecision.reason == DecisionReason.RecoveryNotRequired;
          case CASE_06_UNAVAILABLE_RETAINS:
            assume temperatureAssessment == TemperatureAssessment.NominalTemperature and
              maintenanceAssessment == MaintenanceAssessment.MaintenanceClear and
              recoveryProposal == RecoveryProposal.NotRequested and In(healthState) == VehicleHealthMode.Unavailable;
            guarantee healthState == VehicleHealthMode.Unavailable and
              healthDecision.nextMode == VehicleHealthMode.Unavailable and
              healthDecision.reason == DecisionReason.FreshRecoveryRequired;
          case CASE_07_UNAVAILABLE_RECOVERS:
            assume temperatureAssessment == TemperatureAssessment.NominalTemperature and
              maintenanceAssessment == MaintenanceAssessment.MaintenanceClear and
              recoveryProposal == RecoveryProposal.EligibleRecovery and In(healthState) == VehicleHealthMode.Unavailable;
            guarantee healthState == VehicleHealthMode.Operational and
              healthDecision.nextMode == VehicleHealthMode.Operational and
              healthDecision.reason == DecisionReason.RecoveryAccepted;
          case CASE_08_MAINTENANCE_RETAINS:
            assume temperatureAssessment == TemperatureAssessment.NominalTemperature and
              maintenanceAssessment == MaintenanceAssessment.MaintenanceClear and
              recoveryProposal == RecoveryProposal.NotRequested and In(healthState) == VehicleHealthMode.MaintenanceHold;
            guarantee healthState == VehicleHealthMode.MaintenanceHold and
              healthDecision.nextMode == VehicleHealthMode.MaintenanceHold and
              healthDecision.reason == DecisionReason.FreshRecoveryRequired;
          case CASE_09_MAINTENANCE_RECOVERS:
            assume temperatureAssessment == TemperatureAssessment.NominalTemperature and
              maintenanceAssessment == MaintenanceAssessment.MaintenanceClear and
              recoveryProposal == RecoveryProposal.EligibleRecovery and In(healthState) == VehicleHealthMode.MaintenanceHold;
            guarantee healthState == VehicleHealthMode.Operational and
              healthDecision.nextMode == VehicleHealthMode.Operational and
              healthDecision.reason == DecisionReason.RecoveryAccepted;
          case CASE_10_TEMPERATURE_RETAINS:
            assume temperatureAssessment == TemperatureAssessment.NominalTemperature and
              maintenanceAssessment == MaintenanceAssessment.MaintenanceClear and
              recoveryProposal == RecoveryProposal.NotRequested and In(healthState) == VehicleHealthMode.TemperatureDegraded;
            guarantee healthState == VehicleHealthMode.TemperatureDegraded and
              healthDecision.nextMode == VehicleHealthMode.TemperatureDegraded and
              healthDecision.reason == DecisionReason.FreshRecoveryRequired;
          case CASE_11_TEMPERATURE_RECOVERS:
            assume temperatureAssessment == TemperatureAssessment.NominalTemperature and
              maintenanceAssessment == MaintenanceAssessment.MaintenanceClear and
              recoveryProposal == RecoveryProposal.EligibleRecovery and In(healthState) == VehicleHealthMode.TemperatureDegraded;
            guarantee healthState == VehicleHealthMode.Operational and
              healthDecision.nextMode == VehicleHealthMode.Operational and
              healthDecision.reason == DecisionReason.RecoveryAccepted;
    }*/
                        
           
                          
                                       

               
                            
                                                                  
                                                                  
                                                                                  
                                                                
                                                      
                                                                    
                                                                     
                                                              
                                                                    
                                                                 
                                                              
                                                                 
                                                                   
                                                          
                                                                    
                                                                  

                
                         
                                                                                                                              
                                                        
                                                                    
                                                                  

             
                                
                                                                                                              
                                                 

                             
                     
                           
                                                                                                             
                                                                                      
                                                                                      
                                                                                 
                                                                                                          
                                                                    
                                                                                
                                                                              

                           
                                                                                                           
                                                                                      
                                                                                  
                                                                                 
                                                                                                      
                                                                        
                                                                                    
                                                                                

                           
                                                                                                                       
                                                                                   
                                                                                    
                                                                                 
                                                                                                      
                                                                            
                                                                                        
                                                                                

                           
                                                                                                                  
                                                                                      
                                                                                    
                                                                      
                                                                    
                                                                    
                                                                                
                                                                             

                           
                                                                                                             
                                                                                      
                                                                                    
                                                                          
                                                                    
                                                                    
                                                                                
                                                                                  

                           
                                                                                                           
                                                                                      
                                                                                    
                                                                      
                                                                    
                                                                    
                                                                                
                                                                                    

                           
                                                                                                  
                                                                                      
                                                                                    
                                                                          
                                                                    
                                                                    
                                                                                
                                                                               

                           
                                                                                                                
                                                                                      
                                                                                    
                                                                      
                                                                        
                                                                        
                                                                                    
                                                                                    

                           
                                                                                                       
                                                                                      
                                                                                    
                                                                          
                                                                        
                                                                    
                                                                                
                                                                               

                           
                                                                                                                       
                                                                                      
                                                                                    
                                                                      
                                                                            
                                                                            
                                                                                        
                                                                                    

                           
                                                                                                              
                                                                                      
                                                                                    
                                                                          
                                                                            
                                                                    
                                                                                
                                                                               
       
  }

  part def BoundaryOutcomeDerivation :> Thread {
    port healthDecision : DataPort { in :>> type : HealthDecision; }
    port recoveryProposal : DataPort { in :>> type : RecoveryProposal; }
    port vehicleHealthMode : DataPort { out :>> type : VehicleHealthMode; }
    port powerDisposition : DataPort { out :>> type : ElectricalPowerDisposition; }
    port recoveryGuidance : DataPort { out :>> type : RecoveryGuidance; }

    language "GUMBO" /*{
      functions
        @strictpure def acceptedProducerPair(decision: HealthDecision, proposal: RecoveryProposal): Base_Types::Boolean :=
          (decision.nextMode == VehicleHealthMode.Unavailable and decision.reason == DecisionReason.InvalidEvidence) or
          (decision.nextMode == VehicleHealthMode.MaintenanceHold and decision.reason == DecisionReason.MaintenanceActive and
            (proposal == RecoveryProposal.NotRequested or proposal == RecoveryProposal.BlockedByMaintenance)) or
          (decision.nextMode == VehicleHealthMode.TemperatureDegraded and decision.reason == DecisionReason.TemperatureActive and
            (proposal == RecoveryProposal.NotRequested or proposal == RecoveryProposal.BlockedByTemperature)) or
          (decision.nextMode == VehicleHealthMode.Operational and decision.reason == DecisionReason.NormalRetained and
            proposal == RecoveryProposal.NotRequested) or
          (decision.nextMode == VehicleHealthMode.Operational and decision.reason == DecisionReason.RecoveryNotRequired and
            proposal == RecoveryProposal.EligibleRecovery) or
          (decision.nextMode == VehicleHealthMode.Operational and decision.reason == DecisionReason.RecoveryAccepted and
            proposal == RecoveryProposal.EligibleRecovery) or
          (decision.nextMode != VehicleHealthMode.Operational and decision.reason == DecisionReason.FreshRecoveryRequired and
            proposal == RecoveryProposal.NotRequested);

        @strictpure def selectedMode(decision: HealthDecision, proposal: RecoveryProposal): VehicleHealthMode :=
          if acceptedProducerPair(decision, proposal) ? decision.nextMode else VehicleHealthMode.Unavailable;

        @strictpure def selectedPower(decision: HealthDecision, proposal: RecoveryProposal): ElectricalPowerDisposition :=
          if acceptedProducerPair(decision, proposal) and decision.nextMode == VehicleHealthMode.Operational ?
            ElectricalPowerDisposition.Enable else ElectricalPowerDisposition.Withhold;

        @strictpure def selectedGuidance(decision: HealthDecision, proposal: RecoveryProposal): RecoveryGuidance :=
          if not acceptedProducerPair(decision, proposal) ? RecoveryGuidance.RepairInputEvidence
          else if decision.reason == DecisionReason.InvalidEvidence ? RecoveryGuidance.RepairInputEvidence
          else if decision.reason == DecisionReason.MaintenanceActive or decision.reason == DecisionReason.TemperatureActive ?
            RecoveryGuidance.ClearActiveCondition
          else if decision.reason == DecisionReason.FreshRecoveryRequired ? RecoveryGuidance.SubmitFreshReturnRequest
          else RecoveryGuidance.None;

      initialize
        guarantee INITIAL_BOUNDARY_HOLD:
          vehicleHealthMode == VehicleHealthMode.Unavailable and
          powerDisposition == ElectricalPowerDisposition.Withhold and
          recoveryGuidance == RecoveryGuidance.SubmitFreshReturnRequest;

      compute
        guarantee DEFENSIVE_OUTCOME_CLASSIFICATION:
          vehicleHealthMode == selectedMode(healthDecision, recoveryProposal) and
          powerDisposition == selectedPower(healthDecision, recoveryProposal) and
          recoveryGuidance == selectedGuidance(healthDecision, recoveryProposal);
    }*/
                        
               
                        
                                                          
                                                                                    
                                                               
                                                               
                                                                   
                                                                
                                                       
                                                                 
                                                                       
                                                                
                                                       
                                                                 
                                                               
                                                             
                                                       
                                                               
                                                                  
                                                           
                                                               
                                                               
                                                           
                                                               
                                                                    
                                                      

                        
                                                  
                                                                          
                                                                          
                                             

                        
                                                   
                                                                                    
                                                        
                                                                                                    
                                                   

                        
                                                      
                                                                             
                                                                                                 
                                                                                                           
                                                                        
                                                                                                              
                                                                                                                      
                                     

                
                         
                                                                                                   
                                                              
                                                                   
                                                                        

             
                        
                                                                                                                            
                                                                               
                                                                               
                                                                                 
       
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
