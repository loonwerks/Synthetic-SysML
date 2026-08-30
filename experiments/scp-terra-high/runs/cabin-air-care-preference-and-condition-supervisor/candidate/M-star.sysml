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
          requestMemory == RequestMemory.Released and
          requestIntent == RequestIntent.None;
      compute
        modifies requestMemory;
        guarantee REQUEST_LIFECYCLE: 
          (requestValidity == RequestValidity.Invalid and
            requestIntent == RequestIntent.BlockedInvalid and
            requestMemory == RequestMemory.RearmRequired) or
          (requestValidity == RequestValidity.Valid and
            airCareSelection == AirCareSelection.Off and
            requestIntent == RequestIntent.None and
            requestMemory == RequestMemory.Released) or
          (requestValidity == RequestValidity.Valid and
            airCareSelection == AirCareSelection.Auto and
            In(requestMemory) == RequestMemory.Released and
            requestIntent == RequestIntent.FreshAuto and
            requestMemory == RequestMemory.AcceptedActive) or
          (requestValidity == RequestValidity.Valid and
            airCareSelection == AirCareSelection.Purge and
            In(requestMemory) == RequestMemory.Released and
            requestIntent == RequestIntent.FreshPurge and
            requestMemory == RequestMemory.AcceptedActive) or
          (requestValidity == RequestValidity.Valid and
            airCareSelection == AirCareSelection.Auto and
            In(requestMemory) == RequestMemory.AcceptedActive and
            requestIntent == RequestIntent.HeldAuto and
            requestMemory == RequestMemory.AcceptedActive) or
          (requestValidity == RequestValidity.Valid and
            airCareSelection == AirCareSelection.Purge and
            In(requestMemory) == RequestMemory.AcceptedActive and
            requestIntent == RequestIntent.HeldPurge and
            requestMemory == RequestMemory.AcceptedActive) or
          (requestValidity == RequestValidity.Valid and
            airCareSelection != AirCareSelection.Off and
            In(requestMemory) == RequestMemory.RearmRequired and
            requestIntent == RequestIntent.BlockedRearm and
            requestMemory == RequestMemory.RearmRequired);
    }*/

                        
           
                          
                                     
                
                               
                         
                                                 
                                                   
                                              
             
                               
                     
                              
                                  
                                                              
                                                                     
                                                           
                              
                                    
                                                             
                                                       
                                                           
                                                      
                              
                                       
                                                             
                                                        
                                                          
                                                                     
                                                           
                                                           
                                                            
                                                            
                              
                                      
                                                             
                                                        
                                                                
                                                                     
                                                           
                                                          
                                                            
                                                           
                              
                                      
                                                             
                                                        
                                                               
                                                                   
                                                           
       
  }

  part def AirQualityQualificationOwner :> Thread {
    port cabinAirQuality : DataPort { in :>> type : CabinAirQuality; }
    port airQualityValidity : DataPort { in :>> type : AirQualityValidity; }
    port airAssessment : DataPort { out :>> type : AirAssessment; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_AIR_ASSESSMENT_SAFE: airAssessment == AirAssessment.Unknown;
      compute
        guarantee CASE_AIR_01_QUALIFICATION: 
          (airQualityValidity == AirQualityValidity.Invalid and
            airAssessment == AirAssessment.Unknown) or
          (airQualityValidity == AirQualityValidity.Valid and
            cabinAirQuality == CabinAirQuality.Clean and
            airAssessment == AirAssessment.Clear) or
          (airQualityValidity == AirQualityValidity.Valid and
            cabinAirQuality == CabinAirQuality.Elevated and
            airAssessment == AirAssessment.FilterNormalNeeded) or
          (airQualityValidity == AirQualityValidity.Valid and
            cabinAirQuality == CabinAirQuality.Poor and
            airAssessment == AirAssessment.FilterIntensiveNeeded);
    }*/

                        
                
                         
                                              
                                                 
             
                             
                                            
                                                              
                                                     
                                                            
                                                      
                                                   
                                                            
                                                         
                                                                
                                                            
                                                     
                                                                   
       
  }

  part def HumidityQualificationOwner :> Thread {
    port cabinHumidity : DataPort { in :>> type : CabinHumidity; }
    port humidityValidity : DataPort { in :>> type : HumidityValidity; }
    port humidityAssessment : DataPort { out :>> type : HumidityAssessment; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_HUMIDITY_ASSESSMENT_SAFE: humidityAssessment == HumidityAssessment.Unknown;
      compute
        guarantee CASE_HUM_01_QUALIFICATION: 
          (humidityValidity == HumidityValidity.Invalid and
            humidityAssessment == HumidityAssessment.Unknown) or
          (humidityValidity == HumidityValidity.Valid and
            cabinHumidity == CabinHumidity.Damp and
            humidityAssessment == HumidityAssessment.DryingNeeded) or
          (humidityValidity == HumidityValidity.Valid and
            (cabinHumidity == CabinHumidity.Dry or
             cabinHumidity == CabinHumidity.Comfortable) and
            humidityAssessment == HumidityAssessment.NoExcessHumidity);
    }*/

                        
                
                         
                                                   
                                                           
             
                             
                                            
                                                          
                                                               
                                                        
                                                 
                                                                    
                                                        
                                                 
                                                          
                                                                        
       
  }

  part def TreatmentReadinessQualificationOwner :> Thread {
    port treatmentEquipmentStatus : DataPort { in :>> type : TreatmentEquipmentStatus; }
    port treatmentReadiness : DataPort { out :>> type : TreatmentReadiness; }
    port readinessContext : DataPort { out :>> type : ReadinessContext; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_READINESS_SAFE: 
          treatmentReadiness == TreatmentReadiness.Unknown and
          readinessContext == ReadinessContext.CriticalUnknown;
      compute
        guarantee CASE_EQP_01_INVALID: 
          treatmentEquipmentStatus.statusValidity == StatusValidity.Invalid implies
          (treatmentReadiness == TreatmentReadiness.Unknown and
           readinessContext == ReadinessContext.CriticalUnknown);
        guarantee CASE_EQP_02_VALID_CROSS_PRODUCT: 
          treatmentEquipmentStatus.statusValidity == StatusValidity.Valid implies
          (readinessContext == ReadinessContext.Clear and
           ((treatmentEquipmentStatus.filtrationChannel == FilterPathStatus.Unavailable and
             treatmentEquipmentStatus.dryingChannel == DryingPathStatus.Unavailable and
             treatmentReadiness == TreatmentReadiness.NeitherReady) or
            (treatmentEquipmentStatus.filtrationChannel == FilterPathStatus.Ready and
             treatmentEquipmentStatus.dryingChannel == DryingPathStatus.Unavailable and
             treatmentReadiness == TreatmentReadiness.FilterOnly) or
            (treatmentEquipmentStatus.filtrationChannel == FilterPathStatus.Unavailable and
             treatmentEquipmentStatus.dryingChannel == DryingPathStatus.Ready and
             treatmentReadiness == TreatmentReadiness.DryerOnly) or
            (treatmentEquipmentStatus.filtrationChannel == FilterPathStatus.Ready and
             treatmentEquipmentStatus.dryingChannel == DryingPathStatus.Ready and
             treatmentReadiness == TreatmentReadiness.BothReady)));
    }*/

                        
                
                         
                                         
                                                            
                                                               
             
                     
                               
                                   
                                                                                     
                                                                        
                                                                   
                               
                                               
                                                                                   
                                                                  
                                                                                            
                                                                                        
                                                                        
                                                                                      
                                                                                        
                                                                      
                                                                                            
                                                                                  
                                                                     
                                                                                      
                                                                                  
                                                                     
       
  }

  part def FiltrationProposalOwner :> Thread {
    port requestIntent : DataPort { in :>> type : RequestIntent; }
    port airAssessment : DataPort { in :>> type : AirAssessment; }
    port treatmentReadiness : DataPort { in :>> type : TreatmentReadiness; }
    port airProposal : DataPort { out :>> type : AirProposal; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_AIR_PROPOSAL_SAFE: airProposal == AirProposal.None;
      compute
        guarantee CASE_AIR_02_PROPOSAL_PARTITION: 
          ((requestIntent == RequestIntent.None or
            requestIntent == RequestIntent.BlockedInvalid or
            requestIntent == RequestIntent.BlockedRearm) and
            airProposal == AirProposal.None) or
          ((requestIntent == RequestIntent.FreshPurge or
            requestIntent == RequestIntent.HeldPurge) and
            (treatmentReadiness == TreatmentReadiness.FilterOnly or
             treatmentReadiness == TreatmentReadiness.BothReady) and
            airProposal == AirProposal.FilterIntensive) or
          ((requestIntent == RequestIntent.FreshPurge or
            requestIntent == RequestIntent.HeldPurge) and
            treatmentReadiness != TreatmentReadiness.FilterOnly and
            treatmentReadiness != TreatmentReadiness.BothReady and
            airProposal == AirProposal.FilterUnavailable) or
          ((requestIntent == RequestIntent.FreshAuto or
            requestIntent == RequestIntent.HeldAuto) and
            airAssessment == AirAssessment.Unknown and
            airProposal == AirProposal.InvalidAirObservation) or
          ((requestIntent == RequestIntent.FreshAuto or
            requestIntent == RequestIntent.HeldAuto) and
            airAssessment == AirAssessment.Clear and
            airProposal == AirProposal.None) or
          ((requestIntent == RequestIntent.FreshAuto or
            requestIntent == RequestIntent.HeldAuto) and
            airAssessment == AirAssessment.FilterNormalNeeded and
            (treatmentReadiness == TreatmentReadiness.FilterOnly or
             treatmentReadiness == TreatmentReadiness.BothReady) and
            airProposal == AirProposal.FilterNormal) or
          ((requestIntent == RequestIntent.FreshAuto or
            requestIntent == RequestIntent.HeldAuto) and
            airAssessment == AirAssessment.FilterIntensiveNeeded and
            (treatmentReadiness == TreatmentReadiness.FilterOnly or
             treatmentReadiness == TreatmentReadiness.BothReady) and
            airProposal == AirProposal.FilterIntensive) or
          ((requestIntent == RequestIntent.FreshAuto or
            requestIntent == RequestIntent.HeldAuto) and
            (airAssessment == AirAssessment.FilterNormalNeeded or
             airAssessment == AirAssessment.FilterIntensiveNeeded) and
            treatmentReadiness != TreatmentReadiness.FilterOnly and
            treatmentReadiness != TreatmentReadiness.BothReady and
            airProposal == AirProposal.FilterUnavailable);
    }*/

                        
                
                         
                                            
                                          
             
                             
                                                 
                                                  
                                                            
                                                           
                                              
                                                        
                                                        
                                                                  
                                                                  
                                                         
                                                        
                                                        
                                                                 
                                                                
                                                           
                                                       
                                                       
                                                    
                                                               
                                                       
                                                       
                                                  
                                              
                                                       
                                                       
                                                               
                                                                  
                                                                  
                                                      
                                                       
                                                       
                                                                  
                                                                  
                                                                  
                                                         
                                                       
                                                       
                                                                
                                                                    
                                                                 
                                                                
                                                           
       
  }

  part def HumidityProposalOwner :> Thread {
    port requestIntent : DataPort { in :>> type : RequestIntent; }
    port humidityAssessment : DataPort { in :>> type : HumidityAssessment; }
    port treatmentReadiness : DataPort { in :>> type : TreatmentReadiness; }
    port humidityProposal : DataPort { out :>> type : HumidityProposal; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_HUMIDITY_PROPOSAL_SAFE: humidityProposal == HumidityProposal.None;
      compute
        guarantee CASE_HUM_02_PROPOSAL_PARTITION: 
          ((requestIntent == RequestIntent.None or
            requestIntent == RequestIntent.BlockedInvalid or
            requestIntent == RequestIntent.BlockedRearm or
            requestIntent == RequestIntent.FreshPurge or
            requestIntent == RequestIntent.HeldPurge) and
            humidityProposal == HumidityProposal.None) or
          ((requestIntent == RequestIntent.FreshAuto or
            requestIntent == RequestIntent.HeldAuto) and
            humidityAssessment == HumidityAssessment.Unknown and
            humidityProposal == HumidityProposal.InvalidHumidityObservation) or
          ((requestIntent == RequestIntent.FreshAuto or
            requestIntent == RequestIntent.HeldAuto) and
            humidityAssessment == HumidityAssessment.NoExcessHumidity and
            humidityProposal == HumidityProposal.None) or
          ((requestIntent == RequestIntent.FreshAuto or
            requestIntent == RequestIntent.HeldAuto) and
            humidityAssessment == HumidityAssessment.DryingNeeded and
            (treatmentReadiness == TreatmentReadiness.DryerOnly or
             treatmentReadiness == TreatmentReadiness.BothReady) and
            humidityProposal == HumidityProposal.Dry) or
          ((requestIntent == RequestIntent.FreshAuto or
            requestIntent == RequestIntent.HeldAuto) and
            humidityAssessment == HumidityAssessment.DryingNeeded and
            treatmentReadiness != TreatmentReadiness.DryerOnly and
            treatmentReadiness != TreatmentReadiness.BothReady and
            humidityProposal == HumidityProposal.DryerUnavailable);
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
          recoveryMemory == RecoveryMemory.Ready and
          recoveryGate == RecoveryMemory.Ready;
      compute
        modifies recoveryMemory;
        guarantee RECOVERY_TRANSITIONS: 
          (readinessContext == ReadinessContext.CriticalUnknown and
            recoveryMemory == RecoveryMemory.FaultHeld and
            recoveryGate == RecoveryMemory.FaultHeld) or
          (readinessContext == ReadinessContext.Clear and
            In(recoveryMemory) == RecoveryMemory.FaultHeld and
            recoveryMemory == RecoveryMemory.AwaitFresh and
            recoveryGate == RecoveryMemory.AwaitFresh) or
          (readinessContext == ReadinessContext.Clear and
            In(recoveryMemory) == RecoveryMemory.AwaitFresh and
            (requestIntent == RequestIntent.FreshAuto or
             requestIntent == RequestIntent.FreshPurge) and
            recoveryMemory == RecoveryMemory.Ready and
            recoveryGate == RecoveryMemory.Ready) or
          (readinessContext == ReadinessContext.Clear and
            In(recoveryMemory) == RecoveryMemory.AwaitFresh and
            requestIntent != RequestIntent.FreshAuto and
            requestIntent != RequestIntent.FreshPurge and
            recoveryMemory == RecoveryMemory.AwaitFresh and
            recoveryGate == RecoveryMemory.AwaitFresh) or
          (readinessContext == ReadinessContext.Clear and
            In(recoveryMemory) == RecoveryMemory.Ready and
            recoveryMemory == RecoveryMemory.Ready and
            recoveryGate == RecoveryMemory.Ready);
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
          airTreatmentCommand == AirTreatmentCommand.Off and
          airCareSupervisorStatus.mode == StatusMode.Idle and
          airCareSupervisorStatus.reason == StatusReason.None;
      compute
        guarantee CASE_ARB_01_RECOVERY_DOMINATES: 
          recoveryGate != RecoveryMemory.Ready implies
          (airTreatmentCommand == AirTreatmentCommand.Off and
           ((recoveryGate == RecoveryMemory.FaultHeld and
             airCareSupervisorStatus.mode == StatusMode.Recovery and
             airCareSupervisorStatus.reason == StatusReason.ReadinessInvalid) or
            (recoveryGate == RecoveryMemory.AwaitFresh and
             airCareSupervisorStatus.mode == StatusMode.Recovery and
             airCareSupervisorStatus.reason == StatusReason.AwaitFresh)));
        guarantee CASE_ARB_02_NONACTIONABLE_REQUEST: 
          recoveryGate == RecoveryMemory.Ready and
          (requestIntent == RequestIntent.None or
           requestIntent == RequestIntent.BlockedInvalid or
           requestIntent == RequestIntent.BlockedRearm) implies
          (airTreatmentCommand == AirTreatmentCommand.Off and
           ((requestIntent == RequestIntent.None and
             airCareSupervisorStatus.mode == StatusMode.Idle and
             airCareSupervisorStatus.reason == StatusReason.None) or
            (requestIntent == RequestIntent.BlockedInvalid and
             airCareSupervisorStatus.mode == StatusMode.Attention and
             airCareSupervisorStatus.reason == StatusReason.RequestInvalid) or
            (requestIntent == RequestIntent.BlockedRearm and
             airCareSupervisorStatus.mode == StatusMode.Attention and
             airCareSupervisorStatus.reason == StatusReason.RearmRequired)));
        guarantee CASE_ARB_03_FILTRATION_PRIORITY: 
          recoveryGate == RecoveryMemory.Ready and
          (requestIntent == RequestIntent.FreshAuto or
           requestIntent == RequestIntent.HeldAuto or
           requestIntent == RequestIntent.FreshPurge or
           requestIntent == RequestIntent.HeldPurge) and
          (airProposal == AirProposal.FilterNormal or
           airProposal == AirProposal.FilterIntensive) implies
          (airCareSupervisorStatus.mode == StatusMode.Active and
           ((airProposal == AirProposal.FilterNormal and
             airTreatmentCommand == AirTreatmentCommand.FilterNormal) or
            (airProposal == AirProposal.FilterIntensive and
             airTreatmentCommand == AirTreatmentCommand.FilterIntensive)) and
           ((humidityProposal == HumidityProposal.Dry and
             airCareSupervisorStatus.reason == StatusReason.AirPriority) or
            (humidityProposal == HumidityProposal.InvalidHumidityObservation and
             airCareSupervisorStatus.reason == StatusReason.HumidityObservationInvalid) or
            (humidityProposal == HumidityProposal.DryerUnavailable and
             airCareSupervisorStatus.reason == StatusReason.DryerUnavailable) or
            (humidityProposal == HumidityProposal.None and
             airCareSupervisorStatus.reason == StatusReason.Filtering)));
        guarantee CASE_ARB_04_DRY_OR_OFF_RESIDUAL: 
          recoveryGate == RecoveryMemory.Ready and
          (requestIntent == RequestIntent.FreshAuto or
           requestIntent == RequestIntent.HeldAuto or
           requestIntent == RequestIntent.FreshPurge or
           requestIntent == RequestIntent.HeldPurge) and
          (airProposal == AirProposal.None or
           airProposal == AirProposal.InvalidAirObservation or
           airProposal == AirProposal.FilterUnavailable) implies
          (airCareSupervisorStatus.mode == StatusMode.Active and
           ((humidityProposal == HumidityProposal.Dry and
             airTreatmentCommand == AirTreatmentCommand.Dry and
             ((airProposal == AirProposal.InvalidAirObservation and
               airCareSupervisorStatus.reason == StatusReason.AirObservationInvalid) or
              (airProposal == AirProposal.FilterUnavailable and
               airCareSupervisorStatus.reason == StatusReason.FilterUnavailable) or
              (airProposal == AirProposal.None and
               airCareSupervisorStatus.reason == StatusReason.Drying))) or
            (humidityProposal != HumidityProposal.Dry and
             airTreatmentCommand == AirTreatmentCommand.Off and
             ((airProposal == AirProposal.InvalidAirObservation and
               airCareSupervisorStatus.reason == StatusReason.AirObservationInvalid) or
              (airProposal == AirProposal.FilterUnavailable and
               airCareSupervisorStatus.reason == StatusReason.FilterUnavailable) or
              (airProposal == AirProposal.None and
               humidityProposal == HumidityProposal.InvalidHumidityObservation and
               airCareSupervisorStatus.reason == StatusReason.HumidityObservationInvalid) or
              (airProposal == AirProposal.None and
               humidityProposal == HumidityProposal.DryerUnavailable and
               airCareSupervisorStatus.reason == StatusReason.DryerUnavailable) or
              (airProposal == AirProposal.None and
               humidityProposal == HumidityProposal.None and
               airCareSupervisorStatus.reason == StatusReason.NoTreatmentNeeded)))));
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
