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
    port airCarePreference : DataPort { in :>> type : AirCarePreference; }
    port preferenceValidity : DataPort { in :>> type : PreferenceValidity; }
    port airCareIntent : DataPort { out :>> type : AirCareIntent; }

    language "GUMBO" /*{
      compute
        compute_cases
          case InvalidPreference "invalid preference":
            assume preferenceValidity == PreferenceValidity.Invalid;
            guarantee airCareIntent == AirCareIntent.Invalid;
          case ValidOffPreference "valid off preference":
            assume preferenceValidity == PreferenceValidity.Valid &
              airCarePreference == AirCarePreference.Off;
            guarantee airCareIntent == AirCareIntent.Disabled;
          case ValidAutoPreference "valid automatic preference":
            assume preferenceValidity == PreferenceValidity.Valid &
              airCarePreference == AirCarePreference.Auto;
            guarantee airCareIntent == AirCareIntent.Enabled;
    }*/

                        
             
                     
                         
                                                                                                                
                                                                    
                                                             

                         
                                                                                                             
                                                                  
                     
                                                                   
                                                            
                                                                    
                                                          
       
  }

  part def AirQualityAssessor :> Thread {
    port cabinAirQuality : DataPort { in :>> type : CabinAirQuality; }
    port airQualityValidity : DataPort { in :>> type : AirQualityValidity; }
    port airAssessment : DataPort { out :>> type : AirAssessment; }

    language "GUMBO" /*{
      compute
        compute_cases
          case InvalidObservation "invalid air observation":
            assume airQualityValidity == AirQualityValidity.Invalid;
            guarantee airAssessment == AirAssessment.Unknown;
          case AcceptableObservation "acceptable air observation":
            assume airQualityValidity == AirQualityValidity.Valid &
              cabinAirQuality == CabinAirQuality.Acceptable;
            guarantee airAssessment == AirAssessment.Acceptable;
          case PollutedObservation "polluted air observation":
            assume airQualityValidity == AirQualityValidity.Valid &
              cabinAirQuality == CabinAirQuality.Polluted;
            guarantee airAssessment == AirAssessment.FilterNeeded;
    }*/

                        
             
                     
                         
                                                                                                          
                     
                                                                         
                                                           
                                                                
                                                                      
                                                              
                                                                
                                                                    
                                                               
       
  }

  part def HumidityAssessor :> Thread {
    port cabinHumidityBand : DataPort { in :>> type : CabinHumidityBand; }
    port humidityValidity : DataPort { in :>> type : HumidityValidity; }
    port humidityAssessment : DataPort { out :>> type : HumidityAssessment; }

    language "GUMBO" /*{
      compute
        compute_cases
          case InvalidObservation "invalid humidity observation":
            assume humidityValidity == HumidityValidity.Invalid;
            guarantee humidityAssessment == HumidityAssessment.Unknown;
          case LowObservation "low humidity observation":
            assume humidityValidity == HumidityValidity.Valid &
              cabinHumidityBand == CabinHumidityBand.Low;
            guarantee humidityAssessment == HumidityAssessment.AddMoisture;
          case TargetObservation "target humidity observation":
            assume humidityValidity == HumidityValidity.Valid &
              cabinHumidityBand == CabinHumidityBand.Target;
            guarantee humidityAssessment == HumidityAssessment.AtTarget;
          case HighObservation "high humidity observation":
            assume humidityValidity == HumidityValidity.Valid &
              cabinHumidityBand == CabinHumidityBand.High;
            guarantee humidityAssessment == HumidityAssessment.RemoveMoisture;
    }*/

                        
             
                     
                         
                                                                                                                        
                     
                                                                     
                                                                     
                                                            
                                                                   
                                                                         
                                                            
                                                                      
                                                                      
                                                            
                                                                    
                                                                           
       
  }

  part def ObservationConfidenceGuardian :> Thread {
    port airAssessment : DataPort { in :>> type : AirAssessment; }
    port humidityAssessment : DataPort { in :>> type : HumidityAssessment; }
    port measurementConfidence : DataPort { out :>> type : MeasurementConfidence; }

    language "GUMBO" /*{
      state
        confidenceMode : ConfidenceMode;

      initialize
        modifies confidenceMode;
        guarantee InitialMode "initial mode": confidenceMode == ConfidenceMode.ConfirmationNeeded;
        guarantee InitialConfidence "initial confidence": measurementConfidence == MeasurementConfidence.Confirming;

      compute
        modifies confidenceMode;
        compute_cases
          case InvalidObservation "invalid observation":
            assume airAssessment == AirAssessment.Unknown |
              humidityAssessment == HumidityAssessment.Unknown;
            guarantee measurementConfidence == MeasurementConfidence.BlockedInvalid &
              confidenceMode == ConfidenceMode.ConfirmationNeeded;
          case CleanConfirmation "clean confirmation":
            assume airAssessment != AirAssessment.Unknown &
              humidityAssessment != HumidityAssessment.Unknown &
              In(confidenceMode) == ConfidenceMode.ConfirmationNeeded;
            guarantee measurementConfidence == MeasurementConfidence.Confirming &
              confidenceMode == ConfidenceMode.Trusted;
          case TrustedRetention "trusted retention":
            assume airAssessment != AirAssessment.Unknown &
              humidityAssessment != HumidityAssessment.Unknown &
              In(confidenceMode) == ConfidenceMode.Trusted;
            guarantee measurementConfidence == MeasurementConfidence.Trusted &
              confidenceMode == ConfidenceMode.Trusted;
    }*/

                        
           
                          
                                        

                
                 
                           
                                                                                                          
                                                                 
                                                                      

             
                     
                         
                                                                                                                         
                                                           
                                                               
                                                                                     
                                                                  

                         
                                                                                                                      
                                                           
                                                                
                                                                      
                                                                                 
                                                       

                         
                                                                                                        
                                                           
                                                                
                                                           
                                                                              
                                                       
       
  }

  part def AirCarePolicySupervisor :> Thread {
    port airCareIntent : DataPort { in :>> type : AirCareIntent; }
    port airAssessment : DataPort { in :>> type : AirAssessment; }
    port humidityAssessment : DataPort { in :>> type : HumidityAssessment; }
    port measurementConfidence : DataPort { in :>> type : MeasurementConfidence; }
    port airTreatmentDirective : DataPort { out :>> type : AirTreatmentDirective; }
    port airCareStatus : DataPort { out :>> type : AirCareStatus; }

    language "GUMBO" /*{
      initialize
        guarantee InitialDirective "initial directive":
          airTreatmentDirective == AirTreatmentDirective.Standby;
        guarantee InitialStatus "initial status": airCareStatus == AirCareStatus.Recovering;

      compute
        compute_cases
          case DisabledPreference "disabled preference":
            assume airCareIntent == AirCareIntent.Disabled;
            guarantee airTreatmentDirective == AirTreatmentDirective.Standby &
              airCareStatus == AirCareStatus.Off;
          case InvalidPreference "invalid preference":
            assume airCareIntent == AirCareIntent.Invalid;
            guarantee airTreatmentDirective == AirTreatmentDirective.Standby &
              airCareStatus == AirCareStatus.PreferenceFault;
          case BlockedObservations "blocked observations":
            assume airCareIntent == AirCareIntent.Enabled &
              measurementConfidence == MeasurementConfidence.BlockedInvalid;
            guarantee airTreatmentDirective == AirTreatmentDirective.Standby &
              airCareStatus == AirCareStatus.InputFault;
          case ConfirmationPending "confirmation pending":
            assume airCareIntent == AirCareIntent.Enabled &
              measurementConfidence == MeasurementConfidence.Confirming;
            guarantee airTreatmentDirective == AirTreatmentDirective.Standby &
              airCareStatus == AirCareStatus.Recovering;
          case DefensiveInconsistency "defensive inconsistent assessment":
            assume airCareIntent == AirCareIntent.Enabled &
              measurementConfidence == MeasurementConfidence.Trusted &
              (airAssessment == AirAssessment.Unknown |
                humidityAssessment == HumidityAssessment.Unknown);
            guarantee airTreatmentDirective == AirTreatmentDirective.Standby &
              airCareStatus == AirCareStatus.InputFault;
          case TrustedLowHumidity "trusted low humidity":
            assume airCareIntent == AirCareIntent.Enabled &
              measurementConfidence == MeasurementConfidence.Trusted &
              airAssessment != AirAssessment.Unknown &
              humidityAssessment == HumidityAssessment.AddMoisture;
            guarantee airTreatmentDirective == AirTreatmentDirective.HumidifyWithFilter &
              airCareStatus == AirCareStatus.Humidifying;
          case TrustedHighHumidity "trusted high humidity":
            assume airCareIntent == AirCareIntent.Enabled &
              measurementConfidence == MeasurementConfidence.Trusted &
              airAssessment != AirAssessment.Unknown &
              humidityAssessment == HumidityAssessment.RemoveMoisture;
            guarantee airTreatmentDirective == AirTreatmentDirective.DehumidifyWithFilter &
              airCareStatus == AirCareStatus.Dehumidifying;
          case TrustedPollutedTarget "trusted polluted target humidity":
            assume airCareIntent == AirCareIntent.Enabled &
              measurementConfidence == MeasurementConfidence.Trusted &
              airAssessment == AirAssessment.FilterNeeded &
              humidityAssessment == HumidityAssessment.AtTarget;
            guarantee airTreatmentDirective == AirTreatmentDirective.Filter &
              airCareStatus == AirCareStatus.Filtering;
          case TrustedAcceptableTarget "trusted acceptable target humidity":
            assume airCareIntent == AirCareIntent.Enabled &
              measurementConfidence == MeasurementConfidence.Trusted &
              airAssessment == AirAssessment.Acceptable &
              humidityAssessment == HumidityAssessment.AtTarget;
            guarantee airTreatmentDirective == AirTreatmentDirective.Standby &
              airCareStatus == AirCareStatus.Standby;
    }*/

                        
                
                 
                           
                                                                                             
                                                                    
                                                      

             
                     
                         
                                                                                                  
                                                           
                                                                              
                                                 

                         
                                                                                                           
                                                          
                                                                              
                                                             

                         
                                                                                                     
                                                           
                                                                     
                     
                                                                                      
                                                                         
                                                              
                                                                                  
                                                                         
                                                             

                         
                                                                                                                 
                                                           
                                                                      
                                                       
                                                                 
                                                                              
                                                        

                         
                                                                                                                             
                                                           
                                                                      
                                                      
                                                               
                     
                                                                             
                                                                                    
                                                               
                                                                                
                                                                                      
                                                                 
                                                                   
                                                                    
                                                                        
                                                             
                                                                   
                                                                  
                                                                         
                                                          
       
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
