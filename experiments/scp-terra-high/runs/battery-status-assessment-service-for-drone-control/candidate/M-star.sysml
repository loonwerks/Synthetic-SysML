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
    port check_request : DataPort { in :>> type : CheckRequest; }
    port acquisition_outcome : DataPort { in :>> type : AcquisitionOutcome; }
    port publication_outcome : DataPort { in :>> type : PublicationOutcome; }
    port acquisition_directive : DataPort { out :>> type : AcquisitionDirective; }
    port assessment_context : DataPort { out :>> type : AssessmentContext; }
    port publication_directive : DataPort { out :>> type : PublicationDirective; }
    port check_status : DataPort { out :>> type : CheckStatus; }

    language "GUMBO" /*{
      state
        lifecycleState : LifecycleState;
        lastAdmittedToken : LastAdmittedToken;

      initialize
        guarantee INITIAL_LIFECYCLE_SAFE:
          lifecycleState == LifecycleState.Idle &
          lastAdmittedToken == LastAdmittedToken.None &
          acquisition_directive == AcquisitionDirective.NoAcquisition &
          assessment_context == AssessmentContext.NoContext &
          publication_directive == PublicationDirective.NoPublicationDirective &
          check_status == CheckStatus.Idle;

      compute
        modifies lifecycleState, lastAdmittedToken;
        compute_cases
          case PRIOR_PUBLICATION_FAULT:
            assume In(lifecycleState) != LifecycleState.RecoveryHold & publication_outcome == PublicationOutcome.PublicationFault;
            guarantee lifecycleState == LifecycleState.RecoveryHold & lastAdmittedToken == In(lastAdmittedToken) & acquisition_directive == AcquisitionDirective.NoAcquisition & assessment_context == AssessmentContext.NoContext & publication_directive == PublicationDirective.NoPublicationDirective & check_status == CheckStatus.PublicationFailed;
          case PRIOR_ACQUISITION_FAULT:
            assume In(lifecycleState) != LifecycleState.RecoveryHold & publication_outcome != PublicationOutcome.PublicationFault & acquisition_outcome == AcquisitionOutcome.AcquisitionFault;
            guarantee lifecycleState == LifecycleState.RecoveryHold & lastAdmittedToken == In(lastAdmittedToken) & acquisition_directive == AcquisitionDirective.NoAcquisition & assessment_context == AssessmentContext.NoContext & publication_directive == PublicationDirective.NoPublicationDirective & check_status == CheckStatus.AcquisitionFailed;
          case RESET_CONFIRMATIONS:
            assume In(lifecycleState) == LifecycleState.RecoveryHold & acquisition_outcome == AcquisitionOutcome.AcquisitionReset & publication_outcome == PublicationOutcome.PublicationReset;
            guarantee lifecycleState == LifecycleState.Idle & lastAdmittedToken == In(lastAdmittedToken) & acquisition_directive == AcquisitionDirective.NoAcquisition & assessment_context == AssessmentContext.NoContext & publication_directive == PublicationDirective.NoPublicationDirective & check_status == CheckStatus.ResetCompleted;
          case RESET_IN_RECOVERY:
            assume In(lifecycleState) == LifecycleState.RecoveryHold & not (acquisition_outcome == AcquisitionOutcome.AcquisitionReset & publication_outcome == PublicationOutcome.PublicationReset) & check_request.command == CheckCommand.Reset;
            guarantee lifecycleState == LifecycleState.RecoveryHold & lastAdmittedToken == In(lastAdmittedToken) & acquisition_directive == AcquisitionDirective.ResetAcquisition & assessment_context == AssessmentContext.NoContext & publication_directive == PublicationDirective.ResetPublication & check_status == CheckStatus.RecoveryRequired;
          case RECOVERY_BLOCKS_NONRESET:
            assume In(lifecycleState) == LifecycleState.RecoveryHold & not (acquisition_outcome == AcquisitionOutcome.AcquisitionReset & publication_outcome == PublicationOutcome.PublicationReset) & check_request.command != CheckCommand.Reset;
            guarantee lifecycleState == LifecycleState.RecoveryHold & lastAdmittedToken == In(lastAdmittedToken) & acquisition_directive == AcquisitionDirective.NoAcquisition & assessment_context == AssessmentContext.NoContext & publication_directive == PublicationDirective.NoPublicationDirective & check_status == CheckStatus.RecoveryRequired;
          case PRIOR_CONSUMPTION_COMPLETES:
            assume In(lifecycleState) != LifecycleState.RecoveryHold & publication_outcome != PublicationOutcome.PublicationFault & acquisition_outcome != AcquisitionOutcome.AcquisitionFault & publication_outcome == PublicationOutcome.Consumed;
            guarantee lifecycleState == LifecycleState.Idle & lastAdmittedToken == In(lastAdmittedToken) & acquisition_directive == AcquisitionDirective.NoAcquisition & assessment_context == AssessmentContext.NoContext & publication_directive == PublicationDirective.NoPublicationDirective & check_status == CheckStatus.Completed;
          case ACTIVE_CANCEL:
            assume In(lifecycleState) != LifecycleState.RecoveryHold & publication_outcome != PublicationOutcome.PublicationFault & acquisition_outcome != AcquisitionOutcome.AcquisitionFault & publication_outcome != PublicationOutcome.Consumed & check_request.command == CheckCommand.Cancel & (In(lifecycleState) == LifecycleState.Checking | In(lifecycleState) == LifecycleState.AwaitingUse);
            guarantee lifecycleState == LifecycleState.Idle & lastAdmittedToken == In(lastAdmittedToken) & acquisition_directive == AcquisitionDirective.NoAcquisition & assessment_context == AssessmentContext.NoContext & publication_directive == PublicationDirective.Withdraw & check_status == CheckStatus.Cancelled;
          case IDLE_DUPLICATE_TOKEN_A:
            assume In(lifecycleState) == LifecycleState.Idle & publication_outcome != PublicationOutcome.PublicationFault & acquisition_outcome != AcquisitionOutcome.AcquisitionFault & publication_outcome != PublicationOutcome.Consumed & check_request.command == CheckCommand.Start & check_request.token == CheckToken.TokenA & In(lastAdmittedToken) == LastAdmittedToken.TokenA;
            guarantee lifecycleState == LifecycleState.Idle & lastAdmittedToken == In(lastAdmittedToken) & acquisition_directive == AcquisitionDirective.NoAcquisition & assessment_context == AssessmentContext.NoContext & publication_directive == PublicationDirective.NoPublicationDirective & check_status == CheckStatus.DuplicateIgnored;
          case IDLE_DUPLICATE_TOKEN_B:
            assume In(lifecycleState) == LifecycleState.Idle & publication_outcome != PublicationOutcome.PublicationFault & acquisition_outcome != AcquisitionOutcome.AcquisitionFault & publication_outcome != PublicationOutcome.Consumed & check_request.command == CheckCommand.Start & check_request.token == CheckToken.TokenB & In(lastAdmittedToken) == LastAdmittedToken.TokenB;
            guarantee lifecycleState == LifecycleState.Idle & lastAdmittedToken == In(lastAdmittedToken) & acquisition_directive == AcquisitionDirective.NoAcquisition & assessment_context == AssessmentContext.NoContext & publication_directive == PublicationDirective.NoPublicationDirective & check_status == CheckStatus.DuplicateIgnored;
          case FRESH_TOKEN_A_START:
            assume In(lifecycleState) == LifecycleState.Idle & publication_outcome != PublicationOutcome.PublicationFault & acquisition_outcome != AcquisitionOutcome.AcquisitionFault & publication_outcome != PublicationOutcome.Consumed & check_request.command == CheckCommand.Start & check_request.token == CheckToken.TokenA & In(lastAdmittedToken) != LastAdmittedToken.TokenA;
            guarantee lifecycleState == LifecycleState.Checking & lastAdmittedToken == LastAdmittedToken.TokenA & acquisition_directive == AcquisitionDirective.AcquireTokenA & assessment_context == AssessmentContext.AssessTokenA & publication_directive == PublicationDirective.OpenTokenA & check_status == CheckStatus.Checking;
          case FRESH_TOKEN_B_START:
            assume In(lifecycleState) == LifecycleState.Idle & publication_outcome != PublicationOutcome.PublicationFault & acquisition_outcome != AcquisitionOutcome.AcquisitionFault & publication_outcome != PublicationOutcome.Consumed & check_request.command == CheckCommand.Start & check_request.token == CheckToken.TokenB & In(lastAdmittedToken) != LastAdmittedToken.TokenB;
            guarantee lifecycleState == LifecycleState.Checking & lastAdmittedToken == LastAdmittedToken.TokenB & acquisition_directive == AcquisitionDirective.AcquireTokenB & assessment_context == AssessmentContext.AssessTokenB & publication_directive == PublicationDirective.OpenTokenB & check_status == CheckStatus.Checking;
          case ACTIVE_START_BUSY:
            assume (In(lifecycleState) == LifecycleState.Checking | In(lifecycleState) == LifecycleState.AwaitingUse) & publication_outcome != PublicationOutcome.PublicationFault & acquisition_outcome != AcquisitionOutcome.AcquisitionFault & publication_outcome != PublicationOutcome.Consumed & check_request.command == CheckCommand.Start;
            guarantee lifecycleState == In(lifecycleState) & lastAdmittedToken == In(lastAdmittedToken) & acquisition_directive == AcquisitionDirective.NoAcquisition & assessment_context == AssessmentContext.NoContext & publication_directive == PublicationDirective.NoPublicationDirective & check_status == CheckStatus.Busy;
          case CHECK_BECOMES_AVAILABLE:
            assume In(lifecycleState) == LifecycleState.Checking & publication_outcome != PublicationOutcome.PublicationFault & acquisition_outcome != AcquisitionOutcome.AcquisitionFault & publication_outcome != PublicationOutcome.Consumed & check_request.command != CheckCommand.Start & check_request.command != CheckCommand.Cancel & ((In(lastAdmittedToken) == LastAdmittedToken.TokenA & acquisition_outcome == AcquisitionOutcome.CapturedTokenA & publication_outcome == PublicationOutcome.OfferedTokenA) | (In(lastAdmittedToken) == LastAdmittedToken.TokenB & acquisition_outcome == AcquisitionOutcome.CapturedTokenB & publication_outcome == PublicationOutcome.OfferedTokenB));
            guarantee lifecycleState == LifecycleState.AwaitingUse & lastAdmittedToken == In(lastAdmittedToken) & acquisition_directive == AcquisitionDirective.NoAcquisition & assessment_context == AssessmentContext.NoContext & publication_directive == PublicationDirective.NoPublicationDirective & check_status == CheckStatus.Available;
          case ORDINARY_NONHOLD:
            assume In(lifecycleState) != LifecycleState.RecoveryHold & publication_outcome != PublicationOutcome.PublicationFault & acquisition_outcome != AcquisitionOutcome.AcquisitionFault & publication_outcome != PublicationOutcome.Consumed & not (check_request.command == CheckCommand.Cancel & (In(lifecycleState) == LifecycleState.Checking | In(lifecycleState) == LifecycleState.AwaitingUse)) & not (In(lifecycleState) == LifecycleState.Idle & check_request.command == CheckCommand.Start) & not ((In(lifecycleState) == LifecycleState.Checking | In(lifecycleState) == LifecycleState.AwaitingUse) & check_request.command == CheckCommand.Start) & not (In(lifecycleState) == LifecycleState.Checking & check_request.command != CheckCommand.Start & check_request.command != CheckCommand.Cancel & ((In(lastAdmittedToken) == LastAdmittedToken.TokenA & acquisition_outcome == AcquisitionOutcome.CapturedTokenA & publication_outcome == PublicationOutcome.OfferedTokenA) | (In(lastAdmittedToken) == LastAdmittedToken.TokenB & acquisition_outcome == AcquisitionOutcome.CapturedTokenB & publication_outcome == PublicationOutcome.OfferedTokenB)));
            guarantee lifecycleState == In(lifecycleState) & lastAdmittedToken == In(lastAdmittedToken) & acquisition_directive == AcquisitionDirective.NoAcquisition & assessment_context == AssessmentContext.NoContext & publication_directive == PublicationDirective.NoPublicationDirective & ((In(lifecycleState) == LifecycleState.AwaitingUse & check_status == CheckStatus.Available) | (In(lifecycleState) == LifecycleState.Checking & check_status == CheckStatus.Checking) | (In(lifecycleState) == LifecycleState.Idle & check_status == CheckStatus.Idle));
    }*/

                        
           
                          
                                       
                          
                                             
                
                                                   
                         
                                         
                                                 
                                                       
                                                                       
                                                             
                                                                                
                                           
             
                                                   
                     
                           
                                       
                                                                      
                                                                              
                                                                     
                                                          
                                                                           
                                                                 
                                                                                    
                                                            
                           
                                       
                                                                      
                                                                               
                                                                              
                                                                     
                                                          
                                                                           
                                                                 
                                                                                    
                                                            
                           
                                   
                                                                      
                                                                               
                                                                              
                                                             
                                                          
                                                                           
                                                                 
                                                                                    
                                                         
                           
                                 
                                                                      
                                                                                    
                                                                                     
                                                               
                                                                     
                                                          
                                                                              
                                                                 
                                                                              
                                                           
                           
                                        
                                                                      
                                                                                    
                                                                                     
                                                               
                                                                     
                                                          
                                                                           
                                                                 
                                                                                    
                                                           
                           
                                           
                                                                      
                                                                               
                                                                               
                                                                      
                                                             
                                                          
                                                                           
                                                                 
                                                                                    
                                                    
                           
                             
                                                                      
                                                                               
                                                                               
                                                                       
                                                                 
                                                                   
                                                                      
                                                             
                                                          
                                                                           
                                                                 
                                                                      
                                                    
                           
                                      
                                                              
                                                                               
                                                                               
                                                                       
                                                                
                                                             
                                                                     
                                                             
                                                          
                                                                           
                                                                 
                                                                                    
                                                           
                           
                                      
                                                              
                                                                               
                                                                               
                                                                       
                                                                
                                                             
                                                                     
                                                             
                                                          
                                                                           
                                                                 
                                                                                    
                                                           
                           
                                   
                                                              
                                                                               
                                                                               
                                                                       
                                                                
                                                             
                                                                     
                                                                 
                                                             
                                                                           
                                                                    
                                                                        
                                                   
                           
                                   
                                                              
                                                                               
                                                                               
                                                                       
                                                                
                                                             
                                                                     
                                                                 
                                                             
                                                                           
                                                                    
                                                                        
                                                   
                           
                                 
                                                                   
                                                                       
                                                                               
                                                                               
                                                                       
                                                               
                                                            
                                                          
                                                                           
                                                                 
                                                                                    
                                               
                            
                                       
                                                                  
                                                                               
                                                                               
                                                                       
                                                                
                                                                 
                                                                        
                                                                               
                                                                               
                                                                        
                                                                               
                                                                               
                                                                    
                                                          
                                                                           
                                                                 
                                                                                    
                                                    
                            
                                
                                                                      
                                                                               
                                                                               
                                                                       
                                                                      
                                                                        
                                                                             
                                                                   
                                                                      
                                                                        
                                                                            
                                                                      
                                                                       
                                                                     
                                                                      
                                                                             
                                                                                    
                                                                                    
                                                                             
                                                                                    
                                                                                     
                                                            
                                                          
                                                                           
                                                                 
                                                                                    
                                                                  
                                                        
                                                               
                                                       
                                                           
                                                   
       
  }

  part def ReportAcquisition :> Thread {
    port battery_report : DataPort { in :>> type : BatteryReport; }
    port acquisition_directive : DataPort { in :>> type : AcquisitionDirective; }
    port captured_report : DataPort { out :>> type : CapturedReport; }
    port acquisition_outcome : DataPort { out :>> type : AcquisitionOutcome; }
    port status_read_request : DataPort { out :>> type : StatusReadRequest; }

    language "GUMBO" /*{
      state
        acquisitionState : AcquisitionState;
        committedAcquisitionOutcome : AcquisitionOutcome;

      initialize
        guarantee INITIAL_ACQUISITION_SAFE:
          acquisitionState == AcquisitionState.Ready & committedAcquisitionOutcome == AcquisitionOutcome.NoAcquisitionOutcome & acquisition_outcome == AcquisitionOutcome.NoAcquisitionOutcome & status_read_request == StatusReadRequest.NoRead & captured_report.ticket == ReportTicket.NoTicket & captured_report.availability == ReportAvailability.Absent & captured_report.level == CapacityLevel.NoLevel & captured_report.quality == ReportQuality.NoQuality;

      compute
        modifies acquisitionState, committedAcquisitionOutcome;
        guarantee PRIOR_ACQUISITION_OUTCOME: acquisition_outcome == In(committedAcquisitionOutcome);
        compute_cases
          case ACQUISITION_RESET:
            assume acquisition_directive == AcquisitionDirective.ResetAcquisition;
            guarantee acquisitionState == AcquisitionState.Ready & committedAcquisitionOutcome == AcquisitionOutcome.AcquisitionReset & status_read_request == StatusReadRequest.NoRead & captured_report.ticket == ReportTicket.NoTicket & captured_report.availability == ReportAvailability.Absent & captured_report.level == CapacityLevel.NoLevel & captured_report.quality == ReportQuality.NoQuality;
          case ACQUISITION_HELD:
            assume acquisition_directive != AcquisitionDirective.ResetAcquisition & In(acquisitionState) == AcquisitionState.FailureHold;
            guarantee acquisitionState == AcquisitionState.FailureHold & committedAcquisitionOutcome == AcquisitionOutcome.NoAcquisitionOutcome & status_read_request == StatusReadRequest.NoRead & captured_report.ticket == ReportTicket.NoTicket & captured_report.availability == ReportAvailability.Absent & captured_report.level == CapacityLevel.NoLevel & captured_report.quality == ReportQuality.NoQuality;
          case CAPTURE_TOKEN_A:
            assume In(acquisitionState) == AcquisitionState.Ready & acquisition_directive == AcquisitionDirective.AcquireTokenA & battery_report.ticket == ReportTicket.TokenA & battery_report.availability == ReportAvailability.Present;
            guarantee acquisitionState == AcquisitionState.Ready & committedAcquisitionOutcome == AcquisitionOutcome.CapturedTokenA & status_read_request == StatusReadRequest.ReadTokenA & captured_report.ticket == battery_report.ticket & captured_report.availability == battery_report.availability & captured_report.level == battery_report.level & captured_report.quality == battery_report.quality;
          case CAPTURE_TOKEN_B:
            assume In(acquisitionState) == AcquisitionState.Ready & acquisition_directive == AcquisitionDirective.AcquireTokenB & battery_report.ticket == ReportTicket.TokenB & battery_report.availability == ReportAvailability.Present;
            guarantee acquisitionState == AcquisitionState.Ready & committedAcquisitionOutcome == AcquisitionOutcome.CapturedTokenB & status_read_request == StatusReadRequest.ReadTokenB & captured_report.ticket == battery_report.ticket & captured_report.availability == battery_report.availability & captured_report.level == battery_report.level & captured_report.quality == battery_report.quality;
          case REQUESTED_ACQUISITION_FAULT:
            assume In(acquisitionState) == AcquisitionState.Ready & ((acquisition_directive == AcquisitionDirective.AcquireTokenA & not (battery_report.ticket == ReportTicket.TokenA & battery_report.availability == ReportAvailability.Present)) | (acquisition_directive == AcquisitionDirective.AcquireTokenB & not (battery_report.ticket == ReportTicket.TokenB & battery_report.availability == ReportAvailability.Present)));
            guarantee acquisitionState == AcquisitionState.FailureHold & committedAcquisitionOutcome == AcquisitionOutcome.AcquisitionFault & ((acquisition_directive == AcquisitionDirective.AcquireTokenA & status_read_request == StatusReadRequest.ReadTokenA) | (acquisition_directive == AcquisitionDirective.AcquireTokenB & status_read_request == StatusReadRequest.ReadTokenB)) & captured_report.ticket == ReportTicket.NoTicket & captured_report.availability == ReportAvailability.Absent & captured_report.level == CapacityLevel.NoLevel & captured_report.quality == ReportQuality.NoQuality;
          case ACQUISITION_INACTIVE:
            assume In(acquisitionState) == AcquisitionState.Ready & acquisition_directive == AcquisitionDirective.NoAcquisition;
            guarantee acquisitionState == AcquisitionState.Ready & committedAcquisitionOutcome == AcquisitionOutcome.NoAcquisitionOutcome & status_read_request == StatusReadRequest.NoRead & captured_report.ticket == ReportTicket.NoTicket & captured_report.availability == ReportAvailability.Absent & captured_report.level == CapacityLevel.NoLevel & captured_report.quality == ReportQuality.NoQuality;
    }*/

                        
           
                          
                                           
                                                                    
                                                        
                
                                                               
                         
                                           
                                                      
                                                                                  
                                                                          
                                                           
                                                           
                                                                     
                                                          
                                                             
             
                                                               
                                                                                
                                            
                                                                 
                     
                           
                                 
                                                                                  
                                                                  
                                                                                  
                                                               
                                                               
                                                                         
                                                              
                                                                 
                           
                                
                                                                                   
                                                                        
                                                                        
                                                                                      
                                                               
                                                               
                                                                         
                                                              
                                                                 
                            
                               
                                                                   
                                                                                
                                                                 
                                                                             
                                                                  
                                                                                
                                                                   
                                                               
                                                                           
                                                             
                                                                
                            
                               
                                                                   
                                                                                
                                                                 
                                                                             
                                                                  
                                                                                
                                                                   
                                                               
                                                                           
                                                             
                                                                
                           
                                           
                                                                   
                                                                                  
                                                                        
                                                                                       
                                                                                  
                                                                        
                                                                                       
                                                                        
                                                                                  
                                                                             
                                                                      
                                                                             
                                                                       
                                                               
                                                                         
                                                              
                                                                 
                            
                                    
                                                                   
                                                                               
                                                                  
                                                                                      
                                                               
                                                               
                                                                         
                                                              
                                                                 
       
  }

  part def ReportQualification :> Thread {
    port captured_report : DataPort { in :>> type : CapturedReport; }
    port qualified_evidence : DataPort { out :>> type : TaggedQualifiedEvidence; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_QUALIFICATION_SAFE: qualified_evidence.ticket == ReportTicket.NoTicket & qualified_evidence.evidence == QualifiedEvidence.NoEvidence;
      compute
        compute_cases
          case QUALIFY_CURRENT_HIGH:
            assume captured_report.ticket != ReportTicket.NoTicket & captured_report.availability == ReportAvailability.Present & captured_report.level == CapacityLevel.High & captured_report.quality == ReportQuality.Current;
            guarantee qualified_evidence.ticket == captured_report.ticket & qualified_evidence.evidence == QualifiedEvidence.TrustedHigh;
          case QUALIFY_CURRENT_MODERATE:
            assume captured_report.ticket != ReportTicket.NoTicket & captured_report.availability == ReportAvailability.Present & captured_report.level == CapacityLevel.Moderate & captured_report.quality == ReportQuality.Current;
            guarantee qualified_evidence.ticket == captured_report.ticket & qualified_evidence.evidence == QualifiedEvidence.TrustedModerate;
          case QUALIFY_CURRENT_LOW:
            assume captured_report.ticket != ReportTicket.NoTicket & captured_report.availability == ReportAvailability.Present & captured_report.level == CapacityLevel.Low & captured_report.quality == ReportQuality.Current;
            guarantee qualified_evidence.ticket == captured_report.ticket & qualified_evidence.evidence == QualifiedEvidence.TrustedLow;
          case QUALIFY_CURRENT_CRITICAL:
            assume captured_report.ticket != ReportTicket.NoTicket & captured_report.availability == ReportAvailability.Present & captured_report.level == CapacityLevel.Critical & captured_report.quality == ReportQuality.Current;
            guarantee qualified_evidence.ticket == captured_report.ticket & qualified_evidence.evidence == QualifiedEvidence.TrustedCritical;
          case QUALIFY_UNTRUSTED_PRESENT:
            assume captured_report.ticket != ReportTicket.NoTicket & not (captured_report.availability == ReportAvailability.Present & captured_report.level != CapacityLevel.NoLevel & captured_report.quality == ReportQuality.Current);
            guarantee qualified_evidence.ticket == captured_report.ticket & qualified_evidence.evidence == QualifiedEvidence.Untrusted;
          case QUALIFICATION_INACTIVE:
            assume captured_report.ticket == ReportTicket.NoTicket;
            guarantee qualified_evidence.ticket == ReportTicket.NoTicket & qualified_evidence.evidence == QualifiedEvidence.NoEvidence;
    }*/

                        
                
                         
                                             
                                                              
                                                                      
             
                     
                           
                                    
                                                                    
                                                                               
                                                                
                                                                    
                                                                           
                                                                           
                           
                                        
                                                                    
                                                                               
                                                                    
                                                                    
                                                                           
                                                                               
                           
                                   
                                                                    
                                                                               
                                                               
                                                                    
                                                                           
                                                                          
                           
                                        
                                                                    
                                                                               
                                                                    
                                                                    
                                                                           
                                                                               
                           
                                         
                                                                    
                                                                                    
                                                                        
                                                                          
                                                                           
                                                                         
                            
                                      
                                                                   
                                                                          
                                                                          
       
  }

  part def AssessmentDecision :> Thread {
    port assessment_context : DataPort { in :>> type : AssessmentContext; }
    port qualified_evidence : DataPort { in :>> type : TaggedQualifiedEvidence; }
    port decision_assessment : DataPort { out :>> type : TaggedAssessment; }

    language "GUMBO" /*{
      initialize
        guarantee INITIAL_DECISION_SAFE:
          decision_assessment.ticket == ReportTicket.NoTicket &
          decision_assessment.result == AssessmentResult.NoAssessment;

      compute
        compute_cases
          case DECIDE_HIGH:
            assume ((assessment_context == AssessmentContext.AssessTokenA & qualified_evidence.ticket == ReportTicket.TokenA) | (assessment_context == AssessmentContext.AssessTokenB & qualified_evidence.ticket == ReportTicket.TokenB)) & qualified_evidence.evidence == QualifiedEvidence.TrustedHigh;
            guarantee decision_assessment.ticket == qualified_evidence.ticket & decision_assessment.result == AssessmentResult.NormalUse;
          case DECIDE_MODERATE:
            assume ((assessment_context == AssessmentContext.AssessTokenA & qualified_evidence.ticket == ReportTicket.TokenA) | (assessment_context == AssessmentContext.AssessTokenB & qualified_evidence.ticket == ReportTicket.TokenB)) & qualified_evidence.evidence == QualifiedEvidence.TrustedModerate;
            guarantee decision_assessment.ticket == qualified_evidence.ticket & decision_assessment.result == AssessmentResult.CautionUse;
          case DECIDE_LOW_OR_CRITICAL:
            assume ((assessment_context == AssessmentContext.AssessTokenA & qualified_evidence.ticket == ReportTicket.TokenA) | (assessment_context == AssessmentContext.AssessTokenB & qualified_evidence.ticket == ReportTicket.TokenB)) & (qualified_evidence.evidence == QualifiedEvidence.TrustedLow | qualified_evidence.evidence == QualifiedEvidence.TrustedCritical);
            guarantee decision_assessment.ticket == qualified_evidence.ticket & decision_assessment.result == AssessmentResult.RestrictUse;
          case DECIDE_UNTRUSTED:
            assume ((assessment_context == AssessmentContext.AssessTokenA & qualified_evidence.ticket == ReportTicket.TokenA) | (assessment_context == AssessmentContext.AssessTokenB & qualified_evidence.ticket == ReportTicket.TokenB)) & qualified_evidence.evidence == QualifiedEvidence.Untrusted;
            guarantee decision_assessment.ticket == qualified_evidence.ticket & decision_assessment.result == AssessmentResult.Untrusted;
          case DECISION_INAPPLICABLE:
            assume not (((assessment_context == AssessmentContext.AssessTokenA & qualified_evidence.ticket == ReportTicket.TokenA) | (assessment_context == AssessmentContext.AssessTokenB & qualified_evidence.ticket == ReportTicket.TokenB)) & qualified_evidence.evidence != QualifiedEvidence.NoEvidence);
            guarantee decision_assessment.ticket == ReportTicket.NoTicket & decision_assessment.result == AssessmentResult.NoAssessment;
    }*/

                        
                
                         
                                        
                                                               
                                                                      
             
                     
                           
                           
                                                                           
                                                                        
                                                                           
                                                                         
                                                                                
                                                                               
                                                                       
                           
                               
                                                                           
                                                                        
                                                                           
                                                                         
                                                                                    
                                                                               
                                                                        
                           
                                      
                                                                           
                                                                        
                                                                           
                                                                         
                                                                                 
                                                                                      
                                                                               
                                                                         
                           
                                
                                                                           
                                                                        
                                                                           
                                                                         
                                                                              
                                                                               
                                                                       
                            
                                     
                                                                                
                                                                             
                                                                                
                                                                              
                                                                                     
                                                                           
                                                                          
       
  }

  part def ResultCustody :> Thread {
    port control_use_feedback : DataPort { in :>> type : ControlUseFeedback; }
    port publication_directive : DataPort { in :>> type : PublicationDirective; }
    port decision_assessment : DataPort { in :>> type : TaggedAssessment; }
    port publication_outcome : DataPort { out :>> type : PublicationOutcome; }
    port battery_assessment : DataPort { out :>> type : TaggedAssessment; }

    language "GUMBO" /*{
      state
        publicationState : PublicationState;
        retainedAssessment : AssessmentResult;
        committedPublicationOutcome : PublicationOutcome;

      initialize
        guarantee INITIAL_CUSTODY_SAFE:
          publicationState == PublicationState.Empty & retainedAssessment == AssessmentResult.NoAssessment & committedPublicationOutcome == PublicationOutcome.NoPublicationOutcome & publication_outcome == PublicationOutcome.NoPublicationOutcome & battery_assessment.ticket == ReportTicket.NoTicket & battery_assessment.result == AssessmentResult.NoAssessment;

      compute
        modifies publicationState, retainedAssessment, committedPublicationOutcome;
        guarantee PRIOR_PUBLICATION_OUTCOME: publication_outcome == In(committedPublicationOutcome);
        compute_cases
          case PUBLICATION_RESET:
            assume publication_directive == PublicationDirective.ResetPublication;
            guarantee publicationState == PublicationState.Empty & retainedAssessment == AssessmentResult.NoAssessment & committedPublicationOutcome == PublicationOutcome.PublicationReset & battery_assessment.ticket == ReportTicket.NoTicket & battery_assessment.result == AssessmentResult.NoAssessment;
          case PUBLICATION_HELD:
            assume publication_directive != PublicationDirective.ResetPublication & In(publicationState) == PublicationState.FaultHold;
            guarantee publicationState == PublicationState.FaultHold & retainedAssessment == AssessmentResult.NoAssessment & committedPublicationOutcome == PublicationOutcome.NoPublicationOutcome & battery_assessment.ticket == ReportTicket.NoTicket & battery_assessment.result == AssessmentResult.NoAssessment;
          case UNEXPECTED_OPEN_WHILE_OFFERED:
            assume (In(publicationState) == PublicationState.OfferedTokenA | In(publicationState) == PublicationState.OfferedTokenB) & (publication_directive == PublicationDirective.OpenTokenA | publication_directive == PublicationDirective.OpenTokenB) & ((control_use_feedback.ticket == FeedbackTicket.NoTicket & control_use_feedback.disposition == UseDisposition.NoFeedback) | (In(publicationState) == PublicationState.OfferedTokenA & control_use_feedback.ticket == FeedbackTicket.TokenA & control_use_feedback.disposition == UseDisposition.Pending) | (In(publicationState) == PublicationState.OfferedTokenB & control_use_feedback.ticket == FeedbackTicket.TokenB & control_use_feedback.disposition == UseDisposition.Pending));
            guarantee publicationState == PublicationState.FaultHold & retainedAssessment == AssessmentResult.NoAssessment & committedPublicationOutcome == PublicationOutcome.PublicationFault & battery_assessment.ticket == ReportTicket.NoTicket & battery_assessment.result == AssessmentResult.NoAssessment;
          case FEEDBACK_FAULT:
            assume publication_directive != PublicationDirective.ResetPublication & In(publicationState) != PublicationState.FaultHold & not ((control_use_feedback.ticket == FeedbackTicket.NoTicket & control_use_feedback.disposition == UseDisposition.NoFeedback) | (In(publicationState) == PublicationState.OfferedTokenA & control_use_feedback.ticket == FeedbackTicket.TokenA & (control_use_feedback.disposition == UseDisposition.Pending | control_use_feedback.disposition == UseDisposition.Consumed)) | (In(publicationState) == PublicationState.OfferedTokenB & control_use_feedback.ticket == FeedbackTicket.TokenB & (control_use_feedback.disposition == UseDisposition.Pending | control_use_feedback.disposition == UseDisposition.Consumed)));
            guarantee publicationState == PublicationState.FaultHold & retainedAssessment == AssessmentResult.NoAssessment & committedPublicationOutcome == PublicationOutcome.PublicationFault & battery_assessment.ticket == ReportTicket.NoTicket & battery_assessment.result == AssessmentResult.NoAssessment;
          case CONSUME_TOKEN_A:
            assume In(publicationState) == PublicationState.OfferedTokenA & control_use_feedback.ticket == FeedbackTicket.TokenA & control_use_feedback.disposition == UseDisposition.Consumed & publication_directive != PublicationDirective.ResetPublication;
            guarantee publicationState == PublicationState.Empty & retainedAssessment == AssessmentResult.NoAssessment & committedPublicationOutcome == PublicationOutcome.Consumed & battery_assessment.ticket == ReportTicket.NoTicket & battery_assessment.result == AssessmentResult.NoAssessment;
          case CONSUME_TOKEN_B:
            assume In(publicationState) == PublicationState.OfferedTokenB & control_use_feedback.ticket == FeedbackTicket.TokenB & control_use_feedback.disposition == UseDisposition.Consumed & publication_directive != PublicationDirective.ResetPublication;
            guarantee publicationState == PublicationState.Empty & retainedAssessment == AssessmentResult.NoAssessment & committedPublicationOutcome == PublicationOutcome.Consumed & battery_assessment.ticket == ReportTicket.NoTicket & battery_assessment.result == AssessmentResult.NoAssessment;
          case WITHDRAW_COHERENT_OFFER:
            assume (In(publicationState) == PublicationState.OfferedTokenA | In(publicationState) == PublicationState.OfferedTokenB) & publication_directive == PublicationDirective.Withdraw & ((control_use_feedback.ticket == FeedbackTicket.NoTicket & control_use_feedback.disposition == UseDisposition.NoFeedback) | (In(publicationState) == PublicationState.OfferedTokenA & control_use_feedback.ticket == FeedbackTicket.TokenA & control_use_feedback.disposition == UseDisposition.Pending) | (In(publicationState) == PublicationState.OfferedTokenB & control_use_feedback.ticket == FeedbackTicket.TokenB & control_use_feedback.disposition == UseDisposition.Pending));
            guarantee publicationState == PublicationState.Empty & retainedAssessment == AssessmentResult.NoAssessment & committedPublicationOutcome == PublicationOutcome.Cancelled & battery_assessment.ticket == ReportTicket.NoTicket & battery_assessment.result == AssessmentResult.NoAssessment;
          case PRESERVE_TOKEN_A:
            assume In(publicationState) == PublicationState.OfferedTokenA & publication_directive == PublicationDirective.NoPublicationDirective & ((control_use_feedback.ticket == FeedbackTicket.NoTicket & control_use_feedback.disposition == UseDisposition.NoFeedback) | (control_use_feedback.ticket == FeedbackTicket.TokenA & control_use_feedback.disposition == UseDisposition.Pending));
            guarantee publicationState == PublicationState.OfferedTokenA & retainedAssessment == In(retainedAssessment) & committedPublicationOutcome == PublicationOutcome.OfferedTokenA & battery_assessment.ticket == ReportTicket.TokenA & battery_assessment.result == In(retainedAssessment);
          case PRESERVE_TOKEN_B:
            assume In(publicationState) == PublicationState.OfferedTokenB & publication_directive == PublicationDirective.NoPublicationDirective & ((control_use_feedback.ticket == FeedbackTicket.NoTicket & control_use_feedback.disposition == UseDisposition.NoFeedback) | (control_use_feedback.ticket == FeedbackTicket.TokenB & control_use_feedback.disposition == UseDisposition.Pending));
            guarantee publicationState == PublicationState.OfferedTokenB & retainedAssessment == In(retainedAssessment) & committedPublicationOutcome == PublicationOutcome.OfferedTokenB & battery_assessment.ticket == ReportTicket.TokenB & battery_assessment.result == In(retainedAssessment);
          case OPEN_TOKEN_A:
            assume In(publicationState) == PublicationState.Empty & control_use_feedback.ticket == FeedbackTicket.NoTicket & control_use_feedback.disposition == UseDisposition.NoFeedback & publication_directive == PublicationDirective.OpenTokenA & decision_assessment.ticket == ReportTicket.TokenA & decision_assessment.result != AssessmentResult.NoAssessment;
            guarantee publicationState == PublicationState.OfferedTokenA & retainedAssessment == decision_assessment.result & committedPublicationOutcome == PublicationOutcome.OfferedTokenA & battery_assessment.ticket == ReportTicket.TokenA & battery_assessment.result == decision_assessment.result;
          case OPEN_TOKEN_B:
            assume In(publicationState) == PublicationState.Empty & control_use_feedback.ticket == FeedbackTicket.NoTicket & control_use_feedback.disposition == UseDisposition.NoFeedback & publication_directive == PublicationDirective.OpenTokenB & decision_assessment.ticket == ReportTicket.TokenB & decision_assessment.result != AssessmentResult.NoAssessment;
            guarantee publicationState == PublicationState.OfferedTokenB & retainedAssessment == decision_assessment.result & committedPublicationOutcome == PublicationOutcome.OfferedTokenB & battery_assessment.ticket == ReportTicket.TokenB & battery_assessment.result == decision_assessment.result;
          case CUSTODY_INACTIVE:
            assume In(publicationState) == PublicationState.Empty & control_use_feedback.ticket == FeedbackTicket.NoTicket & control_use_feedback.disposition == UseDisposition.NoFeedback & publication_directive != PublicationDirective.ResetPublication & not (publication_directive == PublicationDirective.OpenTokenA & decision_assessment.ticket == ReportTicket.TokenA & decision_assessment.result != AssessmentResult.NoAssessment) & not (publication_directive == PublicationDirective.OpenTokenB & decision_assessment.ticket == ReportTicket.TokenB & decision_assessment.result != AssessmentResult.NoAssessment);
            guarantee publicationState == PublicationState.Empty & retainedAssessment == AssessmentResult.NoAssessment & committedPublicationOutcome == PublicationOutcome.NoPublicationOutcome & battery_assessment.ticket == ReportTicket.NoTicket & battery_assessment.result == AssessmentResult.NoAssessment;
    }*/

                        
           
                          
                                           
                          
                                             
                                                                    
                                                        
                
                                                                                   
                         
                                       
                                                      
                                                               
                                                                                  
                                                                          
                                                              
                                                                     
             
                                                                                   
                                                                                
                                            
                                                                 
                     
                           
                                 
                                                                                  
                                                                  
                                                                   
                                                                                  
                                                                  
                                                                         
                           
                                
                                                                                   
                                                                      
                                                                      
                                                                   
                                                                                      
                                                                  
                                                                         
                            
                                             
                                                                            
                                                                             
                                                                              
                                                                               
                                                                             
                                                                                     
                                                                             
                                                                           
                                                                                  
                                                                             
                                                                           
                                                                                  
                                                                      
                                                                   
                                                                                  
                                                                  
                                                                         
                           
                              
                                                                                   
                                                                       
                                                                                 
                                                                                         
                                                                                 
                                                                               
                                                                                      
                                                                                         
                                                                                 
                                                                               
                                                                                      
                                                                                         
                                                                      
                                                                   
                                                                                  
                                                                  
                                                                         
                           
                               
                                                                           
                                                                         
                                                                                
                                                                                  
                                                                  
                                                                   
                                                                          
                                                                  
                                                                         
                           
                               
                                                                           
                                                                         
                                                                                
                                                                                  
                                                                  
                                                                   
                                                                          
                                                                  
                                                                         
                           
                                       
                                                                            
                                                                             
                                                                           
                                                                             
                                                                                     
                                                                             
                                                                           
                                                                                  
                                                                             
                                                                           
                                                                                  
                                                                  
                                                                   
                                                                           
                                                                  
                                                                         
                           
                                
                                                                           
                                                                                         
                                                                             
                                                                                     
                                                                           
                                                                                  
                                                                          
                                                            
                                                                               
                                                                
                                                                  
                           
                                
                                                                           
                                                                                         
                                                                             
                                                                                     
                                                                           
                                                                                  
                                                                          
                                                            
                                                                               
                                                                
                                                                  
                            
                            
                                                                   
                                                                           
                                                                                  
                                                                             
                                                                      
                                                                               
                                                                          
                                                                
                                                                               
                                                                
                                                                      
                            
                            
                                                                   
                                                                           
                                                                                  
                                                                             
                                                                      
                                                                               
                                                                          
                                                                
                                                                               
                                                                
                                                                      
                            
                                
                                                                   
                                                                           
                                                                                  
                                                                                   
                                                                                  
                                                                           
                                                                                      
                                                                                  
                                                                           
                                                                                     
                                                                  
                                                                   
                                                                                      
                                                                  
                                                                         
       
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
