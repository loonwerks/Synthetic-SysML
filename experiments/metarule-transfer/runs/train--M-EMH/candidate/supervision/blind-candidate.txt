// Architecture checkpoint: approved HVAC-VIS-01 allocation, without GUMBO behavior.
package HVAC_Visibility_Priority_Supervisor {
  private import HAMR::*;

  // Boundary and primitive finite data vocabulary.
  enum def Validity { enum Valid; enum Invalid; }
  enum def Arrival { enum New; enum Held; }
  enum def EnableIntent { enum On; enum Off; }
  enum def DefrostIntent { enum Requested; enum NotRequested; }
  enum def ThermalBand { enum Cool; enum Neutral; enum Warm; }
  enum def FanIntent { enum Low; enum High; }
  enum def CabinBand { enum Cool; enum Neutral; enum Warm; }
  part def UserClimateRequest :> Data {
    attribute validity : Validity;
    attribute arrival : Arrival;
    attribute enabled : EnableIntent;
    attribute defrost : DefrostIntent;
    attribute target : ThermalBand;
    attribute fan : FanIntent;
  }
  part def CabinThermalObservation :> Data {
    attribute validity : Validity;
    attribute band : CabinBand;
  }
  enum def GlazingCondition { enum Clear; enum Misting; enum Obscured; }
  part def GlazingObservation :> Data {
    attribute validity : Validity;
    attribute condition : GlazingCondition;
  }
  enum def HumidityCondition { enum Dry; enum Acceptable; enum Damp; }
  part def HumidityObservation :> Data {
    attribute validity : Validity;
    attribute condition : HumidityCondition;
  }
  enum def AirCondition { enum Clean; enum Loaded; }
  part def AirQualityObservation :> Data {
    attribute validity : Validity;
    attribute condition : AirCondition;
  }
  enum def InterfaceState { enum Available; enum Unavailable; }
  enum def Budget { enum Denied; enum Limited; enum Full; }
  part def ElectricalAvailability :> Data {
    attribute validity : Validity;
    attribute interfaceState : InterfaceState;
    attribute budget : Budget;
  }
  enum def Availability { enum Available; enum Unavailable; }
  part def WasteHeatAvailability :> Data {
    attribute validity : Validity;
    attribute availability : Availability;
  }
  enum def BlowerReadiness { enum Ready; enum Failed; enum Unknown; }
  enum def ThermalReadiness { enum Ready; enum Failed; enum Unknown; }
  enum def ClearingReadiness { enum Ready; enum Failed; enum Unknown; }
  enum def AirTreatmentReadiness { enum Ready; enum Failed; enum Unknown; }
  part def EquipmentReadiness :> Data {
    attribute validity : Validity;
    attribute circulationState : BlowerReadiness;
    attribute thermal : ThermalReadiness;
    attribute clearing : ClearingReadiness;
    attribute airTreatment : AirTreatmentReadiness;
  }
  enum def RecoveryAcknowledgment { enum Absent; enum Fresh; }

  // Shared finite derived vocabulary.
  enum def RequestClass { enum Invalid; enum Off; enum Defrost; enum Comfort; }
  enum def ThermalNeed { enum Unavailable; enum Heat; enum None; enum Cool; }
  enum def ThermalObservationValidity { enum Valid; enum Invalid; }
  enum def VisibilityNeed { enum Unavailable; enum None; enum Preventive; enum Urgent; }
  enum def HumidityNeed { enum Unavailable; enum None; enum Dry; }
  enum def AirNeed { enum Unavailable; enum None; enum Filter; }
  enum def ElectricalTier { enum Ineligible; enum Denied; enum Limited; enum Full; }
  enum def ElectricalCause { enum None; enum InvalidInterface; enum ElectricalUnavailable; enum ElectricalDenied; }
  enum def WasteHeatEligibility { enum Eligible; enum Ineligible; }
  enum def ThermalDegradation { enum None; enum InvalidThermal; }
  enum def HumidityDegradation { enum None; enum InvalidHumidity; }
  enum def AirDegradation { enum None; enum InvalidAirQuality; }
  enum def ThermalBlowerAvailability { enum Available; enum Unavailable; }
  enum def ThermalEquipmentAvailability { enum Available; enum Unavailable; }
  enum def VisibilityBlowerAvailability { enum Available; enum Unavailable; }
  enum def ClearingAvailability { enum Available; enum Unavailable; }
  enum def AirTreatmentAvailability { enum Available; enum Unavailable; }
  enum def ThermalProposalAvailability { enum Available; enum Unavailable; }
  enum def VisibilityProposalAvailability { enum Available; enum Unavailable; }
  enum def ProposalUrgency { enum Unavailable; enum None; enum Preventive; enum Urgent; }
  enum def CabinAirProposalAvailability { enum Available; enum Unavailable; }
  enum def SelectionCause { enum None; enum VisibilityPriority; enum AwaitingRecovery; enum AwaitingFreshRequest; }
  enum def ArbitrationCause { enum None; enum VisibilityPriority; enum AwaitingRecovery; enum AwaitingFreshRequest; }
  enum def NoncriticalCause { enum None; enum InvalidThermal; enum InvalidHumidity; enum InvalidAirQuality; }
  enum def CandidateCause { enum None; enum VisibilityPriority; enum ElectricalUnavailable; enum ElectricalDenied; enum AwaitingRecovery; enum AwaitingFreshRequest; }
  enum def SelectionMode { enum Idle; enum Active; enum Degraded; enum FaultHold; enum AwaitFresh; }
  enum def ArbitrationMode { enum Idle; enum Active; enum Degraded; enum FaultHold; enum AwaitFresh; }
  enum def Authorization { enum Normal; enum AwaitFresh; }
  enum def RecoveryState { enum Clear; enum Latched; enum Pending; }
  enum def RecoveryEvent { enum NoRecoveryEvent; enum FaultEntered; enum AwaitingRecovery; enum RecoveryStarted; enum FaultRecurred; enum JustCleared; }
  enum def ElectricalCriticality { enum Present; enum Absent; }
  enum def EquipmentCriticality { enum Present; enum Absent; }
  enum def VisibilityCriticality { enum Present; enum Absent; }
  enum def RecoveryCause { enum None; enum InvalidVisibility; enum EquipmentFault; enum ElectricalUnavailable; enum AwaitingRecovery; }

  enum def Service { enum None; enum Ventilate; enum Heat; enum Cool; enum Defrost; enum Filter; enum Dry; }
  enum def Intensity { enum Off; enum Reduced; enum Normal; }
  enum def HeatSource { enum None; enum Electrical; enum WasteHeat; }
  enum def EnergyTier { enum None; enum Limited; enum Full; }
  part def CabinActuationPlan :> Data {
    attribute service : Service;
    attribute intensity : Intensity;
    attribute heatSource : HeatSource;
    attribute energyTier : EnergyTier;
  }
  enum def SupervisorMode { enum Idle; enum Active; enum Degraded; enum FaultHold; enum AwaitFresh; }
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
  part def SupervisorStatus :> Data {
    attribute mode : SupervisorMode;
    attribute statusCause : StatusCause;
  }

  // Flat interaction payloads. Every field later inspected by GUMBO is an attribute.
  part def QualifiedTarget :> Data {
    attribute requestClass : RequestClass;
    attribute target : ThermalBand;
  }
  part def QualifiedRequest :> Data {
    attribute requestClass : RequestClass;
    attribute arrival : Arrival;
    attribute enabled : EnableIntent;
    attribute fan : FanIntent;
  }
  part def ThermalAssessment :> Data {
    attribute need : ThermalNeed;
    attribute observationInvalid : ThermalObservationValidity;
  }
  part def ElectricalEligibility :> Data {
    attribute tier : ElectricalTier;
    attribute eligibilityCause : ElectricalCause;
  }
  part def ThermalPathReadiness :> Data {
    attribute thermalBlowerReady : ThermalBlowerAvailability;
    attribute thermalReady : ThermalEquipmentAvailability;
  }
  part def VisibilityPathReadiness :> Data {
    attribute visibilityBlowerReady : VisibilityBlowerAvailability;
    attribute clearingReady : ClearingAvailability;
  }
  part def AirPathReadiness :> Data {
    attribute airReady : AirTreatmentAvailability;
  }
  part def RecoveryReport :> Data {
    attribute recoveryState : RecoveryState;
    attribute recoveryEvent : RecoveryEvent;
    attribute faultAttribution : RecoveryCause;
  }
  part def ThermalProposal :> Data {
    attribute service : Service;
    attribute heatSource : HeatSource;
    attribute thermalApplicability : ThermalProposalAvailability;
    attribute degradation : ThermalDegradation;
  }
  part def VisibilityProposal :> Data {
    attribute visibilityApplicability : VisibilityProposalAvailability;
    attribute urgency : ProposalUrgency;
  }
  part def CabinAirProposal :> Data {
    attribute service : Service;
    attribute cabinAirApplicability : CabinAirProposalAvailability;
    attribute humidityDegradation : HumidityDegradation;
    attribute airDegradation : AirDegradation;
  }
  part def SelectedIntent :> Data {
    attribute service : Service;
    attribute heatSource : HeatSource;
    attribute fan : FanIntent;
    attribute selectedCause : SelectionCause;
    attribute controlMode : SelectionMode;
  }
  part def CandidatePlan :> Data {
    attribute plan : CabinActuationPlan;
    attribute candidateCause : CandidateCause;
  }
  part def ArbitrationStatus :> Data {
    attribute authorization : Authorization;
    attribute controlMode : ArbitrationMode;
    attribute arbitrationCause : ArbitrationCause;
    attribute noncriticalCause : NoncriticalCause;
  }

  // Responsibility-bearing semantic Thread definitions.
  part def RequestQualifier :> Thread {
    port userRequest : DataPort { in :>> type : UserClimateRequest; }
    port qualifiedTarget : DataPort { out :>> type : QualifiedTarget; }
    port qualifiedRequest : DataPort { out :>> type : QualifiedRequest; }

                        
                
                 
                             
                                                                                    
                                                                  
                                                           
                                                                   
                                                      
                                                          
                                                  
             
                     
                           
                                                                                        
                                                            
                                                                            
                                                                     
                                                            
                                                               
                                                               
                                                      
                           
                                                                                                           
                                                           
                                                             
                                                                            
                                                                     
                                                            
                                                               
                                                               
                                                      
                           
                                                                              
                                                           
                                                                 
                                                      
                                                                        
                                                                 
                                                            
                                                               
                                                               
                                                      
                           
                                                                                        
                                                           
                                                                 
                                                     
                                                                            
                                                                     
                                                            
                                                               
                                                               
                                                      
       
  }
  part def ThermalNeedAssessor :> Thread {
    port cabinObservation : DataPort { in :>> type : CabinThermalObservation; }
    port qualifiedTarget : DataPort { in :>> type : QualifiedTarget; }
    port thermalAssessment : DataPort { out :>> type : ThermalAssessment; }

                        
                
                 
                             
                                                                                            
                                                               
                                                                                       
             
                 
                           
                                                                                                                            
                                                                    
                                                                  
                                                                                             
                                                           
                                                                           
                                                                  
                                                                                           
                                                           
                                                                    
                                                                                                       
                                                                                                             
                                                                                                               
                                                           
                                                                                           
                                                           
                                                                    
                                                                                                       
                                                                                                                  
                                                           
                                                                                           
                                                           
                                                                    
                                                                                                       
                                                                                                                  
                                                           
                                                                                          
       
  }
  part def VisibilityNeedAssessor :> Thread {
    port glazingObservation : DataPort { in :>> type : GlazingObservation; }
    port visibilityNeed : DataPort { out :>> type : VisibilityNeed; }
    port visibilityFault : DataPort { out :>> type : VisibilityCriticality; }

                        
                
                 
                             
                                                                                     
                                                          
                                                             
             
                 
                           
                                                                                                                   
                                                                      
                                                               
                                                             
                                                                             
                                                        
                                                             
                                                                               
                                                              
                                                             
                                                                                
                                                         
                 
                            
                                                                                        
                                                                  
                                                                 
       
  }
  part def HumidityNeedAssessor :> Thread {
    port humidityObservation : DataPort { in :>> type : HumidityObservation; }
    port humidityNeed : DataPort { out :>> type : HumidityNeed; }

                        
                
                 
                             
                                                                                                                      
             
                 
                           
                                                                                     
                                                                                                                     
                                                                                                                               
                                                    
                                                                                                                               
                                                  
       
  }
  part def AirQualityNeedAssessor :> Thread {
    port airObservation : DataPort { in :>> type : AirQualityObservation; }
    port airNeed : DataPort { out :>> type : AirNeed; }

                        
                
                 
                             
                                                                                                  
             
                 
                           
                                                                                     
                                                                                                      
                                                                                                                 
                                          
                                                                                                                  
                                           
       
  }
  part def ElectricalEligibilityOwner :> Thread {
    port electricalAvailability : DataPort { in :>> type : ElectricalAvailability; }
    port electricalEligibility : DataPort { out :>> type : ElectricalEligibility; }
    port criticalElectrical : DataPort { out :>> type : ElectricalCriticality; }

                        
                
                 
                             
                                                                                                  
                                                                     
                                                                                        
                                                                
             
                     
                           
                                                                                                                                         
                                                                        
                                                                                    
                                                               
                                                                               
                                                                                          
                                                                  
                           
                                                                                                                    
                                                                      
                                                                                   
                                                             
                                                                               
                                                                                               
                                                                  
                           
                                                                                                                     
                                                                      
                                                                                 
                                                             
                                                                           
                                                                                          
                                                                 
                           
                                                                                                     
                                                                      
                                                                                 
                                                              
                                                                            
                                                                              
                                                                 
                           
                                                                                                        
                                                                      
                                                                                 
                                                           
                                                                         
                                                                              
                                                                 
       
  }
  part def WasteHeatEligibilityOwner :> Thread {
    port wasteHeatAvailability : DataPort { in :>> type : WasteHeatAvailability; }
    port wasteHeatEligibility : DataPort { out :>> type : WasteHeatEligibility; }

                        
                
                 
                             
                                                                                                                                  
             
                 
                           
                                                                                    
                                                                
                                                                                   
                                                                        
                                                                  
                                                                                     
                                                                         
       
  }
  part def EquipmentFaultAssessor :> Thread {
    port equipmentReadiness : DataPort { in :>> type : EquipmentReadiness; }
    port criticalEquipment : DataPort { out :>> type : EquipmentCriticality; }
    port thermalPath : DataPort { out :>> type : ThermalPathReadiness; }
    port visibilityPath : DataPort { out :>> type : VisibilityPathReadiness; }
    port airPath : DataPort { out :>> type : AirPathReadiness; }

                        
                
                 
                             
                                                                           
                                                               
                                                                                     
                                                                                  
                                                                                              
                                                                              
                                                                     
             
                 
                           
                                                                                                        
                                                                                        
                                                                                                   
                                                                                                                               
                                                                                        
                                                                   
                                                                
                                                                                        
                                                                       
                                                                       
                                                                                   
                                                                                                                           
                                                                                     
                                                                                                                             
                                                                                       
                                                                                                                             
                                                                                 
                                                                                                                               
                                                                                   
                                                                                                                                     
                                                                         
                                                                                                                                       
                                                                          
       
  }
  part def PriorityAuthorizationArbiter :> Thread {
    port qualifiedRequest : DataPort { in :>> type : QualifiedRequest; }
    port recoveryReport : DataPort { in :>> type : RecoveryReport; }
    port thermalProposal : DataPort { in :>> type : ThermalProposal; }
    port visibilityProposal : DataPort { in :>> type : VisibilityProposal; }
    port cabinAirProposal : DataPort { in :>> type : CabinAirProposal; }
    port selectedIntent : DataPort { out :>> type : SelectedIntent; }
    port arbitrationStatus : DataPort { out :>> type : ArbitrationStatus; }

                        
           
                         
                                      
                
                 
                             
                                                                                                       
                                                   
                                                    
                                                          
                                                 
                                                                 
                                                              
                                                                     
                                                                   
                                                                         
                                                                        
             
                     
                           
                                                                                                                    
                                                                          
                                                                    
                                                                 
                                                                                                     
                                                          
                                                                               
                                                                     
                                                                           
                                                                          
                                                                                       
                                                                                            
                                                                                             
                                                                                     
                                                                                                    
                                                                                           
                                                                                     
                                                                                             
                                                                                         
                                                                                          
                                                                                     
                                                                                             
                                                                                         
                                                                               
                           
                                                                                                                
                                                                        
                                                                        
                                                                 
                                                                                                     
                                                          
                                                                                   
                                                                      
                                                                           
                                                                           
                                                                                           
                                                                                            
                                                                                             
                                                                                                                                                                          
                                                                                           
                                                                                                                                                                   
                                                                                         
                                                                                          
                                                                                                                                                                   
                                                                                         
                                                                               
                           
                                                                                                                      
                                                                        
                                                                         
                                                             
                                                                                                         
                                                                      
                                                        
                                                                      
                                                                 
                                                                                                     
                                                          
                                                                                   
                                                                      
                                                                           
                                                                           
                                                                                           
                                                                                            
                                                                                             
                                                                                                                                                                          
                                                                                           
                                                                                                                                                                   
                                                                                         
                                                                                          
                                                                                                                                                                   
                                                                                         
                                                                               
                           
                                                                                                                
                                                                        
                                                                         
                                                                                                      
                                                                   
                                                             
                                                                                                        
                                                          
                                                                                 
                                                                  
                                                                       
                                                                       
                                                                                         
                                                                                            
                                                                                             
                                                                                                                                                                          
                                                                                           
                                                                                                                                                                   
                                                                                         
                                                                                          
                                                                                                                                                                   
                                                                                         
                                                                               
                           
                                                                                                                 
                                                                        
                                                                         
                                                                                                                                                                 
                                                          
                                                                                                                   
                                                                     
                                                                                                     
                                                             
                                                                                                        
                                                                                                                
                                                                  
                                                                                                                                 
                                                                           
                                                                                                                                                                          
                                                                                                                                                                          
                                                                                           
                                                                                                                                                                   
                                                                                                                                                                    
                                                                                                                                                                   
                                                                                                                                                         
                           
                                                                                             
                                                                        
                                                                         
                                                                                                                                                                 
                                                          
                                                                                                                   
                                                                                                                          
                                                             
                                                                                                     
                                                                                                                
                                                                
                                                                                                                               
                                                                           
                                                                                                                                                                          
                                                                                                                                                                          
                                                                                           
                                                                                                                                                                   
                                                                                                                                                                    
                                                                                                                                                                   
                                                                                                                                                         
                           
                                                                                                             
                                                                                                                                    
                                                                                                                                                                 
                                                                                                                                                               
                                                                                                                         
                                                                                                                                                                  
                                                                                                                                            
                                                                                                        
                                                                                                         
                                                                                                                        
                                                                                                                                 
                                                                           
                                                                                                                                                                          
                                                                                                                                                                                                                                                      
                                                                                                                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                                                                             
                           
                                                                                           
                                                                                                                                    
                                                                                                                                                                 
                                                                                                                                                               
                                                                                                                         
                                                                                                                                                                  
                                                                                                                                                 
                                                                                                                                         
                                                                                                     
                                                                                                         
                                                                                                                        
                                                                                                                                                                                               
                                                                                                                                                                          
                                                                                                                                                                                                                                                      
                                                                                                                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                                                                             
                           
                                                                                                           
                                                                                                                                    
                                                                                                                                                                 
                                                                                                                                                               
                                                                                                                         
                                                                                                                                                                  
                                                                                                   
                                                                                                        
                                                                                             
                                                                                                  
                                                                                                                 
                                                                                                                    
                                                                                                                        
                                                                                                                                                                                               
                                                                                                                                                                          
                                                                                                                                                                                                                                                      
                                                                                                                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                                                                             
                           
                                                                                                           
                                                                                                                                    
                                                                                                                                                                 
                                                                                                                                                               
                                                                                                                         
                                                                                                                                                                  
                                                                                                   
                                                                                                        
                                                                                                
                                                                                                    
                                                             
                                                                                                                                                               
                                                                                                                                     
                                                                                                                                                     
                                                                                                                                                                               
                                                                                                                                                       
                                                                                                                                                                      
                                                                                                                                                                          
                                                                                                                                                                                                                                                      
                                                                                                                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                                                                             
       
  }
  part def ThermalServiceProposer :> Thread {
    port thermalAssessment : DataPort { in :>> type : ThermalAssessment; }
    port wasteHeatEligibility : DataPort { in :>> type : WasteHeatEligibility; }
    port thermalPath : DataPort { in :>> type : ThermalPathReadiness; }
    port thermalProposal : DataPort { out :>> type : ThermalProposal; }

                        
                
                 
                             
                                                                                            
                                                     
                                                           
                                                                                             
                                                                             
             
                 
                           
                                                                                                                        
                                                                                                 
                                                        
                                                              
                                                                                                
                                                                                   
                                                                                        
                                                                  
                                                                                                                                               
                                                        
                                                              
                                                                                                
                                                                         
                                                                                        
                                                          
                                                                                            
                                                             
                                                              
                                                                                              
                                                                         
                                                                                        
                                                                                                         
                                                                                                                                                                       
                                                        
                                                              
                                                                                                
                                                                         
                                                                                        
                                                          
                                                                                     
                                                                                         
                                                        
                                                                                              
                                                                       
                                                                               
                                                                        
                                                                                 
                                                                           
                                                                                        
                                                          
                                                                                     
                                                                                         
                                                        
                                                              
                                                                                              
                                                                        
       
  }
  part def VisibilityServiceProposer :> Thread {
    port visibilityNeed : DataPort { in :>> type : VisibilityNeed; }
    port visibilityPath : DataPort { in :>> type : VisibilityPathReadiness; }
    port visibilityProposal : DataPort { out :>> type : VisibilityProposal; }

                        
                
                 
                             
                                                                                             
                                                                                                      
                                                                      
             
                 
                           
                                                                                                                       
                                                                   
                                                                                                           
                                                            
                                                                                              
                                                                                     
                                                                                                         
                                                            
                                                                                                 
                                                                                         
                                                                                                          
                 
                          
                                                                                                       
                                                                                                                                  
                                                                                                                    
                                                                                                                                
                                                                                                                       
       
  }
  part def CabinAirServiceProposer :> Thread {
    port humidityNeed : DataPort { in :>> type : HumidityNeed; }
    port airNeed : DataPort { in :>> type : AirNeed; }
    port airPath : DataPort { in :>> type : AirPathReadiness; }
    port cabinAirProposal : DataPort { out :>> type : CabinAirProposal; }

                        
                
                 
                             
                                                                                                        
                                                      
                                                                                                
                                                                                         
                                                                                
             
                 
                           
                                                                                                                   
                                                               
                                                                                              
                                                               
                                                                                   
                                                     
                                                                                      
                                                     
                                                                         
                                                                                                         
                                                                                                                                                
                                                                                                                                            
                                                                                                                                             
                                                                          
                                                                                     
                                                                                                                                               
       
  }
  part def EnergySafePlanComposer :> Thread {
    port electricalEligibility : DataPort { in :>> type : ElectricalEligibility; }
    port selectedIntent : DataPort { in :>> type : SelectedIntent; }
    port candidatePlan : DataPort { out :>> type : CandidatePlan; }

                        
                
                 
                             
                                                                                                
                                                        
                                                           
                                                              
                                                              
                                                                
             
                     
                           
                                                                                                     
                                                                           
                                                                  
                                                             
                                                                
                                                                
                                                                                   
                           
                                                                                                                                   
                                                                            
                                                                    
                                                       
                                                                  
                                                             
                                                                
                                                                
                                                                            
                                                                                    
                                                                                                                                  
                                                                        
                                                                                                                                              
                                                                                    
                                                                                                                                                  
                                                                                        
                                                                                                                                                
                                                                                     
                           
                                                                                                                 
                                                                          
                                                                  
                                                        
                                                                     
                                                                
                                                                                                                                     
                                                                                                                                                                 
                                                                             
                                                                                                                            
                                                                          
                                                                                                                       
                           
                                                                                                                         
                                                                          
                                                                  
                                                                                                
                                                                            
                                                                                                                                     
                                                                                                                                                                 
                                                               
                                                                               
                                                               
                                                                     
                                                                             
                                                                                                                            
                                                                          
                                                                                                                       
                           
                                                                                                                          
                                                                          
                                                                  
                                                         
                                                      
                                                            
                                                                            
                                                                
                                                                                                                                     
                                                                                                                                                                 
                                                                             
                                                                                                                            
                                                                          
                                                                                                                       
       
  }
  part def CriticalFaultRecoveryOwner :> Thread {
    port recoveryAcknowledgment : DataPort { in :>> type : RecoveryAcknowledgment; }
    port criticalElectrical : DataPort { in :>> type : ElectricalCriticality; }
    port criticalEquipment : DataPort { in :>> type : EquipmentCriticality; }
    port visibilityFault : DataPort { in :>> type : VisibilityCriticality; }
    port recoveryReport : DataPort { out :>> type : RecoveryReport; }

                        
           
                         
                                 
                
                 
                             
                                                                                  
                                             
                                                                 
                                                                           
                                                                  
             
                     
                           
                                                                                                                       
                                                        
                                                                 
                                                                  
                                                                    
                                                         
                                                                     
                                                                          
                                                                         
                                                                                       
                                                                 
                                                                          
                                                                                    
                                                                 
                                                                  
                                                                            
                                                                                          
                           
                                                                                              
                                                        
                                                               
                                                                
                                                                 
                                                       
                                                                   
                                                                             
                                                                    
                           
                                                                                                  
                                                          
                                                                  
                                                                   
                                                                      
                                                                        
                                                         
                                                                     
                                                                              
                                                                         
                                                                                       
                                                                                                                            
                                                                                    
                                                                                                                    
                                                                            
                                                                                           
                                                                                                                    
                                                                           
                                                                                     
                           
                                                                                                                 
                                                          
                                                               
                                                                
                                                                  
                                                                     
                                                         
                                                                     
                                                                             
                                                                                
                           
                                                                                           
                                                          
                                                                 
                                                                  
                                                                    
                                                         
                                                                     
                                                                           
                                                                         
                                                                                       
                                                                                                                            
                                                                                    
                                                                                                                    
                                                                            
                                                                                          
                           
                                                                                                         
                                                          
                                                               
                                                                
                                                                 
                                                       
                                                                   
                                                                         
                                                                    
       
  }
  part def AtomicResultPublisher :> Thread {
    port candidatePlan : DataPort { in :>> type : CandidatePlan; }
    port arbitrationStatus : DataPort { in :>> type : ArbitrationStatus; }
    port recoveryReport : DataPort { in :>> type : RecoveryReport; }
    port actuationPlan : DataPort { out :>> type : CabinActuationPlan; }
    port supervisorStatus : DataPort { out :>> type : SupervisorStatus; }

                        
                
                 
                             
                                                                                              
                                                   
                                                      
                                                         
                                                         
                                                          
                                                             
             
                 
                           
                                                                                                                                   
                                                                       
                                                                       
                                                                                   
                                                                                                 
                                                                                                          
                                                                    
                                                                   
                                                                                  
                                                                                                 
                                                                                                          
                                                                     
                                                                   
                                                                          
                                                                                  
                                                                    
                                                                        
                                                                          
                                                                            
                                                                   
                                                                          
                                                                           
                                                                                      
                                                                   
                                                                   
                                                                          
                                                                           
                                                                               
                                                                                  
                                                                   
                                                                   
                                                                          
                                                                           
                                                                               
                                                                                  
                                                                               
                                                                  
                                                                                 
                                                                    
                                                                                   
                                                                       
                 
                            
                                                                                                                                                       
                                                                   
                                                                                         
                                                                                
                                                                   
                                                                                      
                                                                             
                                                                   
                                                                                             
                                                                                    
                                                                   
                                                                                        
                                                                               
                                                                   
                                                                                  
                                                                                   
                                                                   
                                                                           
                                                                                      
                                                                               
                                                                   
                                                                           
                                                                               
                                                                                                
                                                                                 
                                                                   
                                                                           
                                                                               
                                                                                         
                                                                                  
                                                                                                  
                                                                                   
                                                                                                
                                                                                 
                                                                                               
                                                                                  
                                                                   
                                                                           
                                                                               
                                                                                         
                                                                                  
                                                                  
                 
                           
                                                                          
                                                            
                                                                                                       
                                                              
                                                            
                                                                                                        
                 
                           
                                                                                                
                                                                                                             
                                                                                                                           
                                                       
       
  }

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

    part requestQualifier : RequestQualifier;
    part thermalNeedAssessor : ThermalNeedAssessor;
    part visibilityNeedAssessor : VisibilityNeedAssessor;
    part humidityNeedAssessor : HumidityNeedAssessor;
    part airQualityNeedAssessor : AirQualityNeedAssessor;
    part electricalEligibilityOwner : ElectricalEligibilityOwner;
    part wasteHeatEligibilityOwner : WasteHeatEligibilityOwner;
    part equipmentFaultAssessor : EquipmentFaultAssessor;
    part priorityAuthorizationArbiter : PriorityAuthorizationArbiter;
    part thermalServiceProposer : ThermalServiceProposer;
    part visibilityServiceProposer : VisibilityServiceProposer;
    part cabinAirServiceProposer : CabinAirServiceProposer;
    part energySafePlanComposer : EnergySafePlanComposer;
    part criticalFaultRecoveryOwner : CriticalFaultRecoveryOwner;
    part atomicResultPublisher : AtomicResultPublisher;

    // The 33 semantic connections; boundary routes here are the inner hop.
    connection int01 : PortConnection connect userRequest to requestQualifier.userRequest;
    connection int02 : PortConnection connect cabinObservation to thermalNeedAssessor.cabinObservation;
    connection int03 : PortConnection connect glazingObservation to visibilityNeedAssessor.glazingObservation;
    connection int04 : PortConnection connect humidityObservation to humidityNeedAssessor.humidityObservation;
    connection int05 : PortConnection connect airObservation to airQualityNeedAssessor.airObservation;
    connection int06 : PortConnection connect electricalAvailability to electricalEligibilityOwner.electricalAvailability;
    connection int07 : PortConnection connect wasteHeatAvailability to wasteHeatEligibilityOwner.wasteHeatAvailability;
    connection int08 : PortConnection connect equipmentReadiness to equipmentFaultAssessor.equipmentReadiness;
    connection int09 : PortConnection connect recoveryAcknowledgment to criticalFaultRecoveryOwner.recoveryAcknowledgment;
    connection int10 : PortConnection connect requestQualifier.qualifiedTarget to thermalNeedAssessor.qualifiedTarget;
    connection int11 : PortConnection connect requestQualifier.qualifiedRequest to priorityAuthorizationArbiter.qualifiedRequest;
    connection int12 : PortConnection connect thermalNeedAssessor.thermalAssessment to thermalServiceProposer.thermalAssessment;
    connection int13 : PortConnection connect visibilityNeedAssessor.visibilityNeed to visibilityServiceProposer.visibilityNeed;
    connection int14 : PortConnection connect humidityNeedAssessor.humidityNeed to cabinAirServiceProposer.humidityNeed;
    connection int15 : PortConnection connect airQualityNeedAssessor.airNeed to cabinAirServiceProposer.airNeed;
    connection int16 : PortConnection connect electricalEligibilityOwner.electricalEligibility to energySafePlanComposer.electricalEligibility;
    connection int17 : PortConnection connect electricalEligibilityOwner.criticalElectrical to criticalFaultRecoveryOwner.criticalElectrical;
    connection int18 : PortConnection connect wasteHeatEligibilityOwner.wasteHeatEligibility to thermalServiceProposer.wasteHeatEligibility;
    connection int19 : PortConnection connect equipmentFaultAssessor.criticalEquipment to criticalFaultRecoveryOwner.criticalEquipment;
    connection int20 : PortConnection connect equipmentFaultAssessor.thermalPath to thermalServiceProposer.thermalPath;
    connection int21 : PortConnection connect equipmentFaultAssessor.visibilityPath to visibilityServiceProposer.visibilityPath;
    connection int22 : PortConnection connect equipmentFaultAssessor.airPath to cabinAirServiceProposer.airPath;
    connection int23 : PortConnection connect visibilityNeedAssessor.visibilityFault to criticalFaultRecoveryOwner.visibilityFault;
    connection int24 : PortConnection connect criticalFaultRecoveryOwner.recoveryReport to priorityAuthorizationArbiter.recoveryReport;
    connection int25 : PortConnection connect thermalServiceProposer.thermalProposal to priorityAuthorizationArbiter.thermalProposal;
    connection int26 : PortConnection connect visibilityServiceProposer.visibilityProposal to priorityAuthorizationArbiter.visibilityProposal;
    connection int27 : PortConnection connect cabinAirServiceProposer.cabinAirProposal to priorityAuthorizationArbiter.cabinAirProposal;
    connection int28 : PortConnection connect priorityAuthorizationArbiter.selectedIntent to energySafePlanComposer.selectedIntent;
    connection int29 : PortConnection connect energySafePlanComposer.candidatePlan to atomicResultPublisher.candidatePlan;
    connection int30 : PortConnection connect priorityAuthorizationArbiter.arbitrationStatus to atomicResultPublisher.arbitrationStatus;
    connection int31 : PortConnection connect criticalFaultRecoveryOwner.recoveryReport to atomicResultPublisher.recoveryReport;
    connection int32 : PortConnection connect atomicResultPublisher.actuationPlan to actuationPlan;
    connection int33 : PortConnection connect atomicResultPublisher.supervisorStatus to supervisorStatus;
  }

  part def HVACSupervisor :> System {
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

    part supervision : HVACSupervisionProcess;
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

  part hvacSupervisor : HVACSupervisor;
}
