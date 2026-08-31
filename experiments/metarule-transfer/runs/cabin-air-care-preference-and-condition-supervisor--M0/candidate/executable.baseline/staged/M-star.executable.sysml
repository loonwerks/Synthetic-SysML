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
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port airCareSelection : DataPort { in :>> type : AirCareSelection; }
    port requestValidity : DataPort { in :>> type : RequestValidity; }
    port requestIntent : DataPort { out :>> type : RequestIntent; }

                        
           
                          
                                     
                
                               
                         
                                                 
                                                   
                                              
             
                               
                     
                              
                                  
                                                              
                                                                     
                                                           
                              
                                    
                                                             
                                                       
                                                           
                                                      
                              
                                       
                                                             
                                                        
                                                          
                                                                     
                                                           
                                                           
                                                            
                                                            
                              
                                      
                                                             
                                                        
                                                                
                                                                     
                                                           
                                                          
                                                            
                                                           
                              
                                      
                                                             
                                                        
                                                               
                                                                   
                                                           
       
  }

  part def AirQualityQualificationOwner :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port cabinAirQuality : DataPort { in :>> type : CabinAirQuality; }
    port airQualityValidity : DataPort { in :>> type : AirQualityValidity; }
    port airAssessment : DataPort { out :>> type : AirAssessment; }

                        
                
                         
                                              
                                                 
             
                             
                                            
                                                              
                                                     
                                                            
                                                      
                                                   
                                                            
                                                         
                                                                
                                                            
                                                     
                                                                   
       
  }

  part def HumidityQualificationOwner :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port cabinHumidity : DataPort { in :>> type : CabinHumidity; }
    port humidityValidity : DataPort { in :>> type : HumidityValidity; }
    port humidityAssessment : DataPort { out :>> type : HumidityAssessment; }

                        
                
                         
                                                   
                                                           
             
                             
                                            
                                                          
                                                               
                                                        
                                                 
                                                                    
                                                        
                                                 
                                                          
                                                                        
       
  }

  part def TreatmentReadinessQualificationOwner :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port treatmentEquipmentStatus : DataPort { in :>> type : TreatmentEquipmentStatus; }
    port treatmentReadiness : DataPort { out :>> type : TreatmentReadiness; }
    port readinessContext : DataPort { out :>> type : ReadinessContext; }

                        
                
                         
                                         
                                                            
                                                               
             
                     
                               
                                   
                                                                                     
                                                                        
                                                                   
                               
                                               
                                                                                   
                                                                  
                                                                                            
                                                                                        
                                                                        
                                                                                      
                                                                                        
                                                                      
                                                                                            
                                                                                  
                                                                     
                                                                                      
                                                                                  
                                                                     
       
  }

  part def FiltrationProposalOwner :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port requestIntent : DataPort { in :>> type : RequestIntent; }
    port airAssessment : DataPort { in :>> type : AirAssessment; }
    port treatmentReadiness : DataPort { in :>> type : TreatmentReadiness; }
    port airProposal : DataPort { out :>> type : AirProposal; }

                        
                
                         
                                            
                                          
             
                             
                                                 
                                                  
                                                            
                                                           
                                              
                                                        
                                                        
                                                                  
                                                                  
                                                         
                                                        
                                                        
                                                                 
                                                                
                                                           
                                                       
                                                       
                                                    
                                                               
                                                       
                                                       
                                                  
                                              
                                                       
                                                       
                                                               
                                                                  
                                                                  
                                                      
                                                       
                                                       
                                                                  
                                                                  
                                                                  
                                                         
                                                       
                                                       
                                                                
                                                                    
                                                                 
                                                                
                                                           
       
  }

  part def HumidityProposalOwner :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port requestIntent : DataPort { in :>> type : RequestIntent; }
    port humidityAssessment : DataPort { in :>> type : HumidityAssessment; }
    port treatmentReadiness : DataPort { in :>> type : TreatmentReadiness; }
    port humidityProposal : DataPort { out :>> type : HumidityProposal; }

                        
                
                         
                                                 
                                                    
             
                             
                                                 
                                                  
                                                            
                                                          
                                                        
                                                        
                                                        
                                                       
                                                       
                                                              
                                                                              
                                                       
                                                       
                                                                       
                                                        
                                                       
                                                       
                                                                   
                                                                 
                                                                  
                                                       
                                                       
                                                       
                                                                   
                                                                
                                                                
                                                                    
       
  }

  part def ReadinessRecoveryOwner :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port requestIntent : DataPort { in :>> type : RequestIntent; }
    port readinessContext : DataPort { in :>> type : ReadinessContext; }
    port recoveryGate : DataPort { out :>> type : RecoveryMemory; }

                        
           
                          
                                       
                
                                
                         
                                        
                                                  
                                               
             
                                
                          
                                                     
                                         
                     
                               
                                            
                                                                        
                                                                  
                                                       
                               
                                                  
                                                               
                                                             
                                                                   
                                                        
                               
                                                 
                                                               
                                                               
                                                         
                                                          
                                                              
                                                   
                               
                                              
                                                               
                                                               
                                                        
                                                        
                                                                   
                                                        
                               
                                        
                                                               
                                                         
                                                              
                                                   
       
  }

  part def AirCarePriorityResultArbiter :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port requestIntent : DataPort { in :>> type : RequestIntent; }
    port airProposal : DataPort { in :>> type : AirProposal; }
    port humidityProposal : DataPort { in :>> type : HumidityProposal; }
    port recoveryGate : DataPort { in :>> type : RecoveryMemory; }
    port airTreatmentCommand : DataPort { out :>> type : AirTreatmentCommand; }
    port airCareSupervisorStatus : DataPort { out :>> type : AirCareSupervisorStatus; }

                        
                
                         
                                      
                                                          
                                                           
                                                              
             
                     
                               
                                              
                                                        
                                                                      
                                                          
                                                                     
                                                                                  
                                                           
                                                                     
                                                                            
                               
                                                 
                                                         
                                                    
                                                              
                                                            
                                                                      
                                                     
                                                                 
                                                                      
                                                               
                                                                      
                                                                                
                                                             
                                                                      
                                                                               
                               
                                               
                                                         
                                                         
                                                        
                                                          
                                                          
                                                        
                                                           
                                                                         
                                                         
                                                                          
                                                            
                                                                              
                                                          
                                                                             
                                                                                 
                                                                                            
                                                                       
                                                                                  
                                                           
                                                                           
                               
                                               
                                                         
                                                         
                                                        
                                                          
                                                          
                                                
                                                                 
                                                             
                                                                         
                                                          
                                                                
                                                                    
                                                                                         
                                                                
                                                                                     
                                                   
                                                                            
                                                          
                                                                
                                                                    
                                                                                         
                                                                
                                                                                     
                                                   
                                                                                   
                                                                                              
                                                   
                                                                         
                                                                                    
                                                   
                                                             
                                                                                       
       
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
