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
    port airCareSelection : DataPort { in :>> type : AirCareSelection; }
    port requestValidity : DataPort { in :>> type : RequestValidity; }
    port requestIntent : DataPort { out :>> type : RequestIntent; }

    language "GUMBO" /*{
      state
        requestMemory: RequestMemory;

      initialize
        guarantee INITIAL_REQUEST_LIFECYCLE_SAFE:
          requestMemory == RequestMemory.Released &
          requestIntent == RequestIntent.None;

      compute
        compute_cases
          case CASE_RQ_01_INVALID:
            assume requestValidity == RequestValidity.Invalid;
            guarantee requestIntent == RequestIntent.BlockedInvalid &
              requestMemory == RequestMemory.RearmRequired;

          case CASE_RQ_02_VALID_OFF:
            assume requestValidity == RequestValidity.Valid &
              airCareSelection == AirCareSelection.Off;
            guarantee requestIntent == RequestIntent.None &
              requestMemory == RequestMemory.Released;

          case CASE_RQ_03_FRESH_ACTIVE:
            assume requestValidity == RequestValidity.Valid &
              airCareSelection != AirCareSelection.Off &
              requestMemory == RequestMemory.Released;
            guarantee requestMemory == RequestMemory.AcceptedActive &
              ((airCareSelection == AirCareSelection.Auto &
                requestIntent == RequestIntent.FreshAuto) |
               (airCareSelection == AirCareSelection.Purge &
                requestIntent == RequestIntent.FreshPurge));

          case CASE_RQ_04_HELD_ACTIVE:
            assume requestValidity == RequestValidity.Valid &
              airCareSelection != AirCareSelection.Off &
              requestMemory == RequestMemory.AcceptedActive;
            guarantee requestMemory == RequestMemory.AcceptedActive &
              ((airCareSelection == AirCareSelection.Auto &
                requestIntent == RequestIntent.HeldAuto) |
               (airCareSelection == AirCareSelection.Purge &
                requestIntent == RequestIntent.HeldPurge));

          case CASE_RQ_05_REARM_BLOCK:
            assume requestValidity == RequestValidity.Valid &
              airCareSelection != AirCareSelection.Off &
              requestMemory == RequestMemory.RearmRequired;
            guarantee requestIntent == RequestIntent.BlockedRearm &
              requestMemory == RequestMemory.RearmRequired;
    }*/
                        
           
                          
                                     
                
                               
                         
                                                 
                                                   
                                              
             
                               
                     
                              
                                  
                                                              
                                                                     
                                                           
                              
                                    
                                                             
                                                       
                                                           
                                                      
                              
                                       
                                                             
                                                        
                                                          
                                                                     
                                                           
                                                           
                                                            
                                                            
                              
                                      
                                                             
                                                        
                                                                
                                                                     
                                                           
                                                          
                                                            
                                                           
                              
                                      
                                                             
                                                        
                                                               
                                                                   
                                                           
       
  }

  part def AirQualityQualificationOwner :> Thread {
    port cabinAirQuality : DataPort { in :>> type : CabinAirQuality; }
    port airQualityValidity : DataPort { in :>> type : AirQualityValidity; }
    port airAssessment : DataPort { out :>> type : AirAssessment; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_AIR_ASSESSMENT_SAFE:
          airAssessment == AirAssessment.Unknown;

      compute
        compute_cases
          case CASE_AIR_01_QUALIFICATION:
            assume true;
            guarantee
              ((airQualityValidity == AirQualityValidity.Invalid &
                airAssessment == AirAssessment.Unknown) |
               (airQualityValidity == AirQualityValidity.Valid &
                cabinAirQuality == CabinAirQuality.Clean &
                airAssessment == AirAssessment.Clear) |
               (airQualityValidity == AirQualityValidity.Valid &
                cabinAirQuality == CabinAirQuality.Elevated &
                airAssessment == AirAssessment.FilterNormalNeeded) |
               (airQualityValidity == AirQualityValidity.Valid &
                cabinAirQuality == CabinAirQuality.Poor &
                airAssessment == AirAssessment.FilterIntensiveNeeded));
    }*/
                        
                
                         
                                              
                                                 
             
                             
                                            
                                                              
                                                     
                                                            
                                                      
                                                   
                                                            
                                                         
                                                                
                                                            
                                                     
                                                                   
       
  }

  part def HumidityQualificationOwner :> Thread {
    port cabinHumidity : DataPort { in :>> type : CabinHumidity; }
    port humidityValidity : DataPort { in :>> type : HumidityValidity; }
    port humidityAssessment : DataPort { out :>> type : HumidityAssessment; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_HUMIDITY_ASSESSMENT_SAFE:
          humidityAssessment == HumidityAssessment.Unknown;

      compute
        compute_cases
          case CASE_HUM_01_QUALIFICATION:
            assume true;
            guarantee
              ((humidityValidity == HumidityValidity.Invalid &
                humidityAssessment == HumidityAssessment.Unknown) |
               (humidityValidity == HumidityValidity.Valid &
                cabinHumidity == CabinHumidity.Damp &
                humidityAssessment == HumidityAssessment.DryingNeeded) |
               (humidityValidity == HumidityValidity.Valid &
                (cabinHumidity == CabinHumidity.Dry |
                 cabinHumidity == CabinHumidity.Comfortable) &
                humidityAssessment == HumidityAssessment.NoExcessHumidity));
    }*/
                        
                
                         
                                                   
                                                           
             
                             
                                            
                                                          
                                                               
                                                        
                                                 
                                                                    
                                                        
                                                 
                                                          
                                                                        
       
  }

  part def TreatmentReadinessQualificationOwner :> Thread {
    port treatmentEquipmentStatus : DataPort { in :>> type : TreatmentEquipmentStatus; }
    port treatmentReadiness : DataPort { out :>> type : TreatmentReadiness; }
    port readinessContext : DataPort { out :>> type : ReadinessContext; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_READINESS_SAFE:
          treatmentReadiness == TreatmentReadiness.Unknown &
          readinessContext == ReadinessContext.CriticalUnknown;

      compute
        compute_cases
          case CASE_EQP_01_INVALID:
            assume treatmentEquipmentStatus.statusValidity == StatusValidity.Invalid;
            guarantee treatmentReadiness == TreatmentReadiness.Unknown &
              readinessContext == ReadinessContext.CriticalUnknown;

          case CASE_EQP_02_VALID_CROSS_PRODUCT:
            assume treatmentEquipmentStatus.statusValidity == StatusValidity.Valid;
            guarantee readinessContext == ReadinessContext.Clear &
              ((treatmentEquipmentStatus.filtrationChannel == FilterPathStatus.Unavailable &
                treatmentEquipmentStatus.dryingChannel == DryingPathStatus.Unavailable &
                treatmentReadiness == TreatmentReadiness.NeitherReady) |
               (treatmentEquipmentStatus.filtrationChannel == FilterPathStatus.Ready &
                treatmentEquipmentStatus.dryingChannel == DryingPathStatus.Unavailable &
                treatmentReadiness == TreatmentReadiness.FilterOnly) |
               (treatmentEquipmentStatus.filtrationChannel == FilterPathStatus.Unavailable &
                treatmentEquipmentStatus.dryingChannel == DryingPathStatus.Ready &
                treatmentReadiness == TreatmentReadiness.DryerOnly) |
               (treatmentEquipmentStatus.filtrationChannel == FilterPathStatus.Ready &
                treatmentEquipmentStatus.dryingChannel == DryingPathStatus.Ready &
                treatmentReadiness == TreatmentReadiness.BothReady));
    }*/
                        
                
                         
                                         
                                                            
                                                               
             
                     
                               
                                   
                                                                                     
                                                                        
                                                                   
                               
                                               
                                                                                   
                                                                  
                                                                                            
                                                                                        
                                                                        
                                                                                      
                                                                                        
                                                                      
                                                                                            
                                                                                  
                                                                     
                                                                                      
                                                                                  
                                                                     
       
  }

  part def FiltrationProposalOwner :> Thread {
    port requestIntent : DataPort { in :>> type : RequestIntent; }
    port airAssessment : DataPort { in :>> type : AirAssessment; }
    port treatmentReadiness : DataPort { in :>> type : TreatmentReadiness; }
    port airProposal : DataPort { out :>> type : AirProposal; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_AIR_PROPOSAL_SAFE:
          airProposal == AirProposal.None;

      compute
        compute_cases
          case CASE_AIR_02_PROPOSAL_PARTITION:
            assume true;
            guarantee
              (((requestIntent == RequestIntent.None |
                 requestIntent == RequestIntent.BlockedInvalid |
                 requestIntent == RequestIntent.BlockedRearm) &
                airProposal == AirProposal.None) |
               ((requestIntent == RequestIntent.FreshPurge |
                 requestIntent == RequestIntent.HeldPurge) &
                (treatmentReadiness == TreatmentReadiness.FilterOnly |
                 treatmentReadiness == TreatmentReadiness.BothReady) &
                airProposal == AirProposal.FilterIntensive) |
               ((requestIntent == RequestIntent.FreshPurge |
                 requestIntent == RequestIntent.HeldPurge) &
                treatmentReadiness != TreatmentReadiness.FilterOnly &
                treatmentReadiness != TreatmentReadiness.BothReady &
                airProposal == AirProposal.FilterUnavailable) |
               ((requestIntent == RequestIntent.FreshAuto |
                 requestIntent == RequestIntent.HeldAuto) &
                airAssessment == AirAssessment.Unknown &
                airProposal == AirProposal.InvalidAirObservation) |
               ((requestIntent == RequestIntent.FreshAuto |
                 requestIntent == RequestIntent.HeldAuto) &
                airAssessment == AirAssessment.Clear &
                airProposal == AirProposal.None) |
               ((requestIntent == RequestIntent.FreshAuto |
                 requestIntent == RequestIntent.HeldAuto) &
                airAssessment == AirAssessment.FilterNormalNeeded &
                (treatmentReadiness == TreatmentReadiness.FilterOnly |
                 treatmentReadiness == TreatmentReadiness.BothReady) &
                airProposal == AirProposal.FilterNormal) |
               ((requestIntent == RequestIntent.FreshAuto |
                 requestIntent == RequestIntent.HeldAuto) &
                airAssessment == AirAssessment.FilterIntensiveNeeded &
                (treatmentReadiness == TreatmentReadiness.FilterOnly |
                 treatmentReadiness == TreatmentReadiness.BothReady) &
                airProposal == AirProposal.FilterIntensive) |
               ((requestIntent == RequestIntent.FreshAuto |
                 requestIntent == RequestIntent.HeldAuto) &
                (airAssessment == AirAssessment.FilterNormalNeeded |
                 airAssessment == AirAssessment.FilterIntensiveNeeded) &
                treatmentReadiness != TreatmentReadiness.FilterOnly &
                treatmentReadiness != TreatmentReadiness.BothReady &
                airProposal == AirProposal.FilterUnavailable));
    }*/
                        
                
                         
                                            
                                          
             
                             
                                                 
                                                  
                                                            
                                                           
                                              
                                                        
                                                        
                                                                  
                                                                  
                                                         
                                                        
                                                        
                                                                 
                                                                
                                                           
                                                       
                                                       
                                                    
                                                               
                                                       
                                                       
                                                  
                                              
                                                       
                                                       
                                                               
                                                                  
                                                                  
                                                      
                                                       
                                                       
                                                                  
                                                                  
                                                                  
                                                         
                                                       
                                                       
                                                                
                                                                    
                                                                 
                                                                
                                                           
       
  }

  part def HumidityProposalOwner :> Thread {
    port requestIntent : DataPort { in :>> type : RequestIntent; }
    port humidityAssessment : DataPort { in :>> type : HumidityAssessment; }
    port treatmentReadiness : DataPort { in :>> type : TreatmentReadiness; }
    port humidityProposal : DataPort { out :>> type : HumidityProposal; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_HUMIDITY_PROPOSAL_SAFE:
          humidityProposal == HumidityProposal.None;

      compute
        compute_cases
          case CASE_HUM_02_PROPOSAL_PARTITION:
            assume true;
            guarantee
              (((requestIntent == RequestIntent.None |
                 requestIntent == RequestIntent.BlockedInvalid |
                 requestIntent == RequestIntent.BlockedRearm |
                 requestIntent == RequestIntent.FreshPurge |
                 requestIntent == RequestIntent.HeldPurge) &
                humidityProposal == HumidityProposal.None) |
               ((requestIntent == RequestIntent.FreshAuto |
                 requestIntent == RequestIntent.HeldAuto) &
                humidityAssessment == HumidityAssessment.Unknown &
                humidityProposal == HumidityProposal.InvalidHumidityObservation) |
               ((requestIntent == RequestIntent.FreshAuto |
                 requestIntent == RequestIntent.HeldAuto) &
                humidityAssessment == HumidityAssessment.NoExcessHumidity &
                humidityProposal == HumidityProposal.None) |
               ((requestIntent == RequestIntent.FreshAuto |
                 requestIntent == RequestIntent.HeldAuto) &
                humidityAssessment == HumidityAssessment.DryingNeeded &
                (treatmentReadiness == TreatmentReadiness.DryerOnly |
                 treatmentReadiness == TreatmentReadiness.BothReady) &
                humidityProposal == HumidityProposal.Dry) |
               ((requestIntent == RequestIntent.FreshAuto |
                 requestIntent == RequestIntent.HeldAuto) &
                humidityAssessment == HumidityAssessment.DryingNeeded &
                treatmentReadiness != TreatmentReadiness.DryerOnly &
                treatmentReadiness != TreatmentReadiness.BothReady &
                humidityProposal == HumidityProposal.DryerUnavailable));
    }*/
                        
                
                         
                                                 
                                                    
             
                             
                                                 
                                                  
                                                            
                                                          
                                                        
                                                        
                                                        
                                                       
                                                       
                                                              
                                                                              
                                                       
                                                       
                                                                       
                                                        
                                                       
                                                       
                                                                   
                                                                 
                                                                  
                                                       
                                                       
                                                       
                                                                   
                                                                
                                                                
                                                                    
       
  }

  part def ReadinessRecoveryOwner :> Thread {
    port requestIntent : DataPort { in :>> type : RequestIntent; }
    port readinessContext : DataPort { in :>> type : ReadinessContext; }
    port recoveryGate : DataPort { out :>> type : RecoveryMemory; }

    language "GUMBO" /*{
      state
        recoveryMemory: RecoveryMemory;

      initialize
        guarantee INITIAL_RECOVERY_SAFE:
          recoveryMemory == RecoveryMemory.Ready &
          recoveryGate == RecoveryMemory.Ready;

      compute
        compute_cases
          case CASE_REC_01_CRITICAL_UNKNOWN:
            assume readinessContext == ReadinessContext.CriticalUnknown;
            guarantee recoveryMemory == RecoveryMemory.FaultHeld &
              recoveryGate == RecoveryMemory.FaultHeld;

          case CASE_REC_02_RECOVER_TO_AWAIT_FRESH:
            assume readinessContext == ReadinessContext.Clear &
              recoveryMemory == RecoveryMemory.FaultHeld;
            guarantee recoveryMemory == RecoveryMemory.AwaitFresh &
              recoveryGate == RecoveryMemory.AwaitFresh;

          case CASE_REC_03_FRESH_REAUTHORIZATION:
            assume readinessContext == ReadinessContext.Clear &
              recoveryMemory == RecoveryMemory.AwaitFresh &
              (requestIntent == RequestIntent.FreshAuto |
               requestIntent == RequestIntent.FreshPurge);
            guarantee recoveryMemory == RecoveryMemory.Ready &
              recoveryGate == RecoveryMemory.Ready;

          case CASE_REC_04_RETAIN_AWAIT_FRESH:
            assume readinessContext == ReadinessContext.Clear &
              recoveryMemory == RecoveryMemory.AwaitFresh &
              requestIntent != RequestIntent.FreshAuto &
              requestIntent != RequestIntent.FreshPurge;
            guarantee recoveryMemory == RecoveryMemory.AwaitFresh &
              recoveryGate == RecoveryMemory.AwaitFresh;

          case CASE_REC_05_RETAIN_READY:
            assume readinessContext == ReadinessContext.Clear &
              recoveryMemory == RecoveryMemory.Ready;
            guarantee recoveryMemory == RecoveryMemory.Ready &
              recoveryGate == RecoveryMemory.Ready;
    }*/
                        
           
                          
                                       
                
                                
                         
                                        
                                                  
                                               
             
                                
                          
                                                     
                                         
                     
                               
                                            
                                                                        
                                                                  
                                                       
                               
                                                  
                                                               
                                                             
                                                                   
                                                        
                               
                                                 
                                                               
                                                               
                                                         
                                                          
                                                              
                                                   
                               
                                              
                                                               
                                                               
                                                        
                                                        
                                                                   
                                                        
                               
                                        
                                                               
                                                         
                                                              
                                                   
       
  }

  part def AirCarePriorityResultArbiter :> Thread {
    port requestIntent : DataPort { in :>> type : RequestIntent; }
    port airProposal : DataPort { in :>> type : AirProposal; }
    port humidityProposal : DataPort { in :>> type : HumidityProposal; }
    port recoveryGate : DataPort { in :>> type : RecoveryMemory; }
    port airTreatmentCommand : DataPort { out :>> type : AirTreatmentCommand; }
    port airCareSupervisorStatus : DataPort { out :>> type : AirCareSupervisorStatus; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_RESULT_SAFE:
          airTreatmentCommand == AirTreatmentCommand.Off &
          airCareSupervisorStatus.mode == StatusMode.Idle &
          airCareSupervisorStatus.reason == StatusReason.None;

      compute
        compute_cases
          case CASE_ARB_01_RECOVERY_DOMINATES:
            assume recoveryGate != RecoveryMemory.Ready;
            guarantee airTreatmentCommand == AirTreatmentCommand.Off &
              ((recoveryGate == RecoveryMemory.FaultHeld &
                airCareSupervisorStatus.mode == StatusMode.Recovery &
                airCareSupervisorStatus.reason == StatusReason.ReadinessInvalid) |
               (recoveryGate == RecoveryMemory.AwaitFresh &
                airCareSupervisorStatus.mode == StatusMode.Recovery &
                airCareSupervisorStatus.reason == StatusReason.AwaitFresh));

          case CASE_ARB_02_NONACTIONABLE_REQUEST:
            assume recoveryGate == RecoveryMemory.Ready &
              (requestIntent == RequestIntent.None |
               requestIntent == RequestIntent.BlockedInvalid |
               requestIntent == RequestIntent.BlockedRearm);
            guarantee airTreatmentCommand == AirTreatmentCommand.Off &
              ((requestIntent == RequestIntent.None &
                airCareSupervisorStatus.mode == StatusMode.Idle &
                airCareSupervisorStatus.reason == StatusReason.None) |
               (requestIntent == RequestIntent.BlockedInvalid &
                airCareSupervisorStatus.mode == StatusMode.Attention &
                airCareSupervisorStatus.reason == StatusReason.RequestInvalid) |
               (requestIntent == RequestIntent.BlockedRearm &
                airCareSupervisorStatus.mode == StatusMode.Attention &
                airCareSupervisorStatus.reason == StatusReason.RearmRequired));

          case CASE_ARB_03_FILTRATION_PRIORITY:
            assume recoveryGate == RecoveryMemory.Ready &
              (requestIntent == RequestIntent.FreshAuto |
               requestIntent == RequestIntent.HeldAuto |
               requestIntent == RequestIntent.FreshPurge |
               requestIntent == RequestIntent.HeldPurge) &
              (airProposal == AirProposal.FilterNormal |
               airProposal == AirProposal.FilterIntensive);
            guarantee airCareSupervisorStatus.mode == StatusMode.Active &
              ((airProposal == AirProposal.FilterNormal &
                airTreatmentCommand == AirTreatmentCommand.FilterNormal) |
               (airProposal == AirProposal.FilterIntensive &
                airTreatmentCommand == AirTreatmentCommand.FilterIntensive)) &
              ((humidityProposal == HumidityProposal.Dry &
                airCareSupervisorStatus.reason == StatusReason.AirPriority) |
               (humidityProposal == HumidityProposal.InvalidHumidityObservation &
                airCareSupervisorStatus.reason == StatusReason.HumidityObservationInvalid) |
               (humidityProposal == HumidityProposal.DryerUnavailable &
                airCareSupervisorStatus.reason == StatusReason.DryerUnavailable) |
               (humidityProposal == HumidityProposal.None &
                airCareSupervisorStatus.reason == StatusReason.Filtering));

          case CASE_ARB_04_DRY_OR_OFF_RESIDUAL:
            assume recoveryGate == RecoveryMemory.Ready &
              (requestIntent == RequestIntent.FreshAuto |
               requestIntent == RequestIntent.HeldAuto |
               requestIntent == RequestIntent.FreshPurge |
               requestIntent == RequestIntent.HeldPurge) &
              (airProposal == AirProposal.None |
               airProposal == AirProposal.InvalidAirObservation |
               airProposal == AirProposal.FilterUnavailable);
            guarantee airCareSupervisorStatus.mode == StatusMode.Active &
              ((humidityProposal == HumidityProposal.Dry &
                airTreatmentCommand == AirTreatmentCommand.Dry &
                ((airProposal == AirProposal.InvalidAirObservation &
                  airCareSupervisorStatus.reason == StatusReason.AirObservationInvalid) |
                 (airProposal == AirProposal.FilterUnavailable &
                  airCareSupervisorStatus.reason == StatusReason.FilterUnavailable) |
                 (airProposal == AirProposal.None &
                  airCareSupervisorStatus.reason == StatusReason.Drying))) |
               (humidityProposal != HumidityProposal.Dry &
                airTreatmentCommand == AirTreatmentCommand.Off &
                ((airProposal == AirProposal.InvalidAirObservation &
                  airCareSupervisorStatus.reason == StatusReason.AirObservationInvalid) |
                 (airProposal == AirProposal.FilterUnavailable &
                  airCareSupervisorStatus.reason == StatusReason.FilterUnavailable) |
                 (airProposal == AirProposal.None &
                  humidityProposal == HumidityProposal.InvalidHumidityObservation &
                  airCareSupervisorStatus.reason == StatusReason.HumidityObservationInvalid) |
                 (airProposal == AirProposal.None &
                  humidityProposal == HumidityProposal.DryerUnavailable &
                  airCareSupervisorStatus.reason == StatusReason.DryerUnavailable) |
                 (airProposal == AirProposal.None &
                  humidityProposal == HumidityProposal.None &
                  airCareSupervisorStatus.reason == StatusReason.NoTreatmentNeeded))));
    }*/
                        
                
                         
                                      
                                                          
                                                           
                                                              
             
                     
                               
                                              
                                                        
                                                                      
                                                          
                                                                     
                                                                                  
                                                           
                                                                     
                                                                            
                               
                                                 
                                                         
                                                    
                                                              
                                                            
                                                                      
                                                     
                                                                 
                                                                      
                                                               
                                                                      
                                                                                
                                                             
                                                                      
                                                                               
                               
                                               
                                                         
                                                         
                                                        
                                                          
                                                          
                                                        
                                                           
                                                                         
                                                         
                                                                          
                                                            
                                                                              
                                                          
                                                                             
                                                                                 
                                                                                            
                                                                       
                                                                                  
                                                           
                                                                           
                               
                                               
                                                         
                                                         
                                                        
                                                          
                                                          
                                                
                                                                 
                                                             
                                                                         
                                                          
                                                                
                                                                    
                                                                                         
                                                                
                                                                                     
                                                   
                                                                            
                                                          
                                                                
                                                                    
                                                                                         
                                                                
                                                                                     
                                                   
                                                                                   
                                                                                              
                                                   
                                                                         
                                                                                    
                                                   
                                                             
                                                                                       
       
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
