package Frigate_Threat_Egress_Supervisor {
  private import HAMR::*;

  enum def EvidenceBand {
    enum CLEAR;
    enum SUSPICIOUS;
    enum HOSTILE;
  }

  enum def ObservationValidity {
    enum INVALID;
    enum VALID;
  }

  part def ThreatObservation :> Data {
    attribute evidenceBand : EvidenceBand;
    attribute validity : ObservationValidity;
  }

  enum def PilotDisposition {
    enum NO_RESPONSE;
    enum ACKNOWLEDGE_ALERT;
    enum CONFIRM_CLEAR;
  }

  enum def DefenseAvailability {
    enum UNAVAILABLE;
    enum AVAILABLE;
  }

  enum def CapacitorSupport {
    enum INSUFFICIENT;
    enum SUFFICIENT;
  }

  part def DefenseSupportObservation :> Data {
    attribute defenseAvailability : DefenseAvailability;
    attribute capacitorSupport : CapacitorSupport;
  }

  enum def EgressRouteObservation {
    enum UNKNOWN;
    enum BLOCKED;
    enum AVAILABLE;
  }

  enum def EgressProgress {
    enum NOT_STARTED;
    enum EN_ROUTE;
    enum SAFE_DESTINATION_OBSERVED;
    enum FAILED;
  }

  enum def ResponseAuthorization {
    enum NO_REQUEST;
    enum EGRESS_REQUEST;
    enum CANCEL_EGRESS;
  }

  enum def ThreatReport {
    enum NO_REPORT;
    enum WATCH_REPORT;
    enum HOSTILE_ALERT;
    enum EVIDENCE_FAULT;
    enum CLEAR_PENDING_REPORT;
    enum CLEAR_CONFIRMED_REPORT;
  }

  enum def DefenseCommand {
    enum STANDBY;
    enum ACTIVATE;
  }

  enum def EgressCommand {
    enum NONE;
    enum INITIATE;
    enum CONTINUE;
    enum HOLD;
    enum CANCEL;
  }

  enum def ResponseStatus {
    enum QUIET;
    enum WATCHING;
    enum THREAT_DECLARED;
    enum DEFENDING;
    enum EGRESS_ORDERED;
    enum EGRESS_MOVING;
    enum EGRESS_BLOCKED;
    enum ARRIVAL_OBSERVED;
    enum EVIDENCE_UNAVAILABLE;
    enum CLEAR_PENDING;
  }

  enum def EvidenceAssessment {
    enum UNAVAILABLE;
    enum CLEAR;
    enum SUSPECT;
    enum HOSTILE;
  }

  enum def ThreatEpisodeState {
    enum QUIET;
    enum WATCH;
    enum DECLARED;
    enum CLEAR_PENDING;
  }

  enum def DefenseQualification {
    enum INAPPLICABLE;
    enum BLOCKED_AVAILABILITY;
    enum BLOCKED_CAPACITOR;
    enum READY;
  }

  enum def EgressQualification {
    enum INAPPLICABLE;
    enum ROUTE_UNKNOWN;
    enum ROUTE_BLOCKED;
    enum READY;
  }

  enum def ResponseDirective {
    enum RESET;
    enum CONTAIN;
    enum CANCEL_EGRESS;
    enum START_EGRESS;
    enum DEFEND;
    enum HOLD_BLOCKED;
    enum MONITOR;
  }

  enum def EgressSessionState {
    enum IDLE;
    enum ORDERED;
    enum MOVING;
    enum BLOCKED;
    enum ARRIVED;
  }

  enum def SnapshotPreEpisodeState {
    enum QUIET;
    enum WATCH;
    enum DECLARED;
    enum CLEAR_PENDING;
  }

  enum def SnapshotNextEpisodeState {
    enum QUIET;
    enum WATCH;
    enum DECLARED;
    enum CLEAR_PENDING;
  }

  enum def SnapshotEvidenceAssessment {
    enum UNAVAILABLE;
    enum CLEAR;
    enum SUSPECT;
    enum HOSTILE;
  }

  enum def SnapshotPilotDisposition {
    enum NO_RESPONSE;
    enum ACKNOWLEDGE_ALERT;
    enum CONFIRM_CLEAR;
  }

  enum def SnapshotPreEgressState {
    enum IDLE;
    enum ORDERED;
    enum MOVING;
    enum BLOCKED;
    enum ARRIVED;
  }

  enum def SnapshotNextEgressState {
    enum IDLE;
    enum ORDERED;
    enum MOVING;
    enum BLOCKED;
    enum ARRIVED;
  }

  enum def SnapshotResponseDirective {
    enum RESET;
    enum CONTAIN;
    enum CANCEL_EGRESS;
    enum START_EGRESS;
    enum DEFEND;
    enum HOLD_BLOCKED;
    enum MONITOR;
  }

  enum def SnapshotDefenseCommand {
    enum STANDBY;
    enum ACTIVATE;
  }

  enum def SnapshotEgressCommand {
    enum NONE;
    enum INITIATE;
    enum CONTINUE;
    enum HOLD;
    enum CANCEL;
  }

  part def EpisodeSnapshot :> Data {
    attribute preEpisode : SnapshotPreEpisodeState;
    attribute nextEpisode : SnapshotNextEpisodeState;
    attribute assessment : SnapshotEvidenceAssessment;
    attribute pilotDisposition : SnapshotPilotDisposition;
  }

  part def ResponseSnapshot :> Data {
    attribute preEgress : SnapshotPreEgressState;
    attribute nextEgress : SnapshotNextEgressState;
    attribute directive : SnapshotResponseDirective;
    attribute defenseCommand : SnapshotDefenseCommand;
    attribute egressCommand : SnapshotEgressCommand;
  }

  part def ThreatEvidenceQualifier :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port threatObservation : DataPort { in :>> type : ThreatObservation; }
    port evidenceAssessment : DataPort { out :>> type : EvidenceAssessment; }

                        
                
                 
                           
                                                                                                               
                                                                                
                                                                       
                                                                       
                                                                           
                                                                 
                                                                       
                                                                                
                                                                   
                                                                       
                                                                             
                                                                  
             
                     
                           
                                                                                               
                                                                             
                                                                           
                           
                                                                              
                                                                            
                                                                   
                                                                     
                           
                                                                                                               
                                                                            
                                                                          
                                                                       
                     
                                                                                  
                                                                     
                                                                               
                                                                    
       
  }

  part def ThreatEpisodeTracker :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port pilotDisposition : DataPort { in :>> type : PilotDisposition; }
    port evidenceAssessment : DataPort { in :>> type : EvidenceAssessment; }
    port episodeSnapshot : DataPort { out :>> type : EpisodeSnapshot; }

                        
           
                         
                                              
                
                 
                           
                                                                                              
                                                          
                                                                         
                                                                           
                                                                           
                                                                                       
                                                                     
                                                                                 
                                                                       
                                                                                   
                                                                       
                                                                                   
                                                                       
                                                                                           
                                                                             
                                                                                                 
                                                                         
                                                                                            
             
                 
                           
                                                                                                                            
                                                                       
                                                                              
                                                                       
                                                                              
                                                                          
                                                                                 
                                                                               
                                                                                      
                                                                   
                                                                                
                                                                   
                                                                                
                                                                      
                                                                                   
                                                                           
                                                                                        
                                                                           
                                                                                       
                                                                     
                                                                                 
                                                                       
                                                                                   
                                                                       
                                                                                   
                                                                       
                                                                                           
                                                                             
                                                                                                 
                                                                         
                                                                                            
                     
                           
                                                                                                      
                                                                        
                     
                                                                    
                                                                           
                                                                 
                                                                       
                                                                                   
                                                                   
                           
                                                                                                                                       
                                                                     
                                                               
                     
                                                                         
                                                                    
                                                                  
                                                                     
                                                                             
                                                                 
                                                                  
                                                                        
                                                                                     
                                                                   
                           
                                                                                                                                        
                                                                  
                     
                                                                    
                                                                           
                                                                 
                                                                            
                                                                         
                                                                          
                                                                           
                                                                 
                                                                          
                                                                           
                                                                        
       
  }

  part def ThreatReportPolicy :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port episodeSnapshot : DataPort { in :>> type : EpisodeSnapshot; }
    port threatReport : DataPort { out :>> type : ThreatReport; }

                        
                
                 
                           
                                                                                                     
                                                   
             
                     
                           
                                                                                                                                     
                     
                                                                                             
                                                                
                                                                                  
                                                                                                       
                                                               
                                                                                  
                                                                                                       
                                                           
                                                                                      
                                                                                  
                                                                                     
                                                                                      
                                                                        
                                                                                      
                                                                                  
                                                                                      
                                                                                 
                                                                                              
                                                                      
                                                                                  
                                                                                      
                                                                                 
                                                                                              
                                                              
                                                                                
                                                                                      
                                                                                 
                                                                                              
                                                          
       
  }

  part def DefenseReadinessQualifier :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port defenseSupport : DataPort { in :>> type : DefenseSupportObservation; }
    port evidenceAssessment : DataPort { in :>> type : EvidenceAssessment; }
    port defenseQualification : DataPort { out :>> type : DefenseQualification; }

                        
                
                 
                           
                                                                                                                             
                                                                       
                                                                            
                                                                
                                                                                            
                                                                                    
                                                                
                                                                                   
                                                                                       
                                                                                 
                                                                
                                                                                   
                                                                                     
                                                                    
             
                     
                           
                                                                                                 
                                                                    
                                                                                
                           
                                                                                                               
                                                                     
                                                                                    
                                                                                        
                           
                                                                                                          
                                                                     
                                                                                   
                                                                               
                                                                                     
                           
                                                                                                    
                                                                     
                                                                                   
                                                                             
                                                                         
       
  }

  part def EgressReadinessQualifier :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port egressRoute : DataPort { in :>> type : EgressRouteObservation; }
    port evidenceAssessment : DataPort { in :>> type : EvidenceAssessment; }
    port egressQualification : DataPort { out :>> type : EgressQualification; }

                        
                
                 
                           
                                                                                                                     
                                                                       
                                                                          
                                                                
                                                                    
                                                                           
                                                                
                                                                    
                                                                           
                                                                
                                                                      
                                                                  
             
                     
                           
                                                                                               
                                                                    
                                                                              
                           
                                                                                        
                                                                     
                                                            
                                                                               
                           
                                                                                           
                                                                     
                                                            
                                                                               
                           
                                                                                            
                                                                     
                                                              
                                                                       
       
  }

  part def ThreatResponseArbiter :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port responseAuthorization : DataPort { in :>> type : ResponseAuthorization; }
    port defenseQualification : DataPort { in :>> type : DefenseQualification; }
    port egressQualification : DataPort { in :>> type : EgressQualification; }
    port episodeSnapshot : DataPort { in :>> type : EpisodeSnapshot; }
    port responseDirective : DataPort { out :>> type : ResponseDirective; }

                        
                
                 
                           
                                                                                          
                                                           
             
                     
                           
                                                                                                                                      
                                                                                  
                                                                                    
                                                                           
                     
                                                                                      
                                                                 
                                                                               
                                                                                             
                                                                   
                                                                               
                                                                                      
                                                                                     
                                                                        
                           
                                                                                                                                  
                                                                                  
                                                                                    
                                                                            
                     
                                                                         
                                                                        
                                                                  
                                                                           
                                                                  
                                                                  
                                                                           
                                                                       
                           
                                                                                                                                               
                                                                                  
                                                                                    
                                                                        
                     
                                                                           
                                                                  
                                                                           
                                                                  
       
  }

  part def ResponseStateController :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port egressProgress : DataPort { in :>> type : EgressProgress; }
    port responseDirective : DataPort { in :>> type : ResponseDirective; }
    port responseSnapshot : DataPort { out :>> type : ResponseSnapshot; }
    port defenseCommand : DataPort { out :>> type : DefenseCommand; }
    port egressCommand : DataPort { out :>> type : EgressCommand; }

                        
           
                         
                                             
                
                 
                           
                                                                                                            
                                                        
                                                      
                                                 
                                                                       
                                                                         
                                                                   
                                                                                
                                                                     
                                                                                  
                                                                           
                                                                                        
                                                                          
                                                                                       
                                                                    
                                                                                 
                                                                          
                                                                                       
                                                                     
                                                                                  
                                                                               
                                                                         
             
                 
                           
                                                                                                                                       
                                                                     
                                                                            
                                                                        
                                                                               
                                                                       
                                                                              
                                                                        
                                                                               
                                                                        
                                                                               
                                                                 
                                                                              
                                                                    
                                                                                 
                                                                   
                                                                                
                                                                    
                                                                                 
                                                                    
                                                                                 
                                                                   
                                                                                
                                                                     
                                                                                  
                                                                           
                                                                                        
                                                                          
                                                                                       
                                                                    
                                                                                 
                                                                          
                                                                                       
                                                                     
                                                                                  
                                                               
                                                                                    
                                                                
                                                                                     
                                                          
                                                                               
                                                              
                                                                                   
                                                              
                                                                                   
                                                          
                                                                               
                                                            
                                                                                
                     
                           
                                                                                                                                                                                        
                     
                                                                     
                                                             
                                                      
                                                             
                                                              
                                                                      
                                                                      
                                                                                   
                                                                
                                                      
                                                             
                                                              
                                                                           
                                                                           
                                                                                   
                                                                             
                                                             
                                                        
                                                             
                                                              
                                                                      
                                                                      
                                                                      
                                                                
                                                                
                                                      
                                                                         
                                                                 
                                                                         
                                                                  
                                                              
                                                                      
                                                                   
                                                                     
                                                                
                                                          
                                                             
                                                              
                                                                      
                                                                   
                                                                  
                                                               
                                                          
                                                             
                                                              
                                                                      
                                                                  
                                                               
                                                                    
                                                               
                                                          
                                                             
                                                              
                                                                      
                                                                   
                                                                            
                                                                
                                                          
                                                             
                                                              
                                                                      
                                                                   
                                                                            
                                                                
                                                      
                                                                         
                                                                 
                                                                         
                                                                  
                                                              
                                                                      
                                                                          
                                                                
                                                      
                                                             
                                                              
                                                                      
                                                                
                                                                            
                                                                
                                                          
                                                             
                                                              
                                                                      
                                                                
                                                                      
                                                             
                                                      
                                                              
                                                              
                                                                      
                                                                
                                                                     
                                                                      
                                                             
                                                      
                                                            
       
  }

  part def ResponseStatusAssessor :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port responseSnapshot : DataPort { in :>> type : ResponseSnapshot; }
    port episodeSnapshot : DataPort { in :>> type : EpisodeSnapshot; }
    port responseStatus : DataPort { out :>> type : ResponseStatus; }

                        
                
                 
                           
                                                                                             
                                                   
             
                     
                           
                                                                                                                                                 
                     
                                                                                             
                                                                          
                                                                                      
                                                                                       
                                                                      
                                                                                      
                                                                                      
                                                                   
                                                                                      
                                                                                       
                                                                    
                                                                                      
                                                                                       
                                                                    
                                                                                      
                                                                             
                                                                                           
                                                               
                                                                                      
                                                                             
                                                                                    
                                                                                              
                                                                   
                                                                                      
                                                                             
                                                                                    
                                                                                      
                                                              
                                                                                      
                                                                             
                                                                                    
                                                                                      
                                                           
                                                                                      
                                                                             
                                                                                    
                                                                                         
                                                                    
       
  }

  part def ThreatResponseProcess :> Process {
    port threatObservation : DataPort { in :>> type : ThreatObservation; }
    port pilotDisposition : DataPort { in :>> type : PilotDisposition; }
    port defenseSupport : DataPort { in :>> type : DefenseSupportObservation; }
    port egressRoute : DataPort { in :>> type : EgressRouteObservation; }
    port egressProgress : DataPort { in :>> type : EgressProgress; }
    port responseAuthorization : DataPort { in :>> type : ResponseAuthorization; }
    port threatReport : DataPort { out :>> type : ThreatReport; }
    port defenseCommand : DataPort { out :>> type : DefenseCommand; }
    port egressCommand : DataPort { out :>> type : EgressCommand; }
    port responseStatus : DataPort { out :>> type : ResponseStatus; }

    part threatEvidenceQualifier : ThreatEvidenceQualifier;
    part threatEpisodeTracker : ThreatEpisodeTracker;
    part threatReportPolicy : ThreatReportPolicy;
    part defenseReadinessQualifier : DefenseReadinessQualifier;
    part egressReadinessQualifier : EgressReadinessQualifier;
    part threatResponseArbiter : ThreatResponseArbiter;
    part responseStateController : ResponseStateController;
    part responseStatusAssessor : ResponseStatusAssessor;

    connection int01 : PortConnection connect threatObservation to threatEvidenceQualifier.threatObservation;
    connection int02 : PortConnection connect pilotDisposition to threatEpisodeTracker.pilotDisposition;
    connection int03 : PortConnection connect defenseSupport to defenseReadinessQualifier.defenseSupport;
    connection int04 : PortConnection connect egressRoute to egressReadinessQualifier.egressRoute;
    connection int05 : PortConnection connect egressProgress to responseStateController.egressProgress;
    connection int06 : PortConnection connect responseAuthorization to threatResponseArbiter.responseAuthorization;
    connection int07 : PortConnection connect threatEvidenceQualifier.evidenceAssessment to threatEpisodeTracker.evidenceAssessment;
    connection int08 : PortConnection connect threatEpisodeTracker.episodeSnapshot to threatReportPolicy.episodeSnapshot;
    connection int09 : PortConnection connect threatEvidenceQualifier.evidenceAssessment to defenseReadinessQualifier.evidenceAssessment;
    connection int10 : PortConnection connect defenseReadinessQualifier.defenseQualification to threatResponseArbiter.defenseQualification;
    connection int11 : PortConnection connect threatEvidenceQualifier.evidenceAssessment to egressReadinessQualifier.evidenceAssessment;
    connection int12 : PortConnection connect egressReadinessQualifier.egressQualification to threatResponseArbiter.egressQualification;
    connection int13 : PortConnection connect threatEpisodeTracker.episodeSnapshot to threatResponseArbiter.episodeSnapshot;
    connection int14 : PortConnection connect threatResponseArbiter.responseDirective to responseStateController.responseDirective;
    connection int15 : PortConnection connect responseStateController.responseSnapshot to responseStatusAssessor.responseSnapshot;
    connection int16 : PortConnection connect threatEpisodeTracker.episodeSnapshot to responseStatusAssessor.episodeSnapshot;
    connection int17 : PortConnection connect threatReportPolicy.threatReport to threatReport;
    connection int18 : PortConnection connect responseStateController.defenseCommand to defenseCommand;
    connection int19 : PortConnection connect responseStateController.egressCommand to egressCommand;
    connection int20 : PortConnection connect responseStatusAssessor.responseStatus to responseStatus;
  }

  part def FrigateThreatEgressSupervisor :> System {
    port threatObservation : DataPort { in :>> type : ThreatObservation; }
    port pilotDisposition : DataPort { in :>> type : PilotDisposition; }
    port defenseSupport : DataPort { in :>> type : DefenseSupportObservation; }
    port egressRoute : DataPort { in :>> type : EgressRouteObservation; }
    port egressProgress : DataPort { in :>> type : EgressProgress; }
    port responseAuthorization : DataPort { in :>> type : ResponseAuthorization; }
    port threatReport : DataPort { out :>> type : ThreatReport; }
    port defenseCommand : DataPort { out :>> type : DefenseCommand; }
    port egressCommand : DataPort { out :>> type : EgressCommand; }
    port responseStatus : DataPort { out :>> type : ResponseStatus; }

    part threatResponseProcess : ThreatResponseProcess;

    connection supportThreatObservation : PortConnection connect threatObservation to threatResponseProcess.threatObservation;
    connection supportPilotDisposition : PortConnection connect pilotDisposition to threatResponseProcess.pilotDisposition;
    connection supportDefense : PortConnection connect defenseSupport to threatResponseProcess.defenseSupport;
    connection supportRoute : PortConnection connect egressRoute to threatResponseProcess.egressRoute;
    connection supportProgress : PortConnection connect egressProgress to threatResponseProcess.egressProgress;
    connection supportAuthorization : PortConnection connect responseAuthorization to threatResponseProcess.responseAuthorization;
    connection supportThreatReport : PortConnection connect threatResponseProcess.threatReport to threatReport;
    connection supportDefenseCommand : PortConnection connect threatResponseProcess.defenseCommand to defenseCommand;
    connection supportEgressCommand : PortConnection connect threatResponseProcess.egressCommand to egressCommand;
    connection supportResponseStatus : PortConnection connect threatResponseProcess.responseStatus to responseStatus;
  }

  part frigateThreatEgressSupervisor : FrigateThreatEgressSupervisor;
}
