// Canonical source for immutable run
// 20260814T132656Z-fire-observation-sortie-small-r2-a1.

package Battery_Status_Assessment_Service {
  private import HAMR::*;

  enum def CheckCommand { enum NoCommand; enum Start; enum Cancel; enum Reset; }
  enum def CheckToken { enum TokenA; enum TokenB; }
  enum def ReportTicket { enum NoTicket; enum TokenA; enum TokenB; }
  enum def ReportAvailability { enum Absent; enum Present; enum Unavailable; }
  enum def CapacityLevel { enum NoLevel; enum High; enum Moderate; enum Low; enum Critical; }
  enum def ReportQuality { enum NoQuality; enum Current; enum Stale; enum Invalid; }
  enum def FeedbackTicket { enum NoTicket; enum TokenA; enum TokenB; }
  enum def UseDisposition { enum NoFeedback; enum Pending; enum Consumed; enum Rejected; }
  enum def AssessmentResult {
    enum NoAssessment; enum NormalUse; enum CautionUse; enum RestrictUse; enum Untrusted;
  }
  enum def CheckStatus {
    enum Idle; enum Checking; enum Available; enum DuplicateIgnored; enum Busy;
    enum Cancelled; enum AcquisitionFailed; enum Completed; enum PublicationFailed;
    enum RecoveryRequired; enum ResetCompleted;
  }
  enum def StatusReadRequest { enum NoRead; enum ReadTokenA; enum ReadTokenB; }
  enum def AcquisitionDirective {
    enum NoAcquisition; enum AcquireTokenA; enum AcquireTokenB; enum ResetAcquisition;
  }
  enum def AssessmentContext { enum NoContext; enum AssessTokenA; enum AssessTokenB; }
  enum def PublicationDirective {
    enum NoPublicationDirective; enum OpenTokenA; enum OpenTokenB; enum Withdraw;
    enum ResetPublication;
  }
  enum def AcquisitionOutcome {
    enum NoAcquisitionOutcome; enum CapturedTokenA; enum CapturedTokenB;
    enum AcquisitionFault; enum AcquisitionReset;
  }
  enum def QualifiedEvidence {
    enum NoEvidence; enum TrustedHigh; enum TrustedModerate; enum TrustedLow;
    enum TrustedCritical; enum Untrusted;
  }
  enum def PublicationOutcome {
    enum NoPublicationOutcome; enum OfferedTokenA; enum OfferedTokenB; enum Consumed;
    enum Cancelled; enum PublicationFault; enum PublicationReset;
  }
  enum def LifecycleState { enum Idle; enum Checking; enum AwaitingUse; enum RecoveryHold; }
  enum def LastAdmittedToken { enum None; enum TokenA; enum TokenB; }
  enum def AcquisitionState { enum Ready; enum FailureHold; }
  enum def PublicationState { enum Empty; enum OfferedTokenA; enum OfferedTokenB; enum FaultHold; }

  // Every field below is inspected by GUMBO and is a direct attribute.
  part def CheckRequest :> Data {
    attribute command : CheckCommand;
    attribute token : CheckToken;
  }
  part def BatteryReport :> Data {
    attribute ticket : ReportTicket;
    attribute availability : ReportAvailability;
    attribute level : CapacityLevel;
    attribute quality : ReportQuality;
  }
  part def ControlUseFeedback :> Data {
    attribute ticket : FeedbackTicket;
    attribute disposition : UseDisposition;
  }
  part def CapturedReport :> Data {
    attribute ticket : ReportTicket;
    attribute availability : ReportAvailability;
    attribute level : CapacityLevel;
    attribute quality : ReportQuality;
  }
  part def TaggedQualifiedEvidence :> Data {
    attribute ticket : ReportTicket;
    attribute evidence : QualifiedEvidence;
  }
  part def TaggedAssessment :> Data {
    attribute ticket : ReportTicket;
    attribute result : AssessmentResult;
  }

  part def CheckLifecycle :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port check_request : DataPort { in :>> type : CheckRequest; }
    port acquisition_outcome : DataPort { in :>> type : AcquisitionOutcome; }
    port publication_outcome : DataPort { in :>> type : PublicationOutcome; }
    port acquisition_directive : DataPort { out :>> type : AcquisitionDirective; }
    port assessment_context : DataPort { out :>> type : AssessmentContext; }
    port publication_directive : DataPort { out :>> type : PublicationDirective; }
    port check_status : DataPort { out :>> type : CheckStatus; }

                        
           
                          
                                       
                          
                                             
                
                                                   
                         
                                         
                                                 
                                                       
                                                                       
                                                             
                                                                                
                                           
             
                                                   
                     
                           
                                       
                                                                      
                                                                              
                                                                     
                                                          
                                                                           
                                                                 
                                                                                    
                                                            
                           
                                       
                                                                      
                                                                               
                                                                              
                                                                     
                                                          
                                                                           
                                                                 
                                                                                    
                                                            
                           
                                   
                                                                      
                                                                               
                                                                              
                                                             
                                                          
                                                                           
                                                                 
                                                                                    
                                                         
                           
                                 
                                                                      
                                                                                    
                                                                                     
                                                               
                                                                     
                                                          
                                                                              
                                                                 
                                                                              
                                                           
                           
                                        
                                                                      
                                                                                    
                                                                                     
                                                               
                                                                     
                                                          
                                                                           
                                                                 
                                                                                    
                                                           
                           
                                           
                                                                      
                                                                               
                                                                               
                                                                      
                                                             
                                                          
                                                                           
                                                                 
                                                                                    
                                                    
                           
                             
                                                                      
                                                                               
                                                                               
                                                                       
                                                                 
                                                                   
                                                                      
                                                             
                                                          
                                                                           
                                                                 
                                                                      
                                                    
                           
                                      
                                                              
                                                                               
                                                                               
                                                                       
                                                                
                                                             
                                                                     
                                                             
                                                          
                                                                           
                                                                 
                                                                                    
                                                           
                           
                                      
                                                              
                                                                               
                                                                               
                                                                       
                                                                
                                                             
                                                                     
                                                             
                                                          
                                                                           
                                                                 
                                                                                    
                                                           
                           
                                   
                                                              
                                                                               
                                                                               
                                                                       
                                                                
                                                             
                                                                     
                                                                 
                                                             
                                                                           
                                                                    
                                                                        
                                                   
                           
                                   
                                                              
                                                                               
                                                                               
                                                                       
                                                                
                                                             
                                                                     
                                                                 
                                                             
                                                                           
                                                                    
                                                                        
                                                   
                           
                                 
                                                                   
                                                                       
                                                                               
                                                                               
                                                                       
                                                               
                                                            
                                                          
                                                                           
                                                                 
                                                                                    
                                               
                            
                                       
                                                                  
                                                                               
                                                                               
                                                                       
                                                                
                                                                 
                                                                        
                                                                               
                                                                               
                                                                        
                                                                               
                                                                               
                                                                    
                                                          
                                                                           
                                                                 
                                                                                    
                                                    
                            
                                
                                                                      
                                                                               
                                                                               
                                                                       
                                                                      
                                                                        
                                                                             
                                                                   
                                                                      
                                                                        
                                                                            
                                                                      
                                                                       
                                                                     
                                                                      
                                                                             
                                                                                    
                                                                                    
                                                                             
                                                                                    
                                                                                     
                                                            
                                                          
                                                                           
                                                                 
                                                                                    
                                                                  
                                                        
                                                               
                                                       
                                                           
                                                   
       
  }

  part def ReportAcquisition :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port battery_report : DataPort { in :>> type : BatteryReport; }
    port acquisition_directive : DataPort { in :>> type : AcquisitionDirective; }
    port captured_report : DataPort { out :>> type : CapturedReport; }
    port acquisition_outcome : DataPort { out :>> type : AcquisitionOutcome; }
    port status_read_request : DataPort { out :>> type : StatusReadRequest; }

                        
           
                          
                                           
                                                                    
                                                        
                
                                                               
                         
                                           
                                                      
                                                                                  
                                                                          
                                                           
                                                           
                                                                     
                                                          
                                                             
             
                                                               
                                                                                
                                            
                                                                 
                     
                           
                                 
                                                                                  
                                                                  
                                                                                  
                                                               
                                                               
                                                                         
                                                              
                                                                 
                           
                                
                                                                                   
                                                                        
                                                                        
                                                                                      
                                                               
                                                               
                                                                         
                                                              
                                                                 
                            
                               
                                                                   
                                                                                
                                                                 
                                                                             
                                                                  
                                                                                
                                                                   
                                                               
                                                                           
                                                             
                                                                
                            
                               
                                                                   
                                                                                
                                                                 
                                                                             
                                                                  
                                                                                
                                                                   
                                                               
                                                                           
                                                             
                                                                
                           
                                           
                                                                   
                                                                                  
                                                                        
                                                                                       
                                                                                  
                                                                        
                                                                                       
                                                                        
                                                                                  
                                                                             
                                                                      
                                                                             
                                                                       
                                                               
                                                                         
                                                              
                                                                 
                            
                                    
                                                                   
                                                                               
                                                                  
                                                                                      
                                                               
                                                               
                                                                         
                                                              
                                                                 
       
  }

  part def ReportQualification :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port captured_report : DataPort { in :>> type : CapturedReport; }
    port qualified_evidence : DataPort { out :>> type : TaggedQualifiedEvidence; }

                        
                
                         
                                             
                                                              
                                                                      
             
                     
                           
                                    
                                                                    
                                                                               
                                                                
                                                                    
                                                                           
                                                                           
                           
                                        
                                                                    
                                                                               
                                                                    
                                                                    
                                                                           
                                                                               
                           
                                   
                                                                    
                                                                               
                                                               
                                                                    
                                                                           
                                                                          
                           
                                        
                                                                    
                                                                               
                                                                    
                                                                    
                                                                           
                                                                               
                           
                                         
                                                                    
                                                                                    
                                                                        
                                                                          
                                                                           
                                                                         
                            
                                      
                                                                   
                                                                          
                                                                          
       
  }

  part def AssessmentDecision :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port assessment_context : DataPort { in :>> type : AssessmentContext; }
    port qualified_evidence : DataPort { in :>> type : TaggedQualifiedEvidence; }
    port decision_assessment : DataPort { out :>> type : TaggedAssessment; }

                        
                
                         
                                        
                                                               
                                                                      
             
                     
                           
                           
                                                                           
                                                                        
                                                                           
                                                                         
                                                                                
                                                                               
                                                                       
                           
                               
                                                                           
                                                                        
                                                                           
                                                                         
                                                                                    
                                                                               
                                                                        
                           
                                      
                                                                           
                                                                        
                                                                           
                                                                         
                                                                                 
                                                                                      
                                                                               
                                                                         
                           
                                
                                                                           
                                                                        
                                                                           
                                                                         
                                                                              
                                                                               
                                                                       
                            
                                     
                                                                                
                                                                             
                                                                                
                                                                              
                                                                                     
                                                                           
                                                                          
       
  }

  part def ResultCustody :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port control_use_feedback : DataPort { in :>> type : ControlUseFeedback; }
    port publication_directive : DataPort { in :>> type : PublicationDirective; }
    port decision_assessment : DataPort { in :>> type : TaggedAssessment; }
    port publication_outcome : DataPort { out :>> type : PublicationOutcome; }
    port battery_assessment : DataPort { out :>> type : TaggedAssessment; }

                        
           
                          
                                           
                          
                                             
                                                                    
                                                        
                
                                                                                   
                         
                                       
                                                      
                                                               
                                                                                  
                                                                          
                                                              
                                                                     
             
                                                                                   
                                                                                
                                            
                                                                 
                     
                           
                                 
                                                                                  
                                                                  
                                                                   
                                                                                  
                                                                  
                                                                         
                           
                                
                                                                                   
                                                                      
                                                                      
                                                                   
                                                                                      
                                                                  
                                                                         
                            
                                             
                                                                            
                                                                             
                                                                              
                                                                               
                                                                             
                                                                                     
                                                                             
                                                                           
                                                                                  
                                                                             
                                                                           
                                                                                  
                                                                      
                                                                   
                                                                                  
                                                                  
                                                                         
                           
                              
                                                                                   
                                                                       
                                                                                 
                                                                                         
                                                                                 
                                                                               
                                                                                      
                                                                                         
                                                                                 
                                                                               
                                                                                      
                                                                                         
                                                                      
                                                                   
                                                                                  
                                                                  
                                                                         
                           
                               
                                                                           
                                                                         
                                                                                
                                                                                  
                                                                  
                                                                   
                                                                          
                                                                  
                                                                         
                           
                               
                                                                           
                                                                         
                                                                                
                                                                                  
                                                                  
                                                                   
                                                                          
                                                                  
                                                                         
                           
                                       
                                                                            
                                                                             
                                                                           
                                                                             
                                                                                     
                                                                             
                                                                           
                                                                                  
                                                                             
                                                                           
                                                                                  
                                                                  
                                                                   
                                                                           
                                                                  
                                                                         
                           
                                
                                                                           
                                                                                         
                                                                             
                                                                                     
                                                                           
                                                                                  
                                                                          
                                                            
                                                                               
                                                                
                                                                  
                           
                                
                                                                           
                                                                                         
                                                                             
                                                                                     
                                                                           
                                                                                  
                                                                          
                                                            
                                                                               
                                                                
                                                                  
                            
                            
                                                                   
                                                                           
                                                                                  
                                                                             
                                                                      
                                                                               
                                                                          
                                                                
                                                                               
                                                                
                                                                      
                            
                            
                                                                   
                                                                           
                                                                                  
                                                                             
                                                                      
                                                                               
                                                                          
                                                                
                                                                               
                                                                
                                                                      
                            
                                
                                                                   
                                                                           
                                                                                  
                                                                                   
                                                                                  
                                                                           
                                                                                      
                                                                                  
                                                                           
                                                                                     
                                                                  
                                                                   
                                                                                      
                                                                  
                                                                         
       
  }

  part def BatteryAssessmentProcess :> Process {
    port check_request : DataPort { in :>> type : CheckRequest; }
    port battery_report : DataPort { in :>> type : BatteryReport; }
    port control_use_feedback : DataPort { in :>> type : ControlUseFeedback; }
    port status_read_request : DataPort { out :>> type : StatusReadRequest; }
    port battery_assessment : DataPort { out :>> type : TaggedAssessment; }
    port check_status : DataPort { out :>> type : CheckStatus; }

    part check_lifecycle : CheckLifecycle;
    part report_acquisition : ReportAcquisition;
    part report_qualification : ReportQualification;
    part assessment_decision : AssessmentDecision;
    part result_custody : ResultCustody;

    connection int01 : PortConnection connect check_request to check_lifecycle.check_request;
    connection int02 : PortConnection connect battery_report to report_acquisition.battery_report;
    connection int03 : PortConnection connect control_use_feedback to result_custody.control_use_feedback;
    connection int04 : PortConnection connect check_lifecycle.acquisition_directive to report_acquisition.acquisition_directive;
    connection int05 : PortConnection connect check_lifecycle.assessment_context to assessment_decision.assessment_context;
    connection int06 : PortConnection connect check_lifecycle.publication_directive to result_custody.publication_directive;
    connection int07 : PortConnection connect report_acquisition.captured_report to report_qualification.captured_report;
    connection int08 : PortConnection connect report_acquisition.acquisition_outcome to check_lifecycle.acquisition_outcome;
    connection int09 : PortConnection connect report_qualification.qualified_evidence to assessment_decision.qualified_evidence;
    connection int10 : PortConnection connect assessment_decision.decision_assessment to result_custody.decision_assessment;
    connection int11 : PortConnection connect result_custody.publication_outcome to check_lifecycle.publication_outcome;
    connection int12 : PortConnection connect report_acquisition.status_read_request to status_read_request;
    connection int13 : PortConnection connect result_custody.battery_assessment to battery_assessment;
    connection int14 : PortConnection connect check_lifecycle.check_status to check_status;
  }

  part def BatteryStatusAssessmentServiceSystem :> System {
    port check_request : DataPort { in :>> type : CheckRequest; }
    port battery_report : DataPort { in :>> type : BatteryReport; }
    port control_use_feedback : DataPort { in :>> type : ControlUseFeedback; }
    port status_read_request : DataPort { out :>> type : StatusReadRequest; }
    port battery_assessment : DataPort { out :>> type : TaggedAssessment; }
    port check_status : DataPort { out :>> type : CheckStatus; }

    part battery_assessment_process : BatteryAssessmentProcess;
    connection support01 : PortConnection connect check_request to battery_assessment_process.check_request;
    connection support02 : PortConnection connect battery_report to battery_assessment_process.battery_report;
    connection support03 : PortConnection connect control_use_feedback to battery_assessment_process.control_use_feedback;
    connection support04 : PortConnection connect battery_assessment_process.status_read_request to status_read_request;
    connection support05 : PortConnection connect battery_assessment_process.battery_assessment to battery_assessment;
    connection support06 : PortConnection connect battery_assessment_process.check_status to check_status;
  }

  part battery_status_assessment_service : BatteryStatusAssessmentServiceSystem;
}
