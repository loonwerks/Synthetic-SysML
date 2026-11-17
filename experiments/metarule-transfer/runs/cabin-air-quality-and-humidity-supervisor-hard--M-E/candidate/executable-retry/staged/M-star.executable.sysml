// Canonical final source: retained architecture plus approved local GUMBO behavior.
package Cabin_Air_Quality_Humidity_Supervisor {
  private import HAMR::*;

  enum def Validity { enum Valid; enum Invalid; }
  enum def Arrival { enum New; enum Held; }
  enum def EnableChoice { enum On; enum Off; }
  enum def FilterPolicy { enum Automatic; enum Continuous; }
  enum def HumidityPolicy { enum Automatic; enum Disabled; }
  enum def RoutineAirflow { enum Off; enum Low; enum High; }
  enum def AirCondition { enum Clean; enum Loaded; }
  enum def HumidityCondition { enum Dry; enum Acceptable; enum Damp; }
  // Tool-required one-to-one field projections keep the four independently
  // inspected MON-04 positions distinct without changing their finite values.
  enum def BlowerReadiness { enum Ready; enum Failed; enum Unknown; }
  enum def FilterUnitReadiness { enum Ready; enum Failed; enum Unknown; }
  enum def HumidifierReadiness { enum Ready; enum Failed; enum Unknown; }
  enum def DehumidifierReadiness { enum Ready; enum Failed; enum Unknown; }
  enum def PathGrant { enum Granted; enum Reserved; }

  enum def CandidateClass { enum Invalid; enum Held; enum FreshDisabled; enum FreshEnabled; }
  enum def AirEvidence { enum Invalid; enum Clean; enum FilterDemand; }
  enum def HumidityEvidence { enum Invalid; enum Dry; enum None; enum Damp; }
  enum def PathDisposition { enum Usable; enum Reserved; enum Untrusted; }
  // Tool-required one-to-one projections keep every concurrently inspected
  // PART-05 payload position distinct.  Each preserves the approved
  // Ready/Failed/Unknown/Untrusted domain exactly and receives no owner credit.
  enum def FilterBranchBlowerDisposition { enum Ready; enum Failed; enum Unknown; enum Untrusted; }
  enum def FilterBranchPathDisposition { enum Ready; enum Failed; enum Unknown; enum Untrusted; }
  enum def HumidityBranchBlowerDisposition { enum Ready; enum Failed; enum Unknown; enum Untrusted; }
  enum def HumidityBranchHumidifierDisposition { enum Ready; enum Failed; enum Unknown; enum Untrusted; }
  enum def HumidityBranchDehumidifierDisposition { enum Ready; enum Failed; enum Unknown; enum Untrusted; }
  enum def RoutineBranchBlowerDisposition { enum Ready; enum Failed; enum Unknown; enum Untrusted; }
  enum def ComposerBlowerDisposition { enum Ready; enum Failed; enum Unknown; enum Untrusted; }
  enum def ComposerFilterDisposition { enum Ready; enum Failed; enum Unknown; enum Untrusted; }
  enum def ComposerHumidifierDisposition { enum Ready; enum Failed; enum Unknown; enum Untrusted; }
  enum def ComposerDehumidifierDisposition { enum Ready; enum Failed; enum Unknown; enum Untrusted; }
  enum def TrustState { enum Trusted; enum Quarantined; enum Confirming; }
  enum def AirRecoveryEvent {
    enum AirStable; enum AirFaultEntered; enum AirFaultPersists;
    enum AirRecoveryStarted; enum AirFaultRecurred; enum AirRecovered;
  }
  enum def HumidityRecoveryEvent {
    enum HumidityStable; enum HumidityFaultEntered; enum HumidityFaultPersists;
    enum HumidityRecoveryStarted; enum HumidityFaultRecurred; enum HumidityRecovered;
  }
  enum def PreferenceEvent { enum RejectedInvalid; enum NoNewPreference; enum AcceptedDisabled; enum AcceptedEnabled; }
  enum def FilterProposal { enum None; enum Environmental; enum Continuous; enum Unavailable; }
  enum def HumidityProposal { enum None; enum Increase; enum Reduce; enum Unavailable; }
  enum def RoutineProposal { enum None; enum Low; enum High; enum Unavailable; }
  enum def SelectedIntent { enum None; enum Filter; enum Increase; enum Reduce; enum ExchangeAir; }
  enum def TreatmentAction { enum None; enum FilterAir; enum IncreaseHumidity; enum ReduceHumidity; enum ExchangeAir; }
  enum def FlowClass { enum Off; enum Routine; enum Treatment; }
  enum def AuthorityUse { enum None; enum SharedAirPath; }
  enum def SupervisorMode { enum Idle; enum Active; enum Degraded; enum ObservationHold; enum Inhibited; }
  enum def StatusCause {
    enum None; enum PreferenceDisabled; enum PreferenceRejected;
    enum AirTreatmentPriority; enum HumidityTreatmentPriority;
    enum AirObservationInvalid; enum HumidityObservationInvalid;
    enum AirRecovering; enum HumidityRecovering;
    enum AuthorityInvalid; enum AirPathReserved;
    enum EquipmentUnavailable; enum SelectedPathUnavailable;
  }

  // All record fields are attributes because final-stage GUMBO inspects them.
  part def UserAirPreference :> Data {
    attribute validity : Validity;
    attribute arrival : Arrival;
    attribute enable : EnableChoice;
    attribute filterPolicy : FilterPolicy;
    attribute humidityPolicy : HumidityPolicy;
    attribute routineAirflow : RoutineAirflow;
  }
  part def AirQualityObservation :> Data {
    attribute validity : Validity;
    attribute condition : AirCondition;
  }
  part def HumidityObservation :> Data {
    attribute validity : Validity;
    attribute condition : HumidityCondition;
  }
  part def AirTreatmentReadiness :> Data {
    attribute validity : Validity;
    attribute blowerReadiness : BlowerReadiness;
    attribute filterUnit : FilterUnitReadiness;
    attribute humidifier : HumidifierReadiness;
    attribute dehumidifier : DehumidifierReadiness;
  }
  part def SharedAirPathAuthority :> Data {
    attribute validity : Validity;
    attribute grant : PathGrant;
  }
  part def CabinAirTreatmentPlan :> Data {
    attribute treatmentAction : TreatmentAction;
    attribute flowClass : FlowClass;
    attribute authorityUse : AuthorityUse;
  }
  part def CabinAirSupervisorStatus :> Data {
    attribute mode : SupervisorMode;
    attribute cause : StatusCause;
  }
  part def QualifiedPreferenceCandidate :> Data {
    attribute candidateClass : CandidateClass;
    attribute enable : EnableChoice;
    attribute filterPolicy : FilterPolicy;
    attribute humidityPolicy : HumidityPolicy;
    attribute routineAirflow : RoutineAirflow;
  }
  part def FilterCapabilityFacts :> Data {
    attribute filterBlowerDisposition : FilterBranchBlowerDisposition;
    attribute filterDisposition : FilterBranchPathDisposition;
  }
  part def HumidityCapabilityFacts :> Data {
    attribute humidityBlowerDisposition : HumidityBranchBlowerDisposition;
    attribute humidifierDisposition : HumidityBranchHumidifierDisposition;
    attribute dehumidifierDisposition : HumidityBranchDehumidifierDisposition;
  }
  part def BlowerCapabilityFact :> Data {
    attribute routineBlowerDisposition : RoutineBranchBlowerDisposition;
  }
  part def CapabilitySet :> Data {
    attribute sharedBlowerDisposition : ComposerBlowerDisposition;
    attribute sharedFilterDisposition : ComposerFilterDisposition;
    attribute sharedHumidifierDisposition : ComposerHumidifierDisposition;
    attribute sharedDehumidifierDisposition : ComposerDehumidifierDisposition;
  }
  part def AirRecoveryReport :> Data {
    attribute trust : TrustState;
    attribute transitionEvent : AirRecoveryEvent;
    attribute evidence : AirEvidence;
    attribute gateOpen : Base_Types::Boolean;
  }
  part def HumidityRecoveryReport :> Data {
    attribute trust : TrustState;
    attribute transitionEvent : HumidityRecoveryEvent;
    attribute evidence : HumidityEvidence;
    attribute gateOpen : Base_Types::Boolean;
  }
  part def AcceptedPreference :> Data {
    attribute enable : EnableChoice;
    attribute filterPolicy : FilterPolicy;
    attribute humidityPolicy : HumidityPolicy;
    attribute routineAirflow : RoutineAirflow;
    attribute preferenceEvent : PreferenceEvent;
  }
  part def FilterProposalReport :> Data {
    attribute proposal : FilterProposal;
    attribute cause : StatusCause;
  }
  part def HumidityProposalReport :> Data {
    attribute proposal : HumidityProposal;
    attribute cause : StatusCause;
  }
  part def RoutineProposalReport :> Data {
    attribute proposal : RoutineProposal;
    attribute cause : StatusCause;
  }
  part def SelectionReport :> Data {
    attribute intent : SelectedIntent;
    attribute flowClass : FlowClass;
    attribute cause : StatusCause;
  }
  part def CompositionReport :> Data {
    attribute treatmentAction : TreatmentAction;
    attribute flowClass : FlowClass;
    attribute authorityUse : AuthorityUse;
    attribute cause : StatusCause;
  }

  part def PreferenceRequestQualifier :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port preference : DataPort { in :>> type : UserAirPreference; }
    port candidate : DataPort { out :>> type : QualifiedPreferenceCandidate; }

    language "GUMBO" /*{
                
                                         
                                                                
                                                  
                                                              
                                                                 
                                                           

      compute
        guarantee QUALIFIED_PREFERENCE_CLASSIFICATION:
          (candidate.enable == preference.enable) &
          (candidate.filterPolicy == preference.filterPolicy) &
          (candidate.humidityPolicy == preference.humidityPolicy) &
          (candidate.routineAirflow == preference.routineAirflow) &
          (((preference.validity == Validity.Invalid) &
             (candidate.candidateClass == CandidateClass.Invalid)) |
          ((preference.validity == Validity.Valid) &
             (preference.arrival == Arrival.Held) &
             (candidate.candidateClass == CandidateClass.Held)) |
          ((preference.validity == Validity.Valid) &
             (preference.arrival == Arrival.New) &
             (preference.enable == EnableChoice.Off) &
             (candidate.candidateClass == CandidateClass.FreshDisabled)) |
          ((preference.validity == Validity.Valid) &
             (preference.arrival == Arrival.New) &
             (preference.enable == EnableChoice.On) &
             (candidate.candidateClass == CandidateClass.FreshEnabled)));
    }*/

                        
                
                           
                                         
                                                              
                                                
                                                            
                                                               
                                                         
             
                         
                                                      
                                                 
                                                             
                                                                 
                                                                 
                                                     
                                                                 
                                                   
                                                
                                                              
                                                   
                                               
                                                   
                                                                       
                                                   
                                               
                                                  
                                                                      
       
  }
  part def AirQualityNeedAssessor :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port observation : DataPort { in :>> type : AirQualityObservation; }
    port evidence : DataPort { out :>> type : AirEvidence; }

    language "GUMBO" /*{
                
                                            
                                          

      compute
        guarantee AIR_EVIDENCE_CLASSIFICATION:
          ((observation.validity == Validity.Invalid) & (evidence == AirEvidence.Invalid)) |
          ((observation.validity == Validity.Valid) &
             (observation.condition == AirCondition.Clean) &
             (evidence == AirEvidence.Clean)) |
          ((observation.validity == Validity.Valid) &
             (observation.condition == AirCondition.Loaded) &
             (evidence == AirEvidence.FilterDemand));
    }*/

                        
                
                           
                                                                             
             
                         
                                              
                                                                                         
                                                    
                                                                                          
                                                    
                                                                                                  
       
  }
  part def HumidityNeedAssessor :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port observation : DataPort { in :>> type : HumidityObservation; }
    port evidence : DataPort { out :>> type : HumidityEvidence; }

    language "GUMBO" /*{
                
                                                 
                                               

      compute
        guarantee HUMIDITY_EVIDENCE_CLASSIFICATION:
          ((observation.validity == Validity.Invalid) & (evidence == HumidityEvidence.Invalid)) |
          ((observation.validity == Validity.Valid) &
             (observation.condition == HumidityCondition.Dry) &
             (evidence == HumidityEvidence.Dry)) |
          ((observation.validity == Validity.Valid) &
             (observation.condition == HumidityCondition.Acceptable) &
             (evidence == HumidityEvidence.None)) |
          ((observation.validity == Validity.Valid) &
             (observation.condition == HumidityCondition.Damp) &
             (evidence == HumidityEvidence.Damp));
    }*/

                        
                
                           
                                                                                       
             
                         
                                                   
                                                                                              
                                                    
                                                                                                
                                                    
                                                                                                        
                                                    
                                                                                                  
       
  }
  part def SharedPathAuthorityAssessor :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port authority : DataPort { in :>> type : SharedAirPathAuthority; }
    port disposition_to_routine : DataPort { out :>> type : PathDisposition; }
    port disposition_to_composer : DataPort { out :>> type : PathDisposition; }

    language "GUMBO" /*{
                
                                         
                                                                 
                                                                 

      compute
        guarantee PATH_DISPOSITION_CLASSIFICATION:
          (disposition_to_routine == disposition_to_composer) &
          (((authority.validity == Validity.Invalid) &
             (disposition_to_routine == PathDisposition.Untrusted)) |
           ((authority.validity == Validity.Valid) &
             (authority.grant == PathGrant.Reserved) &
             (disposition_to_routine == PathDisposition.Reserved)) |
           ((authority.validity == Validity.Valid) &
             (authority.grant == PathGrant.Granted) &
             (disposition_to_routine == PathDisposition.Usable)));
    }*/

                        
                
                           
                                         
                                                               
                                                               
             
                         
                                                  
                                                             
                                                    
                                                                  
                                                                                          
                                                                 
                                                                                         
                                                               
       
  }
  part def TreatmentCapabilityAssessor :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port readiness : DataPort { in :>> type : AirTreatmentReadiness; }
    port filter_facts : DataPort { out :>> type : FilterCapabilityFacts; }
    port humidity_facts : DataPort { out :>> type : HumidityCapabilityFacts; }
    port blower_fact : DataPort { out :>> type : BlowerCapabilityFact; }
    port capability_set : DataPort { out :>> type : CapabilitySet; }

    language "GUMBO" /*{
                
                                                 
                                                                                           
                                                                                           
                                                                                                   
                                                                                                       
                                                                                             
                                                                                     
                                                                                                   
                                                                                                   
                                                                                                       
                                                                                             

      compute
        guarantee BLOWER_CAPABILITY_CLASSIFICATION:
          ((readiness.validity == Validity.Invalid) &
             (capability_set.sharedBlowerDisposition == ComposerBlowerDisposition.Untrusted)) |
          ((readiness.validity == Validity.Valid) &
             (readiness.blowerReadiness == BlowerReadiness.Ready) &
             (capability_set.sharedBlowerDisposition == ComposerBlowerDisposition.Ready)) |
          ((readiness.validity == Validity.Valid) &
             (readiness.blowerReadiness == BlowerReadiness.Failed) &
             (capability_set.sharedBlowerDisposition == ComposerBlowerDisposition.Failed)) |
          ((readiness.validity == Validity.Valid) &
             (readiness.blowerReadiness == BlowerReadiness.Unknown) &
             (capability_set.sharedBlowerDisposition == ComposerBlowerDisposition.Unknown));
        guarantee FILTER_CAPABILITY_CLASSIFICATION:
          ((readiness.validity == Validity.Invalid) &
             (capability_set.sharedFilterDisposition == ComposerFilterDisposition.Untrusted)) |
          ((readiness.validity == Validity.Valid) &
             (readiness.filterUnit == FilterUnitReadiness.Ready) &
             (capability_set.sharedFilterDisposition == ComposerFilterDisposition.Ready)) |
          ((readiness.validity == Validity.Valid) &
             (readiness.filterUnit == FilterUnitReadiness.Failed) &
             (capability_set.sharedFilterDisposition == ComposerFilterDisposition.Failed)) |
          ((readiness.validity == Validity.Valid) &
             (readiness.filterUnit == FilterUnitReadiness.Unknown) &
             (capability_set.sharedFilterDisposition == ComposerFilterDisposition.Unknown));
        guarantee HUMIDIFIER_CAPABILITY_CLASSIFICATION:
          ((readiness.validity == Validity.Invalid) &
             (capability_set.sharedHumidifierDisposition == ComposerHumidifierDisposition.Untrusted)) |
          ((readiness.validity == Validity.Valid) &
             (readiness.humidifier == HumidifierReadiness.Ready) &
             (capability_set.sharedHumidifierDisposition == ComposerHumidifierDisposition.Ready)) |
          ((readiness.validity == Validity.Valid) &
             (readiness.humidifier == HumidifierReadiness.Failed) &
             (capability_set.sharedHumidifierDisposition == ComposerHumidifierDisposition.Failed)) |
          ((readiness.validity == Validity.Valid) &
             (readiness.humidifier == HumidifierReadiness.Unknown) &
             (capability_set.sharedHumidifierDisposition == ComposerHumidifierDisposition.Unknown));
        guarantee DEHUMIDIFIER_CAPABILITY_CLASSIFICATION:
          ((readiness.validity == Validity.Invalid) &
             (capability_set.sharedDehumidifierDisposition == ComposerDehumidifierDisposition.Untrusted)) |
          ((readiness.validity == Validity.Valid) &
             (readiness.dehumidifier == DehumidifierReadiness.Ready) &
             (capability_set.sharedDehumidifierDisposition == ComposerDehumidifierDisposition.Ready)) |
          ((readiness.validity == Validity.Valid) &
             (readiness.dehumidifier == DehumidifierReadiness.Failed) &
             (capability_set.sharedDehumidifierDisposition == ComposerDehumidifierDisposition.Failed)) |
          ((readiness.validity == Validity.Valid) &
             (readiness.dehumidifier == DehumidifierReadiness.Unknown) &
             (capability_set.sharedDehumidifierDisposition == ComposerDehumidifierDisposition.Unknown));
        guarantee CAPABILITY_FANOUT_COHERENCE:
          ((capability_set.sharedBlowerDisposition == ComposerBlowerDisposition.Ready) &
             (filter_facts.filterBlowerDisposition == FilterBranchBlowerDisposition.Ready) &
             (humidity_facts.humidityBlowerDisposition == HumidityBranchBlowerDisposition.Ready) &
             (blower_fact.routineBlowerDisposition == RoutineBranchBlowerDisposition.Ready)) |
          ((capability_set.sharedBlowerDisposition == ComposerBlowerDisposition.Failed) &
             (filter_facts.filterBlowerDisposition == FilterBranchBlowerDisposition.Failed) &
             (humidity_facts.humidityBlowerDisposition == HumidityBranchBlowerDisposition.Failed) &
             (blower_fact.routineBlowerDisposition == RoutineBranchBlowerDisposition.Failed)) |
          ((capability_set.sharedBlowerDisposition == ComposerBlowerDisposition.Unknown) &
             (filter_facts.filterBlowerDisposition == FilterBranchBlowerDisposition.Unknown) &
             (humidity_facts.humidityBlowerDisposition == HumidityBranchBlowerDisposition.Unknown) &
             (blower_fact.routineBlowerDisposition == RoutineBranchBlowerDisposition.Unknown)) |
          ((capability_set.sharedBlowerDisposition == ComposerBlowerDisposition.Untrusted) &
             (filter_facts.filterBlowerDisposition == FilterBranchBlowerDisposition.Untrusted) &
             (humidity_facts.humidityBlowerDisposition == HumidityBranchBlowerDisposition.Untrusted) &
             (blower_fact.routineBlowerDisposition == RoutineBranchBlowerDisposition.Untrusted));
    }*/

                        
                
                           
                                                 
                                                                                         
                                                                                         
                                                                                                 
                                                                                                     
                                                                                           
                                                                                   
                                                                                                 
                                                                                                 
                                                                                                     
                                                                                           
             
                            
                                              
                                                                                        
                                                                                           
                                                                                         
                                                                                            
                                                                                          
                                                                                             
                                                                                            
                                                                                                
                                                                                        
                                                                                                 
                                                                                         
                                                                                                  
                                                                                          
                                                                                                   
                                                                                            
                                                                                                      
                                                                                        
                                                                                            
                                                                                         
                                                                                             
                                                                                          
                                                                                              
                                                                                            
                                                                                                 
                                                                                        
                                                                                   
                                                                                         
                                                                                    
                                                                                          
                                                                                     
                                                                                            
                                                                                        
                                                                                                
                                                                                                 
                                                                                                 
                                                                                                  
                                                                                                  
                                                                                                   
                                                                                                    
                                                                                                      
                                                                                                    
                                                                                                     
                                                                                                     
                                                                                                      
                                                                                                      
                                                                                                       
                                                                                                        
                                                                                                          
                            
                                                   
                                                    
                                                                                            
                                                                                                       
                                                                                        
                                                                                                        
                                                                                         
                                                                                                         
                                                                                          
                            
                                                   
                                                    
                                                                                            
                                                                                                      
                                                                                        
                                                                                                       
                                                                                         
                                                                                                        
                                                                                          
                            
                                                       
                                                    
                                                                                                    
                                                                                                      
                                                                                                
                                                                                                       
                                                                                                 
                                                                                                        
                                                                                                  
                            
                                                         
                                                    
                                                                                                        
                                                                                                          
                                                                                                    
                                                                                                           
                                                                                                     
                                                                                                            
                                                                                                      
       
  }
  part def AirEvidenceRecoveryOwner :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port evidence : DataPort { in :>> type : AirEvidence; }
    port report_to_filter : DataPort { out :>> type : AirRecoveryReport; }
    port report_to_status : DataPort { out :>> type : AirRecoveryReport; }

    language "GUMBO" /*{
      state
        airTrustMemory: TrustState;

                
                                         
                                                  
                                                          
                                                                            
                                                            
                                            
                                                              
                                                                                  
                                                                    
                                                                   

      compute
        guarantee AIR_REPORT_FANOUT:
          (report_to_filter.trust == airTrustMemory) &
          (report_to_filter.evidence == evidence) &
          (report_to_status.trust == report_to_filter.trust) &
          (report_to_status.transitionEvent == report_to_filter.transitionEvent) &
          (report_to_status.evidence == report_to_filter.evidence) &
          (report_to_status.gateOpen == report_to_filter.gateOpen);
        compute_cases
          case CASE_05_AIR_FAULT_ENTERED:
            assume (airTrustMemory == TrustState.Trusted) & (evidence == AirEvidence.Invalid);
            guarantee (airTrustMemory == TrustState.Quarantined) &
              (report_to_filter.gateOpen == F) &
              (report_to_filter.transitionEvent == AirRecoveryEvent.AirFaultEntered);
          case CASE_06_AIR_STABLE:
            assume (airTrustMemory == TrustState.Trusted) & (evidence != AirEvidence.Invalid);
            guarantee (airTrustMemory == TrustState.Trusted) &
              (report_to_filter.gateOpen == T) &
              (report_to_filter.transitionEvent == AirRecoveryEvent.AirStable);
          case CASE_07_AIR_FAULT_PERSISTS:
            assume (airTrustMemory == TrustState.Quarantined) & (evidence == AirEvidence.Invalid);
            guarantee (airTrustMemory == TrustState.Quarantined) &
              (report_to_filter.gateOpen == F) &
              (report_to_filter.transitionEvent == AirRecoveryEvent.AirFaultPersists);
          case CASE_08_AIR_RECOVERY_STARTED:
            assume (airTrustMemory == TrustState.Quarantined) & (evidence != AirEvidence.Invalid);
            guarantee (airTrustMemory == TrustState.Confirming) &
              (report_to_filter.gateOpen == F) &
              (report_to_filter.transitionEvent == AirRecoveryEvent.AirRecoveryStarted);
          case CASE_09_AIR_FAULT_RECURRED:
            assume (airTrustMemory == TrustState.Confirming) & (evidence == AirEvidence.Invalid);
            guarantee (airTrustMemory == TrustState.Quarantined) &
              (report_to_filter.gateOpen == F) &
              (report_to_filter.transitionEvent == AirRecoveryEvent.AirFaultRecurred);
          case CASE_10_AIR_RECOVERED:
            assume (airTrustMemory == TrustState.Confirming) & (evidence != AirEvidence.Invalid);
            guarantee (airTrustMemory == TrustState.Trusted) &
              (report_to_filter.gateOpen == T) &
              (report_to_filter.transitionEvent == AirRecoveryEvent.AirRecovered);
    }*/

                        
           
                         
                                   
                
                                
                           
                                         
                                                
                                                        
                                                                          
                                                          
                                          
                                                            
                                                                                
                                                                  
                                                                 
             
                                
                         
                                    
                                                    
                                                 
                                                            
                                                                                
                                                                  
                                                                 
                     
                           
                                         
                                                                                              
                                                                
                                              
                                                                                   
                           
                                  
                                                                                              
                                                            
                                              
                                                                             
                           
                                          
                                                                                                  
                                                                
                                              
                                                                                    
                           
                                            
                                                                                                  
                                                               
                                              
                                                                                      
                           
                                          
                                                                                                 
                                                                
                                              
                                                                                    
                           
                                     
                                                                                                 
                                                            
                                              
                                                                                
       
  }
  part def HumidityEvidenceRecoveryOwner :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port evidence : DataPort { in :>> type : HumidityEvidence; }
    port report_to_humidity : DataPort { out :>> type : HumidityRecoveryReport; }
    port report_to_status : DataPort { out :>> type : HumidityRecoveryReport; }

    language "GUMBO" /*{
      state
        humidityTrustMemory: TrustState;

                
                                              
                                                       
                                                            
                                                                                        
                                                                  
                                              
                                                                
                                                                                    
                                                                      
                                                                     

      compute
        guarantee HUMIDITY_REPORT_FANOUT:
          (report_to_humidity.trust == humidityTrustMemory) &
          (report_to_humidity.evidence == evidence) &
          (report_to_status.trust == report_to_humidity.trust) &
          (report_to_status.transitionEvent == report_to_humidity.transitionEvent) &
          (report_to_status.evidence == report_to_humidity.evidence) &
          (report_to_status.gateOpen == report_to_humidity.gateOpen);
        compute_cases
          case CASE_11_HUMIDITY_FAULT_ENTERED:
            assume (humidityTrustMemory == TrustState.Trusted) & (evidence == HumidityEvidence.Invalid);
            guarantee (humidityTrustMemory == TrustState.Quarantined) &
              (report_to_humidity.gateOpen == F) &
              (report_to_humidity.transitionEvent == HumidityRecoveryEvent.HumidityFaultEntered);
          case CASE_12_HUMIDITY_STABLE:
            assume (humidityTrustMemory == TrustState.Trusted) & (evidence != HumidityEvidence.Invalid);
            guarantee (humidityTrustMemory == TrustState.Trusted) &
              (report_to_humidity.gateOpen == T) &
              (report_to_humidity.transitionEvent == HumidityRecoveryEvent.HumidityStable);
          case CASE_13_HUMIDITY_FAULT_PERSISTS:
            assume (humidityTrustMemory == TrustState.Quarantined) & (evidence == HumidityEvidence.Invalid);
            guarantee (humidityTrustMemory == TrustState.Quarantined) &
              (report_to_humidity.gateOpen == F) &
              (report_to_humidity.transitionEvent == HumidityRecoveryEvent.HumidityFaultPersists);
          case CASE_14_HUMIDITY_RECOVERY_STARTED:
            assume (humidityTrustMemory == TrustState.Quarantined) & (evidence != HumidityEvidence.Invalid);
            guarantee (humidityTrustMemory == TrustState.Confirming) &
              (report_to_humidity.gateOpen == F) &
              (report_to_humidity.transitionEvent == HumidityRecoveryEvent.HumidityRecoveryStarted);
          case CASE_15_HUMIDITY_FAULT_RECURRED:
            assume (humidityTrustMemory == TrustState.Confirming) & (evidence == HumidityEvidence.Invalid);
            guarantee (humidityTrustMemory == TrustState.Quarantined) &
              (report_to_humidity.gateOpen == F) &
              (report_to_humidity.transitionEvent == HumidityRecoveryEvent.HumidityFaultRecurred);
          case CASE_16_HUMIDITY_RECOVERED:
            assume (humidityTrustMemory == TrustState.Confirming) & (evidence != HumidityEvidence.Invalid);
            guarantee (humidityTrustMemory == TrustState.Trusted) &
              (report_to_humidity.gateOpen == T) &
              (report_to_humidity.transitionEvent == HumidityRecoveryEvent.HumidityRecovered);
    }*/

                        
           
                         
                                        
                
                                     
                           
                                              
                                                     
                                                          
                                                                                      
                                                                
                                            
                                                              
                                                                                  
                                                                    
                                                                   
             
                                     
                         
                                         
                                                           
                                                   
                                                              
                                                                                  
                                                                    
                                                                   
                     
                           
                                              
                                                                                                        
                                                                     
                                                
                                                                                               
                           
                                       
                                                                                                        
                                                                 
                                                
                                                                                         
                           
                                               
                                                                                                            
                                                                     
                                                
                                                                                                
                           
                                                 
                                                                                                            
                                                                    
                                                
                                                                                                  
                           
                                               
                                                                                                           
                                                                     
                                                
                                                                                                
                           
                                          
                                                                                                           
                                                                 
                                                
                                                                                            
       
  }
  part def PreferenceSessionOwner :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port candidate : DataPort { in :>> type : QualifiedPreferenceCandidate; }
    port accepted_to_filter : DataPort { out :>> type : AcceptedPreference; }
    port accepted_to_humidity : DataPort { out :>> type : AcceptedPreference; }
    port accepted_to_routine : DataPort { out :>> type : AcceptedPreference; }
    port accepted_to_arbiter : DataPort { out :>> type : AcceptedPreference; }
    port accepted_to_status : DataPort { out :>> type : AcceptedPreference; }

    language "GUMBO" /*{
      state
        acceptedEnableMemory: EnableChoice;
        acceptedFilterPolicyMemory: FilterPolicy;
        acceptedHumidityPolicyMemory: HumidityPolicy;
        acceptedRoutineAirflowMemory: RoutineAirflow;

                
                                                       
                                                      
                                                                  
                                                                     
                                                                
                                                           
                                                                       
                                                                          
                                                                     
                                                                                    
                                                        
                                                       
                                                       
                                                     

      compute
        guarantee ACCEPTED_PREFERENCE_FANOUT:
          (accepted_to_filter.enable == acceptedEnableMemory) &
          (accepted_to_filter.filterPolicy == acceptedFilterPolicyMemory) &
          (accepted_to_filter.humidityPolicy == acceptedHumidityPolicyMemory) &
          (accepted_to_filter.routineAirflow == acceptedRoutineAirflowMemory) &
          (accepted_to_humidity == accepted_to_filter) &
          (accepted_to_routine == accepted_to_filter) &
          (accepted_to_arbiter == accepted_to_filter) &
          (accepted_to_status == accepted_to_filter);
        compute_cases
          case CASE_01_REJECT_INVALID:
            assume candidate.candidateClass == CandidateClass.Invalid;
            guarantee accepted_to_filter.preferenceEvent == PreferenceEvent.RejectedInvalid;
          case CASE_02_RETAIN_HELD:
            assume candidate.candidateClass == CandidateClass.Held;
            guarantee accepted_to_filter.preferenceEvent == PreferenceEvent.NoNewPreference;
          case CASE_03_ACCEPT_DISABLED:
            assume candidate.candidateClass == CandidateClass.FreshDisabled;
            guarantee (acceptedEnableMemory == candidate.enable) &
              (acceptedFilterPolicyMemory == candidate.filterPolicy) &
              (acceptedHumidityPolicyMemory == candidate.humidityPolicy) &
              (acceptedRoutineAirflowMemory == candidate.routineAirflow) &
              (accepted_to_filter.preferenceEvent == PreferenceEvent.AcceptedDisabled);
          case CASE_04_ACCEPT_ENABLED:
            assume candidate.candidateClass == CandidateClass.FreshEnabled;
            guarantee (acceptedEnableMemory == candidate.enable) &
              (acceptedFilterPolicyMemory == candidate.filterPolicy) &
              (acceptedHumidityPolicyMemory == candidate.humidityPolicy) &
              (acceptedRoutineAirflowMemory == candidate.routineAirflow) &
              (accepted_to_filter.preferenceEvent == PreferenceEvent.AcceptedEnabled);
    }*/

                        
           
                         
                                           
                         
                                                 
                         
                                                     
                         
                                                     
                
                                                                  
                                                                     
                           
                                                       
                                                    
                                                                
                                                                   
                                                              
                                                         
                                                                     
                                                                        
                                                                   
                                                                                  
                                                                    
                                                                                
                                                                                    
                                                                                    
                                                                                      
                                                                   
                                                                               
                                                                                   
                                                                                   
                                                                                     
                                                                   
                                                                               
                                                                                   
                                                                                   
                                                                                     
                                                                  
                                                                              
                                                                                  
                                                                                  
                                                                                   
             
                                                                  
                                                                     
                         
                                             
                                                             
                                                                         
                                                                             
                                                                             
                                                                    
                                                                                
                                                                                    
                                                                                    
                                                                                      
                                                                   
                                                                               
                                                                                   
                                                                                   
                                                                                     
                                                                   
                                                                               
                                                                                   
                                                                                   
                                                                                     
                                                                  
                                                                              
                                                                                  
                                                                                  
                                                                                   
                     
                           
                                      
                                                                      
                                                                        
                                                                            
                                                                                
                                                                                
                                                                                    
                           
                                   
                                                                   
                                                                        
                                                                            
                                                                                
                                                                                
                                                                                    
                           
                                       
                                                                            
                                                                
                                                                    
                                                                        
                                                                        
                                                                                     
                           
                                      
                                                                           
                                                                
                                                                    
                                                                        
                                                                        
                                                                                    
       
  }
  part def FiltrationProposalOwner :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port air_report : DataPort { in :>> type : AirRecoveryReport; }
    port accepted : DataPort { in :>> type : AcceptedPreference; }
    port capabilities : DataPort { in :>> type : FilterCapabilityFacts; }
    port proposal : DataPort { out :>> type : FilterProposalReport; }

    language "GUMBO" /*{
                
                                               
                                                      
                                               

      compute
        guarantee FILTER_PROPOSAL_TOTAL_RELATION:
          ((accepted.enable == EnableChoice.Off) &
             (proposal.proposal == FilterProposal.None) & (proposal.cause == StatusCause.None)) |
          ((accepted.enable == EnableChoice.On) &
             ((air_report.gateOpen == F) | (air_report.evidence == AirEvidence.Invalid)) &
             (proposal.proposal == FilterProposal.None) & (proposal.cause == StatusCause.None)) |
          ((accepted.enable == EnableChoice.On) & (air_report.gateOpen == T) &
             (air_report.evidence == AirEvidence.Clean) &
             (accepted.filterPolicy == FilterPolicy.Automatic) &
             (proposal.proposal == FilterProposal.None) & (proposal.cause == StatusCause.None)) |
          ((accepted.enable == EnableChoice.On) & (air_report.gateOpen == T) &
             (air_report.evidence != AirEvidence.Invalid) &
             ((accepted.filterPolicy == FilterPolicy.Continuous) |
              (air_report.evidence == AirEvidence.FilterDemand)) &
             (capabilities.filterBlowerDisposition != FilterBranchBlowerDisposition.Ready) &
             (proposal.proposal == FilterProposal.Unavailable) &
             (proposal.cause == StatusCause.EquipmentUnavailable)) |
          ((accepted.enable == EnableChoice.On) & (air_report.gateOpen == T) &
             (air_report.evidence != AirEvidence.Invalid) &
             ((accepted.filterPolicy == FilterPolicy.Continuous) |
              (air_report.evidence == AirEvidence.FilterDemand)) &
             (capabilities.filterBlowerDisposition == FilterBranchBlowerDisposition.Ready) &
             (capabilities.filterDisposition != FilterBranchPathDisposition.Ready) &
             (proposal.proposal == FilterProposal.Unavailable) &
             (proposal.cause == StatusCause.SelectedPathUnavailable)) |
          ((accepted.enable == EnableChoice.On) & (air_report.gateOpen == T) &
             (air_report.evidence == AirEvidence.FilterDemand) &
             (accepted.filterPolicy == FilterPolicy.Automatic) &
             (capabilities.filterBlowerDisposition == FilterBranchBlowerDisposition.Ready) &
             (capabilities.filterDisposition == FilterBranchPathDisposition.Ready) &
             (proposal.proposal == FilterProposal.Environmental) &
             (proposal.cause == StatusCause.None)) |
          ((accepted.enable == EnableChoice.On) & (air_report.gateOpen == T) &
             (air_report.evidence != AirEvidence.Invalid) &
             (accepted.filterPolicy == FilterPolicy.Continuous) &
             (capabilities.filterBlowerDisposition == FilterBranchBlowerDisposition.Ready) &
             (capabilities.filterDisposition == FilterBranchPathDisposition.Ready) &
             (proposal.proposal == FilterProposal.Continuous) &
             (proposal.cause == StatusCause.None));
    }*/

                        
                
                           
                                               
                                                                                        
             
                                
                                                 
                                                 
                                                                                            
                                                
                                                                                     
                                                                                            
                                                                           
                                                      
                                                             
                                                                                            
                                                                           
                                                        
                                                               
                                                               
                                                                                         
                                                             
                                                                 
                                                                           
                                                        
                                                               
                                                               
                                                                                         
                                                                                 
                                                             
                                                                    
                                                                           
                                                             
                                                             
                                                                                         
                                                                                 
                                                                                                     
                                                                           
                                                        
                                                              
                                                                                         
                                                                                 
                                                                                                  
       
  }
  part def HumidityProposalOwner :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port humidity_report : DataPort { in :>> type : HumidityRecoveryReport; }
    port accepted : DataPort { in :>> type : AcceptedPreference; }
    port capabilities : DataPort { in :>> type : HumidityCapabilityFacts; }
    port proposal : DataPort { out :>> type : HumidityProposalReport; }

    language "GUMBO" /*{
                
                                                 
                                                        
                                               

      compute
        guarantee HUMIDITY_PROPOSAL_TOTAL_RELATION:
          (((accepted.enable == EnableChoice.Off) |
            (accepted.humidityPolicy == HumidityPolicy.Disabled)) &
             (proposal.proposal == HumidityProposal.None) & (proposal.cause == StatusCause.None)) |
          ((accepted.enable == EnableChoice.On) &
             (accepted.humidityPolicy == HumidityPolicy.Automatic) &
             ((humidity_report.gateOpen == F) |
              (humidity_report.evidence == HumidityEvidence.Invalid)) &
             (proposal.proposal == HumidityProposal.None) & (proposal.cause == StatusCause.None)) |
          ((accepted.enable == EnableChoice.On) &
             (accepted.humidityPolicy == HumidityPolicy.Automatic) &
             (humidity_report.gateOpen == T) &
             (humidity_report.evidence == HumidityEvidence.None) &
             (proposal.proposal == HumidityProposal.None) & (proposal.cause == StatusCause.None)) |
          ((accepted.enable == EnableChoice.On) &
             (accepted.humidityPolicy == HumidityPolicy.Automatic) &
             (humidity_report.gateOpen == T) &
             ((humidity_report.evidence == HumidityEvidence.Dry) |
              (humidity_report.evidence == HumidityEvidence.Damp)) &
             (capabilities.humidityBlowerDisposition != HumidityBranchBlowerDisposition.Ready) &
             (proposal.proposal == HumidityProposal.Unavailable) &
             (proposal.cause == StatusCause.EquipmentUnavailable)) |
          ((accepted.enable == EnableChoice.On) &
             (accepted.humidityPolicy == HumidityPolicy.Automatic) &
             (humidity_report.gateOpen == T) &
             (humidity_report.evidence == HumidityEvidence.Dry) &
             (capabilities.humidityBlowerDisposition == HumidityBranchBlowerDisposition.Ready) &
             (capabilities.humidifierDisposition != HumidityBranchHumidifierDisposition.Ready) &
             (proposal.proposal == HumidityProposal.Unavailable) &
             (proposal.cause == StatusCause.SelectedPathUnavailable)) |
          ((accepted.enable == EnableChoice.On) &
             (accepted.humidityPolicy == HumidityPolicy.Automatic) &
             (humidity_report.gateOpen == T) &
             (humidity_report.evidence == HumidityEvidence.Damp) &
             (capabilities.humidityBlowerDisposition == HumidityBranchBlowerDisposition.Ready) &
             (capabilities.dehumidifierDisposition != HumidityBranchDehumidifierDisposition.Ready) &
             (proposal.proposal == HumidityProposal.Unavailable) &
             (proposal.cause == StatusCause.SelectedPathUnavailable)) |
          ((accepted.enable == EnableChoice.On) &
             (accepted.humidityPolicy == HumidityPolicy.Automatic) &
             (humidity_report.gateOpen == T) &
             (humidity_report.evidence == HumidityEvidence.Dry) &
             (capabilities.humidityBlowerDisposition == HumidityBranchBlowerDisposition.Ready) &
             (capabilities.humidifierDisposition == HumidityBranchHumidifierDisposition.Ready) &
             (proposal.proposal == HumidityProposal.Increase) & (proposal.cause == StatusCause.None)) |
          ((accepted.enable == EnableChoice.On) &
             (accepted.humidityPolicy == HumidityPolicy.Automatic) &
             (humidity_report.gateOpen == T) &
             (humidity_report.evidence == HumidityEvidence.Damp) &
             (capabilities.humidityBlowerDisposition == HumidityBranchBlowerDisposition.Ready) &
             (capabilities.dehumidifierDisposition == HumidityBranchDehumidifierDisposition.Ready) &
             (proposal.proposal == HumidityProposal.Reduce) & (proposal.cause == StatusCause.None));
    }*/

                        
                
                           
                                                 
                                                                                          
             
                               
                                                   
                                                  
                                                                  
                                                                                              
                                                
                                                                 
                                            
                                                                    
                                                                                              
                                                
                                                                 
                                           
                                                               
                                                                                              
                                                
                                                                 
                                           
                                                               
                                                                 
                                                                                             
                                                               
                                                                 
                                                
                                                                 
                                           
                                                              
                                                                                             
                                                                                             
                                                               
                                                                    
                                                
                                                                 
                                           
                                                               
                                                                                             
                                                                                                 
                                                               
                                                                    
                                                
                                                                 
                                           
                                                              
                                                                                             
                                                                                             
                                                                                                  
                                                
                                                                 
                                           
                                                               
                                                                                             
                                                                                                 
                                                                                                
       
  }
  part def RoutineAirflowProposalOwner :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port accepted : DataPort { in :>> type : AcceptedPreference; }
    port path : DataPort { in :>> type : PathDisposition; }
    port capability : DataPort { in :>> type : BlowerCapabilityFact; }
    port proposal : DataPort { out :>> type : RoutineProposalReport; }

    language "GUMBO" /*{
                
                                                
                                                                                             

      compute
        guarantee ROUTINE_PROPOSAL_TOTAL_RELATION:
          ((accepted.enable == EnableChoice.Off) &
             (proposal.proposal == RoutineProposal.None) & (proposal.cause == StatusCause.None)) |
          ((accepted.enable == EnableChoice.On) & (accepted.routineAirflow == RoutineAirflow.Off) &
             (proposal.proposal == RoutineProposal.None) & (proposal.cause == StatusCause.None)) |
          ((accepted.enable == EnableChoice.On) & (accepted.routineAirflow != RoutineAirflow.Off) &
             (path == PathDisposition.Untrusted) &
             (proposal.proposal == RoutineProposal.Unavailable) &
             (proposal.cause == StatusCause.AuthorityInvalid)) |
          ((accepted.enable == EnableChoice.On) & (accepted.routineAirflow != RoutineAirflow.Off) &
             (path == PathDisposition.Reserved) &
             (proposal.proposal == RoutineProposal.Unavailable) &
             (proposal.cause == StatusCause.AirPathReserved)) |
          ((accepted.enable == EnableChoice.On) & (accepted.routineAirflow != RoutineAirflow.Off) &
             (path == PathDisposition.Usable) &
             (capability.routineBlowerDisposition != RoutineBranchBlowerDisposition.Ready) &
             (proposal.proposal == RoutineProposal.Unavailable) &
             (proposal.cause == StatusCause.EquipmentUnavailable)) |
          ((accepted.enable == EnableChoice.On) & (accepted.routineAirflow == RoutineAirflow.Low) &
             (path == PathDisposition.Usable) &
             (capability.routineBlowerDisposition == RoutineBranchBlowerDisposition.Ready) &
             (proposal.proposal == RoutineProposal.Low) & (proposal.cause == StatusCause.None)) |
          ((accepted.enable == EnableChoice.On) & (accepted.routineAirflow == RoutineAirflow.High) &
             (path == PathDisposition.Usable) &
             (capability.routineBlowerDisposition == RoutineBranchBlowerDisposition.Ready) &
             (proposal.proposal == RoutineProposal.High) & (proposal.cause == StatusCause.None));
    }*/

                        
                
                           
                                                
                                                                                         
             
                                 
                                                  
                                                 
                                                                                             
                                                                                                
                                                                                             
                                                                                                
                                               
                                                              
                                                             
                                                                                                
                                              
                                                              
                                                            
                                                                                                
                                            
                                                                                         
                                                              
                                                                 
                                                                                                
                                                                                                                          
                                                                                            
                                                                                                 
                                                                                                                          
                                                                                             
       
  }
  part def CabinAirPriorityArbiter :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port accepted : DataPort { in :>> type : AcceptedPreference; }
    port filter_proposal : DataPort { in :>> type : FilterProposalReport; }
    port humidity_proposal : DataPort { in :>> type : HumidityProposalReport; }
    port routine_proposal : DataPort { in :>> type : RoutineProposalReport; }
    port selection_to_composer : DataPort { out :>> type : SelectionReport; }
    port selection_to_status : DataPort { out :>> type : SelectionReport; }

    language "GUMBO" /*{
                
                                         
                                                                 
                                                              
                                                                           
                                                         

      compute
        guarantee SELECTION_FANOUT: selection_to_status == selection_to_composer;
        compute_cases
          case CASE_17_DISABLED_PRIORITY:
            assume accepted.enable == EnableChoice.Off;
            guarantee (selection_to_composer.intent == SelectedIntent.None) &
              (selection_to_composer.flowClass == FlowClass.Off) &
              (selection_to_composer.cause == StatusCause.PreferenceDisabled);
          case CASE_18_FILTER_PRIORITY:
            assume (accepted.enable == EnableChoice.On) &
              ((filter_proposal.proposal == FilterProposal.Environmental) |
               (filter_proposal.proposal == FilterProposal.Continuous));
            guarantee (selection_to_composer.intent == SelectedIntent.Filter) &
              (selection_to_composer.flowClass == FlowClass.Treatment) &
              (selection_to_composer.cause == StatusCause.AirTreatmentPriority);
          case CASE_19_REDUCE_PRIORITY:
            assume (accepted.enable == EnableChoice.On) &
              ((filter_proposal.proposal == FilterProposal.None) |
               (filter_proposal.proposal == FilterProposal.Unavailable)) &
              (humidity_proposal.proposal == HumidityProposal.Reduce);
            guarantee (selection_to_composer.intent == SelectedIntent.Reduce) &
              (selection_to_composer.flowClass == FlowClass.Treatment) &
              (selection_to_composer.cause == StatusCause.HumidityTreatmentPriority);
          case CASE_20_INCREASE_PRIORITY:
            assume (accepted.enable == EnableChoice.On) &
              ((filter_proposal.proposal == FilterProposal.None) |
               (filter_proposal.proposal == FilterProposal.Unavailable)) &
              (humidity_proposal.proposal == HumidityProposal.Increase);
            guarantee (selection_to_composer.intent == SelectedIntent.Increase) &
              (selection_to_composer.flowClass == FlowClass.Treatment) &
              (selection_to_composer.cause == StatusCause.HumidityTreatmentPriority);
          case CASE_21_ROUTINE_PRIORITY:
            assume (accepted.enable == EnableChoice.On) &
              ((filter_proposal.proposal == FilterProposal.None) |
               (filter_proposal.proposal == FilterProposal.Unavailable)) &
              ((humidity_proposal.proposal == HumidityProposal.None) |
               (humidity_proposal.proposal == HumidityProposal.Unavailable)) &
              ((routine_proposal.proposal == RoutineProposal.Low) |
               (routine_proposal.proposal == RoutineProposal.High));
            guarantee (selection_to_composer.intent == SelectedIntent.ExchangeAir) &
              (selection_to_composer.flowClass == FlowClass.Routine) &
              (selection_to_composer.cause == StatusCause.None);
          case CASE_22_NO_SELECTION_CAUSE:
            assume (accepted.enable == EnableChoice.On) &
              ((filter_proposal.proposal == FilterProposal.None) |
               (filter_proposal.proposal == FilterProposal.Unavailable)) &
              ((humidity_proposal.proposal == HumidityProposal.None) |
               (humidity_proposal.proposal == HumidityProposal.Unavailable)) &
              ((routine_proposal.proposal == RoutineProposal.None) |
               (routine_proposal.proposal == RoutineProposal.Unavailable));
            guarantee (selection_to_composer.intent == SelectedIntent.None) &
              (selection_to_composer.flowClass == FlowClass.Off) &
              (
                (((filter_proposal.cause == StatusCause.AuthorityInvalid) |
                  (humidity_proposal.cause == StatusCause.AuthorityInvalid) |
                  (routine_proposal.cause == StatusCause.AuthorityInvalid)) &
                 (selection_to_composer.cause == StatusCause.AuthorityInvalid)) |
                ((filter_proposal.cause != StatusCause.AuthorityInvalid) &
                 (humidity_proposal.cause != StatusCause.AuthorityInvalid) &
                 (routine_proposal.cause != StatusCause.AuthorityInvalid) &
                 ((filter_proposal.cause == StatusCause.AirPathReserved) |
                  (humidity_proposal.cause == StatusCause.AirPathReserved) |
                  (routine_proposal.cause == StatusCause.AirPathReserved)) &
                 (selection_to_composer.cause == StatusCause.AirPathReserved)) |
                ((filter_proposal.cause != StatusCause.AuthorityInvalid) &
                 (humidity_proposal.cause != StatusCause.AuthorityInvalid) &
                 (routine_proposal.cause != StatusCause.AuthorityInvalid) &
                 (filter_proposal.cause != StatusCause.AirPathReserved) &
                 (humidity_proposal.cause != StatusCause.AirPathReserved) &
                 (routine_proposal.cause != StatusCause.AirPathReserved) &
                 ((filter_proposal.cause == StatusCause.EquipmentUnavailable) |
                  (humidity_proposal.cause == StatusCause.EquipmentUnavailable) |
                  (routine_proposal.cause == StatusCause.EquipmentUnavailable)) &
                 (selection_to_composer.cause == StatusCause.EquipmentUnavailable)) |
                ((filter_proposal.cause != StatusCause.AuthorityInvalid) &
                 (humidity_proposal.cause != StatusCause.AuthorityInvalid) &
                 (routine_proposal.cause != StatusCause.AuthorityInvalid) &
                 (filter_proposal.cause != StatusCause.AirPathReserved) &
                 (humidity_proposal.cause != StatusCause.AirPathReserved) &
                 (routine_proposal.cause != StatusCause.AirPathReserved) &
                 (filter_proposal.cause != StatusCause.EquipmentUnavailable) &
                 (humidity_proposal.cause != StatusCause.EquipmentUnavailable) &
                 (routine_proposal.cause != StatusCause.EquipmentUnavailable) &
                 ((filter_proposal.cause == StatusCause.SelectedPathUnavailable) |
                  (humidity_proposal.cause == StatusCause.SelectedPathUnavailable) |
                  (routine_proposal.cause == StatusCause.SelectedPathUnavailable)) &
                 (selection_to_composer.cause == StatusCause.SelectedPathUnavailable)) |
                ((filter_proposal.cause == StatusCause.None) &
                 (humidity_proposal.cause == StatusCause.None) &
                 (routine_proposal.cause == StatusCause.None) &
                 (selection_to_composer.cause == StatusCause.None))
              );
    }*/

                        
                
                           
                                         
                                                               
                                                            
                                                                         
                                                                      
                                                                            
                                                                   
             
                        
                                   
                                                                      
                                                                            
                                                                   
                     
                           
                                         
                                                       
                                                                           
                                                                
                                                                            
                           
                                       
                                                       
                                                                         
                                                                      
                                                                             
                                                                      
                                                                              
                           
                                       
                                                       
                                                                
                                                                        
                                                                    
                                                                             
                                                                      
                                                                                   
                           
                                         
                                                       
                                                                
                                                                        
                                                                      
                                                                               
                                                                      
                                                                                   
                           
                                        
                                                       
                                                                
                                                                        
                                                                    
                                                                            
                                                                 
                                                                  
                                                                                  
                                                               
                                                                  
                                                                       
                                                                   
                                                                       
                           
                                          
                                                       
                                                                
                                                                        
                                                                    
                                                                            
                                                                  
                                                                         
                                                                           
                                                                
                                                                        
                                                                          
                                                                          
                                                                              
                                                                       
                                                                         
                                                                        
                                                                       
                                                                         
                                                                         
                                                                             
                                                                       
                                                                         
                                                                        
                                                                      
                                                                        
                                                                       
                                                                            
                                                                              
                                                                              
                                                                                  
                                                                       
                                                                         
                                                                        
                                                                      
                                                                        
                                                                       
                                                                           
                                                                             
                                                                            
                                                                               
                                                                                 
                                                                                 
                                                                                     
                                                           
                                                             
                                                            
                                                                  
       
  }
  part def AuthoritySafePlanComposer :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port selection : DataPort { in :>> type : SelectionReport; }
    port path : DataPort { in :>> type : PathDisposition; }
    port capabilities : DataPort { in :>> type : CapabilitySet; }
    port composition_to_status : DataPort { out :>> type : CompositionReport; }
    port treatment_plan : DataPort { out :>> type : CabinAirTreatmentPlan; }

    language "GUMBO" /*{
                
                                       
                                                                           
                                                              
                                                                     
                                                                           
                                                                    
                                                       
                                                             

      compute
        guarantee PLAN_DELIVERY_COHERENCE:
          (treatment_plan.treatmentAction == composition_to_status.treatmentAction) &
          (treatment_plan.flowClass == composition_to_status.flowClass) &
          (treatment_plan.authorityUse == composition_to_status.authorityUse);
        guarantee PLAN_SHAPE_COHERENCE:
          ((composition_to_status.treatmentAction == TreatmentAction.None) &
             (composition_to_status.flowClass == FlowClass.Off) &
             (composition_to_status.authorityUse == AuthorityUse.None)) |
          ((composition_to_status.treatmentAction != TreatmentAction.None) &
             (composition_to_status.flowClass != FlowClass.Off) &
             (composition_to_status.authorityUse == AuthorityUse.SharedAirPath));
        compute_cases
          case CASE_23_NONE_ALL_OFF:
            assume selection.intent == SelectedIntent.None;
            guarantee (composition_to_status.treatmentAction == TreatmentAction.None) &
              (composition_to_status.flowClass == FlowClass.Off) &
              (composition_to_status.authorityUse == AuthorityUse.None) &
              (composition_to_status.cause == selection.cause);
          case CASE_24_UNTRUSTED_AUTHORITY:
            assume (selection.intent != SelectedIntent.None) & (path == PathDisposition.Untrusted);
            guarantee (composition_to_status.treatmentAction == TreatmentAction.None) &
              (composition_to_status.flowClass == FlowClass.Off) &
              (composition_to_status.authorityUse == AuthorityUse.None) &
              (composition_to_status.cause == StatusCause.AuthorityInvalid);
          case CASE_25_RESERVED_AUTHORITY:
            assume (selection.intent != SelectedIntent.None) & (path == PathDisposition.Reserved);
            guarantee (composition_to_status.treatmentAction == TreatmentAction.None) &
              (composition_to_status.flowClass == FlowClass.Off) &
              (composition_to_status.authorityUse == AuthorityUse.None) &
              (composition_to_status.cause == StatusCause.AirPathReserved);
          case CASE_26_BLOWER_UNAVAILABLE:
            assume (selection.intent != SelectedIntent.None) & (path == PathDisposition.Usable) &
              (capabilities.sharedBlowerDisposition != ComposerBlowerDisposition.Ready);
            guarantee (composition_to_status.treatmentAction == TreatmentAction.None) &
              (composition_to_status.flowClass == FlowClass.Off) &
              (composition_to_status.authorityUse == AuthorityUse.None) &
              (composition_to_status.cause == StatusCause.EquipmentUnavailable);
          case CASE_27_FILTER_COMPOSITION:
            assume (selection.intent == SelectedIntent.Filter) & (path == PathDisposition.Usable) &
              (capabilities.sharedBlowerDisposition == ComposerBlowerDisposition.Ready);
            guarantee ((capabilities.sharedFilterDisposition == ComposerFilterDisposition.Ready) &
              (composition_to_status.treatmentAction == TreatmentAction.FilterAir) &
              (composition_to_status.flowClass == FlowClass.Treatment) &
              (composition_to_status.authorityUse == AuthorityUse.SharedAirPath) &
              (composition_to_status.cause == selection.cause)) |
              ((capabilities.sharedFilterDisposition != ComposerFilterDisposition.Ready) &
               (composition_to_status.treatmentAction == TreatmentAction.None) &
               (composition_to_status.flowClass == FlowClass.Off) &
               (composition_to_status.authorityUse == AuthorityUse.None) &
               (composition_to_status.cause == StatusCause.SelectedPathUnavailable));
          case CASE_28_HUMIDITY_COMPOSITION:
            assume ((selection.intent == SelectedIntent.Increase) |
              (selection.intent == SelectedIntent.Reduce)) & (path == PathDisposition.Usable) &
              (capabilities.sharedBlowerDisposition == ComposerBlowerDisposition.Ready);
            guarantee ((selection.intent == SelectedIntent.Increase) &
              (capabilities.sharedHumidifierDisposition == ComposerHumidifierDisposition.Ready) &
              (composition_to_status.treatmentAction == TreatmentAction.IncreaseHumidity) &
              (composition_to_status.flowClass == FlowClass.Treatment) &
              (composition_to_status.authorityUse == AuthorityUse.SharedAirPath) &
              (composition_to_status.cause == selection.cause)) |
              ((selection.intent == SelectedIntent.Reduce) &
               (capabilities.sharedDehumidifierDisposition == ComposerDehumidifierDisposition.Ready) &
               (composition_to_status.treatmentAction == TreatmentAction.ReduceHumidity) &
               (composition_to_status.flowClass == FlowClass.Treatment) &
               (composition_to_status.authorityUse == AuthorityUse.SharedAirPath) &
               (composition_to_status.cause == selection.cause)) |
              ((selection.intent == SelectedIntent.Increase) &
               (capabilities.sharedHumidifierDisposition != ComposerHumidifierDisposition.Ready) &
               (composition_to_status.treatmentAction == TreatmentAction.None) &
               (composition_to_status.flowClass == FlowClass.Off) &
               (composition_to_status.authorityUse == AuthorityUse.None) &
               (composition_to_status.cause == StatusCause.SelectedPathUnavailable)) |
              ((selection.intent == SelectedIntent.Reduce) &
               (capabilities.sharedDehumidifierDisposition != ComposerDehumidifierDisposition.Ready) &
               (composition_to_status.treatmentAction == TreatmentAction.None) &
               (composition_to_status.flowClass == FlowClass.Off) &
               (composition_to_status.authorityUse == AuthorityUse.None) &
               (composition_to_status.cause == StatusCause.SelectedPathUnavailable));
          case CASE_29_ROUTINE_COMPOSITION:
            assume (selection.intent == SelectedIntent.ExchangeAir) & (path == PathDisposition.Usable) &
              (capabilities.sharedBlowerDisposition == ComposerBlowerDisposition.Ready);
            guarantee (composition_to_status.treatmentAction == TreatmentAction.ExchangeAir) &
              (composition_to_status.flowClass == selection.flowClass) &
              (composition_to_status.authorityUse == AuthorityUse.SharedAirPath) &
              (composition_to_status.cause == selection.cause);
    }*/

                        
                
                           
                                       
                                                                         
                                                            
                                                                   
                                                                         
                                                                  
                                                     
                                                           
             
                        
                                          
                                                                                   
                                                                       
                                                                            
                         
                                       
                                                                           
                                                              
                                                                      
                                                                           
                                                              
                                                                               
                     
                           
                                    
                                                           
                                                                                     
                                                                
                                                                       
                                                             
                           
                                           
                                                                                               
                                                                                     
                                                                
                                                                       
                                                                          
                           
                                          
                                                                                              
                                                                                     
                                                                
                                                                       
                                                                         
                           
                                          
                                                                                             
                                                                                      
                                                                                     
                                                                
                                                                       
                                                                              
                           
                                          
                                                                                               
                                                                                      
                     
                                                                                         
                                                                                    
                                                                        
                                                                                  
                                                                 
                                                                                         
                                                                               
                                                                  
                                                                         
                                                                                     
                           
                                            
                                                                 
                                                                
                                              
                                                                                      
                     
                                                             
                                                                                                 
                                                                                           
                                                                        
                                                                                  
                                                                 
                                                           
                                                                                                     
                                                                                         
                                                                        
                                                                                  
                                                                 
                                                             
                                                                                                 
                                                                               
                                                                  
                                                                         
                                                                                     
                                                           
                                                                                                     
                                                                               
                                                                  
                                                                         
                                                                                     
                           
                                           
                                                                   
                                              
                                                                                      
                                                                                            
                                                                      
                                                                                
                                                             
       
  }
  part def StatusOutcomeReconciler :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port composed_result : DataPort { in :>> type : CompositionReport; }
    port selection : DataPort { in :>> type : SelectionReport; }
    port air_report : DataPort { in :>> type : AirRecoveryReport; }
    port humidity_report : DataPort { in :>> type : HumidityRecoveryReport; }
    port accepted : DataPort { in :>> type : AcceptedPreference; }
    port supervisor_status : DataPort { out :>> type : CabinAirSupervisorStatus; }

    language "GUMBO" /*{
                
                                      
                                                           
                                                                      

      compute
        guarantee STATUS_CAUSE_PRECEDENCE:
          ((((air_report.transitionEvent == AirRecoveryEvent.AirFaultEntered) |
             (air_report.transitionEvent == AirRecoveryEvent.AirFaultPersists) |
             (air_report.transitionEvent == AirRecoveryEvent.AirFaultRecurred)) &
            (supervisor_status.cause == StatusCause.AirObservationInvalid)) |
           ((air_report.transitionEvent != AirRecoveryEvent.AirFaultEntered) &
            (air_report.transitionEvent != AirRecoveryEvent.AirFaultPersists) &
            (air_report.transitionEvent != AirRecoveryEvent.AirFaultRecurred) &
            ((humidity_report.transitionEvent == HumidityRecoveryEvent.HumidityFaultEntered) |
             (humidity_report.transitionEvent == HumidityRecoveryEvent.HumidityFaultPersists) |
             (humidity_report.transitionEvent == HumidityRecoveryEvent.HumidityFaultRecurred)) &
            (supervisor_status.cause == StatusCause.HumidityObservationInvalid)) |
           ((air_report.transitionEvent != AirRecoveryEvent.AirFaultEntered) &
            (air_report.transitionEvent != AirRecoveryEvent.AirFaultPersists) &
            (air_report.transitionEvent != AirRecoveryEvent.AirFaultRecurred) &
            (humidity_report.transitionEvent != HumidityRecoveryEvent.HumidityFaultEntered) &
            (humidity_report.transitionEvent != HumidityRecoveryEvent.HumidityFaultPersists) &
            (humidity_report.transitionEvent != HumidityRecoveryEvent.HumidityFaultRecurred) &
            (air_report.trust != TrustState.Trusted) &
            (supervisor_status.cause == StatusCause.AirRecovering)) |
           ((air_report.transitionEvent != AirRecoveryEvent.AirFaultEntered) &
            (air_report.transitionEvent != AirRecoveryEvent.AirFaultPersists) &
            (air_report.transitionEvent != AirRecoveryEvent.AirFaultRecurred) &
            (humidity_report.transitionEvent != HumidityRecoveryEvent.HumidityFaultEntered) &
            (humidity_report.transitionEvent != HumidityRecoveryEvent.HumidityFaultPersists) &
            (humidity_report.transitionEvent != HumidityRecoveryEvent.HumidityFaultRecurred) &
            (air_report.trust == TrustState.Trusted) &
            (humidity_report.trust != TrustState.Trusted) &
            (supervisor_status.cause == StatusCause.HumidityRecovering)) |
           ((air_report.trust == TrustState.Trusted) &
            (humidity_report.trust == TrustState.Trusted) &
            ((composed_result.cause == StatusCause.AuthorityInvalid) |
             (composed_result.cause == StatusCause.AirPathReserved) |
             (composed_result.cause == StatusCause.EquipmentUnavailable) |
             (composed_result.cause == StatusCause.SelectedPathUnavailable)) &
            (supervisor_status.cause == composed_result.cause)) |
           ((air_report.trust == TrustState.Trusted) &
            (humidity_report.trust == TrustState.Trusted) &
            (composed_result.cause != StatusCause.AuthorityInvalid) &
            (composed_result.cause != StatusCause.AirPathReserved) &
            (composed_result.cause != StatusCause.EquipmentUnavailable) &
            (composed_result.cause != StatusCause.SelectedPathUnavailable) &
            (accepted.preferenceEvent == PreferenceEvent.RejectedInvalid) &
            (supervisor_status.cause == StatusCause.PreferenceRejected)) |
           ((air_report.trust == TrustState.Trusted) &
            (humidity_report.trust == TrustState.Trusted) &
            (composed_result.cause != StatusCause.AuthorityInvalid) &
            (composed_result.cause != StatusCause.AirPathReserved) &
            (composed_result.cause != StatusCause.EquipmentUnavailable) &
            (composed_result.cause != StatusCause.SelectedPathUnavailable) &
            (accepted.preferenceEvent != PreferenceEvent.RejectedInvalid) &
            ((selection.cause == StatusCause.AirTreatmentPriority) |
             (selection.cause == StatusCause.HumidityTreatmentPriority)) &
            (supervisor_status.cause == selection.cause)) |
           ((air_report.trust == TrustState.Trusted) &
            (humidity_report.trust == TrustState.Trusted) &
            (composed_result.cause != StatusCause.AuthorityInvalid) &
            (composed_result.cause != StatusCause.AirPathReserved) &
            (composed_result.cause != StatusCause.EquipmentUnavailable) &
            (composed_result.cause != StatusCause.SelectedPathUnavailable) &
            (accepted.preferenceEvent != PreferenceEvent.RejectedInvalid) &
            (selection.cause != StatusCause.AirTreatmentPriority) &
            (selection.cause != StatusCause.HumidityTreatmentPriority) &
            (accepted.enable == EnableChoice.Off) &
            (supervisor_status.cause == StatusCause.PreferenceDisabled)) |
           ((air_report.trust == TrustState.Trusted) &
            (humidity_report.trust == TrustState.Trusted) &
            (composed_result.cause != StatusCause.AuthorityInvalid) &
            (composed_result.cause != StatusCause.AirPathReserved) &
            (composed_result.cause != StatusCause.EquipmentUnavailable) &
            (composed_result.cause != StatusCause.SelectedPathUnavailable) &
            (accepted.preferenceEvent != PreferenceEvent.RejectedInvalid) &
            (selection.cause != StatusCause.AirTreatmentPriority) &
            (selection.cause != StatusCause.HumidityTreatmentPriority) &
            (accepted.enable == EnableChoice.On) &
            (supervisor_status.cause == StatusCause.None)));
        guarantee STATUS_MODE_TOTAL_PARTITION:
          ((selection.intent != SelectedIntent.None) &
             (composed_result.treatmentAction == TreatmentAction.None) &
             (supervisor_status.mode == SupervisorMode.Inhibited)) |
          ((selection.intent == SelectedIntent.None) &
             (composed_result.treatmentAction == TreatmentAction.None) &
             ((air_report.trust != TrustState.Trusted) |
              (humidity_report.trust != TrustState.Trusted)) &
             (supervisor_status.mode == SupervisorMode.ObservationHold)) |
          ((composed_result.treatmentAction != TreatmentAction.None) &
             ((air_report.trust != TrustState.Trusted) |
              (humidity_report.trust != TrustState.Trusted) |
              (accepted.preferenceEvent == PreferenceEvent.RejectedInvalid)) &
             (supervisor_status.mode == SupervisorMode.Degraded)) |
          ((composed_result.treatmentAction != TreatmentAction.None) &
             (air_report.trust == TrustState.Trusted) &
             (humidity_report.trust == TrustState.Trusted) &
             (accepted.preferenceEvent != PreferenceEvent.RejectedInvalid) &
             (supervisor_status.mode == SupervisorMode.Active)) |
          ((selection.intent == SelectedIntent.None) &
             (composed_result.treatmentAction == TreatmentAction.None) &
             (air_report.trust == TrustState.Trusted) &
             (humidity_report.trust == TrustState.Trusted) &
             (supervisor_status.mode == SupervisorMode.Idle));
    }*/

                        
                
                           
                                      
                                                         
                                                                    
             
                          
                                          
                                                                             
                                                                              
                                                                               
                                                                           
                                                                            
                                                                             
                                                                             
                                                                                            
                                                                                             
                                                                                              
                                                                                
                                                                            
                                                                             
                                                                             
                                                                                           
                                                                                            
                                                                                            
                                                    
                                                                   
                                                                            
                                                                             
                                                                             
                                                                                           
                                                                                            
                                                                                            
                                                                                                  
                                                                        
                                                                                                  
                                                                    
                                                                   
                                                                        
                                                                            
                                                               
                                                                                                  
                                                                   
                                                                  
                                                                       
                                                                          
                                                                         
                                                                        
                                                                                                  
                                                                   
                                                                  
                                                                       
                                                                          
                                                                         
                                                                  
                                                                        
                                                         
                                                                                                  
                                                                   
                                                                  
                                                                       
                                                                          
                                                                         
                                                                 
                                                                      
                                                 
                                                                        
                                                                                                  
                                                                   
                                                                  
                                                                       
                                                                          
                                                                         
                                                                 
                                                                      
                                                                                               
                           
                                              
                                                     
                                                                     
                                                                 
                                                     
                                                                     
                                                     
                                                           
                                                                       
                                                                     
                                                     
                                                          
                                                                           
                                                                
                                                                     
                                                    
                                                         
                                                                         
                                                              
                                                     
                                                                     
                                                    
                                                         
                                                            
       
  }

  part def CabinAirSupervisionProcess :> Process {
    port preference : DataPort { in :>> type : UserAirPreference; }
    port air_observation : DataPort { in :>> type : AirQualityObservation; }
    port humidity_observation : DataPort { in :>> type : HumidityObservation; }
    port readiness : DataPort { in :>> type : AirTreatmentReadiness; }
    port authority : DataPort { in :>> type : SharedAirPathAuthority; }
    port treatment_plan : DataPort { out :>> type : CabinAirTreatmentPlan; }
    port supervisor_status : DataPort { out :>> type : CabinAirSupervisorStatus; }

    part preference_request_qualifier : PreferenceRequestQualifier;
    part air_quality_need_assessor : AirQualityNeedAssessor;
    part humidity_need_assessor : HumidityNeedAssessor;
    part shared_path_authority_assessor : SharedPathAuthorityAssessor;
    part treatment_capability_assessor : TreatmentCapabilityAssessor;
    part air_evidence_recovery_owner : AirEvidenceRecoveryOwner;
    part humidity_evidence_recovery_owner : HumidityEvidenceRecoveryOwner;
    part preference_session_owner : PreferenceSessionOwner;
    part filtration_proposal_owner : FiltrationProposalOwner;
    part humidity_proposal_owner : HumidityProposalOwner;
    part routine_airflow_proposal_owner : RoutineAirflowProposalOwner;
    part cabin_air_priority_arbiter : CabinAirPriorityArbiter;
    part authority_safe_plan_composer : AuthoritySafePlanComposer;
    part status_outcome_reconciler : StatusOutcomeReconciler;

    connection int01 : PortConnection connect preference to preference_request_qualifier.preference;
    connection int02 : PortConnection connect air_observation to air_quality_need_assessor.observation;
    connection int03 : PortConnection connect humidity_observation to humidity_need_assessor.observation;
    connection int04 : PortConnection connect authority to shared_path_authority_assessor.authority;
    connection int05 : PortConnection connect readiness to treatment_capability_assessor.readiness;
    connection int06 : PortConnection connect preference_request_qualifier.candidate to preference_session_owner.candidate;
    connection int07 : PortConnection connect air_quality_need_assessor.evidence to air_evidence_recovery_owner.evidence;
    connection int08 : PortConnection connect humidity_need_assessor.evidence to humidity_evidence_recovery_owner.evidence;
    connection int09 : PortConnection connect treatment_capability_assessor.filter_facts to filtration_proposal_owner.capabilities;
    connection int10 : PortConnection connect treatment_capability_assessor.humidity_facts to humidity_proposal_owner.capabilities;
    connection int11 : PortConnection connect treatment_capability_assessor.blower_fact to routine_airflow_proposal_owner.capability;
    connection int12 : PortConnection connect treatment_capability_assessor.capability_set to authority_safe_plan_composer.capabilities;
    connection int13 : PortConnection connect shared_path_authority_assessor.disposition_to_routine to routine_airflow_proposal_owner.path;
    connection int14 : PortConnection connect shared_path_authority_assessor.disposition_to_composer to authority_safe_plan_composer.path;
    connection int15 : PortConnection connect air_evidence_recovery_owner.report_to_filter to filtration_proposal_owner.air_report;
    connection int16 : PortConnection connect humidity_evidence_recovery_owner.report_to_humidity to humidity_proposal_owner.humidity_report;
    connection int17 : PortConnection connect preference_session_owner.accepted_to_filter to filtration_proposal_owner.accepted;
    connection int18 : PortConnection connect preference_session_owner.accepted_to_humidity to humidity_proposal_owner.accepted;
    connection int19 : PortConnection connect preference_session_owner.accepted_to_routine to routine_airflow_proposal_owner.accepted;
    connection int20 : PortConnection connect preference_session_owner.accepted_to_arbiter to cabin_air_priority_arbiter.accepted;
    connection int21 : PortConnection connect filtration_proposal_owner.proposal to cabin_air_priority_arbiter.filter_proposal;
    connection int22 : PortConnection connect humidity_proposal_owner.proposal to cabin_air_priority_arbiter.humidity_proposal;
    connection int23 : PortConnection connect routine_airflow_proposal_owner.proposal to cabin_air_priority_arbiter.routine_proposal;
    connection int24 : PortConnection connect cabin_air_priority_arbiter.selection_to_composer to authority_safe_plan_composer.selection;
    connection int25 : PortConnection connect authority_safe_plan_composer.composition_to_status to status_outcome_reconciler.composed_result;
    connection int26 : PortConnection connect cabin_air_priority_arbiter.selection_to_status to status_outcome_reconciler.selection;
    connection int27 : PortConnection connect air_evidence_recovery_owner.report_to_status to status_outcome_reconciler.air_report;
    connection int28 : PortConnection connect humidity_evidence_recovery_owner.report_to_status to status_outcome_reconciler.humidity_report;
    connection int29 : PortConnection connect preference_session_owner.accepted_to_status to status_outcome_reconciler.accepted;
    connection int30 : PortConnection connect authority_safe_plan_composer.treatment_plan to treatment_plan;
    connection int31 : PortConnection connect status_outcome_reconciler.supervisor_status to supervisor_status;
  }

  part def CabinAirQualityHumiditySupervisorSystem :> System {
    port preference : DataPort { in :>> type : UserAirPreference; }
    port air_observation : DataPort { in :>> type : AirQualityObservation; }
    port humidity_observation : DataPort { in :>> type : HumidityObservation; }
    port readiness : DataPort { in :>> type : AirTreatmentReadiness; }
    port authority : DataPort { in :>> type : SharedAirPathAuthority; }
    port treatment_plan : DataPort { out :>> type : CabinAirTreatmentPlan; }
    port supervisor_status : DataPort { out :>> type : CabinAirSupervisorStatus; }

    part cabin_air_supervision_process : CabinAirSupervisionProcess;

    connection support01 : PortConnection connect preference to cabin_air_supervision_process.preference;
    connection support02 : PortConnection connect air_observation to cabin_air_supervision_process.air_observation;
    connection support03 : PortConnection connect humidity_observation to cabin_air_supervision_process.humidity_observation;
    connection support04 : PortConnection connect readiness to cabin_air_supervision_process.readiness;
    connection support05 : PortConnection connect authority to cabin_air_supervision_process.authority;
    connection support06 : PortConnection connect cabin_air_supervision_process.treatment_plan to treatment_plan;
    connection support07 : PortConnection connect cabin_air_supervision_process.supervisor_status to supervisor_status;
  }

  part cabin_air_quality_humidity_supervisor : CabinAirQualityHumiditySupervisorSystem;
}
