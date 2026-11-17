package Cabin_Air_Care_Supervisor {

  private import HAMR::*;

  enum def AirCarePreference {
    enum Off;
    enum Auto;
  }

  enum def PreferenceValidity {
    enum Valid;
    enum Invalid;
  }

  enum def CabinAirQuality {
    enum Acceptable;
    enum Polluted;
  }

  enum def AirQualityValidity {
    enum Valid;
    enum Invalid;
  }

  enum def CabinHumidityBand {
    enum Low;
    enum Target;
    enum High;
  }

  enum def HumidityValidity {
    enum Valid;
    enum Invalid;
  }

  enum def AirTreatmentDirective {
    enum Standby;
    enum Filter;
    enum HumidifyWithFilter;
    enum DehumidifyWithFilter;
  }

  enum def AirCareStatus {
    enum Off;
    enum Standby;
    enum Filtering;
    enum Humidifying;
    enum Dehumidifying;
    enum PreferenceFault;
    enum InputFault;
    enum Recovering;
  }

  enum def AirCareIntent {
    enum Disabled;
    enum Enabled;
    enum Invalid;
  }

  enum def AirAssessment {
    enum Acceptable;
    enum FilterNeeded;
    enum Unknown;
  }

  enum def HumidityAssessment {
    enum AddMoisture;
    enum AtTarget;
    enum RemoveMoisture;
    enum Unknown;
  }

  enum def MeasurementConfidence {
    enum Trusted;
    enum BlockedInvalid;
    enum Confirming;
  }

  enum def ConfidenceMode {
    enum Trusted;
    enum ConfirmationNeeded;
  }

  part def PreferenceInterpreter :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port airCarePreference : DataPort { in :>> type : AirCarePreference; }
    port preferenceValidity : DataPort { in :>> type : PreferenceValidity; }
    port airCareIntent : DataPort { out :>> type : AirCareIntent; }

                        
             
                     
                         
                                                                                                                
                                                                    
                                                             

                         
                                                                                                             
                                                                  
                     
                                                                   
                                                            
                                                                    
                                                          
       
  }

  part def AirQualityAssessor :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port cabinAirQuality : DataPort { in :>> type : CabinAirQuality; }
    port airQualityValidity : DataPort { in :>> type : AirQualityValidity; }
    port airAssessment : DataPort { out :>> type : AirAssessment; }

                        
             
                     
                         
                                                                                                          
                     
                                                                         
                                                           
                                                                
                                                                      
                                                              
                                                                
                                                                    
                                                               
       
  }

  part def HumidityAssessor :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port cabinHumidityBand : DataPort { in :>> type : CabinHumidityBand; }
    port humidityValidity : DataPort { in :>> type : HumidityValidity; }
    port humidityAssessment : DataPort { out :>> type : HumidityAssessment; }

                        
             
                     
                         
                                                                                                                        
                     
                                                                     
                                                                     
                                                            
                                                                   
                                                                         
                                                            
                                                                      
                                                                      
                                                            
                                                                    
                                                                           
       
  }

  part def ObservationConfidenceGuardian :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port airAssessment : DataPort { in :>> type : AirAssessment; }
    port humidityAssessment : DataPort { in :>> type : HumidityAssessment; }
    port measurementConfidence : DataPort { out :>> type : MeasurementConfidence; }

                        
           
                          
                                        

                
                 
                           
                                                                                                          
                                                                 
                                                                      

             
                     
                         
                                                                                                                         
                                                           
                                                               
                                                                                     
                                                                  

                         
                                                                                                                      
                                                           
                                                                
                                                                      
                                                                                 
                                                       

                         
                                                                                                        
                                                           
                                                                
                                                           
                                                                              
                                                       
       
  }

  part def AirCarePolicySupervisor :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port airCareIntent : DataPort { in :>> type : AirCareIntent; }
    port airAssessment : DataPort { in :>> type : AirAssessment; }
    port humidityAssessment : DataPort { in :>> type : HumidityAssessment; }
    port measurementConfidence : DataPort { in :>> type : MeasurementConfidence; }
    port airTreatmentDirective : DataPort { out :>> type : AirTreatmentDirective; }
    port airCareStatus : DataPort { out :>> type : AirCareStatus; }

                        
                
                 
                           
                                                                                             
                                                                    
                                                      

             
                     
                         
                                                                                                  
                                                           
                                                                              
                                                 

                         
                                                                                                           
                                                          
                                                                              
                                                             

                         
                                                                                                     
                                                           
                                                                     
                     
                                                                                      
                                                                         
                                                              
                                                                                  
                                                                         
                                                             

                         
                                                                                                                 
                                                           
                                                                      
                                                       
                                                                 
                                                                              
                                                        

                         
                                                                                                                             
                                                           
                                                                      
                                                      
                                                               
                     
                                                                             
                                                                                    
                                                               
                                                                                
                                                                                      
                                                                 
                                                                   
                                                                    
                                                                        
                                                             
                                                                   
                                                                  
                                                                         
                                                          
       
  }

  part def AirCareSupervisionProcess :> Process {
    port airCarePreference : DataPort { in :>> type : AirCarePreference; }
    port preferenceValidity : DataPort { in :>> type : PreferenceValidity; }
    port cabinAirQuality : DataPort { in :>> type : CabinAirQuality; }
    port airQualityValidity : DataPort { in :>> type : AirQualityValidity; }
    port cabinHumidityBand : DataPort { in :>> type : CabinHumidityBand; }
    port humidityValidity : DataPort { in :>> type : HumidityValidity; }
    port airTreatmentDirective : DataPort { out :>> type : AirTreatmentDirective; }
    port airCareStatus : DataPort { out :>> type : AirCareStatus; }

    part preferenceInterpreter : PreferenceInterpreter;
    part airQualityAssessor : AirQualityAssessor;
    part humidityAssessor : HumidityAssessor;
    part observationConfidenceGuardian : ObservationConfidenceGuardian;
    part airCarePolicySupervisor : AirCarePolicySupervisor;

    connection int01 : PortConnection connect airCarePreference to preferenceInterpreter.airCarePreference;
    connection int02 : PortConnection connect preferenceValidity to preferenceInterpreter.preferenceValidity;
    connection int03 : PortConnection connect cabinAirQuality to airQualityAssessor.cabinAirQuality;
    connection int04 : PortConnection connect airQualityValidity to airQualityAssessor.airQualityValidity;
    connection int05 : PortConnection connect cabinHumidityBand to humidityAssessor.cabinHumidityBand;
    connection int06 : PortConnection connect humidityValidity to humidityAssessor.humidityValidity;
    connection int07 : PortConnection connect preferenceInterpreter.airCareIntent to airCarePolicySupervisor.airCareIntent;
    connection int08 : PortConnection connect airQualityAssessor.airAssessment to observationConfidenceGuardian.airAssessment;
    connection int09 : PortConnection connect airQualityAssessor.airAssessment to airCarePolicySupervisor.airAssessment;
    connection int10 : PortConnection connect humidityAssessor.humidityAssessment to observationConfidenceGuardian.humidityAssessment;
    connection int11 : PortConnection connect humidityAssessor.humidityAssessment to airCarePolicySupervisor.humidityAssessment;
    connection int12 : PortConnection connect observationConfidenceGuardian.measurementConfidence to airCarePolicySupervisor.measurementConfidence;
    connection int13 : PortConnection connect airCarePolicySupervisor.airTreatmentDirective to airTreatmentDirective;
    connection int14 : PortConnection connect airCarePolicySupervisor.airCareStatus to airCareStatus;
  }

  part def CabinAirCareSupervisor :> System {
    port airCarePreference : DataPort { in :>> type : AirCarePreference; }
    port preferenceValidity : DataPort { in :>> type : PreferenceValidity; }
    port cabinAirQuality : DataPort { in :>> type : CabinAirQuality; }
    port airQualityValidity : DataPort { in :>> type : AirQualityValidity; }
    port cabinHumidityBand : DataPort { in :>> type : CabinHumidityBand; }
    port humidityValidity : DataPort { in :>> type : HumidityValidity; }
    port airTreatmentDirective : DataPort { out :>> type : AirTreatmentDirective; }
    port airCareStatus : DataPort { out :>> type : AirCareStatus; }

    part airCareSupervisionProcess : AirCareSupervisionProcess;

    connection supportInt01 : PortConnection connect airCarePreference to airCareSupervisionProcess.airCarePreference;
    connection supportInt02 : PortConnection connect preferenceValidity to airCareSupervisionProcess.preferenceValidity;
    connection supportInt03 : PortConnection connect cabinAirQuality to airCareSupervisionProcess.cabinAirQuality;
    connection supportInt04 : PortConnection connect airQualityValidity to airCareSupervisionProcess.airQualityValidity;
    connection supportInt05 : PortConnection connect cabinHumidityBand to airCareSupervisionProcess.cabinHumidityBand;
    connection supportInt06 : PortConnection connect humidityValidity to airCareSupervisionProcess.humidityValidity;
    connection supportInt13 : PortConnection connect airCareSupervisionProcess.airTreatmentDirective to airTreatmentDirective;
    connection supportInt14 : PortConnection connect airCareSupervisionProcess.airCareStatus to airCareStatus;
  }

  part cabinAirCareSupervisor : CabinAirCareSupervisor;
}
