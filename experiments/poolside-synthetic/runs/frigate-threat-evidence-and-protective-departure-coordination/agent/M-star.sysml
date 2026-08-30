package Frigate_Threat_Response_Coordinator {

  private import HAMR::*;

  enum def ContactClass { enum NO_CONTACT; enum UNCERTAIN; enum HOSTILE_SIGNATURE; }
  enum def EvidenceStatus { enum VALID; enum INVALID; }
  enum def DefenseAuthority { enum NONE; enum ENABLE; enum RESET; }
  enum def EscapeAuthority { enum NONE; enum ENABLE; enum RESET; }
  enum def DefenseOutcome { enum NONE; enum COMMAND_SUCCEEDED; enum COMMAND_FAILED; enum RECOVERY_CONFIRMED; }
  enum def RouteStatus { enum UNAVAILABLE; enum READY; }
  enum def EscapeOutcome { enum NONE; enum DEPARTURE_SUCCEEDED; enum DEPARTURE_FAILED; enum RECOVERY_CONFIRMED; }
  enum def MiningInterlock { enum CLEAR; enum BLOCKED; }

  enum def ThreatBand { enum CLEAR; enum CAUTION; enum HOSTILE; }
  enum def ThreatValidity { enum USABLE; enum UNUSABLE; }
  enum def AlertState { enum QUIET; enum WATCH; enum ALARM; }
  enum def ChannelState { enum AVAILABLE; enum ISOLATED; enum PROBATION; }
  enum def ChannelGate { enum OPEN; enum BLOCKED; }
  enum def DefenseChannelCondition { enum AVAILABLE; enum ISOLATED; enum PROBATION; }
  enum def EscapeChannelCondition { enum AVAILABLE; enum ISOLATED; enum PROBATION; }
  enum def DefenseProposal { enum STANDBY; enum ACTIVATE; }
  enum def EscapeProposal { enum STAY; enum DEPART; }
  enum def ResponsePattern { enum OBSERVE; enum DEFENSE; enum DEPARTURE; }
  enum def ThreatReport { enum UNKNOWN; enum CLEAR; enum CAUTION; enum HOSTILE; }
  enum def DefenseDirective { enum STANDBY; enum ACTIVATE; }
  enum def EscapeDirective { enum STAY; enum DEPART; }
  enum def ResponseStage { enum INITIALIZING; enum MONITORING; enum RESPONDING; enum DEGRADED; enum EVIDENCE_FAULT; }

  // Every record member inspected by a final GUMBO expression is an attribute.
  part def ThreatEvidence :> Data {
    attribute contactClass : ContactClass;
    attribute evidenceStatus : EvidenceStatus;
  }
  part def QualifiedThreat :> Data {
    attribute band : ThreatBand;
    attribute validity : ThreatValidity;
  }
  part def DefenseReadinessContext :> Data {
    attribute defenseAvailable : Boolean;
    attribute capacitorAdequate : Boolean;
  }
  part def ResponseFrame :> Data {
    attribute threatReport : ThreatReport;
    attribute defenseDirective : DefenseDirective;
    attribute escapeDirective : EscapeDirective;
    attribute responsePattern : ResponsePattern;
    attribute responseStage : ResponseStage;
    attribute defenseCondition : DefenseChannelCondition;
    attribute escapeCondition : EscapeChannelCondition;
  }

  part def ThreatEvidenceContext :> Abstract {
    port threatEvidenceOut : DataPort { out :>> type : ThreatEvidence; }
  }

  part def PilotAuthorityContext :> Abstract {
    port clearAcknowledgmentOut : DataPort { out :>> type : Boolean; }
    port defenseAuthorityOut : DataPort { out :>> type : DefenseAuthority; }
    port escapeAuthorityOut : DataPort { out :>> type : EscapeAuthority; }
    port responseFrameIn : DataPort { in :>> type : ResponseFrame; }
  }

  part def DefenseExecutionContext :> Abstract {
    port readinessContextOut : DataPort { out :>> type : DefenseReadinessContext; }
    port defenseOutcomeOut : DataPort { out :>> type : DefenseOutcome; }
    port responseFrameIn : DataPort { in :>> type : ResponseFrame; }
  }

  part def NavigationExecutionContext :> Abstract {
    port navigationAvailableOut : DataPort { out :>> type : Boolean; }
    port routeStatusOut : DataPort { out :>> type : RouteStatus; }
    port escapeOutcomeOut : DataPort { out :>> type : EscapeOutcome; }
    port responseFrameIn : DataPort { in :>> type : ResponseFrame; }
  }

  part def MiningInterlockContext :> Abstract {
    port miningInterlockOut : DataPort { out :>> type : MiningInterlock; }
  }

  part def ThreatQualification :> Thread {
    port threatEvidenceIn : DataPort { in :>> type : ThreatEvidence; }
    port qualifiedThreatToAlertOut : DataPort { out :>> type : QualifiedThreat; }
    port threatValidityToDefenseOut : DataPort { out :>> type : ThreatValidity; }
    port threatValidityToEscapeOut : DataPort { out :>> type : ThreatValidity; }

                        
                
                         
                                                                                  
                                                                
                                                                         
                                                                 
                                                               
             
                          
                                                                                                   
                                                                            
                                                                          
                     
                           
                                                                               
                                                                             
                                                                            
                                                                                    
                           
                                                                             
                                                                            
                                                                            
                                                                          
                                                                                  
                           
                                                                                
                                                                            
                                                                           
                                                                            
                                                                                  
                           
                                                                                        
                                                                            
                                                                                   
                                                                            
                                                                                  
       
  }

  part def AlertMemory :> Thread {
    port qualifiedThreatIn : DataPort { in :>> type : QualifiedThreat; }
    port clearAcknowledgmentIn : DataPort { in :>> type : Boolean; }
    port defenseAlertOut : DataPort { out :>> type : AlertState; }
    port escapeAlertOut : DataPort { out :>> type : AlertState; }
    port compositionAlertOut : DataPort { out :>> type : AlertState; }
    port threatReportOut : DataPort { out :>> type : ThreatReport; }

                        
           
                          
                                   
                
                               
                           
                                                                                                          
                                             
                                                                                    
                                                                                            
             
                               
                           
                                                                                                                 
                                                                              
                                               
                         
                                                                                                                                              
                                                                   
                                                      
                                                                 
                                                                                        
                                                                 
                                                                                          
                                                                 
                                                                                          
                     
                           
                                                                                 
                                                                         
                                                         
                           
                                                                                                     
                                                                        
                                                                
                                                        
                           
                                                                                                     
                                                                        
                                                               
                                                                                 
                                                        
                           
                                                                               
                                                                        
                                                                 
                                                          
                                                                                            
                                                        
                           
                                                                                      
                                                                        
                                                                 
                                                          
                                                                  
                                                            
                                                                                                
                                                        
                           
                                                                                
                                                                        
                                                               
                                                          
                                                                                   
                                                        
       
  }

  part def DefenseChannelRecovery :> Thread {
    port defenseAuthorityIn : DataPort { in :>> type : DefenseAuthority; }
    port defenseOutcomeIn : DataPort { in :>> type : DefenseOutcome; }
    port threatValidityIn : DataPort { in :>> type : ThreatValidity; }
    port defenseGateOut : DataPort { out :>> type : ChannelGate; }
    port defenseChannelStateOut : DataPort { out :>> type : ChannelState; }

                        
           
                          
                                            
                
                                      
                           
                                                                                   
                                                          
                                                            
                                             
             
                                      
                         
                                                                                                       
                                                         
                     
                           
                                                                                                 
                                                                
                                                                     
                                                                     
                                                            
                           
                                                                                                 
                                                              
                                                                      
                                                                      
                                                                
                                                                      
                                                            
                           
                                                                                                                       
                                                              
                                                                      
                                                                       
                                                                         
                                                                      
                                                            
                           
                                                                                                                     
                                                              
                                                                      
                                                                           
                                                                       
                                                                            
                                                                               
                                                                        
                                                                                                              
                                                                                                                 
       
  }

  part def EscapeChannelRecovery :> Thread {
    port escapeAuthorityIn : DataPort { in :>> type : EscapeAuthority; }
    port escapeOutcomeIn : DataPort { in :>> type : EscapeOutcome; }
    port threatValidityIn : DataPort { in :>> type : ThreatValidity; }
    port escapeGateOut : DataPort { out :>> type : ChannelGate; }
    port escapeChannelStateOut : DataPort { out :>> type : ChannelState; }

                        
           
                          
                                           
                
                                     
                           
                                                                                 
                                                         
                                                           
                                            
             
                                     
                         
                                                                                                     
                                                       
                     
                           
                                                                                                  
                                                                
                                                                     
                                                                    
                                                           
                           
                                                                                               
                                                              
                                                                      
                                                                     
                                                              
                                                                     
                                                           
                           
                                                                                                                      
                                                              
                                                                      
                                                                      
                                                                       
                                                                     
                                                           
                           
                                                                                                                   
                                                              
                                                                      
                                                                          
                                                                     
                                                                           
                                                                             
                                                                      
                                                                                                            
                                                                                                               
       
  }

  part def DefenseReadiness :> Thread {
    port readinessContextIn : DataPort { in :>> type : DefenseReadinessContext; }
    port defenseGateIn : DataPort { in :>> type : ChannelGate; }
    port defenseReadyOut : DataPort { out :>> type : Boolean; }

                        
                
                           
                                                                                     
                              
             
                        
                                                                                                
                            
                                                  
                                                   
                                                
       
  }

  part def DepartureReadiness :> Thread {
    port navigationAvailableIn : DataPort { in :>> type : Boolean; }
    port routeStatusIn : DataPort { in :>> type : RouteStatus; }
    port miningInterlockIn : DataPort { in :>> type : MiningInterlock; }
    port escapeGateIn : DataPort { in :>> type : ChannelGate; }
    port escapeReadyOut : DataPort { out :>> type : Boolean; }

                        
                
                           
                                                                                      
                             
             
                        
                                                                                                 
                           
                                                                         
                                                                                            
       
  }

  part def DefenseActivationDecision :> Thread {
    port alertStateIn : DataPort { in :>> type : AlertState; }
    port defenseReadyIn : DataPort { in :>> type : Boolean; }
    port defenseAuthorityIn : DataPort { in :>> type : DefenseAuthority; }
    port defenseProposalToCoordinationOut : DataPort { out :>> type : DefenseProposal; }
    port defenseProposalToCompositionOut : DataPort { out :>> type : DefenseProposal; }

                        
                
                           
                                                                                  
                                                                       
                                                                     
             
                        
                                                                                                      
                                                                              
                     
                           
                                                                                                       
                                                                                          
                                                                                  
                                                                                   
                           
                                                                                         
                                                                                               
                                                                                        
                                                                                  
       
  }

  part def DepartureInitiationDecision :> Thread {
    port alertStateIn : DataPort { in :>> type : AlertState; }
    port escapeReadyIn : DataPort { in :>> type : Boolean; }
    port escapeAuthorityIn : DataPort { in :>> type : EscapeAuthority; }
    port escapeProposalToCoordinationOut : DataPort { out :>> type : EscapeProposal; }
    port escapeProposalToCompositionOut : DataPort { out :>> type : EscapeProposal; }

                        
                
                           
                                                                             
                                                                  
                                                                
             
                        
                                                                                                    
                                                                            
                     
                           
                                                                                           
                                                                     
                                                               
                                                                               
                           
                                                                                     
                                                                          
                                                                     
                                                                             
       
  }

  part def ResponseCoordination :> Thread {
    port defenseProposalIn : DataPort { in :>> type : DefenseProposal; }
    port escapeProposalIn : DataPort { in :>> type : EscapeProposal; }
    port responsePatternOut : DataPort { out :>> type : ResponsePattern; }

                        
                
                           
                                                                         
                                                        
             
                     
                           
                                                                               
                                                             
                                                                      
                           
                                                                              
                                                            
                                                                 
                                                                    
                           
                                                                        
                                                            
                                                                
                                                                    
       
  }

  part def ReportFrameComposition :> Thread {
    port responsePatternIn : DataPort { in :>> type : ResponsePattern; }
    port defenseProposalIn : DataPort { in :>> type : DefenseProposal; }
    port escapeProposalIn : DataPort { in :>> type : EscapeProposal; }
    port alertStateIn : DataPort { in :>> type : AlertState; }
    port threatReportIn : DataPort { in :>> type : ThreatReport; }
    port defenseChannelStateIn : DataPort { in :>> type : ChannelState; }
    port escapeChannelStateIn : DataPort { in :>> type : ChannelState; }
    port responseFrameOut : DataPort { out :>> type : ResponseFrame; }

                        
                
                           
                                                                                            
                                                                 
                                                                         
                                                                    
                                                                       
                                                                        
                                                                                  
                                                                               
             
                        
                                                                                                                                   
                                                           
                                                                 
                                                             
                                                                                     
                                                            
                                                                                    
                                                             
                                                                                      
                                                            
                                                                                   
                                                           
                                                                                  
                                                            
                                                                                   
                        
                                                                                                              
                                                           
                                                                             
                                                          
                                                                             
                                                       
                                                                         
                                                     
                                                                       
                     
                           
                                                                                       
                                                          
                                                                                     
                           
                                                                                                        
                                                           
                                                                     
                                                                    
                                                                               
                           
                                                                                                       
                                                         
                                                                    
                                                                   
                                                    
                                                                                 
                           
                                                                                                                          
                                                                    
                                                                   
                                                                                                 
                                                                                                 
                                                                                 
       
  }

  part def ThreatResponseProcess :> Process {
    port threatEvidenceIn : DataPort { in :>> type : ThreatEvidence; }
    port clearAcknowledgmentIn : DataPort { in :>> type : Boolean; }
    port defenseAuthorityIn : DataPort { in :>> type : DefenseAuthority; }
    port escapeAuthorityIn : DataPort { in :>> type : EscapeAuthority; }
    port readinessContextIn : DataPort { in :>> type : DefenseReadinessContext; }
    port defenseOutcomeIn : DataPort { in :>> type : DefenseOutcome; }
    port navigationAvailableIn : DataPort { in :>> type : Boolean; }
    port routeStatusIn : DataPort { in :>> type : RouteStatus; }
    port escapeOutcomeIn : DataPort { in :>> type : EscapeOutcome; }
    port miningInterlockIn : DataPort { in :>> type : MiningInterlock; }
    port responseFrameOut : DataPort { out :>> type : ResponseFrame; }
    part threatQualification : ThreatQualification;
    part alertMemory : AlertMemory;
    part defenseChannelRecovery : DefenseChannelRecovery;
    part escapeChannelRecovery : EscapeChannelRecovery;
    part defenseReadiness : DefenseReadiness;
    part departureReadiness : DepartureReadiness;
    part defenseActivationDecision : DefenseActivationDecision;
    part departureInitiationDecision : DepartureInitiationDecision;
    part responseCoordination : ResponseCoordination;
    part reportFrameComposition : ReportFrameComposition;

    connection support01 : PortConnection connect threatEvidenceIn to threatQualification.threatEvidenceIn;
    connection int02 : PortConnection connect threatQualification.qualifiedThreatToAlertOut to alertMemory.qualifiedThreatIn;
    connection support03 : PortConnection connect clearAcknowledgmentIn to alertMemory.clearAcknowledgmentIn;
    connection support04 : PortConnection connect defenseAuthorityIn to defenseChannelRecovery.defenseAuthorityIn;
    connection support05 : PortConnection connect defenseOutcomeIn to defenseChannelRecovery.defenseOutcomeIn;
    connection int06 : PortConnection connect threatQualification.threatValidityToDefenseOut to defenseChannelRecovery.threatValidityIn;
    connection support07 : PortConnection connect escapeAuthorityIn to escapeChannelRecovery.escapeAuthorityIn;
    connection support08 : PortConnection connect escapeOutcomeIn to escapeChannelRecovery.escapeOutcomeIn;
    connection int09 : PortConnection connect threatQualification.threatValidityToEscapeOut to escapeChannelRecovery.threatValidityIn;
    connection support10 : PortConnection connect readinessContextIn to defenseReadiness.readinessContextIn;
    connection int11 : PortConnection connect defenseChannelRecovery.defenseGateOut to defenseReadiness.defenseGateIn;
    connection support12 : PortConnection connect navigationAvailableIn to departureReadiness.navigationAvailableIn;
    connection support13 : PortConnection connect routeStatusIn to departureReadiness.routeStatusIn;
    connection support14 : PortConnection connect miningInterlockIn to departureReadiness.miningInterlockIn;
    connection int15 : PortConnection connect escapeChannelRecovery.escapeGateOut to departureReadiness.escapeGateIn;
    connection int16 : PortConnection connect alertMemory.defenseAlertOut to defenseActivationDecision.alertStateIn;
    connection int17 : PortConnection connect defenseReadiness.defenseReadyOut to defenseActivationDecision.defenseReadyIn;
    connection support18 : PortConnection connect defenseAuthorityIn to defenseActivationDecision.defenseAuthorityIn;
    connection int19 : PortConnection connect alertMemory.escapeAlertOut to departureInitiationDecision.alertStateIn;
    connection int20 : PortConnection connect departureReadiness.escapeReadyOut to departureInitiationDecision.escapeReadyIn;
    connection support21 : PortConnection connect escapeAuthorityIn to departureInitiationDecision.escapeAuthorityIn;
    connection int22 : PortConnection connect defenseActivationDecision.defenseProposalToCoordinationOut to responseCoordination.defenseProposalIn;
    connection int23 : PortConnection connect departureInitiationDecision.escapeProposalToCoordinationOut to responseCoordination.escapeProposalIn;
    connection int24 : PortConnection connect responseCoordination.responsePatternOut to reportFrameComposition.responsePatternIn;
    connection int25 : PortConnection connect defenseActivationDecision.defenseProposalToCompositionOut to reportFrameComposition.defenseProposalIn;
    connection int26 : PortConnection connect departureInitiationDecision.escapeProposalToCompositionOut to reportFrameComposition.escapeProposalIn;
    connection int27a : PortConnection connect alertMemory.compositionAlertOut to reportFrameComposition.alertStateIn;
    connection int27b : PortConnection connect alertMemory.threatReportOut to reportFrameComposition.threatReportIn;
    connection int28 : PortConnection connect defenseChannelRecovery.defenseChannelStateOut to reportFrameComposition.defenseChannelStateIn;
    connection int29 : PortConnection connect escapeChannelRecovery.escapeChannelStateOut to reportFrameComposition.escapeChannelStateIn;
    connection supportFrame : PortConnection connect reportFrameComposition.responseFrameOut to responseFrameOut;
  }

  part def FrigateThreatResponseSystem :> System {
    part threatEvidenceContext : ThreatEvidenceContext;
    part pilotAuthorityContext : PilotAuthorityContext;
    part defenseExecutionContext : DefenseExecutionContext;
    part navigationExecutionContext : NavigationExecutionContext;
    part miningInterlockContext : MiningInterlockContext;
    part threatResponseProcess : ThreatResponseProcess;

    connection int01 : PortConnection connect threatEvidenceContext.threatEvidenceOut to threatResponseProcess.threatEvidenceIn;
    connection int03 : PortConnection connect pilotAuthorityContext.clearAcknowledgmentOut to threatResponseProcess.clearAcknowledgmentIn;
    connection int04and18 : PortConnection connect pilotAuthorityContext.defenseAuthorityOut to threatResponseProcess.defenseAuthorityIn;
    connection int05 : PortConnection connect defenseExecutionContext.defenseOutcomeOut to threatResponseProcess.defenseOutcomeIn;
    connection int07and21 : PortConnection connect pilotAuthorityContext.escapeAuthorityOut to threatResponseProcess.escapeAuthorityIn;
    connection int08 : PortConnection connect navigationExecutionContext.escapeOutcomeOut to threatResponseProcess.escapeOutcomeIn;
    connection int10 : PortConnection connect defenseExecutionContext.readinessContextOut to threatResponseProcess.readinessContextIn;
    connection int12 : PortConnection connect navigationExecutionContext.navigationAvailableOut to threatResponseProcess.navigationAvailableIn;
    connection int13 : PortConnection connect navigationExecutionContext.routeStatusOut to threatResponseProcess.routeStatusIn;
    connection int14 : PortConnection connect miningInterlockContext.miningInterlockOut to threatResponseProcess.miningInterlockIn;
    connection int30 : PortConnection connect threatResponseProcess.responseFrameOut to pilotAuthorityContext.responseFrameIn;
    connection int31 : PortConnection connect threatResponseProcess.responseFrameOut to defenseExecutionContext.responseFrameIn;
    connection int32 : PortConnection connect threatResponseProcess.responseFrameOut to navigationExecutionContext.responseFrameIn;
  }

  part frigateThreatResponseCoordinator : FrigateThreatResponseSystem;
}
