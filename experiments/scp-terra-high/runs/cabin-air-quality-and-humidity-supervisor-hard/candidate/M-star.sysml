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
    port preference : DataPort { in :>> type : UserAirPreference; }
    port candidate : DataPort { out :>> type : QualifiedPreferenceCandidate; }

                        
                
                           
                                         
                                                              
                                                
                                                            
                                                               
                                                         
             
                         
                                                      
                                                 
                                                             
                                                                 
                                                                 
                                                     
                                                                 
                                                   
                                                
                                                              
                                                   
                                               
                                                   
                                                                       
                                                   
                                               
                                                  
                                                                      
       
  }
  part def AirQualityNeedAssessor :> Thread {
    port observation : DataPort { in :>> type : AirQualityObservation; }
    port evidence : DataPort { out :>> type : AirEvidence; }

                        
                
                           
                                                                             
             
                         
                                              
                                                                                         
                                                    
                                                                                          
                                                    
                                                                                                  
       
  }
  part def HumidityNeedAssessor :> Thread {
    port observation : DataPort { in :>> type : HumidityObservation; }
    port evidence : DataPort { out :>> type : HumidityEvidence; }

                        
                
                           
                                                                                       
             
                         
                                                   
                                                                                              
                                                    
                                                                                                
                                                    
                                                                                                        
                                                    
                                                                                                  
       
  }
  part def SharedPathAuthorityAssessor :> Thread {
    port authority : DataPort { in :>> type : SharedAirPathAuthority; }
    port disposition_to_routine : DataPort { out :>> type : PathDisposition; }
    port disposition_to_composer : DataPort { out :>> type : PathDisposition; }

                        
                
                           
                                         
                                                               
                                                               
             
                         
                                                  
                                                             
                                                    
                                                                  
                                                                                          
                                                                 
                                                                                         
                                                               
       
  }
  part def TreatmentCapabilityAssessor :> Thread {
    port readiness : DataPort { in :>> type : AirTreatmentReadiness; }
    port filter_facts : DataPort { out :>> type : FilterCapabilityFacts; }
    port humidity_facts : DataPort { out :>> type : HumidityCapabilityFacts; }
    port blower_fact : DataPort { out :>> type : BlowerCapabilityFact; }
    port capability_set : DataPort { out :>> type : CapabilitySet; }

                        
                
                           
                                                 
                                                                                         
                                                                                         
                                                                                                 
                                                                                                     
                                                                                           
                                                                                   
                                                                                                 
                                                                                                 
                                                                                                     
                                                                                           
             
                            
                                              
                                                                                        
                                                                                           
                                                                                         
                                                                                            
                                                                                          
                                                                                             
                                                                                            
                                                                                                
                                                                                        
                                                                                                 
                                                                                         
                                                                                                  
                                                                                          
                                                                                                   
                                                                                            
                                                                                                      
                                                                                        
                                                                                            
                                                                                         
                                                                                             
                                                                                          
                                                                                              
                                                                                            
                                                                                                 
                                                                                        
                                                                                   
                                                                                         
                                                                                    
                                                                                          
                                                                                     
                                                                                            
                                                                                        
                                                                                                
                                                                                                 
                                                                                                 
                                                                                                  
                                                                                                  
                                                                                                   
                                                                                                    
                                                                                                      
                                                                                                    
                                                                                                     
                                                                                                     
                                                                                                      
                                                                                                      
                                                                                                       
                                                                                                        
                                                                                                          
                            
                                                   
                                                    
                                                                                            
                                                                                                       
                                                                                        
                                                                                                        
                                                                                         
                                                                                                         
                                                                                          
                            
                                                   
                                                    
                                                                                            
                                                                                                      
                                                                                        
                                                                                                       
                                                                                         
                                                                                                        
                                                                                          
                            
                                                       
                                                    
                                                                                                    
                                                                                                      
                                                                                                
                                                                                                       
                                                                                                 
                                                                                                        
                                                                                                  
                            
                                                         
                                                    
                                                                                                        
                                                                                                          
                                                                                                    
                                                                                                           
                                                                                                     
                                                                                                            
                                                                                                      
       
  }
  part def AirEvidenceRecoveryOwner :> Thread {
    port evidence : DataPort { in :>> type : AirEvidence; }
    port report_to_filter : DataPort { out :>> type : AirRecoveryReport; }
    port report_to_status : DataPort { out :>> type : AirRecoveryReport; }

                        
           
                         
                                   
                
                                
                           
                                         
                                                
                                                        
                                                                          
                                                          
                                          
                                                            
                                                                                
                                                                  
                                                                 
             
                                
                         
                                    
                                                    
                                                 
                                                            
                                                                                
                                                                  
                                                                 
                     
                           
                                         
                                                                                              
                                                                
                                              
                                                                                   
                           
                                  
                                                                                              
                                                            
                                              
                                                                             
                           
                                          
                                                                                                  
                                                                
                                              
                                                                                    
                           
                                            
                                                                                                  
                                                               
                                              
                                                                                      
                           
                                          
                                                                                                 
                                                                
                                              
                                                                                    
                           
                                     
                                                                                                 
                                                            
                                              
                                                                                
       
  }
  part def HumidityEvidenceRecoveryOwner :> Thread {
    port evidence : DataPort { in :>> type : HumidityEvidence; }
    port report_to_humidity : DataPort { out :>> type : HumidityRecoveryReport; }
    port report_to_status : DataPort { out :>> type : HumidityRecoveryReport; }

                        
           
                         
                                        
                
                                     
                           
                                              
                                                     
                                                          
                                                                                      
                                                                
                                            
                                                              
                                                                                  
                                                                    
                                                                   
             
                                     
                         
                                         
                                                           
                                                   
                                                              
                                                                                  
                                                                    
                                                                   
                     
                           
                                              
                                                                                                        
                                                                     
                                                
                                                                                               
                           
                                       
                                                                                                        
                                                                 
                                                
                                                                                         
                           
                                               
                                                                                                            
                                                                     
                                                
                                                                                                
                           
                                                 
                                                                                                            
                                                                    
                                                
                                                                                                  
                           
                                               
                                                                                                           
                                                                     
                                                
                                                                                                
                           
                                          
                                                                                                           
                                                                 
                                                
                                                                                            
       
  }
  part def PreferenceSessionOwner :> Thread {
    port candidate : DataPort { in :>> type : QualifiedPreferenceCandidate; }
    port accepted_to_filter : DataPort { out :>> type : AcceptedPreference; }
    port accepted_to_humidity : DataPort { out :>> type : AcceptedPreference; }
    port accepted_to_routine : DataPort { out :>> type : AcceptedPreference; }
    port accepted_to_arbiter : DataPort { out :>> type : AcceptedPreference; }
    port accepted_to_status : DataPort { out :>> type : AcceptedPreference; }

                        
           
                         
                                           
                         
                                                 
                         
                                                     
                         
                                                     
                
                                                                  
                                                                     
                           
                                                       
                                                    
                                                                
                                                                   
                                                              
                                                         
                                                                     
                                                                        
                                                                   
                                                                                  
                                                                    
                                                                                
                                                                                    
                                                                                    
                                                                                      
                                                                   
                                                                               
                                                                                   
                                                                                   
                                                                                     
                                                                   
                                                                               
                                                                                   
                                                                                   
                                                                                     
                                                                  
                                                                              
                                                                                  
                                                                                  
                                                                                   
             
                                                                  
                                                                     
                         
                                             
                                                             
                                                                         
                                                                             
                                                                             
                                                                    
                                                                                
                                                                                    
                                                                                    
                                                                                      
                                                                   
                                                                               
                                                                                   
                                                                                   
                                                                                     
                                                                   
                                                                               
                                                                                   
                                                                                   
                                                                                     
                                                                  
                                                                              
                                                                                  
                                                                                  
                                                                                   
                     
                           
                                      
                                                                      
                                                                        
                                                                            
                                                                                
                                                                                
                                                                                    
                           
                                   
                                                                   
                                                                        
                                                                            
                                                                                
                                                                                
                                                                                    
                           
                                       
                                                                            
                                                                
                                                                    
                                                                        
                                                                        
                                                                                     
                           
                                      
                                                                           
                                                                
                                                                    
                                                                        
                                                                        
                                                                                    
       
  }
  part def FiltrationProposalOwner :> Thread {
    port air_report : DataPort { in :>> type : AirRecoveryReport; }
    port accepted : DataPort { in :>> type : AcceptedPreference; }
    port capabilities : DataPort { in :>> type : FilterCapabilityFacts; }
    port proposal : DataPort { out :>> type : FilterProposalReport; }

                        
                
                           
                                               
                                                                                        
             
                                
                                                 
                                                 
                                                                                            
                                                
                                                                                     
                                                                                            
                                                                           
                                                      
                                                             
                                                                                            
                                                                           
                                                        
                                                               
                                                               
                                                                                         
                                                             
                                                                 
                                                                           
                                                        
                                                               
                                                               
                                                                                         
                                                                                 
                                                             
                                                                    
                                                                           
                                                             
                                                             
                                                                                         
                                                                                 
                                                                                                     
                                                                           
                                                        
                                                              
                                                                                         
                                                                                 
                                                                                                  
       
  }
  part def HumidityProposalOwner :> Thread {
    port humidity_report : DataPort { in :>> type : HumidityRecoveryReport; }
    port accepted : DataPort { in :>> type : AcceptedPreference; }
    port capabilities : DataPort { in :>> type : HumidityCapabilityFacts; }
    port proposal : DataPort { out :>> type : HumidityProposalReport; }

                        
                
                           
                                                 
                                                                                          
             
                               
                                                   
                                                  
                                                                  
                                                                                              
                                                
                                                                 
                                            
                                                                    
                                                                                              
                                                
                                                                 
                                           
                                                               
                                                                                              
                                                
                                                                 
                                           
                                                               
                                                                 
                                                                                             
                                                               
                                                                 
                                                
                                                                 
                                           
                                                              
                                                                                             
                                                                                             
                                                               
                                                                    
                                                
                                                                 
                                           
                                                               
                                                                                             
                                                                                                 
                                                               
                                                                    
                                                
                                                                 
                                           
                                                              
                                                                                             
                                                                                             
                                                                                                  
                                                
                                                                 
                                           
                                                               
                                                                                             
                                                                                                 
                                                                                                
       
  }
  part def RoutineAirflowProposalOwner :> Thread {
    port accepted : DataPort { in :>> type : AcceptedPreference; }
    port path : DataPort { in :>> type : PathDisposition; }
    port capability : DataPort { in :>> type : BlowerCapabilityFact; }
    port proposal : DataPort { out :>> type : RoutineProposalReport; }

                        
                
                           
                                                
                                                                                         
             
                                 
                                                  
                                                 
                                                                                             
                                                                                                
                                                                                             
                                                                                                
                                               
                                                              
                                                             
                                                                                                
                                              
                                                              
                                                            
                                                                                                
                                            
                                                                                         
                                                              
                                                                 
                                                                                                
                                                                                                                          
                                                                                            
                                                                                                 
                                                                                                                          
                                                                                             
       
  }
  part def CabinAirPriorityArbiter :> Thread {
    port accepted : DataPort { in :>> type : AcceptedPreference; }
    port filter_proposal : DataPort { in :>> type : FilterProposalReport; }
    port humidity_proposal : DataPort { in :>> type : HumidityProposalReport; }
    port routine_proposal : DataPort { in :>> type : RoutineProposalReport; }
    port selection_to_composer : DataPort { out :>> type : SelectionReport; }
    port selection_to_status : DataPort { out :>> type : SelectionReport; }

                        
                
                           
                                         
                                                               
                                                            
                                                                         
                                                                      
                                                                            
                                                                   
             
                        
                                   
                                                                      
                                                                            
                                                                   
                     
                           
                                         
                                                       
                                                                           
                                                                
                                                                            
                           
                                       
                                                       
                                                                         
                                                                      
                                                                             
                                                                      
                                                                              
                           
                                       
                                                       
                                                                
                                                                        
                                                                    
                                                                             
                                                                      
                                                                                   
                           
                                         
                                                       
                                                                
                                                                        
                                                                      
                                                                               
                                                                      
                                                                                   
                           
                                        
                                                       
                                                                
                                                                        
                                                                    
                                                                            
                                                                 
                                                                  
                                                                                  
                                                               
                                                                  
                                                                       
                                                                   
                                                                       
                           
                                          
                                                       
                                                                
                                                                        
                                                                    
                                                                            
                                                                  
                                                                         
                                                                           
                                                                
                                                                        
                                                                          
                                                                          
                                                                              
                                                                       
                                                                         
                                                                        
                                                                       
                                                                         
                                                                         
                                                                             
                                                                       
                                                                         
                                                                        
                                                                      
                                                                        
                                                                       
                                                                            
                                                                              
                                                                              
                                                                                  
                                                                       
                                                                         
                                                                        
                                                                      
                                                                        
                                                                       
                                                                           
                                                                             
                                                                            
                                                                               
                                                                                 
                                                                                 
                                                                                     
                                                           
                                                             
                                                            
                                                                  
       
  }
  part def AuthoritySafePlanComposer :> Thread {
    port selection : DataPort { in :>> type : SelectionReport; }
    port path : DataPort { in :>> type : PathDisposition; }
    port capabilities : DataPort { in :>> type : CapabilitySet; }
    port composition_to_status : DataPort { out :>> type : CompositionReport; }
    port treatment_plan : DataPort { out :>> type : CabinAirTreatmentPlan; }

                        
                
                           
                                       
                                                                         
                                                            
                                                                   
                                                                         
                                                                  
                                                     
                                                           
             
                        
                                          
                                                                                   
                                                                       
                                                                            
                         
                                       
                                                                           
                                                              
                                                                      
                                                                           
                                                              
                                                                               
                     
                           
                                    
                                                           
                                                                                     
                                                                
                                                                       
                                                             
                           
                                           
                                                                                               
                                                                                     
                                                                
                                                                       
                                                                          
                           
                                          
                                                                                              
                                                                                     
                                                                
                                                                       
                                                                         
                           
                                          
                                                                                             
                                                                                      
                                                                                     
                                                                
                                                                       
                                                                              
                           
                                          
                                                                                               
                                                                                      
                     
                                                                                         
                                                                                    
                                                                        
                                                                                  
                                                                 
                                                                                         
                                                                               
                                                                  
                                                                         
                                                                                     
                           
                                            
                                                                 
                                                                
                                              
                                                                                      
                     
                                                             
                                                                                                 
                                                                                           
                                                                        
                                                                                  
                                                                 
                                                           
                                                                                                     
                                                                                         
                                                                        
                                                                                  
                                                                 
                                                             
                                                                                                 
                                                                               
                                                                  
                                                                         
                                                                                     
                                                           
                                                                                                     
                                                                               
                                                                  
                                                                         
                                                                                     
                           
                                           
                                                                   
                                              
                                                                                      
                                                                                            
                                                                      
                                                                                
                                                             
       
  }
  part def StatusOutcomeReconciler :> Thread {
    port composed_result : DataPort { in :>> type : CompositionReport; }
    port selection : DataPort { in :>> type : SelectionReport; }
    port air_report : DataPort { in :>> type : AirRecoveryReport; }
    port humidity_report : DataPort { in :>> type : HumidityRecoveryReport; }
    port accepted : DataPort { in :>> type : AcceptedPreference; }
    port supervisor_status : DataPort { out :>> type : CabinAirSupervisorStatus; }

                        
                
                           
                                      
                                                         
                                                                    
             
                          
                                          
                                                                             
                                                                              
                                                                               
                                                                           
                                                                            
                                                                             
                                                                             
                                                                                            
                                                                                             
                                                                                              
                                                                                
                                                                            
                                                                             
                                                                             
                                                                                           
                                                                                            
                                                                                            
                                                    
                                                                   
                                                                            
                                                                             
                                                                             
                                                                                           
                                                                                            
                                                                                            
                                                                                                  
                                                                        
                                                                                                  
                                                                    
                                                                   
                                                                        
                                                                            
                                                               
                                                                                                  
                                                                   
                                                                  
                                                                       
                                                                          
                                                                         
                                                                        
                                                                                                  
                                                                   
                                                                  
                                                                       
                                                                          
                                                                         
                                                                  
                                                                        
                                                         
                                                                                                  
                                                                   
                                                                  
                                                                       
                                                                          
                                                                         
                                                                 
                                                                      
                                                 
                                                                        
                                                                                                  
                                                                   
                                                                  
                                                                       
                                                                          
                                                                         
                                                                 
                                                                      
                                                                                               
                           
                                              
                                                     
                                                                     
                                                                 
                                                     
                                                                     
                                                     
                                                           
                                                                       
                                                                     
                                                     
                                                          
                                                                           
                                                                
                                                                     
                                                    
                                                         
                                                                         
                                                              
                                                     
                                                                     
                                                    
                                                         
                                                            
       
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
